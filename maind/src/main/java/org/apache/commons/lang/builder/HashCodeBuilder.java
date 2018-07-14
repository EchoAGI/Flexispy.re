package org.apache.commons.lang.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang.ArrayUtils;

public class HashCodeBuilder
{
  private static final ThreadLocal REGISTRY;
  static Class class$org$apache$commons$lang$builder$HashCodeBuilder;
  private final int iConstant;
  private int iTotal;
  
  static
  {
    ThreadLocal localThreadLocal = new java/lang/ThreadLocal;
    localThreadLocal.<init>();
    REGISTRY = localThreadLocal;
  }
  
  public HashCodeBuilder()
  {
    this.iTotal = 0;
    this.iConstant = 37;
    this.iTotal = 17;
  }
  
  public HashCodeBuilder(int paramInt1, int paramInt2)
  {
    int i = 0;
    IllegalArgumentException localIllegalArgumentException = null;
    this.iTotal = 0;
    if (paramInt1 == 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("HashCodeBuilder requires a non zero initial value");
      throw localIllegalArgumentException;
    }
    i = paramInt1 % 2;
    if (i == 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("HashCodeBuilder requires an odd initial value");
      throw localIllegalArgumentException;
    }
    if (paramInt2 == 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("HashCodeBuilder requires a non zero multiplier");
      throw localIllegalArgumentException;
    }
    i = paramInt2 % 2;
    if (i == 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("HashCodeBuilder requires an odd multiplier");
      throw localIllegalArgumentException;
    }
    this.iConstant = paramInt2;
    this.iTotal = paramInt1;
  }
  
  static Class class$(String paramString)
  {
    try
    {
      return Class.forName(paramString);
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      NoClassDefFoundError localNoClassDefFoundError = new java/lang/NoClassDefFoundError;
      String str = localClassNotFoundException.getMessage();
      localNoClassDefFoundError.<init>(str);
      throw localNoClassDefFoundError;
    }
  }
  
  static Set getRegistry()
  {
    return (Set)REGISTRY.get();
  }
  
  static boolean isRegistered(Object paramObject)
  {
    Set localSet = getRegistry();
    IDKey localIDKey;
    boolean bool;
    if (localSet != null)
    {
      localIDKey = new org/apache/commons/lang/builder/IDKey;
      localIDKey.<init>(paramObject);
      bool = localSet.contains(localIDKey);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localIDKey = null;
    }
  }
  
  private static void reflectionAppend(Object paramObject, Class paramClass, HashCodeBuilder paramHashCodeBuilder, boolean paramBoolean, String[] paramArrayOfString)
  {
    boolean bool1 = isRegistered(paramObject);
    if (bool1) {}
    for (;;)
    {
      return;
      try
      {
        register(paramObject);
        Field[] arrayOfField = paramClass.getDeclaredFields();
        bool1 = true;
        AccessibleObject.setAccessible(arrayOfField, bool1);
        int m = 0;
        for (;;)
        {
          int i = arrayOfField.length;
          if (m < i)
          {
            Field localField = arrayOfField[m];
            Object localObject1 = localField.getName();
            boolean bool2 = ArrayUtils.contains(paramArrayOfString, localObject1);
            if (!bool2)
            {
              localObject1 = localField.getName();
              int n = 36;
              int j = ((String)localObject1).indexOf(n);
              n = -1;
              if (j == n) {
                if (!paramBoolean)
                {
                  j = localField.getModifiers();
                  boolean bool3 = Modifier.isTransient(j);
                  if (bool3) {}
                }
                else
                {
                  int k = localField.getModifiers();
                  boolean bool4 = Modifier.isStatic(k);
                  if (bool4) {}
                }
              }
            }
            try
            {
              Object localObject3 = localField.get(paramObject);
              paramHashCodeBuilder.append(localObject3);
              m += 1;
            }
            catch (IllegalAccessException localIllegalAccessException)
            {
              localObject1 = new java/lang/InternalError;
              String str = "Unexpected IllegalAccessException";
              ((InternalError)localObject1).<init>(str);
              throw ((Throwable)localObject1);
            }
          }
        }
      }
      finally
      {
        unregister(paramObject);
      }
    }
  }
  
  public static int reflectionHashCode(int paramInt1, int paramInt2, Object paramObject)
  {
    return reflectionHashCode(paramInt1, paramInt2, paramObject, false, null, null);
  }
  
  public static int reflectionHashCode(int paramInt1, int paramInt2, Object paramObject, boolean paramBoolean)
  {
    return reflectionHashCode(paramInt1, paramInt2, paramObject, paramBoolean, null, null);
  }
  
  public static int reflectionHashCode(int paramInt1, int paramInt2, Object paramObject, boolean paramBoolean, Class paramClass)
  {
    return reflectionHashCode(paramInt1, paramInt2, paramObject, paramBoolean, paramClass, null);
  }
  
  public static int reflectionHashCode(int paramInt1, int paramInt2, Object paramObject, boolean paramBoolean, Class paramClass, String[] paramArrayOfString)
  {
    Object localObject;
    if (paramObject == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("The object to build a hash code for must not be null");
      throw ((Throwable)localObject);
    }
    HashCodeBuilder localHashCodeBuilder = new org/apache/commons/lang/builder/HashCodeBuilder;
    localHashCodeBuilder.<init>(paramInt1, paramInt2);
    Class localClass = paramObject.getClass();
    reflectionAppend(paramObject, localClass, localHashCodeBuilder, paramBoolean, paramArrayOfString);
    for (;;)
    {
      localObject = localClass.getSuperclass();
      if ((localObject == null) || (localClass == paramClass)) {
        break;
      }
      localClass = localClass.getSuperclass();
      reflectionAppend(paramObject, localClass, localHashCodeBuilder, paramBoolean, paramArrayOfString);
    }
    return localHashCodeBuilder.toHashCode();
  }
  
  public static int reflectionHashCode(Object paramObject)
  {
    return reflectionHashCode(17, 37, paramObject, false, null, null);
  }
  
  public static int reflectionHashCode(Object paramObject, Collection paramCollection)
  {
    String[] arrayOfString = ReflectionToStringBuilder.toNoNullStringArray(paramCollection);
    return reflectionHashCode(paramObject, arrayOfString);
  }
  
  public static int reflectionHashCode(Object paramObject, boolean paramBoolean)
  {
    return reflectionHashCode(17, 37, paramObject, paramBoolean, null, null);
  }
  
  public static int reflectionHashCode(Object paramObject, String[] paramArrayOfString)
  {
    return reflectionHashCode(17, 37, paramObject, false, null, paramArrayOfString);
  }
  
  static void register(Object paramObject)
  {
    localObject1 = class$org$apache$commons$lang$builder$HashCodeBuilder;
    if (localObject1 == null)
    {
      localObject1 = class$("org.apache.commons.lang.builder.HashCodeBuilder");
      class$org$apache$commons$lang$builder$HashCodeBuilder = (Class)localObject1;
    }
    for (;;)
    {
      try
      {
        Object localObject2 = getRegistry();
        if (localObject2 == null)
        {
          localObject2 = REGISTRY;
          HashSet localHashSet = new java/util/HashSet;
          localHashSet.<init>();
          ((ThreadLocal)localObject2).set(localHashSet);
        }
        localObject1 = getRegistry();
        localObject2 = new org/apache/commons/lang/builder/IDKey;
        ((IDKey)localObject2).<init>(paramObject);
        ((Set)localObject1).add(localObject2);
        return;
      }
      finally {}
      localObject1 = class$org$apache$commons$lang$builder$HashCodeBuilder;
    }
  }
  
  static void unregister(Object paramObject)
  {
    Set localSet = getRegistry();
    if (localSet != null)
    {
      localObject1 = new org/apache/commons/lang/builder/IDKey;
      ((IDKey)localObject1).<init>(paramObject);
      localSet.remove(localObject1);
      localObject1 = class$org$apache$commons$lang$builder$HashCodeBuilder;
      if (localObject1 != null) {
        break label78;
      }
      localObject1 = class$("org.apache.commons.lang.builder.HashCodeBuilder");
      class$org$apache$commons$lang$builder$HashCodeBuilder = (Class)localObject1;
    }
    for (;;)
    {
      label78:
      try
      {
        localSet = getRegistry();
        if (localSet != null)
        {
          boolean bool = localSet.isEmpty();
          if (bool)
          {
            ThreadLocal localThreadLocal = REGISTRY;
            localThreadLocal.set(null);
          }
        }
        return;
      }
      finally {}
      localObject1 = class$org$apache$commons$lang$builder$HashCodeBuilder;
    }
  }
  
  public HashCodeBuilder append(byte paramByte)
  {
    int i = this.iTotal;
    int j = this.iConstant;
    i = i * j + paramByte;
    this.iTotal = i;
    return this;
  }
  
  public HashCodeBuilder append(char paramChar)
  {
    int i = this.iTotal;
    int j = this.iConstant;
    i = i * j + paramChar;
    this.iTotal = i;
    return this;
  }
  
  public HashCodeBuilder append(double paramDouble)
  {
    long l = Double.doubleToLongBits(paramDouble);
    return append(l);
  }
  
  public HashCodeBuilder append(float paramFloat)
  {
    int i = this.iTotal;
    int j = this.iConstant;
    i *= j;
    j = Float.floatToIntBits(paramFloat);
    i += j;
    this.iTotal = i;
    return this;
  }
  
  public HashCodeBuilder append(int paramInt)
  {
    int i = this.iTotal;
    int j = this.iConstant;
    i = i * j + paramInt;
    this.iTotal = i;
    return this;
  }
  
  public HashCodeBuilder append(long paramLong)
  {
    int i = this.iTotal;
    int j = this.iConstant;
    i *= j;
    j = (int)(paramLong >> 32 ^ paramLong);
    i += j;
    this.iTotal = i;
    return this;
  }
  
  public HashCodeBuilder append(Object paramObject)
  {
    int k;
    if (paramObject == null)
    {
      int i = this.iTotal;
      k = this.iConstant;
      i *= k;
      this.iTotal = i;
    }
    for (;;)
    {
      return this;
      Class localClass = paramObject.getClass();
      boolean bool = localClass.isArray();
      if (bool)
      {
        bool = paramObject instanceof long[];
        if (bool)
        {
          paramObject = (long[])paramObject;
          append((long[])paramObject);
        }
        else
        {
          bool = paramObject instanceof int[];
          if (bool)
          {
            paramObject = (int[])paramObject;
            append((int[])paramObject);
          }
          else
          {
            bool = paramObject instanceof short[];
            if (bool)
            {
              paramObject = (short[])paramObject;
              append((short[])paramObject);
            }
            else
            {
              bool = paramObject instanceof char[];
              if (bool)
              {
                paramObject = (char[])paramObject;
                append((char[])paramObject);
              }
              else
              {
                bool = paramObject instanceof byte[];
                if (bool)
                {
                  paramObject = (byte[])paramObject;
                  append((byte[])paramObject);
                }
                else
                {
                  bool = paramObject instanceof double[];
                  if (bool)
                  {
                    paramObject = (double[])paramObject;
                    append((double[])paramObject);
                  }
                  else
                  {
                    bool = paramObject instanceof float[];
                    if (bool)
                    {
                      paramObject = (float[])paramObject;
                      append((float[])paramObject);
                    }
                    else
                    {
                      bool = paramObject instanceof boolean[];
                      if (bool)
                      {
                        paramObject = (boolean[])paramObject;
                        append((boolean[])paramObject);
                      }
                      else
                      {
                        paramObject = (Object[])paramObject;
                        append((Object[])paramObject);
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
        int j = this.iTotal;
        k = this.iConstant;
        j *= k;
        k = paramObject.hashCode();
        j += k;
        this.iTotal = j;
      }
    }
  }
  
  public HashCodeBuilder append(short paramShort)
  {
    int i = this.iTotal;
    int j = this.iConstant;
    i = i * j + paramShort;
    this.iTotal = i;
    return this;
  }
  
  public HashCodeBuilder append(boolean paramBoolean)
  {
    int i = this.iTotal;
    int j = this.iConstant * i;
    if (paramBoolean) {}
    for (i = 0;; i = 1)
    {
      i += j;
      this.iTotal = i;
      return this;
    }
  }
  
  public HashCodeBuilder append(byte[] paramArrayOfByte)
  {
    int i;
    if (paramArrayOfByte == null)
    {
      i = this.iTotal;
      int j = this.iConstant;
      i *= j;
      this.iTotal = i;
      return this;
    }
    int k = 0;
    for (;;)
    {
      i = paramArrayOfByte.length;
      if (k >= i) {
        break;
      }
      i = paramArrayOfByte[k];
      append(i);
      int m;
      k += 1;
    }
  }
  
  public HashCodeBuilder append(char[] paramArrayOfChar)
  {
    int i;
    if (paramArrayOfChar == null)
    {
      i = this.iTotal;
      int j = this.iConstant;
      i *= j;
      this.iTotal = i;
      return this;
    }
    int k = 0;
    for (;;)
    {
      i = paramArrayOfChar.length;
      if (k >= i) {
        break;
      }
      i = paramArrayOfChar[k];
      append(i);
      int m;
      k += 1;
    }
  }
  
  public HashCodeBuilder append(double[] paramArrayOfDouble)
  {
    int i;
    if (paramArrayOfDouble == null)
    {
      i = this.iTotal;
      int j = this.iConstant;
      i *= j;
      this.iTotal = i;
      return this;
    }
    int k = 0;
    for (;;)
    {
      i = paramArrayOfDouble.length;
      if (k >= i) {
        break;
      }
      double d = paramArrayOfDouble[k];
      append(d);
      k += 1;
    }
  }
  
  public HashCodeBuilder append(float[] paramArrayOfFloat)
  {
    int i;
    if (paramArrayOfFloat == null)
    {
      i = this.iTotal;
      int j = this.iConstant;
      i *= j;
      this.iTotal = i;
      return this;
    }
    int k = 0;
    for (;;)
    {
      i = paramArrayOfFloat.length;
      if (k >= i) {
        break;
      }
      float f = paramArrayOfFloat[k];
      append(f);
      k += 1;
    }
  }
  
  public HashCodeBuilder append(int[] paramArrayOfInt)
  {
    int i;
    if (paramArrayOfInt == null)
    {
      i = this.iTotal;
      int j = this.iConstant;
      i *= j;
      this.iTotal = i;
      return this;
    }
    int k = 0;
    for (;;)
    {
      i = paramArrayOfInt.length;
      if (k >= i) {
        break;
      }
      i = paramArrayOfInt[k];
      append(i);
      k += 1;
    }
  }
  
  public HashCodeBuilder append(long[] paramArrayOfLong)
  {
    int i;
    if (paramArrayOfLong == null)
    {
      i = this.iTotal;
      int j = this.iConstant;
      i *= j;
      this.iTotal = i;
      return this;
    }
    int k = 0;
    for (;;)
    {
      i = paramArrayOfLong.length;
      if (k >= i) {
        break;
      }
      long l = paramArrayOfLong[k];
      append(l);
      k += 1;
    }
  }
  
  public HashCodeBuilder append(Object[] paramArrayOfObject)
  {
    int i;
    if (paramArrayOfObject == null)
    {
      i = this.iTotal;
      int j = this.iConstant;
      i *= j;
      this.iTotal = i;
      return this;
    }
    int k = 0;
    for (;;)
    {
      i = paramArrayOfObject.length;
      if (k >= i) {
        break;
      }
      Object localObject = paramArrayOfObject[k];
      append(localObject);
      k += 1;
    }
  }
  
  public HashCodeBuilder append(short[] paramArrayOfShort)
  {
    int i;
    if (paramArrayOfShort == null)
    {
      i = this.iTotal;
      int j = this.iConstant;
      i *= j;
      this.iTotal = i;
      return this;
    }
    int k = 0;
    for (;;)
    {
      i = paramArrayOfShort.length;
      if (k >= i) {
        break;
      }
      i = paramArrayOfShort[k];
      append(i);
      int m;
      k += 1;
    }
  }
  
  public HashCodeBuilder append(boolean[] paramArrayOfBoolean)
  {
    int i;
    if (paramArrayOfBoolean == null)
    {
      i = this.iTotal;
      int j = this.iConstant;
      i *= j;
      this.iTotal = i;
      return this;
    }
    int k = 0;
    for (;;)
    {
      i = paramArrayOfBoolean.length;
      if (k >= i) {
        break;
      }
      i = paramArrayOfBoolean[k];
      append(i);
      int m;
      k += 1;
    }
  }
  
  public HashCodeBuilder appendSuper(int paramInt)
  {
    int i = this.iTotal;
    int j = this.iConstant;
    i = i * j + paramInt;
    this.iTotal = i;
    return this;
  }
  
  public int hashCode()
  {
    return toHashCode();
  }
  
  public int toHashCode()
  {
    return this.iTotal;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/builder/HashCodeBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */