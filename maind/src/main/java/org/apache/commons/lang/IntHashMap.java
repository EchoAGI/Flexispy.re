package org.apache.commons.lang;

class IntHashMap
{
  private transient int count;
  private final float loadFactor;
  private transient IntHashMap.Entry[] table;
  private int threshold;
  
  public IntHashMap()
  {
    this(20, 0.75F);
  }
  
  public IntHashMap(int paramInt)
  {
    this(paramInt, 0.75F);
  }
  
  public IntHashMap(int paramInt, float paramFloat)
  {
    Object localObject2;
    if (paramInt < 0)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      localObject2 = new java/lang/StringBuffer;
      ((StringBuffer)localObject2).<init>();
      localObject2 = "Illegal Capacity: " + paramInt;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = null;
    boolean bool = paramFloat < 0.0F;
    if (!bool)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      localObject2 = new java/lang/StringBuffer;
      ((StringBuffer)localObject2).<init>();
      localObject2 = "Illegal Load: " + paramFloat;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    if (paramInt == 0) {
      paramInt = 1;
    }
    this.loadFactor = paramFloat;
    localObject1 = new IntHashMap.Entry[paramInt];
    this.table = ((IntHashMap.Entry[])localObject1);
    int i = (int)(paramInt * paramFloat);
    this.threshold = i;
  }
  
  public void clear()
  {
    try
    {
      IntHashMap.Entry[] arrayOfEntry = this.table;
      int i = arrayOfEntry.length;
      for (;;)
      {
        i += -1;
        if (i < 0) {
          break;
        }
        Object localObject1 = null;
        arrayOfEntry[i] = null;
      }
      Object localObject3 = null;
    }
    finally {}
    this.count = 0;
  }
  
  public boolean contains(Object paramObject)
  {
    Object localObject;
    if (paramObject == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    IntHashMap.Entry[] arrayOfEntry = this.table;
    int i = arrayOfEntry.length;
    int j = i;
    i = j + -1;
    IntHashMap.Entry localEntry;
    label44:
    boolean bool;
    if (j > 0)
    {
      localEntry = arrayOfEntry[i];
      if (localEntry != null)
      {
        localObject = localEntry.value;
        bool = localObject.equals(paramObject);
        if (bool) {
          bool = true;
        }
      }
    }
    for (;;)
    {
      return bool;
      localEntry = localEntry.next;
      break label44;
      j = i;
      break;
      bool = false;
      localObject = null;
    }
  }
  
  public boolean containsKey(int paramInt)
  {
    IntHashMap.Entry[] arrayOfEntry = this.table;
    int i = paramInt;
    int j = -1 >>> 1 & paramInt;
    int m = arrayOfEntry.length;
    int n = j % m;
    IntHashMap.Entry localEntry = arrayOfEntry[n];
    if (localEntry != null)
    {
      j = localEntry.hash;
      if (j != i) {}
    }
    int k;
    for (j = 1;; k = 0)
    {
      return j;
      localEntry = localEntry.next;
      break;
    }
  }
  
  public boolean containsValue(Object paramObject)
  {
    return contains(paramObject);
  }
  
  public Object get(int paramInt)
  {
    IntHashMap.Entry[] arrayOfEntry = this.table;
    int i = paramInt;
    int j = -1 >>> 1 & paramInt;
    int k = arrayOfEntry.length;
    int m = j % k;
    IntHashMap.Entry localEntry = arrayOfEntry[m];
    if (localEntry != null)
    {
      j = localEntry.hash;
      if (j != i) {}
    }
    for (Object localObject = localEntry.value;; localObject = null)
    {
      return localObject;
      localEntry = localEntry.next;
      break;
      j = 0;
    }
  }
  
  public boolean isEmpty()
  {
    int i = this.count;
    if (i == 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public Object put(int paramInt, Object paramObject)
  {
    int i = -1 >>> 1;
    IntHashMap.Entry[] arrayOfEntry = this.table;
    int j = paramInt;
    int k = paramInt & i;
    int m = arrayOfEntry.length;
    int n = k % m;
    IntHashMap.Entry localEntry1 = arrayOfEntry[n];
    Object localObject;
    if (localEntry1 != null)
    {
      k = localEntry1.hash;
      if (k == j)
      {
        localObject = localEntry1.value;
        localEntry1.value = paramObject;
      }
    }
    for (;;)
    {
      return localObject;
      localEntry1 = localEntry1.next;
      break;
      k = this.count;
      m = this.threshold;
      if (k >= m)
      {
        rehash();
        arrayOfEntry = this.table;
        k = j & i;
        m = arrayOfEntry.length;
        n = k % m;
      }
      localEntry1 = new org/apache/commons/lang/IntHashMap$Entry;
      IntHashMap.Entry localEntry2 = arrayOfEntry[n];
      localEntry1.<init>(j, paramInt, paramObject, localEntry2);
      arrayOfEntry[n] = localEntry1;
      k = this.count + 1;
      this.count = k;
      localObject = null;
    }
  }
  
  protected void rehash()
  {
    IntHashMap.Entry[] arrayOfEntry1 = this.table;
    int i = arrayOfEntry1.length;
    IntHashMap.Entry[] arrayOfEntry2 = this.table;
    int j = i * 2 + 1;
    IntHashMap.Entry[] arrayOfEntry3 = new IntHashMap.Entry[j];
    float f1 = j;
    float f2 = this.loadFactor;
    f1 *= f2;
    int k = (int)f1;
    this.threshold = k;
    this.table = arrayOfEntry3;
    int m = i;
    for (int n = i;; n = m)
    {
      m = n + -1;
      if (n <= 0) {
        break;
      }
      IntHashMap.Entry localEntry1 = arrayOfEntry2[m];
      while (localEntry1 != null)
      {
        IntHashMap.Entry localEntry2 = localEntry1;
        localEntry1 = localEntry1.next;
        k = localEntry2.hash;
        int i1 = -1 >>> 1;
        f2 = 0.0F / 0.0F;
        k &= i1;
        int i2 = k % j;
        arrayOfEntry1 = arrayOfEntry3[i2];
        localEntry2.next = arrayOfEntry1;
        arrayOfEntry3[i2] = localEntry2;
      }
    }
  }
  
  public Object remove(int paramInt)
  {
    IntHashMap.Entry[] arrayOfEntry = this.table;
    int i = paramInt;
    int j = -1 >>> 1 & paramInt;
    int k = arrayOfEntry.length;
    int m = j % k;
    IntHashMap.Entry localEntry1 = arrayOfEntry[m];
    IntHashMap.Entry localEntry2 = null;
    IntHashMap.Entry localEntry3;
    label71:
    Object localObject;
    if (localEntry1 != null)
    {
      j = localEntry1.hash;
      if (j == i) {
        if (localEntry2 != null)
        {
          localEntry3 = localEntry1.next;
          localEntry2.next = localEntry3;
          j = this.count + -1;
          this.count = j;
          localObject = localEntry1.value;
          localEntry1.value = null;
        }
      }
    }
    for (;;)
    {
      return localObject;
      localEntry3 = localEntry1.next;
      arrayOfEntry[m] = localEntry3;
      break label71;
      localEntry2 = localEntry1;
      localEntry1 = localEntry1.next;
      break;
      localObject = null;
    }
  }
  
  public int size()
  {
    return this.count;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/IntHashMap.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */