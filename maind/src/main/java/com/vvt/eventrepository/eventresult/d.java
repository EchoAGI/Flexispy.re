package com.vvt.eventrepository.eventresult;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class d
{
  private List a;
  
  public d()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.a = localArrayList;
  }
  
  public List a()
  {
    return this.a;
  }
  
  public void a(List paramList)
  {
    this.a.addAll(paramList);
  }
  
  public EventKeys b()
  {
    EventKeys localEventKeys = new com/vvt/eventrepository/eventresult/EventKeys;
    localEventKeys.<init>();
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Object localObject1 = this.a;
    if (localObject1 != null)
    {
      int i = 0;
      localObject1 = null;
      int j = 0;
      List localList = null;
      localObject1 = this.a;
      i = ((List)localObject1).size();
      if (j < i)
      {
        localObject2 = ((FxEvent)this.a.get(j)).getEventType();
        long l = ((FxEvent)this.a.get(j)).getEventId();
        localObject1 = localHashMap.get(localObject2);
        if (localObject1 != null)
        {
          localObject1 = (List)localHashMap.get(localObject2);
          localObject2 = Long.valueOf(l);
          ((List)localObject1).add(localObject2);
        }
        for (;;)
        {
          i = j + 1;
          j = i;
          break;
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
          Long localLong = Long.valueOf(l);
          ((List)localObject1).add(localLong);
          localHashMap.put(localObject2, localObject1);
        }
      }
      new ArrayList();
      localObject1 = localHashMap.keySet();
      Object localObject2 = ((Set)localObject1).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (FxEventType)((Iterator)localObject2).next();
        localList = (List)localHashMap.get(localObject1);
        if (localList != null) {
          localEventKeys.put((FxEventType)localObject1, localList);
        }
      }
    }
    return localEventKeys;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/eventresult/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */