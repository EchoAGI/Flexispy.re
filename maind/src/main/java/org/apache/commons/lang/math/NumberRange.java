package org.apache.commons.lang.math;

import java.io.Serializable;

public final class NumberRange
  extends Range
  implements Serializable
{
  private static final long serialVersionUID = 71849363892710L;
  private transient int hashCode = 0;
  private final Number max;
  private final Number min;
  private transient String toString;
  
  public NumberRange(Number paramNumber)
  {
    boolean bool = false;
    Object localObject = null;
    this.toString = null;
    if (paramNumber == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("The number must not be null");
      throw ((Throwable)localObject);
    }
    bool = paramNumber instanceof Comparable;
    if (!bool)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("The number must implement Comparable");
      throw ((Throwable)localObject);
    }
    bool = paramNumber instanceof Double;
    if (bool)
    {
      localObject = paramNumber;
      localObject = (Double)paramNumber;
      bool = ((Double)localObject).isNaN();
      if (bool)
      {
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>("The number must not be NaN");
        throw ((Throwable)localObject);
      }
    }
    bool = paramNumber instanceof Float;
    if (bool)
    {
      localObject = paramNumber;
      localObject = (Float)paramNumber;
      bool = ((Float)localObject).isNaN();
      if (bool)
      {
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>("The number must not be NaN");
        throw ((Throwable)localObject);
      }
    }
    this.min = ((Number)paramNumber);
    this.max = ((Number)paramNumber);
  }
  
  public NumberRange(Number paramNumber1, Number paramNumber2)
  {
    boolean bool = false;
    Object localObject = null;
    this.toString = null;
    if ((paramNumber1 == null) || (paramNumber2 == null))
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("The numbers must not be null");
      throw ((Throwable)localObject);
    }
    localObject = paramNumber1.getClass();
    Class localClass = paramNumber2.getClass();
    if (localObject != localClass)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("The numbers must be of the same type");
      throw ((Throwable)localObject);
    }
    bool = paramNumber1 instanceof Comparable;
    if (!bool)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("The numbers must implement Comparable");
      throw ((Throwable)localObject);
    }
    bool = paramNumber1 instanceof Double;
    if (bool)
    {
      localObject = paramNumber1;
      localObject = (Double)paramNumber1;
      bool = ((Double)localObject).isNaN();
      if (!bool)
      {
        localObject = paramNumber2;
        localObject = (Double)paramNumber2;
        bool = ((Double)localObject).isNaN();
        if (!bool) {}
      }
      else
      {
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>("The number must not be NaN");
        throw ((Throwable)localObject);
      }
    }
    else
    {
      bool = paramNumber1 instanceof Float;
      if (bool)
      {
        localObject = paramNumber1;
        localObject = (Float)paramNumber1;
        bool = ((Float)localObject).isNaN();
        if (!bool)
        {
          localObject = paramNumber2;
          localObject = (Float)paramNumber2;
          bool = ((Float)localObject).isNaN();
          if (!bool) {}
        }
        else
        {
          localObject = new java/lang/IllegalArgumentException;
          ((IllegalArgumentException)localObject).<init>("The number must not be NaN");
          throw ((Throwable)localObject);
        }
      }
    }
    localObject = paramNumber1;
    localObject = (Comparable)paramNumber1;
    int i = ((Comparable)localObject).compareTo(paramNumber2);
    if (i == 0)
    {
      this.min = ((Number)paramNumber1);
      this.max = ((Number)paramNumber1);
    }
    for (;;)
    {
      return;
      if (i > 0)
      {
        this.min = paramNumber2;
        this.max = ((Number)paramNumber1);
      }
      else
      {
        this.min = ((Number)paramNumber1);
        this.max = paramNumber2;
      }
    }
  }
  
  public boolean containsNumber(Number paramNumber)
  {
    boolean bool1 = false;
    if (paramNumber == null) {
      return bool1;
    }
    Object localObject = paramNumber.getClass();
    Class localClass = this.min.getClass();
    if (localObject != localClass)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("The number must be of the same type as the range numbers");
      throw ((Throwable)localObject);
    }
    int i = ((Comparable)this.min).compareTo(paramNumber);
    localObject = (Comparable)this.max;
    int j = ((Comparable)localObject).compareTo(paramNumber);
    boolean bool2;
    if ((i <= 0) && (j >= 0)) {
      bool2 = true;
    }
    for (;;)
    {
      bool1 = bool2;
      break;
      bool2 = false;
      localObject = null;
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
  
  public Number getMaximumNumber()
  {
    return this.max;
  }
  
  public Number getMinimumNumber()
  {
    return this.min;
  }
  
  public int hashCode()
  {
    int i = this.hashCode;
    if (i == 0)
    {
      this.hashCode = 17;
      i = this.hashCode * 37;
      int j = getClass().hashCode();
      i += j;
      this.hashCode = i;
      i = this.hashCode * 37;
      j = this.min.hashCode();
      i += j;
      this.hashCode = i;
      i = this.hashCode * 37;
      Number localNumber = this.max;
      j = localNumber.hashCode();
      i += j;
      this.hashCode = i;
    }
    return this.hashCode;
  }
  
  public String toString()
  {
    Object localObject = this.toString;
    if (localObject == null)
    {
      StringBuffer localStringBuffer = new java/lang/StringBuffer;
      localStringBuffer.<init>(32);
      localStringBuffer.append("Range[");
      localObject = this.min;
      localStringBuffer.append(localObject);
      localStringBuffer.append(',');
      localObject = this.max;
      localStringBuffer.append(localObject);
      char c = ']';
      localStringBuffer.append(c);
      localObject = localStringBuffer.toString();
      this.toString = ((String)localObject);
    }
    return this.toString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/math/NumberRange.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */