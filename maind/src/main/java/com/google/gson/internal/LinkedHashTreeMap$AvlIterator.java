package com.google.gson.internal;

class LinkedHashTreeMap$AvlIterator
{
  private LinkedHashTreeMap.Node stackTop;
  
  public LinkedHashTreeMap.Node next()
  {
    Object localObject1 = this.stackTop;
    Object localObject2;
    if (localObject1 == null) {
      localObject2 = null;
    }
    for (;;)
    {
      return (LinkedHashTreeMap.Node)localObject2;
      localObject2 = localObject1;
      localObject1 = ((LinkedHashTreeMap.Node)localObject1).parent;
      ((LinkedHashTreeMap.Node)localObject2).parent = null;
      for (LinkedHashTreeMap.Node localNode = ((LinkedHashTreeMap.Node)localObject2).right; localNode != null; localNode = localNode.left)
      {
        localNode.parent = ((LinkedHashTreeMap.Node)localObject1);
        localObject1 = localNode;
      }
      this.stackTop = ((LinkedHashTreeMap.Node)localObject1);
    }
  }
  
  void reset(LinkedHashTreeMap.Node paramNode)
  {
    Object localObject = null;
    for (LinkedHashTreeMap.Node localNode = paramNode; localNode != null; localNode = localNode.left)
    {
      localNode.parent = ((LinkedHashTreeMap.Node)localObject);
      localObject = localNode;
    }
    this.stackTop = ((LinkedHashTreeMap.Node)localObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/LinkedHashTreeMap$AvlIterator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */