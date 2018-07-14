package org.apache.commons.lang.enums;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.StringUtils;

public abstract class Enum
  implements Comparable, Serializable
{
  private static final Map EMPTY_MAP;
  private static Map cEnumClasses;
  static Class class$org$apache$commons$lang$enums$Enum;
  static Class class$org$apache$commons$lang$enums$ValuedEnum;
  private static final long serialVersionUID = -487045951170455942L;
  private final transient int iHashCode;
  private final String iName;
  protected transient String iToString = null;
  
  static
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>(0);
    EMPTY_MAP = Collections.unmodifiableMap((Map)localObject);
    localObject = new java/util/WeakHashMap;
    ((WeakHashMap)localObject).<init>();
    cEnumClasses = (Map)localObject;
  }
  
  protected Enum(String paramString)
  {
    init(paramString);
    this.iName = paramString;
    int i = getEnumClass().hashCode() + 7;
    int j = paramString.hashCode() * 3;
    i += j;
    this.iHashCode = i;
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
  
  private static Enum.Entry createEntry(Class paramClass)
  {
    Enum.Entry localEntry1 = new org/apache/commons/lang/enums/Enum$Entry;
    localEntry1.<init>();
    label127:
    label134:
    label141:
    for (Class localClass = paramClass.getSuperclass();; localClass = localClass.getSuperclass())
    {
      Object localObject1;
      if (localClass != null)
      {
        localObject1 = class$org$apache$commons$lang$enums$Enum;
        if (localObject1 != null) {
          break label127;
        }
        localObject1 = class$("org.apache.commons.lang.enums.Enum");
        class$org$apache$commons$lang$enums$Enum = (Class)localObject1;
        if (localClass != localObject1)
        {
          localObject1 = class$org$apache$commons$lang$enums$ValuedEnum;
          if (localObject1 != null) {
            break label134;
          }
          localObject1 = class$("org.apache.commons.lang.enums.ValuedEnum");
          class$org$apache$commons$lang$enums$ValuedEnum = (Class)localObject1;
        }
      }
      for (;;)
      {
        if (localClass != localObject1)
        {
          localObject1 = cEnumClasses;
          Enum.Entry localEntry2 = (Enum.Entry)((Map)localObject1).get(localClass);
          if (localEntry2 == null) {
            break label141;
          }
          localObject1 = localEntry1.list;
          Object localObject2 = localEntry2.list;
          ((List)localObject1).addAll((Collection)localObject2);
          localObject1 = localEntry1.map;
          localObject2 = localEntry2.map;
          ((Map)localObject1).putAll((Map)localObject2);
        }
        return localEntry1;
        localObject1 = class$org$apache$commons$lang$enums$Enum;
        break;
        localObject1 = class$org$apache$commons$lang$enums$ValuedEnum;
      }
    }
  }
  
  private static Enum.Entry getEntry(Class paramClass)
  {
    if (paramClass == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("The Enum Class must not be null");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = class$org$apache$commons$lang$enums$Enum;
    if (localObject1 == null)
    {
      localObject1 = class$("org.apache.commons.lang.enums.Enum");
      class$org$apache$commons$lang$enums$Enum = (Class)localObject1;
    }
    for (;;)
    {
      boolean bool1 = ((Class)localObject1).isAssignableFrom(paramClass);
      if (bool1) {
        break;
      }
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("The Class must be a subclass of Enum");
      throw ((Throwable)localObject1);
      localObject1 = class$org$apache$commons$lang$enums$Enum;
    }
    localObject1 = cEnumClasses;
    Object localObject2 = (Enum.Entry)((Map)localObject1).get(paramClass);
    if (localObject2 == null) {}
    try
    {
      localObject1 = paramClass.getName();
      boolean bool2 = true;
      ClassLoader localClassLoader = paramClass.getClassLoader();
      Class.forName((String)localObject1, bool2, localClassLoader);
      localObject1 = cEnumClasses;
      localObject1 = ((Map)localObject1).get(paramClass);
      Object localObject3 = localObject1;
      localObject3 = (Enum.Entry)localObject1;
      localObject2 = localObject3;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return (Enum.Entry)localObject2;
  }
  
  protected static Enum getEnum(Class paramClass, String paramString)
  {
    Enum.Entry localEntry = getEntry(paramClass);
    if (localEntry == null) {}
    for (Enum localEnum = null;; localEnum = (Enum)localEntry.map.get(paramString)) {
      return localEnum;
    }
  }
  
  protected static List getEnumList(Class paramClass)
  {
    Enum.Entry localEntry = getEntry(paramClass);
    if (localEntry == null) {}
    for (List localList = Collections.EMPTY_LIST;; localList = localEntry.unmodifiableList) {
      return localList;
    }
  }
  
  protected static Map getEnumMap(Class paramClass)
  {
    Enum.Entry localEntry = getEntry(paramClass);
    if (localEntry == null) {}
    for (Map localMap = EMPTY_MAP;; localMap = localEntry.unmodifiableMap) {
      return localMap;
    }
  }
  
  private String getNameInOtherClassLoader(Object paramObject)
  {
    try
    {
      Class localClass = paramObject.getClass();
      String str = "getName";
      Method localMethod = localClass.getMethod(str, null);
      localClass = null;
      Object localObject = localMethod.invoke(paramObject, null);
      return (String)localObject;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("This should not happen");
      throw localIllegalStateException;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;) {}
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
  }
  
  private void init(String paramString)
  {
    boolean bool = StringUtils.isEmpty(paramString);
    if (bool)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("The Enum name must not be empty or null");
      throw ((Throwable)localObject1);
    }
    Class localClass1 = getEnumClass();
    if (localClass1 == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("getEnumClass() must not be null");
      throw ((Throwable)localObject1);
    }
    Class localClass2 = getClass();
    int i = 0;
    for (;;)
    {
      if (localClass2 != null)
      {
        localObject1 = class$org$apache$commons$lang$enums$Enum;
        if (localObject1 != null) {
          break label133;
        }
        localObject1 = class$("org.apache.commons.lang.enums.Enum");
        class$org$apache$commons$lang$enums$Enum = (Class)localObject1;
        if (localClass2 != localObject1)
        {
          localObject1 = class$org$apache$commons$lang$enums$ValuedEnum;
          if (localObject1 != null) {
            break label140;
          }
          localObject1 = class$("org.apache.commons.lang.enums.ValuedEnum");
          class$org$apache$commons$lang$enums$ValuedEnum = (Class)localObject1;
        }
      }
      for (;;)
      {
        if (localClass2 != localObject1)
        {
          if (localClass2 != localClass1) {
            break label147;
          }
          i = 1;
        }
        if (i != 0) {
          break label157;
        }
        localObject1 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject1).<init>("getEnumClass() must return a superclass of this class");
        throw ((Throwable)localObject1);
        label133:
        localObject1 = class$org$apache$commons$lang$enums$Enum;
        break;
        label140:
        localObject1 = class$org$apache$commons$lang$enums$ValuedEnum;
      }
      label147:
      localClass2 = localClass2.getSuperclass();
    }
    label157:
    Object localObject1 = class$org$apache$commons$lang$enums$Enum;
    if (localObject1 == null)
    {
      localObject1 = class$("org.apache.commons.lang.enums.Enum");
      class$org$apache$commons$lang$enums$Enum = (Class)localObject1;
    }
    Object localObject4;
    for (;;)
    {
      try
      {
        Object localObject2 = cEnumClasses;
        localObject4 = ((Map)localObject2).get(localClass1);
        localObject4 = (Enum.Entry)localObject4;
        if (localObject4 == null)
        {
          localObject4 = createEntry(localClass1);
          WeakHashMap localWeakHashMap = new java/util/WeakHashMap;
          localWeakHashMap.<init>();
          localObject2 = cEnumClasses;
          localWeakHashMap.putAll((Map)localObject2);
          localWeakHashMap.put(localClass1, localObject4);
          cEnumClasses = localWeakHashMap;
        }
        localObject1 = ((Enum.Entry)localObject4).map;
        bool = ((Map)localObject1).containsKey(paramString);
        if (!bool) {
          break;
        }
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuffer;
        ((StringBuffer)localObject2).<init>();
        localObject2 = "The Enum name must be unique, '" + paramString + "' has already been added";
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      finally {}
      localObject1 = class$org$apache$commons$lang$enums$Enum;
    }
    ((Enum.Entry)localObject4).map.put(paramString, this);
    ((Enum.Entry)localObject4).list.add(this);
  }
  
  protected static Iterator iterator(Class paramClass)
  {
    return getEnumList(paramClass).iterator();
  }
  
  public int compareTo(Object paramObject)
  {
    int i;
    Object localObject1;
    if (paramObject == this)
    {
      i = 0;
      localObject1 = null;
    }
    for (;;)
    {
      return i;
      localObject1 = paramObject.getClass();
      Object localObject2 = getClass();
      int j;
      if (localObject1 != localObject2)
      {
        localObject1 = paramObject.getClass().getName();
        localObject2 = getClass().getName();
        boolean bool = ((String)localObject1).equals(localObject2);
        if (bool)
        {
          localObject1 = this.iName;
          localObject2 = getNameInOtherClassLoader(paramObject);
          j = ((String)localObject1).compareTo((String)localObject2);
        }
        else
        {
          localObject1 = new java/lang/ClassCastException;
          localObject2 = new java/lang/StringBuffer;
          ((StringBuffer)localObject2).<init>();
          localObject2 = ((StringBuffer)localObject2).append("Different enum class '");
          String str = ClassUtils.getShortClassName(paramObject.getClass());
          localObject2 = str + "'";
          ((ClassCastException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
      }
      else
      {
        localObject1 = this.iName;
        paramObject = (Enum)paramObject;
        localObject2 = ((Enum)paramObject).iName;
        j = ((String)localObject1).compareTo((String)localObject2);
      }
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    String str = null;
    if (paramObject == this) {
      bool1 = true;
    }
    for (;;)
    {
      return bool1;
      if (paramObject != null)
      {
        Object localObject1 = paramObject.getClass();
        Object localObject2 = getClass();
        if (localObject1 == localObject2)
        {
          str = this.iName;
          paramObject = (Enum)paramObject;
          localObject1 = ((Enum)paramObject).iName;
          bool1 = str.equals(localObject1);
        }
        else
        {
          localObject1 = paramObject.getClass().getName();
          localObject2 = getClass().getName();
          boolean bool2 = ((String)localObject1).equals(localObject2);
          if (bool2)
          {
            str = this.iName;
            localObject1 = getNameInOtherClassLoader(paramObject);
            bool1 = str.equals(localObject1);
          }
        }
      }
    }
  }
  
  public Class getEnumClass()
  {
    return getClass();
  }
  
  public final String getName()
  {
    return this.iName;
  }
  
  public final int hashCode()
  {
    return this.iHashCode;
  }
  
  protected Object readResolve()
  {
    Object localObject1 = cEnumClasses;
    Object localObject2 = getEnumClass();
    Enum.Entry localEntry = (Enum.Entry)((Map)localObject1).get(localObject2);
    if (localEntry == null) {}
    for (localObject1 = null;; localObject1 = ((Map)localObject1).get(localObject2))
    {
      return localObject1;
      localObject1 = localEntry.map;
      localObject2 = getName();
    }
  }
  
  public String toString()
  {
    Object localObject = this.iToString;
    if (localObject == null)
    {
      String str1 = ClassUtils.getShortClassName(getEnumClass());
      localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      localObject = ((StringBuffer)localObject).append(str1).append("[");
      String str2 = getName();
      localObject = ((StringBuffer)localObject).append(str2);
      str2 = "]";
      localObject = str2;
      this.iToString = ((String)localObject);
    }
    return this.iToString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/enums/Enum.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */