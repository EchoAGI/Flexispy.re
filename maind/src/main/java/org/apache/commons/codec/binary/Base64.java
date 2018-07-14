package org.apache.commons.codec.binary;

import java.math.BigInteger;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

public class Base64
  implements BinaryEncoder, BinaryDecoder
{
  static final byte[] CHUNK_SEPARATOR;
  static final int CHUNK_SIZE = 76;
  private static final byte[] DECODE_TABLE;
  private static final int DEFAULT_BUFFER_RESIZE_FACTOR = 2;
  private static final int DEFAULT_BUFFER_SIZE = 8192;
  private static final int MASK_6BITS = 63;
  private static final int MASK_8BITS = 255;
  private static final byte PAD = 61;
  private static final byte[] STANDARD_ENCODE_TABLE;
  private static final byte[] URL_SAFE_ENCODE_TABLE;
  private byte[] buffer;
  private int currentLinePos;
  private final int decodeSize;
  private final int encodeSize;
  private final byte[] encodeTable;
  private boolean eof;
  private final int lineLength;
  private final byte[] lineSeparator;
  private int modulus;
  private int pos;
  private int readPos;
  private int x;
  
  static
  {
    int i = 64;
    byte[] arrayOfByte = new byte[2];
    byte[] tmp8_7 = arrayOfByte;
    tmp8_7[0] = 13;
    tmp8_7[1] = 10;
    CHUNK_SEPARATOR = arrayOfByte;
    arrayOfByte = new byte[i];
    byte[] tmp26_25 = arrayOfByte;
    byte[] tmp27_26 = tmp26_25;
    byte[] tmp27_26 = tmp26_25;
    tmp27_26[0] = 65;
    tmp27_26[1] = 66;
    byte[] tmp36_27 = tmp27_26;
    byte[] tmp36_27 = tmp27_26;
    tmp36_27[2] = 67;
    tmp36_27[3] = 68;
    byte[] tmp45_36 = tmp36_27;
    byte[] tmp45_36 = tmp36_27;
    tmp45_36[4] = 69;
    tmp45_36[5] = 70;
    byte[] tmp54_45 = tmp45_36;
    byte[] tmp54_45 = tmp45_36;
    tmp54_45[6] = 71;
    tmp54_45[7] = 72;
    byte[] tmp65_54 = tmp54_45;
    byte[] tmp65_54 = tmp54_45;
    tmp65_54[8] = 73;
    tmp65_54[9] = 74;
    byte[] tmp76_65 = tmp65_54;
    byte[] tmp76_65 = tmp65_54;
    tmp76_65[10] = 75;
    tmp76_65[11] = 76;
    byte[] tmp87_76 = tmp76_65;
    byte[] tmp87_76 = tmp76_65;
    tmp87_76[12] = 77;
    tmp87_76[13] = 78;
    byte[] tmp98_87 = tmp87_76;
    byte[] tmp98_87 = tmp87_76;
    tmp98_87[14] = 79;
    tmp98_87[15] = 80;
    byte[] tmp109_98 = tmp98_87;
    byte[] tmp109_98 = tmp98_87;
    tmp109_98[16] = 81;
    tmp109_98[17] = 82;
    byte[] tmp120_109 = tmp109_98;
    byte[] tmp120_109 = tmp109_98;
    tmp120_109[18] = 83;
    tmp120_109[19] = 84;
    byte[] tmp131_120 = tmp120_109;
    byte[] tmp131_120 = tmp120_109;
    tmp131_120[20] = 85;
    tmp131_120[21] = 86;
    byte[] tmp142_131 = tmp131_120;
    byte[] tmp142_131 = tmp131_120;
    tmp142_131[22] = 87;
    tmp142_131[23] = 88;
    byte[] tmp153_142 = tmp142_131;
    byte[] tmp153_142 = tmp142_131;
    tmp153_142[24] = 89;
    tmp153_142[25] = 90;
    byte[] tmp164_153 = tmp153_142;
    byte[] tmp164_153 = tmp153_142;
    tmp164_153[26] = 97;
    tmp164_153[27] = 98;
    byte[] tmp175_164 = tmp164_153;
    byte[] tmp175_164 = tmp164_153;
    tmp175_164[28] = 99;
    tmp175_164[29] = 100;
    byte[] tmp186_175 = tmp175_164;
    byte[] tmp186_175 = tmp175_164;
    tmp186_175[30] = 101;
    tmp186_175[31] = 102;
    byte[] tmp197_186 = tmp186_175;
    byte[] tmp197_186 = tmp186_175;
    tmp197_186[32] = 103;
    tmp197_186[33] = 104;
    byte[] tmp208_197 = tmp197_186;
    byte[] tmp208_197 = tmp197_186;
    tmp208_197[34] = 105;
    tmp208_197[35] = 106;
    byte[] tmp219_208 = tmp208_197;
    byte[] tmp219_208 = tmp208_197;
    tmp219_208[36] = 107;
    tmp219_208[37] = 108;
    byte[] tmp230_219 = tmp219_208;
    byte[] tmp230_219 = tmp219_208;
    tmp230_219[38] = 109;
    tmp230_219[39] = 110;
    byte[] tmp241_230 = tmp230_219;
    byte[] tmp241_230 = tmp230_219;
    tmp241_230[40] = 111;
    tmp241_230[41] = 112;
    byte[] tmp252_241 = tmp241_230;
    byte[] tmp252_241 = tmp241_230;
    tmp252_241[42] = 113;
    tmp252_241[43] = 114;
    byte[] tmp263_252 = tmp252_241;
    byte[] tmp263_252 = tmp252_241;
    tmp263_252[44] = 115;
    tmp263_252[45] = 116;
    byte[] tmp274_263 = tmp263_252;
    byte[] tmp274_263 = tmp263_252;
    tmp274_263[46] = 117;
    tmp274_263[47] = 118;
    byte[] tmp285_274 = tmp274_263;
    byte[] tmp285_274 = tmp274_263;
    tmp285_274[48] = 119;
    tmp285_274[49] = 120;
    byte[] tmp296_285 = tmp285_274;
    byte[] tmp296_285 = tmp285_274;
    tmp296_285[50] = 121;
    tmp296_285[51] = 122;
    byte[] tmp307_296 = tmp296_285;
    byte[] tmp307_296 = tmp296_285;
    tmp307_296[52] = 48;
    tmp307_296[53] = 49;
    byte[] tmp318_307 = tmp307_296;
    byte[] tmp318_307 = tmp307_296;
    tmp318_307[54] = 50;
    tmp318_307[55] = 51;
    byte[] tmp329_318 = tmp318_307;
    byte[] tmp329_318 = tmp318_307;
    tmp329_318[56] = 52;
    tmp329_318[57] = 53;
    byte[] tmp340_329 = tmp329_318;
    byte[] tmp340_329 = tmp329_318;
    tmp340_329[58] = 54;
    tmp340_329[59] = 55;
    byte[] tmp351_340 = tmp340_329;
    byte[] tmp351_340 = tmp340_329;
    tmp351_340[60] = 56;
    tmp351_340[61] = 57;
    tmp351_340[62] = 43;
    tmp351_340[63] = 47;
    STANDARD_ENCODE_TABLE = arrayOfByte;
    arrayOfByte = new byte[i];
    byte[] tmp381_380 = arrayOfByte;
    byte[] tmp382_381 = tmp381_380;
    byte[] tmp382_381 = tmp381_380;
    tmp382_381[0] = 65;
    tmp382_381[1] = 66;
    byte[] tmp391_382 = tmp382_381;
    byte[] tmp391_382 = tmp382_381;
    tmp391_382[2] = 67;
    tmp391_382[3] = 68;
    byte[] tmp400_391 = tmp391_382;
    byte[] tmp400_391 = tmp391_382;
    tmp400_391[4] = 69;
    tmp400_391[5] = 70;
    byte[] tmp409_400 = tmp400_391;
    byte[] tmp409_400 = tmp400_391;
    tmp409_400[6] = 71;
    tmp409_400[7] = 72;
    byte[] tmp420_409 = tmp409_400;
    byte[] tmp420_409 = tmp409_400;
    tmp420_409[8] = 73;
    tmp420_409[9] = 74;
    byte[] tmp431_420 = tmp420_409;
    byte[] tmp431_420 = tmp420_409;
    tmp431_420[10] = 75;
    tmp431_420[11] = 76;
    byte[] tmp442_431 = tmp431_420;
    byte[] tmp442_431 = tmp431_420;
    tmp442_431[12] = 77;
    tmp442_431[13] = 78;
    byte[] tmp453_442 = tmp442_431;
    byte[] tmp453_442 = tmp442_431;
    tmp453_442[14] = 79;
    tmp453_442[15] = 80;
    byte[] tmp464_453 = tmp453_442;
    byte[] tmp464_453 = tmp453_442;
    tmp464_453[16] = 81;
    tmp464_453[17] = 82;
    byte[] tmp475_464 = tmp464_453;
    byte[] tmp475_464 = tmp464_453;
    tmp475_464[18] = 83;
    tmp475_464[19] = 84;
    byte[] tmp486_475 = tmp475_464;
    byte[] tmp486_475 = tmp475_464;
    tmp486_475[20] = 85;
    tmp486_475[21] = 86;
    byte[] tmp497_486 = tmp486_475;
    byte[] tmp497_486 = tmp486_475;
    tmp497_486[22] = 87;
    tmp497_486[23] = 88;
    byte[] tmp508_497 = tmp497_486;
    byte[] tmp508_497 = tmp497_486;
    tmp508_497[24] = 89;
    tmp508_497[25] = 90;
    byte[] tmp519_508 = tmp508_497;
    byte[] tmp519_508 = tmp508_497;
    tmp519_508[26] = 97;
    tmp519_508[27] = 98;
    byte[] tmp530_519 = tmp519_508;
    byte[] tmp530_519 = tmp519_508;
    tmp530_519[28] = 99;
    tmp530_519[29] = 100;
    byte[] tmp541_530 = tmp530_519;
    byte[] tmp541_530 = tmp530_519;
    tmp541_530[30] = 101;
    tmp541_530[31] = 102;
    byte[] tmp552_541 = tmp541_530;
    byte[] tmp552_541 = tmp541_530;
    tmp552_541[32] = 103;
    tmp552_541[33] = 104;
    byte[] tmp563_552 = tmp552_541;
    byte[] tmp563_552 = tmp552_541;
    tmp563_552[34] = 105;
    tmp563_552[35] = 106;
    byte[] tmp574_563 = tmp563_552;
    byte[] tmp574_563 = tmp563_552;
    tmp574_563[36] = 107;
    tmp574_563[37] = 108;
    byte[] tmp585_574 = tmp574_563;
    byte[] tmp585_574 = tmp574_563;
    tmp585_574[38] = 109;
    tmp585_574[39] = 110;
    byte[] tmp596_585 = tmp585_574;
    byte[] tmp596_585 = tmp585_574;
    tmp596_585[40] = 111;
    tmp596_585[41] = 112;
    byte[] tmp607_596 = tmp596_585;
    byte[] tmp607_596 = tmp596_585;
    tmp607_596[42] = 113;
    tmp607_596[43] = 114;
    byte[] tmp618_607 = tmp607_596;
    byte[] tmp618_607 = tmp607_596;
    tmp618_607[44] = 115;
    tmp618_607[45] = 116;
    byte[] tmp629_618 = tmp618_607;
    byte[] tmp629_618 = tmp618_607;
    tmp629_618[46] = 117;
    tmp629_618[47] = 118;
    byte[] tmp640_629 = tmp629_618;
    byte[] tmp640_629 = tmp629_618;
    tmp640_629[48] = 119;
    tmp640_629[49] = 120;
    byte[] tmp651_640 = tmp640_629;
    byte[] tmp651_640 = tmp640_629;
    tmp651_640[50] = 121;
    tmp651_640[51] = 122;
    byte[] tmp662_651 = tmp651_640;
    byte[] tmp662_651 = tmp651_640;
    tmp662_651[52] = 48;
    tmp662_651[53] = 49;
    byte[] tmp673_662 = tmp662_651;
    byte[] tmp673_662 = tmp662_651;
    tmp673_662[54] = 50;
    tmp673_662[55] = 51;
    byte[] tmp684_673 = tmp673_662;
    byte[] tmp684_673 = tmp673_662;
    tmp684_673[56] = 52;
    tmp684_673[57] = 53;
    byte[] tmp695_684 = tmp684_673;
    byte[] tmp695_684 = tmp684_673;
    tmp695_684[58] = 54;
    tmp695_684[59] = 55;
    byte[] tmp706_695 = tmp695_684;
    byte[] tmp706_695 = tmp695_684;
    tmp706_695[60] = 56;
    tmp706_695[61] = 57;
    tmp706_695[62] = 45;
    tmp706_695[63] = 95;
    URL_SAFE_ENCODE_TABLE = arrayOfByte;
    arrayOfByte = new byte[123];
    byte[] tmp737_736 = arrayOfByte;
    byte[] tmp738_737 = tmp737_736;
    byte[] tmp738_737 = tmp737_736;
    tmp738_737[0] = -1;
    tmp738_737[1] = -1;
    byte[] tmp745_738 = tmp738_737;
    byte[] tmp745_738 = tmp738_737;
    tmp745_738[2] = -1;
    tmp745_738[3] = -1;
    byte[] tmp752_745 = tmp745_738;
    byte[] tmp752_745 = tmp745_738;
    tmp752_745[4] = -1;
    tmp752_745[5] = -1;
    byte[] tmp759_752 = tmp752_745;
    byte[] tmp759_752 = tmp752_745;
    tmp759_752[6] = -1;
    tmp759_752[7] = -1;
    byte[] tmp768_759 = tmp759_752;
    byte[] tmp768_759 = tmp759_752;
    tmp768_759[8] = -1;
    tmp768_759[9] = -1;
    byte[] tmp777_768 = tmp768_759;
    byte[] tmp777_768 = tmp768_759;
    tmp777_768[10] = -1;
    tmp777_768[11] = -1;
    byte[] tmp786_777 = tmp777_768;
    byte[] tmp786_777 = tmp777_768;
    tmp786_777[12] = -1;
    tmp786_777[13] = -1;
    byte[] tmp795_786 = tmp786_777;
    byte[] tmp795_786 = tmp786_777;
    tmp795_786[14] = -1;
    tmp795_786[15] = -1;
    byte[] tmp804_795 = tmp795_786;
    byte[] tmp804_795 = tmp795_786;
    tmp804_795[16] = -1;
    tmp804_795[17] = -1;
    byte[] tmp813_804 = tmp804_795;
    byte[] tmp813_804 = tmp804_795;
    tmp813_804[18] = -1;
    tmp813_804[19] = -1;
    byte[] tmp822_813 = tmp813_804;
    byte[] tmp822_813 = tmp813_804;
    tmp822_813[20] = -1;
    tmp822_813[21] = -1;
    byte[] tmp831_822 = tmp822_813;
    byte[] tmp831_822 = tmp822_813;
    tmp831_822[22] = -1;
    tmp831_822[23] = -1;
    byte[] tmp840_831 = tmp831_822;
    byte[] tmp840_831 = tmp831_822;
    tmp840_831[24] = -1;
    tmp840_831[25] = -1;
    byte[] tmp849_840 = tmp840_831;
    byte[] tmp849_840 = tmp840_831;
    tmp849_840[26] = -1;
    tmp849_840[27] = -1;
    byte[] tmp858_849 = tmp849_840;
    byte[] tmp858_849 = tmp849_840;
    tmp858_849[28] = -1;
    tmp858_849[29] = -1;
    byte[] tmp867_858 = tmp858_849;
    byte[] tmp867_858 = tmp858_849;
    tmp867_858[30] = -1;
    tmp867_858[31] = -1;
    byte[] tmp876_867 = tmp867_858;
    byte[] tmp876_867 = tmp867_858;
    tmp876_867[32] = -1;
    tmp876_867[33] = -1;
    byte[] tmp885_876 = tmp876_867;
    byte[] tmp885_876 = tmp876_867;
    tmp885_876[34] = -1;
    tmp885_876[35] = -1;
    byte[] tmp894_885 = tmp885_876;
    byte[] tmp894_885 = tmp885_876;
    tmp894_885[36] = -1;
    tmp894_885[37] = -1;
    byte[] tmp903_894 = tmp894_885;
    byte[] tmp903_894 = tmp894_885;
    tmp903_894[38] = -1;
    tmp903_894[39] = -1;
    byte[] tmp912_903 = tmp903_894;
    byte[] tmp912_903 = tmp903_894;
    tmp912_903[40] = -1;
    tmp912_903[41] = -1;
    byte[] tmp921_912 = tmp912_903;
    byte[] tmp921_912 = tmp912_903;
    tmp921_912[42] = -1;
    tmp921_912[43] = 62;
    byte[] tmp931_921 = tmp921_912;
    byte[] tmp931_921 = tmp921_912;
    tmp931_921[44] = -1;
    tmp931_921[45] = 62;
    byte[] tmp941_931 = tmp931_921;
    byte[] tmp941_931 = tmp931_921;
    tmp941_931[46] = -1;
    tmp941_931[47] = 63;
    byte[] tmp951_941 = tmp941_931;
    byte[] tmp951_941 = tmp941_931;
    tmp951_941[48] = 52;
    tmp951_941[49] = 53;
    byte[] tmp962_951 = tmp951_941;
    byte[] tmp962_951 = tmp951_941;
    tmp962_951[50] = 54;
    tmp962_951[51] = 55;
    byte[] tmp973_962 = tmp962_951;
    byte[] tmp973_962 = tmp962_951;
    tmp973_962[52] = 56;
    tmp973_962[53] = 57;
    byte[] tmp984_973 = tmp973_962;
    byte[] tmp984_973 = tmp973_962;
    tmp984_973[54] = 58;
    tmp984_973[55] = 59;
    byte[] tmp995_984 = tmp984_973;
    byte[] tmp995_984 = tmp984_973;
    tmp995_984[56] = 60;
    tmp995_984[57] = 61;
    byte[] tmp1006_995 = tmp995_984;
    byte[] tmp1006_995 = tmp995_984;
    tmp1006_995[58] = -1;
    tmp1006_995[59] = -1;
    byte[] tmp1015_1006 = tmp1006_995;
    byte[] tmp1015_1006 = tmp1006_995;
    tmp1015_1006[60] = -1;
    tmp1015_1006[61] = -1;
    byte[] tmp1024_1015 = tmp1015_1006;
    byte[] tmp1024_1015 = tmp1015_1006;
    tmp1024_1015[62] = -1;
    tmp1024_1015[63] = -1;
    byte[] tmp1033_1024 = tmp1024_1015;
    byte[] tmp1033_1024 = tmp1024_1015;
    tmp1033_1024[64] = -1;
    tmp1033_1024[65] = 0;
    byte[] tmp1042_1033 = tmp1033_1024;
    byte[] tmp1042_1033 = tmp1033_1024;
    tmp1042_1033[66] = 1;
    tmp1042_1033[67] = 2;
    byte[] tmp1051_1042 = tmp1042_1033;
    byte[] tmp1051_1042 = tmp1042_1033;
    tmp1051_1042[68] = 3;
    tmp1051_1042[69] = 4;
    byte[] tmp1060_1051 = tmp1051_1042;
    byte[] tmp1060_1051 = tmp1051_1042;
    tmp1060_1051[70] = 5;
    tmp1060_1051[71] = 6;
    byte[] tmp1070_1060 = tmp1060_1051;
    byte[] tmp1070_1060 = tmp1060_1051;
    tmp1070_1060[72] = 7;
    tmp1070_1060[73] = 8;
    byte[] tmp1081_1070 = tmp1070_1060;
    byte[] tmp1081_1070 = tmp1070_1060;
    tmp1081_1070[74] = 9;
    tmp1081_1070[75] = 10;
    byte[] tmp1092_1081 = tmp1081_1070;
    byte[] tmp1092_1081 = tmp1081_1070;
    tmp1092_1081[76] = 11;
    tmp1092_1081[77] = 12;
    byte[] tmp1103_1092 = tmp1092_1081;
    byte[] tmp1103_1092 = tmp1092_1081;
    tmp1103_1092[78] = 13;
    tmp1103_1092[79] = 14;
    byte[] tmp1114_1103 = tmp1103_1092;
    byte[] tmp1114_1103 = tmp1103_1092;
    tmp1114_1103[80] = 15;
    tmp1114_1103[81] = 16;
    byte[] tmp1125_1114 = tmp1114_1103;
    byte[] tmp1125_1114 = tmp1114_1103;
    tmp1125_1114[82] = 17;
    tmp1125_1114[83] = 18;
    byte[] tmp1136_1125 = tmp1125_1114;
    byte[] tmp1136_1125 = tmp1125_1114;
    tmp1136_1125[84] = 19;
    tmp1136_1125[85] = 20;
    byte[] tmp1147_1136 = tmp1136_1125;
    byte[] tmp1147_1136 = tmp1136_1125;
    tmp1147_1136[86] = 21;
    tmp1147_1136[87] = 22;
    byte[] tmp1158_1147 = tmp1147_1136;
    byte[] tmp1158_1147 = tmp1147_1136;
    tmp1158_1147[88] = 23;
    tmp1158_1147[89] = 24;
    byte[] tmp1169_1158 = tmp1158_1147;
    byte[] tmp1169_1158 = tmp1158_1147;
    tmp1169_1158[90] = 25;
    tmp1169_1158[91] = -1;
    byte[] tmp1179_1169 = tmp1169_1158;
    byte[] tmp1179_1169 = tmp1169_1158;
    tmp1179_1169[92] = -1;
    tmp1179_1169[93] = -1;
    byte[] tmp1188_1179 = tmp1179_1169;
    byte[] tmp1188_1179 = tmp1179_1169;
    tmp1188_1179[94] = -1;
    tmp1188_1179[95] = 63;
    byte[] tmp1198_1188 = tmp1188_1179;
    byte[] tmp1198_1188 = tmp1188_1179;
    tmp1198_1188[96] = -1;
    tmp1198_1188[97] = 26;
    byte[] tmp1208_1198 = tmp1198_1188;
    byte[] tmp1208_1198 = tmp1198_1188;
    tmp1208_1198[98] = 27;
    tmp1208_1198[99] = 28;
    byte[] tmp1219_1208 = tmp1208_1198;
    byte[] tmp1219_1208 = tmp1208_1198;
    tmp1219_1208[100] = 29;
    tmp1219_1208[101] = 30;
    byte[] tmp1230_1219 = tmp1219_1208;
    byte[] tmp1230_1219 = tmp1219_1208;
    tmp1230_1219[102] = 31;
    tmp1230_1219[103] = 32;
    byte[] tmp1241_1230 = tmp1230_1219;
    byte[] tmp1241_1230 = tmp1230_1219;
    tmp1241_1230[104] = 33;
    tmp1241_1230[105] = 34;
    byte[] tmp1252_1241 = tmp1241_1230;
    byte[] tmp1252_1241 = tmp1241_1230;
    tmp1252_1241[106] = 35;
    tmp1252_1241[107] = 36;
    byte[] tmp1263_1252 = tmp1252_1241;
    byte[] tmp1263_1252 = tmp1252_1241;
    tmp1263_1252[108] = 37;
    tmp1263_1252[109] = 38;
    byte[] tmp1274_1263 = tmp1263_1252;
    byte[] tmp1274_1263 = tmp1263_1252;
    tmp1274_1263[110] = 39;
    tmp1274_1263[111] = 40;
    byte[] tmp1285_1274 = tmp1274_1263;
    byte[] tmp1285_1274 = tmp1274_1263;
    tmp1285_1274[112] = 41;
    tmp1285_1274[113] = 42;
    byte[] tmp1296_1285 = tmp1285_1274;
    byte[] tmp1296_1285 = tmp1285_1274;
    tmp1296_1285[114] = 43;
    tmp1296_1285[115] = 44;
    byte[] tmp1307_1296 = tmp1296_1285;
    byte[] tmp1307_1296 = tmp1296_1285;
    tmp1307_1296[116] = 45;
    tmp1307_1296[117] = 46;
    byte[] tmp1318_1307 = tmp1307_1296;
    byte[] tmp1318_1307 = tmp1307_1296;
    tmp1318_1307[118] = 47;
    tmp1318_1307[119] = 48;
    tmp1318_1307[120] = 49;
    byte[] tmp1334_1318 = tmp1318_1307;
    tmp1334_1318[121] = 50;
    tmp1334_1318[122] = 51;
    DECODE_TABLE = arrayOfByte;
  }
  
  public Base64()
  {
    this(false);
  }
  
  public Base64(int paramInt)
  {
    this(paramInt, arrayOfByte);
  }
  
  public Base64(int paramInt, byte[] paramArrayOfByte)
  {
    this(paramInt, paramArrayOfByte, false);
  }
  
  public Base64(int paramInt, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    if (paramArrayOfByte == null)
    {
      paramInt = 0;
      paramArrayOfByte = CHUNK_SEPARATOR;
    }
    int i;
    if (paramInt > 0)
    {
      i = paramInt / 4 * 4;
      this.lineLength = i;
      i = paramArrayOfByte.length;
      localObject2 = new byte[i];
      this.lineSeparator = ((byte[])localObject2);
      localObject2 = this.lineSeparator;
      int k = paramArrayOfByte.length;
      System.arraycopy(paramArrayOfByte, 0, localObject2, 0, k);
      if (paramInt <= 0) {
        break label173;
      }
      i = paramArrayOfByte.length + 4;
    }
    label173:
    int j;
    for (this.encodeSize = i;; this.encodeSize = j)
    {
      i = this.encodeSize + -1;
      this.decodeSize = i;
      boolean bool = containsBase64Byte(paramArrayOfByte);
      if (!bool) {
        break label185;
      }
      String str = StringUtils.newStringUtf8(paramArrayOfByte);
      localObject2 = new java/lang/IllegalArgumentException;
      localObject1 = new java/lang/StringBuffer;
      ((StringBuffer)localObject1).<init>();
      localObject1 = "lineSeperator must not contain base64 characters: [" + str + "]";
      ((IllegalArgumentException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
      bool = false;
      localObject2 = null;
      break;
      j = 4;
    }
    label185:
    if (paramBoolean) {}
    for (Object localObject2 = URL_SAFE_ENCODE_TABLE;; localObject2 = STANDARD_ENCODE_TABLE)
    {
      this.encodeTable = ((byte[])localObject2);
      return;
    }
  }
  
  public Base64(boolean paramBoolean)
  {
    this(76, arrayOfByte, paramBoolean);
  }
  
  private static boolean containsBase64Byte(byte[] paramArrayOfByte)
  {
    int i = 0;
    int j = paramArrayOfByte.length;
    if (i < j)
    {
      bool = isBase64(paramArrayOfByte[i]);
      if (!bool) {}
    }
    for (boolean bool = true;; bool = false)
    {
      return bool;
      i += 1;
      break;
    }
  }
  
  public static byte[] decodeBase64(String paramString)
  {
    Base64 localBase64 = new org/apache/commons/codec/binary/Base64;
    localBase64.<init>();
    return localBase64.decode(paramString);
  }
  
  public static byte[] decodeBase64(byte[] paramArrayOfByte)
  {
    Base64 localBase64 = new org/apache/commons/codec/binary/Base64;
    localBase64.<init>();
    return localBase64.decode(paramArrayOfByte);
  }
  
  public static BigInteger decodeInteger(byte[] paramArrayOfByte)
  {
    BigInteger localBigInteger = new java/math/BigInteger;
    byte[] arrayOfByte = decodeBase64(paramArrayOfByte);
    localBigInteger.<init>(1, arrayOfByte);
    return localBigInteger;
  }
  
  static byte[] discardWhitespace(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    byte[] arrayOfByte1 = new byte[i];
    int j = 0;
    int k = 0;
    for (;;)
    {
      i = paramArrayOfByte.length;
      if (k >= i) {
        break;
      }
      i = paramArrayOfByte[k];
      switch (i)
      {
      default: 
        int m = j + 1;
        i = paramArrayOfByte[k];
        arrayOfByte1[j] = i;
        j = m;
      }
      k += 1;
    }
    byte[] arrayOfByte2 = new byte[j];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, j);
    return arrayOfByte2;
  }
  
  public static byte[] encodeBase64(byte[] paramArrayOfByte)
  {
    return encodeBase64(paramArrayOfByte, false);
  }
  
  public static byte[] encodeBase64(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    return encodeBase64(paramArrayOfByte, paramBoolean, false);
  }
  
  public static byte[] encodeBase64(byte[] paramArrayOfByte, boolean paramBoolean1, boolean paramBoolean2)
  {
    return encodeBase64(paramArrayOfByte, paramBoolean1, paramBoolean2, -1 >>> 1);
  }
  
  public static byte[] encodeBase64(byte[] paramArrayOfByte, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    if (paramArrayOfByte != null)
    {
      int i = paramArrayOfByte.length;
      if (i != 0) {}
    }
    else
    {
      return paramArrayOfByte;
    }
    Object localObject = CHUNK_SEPARATOR;
    long l1 = getEncodeLength(paramArrayOfByte, 76, (byte[])localObject);
    long l2 = paramInt;
    boolean bool = l1 < l2;
    IllegalArgumentException localIllegalArgumentException;
    if (bool)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      localObject = "Input array too big, the output array would be bigger (" + l1 + ") than the specified maxium size of " + paramInt;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    Base64 localBase64;
    if (paramBoolean1)
    {
      localBase64 = new org/apache/commons/codec/binary/Base64;
      localBase64.<init>(paramBoolean2);
    }
    for (;;)
    {
      paramArrayOfByte = localBase64.encode(paramArrayOfByte);
      break;
      localBase64 = new org/apache/commons/codec/binary/Base64;
      bool = false;
      localIllegalArgumentException = null;
      localObject = CHUNK_SEPARATOR;
      localBase64.<init>(0, (byte[])localObject, paramBoolean2);
    }
  }
  
  public static byte[] encodeBase64Chunked(byte[] paramArrayOfByte)
  {
    return encodeBase64(paramArrayOfByte, true);
  }
  
  public static String encodeBase64String(byte[] paramArrayOfByte)
  {
    return StringUtils.newStringUtf8(encodeBase64(paramArrayOfByte, true));
  }
  
  public static byte[] encodeBase64URLSafe(byte[] paramArrayOfByte)
  {
    return encodeBase64(paramArrayOfByte, false, true);
  }
  
  public static String encodeBase64URLSafeString(byte[] paramArrayOfByte)
  {
    return StringUtils.newStringUtf8(encodeBase64(paramArrayOfByte, false, true));
  }
  
  public static byte[] encodeInteger(BigInteger paramBigInteger)
  {
    if (paramBigInteger == null)
    {
      NullPointerException localNullPointerException = new java/lang/NullPointerException;
      localNullPointerException.<init>("encodeInteger called with null parameter");
      throw localNullPointerException;
    }
    return encodeBase64(toIntegerBytes(paramBigInteger), false);
  }
  
  private static long getEncodeLength(byte[] paramArrayOfByte1, int paramInt, byte[] paramArrayOfByte2)
  {
    long l1 = 4;
    long l2 = 0L;
    paramInt = paramInt / 4 * 4;
    long l3 = paramArrayOfByte1.length * 4 / 3;
    long l4 = l3 % l1;
    boolean bool = l4 < l2;
    long l5;
    if (bool)
    {
      l5 = l1 - l4;
      l3 += l5;
    }
    if (paramInt > 0)
    {
      l5 = paramInt;
      l5 = l3 % l5;
      bool = l5 < l2;
      if (bool) {
        break label140;
      }
    }
    label140:
    for (int j = 1;; j = 0)
    {
      l5 = paramInt;
      l5 = l3 / l5;
      int k = paramArrayOfByte2.length;
      l2 = k;
      l5 *= l2;
      l3 += l5;
      if (j == 0)
      {
        int i = paramArrayOfByte2.length;
        l5 = i;
        l3 += l5;
      }
      return l3;
    }
  }
  
  public static boolean isArrayByteBase64(byte[] paramArrayOfByte)
  {
    int i = 0;
    int j = paramArrayOfByte.length;
    if (i < j)
    {
      bool = isBase64(paramArrayOfByte[i]);
      if (!bool)
      {
        bool = isWhiteSpace(paramArrayOfByte[i]);
        if (bool) {}
      }
    }
    for (boolean bool = false;; bool = true)
    {
      return bool;
      i += 1;
      break;
    }
  }
  
  public static boolean isBase64(byte paramByte)
  {
    byte b1 = 61;
    byte[] arrayOfByte;
    if (paramByte != b1)
    {
      if (paramByte >= 0)
      {
        arrayOfByte = DECODE_TABLE;
        b1 = arrayOfByte.length;
        if (paramByte < b1)
        {
          arrayOfByte = DECODE_TABLE;
          b1 = arrayOfByte[paramByte];
          byte b2 = -1;
          if (b1 == b2) {}
        }
      }
    }
    else {
      b1 = 1;
    }
    for (;;)
    {
      return b1;
      b1 = 0;
      arrayOfByte = null;
    }
  }
  
  private static boolean isWhiteSpace(byte paramByte)
  {
    switch (paramByte)
    {
    }
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
  
  private void reset()
  {
    this.buffer = null;
    this.pos = 0;
    this.readPos = 0;
    this.currentLinePos = 0;
    this.modulus = 0;
    this.eof = false;
  }
  
  private void resizeBuffer()
  {
    byte[] arrayOfByte1 = this.buffer;
    int i;
    if (arrayOfByte1 == null)
    {
      i = 8192;
      arrayOfByte1 = new byte[i];
      this.buffer = arrayOfByte1;
      this.pos = 0;
      this.readPos = 0;
    }
    for (;;)
    {
      return;
      i = this.buffer.length * 2;
      byte[] arrayOfByte2 = new byte[i];
      arrayOfByte1 = this.buffer;
      byte[] arrayOfByte3 = this.buffer;
      int j = arrayOfByte3.length;
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, j);
      this.buffer = arrayOfByte2;
    }
  }
  
  static byte[] toIntegerBytes(BigInteger paramBigInteger)
  {
    int i = paramBigInteger.bitLength() + 7 >> 3 << 3;
    Object localObject = paramBigInteger.toByteArray();
    int j = paramBigInteger.bitLength() % 8;
    if (j != 0)
    {
      j = paramBigInteger.bitLength() / 8 + 1;
      int k = i / 8;
      if (j != k) {}
    }
    for (;;)
    {
      return (byte[])localObject;
      int m = 0;
      int n = localObject.length;
      j = paramBigInteger.bitLength() % 8;
      if (j == 0)
      {
        m = 1;
        n += -1;
      }
      int i1 = i / 8 - n;
      j = i / 8;
      byte[] arrayOfByte = new byte[j];
      System.arraycopy(localObject, m, arrayOfByte, i1, n);
      localObject = arrayOfByte;
    }
  }
  
  int avail()
  {
    byte[] arrayOfByte = this.buffer;
    int i;
    if (arrayOfByte != null)
    {
      i = this.pos;
      int j = this.readPos;
      i -= j;
    }
    for (;;)
    {
      return i;
      i = 0;
      arrayOfByte = null;
    }
  }
  
  public Object decode(Object paramObject)
  {
    boolean bool = paramObject instanceof byte[];
    if (bool) {
      paramObject = (byte[])paramObject;
    }
    for (Object localObject = decode((byte[])paramObject);; localObject = decode((String)paramObject))
    {
      return localObject;
      bool = paramObject instanceof String;
      if (!bool) {
        break;
      }
      paramObject = (String)paramObject;
    }
    localObject = new org/apache/commons/codec/DecoderException;
    ((DecoderException)localObject).<init>("Parameter supplied to Base64 decode is not a byte[] or a String");
    throw ((Throwable)localObject);
  }
  
  void decode(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    boolean bool2 = this.eof;
    if (bool2) {
      return;
    }
    if (paramInt2 < 0) {
      this.eof = bool1;
    }
    int k = 0;
    int m = paramInt1;
    byte[] arrayOfByte;
    int n;
    int i1;
    if (k < paramInt2)
    {
      arrayOfByte = this.buffer;
      if (arrayOfByte != null)
      {
        arrayOfByte = this.buffer;
        i = arrayOfByte.length;
        n = this.pos;
        i -= n;
        n = this.decodeSize;
        if (i >= n) {}
      }
      else
      {
        resizeBuffer();
      }
      paramInt1 = m + 1;
      i1 = paramArrayOfByte[m];
      int i = 61;
      if (i1 == i) {
        this.eof = bool1;
      }
    }
    for (;;)
    {
      boolean bool3 = this.eof;
      if (!bool3) {
        break;
      }
      int j = this.modulus;
      if (j == 0) {
        break;
      }
      j = this.x << 6;
      this.x = j;
      j = this.modulus;
      int i2;
      switch (j)
      {
      default: 
        break;
      case 2: 
        j = this.x << 6;
        this.x = j;
        arrayOfByte = this.buffer;
        n = this.pos;
        i2 = n + 1;
        this.pos = i2;
        i2 = (byte)(this.x >> 16 & 0xFF);
        arrayOfByte[n] = i2;
        break;
        if (i1 >= 0)
        {
          arrayOfByte = DECODE_TABLE;
          j = arrayOfByte.length;
          if (i1 < j)
          {
            arrayOfByte = DECODE_TABLE;
            int i3 = arrayOfByte[i1];
            if (i3 >= 0)
            {
              j = this.modulus + 1;
              this.modulus = j;
              j %= 4;
              this.modulus = j;
              j = (this.x << 6) + i3;
              this.x = j;
              j = this.modulus;
              if (j == 0)
              {
                arrayOfByte = this.buffer;
                n = this.pos;
                i2 = n + 1;
                this.pos = i2;
                i2 = (byte)(this.x >> 16 & 0xFF);
                arrayOfByte[n] = i2;
                arrayOfByte = this.buffer;
                n = this.pos;
                i2 = n + 1;
                this.pos = i2;
                i2 = (byte)(this.x >> 8 & 0xFF);
                arrayOfByte[n] = i2;
                arrayOfByte = this.buffer;
                n = this.pos;
                i2 = n + 1;
                this.pos = i2;
                i2 = (byte)(this.x & 0xFF);
                arrayOfByte[n] = i2;
              }
            }
          }
        }
        k += 1;
        m = paramInt1;
        break;
      case 3: 
        arrayOfByte = this.buffer;
        n = this.pos;
        i2 = n + 1;
        this.pos = i2;
        i2 = (byte)(this.x >> 16 & 0xFF);
        arrayOfByte[n] = i2;
        arrayOfByte = this.buffer;
        n = this.pos;
        i2 = n + 1;
        this.pos = i2;
        i2 = (byte)(this.x >> 8 & 0xFF);
        arrayOfByte[n] = i2;
        break;
        paramInt1 = m;
      }
    }
  }
  
  public byte[] decode(String paramString)
  {
    byte[] arrayOfByte = StringUtils.getBytesUtf8(paramString);
    return decode(arrayOfByte);
  }
  
  public byte[] decode(byte[] paramArrayOfByte)
  {
    reset();
    int i;
    byte[] arrayOfByte1;
    if (paramArrayOfByte != null)
    {
      i = paramArrayOfByte.length;
      if (i != 0) {}
    }
    else
    {
      arrayOfByte1 = paramArrayOfByte;
    }
    for (;;)
    {
      return arrayOfByte1;
      long l = paramArrayOfByte.length * 3 / 4;
      byte[] arrayOfByte2 = new byte[(int)l];
      i = arrayOfByte2.length;
      setInitialBuffer(arrayOfByte2, 0, i);
      i = paramArrayOfByte.length;
      decode(paramArrayOfByte, 0, i);
      decode(paramArrayOfByte, 0, -1);
      arrayOfByte1 = new byte[this.pos];
      i = arrayOfByte1.length;
      readResults(arrayOfByte1, 0, i);
    }
  }
  
  public Object encode(Object paramObject)
  {
    boolean bool = paramObject instanceof byte[];
    if (!bool)
    {
      EncoderException localEncoderException = new org/apache/commons/codec/EncoderException;
      localEncoderException.<init>("Parameter supplied to Base64 encode is not a byte[]");
      throw localEncoderException;
    }
    paramObject = (byte[])paramObject;
    return encode((byte[])paramObject);
  }
  
  void encode(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = 61;
    boolean bool = this.eof;
    if (bool) {}
    for (;;)
    {
      return;
      byte[] arrayOfByte1;
      int j;
      int k;
      byte[] arrayOfByte2;
      int m;
      byte[] arrayOfByte3;
      int n;
      byte[] arrayOfByte4;
      if (paramInt2 < 0)
      {
        bool = true;
        this.eof = bool;
        arrayOfByte1 = this.buffer;
        if (arrayOfByte1 != null)
        {
          arrayOfByte1 = this.buffer;
          j = arrayOfByte1.length;
          k = this.pos;
          j -= k;
          k = this.encodeSize;
          if (j >= k) {}
        }
        else
        {
          resizeBuffer();
        }
        j = this.modulus;
        switch (j)
        {
        }
        for (;;)
        {
          j = this.lineLength;
          if (j <= 0) {
            break;
          }
          j = this.pos;
          if (j <= 0) {
            break;
          }
          arrayOfByte1 = this.lineSeparator;
          arrayOfByte2 = this.buffer;
          m = this.pos;
          arrayOfByte3 = this.lineSeparator;
          n = arrayOfByte3.length;
          System.arraycopy(arrayOfByte1, 0, arrayOfByte2, m, n);
          j = this.pos;
          arrayOfByte2 = this.lineSeparator;
          k = arrayOfByte2.length;
          j += k;
          this.pos = j;
          break;
          arrayOfByte1 = this.buffer;
          k = this.pos;
          m = k + 1;
          this.pos = m;
          arrayOfByte4 = this.encodeTable;
          n = this.x >> 2 & 0x3F;
          m = arrayOfByte4[n];
          arrayOfByte1[k] = m;
          arrayOfByte1 = this.buffer;
          k = this.pos;
          m = k + 1;
          this.pos = m;
          arrayOfByte4 = this.encodeTable;
          n = this.x << 4 & 0x3F;
          m = arrayOfByte4[n];
          arrayOfByte1[k] = m;
          arrayOfByte1 = this.encodeTable;
          arrayOfByte2 = STANDARD_ENCODE_TABLE;
          if (arrayOfByte1 == arrayOfByte2)
          {
            arrayOfByte1 = this.buffer;
            k = this.pos;
            m = k + 1;
            this.pos = m;
            arrayOfByte1[k] = i;
            arrayOfByte1 = this.buffer;
            k = this.pos;
            m = k + 1;
            this.pos = m;
            arrayOfByte1[k] = i;
            continue;
            arrayOfByte1 = this.buffer;
            k = this.pos;
            m = k + 1;
            this.pos = m;
            arrayOfByte4 = this.encodeTable;
            n = this.x >> 10 & 0x3F;
            m = arrayOfByte4[n];
            arrayOfByte1[k] = m;
            arrayOfByte1 = this.buffer;
            k = this.pos;
            m = k + 1;
            this.pos = m;
            arrayOfByte4 = this.encodeTable;
            n = this.x >> 4 & 0x3F;
            m = arrayOfByte4[n];
            arrayOfByte1[k] = m;
            arrayOfByte1 = this.buffer;
            k = this.pos;
            m = k + 1;
            this.pos = m;
            arrayOfByte4 = this.encodeTable;
            n = this.x << 2 & 0x3F;
            m = arrayOfByte4[n];
            arrayOfByte1[k] = m;
            arrayOfByte1 = this.encodeTable;
            arrayOfByte2 = STANDARD_ENCODE_TABLE;
            if (arrayOfByte1 == arrayOfByte2)
            {
              arrayOfByte1 = this.buffer;
              k = this.pos;
              m = k + 1;
              this.pos = m;
              arrayOfByte1[k] = i;
            }
          }
        }
      }
      int i1 = 0;
      for (int i2 = paramInt1; i1 < paramInt2; i2 = paramInt1)
      {
        arrayOfByte1 = this.buffer;
        if (arrayOfByte1 != null)
        {
          arrayOfByte1 = this.buffer;
          j = arrayOfByte1.length;
          k = this.pos;
          j -= k;
          k = this.encodeSize;
          if (j >= k) {}
        }
        else
        {
          resizeBuffer();
        }
        j = this.modulus + 1;
        this.modulus = j;
        j %= 3;
        this.modulus = j;
        paramInt1 = i2 + 1;
        int i3 = paramArrayOfByte[i2];
        if (i3 < 0) {
          i3 += 256;
        }
        j = (this.x << 8) + i3;
        this.x = j;
        j = this.modulus;
        if (j == 0)
        {
          arrayOfByte1 = this.buffer;
          k = this.pos;
          m = k + 1;
          this.pos = m;
          arrayOfByte4 = this.encodeTable;
          n = this.x >> 18 & 0x3F;
          m = arrayOfByte4[n];
          arrayOfByte1[k] = m;
          arrayOfByte1 = this.buffer;
          k = this.pos;
          m = k + 1;
          this.pos = m;
          arrayOfByte4 = this.encodeTable;
          n = this.x >> 12 & 0x3F;
          m = arrayOfByte4[n];
          arrayOfByte1[k] = m;
          arrayOfByte1 = this.buffer;
          k = this.pos;
          m = k + 1;
          this.pos = m;
          arrayOfByte4 = this.encodeTable;
          n = this.x >> 6 & 0x3F;
          m = arrayOfByte4[n];
          arrayOfByte1[k] = m;
          arrayOfByte1 = this.buffer;
          k = this.pos;
          m = k + 1;
          this.pos = m;
          arrayOfByte4 = this.encodeTable;
          n = this.x & 0x3F;
          m = arrayOfByte4[n];
          arrayOfByte1[k] = m;
          j = this.currentLinePos + 4;
          this.currentLinePos = j;
          j = this.lineLength;
          if (j > 0)
          {
            j = this.lineLength;
            k = this.currentLinePos;
            if (j <= k)
            {
              arrayOfByte1 = this.lineSeparator;
              arrayOfByte2 = this.buffer;
              m = this.pos;
              arrayOfByte3 = this.lineSeparator;
              n = arrayOfByte3.length;
              System.arraycopy(arrayOfByte1, 0, arrayOfByte2, m, n);
              j = this.pos;
              arrayOfByte2 = this.lineSeparator;
              k = arrayOfByte2.length;
              j += k;
              this.pos = j;
              this.currentLinePos = 0;
            }
          }
        }
        i1 += 1;
      }
      paramInt1 = i2;
    }
  }
  
  public byte[] encode(byte[] paramArrayOfByte)
  {
    reset();
    int i;
    Object localObject;
    if (paramArrayOfByte != null)
    {
      i = paramArrayOfByte.length;
      if (i != 0) {}
    }
    else
    {
      localObject = paramArrayOfByte;
    }
    for (;;)
    {
      return (byte[])localObject;
      i = this.lineLength;
      byte[] arrayOfByte1 = this.lineSeparator;
      long l = getEncodeLength(paramArrayOfByte, i, arrayOfByte1);
      localObject = new byte[(int)l];
      i = localObject.length;
      setInitialBuffer((byte[])localObject, 0, i);
      i = paramArrayOfByte.length;
      encode(paramArrayOfByte, 0, i);
      i = -1;
      encode(paramArrayOfByte, 0, i);
      byte[] arrayOfByte2 = this.buffer;
      if (arrayOfByte2 != localObject)
      {
        i = localObject.length;
        readResults((byte[])localObject, 0, i);
      }
      boolean bool = isUrlSafe();
      if (bool)
      {
        int j = this.pos;
        int k = localObject.length;
        if (j < k)
        {
          byte[] arrayOfByte3 = new byte[this.pos];
          j = this.pos;
          System.arraycopy(localObject, 0, arrayOfByte3, 0, j);
          localObject = arrayOfByte3;
        }
      }
    }
  }
  
  public String encodeToString(byte[] paramArrayOfByte)
  {
    return StringUtils.newStringUtf8(encode(paramArrayOfByte));
  }
  
  boolean hasData()
  {
    byte[] arrayOfByte = this.buffer;
    boolean bool;
    if (arrayOfByte != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      arrayOfByte = null;
    }
  }
  
  public boolean isUrlSafe()
  {
    byte[] arrayOfByte1 = this.encodeTable;
    byte[] arrayOfByte2 = URL_SAFE_ENCODE_TABLE;
    boolean bool;
    if (arrayOfByte1 == arrayOfByte2) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      arrayOfByte1 = null;
    }
  }
  
  int readResults(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = this.buffer;
    int k;
    if (arrayOfByte != null)
    {
      int i = avail();
      k = Math.min(i, paramInt2);
      arrayOfByte = this.buffer;
      if (arrayOfByte != paramArrayOfByte)
      {
        arrayOfByte = this.buffer;
        int m = this.readPos;
        System.arraycopy(arrayOfByte, m, paramArrayOfByte, paramInt1, k);
        i = this.readPos + k;
        this.readPos = i;
        i = this.readPos;
        m = this.pos;
        if (i < m) {}
      }
      for (this.buffer = null;; this.buffer = null) {
        return k;
      }
    }
    boolean bool = this.eof;
    int j;
    if (bool) {
      j = -1;
    }
    for (;;)
    {
      k = j;
      break;
      j = 0;
      arrayOfByte = null;
    }
  }
  
  void setInitialBuffer(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte != null)
    {
      int i = paramArrayOfByte.length;
      if (i == paramInt2)
      {
        this.buffer = paramArrayOfByte;
        this.pos = paramInt1;
        this.readPos = paramInt1;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/codec/binary/Base64.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */