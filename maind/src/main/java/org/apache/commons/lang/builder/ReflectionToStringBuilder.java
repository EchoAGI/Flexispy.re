package org.apache.commons.lang.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.apache.commons.lang.ArrayUtils;

public class ReflectionToStringBuilder
  extends ToStringBuilder
{
  private boolean appendStatics = false;
  private boolean appendTransients = false;
  private String[] excludeFieldNames;
  private Class upToClass = null;
  
  public ReflectionToStringBuilder(Object paramObject)
  {
    super(paramObject);
  }
  
  public ReflectionToStringBuilder(Object paramObject, ToStringStyle paramToStringStyle)
  {
    super(paramObject, paramToStringStyle);
  }
  
  public ReflectionToStringBuilder(Object paramObject, ToStringStyle paramToStringStyle, StringBuffer paramStringBuffer)
  {
    super(paramObject, paramToStringStyle, paramStringBuffer);
  }
  
  public ReflectionToStringBuilder(Object paramObject, ToStringStyle paramToStringStyle, StringBuffer paramStringBuffer, Class paramClass, boolean paramBoolean)
  {
    super(paramObject, paramToStringStyle, paramStringBuffer);
    setUpToClass(paramClass);
    setAppendTransients(paramBoolean);
  }
  
  public ReflectionToStringBuilder(Object paramObject, ToStringStyle paramToStringStyle, StringBuffer paramStringBuffer, Class paramClass, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramObject, paramToStringStyle, paramStringBuffer);
    setUpToClass(paramClass);
    setAppendTransients(paramBoolean1);
    setAppendStatics(paramBoolean2);
  }
  
  static String[] toNoNullStringArray(Collection paramCollection)
  {
    if (paramCollection == null) {}
    for (String[] arrayOfString = ArrayUtils.EMPTY_STRING_ARRAY;; arrayOfString = toNoNullStringArray(paramCollection.toArray())) {
      return arrayOfString;
    }
  }
  
  static String[] toNoNullStringArray(Object[] paramArrayOfObject)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    int i = paramArrayOfObject.length;
    localArrayList.<init>(i);
    int j = 0;
    for (;;)
    {
      i = paramArrayOfObject.length;
      if (j >= i) {
        break;
      }
      Object localObject1 = paramArrayOfObject[j];
      if (localObject1 != null)
      {
        localObject2 = localObject1.toString();
        localArrayList.add(localObject2);
      }
      j += 1;
    }
    Object localObject2 = ArrayUtils.EMPTY_STRING_ARRAY;
    return (String[])localArrayList.toArray((Object[])localObject2);
  }
  
  public static String toString(Object paramObject)
  {
    return toString(paramObject, null, false, false, null);
  }
  
  public static String toString(Object paramObject, ToStringStyle paramToStringStyle)
  {
    return toString(paramObject, paramToStringStyle, false, false, null);
  }
  
  public static String toString(Object paramObject, ToStringStyle paramToStringStyle, boolean paramBoolean)
  {
    return toString(paramObject, paramToStringStyle, paramBoolean, false, null);
  }
  
  public static String toString(Object paramObject, ToStringStyle paramToStringStyle, boolean paramBoolean, Class paramClass)
  {
    ReflectionToStringBuilder localReflectionToStringBuilder = new org/apache/commons/lang/builder/ReflectionToStringBuilder;
    localReflectionToStringBuilder.<init>(paramObject, paramToStringStyle, null, paramClass, paramBoolean);
    return localReflectionToStringBuilder.toString();
  }
  
  public static String toString(Object paramObject, ToStringStyle paramToStringStyle, boolean paramBoolean1, boolean paramBoolean2)
  {
    return toString(paramObject, paramToStringStyle, paramBoolean1, paramBoolean2, null);
  }
  
  public static String toString(Object paramObject, ToStringStyle paramToStringStyle, boolean paramBoolean1, boolean paramBoolean2, Class paramClass)
  {
    ReflectionToStringBuilder localReflectionToStringBuilder = new org/apache/commons/lang/builder/ReflectionToStringBuilder;
    localReflectionToStringBuilder.<init>(paramObject, paramToStringStyle, null, paramClass, paramBoolean1, paramBoolean2);
    return localReflectionToStringBuilder.toString();
  }
  
  public static String toStringExclude(Object paramObject, String paramString)
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = paramString;
    return toStringExclude(paramObject, arrayOfString);
  }
  
  public static String toStringExclude(Object paramObject, Collection paramCollection)
  {
    String[] arrayOfString = toNoNullStringArray(paramCollection);
    return toStringExclude(paramObject, arrayOfString);
  }
  
  public static String toStringExclude(Object paramObject, String[] paramArrayOfString)
  {
    ReflectionToStringBuilder localReflectionToStringBuilder = new org/apache/commons/lang/builder/ReflectionToStringBuilder;
    localReflectionToStringBuilder.<init>(paramObject);
    return localReflectionToStringBuilder.setExcludeFieldNames(paramArrayOfString).toString();
  }
  
  protected boolean accept(Field paramField)
  {
    boolean bool1 = false;
    Object localObject = paramField.getName();
    int i = ((String)localObject).indexOf('$');
    int k = -1;
    if (i != k) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = Modifier.isTransient(paramField.getModifiers());
      if (bool2)
      {
        bool2 = isAppendTransients();
        if (!bool2) {}
      }
      else
      {
        bool2 = Modifier.isStatic(paramField.getModifiers());
        if (bool2)
        {
          bool2 = isAppendStatics();
          if (!bool2) {}
        }
        else
        {
          localObject = getExcludeFieldNames();
          if (localObject != null)
          {
            localObject = getExcludeFieldNames();
            String str = paramField.getName();
            int j = Arrays.binarySearch((Object[])localObject, str);
            if (j >= 0) {}
          }
          else
          {
            bool1 = true;
          }
        }
      }
    }
  }
  
  protected void appendFieldsIn(Class paramClass)
  {
    boolean bool1 = paramClass.isArray();
    Object localObject1;
    if (bool1)
    {
      localObject1 = getObject();
      reflectionAppendArray(localObject1);
      return;
    }
    Field[] arrayOfField = paramClass.getDeclaredFields();
    bool1 = true;
    AccessibleObject.setAccessible(arrayOfField, bool1);
    int j = 0;
    for (;;)
    {
      int i = arrayOfField.length;
      if (j >= i) {
        break;
      }
      Field localField = arrayOfField[j];
      String str1 = localField.getName();
      boolean bool2 = accept(localField);
      if (bool2) {}
      try
      {
        Object localObject2 = getValue(localField);
        append(str1, localObject2);
        j += 1;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        localObject1 = new java/lang/InternalError;
        Object localObject3 = new java/lang/StringBuffer;
        ((StringBuffer)localObject3).<init>();
        localObject3 = ((StringBuffer)localObject3).append("Unexpected IllegalAccessException: ");
        String str2 = localIllegalAccessException.getMessage();
        localObject3 = str2;
        ((InternalError)localObject1).<init>((String)localObject3);
        throw ((Throwable)localObject1);
      }
    }
  }
  
  public String[] getExcludeFieldNames()
  {
    return this.excludeFieldNames;
  }
  
  public Class getUpToClass()
  {
    return this.upToClass;
  }
  
  protected Object getValue(Field paramField)
  {
    Object localObject = getObject();
    return paramField.get(localObject);
  }
  
  public boolean isAppendStatics()
  {
    return this.appendStatics;
  }
  
  public boolean isAppendTransients()
  {
    return this.appendTransients;
  }
  
  public ToStringBuilder reflectionAppendArray(Object paramObject)
  {
    ToStringStyle localToStringStyle = getStyle();
    StringBuffer localStringBuffer = getStringBuffer();
    localToStringStyle.reflectionAppendArrayDetail(localStringBuffer, null, paramObject);
    return this;
  }
  
  public void setAppendStatics(boolean paramBoolean)
  {
    this.appendStatics = paramBoolean;
  }
  
  public void setAppendTransients(boolean paramBoolean)
  {
    this.appendTransients = paramBoolean;
  }
  
  public ReflectionToStringBuilder setExcludeFieldNames(String[] paramArrayOfString)
  {
    String[] arrayOfString;
    if (paramArrayOfString == null)
    {
      arrayOfString = null;
      this.excludeFieldNames = null;
    }
    for (;;)
    {
      return this;
      arrayOfString = toNoNullStringArray(paramArrayOfString);
      this.excludeFieldNames = arrayOfString;
      arrayOfString = this.excludeFieldNames;
      Arrays.sort(arrayOfString);
    }
  }
  
  public void setUpToClass(Class paramClass)
  {
    if (paramClass != null)
    {
      Object localObject = getObject();
      if (localObject != null)
      {
        boolean bool = paramClass.isInstance(localObject);
        if (!bool)
        {
          IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
          localIllegalArgumentException.<init>("Specified class is not a superclass of the object");
          throw localIllegalArgumentException;
        }
      }
    }
    this.upToClass = paramClass;
  }
  
  public String toString()
  {
    Object localObject = getObject();
    if (localObject == null) {}
    for (localObject = getStyle().getNullText();; localObject = super.toString())
    {
      return (String)localObject;
      localObject = getObject();
      Class localClass = localObject.getClass();
      appendFieldsIn(localClass);
      for (;;)
      {
        localObject = localClass.getSuperclass();
        if (localObject == null) {
          break;
        }
        localObject = getUpToClass();
        if (localClass == localObject) {
          break;
        }
        localClass = localClass.getSuperclass();
        appendFieldsIn(localClass);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/builder/ReflectionToStringBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */