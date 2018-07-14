package org.apache.commons.lang.time;

import org.apache.commons.lang.StringUtils;

class DurationFormatUtils$Token
{
  private int count;
  private Object value;
  
  DurationFormatUtils$Token(Object paramObject)
  {
    this.value = paramObject;
    this.count = 1;
  }
  
  DurationFormatUtils$Token(Object paramObject, int paramInt)
  {
    this.value = paramObject;
    this.count = paramInt;
  }
  
  static boolean containsTokenWithValue(Token[] paramArrayOfToken, Object paramObject)
  {
    int i = paramArrayOfToken.length;
    int j = 0;
    Object localObject;
    boolean bool;
    if (j < i)
    {
      localObject = paramArrayOfToken[j].getValue();
      if (localObject == paramObject) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      j += 1;
      break;
      bool = false;
      localObject = null;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool2 = paramObject instanceof Token;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (bool2)
    {
      localObject2 = paramObject;
      localObject2 = (Token)paramObject;
      localObject3 = this.value.getClass();
      localObject4 = ((Token)localObject2).value.getClass();
      if (localObject3 == localObject4) {
        break label52;
      }
    }
    for (;;)
    {
      return bool1;
      label52:
      int i = this.count;
      int j = ((Token)localObject2).count;
      if (i == j)
      {
        localObject3 = this.value;
        boolean bool3 = localObject3 instanceof StringBuffer;
        if (bool3)
        {
          localObject1 = this.value.toString();
          localObject3 = ((Token)localObject2).value.toString();
          bool1 = ((String)localObject1).equals(localObject3);
        }
        else
        {
          localObject3 = this.value;
          bool3 = localObject3 instanceof Number;
          if (bool3)
          {
            localObject1 = this.value;
            localObject3 = ((Token)localObject2).value;
            bool1 = localObject1.equals(localObject3);
          }
          else
          {
            localObject3 = this.value;
            localObject4 = ((Token)localObject2).value;
            if (localObject3 == localObject4) {
              bool1 = true;
            }
          }
        }
      }
    }
  }
  
  int getCount()
  {
    return this.count;
  }
  
  Object getValue()
  {
    return this.value;
  }
  
  public int hashCode()
  {
    return this.value.hashCode();
  }
  
  void increment()
  {
    int i = this.count + 1;
    this.count = i;
  }
  
  public String toString()
  {
    String str = this.value.toString();
    int i = this.count;
    return StringUtils.repeat(str, i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/time/DurationFormatUtils$Token.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */