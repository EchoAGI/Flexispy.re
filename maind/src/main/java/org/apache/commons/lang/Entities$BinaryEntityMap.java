package org.apache.commons.lang;

class Entities$BinaryEntityMap
  extends Entities.ArrayEntityMap
{
  public Entities$BinaryEntityMap() {}
  
  public Entities$BinaryEntityMap(int paramInt)
  {
    super(paramInt);
  }
  
  private int binarySearch(int paramInt)
  {
    int i = 0;
    int j = this.size;
    int k = j + -1;
    while (i <= k)
    {
      j = i + k;
      m = j >>> 1;
      int[] arrayOfInt = this.values;
      int n = arrayOfInt[m];
      if (n < paramInt)
      {
        i = m + 1;
      }
      else
      {
        if (n <= paramInt) {
          break label78;
        }
        k = m + -1;
      }
    }
    j = i + 1;
    int m = -j;
    label78:
    return m;
  }
  
  public void add(String paramString, int paramInt)
  {
    int i = this.size + 1;
    ensureCapacity(i);
    int j = binarySearch(paramInt);
    if (j > 0) {}
    for (;;)
    {
      return;
      j = -(j + 1);
      Object localObject1 = this.values;
      Object localObject2 = this.values;
      int k = j + 1;
      int m = this.size - j;
      System.arraycopy(localObject1, j, localObject2, k, m);
      this.values[j] = paramInt;
      localObject1 = this.names;
      localObject2 = this.names;
      k = j + 1;
      m = this.size - j;
      System.arraycopy(localObject1, j, localObject2, k, m);
      localObject1 = this.names;
      localObject1[j] = paramString;
      i = this.size + 1;
      this.size = i;
    }
  }
  
  public String name(int paramInt)
  {
    int i = binarySearch(paramInt);
    if (i < 0) {}
    for (String str = null;; str = this.names[i]) {
      return str;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/Entities$BinaryEntityMap.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */