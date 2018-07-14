package com.vvt.im.events.store;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StringEventKeys
  implements Serializable
{
  private static final long serialVersionUID = 3697876616130443011L;
  private List mEventKeys;
  
  public StringEventKeys()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mEventKeys = localArrayList;
  }
  
  public List getEventKeys()
  {
    return this.mEventKeys;
  }
  
  public void setEventKeys(List paramList)
  {
    this.mEventKeys = paramList;
  }
  
  public String toString()
  {
    Object localObject = this.mEventKeys;
    if (localObject != null) {}
    for (localObject = this.mEventKeys.toString();; localObject = "") {
      return (String)localObject;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/im/events/store/StringEventKeys.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */