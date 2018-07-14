package org.apache.commons.lang.time;

import java.util.Calendar;

class FastDateFormat$TwoDigitMonthField
  implements FastDateFormat.NumberRule
{
  static final TwoDigitMonthField INSTANCE;
  
  static
  {
    TwoDigitMonthField localTwoDigitMonthField = new org/apache/commons/lang/time/FastDateFormat$TwoDigitMonthField;
    localTwoDigitMonthField.<init>();
    INSTANCE = localTwoDigitMonthField;
  }
  
  public final void appendTo(StringBuffer paramStringBuffer, int paramInt)
  {
    char c = (char)(paramInt / 10 + 48);
    paramStringBuffer.append(c);
    c = (char)(paramInt % 10 + 48);
    paramStringBuffer.append(c);
  }
  
  public void appendTo(StringBuffer paramStringBuffer, Calendar paramCalendar)
  {
    int i = paramCalendar.get(2) + 1;
    appendTo(paramStringBuffer, i);
  }
  
  public int estimateLength()
  {
    return 2;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/time/FastDateFormat$TwoDigitMonthField.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */