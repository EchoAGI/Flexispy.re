package org.apache.commons.lang.math;

import java.io.Serializable;

public final class DoubleRange
  extends Range
  implements Serializable
{
  private static final long serialVersionUID = 71849363892740L;
  private transient int hashCode;
  private final double max;
  private transient Double maxObject = null;
  private final double min;
  private transient Double minObject = null;
  private transient String toString;
  
  public DoubleRange(double paramDouble)
  {
    IllegalArgumentException localIllegalArgumentException = null;
    this.hashCode = 0;
    this.toString = null;
    boolean bool = Double.isNaN(paramDouble);
    if (bool)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The number must not be NaN");
      throw localIllegalArgumentException;
    }
    this.min = paramDouble;
    this.max = paramDouble;
  }
  
  public DoubleRange(double paramDouble1, double paramDouble2)
  {
    IllegalArgumentException localIllegalArgumentException = null;
    this.hashCode = 0;
    this.toString = null;
    boolean bool = Double.isNaN(paramDouble1);
    if (!bool)
    {
      bool = Double.isNaN(paramDouble2);
      if (!bool) {}
    }
    else
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The numbers must not be NaN");
      throw localIllegalArgumentException;
    }
    bool = paramDouble2 < paramDouble1;
    if (bool) {
      this.min = paramDouble2;
    }
    for (this.max = paramDouble1;; this.max = paramDouble2)
    {
      return;
      this.min = paramDouble1;
    }
  }
  
  public DoubleRange(Number paramNumber)
  {
    boolean bool = false;
    Object localObject = null;
    this.hashCode = 0;
    this.toString = null;
    if (paramNumber == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("The number must not be null");
      throw ((Throwable)localObject);
    }
    double d = paramNumber.doubleValue();
    this.min = d;
    d = paramNumber.doubleValue();
    this.max = d;
    d = this.min;
    bool = Double.isNaN(d);
    if (!bool)
    {
      d = this.max;
      bool = Double.isNaN(d);
      if (!bool) {}
    }
    else
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("The number must not be NaN");
      throw ((Throwable)localObject);
    }
    bool = paramNumber instanceof Double;
    if (bool)
    {
      localObject = paramNumber;
      localObject = (Double)paramNumber;
      this.minObject = ((Double)localObject);
      paramNumber = (Double)paramNumber;
      this.maxObject = paramNumber;
    }
  }
  
  public DoubleRange(Number paramNumber1, Number paramNumber2)
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
    double d1 = paramNumber1.doubleValue();
    double d2 = paramNumber2.doubleValue();
    bool = Double.isNaN(d1);
    if (!bool)
    {
      bool = Double.isNaN(d2);
      if (!bool) {}
    }
    else
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The numbers must not be NaN");
      throw localIllegalArgumentException;
    }
    bool = d2 < d1;
    if (bool)
    {
      this.min = d2;
      this.max = d1;
      bool = paramNumber2 instanceof Double;
      if (bool)
      {
        paramNumber2 = (Double)paramNumber2;
        this.minObject = paramNumber2;
      }
      bool = paramNumber1 instanceof Double;
      if (bool)
      {
        paramNumber1 = (Double)paramNumber1;
        this.maxObject = paramNumber1;
      }
    }
    for (;;)
    {
      return;
      this.min = d1;
      this.max = d2;
      bool = paramNumber1 instanceof Double;
      if (bool)
      {
        paramNumber1 = (Double)paramNumber1;
        this.minObject = paramNumber1;
      }
      bool = paramNumber2 instanceof Double;
      if (bool)
      {
        paramNumber2 = (Double)paramNumber2;
        this.maxObject = paramNumber2;
      }
    }
  }
  
  public boolean containsDouble(double paramDouble)
  {
    double d = this.min;
    boolean bool = paramDouble < d;
    if (!bool)
    {
      d = this.max;
      bool = paramDouble < d;
      if (bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean containsNumber(Number paramNumber)
  {
    if (paramNumber == null) {}
    double d;
    for (boolean bool = false;; bool = containsDouble(d))
    {
      return bool;
      d = paramNumber.doubleValue();
    }
  }
  
  public boolean containsRange(Range paramRange)
  {
    boolean bool1 = false;
    if (paramRange == null) {}
    for (;;)
    {
      return bool1;
      double d = paramRange.getMinimumDouble();
      boolean bool2 = containsDouble(d);
      if (bool2)
      {
        d = paramRange.getMaximumDouble();
        bool2 = containsDouble(d);
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
      boolean bool2 = paramObject instanceof DoubleRange;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        Object localObject = paramObject;
        localObject = (DoubleRange)paramObject;
        double d1 = this.min;
        long l1 = Double.doubleToLongBits(d1);
        double d2 = ((DoubleRange)localObject).min;
        long l2 = Double.doubleToLongBits(d2);
        bool2 = l1 < l2;
        if (!bool2)
        {
          d1 = this.max;
          l1 = Double.doubleToLongBits(d1);
          d2 = ((DoubleRange)localObject).max;
          l2 = Double.doubleToLongBits(d2);
          bool2 = l1 < l2;
          if (!bool2) {}
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
    return (float)this.max;
  }
  
  public int getMaximumInteger()
  {
    return (int)this.max;
  }
  
  public long getMaximumLong()
  {
    return this.max;
  }
  
  public Number getMaximumNumber()
  {
    Double localDouble = this.maxObject;
    if (localDouble == null)
    {
      localDouble = new java/lang/Double;
      double d = this.max;
      localDouble.<init>(d);
      this.maxObject = localDouble;
    }
    return this.maxObject;
  }
  
  public double getMinimumDouble()
  {
    return this.min;
  }
  
  public float getMinimumFloat()
  {
    return (float)this.min;
  }
  
  public int getMinimumInteger()
  {
    return (int)this.min;
  }
  
  public long getMinimumLong()
  {
    return this.min;
  }
  
  public Number getMinimumNumber()
  {
    Double localDouble = this.minObject;
    if (localDouble == null)
    {
      localDouble = new java/lang/Double;
      double d = this.min;
      localDouble.<init>(d);
      this.minObject = localDouble;
    }
    return this.minObject;
  }
  
  public int hashCode()
  {
    int i = 32;
    int j = this.hashCode;
    if (j == 0)
    {
      this.hashCode = 17;
      j = this.hashCode * 37;
      Class localClass = getClass();
      int k = localClass.hashCode();
      j += k;
      this.hashCode = j;
      long l1 = Double.doubleToLongBits(this.min);
      j = this.hashCode * 37;
      k = (int)(l1 >> i ^ l1);
      j += k;
      this.hashCode = j;
      double d = this.max;
      l1 = Double.doubleToLongBits(d);
      j = this.hashCode * 37;
      long l2 = l1 >> i ^ l1;
      k = (int)l2;
      j += k;
      this.hashCode = j;
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
      double d = this.min;
      boolean bool2 = paramRange.containsDouble(d);
      if (!bool2)
      {
        d = this.max;
        bool2 = paramRange.containsDouble(d);
        if (!bool2)
        {
          d = paramRange.getMinimumDouble();
          bool2 = containsDouble(d);
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
    String str = this.toString;
    if (str == null)
    {
      StringBuffer localStringBuffer = new java/lang/StringBuffer;
      localStringBuffer.<init>(32);
      localStringBuffer.append("Range[");
      double d = this.min;
      localStringBuffer.append(d);
      localStringBuffer.append(',');
      d = this.max;
      localStringBuffer.append(d);
      char c = ']';
      localStringBuffer.append(c);
      str = localStringBuffer.toString();
      this.toString = str;
    }
    return this.toString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/math/DoubleRange.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */