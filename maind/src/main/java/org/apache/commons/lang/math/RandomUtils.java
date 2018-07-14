package org.apache.commons.lang.math;

import java.util.Random;

public class RandomUtils
{
  public static final Random JVM_RANDOM;
  
  static
  {
    JVMRandom localJVMRandom = new org/apache/commons/lang/math/JVMRandom;
    localJVMRandom.<init>();
    JVM_RANDOM = localJVMRandom;
  }
  
  public static boolean nextBoolean()
  {
    return nextBoolean(JVM_RANDOM);
  }
  
  public static boolean nextBoolean(Random paramRandom)
  {
    return paramRandom.nextBoolean();
  }
  
  public static double nextDouble()
  {
    return nextDouble(JVM_RANDOM);
  }
  
  public static double nextDouble(Random paramRandom)
  {
    return paramRandom.nextDouble();
  }
  
  public static float nextFloat()
  {
    return nextFloat(JVM_RANDOM);
  }
  
  public static float nextFloat(Random paramRandom)
  {
    return paramRandom.nextFloat();
  }
  
  public static int nextInt()
  {
    return nextInt(JVM_RANDOM);
  }
  
  public static int nextInt(int paramInt)
  {
    return nextInt(JVM_RANDOM, paramInt);
  }
  
  public static int nextInt(Random paramRandom)
  {
    return paramRandom.nextInt();
  }
  
  public static int nextInt(Random paramRandom, int paramInt)
  {
    return paramRandom.nextInt(paramInt);
  }
  
  public static long nextLong()
  {
    return nextLong(JVM_RANDOM);
  }
  
  public static long nextLong(Random paramRandom)
  {
    return paramRandom.nextLong();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/math/RandomUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */