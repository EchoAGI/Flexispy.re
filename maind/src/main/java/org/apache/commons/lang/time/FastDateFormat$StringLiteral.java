package org.apache.commons.lang.time;

import java.util.Calendar;

class FastDateFormat$StringLiteral
  implements FastDateFormat.Rule
{
  private final String mValue;
  
  FastDateFormat$StringLiteral(String paramString)
  {
    this.mValue = paramString;
  }
  
  public void appendTo(StringBuffer paramStringBuffer, Calendar paramCalendar)
  {
    String str = this.mValue;
    paramStringBuffer.append(str);
  }
  
  public int estimateLength()
  {
    return this.mValue.length();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/time/FastDateFormat$StringLiteral.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */