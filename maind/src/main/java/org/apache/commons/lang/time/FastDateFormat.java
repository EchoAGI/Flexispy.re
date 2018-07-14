package org.apache.commons.lang.time;

import java.io.ObjectInputStream;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public class FastDateFormat
  extends Format
{
  public static final int FULL = 0;
  public static final int LONG = 1;
  public static final int MEDIUM = 2;
  public static final int SHORT = 3;
  private static final Map cDateInstanceCache;
  private static final Map cDateTimeInstanceCache;
  private static String cDefaultPattern;
  private static final Map cInstanceCache;
  private static final Map cTimeInstanceCache;
  private static final Map cTimeZoneDisplayCache;
  private static final long serialVersionUID = 1L;
  private final Locale mLocale;
  private final boolean mLocaleForced;
  private transient int mMaxLengthEstimate;
  private final String mPattern;
  private transient FastDateFormat.Rule[] mRules;
  private final TimeZone mTimeZone;
  private final boolean mTimeZoneForced;
  
  static
  {
    int i = 7;
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>(i);
    cInstanceCache = localHashMap;
    localHashMap = new java/util/HashMap;
    localHashMap.<init>(i);
    cDateInstanceCache = localHashMap;
    localHashMap = new java/util/HashMap;
    localHashMap.<init>(i);
    cTimeInstanceCache = localHashMap;
    localHashMap = new java/util/HashMap;
    localHashMap.<init>(i);
    cDateTimeInstanceCache = localHashMap;
    localHashMap = new java/util/HashMap;
    localHashMap.<init>(i);
    cTimeZoneDisplayCache = localHashMap;
  }
  
  protected FastDateFormat(String paramString, TimeZone paramTimeZone, Locale paramLocale)
  {
    IllegalArgumentException localIllegalArgumentException;
    if (paramString == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The pattern must not be null");
      throw localIllegalArgumentException;
    }
    this.mPattern = paramString;
    boolean bool2;
    if (paramTimeZone != null)
    {
      bool2 = bool1;
      this.mTimeZoneForced = bool2;
      if (paramTimeZone == null) {
        paramTimeZone = TimeZone.getDefault();
      }
      this.mTimeZone = paramTimeZone;
      if (paramLocale == null) {
        break label91;
      }
    }
    for (;;)
    {
      this.mLocaleForced = bool1;
      if (paramLocale == null) {
        paramLocale = Locale.getDefault();
      }
      this.mLocale = paramLocale;
      return;
      bool2 = false;
      localIllegalArgumentException = null;
      break;
      label91:
      bool1 = false;
    }
  }
  
  public static FastDateFormat getDateInstance(int paramInt)
  {
    return getDateInstance(paramInt, null, null);
  }
  
  public static FastDateFormat getDateInstance(int paramInt, Locale paramLocale)
  {
    return getDateInstance(paramInt, null, paramLocale);
  }
  
  public static FastDateFormat getDateInstance(int paramInt, TimeZone paramTimeZone)
  {
    return getDateInstance(paramInt, paramTimeZone, null);
  }
  
  public static FastDateFormat getDateInstance(int paramInt, TimeZone paramTimeZone, Locale paramLocale)
  {
    for (;;)
    {
      Object localObject1;
      synchronized (FastDateFormat.class)
      {
        localObject1 = new java/lang/Integer;
        ((Integer)localObject1).<init>(paramInt);
        if (paramTimeZone != null)
        {
          localObject2 = new org/apache/commons/lang/time/FastDateFormat$Pair;
          ((FastDateFormat.Pair)localObject2).<init>(localObject1, paramTimeZone);
          if (paramLocale == null) {
            paramLocale = Locale.getDefault();
          }
          localObject1 = new org/apache/commons/lang/time/FastDateFormat$Pair;
          ((FastDateFormat.Pair)localObject1).<init>(localObject2, paramLocale);
          Object localObject3 = cDateInstanceCache;
          Object localObject5 = ((Map)localObject3).get(localObject1);
          localObject5 = (FastDateFormat)localObject5;
          if (localObject5 == null) {}
          try
          {
            Object localObject6 = DateFormat.getDateInstance(paramInt, paramLocale);
            localObject6 = (SimpleDateFormat)localObject6;
            String str1 = ((SimpleDateFormat)localObject6).toPattern();
            localObject5 = getInstance(str1, paramTimeZone, paramLocale);
            localObject3 = cDateInstanceCache;
            ((Map)localObject3).put(localObject1, localObject5);
            return (FastDateFormat)localObject5;
          }
          catch (ClassCastException localClassCastException)
          {
            localObject3 = new java/lang/IllegalArgumentException;
            Object localObject7 = new java/lang/StringBuffer;
            ((StringBuffer)localObject7).<init>();
            String str2 = "No date pattern for locale: ";
            localObject7 = ((StringBuffer)localObject7).append(str2);
            localObject7 = ((StringBuffer)localObject7).append(paramLocale);
            localObject7 = ((StringBuffer)localObject7).toString();
            ((IllegalArgumentException)localObject3).<init>((String)localObject7);
            throw ((Throwable)localObject3);
          }
        }
      }
      Object localObject2 = localObject1;
    }
  }
  
  public static FastDateFormat getDateTimeInstance(int paramInt1, int paramInt2)
  {
    return getDateTimeInstance(paramInt1, paramInt2, null, null);
  }
  
  public static FastDateFormat getDateTimeInstance(int paramInt1, int paramInt2, Locale paramLocale)
  {
    return getDateTimeInstance(paramInt1, paramInt2, null, paramLocale);
  }
  
  public static FastDateFormat getDateTimeInstance(int paramInt1, int paramInt2, TimeZone paramTimeZone)
  {
    return getDateTimeInstance(paramInt1, paramInt2, paramTimeZone, null);
  }
  
  public static FastDateFormat getDateTimeInstance(int paramInt1, int paramInt2, TimeZone paramTimeZone, Locale paramLocale)
  {
    for (;;)
    {
      FastDateFormat.Pair localPair1;
      synchronized (FastDateFormat.class)
      {
        localPair1 = new org/apache/commons/lang/time/FastDateFormat$Pair;
        Object localObject1 = new java/lang/Integer;
        ((Integer)localObject1).<init>(paramInt1);
        Object localObject3 = new java/lang/Integer;
        ((Integer)localObject3).<init>(paramInt2);
        localPair1.<init>(localObject1, localObject3);
        if (paramTimeZone != null)
        {
          localPair2 = new org/apache/commons/lang/time/FastDateFormat$Pair;
          localPair2.<init>(localPair1, paramTimeZone);
          if (paramLocale == null) {
            paramLocale = Locale.getDefault();
          }
          localPair1 = new org/apache/commons/lang/time/FastDateFormat$Pair;
          localPair1.<init>(localPair2, paramLocale);
          localObject1 = cDateTimeInstanceCache;
          Object localObject4 = ((Map)localObject1).get(localPair1);
          localObject4 = (FastDateFormat)localObject4;
          if (localObject4 == null) {}
          try
          {
            Object localObject5 = DateFormat.getDateTimeInstance(paramInt1, paramInt2, paramLocale);
            localObject5 = (SimpleDateFormat)localObject5;
            String str1 = ((SimpleDateFormat)localObject5).toPattern();
            localObject4 = getInstance(str1, paramTimeZone, paramLocale);
            localObject1 = cDateTimeInstanceCache;
            ((Map)localObject1).put(localPair1, localObject4);
            return (FastDateFormat)localObject4;
          }
          catch (ClassCastException localClassCastException)
          {
            localObject1 = new java/lang/IllegalArgumentException;
            localObject3 = new java/lang/StringBuffer;
            ((StringBuffer)localObject3).<init>();
            String str2 = "No date time pattern for locale: ";
            localObject3 = ((StringBuffer)localObject3).append(str2);
            localObject3 = ((StringBuffer)localObject3).append(paramLocale);
            localObject3 = ((StringBuffer)localObject3).toString();
            ((IllegalArgumentException)localObject1).<init>((String)localObject3);
            throw ((Throwable)localObject1);
          }
        }
      }
      FastDateFormat.Pair localPair2 = localPair1;
    }
  }
  
  private static String getDefaultPattern()
  {
    synchronized (FastDateFormat.class)
    {
      Object localObject1 = cDefaultPattern;
      if (localObject1 == null)
      {
        localObject1 = new java/text/SimpleDateFormat;
        ((SimpleDateFormat)localObject1).<init>();
        localObject1 = ((SimpleDateFormat)localObject1).toPattern();
        cDefaultPattern = (String)localObject1;
      }
      localObject1 = cDefaultPattern;
      return (String)localObject1;
    }
  }
  
  public static FastDateFormat getInstance()
  {
    return getInstance(getDefaultPattern(), null, null);
  }
  
  public static FastDateFormat getInstance(String paramString)
  {
    return getInstance(paramString, null, null);
  }
  
  public static FastDateFormat getInstance(String paramString, Locale paramLocale)
  {
    return getInstance(paramString, null, paramLocale);
  }
  
  public static FastDateFormat getInstance(String paramString, TimeZone paramTimeZone)
  {
    return getInstance(paramString, paramTimeZone, null);
  }
  
  public static FastDateFormat getInstance(String paramString, TimeZone paramTimeZone, Locale paramLocale)
  {
    synchronized (FastDateFormat.class)
    {
      FastDateFormat localFastDateFormat = new org/apache/commons/lang/time/FastDateFormat;
      localFastDateFormat.<init>(paramString, paramTimeZone, paramLocale);
      Map localMap = cInstanceCache;
      Object localObject2 = localMap.get(localFastDateFormat);
      localObject2 = (FastDateFormat)localObject2;
      if (localObject2 == null)
      {
        localObject2 = localFastDateFormat;
        localFastDateFormat.init();
        localMap = cInstanceCache;
        localMap.put(localFastDateFormat, localFastDateFormat);
      }
      return (FastDateFormat)localObject2;
    }
  }
  
  public static FastDateFormat getTimeInstance(int paramInt)
  {
    return getTimeInstance(paramInt, null, null);
  }
  
  public static FastDateFormat getTimeInstance(int paramInt, Locale paramLocale)
  {
    return getTimeInstance(paramInt, null, paramLocale);
  }
  
  public static FastDateFormat getTimeInstance(int paramInt, TimeZone paramTimeZone)
  {
    return getTimeInstance(paramInt, paramTimeZone, null);
  }
  
  public static FastDateFormat getTimeInstance(int paramInt, TimeZone paramTimeZone, Locale paramLocale)
  {
    for (;;)
    {
      synchronized (FastDateFormat.class)
      {
        localObject1 = new java/lang/Integer;
        ((Integer)localObject1).<init>(paramInt);
        if (paramTimeZone == null) {
          break label206;
        }
        localObject2 = new org/apache/commons/lang/time/FastDateFormat$Pair;
        ((FastDateFormat.Pair)localObject2).<init>(localObject1, paramTimeZone);
        if (paramLocale != null)
        {
          localObject1 = new org/apache/commons/lang/time/FastDateFormat$Pair;
          ((FastDateFormat.Pair)localObject1).<init>(localObject2, paramLocale);
          Object localObject3 = cTimeInstanceCache;
          Object localObject5 = ((Map)localObject3).get(localObject1);
          localObject5 = (FastDateFormat)localObject5;
          if (localObject5 == null) {
            if (paramLocale == null) {
              paramLocale = Locale.getDefault();
            }
          }
          try
          {
            Object localObject6 = DateFormat.getTimeInstance(paramInt, paramLocale);
            localObject6 = (SimpleDateFormat)localObject6;
            String str1 = ((SimpleDateFormat)localObject6).toPattern();
            localObject5 = getInstance(str1, paramTimeZone, paramLocale);
            localObject3 = cTimeInstanceCache;
            ((Map)localObject3).put(localObject1, localObject5);
            return (FastDateFormat)localObject5;
          }
          catch (ClassCastException localClassCastException)
          {
            localObject3 = new java/lang/IllegalArgumentException;
            Object localObject7 = new java/lang/StringBuffer;
            ((StringBuffer)localObject7).<init>();
            String str2 = "No date pattern for locale: ";
            localObject7 = ((StringBuffer)localObject7).append(str2);
            localObject7 = ((StringBuffer)localObject7).append(paramLocale);
            localObject7 = ((StringBuffer)localObject7).toString();
            ((IllegalArgumentException)localObject3).<init>((String)localObject7);
            throw ((Throwable)localObject3);
          }
        }
      }
      Object localObject1 = localObject2;
      continue;
      label206:
      Object localObject2 = localObject1;
    }
  }
  
  static String getTimeZoneDisplay(TimeZone paramTimeZone, boolean paramBoolean, int paramInt, Locale paramLocale)
  {
    synchronized (FastDateFormat.class)
    {
      FastDateFormat.TimeZoneDisplayKey localTimeZoneDisplayKey = new org/apache/commons/lang/time/FastDateFormat$TimeZoneDisplayKey;
      localTimeZoneDisplayKey.<init>(paramTimeZone, paramBoolean, paramInt, paramLocale);
      Map localMap = cTimeZoneDisplayCache;
      Object localObject2 = localMap.get(localTimeZoneDisplayKey);
      localObject2 = (String)localObject2;
      if (localObject2 == null)
      {
        localObject2 = paramTimeZone.getDisplayName(paramBoolean, paramInt, paramLocale);
        localMap = cTimeZoneDisplayCache;
        localMap.put(localTimeZoneDisplayKey, localObject2);
      }
      return (String)localObject2;
    }
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream)
  {
    paramObjectInputStream.defaultReadObject();
    init();
  }
  
  protected StringBuffer applyRules(Calendar paramCalendar, StringBuffer paramStringBuffer)
  {
    FastDateFormat.Rule[] arrayOfRule = this.mRules;
    Object localObject = this.mRules;
    int i = localObject.length;
    int j = 0;
    while (j < i)
    {
      localObject = arrayOfRule[j];
      ((FastDateFormat.Rule)localObject).appendTo(paramStringBuffer, paramCalendar);
      j += 1;
    }
    return paramStringBuffer;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof FastDateFormat;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      Object localObject1 = paramObject;
      localObject1 = (FastDateFormat)paramObject;
      Object localObject2 = this.mPattern;
      Object localObject3 = ((FastDateFormat)localObject1).mPattern;
      if (localObject2 != localObject3)
      {
        localObject2 = this.mPattern;
        localObject3 = ((FastDateFormat)localObject1).mPattern;
        bool2 = ((String)localObject2).equals(localObject3);
        if (!bool2) {}
      }
      else
      {
        localObject2 = this.mTimeZone;
        localObject3 = ((FastDateFormat)localObject1).mTimeZone;
        if (localObject2 != localObject3)
        {
          localObject2 = this.mTimeZone;
          localObject3 = ((FastDateFormat)localObject1).mTimeZone;
          bool2 = localObject2.equals(localObject3);
          if (!bool2) {}
        }
        else
        {
          localObject2 = this.mLocale;
          localObject3 = ((FastDateFormat)localObject1).mLocale;
          if (localObject2 != localObject3)
          {
            localObject2 = this.mLocale;
            localObject3 = ((FastDateFormat)localObject1).mLocale;
            bool2 = ((Locale)localObject2).equals(localObject3);
            if (!bool2) {}
          }
          else
          {
            bool2 = this.mTimeZoneForced;
            boolean bool3 = ((FastDateFormat)localObject1).mTimeZoneForced;
            if (bool2 == bool3)
            {
              bool2 = this.mLocaleForced;
              bool3 = ((FastDateFormat)localObject1).mLocaleForced;
              if (bool2 == bool3) {
                bool1 = true;
              }
            }
          }
        }
      }
    }
  }
  
  public String format(long paramLong)
  {
    Date localDate = new java/util/Date;
    localDate.<init>(paramLong);
    return format(localDate);
  }
  
  public String format(Calendar paramCalendar)
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    int i = this.mMaxLengthEstimate;
    localStringBuffer.<init>(i);
    return format(paramCalendar, localStringBuffer).toString();
  }
  
  public String format(Date paramDate)
  {
    GregorianCalendar localGregorianCalendar = new java/util/GregorianCalendar;
    Object localObject = this.mTimeZone;
    localGregorianCalendar.<init>((TimeZone)localObject);
    localGregorianCalendar.setTime(paramDate);
    localObject = new java/lang/StringBuffer;
    int i = this.mMaxLengthEstimate;
    ((StringBuffer)localObject).<init>(i);
    return applyRules(localGregorianCalendar, (StringBuffer)localObject).toString();
  }
  
  public StringBuffer format(long paramLong, StringBuffer paramStringBuffer)
  {
    Date localDate = new java/util/Date;
    localDate.<init>(paramLong);
    return format(localDate, paramStringBuffer);
  }
  
  public StringBuffer format(Object paramObject, StringBuffer paramStringBuffer, FieldPosition paramFieldPosition)
  {
    boolean bool = paramObject instanceof Date;
    if (bool)
    {
      paramObject = (Date)paramObject;
      localObject = format((Date)paramObject, paramStringBuffer);
    }
    for (;;)
    {
      return (StringBuffer)localObject;
      bool = paramObject instanceof Calendar;
      if (bool)
      {
        paramObject = (Calendar)paramObject;
        localObject = format((Calendar)paramObject, paramStringBuffer);
      }
      else
      {
        bool = paramObject instanceof Long;
        if (!bool) {
          break;
        }
        paramObject = (Long)paramObject;
        long l = ((Long)paramObject).longValue();
        localObject = format(l, paramStringBuffer);
      }
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    Object localObject = new java/lang/StringBuffer;
    ((StringBuffer)localObject).<init>();
    StringBuffer localStringBuffer = ((StringBuffer)localObject).append("Unknown class: ");
    if (paramObject == null) {}
    for (localObject = "<null>";; localObject = paramObject.getClass().getName())
    {
      localObject = (String)localObject;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
  }
  
  public StringBuffer format(Calendar paramCalendar, StringBuffer paramStringBuffer)
  {
    boolean bool = this.mTimeZoneForced;
    if (bool)
    {
      paramCalendar.getTime();
      paramCalendar = (Calendar)paramCalendar.clone();
      TimeZone localTimeZone = this.mTimeZone;
      paramCalendar.setTimeZone(localTimeZone);
    }
    return applyRules(paramCalendar, paramStringBuffer);
  }
  
  public StringBuffer format(Date paramDate, StringBuffer paramStringBuffer)
  {
    GregorianCalendar localGregorianCalendar = new java/util/GregorianCalendar;
    TimeZone localTimeZone = this.mTimeZone;
    localGregorianCalendar.<init>(localTimeZone);
    localGregorianCalendar.setTime(paramDate);
    return applyRules(localGregorianCalendar, paramStringBuffer);
  }
  
  public Locale getLocale()
  {
    return this.mLocale;
  }
  
  public int getMaxLengthEstimate()
  {
    return this.mMaxLengthEstimate;
  }
  
  public String getPattern()
  {
    return this.mPattern;
  }
  
  public TimeZone getTimeZone()
  {
    return this.mTimeZone;
  }
  
  public boolean getTimeZoneOverridesCalendar()
  {
    return this.mTimeZoneForced;
  }
  
  public int hashCode()
  {
    int i = 1;
    int j = this.mPattern.hashCode();
    int n = 0 + j;
    Object localObject = this.mTimeZone;
    j = localObject.hashCode();
    n += j;
    int k = this.mTimeZoneForced;
    int i1;
    boolean bool;
    if (k != 0)
    {
      k = i;
      n += k;
      localObject = this.mLocale;
      int m = ((Locale)localObject).hashCode();
      i1 += m;
      bool = this.mLocaleForced;
      if (!bool) {
        break label82;
      }
    }
    for (;;)
    {
      return i1 + i;
      bool = false;
      localObject = null;
      break;
      label82:
      i = 0;
    }
  }
  
  protected void init()
  {
    List localList = parsePattern();
    int i = localList.size();
    Object localObject = new FastDateFormat.Rule[i];
    localObject = (FastDateFormat.Rule[])localList.toArray((Object[])localObject);
    this.mRules = ((FastDateFormat.Rule[])localObject);
    int j = 0;
    localObject = this.mRules;
    int k = localObject.length;
    for (;;)
    {
      k += -1;
      if (k < 0) {
        break;
      }
      localObject = this.mRules[k];
      i = ((FastDateFormat.Rule)localObject).estimateLength();
      j += i;
    }
    this.mMaxLengthEstimate = j;
  }
  
  public Object parseObject(String paramString, ParsePosition paramParsePosition)
  {
    paramParsePosition.setIndex(0);
    paramParsePosition.setErrorIndex(0);
    return null;
  }
  
  protected List parsePattern()
  {
    DateFormatSymbols localDateFormatSymbols = new java/text/DateFormatSymbols;
    Object localObject1 = this;
    Object localObject2 = this.mLocale;
    localObject1 = localDateFormatSymbols;
    localDateFormatSymbols.<init>((Locale)localObject2);
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    String[] arrayOfString1 = localDateFormatSymbols.getEras();
    String[] arrayOfString2 = localDateFormatSymbols.getMonths();
    String[] arrayOfString3 = localDateFormatSymbols.getShortMonths();
    String[] arrayOfString4 = localDateFormatSymbols.getWeekdays();
    String[] arrayOfString5 = localDateFormatSymbols.getShortWeekdays();
    String[] arrayOfString6 = localDateFormatSymbols.getAmPmStrings();
    localObject1 = this;
    localObject1 = this.mPattern;
    localObject2 = localObject1;
    int i = ((String)localObject1).length();
    int j = 1;
    int k = j;
    int[] arrayOfInt = new int[j];
    int n = 0;
    String str1;
    int i1;
    if (n < i)
    {
      arrayOfInt[0] = n;
      localObject1 = this;
      localObject2 = this.mPattern;
      localObject1 = this;
      str1 = parseToken((String)localObject2, arrayOfInt);
      j = 0;
      localObject2 = null;
      n = arrayOfInt[0];
      i1 = str1.length();
      if (i1 != 0) {}
    }
    else
    {
      return localArrayList;
    }
    j = 0;
    localObject2 = null;
    localObject1 = str1;
    int i2 = 0;
    int i3 = str1.charAt(0);
    Object localObject4;
    int m;
    switch (i3)
    {
    default: 
      localObject2 = new java/lang/IllegalArgumentException;
      Object localObject3 = new java/lang/StringBuffer;
      ((StringBuffer)localObject3).<init>();
      localObject3 = ((StringBuffer)localObject3).append("Illegal pattern component: ");
      localObject1 = localObject3;
      localObject3 = str1;
      ((IllegalArgumentException)localObject2).<init>((String)localObject3);
      throw ((Throwable)localObject2);
    case 71: 
      localObject4 = new org/apache/commons/lang/time/FastDateFormat$TextField;
      j = 0;
      localObject2 = null;
      m = 0;
      localObject1 = null;
      ((FastDateFormat.TextField)localObject4).<init>(0, arrayOfString1);
    }
    for (;;)
    {
      localArrayList.add(localObject4);
      n += 1;
      break;
      j = 4;
      m = i1;
      i2 = j;
      if (i1 >= j)
      {
        j = 1;
        localObject1 = this;
        i2 = j;
        localObject4 = selectNumberRule(j, i1);
      }
      else
      {
        localObject4 = FastDateFormat.TwoDigitYearField.INSTANCE;
        continue;
        j = 4;
        m = i1;
        i2 = j;
        if (i1 >= j)
        {
          localObject4 = new org/apache/commons/lang/time/FastDateFormat$TextField;
          j = 2;
          m = j;
          ((FastDateFormat.TextField)localObject4).<init>(j, arrayOfString2);
        }
        else
        {
          j = 3;
          i2 = j;
          if (i1 == j)
          {
            localObject4 = new org/apache/commons/lang/time/FastDateFormat$TextField;
            j = 2;
            m = j;
            ((FastDateFormat.TextField)localObject4).<init>(j, arrayOfString3);
          }
          else
          {
            j = 2;
            i2 = j;
            if (i1 == j)
            {
              localObject4 = FastDateFormat.TwoDigitMonthField.INSTANCE;
            }
            else
            {
              localObject4 = FastDateFormat.UnpaddedMonthField.INSTANCE;
              continue;
              j = 5;
              localObject1 = this;
              i2 = j;
              localObject4 = selectNumberRule(j, i1);
              continue;
              localObject4 = new org/apache/commons/lang/time/FastDateFormat$TwelveHourField;
              j = 10;
              localObject1 = this;
              i2 = j;
              localObject2 = selectNumberRule(j, i1);
              localObject1 = localObject2;
              ((FastDateFormat.TwelveHourField)localObject4).<init>((FastDateFormat.NumberRule)localObject2);
              continue;
              j = 11;
              localObject1 = this;
              i2 = j;
              localObject4 = selectNumberRule(j, i1);
              continue;
              j = 12;
              localObject1 = this;
              i2 = j;
              localObject4 = selectNumberRule(j, i1);
              continue;
              j = 13;
              localObject1 = this;
              i2 = j;
              localObject4 = selectNumberRule(j, i1);
              continue;
              j = 14;
              localObject1 = this;
              i2 = j;
              localObject4 = selectNumberRule(j, i1);
              continue;
              localObject4 = new org/apache/commons/lang/time/FastDateFormat$TextField;
              int i4 = 7;
              j = 4;
              m = i1;
              i2 = j;
              if (i1 < j) {}
              for (localObject2 = arrayOfString5;; localObject2 = arrayOfString4)
              {
                m = i4;
                ((FastDateFormat.TextField)localObject4).<init>(i4, (String[])localObject2);
                break;
              }
              j = 6;
              localObject1 = this;
              i2 = j;
              localObject4 = selectNumberRule(j, i1);
              continue;
              j = 8;
              localObject1 = this;
              i2 = j;
              localObject4 = selectNumberRule(j, i1);
              continue;
              j = 3;
              localObject1 = this;
              i2 = j;
              localObject4 = selectNumberRule(j, i1);
              continue;
              j = 4;
              localObject1 = this;
              i2 = j;
              localObject4 = selectNumberRule(j, i1);
              continue;
              localObject4 = new org/apache/commons/lang/time/FastDateFormat$TextField;
              j = 9;
              m = j;
              ((FastDateFormat.TextField)localObject4).<init>(j, arrayOfString6);
              continue;
              localObject4 = new org/apache/commons/lang/time/FastDateFormat$TwentyFourHourField;
              j = 11;
              localObject1 = this;
              i2 = j;
              localObject2 = selectNumberRule(j, i1);
              localObject1 = localObject2;
              ((FastDateFormat.TwentyFourHourField)localObject4).<init>((FastDateFormat.NumberRule)localObject2);
              continue;
              j = 10;
              localObject1 = this;
              i2 = j;
              localObject4 = selectNumberRule(j, i1);
              continue;
              j = 4;
              m = i1;
              i2 = j;
              Locale localLocale;
              int i5;
              if (i1 >= j)
              {
                localObject4 = new org/apache/commons/lang/time/FastDateFormat$TimeZoneNameRule;
                localObject1 = this;
                localObject2 = this.mTimeZone;
                localObject1 = this;
                m = this.mTimeZoneForced;
                i4 = m;
                localLocale = this.mLocale;
                i5 = 1;
                localObject1 = localObject2;
                i2 = m;
                ((FastDateFormat.TimeZoneNameRule)localObject4).<init>((TimeZone)localObject2, m, localLocale, i5);
              }
              else
              {
                localObject4 = new org/apache/commons/lang/time/FastDateFormat$TimeZoneNameRule;
                localObject1 = this;
                localObject2 = this.mTimeZone;
                localObject1 = this;
                m = this.mTimeZoneForced;
                i4 = m;
                localLocale = this.mLocale;
                i5 = 0;
                localObject1 = localObject2;
                i2 = m;
                ((FastDateFormat.TimeZoneNameRule)localObject4).<init>((TimeZone)localObject2, m, localLocale, 0);
                continue;
                j = 1;
                m = i1;
                i2 = j;
                if (i1 == j)
                {
                  localObject4 = FastDateFormat.TimeZoneNumberRule.INSTANCE_NO_COLON;
                }
                else
                {
                  localObject4 = FastDateFormat.TimeZoneNumberRule.INSTANCE_COLON;
                  continue;
                  i2 = 1;
                  String str2 = str1.substring(i2);
                  j = str2.length();
                  i4 = 1;
                  m = j;
                  i2 = i4;
                  if (j == i4)
                  {
                    localObject4 = new org/apache/commons/lang/time/FastDateFormat$CharacterLiteral;
                    localObject2 = null;
                    localObject1 = null;
                    j = str2.charAt(0);
                    m = j;
                    ((FastDateFormat.CharacterLiteral)localObject4).<init>(j);
                  }
                  else
                  {
                    localObject4 = new org/apache/commons/lang/time/FastDateFormat$StringLiteral;
                    ((FastDateFormat.StringLiteral)localObject4).<init>(str2);
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  protected String parseToken(String paramString, int[] paramArrayOfInt)
  {
    char c1 = 'a';
    char c2 = 'Z';
    char c3 = 'A';
    int i = 39;
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    int j = paramArrayOfInt[0];
    int k = paramString.length();
    char c4 = paramString.charAt(j);
    int m;
    if ((c4 < c3) || (c4 > c2))
    {
      if (c4 >= c1)
      {
        char c5 = 'z';
        if (c4 > c5) {}
      }
    }
    else
    {
      localStringBuffer.append(c4);
      for (;;)
      {
        m = j + 1;
        if (m >= k) {
          break;
        }
        m = j + 1;
        char c7 = paramString.charAt(m);
        if (c7 != c4) {
          break;
        }
        localStringBuffer.append(c4);
        j += 1;
      }
    }
    localStringBuffer.append(i);
    int n = 0;
    if (j < k)
    {
      c4 = paramString.charAt(j);
      if (c4 == i)
      {
        m = j + 1;
        if (m < k)
        {
          m = j + 1;
          m = paramString.charAt(m);
          if (m == i)
          {
            j += 1;
            localStringBuffer.append(c4);
          }
        }
      }
    }
    for (;;)
    {
      j += 1;
      break;
      if (n == 0) {}
      for (n = 1;; n = 0) {
        break;
      }
      if (n == 0) {
        if ((c4 < c3) || (c4 > c2))
        {
          if (c4 >= c1)
          {
            char c6 = 'z';
            if (c4 > c6) {}
          }
        }
        else
        {
          j += -1;
          paramArrayOfInt[0] = j;
          return localStringBuffer.toString();
        }
      }
      localStringBuffer.append(c4);
    }
  }
  
  protected FastDateFormat.NumberRule selectNumberRule(int paramInt1, int paramInt2)
  {
    Object localObject;
    switch (paramInt2)
    {
    default: 
      localObject = new org/apache/commons/lang/time/FastDateFormat$PaddedNumberField;
      ((FastDateFormat.PaddedNumberField)localObject).<init>(paramInt1, paramInt2);
    }
    for (;;)
    {
      return (FastDateFormat.NumberRule)localObject;
      localObject = new org/apache/commons/lang/time/FastDateFormat$UnpaddedNumberField;
      ((FastDateFormat.UnpaddedNumberField)localObject).<init>(paramInt1);
      continue;
      localObject = new org/apache/commons/lang/time/FastDateFormat$TwoDigitNumberField;
      ((FastDateFormat.TwoDigitNumberField)localObject).<init>(paramInt1);
    }
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    localStringBuffer = localStringBuffer.append("FastDateFormat[");
    String str = this.mPattern;
    return str + "]";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/time/FastDateFormat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */