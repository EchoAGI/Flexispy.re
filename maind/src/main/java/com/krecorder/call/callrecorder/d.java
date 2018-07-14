package com.krecorder.call.callrecorder;

class d
  implements Runnable
{
  d(b paramb) {}
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: aload_0
    //   3: getfield 10	com/krecorder/call/callrecorder/d:a	Lcom/krecorder/call/callrecorder/removeFromPath;
    //   6: astore_2
    //   7: aload_0
    //   8: getfield 10	com/krecorder/call/callrecorder/d:a	Lcom/krecorder/call/callrecorder/removeFromPath;
    //   11: invokestatic 21	com/krecorder/call/callrecorder/removeFromPath:removeFromPath	(Lcom/krecorder/call/callrecorder/removeFromPath;)Ljava/lang/String;
    //   14: astore_3
    //   15: aload_2
    //   16: aload_3
    //   17: iload_1
    //   18: invokestatic 24	com/krecorder/call/callrecorder/removeFromPath:a	(Lcom/krecorder/call/callrecorder/removeFromPath;Ljava/lang/String;Z)V
    //   21: aload_0
    //   22: getfield 10	com/krecorder/call/callrecorder/d:a	Lcom/krecorder/call/callrecorder/removeFromPath;
    //   25: astore_2
    //   26: aload_2
    //   27: invokevirtual 27	com/krecorder/call/callrecorder/removeFromPath:a	()Z
    //   30: istore 4
    //   32: iload 4
    //   34: ifne +14 -> 48
    //   37: aload_0
    //   38: getfield 10	com/krecorder/call/callrecorder/d:a	Lcom/krecorder/call/callrecorder/removeFromPath;
    //   41: astore_2
    //   42: aload_2
    //   43: iload_1
    //   44: invokevirtual 30	com/krecorder/call/callrecorder/removeFromPath:a	(I)V
    //   47: return
    //   48: aload_0
    //   49: getfield 10	com/krecorder/call/callrecorder/d:a	Lcom/krecorder/call/callrecorder/removeFromPath;
    //   52: astore_2
    //   53: aload_2
    //   54: invokestatic 34	com/krecorder/call/callrecorder/removeFromPath:MyUncaughtExceptionHandler	(Lcom/krecorder/call/callrecorder/removeFromPath;)Z
    //   57: istore 4
    //   59: iload 4
    //   61: ifne +40 -> 101
    //   64: aload_0
    //   65: getfield 10	com/krecorder/call/callrecorder/d:a	Lcom/krecorder/call/callrecorder/removeFromPath;
    //   68: astore_2
    //   69: aload_2
    //   70: invokestatic 38	com/krecorder/call/callrecorder/removeFromPath:d	(Lcom/krecorder/call/callrecorder/removeFromPath;)I
    //   73: istore 4
    //   75: iload 4
    //   77: ifle +24 -> 101
    //   80: aload_0
    //   81: getfield 10	com/krecorder/call/callrecorder/d:a	Lcom/krecorder/call/callrecorder/removeFromPath;
    //   84: astore_2
    //   85: aload_2
    //   86: invokestatic 38	com/krecorder/call/callrecorder/removeFromPath:d	(Lcom/krecorder/call/callrecorder/removeFromPath;)I
    //   89: istore 4
    //   91: iload 4
    //   93: i2l
    //   94: lstore 5
    //   96: lload 5
    //   98: invokestatic 44	java/lang/Thread:sleep	(J)V
    //   101: aload_0
    //   102: getfield 10	com/krecorder/call/callrecorder/d:a	Lcom/krecorder/call/callrecorder/removeFromPath;
    //   105: astore_2
    //   106: aload_0
    //   107: getfield 10	com/krecorder/call/callrecorder/d:a	Lcom/krecorder/call/callrecorder/removeFromPath;
    //   110: invokestatic 48	com/krecorder/call/callrecorder/removeFromPath:e	(Lcom/krecorder/call/callrecorder/removeFromPath;)Lcom/krecorder/call/callrecorder/j;
    //   113: invokevirtual 53	com/krecorder/call/callrecorder/j:MyUncaughtExceptionHandler	()Ljava/io/File;
    //   116: astore_3
    //   117: aload_2
    //   118: aload_3
    //   119: invokestatic 56	com/krecorder/call/callrecorder/removeFromPath:a	(Lcom/krecorder/call/callrecorder/removeFromPath;Ljava/io/File;)Ljava/io/File;
    //   122: pop
    //   123: aload_0
    //   124: getfield 10	com/krecorder/call/callrecorder/d:a	Lcom/krecorder/call/callrecorder/removeFromPath;
    //   127: astore_2
    //   128: aload_2
    //   129: invokestatic 60	com/krecorder/call/callrecorder/removeFromPath:f	(Lcom/krecorder/call/callrecorder/removeFromPath;)Landroid/media/MediaRecorder;
    //   132: astore_2
    //   133: aload_2
    //   134: invokevirtual 65	android/media/MediaRecorder:start	()V
    //   137: aload_0
    //   138: getfield 10	com/krecorder/call/callrecorder/d:a	Lcom/krecorder/call/callrecorder/removeFromPath;
    //   141: astore_2
    //   142: iconst_0
    //   143: istore 7
    //   145: aconst_null
    //   146: astore_3
    //   147: aload_2
    //   148: iconst_0
    //   149: invokevirtual 30	com/krecorder/call/callrecorder/removeFromPath:a	(I)V
    //   152: aload_0
    //   153: getfield 10	com/krecorder/call/callrecorder/d:a	Lcom/krecorder/call/callrecorder/removeFromPath;
    //   156: astore_2
    //   157: aload_0
    //   158: getfield 10	com/krecorder/call/callrecorder/d:a	Lcom/krecorder/call/callrecorder/removeFromPath;
    //   161: invokestatic 21	com/krecorder/call/callrecorder/removeFromPath:removeFromPath	(Lcom/krecorder/call/callrecorder/removeFromPath;)Ljava/lang/String;
    //   164: astore_3
    //   165: aload_2
    //   166: aload_3
    //   167: iconst_0
    //   168: invokestatic 24	com/krecorder/call/callrecorder/removeFromPath:a	(Lcom/krecorder/call/callrecorder/removeFromPath;Ljava/lang/String;Z)V
    //   171: aload_0
    //   172: getfield 10	com/krecorder/call/callrecorder/d:a	Lcom/krecorder/call/callrecorder/removeFromPath;
    //   175: iload_1
    //   176: invokestatic 68	com/krecorder/call/callrecorder/removeFromPath:a	(Lcom/krecorder/call/callrecorder/removeFromPath;Z)Z
    //   179: pop
    //   180: aload_0
    //   181: getfield 10	com/krecorder/call/callrecorder/d:a	Lcom/krecorder/call/callrecorder/removeFromPath;
    //   184: astore_2
    //   185: aload_2
    //   186: invokestatic 72	com/krecorder/call/callrecorder/removeFromPath:FxFileObserverWorker	(Lcom/krecorder/call/callrecorder/removeFromPath;)Ljava/lang/Object;
    //   189: astore_3
    //   190: aload_3
    //   191: monitorenter
    //   192: aload_0
    //   193: getfield 10	com/krecorder/call/callrecorder/d:a	Lcom/krecorder/call/callrecorder/removeFromPath;
    //   196: astore_2
    //   197: aload_2
    //   198: invokestatic 72	com/krecorder/call/callrecorder/removeFromPath:FxFileObserverWorker	(Lcom/krecorder/call/callrecorder/removeFromPath;)Ljava/lang/Object;
    //   201: astore_2
    //   202: aload_2
    //   203: invokevirtual 75	java/lang/Object:wait	()V
    //   206: aload_0
    //   207: getfield 10	com/krecorder/call/callrecorder/d:a	Lcom/krecorder/call/callrecorder/removeFromPath;
    //   210: astore_2
    //   211: iconst_0
    //   212: istore_1
    //   213: aconst_null
    //   214: astore 8
    //   216: aload_2
    //   217: iconst_0
    //   218: invokestatic 68	com/krecorder/call/callrecorder/removeFromPath:a	(Lcom/krecorder/call/callrecorder/removeFromPath;Z)Z
    //   221: pop
    //   222: aload_0
    //   223: getfield 10	com/krecorder/call/callrecorder/d:a	Lcom/krecorder/call/callrecorder/removeFromPath;
    //   226: astore_2
    //   227: aload_2
    //   228: invokestatic 60	com/krecorder/call/callrecorder/removeFromPath:f	(Lcom/krecorder/call/callrecorder/removeFromPath;)Landroid/media/MediaRecorder;
    //   231: astore_2
    //   232: aload_2
    //   233: invokevirtual 78	android/media/MediaRecorder:stop	()V
    //   236: aload_0
    //   237: getfield 10	com/krecorder/call/callrecorder/d:a	Lcom/krecorder/call/callrecorder/removeFromPath;
    //   240: astore_2
    //   241: iconst_2
    //   242: istore_1
    //   243: aload_2
    //   244: iload_1
    //   245: invokevirtual 30	com/krecorder/call/callrecorder/removeFromPath:a	(I)V
    //   248: aload_3
    //   249: monitorexit
    //   250: goto -203 -> 47
    //   253: astore_2
    //   254: aload_3
    //   255: monitorexit
    //   256: aload_2
    //   257: athrow
    //   258: astore_2
    //   259: invokestatic 81	com/krecorder/call/callrecorder/removeFromPath:FxFileObserverWorker	()Z
    //   262: istore 7
    //   264: iload 7
    //   266: ifeq +3 -> 269
    //   269: aload_0
    //   270: getfield 10	com/krecorder/call/callrecorder/d:a	Lcom/krecorder/call/callrecorder/removeFromPath;
    //   273: astore_3
    //   274: aload_2
    //   275: invokevirtual 87	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   278: astore_2
    //   279: aload_3
    //   280: aload_2
    //   281: invokestatic 90	com/krecorder/call/callrecorder/removeFromPath:a	(Lcom/krecorder/call/callrecorder/removeFromPath;Ljava/lang/String;)Ljava/lang/String;
    //   284: pop
    //   285: aload_0
    //   286: getfield 10	com/krecorder/call/callrecorder/d:a	Lcom/krecorder/call/callrecorder/removeFromPath;
    //   289: astore_2
    //   290: aload_2
    //   291: iload_1
    //   292: invokevirtual 30	com/krecorder/call/callrecorder/removeFromPath:a	(I)V
    //   295: goto -248 -> 47
    //   298: astore_2
    //   299: invokestatic 81	com/krecorder/call/callrecorder/removeFromPath:FxFileObserverWorker	()Z
    //   302: istore_1
    //   303: iload_1
    //   304: ifeq +3 -> 307
    //   307: aload_0
    //   308: getfield 10	com/krecorder/call/callrecorder/d:a	Lcom/krecorder/call/callrecorder/removeFromPath;
    //   311: astore 8
    //   313: aload_2
    //   314: invokevirtual 87	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   317: astore_2
    //   318: aload 8
    //   320: aload_2
    //   321: invokestatic 90	com/krecorder/call/callrecorder/removeFromPath:a	(Lcom/krecorder/call/callrecorder/removeFromPath;Ljava/lang/String;)Ljava/lang/String;
    //   324: pop
    //   325: aload_0
    //   326: getfield 10	com/krecorder/call/callrecorder/d:a	Lcom/krecorder/call/callrecorder/removeFromPath;
    //   329: astore_2
    //   330: iconst_1
    //   331: istore_1
    //   332: aload_2
    //   333: iload_1
    //   334: invokevirtual 30	com/krecorder/call/callrecorder/removeFromPath:a	(I)V
    //   337: goto -89 -> 248
    //   340: astore_2
    //   341: goto -240 -> 101
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	344	0	this	d
    //   1	175	1	i	int
    //   212	80	1	j	int
    //   302	32	1	k	int
    //   6	238	2	localObject1	Object
    //   253	4	2	localObject2	Object
    //   258	17	2	localException1	Exception
    //   278	13	2	localObject3	Object
    //   298	16	2	localException2	Exception
    //   317	16	2	localObject4	Object
    //   340	1	2	localInterruptedException	InterruptedException
    //   30	30	4	bool1	boolean
    //   73	19	4	m	int
    //   94	3	5	l	long
    //   143	122	7	bool2	boolean
    //   214	105	8	localb	removeFromPath
    // Exception table:
    //   from	to	target	type
    //   192	196	253	finally
    //   197	201	253	finally
    //   202	206	253	finally
    //   206	210	253	finally
    //   217	222	253	finally
    //   222	226	253	finally
    //   227	231	253	finally
    //   232	236	253	finally
    //   236	240	253	finally
    //   244	248	253	finally
    //   248	250	253	finally
    //   254	256	253	finally
    //   299	302	253	finally
    //   307	311	253	finally
    //   313	317	253	finally
    //   320	325	253	finally
    //   325	329	253	finally
    //   333	337	253	finally
    //   123	127	258	java/lang/Exception
    //   128	132	258	java/lang/Exception
    //   133	137	258	java/lang/Exception
    //   137	141	258	java/lang/Exception
    //   148	152	258	java/lang/Exception
    //   192	196	298	java/lang/Exception
    //   197	201	298	java/lang/Exception
    //   202	206	298	java/lang/Exception
    //   206	210	298	java/lang/Exception
    //   217	222	298	java/lang/Exception
    //   222	226	298	java/lang/Exception
    //   227	231	298	java/lang/Exception
    //   232	236	298	java/lang/Exception
    //   236	240	298	java/lang/Exception
    //   244	248	298	java/lang/Exception
    //   80	84	340	java/lang/InterruptedException
    //   85	89	340	java/lang/InterruptedException
    //   96	101	340	java/lang/InterruptedException
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/krecorder/call/callrecorder/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */