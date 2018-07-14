package org.apache.commons.lang.mutable;

public class MutableByte
  extends Number
  implements Comparable, Mutable
{
  private static final long serialVersionUID = 2709144031L;
  private byte value;
  
  public MutableByte() {}
  
  public MutableByte(byte paramByte)
  {
    this.value = paramByte;
  }
  
  public MutableByte(Number paramNumber)
  {
    byte b = paramNumber.byteValue();
    this.value = b;
  }
  
  public MutableByte(String paramString)
  {
    byte b = Byte.parseByte(paramString);
    this.value = b;
  }
  
  public void add(byte paramByte)
  {
    byte b = (byte)(this.value + paramByte);
    this.value = b;
  }
  
  public void add(Number paramNumber)
  {
    byte b = this.value;
    int i = paramNumber.byteValue();
    b = (byte)(b + i);
    this.value = b;
  }
  
  public byte byteValue()
  {
    return this.value;
  }
  
  public int compareTo(Object paramObject)
  {
    Object localObject = paramObject;
    localObject = (MutableByte)paramObject;
    int i = ((MutableByte)localObject).value;
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
    byte b = (byte)(this.value + -1);
    this.value = b;
  }
  
  public double doubleValue()
  {
    return this.value;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof MutableByte;
    if (bool2)
    {
      int i = this.value;
      paramObject = (MutableByte)paramObject;
      int j = ((MutableByte)paramObject).byteValue();
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
    Byte localByte = new java/lang/Byte;
    byte b = this.value;
    localByte.<init>(b);
    return localByte;
  }
  
  public int hashCode()
  {
    return this.value;
  }
  
  public void increment()
  {
    byte b = (byte)(this.value + 1);
    this.value = b;
  }
  
  public int intValue()
  {
    return this.value;
  }
  
  public long longValue()
  {
    return this.value;
  }
  
  public void setValue(byte paramByte)
  {
    this.value = paramByte;
  }
  
  public void setValue(Object paramObject)
  {
    byte b = ((Number)paramObject).byteValue();
    setValue(b);
  }
  
  public void subtract(byte paramByte)
  {
    byte b = (byte)(this.value - paramByte);
    this.value = b;
  }
  
  public void subtract(Number paramNumber)
  {
    byte b = this.value;
    int i = paramNumber.byteValue();
    b = (byte)(b - i);
    this.value = b;
  }
  
  public Byte toByte()
  {
    Byte localByte = new java/lang/Byte;
    byte b = byteValue();
    localByte.<init>(b);
    return localByte;
  }
  
  public String toString()
  {
    return String.valueOf(this.value);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/mutable/MutableByte.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */