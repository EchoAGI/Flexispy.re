package com.krecorder.call.callrecorder;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class i
  extends Handler
{
  public i(f paramf, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  private void a()
  {
    int i = 1;
    for (;;)
    {
      try
      {
        Object localObject1 = this.a;
        bool1 = f.a((f)localObject1);
        if (bool1)
        {
          localObject1 = new java/lang/Exception;
          localObject5 = "Already handling a start request";
          ((Exception)localObject1).<init>((String)localObject5);
          throw ((Throwable)localObject1);
        }
      }
      catch (Exception localException)
      {
        localObject5 = this.a;
        localObject5 = f.d((f)localObject5);
        if (localObject5 != null)
        {
          localObject5 = this.a;
          localObject5 = f.d((f)localObject5);
          localObject2 = localException.getMessage();
          ((h)localObject5).a((String)localObject2);
        }
        return;
        boolean bool1 = f.g();
        if (bool1) {}
        Object localObject2 = this.a;
        boolean bool2 = true;
        f.a((f)localObject2, bool2);
        localObject2 = this.a;
        bool1 = f.b((f)localObject2);
        if (!bool1)
        {
          localObject2 = new java/lang/Exception;
          localObject5 = "Failed to initialize user settings";
          ((Exception)localObject2).<init>((String)localObject5);
          throw ((Throwable)localObject2);
        }
      }
      finally {}
      localObject4 = this.a;
      int j = f.c((f)localObject4);
      int k = 2;
      if (j == k)
      {
        localObject4 = this.a;
        ((f)localObject4).c();
      }
      else
      {
        localObject4 = this.a;
        j = f.c((f)localObject4);
        if (j != i) {
          break;
        }
        localObject4 = this.a;
        k = 1;
        f.b((f)localObject4, k);
      }
    }
    Object localObject4 = new java/lang/Exception;
    Object localObject5 = "Failed to acquire a valid recording context";
    ((Exception)localObject4).<init>((String)localObject5);
    throw ((Throwable)localObject4);
  }
  
  /* Error */
  private void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 8	com/krecorder/call/callrecorder/i:a	Lcom/krecorder/call/callrecorder/f;
    //   6: astore_1
    //   7: aload_1
    //   8: invokestatic 65	com/krecorder/call/callrecorder/f:e	(Lcom/krecorder/call/callrecorder/f;)I
    //   11: istore_2
    //   12: bipush 7
    //   14: istore_3
    //   15: iload_2
    //   16: iload_3
    //   17: if_icmpne +67 -> 84
    //   20: aload_0
    //   21: getfield 8	com/krecorder/call/callrecorder/i:a	Lcom/krecorder/call/callrecorder/f;
    //   24: astore_1
    //   25: aload_1
    //   26: invokestatic 70	com/krecorder/call/callrecorder/f:f	(Lcom/krecorder/call/callrecorder/f;)Ljava/lang/Object;
    //   29: astore 4
    //   31: aload 4
    //   33: monitorenter
    //   34: aload_0
    //   35: getfield 8	com/krecorder/call/callrecorder/i:a	Lcom/krecorder/call/callrecorder/f;
    //   38: astore_1
    //   39: aload_1
    //   40: invokestatic 70	com/krecorder/call/callrecorder/f:f	(Lcom/krecorder/call/callrecorder/f;)Ljava/lang/Object;
    //   43: astore_1
    //   44: aload_1
    //   45: invokevirtual 75	java/lang/Object:notifyAll	()V
    //   48: aload 4
    //   50: monitorexit
    //   51: ldc2_w 76
    //   54: lstore 5
    //   56: lload 5
    //   58: invokestatic 85	java/lang/Thread:sleep	(J)V
    //   61: aload_0
    //   62: getfield 8	com/krecorder/call/callrecorder/i:a	Lcom/krecorder/call/callrecorder/f;
    //   65: astore_1
    //   66: aload_1
    //   67: invokestatic 89	com/krecorder/call/callrecorder/f:AppEngine1	(Lcom/krecorder/call/callrecorder/f;)V
    //   70: aload_0
    //   71: monitorexit
    //   72: return
    //   73: astore_1
    //   74: aload 4
    //   76: monitorexit
    //   77: aload_1
    //   78: athrow
    //   79: astore_1
    //   80: aload_0
    //   81: monitorexit
    //   82: aload_1
    //   83: athrow
    //   84: aload_0
    //   85: getfield 8	com/krecorder/call/callrecorder/i:a	Lcom/krecorder/call/callrecorder/f;
    //   88: astore_1
    //   89: aload_1
    //   90: invokestatic 92	com/krecorder/call/callrecorder/f:FxFileObserverWorker	(Lcom/krecorder/call/callrecorder/f;)Lcom/krecorder/call/callrecorder/m;
    //   93: astore_1
    //   94: aload_1
    //   95: ifnull -34 -> 61
    //   98: aload_0
    //   99: getfield 8	com/krecorder/call/callrecorder/i:a	Lcom/krecorder/call/callrecorder/f;
    //   102: astore_1
    //   103: aload_1
    //   104: invokestatic 92	com/krecorder/call/callrecorder/f:FxFileObserverWorker	(Lcom/krecorder/call/callrecorder/f;)Lcom/krecorder/call/callrecorder/m;
    //   107: astore_1
    //   108: aload_1
    //   109: invokeinterface 96 1 0
    //   114: istore_2
    //   115: iload_2
    //   116: ifeq -55 -> 61
    //   119: aload_0
    //   120: getfield 8	com/krecorder/call/callrecorder/i:a	Lcom/krecorder/call/callrecorder/f;
    //   123: astore_1
    //   124: aload_1
    //   125: invokestatic 92	com/krecorder/call/callrecorder/f:FxFileObserverWorker	(Lcom/krecorder/call/callrecorder/f;)Lcom/krecorder/call/callrecorder/m;
    //   128: astore_1
    //   129: iconst_3
    //   130: istore_3
    //   131: aload_1
    //   132: iload_3
    //   133: invokeinterface 100 2 0
    //   138: ldc2_w 76
    //   141: lstore 5
    //   143: lload 5
    //   145: invokestatic 85	java/lang/Thread:sleep	(J)V
    //   148: goto -87 -> 61
    //   151: astore_1
    //   152: goto -91 -> 61
    //   155: astore_1
    //   156: goto -95 -> 61
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	159	0	this	i
    //   6	61	1	localObject1	Object
    //   73	5	1	localObject2	Object
    //   79	4	1	localObject3	Object
    //   88	44	1	localObject4	Object
    //   151	1	1	localException1	Exception
    //   155	1	1	localException2	Exception
    //   11	7	2	i	int
    //   114	2	2	bool	boolean
    //   14	119	3	j	int
    //   54	90	5	l	long
    // Exception table:
    //   from	to	target	type
    //   34	38	73	finally
    //   39	43	73	finally
    //   44	48	73	finally
    //   48	51	73	finally
    //   74	77	73	finally
    //   2	6	79	finally
    //   7	11	79	finally
    //   20	24	79	finally
    //   25	29	79	finally
    //   31	34	79	finally
    //   56	61	79	finally
    //   61	65	79	finally
    //   66	70	79	finally
    //   77	79	79	finally
    //   84	88	79	finally
    //   89	93	79	finally
    //   98	102	79	finally
    //   103	107	79	finally
    //   108	114	79	finally
    //   119	123	79	finally
    //   124	128	79	finally
    //   132	138	79	finally
    //   143	148	79	finally
    //   143	148	151	java/lang/Exception
    //   56	61	155	java/lang/Exception
  }
  
  public void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    switch (i)
    {
    default: 
      boolean bool = f.g();
      if (!bool) {
        break;
      }
    }
    for (;;)
    {
      return;
      a();
      continue;
      b();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/krecorder/call/callrecorder/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */