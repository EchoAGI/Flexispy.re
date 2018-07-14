package org.apache.commons.lang.math;

import java.io.Serializable;

public final class LongRange
  extends Range
  implements Serializable
{
  private static final long serialVersionUID = 71849363892720L;
  private transient int hashCode;
  private final long max;
  private transient Long maxObject = null;
  private final long min;
  private transient Long minObject = null;
  private transient String toString;
  
  public LongRange(long paramLong)
  {
    this.hashCode = 0;
    this.toString = null;
    this.min = paramLong;
    this.max = paramLong;
  }
  
  public LongRange(long paramLong1, long paramLong2)
  {
    this.hashCode = 0;
    this.toString = null;
    boolean bool = paramLong2 < paramLong1;
    if (bool) {
      this.min = paramLong2;
    }
    for (this.max = paramLong1;; this.max = paramLong2)
    {
      return;
      this.min = paramLong1;
    }
  }
  
  public LongRange(Number paramNumber)
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
    long l = paramNumber.longValue();
    this.min = l;
    l = paramNumber.longValue();
    this.max = l;
    bool = paramNumber instanceof Long;
    if (bool)
    {
      localObject = paramNumber;
      localObject = (Long)paramNumber;
      this.minObject = ((Long)localObject);
      paramNumber = (Long)paramNumber;
      this.maxObject = paramNumber;
    }
  }
  
  public LongRange(Number paramNumber1, Number paramNumber2)
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
    long l1 = paramNumber1.longValue();
    long l2 = paramNumber2.longValue();
    bool = l2 < l1;
    if (bool)
    {
      this.min = l2;
      this.max = l1;
      bool = paramNumber2 instanceof Long;
      if (bool)
      {
        paramNumber2 = (Long)paramNumber2;
        this.minObject = paramNumber2;
      }
      bool = paramNumber1 instanceof Long;
      if (bool)
      {
        paramNumber1 = (Long)paramNumber1;
        this.maxObject = paramNumber1;
      }
    }
    for (;;)
    {
      return;
      this.min = l1;
      this.max = l2;
      bool = paramNumber1 instanceof Long;
      if (bool)
      {
        paramNumber1 = (Long)paramNumber1;
        this.minObject = paramNumber1;
      }
      bool = paramNumber2 instanceof Long;
      if (bool)
      {
        paramNumber2 = (Long)paramNumber2;
        this.maxObject = paramNumber2;
      }
    }
  }
  
  public boolean containsLong(long paramLong)
  {
    long l = this.min;
    boolean bool = paramLong < l;
    if (!bool)
    {
      l = this.max;
      bool = paramLong < l;
      if (bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean containsNumber(Number paramNumber)
  {
    if (paramNumber == null) {}
    long l;
    for (boolean bool = false;; bool = containsLong(l))
    {
      return bool;
      l = paramNumber.longValue();
    }
  }
  
  public boolean containsRange(Range paramRange)
  {
    boolean bool1 = false;
    if (paramRange == null) {}
    for (;;)
    {
      return bool1;
      long l = paramRange.getMinimumLong();
      boolean bool2 = containsLong(l);
      if (bool2)
      {
        l = paramRange.getMaximumLong();
        bool2 = containsLong(l);
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
      boolean bool2 = paramObject instanceof LongRange;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        Object localObject = paramObject;
        localObject = (LongRange)paramObject;
        long l1 = this.min;
        long l2 = ((LongRange)localObject).min;
        bool2 = l1 < l2;
        if (!bool2)
        {
          l1 = this.max;
          l2 = ((LongRange)localObject).max;
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
    Long localLong = this.maxObject;
    if (localLong == null)
    {
      localLong = new java/lang/Long;
      long l = this.max;
      localLong.<init>(l);
      this.maxObject = localLong;
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
    Long localLong = this.minObject;
    if (localLong == null)
    {
      localLong = new java/lang/Long;
      long l = this.min;
      localLong.<init>(l);
      this.minObject = localLong;
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
      j = this.hashCode * 37;
      long l1 = this.min;
      long l2 = this.min >> i;
      k = (int)(l1 ^ l2);
      j += k;
      this.hashCode = j;
      j = this.hashCode * 37;
      l1 = this.max;
      l2 = this.max >> i;
      l1 ^= l2;
      k = (int)l1;
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
      long l = this.min;
      boolean bool2 = paramRange.containsLong(l);
      if (!bool2)
      {
        l = this.max;
        bool2 = paramRange.containsLong(l);
        if (!bool2)
        {
          l = paramRange.getMinimumLong();
          bool2 = containsLong(l);
          if (!bool2) {
            continue;
          }
        }
      }
      bool1 = true;
    }
  }
  
  public long[] toArray()
  {
    long l1 = this.max;
    long l2 = this.min;
    l1 -= l2;
    l2 = 1L;
    l1 += l2;
    int i = (int)l1;
    long[] arrayOfLong = new long[i];
    int j = 0;
    for (;;)
    {
      i = arrayOfLong.length;
      if (j >= i) {
        break;
      }
      l1 = this.min;
      l2 = j;
      l1 += l2;
      arrayOfLong[j] = l1;
      j += 1;
    }
    return arrayOfLong;
  }
  
  public String toString()
  {
    String str = this.toString;
    if (str == null)
    {
      StringBuffer localStringBuffer = new java/lang/StringBuffer;
      localStringBuffer.<init>(32);
      localStringBuffer.append("Range[");
      long l = this.min;
      localStringBuffer.append(l);
      localStringBuffer.append(',');
      l = this.max;
      localStringBuffer.append(l);
      char c = ']';
      localStringBuffer.append(c);
      str = localStringBuffer.toString();
      this.toString = str;
    }
    return this.toString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/math/LongRange.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */