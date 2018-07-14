package org.apache.commons.lang.builder;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.ObjectUtils;

public abstract class ToStringStyle
  implements Serializable
{
  public static final ToStringStyle DEFAULT_STYLE;
  public static final ToStringStyle MULTI_LINE_STYLE;
  public static final ToStringStyle NO_FIELD_NAMES_STYLE;
  private static final ThreadLocal REGISTRY;
  public static final ToStringStyle SHORT_PREFIX_STYLE;
  public static final ToStringStyle SIMPLE_STYLE;
  private boolean arrayContentDetail;
  private String arrayEnd;
  private String arraySeparator;
  private String arrayStart;
  private String contentEnd;
  private String contentStart;
  private boolean defaultFullDetail;
  private String fieldNameValueSeparator;
  private String fieldSeparator;
  private boolean fieldSeparatorAtEnd;
  private boolean fieldSeparatorAtStart;
  private String nullText;
  private String sizeEndText;
  private String sizeStartText;
  private String summaryObjectEndText;
  private String summaryObjectStartText;
  private boolean useClassName;
  private boolean useFieldNames;
  private boolean useIdentityHashCode;
  private boolean useShortClassName;
  
  static
  {
    Object localObject = new org/apache/commons/lang/builder/ToStringStyle$DefaultToStringStyle;
    ((ToStringStyle.DefaultToStringStyle)localObject).<init>();
    DEFAULT_STYLE = (ToStringStyle)localObject;
    localObject = new org/apache/commons/lang/builder/ToStringStyle$MultiLineToStringStyle;
    ((ToStringStyle.MultiLineToStringStyle)localObject).<init>();
    MULTI_LINE_STYLE = (ToStringStyle)localObject;
    localObject = new org/apache/commons/lang/builder/ToStringStyle$NoFieldNameToStringStyle;
    ((ToStringStyle.NoFieldNameToStringStyle)localObject).<init>();
    NO_FIELD_NAMES_STYLE = (ToStringStyle)localObject;
    localObject = new org/apache/commons/lang/builder/ToStringStyle$ShortPrefixToStringStyle;
    ((ToStringStyle.ShortPrefixToStringStyle)localObject).<init>();
    SHORT_PREFIX_STYLE = (ToStringStyle)localObject;
    localObject = new org/apache/commons/lang/builder/ToStringStyle$SimpleToStringStyle;
    ((ToStringStyle.SimpleToStringStyle)localObject).<init>();
    SIMPLE_STYLE = (ToStringStyle)localObject;
    localObject = new java/lang/ThreadLocal;
    ((ThreadLocal)localObject).<init>();
    REGISTRY = (ThreadLocal)localObject;
  }
  
  protected ToStringStyle()
  {
    this.useFieldNames = bool;
    this.useClassName = bool;
    this.useShortClassName = false;
    this.useIdentityHashCode = bool;
    this.contentStart = "[";
    this.contentEnd = "]";
    this.fieldNameValueSeparator = "=";
    this.fieldSeparatorAtStart = false;
    this.fieldSeparatorAtEnd = false;
    this.fieldSeparator = ",";
    this.arrayStart = "{";
    this.arraySeparator = ",";
    this.arrayContentDetail = bool;
    this.arrayEnd = "}";
    this.defaultFullDetail = bool;
    this.nullText = "<null>";
    this.sizeStartText = "<size=";
    this.sizeEndText = ">";
    this.summaryObjectStartText = "<";
    this.summaryObjectEndText = ">";
  }
  
  static Map getRegistry()
  {
    return (Map)REGISTRY.get();
  }
  
  static boolean isRegistered(Object paramObject)
  {
    Map localMap = getRegistry();
    if (localMap != null)
    {
      bool = localMap.containsKey(paramObject);
      if (!bool) {}
    }
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  static void register(Object paramObject)
  {
    if (paramObject != null)
    {
      Object localObject = getRegistry();
      if (localObject == null)
      {
        localObject = new java/util/WeakHashMap;
        ((WeakHashMap)localObject).<init>();
        localThreadLocal = REGISTRY;
        localThreadLocal.set(localObject);
      }
      ThreadLocal localThreadLocal = null;
      ((Map)localObject).put(paramObject, null);
    }
  }
  
  static void unregister(Object paramObject)
  {
    if (paramObject != null)
    {
      Map localMap = getRegistry();
      if (localMap != null)
      {
        localMap.remove(paramObject);
        boolean bool = localMap.isEmpty();
        if (bool)
        {
          ThreadLocal localThreadLocal = REGISTRY;
          localThreadLocal.set(null);
        }
      }
    }
  }
  
  public void append(StringBuffer paramStringBuffer, String paramString, byte paramByte)
  {
    appendFieldStart(paramStringBuffer, paramString);
    appendDetail(paramStringBuffer, paramString, paramByte);
    appendFieldEnd(paramStringBuffer, paramString);
  }
  
  public void append(StringBuffer paramStringBuffer, String paramString, char paramChar)
  {
    appendFieldStart(paramStringBuffer, paramString);
    appendDetail(paramStringBuffer, paramString, paramChar);
    appendFieldEnd(paramStringBuffer, paramString);
  }
  
  public void append(StringBuffer paramStringBuffer, String paramString, double paramDouble)
  {
    appendFieldStart(paramStringBuffer, paramString);
    appendDetail(paramStringBuffer, paramString, paramDouble);
    appendFieldEnd(paramStringBuffer, paramString);
  }
  
  public void append(StringBuffer paramStringBuffer, String paramString, float paramFloat)
  {
    appendFieldStart(paramStringBuffer, paramString);
    appendDetail(paramStringBuffer, paramString, paramFloat);
    appendFieldEnd(paramStringBuffer, paramString);
  }
  
  public void append(StringBuffer paramStringBuffer, String paramString, int paramInt)
  {
    appendFieldStart(paramStringBuffer, paramString);
    appendDetail(paramStringBuffer, paramString, paramInt);
    appendFieldEnd(paramStringBuffer, paramString);
  }
  
  public void append(StringBuffer paramStringBuffer, String paramString, long paramLong)
  {
    appendFieldStart(paramStringBuffer, paramString);
    appendDetail(paramStringBuffer, paramString, paramLong);
    appendFieldEnd(paramStringBuffer, paramString);
  }
  
  public void append(StringBuffer paramStringBuffer, String paramString, Object paramObject, Boolean paramBoolean)
  {
    appendFieldStart(paramStringBuffer, paramString);
    if (paramObject == null) {
      appendNullText(paramStringBuffer, paramString);
    }
    for (;;)
    {
      appendFieldEnd(paramStringBuffer, paramString);
      return;
      boolean bool = isFullDetail(paramBoolean);
      appendInternal(paramStringBuffer, paramString, paramObject, bool);
    }
  }
  
  public void append(StringBuffer paramStringBuffer, String paramString, short paramShort)
  {
    appendFieldStart(paramStringBuffer, paramString);
    appendDetail(paramStringBuffer, paramString, paramShort);
    appendFieldEnd(paramStringBuffer, paramString);
  }
  
  public void append(StringBuffer paramStringBuffer, String paramString, boolean paramBoolean)
  {
    appendFieldStart(paramStringBuffer, paramString);
    appendDetail(paramStringBuffer, paramString, paramBoolean);
    appendFieldEnd(paramStringBuffer, paramString);
  }
  
  public void append(StringBuffer paramStringBuffer, String paramString, byte[] paramArrayOfByte, Boolean paramBoolean)
  {
    appendFieldStart(paramStringBuffer, paramString);
    if (paramArrayOfByte == null) {
      appendNullText(paramStringBuffer, paramString);
    }
    for (;;)
    {
      appendFieldEnd(paramStringBuffer, paramString);
      return;
      boolean bool = isFullDetail(paramBoolean);
      if (bool) {
        appendDetail(paramStringBuffer, paramString, paramArrayOfByte);
      } else {
        appendSummary(paramStringBuffer, paramString, paramArrayOfByte);
      }
    }
  }
  
  public void append(StringBuffer paramStringBuffer, String paramString, char[] paramArrayOfChar, Boolean paramBoolean)
  {
    appendFieldStart(paramStringBuffer, paramString);
    if (paramArrayOfChar == null) {
      appendNullText(paramStringBuffer, paramString);
    }
    for (;;)
    {
      appendFieldEnd(paramStringBuffer, paramString);
      return;
      boolean bool = isFullDetail(paramBoolean);
      if (bool) {
        appendDetail(paramStringBuffer, paramString, paramArrayOfChar);
      } else {
        appendSummary(paramStringBuffer, paramString, paramArrayOfChar);
      }
    }
  }
  
  public void append(StringBuffer paramStringBuffer, String paramString, double[] paramArrayOfDouble, Boolean paramBoolean)
  {
    appendFieldStart(paramStringBuffer, paramString);
    if (paramArrayOfDouble == null) {
      appendNullText(paramStringBuffer, paramString);
    }
    for (;;)
    {
      appendFieldEnd(paramStringBuffer, paramString);
      return;
      boolean bool = isFullDetail(paramBoolean);
      if (bool) {
        appendDetail(paramStringBuffer, paramString, paramArrayOfDouble);
      } else {
        appendSummary(paramStringBuffer, paramString, paramArrayOfDouble);
      }
    }
  }
  
  public void append(StringBuffer paramStringBuffer, String paramString, float[] paramArrayOfFloat, Boolean paramBoolean)
  {
    appendFieldStart(paramStringBuffer, paramString);
    if (paramArrayOfFloat == null) {
      appendNullText(paramStringBuffer, paramString);
    }
    for (;;)
    {
      appendFieldEnd(paramStringBuffer, paramString);
      return;
      boolean bool = isFullDetail(paramBoolean);
      if (bool) {
        appendDetail(paramStringBuffer, paramString, paramArrayOfFloat);
      } else {
        appendSummary(paramStringBuffer, paramString, paramArrayOfFloat);
      }
    }
  }
  
  public void append(StringBuffer paramStringBuffer, String paramString, int[] paramArrayOfInt, Boolean paramBoolean)
  {
    appendFieldStart(paramStringBuffer, paramString);
    if (paramArrayOfInt == null) {
      appendNullText(paramStringBuffer, paramString);
    }
    for (;;)
    {
      appendFieldEnd(paramStringBuffer, paramString);
      return;
      boolean bool = isFullDetail(paramBoolean);
      if (bool) {
        appendDetail(paramStringBuffer, paramString, paramArrayOfInt);
      } else {
        appendSummary(paramStringBuffer, paramString, paramArrayOfInt);
      }
    }
  }
  
  public void append(StringBuffer paramStringBuffer, String paramString, long[] paramArrayOfLong, Boolean paramBoolean)
  {
    appendFieldStart(paramStringBuffer, paramString);
    if (paramArrayOfLong == null) {
      appendNullText(paramStringBuffer, paramString);
    }
    for (;;)
    {
      appendFieldEnd(paramStringBuffer, paramString);
      return;
      boolean bool = isFullDetail(paramBoolean);
      if (bool) {
        appendDetail(paramStringBuffer, paramString, paramArrayOfLong);
      } else {
        appendSummary(paramStringBuffer, paramString, paramArrayOfLong);
      }
    }
  }
  
  public void append(StringBuffer paramStringBuffer, String paramString, Object[] paramArrayOfObject, Boolean paramBoolean)
  {
    appendFieldStart(paramStringBuffer, paramString);
    if (paramArrayOfObject == null) {
      appendNullText(paramStringBuffer, paramString);
    }
    for (;;)
    {
      appendFieldEnd(paramStringBuffer, paramString);
      return;
      boolean bool = isFullDetail(paramBoolean);
      if (bool) {
        appendDetail(paramStringBuffer, paramString, paramArrayOfObject);
      } else {
        appendSummary(paramStringBuffer, paramString, paramArrayOfObject);
      }
    }
  }
  
  public void append(StringBuffer paramStringBuffer, String paramString, short[] paramArrayOfShort, Boolean paramBoolean)
  {
    appendFieldStart(paramStringBuffer, paramString);
    if (paramArrayOfShort == null) {
      appendNullText(paramStringBuffer, paramString);
    }
    for (;;)
    {
      appendFieldEnd(paramStringBuffer, paramString);
      return;
      boolean bool = isFullDetail(paramBoolean);
      if (bool) {
        appendDetail(paramStringBuffer, paramString, paramArrayOfShort);
      } else {
        appendSummary(paramStringBuffer, paramString, paramArrayOfShort);
      }
    }
  }
  
  public void append(StringBuffer paramStringBuffer, String paramString, boolean[] paramArrayOfBoolean, Boolean paramBoolean)
  {
    appendFieldStart(paramStringBuffer, paramString);
    if (paramArrayOfBoolean == null) {
      appendNullText(paramStringBuffer, paramString);
    }
    for (;;)
    {
      appendFieldEnd(paramStringBuffer, paramString);
      return;
      boolean bool = isFullDetail(paramBoolean);
      if (bool) {
        appendDetail(paramStringBuffer, paramString, paramArrayOfBoolean);
      } else {
        appendSummary(paramStringBuffer, paramString, paramArrayOfBoolean);
      }
    }
  }
  
  protected void appendClassName(StringBuffer paramStringBuffer, Object paramObject)
  {
    boolean bool = this.useClassName;
    Object localObject;
    if ((bool) && (paramObject != null))
    {
      register(paramObject);
      bool = this.useShortClassName;
      if (!bool) {
        break label48;
      }
      localObject = paramObject.getClass();
      localObject = getShortClassName((Class)localObject);
      paramStringBuffer.append((String)localObject);
    }
    for (;;)
    {
      return;
      label48:
      localObject = paramObject.getClass().getName();
      paramStringBuffer.append((String)localObject);
    }
  }
  
  protected void appendContentEnd(StringBuffer paramStringBuffer)
  {
    String str = this.contentEnd;
    paramStringBuffer.append(str);
  }
  
  protected void appendContentStart(StringBuffer paramStringBuffer)
  {
    String str = this.contentStart;
    paramStringBuffer.append(str);
  }
  
  protected void appendCyclicObject(StringBuffer paramStringBuffer, String paramString, Object paramObject)
  {
    ObjectUtils.identityToString(paramStringBuffer, paramObject);
  }
  
  protected void appendDetail(StringBuffer paramStringBuffer, String paramString, byte paramByte)
  {
    paramStringBuffer.append(paramByte);
  }
  
  protected void appendDetail(StringBuffer paramStringBuffer, String paramString, char paramChar)
  {
    paramStringBuffer.append(paramChar);
  }
  
  protected void appendDetail(StringBuffer paramStringBuffer, String paramString, double paramDouble)
  {
    paramStringBuffer.append(paramDouble);
  }
  
  protected void appendDetail(StringBuffer paramStringBuffer, String paramString, float paramFloat)
  {
    paramStringBuffer.append(paramFloat);
  }
  
  protected void appendDetail(StringBuffer paramStringBuffer, String paramString, int paramInt)
  {
    paramStringBuffer.append(paramInt);
  }
  
  protected void appendDetail(StringBuffer paramStringBuffer, String paramString, long paramLong)
  {
    paramStringBuffer.append(paramLong);
  }
  
  protected void appendDetail(StringBuffer paramStringBuffer, String paramString, Object paramObject)
  {
    paramStringBuffer.append(paramObject);
  }
  
  protected void appendDetail(StringBuffer paramStringBuffer, String paramString, Collection paramCollection)
  {
    paramStringBuffer.append(paramCollection);
  }
  
  protected void appendDetail(StringBuffer paramStringBuffer, String paramString, Map paramMap)
  {
    paramStringBuffer.append(paramMap);
  }
  
  protected void appendDetail(StringBuffer paramStringBuffer, String paramString, short paramShort)
  {
    paramStringBuffer.append(paramShort);
  }
  
  protected void appendDetail(StringBuffer paramStringBuffer, String paramString, boolean paramBoolean)
  {
    paramStringBuffer.append(paramBoolean);
  }
  
  protected void appendDetail(StringBuffer paramStringBuffer, String paramString, byte[] paramArrayOfByte)
  {
    String str = this.arrayStart;
    paramStringBuffer.append(str);
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfByte.length;
      if (i >= j) {
        break;
      }
      if (i > 0)
      {
        str = this.arraySeparator;
        paramStringBuffer.append(str);
      }
      j = paramArrayOfByte[i];
      appendDetail(paramStringBuffer, paramString, j);
      i += 1;
    }
    str = this.arrayEnd;
    paramStringBuffer.append(str);
  }
  
  protected void appendDetail(StringBuffer paramStringBuffer, String paramString, char[] paramArrayOfChar)
  {
    String str = this.arrayStart;
    paramStringBuffer.append(str);
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfChar.length;
      if (i >= j) {
        break;
      }
      if (i > 0)
      {
        str = this.arraySeparator;
        paramStringBuffer.append(str);
      }
      j = paramArrayOfChar[i];
      appendDetail(paramStringBuffer, paramString, j);
      i += 1;
    }
    str = this.arrayEnd;
    paramStringBuffer.append(str);
  }
  
  protected void appendDetail(StringBuffer paramStringBuffer, String paramString, double[] paramArrayOfDouble)
  {
    String str = this.arrayStart;
    paramStringBuffer.append(str);
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfDouble.length;
      if (i >= j) {
        break;
      }
      if (i > 0)
      {
        str = this.arraySeparator;
        paramStringBuffer.append(str);
      }
      double d = paramArrayOfDouble[i];
      appendDetail(paramStringBuffer, paramString, d);
      i += 1;
    }
    str = this.arrayEnd;
    paramStringBuffer.append(str);
  }
  
  protected void appendDetail(StringBuffer paramStringBuffer, String paramString, float[] paramArrayOfFloat)
  {
    String str = this.arrayStart;
    paramStringBuffer.append(str);
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfFloat.length;
      if (i >= j) {
        break;
      }
      if (i > 0)
      {
        str = this.arraySeparator;
        paramStringBuffer.append(str);
      }
      float f = paramArrayOfFloat[i];
      appendDetail(paramStringBuffer, paramString, f);
      i += 1;
    }
    str = this.arrayEnd;
    paramStringBuffer.append(str);
  }
  
  protected void appendDetail(StringBuffer paramStringBuffer, String paramString, int[] paramArrayOfInt)
  {
    String str = this.arrayStart;
    paramStringBuffer.append(str);
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfInt.length;
      if (i >= j) {
        break;
      }
      if (i > 0)
      {
        str = this.arraySeparator;
        paramStringBuffer.append(str);
      }
      j = paramArrayOfInt[i];
      appendDetail(paramStringBuffer, paramString, j);
      i += 1;
    }
    str = this.arrayEnd;
    paramStringBuffer.append(str);
  }
  
  protected void appendDetail(StringBuffer paramStringBuffer, String paramString, long[] paramArrayOfLong)
  {
    String str = this.arrayStart;
    paramStringBuffer.append(str);
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfLong.length;
      if (i >= j) {
        break;
      }
      if (i > 0)
      {
        str = this.arraySeparator;
        paramStringBuffer.append(str);
      }
      long l = paramArrayOfLong[i];
      appendDetail(paramStringBuffer, paramString, l);
      i += 1;
    }
    str = this.arrayEnd;
    paramStringBuffer.append(str);
  }
  
  protected void appendDetail(StringBuffer paramStringBuffer, String paramString, Object[] paramArrayOfObject)
  {
    String str = this.arrayStart;
    paramStringBuffer.append(str);
    int i = 0;
    int j = paramArrayOfObject.length;
    if (i < j)
    {
      Object localObject = paramArrayOfObject[i];
      if (i > 0)
      {
        str = this.arraySeparator;
        paramStringBuffer.append(str);
      }
      if (localObject == null) {
        appendNullText(paramStringBuffer, paramString);
      }
      for (;;)
      {
        i += 1;
        break;
        boolean bool = this.arrayContentDetail;
        appendInternal(paramStringBuffer, paramString, localObject, bool);
      }
    }
    str = this.arrayEnd;
    paramStringBuffer.append(str);
  }
  
  protected void appendDetail(StringBuffer paramStringBuffer, String paramString, short[] paramArrayOfShort)
  {
    String str = this.arrayStart;
    paramStringBuffer.append(str);
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfShort.length;
      if (i >= j) {
        break;
      }
      if (i > 0)
      {
        str = this.arraySeparator;
        paramStringBuffer.append(str);
      }
      j = paramArrayOfShort[i];
      appendDetail(paramStringBuffer, paramString, j);
      i += 1;
    }
    str = this.arrayEnd;
    paramStringBuffer.append(str);
  }
  
  protected void appendDetail(StringBuffer paramStringBuffer, String paramString, boolean[] paramArrayOfBoolean)
  {
    String str = this.arrayStart;
    paramStringBuffer.append(str);
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfBoolean.length;
      if (i >= j) {
        break;
      }
      if (i > 0)
      {
        str = this.arraySeparator;
        paramStringBuffer.append(str);
      }
      j = paramArrayOfBoolean[i];
      appendDetail(paramStringBuffer, paramString, j);
      i += 1;
    }
    str = this.arrayEnd;
    paramStringBuffer.append(str);
  }
  
  public void appendEnd(StringBuffer paramStringBuffer, Object paramObject)
  {
    boolean bool = this.fieldSeparatorAtEnd;
    if (!bool) {
      removeLastFieldSeparator(paramStringBuffer);
    }
    appendContentEnd(paramStringBuffer);
    unregister(paramObject);
  }
  
  protected void appendFieldEnd(StringBuffer paramStringBuffer, String paramString)
  {
    appendFieldSeparator(paramStringBuffer);
  }
  
  protected void appendFieldSeparator(StringBuffer paramStringBuffer)
  {
    String str = this.fieldSeparator;
    paramStringBuffer.append(str);
  }
  
  protected void appendFieldStart(StringBuffer paramStringBuffer, String paramString)
  {
    boolean bool = this.useFieldNames;
    if ((bool) && (paramString != null))
    {
      paramStringBuffer.append(paramString);
      String str = this.fieldNameValueSeparator;
      paramStringBuffer.append(str);
    }
  }
  
  protected void appendIdentityHashCode(StringBuffer paramStringBuffer, Object paramObject)
  {
    boolean bool = isUseIdentityHashCode();
    if ((bool) && (paramObject != null))
    {
      register(paramObject);
      paramStringBuffer.append('@');
      int i = System.identityHashCode(paramObject);
      String str = Integer.toHexString(i);
      paramStringBuffer.append(str);
    }
  }
  
  protected void appendInternal(StringBuffer paramStringBuffer, String paramString, Object paramObject, boolean paramBoolean)
  {
    boolean bool1 = isRegistered(paramObject);
    if (bool1)
    {
      bool1 = paramObject instanceof Number;
      if (!bool1)
      {
        bool1 = paramObject instanceof Boolean;
        if (!bool1)
        {
          bool1 = paramObject instanceof Character;
          if (!bool1)
          {
            appendCyclicObject(paramStringBuffer, paramString, paramObject);
            return;
          }
        }
      }
    }
    register(paramObject);
    bool1 = paramObject instanceof Collection;
    Object localObject1;
    if (bool1) {
      if (paramBoolean) {
        localObject1 = paramObject;
      }
    }
    for (;;)
    {
      try
      {
        localObject1 = (Collection)paramObject;
        localObject2 = localObject1;
        appendDetail(paramStringBuffer, paramString, (Collection)localObject1);
        unregister(paramObject);
        break;
      }
      finally
      {
        Object localObject2;
        int i;
        unregister(paramObject);
      }
      localObject1 = paramObject;
      localObject1 = (Collection)paramObject;
      localObject2 = localObject1;
      i = ((Collection)localObject1).size();
      appendSummarySize(paramStringBuffer, paramString, i);
      continue;
      boolean bool2 = paramObject instanceof Map;
      Object localObject4;
      if (bool2)
      {
        if (paramBoolean)
        {
          localObject1 = paramObject;
          localObject1 = (Map)paramObject;
          localObject4 = localObject1;
          appendDetail(paramStringBuffer, paramString, (Map)localObject1);
        }
        else
        {
          localObject1 = paramObject;
          localObject1 = (Map)paramObject;
          localObject4 = localObject1;
          int j = ((Map)localObject1).size();
          appendSummarySize(paramStringBuffer, paramString, j);
        }
      }
      else
      {
        boolean bool3 = paramObject instanceof long[];
        if (bool3)
        {
          if (paramBoolean)
          {
            localObject1 = paramObject;
            localObject1 = (long[])paramObject;
            localObject4 = localObject1;
            localObject4 = (long[])localObject1;
            appendDetail(paramStringBuffer, paramString, (long[])localObject4);
          }
          else
          {
            localObject1 = paramObject;
            localObject1 = (long[])paramObject;
            localObject4 = localObject1;
            localObject4 = (long[])localObject1;
            appendSummary(paramStringBuffer, paramString, (long[])localObject4);
          }
        }
        else
        {
          bool3 = paramObject instanceof int[];
          if (bool3)
          {
            if (paramBoolean)
            {
              localObject1 = paramObject;
              localObject1 = (int[])paramObject;
              localObject4 = localObject1;
              localObject4 = (int[])localObject1;
              appendDetail(paramStringBuffer, paramString, (int[])localObject4);
            }
            else
            {
              localObject1 = paramObject;
              localObject1 = (int[])paramObject;
              localObject4 = localObject1;
              localObject4 = (int[])localObject1;
              appendSummary(paramStringBuffer, paramString, (int[])localObject4);
            }
          }
          else
          {
            bool3 = paramObject instanceof short[];
            if (bool3)
            {
              if (paramBoolean)
              {
                localObject1 = paramObject;
                localObject1 = (short[])paramObject;
                localObject4 = localObject1;
                localObject4 = (short[])localObject1;
                appendDetail(paramStringBuffer, paramString, (short[])localObject4);
              }
              else
              {
                localObject1 = paramObject;
                localObject1 = (short[])paramObject;
                localObject4 = localObject1;
                localObject4 = (short[])localObject1;
                appendSummary(paramStringBuffer, paramString, (short[])localObject4);
              }
            }
            else
            {
              bool3 = paramObject instanceof byte[];
              if (bool3)
              {
                if (paramBoolean)
                {
                  localObject1 = paramObject;
                  localObject1 = (byte[])paramObject;
                  localObject4 = localObject1;
                  localObject4 = (byte[])localObject1;
                  appendDetail(paramStringBuffer, paramString, (byte[])localObject4);
                }
                else
                {
                  localObject1 = paramObject;
                  localObject1 = (byte[])paramObject;
                  localObject4 = localObject1;
                  localObject4 = (byte[])localObject1;
                  appendSummary(paramStringBuffer, paramString, (byte[])localObject4);
                }
              }
              else
              {
                bool3 = paramObject instanceof char[];
                if (bool3)
                {
                  if (paramBoolean)
                  {
                    localObject1 = paramObject;
                    localObject1 = (char[])paramObject;
                    localObject4 = localObject1;
                    localObject4 = (char[])localObject1;
                    appendDetail(paramStringBuffer, paramString, (char[])localObject4);
                  }
                  else
                  {
                    localObject1 = paramObject;
                    localObject1 = (char[])paramObject;
                    localObject4 = localObject1;
                    localObject4 = (char[])localObject1;
                    appendSummary(paramStringBuffer, paramString, (char[])localObject4);
                  }
                }
                else
                {
                  bool3 = paramObject instanceof double[];
                  if (bool3)
                  {
                    if (paramBoolean)
                    {
                      localObject1 = paramObject;
                      localObject1 = (double[])paramObject;
                      localObject4 = localObject1;
                      localObject4 = (double[])localObject1;
                      appendDetail(paramStringBuffer, paramString, (double[])localObject4);
                    }
                    else
                    {
                      localObject1 = paramObject;
                      localObject1 = (double[])paramObject;
                      localObject4 = localObject1;
                      localObject4 = (double[])localObject1;
                      appendSummary(paramStringBuffer, paramString, (double[])localObject4);
                    }
                  }
                  else
                  {
                    bool3 = paramObject instanceof float[];
                    if (bool3)
                    {
                      if (paramBoolean)
                      {
                        localObject1 = paramObject;
                        localObject1 = (float[])paramObject;
                        localObject4 = localObject1;
                        localObject4 = (float[])localObject1;
                        appendDetail(paramStringBuffer, paramString, (float[])localObject4);
                      }
                      else
                      {
                        localObject1 = paramObject;
                        localObject1 = (float[])paramObject;
                        localObject4 = localObject1;
                        localObject4 = (float[])localObject1;
                        appendSummary(paramStringBuffer, paramString, (float[])localObject4);
                      }
                    }
                    else
                    {
                      bool3 = paramObject instanceof boolean[];
                      if (bool3)
                      {
                        if (paramBoolean)
                        {
                          localObject1 = paramObject;
                          localObject1 = (boolean[])paramObject;
                          localObject4 = localObject1;
                          localObject4 = (boolean[])localObject1;
                          appendDetail(paramStringBuffer, paramString, (boolean[])localObject4);
                        }
                        else
                        {
                          localObject1 = paramObject;
                          localObject1 = (boolean[])paramObject;
                          localObject4 = localObject1;
                          localObject4 = (boolean[])localObject1;
                          appendSummary(paramStringBuffer, paramString, (boolean[])localObject4);
                        }
                      }
                      else
                      {
                        localObject4 = paramObject.getClass();
                        bool3 = ((Class)localObject4).isArray();
                        if (bool3)
                        {
                          if (paramBoolean)
                          {
                            localObject1 = paramObject;
                            localObject1 = (Object[])paramObject;
                            localObject4 = localObject1;
                            localObject4 = (Object[])localObject1;
                            appendDetail(paramStringBuffer, paramString, (Object[])localObject4);
                          }
                          else
                          {
                            localObject1 = paramObject;
                            localObject1 = (Object[])paramObject;
                            localObject4 = localObject1;
                            localObject4 = (Object[])localObject1;
                            appendSummary(paramStringBuffer, paramString, (Object[])localObject4);
                          }
                        }
                        else if (paramBoolean) {
                          appendDetail(paramStringBuffer, paramString, paramObject);
                        } else {
                          appendSummary(paramStringBuffer, paramString, paramObject);
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
    }
  }
  
  protected void appendNullText(StringBuffer paramStringBuffer, String paramString)
  {
    String str = this.nullText;
    paramStringBuffer.append(str);
  }
  
  public void appendStart(StringBuffer paramStringBuffer, Object paramObject)
  {
    if (paramObject != null)
    {
      appendClassName(paramStringBuffer, paramObject);
      appendIdentityHashCode(paramStringBuffer, paramObject);
      appendContentStart(paramStringBuffer);
      boolean bool = this.fieldSeparatorAtStart;
      if (bool) {
        appendFieldSeparator(paramStringBuffer);
      }
    }
  }
  
  protected void appendSummary(StringBuffer paramStringBuffer, String paramString, Object paramObject)
  {
    Object localObject = this.summaryObjectStartText;
    paramStringBuffer.append((String)localObject);
    localObject = paramObject.getClass();
    localObject = getShortClassName((Class)localObject);
    paramStringBuffer.append((String)localObject);
    localObject = this.summaryObjectEndText;
    paramStringBuffer.append((String)localObject);
  }
  
  protected void appendSummary(StringBuffer paramStringBuffer, String paramString, byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    appendSummarySize(paramStringBuffer, paramString, i);
  }
  
  protected void appendSummary(StringBuffer paramStringBuffer, String paramString, char[] paramArrayOfChar)
  {
    int i = paramArrayOfChar.length;
    appendSummarySize(paramStringBuffer, paramString, i);
  }
  
  protected void appendSummary(StringBuffer paramStringBuffer, String paramString, double[] paramArrayOfDouble)
  {
    int i = paramArrayOfDouble.length;
    appendSummarySize(paramStringBuffer, paramString, i);
  }
  
  protected void appendSummary(StringBuffer paramStringBuffer, String paramString, float[] paramArrayOfFloat)
  {
    int i = paramArrayOfFloat.length;
    appendSummarySize(paramStringBuffer, paramString, i);
  }
  
  protected void appendSummary(StringBuffer paramStringBuffer, String paramString, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    appendSummarySize(paramStringBuffer, paramString, i);
  }
  
  protected void appendSummary(StringBuffer paramStringBuffer, String paramString, long[] paramArrayOfLong)
  {
    int i = paramArrayOfLong.length;
    appendSummarySize(paramStringBuffer, paramString, i);
  }
  
  protected void appendSummary(StringBuffer paramStringBuffer, String paramString, Object[] paramArrayOfObject)
  {
    int i = paramArrayOfObject.length;
    appendSummarySize(paramStringBuffer, paramString, i);
  }
  
  protected void appendSummary(StringBuffer paramStringBuffer, String paramString, short[] paramArrayOfShort)
  {
    int i = paramArrayOfShort.length;
    appendSummarySize(paramStringBuffer, paramString, i);
  }
  
  protected void appendSummary(StringBuffer paramStringBuffer, String paramString, boolean[] paramArrayOfBoolean)
  {
    int i = paramArrayOfBoolean.length;
    appendSummarySize(paramStringBuffer, paramString, i);
  }
  
  protected void appendSummarySize(StringBuffer paramStringBuffer, String paramString, int paramInt)
  {
    String str = this.sizeStartText;
    paramStringBuffer.append(str);
    paramStringBuffer.append(paramInt);
    str = this.sizeEndText;
    paramStringBuffer.append(str);
  }
  
  public void appendSuper(StringBuffer paramStringBuffer, String paramString)
  {
    appendToString(paramStringBuffer, paramString);
  }
  
  public void appendToString(StringBuffer paramStringBuffer, String paramString)
  {
    if (paramString != null)
    {
      String str1 = this.contentStart;
      int i = paramString.indexOf(str1);
      String str2 = this.contentStart;
      int j = str2.length();
      int k = i + j;
      str1 = this.contentEnd;
      int m = paramString.lastIndexOf(str1);
      if ((k != m) && (k >= 0) && (m >= 0))
      {
        String str3 = paramString.substring(k, m);
        boolean bool = this.fieldSeparatorAtStart;
        if (bool) {
          removeLastFieldSeparator(paramStringBuffer);
        }
        paramStringBuffer.append(str3);
        appendFieldSeparator(paramStringBuffer);
      }
    }
  }
  
  protected String getArrayEnd()
  {
    return this.arrayEnd;
  }
  
  protected String getArraySeparator()
  {
    return this.arraySeparator;
  }
  
  protected String getArrayStart()
  {
    return this.arrayStart;
  }
  
  protected String getContentEnd()
  {
    return this.contentEnd;
  }
  
  protected String getContentStart()
  {
    return this.contentStart;
  }
  
  protected String getFieldNameValueSeparator()
  {
    return this.fieldNameValueSeparator;
  }
  
  protected String getFieldSeparator()
  {
    return this.fieldSeparator;
  }
  
  protected String getNullText()
  {
    return this.nullText;
  }
  
  protected String getShortClassName(Class paramClass)
  {
    return ClassUtils.getShortClassName(paramClass);
  }
  
  protected String getSizeEndText()
  {
    return this.sizeEndText;
  }
  
  protected String getSizeStartText()
  {
    return this.sizeStartText;
  }
  
  protected String getSummaryObjectEndText()
  {
    return this.summaryObjectEndText;
  }
  
  protected String getSummaryObjectStartText()
  {
    return this.summaryObjectStartText;
  }
  
  protected boolean isArrayContentDetail()
  {
    return this.arrayContentDetail;
  }
  
  protected boolean isDefaultFullDetail()
  {
    return this.defaultFullDetail;
  }
  
  protected boolean isFieldSeparatorAtEnd()
  {
    return this.fieldSeparatorAtEnd;
  }
  
  protected boolean isFieldSeparatorAtStart()
  {
    return this.fieldSeparatorAtStart;
  }
  
  protected boolean isFullDetail(Boolean paramBoolean)
  {
    if (paramBoolean == null) {}
    for (boolean bool = this.defaultFullDetail;; bool = paramBoolean.booleanValue()) {
      return bool;
    }
  }
  
  protected boolean isShortClassName()
  {
    return this.useShortClassName;
  }
  
  protected boolean isUseClassName()
  {
    return this.useClassName;
  }
  
  protected boolean isUseFieldNames()
  {
    return this.useFieldNames;
  }
  
  protected boolean isUseIdentityHashCode()
  {
    return this.useIdentityHashCode;
  }
  
  protected boolean isUseShortClassName()
  {
    return this.useShortClassName;
  }
  
  protected void reflectionAppendArrayDetail(StringBuffer paramStringBuffer, String paramString, Object paramObject)
  {
    String str = this.arrayStart;
    paramStringBuffer.append(str);
    int i = Array.getLength(paramObject);
    int j = 0;
    if (j < i)
    {
      Object localObject = Array.get(paramObject, j);
      if (j > 0)
      {
        str = this.arraySeparator;
        paramStringBuffer.append(str);
      }
      if (localObject == null) {
        appendNullText(paramStringBuffer, paramString);
      }
      for (;;)
      {
        j += 1;
        break;
        boolean bool = this.arrayContentDetail;
        appendInternal(paramStringBuffer, paramString, localObject, bool);
      }
    }
    str = this.arrayEnd;
    paramStringBuffer.append(str);
  }
  
  protected void removeLastFieldSeparator(StringBuffer paramStringBuffer)
  {
    int i = paramStringBuffer.length();
    String str1 = this.fieldSeparator;
    int j = str1.length();
    int k;
    int m;
    if ((i > 0) && (j > 0) && (i >= j))
    {
      k = 1;
      m = 0;
    }
    for (;;)
    {
      int n;
      if (m < j)
      {
        n = i + -1 - m;
        n = paramStringBuffer.charAt(n);
        String str2 = this.fieldSeparator;
        int i1 = j + -1 - m;
        int i2 = str2.charAt(i1);
        if (n != i2) {
          k = 0;
        }
      }
      else
      {
        if (k != 0)
        {
          n = i - j;
          paramStringBuffer.setLength(n);
        }
        return;
      }
      m += 1;
    }
  }
  
  protected void setArrayContentDetail(boolean paramBoolean)
  {
    this.arrayContentDetail = paramBoolean;
  }
  
  protected void setArrayEnd(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    this.arrayEnd = paramString;
  }
  
  protected void setArraySeparator(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    this.arraySeparator = paramString;
  }
  
  protected void setArrayStart(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    this.arrayStart = paramString;
  }
  
  protected void setContentEnd(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    this.contentEnd = paramString;
  }
  
  protected void setContentStart(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    this.contentStart = paramString;
  }
  
  protected void setDefaultFullDetail(boolean paramBoolean)
  {
    this.defaultFullDetail = paramBoolean;
  }
  
  protected void setFieldNameValueSeparator(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    this.fieldNameValueSeparator = paramString;
  }
  
  protected void setFieldSeparator(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    this.fieldSeparator = paramString;
  }
  
  protected void setFieldSeparatorAtEnd(boolean paramBoolean)
  {
    this.fieldSeparatorAtEnd = paramBoolean;
  }
  
  protected void setFieldSeparatorAtStart(boolean paramBoolean)
  {
    this.fieldSeparatorAtStart = paramBoolean;
  }
  
  protected void setNullText(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    this.nullText = paramString;
  }
  
  protected void setShortClassName(boolean paramBoolean)
  {
    this.useShortClassName = paramBoolean;
  }
  
  protected void setSizeEndText(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    this.sizeEndText = paramString;
  }
  
  protected void setSizeStartText(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    this.sizeStartText = paramString;
  }
  
  protected void setSummaryObjectEndText(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    this.summaryObjectEndText = paramString;
  }
  
  protected void setSummaryObjectStartText(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    this.summaryObjectStartText = paramString;
  }
  
  protected void setUseClassName(boolean paramBoolean)
  {
    this.useClassName = paramBoolean;
  }
  
  protected void setUseFieldNames(boolean paramBoolean)
  {
    this.useFieldNames = paramBoolean;
  }
  
  protected void setUseIdentityHashCode(boolean paramBoolean)
  {
    this.useIdentityHashCode = paramBoolean;
  }
  
  protected void setUseShortClassName(boolean paramBoolean)
  {
    this.useShortClassName = paramBoolean;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/builder/ToStringStyle.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */