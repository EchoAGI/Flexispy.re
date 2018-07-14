package org.apache.commons.lang.time;

import java.util.Calendar;

class FastDateFormat$UnpaddedNumberField
  implements FastDateFormat.NumberRule
{
  private final int mField;
  
  FastDateFormat$UnpaddedNumberField(int paramInt)
  {
    this.mField = paramInt;
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
      i = 100;
      if (paramInt < i)
      {
        i = (char)(paramInt / 10 + 48);
        paramStringBuffer.append(i);
        i = (char)(paramInt % 10 + 48);
        paramStringBuffer.append(i);
      }
      else
      {
        String str = Integer.toString(paramInt);
        paramStringBuffer.append(str);
      }
    }
  }
  
  public void appendTo(StringBuffer paramStringBuffer, Calendar paramCalendar)
  {
    int i = this.mField;
    i = paramCalendar.get(i);
    appendTo(paramStringBuffer, i);
  }
  
  public int estimateLength()
  {
    return 4;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/time/FastDateFormat$UnpaddedNumberField.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */