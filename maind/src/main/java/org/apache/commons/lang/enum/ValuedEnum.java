package org.apache.commons.lang.enum;

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
  
  public int compareTo(Object paramObject)
  {
    int i = this.iValue;
    int j = ((ValuedEnum)paramObject).iValue;
    return i - j;
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/enum/ValuedEnum.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */