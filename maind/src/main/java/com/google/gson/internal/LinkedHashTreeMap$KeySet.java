package com.google.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;

final class LinkedHashTreeMap$KeySet
  extends AbstractSet
{
  LinkedHashTreeMap$KeySet(LinkedHashTreeMap paramLinkedHashTreeMap) {}
  
  public void clear()
  {
    this.this$0.clear();
  }
  
  public boolean contains(Object paramObject)
  {
    return this.this$0.containsKey(paramObject);
  }
  
  public Iterator iterator()
  {
    LinkedHashTreeMap.KeySet.1 local1 = new com/google/gson/internal/LinkedHashTreeMap$KeySet$1;
    local1.<init>(this);
    return local1;
  }
  
  public boolean remove(Object paramObject)
  {
    LinkedHashTreeMap.Node localNode = this.this$0.removeInternalByKey(paramObject);
    boolean bool;
    if (localNode != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localNode = null;
    }
  }
  
  public int size()
  {
    return this.this$0.size;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/LinkedHashTreeMap$KeySet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */