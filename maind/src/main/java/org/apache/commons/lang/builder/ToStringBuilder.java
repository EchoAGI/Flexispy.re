package org.apache.commons.lang.builder;

import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.ObjectUtils;

public class ToStringBuilder
{
  private static volatile ToStringStyle defaultStyle = ToStringStyle.DEFAULT_STYLE;
  private final StringBuffer buffer;
  private final Object object;
  private final ToStringStyle style;
  
  public ToStringBuilder(Object paramObject)
  {
    this(paramObject, null, null);
  }
  
  public ToStringBuilder(Object paramObject, ToStringStyle paramToStringStyle)
  {
    this(paramObject, paramToStringStyle, null);
  }
  
  public ToStringBuilder(Object paramObject, ToStringStyle paramToStringStyle, StringBuffer paramStringBuffer)
  {
    if (paramToStringStyle == null) {
      paramToStringStyle = getDefaultStyle();
    }
    if (paramStringBuffer == null)
    {
      paramStringBuffer = new java/lang/StringBuffer;
      int i = 512;
      paramStringBuffer.<init>(i);
    }
    this.buffer = paramStringBuffer;
    this.style = paramToStringStyle;
    this.object = paramObject;
    paramToStringStyle.appendStart(paramStringBuffer, paramObject);
  }
  
  public static ToStringStyle getDefaultStyle()
  {
    return defaultStyle;
  }
  
  public static String reflectionToString(Object paramObject)
  {
    return ReflectionToStringBuilder.toString(paramObject);
  }
  
  public static String reflectionToString(Object paramObject, ToStringStyle paramToStringStyle)
  {
    return ReflectionToStringBuilder.toString(paramObject, paramToStringStyle);
  }
  
  public static String reflectionToString(Object paramObject, ToStringStyle paramToStringStyle, boolean paramBoolean)
  {
    return ReflectionToStringBuilder.toString(paramObject, paramToStringStyle, paramBoolean, false, null);
  }
  
  public static String reflectionToString(Object paramObject, ToStringStyle paramToStringStyle, boolean paramBoolean, Class paramClass)
  {
    return ReflectionToStringBuilder.toString(paramObject, paramToStringStyle, paramBoolean, false, paramClass);
  }
  
  public static void setDefaultStyle(ToStringStyle paramToStringStyle)
  {
    if (paramToStringStyle == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The style must not be null");
      throw localIllegalArgumentException;
    }
    defaultStyle = paramToStringStyle;
  }
  
  public ToStringBuilder append(byte paramByte)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, null, paramByte);
    return this;
  }
  
  public ToStringBuilder append(char paramChar)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, null, paramChar);
    return this;
  }
  
  public ToStringBuilder append(double paramDouble)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, null, paramDouble);
    return this;
  }
  
  public ToStringBuilder append(float paramFloat)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, null, paramFloat);
    return this;
  }
  
  public ToStringBuilder append(int paramInt)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, null, paramInt);
    return this;
  }
  
  public ToStringBuilder append(long paramLong)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, null, paramLong);
    return this;
  }
  
  public ToStringBuilder append(Object paramObject)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, null, paramObject, null);
    return this;
  }
  
  public ToStringBuilder append(String paramString, byte paramByte)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, paramString, paramByte);
    return this;
  }
  
  public ToStringBuilder append(String paramString, char paramChar)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, paramString, paramChar);
    return this;
  }
  
  public ToStringBuilder append(String paramString, double paramDouble)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, paramString, paramDouble);
    return this;
  }
  
  public ToStringBuilder append(String paramString, float paramFloat)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, paramString, paramFloat);
    return this;
  }
  
  public ToStringBuilder append(String paramString, int paramInt)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, paramString, paramInt);
    return this;
  }
  
  public ToStringBuilder append(String paramString, long paramLong)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, paramString, paramLong);
    return this;
  }
  
  public ToStringBuilder append(String paramString, Object paramObject)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, paramString, paramObject, null);
    return this;
  }
  
  public ToStringBuilder append(String paramString, Object paramObject, boolean paramBoolean)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    Boolean localBoolean = BooleanUtils.toBooleanObject(paramBoolean);
    localToStringStyle.append(localStringBuffer, paramString, paramObject, localBoolean);
    return this;
  }
  
  public ToStringBuilder append(String paramString, short paramShort)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, paramString, paramShort);
    return this;
  }
  
  public ToStringBuilder append(String paramString, boolean paramBoolean)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, paramString, paramBoolean);
    return this;
  }
  
  public ToStringBuilder append(String paramString, byte[] paramArrayOfByte)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, paramString, paramArrayOfByte, null);
    return this;
  }
  
  public ToStringBuilder append(String paramString, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    Boolean localBoolean = BooleanUtils.toBooleanObject(paramBoolean);
    localToStringStyle.append(localStringBuffer, paramString, paramArrayOfByte, localBoolean);
    return this;
  }
  
  public ToStringBuilder append(String paramString, char[] paramArrayOfChar)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, paramString, paramArrayOfChar, null);
    return this;
  }
  
  public ToStringBuilder append(String paramString, char[] paramArrayOfChar, boolean paramBoolean)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    Boolean localBoolean = BooleanUtils.toBooleanObject(paramBoolean);
    localToStringStyle.append(localStringBuffer, paramString, paramArrayOfChar, localBoolean);
    return this;
  }
  
  public ToStringBuilder append(String paramString, double[] paramArrayOfDouble)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, paramString, paramArrayOfDouble, null);
    return this;
  }
  
  public ToStringBuilder append(String paramString, double[] paramArrayOfDouble, boolean paramBoolean)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    Boolean localBoolean = BooleanUtils.toBooleanObject(paramBoolean);
    localToStringStyle.append(localStringBuffer, paramString, paramArrayOfDouble, localBoolean);
    return this;
  }
  
  public ToStringBuilder append(String paramString, float[] paramArrayOfFloat)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, paramString, paramArrayOfFloat, null);
    return this;
  }
  
  public ToStringBuilder append(String paramString, float[] paramArrayOfFloat, boolean paramBoolean)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    Boolean localBoolean = BooleanUtils.toBooleanObject(paramBoolean);
    localToStringStyle.append(localStringBuffer, paramString, paramArrayOfFloat, localBoolean);
    return this;
  }
  
  public ToStringBuilder append(String paramString, int[] paramArrayOfInt)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, paramString, paramArrayOfInt, null);
    return this;
  }
  
  public ToStringBuilder append(String paramString, int[] paramArrayOfInt, boolean paramBoolean)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    Boolean localBoolean = BooleanUtils.toBooleanObject(paramBoolean);
    localToStringStyle.append(localStringBuffer, paramString, paramArrayOfInt, localBoolean);
    return this;
  }
  
  public ToStringBuilder append(String paramString, long[] paramArrayOfLong)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, paramString, paramArrayOfLong, null);
    return this;
  }
  
  public ToStringBuilder append(String paramString, long[] paramArrayOfLong, boolean paramBoolean)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    Boolean localBoolean = BooleanUtils.toBooleanObject(paramBoolean);
    localToStringStyle.append(localStringBuffer, paramString, paramArrayOfLong, localBoolean);
    return this;
  }
  
  public ToStringBuilder append(String paramString, Object[] paramArrayOfObject)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, paramString, paramArrayOfObject, null);
    return this;
  }
  
  public ToStringBuilder append(String paramString, Object[] paramArrayOfObject, boolean paramBoolean)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    Boolean localBoolean = BooleanUtils.toBooleanObject(paramBoolean);
    localToStringStyle.append(localStringBuffer, paramString, paramArrayOfObject, localBoolean);
    return this;
  }
  
  public ToStringBuilder append(String paramString, short[] paramArrayOfShort)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, paramString, paramArrayOfShort, null);
    return this;
  }
  
  public ToStringBuilder append(String paramString, short[] paramArrayOfShort, boolean paramBoolean)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    Boolean localBoolean = BooleanUtils.toBooleanObject(paramBoolean);
    localToStringStyle.append(localStringBuffer, paramString, paramArrayOfShort, localBoolean);
    return this;
  }
  
  public ToStringBuilder append(String paramString, boolean[] paramArrayOfBoolean)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, paramString, paramArrayOfBoolean, null);
    return this;
  }
  
  public ToStringBuilder append(String paramString, boolean[] paramArrayOfBoolean, boolean paramBoolean)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    Boolean localBoolean = BooleanUtils.toBooleanObject(paramBoolean);
    localToStringStyle.append(localStringBuffer, paramString, paramArrayOfBoolean, localBoolean);
    return this;
  }
  
  public ToStringBuilder append(short paramShort)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, null, paramShort);
    return this;
  }
  
  public ToStringBuilder append(boolean paramBoolean)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, null, paramBoolean);
    return this;
  }
  
  public ToStringBuilder append(byte[] paramArrayOfByte)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, null, paramArrayOfByte, null);
    return this;
  }
  
  public ToStringBuilder append(char[] paramArrayOfChar)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, null, paramArrayOfChar, null);
    return this;
  }
  
  public ToStringBuilder append(double[] paramArrayOfDouble)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, null, paramArrayOfDouble, null);
    return this;
  }
  
  public ToStringBuilder append(float[] paramArrayOfFloat)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, null, paramArrayOfFloat, null);
    return this;
  }
  
  public ToStringBuilder append(int[] paramArrayOfInt)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, null, paramArrayOfInt, null);
    return this;
  }
  
  public ToStringBuilder append(long[] paramArrayOfLong)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, null, paramArrayOfLong, null);
    return this;
  }
  
  public ToStringBuilder append(Object[] paramArrayOfObject)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, null, paramArrayOfObject, null);
    return this;
  }
  
  public ToStringBuilder append(short[] paramArrayOfShort)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, null, paramArrayOfShort, null);
    return this;
  }
  
  public ToStringBuilder append(boolean[] paramArrayOfBoolean)
  {
    ToStringStyle localToStringStyle = this.style;
    StringBuffer localStringBuffer = this.buffer;
    localToStringStyle.append(localStringBuffer, null, paramArrayOfBoolean, null);
    return this;
  }
  
  public ToStringBuilder appendAsObjectToString(Object paramObject)
  {
    ObjectUtils.identityToString(getStringBuffer(), paramObject);
    return this;
  }
  
  public ToStringBuilder appendSuper(String paramString)
  {
    if (paramString != null)
    {
      ToStringStyle localToStringStyle = this.style;
      StringBuffer localStringBuffer = this.buffer;
      localToStringStyle.appendSuper(localStringBuffer, paramString);
    }
    return this;
  }
  
  public ToStringBuilder appendToString(String paramString)
  {
    if (paramString != null)
    {
      ToStringStyle localToStringStyle = this.style;
      StringBuffer localStringBuffer = this.buffer;
      localToStringStyle.appendToString(localStringBuffer, paramString);
    }
    return this;
  }
  
  public Object getObject()
  {
    return this.object;
  }
  
  public StringBuffer getStringBuffer()
  {
    return this.buffer;
  }
  
  public ToStringStyle getStyle()
  {
    return this.style;
  }
  
  public String toString()
  {
    Object localObject1 = getObject();
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = getStringBuffer();
      localObject2 = getStyle().getNullText();
      ((StringBuffer)localObject1).append((String)localObject2);
    }
    for (;;)
    {
      return getStringBuffer().toString();
      localObject1 = this.style;
      localObject2 = getStringBuffer();
      Object localObject3 = getObject();
      ((ToStringStyle)localObject1).appendEnd((StringBuffer)localObject2, localObject3);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/builder/ToStringBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */