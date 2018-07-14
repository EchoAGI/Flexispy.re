package org.apache.commons.lang.time;

import java.util.Calendar;

class FastDateFormat$CharacterLiteral
  implements FastDateFormat.Rule
{
  private final char mValue;
  
  FastDateFormat$CharacterLiteral(char paramChar)
  {
    this.mValue = paramChar;
  }
  
  public void appendTo(StringBuffer paramStringBuffer, Calendar paramCalendar)
  {
    char c = this.mValue;
    paramStringBuffer.append(c);
  }
  
  public int estimateLength()
  {
    return 1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/time/FastDateFormat$CharacterLiteral.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */