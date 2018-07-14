package com.vvt.u;

import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class a
{
  private static final boolean a;
  private static final boolean b;
  
  static
  {
    boolean bool1 = true;
    boolean bool2 = com.vvt.ak.a.b;
    if (bool2)
    {
      bool2 = bool1;
      a = bool2;
      bool2 = com.vvt.ak.a.b;
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
  
  /* Error */
  public static byte[] a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +35 -> 36
    //   4: getstatic 14	com/vvt/u/a:a	Z
    //   7: istore_1
    //   8: iload_1
    //   9: ifeq +15 -> 24
    //   12: ldc 17
    //   14: astore_2
    //   15: ldc 19
    //   17: astore_3
    //   18: aload_2
    //   19: aload_3
    //   20: invokestatic 25	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   23: pop
    //   24: new 27	java/lang/IllegalArgumentException
    //   27: astore_2
    //   28: aload_2
    //   29: ldc 29
    //   31: invokespecial 33	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   34: aload_2
    //   35: athrow
    //   36: iconst_0
    //   37: istore 4
    //   39: aconst_null
    //   40: astore 5
    //   42: ldc 35
    //   44: astore_2
    //   45: aload_2
    //   46: invokestatic 41	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   49: astore_2
    //   50: new 43	java/io/FileInputStream
    //   53: astore_3
    //   54: aload_3
    //   55: aload_0
    //   56: invokespecial 44	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   59: sipush 10240
    //   62: istore 4
    //   64: iload 4
    //   66: newarray <illegal type>
    //   68: astore 5
    //   70: aload_3
    //   71: aload 5
    //   73: invokevirtual 49	java/io/FileInputStream:read	([B)I
    //   76: istore 6
    //   78: iload 6
    //   80: ifle +242 -> 322
    //   83: aconst_null
    //   84: astore 7
    //   86: aload_2
    //   87: aload 5
    //   89: iconst_0
    //   90: iload 6
    //   92: invokevirtual 53	java/security/MessageDigest:update	([BII)V
    //   95: goto -25 -> 70
    //   98: astore_2
    //   99: getstatic 15	com/vvt/u/a:removeFromPath	Z
    //   102: istore 4
    //   104: iload 4
    //   106: ifeq +61 -> 167
    //   109: ldc 17
    //   111: astore 5
    //   113: new 55	java/lang/StringBuilder
    //   116: astore 8
    //   118: aload 8
    //   120: invokespecial 58	java/lang/StringBuilder:<init>	()V
    //   123: ldc 60
    //   125: astore 7
    //   127: aload 8
    //   129: aload 7
    //   131: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: astore 8
    //   136: aload_2
    //   137: invokevirtual 70	java/security/NoSuchAlgorithmException:getMessage	()Ljava/lang/String;
    //   140: astore 7
    //   142: aload 8
    //   144: aload 7
    //   146: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: astore 8
    //   151: aload 8
    //   153: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   156: astore 8
    //   158: aload 5
    //   160: aload 8
    //   162: aload_2
    //   163: invokestatic 77	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   166: pop
    //   167: aload_2
    //   168: athrow
    //   169: astore_2
    //   170: aload_3
    //   171: astore 5
    //   173: aload 5
    //   175: invokestatic 82	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   178: aload_2
    //   179: athrow
    //   180: astore_2
    //   181: getstatic 15	com/vvt/u/a:removeFromPath	Z
    //   184: istore 9
    //   186: iload 9
    //   188: ifeq +59 -> 247
    //   191: ldc 17
    //   193: astore_3
    //   194: new 55	java/lang/StringBuilder
    //   197: astore 8
    //   199: aload 8
    //   201: invokespecial 58	java/lang/StringBuilder:<init>	()V
    //   204: ldc 84
    //   206: astore 7
    //   208: aload 8
    //   210: aload 7
    //   212: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   215: astore 8
    //   217: aload_2
    //   218: invokevirtual 87	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
    //   221: astore 7
    //   223: aload 8
    //   225: aload 7
    //   227: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: astore 8
    //   232: aload 8
    //   234: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   237: astore 8
    //   239: aload_3
    //   240: aload 8
    //   242: aload_2
    //   243: invokestatic 77	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   246: pop
    //   247: aload_2
    //   248: athrow
    //   249: astore_2
    //   250: goto -77 -> 173
    //   253: astore_2
    //   254: getstatic 15	com/vvt/u/a:removeFromPath	Z
    //   257: istore 9
    //   259: iload 9
    //   261: ifeq +59 -> 320
    //   264: ldc 17
    //   266: astore_3
    //   267: new 55	java/lang/StringBuilder
    //   270: astore 8
    //   272: aload 8
    //   274: invokespecial 58	java/lang/StringBuilder:<init>	()V
    //   277: ldc 89
    //   279: astore 7
    //   281: aload 8
    //   283: aload 7
    //   285: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   288: astore 8
    //   290: aload_2
    //   291: invokevirtual 92	java/io/IOException:getMessage	()Ljava/lang/String;
    //   294: astore 7
    //   296: aload 8
    //   298: aload 7
    //   300: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   303: astore 8
    //   305: aload 8
    //   307: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   310: astore 8
    //   312: aload_3
    //   313: aload 8
    //   315: aload_2
    //   316: invokestatic 77	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   319: pop
    //   320: aload_2
    //   321: athrow
    //   322: aload_3
    //   323: invokestatic 82	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   326: aload_2
    //   327: invokevirtual 96	java/security/MessageDigest:digest	()[B
    //   330: areturn
    //   331: astore_2
    //   332: aload_3
    //   333: astore 5
    //   335: goto -81 -> 254
    //   338: astore_2
    //   339: aload_3
    //   340: astore 5
    //   342: goto -161 -> 181
    //   345: astore_2
    //   346: iconst_0
    //   347: istore 9
    //   349: aconst_null
    //   350: astore_3
    //   351: goto -252 -> 99
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	354	0	paramString	String
    //   7	2	1	bool1	boolean
    //   14	73	2	localObject1	Object
    //   98	70	2	localNoSuchAlgorithmException1	NoSuchAlgorithmException
    //   169	10	2	localObject2	Object
    //   180	68	2	localFileNotFoundException1	java.io.FileNotFoundException
    //   249	1	2	localObject3	Object
    //   253	74	2	localIOException1	java.io.IOException
    //   331	1	2	localIOException2	java.io.IOException
    //   338	1	2	localFileNotFoundException2	java.io.FileNotFoundException
    //   345	1	2	localNoSuchAlgorithmException2	NoSuchAlgorithmException
    //   17	334	3	localObject4	Object
    //   37	28	4	i	int
    //   102	3	4	bool2	boolean
    //   40	301	5	localObject5	Object
    //   76	15	6	j	int
    //   84	215	7	str	String
    //   116	198	8	localObject6	Object
    //   184	164	9	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   64	68	98	java/security/NoSuchAlgorithmException
    //   71	76	98	java/security/NoSuchAlgorithmException
    //   90	95	98	java/security/NoSuchAlgorithmException
    //   64	68	169	finally
    //   71	76	169	finally
    //   90	95	169	finally
    //   99	102	169	finally
    //   113	116	169	finally
    //   118	123	169	finally
    //   129	134	169	finally
    //   136	140	169	finally
    //   144	149	169	finally
    //   151	156	169	finally
    //   162	167	169	finally
    //   167	169	169	finally
    //   45	49	180	java/io/FileNotFoundException
    //   50	53	180	java/io/FileNotFoundException
    //   55	59	180	java/io/FileNotFoundException
    //   45	49	249	finally
    //   50	53	249	finally
    //   55	59	249	finally
    //   181	184	249	finally
    //   194	197	249	finally
    //   199	204	249	finally
    //   210	215	249	finally
    //   217	221	249	finally
    //   225	230	249	finally
    //   232	237	249	finally
    //   242	247	249	finally
    //   247	249	249	finally
    //   254	257	249	finally
    //   267	270	249	finally
    //   272	277	249	finally
    //   283	288	249	finally
    //   290	294	249	finally
    //   298	303	249	finally
    //   305	310	249	finally
    //   315	320	249	finally
    //   320	322	249	finally
    //   45	49	253	java/io/IOException
    //   50	53	253	java/io/IOException
    //   55	59	253	java/io/IOException
    //   64	68	331	java/io/IOException
    //   71	76	331	java/io/IOException
    //   90	95	331	java/io/IOException
    //   64	68	338	java/io/FileNotFoundException
    //   71	76	338	java/io/FileNotFoundException
    //   90	95	338	java/io/FileNotFoundException
    //   45	49	345	java/security/NoSuchAlgorithmException
    //   50	53	345	java/security/NoSuchAlgorithmException
    //   55	59	345	java/security/NoSuchAlgorithmException
  }
  
  public static byte[] a(byte[] paramArrayOfByte)
  {
    String str1;
    if (paramArrayOfByte == null)
    {
      boolean bool1 = a;
      if (bool1)
      {
        localObject1 = "Md5Checksum";
        str1 = "> calculateMd5 # Input data is NULL";
        Log.w((String)localObject1, str1);
      }
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("Null input data is not allow");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = "MD5";
    try
    {
      localObject1 = MessageDigest.getInstance((String)localObject1);
      bool2 = false;
      str1 = null;
      int i = paramArrayOfByte.length;
      ((MessageDigest)localObject1).update(paramArrayOfByte, 0, i);
      return ((MessageDigest)localObject1).digest();
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      boolean bool2 = b;
      if (bool2)
      {
        str1 = "Md5Checksum";
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("> calculateMd5 # NoSuchAlgorithmException: ");
        String str2 = localNoSuchAlgorithmException.getMessage();
        localObject2 = str2;
        Log.e(str1, (String)localObject2, localNoSuchAlgorithmException);
      }
      throw localNoSuchAlgorithmException;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/u/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */