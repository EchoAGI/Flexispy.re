package org.apache.commons.lang.mutable;

public class MutableShort
  extends Number
  implements Comparable, Mutable
{
  private static final long serialVersionUID = 2159175617L;
  private short value;
  
  public MutableShort() {}
  
  public MutableShort(Number paramNumber)
  {
    short s = paramNumber.shortValue();
    this.value = s;
  }
  
  public MutableShort(String paramString)
  {
    short s = Short.parseShort(paramString);
    this.value = s;
  }
  
  public MutableShort(short paramShort)
  {
    this.value = paramShort;
  }
  
  public void add(Number paramNumber)
  {
    short s = this.value;
    int i = paramNumber.shortValue();
    s = (short)(s + i);
    this.value = s;
  }
  
  public void add(short paramShort)
  {
    short s = (short)(this.value + paramShort);
    this.value = s;
  }
  
  public int compareTo(Object paramObject)
  {
    Object localObject = paramObject;
    localObject = (MutableShort)paramObject;
    int i = ((MutableShort)localObject).value;
    int j = this.value;
    if (j < i) {
      j = -1;
    }
    for (;;)
    {
      return j;
      j = this.value;
      if (j == i) {
        j = 0;
      } else {
        j = 1;
      }
    }
  }
  
  public void decrement()
  {
    short s = (short)(this.value + -1);
    this.value = s;
  }
  
  public double doubleValue()
  {
    return this.value;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof MutableShort;
    if (bool2)
    {
      int i = this.value;
      paramObject = (MutableShort)paramObject;
      int j = ((MutableShort)paramObject).shortValue();
      if (i == j) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public float floatValue()
  {
    return this.value;
  }
  
  public Object getValue()
  {
    Short localShort = new java/lang/Short;
    short s = this.value;
    localShort.<init>(s);
    return localShort;
  }
  
  public int hashCode()
  {
    return this.value;
  }
  
  public void increment()
  {
    short s = (short)(this.value + 1);
    this.value = s;
  }
  
  public int intValue()
  {
    return this.value;
  }
  
  public long longValue()
  {
    return this.value;
  }
  
  public void setValue(Object paramObject)
  {
    short s = ((Number)paramObject).shortValue();
    setValue(s);
  }
  
  public void setValue(short paramShort)
  {
    this.value = paramShort;
  }
  
  public short shortValue()
  {
    return this.value;
  }
  
  public void subtract(Number paramNumber)
  {
    short s = this.value;
    int i = paramNumber.shortValue();
    s = (short)(s - i);
    this.value = s;
  }
  
  public void subtract(short paramShort)
  {
    short s = (short)(this.value - paramShort);
    this.value = s;
  }
  
  public Short toShort()
  {
    Short localShort = new java/lang/Short;
    short s = shortValue();
    localShort.<init>(s);
    return localShort;
  }
  
  public String toString()
  {
    return String.valueOf(this.value);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/mutable/MutableShort.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */