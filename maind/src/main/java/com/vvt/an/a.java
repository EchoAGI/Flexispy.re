package com.vvt.an;

public class a
  extends com.vvt.async.a
{
  private static final boolean a;
  private static final boolean b;
  
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
  
  public static void a(String paramString1, String paramString2)
  {
    synchronized (a.class)
    {
      b(paramString1, paramString2);
      return;
    }
  }
  
  /* Error */
  public static byte[] a(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc 2
    //   2: astore_1
    //   3: aload_1
    //   4: monitorenter
    //   5: new 23	java/io/ByteArrayOutputStream
    //   8: astore_2
    //   9: aload_2
    //   10: invokespecial 27	java/io/ByteArrayOutputStream:<init>	()V
    //   13: iconst_0
    //   14: istore_3
    //   15: new 29	java/util/zip/GZIPOutputStream
    //   18: astore 4
    //   20: aload 4
    //   22: aload_2
    //   23: invokespecial 32	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   26: aload 4
    //   28: aload_0
    //   29: invokevirtual 36	java/util/zip/GZIPOutputStream:write	([B)V
    //   32: aload 4
    //   34: invokevirtual 39	java/util/zip/GZIPOutputStream:finish	()V
    //   37: aload_2
    //   38: invokevirtual 43	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   41: astore 5
    //   43: aload 4
    //   45: invokestatic 47	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   48: aload_2
    //   49: invokestatic 47	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   52: aload_1
    //   53: monitorexit
    //   54: aload 5
    //   56: areturn
    //   57: astore 5
    //   59: aconst_null
    //   60: astore 4
    //   62: getstatic 18	com/vvt/an/a:removeFromPath	Z
    //   65: istore_3
    //   66: iload_3
    //   67: ifeq +3 -> 70
    //   70: aload 5
    //   72: athrow
    //   73: astore 5
    //   75: aload 4
    //   77: invokestatic 47	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   80: aload_2
    //   81: invokestatic 47	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   84: aload 5
    //   86: athrow
    //   87: astore 5
    //   89: aload_1
    //   90: monitorexit
    //   91: aload 5
    //   93: athrow
    //   94: astore 5
    //   96: aconst_null
    //   97: astore 4
    //   99: goto -24 -> 75
    //   102: astore 5
    //   104: goto -42 -> 62
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	paramArrayOfByte	byte[]
    //   2	88	1	localClass	Class
    //   8	73	2	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   14	53	3	bool	boolean
    //   18	80	4	localGZIPOutputStream	java.util.zip.GZIPOutputStream
    //   41	14	5	arrayOfByte	byte[]
    //   57	14	5	localIOException1	java.io.IOException
    //   73	12	5	localObject1	Object
    //   87	5	5	localObject2	Object
    //   94	1	5	localObject3	Object
    //   102	1	5	localIOException2	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   15	18	57	java/io/IOException
    //   22	26	57	java/io/IOException
    //   28	32	73	finally
    //   32	37	73	finally
    //   37	41	73	finally
    //   62	65	73	finally
    //   70	73	73	finally
    //   5	8	87	finally
    //   9	13	87	finally
    //   43	48	87	finally
    //   48	52	87	finally
    //   75	80	87	finally
    //   80	84	87	finally
    //   84	87	87	finally
    //   15	18	94	finally
    //   22	26	94	finally
    //   28	32	102	java/io/IOException
    //   32	37	102	java/io/IOException
    //   37	41	102	java/io/IOException
  }
  
  /* Error */
  private static void b(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: getstatic 13	com/vvt/an/a:a	Z
    //   5: istore_3
    //   6: iload_3
    //   7: ifeq +3 -> 10
    //   10: new 51	java/io/File
    //   13: astore 4
    //   15: aload 4
    //   17: aload_0
    //   18: invokespecial 54	java/io/File:<init>	(Ljava/lang/String;)V
    //   21: new 51	java/io/File
    //   24: astore 5
    //   26: aload 5
    //   28: aload_1
    //   29: invokespecial 54	java/io/File:<init>	(Ljava/lang/String;)V
    //   32: new 56	java/io/FileInputStream
    //   35: astore 6
    //   37: aload 6
    //   39: aload 4
    //   41: invokespecial 59	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   44: new 61	java/io/FileOutputStream
    //   47: astore 7
    //   49: aload 7
    //   51: aload 5
    //   53: invokespecial 62	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   56: new 29	java/util/zip/GZIPOutputStream
    //   59: astore 8
    //   61: aload 8
    //   63: aload 7
    //   65: invokespecial 32	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   68: sipush 1024
    //   71: istore_3
    //   72: iload_3
    //   73: newarray <illegal type>
    //   75: astore_2
    //   76: aload 6
    //   78: aload_2
    //   79: invokevirtual 67	java/io/FileInputStream:read	([B)I
    //   82: istore_3
    //   83: iload_3
    //   84: ifle +21 -> 105
    //   87: aload 8
    //   89: aload_2
    //   90: iconst_0
    //   91: iload_3
    //   92: invokevirtual 70	java/util/zip/GZIPOutputStream:write	([BII)V
    //   95: aload 6
    //   97: aload_2
    //   98: invokevirtual 67	java/io/FileInputStream:read	([B)I
    //   101: istore_3
    //   102: goto -19 -> 83
    //   105: aload 8
    //   107: invokevirtual 39	java/util/zip/GZIPOutputStream:finish	()V
    //   110: aload 8
    //   112: invokestatic 47	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   115: aload 7
    //   117: invokestatic 47	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   120: aload 6
    //   122: invokestatic 73	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   125: getstatic 13	com/vvt/an/a:a	Z
    //   128: istore_3
    //   129: iload_3
    //   130: ifeq +3 -> 133
    //   133: getstatic 13	com/vvt/an/a:a	Z
    //   136: istore_3
    //   137: iload_3
    //   138: ifeq +3 -> 141
    //   141: return
    //   142: astore 4
    //   144: iconst_0
    //   145: istore 9
    //   147: aconst_null
    //   148: astore 8
    //   150: aconst_null
    //   151: astore 7
    //   153: getstatic 18	com/vvt/an/a:removeFromPath	Z
    //   156: istore 10
    //   158: iload 10
    //   160: ifeq +3 -> 163
    //   163: aload 5
    //   165: invokevirtual 77	java/io/File:delete	()Z
    //   168: pop
    //   169: aload 4
    //   171: athrow
    //   172: astore 4
    //   174: aload 7
    //   176: astore 6
    //   178: aload_2
    //   179: astore 7
    //   181: aload 8
    //   183: invokestatic 47	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   186: aload 7
    //   188: invokestatic 47	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   191: aload 6
    //   193: invokestatic 73	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   196: getstatic 13	com/vvt/an/a:a	Z
    //   199: istore 9
    //   201: iload 9
    //   203: ifeq +3 -> 206
    //   206: aload 4
    //   208: athrow
    //   209: astore 4
    //   211: iconst_0
    //   212: istore 9
    //   214: aconst_null
    //   215: astore 8
    //   217: aconst_null
    //   218: astore 7
    //   220: iconst_0
    //   221: istore 10
    //   223: aconst_null
    //   224: astore 6
    //   226: goto -45 -> 181
    //   229: astore 4
    //   231: iconst_0
    //   232: istore 9
    //   234: aconst_null
    //   235: astore 8
    //   237: aconst_null
    //   238: astore 7
    //   240: goto -59 -> 181
    //   243: astore 4
    //   245: iconst_0
    //   246: istore 9
    //   248: aconst_null
    //   249: astore 8
    //   251: goto -70 -> 181
    //   254: astore 4
    //   256: goto -75 -> 181
    //   259: astore 4
    //   261: iconst_0
    //   262: istore 9
    //   264: aconst_null
    //   265: astore 8
    //   267: aload 6
    //   269: astore 7
    //   271: goto -118 -> 153
    //   274: astore 4
    //   276: iconst_0
    //   277: istore 9
    //   279: aconst_null
    //   280: astore 8
    //   282: aload 7
    //   284: astore_2
    //   285: aload 6
    //   287: astore 7
    //   289: goto -136 -> 153
    //   292: astore 4
    //   294: aload 7
    //   296: astore_2
    //   297: aload 6
    //   299: astore 7
    //   301: goto -148 -> 153
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	304	0	paramString1	String
    //   0	304	1	paramString2	String
    //   1	296	2	localObject1	Object
    //   5	2	3	bool1	boolean
    //   71	31	3	i	int
    //   128	10	3	bool2	boolean
    //   13	27	4	localFile1	java.io.File
    //   142	28	4	localIOException1	java.io.IOException
    //   172	35	4	localObject2	Object
    //   209	1	4	localObject3	Object
    //   229	1	4	localObject4	Object
    //   243	1	4	localObject5	Object
    //   254	1	4	localObject6	Object
    //   259	1	4	localIOException2	java.io.IOException
    //   274	1	4	localIOException3	java.io.IOException
    //   292	1	4	localIOException4	java.io.IOException
    //   24	140	5	localFile2	java.io.File
    //   35	263	6	localObject7	Object
    //   47	253	7	localObject8	Object
    //   59	222	8	localGZIPOutputStream	java.util.zip.GZIPOutputStream
    //   145	133	9	bool3	boolean
    //   156	66	10	bool4	boolean
    // Exception table:
    //   from	to	target	type
    //   32	35	142	java/io/IOException
    //   39	44	142	java/io/IOException
    //   153	156	172	finally
    //   163	169	172	finally
    //   169	172	172	finally
    //   32	35	209	finally
    //   39	44	209	finally
    //   44	47	229	finally
    //   51	56	229	finally
    //   56	59	243	finally
    //   63	68	243	finally
    //   72	75	254	finally
    //   78	82	254	finally
    //   91	95	254	finally
    //   97	101	254	finally
    //   105	110	254	finally
    //   44	47	259	java/io/IOException
    //   51	56	259	java/io/IOException
    //   56	59	274	java/io/IOException
    //   63	68	274	java/io/IOException
    //   72	75	292	java/io/IOException
    //   78	82	292	java/io/IOException
    //   91	95	292	java/io/IOException
    //   97	101	292	java/io/IOException
    //   105	110	292	java/io/IOException
  }
  
  protected void a(b paramb, int paramInt, Object... paramVarArgs)
  {
    boolean bool = a;
    if (bool) {}
    switch (paramInt)
    {
    }
    for (;;)
    {
      return;
      Object localObject = (String)paramVarArgs[0];
      paramb.a((String)localObject);
      continue;
      localObject = (Exception)paramVarArgs[0];
      paramb.a((Exception)localObject);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/an/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */