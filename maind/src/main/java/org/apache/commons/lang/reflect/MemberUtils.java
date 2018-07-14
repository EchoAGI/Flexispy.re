package org.apache.commons.lang.reflect;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.SystemUtils;

abstract class MemberUtils
{
  private static final int ACCESS_TEST = 7;
  private static final Method IS_SYNTHETIC;
  private static final Class[] ORDERED_PRIMITIVE_TYPES;
  static Class class$java$lang$reflect$Member;
  
  static
  {
    Method localMethod = null;
    float f = 1.5F;
    boolean bool = SystemUtils.isJavaVersionAtLeast(f);
    if (bool) {}
    for (;;)
    {
      try
      {
        localObject1 = class$java$lang$reflect$Member;
        if (localObject1 != null) {
          continue;
        }
        localObject1 = "java.lang.reflect.Member";
        localObject1 = class$((String)localObject1);
        class$java$lang$reflect$Member = (Class)localObject1;
        String str = "isSynthetic";
        localObject2 = ArrayUtils.EMPTY_CLASS_ARRAY;
        localMethod = ((Class)localObject1).getMethod(str, (Class[])localObject2);
      }
      catch (Exception localException)
      {
        Object localObject1;
        Object localObject2;
        continue;
      }
      IS_SYNTHETIC = localMethod;
      localObject1 = new Class[7];
      localObject2 = Byte.TYPE;
      localObject1[0] = localObject2;
      localObject2 = Short.TYPE;
      localObject1[1] = localObject2;
      localObject2 = Character.TYPE;
      localObject1[2] = localObject2;
      localObject2 = Integer.TYPE;
      localObject1[3] = localObject2;
      localObject2 = Long.TYPE;
      localObject1[4] = localObject2;
      localObject2 = Float.TYPE;
      localObject1[5] = localObject2;
      localObject2 = Double.TYPE;
      localObject1[6] = localObject2;
      ORDERED_PRIMITIVE_TYPES = (Class[])localObject1;
      return;
      localObject1 = class$java$lang$reflect$Member;
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
  
  static int compareParameterTypes(Class[] paramArrayOfClass1, Class[] paramArrayOfClass2, Class[] paramArrayOfClass3)
  {
    float f1 = getTotalTransformationCost(paramArrayOfClass3, paramArrayOfClass1);
    float f2 = getTotalTransformationCost(paramArrayOfClass3, paramArrayOfClass2);
    boolean bool1 = f1 < f2;
    int i;
    if (bool1) {
      i = -1;
    }
    for (;;)
    {
      return i;
      boolean bool2 = f2 < f1;
      if (bool2) {
        bool2 = true;
      } else {
        bool2 = false;
      }
    }
  }
  
  private static float getObjectTransformationCost(Class paramClass1, Class paramClass2)
  {
    boolean bool = paramClass2.isPrimitive();
    if (bool)
    {
      f1 = getPrimitivePromotionCost(paramClass1, paramClass2);
      return f1;
    }
    float f1 = 0.0F;
    for (;;)
    {
      if (paramClass2 != null)
      {
        bool = paramClass2.equals(paramClass1);
        if (!bool)
        {
          bool = paramClass2.isInterface();
          if (!bool) {
            break label83;
          }
          bool = ClassUtils.isAssignable(paramClass1, paramClass2);
          if (!bool) {
            break label83;
          }
          i = 1048576000;
          f2 = 0.25F;
          f1 += f2;
        }
      }
      if (paramClass2 != null) {
        break;
      }
      int i = 1069547520;
      float f2 = 1.5F;
      f1 += f2;
      break;
      label83:
      i = 1065353216;
      f2 = 1.0F;
      f1 += f2;
      paramClass2 = paramClass2.getSuperclass();
    }
  }
  
  private static float getPrimitivePromotionCost(Class paramClass1, Class paramClass2)
  {
    float f1 = 0.1F;
    float f2 = 0.0F;
    Class localClass = paramClass1;
    boolean bool = paramClass1.isPrimitive();
    if (!bool)
    {
      f2 = 0.0F + f1;
      localClass = ClassUtils.wrapperToPrimitive(paramClass1);
    }
    int j = 0;
    while (localClass != paramClass2)
    {
      Object localObject = ORDERED_PRIMITIVE_TYPES;
      int i = localObject.length;
      if (j >= i) {
        break;
      }
      localObject = ORDERED_PRIMITIVE_TYPES[j];
      if (localClass == localObject)
      {
        f2 += f1;
        localObject = ORDERED_PRIMITIVE_TYPES;
        i = localObject.length + -1;
        if (j < i)
        {
          localObject = ORDERED_PRIMITIVE_TYPES;
          int k = j + 1;
          localClass = localObject[k];
        }
      }
      j += 1;
    }
    return f2;
  }
  
  private static float getTotalTransformationCost(Class[] paramArrayOfClass1, Class[] paramArrayOfClass2)
  {
    float f1 = 0.0F;
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfClass1.length;
      if (i >= j) {
        break;
      }
      Class localClass1 = paramArrayOfClass1[i];
      Class localClass2 = paramArrayOfClass2[i];
      float f2 = getObjectTransformationCost(localClass1, localClass2);
      f1 += f2;
      i += 1;
    }
    return f1;
  }
  
  static boolean isAccessible(Member paramMember)
  {
    if (paramMember != null)
    {
      bool = Modifier.isPublic(paramMember.getModifiers());
      if (bool)
      {
        bool = isSynthetic(paramMember);
        if (bool) {}
      }
    }
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  static boolean isPackageAccess(int paramInt)
  {
    int i = paramInt & 0x7;
    if (i == 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  static boolean isSynthetic(Member paramMember)
  {
    Object localObject1 = IS_SYNTHETIC;
    if (localObject1 != null) {}
    for (;;)
    {
      try
      {
        localObject1 = IS_SYNTHETIC;
        localObject1 = ((Method)localObject1).invoke(paramMember, null);
        localObject1 = (Boolean)localObject1;
        bool = ((Boolean)localObject1).booleanValue();
        return bool;
      }
      catch (Exception localException) {}
      boolean bool = false;
      Object localObject2 = null;
    }
  }
  
  static void setAccessibleWorkaround(AccessibleObject paramAccessibleObject)
  {
    boolean bool;
    if (paramAccessibleObject != null)
    {
      bool = paramAccessibleObject.isAccessible();
      if (!bool) {
        break label14;
      }
    }
    for (;;)
    {
      return;
      label14:
      Object localObject = paramAccessibleObject;
      localObject = (Member)paramAccessibleObject;
      bool = Modifier.isPublic(((Member)localObject).getModifiers());
      if (bool)
      {
        Class localClass = ((Member)localObject).getDeclaringClass();
        bool = isPackageAccess(localClass.getModifiers());
        if (bool)
        {
          bool = true;
          try
          {
            paramAccessibleObject.setAccessible(bool);
          }
          catch (SecurityException localSecurityException) {}
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/reflect/MemberUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */