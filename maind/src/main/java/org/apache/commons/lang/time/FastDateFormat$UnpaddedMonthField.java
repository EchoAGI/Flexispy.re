package org.apache.commons.lang.time;

import java.util.Calendar;

class FastDateFormat$UnpaddedMonthField
  implements FastDateFormat.NumberRule
{
  static final UnpaddedMonthField INSTANCE;
  
  static
  {
    UnpaddedMonthField localUnpaddedMonthField = new org/apache/commons/lang/time/FastDateFormat$UnpaddedMonthField;
    localUnpaddedMonthField.<init>();
    INSTANCE = localUnpaddedMonthField;
  }
  
  public final void appendTo(StringBuffer paramStringBuffer, int paramInt)
  {
    int i = 10;
    if (paramInt < i)
    {
      i = (char)(paramInt + 48);
      paramStringBuffer.append(i);
    }
    for (;;)
    {
      return;
      i = (char)(paramInt / 10 + 48);
      paramStringBuffer.append(i);
      i = (char)(paramInt % 10 + 48);
      paramStringBuffer.append(i);
    }
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/time/FastDateFormat$UnpaddedMonthField.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */