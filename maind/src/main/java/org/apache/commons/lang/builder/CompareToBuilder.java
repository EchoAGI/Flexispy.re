package org.apache.commons.lang.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Comparator;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.math.NumberUtils;

public class CompareToBuilder
{
  private int comparison = 0;
  
  private static void reflectionAppend(Object paramObject1, Object paramObject2, Class paramClass, CompareToBuilder paramCompareToBuilder, boolean paramBoolean, String[] paramArrayOfString)
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
        i = paramCompareToBuilder.comparison;
        if (i == 0)
        {
          Field localField = arrayOfField[k];
          Object localObject1 = localField.getName();
          boolean bool2 = ArrayUtils.contains(paramArrayOfString, localObject1);
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
            paramCompareToBuilder.append(localObject1, localObject2);
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
  
  public static int reflectionCompare(Object paramObject1, Object paramObject2)
  {
    return reflectionCompare(paramObject1, paramObject2, false, null, null);
  }
  
  public static int reflectionCompare(Object paramObject1, Object paramObject2, Collection paramCollection)
  {
    String[] arrayOfString = ReflectionToStringBuilder.toNoNullStringArray(paramCollection);
    return reflectionCompare(paramObject1, paramObject2, arrayOfString);
  }
  
  public static int reflectionCompare(Object paramObject1, Object paramObject2, boolean paramBoolean)
  {
    return reflectionCompare(paramObject1, paramObject2, paramBoolean, null, null);
  }
  
  public static int reflectionCompare(Object paramObject1, Object paramObject2, boolean paramBoolean, Class paramClass)
  {
    return reflectionCompare(paramObject1, paramObject2, false, paramClass, null);
  }
  
  public static int reflectionCompare(Object paramObject1, Object paramObject2, boolean paramBoolean, Class paramClass, String[] paramArrayOfString)
  {
    int i;
    Object localObject;
    if (paramObject1 == paramObject2)
    {
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return i;
      if ((paramObject1 == null) || (paramObject2 == null))
      {
        localObject = new java/lang/NullPointerException;
        ((NullPointerException)localObject).<init>();
        throw ((Throwable)localObject);
      }
      Class localClass = paramObject1.getClass();
      boolean bool = localClass.isInstance(paramObject2);
      if (!bool)
      {
        localObject = new java/lang/ClassCastException;
        ((ClassCastException)localObject).<init>();
        throw ((Throwable)localObject);
      }
      CompareToBuilder localCompareToBuilder = new org/apache/commons/lang/builder/CompareToBuilder;
      localCompareToBuilder.<init>();
      localObject = paramObject1;
      reflectionAppend(paramObject1, paramObject2, localClass, localCompareToBuilder, paramBoolean, paramArrayOfString);
      for (;;)
      {
        localObject = localClass.getSuperclass();
        if ((localObject == null) || (localClass == paramClass)) {
          break;
        }
        localClass = localClass.getSuperclass();
        localObject = paramObject1;
        reflectionAppend(paramObject1, paramObject2, localClass, localCompareToBuilder, paramBoolean, paramArrayOfString);
      }
      int j = localCompareToBuilder.toComparison();
    }
  }
  
  public static int reflectionCompare(Object paramObject1, Object paramObject2, String[] paramArrayOfString)
  {
    return reflectionCompare(paramObject1, paramObject2, false, null, paramArrayOfString);
  }
  
  public CompareToBuilder append(byte paramByte1, byte paramByte2)
  {
    int i = this.comparison;
    if (i != 0) {
      return this;
    }
    if (paramByte1 < paramByte2) {
      i = -1;
    }
    for (;;)
    {
      this.comparison = i;
      break;
      if (paramByte1 > paramByte2) {
        i = 1;
      } else {
        i = 0;
      }
    }
  }
  
  public CompareToBuilder append(char paramChar1, char paramChar2)
  {
    int i = this.comparison;
    if (i != 0) {
      return this;
    }
    if (paramChar1 < paramChar2) {
      i = -1;
    }
    for (;;)
    {
      this.comparison = i;
      break;
      if (paramChar1 > paramChar2) {
        i = 1;
      } else {
        i = 0;
      }
    }
  }
  
  public CompareToBuilder append(double paramDouble1, double paramDouble2)
  {
    int i = this.comparison;
    if (i != 0) {}
    for (;;)
    {
      return this;
      i = NumberUtils.compare(paramDouble1, paramDouble2);
      this.comparison = i;
    }
  }
  
  public CompareToBuilder append(float paramFloat1, float paramFloat2)
  {
    int i = this.comparison;
    if (i != 0) {}
    for (;;)
    {
      return this;
      i = NumberUtils.compare(paramFloat1, paramFloat2);
      this.comparison = i;
    }
  }
  
  public CompareToBuilder append(int paramInt1, int paramInt2)
  {
    int i = this.comparison;
    if (i != 0) {
      return this;
    }
    if (paramInt1 < paramInt2) {
      i = -1;
    }
    for (;;)
    {
      this.comparison = i;
      break;
      if (paramInt1 > paramInt2) {
        i = 1;
      } else {
        i = 0;
      }
    }
  }
  
  public CompareToBuilder append(long paramLong1, long paramLong2)
  {
    int i = this.comparison;
    if (i != 0) {
      return this;
    }
    boolean bool1 = paramLong1 < paramLong2;
    int j;
    if (bool1) {
      j = -1;
    }
    for (;;)
    {
      this.comparison = j;
      break;
      boolean bool2 = paramLong1 < paramLong2;
      if (bool2) {
        bool2 = true;
      } else {
        bool2 = false;
      }
    }
  }
  
  public CompareToBuilder append(Object paramObject1, Object paramObject2)
  {
    return append(paramObject1, paramObject2, null);
  }
  
  public CompareToBuilder append(Object paramObject1, Object paramObject2, Comparator paramComparator)
  {
    int i = this.comparison;
    if (i != 0) {}
    for (;;)
    {
      return this;
      if (paramObject1 != paramObject2) {
        if (paramObject1 == null)
        {
          i = -1;
          this.comparison = i;
        }
        else if (paramObject2 == null)
        {
          i = 1;
          this.comparison = i;
        }
        else
        {
          Class localClass = paramObject1.getClass();
          boolean bool = localClass.isArray();
          if (bool)
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
                            append((Object[])paramObject1, (Object[])paramObject2, paramComparator);
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          else
          {
            int j;
            if (paramComparator == null)
            {
              paramObject1 = (Comparable)paramObject1;
              j = ((Comparable)paramObject1).compareTo(paramObject2);
              this.comparison = j;
            }
            else
            {
              j = paramComparator.compare(paramObject1, paramObject2);
              this.comparison = j;
            }
          }
        }
      }
    }
  }
  
  public CompareToBuilder append(short paramShort1, short paramShort2)
  {
    int i = this.comparison;
    if (i != 0) {
      return this;
    }
    if (paramShort1 < paramShort2) {
      i = -1;
    }
    for (;;)
    {
      this.comparison = i;
      break;
      if (paramShort1 > paramShort2) {
        i = 1;
      } else {
        i = 0;
      }
    }
  }
  
  public CompareToBuilder append(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = this.comparison;
    if (i != 0) {}
    for (;;)
    {
      return this;
      if (paramBoolean1 != paramBoolean2) {
        if (!paramBoolean1)
        {
          i = -1;
          this.comparison = i;
        }
        else
        {
          i = 1;
          this.comparison = i;
        }
      }
    }
  }
  
  public CompareToBuilder append(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = 1;
    int j = -1;
    int k = this.comparison;
    if (k != 0) {}
    for (;;)
    {
      return this;
      if (paramArrayOfByte1 != paramArrayOfByte2) {
        if (paramArrayOfByte1 == null)
        {
          this.comparison = j;
        }
        else
        {
          if (paramArrayOfByte2 != null) {
            break;
          }
          this.comparison = i;
        }
      }
    }
    k = paramArrayOfByte1.length;
    int m = paramArrayOfByte2.length;
    if (k != m)
    {
      k = paramArrayOfByte1.length;
      m = paramArrayOfByte2.length;
      if (k < m) {}
      for (;;)
      {
        this.comparison = j;
        break;
        j = i;
      }
    }
    int n = 0;
    for (;;)
    {
      j = paramArrayOfByte1.length;
      if (n >= j) {
        break;
      }
      j = this.comparison;
      if (j != 0) {
        break;
      }
      j = paramArrayOfByte1[n];
      i = paramArrayOfByte2[n];
      append(j, i);
      int i1;
      n += 1;
    }
  }
  
  public CompareToBuilder append(char[] paramArrayOfChar1, char[] paramArrayOfChar2)
  {
    int i = 1;
    int j = -1;
    int k = this.comparison;
    if (k != 0) {}
    for (;;)
    {
      return this;
      if (paramArrayOfChar1 != paramArrayOfChar2) {
        if (paramArrayOfChar1 == null)
        {
          this.comparison = j;
        }
        else
        {
          if (paramArrayOfChar2 != null) {
            break;
          }
          this.comparison = i;
        }
      }
    }
    k = paramArrayOfChar1.length;
    int m = paramArrayOfChar2.length;
    if (k != m)
    {
      k = paramArrayOfChar1.length;
      m = paramArrayOfChar2.length;
      if (k < m) {}
      for (;;)
      {
        this.comparison = j;
        break;
        j = i;
      }
    }
    int n = 0;
    for (;;)
    {
      j = paramArrayOfChar1.length;
      if (n >= j) {
        break;
      }
      j = this.comparison;
      if (j != 0) {
        break;
      }
      j = paramArrayOfChar1[n];
      i = paramArrayOfChar2[n];
      append(j, i);
      int i1;
      n += 1;
    }
  }
  
  public CompareToBuilder append(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    int i = 1;
    int j = -1;
    int k = this.comparison;
    if (k != 0) {}
    for (;;)
    {
      return this;
      if (paramArrayOfDouble1 != paramArrayOfDouble2) {
        if (paramArrayOfDouble1 == null)
        {
          this.comparison = j;
        }
        else
        {
          if (paramArrayOfDouble2 != null) {
            break;
          }
          this.comparison = i;
        }
      }
    }
    k = paramArrayOfDouble1.length;
    int m = paramArrayOfDouble2.length;
    if (k != m)
    {
      k = paramArrayOfDouble1.length;
      m = paramArrayOfDouble2.length;
      if (k < m) {}
      for (;;)
      {
        this.comparison = j;
        break;
        j = i;
      }
    }
    int n = 0;
    for (;;)
    {
      j = paramArrayOfDouble1.length;
      if (n >= j) {
        break;
      }
      j = this.comparison;
      if (j != 0) {
        break;
      }
      double d1 = paramArrayOfDouble1[n];
      double d2 = paramArrayOfDouble2[n];
      append(d1, d2);
      n += 1;
    }
  }
  
  public CompareToBuilder append(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    int j = -1;
    float f2 = 0.0F / 0.0F;
    int k = this.comparison;
    if (k != 0) {}
    for (;;)
    {
      return this;
      if (paramArrayOfFloat1 != paramArrayOfFloat2) {
        if (paramArrayOfFloat1 == null)
        {
          this.comparison = j;
        }
        else
        {
          if (paramArrayOfFloat2 != null) {
            break;
          }
          this.comparison = i;
        }
      }
    }
    k = paramArrayOfFloat1.length;
    int m = paramArrayOfFloat2.length;
    if (k != m)
    {
      k = paramArrayOfFloat1.length;
      m = paramArrayOfFloat2.length;
      if (k < m) {}
      for (;;)
      {
        this.comparison = j;
        break;
        j = i;
        f2 = f1;
      }
    }
    int n = 0;
    for (;;)
    {
      j = paramArrayOfFloat1.length;
      if (n >= j) {
        break;
      }
      j = this.comparison;
      if (j != 0) {
        break;
      }
      f2 = paramArrayOfFloat1[n];
      f1 = paramArrayOfFloat2[n];
      append(f2, f1);
      n += 1;
    }
  }
  
  public CompareToBuilder append(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    int i = 1;
    int j = -1;
    int k = this.comparison;
    if (k != 0) {}
    for (;;)
    {
      return this;
      if (paramArrayOfInt1 != paramArrayOfInt2) {
        if (paramArrayOfInt1 == null)
        {
          this.comparison = j;
        }
        else
        {
          if (paramArrayOfInt2 != null) {
            break;
          }
          this.comparison = i;
        }
      }
    }
    k = paramArrayOfInt1.length;
    int m = paramArrayOfInt2.length;
    if (k != m)
    {
      k = paramArrayOfInt1.length;
      m = paramArrayOfInt2.length;
      if (k < m) {}
      for (;;)
      {
        this.comparison = j;
        break;
        j = i;
      }
    }
    int n = 0;
    for (;;)
    {
      j = paramArrayOfInt1.length;
      if (n >= j) {
        break;
      }
      j = this.comparison;
      if (j != 0) {
        break;
      }
      j = paramArrayOfInt1[n];
      i = paramArrayOfInt2[n];
      append(j, i);
      n += 1;
    }
  }
  
  public CompareToBuilder append(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    int i = 1;
    int j = -1;
    int k = this.comparison;
    if (k != 0) {}
    for (;;)
    {
      return this;
      if (paramArrayOfLong1 != paramArrayOfLong2) {
        if (paramArrayOfLong1 == null)
        {
          this.comparison = j;
        }
        else
        {
          if (paramArrayOfLong2 != null) {
            break;
          }
          this.comparison = i;
        }
      }
    }
    k = paramArrayOfLong1.length;
    int m = paramArrayOfLong2.length;
    if (k != m)
    {
      k = paramArrayOfLong1.length;
      m = paramArrayOfLong2.length;
      if (k < m) {}
      for (;;)
      {
        this.comparison = j;
        break;
        j = i;
      }
    }
    int n = 0;
    for (;;)
    {
      j = paramArrayOfLong1.length;
      if (n >= j) {
        break;
      }
      j = this.comparison;
      if (j != 0) {
        break;
      }
      long l1 = paramArrayOfLong1[n];
      long l2 = paramArrayOfLong2[n];
      append(l1, l2);
      n += 1;
    }
  }
  
  public CompareToBuilder append(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    return append(paramArrayOfObject1, paramArrayOfObject2, null);
  }
  
  public CompareToBuilder append(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2, Comparator paramComparator)
  {
    int i = 1;
    int j = -1;
    int k = this.comparison;
    if (k != 0) {}
    for (;;)
    {
      return this;
      if (paramArrayOfObject1 != paramArrayOfObject2) {
        if (paramArrayOfObject1 == null)
        {
          this.comparison = j;
        }
        else
        {
          if (paramArrayOfObject2 != null) {
            break;
          }
          this.comparison = i;
        }
      }
    }
    k = paramArrayOfObject1.length;
    int m = paramArrayOfObject2.length;
    if (k != m)
    {
      k = paramArrayOfObject1.length;
      m = paramArrayOfObject2.length;
      if (k < m) {}
      for (;;)
      {
        this.comparison = j;
        break;
        j = i;
      }
    }
    int n = 0;
    for (;;)
    {
      j = paramArrayOfObject1.length;
      if (n >= j) {
        break;
      }
      j = this.comparison;
      if (j != 0) {
        break;
      }
      Object localObject1 = paramArrayOfObject1[n];
      Object localObject2 = paramArrayOfObject2[n];
      append(localObject1, localObject2, paramComparator);
      n += 1;
    }
  }
  
  public CompareToBuilder append(short[] paramArrayOfShort1, short[] paramArrayOfShort2)
  {
    int i = 1;
    int j = -1;
    int k = this.comparison;
    if (k != 0) {}
    for (;;)
    {
      return this;
      if (paramArrayOfShort1 != paramArrayOfShort2) {
        if (paramArrayOfShort1 == null)
        {
          this.comparison = j;
        }
        else
        {
          if (paramArrayOfShort2 != null) {
            break;
          }
          this.comparison = i;
        }
      }
    }
    k = paramArrayOfShort1.length;
    int m = paramArrayOfShort2.length;
    if (k != m)
    {
      k = paramArrayOfShort1.length;
      m = paramArrayOfShort2.length;
      if (k < m) {}
      for (;;)
      {
        this.comparison = j;
        break;
        j = i;
      }
    }
    int n = 0;
    for (;;)
    {
      j = paramArrayOfShort1.length;
      if (n >= j) {
        break;
      }
      j = this.comparison;
      if (j != 0) {
        break;
      }
      j = paramArrayOfShort1[n];
      i = paramArrayOfShort2[n];
      append(j, i);
      int i1;
      n += 1;
    }
  }
  
  public CompareToBuilder append(boolean[] paramArrayOfBoolean1, boolean[] paramArrayOfBoolean2)
  {
    int i = 1;
    int j = -1;
    int k = this.comparison;
    if (k != 0) {}
    for (;;)
    {
      return this;
      if (paramArrayOfBoolean1 != paramArrayOfBoolean2) {
        if (paramArrayOfBoolean1 == null)
        {
          this.comparison = j;
        }
        else
        {
          if (paramArrayOfBoolean2 != null) {
            break;
          }
          this.comparison = i;
        }
      }
    }
    k = paramArrayOfBoolean1.length;
    int m = paramArrayOfBoolean2.length;
    if (k != m)
    {
      k = paramArrayOfBoolean1.length;
      m = paramArrayOfBoolean2.length;
      if (k < m) {}
      for (;;)
      {
        this.comparison = j;
        break;
        j = i;
      }
    }
    int n = 0;
    for (;;)
    {
      j = paramArrayOfBoolean1.length;
      if (n >= j) {
        break;
      }
      j = this.comparison;
      if (j != 0) {
        break;
      }
      j = paramArrayOfBoolean1[n];
      i = paramArrayOfBoolean2[n];
      append(j, i);
      int i1;
      n += 1;
    }
  }
  
  public CompareToBuilder appendSuper(int paramInt)
  {
    int i = this.comparison;
    if (i != 0) {}
    for (;;)
    {
      return this;
      this.comparison = paramInt;
    }
  }
  
  public int toComparison()
  {
    return this.comparison;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/builder/CompareToBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */