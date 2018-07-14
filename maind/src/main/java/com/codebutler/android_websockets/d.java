package com.codebutler.android_websockets;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

class d
  implements Runnable
{
  d(b paramb, byte[] paramArrayOfByte) {}
  
  public void run()
  {
    Object localObject5;
    try
    {
      Object localObject1 = this.b;
      synchronized (b.h((b)localObject1))
      {
        localObject1 = this.b;
        localObject1 = b.d((b)localObject1);
        if (localObject1 != null) {
          break label62;
        }
        localObject1 = new java/lang/IllegalStateException;
        localObject5 = "Socket not connected";
        ((IllegalStateException)localObject1).<init>((String)localObject5);
        throw ((Throwable)localObject1);
      }
      return;
    }
    catch (IOException localIOException)
    {
      ??? = b.f(this.b);
      ((e)???).a(localIOException);
    }
    for (;;)
    {
      label62:
      Object localObject3 = this.b;
      localObject3 = b.d((b)localObject3);
      localObject3 = ((Socket)localObject3).getOutputStream();
      localObject5 = this.a;
      ((OutputStream)localObject3).write((byte[])localObject5);
      ((OutputStream)localObject3).flush();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/codebutler/android_websockets/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */