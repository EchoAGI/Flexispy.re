package com.vvt.application_profile_manager;

import java.io.Serializable;
import java.util.HashMap;

class ApplicationList
  implements Serializable
{
  private static final long serialVersionUID = -6859804251784274955L;
  private HashMap list;
  
  ApplicationList()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.list = localHashMap;
  }
  
  public HashMap getList()
  {
    return this.list;
  }
  
  public void setList(HashMap paramHashMap)
  {
    this.list = paramHashMap;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/application_profile_manager/ApplicationList.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */