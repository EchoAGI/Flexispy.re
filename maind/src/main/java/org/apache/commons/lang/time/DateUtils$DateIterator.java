package org.apache.commons.lang.time;

import java.util.Calendar;
import java.util.Iterator;
import java.util.NoSuchElementException;

class DateUtils$DateIterator
  implements Iterator
{
  private final Calendar endFinal;
  private final Calendar spot;
  
  DateUtils$DateIterator(Calendar paramCalendar1, Calendar paramCalendar2)
  {
    this.endFinal = paramCalendar2;
    this.spot = paramCalendar1;
    this.spot.add(5, -1);
  }
  
  public boolean hasNext()
  {
    Calendar localCalendar1 = this.spot;
    Calendar localCalendar2 = this.endFinal;
    return localCalendar1.before(localCalendar2);
  }
  
  public Object next()
  {
    Object localObject = this.spot;
    Calendar localCalendar = this.endFinal;
    boolean bool = ((Calendar)localObject).equals(localCalendar);
    if (bool)
    {
      localObject = new java/util/NoSuchElementException;
      ((NoSuchElementException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    this.spot.add(5, 1);
    return this.spot.clone();
  }
  
  public void remove()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/time/DateUtils$DateIterator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */