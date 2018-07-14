package org.apache.commons.lang;

public class ObjectUtils
{
  public static final ObjectUtils.Null NULL;
  
  static
  {
    ObjectUtils.Null localNull = new org/apache/commons/lang/ObjectUtils$Null;
    localNull.<init>();
    NULL = localNull;
  }
  
  public static StringBuffer appendIdentityToString(StringBuffer paramStringBuffer, Object paramObject)
  {
    if (paramObject == null) {}
    String str;
    for (Object localObject = null;; localObject = ((StringBuffer)localObject).append(str))
    {
      return (StringBuffer)localObject;
      if (paramStringBuffer == null)
      {
        paramStringBuffer = new java/lang/StringBuffer;
        paramStringBuffer.<init>();
      }
      localObject = paramObject.getClass().getName();
      localObject = paramStringBuffer.append((String)localObject).append('@');
      int i = System.identityHashCode(paramObject);
      str = Integer.toHexString(i);
    }
  }
  
  public static Object defaultIfNull(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != null) {}
    for (;;)
    {
      return paramObject1;
      paramObject1 = paramObject2;
    }
  }
  
  public static boolean equals(Object paramObject1, Object paramObject2)
  {
    boolean bool;
    if (paramObject1 == paramObject2) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      if ((paramObject1 == null) || (paramObject2 == null)) {
        bool = false;
      } else {
        bool = paramObject1.equals(paramObject2);
      }
    }
  }
  
  public static int hashCode(Object paramObject)
  {
    if (paramObject == null) {}
    for (int i = 0;; i = paramObject.hashCode()) {
      return i;
    }
  }
  
  public static String identityToString(Object paramObject)
  {
    if (paramObject == null) {}
    StringBuffer localStringBuffer;
    for (String str = null;; str = localStringBuffer.toString())
    {
      return str;
      localStringBuffer = new java/lang/StringBuffer;
      localStringBuffer.<init>();
      identityToString(localStringBuffer, paramObject);
    }
  }
  
  public static void identityToString(StringBuffer paramStringBuffer, Object paramObject)
  {
    if (paramObject == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("Cannot get the toString of a null identity");
      throw ((Throwable)localObject);
    }
    Object localObject = paramObject.getClass().getName();
    localObject = paramStringBuffer.append((String)localObject).append('@');
    String str = Integer.toHexString(System.identityHashCode(paramObject));
    ((StringBuffer)localObject).append(str);
  }
  
  public static Object max(Comparable paramComparable1, Comparable paramComparable2)
  {
    if ((paramComparable1 != null) && (paramComparable2 != null))
    {
      int i = paramComparable1.compareTo(paramComparable2);
      if (i < 0) {}
    }
    for (;;)
    {
      return paramComparable1;
      paramComparable1 = paramComparable2;
      continue;
      if (paramComparable1 == null) {
        paramComparable1 = paramComparable2;
      }
    }
  }
  
  public static Object min(Comparable paramComparable1, Comparable paramComparable2)
  {
    if ((paramComparable1 != null) && (paramComparable2 != null))
    {
      int i = paramComparable1.compareTo(paramComparable2);
      int j = 1;
      if (i >= j) {}
    }
    for (;;)
    {
      return paramComparable1;
      paramComparable1 = paramComparable2;
      continue;
      if (paramComparable1 == null) {
        paramComparable1 = paramComparable2;
      }
    }
  }
  
  public static String toString(Object paramObject)
  {
    if (paramObject == null) {}
    for (String str = "";; str = paramObject.toString()) {
      return str;
    }
  }
  
  public static String toString(Object paramObject, String paramString)
  {
    if (paramObject == null) {}
    for (;;)
    {
      return paramString;
      paramString = paramObject.toString();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/ObjectUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */