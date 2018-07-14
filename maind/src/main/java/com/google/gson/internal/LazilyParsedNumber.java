package com.google.gson.internal;

import java.math.BigDecimal;

public final class LazilyParsedNumber
  extends Number
{
  private final String value;
  
  public LazilyParsedNumber(String paramString)
  {
    this.value = paramString;
  }
  
  private Object writeReplace()
  {
    BigDecimal localBigDecimal = new java/math/BigDecimal;
    String str = this.value;
    localBigDecimal.<init>(str);
    return localBigDecimal;
  }
  
  public double doubleValue()
  {
    return Double.parseDouble(this.value);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    if (this == paramObject) {
      bool2 = bool1;
    }
    for (;;)
    {
      return bool2;
      boolean bool3 = paramObject instanceof LazilyParsedNumber;
      if (bool3)
      {
        Object localObject = paramObject;
        localObject = (LazilyParsedNumber)paramObject;
        String str1 = this.value;
        String str2 = ((LazilyParsedNumber)localObject).value;
        if (str1 != str2)
        {
          str1 = this.value;
          str2 = ((LazilyParsedNumber)localObject).value;
          bool3 = str1.equals(str2);
          if (!bool3) {}
        }
        else
        {
          bool2 = bool1;
        }
      }
    }
  }
  
  public float floatValue()
  {
    return Float.parseFloat(this.value);
  }
  
  public int hashCode()
  {
    return this.value.hashCode();
  }
  
  public int intValue()
  {
    try
    {
      localObject = this.value;
      i = Integer.parseInt((String)localObject);
    }
    catch (NumberFormatException localNumberFormatException1)
    {
      for (;;)
      {
        try
        {
          localObject = this.value;
          long l = Long.parseLong((String)localObject);
          i = (int)l;
        }
        catch (NumberFormatException localNumberFormatException2)
        {
          Object localObject = new java/math/BigDecimal;
          String str = this.value;
          ((BigDecimal)localObject).<init>(str);
          int i = ((BigDecimal)localObject).intValue();
        }
      }
    }
    return i;
  }
  
  public long longValue()
  {
    try
    {
      localObject = this.value;
      l = Long.parseLong((String)localObject);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        Object localObject = new java/math/BigDecimal;
        String str = this.value;
        ((BigDecimal)localObject).<init>(str);
        long l = ((BigDecimal)localObject).longValue();
      }
    }
    return l;
  }
  
  public String toString()
  {
    return this.value;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/LazilyParsedNumber.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */