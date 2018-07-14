package org.apache.commons.lang.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang.ClassUtils;

public class FieldUtils
{
  public static Field getDeclaredField(Class paramClass, String paramString)
  {
    return getDeclaredField(paramClass, paramString, false);
  }
  
  public static Field getDeclaredField(Class paramClass, String paramString, boolean paramBoolean)
  {
    IllegalArgumentException localIllegalArgumentException = null;
    if (paramClass == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The class must not be null");
      throw localIllegalArgumentException;
    }
    if (paramString == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The field name must not be null");
      throw localIllegalArgumentException;
    }
    for (;;)
    {
      try
      {
        localField = paramClass.getDeclaredField(paramString);
        boolean bool = MemberUtils.isAccessible(localField);
        if (!bool)
        {
          if (!paramBoolean) {
            continue;
          }
          bool = true;
          localField.setAccessible(bool);
        }
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        Field localField = null;
        continue;
      }
      return localField;
      localField = null;
    }
  }
  
  public static Field getField(Class paramClass, String paramString)
  {
    Field localField = getField(paramClass, paramString, false);
    MemberUtils.setAccessibleWorkaround(localField);
    return localField;
  }
  
  public static Field getField(Class paramClass, String paramString, boolean paramBoolean)
  {
    IllegalArgumentException localIllegalArgumentException;
    if (paramClass == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The class must not be null");
      throw localIllegalArgumentException;
    }
    if (paramString == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The field name must not be null");
      throw localIllegalArgumentException;
    }
    Class localClass = paramClass;
    if (localClass != null) {}
    for (;;)
    {
      boolean bool;
      try
      {
        localObject2 = localClass.getDeclaredField(paramString);
        int i = ((Field)localObject2).getModifiers();
        bool = Modifier.isPublic(i);
        if (!bool)
        {
          if (paramBoolean)
          {
            bool = true;
            ((Field)localObject2).setAccessible(bool);
          }
        }
        else {
          return (Field)localObject2;
        }
      }
      catch (NoSuchFieldException localNoSuchFieldException1)
      {
        localClass = localClass.getSuperclass();
      }
      break;
      Object localObject3 = null;
      Object localObject1 = ClassUtils.getAllInterfaces(paramClass);
      Iterator localIterator = ((List)localObject1).iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        Field localField;
        try
        {
          localObject1 = localIterator.next();
          localObject1 = (Class)localObject1;
          localField = ((Class)localObject1).getField(paramString);
          if (localObject3 == null) {
            break label238;
          }
          localObject1 = new java/lang/IllegalArgumentException;
          Object localObject4 = new java/lang/StringBuffer;
          ((StringBuffer)localObject4).<init>();
          String str = "Reference to field ";
          localObject4 = ((StringBuffer)localObject4).append(str);
          localObject4 = ((StringBuffer)localObject4).append(paramString);
          str = " is ambiguous relative to ";
          localObject4 = ((StringBuffer)localObject4).append(str);
          localObject4 = ((StringBuffer)localObject4).append(paramClass);
          str = "; a matching field exists on two or more implemented interfaces.";
          localObject4 = ((StringBuffer)localObject4).append(str);
          localObject4 = ((StringBuffer)localObject4).toString();
          ((IllegalArgumentException)localObject1).<init>((String)localObject4);
          throw ((Throwable)localObject1);
        }
        catch (NoSuchFieldException localNoSuchFieldException2) {}
        continue;
        label238:
        localObject3 = localField;
      }
      Object localObject2 = localObject3;
    }
  }
  
  public static Object readDeclaredField(Object paramObject, String paramString)
  {
    return readDeclaredField(paramObject, paramString, false);
  }
  
  public static Object readDeclaredField(Object paramObject, String paramString, boolean paramBoolean)
  {
    IllegalArgumentException localIllegalArgumentException;
    if (paramObject == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("target object must not be null");
      throw localIllegalArgumentException;
    }
    Class localClass = paramObject.getClass();
    Field localField = getDeclaredField(localClass, paramString, paramBoolean);
    if (localField == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      localObject = ((StringBuffer)localObject).append("Cannot locate declared field ");
      String str = localClass.getName();
      localObject = str + "." + paramString;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    return readField(localField, paramObject);
  }
  
  public static Object readDeclaredStaticField(Class paramClass, String paramString)
  {
    return readDeclaredStaticField(paramClass, paramString, false);
  }
  
  public static Object readDeclaredStaticField(Class paramClass, String paramString, boolean paramBoolean)
  {
    Field localField = getDeclaredField(paramClass, paramString, paramBoolean);
    if (localField == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      localObject = ((StringBuffer)localObject).append("Cannot locate declared field ");
      String str = paramClass.getName();
      localObject = str + "." + paramString;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    return readStaticField(localField, false);
  }
  
  public static Object readField(Object paramObject, String paramString)
  {
    return readField(paramObject, paramString, false);
  }
  
  public static Object readField(Object paramObject, String paramString, boolean paramBoolean)
  {
    IllegalArgumentException localIllegalArgumentException;
    if (paramObject == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("target object must not be null");
      throw localIllegalArgumentException;
    }
    Class localClass = paramObject.getClass();
    Field localField = getField(localClass, paramString, paramBoolean);
    if (localField == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      localObject = "Cannot locate field " + paramString + " on " + localClass;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    return readField(localField, paramObject);
  }
  
  public static Object readField(Field paramField, Object paramObject)
  {
    return readField(paramField, paramObject, false);
  }
  
  public static Object readField(Field paramField, Object paramObject, boolean paramBoolean)
  {
    if (paramField == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The field must not be null");
      throw localIllegalArgumentException;
    }
    if (paramBoolean)
    {
      boolean bool = paramField.isAccessible();
      if (!bool)
      {
        bool = true;
        paramField.setAccessible(bool);
      }
    }
    for (;;)
    {
      return paramField.get(paramObject);
      MemberUtils.setAccessibleWorkaround(paramField);
    }
  }
  
  public static Object readStaticField(Class paramClass, String paramString)
  {
    return readStaticField(paramClass, paramString, false);
  }
  
  public static Object readStaticField(Class paramClass, String paramString, boolean paramBoolean)
  {
    Field localField = getField(paramClass, paramString, paramBoolean);
    if (localField == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      localObject = "Cannot locate field " + paramString + " on " + paramClass;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    return readStaticField(localField, false);
  }
  
  public static Object readStaticField(Field paramField)
  {
    return readStaticField(paramField, false);
  }
  
  public static Object readStaticField(Field paramField, boolean paramBoolean)
  {
    if (paramField == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("The field must not be null");
      throw ((Throwable)localObject1);
    }
    boolean bool = Modifier.isStatic(paramField.getModifiers());
    if (!bool)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuffer;
      ((StringBuffer)localObject2).<init>();
      localObject2 = ((StringBuffer)localObject2).append("The field '");
      String str = paramField.getName();
      localObject2 = str + "' is not static";
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = (Object)null;
    return readField(paramField, null, paramBoolean);
  }
  
  public static void writeDeclaredField(Object paramObject1, String paramString, Object paramObject2)
  {
    writeDeclaredField(paramObject1, paramString, paramObject2, false);
  }
  
  public static void writeDeclaredField(Object paramObject1, String paramString, Object paramObject2, boolean paramBoolean)
  {
    IllegalArgumentException localIllegalArgumentException;
    if (paramObject1 == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("target object must not be null");
      throw localIllegalArgumentException;
    }
    Class localClass = paramObject1.getClass();
    Field localField = getDeclaredField(localClass, paramString, paramBoolean);
    if (localField == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      localObject = ((StringBuffer)localObject).append("Cannot locate declared field ");
      String str = localClass.getName();
      localObject = str + "." + paramString;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    writeField(localField, paramObject1, paramObject2);
  }
  
  public static void writeDeclaredStaticField(Class paramClass, String paramString, Object paramObject)
  {
    writeDeclaredStaticField(paramClass, paramString, paramObject, false);
  }
  
  public static void writeDeclaredStaticField(Class paramClass, String paramString, Object paramObject, boolean paramBoolean)
  {
    Field localField = getDeclaredField(paramClass, paramString, paramBoolean);
    if (localField == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuffer;
      ((StringBuffer)localObject2).<init>();
      localObject2 = ((StringBuffer)localObject2).append("Cannot locate declared field ");
      String str = paramClass.getName();
      localObject2 = str + "." + paramString;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = (Object)null;
    writeField(localField, null, paramObject);
  }
  
  public static void writeField(Object paramObject1, String paramString, Object paramObject2)
  {
    writeField(paramObject1, paramString, paramObject2, false);
  }
  
  public static void writeField(Object paramObject1, String paramString, Object paramObject2, boolean paramBoolean)
  {
    IllegalArgumentException localIllegalArgumentException;
    if (paramObject1 == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("target object must not be null");
      throw localIllegalArgumentException;
    }
    Class localClass = paramObject1.getClass();
    Field localField = getField(localClass, paramString, paramBoolean);
    if (localField == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      localObject = ((StringBuffer)localObject).append("Cannot locate declared field ");
      String str = localClass.getName();
      localObject = str + "." + paramString;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    writeField(localField, paramObject1, paramObject2);
  }
  
  public static void writeField(Field paramField, Object paramObject1, Object paramObject2)
  {
    writeField(paramField, paramObject1, paramObject2, false);
  }
  
  public static void writeField(Field paramField, Object paramObject1, Object paramObject2, boolean paramBoolean)
  {
    if (paramField == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The field must not be null");
      throw localIllegalArgumentException;
    }
    if (paramBoolean)
    {
      boolean bool = paramField.isAccessible();
      if (!bool)
      {
        bool = true;
        paramField.setAccessible(bool);
      }
    }
    for (;;)
    {
      paramField.set(paramObject1, paramObject2);
      return;
      MemberUtils.setAccessibleWorkaround(paramField);
    }
  }
  
  public static void writeStaticField(Class paramClass, String paramString, Object paramObject)
  {
    writeStaticField(paramClass, paramString, paramObject, false);
  }
  
  public static void writeStaticField(Class paramClass, String paramString, Object paramObject, boolean paramBoolean)
  {
    Field localField = getField(paramClass, paramString, paramBoolean);
    if (localField == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      localObject = "Cannot locate field " + paramString + " on " + paramClass;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    writeStaticField(localField, paramObject);
  }
  
  public static void writeStaticField(Field paramField, Object paramObject)
  {
    writeStaticField(paramField, paramObject, false);
  }
  
  public static void writeStaticField(Field paramField, Object paramObject, boolean paramBoolean)
  {
    if (paramField == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("The field must not be null");
      throw ((Throwable)localObject1);
    }
    boolean bool = Modifier.isStatic(paramField.getModifiers());
    if (!bool)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuffer;
      ((StringBuffer)localObject2).<init>();
      localObject2 = ((StringBuffer)localObject2).append("The field '");
      String str = paramField.getName();
      localObject2 = str + "' is not static";
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = (Object)null;
    writeField(paramField, null, paramObject, paramBoolean);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/reflect/FieldUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */