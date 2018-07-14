package org.apache.commons.lang.enums;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang.ClassUtils;

public abstract class ValuedEnum
  extends Enum
{
  private static final long serialVersionUID = -7129650521543789085L;
  private final int iValue;
  
  protected ValuedEnum(String paramString, int paramInt)
  {
    super(paramString);
    this.iValue = paramInt;
  }
  
  protected static Enum getEnum(Class paramClass, int paramInt)
  {
    if (paramClass == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The Enum Class must not be null");
      throw localIllegalArgumentException;
    }
    List localList = Enum.getEnumList(paramClass);
    Iterator localIterator = localList.iterator();
    ValuedEnum localValuedEnum;
    int i;
    do
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localValuedEnum = (ValuedEnum)localIterator.next();
      i = localValuedEnum.getValue();
    } while (i != paramInt);
    for (;;)
    {
      return localValuedEnum;
      localValuedEnum = null;
    }
  }
  
  private int getValueInOtherClassLoader(Object paramObject)
  {
    try
    {
      Class localClass = paramObject.getClass();
      String str = "getValue";
      Method localMethod = localClass.getMethod(str, null);
      localClass = null;
      Object localObject = localMethod.invoke(paramObject, null);
      localObject = (Integer)localObject;
      return ((Integer)localObject).intValue();
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
      int k;
      if (localObject1 != localObject2)
      {
        localObject1 = paramObject.getClass().getName();
        localObject2 = getClass().getName();
        boolean bool = ((String)localObject1).equals(localObject2);
        if (bool)
        {
          j = this.iValue;
          k = getValueInOtherClassLoader(paramObject);
          j -= k;
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
        j = this.iValue;
        paramObject = (ValuedEnum)paramObject;
        k = ((ValuedEnum)paramObject).iValue;
        j -= k;
      }
    }
  }
  
  public final int getValue()
  {
    return this.iValue;
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
      localObject = ((StringBuffer)localObject).append(str2).append("=");
      int i = getValue();
      localObject = ((StringBuffer)localObject).append(i);
      str2 = "]";
      localObject = str2;
      this.iToString = ((String)localObject);
    }
    return this.iToString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/enums/ValuedEnum.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */