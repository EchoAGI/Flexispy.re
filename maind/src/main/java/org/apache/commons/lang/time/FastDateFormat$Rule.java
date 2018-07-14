package org.apache.commons.lang.time;

import java.util.Calendar;

abstract interface FastDateFormat$Rule
{
  public abstract void appendTo(StringBuffer paramStringBuffer, Calendar paramCalendar);
  
  public abstract int estimateLength();
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/time/FastDateFormat$Rule.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */