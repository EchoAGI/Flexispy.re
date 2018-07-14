package com.vvt.capture.hike.a;

import android.os.SystemClock;
import com.vvt.ak.a;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.hike.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class e
  implements f
{
  private static final String a = e.class.getSimpleName();
  private static final boolean b = a.a;
  private static final boolean c = a.d;
  private static final boolean d = a.e;
  private long e = -1;
  private String f;
  private com.vvt.base.b g;
  
  public e(String paramString, com.vvt.base.b paramb)
  {
    this.f = paramString;
    this.g = paramb;
  }
  
  public g a()
  {
    long l1 = -1;
    boolean bool1 = b;
    if (bool1) {}
    long l2 = 3000L;
    SystemClock.sleep(l2);
    FxSimpleEventReference localFxSimpleEventReference = new com/vvt/base/capture/FxSimpleEventReference;
    localFxSimpleEventReference.<init>();
    boolean bool2;
    try
    {
      long l3 = com.vvt.capture.hike.b.a();
      bool1 = false;
      Object localObject = null;
      l2 = l3;
      int j = 0;
      for (;;)
      {
        boolean bool3 = l2 < l1;
        if (bool3) {
          break;
        }
        int k = 5;
        if (j >= k) {
          break;
        }
        l2 = 2000L;
        SystemClock.sleep(l2);
        long l4 = com.vvt.capture.hike.b.a();
        int i = j + 1;
        j = i;
        l2 = l4;
      }
      boolean bool4;
      bool2 = c;
    }
    catch (Exception localException)
    {
      bool2 = d;
      if (bool2) {}
      l2 = l1;
      bool4 = l2 < l1;
      if (bool4) {
        break label162;
      }
    }
    if (bool2) {}
    l2 = this.e;
    for (;;)
    {
      Long localLong = Long.valueOf(l2);
      localFxSimpleEventReference.setReference(localLong);
      bool2 = b;
      if (bool2) {}
      return localFxSimpleEventReference;
      label162:
      this.e = l2;
    }
  }
  
  public List a(int paramInt)
  {
    bool = b;
    if (bool) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    String str1 = c.a();
    String str2 = c.b();
    long l1;
    long l2;
    if (str1 != null)
    {
      l1 = com.vvt.capture.hike.b.a(paramInt, str1) - 1L;
      l2 = com.vvt.capture.hike.b.a(str1);
    }
    try
    {
      Object localObject = this.f;
      com.vvt.base.b localb = this.g;
      localObject = com.vvt.capture.hike.b.a((String)localObject, str1, str2, l1, l2, localb, false);
      localArrayList.addAll((Collection)localObject);
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
    bool1 = b;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    String str1 = c.a();
    String str2 = c.b();
    if (str1 != null) {}
    try
    {
      Object localObject = paramg1.getReference();
      localObject = (Long)localObject;
      long l1 = ((Long)localObject).longValue();
      localObject = paramg2.getReference();
      localObject = (Long)localObject;
      long l2 = ((Long)localObject).longValue();
      boolean bool2 = true;
      localObject = this.f;
      com.vvt.base.b localb = this.g;
      localObject = com.vvt.capture.hike.b.a((String)localObject, str1, str2, l1, l2, localb, bool2);
      localArrayList.addAll((Collection)localObject);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool1 = d;
        if (!bool1) {}
      }
    }
    bool1 = b;
    if (bool1) {}
    return localArrayList;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/hike/a/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */