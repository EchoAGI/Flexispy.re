package org.apache.commons.lang.text;

import java.util.Map;

class StrLookup$MapStrLookup
  extends StrLookup
{
  private final Map map;
  
  StrLookup$MapStrLookup(Map paramMap)
  {
    this.map = paramMap;
  }
  
  public String lookup(String paramString)
  {
    String str = null;
    Map localMap = this.map;
    if (localMap == null) {}
    for (;;)
    {
      return str;
      localMap = this.map;
      Object localObject = localMap.get(paramString);
      if (localObject != null) {
        str = localObject.toString();
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/text/StrLookup$MapStrLookup.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */