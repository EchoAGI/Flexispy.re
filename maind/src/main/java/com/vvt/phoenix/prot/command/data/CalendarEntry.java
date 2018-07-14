package com.vvt.phoenix.prot.command.data;

import java.util.ArrayList;

public class CalendarEntry
{
  private String a;
  private CalendarEntry.EntryType b;
  private String c;
  private String d;
  private String e;
  private String f;
  private String g;
  private String h;
  private CalendarEntry.Priority i;
  private String j;
  private String k;
  private f l;
  private ArrayList m;
  private CalendarEntry.Recurring n;
  private CalendarRecurrence o;
  
  public CalendarEntry()
  {
    Object localObject = new java/lang/String;
    ((String)localObject).<init>();
    this.a = ((String)localObject);
    localObject = CalendarEntry.EntryType.UNKNOWN;
    this.b = ((CalendarEntry.EntryType)localObject);
    localObject = new java/lang/String;
    ((String)localObject).<init>();
    this.c = ((String)localObject);
    localObject = new java/lang/String;
    ((String)localObject).<init>();
    this.d = ((String)localObject);
    localObject = new java/lang/String;
    ((String)localObject).<init>();
    this.e = ((String)localObject);
    localObject = new java/lang/String;
    ((String)localObject).<init>();
    this.f = ((String)localObject);
    localObject = new java/lang/String;
    ((String)localObject).<init>();
    this.g = ((String)localObject);
    localObject = new java/lang/String;
    ((String)localObject).<init>();
    this.h = ((String)localObject);
    localObject = CalendarEntry.Priority.NONE;
    this.i = ((CalendarEntry.Priority)localObject);
    localObject = new java/lang/String;
    ((String)localObject).<init>();
    this.j = ((String)localObject);
    localObject = new java/lang/String;
    ((String)localObject).<init>();
    this.k = ((String)localObject);
    localObject = new com/vvt/phoenix/prot/command/data/f;
    ((f)localObject).<init>();
    this.l = ((f)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.m = ((ArrayList)localObject);
    localObject = CalendarEntry.Recurring.NO;
    this.n = ((CalendarEntry.Recurring)localObject);
    localObject = new com/vvt/phoenix/prot/command/data/CalendarRecurrence;
    ((CalendarRecurrence)localObject).<init>();
    this.o = ((CalendarRecurrence)localObject);
  }
  
  public String a()
  {
    return this.a;
  }
  
  public void a(CalendarEntry.EntryType paramEntryType)
  {
    this.b = paramEntryType;
  }
  
  public void a(CalendarEntry.Priority paramPriority)
  {
    this.i = paramPriority;
  }
  
  public void a(CalendarEntry.Recurring paramRecurring)
  {
    this.n = paramRecurring;
  }
  
  public void a(CalendarRecurrence paramCalendarRecurrence)
  {
    this.o = paramCalendarRecurrence;
  }
  
  public void a(e parame)
  {
    this.m.add(parame);
  }
  
  public void a(f paramf)
  {
    this.l = paramf;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public CalendarEntry.EntryType b()
  {
    return this.b;
  }
  
  public void b(String paramString)
  {
    this.c = paramString;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public void c(String paramString)
  {
    this.d = paramString;
  }
  
  public String d()
  {
    return this.d;
  }
  
  public void d(String paramString)
  {
    this.e = paramString;
  }
  
  public String e()
  {
    return this.e;
  }
  
  public void e(String paramString)
  {
    this.f = paramString;
  }
  
  public String f()
  {
    return this.f;
  }
  
  public void f(String paramString)
  {
    this.g = paramString;
  }
  
  public String g()
  {
    return this.g;
  }
  
  public void g(String paramString)
  {
    this.h = paramString;
  }
  
  public String h()
  {
    return this.h;
  }
  
  public void h(String paramString)
  {
    this.j = paramString;
  }
  
  public CalendarEntry.Priority i()
  {
    return this.i;
  }
  
  public void i(String paramString)
  {
    this.k = paramString;
  }
  
  public String j()
  {
    return this.j;
  }
  
  public String k()
  {
    return this.k;
  }
  
  public f l()
  {
    return this.l;
  }
  
  public ArrayList m()
  {
    return this.m;
  }
  
  public CalendarEntry.Recurring n()
  {
    return this.n;
  }
  
  public CalendarRecurrence o()
  {
    return this.o;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/command/data/CalendarEntry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */