package com.vvt.phoenix.prot;

import com.vvt.phoenix.a;

public class m
{
  private static final boolean a = a.b;
  
  /* Error */
  public static com.vvt.phoenix.prot.command.a.s a(boolean paramBoolean, String paramString, javax.crypto.SecretKey paramSecretKey)
  {
    // Byte code:
    //   0: ldc 2
    //   2: astore_3
    //   3: aload_3
    //   4: monitorenter
    //   5: iload_0
    //   6: ifeq +106 -> 112
    //   9: getstatic 13	com/vvt/phoenix/prot/m:a	Z
    //   12: istore 4
    //   14: iload 4
    //   16: ifeq +3 -> 19
    //   19: new 15	java/lang/StringBuilder
    //   22: astore 5
    //   24: aload 5
    //   26: invokespecial 19	java/lang/StringBuilder:<init>	()V
    //   29: aload 5
    //   31: aload_1
    //   32: invokevirtual 23	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: astore 5
    //   37: ldc 25
    //   39: astore 6
    //   41: aload 5
    //   43: aload 6
    //   45: invokevirtual 23	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: astore 5
    //   50: aload 5
    //   52: invokevirtual 29	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   55: astore 5
    //   57: aload_2
    //   58: aload_1
    //   59: aload 5
    //   61: invokestatic 34	com/vvt/l/a:removeFromPath	(Ljavax/crypto/SecretKey;Ljava/lang/String;Ljava/lang/String;)V
    //   64: new 36	java/io/File
    //   67: astore 6
    //   69: aload 6
    //   71: aload_1
    //   72: invokespecial 39	java/io/File:<init>	(Ljava/lang/String;)V
    //   75: aload 6
    //   77: invokevirtual 43	java/io/File:delete	()Z
    //   80: pop
    //   81: new 36	java/io/File
    //   84: astore 6
    //   86: aload 6
    //   88: aload 5
    //   90: invokespecial 39	java/io/File:<init>	(Ljava/lang/String;)V
    //   93: new 36	java/io/File
    //   96: astore 5
    //   98: aload 5
    //   100: aload_1
    //   101: invokespecial 39	java/io/File:<init>	(Ljava/lang/String;)V
    //   104: aload 6
    //   106: aload 5
    //   108: invokevirtual 47	java/io/File:renameTo	(Ljava/io/File;)Z
    //   111: pop
    //   112: getstatic 13	com/vvt/phoenix/prot/m:a	Z
    //   115: istore 4
    //   117: iload 4
    //   119: ifeq +3 -> 122
    //   122: new 36	java/io/File
    //   125: astore 5
    //   127: aload 5
    //   129: aload_1
    //   130: invokespecial 39	java/io/File:<init>	(Ljava/lang/String;)V
    //   133: new 49	java/io/FileInputStream
    //   136: astore 6
    //   138: aload 6
    //   140: aload 5
    //   142: invokespecial 52	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   145: bipush 8
    //   147: istore 7
    //   149: iload 7
    //   151: newarray <illegal type>
    //   153: astore 8
    //   155: aload 8
    //   157: dup
    //   158: dup2
    //   159: iconst_0
    //   160: iconst_0
    //   161: bastore
    //   162: iconst_1
    //   163: iconst_0
    //   164: bastore
    //   165: dup2
    //   166: iconst_2
    //   167: iconst_0
    //   168: bastore
    //   169: iconst_3
    //   170: iconst_0
    //   171: bastore
    //   172: dup2
    //   173: iconst_4
    //   174: iconst_0
    //   175: bastore
    //   176: iconst_5
    //   177: iconst_0
    //   178: bastore
    //   179: bipush 6
    //   181: iconst_0
    //   182: bastore
    //   183: bipush 7
    //   185: iconst_0
    //   186: bastore
    //   187: iconst_4
    //   188: istore 9
    //   190: iconst_4
    //   191: istore 10
    //   193: aload 6
    //   195: aload 8
    //   197: iload 9
    //   199: iload 10
    //   201: invokevirtual 58	java/io/FileInputStream:read	([BII)I
    //   204: pop
    //   205: aload 6
    //   207: invokestatic 63	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   210: aload 8
    //   212: invokestatic 69	com/vvt/phoenix/a/a:MyUncaughtExceptionHandler	([B)J
    //   215: lstore 11
    //   217: getstatic 13	com/vvt/phoenix/prot/m:a	Z
    //   220: istore 9
    //   222: iload 9
    //   224: ifeq +3 -> 227
    //   227: iconst_4
    //   228: istore 9
    //   230: aload 5
    //   232: invokevirtual 73	java/io/File:length	()J
    //   235: lstore 13
    //   237: iconst_4
    //   238: i2l
    //   239: lstore 15
    //   241: lload 13
    //   243: lload 15
    //   245: lsub
    //   246: lstore 13
    //   248: lload 13
    //   250: l2i
    //   251: istore 10
    //   253: aload_1
    //   254: iload 9
    //   256: iload 10
    //   258: invokestatic 80	com/vvt/k/a:a	(Ljava/lang/String;II)J
    //   261: lstore 17
    //   263: lload 17
    //   265: lload 11
    //   267: lcmp
    //   268: istore 19
    //   270: iload 19
    //   272: ifeq +111 -> 383
    //   275: new 82	java/lang/Exception
    //   278: astore 5
    //   280: ldc 84
    //   282: astore 6
    //   284: aload 5
    //   286: aload 6
    //   288: invokespecial 85	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   291: aload 5
    //   293: athrow
    //   294: astore 5
    //   296: aload_3
    //   297: monitorexit
    //   298: aload 5
    //   300: athrow
    //   301: astore 6
    //   303: getstatic 13	com/vvt/phoenix/prot/m:a	Z
    //   306: istore 7
    //   308: iload 7
    //   310: ifeq +3 -> 313
    //   313: new 36	java/io/File
    //   316: astore 8
    //   318: aload 8
    //   320: aload_1
    //   321: invokespecial 39	java/io/File:<init>	(Ljava/lang/String;)V
    //   324: aload 8
    //   326: invokevirtual 43	java/io/File:delete	()Z
    //   329: pop
    //   330: new 36	java/io/File
    //   333: astore 8
    //   335: aload 8
    //   337: aload 5
    //   339: invokespecial 39	java/io/File:<init>	(Ljava/lang/String;)V
    //   342: aload 8
    //   344: invokevirtual 43	java/io/File:delete	()Z
    //   347: pop
    //   348: aload 6
    //   350: athrow
    //   351: astore 5
    //   353: getstatic 13	com/vvt/phoenix/prot/m:a	Z
    //   356: istore 19
    //   358: iload 19
    //   360: ifeq +3 -> 363
    //   363: new 36	java/io/File
    //   366: astore 6
    //   368: aload 6
    //   370: aload_1
    //   371: invokespecial 39	java/io/File:<init>	(Ljava/lang/String;)V
    //   374: aload 6
    //   376: invokevirtual 43	java/io/File:delete	()Z
    //   379: pop
    //   380: aload 5
    //   382: athrow
    //   383: getstatic 13	com/vvt/phoenix/prot/m:a	Z
    //   386: istore 19
    //   388: iload 19
    //   390: ifeq +3 -> 393
    //   393: aload_1
    //   394: invokestatic 90	com/vvt/phoenix/prot/a/f:a	(Ljava/lang/String;)Lcom/vvt/phoenix/prot/command/a/s;
    //   397: astore 6
    //   399: getstatic 13	com/vvt/phoenix/prot/m:a	Z
    //   402: istore 7
    //   404: iload 7
    //   406: ifeq +3 -> 409
    //   409: aload 5
    //   411: invokevirtual 43	java/io/File:delete	()Z
    //   414: pop
    //   415: aload_3
    //   416: monitorexit
    //   417: aload 6
    //   419: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	420	0	paramBoolean	boolean
    //   0	420	1	paramString	String
    //   0	420	2	paramSecretKey	javax.crypto.SecretKey
    //   2	414	3	localClass	Class
    //   12	106	4	bool1	boolean
    //   22	270	5	localObject1	Object
    //   294	44	5	str	String
    //   351	59	5	localException1	Exception
    //   39	248	6	localObject2	Object
    //   301	48	6	localException2	Exception
    //   366	52	6	localObject3	Object
    //   147	3	7	i	int
    //   306	99	7	bool2	boolean
    //   153	190	8	localObject4	Object
    //   188	10	9	j	int
    //   220	3	9	bool3	boolean
    //   228	27	9	k	int
    //   191	66	10	m	int
    //   215	51	11	l1	long
    //   235	14	13	l2	long
    //   239	5	15	l3	long
    //   261	3	17	l4	long
    //   268	121	19	bool4	boolean
    // Exception table:
    //   from	to	target	type
    //   9	12	294	finally
    //   19	22	294	finally
    //   24	29	294	finally
    //   31	35	294	finally
    //   43	48	294	finally
    //   50	55	294	finally
    //   59	64	294	finally
    //   64	67	294	finally
    //   71	75	294	finally
    //   75	81	294	finally
    //   81	84	294	finally
    //   88	93	294	finally
    //   93	96	294	finally
    //   100	104	294	finally
    //   106	112	294	finally
    //   112	115	294	finally
    //   122	125	294	finally
    //   129	133	294	finally
    //   133	136	294	finally
    //   140	145	294	finally
    //   149	153	294	finally
    //   155	187	294	finally
    //   199	205	294	finally
    //   205	210	294	finally
    //   210	215	294	finally
    //   217	220	294	finally
    //   230	235	294	finally
    //   256	261	294	finally
    //   275	278	294	finally
    //   286	291	294	finally
    //   291	294	294	finally
    //   303	306	294	finally
    //   313	316	294	finally
    //   320	324	294	finally
    //   324	330	294	finally
    //   330	333	294	finally
    //   337	342	294	finally
    //   342	348	294	finally
    //   348	351	294	finally
    //   353	356	294	finally
    //   363	366	294	finally
    //   370	374	294	finally
    //   374	380	294	finally
    //   380	383	294	finally
    //   383	386	294	finally
    //   393	397	294	finally
    //   399	402	294	finally
    //   409	415	294	finally
    //   59	64	301	java/lang/Exception
    //   230	235	351	java/lang/Exception
    //   256	261	351	java/lang/Exception
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */