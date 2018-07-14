package org.apache.commons.lang;

class Entities$ArrayEntityMap
  implements Entities.EntityMap
{
  protected final int growBy;
  protected String[] names;
  protected int size = 0;
  protected int[] values;
  
  public Entities$ArrayEntityMap()
  {
    this.growBy = 100;
    Object localObject = new String[this.growBy];
    this.names = ((String[])localObject);
    localObject = new int[this.growBy];
    this.values = ((int[])localObject);
  }
  
  public Entities$ArrayEntityMap(int paramInt)
  {
    this.growBy = paramInt;
    Object localObject = new String[paramInt];
    this.names = ((String[])localObject);
    localObject = new int[paramInt];
    this.values = ((int[])localObject);
  }
  
  public void add(String paramString, int paramInt)
  {
    int i = this.size + 1;
    ensureCapacity(i);
    Object localObject = this.names;
    int j = this.size;
    localObject[j] = paramString;
    localObject = this.values;
    j = this.size;
    localObject[j] = paramInt;
    i = this.size + 1;
    this.size = i;
  }
  
  protected void ensureCapacity(int paramInt)
  {
    Object localObject = this.names;
    int i = localObject.length;
    if (paramInt > i)
    {
      i = this.size;
      int j = this.growBy;
      i += j;
      int k = Math.max(paramInt, i);
      String[] arrayOfString = new String[k];
      localObject = this.names;
      j = this.size;
      System.arraycopy(localObject, 0, arrayOfString, 0, j);
      this.names = arrayOfString;
      int[] arrayOfInt = new int[k];
      localObject = this.values;
      j = this.size;
      System.arraycopy(localObject, 0, arrayOfInt, 0, j);
      this.values = arrayOfInt;
    }
  }
  
  public String name(int paramInt)
  {
    int i = 0;
    int j = this.size;
    if (i < j)
    {
      localObject = this.values;
      j = localObject[i];
      if (j != paramInt) {}
    }
    for (Object localObject = this.names[i];; localObject = null)
    {
      return (String)localObject;
      i += 1;
      break;
      j = 0;
    }
  }
  
  public int value(String paramString)
  {
    int i = 0;
    int j = this.size;
    Object localObject;
    if (i < j)
    {
      localObject = this.names[i];
      boolean bool = ((String)localObject).equals(paramString);
      if (bool) {
        localObject = this.values;
      }
    }
    for (int k = localObject[i];; k = -1)
    {
      return k;
      i += 1;
      break;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/Entities$ArrayEntityMap.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */