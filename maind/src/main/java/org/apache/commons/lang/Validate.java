package org.apache.commons.lang;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class Validate
{
  public static void allElementsOfType(Collection paramCollection, Class paramClass)
  {
    notNull(paramCollection);
    notNull(paramClass);
    int i = 0;
    Iterator localIterator = paramCollection.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject1 = localIterator.next();
      bool = paramClass.isInstance(localObject1);
      if (!bool)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        Object localObject2 = new java/lang/StringBuffer;
        ((StringBuffer)localObject2).<init>();
        localObject2 = ((StringBuffer)localObject2).append("The validated collection contains an element not of type ");
        String str = paramClass.getName();
        localObject2 = str + " at index: " + i;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      i += 1;
    }
  }
  
  public static void allElementsOfType(Collection paramCollection, Class paramClass, String paramString)
  {
    notNull(paramCollection);
    notNull(paramClass);
    Iterator localIterator = paramCollection.iterator();
    boolean bool;
    do
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = localIterator.next();
      bool = paramClass.isInstance(localObject);
    } while (bool);
    Object localObject = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject).<init>(paramString);
    throw ((Throwable)localObject);
  }
  
  public static void isTrue(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The validated expression is false");
      throw localIllegalArgumentException;
    }
  }
  
  public static void isTrue(boolean paramBoolean, String paramString)
  {
    if (!paramBoolean)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>(paramString);
      throw localIllegalArgumentException;
    }
  }
  
  public static void isTrue(boolean paramBoolean, String paramString, double paramDouble)
  {
    if (!paramBoolean)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      localObject = paramString + paramDouble;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
  }
  
  public static void isTrue(boolean paramBoolean, String paramString, long paramLong)
  {
    if (!paramBoolean)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      localObject = paramString + paramLong;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
  }
  
  public static void isTrue(boolean paramBoolean, String paramString, Object paramObject)
  {
    if (!paramBoolean)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      localObject = paramString + paramObject;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
  }
  
  public static void noNullElements(Collection paramCollection)
  {
    notNull(paramCollection);
    int i = 0;
    Iterator localIterator = paramCollection.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject1 = localIterator.next();
      if (localObject1 == null)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        Object localObject2 = new java/lang/StringBuffer;
        ((StringBuffer)localObject2).<init>();
        localObject2 = "The validated collection contains null element at index: " + i;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      i += 1;
    }
  }
  
  public static void noNullElements(Collection paramCollection, String paramString)
  {
    notNull(paramCollection);
    Iterator localIterator = paramCollection.iterator();
    do
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = localIterator.next();
    } while (localObject != null);
    Object localObject = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject).<init>(paramString);
    throw ((Throwable)localObject);
  }
  
  public static void noNullElements(Object[] paramArrayOfObject)
  {
    notNull(paramArrayOfObject);
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfObject.length;
      if (i >= j) {
        break;
      }
      Object localObject1 = paramArrayOfObject[i];
      if (localObject1 == null)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        Object localObject2 = new java/lang/StringBuffer;
        ((StringBuffer)localObject2).<init>();
        localObject2 = "The validated array contains null element at index: " + i;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      i += 1;
    }
  }
  
  public static void noNullElements(Object[] paramArrayOfObject, String paramString)
  {
    notNull(paramArrayOfObject);
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfObject.length;
      if (i >= j) {
        break;
      }
      Object localObject = paramArrayOfObject[i];
      if (localObject == null)
      {
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>(paramString);
        throw ((Throwable)localObject);
      }
      i += 1;
    }
  }
  
  public static void notEmpty(String paramString)
  {
    notEmpty(paramString, "The validated string is empty");
  }
  
  public static void notEmpty(String paramString1, String paramString2)
  {
    if (paramString1 != null)
    {
      int i = paramString1.length();
      if (i != 0) {}
    }
    else
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>(paramString2);
      throw localIllegalArgumentException;
    }
  }
  
  public static void notEmpty(Collection paramCollection)
  {
    notEmpty(paramCollection, "The validated collection is empty");
  }
  
  public static void notEmpty(Collection paramCollection, String paramString)
  {
    if (paramCollection != null)
    {
      int i = paramCollection.size();
      if (i != 0) {}
    }
    else
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>(paramString);
      throw localIllegalArgumentException;
    }
  }
  
  public static void notEmpty(Map paramMap)
  {
    notEmpty(paramMap, "The validated map is empty");
  }
  
  public static void notEmpty(Map paramMap, String paramString)
  {
    if (paramMap != null)
    {
      int i = paramMap.size();
      if (i != 0) {}
    }
    else
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>(paramString);
      throw localIllegalArgumentException;
    }
  }
  
  public static void notEmpty(Object[] paramArrayOfObject)
  {
    notEmpty(paramArrayOfObject, "The validated array is empty");
  }
  
  public static void notEmpty(Object[] paramArrayOfObject, String paramString)
  {
    if (paramArrayOfObject != null)
    {
      int i = paramArrayOfObject.length;
      if (i != 0) {}
    }
    else
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>(paramString);
      throw localIllegalArgumentException;
    }
  }
  
  public static void notNull(Object paramObject)
  {
    notNull(paramObject, "The validated object is null");
  }
  
  public static void notNull(Object paramObject, String paramString)
  {
    if (paramObject == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>(paramString);
      throw localIllegalArgumentException;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/Validate.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */