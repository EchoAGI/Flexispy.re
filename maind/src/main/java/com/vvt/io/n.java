package com.vvt.io;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class n
{
  public static byte[] a(InputStream paramInputStream)
  {
    int i = 8192;
    byte[] arrayOfByte = new byte[i];
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    for (;;)
    {
      int j = paramInputStream.read(arrayOfByte);
      int k = -1;
      if (j == k) {
        break;
      }
      k = 0;
      localByteArrayOutputStream.write(arrayOfByte, 0, j);
    }
    return localByteArrayOutputStream.toByteArray();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/io/n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */