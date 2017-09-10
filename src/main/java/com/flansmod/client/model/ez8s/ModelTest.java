//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: -
// Last changed on: -

package com.flansmod.client.model.ez8s; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;


public class ModelTest extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelTest() //Same as Filename
	{
		headModel = new ModelRendererTurbo[1];
		headModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3

		headModel[0].addBox(-4F, -8F, -4F, 8, 8, 8, 0F); // Box 3
		headModel[0].setRotationPoint(0F, 0F, 0F);


		bodyModel = new ModelRendererTurbo[1];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0

		bodyModel[0].addBox(-4F, 0F, -2F, 8, 12, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel = new ModelRendererTurbo[1];
		leftArmModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2

		leftArmModel[0].addBox(-1F, -2F, -2F, 4, 12, 4, 0F); // Box 2
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[1];
		rightArmModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 5

		rightArmModel[0].addBox(-3F, -2F, -2F, 4, 12, 4, 0F); // Box 5
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[1];
		leftLegModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1

		leftLegModel[0].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Box 1
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[1];
		rightLegModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 4

		rightLegModel[0].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Box 4
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

	}
}