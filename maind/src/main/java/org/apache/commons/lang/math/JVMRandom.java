package org.apache.commons.lang.math;

import java.util.Random;

public final class JVMRandom
  extends Random
{
  private static final Random SHARED_RANDOM;
  private static final long serialVersionUID = 1L;
  private boolean constructed = false;
  
  static
  {
    Random localRandom = new java/util/Random;
    localRandom.<init>();
    SHARED_RANDOM = localRandom;
  }
  
  private static int bitsRequired(long paramLong)
  {
    long l1 = 0L;
    int i = 1;
    long l2 = paramLong;
    int j = 0;
    for (;;)
    {
      boolean bool = paramLong < l1;
      if (bool) {
        j = 64 - j;
      }
      do
      {
        return j;
        bool = l2 < l1;
      } while (!bool);
      j += 1;
      paramLong <<= i;
      l2 >>= i;
    }
  }
  
  private static long next63bits()
  {
    return SHARED_RANDOM.nextLong() & 0x7FFFFFFFFFFFFFFF;
  }
  
  public static long nextLong(long paramLong)
  {
    long l1 = 1L;
    long l2 = 0L;
    boolean bool = paramLong < l2;
    if (!bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Upper bound for nextInt must be positive");
      throw localIllegalArgumentException;
    }
    long l3 = -paramLong & paramLong;
    bool = l3 < paramLong;
    long l4;
    long l5;
    if (!bool)
    {
      l3 = next63bits();
      l4 = paramLong - l1;
      int i = bitsRequired(l4);
      i = 63 - i;
      l5 = l3 >> i;
    }
    for (;;)
    {
      return l5;
      do
      {
        long l6 = next63bits();
        l5 = l6 % paramLong;
        l3 = l6 - l5;
        l4 = paramLong - l1;
        l3 += l4;
        bool = l3 < l2;
      } while (bool);
    }
  }
  
  public boolean nextBoolean()
  {
    return SHARED_RANDOM.nextBoolean();
  }
  
  public void nextBytes(byte[] paramArrayOfByte)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public double nextDouble()
  {
    return SHARED_RANDOM.nextDouble();
  }
  
  public float nextFloat()
  {
    return SHARED_RANDOM.nextFloat();
  }
  
  public double nextGaussian()
  {
    try
    {
      UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
      localUnsupportedOperationException.<init>();
      throw localUnsupportedOperationException;
    }
    finally {}
  }
  
  public int nextInt()
  {
    return nextInt(-1 >>> 1);
  }
  
  public int nextInt(int paramInt)
  {
    return SHARED_RANDOM.nextInt(paramInt);
  }
  
  public long nextLong()
  {
    return nextLong(Long.MAX_VALUE);
  }
  
  public void setSeed(long paramLong)
  {
    try
    {
      boolean bool = this.constructed;
      if (bool)
      {
        UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
        localUnsupportedOperationException.<init>();
        throw localUnsupportedOperationException;
      }
    }
    finally {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/math/JVMRandom.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */