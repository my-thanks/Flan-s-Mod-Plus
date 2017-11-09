package com.flansmod.client.model;

import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

import java.lang.reflect.*;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.teams.ArmourType;
import com.flansmod.common.vector.Vector3f;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;

import net.smart.moving.render.playerapi.SmartMoving;
import net.smart.moving.render.playerapi.SmartMovingRenderPlayerBase;
import net.smart.moving.render.SmartMovingRender;
import net.smart.moving.render.SmartMovingModel;
import net.smart.render.ModelRotationRenderer;
import net.smart.render.SmartRenderUtilities;
import net.smart.render.SmartRenderModel;
import net.smart.render.IModelPlayer;

public class ModelCustomArmourSmartRenderer
{
	
	public static SmartMovingRenderPlayerBase localSmartMovingRenderPlayerBase;
	
	public static IModelPlayer localImp;
	
	private static FloatBuffer buffer = BufferUtils.createFloatBuffer(16);
	private static float[] array = new float[16];
	
	protected final static float SmartRadiantToAngle = SmartRenderUtilities.RadiantToAngle;
	
	public static int XYZ = 0;
	public static int XZY = 1;
	public static int YXZ = 2;
	public static int YZX = 3;
	public static int ZXY = 4;
	public static int ZYX = 5;

		
	public static boolean renderArmourSmart(Entity entity, float f5, ArmourType type)
	{ 		
		if (!(entity instanceof EntityPlayer))
			return false;
		
		SmartMovingModel entitySmartMovingModel = getLocalSmartMovingModel(entity);
		
		if (entitySmartMovingModel == null) return false;
		
		ModelRotationRenderer bipedOuter = entitySmartMovingModel.md.bipedOuter;
		ModelRotationRenderer bipedTorso = entitySmartMovingModel.md.bipedTorso;
		ModelRotationRenderer bipedBody = entitySmartMovingModel.md.bipedBody;
		ModelRotationRenderer bipedBreast = entitySmartMovingModel.md.bipedBreast;
		ModelRotationRenderer bipedHead = entitySmartMovingModel.md.bipedHead;
		ModelRotationRenderer bipedRightShoulder = entitySmartMovingModel.md.bipedRightShoulder;
		ModelRotationRenderer bipedRightArm = entitySmartMovingModel.md.bipedRightArm;
		ModelRotationRenderer bipedLeftShoulder = entitySmartMovingModel.md.bipedLeftShoulder;
		ModelRotationRenderer bipedLeftArm = entitySmartMovingModel.md.bipedLeftArm;
		ModelRotationRenderer bipedPelvic = entitySmartMovingModel.md.bipedPelvic;
		ModelRotationRenderer bipedRightLeg = entitySmartMovingModel.md.bipedRightLeg;
		ModelRotationRenderer bipedLeftLeg = entitySmartMovingModel.md.bipedLeftLeg;		
		ModelRotationRenderer bipedNeck = entitySmartMovingModel.md.bipedNeck;
		
		ModelRotationRenderer bipedHeadwear = entitySmartMovingModel.md.bipedHeadwear;
		
		
		/**
		
			* --------------------------------------------------------------------------------- *
			* Chains of transformations for parts of SmartRenderModel body:						*
			* =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=	*
			* bipedOuter <- bipedTorso <- bipedBreast <- bipedNeck <- bipedHead					*
			* bipedOuter <- bipedTorso <- bipedBody												*
			* bipedOuter <- bipedTorso <- bipedBreast <- bipedRightShoulder <- bipedRightArm	*
			* bipedOuter <- bipedTorso <- bipedBreast <- bipedLeftShoulder <- bipedLeftArm		*
			* bipedOuter <- bipedTorso <- bipedPelvic <- bipedRightLeg							*
			* bipedOuter <- bipedTorso <- bipedPelvic <- bipedLeftLeg							*
			* ---------------------------------------------------------------------------------	*
		
		*/
		
		/** Render Helm (Head Model) */
		
		Vector3f targetScale = new Vector3f(type.modelScale, type.modelScale, type.modelScale);
		
		GL11.glPushMatrix();
									
			GL11.glScalef(targetScale.x, targetScale.y, targetScale.z);
			rotateGlobalModelRotationRenderer(bipedOuter, bipedHead.ignoreBase || bipedNeck.ignoreBase || bipedBreast.ignoreBase || bipedTorso.ignoreBase, targetScale, f5);
			rotateGlobalModelRotationRenderer(bipedTorso, bipedHead.ignoreBase || bipedNeck.ignoreBase || bipedBreast.ignoreBase, targetScale, f5);
			rotateGlobalModelRotationRenderer(bipedBreast, bipedHead.ignoreBase || bipedNeck.ignoreBase, targetScale, f5);
			rotateGlobalModelRotationRenderer(bipedNeck, bipedHead.ignoreBase, targetScale, f5);
			rotateGlobalModelRotationRenderer(bipedHead, false, targetScale, f5);
			for(ModelRendererTurbo mod : type.model.headModel)
			{		
				mod.render(f5);
			}	
			
		GL11.glPopMatrix();
		
		/** Render Body (Body Model) */

		GL11.glPushMatrix();		
		
			GL11.glScalef(targetScale.x, targetScale.y, targetScale.z);
			rotateGlobalModelRotationRenderer(bipedOuter, bipedBody.ignoreBase || bipedTorso.ignoreBase, targetScale, f5);
			rotateGlobalModelRotationRenderer(bipedTorso, bipedBody.ignoreBase, targetScale, f5);
			rotateGlobalModelRotationRenderer(bipedBody, false, targetScale, f5);
			for(ModelRendererTurbo mod : type.model.bodyModel)
			{
				mod.render(f5);
			}
		
		GL11.glPopMatrix();
		

		/** Render Left Arm Model */
	
		GL11.glPushMatrix();
						
			GL11.glScalef(targetScale.x, targetScale.y, targetScale.z);
			rotateGlobalModelRotationRenderer(bipedOuter, bipedLeftArm.ignoreBase || bipedLeftShoulder.ignoreBase || bipedBreast.ignoreBase || bipedTorso.ignoreBase, targetScale, f5);
			rotateGlobalModelRotationRenderer(bipedTorso, bipedLeftArm.ignoreBase || bipedLeftShoulder.ignoreBase || bipedBreast.ignoreBase, targetScale, f5);
			rotateGlobalModelRotationRenderer(bipedBreast, bipedLeftArm.ignoreBase || bipedLeftShoulder.ignoreBase, targetScale, f5);
			rotateGlobalModelRotationRenderer(bipedLeftShoulder, bipedLeftArm.ignoreBase, targetScale, f5);
			rotateGlobalModelRotationRenderer(bipedLeftArm, false, targetScale, f5);
			for(ModelRendererTurbo mod : type.model.leftArmModel)
			{
				mod.render(f5);
			}
		
		GL11.glPopMatrix();
		
		/** Render Right Arm Model */
		
		GL11.glPushMatrix();
						
			GL11.glScalef(targetScale.x, targetScale.y, targetScale.z);
			rotateGlobalModelRotationRenderer(bipedOuter, bipedRightArm.ignoreBase || bipedRightShoulder.ignoreBase || bipedBreast.ignoreBase || bipedTorso.ignoreBase,  targetScale, f5);
			rotateGlobalModelRotationRenderer(bipedTorso, bipedRightArm.ignoreBase || bipedRightShoulder.ignoreBase || bipedBreast.ignoreBase, targetScale, f5);
			rotateGlobalModelRotationRenderer(bipedBreast, bipedRightArm.ignoreBase || bipedRightShoulder.ignoreBase, targetScale, f5);
			rotateGlobalModelRotationRenderer(bipedRightShoulder, bipedRightArm.ignoreBase, targetScale, f5);
			rotateGlobalModelRotationRenderer(bipedRightArm, false, targetScale, f5);						
			for(ModelRendererTurbo mod : type.model.rightArmModel)
			{
				mod.render(f5);
			}
		
		GL11.glPopMatrix();
		
		/** Render Left Leg Model */
		
		GL11.glPushMatrix();
				
			GL11.glScalef(targetScale.x, targetScale.y, targetScale.z);
			rotateGlobalModelRotationRenderer(bipedOuter, bipedLeftLeg.ignoreBase || bipedPelvic.ignoreBase || bipedTorso.ignoreBase, targetScale, f5);
			rotateGlobalModelRotationRenderer(bipedTorso, bipedLeftLeg.ignoreBase || bipedPelvic.ignoreBase, targetScale, f5);
			rotateGlobalModelRotationRenderer(bipedPelvic, bipedLeftLeg.ignoreBase, targetScale, f5);
			rotateGlobalModelRotationRenderer(bipedLeftLeg, false, targetScale, f5);
			for(ModelRendererTurbo mod : type.model.leftLegModel)
			{
				mod.render(f5);
			}
		
		GL11.glPopMatrix();		
		
		/** Render Right Leg Model */
		
		GL11.glPushMatrix();
					
			GL11.glScalef(targetScale.x, targetScale.y, targetScale.z);
			rotateGlobalModelRotationRenderer(bipedOuter, bipedRightLeg.ignoreBase || bipedPelvic.ignoreBase || bipedTorso.ignoreBase,  targetScale, f5);
			rotateGlobalModelRotationRenderer(bipedTorso, bipedRightLeg.ignoreBase || bipedPelvic.ignoreBase, targetScale, f5);
			rotateGlobalModelRotationRenderer(bipedPelvic, bipedRightLeg.ignoreBase, targetScale, f5);
			rotateGlobalModelRotationRenderer(bipedRightLeg, false, targetScale, f5);
			for(ModelRendererTurbo mod : type.model.rightLegModel)
			{
				mod.render(f5);
			}
		
		GL11.glPopMatrix();
		
		/** Render Skirt Front Model */
		
		GL11.glPushMatrix();
				
			GL11.glScalef(targetScale.x, targetScale.y, targetScale.z);
			rotateGlobalModelRotationRenderer(bipedOuter, bipedLeftLeg.ignoreBase || bipedPelvic.ignoreBase || bipedTorso.ignoreBase,  targetScale, f5);
			rotateGlobalModelRotationRenderer(bipedTorso, bipedLeftLeg.ignoreBase || bipedPelvic.ignoreBase, targetScale, f5);
			rotateGlobalModelRotationRenderer(bipedPelvic, bipedLeftLeg.ignoreBase, targetScale, f5);
			
			GL11.glTranslatef((bipedRightLeg.rotationPointX + bipedLeftLeg.rotationPointX) / 2F / targetScale.x * f5, (bipedRightLeg.rotationPointY + bipedLeftLeg.rotationPointY) / 2F / targetScale.y * f5,  (bipedRightLeg.rotationPointZ + bipedLeftLeg.rotationPointZ) / 2F / targetScale.z * f5);
			
			rotateSpecModelRotationRenderer(bipedLeftLeg, 0F, 1F, 0F);
			if (bipedLeftLeg.rotateAngleX >= bipedRightLeg.rotateAngleX)
				rotateSpecModelRotationRenderer(bipedLeftLeg, 0.5F, 0F, 0.5F);
					else
						rotateSpecModelRotationRenderer(bipedRightLeg, 0.5F, 0F, 0.5F);
			
			GL11.glTranslatef((bipedRightLeg.offsetX + bipedLeftLeg.offsetX) / 2F / targetScale.x * f5, (bipedRightLeg.offsetY + bipedLeftLeg.offsetY) / 2F / targetScale.y * f5,  (bipedRightLeg.offsetZ + bipedLeftLeg.offsetZ) / 2F / targetScale.z * f5);

			for(ModelRendererTurbo mod : type.model.skirtFrontModel)
			{
				mod.render(f5);
			}
		
		GL11.glPopMatrix();

		/** Render Skirt Back Model */

		GL11.glPushMatrix();
					
			GL11.glScalef(targetScale.x, targetScale.y, targetScale.z);
			rotateGlobalModelRotationRenderer(bipedOuter, bipedLeftLeg.ignoreBase || bipedPelvic.ignoreBase || bipedTorso.ignoreBase,  targetScale, f5);
			rotateGlobalModelRotationRenderer(bipedTorso, bipedLeftLeg.ignoreBase || bipedPelvic.ignoreBase, targetScale, f5);
			rotateGlobalModelRotationRenderer(bipedPelvic, bipedLeftLeg.ignoreBase, targetScale, f5);
			
			GL11.glTranslatef((bipedRightLeg.rotationPointX + bipedLeftLeg.rotationPointX) / 2F / targetScale.x * f5, (bipedRightLeg.rotationPointY + bipedLeftLeg.rotationPointY) / 2F / targetScale.y * f5,  (bipedRightLeg.rotationPointZ + bipedLeftLeg.rotationPointZ) / 2F / targetScale.z * f5);
			
			rotateSpecModelRotationRenderer(bipedRightLeg, 0F, 1F, 0F);
			
			if (bipedLeftLeg.rotateAngleX < bipedRightLeg.rotateAngleX)
				rotateSpecModelRotationRenderer(bipedLeftLeg, 0.5F, 0F, 0.5F);
					else
						rotateSpecModelRotationRenderer(bipedRightLeg, 0.5F, 0F, 0.5F);
			
			GL11.glTranslatef((bipedRightLeg.offsetX + bipedLeftLeg.offsetX) / 2F / targetScale.x * f5, (bipedRightLeg.offsetY + bipedLeftLeg.offsetY) / 2F / targetScale.y * f5,  (bipedRightLeg.offsetZ + bipedLeftLeg.offsetZ) / 2F / targetScale.z * f5);

			for(ModelRendererTurbo mod : type.model.skirtRearModel)
			{
				mod.render(f5);
			}
		
		GL11.glPopMatrix();

		return true;
		
	}

	public static SmartMovingModel getLocalSmartMovingModel(Entity entityToGetRender)
	{
		RenderPlayer localRenderPlayer = null;
		
		SmartMovingRender localSmartMovingRender = null;
		SmartMovingModel localSmartMovingModel = null;
		
		Render localRender = RenderManager.instance.getEntityRenderObject(entityToGetRender);	
			
		if(localRender instanceof RenderPlayer && (RenderPlayer)localRender != null)
			localRenderPlayer = (RenderPlayer)localRender;
				else
					return null;			
			
		localSmartMovingRenderPlayerBase = SmartMoving.getPlayerBase(localRenderPlayer);
		
		if (localSmartMovingRenderPlayerBase != null)
			localSmartMovingRender = localSmartMovingRenderPlayerBase.getRenderModel();
				else
					return null;
		
		if (localSmartMovingRender != null)
			localSmartMovingModel = localSmartMovingRender.modelBipedMain;
				else
					return null;
		
	return localSmartMovingModel;
		
	}
	
	public static void rotateGlobalModelRotationRenderer(ModelRotationRenderer tagetToRot, boolean baseIgnore, Vector3f backScale, float f5)
	
	{	
		if (tagetToRot == null)
			return;
				
		
		
		if (!baseIgnore)
		{					
			GL11.glTranslatef(tagetToRot.rotationPointX / backScale.x * f5, tagetToRot.rotationPointY / backScale.y * f5,  tagetToRot.rotationPointZ / backScale.z * f5);
			
			if(tagetToRot.ignoreSuperRotation)
			{			
				buffer.rewind();
				GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, buffer);
				buffer.get(array);

				GL11.glLoadIdentity();
				GL11.glTranslatef(array[12] / array[15], array[13] / array[15], array[14] / array[15]);
				GL11.glScalef(backScale.x, backScale.y, backScale.z);
			}
				
				if((tagetToRot.rotationOrder == ZXY) && tagetToRot.rotateAngleY != 0.0F)
					GL11.glRotatef(tagetToRot.rotateAngleY * SmartRadiantToAngle, 0.0F, 1.0F, 0.0F);

				if((tagetToRot.rotationOrder == YXZ) && tagetToRot.rotateAngleZ != 0.0F)
					GL11.glRotatef(tagetToRot.rotateAngleZ * SmartRadiantToAngle, 0.0F, 0.0F, 1.0F);

				if((tagetToRot.rotationOrder == YZX || tagetToRot.rotationOrder == YXZ || tagetToRot.rotationOrder == ZXY || tagetToRot.rotationOrder == ZYX) && tagetToRot.rotateAngleX != 0.0F)
					GL11.glRotatef(tagetToRot.rotateAngleX * SmartRadiantToAngle, 1.0F, 0.0F, 0.0F);

				if((tagetToRot.rotationOrder == XZY || tagetToRot.rotationOrder == ZYX) && tagetToRot.rotateAngleY != 0.0F)
					GL11.glRotatef(tagetToRot.rotateAngleY * SmartRadiantToAngle, 0.0F, 1.0F, 0.0F);

				if((tagetToRot.rotationOrder == XYZ || tagetToRot.rotationOrder == XZY || tagetToRot.rotationOrder == YZX || tagetToRot.rotationOrder == ZXY || tagetToRot.rotationOrder == ZYX ) && tagetToRot.rotateAngleZ != 0.0F)
					GL11.glRotatef(tagetToRot.rotateAngleZ * SmartRadiantToAngle, 0.0F, 0.0F, 1.0F);

				if((tagetToRot.rotationOrder == XYZ || tagetToRot.rotationOrder == YXZ || tagetToRot.rotationOrder == YZX) && tagetToRot.rotateAngleY != 0.0F)
					GL11.glRotatef(tagetToRot.rotateAngleY * SmartRadiantToAngle, 0.0F, 1.0F, 0.0F);

				if((tagetToRot.rotationOrder == XYZ || tagetToRot.rotationOrder == XZY) && tagetToRot.rotateAngleX != 0.0F)
					GL11.glRotatef(tagetToRot.rotateAngleX * SmartRadiantToAngle, 1.0F, 0.0F, 0.0F);	
			
			GL11.glScalef(tagetToRot.scaleX, tagetToRot.scaleY, tagetToRot.scaleZ);			
			GL11.glTranslatef(tagetToRot.offsetX / backScale.x, tagetToRot.offsetY / backScale.y, tagetToRot.offsetZ / backScale.z);
			
		}
		
		
	}
	
	public static void rotateSpecModelRotationRenderer(ModelRotationRenderer tagetToRot, float multX, float multY, float multZ)
	
	{	
		if (tagetToRot == null)
			return;
				
				if((tagetToRot.rotationOrder == ZXY) && tagetToRot.rotateAngleY != 0.0F)
					GL11.glRotatef(tagetToRot.rotateAngleY * multY * SmartRadiantToAngle, 0.0F, 1.0F, 0.0F);

				if((tagetToRot.rotationOrder == YXZ) && tagetToRot.rotateAngleZ != 0.0F)
					GL11.glRotatef(tagetToRot.rotateAngleZ * multZ  * SmartRadiantToAngle, 0.0F, 0.0F, 1.0F);

				if((tagetToRot.rotationOrder == YZX || tagetToRot.rotationOrder == YXZ || tagetToRot.rotationOrder == ZXY || tagetToRot.rotationOrder == ZYX) && tagetToRot.rotateAngleX != 0.0F)
					GL11.glRotatef(tagetToRot.rotateAngleX * multX * SmartRadiantToAngle, 1.0F, 0.0F, 0.0F);

				if((tagetToRot.rotationOrder == XZY || tagetToRot.rotationOrder == ZYX) && tagetToRot.rotateAngleY != 0.0F)
					GL11.glRotatef(tagetToRot.rotateAngleY * multY * SmartRadiantToAngle, 0.0F, 1.0F, 0.0F);

				if((tagetToRot.rotationOrder == XYZ || tagetToRot.rotationOrder == XZY || tagetToRot.rotationOrder == YZX || tagetToRot.rotationOrder == ZXY || tagetToRot.rotationOrder == ZYX ) && tagetToRot.rotateAngleZ != 0.0F)
					GL11.glRotatef(tagetToRot.rotateAngleZ * multZ  * SmartRadiantToAngle, 0.0F, 0.0F, 1.0F);

				if((tagetToRot.rotationOrder == XYZ || tagetToRot.rotationOrder == YXZ || tagetToRot.rotationOrder == YZX) && tagetToRot.rotateAngleY != 0.0F)
					GL11.glRotatef(tagetToRot.rotateAngleY * multY * SmartRadiantToAngle, 0.0F, 1.0F, 0.0F);

				if((tagetToRot.rotationOrder == XYZ || tagetToRot.rotationOrder == XZY) && tagetToRot.rotateAngleX != 0.0F)
					GL11.glRotatef(tagetToRot.rotateAngleX * multX * SmartRadiantToAngle, 1.0F, 0.0F, 0.0F);		
		
	}
	
}
