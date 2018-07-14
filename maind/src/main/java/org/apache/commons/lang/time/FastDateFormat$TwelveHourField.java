package org.apache.commons.lang.time;

import java.util.Calendar;

class FastDateFormat$TwelveHourField
  implements FastDateFormat.NumberRule
{
  private final FastDateFormat.NumberRule mRule;
  
  FastDateFormat$TwelveHourField(FastDateFormat.NumberRule paramNumberRule)
  {
    this.mRule = paramNumberRule;
  }
  
  public void appendTo(StringBuffer paramStringBuffer, int paramInt)
  {
    this.mRule.appendTo(paramStringBuffer, paramInt);
  }
  
  public void appendTo(StringBuffer paramStringBuffer, Calendar paramCalendar)
  {
    int i = 10;
    int j = paramCalendar.get(i);
    if (j == 0)
    {
      i = paramCalendar.getLeastMaximum(i);
      j = i + 1;
    }
    this.mRule.appendTo(paramStringBuffer, j);
  }
  
  public int estimateLength()
  {
    return this.mRule.estimateLength();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/time/FastDateFormat$TwelveHourField.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */