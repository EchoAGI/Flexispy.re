package com.google.gson.internal;

import java.util.Map.Entry;

final class LinkedHashTreeMap$Node
  implements Map.Entry
{
  final int hash;
  int height;
  final Object key;
  Node left;
  Node next;
  Node parent;
  Node prev;
  Node right;
  Object value;
  
  LinkedHashTreeMap$Node()
  {
    this.key = null;
    this.hash = -1;
    this.prev = this;
    this.next = this;
  }
  
  LinkedHashTreeMap$Node(Node paramNode1, Object paramObject, int paramInt, Node paramNode2, Node paramNode3)
  {
    this.parent = paramNode1;
    this.key = paramObject;
    this.hash = paramInt;
    this.height = 1;
    this.next = paramNode2;
    this.prev = paramNode3;
    paramNode3.next = this;
    paramNode2.prev = this;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof Map.Entry;
    Object localObject1;
    Object localObject2;
    if (bool2)
    {
      localObject1 = paramObject;
      localObject1 = (Map.Entry)paramObject;
      localObject2 = this.key;
      if (localObject2 != null) {
        break label74;
      }
      localObject2 = ((Map.Entry)localObject1).getKey();
      if (localObject2 == null)
      {
        localObject2 = this.value;
        if (localObject2 != null) {
          break label104;
        }
        localObject2 = ((Map.Entry)localObject1).getValue();
        if (localObject2 != null) {}
      }
    }
    for (;;)
    {
      bool1 = true;
      label74:
      label104:
      do
      {
        do
        {
          return bool1;
          localObject2 = this.key;
          localObject3 = ((Map.Entry)localObject1).getKey();
          bool2 = localObject2.equals(localObject3);
        } while (!bool2);
        break;
        localObject2 = this.value;
        Object localObject3 = ((Map.Entry)localObject1).getValue();
        bool2 = localObject2.equals(localObject3);
      } while (!bool2);
    }
  }
  
  public Node first()
  {
    Object localObject = this;
    for (Node localNode = this.left; localNode != null; localNode = localNode.left) {
      localObject = localNode;
    }
    return (Node)localObject;
  }
  
  public Object getKey()
  {
    return this.key;
  }
  
  public Object getValue()
  {
    return this.value;
  }
  
  public int hashCode()
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = this.key;
    int j;
    if (localObject2 == null)
    {
      j = 0;
      localObject2 = null;
      Object localObject3 = this.value;
      if (localObject3 != null) {
        break label48;
      }
    }
    for (;;)
    {
      return j ^ i;
      localObject2 = this.key;
      j = localObject2.hashCode();
      break;
      label48:
      localObject1 = this.value;
      i = localObject1.hashCode();
    }
  }
  
  public Node last()
  {
    Object localObject = this;
    for (Node localNode = this.right; localNode != null; localNode = localNode.right) {
      localObject = localNode;
    }
    return (Node)localObject;
  }
  
  public Object setValue(Object paramObject)
  {
    Object localObject = this.value;
    this.value = paramObject;
    return localObject;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = this.key;
    localStringBuilder = localStringBuilder.append(localObject).append("=");
    localObject = this.value;
    return (String)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/LinkedHashTreeMap$Node.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */