package org.apache.commons.lang;

import java.util.HashMap;
import java.util.Map;

class Entities$PrimitiveEntityMap
  implements Entities.EntityMap
{
  private final Map mapNameToValue;
  private final IntHashMap mapValueToName;
  
  Entities$PrimitiveEntityMap()
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.mapNameToValue = ((Map)localObject);
    localObject = new org/apache/commons/lang/IntHashMap;
    ((IntHashMap)localObject).<init>();
    this.mapValueToName = ((IntHashMap)localObject);
  }
  
  public void add(String paramString, int paramInt)
  {
    Map localMap = this.mapNameToValue;
    Integer localInteger = new java/lang/Integer;
    localInteger.<init>(paramInt);
    localMap.put(paramString, localInteger);
    this.mapValueToName.put(paramInt, paramString);
  }
  
  public String name(int paramInt)
  {
    return (String)this.mapValueToName.get(paramInt);
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/Entities$PrimitiveEntityMap.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */