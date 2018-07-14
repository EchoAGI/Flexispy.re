package com.google.gson.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class LinkedTreeMap$LinkedTreeMapIterator
  implements Iterator
{
  int expectedModCount;
  LinkedTreeMap.Node lastReturned;
  LinkedTreeMap.Node next;
  
  LinkedTreeMap$LinkedTreeMapIterator(LinkedTreeMap paramLinkedTreeMap)
  {
    LinkedTreeMap.Node localNode = this.this$0.header.next;
    this.next = localNode;
    this.lastReturned = null;
    int i = this.this$0.modCount;
    this.expectedModCount = i;
  }
  
  public final boolean hasNext()
  {
    LinkedTreeMap.Node localNode1 = this.next;
    LinkedTreeMap.Node localNode2 = this.this$0.header;
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
  
  final LinkedTreeMap.Node nextNode()
  {
    LinkedTreeMap.Node localNode = this.next;
    Object localObject = this.this$0.header;
    if (localNode == localObject)
    {
      localObject = new java/util/NoSuchElementException;
      ((NoSuchElementException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    localObject = this.this$0;
    int i = ((LinkedTreeMap)localObject).modCount;
    int j = this.expectedModCount;
    if (i != j)
    {
      localObject = new java/util/ConcurrentModificationException;
      ((ConcurrentModificationException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    localObject = localNode.next;
    this.next = ((LinkedTreeMap.Node)localObject);
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
    LinkedTreeMap.Node localNode = this.lastReturned;
    ((LinkedTreeMap)localObject).removeInternal(localNode, true);
    this.lastReturned = null;
    int i = this.this$0.modCount;
    this.expectedModCount = i;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */