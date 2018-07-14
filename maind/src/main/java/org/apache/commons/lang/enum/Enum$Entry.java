package org.apache.commons.lang.enum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Enum$Entry
{
  final List list;
  final Map map;
  final List unmodifiableList;
  final Map unmodifiableMap;
  
  protected Enum$Entry()
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.map = ((Map)localObject);
    localObject = Collections.unmodifiableMap(this.map);
    this.unmodifiableMap = ((Map)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>(25);
    this.list = ((List)localObject);
    localObject = Collections.unmodifiableList(this.list);
    this.unmodifiableList = ((List)localObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/enum/Enum$Entry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */