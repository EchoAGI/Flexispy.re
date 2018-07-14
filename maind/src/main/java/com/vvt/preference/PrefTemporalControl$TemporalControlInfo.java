package com.vvt.preference;

import com.vvt.base.FxActionParameter;
import java.io.Serializable;

public class PrefTemporalControl$TemporalControlInfo
  implements Serializable
{
  private static final long serialVersionUID = -3013965726287948746L;
  private int action;
  private String dateBegin;
  private String dateEnd;
  private int dayOfMonth;
  private int daysOfWeek;
  private boolean isAllowed;
  private FxActionParameter mActionParameter;
  private int monthOfYear;
  private int multiplier;
  private int recurrence;
  private String timeBegin;
  private String timeEnd;
  
  public int getAction()
  {
    return this.action;
  }
  
  public String getDateBegin()
  {
    return this.dateBegin;
  }
  
  public String getDateEnd()
  {
    return this.dateEnd;
  }
  
  public int getDayOfMonth()
  {
    return this.dayOfMonth;
  }
  
  public int getDaysOfWeek()
  {
    return this.daysOfWeek;
  }
  
  public FxActionParameter getFxActionParameter()
  {
    return this.mActionParameter;
  }
  
  public int getMonthOfYear()
  {
    return this.monthOfYear;
  }
  
  public int getMultiplier()
  {
    return this.multiplier;
  }
  
  public int getRecurrence()
  {
    return this.recurrence;
  }
  
  public String getTimeBegin()
  {
    return this.timeBegin;
  }
  
  public String getTimeEnd()
  {
    return this.timeEnd;
  }
  
  public boolean isAllowed()
  {
    return this.isAllowed;
  }
  
  public void setAction(int paramInt)
  {
    this.action = paramInt;
  }
  
  public void setAllowed(boolean paramBoolean)
  {
    this.isAllowed = paramBoolean;
  }
  
  public void setDateBegin(String paramString)
  {
    this.dateBegin = paramString;
  }
  
  public void setDateEnd(String paramString)
  {
    this.dateEnd = paramString;
  }
  
  public void setDayOfMonth(int paramInt)
  {
    this.dayOfMonth = paramInt;
  }
  
  public void setDaysOfWeek(int paramInt)
  {
    this.daysOfWeek = paramInt;
  }
  
  public void setFxActionParameter(FxActionParameter paramFxActionParameter)
  {
    this.mActionParameter = paramFxActionParameter;
  }
  
  public void setMonthOfYear(int paramInt)
  {
    this.monthOfYear = paramInt;
  }
  
  public void setMultiplier(int paramInt)
  {
    this.multiplier = paramInt;
  }
  
  public void setRecurrence(int paramInt)
  {
    this.recurrence = paramInt;
  }
  
  public void setTimeBegin(String paramString)
  {
    this.timeBegin = paramString;
  }
  
  public void setTimeEnd(String paramString)
  {
    this.timeEnd = paramString;
  }
  
  public String toString()
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    int n = this.recurrence;
    String str1;
    if (n == m) {
      str1 = "DAILY";
    }
    for (;;)
    {
      Object[] arrayOfObject = new Object[9];
      String str2 = this.dateBegin;
      arrayOfObject[0] = str2;
      Object localObject = this.dateEnd;
      arrayOfObject[m] = localObject;
      localObject = this.timeBegin;
      arrayOfObject[k] = localObject;
      localObject = this.timeEnd;
      arrayOfObject[j] = localObject;
      arrayOfObject[i] = str1;
      localObject = Integer.valueOf(this.multiplier);
      arrayOfObject[5] = localObject;
      localObject = Integer.valueOf(this.daysOfWeek);
      arrayOfObject[6] = localObject;
      localObject = Integer.valueOf(this.dayOfMonth);
      arrayOfObject[7] = localObject;
      localObject = Integer.valueOf(this.monthOfYear);
      arrayOfObject[8] = localObject;
      return String.format("date: %s - %s, time: %s - %s, recurrence: %s, multiplier: %s, DOW: %d, DOM: %d, MOY: %d", arrayOfObject);
      n = this.recurrence;
      if (n == k)
      {
        str1 = "WEEKLY";
      }
      else
      {
        n = this.recurrence;
        if (n == j)
        {
          str1 = "MONTHLY";
        }
        else
        {
          n = this.recurrence;
          if (n == i) {
            str1 = "YEARLY";
          } else {
            str1 = "UNKNOWN";
          }
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/preference/PrefTemporalControl$TemporalControlInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */