package org.apache.commons.lang.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import org.apache.commons.lang.ArrayUtils;

public class EqualsBuilder
{
  private boolean isEquals = true;
  
  private static void reflectionAppend(Object paramObject1, Object paramObject2, Class paramClass, EqualsBuilder paramEqualsBuilder, boolean paramBoolean, String[] paramArrayOfString)
  {
    Field[] arrayOfField = paramClass.getDeclaredFields();
    boolean bool1 = true;
    AccessibleObject.setAccessible(arrayOfField, bool1);
    int k = 0;
    for (;;)
    {
      int i = arrayOfField.length;
      if (k < i)
      {
        boolean bool2 = paramEqualsBuilder.isEquals;
        if (bool2)
        {
          Field localField = arrayOfField[k];
          Object localObject1 = localField.getName();
          bool2 = ArrayUtils.contains(paramArrayOfString, localObject1);
          if (!bool2)
          {
            localObject1 = localField.getName();
            int j = ((String)localObject1).indexOf('$');
            int m = -1;
            if (j == m)
            {
              boolean bool3;
              if (!paramBoolean)
              {
                bool3 = Modifier.isTransient(localField.getModifiers());
                if (bool3) {}
              }
              else
              {
                bool3 = Modifier.isStatic(localField.getModifiers());
                if (bool3) {}
              }
            }
          }
          try
          {
            localObject1 = localField.get(paramObject1);
            Object localObject2 = localField.get(paramObject2);
            paramEqualsBuilder.append(localObject1, localObject2);
            k += 1;
          }
          catch (IllegalAccessException localIllegalAccessException)
          {
            localObject1 = new java/lang/InternalError;
            ((InternalError)localObject1).<init>("Unexpected IllegalAccessException");
            throw ((Throwable)localObject1);
          }
        }
      }
    }
  }
  
  public static boolean reflectionEquals(Object paramObject1, Object paramObject2)
  {
    return reflectionEquals(paramObject1, paramObject2, false, null, null);
  }
  
  public static boolean reflectionEquals(Object paramObject1, Object paramObject2, Collection paramCollection)
  {
    String[] arrayOfString = ReflectionToStringBuilder.toNoNullStringArray(paramCollection);
    return reflectionEquals(paramObject1, paramObject2, arrayOfString);
  }
  
  public static boolean reflectionEquals(Object paramObject1, Object paramObject2, boolean paramBoolean)
  {
    return reflectionEquals(paramObject1, paramObject2, paramBoolean, null, null);
  }
  
  public static boolean reflectionEquals(Object paramObject1, Object paramObject2, boolean paramBoolean, Class paramClass)
  {
    return reflectionEquals(paramObject1, paramObject2, paramBoolean, paramClass, null);
  }
  
  public static boolean reflectionEquals(Object paramObject1, Object paramObject2, boolean paramBoolean, Class paramClass, String[] paramArrayOfString)
  {
    boolean bool;
    if (paramObject1 == paramObject2) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      Object localObject;
      if ((paramObject1 == null) || (paramObject2 == null))
      {
        bool = false;
        localObject = null;
      }
      else
      {
        Class localClass1 = paramObject1.getClass();
        Class localClass2 = paramObject2.getClass();
        bool = localClass1.isInstance(paramObject2);
        Class localClass3;
        if (bool)
        {
          localClass3 = localClass1;
          bool = localClass2.isInstance(paramObject1);
          if (!bool) {
            localClass3 = localClass2;
          }
        }
        EqualsBuilder localEqualsBuilder;
        for (;;)
        {
          localEqualsBuilder = new org/apache/commons/lang/builder/EqualsBuilder;
          localEqualsBuilder.<init>();
          localObject = paramObject1;
          try
          {
            reflectionAppend(paramObject1, paramObject2, localClass3, localEqualsBuilder, paramBoolean, paramArrayOfString);
            for (;;)
            {
              localObject = localClass3.getSuperclass();
              if ((localObject == null) || (localClass3 == paramClass)) {
                break;
              }
              localClass3 = localClass3.getSuperclass();
              localObject = paramObject1;
              reflectionAppend(paramObject1, paramObject2, localClass3, localEqualsBuilder, paramBoolean, paramArrayOfString);
            }
          }
          catch (IllegalArgumentException localIllegalArgumentException)
          {
            bool = false;
            localObject = null;
          }
          bool = localClass2.isInstance(paramObject1);
          if (!bool) {
            break label189;
          }
          localClass3 = localClass2;
          bool = localClass1.isInstance(paramObject2);
          if (!bool) {
            localClass3 = localClass1;
          }
        }
        label189:
        bool = false;
        localObject = null;
        continue;
        bool = localEqualsBuilder.isEquals();
      }
    }
  }
  
  public static boolean reflectionEquals(Object paramObject1, Object paramObject2, String[] paramArrayOfString)
  {
    return reflectionEquals(paramObject1, paramObject2, false, null, paramArrayOfString);
  }
  
  public EqualsBuilder append(byte paramByte1, byte paramByte2)
  {
    boolean bool = this.isEquals;
    if (!bool) {
      return this;
    }
    if (paramByte1 == paramByte2) {}
    for (bool = true;; bool = false)
    {
      this.isEquals = bool;
      break;
    }
  }
  
  public EqualsBuilder append(char paramChar1, char paramChar2)
  {
    boolean bool = this.isEquals;
    if (!bool) {
      return this;
    }
    if (paramChar1 == paramChar2) {}
    for (bool = true;; bool = false)
    {
      this.isEquals = bool;
      break;
    }
  }
  
  public EqualsBuilder append(double paramDouble1, double paramDouble2)
  {
    boolean bool = this.isEquals;
    if (!bool) {}
    for (;;)
    {
      return this;
      long l1 = Double.doubleToLongBits(paramDouble1);
      long l2 = Double.doubleToLongBits(paramDouble2);
      this = append(l1, l2);
    }
  }
  
  public EqualsBuilder append(float paramFloat1, float paramFloat2)
  {
    boolean bool = this.isEquals;
    if (!bool) {}
    for (;;)
    {
      return this;
      int i = Float.floatToIntBits(paramFloat1);
      int j = Float.floatToIntBits(paramFloat2);
      this = append(i, j);
    }
  }
  
  public EqualsBuilder append(int paramInt1, int paramInt2)
  {
    boolean bool = this.isEquals;
    if (!bool) {
      return this;
    }
    if (paramInt1 == paramInt2) {}
    for (bool = true;; bool = false)
    {
      this.isEquals = bool;
      break;
    }
  }
  
  public EqualsBuilder append(long paramLong1, long paramLong2)
  {
    boolean bool = this.isEquals;
    if (!bool) {
      return this;
    }
    bool = paramLong1 < paramLong2;
    if (!bool) {}
    for (bool = true;; bool = false)
    {
      this.isEquals = bool;
      break;
    }
  }
  
  public EqualsBuilder append(Object paramObject1, Object paramObject2)
  {
    boolean bool = this.isEquals;
    if (!bool) {}
    for (;;)
    {
      return this;
      if (paramObject1 != paramObject2) {
        if ((paramObject1 == null) || (paramObject2 == null))
        {
          setEquals(false);
        }
        else
        {
          Class localClass1 = paramObject1.getClass();
          bool = localClass1.isArray();
          if (!bool)
          {
            bool = paramObject1.equals(paramObject2);
            this.isEquals = bool;
          }
          else
          {
            Class localClass2 = paramObject1.getClass();
            Class localClass3 = paramObject2.getClass();
            if (localClass2 != localClass3)
            {
              setEquals(false);
            }
            else
            {
              bool = paramObject1 instanceof long[];
              if (bool)
              {
                paramObject1 = (long[])paramObject1;
                paramObject2 = (long[])paramObject2;
                append((long[])paramObject1, (long[])paramObject2);
              }
              else
              {
                bool = paramObject1 instanceof int[];
                if (bool)
                {
                  paramObject1 = (int[])paramObject1;
                  paramObject2 = (int[])paramObject2;
                  append((int[])paramObject1, (int[])paramObject2);
                }
                else
                {
                  bool = paramObject1 instanceof short[];
                  if (bool)
                  {
                    paramObject1 = (short[])paramObject1;
                    paramObject2 = (short[])paramObject2;
                    append((short[])paramObject1, (short[])paramObject2);
                  }
                  else
                  {
                    bool = paramObject1 instanceof char[];
                    if (bool)
                    {
                      paramObject1 = (char[])paramObject1;
                      paramObject2 = (char[])paramObject2;
                      append((char[])paramObject1, (char[])paramObject2);
                    }
                    else
                    {
                      bool = paramObject1 instanceof byte[];
                      if (bool)
                      {
                        paramObject1 = (byte[])paramObject1;
                        paramObject2 = (byte[])paramObject2;
                        append((byte[])paramObject1, (byte[])paramObject2);
                      }
                      else
                      {
                        bool = paramObject1 instanceof double[];
                        if (bool)
                        {
                          paramObject1 = (double[])paramObject1;
                          paramObject2 = (double[])paramObject2;
                          append((double[])paramObject1, (double[])paramObject2);
                        }
                        else
                        {
                          bool = paramObject1 instanceof float[];
                          if (bool)
                          {
                            paramObject1 = (float[])paramObject1;
                            paramObject2 = (float[])paramObject2;
                            append((float[])paramObject1, (float[])paramObject2);
                          }
                          else
                          {
                            bool = paramObject1 instanceof boolean[];
                            if (bool)
                            {
                              paramObject1 = (boolean[])paramObject1;
                              paramObject2 = (boolean[])paramObject2;
                              append((boolean[])paramObject1, (boolean[])paramObject2);
                            }
                            else
                            {
                              paramObject1 = (Object[])paramObject1;
                              paramObject2 = (Object[])paramObject2;
                              append((Object[])paramObject1, (Object[])paramObject2);
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public EqualsBuilder append(short paramShort1, short paramShort2)
  {
    boolean bool = this.isEquals;
    if (!bool) {
      return this;
    }
    if (paramShort1 == paramShort2) {}
    for (bool = true;; bool = false)
    {
      this.isEquals = bool;
      break;
    }
  }
  
  public EqualsBuilder append(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = this.isEquals;
    if (!bool) {
      return this;
    }
    if (paramBoolean1 == paramBoolean2) {}
    for (bool = true;; bool = false)
    {
      this.isEquals = bool;
      break;
    }
  }
  
  public EqualsBuilder append(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    boolean bool1 = this.isEquals;
    if (!bool1) {}
    int i;
    int j;
    for (;;)
    {
      return this;
      if (paramArrayOfByte1 != paramArrayOfByte2) {
        if ((paramArrayOfByte1 == null) || (paramArrayOfByte2 == null))
        {
          setEquals(false);
        }
        else
        {
          i = paramArrayOfByte1.length;
          j = paramArrayOfByte2.length;
          if (i == j) {
            break;
          }
          setEquals(false);
        }
      }
    }
    int k = 0;
    for (;;)
    {
      i = paramArrayOfByte1.length;
      if (k >= i) {
        break;
      }
      boolean bool2 = this.isEquals;
      if (!bool2) {
        break;
      }
      byte b = paramArrayOfByte1[k];
      j = paramArrayOfByte2[k];
      append(b, j);
      k += 1;
    }
  }
  
  public EqualsBuilder append(char[] paramArrayOfChar1, char[] paramArrayOfChar2)
  {
    boolean bool1 = this.isEquals;
    if (!bool1) {}
    int i;
    int j;
    for (;;)
    {
      return this;
      if (paramArrayOfChar1 != paramArrayOfChar2) {
        if ((paramArrayOfChar1 == null) || (paramArrayOfChar2 == null))
        {
          setEquals(false);
        }
        else
        {
          i = paramArrayOfChar1.length;
          j = paramArrayOfChar2.length;
          if (i == j) {
            break;
          }
          setEquals(false);
        }
      }
    }
    int k = 0;
    for (;;)
    {
      i = paramArrayOfChar1.length;
      if (k >= i) {
        break;
      }
      boolean bool2 = this.isEquals;
      if (!bool2) {
        break;
      }
      char c = paramArrayOfChar1[k];
      j = paramArrayOfChar2[k];
      append(c, j);
      k += 1;
    }
  }
  
  public EqualsBuilder append(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    boolean bool1 = this.isEquals;
    if (!bool1) {}
    int i;
    for (;;)
    {
      return this;
      if (paramArrayOfDouble1 != paramArrayOfDouble2) {
        if ((paramArrayOfDouble1 == null) || (paramArrayOfDouble2 == null))
        {
          setEquals(false);
        }
        else
        {
          i = paramArrayOfDouble1.length;
          int j = paramArrayOfDouble2.length;
          if (i == j) {
            break;
          }
          setEquals(false);
        }
      }
    }
    int k = 0;
    for (;;)
    {
      i = paramArrayOfDouble1.length;
      if (k >= i) {
        break;
      }
      boolean bool2 = this.isEquals;
      if (!bool2) {
        break;
      }
      double d1 = paramArrayOfDouble1[k];
      double d2 = paramArrayOfDouble2[k];
      append(d1, d2);
      k += 1;
    }
  }
  
  public EqualsBuilder append(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    boolean bool1 = this.isEquals;
    if (!bool1) {}
    int i;
    for (;;)
    {
      return this;
      if (paramArrayOfFloat1 != paramArrayOfFloat2) {
        if ((paramArrayOfFloat1 == null) || (paramArrayOfFloat2 == null))
        {
          setEquals(false);
        }
        else
        {
          i = paramArrayOfFloat1.length;
          int j = paramArrayOfFloat2.length;
          if (i == j) {
            break;
          }
          setEquals(false);
        }
      }
    }
    int k = 0;
    for (;;)
    {
      i = paramArrayOfFloat1.length;
      if (k >= i) {
        break;
      }
      boolean bool2 = this.isEquals;
      if (!bool2) {
        break;
      }
      float f1 = paramArrayOfFloat1[k];
      float f2 = paramArrayOfFloat2[k];
      append(f1, f2);
      k += 1;
    }
  }
  
  public EqualsBuilder append(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    boolean bool1 = this.isEquals;
    if (!bool1) {}
    int i;
    int k;
    for (;;)
    {
      return this;
      if (paramArrayOfInt1 != paramArrayOfInt2) {
        if ((paramArrayOfInt1 == null) || (paramArrayOfInt2 == null))
        {
          setEquals(false);
        }
        else
        {
          i = paramArrayOfInt1.length;
          k = paramArrayOfInt2.length;
          if (i == k) {
            break;
          }
          setEquals(false);
        }
      }
    }
    int m = 0;
    for (;;)
    {
      i = paramArrayOfInt1.length;
      if (m >= i) {
        break;
      }
      boolean bool2 = this.isEquals;
      if (!bool2) {
        break;
      }
      int j = paramArrayOfInt1[m];
      k = paramArrayOfInt2[m];
      append(j, k);
      m += 1;
    }
  }
  
  public EqualsBuilder append(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    boolean bool1 = this.isEquals;
    if (!bool1) {}
    int i;
    for (;;)
    {
      return this;
      if (paramArrayOfLong1 != paramArrayOfLong2) {
        if ((paramArrayOfLong1 == null) || (paramArrayOfLong2 == null))
        {
          setEquals(false);
        }
        else
        {
          i = paramArrayOfLong1.length;
          int j = paramArrayOfLong2.length;
          if (i == j) {
            break;
          }
          setEquals(false);
        }
      }
    }
    int k = 0;
    for (;;)
    {
      i = paramArrayOfLong1.length;
      if (k >= i) {
        break;
      }
      boolean bool2 = this.isEquals;
      if (!bool2) {
        break;
      }
      long l1 = paramArrayOfLong1[k];
      long l2 = paramArrayOfLong2[k];
      append(l1, l2);
      k += 1;
    }
  }
  
  public EqualsBuilder append(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    boolean bool1 = this.isEquals;
    if (!bool1) {}
    int i;
    for (;;)
    {
      return this;
      if (paramArrayOfObject1 != paramArrayOfObject2) {
        if ((paramArrayOfObject1 == null) || (paramArrayOfObject2 == null))
        {
          setEquals(false);
        }
        else
        {
          i = paramArrayOfObject1.length;
          int j = paramArrayOfObject2.length;
          if (i == j) {
            break;
          }
          setEquals(false);
        }
      }
    }
    int k = 0;
    for (;;)
    {
      i = paramArrayOfObject1.length;
      if (k >= i) {
        break;
      }
      boolean bool2 = this.isEquals;
      if (!bool2) {
        break;
      }
      Object localObject1 = paramArrayOfObject1[k];
      Object localObject2 = paramArrayOfObject2[k];
      append(localObject1, localObject2);
      k += 1;
    }
  }
  
  public EqualsBuilder append(short[] paramArrayOfShort1, short[] paramArrayOfShort2)
  {
    boolean bool1 = this.isEquals;
    if (!bool1) {}
    int i;
    int j;
    for (;;)
    {
      return this;
      if (paramArrayOfShort1 != paramArrayOfShort2) {
        if ((paramArrayOfShort1 == null) || (paramArrayOfShort2 == null))
        {
          setEquals(false);
        }
        else
        {
          i = paramArrayOfShort1.length;
          j = paramArrayOfShort2.length;
          if (i == j) {
            break;
          }
          setEquals(false);
        }
      }
    }
    int k = 0;
    for (;;)
    {
      i = paramArrayOfShort1.length;
      if (k >= i) {
        break;
      }
      boolean bool2 = this.isEquals;
      if (!bool2) {
        break;
      }
      short s = paramArrayOfShort1[k];
      j = paramArrayOfShort2[k];
      append(s, j);
      k += 1;
    }
  }
  
  public EqualsBuilder append(boolean[] paramArrayOfBoolean1, boolean[] paramArrayOfBoolean2)
  {
    boolean bool1 = this.isEquals;
    if (!bool1) {}
    int i;
    int k;
    for (;;)
    {
      return this;
      if (paramArrayOfBoolean1 != paramArrayOfBoolean2) {
        if ((paramArrayOfBoolean1 == null) || (paramArrayOfBoolean2 == null))
        {
          setEquals(false);
        }
        else
        {
          i = paramArrayOfBoolean1.length;
          k = paramArrayOfBoolean2.length;
          if (i == k) {
            break;
          }
          setEquals(false);
        }
      }
    }
    int m = 0;
    for (;;)
    {
      i = paramArrayOfBoolean1.length;
      if (m >= i) {
        break;
      }
      boolean bool2 = this.isEquals;
      if (!bool2) {
        break;
      }
      int j = paramArrayOfBoolean1[m];
      k = paramArrayOfBoolean2[m];
      append(j, k);
      m += 1;
    }
  }
  
  public EqualsBuilder appendSuper(boolean paramBoolean)
  {
    boolean bool = this.isEquals;
    if (!bool) {}
    for (;;)
    {
      return this;
      this.isEquals = paramBoolean;
    }
  }
  
  public boolean isEquals()
  {
    return this.isEquals;
  }
  
  public void reset()
  {
    this.isEquals = true;
  }
  
  protected void setEquals(boolean paramBoolean)
  {
    this.isEquals = paramBoolean;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/builder/EqualsBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */