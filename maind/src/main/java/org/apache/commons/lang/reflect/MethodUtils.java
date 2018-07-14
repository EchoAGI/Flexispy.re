package org.apache.commons.lang.reflect;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.ClassUtils;

public class MethodUtils
{
  public static Method getAccessibleMethod(Class paramClass1, String paramString, Class paramClass2)
  {
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = paramClass2;
    return getAccessibleMethod(paramClass1, paramString, arrayOfClass);
  }
  
  public static Method getAccessibleMethod(Class paramClass, String paramString, Class[] paramArrayOfClass)
  {
    try
    {
      localMethod = paramClass.getMethod(paramString, paramArrayOfClass);
      localMethod = getAccessibleMethod(localMethod);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        Method localMethod = null;
      }
    }
    return localMethod;
  }
  
  public static Method getAccessibleMethod(Method paramMethod)
  {
    boolean bool = MemberUtils.isAccessible(paramMethod);
    if (!bool) {
      paramMethod = null;
    }
    for (;;)
    {
      return paramMethod;
      Class localClass = paramMethod.getDeclaringClass();
      bool = Modifier.isPublic(localClass.getModifiers());
      if (!bool)
      {
        String str = paramMethod.getName();
        Class[] arrayOfClass = paramMethod.getParameterTypes();
        paramMethod = getAccessibleMethodFromInterfaceNest(localClass, str, arrayOfClass);
        if (paramMethod == null) {
          paramMethod = getAccessibleMethodFromSuperclass(localClass, str, arrayOfClass);
        }
      }
    }
  }
  
  private static Method getAccessibleMethodFromInterfaceNest(Class paramClass, String paramString, Class[] paramArrayOfClass)
  {
    Method localMethod = null;
    Class[] arrayOfClass;
    int i;
    Class localClass;
    if (paramClass != null)
    {
      arrayOfClass = paramClass.getInterfaces();
      i = 0;
      for (;;)
      {
        int j = arrayOfClass.length;
        if (i >= j) {
          break label77;
        }
        localClass = arrayOfClass[i];
        boolean bool = Modifier.isPublic(localClass.getModifiers());
        if (bool) {
          break;
        }
        label49:
        i += 1;
      }
    }
    try
    {
      localClass = arrayOfClass[i];
      localMethod = localClass.getDeclaredMethod(paramString, paramArrayOfClass);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
    if (localMethod != null) {}
    for (;;)
    {
      label77:
      paramClass = paramClass.getSuperclass();
      break;
      localClass = arrayOfClass[i];
      localMethod = getAccessibleMethodFromInterfaceNest(localClass, paramString, paramArrayOfClass);
      if (localMethod == null) {
        break label49;
      }
    }
    return localMethod;
  }
  
  private static Method getAccessibleMethodFromSuperclass(Class paramClass, String paramString, Class[] paramArrayOfClass)
  {
    Method localMethod = null;
    for (Class localClass = paramClass.getSuperclass();; localClass = localClass.getSuperclass()) {
      if (localClass != null)
      {
        boolean bool = Modifier.isPublic(localClass.getModifiers());
        if (!bool) {}
      }
      else
      {
        try
        {
          localMethod = localClass.getMethod(paramString, paramArrayOfClass);
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          for (;;) {}
        }
        return localMethod;
      }
    }
  }
  
  public static Method getMatchingAccessibleMethod(Class paramClass, String paramString, Class[] paramArrayOfClass)
  {
    try
    {
      localObject1 = paramClass.getMethod(paramString, paramArrayOfClass);
      MemberUtils.setAccessibleWorkaround((AccessibleObject)localObject1);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        Object localObject3 = null;
        Method[] arrayOfMethod = paramClass.getMethods();
        int i = 0;
        int j = arrayOfMethod.length;
        while (i < j)
        {
          Object localObject2 = arrayOfMethod[i].getName();
          boolean bool1 = ((String)localObject2).equals(paramString);
          if (bool1)
          {
            localObject2 = arrayOfMethod[i].getParameterTypes();
            boolean bool2 = true;
            bool1 = ClassUtils.isAssignable(paramArrayOfClass, (Class[])localObject2, bool2);
            if (bool1)
            {
              localObject2 = arrayOfMethod[i];
              Method localMethod = getAccessibleMethod((Method)localObject2);
              if (localMethod != null) {
                if (localObject3 != null)
                {
                  localObject2 = localMethod.getParameterTypes();
                  Class[] arrayOfClass = ((Method)localObject3).getParameterTypes();
                  int k = MemberUtils.compareParameterTypes((Class[])localObject2, arrayOfClass, paramArrayOfClass);
                  if (k >= 0) {}
                }
                else
                {
                  localObject3 = localMethod;
                }
              }
            }
          }
          i += 1;
        }
        if (localObject3 != null) {
          MemberUtils.setAccessibleWorkaround((AccessibleObject)localObject3);
        }
        Object localObject1 = localObject3;
      }
    }
    return (Method)localObject1;
  }
  
  public static Object invokeExactMethod(Object paramObject1, String paramString, Object paramObject2)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramObject2;
    return invokeExactMethod(paramObject1, paramString, arrayOfObject);
  }
  
  public static Object invokeExactMethod(Object paramObject, String paramString, Object[] paramArrayOfObject)
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
    return invokeExactMethod(paramObject, paramString, paramArrayOfObject, arrayOfClass);
  }
  
  public static Object invokeExactMethod(Object paramObject, String paramString, Object[] paramArrayOfObject, Class[] paramArrayOfClass)
  {
    if (paramArrayOfObject == null) {
      paramArrayOfObject = ArrayUtils.EMPTY_OBJECT_ARRAY;
    }
    if (paramArrayOfClass == null) {
      paramArrayOfClass = ArrayUtils.EMPTY_CLASS_ARRAY;
    }
    Object localObject1 = paramObject.getClass();
    Method localMethod = getAccessibleMethod((Class)localObject1, paramString, paramArrayOfClass);
    if (localMethod == null)
    {
      localObject1 = new java/lang/NoSuchMethodException;
      Object localObject2 = new java/lang/StringBuffer;
      ((StringBuffer)localObject2).<init>();
      localObject2 = ((StringBuffer)localObject2).append("No such accessible method: ").append(paramString).append("() on object: ");
      String str = paramObject.getClass().getName();
      localObject2 = str;
      ((NoSuchMethodException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    return localMethod.invoke(paramObject, paramArrayOfObject);
  }
  
  public static Object invokeExactStaticMethod(Class paramClass, String paramString, Object paramObject)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramObject;
    return invokeExactStaticMethod(paramClass, paramString, arrayOfObject);
  }
  
  public static Object invokeExactStaticMethod(Class paramClass, String paramString, Object[] paramArrayOfObject)
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
    return invokeExactStaticMethod(paramClass, paramString, paramArrayOfObject, arrayOfClass);
  }
  
  public static Object invokeExactStaticMethod(Class paramClass, String paramString, Object[] paramArrayOfObject, Class[] paramArrayOfClass)
  {
    if (paramArrayOfObject == null) {
      paramArrayOfObject = ArrayUtils.EMPTY_OBJECT_ARRAY;
    }
    if (paramArrayOfClass == null) {
      paramArrayOfClass = ArrayUtils.EMPTY_CLASS_ARRAY;
    }
    Method localMethod = getAccessibleMethod(paramClass, paramString, paramArrayOfClass);
    if (localMethod == null)
    {
      NoSuchMethodException localNoSuchMethodException = new java/lang/NoSuchMethodException;
      Object localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      localObject = ((StringBuffer)localObject).append("No such accessible method: ").append(paramString).append("() on class: ");
      String str = paramClass.getName();
      localObject = str;
      localNoSuchMethodException.<init>((String)localObject);
      throw localNoSuchMethodException;
    }
    return localMethod.invoke(null, paramArrayOfObject);
  }
  
  public static Object invokeMethod(Object paramObject1, String paramString, Object paramObject2)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramObject2;
    return invokeMethod(paramObject1, paramString, arrayOfObject);
  }
  
  public static Object invokeMethod(Object paramObject, String paramString, Object[] paramArrayOfObject)
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
    return invokeMethod(paramObject, paramString, paramArrayOfObject, arrayOfClass);
  }
  
  public static Object invokeMethod(Object paramObject, String paramString, Object[] paramArrayOfObject, Class[] paramArrayOfClass)
  {
    if (paramArrayOfClass == null) {
      paramArrayOfClass = ArrayUtils.EMPTY_CLASS_ARRAY;
    }
    if (paramArrayOfObject == null) {
      paramArrayOfObject = ArrayUtils.EMPTY_OBJECT_ARRAY;
    }
    Object localObject1 = paramObject.getClass();
    Method localMethod = getMatchingAccessibleMethod((Class)localObject1, paramString, paramArrayOfClass);
    if (localMethod == null)
    {
      localObject1 = new java/lang/NoSuchMethodException;
      Object localObject2 = new java/lang/StringBuffer;
      ((StringBuffer)localObject2).<init>();
      localObject2 = ((StringBuffer)localObject2).append("No such accessible method: ").append(paramString).append("() on object: ");
      String str = paramObject.getClass().getName();
      localObject2 = str;
      ((NoSuchMethodException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    return localMethod.invoke(paramObject, paramArrayOfObject);
  }
  
  public static Object invokeStaticMethod(Class paramClass, String paramString, Object paramObject)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramObject;
    return invokeStaticMethod(paramClass, paramString, arrayOfObject);
  }
  
  public static Object invokeStaticMethod(Class paramClass, String paramString, Object[] paramArrayOfObject)
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
    return invokeStaticMethod(paramClass, paramString, paramArrayOfObject, arrayOfClass);
  }
  
  public static Object invokeStaticMethod(Class paramClass, String paramString, Object[] paramArrayOfObject, Class[] paramArrayOfClass)
  {
    if (paramArrayOfClass == null) {
      paramArrayOfClass = ArrayUtils.EMPTY_CLASS_ARRAY;
    }
    if (paramArrayOfObject == null) {
      paramArrayOfObject = ArrayUtils.EMPTY_OBJECT_ARRAY;
    }
    Method localMethod = getMatchingAccessibleMethod(paramClass, paramString, paramArrayOfClass);
    if (localMethod == null)
    {
      NoSuchMethodException localNoSuchMethodException = new java/lang/NoSuchMethodException;
      Object localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      localObject = ((StringBuffer)localObject).append("No such accessible method: ").append(paramString).append("() on class: ");
      String str = paramClass.getName();
      localObject = str;
      localNoSuchMethodException.<init>((String)localObject);
      throw localNoSuchMethodException;
    }
    return localMethod.invoke(null, paramArrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/reflect/MethodUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */