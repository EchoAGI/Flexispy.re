package org.apache.commons.lang.mutable;

public class MutableInt
  extends Number
  implements Comparable, Mutable
{
  private static final long serialVersionUID = 512176391864L;
  private int value;
  
  public MutableInt() {}
  
  public MutableInt(int paramInt)
  {
    this.value = paramInt;
  }
  
  public MutableInt(Number paramNumber)
  {
    int i = paramNumber.intValue();
    this.value = i;
  }
  
  public MutableInt(String paramString)
  {
    int i = Integer.parseInt(paramString);
    this.value = i;
  }
  
  public void add(int paramInt)
  {
    int i = this.value + paramInt;
    this.value = i;
  }
  
  public void add(Number paramNumber)
  {
    int i = this.value;
    int j = paramNumber.intValue();
    i += j;
    this.value = i;
  }
  
  public int compareTo(Object paramObject)
  {
    Object localObject = paramObject;
    localObject = (MutableInt)paramObject;
    int i = ((MutableInt)localObject).value;
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
    int i = this.value + -1;
    this.value = i;
  }
  
  public double doubleValue()
  {
    return this.value;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof MutableInt;
    if (bool2)
    {
      int i = this.value;
      paramObject = (MutableInt)paramObject;
      int j = ((MutableInt)paramObject).intValue();
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
    Integer localInteger = new java/lang/Integer;
    int i = this.value;
    localInteger.<init>(i);
    return localInteger;
  }
  
  public int hashCode()
  {
    return this.value;
  }
  
  public void increment()
  {
    int i = this.value + 1;
    this.value = i;
  }
  
  public int intValue()
  {
    return this.value;
  }
  
  public long longValue()
  {
    return this.value;
  }
  
  public void setValue(int paramInt)
  {
    this.value = paramInt;
  }
  
  public void setValue(Object paramObject)
  {
    int i = ((Number)paramObject).intValue();
    setValue(i);
  }
  
  public void subtract(int paramInt)
  {
    int i = this.value - paramInt;
    this.value = i;
  }
  
  public void subtract(Number paramNumber)
  {
    int i = this.value;
    int j = paramNumber.intValue();
    i -= j;
    this.value = i;
  }
  
  public Integer toInteger()
  {
    Integer localInteger = new java/lang/Integer;
    int i = intValue();
    localInteger.<init>(i);
    return localInteger;
  }
  
  public String toString()
  {
    return String.valueOf(this.value);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/mutable/MutableInt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */