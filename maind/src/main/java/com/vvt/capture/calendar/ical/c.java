package com.vvt.capture.calendar.ical;

import java.util.Vector;

public class c
{
  public String i;
  public String j;
  protected Vector k;
  
  public c(String paramString, int paramInt)
  {
    Object localObject = new java/util/Vector;
    ((Vector)localObject).<init>();
    this.k = ((Vector)localObject);
    localObject = f.a(paramString, paramInt);
    int i1 = ((String)localObject).indexOf(':');
    if (i1 < 0)
    {
      localObject = new com/vvt/capture/calendar/ical/ParseException;
      ((ParseException)localObject).<init>("Could not find ':'", paramString);
      throw ((Throwable)localObject);
    }
    String str1 = ((String)localObject).substring(0, i1);
    i1 += 1;
    int i2 = ((String)localObject).length();
    localObject = ((String)localObject).substring(i1, i2);
    this.j = ((String)localObject);
    int i3 = str1.indexOf(m);
    if (i3 < 0)
    {
      localObject = str1.toUpperCase();
      this.i = ((String)localObject);
    }
    for (;;)
    {
      return;
      String str2 = str1.substring(0, i3).toUpperCase();
      this.i = str2;
      StringBuffer localStringBuffer1 = new java/lang/StringBuffer;
      localStringBuffer1.<init>();
      StringBuffer localStringBuffer2 = new java/lang/StringBuffer;
      localStringBuffer2.<init>();
      i1 = n;
      i2 = 0;
      int i4 = str1.length();
      if (i3 < i4)
      {
        i4 = str1.charAt(i3);
        if ((i4 == m) && (i2 == 0))
        {
          i4 = localStringBuffer1.length();
          if (i4 > 0)
          {
            str2 = localStringBuffer1.toString();
            String str3 = localStringBuffer2.toString();
            a(str2, str3);
            localStringBuffer1.setLength(0);
            localStringBuffer2.setLength(0);
            i1 = n;
          }
        }
        for (;;)
        {
          i3 += 1;
          break;
          int i5 = 61;
          if ((i4 == i5) && (i2 == 0))
          {
            i1 = 0;
            str2 = null;
          }
          else
          {
            int i6 = 44;
            if ((i4 == i6) && (i2 == 0) && (paramInt == n))
            {
              localObject = new com/vvt/capture/calendar/ical/ParseException;
              ((ParseException)localObject).<init>("Found unquoted comma in attribute value", paramString);
              throw ((Throwable)localObject);
            }
            int i7 = 34;
            if (i4 == i7)
            {
              if (i2 == 0) {
                i2 = n;
              } else {
                i2 = 0;
              }
            }
            else if (i1 != 0) {
              localStringBuffer1.append(i4);
            } else {
              localStringBuffer2.append(i4);
            }
          }
        }
      }
      i3 = localStringBuffer1.length();
      if (i3 > 0)
      {
        localObject = localStringBuffer1.toString();
        str2 = localStringBuffer2.toString();
        a((String)localObject, str2);
      }
    }
  }
  
  public a a(int paramInt)
  {
    return (a)this.k.elementAt(paramInt);
  }
  
  public void a(String paramString1, String paramString2)
  {
    Vector localVector = this.k;
    a locala = new com/vvt/capture/calendar/ical/a;
    locala.<init>(paramString1, paramString2);
    localVector.addElement(locala);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/calendar/ical/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */