//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Navalgun_Mk42J_ModN-7
// Model Creator:
// Created on: 05.08.2017 - 05:57:25
// Last changed on: 05.08.2017 - 05:57:25

package com.flansmod.client.model.ez8s; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelMk42J extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelMk42J() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[10];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Box 308
		bodyModel[1] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Box 311
		bodyModel[2] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Box 312
		bodyModel[3] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Box 313
		bodyModel[4] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Box 314
		bodyModel[5] = new ModelRendererTurbo(this, 138, 202, textureX, textureY); // Box 316
		bodyModel[6] = new ModelRendererTurbo(this, 138, 202, textureX, textureY); // Box 318
		bodyModel[7] = new ModelRendererTurbo(this, 138, 202, textureX, textureY); // Box 319
		bodyModel[8] = new ModelRendererTurbo(this, 138, 202, textureX, textureY); // Box 321
		bodyModel[9] = new ModelRendererTurbo(this, 138, 202, textureX, textureY); // Box 322

		bodyModel[0].addShapeBox(-7.5F, 7.5F, -27F, 14, 2, 54, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-27.5F, 7.5F, -27F, 7, 2, 54, 0F, 0F, 0F, -20F, 0.3F, 0F, -7.3F, 0.3F, 0F, -7.3F, 0F, 0F, -20F, 0F, 0F, -20F, 0.3F, 0F, -7.3F, 0.3F, 0F, -7.3F, 0F, 0F, -20F); // Box 311
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-20.5F, 7.5F, -27F, 13, 2, 54, 0F, -0.3F, 0F, -7.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -7.3F, -0.3F, 0F, -7.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -7.3F); // Box 312
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(6.5F, 7.5F, -27F, 13, 2, 54, 0F, 0F, 0F, 0F, -0.3F, 0F, -7.3F, -0.3F, 0F, -7.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -7.3F, -0.3F, 0F, -7.3F, 0F, 0F, 0F); // Box 313
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(19.5F, 7.5F, -27F, 7, 2, 54, 0F, 0.3F, 0F, -7.3F, 0F, 0F, -20F, 0F, 0F, -20F, 0.3F, 0F, -7.3F, 0.3F, 0F, -7.3F, 0F, 0F, -20F, 0F, 0F, -20F, 0.3F, 0F, -7.3F); // Box 314
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-7F, 4.5F, -25.5F, 13, 3, 51, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-20F, 4.5F, -25.5F, 13, 3, 51, 0F, -0.2F, 0F, -7.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -7.2F, -0.2F, 0F, -7.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -7.2F); // Box 318
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-26F, 4.5F, -25.5F, 6, 3, 51, 0F, 0F, 0F, -19F, 0.2F, 0F, -7.2F, 0.2F, 0F, -7.2F, 0F, 0F, -19F, 0F, 0F, -19F, 0.2F, 0F, -7.2F, 0.2F, 0F, -7.2F, 0F, 0F, -19F); // Box 319
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(6F, 4.5F, -25.5F, 13, 3, 51, 0F, 0F, 0F, 0F, -0.2F, 0F, -7.2F, -0.2F, 0F, -7.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -7.2F, -0.2F, 0F, -7.2F, 0F, 0F, 0F); // Box 321
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(19F, 4.5F, -25.5F, 6, 3, 51, 0F, 0.2F, 0F, -7.2F, 0F, 0F, -19F, 0F, 0F, -19F, 0.2F, 0F, -7.2F, 0.2F, 0F, -7.2F, 0F, 0F, -19F, 0F, 0F, -19F, 0.2F, 0F, -7.2F); // Box 322
		bodyModel[9].setRotationPoint(0F, 0F, 0F);


		turretModel = new ModelRendererTurbo[243];
		turretModel[0] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 51
		turretModel[1] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 52
		turretModel[2] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 53
		turretModel[3] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 54
		turretModel[4] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 55
		turretModel[5] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 56
		turretModel[6] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 57
		turretModel[7] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 58
		turretModel[8] = new ModelRendererTurbo(this, 0, 133, textureX, textureY); // Box 59
		turretModel[9] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 60
		turretModel[10] = new ModelRendererTurbo(this, 320, 188, textureX, textureY); // Box 61
		turretModel[11] = new ModelRendererTurbo(this, 320, 188, textureX, textureY); // Box 62
		turretModel[12] = new ModelRendererTurbo(this, 320, 188, textureX, textureY); // Box 64
		turretModel[13] = new ModelRendererTurbo(this, 320, 188, textureX, textureY); // Box 65
		turretModel[14] = new ModelRendererTurbo(this, 320, 188, textureX, textureY); // Box 66
		turretModel[15] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 67
		turretModel[16] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 68
		turretModel[17] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 69
		turretModel[18] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 70
		turretModel[19] = new ModelRendererTurbo(this, 69, 113, textureX, textureY); // Box 71
		turretModel[20] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 72
		turretModel[21] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 73
		turretModel[22] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 74
		turretModel[23] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 75
		turretModel[24] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 76
		turretModel[25] = new ModelRendererTurbo(this, 138, 99, textureX, textureY); // Box 77
		turretModel[26] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 78
		turretModel[27] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 79
		turretModel[28] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 80
		turretModel[29] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 81
		turretModel[30] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 82
		turretModel[31] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 84
		turretModel[32] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 85
		turretModel[33] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 86
		turretModel[34] = new ModelRendererTurbo(this, 208, 97, textureX, textureY); // Box 87
		turretModel[35] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 89
		turretModel[36] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 90
		turretModel[37] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 91
		turretModel[38] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 92
		turretModel[39] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 93
		turretModel[40] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 94
		turretModel[41] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 95
		turretModel[42] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 96
		turretModel[43] = new ModelRendererTurbo(this, 315, 108, textureX, textureY); // Box 97
		turretModel[44] = new ModelRendererTurbo(this, 224, 214, textureX, textureY); // Box 98
		turretModel[45] = new ModelRendererTurbo(this, 224, 214, textureX, textureY); // Box 99
		turretModel[46] = new ModelRendererTurbo(this, 224, 214, textureX, textureY); // Box 100
		turretModel[47] = new ModelRendererTurbo(this, 115, 217, textureX, textureY); // Box 101
		turretModel[48] = new ModelRendererTurbo(this, 115, 217, textureX, textureY); // Box 102
		turretModel[49] = new ModelRendererTurbo(this, 115, 217, textureX, textureY); // Box 103
		turretModel[50] = new ModelRendererTurbo(this, 88, 221, textureX, textureY); // Box 105
		turretModel[51] = new ModelRendererTurbo(this, 115, 217, textureX, textureY); // Box 106
		turretModel[52] = new ModelRendererTurbo(this, 115, 217, textureX, textureY); // Box 107
		turretModel[53] = new ModelRendererTurbo(this, 115, 217, textureX, textureY); // Box 108
		turretModel[54] = new ModelRendererTurbo(this, 115, 217, textureX, textureY); // Box 109
		turretModel[55] = new ModelRendererTurbo(this, 114, 192, textureX, textureY); // Box 110
		turretModel[56] = new ModelRendererTurbo(this, 114, 192, textureX, textureY); // Box 111
		turretModel[57] = new ModelRendererTurbo(this, 114, 192, textureX, textureY); // Box 112
		turretModel[58] = new ModelRendererTurbo(this, 114, 192, textureX, textureY); // Box 113
		turretModel[59] = new ModelRendererTurbo(this, 114, 192, textureX, textureY); // Box 114
		turretModel[60] = new ModelRendererTurbo(this, 114, 192, textureX, textureY); // Box 115
		turretModel[61] = new ModelRendererTurbo(this, 400, 220, textureX, textureY); // Box 116
		turretModel[62] = new ModelRendererTurbo(this, 272, 160, textureX, textureY); // Box 117
		turretModel[63] = new ModelRendererTurbo(this, 0, 154, textureX, textureY); // Box 118
		turretModel[64] = new ModelRendererTurbo(this, 0, 154, textureX, textureY); // Box 119
		turretModel[65] = new ModelRendererTurbo(this, 0, 154, textureX, textureY); // Box 120
		turretModel[66] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 121
		turretModel[67] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 123
		turretModel[68] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 124
		turretModel[69] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 125
		turretModel[70] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 126
		turretModel[71] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 127
		turretModel[72] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 128
		turretModel[73] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 129
		turretModel[74] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 130
		turretModel[75] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 131
		turretModel[76] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 132
		turretModel[77] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 133
		turretModel[78] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 134
		turretModel[79] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 135
		turretModel[80] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 136
		turretModel[81] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 137
		turretModel[82] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 140
		turretModel[83] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 141
		turretModel[84] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 142
		turretModel[85] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 145
		turretModel[86] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 146
		turretModel[87] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 147
		turretModel[88] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 148
		turretModel[89] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 149
		turretModel[90] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 150
		turretModel[91] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 151
		turretModel[92] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 152
		turretModel[93] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 153
		turretModel[94] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 154
		turretModel[95] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 155
		turretModel[96] = new ModelRendererTurbo(this, 0, 154, textureX, textureY); // Box 156
		turretModel[97] = new ModelRendererTurbo(this, 0, 154, textureX, textureY); // Box 157
		turretModel[98] = new ModelRendererTurbo(this, 0, 154, textureX, textureY); // Box 158
		turretModel[99] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 159
		turretModel[100] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 160
		turretModel[101] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 161
		turretModel[102] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 162
		turretModel[103] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 163
		turretModel[104] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 164
		turretModel[105] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 165
		turretModel[106] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 166
		turretModel[107] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 167
		turretModel[108] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 168
		turretModel[109] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 169
		turretModel[110] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 170
		turretModel[111] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 171
		turretModel[112] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 172
		turretModel[113] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 173
		turretModel[114] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 174
		turretModel[115] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 175
		turretModel[116] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 176
		turretModel[117] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 177
		turretModel[118] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 178
		turretModel[119] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 179
		turretModel[120] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 180
		turretModel[121] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 181
		turretModel[122] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 182
		turretModel[123] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 183
		turretModel[124] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 184
		turretModel[125] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 185
		turretModel[126] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 186
		turretModel[127] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 187
		turretModel[128] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 188
		turretModel[129] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 189
		turretModel[130] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 195
		turretModel[131] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 196
		turretModel[132] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 197
		turretModel[133] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 198
		turretModel[134] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 199
		turretModel[135] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 200
		turretModel[136] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 201
		turretModel[137] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 202
		turretModel[138] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 203
		turretModel[139] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 204
		turretModel[140] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 205
		turretModel[141] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 206
		turretModel[142] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 207
		turretModel[143] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 208
		turretModel[144] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 209
		turretModel[145] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 210
		turretModel[146] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 211
		turretModel[147] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 212
		turretModel[148] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 213
		turretModel[149] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 214
		turretModel[150] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 215
		turretModel[151] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 216
		turretModel[152] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 217
		turretModel[153] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 218
		turretModel[154] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 219
		turretModel[155] = new ModelRendererTurbo(this, 0, 120, textureX, textureY); // Box 220
		turretModel[156] = new ModelRendererTurbo(this, 0, 137, textureX, textureY); // Box 221
		turretModel[157] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 222
		turretModel[158] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 223
		turretModel[159] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 224
		turretModel[160] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 225
		turretModel[161] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 226
		turretModel[162] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 227
		turretModel[163] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 228
		turretModel[164] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 229
		turretModel[165] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 230
		turretModel[166] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 231
		turretModel[167] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 232
		turretModel[168] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 233
		turretModel[169] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 234
		turretModel[170] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 235
		turretModel[171] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 236
		turretModel[172] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 237
		turretModel[173] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 238
		turretModel[174] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 239
		turretModel[175] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 240
		turretModel[176] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 241
		turretModel[177] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 242
		turretModel[178] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 243
		turretModel[179] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 244
		turretModel[180] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 245
		turretModel[181] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 246
		turretModel[182] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 247
		turretModel[183] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 248
		turretModel[184] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 249
		turretModel[185] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 250
		turretModel[186] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 251
		turretModel[187] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 252
		turretModel[188] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 253
		turretModel[189] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 254
		turretModel[190] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 255
		turretModel[191] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 256
		turretModel[192] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 257
		turretModel[193] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 258
		turretModel[194] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 259
		turretModel[195] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 260
		turretModel[196] = new ModelRendererTurbo(this, 0, 120, textureX, textureY); // Box 261
		turretModel[197] = new ModelRendererTurbo(this, 0, 137, textureX, textureY); // Box 262
		turretModel[198] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 263
		turretModel[199] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 264
		turretModel[200] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 265
		turretModel[201] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 266
		turretModel[202] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 267
		turretModel[203] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 268
		turretModel[204] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 269
		turretModel[205] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 270
		turretModel[206] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 271
		turretModel[207] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 272
		turretModel[208] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 273
		turretModel[209] = new ModelRendererTurbo(this, 2, 176, textureX, textureY); // Box 274
		turretModel[210] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 275
		turretModel[211] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 276
		turretModel[212] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 277
		turretModel[213] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 278
		turretModel[214] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 279
		turretModel[215] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 280
		turretModel[216] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 281
		turretModel[217] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 282
		turretModel[218] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 283
		turretModel[219] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 284
		turretModel[220] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 285
		turretModel[221] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 286
		turretModel[222] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 287
		turretModel[223] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 288
		turretModel[224] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 289
		turretModel[225] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 290
		turretModel[226] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 291
		turretModel[227] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 292
		turretModel[228] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 293
		turretModel[229] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 294
		turretModel[230] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 295
		turretModel[231] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 296
		turretModel[232] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 297
		turretModel[233] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 298
		turretModel[234] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 299
		turretModel[235] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 300
		turretModel[236] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 301
		turretModel[237] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 302
		turretModel[238] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 303
		turretModel[239] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 304
		turretModel[240] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 305
		turretModel[241] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 306
		turretModel[242] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 307

		turretModel[0].addShapeBox(-26F, 3F, -30F, 38, 2, 60, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 51
		turretModel[0].setRotationPoint(0F, 0F, 0F);

		turretModel[1].addShapeBox(-36F, 3F, -30F, 10, 2, 60, 0F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3.5F); // Box 52
		turretModel[1].setRotationPoint(0F, 0F, 0F);

		turretModel[2].addShapeBox(-42F, 3F, -27F, 6, 2, 54, 0F, -0.5F, 0F, -10.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -10.5F, -0.5F, -0.5F, -10.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -10.5F); // Box 53
		turretModel[2].setRotationPoint(0F, 0F, 0F);

		turretModel[3].addShapeBox(12F, 3F, -30F, 10, 2, 60, 0F, 0F, 0F, 0F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, -3.5F, 0.5F, -0.5F, -3.5F, 0F, -0.5F, 0F); // Box 54
		turretModel[3].setRotationPoint(0F, 0F, 0F);

		turretModel[4].addShapeBox(22.5F, 3F, -27F, 5, 2, 54, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -8.5F, 0.5F, 0F, -8.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -8.5F, 0.5F, -0.5F, -8.5F, 0F, -0.5F, -0.5F); // Box 55
		turretModel[4].setRotationPoint(0F, 0F, 0F);

		turretModel[5].addShapeBox(22.5F, -10F, -27F, 5, 7, 54, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -8.5F, 0.5F, 0F, -8.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -8.5F, 0.5F, -0.5F, -8.5F, 0F, -0.5F, -0.5F); // Box 56
		turretModel[5].setRotationPoint(0F, 0F, 0F);

		turretModel[6].addShapeBox(12F, -10F, -30F, 10, 7, 60, 0F, 0F, 0F, 0F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, -3.5F, 0.5F, -0.5F, -3.5F, 0F, -0.5F, 0F); // Box 57
		turretModel[6].setRotationPoint(0F, 0F, 0F);

		turretModel[7].addShapeBox(-26F, -10F, -30F, 38, 7, 60, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 58
		turretModel[7].setRotationPoint(0F, 0F, 0F);

		turretModel[8].addShapeBox(-42F, -10F, -27F, 6, 7, 54, 0F, -0.5F, 0F, -8.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -8.5F, -0.5F, -0.5F, -8.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -8.5F); // Box 59
		turretModel[8].setRotationPoint(0F, 0F, 0F);

		turretModel[9].addShapeBox(-36F, -10F, -30F, 10, 7, 60, 0F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3.5F); // Box 60
		turretModel[9].setRotationPoint(0F, 0F, 0F);

		turretModel[10].addShapeBox(-26F, -3.5F, -29F, 38, 7, 58, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 61
		turretModel[10].setRotationPoint(0F, 0F, 0F);

		turretModel[11].addShapeBox(-35F, -3.5F, -29F, 9, 7, 58, 0F, 0F, 0F, -3.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.2F, 0F, -0.5F, -3.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3.2F); // Box 62
		turretModel[11].setRotationPoint(0F, 0F, 0F);

		turretModel[12].addShapeBox(-41F, -3.5F, -26F, 6, 7, 52, 0F, -0.4F, 0F, -10F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.4F, 0F, -10F, -0.4F, 0F, -10F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.4F, 0F, -10F); // Box 64
		turretModel[12].setRotationPoint(0F, 0F, 0F);

		turretModel[13].addShapeBox(12F, -3.5F, -29F, 10, 7, 58, 0F, 0F, 0F, 0F, -0.1F, 0F, -3.4F, -0.1F, 0F, -3.4F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.1F, -0.5F, -3.4F, -0.1F, -0.5F, -3.4F, 0F, -0.5F, 0F); // Box 65
		turretModel[13].setRotationPoint(0F, 0F, 0F);

		turretModel[14].addShapeBox(21.9F, -3.5F, -26F, 5, 7, 52, 0F, 0F, 0F, -0.4F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -0.4F); // Box 66
		turretModel[14].setRotationPoint(0F, 0F, 0F);

		turretModel[15].addShapeBox(22.5F, -24F, -27F, 5, 14, 19, 0F, 0F, 0.3F, -0.5F, 0.5F, -0.2F, -8.5F, 0.5F, -0.2F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -8.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 67
		turretModel[15].setRotationPoint(0F, 0F, 0F);

		turretModel[16].addShapeBox(12F, -25F, -30F, 10, 15, 22, 0F, 0F, 0.3F, 0F, 0.5F, -0.7F, -3.5F, 0.5F, -0.7F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, -3.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 68
		turretModel[16].setRotationPoint(0F, 0F, 0F);

		turretModel[17].addShapeBox(-26F, -27F, -30F, 38, 17, 60, 0F, 0F, 0.5F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		turretModel[17].setRotationPoint(0F, 0F, 0F);

		turretModel[18].addShapeBox(-36F, -27F, -30F, 10, 17, 60, 0F, 0F, 0.5F, -3.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F); // Box 70
		turretModel[18].setRotationPoint(0F, 0F, 0F);

		turretModel[19].addShapeBox(-42F, -27F, -27F, 6, 17, 54, 0F, -0.5F, 0.5F, -8.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -8.5F, -0.5F, 0F, -8.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -8.5F); // Box 71
		turretModel[19].setRotationPoint(0F, 0F, 0F);

		turretModel[20].addShapeBox(12F, -25F, 8F, 10, 15, 22, 0F, 0F, 0.3F, -0.5F, 0.5F, -0.7F, -0.5F, 0.5F, -0.7F, -3.5F, 0F, 0.3F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -3.5F, 0F, 0F, 0F); // Box 72
		turretModel[20].setRotationPoint(0F, 0F, 0F);

		turretModel[21].addShapeBox(22.5F, -24F, 8F, 5, 14, 19, 0F, 0F, 0.3F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, -8.5F, 0F, 0.3F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -8.5F, 0F, 0F, -0.5F); // Box 73
		turretModel[21].setRotationPoint(0F, 0F, 0F);

		turretModel[22].addShapeBox(12F, -14F, 4.5F, 16, 4, 4, 0F, 0F, 0F, -3.998F, 0F, 0F, -3.998F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		turretModel[22].setRotationPoint(0F, 0F, 0F);

		turretModel[23].addShapeBox(12F, -14F, -8.5F, 16, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.998F, 0F, 0F, -3.998F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		turretModel[23].setRotationPoint(0F, 0F, 0F);

		turretModel[24].addShapeBox(-36F, -36.5F, -30F, 10, 9, 60, 0F, -1F, 0F, -6.5F, 0F, 0F, -4F, 0F, 0F, -4F, -1F, 0F, -6.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F); // Box 76
		turretModel[24].setRotationPoint(0F, 0F, 0F);

		turretModel[25].addShapeBox(-42F, -36.5F, -27F, 6, 9, 54, 0F, -2.5F, 0F, -8.5F, 1F, 0F, -3.5F, 1F, 0F, -3.5F, -2.5F, 0F, -8.5F, -0.5F, 0F, -8.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -8.5F); // Box 77
		turretModel[25].setRotationPoint(0F, 0F, 0F);

		turretModel[26].addShapeBox(-26F, -36.5F, -30F, 29, 9, 60, 0F, 0F, 0F, -4F, 0F, -1.7F, -4F, 0F, -1.7F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, 0F, 0F, 0F, 0F); // Box 78
		turretModel[26].setRotationPoint(0F, 0F, 0F);

		turretModel[27].addShapeBox(3F, -34.8F, -30F, 9, 9, 22, 0F, 0F, 0F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F); // Box 79
		turretModel[27].setRotationPoint(0F, 0F, 0F);

		turretModel[28].addShapeBox(3F, -34.8F, 8F, 9, 9, 22, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4F, 0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 80
		turretModel[28].setRotationPoint(0F, 0F, 0F);

		turretModel[29].addShapeBox(12F, -34.3F, -30F, 11, 9, 22, 0F, 0F, 0F, -4F, -2F, -0.5F, -6.5F, -2F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 1F, -3.5F, -0.5F, 1F, -0.5F, 0F, 0F, -0.5F); // Box 81
		turretModel[29].setRotationPoint(0F, 0F, 0F);

		turretModel[30].addShapeBox(12F, -34.3F, 8F, 11, 9, 22, 0F, 0F, 0F, -0.5F, -2F, -0.5F, -0.5F, -2F, -0.5F, -6.5F, 0F, 0F, -4F, 0F, 0F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, -3.5F, 0F, 0F, 0F); // Box 82
		turretModel[30].setRotationPoint(0F, 0F, 0F);

		turretModel[31].addShapeBox(22.5F, -33.3F, -26.5F, 6, 9, 18, 0F, 1.5F, 0.5F, -3F, -3F, 0F, -8F, -3F, 0F, 0F, 1.5F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, -8F, -0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 84
		turretModel[31].setRotationPoint(0F, 0F, 0F);

		turretModel[32].addShapeBox(22.5F, -33.3F, 8.5F, 6, 9, 18, 0F, 1.5F, 0.5F, 0F, -3F, 0F, 0F, -3F, 0F, -8F, 1.5F, 0.5F, -3F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -8F, 0F, 0F, 0F); // Box 85
		turretModel[32].setRotationPoint(0F, 0F, 0F);

		turretModel[33].addShapeBox(-35F, -43.5F, -26F, 9, 7, 52, 0F, -2F, -1.7F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, -2F, -1.7F, -7.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 86
		turretModel[33].setRotationPoint(0F, 0F, 0F);

		turretModel[34].addShapeBox(-40F, -42.5F, -23F, 5, 6, 46, 0F, -6.4F, -0.8F, -4.9F, 2F, -0.7F, -4.5F, 2F, -0.7F, -4.5F, -6.4F, -0.8F, -4.9F, -0.5F, 0F, -4.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -4.5F); // Box 87
		turretModel[34].setRotationPoint(0F, 0F, 0F);

		turretModel[35].addShapeBox(-26F, -43.5F, -26F, 29, 7, 52, 0F, 0F, 0F, -7.5F, 0F, -1.7F, -7.5F, 0F, -1.7F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, 0F, 0F, 0F, 0F); // Box 89
		turretModel[35].setRotationPoint(0F, 0F, 0F);

		turretModel[36].addShapeBox(3F, -41.8F, -26F, 9, 7, 18, 0F, 0F, 0F, -7.5F, 0F, -1F, -7.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F); // Box 90
		turretModel[36].setRotationPoint(0F, 0F, 0F);

		turretModel[37].addShapeBox(3F, -41.8F, 8F, 9, 7, 18, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 91
		turretModel[37].setRotationPoint(0F, 0F, 0F);

		turretModel[38].addShapeBox(3F, -41.8F, -8.5F, 4, 8, 4, 0F, 0F, 0F, 0F, 0F, -0.44F, 0F, 0F, -0.44F, -3.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.99F, 0F, 0F, 0F); // Box 92
		turretModel[38].setRotationPoint(0F, 0F, 0F);

		turretModel[39].addShapeBox(3F, -41.8F, 4.5F, 4, 8, 4, 0F, 0F, 0F, 0F, 0F, -0.44F, -3.99F, 0F, -0.44F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.99F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		turretModel[39].setRotationPoint(0F, 0F, 0F);

		turretModel[40].addShapeBox(12F, -41F, -26F, 11, 6, 18, 0F, 0F, -0.2F, -7.5F, -3F, -2.7F, -7.5F, -3F, -2.7F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0.7F, 0F, -2F, 1.2F, -2.5F, -2F, 1.2F, -0.5F, 0F, 0.7F, -0.5F); // Box 94
		turretModel[40].setRotationPoint(0F, 0F, 0F);

		turretModel[41].addShapeBox(12F, -41F, 8F, 11, 6, 18, 0F, 0F, -0.2F, -0.5F, -3F, -2.7F, -0.5F, -3F, -2.7F, -7.5F, 0F, -0.2F, -7.5F, 0F, 0.7F, -0.5F, -2F, 1.2F, -0.5F, -2F, 1.2F, -2.5F, 0F, 0.7F, 0F); // Box 95
		turretModel[41].setRotationPoint(0F, 0F, 0F);

		turretModel[42].addShapeBox(21.5F, -38.3F, -22.5F, 4, 4, 14, 0F, 1.5F, 0F, -4F, -5.4F, 0F, -4.2F, -5.4F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0.5F, 1F, 0F, 1F, -4F, 0F, 1F, 0F, 0.5F, 0.5F, 0F); // Box 96
		turretModel[42].setRotationPoint(0F, 0F, 0F);

		turretModel[43].addShapeBox(21.5F, -38.3F, 8.5F, 4, 4, 14, 0F, 1.5F, 0F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, -4.2F, 1.5F, 0F, -4F, 0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, -4F, 0.5F, 0.5F, 1F); // Box 97
		turretModel[43].setRotationPoint(0F, 0F, 0F);

		turretModel[44].addShapeBox(-4F, -42.8F, 8F, 8, 14, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		turretModel[44].setRotationPoint(0F, 0F, 0F);

		turretModel[45].addShapeBox(-10F, -42.8F, 8F, 6, 14, 20, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 99
		turretModel[45].setRotationPoint(0F, 0F, 0F);

		turretModel[46].addShapeBox(4F, -42.8F, 8F, 6, 14, 20, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 100
		turretModel[46].setRotationPoint(0F, 0F, 0F);

		turretModel[47].addShapeBox(-3.5F, -48.8F, 8.5F, 7, 6, 19, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		turretModel[47].setRotationPoint(0F, 0F, 0F);

		turretModel[48].addShapeBox(3.5F, -48.8F, 8.5F, 6, 6, 19, 0F, 0F, 0F, -1F, -1F, 0F, -6F, -1F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 102
		turretModel[48].setRotationPoint(0F, 0F, 0F);

		turretModel[49].addShapeBox(-9.5F, -48.8F, 8.5F, 6, 6, 19, 0F, -1F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 103
		turretModel[49].setRotationPoint(0F, 0F, 0F);

		turretModel[50].addShapeBox(6.5F, -48.8F, 13.5F, 3, 6, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		turretModel[50].setRotationPoint(0F, 0F, 0F);

		turretModel[51].addShapeBox(9.5F, -47.8F, 13.5F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 106
		turretModel[51].setRotationPoint(0F, 0F, 0F);

		turretModel[52].addShapeBox(9.5F, -47.8F, 21.5F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 107
		turretModel[52].setRotationPoint(0F, 0F, 0F);

		turretModel[53].addShapeBox(9.5F, -48.8F, 13.5F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		turretModel[53].setRotationPoint(0F, 0F, 0F);

		turretModel[54].addShapeBox(9.5F, -43.8F, 13.5F, 2, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 109
		turretModel[54].setRotationPoint(0F, 0F, 0F);

		turretModel[55].addShapeBox(-3.5F, -51.8F, 10.5F, 7, 3, 15, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		turretModel[55].setRotationPoint(0F, 0F, 0F);

		turretModel[56].addShapeBox(-7.5F, -51.8F, 10.5F, 15, 3, 15, 0F, -1.5F, 0F, -4.5F, -10.5F, 0F, -1.5F, -10.5F, 0F, -1.5F, -1.5F, 0F, -4.5F, 0F, 0F, -4F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, -4F); // Box 111
		turretModel[56].setRotationPoint(0F, 0F, 0F);

		turretModel[57].addShapeBox(-7.5F, -51.8F, 10.5F, 15, 3, 15, 0F, -10.5F, 0F, -1.5F, -1.5F, 0F, -4.5F, -1.5F, 0F, -4.5F, -10.5F, 0F, -1.5F, -11F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -11F, 0F, 0F); // Box 112
		turretModel[57].setRotationPoint(0F, 0F, 0F);

		turretModel[58].addShapeBox(-3F, -53.8F, 12F, 6, 2, 12, 0F, -2F, -0.5F, -4F, -2F, -0.5F, -4F, -2F, -0.5F, -4F, -2F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		turretModel[58].setRotationPoint(0F, 0F, 0F);

		turretModel[59].addShapeBox(-6F, -53.8F, 12F, 12, 2, 12, 0F, -4F, -0.5F, -5F, -7F, -0.5F, -4F, -7F, -0.5F, -4F, -4F, -0.5F, -5F, 0F, 0F, -3F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, -3F); // Box 114
		turretModel[59].setRotationPoint(0F, 0F, 0F);

		turretModel[60].addShapeBox(-6F, -53.8F, 12F, 12, 2, 12, 0F, -7F, -0.5F, -4F, -4F, -0.5F, -5F, -4F, -0.5F, -5F, -7F, -0.5F, -4F, -9F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -9F, 0F, 0F); // Box 115
		turretModel[60].setRotationPoint(0F, 0F, 0F);

		turretModel[61].addShapeBox(11.5F, -43.8F, 13.5F, 5, 1, 9, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 116
		turretModel[61].setRotationPoint(0F, 0F, 0F);

		turretModel[62].addShapeBox(26.9F, -3.5F, -9F, 1, 7, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		turretModel[62].setRotationPoint(0F, 0F, 0F);

		turretModel[63].addShapeBox(-22F, -22F, -31F, 9, 13, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		turretModel[63].setRotationPoint(0F, 0F, 0F);

		turretModel[64].addShapeBox(-22F, -24F, -31F, 9, 2, 1, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		turretModel[64].setRotationPoint(0F, 0F, 0F);

		turretModel[65].addShapeBox(-22F, -9F, -31F, 9, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 120
		turretModel[65].setRotationPoint(0F, 0F, 0F);

		turretModel[66].addShapeBox(29.5F, -5F, 10F, 1, 6, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 121
		turretModel[66].setRotationPoint(0F, 0F, 0F);

		turretModel[67].addShapeBox(29.5F, -3F, 10.5F, 1, 1, 5, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 123
		turretModel[67].setRotationPoint(0F, 0F, 0F);

		turretModel[68].addShapeBox(28F, -6.8F, 10F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.6F, -0.5F, 0F, 0.6F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, -0.5F, 0F, 0.5F, -0.5F); // Box 124
		turretModel[68].setRotationPoint(0F, 0F, 0F);

		turretModel[69].addShapeBox(29.5F, 0F, 10.5F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		turretModel[69].setRotationPoint(0F, 0F, 0F);

		turretModel[70].addShapeBox(29.5F, -6F, 10F, 1, 1, 1, 0F, 0.5F, -1F, 0F, -0.9F, 0.3F, 0F, -0.9F, 0.3F, -0.5F, 0.5F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F); // Box 126
		turretModel[70].setRotationPoint(0F, 0F, 0F);

		turretModel[71].addShapeBox(29.5F, -6F, 15.5F, 1, 1, 1, 0F, 0.5F, -1F, 0F, -0.9F, 0.3F, 0F, -0.9F, 0.3F, -0.5F, 0.5F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F); // Box 127
		turretModel[71].setRotationPoint(0F, 0F, 0F);

		turretModel[72].addShapeBox(28F, -6.8F, 15.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.6F, -0.5F, 0F, 0.6F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, -0.5F, 0F, 0.5F, -0.5F); // Box 128
		turretModel[72].setRotationPoint(0F, 0F, 0F);

		turretModel[73].addShapeBox(29.5F, -5F, 15.5F, 1, 6, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 129
		turretModel[73].setRotationPoint(0F, 0F, 0F);

		turretModel[74].addShapeBox(28F, -6.8F, -16F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.6F, -0.5F, 0F, 0.6F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, -0.5F, 0F, 0.5F, -0.5F); // Box 130
		turretModel[74].setRotationPoint(0F, 0F, 0F);

		turretModel[75].addShapeBox(29.5F, -6F, -16F, 1, 1, 1, 0F, 0.5F, -1F, 0F, -0.9F, 0.3F, 0F, -0.9F, 0.3F, -0.5F, 0.5F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F); // Box 131
		turretModel[75].setRotationPoint(0F, 0F, 0F);

		turretModel[76].addShapeBox(29.5F, -5F, -16F, 1, 6, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 132
		turretModel[76].setRotationPoint(0F, 0F, 0F);

		turretModel[77].addShapeBox(29.5F, -3F, -15.5F, 1, 1, 5, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 133
		turretModel[77].setRotationPoint(0F, 0F, 0F);

		turretModel[78].addShapeBox(29.5F, 0F, -15.5F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		turretModel[78].setRotationPoint(0F, 0F, 0F);

		turretModel[79].addShapeBox(29.5F, -5F, -10.5F, 1, 6, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 135
		turretModel[79].setRotationPoint(0F, 0F, 0F);

		turretModel[80].addShapeBox(28F, -6.8F, -10.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.6F, -0.5F, 0F, 0.6F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, -0.5F, 0F, 0.5F, -0.5F); // Box 136
		turretModel[80].setRotationPoint(0F, 0F, 0F);

		turretModel[81].addShapeBox(29.5F, -6F, -10.5F, 1, 1, 1, 0F, 0.5F, -1F, 0F, -0.9F, 0.3F, 0F, -0.9F, 0.3F, -0.5F, 0.5F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F); // Box 137
		turretModel[81].setRotationPoint(0F, 0F, 0F);

		turretModel[82].addShapeBox(31.5F, -5F, 14.5F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 140
		turretModel[82].setRotationPoint(0F, 0F, 0F);
		turretModel[82].rotateAngleY = 1.57079633F;

		turretModel[83].addShapeBox(31.5F, -3F, 15F, 1, 1, 5, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 141
		turretModel[83].setRotationPoint(0F, 0F, 0F);
		turretModel[83].rotateAngleY = 1.57079633F;

		turretModel[84].addShapeBox(31.5F, -5F, 20F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		turretModel[84].setRotationPoint(0F, 0F, 0F);
		turretModel[84].rotateAngleY = 1.57079633F;

		turretModel[85].addShapeBox(31.5F, 2F, 15F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		turretModel[85].setRotationPoint(0F, 0F, 0F);
		turretModel[85].rotateAngleY = 1.57079633F;

		turretModel[86].addShapeBox(45.5F, -6F, 1F, 1, 1, 1, 0F, 0.5F, -1F, 0F, -0.9F, 0.3F, 0F, -0.9F, 0.3F, -0.5F, 0.5F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F); // Box 146
		turretModel[86].setRotationPoint(0F, 0F, 0F);
		turretModel[86].rotateAngleY = 2.53072742F;

		turretModel[87].addShapeBox(44F, -6.8F, 1F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.6F, -0.5F, 0F, 0.6F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, -0.5F, 0F, 0.5F, -0.5F); // Box 147
		turretModel[87].setRotationPoint(0F, 0F, 0F);
		turretModel[87].rotateAngleY = 2.53072742F;

		turretModel[88].addShapeBox(45.5F, -5F, 1F, 1, 6, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 148
		turretModel[88].setRotationPoint(0F, 0F, 0F);
		turretModel[88].rotateAngleY = 2.53072742F;

		turretModel[89].addShapeBox(45.5F, -3F, 1.5F, 1, 1, 5, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 149
		turretModel[89].setRotationPoint(0F, 0F, 0F);
		turretModel[89].rotateAngleY = 2.53072742F;

		turretModel[90].addShapeBox(45.5F, -5F, 6.5F, 1, 6, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 150
		turretModel[90].setRotationPoint(0F, 0F, 0F);
		turretModel[90].rotateAngleY = 2.53072742F;

		turretModel[91].addShapeBox(45.5F, -6F, 6.5F, 1, 1, 1, 0F, 0.5F, -1F, 0F, -0.9F, 0.3F, 0F, -0.9F, 0.3F, -0.5F, 0.5F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F); // Box 151
		turretModel[91].setRotationPoint(0F, 0F, 0F);
		turretModel[91].rotateAngleY = 2.53072742F;

		turretModel[92].addShapeBox(44F, -6.8F, 6.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.6F, -0.5F, 0F, 0.6F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, -0.5F, 0F, 0.5F, -0.5F); // Box 152
		turretModel[92].setRotationPoint(0F, 0F, 0F);
		turretModel[92].rotateAngleY = 2.53072742F;

		turretModel[93].addShapeBox(45.5F, 0F, 1.5F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		turretModel[93].setRotationPoint(0F, 0F, 0F);
		turretModel[93].rotateAngleY = 2.53072742F;

		turretModel[94].addShapeBox(29.5F, -6F, 20F, 3, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 154
		turretModel[94].setRotationPoint(0F, 0F, 0F);
		turretModel[94].rotateAngleY = 1.57079633F;

		turretModel[95].addShapeBox(29.5F, -6F, 14.5F, 3, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 155
		turretModel[95].setRotationPoint(0F, 0F, 0F);
		turretModel[95].rotateAngleY = 1.57079633F;

		turretModel[96].addShapeBox(-22F, -24F, 30F, 9, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 156
		turretModel[96].setRotationPoint(0F, 0F, 0F);

		turretModel[97].addShapeBox(-22F, -22F, 30F, 9, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 157
		turretModel[97].setRotationPoint(0F, 0F, 0F);

		turretModel[98].addShapeBox(-22F, -9F, 30F, 9, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 158
		turretModel[98].setRotationPoint(0F, 0F, 0F);

		turretModel[99].addShapeBox(-20F, -26F, 30F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 159
		turretModel[99].setRotationPoint(0F, 0F, 0F);

		turretModel[100].addShapeBox(-16F, -26F, 30F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 160
		turretModel[100].setRotationPoint(0F, 0F, 0F);

		turretModel[101].addShapeBox(-20F, -26F, 31F, 5, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F); // Box 161
		turretModel[101].setRotationPoint(0F, 0F, 0F);

		turretModel[102].addShapeBox(-24F, -24F, 30F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 162
		turretModel[102].setRotationPoint(0F, 0F, 0F);

		turretModel[103].addShapeBox(-24F, -17F, 30F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 163
		turretModel[103].setRotationPoint(0F, 0F, 0F);

		turretModel[104].addShapeBox(-24F, -24F, 31F, 1, 8, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F); // Box 164
		turretModel[104].setRotationPoint(0F, 0F, 0F);

		turretModel[105].addShapeBox(28F, -11.8F, 9.8F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 165
		turretModel[105].setRotationPoint(0F, 0F, 0F);

		turretModel[106].addShapeBox(28F, -11.8F, 14.3F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 166
		turretModel[106].setRotationPoint(0F, 0F, 0F);

		turretModel[107].addShapeBox(30F, -11.8F, 9.8F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 167
		turretModel[107].setRotationPoint(0F, 0F, 0F);

		turretModel[108].addShapeBox(30F, -11.8F, 14.3F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.8F, -0.2F); // Box 168
		turretModel[108].setRotationPoint(0F, 0F, 0F);

		turretModel[109].addShapeBox(30F, -10.8F, 10.6F, 1, 1, 4, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 169
		turretModel[109].setRotationPoint(0F, 0F, 0F);

		turretModel[110].addShapeBox(30F, -16.3F, 10.6F, 1, 1, 4, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 170
		turretModel[110].setRotationPoint(0F, 0F, 0F);

		turretModel[111].addShapeBox(30F, -17.3F, 9.8F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 171
		turretModel[111].setRotationPoint(0F, 0F, 0F);

		turretModel[112].addShapeBox(28F, -17.3F, 9.8F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 172
		turretModel[112].setRotationPoint(0F, 0F, 0F);

		turretModel[113].addShapeBox(30F, -17.3F, 14.3F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.8F, -0.2F); // Box 173
		turretModel[113].setRotationPoint(0F, 0F, 0F);

		turretModel[114].addShapeBox(28F, -17.3F, 14.3F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 174
		turretModel[114].setRotationPoint(0F, 0F, 0F);

		turretModel[115].addShapeBox(30F, -21.8F, 10.6F, 1, 1, 4, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 175
		turretModel[115].setRotationPoint(0F, 0F, 0F);

		turretModel[116].addShapeBox(30F, -22.8F, 9.8F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 176
		turretModel[116].setRotationPoint(0F, 0F, 0F);

		turretModel[117].addShapeBox(28F, -22.8F, 9.8F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 177
		turretModel[117].setRotationPoint(0F, 0F, 0F);

		turretModel[118].addShapeBox(30F, -22.8F, 14.3F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.8F, -0.2F); // Box 178
		turretModel[118].setRotationPoint(0F, 0F, 0F);

		turretModel[119].addShapeBox(28F, -22.8F, 14.3F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 179
		turretModel[119].setRotationPoint(0F, 0F, 0F);

		turretModel[120].addShapeBox(29F, -27.3F, 10.6F, 1, 1, 4, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 180
		turretModel[120].setRotationPoint(0F, 0F, 0F);

		turretModel[121].addShapeBox(29F, -28.3F, 9.8F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 181
		turretModel[121].setRotationPoint(0F, 0F, 0F);

		turretModel[122].addShapeBox(27F, -28.3F, 9.8F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 182
		turretModel[122].setRotationPoint(0F, 0F, 0F);

		turretModel[123].addShapeBox(29F, -28.3F, 14.3F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.8F, -0.2F); // Box 183
		turretModel[123].setRotationPoint(0F, 0F, 0F);

		turretModel[124].addShapeBox(27F, -28.3F, 14.3F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 184
		turretModel[124].setRotationPoint(0F, 0F, 0F);

		turretModel[125].addShapeBox(27.3F, -32.3F, 10.6F, 1, 1, 4, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 185
		turretModel[125].setRotationPoint(0F, 0F, 0F);

		turretModel[126].addShapeBox(27.3F, -33.3F, 9.8F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 186
		turretModel[126].setRotationPoint(0F, 0F, 0F);

		turretModel[127].addShapeBox(25.3F, -33.3F, 9.8F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 187
		turretModel[127].setRotationPoint(0F, 0F, 0F);

		turretModel[128].addShapeBox(27.3F, -33.3F, 14.3F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.8F, -0.2F); // Box 188
		turretModel[128].setRotationPoint(0F, 0F, 0F);

		turretModel[129].addShapeBox(25.3F, -33.3F, 14.3F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 189
		turretModel[129].setRotationPoint(0F, 0F, 0F);

		turretModel[130].addShapeBox(25.3F, -33.3F, -10.8F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 195
		turretModel[130].setRotationPoint(0F, 0F, 0F);

		turretModel[131].addShapeBox(27.3F, -33.3F, -10.8F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.8F, -0.2F); // Box 196
		turretModel[131].setRotationPoint(0F, 0F, 0F);

		turretModel[132].addShapeBox(27.3F, -32.3F, -14.5F, 1, 1, 4, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 197
		turretModel[132].setRotationPoint(0F, 0F, 0F);

		turretModel[133].addShapeBox(27.3F, -33.3F, -15.3F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 198
		turretModel[133].setRotationPoint(0F, 0F, 0F);

		turretModel[134].addShapeBox(25.3F, -33.3F, -15.3F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 199
		turretModel[134].setRotationPoint(0F, 0F, 0F);

		turretModel[135].addShapeBox(27F, -28.3F, -10.8F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 200
		turretModel[135].setRotationPoint(0F, 0F, 0F);

		turretModel[136].addShapeBox(29F, -28.3F, -10.8F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.8F, -0.2F); // Box 201
		turretModel[136].setRotationPoint(0F, 0F, 0F);

		turretModel[137].addShapeBox(29F, -27.3F, -14.5F, 1, 1, 4, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 202
		turretModel[137].setRotationPoint(0F, 0F, 0F);

		turretModel[138].addShapeBox(29F, -28.3F, -15.3F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 203
		turretModel[138].setRotationPoint(0F, 0F, 0F);

		turretModel[139].addShapeBox(27F, -28.3F, -15.3F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 204
		turretModel[139].setRotationPoint(0F, 0F, 0F);

		turretModel[140].addShapeBox(28F, -22.8F, -10.8F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 205
		turretModel[140].setRotationPoint(0F, 0F, 0F);

		turretModel[141].addShapeBox(30F, -22.8F, -10.8F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.8F, -0.2F); // Box 206
		turretModel[141].setRotationPoint(0F, 0F, 0F);

		turretModel[142].addShapeBox(30F, -21.8F, -14.5F, 1, 1, 4, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 207
		turretModel[142].setRotationPoint(0F, 0F, 0F);

		turretModel[143].addShapeBox(30F, -22.8F, -15.3F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 208
		turretModel[143].setRotationPoint(0F, 0F, 0F);

		turretModel[144].addShapeBox(28F, -22.8F, -15.3F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 209
		turretModel[144].setRotationPoint(0F, 0F, 0F);

		turretModel[145].addShapeBox(28F, -17.3F, -15.3F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 210
		turretModel[145].setRotationPoint(0F, 0F, 0F);

		turretModel[146].addShapeBox(30F, -17.3F, -15.3F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 211
		turretModel[146].setRotationPoint(0F, 0F, 0F);

		turretModel[147].addShapeBox(30F, -16.3F, -14.5F, 1, 1, 4, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 212
		turretModel[147].setRotationPoint(0F, 0F, 0F);

		turretModel[148].addShapeBox(30F, -17.3F, -10.8F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.8F, -0.2F); // Box 213
		turretModel[148].setRotationPoint(0F, 0F, 0F);

		turretModel[149].addShapeBox(28F, -17.3F, -10.8F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 214
		turretModel[149].setRotationPoint(0F, 0F, 0F);

		turretModel[150].addShapeBox(28F, -11.8F, -10.8F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 215
		turretModel[150].setRotationPoint(0F, 0F, 0F);

		turretModel[151].addShapeBox(30F, -11.8F, -10.8F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.8F, -0.2F); // Box 216
		turretModel[151].setRotationPoint(0F, 0F, 0F);

		turretModel[152].addShapeBox(30F, -10.8F, -14.5F, 1, 1, 4, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 217
		turretModel[152].setRotationPoint(0F, 0F, 0F);

		turretModel[153].addShapeBox(30F, -11.8F, -15.3F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 218
		turretModel[153].setRotationPoint(0F, 0F, 0F);

		turretModel[154].addShapeBox(28F, -11.8F, -15.3F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 219
		turretModel[154].setRotationPoint(0F, 0F, 0F);

		turretModel[155].addShapeBox(26.9F, -20.5F, 16F, 2, 10, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		turretModel[155].setRotationPoint(0F, 0F, 0F);

		turretModel[156].addShapeBox(13.9F, -20.5F, 26F, 9, 10, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		turretModel[156].setRotationPoint(0F, 0F, 0F);

		turretModel[157].addShapeBox(2.23F, -43.3F, 9.8F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 222
		turretModel[157].setRotationPoint(0F, 0F, 0F);
		turretModel[157].rotateAngleZ = -0.12217305F;

		turretModel[158].addShapeBox(2.23F, -44.18F, 9.8F, 7, 1, 1, 0F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 223
		turretModel[158].setRotationPoint(0F, 0F, 0F);
		turretModel[158].rotateAngleZ = -0.12217305F;

		turretModel[159].addShapeBox(0.3F, -45.1F, 9.8F, 7, 1, 1, 0F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 224
		turretModel[159].setRotationPoint(0F, 0F, 0F);
		turretModel[159].rotateAngleZ = -0.31415927F;

		turretModel[160].addShapeBox(0F, -44.2F, 9.8F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 225
		turretModel[160].setRotationPoint(0F, 0F, 0F);
		turretModel[160].rotateAngleZ = -0.31415927F;

		turretModel[161].addShapeBox(-12.7F, -43.9F, 9.8F, 7, 1, 1, 0F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 226
		turretModel[161].setRotationPoint(0F, 0F, 0F);
		turretModel[161].rotateAngleZ = -0.75049158F;

		turretModel[162].addShapeBox(-4.4F, -44.5F, 9.8F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 227
		turretModel[162].setRotationPoint(0F, 0F, 0F);
		turretModel[162].rotateAngleZ = -0.55850536F;

		turretModel[163].addShapeBox(-6.7F, -43F, 9.8F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 228
		turretModel[163].setRotationPoint(0F, 0F, 0F);
		turretModel[163].rotateAngleZ = -0.75049158F;

		turretModel[164].addShapeBox(2.23F, -43.3F, -10.8F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 229
		turretModel[164].setRotationPoint(0F, 0F, 0F);
		turretModel[164].rotateAngleZ = -0.12217305F;

		turretModel[165].addShapeBox(2.23F, -44.18F, -10.8F, 7, 1, 1, 0F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 230
		turretModel[165].setRotationPoint(0F, 0F, 0F);
		turretModel[165].rotateAngleZ = -0.12217305F;

		turretModel[166].addShapeBox(-4.44089209850063E-16F, -44.2F, -10.8F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 231
		turretModel[166].setRotationPoint(0F, 0F, 0F);
		turretModel[166].rotateAngleZ = -0.31415927F;

		turretModel[167].addShapeBox(0.3F, -45.1F, -10.8F, 7, 1, 1, 0F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 232
		turretModel[167].setRotationPoint(0F, 0F, 0F);
		turretModel[167].rotateAngleZ = -0.31415927F;

		turretModel[168].addShapeBox(-4.4F, -44.5F, -10.8F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 233
		turretModel[168].setRotationPoint(0F, 0F, 0F);
		turretModel[168].rotateAngleZ = -0.55850536F;

		turretModel[169].addShapeBox(-12.7F, -43.9F, -10.8F, 7, 1, 1, 0F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 234
		turretModel[169].setRotationPoint(0F, 0F, 0F);
		turretModel[169].rotateAngleZ = -0.75049158F;

		turretModel[170].addShapeBox(-6.7F, -43F, -10.8F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 235
		turretModel[170].setRotationPoint(0F, 0F, 0F);
		turretModel[170].rotateAngleZ = -0.75049158F;

		turretModel[171].addShapeBox(44F, -12.8F, 1.25F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 236
		turretModel[171].setRotationPoint(0F, 0F, 0F);
		turretModel[171].rotateAngleY = 2.53072742F;

		turretModel[172].addShapeBox(46F, -12.8F, 1.25F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 237
		turretModel[172].setRotationPoint(0F, 0F, 0F);
		turretModel[172].rotateAngleY = 2.53072742F;

		turretModel[173].addShapeBox(46F, -11.8F, 2.05F, 1, 1, 4, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 238
		turretModel[173].setRotationPoint(0F, 0F, 0F);
		turretModel[173].rotateAngleY = 2.53072742F;

		turretModel[174].addShapeBox(46F, -12.8F, 5.75F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.8F, -0.2F); // Box 239
		turretModel[174].setRotationPoint(0F, 0F, 0F);
		turretModel[174].rotateAngleY = 2.53072742F;

		turretModel[175].addShapeBox(44F, -12.8F, 5.75F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 240
		turretModel[175].setRotationPoint(0F, 0F, 0F);
		turretModel[175].rotateAngleY = 2.53072742F;

		turretModel[176].addShapeBox(44F, -18.3F, 5.75F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 241
		turretModel[176].setRotationPoint(0F, 0F, 0F);
		turretModel[176].rotateAngleY = 2.53072742F;

		turretModel[177].addShapeBox(46F, -18.3F, 5.75F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.8F, -0.2F); // Box 242
		turretModel[177].setRotationPoint(0F, 0F, 0F);
		turretModel[177].rotateAngleY = 2.53072742F;

		turretModel[178].addShapeBox(46F, -17.3F, 2.05F, 1, 1, 4, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 243
		turretModel[178].setRotationPoint(0F, 0F, 0F);
		turretModel[178].rotateAngleY = 2.53072742F;

		turretModel[179].addShapeBox(46F, -18.3F, 1.25F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 244
		turretModel[179].setRotationPoint(0F, 0F, 0F);
		turretModel[179].rotateAngleY = 2.53072742F;

		turretModel[180].addShapeBox(44F, -18.3F, 1.25F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 245
		turretModel[180].setRotationPoint(0F, 0F, 0F);
		turretModel[180].rotateAngleY = 2.53072742F;

		turretModel[181].addShapeBox(44F, -23.8F, 5.75F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 246
		turretModel[181].setRotationPoint(0F, 0F, 0F);
		turretModel[181].rotateAngleY = 2.53072742F;

		turretModel[182].addShapeBox(46F, -23.8F, 5.75F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.8F, -0.2F); // Box 247
		turretModel[182].setRotationPoint(0F, 0F, 0F);
		turretModel[182].rotateAngleY = 2.53072742F;

		turretModel[183].addShapeBox(46F, -22.8F, 2.05F, 1, 1, 4, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 248
		turretModel[183].setRotationPoint(0F, 0F, 0F);
		turretModel[183].rotateAngleY = 2.53072742F;

		turretModel[184].addShapeBox(46F, -23.8F, 1.25F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 249
		turretModel[184].setRotationPoint(0F, 0F, 0F);
		turretModel[184].rotateAngleY = 2.53072742F;

		turretModel[185].addShapeBox(44F, -23.8F, 1.25F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 250
		turretModel[185].setRotationPoint(0F, 0F, 0F);
		turretModel[185].rotateAngleY = 2.53072742F;

		turretModel[186].addShapeBox(44F, -29.3F, 5.75F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 251
		turretModel[186].setRotationPoint(0F, 0F, 0F);
		turretModel[186].rotateAngleY = 2.53072742F;

		turretModel[187].addShapeBox(46F, -29.3F, 5.75F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.8F, -0.2F); // Box 252
		turretModel[187].setRotationPoint(0F, 0F, 0F);
		turretModel[187].rotateAngleY = 2.53072742F;

		turretModel[188].addShapeBox(46F, -28.3F, 2.05F, 1, 1, 4, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 253
		turretModel[188].setRotationPoint(0F, 0F, 0F);
		turretModel[188].rotateAngleY = 2.53072742F;

		turretModel[189].addShapeBox(46F, -29.3F, 1.25F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 254
		turretModel[189].setRotationPoint(0F, 0F, 0F);
		turretModel[189].rotateAngleY = 2.53072742F;

		turretModel[190].addShapeBox(44F, -29.3F, 1.25F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 255
		turretModel[190].setRotationPoint(0F, 0F, 0F);
		turretModel[190].rotateAngleY = 2.53072742F;

		turretModel[191].addShapeBox(42.5F, -34.8F, 5.75F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 256
		turretModel[191].setRotationPoint(0F, 0F, 0F);
		turretModel[191].rotateAngleY = 2.53072742F;

		turretModel[192].addShapeBox(44.5F, -34.8F, 5.75F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.8F, -0.2F); // Box 257
		turretModel[192].setRotationPoint(0F, 0F, 0F);
		turretModel[192].rotateAngleY = 2.53072742F;

		turretModel[193].addShapeBox(44.5F, -33.8F, 2.05F, 1, 1, 4, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 258
		turretModel[193].setRotationPoint(0F, 0F, 0F);
		turretModel[193].rotateAngleY = 2.53072742F;

		turretModel[194].addShapeBox(44.5F, -34.8F, 1.25F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 259
		turretModel[194].setRotationPoint(0F, 0F, 0F);
		turretModel[194].rotateAngleY = 2.53072742F;

		turretModel[195].addShapeBox(42.5F, -34.8F, 1.25F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 260
		turretModel[195].setRotationPoint(0F, 0F, 0F);
		turretModel[195].rotateAngleY = 2.53072742F;

		turretModel[196].addShapeBox(26.9F, -20.5F, -19F, 2, 10, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		turretModel[196].setRotationPoint(0F, 0F, 0F);

		turretModel[197].addShapeBox(13.9F, -20.5F, -29F, 9, 10, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		turretModel[197].setRotationPoint(0F, 0F, 0F);

		turretModel[198].addShapeBox(-32.5F, -6F, 14.5F, 3, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 263
		turretModel[198].setRotationPoint(0F, 0F, 0F);
		turretModel[198].rotateAngleY = 1.57079633F;

		turretModel[199].addShapeBox(-32.5F, -6F, 20F, 3, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 264
		turretModel[199].setRotationPoint(0F, 0F, 0F);
		turretModel[199].rotateAngleY = 1.57079633F;

		turretModel[200].addShapeBox(-32.5F, -5F, 20F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 265
		turretModel[200].setRotationPoint(0F, 0F, 0F);
		turretModel[200].rotateAngleY = 1.57079633F;

		turretModel[201].addShapeBox(-32.5F, -3F, 15F, 1, 1, 5, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 266
		turretModel[201].setRotationPoint(0F, 0F, 0F);
		turretModel[201].rotateAngleY = 1.57079633F;

		turretModel[202].addShapeBox(-32.5F, -5F, 14.5F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 267
		turretModel[202].setRotationPoint(0F, 0F, 0F);
		turretModel[202].rotateAngleY = 1.57079633F;

		turretModel[203].addShapeBox(-32.5F, 2F, 15F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		turretModel[203].setRotationPoint(0F, 0F, 0F);
		turretModel[203].rotateAngleY = 1.57079633F;

		turretModel[204].addShapeBox(-20F, -26F, -31F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 269
		turretModel[204].setRotationPoint(0F, 0F, 0F);

		turretModel[205].addShapeBox(-16F, -26F, -31F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 270
		turretModel[205].setRotationPoint(0F, 0F, 0F);

		turretModel[206].addShapeBox(-20F, -26F, -32F, 5, 1, 1, 0F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 271
		turretModel[206].setRotationPoint(0F, 0F, 0F);

		turretModel[207].addShapeBox(-24F, -24F, -31F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 272
		turretModel[207].setRotationPoint(0F, 0F, 0F);

		turretModel[208].addShapeBox(-24F, -24F, -32F, 1, 8, 1, 0F, -0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 273
		turretModel[208].setRotationPoint(0F, 0F, 0F);

		turretModel[209].addShapeBox(-24F, -17F, -31F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 274
		turretModel[209].setRotationPoint(0F, 0F, 0F);

		turretModel[210].addShapeBox(42.5F, -34.8F, -6.75F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 275
		turretModel[210].setRotationPoint(0F, 0F, 0F);
		turretModel[210].rotateAngleY = -2.53072742F;

		turretModel[211].addShapeBox(42.5F, -34.8F, -2.25F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 276
		turretModel[211].setRotationPoint(0F, 0F, 0F);
		turretModel[211].rotateAngleY = -2.53072742F;

		turretModel[212].addShapeBox(44.5F, -34.8F, -2.25F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.8F, -0.2F); // Box 277
		turretModel[212].setRotationPoint(0F, 0F, 0F);
		turretModel[212].rotateAngleY = -2.53072742F;

		turretModel[213].addShapeBox(44.5F, -33.8F, -5.95F, 1, 1, 4, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 278
		turretModel[213].setRotationPoint(0F, 0F, 0F);
		turretModel[213].rotateAngleY = -2.53072742F;

		turretModel[214].addShapeBox(44.5F, -34.8F, -6.75F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 279
		turretModel[214].setRotationPoint(0F, 0F, 0F);
		turretModel[214].rotateAngleY = -2.53072742F;

		turretModel[215].addShapeBox(44F, -29.3F, -6.75F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 280
		turretModel[215].setRotationPoint(0F, 0F, 0F);
		turretModel[215].rotateAngleY = -2.53072742F;

		turretModel[216].addShapeBox(46F, -29.3F, -6.75F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 281
		turretModel[216].setRotationPoint(0F, 0F, 0F);
		turretModel[216].rotateAngleY = -2.53072742F;

		turretModel[217].addShapeBox(46F, -28.3F, -5.95F, 1, 1, 4, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 282
		turretModel[217].setRotationPoint(0F, 0F, 0F);
		turretModel[217].rotateAngleY = -2.53072742F;

		turretModel[218].addShapeBox(46F, -29.3F, -2.25F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.8F, -0.2F); // Box 283
		turretModel[218].setRotationPoint(0F, 0F, 0F);
		turretModel[218].rotateAngleY = -2.53072742F;

		turretModel[219].addShapeBox(44F, -29.3F, -2.25F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 284
		turretModel[219].setRotationPoint(0F, 0F, 0F);
		turretModel[219].rotateAngleY = -2.53072742F;

		turretModel[220].addShapeBox(44F, -23.8F, -2.25F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 285
		turretModel[220].setRotationPoint(0F, 0F, 0F);
		turretModel[220].rotateAngleY = -2.53072742F;

		turretModel[221].addShapeBox(46F, -23.8F, -2.25F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.8F, -0.2F); // Box 286
		turretModel[221].setRotationPoint(0F, 0F, 0F);
		turretModel[221].rotateAngleY = -2.53072742F;

		turretModel[222].addShapeBox(46F, -22.8F, -5.95F, 1, 1, 4, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 287
		turretModel[222].setRotationPoint(0F, 0F, 0F);
		turretModel[222].rotateAngleY = -2.53072742F;

		turretModel[223].addShapeBox(46F, -23.8F, -6.75F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 288
		turretModel[223].setRotationPoint(0F, 0F, 0F);
		turretModel[223].rotateAngleY = -2.53072742F;

		turretModel[224].addShapeBox(44F, -23.8F, -6.75F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 289
		turretModel[224].setRotationPoint(0F, 0F, 0F);
		turretModel[224].rotateAngleY = -2.53072742F;

		turretModel[225].addShapeBox(44F, -18.3F, -6.75F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 290
		turretModel[225].setRotationPoint(0F, 0F, 0F);
		turretModel[225].rotateAngleY = -2.53072742F;

		turretModel[226].addShapeBox(46F, -18.3F, -6.75F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 291
		turretModel[226].setRotationPoint(0F, 0F, 0F);
		turretModel[226].rotateAngleY = -2.53072742F;

		turretModel[227].addShapeBox(46F, -17.3F, -5.95F, 1, 1, 4, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 292
		turretModel[227].setRotationPoint(0F, 0F, 0F);
		turretModel[227].rotateAngleY = -2.53072742F;

		turretModel[228].addShapeBox(46F, -18.3F, -2.25F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.8F, -0.2F); // Box 293
		turretModel[228].setRotationPoint(0F, 0F, 0F);
		turretModel[228].rotateAngleY = -2.53072742F;

		turretModel[229].addShapeBox(44F, -18.3F, -2.25F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 294
		turretModel[229].setRotationPoint(0F, 0F, 0F);
		turretModel[229].rotateAngleY = -2.53072742F;

		turretModel[230].addShapeBox(44F, -12.8F, -2.25F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 295
		turretModel[230].setRotationPoint(0F, 0F, 0F);
		turretModel[230].rotateAngleY = -2.53072742F;

		turretModel[231].addShapeBox(46F, -12.8F, -2.25F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.8F, -0.2F); // Box 296
		turretModel[231].setRotationPoint(0F, 0F, 0F);
		turretModel[231].rotateAngleY = -2.53072742F;

		turretModel[232].addShapeBox(46F, -11.8F, -5.95F, 1, 1, 4, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 297
		turretModel[232].setRotationPoint(0F, 0F, 0F);
		turretModel[232].rotateAngleY = -2.53072742F;

		turretModel[233].addShapeBox(46F, -12.8F, -6.75F, 1, 2, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 298
		turretModel[233].setRotationPoint(0F, 0F, 0F);
		turretModel[233].rotateAngleY = -2.53072742F;

		turretModel[234].addShapeBox(44F, -12.8F, -6.75F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 299
		turretModel[234].setRotationPoint(0F, 0F, 0F);
		turretModel[234].rotateAngleY = -2.53072742F;

		turretModel[235].addShapeBox(44F, -6.8F, -1.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.6F, -0.5F, 0F, 0.6F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, -0.5F, 0F, 0.5F, -0.5F); // Box 300
		turretModel[235].setRotationPoint(0F, 0F, 0F);
		turretModel[235].rotateAngleY = -2.53072742F;

		turretModel[236].addShapeBox(45.5F, -6F, -1.5F, 1, 1, 1, 0F, 0.5F, -1F, 0F, -0.9F, 0.3F, 0F, -0.9F, 0.3F, -0.5F, 0.5F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F); // Box 301
		turretModel[236].setRotationPoint(0F, 0F, 0F);
		turretModel[236].rotateAngleY = -2.53072742F;

		turretModel[237].addShapeBox(45.5F, -5F, -1.5F, 1, 6, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 302
		turretModel[237].setRotationPoint(0F, 0F, 0F);
		turretModel[237].rotateAngleY = -2.53072742F;

		turretModel[238].addShapeBox(45.5F, -3F, -6.5F, 1, 1, 5, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 303
		turretModel[238].setRotationPoint(0F, 0F, 0F);
		turretModel[238].rotateAngleY = -2.53072742F;

		turretModel[239].addShapeBox(45.5F, 0F, -6.5F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		turretModel[239].setRotationPoint(0F, 0F, 0F);
		turretModel[239].rotateAngleY = -2.53072742F;

		turretModel[240].addShapeBox(45.5F, -5F, -7F, 1, 6, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 305
		turretModel[240].setRotationPoint(0F, 0F, 0F);
		turretModel[240].rotateAngleY = -2.53072742F;

		turretModel[241].addShapeBox(45.5F, -6F, -7F, 1, 1, 1, 0F, 0.5F, -1F, 0F, -0.9F, 0.3F, 0F, -0.9F, 0.3F, -0.5F, 0.5F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F); // Box 306
		turretModel[241].setRotationPoint(0F, 0F, 0F);
		turretModel[241].rotateAngleY = -2.53072742F;

		turretModel[242].addShapeBox(44F, -6.8F, -7F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.6F, -0.5F, 0F, 0.6F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, -0.5F, 0F, 0.5F, -0.5F); // Box 307
		turretModel[242].setRotationPoint(0F, 0F, 0F);
		turretModel[242].rotateAngleY = -2.53072742F;


		barrelModel = new ModelRendererTurbo[48];
		barrelModel[0] = new ModelRendererTurbo(this, 300, 45, textureX, textureY); // Box 0
		barrelModel[1] = new ModelRendererTurbo(this, 300, 45, textureX, textureY); // Box 1
		barrelModel[2] = new ModelRendererTurbo(this, 300, 45, textureX, textureY); // Box 2
		barrelModel[3] = new ModelRendererTurbo(this, 200, 65, textureX, textureY); // Box 3
		barrelModel[4] = new ModelRendererTurbo(this, 200, 65, textureX, textureY); // Box 4
		barrelModel[5] = new ModelRendererTurbo(this, 200, 65, textureX, textureY); // Box 5
		barrelModel[6] = new ModelRendererTurbo(this, 265, 56, textureX, textureY); // Box 6
		barrelModel[7] = new ModelRendererTurbo(this, 265, 56, textureX, textureY); // Box 7
		barrelModel[8] = new ModelRendererTurbo(this, 265, 56, textureX, textureY); // Box 8
		barrelModel[9] = new ModelRendererTurbo(this, 265, 56, textureX, textureY); // Box 10
		barrelModel[10] = new ModelRendererTurbo(this, 265, 56, textureX, textureY); // Box 11
		barrelModel[11] = new ModelRendererTurbo(this, 265, 56, textureX, textureY); // Box 12
		barrelModel[12] = new ModelRendererTurbo(this, 265, 56, textureX, textureY); // Box 13
		barrelModel[13] = new ModelRendererTurbo(this, 265, 56, textureX, textureY); // Box 14
		barrelModel[14] = new ModelRendererTurbo(this, 357, 53, textureX, textureY); // Box 15
		barrelModel[15] = new ModelRendererTurbo(this, 356, 35, textureX, textureY); // Box 16
		barrelModel[16] = new ModelRendererTurbo(this, 357, 53, textureX, textureY); // Box 17
		barrelModel[17] = new ModelRendererTurbo(this, 331, 52, textureX, textureY); // Box 18
		barrelModel[18] = new ModelRendererTurbo(this, 331, 52, textureX, textureY); // Box 19
		barrelModel[19] = new ModelRendererTurbo(this, 331, 52, textureX, textureY); // Box 20
		barrelModel[20] = new ModelRendererTurbo(this, 350, 54, textureX, textureY); // Box 21
		barrelModel[21] = new ModelRendererTurbo(this, 350, 54, textureX, textureY); // Box 22
		barrelModel[22] = new ModelRendererTurbo(this, 350, 73, textureX, textureY); // Box 23
		barrelModel[23] = new ModelRendererTurbo(this, 350, 73, textureX, textureY); // Box 24
		barrelModel[24] = new ModelRendererTurbo(this, 350, 73, textureX, textureY); // Box 25
		barrelModel[25] = new ModelRendererTurbo(this, 350, 73, textureX, textureY); // Box 26
		barrelModel[26] = new ModelRendererTurbo(this, 350, 73, textureX, textureY); // Box 27
		barrelModel[27] = new ModelRendererTurbo(this, 350, 73, textureX, textureY); // Box 28
		barrelModel[28] = new ModelRendererTurbo(this, 350, 73, textureX, textureY); // Box 29
		barrelModel[29] = new ModelRendererTurbo(this, 350, 73, textureX, textureY); // Box 30
		barrelModel[30] = new ModelRendererTurbo(this, 350, 73, textureX, textureY); // Box 31
		barrelModel[31] = new ModelRendererTurbo(this, 350, 73, textureX, textureY); // Box 32
		barrelModel[32] = new ModelRendererTurbo(this, 350, 73, textureX, textureY); // Box 33
		barrelModel[33] = new ModelRendererTurbo(this, 1, 88, textureX, textureY); // Box 34
		barrelModel[34] = new ModelRendererTurbo(this, 1, 88, textureX, textureY); // Box 35
		barrelModel[35] = new ModelRendererTurbo(this, 1, 88, textureX, textureY); // Box 36
		barrelModel[36] = new ModelRendererTurbo(this, 1, 88, textureX, textureY); // Box 37
		barrelModel[37] = new ModelRendererTurbo(this, 1, 88, textureX, textureY); // Box 38
		barrelModel[38] = new ModelRendererTurbo(this, 0, 71, textureX, textureY); // Box 41
		barrelModel[39] = new ModelRendererTurbo(this, 0, 71, textureX, textureY); // Box 42
		barrelModel[40] = new ModelRendererTurbo(this, 0, 71, textureX, textureY); // Box 43
		barrelModel[41] = new ModelRendererTurbo(this, 0, 71, textureX, textureY); // Box 44
		barrelModel[42] = new ModelRendererTurbo(this, 0, 71, textureX, textureY); // Box 45
		barrelModel[43] = new ModelRendererTurbo(this, 0, 71, textureX, textureY); // Box 46
		barrelModel[44] = new ModelRendererTurbo(this, 0, 71, textureX, textureY); // Box 47
		barrelModel[45] = new ModelRendererTurbo(this, 0, 71, textureX, textureY); // Box 48
		barrelModel[46] = new ModelRendererTurbo(this, 0, 71, textureX, textureY); // Box 49
		barrelModel[47] = new ModelRendererTurbo(this, 0, 71, textureX, textureY); // Box 50

		barrelModel[0].addShapeBox(28F, -3.5F, -4.5F, 7, 7, 7, 0F, 0F, -2.1F, -0.25F, 0F, -2.5F, -1.25F, 0F, -2.5F, -1.25F, 0F, -2.1F, -0.25F, 0F, -2.1F, -0.25F, 0F, -2.5F, -1.25F, 0F, -2.5F, -1.25F, 0F, -2.1F, -0.25F); // Box 0
		barrelModel[0].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[1].addShapeBox(28F, -3.5F, -4.5F, 7, 7, 7, 0F, 0F, -0.25F, -2.1F, 0F, -1.25F, -2.5F, 0F, -1.25F, -2.5F, 0F, -0.25F, -2.1F, 0F, -4.9F, -0.25F, 0F, -4.5F, -1.25F, 0F, -4.5F, -1.25F, 0F, -4.9F, -0.25F); // Box 1
		barrelModel[1].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[2].addShapeBox(28F, -3.5F, -4.5F, 7, 7, 7, 0F, 0F, -4.9F, -0.25F, 0F, -4.5F, -1.25F, 0F, -4.5F, -1.25F, 0F, -4.9F, -0.25F, 0F, -0.25F, -2.1F, 0F, -1.25F, -2.5F, 0F, -1.25F, -2.5F, 0F, -0.25F, -2.1F); // Box 2
		barrelModel[2].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[3].addShapeBox(35F, -2F, -3F, 59, 4, 4, 0F, 0F, -1F, 0.25F, 0F, -1.4F, -0.35F, 0F, -1.4F, -0.35F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -1.4F, -0.35F, 0F, -1.4F, -0.35F, 0F, -1F, 0.25F); // Box 3
		barrelModel[3].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[4].addShapeBox(35F, -2F, -3F, 59, 4, 4, 0F, 0F, 0.25F, -1F, 0F, -0.35F, -1.4F, 0F, -0.35F, -1.4F, 0F, 0.25F, -1F, 0F, -3F, 0.25F, 0F, -2.6F, -0.35F, 0F, -2.6F, -0.35F, 0F, -3F, 0.25F); // Box 4
		barrelModel[4].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[5].addShapeBox(35F, -2F, -3F, 59, 4, 4, 0F, 0F, -3F, 0.25F, 0F, -2.6F, -0.35F, 0F, -2.6F, -0.35F, 0F, -3F, 0.25F, 0F, 0.25F, -1F, 0F, -0.35F, -1.4F, 0F, -0.35F, -1.4F, 0F, 0.25F, -1F); // Box 5
		barrelModel[5].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[6].addShapeBox(94F, -1F, -3F, 1, 2, 4, 0F, 0F, -0.5F, -3.2F, 0F, -0.5F, -3.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, -3.2F, 0F, -0.5F, -3.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 6
		barrelModel[6].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[7].addShapeBox(94F, -2F, -3F, 1, 1, 4, 0F, 0F, -0.8F, -2.5F, 0F, -0.8F, -2.5F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0.5F, -3.2F, 0F, 0.5F, -3.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 7
		barrelModel[7].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[8].addShapeBox(94F, -2F, -3F, 1, 1, 4, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F); // Box 8
		barrelModel[8].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[9].addShapeBox(94F, 1F, -3F, 1, 1, 4, 0F, 0F, 0.5F, -3.2F, 0F, 0.5F, -3.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, -2.5F, 0F, -0.8F, -2.5F, 0F, 0F, -1.2F, 0F, 0F, -1.2F); // Box 10
		barrelModel[9].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[10].addShapeBox(94F, 1F, -3F, 1, 1, 4, 0F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F); // Box 11
		barrelModel[10].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[11].addShapeBox(94F, 1F, -3F, 1, 1, 4, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, -3.2F, 0F, 0.5F, -3.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, -0.8F, -2.5F, 0F, -0.8F, -2.5F); // Box 12
		barrelModel[11].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[12].addShapeBox(94F, -1F, -3F, 1, 2, 4, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, -3.2F, 0F, -0.5F, -3.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, -3.2F, 0F, -0.5F, -3.2F); // Box 13
		barrelModel[12].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[13].addShapeBox(94F, -2F, -3F, 1, 1, 4, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, -0.8F, -2.5F, 0F, -0.8F, -2.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, -3.2F, 0F, 0.5F, -3.2F); // Box 14
		barrelModel[13].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[14].addShapeBox(15F, -4F, -6F, 12, 4, 10, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 15
		barrelModel[14].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[15].addShapeBox(15F, -0.5F, -6F, 12, 3, 10, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 16
		barrelModel[15].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[16].addShapeBox(15F, 2F, -6F, 12, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F); // Box 17
		barrelModel[16].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[17].addShapeBox(27F, -4.5F, -6F, 1, 4, 10, 0F, 0F, 0F, -3.2F, 0F, 0F, -3.2F, 0F, 0F, -3.2F, 0F, 0F, -3.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 18
		barrelModel[17].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[18].addShapeBox(27F, -0.5F, -6F, 1, 3, 10, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 19
		barrelModel[18].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[19].addShapeBox(27F, 2F, -6F, 1, 2, 10, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3.2F, 0F, 0F, -3.2F, 0F, 0F, -3.2F, 0F, 0F, -3.2F); // Box 20
		barrelModel[19].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[20].addShapeBox(25F, 2.5F, -4.3F, 1, 4, 1, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 21
		barrelModel[20].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[21].addShapeBox(25F, 2.5F, 1.3F, 1, 4, 1, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F); // Box 22
		barrelModel[21].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[22].addShapeBox(14F, 4.5F, -3F, 14, 1, 4, 0F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 23
		barrelModel[22].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[23].addShapeBox(28.5F, 4.5F, -3F, 2, 1, 4, 0F, 0F, 0F, -0.3F, 0F, -1.3F, -0.3F, 0F, -1.3F, -0.3F, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F, -1F, 0.7F, -0.3F, -1F, 0.7F, -0.3F, 0.2F, 0F, -0.3F); // Box 24
		barrelModel[23].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[24].addShapeBox(29.5F, 6.2F, -3F, 1, 2, 4, 0F, 0F, 0F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0F, -0.3F, -0.7F, 0F, -0.3F, 0.7F, 0F, -0.3F, 0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F); // Box 25
		barrelModel[24].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[25].addShapeBox(14F, 4.5F, -3.3F, 14, 4, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 26
		barrelModel[25].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[26].addShapeBox(28.5F, 4.5F, -3.3F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, -0.4F, 0F, 0F, -0.4F, 0.7F, -0.3F, 0F, -2.6F, -0.3F, 0F, -2.6F, -0.3F, -0.4F, 0.7F, -0.3F, -0.4F); // Box 27
		barrelModel[26].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[27].addShapeBox(27.5F, 6.2F, -3.3F, 3, 2, 1, 0F, -0.4F, -1.9F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.4F, -0.4F, -1.9F, -0.4F, -0.4F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 28
		barrelModel[27].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[28].addShapeBox(27.9F, 8.2F, -3.3F, 3, 4, 1, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, -0.4F, -1F, 0.3F, -0.4F); // Box 29
		barrelModel[28].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[29].addShapeBox(27.9F, 8.2F, 0.699999999999999F, 3, 4, 1, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, -0.4F, -1F, 0.3F, -0.4F); // Box 30
		barrelModel[29].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[30].addShapeBox(27.5F, 6.2F, 0.699999999999999F, 3, 2, 1, 0F, -0.4F, -1.9F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.4F, -0.4F, -1.9F, -0.4F, -0.4F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 31
		barrelModel[30].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[31].addShapeBox(28.5F, 4.5F, 0.699999999999999F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, -0.4F, 0F, 0F, -0.4F, 0.7F, -0.3F, 0F, -2.6F, -0.3F, 0F, -2.6F, -0.3F, -0.4F, 0.7F, -0.3F, -0.4F); // Box 32
		barrelModel[31].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[32].addShapeBox(14F, 4.5F, 0.699999999999999F, 14, 4, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 33
		barrelModel[32].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[33].addShapeBox(-15F, -11.5F, -7.5F, 31, 8, 13, 0F, -4.5F, -0.2F, 0F, -4.5F, -0.2F, 0F, -4.5F, -0.2F, 0F, -4.5F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 34
		barrelModel[33].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[34].addShapeBox(-15F, -15.5F, -7.5F, 31, 4, 13, 0F, -11.5F, -0.2F, 0F, -11.5F, -0.2F, 0F, -11.5F, -0.2F, 0F, -11.5F, -0.2F, 0F, -4.5F, 0.2F, 0F, -4.5F, 0.2F, 0F, -4.5F, 0.2F, 0F, -4.5F, 0.2F, 0F); // Box 35
		barrelModel[34].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[35].addShapeBox(-15F, -4.5F, -7.5F, 31, 9, 13, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 36
		barrelModel[35].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[36].addShapeBox(-15F, 3.5F, -7.5F, 31, 8, 13, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -4.5F, -0.2F, 0F, -4.5F, -0.2F, 0F, -4.5F, -0.2F, 0F, -4.5F, -0.2F, 0F); // Box 37
		barrelModel[36].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[37].addShapeBox(-15F, 11.5F, -7.5F, 31, 4, 13, 0F, -4.5F, 0.2F, 0F, -4.5F, 0.2F, 0F, -4.5F, 0.2F, 0F, -4.5F, 0.2F, 0F, -11.5F, -0.2F, 0F, -11.5F, -0.2F, 0F, -11.5F, -0.2F, 0F, -11.5F, -0.2F, 0F); // Box 38
		barrelModel[37].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[38].addShapeBox(-16.5F, -12.2F, -9.5F, 34, 7, 2, 0F, -4.8F, 0.2F, 0F, -4.8F, 0.2F, 0F, -4.8F, 0.2F, 0F, -4.8F, 0.2F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F); // Box 41
		barrelModel[38].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[39].addShapeBox(-16.5F, -17.2F, -9.5F, 34, 5, 2, 0F, -12.3F, -0.3F, 0F, -12.3F, -0.3F, 0F, -12.3F, -0.3F, 0F, -12.3F, -0.3F, 0F, -4.8F, -0.2F, 0F, -4.8F, -0.2F, 0F, -4.8F, -0.2F, 0F, -4.8F, -0.2F, 0F); // Box 42
		barrelModel[39].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[40].addShapeBox(-16.5F, -5.2F, -9.5F, 34, 10, 2, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F); // Box 43
		barrelModel[40].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[41].addShapeBox(-16.5F, 4.8F, -9.5F, 34, 7, 2, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -4.8F, 0.2F, 0F, -4.8F, 0.2F, 0F, -4.8F, 0.2F, 0F, -4.8F, 0.2F, 0F); // Box 44
		barrelModel[41].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[42].addShapeBox(-16.5F, 11.8F, -9.5F, 34, 5, 2, 0F, -4.8F, -0.2F, 0F, -4.8F, -0.2F, 0F, -4.8F, -0.2F, 0F, -4.8F, -0.2F, 0F, -12.3F, -0.3F, 0F, -12.3F, -0.3F, 0F, -12.3F, -0.3F, 0F, -12.3F, -0.3F, 0F); // Box 45
		barrelModel[42].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[43].addShapeBox(-16.5F, 11.8F, 5.5F, 34, 5, 2, 0F, -4.8F, -0.2F, 0F, -4.8F, -0.2F, 0F, -4.8F, -0.2F, 0F, -4.8F, -0.2F, 0F, -12.3F, -0.3F, 0F, -12.3F, -0.3F, 0F, -12.3F, -0.3F, 0F, -12.3F, -0.3F, 0F); // Box 46
		barrelModel[43].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[44].addShapeBox(-16.5F, 4.8F, 5.5F, 34, 7, 2, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -4.8F, 0.2F, 0F, -4.8F, 0.2F, 0F, -4.8F, 0.2F, 0F, -4.8F, 0.2F, 0F); // Box 47
		barrelModel[44].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[45].addShapeBox(-16.5F, -5.2F, 5.5F, 34, 10, 2, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F); // Box 48
		barrelModel[45].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[46].addShapeBox(-16.5F, -12.2F, 5.5F, 34, 7, 2, 0F, -4.8F, 0.2F, 0F, -4.8F, 0.2F, 0F, -4.8F, 0.2F, 0F, -4.8F, 0.2F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F); // Box 49
		barrelModel[46].setRotationPoint(4.5F, -22.5F, 1F);

		barrelModel[47].addShapeBox(-16.5F, -17.2F, 5.5F, 34, 5, 2, 0F, -12.3F, -0.3F, 0F, -12.3F, -0.3F, 0F, -12.3F, -0.3F, 0F, -12.3F, -0.3F, 0F, -4.8F, -0.2F, 0F, -4.8F, -0.2F, 0F, -4.8F, -0.2F, 0F, -4.8F, -0.2F, 0F); // Box 50
		barrelModel[47].setRotationPoint(4.5F, -22.5F, 1F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}