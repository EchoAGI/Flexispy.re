package org.apache.commons.lang.time;

class FastDateFormat$Pair
{
  private final Object mObj1;
  private final Object mObj2;
  
  public FastDateFormat$Pair(Object paramObject1, Object paramObject2)
  {
    this.mObj1 = paramObject1;
    this.mObj2 = paramObject2;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof Pair;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        Object localObject1 = paramObject;
        localObject1 = (Pair)paramObject;
        Object localObject2 = this.mObj1;
        if (localObject2 == null)
        {
          localObject2 = ((Pair)localObject1).mObj1;
          if (localObject2 == null)
          {
            label55:
            localObject2 = this.mObj2;
            if (localObject2 != null) {
              break label111;
            }
            localObject2 = ((Pair)localObject1).mObj2;
            if (localObject2 == null) {
              continue;
            }
          }
        }
        label111:
        do
        {
          do
          {
            bool1 = false;
            break;
            localObject2 = this.mObj1;
            localObject3 = ((Pair)localObject1).mObj1;
            bool2 = localObject2.equals(localObject3);
          } while (!bool2);
          break label55;
          localObject2 = this.mObj2;
          Object localObject3 = ((Pair)localObject1).mObj2;
          bool2 = localObject2.equals(localObject3);
        } while (!bool2);
      }
    }
  }
  
  public int hashCode()
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = this.mObj1;
    int j;
    if (localObject2 == null)
    {
      j = 0;
      localObject2 = null;
      Object localObject3 = this.mObj2;
      if (localObject3 != null) {
        break label48;
      }
    }
    for (;;)
    {
      return j + i;
      localObject2 = this.mObj1;
      j = localObject2.hashCode();
      break;
      label48:
      localObject1 = this.mObj2;
      i = localObject1.hashCode();
    }
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    localStringBuffer = localStringBuffer.append("[");
    Object localObject = this.mObj1;
    localStringBuffer = localStringBuffer.append(localObject).append(':');
    localObject = this.mObj2;
    return localObject + ']';
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/time/FastDateFormat$Pair.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */