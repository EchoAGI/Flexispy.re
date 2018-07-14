package com.krecorder.call.a;

import android.os.Looper;
import com.vvt.ak.a;
import java.io.PrintWriter;

public class b
{
  private static final boolean a = a.e;
  private static final boolean b = a.a;
  private static b c = null;
  private String d = "";
  private String e;
  private String f;
  private boolean g;
  private Process h;
  private PrintWriter i;
  private final Object j;
  
  private b()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.j = localObject;
    d();
  }
  
  public static b a(boolean paramBoolean)
  {
    b localb;
    boolean bool;
    Exception localException3;
    if (!paramBoolean)
    {
      localb = new com/krecorder/call/a/b;
      localb.<init>();
      bool = false;
      localException3 = null;
    }
    for (;;)
    {
      try
      {
        localb.b(false);
        localb.c();
        return localb;
      }
      catch (Exception localException1)
      {
        localException3 = new java/lang/Exception;
        localObject = localException1.getMessage();
        localException3.<init>((String)localObject);
        throw localException3;
      }
      Object localObject = c;
      if (localObject == null)
      {
        localObject = new com/krecorder/call/a/b;
        ((b)localObject).<init>();
        c = (b)localObject;
      }
      try
      {
        localObject = c;
        bool = true;
        ((b)localObject).b(bool);
        localObject = c;
        ((b)localObject).c();
        localObject = c;
      }
      catch (Exception localException2)
      {
        localException3 = new java/lang/Exception;
        String str = localException2.getMessage();
        localException3.<init>(str);
        throw localException3;
      }
    }
  }
  
  private void b(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  /* Error */
  private void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 82	com/krecorder/call/a/removeFromPath:FxFileObserverWorker	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +112 -> 120
    //   11: invokestatic 88	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   14: astore_2
    //   15: ldc 90
    //   17: astore_3
    //   18: aload_2
    //   19: aload_3
    //   20: invokevirtual 94	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   23: astore_2
    //   24: aload_0
    //   25: aload_2
    //   26: putfield 63	com/krecorder/call/a/removeFromPath:AppEngine1	Ljava/lang/Process;
    //   29: new 96	java/io/PrintWriter
    //   32: astore_2
    //   33: new 98	java/io/BufferedWriter
    //   36: astore_3
    //   37: new 100	java/io/OutputStreamWriter
    //   40: astore 4
    //   42: aload_0
    //   43: getfield 63	com/krecorder/call/a/removeFromPath:AppEngine1	Ljava/lang/Process;
    //   46: astore 5
    //   48: aload 5
    //   50: invokevirtual 106	java/lang/Process:getOutputStream	()Ljava/io/OutputStream;
    //   53: astore 5
    //   55: aload 4
    //   57: aload 5
    //   59: invokespecial 109	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;)V
    //   62: aload_3
    //   63: aload 4
    //   65: invokespecial 112	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   68: iconst_1
    //   69: istore 6
    //   71: aload_2
    //   72: aload_3
    //   73: iload 6
    //   75: invokespecial 115	java/io/PrintWriter:<init>	(Ljava/io/Writer;Z)V
    //   78: aload_0
    //   79: aload_2
    //   80: putfield 61	com/krecorder/call/a/removeFromPath:i	Ljava/io/PrintWriter;
    //   83: new 117	com/krecorder/call/a/MyUncaughtExceptionHandler
    //   86: astore_2
    //   87: aconst_null
    //   88: astore_3
    //   89: aload_2
    //   90: aload_0
    //   91: iconst_0
    //   92: invokespecial 120	com/krecorder/call/a/MyUncaughtExceptionHandler:<init>	(Lcom/krecorder/call/a/removeFromPath;I)V
    //   95: new 117	com/krecorder/call/a/MyUncaughtExceptionHandler
    //   98: astore_3
    //   99: iconst_1
    //   100: istore 6
    //   102: aload_3
    //   103: aload_0
    //   104: iload 6
    //   106: invokespecial 120	com/krecorder/call/a/MyUncaughtExceptionHandler:<init>	(Lcom/krecorder/call/a/removeFromPath;I)V
    //   109: aload_2
    //   110: invokevirtual 123	com/krecorder/call/a/MyUncaughtExceptionHandler:start	()V
    //   113: aload_3
    //   114: invokevirtual 123	com/krecorder/call/a/MyUncaughtExceptionHandler:start	()V
    //   117: aload_0
    //   118: monitorexit
    //   119: return
    //   120: invokestatic 88	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   123: astore_2
    //   124: ldc 125
    //   126: astore_3
    //   127: aload_2
    //   128: aload_3
    //   129: invokevirtual 94	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   132: astore_2
    //   133: aload_0
    //   134: aload_2
    //   135: putfield 63	com/krecorder/call/a/removeFromPath:AppEngine1	Ljava/lang/Process;
    //   138: goto -109 -> 29
    //   141: astore_2
    //   142: new 51	java/lang/Exception
    //   145: astore_3
    //   146: aload_2
    //   147: invokevirtual 55	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   150: astore_2
    //   151: aload_3
    //   152: aload_2
    //   153: invokespecial 58	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   156: aload_3
    //   157: athrow
    //   158: astore_2
    //   159: aload_0
    //   160: monitorexit
    //   161: aload_2
    //   162: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	163	0	this	removeFromPath
    //   6	2	1	bool	boolean
    //   14	121	2	localObject1	Object
    //   141	6	2	localException	Exception
    //   150	3	2	str	String
    //   158	4	2	localObject2	Object
    //   17	140	3	localObject3	Object
    //   40	24	4	localOutputStreamWriter	java.io.OutputStreamWriter
    //   46	12	5	localObject4	Object
    //   69	36	6	k	int
    // Exception table:
    //   from	to	target	type
    //   2	6	141	java/lang/Exception
    //   11	14	141	java/lang/Exception
    //   19	23	141	java/lang/Exception
    //   25	29	141	java/lang/Exception
    //   29	32	141	java/lang/Exception
    //   33	36	141	java/lang/Exception
    //   37	40	141	java/lang/Exception
    //   42	46	141	java/lang/Exception
    //   48	53	141	java/lang/Exception
    //   57	62	141	java/lang/Exception
    //   63	68	141	java/lang/Exception
    //   73	78	141	java/lang/Exception
    //   79	83	141	java/lang/Exception
    //   83	86	141	java/lang/Exception
    //   91	95	141	java/lang/Exception
    //   95	98	141	java/lang/Exception
    //   104	109	141	java/lang/Exception
    //   109	113	141	java/lang/Exception
    //   113	117	141	java/lang/Exception
    //   120	123	141	java/lang/Exception
    //   128	132	141	java/lang/Exception
    //   134	138	141	java/lang/Exception
    //   2	6	158	finally
    //   11	14	158	finally
    //   19	23	158	finally
    //   25	29	158	finally
    //   29	32	158	finally
    //   33	36	158	finally
    //   37	40	158	finally
    //   42	46	158	finally
    //   48	53	158	finally
    //   57	62	158	finally
    //   63	68	158	finally
    //   73	78	158	finally
    //   79	83	158	finally
    //   83	86	158	finally
    //   91	95	158	finally
    //   95	98	158	finally
    //   104	109	158	finally
    //   109	113	158	finally
    //   113	117	158	finally
    //   120	123	158	finally
    //   128	132	158	finally
    //   134	138	158	finally
    //   142	145	158	finally
    //   146	150	158	finally
    //   152	156	158	finally
    //   156	158	158	finally
  }
  
  private void d()
  {
    String str = "";
    try
    {
      this.d = str;
      str = "";
      this.e = str;
      str = "";
      this.f = str;
      return;
    }
    finally {}
  }
  
  public void a(String paramString)
  {
    try
    {
      Object localObject1 = Looper.getMainLooper();
      ??? = Looper.myLooper();
      if (localObject1 == ???)
      {
        localObject1 = new java/lang/Exception;
        ??? = "Cannot call shell commands on the main thread";
        ((Exception)localObject1).<init>((String)???);
        throw ((Throwable)localObject1);
      }
    }
    catch (Exception localException1)
    {
      ??? = new java/lang/Exception;
      ((Exception)???).<init>(localException1);
      throw ((Throwable)???);
    }
    finally {}
    Object localObject3 = "$";
    boolean bool1 = paramString.contains((CharSequence)localObject3);
    if (bool1)
    {
      localObject3 = "$";
      ??? = "\\$";
      paramString = paramString.replace((CharSequence)localObject3, (CharSequence)???);
    }
    localObject3 = paramString.trim();
    ??? = ";";
    boolean bool2 = ((String)localObject3).endsWith((String)???);
    if (bool2)
    {
      bool2 = false;
      ??? = null;
      int k = 59;
      k = ((String)localObject3).lastIndexOf(k);
      localObject3 = ((String)localObject3).substring(0, k);
    }
    d();
    synchronized (this.j)
    {
      this.d = ((String)localObject3);
      localObject6 = this.i;
      if (localObject6 != null)
      {
        localObject6 = this.i;
        Object localObject7 = new java/lang/StringBuilder;
        ((StringBuilder)localObject7).<init>();
        localObject3 = ((StringBuilder)localObject7).append((String)localObject3);
        localObject7 = ";echo ";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject7);
        localObject7 = "6dfd033c155943bb9f4eab3328813c84";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject7);
        localObject3 = ((StringBuilder)localObject3).toString();
        ((PrintWriter)localObject6).println((String)localObject3);
        localObject3 = this.j;
        localObject3.wait();
      }
      localObject3 = this.i;
      if (localObject3 != null) {
        break label268;
      }
      bool1 = this.g;
      if (bool1)
      {
        localObject3 = new java/lang/Exception;
        localObject6 = "Superuser was denied access";
        ((Exception)localObject3).<init>((String)localObject6);
        throw ((Throwable)localObject3);
      }
    }
    Exception localException2 = new java/lang/Exception;
    Object localObject6 = "Process unexpectedly closed";
    localException2.<init>((String)localObject6);
    throw localException2;
    label268:
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/krecorder/call/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */