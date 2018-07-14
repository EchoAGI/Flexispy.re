package com.vvt.capture.calendar.ical;

import java.util.Vector;

public class d
  extends c
{
  public int a = 0;
  public int b;
  public b c;
  public int d;
  public int[] e = null;
  public int[] f = null;
  public int[] g = null;
  public e[] h = null;
  public int[] l = null;
  public int[] m = null;
  public int[] n = null;
  public int o;
  
  public d(String paramString, int paramInt)
  {
    super(paramString, paramInt);
    this.b = k;
    this.c = null;
    this.d = -1;
    this.o = k;
    int i1 = 0;
    Object localObject2 = null;
    for (;;)
    {
      localObject4 = this.k;
      i2 = ((Vector)localObject4).size();
      if (i1 >= i2) {
        break;
      }
      localObject4 = a(i1);
      if (paramInt == k)
      {
        localObject2 = new com/vvt/capture/calendar/ical/ParseException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append("No attribute '");
        localObject4 = ((a)localObject4).a;
        localObject1 = (String)localObject4 + "' allowed in RRULE";
        ((ParseException)localObject2).<init>((String)localObject1, paramString);
        throw ((Throwable)localObject2);
      }
      i1 += 1;
    }
    localObject2 = this.j;
    Object localObject4 = ";";
    String[] arrayOfString = ((String)localObject2).split((String)localObject4);
    i1 = 0;
    localObject2 = null;
    int i2 = arrayOfString.length;
    Object localObject3;
    if (i1 < i2)
    {
      localObject4 = arrayOfString[i1];
      Object localObject5 = "=";
      localObject4 = ((String)localObject4).split((String)localObject5, j);
      int i4 = localObject4.length;
      if (i4 != j)
      {
        localObject1 = new com/vvt/capture/calendar/ical/ParseException;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject4 = ((StringBuilder)localObject4).append("Invalid RRULE '");
        localObject2 = arrayOfString[i1];
        localObject2 = (String)localObject2 + "'";
        ((ParseException)localObject1).<init>((String)localObject2, paramString);
        throw ((Throwable)localObject1);
      }
      localObject5 = localObject4[0].toUpperCase();
      localObject4 = localObject4[k].toUpperCase();
      Object localObject6 = "FREQ";
      boolean bool4 = ((String)localObject5).equals(localObject6);
      boolean bool2;
      if (bool4)
      {
        i4 = this.a;
        if (i4 != 0)
        {
          localObject2 = new com/vvt/capture/calendar/ical/BogusDataException;
          ((BogusDataException)localObject2).<init>("More than one RRULE FREQ is not allowed", paramString);
          throw ((Throwable)localObject2);
        }
        localObject5 = "YEARLY";
        bool2 = ((String)localObject4).equals(localObject5);
        if (bool2)
        {
          i2 = 4;
          this.a = i2;
        }
      }
      label1215:
      label1384:
      do
      {
        Object localObject7;
        int i3;
        do
        {
          do
          {
            do
            {
              for (;;)
              {
                i1 += 1;
                break;
                localObject5 = "MONTHLY";
                bool2 = ((String)localObject4).equals(localObject5);
                if (bool2)
                {
                  this.a = i;
                }
                else
                {
                  localObject5 = "DAILY";
                  bool2 = ((String)localObject4).equals(localObject5);
                  if (bool2)
                  {
                    this.a = k;
                  }
                  else
                  {
                    localObject5 = "WEEKLY";
                    bool2 = ((String)localObject4).equals(localObject5);
                    if (bool2)
                    {
                      this.a = j;
                    }
                    else
                    {
                      localObject5 = "HOURLY";
                      bool2 = ((String)localObject4).equals(localObject5);
                      if (bool2)
                      {
                        i2 = 5;
                        this.a = i2;
                      }
                      else
                      {
                        localObject5 = "MINUTELY";
                        bool2 = ((String)localObject4).equals(localObject5);
                        if (bool2)
                        {
                          i2 = 6;
                          this.a = i2;
                        }
                        else
                        {
                          localObject5 = "SECONDLY";
                          bool2 = ((String)localObject4).equals(localObject5);
                          if (bool2)
                          {
                            i2 = 7;
                            this.a = i2;
                          }
                          else
                          {
                            localObject2 = new com/vvt/capture/calendar/ical/BogusDataException;
                            localObject1 = new java/lang/StringBuilder;
                            ((StringBuilder)localObject1).<init>();
                            localObject1 = "Invalid RRULE FREQ '" + (String)localObject4 + "'";
                            ((BogusDataException)localObject2).<init>((String)localObject1, paramString);
                            throw ((Throwable)localObject2);
                            localObject6 = "INTERVAL";
                            bool4 = ((String)localObject5).equals(localObject6);
                            int i5;
                            if (bool4)
                            {
                              try
                              {
                                i5 = Integer.parseInt((String)localObject4);
                                this.b = i5;
                              }
                              catch (NumberFormatException localNumberFormatException1)
                              {
                                BogusDataException localBogusDataException1 = new com/vvt/capture/calendar/ical/BogusDataException;
                                localObject1 = new java/lang/StringBuilder;
                                ((StringBuilder)localObject1).<init>();
                                localObject1 = "Invalid RRULE INTERVAL '" + (String)localObject4 + "'";
                                localBogusDataException1.<init>((String)localObject1, paramString);
                                throw localBogusDataException1;
                              }
                            }
                            else
                            {
                              localObject6 = "UNTIL";
                              bool4 = ((String)localObject5).equals(localObject6);
                              if (bool4)
                              {
                                try
                                {
                                  localObject5 = new com/vvt/capture/calendar/ical/b;
                                  localObject6 = new java/lang/StringBuilder;
                                  ((StringBuilder)localObject6).<init>();
                                  localObject7 = "XXX:";
                                  localObject6 = ((StringBuilder)localObject6).append((String)localObject7);
                                  localObject4 = ((StringBuilder)localObject6).append((String)localObject4);
                                  localObject4 = ((StringBuilder)localObject4).toString();
                                  ((b)localObject5).<init>((String)localObject4);
                                  this.c = ((b)localObject5);
                                }
                                catch (BogusDataException localBogusDataException2)
                                {
                                  localObject1 = new com/vvt/capture/calendar/ical/BogusDataException;
                                  localObject4 = new java/lang/StringBuilder;
                                  ((StringBuilder)localObject4).<init>();
                                  localObject4 = ((StringBuilder)localObject4).append("Invalid RRULE UNTIL date: ");
                                  String str1 = localBogusDataException2.error;
                                  str1 = str1;
                                  ((BogusDataException)localObject1).<init>(str1, paramString);
                                  throw ((Throwable)localObject1);
                                }
                                catch (ParseException localParseException)
                                {
                                  localObject1 = new com/vvt/capture/calendar/ical/BogusDataException;
                                  localObject4 = new java/lang/StringBuilder;
                                  ((StringBuilder)localObject4).<init>();
                                  localObject4 = ((StringBuilder)localObject4).append("Invalid RRULE UNTIL date: ");
                                  String str2 = localParseException.error;
                                  str2 = str2;
                                  ((BogusDataException)localObject1).<init>(str2, paramString);
                                  throw ((Throwable)localObject1);
                                }
                              }
                              else
                              {
                                localObject6 = "COUNT";
                                bool4 = ((String)localObject5).equals(localObject6);
                                if (bool4)
                                {
                                  try
                                  {
                                    i5 = Integer.parseInt((String)localObject4);
                                    this.d = i5;
                                  }
                                  catch (NumberFormatException localNumberFormatException2)
                                  {
                                    localObject3 = new com/vvt/capture/calendar/ical/BogusDataException;
                                    localObject1 = new java/lang/StringBuilder;
                                    ((StringBuilder)localObject1).<init>();
                                    localObject1 = "Invalid RRULE COUNT '" + (String)localObject4 + "'";
                                    ((BogusDataException)localObject3).<init>((String)localObject1, paramString);
                                    throw ((Throwable)localObject3);
                                  }
                                }
                                else
                                {
                                  localObject6 = "WKST";
                                  bool4 = ((String)localObject5).equals(localObject6);
                                  if (!bool4) {
                                    break label1215;
                                  }
                                  localObject5 = "SU";
                                  boolean bool3 = ((String)localObject4).equals(localObject5);
                                  if (bool3)
                                  {
                                    this.o = k;
                                  }
                                  else
                                  {
                                    localObject5 = "MO";
                                    bool3 = ((String)localObject4).equals(localObject5);
                                    if (bool3)
                                    {
                                      this.o = j;
                                    }
                                    else
                                    {
                                      localObject5 = "TU";
                                      bool3 = ((String)localObject4).equals(localObject5);
                                      if (bool3)
                                      {
                                        this.o = i;
                                      }
                                      else
                                      {
                                        localObject5 = "WE";
                                        bool3 = ((String)localObject4).equals(localObject5);
                                        if (bool3)
                                        {
                                          i2 = 4;
                                          this.o = i2;
                                        }
                                        else
                                        {
                                          localObject5 = "TH";
                                          bool3 = ((String)localObject4).equals(localObject5);
                                          if (bool3)
                                          {
                                            i2 = 5;
                                            this.o = i2;
                                          }
                                          else
                                          {
                                            localObject5 = "FR";
                                            bool3 = ((String)localObject4).equals(localObject5);
                                            if (bool3)
                                            {
                                              i2 = 6;
                                              this.o = i2;
                                            }
                                            else
                                            {
                                              localObject5 = "SA";
                                              boolean bool1 = ((String)localObject4).equals(localObject5);
                                              if (bool1)
                                              {
                                                i3 = 7;
                                                this.o = i3;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              localObject6 = "BYYEARNO";
              bool4 = ((String)localObject5).equals(localObject6);
            } while (bool4);
            localObject6 = "BYWEEKNO";
            bool4 = ((String)localObject5).equals(localObject6);
          } while (bool4);
          localObject6 = "BYSETPOS";
          bool4 = ((String)localObject5).equals(localObject6);
        } while (bool4);
        localObject6 = "BYMONTH";
        bool4 = ((String)localObject5).equals(localObject6);
        int i18;
        if (bool4)
        {
          localObject5 = ((String)localObject4).split(",");
          localObject4 = new int[localObject5.length];
          this.n = ((int[])localObject4);
          i3 = 0;
          localObject4 = null;
          for (;;)
          {
            int i6 = localObject5.length;
            if (i3 >= i6) {
              break;
            }
            localObject6 = localObject5[i3];
            bool5 = f.a((String)localObject6, k);
            if (!bool5) {
              break label1384;
            }
            localObject6 = this.n;
            localObject7 = localObject5[i3];
            i18 = Integer.parseInt((String)localObject7);
            localObject6[i3] = i18;
            i3 += 1;
          }
          localObject3 = new com/vvt/capture/calendar/ical/BogusDataException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject1 = ((StringBuilder)localObject1).append("Invalid RRULE BYMONTH '");
          localObject4 = localObject5[i3];
          localObject1 = (String)localObject4 + "'";
          ((BogusDataException)localObject3).<init>((String)localObject1, paramString);
          throw ((Throwable)localObject3);
        }
        localObject6 = "BYYEARDAY";
        boolean bool5 = ((String)localObject5).equals(localObject6);
        if (bool5)
        {
          localObject5 = ((String)localObject4).split(",");
          localObject4 = new int[localObject5.length];
          this.m = ((int[])localObject4);
          i3 = 0;
          localObject4 = null;
          for (;;)
          {
            int i7 = localObject5.length;
            if (i3 >= i7) {
              break;
            }
            localObject6 = localObject5[i3];
            boolean bool6 = f.a((String)localObject6, k);
            if (bool6)
            {
              localObject6 = this.m;
              localObject7 = localObject5[i3];
              i18 = Integer.parseInt((String)localObject7);
              localObject6[i3] = i18;
              localObject6 = this.m;
              int i8 = localObject6[i3];
              i18 = 65170;
              if (i8 >= i18)
              {
                localObject6 = this.m;
                i8 = localObject6[i3];
                i18 = 366;
                if (i8 <= i18) {}
              }
              else
              {
                localObject3 = new com/vvt/capture/calendar/ical/BogusDataException;
                localObject1 = new java/lang/StringBuilder;
                ((StringBuilder)localObject1).<init>();
                localObject1 = ((StringBuilder)localObject1).append("Invalid RRULE BYYEARDAY '");
                localObject4 = localObject5[i3];
                localObject1 = (String)localObject4 + "'";
                ((BogusDataException)localObject3).<init>((String)localObject1, paramString);
                throw ((Throwable)localObject3);
              }
            }
            else
            {
              localObject3 = new com/vvt/capture/calendar/ical/BogusDataException;
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>();
              localObject1 = ((StringBuilder)localObject1).append("Invalid RRULE BYYEARDAY '");
              localObject4 = localObject5[i3];
              localObject1 = (String)localObject4 + "'";
              ((BogusDataException)localObject3).<init>((String)localObject1, paramString);
              throw ((Throwable)localObject3);
            }
            i3 += 1;
          }
        }
        localObject6 = "BYMONTHDAY";
        boolean bool7 = ((String)localObject5).equals(localObject6);
        if (bool7)
        {
          localObject5 = ((String)localObject4).split(",");
          localObject4 = new int[localObject5.length];
          this.l = ((int[])localObject4);
          i3 = 0;
          localObject4 = null;
          for (;;)
          {
            int i9 = localObject5.length;
            if (i3 >= i9) {
              break;
            }
            localObject6 = localObject5[i3];
            boolean bool8 = f.a((String)localObject6, k);
            if (bool8)
            {
              localObject6 = this.l;
              localObject7 = localObject5[i3];
              i18 = Integer.parseInt((String)localObject7);
              localObject6[i3] = i18;
              localObject6 = this.l;
              int i10 = localObject6[i3];
              i18 = -31;
              if (i10 >= i18)
              {
                localObject6 = this.l;
                i10 = localObject6[i3];
                i18 = 31;
                if (i10 <= i18) {}
              }
              else
              {
                localObject3 = new com/vvt/capture/calendar/ical/BogusDataException;
                localObject1 = new java/lang/StringBuilder;
                ((StringBuilder)localObject1).<init>();
                localObject1 = ((StringBuilder)localObject1).append("Invalid RRULE BYMONTHDAY '");
                localObject4 = localObject5[i3];
                localObject1 = (String)localObject4 + "'";
                ((BogusDataException)localObject3).<init>((String)localObject1, paramString);
                throw ((Throwable)localObject3);
              }
            }
            else
            {
              localObject3 = new com/vvt/capture/calendar/ical/BogusDataException;
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>();
              localObject1 = ((StringBuilder)localObject1).append("Invalid RRULE BYMONTHDAY '");
              localObject4 = localObject5[i3];
              localObject1 = (String)localObject4 + "'";
              ((BogusDataException)localObject3).<init>((String)localObject1, paramString);
              throw ((Throwable)localObject3);
            }
            i3 += 1;
          }
        }
        localObject6 = "BYDAY";
        boolean bool9 = ((String)localObject5).equals(localObject6);
        if (bool9)
        {
          localObject5 = ((String)localObject4).split(",");
          localObject4 = new e[localObject5.length];
          this.h = ((e[])localObject4);
          i3 = 0;
          localObject4 = null;
          for (;;)
          {
            int i11 = localObject5.length;
            if (i3 >= i11) {
              break;
            }
            localObject6 = this.h;
            localObject7 = new com/vvt/capture/calendar/ical/e;
            String str3 = localObject5[i3];
            ((e)localObject7).<init>(this, str3);
            localObject6[i3] = localObject7;
            localObject6 = this.h[i3];
            bool10 = ((e)localObject6).d;
            if (!bool10)
            {
              localObject3 = new com/vvt/capture/calendar/ical/BogusDataException;
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>();
              localObject1 = ((StringBuilder)localObject1).append("Invalid RRULE BYDAY '");
              localObject4 = localObject5[i3];
              localObject1 = (String)localObject4 + "'";
              ((BogusDataException)localObject3).<init>((String)localObject1, paramString);
              throw ((Throwable)localObject3);
            }
            i3 += 1;
          }
        }
        localObject6 = "BYHOUR";
        boolean bool10 = ((String)localObject5).equals(localObject6);
        if (bool10)
        {
          localObject5 = ((String)localObject4).split(",");
          localObject4 = new int[localObject5.length];
          this.g = ((int[])localObject4);
          i3 = 0;
          localObject4 = null;
          for (;;)
          {
            int i12 = localObject5.length;
            if (i3 >= i12) {
              break;
            }
            localObject6 = localObject5[i3];
            boolean bool11 = f.a((String)localObject6);
            if (bool11)
            {
              localObject6 = localObject5[i3];
              int i13 = Integer.parseInt((String)localObject6);
              i18 = 23;
              if (i13 <= i18) {}
            }
            else
            {
              localObject3 = new com/vvt/capture/calendar/ical/BogusDataException;
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>();
              localObject1 = ((StringBuilder)localObject1).append("Invalid RRULE BYHOUR '");
              localObject4 = localObject5[i3];
              localObject1 = (String)localObject4 + "'";
              ((BogusDataException)localObject3).<init>((String)localObject1, paramString);
              throw ((Throwable)localObject3);
            }
            localObject6 = this.g;
            localObject7 = localObject5[i3];
            i18 = Integer.parseInt((String)localObject7);
            localObject6[i3] = i18;
            i3 += 1;
          }
        }
        localObject6 = "BYMINUTE";
        boolean bool12 = ((String)localObject5).equals(localObject6);
        if (bool12)
        {
          localObject5 = ((String)localObject4).split(",");
          localObject4 = new int[localObject5.length];
          this.f = ((int[])localObject4);
          i3 = 0;
          localObject4 = null;
          for (;;)
          {
            int i14 = localObject5.length;
            if (i3 >= i14) {
              break;
            }
            localObject6 = localObject5[i3];
            boolean bool13 = f.a((String)localObject6);
            if (bool13)
            {
              localObject6 = localObject5[i3];
              int i15 = Integer.parseInt((String)localObject6);
              i18 = 59;
              if (i15 <= i18) {}
            }
            else
            {
              localObject3 = new com/vvt/capture/calendar/ical/BogusDataException;
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>();
              localObject1 = ((StringBuilder)localObject1).append("Invalid RRULE BYMINUTE '");
              localObject4 = localObject5[i3];
              localObject1 = (String)localObject4 + "'";
              ((BogusDataException)localObject3).<init>((String)localObject1, paramString);
              throw ((Throwable)localObject3);
            }
            localObject6 = this.f;
            localObject7 = localObject5[i3];
            i18 = Integer.parseInt((String)localObject7);
            localObject6[i3] = i18;
            i3 += 1;
          }
        }
        localObject6 = "BYSECOND";
        boolean bool14 = ((String)localObject5).equals(localObject6);
        if (bool14)
        {
          localObject5 = ((String)localObject4).split(",");
          localObject4 = new int[localObject5.length];
          this.e = ((int[])localObject4);
          i3 = 0;
          localObject4 = null;
          for (;;)
          {
            int i16 = localObject5.length;
            if (i3 >= i16) {
              break;
            }
            localObject6 = localObject5[i3];
            boolean bool15 = f.a((String)localObject6);
            if (bool15)
            {
              localObject6 = localObject5[i3];
              int i17 = Integer.parseInt((String)localObject6);
              i18 = 59;
              if (i17 <= i18) {}
            }
            else
            {
              localObject3 = new com/vvt/capture/calendar/ical/BogusDataException;
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>();
              localObject1 = ((StringBuilder)localObject1).append("Invalid RRULE BYSECOND '");
              localObject4 = localObject5[i3];
              localObject1 = (String)localObject4 + "'";
              ((BogusDataException)localObject3).<init>((String)localObject1, paramString);
              throw ((Throwable)localObject3);
            }
            localObject6 = this.e;
            localObject7 = localObject5[i3];
            i18 = Integer.parseInt((String)localObject7);
            localObject6[i3] = i18;
            i3 += 1;
          }
        }
      } while (paramInt != k);
      localObject3 = new com/vvt/capture/calendar/ical/ParseException;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Invalid RRULE attribute '" + (String)localObject5 + "'";
      ((ParseException)localObject3).<init>((String)localObject1, paramString);
      throw ((Throwable)localObject3);
    }
    i1 = this.a;
    if (i1 == 0)
    {
      localObject3 = new com/vvt/capture/calendar/ical/BogusDataException;
      ((BogusDataException)localObject3).<init>("No FREQ attribute found in RRULE", paramString);
      throw ((Throwable)localObject3);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/calendar/ical/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */