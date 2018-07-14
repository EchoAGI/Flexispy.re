package org.apache.commons.lang;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ClassUtils
{
  public static final String INNER_CLASS_SEPARATOR;
  public static final char INNER_CLASS_SEPARATOR_CHAR = '$';
  public static final String PACKAGE_SEPARATOR = String.valueOf('.');
  public static final char PACKAGE_SEPARATOR_CHAR = '.';
  private static final Map abbreviationMap;
  static Class class$java$lang$Boolean;
  static Class class$java$lang$Byte;
  static Class class$java$lang$Character;
  static Class class$java$lang$Double;
  static Class class$java$lang$Float;
  static Class class$java$lang$Integer;
  static Class class$java$lang$Long;
  static Class class$java$lang$Short;
  static Class class$org$apache$commons$lang$ClassUtils;
  private static final Map primitiveWrapperMap;
  private static final Map reverseAbbreviationMap;
  private static final Map wrapperPrimitiveMap;
  
  static
  {
    char c = '$';
    INNER_CLASS_SEPARATOR = String.valueOf(c);
    Object localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    primitiveWrapperMap = (Map)localObject1;
    Object localObject2 = primitiveWrapperMap;
    Class localClass1 = Boolean.TYPE;
    localObject1 = class$java$lang$Boolean;
    if (localObject1 == null)
    {
      localObject1 = class$("java.lang.Boolean");
      class$java$lang$Boolean = (Class)localObject1;
      ((Map)localObject2).put(localClass1, localObject1);
      localObject2 = primitiveWrapperMap;
      localClass1 = Byte.TYPE;
      localObject1 = class$java$lang$Byte;
      if (localObject1 != null) {
        break label438;
      }
      localObject1 = class$("java.lang.Byte");
      class$java$lang$Byte = (Class)localObject1;
      label91:
      ((Map)localObject2).put(localClass1, localObject1);
      localObject2 = primitiveWrapperMap;
      localClass1 = Character.TYPE;
      localObject1 = class$java$lang$Character;
      if (localObject1 != null) {
        break label445;
      }
      localObject1 = class$("java.lang.Character");
      class$java$lang$Character = (Class)localObject1;
      label126:
      ((Map)localObject2).put(localClass1, localObject1);
      localObject2 = primitiveWrapperMap;
      localClass1 = Short.TYPE;
      localObject1 = class$java$lang$Short;
      if (localObject1 != null) {
        break label452;
      }
      localObject1 = class$("java.lang.Short");
      class$java$lang$Short = (Class)localObject1;
      label161:
      ((Map)localObject2).put(localClass1, localObject1);
      localObject2 = primitiveWrapperMap;
      localClass1 = Integer.TYPE;
      localObject1 = class$java$lang$Integer;
      if (localObject1 != null) {
        break label459;
      }
      localObject1 = class$("java.lang.Integer");
      class$java$lang$Integer = (Class)localObject1;
      label196:
      ((Map)localObject2).put(localClass1, localObject1);
      localObject2 = primitiveWrapperMap;
      localClass1 = Long.TYPE;
      localObject1 = class$java$lang$Long;
      if (localObject1 != null) {
        break label466;
      }
      localObject1 = class$("java.lang.Long");
      class$java$lang$Long = (Class)localObject1;
      label231:
      ((Map)localObject2).put(localClass1, localObject1);
      localObject2 = primitiveWrapperMap;
      localClass1 = Double.TYPE;
      localObject1 = class$java$lang$Double;
      if (localObject1 != null) {
        break label473;
      }
      localObject1 = class$("java.lang.Double");
      class$java$lang$Double = (Class)localObject1;
      label266:
      ((Map)localObject2).put(localClass1, localObject1);
      localObject2 = primitiveWrapperMap;
      localClass1 = Float.TYPE;
      localObject1 = class$java$lang$Float;
      if (localObject1 != null) {
        break label480;
      }
      localObject1 = class$("java.lang.Float");
      class$java$lang$Float = (Class)localObject1;
    }
    for (;;)
    {
      ((Map)localObject2).put(localClass1, localObject1);
      localObject1 = primitiveWrapperMap;
      localObject2 = Void.TYPE;
      localClass1 = Void.TYPE;
      ((Map)localObject1).put(localObject2, localClass1);
      localObject1 = new java/util/HashMap;
      ((HashMap)localObject1).<init>();
      wrapperPrimitiveMap = (Map)localObject1;
      localObject1 = primitiveWrapperMap.keySet();
      Iterator localIterator = ((Set)localObject1).iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        Class localClass2 = (Class)localIterator.next();
        localObject1 = primitiveWrapperMap;
        Class localClass3 = (Class)((Map)localObject1).get(localClass2);
        bool = localClass2.equals(localClass3);
        if (!bool)
        {
          localObject1 = wrapperPrimitiveMap;
          ((Map)localObject1).put(localClass3, localClass2);
        }
      }
      localObject1 = class$java$lang$Boolean;
      break;
      label438:
      localObject1 = class$java$lang$Byte;
      break label91;
      label445:
      localObject1 = class$java$lang$Character;
      break label126;
      label452:
      localObject1 = class$java$lang$Short;
      break label161;
      label459:
      localObject1 = class$java$lang$Integer;
      break label196;
      label466:
      localObject1 = class$java$lang$Long;
      break label231;
      label473:
      localObject1 = class$java$lang$Double;
      break label266;
      label480:
      localObject1 = class$java$lang$Float;
    }
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    abbreviationMap = (Map)localObject1;
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    reverseAbbreviationMap = (Map)localObject1;
    addAbbreviation("int", "I");
    addAbbreviation("boolean", "Z");
    addAbbreviation("float", "F");
    addAbbreviation("long", "J");
    addAbbreviation("short", "S");
    addAbbreviation("byte", "B");
    addAbbreviation("double", "D");
    addAbbreviation("char", "C");
  }
  
  private static void addAbbreviation(String paramString1, String paramString2)
  {
    abbreviationMap.put(paramString1, paramString2);
    reverseAbbreviationMap.put(paramString2, paramString1);
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
  
  public static List convertClassNamesToClasses(List paramList)
  {
    if (paramList == null)
    {
      localObject = null;
      return (List)localObject;
    }
    Object localObject = new java/util/ArrayList;
    int i = paramList.size();
    ((ArrayList)localObject).<init>(i);
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      String str = (String)localIterator.next();
      try
      {
        Class localClass = Class.forName(str);
        ((List)localObject).add(localClass);
      }
      catch (Exception localException)
      {
        ((List)localObject).add(null);
      }
    }
  }
  
  public static List convertClassesToClassNames(List paramList)
  {
    if (paramList == null)
    {
      localObject = null;
      return (List)localObject;
    }
    Object localObject = new java/util/ArrayList;
    int i = paramList.size();
    ((ArrayList)localObject).<init>(i);
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Class localClass = (Class)localIterator.next();
      if (localClass == null)
      {
        ((List)localObject).add(null);
      }
      else
      {
        String str = localClass.getName();
        ((List)localObject).add(str);
      }
    }
  }
  
  public static List getAllInterfaces(Class paramClass)
  {
    Object localObject;
    if (paramClass == null) {
      localObject = null;
    }
    for (;;)
    {
      return (List)localObject;
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      getAllInterfaces(paramClass, (List)localObject);
    }
  }
  
  private static void getAllInterfaces(Class paramClass, List paramList)
  {
    while (paramClass != null)
    {
      Class[] arrayOfClass = paramClass.getInterfaces();
      int i = 0;
      for (;;)
      {
        int j = arrayOfClass.length;
        if (i >= j) {
          break;
        }
        Class localClass = arrayOfClass[i];
        boolean bool = paramList.contains(localClass);
        if (!bool)
        {
          localClass = arrayOfClass[i];
          paramList.add(localClass);
          localClass = arrayOfClass[i];
          getAllInterfaces(localClass, paramList);
        }
        i += 1;
      }
      paramClass = paramClass.getSuperclass();
    }
  }
  
  public static List getAllSuperclasses(Class paramClass)
  {
    Object localObject;
    if (paramClass == null) {
      localObject = null;
    }
    for (;;)
    {
      return (List)localObject;
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      for (Class localClass = paramClass.getSuperclass(); localClass != null; localClass = localClass.getSuperclass()) {
        ((List)localObject).add(localClass);
      }
    }
  }
  
  private static String getCanonicalName(String paramString)
  {
    int i = 1;
    paramString = StringUtils.deleteWhitespace(paramString);
    if (paramString == null) {
      paramString = null;
    }
    for (;;)
    {
      return paramString;
      int j = 0;
      Object localObject;
      boolean bool;
      for (;;)
      {
        localObject = "[";
        bool = paramString.startsWith((String)localObject);
        if (!bool) {
          break;
        }
        j += 1;
        paramString = paramString.substring(i);
      }
      if (j >= i)
      {
        localObject = "L";
        bool = paramString.startsWith((String)localObject);
        int k;
        if (bool)
        {
          localObject = ";";
          bool = paramString.endsWith((String)localObject);
          if (bool)
          {
            k = paramString.length() + -1;
            paramString = paramString.substring(i, k);
          }
        }
        StringBuffer localStringBuffer;
        for (;;)
        {
          localStringBuffer = new java/lang/StringBuffer;
          localStringBuffer.<init>(paramString);
          int m = 0;
          while (m < j)
          {
            localObject = "[]";
            localStringBuffer.append((String)localObject);
            m += 1;
          }
          k = paramString.length();
          break;
          k = paramString.length();
          if (k > 0)
          {
            localObject = reverseAbbreviationMap;
            String str = paramString.substring(0, i);
            paramString = (String)((Map)localObject).get(str);
          }
        }
        paramString = localStringBuffer.toString();
      }
    }
  }
  
  public static Class getClass(ClassLoader paramClassLoader, String paramString)
  {
    return getClass(paramClassLoader, paramString, true);
  }
  
  public static Class getClass(ClassLoader paramClassLoader, String paramString, boolean paramBoolean)
  {
    Object localObject1 = abbreviationMap;
    boolean bool = ((Map)localObject1).containsKey(paramString);
    if (bool)
    {
      localObject1 = new java/lang/StringBuffer;
      ((StringBuffer)localObject1).<init>();
      localObject1 = ((StringBuffer)localObject1).append("[");
      Object localObject2 = abbreviationMap.get(paramString);
      String str = localObject2;
      localObject1 = Class.forName(str, paramBoolean, paramClassLoader);
    }
    for (Class localClass = ((Class)localObject1).getComponentType();; localClass = Class.forName((String)localObject1, paramBoolean, paramClassLoader))
    {
      return localClass;
      localObject1 = toCanonicalName(paramString);
    }
  }
  
  public static Class getClass(String paramString)
  {
    return getClass(paramString, true);
  }
  
  public static Class getClass(String paramString, boolean paramBoolean)
  {
    Object localObject = Thread.currentThread();
    ClassLoader localClassLoader1 = ((Thread)localObject).getContextClassLoader();
    if (localClassLoader1 == null)
    {
      localObject = class$org$apache$commons$lang$ClassUtils;
      if (localObject == null)
      {
        localObject = class$("org.apache.commons.lang.ClassUtils");
        class$org$apache$commons$lang$ClassUtils = (Class)localObject;
      }
    }
    for (ClassLoader localClassLoader2 = ((Class)localObject).getClassLoader();; localClassLoader2 = localClassLoader1)
    {
      return getClass(localClassLoader2, paramString, paramBoolean);
      localObject = class$org$apache$commons$lang$ClassUtils;
      break;
    }
  }
  
  public static String getPackageCanonicalName(Class paramClass)
  {
    if (paramClass == null) {}
    for (String str = "";; str = getPackageCanonicalName(paramClass.getName())) {
      return str;
    }
  }
  
  public static String getPackageCanonicalName(Object paramObject, String paramString)
  {
    if (paramObject == null) {}
    for (;;)
    {
      return paramString;
      String str = paramObject.getClass().getName();
      paramString = getPackageCanonicalName(str);
    }
  }
  
  public static String getPackageCanonicalName(String paramString)
  {
    return getPackageName(getCanonicalName(paramString));
  }
  
  public static String getPackageName(Class paramClass)
  {
    if (paramClass == null) {}
    for (String str = "";; str = getPackageName(paramClass.getName())) {
      return str;
    }
  }
  
  public static String getPackageName(Object paramObject, String paramString)
  {
    if (paramObject == null) {}
    for (;;)
    {
      return paramString;
      Class localClass = paramObject.getClass();
      paramString = getPackageName(localClass);
    }
  }
  
  public static String getPackageName(String paramString)
  {
    int i = 1;
    int j;
    String str;
    if (paramString != null)
    {
      j = paramString.length();
      if (j != 0) {}
    }
    else
    {
      str = "";
    }
    for (;;)
    {
      return str;
      for (;;)
      {
        j = paramString.charAt(0);
        k = 91;
        if (j != k) {
          break;
        }
        paramString = paramString.substring(i);
      }
      j = paramString.charAt(0);
      int k = 76;
      if (j == k)
      {
        j = paramString.length() + -1;
        j = paramString.charAt(j);
        k = 59;
        if (j == k) {
          paramString = paramString.substring(i);
        }
      }
      int m = paramString.lastIndexOf('.');
      j = -1;
      if (m == j) {
        str = "";
      } else {
        str = paramString.substring(0, m);
      }
    }
  }
  
  public static Method getPublicMethod(Class paramClass, String paramString, Class[] paramArrayOfClass)
  {
    Object localObject1 = paramClass.getMethod(paramString, paramArrayOfClass);
    Object localObject2 = ((Method)localObject1).getDeclaringClass();
    boolean bool = Modifier.isPublic(((Class)localObject2).getModifiers());
    if (bool) {
      return (Method)localObject1;
    }
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    localObject2 = getAllInterfaces(paramClass);
    localArrayList.addAll((Collection)localObject2);
    localObject2 = getAllSuperclasses(paramClass);
    localArrayList.addAll((Collection)localObject2);
    Iterator localIterator = localArrayList.iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break label163;
      }
      Class localClass = (Class)localIterator.next();
      bool = Modifier.isPublic(localClass.getModifiers());
      if (bool) {
        try
        {
          Method localMethod = localClass.getMethod(paramString, paramArrayOfClass);
          localObject2 = localMethod.getDeclaringClass();
          bool = Modifier.isPublic(((Class)localObject2).getModifiers());
          if (bool) {
            localObject1 = localMethod;
          }
        }
        catch (NoSuchMethodException localNoSuchMethodException) {}
      }
    }
    label163:
    localObject2 = new java/lang/NoSuchMethodException;
    Object localObject3 = new java/lang/StringBuffer;
    ((StringBuffer)localObject3).<init>();
    localObject3 = ((StringBuffer)localObject3).append("Can't find a public method for ").append(paramString).append(" ");
    String str = ArrayUtils.toString(paramArrayOfClass);
    localObject3 = str;
    ((NoSuchMethodException)localObject2).<init>((String)localObject3);
    throw ((Throwable)localObject2);
  }
  
  public static String getShortCanonicalName(Class paramClass)
  {
    if (paramClass == null) {}
    for (String str = "";; str = getShortCanonicalName(paramClass.getName())) {
      return str;
    }
  }
  
  public static String getShortCanonicalName(Object paramObject, String paramString)
  {
    if (paramObject == null) {}
    for (;;)
    {
      return paramString;
      String str = paramObject.getClass().getName();
      paramString = getShortCanonicalName(str);
    }
  }
  
  public static String getShortCanonicalName(String paramString)
  {
    return getShortClassName(getCanonicalName(paramString));
  }
  
  public static String getShortClassName(Class paramClass)
  {
    if (paramClass == null) {}
    for (String str = "";; str = getShortClassName(paramClass.getName())) {
      return str;
    }
  }
  
  public static String getShortClassName(Object paramObject, String paramString)
  {
    if (paramObject == null) {}
    for (;;)
    {
      return paramString;
      Class localClass = paramObject.getClass();
      paramString = getShortClassName(localClass);
    }
  }
  
  public static String getShortClassName(String paramString)
  {
    char c1 = '.';
    char c2 = '$';
    int i = 1;
    int j = -1;
    int k = 0;
    Object localObject1 = null;
    if (paramString == null) {}
    for (localObject1 = "";; localObject1 = "")
    {
      return (String)localObject1;
      int m = paramString.length();
      if (m != 0) {
        break;
      }
    }
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    Object localObject2 = "[";
    boolean bool1 = paramString.startsWith((String)localObject2);
    if (bool1)
    {
      for (;;)
      {
        n = paramString.charAt(0);
        i1 = 91;
        if (n != i1) {
          break;
        }
        paramString = paramString.substring(i);
        localObject2 = "[]";
        localStringBuffer.append((String)localObject2);
      }
      int n = paramString.charAt(0);
      int i1 = 76;
      if (n == i1)
      {
        n = paramString.length() + -1;
        n = paramString.charAt(n);
        i1 = 59;
        if (n == i1)
        {
          n = paramString.length() + -1;
          paramString = paramString.substring(i, n);
        }
      }
    }
    localObject2 = reverseAbbreviationMap;
    boolean bool2 = ((Map)localObject2).containsKey(paramString);
    if (bool2)
    {
      localObject2 = reverseAbbreviationMap;
      paramString = (String)((Map)localObject2).get(paramString);
    }
    int i2 = paramString.lastIndexOf(c1);
    if (i2 == j) {}
    for (;;)
    {
      int i3 = paramString.indexOf(c2, k);
      k = i2 + 1;
      String str = paramString.substring(k);
      if (i3 != j) {
        str = str.replace(c2, c1);
      }
      localObject1 = new java/lang/StringBuffer;
      ((StringBuffer)localObject1).<init>();
      localObject1 = str + localStringBuffer;
      break;
      k = i2 + 1;
    }
  }
  
  public static boolean isAssignable(Class paramClass1, Class paramClass2)
  {
    return isAssignable(paramClass1, paramClass2, false);
  }
  
  public static boolean isAssignable(Class paramClass1, Class paramClass2, boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    if (paramClass2 == null) {}
    for (;;)
    {
      return bool2;
      Class localClass1;
      if (paramClass1 == null)
      {
        bool3 = paramClass2.isPrimitive();
        if (!bool3) {}
        for (;;)
        {
          bool2 = bool1;
          break;
          bool1 = false;
          localClass1 = null;
        }
      }
      if (paramBoolean)
      {
        bool3 = paramClass1.isPrimitive();
        if (bool3)
        {
          bool3 = paramClass2.isPrimitive();
          if (!bool3)
          {
            paramClass1 = primitiveToWrapper(paramClass1);
            if (paramClass1 == null) {
              continue;
            }
          }
        }
        bool3 = paramClass2.isPrimitive();
        if (bool3)
        {
          bool3 = paramClass1.isPrimitive();
          if (!bool3)
          {
            paramClass1 = wrapperToPrimitive(paramClass1);
            if (paramClass1 == null) {
              continue;
            }
          }
        }
      }
      boolean bool3 = paramClass1.equals(paramClass2);
      if (bool3)
      {
        bool2 = bool1;
      }
      else
      {
        bool3 = paramClass1.isPrimitive();
        if (bool3)
        {
          bool3 = paramClass2.isPrimitive();
          if (bool3)
          {
            Class localClass2 = Integer.TYPE;
            bool3 = localClass2.equals(paramClass1);
            if (bool3)
            {
              localClass2 = Long.TYPE;
              bool3 = localClass2.equals(paramClass2);
              if (!bool3)
              {
                localClass2 = Float.TYPE;
                bool3 = localClass2.equals(paramClass2);
                if (!bool3)
                {
                  localClass2 = Double.TYPE;
                  bool3 = localClass2.equals(paramClass2);
                  if (!bool3) {
                    continue;
                  }
                }
              }
              bool2 = bool1;
            }
            else
            {
              localClass2 = Long.TYPE;
              bool3 = localClass2.equals(paramClass1);
              if (bool3)
              {
                localClass2 = Float.TYPE;
                bool3 = localClass2.equals(paramClass2);
                if (!bool3)
                {
                  localClass2 = Double.TYPE;
                  bool3 = localClass2.equals(paramClass2);
                  if (!bool3) {}
                }
                else
                {
                  bool2 = bool1;
                }
              }
              else
              {
                localClass2 = Boolean.TYPE;
                bool3 = localClass2.equals(paramClass1);
                if (!bool3)
                {
                  localClass2 = Double.TYPE;
                  bool3 = localClass2.equals(paramClass1);
                  if (!bool3)
                  {
                    localClass2 = Float.TYPE;
                    bool3 = localClass2.equals(paramClass1);
                    if (bool3)
                    {
                      localClass1 = Double.TYPE;
                      bool2 = localClass1.equals(paramClass2);
                    }
                    else
                    {
                      localClass2 = Character.TYPE;
                      bool3 = localClass2.equals(paramClass1);
                      if (bool3)
                      {
                        localClass2 = Integer.TYPE;
                        bool3 = localClass2.equals(paramClass2);
                        if (!bool3)
                        {
                          localClass2 = Long.TYPE;
                          bool3 = localClass2.equals(paramClass2);
                          if (!bool3)
                          {
                            localClass2 = Float.TYPE;
                            bool3 = localClass2.equals(paramClass2);
                            if (!bool3)
                            {
                              localClass2 = Double.TYPE;
                              bool3 = localClass2.equals(paramClass2);
                              if (!bool3) {
                                continue;
                              }
                            }
                          }
                        }
                        bool2 = bool1;
                      }
                      else
                      {
                        localClass2 = Short.TYPE;
                        bool3 = localClass2.equals(paramClass1);
                        if (bool3)
                        {
                          localClass2 = Integer.TYPE;
                          bool3 = localClass2.equals(paramClass2);
                          if (!bool3)
                          {
                            localClass2 = Long.TYPE;
                            bool3 = localClass2.equals(paramClass2);
                            if (!bool3)
                            {
                              localClass2 = Float.TYPE;
                              bool3 = localClass2.equals(paramClass2);
                              if (!bool3)
                              {
                                localClass2 = Double.TYPE;
                                bool3 = localClass2.equals(paramClass2);
                                if (!bool3) {
                                  continue;
                                }
                              }
                            }
                          }
                          bool2 = bool1;
                        }
                        else
                        {
                          localClass2 = Byte.TYPE;
                          bool3 = localClass2.equals(paramClass1);
                          if (bool3)
                          {
                            localClass2 = Short.TYPE;
                            bool3 = localClass2.equals(paramClass2);
                            if (!bool3)
                            {
                              localClass2 = Integer.TYPE;
                              bool3 = localClass2.equals(paramClass2);
                              if (!bool3)
                              {
                                localClass2 = Long.TYPE;
                                bool3 = localClass2.equals(paramClass2);
                                if (!bool3)
                                {
                                  localClass2 = Float.TYPE;
                                  bool3 = localClass2.equals(paramClass2);
                                  if (!bool3)
                                  {
                                    localClass2 = Double.TYPE;
                                    bool3 = localClass2.equals(paramClass2);
                                    if (!bool3) {
                                      continue;
                                    }
                                  }
                                }
                              }
                            }
                            bool2 = bool1;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        else
        {
          bool2 = paramClass2.isAssignableFrom(paramClass1);
        }
      }
    }
  }
  
  public static boolean isAssignable(Class[] paramArrayOfClass1, Class[] paramArrayOfClass2)
  {
    return isAssignable(paramArrayOfClass1, paramArrayOfClass2, false);
  }
  
  public static boolean isAssignable(Class[] paramArrayOfClass1, Class[] paramArrayOfClass2, boolean paramBoolean)
  {
    boolean bool1 = false;
    boolean bool2 = ArrayUtils.isSameLength(paramArrayOfClass1, paramArrayOfClass2);
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      if (paramArrayOfClass1 == null) {
        paramArrayOfClass1 = ArrayUtils.EMPTY_CLASS_ARRAY;
      }
      if (paramArrayOfClass2 == null) {
        paramArrayOfClass2 = ArrayUtils.EMPTY_CLASS_ARRAY;
      }
      int j = 0;
      for (;;)
      {
        int i = paramArrayOfClass1.length;
        if (j >= i) {
          break label82;
        }
        Class localClass1 = paramArrayOfClass1[j];
        Class localClass2 = paramArrayOfClass2[j];
        boolean bool3 = isAssignable(localClass1, localClass2, paramBoolean);
        if (!bool3) {
          break;
        }
        j += 1;
      }
      label82:
      bool1 = true;
    }
  }
  
  public static boolean isInnerClass(Class paramClass)
  {
    boolean bool = false;
    if (paramClass == null) {}
    for (;;)
    {
      return bool;
      String str = paramClass.getName();
      int i = 36;
      int j = str.indexOf(i);
      if (j >= 0) {
        bool = true;
      }
    }
  }
  
  public static Class primitiveToWrapper(Class paramClass)
  {
    Class localClass = paramClass;
    if (paramClass != null)
    {
      boolean bool = paramClass.isPrimitive();
      if (bool)
      {
        Map localMap = primitiveWrapperMap;
        localClass = (Class)localMap.get(paramClass);
      }
    }
    return localClass;
  }
  
  public static Class[] primitivesToWrappers(Class[] paramArrayOfClass)
  {
    if (paramArrayOfClass == null) {
      paramArrayOfClass = null;
    }
    for (;;)
    {
      return paramArrayOfClass;
      int i = paramArrayOfClass.length;
      if (i != 0)
      {
        i = paramArrayOfClass.length;
        Class[] arrayOfClass = new Class[i];
        int j = 0;
        for (;;)
        {
          i = paramArrayOfClass.length;
          if (j >= i) {
            break;
          }
          Class localClass = primitiveToWrapper(paramArrayOfClass[j]);
          arrayOfClass[j] = localClass;
          j += 1;
        }
        paramArrayOfClass = arrayOfClass;
      }
    }
  }
  
  private static String toCanonicalName(String paramString)
  {
    paramString = StringUtils.deleteWhitespace(paramString);
    if (paramString == null)
    {
      localObject = new org/apache/commons/lang/NullArgumentException;
      ((NullArgumentException)localObject).<init>("className");
      throw ((Throwable)localObject);
    }
    Object localObject = "[]";
    boolean bool = paramString.endsWith((String)localObject);
    StringBuffer localStringBuffer;
    if (bool)
    {
      localStringBuffer = new java/lang/StringBuffer;
      localStringBuffer.<init>();
      for (;;)
      {
        localObject = "[]";
        bool = paramString.endsWith((String)localObject);
        if (!bool) {
          break;
        }
        bool = false;
        int i = paramString.length() + -2;
        paramString = paramString.substring(0, i);
        localObject = "[";
        localStringBuffer.append((String)localObject);
      }
      localObject = abbreviationMap;
      String str1 = (String)((Map)localObject).get(paramString);
      if (str1 == null) {
        break label124;
      }
      localStringBuffer.append(str1);
    }
    for (;;)
    {
      paramString = localStringBuffer.toString();
      return paramString;
      label124:
      localObject = localStringBuffer.append("L").append(paramString);
      String str2 = ";";
      ((StringBuffer)localObject).append(str2);
    }
  }
  
  public static Class[] toClass(Object[] paramArrayOfObject)
  {
    Object localObject1 = null;
    if (paramArrayOfObject == null) {}
    for (;;)
    {
      return (Class[])localObject1;
      int i = paramArrayOfObject.length;
      if (i == 0)
      {
        localObject1 = ArrayUtils.EMPTY_CLASS_ARRAY;
      }
      else
      {
        i = paramArrayOfObject.length;
        Class[] arrayOfClass = new Class[i];
        int j = 0;
        i = paramArrayOfObject.length;
        if (j < i)
        {
          Object localObject2 = paramArrayOfObject[j];
          if (localObject2 == null) {
            i = 0;
          }
          for (localObject2 = null;; localObject2 = paramArrayOfObject[j].getClass())
          {
            arrayOfClass[j] = localObject2;
            j += 1;
            break;
          }
        }
        localObject1 = arrayOfClass;
      }
    }
  }
  
  public static Class wrapperToPrimitive(Class paramClass)
  {
    return (Class)wrapperPrimitiveMap.get(paramClass);
  }
  
  public static Class[] wrappersToPrimitives(Class[] paramArrayOfClass)
  {
    if (paramArrayOfClass == null) {
      paramArrayOfClass = null;
    }
    for (;;)
    {
      return paramArrayOfClass;
      int i = paramArrayOfClass.length;
      if (i != 0)
      {
        i = paramArrayOfClass.length;
        Class[] arrayOfClass = new Class[i];
        int j = 0;
        for (;;)
        {
          i = paramArrayOfClass.length;
          if (j >= i) {
            break;
          }
          Class localClass = wrapperToPrimitive(paramArrayOfClass[j]);
          arrayOfClass[j] = localClass;
          j += 1;
        }
        paramArrayOfClass = arrayOfClass;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/ClassUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */