package com.vvt.capture.calendar.ical;

import java.util.Vector;

public class b
  extends c
{
  public int a = 0;
  public int b = 0;
  public int c = 0;
  public int d = 0;
  public int e = 0;
  public int f = 0;
  public boolean g = false;
  public boolean h = false;
  
  public b(String paramString)
  {
    this(paramString, 2);
  }
  
  public b(String paramString, int paramInt)
  {
    super(paramString, paramInt);
    int i1 = 0;
    Object localObject2 = null;
    Object localObject4 = this.k;
    int i2 = ((Vector)localObject4).size();
    label170:
    label196:
    Object localObject5;
    if (i1 < i2)
    {
      localObject4 = a(i1);
      String str1 = ((a)localObject4).a.toUpperCase();
      String str2 = ((a)localObject4).b.toUpperCase();
      String str3 = "VALUE";
      boolean bool = str1.equals(str3);
      if (bool)
      {
        str1 = "DATE";
        bool = str2.equals(str1);
        if (!bool) {
          break label170;
        }
        this.h = m;
      }
      do
      {
        for (;;)
        {
          i1 += 1;
          break;
          str1 = "DATE-TIME";
          bool = str2.equals(str1);
          if (!bool) {
            break label196;
          }
          this.h = false;
        }
      } while (paramInt != m);
      localObject2 = new com/vvt/capture/calendar/ical/ParseException;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("Unknown date VALUE '");
      localObject5 = ((a)localObject4).b;
      localObject1 = (String)localObject5 + "'";
      ((ParseException)localObject2).<init>((String)localObject1, paramString);
      throw ((Throwable)localObject2);
    }
    localObject4 = this.j;
    i1 = ((String)localObject4).length();
    if (i1 < k)
    {
      localObject2 = new com/vvt/capture/calendar/ical/ParseException;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Invalid date format '" + (String)localObject4 + "'";
      ((ParseException)localObject2).<init>((String)localObject1, (String)localObject4);
      throw ((Throwable)localObject2);
    }
    i1 = Integer.parseInt(((String)localObject4).substring(0, i));
    this.a = i1;
    i1 = Integer.parseInt(((String)localObject4).substring(i, 6));
    this.b = i1;
    localObject2 = ((String)localObject4).substring(6, k);
    i1 = Integer.parseInt((String)localObject2);
    this.c = i1;
    i1 = this.c;
    int i3;
    if (i1 >= m)
    {
      i1 = this.c;
      i3 = 31;
      if (i1 <= i3)
      {
        i1 = this.b;
        if (i1 >= m)
        {
          i1 = this.b;
          i3 = 12;
          if (i1 <= i3) {
            break label500;
          }
        }
      }
    }
    localObject2 = new com/vvt/capture/calendar/ical/BogusDataException;
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = "Invalid date '" + (String)localObject4 + "'";
    ((BogusDataException)localObject2).<init>((String)localObject1, (String)localObject4);
    throw ((Throwable)localObject2);
    label500:
    i1 = ((String)localObject4).length();
    if (i1 > k)
    {
      i1 = ((String)localObject4).charAt(k);
      i3 = 84;
      if (i1 != i3) {
        break label855;
      }
      i1 = 9;
      i3 = 11;
      try
      {
        localObject2 = ((String)localObject4).substring(i1, i3);
        i1 = Integer.parseInt((String)localObject2);
        this.d = i1;
        i1 = 11;
        i3 = 13;
        localObject2 = ((String)localObject4).substring(i1, i3);
        i1 = Integer.parseInt((String)localObject2);
        this.e = i1;
        i1 = 13;
        i3 = 15;
        localObject2 = ((String)localObject4).substring(i1, i3);
        i1 = Integer.parseInt((String)localObject2);
        this.f = i1;
        i1 = this.d;
        i3 = 23;
        if (i1 <= i3)
        {
          i1 = this.e;
          i3 = 59;
          if (i1 <= i3)
          {
            i1 = this.f;
            i3 = 59;
            if (i1 <= i3) {
              break label806;
            }
          }
        }
        localObject2 = new com/vvt/capture/calendar/ical/BogusDataException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject5 = "Invalid time in date string '";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject5);
        localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
        localObject5 = "'";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject5);
        localObject1 = ((StringBuilder)localObject1).toString();
        ((BogusDataException)localObject2).<init>((String)localObject1, (String)localObject4);
        throw ((Throwable)localObject2);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        localObject1 = new com/vvt/capture/calendar/ical/BogusDataException;
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject3 = "Invalid time in date string '" + (String)localObject4 + "' - " + localNumberFormatException;
        ((BogusDataException)localObject1).<init>((String)localObject3, (String)localObject4);
        throw ((Throwable)localObject1);
      }
      label806:
      i1 = ((String)localObject4).length();
      if (i1 >= j)
      {
        i1 = 15;
        i1 = ((String)localObject4).charAt(i1);
        i3 = 90;
        if (i1 == i3) {
          n = m;
        }
        this.g = n;
      }
    }
    return;
    label855:
    Object localObject3 = new com/vvt/capture/calendar/ical/ParseException;
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = "Invalid date format '" + (String)localObject4 + "'";
    ((ParseException)localObject3).<init>((String)localObject1, (String)localObject4);
    throw ((Throwable)localObject3);
  }
  
  public boolean a()
  {
    boolean bool = this.h;
    if (!bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/calendar/ical/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */