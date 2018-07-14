package org.apache.commons.lang.time;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateFormatUtils
{
  public static final FastDateFormat ISO_DATETIME_FORMAT = FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ss");
  public static final FastDateFormat ISO_DATETIME_TIME_ZONE_FORMAT = FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ssZZ");
  public static final FastDateFormat ISO_DATE_FORMAT = FastDateFormat.getInstance("yyyy-MM-dd");
  public static final FastDateFormat ISO_DATE_TIME_ZONE_FORMAT = FastDateFormat.getInstance("yyyy-MM-ddZZ");
  public static final FastDateFormat ISO_TIME_FORMAT = FastDateFormat.getInstance("'T'HH:mm:ss");
  public static final FastDateFormat ISO_TIME_NO_T_FORMAT;
  public static final FastDateFormat ISO_TIME_NO_T_TIME_ZONE_FORMAT;
  public static final FastDateFormat ISO_TIME_TIME_ZONE_FORMAT = FastDateFormat.getInstance("'T'HH:mm:ssZZ");
  public static final FastDateFormat SMTP_DATETIME_FORMAT;
  
  static
  {
    ISO_TIME_NO_T_FORMAT = FastDateFormat.getInstance("HH:mm:ss");
    ISO_TIME_NO_T_TIME_ZONE_FORMAT = FastDateFormat.getInstance("HH:mm:ssZZ");
    Locale localLocale = Locale.US;
    SMTP_DATETIME_FORMAT = FastDateFormat.getInstance("EEE, dd MMM yyyy HH:mm:ss Z", localLocale);
  }
  
  public static String format(long paramLong, String paramString)
  {
    Date localDate = new java/util/Date;
    localDate.<init>(paramLong);
    return format(localDate, paramString, null, null);
  }
  
  public static String format(long paramLong, String paramString, Locale paramLocale)
  {
    Date localDate = new java/util/Date;
    localDate.<init>(paramLong);
    return format(localDate, paramString, null, paramLocale);
  }
  
  public static String format(long paramLong, String paramString, TimeZone paramTimeZone)
  {
    Date localDate = new java/util/Date;
    localDate.<init>(paramLong);
    return format(localDate, paramString, paramTimeZone, null);
  }
  
  public static String format(long paramLong, String paramString, TimeZone paramTimeZone, Locale paramLocale)
  {
    Date localDate = new java/util/Date;
    localDate.<init>(paramLong);
    return format(localDate, paramString, paramTimeZone, paramLocale);
  }
  
  public static String format(Calendar paramCalendar, String paramString)
  {
    return format(paramCalendar, paramString, null, null);
  }
  
  public static String format(Calendar paramCalendar, String paramString, Locale paramLocale)
  {
    return format(paramCalendar, paramString, null, paramLocale);
  }
  
  public static String format(Calendar paramCalendar, String paramString, TimeZone paramTimeZone)
  {
    return format(paramCalendar, paramString, paramTimeZone, null);
  }
  
  public static String format(Calendar paramCalendar, String paramString, TimeZone paramTimeZone, Locale paramLocale)
  {
    return FastDateFormat.getInstance(paramString, paramTimeZone, paramLocale).format(paramCalendar);
  }
  
  public static String format(Date paramDate, String paramString)
  {
    return format(paramDate, paramString, null, null);
  }
  
  public static String format(Date paramDate, String paramString, Locale paramLocale)
  {
    return format(paramDate, paramString, null, paramLocale);
  }
  
  public static String format(Date paramDate, String paramString, TimeZone paramTimeZone)
  {
    return format(paramDate, paramString, paramTimeZone, null);
  }
  
  public static String format(Date paramDate, String paramString, TimeZone paramTimeZone, Locale paramLocale)
  {
    return FastDateFormat.getInstance(paramString, paramTimeZone, paramLocale).format(paramDate);
  }
  
  public static String formatUTC(long paramLong, String paramString)
  {
    Date localDate = new java/util/Date;
    localDate.<init>(paramLong);
    TimeZone localTimeZone = DateUtils.UTC_TIME_ZONE;
    return format(localDate, paramString, localTimeZone, null);
  }
  
  public static String formatUTC(long paramLong, String paramString, Locale paramLocale)
  {
    Date localDate = new java/util/Date;
    localDate.<init>(paramLong);
    TimeZone localTimeZone = DateUtils.UTC_TIME_ZONE;
    return format(localDate, paramString, localTimeZone, paramLocale);
  }
  
  public static String formatUTC(Date paramDate, String paramString)
  {
    TimeZone localTimeZone = DateUtils.UTC_TIME_ZONE;
    return format(paramDate, paramString, localTimeZone, null);
  }
  
  public static String formatUTC(Date paramDate, String paramString, Locale paramLocale)
  {
    TimeZone localTimeZone = DateUtils.UTC_TIME_ZONE;
    return format(paramDate, paramString, localTimeZone, paramLocale);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/time/DateFormatUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */