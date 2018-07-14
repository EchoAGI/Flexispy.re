package com.vvt.d;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.Browser;
import java.util.ArrayList;
import java.util.List;

public class d
{
  private static final String[] a;
  
  static
  {
    String[] arrayOfString = new String[5];
    arrayOfString[0] = "_id";
    arrayOfString[1] = "date";
    arrayOfString[2] = "bookmark";
    arrayOfString[3] = "title";
    arrayOfString[4] = "url";
    a = arrayOfString;
  }
  
  public static Uri a(ContentResolver paramContentResolver, int paramInt)
  {
    Uri localUri1 = Browser.BOOKMARKS_URI;
    Object localObject1 = Build.MANUFACTURER.toLowerCase();
    Object localObject3 = "samsung";
    int i = ((String)localObject1).contains((CharSequence)localObject3);
    Cursor localCursor;
    if (i != 0)
    {
      localObject1 = "content://com.sec.android.app.sbrowser.browser/history";
      localObject3 = Uri.parse((String)localObject1);
      i = 1;
      if (paramInt == i)
      {
        localObject1 = "content://com.sec.android.app.sbrowser.browser/bookmarks";
        localObject3 = Uri.parse((String)localObject1);
      }
      localCursor = null;
      localObject1 = paramContentResolver;
    }
    for (;;)
    {
      try
      {
        localCursor = paramContentResolver.query((Uri)localObject3, null, null, null, null);
        if (localCursor == null) {
          break label123;
        }
        localObject1 = localObject3;
        if (localCursor != null) {
          localCursor.close();
        }
      }
      catch (Exception localException)
      {
        localException = localException;
        if (0 == 0) {
          continue;
        }
        null.close();
        Uri localUri2 = localUri1;
        continue;
      }
      finally
      {
        localObject2 = finally;
        if (0 == 0) {
          continue;
        }
        null.close();
        throw ((Throwable)localObject2);
      }
      return (Uri)localObject1;
      label123:
      Uri localUri3 = localUri1;
      continue;
      localUri3 = localUri1;
    }
  }
  
  /* Error */
  public static e a(Uri paramUri, ContentResolver paramContentResolver)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: ldc 73
    //   6: astore 4
    //   8: iload_2
    //   9: anewarray 4	java/lang/Object
    //   12: astore 5
    //   14: ldc 14
    //   16: astore 6
    //   18: aload 5
    //   20: iconst_0
    //   21: aload 6
    //   23: aastore
    //   24: aload 4
    //   26: aload 5
    //   28: invokestatic 77	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   31: astore 7
    //   33: getstatic 25	com/vvt/d/d:a	[Ljava/lang/String;
    //   36: astore 6
    //   38: aload_1
    //   39: astore 4
    //   41: aload_0
    //   42: astore 5
    //   44: aload_1
    //   45: aload_0
    //   46: aload 6
    //   48: aconst_null
    //   49: aconst_null
    //   50: aload 7
    //   52: invokevirtual 63	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   55: astore 5
    //   57: aload 5
    //   59: invokeinterface 81 1 0
    //   64: istore 8
    //   66: iload 8
    //   68: ifeq +254 -> 322
    //   71: new 83	com/vvt/d/e
    //   74: astore 4
    //   76: aload 4
    //   78: invokespecial 86	com/vvt/d/e:<init>	()V
    //   81: ldc 11
    //   83: astore 6
    //   85: aload 5
    //   87: aload 6
    //   89: invokeinterface 90 2 0
    //   94: istore 9
    //   96: aload 5
    //   98: iload 9
    //   100: invokeinterface 94 2 0
    //   105: lstore 10
    //   107: aload 4
    //   109: lload 10
    //   111: invokevirtual 97	com/vvt/d/e:a	(J)V
    //   114: ldc 14
    //   116: astore 6
    //   118: aload 5
    //   120: aload 6
    //   122: invokeinterface 90 2 0
    //   127: istore 9
    //   129: aload 5
    //   131: iload 9
    //   133: invokeinterface 94 2 0
    //   138: lstore 10
    //   140: aload 4
    //   142: lload 10
    //   144: invokevirtual 100	com/vvt/d/e:removeFromPath	(J)V
    //   147: ldc 17
    //   149: astore 6
    //   151: aload 5
    //   153: aload 6
    //   155: invokeinterface 90 2 0
    //   160: istore 9
    //   162: aload 5
    //   164: iload 9
    //   166: invokeinterface 104 2 0
    //   171: istore 9
    //   173: iload 9
    //   175: iload_2
    //   176: if_icmpge +97 -> 273
    //   179: iconst_0
    //   180: istore 9
    //   182: aconst_null
    //   183: astore 6
    //   185: aload 4
    //   187: iload 9
    //   189: invokevirtual 107	com/vvt/d/e:a	(Z)V
    //   192: ldc 20
    //   194: astore 6
    //   196: aload 5
    //   198: aload 6
    //   200: invokeinterface 90 2 0
    //   205: istore 9
    //   207: aload 5
    //   209: iload 9
    //   211: invokeinterface 111 2 0
    //   216: astore 6
    //   218: aload 4
    //   220: aload 6
    //   222: invokevirtual 114	com/vvt/d/e:a	(Ljava/lang/String;)V
    //   225: ldc 23
    //   227: astore 6
    //   229: aload 5
    //   231: aload 6
    //   233: invokeinterface 90 2 0
    //   238: istore 9
    //   240: aload 5
    //   242: iload 9
    //   244: invokeinterface 111 2 0
    //   249: astore 6
    //   251: aload 4
    //   253: aload 6
    //   255: invokevirtual 116	com/vvt/d/e:removeFromPath	(Ljava/lang/String;)V
    //   258: aload 5
    //   260: ifnull +10 -> 270
    //   263: aload 5
    //   265: invokeinterface 69 1 0
    //   270: aload 4
    //   272: areturn
    //   273: iload_2
    //   274: istore 9
    //   276: goto -91 -> 185
    //   279: astore 4
    //   281: iconst_0
    //   282: istore 8
    //   284: aconst_null
    //   285: astore 4
    //   287: aload_3
    //   288: ifnull -18 -> 270
    //   291: aload_3
    //   292: invokeinterface 69 1 0
    //   297: goto -27 -> 270
    //   300: astore 4
    //   302: iconst_0
    //   303: istore 8
    //   305: aconst_null
    //   306: astore 4
    //   308: aload 5
    //   310: astore_3
    //   311: goto -24 -> 287
    //   314: astore 6
    //   316: aload 5
    //   318: astore_3
    //   319: goto -32 -> 287
    //   322: iconst_0
    //   323: istore 8
    //   325: aconst_null
    //   326: astore 4
    //   328: goto -70 -> 258
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	331	0	paramUri	Uri
    //   0	331	1	paramContentResolver	ContentResolver
    //   1	273	2	i	int
    //   3	316	3	localObject1	Object
    //   6	265	4	localObject2	Object
    //   279	1	4	localObject3	Object
    //   285	1	4	localObject4	Object
    //   300	1	4	localObject5	Object
    //   306	21	4	localObject6	Object
    //   12	305	5	localObject7	Object
    //   16	238	6	localObject8	Object
    //   314	1	6	localObject9	Object
    //   31	20	7	str	String
    //   64	260	8	bool	boolean
    //   94	94	9	j	int
    //   205	70	9	k	int
    //   105	38	10	l	long
    // Exception table:
    //   from	to	target	type
    //   33	36	279	finally
    //   50	55	279	finally
    //   57	64	300	finally
    //   71	74	300	finally
    //   76	81	300	finally
    //   87	94	314	finally
    //   98	105	314	finally
    //   109	114	314	finally
    //   120	127	314	finally
    //   131	138	314	finally
    //   142	147	314	finally
    //   153	160	314	finally
    //   164	171	314	finally
    //   187	192	314	finally
    //   198	205	314	finally
    //   209	216	314	finally
    //   220	225	314	finally
    //   231	238	314	finally
    //   242	249	314	finally
    //   253	258	314	finally
  }
  
  public static ArrayList a(int paramInt, Uri paramUri, ContentResolver paramContentResolver)
  {
    int i = 1;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    j = -1;
    if (paramInt == j) {
      paramInt = -1 >>> 1;
    }
    Object localObject1 = "%s DESC LIMIT %d";
    int k = 2;
    Object localObject4 = new Object[k];
    localObject4[0] = "date";
    Object localObject6 = Integer.valueOf(paramInt);
    localObject4[i] = localObject6;
    String str = String.format((String)localObject1, (Object[])localObject4);
    try
    {
      localObject6 = a;
      localObject1 = paramContentResolver;
      localObject4 = paramUri;
      localObject1 = paramContentResolver.query(paramUri, (String[])localObject6, null, null, str);
      for (;;)
      {
        if (localObject1 == null) {
          break label330;
        }
        try
        {
          boolean bool = ((Cursor)localObject1).moveToNext();
          if (!bool) {
            break label330;
          }
          localObject6 = new com/vvt/d/e;
          ((e)localObject6).<init>();
          localObject4 = "_id";
          int m = ((Cursor)localObject1).getColumnIndex((String)localObject4);
          long l = ((Cursor)localObject1).getLong(m);
          ((e)localObject6).a(l);
          localObject4 = "date";
          m = ((Cursor)localObject1).getColumnIndex((String)localObject4);
          l = ((Cursor)localObject1).getLong(m);
          ((e)localObject6).b(l);
          localObject4 = "bookmark";
          m = ((Cursor)localObject1).getColumnIndex((String)localObject4);
          m = ((Cursor)localObject1).getInt(m);
          if (m >= i) {
            break label324;
          }
          m = 0;
          localObject4 = null;
          ((e)localObject6).a(m);
          localObject4 = "title";
          n = ((Cursor)localObject1).getColumnIndex((String)localObject4);
          localObject4 = ((Cursor)localObject1).getString(n);
          ((e)localObject6).a((String)localObject4);
          localObject4 = "url";
          n = ((Cursor)localObject1).getColumnIndex((String)localObject4);
          localObject4 = ((Cursor)localObject1).getString(n);
          ((e)localObject6).b((String)localObject4);
          localArrayList.add(localObject6);
        }
        finally {}
      }
    }
    finally
    {
      for (;;)
      {
        int n;
        j = 0;
        Object localObject3 = null;
      }
    }
    if (localObject1 != null) {}
    for (;;)
    {
      ((Cursor)localObject1).close();
      label324:
      label330:
      do
      {
        return localArrayList;
        n = i;
        break;
      } while (localObject1 == null);
    }
  }
  
  /* Error */
  public static List a(Uri paramUri, ContentResolver paramContentResolver, long paramLong)
  {
    // Byte code:
    //   0: iconst_2
    //   1: istore 4
    //   3: iconst_1
    //   4: istore 5
    //   6: new 118	java/util/ArrayList
    //   9: astore 6
    //   11: aload 6
    //   13: invokespecial 119	java/util/ArrayList:<init>	()V
    //   16: iload 4
    //   18: anewarray 4	java/lang/Object
    //   21: astore 7
    //   23: ldc 11
    //   25: invokevirtual 139	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   28: astore 8
    //   30: aload 7
    //   32: iconst_0
    //   33: aload 8
    //   35: aastore
    //   36: lload_2
    //   37: invokestatic 144	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   40: astore 8
    //   42: aload 7
    //   44: iload 5
    //   46: aload 8
    //   48: aastore
    //   49: ldc -120
    //   51: aload 7
    //   53: invokestatic 77	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   56: astore 9
    //   58: iconst_4
    //   59: anewarray 9	java/lang/String
    //   62: astore 8
    //   64: ldc 11
    //   66: invokevirtual 139	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   69: astore 10
    //   71: aload 8
    //   73: iconst_0
    //   74: aload 10
    //   76: aastore
    //   77: ldc -110
    //   79: invokevirtual 139	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   82: astore 10
    //   84: aload 8
    //   86: iload 5
    //   88: aload 10
    //   90: aastore
    //   91: ldc 20
    //   93: invokevirtual 139	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   96: astore 10
    //   98: aload 8
    //   100: iload 4
    //   102: aload 10
    //   104: aastore
    //   105: iconst_3
    //   106: istore 11
    //   108: ldc 23
    //   110: invokevirtual 139	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   113: astore 7
    //   115: aload 8
    //   117: iload 11
    //   119: aload 7
    //   121: aastore
    //   122: iconst_0
    //   123: istore 5
    //   125: aload_1
    //   126: astore 10
    //   128: aload_0
    //   129: astore 7
    //   131: aload_1
    //   132: aload_0
    //   133: aload 8
    //   135: aload 9
    //   137: aconst_null
    //   138: aconst_null
    //   139: invokevirtual 63	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   142: astore 10
    //   144: aload 10
    //   146: invokeinterface 130 1 0
    //   151: istore 12
    //   153: iload 12
    //   155: ifeq +213 -> 368
    //   158: new 83	com/vvt/d/e
    //   161: astore 7
    //   163: aload 7
    //   165: invokespecial 86	com/vvt/d/e:<init>	()V
    //   168: ldc 11
    //   170: astore 8
    //   172: aload 8
    //   174: invokevirtual 139	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   177: astore 8
    //   179: aload 10
    //   181: aload 8
    //   183: invokeinterface 90 2 0
    //   188: istore 13
    //   190: aload 10
    //   192: iload 13
    //   194: invokeinterface 94 2 0
    //   199: lstore 14
    //   201: aload 7
    //   203: lload 14
    //   205: invokevirtual 97	com/vvt/d/e:a	(J)V
    //   208: ldc -110
    //   210: astore 8
    //   212: aload 8
    //   214: invokevirtual 139	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   217: astore 8
    //   219: aload 10
    //   221: aload 8
    //   223: invokeinterface 90 2 0
    //   228: istore 13
    //   230: aload 10
    //   232: iload 13
    //   234: invokeinterface 94 2 0
    //   239: lstore 14
    //   241: aload 7
    //   243: lload 14
    //   245: invokevirtual 100	com/vvt/d/e:removeFromPath	(J)V
    //   248: iconst_1
    //   249: istore 13
    //   251: aload 7
    //   253: iload 13
    //   255: invokevirtual 107	com/vvt/d/e:a	(Z)V
    //   258: ldc 20
    //   260: astore 8
    //   262: aload 8
    //   264: invokevirtual 139	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   267: astore 8
    //   269: aload 10
    //   271: aload 8
    //   273: invokeinterface 90 2 0
    //   278: istore 13
    //   280: aload 10
    //   282: iload 13
    //   284: invokeinterface 111 2 0
    //   289: astore 8
    //   291: aload 7
    //   293: aload 8
    //   295: invokevirtual 114	com/vvt/d/e:a	(Ljava/lang/String;)V
    //   298: ldc 23
    //   300: astore 8
    //   302: aload 8
    //   304: invokevirtual 139	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   307: astore 8
    //   309: aload 10
    //   311: aload 8
    //   313: invokeinterface 90 2 0
    //   318: istore 13
    //   320: aload 10
    //   322: iload 13
    //   324: invokeinterface 111 2 0
    //   329: astore 8
    //   331: aload 7
    //   333: aload 8
    //   335: invokevirtual 116	com/vvt/d/e:removeFromPath	(Ljava/lang/String;)V
    //   338: aload 6
    //   340: aload 7
    //   342: invokeinterface 149 2 0
    //   347: pop
    //   348: goto -204 -> 144
    //   351: astore 7
    //   353: aload 10
    //   355: ifnull +10 -> 365
    //   358: aload 10
    //   360: invokeinterface 69 1 0
    //   365: aload 6
    //   367: areturn
    //   368: aload 10
    //   370: ifnull -5 -> 365
    //   373: goto -15 -> 358
    //   376: astore 10
    //   378: iconst_0
    //   379: istore 11
    //   381: aconst_null
    //   382: astore 10
    //   384: goto -31 -> 353
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	387	0	paramUri	Uri
    //   0	387	1	paramContentResolver	ContentResolver
    //   0	387	2	paramLong	long
    //   1	100	4	i	int
    //   4	120	5	j	int
    //   9	357	6	localArrayList	ArrayList
    //   21	320	7	localObject1	Object
    //   351	1	7	localObject2	Object
    //   28	306	8	localObject3	Object
    //   56	80	9	str	String
    //   69	300	10	localObject4	Object
    //   376	1	10	localObject5	Object
    //   382	1	10	localObject6	Object
    //   106	274	11	k	int
    //   151	3	12	bool	boolean
    //   188	66	13	m	int
    //   278	45	13	n	int
    //   199	45	14	l	long
    // Exception table:
    //   from	to	target	type
    //   144	151	351	finally
    //   158	161	351	finally
    //   163	168	351	finally
    //   172	177	351	finally
    //   181	188	351	finally
    //   192	199	351	finally
    //   203	208	351	finally
    //   212	217	351	finally
    //   221	228	351	finally
    //   232	239	351	finally
    //   243	248	351	finally
    //   253	258	351	finally
    //   262	267	351	finally
    //   271	278	351	finally
    //   282	289	351	finally
    //   293	298	351	finally
    //   302	307	351	finally
    //   311	318	351	finally
    //   322	329	351	finally
    //   333	338	351	finally
    //   340	348	351	finally
    //   138	142	376	finally
  }
  
  public static List a(Uri paramUri, ContentResolver paramContentResolver, long paramLong, int paramInt)
  {
    int i = 1;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = "%s > %d AND %s = %d";
    int j = 4;
    Object localObject4 = new Object[j];
    localObject4[0] = "_id";
    Object localObject6 = Long.valueOf(paramLong);
    localObject4[i] = localObject6;
    localObject4[2] = "bookmark";
    int n = 3;
    Object localObject7 = Integer.valueOf(paramInt);
    localObject4[n] = localObject7;
    localObject7 = String.format((String)localObject1, (Object[])localObject4);
    for (;;)
    {
      try
      {
        localObject6 = a;
        localObject1 = paramContentResolver;
        localObject4 = paramUri;
        localObject1 = paramContentResolver.query(paramUri, (String[])localObject6, (String)localObject7, null, null);
        try
        {
          boolean bool = ((Cursor)localObject1).moveToNext();
          if (!bool) {
            continue;
          }
          localObject6 = new com/vvt/d/e;
          ((e)localObject6).<init>();
          localObject4 = "_id";
          int k = ((Cursor)localObject1).getColumnIndex((String)localObject4);
          long l = ((Cursor)localObject1).getLong(k);
          ((e)localObject6).a(l);
          localObject4 = "date";
          k = ((Cursor)localObject1).getColumnIndex((String)localObject4);
          l = ((Cursor)localObject1).getLong(k);
          ((e)localObject6).b(l);
          localObject4 = "bookmark";
          k = ((Cursor)localObject1).getColumnIndex((String)localObject4);
          k = ((Cursor)localObject1).getInt(k);
          if (k >= i) {
            continue;
          }
          k = 0;
          localObject4 = null;
          ((e)localObject6).a(k);
          localObject4 = "title";
          m = ((Cursor)localObject1).getColumnIndex((String)localObject4);
          localObject4 = ((Cursor)localObject1).getString(m);
          ((e)localObject6).a((String)localObject4);
          localObject4 = "url";
          m = ((Cursor)localObject1).getColumnIndex((String)localObject4);
          localObject4 = ((Cursor)localObject1).getString(m);
          ((e)localObject6).b((String)localObject4);
          localArrayList.add(localObject6);
          continue;
          if (localObject1 == null) {
            continue;
          }
        }
        finally {}
      }
      finally
      {
        int m;
        Object localObject3 = null;
        continue;
      }
      ((Cursor)localObject1).close();
      return localArrayList;
      m = i;
      continue;
      if (localObject1 == null) {}
    }
  }
  
  public static void b(Uri paramUri, ContentResolver paramContentResolver, long paramLong)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "_id";
    Long localLong = Long.valueOf(paramLong);
    arrayOfObject[1] = localLong;
    String str = String.format("%s = %d", arrayOfObject);
    paramContentResolver.delete(paramUri, str, null);
  }
  
  public static void b(Uri paramUri, ContentResolver paramContentResolver, long paramLong, int paramInt)
  {
    int i = 1;
    Object localObject = "_id";
    if (paramInt == i) {
      localObject = ((String)localObject).toUpperCase();
    }
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = localObject;
    localObject = Long.valueOf(paramLong);
    arrayOfObject[i] = localObject;
    localObject = String.format("%s = %d", arrayOfObject);
    paramContentResolver.delete(paramUri, (String)localObject, null);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/d/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */