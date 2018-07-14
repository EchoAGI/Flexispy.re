package com.vvt.qq.internal;

public class MessageForStructing
{
  /* Error */
  public AbsStructMsg doParse(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_1
    //   3: ifnull +67 -> 70
    //   6: new 10	java/io/ObjectInputStream
    //   9: astore_3
    //   10: new 12	java/io/ByteArrayInputStream
    //   13: astore 4
    //   15: aload 4
    //   17: aload_1
    //   18: invokespecial 15	java/io/ByteArrayInputStream:<init>	([B)V
    //   21: aload_3
    //   22: aload 4
    //   24: invokespecial 18	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   27: aload_3
    //   28: invokevirtual 22	java/io/ObjectInputStream:readInt	()I
    //   31: istore 5
    //   33: iconst_2
    //   34: istore 6
    //   36: iload 5
    //   38: iload 6
    //   40: if_icmpne +32 -> 72
    //   43: new 25	com/vvt/qq/internal/StructMsgForAudioShare
    //   46: astore 4
    //   48: aload 4
    //   50: invokespecial 26	com/vvt/qq/internal/StructMsgForAudioShare:<init>	()V
    //   53: aload 4
    //   55: aload_3
    //   56: invokevirtual 32	com/vvt/qq/internal/AbsStructMsg:readExternal	(Ljava/io/ObjectInput;)V
    //   59: aload 4
    //   61: astore_2
    //   62: aload_3
    //   63: ifnull +7 -> 70
    //   66: aload_3
    //   67: invokevirtual 35	java/io/ObjectInputStream:close	()V
    //   70: aload_2
    //   71: areturn
    //   72: iconst_3
    //   73: istore 6
    //   75: iload 5
    //   77: iload 6
    //   79: if_icmpeq -17 -> 62
    //   82: iconst_5
    //   83: istore 6
    //   85: iload 5
    //   87: iload 6
    //   89: if_icmpeq -27 -> 62
    //   92: new 39	com/vvt/qq/internal/StructMsgForGeneralShare
    //   95: astore 4
    //   97: aload 4
    //   99: invokespecial 40	com/vvt/qq/internal/StructMsgForGeneralShare:<init>	()V
    //   102: aload 4
    //   104: aload_3
    //   105: invokevirtual 32	com/vvt/qq/internal/AbsStructMsg:readExternal	(Ljava/io/ObjectInput;)V
    //   108: aload 4
    //   110: iload 5
    //   112: putfield 44	com/vvt/qq/internal/AbsStructMsg:mMsgServiceID	I
    //   115: aload 4
    //   117: astore_2
    //   118: goto -56 -> 62
    //   121: astore 4
    //   123: aconst_null
    //   124: astore_3
    //   125: aload 4
    //   127: astore_2
    //   128: aload_3
    //   129: ifnull +7 -> 136
    //   132: aload_3
    //   133: invokevirtual 35	java/io/ObjectInputStream:close	()V
    //   136: aload_2
    //   137: athrow
    //   138: astore 4
    //   140: iconst_0
    //   141: istore 6
    //   143: aconst_null
    //   144: astore 4
    //   146: aload 4
    //   148: ifnull -78 -> 70
    //   151: aload 4
    //   153: invokevirtual 35	java/io/ObjectInputStream:close	()V
    //   156: goto -86 -> 70
    //   159: astore 4
    //   161: goto -91 -> 70
    //   164: astore 4
    //   166: goto -30 -> 136
    //   169: astore_2
    //   170: goto -42 -> 128
    //   173: astore 4
    //   175: aload_3
    //   176: astore 4
    //   178: goto -32 -> 146
    //   181: astore_2
    //   182: aload 4
    //   184: astore_2
    //   185: aload_3
    //   186: astore 4
    //   188: goto -42 -> 146
    //   191: astore_2
    //   192: aload 4
    //   194: astore_2
    //   195: aload_3
    //   196: astore 4
    //   198: goto -52 -> 146
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	201	0	this	MessageForStructing
    //   0	201	1	paramArrayOfByte	byte[]
    //   1	136	2	localObject1	Object
    //   169	1	2	localObject2	Object
    //   181	1	2	localException1	Exception
    //   184	1	2	localObject3	Object
    //   191	1	2	localException2	Exception
    //   194	1	2	localObject4	Object
    //   9	187	3	localObjectInputStream1	java.io.ObjectInputStream
    //   13	103	4	localObject5	Object
    //   121	5	4	localObject6	Object
    //   138	1	4	localException3	Exception
    //   144	8	4	localObject7	Object
    //   159	1	4	localIOException1	java.io.IOException
    //   164	1	4	localIOException2	java.io.IOException
    //   173	1	4	localException4	Exception
    //   176	21	4	localObjectInputStream2	java.io.ObjectInputStream
    //   31	80	5	i	int
    //   34	108	6	j	int
    // Exception table:
    //   from	to	target	type
    //   6	9	121	finally
    //   10	13	121	finally
    //   17	21	121	finally
    //   22	27	121	finally
    //   6	9	138	java/lang/Exception
    //   10	13	138	java/lang/Exception
    //   17	21	138	java/lang/Exception
    //   22	27	138	java/lang/Exception
    //   66	70	159	java/io/IOException
    //   151	156	159	java/io/IOException
    //   132	136	164	java/io/IOException
    //   27	31	169	finally
    //   43	46	169	finally
    //   48	53	169	finally
    //   55	59	169	finally
    //   92	95	169	finally
    //   97	102	169	finally
    //   104	108	169	finally
    //   110	115	169	finally
    //   27	31	173	java/lang/Exception
    //   43	46	173	java/lang/Exception
    //   48	53	173	java/lang/Exception
    //   92	95	173	java/lang/Exception
    //   97	102	173	java/lang/Exception
    //   55	59	181	java/lang/Exception
    //   104	108	191	java/lang/Exception
    //   110	115	191	java/lang/Exception
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/MessageForStructing.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */