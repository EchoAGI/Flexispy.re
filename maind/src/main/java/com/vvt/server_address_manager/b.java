package com.vvt.server_address_manager;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class b
  implements a
{
  private static final boolean c = com.vvt.ak.a.a;
  private static final boolean d = com.vvt.ak.a.b;
  private static final boolean e = com.vvt.ak.a.e;
  private static final String f = com.vvt.base.a.b.a(com.vvt.base.a.a.r);
  private static final String g = com.vvt.base.a.b.a(com.vvt.base.a.a.t);
  private static final String h = com.vvt.base.a.b.a(com.vvt.base.a.a.u);
  private final Lock i;
  private String j;
  private boolean k;
  
  public b(String paramString, boolean paramBoolean)
  {
    ReentrantLock localReentrantLock = new java/util/concurrent/locks/ReentrantLock;
    localReentrantLock.<init>();
    this.i = localReentrantLock;
    this.j = paramString;
    this.k = paramBoolean;
  }
  
  /* Error */
  private ArrayList a(File paramFile)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: new 71	java/util/ArrayList
    //   7: astore 4
    //   9: aload 4
    //   11: invokespecial 72	java/util/ArrayList:<init>	()V
    //   14: aload_1
    //   15: invokevirtual 78	java/io/File:exists	()Z
    //   18: istore 5
    //   20: iload 5
    //   22: ifeq +170 -> 192
    //   25: new 80	java/io/FileInputStream
    //   28: astore 6
    //   30: aload 6
    //   32: aload_1
    //   33: invokespecial 83	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   36: new 85	java/io/BufferedInputStream
    //   39: astore 7
    //   41: aload 7
    //   43: aload 6
    //   45: invokespecial 88	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   48: new 90	java/io/ObjectInputStream
    //   51: astore 8
    //   53: aload 8
    //   55: aload 7
    //   57: invokespecial 91	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   60: aload 8
    //   62: invokeinterface 97 1 0
    //   67: astore_3
    //   68: aload_3
    //   69: instanceof 71
    //   72: istore 9
    //   74: iload 9
    //   76: ifeq +131 -> 207
    //   79: aload_3
    //   80: checkcast 71	java/util/ArrayList
    //   83: astore_3
    //   84: aload_3
    //   85: invokevirtual 101	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   88: astore 10
    //   90: aload 10
    //   92: invokeinterface 106 1 0
    //   97: istore_2
    //   98: iload_2
    //   99: ifeq +108 -> 207
    //   102: aload 10
    //   104: invokeinterface 109 1 0
    //   109: astore_3
    //   110: aload_3
    //   111: instanceof 111
    //   114: istore 11
    //   116: iload 11
    //   118: ifeq -28 -> 90
    //   121: aload_3
    //   122: checkcast 111	com/vvt/server_address_manager/UrlCipherSet
    //   125: astore_3
    //   126: aload 4
    //   128: aload_3
    //   129: invokevirtual 115	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   132: pop
    //   133: goto -43 -> 90
    //   136: astore_3
    //   137: aload 7
    //   139: astore_3
    //   140: aload 6
    //   142: astore 7
    //   144: aload 8
    //   146: astore 6
    //   148: getstatic 33	com/vvt/server_address_manager/removeFromPath:e	Z
    //   151: istore 12
    //   153: iload 12
    //   155: ifeq +3 -> 158
    //   158: aload_3
    //   159: invokestatic 119	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   162: aload 7
    //   164: invokestatic 119	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   167: aload 6
    //   169: invokestatic 122	com/vvt/io/d:a	(Ljava/io/ObjectInput;)V
    //   172: aload 4
    //   174: areturn
    //   175: aload 7
    //   177: invokestatic 119	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   180: aload 6
    //   182: invokestatic 119	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   185: aload 8
    //   187: invokestatic 122	com/vvt/io/d:a	(Ljava/io/ObjectInput;)V
    //   190: aload_3
    //   191: athrow
    //   192: iconst_0
    //   193: istore 5
    //   195: aconst_null
    //   196: astore 7
    //   198: aconst_null
    //   199: astore 6
    //   201: iconst_0
    //   202: istore 12
    //   204: aconst_null
    //   205: astore 8
    //   207: aload 7
    //   209: invokestatic 119	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   212: aload 6
    //   214: invokestatic 119	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   217: aload 8
    //   219: invokestatic 122	com/vvt/io/d:a	(Ljava/io/ObjectInput;)V
    //   222: goto -50 -> 172
    //   225: astore 13
    //   227: aload 6
    //   229: astore 8
    //   231: aload 7
    //   233: astore 6
    //   235: aload_3
    //   236: astore 7
    //   238: aload 13
    //   240: astore_3
    //   241: goto -66 -> 175
    //   244: astore 7
    //   246: iconst_0
    //   247: istore 5
    //   249: aconst_null
    //   250: astore 7
    //   252: aconst_null
    //   253: astore 6
    //   255: goto -107 -> 148
    //   258: astore 7
    //   260: aload 6
    //   262: astore 7
    //   264: aconst_null
    //   265: astore 6
    //   267: goto -119 -> 148
    //   270: astore 8
    //   272: aload 7
    //   274: astore 13
    //   276: aload 6
    //   278: astore 7
    //   280: aconst_null
    //   281: astore 6
    //   283: aload 13
    //   285: astore_3
    //   286: goto -138 -> 148
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	289	0	this	removeFromPath
    //   0	289	1	paramFile	File
    //   1	98	2	bool1	boolean
    //   3	126	3	localObject1	Object
    //   136	1	3	localObject2	Object
    //   139	147	3	localObject3	Object
    //   7	166	4	localArrayList	ArrayList
    //   18	230	5	bool2	boolean
    //   28	254	6	localObject4	Object
    //   39	198	7	localObject5	Object
    //   244	1	7	localObject6	Object
    //   250	1	7	localObject7	Object
    //   258	1	7	localObject8	Object
    //   262	17	7	localObject9	Object
    //   51	179	8	localObject10	Object
    //   270	1	8	localObject11	Object
    //   72	3	9	bool3	boolean
    //   88	15	10	localIterator	Iterator
    //   114	3	11	bool4	boolean
    //   151	52	12	bool5	boolean
    //   225	14	13	localObject12	Object
    //   274	10	13	localObject13	Object
    // Exception table:
    //   from	to	target	type
    //   60	67	136	finally
    //   79	83	136	finally
    //   84	88	136	finally
    //   90	97	136	finally
    //   102	109	136	finally
    //   121	125	136	finally
    //   128	133	136	finally
    //   148	151	225	finally
    //   14	18	244	finally
    //   25	28	244	finally
    //   32	36	244	finally
    //   36	39	258	finally
    //   43	48	258	finally
    //   48	51	270	finally
    //   55	60	270	finally
  }
  
  /* Error */
  private void a(File paramFile, List paramList)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: getstatic 25	com/vvt/server_address_manager/removeFromPath:MyUncaughtExceptionHandler	Z
    //   8: istore 5
    //   10: iload 5
    //   12: ifeq +3 -> 15
    //   15: aload_1
    //   16: invokevirtual 78	java/io/File:exists	()Z
    //   19: istore 5
    //   21: iload 5
    //   23: ifeq +8 -> 31
    //   26: aload_1
    //   27: invokevirtual 125	java/io/File:delete	()Z
    //   30: pop
    //   31: new 127	java/io/FileOutputStream
    //   34: astore 6
    //   36: aload 6
    //   38: aload_1
    //   39: invokespecial 128	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   42: new 130	java/io/BufferedOutputStream
    //   45: astore 7
    //   47: aload 7
    //   49: aload 6
    //   51: invokespecial 133	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   54: new 135	java/io/ObjectOutputStream
    //   57: astore 8
    //   59: aload 8
    //   61: aload 7
    //   63: invokespecial 136	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   66: aload 8
    //   68: aload_2
    //   69: invokeinterface 142 2 0
    //   74: aload 8
    //   76: invokestatic 145	com/vvt/io/d:a	(Ljava/io/ObjectOutput;)V
    //   79: aload 7
    //   81: invokestatic 147	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   84: aload 6
    //   86: invokestatic 147	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   89: getstatic 25	com/vvt/server_address_manager/removeFromPath:MyUncaughtExceptionHandler	Z
    //   92: istore_3
    //   93: iload_3
    //   94: ifeq +3 -> 97
    //   97: return
    //   98: astore 7
    //   100: iconst_0
    //   101: istore 5
    //   103: aconst_null
    //   104: astore 7
    //   106: aconst_null
    //   107: astore 6
    //   109: getstatic 33	com/vvt/server_address_manager/removeFromPath:e	Z
    //   112: istore 9
    //   114: iload 9
    //   116: ifeq +3 -> 119
    //   119: aload 6
    //   121: invokestatic 145	com/vvt/io/d:a	(Ljava/io/ObjectOutput;)V
    //   124: aload 4
    //   126: invokestatic 147	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   129: aload 7
    //   131: invokestatic 147	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   134: goto -45 -> 89
    //   137: astore 7
    //   139: aconst_null
    //   140: astore 6
    //   142: iconst_0
    //   143: istore 9
    //   145: aconst_null
    //   146: astore 8
    //   148: aload 7
    //   150: astore 10
    //   152: iconst_0
    //   153: istore 5
    //   155: aconst_null
    //   156: astore 7
    //   158: aload 10
    //   160: astore 4
    //   162: aload 8
    //   164: invokestatic 145	com/vvt/io/d:a	(Ljava/io/ObjectOutput;)V
    //   167: aload 7
    //   169: invokestatic 147	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   172: aload 6
    //   174: invokestatic 147	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   177: aload 4
    //   179: athrow
    //   180: astore 7
    //   182: iconst_0
    //   183: istore 9
    //   185: aconst_null
    //   186: astore 8
    //   188: aconst_null
    //   189: astore 10
    //   191: aload 7
    //   193: astore 4
    //   195: iconst_0
    //   196: istore 5
    //   198: aconst_null
    //   199: astore 7
    //   201: goto -39 -> 162
    //   204: astore 10
    //   206: iconst_0
    //   207: istore 9
    //   209: aconst_null
    //   210: astore 8
    //   212: aload 10
    //   214: astore 4
    //   216: goto -54 -> 162
    //   219: astore 4
    //   221: goto -59 -> 162
    //   224: astore 10
    //   226: aload 6
    //   228: astore 8
    //   230: aload 7
    //   232: astore 6
    //   234: aload 4
    //   236: astore 7
    //   238: aload 10
    //   240: astore 4
    //   242: goto -80 -> 162
    //   245: astore 7
    //   247: aload 6
    //   249: astore 7
    //   251: aconst_null
    //   252: astore 6
    //   254: goto -145 -> 109
    //   257: astore 8
    //   259: aload 7
    //   261: astore 10
    //   263: aload 6
    //   265: astore 7
    //   267: aconst_null
    //   268: astore 6
    //   270: aload 10
    //   272: astore 4
    //   274: goto -165 -> 109
    //   277: astore 4
    //   279: aload 7
    //   281: astore 4
    //   283: aload 6
    //   285: astore 7
    //   287: aload 8
    //   289: astore 6
    //   291: goto -182 -> 109
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	294	0	this	removeFromPath
    //   0	294	1	paramFile	File
    //   0	294	2	paramList	List
    //   1	93	3	bool1	boolean
    //   3	212	4	localObject1	Object
    //   219	16	4	localObject2	Object
    //   240	33	4	localObject3	Object
    //   277	1	4	localIOException1	java.io.IOException
    //   281	1	4	localObject4	Object
    //   8	189	5	bool2	boolean
    //   34	256	6	localObject5	Object
    //   45	35	7	localBufferedOutputStream	java.io.BufferedOutputStream
    //   98	1	7	localIOException2	java.io.IOException
    //   104	26	7	localOutputStream1	java.io.OutputStream
    //   137	12	7	localObject6	Object
    //   156	12	7	localOutputStream2	java.io.OutputStream
    //   180	12	7	localObject7	Object
    //   199	38	7	localObject8	Object
    //   245	1	7	localIOException3	java.io.IOException
    //   249	37	7	localObject9	Object
    //   57	172	8	localObject10	Object
    //   257	31	8	localIOException4	java.io.IOException
    //   112	96	9	bool3	boolean
    //   150	40	10	localObject11	Object
    //   204	9	10	localObject12	Object
    //   224	15	10	localObject13	Object
    //   261	10	10	localObject14	Object
    // Exception table:
    //   from	to	target	type
    //   15	19	98	java/io/IOException
    //   26	31	98	java/io/IOException
    //   31	34	98	java/io/IOException
    //   38	42	98	java/io/IOException
    //   15	19	137	finally
    //   26	31	137	finally
    //   31	34	137	finally
    //   38	42	137	finally
    //   42	45	180	finally
    //   49	54	180	finally
    //   54	57	204	finally
    //   61	66	204	finally
    //   68	74	219	finally
    //   109	112	224	finally
    //   42	45	245	java/io/IOException
    //   49	54	245	java/io/IOException
    //   54	57	257	java/io/IOException
    //   61	66	257	java/io/IOException
    //   68	74	277	java/io/IOException
  }
  
  private UrlCipherSet c(String paramString)
  {
    UrlCipherSet localUrlCipherSet = new com/vvt/server_address_manager/UrlCipherSet;
    localUrlCipherSet.<init>();
    Object localObject1 = e(paramString);
    Object localObject2 = f(paramString);
    Object localObject3 = d(paramString);
    boolean bool = d;
    if (bool) {}
    bool = d;
    if (bool) {}
    bool = d;
    if (bool) {}
    localObject1 = com.vvt.base.a.b.a(((String)localObject1).getBytes(), false);
    localObject2 = com.vvt.base.a.b.a(((String)localObject2).getBytes(), false);
    localObject3 = com.vvt.base.a.b.a(((String)localObject3).getBytes(), false);
    localUrlCipherSet.structuredServerUrl = ((byte[])localObject1);
    localUrlCipherSet.unstructuredServerUrl = ((byte[])localObject2);
    localUrlCipherSet.baseServerUrl = ((byte[])localObject3);
    return localUrlCipherSet;
  }
  
  private String d(String paramString)
  {
    Object localObject1 = com.vvt.ag.b.a(paramString, "/");
    Object localObject2 = f;
    boolean bool = ((String)localObject1).endsWith((String)localObject2);
    if (bool) {}
    for (;;)
    {
      return (String)localObject1;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = a;
      localObject1 = (String)localObject2;
    }
  }
  
  private String e(String paramString)
  {
    Object localObject1 = com.vvt.ag.b.a(paramString, "/");
    Object localObject2 = f;
    boolean bool = ((String)localObject1).endsWith((String)localObject2);
    if (bool) {}
    for (;;)
    {
      return (String)localObject1;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = a;
      localObject1 = (String)localObject2;
    }
  }
  
  private String f(String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = e(paramString);
    localStringBuilder = localStringBuilder.append(str);
    str = b;
    return str;
  }
  
  private UrlCipherSet g()
  {
    UrlCipherSet localUrlCipherSet = null;
    boolean bool1 = c;
    if (bool1) {}
    bool1 = c;
    if (bool1) {}
    Object localObject = g;
    localObject = h((String)localObject);
    boolean bool2 = ((File)localObject).exists();
    boolean bool3 = c;
    if ((!bool3) || (bool2)) {}
    for (localObject = a((File)localObject);; localObject = null)
    {
      if (localObject != null)
      {
        bool2 = ((ArrayList)localObject).isEmpty();
        if (!bool2) {}
      }
      else
      {
        localObject = h;
        localObject = h((String)localObject);
        localObject = a((File)localObject);
      }
      if (localObject != null)
      {
        bool2 = ((ArrayList)localObject).isEmpty();
        if (!bool2) {
          break label111;
        }
      }
      for (;;)
      {
        bool1 = c;
        if (bool1) {}
        return localUrlCipherSet;
        label111:
        localUrlCipherSet = (UrlCipherSet)((ArrayList)localObject).get(0);
      }
      bool1 = false;
    }
  }
  
  private String g(String paramString)
  {
    String str1 = com.vvt.ag.b.a(paramString, "/");
    String str2 = f;
    boolean bool = str1.endsWith(str2);
    if (bool)
    {
      str2 = f;
      String str3 = "";
      str1 = str1.replace(str2, str3);
    }
    return com.vvt.ag.b.a(str1, "/");
  }
  
  private File h(String paramString)
  {
    File localFile = new java/io/File;
    String str = this.j;
    localFile.<init>(str, paramString);
    return localFile;
  }
  
  /* Error */
  public String a()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: getfield 65	com/vvt/server_address_manager/removeFromPath:i	Ljava/util/concurrent/locks/Lock;
    //   6: astore_2
    //   7: aload_2
    //   8: invokeinterface 228 1 0
    //   13: aload_0
    //   14: invokespecial 231	com/vvt/server_address_manager/removeFromPath:FxFileObserverWorker	()Lcom/vvt/server_address_manager/UrlCipherSet;
    //   17: astore_3
    //   18: aload_3
    //   19: ifnonnull +16 -> 35
    //   22: aload_0
    //   23: getfield 65	com/vvt/server_address_manager/removeFromPath:i	Ljava/util/concurrent/locks/Lock;
    //   26: astore_2
    //   27: aload_2
    //   28: invokeinterface 234 1 0
    //   33: aload_1
    //   34: areturn
    //   35: new 159	java/lang/String
    //   38: astore_2
    //   39: aload_3
    //   40: getfield 169	com/vvt/server_address_manager/UrlCipherSet:structuredServerUrl	[B
    //   43: astore_3
    //   44: aload_3
    //   45: iconst_0
    //   46: invokestatic 236	com/vvt/base/a/removeFromPath:removeFromPath	([BZ)[B
    //   49: astore_3
    //   50: aload_2
    //   51: aload_3
    //   52: invokespecial 239	java/lang/String:<init>	([B)V
    //   55: aload_2
    //   56: astore_1
    //   57: goto -35 -> 22
    //   60: astore_2
    //   61: getstatic 33	com/vvt/server_address_manager/removeFromPath:e	Z
    //   64: istore 4
    //   66: iload 4
    //   68: ifeq +3 -> 71
    //   71: aload_0
    //   72: getfield 65	com/vvt/server_address_manager/removeFromPath:i	Ljava/util/concurrent/locks/Lock;
    //   75: astore_2
    //   76: goto -49 -> 27
    //   79: astore_1
    //   80: aload_0
    //   81: getfield 65	com/vvt/server_address_manager/removeFromPath:i	Ljava/util/concurrent/locks/Lock;
    //   84: invokeinterface 234 1 0
    //   89: aload_1
    //   90: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	this	removeFromPath
    //   1	56	1	localObject1	Object
    //   79	11	1	localObject2	Object
    //   6	50	2	localObject3	Object
    //   60	1	2	localObject4	Object
    //   75	1	2	localLock	Lock
    //   17	35	3	localObject5	Object
    //   64	3	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   13	17	60	finally
    //   35	38	60	finally
    //   39	43	60	finally
    //   45	49	60	finally
    //   51	55	60	finally
    //   61	64	79	finally
  }
  
  /* Error */
  public void a(String paramString)
  {
    // Byte code:
    //   0: getstatic 25	com/vvt/server_address_manager/removeFromPath:MyUncaughtExceptionHandler	Z
    //   3: istore_2
    //   4: iload_2
    //   5: ifeq +3 -> 8
    //   8: getstatic 25	com/vvt/server_address_manager/removeFromPath:MyUncaughtExceptionHandler	Z
    //   11: istore_2
    //   12: iload_2
    //   13: ifeq +3 -> 16
    //   16: aload_0
    //   17: getfield 65	com/vvt/server_address_manager/removeFromPath:i	Ljava/util/concurrent/locks/Lock;
    //   20: astore_3
    //   21: aload_3
    //   22: invokeinterface 228 1 0
    //   27: getstatic 30	com/vvt/server_address_manager/removeFromPath:d	Z
    //   30: istore_2
    //   31: iload_2
    //   32: ifeq +3 -> 35
    //   35: aload_0
    //   36: aload_1
    //   37: invokespecial 242	com/vvt/server_address_manager/removeFromPath:MyUncaughtExceptionHandler	(Ljava/lang/String;)Lcom/vvt/server_address_manager/UrlCipherSet;
    //   40: astore_3
    //   41: getstatic 30	com/vvt/server_address_manager/removeFromPath:d	Z
    //   44: istore 4
    //   46: iload 4
    //   48: ifeq +3 -> 51
    //   51: getstatic 51	com/vvt/server_address_manager/removeFromPath:FxFileObserverWorker	Ljava/lang/String;
    //   54: astore 5
    //   56: aload_0
    //   57: aload 5
    //   59: invokespecial 204	com/vvt/server_address_manager/removeFromPath:AppEngine1	(Ljava/lang/String;)Ljava/io/File;
    //   62: astore 5
    //   64: aload_0
    //   65: aload 5
    //   67: invokespecial 207	com/vvt/server_address_manager/removeFromPath:a	(Ljava/io/File;)Ljava/util/ArrayList;
    //   70: astore 6
    //   72: getstatic 30	com/vvt/server_address_manager/removeFromPath:d	Z
    //   75: istore 7
    //   77: iload 7
    //   79: ifeq +3 -> 82
    //   82: iconst_0
    //   83: istore 7
    //   85: aload 6
    //   87: iconst_0
    //   88: aload_3
    //   89: invokeinterface 247 3 0
    //   94: getstatic 30	com/vvt/server_address_manager/removeFromPath:d	Z
    //   97: istore_2
    //   98: iload_2
    //   99: ifeq +3 -> 102
    //   102: aload_0
    //   103: aload 5
    //   105: aload 6
    //   107: invokespecial 250	com/vvt/server_address_manager/removeFromPath:a	(Ljava/io/File;Ljava/util/List;)V
    //   110: aload_0
    //   111: getfield 65	com/vvt/server_address_manager/removeFromPath:i	Ljava/util/concurrent/locks/Lock;
    //   114: astore_3
    //   115: aload_3
    //   116: invokeinterface 234 1 0
    //   121: getstatic 25	com/vvt/server_address_manager/removeFromPath:MyUncaughtExceptionHandler	Z
    //   124: istore_2
    //   125: iload_2
    //   126: ifeq +3 -> 129
    //   129: return
    //   130: astore_3
    //   131: getstatic 33	com/vvt/server_address_manager/removeFromPath:e	Z
    //   134: istore_2
    //   135: iload_2
    //   136: ifeq +3 -> 139
    //   139: aload_0
    //   140: getfield 65	com/vvt/server_address_manager/removeFromPath:i	Ljava/util/concurrent/locks/Lock;
    //   143: astore_3
    //   144: goto -29 -> 115
    //   147: astore_3
    //   148: aload_0
    //   149: getfield 65	com/vvt/server_address_manager/removeFromPath:i	Ljava/util/concurrent/locks/Lock;
    //   152: invokeinterface 234 1 0
    //   157: aload_3
    //   158: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	159	0	this	removeFromPath
    //   0	159	1	paramString	String
    //   3	133	2	bool1	boolean
    //   20	96	3	localObject1	Object
    //   130	1	3	localObject2	Object
    //   143	1	3	localLock	Lock
    //   147	11	3	localObject3	Object
    //   44	3	4	bool2	boolean
    //   54	50	5	localObject4	Object
    //   70	36	6	localArrayList	ArrayList
    //   75	9	7	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   27	30	130	finally
    //   36	40	130	finally
    //   41	44	130	finally
    //   51	54	130	finally
    //   57	62	130	finally
    //   65	70	130	finally
    //   72	75	130	finally
    //   88	94	130	finally
    //   94	97	130	finally
    //   105	110	130	finally
    //   131	134	147	finally
  }
  
  /* Error */
  public String b()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: getfield 65	com/vvt/server_address_manager/removeFromPath:i	Ljava/util/concurrent/locks/Lock;
    //   6: astore_2
    //   7: aload_2
    //   8: invokeinterface 228 1 0
    //   13: aload_0
    //   14: invokespecial 231	com/vvt/server_address_manager/removeFromPath:FxFileObserverWorker	()Lcom/vvt/server_address_manager/UrlCipherSet;
    //   17: astore_3
    //   18: aload_3
    //   19: ifnonnull +16 -> 35
    //   22: aload_0
    //   23: getfield 65	com/vvt/server_address_manager/removeFromPath:i	Ljava/util/concurrent/locks/Lock;
    //   26: astore_2
    //   27: aload_2
    //   28: invokeinterface 234 1 0
    //   33: aload_1
    //   34: areturn
    //   35: new 159	java/lang/String
    //   38: astore_2
    //   39: aload_3
    //   40: getfield 172	com/vvt/server_address_manager/UrlCipherSet:unstructuredServerUrl	[B
    //   43: astore_3
    //   44: aload_3
    //   45: iconst_0
    //   46: invokestatic 236	com/vvt/base/a/removeFromPath:removeFromPath	([BZ)[B
    //   49: astore_3
    //   50: aload_2
    //   51: aload_3
    //   52: invokespecial 239	java/lang/String:<init>	([B)V
    //   55: aload_2
    //   56: astore_1
    //   57: goto -35 -> 22
    //   60: astore_2
    //   61: getstatic 33	com/vvt/server_address_manager/removeFromPath:e	Z
    //   64: istore 4
    //   66: iload 4
    //   68: ifeq +3 -> 71
    //   71: aload_0
    //   72: getfield 65	com/vvt/server_address_manager/removeFromPath:i	Ljava/util/concurrent/locks/Lock;
    //   75: astore_2
    //   76: goto -49 -> 27
    //   79: astore_1
    //   80: aload_0
    //   81: getfield 65	com/vvt/server_address_manager/removeFromPath:i	Ljava/util/concurrent/locks/Lock;
    //   84: invokeinterface 234 1 0
    //   89: aload_1
    //   90: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	this	removeFromPath
    //   1	56	1	localObject1	Object
    //   79	11	1	localObject2	Object
    //   6	50	2	localObject3	Object
    //   60	1	2	localObject4	Object
    //   75	1	2	localLock	Lock
    //   17	35	3	localObject5	Object
    //   64	3	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   13	17	60	finally
    //   35	38	60	finally
    //   39	43	60	finally
    //   45	49	60	finally
    //   51	55	60	finally
    //   61	64	79	finally
  }
  
  /* Error */
  public void b(String paramString)
  {
    // Byte code:
    //   0: getstatic 25	com/vvt/server_address_manager/removeFromPath:MyUncaughtExceptionHandler	Z
    //   3: istore_2
    //   4: iload_2
    //   5: ifeq +3 -> 8
    //   8: getstatic 25	com/vvt/server_address_manager/removeFromPath:MyUncaughtExceptionHandler	Z
    //   11: istore_2
    //   12: iload_2
    //   13: ifeq +3 -> 16
    //   16: aload_0
    //   17: getfield 65	com/vvt/server_address_manager/removeFromPath:i	Ljava/util/concurrent/locks/Lock;
    //   20: astore_3
    //   21: aload_3
    //   22: invokeinterface 228 1 0
    //   27: getstatic 56	com/vvt/server_address_manager/removeFromPath:AppEngine1	Ljava/lang/String;
    //   30: astore_3
    //   31: aload_0
    //   32: aload_3
    //   33: invokespecial 204	com/vvt/server_address_manager/removeFromPath:AppEngine1	(Ljava/lang/String;)Ljava/io/File;
    //   36: astore 4
    //   38: aload 4
    //   40: invokevirtual 78	java/io/File:exists	()Z
    //   43: istore_2
    //   44: getstatic 30	com/vvt/server_address_manager/removeFromPath:d	Z
    //   47: istore 5
    //   49: iload 5
    //   51: ifeq +3 -> 54
    //   54: iload_2
    //   55: ifeq +21 -> 76
    //   58: getstatic 30	com/vvt/server_address_manager/removeFromPath:d	Z
    //   61: istore_2
    //   62: iload_2
    //   63: ifeq +3 -> 66
    //   66: aload 4
    //   68: invokevirtual 125	java/io/File:delete	()Z
    //   71: pop
    //   72: iconst_0
    //   73: istore_2
    //   74: aconst_null
    //   75: astore_3
    //   76: iload_2
    //   77: ifne +69 -> 146
    //   80: getstatic 30	com/vvt/server_address_manager/removeFromPath:d	Z
    //   83: istore_2
    //   84: iload_2
    //   85: ifeq +3 -> 88
    //   88: aload_0
    //   89: aload_1
    //   90: invokespecial 242	com/vvt/server_address_manager/removeFromPath:MyUncaughtExceptionHandler	(Ljava/lang/String;)Lcom/vvt/server_address_manager/UrlCipherSet;
    //   93: astore_3
    //   94: getstatic 30	com/vvt/server_address_manager/removeFromPath:d	Z
    //   97: istore 6
    //   99: iload 6
    //   101: ifeq +3 -> 104
    //   104: new 71	java/util/ArrayList
    //   107: astore 4
    //   109: aload 4
    //   111: invokespecial 72	java/util/ArrayList:<init>	()V
    //   114: aload 4
    //   116: aload_3
    //   117: invokevirtual 115	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   120: pop
    //   121: getstatic 30	com/vvt/server_address_manager/removeFromPath:d	Z
    //   124: istore_2
    //   125: iload_2
    //   126: ifeq +3 -> 129
    //   129: getstatic 56	com/vvt/server_address_manager/removeFromPath:AppEngine1	Ljava/lang/String;
    //   132: astore_3
    //   133: aload_0
    //   134: aload_3
    //   135: invokespecial 204	com/vvt/server_address_manager/removeFromPath:AppEngine1	(Ljava/lang/String;)Ljava/io/File;
    //   138: astore_3
    //   139: aload_0
    //   140: aload_3
    //   141: aload 4
    //   143: invokespecial 250	com/vvt/server_address_manager/removeFromPath:a	(Ljava/io/File;Ljava/util/List;)V
    //   146: aload_0
    //   147: getfield 65	com/vvt/server_address_manager/removeFromPath:i	Ljava/util/concurrent/locks/Lock;
    //   150: astore_3
    //   151: aload_3
    //   152: invokeinterface 234 1 0
    //   157: getstatic 25	com/vvt/server_address_manager/removeFromPath:MyUncaughtExceptionHandler	Z
    //   160: istore_2
    //   161: iload_2
    //   162: ifeq +3 -> 165
    //   165: return
    //   166: astore_3
    //   167: getstatic 33	com/vvt/server_address_manager/removeFromPath:e	Z
    //   170: istore_2
    //   171: iload_2
    //   172: ifeq +3 -> 175
    //   175: aload_0
    //   176: getfield 65	com/vvt/server_address_manager/removeFromPath:i	Ljava/util/concurrent/locks/Lock;
    //   179: astore_3
    //   180: goto -29 -> 151
    //   183: astore_3
    //   184: aload_0
    //   185: getfield 65	com/vvt/server_address_manager/removeFromPath:i	Ljava/util/concurrent/locks/Lock;
    //   188: invokeinterface 234 1 0
    //   193: aload_3
    //   194: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	195	0	this	removeFromPath
    //   0	195	1	paramString	String
    //   3	169	2	bool1	boolean
    //   20	132	3	localObject1	Object
    //   166	1	3	localObject2	Object
    //   179	1	3	localLock	Lock
    //   183	11	3	localObject3	Object
    //   36	106	4	localObject4	Object
    //   47	3	5	bool2	boolean
    //   97	3	6	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   27	30	166	finally
    //   32	36	166	finally
    //   38	43	166	finally
    //   44	47	166	finally
    //   58	61	166	finally
    //   66	72	166	finally
    //   80	83	166	finally
    //   89	93	166	finally
    //   94	97	166	finally
    //   104	107	166	finally
    //   109	114	166	finally
    //   116	121	166	finally
    //   121	124	166	finally
    //   129	132	166	finally
    //   134	138	166	finally
    //   141	146	166	finally
    //   167	170	183	finally
  }
  
  /* Error */
  public String c()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: getfield 69	com/vvt/server_address_manager/removeFromPath:k	Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifne +8 -> 16
    //   11: ldc -40
    //   13: astore_1
    //   14: aload_1
    //   15: areturn
    //   16: aload_0
    //   17: getfield 65	com/vvt/server_address_manager/removeFromPath:i	Ljava/util/concurrent/locks/Lock;
    //   20: astore_3
    //   21: aload_3
    //   22: invokeinterface 228 1 0
    //   27: aload_0
    //   28: invokespecial 231	com/vvt/server_address_manager/removeFromPath:FxFileObserverWorker	()Lcom/vvt/server_address_manager/UrlCipherSet;
    //   31: astore 4
    //   33: aload 4
    //   35: ifnonnull +17 -> 52
    //   38: aload_0
    //   39: getfield 65	com/vvt/server_address_manager/removeFromPath:i	Ljava/util/concurrent/locks/Lock;
    //   42: astore_3
    //   43: aload_3
    //   44: invokeinterface 234 1 0
    //   49: goto -35 -> 14
    //   52: new 159	java/lang/String
    //   55: astore_3
    //   56: aload 4
    //   58: getfield 175	com/vvt/server_address_manager/UrlCipherSet:baseServerUrl	[B
    //   61: astore 4
    //   63: aload 4
    //   65: iconst_0
    //   66: invokestatic 236	com/vvt/base/a/removeFromPath:removeFromPath	([BZ)[B
    //   69: astore 4
    //   71: aload_3
    //   72: aload 4
    //   74: invokespecial 239	java/lang/String:<init>	([B)V
    //   77: aload_3
    //   78: astore_1
    //   79: goto -41 -> 38
    //   82: astore_3
    //   83: getstatic 33	com/vvt/server_address_manager/removeFromPath:e	Z
    //   86: istore_2
    //   87: iload_2
    //   88: ifeq +3 -> 91
    //   91: aload_0
    //   92: getfield 65	com/vvt/server_address_manager/removeFromPath:i	Ljava/util/concurrent/locks/Lock;
    //   95: astore_3
    //   96: goto -53 -> 43
    //   99: astore_1
    //   100: aload_0
    //   101: getfield 65	com/vvt/server_address_manager/removeFromPath:i	Ljava/util/concurrent/locks/Lock;
    //   104: invokeinterface 234 1 0
    //   109: aload_1
    //   110: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	111	0	this	removeFromPath
    //   1	78	1	localObject1	Object
    //   99	11	1	localObject2	Object
    //   6	82	2	bool	boolean
    //   20	58	3	localObject3	Object
    //   82	1	3	localObject4	Object
    //   95	1	3	localLock	Lock
    //   31	42	4	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   27	31	82	finally
    //   52	55	82	finally
    //   56	61	82	finally
    //   65	69	82	finally
    //   72	77	82	finally
    //   83	86	99	finally
  }
  
  public void d()
  {
    boolean bool1 = c;
    if (bool1) {}
    Object localObject = g;
    localObject = h((String)localObject);
    boolean bool2 = ((File)localObject).exists();
    if (bool2) {
      ((File)localObject).delete();
    }
    bool1 = c;
    if (bool1) {}
  }
  
  public List e()
  {
    boolean bool1 = c;
    if (bool1) {}
    Object localObject = g;
    localObject = h((String)localObject);
    localObject = a((File)localObject);
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (UrlCipherSet)localIterator.next();
      String str = new java/lang/String;
      localObject = com.vvt.base.a.b.b(((UrlCipherSet)localObject).structuredServerUrl, false);
      str.<init>((byte[])localObject);
      bool1 = c;
      if (bool1) {}
      localObject = g(str);
      boolean bool2 = c;
      if (bool2) {}
      localArrayList.add(localObject);
    }
    bool1 = c;
    if (bool1) {}
    return localArrayList;
  }
  
  public int f()
  {
    return 1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/server_address_manager/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */