package com.vvt.phoenix.prot.command.data;

import java.util.ArrayList;

public class CalendarRecurrence
{
  private String a = "0000-00-00 00:00:00";
  private String b = "0000-00-00 00:00:00";
  private CalendarRecurrence.RecurrenceType c;
  private int d;
  private CalendarRecurrence.FirstDayOfWeek e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j;
  private int k;
  private ArrayList l;
  
  public CalendarRecurrence()
  {
    Object localObject = CalendarRecurrence.RecurrenceType.NONE;
    this.c = ((CalendarRecurrence.RecurrenceType)localObject);
    this.d = 1;
    localObject = CalendarRecurrence.FirstDayOfWeek.SUNDAY;
    this.e = ((CalendarRecurrence.FirstDayOfWeek)localObject);
    int m = CalendarRecurrence.DaysOfWeek.NONE.getValue();
    this.f = m;
    this.g = 0;
    this.h = 0;
    this.i = 0;
    this.j = 0;
    this.k = 0;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.l = ((ArrayList)localObject);
  }
  
  public String a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public void a(CalendarRecurrence.FirstDayOfWeek paramFirstDayOfWeek)
  {
    this.e = paramFirstDayOfWeek;
  }
  
  public void a(CalendarRecurrence.RecurrenceType paramRecurrenceType)
  {
    this.c = paramRecurrenceType;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public void b(int paramInt)
  {
    this.f = paramInt;
  }
  
  public void b(String paramString)
  {
    this.b = paramString;
  }
  
  public CalendarRecurrence.RecurrenceType c()
  {
    return this.c;
  }
  
  public void c(int paramInt)
  {
    this.g = paramInt;
  }
  
  public void c(String paramString)
  {
    this.l.add(paramString);
  }
  
  public int d()
  {
    return this.d;
  }
  
  public void d(int paramInt)
  {
    this.h = paramInt;
  }
  
  public CalendarRecurrence.FirstDayOfWeek e()
  {
    return this.e;
  }
  
  public void e(int paramInt)
  {
    this.i = paramInt;
  }
  
  public int f()
  {
    return this.f;
  }
  
  public void f(int paramInt)
  {
    this.j = paramInt;
  }
  
  public int g()
  {
    return this.g;
  }
  
  public void g(int paramInt)
  {
    this.k = paramInt;
  }
  
  public int h()
  {
    return this.h;
  }
  
  public String h(int paramInt)
  {
    return (String)this.l.get(paramInt);
  }
  
  public int i()
  {
    return this.i;
  }
  
  public int j()
  {
    return this.j;
  }
  
  public int k()
  {
    return this.k;
  }
  
  public int l()
  {
    return this.l.size();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/command/data/CalendarRecurrence.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */