package com.google.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class LinkedTreeMap$EntrySet
  extends AbstractSet
{
  LinkedTreeMap$EntrySet(LinkedTreeMap paramLinkedTreeMap) {}
  
  public void clear()
  {
    this.this$0.clear();
  }
  
  public boolean contains(Object paramObject)
  {
    boolean bool = paramObject instanceof Map.Entry;
    Object localObject;
    if (bool)
    {
      localObject = this.this$0;
      paramObject = (Map.Entry)paramObject;
      localObject = ((LinkedTreeMap)localObject).findByEntry((Map.Entry)paramObject);
      if (localObject != null) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public Iterator iterator()
  {
    LinkedTreeMap.EntrySet.1 local1 = new com/google/gson/internal/LinkedTreeMap$EntrySet$1;
    local1.<init>(this);
    return local1;
  }
  
  public boolean remove(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    LinkedTreeMap localLinkedTreeMap1 = null;
    boolean bool3 = paramObject instanceof Map.Entry;
    if (!bool3) {}
    for (;;)
    {
      return bool2;
      LinkedTreeMap localLinkedTreeMap2 = this.this$0;
      paramObject = (Map.Entry)paramObject;
      LinkedTreeMap.Node localNode = localLinkedTreeMap2.findByEntry((Map.Entry)paramObject);
      if (localNode != null)
      {
        localLinkedTreeMap1 = this.this$0;
        localLinkedTreeMap1.removeInternal(localNode, bool1);
        bool2 = bool1;
      }
    }
  }
  
  public int size()
  {
    return this.this$0.size;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/LinkedTreeMap$EntrySet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */