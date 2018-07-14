package android.support.v4.util;

public class SparseArrayCompat
{
  private static final Object DELETED;
  private boolean mGarbage = false;
  private int[] mKeys;
  private int mSize;
  private Object[] mValues;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    DELETED = localObject;
  }
  
  public SparseArrayCompat()
  {
    this(10);
  }
  
  public SparseArrayCompat(int paramInt)
  {
    paramInt = idealIntArraySize(paramInt);
    Object localObject = new int[paramInt];
    this.mKeys = ((int[])localObject);
    localObject = new Object[paramInt];
    this.mValues = ((Object[])localObject);
    this.mSize = 0;
  }
  
  private static int binarySearch(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt1 + paramInt2;
    int j = paramInt1 + -1;
    for (;;)
    {
      k = i - j;
      int m = 1;
      if (k <= m) {
        break;
      }
      int n = (i + j) / 2;
      k = paramArrayOfInt[n];
      if (k < paramInt3) {
        j = n;
      } else {
        i = n;
      }
    }
    int k = paramInt1 + paramInt2;
    if (i == k)
    {
      k = paramInt1 + paramInt2;
      i = k ^ 0xFFFFFFFF;
    }
    for (;;)
    {
      return i;
      k = paramArrayOfInt[i];
      if (k != paramInt3) {
        i ^= 0xFFFFFFFF;
      }
    }
  }
  
  private void gc()
  {
    int i = this.mSize;
    int j = 0;
    int[] arrayOfInt = this.mKeys;
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
          int m = arrayOfInt[k];
          arrayOfInt[j] = m;
          arrayOfObject[j] = localObject1;
        }
        j += 1;
      }
      k += 1;
    }
    this.mGarbage = false;
    this.mSize = j;
  }
  
  static int idealByteArraySize(int paramInt)
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
  
  static int idealIntArraySize(int paramInt)
  {
    return idealByteArraySize(paramInt * 4) / 4;
  }
  
  public void append(int paramInt, Object paramObject)
  {
    int i = this.mSize;
    Object localObject1;
    int k;
    if (i != 0)
    {
      localObject1 = this.mKeys;
      k = this.mSize + -1;
      i = localObject1[k];
      if (paramInt <= i) {
        put(paramInt, paramObject);
      }
    }
    for (;;)
    {
      return;
      boolean bool = this.mGarbage;
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
        int n = idealIntArraySize(j);
        int[] arrayOfInt = new int[n];
        Object[] arrayOfObject = new Object[n];
        localObject1 = this.mKeys;
        k = this.mKeys.length;
        System.arraycopy(localObject1, 0, arrayOfInt, 0, k);
        localObject1 = this.mValues;
        localObject2 = this.mValues;
        k = localObject2.length;
        System.arraycopy(localObject1, 0, arrayOfObject, 0, k);
        this.mKeys = arrayOfInt;
        this.mValues = arrayOfObject;
      }
      this.mKeys[m] = paramInt;
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
  
  public void delete(int paramInt)
  {
    Object localObject1 = this.mKeys;
    Object localObject2 = null;
    int i = this.mSize;
    int j = binarySearch((int[])localObject1, 0, i, paramInt);
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
  
  public Object get(int paramInt)
  {
    return get(paramInt, null);
  }
  
  public Object get(int paramInt, Object paramObject)
  {
    Object localObject1 = this.mKeys;
    Object localObject2 = null;
    int i = this.mSize;
    int j = binarySearch((int[])localObject1, 0, i, paramInt);
    if (j >= 0)
    {
      localObject1 = this.mValues[j];
      localObject2 = DELETED;
      if (localObject1 != localObject2) {
        break label50;
      }
    }
    for (;;)
    {
      return paramObject;
      label50:
      localObject1 = this.mValues;
      paramObject = localObject1[j];
    }
  }
  
  public int indexOfKey(int paramInt)
  {
    boolean bool = this.mGarbage;
    if (bool) {
      gc();
    }
    int[] arrayOfInt = this.mKeys;
    int i = this.mSize;
    return binarySearch(arrayOfInt, 0, i, paramInt);
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
  
  public int keyAt(int paramInt)
  {
    boolean bool = this.mGarbage;
    if (bool) {
      gc();
    }
    return this.mKeys[paramInt];
  }
  
  public void put(int paramInt, Object paramObject)
  {
    int i = 0;
    Object localObject1 = this.mKeys;
    int j = this.mSize;
    int k = binarySearch((int[])localObject1, 0, j, paramInt);
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
          this.mKeys[k] = paramInt;
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
          n = binarySearch((int[])localObject1, 0, j, paramInt);
          k = n ^ 0xFFFFFFFF;
        }
      }
      int n = this.mSize;
      Object localObject2 = this.mKeys;
      j = localObject2.length;
      if (n >= j)
      {
        n = this.mSize + 1;
        int i1 = idealIntArraySize(n);
        int[] arrayOfInt = new int[i1];
        Object[] arrayOfObject = new Object[i1];
        localObject1 = this.mKeys;
        j = this.mKeys.length;
        System.arraycopy(localObject1, 0, arrayOfInt, 0, j);
        localObject1 = this.mValues;
        localObject2 = this.mValues;
        j = localObject2.length;
        System.arraycopy(localObject1, 0, arrayOfObject, 0, j);
        this.mKeys = arrayOfInt;
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
      this.mKeys[k] = paramInt;
      localObject1 = this.mValues;
      localObject1[k] = paramObject;
      n = this.mSize + 1;
      this.mSize = n;
    }
  }
  
  public void remove(int paramInt)
  {
    delete(paramInt);
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
  
  public void removeAtRange(int paramInt1, int paramInt2)
  {
    int i = this.mSize;
    int j = paramInt1 + paramInt2;
    int k = Math.min(i, j);
    int m = paramInt1;
    while (m < k)
    {
      removeAt(m);
      m += 1;
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/util/SparseArrayCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */