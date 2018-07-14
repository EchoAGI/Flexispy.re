package org.apache.commons.lang;

import java.util.Map;

abstract class Entities$MapIntMap
  implements Entities.EntityMap
{
  protected final Map mapNameToValue;
  protected final Map mapValueToName;
  
  Entities$MapIntMap(Map paramMap1, Map paramMap2)
  {
    this.mapNameToValue = paramMap1;
    this.mapValueToName = paramMap2;
  }
  
  public void add(String paramString, int paramInt)
  {
    Map localMap = this.mapNameToValue;
    Integer localInteger = new java/lang/Integer;
    localInteger.<init>(paramInt);
    localMap.put(paramString, localInteger);
    localMap = this.mapValueToName;
    localInteger = new java/lang/Integer;
    localInteger.<init>(paramInt);
    localMap.put(localInteger, paramString);
  }
  
  public String name(int paramInt)
  {
    Map localMap = this.mapValueToName;
    Integer localInteger = new java/lang/Integer;
    localInteger.<init>(paramInt);
    return (String)localMap.get(localInteger);
  }
  
  public int value(String paramString)
  {
    Map localMap = this.mapNameToValue;
    Object localObject = localMap.get(paramString);
    if (localObject == null) {}
    for (int i = -1;; i = ((Integer)localObject).intValue())
    {
      return i;
      localObject = (Integer)localObject;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/Entities$MapIntMap.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */