package com.vvt.phoenix.a;

import java.io.OutputStream;

public class d
{
  public static void a(String paramString, OutputStream paramOutputStream)
  {
    int i = 255;
    if (paramString != null)
    {
      byte[] arrayOfByte = a.a(paramString);
      int j = arrayOfByte.length;
      if ((j > i) || (j < 0)) {
        j = i;
      }
      paramOutputStream.write(j);
      paramOutputStream.write(arrayOfByte, 0, j);
    }
    for (;;)
    {
      return;
      paramOutputStream.write(0);
    }
  }
  
  public static void b(String paramString, OutputStream paramOutputStream)
  {
    int i = (char)-1;
    int j = 2;
    if (paramString != null)
    {
      byte[] arrayOfByte1 = a.a(paramString);
      int k = arrayOfByte1.length;
      if ((k > i) || (k < 0)) {
        k = i;
      }
      i = (short)k;
      byte[] arrayOfByte2 = a.a(i);
      paramOutputStream.write(arrayOfByte2, 0, j);
      paramOutputStream.write(arrayOfByte1, 0, k);
    }
    for (;;)
    {
      return;
      byte[] arrayOfByte3 = new byte[j];
      byte[] tmp69_67 = arrayOfByte3;
      tmp69_67[0] = 0;
      tmp69_67[1] = 0;
      paramOutputStream.write(arrayOfByte3, 0, j);
    }
  }
  
  public static void c(String paramString, OutputStream paramOutputStream)
  {
    int i = -1 >>> 1;
    int j = 4;
    if (paramString != null)
    {
      byte[] arrayOfByte1 = a.a(paramString);
      int k = arrayOfByte1.length;
      int m = arrayOfByte1.length;
      if ((m > i) || (k < 0)) {
        k = i;
      }
      byte[] arrayOfByte2 = a.a(k);
      paramOutputStream.write(arrayOfByte2, 0, j);
      paramOutputStream.write(arrayOfByte1, 0, k);
    }
    for (;;)
    {
      return;
      byte[] arrayOfByte3 = new byte[j];
      byte[] tmp72_70 = arrayOfByte3;
      byte[] tmp73_72 = tmp72_70;
      byte[] tmp73_72 = tmp72_70;
      tmp73_72[0] = 0;
      tmp73_72[1] = 0;
      tmp73_72[2] = 0;
      tmp73_72[3] = 0;
      paramOutputStream.write(arrayOfByte3, 0, j);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */