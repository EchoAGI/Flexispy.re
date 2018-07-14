package org.apache.commons.lang.time;

import java.util.Calendar;
import org.apache.commons.lang.Validate;

class FastDateFormat$PaddedNumberField
  implements FastDateFormat.NumberRule
{
  private final int mField;
  private final int mSize;
  
  FastDateFormat$PaddedNumberField(int paramInt1, int paramInt2)
  {
    int i = 3;
    if (paramInt2 < i)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>();
      throw localIllegalArgumentException;
    }
    this.mField = paramInt1;
    this.mSize = paramInt2;
  }
  
  public final void appendTo(StringBuffer paramStringBuffer, int paramInt)
  {
    char c = '0';
    int i = 100;
    int j;
    if (paramInt < i)
    {
      j = this.mSize;
      for (;;)
      {
        j += -1;
        i = 2;
        if (j < i) {
          break;
        }
        paramStringBuffer.append(c);
      }
      i = (char)(paramInt / 10 + 48);
      paramStringBuffer.append(i);
      i = (char)(paramInt % 10 + 48);
      paramStringBuffer.append(i);
    }
    for (;;)
    {
      return;
      i = 1000;
      int k;
      if (paramInt < i)
      {
        k = 3;
        j = this.mSize;
        for (;;)
        {
          j += -1;
          if (j < k) {
            break;
          }
          paramStringBuffer.append(c);
        }
      }
      i = -1;
      if (paramInt > i) {
        i = 1;
      }
      for (;;)
      {
        String str1 = "Negative values should not be possible";
        long l = paramInt;
        Validate.isTrue(i, str1, l);
        str2 = Integer.toString(paramInt);
        k = str2.length();
        break;
        i = 0;
        str2 = null;
      }
      String str2 = Integer.toString(paramInt);
      paramStringBuffer.append(str2);
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/time/FastDateFormat$PaddedNumberField.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */