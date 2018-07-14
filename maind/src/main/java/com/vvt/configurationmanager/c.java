package com.vvt.configurationmanager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class c
{
  private int a = -1;
  private List b;
  private Map c;
  
  public int a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void a(List paramList)
  {
    this.b = paramList;
  }
  
  public void a(Map paramMap)
  {
    this.c = paramMap;
  }
  
  public List b()
  {
    Object localObject = this.b;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
    }
    for (;;)
    {
      return (List)localObject;
      localObject = this.b;
    }
  }
  
  public Map c()
  {
    Object localObject = this.c;
    if (localObject == null)
    {
      localObject = new java/util/HashMap;
      ((HashMap)localObject).<init>();
    }
    for (;;)
    {
      return (Map)localObject;
      localObject = this.c;
    }
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = Integer.valueOf(this.a);
    arrayOfObject[0] = localObject;
    localObject = this.b;
    arrayOfObject[1] = localObject;
    return String.format("ID: %d, Features: %s", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/configurationmanager/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */