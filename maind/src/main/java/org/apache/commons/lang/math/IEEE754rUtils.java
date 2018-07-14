package org.apache.commons.lang.math;

public class IEEE754rUtils
{
  public static double max(double paramDouble1, double paramDouble2)
  {
    boolean bool = Double.isNaN(paramDouble1);
    if (bool) {}
    for (;;)
    {
      return paramDouble2;
      bool = Double.isNaN(paramDouble2);
      if (bool) {
        paramDouble2 = paramDouble1;
      } else {
        paramDouble2 = Math.max(paramDouble1, paramDouble2);
      }
    }
  }
  
  public static double max(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    return max(max(paramDouble1, paramDouble2), paramDouble3);
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
      if (j >= i) {
        break;
      }
      double d2 = paramArrayOfDouble[j];
      d1 = max(d2, d1);
      j += 1;
    }
    return d1;
  }
  
  public static float max(float paramFloat1, float paramFloat2)
  {
    boolean bool = Float.isNaN(paramFloat1);
    if (bool) {}
    for (;;)
    {
      return paramFloat2;
      bool = Float.isNaN(paramFloat2);
      if (bool) {
        paramFloat2 = paramFloat1;
      } else {
        paramFloat2 = Math.max(paramFloat1, paramFloat2);
      }
    }
  }
  
  public static float max(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return max(max(paramFloat1, paramFloat2), paramFloat3);
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
      if (j >= i) {
        break;
      }
      f1 = paramArrayOfFloat[j];
      f2 = max(f1, f2);
      j += 1;
    }
    return f2;
  }
  
  public static double min(double paramDouble1, double paramDouble2)
  {
    boolean bool = Double.isNaN(paramDouble1);
    if (bool) {}
    for (;;)
    {
      return paramDouble2;
      bool = Double.isNaN(paramDouble2);
      if (bool) {
        paramDouble2 = paramDouble1;
      } else {
        paramDouble2 = Math.min(paramDouble1, paramDouble2);
      }
    }
  }
  
  public static double min(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    return min(min(paramDouble1, paramDouble2), paramDouble3);
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
      if (j >= i) {
        break;
      }
      double d2 = paramArrayOfDouble[j];
      d1 = min(d2, d1);
      j += 1;
    }
    return d1;
  }
  
  public static float min(float paramFloat1, float paramFloat2)
  {
    boolean bool = Float.isNaN(paramFloat1);
    if (bool) {}
    for (;;)
    {
      return paramFloat2;
      bool = Float.isNaN(paramFloat2);
      if (bool) {
        paramFloat2 = paramFloat1;
      } else {
        paramFloat2 = Math.min(paramFloat1, paramFloat2);
      }
    }
  }
  
  public static float min(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return min(min(paramFloat1, paramFloat2), paramFloat3);
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
      if (j >= i) {
        break;
      }
      f1 = paramArrayOfFloat[j];
      f2 = min(f1, f2);
      j += 1;
    }
    return f2;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/math/IEEE754rUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */