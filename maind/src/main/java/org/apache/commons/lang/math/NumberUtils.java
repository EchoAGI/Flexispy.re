package org.apache.commons.lang.math;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang.StringUtils;

public class NumberUtils
{
  public static final Byte BYTE_MINUS_ONE;
  public static final Byte BYTE_ONE;
  public static final Byte BYTE_ZERO;
  public static final Double DOUBLE_MINUS_ONE;
  public static final Double DOUBLE_ONE;
  public static final Double DOUBLE_ZERO;
  public static final Float FLOAT_MINUS_ONE;
  public static final Float FLOAT_ONE;
  public static final Float FLOAT_ZERO;
  public static final Integer INTEGER_MINUS_ONE;
  public static final Integer INTEGER_ONE;
  public static final Integer INTEGER_ZERO;
  public static final Long LONG_MINUS_ONE;
  public static final Long LONG_ONE;
  public static final Long LONG_ZERO;
  public static final Short SHORT_MINUS_ONE;
  public static final Short SHORT_ONE;
  public static final Short SHORT_ZERO;
  
  static
  {
    byte b1 = 1;
    byte b2 = -1;
    Object localObject = new java/lang/Long;
    ((Long)localObject).<init>(0L);
    LONG_ZERO = (Long)localObject;
    localObject = new java/lang/Long;
    ((Long)localObject).<init>(1L);
    LONG_ONE = (Long)localObject;
    localObject = new java/lang/Long;
    ((Long)localObject).<init>(-1);
    LONG_MINUS_ONE = (Long)localObject;
    localObject = new java/lang/Integer;
    ((Integer)localObject).<init>(0);
    INTEGER_ZERO = (Integer)localObject;
    localObject = new java/lang/Integer;
    ((Integer)localObject).<init>(b1);
    INTEGER_ONE = (Integer)localObject;
    localObject = new java/lang/Integer;
    ((Integer)localObject).<init>(b2);
    INTEGER_MINUS_ONE = (Integer)localObject;
    localObject = new java/lang/Short;
    ((Short)localObject).<init>((short)0);
    SHORT_ZERO = (Short)localObject;
    localObject = new java/lang/Short;
    ((Short)localObject).<init>(b1);
    SHORT_ONE = (Short)localObject;
    localObject = new java/lang/Short;
    ((Short)localObject).<init>(b2);
    SHORT_MINUS_ONE = (Short)localObject;
    localObject = new java/lang/Byte;
    ((Byte)localObject).<init>((byte)0);
    BYTE_ZERO = (Byte)localObject;
    localObject = new java/lang/Byte;
    ((Byte)localObject).<init>(b1);
    BYTE_ONE = (Byte)localObject;
    localObject = new java/lang/Byte;
    ((Byte)localObject).<init>(b2);
    BYTE_MINUS_ONE = (Byte)localObject;
    localObject = new java/lang/Double;
    ((Double)localObject).<init>(0.0D);
    DOUBLE_ZERO = (Double)localObject;
    localObject = new java/lang/Double;
    ((Double)localObject).<init>(1.0D);
    DOUBLE_ONE = (Double)localObject;
    localObject = new java/lang/Double;
    ((Double)localObject).<init>(-1.0D);
    DOUBLE_MINUS_ONE = (Double)localObject;
    localObject = new java/lang/Float;
    ((Float)localObject).<init>(0.0F);
    FLOAT_ZERO = (Float)localObject;
    localObject = new java/lang/Float;
    ((Float)localObject).<init>(1.0F);
    FLOAT_ONE = (Float)localObject;
    localObject = new java/lang/Float;
    ((Float)localObject).<init>(-1.0F);
    FLOAT_MINUS_ONE = (Float)localObject;
  }
  
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
    boolean bool;
    Object localObject;
    if (paramString == null)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return (BigDecimal)localObject;
      bool = StringUtils.isBlank(paramString);
      if (bool)
      {
        localObject = new java/lang/NumberFormatException;
        ((NumberFormatException)localObject).<init>("A blank string is not a valid number");
        throw ((Throwable)localObject);
      }
      localObject = new java/math/BigDecimal;
      ((BigDecimal)localObject).<init>(paramString);
    }
  }
  
  public static BigInteger createBigInteger(String paramString)
  {
    BigInteger localBigInteger;
    if (paramString == null) {
      localBigInteger = null;
    }
    for (;;)
    {
      return localBigInteger;
      localBigInteger = new java/math/BigInteger;
      localBigInteger.<init>(paramString);
    }
  }
  
  public static Double createDouble(String paramString)
  {
    if (paramString == null) {}
    for (Double localDouble = null;; localDouble = Double.valueOf(paramString)) {
      return localDouble;
    }
  }
  
  public static Float createFloat(String paramString)
  {
    if (paramString == null) {}
    for (Float localFloat = null;; localFloat = Float.valueOf(paramString)) {
      return localFloat;
    }
  }
  
  public static Integer createInteger(String paramString)
  {
    if (paramString == null) {}
    for (Integer localInteger = null;; localInteger = Integer.decode(paramString)) {
      return localInteger;
    }
  }
  
  public static Long createLong(String paramString)
  {
    if (paramString == null) {}
    for (Long localLong = null;; localLong = Long.valueOf(paramString)) {
      return localLong;
    }
  }
  
  public static Number createNumber(String paramString)
  {
    Object localObject1;
    if (paramString == null) {
      localObject1 = null;
    }
    Object localObject2;
    for (;;)
    {
      return (Number)localObject1;
      boolean bool1 = StringUtils.isBlank(paramString);
      if (bool1)
      {
        localObject2 = new java/lang/NumberFormatException;
        ((NumberFormatException)localObject2).<init>("A blank string is not a valid number");
        throw ((Throwable)localObject2);
      }
      localObject2 = "--";
      bool1 = paramString.startsWith((String)localObject2);
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
    int i = paramString.length() + -1;
    int n = paramString.charAt(i);
    int i1 = paramString.indexOf('.');
    i = paramString.indexOf('e');
    int i2 = paramString.indexOf('E');
    int i3 = i + i2 + 1;
    i = -1;
    float f = 0.0F / 0.0F;
    Object localObject3;
    String str1;
    label211:
    String str2;
    String str3;
    label298:
    String str4;
    int i4;
    if (i1 > i)
    {
      i = -1;
      f = 0.0F / 0.0F;
      if (i3 > i)
      {
        if (i3 < i1)
        {
          localObject2 = new java/lang/NumberFormatException;
          localObject3 = new java/lang/StringBuffer;
          ((StringBuffer)localObject3).<init>();
          localObject3 = paramString + " is not a valid number.";
          ((NumberFormatException)localObject2).<init>((String)localObject3);
          throw ((Throwable)localObject2);
        }
        i = i1 + 1;
        str1 = paramString.substring(i, i3);
        i = 0;
        f = 0.0F;
        localObject2 = null;
        str2 = paramString.substring(0, i1);
        boolean bool2 = Character.isDigit(n);
        if (bool2) {
          break label733;
        }
        int j = 46;
        f = 6.4E-44F;
        if (n == j) {
          break label733;
        }
        j = -1;
        f = 0.0F / 0.0F;
        if (i3 <= j) {
          break label498;
        }
        j = paramString.length() + -1;
        if (i3 >= j) {
          break label498;
        }
        j = i3 + 1;
        i2 = paramString.length() + -1;
        str3 = paramString.substring(j, i2);
        f = 0.0F;
        localObject2 = null;
        i2 = paramString.length() + -1;
        str4 = paramString.substring(0, i2);
        boolean bool3 = isAllZeros(str2);
        if (!bool3) {
          break label504;
        }
        bool3 = isAllZeros(str3);
        if (!bool3) {
          break label504;
        }
        i4 = 1;
        label343:
        switch (n)
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
      int k = i1 + 1;
      str1 = paramString.substring(k);
      break label211;
      k = -1;
      f = 0.0F / 0.0F;
      if (i3 > k)
      {
        k = 0;
        f = 0.0F;
        localObject2 = null;
      }
      for (str2 = paramString.substring(0, i3);; str2 = paramString)
      {
        str1 = null;
        break;
      }
      label498:
      str3 = null;
      break label298;
      label504:
      i4 = 0;
      break label343;
      boolean bool4;
      if ((str1 == null) && (str3 == null))
      {
        f = 0.0F;
        localObject2 = null;
        k = str4.charAt(0);
        i2 = 45;
        if (k == i2)
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
            break label591;
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
      label591:
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
          i2 = 0;
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
        int m;
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
      label733:
      label821:
      label938:
      try
      {
        localObject1 = createBigDecimal(str4);
      }
      catch (NumberFormatException localNumberFormatException7) {}
      m = -1;
      f = 0.0F / 0.0F;
      if (i3 > m)
      {
        m = paramString.length() + -1;
        if (i3 < m)
        {
          m = i3 + 1;
          i2 = paramString.length();
          str3 = paramString.substring(m, i2);
          if ((str1 != null) || (str3 != null)) {
            break label821;
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
            i2 = 0;
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
            break label938;
          }
          d1 = localDouble.doubleValue();
          d2 = 0.0D;
          bool5 = d1 < d2;
          if ((!bool5) && (i4 == 0)) {
            break label938;
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
    boolean bool2 = StringUtils.isEmpty(paramString);
    if (bool2) {}
    for (;;)
    {
      return bool1;
      int j = 0;
      for (;;)
      {
        int i = paramString.length();
        if (j >= i) {
          break label45;
        }
        boolean bool3 = Character.isDigit(paramString.charAt(j));
        if (!bool3) {
          break;
        }
        j += 1;
      }
      label45:
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
          break label744;
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
            n = arrayOfChar[i7];
            i6 = 46;
            if (n == i6)
            {
              if ((i3 == 0) && (i2 == 0)) {
                bool1 = bool3;
              }
            }
            else
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
    label744:
    if ((i4 == 0) && (bool3)) {}
    for (;;)
    {
      bool1 = m;
      break;
      m = 0;
      f = 0.0F;
    }
  }
  
  public static byte max(byte paramByte1, byte paramByte2, byte paramByte3)
  {
    if (paramByte2 > paramByte1) {
      paramByte1 = paramByte2;
    }
    if (paramByte3 > paramByte1) {
      paramByte1 = paramByte3;
    }
    return paramByte1;
  }
  
  public static byte max(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The Array must not be null");
      throw localIllegalArgumentException;
    }
    int i = paramArrayOfByte.length;
    if (i == 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Array cannot be empty.");
      throw localIllegalArgumentException;
    }
    i = 0;
    IllegalArgumentException localIllegalArgumentException = null;
    int j = paramArrayOfByte[0];
    int k = 1;
    for (;;)
    {
      i = paramArrayOfByte.length;
      if (k >= i) {
        break;
      }
      i = paramArrayOfByte[k];
      if (i > j) {
        j = paramArrayOfByte[k];
      }
      k += 1;
    }
    return j;
  }
  
  public static double max(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    return Math.max(Math.max(paramDouble1, paramDouble2), paramDouble3);
  }
  
  public static double max(double[] paramArrayOfDouble)
  {
    if (paramArrayOfDouble == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The Array must not be null");
      throw localIllegalArgumentException;
    }
    int i = paramArrayOfDouble.length;
    if (i == 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Array cannot be empty.");
      throw localIllegalArgumentException;
    }
    i = 0;
    IllegalArgumentException localIllegalArgumentException = null;
    double d1 = paramArrayOfDouble[0];
    int j = 1;
    for (;;)
    {
      i = paramArrayOfDouble.length;
      if (j < i)
      {
        d2 = paramArrayOfDouble[j];
        bool = Double.isNaN(d2);
        if (bool) {
          d1 = 0.0D / 0.0D;
        }
      }
      else
      {
        return d1;
      }
      double d2 = paramArrayOfDouble[j];
      boolean bool = d2 < d1;
      if (bool) {
        d1 = paramArrayOfDouble[j];
      }
      j += 1;
    }
  }
  
  public static float max(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return Math.max(Math.max(paramFloat1, paramFloat2), paramFloat3);
  }
  
  public static float max(float[] paramArrayOfFloat)
  {
    if (paramArrayOfFloat == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The Array must not be null");
      throw localIllegalArgumentException;
    }
    int i = paramArrayOfFloat.length;
    if (i == 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Array cannot be empty.");
      throw localIllegalArgumentException;
    }
    i = 0;
    float f1 = 0.0F;
    IllegalArgumentException localIllegalArgumentException = null;
    float f2 = paramArrayOfFloat[0];
    int j = 1;
    for (;;)
    {
      i = paramArrayOfFloat.length;
      if (j < i)
      {
        f1 = paramArrayOfFloat[j];
        bool = Float.isNaN(f1);
        if (bool) {
          f2 = 0.0F / 0.0F;
        }
      }
      else
      {
        return f2;
      }
      f1 = paramArrayOfFloat[j];
      boolean bool = f1 < f2;
      if (bool) {
        f2 = paramArrayOfFloat[j];
      }
      j += 1;
    }
  }
  
  public static int max(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 > paramInt1) {
      paramInt1 = paramInt2;
    }
    if (paramInt3 > paramInt1) {
      paramInt1 = paramInt3;
    }
    return paramInt1;
  }
  
  public static int max(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The Array must not be null");
      throw localIllegalArgumentException;
    }
    int i = paramArrayOfInt.length;
    if (i == 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Array cannot be empty.");
      throw localIllegalArgumentException;
    }
    i = 0;
    IllegalArgumentException localIllegalArgumentException = null;
    int j = paramArrayOfInt[0];
    int k = 1;
    for (;;)
    {
      i = paramArrayOfInt.length;
      if (k >= i) {
        break;
      }
      i = paramArrayOfInt[k];
      if (i > j) {
        j = paramArrayOfInt[k];
      }
      k += 1;
    }
    return j;
  }
  
  public static long max(long paramLong1, long paramLong2, long paramLong3)
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
  
  public static long max(long[] paramArrayOfLong)
  {
    if (paramArrayOfLong == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The Array must not be null");
      throw localIllegalArgumentException;
    }
    int i = paramArrayOfLong.length;
    if (i == 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Array cannot be empty.");
      throw localIllegalArgumentException;
    }
    i = 0;
    IllegalArgumentException localIllegalArgumentException = null;
    long l1 = paramArrayOfLong[0];
    int j = 1;
    for (;;)
    {
      i = paramArrayOfLong.length;
      if (j >= i) {
        break;
      }
      long l2 = paramArrayOfLong[j];
      boolean bool = l2 < l1;
      if (bool) {
        l1 = paramArrayOfLong[j];
      }
      j += 1;
    }
    return l1;
  }
  
  public static short max(short paramShort1, short paramShort2, short paramShort3)
  {
    if (paramShort2 > paramShort1) {
      paramShort1 = paramShort2;
    }
    if (paramShort3 > paramShort1) {
      paramShort1 = paramShort3;
    }
    return paramShort1;
  }
  
  public static short max(short[] paramArrayOfShort)
  {
    if (paramArrayOfShort == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The Array must not be null");
      throw localIllegalArgumentException;
    }
    int i = paramArrayOfShort.length;
    if (i == 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Array cannot be empty.");
      throw localIllegalArgumentException;
    }
    i = 0;
    IllegalArgumentException localIllegalArgumentException = null;
    int j = paramArrayOfShort[0];
    int k = 1;
    for (;;)
    {
      i = paramArrayOfShort.length;
      if (k >= i) {
        break;
      }
      i = paramArrayOfShort[k];
      if (i > j) {
        j = paramArrayOfShort[k];
      }
      k += 1;
    }
    return j;
  }
  
  public static byte min(byte paramByte1, byte paramByte2, byte paramByte3)
  {
    if (paramByte2 < paramByte1) {
      paramByte1 = paramByte2;
    }
    if (paramByte3 < paramByte1) {
      paramByte1 = paramByte3;
    }
    return paramByte1;
  }
  
  public static byte min(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The Array must not be null");
      throw localIllegalArgumentException;
    }
    int i = paramArrayOfByte.length;
    if (i == 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Array cannot be empty.");
      throw localIllegalArgumentException;
    }
    i = 0;
    IllegalArgumentException localIllegalArgumentException = null;
    int j = paramArrayOfByte[0];
    int k = 1;
    for (;;)
    {
      i = paramArrayOfByte.length;
      if (k >= i) {
        break;
      }
      i = paramArrayOfByte[k];
      if (i < j) {
        j = paramArrayOfByte[k];
      }
      k += 1;
    }
    return j;
  }
  
  public static double min(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    return Math.min(Math.min(paramDouble1, paramDouble2), paramDouble3);
  }
  
  public static double min(double[] paramArrayOfDouble)
  {
    if (paramArrayOfDouble == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The Array must not be null");
      throw localIllegalArgumentException;
    }
    int i = paramArrayOfDouble.length;
    if (i == 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Array cannot be empty.");
      throw localIllegalArgumentException;
    }
    i = 0;
    IllegalArgumentException localIllegalArgumentException = null;
    double d1 = paramArrayOfDouble[0];
    int j = 1;
    for (;;)
    {
      i = paramArrayOfDouble.length;
      if (j < i)
      {
        d2 = paramArrayOfDouble[j];
        bool = Double.isNaN(d2);
        if (bool) {
          d1 = 0.0D / 0.0D;
        }
      }
      else
      {
        return d1;
      }
      double d2 = paramArrayOfDouble[j];
      boolean bool = d2 < d1;
      if (bool) {
        d1 = paramArrayOfDouble[j];
      }
      j += 1;
    }
  }
  
  public static float min(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return Math.min(Math.min(paramFloat1, paramFloat2), paramFloat3);
  }
  
  public static float min(float[] paramArrayOfFloat)
  {
    if (paramArrayOfFloat == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The Array must not be null");
      throw localIllegalArgumentException;
    }
    int i = paramArrayOfFloat.length;
    if (i == 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Array cannot be empty.");
      throw localIllegalArgumentException;
    }
    i = 0;
    float f1 = 0.0F;
    IllegalArgumentException localIllegalArgumentException = null;
    float f2 = paramArrayOfFloat[0];
    int j = 1;
    for (;;)
    {
      i = paramArrayOfFloat.length;
      if (j < i)
      {
        f1 = paramArrayOfFloat[j];
        bool = Float.isNaN(f1);
        if (bool) {
          f2 = 0.0F / 0.0F;
        }
      }
      else
      {
        return f2;
      }
      f1 = paramArrayOfFloat[j];
      boolean bool = f1 < f2;
      if (bool) {
        f2 = paramArrayOfFloat[j];
      }
      j += 1;
    }
  }
  
  public static int min(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 < paramInt1) {
      paramInt1 = paramInt2;
    }
    if (paramInt3 < paramInt1) {
      paramInt1 = paramInt3;
    }
    return paramInt1;
  }
  
  public static int min(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The Array must not be null");
      throw localIllegalArgumentException;
    }
    int i = paramArrayOfInt.length;
    if (i == 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Array cannot be empty.");
      throw localIllegalArgumentException;
    }
    i = 0;
    IllegalArgumentException localIllegalArgumentException = null;
    int j = paramArrayOfInt[0];
    int k = 1;
    for (;;)
    {
      i = paramArrayOfInt.length;
      if (k >= i) {
        break;
      }
      i = paramArrayOfInt[k];
      if (i < j) {
        j = paramArrayOfInt[k];
      }
      k += 1;
    }
    return j;
  }
  
  public static long min(long paramLong1, long paramLong2, long paramLong3)
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
  
  public static long min(long[] paramArrayOfLong)
  {
    if (paramArrayOfLong == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The Array must not be null");
      throw localIllegalArgumentException;
    }
    int i = paramArrayOfLong.length;
    if (i == 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Array cannot be empty.");
      throw localIllegalArgumentException;
    }
    i = 0;
    IllegalArgumentException localIllegalArgumentException = null;
    long l1 = paramArrayOfLong[0];
    int j = 1;
    for (;;)
    {
      i = paramArrayOfLong.length;
      if (j >= i) {
        break;
      }
      long l2 = paramArrayOfLong[j];
      boolean bool = l2 < l1;
      if (bool) {
        l1 = paramArrayOfLong[j];
      }
      j += 1;
    }
    return l1;
  }
  
  public static short min(short paramShort1, short paramShort2, short paramShort3)
  {
    if (paramShort2 < paramShort1) {
      paramShort1 = paramShort2;
    }
    if (paramShort3 < paramShort1) {
      paramShort1 = paramShort3;
    }
    return paramShort1;
  }
  
  public static short min(short[] paramArrayOfShort)
  {
    if (paramArrayOfShort == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The Array must not be null");
      throw localIllegalArgumentException;
    }
    int i = paramArrayOfShort.length;
    if (i == 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Array cannot be empty.");
      throw localIllegalArgumentException;
    }
    i = 0;
    IllegalArgumentException localIllegalArgumentException = null;
    int j = paramArrayOfShort[0];
    int k = 1;
    for (;;)
    {
      i = paramArrayOfShort.length;
      if (k >= i) {
        break;
      }
      i = paramArrayOfShort[k];
      if (i < j) {
        j = paramArrayOfShort[k];
      }
      k += 1;
    }
    return j;
  }
  
  public static int stringToInt(String paramString)
  {
    return toInt(paramString);
  }
  
  public static int stringToInt(String paramString, int paramInt)
  {
    return toInt(paramString, paramInt);
  }
  
  public static byte toByte(String paramString)
  {
    return toByte(paramString, (byte)0);
  }
  
  public static byte toByte(String paramString, byte paramByte)
  {
    if (paramString == null) {}
    for (;;)
    {
      return paramByte;
      try
      {
        paramByte = Byte.parseByte(paramString);
      }
      catch (NumberFormatException localNumberFormatException) {}
    }
  }
  
  public static double toDouble(String paramString)
  {
    return toDouble(paramString, 0.0D);
  }
  
  public static double toDouble(String paramString, double paramDouble)
  {
    if (paramString == null) {}
    for (;;)
    {
      return paramDouble;
      try
      {
        paramDouble = Double.parseDouble(paramString);
      }
      catch (NumberFormatException localNumberFormatException) {}
    }
  }
  
  public static float toFloat(String paramString)
  {
    return toFloat(paramString, 0.0F);
  }
  
  public static float toFloat(String paramString, float paramFloat)
  {
    if (paramString == null) {}
    for (;;)
    {
      return paramFloat;
      try
      {
        paramFloat = Float.parseFloat(paramString);
      }
      catch (NumberFormatException localNumberFormatException) {}
    }
  }
  
  public static int toInt(String paramString)
  {
    return toInt(paramString, 0);
  }
  
  public static int toInt(String paramString, int paramInt)
  {
    if (paramString == null) {}
    for (;;)
    {
      return paramInt;
      try
      {
        paramInt = Integer.parseInt(paramString);
      }
      catch (NumberFormatException localNumberFormatException) {}
    }
  }
  
  public static long toLong(String paramString)
  {
    return toLong(paramString, 0L);
  }
  
  public static long toLong(String paramString, long paramLong)
  {
    if (paramString == null) {}
    for (;;)
    {
      return paramLong;
      try
      {
        paramLong = Long.parseLong(paramString);
      }
      catch (NumberFormatException localNumberFormatException) {}
    }
  }
  
  public static short toShort(String paramString)
  {
    return toShort(paramString, (short)0);
  }
  
  public static short toShort(String paramString, short paramShort)
  {
    if (paramString == null) {}
    for (;;)
    {
      return paramShort;
      try
      {
        paramShort = Short.parseShort(paramString);
      }
      catch (NumberFormatException localNumberFormatException) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/math/NumberUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */