package org.apache.commons.lang;

public final class NumberRange
{
  private final Number max;
  private final Number min;
  
  public NumberRange(Number paramNumber)
  {
    if (paramNumber == null)
    {
      NullPointerException localNullPointerException = new java/lang/NullPointerException;
      localNullPointerException.<init>("The number must not be null");
      throw localNullPointerException;
    }
    this.min = paramNumber;
    this.max = paramNumber;
  }
  
  public NumberRange(Number paramNumber1, Number paramNumber2)
  {
    NullPointerException localNullPointerException;
    if (paramNumber1 == null)
    {
      localNullPointerException = new java/lang/NullPointerException;
      localNullPointerException.<init>("The minimum value must not be null");
      throw localNullPointerException;
    }
    if (paramNumber2 == null)
    {
      localNullPointerException = new java/lang/NullPointerException;
      localNullPointerException.<init>("The maximum value must not be null");
      throw localNullPointerException;
    }
    double d1 = paramNumber2.doubleValue();
    double d2 = paramNumber1.doubleValue();
    boolean bool = d1 < d2;
    if (bool)
    {
      this.max = paramNumber1;
      this.min = paramNumber1;
    }
    for (;;)
    {
      return;
      this.min = paramNumber1;
      this.max = paramNumber2;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof NumberRange;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        Object localObject = paramObject;
        localObject = (NumberRange)paramObject;
        Number localNumber1 = this.min;
        Number localNumber2 = ((NumberRange)localObject).min;
        bool2 = localNumber1.equals(localNumber2);
        if (bool2)
        {
          localNumber1 = this.max;
          localNumber2 = ((NumberRange)localObject).max;
          bool2 = localNumber1.equals(localNumber2);
          if (bool2) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public Number getMaximum()
  {
    return this.max;
  }
  
  public Number getMinimum()
  {
    return this.min;
  }
  
  public int hashCode()
  {
    int i = (this.min.hashCode() + 629) * 37;
    int j = this.max.hashCode();
    return i + j;
  }
  
  public boolean includesNumber(Number paramNumber)
  {
    boolean bool1 = false;
    if (paramNumber == null) {}
    for (;;)
    {
      return bool1;
      Number localNumber = this.min;
      double d1 = localNumber.doubleValue();
      double d2 = paramNumber.doubleValue();
      boolean bool2 = d1 < d2;
      if (!bool2)
      {
        localNumber = this.max;
        d1 = localNumber.doubleValue();
        d2 = paramNumber.doubleValue();
        bool2 = d1 < d2;
        if (!bool2) {
          bool1 = true;
        }
      }
    }
  }
  
  public boolean includesRange(NumberRange paramNumberRange)
  {
    boolean bool1 = false;
    if (paramNumberRange == null) {}
    for (;;)
    {
      return bool1;
      Number localNumber = paramNumberRange.min;
      boolean bool2 = includesNumber(localNumber);
      if (bool2)
      {
        localNumber = paramNumberRange.max;
        bool2 = includesNumber(localNumber);
        if (bool2) {
          bool1 = true;
        }
      }
    }
  }
  
  public boolean overlaps(NumberRange paramNumberRange)
  {
    boolean bool1 = false;
    if (paramNumberRange == null) {}
    for (;;)
    {
      return bool1;
      Number localNumber = this.min;
      boolean bool2 = paramNumberRange.includesNumber(localNumber);
      if (!bool2)
      {
        localNumber = this.max;
        bool2 = paramNumberRange.includesNumber(localNumber);
        if (!bool2)
        {
          bool2 = includesRange(paramNumberRange);
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
    char c1 = ')';
    char c2 = '(';
    double d1 = 0.0D;
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    Object localObject = this.min;
    double d2 = ((Number)localObject).doubleValue();
    boolean bool = d2 < d1;
    if (bool)
    {
      localObject = localStringBuffer.append(c2);
      Number localNumber = this.min;
      localObject = ((StringBuffer)localObject).append(localNumber);
      ((StringBuffer)localObject).append(c1);
      localStringBuffer.append('-');
      localObject = this.max;
      d2 = ((Number)localObject).doubleValue();
      bool = d2 < d1;
      if (!bool) {
        break label157;
      }
      localObject = localStringBuffer.append(c2);
      localNumber = this.max;
      localObject = ((StringBuffer)localObject).append(localNumber);
      ((StringBuffer)localObject).append(c1);
    }
    for (;;)
    {
      return localStringBuffer.toString();
      localObject = this.min;
      localStringBuffer.append(localObject);
      break;
      label157:
      localObject = this.max;
      localStringBuffer.append(localObject);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/NumberRange.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */