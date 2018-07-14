package org.apache.commons.lang.math;

public abstract class Range
{
  public boolean containsDouble(double paramDouble)
  {
    int i = NumberUtils.compare(getMinimumDouble(), paramDouble);
    double d = getMaximumDouble();
    int j = NumberUtils.compare(d, paramDouble);
    if ((i <= 0) && (j >= 0)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean containsDouble(Number paramNumber)
  {
    if (paramNumber == null) {}
    double d;
    for (boolean bool = false;; bool = containsDouble(d))
    {
      return bool;
      d = paramNumber.doubleValue();
    }
  }
  
  public boolean containsFloat(float paramFloat)
  {
    int i = NumberUtils.compare(getMinimumFloat(), paramFloat);
    float f = getMaximumFloat();
    int j = NumberUtils.compare(f, paramFloat);
    boolean bool;
    if ((i <= 0) && (j >= 0)) {
      bool = true;
    }
    for (f = Float.MIN_VALUE;; f = 0.0F)
    {
      return bool;
      bool = false;
    }
  }
  
  public boolean containsFloat(Number paramNumber)
  {
    boolean bool;
    float f;
    if (paramNumber == null)
    {
      bool = false;
      f = 0.0F;
    }
    for (;;)
    {
      return bool;
      f = paramNumber.floatValue();
      bool = containsFloat(f);
    }
  }
  
  public boolean containsInteger(int paramInt)
  {
    int i = getMinimumInteger();
    if (paramInt >= i)
    {
      i = getMaximumInteger();
      if (paramInt > i) {}
    }
    for (i = 1;; i = 0) {
      return i;
    }
  }
  
  public boolean containsInteger(Number paramNumber)
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
  
  public boolean containsLong(long paramLong)
  {
    long l = getMinimumLong();
    boolean bool = paramLong < l;
    if (!bool)
    {
      l = getMaximumLong();
      bool = paramLong < l;
      if (bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean containsLong(Number paramNumber)
  {
    if (paramNumber == null) {}
    long l;
    for (boolean bool = false;; bool = containsLong(l))
    {
      return bool;
      l = paramNumber.longValue();
    }
  }
  
  public abstract boolean containsNumber(Number paramNumber);
  
  public boolean containsRange(Range paramRange)
  {
    boolean bool1 = false;
    if (paramRange == null) {}
    for (;;)
    {
      return bool1;
      Number localNumber = paramRange.getMinimumNumber();
      boolean bool2 = containsNumber(localNumber);
      if (bool2)
      {
        localNumber = paramRange.getMaximumNumber();
        bool2 = containsNumber(localNumber);
        if (bool2) {
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
      if (paramObject != null)
      {
        localObject1 = paramObject.getClass();
        localObject2 = getClass();
        if (localObject1 == localObject2) {}
      }
      else
      {
        bool1 = false;
        continue;
      }
      Object localObject3 = paramObject;
      localObject3 = (Range)paramObject;
      Object localObject1 = getMinimumNumber();
      Object localObject2 = ((Range)localObject3).getMinimumNumber();
      boolean bool2 = localObject1.equals(localObject2);
      if (bool2)
      {
        localObject1 = getMaximumNumber();
        localObject2 = ((Range)localObject3).getMaximumNumber();
        bool2 = localObject1.equals(localObject2);
        if (bool2) {}
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public double getMaximumDouble()
  {
    return getMaximumNumber().doubleValue();
  }
  
  public float getMaximumFloat()
  {
    return getMaximumNumber().floatValue();
  }
  
  public int getMaximumInteger()
  {
    return getMaximumNumber().intValue();
  }
  
  public long getMaximumLong()
  {
    return getMaximumNumber().longValue();
  }
  
  public abstract Number getMaximumNumber();
  
  public double getMinimumDouble()
  {
    return getMinimumNumber().doubleValue();
  }
  
  public float getMinimumFloat()
  {
    return getMinimumNumber().floatValue();
  }
  
  public int getMinimumInteger()
  {
    return getMinimumNumber().intValue();
  }
  
  public long getMinimumLong()
  {
    return getMinimumNumber().longValue();
  }
  
  public abstract Number getMinimumNumber();
  
  public int hashCode()
  {
    int i = (getClass().hashCode() + 629) * 37;
    int j = getMinimumNumber().hashCode();
    i = (i + j) * 37;
    j = getMaximumNumber().hashCode();
    return i + j;
  }
  
  public boolean overlapsRange(Range paramRange)
  {
    boolean bool1 = false;
    if (paramRange == null) {}
    for (;;)
    {
      return bool1;
      Number localNumber = getMinimumNumber();
      boolean bool2 = paramRange.containsNumber(localNumber);
      if (!bool2)
      {
        localNumber = getMaximumNumber();
        bool2 = paramRange.containsNumber(localNumber);
        if (!bool2)
        {
          localNumber = paramRange.getMinimumNumber();
          bool2 = containsNumber(localNumber);
          if (!bool2) {
            continue;
          }
        }
      }
      bool1 = true;
    }
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>(32);
    localStringBuffer.append("Range[");
    Number localNumber = getMinimumNumber();
    localStringBuffer.append(localNumber);
    localStringBuffer.append(',');
    localNumber = getMaximumNumber();
    localStringBuffer.append(localNumber);
    localStringBuffer.append(']');
    return localStringBuffer.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/math/Range.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */