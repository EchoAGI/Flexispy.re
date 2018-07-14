package org.apache.commons.lang;

import java.math.BigDecimal;
import java.math.BigInteger;

public final class NumberUtils
{
  public static int compare(double paramDouble1, double paramDouble2)
  {
    int i = 1;
    int j = -1;
    boolean bool = paramDouble1 < paramDouble2;
    if (bool) {}
    for (;;)
    {
      return j;
      bool = paramDouble1 < paramDouble2;
      if (bool)
      {
        j = i;
      }
      else
      {
        long l1 = Double.doubleToLongBits(paramDouble1);
        long l2 = Double.doubleToLongBits(paramDouble2);
        bool = l1 < l2;
        if (!bool)
        {
          j = 0;
        }
        else
        {
          bool = l1 < l2;
          if (!bool) {
            j = i;
          }
        }
      }
    }
  }
  
  public static int compare(float paramFloat1, float paramFloat2)
  {
    int i = 1;
    int j = -1;
    boolean bool = paramFloat1 < paramFloat2;
    if (bool) {}
    for (;;)
    {
      return j;
      bool = paramFloat1 < paramFloat2;
      if (bool)
      {
        j = i;
      }
      else
      {
        int k = Float.floatToIntBits(paramFloat1);
        int m = Float.floatToIntBits(paramFloat2);
        if (k == m) {
          j = 0;
        } else if (k >= m) {
          j = i;
        }
      }
    }
  }
  
  public static BigDecimal createBigDecimal(String paramString)
  {
    BigDecimal localBigDecimal = new java/math/BigDecimal;
    localBigDecimal.<init>(paramString);
    return localBigDecimal;
  }
  
  public static BigInteger createBigInteger(String paramString)
  {
    BigInteger localBigInteger = new java/math/BigInteger;
    localBigInteger.<init>(paramString);
    return localBigInteger;
  }
  
  public static Double createDouble(String paramString)
  {
    return Double.valueOf(paramString);
  }
  
  public static Float createFloat(String paramString)
  {
    return Float.valueOf(paramString);
  }
  
  public static Integer createInteger(String paramString)
  {
    return Integer.decode(paramString);
  }
  
  public static Long createLong(String paramString)
  {
    return Long.valueOf(paramString);
  }
  
  public static Number createNumber(String paramString)
  {
    Object localObject1;
    if (paramString == null) {
      localObject1 = null;
    }
    Object localObject2;
    Object localObject3;
    for (;;)
    {
      return (Number)localObject1;
      int i = paramString.length();
      if (i == 0)
      {
        localObject2 = new java/lang/NumberFormatException;
        ((NumberFormatException)localObject2).<init>("\"\" is not a valid number.");
        throw ((Throwable)localObject2);
      }
      i = paramString.length();
      i1 = 1;
      if (i == i1)
      {
        f = 0.0F;
        localObject2 = null;
        bool1 = Character.isDigit(paramString.charAt(0));
        if (!bool1)
        {
          localObject2 = new java/lang/NumberFormatException;
          localObject3 = new java/lang/StringBuffer;
          ((StringBuffer)localObject3).<init>();
          localObject3 = paramString + " is not a valid number.";
          ((NumberFormatException)localObject2).<init>((String)localObject3);
          throw ((Throwable)localObject2);
        }
      }
      localObject2 = "--";
      boolean bool1 = paramString.startsWith((String)localObject2);
      if (bool1)
      {
        localObject1 = null;
      }
      else
      {
        localObject2 = "0x";
        bool1 = paramString.startsWith((String)localObject2);
        if (!bool1)
        {
          localObject2 = "-0x";
          bool1 = paramString.startsWith((String)localObject2);
          if (!bool1) {
            break;
          }
        }
        localObject1 = createInteger(paramString);
      }
    }
    int j = paramString.length() + -1;
    char c = paramString.charAt(j);
    int i2 = paramString.indexOf('.');
    j = paramString.indexOf('e');
    int i1 = paramString.indexOf('E');
    int i3 = j + i1 + 1;
    j = -1;
    float f = 0.0F / 0.0F;
    String str1;
    label281:
    String str2;
    String str3;
    label355:
    String str4;
    int i4;
    if (i2 > j)
    {
      j = -1;
      f = 0.0F / 0.0F;
      if (i3 > j)
      {
        if (i3 < i2)
        {
          localObject2 = new java/lang/NumberFormatException;
          localObject3 = new java/lang/StringBuffer;
          ((StringBuffer)localObject3).<init>();
          localObject3 = paramString + " is not a valid number.";
          ((NumberFormatException)localObject2).<init>((String)localObject3);
          throw ((Throwable)localObject2);
        }
        j = i2 + 1;
        str1 = paramString.substring(j, i3);
        j = 0;
        f = 0.0F;
        localObject2 = null;
        str2 = paramString.substring(0, i2);
        boolean bool2 = Character.isDigit(c);
        if (bool2) {
          break label789;
        }
        int k = -1;
        f = 0.0F / 0.0F;
        if (i3 <= k) {
          break label554;
        }
        k = paramString.length() + -1;
        if (i3 >= k) {
          break label554;
        }
        k = i3 + 1;
        i1 = paramString.length() + -1;
        str3 = paramString.substring(k, i1);
        f = 0.0F;
        localObject2 = null;
        i1 = paramString.length() + -1;
        str4 = paramString.substring(0, i1);
        boolean bool3 = isAllZeros(str2);
        if (!bool3) {
          break label560;
        }
        bool3 = isAllZeros(str3);
        if (!bool3) {
          break label560;
        }
        i4 = 1;
        label400:
        switch (c)
        {
        }
      }
    }
    for (;;)
    {
      localObject2 = new java/lang/NumberFormatException;
      localObject3 = new java/lang/StringBuffer;
      ((StringBuffer)localObject3).<init>();
      localObject3 = paramString + " is not a valid number.";
      ((NumberFormatException)localObject2).<init>((String)localObject3);
      throw ((Throwable)localObject2);
      int m = i2 + 1;
      str1 = paramString.substring(m);
      break label281;
      m = -1;
      f = 0.0F / 0.0F;
      if (i3 > m)
      {
        m = 0;
        f = 0.0F;
        localObject2 = null;
      }
      for (str2 = paramString.substring(0, i3);; str2 = paramString)
      {
        str1 = null;
        break;
      }
      label554:
      str3 = null;
      break label355;
      label560:
      i4 = 0;
      break label400;
      boolean bool4;
      if ((str1 == null) && (str3 == null))
      {
        f = 0.0F;
        localObject2 = null;
        m = str4.charAt(0);
        i1 = 45;
        if (m == i1)
        {
          f = Float.MIN_VALUE;
          localObject2 = str4.substring(1);
          bool4 = isDigits((String)localObject2);
          if (bool4) {}
        }
        else
        {
          bool4 = isDigits(str4);
          if (!bool4) {
            break label647;
          }
        }
        try
        {
          localObject1 = createLong(str4);
        }
        catch (NumberFormatException localNumberFormatException1)
        {
          localObject1 = createBigInteger(str4);
        }
        break;
      }
      label647:
      NumberFormatException localNumberFormatException2 = new java/lang/NumberFormatException;
      localObject3 = new java/lang/StringBuffer;
      ((StringBuffer)localObject3).<init>();
      localObject3 = paramString + " is not a valid number.";
      localNumberFormatException2.<init>((String)localObject3);
      throw localNumberFormatException2;
      try
      {
        localObject1 = createFloat(str4);
        bool4 = ((Float)localObject1).isInfinite();
        if (!bool4)
        {
          f = ((Float)localObject1).floatValue();
          i1 = 0;
          localObject3 = null;
          bool4 = f < 0.0F;
          if ((bool4) || (i4 != 0)) {
            break;
          }
        }
      }
      catch (NumberFormatException localNumberFormatException9)
      {
        Double localDouble;
        double d1;
        double d2;
        int n;
        boolean bool5;
        for (;;) {}
      }
      try
      {
        localDouble = createDouble(str4);
        bool4 = localDouble.isInfinite();
        if (!bool4)
        {
          f = localDouble.floatValue();
          d1 = f;
          d2 = 0.0D;
          bool4 = d1 < d2;
          if ((bool4) || (i4 != 0)) {
            localObject1 = localDouble;
          }
        }
      }
      catch (NumberFormatException localNumberFormatException3) {}
      label789:
      label877:
      label994:
      try
      {
        localObject1 = createBigDecimal(str4);
      }
      catch (NumberFormatException localNumberFormatException7) {}
      n = -1;
      f = 0.0F / 0.0F;
      if (i3 > n)
      {
        n = paramString.length() + -1;
        if (i3 < n)
        {
          n = i3 + 1;
          i1 = paramString.length();
          str3 = paramString.substring(n, i1);
          if ((str1 != null) || (str3 != null)) {
            break label877;
          }
        }
      }
      try
      {
        localObject1 = createInteger(paramString);
        break;
        str3 = null;
      }
      catch (NumberFormatException localNumberFormatException4)
      {
        try
        {
          localObject1 = createLong(paramString);
        }
        catch (NumberFormatException localNumberFormatException5)
        {
          localObject1 = createBigInteger(paramString);
        }
      }
      break;
      bool5 = isAllZeros(str2);
      if (bool5)
      {
        bool5 = isAllZeros(str3);
        if (!bool5) {}
      }
      for (i4 = 1;; i4 = 0)
      {
        try
        {
          localObject1 = createFloat(paramString);
          bool5 = ((Float)localObject1).isInfinite();
          if (!bool5)
          {
            f = ((Float)localObject1).floatValue();
            i1 = 0;
            localObject3 = null;
            bool5 = f < 0.0F;
            if ((bool5) || (i4 != 0)) {
              break;
            }
          }
        }
        catch (NumberFormatException localNumberFormatException8)
        {
          for (;;) {}
        }
        try
        {
          localDouble = createDouble(paramString);
          bool5 = localDouble.isInfinite();
          if (bool5) {
            break label994;
          }
          d1 = localDouble.doubleValue();
          d2 = 0.0D;
          bool5 = d1 < d2;
          if ((!bool5) && (i4 == 0)) {
            break label994;
          }
          localObject1 = localDouble;
        }
        catch (NumberFormatException localNumberFormatException6)
        {
          localObject1 = createBigDecimal(paramString);
        }
      }
      break;
    }
  }
  
  private static boolean isAllZeros(String paramString)
  {
    boolean bool = true;
    if (paramString == null) {}
    for (;;)
    {
      return bool;
      int i = paramString.length();
      int j = i + -1;
      for (;;)
      {
        if (j < 0) {
          break label49;
        }
        i = paramString.charAt(j);
        int k = 48;
        if (i != k)
        {
          bool = false;
          break;
        }
        j += -1;
      }
      label49:
      i = paramString.length();
      if (i <= 0) {
        bool = false;
      }
    }
  }
  
  public static boolean isDigits(String paramString)
  {
    boolean bool1 = false;
    int i;
    if (paramString != null)
    {
      i = paramString.length();
      if (i != 0) {
        break label17;
      }
    }
    for (;;)
    {
      return bool1;
      label17:
      int j = 0;
      for (;;)
      {
        i = paramString.length();
        if (j >= i) {
          break label49;
        }
        boolean bool2 = Character.isDigit(paramString.charAt(j));
        if (!bool2) {
          break;
        }
        j += 1;
      }
      label49:
      bool1 = true;
    }
  }
  
  public static boolean isNumber(String paramString)
  {
    int i = 45;
    int j = 57;
    int k = 48;
    int m = 1;
    float f = Float.MIN_VALUE;
    boolean bool1 = false;
    boolean bool2 = StringUtils.isEmpty(paramString);
    if (bool2) {}
    int i2;
    int i4;
    boolean bool3;
    int n;
    int i6;
    label260:
    label267:
    label277:
    do
    {
      char[] arrayOfChar;
      int i7;
      for (;;)
      {
        return bool1;
        arrayOfChar = paramString.toCharArray();
        int i1 = arrayOfChar.length;
        i2 = 0;
        int i3 = 0;
        i4 = 0;
        bool3 = false;
        n = arrayOfChar[0];
        if (n == i) {}
        for (int i5 = m;; i5 = 0)
        {
          n = i5 + 1;
          if (i1 <= n) {
            break label267;
          }
          n = arrayOfChar[i5];
          if (n != k) {
            break label267;
          }
          n = i5 + 1;
          n = arrayOfChar[n];
          i6 = 120;
          if (n != i6) {
            break label267;
          }
          i7 = i5 + 2;
          if (i7 == i1) {
            break;
          }
          for (;;)
          {
            n = arrayOfChar.length;
            if (i7 >= n) {
              break label260;
            }
            n = arrayOfChar[i7];
            if (n >= k)
            {
              n = arrayOfChar[i7];
              if (n <= j) {}
            }
            else
            {
              n = arrayOfChar[i7];
              i6 = 97;
              if (n >= i6)
              {
                n = arrayOfChar[i7];
                i6 = 102;
                if (n <= i6) {}
              }
              else
              {
                n = arrayOfChar[i7];
                i6 = 65;
                if (n < i6) {
                  break;
                }
                n = arrayOfChar[i7];
                i6 = 70;
                if (n > i6) {
                  break;
                }
              }
            }
            i7 += 1;
          }
        }
        bool1 = m;
        continue;
        i1 += -1;
        i7 = i5;
        if (i7 >= i1)
        {
          n = i1 + 1;
          if ((i7 >= n) || (i4 == 0) || (bool3)) {}
        }
        else
        {
          n = arrayOfChar[i7];
          if (n >= k)
          {
            n = arrayOfChar[i7];
            if (n <= j)
            {
              bool3 = true;
              i4 = 0;
            }
          }
          for (;;)
          {
            i7 += 1;
            break label277;
            n = arrayOfChar[i7];
            i6 = 46;
            if (n == i6)
            {
              if ((i3 != 0) || (i2 != 0)) {
                break;
              }
              i3 = 1;
              continue;
            }
            n = arrayOfChar[i7];
            i6 = 101;
            if (n != i6)
            {
              n = arrayOfChar[i7];
              i6 = 69;
              if (n != i6) {}
            }
            else
            {
              if ((i2 != 0) || (!bool3)) {
                break;
              }
              i2 = 1;
              i4 = 1;
              continue;
            }
            n = arrayOfChar[i7];
            i6 = 43;
            if (n != i6)
            {
              n = arrayOfChar[i7];
              if (n != i) {
                break;
              }
            }
            if (i4 == 0) {
              break;
            }
            i4 = 0;
            bool3 = false;
          }
        }
        n = arrayOfChar.length;
        if (i7 >= n) {
          break label709;
        }
        n = arrayOfChar[i7];
        if (n >= k)
        {
          n = arrayOfChar[i7];
          if (n <= j)
          {
            bool1 = m;
            continue;
          }
        }
        n = arrayOfChar[i7];
        i6 = 101;
        if (n != i6)
        {
          n = arrayOfChar[i7];
          i6 = 69;
          if (n != i6)
          {
            if (i4 != 0) {
              break;
            }
            n = arrayOfChar[i7];
            i6 = 100;
            if (n != i6)
            {
              n = arrayOfChar[i7];
              i6 = 68;
              if (n != i6)
              {
                n = arrayOfChar[i7];
                i6 = 102;
                if (n != i6)
                {
                  n = arrayOfChar[i7];
                  i6 = 70;
                  if (n != i6) {
                    break;
                  }
                }
              }
            }
            bool1 = bool3;
          }
        }
      }
      n = arrayOfChar[i7];
      i6 = 108;
      if (n == i6) {
        break;
      }
      n = arrayOfChar[i7];
      i6 = 76;
    } while (n != i6);
    if ((bool3) && (i2 == 0)) {}
    for (;;)
    {
      bool1 = m;
      break;
      m = 0;
      f = 0.0F;
    }
    label709:
    if ((i4 == 0) && (bool3)) {}
    for (;;)
    {
      bool1 = m;
      break;
      m = 0;
      f = 0.0F;
    }
  }
  
  public static int maximum(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 > paramInt1) {
      paramInt1 = paramInt2;
    }
    if (paramInt3 > paramInt1) {
      paramInt1 = paramInt3;
    }
    return paramInt1;
  }
  
  public static long maximum(long paramLong1, long paramLong2, long paramLong3)
  {
    boolean bool = paramLong2 < paramLong1;
    if (bool) {
      paramLong1 = paramLong2;
    }
    bool = paramLong3 < paramLong1;
    if (bool) {
      paramLong1 = paramLong3;
    }
    return paramLong1;
  }
  
  public static int minimum(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 < paramInt1) {
      paramInt1 = paramInt2;
    }
    if (paramInt3 < paramInt1) {
      paramInt1 = paramInt3;
    }
    return paramInt1;
  }
  
  public static long minimum(long paramLong1, long paramLong2, long paramLong3)
  {
    boolean bool = paramLong2 < paramLong1;
    if (bool) {
      paramLong1 = paramLong2;
    }
    bool = paramLong3 < paramLong1;
    if (bool) {
      paramLong1 = paramLong3;
    }
    return paramLong1;
  }
  
  public static int stringToInt(String paramString)
  {
    return stringToInt(paramString, 0);
  }
  
  public static int stringToInt(String paramString, int paramInt)
  {
    try
    {
      paramInt = Integer.parseInt(paramString);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;) {}
    }
    return paramInt;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/NumberUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */