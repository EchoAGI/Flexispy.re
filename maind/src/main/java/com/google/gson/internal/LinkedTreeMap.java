package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public final class LinkedTreeMap
  extends AbstractMap
  implements Serializable
{
  private static final Comparator NATURAL_ORDER;
  Comparator comparator;
  private LinkedTreeMap.EntrySet entrySet;
  final LinkedTreeMap.Node header;
  private LinkedTreeMap.KeySet keySet;
  int modCount = 0;
  LinkedTreeMap.Node root;
  int size = 0;
  
  static
  {
    Object localObject = LinkedTreeMap.class;
    boolean bool = ((Class)localObject).desiredAssertionStatus();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      $assertionsDisabled = bool;
      localObject = new com/google/gson/internal/LinkedTreeMap$1;
      ((LinkedTreeMap.1)localObject).<init>();
      NATURAL_ORDER = (Comparator)localObject;
      return;
      bool = false;
      localObject = null;
    }
  }
  
  public LinkedTreeMap()
  {
    this(localComparator);
  }
  
  public LinkedTreeMap(Comparator paramComparator)
  {
    LinkedTreeMap.Node localNode = new com/google/gson/internal/LinkedTreeMap$Node;
    localNode.<init>();
    this.header = localNode;
    if (paramComparator != null) {}
    for (;;)
    {
      this.comparator = paramComparator;
      return;
      paramComparator = NATURAL_ORDER;
    }
  }
  
  private boolean equal(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != paramObject2)
    {
      if (paramObject1 == null) {
        break label23;
      }
      bool = paramObject1.equals(paramObject2);
      if (!bool) {
        break label23;
      }
    }
    label23:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private void rebalance(LinkedTreeMap.Node paramNode, boolean paramBoolean)
  {
    LinkedTreeMap.Node localNode1 = paramNode;
    LinkedTreeMap.Node localNode2;
    LinkedTreeMap.Node localNode3;
    int i;
    label30:
    int j;
    label42:
    int k;
    int i4;
    int i5;
    label94:
    int i6;
    label106:
    int i7;
    if (localNode1 != null)
    {
      localNode2 = localNode1.left;
      localNode3 = localNode1.right;
      if (localNode2 == null) {
        break label146;
      }
      i = localNode2.height;
      if (localNode3 == null) {
        break label152;
      }
      j = localNode3.height;
      k = i - j;
      int m = -2;
      i4 = m;
      if (k != m) {
        break label221;
      }
      LinkedTreeMap.Node localNode4 = localNode3.left;
      LinkedTreeMap.Node localNode5 = localNode3.right;
      if (localNode5 == null) {
        break label158;
      }
      i4 = localNode5.height;
      i5 = i4;
      if (localNode4 == null) {
        break label164;
      }
      i6 = localNode4.height;
      i7 = i6 - i5;
      m = -1;
      i4 = m;
      if ((i7 != m) && ((i7 != 0) || (paramBoolean))) {
        break label170;
      }
      rotateLeft(localNode1);
      label141:
      if (!paramBoolean) {
        break label312;
      }
    }
    for (;;)
    {
      label145:
      return;
      label146:
      i = 0;
      break label30;
      label152:
      j = 0;
      break label42;
      label158:
      i5 = 0;
      break label94;
      label164:
      i6 = 0;
      break label106;
      label170:
      int n = $assertionsDisabled;
      AssertionError localAssertionError;
      if (n == 0)
      {
        n = 1;
        i4 = n;
        if (i7 != n)
        {
          localAssertionError = new java/lang/AssertionError;
          localAssertionError.<init>();
          throw localAssertionError;
        }
      }
      rotateRight(localNode3);
      rotateLeft(localNode1);
      break label141;
      label221:
      int i1 = 2;
      i4 = i1;
      int i8;
      label261:
      int i9;
      label273:
      int i10;
      if (k == i1)
      {
        LinkedTreeMap.Node localNode6 = localNode2.left;
        LinkedTreeMap.Node localNode7 = localNode2.right;
        if (localNode7 != null)
        {
          i8 = localNode7.height;
          if (localNode6 == null) {
            break label326;
          }
          i9 = localNode6.height;
          i10 = i9 - i8;
          i1 = 1;
          i4 = i1;
          if ((i10 != i1) && ((i10 != 0) || (paramBoolean))) {
            break label332;
          }
          rotateRight(localNode1);
          label308:
          if (paramBoolean) {
            break label381;
          }
        }
      }
      label312:
      label326:
      label332:
      label381:
      label411:
      do
      {
        do
        {
          localNode1 = localNode1.parent;
          break;
          i8 = 0;
          break label261;
          i9 = 0;
          break label273;
          boolean bool1 = $assertionsDisabled;
          if (!bool1)
          {
            i2 = -1;
            i4 = i2;
            if (i10 != i2)
            {
              localAssertionError = new java/lang/AssertionError;
              localAssertionError.<init>();
              throw localAssertionError;
            }
          }
          rotateLeft(localNode2);
          rotateRight(localNode1);
          break label308;
          break label145;
          if (k != 0) {
            break label411;
          }
          int i2 = i + 1;
          i4 = i2;
          localNode1.height = i2;
        } while (!paramBoolean);
        break label145;
        boolean bool2 = $assertionsDisabled;
        if (!bool2)
        {
          i3 = -1;
          i4 = i3;
          if (k != i3)
          {
            i3 = 1;
            i4 = i3;
            if (k != i3)
            {
              localAssertionError = new java/lang/AssertionError;
              localAssertionError.<init>();
              throw localAssertionError;
            }
          }
        }
        int i3 = Math.max(i, j) + 1;
        i4 = i3;
        localNode1.height = i3;
      } while (paramBoolean);
    }
  }
  
  private void replaceInParent(LinkedTreeMap.Node paramNode1, LinkedTreeMap.Node paramNode2)
  {
    LinkedTreeMap.Node localNode = paramNode1.parent;
    boolean bool = false;
    Object localObject = null;
    paramNode1.parent = null;
    if (paramNode2 != null) {
      paramNode2.parent = localNode;
    }
    if (localNode != null)
    {
      localObject = localNode.left;
      if (localObject == paramNode1) {
        localNode.left = paramNode2;
      }
    }
    for (;;)
    {
      return;
      bool = $assertionsDisabled;
      if (!bool)
      {
        localObject = localNode.right;
        if (localObject != paramNode1)
        {
          localObject = new java/lang/AssertionError;
          ((AssertionError)localObject).<init>();
          throw ((Throwable)localObject);
        }
      }
      localNode.right = paramNode2;
      continue;
      this.root = paramNode2;
    }
  }
  
  private void rotateLeft(LinkedTreeMap.Node paramNode)
  {
    int i = 0;
    LinkedTreeMap.Node localNode1 = paramNode.left;
    LinkedTreeMap.Node localNode2 = paramNode.right;
    LinkedTreeMap.Node localNode3 = localNode2.left;
    LinkedTreeMap.Node localNode4 = localNode2.right;
    paramNode.right = localNode3;
    if (localNode3 != null) {
      localNode3.parent = paramNode;
    }
    replaceInParent(paramNode, localNode2);
    localNode2.left = paramNode;
    paramNode.parent = localNode2;
    int k;
    if (localNode1 != null)
    {
      j = localNode1.height;
      k = j;
      if (localNode3 == null) {
        break label147;
      }
    }
    label147:
    for (int j = localNode3.height;; j = 0)
    {
      j = Math.max(k, j) + 1;
      paramNode.height = j;
      j = paramNode.height;
      if (localNode4 != null) {
        i = localNode4.height;
      }
      j = Math.max(j, i) + 1;
      localNode2.height = j;
      return;
      k = 0;
      break;
    }
  }
  
  private void rotateRight(LinkedTreeMap.Node paramNode)
  {
    int i = 0;
    LinkedTreeMap.Node localNode1 = paramNode.left;
    LinkedTreeMap.Node localNode2 = paramNode.right;
    LinkedTreeMap.Node localNode3 = localNode1.left;
    LinkedTreeMap.Node localNode4 = localNode1.right;
    paramNode.left = localNode4;
    if (localNode4 != null) {
      localNode4.parent = paramNode;
    }
    replaceInParent(paramNode, localNode1);
    localNode1.right = paramNode;
    paramNode.parent = localNode1;
    int k;
    if (localNode2 != null)
    {
      j = localNode2.height;
      k = j;
      if (localNode4 == null) {
        break label143;
      }
    }
    label143:
    for (int j = localNode4.height;; j = 0)
    {
      j = Math.max(k, j) + 1;
      paramNode.height = j;
      j = paramNode.height;
      if (localNode3 != null) {
        i = localNode3.height;
      }
      j = Math.max(j, i) + 1;
      localNode1.height = j;
      return;
      k = 0;
      break;
    }
  }
  
  private Object writeReplace()
  {
    LinkedHashMap localLinkedHashMap = new java/util/LinkedHashMap;
    localLinkedHashMap.<init>(this);
    return localLinkedHashMap;
  }
  
  public void clear()
  {
    this.root = null;
    this.size = 0;
    int i = this.modCount + 1;
    this.modCount = i;
    LinkedTreeMap.Node localNode = this.header;
    localNode.prev = localNode;
    localNode.next = localNode;
  }
  
  public boolean containsKey(Object paramObject)
  {
    LinkedTreeMap.Node localNode = findByObject(paramObject);
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
  
  public Set entrySet()
  {
    LinkedTreeMap.EntrySet localEntrySet = this.entrySet;
    if (localEntrySet != null) {}
    for (;;)
    {
      return localEntrySet;
      localEntrySet = new com/google/gson/internal/LinkedTreeMap$EntrySet;
      localEntrySet.<init>(this);
      this.entrySet = localEntrySet;
    }
  }
  
  LinkedTreeMap.Node find(Object paramObject, boolean paramBoolean)
  {
    Object localObject1 = null;
    Comparator localComparator = this.comparator;
    Object localObject2 = this.root;
    int i = 0;
    Object localObject4;
    if (localObject2 != null)
    {
      localObject3 = NATURAL_ORDER;
      if (localComparator == localObject3)
      {
        localObject3 = paramObject;
        localObject3 = (Comparable)paramObject;
        localObject4 = localObject3;
        if (localObject4 == null) {
          break label86;
        }
        localObject3 = ((LinkedTreeMap.Node)localObject2).key;
        i = ((Comparable)localObject4).compareTo(localObject3);
        label70:
        if (i != 0) {
          break label108;
        }
        localObject1 = localObject2;
      }
    }
    label86:
    label108:
    LinkedTreeMap.Node localNode2;
    label219:
    label226:
    int j;
    for (;;)
    {
      return (LinkedTreeMap.Node)localObject1;
      localObject4 = null;
      break;
      localObject3 = ((LinkedTreeMap.Node)localObject2).key;
      i = localComparator.compare(paramObject, localObject3);
      break label70;
      if (i < 0) {}
      for (LinkedTreeMap.Node localNode1 = ((LinkedTreeMap.Node)localObject2).left;; localNode1 = ((LinkedTreeMap.Node)localObject2).right)
      {
        if (localNode1 != null) {
          break label219;
        }
        if (!paramBoolean) {
          break;
        }
        localNode2 = this.header;
        if (localObject2 != null) {
          break label290;
        }
        localObject3 = NATURAL_ORDER;
        if (localComparator != localObject3) {
          break label226;
        }
        boolean bool = paramObject instanceof Comparable;
        if (bool) {
          break label226;
        }
        localObject3 = new java/lang/ClassCastException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        String str = paramObject.getClass().getName();
        localObject1 = str + " is not Comparable";
        ((ClassCastException)localObject3).<init>((String)localObject1);
        throw ((Throwable)localObject3);
      }
      localObject2 = localNode1;
      break;
      localNode3 = new com/google/gson/internal/LinkedTreeMap$Node;
      localObject3 = localNode2.prev;
      localNode3.<init>((LinkedTreeMap.Node)localObject2, paramObject, localNode2, (LinkedTreeMap.Node)localObject3);
      this.root = localNode3;
      j = this.size + 1;
      this.size = j;
      j = this.modCount + 1;
      this.modCount = j;
      localObject1 = localNode3;
    }
    label290:
    LinkedTreeMap.Node localNode3 = new com/google/gson/internal/LinkedTreeMap$Node;
    Object localObject3 = localNode2.prev;
    localNode3.<init>((LinkedTreeMap.Node)localObject2, paramObject, localNode2, (LinkedTreeMap.Node)localObject3);
    if (i < 0) {
      ((LinkedTreeMap.Node)localObject2).left = localNode3;
    }
    for (;;)
    {
      j = 1;
      rebalance((LinkedTreeMap.Node)localObject2, j);
      break;
      ((LinkedTreeMap.Node)localObject2).right = localNode3;
    }
  }
  
  LinkedTreeMap.Node findByEntry(Map.Entry paramEntry)
  {
    Object localObject1 = paramEntry.getKey();
    LinkedTreeMap.Node localNode = findByObject(localObject1);
    int i;
    if (localNode != null)
    {
      localObject1 = localNode.value;
      Object localObject2 = paramEntry.getValue();
      boolean bool = equal(localObject1, localObject2);
      if (bool)
      {
        i = 1;
        if (i == 0) {
          break label60;
        }
      }
    }
    for (;;)
    {
      return localNode;
      i = 0;
      break;
      label60:
      localNode = null;
    }
  }
  
  LinkedTreeMap.Node findByObject(Object paramObject)
  {
    LinkedTreeMap.Node localNode = null;
    if (paramObject != null) {}
    try
    {
      localNode = find(paramObject, false);
    }
    catch (ClassCastException localClassCastException)
    {
      for (;;) {}
    }
    return localNode;
  }
  
  public Object get(Object paramObject)
  {
    LinkedTreeMap.Node localNode = findByObject(paramObject);
    if (localNode != null) {}
    for (Object localObject = localNode.value;; localObject = null) {
      return localObject;
    }
  }
  
  public Set keySet()
  {
    LinkedTreeMap.KeySet localKeySet = this.keySet;
    if (localKeySet != null) {}
    for (;;)
    {
      return localKeySet;
      localKeySet = new com/google/gson/internal/LinkedTreeMap$KeySet;
      localKeySet.<init>(this);
      this.keySet = localKeySet;
    }
  }
  
  public Object put(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null)
    {
      NullPointerException localNullPointerException = new java/lang/NullPointerException;
      localNullPointerException.<init>("key == null");
      throw localNullPointerException;
    }
    LinkedTreeMap.Node localNode = find(paramObject1, true);
    Object localObject = localNode.value;
    localNode.value = paramObject2;
    return localObject;
  }
  
  public Object remove(Object paramObject)
  {
    LinkedTreeMap.Node localNode = removeInternalByKey(paramObject);
    if (localNode != null) {}
    for (Object localObject = localNode.value;; localObject = null) {
      return localObject;
    }
  }
  
  void removeInternal(LinkedTreeMap.Node paramNode, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      LinkedTreeMap.Node localNode1 = paramNode.prev;
      LinkedTreeMap.Node localNode2 = paramNode.next;
      localNode1.next = localNode2;
      localNode1 = paramNode.next;
      localNode2 = paramNode.prev;
      localNode1.prev = localNode2;
    }
    LinkedTreeMap.Node localNode3 = paramNode.left;
    LinkedTreeMap.Node localNode4 = paramNode.right;
    LinkedTreeMap.Node localNode5 = paramNode.parent;
    int i;
    if ((localNode3 != null) && (localNode4 != null))
    {
      i = localNode3.height;
      int j = localNode4.height;
      if (i > j) {}
      for (LinkedTreeMap.Node localNode6 = localNode3.last();; localNode6 = localNode4.first())
      {
        removeInternal(localNode6, false);
        int k = 0;
        localNode3 = paramNode.left;
        if (localNode3 != null)
        {
          k = localNode3.height;
          localNode6.left = localNode3;
          localNode3.parent = localNode6;
          paramNode.left = null;
        }
        int m = 0;
        localNode4 = paramNode.right;
        if (localNode4 != null)
        {
          m = localNode4.height;
          localNode6.right = localNode4;
          localNode4.parent = localNode6;
          paramNode.right = null;
        }
        i = Math.max(k, m) + 1;
        localNode6.height = i;
        replaceInParent(paramNode, localNode6);
        return;
      }
    }
    if (localNode3 != null)
    {
      replaceInParent(paramNode, localNode3);
      paramNode.left = null;
    }
    for (;;)
    {
      rebalance(localNode5, false);
      i = this.size + -1;
      this.size = i;
      i = this.modCount + 1;
      this.modCount = i;
      break;
      if (localNode4 != null)
      {
        replaceInParent(paramNode, localNode4);
        paramNode.right = null;
      }
      else
      {
        replaceInParent(paramNode, null);
      }
    }
  }
  
  LinkedTreeMap.Node removeInternalByKey(Object paramObject)
  {
    LinkedTreeMap.Node localNode = findByObject(paramObject);
    if (localNode != null)
    {
      boolean bool = true;
      removeInternal(localNode, bool);
    }
    return localNode;
  }
  
  public int size()
  {
    return this.size;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/LinkedTreeMap.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */