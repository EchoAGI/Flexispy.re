package com.vvt.capture.calendar.b;

import java.util.ArrayList;
import java.util.List;

public class b
{
  boolean a;
  private long b;
  private int c;
  private String d;
  private String e;
  private String f;
  private String g;
  private String h;
  private String i;
  private int j;
  private String k;
  private String l;
  private String m;
  private String n;
  private List o;
  private d p;
  private List q;
  
  public b()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.o = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.q = localArrayList;
  }
  
  public long a()
  {
    return this.b;
  }
  
  public void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void a(long paramLong)
  {
    this.b = paramLong;
  }
  
  public void a(a parama)
  {
    this.o.add(parama);
  }
  
  public void a(d paramd)
  {
    this.p = paramd;
  }
  
  public void a(String paramString)
  {
    this.d = paramString;
  }
  
  public void a(List paramList)
  {
    this.q = paramList;
  }
  
  public void a(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  public String b()
  {
    return this.d;
  }
  
  public void b(int paramInt)
  {
    this.j = paramInt;
  }
  
  public void b(String paramString)
  {
    this.e = paramString;
  }
  
  public String c()
  {
    return this.e;
  }
  
  public void c(String paramString)
  {
    this.f = paramString;
  }
  
  public String d()
  {
    return this.f;
  }
  
  public void d(String paramString)
  {
    this.g = paramString;
  }
  
  public String e()
  {
    return this.g;
  }
  
  public void e(String paramString)
  {
    this.h = paramString;
  }
  
  public String f()
  {
    return this.h;
  }
  
  public void f(String paramString)
  {
    this.i = paramString;
  }
  
  public String g()
  {
    return this.i;
  }
  
  public void g(String paramString)
  {
    this.k = paramString;
  }
  
  public String h()
  {
    return this.k;
  }
  
  public void h(String paramString)
  {
    this.l = paramString;
  }
  
  public String i()
  {
    return this.l;
  }
  
  public void i(String paramString)
  {
    this.m = paramString;
  }
  
  public String j()
  {
    return this.m;
  }
  
  public void j(String paramString)
  {
    this.n = paramString;
  }
  
  public String k()
  {
    return this.n;
  }
  
  public List l()
  {
    return this.o;
  }
  
  public d m()
  {
    return this.p;
  }
  
  public boolean n()
  {
    return this.a;
  }
  
  public List o()
  {
    return this.q;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("CalendarEvent { entryId: ");
    long l1 = this.b;
    localObject = l1;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", entryType: ");
    int i1 = this.c;
    localObject = i1;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", subject:");
    String str = this.d;
    localObject = str;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", createDateTime:");
    str = this.e;
    localObject = str;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", lastModifyDateTime:");
    str = this.f;
    localObject = str;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", startDateTime:");
    str = this.g;
    localObject = str;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", endDateTime:");
    str = this.h;
    localObject = str;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", originalDateTime:");
    str = this.i;
    localObject = str;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", priority:");
    i1 = this.j;
    localObject = i1;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", location:");
    str = this.k;
    localObject = str;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", description:");
    str = this.l;
    localObject = str;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", organizerUid:");
    str = this.m;
    localObject = str;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", organizerName:");
    str = this.n;
    localObject = str;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", attendees :");
    str = this.o.toString();
    localObject = str;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", exceptionDates :");
    str = this.q.toString();
    localObject = str;
    localStringBuilder.append((String)localObject);
    localObject = this.p;
    if (localObject != null)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(", recurrenceData :");
      str = this.p.toString();
      localObject = str;
      localStringBuilder.append((String)localObject);
    }
    for (;;)
    {
      localStringBuilder.append(" }");
      return localStringBuilder.toString();
      localObject = ", recurrenceData : no recurrence data";
      localStringBuilder.append((String)localObject);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/calendar/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */