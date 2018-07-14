package com.vvt.datadeliverymanager;

import android.os.Process;

public class d
{
  private static int a;
  private static final boolean b;
  private static final boolean c;
  private static final boolean d;
  private Object e;
  
  static
  {
    boolean bool1 = true;
    System.loadLibrary("flmotoconfig");
    System.loadLibrary("flsamsungconfig");
    String str = "flhtcconfig";
    System.loadLibrary(str);
    a = 0;
    boolean bool2 = com.vvt.ak.a.b;
    if (bool2)
    {
      bool2 = bool1;
      b = bool2;
      bool2 = com.vvt.ak.a.b;
      if (!bool2) {
        break label71;
      }
      bool2 = bool1;
      label47:
      c = bool2;
      bool2 = com.vvt.ak.a.b;
      if (!bool2) {
        break label78;
      }
    }
    for (;;)
    {
      d = bool1;
      return;
      bool2 = false;
      str = null;
      break;
      label71:
      bool2 = false;
      str = null;
      break label47;
      label78:
      bool1 = false;
    }
  }
  
  public boolean a(String paramString, com.vvt.http.a parama)
  {
    boolean bool1 = false;
    int i = a;
    if (i > 0)
    {
      boolean bool2 = c;
      if (!bool2) {}
    }
    for (;;)
    {
      return bool1;
      a += 1;
      Object localObject = new com/vvt/datadeliverymanager/e;
      ((e)localObject).<init>(this);
      ((Thread)localObject).start();
      localObject = new com/vvt/datadeliverymanager/f;
      ((f)localObject).<init>(this, paramString, parama);
      int j = ((f)localObject).a();
      int k = -1 << -1;
      if (j != k)
      {
        j = Process.myPid();
        Process.killProcess(j);
      }
      else
      {
        bool1 = true;
      }
    }
  }
  
  public byte[] a()
  {
    byte[] arrayOfByte = new byte[64];
    byte[] tmp6_5 = arrayOfByte;
    byte[] tmp7_6 = tmp6_5;
    byte[] tmp7_6 = tmp6_5;
    tmp7_6[0] = 16;
    tmp7_6[1] = 30;
    byte[] tmp16_7 = tmp7_6;
    byte[] tmp16_7 = tmp7_6;
    tmp16_7[2] = 125;
    tmp16_7[3] = 70;
    byte[] tmp25_16 = tmp16_7;
    byte[] tmp25_16 = tmp16_7;
    tmp25_16[4] = -65;
    tmp25_16[5] = 97;
    byte[] tmp34_25 = tmp25_16;
    byte[] tmp34_25 = tmp25_16;
    tmp34_25[6] = -24;
    tmp34_25[7] = -96;
    byte[] tmp45_34 = tmp34_25;
    byte[] tmp45_34 = tmp34_25;
    tmp45_34[8] = 54;
    tmp45_34[9] = -26;
    byte[] tmp56_45 = tmp45_34;
    byte[] tmp56_45 = tmp45_34;
    tmp56_45[10] = 126;
    tmp56_45[11] = -111;
    byte[] tmp67_56 = tmp56_45;
    byte[] tmp67_56 = tmp56_45;
    tmp67_56[12] = 31;
    tmp67_56[13] = 45;
    byte[] tmp78_67 = tmp67_56;
    byte[] tmp78_67 = tmp67_56;
    tmp78_67[14] = 81;
    tmp78_67[15] = -67;
    byte[] tmp89_78 = tmp78_67;
    byte[] tmp89_78 = tmp78_67;
    tmp89_78[16] = -48;
    tmp89_78[17] = 64;
    byte[] tmp100_89 = tmp89_78;
    byte[] tmp100_89 = tmp89_78;
    tmp100_89[18] = 101;
    tmp100_89[19] = 81;
    byte[] tmp111_100 = tmp100_89;
    byte[] tmp111_100 = tmp100_89;
    tmp111_100[20] = -56;
    tmp111_100[21] = 71;
    byte[] tmp122_111 = tmp111_100;
    byte[] tmp122_111 = tmp111_100;
    tmp122_111[22] = 107;
    tmp122_111[23] = -13;
    byte[] tmp133_122 = tmp122_111;
    byte[] tmp133_122 = tmp122_111;
    tmp133_122[24] = -106;
    tmp133_122[25] = 119;
    byte[] tmp144_133 = tmp133_122;
    byte[] tmp144_133 = tmp133_122;
    tmp144_133[26] = -117;
    tmp144_133[27] = 69;
    byte[] tmp155_144 = tmp144_133;
    byte[] tmp155_144 = tmp144_133;
    tmp155_144[28] = 124;
    tmp155_144[29] = 5;
    byte[] tmp165_155 = tmp155_144;
    byte[] tmp165_155 = tmp155_144;
    tmp165_155[30] = -109;
    tmp165_155[31] = -52;
    byte[] tmp176_165 = tmp165_155;
    byte[] tmp176_165 = tmp165_155;
    tmp176_165[32] = 65;
    tmp176_165[33] = 45;
    byte[] tmp187_176 = tmp176_165;
    byte[] tmp187_176 = tmp176_165;
    tmp187_176[34] = -80;
    tmp187_176[35] = -81;
    byte[] tmp198_187 = tmp187_176;
    byte[] tmp198_187 = tmp187_176;
    tmp198_187[36] = 29;
    tmp198_187[37] = 27;
    byte[] tmp209_198 = tmp198_187;
    byte[] tmp209_198 = tmp198_187;
    tmp209_198[38] = -115;
    tmp209_198[39] = 51;
    byte[] tmp220_209 = tmp209_198;
    byte[] tmp220_209 = tmp209_198;
    tmp220_209[40] = 23;
    tmp220_209[41] = 47;
    byte[] tmp231_220 = tmp220_209;
    byte[] tmp231_220 = tmp220_209;
    tmp231_220[42] = 94;
    tmp231_220[43] = -80;
    byte[] tmp242_231 = tmp231_220;
    byte[] tmp242_231 = tmp231_220;
    tmp242_231[44] = 28;
    tmp242_231[45] = -49;
    byte[] tmp253_242 = tmp242_231;
    byte[] tmp253_242 = tmp242_231;
    tmp253_242[46] = -34;
    tmp253_242[47] = -93;
    byte[] tmp264_253 = tmp253_242;
    byte[] tmp264_253 = tmp253_242;
    tmp264_253[48] = -56;
    tmp264_253[49] = -64;
    byte[] tmp275_264 = tmp264_253;
    byte[] tmp275_264 = tmp264_253;
    tmp275_264[50] = 115;
    tmp275_264[51] = 62;
    byte[] tmp286_275 = tmp275_264;
    byte[] tmp286_275 = tmp275_264;
    tmp286_275[52] = 44;
    tmp286_275[53] = 1;
    byte[] tmp296_286 = tmp286_275;
    byte[] tmp296_286 = tmp286_275;
    tmp296_286[54] = 92;
    tmp296_286[55] = -17;
    byte[] tmp307_296 = tmp296_286;
    byte[] tmp307_296 = tmp296_286;
    tmp307_296[56] = -19;
    tmp307_296[57] = -23;
    byte[] tmp318_307 = tmp307_296;
    byte[] tmp318_307 = tmp307_296;
    tmp318_307[58] = 60;
    tmp318_307[59] = 66;
    byte[] tmp329_318 = tmp318_307;
    byte[] tmp329_318 = tmp318_307;
    tmp329_318[60] = -38;
    tmp329_318[61] = -62;
    tmp329_318[62] = 97;
    tmp329_318[63] = -88;
    return arrayOfByte;
  }
  
  public byte[] b()
  {
    byte[] arrayOfByte = new byte[94];
    byte[] tmp6_5 = arrayOfByte;
    byte[] tmp7_6 = tmp6_5;
    byte[] tmp7_6 = tmp6_5;
    tmp7_6[0] = 48;
    tmp7_6[1] = 92;
    byte[] tmp16_7 = tmp7_6;
    byte[] tmp16_7 = tmp7_6;
    tmp16_7[2] = 48;
    tmp16_7[3] = 13;
    byte[] tmp25_16 = tmp16_7;
    byte[] tmp25_16 = tmp16_7;
    tmp25_16[4] = 6;
    tmp25_16[5] = 9;
    byte[] tmp34_25 = tmp25_16;
    byte[] tmp34_25 = tmp25_16;
    tmp34_25[6] = 42;
    tmp34_25[7] = -122;
    byte[] tmp45_34 = tmp34_25;
    byte[] tmp45_34 = tmp34_25;
    tmp45_34[8] = 72;
    tmp45_34[9] = -122;
    byte[] tmp56_45 = tmp45_34;
    byte[] tmp56_45 = tmp45_34;
    tmp56_45[10] = -9;
    tmp56_45[11] = 13;
    byte[] tmp67_56 = tmp56_45;
    byte[] tmp67_56 = tmp56_45;
    tmp67_56[12] = 1;
    tmp67_56[13] = 1;
    byte[] tmp76_67 = tmp67_56;
    byte[] tmp76_67 = tmp67_56;
    tmp76_67[14] = 1;
    tmp76_67[15] = 5;
    byte[] tmp85_76 = tmp76_67;
    byte[] tmp85_76 = tmp76_67;
    tmp85_76[16] = 0;
    tmp85_76[17] = 3;
    byte[] tmp94_85 = tmp85_76;
    byte[] tmp94_85 = tmp85_76;
    tmp94_85[18] = 75;
    tmp94_85[19] = 0;
    byte[] tmp104_94 = tmp94_85;
    byte[] tmp104_94 = tmp94_85;
    tmp104_94[20] = 48;
    tmp104_94[21] = 72;
    byte[] tmp115_104 = tmp104_94;
    byte[] tmp115_104 = tmp104_94;
    tmp115_104[22] = 2;
    tmp115_104[23] = 65;
    byte[] tmp125_115 = tmp115_104;
    byte[] tmp125_115 = tmp115_104;
    tmp125_115[24] = 0;
    tmp125_115[25] = -107;
    byte[] tmp135_125 = tmp125_115;
    byte[] tmp135_125 = tmp125_115;
    tmp135_125[26] = 58;
    tmp135_125[27] = 67;
    byte[] tmp146_135 = tmp135_125;
    byte[] tmp146_135 = tmp135_125;
    tmp146_135[28] = -38;
    tmp146_135[29] = -110;
    byte[] tmp157_146 = tmp146_135;
    byte[] tmp157_146 = tmp146_135;
    tmp157_146[30] = -36;
    tmp157_146[31] = -29;
    byte[] tmp168_157 = tmp157_146;
    byte[] tmp168_157 = tmp157_146;
    tmp168_157[32] = 17;
    tmp168_157[33] = -42;
    byte[] tmp179_168 = tmp168_157;
    byte[] tmp179_168 = tmp168_157;
    tmp179_168[34] = 53;
    tmp179_168[35] = -77;
    byte[] tmp190_179 = tmp179_168;
    byte[] tmp190_179 = tmp179_168;
    tmp190_179[36] = 122;
    tmp190_179[37] = 91;
    byte[] tmp201_190 = tmp190_179;
    byte[] tmp201_190 = tmp190_179;
    tmp201_190[38] = -125;
    tmp201_190[39] = 84;
    byte[] tmp212_201 = tmp201_190;
    byte[] tmp212_201 = tmp201_190;
    tmp212_201[40] = 56;
    tmp212_201[41] = 111;
    byte[] tmp223_212 = tmp212_201;
    byte[] tmp223_212 = tmp212_201;
    tmp223_212[42] = -19;
    tmp223_212[43] = -9;
    byte[] tmp234_223 = tmp223_212;
    byte[] tmp234_223 = tmp223_212;
    tmp234_223[44] = -21;
    tmp234_223[45] = -37;
    byte[] tmp245_234 = tmp234_223;
    byte[] tmp245_234 = tmp234_223;
    tmp245_234[46] = 44;
    tmp245_234[47] = 12;
    byte[] tmp256_245 = tmp245_234;
    byte[] tmp256_245 = tmp245_234;
    tmp256_245[48] = -98;
    tmp256_245[49] = -1;
    byte[] tmp266_256 = tmp256_245;
    byte[] tmp266_256 = tmp256_245;
    tmp266_256[50] = -98;
    tmp266_256[51] = 73;
    byte[] tmp277_266 = tmp266_256;
    byte[] tmp277_266 = tmp266_256;
    tmp277_266[52] = -26;
    tmp277_266[53] = 88;
    byte[] tmp288_277 = tmp277_266;
    byte[] tmp288_277 = tmp277_266;
    tmp288_277[54] = 120;
    tmp288_277[55] = 28;
    byte[] tmp299_288 = tmp288_277;
    byte[] tmp299_288 = tmp288_277;
    tmp299_288[56] = 77;
    tmp299_288[57] = Byte.MIN_VALUE;
    byte[] tmp310_299 = tmp299_288;
    byte[] tmp310_299 = tmp299_288;
    tmp310_299[58] = -8;
    tmp310_299[59] = 23;
    byte[] tmp321_310 = tmp310_299;
    byte[] tmp321_310 = tmp310_299;
    tmp321_310[60] = 100;
    tmp321_310[61] = 1;
    byte[] tmp331_321 = tmp321_310;
    byte[] tmp331_321 = tmp321_310;
    tmp331_321[62] = -108;
    tmp331_321[63] = -66;
    byte[] tmp342_331 = tmp331_321;
    byte[] tmp342_331 = tmp331_321;
    tmp342_331[64] = -83;
    tmp342_331[65] = 105;
    byte[] tmp353_342 = tmp342_331;
    byte[] tmp353_342 = tmp342_331;
    tmp353_342[66] = 112;
    tmp353_342[67] = 77;
    byte[] tmp364_353 = tmp353_342;
    byte[] tmp364_353 = tmp353_342;
    tmp364_353[68] = 72;
    tmp364_353[69] = -115;
    byte[] tmp375_364 = tmp364_353;
    byte[] tmp375_364 = tmp364_353;
    tmp375_364[70] = -44;
    tmp375_364[71] = -33;
    byte[] tmp386_375 = tmp375_364;
    byte[] tmp386_375 = tmp375_364;
    tmp386_375[72] = Byte.MIN_VALUE;
    tmp386_375[73] = 20;
    byte[] tmp397_386 = tmp386_375;
    byte[] tmp397_386 = tmp386_375;
    tmp397_386[74] = -7;
    tmp397_386[75] = 18;
    byte[] tmp408_397 = tmp397_386;
    byte[] tmp408_397 = tmp397_386;
    tmp408_397[76] = 58;
    tmp408_397[77] = -110;
    byte[] tmp419_408 = tmp408_397;
    byte[] tmp419_408 = tmp408_397;
    tmp419_408[78] = 6;
    tmp419_408[79] = 113;
    byte[] tmp430_419 = tmp419_408;
    byte[] tmp430_419 = tmp419_408;
    tmp430_419[80] = -33;
    tmp430_419[81] = 73;
    byte[] tmp441_430 = tmp430_419;
    byte[] tmp441_430 = tmp430_419;
    tmp441_430[82] = -73;
    tmp441_430[83] = 35;
    byte[] tmp452_441 = tmp441_430;
    byte[] tmp452_441 = tmp441_430;
    tmp452_441[84] = 110;
    tmp452_441[85] = -89;
    byte[] tmp463_452 = tmp452_441;
    byte[] tmp463_452 = tmp452_441;
    tmp463_452[86] = -40;
    tmp463_452[87] = 65;
    byte[] tmp474_463 = tmp463_452;
    byte[] tmp474_463 = tmp463_452;
    tmp474_463[88] = 9;
    tmp474_463[89] = 2;
    byte[] tmp484_474 = tmp474_463;
    byte[] tmp484_474 = tmp474_463;
    tmp484_474[90] = 3;
    tmp484_474[91] = 1;
    tmp484_474[92] = 0;
    tmp484_474[93] = 1;
    return arrayOfByte;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/datadeliverymanager/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */