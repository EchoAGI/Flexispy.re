package org.apache.commons.lang.math;

import java.math.BigInteger;

public final class Fraction
  extends Number
  implements Comparable
{
  public static final Fraction FOUR_FIFTHS;
  public static final Fraction ONE;
  public static final Fraction ONE_FIFTH;
  public static final Fraction ONE_HALF;
  public static final Fraction ONE_QUARTER;
  public static final Fraction ONE_THIRD;
  public static final Fraction THREE_FIFTHS;
  public static final Fraction THREE_QUARTERS;
  public static final Fraction TWO_FIFTHS;
  public static final Fraction TWO_QUARTERS;
  public static final Fraction TWO_THIRDS;
  public static final Fraction ZERO;
  private static final long serialVersionUID = 65382027393090L;
  private final int denominator;
  private transient int hashCode = 0;
  private final int numerator;
  private transient String toProperString = null;
  private transient String toString = null;
  
  static
  {
    int i = 5;
    int j = 4;
    int k = 3;
    int m = 2;
    int n = 1;
    Fraction localFraction = new org/apache/commons/lang/math/Fraction;
    localFraction.<init>(0, n);
    ZERO = localFraction;
    localFraction = new org/apache/commons/lang/math/Fraction;
    localFraction.<init>(n, n);
    ONE = localFraction;
    localFraction = new org/apache/commons/lang/math/Fraction;
    localFraction.<init>(n, m);
    ONE_HALF = localFraction;
    localFraction = new org/apache/commons/lang/math/Fraction;
    localFraction.<init>(n, k);
    ONE_THIRD = localFraction;
    localFraction = new org/apache/commons/lang/math/Fraction;
    localFraction.<init>(m, k);
    TWO_THIRDS = localFraction;
    localFraction = new org/apache/commons/lang/math/Fraction;
    localFraction.<init>(n, j);
    ONE_QUARTER = localFraction;
    localFraction = new org/apache/commons/lang/math/Fraction;
    localFraction.<init>(m, j);
    TWO_QUARTERS = localFraction;
    localFraction = new org/apache/commons/lang/math/Fraction;
    localFraction.<init>(k, j);
    THREE_QUARTERS = localFraction;
    localFraction = new org/apache/commons/lang/math/Fraction;
    localFraction.<init>(n, i);
    ONE_FIFTH = localFraction;
    localFraction = new org/apache/commons/lang/math/Fraction;
    localFraction.<init>(m, i);
    TWO_FIFTHS = localFraction;
    localFraction = new org/apache/commons/lang/math/Fraction;
    localFraction.<init>(k, i);
    THREE_FIFTHS = localFraction;
    localFraction = new org/apache/commons/lang/math/Fraction;
    localFraction.<init>(j, i);
    FOUR_FIFTHS = localFraction;
  }
  
  private Fraction(int paramInt1, int paramInt2)
  {
    this.numerator = paramInt1;
    this.denominator = paramInt2;
  }
  
  private static int addAndCheck(int paramInt1, int paramInt2)
  {
    long l1 = paramInt1;
    long l2 = paramInt2;
    long l3 = l1 + l2;
    l1 = 2147483648L;
    boolean bool = l3 < l1;
    if (!bool)
    {
      l1 = 2147483647L;
      bool = l3 < l1;
      if (!bool) {}
    }
    else
    {
      ArithmeticException localArithmeticException = new java/lang/ArithmeticException;
      localArithmeticException.<init>("overflow: add");
      throw localArithmeticException;
    }
    return (int)l3;
  }
  
  private Fraction addSub(Fraction paramFraction, boolean paramBoolean)
  {
    Object localObject1;
    if (paramFraction == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("The fraction must not be null");
      throw ((Throwable)localObject1);
    }
    int i = this.numerator;
    if (i == 0) {
      if (!paramBoolean) {}
    }
    for (;;)
    {
      return paramFraction;
      paramFraction = paramFraction.negate();
      continue;
      i = paramFraction.numerator;
      if (i == 0)
      {
        paramFraction = this;
      }
      else
      {
        i = this.denominator;
        int j = paramFraction.denominator;
        int k = greatestCommonDivisor(i, j);
        i = 1;
        if (k == i)
        {
          i = this.numerator;
          j = paramFraction.denominator;
          int m = mulAndCheck(i, j);
          i = paramFraction.numerator;
          j = this.denominator;
          int n = mulAndCheck(i, j);
          localObject2 = new org/apache/commons/lang/math/Fraction;
          if (paramBoolean) {}
          for (i = addAndCheck(m, n);; i = subAndCheck(m, n))
          {
            i1 = this.denominator;
            i2 = paramFraction.denominator;
            i1 = mulPosAndCheck(i1, i2);
            ((Fraction)localObject2).<init>(i, i1);
            paramFraction = (Fraction)localObject2;
            break;
          }
        }
        localObject1 = BigInteger.valueOf(this.numerator);
        Object localObject2 = BigInteger.valueOf(paramFraction.denominator / k);
        BigInteger localBigInteger1 = ((BigInteger)localObject1).multiply((BigInteger)localObject2);
        i = paramFraction.numerator;
        long l1 = i;
        localObject1 = BigInteger.valueOf(l1);
        j = this.denominator / k;
        long l2 = j;
        localObject2 = BigInteger.valueOf(l2);
        BigInteger localBigInteger2 = ((BigInteger)localObject1).multiply((BigInteger)localObject2);
        BigInteger localBigInteger3;
        int i3;
        if (paramBoolean)
        {
          localBigInteger3 = localBigInteger1.add(localBigInteger2);
          l1 = k;
          localObject1 = BigInteger.valueOf(l1);
          localObject1 = localBigInteger3.mod((BigInteger)localObject1);
          i3 = ((BigInteger)localObject1).intValue();
          if (i3 != 0) {
            break label379;
          }
        }
        BigInteger localBigInteger4;
        label379:
        for (int i4 = k;; i4 = greatestCommonDivisor(i3, k))
        {
          l1 = i4;
          localObject1 = BigInteger.valueOf(l1);
          localBigInteger4 = localBigInteger3.divide((BigInteger)localObject1);
          i = localBigInteger4.bitLength();
          j = 31;
          if (i <= j) {
            break label391;
          }
          localObject1 = new java/lang/ArithmeticException;
          ((ArithmeticException)localObject1).<init>("overflow: numerator too large after multiply");
          throw ((Throwable)localObject1);
          localBigInteger3 = localBigInteger1.subtract(localBigInteger2);
          break;
        }
        label391:
        localObject1 = new org/apache/commons/lang/math/Fraction;
        j = localBigInteger4.intValue();
        int i1 = this.denominator / k;
        int i2 = paramFraction.denominator / i4;
        i1 = mulPosAndCheck(i1, i2);
        ((Fraction)localObject1).<init>(j, i1);
        paramFraction = (Fraction)localObject1;
      }
    }
  }
  
  public static Fraction getFraction(double paramDouble)
  {
    double d1 = 0.0D;
    boolean bool = paramDouble < d1;
    if (bool) {}
    ArithmeticException localArithmeticException;
    for (int j = -1;; j = 1)
    {
      paramDouble = Math.abs(paramDouble);
      d1 = 2.147483647E9D;
      bool = paramDouble < d1;
      if (!bool)
      {
        bool = Double.isNaN(paramDouble);
        if (!bool) {
          break;
        }
      }
      localArithmeticException = new java/lang/ArithmeticException;
      localArithmeticException.<init>("The value must not be greater than Integer.MAX_VALUE or NaN");
      throw localArithmeticException;
    }
    double d2 = paramDouble;
    int k = (int)paramDouble;
    int m = k;
    d2 = k;
    d1 = d2;
    paramDouble -= d2;
    int n = 0;
    int i1 = 1;
    int i2 = 1;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    d2 = paramDouble;
    int i6 = (int)paramDouble;
    int i7 = 0;
    double d3 = 1.0D;
    d2 = i6;
    d1 = d2;
    double d4 = paramDouble - d2;
    double d5 = 0.0D;
    double d6 = Double.MAX_VALUE;
    int i8 = 1;
    do
    {
      double d7 = d6;
      d1 = d3 / d4;
      d2 = d1;
      i7 = (int)d1;
      d2 = i7;
      d1 = d2;
      d1 = d2 * d4;
      d5 = d3 - d1;
      i4 = i6 * i2 + n;
      i5 = i6 * i3 + i1;
      k = i4;
      d1 = i4;
      d2 = i5;
      double d8 = d1 / d2;
      d1 = paramDouble - d8;
      d6 = Math.abs(d1);
      i6 = i7;
      d3 = d4;
      d4 = d5;
      n = i2;
      i1 = i3;
      i2 = i4;
      i3 = i5;
      i8 += 1;
      bool = d7 < d6;
      if (!bool) {
        break;
      }
      i = 10000;
      k = i;
      if ((i5 > i) || (i5 <= 0)) {
        break;
      }
      i = 25;
      k = i;
    } while (i8 < i);
    int i = 25;
    k = i;
    if (i8 == i)
    {
      localArithmeticException = new java/lang/ArithmeticException;
      localArithmeticException.<init>("Unable to convert double to fraction");
      throw localArithmeticException;
    }
    i = (m * i1 + n) * j;
    k = i;
    return getReducedFraction(i, i1);
  }
  
  public static Fraction getFraction(int paramInt1, int paramInt2)
  {
    int i = -1 << -1;
    if (paramInt2 == 0)
    {
      localObject = new java/lang/ArithmeticException;
      ((ArithmeticException)localObject).<init>("The denominator must not be zero");
      throw ((Throwable)localObject);
    }
    if (paramInt2 < 0)
    {
      if ((paramInt1 == i) || (paramInt2 == i))
      {
        localObject = new java/lang/ArithmeticException;
        ((ArithmeticException)localObject).<init>("overflow: can't negate");
        throw ((Throwable)localObject);
      }
      paramInt1 = -paramInt1;
      paramInt2 = -paramInt2;
    }
    Object localObject = new org/apache/commons/lang/math/Fraction;
    ((Fraction)localObject).<init>(paramInt1, paramInt2);
    return (Fraction)localObject;
  }
  
  public static Fraction getFraction(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt3 == 0)
    {
      localObject = new java/lang/ArithmeticException;
      ((ArithmeticException)localObject).<init>("The denominator must not be zero");
      throw ((Throwable)localObject);
    }
    if (paramInt3 < 0)
    {
      localObject = new java/lang/ArithmeticException;
      ((ArithmeticException)localObject).<init>("The denominator must not be negative");
      throw ((Throwable)localObject);
    }
    if (paramInt2 < 0)
    {
      localObject = new java/lang/ArithmeticException;
      ((ArithmeticException)localObject).<init>("The numerator must not be negative");
      throw ((Throwable)localObject);
    }
    long l1;
    long l2;
    if (paramInt1 < 0)
    {
      l1 = paramInt1;
      l2 = paramInt3;
      l1 *= l2;
      l2 = paramInt2;
    }
    for (long l3 = l1 - l2;; l3 = l1 + l2)
    {
      l1 = 2147483648L;
      boolean bool = l3 < l1;
      if (!bool)
      {
        l1 = 2147483647L;
        bool = l3 < l1;
        if (!bool) {
          break;
        }
      }
      localObject = new java/lang/ArithmeticException;
      ((ArithmeticException)localObject).<init>("Numerator too large to represent as an Integer.");
      throw ((Throwable)localObject);
      l1 = paramInt1;
      l2 = paramInt3;
      l1 *= l2;
      l2 = paramInt2;
    }
    Object localObject = new org/apache/commons/lang/math/Fraction;
    int i = (int)l3;
    ((Fraction)localObject).<init>(i, paramInt3);
    return (Fraction)localObject;
  }
  
  public static Fraction getFraction(String paramString)
  {
    int i = 47;
    int j = 0;
    Object localObject;
    if (paramString == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("The string must not be null");
      throw ((Throwable)localObject);
    }
    int k = 46;
    int m = paramString.indexOf(k);
    if (m >= 0)
    {
      double d = Double.parseDouble(paramString);
      localObject = getFraction(d);
    }
    for (;;)
    {
      return (Fraction)localObject;
      k = 32;
      m = paramString.indexOf(k);
      int i1;
      int i2;
      if (m > 0)
      {
        localObject = paramString.substring(0, m);
        int n = Integer.parseInt((String)localObject);
        k = m + 1;
        paramString = paramString.substring(k);
        m = paramString.indexOf(i);
        if (m < 0)
        {
          localObject = new java/lang/NumberFormatException;
          ((NumberFormatException)localObject).<init>("The fraction could not be parsed as the format X Y/Z");
          throw ((Throwable)localObject);
        }
        i1 = Integer.parseInt(paramString.substring(0, m));
        k = m + 1;
        i2 = Integer.parseInt(paramString.substring(k));
        localObject = getFraction(n, i1, i2);
      }
      else
      {
        m = paramString.indexOf(i);
        if (m < 0)
        {
          k = Integer.parseInt(paramString);
          j = 1;
          localObject = getFraction(k, j);
        }
        else
        {
          i1 = Integer.parseInt(paramString.substring(0, m));
          k = m + 1;
          i2 = Integer.parseInt(paramString.substring(k));
          localObject = getFraction(i1, i2);
        }
      }
    }
  }
  
  public static Fraction getReducedFraction(int paramInt1, int paramInt2)
  {
    int i = -1 << -1;
    Object localObject;
    if (paramInt2 == 0)
    {
      localObject = new java/lang/ArithmeticException;
      ((ArithmeticException)localObject).<init>("The denominator must not be zero");
      throw ((Throwable)localObject);
    }
    if (paramInt1 == 0) {
      localObject = ZERO;
    }
    for (;;)
    {
      return (Fraction)localObject;
      if (paramInt2 == i)
      {
        int j = paramInt1 & 0x1;
        if (j == 0)
        {
          paramInt1 /= 2;
          paramInt2 /= 2;
        }
      }
      if (paramInt2 < 0)
      {
        if ((paramInt1 == i) || (paramInt2 == i))
        {
          localObject = new java/lang/ArithmeticException;
          ((ArithmeticException)localObject).<init>("overflow: can't negate");
          throw ((Throwable)localObject);
        }
        paramInt1 = -paramInt1;
        paramInt2 = -paramInt2;
      }
      int k = greatestCommonDivisor(paramInt1, paramInt2);
      paramInt1 /= k;
      paramInt2 /= k;
      localObject = new org/apache/commons/lang/math/Fraction;
      ((Fraction)localObject).<init>(paramInt1, paramInt2);
    }
  }
  
  private static int greatestCommonDivisor(int paramInt1, int paramInt2)
  {
    int i = 31;
    int j = 1;
    int k = Math.abs(paramInt1);
    if (k > j)
    {
      k = Math.abs(paramInt2);
      if (k > j) {}
    }
    else
    {
      return j;
    }
    if (paramInt1 > 0) {
      paramInt1 = -paramInt1;
    }
    if (paramInt2 > 0) {
      paramInt2 = -paramInt2;
    }
    int m = 0;
    for (;;)
    {
      k = paramInt1 & 0x1;
      if (k != 0) {
        break;
      }
      k = paramInt2 & 0x1;
      if ((k != 0) || (m >= i)) {
        break;
      }
      paramInt1 /= 2;
      paramInt2 /= 2;
      m += 1;
    }
    if (m == i)
    {
      ArithmeticException localArithmeticException = new java/lang/ArithmeticException;
      localArithmeticException.<init>("overflow: gcd is 2^31");
      throw localArithmeticException;
    }
    k = paramInt1 & 0x1;
    int n;
    if (k == j) {
      n = paramInt2;
    }
    for (;;)
    {
      label126:
      k = n & 0x1;
      if (k != 0) {
        break;
      }
      n /= 2;
      continue;
      k = paramInt1 / 2;
      n = -k;
    }
    if (n > 0) {
      paramInt1 = -n;
    }
    for (;;)
    {
      k = paramInt2 - paramInt1;
      n = k / 2;
      if (n != 0) {
        break label126;
      }
      k = -paramInt1;
      j = (j << m) * k;
      break;
      paramInt2 = n;
    }
  }
  
  private static int mulAndCheck(int paramInt1, int paramInt2)
  {
    long l1 = paramInt1;
    long l2 = paramInt2;
    long l3 = l1 * l2;
    l1 = 2147483648L;
    boolean bool = l3 < l1;
    if (!bool)
    {
      l1 = 2147483647L;
      bool = l3 < l1;
      if (!bool) {}
    }
    else
    {
      ArithmeticException localArithmeticException = new java/lang/ArithmeticException;
      localArithmeticException.<init>("overflow: mul");
      throw localArithmeticException;
    }
    return (int)l3;
  }
  
  private static int mulPosAndCheck(int paramInt1, int paramInt2)
  {
    long l1 = paramInt1;
    long l2 = paramInt2;
    long l3 = l1 * l2;
    l1 = 2147483647L;
    boolean bool = l3 < l1;
    if (bool)
    {
      ArithmeticException localArithmeticException = new java/lang/ArithmeticException;
      localArithmeticException.<init>("overflow: mulPos");
      throw localArithmeticException;
    }
    return (int)l3;
  }
  
  private static int subAndCheck(int paramInt1, int paramInt2)
  {
    long l1 = paramInt1;
    long l2 = paramInt2;
    long l3 = l1 - l2;
    l1 = 2147483648L;
    boolean bool = l3 < l1;
    if (!bool)
    {
      l1 = 2147483647L;
      bool = l3 < l1;
      if (!bool) {}
    }
    else
    {
      ArithmeticException localArithmeticException = new java/lang/ArithmeticException;
      localArithmeticException.<init>("overflow: add");
      throw localArithmeticException;
    }
    return (int)l3;
  }
  
  public Fraction abs()
  {
    int i = this.numerator;
    if (i >= 0) {}
    for (;;)
    {
      return this;
      this = negate();
    }
  }
  
  public Fraction add(Fraction paramFraction)
  {
    return addSub(paramFraction, true);
  }
  
  public int compareTo(Object paramObject)
  {
    int i = 0;
    Object localObject = paramObject;
    localObject = (Fraction)paramObject;
    if (this == localObject) {}
    for (;;)
    {
      return i;
      int k = this.numerator;
      int m = ((Fraction)localObject).numerator;
      if (k == m)
      {
        k = this.denominator;
        m = ((Fraction)localObject).denominator;
        if (k == m) {}
      }
      else
      {
        long l1 = this.numerator;
        long l2 = ((Fraction)localObject).denominator;
        long l3 = l1 * l2;
        l1 = ((Fraction)localObject).numerator;
        int n = this.denominator;
        l2 = n;
        long l4 = l1 * l2;
        boolean bool2 = l3 < l4;
        if (bool2)
        {
          boolean bool1 = l3 < l4;
          int j;
          if (bool1) {
            j = -1;
          } else {
            j = 1;
          }
        }
      }
    }
  }
  
  public Fraction divideBy(Fraction paramFraction)
  {
    if (paramFraction == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("The fraction must not be null");
      throw ((Throwable)localObject);
    }
    int i = paramFraction.numerator;
    if (i == 0)
    {
      localObject = new java/lang/ArithmeticException;
      ((ArithmeticException)localObject).<init>("The fraction to divide by must not be zero");
      throw ((Throwable)localObject);
    }
    Object localObject = paramFraction.invert();
    return multiplyBy((Fraction)localObject);
  }
  
  public double doubleValue()
  {
    double d1 = this.numerator;
    double d2 = this.denominator;
    return d1 / d2;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof Fraction;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        Object localObject = paramObject;
        localObject = (Fraction)paramObject;
        int i = getNumerator();
        int j = ((Fraction)localObject).getNumerator();
        if (i == j)
        {
          i = getDenominator();
          j = ((Fraction)localObject).getDenominator();
          if (i == j) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public float floatValue()
  {
    float f1 = this.numerator;
    float f2 = this.denominator;
    return f1 / f2;
  }
  
  public int getDenominator()
  {
    return this.denominator;
  }
  
  public int getNumerator()
  {
    return this.numerator;
  }
  
  public int getProperNumerator()
  {
    int i = this.numerator;
    int j = this.denominator;
    return Math.abs(i % j);
  }
  
  public int getProperWhole()
  {
    int i = this.numerator;
    int j = this.denominator;
    return i / j;
  }
  
  public int hashCode()
  {
    int i = this.hashCode;
    if (i == 0)
    {
      i = (getNumerator() + 629) * 37;
      int j = getDenominator();
      i += j;
      this.hashCode = i;
    }
    return this.hashCode;
  }
  
  public int intValue()
  {
    int i = this.numerator;
    int j = this.denominator;
    return i / j;
  }
  
  public Fraction invert()
  {
    int i = this.numerator;
    Object localObject;
    if (i == 0)
    {
      localObject = new java/lang/ArithmeticException;
      ((ArithmeticException)localObject).<init>("Unable to invert zero.");
      throw ((Throwable)localObject);
    }
    i = this.numerator;
    int j = -1 << -1;
    if (i == j)
    {
      localObject = new java/lang/ArithmeticException;
      ((ArithmeticException)localObject).<init>("overflow: can't negate numerator");
      throw ((Throwable)localObject);
    }
    i = this.numerator;
    int k;
    if (i < 0)
    {
      localObject = new org/apache/commons/lang/math/Fraction;
      j = -this.denominator;
      k = -this.numerator;
      ((Fraction)localObject).<init>(j, k);
    }
    for (;;)
    {
      return (Fraction)localObject;
      localObject = new org/apache/commons/lang/math/Fraction;
      j = this.denominator;
      k = this.numerator;
      ((Fraction)localObject).<init>(j, k);
    }
  }
  
  public long longValue()
  {
    long l1 = this.numerator;
    long l2 = this.denominator;
    return l1 / l2;
  }
  
  public Fraction multiplyBy(Fraction paramFraction)
  {
    if (paramFraction == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("The fraction must not be null");
      throw ((Throwable)localObject);
    }
    int i = this.numerator;
    if (i != 0)
    {
      i = paramFraction.numerator;
      if (i != 0) {
        break label40;
      }
    }
    label40:
    int j;
    for (Object localObject = ZERO;; localObject = getReducedFraction(i, j))
    {
      return (Fraction)localObject;
      i = this.numerator;
      j = paramFraction.denominator;
      int k = greatestCommonDivisor(i, j);
      i = paramFraction.numerator;
      j = this.denominator;
      int m = greatestCommonDivisor(i, j);
      i = this.numerator / k;
      j = paramFraction.numerator / m;
      i = mulAndCheck(i, j);
      j = this.denominator / m;
      int n = paramFraction.denominator / k;
      j = mulPosAndCheck(j, n);
    }
  }
  
  public Fraction negate()
  {
    int i = this.numerator;
    int j = -1 << -1;
    if (i == j)
    {
      localObject = new java/lang/ArithmeticException;
      ((ArithmeticException)localObject).<init>("overflow: too large to negate");
      throw ((Throwable)localObject);
    }
    Object localObject = new org/apache/commons/lang/math/Fraction;
    j = -this.numerator;
    int k = this.denominator;
    ((Fraction)localObject).<init>(j, k);
    return (Fraction)localObject;
  }
  
  public Fraction pow(int paramInt)
  {
    int i = 1;
    if (paramInt == i) {}
    for (;;)
    {
      return this;
      if (paramInt == 0)
      {
        this = ONE;
      }
      else
      {
        Fraction localFraction1;
        if (paramInt < 0)
        {
          i = -1 << -1;
          int j;
          if (paramInt == i)
          {
            localFraction1 = invert().pow(2);
            j = -(paramInt / 2);
            this = localFraction1.pow(j);
          }
          else
          {
            localFraction1 = invert();
            j = -paramInt;
            this = localFraction1.pow(j);
          }
        }
        else
        {
          Fraction localFraction2 = multiplyBy(this);
          i = paramInt % 2;
          if (i == 0)
          {
            i = paramInt / 2;
            this = localFraction2.pow(i);
          }
          else
          {
            i = paramInt / 2;
            localFraction1 = localFraction2.pow(i);
            this = localFraction1.multiplyBy(this);
          }
        }
      }
    }
  }
  
  public Fraction reduce()
  {
    int i = this.numerator;
    if (i == 0)
    {
      Fraction localFraction = ZERO;
      boolean bool = equals(localFraction);
      if (!bool) {}
    }
    for (;;)
    {
      return this;
      this = ZERO;
      continue;
      int j = Math.abs(this.numerator);
      int k = this.denominator;
      int m = greatestCommonDivisor(j, k);
      j = 1;
      if (m != j)
      {
        j = this.numerator / m;
        k = this.denominator / m;
        this = getFraction(j, k);
      }
    }
  }
  
  public Fraction subtract(Fraction paramFraction)
  {
    return addSub(paramFraction, false);
  }
  
  public String toProperString()
  {
    char c1 = '/';
    char c2 = ' ';
    Object localObject = this.toProperString;
    int i;
    if (localObject == null)
    {
      i = this.numerator;
      if (i != 0) {
        break label40;
      }
      localObject = "0";
      this.toProperString = ((String)localObject);
    }
    for (;;)
    {
      return this.toProperString;
      label40:
      i = this.numerator;
      int j = this.denominator;
      if (i == j)
      {
        localObject = "1";
        this.toProperString = ((String)localObject);
      }
      else
      {
        i = this.numerator;
        j = this.denominator * -1;
        if (i == j)
        {
          localObject = "-1";
          this.toProperString = ((String)localObject);
        }
        else
        {
          i = this.numerator;
          if (i > 0) {}
          int k;
          for (i = -this.numerator;; i = this.numerator)
          {
            j = -this.denominator;
            if (i >= j) {
              break label235;
            }
            k = getProperNumerator();
            if (k != 0) {
              break label176;
            }
            i = getProperWhole();
            localObject = Integer.toString(i);
            this.toProperString = ((String)localObject);
            break;
          }
          label176:
          localObject = new java/lang/StringBuffer;
          ((StringBuffer)localObject).<init>(c2);
          j = getProperWhole();
          localObject = ((StringBuffer)localObject).append(j).append(c2).append(k).append(c1);
          j = getDenominator();
          localObject = j;
          this.toProperString = ((String)localObject);
          continue;
          label235:
          localObject = new java/lang/StringBuffer;
          ((StringBuffer)localObject).<init>(c2);
          j = getNumerator();
          localObject = ((StringBuffer)localObject).append(j).append(c1);
          j = getDenominator();
          localObject = j;
          this.toProperString = ((String)localObject);
        }
      }
    }
  }
  
  public String toString()
  {
    Object localObject = this.toString;
    if (localObject == null)
    {
      localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>(32);
      int i = getNumerator();
      localObject = ((StringBuffer)localObject).append(i).append('/');
      i = getDenominator();
      localObject = i;
      this.toString = ((String)localObject);
    }
    return this.toString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/math/Fraction.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */