package com.google.gson.internal;

import java.util.Map.Entry;

class LinkedHashTreeMap$EntrySet$1
  extends LinkedHashTreeMap.LinkedTreeMapIterator
{
  LinkedHashTreeMap$EntrySet$1(LinkedHashTreeMap.EntrySet paramEntrySet)
  {
    super(localLinkedHashTreeMap);
  }
  
  public Map.Entry next()
  {
    return nextNode();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/LinkedHashTreeMap$EntrySet$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */