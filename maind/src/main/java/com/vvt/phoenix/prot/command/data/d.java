package com.vvt.phoenix.prot.command.data;

import java.util.ArrayList;

public class d
{
  private String a;
  private String b;
  private ArrayList c;
  
  public d()
  {
    Object localObject = new java/lang/String;
    ((String)localObject).<init>();
    this.a = ((String)localObject);
    localObject = new java/lang/String;
    ((String)localObject).<init>();
    this.b = ((String)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.c = ((ArrayList)localObject);
  }
  
  public String a()
  {
    return this.a;
  }
  
  public void a(CalendarEntry paramCalendarEntry)
  {
    this.c.add(paramCalendarEntry);
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public void b(String paramString)
  {
    this.b = paramString;
  }
  
  public ArrayList c()
  {
    return this.c;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/command/data/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */