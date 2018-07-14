package com.android.mockcdma;

public class d
{
  private static final char[] a;
  
  static
  {
    char[] arrayOfChar = new char[16];
    arrayOfChar[0] = 48;
    arrayOfChar[1] = 49;
    arrayOfChar[2] = 50;
    arrayOfChar[3] = 51;
    arrayOfChar[4] = 52;
    arrayOfChar[5] = 53;
    arrayOfChar[6] = 54;
    arrayOfChar[7] = 55;
    arrayOfChar[8] = 56;
    arrayOfChar[9] = 57;
    arrayOfChar[10] = 65;
    arrayOfChar[11] = 66;
    arrayOfChar[12] = 67;
    arrayOfChar[13] = 68;
    arrayOfChar[14] = 69;
    arrayOfChar[15] = 70;
    a = arrayOfChar;
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    return a(paramArrayOfByte, 0, i);
  }
  
  public static String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    char[] arrayOfChar1 = new char[paramInt2 * 2];
    String str = null;
    int i = 0;
    int j = paramInt1;
    for (;;)
    {
      int k = paramInt1 + paramInt2;
      if (j >= k) {
        break;
      }
      k = paramArrayOfByte[j];
      int m = i + 1;
      char[] arrayOfChar2 = a;
      int n = k >>> 4 & 0xF;
      int i1 = arrayOfChar2[n];
      arrayOfChar1[i] = i1;
      i = m + 1;
      arrayOfChar2 = a;
      k &= 0xF;
      k = arrayOfChar2[k];
      arrayOfChar1[m] = k;
      j += 1;
    }
    str = new java/lang/String;
    str.<init>(arrayOfChar1);
    return str;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/android/mockcdma/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */