package org.apache.commons.lang.math;

import java.io.Serializable;

public final class IntRange
  extends Range
  implements Serializable
{
  private static final long serialVersionUID = 71849363892730L;
  private transient int hashCode;
  private final int max;
  private transient Integer maxObject = null;
  private final int min;
  private transient Integer minObject = null;
  private transient String toString;
  
  public IntRange(int paramInt)
  {
    this.hashCode = 0;
    this.toString = null;
    this.min = paramInt;
    this.max = paramInt;
  }
  
  public IntRange(int paramInt1, int paramInt2)
  {
    this.hashCode = 0;
    this.toString = null;
    if (paramInt2 < paramInt1) {
      this.min = paramInt2;
    }
    for (this.max = paramInt1;; this.max = paramInt2)
    {
      return;
      this.min = paramInt1;
    }
  }
  
  public IntRange(Number paramNumber)
  {
    int i = 0;
    Object localObject = null;
    this.hashCode = 0;
    this.toString = null;
    if (paramNumber == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("The number must not be null");
      throw ((Throwable)localObject);
    }
    i = paramNumber.intValue();
    this.min = i;
    i = paramNumber.intValue();
    this.max = i;
    boolean bool = paramNumber instanceof Integer;
    if (bool)
    {
      localObject = paramNumber;
      localObject = (Integer)paramNumber;
      this.minObject = ((Integer)localObject);
      paramNumber = (Integer)paramNumber;
      this.maxObject = paramNumber;
    }
  }
  
  public IntRange(Number paramNumber1, Number paramNumber2)
  {
    boolean bool = false;
    IllegalArgumentException localIllegalArgumentException = null;
    this.hashCode = 0;
    this.toString = null;
    if ((paramNumber1 == null) || (paramNumber2 == null))
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The numbers must not be null");
      throw localIllegalArgumentException;
    }
    int i = paramNumber1.intValue();
    int j = paramNumber2.intValue();
    if (j < i)
    {
      this.min = j;
      this.max = i;
      bool = paramNumber2 instanceof Integer;
      if (bool)
      {
        paramNumber2 = (Integer)paramNumber2;
        this.minObject = paramNumber2;
      }
      bool = paramNumber1 instanceof Integer;
      if (bool)
      {
        paramNumber1 = (Integer)paramNumber1;
        this.maxObject = paramNumber1;
      }
    }
    for (;;)
    {
      return;
      this.min = i;
      this.max = j;
      bool = paramNumber1 instanceof Integer;
      if (bool)
      {
        paramNumber1 = (Integer)paramNumber1;
        this.minObject = paramNumber1;
      }
      bool = paramNumber2 instanceof Integer;
      if (bool)
      {
        paramNumber2 = (Integer)paramNumber2;
        this.maxObject = paramNumber2;
      }
    }
  }
  
  public boolean containsInteger(int paramInt)
  {
    int i = this.min;
    if (paramInt >= i)
    {
      i = this.max;
      if (paramInt > i) {}
    }
    for (i = 1;; i = 0) {
      return i;
    }
  }
  
  public boolean containsNumber(Number paramNumber)
  {
    if (paramNumber == null) {}
    int i;
    boolean bool2;
    for (boolean bool1 = false;; bool2 = containsInteger(i))
    {
      return bool1;
      i = paramNumber.intValue();
    }
  }
  
  public boolean containsRange(Range paramRange)
  {
    boolean bool1 = false;
    if (paramRange == null) {}
    for (;;)
    {
      return bool1;
      int i = paramRange.getMinimumInteger();
      boolean bool2 = containsInteger(i);
      if (bool2)
      {
        int j = paramRange.getMaximumInteger();
        boolean bool3 = containsInteger(j);
        if (bool3) {
          bool1 = true;
        }
      }
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof IntRange;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        Object localObject = paramObject;
        localObject = (IntRange)paramObject;
        int i = this.min;
        int j = ((IntRange)localObject).min;
        if (i == j)
        {
          i = this.max;
          j = ((IntRange)localObject).max;
          if (i == j) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public double getMaximumDouble()
  {
    return this.max;
  }
  
  public float getMaximumFloat()
  {
    return this.max;
  }
  
  public int getMaximumInteger()
  {
    return this.max;
  }
  
  public long getMaximumLong()
  {
    return this.max;
  }
  
  public Number getMaximumNumber()
  {
    Integer localInteger = this.maxObject;
    if (localInteger == null)
    {
      localInteger = new java/lang/Integer;
      int i = this.max;
      localInteger.<init>(i);
      this.maxObject = localInteger;
    }
    return this.maxObject;
  }
  
  public double getMinimumDouble()
  {
    return this.min;
  }
  
  public float getMinimumFloat()
  {
    return this.min;
  }
  
  public int getMinimumInteger()
  {
    return this.min;
  }
  
  public long getMinimumLong()
  {
    return this.min;
  }
  
  public Number getMinimumNumber()
  {
    Integer localInteger = this.minObject;
    if (localInteger == null)
    {
      localInteger = new java/lang/Integer;
      int i = this.min;
      localInteger.<init>(i);
      this.minObject = localInteger;
    }
    return this.minObject;
  }
  
  public int hashCode()
  {
    int i = this.hashCode;
    if (i == 0)
    {
      this.hashCode = 17;
      i = this.hashCode * 37;
      Class localClass = getClass();
      int j = localClass.hashCode();
      i += j;
      this.hashCode = i;
      i = this.hashCode * 37;
      j = this.min;
      i += j;
      this.hashCode = i;
      i = this.hashCode * 37;
      j = this.max;
      i += j;
      this.hashCode = i;
    }
    return this.hashCode;
  }
  
  public boolean overlapsRange(Range paramRange)
  {
    boolean bool1 = false;
    if (paramRange == null) {}
    for (;;)
    {
      return bool1;
      int i = this.min;
      boolean bool2 = paramRange.containsInteger(i);
      if (!bool2)
      {
        int j = this.max;
        boolean bool3 = paramRange.containsInteger(j);
        if (!bool3)
        {
          int k = paramRange.getMinimumInteger();
          boolean bool4 = containsInteger(k);
          if (!bool4) {
            continue;
          }
        }
      }
      bool1 = true;
    }
  }
  
  public int[] toArray()
  {
    int i = this.max;
    int j = this.min;
    i = i - j + 1;
    int[] arrayOfInt = new int[i];
    int k = 0;
    for (;;)
    {
      i = arrayOfInt.length;
      if (k >= i) {
        break;
      }
      i = this.min + k;
      arrayOfInt[k] = i;
      k += 1;
    }
    return arrayOfInt;
  }
  
  public String toString()
  {
    String str = this.toString;
    if (str == null)
    {
      StringBuffer localStringBuffer = new java/lang/StringBuffer;
      localStringBuffer.<init>(32);
      localStringBuffer.append("Range[");
      int i = this.min;
      localStringBuffer.append(i);
      localStringBuffer.append(',');
      i = this.max;
      localStringBuffer.append(i);
      i = 93;
      localStringBuffer.append(i);
      str = localStringBuffer.toString();
      this.toString = str;
    }
    return this.toString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/math/IntRange.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */