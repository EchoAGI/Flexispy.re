package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public final class LinkedHashTreeMap
  extends AbstractMap
  implements Serializable
{
  private static final Comparator NATURAL_ORDER;
  Comparator comparator;
  private LinkedHashTreeMap.EntrySet entrySet;
  final LinkedHashTreeMap.Node header;
  private LinkedHashTreeMap.KeySet keySet;
  int modCount = 0;
  int size = 0;
  LinkedHashTreeMap.Node[] table;
  int threshold;
  
  static
  {
    Object localObject = LinkedHashTreeMap.class;
    boolean bool = ((Class)localObject).desiredAssertionStatus();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      $assertionsDisabled = bool;
      localObject = new com/google/gson/internal/LinkedHashTreeMap$1;
      ((LinkedHashTreeMap.1)localObject).<init>();
      NATURAL_ORDER = (Comparator)localObject;
      return;
      bool = false;
      localObject = null;
    }
  }
  
  public LinkedHashTreeMap()
  {
    this(localComparator);
  }
  
  public LinkedHashTreeMap(Comparator paramComparator)
  {
    if (paramComparator != null) {}
    for (;;)
    {
      this.comparator = paramComparator;
      localObject = new com/google/gson/internal/LinkedHashTreeMap$Node;
      ((LinkedHashTreeMap.Node)localObject).<init>();
      this.header = ((LinkedHashTreeMap.Node)localObject);
      localObject = new LinkedHashTreeMap.Node[16];
      this.table = ((LinkedHashTreeMap.Node[])localObject);
      i = this.table.length / 2;
      int j = this.table.length / 4;
      i += j;
      this.threshold = i;
      return;
      paramComparator = NATURAL_ORDER;
    }
  }
  
  private void doubleCapacity()
  {
    LinkedHashTreeMap.Node[] arrayOfNode = doubleCapacity(this.table);
    this.table = arrayOfNode;
    int i = this.table.length / 2;
    int j = this.table.length / 4;
    i += j;
    this.threshold = i;
  }
  
  static LinkedHashTreeMap.Node[] doubleCapacity(LinkedHashTreeMap.Node[] paramArrayOfNode)
  {
    int i = paramArrayOfNode.length;
    int j = i * 2;
    LinkedHashTreeMap.Node[] arrayOfNode = new LinkedHashTreeMap.Node[j];
    LinkedHashTreeMap.AvlIterator localAvlIterator = new com/google/gson/internal/LinkedHashTreeMap$AvlIterator;
    localAvlIterator.<init>();
    LinkedHashTreeMap.AvlBuilder localAvlBuilder1 = new com/google/gson/internal/LinkedHashTreeMap$AvlBuilder;
    localAvlBuilder1.<init>();
    LinkedHashTreeMap.AvlBuilder localAvlBuilder2 = new com/google/gson/internal/LinkedHashTreeMap$AvlBuilder;
    localAvlBuilder2.<init>();
    int k = 0;
    while (k < i)
    {
      LinkedHashTreeMap.Node localNode1 = paramArrayOfNode[k];
      if (localNode1 == null)
      {
        k += 1;
      }
      else
      {
        localAvlIterator.reset(localNode1);
        int m = 0;
        int n = 0;
        LinkedHashTreeMap.Node localNode2;
        for (;;)
        {
          localNode2 = localAvlIterator.next();
          if (localNode2 == null) {
            break;
          }
          j = localNode2.hash & i;
          if (j == 0) {
            m += 1;
          } else {
            n += 1;
          }
        }
        localAvlBuilder1.reset(m);
        localAvlBuilder2.reset(n);
        localAvlIterator.reset(localNode1);
        for (;;)
        {
          localNode2 = localAvlIterator.next();
          if (localNode2 == null) {
            break;
          }
          j = localNode2.hash & i;
          if (j == 0) {
            localAvlBuilder1.add(localNode2);
          } else {
            localAvlBuilder2.add(localNode2);
          }
        }
        label203:
        int i1;
        if (m > 0)
        {
          localNode3 = localAvlBuilder1.root();
          arrayOfNode[k] = localNode3;
          i1 = k + i;
          if (n <= 0) {
            break label244;
          }
        }
        for (LinkedHashTreeMap.Node localNode3 = localAvlBuilder2.root();; localNode3 = null)
        {
          arrayOfNode[i1] = localNode3;
          break;
          j = 0;
          localNode3 = null;
          break label203;
          label244:
          j = 0;
        }
      }
    }
    return arrayOfNode;
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
  
  private void rebalance(LinkedHashTreeMap.Node paramNode, boolean paramBoolean)
  {
    LinkedHashTreeMap.Node localNode1 = paramNode;
    LinkedHashTreeMap.Node localNode2;
    LinkedHashTreeMap.Node localNode3;
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
      LinkedHashTreeMap.Node localNode4 = localNode3.left;
      LinkedHashTreeMap.Node localNode5 = localNode3.right;
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
        LinkedHashTreeMap.Node localNode6 = localNode2.left;
        LinkedHashTreeMap.Node localNode7 = localNode2.right;
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
  
  private void replaceInParent(LinkedHashTreeMap.Node paramNode1, LinkedHashTreeMap.Node paramNode2)
  {
    LinkedHashTreeMap.Node localNode = paramNode1.parent;
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
      int i = paramNode1.hash;
      LinkedHashTreeMap.Node[] arrayOfNode = this.table;
      int j = arrayOfNode.length + -1;
      int k = i & j;
      localObject = this.table;
      localObject[k] = paramNode2;
    }
  }
  
  private void rotateLeft(LinkedHashTreeMap.Node paramNode)
  {
    int i = 0;
    LinkedHashTreeMap.Node localNode1 = paramNode.left;
    LinkedHashTreeMap.Node localNode2 = paramNode.right;
    LinkedHashTreeMap.Node localNode3 = localNode2.left;
    LinkedHashTreeMap.Node localNode4 = localNode2.right;
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
  
  private void rotateRight(LinkedHashTreeMap.Node paramNode)
  {
    int i = 0;
    LinkedHashTreeMap.Node localNode1 = paramNode.left;
    LinkedHashTreeMap.Node localNode2 = paramNode.right;
    LinkedHashTreeMap.Node localNode3 = localNode1.left;
    LinkedHashTreeMap.Node localNode4 = localNode1.right;
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
  
  private static int secondaryHash(int paramInt)
  {
    int i = paramInt >>> 20;
    int j = paramInt >>> 12;
    i ^= j;
    paramInt ^= i;
    i = paramInt >>> 7 ^ paramInt;
    j = paramInt >>> 4;
    return i ^ j;
  }
  
  private Object writeReplace()
  {
    LinkedHashMap localLinkedHashMap = new java/util/LinkedHashMap;
    localLinkedHashMap.<init>(this);
    return localLinkedHashMap;
  }
  
  public void clear()
  {
    Arrays.fill(this.table, null);
    this.size = 0;
    int i = this.modCount + 1;
    this.modCount = i;
    LinkedHashTreeMap.Node localNode1 = this.header;
    LinkedHashTreeMap.Node localNode2;
    for (Object localObject = localNode1.next; localObject != localNode1; localObject = localNode2)
    {
      localNode2 = ((LinkedHashTreeMap.Node)localObject).next;
      ((LinkedHashTreeMap.Node)localObject).prev = null;
      ((LinkedHashTreeMap.Node)localObject).next = null;
    }
    localNode1.prev = localNode1;
    localNode1.next = localNode1;
  }
  
  public boolean containsKey(Object paramObject)
  {
    LinkedHashTreeMap.Node localNode = findByObject(paramObject);
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
    LinkedHashTreeMap.EntrySet localEntrySet = this.entrySet;
    if (localEntrySet != null) {}
    for (;;)
    {
      return localEntrySet;
      localEntrySet = new com/google/gson/internal/LinkedHashTreeMap$EntrySet;
      localEntrySet.<init>(this);
      this.entrySet = localEntrySet;
    }
  }
  
  LinkedHashTreeMap.Node find(Object paramObject, boolean paramBoolean)
  {
    int i = 0;
    Object localObject1 = null;
    Comparator localComparator = this.comparator;
    LinkedHashTreeMap.Node[] arrayOfNode = this.table;
    int j = secondaryHash(paramObject.hashCode());
    int k = arrayOfNode.length + -1;
    int n = j & k;
    Object localObject2 = arrayOfNode[n];
    int i1 = 0;
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
          break label121;
        }
        localObject3 = ((LinkedHashTreeMap.Node)localObject2).key;
        i1 = ((Comparable)localObject4).compareTo(localObject3);
        label103:
        if (i1 != 0) {
          break label143;
        }
        localObject1 = localObject2;
      }
    }
    label121:
    label143:
    LinkedHashTreeMap.Node localNode2;
    label259:
    label266:
    int m;
    for (;;)
    {
      return (LinkedHashTreeMap.Node)localObject1;
      localObject4 = null;
      break;
      localObject3 = ((LinkedHashTreeMap.Node)localObject2).key;
      i1 = localComparator.compare(paramObject, localObject3);
      break label103;
      if (i1 < 0) {}
      for (LinkedHashTreeMap.Node localNode1 = ((LinkedHashTreeMap.Node)localObject2).left;; localNode1 = ((LinkedHashTreeMap.Node)localObject2).right)
      {
        if (localNode1 != null) {
          break label259;
        }
        if (!paramBoolean) {
          break;
        }
        localNode2 = this.header;
        if (localObject2 != null) {
          break label354;
        }
        localObject3 = NATURAL_ORDER;
        if (localComparator != localObject3) {
          break label266;
        }
        boolean bool = paramObject instanceof Comparable;
        if (bool) {
          break label266;
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
      localNode3 = new com/google/gson/internal/LinkedHashTreeMap$Node;
      localObject1 = localNode2.prev;
      localObject3 = paramObject;
      localNode3.<init>((LinkedHashTreeMap.Node)localObject2, paramObject, j, localNode2, (LinkedHashTreeMap.Node)localObject1);
      arrayOfNode[n] = localNode3;
      m = this.size;
      i = m + 1;
      this.size = i;
      i = this.threshold;
      if (m > i) {
        doubleCapacity();
      }
      m = this.modCount + 1;
      this.modCount = m;
      localObject1 = localNode3;
    }
    label354:
    LinkedHashTreeMap.Node localNode3 = new com/google/gson/internal/LinkedHashTreeMap$Node;
    localObject1 = localNode2.prev;
    Object localObject3 = paramObject;
    localNode3.<init>((LinkedHashTreeMap.Node)localObject2, paramObject, j, localNode2, (LinkedHashTreeMap.Node)localObject1);
    if (i1 < 0) {
      ((LinkedHashTreeMap.Node)localObject2).left = localNode3;
    }
    for (;;)
    {
      m = 1;
      rebalance((LinkedHashTreeMap.Node)localObject2, m);
      break;
      ((LinkedHashTreeMap.Node)localObject2).right = localNode3;
    }
  }
  
  LinkedHashTreeMap.Node findByEntry(Map.Entry paramEntry)
  {
    Object localObject1 = paramEntry.getKey();
    LinkedHashTreeMap.Node localNode = findByObject(localObject1);
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
  
  LinkedHashTreeMap.Node findByObject(Object paramObject)
  {
    LinkedHashTreeMap.Node localNode = null;
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
    LinkedHashTreeMap.Node localNode = findByObject(paramObject);
    if (localNode != null) {}
    for (Object localObject = localNode.value;; localObject = null) {
      return localObject;
    }
  }
  
  public Set keySet()
  {
    LinkedHashTreeMap.KeySet localKeySet = this.keySet;
    if (localKeySet != null) {}
    for (;;)
    {
      return localKeySet;
      localKeySet = new com/google/gson/internal/LinkedHashTreeMap$KeySet;
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
    LinkedHashTreeMap.Node localNode = find(paramObject1, true);
    Object localObject = localNode.value;
    localNode.value = paramObject2;
    return localObject;
  }
  
  public Object remove(Object paramObject)
  {
    LinkedHashTreeMap.Node localNode = removeInternalByKey(paramObject);
    if (localNode != null) {}
    for (Object localObject = localNode.value;; localObject = null) {
      return localObject;
    }
  }
  
  void removeInternal(LinkedHashTreeMap.Node paramNode, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      LinkedHashTreeMap.Node localNode1 = paramNode.prev;
      LinkedHashTreeMap.Node localNode2 = paramNode.next;
      localNode1.next = localNode2;
      localNode1 = paramNode.next;
      localNode2 = paramNode.prev;
      localNode1.prev = localNode2;
      paramNode.prev = null;
      paramNode.next = null;
    }
    LinkedHashTreeMap.Node localNode3 = paramNode.left;
    LinkedHashTreeMap.Node localNode4 = paramNode.right;
    LinkedHashTreeMap.Node localNode5 = paramNode.parent;
    int i;
    if ((localNode3 != null) && (localNode4 != null))
    {
      i = localNode3.height;
      int j = localNode4.height;
      if (i > j) {}
      for (LinkedHashTreeMap.Node localNode6 = localNode3.last();; localNode6 = localNode4.first())
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
  
  LinkedHashTreeMap.Node removeInternalByKey(Object paramObject)
  {
    LinkedHashTreeMap.Node localNode = findByObject(paramObject);
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/LinkedHashTreeMap.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */