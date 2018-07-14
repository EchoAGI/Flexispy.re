package com.vvt.datadeliverymanager.b;

import android.content.Context;
import com.vvt.datadeliverymanager.enums.DataProviderType;
import com.vvt.datadeliverymanager.enums.DeliveryRequestType;
import com.vvt.datadeliverymanager.enums.PriorityRequest;
import com.vvt.datadeliverymanager.h;
import com.vvt.exceptions.FxListenerNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class b
{
  private static final boolean a;
  private static final boolean b;
  private static final boolean c;
  private static final boolean d;
  private static b e;
  private BlockingQueue f = null;
  private a g = null;
  private HashMap h = null;
  
  static
  {
    boolean bool = com.vvt.datadeliverymanager.a.a;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      b = com.vvt.datadeliverymanager.a.b;
      c = com.vvt.datadeliverymanager.a.d;
      d = com.vvt.datadeliverymanager.a.e;
      e = null;
      return;
    }
  }
  
  private b(String paramString, Context paramContext)
  {
    boolean bool = a;
    if (bool) {}
    bool = b;
    if (bool) {}
    localObject = new java/util/concurrent/LinkedBlockingQueue;
    ((LinkedBlockingQueue)localObject).<init>();
    this.f = ((BlockingQueue)localObject);
    localObject = new com/vvt/datadeliverymanager/b/a;
    ((a)localObject).<init>(paramContext, paramString);
    this.g = ((a)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.h = ((HashMap)localObject);
    bool = a;
    if (bool) {}
  }
  
  private com.vvt.datadeliverymanager.a.a a(int paramInt1, int paramInt2, long paramLong)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = this.h.entrySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    Object localObject2;
    int i;
    do
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = localIterator.next();
      localObject2 = localObject1;
      localObject2 = (Map.Entry)localObject1;
      localObject1 = (Integer)((Map.Entry)localObject2).getValue();
      i = ((Integer)localObject1).intValue();
    } while (i != paramInt1);
    localObject1 = (com.vvt.datadeliverymanager.a.a)((Map.Entry)localObject2).getKey();
    if (localObject1 == null)
    {
      localObject1 = new com/vvt/exceptions/FxListenerNotFoundException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Listener for the caller id:" + paramInt1 + " found null";
      ((FxListenerNotFoundException)localObject1).<init>((String)localObject2);
      ((FxListenerNotFoundException)localObject1).setCmdID(paramInt2);
      ((FxListenerNotFoundException)localObject1).setCallerID(paramInt1);
      ((FxListenerNotFoundException)localObject1).setCSID(paramLong);
      throw ((Throwable)localObject1);
      i = 0;
      localObject1 = null;
    }
    boolean bool2 = a;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    return (com.vvt.datadeliverymanager.a.a)localObject1;
  }
  
  public static b a(Context paramContext, String paramString)
  {
    synchronized (b.class)
    {
      b localb = e;
      if (localb == null)
      {
        localb = new com/vvt/datadeliverymanager/b/b;
        localb.<init>(paramString, paramContext);
        e = localb;
      }
      localb = e;
      return localb;
    }
  }
  
  private h a(h paramh, List paramList)
  {
    Iterator localIterator = paramList.iterator();
    h localh;
    int i;
    int j;
    do
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localh = (h)localIterator.next();
      PriorityRequest localPriorityRequest1 = localh.e();
      i = localPriorityRequest1.getNumber();
      PriorityRequest localPriorityRequest2 = paramh.e();
      j = localPriorityRequest2.getNumber();
    } while (i <= j);
    for (;;)
    {
      return localh;
      localh = paramh;
    }
  }
  
  private h a(List paramList)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool2 = a;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    Object localObject2 = paramList.iterator();
    for (;;)
    {
      bool2 = ((Iterator)localObject2).hasNext();
      if (!bool2) {
        break;
      }
      localObject3 = (h)((Iterator)localObject2).next();
      bool2 = a;
      if (!bool2) {}
    }
    bool2 = false;
    Object localObject3 = null;
    int j = 0;
    int k = 0;
    localObject2 = null;
    int i = paramList.size();
    if (j < i) {
      if (j == 0)
      {
        localObject3 = (h)paramList.get(j);
        localObject1 = localObject3;
      }
    }
    for (;;)
    {
      k = j + 1;
      j = k;
      localObject2 = localObject1;
      localObject1 = localObject3;
      break;
      localObject3 = (h)paramList.get(j);
      boolean bool4 = a;
      if (bool4) {}
      bool4 = a;
      if (bool4) {}
      PriorityRequest localPriorityRequest1 = ((h)localObject3).e();
      int m = localPriorityRequest1.getNumber();
      PriorityRequest localPriorityRequest2 = ((h)localObject1).e();
      int n = localPriorityRequest2.getNumber();
      if (m > n)
      {
        bool1 = a;
        if (bool1) {}
        localObject1 = localObject3;
        continue;
        if (localObject2 != null)
        {
          bool3 = a;
          if (!bool3) {}
        }
        boolean bool3 = a;
        if (bool3) {}
        return (h)localObject2;
      }
      else
      {
        localObject3 = localObject1;
        localObject1 = localObject2;
      }
    }
  }
  
  private boolean b(int paramInt)
  {
    if (paramInt > 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private List c()
  {
    h[] arrayOfh = new h[this.f.size()];
    this.f.toArray(arrayOfh);
    return Arrays.asList(arrayOfh);
  }
  
  private void c(h paramh)
  {
    int i = paramh.a();
    boolean bool = b(i);
    com.vvt.datadeliverymanager.a.a locala = paramh.d();
    if ((bool) && (locala == null))
    {
      paramh.a(-1);
      bool = c;
      if (!bool) {}
    }
  }
  
  private void d(h paramh)
  {
    com.vvt.datadeliverymanager.a.a locala = paramh.d();
    if (locala == null)
    {
      boolean bool = b;
      if (bool) {}
      int i = paramh.a();
      com.vvt.phoenix.prot.command.b localb = paramh.c();
      int j = localb.a();
      long l = paramh.g();
      locala = a(i, j, l);
      paramh.a(locala);
    }
  }
  
  private boolean e(h paramh)
  {
    DeliveryRequestType localDeliveryRequestType1 = paramh.f();
    DeliveryRequestType localDeliveryRequestType2 = DeliveryRequestType.REQUEST_TYPE_NEW;
    boolean bool;
    if (localDeliveryRequestType1 == localDeliveryRequestType2) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localDeliveryRequestType1 = null;
    }
  }
  
  private void f(h paramh)
  {
    g(paramh);
    this.g.b(paramh);
  }
  
  private void g(h paramh)
  {
    boolean bool = a;
    if (bool) {}
    BlockingQueue localBlockingQueue = this.f;
    bool = localBlockingQueue.contains(paramh);
    if (bool)
    {
      localBlockingQueue = this.f;
      localBlockingQueue.remove(paramh);
      bool = a;
      if (!bool) {}
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      bool = d;
      if (!bool) {}
    }
  }
  
  public void a()
  {
    this.g.b();
  }
  
  public void a(int paramInt, com.vvt.datadeliverymanager.a.a parama)
  {
    if (parama == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("DeliveryListener can't be null");
      throw ((Throwable)localObject);
    }
    Object localObject = this.h;
    Integer localInteger = Integer.valueOf(paramInt);
    ((HashMap)localObject).put(parama, localInteger);
  }
  
  public void a(long paramLong)
  {
    boolean bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    a locala = this.g;
    locala.a(paramLong);
    bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
  }
  
  /* Error */
  public void a(h paramh)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: ifnull +284 -> 287
    //   6: getstatic 23	com/vvt/datadeliverymanager/removeFromPath/removeFromPath:a	Z
    //   9: istore_2
    //   10: iload_2
    //   11: ifeq +3 -> 14
    //   14: getstatic 26	com/vvt/datadeliverymanager/removeFromPath/removeFromPath:removeFromPath	Z
    //   17: istore_2
    //   18: iload_2
    //   19: ifeq +3 -> 22
    //   22: aload_0
    //   23: aload_1
    //   24: invokespecial 228	com/vvt/datadeliverymanager/removeFromPath/removeFromPath:MyUncaughtExceptionHandler	(Lcom/vvt/datadeliverymanager/AppEngine1;)V
    //   27: aload_1
    //   28: invokevirtual 164	com/vvt/datadeliverymanager/AppEngine1:a	()I
    //   31: istore_2
    //   32: aload_0
    //   33: iload_2
    //   34: invokespecial 167	com/vvt/datadeliverymanager/removeFromPath/removeFromPath:removeFromPath	(I)Z
    //   37: istore_2
    //   38: iload_2
    //   39: ifeq +58 -> 97
    //   42: aload_0
    //   43: getfield 45	com/vvt/datadeliverymanager/removeFromPath/removeFromPath:AppEngine1	Ljava/util/HashMap;
    //   46: astore_3
    //   47: aload_1
    //   48: invokevirtual 170	com/vvt/datadeliverymanager/AppEngine1:d	()Lcom/vvt/datadeliverymanager/a/a;
    //   51: astore 4
    //   53: aload_3
    //   54: aload 4
    //   56: invokevirtual 231	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   59: istore_2
    //   60: iload_2
    //   61: ifne +36 -> 97
    //   64: aload_0
    //   65: getfield 45	com/vvt/datadeliverymanager/removeFromPath/removeFromPath:AppEngine1	Ljava/util/HashMap;
    //   68: astore_3
    //   69: aload_1
    //   70: invokevirtual 170	com/vvt/datadeliverymanager/AppEngine1:d	()Lcom/vvt/datadeliverymanager/a/a;
    //   73: astore 4
    //   75: aload_1
    //   76: invokevirtual 164	com/vvt/datadeliverymanager/AppEngine1:a	()I
    //   79: istore 5
    //   81: iload 5
    //   83: invokestatic 219	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   86: astore 6
    //   88: aload_3
    //   89: aload 4
    //   91: aload 6
    //   93: invokevirtual 223	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   96: pop
    //   97: aload_0
    //   98: getfield 43	com/vvt/datadeliverymanager/removeFromPath/removeFromPath:FxFileObserverWorker	Lcom/vvt/datadeliverymanager/removeFromPath/a;
    //   101: astore_3
    //   102: aload_1
    //   103: invokevirtual 175	com/vvt/datadeliverymanager/AppEngine1:MyUncaughtExceptionHandler	()Lcom/vvt/phoenix/prot/command/removeFromPath;
    //   106: astore 4
    //   108: aload 4
    //   110: invokeinterface 178 1 0
    //   115: istore 7
    //   117: aload_1
    //   118: invokevirtual 137	com/vvt/datadeliverymanager/AppEngine1:e	()Lcom/vvt/datadeliverymanager/enums/PriorityRequest;
    //   121: astore 6
    //   123: aload_1
    //   124: invokevirtual 235	com/vvt/datadeliverymanager/AppEngine1:j	()Lcom/vvt/datadeliverymanager/enums/DataProviderType;
    //   127: astore 8
    //   129: aload_3
    //   130: iload 7
    //   132: aload 6
    //   134: aload 8
    //   136: invokevirtual 238	com/vvt/datadeliverymanager/removeFromPath/a:a	(ILcom/vvt/datadeliverymanager/enums/PriorityRequest;Lcom/vvt/datadeliverymanager/enums/DataProviderType;)Z
    //   139: istore_2
    //   140: iload_2
    //   141: ifeq +73 -> 214
    //   144: getstatic 23	com/vvt/datadeliverymanager/removeFromPath/removeFromPath:a	Z
    //   147: istore_2
    //   148: iload_2
    //   149: ifeq +3 -> 152
    //   152: aload_0
    //   153: getfield 43	com/vvt/datadeliverymanager/removeFromPath/removeFromPath:FxFileObserverWorker	Lcom/vvt/datadeliverymanager/removeFromPath/a;
    //   156: astore_3
    //   157: aload_1
    //   158: invokevirtual 175	com/vvt/datadeliverymanager/AppEngine1:MyUncaughtExceptionHandler	()Lcom/vvt/phoenix/prot/command/removeFromPath;
    //   161: astore 4
    //   163: aload 4
    //   165: invokeinterface 178 1 0
    //   170: istore 7
    //   172: aload_1
    //   173: invokevirtual 137	com/vvt/datadeliverymanager/AppEngine1:e	()Lcom/vvt/datadeliverymanager/enums/PriorityRequest;
    //   176: astore 6
    //   178: aload_1
    //   179: invokevirtual 235	com/vvt/datadeliverymanager/AppEngine1:j	()Lcom/vvt/datadeliverymanager/enums/DataProviderType;
    //   182: astore 8
    //   184: aload_3
    //   185: iload 7
    //   187: aload 6
    //   189: aload 8
    //   191: invokevirtual 240	com/vvt/datadeliverymanager/removeFromPath/a:removeFromPath	(ILcom/vvt/datadeliverymanager/enums/PriorityRequest;Lcom/vvt/datadeliverymanager/enums/DataProviderType;)Z
    //   194: pop
    //   195: getstatic 23	com/vvt/datadeliverymanager/removeFromPath/removeFromPath:a	Z
    //   198: istore_2
    //   199: iload_2
    //   200: ifeq +3 -> 203
    //   203: getstatic 23	com/vvt/datadeliverymanager/removeFromPath/removeFromPath:a	Z
    //   206: istore_2
    //   207: iload_2
    //   208: ifeq +3 -> 211
    //   211: aload_0
    //   212: monitorexit
    //   213: return
    //   214: aload_1
    //   215: invokevirtual 175	com/vvt/datadeliverymanager/AppEngine1:MyUncaughtExceptionHandler	()Lcom/vvt/phoenix/prot/command/removeFromPath;
    //   218: astore_3
    //   219: aload_3
    //   220: invokeinterface 178 1 0
    //   225: istore_2
    //   226: aload_1
    //   227: invokevirtual 137	com/vvt/datadeliverymanager/AppEngine1:e	()Lcom/vvt/datadeliverymanager/enums/PriorityRequest;
    //   230: astore 4
    //   232: aload_1
    //   233: invokevirtual 235	com/vvt/datadeliverymanager/AppEngine1:j	()Lcom/vvt/datadeliverymanager/enums/DataProviderType;
    //   236: astore 6
    //   238: aload_0
    //   239: iload_2
    //   240: aload 4
    //   242: aload 6
    //   244: invokevirtual 241	com/vvt/datadeliverymanager/removeFromPath/removeFromPath:a	(ILcom/vvt/datadeliverymanager/enums/PriorityRequest;Lcom/vvt/datadeliverymanager/enums/DataProviderType;)Z
    //   247: istore_2
    //   248: iload_2
    //   249: ifeq +14 -> 263
    //   252: getstatic 23	com/vvt/datadeliverymanager/removeFromPath/removeFromPath:a	Z
    //   255: istore_2
    //   256: iload_2
    //   257: ifeq -54 -> 203
    //   260: goto -57 -> 203
    //   263: aload_0
    //   264: getfield 41	com/vvt/datadeliverymanager/removeFromPath/removeFromPath:f	Ljava/util/concurrent/BlockingQueue;
    //   267: astore_3
    //   268: aload_3
    //   269: aload_1
    //   270: invokeinterface 244 2 0
    //   275: pop
    //   276: getstatic 26	com/vvt/datadeliverymanager/removeFromPath/removeFromPath:removeFromPath	Z
    //   279: istore_2
    //   280: iload_2
    //   281: ifeq -78 -> 203
    //   284: goto -81 -> 203
    //   287: getstatic 30	com/vvt/datadeliverymanager/removeFromPath/removeFromPath:MyUncaughtExceptionHandler	Z
    //   290: istore_2
    //   291: iload_2
    //   292: ifeq -89 -> 203
    //   295: goto -92 -> 203
    //   298: astore_3
    //   299: aload_0
    //   300: monitorexit
    //   301: aload_3
    //   302: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	303	0	this	removeFromPath
    //   0	303	1	paramh	AppEngine1
    //   9	10	2	bool1	boolean
    //   31	3	2	i	int
    //   37	171	2	bool2	boolean
    //   225	15	2	j	int
    //   247	45	2	bool3	boolean
    //   46	223	3	localObject1	Object
    //   298	4	3	localObject2	Object
    //   51	190	4	localObject3	Object
    //   79	3	5	k	int
    //   86	157	6	localObject4	Object
    //   115	71	7	m	int
    //   127	63	8	localDataProviderType	DataProviderType
    // Exception table:
    //   from	to	target	type
    //   6	9	298	finally
    //   14	17	298	finally
    //   23	27	298	finally
    //   27	31	298	finally
    //   33	37	298	finally
    //   42	46	298	finally
    //   47	51	298	finally
    //   54	59	298	finally
    //   64	68	298	finally
    //   69	73	298	finally
    //   75	79	298	finally
    //   81	86	298	finally
    //   91	97	298	finally
    //   97	101	298	finally
    //   102	106	298	finally
    //   108	115	298	finally
    //   117	121	298	finally
    //   123	127	298	finally
    //   134	139	298	finally
    //   144	147	298	finally
    //   152	156	298	finally
    //   157	161	298	finally
    //   163	170	298	finally
    //   172	176	298	finally
    //   178	182	298	finally
    //   189	195	298	finally
    //   195	198	298	finally
    //   203	206	298	finally
    //   214	218	298	finally
    //   219	225	298	finally
    //   226	230	298	finally
    //   232	236	298	finally
    //   242	247	298	finally
    //   252	255	298	finally
    //   263	267	298	finally
    //   269	276	298	finally
    //   276	279	298	finally
    //   287	290	298	finally
  }
  
  public boolean a(int paramInt)
  {
    return this.g.a(paramInt);
  }
  
  public boolean a(int paramInt, PriorityRequest paramPriorityRequest, DataProviderType paramDataProviderType)
  {
    Object localObject1 = this.f;
    Iterator localIterator = ((Queue)localObject1).iterator();
    int k;
    do
    {
      Object localObject2;
      do
      {
        do
        {
          boolean bool = localIterator.hasNext();
          if (!bool) {
            break;
          }
          localObject1 = (h)localIterator.next();
          localObject2 = ((h)localObject1).c();
          k = ((com.vvt.phoenix.prot.command.b)localObject2).a();
        } while (k != paramInt);
        localObject2 = ((h)localObject1).e();
      } while (localObject2 != paramPriorityRequest);
      localObject1 = ((h)localObject1).j();
      i = ((DataProviderType)localObject1).getNumber();
      k = paramDataProviderType.getNumber();
    } while (i != k);
    int i = 1;
    for (;;)
    {
      return i;
      int j = 0;
      localObject1 = null;
    }
  }
  
  public h b()
  {
    for (;;)
    {
      Object localObject4;
      boolean bool3;
      try
      {
        boolean bool1 = a;
        if (bool1) {}
        Object localObject1 = this.g;
        localObject1 = ((a)localObject1).c();
        if (localObject1 != null)
        {
          boolean bool2 = b;
          if (bool2) {}
          localObject4 = new java/util/ArrayList;
          ((ArrayList)localObject4).<init>();
          List localList = c();
          ((List)localObject4).addAll(localList);
          localObject4 = a((h)localObject1, (List)localObject4);
          if (localObject4 != null) {
            break label257;
          }
          if (localObject1 != null)
          {
            bool2 = a;
            if (bool2) {}
            bool2 = e((h)localObject1);
            if (bool2)
            {
              bool2 = b;
              if (bool2) {}
              localObject4 = DeliveryRequestType.REQUEST_TYPE_PERSISTED;
              ((h)localObject1).a((DeliveryRequestType)localObject4);
              long l = -1;
              ((h)localObject1).a(l);
              f((h)localObject1);
              localObject4 = DeliveryRequestType.REQUEST_TYPE_NEW;
              ((h)localObject1).a((DeliveryRequestType)localObject4);
              bool2 = a;
              if (bool2) {}
              int i = ((h)localObject1).a();
              bool3 = b(i);
              if (!bool3) {
                break label246;
              }
              bool3 = a;
              if (bool3) {}
              d((h)localObject1);
            }
          }
          else
          {
            bool3 = a;
            if (bool3) {}
            return (h)localObject1;
          }
        }
        else
        {
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
          localObject4 = c();
          ((List)localObject1).addAll((Collection)localObject4);
          localObject1 = a((List)localObject1);
          continue;
        }
        bool3 = b;
        if (bool3) {}
        localObject4 = DeliveryRequestType.REQUEST_TYPE_PERSISTED;
        ((h)localObject1).a((DeliveryRequestType)localObject4);
        continue;
        bool3 = a;
      }
      finally {}
      label246:
      if (bool3)
      {
        continue;
        label257:
        Object localObject3 = localObject4;
      }
    }
  }
  
  public boolean b(long paramLong)
  {
    try
    {
      a locala = this.g;
      boolean bool = locala.b(paramLong);
      return bool;
    }
    finally {}
  }
  
  public boolean b(h paramh)
  {
    if (paramh != null) {}
    for (;;)
    {
      try
      {
        locala = this.g;
        bool = locala.a(paramh);
        return bool;
      }
      finally {}
      boolean bool = false;
      a locala = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/datadeliverymanager/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */