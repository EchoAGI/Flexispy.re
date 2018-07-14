package org.apache.commons.lang.time;

import java.util.Calendar;

class FastDateFormat$TextField
  implements FastDateFormat.Rule
{
  private final int mField;
  private final String[] mValues;
  
  FastDateFormat$TextField(int paramInt, String[] paramArrayOfString)
  {
    this.mField = paramInt;
    this.mValues = paramArrayOfString;
  }
  
  public void appendTo(StringBuffer paramStringBuffer, Calendar paramCalendar)
  {
    Object localObject = this.mValues;
    int i = this.mField;
    i = paramCalendar.get(i);
    localObject = localObject[i];
    paramStringBuffer.append((String)localObject);
  }
  
  public int estimateLength()
  {
    int i = 0;
    Object localObject = this.mValues;
    int j = localObject.length;
    for (;;)
    {
      j += -1;
      if (j < 0) {
        break;
      }
      localObject = this.mValues[j];
      int k = ((String)localObject).length();
      if (k > i) {
        i = k;
      }
    }
    return i;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/time/FastDateFormat$TextField.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */