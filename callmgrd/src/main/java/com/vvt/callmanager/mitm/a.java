package com.vvt.callmanager.mitm;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class a
{
  private Date a;
  private SimpleDateFormat b;
  private String c;
  private StringBuilder d;
  private Timer e;
  private TimerTask f;
  private long g;
  
  public a(String paramString, long paramLong)
  {
    this.c = paramString;
    this.g = paramLong;
    Object localObject = new java/util/Date;
    ((Date)localObject).<init>();
    this.a = ((Date)localObject);
    localObject = new java/text/SimpleDateFormat;
    ((SimpleDateFormat)localObject).<init>("MM-dd HH:mm:ss.SSS");
    this.b = ((SimpleDateFormat)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    this.d = ((StringBuilder)localObject);
  }
  
  private TimerTask c()
  {
    b localb = new com/vvt/callmanager/mitm/b;
    localb.<init>(this);
    return localb;
  }
  
  public void a()
  {
    Object localObject = c();
    this.f = ((TimerTask)localObject);
    localObject = new java/util/Timer;
    ((Timer)localObject).<init>();
    this.e = ((Timer)localObject);
    localObject = this.e;
    TimerTask localTimerTask = this.f;
    long l1 = this.g;
    long l2 = this.g;
    ((Timer)localObject).schedule(localTimerTask, l1, l2);
  }
  
  public void a(String paramString)
  {
    Object localObject1 = this.a;
    if (localObject1 == null)
    {
      localObject1 = new java/util/Date;
      ((Date)localObject1).<init>();
      this.a = ((Date)localObject1);
    }
    localObject1 = this.b;
    if (localObject1 == null)
    {
      localObject1 = new java/text/SimpleDateFormat;
      localObject2 = "MM-dd HH:mm:ss.SSS";
      ((SimpleDateFormat)localObject1).<init>((String)localObject2);
      this.b = ((SimpleDateFormat)localObject1);
    }
    localObject1 = this.d;
    if (localObject1 == null)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      this.d = ((StringBuilder)localObject1);
    }
    localObject1 = this.a;
    long l = System.currentTimeMillis();
    ((Date)localObject1).setTime(l);
    Object localObject2 = new Object[2];
    Object localObject3 = this.b;
    Date localDate = this.a;
    localObject3 = ((SimpleDateFormat)localObject3).format(localDate);
    localObject2[0] = localObject3;
    localObject2[1] = paramString;
    localObject1 = String.format("%s: %s", (Object[])localObject2);
    this.d.append((String)localObject1).append("\n");
  }
  
  public void b()
  {
    Object localObject = this.f;
    if (localObject != null)
    {
      localObject = this.f;
      ((TimerTask)localObject).cancel();
      this.f = null;
    }
    localObject = this.e;
    if (localObject != null)
    {
      localObject = this.e;
      ((Timer)localObject).cancel();
      this.e = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/mitm/getInstance.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */