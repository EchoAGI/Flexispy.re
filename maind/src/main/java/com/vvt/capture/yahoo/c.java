package com.vvt.capture.yahoo;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.text.Html;
import android.webkit.MimeTypeMap;
import com.vvt.base.RunningMode;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxIMAccountEvent;
import com.vvt.events.FxIMContactEvent;
import com.vvt.events.FxIMConversationEvent;
import com.vvt.events.FxIMMessageEvent;
import com.vvt.events.FxIMMessageServiceType;
import com.vvt.im.events.ImMediaFileType;
import com.vvt.im.events.ImType;
import com.vvt.im.events.MessageType;
import com.vvt.io.p;
import com.vvt.shell.ShellUtil;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class c
{
  private static final boolean a;
  private static final boolean b;
  private static String c;
  private static RunningMode d;
  
  static
  {
    boolean bool = com.vvt.ak.a.a;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      b = com.vvt.ak.a.e;
      d = RunningMode.FULL;
      return;
    }
  }
  
  private static String a(int paramInt)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    return "SELECT _id, iAmSender, profile_id, buddy_id, message, metaData, dateSent FROM Messages_" + paramInt + " where _id > ? AND _id <= ? ORDER BY _id DESC ";
  }
  
  private static String a(SQLiteDatabase paramSQLiteDatabase)
  {
    int i = b(paramSQLiteDatabase);
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    return "Messages_" + i;
  }
  
  /* Error */
  private static String a(SQLiteDatabase paramSQLiteDatabase, String paramString, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: iload_2
    //   3: invokestatic 58	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:e	(I)Ljava/lang/String;
    //   6: astore 4
    //   8: iconst_1
    //   9: istore 5
    //   11: iload 5
    //   13: anewarray 60	java/lang/String
    //   16: astore 6
    //   18: aload 6
    //   20: iconst_0
    //   21: aload_1
    //   22: aastore
    //   23: aload_0
    //   24: aload 4
    //   26: aload 6
    //   28: invokevirtual 66	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   31: astore 4
    //   33: aload 4
    //   35: ifnull +42 -> 77
    //   38: aload 4
    //   40: invokeinterface 72 1 0
    //   45: istore 5
    //   47: iload 5
    //   49: ifeq +28 -> 77
    //   52: ldc 74
    //   54: astore 6
    //   56: aload 4
    //   58: aload 6
    //   60: invokeinterface 78 2 0
    //   65: istore 5
    //   67: aload 4
    //   69: iload 5
    //   71: invokeinterface 81 2 0
    //   76: astore_3
    //   77: aload 4
    //   79: ifnull +10 -> 89
    //   82: aload 4
    //   84: invokeinterface 84 1 0
    //   89: getstatic 17	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:a	Z
    //   92: istore 7
    //   94: iload 7
    //   96: ifeq +3 -> 99
    //   99: aload_3
    //   100: areturn
    //   101: astore 4
    //   103: iconst_0
    //   104: istore 7
    //   106: aconst_null
    //   107: astore 4
    //   109: getstatic 22	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:removeFromPath	Z
    //   112: istore 5
    //   114: iload 5
    //   116: ifeq +3 -> 119
    //   119: aload 4
    //   121: ifnull -32 -> 89
    //   124: goto -42 -> 82
    //   127: astore 8
    //   129: iconst_0
    //   130: istore 7
    //   132: aconst_null
    //   133: astore 4
    //   135: aload 8
    //   137: astore_3
    //   138: aload 4
    //   140: ifnull +10 -> 150
    //   143: aload 4
    //   145: invokeinterface 84 1 0
    //   150: aload_3
    //   151: athrow
    //   152: astore_3
    //   153: goto -15 -> 138
    //   156: astore 6
    //   158: goto -49 -> 109
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	161	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	161	1	paramString	String
    //   0	161	2	paramInt	int
    //   1	150	3	localObject1	Object
    //   152	1	3	localObject2	Object
    //   6	77	4	localObject3	Object
    //   101	1	4	localException1	Exception
    //   107	37	4	localObject4	Object
    //   9	39	5	bool1	boolean
    //   65	5	5	i	int
    //   112	3	5	bool2	boolean
    //   16	43	6	localObject5	Object
    //   156	1	6	localException2	Exception
    //   92	39	7	bool3	boolean
    //   127	9	8	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   2	6	101	java/lang/Exception
    //   11	16	101	java/lang/Exception
    //   21	23	101	java/lang/Exception
    //   26	31	101	java/lang/Exception
    //   2	6	127	finally
    //   11	16	127	finally
    //   21	23	127	finally
    //   26	31	127	finally
    //   38	45	152	finally
    //   58	65	152	finally
    //   69	76	152	finally
    //   109	112	152	finally
    //   38	45	156	java/lang/Exception
    //   58	65	156	java/lang/Exception
    //   69	76	156	java/lang/Exception
  }
  
  private static String a(String paramString1, String paramString2, ImType paramImType, ImMediaFileType paramImMediaFileType, String paramString3)
  {
    boolean bool1 = false;
    Object localObject1 = "/storage/emulated/0";
    String str1 = paramString2.replace((CharSequence)localObject1, "/sdcard");
    boolean bool2 = a;
    if (bool2) {}
    localObject1 = new java/io/File;
    ((File)localObject1).<init>(str1);
    bool2 = ((File)localObject1).exists();
    String str2;
    if (bool2)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      str2 = com.vvt.im.a.c.a(paramString1, paramImType, paramImMediaFileType);
      localObject1 = ((StringBuilder)localObject1).append(str2);
      str2 = File.separator;
      localObject1 = ((StringBuilder)localObject1).append(str2);
      str2 = com.vvt.im.a.c.a(paramImMediaFileType);
    }
    Object localObject2;
    for (localObject1 = str2;; localObject2 = null)
    {
      try
      {
        com.vvt.io.d.a(str1, (String)localObject1);
        ShellUtil.b(paramString3, (String)localObject1);
        bool1 = a;
        if (!bool1) {}
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          bool2 = b;
          if (bool2) {}
          bool2 = false;
          localObject2 = null;
        }
      }
      return (String)localObject1;
      bool2 = a;
      if (bool2) {}
      bool2 = false;
    }
  }
  
  private static ArrayList a(SQLiteDatabase paramSQLiteDatabase, String paramString, Cursor paramCursor, int paramInt, com.vvt.base.b paramb)
  {
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    Object localObject1 = null;
    boolean bool1 = paramCursor.moveToLast();
    if (bool1)
    {
      bool1 = a;
      if (!bool1) {}
    }
    for (;;)
    {
      com.vvt.im.events.info.d locald = b(paramSQLiteDatabase, paramString, paramInt);
      YahooData localYahooData = new com/vvt/capture/yahoo/YahooData;
      localYahooData.<init>();
      com.vvt.im.events.info.f localf = new com/vvt/im/events/info/f;
      localf.<init>();
      com.vvt.im.events.info.b localb = new com/vvt/im/events/info/b;
      localb.<init>();
      com.vvt.im.events.info.c localc = new com/vvt/im/events/info/c;
      localc.<init>();
      new ArrayList();
      int k = MessageType.none.getNumber();
      String str1 = "";
      int i = paramCursor.getColumnIndex("_id");
      int m = paramCursor.getInt(i);
      i = paramCursor.getColumnIndex("message");
      String str2 = paramCursor.getString(i);
      i = paramCursor.getColumnIndex("buddy_id");
      int n = paramCursor.getInt(i);
      Object localObject2 = Integer.toString(n);
      ArrayList localArrayList2 = a(paramSQLiteDatabase, (String)localObject2, paramString, paramInt);
      localObject2 = "iAmSender";
      i = paramCursor.getColumnIndex((String)localObject2);
      i = paramCursor.getInt(i);
      int i1 = 1;
      Object localObject3;
      Object localObject4;
      long l;
      String str3;
      boolean bool3;
      if (i == i1)
      {
        localObject2 = YahooData.Direction.OUT;
        localObject3 = locald.b();
        localf.a((String)localObject3);
        localObject3 = locald.e();
        localf.d((String)localObject3);
        localObject3 = locald.a();
        localf.b((String)localObject3);
        localObject3 = locald.g();
        localf.e((String)localObject3);
        localObject3 = locald.d();
        localf.c((String)localObject3);
        localObject4 = localObject2;
        i = paramCursor.getColumnIndex("dateSent");
        l = paramCursor.getLong(i);
        localObject2 = new java/text/SimpleDateFormat;
        ((SimpleDateFormat)localObject2).<init>("dd/MM/yy HH:mm:ss");
        localObject3 = new java/util/Date;
        ((Date)localObject3).<init>(l);
        str3 = ((SimpleDateFormat)localObject2).format((Date)localObject3);
        i = paramCursor.getColumnIndex("metaData");
        localObject2 = paramCursor.getString(i);
        bool3 = a;
        if ((!bool3) || (localObject2 != null))
        {
          i = ((String)localObject2).length();
          if (i != 0) {
            break label780;
          }
        }
        localObject2 = MessageType.Text;
      }
      label426:
      int j;
      label769:
      label780:
      for (i = ((MessageType)localObject2).getNumber();; j = k)
      {
        localObject3 = "<ding>";
        bool3 = str2.equalsIgnoreCase((String)localObject3);
        String str5;
        Object localObject5;
        if (bool3)
        {
          localObject3 = "BUZZ!!!";
          localYahooData.a((String)localObject3);
          localYahooData.a(i);
          localObject3 = Integer.toString(m);
          String str4 = localf.b();
          localObject2 = paramSQLiteDatabase;
          str5 = paramString;
          localObject5 = paramb;
          localObject2 = a(paramSQLiteDatabase, (String)localObject3, paramString, localYahooData, str4, paramInt, paramb);
          localYahooData.b((List)localObject2);
          localYahooData.a(l);
          localYahooData.b(str3);
          localYahooData.a(localc);
          localYahooData.a((YahooData.Direction)localObject4);
          localYahooData.a(localArrayList2);
          localYahooData.a(locald);
          localYahooData.a(localf);
          i = localArrayList2.size();
          if (i <= 0) {
            break label769;
          }
          localObject3 = ((com.vvt.im.events.info.e)localArrayList2.get(0)).c();
          i = 0;
          localObject2 = ((com.vvt.im.events.info.e)localArrayList2.get(0)).a();
        }
        for (;;)
        {
          str5 = Integer.toString(n);
          localb.a(str5);
          localb.b((String)localObject3);
          localb.c((String)localObject2);
          localYahooData.a(localb);
          localArrayList1.add(localYahooData);
          bool3 = paramCursor.moveToPrevious();
          if (bool3) {
            break label787;
          }
          boolean bool2 = a;
          if (bool2) {}
          return localArrayList1;
          localObject3 = YahooData.Direction.IN;
          j = localArrayList2.size();
          if (j > 0)
          {
            j = 0;
            localObject2 = (com.vvt.im.events.info.e)localArrayList2.get(0);
            localObject5 = ((com.vvt.im.events.info.e)localObject2).d();
            localf.a((String)localObject5);
            localObject5 = ((com.vvt.im.events.info.e)localObject2).b();
            localf.d((String)localObject5);
            localObject5 = ((com.vvt.im.events.info.e)localObject2).c();
            localf.b((String)localObject5);
            localObject5 = ((com.vvt.im.events.info.e)localObject2).a();
            localf.e((String)localObject5);
            localObject2 = ((com.vvt.im.events.info.e)localObject2).f();
            localf.c((String)localObject2);
          }
          localObject4 = localObject3;
          break;
          localObject3 = Html.fromHtml(str2).toString();
          break label426;
          localObject2 = localObject1;
          localObject3 = str1;
        }
      }
      label787:
      localObject1 = localObject2;
    }
  }
  
  /* Error */
  private static ArrayList a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, int paramInt)
  {
    // Byte code:
    //   0: iconst_2
    //   1: istore 4
    //   3: new 126	java/util/ArrayList
    //   6: astore 5
    //   8: aload 5
    //   10: invokespecial 127	java/util/ArrayList:<init>	()V
    //   13: aconst_null
    //   14: astore 6
    //   16: iload_3
    //   17: invokestatic 310	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:d	(I)Ljava/lang/String;
    //   20: astore 7
    //   22: iconst_2
    //   23: istore 8
    //   25: iload 8
    //   27: anewarray 60	java/lang/String
    //   30: astore 9
    //   32: iconst_0
    //   33: istore 10
    //   35: aconst_null
    //   36: astore 11
    //   38: aload 9
    //   40: iconst_0
    //   41: aload_1
    //   42: aastore
    //   43: iconst_1
    //   44: istore 10
    //   46: aload 9
    //   48: iload 10
    //   50: aload_1
    //   51: aastore
    //   52: aload_0
    //   53: aload 7
    //   55: aload 9
    //   57: invokevirtual 66	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   60: astore 6
    //   62: getstatic 17	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:a	Z
    //   65: istore 12
    //   67: iload 12
    //   69: ifeq +3 -> 72
    //   72: aload 6
    //   74: ifnull +521 -> 595
    //   77: aload 6
    //   79: invokeinterface 72 1 0
    //   84: istore 12
    //   86: iload 12
    //   88: ifeq +507 -> 595
    //   91: ldc_w 312
    //   94: astore 7
    //   96: aload 6
    //   98: aload 7
    //   100: invokeinterface 78 2 0
    //   105: istore 12
    //   107: aload 6
    //   109: iload 12
    //   111: invokeinterface 81 2 0
    //   116: astore 7
    //   118: ldc_w 314
    //   121: astore 9
    //   123: aload 6
    //   125: aload 9
    //   127: invokeinterface 78 2 0
    //   132: istore 8
    //   134: aload 6
    //   136: iload 8
    //   138: invokeinterface 81 2 0
    //   143: astore 9
    //   145: ldc_w 316
    //   148: astore 11
    //   150: aload 6
    //   152: aload 11
    //   154: invokeinterface 78 2 0
    //   159: istore 10
    //   161: aload 6
    //   163: iload 10
    //   165: invokeinterface 81 2 0
    //   170: astore 11
    //   172: ldc_w 318
    //   175: astore 13
    //   177: aload 6
    //   179: aload 13
    //   181: invokeinterface 78 2 0
    //   186: istore 14
    //   188: aload 6
    //   190: iload 14
    //   192: invokeinterface 81 2 0
    //   197: astore 13
    //   199: new 276	com/vvt/im/events/info/e
    //   202: astore 15
    //   204: aload 15
    //   206: invokespecial 319	com/vvt/im/events/info/e:<init>	()V
    //   209: aload 15
    //   211: aload 7
    //   213: invokevirtual 320	com/vvt/im/events/info/e:d	(Ljava/lang/String;)V
    //   216: aload 15
    //   218: aload 9
    //   220: invokevirtual 321	com/vvt/im/events/info/e:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   223: aload 15
    //   225: aload 11
    //   227: invokevirtual 322	com/vvt/im/events/info/e:e	(Ljava/lang/String;)V
    //   230: aload 13
    //   232: ifnull +32 -> 264
    //   235: aload 13
    //   237: invokestatic 325	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   240: istore 8
    //   242: iload 8
    //   244: lookupswitch	default:+20->264, 2:+41->285
    //   264: aload 5
    //   266: aload 15
    //   268: invokevirtual 289	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   271: pop
    //   272: getstatic 17	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:a	Z
    //   275: istore 12
    //   277: iload 12
    //   279: ifeq -202 -> 77
    //   282: goto -205 -> 77
    //   285: ldc_w 327
    //   288: astore 9
    //   290: iconst_1
    //   291: istore 10
    //   293: iload 10
    //   295: anewarray 4	java/lang/Object
    //   298: astore 11
    //   300: iconst_0
    //   301: istore 14
    //   303: aconst_null
    //   304: astore 13
    //   306: aload 11
    //   308: iconst_0
    //   309: aload 7
    //   311: aastore
    //   312: aload 9
    //   314: aload 11
    //   316: invokestatic 330	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   319: astore 7
    //   321: aload 7
    //   323: invokestatic 333	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:f	(Ljava/lang/String;)[B
    //   326: astore 7
    //   328: aload 7
    //   330: ifnull -66 -> 264
    //   333: aload 7
    //   335: arraylength
    //   336: istore 8
    //   338: iload 8
    //   340: iload 4
    //   342: if_icmplt -78 -> 264
    //   345: iconst_0
    //   346: istore 8
    //   348: aconst_null
    //   349: astore 9
    //   351: aload 7
    //   353: iconst_0
    //   354: baload
    //   355: istore 8
    //   357: bipush 60
    //   359: istore 10
    //   361: iload 8
    //   363: iload 10
    //   365: if_icmpeq -101 -> 264
    //   368: iconst_1
    //   369: istore 8
    //   371: aload 7
    //   373: iload 8
    //   375: baload
    //   376: istore 8
    //   378: bipush 33
    //   380: istore 10
    //   382: iload 8
    //   384: iload 10
    //   386: if_icmpeq -122 -> 264
    //   389: getstatic 341	com/vvt/im/events/ImType:YAHOO	Lcom/vvt/im/events/ImType;
    //   392: astore 9
    //   394: getstatic 347	com/vvt/im/events/ImMediaFileType:USER_PROFILE	Lcom/vvt/im/events/ImMediaFileType;
    //   397: astore 11
    //   399: aload_2
    //   400: aload 9
    //   402: aload 11
    //   404: invokestatic 107	com/vvt/im/a/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Lcom/vvt/im/events/ImType;Lcom/vvt/im/events/ImMediaFileType;)Ljava/lang/String;
    //   407: astore 9
    //   409: getstatic 347	com/vvt/im/events/ImMediaFileType:USER_PROFILE	Lcom/vvt/im/events/ImMediaFileType;
    //   412: astore 11
    //   414: aload 11
    //   416: invokestatic 113	com/vvt/im/a/MyUncaughtExceptionHandler:a	(Lcom/vvt/im/events/ImMediaFileType;)Ljava/lang/String;
    //   419: astore 11
    //   421: new 31	java/lang/StringBuilder
    //   424: astore 13
    //   426: aload 13
    //   428: invokespecial 35	java/lang/StringBuilder:<init>	()V
    //   431: aload 13
    //   433: aload 11
    //   435: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   438: astore 13
    //   440: ldc_w 349
    //   443: astore 16
    //   445: aload 13
    //   447: aload 16
    //   449: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   452: astore 13
    //   454: aload 13
    //   456: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   459: astore 13
    //   461: aload 7
    //   463: aload 9
    //   465: aload 13
    //   467: invokestatic 352	com/vvt/io/d:a	([BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   470: pop
    //   471: new 31	java/lang/StringBuilder
    //   474: astore 7
    //   476: aload 7
    //   478: invokespecial 35	java/lang/StringBuilder:<init>	()V
    //   481: aload 7
    //   483: aload 9
    //   485: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   488: astore 7
    //   490: getstatic 110	java/io/File:separator	Ljava/lang/String;
    //   493: astore 9
    //   495: aload 7
    //   497: aload 9
    //   499: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   502: astore 7
    //   504: aload 7
    //   506: aload 11
    //   508: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   511: astore 7
    //   513: ldc_w 349
    //   516: astore 9
    //   518: aload 7
    //   520: aload 9
    //   522: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   525: astore 7
    //   527: aload 7
    //   529: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   532: astore 7
    //   534: aload 15
    //   536: aload 7
    //   538: invokevirtual 353	com/vvt/im/events/info/e:a	(Ljava/lang/String;)V
    //   541: goto -277 -> 264
    //   544: astore 7
    //   546: getstatic 22	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:removeFromPath	Z
    //   549: istore 12
    //   551: iload 12
    //   553: ifeq +3 -> 556
    //   556: aload 6
    //   558: ifnull +10 -> 568
    //   561: aload 6
    //   563: invokeinterface 84 1 0
    //   568: aload 5
    //   570: areturn
    //   571: astore 17
    //   573: aconst_null
    //   574: astore 5
    //   576: aload 17
    //   578: astore 6
    //   580: aload 5
    //   582: ifnull +10 -> 592
    //   585: aload 5
    //   587: invokeinterface 84 1 0
    //   592: aload 6
    //   594: athrow
    //   595: aload 6
    //   597: ifnull -29 -> 568
    //   600: goto -39 -> 561
    //   603: astore 17
    //   605: aload 6
    //   607: astore 5
    //   609: aload 17
    //   611: astore 6
    //   613: goto -33 -> 580
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	616	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	616	1	paramString1	String
    //   0	616	2	paramString2	String
    //   0	616	3	paramInt	int
    //   1	342	4	i	int
    //   6	602	5	localObject1	Object
    //   14	598	6	localObject2	Object
    //   20	517	7	localObject3	Object
    //   544	1	7	localException	Exception
    //   23	364	8	j	int
    //   30	491	9	localObject4	Object
    //   33	354	10	k	int
    //   36	471	11	localObject5	Object
    //   65	22	12	bool1	boolean
    //   105	5	12	m	int
    //   275	277	12	bool2	boolean
    //   175	291	13	localObject6	Object
    //   186	116	14	n	int
    //   202	333	15	locale	com.vvt.im.events.info.e
    //   443	5	16	str	String
    //   571	6	17	localObject7	Object
    //   603	7	17	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   16	20	544	java/lang/Exception
    //   25	30	544	java/lang/Exception
    //   41	43	544	java/lang/Exception
    //   50	52	544	java/lang/Exception
    //   55	60	544	java/lang/Exception
    //   62	65	544	java/lang/Exception
    //   77	84	544	java/lang/Exception
    //   98	105	544	java/lang/Exception
    //   109	116	544	java/lang/Exception
    //   125	132	544	java/lang/Exception
    //   136	143	544	java/lang/Exception
    //   152	159	544	java/lang/Exception
    //   163	170	544	java/lang/Exception
    //   179	186	544	java/lang/Exception
    //   190	197	544	java/lang/Exception
    //   199	202	544	java/lang/Exception
    //   204	209	544	java/lang/Exception
    //   211	216	544	java/lang/Exception
    //   218	223	544	java/lang/Exception
    //   225	230	544	java/lang/Exception
    //   235	240	544	java/lang/Exception
    //   266	272	544	java/lang/Exception
    //   272	275	544	java/lang/Exception
    //   293	298	544	java/lang/Exception
    //   309	312	544	java/lang/Exception
    //   314	319	544	java/lang/Exception
    //   321	326	544	java/lang/Exception
    //   333	336	544	java/lang/Exception
    //   353	355	544	java/lang/Exception
    //   373	376	544	java/lang/Exception
    //   389	392	544	java/lang/Exception
    //   394	397	544	java/lang/Exception
    //   402	407	544	java/lang/Exception
    //   409	412	544	java/lang/Exception
    //   414	419	544	java/lang/Exception
    //   421	424	544	java/lang/Exception
    //   426	431	544	java/lang/Exception
    //   433	438	544	java/lang/Exception
    //   447	452	544	java/lang/Exception
    //   454	459	544	java/lang/Exception
    //   465	471	544	java/lang/Exception
    //   471	474	544	java/lang/Exception
    //   476	481	544	java/lang/Exception
    //   483	488	544	java/lang/Exception
    //   490	493	544	java/lang/Exception
    //   497	502	544	java/lang/Exception
    //   506	511	544	java/lang/Exception
    //   520	525	544	java/lang/Exception
    //   527	532	544	java/lang/Exception
    //   536	541	544	java/lang/Exception
    //   16	20	571	finally
    //   25	30	571	finally
    //   41	43	571	finally
    //   50	52	571	finally
    //   55	60	571	finally
    //   62	65	603	finally
    //   77	84	603	finally
    //   98	105	603	finally
    //   109	116	603	finally
    //   125	132	603	finally
    //   136	143	603	finally
    //   152	159	603	finally
    //   163	170	603	finally
    //   179	186	603	finally
    //   190	197	603	finally
    //   199	202	603	finally
    //   204	209	603	finally
    //   211	216	603	finally
    //   218	223	603	finally
    //   225	230	603	finally
    //   235	240	603	finally
    //   266	272	603	finally
    //   272	275	603	finally
    //   293	298	603	finally
    //   309	312	603	finally
    //   314	319	603	finally
    //   321	326	603	finally
    //   333	336	603	finally
    //   353	355	603	finally
    //   373	376	603	finally
    //   389	392	603	finally
    //   394	397	603	finally
    //   402	407	603	finally
    //   409	412	603	finally
    //   414	419	603	finally
    //   421	424	603	finally
    //   426	431	603	finally
    //   433	438	603	finally
    //   447	452	603	finally
    //   454	459	603	finally
    //   465	471	603	finally
    //   471	474	603	finally
    //   476	481	603	finally
    //   483	488	603	finally
    //   490	493	603	finally
    //   497	502	603	finally
    //   506	511	603	finally
    //   520	525	603	finally
    //   527	532	603	finally
    //   536	541	603	finally
    //   546	549	603	finally
  }
  
  private static ArrayList a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, YahooData paramYahooData, String paramString3, int paramInt, com.vvt.base.b paramb)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    com.vvt.im.events.info.a locala = new com/vvt/im/events/info/a;
    locala.<init>();
    int i = 0;
    String str1 = null;
    int j = 0;
    String str2 = null;
    long l1 = 0L;
    int n = 0;
    Object localObject1 = null;
    int i5 = 0;
    String str3 = null;
    n = 6;
    if (i5 < n) {}
    try
    {
      boolean bool3 = a;
      if (bool3) {}
      l2 = 10000L;
      SystemClock.sleep(l2);
      localObject1 = a(paramSQLiteDatabase, paramString1, paramInt);
      if (localObject1 != null)
      {
        str4 = "{\"isOfflineMessage\":true}";
        boolean bool6 = ((String)localObject1).equalsIgnoreCase(str4);
        if (!bool6)
        {
          i6 = ((String)localObject1).length();
          if (i6 != 0) {
            break label154;
          }
        }
      }
      bool3 = a;
      if (bool3) {}
      localObject1 = MessageType.Text;
      int i1 = ((MessageType)localObject1).getNumber();
      paramYahooData.a(i1);
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        int i6;
        label151:
        Object localObject3;
        int i2;
        JSONArray localJSONArray;
        int i3;
        boolean bool7;
        bool4 = b;
        if (bool4)
        {
          continue;
          bool4 = false;
          localObject2 = null;
          bool7 = false;
          str4 = null;
          continue;
          bool4 = false;
          localObject2 = null;
          continue;
          str4 = ".mp4";
          bool7 = str2.endsWith(str4);
          if (bool7)
          {
            str2 = "video/mp4";
            str4 = str2;
          }
          else
          {
            str4 = ".3gpp";
            bool1 = str2.endsWith(str4);
            if (bool1)
            {
              str2 = "video/3gpp";
              str4 = str2;
            }
            else
            {
              str2 = "application/x-binary";
              str4 = str2;
              continue;
              str2 = "audio";
              bool1 = str4.contains(str2);
              if (bool1)
              {
                k = 2;
              }
              else
              {
                str2 = "video";
                bool2 = str4.contains(str2);
                if (bool2)
                {
                  m = 3;
                }
                else
                {
                  m = 4;
                  continue;
                  localObject4 = "video";
                  i8 = str4.indexOf((String)localObject4);
                  i9 = -1;
                  if (i8 != i9)
                  {
                    localObject4 = com.vvt.capture.yahoo.a.f.a(paramString2, (String)localObject2);
                    locala.d((String)localObject4);
                    bool11 = a;
                    if (bool11)
                    {
                      continue;
                      localObject2 = "state";
                      bool4 = ((JSONObject)localObject3).has((String)localObject2);
                      if (!bool4) {
                        break label1468;
                      }
                      localObject2 = "state";
                      localObject2 = ((JSONObject)localObject3).getString((String)localObject2);
                      str4 = "ERROR";
                      bool7 = ((String)localObject2).equalsIgnoreCase(str4);
                      if (bool7)
                      {
                        localObject2 = new java/lang/StringBuilder;
                        ((StringBuilder)localObject2).<init>();
                        localObject4 = "Error receiving ";
                        localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
                        localObject2 = ((StringBuilder)localObject2).append(str1);
                        str1 = ": Unspecified error.";
                        localObject2 = ((StringBuilder)localObject2).append(str1);
                        localObject2 = ((StringBuilder)localObject2).toString();
                        paramYahooData.a((String)localObject2);
                        localObject2 = MessageType.Text;
                        i4 = ((MessageType)localObject2).getNumber();
                        paramYahooData.a(i4);
                      }
                      else
                      {
                        str4 = "SELF_CANCELED";
                        bool7 = ((String)localObject2).equalsIgnoreCase(str4);
                        if (bool7)
                        {
                          localObject2 = new java/lang/StringBuilder;
                          ((StringBuilder)localObject2).<init>();
                          localObject4 = "You canceled ";
                          localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
                          localObject2 = ((StringBuilder)localObject2).append(str1);
                          str1 = ".";
                          localObject2 = ((StringBuilder)localObject2).append(str1);
                          localObject2 = ((StringBuilder)localObject2).toString();
                          paramYahooData.a((String)localObject2);
                          localObject2 = MessageType.Text;
                          i4 = ((MessageType)localObject2).getNumber();
                          paramYahooData.a(i4);
                        }
                        else
                        {
                          str4 = "OTHERPARTY_CANCELED";
                          bool7 = ((String)localObject2).equalsIgnoreCase(str4);
                          if (bool7)
                          {
                            localObject2 = new java/lang/StringBuilder;
                            ((StringBuilder)localObject2).<init>();
                            localObject2 = ((StringBuilder)localObject2).append(paramString3);
                            localObject4 = " canceled ";
                            localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
                            localObject2 = ((StringBuilder)localObject2).append(str1);
                            str1 = ".";
                            localObject2 = ((StringBuilder)localObject2).append(str1);
                            localObject2 = ((StringBuilder)localObject2).toString();
                            paramYahooData.a((String)localObject2);
                            localObject2 = MessageType.Text;
                            i4 = ((MessageType)localObject2).getNumber();
                            paramYahooData.a(i4);
                          }
                          else
                          {
                            str4 = "SELF_DECLINED";
                            bool7 = ((String)localObject2).equalsIgnoreCase(str4);
                            if (bool7)
                            {
                              localObject2 = new java/lang/StringBuilder;
                              ((StringBuilder)localObject2).<init>();
                              localObject4 = "You declined ";
                              localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
                              localObject2 = ((StringBuilder)localObject2).append(str1);
                              str1 = ".";
                              localObject2 = ((StringBuilder)localObject2).append(str1);
                              localObject2 = ((StringBuilder)localObject2).toString();
                              paramYahooData.a((String)localObject2);
                              localObject2 = MessageType.Text;
                              i4 = ((MessageType)localObject2).getNumber();
                              paramYahooData.a(i4);
                            }
                            else
                            {
                              i7 = 5;
                              if (i5 != i7) {
                                break;
                              }
                              str4 = "INVITATION_RECEIVED";
                              bool8 = ((String)localObject2).equalsIgnoreCase(str4);
                              if (!bool8) {
                                break;
                              }
                              localObject2 = new java/lang/StringBuilder;
                              ((StringBuilder)localObject2).<init>();
                              localObject2 = ((StringBuilder)localObject2).append(paramString3);
                              localObject4 = " would like to send you ";
                              localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
                              localObject2 = ((StringBuilder)localObject2).append(str1);
                              str1 = ".";
                              localObject2 = ((StringBuilder)localObject2).append(str1);
                              localObject2 = ((StringBuilder)localObject2).toString();
                              paramYahooData.a((String)localObject2);
                              localObject2 = MessageType.Text;
                              i4 = ((MessageType)localObject2).getNumber();
                              paramYahooData.a(i4);
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      str4 = "TRANSFERRING";
      bool5 = ((String)localObject2).equalsIgnoreCase(str4);
      if (!bool5) {
        break label1468;
      }
      long l2 = 10000L;
      SystemClock.sleep(l2);
      bool5 = a;
      if (!bool5) {
        break label1468;
      }
      localObject2 = str1;
      i = i5 + 1;
      i5 = i;
    }
    return localArrayList;
    label154:
    localObject3 = new org/json/JSONObject;
    ((JSONObject)localObject3).<init>((String)localObject1);
    localObject1 = "fileInfo";
    i2 = ((JSONObject)localObject3).has((String)localObject1);
    if (i2 != 0)
    {
      localObject1 = "fileInfo";
      localObject1 = ((JSONObject)localObject3).getString((String)localObject1);
      if (localObject1 != null)
      {
        localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>((String)localObject1);
        if (localJSONArray != null)
        {
          i2 = 1;
          i6 = i2;
          i3 = localJSONArray.length();
          if (i3 <= 0) {
            break label677;
          }
          i3 = 1;
          i3 &= i6;
          if (i3 == 0) {
            break label1468;
          }
          i3 = 0;
          localObject1 = null;
          localObject1 = localJSONArray.get(0);
          localObject1 = (JSONObject)localObject1;
          str4 = "fileName";
          bool7 = ((JSONObject)localObject1).has(str4);
          if (bool7)
          {
            str1 = "fileName";
            str1 = ((JSONObject)localObject1).getString(str1);
          }
          str4 = "localFile";
          bool7 = ((JSONObject)localObject1).has(str4);
          if (!bool7) {
            break label868;
          }
          str4 = "localFile";
          str3 = ((JSONObject)localObject1).getString(str4);
          bool7 = a;
          if ((!bool7) || (str1 != null)) {
            str2 = e(str1);
          }
          if ((str2 == null) && (str1 != null)) {
            str2 = com.vvt.x.a.a(str1);
          }
          if ((str2 == null) && (str3 != null)) {
            str2 = e(str3);
          }
          if ((str2 != null) || (str1 == null)) {
            break label1485;
          }
          str2 = str1.toLowerCase();
          str4 = ".jpg";
          bool7 = str2.endsWith(str4);
          if (!bool7)
          {
            str4 = ".png";
            bool7 = str2.endsWith(str4);
            if (!bool7) {
              break label686;
            }
          }
          str2 = "image/jpeg";
        }
      }
    }
    label677:
    label686:
    label816:
    label868:
    label1468:
    label1485:
    for (String str4 = str2;; str4 = str2)
    {
      j = a;
      if (j != 0) {}
      str2 = "image";
      j = str4.contains(str2);
      Object localObject4;
      boolean bool4;
      int i8;
      int i9;
      if (j != 0)
      {
        j = 1;
        localObject3 = "fileSize";
        boolean bool9 = ((JSONObject)localObject1).has((String)localObject3);
        if (bool9)
        {
          localObject4 = "fileSize";
          l1 = ((JSONObject)localObject1).getLong((String)localObject4);
        }
        bool4 = a(j, paramb, l1);
        boolean bool10 = a;
        if ((bool10) && (!bool4)) {
          break label151;
        }
        localObject1 = ImType.YAHOO;
        localObject4 = ImMediaFileType.ATTACHMENT;
        String str5 = paramb.f();
        localObject1 = a(paramString2, str3, (ImType)localObject1, (ImMediaFileType)localObject4, str5);
        localObject4 = "image";
        i8 = str4.indexOf((String)localObject4);
        i9 = -1;
        if (i8 == i9) {
          break label816;
        }
        locala.d((String)localObject1);
        locala.b(str4);
        locala.c((String)localObject1);
        locala.a(str1);
        localArrayList.add(locala);
        break label151;
      }
      Object localObject2;
      boolean bool1;
      int k;
      boolean bool2;
      int m;
      boolean bool11;
      int i4;
      int i7;
      boolean bool8;
      boolean bool5;
      break;
    }
  }
  
  public static ArrayList a(String paramString, int paramInt, com.vvt.base.b paramb)
  {
    return a(paramString, null, paramInt, paramb);
  }
  
  public static ArrayList a(String paramString, long paramLong1, long paramLong2, com.vvt.base.b paramb)
  {
    return a(paramString, null, paramLong1, paramLong2, paramb);
  }
  
  /* Error */
  public static ArrayList a(String paramString1, String paramString2, int paramInt, com.vvt.base.b paramb)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: getstatic 17	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:a	Z
    //   9: istore 6
    //   11: iload 6
    //   13: ifeq +3 -> 16
    //   16: new 126	java/util/ArrayList
    //   19: astore 7
    //   21: aload 7
    //   23: invokespecial 127	java/util/ArrayList:<init>	()V
    //   26: aload_1
    //   27: invokestatic 501	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   30: istore 8
    //   32: iload 8
    //   34: ifeq +140 -> 174
    //   37: ldc_w 503
    //   40: astore 9
    //   42: ldc_w 505
    //   45: astore 10
    //   47: aload 9
    //   49: aload 10
    //   51: invokestatic 510	com/vvt/capture/yahoo/a/a:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   54: astore 9
    //   56: aload 9
    //   58: ifnull +81 -> 139
    //   61: iconst_m1
    //   62: istore 11
    //   64: iload_2
    //   65: iload 11
    //   67: if_icmpne +7 -> 74
    //   70: iconst_m1
    //   71: iconst_1
    //   72: iushr
    //   73: istore_2
    //   74: aload 9
    //   76: invokestatic 53	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:removeFromPath	(Landroid/database/sqlite/SQLiteDatabase;)I
    //   79: istore 11
    //   81: iload 11
    //   83: invokestatic 512	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:removeFromPath	(I)Ljava/lang/String;
    //   86: astore 12
    //   88: iconst_1
    //   89: istore 13
    //   91: iload 13
    //   93: anewarray 60	java/lang/String
    //   96: astore 14
    //   98: iload_2
    //   99: invokestatic 171	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   102: astore 15
    //   104: aload 14
    //   106: iconst_0
    //   107: aload 15
    //   109: aastore
    //   110: aload 9
    //   112: aload 12
    //   114: aload 14
    //   116: invokevirtual 66	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   119: astore 5
    //   121: aload 5
    //   123: ifnull +60 -> 183
    //   126: aload 9
    //   128: aload_0
    //   129: aload 5
    //   131: iload 11
    //   133: aload_3
    //   134: invokestatic 515	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Landroid/database/Cursor;ILcom/vvt/base/removeFromPath;)Ljava/util/ArrayList;
    //   137: astore 7
    //   139: aload 9
    //   141: ifnull +8 -> 149
    //   144: aload 9
    //   146: invokevirtual 516	android/database/sqlite/SQLiteDatabase:close	()V
    //   149: aload 5
    //   151: ifnull +10 -> 161
    //   154: aload 5
    //   156: invokeinterface 84 1 0
    //   161: getstatic 17	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:a	Z
    //   164: istore 4
    //   166: iload 4
    //   168: ifeq +3 -> 171
    //   171: aload 7
    //   173: areturn
    //   174: aload_1
    //   175: invokestatic 519	com/vvt/capture/yahoo/a/a:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   178: astore 9
    //   180: goto -124 -> 56
    //   183: ldc2_w 520
    //   186: lstore 16
    //   188: lload 16
    //   190: invokestatic 366	android/os/SystemClock:sleep	(J)V
    //   193: iload 11
    //   195: invokestatic 512	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:removeFromPath	(I)Ljava/lang/String;
    //   198: astore 12
    //   200: iconst_1
    //   201: istore 13
    //   203: iload 13
    //   205: anewarray 60	java/lang/String
    //   208: astore 14
    //   210: iload_2
    //   211: invokestatic 171	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   214: astore 15
    //   216: aload 14
    //   218: iconst_0
    //   219: aload 15
    //   221: aastore
    //   222: aload 9
    //   224: aload 12
    //   226: aload 14
    //   228: invokevirtual 66	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   231: astore 5
    //   233: aload 5
    //   235: ifnull -96 -> 139
    //   238: aload 9
    //   240: aload_0
    //   241: aload 5
    //   243: iload 11
    //   245: aload_3
    //   246: invokestatic 515	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Landroid/database/Cursor;ILcom/vvt/base/removeFromPath;)Ljava/util/ArrayList;
    //   249: astore 7
    //   251: goto -112 -> 139
    //   254: astore 9
    //   256: iconst_0
    //   257: istore 8
    //   259: aconst_null
    //   260: astore 9
    //   262: getstatic 22	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:removeFromPath	Z
    //   265: istore 11
    //   267: iload 11
    //   269: ifeq +3 -> 272
    //   272: aload 9
    //   274: ifnull +8 -> 282
    //   277: aload 9
    //   279: invokevirtual 516	android/database/sqlite/SQLiteDatabase:close	()V
    //   282: aload 5
    //   284: ifnull -123 -> 161
    //   287: goto -133 -> 154
    //   290: astore 7
    //   292: iconst_0
    //   293: istore 8
    //   295: aconst_null
    //   296: astore 9
    //   298: aload 9
    //   300: ifnull +8 -> 308
    //   303: aload 9
    //   305: invokevirtual 516	android/database/sqlite/SQLiteDatabase:close	()V
    //   308: aload 5
    //   310: ifnull +10 -> 320
    //   313: aload 5
    //   315: invokeinterface 84 1 0
    //   320: aload 7
    //   322: athrow
    //   323: astore 7
    //   325: goto -27 -> 298
    //   328: astore 10
    //   330: goto -68 -> 262
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	333	0	paramString1	String
    //   0	333	1	paramString2	String
    //   0	333	2	paramInt	int
    //   0	333	3	paramb	com.vvt.base.removeFromPath
    //   1	166	4	bool1	boolean
    //   4	310	5	localCursor	Cursor
    //   9	3	6	bool2	boolean
    //   19	231	7	localArrayList	ArrayList
    //   290	31	7	localObject1	Object
    //   323	1	7	localObject2	Object
    //   30	264	8	bool3	boolean
    //   40	199	9	localObject3	Object
    //   254	1	9	localException1	Exception
    //   260	44	9	localObject4	Object
    //   45	5	10	str1	String
    //   328	1	10	localException2	Exception
    //   62	182	11	i	int
    //   265	3	11	bool4	boolean
    //   86	139	12	str2	String
    //   89	115	13	j	int
    //   96	131	14	arrayOfString	String[]
    //   102	118	15	str3	String
    //   186	3	16	l	long
    // Exception table:
    //   from	to	target	type
    //   26	30	254	java/lang/Exception
    //   49	54	254	java/lang/Exception
    //   174	178	254	java/lang/Exception
    //   26	30	290	finally
    //   49	54	290	finally
    //   174	178	290	finally
    //   74	79	323	finally
    //   81	86	323	finally
    //   91	96	323	finally
    //   98	102	323	finally
    //   107	110	323	finally
    //   114	119	323	finally
    //   133	137	323	finally
    //   188	193	323	finally
    //   193	198	323	finally
    //   203	208	323	finally
    //   210	214	323	finally
    //   219	222	323	finally
    //   226	231	323	finally
    //   245	249	323	finally
    //   262	265	323	finally
    //   74	79	328	java/lang/Exception
    //   81	86	328	java/lang/Exception
    //   91	96	328	java/lang/Exception
    //   98	102	328	java/lang/Exception
    //   107	110	328	java/lang/Exception
    //   114	119	328	java/lang/Exception
    //   133	137	328	java/lang/Exception
    //   188	193	328	java/lang/Exception
    //   193	198	328	java/lang/Exception
    //   203	208	328	java/lang/Exception
    //   210	214	328	java/lang/Exception
    //   219	222	328	java/lang/Exception
    //   226	231	328	java/lang/Exception
    //   245	249	328	java/lang/Exception
  }
  
  /* Error */
  public static ArrayList a(String paramString1, String paramString2, long paramLong1, long paramLong2, com.vvt.base.b paramb)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 7
    //   3: aconst_null
    //   4: astore 8
    //   6: getstatic 17	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:a	Z
    //   9: istore 9
    //   11: iload 9
    //   13: ifeq +3 -> 16
    //   16: new 126	java/util/ArrayList
    //   19: astore 10
    //   21: aload 10
    //   23: invokespecial 127	java/util/ArrayList:<init>	()V
    //   26: aload_1
    //   27: invokestatic 501	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   30: istore 11
    //   32: iload 11
    //   34: ifeq +212 -> 246
    //   37: ldc_w 503
    //   40: astore 12
    //   42: ldc_w 505
    //   45: astore 13
    //   47: aload 12
    //   49: aload 13
    //   51: invokestatic 510	com/vvt/capture/yahoo/a/a:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   54: astore 12
    //   56: aload 12
    //   58: ifnull +153 -> 211
    //   61: aload 12
    //   63: invokestatic 53	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:removeFromPath	(Landroid/database/sqlite/SQLiteDatabase;)I
    //   66: istore 14
    //   68: iload 14
    //   70: invokestatic 525	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:a	(I)Ljava/lang/String;
    //   73: astore 15
    //   75: iconst_2
    //   76: istore 16
    //   78: iload 16
    //   80: anewarray 60	java/lang/String
    //   83: astore 17
    //   85: iconst_0
    //   86: istore 18
    //   88: new 31	java/lang/StringBuilder
    //   91: astore 19
    //   93: aload 19
    //   95: invokespecial 35	java/lang/StringBuilder:<init>	()V
    //   98: aload 19
    //   100: lload_2
    //   101: invokevirtual 528	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   104: astore 19
    //   106: ldc -99
    //   108: astore 20
    //   110: aload 19
    //   112: aload 20
    //   114: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   117: astore 19
    //   119: aload 19
    //   121: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   124: astore 19
    //   126: aload 17
    //   128: iconst_0
    //   129: aload 19
    //   131: aastore
    //   132: iconst_1
    //   133: istore 18
    //   135: new 31	java/lang/StringBuilder
    //   138: astore 19
    //   140: aload 19
    //   142: invokespecial 35	java/lang/StringBuilder:<init>	()V
    //   145: aload 19
    //   147: lload 4
    //   149: invokevirtual 528	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   152: astore 19
    //   154: ldc -99
    //   156: astore 20
    //   158: aload 19
    //   160: aload 20
    //   162: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: astore 19
    //   167: aload 19
    //   169: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   172: astore 19
    //   174: aload 17
    //   176: iload 18
    //   178: aload 19
    //   180: aastore
    //   181: aload 12
    //   183: aload 15
    //   185: aload 17
    //   187: invokevirtual 66	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   190: astore 8
    //   192: aload 8
    //   194: ifnull +61 -> 255
    //   197: aload 12
    //   199: aload_0
    //   200: aload 8
    //   202: iload 14
    //   204: aload 6
    //   206: invokestatic 515	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Landroid/database/Cursor;ILcom/vvt/base/removeFromPath;)Ljava/util/ArrayList;
    //   209: astore 10
    //   211: aload 12
    //   213: ifnull +8 -> 221
    //   216: aload 12
    //   218: invokevirtual 516	android/database/sqlite/SQLiteDatabase:close	()V
    //   221: aload 8
    //   223: ifnull +10 -> 233
    //   226: aload 8
    //   228: invokeinterface 84 1 0
    //   233: getstatic 17	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:a	Z
    //   236: istore 7
    //   238: iload 7
    //   240: ifeq +3 -> 243
    //   243: aload 10
    //   245: areturn
    //   246: aload_1
    //   247: invokestatic 519	com/vvt/capture/yahoo/a/a:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   250: astore 12
    //   252: goto -196 -> 56
    //   255: ldc2_w 520
    //   258: lstore 21
    //   260: lload 21
    //   262: invokestatic 366	android/os/SystemClock:sleep	(J)V
    //   265: iload 14
    //   267: invokestatic 525	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:a	(I)Ljava/lang/String;
    //   270: astore 15
    //   272: iconst_2
    //   273: istore 16
    //   275: iload 16
    //   277: anewarray 60	java/lang/String
    //   280: astore 17
    //   282: iconst_0
    //   283: istore 18
    //   285: new 31	java/lang/StringBuilder
    //   288: astore 19
    //   290: aload 19
    //   292: invokespecial 35	java/lang/StringBuilder:<init>	()V
    //   295: aload 19
    //   297: lload_2
    //   298: invokevirtual 528	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   301: astore 19
    //   303: ldc -99
    //   305: astore 20
    //   307: aload 19
    //   309: aload 20
    //   311: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   314: astore 19
    //   316: aload 19
    //   318: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   321: astore 19
    //   323: aload 17
    //   325: iconst_0
    //   326: aload 19
    //   328: aastore
    //   329: iconst_1
    //   330: istore 18
    //   332: new 31	java/lang/StringBuilder
    //   335: astore 19
    //   337: aload 19
    //   339: invokespecial 35	java/lang/StringBuilder:<init>	()V
    //   342: aload 19
    //   344: lload 4
    //   346: invokevirtual 528	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   349: astore 19
    //   351: ldc -99
    //   353: astore 20
    //   355: aload 19
    //   357: aload 20
    //   359: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   362: astore 19
    //   364: aload 19
    //   366: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   369: astore 19
    //   371: aload 17
    //   373: iload 18
    //   375: aload 19
    //   377: aastore
    //   378: aload 12
    //   380: aload 15
    //   382: aload 17
    //   384: invokevirtual 66	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   387: astore 8
    //   389: aload 8
    //   391: ifnull -180 -> 211
    //   394: aload 12
    //   396: aload_0
    //   397: aload 8
    //   399: iload 14
    //   401: aload 6
    //   403: invokestatic 515	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Landroid/database/Cursor;ILcom/vvt/base/removeFromPath;)Ljava/util/ArrayList;
    //   406: astore 10
    //   408: goto -197 -> 211
    //   411: astore 12
    //   413: iconst_0
    //   414: istore 11
    //   416: aconst_null
    //   417: astore 12
    //   419: getstatic 22	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:removeFromPath	Z
    //   422: istore 14
    //   424: iload 14
    //   426: ifeq +3 -> 429
    //   429: aload 12
    //   431: ifnull +8 -> 439
    //   434: aload 12
    //   436: invokevirtual 516	android/database/sqlite/SQLiteDatabase:close	()V
    //   439: aload 8
    //   441: ifnull -208 -> 233
    //   444: goto -218 -> 226
    //   447: astore 10
    //   449: iconst_0
    //   450: istore 11
    //   452: aconst_null
    //   453: astore 12
    //   455: aload 12
    //   457: ifnull +8 -> 465
    //   460: aload 12
    //   462: invokevirtual 516	android/database/sqlite/SQLiteDatabase:close	()V
    //   465: aload 8
    //   467: ifnull +10 -> 477
    //   470: aload 8
    //   472: invokeinterface 84 1 0
    //   477: aload 10
    //   479: athrow
    //   480: astore 10
    //   482: goto -27 -> 455
    //   485: astore 13
    //   487: goto -68 -> 419
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	490	0	paramString1	String
    //   0	490	1	paramString2	String
    //   0	490	2	paramLong1	long
    //   0	490	4	paramLong2	long
    //   0	490	6	paramb	com.vvt.base.removeFromPath
    //   1	238	7	bool1	boolean
    //   4	467	8	localCursor	Cursor
    //   9	3	9	bool2	boolean
    //   19	388	10	localArrayList	ArrayList
    //   447	31	10	localObject1	Object
    //   480	1	10	localObject2	Object
    //   30	421	11	bool3	boolean
    //   40	355	12	localObject3	Object
    //   411	1	12	localException1	Exception
    //   417	44	12	localObject4	Object
    //   45	5	13	str1	String
    //   485	1	13	localException2	Exception
    //   66	334	14	i	int
    //   422	3	14	bool4	boolean
    //   73	308	15	str2	String
    //   76	200	16	j	int
    //   83	300	17	arrayOfString	String[]
    //   86	288	18	k	int
    //   91	285	19	localObject5	Object
    //   108	250	20	str3	String
    //   258	3	21	l	long
    // Exception table:
    //   from	to	target	type
    //   26	30	411	java/lang/Exception
    //   49	54	411	java/lang/Exception
    //   246	250	411	java/lang/Exception
    //   26	30	447	finally
    //   49	54	447	finally
    //   246	250	447	finally
    //   61	66	480	finally
    //   68	73	480	finally
    //   78	83	480	finally
    //   88	91	480	finally
    //   93	98	480	finally
    //   100	104	480	finally
    //   112	117	480	finally
    //   119	124	480	finally
    //   129	132	480	finally
    //   135	138	480	finally
    //   140	145	480	finally
    //   147	152	480	finally
    //   160	165	480	finally
    //   167	172	480	finally
    //   178	181	480	finally
    //   185	190	480	finally
    //   204	209	480	finally
    //   260	265	480	finally
    //   265	270	480	finally
    //   275	280	480	finally
    //   285	288	480	finally
    //   290	295	480	finally
    //   297	301	480	finally
    //   309	314	480	finally
    //   316	321	480	finally
    //   326	329	480	finally
    //   332	335	480	finally
    //   337	342	480	finally
    //   344	349	480	finally
    //   357	362	480	finally
    //   364	369	480	finally
    //   375	378	480	finally
    //   382	387	480	finally
    //   401	406	480	finally
    //   419	422	480	finally
    //   61	66	485	java/lang/Exception
    //   68	73	485	java/lang/Exception
    //   78	83	485	java/lang/Exception
    //   88	91	485	java/lang/Exception
    //   93	98	485	java/lang/Exception
    //   100	104	485	java/lang/Exception
    //   112	117	485	java/lang/Exception
    //   119	124	485	java/lang/Exception
    //   129	132	485	java/lang/Exception
    //   135	138	485	java/lang/Exception
    //   140	145	485	java/lang/Exception
    //   147	152	485	java/lang/Exception
    //   160	165	485	java/lang/Exception
    //   167	172	485	java/lang/Exception
    //   178	181	485	java/lang/Exception
    //   185	190	485	java/lang/Exception
    //   204	209	485	java/lang/Exception
    //   260	265	485	java/lang/Exception
    //   265	270	485	java/lang/Exception
    //   275	280	485	java/lang/Exception
    //   285	288	485	java/lang/Exception
    //   290	295	485	java/lang/Exception
    //   297	301	485	java/lang/Exception
    //   309	314	485	java/lang/Exception
    //   316	321	485	java/lang/Exception
    //   326	329	485	java/lang/Exception
    //   332	335	485	java/lang/Exception
    //   337	342	485	java/lang/Exception
    //   344	349	485	java/lang/Exception
    //   357	362	485	java/lang/Exception
    //   364	369	485	java/lang/Exception
    //   375	378	485	java/lang/Exception
    //   382	387	485	java/lang/Exception
    //   401	406	485	java/lang/Exception
  }
  
  public static List a(YahooData paramYahooData)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = new com/vvt/events/FxIMAccountEvent;
    ((FxIMAccountEvent)localObject1).<init>();
    long l1 = paramYahooData.b();
    ((FxIMAccountEvent)localObject1).setEventTime(l1);
    int i = FxIMMessageServiceType.YAHOO_MESSENGER.getValue();
    ((FxIMAccountEvent)localObject1).setImServiceId(i);
    Object localObject2 = paramYahooData.f().a();
    ((FxIMAccountEvent)localObject1).setOwnerDisplayName((String)localObject2);
    localObject2 = paramYahooData.f().b();
    ((FxIMAccountEvent)localObject1).setOwnerId((String)localObject2);
    localObject2 = paramYahooData.f().c();
    ((FxIMAccountEvent)localObject1).setOwnerProfilePicture((byte[])localObject2);
    localObject2 = paramYahooData.f().g();
    ((FxIMAccountEvent)localObject1).setOwnerProfilePicturePath((String)localObject2);
    localObject2 = paramYahooData.f().d();
    ((FxIMAccountEvent)localObject1).setOwnerStatusMessage((String)localObject2);
    localArrayList.add(localObject1);
    localObject2 = new com/vvt/events/FxIMConversationEvent;
    ((FxIMConversationEvent)localObject2).<init>();
    localObject1 = paramYahooData.i().a();
    ((FxIMConversationEvent)localObject2).setConversationId((String)localObject1);
    localObject1 = paramYahooData.i().c();
    ((FxIMConversationEvent)localObject2).setConversationProfilePicture((byte[])localObject1);
    localObject1 = paramYahooData.i().d();
    ((FxIMConversationEvent)localObject2).setConversationProfilePicturePath((String)localObject1);
    localObject1 = paramYahooData.i().b();
    ((FxIMConversationEvent)localObject2).setConversationTitle((String)localObject1);
    localObject1 = paramYahooData.i().e();
    ((FxIMConversationEvent)localObject2).setConversationStatusMessage((String)localObject1);
    l1 = paramYahooData.b();
    ((FxIMConversationEvent)localObject2).setEventTime(l1);
    int j = FxIMMessageServiceType.YAHOO_MESSENGER.getValue();
    ((FxIMConversationEvent)localObject2).setImServiceId(j);
    localObject1 = paramYahooData.f().b();
    ((FxIMConversationEvent)localObject2).setOwnerId((String)localObject1);
    Object localObject3 = new java/util/HashSet;
    ((HashSet)localObject3).<init>();
    localObject1 = paramYahooData.e();
    Object localObject4 = ((List)localObject1).iterator();
    boolean bool1;
    Object localObject6;
    for (;;)
    {
      bool1 = ((Iterator)localObject4).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.e)((Iterator)localObject4).next();
      localObject5 = ((com.vvt.im.events.info.e)localObject1).d();
      localObject6 = paramYahooData.f().b();
      boolean bool4 = ((String)localObject5).equalsIgnoreCase((String)localObject6);
      if (bool4)
      {
        bool1 = a;
        if (!bool1) {}
      }
      else
      {
        localObject1 = ((com.vvt.im.events.info.e)localObject1).d();
        ((HashSet)localObject3).add(localObject1);
      }
    }
    ((FxIMConversationEvent)localObject2).setParticipantContactIds((HashSet)localObject3);
    localArrayList.add(localObject2);
    localObject1 = paramYahooData.e();
    localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.e)((Iterator)localObject2).next();
      localObject3 = ((com.vvt.im.events.info.e)localObject1).d();
      localObject4 = paramYahooData.f().b();
      boolean bool5 = ((String)localObject3).equalsIgnoreCase((String)localObject4);
      if (bool5)
      {
        bool1 = a;
        if (!bool1) {}
      }
      else
      {
        localObject3 = new com/vvt/events/FxIMContactEvent;
        ((FxIMContactEvent)localObject3).<init>();
        localObject4 = ((com.vvt.im.events.info.e)localObject1).c();
        ((FxIMContactEvent)localObject3).setContactDisplayName((String)localObject4);
        localObject4 = ((com.vvt.im.events.info.e)localObject1).d();
        ((FxIMContactEvent)localObject3).setContactId((String)localObject4);
        localObject4 = ((com.vvt.im.events.info.e)localObject1).e();
        ((FxIMContactEvent)localObject3).setContactProfilePicture((byte[])localObject4);
        localObject4 = ((com.vvt.im.events.info.e)localObject1).a();
        ((FxIMContactEvent)localObject3).setContactProfilePicturePath((String)localObject4);
        localObject1 = ((com.vvt.im.events.info.e)localObject1).f();
        ((FxIMContactEvent)localObject3).setContactStatusMessage((String)localObject1);
        long l2 = paramYahooData.b();
        ((FxIMContactEvent)localObject3).setEventTime(l2);
        int k = FxIMMessageServiceType.YAHOO_MESSENGER.getValue();
        ((FxIMContactEvent)localObject3).setImServiceId(k);
        localObject1 = paramYahooData.f().b();
        ((FxIMContactEvent)localObject3).setOwnerId((String)localObject1);
        localArrayList.add(localObject3);
      }
    }
    localObject3 = new com/vvt/events/FxIMMessageEvent;
    ((FxIMMessageEvent)localObject3).<init>();
    localObject4 = new java/util/ArrayList;
    ((ArrayList)localObject4).<init>();
    localObject1 = paramYahooData.j();
    localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      bool2 = ((Iterator)localObject2).hasNext();
      if (!bool2) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.a)((Iterator)localObject2).next();
      localObject5 = new com/vvt/events/d;
      ((com.vvt.events.d)localObject5).<init>();
      localObject6 = ((com.vvt.im.events.info.a)localObject1).e();
      ((com.vvt.events.d)localObject5).b((byte[])localObject6);
      localObject6 = ((com.vvt.im.events.info.a)localObject1).a();
      ((com.vvt.events.d)localObject5).a((String)localObject6);
      localObject6 = ((com.vvt.im.events.info.a)localObject1).c();
      ((com.vvt.events.d)localObject5).b((String)localObject6);
      localObject6 = ((com.vvt.im.events.info.a)localObject1).b();
      ((com.vvt.events.d)localObject5).c((String)localObject6);
      localObject6 = ((com.vvt.im.events.info.a)localObject1).f();
      ((com.vvt.events.d)localObject5).d((String)localObject6);
      localObject1 = ((com.vvt.im.events.info.a)localObject1).d();
      ((com.vvt.events.d)localObject5).a((byte[])localObject1);
      ((List)localObject4).add(localObject5);
    }
    boolean bool2 = false;
    localObject1 = null;
    i = paramYahooData.a();
    int n = MessageType.ShareLocation.getNumber();
    i &= n;
    Object localObject5 = MessageType.ShareLocation;
    n = ((MessageType)localObject5).getNumber();
    if (i == n)
    {
      localObject1 = new com/vvt/events/e;
      ((com.vvt.events.e)localObject1).<init>();
      float f = paramYahooData.g().d();
      ((com.vvt.events.e)localObject1).a(f);
      double d1 = paramYahooData.g().a();
      ((com.vvt.events.e)localObject1).a(d1);
      d1 = paramYahooData.g().b();
      ((com.vvt.events.e)localObject1).b(d1);
      localObject2 = paramYahooData.g().c();
      ((com.vvt.events.e)localObject1).a((String)localObject2);
    }
    localObject2 = paramYahooData.i().a();
    ((FxIMMessageEvent)localObject3).setConversationId((String)localObject2);
    localObject2 = paramYahooData.d();
    localObject5 = YahooData.Direction.IN;
    if (localObject2 == localObject5) {}
    for (localObject2 = FxEventDirection.IN;; localObject2 = FxEventDirection.OUT)
    {
      ((FxIMMessageEvent)localObject3).setDirection((FxEventDirection)localObject2);
      long l3 = paramYahooData.b();
      ((FxIMMessageEvent)localObject3).setEventTime(l3);
      i = FxIMMessageServiceType.YAHOO_MESSENGER.getValue();
      ((FxIMMessageEvent)localObject3).setImServiceId(i);
      localObject2 = paramYahooData.c();
      ((FxIMMessageEvent)localObject3).setMessage((String)localObject2);
      localObject2 = new com/vvt/events/e;
      ((com.vvt.events.e)localObject2).<init>();
      ((FxIMMessageEvent)localObject3).setMessageLocation((com.vvt.events.e)localObject2);
      ((FxIMMessageEvent)localObject3).setShareLocation((com.vvt.events.e)localObject1);
      int m = paramYahooData.a();
      ((FxIMMessageEvent)localObject3).setTextRepresentation(m);
      localObject1 = paramYahooData.d();
      localObject2 = YahooData.Direction.IN;
      if (localObject1 == localObject2)
      {
        localObject1 = paramYahooData.h().a();
        ((FxIMMessageEvent)localObject3).setSenderId((String)localObject1);
      }
      localObject2 = ((List)localObject4).iterator();
      for (;;)
      {
        boolean bool3 = ((Iterator)localObject2).hasNext();
        if (!bool3) {
          break;
        }
        localObject1 = (com.vvt.events.d)((Iterator)localObject2).next();
        ((FxIMMessageEvent)localObject3).addAttachment((com.vvt.events.d)localObject1);
      }
    }
    localArrayList.add(localObject3);
    return localArrayList;
  }
  
  public static void a(RunningMode paramRunningMode)
  {
    d = paramRunningMode;
  }
  
  private static boolean a(int paramInt, com.vvt.base.b paramb, long paramLong)
  {
    int i = 1;
    float f = Float.MIN_VALUE;
    boolean bool4 = false;
    long l1 = 0L;
    boolean bool5 = paramLong < l1;
    if (!bool5) {}
    label94:
    boolean bool3;
    for (bool5 = false;; bool5 = bool3)
    {
      long l2;
      if (paramInt == i)
      {
        l2 = paramb.b();
        boolean bool1 = paramLong < l2;
        if (!bool1) {
          break label94;
        }
      }
      for (;;)
      {
        bool5 = a;
        if (bool5) {}
        return bool4;
        int j = 2;
        f = 2.8E-45F;
        if (paramInt == j)
        {
          l2 = paramb.d();
          boolean bool2 = paramLong < l2;
          if (bool2) {}
        }
        else
        {
          label135:
          do
          {
            do
            {
              bool4 = bool5;
              break;
              int k = 3;
              f = 4.2E-45F;
              if (paramInt != k) {
                break label135;
              }
              l2 = paramb.c();
              bool3 = paramLong < l2;
            } while (!bool3);
            break;
            l2 = paramb.e();
            bool3 = paramLong < l2;
          } while (!bool3);
        }
      }
    }
  }
  
  public static boolean a(String paramString)
  {
    boolean bool1 = false;
    String str1 = b(paramString);
    boolean bool2 = a;
    if (bool2) {}
    String str2 = c;
    if (str2 == null) {
      c = str1;
    }
    for (;;)
    {
      boolean bool3 = a;
      if (bool3) {}
      return bool1;
      str2 = c;
      bool2 = str2.equals(str1);
      if (!bool2)
      {
        c = str1;
        bool1 = true;
      }
    }
  }
  
  public static String[] a()
  {
    int i = 2;
    int j = 1;
    String[] arrayOfString = new String[i];
    Object localObject = new Object[i];
    localObject[0] = "/data/data";
    localObject[j] = "com.yahoo.mobile.client.android.im";
    String str = String.format("%s/%s/databases", (Object[])localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    str = str + "/messenger.db";
    arrayOfString[0] = str;
    localObject = new Object[i];
    localObject[0] = "/dbdata/databases";
    localObject[j] = "com.yahoo.mobile.client.android.im";
    str = String.format("%s/%s", (Object[])localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    str = str + "/messenger.db";
    arrayOfString[j] = str;
    return arrayOfString;
  }
  
  private static int b(SQLiteDatabase paramSQLiteDatabase)
  {
    int i = 1;
    localCursor = null;
    try
    {
      String str1 = c(paramSQLiteDatabase);
      String str2 = d();
      int j = 1;
      String[] arrayOfString = new String[j];
      arrayOfString[0] = str1;
      localCursor = paramSQLiteDatabase.rawQuery(str2, arrayOfString);
      if (localCursor != null)
      {
        boolean bool1 = localCursor.moveToNext();
        if (bool1)
        {
          str1 = "_id";
          int k = localCursor.getColumnIndex(str1);
          i = localCursor.getInt(k);
        }
      }
      if (localCursor == null) {
        break label86;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        label86:
        boolean bool2 = b;
        if ((bool2) && (localCursor == null)) {}
      }
    }
    finally
    {
      if (localCursor == null) {
        break label118;
      }
      localCursor.close();
    }
    localCursor.close();
    return i;
  }
  
  public static long b()
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = false;
    long l = d(null);
    boolean bool2 = a;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    return l;
  }
  
  /* Error */
  private static com.vvt.im.events.info.d b(SQLiteDatabase paramSQLiteDatabase, String paramString, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 184	com/vvt/im/events/info/d
    //   5: astore 4
    //   7: aload 4
    //   9: invokespecial 778	com/vvt/im/events/info/d:<init>	()V
    //   12: getstatic 17	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:a	Z
    //   15: istore 5
    //   17: iload 5
    //   19: ifeq +55 -> 74
    //   22: ldc_w 780
    //   25: astore 6
    //   27: new 31	java/lang/StringBuilder
    //   30: astore 7
    //   32: aload 7
    //   34: invokespecial 35	java/lang/StringBuilder:<init>	()V
    //   37: ldc_w 782
    //   40: astore 8
    //   42: aload 7
    //   44: aload 8
    //   46: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: astore 7
    //   51: aload 7
    //   53: iload_2
    //   54: invokevirtual 44	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   57: astore 7
    //   59: aload 7
    //   61: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   64: astore 7
    //   66: aload 6
    //   68: aload 7
    //   70: invokestatic 788	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   73: pop
    //   74: iload_2
    //   75: invokestatic 790	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	(I)Ljava/lang/String;
    //   78: astore 6
    //   80: iconst_0
    //   81: istore 9
    //   83: aconst_null
    //   84: astore 7
    //   86: aload_0
    //   87: aload 6
    //   89: aconst_null
    //   90: invokevirtual 66	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   93: astore_3
    //   94: aload_3
    //   95: ifnull +145 -> 240
    //   98: aload_3
    //   99: invokeinterface 72 1 0
    //   104: istore 5
    //   106: iload 5
    //   108: ifeq +132 -> 240
    //   111: ldc_w 792
    //   114: astore 6
    //   116: aload_3
    //   117: aload 6
    //   119: invokeinterface 78 2 0
    //   124: istore 5
    //   126: aload_3
    //   127: iload 5
    //   129: invokeinterface 81 2 0
    //   134: astore 6
    //   136: ldc_w 318
    //   139: astore 7
    //   141: aload_3
    //   142: aload 7
    //   144: invokeinterface 78 2 0
    //   149: istore 9
    //   151: aload_3
    //   152: iload 9
    //   154: invokeinterface 81 2 0
    //   159: astore 7
    //   161: ldc_w 316
    //   164: astore 8
    //   166: aload_3
    //   167: aload 8
    //   169: invokeinterface 78 2 0
    //   174: istore 10
    //   176: aload_3
    //   177: iload 10
    //   179: invokeinterface 81 2 0
    //   184: astore 8
    //   186: aload 4
    //   188: aload 6
    //   190: invokevirtual 793	com/vvt/im/events/info/d:removeFromPath	(Ljava/lang/String;)V
    //   193: aload 4
    //   195: aload 6
    //   197: invokevirtual 794	com/vvt/im/events/info/d:a	(Ljava/lang/String;)V
    //   200: aload 4
    //   202: aload 8
    //   204: invokevirtual 795	com/vvt/im/events/info/d:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   207: aload 7
    //   209: ifnull +31 -> 240
    //   212: aload 7
    //   214: invokestatic 325	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   217: istore 9
    //   219: iload 9
    //   221: lookupswitch	default:+19->240, 2:+32->253
    //   240: aload_3
    //   241: ifnull +9 -> 250
    //   244: aload_3
    //   245: invokeinterface 84 1 0
    //   250: aload 4
    //   252: areturn
    //   253: getstatic 341	com/vvt/im/events/ImType:YAHOO	Lcom/vvt/im/events/ImType;
    //   256: astore 7
    //   258: getstatic 798	com/vvt/im/events/ImMediaFileType:OWNER_PROFILE	Lcom/vvt/im/events/ImMediaFileType;
    //   261: astore 8
    //   263: aload_1
    //   264: aload 7
    //   266: aload 8
    //   268: invokestatic 107	com/vvt/im/a/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Lcom/vvt/im/events/ImType;Lcom/vvt/im/events/ImMediaFileType;)Ljava/lang/String;
    //   271: astore 7
    //   273: getstatic 798	com/vvt/im/events/ImMediaFileType:OWNER_PROFILE	Lcom/vvt/im/events/ImMediaFileType;
    //   276: astore 8
    //   278: aload 8
    //   280: invokestatic 113	com/vvt/im/a/MyUncaughtExceptionHandler:a	(Lcom/vvt/im/events/ImMediaFileType;)Ljava/lang/String;
    //   283: astore 8
    //   285: new 31	java/lang/StringBuilder
    //   288: astore 11
    //   290: aload 11
    //   292: invokespecial 35	java/lang/StringBuilder:<init>	()V
    //   295: aload 11
    //   297: aload 7
    //   299: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   302: astore 11
    //   304: getstatic 110	java/io/File:separator	Ljava/lang/String;
    //   307: astore 12
    //   309: aload 11
    //   311: aload 12
    //   313: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   316: astore 11
    //   318: aload 11
    //   320: aload 8
    //   322: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   325: astore 11
    //   327: aload 11
    //   329: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   332: astore 11
    //   334: ldc_w 327
    //   337: astore 12
    //   339: iconst_1
    //   340: istore 13
    //   342: iload 13
    //   344: anewarray 4	java/lang/Object
    //   347: astore 14
    //   349: aload 14
    //   351: iconst_0
    //   352: aload 6
    //   354: aastore
    //   355: aload 12
    //   357: aload 14
    //   359: invokestatic 330	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   362: astore 6
    //   364: aload 6
    //   366: invokestatic 333	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:f	(Ljava/lang/String;)[B
    //   369: astore 6
    //   371: aload 6
    //   373: ifnull -133 -> 240
    //   376: aload 6
    //   378: arraylength
    //   379: istore 15
    //   381: iconst_2
    //   382: istore 13
    //   384: iload 15
    //   386: iload 13
    //   388: if_icmplt -148 -> 240
    //   391: iconst_0
    //   392: istore 15
    //   394: aconst_null
    //   395: astore 12
    //   397: aload 6
    //   399: iconst_0
    //   400: baload
    //   401: istore 15
    //   403: bipush 60
    //   405: istore 13
    //   407: iload 15
    //   409: iload 13
    //   411: if_icmpeq -171 -> 240
    //   414: iconst_1
    //   415: istore 15
    //   417: aload 6
    //   419: iload 15
    //   421: baload
    //   422: istore 15
    //   424: bipush 33
    //   426: istore 13
    //   428: iload 15
    //   430: iload 13
    //   432: if_icmpeq -192 -> 240
    //   435: aload 6
    //   437: aload 7
    //   439: aload 8
    //   441: invokestatic 352	com/vvt/io/d:a	([BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   444: pop
    //   445: aload 4
    //   447: aload 11
    //   449: invokevirtual 800	com/vvt/im/events/info/d:f	(Ljava/lang/String;)V
    //   452: goto -212 -> 240
    //   455: astore 6
    //   457: getstatic 22	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:removeFromPath	Z
    //   460: istore 5
    //   462: iload 5
    //   464: ifeq +3 -> 467
    //   467: aload_3
    //   468: ifnull -218 -> 250
    //   471: goto -227 -> 244
    //   474: astore 16
    //   476: aconst_null
    //   477: astore 4
    //   479: aload 16
    //   481: astore_3
    //   482: aload 4
    //   484: ifnull +10 -> 494
    //   487: aload 4
    //   489: invokeinterface 84 1 0
    //   494: aload_3
    //   495: athrow
    //   496: astore 16
    //   498: aload_3
    //   499: astore 4
    //   501: aload 16
    //   503: astore_3
    //   504: goto -22 -> 482
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	507	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	507	1	paramString	String
    //   0	507	2	paramInt	int
    //   1	503	3	localObject1	Object
    //   5	495	4	localObject2	Object
    //   15	92	5	bool1	boolean
    //   124	4	5	i	int
    //   460	3	5	bool2	boolean
    //   25	411	6	localObject3	Object
    //   455	1	6	localException	Exception
    //   30	408	7	localObject4	Object
    //   40	400	8	localObject5	Object
    //   81	139	9	j	int
    //   174	4	10	k	int
    //   288	160	11	localObject6	Object
    //   307	89	12	str	String
    //   340	93	13	m	int
    //   347	11	14	arrayOfObject	Object[]
    //   379	54	15	n	int
    //   474	6	16	localObject7	Object
    //   496	6	16	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   12	15	455	java/lang/Exception
    //   27	30	455	java/lang/Exception
    //   32	37	455	java/lang/Exception
    //   44	49	455	java/lang/Exception
    //   53	57	455	java/lang/Exception
    //   59	64	455	java/lang/Exception
    //   68	74	455	java/lang/Exception
    //   74	78	455	java/lang/Exception
    //   89	93	455	java/lang/Exception
    //   98	104	455	java/lang/Exception
    //   117	124	455	java/lang/Exception
    //   127	134	455	java/lang/Exception
    //   142	149	455	java/lang/Exception
    //   152	159	455	java/lang/Exception
    //   167	174	455	java/lang/Exception
    //   177	184	455	java/lang/Exception
    //   188	193	455	java/lang/Exception
    //   195	200	455	java/lang/Exception
    //   202	207	455	java/lang/Exception
    //   212	217	455	java/lang/Exception
    //   253	256	455	java/lang/Exception
    //   258	261	455	java/lang/Exception
    //   266	271	455	java/lang/Exception
    //   273	276	455	java/lang/Exception
    //   278	283	455	java/lang/Exception
    //   285	288	455	java/lang/Exception
    //   290	295	455	java/lang/Exception
    //   297	302	455	java/lang/Exception
    //   304	307	455	java/lang/Exception
    //   311	316	455	java/lang/Exception
    //   320	325	455	java/lang/Exception
    //   327	332	455	java/lang/Exception
    //   342	347	455	java/lang/Exception
    //   352	355	455	java/lang/Exception
    //   357	362	455	java/lang/Exception
    //   364	369	455	java/lang/Exception
    //   376	379	455	java/lang/Exception
    //   399	401	455	java/lang/Exception
    //   419	422	455	java/lang/Exception
    //   439	445	455	java/lang/Exception
    //   447	452	455	java/lang/Exception
    //   12	15	474	finally
    //   27	30	474	finally
    //   32	37	474	finally
    //   44	49	474	finally
    //   53	57	474	finally
    //   59	64	474	finally
    //   68	74	474	finally
    //   74	78	474	finally
    //   89	93	474	finally
    //   98	104	496	finally
    //   117	124	496	finally
    //   127	134	496	finally
    //   142	149	496	finally
    //   152	159	496	finally
    //   167	174	496	finally
    //   177	184	496	finally
    //   188	193	496	finally
    //   195	200	496	finally
    //   202	207	496	finally
    //   212	217	496	finally
    //   253	256	496	finally
    //   258	261	496	finally
    //   266	271	496	finally
    //   273	276	496	finally
    //   278	283	496	finally
    //   285	288	496	finally
    //   290	295	496	finally
    //   297	302	496	finally
    //   304	307	496	finally
    //   311	316	496	finally
    //   320	325	496	finally
    //   327	332	496	finally
    //   342	347	496	finally
    //   352	355	496	finally
    //   357	362	496	finally
    //   364	369	496	finally
    //   376	379	496	finally
    //   399	401	496	finally
    //   419	422	496	finally
    //   439	445	496	finally
    //   447	452	496	finally
    //   457	460	496	finally
  }
  
  private static String b(int paramInt)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    return "SELECT _id, iAmSender, profile_id, buddy_id, message, metaData, dateSent FROM Messages_" + paramInt + " ORDER BY _id DESC LIMIT ?";
  }
  
  public static String b(String paramString)
  {
    boolean bool = a;
    if (bool) {}
    bool = a;
    if ((!bool) || (paramString != null)) {}
    String str;
    for (SQLiteDatabase localSQLiteDatabase = com.vvt.capture.yahoo.a.a.a(paramString);; localSQLiteDatabase = com.vvt.capture.yahoo.a.a.a("com.yahoo.mobile.client.android.im", str))
    {
      str = c(localSQLiteDatabase);
      if (localSQLiteDatabase != null) {
        localSQLiteDatabase.close();
      }
      bool = a;
      if (bool) {}
      bool = a;
      if (bool) {}
      return str;
      str = "messenger.db";
    }
  }
  
  private static String c()
  {
    return "SELECT yahooId FROM CurrentUser";
  }
  
  private static String c(int paramInt)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    return "SELECT profile, presenceMessage, imagePreference FROM Profiles_" + paramInt + " LEFT JOIN Presence_" + paramInt + " LEFT JOIN (SELECT imagePreference FROM BuddyImage_" + paramInt + " WHERE buddies_id=-2)";
  }
  
  /* Error */
  private static String c(SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: invokestatic 813	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	()Ljava/lang/String;
    //   5: astore_2
    //   6: iconst_0
    //   7: istore_3
    //   8: aconst_null
    //   9: astore 4
    //   11: aload_0
    //   12: aload_2
    //   13: aconst_null
    //   14: invokevirtual 66	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   17: astore_2
    //   18: aload_2
    //   19: ifnull +76 -> 95
    //   22: aload_2
    //   23: invokeinterface 72 1 0
    //   28: istore_3
    //   29: iload_3
    //   30: ifeq +65 -> 95
    //   33: ldc_w 312
    //   36: astore 4
    //   38: aload_2
    //   39: aload 4
    //   41: invokeinterface 78 2 0
    //   46: istore_3
    //   47: aload_2
    //   48: iload_3
    //   49: invokeinterface 81 2 0
    //   54: astore_1
    //   55: aload_1
    //   56: ifnull +39 -> 95
    //   59: aload_1
    //   60: invokevirtual 400	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   63: astore_1
    //   64: ldc_w 815
    //   67: astore 4
    //   69: aload_1
    //   70: aload 4
    //   72: invokevirtual 435	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   75: istore_3
    //   76: iconst_m1
    //   77: istore 5
    //   79: iload_3
    //   80: iload 5
    //   82: if_icmpeq +13 -> 95
    //   85: iconst_0
    //   86: istore 5
    //   88: aload_1
    //   89: iconst_0
    //   90: iload_3
    //   91: invokevirtual 819	java/lang/String:substring	(II)Ljava/lang/String;
    //   94: astore_1
    //   95: getstatic 17	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:a	Z
    //   98: istore_3
    //   99: iload_3
    //   100: ifeq +3 -> 103
    //   103: aload_2
    //   104: ifnull +9 -> 113
    //   107: aload_2
    //   108: invokeinterface 84 1 0
    //   113: aload_1
    //   114: areturn
    //   115: astore_2
    //   116: aconst_null
    //   117: astore_2
    //   118: getstatic 22	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:removeFromPath	Z
    //   121: istore_3
    //   122: iload_3
    //   123: ifeq +3 -> 126
    //   126: aload_2
    //   127: ifnull -14 -> 113
    //   130: goto -23 -> 107
    //   133: astore 6
    //   135: aconst_null
    //   136: astore_2
    //   137: aload 6
    //   139: astore_1
    //   140: aload_2
    //   141: ifnull +9 -> 150
    //   144: aload_2
    //   145: invokeinterface 84 1 0
    //   150: aload_1
    //   151: athrow
    //   152: astore_1
    //   153: goto -13 -> 140
    //   156: astore 4
    //   158: goto -40 -> 118
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	161	0	paramSQLiteDatabase	SQLiteDatabase
    //   1	150	1	localObject1	Object
    //   152	1	1	localObject2	Object
    //   5	103	2	localObject3	Object
    //   115	1	2	localException1	Exception
    //   117	28	2	localObject4	Object
    //   7	23	3	bool1	boolean
    //   46	45	3	i	int
    //   98	25	3	bool2	boolean
    //   9	62	4	str	String
    //   156	1	4	localException2	Exception
    //   77	10	5	j	int
    //   133	5	6	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   2	5	115	java/lang/Exception
    //   13	17	115	java/lang/Exception
    //   2	5	133	finally
    //   13	17	133	finally
    //   22	28	152	finally
    //   39	46	152	finally
    //   48	54	152	finally
    //   59	63	152	finally
    //   70	75	152	finally
    //   90	94	152	finally
    //   95	98	152	finally
    //   118	121	152	finally
    //   22	28	156	java/lang/Exception
    //   39	46	156	java/lang/Exception
    //   48	54	156	java/lang/Exception
    //   59	63	156	java/lang/Exception
    //   70	75	156	java/lang/Exception
    //   90	94	156	java/lang/Exception
    //   95	98	156	java/lang/Exception
  }
  
  public static String c(String paramString)
  {
    return p.a(paramString, "busybox");
  }
  
  /* Error */
  public static long d(String paramString)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: i2l
    //   2: lstore_1
    //   3: aconst_null
    //   4: astore_3
    //   5: getstatic 17	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:a	Z
    //   8: istore 4
    //   10: iload 4
    //   12: ifeq +3 -> 15
    //   15: getstatic 17	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:a	Z
    //   18: istore 4
    //   20: iload 4
    //   22: ifeq +3 -> 25
    //   25: aload_0
    //   26: ifnull +144 -> 170
    //   29: aload_0
    //   30: invokestatic 519	com/vvt/capture/yahoo/a/a:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   33: astore 5
    //   35: ldc_w 826
    //   38: astore 6
    //   40: aload 5
    //   42: invokestatic 828	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:a	(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/String;
    //   45: astore 7
    //   47: iconst_0
    //   48: istore 8
    //   50: aconst_null
    //   51: astore 9
    //   53: ldc_w 830
    //   56: astore 10
    //   58: aload 5
    //   60: aload 7
    //   62: aconst_null
    //   63: aconst_null
    //   64: aconst_null
    //   65: aconst_null
    //   66: aconst_null
    //   67: aload 6
    //   69: aload 10
    //   71: invokevirtual 834	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   74: astore 9
    //   76: aload 9
    //   78: ifnull +272 -> 350
    //   81: aload 9
    //   83: invokeinterface 72 1 0
    //   88: istore 11
    //   90: iload 11
    //   92: ifeq +100 -> 192
    //   95: ldc -97
    //   97: astore 7
    //   99: aload 9
    //   101: aload 7
    //   103: invokeinterface 78 2 0
    //   108: istore 11
    //   110: aload 9
    //   112: iload 11
    //   114: invokeinterface 211 2 0
    //   119: lstore 12
    //   121: aload 5
    //   123: ifnull +8 -> 131
    //   126: aload 5
    //   128: invokevirtual 516	android/database/sqlite/SQLiteDatabase:close	()V
    //   131: aload 9
    //   133: ifnull +10 -> 143
    //   136: aload 9
    //   138: invokeinterface 84 1 0
    //   143: lload 12
    //   145: lstore 14
    //   147: getstatic 17	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:a	Z
    //   150: istore 8
    //   152: iload 8
    //   154: ifeq +3 -> 157
    //   157: getstatic 17	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:a	Z
    //   160: istore 8
    //   162: iload 8
    //   164: ifeq +3 -> 167
    //   167: lload 14
    //   169: lreturn
    //   170: ldc_w 503
    //   173: astore 5
    //   175: ldc_w 505
    //   178: astore 7
    //   180: aload 5
    //   182: aload 7
    //   184: invokestatic 510	com/vvt/capture/yahoo/a/a:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   187: astore 5
    //   189: goto -154 -> 35
    //   192: lconst_0
    //   193: lstore 12
    //   195: goto -74 -> 121
    //   198: astore 5
    //   200: iconst_0
    //   201: istore 4
    //   203: aconst_null
    //   204: astore 5
    //   206: getstatic 22	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:removeFromPath	Z
    //   209: istore 11
    //   211: iload 11
    //   213: ifeq +3 -> 216
    //   216: aload_3
    //   217: ifnull +7 -> 224
    //   220: aload_3
    //   221: invokevirtual 516	android/database/sqlite/SQLiteDatabase:close	()V
    //   224: aload 5
    //   226: ifnull +10 -> 236
    //   229: aload 5
    //   231: invokeinterface 84 1 0
    //   236: lload_1
    //   237: lstore 14
    //   239: goto -92 -> 147
    //   242: astore 5
    //   244: iconst_0
    //   245: istore 11
    //   247: aconst_null
    //   248: astore 7
    //   250: aload 7
    //   252: ifnull +8 -> 260
    //   255: aload 7
    //   257: invokevirtual 516	android/database/sqlite/SQLiteDatabase:close	()V
    //   260: aload_3
    //   261: ifnull +9 -> 270
    //   264: aload_3
    //   265: invokeinterface 84 1 0
    //   270: aload 5
    //   272: athrow
    //   273: astore 16
    //   275: aload 5
    //   277: astore 7
    //   279: aload 16
    //   281: astore 5
    //   283: goto -33 -> 250
    //   286: astore 7
    //   288: aload 9
    //   290: astore_3
    //   291: aload 7
    //   293: astore 16
    //   295: aload 5
    //   297: astore 7
    //   299: aload 16
    //   301: astore 5
    //   303: goto -53 -> 250
    //   306: astore 16
    //   308: aload_3
    //   309: astore 7
    //   311: aload 5
    //   313: astore_3
    //   314: aload 16
    //   316: astore 5
    //   318: goto -68 -> 250
    //   321: astore 7
    //   323: aconst_null
    //   324: astore 16
    //   326: aload 5
    //   328: astore_3
    //   329: iconst_0
    //   330: istore 4
    //   332: aconst_null
    //   333: astore 5
    //   335: goto -129 -> 206
    //   338: astore 7
    //   340: aload 5
    //   342: astore_3
    //   343: aload 9
    //   345: astore 5
    //   347: goto -141 -> 206
    //   350: lload_1
    //   351: lstore 12
    //   353: goto -232 -> 121
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	356	0	paramString	String
    //   2	349	1	l1	long
    //   4	339	3	localObject1	Object
    //   8	323	4	bool1	boolean
    //   33	155	5	localObject2	Object
    //   198	1	5	localException1	Exception
    //   204	26	5	localObject3	Object
    //   242	34	5	localObject4	Object
    //   281	65	5	localObject5	Object
    //   38	30	6	str1	String
    //   45	233	7	localObject6	Object
    //   286	6	7	localObject7	Object
    //   297	13	7	localObject8	Object
    //   321	1	7	localException2	Exception
    //   338	1	7	localException3	Exception
    //   48	115	8	bool2	boolean
    //   51	293	9	localCursor	Cursor
    //   56	14	10	str2	String
    //   88	3	11	bool3	boolean
    //   108	5	11	i	int
    //   209	37	11	bool4	boolean
    //   119	233	12	l2	long
    //   145	93	14	l3	long
    //   273	7	16	localObject9	Object
    //   293	7	16	localObject10	Object
    //   306	9	16	localObject11	Object
    //   324	1	16	localObject12	Object
    // Exception table:
    //   from	to	target	type
    //   29	33	198	java/lang/Exception
    //   182	187	198	java/lang/Exception
    //   29	33	242	finally
    //   182	187	242	finally
    //   40	45	273	finally
    //   69	74	273	finally
    //   81	88	286	finally
    //   101	108	286	finally
    //   112	119	286	finally
    //   206	209	306	finally
    //   40	45	321	java/lang/Exception
    //   69	74	321	java/lang/Exception
    //   81	88	338	java/lang/Exception
    //   101	108	338	java/lang/Exception
    //   112	119	338	java/lang/Exception
  }
  
  private static String d()
  {
    return "SELECT Users._id FROM Users WHERE Users.yahooId = ?";
  }
  
  private static String d(int paramInt)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    return "SELECT displayName, yahooId, presenceMessage, imagePreference FROM Buddies_" + paramInt + " LEFT JOIN (SELECT imagePreference FROM BuddyImage_" + paramInt + " WHERE buddies_id = ?) WHERE _id = ?";
  }
  
  private static String e(int paramInt)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    return "SELECT metaData FROM Messages_" + paramInt + " WHERE _id = ?";
  }
  
  private static String e(String paramString)
  {
    String str1 = null;
    String str2 = MimeTypeMap.getFileExtensionFromUrl(paramString);
    if (str2 != null) {
      str1 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str2);
    }
    return str1;
  }
  
  /* Error */
  private static byte[] f(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: getstatic 17	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:a	Z
    //   5: istore_2
    //   6: iload_2
    //   7: ifeq +3 -> 10
    //   10: iconst_0
    //   11: newarray <illegal type>
    //   13: astore_3
    //   14: new 858	org/apache/http/impl/client/DefaultHttpClient
    //   17: astore 4
    //   19: aload 4
    //   21: invokespecial 859	org/apache/http/impl/client/DefaultHttpClient:<init>	()V
    //   24: new 861	org/apache/http/client/methods/HttpGet
    //   27: astore 5
    //   29: aload 5
    //   31: aload_0
    //   32: invokespecial 862	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   35: aconst_null
    //   36: astore_1
    //   37: new 864	java/io/ByteArrayOutputStream
    //   40: astore 6
    //   42: aload 6
    //   44: invokespecial 865	java/io/ByteArrayOutputStream:<init>	()V
    //   47: aload 4
    //   49: aload 5
    //   51: invokevirtual 869	org/apache/http/impl/client/DefaultHttpClient:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   54: astore 4
    //   56: aload 4
    //   58: invokeinterface 875 1 0
    //   63: astore 4
    //   65: aload 4
    //   67: invokeinterface 881 1 0
    //   72: astore_1
    //   73: sipush 2048
    //   76: istore 7
    //   78: iload 7
    //   80: newarray <illegal type>
    //   82: astore 4
    //   84: aload_1
    //   85: aload 4
    //   87: invokevirtual 888	java/io/InputStream:read	([B)I
    //   90: istore 8
    //   92: iconst_m1
    //   93: istore 9
    //   95: iload 8
    //   97: iload 9
    //   99: if_icmpeq +42 -> 141
    //   102: iconst_0
    //   103: istore 9
    //   105: aload 6
    //   107: aload 4
    //   109: iconst_0
    //   110: iload 8
    //   112: invokevirtual 892	java/io/ByteArrayOutputStream:write	([BII)V
    //   115: goto -31 -> 84
    //   118: astore 4
    //   120: getstatic 22	com/vvt/capture/yahoo/MyUncaughtExceptionHandler:removeFromPath	Z
    //   123: istore 7
    //   125: iload 7
    //   127: ifeq +3 -> 130
    //   130: aload_1
    //   131: invokestatic 895	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   134: aload 6
    //   136: invokestatic 898	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   139: aload_3
    //   140: areturn
    //   141: aload 6
    //   143: invokevirtual 901	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   146: astore_3
    //   147: aload_1
    //   148: invokestatic 895	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   151: goto -17 -> 134
    //   154: astore_3
    //   155: aload_1
    //   156: invokestatic 895	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   159: aload 6
    //   161: invokestatic 898	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   164: aload_3
    //   165: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	166	0	paramString	String
    //   1	155	1	localInputStream	java.io.InputStream
    //   5	2	2	bool1	boolean
    //   13	134	3	arrayOfByte	byte[]
    //   154	11	3	localObject1	Object
    //   17	91	4	localObject2	Object
    //   118	1	4	localException	Exception
    //   27	23	5	localHttpGet	org.apache.http.client.methods.HttpGet
    //   40	120	6	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   76	3	7	i	int
    //   123	3	7	bool2	boolean
    //   90	21	8	j	int
    //   93	11	9	k	int
    // Exception table:
    //   from	to	target	type
    //   49	54	118	java/lang/Exception
    //   56	63	118	java/lang/Exception
    //   65	72	118	java/lang/Exception
    //   78	82	118	java/lang/Exception
    //   85	90	118	java/lang/Exception
    //   110	115	118	java/lang/Exception
    //   141	146	118	java/lang/Exception
    //   49	54	154	finally
    //   56	63	154	finally
    //   65	72	154	finally
    //   78	82	154	finally
    //   85	90	154	finally
    //   110	115	154	finally
    //   120	123	154	finally
    //   141	146	154	finally
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/yahoo/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */