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
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;

import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.renderer.entity.RenderLiving;

import net.minecraft.client.renderer.entity.NPCRendererHelper;

import noppes.npcs.client.model.util.ModelPartInterface;
import noppes.npcs.client.model.util.ModelScaleRenderer;
import noppes.npcs.constants.EnumAnimation;
import noppes.npcs.constants.EnumJobType;
import noppes.npcs.entity.EntityCustomNpc;

import noppes.npcs.client.model.ModelNPCMale; //!
import noppes.npcs.client.model.ModelMPM; //!
import noppes.npcs.client.model.animation.AniCrawling;
import noppes.npcs.client.model.animation.AniHug;

import noppes.npcs.roles.JobPuppet;

import noppes.npcs.ModelPartConfig;
import noppes.npcs.ModelPartData;
import noppes.npcs.ModelData;

public class ModelCNPCsRenderer
{
	
	public static ModelNPCMale localCNPCsModelBaseL = null;
	public static ModelMPM localCNPCsModelBaseH = null;
		
	public static boolean renderCNPsArmour(Entity entity, ModelBiped armorModel, ArmourType type, float f5)
	{ 		
		if (!(entity instanceof EntityCustomNpc))
			return false;
		
		localCNPCsModelBaseL = null;
		boolean npcDancing = false;
		
		EntityCustomNpc customNpc = (EntityCustomNpc)entity;
		localCNPCsModelBaseL = getLocalCNPCsModel(entity);
		
		if (localCNPCsModelBaseL == null)
			return false;

		ModelScaleRenderer bipedHead = (ModelScaleRenderer) localCNPCsModelBaseL.bipedHead;
		ModelScaleRenderer bipedBody = (ModelScaleRenderer) localCNPCsModelBaseL.bipedBody;
		ModelScaleRenderer bipedRightArm = (ModelScaleRenderer) localCNPCsModelBaseL.bipedRightArm;
		ModelScaleRenderer bipedLeftArm = (ModelScaleRenderer) localCNPCsModelBaseL.bipedLeftArm;
		ModelScaleRenderer bipedRightLeg = (ModelScaleRenderer) localCNPCsModelBaseL.bipedRightLeg;
		ModelScaleRenderer bipedLeftLeg = (ModelScaleRenderer) localCNPCsModelBaseL.bipedLeftLeg;
		
		if(customNpc.currentAnimation == EnumAnimation.DANCING || localCNPCsModelBaseL.isDancing)
			npcDancing = true;
		
		
		ModelPartConfig currPartConf = customNpc.modelData.head;
		//Vector3f targetScale = new Vector3f(type.modelScale * currPartConf.scaleX, type.modelScale * currPartConf.scaleY, type.modelScale * currPartConf.scaleZ);
		Vector3f targetScale = new Vector3f(type.modelScale, type.modelScale, type.modelScale);
		
		float dancing = (float)entity.ticksExisted / 4.0F;
		
		/** Render Helm (Head Model) */
		GL11.glPushMatrix();				
				
		GL11.glScalef(targetScale.x, targetScale.y, targetScale.z);
		
		GL11.glTranslatef(bipedHead.rotationPointX / targetScale.x * f5, bipedHead.rotationPointY / targetScale.y * f5, bipedHead.rotationPointZ / targetScale.z * f5);	
		
		GL11.glTranslatef(bipedHead.x / targetScale.x, bipedHead.y / targetScale.y, bipedHead.z / targetScale.z);
        GL11.glTranslatef(currPartConf.transX / targetScale.x, currPartConf.transY / targetScale.y, currPartConf.transZ / targetScale.z);
		//GL11.glTranslatef(0F, customNpc.modelData.offsetY(), 0F);
		
		if (npcDancing)
			GL11.glTranslatef((float)Math.sin((double)dancing) * 0.075F / targetScale.x, (float)Math.abs(Math.cos((double)dancing)) * 0.125F - 0.02F / targetScale.y, (float)(-Math.abs(Math.cos((double)dancing))) * 0.075F/ targetScale.z);
		
		GL11.glScalef(currPartConf.scaleX, currPartConf.scaleY, currPartConf.scaleZ);
			
		for(ModelRendererTurbo mod : type.model.headModel)
		{
			mod.rotateAngleX = bipedHead.rotateAngleX;
			mod.rotateAngleY = bipedHead.rotateAngleY;
			mod.rotateAngleZ = bipedHead.rotateAngleZ;
			mod.render(f5);
			//Undo transformations
			mod.rotateAngleX = 0F;
			mod.rotateAngleY = 0F;
			mod.rotateAngleZ = 0F;
		}
			
		
		GL11.glPopMatrix();	

		/** Render Body (Body Model) */

		currPartConf = customNpc.modelData.body;
		
		//targetScale.set(type.modelScale * currPartConf.scaleX, type.modelScale * currPartConf.scaleY, type.modelScale * currPartConf.scaleZ);
		
		GL11.glPushMatrix();
				
		GL11.glScalef(targetScale.x, targetScale.y, targetScale.z);
		
		GL11.glTranslatef(bipedBody.rotationPointX / targetScale.x * f5, bipedBody.rotationPointY / targetScale.y * f5, bipedBody.rotationPointZ / targetScale.z * f5);	
				
		GL11.glTranslatef(bipedBody.x / targetScale.x, bipedBody.y / targetScale.y, bipedBody.z / targetScale.z);
        GL11.glTranslatef(currPartConf.transX / targetScale.x, currPartConf.transY / targetScale.y, currPartConf.transZ / targetScale.z);
		//GL11.glTranslatef(0F, customNpc.modelData.offsetY(), 0F);
		
		if (npcDancing)
			GL11.glTranslatef((float)Math.sin((double)dancing) * 0.015F / targetScale.x, 0.0F, 0.0F);
		
		GL11.glScalef(currPartConf.scaleX, currPartConf.scaleY, currPartConf.scaleZ);
		
		for(ModelRendererTurbo mod : type.model.bodyModel)
		{
			mod.rotateAngleX = bipedBody.rotateAngleX;
			mod.rotateAngleY = bipedBody.rotateAngleY;
			mod.rotateAngleZ = bipedBody.rotateAngleZ;
			mod.render(f5);
			//Undo transformations
			mod.rotateAngleX = 0F;
			mod.rotateAngleY = 0F;
			mod.rotateAngleZ = 0F;
		}
				
		GL11.glPopMatrix();

		/** Render Left Arm Model */
	
		currPartConf = customNpc.modelData.arms;
		
		//targetScale.set(type.modelScale * currPartConf.scaleX, type.modelScale * currPartConf.scaleY, type.modelScale * currPartConf.scaleZ);
		
		GL11.glPushMatrix();
		
		GL11.glScalef(targetScale.x, targetScale.y, targetScale.z);
		
		GL11.glTranslatef(bipedLeftArm.rotationPointX / targetScale.x * f5, bipedLeftArm.rotationPointY / targetScale.y * f5, bipedLeftArm.rotationPointZ / targetScale.z * f5);	
		
		GL11.glTranslatef(bipedLeftArm.x / targetScale.x, bipedLeftArm.y / targetScale.y, bipedLeftArm.z / targetScale.z);
        GL11.glTranslatef(currPartConf.transX / targetScale.x, currPartConf.transY / targetScale.y, currPartConf.transZ / targetScale.z);
		//GL11.glTranslatef(0F, customNpc.modelData.offsetY(), 0F);
		
		if (npcDancing)
			GL11.glTranslatef((float)Math.sin((double)dancing) * 0.025F / targetScale.x, (float)Math.abs(Math.cos((double)dancing)) * 0.125F - 0.02F / targetScale.y, 0.0F);
		
		GL11.glScalef(currPartConf.scaleX, currPartConf.scaleY, currPartConf.scaleZ);

		for(ModelRendererTurbo mod : type.model.leftArmModel)
		{
			mod.rotateAngleX = bipedLeftArm.rotateAngleX;
			mod.rotateAngleY = bipedLeftArm.rotateAngleY;
			mod.rotateAngleZ = bipedLeftArm.rotateAngleZ;
			mod.render(f5);
			//Undo transformations
			mod.rotateAngleX = 0F;
			mod.rotateAngleY = 0F;
			mod.rotateAngleZ = 0F;
		}
		
		
		GL11.glPopMatrix();
		
		/** Render Right Arm Model */
		
		GL11.glPushMatrix();
			
		GL11.glScalef(targetScale.x, targetScale.y, targetScale.z);
		
		GL11.glTranslatef(bipedRightArm.rotationPointX / targetScale.x * f5, bipedRightArm.rotationPointY / targetScale.y * f5, bipedRightArm.rotationPointZ / targetScale.z * f5);	
		
		GL11.glTranslatef(bipedRightArm.x / targetScale.x, bipedRightArm.y / targetScale.y, bipedRightArm.z / targetScale.z);
        GL11.glTranslatef(currPartConf.transX / targetScale.x, currPartConf.transY / targetScale.y, currPartConf.transZ / targetScale.z);
		//GL11.glTranslatef(0F, customNpc.modelData.offsetY(), 0F);
			
		if (npcDancing)
			GL11.glTranslatef((float)Math.sin((double)dancing) * 0.025F / targetScale.x, (float)Math.abs(Math.cos((double)dancing)) * 0.125F - 0.02F / targetScale.y, 0.0F);
					
		GL11.glScalef(currPartConf.scaleX, currPartConf.scaleY, currPartConf.scaleZ);
			
		for(ModelRendererTurbo mod : type.model.rightArmModel)
		{
			mod.rotateAngleX = bipedRightArm.rotateAngleX;
			mod.rotateAngleY = bipedRightArm.rotateAngleY;
			mod.rotateAngleZ = bipedRightArm.rotateAngleZ;
			mod.render(f5);
			//Undo transformations
			mod.rotateAngleX = 0F;
			mod.rotateAngleY = 0F;
			mod.rotateAngleZ = 0F;
		}
		
		
		GL11.glPopMatrix();
		
		/** Render Left Leg Model */

		currPartConf = customNpc.modelData.legs;
		//targetScale.set(type.modelScale * currPartConf.scaleX, type.modelScale * currPartConf.scaleY, type.modelScale * currPartConf.scaleZ);
		
		GL11.glPushMatrix();
		
		GL11.glScalef(targetScale.x, targetScale.y, targetScale.z);
		
		GL11.glTranslatef(bipedLeftLeg.rotationPointX / targetScale.x * f5, bipedLeftLeg.rotationPointY / targetScale.y * f5, bipedLeftLeg.rotationPointZ / targetScale.z * f5);		
		
		GL11.glTranslatef(bipedLeftLeg.x / targetScale.x, bipedLeftLeg.y / targetScale.y, bipedLeftLeg.z / targetScale.z);
        GL11.glTranslatef(currPartConf.transX / targetScale.x, currPartConf.transY / targetScale.y, currPartConf.transZ / targetScale.z);
		//GL11.glTranslatef(0F, customNpc.modelData.offsetY(), 0F);
		
		GL11.glScalef(currPartConf.scaleX, currPartConf.scaleY, currPartConf.scaleZ);
		
		for(ModelRendererTurbo mod : type.model.leftLegModel)
		{
			mod.rotateAngleX = bipedLeftLeg.rotateAngleX;
			mod.rotateAngleY = bipedLeftLeg.rotateAngleY;
			mod.rotateAngleZ = bipedLeftLeg.rotateAngleZ;
			mod.render(f5);
			//Undo transformations
			mod.rotateAngleX = 0F;
			mod.rotateAngleY = 0F;
			mod.rotateAngleZ = 0F;
		}
		
		GL11.glPopMatrix();		
		
		/** Render Right Leg Model */
		
		GL11.glPushMatrix();
		
		GL11.glScalef(targetScale.x, targetScale.y, targetScale.z);
		
		GL11.glTranslatef(bipedRightLeg.rotationPointX / targetScale.x * f5, bipedRightLeg.rotationPointY / targetScale.y * f5, bipedRightLeg.rotationPointZ / targetScale.z * f5);		
		
		GL11.glTranslatef(bipedRightLeg.x / targetScale.x, bipedRightLeg.y / targetScale.y, bipedRightLeg.z / targetScale.z);		
		GL11.glTranslatef(currPartConf.transX / targetScale.x, currPartConf.transY / targetScale.y, currPartConf.transZ / targetScale.z);
		GL11.glScalef(currPartConf.scaleX, currPartConf.scaleY, currPartConf.scaleZ);
		
		//GL11.glTranslatef(0F, customNpc.modelData.offsetY(), 0F);
		
		
		
		for(ModelRendererTurbo mod : type.model.rightLegModel)
		{
			mod.rotateAngleX = bipedRightLeg.rotateAngleX;
			mod.rotateAngleY = bipedRightLeg.rotateAngleY;
			mod.rotateAngleZ = bipedRightLeg.rotateAngleZ;
			mod.render(f5);
			//Undo transformations
			mod.rotateAngleX = 0F;
			mod.rotateAngleY = 0F;
			mod.rotateAngleZ = 0F;
		}
		
		GL11.glPopMatrix();
			
		return true;
	}	
/*		
		/** Render Skirt Front Model */
/*		
		GL11.glPushMatrix();

			for(ModelRendererTurbo mod : type.model.skirtFrontModel)
			{
				mod.render(f5);
			}
		
		GL11.glPopMatrix();

		/** Render Skirt Back Model */
/*
		GL11.glPushMatrix();
		
			for(ModelRendererTurbo mod : type.model.skirtRearModel)
			{
				mod.render(f5);
			}
		
		GL11.glPopMatrix();
	
		return true;
		
*/
	public static ModelNPCMale getLocalCNPCsModel(Entity entityToGetRender)
	{
		RendererLivingEntity localCNPCsRender = null;
		
		Render localRender = RenderManager.instance.getEntityRenderObject(entityToGetRender);	
			
		if(localRender instanceof RendererLivingEntity && (RendererLivingEntity)localRender != null)
			localCNPCsRender = (RendererLivingEntity)localRender;
				else
					return null;		
		
		ModelBase localRenderModel = NPCRendererHelper.getMainModel(localCNPCsRender);
		
		if (localRenderModel == null || !(localRenderModel instanceof ModelNPCMale))
			return null;
		
	return (ModelNPCMale)localRenderModel;
		
	}	
}
