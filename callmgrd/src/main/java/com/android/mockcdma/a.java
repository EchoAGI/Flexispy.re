package com.android.mockcdma;

import android.text.format.Time;

public class a
  extends Time
{
  public a()
  {
    super("UTC");
  }
  
  public static a a(byte[] paramArrayOfByte)
  {
    int i = 59;
    int j = 1;
    a locala1 = new com/android/mockcdma/a;
    locala1.<init>();
    a locala2 = null;
    int k = e.a(paramArrayOfByte[0]);
    int m = 99;
    if ((k > m) || (k < 0))
    {
      k = 0;
      locala2 = null;
    }
    for (;;)
    {
      return locala2;
      m = 96;
      if (k >= m) {
        k += 1900;
      }
      for (;;)
      {
        locala1.year = k;
        k = e.a(paramArrayOfByte[j]);
        if (k >= j)
        {
          m = 12;
          if (k <= m) {
            break label119;
          }
        }
        k = 0;
        locala2 = null;
        break;
        k += 2000;
      }
      label119:
      k += -1;
      locala1.month = k;
      k = e.a(paramArrayOfByte[2]);
      if (k >= j)
      {
        m = 31;
        if (k <= m) {}
      }
      else
      {
        k = 0;
        locala2 = null;
        continue;
      }
      locala1.monthDay = k;
      k = e.a(paramArrayOfByte[3]);
      if (k >= 0)
      {
        m = 23;
        if (k <= m) {}
      }
      else
      {
        k = 0;
        locala2 = null;
        continue;
      }
      locala1.hour = k;
      k = e.a(paramArrayOfByte[4]);
      if ((k < 0) || (k > i))
      {
        k = 0;
        locala2 = null;
      }
      else
      {
        locala1.minute = k;
        k = e.a(paramArrayOfByte[5]);
        if ((k < 0) || (k > i))
        {
          k = 0;
          locala2 = null;
        }
        else
        {
          locala1.second = k;
          locala2 = locala1;
        }
      }
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("TimeStamp ");
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("{ year=");
    int i = this.year;
    localObject = i;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", month=");
    i = this.month;
    localObject = i;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", day=");
    i = this.monthDay;
    localObject = i;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", hour=");
    i = this.hour;
    localObject = i;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", minute=");
    i = this.minute;
    localObject = i;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", second=");
    i = this.second;
    localObject = i;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/android/mockcdma/getInstance.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */