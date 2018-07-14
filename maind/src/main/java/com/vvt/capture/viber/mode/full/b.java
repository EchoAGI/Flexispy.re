package com.vvt.capture.viber.mode.full;

import com.vvt.h.d;
import com.vvt.im.events.info.e;
import java.util.ArrayList;
import java.util.List;

public class b
{
  private static final boolean a;
  private static final boolean b;
  private static final boolean c;
  
  static
  {
    boolean bool = com.vvt.ak.a.a;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      b = com.vvt.ak.a.b;
      c = com.vvt.ak.a.e;
      return;
    }
  }
  
  private static com.vvt.im.events.info.b a(String paramString1, boolean paramBoolean, String paramString2, String paramString3, List paramList)
  {
    boolean bool1 = false;
    boolean bool2 = a;
    if ((!bool2) || (paramBoolean)) {
      if (paramString1 != null)
      {
        int i = paramString1.length();
        int k = 1;
        if (i >= k) {}
      }
      else
      {
        paramString1 = null;
      }
    }
    for (;;)
    {
      boolean bool3 = a;
      if (bool3) {}
      bool3 = a;
      if (bool3) {}
      Object localObject = new com/vvt/im/events/info/b;
      ((com.vvt.im.events.info.b)localObject).<init>();
      ((com.vvt.im.events.info.b)localObject).a(paramString2);
      ((com.vvt.im.events.info.b)localObject).b(paramString1);
      ((com.vvt.im.events.info.b)localObject).c(null);
      byte[] arrayOfByte = new byte[0];
      ((com.vvt.im.events.info.b)localObject).a(arrayOfByte);
      ((com.vvt.im.events.info.b)localObject).d(null);
      bool1 = a;
      if (bool1) {}
      return (com.vvt.im.events.info.b)localObject;
      int j = paramList.size();
      if (j > 0)
      {
        localObject = (e)paramList.get(0);
        paramString1 = ((e)localObject).c();
      }
      j = paramList.size();
      if (j > 0)
      {
        localObject = (e)paramList.get(0);
        paramString2 = ((e)localObject).d();
      }
    }
  }
  
  /* Error */
  private static com.vvt.im.events.info.f a(com.vvt.af.a.a parama, String paramString1, int paramInt1, com.vvt.im.events.info.d paramd, com.vvt.im.events.info.ICallLogData.Direction paramDirection, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, String paramString2)
  {
    // Byte code:
    //   0: getstatic 14	com/vvt/capture/viber/mode/full/removeFromPath:a	Z
    //   3: istore 12
    //   5: iload 12
    //   7: ifeq +3 -> 10
    //   10: new 65	com/vvt/im/events/info/f
    //   13: astore 13
    //   15: aload 13
    //   17: invokespecial 66	com/vvt/im/events/info/f:<init>	()V
    //   20: aconst_null
    //   21: astore 14
    //   23: aconst_null
    //   24: astore 15
    //   26: aconst_null
    //   27: astore 16
    //   29: iconst_0
    //   30: newarray <illegal type>
    //   32: astore 17
    //   34: aload 17
    //   36: astore 18
    //   38: iconst_2
    //   39: istore 12
    //   41: iload 6
    //   43: iload 12
    //   45: if_icmpeq +112 -> 157
    //   48: getstatic 14	com/vvt/capture/viber/mode/full/removeFromPath:a	Z
    //   51: istore 12
    //   53: iload 12
    //   55: ifeq +3 -> 58
    //   58: aload_0
    //   59: astore 17
    //   61: aload_0
    //   62: iload 5
    //   64: invokestatic 72	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:removeFromPath	(Lcom/vvt/af/a/a;I)V
    //   67: aload 11
    //   69: ifnonnull +17 -> 86
    //   72: ldc 74
    //   74: astore 16
    //   76: aload_0
    //   77: iload 5
    //   79: aload 16
    //   81: invokestatic 77	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:removeFromPath	(Lcom/vvt/af/a/a;ILjava/lang/String;)Ljava/lang/String;
    //   84: astore 11
    //   86: ldc 79
    //   88: astore 16
    //   90: aload 11
    //   92: astore 17
    //   94: aload 11
    //   96: aload 16
    //   98: invokevirtual 83	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   101: istore 12
    //   103: iload 12
    //   105: ifne +52 -> 157
    //   108: aload_0
    //   109: astore 17
    //   111: aload_0
    //   112: iload 5
    //   114: ldc 85
    //   116: invokestatic 88	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	(Lcom/vvt/af/a/a;ILjava/lang/String;)J
    //   119: l2d
    //   120: ldc2_w 91
    //   123: ddiv
    //   124: dstore 7
    //   126: ldc 94
    //   128: astore 16
    //   130: aload_0
    //   131: iload 5
    //   133: aload 16
    //   135: invokestatic 88	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	(Lcom/vvt/af/a/a;ILjava/lang/String;)J
    //   138: lstore 19
    //   140: lload 19
    //   142: l2d
    //   143: dstore 21
    //   145: ldc2_w 91
    //   148: dstore 23
    //   150: dload 21
    //   152: dload 23
    //   154: ddiv
    //   155: dstore 9
    //   157: ldc 79
    //   159: astore 16
    //   161: aload 11
    //   163: astore 17
    //   165: aload 11
    //   167: aload 16
    //   169: invokevirtual 83	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   172: istore 12
    //   174: iload 12
    //   176: ifeq +122 -> 298
    //   179: new 96	com/vvt/im/events/info/MyUncaughtExceptionHandler
    //   182: astore 16
    //   184: aload 16
    //   186: invokespecial 97	com/vvt/im/events/info/MyUncaughtExceptionHandler:<init>	()V
    //   189: aload 16
    //   191: astore 25
    //   193: getstatic 103	com/vvt/im/events/info/ICallLogData$Direction:OUT	Lcom/vvt/im/events/info/ICallLogData$Direction;
    //   196: astore 16
    //   198: aload 4
    //   200: astore 17
    //   202: aload 4
    //   204: aload 16
    //   206: if_acmpne +138 -> 344
    //   209: iconst_0
    //   210: istore 12
    //   212: aload 13
    //   214: aconst_null
    //   215: invokevirtual 104	com/vvt/im/events/info/f:d	(Ljava/lang/String;)V
    //   218: aload_3
    //   219: invokevirtual 108	com/vvt/im/events/info/d:a	()Ljava/lang/String;
    //   222: astore 16
    //   224: aload 13
    //   226: aload 16
    //   228: invokevirtual 109	com/vvt/im/events/info/f:removeFromPath	(Ljava/lang/String;)V
    //   231: aload_3
    //   232: invokevirtual 112	com/vvt/im/events/info/d:FxFileObserverWorker	()Ljava/lang/String;
    //   235: astore 16
    //   237: aload 13
    //   239: aload 16
    //   241: invokevirtual 114	com/vvt/im/events/info/f:e	(Ljava/lang/String;)V
    //   244: aload 18
    //   246: astore 17
    //   248: aload 13
    //   250: aload 18
    //   252: invokevirtual 115	com/vvt/im/events/info/f:a	([B)V
    //   255: aload_3
    //   256: invokevirtual 117	com/vvt/im/events/info/d:removeFromPath	()Ljava/lang/String;
    //   259: astore 16
    //   261: aload 13
    //   263: aload 16
    //   265: invokevirtual 118	com/vvt/im/events/info/f:a	(Ljava/lang/String;)V
    //   268: aload 13
    //   270: aload 25
    //   272: invokevirtual 121	com/vvt/im/events/info/f:a	(Lcom/vvt/im/events/info/MyUncaughtExceptionHandler;)V
    //   275: getstatic 14	com/vvt/capture/viber/mode/full/removeFromPath:a	Z
    //   278: istore 12
    //   280: iload 12
    //   282: ifeq +3 -> 285
    //   285: getstatic 14	com/vvt/capture/viber/mode/full/removeFromPath:a	Z
    //   288: istore 12
    //   290: iload 12
    //   292: ifeq +3 -> 295
    //   295: aload 13
    //   297: areturn
    //   298: new 96	com/vvt/im/events/info/MyUncaughtExceptionHandler
    //   301: astore 16
    //   303: aload 16
    //   305: invokespecial 97	com/vvt/im/events/info/MyUncaughtExceptionHandler:<init>	()V
    //   308: aload 16
    //   310: dload 7
    //   312: invokevirtual 124	com/vvt/im/events/info/MyUncaughtExceptionHandler:a	(D)V
    //   315: aload 16
    //   317: dload 9
    //   319: invokevirtual 126	com/vvt/im/events/info/MyUncaughtExceptionHandler:removeFromPath	(D)V
    //   322: ldc 127
    //   324: istore 26
    //   326: ldc -128
    //   328: fstore 27
    //   330: aload 16
    //   332: fload 27
    //   334: invokevirtual 131	com/vvt/im/events/info/MyUncaughtExceptionHandler:removeFromPath	(F)V
    //   337: aload 16
    //   339: astore 25
    //   341: goto -148 -> 193
    //   344: aconst_null
    //   345: astore 28
    //   347: aload_0
    //   348: ifnull +455 -> 803
    //   351: ldc -123
    //   353: astore 16
    //   355: iconst_1
    //   356: istore 26
    //   358: ldc 13
    //   360: fstore 27
    //   362: iload 26
    //   364: anewarray 4	java/lang/Object
    //   367: astore 29
    //   369: iconst_0
    //   370: istore 30
    //   372: aconst_null
    //   373: astore 31
    //   375: ldc -121
    //   377: astore 32
    //   379: aload 29
    //   381: iconst_0
    //   382: aload 32
    //   384: aastore
    //   385: aload 16
    //   387: aload 29
    //   389: invokestatic 139	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   392: astore 32
    //   394: ldc -115
    //   396: astore 29
    //   398: iconst_0
    //   399: istore 30
    //   401: aconst_null
    //   402: astore 31
    //   404: iconst_1
    //   405: istore 12
    //   407: iload 12
    //   409: anewarray 24	java/lang/String
    //   412: astore 33
    //   414: iconst_0
    //   415: istore 12
    //   417: aconst_null
    //   418: astore 16
    //   420: iload_2
    //   421: invokestatic 147	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   424: astore 34
    //   426: aload 33
    //   428: iconst_0
    //   429: aload 34
    //   431: aastore
    //   432: aconst_null
    //   433: astore 34
    //   435: aload_0
    //   436: astore 16
    //   438: aload_0
    //   439: aload 29
    //   441: aconst_null
    //   442: aload 32
    //   444: aload 33
    //   446: aconst_null
    //   447: aconst_null
    //   448: aconst_null
    //   449: invokevirtual 152	com/vvt/af/a/a:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   452: astore 16
    //   454: aload 16
    //   456: ifnull +102 -> 558
    //   459: aload 16
    //   461: invokeinterface 158 1 0
    //   466: istore 26
    //   468: iload 26
    //   470: ifeq +88 -> 558
    //   473: ldc -96
    //   475: astore 29
    //   477: aload 16
    //   479: aload 29
    //   481: invokeinterface 164 2 0
    //   486: istore 26
    //   488: aload 16
    //   490: iload 26
    //   492: invokeinterface 167 2 0
    //   497: astore 29
    //   499: ldc -87
    //   501: astore 31
    //   503: aload 16
    //   505: aload 31
    //   507: invokeinterface 164 2 0
    //   512: istore 30
    //   514: aload 16
    //   516: iload 30
    //   518: invokeinterface 167 2 0
    //   523: astore 31
    //   525: ldc -85
    //   527: astore 32
    //   529: aload 16
    //   531: aload 32
    //   533: invokeinterface 164 2 0
    //   538: istore 35
    //   540: aload 16
    //   542: iload 35
    //   544: invokeinterface 167 2 0
    //   549: pop
    //   550: aload 29
    //   552: astore 15
    //   554: aload 31
    //   556: astore 14
    //   558: aload 16
    //   560: ifnull +10 -> 570
    //   563: aload 16
    //   565: invokeinterface 174 1 0
    //   570: aload 15
    //   572: astore 16
    //   574: aload 14
    //   576: astore 29
    //   578: iconst_0
    //   579: ifeq +19 -> 598
    //   582: aconst_null
    //   583: invokevirtual 28	java/lang/String:length	()I
    //   586: istore 30
    //   588: iconst_1
    //   589: istore 35
    //   591: iload 30
    //   593: iload 35
    //   595: if_icmpge +199 -> 794
    //   598: aload 16
    //   600: ifnull +20 -> 620
    //   603: aload 16
    //   605: invokevirtual 28	java/lang/String:length	()I
    //   608: istore 30
    //   610: iconst_1
    //   611: istore 35
    //   613: iload 30
    //   615: iload 35
    //   617: if_icmpge +7 -> 624
    //   620: aload 29
    //   622: astore 16
    //   624: aload 13
    //   626: aload 29
    //   628: invokevirtual 104	com/vvt/im/events/info/f:d	(Ljava/lang/String;)V
    //   631: aload 13
    //   633: aload 16
    //   635: invokevirtual 109	com/vvt/im/events/info/f:removeFromPath	(Ljava/lang/String;)V
    //   638: aload 13
    //   640: aconst_null
    //   641: invokevirtual 114	com/vvt/im/events/info/f:e	(Ljava/lang/String;)V
    //   644: aload 18
    //   646: astore 17
    //   648: aload 13
    //   650: aload 18
    //   652: invokevirtual 115	com/vvt/im/events/info/f:a	([B)V
    //   655: aload 13
    //   657: aload 29
    //   659: invokevirtual 118	com/vvt/im/events/info/f:a	(Ljava/lang/String;)V
    //   662: aload 13
    //   664: aload 25
    //   666: invokevirtual 121	com/vvt/im/events/info/f:a	(Lcom/vvt/im/events/info/MyUncaughtExceptionHandler;)V
    //   669: goto -394 -> 275
    //   672: astore 16
    //   674: iconst_0
    //   675: istore 12
    //   677: aconst_null
    //   678: astore 16
    //   680: iconst_0
    //   681: istore 26
    //   683: aconst_null
    //   684: astore 29
    //   686: fconst_0
    //   687: fstore 27
    //   689: iconst_0
    //   690: istore 30
    //   692: aconst_null
    //   693: astore 31
    //   695: getstatic 14	com/vvt/capture/viber/mode/full/removeFromPath:a	Z
    //   698: istore 35
    //   700: iload 35
    //   702: ifeq +3 -> 705
    //   705: aload 16
    //   707: ifnull +10 -> 717
    //   710: aload 16
    //   712: invokeinterface 174 1 0
    //   717: aload 29
    //   719: astore 16
    //   721: aload 31
    //   723: astore 29
    //   725: goto -147 -> 578
    //   728: astore 16
    //   730: aload 28
    //   732: ifnull +10 -> 742
    //   735: aload 28
    //   737: invokeinterface 174 1 0
    //   742: aload 16
    //   744: athrow
    //   745: astore 29
    //   747: aload 16
    //   749: astore 28
    //   751: aload 29
    //   753: astore 16
    //   755: goto -25 -> 730
    //   758: astore 29
    //   760: iconst_0
    //   761: istore 26
    //   763: aconst_null
    //   764: astore 29
    //   766: fconst_0
    //   767: fstore 27
    //   769: iconst_0
    //   770: istore 30
    //   772: aconst_null
    //   773: astore 31
    //   775: goto -80 -> 695
    //   778: astore 31
    //   780: iconst_0
    //   781: istore 30
    //   783: aconst_null
    //   784: astore 31
    //   786: goto -91 -> 695
    //   789: astore 32
    //   791: goto -96 -> 695
    //   794: iconst_0
    //   795: istore 12
    //   797: aconst_null
    //   798: astore 16
    //   800: goto -202 -> 598
    //   803: iconst_0
    //   804: istore 12
    //   806: aconst_null
    //   807: astore 16
    //   809: goto -251 -> 558
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	812	0	parama	com.vvt.af.a.a
    //   0	812	1	paramString1	String
    //   0	812	2	paramInt1	int
    //   0	812	3	paramd	com.vvt.im.events.info.d
    //   0	812	4	paramDirection	com.vvt.im.events.info.ICallLogData.Direction
    //   0	812	5	paramInt2	int
    //   0	812	6	paramInt3	int
    //   0	812	7	paramDouble1	double
    //   0	812	9	paramDouble2	double
    //   0	812	11	paramString2	String
    //   3	3	12	bool1	boolean
    //   39	7	12	i	int
    //   51	754	12	bool2	boolean
    //   13	650	13	localf	com.vvt.im.events.info.f
    //   21	554	14	localObject1	Object
    //   24	547	15	localObject2	Object
    //   27	607	16	localObject3	Object
    //   672	1	16	localException1	Exception
    //   678	42	16	localObject4	Object
    //   728	20	16	localObject5	Object
    //   753	55	16	localObject6	Object
    //   32	615	17	localObject7	Object
    //   36	615	18	localObject8	Object
    //   138	3	19	l	long
    //   143	8	21	d1	double
    //   148	5	23	d2	double
    //   191	474	25	localObject9	Object
    //   324	39	26	j	int
    //   466	3	26	bool3	boolean
    //   486	276	26	k	int
    //   328	440	27	f	float
    //   345	405	28	localObject10	Object
    //   367	357	29	localObject11	Object
    //   745	7	29	localObject12	Object
    //   758	1	29	localException2	Exception
    //   764	1	29	localObject13	Object
    //   370	412	30	m	int
    //   373	401	31	str1	String
    //   778	1	31	localException3	Exception
    //   784	1	31	localObject14	Object
    //   377	155	32	str2	String
    //   789	1	32	localException4	Exception
    //   412	33	33	arrayOfString	String[]
    //   424	10	34	str3	String
    //   538	80	35	n	int
    //   698	3	35	bool4	boolean
    // Exception table:
    //   from	to	target	type
    //   362	367	672	java/lang/Exception
    //   382	385	672	java/lang/Exception
    //   387	392	672	java/lang/Exception
    //   407	412	672	java/lang/Exception
    //   420	424	672	java/lang/Exception
    //   429	432	672	java/lang/Exception
    //   448	452	672	java/lang/Exception
    //   362	367	728	finally
    //   382	385	728	finally
    //   387	392	728	finally
    //   407	412	728	finally
    //   420	424	728	finally
    //   429	432	728	finally
    //   448	452	728	finally
    //   459	466	745	finally
    //   479	486	745	finally
    //   490	497	745	finally
    //   505	512	745	finally
    //   516	523	745	finally
    //   531	538	745	finally
    //   542	550	745	finally
    //   695	698	745	finally
    //   459	466	758	java/lang/Exception
    //   479	486	758	java/lang/Exception
    //   490	497	758	java/lang/Exception
    //   505	512	778	java/lang/Exception
    //   516	523	778	java/lang/Exception
    //   531	538	789	java/lang/Exception
    //   542	550	789	java/lang/Exception
  }
  
  public static String a()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT ");
    localStringBuilder.append("participants._id, ");
    localStringBuilder.append("participants.conversation_id, ");
    localStringBuilder.append("participants.participant_info_id, ");
    localStringBuilder.append("participants_info.contact_name, ");
    localStringBuilder.append("participants_info.number, ");
    localStringBuilder.append("participants_info.viber_image, ");
    localStringBuilder.append("participants_info.display_name, ");
    localStringBuilder.append("participants_info.participant_type ");
    localStringBuilder.append("FROM participants ");
    localStringBuilder.append("LEFT JOIN (");
    localStringBuilder.append("SELECT participants_info._id as par_id, number, ");
    localStringBuilder.append("display_name, contact_name, viber_image, participant_type ");
    localStringBuilder.append("FROM participants_info");
    localStringBuilder.append(") as participants_info ");
    localStringBuilder.append("ON participants.participant_info_id = participants_info.par_id ");
    localStringBuilder.append("where participants.conversation_id = ? AND participant_type != 0 ");
    return localStringBuilder.toString();
  }
  
  /* Error */
  private static ArrayList a(com.vvt.af.a.a parama, String paramString1, long paramLong1, long paramLong2, long paramLong3, String paramString2, String paramString3, String paramString4, d paramd, com.vvt.base.b paramb)
  {
    // Byte code:
    //   0: new 221	java/util/ArrayList
    //   3: astore 13
    //   5: aload 13
    //   7: invokespecial 222	java/util/ArrayList:<init>	()V
    //   10: iconst_0
    //   11: istore 14
    //   13: fconst_0
    //   14: fstore 15
    //   16: aconst_null
    //   17: astore 16
    //   19: invokestatic 223	com/vvt/capture/viber/mode/full/removeFromPath:removeFromPath	()Ljava/lang/String;
    //   22: astore 17
    //   24: iconst_3
    //   25: istore 18
    //   27: iload 18
    //   29: anewarray 24	java/lang/String
    //   32: astore 19
    //   34: iconst_0
    //   35: istore 20
    //   37: aconst_null
    //   38: astore 21
    //   40: lload_2
    //   41: invokestatic 229	java/lang/Long:toString	(J)Ljava/lang/String;
    //   44: astore 22
    //   46: aload 19
    //   48: iconst_0
    //   49: aload 22
    //   51: aastore
    //   52: iconst_1
    //   53: istore 20
    //   55: lload 4
    //   57: invokestatic 229	java/lang/Long:toString	(J)Ljava/lang/String;
    //   60: astore 22
    //   62: aload 19
    //   64: iload 20
    //   66: aload 22
    //   68: aastore
    //   69: iconst_2
    //   70: istore 20
    //   72: lload 6
    //   74: invokestatic 229	java/lang/Long:toString	(J)Ljava/lang/String;
    //   77: astore 22
    //   79: aload 19
    //   81: iload 20
    //   83: aload 22
    //   85: aastore
    //   86: aload_0
    //   87: aload 17
    //   89: aload 19
    //   91: invokevirtual 232	com/vvt/af/a/a:a	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   94: astore 23
    //   96: aload 23
    //   98: ifnull +1647 -> 1745
    //   101: aload 23
    //   103: invokeinterface 235 1 0
    //   108: istore 14
    //   110: iload 14
    //   112: ifeq +1633 -> 1745
    //   115: ldc -121
    //   117: astore 16
    //   119: aload 23
    //   121: aload 16
    //   123: invokeinterface 164 2 0
    //   128: istore 14
    //   130: aload 23
    //   132: iload 14
    //   134: invokeinterface 239 2 0
    //   139: istore 24
    //   141: ldc -15
    //   143: astore 16
    //   145: aload 23
    //   147: aload 16
    //   149: invokeinterface 164 2 0
    //   154: istore 14
    //   156: aload 23
    //   158: iload 14
    //   160: invokeinterface 167 2 0
    //   165: astore 25
    //   167: ldc 74
    //   169: astore 16
    //   171: aload 23
    //   173: aload 16
    //   175: invokeinterface 164 2 0
    //   180: istore 14
    //   182: aload 23
    //   184: iload 14
    //   186: invokeinterface 167 2 0
    //   191: astore 26
    //   193: ldc -13
    //   195: astore 16
    //   197: aload 23
    //   199: aload 16
    //   201: invokeinterface 164 2 0
    //   206: istore 14
    //   208: aload 23
    //   210: iload 14
    //   212: invokeinterface 167 2 0
    //   217: astore 27
    //   219: ldc -11
    //   221: astore 16
    //   223: aload 23
    //   225: aload 16
    //   227: invokeinterface 164 2 0
    //   232: istore 14
    //   234: aload 23
    //   236: iload 14
    //   238: invokeinterface 239 2 0
    //   243: istore 14
    //   245: iconst_1
    //   246: istore 28
    //   248: iload 14
    //   250: iload 28
    //   252: if_icmpne +835 -> 1087
    //   255: iconst_1
    //   256: istore 14
    //   258: ldc 13
    //   260: fstore 15
    //   262: iload 14
    //   264: istore 29
    //   266: ldc -9
    //   268: astore 16
    //   270: aload 23
    //   272: aload 16
    //   274: invokeinterface 164 2 0
    //   279: istore 14
    //   281: aload 23
    //   283: iload 14
    //   285: invokeinterface 167 2 0
    //   290: astore 30
    //   292: ldc -7
    //   294: astore 16
    //   296: aload 23
    //   298: aload 16
    //   300: invokeinterface 164 2 0
    //   305: istore 14
    //   307: aload 23
    //   309: iload 14
    //   311: invokeinterface 239 2 0
    //   316: istore 18
    //   318: ldc -5
    //   320: astore 16
    //   322: aload 23
    //   324: aload 16
    //   326: invokeinterface 164 2 0
    //   331: istore 14
    //   333: aload 23
    //   335: iload 14
    //   337: invokeinterface 167 2 0
    //   342: pop
    //   343: ldc -3
    //   345: astore 16
    //   347: aload 23
    //   349: aload 16
    //   351: invokeinterface 164 2 0
    //   356: istore 14
    //   358: aload 23
    //   360: iload 14
    //   362: invokeinterface 257 2 0
    //   367: lstore 31
    //   369: ldc_w 259
    //   372: astore 16
    //   374: aload 23
    //   376: aload 16
    //   378: invokeinterface 164 2 0
    //   383: istore 14
    //   385: aload 23
    //   387: iload 14
    //   389: invokeinterface 239 2 0
    //   394: istore 33
    //   396: ldc_w 261
    //   399: astore 16
    //   401: aload 23
    //   403: aload 16
    //   405: invokeinterface 164 2 0
    //   410: istore 14
    //   412: aload 23
    //   414: iload 14
    //   416: invokeinterface 239 2 0
    //   421: istore 14
    //   423: iload 14
    //   425: ifne +677 -> 1102
    //   428: getstatic 264	com/vvt/im/events/info/ICallLogData$Direction:IN	Lcom/vvt/im/events/info/ICallLogData$Direction;
    //   431: astore 22
    //   433: ldc_w 266
    //   436: astore 16
    //   438: aload 23
    //   440: aload 16
    //   442: invokeinterface 164 2 0
    //   447: istore 14
    //   449: aload 23
    //   451: iload 14
    //   453: invokeinterface 167 2 0
    //   458: astore 34
    //   460: ldc_w 268
    //   463: astore 16
    //   465: aload 23
    //   467: aload 16
    //   469: invokeinterface 164 2 0
    //   474: istore 14
    //   476: aload 23
    //   478: iload 14
    //   480: invokeinterface 167 2 0
    //   485: pop
    //   486: ldc 85
    //   488: astore 16
    //   490: aload 23
    //   492: aload 16
    //   494: invokeinterface 164 2 0
    //   499: istore 14
    //   501: aload 23
    //   503: iload 14
    //   505: invokeinterface 257 2 0
    //   510: lstore 35
    //   512: lload 35
    //   514: l2d
    //   515: dstore 37
    //   517: dload 37
    //   519: ldc2_w 91
    //   522: ddiv
    //   523: dstore 39
    //   525: ldc 94
    //   527: astore 16
    //   529: aload 23
    //   531: aload 16
    //   533: invokeinterface 164 2 0
    //   538: istore 14
    //   540: aload 23
    //   542: iload 14
    //   544: invokeinterface 257 2 0
    //   549: lstore 35
    //   551: lload 35
    //   553: l2d
    //   554: dstore 37
    //   556: dload 37
    //   558: ldc2_w 91
    //   561: ddiv
    //   562: dstore 41
    //   564: ldc_w 270
    //   567: astore 16
    //   569: aload 23
    //   571: aload 16
    //   573: invokeinterface 164 2 0
    //   578: istore 14
    //   580: aload 23
    //   582: iload 14
    //   584: invokeinterface 257 2 0
    //   589: lstore 43
    //   591: ldc_w 272
    //   594: astore 16
    //   596: aload 23
    //   598: aload 16
    //   600: invokeinterface 164 2 0
    //   605: istore 14
    //   607: aload 23
    //   609: iload 14
    //   611: invokeinterface 167 2 0
    //   616: astore 17
    //   618: ldc_w 274
    //   621: astore 16
    //   623: aload 23
    //   625: aload 16
    //   627: invokeinterface 164 2 0
    //   632: istore 14
    //   634: aload 23
    //   636: iload 14
    //   638: invokeinterface 167 2 0
    //   643: astore 45
    //   645: ldc_w 276
    //   648: astore 16
    //   650: aload 23
    //   652: aload 16
    //   654: invokeinterface 164 2 0
    //   659: istore 14
    //   661: aload 23
    //   663: iload 14
    //   665: invokeinterface 167 2 0
    //   670: astore 46
    //   672: ldc_w 278
    //   675: astore 16
    //   677: aload 23
    //   679: aload 16
    //   681: invokeinterface 164 2 0
    //   686: istore 14
    //   688: aload 23
    //   690: iload 14
    //   692: invokeinterface 239 2 0
    //   697: pop
    //   698: iconst_0
    //   699: istore 14
    //   701: fconst_0
    //   702: fstore 15
    //   704: aconst_null
    //   705: astore 16
    //   707: aload 26
    //   709: ifnull +22 -> 731
    //   712: aload 26
    //   714: invokevirtual 28	java/lang/String:length	()I
    //   717: istore 20
    //   719: iload 20
    //   721: ifle +10 -> 731
    //   724: aload 26
    //   726: invokestatic 284	com/vvt/capture/viber/mode/full/ViberMessageType:forValue	(Ljava/lang/String;)Lcom/vvt/capture/viber/mode/full/ViberMessageType;
    //   729: astore 16
    //   731: aload 17
    //   733: ifnull +1078 -> 1811
    //   736: getstatic 103	com/vvt/im/events/info/ICallLogData$Direction:OUT	Lcom/vvt/im/events/info/ICallLogData$Direction;
    //   739: astore 21
    //   741: aload 22
    //   743: aload 21
    //   745: if_acmpne +1066 -> 1811
    //   748: getstatic 288	com/vvt/capture/viber/mode/full/ViberMessageType:VIDEO_WINK	Lcom/vvt/capture/viber/mode/full/ViberMessageType;
    //   751: astore 21
    //   753: aload 16
    //   755: aload 21
    //   757: if_acmpne +353 -> 1110
    //   760: ldc_w 290
    //   763: astore 21
    //   765: ldc_w 292
    //   768: astore 47
    //   770: aload 17
    //   772: aload 21
    //   774: aload 47
    //   776: invokevirtual 296	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   779: astore 17
    //   781: aload 17
    //   783: astore 48
    //   785: aload 16
    //   787: ifnonnull +1017 -> 1804
    //   790: getstatic 299	com/vvt/capture/viber/mode/full/ViberMessageType:TEXT	Lcom/vvt/capture/viber/mode/full/ViberMessageType;
    //   793: astore 16
    //   795: aload 16
    //   797: astore 47
    //   799: getstatic 302	com/vvt/capture/viber/mode/full/ViberMessageType:CALL	Lcom/vvt/capture/viber/mode/full/ViberMessageType;
    //   802: astore 16
    //   804: aload 47
    //   806: aload 16
    //   808: if_acmpeq -707 -> 101
    //   811: aload_1
    //   812: aload 8
    //   814: aload 9
    //   816: aload 10
    //   818: invokestatic 305	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/vvt/im/events/info/d;
    //   821: astore 21
    //   823: new 307	java/text/SimpleDateFormat
    //   826: astore 16
    //   828: ldc_w 309
    //   831: astore 17
    //   833: aload 16
    //   835: aload 17
    //   837: invokespecial 311	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   840: new 313	java/util/Date
    //   843: astore 17
    //   845: aload 17
    //   847: lload 31
    //   849: invokespecial 316	java/util/Date:<init>	(J)V
    //   852: aload 16
    //   854: aload 17
    //   856: invokevirtual 319	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   859: astore 49
    //   861: aload_0
    //   862: astore 16
    //   864: aload_1
    //   865: astore 17
    //   867: aload_0
    //   868: aload_1
    //   869: iload 18
    //   871: aload 21
    //   873: aload 22
    //   875: iload 24
    //   877: iload 33
    //   879: dload 39
    //   881: dload 41
    //   883: aload 26
    //   885: invokestatic 322	com/vvt/capture/viber/mode/full/removeFromPath:a	(Lcom/vvt/af/a/a;Ljava/lang/String;ILcom/vvt/im/events/info/d;Lcom/vvt/im/events/info/ICallLogData$Direction;IIDDLjava/lang/String;)Lcom/vvt/im/events/info/f;
    //   888: astore 50
    //   890: new 221	java/util/ArrayList
    //   893: astore 16
    //   895: aload 16
    //   897: invokespecial 222	java/util/ArrayList:<init>	()V
    //   900: aload 12
    //   902: invokevirtual 327	com/vvt/base/removeFromPath:f	()Ljava/lang/String;
    //   905: astore 16
    //   907: aload_0
    //   908: aload_1
    //   909: aload 25
    //   911: aload 11
    //   913: aload 16
    //   915: invokestatic 330	com/vvt/capture/viber/mode/full/removeFromPath:a	(Lcom/vvt/af/a/a;Ljava/lang/String;Ljava/lang/String;Lcom/vvt/AppEngine1/d;Ljava/lang/String;)Ljava/util/List;
    //   918: astore 25
    //   920: aload 27
    //   922: iload 29
    //   924: aload 30
    //   926: aload_1
    //   927: aload 25
    //   929: invokestatic 333	com/vvt/capture/viber/mode/full/removeFromPath:a	(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/vvt/im/events/info/removeFromPath;
    //   932: astore 27
    //   934: new 96	com/vvt/im/events/info/MyUncaughtExceptionHandler
    //   937: astore 16
    //   939: aload 16
    //   941: invokespecial 97	com/vvt/im/events/info/MyUncaughtExceptionHandler:<init>	()V
    //   944: new 221	java/util/ArrayList
    //   947: astore 17
    //   949: aload 17
    //   951: invokespecial 222	java/util/ArrayList:<init>	()V
    //   954: getstatic 336	com/vvt/capture/viber/mode/full/ViberMessageType:IMAGE	Lcom/vvt/capture/viber/mode/full/ViberMessageType;
    //   957: astore 19
    //   959: aload 47
    //   961: aload 19
    //   963: if_acmpeq +39 -> 1002
    //   966: getstatic 339	com/vvt/capture/viber/mode/full/ViberMessageType:VIDEO	Lcom/vvt/capture/viber/mode/full/ViberMessageType;
    //   969: astore 19
    //   971: aload 47
    //   973: aload 19
    //   975: if_acmpeq +27 -> 1002
    //   978: getstatic 342	com/vvt/capture/viber/mode/full/ViberMessageType:IMAGE_WINK	Lcom/vvt/capture/viber/mode/full/ViberMessageType;
    //   981: astore 19
    //   983: aload 47
    //   985: aload 19
    //   987: if_acmpeq +15 -> 1002
    //   990: getstatic 288	com/vvt/capture/viber/mode/full/ViberMessageType:VIDEO_WINK	Lcom/vvt/capture/viber/mode/full/ViberMessageType;
    //   993: astore 19
    //   995: aload 47
    //   997: aload 19
    //   999: if_acmpne +163 -> 1162
    //   1002: aload 11
    //   1004: invokeinterface 347 1 0
    //   1009: astore 45
    //   1011: aload_0
    //   1012: astore 51
    //   1014: aload_1
    //   1015: astore 52
    //   1017: aload 34
    //   1019: astore 53
    //   1021: aload 47
    //   1023: astore 26
    //   1025: aload 12
    //   1027: astore 34
    //   1029: aload_0
    //   1030: aload_1
    //   1031: aload 53
    //   1033: aload 48
    //   1035: iload 24
    //   1037: aload 47
    //   1039: aload 45
    //   1041: aload 12
    //   1043: invokestatic 350	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	(Lcom/vvt/af/a/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/vvt/capture/viber/mode/full/ViberMessageType;Landroid/content/Context;Lcom/vvt/base/removeFromPath;)Ljava/util/List;
    //   1046: astore 17
    //   1048: aload 17
    //   1050: invokeinterface 52 1 0
    //   1055: istore 18
    //   1057: iload 18
    //   1059: ifgt +738 -> 1797
    //   1062: aload 46
    //   1064: invokestatic 355	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   1067: istore 18
    //   1069: iload 18
    //   1071: ifeq +726 -> 1797
    //   1074: getstatic 14	com/vvt/capture/viber/mode/full/removeFromPath:a	Z
    //   1077: istore 14
    //   1079: iload 14
    //   1081: ifeq -980 -> 101
    //   1084: goto -983 -> 101
    //   1087: iconst_0
    //   1088: istore 14
    //   1090: fconst_0
    //   1091: fstore 15
    //   1093: aconst_null
    //   1094: astore 16
    //   1096: iconst_0
    //   1097: istore 29
    //   1099: goto -833 -> 266
    //   1102: getstatic 103	com/vvt/im/events/info/ICallLogData$Direction:OUT	Lcom/vvt/im/events/info/ICallLogData$Direction;
    //   1105: astore 22
    //   1107: goto -674 -> 433
    //   1110: getstatic 342	com/vvt/capture/viber/mode/full/ViberMessageType:IMAGE_WINK	Lcom/vvt/capture/viber/mode/full/ViberMessageType;
    //   1113: astore 21
    //   1115: aload 16
    //   1117: aload 21
    //   1119: if_acmpne +692 -> 1811
    //   1122: getstatic 103	com/vvt/im/events/info/ICallLogData$Direction:OUT	Lcom/vvt/im/events/info/ICallLogData$Direction;
    //   1125: astore 21
    //   1127: aload 22
    //   1129: aload 21
    //   1131: if_acmpne +680 -> 1811
    //   1134: ldc_w 290
    //   1137: astore 21
    //   1139: ldc_w 292
    //   1142: astore 47
    //   1144: aload 17
    //   1146: aload 21
    //   1148: aload 47
    //   1150: invokevirtual 296	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1153: astore 17
    //   1155: aload 17
    //   1157: astore 48
    //   1159: goto -374 -> 785
    //   1162: getstatic 358	com/vvt/capture/viber/mode/full/ViberMessageType:AUDIO	Lcom/vvt/capture/viber/mode/full/ViberMessageType;
    //   1165: astore 19
    //   1167: aload 47
    //   1169: aload 19
    //   1171: if_acmpeq -1070 -> 101
    //   1174: getstatic 361	com/vvt/capture/viber/mode/full/ViberMessageType:LOCATION	Lcom/vvt/capture/viber/mode/full/ViberMessageType;
    //   1177: astore 19
    //   1179: aload 47
    //   1181: aload 19
    //   1183: if_acmpne +421 -> 1604
    //   1186: lconst_0
    //   1187: lstore 43
    //   1189: dconst_0
    //   1190: dstore 54
    //   1192: dload 39
    //   1194: dload 54
    //   1196: dcmpl
    //   1197: istore 18
    //   1199: iload 18
    //   1201: ifeq +279 -> 1480
    //   1204: lconst_0
    //   1205: lstore 43
    //   1207: dconst_0
    //   1208: dstore 54
    //   1210: dload 41
    //   1212: dload 54
    //   1214: dcmpl
    //   1215: istore 18
    //   1217: iload 18
    //   1219: ifeq +261 -> 1480
    //   1222: aload 45
    //   1224: ifnonnull +566 -> 1790
    //   1227: getstatic 14	com/vvt/capture/viber/mode/full/removeFromPath:a	Z
    //   1230: istore 18
    //   1232: iload 18
    //   1234: ifeq +3 -> 1237
    //   1237: ldc_w 274
    //   1240: astore 19
    //   1242: iconst_1
    //   1243: istore 33
    //   1245: ldc 13
    //   1247: fstore 56
    //   1249: aload_0
    //   1250: iload 24
    //   1252: aload 19
    //   1254: iload 33
    //   1256: invokestatic 364	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	(Lcom/vvt/af/a/a;ILjava/lang/String;I)Ljava/lang/String;
    //   1259: astore 19
    //   1261: aload 16
    //   1263: dload 39
    //   1265: invokevirtual 124	com/vvt/im/events/info/MyUncaughtExceptionHandler:a	(D)V
    //   1268: aload 16
    //   1270: dload 41
    //   1272: invokevirtual 126	com/vvt/im/events/info/MyUncaughtExceptionHandler:removeFromPath	(D)V
    //   1275: ldc 127
    //   1277: istore 33
    //   1279: ldc -128
    //   1281: fstore 56
    //   1283: aload 16
    //   1285: fload 56
    //   1287: invokevirtual 131	com/vvt/im/events/info/MyUncaughtExceptionHandler:removeFromPath	(F)V
    //   1290: aload 16
    //   1292: aload 19
    //   1294: invokevirtual 365	com/vvt/im/events/info/MyUncaughtExceptionHandler:a	(Ljava/lang/String;)V
    //   1297: getstatic 14	com/vvt/capture/viber/mode/full/removeFromPath:a	Z
    //   1300: istore 18
    //   1302: iload 18
    //   1304: ifeq +479 -> 1783
    //   1307: aload 34
    //   1309: astore 19
    //   1311: aload 19
    //   1313: aload 47
    //   1315: invokestatic 368	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Lcom/vvt/capture/viber/mode/full/ViberMessageType;)I
    //   1318: istore 33
    //   1320: new 370	com/vvt/capture/viber/d
    //   1323: astore 52
    //   1325: aload 52
    //   1327: invokespecial 371	com/vvt/capture/viber/d:<init>	()V
    //   1330: aload 52
    //   1332: iload 29
    //   1334: invokevirtual 374	com/vvt/capture/viber/d:a	(Z)V
    //   1337: aload 52
    //   1339: iload 33
    //   1341: invokevirtual 377	com/vvt/capture/viber/d:a	(I)V
    //   1344: aload 52
    //   1346: aload 19
    //   1348: invokevirtual 378	com/vvt/capture/viber/d:a	(Ljava/lang/String;)V
    //   1351: aload 52
    //   1353: aload 49
    //   1355: invokevirtual 379	com/vvt/capture/viber/d:removeFromPath	(Ljava/lang/String;)V
    //   1358: iload 24
    //   1360: invokestatic 147	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   1363: astore 19
    //   1365: aload 52
    //   1367: aload 19
    //   1369: invokevirtual 380	com/vvt/capture/viber/d:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   1372: aload 52
    //   1374: aload 21
    //   1376: invokevirtual 383	com/vvt/capture/viber/d:a	(Lcom/vvt/im/events/info/d;)V
    //   1379: aload 52
    //   1381: aload 25
    //   1383: invokevirtual 386	com/vvt/capture/viber/d:a	(Ljava/util/List;)V
    //   1386: aload 52
    //   1388: aload 50
    //   1390: invokevirtual 389	com/vvt/capture/viber/d:a	(Lcom/vvt/im/events/info/f;)V
    //   1393: aload 52
    //   1395: aload 27
    //   1397: invokevirtual 392	com/vvt/capture/viber/d:a	(Lcom/vvt/im/events/info/removeFromPath;)V
    //   1400: aload 52
    //   1402: lload 31
    //   1404: invokevirtual 394	com/vvt/capture/viber/d:removeFromPath	(J)V
    //   1407: aload 52
    //   1409: aload 22
    //   1411: invokevirtual 397	com/vvt/capture/viber/d:a	(Lcom/vvt/im/events/info/ICallLogData$Direction;)V
    //   1414: aload 52
    //   1416: aload 17
    //   1418: invokevirtual 399	com/vvt/capture/viber/d:removeFromPath	(Ljava/util/List;)V
    //   1421: aload 52
    //   1423: aload 16
    //   1425: invokevirtual 400	com/vvt/capture/viber/d:a	(Lcom/vvt/im/events/info/MyUncaughtExceptionHandler;)V
    //   1428: getstatic 14	com/vvt/capture/viber/mode/full/removeFromPath:a	Z
    //   1431: istore 14
    //   1433: iload 14
    //   1435: ifeq +3 -> 1438
    //   1438: aload 13
    //   1440: aload 52
    //   1442: invokevirtual 403	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1445: pop
    //   1446: goto -1345 -> 101
    //   1449: astore 16
    //   1451: aload 23
    //   1453: astore 16
    //   1455: getstatic 22	com/vvt/capture/viber/mode/full/removeFromPath:MyUncaughtExceptionHandler	Z
    //   1458: istore 28
    //   1460: iload 28
    //   1462: ifeq +3 -> 1465
    //   1465: aload 16
    //   1467: ifnull +10 -> 1477
    //   1470: aload 16
    //   1472: invokeinterface 174 1 0
    //   1477: aload 13
    //   1479: areturn
    //   1480: aload_0
    //   1481: iload 24
    //   1483: invokestatic 406	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	(Lcom/vvt/af/a/a;I)Lcom/vvt/im/events/info/MyUncaughtExceptionHandler;
    //   1486: astore 19
    //   1488: iconst_0
    //   1489: istore 14
    //   1491: fconst_0
    //   1492: fstore 15
    //   1494: aload 19
    //   1496: astore 16
    //   1498: iconst_0
    //   1499: istore 18
    //   1501: aconst_null
    //   1502: astore 19
    //   1504: aload 16
    //   1506: invokevirtual 409	com/vvt/im/events/info/MyUncaughtExceptionHandler:a	()D
    //   1509: dstore 57
    //   1511: dconst_0
    //   1512: dstore 59
    //   1514: dload 57
    //   1516: dload 59
    //   1518: dcmpl
    //   1519: istore 33
    //   1521: iload 33
    //   1523: ifne -226 -> 1297
    //   1526: aload 16
    //   1528: invokevirtual 411	com/vvt/im/events/info/MyUncaughtExceptionHandler:removeFromPath	()D
    //   1531: dstore 57
    //   1533: dconst_0
    //   1534: dstore 59
    //   1536: dload 57
    //   1538: dload 59
    //   1540: dcmpl
    //   1541: istore 33
    //   1543: iload 33
    //   1545: ifne -248 -> 1297
    //   1548: bipush 18
    //   1550: istore 33
    //   1552: ldc_w 412
    //   1555: fstore 56
    //   1557: iload 18
    //   1559: iload 33
    //   1561: if_icmpge -264 -> 1297
    //   1564: ldc2_w 413
    //   1567: lstore 61
    //   1569: ldc2_w 415
    //   1572: dstore 57
    //   1574: lload 61
    //   1576: invokestatic 421	android/os/SystemClock:sleep	(J)V
    //   1579: aload_0
    //   1580: iload 24
    //   1582: invokestatic 406	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	(Lcom/vvt/af/a/a;I)Lcom/vvt/im/events/info/MyUncaughtExceptionHandler;
    //   1585: astore 51
    //   1587: iload 18
    //   1589: iconst_1
    //   1590: iadd
    //   1591: istore 14
    //   1593: iload 14
    //   1595: istore 18
    //   1597: aload 51
    //   1599: astore 16
    //   1601: goto -97 -> 1504
    //   1604: getstatic 424	com/vvt/capture/viber/mode/full/ViberMessageType:STICKER	Lcom/vvt/capture/viber/mode/full/ViberMessageType;
    //   1607: astore 19
    //   1609: aload 47
    //   1611: aload 19
    //   1613: if_acmpne +38 -> 1651
    //   1616: iconst_0
    //   1617: istore 18
    //   1619: aconst_null
    //   1620: astore 19
    //   1622: aload 12
    //   1624: invokevirtual 327	com/vvt/base/removeFromPath:f	()Ljava/lang/String;
    //   1627: astore 26
    //   1629: aload_0
    //   1630: astore 51
    //   1632: aload_1
    //   1633: astore 52
    //   1635: aload_0
    //   1636: aload_1
    //   1637: lload 43
    //   1639: iload 24
    //   1641: aload 26
    //   1643: invokestatic 427	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	(Lcom/vvt/af/a/a;Ljava/lang/String;JILjava/lang/String;)Ljava/util/List;
    //   1646: astore 17
    //   1648: goto -337 -> 1311
    //   1651: getstatic 430	com/vvt/capture/viber/mode/full/ViberMessageType:CONTACT	Lcom/vvt/capture/viber/mode/full/ViberMessageType;
    //   1654: astore 19
    //   1656: aload 47
    //   1658: aload 19
    //   1660: if_acmpne +13 -> 1673
    //   1663: aload 34
    //   1665: invokestatic 433	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:removeFromPath	(Ljava/lang/String;)Ljava/lang/String;
    //   1668: astore 19
    //   1670: goto -359 -> 1311
    //   1673: getstatic 436	com/vvt/capture/viber/mode/full/ViberMessageType:FILE	Lcom/vvt/capture/viber/mode/full/ViberMessageType;
    //   1676: astore 19
    //   1678: aload 47
    //   1680: aload 19
    //   1682: if_acmpne +101 -> 1783
    //   1685: aload_0
    //   1686: astore 51
    //   1688: aload_1
    //   1689: astore 52
    //   1691: aload 48
    //   1693: astore 53
    //   1695: aload 12
    //   1697: astore 26
    //   1699: aload_0
    //   1700: aload_1
    //   1701: aload 48
    //   1703: iload 24
    //   1705: aload 34
    //   1707: aload 12
    //   1709: invokestatic 439	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	(Lcom/vvt/af/a/a;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/vvt/base/removeFromPath;)Ljava/util/List;
    //   1712: astore 17
    //   1714: aload 34
    //   1716: astore 19
    //   1718: goto -407 -> 1311
    //   1721: astore 17
    //   1723: aconst_null
    //   1724: astore 23
    //   1726: aload 17
    //   1728: astore 16
    //   1730: aload 23
    //   1732: ifnull +10 -> 1742
    //   1735: aload 23
    //   1737: invokeinterface 174 1 0
    //   1742: aload 16
    //   1744: athrow
    //   1745: aload 23
    //   1747: ifnull -270 -> 1477
    //   1750: aload 23
    //   1752: invokeinterface 174 1 0
    //   1757: goto -280 -> 1477
    //   1760: astore 16
    //   1762: goto -32 -> 1730
    //   1765: astore 17
    //   1767: aload 16
    //   1769: astore 23
    //   1771: aload 17
    //   1773: astore 16
    //   1775: goto -45 -> 1730
    //   1778: astore 17
    //   1780: goto -325 -> 1455
    //   1783: aload 34
    //   1785: astore 19
    //   1787: goto -476 -> 1311
    //   1790: aload 45
    //   1792: astore 19
    //   1794: goto -533 -> 1261
    //   1797: aload 46
    //   1799: astore 19
    //   1801: goto -490 -> 1311
    //   1804: aload 16
    //   1806: astore 47
    //   1808: goto -1009 -> 799
    //   1811: aload 17
    //   1813: astore 48
    //   1815: goto -1030 -> 785
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1818	0	parama	com.vvt.af.a.a
    //   0	1818	1	paramString1	String
    //   0	1818	2	paramLong1	long
    //   0	1818	4	paramLong2	long
    //   0	1818	6	paramLong3	long
    //   0	1818	8	paramString2	String
    //   0	1818	9	paramString3	String
    //   0	1818	10	paramString4	String
    //   0	1818	11	paramd	d
    //   0	1818	12	paramb	com.vvt.base.removeFromPath
    //   3	1475	13	localArrayList	ArrayList
    //   11	100	14	bool1	boolean
    //   128	572	14	i	int
    //   1077	413	14	bool2	boolean
    //   1591	3	14	j	int
    //   14	1479	15	f1	float
    //   17	1407	16	localObject1	Object
    //   1449	1	16	localException1	Exception
    //   1453	290	16	localObject2	Object
    //   1760	8	16	localObject3	Object
    //   1773	32	16	localObject4	Object
    //   22	1691	17	localObject5	Object
    //   1721	6	17	localObject6	Object
    //   1765	7	17	localObject7	Object
    //   1778	34	17	localException2	Exception
    //   25	1033	18	k	int
    //   1067	551	18	m	int
    //   32	1768	19	localObject8	Object
    //   35	685	20	n	int
    //   38	1337	21	localObject9	Object
    //   44	1366	22	localObject10	Object
    //   94	1676	23	localObject11	Object
    //   139	1565	24	i1	int
    //   165	1217	25	localObject12	Object
    //   191	1507	26	localObject13	Object
    //   217	1179	27	localObject14	Object
    //   246	7	28	i2	int
    //   1458	3	28	bool3	boolean
    //   264	659	29	i3	int
    //   1097	236	29	bool4	boolean
    //   290	635	30	str1	String
    //   367	1036	31	l1	long
    //   394	946	33	i4	int
    //   1519	25	33	bool5	boolean
    //   1550	12	33	i5	int
    //   458	1326	34	localObject15	Object
    //   510	42	35	l2	long
    //   515	42	37	d1	double
    //   523	741	39	d2	double
    //   562	709	41	d3	double
    //   589	1049	43	l3	long
    //   643	1148	45	localObject16	Object
    //   670	1128	46	str2	String
    //   768	1039	47	localObject17	Object
    //   783	1031	48	localObject18	Object
    //   859	495	49	str3	String
    //   888	501	50	localf	com.vvt.im.events.info.f
    //   1012	675	51	localObject19	Object
    //   1015	675	52	localObject20	Object
    //   1019	675	53	localObject21	Object
    //   1190	23	54	d4	double
    //   1247	309	56	f2	float
    //   1509	64	57	d5	double
    //   1512	27	59	d6	double
    //   1567	8	61	l4	long
    // Exception table:
    //   from	to	target	type
    //   101	108	1449	java/lang/Exception
    //   121	128	1449	java/lang/Exception
    //   132	139	1449	java/lang/Exception
    //   147	154	1449	java/lang/Exception
    //   158	165	1449	java/lang/Exception
    //   173	180	1449	java/lang/Exception
    //   184	191	1449	java/lang/Exception
    //   199	206	1449	java/lang/Exception
    //   210	217	1449	java/lang/Exception
    //   225	232	1449	java/lang/Exception
    //   236	243	1449	java/lang/Exception
    //   272	279	1449	java/lang/Exception
    //   283	290	1449	java/lang/Exception
    //   298	305	1449	java/lang/Exception
    //   309	316	1449	java/lang/Exception
    //   324	331	1449	java/lang/Exception
    //   335	343	1449	java/lang/Exception
    //   349	356	1449	java/lang/Exception
    //   360	367	1449	java/lang/Exception
    //   376	383	1449	java/lang/Exception
    //   387	394	1449	java/lang/Exception
    //   403	410	1449	java/lang/Exception
    //   414	421	1449	java/lang/Exception
    //   428	431	1449	java/lang/Exception
    //   440	447	1449	java/lang/Exception
    //   451	458	1449	java/lang/Exception
    //   467	474	1449	java/lang/Exception
    //   478	486	1449	java/lang/Exception
    //   492	499	1449	java/lang/Exception
    //   503	510	1449	java/lang/Exception
    //   531	538	1449	java/lang/Exception
    //   542	549	1449	java/lang/Exception
    //   571	578	1449	java/lang/Exception
    //   582	589	1449	java/lang/Exception
    //   598	605	1449	java/lang/Exception
    //   609	616	1449	java/lang/Exception
    //   625	632	1449	java/lang/Exception
    //   636	643	1449	java/lang/Exception
    //   652	659	1449	java/lang/Exception
    //   663	670	1449	java/lang/Exception
    //   679	686	1449	java/lang/Exception
    //   690	698	1449	java/lang/Exception
    //   712	717	1449	java/lang/Exception
    //   724	729	1449	java/lang/Exception
    //   736	739	1449	java/lang/Exception
    //   748	751	1449	java/lang/Exception
    //   774	779	1449	java/lang/Exception
    //   790	793	1449	java/lang/Exception
    //   799	802	1449	java/lang/Exception
    //   816	821	1449	java/lang/Exception
    //   823	826	1449	java/lang/Exception
    //   835	840	1449	java/lang/Exception
    //   840	843	1449	java/lang/Exception
    //   847	852	1449	java/lang/Exception
    //   854	859	1449	java/lang/Exception
    //   883	888	1449	java/lang/Exception
    //   890	893	1449	java/lang/Exception
    //   895	900	1449	java/lang/Exception
    //   900	905	1449	java/lang/Exception
    //   913	918	1449	java/lang/Exception
    //   927	932	1449	java/lang/Exception
    //   934	937	1449	java/lang/Exception
    //   939	944	1449	java/lang/Exception
    //   944	947	1449	java/lang/Exception
    //   949	954	1449	java/lang/Exception
    //   954	957	1449	java/lang/Exception
    //   966	969	1449	java/lang/Exception
    //   978	981	1449	java/lang/Exception
    //   990	993	1449	java/lang/Exception
    //   1002	1009	1449	java/lang/Exception
    //   1041	1046	1449	java/lang/Exception
    //   1048	1055	1449	java/lang/Exception
    //   1062	1067	1449	java/lang/Exception
    //   1074	1077	1449	java/lang/Exception
    //   1102	1105	1449	java/lang/Exception
    //   1110	1113	1449	java/lang/Exception
    //   1122	1125	1449	java/lang/Exception
    //   1148	1153	1449	java/lang/Exception
    //   1162	1165	1449	java/lang/Exception
    //   1174	1177	1449	java/lang/Exception
    //   1227	1230	1449	java/lang/Exception
    //   1254	1259	1449	java/lang/Exception
    //   1263	1268	1449	java/lang/Exception
    //   1270	1275	1449	java/lang/Exception
    //   1285	1290	1449	java/lang/Exception
    //   1292	1297	1449	java/lang/Exception
    //   1297	1300	1449	java/lang/Exception
    //   1313	1318	1449	java/lang/Exception
    //   1320	1323	1449	java/lang/Exception
    //   1325	1330	1449	java/lang/Exception
    //   1332	1337	1449	java/lang/Exception
    //   1339	1344	1449	java/lang/Exception
    //   1346	1351	1449	java/lang/Exception
    //   1353	1358	1449	java/lang/Exception
    //   1358	1363	1449	java/lang/Exception
    //   1367	1372	1449	java/lang/Exception
    //   1374	1379	1449	java/lang/Exception
    //   1381	1386	1449	java/lang/Exception
    //   1388	1393	1449	java/lang/Exception
    //   1395	1400	1449	java/lang/Exception
    //   1402	1407	1449	java/lang/Exception
    //   1409	1414	1449	java/lang/Exception
    //   1416	1421	1449	java/lang/Exception
    //   1423	1428	1449	java/lang/Exception
    //   1428	1431	1449	java/lang/Exception
    //   1440	1446	1449	java/lang/Exception
    //   1481	1486	1449	java/lang/Exception
    //   1504	1509	1449	java/lang/Exception
    //   1526	1531	1449	java/lang/Exception
    //   1574	1579	1449	java/lang/Exception
    //   1580	1585	1449	java/lang/Exception
    //   1604	1607	1449	java/lang/Exception
    //   1622	1627	1449	java/lang/Exception
    //   1641	1646	1449	java/lang/Exception
    //   1651	1654	1449	java/lang/Exception
    //   1663	1668	1449	java/lang/Exception
    //   1673	1676	1449	java/lang/Exception
    //   1707	1712	1449	java/lang/Exception
    //   19	22	1721	finally
    //   27	32	1721	finally
    //   40	44	1721	finally
    //   49	52	1721	finally
    //   55	60	1721	finally
    //   66	69	1721	finally
    //   72	77	1721	finally
    //   83	86	1721	finally
    //   89	94	1721	finally
    //   101	108	1760	finally
    //   121	128	1760	finally
    //   132	139	1760	finally
    //   147	154	1760	finally
    //   158	165	1760	finally
    //   173	180	1760	finally
    //   184	191	1760	finally
    //   199	206	1760	finally
    //   210	217	1760	finally
    //   225	232	1760	finally
    //   236	243	1760	finally
    //   272	279	1760	finally
    //   283	290	1760	finally
    //   298	305	1760	finally
    //   309	316	1760	finally
    //   324	331	1760	finally
    //   335	343	1760	finally
    //   349	356	1760	finally
    //   360	367	1760	finally
    //   376	383	1760	finally
    //   387	394	1760	finally
    //   403	410	1760	finally
    //   414	421	1760	finally
    //   428	431	1760	finally
    //   440	447	1760	finally
    //   451	458	1760	finally
    //   467	474	1760	finally
    //   478	486	1760	finally
    //   492	499	1760	finally
    //   503	510	1760	finally
    //   531	538	1760	finally
    //   542	549	1760	finally
    //   571	578	1760	finally
    //   582	589	1760	finally
    //   598	605	1760	finally
    //   609	616	1760	finally
    //   625	632	1760	finally
    //   636	643	1760	finally
    //   652	659	1760	finally
    //   663	670	1760	finally
    //   679	686	1760	finally
    //   690	698	1760	finally
    //   712	717	1760	finally
    //   724	729	1760	finally
    //   736	739	1760	finally
    //   748	751	1760	finally
    //   774	779	1760	finally
    //   790	793	1760	finally
    //   799	802	1760	finally
    //   816	821	1760	finally
    //   823	826	1760	finally
    //   835	840	1760	finally
    //   840	843	1760	finally
    //   847	852	1760	finally
    //   854	859	1760	finally
    //   883	888	1760	finally
    //   890	893	1760	finally
    //   895	900	1760	finally
    //   900	905	1760	finally
    //   913	918	1760	finally
    //   927	932	1760	finally
    //   934	937	1760	finally
    //   939	944	1760	finally
    //   944	947	1760	finally
    //   949	954	1760	finally
    //   954	957	1760	finally
    //   966	969	1760	finally
    //   978	981	1760	finally
    //   990	993	1760	finally
    //   1002	1009	1760	finally
    //   1041	1046	1760	finally
    //   1048	1055	1760	finally
    //   1062	1067	1760	finally
    //   1074	1077	1760	finally
    //   1102	1105	1760	finally
    //   1110	1113	1760	finally
    //   1122	1125	1760	finally
    //   1148	1153	1760	finally
    //   1162	1165	1760	finally
    //   1174	1177	1760	finally
    //   1227	1230	1760	finally
    //   1254	1259	1760	finally
    //   1263	1268	1760	finally
    //   1270	1275	1760	finally
    //   1285	1290	1760	finally
    //   1292	1297	1760	finally
    //   1297	1300	1760	finally
    //   1313	1318	1760	finally
    //   1320	1323	1760	finally
    //   1325	1330	1760	finally
    //   1332	1337	1760	finally
    //   1339	1344	1760	finally
    //   1346	1351	1760	finally
    //   1353	1358	1760	finally
    //   1358	1363	1760	finally
    //   1367	1372	1760	finally
    //   1374	1379	1760	finally
    //   1381	1386	1760	finally
    //   1388	1393	1760	finally
    //   1395	1400	1760	finally
    //   1402	1407	1760	finally
    //   1409	1414	1760	finally
    //   1416	1421	1760	finally
    //   1423	1428	1760	finally
    //   1428	1431	1760	finally
    //   1440	1446	1760	finally
    //   1481	1486	1760	finally
    //   1504	1509	1760	finally
    //   1526	1531	1760	finally
    //   1574	1579	1760	finally
    //   1580	1585	1760	finally
    //   1604	1607	1760	finally
    //   1622	1627	1760	finally
    //   1641	1646	1760	finally
    //   1651	1654	1760	finally
    //   1663	1668	1760	finally
    //   1673	1676	1760	finally
    //   1707	1712	1760	finally
    //   1455	1458	1765	finally
    //   19	22	1778	java/lang/Exception
    //   27	32	1778	java/lang/Exception
    //   40	44	1778	java/lang/Exception
    //   49	52	1778	java/lang/Exception
    //   55	60	1778	java/lang/Exception
    //   66	69	1778	java/lang/Exception
    //   72	77	1778	java/lang/Exception
    //   83	86	1778	java/lang/Exception
    //   89	94	1778	java/lang/Exception
  }
  
  static ArrayList a(String paramString1, long paramLong1, long paramLong2, long paramLong3, String paramString2, String paramString3, String paramString4, d paramd, com.vvt.base.b paramb)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    bool1 = false;
    Object localObject1 = null;
    Object localObject2 = "com.viber.voip";
    String str = "viber_messages";
    for (;;)
    {
      try
      {
        localObject1 = com.vvt.af.a.a.a((String)localObject2, str);
        if (localObject1 != null) {
          localObject2 = paramString1;
        }
        boolean bool2;
        Object localObject3 = localArrayList;
      }
      catch (Exception localException)
      {
        try
        {
          localObject2 = a((com.vvt.af.a.a)localObject1, paramString1, paramLong1, paramLong2, paramLong3, paramString2, paramString3, paramString4, paramd, paramb);
          if (localObject1 != null) {
            ((com.vvt.af.a.a)localObject1).a();
          }
          localObject1 = localObject2;
          bool2 = b;
          if (bool2) {}
          bool2 = a;
          if (bool2) {}
          return (ArrayList)localObject1;
        }
        finally
        {
          localObject3 = localObject1;
          localObject1 = localObject5;
          continue;
        }
        localException = localException;
        bool2 = c;
        if ((!bool2) || (localObject1 != null)) {
          ((com.vvt.af.a.a)localObject1).a();
        }
        localObject1 = localArrayList;
      }
      finally
      {
        localObject4 = finally;
        bool2 = false;
        localObject3 = null;
        localObject1 = localObject4;
        if (localObject3 != null) {
          ((com.vvt.af.a.a)localObject3).a();
        }
        throw ((Throwable)localObject1);
      }
    }
  }
  
  public static ArrayList a(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, String paramString3, String paramString4, String paramString5, d paramd, com.vvt.base.b paramb)
  {
    boolean bool = a;
    if (bool) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = null;
    for (;;)
    {
      try
      {
        com.vvt.af.a.a locala = com.vvt.af.a.a.a(paramString1);
        if (locala != null) {
          localObject1 = paramString2;
        }
        Object localObject3;
        localObject1 = localArrayList;
      }
      finally
      {
        try
        {
          localObject1 = a(locala, paramString2, paramLong1, paramLong2, paramLong3, paramString3, paramString4, paramString5, paramd, paramb);
          if (locala != null) {
            locala.a();
          }
          bool = b;
          if (bool) {}
          bool = a;
          if (bool) {}
          return (ArrayList)localObject1;
        }
        finally
        {
          localObject1 = localObject2;
          localObject3 = localObject4;
        }
        localObject2 = finally;
        if (localObject1 != null) {
          ((com.vvt.af.a.a)localObject1).a();
        }
      }
    }
  }
  
  /* Error */
  private static List a(com.vvt.af.a.a parama, String paramString1, String paramString2, d paramd, String paramString3)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: iconst_1
    //   4: istore 6
    //   6: getstatic 14	com/vvt/capture/viber/mode/full/removeFromPath:a	Z
    //   9: istore 7
    //   11: iload 7
    //   13: ifeq +3 -> 16
    //   16: new 221	java/util/ArrayList
    //   19: astore 8
    //   21: aload 8
    //   23: invokespecial 222	java/util/ArrayList:<init>	()V
    //   26: aload_0
    //   27: ifnull +430 -> 457
    //   30: invokestatic 453	com/vvt/capture/viber/mode/full/removeFromPath:a	()Ljava/lang/String;
    //   33: astore 9
    //   35: iconst_1
    //   36: istore 10
    //   38: iload 10
    //   40: anewarray 24	java/lang/String
    //   43: astore 11
    //   45: aconst_null
    //   46: astore 12
    //   48: aload 11
    //   50: iconst_0
    //   51: aload_2
    //   52: aastore
    //   53: aload_0
    //   54: aload 9
    //   56: aload 11
    //   58: invokevirtual 232	com/vvt/af/a/a:a	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   61: astore 11
    //   63: aload 11
    //   65: ifnull +398 -> 463
    //   68: aload 11
    //   70: invokeinterface 235 1 0
    //   75: istore 7
    //   77: iload 7
    //   79: ifeq +384 -> 463
    //   82: ldc -96
    //   84: astore 9
    //   86: aload 11
    //   88: aload 9
    //   90: invokeinterface 164 2 0
    //   95: istore 7
    //   97: aload 11
    //   99: iload 7
    //   101: invokeinterface 167 2 0
    //   106: astore 12
    //   108: ldc -87
    //   110: astore 9
    //   112: aload 11
    //   114: aload 9
    //   116: invokeinterface 164 2 0
    //   121: istore 7
    //   123: aload 11
    //   125: iload 7
    //   127: invokeinterface 167 2 0
    //   132: astore 13
    //   134: ldc -85
    //   136: astore 9
    //   138: aload 11
    //   140: aload 9
    //   142: invokeinterface 164 2 0
    //   147: istore 7
    //   149: aload 11
    //   151: iload 7
    //   153: invokeinterface 167 2 0
    //   158: astore 9
    //   160: getstatic 17	com/vvt/capture/viber/mode/full/removeFromPath:removeFromPath	Z
    //   163: istore 14
    //   165: iload 14
    //   167: ifeq +3 -> 170
    //   170: aload 9
    //   172: ifnull +168 -> 340
    //   175: aload 9
    //   177: invokevirtual 28	java/lang/String:length	()I
    //   180: istore 14
    //   182: iload 14
    //   184: ifle +156 -> 340
    //   187: aload_1
    //   188: aload 9
    //   190: aload 4
    //   192: invokestatic 456	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   195: astore 9
    //   197: aload 12
    //   199: ifnull +17 -> 216
    //   202: aload 12
    //   204: invokevirtual 28	java/lang/String:length	()I
    //   207: istore 14
    //   209: iload 14
    //   211: iload 6
    //   213: if_icmpge +7 -> 220
    //   216: aload 13
    //   218: astore 12
    //   220: getstatic 14	com/vvt/capture/viber/mode/full/removeFromPath:a	Z
    //   223: istore 14
    //   225: iload 14
    //   227: ifeq +3 -> 230
    //   230: new 58	com/vvt/im/events/info/e
    //   233: astore 15
    //   235: aload 15
    //   237: invokespecial 457	com/vvt/im/events/info/e:<init>	()V
    //   240: aload 15
    //   242: aload 13
    //   244: invokevirtual 458	com/vvt/im/events/info/e:d	(Ljava/lang/String;)V
    //   247: aload 15
    //   249: aload 12
    //   251: invokevirtual 459	com/vvt/im/events/info/e:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   254: aload 15
    //   256: aload 13
    //   258: invokevirtual 460	com/vvt/im/events/info/e:removeFromPath	(Ljava/lang/String;)V
    //   261: aload 15
    //   263: aload 9
    //   265: invokevirtual 461	com/vvt/im/events/info/e:a	(Ljava/lang/String;)V
    //   268: iconst_0
    //   269: istore 7
    //   271: aconst_null
    //   272: astore 9
    //   274: iconst_0
    //   275: newarray <illegal type>
    //   277: astore 9
    //   279: aload 15
    //   281: aload 9
    //   283: invokevirtual 462	com/vvt/im/events/info/e:a	([B)V
    //   286: aload 8
    //   288: aload 15
    //   290: invokeinterface 463 2 0
    //   295: pop
    //   296: goto -228 -> 68
    //   299: astore 9
    //   301: aload 11
    //   303: astore 5
    //   305: getstatic 14	com/vvt/capture/viber/mode/full/removeFromPath:a	Z
    //   308: istore 7
    //   310: iload 7
    //   312: ifeq +3 -> 315
    //   315: aload 5
    //   317: ifnull +10 -> 327
    //   320: aload 5
    //   322: invokeinterface 174 1 0
    //   327: getstatic 14	com/vvt/capture/viber/mode/full/removeFromPath:a	Z
    //   330: istore 7
    //   332: iload 7
    //   334: ifeq +3 -> 337
    //   337: aload 8
    //   339: areturn
    //   340: getstatic 17	com/vvt/capture/viber/mode/full/removeFromPath:removeFromPath	Z
    //   343: istore 7
    //   345: iload 7
    //   347: ifeq +3 -> 350
    //   350: aload 12
    //   352: ifnull +73 -> 425
    //   355: aload 12
    //   357: invokevirtual 28	java/lang/String:length	()I
    //   360: istore 7
    //   362: iload 7
    //   364: ifle +61 -> 425
    //   367: aload_3
    //   368: aload 12
    //   370: invokeinterface 466 2 0
    //   375: astore 9
    //   377: aload 9
    //   379: ifnull +46 -> 425
    //   382: aload 9
    //   384: arraylength
    //   385: istore 14
    //   387: iload 14
    //   389: ifle +36 -> 425
    //   392: getstatic 17	com/vvt/capture/viber/mode/full/removeFromPath:removeFromPath	Z
    //   395: istore 14
    //   397: iload 14
    //   399: ifeq +3 -> 402
    //   402: aload_1
    //   403: aload 9
    //   405: invokestatic 469	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	(Ljava/lang/String;[B)Ljava/lang/String;
    //   408: astore 9
    //   410: goto -213 -> 197
    //   413: astore 9
    //   415: getstatic 22	com/vvt/capture/viber/mode/full/removeFromPath:MyUncaughtExceptionHandler	Z
    //   418: istore 7
    //   420: iload 7
    //   422: ifeq +3 -> 425
    //   425: iconst_0
    //   426: istore 7
    //   428: aconst_null
    //   429: astore 9
    //   431: goto -234 -> 197
    //   434: astore 9
    //   436: iconst_0
    //   437: istore 10
    //   439: aconst_null
    //   440: astore 11
    //   442: aload 11
    //   444: ifnull +10 -> 454
    //   447: aload 11
    //   449: invokeinterface 174 1 0
    //   454: aload 9
    //   456: athrow
    //   457: iconst_0
    //   458: istore 10
    //   460: aconst_null
    //   461: astore 11
    //   463: aload 11
    //   465: ifnull -138 -> 327
    //   468: aload 11
    //   470: invokeinterface 174 1 0
    //   475: goto -148 -> 327
    //   478: astore 9
    //   480: goto -38 -> 442
    //   483: astore 9
    //   485: aload 5
    //   487: astore 11
    //   489: goto -47 -> 442
    //   492: astore 9
    //   494: goto -189 -> 305
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	497	0	parama	com.vvt.af.a.a
    //   0	497	1	paramString1	String
    //   0	497	2	paramString2	String
    //   0	497	3	paramd	d
    //   0	497	4	paramString3	String
    //   1	485	5	localObject1	Object
    //   4	210	6	i	int
    //   9	69	7	bool1	boolean
    //   95	175	7	j	int
    //   308	38	7	bool2	boolean
    //   360	3	7	k	int
    //   418	9	7	bool3	boolean
    //   19	319	8	localArrayList	ArrayList
    //   33	249	9	localObject2	Object
    //   299	1	9	localException1	Exception
    //   375	34	9	localObject3	Object
    //   413	1	9	localException2	Exception
    //   429	1	9	localObject4	Object
    //   434	21	9	localObject5	Object
    //   478	1	9	localObject6	Object
    //   483	1	9	localObject7	Object
    //   492	1	9	localException3	Exception
    //   36	423	10	m	int
    //   43	445	11	localObject8	Object
    //   46	323	12	localObject9	Object
    //   132	125	13	str	String
    //   163	3	14	bool4	boolean
    //   180	34	14	n	int
    //   223	3	14	bool5	boolean
    //   385	3	14	i1	int
    //   395	3	14	bool6	boolean
    //   233	56	15	locale	e
    // Exception table:
    //   from	to	target	type
    //   68	75	299	java/lang/Exception
    //   88	95	299	java/lang/Exception
    //   99	106	299	java/lang/Exception
    //   114	121	299	java/lang/Exception
    //   125	132	299	java/lang/Exception
    //   140	147	299	java/lang/Exception
    //   151	158	299	java/lang/Exception
    //   202	207	299	java/lang/Exception
    //   220	223	299	java/lang/Exception
    //   230	233	299	java/lang/Exception
    //   235	240	299	java/lang/Exception
    //   242	247	299	java/lang/Exception
    //   249	254	299	java/lang/Exception
    //   256	261	299	java/lang/Exception
    //   263	268	299	java/lang/Exception
    //   274	277	299	java/lang/Exception
    //   281	286	299	java/lang/Exception
    //   288	296	299	java/lang/Exception
    //   415	418	299	java/lang/Exception
    //   160	163	413	java/lang/Exception
    //   175	180	413	java/lang/Exception
    //   190	195	413	java/lang/Exception
    //   340	343	413	java/lang/Exception
    //   355	360	413	java/lang/Exception
    //   368	375	413	java/lang/Exception
    //   382	385	413	java/lang/Exception
    //   392	395	413	java/lang/Exception
    //   403	408	413	java/lang/Exception
    //   30	33	434	finally
    //   38	43	434	finally
    //   51	53	434	finally
    //   56	61	434	finally
    //   68	75	478	finally
    //   88	95	478	finally
    //   99	106	478	finally
    //   114	121	478	finally
    //   125	132	478	finally
    //   140	147	478	finally
    //   151	158	478	finally
    //   160	163	478	finally
    //   175	180	478	finally
    //   190	195	478	finally
    //   202	207	478	finally
    //   220	223	478	finally
    //   230	233	478	finally
    //   235	240	478	finally
    //   242	247	478	finally
    //   249	254	478	finally
    //   256	261	478	finally
    //   263	268	478	finally
    //   274	277	478	finally
    //   281	286	478	finally
    //   288	296	478	finally
    //   340	343	478	finally
    //   355	360	478	finally
    //   368	375	478	finally
    //   382	385	478	finally
    //   392	395	478	finally
    //   403	408	478	finally
    //   415	418	478	finally
    //   305	308	483	finally
    //   30	33	492	java/lang/Exception
    //   38	43	492	java/lang/Exception
    //   51	53	492	java/lang/Exception
    //   56	61	492	java/lang/Exception
  }
  
  private static String b()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT ");
    localStringBuilder.append("messages._id, ");
    localStringBuilder.append("messages.conversation_id, ");
    localStringBuilder.append("messages.extra_mime, ");
    localStringBuilder.append("conversations.name as conversation_name, ");
    localStringBuilder.append("conversations.group_id, ");
    localStringBuilder.append("conversations.conversation_type as is_group, ");
    localStringBuilder.append("participants.participant_info_id as speaker_id, ");
    localStringBuilder.append("messages.address as contact, ");
    localStringBuilder.append("messages.date, ");
    localStringBuilder.append("messages.status, ");
    localStringBuilder.append("messages.type as direction, ");
    localStringBuilder.append("messages.body, ");
    localStringBuilder.append("messages.token, ");
    localStringBuilder.append("messages.location_lat, ");
    localStringBuilder.append("messages.location_lng, ");
    localStringBuilder.append("messages.extra_upload_id, ");
    localStringBuilder.append("messages.extra_uri, ");
    localStringBuilder.append("messages.description, ");
    localStringBuilder.append("messages.extra_bucket_name, ");
    localStringBuilder.append("messages.flag ");
    localStringBuilder.append("FROM messages ");
    localStringBuilder.append("LEFT JOIN (");
    localStringBuilder.append("SELECT conversations._id as con_id, conversations.name, ");
    localStringBuilder.append("group_id, conversation_type ");
    localStringBuilder.append("FROM conversations");
    localStringBuilder.append(") as conversations ");
    localStringBuilder.append("ON messages.conversation_id = conversations.con_id ");
    localStringBuilder.append("LEFT JOIN (");
    localStringBuilder.append("SELECT participants._id as par_id, ");
    localStringBuilder.append("participants.conversation_id as par_con_id,  ");
    localStringBuilder.append(" participant_info_id ");
    localStringBuilder.append("FROM participants");
    localStringBuilder.append(") as participants ");
    localStringBuilder.append("ON messages.participant_id = participants.par_id ");
    localStringBuilder.append("AND messages.conversation_id = participants.par_con_id ");
    localStringBuilder.append("where messages._id > ? AND messages._id <= ? ");
    localStringBuilder.append("AND messages.flag != 72 AND messages.flag != 8 ");
    localStringBuilder.append("AND messages.extra_mime != 'call' ");
    localStringBuilder.append("ORDER BY _id DESC ");
    localStringBuilder.append("LIMIT ?");
    return localStringBuilder.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/viber/mode/full/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */