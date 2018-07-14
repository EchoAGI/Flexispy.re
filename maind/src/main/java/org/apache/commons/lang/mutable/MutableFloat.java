package org.apache.commons.lang.mutable;

import org.apache.commons.lang.math.NumberUtils;

public class MutableFloat
  extends Number
  implements Comparable, Mutable
{
  private static final long serialVersionUID = 5787169186L;
  private float value;
  
  public MutableFloat() {}
  
  public MutableFloat(float paramFloat)
  {
    this.value = paramFloat;
  }
  
  public MutableFloat(Number paramNumber)
  {
    float f = paramNumber.floatValue();
    this.value = f;
  }
  
  public MutableFloat(String paramString)
  {
    float f = Float.parseFloat(paramString);
    this.value = f;
  }
  
  public void add(float paramFloat)
  {
    float f = this.value + paramFloat;
    this.value = f;
  }
  
  public void add(Number paramNumber)
  {
    float f1 = this.value;
    float f2 = paramNumber.floatValue();
    f1 += f2;
    this.value = f1;
  }
  
  public int compareTo(Object paramObject)
  {
    float f = ((MutableFloat)paramObject).value;
    return NumberUtils.compare(this.value, f);
  }
  
  public void decrement()
  {
    float f = this.value - 1.0F;
    this.value = f;
  }
  
  public double doubleValue()
  {
    return this.value;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof MutableFloat;
    int i;
    if (bool)
    {
      paramObject = (MutableFloat)paramObject;
      f1 = ((MutableFloat)paramObject).value;
      i = Float.floatToIntBits(f1);
      float f2 = this.value;
      int k = Float.floatToIntBits(f2);
      if (i == k) {
        i = 1;
      }
    }
    for (float f1 = Float.MIN_VALUE;; f1 = 0.0F)
    {
      return i;
      int j = 0;
    }
  }
  
  public float floatValue()
  {
    return this.value;
  }
  
  public Object getValue()
  {
    Float localFloat = new java/lang/Float;
    float f = this.value;
    localFloat.<init>(f);
    return localFloat;
  }
  
  public int hashCode()
  {
    return Float.floatToIntBits(this.value);
  }
  
  public void increment()
  {
    float f = this.value + 1.0F;
    this.value = f;
  }
  
  public int intValue()
  {
    return (int)this.value;
  }
  
  public boolean isInfinite()
  {
    return Float.isInfinite(this.value);
  }
  
  public boolean isNaN()
  {
    return Float.isNaN(this.value);
  }
  
  public long longValue()
  {
    return this.value;
  }
  
  public void setValue(float paramFloat)
  {
    this.value = paramFloat;
  }
  
  public void setValue(Object paramObject)
  {
    float f = ((Number)paramObject).floatValue();
    setValue(f);
  }
  
  public void subtract(float paramFloat)
  {
    float f = this.value - paramFloat;
    this.value = f;
  }
  
  public void subtract(Number paramNumber)
  {
    float f1 = this.value;
    float f2 = paramNumber.floatValue();
    f1 -= f2;
    this.value = f1;
  }
  
  public Float toFloat()
  {
    Float localFloat = new java/lang/Float;
    float f = floatValue();
    localFloat.<init>(f);
    return localFloat;
  }
  
  public String toString()
  {
    return String.valueOf(this.value);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/mutable/MutableFloat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */