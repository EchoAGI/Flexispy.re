package com.vvt.io;

import com.vvt.ak.a;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class j
{
  private static final boolean a = false;
  private static final boolean b = a.b;
  private static j c;
  private HashMap d;
  private HashSet e;
  private HashSet f;
  private HashSet g;
  private HashSet h;
  private HashMap i;
  private g j;
  
  static
  {
    boolean bool = a.a;
    if (bool) {}
  }
  
  private j()
  {
    Object localObject = new com/vvt/io/k;
    ((k)localObject).<init>(this);
    this.j = ((g)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.d = ((HashMap)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.e = ((HashSet)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.f = ((HashSet)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.g = ((HashSet)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.h = ((HashSet)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.i = ((HashMap)localObject);
    c();
  }
  
  public static j a()
  {
    synchronized (j.class)
    {
      j localj = c;
      if (localj == null)
      {
        localj = new com/vvt/io/j;
        localj.<init>();
        c = localj;
      }
      localj = c;
      return localj;
    }
  }
  
  /* Error */
  private void b(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 24	com/vvt/io/j:a	Z
    //   5: istore_2
    //   6: iload_2
    //   7: ifeq +3 -> 10
    //   10: getstatic 24	com/vvt/io/j:a	Z
    //   13: istore_2
    //   14: iload_2
    //   15: ifeq +3 -> 18
    //   18: aload_0
    //   19: aload_1
    //   20: invokespecial 71	com/vvt/io/j:d	(Ljava/lang/String;)Ljava/lang/String;
    //   23: astore_3
    //   24: getstatic 24	com/vvt/io/j:a	Z
    //   27: istore_2
    //   28: iload_2
    //   29: ifeq +3 -> 32
    //   32: aload_3
    //   33: ifnull +193 -> 226
    //   36: aload_0
    //   37: getfield 50	com/vvt/io/j:f	Ljava/util/HashSet;
    //   40: astore 4
    //   42: aload 4
    //   44: aload_1
    //   45: invokevirtual 75	java/util/HashSet:contains	(Ljava/lang/Object;)Z
    //   48: istore_2
    //   49: iload_2
    //   50: ifne +165 -> 215
    //   53: getstatic 27	com/vvt/io/j:removeFromPath	Z
    //   56: istore_2
    //   57: iload_2
    //   58: ifeq +3 -> 61
    //   61: aload_0
    //   62: getfield 56	com/vvt/io/j:i	Ljava/util/HashMap;
    //   65: astore 4
    //   67: aload 4
    //   69: aload_1
    //   70: invokevirtual 79	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   73: astore 4
    //   75: aload 4
    //   77: ifnull +42 -> 119
    //   80: aload_0
    //   81: getfield 56	com/vvt/io/j:i	Ljava/util/HashMap;
    //   84: astore 4
    //   86: aload 4
    //   88: aload_1
    //   89: invokevirtual 79	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   92: astore 4
    //   94: aload 4
    //   96: checkcast 81	com/vvt/io/l
    //   99: astore 4
    //   101: aload 4
    //   103: invokevirtual 84	com/vvt/io/l:stopWatching	()V
    //   106: aload_0
    //   107: getfield 56	com/vvt/io/j:i	Ljava/util/HashMap;
    //   110: astore 4
    //   112: aload 4
    //   114: aload_1
    //   115: invokevirtual 87	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   118: pop
    //   119: getstatic 27	com/vvt/io/j:removeFromPath	Z
    //   122: istore_2
    //   123: iload_2
    //   124: ifeq +3 -> 127
    //   127: ldc2_w 88
    //   130: lstore 5
    //   132: lload 5
    //   134: invokestatic 97	android/os/SystemClock:sleep	(J)V
    //   137: aload_0
    //   138: getfield 43	com/vvt/io/j:d	Ljava/util/HashMap;
    //   141: astore 4
    //   143: aload 4
    //   145: aload_1
    //   146: invokevirtual 79	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   149: astore 4
    //   151: aload 4
    //   153: ifnull +41 -> 194
    //   156: getstatic 27	com/vvt/io/j:removeFromPath	Z
    //   159: istore_2
    //   160: iload_2
    //   161: ifeq +3 -> 164
    //   164: aload_0
    //   165: getfield 43	com/vvt/io/j:d	Ljava/util/HashMap;
    //   168: astore 4
    //   170: aload 4
    //   172: aload_1
    //   173: invokevirtual 79	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   176: astore 4
    //   178: aload 4
    //   180: checkcast 99	com/vvt/io/m
    //   183: astore 4
    //   185: aload 4
    //   187: aload_1
    //   188: aload_3
    //   189: invokeinterface 102 3 0
    //   194: getstatic 24	com/vvt/io/j:a	Z
    //   197: istore_2
    //   198: iload_2
    //   199: ifeq +3 -> 202
    //   202: aload_0
    //   203: getfield 50	com/vvt/io/j:f	Ljava/util/HashSet;
    //   206: astore 4
    //   208: aload 4
    //   210: aload_1
    //   211: invokevirtual 105	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   214: pop
    //   215: getstatic 24	com/vvt/io/j:a	Z
    //   218: istore_2
    //   219: iload_2
    //   220: ifeq +3 -> 223
    //   223: aload_0
    //   224: monitorexit
    //   225: return
    //   226: getstatic 24	com/vvt/io/j:a	Z
    //   229: istore_2
    //   230: iload_2
    //   231: ifeq -16 -> 215
    //   234: goto -19 -> 215
    //   237: astore 4
    //   239: aload_0
    //   240: monitorexit
    //   241: aload 4
    //   243: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	244	0	this	j
    //   0	244	1	paramString	String
    //   5	226	2	bool	boolean
    //   23	166	3	str	String
    //   40	169	4	localObject1	Object
    //   237	5	4	localObject2	Object
    //   130	3	5	l	long
    // Exception table:
    //   from	to	target	type
    //   2	5	237	finally
    //   10	13	237	finally
    //   19	23	237	finally
    //   24	27	237	finally
    //   36	40	237	finally
    //   44	48	237	finally
    //   53	56	237	finally
    //   61	65	237	finally
    //   69	73	237	finally
    //   80	84	237	finally
    //   88	92	237	finally
    //   94	99	237	finally
    //   101	106	237	finally
    //   106	110	237	finally
    //   114	119	237	finally
    //   119	122	237	finally
    //   132	137	237	finally
    //   137	141	237	finally
    //   145	149	237	finally
    //   156	159	237	finally
    //   164	168	237	finally
    //   172	176	237	finally
    //   178	183	237	finally
    //   188	194	237	finally
    //   194	197	237	finally
    //   202	206	237	finally
    //   210	215	237	finally
    //   215	218	237	finally
    //   226	229	237	finally
  }
  
  private void c()
  {
    int k = 4095;
    boolean bool = a;
    if (bool) {}
    Object localObject1 = new java/io/File;
    Object localObject2 = "/dbdata/databases";
    ((File)localObject1).<init>((String)localObject2);
    bool = ((File)localObject1).exists();
    String str;
    g localg;
    if (bool)
    {
      localObject1 = new com/vvt/io/FxFileObserver;
      str = "/dbdata/databases";
      localg = this.j;
      ((FxFileObserver)localObject1).<init>("FxFileObserverCenter", str, localg);
      ((FxFileObserver)localObject1).a(k);
      localObject2 = FxFileObserver.ObservingMode.MODE_MINIMUM_NOTIFY;
      ((FxFileObserver)localObject1).a((FxFileObserver.ObservingMode)localObject2);
      ((FxFileObserver)localObject1).a();
      localObject2 = this.h;
      ((HashSet)localObject2).add(localObject1);
    }
    localObject1 = new java/io/File;
    localObject2 = "/data/data";
    ((File)localObject1).<init>((String)localObject2);
    bool = ((File)localObject1).exists();
    if (bool)
    {
      localObject1 = new com/vvt/io/FxFileObserver;
      str = "/data/data";
      localg = this.j;
      ((FxFileObserver)localObject1).<init>("FxFileObserverCenter", str, localg);
      ((FxFileObserver)localObject1).a(k);
      localObject2 = FxFileObserver.ObservingMode.MODE_MINIMUM_NOTIFY;
      ((FxFileObserver)localObject1).a((FxFileObserver.ObservingMode)localObject2);
      ((FxFileObserver)localObject1).a();
      localObject2 = this.h;
      ((HashSet)localObject2).add(localObject1);
    }
    localObject1 = this.h;
    localObject2 = ((HashSet)localObject1).iterator();
    for (;;)
    {
      bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (FxFileObserver)((Iterator)localObject2).next();
      bool = b;
      if (!bool) {}
    }
    bool = a;
    if (bool) {}
  }
  
  private void c(String paramString)
  {
    boolean bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    String str = e(paramString);
    bool = a;
    if ((!bool) || (str != null))
    {
      Object localObject = this.g;
      bool = ((HashSet)localObject).contains(paramString);
      if (!bool)
      {
        localObject = this.d.get(paramString);
        if (localObject != null)
        {
          bool = b;
          if (bool) {}
          localObject = (m)this.d.get(paramString);
          ((m)localObject).c(paramString, str);
        }
        bool = a;
        if (bool) {}
        localObject = this.g;
        ((HashSet)localObject).add(paramString);
      }
    }
    bool = a;
    if (bool) {}
  }
  
  private String d(String paramString)
  {
    int k = 2;
    int m = 1;
    Object localObject = new Object[k];
    String str1 = "/data/data";
    localObject[0] = str1;
    localObject[m] = paramString;
    String str2 = String.format("%s/%s/databases", (Object[])localObject);
    localObject = new java/io/File;
    ((File)localObject).<init>(str2);
    boolean bool;
    if (localObject != null)
    {
      bool = ((File)localObject).exists();
      if (!bool) {}
    }
    for (;;)
    {
      return str2;
      localObject = new Object[k];
      str1 = "/dbdata/databases";
      localObject[0] = str1;
      localObject[m] = paramString;
      str2 = String.format("%s/%s", (Object[])localObject);
      localObject = new java/io/File;
      ((File)localObject).<init>(str2);
      if (localObject != null)
      {
        bool = ((File)localObject).exists();
        if (bool) {}
      }
      else
      {
        str2 = null;
      }
    }
  }
  
  private void d()
  {
    for (;;)
    {
      Object localObject5;
      try
      {
        bool1 = a;
        if (bool1) {}
        bool1 = a;
        if (bool1) {}
        bool1 = a;
        if (bool1) {}
        bool1 = a;
        if (bool1) {}
        bool1 = a;
        if (bool1) {}
        synchronized (this.d)
        {
          Object localObject1 = this.d;
          localObject1 = ((HashMap)localObject1).entrySet();
          Iterator localIterator = ((Set)localObject1).iterator();
          bool1 = localIterator.hasNext();
          if (!bool1) {
            break;
          }
          localObject1 = localIterator.next();
          localObject1 = (Map.Entry)localObject1;
          localObject5 = ((Map.Entry)localObject1).getKey();
          localObject5 = (String)localObject5;
          localObject1 = ((Map.Entry)localObject1).getValue();
          localObject1 = (m)localObject1;
          bool2 = a;
          if (bool2) {}
          localObject6 = d((String)localObject5);
          String str = f((String)localObject5);
          boolean bool3 = a;
          if ((bool3) && (str == null)) {
            break label313;
          }
          HashSet localHashSet = this.e;
          bool3 = localHashSet.contains(localObject5);
          if (!bool3)
          {
            if (localObject1 != null)
            {
              bool3 = b;
              if (bool3) {}
              ((m)localObject1).a((String)localObject5, str);
            }
            bool1 = a;
            if (bool1) {}
            localObject1 = this.e;
            ((HashSet)localObject1).add(localObject5);
          }
          c((String)localObject5);
          if (localObject6 == null)
          {
            localObject1 = this.i;
            localObject1 = ((HashMap)localObject1).get(localObject5);
            if (localObject1 != null) {
              continue;
            }
            bool1 = b;
            if (bool1) {}
            localObject1 = new com/vvt/io/l;
            ((l)localObject1).<init>(this, (String)localObject5, str);
            ((l)localObject1).startWatching();
            localObject6 = this.i;
            ((HashMap)localObject6).put(localObject5, localObject1);
          }
        }
        b((String)localObject5);
      }
      finally {}
      continue;
      label313:
      boolean bool2 = a;
      if (bool2) {}
      Object localObject6 = this.f;
      bool2 = ((HashSet)localObject6).contains(localObject5);
      if (bool2)
      {
        bool2 = b;
        if (bool2) {}
        localObject6 = this.f;
        ((HashSet)localObject6).remove(localObject5);
      }
      localObject6 = this.g;
      bool2 = ((HashSet)localObject6).contains(localObject5);
      if (bool2)
      {
        bool2 = b;
        if (bool2) {}
        localObject6 = this.g;
        ((HashSet)localObject6).remove(localObject5);
      }
      localObject6 = this.e;
      bool2 = ((HashSet)localObject6).contains(localObject5);
      if (bool2)
      {
        if (localObject3 != null)
        {
          bool2 = b;
          if (bool2) {}
          ((m)localObject3).a((String)localObject5);
        }
        bool1 = a;
        if (bool1) {}
        localObject4 = this.e;
        ((HashSet)localObject4).remove(localObject5);
      }
      Object localObject4 = this.i;
      localObject4 = ((HashMap)localObject4).get(localObject5);
      if (localObject4 != null)
      {
        bool1 = b;
        if (bool1) {}
        localObject4 = this.i;
        localObject4 = ((HashMap)localObject4).get(localObject5);
        localObject4 = (l)localObject4;
        ((l)localObject4).stopWatching();
        localObject4 = this.i;
        ((HashMap)localObject4).remove(localObject5);
      }
      else
      {
        localObject4 = this.i;
        ((HashMap)localObject4).remove(localObject5);
      }
    }
    boolean bool1 = a;
    if (bool1) {}
  }
  
  private String e(String paramString)
  {
    int k = 2;
    Object localObject = new Object[k];
    String str1 = "/data/data";
    localObject[0] = str1;
    boolean bool2 = true;
    localObject[bool2] = paramString;
    String str2 = String.format("%s/%s/files", (Object[])localObject);
    localObject = new java/io/File;
    ((File)localObject).<init>(str2);
    if (localObject != null)
    {
      bool2 = ((File)localObject).exists();
      if (!bool2) {}
    }
    for (;;)
    {
      return str2;
      if (localObject != null)
      {
        boolean bool1 = ((File)localObject).exists();
        if (bool1) {}
      }
      else
      {
        str2 = null;
      }
    }
  }
  
  private String f(String paramString)
  {
    int k = 2;
    int m = 1;
    Object localObject = new Object[k];
    String str1 = "/data/data";
    localObject[0] = str1;
    localObject[m] = paramString;
    String str2 = String.format("%s/%s", (Object[])localObject);
    localObject = new java/io/File;
    ((File)localObject).<init>(str2);
    boolean bool;
    if (localObject != null)
    {
      bool = ((File)localObject).exists();
      if (!bool) {}
    }
    for (;;)
    {
      return str2;
      localObject = new Object[k];
      str1 = "/dbdata/databases";
      localObject[0] = str1;
      localObject[m] = paramString;
      str2 = String.format("%s/%s", (Object[])localObject);
      localObject = new java/io/File;
      ((File)localObject).<init>(str2);
      if (localObject != null)
      {
        bool = ((File)localObject).exists();
        if (bool) {}
      }
      else
      {
        str2 = null;
      }
    }
  }
  
  /* Error */
  public void a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 24	com/vvt/io/j:a	Z
    //   5: istore_2
    //   6: iload_2
    //   7: ifeq +3 -> 10
    //   10: getstatic 27	com/vvt/io/j:removeFromPath	Z
    //   13: istore_2
    //   14: iload_2
    //   15: ifeq +3 -> 18
    //   18: aload_0
    //   19: getfield 43	com/vvt/io/j:d	Ljava/util/HashMap;
    //   22: astore_3
    //   23: aload_3
    //   24: monitorenter
    //   25: aload_0
    //   26: getfield 43	com/vvt/io/j:d	Ljava/util/HashMap;
    //   29: astore 4
    //   31: aload 4
    //   33: aload_1
    //   34: invokevirtual 87	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   37: pop
    //   38: aload_3
    //   39: monitorexit
    //   40: aload_0
    //   41: getfield 48	com/vvt/io/j:e	Ljava/util/HashSet;
    //   44: astore_3
    //   45: aload_3
    //   46: monitorenter
    //   47: aload_0
    //   48: getfield 48	com/vvt/io/j:e	Ljava/util/HashSet;
    //   51: astore 4
    //   53: aload 4
    //   55: aload_1
    //   56: invokevirtual 199	java/util/HashSet:remove	(Ljava/lang/Object;)Z
    //   59: pop
    //   60: aload_3
    //   61: monitorexit
    //   62: aload_0
    //   63: getfield 50	com/vvt/io/j:f	Ljava/util/HashSet;
    //   66: astore_3
    //   67: aload_3
    //   68: monitorenter
    //   69: aload_0
    //   70: getfield 50	com/vvt/io/j:f	Ljava/util/HashSet;
    //   73: astore 4
    //   75: aload 4
    //   77: aload_1
    //   78: invokevirtual 199	java/util/HashSet:remove	(Ljava/lang/Object;)Z
    //   81: pop
    //   82: aload_3
    //   83: monitorexit
    //   84: aload_0
    //   85: getfield 52	com/vvt/io/j:FxFileObserverWorker	Ljava/util/HashSet;
    //   88: astore_3
    //   89: aload_3
    //   90: monitorenter
    //   91: aload_0
    //   92: getfield 52	com/vvt/io/j:FxFileObserverWorker	Ljava/util/HashSet;
    //   95: astore 4
    //   97: aload 4
    //   99: aload_1
    //   100: invokevirtual 199	java/util/HashSet:remove	(Ljava/lang/Object;)Z
    //   103: pop
    //   104: aload_3
    //   105: monitorexit
    //   106: aload_0
    //   107: getfield 56	com/vvt/io/j:i	Ljava/util/HashMap;
    //   110: astore_3
    //   111: aload_3
    //   112: monitorenter
    //   113: aload_0
    //   114: getfield 56	com/vvt/io/j:i	Ljava/util/HashMap;
    //   117: astore 4
    //   119: aload 4
    //   121: aload_1
    //   122: invokevirtual 79	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   125: astore 4
    //   127: aload 4
    //   129: ifnull +42 -> 171
    //   132: aload_0
    //   133: getfield 56	com/vvt/io/j:i	Ljava/util/HashMap;
    //   136: astore 4
    //   138: aload 4
    //   140: aload_1
    //   141: invokevirtual 79	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   144: astore 4
    //   146: aload 4
    //   148: checkcast 81	com/vvt/io/l
    //   151: astore 4
    //   153: aload 4
    //   155: invokevirtual 84	com/vvt/io/l:stopWatching	()V
    //   158: aload_0
    //   159: getfield 56	com/vvt/io/j:i	Ljava/util/HashMap;
    //   162: astore 4
    //   164: aload 4
    //   166: aload_1
    //   167: invokevirtual 87	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   170: pop
    //   171: aload_3
    //   172: monitorexit
    //   173: getstatic 24	com/vvt/io/j:a	Z
    //   176: istore_2
    //   177: iload_2
    //   178: ifeq +3 -> 181
    //   181: aload_0
    //   182: monitorexit
    //   183: return
    //   184: astore 4
    //   186: aload_3
    //   187: monitorexit
    //   188: aload 4
    //   190: athrow
    //   191: astore 4
    //   193: aload_0
    //   194: monitorexit
    //   195: aload 4
    //   197: athrow
    //   198: astore 4
    //   200: aload_3
    //   201: monitorexit
    //   202: aload 4
    //   204: athrow
    //   205: astore 4
    //   207: aload_3
    //   208: monitorexit
    //   209: aload 4
    //   211: athrow
    //   212: astore 4
    //   214: aload_3
    //   215: monitorexit
    //   216: aload 4
    //   218: athrow
    //   219: astore 4
    //   221: aload_3
    //   222: monitorexit
    //   223: aload 4
    //   225: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	226	0	this	j
    //   0	226	1	paramString	String
    //   5	173	2	bool	boolean
    //   29	136	4	localObject2	Object
    //   184	5	4	localObject3	Object
    //   191	5	4	localObject4	Object
    //   198	5	4	localObject5	Object
    //   205	5	4	localObject6	Object
    //   212	5	4	localObject7	Object
    //   219	5	4	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   25	29	184	finally
    //   33	38	184	finally
    //   38	40	184	finally
    //   186	188	184	finally
    //   2	5	191	finally
    //   10	13	191	finally
    //   18	22	191	finally
    //   23	25	191	finally
    //   40	44	191	finally
    //   45	47	191	finally
    //   62	66	191	finally
    //   67	69	191	finally
    //   84	88	191	finally
    //   89	91	191	finally
    //   106	110	191	finally
    //   111	113	191	finally
    //   173	176	191	finally
    //   188	191	191	finally
    //   202	205	191	finally
    //   209	212	191	finally
    //   216	219	191	finally
    //   223	226	191	finally
    //   47	51	198	finally
    //   55	60	198	finally
    //   60	62	198	finally
    //   200	202	198	finally
    //   69	73	205	finally
    //   77	82	205	finally
    //   82	84	205	finally
    //   207	209	205	finally
    //   91	95	212	finally
    //   99	104	212	finally
    //   104	106	212	finally
    //   214	216	212	finally
    //   113	117	219	finally
    //   121	125	219	finally
    //   132	136	219	finally
    //   140	144	219	finally
    //   146	151	219	finally
    //   153	158	219	finally
    //   158	162	219	finally
    //   166	171	219	finally
    //   171	173	219	finally
    //   221	223	219	finally
  }
  
  /* Error */
  public void a(String paramString, m paramm)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 24	com/vvt/io/j:a	Z
    //   5: istore_3
    //   6: iload_3
    //   7: ifeq +3 -> 10
    //   10: aload_0
    //   11: getfield 43	com/vvt/io/j:d	Ljava/util/HashMap;
    //   14: astore 4
    //   16: aload 4
    //   18: monitorenter
    //   19: aload_1
    //   20: ifnull +25 -> 45
    //   23: aload_0
    //   24: getfield 43	com/vvt/io/j:d	Ljava/util/HashMap;
    //   27: astore 5
    //   29: aload 5
    //   31: aload_1
    //   32: aload_2
    //   33: invokevirtual 197	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   36: pop
    //   37: getstatic 27	com/vvt/io/j:removeFromPath	Z
    //   40: istore_3
    //   41: iload_3
    //   42: ifeq +3 -> 45
    //   45: aload 4
    //   47: monitorexit
    //   48: aload_0
    //   49: invokespecial 63	com/vvt/io/j:d	()V
    //   52: getstatic 24	com/vvt/io/j:a	Z
    //   55: istore_3
    //   56: iload_3
    //   57: ifeq +3 -> 60
    //   60: aload_0
    //   61: monitorexit
    //   62: return
    //   63: astore 5
    //   65: aload 4
    //   67: monitorexit
    //   68: aload 5
    //   70: athrow
    //   71: astore 5
    //   73: aload_0
    //   74: monitorexit
    //   75: aload 5
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	j
    //   0	78	1	paramString	String
    //   0	78	2	paramm	m
    //   5	52	3	bool	boolean
    //   14	52	4	localHashMap1	HashMap
    //   27	3	5	localHashMap2	HashMap
    //   63	6	5	localObject1	Object
    //   71	5	5	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   23	27	63	finally
    //   32	37	63	finally
    //   37	40	63	finally
    //   45	48	63	finally
    //   65	68	63	finally
    //   2	5	71	finally
    //   10	14	71	finally
    //   16	19	71	finally
    //   48	52	71	finally
    //   52	55	71	finally
    //   68	71	71	finally
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/io/j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */