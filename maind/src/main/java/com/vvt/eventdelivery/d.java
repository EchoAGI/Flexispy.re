package com.vvt.eventdelivery;

import com.vvt.datadeliverymanager.a.a;
import java.util.Timer;

public class d
{
  private Timer b;
  private EventDelivery.Type c;
  private int d;
  private a e;
  
  public d(c paramc, EventDelivery.Type paramType, int paramInt1, a parama, int paramInt2)
  {
    this.d = paramInt1;
    this.c = paramType;
    this.e = parama;
    Timer localTimer = new java/util/Timer;
    localTimer.<init>();
    this.b = localTimer;
    localTimer = this.b;
    e locale = new com/vvt/eventdelivery/e;
    locale.<init>(this);
    long l = paramInt2 * 1000;
    localTimer.schedule(locale, l);
  }
  
  public void a()
  {
    this.b.cancel();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventdelivery/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */