package com.vvt.g;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class a
{
  public static Map a(Map paramMap)
  {
    Object localObject1 = new java/util/LinkedList;
    Object localObject2 = paramMap.entrySet();
    ((LinkedList)localObject1).<init>((Collection)localObject2);
    localObject2 = new com/vvt/g/b;
    ((b)localObject2).<init>();
    Collections.sort((List)localObject1, (Comparator)localObject2);
    localObject2 = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject2).<init>();
    Iterator localIterator = ((List)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (Map.Entry)localIterator.next();
      Object localObject3 = ((Map.Entry)localObject1).getKey();
      localObject1 = ((Map.Entry)localObject1).getValue();
      ((Map)localObject2).put(localObject3, localObject1);
    }
    return (Map)localObject2;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/FxFileObserverWorker/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */