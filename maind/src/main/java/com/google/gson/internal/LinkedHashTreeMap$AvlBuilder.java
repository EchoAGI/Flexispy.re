package com.google.gson.internal;

final class LinkedHashTreeMap$AvlBuilder
{
  private int leavesSkipped;
  private int leavesToSkip;
  private int size;
  private LinkedHashTreeMap.Node stack;
  
  void add(LinkedHashTreeMap.Node paramNode)
  {
    int i = 1;
    LinkedHashTreeMap.Node localNode1 = null;
    paramNode.right = null;
    paramNode.parent = null;
    paramNode.left = null;
    paramNode.height = i;
    int j = this.leavesToSkip;
    if (j > 0)
    {
      j = this.size & 0x1;
      if (j == 0)
      {
        j = this.size + 1;
        this.size = j;
        j = this.leavesToSkip + -1;
        this.leavesToSkip = j;
        j = this.leavesSkipped + 1;
        this.leavesSkipped = j;
      }
    }
    localNode1 = this.stack;
    paramNode.parent = localNode1;
    this.stack = paramNode;
    j = this.size + 1;
    this.size = j;
    j = this.leavesToSkip;
    if (j > 0)
    {
      j = this.size & 0x1;
      if (j == 0)
      {
        j = this.size + 1;
        this.size = j;
        j = this.leavesToSkip + -1;
        this.leavesToSkip = j;
        j = this.leavesSkipped + 1;
        this.leavesSkipped = j;
      }
    }
    int k = 4;
    j = this.size;
    int m = k + -1;
    j &= m;
    m = k + -1;
    if (j == m)
    {
      j = this.leavesSkipped;
      LinkedHashTreeMap.Node localNode2;
      LinkedHashTreeMap.Node localNode3;
      if (j == 0)
      {
        localNode2 = this.stack;
        localNode3 = localNode2.parent;
        LinkedHashTreeMap.Node localNode4 = localNode3.parent;
        localNode1 = localNode4.parent;
        localNode3.parent = localNode1;
        this.stack = localNode3;
        localNode3.left = localNode4;
        localNode3.right = localNode2;
        j = localNode2.height + 1;
        localNode3.height = j;
        localNode4.parent = localNode3;
        localNode2.parent = localNode3;
      }
      for (;;)
      {
        k *= 2;
        break;
        j = this.leavesSkipped;
        if (j == i)
        {
          localNode2 = this.stack;
          localNode3 = localNode2.parent;
          this.stack = localNode3;
          localNode3.right = localNode2;
          j = localNode2.height + 1;
          localNode3.height = j;
          localNode2.parent = localNode3;
          this.leavesSkipped = 0;
        }
        else
        {
          j = this.leavesSkipped;
          m = 2;
          if (j == m) {
            this.leavesSkipped = 0;
          }
        }
      }
    }
  }
  
  void reset(int paramInt)
  {
    int i = Integer.highestOneBit(paramInt) * 2 + -1 - paramInt;
    this.leavesToSkip = i;
    this.size = 0;
    this.leavesSkipped = 0;
    this.stack = null;
  }
  
  LinkedHashTreeMap.Node root()
  {
    LinkedHashTreeMap.Node localNode = this.stack;
    Object localObject = localNode.parent;
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    return localNode;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/LinkedHashTreeMap$AvlBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */