package com.google.gson.internal;

class LinkedTreeMap$KeySet$1
  extends LinkedTreeMap.LinkedTreeMapIterator
{
  LinkedTreeMap$KeySet$1(LinkedTreeMap.KeySet paramKeySet)
  {
    super(localLinkedTreeMap);
  }
  
  public Object next()
  {
    return nextNode().key;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/LinkedTreeMap$KeySet$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */