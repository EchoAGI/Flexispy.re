package org.apache.commons.lang.mutable;

import org.apache.commons.lang.math.NumberUtils;

public class MutableDouble
  extends Number
  implements Comparable, Mutable
{
  private static final long serialVersionUID = 1587163916L;
  private double value;
  
  public MutableDouble() {}
  
  public MutableDouble(double paramDouble)
  {
    this.value = paramDouble;
  }
  
  public MutableDouble(Number paramNumber)
  {
    double d = paramNumber.doubleValue();
    this.value = d;
  }
  
  public MutableDouble(String paramString)
  {
    double d = Double.parseDouble(paramString);
    this.value = d;
  }
  
  public void add(double paramDouble)
  {
    double d = this.value + paramDouble;
    this.value = d;
  }
  
  public void add(Number paramNumber)
  {
    double d1 = this.value;
    double d2 = paramNumber.doubleValue();
    d1 += d2;
    this.value = d1;
  }
  
  public int compareTo(Object paramObject)
  {
    double d = ((MutableDouble)paramObject).value;
    return NumberUtils.compare(this.value, d);
  }
  
  public void decrement()
  {
    double d = this.value - 1.0D;
    this.value = d;
  }
  
  public double doubleValue()
  {
    return this.value;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof MutableDouble;
    if (bool)
    {
      paramObject = (MutableDouble)paramObject;
      double d1 = ((MutableDouble)paramObject).value;
      long l1 = Double.doubleToLongBits(d1);
      double d2 = this.value;
      long l2 = Double.doubleToLongBits(d2);
      bool = l1 < l2;
      if (bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public float floatValue()
  {
    return (float)this.value;
  }
  
  public Object getValue()
  {
    Double localDouble = new java/lang/Double;
    double d = this.value;
    localDouble.<init>(d);
    return localDouble;
  }
  
  public int hashCode()
  {
    long l = Double.doubleToLongBits(this.value);
    return (int)(l >>> 32 ^ l);
  }
  
  public void increment()
  {
    double d = this.value + 1.0D;
    this.value = d;
  }
  
  public int intValue()
  {
    return (int)this.value;
  }
  
  public boolean isInfinite()
  {
    return Double.isInfinite(this.value);
  }
  
  public boolean isNaN()
  {
    return Double.isNaN(this.value);
  }
  
  public long longValue()
  {
    return this.value;
  }
  
  public void setValue(double paramDouble)
  {
    this.value = paramDouble;
  }
  
  public void setValue(Object paramObject)
  {
    double d = ((Number)paramObject).doubleValue();
    setValue(d);
  }
  
  public void subtract(double paramDouble)
  {
    double d = this.value - paramDouble;
    this.value = d;
  }
  
  public void subtract(Number paramNumber)
  {
    double d1 = this.value;
    double d2 = paramNumber.doubleValue();
    d1 -= d2;
    this.value = d1;
  }
  
  public Double toDouble()
  {
    Double localDouble = new java/lang/Double;
    double d = doubleValue();
    localDouble.<init>(d);
    return localDouble;
  }
  
  public String toString()
  {
    return String.valueOf(this.value);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/mutable/MutableDouble.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */