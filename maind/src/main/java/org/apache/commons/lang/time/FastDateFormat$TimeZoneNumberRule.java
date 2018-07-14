package org.apache.commons.lang.time;

import java.util.Calendar;

class FastDateFormat$TimeZoneNumberRule
  implements FastDateFormat.Rule
{
  static final TimeZoneNumberRule INSTANCE_COLON;
  static final TimeZoneNumberRule INSTANCE_NO_COLON;
  final boolean mColon;
  
  static
  {
    TimeZoneNumberRule localTimeZoneNumberRule = new org/apache/commons/lang/time/FastDateFormat$TimeZoneNumberRule;
    localTimeZoneNumberRule.<init>(true);
    INSTANCE_COLON = localTimeZoneNumberRule;
    localTimeZoneNumberRule = new org/apache/commons/lang/time/FastDateFormat$TimeZoneNumberRule;
    localTimeZoneNumberRule.<init>(false);
    INSTANCE_NO_COLON = localTimeZoneNumberRule;
  }
  
  FastDateFormat$TimeZoneNumberRule(boolean paramBoolean)
  {
    this.mColon = paramBoolean;
  }
  
  public void appendTo(StringBuffer paramStringBuffer, Calendar paramCalendar)
  {
    int i = paramCalendar.get(15);
    int k = paramCalendar.get(16);
    int n = i + k;
    if (n < 0)
    {
      i = 45;
      paramStringBuffer.append(i);
      n = -n;
    }
    for (;;)
    {
      int i1 = n / 3600000;
      char c1 = (char)(i1 / 10 + 48);
      paramStringBuffer.append(c1);
      c1 = (char)(i1 % 10 + 48);
      paramStringBuffer.append(c1);
      boolean bool = this.mColon;
      if (bool)
      {
        char c2 = ':';
        paramStringBuffer.append(c2);
      }
      int j = n / 60000;
      int m = i1 * 60;
      int i2 = j - m;
      j = (char)(i2 / 10 + 48);
      paramStringBuffer.append(j);
      char c3 = (char)(i2 % 10 + 48);
      paramStringBuffer.append(c3);
      return;
      c3 = '+';
      paramStringBuffer.append(c3);
    }
  }
  
  public int estimateLength()
  {
    return 5;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/time/FastDateFormat$TimeZoneNumberRule.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */