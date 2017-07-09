package com.flansmod.common.driveables;

import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ReportedException;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

import com.flansmod.common.vector.Vector3f;

import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityWheel extends Entity implements IEntityAdditionalSpawnData
{
	/** The vehicle this wheel is part of */
	public EntityDriveable vehicle;
	/** The ID of this wheel within the vehicle */
	public int ID;
	
	/** Set this to true when the client has found the parent vehicle and connected them */
	@SideOnly(Side.CLIENT)
	public boolean foundVehicle;
	/** The ID of the vehicle this wheel is part of, for client-server syncing */
	private int vehicleID;
	
	public boolean onDeck = false;
	
	private int invulnerableUnmountCount;
	
	public int timeLimitDriveableNull = 0;

	public EntityWheel(World world) 
	{
		super(world);
		setSize(1F, 1F);
		stepHeight = 1.0F;
		invulnerableUnmountCount = 0;
	}

	public EntityWheel(World world, EntityDriveable entity,  int i) 
	{
		this(world);
		vehicle = entity;
		vehicleID = entity.getEntityId();
		ID = i;
		
		initPosition();
	}
	
	public void initPosition()
	{
		Vector3f wheelVector = vehicle.axes.findLocalVectorGlobally(vehicle.getDriveableType().wheelPositions[ID].position);
		setPosition(vehicle.posX + wheelVector.x, vehicle.posY + wheelVector.y, vehicle.posZ + wheelVector.z);
		stepHeight = vehicle.getDriveableType().wheelStepHeight;
		
		prevPosX = posX;
		prevPosY = posY;
		prevPosZ = posZ;
	}
	
	@Override
    protected void fall(float k)
    {
		/*
		if(vehicle == null || k <= 0) 
        	return;
        int i = MathHelper.ceiling_float_int(k - 3F);
        if(i > 0 && invulnerableUnmountCount==0)
        	vehicle.attackPart(vehicle.getDriveableType().wheelPositions[ID].part, DamageSource.fall, i);
        */
    }

	@Override
	protected void entityInit() 
	{
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound tags) 
	{
		setDead();
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound tags) 
	{
	}
	
	@Override
    protected boolean canTriggerWalking()
    {
        return false;
    }
	
	@Override
	public void onUpdate()
	{
		//super.onUpdate();
		
		//prevPosX = posX;
		//prevPosY = posY;
		//prevPosZ = posZ;
		
		if(this.ridingEntity != null)
		{
			invulnerableUnmountCount = 20 * 4;
		}
		else if(invulnerableUnmountCount > 0)
		{
			invulnerableUnmountCount--;
		}

		//If on the client and the vehicle parent has yet to be found, search for it
		if(worldObj.isRemote && !foundVehicle)
		{
			vehicle = (EntityDriveable)worldObj.getEntityByID(vehicleID);
			if(vehicle == null)
				return;
			foundVehicle = true;
			vehicle.wheels[ID] = this;
		}	
		
		if(vehicle == null)
			return;
		

		EntityDriveable entD;
		entD = (EntityDriveable)worldObj.getEntityByID(vehicleID);
		if(entD == null){
			this.timeLimitDriveableNull++;
		}else{
			this.timeLimitDriveableNull = 0;
		}

		if(timeLimitDriveableNull > 60*20){
			this.setDead();
		}

		if(!addedToChunk)
			worldObj.spawnEntityInWorld(this);
		/*
		//Update angles
		rotationYaw = vehicle.rotationYaw;
		//Front wheels
		if(ID == 2 || ID == 3)
		{
			rotationYaw += vehicle.wheelsYaw;
		}
		
		//Apply gravity
		motionY -= 0.98F / 400F;
		
		//Apply velocity
		if(vehicle.getVehicleType().fourWheelDrive || ID == 0 || ID == 1)
		{
			float velocityScale = 0.01F;
			motionX += vehicle.throttle * Math.cos(rotationYaw * 3.14159265F / 180F) * velocityScale;
			motionZ += vehicle.throttle * Math.sin(rotationYaw * 3.14159265F / 180F) * velocityScale;
		}
		
		//Apply steering
		if(ID == 2 || ID == 3)
		{
			float velocityScale = 0.02F;
			motionX -= getSpeedXZ() * Math.sin(rotationYaw * 3.14159265F / 180F) * velocityScale * vehicle.wheelsYaw;
			motionZ += getSpeedXZ() * Math.cos(rotationYaw * 3.14159265F / 180F) * velocityScale * vehicle.wheelsYaw;
		}
		
		motionX *= 0.95F;
		motionY *= 0.95F;
		motionZ *= 0.95F;
		
		moveEntity(motionX, motionY, motionZ);
		
		//Pull wheels towards car
		Vector3f targetWheelPos = vehicle.axes.findLocalVectorGlobally(vehicle.getVehicleType().wheelPositions[ID]);
		Vector3f currentWheelPos = new Vector3f(posX - vehicle.posX, posY - vehicle.posY, posZ - vehicle.posZ);
		
		Vector3f dPos = ((Vector3f)Vector3f.sub(targetWheelPos, currentWheelPos, null).scale(vehicle.getVehicleType().wheelSpringStrength * 5F));
			
		if(dPos.length() > 0.001F)
		{
			moveEntity(dPos.x, dPos.y, dPos.z);
			dPos.scale(0.2F);
			vehicle.moveEntity(-dPos.x, -dPos.y, -dPos.z);
		}
		*/

	}
	
	
	
	public double getSpeedXZ()
	{
		return Math.sqrt(motionX * motionX + motionZ * motionZ);
	}
	
		public double getSpeedXYZ()
	{
		return Math.cbrt(motionX * motionX + motionZ * motionZ + motionY * motionY);
	}
	
	@Override
    public void setPositionAndRotation2(double d, double d1, double d2, float f, float f1, int i)
    {
    }
	
	@Override
	public void writeSpawnData(ByteBuf data) 
	{
		data.writeInt(vehicleID);
		data.writeInt(ID);
	}

	@Override
	public void readSpawnData(ByteBuf data) 
	{
		vehicleID = data.readInt();
		ID = data.readInt();
		vehicle = (EntityDriveable)worldObj.getEntityByID(vehicleID);
		
		if(vehicle != null)
			setPosition(posX, posY, posZ);
	}
	

	public void moveEntity(double p_70091_1_, double p_70091_3_, double p_70091_5_)
	{
		if (this.noClip)
		{
			this.boundingBox.offset(p_70091_1_, p_70091_3_, p_70091_5_);
			this.posX = (this.boundingBox.minX + this.boundingBox.maxX) / 2.0D;
			this.posY = this.boundingBox.minY + (double)this.yOffset - (double)this.ySize;
			this.posZ = (this.boundingBox.minZ + this.boundingBox.maxZ) / 2.0D;
		}
		else
		{
			this.worldObj.theProfiler.startSection("move");
			this.ySize *= 0.4F;
			double d3 = this.posX;
			double d4 = this.posY;
			double d5 = this.posZ;

			if (this.isInWeb)
			{
				this.isInWeb = false;
				p_70091_1_ *= 0.25D;
				p_70091_3_ *= 0.05000000074505806D;
				p_70091_5_ *= 0.25D;
				this.motionX = 0.0D;
				this.motionY = 0.0D;
				this.motionZ = 0.0D;
			}

			double d6 = p_70091_1_;
			double d7 = p_70091_3_;
			double d8 = p_70091_5_;
			AxisAlignedBB axisalignedbb = this.boundingBox.copy();
			boolean flag = false;

			List list = this.getCollidingBoundingBoxes(this, this.boundingBox.addCoord(p_70091_1_, p_70091_3_, p_70091_5_));

			for (int i = 0; i < list.size(); ++i)
			{
				p_70091_3_ = ((AxisAlignedBB)list.get(i)).calculateYOffset(this.boundingBox, p_70091_3_);
			}

			this.boundingBox.offset(0.0D, p_70091_3_, 0.0D);

			if (!this.field_70135_K && d7 != p_70091_3_)
			{
				p_70091_5_ = 0.0D;
				p_70091_3_ = 0.0D;
				p_70091_1_ = 0.0D;
			}

			boolean flag1 = this.onGround || d7 != p_70091_3_ && d7 < 0.0D;
			int j;

			for (j = 0; j < list.size(); ++j)
			{
				p_70091_1_ = ((AxisAlignedBB)list.get(j)).calculateXOffset(this.boundingBox, p_70091_1_);
			}

			this.boundingBox.offset(p_70091_1_, 0.0D, 0.0D);

			if (!this.field_70135_K && d6 != p_70091_1_)
			{
				p_70091_5_ = 0.0D;
				p_70091_3_ = 0.0D;
				p_70091_1_ = 0.0D;
			}

			for (j = 0; j < list.size(); ++j)
			{
				p_70091_5_ = ((AxisAlignedBB)list.get(j)).calculateZOffset(this.boundingBox, p_70091_5_);
			}

			this.boundingBox.offset(0.0D, 0.0D, p_70091_5_);

			if (!this.field_70135_K && d8 != p_70091_5_)
			{
				p_70091_5_ = 0.0D;
				p_70091_3_ = 0.0D;
				p_70091_1_ = 0.0D;
			}

			double d10;
			double d11;
			int k;
			double d12;

			if (this.stepHeight > 0.0F && flag1 && (flag || this.ySize < 0.05F) && (d6 != p_70091_1_ || d8 != p_70091_5_))
			{
				d12 = p_70091_1_;
				d10 = p_70091_3_;
				d11 = p_70091_5_;
				p_70091_1_ = d6;
				p_70091_3_ = (double)this.stepHeight;
				p_70091_5_ = d8;
				AxisAlignedBB axisalignedbb1 = this.boundingBox.copy();
				this.boundingBox.setBB(axisalignedbb);
				list = this.getCollidingBoundingBoxes(this, this.boundingBox.addCoord(d6, p_70091_3_, d8));

				for (k = 0; k < list.size(); ++k)
				{
					p_70091_3_ = ((AxisAlignedBB)list.get(k)).calculateYOffset(this.boundingBox, p_70091_3_);
				}

				this.boundingBox.offset(0.0D, p_70091_3_, 0.0D);

				if (!this.field_70135_K && d7 != p_70091_3_)
				{
					p_70091_5_ = 0.0D;
					p_70091_3_ = 0.0D;
					p_70091_1_ = 0.0D;
				}

				for (k = 0; k < list.size(); ++k)
				{
					p_70091_1_ = ((AxisAlignedBB)list.get(k)).calculateXOffset(this.boundingBox, p_70091_1_);
				}

				this.boundingBox.offset(p_70091_1_, 0.0D, 0.0D);

				if (!this.field_70135_K && d6 != p_70091_1_)
				{
					p_70091_5_ = 0.0D;
					p_70091_3_ = 0.0D;
					p_70091_1_ = 0.0D;
				}

				for (k = 0; k < list.size(); ++k)
				{
					p_70091_5_ = ((AxisAlignedBB)list.get(k)).calculateZOffset(this.boundingBox, p_70091_5_);
				}

				this.boundingBox.offset(0.0D, 0.0D, p_70091_5_);

				if (!this.field_70135_K && d8 != p_70091_5_)
				{
					p_70091_5_ = 0.0D;
					p_70091_3_ = 0.0D;
					p_70091_1_ = 0.0D;
				}

				if (!this.field_70135_K && d7 != p_70091_3_)
				{
					p_70091_5_ = 0.0D;
					p_70091_3_ = 0.0D;
					p_70091_1_ = 0.0D;
				}
				else
				{
					p_70091_3_ = (double)(-this.stepHeight);

					for (k = 0; k < list.size(); ++k)
					{
						p_70091_3_ = ((AxisAlignedBB)list.get(k)).calculateYOffset(this.boundingBox, p_70091_3_);
					}

					this.boundingBox.offset(0.0D, p_70091_3_, 0.0D);
				}

				if (d12 * d12 + d11 * d11 >= p_70091_1_ * p_70091_1_ + p_70091_5_ * p_70091_5_)
				{
					p_70091_1_ = d12;
					p_70091_3_ = d10;
					p_70091_5_ = d11;
					this.boundingBox.setBB(axisalignedbb1);
				}
			}

			this.worldObj.theProfiler.endSection();
			this.worldObj.theProfiler.startSection("rest");
			this.posX = (this.boundingBox.minX + this.boundingBox.maxX) / 2.0D;
			this.posY = this.boundingBox.minY + (double)this.yOffset - (double)this.ySize;
			this.posZ = (this.boundingBox.minZ + this.boundingBox.maxZ) / 2.0D;
			this.isCollidedHorizontally = d6 != p_70091_1_ || d8 != p_70091_5_;
			this.isCollidedVertically = d7 != p_70091_3_;
			this.onGround = d7 != p_70091_3_ && d7 < 0.0D;
			this.isCollided = this.isCollidedHorizontally || this.isCollidedVertically;
			this.updateFallState(p_70091_3_, this.onGround);

			if (d6 != p_70091_1_)
			{
				this.motionX = 0.0D;
			}

			if (d7 != p_70091_3_)
			{
				this.motionY = 0.0D;
			}

			if (d8 != p_70091_5_)
			{
				this.motionZ = 0.0D;
			}

			d12 = this.posX - d3;
			d10 = this.posY - d4;
			d11 = this.posZ - d5;

			try
			{
				this.func_145775_I();
			}
			catch (Throwable throwable)
			{
				CrashReport crashreport = CrashReport.makeCrashReport(throwable, "Checking entity block collision");
				CrashReportCategory crashreportcategory = crashreport.makeCategory("Entity being checked for collision");
				this.addEntityCrashInfo(crashreportcategory);
				throw new ReportedException(crashreport);
			}

			this.worldObj.theProfiler.endSection();
		}
	}
	

	public List getCollidingBoundingBoxes(Entity p_72945_1_, AxisAlignedBB p_72945_2_)
	{
		ArrayList collidingBoundingBoxes = new ArrayList();
		int i = MathHelper.floor_double(p_72945_2_.minX);
		int j = MathHelper.floor_double(p_72945_2_.maxX + 1.0D);
		int k = MathHelper.floor_double(p_72945_2_.minY);
		int l = MathHelper.floor_double(p_72945_2_.maxY + 1.0D);
		int i1 = MathHelper.floor_double(p_72945_2_.minZ);
		int j1 = MathHelper.floor_double(p_72945_2_.maxZ + 1.0D);

		for (int k1 = i; k1 < j; ++k1)
		{
			for (int l1 = i1; l1 < j1; ++l1)
			{
				if (this.worldObj.blockExists(k1, 64, l1))
				{
					for (int i2 = k - 1; i2 < l; ++i2)
					{
						Block block;

						if (k1 >= -30000000 && k1 < 30000000 && l1 >= -30000000 && l1 < 30000000)
						{
							block = this.worldObj.getBlock(k1, i2, l1);
						}
						else
						{
							block = Blocks.stone;
						}

						block.addCollisionBoxesToList(this.worldObj, k1, i2, l1, p_72945_2_, collidingBoundingBoxes, p_72945_1_);
					}
				}
			}
		}

		return collidingBoundingBoxes;
	}
}
