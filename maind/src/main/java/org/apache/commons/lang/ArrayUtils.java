package org.apache.commons.lang;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class ArrayUtils
{
  public static final boolean[] EMPTY_BOOLEAN_ARRAY;
  public static final Boolean[] EMPTY_BOOLEAN_OBJECT_ARRAY;
  public static final byte[] EMPTY_BYTE_ARRAY;
  public static final Byte[] EMPTY_BYTE_OBJECT_ARRAY;
  public static final Character[] EMPTY_CHARACTER_OBJECT_ARRAY = new Character[0];
  public static final char[] EMPTY_CHAR_ARRAY;
  public static final Class[] EMPTY_CLASS_ARRAY;
  public static final double[] EMPTY_DOUBLE_ARRAY;
  public static final Double[] EMPTY_DOUBLE_OBJECT_ARRAY;
  public static final float[] EMPTY_FLOAT_ARRAY;
  public static final Float[] EMPTY_FLOAT_OBJECT_ARRAY;
  public static final Integer[] EMPTY_INTEGER_OBJECT_ARRAY;
  public static final int[] EMPTY_INT_ARRAY;
  public static final long[] EMPTY_LONG_ARRAY;
  public static final Long[] EMPTY_LONG_OBJECT_ARRAY;
  public static final Object[] EMPTY_OBJECT_ARRAY = new Object[0];
  public static final short[] EMPTY_SHORT_ARRAY;
  public static final Short[] EMPTY_SHORT_OBJECT_ARRAY;
  public static final String[] EMPTY_STRING_ARRAY;
  public static final int INDEX_NOT_FOUND = 255;
  static Class class$java$lang$Object;
  
  static
  {
    EMPTY_CLASS_ARRAY = new Class[0];
    EMPTY_STRING_ARRAY = new String[0];
    EMPTY_LONG_ARRAY = new long[0];
    EMPTY_LONG_OBJECT_ARRAY = new Long[0];
    EMPTY_INT_ARRAY = new int[0];
    EMPTY_INTEGER_OBJECT_ARRAY = new Integer[0];
    EMPTY_SHORT_ARRAY = new short[0];
    EMPTY_SHORT_OBJECT_ARRAY = new Short[0];
    EMPTY_BYTE_ARRAY = new byte[0];
    EMPTY_BYTE_OBJECT_ARRAY = new Byte[0];
    EMPTY_DOUBLE_ARRAY = new double[0];
    EMPTY_DOUBLE_OBJECT_ARRAY = new Double[0];
    EMPTY_FLOAT_ARRAY = new float[0];
    EMPTY_FLOAT_OBJECT_ARRAY = new Float[0];
    EMPTY_BOOLEAN_ARRAY = new boolean[0];
    EMPTY_BOOLEAN_OBJECT_ARRAY = new Boolean[0];
    EMPTY_CHAR_ARRAY = new char[0];
  }
  
  private static Object add(Object paramObject1, int paramInt, Object paramObject2, Class paramClass)
  {
    int i = 0;
    Object localObject1 = null;
    IndexOutOfBoundsException localIndexOutOfBoundsException;
    int j;
    Object localObject2;
    if (paramObject1 == null)
    {
      if (paramInt != 0)
      {
        localIndexOutOfBoundsException = new java/lang/IndexOutOfBoundsException;
        localObject1 = new java/lang/StringBuffer;
        ((StringBuffer)localObject1).<init>();
        localObject1 = "Index: " + paramInt + ", Length: 0";
        localIndexOutOfBoundsException.<init>((String)localObject1);
        throw localIndexOutOfBoundsException;
      }
      j = 1;
      localObject2 = Array.newInstance(paramClass, j);
      Array.set(localObject2, 0, paramObject2);
    }
    for (;;)
    {
      return localObject2;
      int k = Array.getLength(paramObject1);
      if ((paramInt > k) || (paramInt < 0))
      {
        localIndexOutOfBoundsException = new java/lang/IndexOutOfBoundsException;
        localObject1 = new java/lang/StringBuffer;
        ((StringBuffer)localObject1).<init>();
        localObject1 = "Index: " + paramInt + ", Length: " + k;
        localIndexOutOfBoundsException.<init>((String)localObject1);
        throw localIndexOutOfBoundsException;
      }
      j = k + 1;
      Object localObject3 = Array.newInstance(paramClass, j);
      System.arraycopy(paramObject1, 0, localObject3, 0, paramInt);
      Array.set(localObject3, paramInt, paramObject2);
      if (paramInt < k)
      {
        j = paramInt + 1;
        i = k - paramInt;
        System.arraycopy(paramObject1, paramInt, localObject3, j, i);
      }
      localObject2 = localObject3;
    }
  }
  
  public static byte[] add(byte[] paramArrayOfByte, byte paramByte)
  {
    Object localObject1 = Byte.TYPE;
    localObject1 = (byte[])copyArrayGrow1(paramArrayOfByte, (Class)localObject1);
    Object localObject2 = localObject1;
    localObject2 = (byte[])localObject1;
    int i = localObject2.length + -1;
    localObject2[i] = paramByte;
    return (byte[])localObject2;
  }
  
  public static byte[] add(byte[] paramArrayOfByte, int paramInt, byte paramByte)
  {
    Byte localByte = new java/lang/Byte;
    localByte.<init>(paramByte);
    Class localClass = Byte.TYPE;
    return (byte[])add(paramArrayOfByte, paramInt, localByte, localClass);
  }
  
  public static char[] add(char[] paramArrayOfChar, char paramChar)
  {
    Object localObject1 = Character.TYPE;
    localObject1 = (char[])copyArrayGrow1(paramArrayOfChar, (Class)localObject1);
    Object localObject2 = localObject1;
    localObject2 = (char[])localObject1;
    int i = localObject2.length + -1;
    localObject2[i] = paramChar;
    return (char[])localObject2;
  }
  
  public static char[] add(char[] paramArrayOfChar, int paramInt, char paramChar)
  {
    Character localCharacter = new java/lang/Character;
    localCharacter.<init>(paramChar);
    Class localClass = Character.TYPE;
    return (char[])add(paramArrayOfChar, paramInt, localCharacter, localClass);
  }
  
  public static double[] add(double[] paramArrayOfDouble, double paramDouble)
  {
    Object localObject1 = Double.TYPE;
    localObject1 = (double[])copyArrayGrow1(paramArrayOfDouble, (Class)localObject1);
    Object localObject2 = localObject1;
    localObject2 = (double[])localObject1;
    int i = localObject2.length + -1;
    localObject2[i] = paramDouble;
    return (double[])localObject2;
  }
  
  public static double[] add(double[] paramArrayOfDouble, int paramInt, double paramDouble)
  {
    Double localDouble = new java/lang/Double;
    localDouble.<init>(paramDouble);
    Class localClass = Double.TYPE;
    return (double[])add(paramArrayOfDouble, paramInt, localDouble, localClass);
  }
  
  public static float[] add(float[] paramArrayOfFloat, float paramFloat)
  {
    Object localObject1 = Float.TYPE;
    localObject1 = (float[])copyArrayGrow1(paramArrayOfFloat, (Class)localObject1);
    Object localObject2 = localObject1;
    localObject2 = (float[])localObject1;
    int i = localObject2.length + -1;
    localObject2[i] = paramFloat;
    return (float[])localObject2;
  }
  
  public static float[] add(float[] paramArrayOfFloat, int paramInt, float paramFloat)
  {
    Float localFloat = new java/lang/Float;
    localFloat.<init>(paramFloat);
    Class localClass = Float.TYPE;
    return (float[])add(paramArrayOfFloat, paramInt, localFloat, localClass);
  }
  
  public static int[] add(int[] paramArrayOfInt, int paramInt)
  {
    Object localObject1 = Integer.TYPE;
    localObject1 = (int[])copyArrayGrow1(paramArrayOfInt, (Class)localObject1);
    Object localObject2 = localObject1;
    localObject2 = (int[])localObject1;
    int i = localObject2.length + -1;
    localObject2[i] = paramInt;
    return (int[])localObject2;
  }
  
  public static int[] add(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    Integer localInteger = new java/lang/Integer;
    localInteger.<init>(paramInt2);
    Class localClass = Integer.TYPE;
    return (int[])add(paramArrayOfInt, paramInt1, localInteger, localClass);
  }
  
  public static long[] add(long[] paramArrayOfLong, int paramInt, long paramLong)
  {
    Long localLong = new java/lang/Long;
    localLong.<init>(paramLong);
    Class localClass = Long.TYPE;
    return (long[])add(paramArrayOfLong, paramInt, localLong, localClass);
  }
  
  public static long[] add(long[] paramArrayOfLong, long paramLong)
  {
    Object localObject1 = Long.TYPE;
    localObject1 = (long[])copyArrayGrow1(paramArrayOfLong, (Class)localObject1);
    Object localObject2 = localObject1;
    localObject2 = (long[])localObject1;
    int i = localObject2.length + -1;
    localObject2[i] = paramLong;
    return (long[])localObject2;
  }
  
  public static Object[] add(Object[] paramArrayOfObject, int paramInt, Object paramObject)
  {
    Class localClass = null;
    Object localObject;
    if (paramArrayOfObject != null)
    {
      localObject = paramArrayOfObject.getClass();
      localClass = ((Class)localObject).getComponentType();
      localObject = (Object[])add(paramArrayOfObject, paramInt, paramObject, localClass);
    }
    for (;;)
    {
      return (Object[])localObject;
      if (paramObject != null)
      {
        localClass = paramObject.getClass();
        break;
      }
      int i = 1;
      localObject = new Object[i];
      localObject[0] = null;
    }
  }
  
  public static Object[] add(Object[] paramArrayOfObject, Object paramObject)
  {
    if (paramArrayOfObject != null) {}
    for (Class localClass = paramArrayOfObject.getClass();; localClass = paramObject.getClass())
    {
      localObject1 = (Object[])copyArrayGrow1(paramArrayOfObject, localClass);
      Object localObject2 = localObject1;
      localObject2 = (Object[])localObject1;
      int i = localObject2.length + -1;
      localObject2[i] = paramObject;
      return (Object[])localObject2;
      if (paramObject == null) {
        break;
      }
    }
    Object localObject1 = class$java$lang$Object;
    if (localObject1 == null)
    {
      localObject1 = "java.lang.Object";
      localClass = class$((String)localObject1);
      class$java$lang$Object = localClass;
    }
    for (;;)
    {
      break;
      localClass = class$java$lang$Object;
    }
  }
  
  public static short[] add(short[] paramArrayOfShort, int paramInt, short paramShort)
  {
    Short localShort = new java/lang/Short;
    localShort.<init>(paramShort);
    Class localClass = Short.TYPE;
    return (short[])add(paramArrayOfShort, paramInt, localShort, localClass);
  }
  
  public static short[] add(short[] paramArrayOfShort, short paramShort)
  {
    Object localObject1 = Short.TYPE;
    localObject1 = (short[])copyArrayGrow1(paramArrayOfShort, (Class)localObject1);
    Object localObject2 = localObject1;
    localObject2 = (short[])localObject1;
    int i = localObject2.length + -1;
    localObject2[i] = paramShort;
    return (short[])localObject2;
  }
  
  public static boolean[] add(boolean[] paramArrayOfBoolean, int paramInt, boolean paramBoolean)
  {
    Boolean localBoolean = BooleanUtils.toBooleanObject(paramBoolean);
    Class localClass = Boolean.TYPE;
    return (boolean[])add(paramArrayOfBoolean, paramInt, localBoolean, localClass);
  }
  
  public static boolean[] add(boolean[] paramArrayOfBoolean, boolean paramBoolean)
  {
    Object localObject1 = Boolean.TYPE;
    localObject1 = (boolean[])copyArrayGrow1(paramArrayOfBoolean, (Class)localObject1);
    Object localObject2 = localObject1;
    localObject2 = (boolean[])localObject1;
    int i = localObject2.length + -1;
    localObject2[i] = paramBoolean;
    return (boolean[])localObject2;
  }
  
  public static byte[] addAll(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte;
    if (paramArrayOfByte1 == null) {
      arrayOfByte = clone(paramArrayOfByte2);
    }
    for (;;)
    {
      return arrayOfByte;
      if (paramArrayOfByte2 == null)
      {
        arrayOfByte = clone(paramArrayOfByte1);
      }
      else
      {
        int i = paramArrayOfByte1.length;
        int j = paramArrayOfByte2.length;
        arrayOfByte = new byte[i + j];
        i = paramArrayOfByte1.length;
        System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 0, i);
        i = paramArrayOfByte1.length;
        j = paramArrayOfByte2.length;
        System.arraycopy(paramArrayOfByte2, 0, arrayOfByte, i, j);
      }
    }
  }
  
  public static char[] addAll(char[] paramArrayOfChar1, char[] paramArrayOfChar2)
  {
    char[] arrayOfChar;
    if (paramArrayOfChar1 == null) {
      arrayOfChar = clone(paramArrayOfChar2);
    }
    for (;;)
    {
      return arrayOfChar;
      if (paramArrayOfChar2 == null)
      {
        arrayOfChar = clone(paramArrayOfChar1);
      }
      else
      {
        int i = paramArrayOfChar1.length;
        int j = paramArrayOfChar2.length;
        arrayOfChar = new char[i + j];
        i = paramArrayOfChar1.length;
        System.arraycopy(paramArrayOfChar1, 0, arrayOfChar, 0, i);
        i = paramArrayOfChar1.length;
        j = paramArrayOfChar2.length;
        System.arraycopy(paramArrayOfChar2, 0, arrayOfChar, i, j);
      }
    }
  }
  
  public static double[] addAll(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    double[] arrayOfDouble;
    if (paramArrayOfDouble1 == null) {
      arrayOfDouble = clone(paramArrayOfDouble2);
    }
    for (;;)
    {
      return arrayOfDouble;
      if (paramArrayOfDouble2 == null)
      {
        arrayOfDouble = clone(paramArrayOfDouble1);
      }
      else
      {
        int i = paramArrayOfDouble1.length;
        int j = paramArrayOfDouble2.length;
        arrayOfDouble = new double[i + j];
        i = paramArrayOfDouble1.length;
        System.arraycopy(paramArrayOfDouble1, 0, arrayOfDouble, 0, i);
        i = paramArrayOfDouble1.length;
        j = paramArrayOfDouble2.length;
        System.arraycopy(paramArrayOfDouble2, 0, arrayOfDouble, i, j);
      }
    }
  }
  
  public static float[] addAll(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    float[] arrayOfFloat;
    if (paramArrayOfFloat1 == null) {
      arrayOfFloat = clone(paramArrayOfFloat2);
    }
    for (;;)
    {
      return arrayOfFloat;
      if (paramArrayOfFloat2 == null)
      {
        arrayOfFloat = clone(paramArrayOfFloat1);
      }
      else
      {
        int i = paramArrayOfFloat1.length;
        int j = paramArrayOfFloat2.length;
        arrayOfFloat = new float[i + j];
        i = paramArrayOfFloat1.length;
        System.arraycopy(paramArrayOfFloat1, 0, arrayOfFloat, 0, i);
        i = paramArrayOfFloat1.length;
        j = paramArrayOfFloat2.length;
        System.arraycopy(paramArrayOfFloat2, 0, arrayOfFloat, i, j);
      }
    }
  }
  
  public static int[] addAll(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    int[] arrayOfInt;
    if (paramArrayOfInt1 == null) {
      arrayOfInt = clone(paramArrayOfInt2);
    }
    for (;;)
    {
      return arrayOfInt;
      if (paramArrayOfInt2 == null)
      {
        arrayOfInt = clone(paramArrayOfInt1);
      }
      else
      {
        int i = paramArrayOfInt1.length;
        int j = paramArrayOfInt2.length;
        arrayOfInt = new int[i + j];
        i = paramArrayOfInt1.length;
        System.arraycopy(paramArrayOfInt1, 0, arrayOfInt, 0, i);
        i = paramArrayOfInt1.length;
        j = paramArrayOfInt2.length;
        System.arraycopy(paramArrayOfInt2, 0, arrayOfInt, i, j);
      }
    }
  }
  
  public static long[] addAll(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    long[] arrayOfLong;
    if (paramArrayOfLong1 == null) {
      arrayOfLong = clone(paramArrayOfLong2);
    }
    for (;;)
    {
      return arrayOfLong;
      if (paramArrayOfLong2 == null)
      {
        arrayOfLong = clone(paramArrayOfLong1);
      }
      else
      {
        int i = paramArrayOfLong1.length;
        int j = paramArrayOfLong2.length;
        arrayOfLong = new long[i + j];
        i = paramArrayOfLong1.length;
        System.arraycopy(paramArrayOfLong1, 0, arrayOfLong, 0, i);
        i = paramArrayOfLong1.length;
        j = paramArrayOfLong2.length;
        System.arraycopy(paramArrayOfLong2, 0, arrayOfLong, i, j);
      }
    }
  }
  
  public static Object[] addAll(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    Object localObject1;
    if (paramArrayOfObject1 == null) {
      localObject1 = clone(paramArrayOfObject2);
    }
    for (;;)
    {
      return (Object[])localObject1;
      if (paramArrayOfObject2 == null)
      {
        localObject1 = clone(paramArrayOfObject1);
        continue;
      }
      Object localObject2 = paramArrayOfObject1.getClass().getComponentType();
      int i = paramArrayOfObject1.length;
      int j = paramArrayOfObject2.length;
      i += j;
      localObject2 = (Object[])Array.newInstance((Class)localObject2, i);
      localObject1 = localObject2;
      localObject1 = (Object[])localObject2;
      int k = paramArrayOfObject1.length;
      System.arraycopy(paramArrayOfObject1, 0, localObject1, 0, k);
      k = 0;
      localObject2 = null;
      try
      {
        i = paramArrayOfObject1.length;
        j = paramArrayOfObject2.length;
        System.arraycopy(paramArrayOfObject2, 0, localObject1, i, j);
      }
      catch (ArrayStoreException localArrayStoreException)
      {
        Class localClass1 = paramArrayOfObject1.getClass().getComponentType();
        localObject2 = paramArrayOfObject2.getClass();
        Class localClass2 = ((Class)localObject2).getComponentType();
        boolean bool = localClass1.isAssignableFrom(localClass2);
        if (!bool)
        {
          localObject2 = new java/lang/IllegalArgumentException;
          Object localObject3 = new java/lang/StringBuffer;
          ((StringBuffer)localObject3).<init>();
          localObject3 = ((StringBuffer)localObject3).append("Cannot store ");
          String str = localClass2.getName();
          localObject3 = ((StringBuffer)localObject3).append(str).append(" in an array of ");
          str = localClass1.getName();
          localObject3 = str;
          ((IllegalArgumentException)localObject2).<init>((String)localObject3);
          throw ((Throwable)localObject2);
        }
        throw localArrayStoreException;
      }
    }
  }
  
  public static short[] addAll(short[] paramArrayOfShort1, short[] paramArrayOfShort2)
  {
    short[] arrayOfShort;
    if (paramArrayOfShort1 == null) {
      arrayOfShort = clone(paramArrayOfShort2);
    }
    for (;;)
    {
      return arrayOfShort;
      if (paramArrayOfShort2 == null)
      {
        arrayOfShort = clone(paramArrayOfShort1);
      }
      else
      {
        int i = paramArrayOfShort1.length;
        int j = paramArrayOfShort2.length;
        arrayOfShort = new short[i + j];
        i = paramArrayOfShort1.length;
        System.arraycopy(paramArrayOfShort1, 0, arrayOfShort, 0, i);
        i = paramArrayOfShort1.length;
        j = paramArrayOfShort2.length;
        System.arraycopy(paramArrayOfShort2, 0, arrayOfShort, i, j);
      }
    }
  }
  
  public static boolean[] addAll(boolean[] paramArrayOfBoolean1, boolean[] paramArrayOfBoolean2)
  {
    boolean[] arrayOfBoolean;
    if (paramArrayOfBoolean1 == null) {
      arrayOfBoolean = clone(paramArrayOfBoolean2);
    }
    for (;;)
    {
      return arrayOfBoolean;
      if (paramArrayOfBoolean2 == null)
      {
        arrayOfBoolean = clone(paramArrayOfBoolean1);
      }
      else
      {
        int i = paramArrayOfBoolean1.length;
        int j = paramArrayOfBoolean2.length;
        arrayOfBoolean = new boolean[i + j];
        i = paramArrayOfBoolean1.length;
        System.arraycopy(paramArrayOfBoolean1, 0, arrayOfBoolean, 0, i);
        i = paramArrayOfBoolean1.length;
        j = paramArrayOfBoolean2.length;
        System.arraycopy(paramArrayOfBoolean2, 0, arrayOfBoolean, i, j);
      }
    }
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
  
  public static byte[] clone(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {}
    for (byte[] arrayOfByte = null;; arrayOfByte = (byte[])paramArrayOfByte.clone()) {
      return arrayOfByte;
    }
  }
  
  public static char[] clone(char[] paramArrayOfChar)
  {
    if (paramArrayOfChar == null) {}
    for (char[] arrayOfChar = null;; arrayOfChar = (char[])paramArrayOfChar.clone()) {
      return arrayOfChar;
    }
  }
  
  public static double[] clone(double[] paramArrayOfDouble)
  {
    if (paramArrayOfDouble == null) {}
    for (double[] arrayOfDouble = null;; arrayOfDouble = (double[])paramArrayOfDouble.clone()) {
      return arrayOfDouble;
    }
  }
  
  public static float[] clone(float[] paramArrayOfFloat)
  {
    if (paramArrayOfFloat == null) {}
    for (float[] arrayOfFloat = null;; arrayOfFloat = (float[])paramArrayOfFloat.clone()) {
      return arrayOfFloat;
    }
  }
  
  public static int[] clone(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null) {}
    for (int[] arrayOfInt = null;; arrayOfInt = (int[])paramArrayOfInt.clone()) {
      return arrayOfInt;
    }
  }
  
  public static long[] clone(long[] paramArrayOfLong)
  {
    if (paramArrayOfLong == null) {}
    for (long[] arrayOfLong = null;; arrayOfLong = (long[])paramArrayOfLong.clone()) {
      return arrayOfLong;
    }
  }
  
  public static Object[] clone(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject == null) {}
    for (Object[] arrayOfObject = null;; arrayOfObject = (Object[])paramArrayOfObject.clone()) {
      return arrayOfObject;
    }
  }
  
  public static short[] clone(short[] paramArrayOfShort)
  {
    if (paramArrayOfShort == null) {}
    for (short[] arrayOfShort = null;; arrayOfShort = (short[])paramArrayOfShort.clone()) {
      return arrayOfShort;
    }
  }
  
  public static boolean[] clone(boolean[] paramArrayOfBoolean)
  {
    if (paramArrayOfBoolean == null) {}
    for (boolean[] arrayOfBoolean = null;; arrayOfBoolean = (boolean[])paramArrayOfBoolean.clone()) {
      return arrayOfBoolean;
    }
  }
  
  public static boolean contains(byte[] paramArrayOfByte, byte paramByte)
  {
    int i = indexOf(paramArrayOfByte, paramByte);
    int k = -1;
    if (i != k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean contains(char[] paramArrayOfChar, char paramChar)
  {
    int i = indexOf(paramArrayOfChar, paramChar);
    int k = -1;
    if (i != k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean contains(double[] paramArrayOfDouble, double paramDouble)
  {
    int i = indexOf(paramArrayOfDouble, paramDouble);
    int k = -1;
    if (i != k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean contains(double[] paramArrayOfDouble, double paramDouble1, double paramDouble2)
  {
    boolean bool = false;
    int i = indexOf(paramArrayOfDouble, paramDouble1, 0, paramDouble2);
    int j = -1;
    if (i != j) {
      bool = true;
    }
    return bool;
  }
  
  public static boolean contains(float[] paramArrayOfFloat, float paramFloat)
  {
    int i = indexOf(paramArrayOfFloat, paramFloat);
    int k = -1;
    if (i != k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean contains(int[] paramArrayOfInt, int paramInt)
  {
    int i = indexOf(paramArrayOfInt, paramInt);
    int k = -1;
    if (i != k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean contains(long[] paramArrayOfLong, long paramLong)
  {
    int i = indexOf(paramArrayOfLong, paramLong);
    int k = -1;
    if (i != k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean contains(Object[] paramArrayOfObject, Object paramObject)
  {
    int i = indexOf(paramArrayOfObject, paramObject);
    int k = -1;
    if (i != k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean contains(short[] paramArrayOfShort, short paramShort)
  {
    int i = indexOf(paramArrayOfShort, paramShort);
    int k = -1;
    if (i != k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean contains(boolean[] paramArrayOfBoolean, boolean paramBoolean)
  {
    int i = indexOf(paramArrayOfBoolean, paramBoolean);
    int k = -1;
    if (i != k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  private static Object copyArrayGrow1(Object paramObject, Class paramClass)
  {
    Object localObject;
    if (paramObject != null)
    {
      int i = Array.getLength(paramObject);
      Class localClass = paramObject.getClass().getComponentType();
      int j = i + 1;
      localObject = Array.newInstance(localClass, j);
      System.arraycopy(paramObject, 0, localObject, 0, i);
    }
    for (;;)
    {
      return localObject;
      int k = 1;
      localObject = Array.newInstance(paramClass, k);
    }
  }
  
  public static int getLength(Object paramObject)
  {
    if (paramObject == null) {}
    for (int i = 0;; i = Array.getLength(paramObject)) {
      return i;
    }
  }
  
  public static int hashCode(Object paramObject)
  {
    HashCodeBuilder localHashCodeBuilder = new org/apache/commons/lang/builder/HashCodeBuilder;
    localHashCodeBuilder.<init>();
    return localHashCodeBuilder.append(paramObject).toHashCode();
  }
  
  public static int indexOf(byte[] paramArrayOfByte, byte paramByte)
  {
    return indexOf(paramArrayOfByte, paramByte, 0);
  }
  
  public static int indexOf(byte[] paramArrayOfByte, byte paramByte, int paramInt)
  {
    int i = -1;
    int j;
    if (paramArrayOfByte == null) {
      j = i;
    }
    for (;;)
    {
      return j;
      if (paramInt < 0) {
        paramInt = 0;
      }
      j = paramInt;
      for (;;)
      {
        byte b = paramArrayOfByte.length;
        if (j >= b) {
          break label53;
        }
        b = paramArrayOfByte[j];
        if (paramByte == b) {
          break;
        }
        j += 1;
      }
      label53:
      j = i;
    }
  }
  
  public static int indexOf(char[] paramArrayOfChar, char paramChar)
  {
    return indexOf(paramArrayOfChar, paramChar, 0);
  }
  
  public static int indexOf(char[] paramArrayOfChar, char paramChar, int paramInt)
  {
    int i = -1;
    int j;
    if (paramArrayOfChar == null) {
      j = i;
    }
    for (;;)
    {
      return j;
      if (paramInt < 0) {
        paramInt = 0;
      }
      j = paramInt;
      for (;;)
      {
        char c = paramArrayOfChar.length;
        if (j >= c) {
          break label53;
        }
        c = paramArrayOfChar[j];
        if (paramChar == c) {
          break;
        }
        j += 1;
      }
      label53:
      j = i;
    }
  }
  
  public static int indexOf(double[] paramArrayOfDouble, double paramDouble)
  {
    return indexOf(paramArrayOfDouble, paramDouble, 0);
  }
  
  public static int indexOf(double[] paramArrayOfDouble, double paramDouble1, double paramDouble2)
  {
    return indexOf(paramArrayOfDouble, paramDouble1, 0, paramDouble2);
  }
  
  public static int indexOf(double[] paramArrayOfDouble, double paramDouble, int paramInt)
  {
    int i = -1;
    boolean bool1 = isEmpty(paramArrayOfDouble);
    int k;
    if (bool1) {
      k = i;
    }
    for (;;)
    {
      return k;
      if (paramInt < 0) {
        paramInt = 0;
      }
      k = paramInt;
      for (;;)
      {
        int j = paramArrayOfDouble.length;
        if (k >= j) {
          break label67;
        }
        double d = paramArrayOfDouble[k];
        boolean bool2 = paramDouble < d;
        if (!bool2) {
          break;
        }
        k += 1;
      }
      label67:
      k = i;
    }
  }
  
  public static int indexOf(double[] paramArrayOfDouble, double paramDouble1, int paramInt, double paramDouble2)
  {
    int i = -1;
    boolean bool1 = isEmpty(paramArrayOfDouble);
    int k;
    if (bool1) {
      k = i;
    }
    for (;;)
    {
      return k;
      if (paramInt < 0) {
        paramInt = 0;
      }
      double d1 = paramDouble1 - paramDouble2;
      double d2 = paramDouble1 + paramDouble2;
      k = paramInt;
      for (;;)
      {
        int j = paramArrayOfDouble.length;
        if (k >= j) {
          break label98;
        }
        double d3 = paramArrayOfDouble[k];
        boolean bool2 = d3 < d1;
        if (!bool2)
        {
          d3 = paramArrayOfDouble[k];
          bool2 = d3 < d2;
          if (!bool2) {
            break;
          }
        }
        k += 1;
      }
      label98:
      k = i;
    }
  }
  
  public static int indexOf(float[] paramArrayOfFloat, float paramFloat)
  {
    return indexOf(paramArrayOfFloat, paramFloat, 0);
  }
  
  public static int indexOf(float[] paramArrayOfFloat, float paramFloat, int paramInt)
  {
    int i = -1;
    boolean bool1 = isEmpty(paramArrayOfFloat);
    int k;
    if (bool1) {
      k = i;
    }
    for (;;)
    {
      return k;
      if (paramInt < 0) {
        paramInt = 0;
      }
      k = paramInt;
      for (;;)
      {
        int j = paramArrayOfFloat.length;
        if (k >= j) {
          break label65;
        }
        float f = paramArrayOfFloat[k];
        boolean bool2 = paramFloat < f;
        if (!bool2) {
          break;
        }
        k += 1;
      }
      label65:
      k = i;
    }
  }
  
  public static int indexOf(int[] paramArrayOfInt, int paramInt)
  {
    return indexOf(paramArrayOfInt, paramInt, 0);
  }
  
  public static int indexOf(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = -1;
    int j;
    if (paramArrayOfInt == null) {
      j = i;
    }
    for (;;)
    {
      return j;
      if (paramInt2 < 0) {
        paramInt2 = 0;
      }
      j = paramInt2;
      for (;;)
      {
        int k = paramArrayOfInt.length;
        if (j >= k) {
          break label53;
        }
        k = paramArrayOfInt[j];
        if (paramInt1 == k) {
          break;
        }
        j += 1;
      }
      label53:
      j = i;
    }
  }
  
  public static int indexOf(long[] paramArrayOfLong, long paramLong)
  {
    return indexOf(paramArrayOfLong, paramLong, 0);
  }
  
  public static int indexOf(long[] paramArrayOfLong, long paramLong, int paramInt)
  {
    int i = -1;
    int j;
    if (paramArrayOfLong == null) {
      j = i;
    }
    for (;;)
    {
      return j;
      if (paramInt < 0) {
        paramInt = 0;
      }
      j = paramInt;
      for (;;)
      {
        int k = paramArrayOfLong.length;
        if (j >= k) {
          break label60;
        }
        long l = paramArrayOfLong[j];
        boolean bool = paramLong < l;
        if (!bool) {
          break;
        }
        j += 1;
      }
      label60:
      j = i;
    }
  }
  
  public static int indexOf(Object[] paramArrayOfObject, Object paramObject)
  {
    return indexOf(paramArrayOfObject, paramObject, 0);
  }
  
  public static int indexOf(Object[] paramArrayOfObject, Object paramObject, int paramInt)
  {
    int i = -1;
    int j;
    if (paramArrayOfObject == null) {
      j = i;
    }
    for (;;)
    {
      return j;
      if (paramInt < 0) {
        paramInt = 0;
      }
      int k;
      Object localObject;
      if (paramObject == null)
      {
        j = paramInt;
        for (;;)
        {
          k = paramArrayOfObject.length;
          if (j >= k) {
            break label98;
          }
          localObject = paramArrayOfObject[j];
          if (localObject == null) {
            break;
          }
          j += 1;
        }
      }
      j = paramInt;
      for (;;)
      {
        k = paramArrayOfObject.length;
        if (j >= k) {
          break label98;
        }
        localObject = paramArrayOfObject[j];
        boolean bool = paramObject.equals(localObject);
        if (bool) {
          break;
        }
        j += 1;
      }
      label98:
      j = i;
    }
  }
  
  public static int indexOf(short[] paramArrayOfShort, short paramShort)
  {
    return indexOf(paramArrayOfShort, paramShort, 0);
  }
  
  public static int indexOf(short[] paramArrayOfShort, short paramShort, int paramInt)
  {
    int i = -1;
    int j;
    if (paramArrayOfShort == null) {
      j = i;
    }
    for (;;)
    {
      return j;
      if (paramInt < 0) {
        paramInt = 0;
      }
      j = paramInt;
      for (;;)
      {
        short s = paramArrayOfShort.length;
        if (j >= s) {
          break label53;
        }
        s = paramArrayOfShort[j];
        if (paramShort == s) {
          break;
        }
        j += 1;
      }
      label53:
      j = i;
    }
  }
  
  public static int indexOf(boolean[] paramArrayOfBoolean, boolean paramBoolean)
  {
    return indexOf(paramArrayOfBoolean, paramBoolean, 0);
  }
  
  public static int indexOf(boolean[] paramArrayOfBoolean, boolean paramBoolean, int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = isEmpty(paramArrayOfBoolean);
    boolean bool4;
    if (bool2) {
      bool4 = bool1;
    }
    for (;;)
    {
      return bool4;
      if (paramInt < 0) {
        paramInt = 0;
      }
      bool4 = paramInt;
      for (;;)
      {
        boolean bool3 = paramArrayOfBoolean.length;
        if (bool4 >= bool3) {
          break label60;
        }
        bool3 = paramArrayOfBoolean[bool4];
        if (paramBoolean == bool3) {
          break;
        }
        bool4 += true;
      }
      label60:
      int i = bool1;
    }
  }
  
  public static boolean isEmpty(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null)
    {
      i = paramArrayOfByte.length;
      if (i != 0) {
        break label15;
      }
    }
    label15:
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean isEmpty(char[] paramArrayOfChar)
  {
    if (paramArrayOfChar != null)
    {
      i = paramArrayOfChar.length;
      if (i != 0) {
        break label15;
      }
    }
    label15:
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean isEmpty(double[] paramArrayOfDouble)
  {
    if (paramArrayOfDouble != null)
    {
      i = paramArrayOfDouble.length;
      if (i != 0) {
        break label15;
      }
    }
    label15:
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean isEmpty(float[] paramArrayOfFloat)
  {
    if (paramArrayOfFloat != null)
    {
      i = paramArrayOfFloat.length;
      if (i != 0) {
        break label15;
      }
    }
    label15:
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean isEmpty(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt != null)
    {
      i = paramArrayOfInt.length;
      if (i != 0) {
        break label15;
      }
    }
    label15:
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean isEmpty(long[] paramArrayOfLong)
  {
    if (paramArrayOfLong != null)
    {
      i = paramArrayOfLong.length;
      if (i != 0) {
        break label15;
      }
    }
    label15:
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean isEmpty(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject != null)
    {
      i = paramArrayOfObject.length;
      if (i != 0) {
        break label15;
      }
    }
    label15:
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean isEmpty(short[] paramArrayOfShort)
  {
    if (paramArrayOfShort != null)
    {
      i = paramArrayOfShort.length;
      if (i != 0) {
        break label15;
      }
    }
    label15:
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean isEmpty(boolean[] paramArrayOfBoolean)
  {
    if (paramArrayOfBoolean != null)
    {
      i = paramArrayOfBoolean.length;
      if (i != 0) {
        break label15;
      }
    }
    label15:
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean isEquals(Object paramObject1, Object paramObject2)
  {
    EqualsBuilder localEqualsBuilder = new org/apache/commons/lang/builder/EqualsBuilder;
    localEqualsBuilder.<init>();
    return localEqualsBuilder.append(paramObject1, paramObject2).isEquals();
  }
  
  public static boolean isNotEmpty(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null)
    {
      i = paramArrayOfByte.length;
      if (i == 0) {}
    }
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean isNotEmpty(char[] paramArrayOfChar)
  {
    if (paramArrayOfChar != null)
    {
      i = paramArrayOfChar.length;
      if (i == 0) {}
    }
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean isNotEmpty(double[] paramArrayOfDouble)
  {
    if (paramArrayOfDouble != null)
    {
      i = paramArrayOfDouble.length;
      if (i == 0) {}
    }
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean isNotEmpty(float[] paramArrayOfFloat)
  {
    if (paramArrayOfFloat != null)
    {
      i = paramArrayOfFloat.length;
      if (i == 0) {}
    }
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean isNotEmpty(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt != null)
    {
      i = paramArrayOfInt.length;
      if (i == 0) {}
    }
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean isNotEmpty(long[] paramArrayOfLong)
  {
    if (paramArrayOfLong != null)
    {
      i = paramArrayOfLong.length;
      if (i == 0) {}
    }
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean isNotEmpty(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject != null)
    {
      i = paramArrayOfObject.length;
      if (i == 0) {}
    }
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean isNotEmpty(short[] paramArrayOfShort)
  {
    if (paramArrayOfShort != null)
    {
      i = paramArrayOfShort.length;
      if (i == 0) {}
    }
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean isNotEmpty(boolean[] paramArrayOfBoolean)
  {
    if (paramArrayOfBoolean != null)
    {
      i = paramArrayOfBoolean.length;
      if (i == 0) {}
    }
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean isSameLength(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if ((paramArrayOfByte1 == null) && (paramArrayOfByte2 != null))
    {
      i = paramArrayOfByte2.length;
      if (i > 0) {}
    }
    else if ((paramArrayOfByte2 == null) && (paramArrayOfByte1 != null))
    {
      i = paramArrayOfByte1.length;
      if (i > 0) {}
    }
    else
    {
      if ((paramArrayOfByte1 == null) || (paramArrayOfByte2 == null)) {
        break label53;
      }
      i = paramArrayOfByte1.length;
      int k = paramArrayOfByte2.length;
      if (i == k) {
        break label53;
      }
    }
    label53:
    int j;
    for (int i = 0;; j = 1) {
      return i;
    }
  }
  
  public static boolean isSameLength(char[] paramArrayOfChar1, char[] paramArrayOfChar2)
  {
    if ((paramArrayOfChar1 == null) && (paramArrayOfChar2 != null))
    {
      i = paramArrayOfChar2.length;
      if (i > 0) {}
    }
    else if ((paramArrayOfChar2 == null) && (paramArrayOfChar1 != null))
    {
      i = paramArrayOfChar1.length;
      if (i > 0) {}
    }
    else
    {
      if ((paramArrayOfChar1 == null) || (paramArrayOfChar2 == null)) {
        break label53;
      }
      i = paramArrayOfChar1.length;
      int k = paramArrayOfChar2.length;
      if (i == k) {
        break label53;
      }
    }
    label53:
    int j;
    for (int i = 0;; j = 1) {
      return i;
    }
  }
  
  public static boolean isSameLength(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    if ((paramArrayOfDouble1 == null) && (paramArrayOfDouble2 != null))
    {
      i = paramArrayOfDouble2.length;
      if (i > 0) {}
    }
    else if ((paramArrayOfDouble2 == null) && (paramArrayOfDouble1 != null))
    {
      i = paramArrayOfDouble1.length;
      if (i > 0) {}
    }
    else
    {
      if ((paramArrayOfDouble1 == null) || (paramArrayOfDouble2 == null)) {
        break label53;
      }
      i = paramArrayOfDouble1.length;
      int k = paramArrayOfDouble2.length;
      if (i == k) {
        break label53;
      }
    }
    label53:
    int j;
    for (int i = 0;; j = 1) {
      return i;
    }
  }
  
  public static boolean isSameLength(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    if ((paramArrayOfFloat1 == null) && (paramArrayOfFloat2 != null))
    {
      i = paramArrayOfFloat2.length;
      if (i > 0) {}
    }
    else if ((paramArrayOfFloat2 == null) && (paramArrayOfFloat1 != null))
    {
      i = paramArrayOfFloat1.length;
      if (i > 0) {}
    }
    else
    {
      if ((paramArrayOfFloat1 == null) || (paramArrayOfFloat2 == null)) {
        break label53;
      }
      i = paramArrayOfFloat1.length;
      int k = paramArrayOfFloat2.length;
      if (i == k) {
        break label53;
      }
    }
    label53:
    int j;
    for (int i = 0;; j = 1) {
      return i;
    }
  }
  
  public static boolean isSameLength(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    if ((paramArrayOfInt1 == null) && (paramArrayOfInt2 != null))
    {
      i = paramArrayOfInt2.length;
      if (i > 0) {}
    }
    else if ((paramArrayOfInt2 == null) && (paramArrayOfInt1 != null))
    {
      i = paramArrayOfInt1.length;
      if (i > 0) {}
    }
    else
    {
      if ((paramArrayOfInt1 == null) || (paramArrayOfInt2 == null)) {
        break label53;
      }
      i = paramArrayOfInt1.length;
      int k = paramArrayOfInt2.length;
      if (i == k) {
        break label53;
      }
    }
    label53:
    int j;
    for (int i = 0;; j = 1) {
      return i;
    }
  }
  
  public static boolean isSameLength(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    if ((paramArrayOfLong1 == null) && (paramArrayOfLong2 != null))
    {
      i = paramArrayOfLong2.length;
      if (i > 0) {}
    }
    else if ((paramArrayOfLong2 == null) && (paramArrayOfLong1 != null))
    {
      i = paramArrayOfLong1.length;
      if (i > 0) {}
    }
    else
    {
      if ((paramArrayOfLong1 == null) || (paramArrayOfLong2 == null)) {
        break label53;
      }
      i = paramArrayOfLong1.length;
      int k = paramArrayOfLong2.length;
      if (i == k) {
        break label53;
      }
    }
    label53:
    int j;
    for (int i = 0;; j = 1) {
      return i;
    }
  }
  
  public static boolean isSameLength(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    if ((paramArrayOfObject1 == null) && (paramArrayOfObject2 != null))
    {
      i = paramArrayOfObject2.length;
      if (i > 0) {}
    }
    else if ((paramArrayOfObject2 == null) && (paramArrayOfObject1 != null))
    {
      i = paramArrayOfObject1.length;
      if (i > 0) {}
    }
    else
    {
      if ((paramArrayOfObject1 == null) || (paramArrayOfObject2 == null)) {
        break label53;
      }
      i = paramArrayOfObject1.length;
      int k = paramArrayOfObject2.length;
      if (i == k) {
        break label53;
      }
    }
    label53:
    int j;
    for (int i = 0;; j = 1) {
      return i;
    }
  }
  
  public static boolean isSameLength(short[] paramArrayOfShort1, short[] paramArrayOfShort2)
  {
    if ((paramArrayOfShort1 == null) && (paramArrayOfShort2 != null))
    {
      i = paramArrayOfShort2.length;
      if (i > 0) {}
    }
    else if ((paramArrayOfShort2 == null) && (paramArrayOfShort1 != null))
    {
      i = paramArrayOfShort1.length;
      if (i > 0) {}
    }
    else
    {
      if ((paramArrayOfShort1 == null) || (paramArrayOfShort2 == null)) {
        break label53;
      }
      i = paramArrayOfShort1.length;
      int k = paramArrayOfShort2.length;
      if (i == k) {
        break label53;
      }
    }
    label53:
    int j;
    for (int i = 0;; j = 1) {
      return i;
    }
  }
  
  public static boolean isSameLength(boolean[] paramArrayOfBoolean1, boolean[] paramArrayOfBoolean2)
  {
    if ((paramArrayOfBoolean1 == null) && (paramArrayOfBoolean2 != null))
    {
      i = paramArrayOfBoolean2.length;
      if (i > 0) {}
    }
    else if ((paramArrayOfBoolean2 == null) && (paramArrayOfBoolean1 != null))
    {
      i = paramArrayOfBoolean1.length;
      if (i > 0) {}
    }
    else
    {
      if ((paramArrayOfBoolean1 == null) || (paramArrayOfBoolean2 == null)) {
        break label53;
      }
      i = paramArrayOfBoolean1.length;
      int k = paramArrayOfBoolean2.length;
      if (i == k) {
        break label53;
      }
    }
    label53:
    int j;
    for (int i = 0;; j = 1) {
      return i;
    }
  }
  
  public static boolean isSameType(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 == null) || (paramObject2 == null))
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("The Array must not be null");
      throw ((Throwable)localObject);
    }
    Object localObject = paramObject1.getClass().getName();
    String str = paramObject2.getClass().getName();
    return ((String)localObject).equals(str);
  }
  
  public static int lastIndexOf(byte[] paramArrayOfByte, byte paramByte)
  {
    return lastIndexOf(paramArrayOfByte, paramByte, -1 >>> 1);
  }
  
  public static int lastIndexOf(byte[] paramArrayOfByte, byte paramByte, int paramInt)
  {
    int i = -1;
    int j;
    if (paramArrayOfByte == null) {
      j = i;
    }
    for (;;)
    {
      return j;
      if (paramInt < 0)
      {
        j = i;
      }
      else
      {
        int k = paramArrayOfByte.length;
        if (paramInt >= k)
        {
          k = paramArrayOfByte.length;
          paramInt = k + -1;
        }
        j = paramInt;
        for (;;)
        {
          if (j < 0) {
            break label70;
          }
          k = paramArrayOfByte[j];
          if (paramByte == k) {
            break;
          }
          j += -1;
        }
        label70:
        j = i;
      }
    }
  }
  
  public static int lastIndexOf(char[] paramArrayOfChar, char paramChar)
  {
    return lastIndexOf(paramArrayOfChar, paramChar, -1 >>> 1);
  }
  
  public static int lastIndexOf(char[] paramArrayOfChar, char paramChar, int paramInt)
  {
    int i = -1;
    int j;
    if (paramArrayOfChar == null) {
      j = i;
    }
    for (;;)
    {
      return j;
      if (paramInt < 0)
      {
        j = i;
      }
      else
      {
        int k = paramArrayOfChar.length;
        if (paramInt >= k)
        {
          k = paramArrayOfChar.length;
          paramInt = k + -1;
        }
        j = paramInt;
        for (;;)
        {
          if (j < 0) {
            break label70;
          }
          k = paramArrayOfChar[j];
          if (paramChar == k) {
            break;
          }
          j += -1;
        }
        label70:
        j = i;
      }
    }
  }
  
  public static int lastIndexOf(double[] paramArrayOfDouble, double paramDouble)
  {
    return lastIndexOf(paramArrayOfDouble, paramDouble, -1 >>> 1);
  }
  
  public static int lastIndexOf(double[] paramArrayOfDouble, double paramDouble1, double paramDouble2)
  {
    return lastIndexOf(paramArrayOfDouble, paramDouble1, -1 >>> 1, paramDouble2);
  }
  
  public static int lastIndexOf(double[] paramArrayOfDouble, double paramDouble, int paramInt)
  {
    int i = -1;
    boolean bool1 = isEmpty(paramArrayOfDouble);
    int k;
    if (bool1) {
      k = i;
    }
    for (;;)
    {
      return k;
      if (paramInt < 0)
      {
        k = i;
      }
      else
      {
        int j = paramArrayOfDouble.length;
        if (paramInt >= j)
        {
          j = paramArrayOfDouble.length;
          paramInt = j + -1;
        }
        k = paramInt;
        for (;;)
        {
          if (k < 0) {
            break label85;
          }
          double d = paramArrayOfDouble[k];
          boolean bool2 = paramDouble < d;
          if (!bool2) {
            break;
          }
          k += -1;
        }
        label85:
        k = i;
      }
    }
  }
  
  public static int lastIndexOf(double[] paramArrayOfDouble, double paramDouble1, int paramInt, double paramDouble2)
  {
    int i = -1;
    boolean bool1 = isEmpty(paramArrayOfDouble);
    int k;
    if (bool1) {
      k = i;
    }
    for (;;)
    {
      return k;
      if (paramInt < 0)
      {
        k = i;
      }
      else
      {
        int j = paramArrayOfDouble.length;
        if (paramInt >= j)
        {
          j = paramArrayOfDouble.length;
          paramInt = j + -1;
        }
        double d1 = paramDouble1 - paramDouble2;
        double d2 = paramDouble1 + paramDouble2;
        k = paramInt;
        for (;;)
        {
          if (k < 0) {
            break label116;
          }
          double d3 = paramArrayOfDouble[k];
          boolean bool2 = d3 < d1;
          if (!bool2)
          {
            d3 = paramArrayOfDouble[k];
            bool2 = d3 < d2;
            if (!bool2) {
              break;
            }
          }
          k += -1;
        }
        label116:
        k = i;
      }
    }
  }
  
  public static int lastIndexOf(float[] paramArrayOfFloat, float paramFloat)
  {
    return lastIndexOf(paramArrayOfFloat, paramFloat, -1 >>> 1);
  }
  
  public static int lastIndexOf(float[] paramArrayOfFloat, float paramFloat, int paramInt)
  {
    int i = -1;
    boolean bool1 = isEmpty(paramArrayOfFloat);
    int k;
    if (bool1) {
      k = i;
    }
    for (;;)
    {
      return k;
      if (paramInt < 0)
      {
        k = i;
      }
      else
      {
        int j = paramArrayOfFloat.length;
        if (paramInt >= j)
        {
          j = paramArrayOfFloat.length;
          paramInt = j + -1;
        }
        k = paramInt;
        for (;;)
        {
          if (k < 0) {
            break label82;
          }
          float f = paramArrayOfFloat[k];
          boolean bool2 = paramFloat < f;
          if (!bool2) {
            break;
          }
          k += -1;
        }
        label82:
        k = i;
      }
    }
  }
  
  public static int lastIndexOf(int[] paramArrayOfInt, int paramInt)
  {
    return lastIndexOf(paramArrayOfInt, paramInt, -1 >>> 1);
  }
  
  public static int lastIndexOf(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = -1;
    int j;
    if (paramArrayOfInt == null) {
      j = i;
    }
    for (;;)
    {
      return j;
      if (paramInt2 < 0)
      {
        j = i;
      }
      else
      {
        int k = paramArrayOfInt.length;
        if (paramInt2 >= k)
        {
          k = paramArrayOfInt.length;
          paramInt2 = k + -1;
        }
        j = paramInt2;
        for (;;)
        {
          if (j < 0) {
            break label70;
          }
          k = paramArrayOfInt[j];
          if (paramInt1 == k) {
            break;
          }
          j += -1;
        }
        label70:
        j = i;
      }
    }
  }
  
  public static int lastIndexOf(long[] paramArrayOfLong, long paramLong)
  {
    return lastIndexOf(paramArrayOfLong, paramLong, -1 >>> 1);
  }
  
  public static int lastIndexOf(long[] paramArrayOfLong, long paramLong, int paramInt)
  {
    int i = -1;
    int j;
    if (paramArrayOfLong == null) {
      j = i;
    }
    for (;;)
    {
      return j;
      if (paramInt < 0)
      {
        j = i;
      }
      else
      {
        int k = paramArrayOfLong.length;
        if (paramInt >= k)
        {
          k = paramArrayOfLong.length;
          paramInt = k + -1;
        }
        j = paramInt;
        for (;;)
        {
          if (j < 0) {
            break label78;
          }
          long l = paramArrayOfLong[j];
          boolean bool = paramLong < l;
          if (!bool) {
            break;
          }
          j += -1;
        }
        label78:
        j = i;
      }
    }
  }
  
  public static int lastIndexOf(Object[] paramArrayOfObject, Object paramObject)
  {
    return lastIndexOf(paramArrayOfObject, paramObject, -1 >>> 1);
  }
  
  public static int lastIndexOf(Object[] paramArrayOfObject, Object paramObject, int paramInt)
  {
    int i = -1;
    int j;
    if (paramArrayOfObject == null) {
      j = i;
    }
    for (;;)
    {
      return j;
      if (paramInt < 0)
      {
        j = i;
      }
      else
      {
        int k = paramArrayOfObject.length;
        if (paramInt >= k)
        {
          k = paramArrayOfObject.length;
          paramInt = k + -1;
        }
        Object localObject;
        if (paramObject == null)
        {
          j = paramInt;
          for (;;)
          {
            if (j < 0) {
              break label109;
            }
            localObject = paramArrayOfObject[j];
            if (localObject == null) {
              break;
            }
            j += -1;
          }
        }
        j = paramInt;
        for (;;)
        {
          if (j < 0) {
            break label109;
          }
          localObject = paramArrayOfObject[j];
          boolean bool = paramObject.equals(localObject);
          if (bool) {
            break;
          }
          j += -1;
        }
        label109:
        j = i;
      }
    }
  }
  
  public static int lastIndexOf(short[] paramArrayOfShort, short paramShort)
  {
    return lastIndexOf(paramArrayOfShort, paramShort, -1 >>> 1);
  }
  
  public static int lastIndexOf(short[] paramArrayOfShort, short paramShort, int paramInt)
  {
    int i = -1;
    int j;
    if (paramArrayOfShort == null) {
      j = i;
    }
    for (;;)
    {
      return j;
      if (paramInt < 0)
      {
        j = i;
      }
      else
      {
        int k = paramArrayOfShort.length;
        if (paramInt >= k)
        {
          k = paramArrayOfShort.length;
          paramInt = k + -1;
        }
        j = paramInt;
        for (;;)
        {
          if (j < 0) {
            break label70;
          }
          k = paramArrayOfShort[j];
          if (paramShort == k) {
            break;
          }
          j += -1;
        }
        label70:
        j = i;
      }
    }
  }
  
  public static int lastIndexOf(boolean[] paramArrayOfBoolean, boolean paramBoolean)
  {
    return lastIndexOf(paramArrayOfBoolean, paramBoolean, -1 >>> 1);
  }
  
  public static int lastIndexOf(boolean[] paramArrayOfBoolean, boolean paramBoolean, int paramInt)
  {
    int i = -1;
    boolean bool = isEmpty(paramArrayOfBoolean);
    int k;
    if (bool) {
      k = i;
    }
    for (;;)
    {
      return k;
      if (paramInt < 0)
      {
        k = i;
      }
      else
      {
        int j = paramArrayOfBoolean.length;
        if (paramInt >= j)
        {
          j = paramArrayOfBoolean.length;
          paramInt = j + -1;
        }
        k = paramInt;
        for (;;)
        {
          if (k < 0) {
            break label77;
          }
          j = paramArrayOfBoolean[k];
          if (paramBoolean == j) {
            break;
          }
          k += -1;
        }
        label77:
        k = i;
      }
    }
  }
  
  public static byte[] nullToEmpty(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null)
    {
      int i = paramArrayOfByte.length;
      if (i != 0) {}
    }
    else
    {
      paramArrayOfByte = EMPTY_BYTE_ARRAY;
    }
    return paramArrayOfByte;
  }
  
  public static char[] nullToEmpty(char[] paramArrayOfChar)
  {
    if (paramArrayOfChar != null)
    {
      int i = paramArrayOfChar.length;
      if (i != 0) {}
    }
    else
    {
      paramArrayOfChar = EMPTY_CHAR_ARRAY;
    }
    return paramArrayOfChar;
  }
  
  public static double[] nullToEmpty(double[] paramArrayOfDouble)
  {
    if (paramArrayOfDouble != null)
    {
      int i = paramArrayOfDouble.length;
      if (i != 0) {}
    }
    else
    {
      paramArrayOfDouble = EMPTY_DOUBLE_ARRAY;
    }
    return paramArrayOfDouble;
  }
  
  public static float[] nullToEmpty(float[] paramArrayOfFloat)
  {
    if (paramArrayOfFloat != null)
    {
      int i = paramArrayOfFloat.length;
      if (i != 0) {}
    }
    else
    {
      paramArrayOfFloat = EMPTY_FLOAT_ARRAY;
    }
    return paramArrayOfFloat;
  }
  
  public static int[] nullToEmpty(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt != null)
    {
      int i = paramArrayOfInt.length;
      if (i != 0) {}
    }
    else
    {
      paramArrayOfInt = EMPTY_INT_ARRAY;
    }
    return paramArrayOfInt;
  }
  
  public static long[] nullToEmpty(long[] paramArrayOfLong)
  {
    if (paramArrayOfLong != null)
    {
      int i = paramArrayOfLong.length;
      if (i != 0) {}
    }
    else
    {
      paramArrayOfLong = EMPTY_LONG_ARRAY;
    }
    return paramArrayOfLong;
  }
  
  public static Boolean[] nullToEmpty(Boolean[] paramArrayOfBoolean)
  {
    if (paramArrayOfBoolean != null)
    {
      int i = paramArrayOfBoolean.length;
      if (i != 0) {}
    }
    else
    {
      paramArrayOfBoolean = EMPTY_BOOLEAN_OBJECT_ARRAY;
    }
    return paramArrayOfBoolean;
  }
  
  public static Byte[] nullToEmpty(Byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null)
    {
      int i = paramArrayOfByte.length;
      if (i != 0) {}
    }
    else
    {
      paramArrayOfByte = EMPTY_BYTE_OBJECT_ARRAY;
    }
    return paramArrayOfByte;
  }
  
  public static Character[] nullToEmpty(Character[] paramArrayOfCharacter)
  {
    if (paramArrayOfCharacter != null)
    {
      int i = paramArrayOfCharacter.length;
      if (i != 0) {}
    }
    else
    {
      paramArrayOfCharacter = EMPTY_CHARACTER_OBJECT_ARRAY;
    }
    return paramArrayOfCharacter;
  }
  
  public static Double[] nullToEmpty(Double[] paramArrayOfDouble)
  {
    if (paramArrayOfDouble != null)
    {
      int i = paramArrayOfDouble.length;
      if (i != 0) {}
    }
    else
    {
      paramArrayOfDouble = EMPTY_DOUBLE_OBJECT_ARRAY;
    }
    return paramArrayOfDouble;
  }
  
  public static Float[] nullToEmpty(Float[] paramArrayOfFloat)
  {
    if (paramArrayOfFloat != null)
    {
      int i = paramArrayOfFloat.length;
      if (i != 0) {}
    }
    else
    {
      paramArrayOfFloat = EMPTY_FLOAT_OBJECT_ARRAY;
    }
    return paramArrayOfFloat;
  }
  
  public static Integer[] nullToEmpty(Integer[] paramArrayOfInteger)
  {
    if (paramArrayOfInteger != null)
    {
      int i = paramArrayOfInteger.length;
      if (i != 0) {}
    }
    else
    {
      paramArrayOfInteger = EMPTY_INTEGER_OBJECT_ARRAY;
    }
    return paramArrayOfInteger;
  }
  
  public static Long[] nullToEmpty(Long[] paramArrayOfLong)
  {
    if (paramArrayOfLong != null)
    {
      int i = paramArrayOfLong.length;
      if (i != 0) {}
    }
    else
    {
      paramArrayOfLong = EMPTY_LONG_OBJECT_ARRAY;
    }
    return paramArrayOfLong;
  }
  
  public static Object[] nullToEmpty(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject != null)
    {
      int i = paramArrayOfObject.length;
      if (i != 0) {}
    }
    else
    {
      paramArrayOfObject = EMPTY_OBJECT_ARRAY;
    }
    return paramArrayOfObject;
  }
  
  public static Short[] nullToEmpty(Short[] paramArrayOfShort)
  {
    if (paramArrayOfShort != null)
    {
      int i = paramArrayOfShort.length;
      if (i != 0) {}
    }
    else
    {
      paramArrayOfShort = EMPTY_SHORT_OBJECT_ARRAY;
    }
    return paramArrayOfShort;
  }
  
  public static String[] nullToEmpty(String[] paramArrayOfString)
  {
    if (paramArrayOfString != null)
    {
      int i = paramArrayOfString.length;
      if (i != 0) {}
    }
    else
    {
      paramArrayOfString = EMPTY_STRING_ARRAY;
    }
    return paramArrayOfString;
  }
  
  public static short[] nullToEmpty(short[] paramArrayOfShort)
  {
    if (paramArrayOfShort != null)
    {
      int i = paramArrayOfShort.length;
      if (i != 0) {}
    }
    else
    {
      paramArrayOfShort = EMPTY_SHORT_ARRAY;
    }
    return paramArrayOfShort;
  }
  
  public static boolean[] nullToEmpty(boolean[] paramArrayOfBoolean)
  {
    if (paramArrayOfBoolean != null)
    {
      int i = paramArrayOfBoolean.length;
      if (i != 0) {}
    }
    else
    {
      paramArrayOfBoolean = EMPTY_BOOLEAN_ARRAY;
    }
    return paramArrayOfBoolean;
  }
  
  private static Object remove(Object paramObject, int paramInt)
  {
    int i = getLength(paramObject);
    if ((paramInt < 0) || (paramInt >= i))
    {
      localObject1 = new java/lang/IndexOutOfBoundsException;
      Object localObject2 = new java/lang/StringBuffer;
      ((StringBuffer)localObject2).<init>();
      localObject2 = "Index: " + paramInt + ", Length: " + i;
      ((IndexOutOfBoundsException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = paramObject.getClass().getComponentType();
    int j = i + -1;
    Object localObject3 = Array.newInstance((Class)localObject1, j);
    System.arraycopy(paramObject, 0, localObject3, 0, paramInt);
    int k = i + -1;
    if (paramInt < k)
    {
      k = paramInt + 1;
      j = i - paramInt + -1;
      System.arraycopy(paramObject, k, localObject3, paramInt, j);
    }
    return localObject3;
  }
  
  public static byte[] remove(byte[] paramArrayOfByte, int paramInt)
  {
    return (byte[])remove(paramArrayOfByte, paramInt);
  }
  
  public static char[] remove(char[] paramArrayOfChar, int paramInt)
  {
    return (char[])remove(paramArrayOfChar, paramInt);
  }
  
  public static double[] remove(double[] paramArrayOfDouble, int paramInt)
  {
    return (double[])remove(paramArrayOfDouble, paramInt);
  }
  
  public static float[] remove(float[] paramArrayOfFloat, int paramInt)
  {
    return (float[])remove(paramArrayOfFloat, paramInt);
  }
  
  public static int[] remove(int[] paramArrayOfInt, int paramInt)
  {
    return (int[])remove(paramArrayOfInt, paramInt);
  }
  
  public static long[] remove(long[] paramArrayOfLong, int paramInt)
  {
    return (long[])remove(paramArrayOfLong, paramInt);
  }
  
  public static Object[] remove(Object[] paramArrayOfObject, int paramInt)
  {
    return (Object[])remove(paramArrayOfObject, paramInt);
  }
  
  public static short[] remove(short[] paramArrayOfShort, int paramInt)
  {
    return (short[])remove(paramArrayOfShort, paramInt);
  }
  
  public static boolean[] remove(boolean[] paramArrayOfBoolean, int paramInt)
  {
    return (boolean[])remove(paramArrayOfBoolean, paramInt);
  }
  
  public static byte[] removeElement(byte[] paramArrayOfByte, byte paramByte)
  {
    int i = indexOf(paramArrayOfByte, paramByte);
    int j = -1;
    if (i == j) {}
    for (byte[] arrayOfByte = clone(paramArrayOfByte);; arrayOfByte = remove(paramArrayOfByte, i)) {
      return arrayOfByte;
    }
  }
  
  public static char[] removeElement(char[] paramArrayOfChar, char paramChar)
  {
    int i = indexOf(paramArrayOfChar, paramChar);
    int j = -1;
    if (i == j) {}
    for (char[] arrayOfChar = clone(paramArrayOfChar);; arrayOfChar = remove(paramArrayOfChar, i)) {
      return arrayOfChar;
    }
  }
  
  public static double[] removeElement(double[] paramArrayOfDouble, double paramDouble)
  {
    int i = indexOf(paramArrayOfDouble, paramDouble);
    int j = -1;
    if (i == j) {}
    for (double[] arrayOfDouble = clone(paramArrayOfDouble);; arrayOfDouble = remove(paramArrayOfDouble, i)) {
      return arrayOfDouble;
    }
  }
  
  public static float[] removeElement(float[] paramArrayOfFloat, float paramFloat)
  {
    int i = indexOf(paramArrayOfFloat, paramFloat);
    int j = -1;
    if (i == j) {}
    for (float[] arrayOfFloat = clone(paramArrayOfFloat);; arrayOfFloat = remove(paramArrayOfFloat, i)) {
      return arrayOfFloat;
    }
  }
  
  public static int[] removeElement(int[] paramArrayOfInt, int paramInt)
  {
    int i = indexOf(paramArrayOfInt, paramInt);
    int j = -1;
    if (i == j) {}
    for (int[] arrayOfInt = clone(paramArrayOfInt);; arrayOfInt = remove(paramArrayOfInt, i)) {
      return arrayOfInt;
    }
  }
  
  public static long[] removeElement(long[] paramArrayOfLong, long paramLong)
  {
    int i = indexOf(paramArrayOfLong, paramLong);
    int j = -1;
    if (i == j) {}
    for (long[] arrayOfLong = clone(paramArrayOfLong);; arrayOfLong = remove(paramArrayOfLong, i)) {
      return arrayOfLong;
    }
  }
  
  public static Object[] removeElement(Object[] paramArrayOfObject, Object paramObject)
  {
    int i = indexOf(paramArrayOfObject, paramObject);
    int j = -1;
    if (i == j) {}
    for (Object[] arrayOfObject = clone(paramArrayOfObject);; arrayOfObject = remove(paramArrayOfObject, i)) {
      return arrayOfObject;
    }
  }
  
  public static short[] removeElement(short[] paramArrayOfShort, short paramShort)
  {
    int i = indexOf(paramArrayOfShort, paramShort);
    int j = -1;
    if (i == j) {}
    for (short[] arrayOfShort = clone(paramArrayOfShort);; arrayOfShort = remove(paramArrayOfShort, i)) {
      return arrayOfShort;
    }
  }
  
  public static boolean[] removeElement(boolean[] paramArrayOfBoolean, boolean paramBoolean)
  {
    int i = indexOf(paramArrayOfBoolean, paramBoolean);
    int j = -1;
    if (i == j) {}
    for (boolean[] arrayOfBoolean = clone(paramArrayOfBoolean);; arrayOfBoolean = remove(paramArrayOfBoolean, i)) {
      return arrayOfBoolean;
    }
  }
  
  public static void reverse(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {}
    for (;;)
    {
      return;
      int i = 0;
      int j = paramArrayOfByte.length;
      int k = j + -1;
      while (k > i)
      {
        int m = paramArrayOfByte[k];
        j = paramArrayOfByte[i];
        paramArrayOfByte[k] = j;
        paramArrayOfByte[i] = m;
        k += -1;
        i += 1;
      }
    }
  }
  
  public static void reverse(char[] paramArrayOfChar)
  {
    if (paramArrayOfChar == null) {}
    for (;;)
    {
      return;
      int i = 0;
      int j = paramArrayOfChar.length;
      int k = j + -1;
      while (k > i)
      {
        int m = paramArrayOfChar[k];
        j = paramArrayOfChar[i];
        paramArrayOfChar[k] = j;
        paramArrayOfChar[i] = m;
        k += -1;
        i += 1;
      }
    }
  }
  
  public static void reverse(double[] paramArrayOfDouble)
  {
    if (paramArrayOfDouble == null) {}
    for (;;)
    {
      return;
      int i = 0;
      int j = paramArrayOfDouble.length;
      int k = j + -1;
      while (k > i)
      {
        double d1 = paramArrayOfDouble[k];
        double d2 = paramArrayOfDouble[i];
        paramArrayOfDouble[k] = d2;
        paramArrayOfDouble[i] = d1;
        k += -1;
        i += 1;
      }
    }
  }
  
  public static void reverse(float[] paramArrayOfFloat)
  {
    if (paramArrayOfFloat == null) {}
    for (;;)
    {
      return;
      int i = 0;
      int j = paramArrayOfFloat.length;
      int k = j + -1;
      while (k > i)
      {
        float f1 = paramArrayOfFloat[k];
        float f2 = paramArrayOfFloat[i];
        paramArrayOfFloat[k] = f2;
        paramArrayOfFloat[i] = f1;
        k += -1;
        i += 1;
      }
    }
  }
  
  public static void reverse(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null) {}
    for (;;)
    {
      return;
      int i = 0;
      int j = paramArrayOfInt.length;
      int k = j + -1;
      while (k > i)
      {
        int m = paramArrayOfInt[k];
        j = paramArrayOfInt[i];
        paramArrayOfInt[k] = j;
        paramArrayOfInt[i] = m;
        k += -1;
        i += 1;
      }
    }
  }
  
  public static void reverse(long[] paramArrayOfLong)
  {
    if (paramArrayOfLong == null) {}
    for (;;)
    {
      return;
      int i = 0;
      int j = paramArrayOfLong.length;
      int k = j + -1;
      while (k > i)
      {
        long l1 = paramArrayOfLong[k];
        long l2 = paramArrayOfLong[i];
        paramArrayOfLong[k] = l2;
        paramArrayOfLong[i] = l1;
        k += -1;
        i += 1;
      }
    }
  }
  
  public static void reverse(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject == null) {}
    for (;;)
    {
      return;
      int i = 0;
      int j = paramArrayOfObject.length;
      int k = j + -1;
      while (k > i)
      {
        Object localObject1 = paramArrayOfObject[k];
        Object localObject2 = paramArrayOfObject[i];
        paramArrayOfObject[k] = localObject2;
        paramArrayOfObject[i] = localObject1;
        k += -1;
        i += 1;
      }
    }
  }
  
  public static void reverse(short[] paramArrayOfShort)
  {
    if (paramArrayOfShort == null) {}
    for (;;)
    {
      return;
      int i = 0;
      int j = paramArrayOfShort.length;
      int k = j + -1;
      while (k > i)
      {
        int m = paramArrayOfShort[k];
        j = paramArrayOfShort[i];
        paramArrayOfShort[k] = j;
        paramArrayOfShort[i] = m;
        k += -1;
        i += 1;
      }
    }
  }
  
  public static void reverse(boolean[] paramArrayOfBoolean)
  {
    if (paramArrayOfBoolean == null) {}
    for (;;)
    {
      return;
      int i = 0;
      int j = paramArrayOfBoolean.length;
      int k = j + -1;
      while (k > i)
      {
        int m = paramArrayOfBoolean[k];
        j = paramArrayOfBoolean[i];
        paramArrayOfBoolean[k] = j;
        paramArrayOfBoolean[i] = m;
        k += -1;
        i += 1;
      }
    }
  }
  
  public static byte[] subarray(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte;
    if (paramArrayOfByte == null) {
      arrayOfByte = null;
    }
    for (;;)
    {
      return arrayOfByte;
      if (paramInt1 < 0) {
        paramInt1 = 0;
      }
      int i = paramArrayOfByte.length;
      if (paramInt2 > i) {
        paramInt2 = paramArrayOfByte.length;
      }
      int j = paramInt2 - paramInt1;
      if (j <= 0)
      {
        arrayOfByte = EMPTY_BYTE_ARRAY;
      }
      else
      {
        arrayOfByte = new byte[j];
        i = 0;
        System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, j);
      }
    }
  }
  
  public static char[] subarray(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    char[] arrayOfChar;
    if (paramArrayOfChar == null) {
      arrayOfChar = null;
    }
    for (;;)
    {
      return arrayOfChar;
      if (paramInt1 < 0) {
        paramInt1 = 0;
      }
      int i = paramArrayOfChar.length;
      if (paramInt2 > i) {
        paramInt2 = paramArrayOfChar.length;
      }
      int j = paramInt2 - paramInt1;
      if (j <= 0)
      {
        arrayOfChar = EMPTY_CHAR_ARRAY;
      }
      else
      {
        arrayOfChar = new char[j];
        i = 0;
        System.arraycopy(paramArrayOfChar, paramInt1, arrayOfChar, 0, j);
      }
    }
  }
  
  public static double[] subarray(double[] paramArrayOfDouble, int paramInt1, int paramInt2)
  {
    double[] arrayOfDouble;
    if (paramArrayOfDouble == null) {
      arrayOfDouble = null;
    }
    for (;;)
    {
      return arrayOfDouble;
      if (paramInt1 < 0) {
        paramInt1 = 0;
      }
      int i = paramArrayOfDouble.length;
      if (paramInt2 > i) {
        paramInt2 = paramArrayOfDouble.length;
      }
      int j = paramInt2 - paramInt1;
      if (j <= 0)
      {
        arrayOfDouble = EMPTY_DOUBLE_ARRAY;
      }
      else
      {
        arrayOfDouble = new double[j];
        i = 0;
        System.arraycopy(paramArrayOfDouble, paramInt1, arrayOfDouble, 0, j);
      }
    }
  }
  
  public static float[] subarray(float[] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    float[] arrayOfFloat;
    if (paramArrayOfFloat == null) {
      arrayOfFloat = null;
    }
    for (;;)
    {
      return arrayOfFloat;
      if (paramInt1 < 0) {
        paramInt1 = 0;
      }
      int i = paramArrayOfFloat.length;
      if (paramInt2 > i) {
        paramInt2 = paramArrayOfFloat.length;
      }
      int j = paramInt2 - paramInt1;
      if (j <= 0)
      {
        arrayOfFloat = EMPTY_FLOAT_ARRAY;
      }
      else
      {
        arrayOfFloat = new float[j];
        i = 0;
        System.arraycopy(paramArrayOfFloat, paramInt1, arrayOfFloat, 0, j);
      }
    }
  }
  
  public static int[] subarray(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int[] arrayOfInt;
    if (paramArrayOfInt == null) {
      arrayOfInt = null;
    }
    for (;;)
    {
      return arrayOfInt;
      if (paramInt1 < 0) {
        paramInt1 = 0;
      }
      int i = paramArrayOfInt.length;
      if (paramInt2 > i) {
        paramInt2 = paramArrayOfInt.length;
      }
      int j = paramInt2 - paramInt1;
      if (j <= 0)
      {
        arrayOfInt = EMPTY_INT_ARRAY;
      }
      else
      {
        arrayOfInt = new int[j];
        i = 0;
        System.arraycopy(paramArrayOfInt, paramInt1, arrayOfInt, 0, j);
      }
    }
  }
  
  public static long[] subarray(long[] paramArrayOfLong, int paramInt1, int paramInt2)
  {
    long[] arrayOfLong;
    if (paramArrayOfLong == null) {
      arrayOfLong = null;
    }
    for (;;)
    {
      return arrayOfLong;
      if (paramInt1 < 0) {
        paramInt1 = 0;
      }
      int i = paramArrayOfLong.length;
      if (paramInt2 > i) {
        paramInt2 = paramArrayOfLong.length;
      }
      int j = paramInt2 - paramInt1;
      if (j <= 0)
      {
        arrayOfLong = EMPTY_LONG_ARRAY;
      }
      else
      {
        arrayOfLong = new long[j];
        i = 0;
        System.arraycopy(paramArrayOfLong, paramInt1, arrayOfLong, 0, j);
      }
    }
  }
  
  public static Object[] subarray(Object[] paramArrayOfObject, int paramInt1, int paramInt2)
  {
    int i;
    Object localObject1;
    if (paramArrayOfObject == null)
    {
      i = 0;
      localObject1 = null;
    }
    for (;;)
    {
      return (Object[])localObject1;
      if (paramInt1 < 0) {
        paramInt1 = 0;
      }
      i = paramArrayOfObject.length;
      if (paramInt2 > i) {
        paramInt2 = paramArrayOfObject.length;
      }
      int j = paramInt2 - paramInt1;
      localObject1 = paramArrayOfObject.getClass();
      Class localClass = ((Class)localObject1).getComponentType();
      if (j <= 0)
      {
        localObject1 = (Object[])Array.newInstance(localClass, 0);
      }
      else
      {
        localObject1 = (Object[])Array.newInstance(localClass, j);
        Object localObject2 = localObject1;
        localObject2 = (Object[])localObject1;
        System.arraycopy(paramArrayOfObject, paramInt1, localObject2, 0, j);
        localObject1 = localObject2;
      }
    }
  }
  
  public static short[] subarray(short[] paramArrayOfShort, int paramInt1, int paramInt2)
  {
    short[] arrayOfShort;
    if (paramArrayOfShort == null) {
      arrayOfShort = null;
    }
    for (;;)
    {
      return arrayOfShort;
      if (paramInt1 < 0) {
        paramInt1 = 0;
      }
      int i = paramArrayOfShort.length;
      if (paramInt2 > i) {
        paramInt2 = paramArrayOfShort.length;
      }
      int j = paramInt2 - paramInt1;
      if (j <= 0)
      {
        arrayOfShort = EMPTY_SHORT_ARRAY;
      }
      else
      {
        arrayOfShort = new short[j];
        i = 0;
        System.arraycopy(paramArrayOfShort, paramInt1, arrayOfShort, 0, j);
      }
    }
  }
  
  public static boolean[] subarray(boolean[] paramArrayOfBoolean, int paramInt1, int paramInt2)
  {
    boolean[] arrayOfBoolean;
    if (paramArrayOfBoolean == null) {
      arrayOfBoolean = null;
    }
    for (;;)
    {
      return arrayOfBoolean;
      if (paramInt1 < 0) {
        paramInt1 = 0;
      }
      int i = paramArrayOfBoolean.length;
      if (paramInt2 > i) {
        paramInt2 = paramArrayOfBoolean.length;
      }
      int j = paramInt2 - paramInt1;
      if (j <= 0)
      {
        arrayOfBoolean = EMPTY_BOOLEAN_ARRAY;
      }
      else
      {
        arrayOfBoolean = new boolean[j];
        i = 0;
        System.arraycopy(paramArrayOfBoolean, paramInt1, arrayOfBoolean, 0, j);
      }
    }
  }
  
  public static Map toMap(Object[] paramArrayOfObject)
  {
    Object localObject1;
    if (paramArrayOfObject == null) {
      localObject1 = null;
    }
    int i;
    int k;
    do
    {
      return (Map)localObject1;
      localObject1 = new java/util/HashMap;
      double d1 = paramArrayOfObject.length;
      double d2 = 1.5D;
      d1 *= d2;
      i = (int)d1;
      ((HashMap)localObject1).<init>(i);
      k = 0;
      i = paramArrayOfObject.length;
    } while (k >= i);
    Object localObject2 = paramArrayOfObject[k];
    boolean bool = localObject2 instanceof Map.Entry;
    Object localObject3;
    if (bool)
    {
      localObject3 = localObject2;
      localObject3 = (Map.Entry)localObject2;
      localObject4 = ((Map.Entry)localObject3).getKey();
      localObject5 = ((Map.Entry)localObject3).getValue();
      ((Map)localObject1).put(localObject4, localObject5);
    }
    for (;;)
    {
      k += 1;
      break;
      bool = localObject2 instanceof Object[];
      if (!bool) {
        break label259;
      }
      localObject4 = localObject2;
      localObject4 = (Object[])localObject2;
      localObject3 = localObject4;
      localObject3 = (Object[])localObject4;
      int j = localObject3.length;
      int m = 2;
      if (j < m)
      {
        localObject4 = new java/lang/IllegalArgumentException;
        localObject5 = new java/lang/StringBuffer;
        ((StringBuffer)localObject5).<init>();
        localObject5 = "Array element " + k + ", '" + localObject2 + "', has a length less than 2";
        ((IllegalArgumentException)localObject4).<init>((String)localObject5);
        throw ((Throwable)localObject4);
      }
      j = 0;
      localObject4 = localObject3[0];
      m = 1;
      localObject5 = localObject3[m];
      ((Map)localObject1).put(localObject4, localObject5);
    }
    label259:
    Object localObject4 = new java/lang/IllegalArgumentException;
    Object localObject5 = new java/lang/StringBuffer;
    ((StringBuffer)localObject5).<init>();
    localObject5 = "Array element " + k + ", '" + localObject2 + "', is neither of type Map.Entry nor an Array";
    ((IllegalArgumentException)localObject4).<init>((String)localObject5);
    throw ((Throwable)localObject4);
  }
  
  public static Boolean[] toObject(boolean[] paramArrayOfBoolean)
  {
    Boolean[] arrayOfBoolean;
    if (paramArrayOfBoolean == null) {
      arrayOfBoolean = null;
    }
    int j;
    do
    {
      for (;;)
      {
        return arrayOfBoolean;
        i = paramArrayOfBoolean.length;
        if (i != 0) {
          break;
        }
        arrayOfBoolean = EMPTY_BOOLEAN_OBJECT_ARRAY;
      }
      i = paramArrayOfBoolean.length;
      arrayOfBoolean = new Boolean[i];
      j = 0;
      i = paramArrayOfBoolean.length;
    } while (j >= i);
    int i = paramArrayOfBoolean[j];
    if (i != 0) {}
    for (Boolean localBoolean = Boolean.TRUE;; localBoolean = Boolean.FALSE)
    {
      arrayOfBoolean[j] = localBoolean;
      j += 1;
      break;
    }
  }
  
  public static Byte[] toObject(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {}
    for (Byte[] arrayOfByte = null;; arrayOfByte = EMPTY_BYTE_OBJECT_ARRAY)
    {
      return arrayOfByte;
      i = paramArrayOfByte.length;
      if (i != 0) {
        break;
      }
    }
    int i = paramArrayOfByte.length;
    arrayOfByte = new Byte[i];
    int j = 0;
    for (;;)
    {
      i = paramArrayOfByte.length;
      if (j >= i) {
        break;
      }
      Byte localByte = new java/lang/Byte;
      byte b = paramArrayOfByte[j];
      localByte.<init>(b);
      arrayOfByte[j] = localByte;
      j += 1;
    }
  }
  
  public static Character[] toObject(char[] paramArrayOfChar)
  {
    if (paramArrayOfChar == null) {}
    for (Character[] arrayOfCharacter = null;; arrayOfCharacter = EMPTY_CHARACTER_OBJECT_ARRAY)
    {
      return arrayOfCharacter;
      i = paramArrayOfChar.length;
      if (i != 0) {
        break;
      }
    }
    int i = paramArrayOfChar.length;
    arrayOfCharacter = new Character[i];
    int j = 0;
    for (;;)
    {
      i = paramArrayOfChar.length;
      if (j >= i) {
        break;
      }
      Character localCharacter = new java/lang/Character;
      char c = paramArrayOfChar[j];
      localCharacter.<init>(c);
      arrayOfCharacter[j] = localCharacter;
      j += 1;
    }
  }
  
  public static Double[] toObject(double[] paramArrayOfDouble)
  {
    if (paramArrayOfDouble == null) {}
    for (Double[] arrayOfDouble = null;; arrayOfDouble = EMPTY_DOUBLE_OBJECT_ARRAY)
    {
      return arrayOfDouble;
      i = paramArrayOfDouble.length;
      if (i != 0) {
        break;
      }
    }
    int i = paramArrayOfDouble.length;
    arrayOfDouble = new Double[i];
    int j = 0;
    for (;;)
    {
      i = paramArrayOfDouble.length;
      if (j >= i) {
        break;
      }
      Double localDouble = new java/lang/Double;
      double d = paramArrayOfDouble[j];
      localDouble.<init>(d);
      arrayOfDouble[j] = localDouble;
      j += 1;
    }
  }
  
  public static Float[] toObject(float[] paramArrayOfFloat)
  {
    if (paramArrayOfFloat == null) {}
    for (Float[] arrayOfFloat = null;; arrayOfFloat = EMPTY_FLOAT_OBJECT_ARRAY)
    {
      return arrayOfFloat;
      i = paramArrayOfFloat.length;
      if (i != 0) {
        break;
      }
    }
    int i = paramArrayOfFloat.length;
    arrayOfFloat = new Float[i];
    int j = 0;
    for (;;)
    {
      i = paramArrayOfFloat.length;
      if (j >= i) {
        break;
      }
      Float localFloat = new java/lang/Float;
      float f = paramArrayOfFloat[j];
      localFloat.<init>(f);
      arrayOfFloat[j] = localFloat;
      j += 1;
    }
  }
  
  public static Integer[] toObject(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null) {}
    for (Integer[] arrayOfInteger = null;; arrayOfInteger = EMPTY_INTEGER_OBJECT_ARRAY)
    {
      return arrayOfInteger;
      i = paramArrayOfInt.length;
      if (i != 0) {
        break;
      }
    }
    int i = paramArrayOfInt.length;
    arrayOfInteger = new Integer[i];
    int j = 0;
    for (;;)
    {
      i = paramArrayOfInt.length;
      if (j >= i) {
        break;
      }
      Integer localInteger = new java/lang/Integer;
      int k = paramArrayOfInt[j];
      localInteger.<init>(k);
      arrayOfInteger[j] = localInteger;
      j += 1;
    }
  }
  
  public static Long[] toObject(long[] paramArrayOfLong)
  {
    if (paramArrayOfLong == null) {}
    for (Long[] arrayOfLong = null;; arrayOfLong = EMPTY_LONG_OBJECT_ARRAY)
    {
      return arrayOfLong;
      i = paramArrayOfLong.length;
      if (i != 0) {
        break;
      }
    }
    int i = paramArrayOfLong.length;
    arrayOfLong = new Long[i];
    int j = 0;
    for (;;)
    {
      i = paramArrayOfLong.length;
      if (j >= i) {
        break;
      }
      Long localLong = new java/lang/Long;
      long l = paramArrayOfLong[j];
      localLong.<init>(l);
      arrayOfLong[j] = localLong;
      j += 1;
    }
  }
  
  public static Short[] toObject(short[] paramArrayOfShort)
  {
    if (paramArrayOfShort == null) {}
    for (Short[] arrayOfShort = null;; arrayOfShort = EMPTY_SHORT_OBJECT_ARRAY)
    {
      return arrayOfShort;
      i = paramArrayOfShort.length;
      if (i != 0) {
        break;
      }
    }
    int i = paramArrayOfShort.length;
    arrayOfShort = new Short[i];
    int j = 0;
    for (;;)
    {
      i = paramArrayOfShort.length;
      if (j >= i) {
        break;
      }
      Short localShort = new java/lang/Short;
      short s = paramArrayOfShort[j];
      localShort.<init>(s);
      arrayOfShort[j] = localShort;
      j += 1;
    }
  }
  
  public static byte[] toPrimitive(Byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {}
    for (byte[] arrayOfByte = null;; arrayOfByte = EMPTY_BYTE_ARRAY)
    {
      return arrayOfByte;
      i = paramArrayOfByte.length;
      if (i != 0) {
        break;
      }
    }
    int i = paramArrayOfByte.length;
    arrayOfByte = new byte[i];
    int j = 0;
    for (;;)
    {
      i = paramArrayOfByte.length;
      if (j >= i) {
        break;
      }
      Byte localByte = paramArrayOfByte[j];
      i = localByte.byteValue();
      arrayOfByte[j] = i;
      j += 1;
    }
  }
  
  public static byte[] toPrimitive(Byte[] paramArrayOfByte, byte paramByte)
  {
    byte[] arrayOfByte;
    if (paramArrayOfByte == null) {
      arrayOfByte = null;
    }
    int j;
    do
    {
      for (;;)
      {
        return arrayOfByte;
        i = paramArrayOfByte.length;
        if (i != 0) {
          break;
        }
        arrayOfByte = EMPTY_BYTE_ARRAY;
      }
      i = paramArrayOfByte.length;
      arrayOfByte = new byte[i];
      j = 0;
      i = paramArrayOfByte.length;
    } while (j >= i);
    Byte localByte = paramArrayOfByte[j];
    if (localByte == null) {}
    for (int i = paramByte;; i = localByte.byteValue())
    {
      arrayOfByte[j] = i;
      j += 1;
      break;
    }
  }
  
  public static char[] toPrimitive(Character[] paramArrayOfCharacter)
  {
    if (paramArrayOfCharacter == null) {}
    for (char[] arrayOfChar = null;; arrayOfChar = EMPTY_CHAR_ARRAY)
    {
      return arrayOfChar;
      i = paramArrayOfCharacter.length;
      if (i != 0) {
        break;
      }
    }
    int i = paramArrayOfCharacter.length;
    arrayOfChar = new char[i];
    int j = 0;
    for (;;)
    {
      i = paramArrayOfCharacter.length;
      if (j >= i) {
        break;
      }
      Character localCharacter = paramArrayOfCharacter[j];
      i = localCharacter.charValue();
      arrayOfChar[j] = i;
      j += 1;
    }
  }
  
  public static char[] toPrimitive(Character[] paramArrayOfCharacter, char paramChar)
  {
    char[] arrayOfChar;
    if (paramArrayOfCharacter == null) {
      arrayOfChar = null;
    }
    int j;
    do
    {
      for (;;)
      {
        return arrayOfChar;
        i = paramArrayOfCharacter.length;
        if (i != 0) {
          break;
        }
        arrayOfChar = EMPTY_CHAR_ARRAY;
      }
      i = paramArrayOfCharacter.length;
      arrayOfChar = new char[i];
      j = 0;
      i = paramArrayOfCharacter.length;
    } while (j >= i);
    Character localCharacter = paramArrayOfCharacter[j];
    if (localCharacter == null) {}
    for (int i = paramChar;; i = localCharacter.charValue())
    {
      arrayOfChar[j] = i;
      j += 1;
      break;
    }
  }
  
  public static double[] toPrimitive(Double[] paramArrayOfDouble)
  {
    if (paramArrayOfDouble == null) {}
    for (double[] arrayOfDouble = null;; arrayOfDouble = EMPTY_DOUBLE_ARRAY)
    {
      return arrayOfDouble;
      i = paramArrayOfDouble.length;
      if (i != 0) {
        break;
      }
    }
    int i = paramArrayOfDouble.length;
    arrayOfDouble = new double[i];
    int j = 0;
    for (;;)
    {
      i = paramArrayOfDouble.length;
      if (j >= i) {
        break;
      }
      Double localDouble = paramArrayOfDouble[j];
      double d = localDouble.doubleValue();
      arrayOfDouble[j] = d;
      j += 1;
    }
  }
  
  public static double[] toPrimitive(Double[] paramArrayOfDouble, double paramDouble)
  {
    double[] arrayOfDouble;
    if (paramArrayOfDouble == null) {
      arrayOfDouble = null;
    }
    int i;
    int j;
    do
    {
      for (;;)
      {
        return arrayOfDouble;
        i = paramArrayOfDouble.length;
        if (i != 0) {
          break;
        }
        arrayOfDouble = EMPTY_DOUBLE_ARRAY;
      }
      i = paramArrayOfDouble.length;
      arrayOfDouble = new double[i];
      j = 0;
      i = paramArrayOfDouble.length;
    } while (j >= i);
    Double localDouble = paramArrayOfDouble[j];
    if (localDouble == null) {}
    for (double d = paramDouble;; d = localDouble.doubleValue())
    {
      arrayOfDouble[j] = d;
      j += 1;
      break;
    }
  }
  
  public static float[] toPrimitive(Float[] paramArrayOfFloat)
  {
    if (paramArrayOfFloat == null) {}
    for (float[] arrayOfFloat = null;; arrayOfFloat = EMPTY_FLOAT_ARRAY)
    {
      return arrayOfFloat;
      i = paramArrayOfFloat.length;
      if (i != 0) {
        break;
      }
    }
    int i = paramArrayOfFloat.length;
    arrayOfFloat = new float[i];
    int j = 0;
    for (;;)
    {
      i = paramArrayOfFloat.length;
      if (j >= i) {
        break;
      }
      Float localFloat = paramArrayOfFloat[j];
      float f = localFloat.floatValue();
      arrayOfFloat[j] = f;
      j += 1;
    }
  }
  
  public static float[] toPrimitive(Float[] paramArrayOfFloat, float paramFloat)
  {
    float[] arrayOfFloat;
    if (paramArrayOfFloat == null) {
      arrayOfFloat = null;
    }
    int i;
    int j;
    do
    {
      for (;;)
      {
        return arrayOfFloat;
        i = paramArrayOfFloat.length;
        if (i != 0) {
          break;
        }
        arrayOfFloat = EMPTY_FLOAT_ARRAY;
      }
      i = paramArrayOfFloat.length;
      arrayOfFloat = new float[i];
      j = 0;
      i = paramArrayOfFloat.length;
    } while (j >= i);
    Float localFloat = paramArrayOfFloat[j];
    if (localFloat == null) {}
    for (float f = paramFloat;; f = localFloat.floatValue())
    {
      arrayOfFloat[j] = f;
      j += 1;
      break;
    }
  }
  
  public static int[] toPrimitive(Integer[] paramArrayOfInteger)
  {
    if (paramArrayOfInteger == null) {}
    for (int[] arrayOfInt = null;; arrayOfInt = EMPTY_INT_ARRAY)
    {
      return arrayOfInt;
      i = paramArrayOfInteger.length;
      if (i != 0) {
        break;
      }
    }
    int i = paramArrayOfInteger.length;
    arrayOfInt = new int[i];
    int j = 0;
    for (;;)
    {
      i = paramArrayOfInteger.length;
      if (j >= i) {
        break;
      }
      Integer localInteger = paramArrayOfInteger[j];
      i = localInteger.intValue();
      arrayOfInt[j] = i;
      j += 1;
    }
  }
  
  public static int[] toPrimitive(Integer[] paramArrayOfInteger, int paramInt)
  {
    int[] arrayOfInt;
    if (paramArrayOfInteger == null) {
      arrayOfInt = null;
    }
    int j;
    do
    {
      for (;;)
      {
        return arrayOfInt;
        i = paramArrayOfInteger.length;
        if (i != 0) {
          break;
        }
        arrayOfInt = EMPTY_INT_ARRAY;
      }
      i = paramArrayOfInteger.length;
      arrayOfInt = new int[i];
      j = 0;
      i = paramArrayOfInteger.length;
    } while (j >= i);
    Integer localInteger = paramArrayOfInteger[j];
    if (localInteger == null) {}
    for (int i = paramInt;; i = localInteger.intValue())
    {
      arrayOfInt[j] = i;
      j += 1;
      break;
    }
  }
  
  public static long[] toPrimitive(Long[] paramArrayOfLong)
  {
    if (paramArrayOfLong == null) {}
    for (long[] arrayOfLong = null;; arrayOfLong = EMPTY_LONG_ARRAY)
    {
      return arrayOfLong;
      i = paramArrayOfLong.length;
      if (i != 0) {
        break;
      }
    }
    int i = paramArrayOfLong.length;
    arrayOfLong = new long[i];
    int j = 0;
    for (;;)
    {
      i = paramArrayOfLong.length;
      if (j >= i) {
        break;
      }
      Long localLong = paramArrayOfLong[j];
      long l = localLong.longValue();
      arrayOfLong[j] = l;
      j += 1;
    }
  }
  
  public static long[] toPrimitive(Long[] paramArrayOfLong, long paramLong)
  {
    long[] arrayOfLong;
    if (paramArrayOfLong == null) {
      arrayOfLong = null;
    }
    int i;
    int j;
    do
    {
      for (;;)
      {
        return arrayOfLong;
        i = paramArrayOfLong.length;
        if (i != 0) {
          break;
        }
        arrayOfLong = EMPTY_LONG_ARRAY;
      }
      i = paramArrayOfLong.length;
      arrayOfLong = new long[i];
      j = 0;
      i = paramArrayOfLong.length;
    } while (j >= i);
    Long localLong = paramArrayOfLong[j];
    if (localLong == null) {}
    for (long l = paramLong;; l = localLong.longValue())
    {
      arrayOfLong[j] = l;
      j += 1;
      break;
    }
  }
  
  public static short[] toPrimitive(Short[] paramArrayOfShort)
  {
    if (paramArrayOfShort == null) {}
    for (short[] arrayOfShort = null;; arrayOfShort = EMPTY_SHORT_ARRAY)
    {
      return arrayOfShort;
      i = paramArrayOfShort.length;
      if (i != 0) {
        break;
      }
    }
    int i = paramArrayOfShort.length;
    arrayOfShort = new short[i];
    int j = 0;
    for (;;)
    {
      i = paramArrayOfShort.length;
      if (j >= i) {
        break;
      }
      Short localShort = paramArrayOfShort[j];
      i = localShort.shortValue();
      arrayOfShort[j] = i;
      j += 1;
    }
  }
  
  public static short[] toPrimitive(Short[] paramArrayOfShort, short paramShort)
  {
    short[] arrayOfShort;
    if (paramArrayOfShort == null) {
      arrayOfShort = null;
    }
    int j;
    do
    {
      for (;;)
      {
        return arrayOfShort;
        i = paramArrayOfShort.length;
        if (i != 0) {
          break;
        }
        arrayOfShort = EMPTY_SHORT_ARRAY;
      }
      i = paramArrayOfShort.length;
      arrayOfShort = new short[i];
      j = 0;
      i = paramArrayOfShort.length;
    } while (j >= i);
    Short localShort = paramArrayOfShort[j];
    if (localShort == null) {}
    for (int i = paramShort;; i = localShort.shortValue())
    {
      arrayOfShort[j] = i;
      j += 1;
      break;
    }
  }
  
  public static boolean[] toPrimitive(Boolean[] paramArrayOfBoolean)
  {
    if (paramArrayOfBoolean == null) {}
    for (boolean[] arrayOfBoolean = null;; arrayOfBoolean = EMPTY_BOOLEAN_ARRAY)
    {
      return arrayOfBoolean;
      i = paramArrayOfBoolean.length;
      if (i != 0) {
        break;
      }
    }
    int i = paramArrayOfBoolean.length;
    arrayOfBoolean = new boolean[i];
    int j = 0;
    for (;;)
    {
      i = paramArrayOfBoolean.length;
      if (j >= i) {
        break;
      }
      Boolean localBoolean = paramArrayOfBoolean[j];
      boolean bool = localBoolean.booleanValue();
      arrayOfBoolean[j] = bool;
      j += 1;
    }
  }
  
  public static boolean[] toPrimitive(Boolean[] paramArrayOfBoolean, boolean paramBoolean)
  {
    boolean[] arrayOfBoolean;
    if (paramArrayOfBoolean == null) {
      arrayOfBoolean = null;
    }
    int i;
    int j;
    do
    {
      for (;;)
      {
        return arrayOfBoolean;
        i = paramArrayOfBoolean.length;
        if (i != 0) {
          break;
        }
        arrayOfBoolean = EMPTY_BOOLEAN_ARRAY;
      }
      i = paramArrayOfBoolean.length;
      arrayOfBoolean = new boolean[i];
      j = 0;
      i = paramArrayOfBoolean.length;
    } while (j >= i);
    Boolean localBoolean = paramArrayOfBoolean[j];
    if (localBoolean == null) {}
    for (boolean bool = paramBoolean;; bool = localBoolean.booleanValue())
    {
      arrayOfBoolean[j] = bool;
      j += 1;
      break;
    }
  }
  
  public static String toString(Object paramObject)
  {
    return toString(paramObject, "{}");
  }
  
  public static String toString(Object paramObject, String paramString)
  {
    if (paramObject == null) {}
    for (;;)
    {
      return paramString;
      ToStringBuilder localToStringBuilder = new org/apache/commons/lang/builder/ToStringBuilder;
      ToStringStyle localToStringStyle = ToStringStyle.SIMPLE_STYLE;
      localToStringBuilder.<init>(paramObject, localToStringStyle);
      localToStringBuilder = localToStringBuilder.append(paramObject);
      paramString = localToStringBuilder.toString();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/ArrayUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */