package a_vcard.com.android.internal.util;

import java.lang.reflect.Array;

public class ArrayUtils
{
  private static final int CACHE_SIZE = 73;
  private static Object[] EMPTY = new Object[0];
  private static Object[] sCache = new Object[73];
  
  public static boolean contains(Object[] paramArrayOfObject, Object paramObject)
  {
    boolean bool1 = true;
    Object[] arrayOfObject = paramArrayOfObject;
    int i = paramArrayOfObject.length;
    int j = 0;
    Object localObject;
    if (j < i)
    {
      localObject = arrayOfObject[j];
      if (localObject == null) {
        if (paramObject != null) {
          break label52;
        }
      }
    }
    for (;;)
    {
      return bool1;
      if (paramObject != null)
      {
        boolean bool2 = localObject.equals(paramObject);
        if (bool2) {}
      }
      else
      {
        label52:
        j += 1;
        break;
        bool1 = false;
      }
    }
  }
  
  public static Object[] emptyArray(Class paramClass)
  {
    Object localObject1 = Object.class;
    if (paramClass == localObject1) {}
    Object localObject2;
    for (localObject1 = (Object[])EMPTY;; localObject1 = localObject2)
    {
      return (Object[])localObject1;
      int i = System.identityHashCode(paramClass) / 8;
      int j = -1 >>> 1;
      i &= j;
      int k = i % 73;
      localObject1 = sCache;
      localObject2 = localObject1[k];
      if (localObject2 != null)
      {
        localObject1 = localObject2.getClass().getComponentType();
        if (localObject1 == paramClass) {}
      }
      else
      {
        i = 0;
        localObject2 = Array.newInstance(paramClass, 0);
        localObject1 = sCache;
        localObject1[k] = localObject2;
      }
      localObject2 = (Object[])localObject2;
    }
  }
  
  public static boolean equals(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt)
  {
    boolean bool = true;
    if (paramArrayOfByte1 == paramArrayOfByte2) {}
    label42:
    label82:
    for (;;)
    {
      return bool;
      int i;
      if ((paramArrayOfByte1 != null) && (paramArrayOfByte2 != null))
      {
        i = paramArrayOfByte1.length;
        if (i >= paramInt)
        {
          i = paramArrayOfByte2.length;
          if (i >= paramInt) {
            break label42;
          }
        }
      }
      bool = false;
      continue;
      int j = 0;
      for (;;)
      {
        if (j >= paramInt) {
          break label82;
        }
        i = paramArrayOfByte1[j];
        int k = paramArrayOfByte2[j];
        if (i != k)
        {
          bool = false;
          break;
        }
        j += 1;
      }
    }
  }
  
  public static int idealBooleanArraySize(int paramInt)
  {
    return idealByteArraySize(paramInt);
  }
  
  public static int idealByteArraySize(int paramInt)
  {
    int i = 1;
    int j = 4;
    for (;;)
    {
      int k = 32;
      if (j < k)
      {
        k = (i << j) + -12;
        if (paramInt <= k)
        {
          k = i << j;
          paramInt = k + -12;
        }
      }
      else
      {
        return paramInt;
      }
      j += 1;
    }
  }
  
  public static int idealCharArraySize(int paramInt)
  {
    return idealByteArraySize(paramInt * 2) / 2;
  }
  
  public static int idealFloatArraySize(int paramInt)
  {
    return idealByteArraySize(paramInt * 4) / 4;
  }
  
  public static int idealIntArraySize(int paramInt)
  {
    return idealByteArraySize(paramInt * 4) / 4;
  }
  
  public static int idealLongArraySize(int paramInt)
  {
    return idealByteArraySize(paramInt * 8) / 8;
  }
  
  public static int idealObjectArraySize(int paramInt)
  {
    return idealByteArraySize(paramInt * 4) / 4;
  }
  
  public static int idealShortArraySize(int paramInt)
  {
    return idealByteArraySize(paramInt * 2) / 2;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/a_vcard/com/android/internal/util/ArrayUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */