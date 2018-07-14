package com.vvt.k;

import java.io.File;
import java.util.zip.CRC32;

public class a
  extends com.vvt.async.a
{
  private static final boolean a;
  private static final boolean b;
  private String c;
  private d d;
  private boolean e;
  private boolean f;
  private int g;
  private int h;
  
  static
  {
    boolean bool1 = true;
    boolean bool2 = com.vvt.ak.a.a;
    if (bool2)
    {
      bool2 = bool1;
      a = bool2;
      bool2 = com.vvt.ak.a.e;
      if (!bool2) {
        break label34;
      }
    }
    for (;;)
    {
      b = bool1;
      return;
      bool2 = false;
      break;
      label34:
      bool1 = false;
    }
  }
  
  public static long a(String paramString)
  {
    return b(paramString, 0, 0, true);
  }
  
  public static long a(String paramString, int paramInt1, int paramInt2)
  {
    boolean bool;
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      bool = true;
    }
    for (long l = b(paramString, 0, 0, bool);; l = b(paramString, paramInt1, paramInt2, false)) {
      return l;
    }
  }
  
  public static long a(byte[] paramArrayOfByte)
  {
    CRC32 localCRC32 = new java/util/zip/CRC32;
    localCRC32.<init>();
    localCRC32.update(paramArrayOfByte);
    return localCRC32.getValue();
  }
  
  /* Error */
  private static long b(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: getstatic 22	com/vvt/k/a:a	Z
    //   9: istore 6
    //   11: iload 6
    //   13: ifeq +3 -> 16
    //   16: getstatic 22	com/vvt/k/a:a	Z
    //   19: istore 6
    //   21: iload 6
    //   23: ifeq +3 -> 26
    //   26: iload_3
    //   27: ifne +9 -> 36
    //   30: aload_0
    //   31: iload_1
    //   32: iload_2
    //   33: invokestatic 61	com/vvt/k/a:removeFromPath	(Ljava/lang/String;II)V
    //   36: new 63	java/io/File
    //   39: astore 7
    //   41: aload 7
    //   43: aload_0
    //   44: invokespecial 66	java/io/File:<init>	(Ljava/lang/String;)V
    //   47: new 68	java/io/FileInputStream
    //   50: astore 8
    //   52: aload 8
    //   54: aload 7
    //   56: invokespecial 71	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   59: iload_1
    //   60: i2l
    //   61: lstore 9
    //   63: aload 8
    //   65: lload 9
    //   67: invokevirtual 75	java/io/FileInputStream:skip	(J)J
    //   70: pop2
    //   71: new 77	java/util/zip/CheckedInputStream
    //   74: astore 11
    //   76: new 35	java/util/zip/CRC32
    //   79: astore 7
    //   81: aload 7
    //   83: invokespecial 36	java/util/zip/CRC32:<init>	()V
    //   86: aload 11
    //   88: aload 8
    //   90: aload 7
    //   92: invokespecial 80	java/util/zip/CheckedInputStream:<init>	(Ljava/io/InputStream;Ljava/util/zip/Checksum;)V
    //   95: iload_3
    //   96: ifeq +87 -> 183
    //   99: getstatic 22	com/vvt/k/a:a	Z
    //   102: istore 6
    //   104: iload 6
    //   106: ifeq +3 -> 109
    //   109: sipush 1024
    //   112: istore 6
    //   114: iload 6
    //   116: newarray <illegal type>
    //   118: astore 7
    //   120: aload 11
    //   122: aload 7
    //   124: invokevirtual 85	java/util/zip/CheckedInputStream:read	([B)I
    //   127: istore 4
    //   129: iload 4
    //   131: ifge -11 -> 120
    //   134: aload 11
    //   136: invokevirtual 89	java/util/zip/CheckedInputStream:getChecksum	()Ljava/util/zip/Checksum;
    //   139: astore 7
    //   141: aload 7
    //   143: invokeinterface 92 1 0
    //   148: lstore 12
    //   150: aload 11
    //   152: invokestatic 97	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   155: aload 8
    //   157: invokestatic 97	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   160: getstatic 22	com/vvt/k/a:a	Z
    //   163: istore 6
    //   165: iload 6
    //   167: ifeq +3 -> 170
    //   170: getstatic 22	com/vvt/k/a:a	Z
    //   173: istore 6
    //   175: iload 6
    //   177: ifeq +3 -> 180
    //   180: lload 12
    //   182: lreturn
    //   183: iload_2
    //   184: sipush 1024
    //   187: idiv
    //   188: istore 4
    //   190: iload_2
    //   191: sipush 1024
    //   194: irem
    //   195: istore 14
    //   197: getstatic 22	com/vvt/k/a:a	Z
    //   200: istore 6
    //   202: iload 6
    //   204: ifeq +3 -> 207
    //   207: iconst_0
    //   208: istore 6
    //   210: aconst_null
    //   211: astore 7
    //   213: iload 6
    //   215: iload 4
    //   217: if_icmpge +25 -> 242
    //   220: ldc2_w 98
    //   223: lstore 15
    //   225: aload 11
    //   227: lload 15
    //   229: invokevirtual 102	java/util/zip/CheckedInputStream:skip	(J)J
    //   232: pop2
    //   233: iload 6
    //   235: iconst_1
    //   236: iadd
    //   237: istore 6
    //   239: goto -26 -> 213
    //   242: iload 14
    //   244: i2l
    //   245: lstore 12
    //   247: aload 11
    //   249: lload 12
    //   251: invokevirtual 102	java/util/zip/CheckedInputStream:skip	(J)J
    //   254: pop2
    //   255: goto -121 -> 134
    //   258: astore 7
    //   260: aload 8
    //   262: astore 5
    //   264: getstatic 26	com/vvt/k/a:removeFromPath	Z
    //   267: istore 17
    //   269: iload 17
    //   271: ifeq +3 -> 274
    //   274: aload 7
    //   276: athrow
    //   277: astore 7
    //   279: aload 5
    //   281: astore 8
    //   283: aload 11
    //   285: invokestatic 97	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   288: aload 8
    //   290: invokestatic 97	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   293: aload 7
    //   295: athrow
    //   296: astore 7
    //   298: aconst_null
    //   299: astore 11
    //   301: iconst_0
    //   302: istore 17
    //   304: aconst_null
    //   305: astore 8
    //   307: goto -24 -> 283
    //   310: astore 7
    //   312: aconst_null
    //   313: astore 11
    //   315: goto -32 -> 283
    //   318: astore 7
    //   320: goto -37 -> 283
    //   323: astore 7
    //   325: aconst_null
    //   326: astore 11
    //   328: goto -64 -> 264
    //   331: astore 7
    //   333: aconst_null
    //   334: astore 11
    //   336: aload 8
    //   338: astore 5
    //   340: goto -76 -> 264
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	343	0	paramString	String
    //   0	343	1	paramInt1	int
    //   0	343	2	paramInt2	int
    //   0	343	3	paramBoolean	boolean
    //   1	217	4	i	int
    //   4	335	5	localObject1	Object
    //   9	96	6	bool1	boolean
    //   112	3	6	j	int
    //   163	74	6	k	int
    //   237	1	6	m	int
    //   39	173	7	localObject2	Object
    //   258	17	7	localException1	Exception
    //   277	17	7	localObject3	Object
    //   296	1	7	localObject4	Object
    //   310	1	7	localObject5	Object
    //   318	1	7	localObject6	Object
    //   323	1	7	localException2	Exception
    //   331	1	7	localException3	Exception
    //   50	287	8	localObject7	Object
    //   61	5	9	l1	long
    //   74	261	11	localCheckedInputStream	java.util.zip.CheckedInputStream
    //   148	102	12	l2	long
    //   195	48	14	n	int
    //   223	5	15	l3	long
    //   267	36	17	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   99	102	258	java/lang/Exception
    //   114	118	258	java/lang/Exception
    //   122	127	258	java/lang/Exception
    //   134	139	258	java/lang/Exception
    //   141	148	258	java/lang/Exception
    //   184	188	258	java/lang/Exception
    //   191	195	258	java/lang/Exception
    //   197	200	258	java/lang/Exception
    //   227	233	258	java/lang/Exception
    //   249	255	258	java/lang/Exception
    //   264	267	277	finally
    //   274	277	277	finally
    //   47	50	296	finally
    //   54	59	296	finally
    //   65	71	310	finally
    //   71	74	310	finally
    //   76	79	310	finally
    //   81	86	310	finally
    //   90	95	310	finally
    //   99	102	318	finally
    //   114	118	318	finally
    //   122	127	318	finally
    //   134	139	318	finally
    //   141	148	318	finally
    //   184	188	318	finally
    //   191	195	318	finally
    //   197	200	318	finally
    //   227	233	318	finally
    //   249	255	318	finally
    //   47	50	323	java/lang/Exception
    //   54	59	323	java/lang/Exception
    //   65	71	331	java/lang/Exception
    //   71	74	331	java/lang/Exception
    //   76	79	331	java/lang/Exception
    //   81	86	331	java/lang/Exception
    //   90	95	331	java/lang/Exception
  }
  
  private static void b(String paramString, int paramInt1, int paramInt2)
  {
    Object localObject = new java/io/File;
    ((File)localObject).<init>(paramString);
    long l1 = ((File)localObject).length();
    boolean bool1 = a;
    if ((!bool1) || (paramInt2 <= 0))
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("count cannot be zero or negative");
      throw ((Throwable)localObject);
    }
    if (paramInt1 >= 0)
    {
      l2 = paramInt1;
      bool1 = l2 < l1;
      if (!bool1) {}
    }
    else
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("offset is out of file length");
      throw ((Throwable)localObject);
    }
    int i = paramInt1 + paramInt2;
    long l2 = i;
    boolean bool2 = l2 < l1;
    if (bool2)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("request is out of file length");
      throw ((Throwable)localObject);
    }
  }
  
  protected void a(d paramd, int paramInt, Object... paramVarArgs)
  {
    boolean bool = a;
    if (bool) {}
    switch (paramInt)
    {
    }
    for (;;)
    {
      return;
      Object localObject = (Long)paramVarArgs[0];
      long l = ((Long)localObject).longValue();
      paramd.a(l);
      continue;
      localObject = (Exception)paramVarArgs[0];
      paramd.a((Exception)localObject);
    }
  }
  
  /* Error */
  public boolean a(String paramString, d paramd)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: iconst_1
    //   6: istore 5
    //   8: aload_0
    //   9: monitorenter
    //   10: aload_0
    //   11: getfield 56	com/vvt/k/a:f	Z
    //   14: istore 6
    //   16: iload 6
    //   18: ifne +112 -> 130
    //   21: getstatic 22	com/vvt/k/a:a	Z
    //   24: istore_3
    //   25: iload_3
    //   26: ifeq +3 -> 29
    //   29: iconst_1
    //   30: istore_3
    //   31: aload_0
    //   32: iload_3
    //   33: putfield 56	com/vvt/k/a:f	Z
    //   36: aload_0
    //   37: aload_1
    //   38: putfield 48	com/vvt/k/a:MyUncaughtExceptionHandler	Ljava/lang/String;
    //   41: aload_0
    //   42: aload_2
    //   43: putfield 46	com/vvt/k/a:d	Lcom/vvt/k/d;
    //   46: iconst_0
    //   47: istore_3
    //   48: aconst_null
    //   49: astore 4
    //   51: aload_0
    //   52: iconst_0
    //   53: putfield 58	com/vvt/k/a:FxFileObserverWorker	I
    //   56: iconst_0
    //   57: istore_3
    //   58: aconst_null
    //   59: astore 4
    //   61: aload_0
    //   62: iconst_0
    //   63: putfield 118	com/vvt/k/a:AppEngine1	I
    //   66: iconst_1
    //   67: istore_3
    //   68: aload_0
    //   69: iload_3
    //   70: putfield 119	com/vvt/k/a:e	Z
    //   73: aload_2
    //   74: ifnull +8 -> 82
    //   77: aload_0
    //   78: aload_2
    //   79: invokevirtual 134	com/vvt/k/a:a	(Ljava/lang/Object;)V
    //   82: new 136	com/vvt/k/MyUncaughtExceptionHandler
    //   85: astore 4
    //   87: iconst_0
    //   88: istore 6
    //   90: aload 4
    //   92: aload_0
    //   93: aconst_null
    //   94: invokespecial 139	com/vvt/k/MyUncaughtExceptionHandler:<init>	(Lcom/vvt/k/a;Lcom/vvt/k/removeFromPath;)V
    //   97: iconst_1
    //   98: istore 6
    //   100: aload 4
    //   102: iload 6
    //   104: invokevirtual 143	com/vvt/k/MyUncaughtExceptionHandler:setPriority	(I)V
    //   107: aload 4
    //   109: invokevirtual 146	com/vvt/k/MyUncaughtExceptionHandler:start	()V
    //   112: aload_0
    //   113: monitorexit
    //   114: iload 5
    //   116: ireturn
    //   117: astore 4
    //   119: getstatic 26	com/vvt/k/a:removeFromPath	Z
    //   122: istore_3
    //   123: iload_3
    //   124: ifeq -42 -> 82
    //   127: goto -45 -> 82
    //   130: getstatic 22	com/vvt/k/a:a	Z
    //   133: istore 5
    //   135: iload 5
    //   137: ifeq +3 -> 140
    //   140: iconst_0
    //   141: istore 5
    //   143: aconst_null
    //   144: astore 7
    //   146: goto -34 -> 112
    //   149: astore 7
    //   151: aload_0
    //   152: monitorexit
    //   153: aload 7
    //   155: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	156	0	this	a
    //   0	156	1	paramString	String
    //   0	156	2	paramd	d
    //   1	123	3	bool1	boolean
    //   3	105	4	localc	MyUncaughtExceptionHandler
    //   117	1	4	localNullListenerException	com.vvt.async.NullListenerException
    //   6	136	5	bool2	boolean
    //   14	89	6	i	int
    //   144	1	7	localObject1	Object
    //   149	5	7	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   78	82	117	com/vvt/async/NullListenerException
    //   10	14	149	finally
    //   21	24	149	finally
    //   32	36	149	finally
    //   37	41	149	finally
    //   42	46	149	finally
    //   52	56	149	finally
    //   62	66	149	finally
    //   69	73	149	finally
    //   78	82	149	finally
    //   82	85	149	finally
    //   93	97	149	finally
    //   102	107	149	finally
    //   107	112	149	finally
    //   119	122	149	finally
    //   130	133	149	finally
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/k/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */