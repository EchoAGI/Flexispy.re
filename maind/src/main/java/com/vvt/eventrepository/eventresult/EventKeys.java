package com.vvt.eventrepository.eventresult;

import com.vvt.base.FxEventType;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class EventKeys
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private HashMap mEventKeys;
  
  public EventKeys()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.mEventKeys = localHashMap;
  }
  
  public List getEventIDs(FxEventType paramFxEventType)
  {
    return (List)this.mEventKeys.get(paramFxEventType);
  }
  
  public Set getKeys()
  {
    return this.mEventKeys.keySet();
  }
  
  public void put(FxEventType paramFxEventType, List paramList)
  {
    this.mEventKeys.put(paramFxEventType, paramList);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/eventresult/EventKeys.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */