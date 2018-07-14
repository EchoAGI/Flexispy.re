package android.support.v4.util;

public class LongSparseArray
  implements Cloneable
{
  private static final Object DELETED;
  private boolean mGarbage = false;
  private long[] mKeys;
  private int mSize;
  private Object[] mValues;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    DELETED = localObject;
  }
  
  public LongSparseArray()
  {
    this(10);
  }
  
  public LongSparseArray(int paramInt)
  {
    paramInt = idealLongArraySize(paramInt);
    Object localObject = new long[paramInt];
    this.mKeys = ((long[])localObject);
    localObject = new Object[paramInt];
    this.mValues = ((Object[])localObject);
    this.mSize = 0;
  }
  
  private static int binarySearch(long[] paramArrayOfLong, int paramInt1, int paramInt2, long paramLong)
  {
    int i = paramInt1 + paramInt2;
    int j = paramInt1 + -1;
    long l;
    for (;;)
    {
      int k = i - j;
      int n = 1;
      if (k <= n) {
        break;
      }
      int i1 = (i + j) / 2;
      l = paramArrayOfLong[i1];
      boolean bool1 = l < paramLong;
      if (bool1) {
        j = i1;
      } else {
        i = i1;
      }
    }
    int m = paramInt1 + paramInt2;
    if (i == m)
    {
      m = paramInt1 + paramInt2;
      i = m ^ 0xFFFFFFFF;
    }
    for (;;)
    {
      return i;
      l = paramArrayOfLong[i];
      boolean bool2 = l < paramLong;
      if (bool2) {
        i ^= 0xFFFFFFFF;
      }
    }
  }
  
  private void gc()
  {
    int i = this.mSize;
    int j = 0;
    long[] arrayOfLong = this.mKeys;
    Object[] arrayOfObject = this.mValues;
    int k = 0;
    while (k < i)
    {
      Object localObject1 = arrayOfObject[k];
      Object localObject2 = DELETED;
      if (localObject1 != localObject2)
      {
        if (k != j)
        {
          long l = arrayOfLong[k];
          arrayOfLong[j] = l;
          arrayOfObject[j] = localObject1;
          localObject2 = null;
          arrayOfObject[k] = null;
        }
        j += 1;
      }
      k += 1;
    }
    this.mGarbage = false;
    this.mSize = j;
  }
  
  public static int idealByteArraySize(int paramInt)
  {
    int i = 1;
    int j = 4;
    for (;;)
    {
      int k = 32;
      if (j < k)
      {
        k = (i << j) + -12;
        if (paramInt <= k)
        {
          k = i << j;
          paramInt = k + -12;
        }
      }
      else
      {
        return paramInt;
      }
      j += 1;
    }
  }
  
  public static int idealLongArraySize(int paramInt)
  {
    return idealByteArraySize(paramInt * 8) / 8;
  }
  
  public void append(long paramLong, Object paramObject)
  {
    int i = this.mSize;
    Object localObject1;
    int k;
    boolean bool;
    if (i != 0)
    {
      localObject1 = this.mKeys;
      k = this.mSize + -1;
      long l = localObject1[k];
      bool = paramLong < l;
      if (!bool) {
        put(paramLong, paramObject);
      }
    }
    for (;;)
    {
      return;
      bool = this.mGarbage;
      Object localObject2;
      if (bool)
      {
        j = this.mSize;
        localObject2 = this.mKeys;
        k = localObject2.length;
        if (j >= k) {
          gc();
        }
      }
      int m = this.mSize;
      localObject1 = this.mKeys;
      int j = localObject1.length;
      if (m >= j)
      {
        j = m + 1;
        int n = idealLongArraySize(j);
        long[] arrayOfLong = new long[n];
        Object[] arrayOfObject = new Object[n];
        localObject1 = this.mKeys;
        k = this.mKeys.length;
        System.arraycopy(localObject1, 0, arrayOfLong, 0, k);
        localObject1 = this.mValues;
        localObject2 = this.mValues;
        k = localObject2.length;
        System.arraycopy(localObject1, 0, arrayOfObject, 0, k);
        this.mKeys = arrayOfLong;
        this.mValues = arrayOfObject;
      }
      this.mKeys[m] = paramLong;
      localObject1 = this.mValues;
      localObject1[m] = paramObject;
      j = m + 1;
      this.mSize = j;
    }
  }
  
  public void clear()
  {
    int i = this.mSize;
    Object[] arrayOfObject = this.mValues;
    int j = 0;
    while (j < i)
    {
      arrayOfObject[j] = null;
      j += 1;
    }
    this.mSize = 0;
    this.mGarbage = false;
  }
  
  public LongSparseArray clone()
  {
    Object localObject1 = null;
    try
    {
      Object localObject2 = super.clone();
      Object localObject3 = localObject2;
      localObject3 = (LongSparseArray)localObject2;
      localObject1 = localObject3;
      localObject2 = this.mKeys;
      localObject2 = ((long[])localObject2).clone();
      localObject2 = (long[])localObject2;
      ((LongSparseArray)localObject3).mKeys = ((long[])localObject2);
      localObject2 = this.mValues;
      localObject2 = ((Object[])localObject2).clone();
      localObject2 = (Object[])localObject2;
      ((LongSparseArray)localObject3).mValues = ((Object[])localObject2);
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      for (;;) {}
    }
    return (LongSparseArray)localObject1;
  }
  
  public void delete(long paramLong)
  {
    Object localObject1 = this.mKeys;
    Object localObject2 = null;
    int i = this.mSize;
    int j = binarySearch((long[])localObject1, 0, i, paramLong);
    if (j >= 0)
    {
      localObject1 = this.mValues[j];
      localObject2 = DELETED;
      if (localObject1 != localObject2)
      {
        localObject1 = this.mValues;
        localObject2 = DELETED;
        localObject1[j] = localObject2;
        boolean bool = true;
        this.mGarbage = bool;
      }
    }
  }
  
  public Object get(long paramLong)
  {
    return get(paramLong, null);
  }
  
  public Object get(long paramLong, Object paramObject)
  {
    Object localObject1 = this.mKeys;
    Object localObject2 = null;
    int i = this.mSize;
    int j = binarySearch((long[])localObject1, 0, i, paramLong);
    if (j >= 0)
    {
      localObject1 = this.mValues[j];
      localObject2 = DELETED;
      if (localObject1 != localObject2) {
        break label54;
      }
    }
    for (;;)
    {
      return paramObject;
      label54:
      localObject1 = this.mValues;
      paramObject = localObject1[j];
    }
  }
  
  public int indexOfKey(long paramLong)
  {
    boolean bool = this.mGarbage;
    if (bool) {
      gc();
    }
    long[] arrayOfLong = this.mKeys;
    int i = this.mSize;
    return binarySearch(arrayOfLong, 0, i, paramLong);
  }
  
  public int indexOfValue(Object paramObject)
  {
    boolean bool = this.mGarbage;
    if (bool) {
      gc();
    }
    int j = 0;
    int i = this.mSize;
    if (j < i)
    {
      Object localObject = this.mValues[j];
      if (localObject != paramObject) {}
    }
    for (;;)
    {
      return j;
      j += 1;
      break;
      j = -1;
    }
  }
  
  public long keyAt(int paramInt)
  {
    boolean bool = this.mGarbage;
    if (bool) {
      gc();
    }
    return this.mKeys[paramInt];
  }
  
  public void put(long paramLong, Object paramObject)
  {
    int i = 0;
    Object localObject1 = this.mKeys;
    int j = this.mSize;
    int k = binarySearch((long[])localObject1, 0, j, paramLong);
    if (k >= 0)
    {
      localObject1 = this.mValues;
      localObject1[k] = paramObject;
    }
    for (;;)
    {
      return;
      k ^= 0xFFFFFFFF;
      int m = this.mSize;
      if (k < m)
      {
        localObject1 = this.mValues[k];
        localObject2 = DELETED;
        if (localObject1 == localObject2)
        {
          this.mKeys[k] = paramLong;
          localObject1 = this.mValues;
          localObject1[k] = paramObject;
          continue;
        }
      }
      boolean bool = this.mGarbage;
      if (bool)
      {
        n = this.mSize;
        localObject2 = this.mKeys;
        j = localObject2.length;
        if (n >= j)
        {
          gc();
          localObject1 = this.mKeys;
          j = this.mSize;
          n = binarySearch((long[])localObject1, 0, j, paramLong);
          k = n ^ 0xFFFFFFFF;
        }
      }
      int n = this.mSize;
      Object localObject2 = this.mKeys;
      j = localObject2.length;
      if (n >= j)
      {
        n = this.mSize + 1;
        int i1 = idealLongArraySize(n);
        long[] arrayOfLong = new long[i1];
        Object[] arrayOfObject = new Object[i1];
        localObject1 = this.mKeys;
        j = this.mKeys.length;
        System.arraycopy(localObject1, 0, arrayOfLong, 0, j);
        localObject1 = this.mValues;
        localObject2 = this.mValues;
        j = localObject2.length;
        System.arraycopy(localObject1, 0, arrayOfObject, 0, j);
        this.mKeys = arrayOfLong;
        this.mValues = arrayOfObject;
      }
      n = this.mSize - k;
      if (n != 0)
      {
        localObject1 = this.mKeys;
        localObject2 = this.mKeys;
        i = k + 1;
        int i2 = this.mSize - k;
        System.arraycopy(localObject1, k, localObject2, i, i2);
        localObject1 = this.mValues;
        localObject2 = this.mValues;
        i = k + 1;
        i2 = this.mSize - k;
        System.arraycopy(localObject1, k, localObject2, i, i2);
      }
      this.mKeys[k] = paramLong;
      localObject1 = this.mValues;
      localObject1[k] = paramObject;
      n = this.mSize + 1;
      this.mSize = n;
    }
  }
  
  public void remove(long paramLong)
  {
    delete(paramLong);
  }
  
  public void removeAt(int paramInt)
  {
    Object localObject1 = this.mValues[paramInt];
    Object localObject2 = DELETED;
    if (localObject1 != localObject2)
    {
      localObject1 = this.mValues;
      localObject2 = DELETED;
      localObject1[paramInt] = localObject2;
      boolean bool = true;
      this.mGarbage = bool;
    }
  }
  
  public void setValueAt(int paramInt, Object paramObject)
  {
    boolean bool = this.mGarbage;
    if (bool) {
      gc();
    }
    this.mValues[paramInt] = paramObject;
  }
  
  public int size()
  {
    boolean bool = this.mGarbage;
    if (bool) {
      gc();
    }
    return this.mSize;
  }
  
  public Object valueAt(int paramInt)
  {
    boolean bool = this.mGarbage;
    if (bool) {
      gc();
    }
    return this.mValues[paramInt];
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/util/LongSparseArray.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */