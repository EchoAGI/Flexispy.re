package org.apache.commons.lang.time;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

class FastDateFormat$TimeZoneNameRule
  implements FastDateFormat.Rule
{
  private final String mDaylight;
  private final Locale mLocale;
  private final String mStandard;
  private final int mStyle;
  private final TimeZone mTimeZone;
  private final boolean mTimeZoneForced;
  
  FastDateFormat$TimeZoneNameRule(TimeZone paramTimeZone, boolean paramBoolean, Locale paramLocale, int paramInt)
  {
    this.mTimeZone = paramTimeZone;
    this.mTimeZoneForced = paramBoolean;
    this.mLocale = paramLocale;
    this.mStyle = paramInt;
    if (paramBoolean)
    {
      str = FastDateFormat.getTimeZoneDisplay(paramTimeZone, false, paramInt, paramLocale);
      this.mStandard = str;
      bool = true;
      str = FastDateFormat.getTimeZoneDisplay(paramTimeZone, bool, paramInt, paramLocale);
    }
    for (this.mDaylight = str;; this.mDaylight = null)
    {
      return;
      this.mStandard = null;
    }
  }
  
  public void appendTo(StringBuffer paramStringBuffer, Calendar paramCalendar)
  {
    int i = 16;
    boolean bool1 = this.mTimeZoneForced;
    Object localObject;
    if (bool1)
    {
      localObject = this.mTimeZone;
      bool1 = ((TimeZone)localObject).useDaylightTime();
      if (bool1)
      {
        int j = paramCalendar.get(i);
        if (j != 0)
        {
          localObject = this.mDaylight;
          paramStringBuffer.append((String)localObject);
        }
      }
    }
    for (;;)
    {
      return;
      localObject = this.mStandard;
      paramStringBuffer.append((String)localObject);
      continue;
      TimeZone localTimeZone = paramCalendar.getTimeZone();
      boolean bool2 = localTimeZone.useDaylightTime();
      if (bool2)
      {
        int k = paramCalendar.get(i);
        if (k != 0)
        {
          k = 1;
          i = this.mStyle;
          localLocale = this.mLocale;
          localObject = FastDateFormat.getTimeZoneDisplay(localTimeZone, k, i, localLocale);
          paramStringBuffer.append((String)localObject);
          continue;
        }
      }
      int m = 0;
      i = this.mStyle;
      Locale localLocale = this.mLocale;
      localObject = FastDateFormat.getTimeZoneDisplay(localTimeZone, false, i, localLocale);
      paramStringBuffer.append((String)localObject);
    }
  }
  
  public int estimateLength()
  {
    boolean bool = this.mTimeZoneForced;
    int i;
    if (bool)
    {
      String str1 = this.mStandard;
      i = str1.length();
      String str2 = this.mDaylight;
      int j = str2.length();
      i = Math.max(i, j);
    }
    for (;;)
    {
      return i;
      i = this.mStyle;
      if (i == 0) {
        i = 4;
      } else {
        i = 40;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/time/FastDateFormat$TimeZoneNameRule.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */