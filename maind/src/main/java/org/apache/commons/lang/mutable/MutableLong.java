package org.apache.commons.lang.mutable;

public class MutableLong
  extends Number
  implements Comparable, Mutable
{
  private static final long serialVersionUID = 62986528375L;
  private long value;
  
  public MutableLong() {}
  
  public MutableLong(long paramLong)
  {
    this.value = paramLong;
  }
  
  public MutableLong(Number paramNumber)
  {
    long l = paramNumber.longValue();
    this.value = l;
  }
  
  public MutableLong(String paramString)
  {
    long l = Long.parseLong(paramString);
    this.value = l;
  }
  
  public void add(long paramLong)
  {
    long l = this.value + paramLong;
    this.value = l;
  }
  
  public void add(Number paramNumber)
  {
    long l1 = this.value;
    long l2 = paramNumber.longValue();
    l1 += l2;
    this.value = l1;
  }
  
  public int compareTo(Object paramObject)
  {
    Object localObject = paramObject;
    localObject = (MutableLong)paramObject;
    long l1 = ((MutableLong)localObject).value;
    long l2 = this.value;
    boolean bool1 = l2 < l1;
    int i;
    if (bool1) {
      i = -1;
    }
    for (;;)
    {
      return i;
      l2 = this.value;
      boolean bool2 = l2 < l1;
      if (!bool2) {
        bool2 = false;
      } else {
        bool2 = true;
      }
    }
  }
  
  public void decrement()
  {
    long l = this.value - 1L;
    this.value = l;
  }
  
  public double doubleValue()
  {
    return this.value;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof MutableLong;
    if (bool2)
    {
      long l1 = this.value;
      paramObject = (MutableLong)paramObject;
      long l2 = ((MutableLong)paramObject).longValue();
      bool2 = l1 < l2;
      if (!bool2) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public float floatValue()
  {
    return (float)this.value;
  }
  
  public Object getValue()
  {
    Long localLong = new java/lang/Long;
    long l = this.value;
    localLong.<init>(l);
    return localLong;
  }
  
  public int hashCode()
  {
    long l1 = this.value;
    long l2 = this.value >>> 32;
    return (int)(l1 ^ l2);
  }
  
  public void increment()
  {
    long l = this.value + 1L;
    this.value = l;
  }
  
  public int intValue()
  {
    return (int)this.value;
  }
  
  public long longValue()
  {
    return this.value;
  }
  
  public void setValue(long paramLong)
  {
    this.value = paramLong;
  }
  
  public void setValue(Object paramObject)
  {
    long l = ((Number)paramObject).longValue();
    setValue(l);
  }
  
  public void subtract(long paramLong)
  {
    long l = this.value - paramLong;
    this.value = l;
  }
  
  public void subtract(Number paramNumber)
  {
    long l1 = this.value;
    long l2 = paramNumber.longValue();
    l1 -= l2;
    this.value = l1;
  }
  
  public Long toLong()
  {
    Long localLong = new java/lang/Long;
    long l = longValue();
    localLong.<init>(l);
    return localLong;
  }
  
  public String toString()
  {
    return String.valueOf(this.value);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/mutable/MutableLong.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */