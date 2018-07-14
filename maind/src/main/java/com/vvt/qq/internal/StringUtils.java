package com.vvt.qq.internal;

import java.lang.reflect.Field;

public class StringUtils
{
  static volatile boolean reflactCharArrayResult;
  static volatile boolean reflactDataResult;
  static Field sCountField;
  static Field sValueField;
  
  static
  {
    boolean bool = true;
    sValueField = null;
    sCountField = null;
    reflactDataResult = bool;
    reflactCharArrayResult = bool;
  }
  
  public static char[] getStringValue(StringBuilder paramStringBuilder)
  {
    try
    {
      localObject = sValueField;
      if (localObject == null)
      {
        localObject = StringBuilder.class;
        localObject = ((Class)localObject).getSuperclass();
        String str = "value";
        localObject = ((Class)localObject).getDeclaredField(str);
        sValueField = (Field)localObject;
        localObject = sValueField;
        boolean bool = true;
        ((Field)localObject).setAccessible(bool);
      }
      localObject = sValueField;
      localObject = ((Field)localObject).get(paramStringBuilder);
      localObject = (char[])localObject;
      localObject = (char[])localObject;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        localNoSuchFieldException.printStackTrace();
        localObject = null;
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        localIllegalArgumentException.printStackTrace();
        localObject = null;
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        localIllegalAccessException.printStackTrace();
        Object localObject = null;
      }
    }
    return (char[])localObject;
  }
  
  public static String newStringWithData(char[] paramArrayOfChar)
  {
    try
    {
      str1 = new java/lang/String;
      str1.<init>();
      boolean bool1 = reflactDataResult;
      if (!bool1) {
        break label133;
      }
      Object localObject1 = sValueField;
      boolean bool2;
      if (localObject1 == null)
      {
        localObject1 = String.class;
        localObject2 = "value";
        localObject1 = ((Class)localObject1).getDeclaredField((String)localObject2);
        sValueField = (Field)localObject1;
        localObject1 = sValueField;
        bool2 = true;
        ((Field)localObject1).setAccessible(bool2);
      }
      localObject1 = sCountField;
      if (localObject1 == null)
      {
        localObject1 = String.class;
        localObject2 = "count";
        localObject1 = ((Class)localObject1).getDeclaredField((String)localObject2);
        sCountField = (Field)localObject1;
        localObject1 = sCountField;
        bool2 = true;
        ((Field)localObject1).setAccessible(bool2);
      }
      localObject1 = sValueField;
      ((Field)localObject1).set(str1, paramArrayOfChar);
      localObject1 = sCountField;
      int i = paramArrayOfChar.length;
      Object localObject2 = Integer.valueOf(i);
      ((Field)localObject1).set(str1, localObject2);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        String str1;
        localNoSuchFieldException.printStackTrace();
        reflactDataResult = false;
        String str2 = new java/lang/String;
        str2.<init>(paramArrayOfChar);
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        localIllegalArgumentException.printStackTrace();
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        label133:
        localIllegalAccessException.printStackTrace();
      }
    }
    return str1;
  }
  
  public static char[] reflactCharArray(String paramString)
  {
    try
    {
      bool1 = reflactCharArrayResult;
      if (!bool1) {
        break label72;
      }
      localObject1 = sValueField;
      if (localObject1 == null)
      {
        localObject1 = String.class;
        String str = "value";
        localObject1 = ((Class)localObject1).getDeclaredField(str);
        sValueField = (Field)localObject1;
        localObject1 = sValueField;
        boolean bool2 = true;
        ((Field)localObject1).setAccessible(bool2);
      }
      localObject1 = sValueField;
      localObject1 = ((Field)localObject1).get(paramString);
      localObject1 = (char[])localObject1;
      localObject1 = (char[])localObject1;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        Object localObject1;
        localNoSuchFieldException.printStackTrace();
        reflactCharArrayResult = false;
        boolean bool1 = false;
        Object localObject2 = null;
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        localIllegalArgumentException.printStackTrace();
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        label72:
        localIllegalAccessException.printStackTrace();
      }
    }
    return (char[])localObject1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/StringUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */