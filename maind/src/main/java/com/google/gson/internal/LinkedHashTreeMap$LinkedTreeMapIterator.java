package com.google.gson.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class LinkedHashTreeMap$LinkedTreeMapIterator
  implements Iterator
{
  int expectedModCount;
  LinkedHashTreeMap.Node lastReturned;
  LinkedHashTreeMap.Node next;
  
  LinkedHashTreeMap$LinkedTreeMapIterator(LinkedHashTreeMap paramLinkedHashTreeMap)
  {
    LinkedHashTreeMap.Node localNode = this.this$0.header.next;
    this.next = localNode;
    this.lastReturned = null;
    int i = this.this$0.modCount;
    this.expectedModCount = i;
  }
  
  public final boolean hasNext()
  {
    LinkedHashTreeMap.Node localNode1 = this.next;
    LinkedHashTreeMap.Node localNode2 = this.this$0.header;
    boolean bool;
    if (localNode1 != localNode2) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localNode1 = null;
    }
  }
  
  final LinkedHashTreeMap.Node nextNode()
  {
    LinkedHashTreeMap.Node localNode = this.next;
    Object localObject = this.this$0.header;
    if (localNode == localObject)
    {
      localObject = new java/util/NoSuchElementException;
      ((NoSuchElementException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    localObject = this.this$0;
    int i = ((LinkedHashTreeMap)localObject).modCount;
    int j = this.expectedModCount;
    if (i != j)
    {
      localObject = new java/util/ConcurrentModificationException;
      ((ConcurrentModificationException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    localObject = localNode.next;
    this.next = ((LinkedHashTreeMap.Node)localObject);
    this.lastReturned = localNode;
    return localNode;
  }
  
  public final void remove()
  {
    Object localObject = this.lastReturned;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    localObject = this.this$0;
    LinkedHashTreeMap.Node localNode = this.lastReturned;
    ((LinkedHashTreeMap)localObject).removeInternal(localNode, true);
    this.lastReturned = null;
    int i = this.this$0.modCount;
    this.expectedModCount = i;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/LinkedHashTreeMap$LinkedTreeMapIterator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */