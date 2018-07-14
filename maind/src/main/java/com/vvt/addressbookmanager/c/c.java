package com.vvt.addressbookmanager.c;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.vvt.addressbookmanager.a.a;
import com.vvt.events.FxAddressBookEvent;
import com.vvt.io.p;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c
{
  private static final boolean a = com.vvt.addressbookmanager.d.e;
  private static final boolean b = com.vvt.addressbookmanager.d.a;
  private static final boolean c = com.vvt.addressbookmanager.d.b;
  private SQLiteDatabase d;
  private b e;
  
  public c(Context paramContext, String paramString)
  {
    try
    {
      String str = a(paramString);
      b localb = new com/vvt/addressbookmanager/c/b;
      localb.<init>(paramContext, str);
      this.e = localb;
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        boolean bool = a;
        if (!bool) {}
      }
    }
  }
  
  public static String a(String paramString)
  {
    String str = null;
    boolean bool1 = com.vvt.ag.b.a(paramString);
    if (bool1) {}
    Object localObject;
    for (str = "addressbook.db";; str = p.a((String)localObject, "addressbook.db"))
    {
      return str;
      localObject = p.a(paramString, "addressbook");
      File localFile = new java/io/File;
      localFile.<init>((String)localObject);
      boolean bool2 = localFile.exists();
      if (!bool2)
      {
        boolean bool3 = localFile.mkdirs();
        if (!bool3)
        {
          localObject = new java/io/IOException;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = null;
          str = String.format("unable to create addressbook folder on %s. Is premission set ?", arrayOfObject);
          ((IOException)localObject).<init>(str);
          throw ((Throwable)localObject);
        }
      }
    }
  }
  
  private List a(FxAddressBookEvent paramFxAddressBookEvent, long paramLong)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject = paramFxAddressBookEvent.getHomePhones();
    Iterator localIterator = ((ArrayList)localObject).iterator();
    boolean bool;
    ContentValues localContentValues;
    Long localLong;
    String str;
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (String)localIterator.next();
      localContentValues = new android/content/ContentValues;
      localContentValues.<init>();
      localLong = Long.valueOf(paramLong);
      localContentValues.put("_id", localLong);
      str = "number";
      localContentValues.put(str, (String)localObject);
      localArrayList.add(localContentValues);
    }
    localObject = paramFxAddressBookEvent.getMobilePhones();
    localIterator = ((ArrayList)localObject).iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (String)localIterator.next();
      localContentValues = new android/content/ContentValues;
      localContentValues.<init>();
      localLong = Long.valueOf(paramLong);
      localContentValues.put("_id", localLong);
      str = "number";
      localContentValues.put(str, (String)localObject);
      localArrayList.add(localContentValues);
    }
    localObject = paramFxAddressBookEvent.getWorkPhones();
    localIterator = ((ArrayList)localObject).iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (String)localIterator.next();
      localContentValues = new android/content/ContentValues;
      localContentValues.<init>();
      localLong = Long.valueOf(paramLong);
      localContentValues.put("_id", localLong);
      str = "number";
      localContentValues.put(str, (String)localObject);
      localArrayList.add(localContentValues);
    }
    localObject = paramFxAddressBookEvent.getOtherNumbers();
    localIterator = ((ArrayList)localObject).iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (String)localIterator.next();
      localContentValues = new android/content/ContentValues;
      localContentValues.<init>();
      localLong = Long.valueOf(paramLong);
      localContentValues.put("_id", localLong);
      str = "number";
      localContentValues.put(str, (String)localObject);
      localArrayList.add(localContentValues);
    }
    return localArrayList;
  }
  
  private ContentValues b(FxAddressBookEvent paramFxAddressBookEvent, int paramInt1, int paramInt2)
  {
    ContentValues localContentValues = new android/content/ContentValues;
    localContentValues.<init>();
    Object localObject = Long.valueOf(g());
    localContentValues.put("_id", (Long)localObject);
    localObject = Integer.valueOf(paramInt1);
    localContentValues.put("contact_state", (Integer)localObject);
    localObject = Integer.valueOf(paramInt2);
    localContentValues.put("send_state", (Integer)localObject);
    localObject = Long.valueOf(paramFxAddressBookEvent.getClientId());
    localContentValues.put("client_id", (Long)localObject);
    localObject = Long.valueOf(paramFxAddressBookEvent.getServerId());
    localContentValues.put("server_id", (Long)localObject);
    return localContentValues;
  }
  
  private List b(FxAddressBookEvent paramFxAddressBookEvent, long paramLong)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject = paramFxAddressBookEvent.getHomeEMail();
    boolean bool = com.vvt.ag.b.a((String)localObject);
    String str1;
    Long localLong;
    String str2;
    if (!bool)
    {
      localObject = new android/content/ContentValues;
      ((ContentValues)localObject).<init>();
      str1 = paramFxAddressBookEvent.getHomeEMail();
      localLong = Long.valueOf(paramLong);
      ((ContentValues)localObject).put("_id", localLong);
      str2 = "email";
      ((ContentValues)localObject).put(str2, str1);
      localArrayList.add(localObject);
    }
    localObject = paramFxAddressBookEvent.getOtherEMail();
    bool = com.vvt.ag.b.a((String)localObject);
    if (!bool)
    {
      localObject = new android/content/ContentValues;
      ((ContentValues)localObject).<init>();
      str1 = paramFxAddressBookEvent.getOtherEMail();
      localLong = Long.valueOf(paramLong);
      ((ContentValues)localObject).put("_id", localLong);
      str2 = "email";
      ((ContentValues)localObject).put(str2, str1);
      localArrayList.add(localObject);
    }
    localObject = paramFxAddressBookEvent.getWorkEMail();
    bool = com.vvt.ag.b.a((String)localObject);
    if (!bool)
    {
      localObject = new android/content/ContentValues;
      ((ContentValues)localObject).<init>();
      str1 = paramFxAddressBookEvent.getWorkEMail();
      localLong = Long.valueOf(paramLong);
      ((ContentValues)localObject).put("_id", localLong);
      str2 = "email";
      ((ContentValues)localObject).put(str2, str1);
      localArrayList.add(localObject);
    }
    return localArrayList;
  }
  
  /* Error */
  private long g()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: lconst_0
    //   5: lstore_3
    //   6: iconst_0
    //   7: istore 5
    //   9: aload_0
    //   10: getfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   13: astore 6
    //   15: aload 6
    //   17: ifnull +21 -> 38
    //   20: aload_0
    //   21: getfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   24: astore 6
    //   26: aload 6
    //   28: invokevirtual 178	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   31: istore 7
    //   33: iload 7
    //   35: ifne +32 -> 67
    //   38: getstatic 18	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:a	Z
    //   41: istore 7
    //   43: iload 7
    //   45: ifeq +3 -> 48
    //   48: aload_0
    //   49: getfield 38	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:e	Lcom/vvt/addressbookmanager/MyUncaughtExceptionHandler/removeFromPath;
    //   52: astore 6
    //   54: aload 6
    //   56: invokevirtual 182	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/removeFromPath:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   59: astore 6
    //   61: aload_0
    //   62: aload 6
    //   64: putfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   67: iconst_1
    //   68: istore 7
    //   70: iload 7
    //   72: anewarray 71	java/lang/String
    //   75: astore 8
    //   77: iconst_0
    //   78: istore 7
    //   80: aconst_null
    //   81: astore 6
    //   83: ldc 103
    //   85: astore 9
    //   87: aload 8
    //   89: iconst_0
    //   90: aload 9
    //   92: aastore
    //   93: aload_0
    //   94: getfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   97: astore 6
    //   99: ldc -72
    //   101: astore 9
    //   103: ldc -70
    //   105: astore 10
    //   107: aload 6
    //   109: aload 9
    //   111: aload 8
    //   113: aconst_null
    //   114: aconst_null
    //   115: aconst_null
    //   116: aconst_null
    //   117: aload 10
    //   119: invokevirtual 190	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   122: astore 8
    //   124: aload 8
    //   126: ifnull +200 -> 326
    //   129: aload 8
    //   131: invokeinterface 195 1 0
    //   136: istore 7
    //   138: iload 7
    //   140: ifeq +186 -> 326
    //   143: ldc 103
    //   145: astore 6
    //   147: aload 8
    //   149: aload 6
    //   151: invokeinterface 199 2 0
    //   156: istore 7
    //   158: aload 8
    //   160: iload 7
    //   162: invokeinterface 203 2 0
    //   167: istore 7
    //   169: iload 7
    //   171: i2l
    //   172: lstore 11
    //   174: lconst_1
    //   175: lstore 13
    //   177: lload 11
    //   179: lload 13
    //   181: ladd
    //   182: lstore_3
    //   183: aload 8
    //   185: ifnull +10 -> 195
    //   188: aload 8
    //   190: invokeinterface 208 1 0
    //   195: aload 8
    //   197: astore_2
    //   198: iload 5
    //   200: istore 7
    //   202: iconst_0
    //   203: istore 15
    //   205: aconst_null
    //   206: astore 9
    //   208: iload 15
    //   210: ifeq +14 -> 224
    //   213: bipush 10
    //   215: istore 15
    //   217: iload 7
    //   219: iload 15
    //   221: if_icmplt +111 -> 332
    //   224: lload_3
    //   225: lreturn
    //   226: astore 6
    //   228: aload 8
    //   230: astore 6
    //   232: getstatic 18	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:a	Z
    //   235: istore 15
    //   237: iload 15
    //   239: ifeq +3 -> 242
    //   242: iload 5
    //   244: iconst_1
    //   245: iadd
    //   246: istore 5
    //   248: ldc2_w 210
    //   251: lstore 16
    //   253: lload 16
    //   255: invokestatic 219	android/os/SystemClock:sleep	(J)V
    //   258: aload 6
    //   260: ifnull +10 -> 270
    //   263: aload 6
    //   265: invokeinterface 208 1 0
    //   270: aload 6
    //   272: astore_2
    //   273: iload_1
    //   274: istore 15
    //   276: iload 5
    //   278: istore 7
    //   280: goto -72 -> 208
    //   283: astore 6
    //   285: aload 8
    //   287: astore_2
    //   288: aload_2
    //   289: ifnull +9 -> 298
    //   292: aload_2
    //   293: invokeinterface 208 1 0
    //   298: aload 6
    //   300: athrow
    //   301: astore 9
    //   303: aload 6
    //   305: astore_2
    //   306: aload 9
    //   308: astore 6
    //   310: goto -22 -> 288
    //   313: astore 6
    //   315: goto -27 -> 288
    //   318: astore 6
    //   320: aload_2
    //   321: astore 6
    //   323: goto -91 -> 232
    //   326: lload_3
    //   327: lstore 11
    //   329: goto -155 -> 174
    //   332: iload 7
    //   334: istore 5
    //   336: goto -327 -> 9
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	339	0	this	MyUncaughtExceptionHandler
    //   1	273	1	bool1	boolean
    //   3	318	2	localObject1	Object
    //   5	322	3	l1	long
    //   7	328	5	i	int
    //   13	137	6	localObject2	Object
    //   226	1	6	localSQLiteException1	SQLiteException
    //   230	41	6	localObject3	Object
    //   283	21	6	localObject4	Object
    //   308	1	6	localObject5	Object
    //   313	1	6	localObject6	Object
    //   318	1	6	localSQLiteException2	SQLiteException
    //   321	1	6	localObject7	Object
    //   31	108	7	bool2	boolean
    //   156	177	7	j	int
    //   75	211	8	localObject8	Object
    //   85	122	9	str1	String
    //   301	6	9	localObject9	Object
    //   105	13	10	str2	String
    //   172	156	11	l2	long
    //   175	5	13	l3	long
    //   203	19	15	k	int
    //   235	40	15	bool3	boolean
    //   251	3	16	l4	long
    // Exception table:
    //   from	to	target	type
    //   129	136	226	android/database/sqlite/SQLiteException
    //   149	156	226	android/database/sqlite/SQLiteException
    //   160	167	226	android/database/sqlite/SQLiteException
    //   129	136	283	finally
    //   149	156	283	finally
    //   160	167	283	finally
    //   232	235	301	finally
    //   253	258	301	finally
    //   9	13	313	finally
    //   20	24	313	finally
    //   26	31	313	finally
    //   38	41	313	finally
    //   48	52	313	finally
    //   54	59	313	finally
    //   62	67	313	finally
    //   70	75	313	finally
    //   90	93	313	finally
    //   93	97	313	finally
    //   117	122	313	finally
    //   9	13	318	android/database/sqlite/SQLiteException
    //   20	24	318	android/database/sqlite/SQLiteException
    //   26	31	318	android/database/sqlite/SQLiteException
    //   38	41	318	android/database/sqlite/SQLiteException
    //   48	52	318	android/database/sqlite/SQLiteException
    //   54	59	318	android/database/sqlite/SQLiteException
    //   62	67	318	android/database/sqlite/SQLiteException
    //   70	75	318	android/database/sqlite/SQLiteException
    //   90	93	318	android/database/sqlite/SQLiteException
    //   93	97	318	android/database/sqlite/SQLiteException
    //   117	122	318	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public int a(long paramLong)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: iconst_m1
    //   6: istore 5
    //   8: iconst_0
    //   9: istore 6
    //   11: aload_0
    //   12: getfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   15: astore 7
    //   17: aload 7
    //   19: ifnull +21 -> 40
    //   22: aload_0
    //   23: getfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   26: astore 7
    //   28: aload 7
    //   30: invokevirtual 178	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   33: istore 8
    //   35: iload 8
    //   37: ifne +32 -> 69
    //   40: getstatic 18	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:a	Z
    //   43: istore 8
    //   45: iload 8
    //   47: ifeq +3 -> 50
    //   50: aload_0
    //   51: getfield 38	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:e	Lcom/vvt/addressbookmanager/MyUncaughtExceptionHandler/removeFromPath;
    //   54: astore 7
    //   56: aload 7
    //   58: invokevirtual 182	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/removeFromPath:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   61: astore 7
    //   63: aload_0
    //   64: aload 7
    //   66: putfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   69: iconst_1
    //   70: istore 8
    //   72: iload 8
    //   74: anewarray 71	java/lang/String
    //   77: astore 9
    //   79: iconst_0
    //   80: istore 8
    //   82: aconst_null
    //   83: astore 7
    //   85: ldc 103
    //   87: astore 10
    //   89: aload 9
    //   91: iconst_0
    //   92: aload 10
    //   94: aastore
    //   95: ldc -33
    //   97: astore 11
    //   99: iconst_1
    //   100: istore 8
    //   102: iload 8
    //   104: anewarray 71	java/lang/String
    //   107: astore 12
    //   109: iconst_0
    //   110: istore 8
    //   112: aconst_null
    //   113: astore 7
    //   115: lload_1
    //   116: invokestatic 226	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   119: astore 10
    //   121: aload 12
    //   123: iconst_0
    //   124: aload 10
    //   126: aastore
    //   127: aload_0
    //   128: getfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   131: astore 7
    //   133: ldc -72
    //   135: astore 10
    //   137: aload 7
    //   139: aload 10
    //   141: aload 9
    //   143: aload 11
    //   145: aload 12
    //   147: aconst_null
    //   148: aconst_null
    //   149: aconst_null
    //   150: invokevirtual 190	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   153: astore 10
    //   155: aload 10
    //   157: ifnull +198 -> 355
    //   160: aload 10
    //   162: invokeinterface 195 1 0
    //   167: istore 8
    //   169: iload 8
    //   171: ifeq +184 -> 355
    //   174: ldc 103
    //   176: astore 7
    //   178: aload 10
    //   180: aload 7
    //   182: invokeinterface 199 2 0
    //   187: istore 8
    //   189: aload 10
    //   191: iload 8
    //   193: invokeinterface 203 2 0
    //   198: istore 8
    //   200: aload 10
    //   202: ifnull +10 -> 212
    //   205: aload 10
    //   207: invokeinterface 208 1 0
    //   212: aload 10
    //   214: astore 4
    //   216: iload 8
    //   218: istore 5
    //   220: iload 6
    //   222: istore 8
    //   224: iconst_0
    //   225: istore 13
    //   227: aconst_null
    //   228: astore 10
    //   230: iload 13
    //   232: ifeq +14 -> 246
    //   235: bipush 10
    //   237: istore 13
    //   239: iload 8
    //   241: iload 13
    //   243: if_icmplt +119 -> 362
    //   246: iload 5
    //   248: ireturn
    //   249: astore 7
    //   251: aload 10
    //   253: astore 7
    //   255: getstatic 18	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:a	Z
    //   258: istore 13
    //   260: iload 13
    //   262: ifeq +3 -> 265
    //   265: iload 6
    //   267: iconst_1
    //   268: iadd
    //   269: istore 6
    //   271: ldc2_w 210
    //   274: lstore 14
    //   276: lload 14
    //   278: invokestatic 219	android/os/SystemClock:sleep	(J)V
    //   281: aload 7
    //   283: ifnull +10 -> 293
    //   286: aload 7
    //   288: invokeinterface 208 1 0
    //   293: aload 7
    //   295: astore 4
    //   297: iload_3
    //   298: istore 13
    //   300: iload 6
    //   302: istore 8
    //   304: goto -74 -> 230
    //   307: astore 7
    //   309: aload 10
    //   311: astore 4
    //   313: aload 4
    //   315: ifnull +10 -> 325
    //   318: aload 4
    //   320: invokeinterface 208 1 0
    //   325: aload 7
    //   327: athrow
    //   328: astore 10
    //   330: aload 7
    //   332: astore 4
    //   334: aload 10
    //   336: astore 7
    //   338: goto -25 -> 313
    //   341: astore 7
    //   343: goto -30 -> 313
    //   346: astore 7
    //   348: aload 4
    //   350: astore 7
    //   352: goto -97 -> 255
    //   355: iload 5
    //   357: istore 8
    //   359: goto -159 -> 200
    //   362: iload 8
    //   364: istore 6
    //   366: goto -355 -> 11
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	369	0	this	MyUncaughtExceptionHandler
    //   0	369	1	paramLong	long
    //   1	297	3	bool1	boolean
    //   3	346	4	localObject1	Object
    //   6	350	5	i	int
    //   9	356	6	j	int
    //   15	166	7	localObject2	Object
    //   249	1	7	localSQLiteException1	SQLiteException
    //   253	41	7	localObject3	Object
    //   307	24	7	localObject4	Object
    //   336	1	7	localObject5	Object
    //   341	1	7	localObject6	Object
    //   346	1	7	localSQLiteException2	SQLiteException
    //   350	1	7	localObject7	Object
    //   33	137	8	bool2	boolean
    //   187	176	8	k	int
    //   77	65	9	arrayOfString1	String[]
    //   87	223	10	localObject8	Object
    //   328	7	10	localObject9	Object
    //   97	47	11	str	String
    //   107	39	12	arrayOfString2	String[]
    //   225	19	13	m	int
    //   258	41	13	bool3	boolean
    //   274	3	14	l	long
    // Exception table:
    //   from	to	target	type
    //   160	167	249	android/database/sqlite/SQLiteException
    //   180	187	249	android/database/sqlite/SQLiteException
    //   191	198	249	android/database/sqlite/SQLiteException
    //   160	167	307	finally
    //   180	187	307	finally
    //   191	198	307	finally
    //   255	258	328	finally
    //   276	281	328	finally
    //   11	15	341	finally
    //   22	26	341	finally
    //   28	33	341	finally
    //   40	43	341	finally
    //   50	54	341	finally
    //   56	61	341	finally
    //   64	69	341	finally
    //   72	77	341	finally
    //   92	95	341	finally
    //   102	107	341	finally
    //   115	119	341	finally
    //   124	127	341	finally
    //   127	131	341	finally
    //   149	153	341	finally
    //   11	15	346	android/database/sqlite/SQLiteException
    //   22	26	346	android/database/sqlite/SQLiteException
    //   28	33	346	android/database/sqlite/SQLiteException
    //   40	43	346	android/database/sqlite/SQLiteException
    //   50	54	346	android/database/sqlite/SQLiteException
    //   56	61	346	android/database/sqlite/SQLiteException
    //   64	69	346	android/database/sqlite/SQLiteException
    //   72	77	346	android/database/sqlite/SQLiteException
    //   92	95	346	android/database/sqlite/SQLiteException
    //   102	107	346	android/database/sqlite/SQLiteException
    //   115	119	346	android/database/sqlite/SQLiteException
    //   124	127	346	android/database/sqlite/SQLiteException
    //   127	131	346	android/database/sqlite/SQLiteException
    //   149	153	346	android/database/sqlite/SQLiteException
  }
  
  public c a(boolean paramBoolean)
  {
    i = 0;
    for (;;)
    {
      try
      {
        localObject = this.d;
        if (localObject != null)
        {
          localObject = this.d;
          bool1 = ((SQLiteDatabase)localObject).isOpen();
          if (bool1) {}
        }
        else
        {
          if (!paramBoolean) {
            continue;
          }
          localObject = this.e;
          localObject = ((b)localObject).getReadableDatabase();
          this.d = ((SQLiteDatabase)localObject);
        }
        bool1 = false;
        localObject = null;
      }
      catch (SQLiteException localSQLiteException)
      {
        Object localObject;
        boolean bool1;
        int j;
        boolean bool2 = a;
        if (!bool2) {
          continue;
        }
        bool2 = true;
        i += 1;
        long l = 2000L;
        SystemClock.sleep(l);
        continue;
      }
      if (bool1)
      {
        j = 10;
        if (i < j) {}
      }
      else
      {
        return this;
        localObject = this.e;
        localObject = ((b)localObject).getWritableDatabase();
        this.d = ((SQLiteDatabase)localObject);
      }
    }
  }
  
  public void a()
  {
    b localb = this.e;
    if (localb != null)
    {
      localb = this.e;
      localb.close();
    }
  }
  
  public void a(long paramLong, a parama, int paramInt)
  {
    boolean bool1 = b;
    if (bool1) {}
    bool1 = b;
    if (bool1) {}
    int m = 0;
    for (;;)
    {
      try
      {
        Object localObject1 = this.d;
        if (localObject1 != null)
        {
          localObject1 = this.d;
          bool1 = ((SQLiteDatabase)localObject1).isOpen();
          if (bool1) {}
        }
        else
        {
          bool1 = a;
          if (bool1) {}
          localObject1 = this.e;
          localObject1 = ((b)localObject1).getWritableDatabase();
          this.d = ((SQLiteDatabase)localObject1);
        }
        localObject1 = "server_id = ?";
        n = 1;
        String[] arrayOfString = new String[n];
        int i1 = 0;
        Object localObject2 = null;
        Object localObject3 = Long.toString(paramLong);
        arrayOfString[0] = localObject3;
        localObject2 = new android/content/ContentValues;
        ((ContentValues)localObject2).<init>();
        localObject3 = "client_id";
        long l1 = parama.d();
        Object localObject4 = Long.valueOf(l1);
        ((ContentValues)localObject2).put((String)localObject3, (Long)localObject4);
        localObject3 = "contact_state";
        localObject4 = Integer.valueOf(paramInt);
        ((ContentValues)localObject2).put((String)localObject3, (Integer)localObject4);
        localObject3 = this.d;
        localObject4 = "contacts";
        int i = ((SQLiteDatabase)localObject3).update((String)localObject4, (ContentValues)localObject2, (String)localObject1, arrayOfString);
        if (i > 0)
        {
          j = b;
          if (j != 0) {}
          long l2 = parama.d();
          n = a(l2);
          localObject1 = "_id= ?";
          i1 = 1;
          localObject2 = new String[i1];
          boolean bool2 = false;
          localObject3 = null;
          l1 = n;
          localObject4 = Long.toString(l1);
          localObject2[0] = localObject4;
          localObject3 = this.d;
          localObject4 = "contact_mail";
          ((SQLiteDatabase)localObject3).delete((String)localObject4, (String)localObject1, (String[])localObject2);
          bool2 = b;
          if (bool2) {}
          localObject3 = this.d;
          localObject4 = "contact_number";
          ((SQLiteDatabase)localObject3).delete((String)localObject4, (String)localObject1, (String[])localObject2);
          j = b;
          if (j != 0) {}
          localObject1 = parama.h();
          localObject2 = ((List)localObject1).iterator();
          j = ((Iterator)localObject2).hasNext();
          if (j != 0)
          {
            localObject1 = ((Iterator)localObject2).next();
            localObject1 = (com.vvt.addressbookmanager.a.b)localObject1;
            bool2 = localObject1 instanceof com.vvt.addressbookmanager.a.c;
            if (bool2)
            {
              localObject3 = new android/content/ContentValues;
              ((ContentValues)localObject3).<init>();
              localObject4 = ((com.vvt.addressbookmanager.a.b)localObject1).a();
              localObject5 = "_id";
              Integer localInteger = Integer.valueOf(n);
              ((ContentValues)localObject3).put((String)localObject5, localInteger);
              localObject5 = "email";
              ((ContentValues)localObject3).put((String)localObject5, (String)localObject4);
              localObject4 = this.d;
              localObject5 = "contact_mail";
              localInteger = null;
              l3 = ((SQLiteDatabase)localObject4).insert((String)localObject5, null, (ContentValues)localObject3);
              l4 = 0L;
              bool2 = l3 < l4;
              if (bool2)
              {
                bool2 = b;
                if (!bool2) {
                  continue;
                }
              }
            }
            bool2 = localObject1 instanceof com.vvt.addressbookmanager.a.d;
            if (!bool2) {
              continue;
            }
            localObject3 = new android/content/ContentValues;
            ((ContentValues)localObject3).<init>();
            localObject1 = ((com.vvt.addressbookmanager.a.b)localObject1).a();
            localObject4 = "_id";
            Object localObject5 = Integer.valueOf(n);
            ((ContentValues)localObject3).put((String)localObject4, (Integer)localObject5);
            localObject4 = "number";
            ((ContentValues)localObject3).put((String)localObject4, (String)localObject1);
            localObject1 = this.d;
            localObject4 = "contact_number";
            localObject5 = null;
            long l3 = ((SQLiteDatabase)localObject1).insert((String)localObject4, null, (ContentValues)localObject3);
            long l4 = 0L;
            j = l3 < l4;
            if (j <= 0) {
              continue;
            }
            j = b;
            if (j != 0) {
              continue;
            }
            j = a;
            if (j == 0) {
              continue;
            }
            continue;
            bool2 = a;
            if (!bool2) {
              continue;
            }
            continue;
          }
        }
        else
        {
          j = a;
          if (j == 0) {}
        }
        localObject1 = null;
        int i2 = m;
        m = 0;
        j = i2;
      }
      catch (SQLiteException localSQLiteException)
      {
        int j = a;
        if (j == 0) {
          continue;
        }
        int n = 1;
        int k = m + 1;
        long l5 = 1000L;
        SystemClock.sleep(l5);
        m = n;
        continue;
        m = k;
      }
      if (m != 0)
      {
        m = 10;
        if (j < m) {}
      }
      else
      {
        j = b;
        if (j != 0) {}
        return;
      }
    }
  }
  
  /* Error */
  public void a(long paramLong, FxAddressBookEvent paramFxAddressBookEvent)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 4
    //   3: getstatic 21	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:removeFromPath	Z
    //   6: istore 5
    //   8: iload 5
    //   10: ifeq +3 -> 13
    //   13: getstatic 21	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:removeFromPath	Z
    //   16: istore 5
    //   18: iload 5
    //   20: ifeq +3 -> 23
    //   23: iconst_0
    //   24: istore 6
    //   26: aload_0
    //   27: getfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   30: astore 7
    //   32: aload 7
    //   34: ifnull +21 -> 55
    //   37: aload_0
    //   38: getfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   41: astore 7
    //   43: aload 7
    //   45: invokevirtual 178	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   48: istore 5
    //   50: iload 5
    //   52: ifne +32 -> 84
    //   55: getstatic 18	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:a	Z
    //   58: istore 5
    //   60: iload 5
    //   62: ifeq +3 -> 65
    //   65: aload_0
    //   66: getfield 38	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:e	Lcom/vvt/addressbookmanager/MyUncaughtExceptionHandler/removeFromPath;
    //   69: astore 7
    //   71: aload 7
    //   73: invokevirtual 182	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/removeFromPath:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   76: astore 7
    //   78: aload_0
    //   79: aload 7
    //   81: putfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   84: aload_0
    //   85: getfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   88: astore 7
    //   90: aload 7
    //   92: invokevirtual 280	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   95: ldc_w 282
    //   98: astore 7
    //   100: iconst_1
    //   101: istore 8
    //   103: iload 8
    //   105: anewarray 71	java/lang/String
    //   108: astore 9
    //   110: iconst_0
    //   111: istore 10
    //   113: aconst_null
    //   114: astore 11
    //   116: lload_1
    //   117: invokestatic 226	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   120: astore 12
    //   122: aload 9
    //   124: iconst_0
    //   125: aload 12
    //   127: aastore
    //   128: new 100	android/content/ContentValues
    //   131: astore 11
    //   133: aload 11
    //   135: invokespecial 101	android/content/ContentValues:<init>	()V
    //   138: ldc -117
    //   140: astore 12
    //   142: aconst_null
    //   143: astore 13
    //   145: iconst_0
    //   146: invokestatic 144	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   149: astore 13
    //   151: aload 11
    //   153: aload 12
    //   155: aload 13
    //   157: invokevirtual 147	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   160: ldc -107
    //   162: astore 12
    //   164: aconst_null
    //   165: astore 13
    //   167: iconst_0
    //   168: invokestatic 144	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   171: astore 13
    //   173: aload 11
    //   175: aload 12
    //   177: aload 13
    //   179: invokevirtual 147	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   182: aload_0
    //   183: getfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   186: astore 12
    //   188: ldc -72
    //   190: astore 13
    //   192: aload 12
    //   194: aload 13
    //   196: aload 11
    //   198: aload 7
    //   200: aload 9
    //   202: invokevirtual 247	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   205: istore 5
    //   207: iload 5
    //   209: ifle +304 -> 513
    //   212: getstatic 24	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   215: istore 5
    //   217: iload 5
    //   219: ifeq +3 -> 222
    //   222: aload_0
    //   223: lload_1
    //   224: invokevirtual 250	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:a	(J)I
    //   227: istore 5
    //   229: ldc -4
    //   231: astore 9
    //   233: iconst_1
    //   234: istore 10
    //   236: iload 10
    //   238: anewarray 71	java/lang/String
    //   241: astore 11
    //   243: iconst_0
    //   244: istore 14
    //   246: aconst_null
    //   247: astore 12
    //   249: iload 5
    //   251: i2l
    //   252: lstore 15
    //   254: lload 15
    //   256: invokestatic 239	java/lang/Long:toString	(J)Ljava/lang/String;
    //   259: astore 13
    //   261: aload 11
    //   263: iconst_0
    //   264: aload 13
    //   266: aastore
    //   267: aload_0
    //   268: getfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   271: astore 12
    //   273: ldc -2
    //   275: astore 13
    //   277: aload 12
    //   279: aload 13
    //   281: aload 9
    //   283: aload 11
    //   285: invokevirtual 258	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   288: pop
    //   289: getstatic 21	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:removeFromPath	Z
    //   292: istore 14
    //   294: iload 14
    //   296: ifeq +3 -> 299
    //   299: aload_0
    //   300: getfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   303: astore 12
    //   305: ldc_w 260
    //   308: astore 13
    //   310: aload 12
    //   312: aload 13
    //   314: aload 9
    //   316: aload 11
    //   318: invokevirtual 258	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   321: pop
    //   322: getstatic 21	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:removeFromPath	Z
    //   325: istore 8
    //   327: iload 8
    //   329: ifeq +3 -> 332
    //   332: iload 5
    //   334: i2l
    //   335: lstore 17
    //   337: aload_0
    //   338: aload_3
    //   339: lload 17
    //   341: invokespecial 285	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:a	(Lcom/vvt/events/FxAddressBookEvent;J)Ljava/util/List;
    //   344: astore 9
    //   346: iload 5
    //   348: i2l
    //   349: lstore 19
    //   351: aload_0
    //   352: aload_3
    //   353: lload 19
    //   355: invokespecial 287	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:removeFromPath	(Lcom/vvt/events/FxAddressBookEvent;J)Ljava/util/List;
    //   358: astore 11
    //   360: aload 9
    //   362: invokeinterface 291 1 0
    //   367: istore 5
    //   369: iload 5
    //   371: ifle +155 -> 526
    //   374: aload 9
    //   376: invokeinterface 265 1 0
    //   381: astore 9
    //   383: aload 9
    //   385: invokeinterface 94 1 0
    //   390: istore 5
    //   392: iload 5
    //   394: ifeq +132 -> 526
    //   397: aload 9
    //   399: invokeinterface 98 1 0
    //   404: astore 7
    //   406: aload 7
    //   408: checkcast 100	android/content/ContentValues
    //   411: astore 7
    //   413: aload_0
    //   414: getfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   417: astore 12
    //   419: ldc_w 260
    //   422: astore 13
    //   424: aload 12
    //   426: aload 13
    //   428: aconst_null
    //   429: aload 7
    //   431: invokevirtual 275	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   434: pop2
    //   435: goto -52 -> 383
    //   438: astore 7
    //   440: aload_0
    //   441: getfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   444: astore 9
    //   446: aload 9
    //   448: invokevirtual 294	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   451: aload 7
    //   453: athrow
    //   454: astore 7
    //   456: getstatic 18	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:a	Z
    //   459: istore 5
    //   461: iload 5
    //   463: ifeq +3 -> 466
    //   466: iload 6
    //   468: iconst_1
    //   469: iadd
    //   470: istore 5
    //   472: ldc2_w 210
    //   475: lstore 17
    //   477: lload 17
    //   479: invokestatic 219	android/os/SystemClock:sleep	(J)V
    //   482: iload 4
    //   484: istore 6
    //   486: iload 6
    //   488: ifeq +14 -> 502
    //   491: bipush 10
    //   493: istore 6
    //   495: iload 5
    //   497: iload 6
    //   499: if_icmplt +139 -> 638
    //   502: getstatic 21	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:removeFromPath	Z
    //   505: istore 5
    //   507: iload 5
    //   509: ifeq +3 -> 512
    //   512: return
    //   513: getstatic 24	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   516: istore 5
    //   518: iload 5
    //   520: ifeq -298 -> 222
    //   523: goto -301 -> 222
    //   526: aload 11
    //   528: invokeinterface 291 1 0
    //   533: istore 5
    //   535: iload 5
    //   537: ifle +69 -> 606
    //   540: aload 11
    //   542: invokeinterface 265 1 0
    //   547: astore 9
    //   549: aload 9
    //   551: invokeinterface 94 1 0
    //   556: istore 5
    //   558: iload 5
    //   560: ifeq +46 -> 606
    //   563: aload 9
    //   565: invokeinterface 98 1 0
    //   570: astore 7
    //   572: aload 7
    //   574: checkcast 100	android/content/ContentValues
    //   577: astore 7
    //   579: aload_0
    //   580: getfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   583: astore 11
    //   585: ldc -2
    //   587: astore 12
    //   589: aconst_null
    //   590: astore 13
    //   592: aload 11
    //   594: aload 12
    //   596: aconst_null
    //   597: aload 7
    //   599: invokevirtual 275	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   602: pop2
    //   603: goto -54 -> 549
    //   606: aload_0
    //   607: getfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   610: astore 7
    //   612: aload 7
    //   614: invokevirtual 297	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   617: aload_0
    //   618: getfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   621: astore 7
    //   623: aload 7
    //   625: invokevirtual 294	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   628: iload 6
    //   630: istore 5
    //   632: iconst_0
    //   633: istore 6
    //   635: goto -149 -> 486
    //   638: iload 5
    //   640: istore 6
    //   642: goto -616 -> 26
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	645	0	this	MyUncaughtExceptionHandler
    //   0	645	1	paramLong	long
    //   0	645	3	paramFxAddressBookEvent	FxAddressBookEvent
    //   1	482	4	i	int
    //   6	55	5	bool1	boolean
    //   205	3	5	j	int
    //   215	3	5	bool2	boolean
    //   227	143	5	k	int
    //   390	72	5	bool3	boolean
    //   470	30	5	m	int
    //   505	14	5	bool4	boolean
    //   533	3	5	n	int
    //   556	83	5	i1	int
    //   24	617	6	i2	int
    //   30	400	7	localObject1	Object
    //   438	14	7	localObject2	Object
    //   454	1	7	localSQLiteException	SQLiteException
    //   570	54	7	localObject3	Object
    //   101	227	8	bool5	boolean
    //   108	456	9	localObject4	Object
    //   111	126	10	i3	int
    //   114	479	11	localObject5	Object
    //   120	475	12	localObject6	Object
    //   143	448	13	localObject7	Object
    //   244	51	14	bool6	boolean
    //   252	3	15	l1	long
    //   335	143	17	l2	long
    //   349	5	19	l3	long
    // Exception table:
    //   from	to	target	type
    //   103	108	438	finally
    //   116	120	438	finally
    //   125	128	438	finally
    //   128	131	438	finally
    //   133	138	438	finally
    //   145	149	438	finally
    //   155	160	438	finally
    //   167	171	438	finally
    //   177	182	438	finally
    //   182	186	438	finally
    //   200	205	438	finally
    //   212	215	438	finally
    //   223	227	438	finally
    //   236	241	438	finally
    //   254	259	438	finally
    //   264	267	438	finally
    //   267	271	438	finally
    //   283	289	438	finally
    //   289	292	438	finally
    //   299	303	438	finally
    //   316	322	438	finally
    //   322	325	438	finally
    //   339	344	438	finally
    //   353	358	438	finally
    //   360	367	438	finally
    //   374	381	438	finally
    //   383	390	438	finally
    //   397	404	438	finally
    //   406	411	438	finally
    //   413	417	438	finally
    //   429	435	438	finally
    //   513	516	438	finally
    //   526	533	438	finally
    //   540	547	438	finally
    //   549	556	438	finally
    //   563	570	438	finally
    //   572	577	438	finally
    //   579	583	438	finally
    //   597	603	438	finally
    //   606	610	438	finally
    //   612	617	438	finally
    //   26	30	454	android/database/sqlite/SQLiteException
    //   37	41	454	android/database/sqlite/SQLiteException
    //   43	48	454	android/database/sqlite/SQLiteException
    //   55	58	454	android/database/sqlite/SQLiteException
    //   65	69	454	android/database/sqlite/SQLiteException
    //   71	76	454	android/database/sqlite/SQLiteException
    //   79	84	454	android/database/sqlite/SQLiteException
    //   84	88	454	android/database/sqlite/SQLiteException
    //   90	95	454	android/database/sqlite/SQLiteException
    //   440	444	454	android/database/sqlite/SQLiteException
    //   446	451	454	android/database/sqlite/SQLiteException
    //   451	454	454	android/database/sqlite/SQLiteException
    //   617	621	454	android/database/sqlite/SQLiteException
    //   623	628	454	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public void a(a parama, int paramInt1, int paramInt2, long paramLong)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 6
    //   3: aload_0
    //   4: getfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   7: astore 7
    //   9: aload 7
    //   11: ifnull +21 -> 32
    //   14: aload_0
    //   15: getfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   18: astore 7
    //   20: aload 7
    //   22: invokevirtual 178	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   25: istore 8
    //   27: iload 8
    //   29: ifne +32 -> 61
    //   32: getstatic 18	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:a	Z
    //   35: istore 8
    //   37: iload 8
    //   39: ifeq +3 -> 42
    //   42: aload_0
    //   43: getfield 38	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:e	Lcom/vvt/addressbookmanager/MyUncaughtExceptionHandler/removeFromPath;
    //   46: astore 7
    //   48: aload 7
    //   50: invokevirtual 182	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/removeFromPath:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   53: astore 7
    //   55: aload_0
    //   56: aload 7
    //   58: putfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   61: aload_0
    //   62: getfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   65: astore 7
    //   67: aload 7
    //   69: invokevirtual 280	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   72: new 100	android/content/ContentValues
    //   75: astore 7
    //   77: aload 7
    //   79: invokespecial 101	android/content/ContentValues:<init>	()V
    //   82: ldc 103
    //   84: astore 9
    //   86: aload_0
    //   87: invokespecial 137	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:FxFileObserverWorker	()J
    //   90: lstore 10
    //   92: lload 10
    //   94: invokestatic 109	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   97: astore 12
    //   99: aload 7
    //   101: aload 9
    //   103: aload 12
    //   105: invokevirtual 113	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   108: ldc -117
    //   110: astore 9
    //   112: iload_2
    //   113: invokestatic 144	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   116: astore 12
    //   118: aload 7
    //   120: aload 9
    //   122: aload 12
    //   124: invokevirtual 147	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   127: ldc -107
    //   129: astore 9
    //   131: iload_3
    //   132: invokestatic 144	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   135: astore 12
    //   137: aload 7
    //   139: aload 9
    //   141: aload 12
    //   143: invokevirtual 147	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   146: ldc -105
    //   148: astore 9
    //   150: lload 4
    //   152: invokestatic 109	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   155: astore 12
    //   157: aload 7
    //   159: aload 9
    //   161: aload 12
    //   163: invokevirtual 113	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   166: ldc -100
    //   168: astore 9
    //   170: aload_1
    //   171: invokevirtual 299	com/vvt/addressbookmanager/a/a:a	()J
    //   174: lstore 10
    //   176: lload 10
    //   178: invokestatic 109	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   181: astore 12
    //   183: aload 7
    //   185: aload 9
    //   187: aload 12
    //   189: invokevirtual 113	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   192: aload_0
    //   193: getfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   196: astore 9
    //   198: ldc -72
    //   200: astore 12
    //   202: aconst_null
    //   203: astore 13
    //   205: aload 9
    //   207: aload 12
    //   209: aconst_null
    //   210: aload 7
    //   212: invokevirtual 275	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   215: lstore 14
    //   217: aload_1
    //   218: invokevirtual 264	com/vvt/addressbookmanager/a/a:AppEngine1	()Ljava/util/List;
    //   221: astore 7
    //   223: aload 7
    //   225: invokeinterface 265 1 0
    //   230: astore 13
    //   232: aload 13
    //   234: invokeinterface 94 1 0
    //   239: istore 8
    //   241: iload 8
    //   243: ifeq +180 -> 423
    //   246: aload 13
    //   248: invokeinterface 98 1 0
    //   253: astore 7
    //   255: aload 7
    //   257: checkcast 267	com/vvt/addressbookmanager/a/removeFromPath
    //   260: astore 7
    //   262: aload 7
    //   264: instanceof 277
    //   267: istore 16
    //   269: iload 16
    //   271: ifeq -39 -> 232
    //   274: new 100	android/content/ContentValues
    //   277: astore 17
    //   279: aload 17
    //   281: invokespecial 101	android/content/ContentValues:<init>	()V
    //   284: aload 7
    //   286: checkcast 267	com/vvt/addressbookmanager/a/removeFromPath
    //   289: invokevirtual 271	com/vvt/addressbookmanager/a/removeFromPath:a	()Ljava/lang/String;
    //   292: astore 7
    //   294: ldc 103
    //   296: astore 18
    //   298: lload 14
    //   300: invokestatic 109	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   303: astore 19
    //   305: aload 17
    //   307: aload 18
    //   309: aload 19
    //   311: invokevirtual 113	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   314: ldc 115
    //   316: astore 18
    //   318: aload 17
    //   320: aload 18
    //   322: aload 7
    //   324: invokevirtual 118	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   327: aload_0
    //   328: getfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   331: astore 7
    //   333: ldc_w 260
    //   336: astore 18
    //   338: aconst_null
    //   339: astore 19
    //   341: aload 7
    //   343: aload 18
    //   345: aconst_null
    //   346: aload 17
    //   348: invokevirtual 275	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   351: pop2
    //   352: goto -120 -> 232
    //   355: astore 7
    //   357: aload_0
    //   358: getfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   361: astore 9
    //   363: aload 9
    //   365: invokevirtual 294	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   368: aload 7
    //   370: athrow
    //   371: astore 7
    //   373: getstatic 18	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:a	Z
    //   376: istore 8
    //   378: iload 8
    //   380: ifeq +3 -> 383
    //   383: iconst_1
    //   384: istore 20
    //   386: iload 6
    //   388: iconst_1
    //   389: iadd
    //   390: istore 8
    //   392: ldc2_w 210
    //   395: lstore 10
    //   397: lload 10
    //   399: invokestatic 219	android/os/SystemClock:sleep	(J)V
    //   402: iload 20
    //   404: istore 6
    //   406: iload 6
    //   408: ifeq +14 -> 422
    //   411: bipush 10
    //   413: istore 6
    //   415: iload 8
    //   417: iload 6
    //   419: if_icmplt +173 -> 592
    //   422: return
    //   423: aload_1
    //   424: invokevirtual 264	com/vvt/addressbookmanager/a/a:AppEngine1	()Ljava/util/List;
    //   427: astore 7
    //   429: aload 7
    //   431: invokeinterface 265 1 0
    //   436: astore 13
    //   438: aload 13
    //   440: invokeinterface 94 1 0
    //   445: istore 8
    //   447: iload 8
    //   449: ifeq +111 -> 560
    //   452: aload 13
    //   454: invokeinterface 98 1 0
    //   459: astore 7
    //   461: aload 7
    //   463: checkcast 267	com/vvt/addressbookmanager/a/removeFromPath
    //   466: astore 7
    //   468: aload 7
    //   470: instanceof 269
    //   473: istore 16
    //   475: iload 16
    //   477: ifeq -39 -> 438
    //   480: new 100	android/content/ContentValues
    //   483: astore 17
    //   485: aload 17
    //   487: invokespecial 101	android/content/ContentValues:<init>	()V
    //   490: aload 7
    //   492: checkcast 267	com/vvt/addressbookmanager/a/removeFromPath
    //   495: invokevirtual 271	com/vvt/addressbookmanager/a/removeFromPath:a	()Ljava/lang/String;
    //   498: astore 7
    //   500: ldc 103
    //   502: astore 18
    //   504: lload 14
    //   506: invokestatic 109	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   509: astore 19
    //   511: aload 17
    //   513: aload 18
    //   515: aload 19
    //   517: invokevirtual 113	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   520: ldc -91
    //   522: astore 18
    //   524: aload 17
    //   526: aload 18
    //   528: aload 7
    //   530: invokevirtual 118	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   533: aload_0
    //   534: getfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   537: astore 7
    //   539: ldc -2
    //   541: astore 18
    //   543: aconst_null
    //   544: astore 19
    //   546: aload 7
    //   548: aload 18
    //   550: aconst_null
    //   551: aload 17
    //   553: invokevirtual 275	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   556: pop2
    //   557: goto -119 -> 438
    //   560: aload_0
    //   561: getfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   564: astore 7
    //   566: aload 7
    //   568: invokevirtual 297	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   571: aload_0
    //   572: getfield 173	com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Landroid/database/sqlite/SQLiteDatabase;
    //   575: astore 7
    //   577: aload 7
    //   579: invokevirtual 294	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   582: iload 6
    //   584: istore 8
    //   586: iconst_0
    //   587: istore 6
    //   589: goto -183 -> 406
    //   592: iload 8
    //   594: istore 6
    //   596: goto -593 -> 3
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	599	0	this	MyUncaughtExceptionHandler
    //   0	599	1	parama	a
    //   0	599	2	paramInt1	int
    //   0	599	3	paramInt2	int
    //   0	599	4	paramLong	long
    //   1	594	6	i	int
    //   7	335	7	localObject1	Object
    //   355	14	7	localObject2	Object
    //   371	1	7	localSQLiteException	SQLiteException
    //   427	151	7	localObject3	Object
    //   25	354	8	bool1	boolean
    //   390	30	8	j	int
    //   445	148	8	k	int
    //   84	280	9	localObject4	Object
    //   90	308	10	l1	long
    //   97	111	12	localObject5	Object
    //   203	250	13	localIterator	Iterator
    //   215	290	14	l2	long
    //   267	209	16	bool2	boolean
    //   277	275	17	localContentValues	ContentValues
    //   296	253	18	str	String
    //   303	242	19	localLong	Long
    //   384	19	20	m	int
    // Exception table:
    //   from	to	target	type
    //   72	75	355	finally
    //   77	82	355	finally
    //   86	90	355	finally
    //   92	97	355	finally
    //   103	108	355	finally
    //   112	116	355	finally
    //   122	127	355	finally
    //   131	135	355	finally
    //   141	146	355	finally
    //   150	155	355	finally
    //   161	166	355	finally
    //   170	174	355	finally
    //   176	181	355	finally
    //   187	192	355	finally
    //   192	196	355	finally
    //   210	215	355	finally
    //   217	221	355	finally
    //   223	230	355	finally
    //   232	239	355	finally
    //   246	253	355	finally
    //   255	260	355	finally
    //   274	277	355	finally
    //   279	284	355	finally
    //   284	292	355	finally
    //   298	303	355	finally
    //   309	314	355	finally
    //   322	327	355	finally
    //   327	331	355	finally
    //   346	352	355	finally
    //   423	427	355	finally
    //   429	436	355	finally
    //   438	445	355	finally
    //   452	459	355	finally
    //   461	466	355	finally
    //   480	483	355	finally
    //   485	490	355	finally
    //   490	498	355	finally
    //   504	509	355	finally
    //   515	520	355	finally
    //   528	533	355	finally
    //   533	537	355	finally
    //   551	557	355	finally
    //   560	564	355	finally
    //   566	571	355	finally
    //   3	7	371	android/database/sqlite/SQLiteException
    //   14	18	371	android/database/sqlite/SQLiteException
    //   20	25	371	android/database/sqlite/SQLiteException
    //   32	35	371	android/database/sqlite/SQLiteException
    //   42	46	371	android/database/sqlite/SQLiteException
    //   48	53	371	android/database/sqlite/SQLiteException
    //   56	61	371	android/database/sqlite/SQLiteException
    //   61	65	371	android/database/sqlite/SQLiteException
    //   67	72	371	android/database/sqlite/SQLiteException
    //   357	361	371	android/database/sqlite/SQLiteException
    //   363	368	371	android/database/sqlite/SQLiteException
    //   368	371	371	android/database/sqlite/SQLiteException
    //   571	575	371	android/database/sqlite/SQLiteException
    //   577	582	371	android/database/sqlite/SQLiteException
  }
  
  public void a(FxAddressBookEvent paramFxAddressBookEvent, int paramInt1, int paramInt2)
  {
    boolean bool = b;
    if (bool) {}
    bool = b;
    if (bool) {}
    bool = b;
    if (bool) {}
    bool = b;
    if (bool) {}
    int m = 0;
    for (;;)
    {
      try
      {
        localObject1 = this.d;
        if (localObject1 != null)
        {
          localObject1 = this.d;
          bool = ((SQLiteDatabase)localObject1).isOpen();
          if (bool) {}
        }
        else
        {
          bool = a;
          if (bool) {}
          localObject1 = this.e;
          localObject1 = ((b)localObject1).getWritableDatabase();
          this.d = ((SQLiteDatabase)localObject1);
        }
        localObject1 = this.d;
        ((SQLiteDatabase)localObject1).beginTransaction();
      }
      catch (SQLiteException localSQLiteException)
      {
        Object localObject1;
        Object localObject3;
        Object localObject4;
        Object localObject5;
        long l1;
        int n;
        String str;
        int i;
        int j = a;
        if (j == 0) {
          continue;
        }
        int i1 = 1;
        int k = m + 1;
        long l2 = 1000L;
        SystemClock.sleep(l2);
        m = i1;
        continue;
        m = k;
      }
      try
      {
        localObject1 = b(paramFxAddressBookEvent, paramInt1, paramInt2);
        localObject3 = this.d;
        localObject4 = "contacts";
        localObject5 = null;
        l1 = ((SQLiteDatabase)localObject3).insert((String)localObject4, null, (ContentValues)localObject1);
        bool = b;
        if (bool) {}
        localObject1 = a(paramFxAddressBookEvent, l1);
        localObject3 = b(paramFxAddressBookEvent, l1);
        n = ((List)localObject1).size();
        if (n > 0)
        {
          localObject4 = ((List)localObject1).iterator();
          bool = ((Iterator)localObject4).hasNext();
          if (bool)
          {
            localObject1 = ((Iterator)localObject4).next();
            localObject1 = (ContentValues)localObject1;
            localObject5 = this.d;
            str = "contact_number";
            ((SQLiteDatabase)localObject5).insert(str, null, (ContentValues)localObject1);
            bool = b;
            if (!bool) {
              continue;
            }
            continue;
          }
        }
        i = ((List)localObject3).size();
        if (i > 0)
        {
          localObject3 = ((List)localObject3).iterator();
          j = ((Iterator)localObject3).hasNext();
          if (j != 0)
          {
            localObject1 = ((Iterator)localObject3).next();
            localObject1 = (ContentValues)localObject1;
            localObject4 = this.d;
            localObject5 = "contact_mail";
            str = null;
            ((SQLiteDatabase)localObject4).insert((String)localObject5, null, (ContentValues)localObject1);
            j = b;
            if (j == 0) {
              continue;
            }
            continue;
          }
        }
        localObject1 = this.d;
        ((SQLiteDatabase)localObject1).setTransactionSuccessful();
        localObject1 = this.d;
        ((SQLiteDatabase)localObject1).endTransaction();
        j = m;
        m = 0;
        if (m != 0)
        {
          m = 10;
          if (j < m) {}
        }
        else
        {
          j = b;
          if (j != 0) {}
          return;
        }
      }
      finally
      {
        localObject3 = this.d;
        ((SQLiteDatabase)localObject3).endTransaction();
      }
    }
  }
  
  public Cursor b(long paramLong)
  {
    int i = 1;
    boolean bool = false;
    Object localObject1 = null;
    Object localObject3 = null;
    int j = 0;
    for (;;)
    {
      try
      {
        localObject1 = this.d;
        if (localObject1 != null)
        {
          localObject1 = this.d;
          bool = ((SQLiteDatabase)localObject1).isOpen();
          if (bool) {}
        }
        else
        {
          bool = a;
          if (bool) {}
          localObject1 = this.e;
          localObject1 = ((b)localObject1).getWritableDatabase();
          this.d = ((SQLiteDatabase)localObject1);
        }
        bool = true;
        String[] arrayOfString1 = new String[bool];
        bool = false;
        localObject1 = null;
        String str1 = "_id";
        arrayOfString1[0] = str1;
        String str2 = "server_id = ?";
        bool = true;
        String[] arrayOfString2 = new String[bool];
        bool = false;
        localObject1 = null;
        str1 = String.valueOf(paramLong);
        arrayOfString2[0] = str1;
        localObject1 = this.d;
        str1 = "contacts";
        localObject1 = ((SQLiteDatabase)localObject1).query(str1, arrayOfString1, str2, arrayOfString2, null, null, null);
        k = j;
        m = 0;
        arrayOfString1 = null;
      }
      catch (SQLiteException localSQLiteException)
      {
        bool = a;
        if (!bool) {
          continue;
        }
        int k = j + 1;
        long l = 1000L;
        SystemClock.sleep(l);
        Object localObject2 = localObject3;
        int m = i;
        continue;
        localObject3 = localObject2;
        j = k;
      }
      if (m != 0)
      {
        m = 10;
        if (k < m) {}
      }
      else
      {
        return (Cursor)localObject1;
      }
    }
  }
  
  public void b()
  {
    boolean bool1 = true;
    int k;
    for (int i = 0;; i = k) {
      for (;;)
      {
        try
        {
          Object localObject1 = this.d;
          if (localObject1 != null)
          {
            localObject1 = this.d;
            bool2 = ((SQLiteDatabase)localObject1).isOpen();
            if (bool2) {}
          }
          else
          {
            bool2 = a;
            if (bool2) {}
            localObject1 = this.e;
            localObject1 = ((b)localObject1).getWritableDatabase();
            this.d = ((SQLiteDatabase)localObject1);
          }
          boolean bool2 = true;
          Object localObject2 = new String[bool2];
          bool2 = false;
          localObject1 = null;
          localObject3 = "_id";
          localObject2[0] = localObject3;
          String str = "contact_state = ? OR contact_state = ? OR contact_state = ?";
          int j = 3;
          String[] arrayOfString = new String[j];
          j = 0;
          localObject1 = null;
          int m = 2;
          localObject3 = Integer.toString(m);
          arrayOfString[0] = localObject3;
          j = 1;
          m = 3;
          localObject3 = Integer.toString(m);
          arrayOfString[j] = localObject3;
          j = 2;
          m = 1;
          localObject3 = Integer.toString(m);
          arrayOfString[j] = localObject3;
          localObject1 = this.d;
          localObject3 = "contacts";
          localObject1 = ((SQLiteDatabase)localObject1).query((String)localObject3, (String[])localObject2, str, arrayOfString, null, null, null);
          long l;
          boolean bool5;
          if (localObject1 != null)
          {
            boolean bool4 = ((Cursor)localObject1).moveToFirst();
            if (bool4)
            {
              bool4 = ((Cursor)localObject1).isAfterLast();
              if (!bool4)
              {
                localObject3 = "_id";
                int n = ((Cursor)localObject1).getColumnIndex((String)localObject3);
                l = ((Cursor)localObject1).getLong(n);
                boolean bool6 = b;
                if (bool6) {}
                str = "_id= ?";
                int i2 = 1;
                arrayOfString = new String[i2];
                localObject3 = Long.toString(l);
                arrayOfString[0] = localObject3;
                localObject3 = this.d;
                localObject2 = "contact_mail";
                ((SQLiteDatabase)localObject3).delete((String)localObject2, str, arrayOfString);
                bool5 = b;
                if (bool5) {}
                localObject3 = this.d;
                localObject2 = "contact_number";
                ((SQLiteDatabase)localObject3).delete((String)localObject2, str, arrayOfString);
                bool5 = b;
                if (bool5) {}
                ((Cursor)localObject1).moveToNext();
                continue;
              }
            }
          }
          boolean bool3;
          if (localSQLiteException == null) {
            break label402;
          }
        }
        catch (SQLiteException localSQLiteException)
        {
          bool3 = a;
          if (bool3) {}
          k = i + 1;
          l = 1000L;
          SystemClock.sleep(l);
          bool5 = bool1;
          if (bool5)
          {
            i1 = 10;
            if (k < i1) {
              break;
            }
          }
          return;
        }
        localSQLiteException.close();
        label402:
        k = i;
        int i1 = 0;
        Object localObject3 = null;
      }
    }
  }
  
  public void b(long paramLong, a parama, int paramInt)
  {
    long l1 = 0L;
    int i = 1;
    boolean bool1 = b;
    if (bool1) {}
    int n = 0;
    for (;;)
    {
      try
      {
        localObject1 = this.d;
        if (localObject1 != null)
        {
          localObject1 = this.d;
          bool1 = ((SQLiteDatabase)localObject1).isOpen();
          if (bool1) {}
        }
        else
        {
          bool1 = a;
          if (bool1) {}
          localObject1 = this.e;
          localObject1 = ((b)localObject1).getWritableDatabase();
          this.d = ((SQLiteDatabase)localObject1);
        }
        localObject1 = this.d;
        ((SQLiteDatabase)localObject1).beginTransaction();
        localObject1 = "_id = ?";
        i1 = 1;
      }
      catch (SQLiteException localSQLiteException)
      {
        Object localObject1;
        int i1;
        Object localObject3;
        boolean bool2;
        Object localObject4;
        Object localObject5;
        long l2;
        Object localObject6;
        int j;
        int k = a;
        if (k == 0) {
          continue;
        }
        int m = n + 1;
        long l4 = 1000L;
        SystemClock.sleep(l4);
        n = i;
        continue;
        n = m;
      }
      try
      {
        localObject3 = new String[i1];
        bool2 = false;
        localObject4 = null;
        localObject5 = Long.toString(paramLong);
        localObject3[0] = localObject5;
        localObject4 = new android/content/ContentValues;
        ((ContentValues)localObject4).<init>();
        localObject5 = "client_id";
        l2 = parama.d();
        localObject6 = Long.valueOf(l2);
        ((ContentValues)localObject4).put((String)localObject5, (Long)localObject6);
        localObject5 = "contact_state";
        localObject6 = Integer.valueOf(paramInt);
        ((ContentValues)localObject4).put((String)localObject5, (Integer)localObject6);
        localObject5 = this.d;
        localObject6 = "contacts";
        j = ((SQLiteDatabase)localObject5).update((String)localObject6, (ContentValues)localObject4, (String)localObject1, (String[])localObject3);
        if (j > 0)
        {
          k = b;
          if (k == 0) {}
        }
        else
        {
          localObject1 = "_id= ?";
          i1 = 1;
          localObject3 = new String[i1];
          bool2 = false;
          localObject4 = null;
          localObject5 = Long.toString(paramLong);
          localObject3[0] = localObject5;
          localObject4 = this.d;
          localObject5 = "contact_mail";
          ((SQLiteDatabase)localObject4).delete((String)localObject5, (String)localObject1, (String[])localObject3);
          bool2 = b;
          if (bool2) {}
          localObject4 = this.d;
          localObject5 = "contact_number";
          ((SQLiteDatabase)localObject4).delete((String)localObject5, (String)localObject1, (String[])localObject3);
          k = b;
          if (k != 0) {}
          localObject1 = parama.h();
          localObject3 = ((List)localObject1).iterator();
          k = ((Iterator)localObject3).hasNext();
          if (k == 0) {
            continue;
          }
          localObject1 = ((Iterator)localObject3).next();
          localObject1 = (com.vvt.addressbookmanager.a.b)localObject1;
          bool2 = localObject1 instanceof com.vvt.addressbookmanager.a.c;
          if (bool2)
          {
            localObject4 = new android/content/ContentValues;
            ((ContentValues)localObject4).<init>();
            localObject5 = ((com.vvt.addressbookmanager.a.b)localObject1).a();
            localObject6 = "_id";
            Long localLong = Long.valueOf(paramLong);
            ((ContentValues)localObject4).put((String)localObject6, localLong);
            localObject6 = "email";
            ((ContentValues)localObject4).put((String)localObject6, (String)localObject5);
            localObject5 = this.d;
            localObject6 = "contact_mail";
            localLong = null;
            l3 = ((SQLiteDatabase)localObject5).insert((String)localObject6, null, (ContentValues)localObject4);
            bool2 = l3 < l1;
            if (bool2)
            {
              bool2 = b;
              if (!bool2) {
                continue;
              }
            }
          }
          bool2 = localObject1 instanceof com.vvt.addressbookmanager.a.d;
          if (!bool2) {
            continue;
          }
          localObject4 = new android/content/ContentValues;
          ((ContentValues)localObject4).<init>();
          localObject1 = ((com.vvt.addressbookmanager.a.b)localObject1).a();
          localObject5 = "_id";
          localObject6 = Long.valueOf(paramLong);
          ((ContentValues)localObject4).put((String)localObject5, (Long)localObject6);
          localObject5 = "number";
          ((ContentValues)localObject4).put((String)localObject5, (String)localObject1);
          localObject1 = this.d;
          localObject5 = "contact_number";
          localObject6 = null;
          long l3 = ((SQLiteDatabase)localObject1).insert((String)localObject5, null, (ContentValues)localObject4);
          k = l3 < l1;
          if (k <= 0) {
            continue;
          }
          k = b;
          if (k != 0) {
            continue;
          }
          k = a;
          if (k == 0) {
            continue;
          }
          continue;
        }
        k = a;
        if (k != 0)
        {
          continue;
          bool2 = a;
          if (bool2)
          {
            continue;
            localObject1 = this.d;
            ((SQLiteDatabase)localObject1).setTransactionSuccessful();
            localObject1 = this.d;
            ((SQLiteDatabase)localObject1).endTransaction();
            k = n;
            n = 0;
            if (n != 0)
            {
              n = 10;
              if (k < n) {}
            }
            else
            {
              k = b;
              if (k != 0) {}
              return;
            }
          }
        }
      }
      finally
      {
        localObject3 = this.d;
        ((SQLiteDatabase)localObject3).endTransaction();
      }
    }
  }
  
  public Cursor c(long paramLong)
  {
    int i = 1;
    boolean bool = false;
    Object localObject1 = null;
    int j = b;
    if (j != 0) {}
    Object localObject3 = null;
    int m = 0;
    for (;;)
    {
      try
      {
        localObject1 = this.d;
        if (localObject1 != null)
        {
          localObject1 = this.d;
          bool = ((SQLiteDatabase)localObject1).isOpen();
          if (bool) {}
        }
        else
        {
          bool = a;
          if (bool) {}
          localObject1 = this.e;
          localObject1 = ((b)localObject1).getReadableDatabase();
          this.d = ((SQLiteDatabase)localObject1);
        }
        bool = true;
        String[] arrayOfString1 = new String[bool];
        bool = false;
        localObject1 = null;
        String str1 = "_id";
        arrayOfString1[0] = str1;
        String str2 = "_id = ?";
        bool = true;
        String[] arrayOfString2 = new String[bool];
        bool = false;
        localObject1 = null;
        str1 = String.valueOf(paramLong);
        arrayOfString2[0] = str1;
        localObject1 = this.d;
        str1 = "contacts";
        localObject1 = ((SQLiteDatabase)localObject1).query(str1, arrayOfString1, str2, arrayOfString2, null, null, null);
        j = m;
        n = 0;
        arrayOfString1 = null;
      }
      catch (SQLiteException localSQLiteException)
      {
        bool = a;
        if (!bool) {
          continue;
        }
        int k = m + 1;
        long l = 1000L;
        SystemClock.sleep(l);
        Object localObject2 = localObject3;
        int n = i;
        continue;
        localObject3 = localObject2;
        m = k;
      }
      if (n != 0)
      {
        n = 10;
        if (j < n) {}
      }
      else
      {
        return (Cursor)localObject1;
      }
    }
  }
  
  public void c()
  {
    bool1 = true;
    i = 0;
    do
    {
      try
      {
        Object localObject1 = this.d;
        if (localObject1 != null)
        {
          localObject1 = this.d;
          bool2 = ((SQLiteDatabase)localObject1).isOpen();
          if (bool2) {}
        }
        else
        {
          bool2 = a;
          if (bool2) {}
          localObject1 = this.e;
          localObject1 = ((b)localObject1).getWritableDatabase();
          this.d = ((SQLiteDatabase)localObject1);
        }
        localObject1 = "contact_state = ?";
        int k = 1;
        String[] arrayOfString = new String[k];
        ContentValues localContentValues = null;
        Object localObject2 = null;
        localObject2 = Integer.toString(0);
        arrayOfString[0] = localObject2;
        localContentValues = new android/content/ContentValues;
        localContentValues.<init>();
        localObject2 = "contact_state";
        int m = 1;
        Object localObject3 = Integer.valueOf(m);
        localContentValues.put((String)localObject2, (Integer)localObject3);
        localObject2 = this.d;
        localObject3 = "contacts";
        ((SQLiteDatabase)localObject2).update((String)localObject3, localContentValues, (String)localObject1, arrayOfString);
        bool2 = false;
        localObject1 = null;
      }
      catch (SQLiteException localSQLiteException)
      {
        for (;;)
        {
          boolean bool2;
          int j;
          boolean bool3 = a;
          if (bool3) {}
          i += 1;
          long l = 1000L;
          SystemClock.sleep(l);
          bool3 = bool1;
        }
      }
      if (!bool2) {
        break;
      }
      j = 10;
    } while (i < j);
  }
  
  public Cursor d(long paramLong)
  {
    int i = 1;
    boolean bool = false;
    Object localObject1 = null;
    Object localObject3 = null;
    int j = 0;
    for (;;)
    {
      try
      {
        localObject1 = this.d;
        if (localObject1 != null)
        {
          localObject1 = this.d;
          bool = ((SQLiteDatabase)localObject1).isOpen();
          if (bool) {}
        }
        else
        {
          bool = a;
          if (bool) {}
          localObject1 = this.e;
          localObject1 = ((b)localObject1).getWritableDatabase();
          this.d = ((SQLiteDatabase)localObject1);
        }
        bool = true;
        String[] arrayOfString1 = new String[bool];
        bool = false;
        localObject1 = null;
        String str1 = "_id";
        arrayOfString1[0] = str1;
        String str2 = "client_id = ?";
        bool = true;
        String[] arrayOfString2 = new String[bool];
        bool = false;
        localObject1 = null;
        str1 = String.valueOf(paramLong);
        arrayOfString2[0] = str1;
        localObject1 = this.d;
        str1 = "contacts";
        localObject1 = ((SQLiteDatabase)localObject1).query(str1, arrayOfString1, str2, arrayOfString2, null, null, null);
        k = j;
        m = 0;
        arrayOfString1 = null;
      }
      catch (SQLiteException localSQLiteException)
      {
        bool = a;
        if (!bool) {
          continue;
        }
        int k = j + 1;
        long l = 1000L;
        SystemClock.sleep(l);
        Object localObject2 = localObject3;
        int m = i;
        continue;
        localObject3 = localObject2;
        j = k;
      }
      if (m != 0)
      {
        m = 10;
        if (k < m) {}
      }
      else
      {
        return (Cursor)localObject1;
      }
    }
  }
  
  public void d()
  {
    bool1 = true;
    i = 0;
    do
    {
      try
      {
        Object localObject1 = this.d;
        if (localObject1 != null)
        {
          localObject1 = this.d;
          bool2 = ((SQLiteDatabase)localObject1).isOpen();
          if (bool2) {}
        }
        else
        {
          bool2 = a;
          if (bool2) {}
          localObject1 = this.e;
          localObject1 = ((b)localObject1).getWritableDatabase();
          this.d = ((SQLiteDatabase)localObject1);
        }
        localObject1 = "send_state = ?";
        int k = 1;
        String[] arrayOfString = new String[k];
        ContentValues localContentValues = null;
        Object localObject2 = null;
        localObject2 = Integer.toString(0);
        arrayOfString[0] = localObject2;
        localContentValues = new android/content/ContentValues;
        localContentValues.<init>();
        localObject2 = "send_state";
        int m = 1;
        Object localObject3 = Integer.valueOf(m);
        localContentValues.put((String)localObject2, (Integer)localObject3);
        localObject2 = this.d;
        localObject3 = "contacts";
        ((SQLiteDatabase)localObject2).update((String)localObject3, localContentValues, (String)localObject1, arrayOfString);
        bool2 = false;
        localObject1 = null;
      }
      catch (SQLiteException localSQLiteException)
      {
        for (;;)
        {
          boolean bool2;
          int j;
          boolean bool3 = a;
          if (bool3) {}
          i += 1;
          long l = 1000L;
          SystemClock.sleep(l);
          bool3 = bool1;
        }
      }
      if (!bool2) {
        break;
      }
      j = 10;
    } while (i < j);
  }
  
  public Cursor e()
  {
    int i = 1;
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject3 = null;
    int k = 0;
    for (;;)
    {
      try
      {
        localObject1 = this.d;
        if (localObject1 != null)
        {
          localObject1 = this.d;
          bool1 = ((SQLiteDatabase)localObject1).isOpen();
          if (bool1) {}
        }
        else
        {
          bool1 = a;
          if (bool1) {}
          localObject1 = this.e;
          localObject1 = ((b)localObject1).getWritableDatabase();
          this.d = ((SQLiteDatabase)localObject1);
        }
        int j = 3;
        String[] arrayOfString = new String[j];
        j = 0;
        localObject1 = null;
        String str1 = "_id";
        arrayOfString[0] = str1;
        j = 1;
        str1 = "client_id";
        arrayOfString[j] = str1;
        j = 2;
        str1 = "server_id";
        arrayOfString[j] = str1;
        String str2 = "((contact_state=3) OR (contact_state=0)) AND (send_state=0)";
        localObject1 = this.d;
        str1 = "contacts";
        localObject1 = ((SQLiteDatabase)localObject1).query(str1, arrayOfString, str2, null, null, null, null);
        m = k;
        n = 0;
        arrayOfString = null;
      }
      catch (SQLiteException localSQLiteException)
      {
        boolean bool2 = a;
        if (!bool2) {
          continue;
        }
        int m = k + 1;
        long l = 1000L;
        SystemClock.sleep(l);
        Object localObject2 = localObject3;
        int n = i;
        continue;
        localObject3 = localObject2;
        k = m;
      }
      if (n != 0)
      {
        n = 10;
        if (m < n) {}
      }
      else
      {
        return (Cursor)localObject1;
      }
    }
  }
  
  public void f()
  {
    i = 0;
    do
    {
      try
      {
        Object localObject = this.d;
        if (localObject != null)
        {
          localObject = this.d;
          bool1 = ((SQLiteDatabase)localObject).isOpen();
          if (bool1) {}
        }
        else
        {
          bool1 = a;
          if (bool1) {}
          localObject = this.e;
          localObject = ((b)localObject).getWritableDatabase();
          this.d = ((SQLiteDatabase)localObject);
        }
        localObject = this.d;
        String str = "contacts";
        ((SQLiteDatabase)localObject).delete(str, null, null);
        bool1 = b;
        if (bool1) {}
        localObject = this.d;
        str = "contact_mail";
        ((SQLiteDatabase)localObject).delete(str, null, null);
        bool1 = b;
        if (bool1) {}
        localObject = this.d;
        str = "contact_number";
        ((SQLiteDatabase)localObject).delete(str, null, null);
        bool1 = b;
        if (bool1) {}
        bool1 = false;
        localObject = null;
      }
      catch (SQLiteException localSQLiteException)
      {
        for (;;)
        {
          boolean bool1;
          int j;
          boolean bool2 = a;
          if (bool2) {}
          bool2 = true;
          i += 1;
          long l = 1000L;
          SystemClock.sleep(l);
        }
      }
      if (!bool1) {
        break;
      }
      j = 10;
    } while (i < j);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/addressbookmanager/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */