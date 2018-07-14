package org.apache.commons.lang.math;

import java.io.Serializable;

public final class FloatRange
  extends Range
  implements Serializable
{
  private static final long serialVersionUID = 71849363892750L;
  private transient int hashCode;
  private final float max;
  private transient Float maxObject = null;
  private final float min;
  private transient Float minObject = null;
  private transient String toString;
  
  public FloatRange(float paramFloat)
  {
    IllegalArgumentException localIllegalArgumentException = null;
    this.hashCode = 0;
    this.toString = null;
    boolean bool = Float.isNaN(paramFloat);
    if (bool)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The number must not be NaN");
      throw localIllegalArgumentException;
    }
    this.min = paramFloat;
    this.max = paramFloat;
  }
  
  public FloatRange(float paramFloat1, float paramFloat2)
  {
    IllegalArgumentException localIllegalArgumentException = null;
    this.hashCode = 0;
    this.toString = null;
    boolean bool = Float.isNaN(paramFloat1);
    if (!bool)
    {
      bool = Float.isNaN(paramFloat2);
      if (!bool) {}
    }
    else
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The numbers must not be NaN");
      throw localIllegalArgumentException;
    }
    bool = paramFloat2 < paramFloat1;
    if (bool) {
      this.min = paramFloat2;
    }
    for (this.max = paramFloat1;; this.max = paramFloat2)
    {
      return;
      this.min = paramFloat1;
    }
  }
  
  public FloatRange(Number paramNumber)
  {
    boolean bool = false;
    float f = 0.0F;
    Object localObject = null;
    this.hashCode = 0;
    this.toString = null;
    if (paramNumber == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("The number must not be null");
      throw ((Throwable)localObject);
    }
    f = paramNumber.floatValue();
    this.min = f;
    f = paramNumber.floatValue();
    this.max = f;
    f = this.min;
    bool = Float.isNaN(f);
    if (!bool)
    {
      f = this.max;
      bool = Float.isNaN(f);
      if (!bool) {}
    }
    else
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("The number must not be NaN");
      throw ((Throwable)localObject);
    }
    bool = paramNumber instanceof Float;
    if (bool)
    {
      localObject = paramNumber;
      localObject = (Float)paramNumber;
      this.minObject = ((Float)localObject);
      paramNumber = (Float)paramNumber;
      this.maxObject = paramNumber;
    }
  }
  
  public FloatRange(Number paramNumber1, Number paramNumber2)
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
    float f1 = paramNumber1.floatValue();
    float f2 = paramNumber2.floatValue();
    bool = Float.isNaN(f1);
    if (!bool)
    {
      bool = Float.isNaN(f2);
      if (!bool) {}
    }
    else
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The numbers must not be NaN");
      throw localIllegalArgumentException;
    }
    bool = f2 < f1;
    if (bool)
    {
      this.min = f2;
      this.max = f1;
      bool = paramNumber2 instanceof Float;
      if (bool)
      {
        paramNumber2 = (Float)paramNumber2;
        this.minObject = paramNumber2;
      }
      bool = paramNumber1 instanceof Float;
      if (bool)
      {
        paramNumber1 = (Float)paramNumber1;
        this.maxObject = paramNumber1;
      }
    }
    for (;;)
    {
      return;
      this.min = f1;
      this.max = f2;
      bool = paramNumber1 instanceof Float;
      if (bool)
      {
        paramNumber1 = (Float)paramNumber1;
        this.minObject = paramNumber1;
      }
      bool = paramNumber2 instanceof Float;
      if (bool)
      {
        paramNumber2 = (Float)paramNumber2;
        this.maxObject = paramNumber2;
      }
    }
  }
  
  public boolean containsFloat(float paramFloat)
  {
    float f = this.min;
    boolean bool = paramFloat < f;
    if (!bool)
    {
      f = this.max;
      bool = paramFloat < f;
      if (!bool) {
        bool = true;
      }
    }
    for (f = Float.MIN_VALUE;; f = 0.0F)
    {
      return bool;
      bool = false;
    }
  }
  
  public boolean containsNumber(Number paramNumber)
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
  
  public boolean containsRange(Range paramRange)
  {
    boolean bool1 = false;
    if (paramRange == null) {}
    for (;;)
    {
      return bool1;
      float f = paramRange.getMinimumFloat();
      boolean bool2 = containsFloat(f);
      if (bool2)
      {
        f = paramRange.getMaximumFloat();
        bool2 = containsFloat(f);
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
      boolean bool2 = paramObject instanceof FloatRange;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        Object localObject = paramObject;
        localObject = (FloatRange)paramObject;
        float f1 = this.min;
        int i = Float.floatToIntBits(f1);
        float f2 = ((FloatRange)localObject).min;
        int j = Float.floatToIntBits(f2);
        if (i == j)
        {
          f1 = this.max;
          i = Float.floatToIntBits(f1);
          f2 = ((FloatRange)localObject).max;
          j = Float.floatToIntBits(f2);
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
    return (int)this.max;
  }
  
  public long getMaximumLong()
  {
    return this.max;
  }
  
  public Number getMaximumNumber()
  {
    Float localFloat = this.maxObject;
    if (localFloat == null)
    {
      localFloat = new java/lang/Float;
      float f = this.max;
      localFloat.<init>(f);
      this.maxObject = localFloat;
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
    return (int)this.min;
  }
  
  public long getMinimumLong()
  {
    return this.min;
  }
  
  public Number getMinimumNumber()
  {
    Float localFloat = this.minObject;
    if (localFloat == null)
    {
      localFloat = new java/lang/Float;
      float f = this.min;
      localFloat.<init>(f);
      this.minObject = localFloat;
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
      j = Float.floatToIntBits(this.min);
      i += j;
      this.hashCode = i;
      i = this.hashCode * 37;
      float f = this.max;
      j = Float.floatToIntBits(f);
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
      float f = this.min;
      boolean bool2 = paramRange.containsFloat(f);
      if (!bool2)
      {
        f = this.max;
        bool2 = paramRange.containsFloat(f);
        if (!bool2)
        {
          f = paramRange.getMinimumFloat();
          bool2 = containsFloat(f);
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
      float f = this.min;
      localStringBuffer.append(f);
      localStringBuffer.append(',');
      f = this.max;
      localStringBuffer.append(f);
      char c = ']';
      f = 1.3E-43F;
      localStringBuffer.append(c);
      str = localStringBuffer.toString();
      this.toString = str;
    }
    return this.toString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/math/FloatRange.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */