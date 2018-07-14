package com.vvt.callmanager.a;

public class g
{
  public static byte a(byte paramByte)
  {
    byte b;
    switch (paramByte)
    {
    default: 
      b = 32;
    }
    for (;;)
    {
      return b;
      b = 68;
      continue;
      b = 49;
      continue;
      b = 50;
      continue;
      b = 51;
      continue;
      b = 52;
      continue;
      b = 53;
      continue;
      b = 54;
      continue;
      b = 55;
      continue;
      b = 56;
      continue;
      b = 57;
      continue;
      b = 48;
      continue;
      b = 42;
      continue;
      b = 35;
      continue;
      b = 65;
      continue;
      b = 66;
      continue;
      b = 67;
    }
  }
  
  private static int a(char paramChar)
  {
    char c = '0';
    if (paramChar >= c)
    {
      c = '9';
      if (paramChar <= c) {
        c = paramChar + '￐';
      }
    }
    for (;;)
    {
      return c;
      c = 'A';
      if (paramChar >= c)
      {
        c = 'F';
        if (paramChar <= c)
        {
          c = paramChar + '﾿' + 10;
          continue;
        }
      }
      c = 'a';
      if (paramChar < c) {
        break;
      }
      c = 'f';
      if (paramChar > c) {
        break;
      }
      c = paramChar + 'ﾟ' + 10;
    }
    RuntimeException localRuntimeException = new java/lang/RuntimeException;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = "invalid hex char '" + paramChar + "'";
    localRuntimeException.<init>((String)localObject);
    throw localRuntimeException;
  }
  
  public static byte[] a(String paramString)
  {
    int i;
    byte[] arrayOfByte;
    if (paramString == null)
    {
      i = 0;
      arrayOfByte = null;
    }
    for (;;)
    {
      return arrayOfByte;
      int j = paramString.length();
      i = j / 2;
      arrayOfByte = new byte[i];
      int k = 0;
      while (k < j)
      {
        int m = k / 2;
        int n = a(paramString.charAt(k)) << 4;
        int i1 = k + 1;
        i1 = a(paramString.charAt(i1));
        n = (byte)(n | i1);
        arrayOfByte[m] = n;
        k += 2;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/getInstance/g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */