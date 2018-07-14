package com.vvt.shell;

import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KMShell
{
  private static KMShell.OUTPUT a = KMShell.OUTPUT.STDOUT;
  private static String b;
  private static final String c = System.getProperty("line.separator");
  private static final String d;
  private static c e = null;
  
  static
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("exit");
    String str = c;
    d = str;
  }
  
  private static c a(Process paramProcess)
  {
    c localc = null;
    Object localObject1 = b.a;
    Object localObject2 = a;
    int i = ((KMShell.OUTPUT)localObject2).ordinal();
    int j = localObject1[i];
    switch (j)
    {
    }
    for (;;)
    {
      return localc;
      localObject1 = new com/vvt/shell/c;
      localObject2 = paramProcess.getInputStream();
      ((c)localObject1).<init>((InputStream)localObject2);
      localObject1 = new com/vvt/shell/c;
      localObject2 = paramProcess.getErrorStream();
      ((c)localObject1).<init>((InputStream)localObject2);
      continue;
      localc = new com/vvt/shell/c;
      localObject1 = paramProcess.getInputStream();
      localc.<init>((InputStream)localObject1);
      localObject1 = new com/vvt/shell/c;
      localObject2 = paramProcess.getErrorStream();
      ((c)localObject1).<init>((InputStream)localObject2);
      e = (c)localObject1;
      continue;
      localc = new com/vvt/shell/c;
      localObject1 = paramProcess.getErrorStream();
      localc.<init>((InputStream)localObject1);
      localObject1 = new com/vvt/shell/c;
      localObject2 = paramProcess.getInputStream();
      ((c)localObject1).<init>((InputStream)localObject2);
    }
  }
  
  public static String a(String paramString)
  {
    synchronized (KMShell.class)
    {
      boolean bool = a();
      if (bool)
      {
        str = b(paramString);
        return str;
      }
      bool = false;
      String str = null;
    }
  }
  
  public static boolean a()
  {
    for (;;)
    {
      synchronized (KMShell.class)
      {
        String str = b;
        if (str == null) {}
        try
        {
          c();
          str = b;
          if (str != null)
          {
            bool = true;
            return bool;
          }
        }
        catch (KMShell.ShellException localShellException)
        {
          bool = false;
          Object localObject1 = null;
          b = null;
          continue;
        }
      }
      boolean bool = false;
      Object localObject3 = null;
    }
  }
  
  /* Error */
  private static String b(String paramString)
  {
    // Byte code:
    //   0: invokestatic 90	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   3: astore_1
    //   4: getstatic 79	com/vvt/shell/KMShell:b	Ljava/lang/String;
    //   7: astore_2
    //   8: aload_1
    //   9: aload_2
    //   10: invokevirtual 94	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   13: astore_1
    //   14: aload_1
    //   15: invokestatic 97	com/vvt/shell/KMShell:getInstance	(Ljava/lang/Process;)Lcom/vvt/shell/c;
    //   18: astore_2
    //   19: new 99	java/io/DataOutputStream
    //   22: astore_3
    //   23: aload_1
    //   24: invokevirtual 103	java/lang/Process:getOutputStream	()Ljava/io/OutputStream;
    //   27: astore 4
    //   29: aload_3
    //   30: aload 4
    //   32: invokespecial 106	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   35: new 31	java/lang/StringBuilder
    //   38: astore 4
    //   40: aload 4
    //   42: invokespecial 35	java/lang/StringBuilder:<init>	()V
    //   45: aload 4
    //   47: aload_0
    //   48: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: astore 4
    //   53: getstatic 29	com/vvt/shell/KMShell:c	Ljava/lang/String;
    //   56: astore 5
    //   58: aload 4
    //   60: aload 5
    //   62: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: astore 4
    //   67: aload 4
    //   69: invokevirtual 45	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   72: astore 4
    //   74: aload_3
    //   75: aload 4
    //   77: invokevirtual 110	java/io/DataOutputStream:writeBytes	(Ljava/lang/String;)V
    //   80: aload_3
    //   81: invokevirtual 113	java/io/DataOutputStream:flush	()V
    //   84: getstatic 47	com/vvt/shell/KMShell:d	Ljava/lang/String;
    //   87: astore 4
    //   89: aload_3
    //   90: aload 4
    //   92: invokevirtual 110	java/io/DataOutputStream:writeBytes	(Ljava/lang/String;)V
    //   95: aload_3
    //   96: invokevirtual 113	java/io/DataOutputStream:flush	()V
    //   99: new 115	com/vvt/shell/getInstance
    //   102: astore_3
    //   103: aload_3
    //   104: aload_1
    //   105: invokespecial 118	com/vvt/shell/getInstance:<init>	(Ljava/lang/Process;)V
    //   108: invokestatic 124	java/util/concurrent/Executors:newSingleThreadExecutor	()Ljava/util/concurrent/ExecutorService;
    //   111: astore_1
    //   112: aload_1
    //   113: aload_3
    //   114: invokeinterface 130 2 0
    //   119: astore_1
    //   120: bipush 15
    //   122: i2l
    //   123: lstore 6
    //   125: getstatic 138	java/util/concurrent/TimeUnit:SECONDS	Ljava/util/concurrent/TimeUnit;
    //   128: astore 5
    //   130: aload_1
    //   131: lload 6
    //   133: aload 5
    //   135: invokeinterface 144 4 0
    //   140: pop
    //   141: aload_2
    //   142: invokevirtual 146	com/vvt/shell/c:getInstance	()Ljava/lang/String;
    //   145: areturn
    //   146: astore_1
    //   147: new 84	com/vvt/shell/KMShell$ShellException
    //   150: astore_1
    //   151: new 31	java/lang/StringBuilder
    //   154: astore_3
    //   155: aload_3
    //   156: invokespecial 35	java/lang/StringBuilder:<init>	()V
    //   159: ldc -108
    //   161: astore 4
    //   163: aload_3
    //   164: aload 4
    //   166: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   169: astore_3
    //   170: aload_3
    //   171: aload_0
    //   172: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: astore_3
    //   176: ldc -106
    //   178: astore 4
    //   180: aload_3
    //   181: aload 4
    //   183: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: astore_3
    //   187: aload_3
    //   188: invokevirtual 45	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   191: astore_3
    //   192: aload_1
    //   193: aload_3
    //   194: invokespecial 152	com/vvt/shell/KMShell$ShellException:<init>	(Ljava/lang/String;)V
    //   197: goto -56 -> 141
    //   200: astore_1
    //   201: new 84	com/vvt/shell/KMShell$ShellException
    //   204: astore_1
    //   205: aload_1
    //   206: invokespecial 153	com/vvt/shell/KMShell$ShellException:<init>	()V
    //   209: aload_1
    //   210: athrow
    //   211: astore_1
    //   212: new 84	com/vvt/shell/KMShell$ShellException
    //   215: astore_1
    //   216: new 31	java/lang/StringBuilder
    //   219: astore_3
    //   220: aload_3
    //   221: invokespecial 35	java/lang/StringBuilder:<init>	()V
    //   224: ldc -101
    //   226: astore 4
    //   228: aload_3
    //   229: aload 4
    //   231: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   234: astore_3
    //   235: aload_3
    //   236: aload_0
    //   237: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   240: astore_3
    //   241: ldc -99
    //   243: astore 4
    //   245: aload_3
    //   246: aload 4
    //   248: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   251: astore_3
    //   252: aload_3
    //   253: invokevirtual 45	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   256: astore_3
    //   257: aload_1
    //   258: aload_3
    //   259: invokespecial 152	com/vvt/shell/KMShell$ShellException:<init>	(Ljava/lang/String;)V
    //   262: goto -121 -> 141
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	265	0	paramString	String
    //   3	128	1	localObject1	Object
    //   146	1	1	localTimeoutException	java.util.concurrent.TimeoutException
    //   150	43	1	localShellException1	KMShell.ShellException
    //   200	1	1	localException	Exception
    //   204	6	1	localShellException2	KMShell.ShellException
    //   211	1	1	localExecutionException	java.util.concurrent.ExecutionException
    //   215	43	1	localShellException3	KMShell.ShellException
    //   7	135	2	localObject2	Object
    //   22	237	3	localObject3	Object
    //   27	220	4	localObject4	Object
    //   56	78	5	localObject5	Object
    //   123	9	6	l	long
    // Exception table:
    //   from	to	target	type
    //   125	128	146	java/util/concurrent/TimeoutException
    //   133	141	146	java/util/concurrent/TimeoutException
    //   0	3	200	java/lang/Exception
    //   4	7	200	java/lang/Exception
    //   9	13	200	java/lang/Exception
    //   14	18	200	java/lang/Exception
    //   19	22	200	java/lang/Exception
    //   23	27	200	java/lang/Exception
    //   30	35	200	java/lang/Exception
    //   35	38	200	java/lang/Exception
    //   40	45	200	java/lang/Exception
    //   47	51	200	java/lang/Exception
    //   53	56	200	java/lang/Exception
    //   60	65	200	java/lang/Exception
    //   67	72	200	java/lang/Exception
    //   75	80	200	java/lang/Exception
    //   80	84	200	java/lang/Exception
    //   84	87	200	java/lang/Exception
    //   90	95	200	java/lang/Exception
    //   95	99	200	java/lang/Exception
    //   99	102	200	java/lang/Exception
    //   104	108	200	java/lang/Exception
    //   108	111	200	java/lang/Exception
    //   113	119	200	java/lang/Exception
    //   125	128	200	java/lang/Exception
    //   133	141	200	java/lang/Exception
    //   141	145	200	java/lang/Exception
    //   147	150	200	java/lang/Exception
    //   151	154	200	java/lang/Exception
    //   155	159	200	java/lang/Exception
    //   164	169	200	java/lang/Exception
    //   171	175	200	java/lang/Exception
    //   181	186	200	java/lang/Exception
    //   187	191	200	java/lang/Exception
    //   193	197	200	java/lang/Exception
    //   212	215	200	java/lang/Exception
    //   216	219	200	java/lang/Exception
    //   220	224	200	java/lang/Exception
    //   229	234	200	java/lang/Exception
    //   236	240	200	java/lang/Exception
    //   246	251	200	java/lang/Exception
    //   252	256	200	java/lang/Exception
    //   258	262	200	java/lang/Exception
    //   125	128	211	java/util/concurrent/ExecutionException
    //   133	141	211	java/util/concurrent/ExecutionException
  }
  
  private static void c()
  {
    KMShell.SU_COMMAND[] arrayOfSU_COMMAND = KMShell.SU_COMMAND.values();
    int i = arrayOfSU_COMMAND.length;
    int j = 0;
    if (j < i)
    {
      String str = arrayOfSU_COMMAND[j].getCommand();
      b = str;
      boolean bool = d();
      if (!bool) {}
    }
    for (;;)
    {
      return;
      j += 1;
      break;
      j = 0;
      b = null;
    }
  }
  
  private static boolean d()
  {
    int i = 1;
    KMShell.UID_COMMAND[] arrayOfUID_COMMAND = KMShell.UID_COMMAND.values();
    int k = arrayOfUID_COMMAND.length;
    int m = 0;
    if (m < k)
    {
      Object localObject1 = a(arrayOfUID_COMMAND[m].getCommand());
      if (localObject1 != null)
      {
        int n = ((String)localObject1).length();
        if (n > 0)
        {
          Object localObject2 = Pattern.compile("^uid=(\\d+).*?");
          localObject1 = ((Pattern)localObject2).matcher((CharSequence)localObject1);
          boolean bool1 = ((Matcher)localObject1).matches();
          if (bool1)
          {
            localObject2 = "0";
            localObject1 = ((Matcher)localObject1).group(i);
            boolean bool2 = ((String)localObject2).equals(localObject1);
            if (!bool2) {}
          }
        }
      }
    }
    for (;;)
    {
      return i;
      m += 1;
      break;
      int j = 0;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/shell/KMShell.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */