package com.vvt.qq.internal;

public class HexUtil
{
  private static final char[] digits;
  public static final byte[] emptybytes = new byte[0];
  
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
    digits = arrayOfChar;
  }
  
  public static String byte2HexStr(byte paramByte)
  {
    char[] arrayOfChar1 = new char[2];
    char[] arrayOfChar2 = digits;
    int i = paramByte & 0xF;
    int j = arrayOfChar2[i];
    arrayOfChar1[1] = j;
    arrayOfChar2 = digits;
    i = (byte)(paramByte >>> 4) & 0xF;
    j = arrayOfChar2[i];
    arrayOfChar1[0] = j;
    String str = new java/lang/String;
    str.<init>(arrayOfChar1);
    return str;
  }
  
  public static String bytes2HexStr(byte[] paramArrayOfByte)
  {
    int i;
    String str;
    if (paramArrayOfByte != null)
    {
      i = paramArrayOfByte.length;
      if (i != 0) {}
    }
    else
    {
      i = 0;
      str = null;
    }
    for (;;)
    {
      return str;
      char[] arrayOfChar1 = new char[paramArrayOfByte.length * 2];
      i = 0;
      str = null;
      for (;;)
      {
        int j = paramArrayOfByte.length;
        if (i >= j) {
          break;
        }
        j = paramArrayOfByte[i];
        int k = i * 2 + 1;
        char[] arrayOfChar2 = digits;
        int m = j & 0xF;
        int n = arrayOfChar2[m];
        arrayOfChar1[k] = n;
        k = i * 2 + 0;
        arrayOfChar2 = digits;
        j = (byte)(j >>> 4) & 0xF;
        j = arrayOfChar2[j];
        arrayOfChar1[k] = j;
        i += 1;
      }
      str = new java/lang/String;
      str.<init>(arrayOfChar1);
    }
  }
  
  public static byte char2Byte(char paramChar)
  {
    char c = '0';
    if (paramChar >= c)
    {
      c = '9';
      if (paramChar <= c) {
        c = (byte)(paramChar + '￐');
      }
    }
    for (;;)
    {
      return c;
      c = 'a';
      if (paramChar >= c)
      {
        c = 'f';
        if (paramChar <= c)
        {
          c = (byte)(paramChar + 'ﾟ' + 10);
          continue;
        }
      }
      c = 'A';
      if (paramChar >= c)
      {
        c = 'F';
        if (paramChar <= c) {}
      }
      else
      {
        c = '\000';
        continue;
      }
      c = (byte)(paramChar + '﾿' + 10);
    }
  }
  
  public static byte hexStr2Byte(String paramString)
  {
    byte b = 0;
    if (paramString != null)
    {
      int i = paramString.length();
      int j = 1;
      if (i == j) {
        break label20;
      }
    }
    for (;;)
    {
      return b;
      label20:
      b = char2Byte(paramString.charAt(0));
    }
  }
  
  public static byte[] hexStr2Bytes(String paramString)
  {
    int i;
    if (paramString != null)
    {
      localObject = "";
      i = paramString.equals(localObject);
      if (i == 0) {
        break label23;
      }
    }
    label23:
    byte[] arrayOfByte;
    for (Object localObject = emptybytes;; localObject = arrayOfByte)
    {
      return (byte[])localObject;
      arrayOfByte = new byte[paramString.length() / 2];
      i = 0;
      localObject = null;
      for (;;)
      {
        int k = arrayOfByte.length;
        if (i >= k) {
          break;
        }
        int m = i * 2;
        m = char2Byte(paramString.charAt(m)) * 16;
        int n = i * 2 + 1;
        n = char2Byte(paramString.charAt(n));
        m = (byte)(m + n);
        arrayOfByte[i] = m;
        int j;
        i += 1;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/HexUtil.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */