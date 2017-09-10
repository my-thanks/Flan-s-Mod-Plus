//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Navalgun_Otomelara76mmCompact
// Model Creator:
// Created on: 03.08.2017 - 23:48:37
// Last changed on: 03.08.2017 - 23:48:37

package com.flansmod.client.model.ez8s; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelOTO_76mm extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelOTO_76mm() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[25];
		bodyModel[0] = new ModelRendererTurbo(this, 222, 216, textureX, textureY); // Box 109
		bodyModel[1] = new ModelRendererTurbo(this, 222, 216, textureX, textureY); // Box 110
		bodyModel[2] = new ModelRendererTurbo(this, 222, 216, textureX, textureY); // Box 111
		bodyModel[3] = new ModelRendererTurbo(this, 105, 212, textureX, textureY); // Box 113
		bodyModel[4] = new ModelRendererTurbo(this, 105, 212, textureX, textureY); // Box 115
		bodyModel[5] = new ModelRendererTurbo(this, 105, 212, textureX, textureY); // Box 116
		bodyModel[6] = new ModelRendererTurbo(this, 0, 214, textureX, textureY); // Box 117
		bodyModel[7] = new ModelRendererTurbo(this, 0, 214, textureX, textureY); // Box 118
		bodyModel[8] = new ModelRendererTurbo(this, 0, 214, textureX, textureY); // Box 119
		bodyModel[9] = new ModelRendererTurbo(this, 0, 245, textureX, textureY); // Box 120
		bodyModel[10] = new ModelRendererTurbo(this, 0, 245, textureX, textureY); // Box 128
		bodyModel[11] = new ModelRendererTurbo(this, 0, 245, textureX, textureY); // Box 129
		bodyModel[12] = new ModelRendererTurbo(this, 0, 245, textureX, textureY); // Box 130
		bodyModel[13] = new ModelRendererTurbo(this, 0, 245, textureX, textureY); // Box 131
		bodyModel[14] = new ModelRendererTurbo(this, 0, 245, textureX, textureY); // Box 132
		bodyModel[15] = new ModelRendererTurbo(this, 0, 245, textureX, textureY); // Box 133
		bodyModel[16] = new ModelRendererTurbo(this, 0, 245, textureX, textureY); // Box 134
		bodyModel[17] = new ModelRendererTurbo(this, 0, 245, textureX, textureY); // Box 135
		bodyModel[18] = new ModelRendererTurbo(this, 0, 245, textureX, textureY); // Box 137
		bodyModel[19] = new ModelRendererTurbo(this, 0, 245, textureX, textureY); // Box 138
		bodyModel[20] = new ModelRendererTurbo(this, 0, 245, textureX, textureY); // Box 139
		bodyModel[21] = new ModelRendererTurbo(this, 0, 245, textureX, textureY); // Box 140
		bodyModel[22] = new ModelRendererTurbo(this, 0, 245, textureX, textureY); // Box 141
		bodyModel[23] = new ModelRendererTurbo(this, 0, 245, textureX, textureY); // Box 142
		bodyModel[24] = new ModelRendererTurbo(this, 0, 245, textureX, textureY); // Box 143

		bodyModel[0].addShapeBox(-7F, 0F, -19F, 14, 1, 38, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[0].setRotationPoint(0F, 1F, 0F);

		bodyModel[1].addShapeBox(-19F, 0F, -19F, 12, 1, 38, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F); // Box 110
		bodyModel[1].setRotationPoint(0F, 1F, 0F);

		bodyModel[2].addShapeBox(7F, 0F, -19F, 12, 1, 38, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F); // Box 111
		bodyModel[2].setRotationPoint(0F, 1F, 0F);

		bodyModel[3].addShapeBox(-8F, 1F, -21F, 16, 2, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[3].setRotationPoint(0F, 1F, 0F);

		bodyModel[4].addShapeBox(-21F, 1F, -21F, 13, 2, 42, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F); // Box 115
		bodyModel[4].setRotationPoint(0F, 1F, 0F);

		bodyModel[5].addShapeBox(8F, 1F, -21F, 13, 2, 42, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F); // Box 116
		bodyModel[5].setRotationPoint(0F, 1F, 0F);

		bodyModel[6].addShapeBox(-7F, 0F, -19F, 14, 4, 38, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[6].setRotationPoint(0F, 4F, 0F);

		bodyModel[7].addShapeBox(7F, 0F, -19F, 12, 4, 38, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F); // Box 118
		bodyModel[7].setRotationPoint(0F, 4F, 0F);

		bodyModel[8].addShapeBox(-19F, 0F, -19F, 12, 4, 38, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F); // Box 119
		bodyModel[8].setRotationPoint(0F, 4F, 0F);

		bodyModel[9].addShapeBox(19F, 4F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(19F, 4F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[10].setRotationPoint(0F, 0F, 0F);
		bodyModel[10].rotateAngleY = 0.39269908F;

		bodyModel[11].addShapeBox(19F, 4F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[11].setRotationPoint(0F, 0F, 0F);
		bodyModel[11].rotateAngleY = 0.78539816F;

		bodyModel[12].addShapeBox(19F, 4F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[12].setRotationPoint(0F, 0F, 0F);
		bodyModel[12].rotateAngleY = 1.17809725F;

		bodyModel[13].addShapeBox(19F, 4F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[13].setRotationPoint(0F, 0F, 0F);
		bodyModel[13].rotateAngleY = 1.57079633F;

		bodyModel[14].addShapeBox(19F, 4F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[14].setRotationPoint(0F, 0F, 0F);
		bodyModel[14].rotateAngleY = 1.96349541F;

		bodyModel[15].addShapeBox(19F, 4F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[15].setRotationPoint(0F, 0F, 0F);
		bodyModel[15].rotateAngleY = 2.35619449F;

		bodyModel[16].addShapeBox(19F, 4F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[16].setRotationPoint(0F, 0F, 0F);
		bodyModel[16].rotateAngleY = 2.74889357F;

		bodyModel[17].addShapeBox(19F, 4F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[17].setRotationPoint(0F, 0F, 0F);
		bodyModel[17].rotateAngleY = 3.14159265F;

		bodyModel[18].addShapeBox(19F, 4F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[18].setRotationPoint(0F, 0F, 0F);
		bodyModel[18].rotateAngleY = 3.92699082F;

		bodyModel[19].addShapeBox(19F, 4F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[19].setRotationPoint(0F, 0F, 0F);
		bodyModel[19].rotateAngleY = 3.53429174F;

		bodyModel[20].addShapeBox(19F, 4F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[20].setRotationPoint(0F, 0F, 0F);
		bodyModel[20].rotateAngleY = 4.3196899F;

		bodyModel[21].addShapeBox(19F, 4F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[21].setRotationPoint(0F, 0F, 0F);
		bodyModel[21].rotateAngleY = 4.71238898F;

		bodyModel[22].addShapeBox(19F, 4F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[22].setRotationPoint(0F, 0F, 0F);
		bodyModel[22].rotateAngleY = 5.10508806F;

		bodyModel[23].addShapeBox(19F, 4F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[23].setRotationPoint(0F, 0F, 0F);
		bodyModel[23].rotateAngleY = 5.49778714F;

		bodyModel[24].addShapeBox(19F, 4F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[24].setRotationPoint(0F, 0F, 0F);
		bodyModel[24].rotateAngleY = 5.89048623F;


		bodyDoorOpenModel = new ModelRendererTurbo[1];
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 321, 78, textureX, textureY); // Box 156

		bodyDoorOpenModel[0].addShapeBox(-3F, 5.2F, -19.1F, 190, 190, 1, 0F, 0F, 0F, 0F, -187F, 0F, 0F, -187F, 0F, 0F, 0F, 0F, 0F, 0F, -187F, 0F, -187F, -187F, 0F, -187F, -187F, 0F, 0F, -187F, 0F); // Box 156
		bodyDoorOpenModel[0].setRotationPoint(0F, 0F, 0F);
		bodyDoorOpenModel[0].rotateAngleY = -3.14159265F;


		turretModel = new ModelRendererTurbo[64];
		turretModel[0] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 73
		turretModel[1] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 74
		turretModel[2] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 75
		turretModel[3] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 76
		turretModel[4] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 77
		turretModel[5] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 78
		turretModel[6] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 79
		turretModel[7] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 80
		turretModel[8] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 81
		turretModel[9] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 82
		turretModel[10] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 83
		turretModel[11] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 85
		turretModel[12] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 86
		turretModel[13] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 87
		turretModel[14] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 88
		turretModel[15] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 89
		turretModel[16] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 91
		turretModel[17] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 92
		turretModel[18] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 93
		turretModel[19] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 86
		turretModel[20] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 87
		turretModel[21] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 88
		turretModel[22] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 89
		turretModel[23] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 90
		turretModel[24] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 91
		turretModel[25] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 92
		turretModel[26] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 93
		turretModel[27] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 94
		turretModel[28] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 95
		turretModel[29] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 96
		turretModel[30] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 97
		turretModel[31] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 98
		turretModel[32] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 99
		turretModel[33] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 100
		turretModel[34] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 101
		turretModel[35] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 102
		turretModel[36] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 103
		turretModel[37] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 104
		turretModel[38] = new ModelRendererTurbo(this, 135, 127, textureX, textureY); // Box 105
		turretModel[39] = new ModelRendererTurbo(this, 135, 127, textureX, textureY); // Box 106
		turretModel[40] = new ModelRendererTurbo(this, 135, 127, textureX, textureY); // Box 107
		turretModel[41] = new ModelRendererTurbo(this, 135, 127, textureX, textureY); // Box 108
		turretModel[42] = new ModelRendererTurbo(this, 0, 179, textureX, textureY); // Box 144
		turretModel[43] = new ModelRendererTurbo(this, 0, 179, textureX, textureY); // Box 145
		turretModel[44] = new ModelRendererTurbo(this, 27, 167, textureX, textureY); // Box 146
		turretModel[45] = new ModelRendererTurbo(this, 30, 175, textureX, textureY); // Box 147
		turretModel[46] = new ModelRendererTurbo(this, 110, 204, textureX, textureY); // Box 148
		turretModel[47] = new ModelRendererTurbo(this, 124, 157, textureX, textureY); // Box 149
		turretModel[48] = new ModelRendererTurbo(this, 124, 179, textureX, textureY); // Box 151
		turretModel[49] = new ModelRendererTurbo(this, 124, 179, textureX, textureY); // Box 152
		turretModel[50] = new ModelRendererTurbo(this, 110, 158, textureX, textureY); // Box 153
		turretModel[51] = new ModelRendererTurbo(this, 110, 158, textureX, textureY); // Box 154
		turretModel[52] = new ModelRendererTurbo(this, 105, 154, textureX, textureY); // Box 155
		turretModel[53] = new ModelRendererTurbo(this, 122, 183, textureX, textureY); // Box 156
		turretModel[54] = new ModelRendererTurbo(this, 122, 183, textureX, textureY); // Box 157
		turretModel[55] = new ModelRendererTurbo(this, 122, 183, textureX, textureY); // Box 159
		turretModel[56] = new ModelRendererTurbo(this, 122, 183, textureX, textureY); // Box 160
		turretModel[57] = new ModelRendererTurbo(this, 122, 183, textureX, textureY); // Box 161
		turretModel[58] = new ModelRendererTurbo(this, 122, 183, textureX, textureY); // Box 162
		turretModel[59] = new ModelRendererTurbo(this, 122, 183, textureX, textureY); // Box 163
		turretModel[60] = new ModelRendererTurbo(this, 122, 183, textureX, textureY); // Box 164
		turretModel[61] = new ModelRendererTurbo(this, 122, 183, textureX, textureY); // Box 165
		turretModel[62] = new ModelRendererTurbo(this, 122, 183, textureX, textureY); // Box 166
		turretModel[63] = new ModelRendererTurbo(this, 122, 183, textureX, textureY); // Box 167

		turretModel[0].addShapeBox(-6F, -5F, -23F, 12, 5, 46, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		turretModel[0].setRotationPoint(0F, 1F, 0F);

		turretModel[1].addShapeBox(6F, -5F, -23F, 11, 5, 46, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 74
		turretModel[1].setRotationPoint(0F, 1F, 0F);

		turretModel[2].addShapeBox(17F, -5F, -17F, 6, 5, 34, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 75
		turretModel[2].setRotationPoint(0F, 1F, 0F);

		turretModel[3].addShapeBox(-17F, -5F, -23F, 11, 5, 46, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 76
		turretModel[3].setRotationPoint(0F, 1F, 0F);

		turretModel[4].addShapeBox(-26F, -5F, -18F, 9, 5, 36, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F); // Box 77
		turretModel[4].setRotationPoint(0F, 1F, 0F);

		turretModel[5].addShapeBox(-6F, -17F, -23F, 12, 12, 46, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		turretModel[5].setRotationPoint(0F, 1F, 0F);

		turretModel[6].addShapeBox(6F, -17F, -23F, 11, 12, 46, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 79
		turretModel[6].setRotationPoint(0F, 1F, 0F);

		turretModel[7].addShapeBox(17F, -17F, 5F, 6, 12, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 80
		turretModel[7].setRotationPoint(0F, 1F, 0F);

		turretModel[8].addShapeBox(-17F, -17F, -23F, 11, 12, 46, 0F, 0F, 0F, -5.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 81
		turretModel[8].setRotationPoint(0F, 1F, 0F);

		turretModel[9].addShapeBox(-26F, -17F, -18F, 9, 12, 36, 0F, -1F, 0F, -12F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F); // Box 82
		turretModel[9].setRotationPoint(0F, 1F, 0F);

		turretModel[10].addShapeBox(17F, -17F, -17F, 6, 12, 12, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		turretModel[10].setRotationPoint(0F, 1F, 0F);

		turretModel[11].addShapeBox(-6F, -27F, -23F, 6, 10, 46, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		turretModel[11].setRotationPoint(0F, 1F, 0F);

		turretModel[12].addShapeBox(-17F, -27F, -23F, 11, 10, 46, 0F, -1F, 0F, -7.5F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -7.5F, 0F, 0F, -5.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.3F); // Box 86
		turretModel[12].setRotationPoint(0F, 1F, 0F);

		turretModel[13].addShapeBox(-26F, -27F, -18F, 9, 10, 36, 0F, -3F, 0F, -13F, 1F, 0F, -2.5F, 1F, 0F, -2.5F, -3F, 0F, -13F, -1F, 0F, -12F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -12F); // Box 87
		turretModel[13].setRotationPoint(0F, 1F, 0F);

		turretModel[14].addShapeBox(-6F, -30F, -21F, 6, 3, 42, 0F, -1F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -1F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 88
		turretModel[14].setRotationPoint(0F, 1F, 0F);

		turretModel[15].addShapeBox(-17F, -30F, -21F, 11, 3, 42, 0F, -4F, 0F, -8F, 1F, 0F, -3.5F, 1F, 0F, -3.5F, -4F, 0F, -8F, -1F, 0F, -5.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -5.5F); // Box 89
		turretModel[15].setRotationPoint(0F, 1F, 0F);

		turretModel[16].addShapeBox(-23F, -30F, -15F, 7, 3, 30, 0F, -3.5F, 0F, -11F, 3F, 0F, -2F, 3F, 0F, -2F, -3.5F, 0F, -11F, 0F, 0F, -10F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -10F); // Box 91
		turretModel[16].setRotationPoint(0F, 1F, 0F);

		turretModel[17].addShapeBox(-5F, -33F, -17F, 5, 3, 34, 0F, -2F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 92
		turretModel[17].setRotationPoint(0F, 1F, 0F);

		turretModel[18].addShapeBox(-13F, -33F, -17F, 8, 3, 34, 0F, -5F, 0F, -8.5F, 2F, 0F, -6F, 2F, 0F, -6F, -5F, 0F, -8.5F, 0F, 0F, -4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4F); // Box 93
		turretModel[18].setRotationPoint(0F, 1F, 0F);

		turretModel[19].addShapeBox(-19F, -33F, -13F, 6, 3, 26, 0F, -7F, 0F, -10F, 5F, 0F, -4.5F, 5F, 0F, -4.5F, -7F, 0F, -10F, 0.5F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -9F); // Box 86
		turretModel[19].setRotationPoint(0F, 1F, 0F);

		turretModel[20].addShapeBox(0F, -33F, -17F, 5, 3, 12, 0F, 0F, 0F, -6F, -2F, 0F, -6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		turretModel[20].setRotationPoint(0F, 1F, 0F);

		turretModel[21].addShapeBox(0F, -30F, -21F, 6, 3, 16, 0F, 0F, 0F, -3.5F, -1F, 0F, -3.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		turretModel[21].setRotationPoint(0F, 1F, 0F);

		turretModel[22].addShapeBox(0F, -27F, -23F, 6, 10, 18, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		turretModel[22].setRotationPoint(0F, 1F, 0F);

		turretModel[23].addShapeBox(0F, -33F, 5F, 5, 3, 12, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 90
		turretModel[23].setRotationPoint(0F, 1F, 0F);

		turretModel[24].addShapeBox(0F, -30F, 5F, 6, 3, 16, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 91
		turretModel[24].setRotationPoint(0F, 1F, 0F);

		turretModel[25].addShapeBox(0F, -27F, 5F, 6, 10, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		turretModel[25].setRotationPoint(0F, 1F, 0F);

		turretModel[26].addShapeBox(6F, -27F, -23F, 11, 10, 18, 0F, 0F, 0F, -3F, -2F, 0F, -8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		turretModel[26].setRotationPoint(0F, 1F, 0F);

		turretModel[27].addShapeBox(6F, -31F, -23F, 9, 3, 18, 0F, 1F, 0F, -5.5F, -3F, 0F, -10F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		turretModel[27].setRotationPoint(0F, 2F, 0F);

		turretModel[28].addShapeBox(5F, -34F, -17F, 8, 3, 12, 0F, 2F, 0F, -6F, -5F, 0F, -9F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 95
		turretModel[28].setRotationPoint(0F, 2F, 0F);

		turretModel[29].addShapeBox(6F, -31F, 5F, 9, 3, 18, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -10F, 1F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -3F); // Box 96
		turretModel[29].setRotationPoint(0F, 2F, 0F);

		turretModel[30].addShapeBox(5F, -34F, 5F, 8, 3, 12, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, -9F, 2F, 0F, -6F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -4F, 0F, 0F, 0.5F); // Box 97
		turretModel[30].setRotationPoint(0F, 2F, 0F);

		turretModel[31].addShapeBox(6F, -27F, 5F, 11, 10, 18, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 98
		turretModel[31].setRotationPoint(0F, 1F, 0F);

		turretModel[32].addShapeBox(17F, -27F, -17F, 6, 10, 12, 0F, 2F, 0F, -2F, -3.5F, 0F, -11F, -3.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		turretModel[32].setRotationPoint(0F, 1F, 0F);

		turretModel[33].addShapeBox(15F, -30F, -17F, 6, 3, 12, 0F, 3F, 0F, -4F, -4F, 0F, -11.9F, -4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -2F, -1.5F, 0F, -11F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 100
		turretModel[33].setRotationPoint(0F, 1F, 0F);

		turretModel[34].addShapeBox(12F, -33F, -13F, 5, 3, 8, 0F, 4F, 0F, -5F, -7F, 0F, -7.9F, -7F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		turretModel[34].setRotationPoint(0F, 1F, 0F);

		turretModel[35].addShapeBox(17F, -27F, 5F, 6, 10, 12, 0F, 2F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -11F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 102
		turretModel[35].setRotationPoint(0F, 1F, 0F);

		turretModel[36].addShapeBox(15F, -30F, 5F, 6, 3, 12, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -11.9F, 3F, 0F, -4F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -11F, 0F, 0F, -2F); // Box 103
		turretModel[36].setRotationPoint(0F, 1F, 0F);

		turretModel[37].addShapeBox(12F, -33F, 5F, 5, 3, 8, 0F, 2F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -7.9F, 4F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.9F, 0F, 0F, 0F); // Box 104
		turretModel[37].setRotationPoint(0F, 1F, 0F);

		turretModel[38].addShapeBox(10F, -18.5F, 2F, 10, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		turretModel[38].setRotationPoint(0F, 0F, -4F);
		turretModel[38].rotateAngleZ = -0.66322512F;

		turretModel[39].addShapeBox(20F, -18.5F, 2F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 106
		turretModel[39].setRotationPoint(0F, 0F, -4F);
		turretModel[39].rotateAngleZ = -0.66322512F;

		turretModel[40].addShapeBox(10F, -18.5F, 0F, 13, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		turretModel[40].setRotationPoint(0F, 0F, -4F);
		turretModel[40].rotateAngleZ = -0.66322512F;

		turretModel[41].addShapeBox(10F, -18.5F, 7F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 108
		turretModel[41].setRotationPoint(0F, 0F, -4F);
		turretModel[41].rotateAngleZ = -0.66322512F;

		turretModel[42].addShapeBox(0F, -33F, -5F, 2, 16, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.99F, 0F, 0F, 0F, 0F, 0F); // Box 144
		turretModel[42].setRotationPoint(0F, 1F, 0F);

		turretModel[43].addShapeBox(0F, -33F, 3F, 2, 16, 2, 0F, 0F, 0F, 0F, -1.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		turretModel[43].setRotationPoint(0F, 1F, 0F);

		turretModel[44].addShapeBox(17F, -7F, -5F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, 0F, 0F, -1.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		turretModel[44].setRotationPoint(0F, 1F, 0F);

		turretModel[45].addShapeBox(17F, -7F, 3F, 6, 2, 2, 0F, 0F, -1.9F, 0F, 0F, -1.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		turretModel[45].setRotationPoint(0F, 1F, 0F);

		turretModel[46].addShapeBox(23F, -3F, -5F, 1, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		turretModel[46].setRotationPoint(0F, 0F, 0F);

		turretModel[47].addShapeBox(-28F, -17F, -7F, 5, 6, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		turretModel[47].setRotationPoint(0F, 1F, 0F);

		turretModel[48].addShapeBox(-28F, -21F, -7F, 5, 4, 14, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		turretModel[48].setRotationPoint(0F, 1F, 0F);

		turretModel[49].addShapeBox(-28F, -11F, -7F, 5, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 152
		turretModel[49].setRotationPoint(0F, 1F, 0F);

		turretModel[50].addShapeBox(-28F, -26F, -3.5F, 6, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		turretModel[50].setRotationPoint(0F, 1F, 0F);

		turretModel[51].addShapeBox(-28F, -28F, -3.5F, 6, 2, 7, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		turretModel[51].setRotationPoint(0F, 1F, 0F);

		turretModel[52].addShapeBox(-29F, -27F, -2F, 1, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		turretModel[52].setRotationPoint(0F, 1F, 0F);

		turretModel[53].addShapeBox(-30F, -15F, -3F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -5F, 0F, -0.2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -5F, 0F, -0.2F, -5F); // Box 156
		turretModel[53].setRotationPoint(0F, 1F, 0F);

		turretModel[54].addShapeBox(-30F, -17F, -3F, 1, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2.2F, 0F, -1F, -2.2F, 0F, -1F, -2.2F, 0F, -1F, -2.2F); // Box 157
		turretModel[54].setRotationPoint(0F, 1F, 0F);

		turretModel[55].addShapeBox(-30F, -17F, -3F, 1, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -3.8F, 0F, -1F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -5F, 0F, 0.2F, -5F); // Box 159
		turretModel[55].setRotationPoint(0F, 1F, 0F);

		turretModel[56].addShapeBox(-30F, -13F, -3F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -5F, 0F, 0.2F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -3.8F, 0F, -1F, -3.8F); // Box 160
		turretModel[56].setRotationPoint(0F, 1F, 0F);

		turretModel[57].addShapeBox(-30F, -13F, -3F, 1, 2, 6, 0F, 0F, -1F, -2.2F, 0F, -1F, -2.2F, 0F, -1F, -2.2F, 0F, -1F, -2.2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 161
		turretModel[57].setRotationPoint(0F, 1F, 0F);

		turretModel[58].addShapeBox(-30F, -13F, -3F, 1, 2, 6, 0F, 0F, 0.2F, -5F, 0F, 0.2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3.8F, 0F, -1F, -3.8F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 162
		turretModel[58].setRotationPoint(0F, 1F, 0F);

		turretModel[59].addShapeBox(-30F, -15F, -3F, 1, 2, 6, 0F, 0F, -0.2F, -5F, 0F, -0.2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -5F, 0F, -0.2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		turretModel[59].setRotationPoint(0F, 1F, 0F);

		turretModel[60].addShapeBox(-30F, -17F, -3F, 1, 2, 6, 0F, 0F, -1F, -3.8F, 0F, -1F, -3.8F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.2F, -5F, 0F, 0.2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		turretModel[60].setRotationPoint(0F, 1F, 0F);

		turretModel[61].addShapeBox(-30F, -16F, -0.5F, 1, 4, 1, 0F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F); // Box 165
		turretModel[61].setRotationPoint(0F, 1F, 0F);

		turretModel[62].addShapeBox(-30F, -14.5F, -2F, 1, 1, 4, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F); // Box 166
		turretModel[62].setRotationPoint(0F, 1F, 0F);

		turretModel[63].addShapeBox(-30F, -14.5F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		turretModel[63].setRotationPoint(0F, 1F, 0F);


		barrelModel = new ModelRendererTurbo[68];
		barrelModel[0] = new ModelRendererTurbo(this, 134, 93, textureX, textureY); // Box 0
		barrelModel[1] = new ModelRendererTurbo(this, 134, 93, textureX, textureY); // Box 1
		barrelModel[2] = new ModelRendererTurbo(this, 134, 93, textureX, textureY); // Box 2
		barrelModel[3] = new ModelRendererTurbo(this, 105, 96, textureX, textureY); // Box 3
		barrelModel[4] = new ModelRendererTurbo(this, 105, 96, textureX, textureY); // Box 4
		barrelModel[5] = new ModelRendererTurbo(this, 105, 96, textureX, textureY); // Box 5
		barrelModel[6] = new ModelRendererTurbo(this, 105, 96, textureX, textureY); // Box 6
		barrelModel[7] = new ModelRendererTurbo(this, 105, 96, textureX, textureY); // Box 7
		barrelModel[8] = new ModelRendererTurbo(this, 105, 96, textureX, textureY); // Box 8
		barrelModel[9] = new ModelRendererTurbo(this, 105, 96, textureX, textureY); // Box 9
		barrelModel[10] = new ModelRendererTurbo(this, 105, 96, textureX, textureY); // Box 10
		barrelModel[11] = new ModelRendererTurbo(this, 105, 96, textureX, textureY); // Box 11
		barrelModel[12] = new ModelRendererTurbo(this, 105, 96, textureX, textureY); // Box 15
		barrelModel[13] = new ModelRendererTurbo(this, 105, 96, textureX, textureY); // Box 16
		barrelModel[14] = new ModelRendererTurbo(this, 105, 96, textureX, textureY); // Box 18
		barrelModel[15] = new ModelRendererTurbo(this, 105, 96, textureX, textureY); // Box 19
		barrelModel[16] = new ModelRendererTurbo(this, 105, 96, textureX, textureY); // Box 20
		barrelModel[17] = new ModelRendererTurbo(this, 105, 96, textureX, textureY); // Box 21
		barrelModel[18] = new ModelRendererTurbo(this, 21, 99, textureX, textureY); // Box 23
		barrelModel[19] = new ModelRendererTurbo(this, 21, 99, textureX, textureY); // Box 25
		barrelModel[20] = new ModelRendererTurbo(this, 9, 93, textureX, textureY); // Box 26
		barrelModel[21] = new ModelRendererTurbo(this, 9, 93, textureX, textureY); // Box 27
		barrelModel[22] = new ModelRendererTurbo(this, 9, 93, textureX, textureY); // Box 28
		barrelModel[23] = new ModelRendererTurbo(this, 0, 91, textureX, textureY); // Box 30
		barrelModel[24] = new ModelRendererTurbo(this, 0, 91, textureX, textureY); // Box 32
		barrelModel[25] = new ModelRendererTurbo(this, 0, 91, textureX, textureY); // Box 33
		barrelModel[26] = new ModelRendererTurbo(this, 0, 99, textureX, textureY); // Box 27
		barrelModel[27] = new ModelRendererTurbo(this, 0, 99, textureX, textureY); // Box 28
		barrelModel[28] = new ModelRendererTurbo(this, 0, 99, textureX, textureY); // Box 30
		barrelModel[29] = new ModelRendererTurbo(this, 0, 99, textureX, textureY); // Box 31
		barrelModel[30] = new ModelRendererTurbo(this, 0, 99, textureX, textureY); // Box 32
		barrelModel[31] = new ModelRendererTurbo(this, 0, 99, textureX, textureY); // Box 33
		barrelModel[32] = new ModelRendererTurbo(this, 0, 99, textureX, textureY); // Box 34
		barrelModel[33] = new ModelRendererTurbo(this, 0, 99, textureX, textureY); // Box 36
		barrelModel[34] = new ModelRendererTurbo(this, 134, 113, textureX, textureY); // Box 37
		barrelModel[35] = new ModelRendererTurbo(this, 134, 113, textureX, textureY); // Box 36
		barrelModel[36] = new ModelRendererTurbo(this, 134, 113, textureX, textureY); // Box 37
		barrelModel[37] = new ModelRendererTurbo(this, 134, 113, textureX, textureY); // Box 38
		barrelModel[38] = new ModelRendererTurbo(this, 134, 113, textureX, textureY); // Box 39
		barrelModel[39] = new ModelRendererTurbo(this, 134, 113, textureX, textureY); // Box 40
		barrelModel[40] = new ModelRendererTurbo(this, 134, 113, textureX, textureY); // Box 41
		barrelModel[41] = new ModelRendererTurbo(this, 134, 113, textureX, textureY); // Box 42
		barrelModel[42] = new ModelRendererTurbo(this, 134, 113, textureX, textureY); // Box 43
		barrelModel[43] = new ModelRendererTurbo(this, 0, 131, textureX, textureY); // Box 44
		barrelModel[44] = new ModelRendererTurbo(this, 0, 131, textureX, textureY); // Box 47
		barrelModel[45] = new ModelRendererTurbo(this, 0, 131, textureX, textureY); // Box 48
		barrelModel[46] = new ModelRendererTurbo(this, 0, 131, textureX, textureY); // Box 49
		barrelModel[47] = new ModelRendererTurbo(this, 0, 131, textureX, textureY); // Box 50
		barrelModel[48] = new ModelRendererTurbo(this, 0, 118, textureX, textureY); // Box 51
		barrelModel[49] = new ModelRendererTurbo(this, 0, 118, textureX, textureY); // Box 52
		barrelModel[50] = new ModelRendererTurbo(this, 0, 118, textureX, textureY); // Box 53
		barrelModel[51] = new ModelRendererTurbo(this, 0, 118, textureX, textureY); // Box 56
		barrelModel[52] = new ModelRendererTurbo(this, 0, 118, textureX, textureY); // Box 58
		barrelModel[53] = new ModelRendererTurbo(this, 0, 118, textureX, textureY); // Box 59
		barrelModel[54] = new ModelRendererTurbo(this, 0, 118, textureX, textureY); // Box 60
		barrelModel[55] = new ModelRendererTurbo(this, 0, 118, textureX, textureY); // Box 61
		barrelModel[56] = new ModelRendererTurbo(this, 125, 88, textureX, textureY); // Box 64
		barrelModel[57] = new ModelRendererTurbo(this, 125, 88, textureX, textureY); // Box 65
		barrelModel[58] = new ModelRendererTurbo(this, 139, 103, textureX, textureY); // Box 67
		barrelModel[59] = new ModelRendererTurbo(this, 125, 88, textureX, textureY); // Box 68
		barrelModel[60] = new ModelRendererTurbo(this, 125, 88, textureX, textureY); // Box 69
		barrelModel[61] = new ModelRendererTurbo(this, 160, 119, textureX, textureY); // Box 70
		barrelModel[62] = new ModelRendererTurbo(this, 160, 119, textureX, textureY); // Box 71
		barrelModel[63] = new ModelRendererTurbo(this, 160, 119, textureX, textureY); // Box 72
		barrelModel[64] = new ModelRendererTurbo(this, 0, 118, textureX, textureY); // Box 156
		barrelModel[65] = new ModelRendererTurbo(this, 0, 118, textureX, textureY); // Box 157
		barrelModel[66] = new ModelRendererTurbo(this, 21, 99, textureX, textureY); // Box 158
		barrelModel[67] = new ModelRendererTurbo(this, 0, 131, textureX, textureY); // Box 157

		barrelModel[0].addShapeBox(16F, -3.5F, -3F, 14, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		barrelModel[0].setRotationPoint(3F, -13F, 0F);

		barrelModel[1].addShapeBox(16F, -5.5F, -3F, 14, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		barrelModel[1].setRotationPoint(3F, -13F, 0F);

		barrelModel[2].addShapeBox(16F, -1.5F, -3F, 14, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 2
		barrelModel[2].setRotationPoint(3F, -13F, 0F);

		barrelModel[3].addShapeBox(31F, -4.5F, -2F, 7, 1, 4, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 3
		barrelModel[3].setRotationPoint(3F, -13F, 0F);

		barrelModel[4].addShapeBox(31F, -3.5F, -2F, 7, 2, 4, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 4
		barrelModel[4].setRotationPoint(3F, -13F, 0F);

		barrelModel[5].addShapeBox(31F, -1.5F, -2F, 7, 1, 4, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F); // Box 5
		barrelModel[5].setRotationPoint(3F, -13F, 0F);

		barrelModel[6].addShapeBox(42F, -4.5F, -2F, 1, 1, 4, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 6
		barrelModel[6].setRotationPoint(3F, -13F, 0F);

		barrelModel[7].addShapeBox(42F, -3.5F, -2F, 1, 2, 4, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 7
		barrelModel[7].setRotationPoint(3F, -13F, 0F);

		barrelModel[8].addShapeBox(42F, -1.5F, -2F, 1, 1, 4, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F); // Box 8
		barrelModel[8].setRotationPoint(3F, -13F, 0F);

		barrelModel[9].addShapeBox(39F, -5F, -2.5F, 2, 1, 5, 0F, -0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F); // Box 9
		barrelModel[9].setRotationPoint(3F, -13F, 0F);

		barrelModel[10].addShapeBox(39F, -3.5F, -2.5F, 2, 2, 5, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 10
		barrelModel[10].setRotationPoint(3F, -13F, 0F);

		barrelModel[11].addShapeBox(39F, -1F, -2.5F, 2, 1, 5, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F); // Box 11
		barrelModel[11].setRotationPoint(3F, -13F, 0F);

		barrelModel[12].addShapeBox(38F, -4.5F, -2F, 1, 1, 4, 0F, 0F, 0F, -1.2F, 0.3F, 0.5F, -1F, 0.3F, 0.5F, -1F, 0F, 0F, -1.2F, 0F, 0.2F, 0F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0F, 0.2F, 0F); // Box 15
		barrelModel[12].setRotationPoint(3F, -13F, 0F);

		barrelModel[13].addShapeBox(38F, -3.5F, -2F, 1, 2, 4, 0F, 0F, -0.2F, 0F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0F, -0.2F, 0F); // Box 16
		barrelModel[13].setRotationPoint(3F, -13F, 0F);

		barrelModel[14].addShapeBox(38F, -1.5F, -2F, 1, 1, 4, 0F, 0F, 0.2F, 0F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0F, 0.2F, 0F, 0F, 0F, -1.2F, 0.3F, 0.5F, -1F, 0.3F, 0.5F, -1F, 0F, 0F, -1.2F); // Box 18
		barrelModel[14].setRotationPoint(3F, -13F, 0F);

		barrelModel[15].addShapeBox(41F, -4.5F, -2F, 1, 1, 4, 0F, 0.3F, 0.5F, -1F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0.3F, 0.5F, -1F, 0.3F, 0F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.3F, 0F, 0.5F); // Box 19
		barrelModel[15].setRotationPoint(3F, -13F, 0F);

		barrelModel[16].addShapeBox(41F, -3.5F, -2F, 1, 2, 4, 0F, 0.3F, 0F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.3F, 0F, 0.5F); // Box 20
		barrelModel[16].setRotationPoint(3F, -13F, 0F);

		barrelModel[17].addShapeBox(41F, -1.5F, -2F, 1, 1, 4, 0F, 0.3F, 0F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.3F, 0F, 0.5F, 0.3F, 0.5F, -1F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0.3F, 0.5F, -1F); // Box 21
		barrelModel[17].setRotationPoint(3F, -13F, 0F);

		barrelModel[18].addShapeBox(43F, -3F, -1.5F, 38, 1, 3, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, 0F, 0F); // Box 23
		barrelModel[18].setRotationPoint(3F, -13F, 0F);

		barrelModel[19].addShapeBox(43F, -2F, -1.5F, 38, 1, 3, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, -0.3F, -1.05F, 0F, -0.3F, -1.05F, 0F, 0F, -0.9F); // Box 25
		barrelModel[19].setRotationPoint(3F, -13F, 0F);

		barrelModel[20].addShapeBox(81F, -4F, -1.5F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		barrelModel[20].setRotationPoint(3F, -13F, 0F);

		barrelModel[21].addShapeBox(81F, -3F, -1.5F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		barrelModel[21].setRotationPoint(3F, -13F, 0F);

		barrelModel[22].addShapeBox(81F, -2F, -1.5F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 28
		barrelModel[22].setRotationPoint(3F, -13F, 0F);

		barrelModel[23].addShapeBox(82F, -3F, -1.5F, 2, 1, 3, 0F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 30
		barrelModel[23].setRotationPoint(3F, -13F, 0F);

		barrelModel[24].addShapeBox(82F, -4F, -1.5F, 2, 1, 3, 0F, 0F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 32
		barrelModel[24].setRotationPoint(3F, -13F, 0F);

		barrelModel[25].addShapeBox(82F, -2F, -1.5F, 2, 1, 3, 0F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0.2F, -0.9F); // Box 33
		barrelModel[25].setRotationPoint(3F, -13F, 0F);

		barrelModel[26].addShapeBox(84F, -4F, -1.5F, 5, 1, 3, 0F, 0F, -0.4F, -1.9F, 0F, -0.4F, -1.9F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.1F, -2.6F, 0F, 0.1F, -2.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		barrelModel[26].setRotationPoint(3F, -13F, 0F);

		barrelModel[27].addShapeBox(84F, -3F, -1.5F, 5, 1, 3, 0F, 0F, -0.1F, -2.6F, 0F, -0.1F, -2.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -2.6F, 0F, -0.1F, -2.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		barrelModel[27].setRotationPoint(3F, -13F, 0F);

		barrelModel[28].addShapeBox(84F, -4F, -1.5F, 5, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.6F, -1.1F, 0F, -0.6F, -1.1F, 0F, -0.6F, -1.1F, 0F, -0.6F, -1.1F); // Box 30
		barrelModel[28].setRotationPoint(3F, -13F, 0F);

		barrelModel[29].addShapeBox(84F, -2F, -1.5F, 5, 1, 3, 0F, 0F, 0.1F, -2.6F, 0F, 0.1F, -2.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.9F, 0F, -0.4F, -1.9F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 31
		barrelModel[29].setRotationPoint(3F, -13F, 0F);

		barrelModel[30].addShapeBox(84F, -2F, -1.5F, 5, 1, 3, 0F, 0F, -0.6F, -1.1F, 0F, -0.6F, -1.1F, 0F, -0.6F, -1.1F, 0F, -0.6F, -1.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 32
		barrelModel[30].setRotationPoint(3F, -13F, 0F);

		barrelModel[31].addShapeBox(84F, -2F, -1.5F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -2.6F, 0F, 0.1F, -2.6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.4F, -1.9F, 0F, -0.4F, -1.9F); // Box 33
		barrelModel[31].setRotationPoint(3F, -13F, 0F);

		barrelModel[32].addShapeBox(84F, -3F, -1.5F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -2.6F, 0F, -0.1F, -2.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -2.6F, 0F, -0.1F, -2.6F); // Box 34
		barrelModel[32].setRotationPoint(3F, -13F, 0F);

		barrelModel[33].addShapeBox(84F, -4F, -1.5F, 5, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.4F, -1.9F, 0F, -0.4F, -1.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -2.6F, 0F, 0.1F, -2.6F); // Box 36
		barrelModel[33].setRotationPoint(3F, -13F, 0F);

		barrelModel[34].addShapeBox(16F, 1F, -1.5F, 15, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		barrelModel[34].setRotationPoint(3F, -13F, 0F);

		barrelModel[35].addShapeBox(31F, 1F, -1.5F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 36
		barrelModel[35].setRotationPoint(3F, -13F, 0F);

		barrelModel[36].addShapeBox(35F, 3F, -1.5F, 4, 1, 3, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 3F, 0F, -2F, 3F, 0F, 0F, 0F, 0F); // Box 37
		barrelModel[36].setRotationPoint(3F, -13F, 0F);

		barrelModel[37].addShapeBox(16F, 1F, 1.5F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F); // Box 38
		barrelModel[37].setRotationPoint(3F, -13F, 0F);

		barrelModel[38].addShapeBox(31F, 1F, 1.5F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, -0.5F, 0F, 1F, -0.5F); // Box 39
		barrelModel[38].setRotationPoint(3F, -13F, 0F);

		barrelModel[39].addShapeBox(35F, 3F, 1.5F, 4, 1, 1, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, -0.5F, 0F, 0F, -0.5F, 1F, 1F, 0F, -3F, 4F, 0F, -3F, 4F, -0.5F, 1F, 1F, -0.5F); // Box 40
		barrelModel[39].setRotationPoint(3F, -13F, 0F);

		barrelModel[40].addShapeBox(35F, 3F, -2.5F, 4, 1, 1, 0F, 0F, 0F, -0.5F, -1F, -4F, -0.5F, -1F, -4F, 0F, 0F, 0F, 0F, 1F, 1F, -0.5F, -3F, 4F, -0.5F, -3F, 4F, 0F, 1F, 1F, 0F); // Box 41
		barrelModel[40].setRotationPoint(3F, -13F, 0F);

		barrelModel[41].addShapeBox(31F, 1F, -2.5F, 4, 1, 1, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, -1F, 3F, -0.5F, -1F, 3F, 0F, 0F, 1F, 0F); // Box 42
		barrelModel[41].setRotationPoint(3F, -13F, 0F);

		barrelModel[42].addShapeBox(16F, 1F, -2.5F, 15, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 43
		barrelModel[42].setRotationPoint(3F, -13F, 0F);

		barrelModel[43].addShapeBox(-17F, -4.5F, -4F, 34, 9, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		barrelModel[43].setRotationPoint(3F, -13F, 0F);

		barrelModel[44].addShapeBox(-17F, -16.5F, -4F, 34, 4, 8, 0F, -12.5F, 0F, 0F, -12.5F, 0F, 0F, -12.5F, 0F, 0F, -12.5F, 0F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F); // Box 47
		barrelModel[44].setRotationPoint(3F, -13F, 0F);

		barrelModel[45].addShapeBox(-17F, -12.5F, -4F, 34, 8, 8, 0F, -5F, -0.5F, 0F, -5F, -0.5F, 0F, -5F, -0.5F, 0F, -5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		barrelModel[45].setRotationPoint(3F, -13F, 0F);

		barrelModel[46].addShapeBox(-17F, 4.5F, -4F, 34, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, 0F, -5F, -0.5F, 0F, -5F, -0.5F, 0F, -5F, -0.5F, 0F); // Box 49
		barrelModel[46].setRotationPoint(3F, -13F, 0F);

		barrelModel[47].addShapeBox(-17F, 0.5F, -4F, 34, 4, 8, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, -12.5F, 0F, 0F, -12.5F, 0F, 0F, -12.5F, 0F, 0F, -12.5F, 0F, 0F); // Box 50
		barrelModel[47].setRotationPoint(3F, -1F, 0F);

		barrelModel[48].addShapeBox(-17F, -17.5F, -5F, 34, 5, 1, 0F, -12.5F, 0F, 0F, -12.5F, 0F, 0F, -12.5F, 0F, 0F, -12.5F, 0F, 0F, -4.2F, 0F, 0F, -4.2F, 0F, 0F, -4.2F, 0F, 0F, -4.2F, 0F, 0F); // Box 51
		barrelModel[48].setRotationPoint(3F, -13F, 0F);

		barrelModel[49].addShapeBox(-17F, -12.5F, -5F, 34, 8, 1, 0F, -4.2F, 0F, 0F, -4.2F, 0F, 0F, -4.2F, 0F, 0F, -4.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 52
		barrelModel[49].setRotationPoint(3F, -13F, 0F);

		barrelModel[50].addShapeBox(-18F, -4.5F, -5F, 36, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		barrelModel[50].setRotationPoint(3F, -13F, 0F);

		barrelModel[51].addShapeBox(-17F, 4.5F, -5F, 34, 8, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -4.2F, 0F, 0F, -4.2F, 0F, 0F, -4.2F, 0F, 0F, -4.2F, 0F, 0F); // Box 56
		barrelModel[51].setRotationPoint(3F, -13F, 0F);

		barrelModel[52].addShapeBox(-17F, 12.5F, -5F, 34, 5, 1, 0F, -4.2F, 0F, 0F, -4.2F, 0F, 0F, -4.2F, 0F, 0F, -4.2F, 0F, 0F, -12.5F, 0F, 0F, -12.5F, 0F, 0F, -12.5F, 0F, 0F, -12.5F, 0F, 0F); // Box 58
		barrelModel[52].setRotationPoint(3F, -13F, 0F);

		barrelModel[53].addShapeBox(-17F, -17.5F, 4F, 34, 5, 1, 0F, -12.5F, 0F, 0F, -12.5F, 0F, 0F, -12.5F, 0F, 0F, -12.5F, 0F, 0F, -4F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, 0.5F, 0F); // Box 59
		barrelModel[53].setRotationPoint(3F, -13F, 0F);

		barrelModel[54].addShapeBox(-17F, -12.5F, 4F, 34, 8, 1, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 60
		barrelModel[54].setRotationPoint(3F, -13F, 0F);

		barrelModel[55].addShapeBox(-18F, -4.5F, 4F, 36, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		barrelModel[55].setRotationPoint(3F, -13F, 0F);

		barrelModel[56].addShapeBox(30F, -5.5F, -3F, 1, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		barrelModel[56].setRotationPoint(3F, -13F, 0F);

		barrelModel[57].addShapeBox(30F, -3.5F, -3F, 1, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		barrelModel[57].setRotationPoint(3F, -13F, 0F);

		barrelModel[58].addShapeBox(30F, 0.5F, -3F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 67
		barrelModel[58].setRotationPoint(3F, -13F, 0F);

		barrelModel[59].addShapeBox(32F, -5.5F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		barrelModel[59].setRotationPoint(3F, -13F, 0F);

		barrelModel[60].addShapeBox(30F, -6.5F, -0.5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		barrelModel[60].setRotationPoint(3F, -13F, 0F);

		barrelModel[61].addShapeBox(16F, 2.5F, -1.5F, 2, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		barrelModel[61].setRotationPoint(3F, -13F, 0F);

		barrelModel[62].addShapeBox(16F, 3.5F, -1.5F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		barrelModel[62].setRotationPoint(3F, -13F, 0F);

		barrelModel[63].addShapeBox(16F, 4.5F, -1.5F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 72
		barrelModel[63].setRotationPoint(3F, -13F, 0F);

		barrelModel[64].addShapeBox(-17F, 4.5F, 4F, 34, 8, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -4.2F, 0F, 0F, -4.2F, 0F, 0F, -4.2F, 0F, 0F, -4.2F, 0F, 0F); // Box 156
		barrelModel[64].setRotationPoint(3F, -13F, 0F);

		barrelModel[65].addShapeBox(-17F, 12.5F, 4F, 34, 5, 1, 0F, -4.2F, 0F, 0F, -4.2F, 0F, 0F, -4.2F, 0F, 0F, -4.2F, 0F, 0F, -12.5F, 0F, 0F, -12.5F, 0F, 0F, -12.5F, 0F, 0F, -12.5F, 0F, 0F); // Box 157
		barrelModel[65].setRotationPoint(3F, -13F, 0F);

		barrelModel[66].addShapeBox(43F, -4F, -1.5F, 38, 1, 3, 0F, 0F, 0F, -0.9F, 0F, -0.3F, -1.05F, 0F, -0.3F, -1.05F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0F, 0F); // Box 158
		barrelModel[66].setRotationPoint(3F, -13F, 0F);

		barrelModel[67].addShapeBox(-17F, 12.5F, -4F, 34, 4, 8, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, -12.5F, 0F, 0F, -12.5F, 0F, 0F, -12.5F, 0F, 0F, -12.5F, 0F, 0F); // Box 157
		barrelModel[67].setRotationPoint(3F, -13F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}