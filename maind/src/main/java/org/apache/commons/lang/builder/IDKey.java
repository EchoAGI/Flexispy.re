package org.apache.commons.lang.builder;

final class IDKey
{
  private final int id;
  private final Object value;
  
  public IDKey(Object paramObject)
  {
    int i = System.identityHashCode(paramObject);
    this.id = i;
    this.value = paramObject;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof IDKey;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      Object localObject1 = paramObject;
      localObject1 = (IDKey)paramObject;
      int i = this.id;
      int j = ((IDKey)localObject1).id;
      if (i == j)
      {
        Object localObject2 = this.value;
        Object localObject3 = ((IDKey)localObject1).value;
        if (localObject2 == localObject3) {
          bool1 = true;
        }
      }
    }
  }
  
  public int hashCode()
  {
    return this.id;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/builder/IDKey.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */