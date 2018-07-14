package org.apache.commons.lang.reflect;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.ClassUtils;

public class ConstructorUtils
{
  public static Constructor getAccessibleConstructor(Class paramClass1, Class paramClass2)
  {
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = paramClass2;
    return getAccessibleConstructor(paramClass1, arrayOfClass);
  }
  
  public static Constructor getAccessibleConstructor(Class paramClass, Class[] paramArrayOfClass)
  {
    try
    {
      localConstructor = paramClass.getConstructor(paramArrayOfClass);
      localConstructor = getAccessibleConstructor(localConstructor);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        Constructor localConstructor = null;
      }
    }
    return localConstructor;
  }
  
  public static Constructor getAccessibleConstructor(Constructor paramConstructor)
  {
    boolean bool = MemberUtils.isAccessible(paramConstructor);
    if (bool)
    {
      Class localClass = paramConstructor.getDeclaringClass();
      bool = Modifier.isPublic(localClass.getModifiers());
      if (!bool) {}
    }
    for (;;)
    {
      return paramConstructor;
      paramConstructor = null;
    }
  }
  
  public static Constructor getMatchingAccessibleConstructor(Class paramClass, Class[] paramArrayOfClass)
  {
    try
    {
      localObject1 = paramClass.getConstructor(paramArrayOfClass);
      MemberUtils.setAccessibleWorkaround((AccessibleObject)localObject1);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        Object localObject2 = null;
        Constructor[] arrayOfConstructor = paramClass.getConstructors();
        int i = 0;
        for (;;)
        {
          int j = arrayOfConstructor.length;
          if (i >= j) {
            break;
          }
          Class[] arrayOfClass1 = arrayOfConstructor[i].getParameterTypes();
          boolean bool2 = true;
          boolean bool1 = ClassUtils.isAssignable(paramArrayOfClass, arrayOfClass1, bool2);
          if (bool1)
          {
            arrayOfClass1 = arrayOfConstructor[i];
            localObject1 = getAccessibleConstructor(arrayOfClass1);
            if (localObject1 != null)
            {
              MemberUtils.setAccessibleWorkaround((AccessibleObject)localObject1);
              if (localObject2 != null)
              {
                arrayOfClass1 = ((Constructor)localObject1).getParameterTypes();
                Class[] arrayOfClass2 = ((Constructor)localObject2).getParameterTypes();
                int k = MemberUtils.compareParameterTypes(arrayOfClass1, arrayOfClass2, paramArrayOfClass);
                if (k >= 0) {}
              }
              else
              {
                localObject2 = localObject1;
              }
            }
          }
          i += 1;
        }
        Object localObject1 = localObject2;
      }
    }
    return (Constructor)localObject1;
  }
  
  public static Object invokeConstructor(Class paramClass, Object paramObject)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramObject;
    return invokeConstructor(paramClass, arrayOfObject);
  }
  
  public static Object invokeConstructor(Class paramClass, Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject == null) {
      paramArrayOfObject = ArrayUtils.EMPTY_OBJECT_ARRAY;
    }
    int i = paramArrayOfObject.length;
    Class[] arrayOfClass = new Class[i];
    int j = 0;
    for (;;)
    {
      i = paramArrayOfObject.length;
      if (j >= i) {
        break;
      }
      Class localClass = paramArrayOfObject[j].getClass();
      arrayOfClass[j] = localClass;
      j += 1;
    }
    return invokeConstructor(paramClass, paramArrayOfObject, arrayOfClass);
  }
  
  public static Object invokeConstructor(Class paramClass, Object[] paramArrayOfObject, Class[] paramArrayOfClass)
  {
    if (paramArrayOfClass == null) {
      paramArrayOfClass = ArrayUtils.EMPTY_CLASS_ARRAY;
    }
    if (paramArrayOfObject == null) {
      paramArrayOfObject = ArrayUtils.EMPTY_OBJECT_ARRAY;
    }
    Constructor localConstructor = getMatchingAccessibleConstructor(paramClass, paramArrayOfClass);
    if (localConstructor == null)
    {
      NoSuchMethodException localNoSuchMethodException = new java/lang/NoSuchMethodException;
      Object localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      localObject = ((StringBuffer)localObject).append("No such accessible constructor on object: ");
      String str = paramClass.getName();
      localObject = str;
      localNoSuchMethodException.<init>((String)localObject);
      throw localNoSuchMethodException;
    }
    return localConstructor.newInstance(paramArrayOfObject);
  }
  
  public static Object invokeExactConstructor(Class paramClass, Object paramObject)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramObject;
    return invokeExactConstructor(paramClass, arrayOfObject);
  }
  
  public static Object invokeExactConstructor(Class paramClass, Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject == null) {
      paramArrayOfObject = ArrayUtils.EMPTY_OBJECT_ARRAY;
    }
    int i = paramArrayOfObject.length;
    Class[] arrayOfClass = new Class[i];
    int j = 0;
    while (j < i)
    {
      Class localClass = paramArrayOfObject[j].getClass();
      arrayOfClass[j] = localClass;
      j += 1;
    }
    return invokeExactConstructor(paramClass, paramArrayOfObject, arrayOfClass);
  }
  
  public static Object invokeExactConstructor(Class paramClass, Object[] paramArrayOfObject, Class[] paramArrayOfClass)
  {
    if (paramArrayOfObject == null) {
      paramArrayOfObject = ArrayUtils.EMPTY_OBJECT_ARRAY;
    }
    if (paramArrayOfClass == null) {
      paramArrayOfClass = ArrayUtils.EMPTY_CLASS_ARRAY;
    }
    Constructor localConstructor = getAccessibleConstructor(paramClass, paramArrayOfClass);
    if (localConstructor == null)
    {
      NoSuchMethodException localNoSuchMethodException = new java/lang/NoSuchMethodException;
      Object localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      localObject = ((StringBuffer)localObject).append("No such accessible constructor on object: ");
      String str = paramClass.getName();
      localObject = str;
      localNoSuchMethodException.<init>((String)localObject);
      throw localNoSuchMethodException;
    }
    return localConstructor.newInstance(paramArrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/reflect/ConstructorUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */