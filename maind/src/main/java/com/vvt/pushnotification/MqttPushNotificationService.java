package com.vvt.pushnotification;

import com.vvt.pushnotification.connectionhistory.PushProtocal;
import java.util.Locale;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;
import org.eclipse.paho.client.mqttv3.h;
import org.eclipse.paho.client.mqttv3.i;
import org.eclipse.paho.client.mqttv3.j;
import org.eclipse.paho.client.mqttv3.k;
import org.eclipse.paho.client.mqttv3.o;

public class MqttPushNotificationService
  implements f, org.eclipse.paho.client.mqttv3.f
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  private static final String c = com.vvt.ac.a.a();
  private static final int d = com.vvt.ac.a.d();
  private static final String e = com.vvt.ac.a.b();
  private static final String f = com.vvt.ac.a.c();
  private static final byte[] g;
  private static final Object p;
  private boolean h = false;
  private String i;
  private org.eclipse.paho.client.mqttv3.c.a j;
  private i k;
  private o l;
  private org.eclipse.paho.client.mqttv3.g m;
  private g n;
  private c o;
  
  static
  {
    Object localObject = new byte[1];
    localObject[0] = 0;
    g = (byte[])localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    p = localObject;
  }
  
  public MqttPushNotificationService(String paramString, boolean paramBoolean)
  {
    this.i = paramString;
    Object localObject1 = new org/eclipse/paho/client/mqttv3/c/a;
    ((org.eclipse.paho.client.mqttv3.c.a)localObject1).<init>();
    this.j = ((org.eclipse.paho.client.mqttv3.c.a)localObject1);
    boolean bool = a;
    if (bool) {}
    localObject1 = new org/eclipse/paho/client/mqttv3/i;
    ((i)localObject1).<init>();
    this.k = ((i)localObject1);
    localObject1 = this.k;
    Object localObject2 = e;
    ((i)localObject1).a((String)localObject2);
    localObject1 = this.k;
    localObject2 = f.toCharArray();
    ((i)localObject1).a((char[])localObject2);
    this.k.a(true);
  }
  
  private void b(Throwable paramThrowable)
  {
    g localg = this.n;
    if (localg != null)
    {
      localg = this.n;
      PushProtocal localPushProtocal = PushProtocal.MQTT;
      localg.a(localPushProtocal, paramThrowable);
    }
  }
  
  /* Error */
  private void g()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 73	com/vvt/pushnotification/MqttPushNotificationService:p	Ljava/lang/Object;
    //   5: astore_1
    //   6: aload_1
    //   7: monitorenter
    //   8: aload_0
    //   9: getfield 117	com/vvt/pushnotification/MqttPushNotificationService:m	Lorg/eclipse/paho/client/mqttv3/FxFileObserverWorker;
    //   12: astore_2
    //   13: aload_2
    //   14: ifnull +17 -> 31
    //   17: aload_0
    //   18: getfield 117	com/vvt/pushnotification/MqttPushNotificationService:m	Lorg/eclipse/paho/client/mqttv3/FxFileObserverWorker;
    //   21: astore_2
    //   22: aload_2
    //   23: invokevirtual 122	org/eclipse/paho/client/mqttv3/FxFileObserverWorker:d	()Z
    //   26: istore_3
    //   27: iload_3
    //   28: ifne +266 -> 294
    //   31: getstatic 40	com/vvt/pushnotification/MqttPushNotificationService:a	Z
    //   34: istore_3
    //   35: iload_3
    //   36: ifeq +3 -> 39
    //   39: aload_0
    //   40: getfield 117	com/vvt/pushnotification/MqttPushNotificationService:m	Lorg/eclipse/paho/client/mqttv3/FxFileObserverWorker;
    //   43: astore_2
    //   44: aload_2
    //   45: ifnull +44 -> 89
    //   48: aload_0
    //   49: getfield 117	com/vvt/pushnotification/MqttPushNotificationService:m	Lorg/eclipse/paho/client/mqttv3/FxFileObserverWorker;
    //   52: astore_2
    //   53: aload_2
    //   54: invokevirtual 122	org/eclipse/paho/client/mqttv3/FxFileObserverWorker:d	()Z
    //   57: istore_3
    //   58: iload_3
    //   59: ifeq +12 -> 71
    //   62: aload_0
    //   63: getfield 117	com/vvt/pushnotification/MqttPushNotificationService:m	Lorg/eclipse/paho/client/mqttv3/FxFileObserverWorker;
    //   66: astore_2
    //   67: aload_2
    //   68: invokevirtual 124	org/eclipse/paho/client/mqttv3/FxFileObserverWorker:a	()V
    //   71: aload_0
    //   72: getfield 117	com/vvt/pushnotification/MqttPushNotificationService:m	Lorg/eclipse/paho/client/mqttv3/FxFileObserverWorker;
    //   75: astore_2
    //   76: aload_2
    //   77: invokevirtual 126	org/eclipse/paho/client/mqttv3/FxFileObserverWorker:MyUncaughtExceptionHandler	()V
    //   80: iconst_0
    //   81: istore_3
    //   82: aconst_null
    //   83: astore_2
    //   84: aload_0
    //   85: aconst_null
    //   86: putfield 117	com/vvt/pushnotification/MqttPushNotificationService:m	Lorg/eclipse/paho/client/mqttv3/FxFileObserverWorker;
    //   89: getstatic 132	java/util/Locale:US	Ljava/util/Locale;
    //   92: astore_2
    //   93: ldc -122
    //   95: astore 4
    //   97: iconst_2
    //   98: istore 5
    //   100: iload 5
    //   102: anewarray 4	java/lang/Object
    //   105: astore 6
    //   107: iconst_0
    //   108: istore 7
    //   110: aconst_null
    //   111: astore 8
    //   113: getstatic 51	com/vvt/pushnotification/MqttPushNotificationService:MyUncaughtExceptionHandler	Ljava/lang/String;
    //   116: astore 9
    //   118: aload 6
    //   120: iconst_0
    //   121: aload 9
    //   123: aastore
    //   124: iconst_1
    //   125: istore 7
    //   127: getstatic 56	com/vvt/pushnotification/MqttPushNotificationService:d	I
    //   130: istore 10
    //   132: iload 10
    //   134: invokestatic 141	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   137: astore 9
    //   139: aload 6
    //   141: iload 7
    //   143: aload 9
    //   145: aastore
    //   146: aload_2
    //   147: aload 4
    //   149: aload 6
    //   151: invokestatic 145	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   154: astore_2
    //   155: getstatic 40	com/vvt/pushnotification/MqttPushNotificationService:a	Z
    //   158: istore 11
    //   160: iload 11
    //   162: ifeq +3 -> 165
    //   165: new 119	org/eclipse/paho/client/mqttv3/FxFileObserverWorker
    //   168: astore 4
    //   170: aload_0
    //   171: getfield 77	com/vvt/pushnotification/MqttPushNotificationService:i	Ljava/lang/String;
    //   174: astore 6
    //   176: aload_0
    //   177: getfield 82	com/vvt/pushnotification/MqttPushNotificationService:j	Lorg/eclipse/paho/client/mqttv3/MyUncaughtExceptionHandler/a;
    //   180: astore 8
    //   182: aload 4
    //   184: aload_2
    //   185: aload 6
    //   187: aload 8
    //   189: invokespecial 148	org/eclipse/paho/client/mqttv3/FxFileObserverWorker:<init>	(Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/AppEngine1;)V
    //   192: aload_0
    //   193: aload 4
    //   195: putfield 117	com/vvt/pushnotification/MqttPushNotificationService:m	Lorg/eclipse/paho/client/mqttv3/FxFileObserverWorker;
    //   198: aload_0
    //   199: getfield 117	com/vvt/pushnotification/MqttPushNotificationService:m	Lorg/eclipse/paho/client/mqttv3/FxFileObserverWorker;
    //   202: astore_2
    //   203: aload_0
    //   204: getfield 87	com/vvt/pushnotification/MqttPushNotificationService:k	Lorg/eclipse/paho/client/mqttv3/i;
    //   207: astore 4
    //   209: aload_2
    //   210: aload 4
    //   212: invokevirtual 151	org/eclipse/paho/client/mqttv3/FxFileObserverWorker:a	(Lorg/eclipse/paho/client/mqttv3/i;)V
    //   215: aload_0
    //   216: getfield 117	com/vvt/pushnotification/MqttPushNotificationService:m	Lorg/eclipse/paho/client/mqttv3/FxFileObserverWorker;
    //   219: astore_2
    //   220: aload_0
    //   221: getfield 77	com/vvt/pushnotification/MqttPushNotificationService:i	Ljava/lang/String;
    //   224: astore 4
    //   226: iconst_1
    //   227: istore 5
    //   229: aload_2
    //   230: aload 4
    //   232: iload 5
    //   234: invokevirtual 154	org/eclipse/paho/client/mqttv3/FxFileObserverWorker:a	(Ljava/lang/String;I)V
    //   237: aload_0
    //   238: getfield 117	com/vvt/pushnotification/MqttPushNotificationService:m	Lorg/eclipse/paho/client/mqttv3/FxFileObserverWorker;
    //   241: astore_2
    //   242: aload_2
    //   243: aload_0
    //   244: invokevirtual 157	org/eclipse/paho/client/mqttv3/FxFileObserverWorker:a	(Lorg/eclipse/paho/client/mqttv3/f;)V
    //   247: aload_0
    //   248: getfield 104	com/vvt/pushnotification/MqttPushNotificationService:n	Lcom/vvt/pushnotification/FxFileObserverWorker;
    //   251: astore_2
    //   252: aload_2
    //   253: ifnull +21 -> 274
    //   256: aload_0
    //   257: getfield 104	com/vvt/pushnotification/MqttPushNotificationService:n	Lcom/vvt/pushnotification/FxFileObserverWorker;
    //   260: astore_2
    //   261: getstatic 110	com/vvt/pushnotification/connectionhistory/PushProtocal:MQTT	Lcom/vvt/pushnotification/connectionhistory/PushProtocal;
    //   264: astore 4
    //   266: aload_2
    //   267: aload 4
    //   269: invokeinterface 160 2 0
    //   274: getstatic 40	com/vvt/pushnotification/MqttPushNotificationService:a	Z
    //   277: istore_3
    //   278: iload_3
    //   279: ifeq +3 -> 282
    //   282: iconst_1
    //   283: istore_3
    //   284: aload_0
    //   285: iload_3
    //   286: putfield 75	com/vvt/pushnotification/MqttPushNotificationService:AppEngine1	Z
    //   289: aload_1
    //   290: monitorexit
    //   291: aload_0
    //   292: monitorexit
    //   293: return
    //   294: getstatic 40	com/vvt/pushnotification/MqttPushNotificationService:a	Z
    //   297: istore_3
    //   298: iload_3
    //   299: ifeq -17 -> 282
    //   302: goto -20 -> 282
    //   305: astore_2
    //   306: aload_1
    //   307: monitorexit
    //   308: aload_2
    //   309: athrow
    //   310: astore_2
    //   311: getstatic 44	com/vvt/pushnotification/MqttPushNotificationService:removeFromPath	Z
    //   314: istore 12
    //   316: iload 12
    //   318: ifeq +3 -> 321
    //   321: aload_0
    //   322: invokespecial 162	com/vvt/pushnotification/MqttPushNotificationService:i	()V
    //   325: aload_0
    //   326: aload_2
    //   327: invokespecial 165	com/vvt/pushnotification/MqttPushNotificationService:removeFromPath	(Ljava/lang/Throwable;)V
    //   330: goto -39 -> 291
    //   333: astore_2
    //   334: aload_0
    //   335: monitorexit
    //   336: aload_2
    //   337: athrow
    //   338: astore_2
    //   339: aload_0
    //   340: invokespecial 162	com/vvt/pushnotification/MqttPushNotificationService:i	()V
    //   343: aload_0
    //   344: aload_2
    //   345: invokespecial 165	com/vvt/pushnotification/MqttPushNotificationService:removeFromPath	(Ljava/lang/Throwable;)V
    //   348: goto -57 -> 291
    //   351: astore_2
    //   352: goto -281 -> 71
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	355	0	this	MqttPushNotificationService
    //   12	255	2	localObject2	Object
    //   305	4	2	localObject3	Object
    //   310	17	2	localMqttException	MqttException
    //   333	4	2	localObject4	Object
    //   338	7	2	localException1	Exception
    //   351	1	2	localException2	Exception
    //   26	273	3	bool1	boolean
    //   95	173	4	localObject5	Object
    //   98	135	5	i1	int
    //   105	81	6	localObject6	Object
    //   108	34	7	i2	int
    //   111	77	8	locala	org.eclipse.paho.client.mqttv3.MyUncaughtExceptionHandler.a
    //   116	28	9	localObject7	Object
    //   130	3	10	i3	int
    //   158	3	11	bool2	boolean
    //   314	3	12	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   8	12	305	finally
    //   17	21	305	finally
    //   22	26	305	finally
    //   31	34	305	finally
    //   39	43	305	finally
    //   48	52	305	finally
    //   53	57	305	finally
    //   62	66	305	finally
    //   67	71	305	finally
    //   71	75	305	finally
    //   76	80	305	finally
    //   85	89	305	finally
    //   89	92	305	finally
    //   100	105	305	finally
    //   113	116	305	finally
    //   121	124	305	finally
    //   127	130	305	finally
    //   132	137	305	finally
    //   143	146	305	finally
    //   149	154	305	finally
    //   155	158	305	finally
    //   165	168	305	finally
    //   170	174	305	finally
    //   176	180	305	finally
    //   187	192	305	finally
    //   193	198	305	finally
    //   198	202	305	finally
    //   203	207	305	finally
    //   210	215	305	finally
    //   215	219	305	finally
    //   220	224	305	finally
    //   232	237	305	finally
    //   237	241	305	finally
    //   243	247	305	finally
    //   247	251	305	finally
    //   256	260	305	finally
    //   261	264	305	finally
    //   267	274	305	finally
    //   274	277	305	finally
    //   285	289	305	finally
    //   289	291	305	finally
    //   294	297	305	finally
    //   306	308	305	finally
    //   2	5	310	org/eclipse/paho/client/mqttv3/MqttException
    //   6	8	310	org/eclipse/paho/client/mqttv3/MqttException
    //   308	310	310	org/eclipse/paho/client/mqttv3/MqttException
    //   2	5	333	finally
    //   6	8	333	finally
    //   308	310	333	finally
    //   311	314	333	finally
    //   321	325	333	finally
    //   326	330	333	finally
    //   339	343	333	finally
    //   344	348	333	finally
    //   2	5	338	java/lang/Exception
    //   6	8	338	java/lang/Exception
    //   308	310	338	java/lang/Exception
    //   62	66	351	java/lang/Exception
    //   67	71	351	java/lang/Exception
  }
  
  private j h()
  {
    try
    {
      bool = f();
      if (!bool)
      {
        i();
        MqttPushNotificationService.MqttConnectivityException localMqttConnectivityException = new com/vvt/pushnotification/MqttPushNotificationService$MqttConnectivityException;
        localObject3 = null;
        localMqttConnectivityException.<init>(this, null);
        throw localMqttConnectivityException;
      }
    }
    finally {}
    Object localObject2 = this.l;
    if (localObject2 == null)
    {
      localObject2 = this.m;
      localObject3 = Locale.US;
      String str1 = "/users/%s/keepalive";
      int i1 = 1;
      Object[] arrayOfObject = new Object[i1];
      String str2 = this.i;
      arrayOfObject[0] = str2;
      localObject3 = String.format((Locale)localObject3, str1, arrayOfObject);
      localObject2 = ((org.eclipse.paho.client.mqttv3.g)localObject2).a((String)localObject3);
      this.l = ((o)localObject2);
    }
    boolean bool = a;
    if (bool) {}
    localObject2 = new org/eclipse/paho/client/mqttv3/k;
    Object localObject3 = g;
    ((k)localObject2).<init>((byte[])localObject3);
    localObject3 = null;
    ((k)localObject2).b(0);
    localObject3 = this.l;
    localObject2 = ((o)localObject3).a((k)localObject2);
    return (j)localObject2;
  }
  
  /* Error */
  private void i()
  {
    // Byte code:
    //   0: getstatic 40	com/vvt/pushnotification/MqttPushNotificationService:a	Z
    //   3: istore_1
    //   4: iload_1
    //   5: ifeq +3 -> 8
    //   8: getstatic 73	com/vvt/pushnotification/MqttPushNotificationService:p	Ljava/lang/Object;
    //   11: astore_2
    //   12: aload_2
    //   13: monitorenter
    //   14: aload_0
    //   15: getfield 117	com/vvt/pushnotification/MqttPushNotificationService:m	Lorg/eclipse/paho/client/mqttv3/FxFileObserverWorker;
    //   18: astore_3
    //   19: aload_3
    //   20: ifnull +35 -> 55
    //   23: aload_0
    //   24: getfield 117	com/vvt/pushnotification/MqttPushNotificationService:m	Lorg/eclipse/paho/client/mqttv3/FxFileObserverWorker;
    //   27: astore_3
    //   28: aload_3
    //   29: invokevirtual 122	org/eclipse/paho/client/mqttv3/FxFileObserverWorker:d	()Z
    //   32: istore_1
    //   33: iload_1
    //   34: ifeq +12 -> 46
    //   37: aload_0
    //   38: getfield 117	com/vvt/pushnotification/MqttPushNotificationService:m	Lorg/eclipse/paho/client/mqttv3/FxFileObserverWorker;
    //   41: astore_3
    //   42: aload_3
    //   43: invokevirtual 124	org/eclipse/paho/client/mqttv3/FxFileObserverWorker:a	()V
    //   46: aload_0
    //   47: getfield 117	com/vvt/pushnotification/MqttPushNotificationService:m	Lorg/eclipse/paho/client/mqttv3/FxFileObserverWorker;
    //   50: astore_3
    //   51: aload_3
    //   52: invokevirtual 126	org/eclipse/paho/client/mqttv3/FxFileObserverWorker:MyUncaughtExceptionHandler	()V
    //   55: aload_2
    //   56: monitorexit
    //   57: aload_0
    //   58: aconst_null
    //   59: putfield 117	com/vvt/pushnotification/MqttPushNotificationService:m	Lorg/eclipse/paho/client/mqttv3/FxFileObserverWorker;
    //   62: aload_0
    //   63: aconst_null
    //   64: putfield 178	com/vvt/pushnotification/MqttPushNotificationService:l	Lorg/eclipse/paho/client/mqttv3/o;
    //   67: aload_0
    //   68: iconst_0
    //   69: putfield 75	com/vvt/pushnotification/MqttPushNotificationService:AppEngine1	Z
    //   72: return
    //   73: astore_3
    //   74: aload_2
    //   75: monitorexit
    //   76: aload_3
    //   77: athrow
    //   78: astore_3
    //   79: getstatic 44	com/vvt/pushnotification/MqttPushNotificationService:removeFromPath	Z
    //   82: istore_1
    //   83: iload_1
    //   84: ifeq +3 -> 87
    //   87: aload_0
    //   88: aconst_null
    //   89: putfield 117	com/vvt/pushnotification/MqttPushNotificationService:m	Lorg/eclipse/paho/client/mqttv3/FxFileObserverWorker;
    //   92: aload_0
    //   93: aconst_null
    //   94: putfield 178	com/vvt/pushnotification/MqttPushNotificationService:l	Lorg/eclipse/paho/client/mqttv3/o;
    //   97: goto -30 -> 67
    //   100: astore_3
    //   101: aload_0
    //   102: aconst_null
    //   103: putfield 117	com/vvt/pushnotification/MqttPushNotificationService:m	Lorg/eclipse/paho/client/mqttv3/FxFileObserverWorker;
    //   106: aload_0
    //   107: aconst_null
    //   108: putfield 178	com/vvt/pushnotification/MqttPushNotificationService:l	Lorg/eclipse/paho/client/mqttv3/o;
    //   111: aload_0
    //   112: iconst_0
    //   113: putfield 75	com/vvt/pushnotification/MqttPushNotificationService:AppEngine1	Z
    //   116: aload_3
    //   117: athrow
    //   118: astore_3
    //   119: goto -73 -> 46
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	122	0	this	MqttPushNotificationService
    //   3	81	1	bool	boolean
    //   11	64	2	localObject1	Object
    //   18	34	3	localg	org.eclipse.paho.client.mqttv3.FxFileObserverWorker
    //   73	4	3	localObject2	Object
    //   78	1	3	localObject3	Object
    //   100	17	3	localObject4	Object
    //   118	1	3	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   14	18	73	finally
    //   23	27	73	finally
    //   28	32	73	finally
    //   37	41	73	finally
    //   42	46	73	finally
    //   46	50	73	finally
    //   51	55	73	finally
    //   55	57	73	finally
    //   74	76	73	finally
    //   8	11	78	finally
    //   12	14	78	finally
    //   76	78	78	finally
    //   79	82	100	finally
    //   37	41	118	java/lang/Exception
    //   42	46	118	java/lang/Exception
  }
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 75	com/vvt/pushnotification/MqttPushNotificationService:AppEngine1	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +14 -> 22
    //   11: getstatic 40	com/vvt/pushnotification/MqttPushNotificationService:a	Z
    //   14: istore_1
    //   15: iload_1
    //   16: ifeq +3 -> 19
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: aload_0
    //   23: invokespecial 198	com/vvt/pushnotification/MqttPushNotificationService:FxFileObserverWorker	()V
    //   26: goto -7 -> 19
    //   29: astore_2
    //   30: aload_0
    //   31: monitorexit
    //   32: aload_2
    //   33: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	34	0	this	MqttPushNotificationService
    //   6	10	1	bool	boolean
    //   29	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	6	29	finally
    //   11	14	29	finally
    //   22	26	29	finally
  }
  
  public void a(c paramc)
  {
    this.o = paramc;
  }
  
  public void a(g paramg)
  {
    this.n = paramg;
  }
  
  public void a(String paramString, k paramk)
  {
    String str = new java/lang/String;
    Object localObject = paramk.a();
    str.<init>((byte[])localObject);
    boolean bool = a;
    if (bool) {}
    localObject = this.o;
    if (localObject != null)
    {
      localObject = "";
      if (str != localObject)
      {
        int i1 = str.length();
        if (i1 > 0)
        {
          localObject = this.o;
          ((c)localObject).a(str);
        }
      }
    }
  }
  
  public void a(Throwable paramThrowable)
  {
    boolean bool = b;
    if (bool) {}
    i();
    b(paramThrowable);
  }
  
  public void a(org.eclipse.paho.client.mqttv3.c paramc) {}
  
  public void b()
  {
    bool = false;
    org.eclipse.paho.client.mqttv3.g localg = null;
    try
    {
      this.h = false;
      localg = this.m;
      if (localg != null) {}
      try
      {
        localg = this.m;
        bool = localg.d();
        if (!bool) {}
      }
      catch (MqttException localMqttException)
      {
        for (;;)
        {
          label43:
          bool = b;
          if (!bool) {}
        }
      }
    }
    finally {}
    try
    {
      localg = this.m;
      localg.a();
    }
    catch (Exception localException)
    {
      break label43;
    }
    localg = this.m;
    localg.c();
    bool = false;
    localg = null;
    this.l = null;
    bool = false;
    localg = null;
    this.m = null;
  }
  
  public boolean c()
  {
    int i1 = 1;
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject2 = Locale.US;
    Object localObject3 = "tcp://%s:%d";
    int i2 = 2;
    Object localObject4 = new Object[i2];
    Object localObject5 = c;
    localObject4[0] = localObject5;
    int i3 = d;
    localObject5 = Integer.valueOf(i3);
    localObject4[i1] = localObject5;
    localObject2 = String.format((Locale)localObject2, (String)localObject3, (Object[])localObject4);
    boolean bool2 = a;
    if (bool2) {}
    for (;;)
    {
      try
      {
        bool2 = a;
        if (bool2) {}
        localObject3 = new org/eclipse/paho/client/mqttv3/g;
        localObject4 = this.i;
        localObject5 = this.j;
        ((org.eclipse.paho.client.mqttv3.g)localObject3).<init>((String)localObject2, (String)localObject4, (h)localObject5);
        this.m = ((org.eclipse.paho.client.mqttv3.g)localObject3);
        localObject2 = this.m;
        localObject3 = this.k;
        ((org.eclipse.paho.client.mqttv3.g)localObject2).a((i)localObject3);
        localObject2 = this.m;
        boolean bool3 = ((org.eclipse.paho.client.mqttv3.g)localObject2).d();
        bool2 = b;
      }
      catch (Exception localException2)
      {
        try
        {
          bool1 = a;
          if ((!bool1) || (bool3))
          {
            localObject1 = this.m;
            localObject3 = this.i;
            i2 = 1;
            ((org.eclipse.paho.client.mqttv3.g)localObject1).a((String)localObject3, i2);
            localObject1 = this.m;
            ((org.eclipse.paho.client.mqttv3.g)localObject1).a(this);
            localObject1 = this.n;
            if (localObject1 != null)
            {
              localObject1 = this.n;
              localObject3 = PushProtocal.MQTT;
              ((g)localObject1).a((PushProtocal)localObject3);
            }
          }
          return bool3;
        }
        catch (Exception localException1)
        {
          for (;;) {}
        }
        localException2 = localException2;
        bool3 = false;
        localObject2 = null;
        localObject1 = localException2;
      }
      if (bool2) {}
      localObject3 = this.m;
      if (localObject3 != null) {}
      try
      {
        localObject3 = this.m;
        ((org.eclipse.paho.client.mqttv3.g)localObject3).c();
      }
      catch (MqttException localMqttException)
      {
        for (;;) {}
      }
      bool2 = false;
      localObject3 = null;
      this.m = null;
      localObject3 = this.n;
      if (localObject3 != null)
      {
        localObject3 = this.n;
        localObject4 = PushProtocal.MQTT;
        ((g)localObject3).b((PushProtocal)localObject4, (Throwable)localObject1);
      }
    }
  }
  
  public void d()
  {
    boolean bool1 = f();
    if (bool1) {}
    for (;;)
    {
      try
      {
        h();
        return;
      }
      catch (MqttPushNotificationService.MqttConnectivityException localMqttConnectivityException)
      {
        bool2 = b;
        if (bool2) {}
        i();
        b(localMqttConnectivityException);
        continue;
      }
      catch (MqttPersistenceException localMqttPersistenceException)
      {
        bool2 = b;
        if (bool2) {}
        i();
        b(localMqttPersistenceException);
        continue;
      }
      catch (MqttException localMqttException)
      {
        boolean bool2 = b;
        if (bool2) {}
        i();
        b(localMqttException);
        continue;
      }
      Exception localException = new java/lang/Exception;
      String str = "sendKeepAliveNow failed. Not Client is connected!";
      localException.<init>(str);
      b(localException);
    }
  }
  
  public void e()
  {
    boolean bool = f();
    if (!bool)
    {
      Exception localException = new java/lang/Exception;
      String str = "reconnectIfReq failed. Client is closed. Please reconnect.";
      localException.<init>(str);
      b(localException);
    }
  }
  
  public boolean f()
  {
    boolean bool1 = false;
    boolean bool2 = this.h;
    if (bool2)
    {
      localg = this.m;
      if (localg != null)
      {
        localg = this.m;
        bool2 = localg.d();
        if (!bool2)
        {
          bool2 = a;
          if (!bool2) {}
        }
      }
    }
    org.eclipse.paho.client.mqttv3.g localg = this.m;
    if (localg != null)
    {
      bool2 = this.h;
      if (bool2)
      {
        localg = this.m;
        bool2 = localg.d();
        if (bool2) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public String toString()
  {
    return "MqttPushNotificationService";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/pushnotification/MqttPushNotificationService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */