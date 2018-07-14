package com.vvt.l;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

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
  
  public static void a(SecretKey paramSecretKey, String paramString1, String paramString2)
  {
    c(paramSecretKey, paramString1, paramString2);
  }
  
  public static byte[] a(SecretKey paramSecretKey, byte[] paramArrayOfByte)
  {
    Object localObject1 = null;
    if ((paramSecretKey == null) || (paramArrayOfByte == null))
    {
      localObject2 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject2).<init>("input is null");
      throw ((Throwable)localObject2);
    }
    Object localObject2 = "AES/CBC/PKCS5Padding";
    try
    {
      localObject2 = Cipher.getInstance((String)localObject2);
      int i = 1;
      IvParameterSpec localIvParameterSpec = c();
      ((Cipher)localObject2).init(i, paramSecretKey, localIvParameterSpec);
      localObject2 = ((Cipher)localObject2).doFinal(paramArrayOfByte);
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      for (;;)
      {
        localObject2 = null;
      }
    }
    catch (NoSuchPaddingException localNoSuchPaddingException)
    {
      for (;;)
      {
        localObject2 = null;
      }
    }
    catch (InvalidKeyException localInvalidKeyException)
    {
      for (;;)
      {
        localObject2 = null;
      }
    }
    catch (InvalidAlgorithmParameterException localInvalidAlgorithmParameterException)
    {
      for (;;)
      {
        localObject2 = null;
      }
    }
    catch (IllegalBlockSizeException localIllegalBlockSizeException)
    {
      for (;;)
      {
        localObject2 = null;
      }
    }
    catch (BadPaddingException localBadPaddingException)
    {
      for (;;)
      {
        localObject2 = null;
      }
    }
    if (localObject1 != null) {
      throw ((Throwable)localObject1);
    }
    return (byte[])localObject2;
  }
  
  public static byte[] a(byte[] paramArrayOfByte)
  {
    Object localObject1 = e();
    byte[] arrayOfByte = new byte[8];
    byte[] tmp10_9 = arrayOfByte;
    byte[] tmp11_10 = tmp10_9;
    byte[] tmp11_10 = tmp10_9;
    tmp11_10[0] = -34;
    tmp11_10[1] = 51;
    byte[] tmp20_11 = tmp11_10;
    byte[] tmp20_11 = tmp11_10;
    tmp20_11[2] = 16;
    tmp20_11[3] = 18;
    byte[] tmp29_20 = tmp20_11;
    byte[] tmp29_20 = tmp20_11;
    tmp29_20[4] = -34;
    tmp29_20[5] = 51;
    tmp29_20[6] = 16;
    tmp29_20[7] = 18;
    Object localObject2 = SecretKeyFactory.getInstance(d());
    PBEKeySpec localPBEKeySpec = new javax/crypto/spec/PBEKeySpec;
    localPBEKeySpec.<init>((char[])localObject1);
    localObject1 = ((SecretKeyFactory)localObject2).generateSecret(localPBEKeySpec);
    localObject2 = Cipher.getInstance(d());
    PBEParameterSpec localPBEParameterSpec = new javax/crypto/spec/PBEParameterSpec;
    localPBEParameterSpec.<init>(arrayOfByte, 20);
    ((Cipher)localObject2).init(2, (Key)localObject1, localPBEParameterSpec);
    return ((Cipher)localObject2).doFinal(paramArrayOfByte);
  }
  
  public static void b(SecretKey paramSecretKey, String paramString1, String paramString2)
  {
    d(paramSecretKey, paramString1, paramString2);
  }
  
  public static byte[] b(SecretKey paramSecretKey, byte[] paramArrayOfByte)
  {
    Object localObject1 = null;
    if ((paramSecretKey == null) || (paramArrayOfByte == null))
    {
      localObject2 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject2).<init>("input is null");
      throw ((Throwable)localObject2);
    }
    Object localObject2 = "AES/CBC/PKCS5Padding";
    try
    {
      localObject2 = Cipher.getInstance((String)localObject2);
      int i = 2;
      IvParameterSpec localIvParameterSpec = c();
      ((Cipher)localObject2).init(i, paramSecretKey, localIvParameterSpec);
      localObject2 = ((Cipher)localObject2).doFinal(paramArrayOfByte);
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      for (;;)
      {
        localObject2 = null;
      }
    }
    catch (NoSuchPaddingException localNoSuchPaddingException)
    {
      for (;;)
      {
        localObject2 = null;
      }
    }
    catch (InvalidKeyException localInvalidKeyException)
    {
      for (;;)
      {
        localObject2 = null;
      }
    }
    catch (InvalidAlgorithmParameterException localInvalidAlgorithmParameterException)
    {
      for (;;)
      {
        localObject2 = null;
      }
    }
    catch (IllegalBlockSizeException localIllegalBlockSizeException)
    {
      for (;;)
      {
        localObject2 = null;
      }
    }
    catch (BadPaddingException localBadPaddingException)
    {
      for (;;)
      {
        localObject2 = null;
      }
    }
    if (localObject1 != null) {
      throw ((Throwable)localObject1);
    }
    return (byte[])localObject2;
  }
  
  private static IvParameterSpec c()
  {
    int i = 24;
    try
    {
      byte[] arrayOfByte = new byte[i];
      byte[] tmp8_7 = arrayOfByte;
      byte[] tmp9_8 = tmp8_7;
      byte[] tmp9_8 = tmp8_7;
      tmp9_8[0] = 50;
      tmp9_8[1] = 98;
      byte[] tmp18_9 = tmp9_8;
      byte[] tmp18_9 = tmp9_8;
      tmp18_9[2] = 44;
      tmp18_9[3] = 91;
      byte[] tmp27_18 = tmp18_9;
      byte[] tmp27_18 = tmp18_9;
      tmp27_18[4] = -100;
      tmp27_18[5] = 15;
      byte[] tmp36_27 = tmp27_18;
      byte[] tmp36_27 = tmp27_18;
      tmp36_27[6] = -79;
      tmp36_27[7] = -63;
      byte[] tmp47_36 = tmp36_27;
      byte[] tmp47_36 = tmp36_27;
      tmp47_36[8] = 60;
      tmp47_36[9] = -85;
      byte[] tmp58_47 = tmp47_36;
      byte[] tmp58_47 = tmp47_36;
      tmp58_47[10] = -23;
      tmp58_47[11] = -37;
      byte[] tmp69_58 = tmp58_47;
      byte[] tmp69_58 = tmp58_47;
      tmp69_58[12] = -23;
      tmp69_58[13] = 15;
      byte[] tmp80_69 = tmp69_58;
      byte[] tmp80_69 = tmp69_58;
      tmp80_69[14] = 14;
      tmp80_69[15] = 120;
      byte[] tmp91_80 = tmp80_69;
      byte[] tmp91_80 = tmp80_69;
      tmp91_80[16] = -17;
      tmp91_80[17] = 123;
      byte[] tmp102_91 = tmp91_80;
      byte[] tmp102_91 = tmp91_80;
      tmp102_91[18] = -40;
      tmp102_91[19] = -107;
      byte[] tmp113_102 = tmp102_91;
      byte[] tmp113_102 = tmp102_91;
      tmp113_102[20] = -43;
      tmp113_102[21] = 41;
      tmp113_102[22] = 122;
      tmp113_102[23] = 59;
      arrayOfByte = a(arrayOfByte);
      IvParameterSpec localIvParameterSpec = new javax/crypto/spec/IvParameterSpec;
      localIvParameterSpec.<init>(arrayOfByte);
      return localIvParameterSpec;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      throw localGeneralSecurityException;
    }
  }
  
  /* Error */
  private static void c(SecretKey paramSecretKey, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: getstatic 13	com/vvt/l/a:a	Z
    //   5: istore 4
    //   7: iload 4
    //   9: ifeq +3 -> 12
    //   12: new 104	java/io/FileInputStream
    //   15: astore 5
    //   17: aload 5
    //   19: aload_1
    //   20: invokespecial 105	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   23: new 107	java/io/FileOutputStream
    //   26: astore 6
    //   28: aload 6
    //   30: aload_2
    //   31: invokespecial 108	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   34: ldc 32
    //   36: astore 7
    //   38: aload 7
    //   40: invokestatic 38	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   43: astore 7
    //   45: iconst_1
    //   46: istore 8
    //   48: invokestatic 41	com/vvt/l/a:MyUncaughtExceptionHandler	()Ljavax/crypto/spec/IvParameterSpec;
    //   51: astore 9
    //   53: aload 7
    //   55: iload 8
    //   57: aload_0
    //   58: aload 9
    //   60: invokevirtual 45	javax/crypto/Cipher:init	(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    //   63: new 110	javax/crypto/CipherInputStream
    //   66: astore 10
    //   68: aload 10
    //   70: aload 5
    //   72: aload 7
    //   74: invokespecial 113	javax/crypto/CipherInputStream:<init>	(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V
    //   77: sipush 1024
    //   80: istore 4
    //   82: iload 4
    //   84: newarray <illegal type>
    //   86: astore_3
    //   87: aload 10
    //   89: aload_3
    //   90: invokevirtual 118	javax/crypto/CipherInputStream:read	([B)I
    //   93: istore 4
    //   95: iconst_m1
    //   96: istore 11
    //   98: iload 4
    //   100: iload 11
    //   102: if_icmpeq +82 -> 184
    //   105: iconst_0
    //   106: istore 11
    //   108: aconst_null
    //   109: astore 9
    //   111: aload 6
    //   113: aload_3
    //   114: iconst_0
    //   115: iload 4
    //   117: invokevirtual 122	java/io/FileOutputStream:write	([BII)V
    //   120: aload 10
    //   122: aload_3
    //   123: invokevirtual 118	javax/crypto/CipherInputStream:read	([B)I
    //   126: istore 4
    //   128: goto -33 -> 95
    //   131: astore 7
    //   133: iconst_0
    //   134: istore 8
    //   136: aconst_null
    //   137: astore 10
    //   139: aconst_null
    //   140: astore 6
    //   142: getstatic 18	com/vvt/l/a:removeFromPath	Z
    //   145: istore 12
    //   147: iload 12
    //   149: ifeq +3 -> 152
    //   152: aload 7
    //   154: athrow
    //   155: astore 7
    //   157: aload 6
    //   159: astore 5
    //   161: aload_3
    //   162: astore 6
    //   164: aload 10
    //   166: astore_3
    //   167: aload_3
    //   168: invokestatic 127	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   171: aload 5
    //   173: invokestatic 127	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   176: aload 6
    //   178: invokestatic 130	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   181: aload 7
    //   183: athrow
    //   184: aload 10
    //   186: invokestatic 127	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   189: aload 5
    //   191: invokestatic 127	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   194: aload 6
    //   196: invokestatic 130	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   199: getstatic 13	com/vvt/l/a:a	Z
    //   202: istore 4
    //   204: iload 4
    //   206: ifeq +3 -> 209
    //   209: return
    //   210: astore 7
    //   212: aconst_null
    //   213: astore 6
    //   215: iconst_0
    //   216: istore 12
    //   218: aconst_null
    //   219: astore 5
    //   221: goto -54 -> 167
    //   224: astore 7
    //   226: aconst_null
    //   227: astore 6
    //   229: goto -62 -> 167
    //   232: astore 7
    //   234: goto -67 -> 167
    //   237: astore 7
    //   239: aload 10
    //   241: astore_3
    //   242: goto -75 -> 167
    //   245: astore 7
    //   247: iconst_0
    //   248: istore 8
    //   250: aconst_null
    //   251: astore 10
    //   253: aload 5
    //   255: astore 6
    //   257: goto -115 -> 142
    //   260: astore 7
    //   262: iconst_0
    //   263: istore 8
    //   265: aconst_null
    //   266: astore 10
    //   268: aload 6
    //   270: astore_3
    //   271: aload 5
    //   273: astore 6
    //   275: goto -133 -> 142
    //   278: astore 7
    //   280: aload 6
    //   282: astore_3
    //   283: aload 5
    //   285: astore 6
    //   287: goto -145 -> 142
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	290	0	paramSecretKey	SecretKey
    //   0	290	1	paramString1	String
    //   0	290	2	paramString2	String
    //   1	282	3	localObject1	Object
    //   5	3	4	bool1	boolean
    //   80	47	4	i	int
    //   202	3	4	bool2	boolean
    //   15	269	5	localObject2	Object
    //   26	260	6	localObject3	Object
    //   36	37	7	localObject4	Object
    //   131	22	7	localException1	Exception
    //   155	27	7	localObject5	Object
    //   210	1	7	localObject6	Object
    //   224	1	7	localObject7	Object
    //   232	1	7	localObject8	Object
    //   237	1	7	localObject9	Object
    //   245	1	7	localException2	Exception
    //   260	1	7	localException3	Exception
    //   278	1	7	localException4	Exception
    //   46	218	8	j	int
    //   51	59	9	localIvParameterSpec	IvParameterSpec
    //   66	201	10	localCipherInputStream	javax.crypto.CipherInputStream
    //   96	11	11	k	int
    //   145	72	12	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   12	15	131	java/lang/Exception
    //   19	23	131	java/lang/Exception
    //   142	145	155	finally
    //   152	155	155	finally
    //   12	15	210	finally
    //   19	23	210	finally
    //   23	26	224	finally
    //   30	34	224	finally
    //   38	43	232	finally
    //   48	51	232	finally
    //   58	63	232	finally
    //   63	66	232	finally
    //   72	77	232	finally
    //   82	86	237	finally
    //   89	93	237	finally
    //   115	120	237	finally
    //   122	126	237	finally
    //   23	26	245	java/lang/Exception
    //   30	34	245	java/lang/Exception
    //   38	43	260	java/lang/Exception
    //   48	51	260	java/lang/Exception
    //   58	63	260	java/lang/Exception
    //   63	66	260	java/lang/Exception
    //   72	77	260	java/lang/Exception
    //   82	86	278	java/lang/Exception
    //   89	93	278	java/lang/Exception
    //   115	120	278	java/lang/Exception
    //   122	126	278	java/lang/Exception
  }
  
  private static String d()
  {
    i = 34;
    try
    {
      byte[] arrayOfByte = new byte[i];
      byte[] tmp8_7 = arrayOfByte;
      byte[] tmp9_8 = tmp8_7;
      byte[] tmp9_8 = tmp8_7;
      tmp9_8[0] = -1;
      tmp9_8[1] = -2;
      byte[] tmp17_9 = tmp9_8;
      byte[] tmp17_9 = tmp9_8;
      tmp17_9[2] = 80;
      tmp17_9[3] = 0;
      byte[] tmp25_17 = tmp17_9;
      byte[] tmp25_17 = tmp17_9;
      tmp25_17[4] = 66;
      tmp25_17[5] = 0;
      byte[] tmp33_25 = tmp25_17;
      byte[] tmp33_25 = tmp25_17;
      tmp33_25[6] = 69;
      tmp33_25[7] = 0;
      byte[] tmp43_33 = tmp33_25;
      byte[] tmp43_33 = tmp33_25;
      tmp43_33[8] = 87;
      tmp43_33[9] = 0;
      byte[] tmp53_43 = tmp43_33;
      byte[] tmp53_43 = tmp43_33;
      tmp53_43[10] = 105;
      tmp53_43[11] = 0;
      byte[] tmp63_53 = tmp53_43;
      byte[] tmp63_53 = tmp53_43;
      tmp63_53[12] = 116;
      tmp63_53[13] = 0;
      byte[] tmp73_63 = tmp63_53;
      byte[] tmp73_63 = tmp63_53;
      tmp73_63[14] = 104;
      tmp73_63[15] = 0;
      byte[] tmp83_73 = tmp73_63;
      byte[] tmp83_73 = tmp73_63;
      tmp83_73[16] = 77;
      tmp83_73[17] = 0;
      byte[] tmp93_83 = tmp83_73;
      byte[] tmp93_83 = tmp83_73;
      tmp93_83[18] = 68;
      tmp93_83[19] = 0;
      byte[] tmp103_93 = tmp93_83;
      byte[] tmp103_93 = tmp93_83;
      tmp103_93[20] = 53;
      tmp103_93[21] = 0;
      byte[] tmp113_103 = tmp103_93;
      byte[] tmp113_103 = tmp103_93;
      tmp113_103[22] = 65;
      tmp113_103[23] = 0;
      byte[] tmp123_113 = tmp113_103;
      byte[] tmp123_113 = tmp113_103;
      tmp123_113[24] = 110;
      tmp123_113[25] = 0;
      byte[] tmp133_123 = tmp123_113;
      byte[] tmp133_123 = tmp123_113;
      tmp133_123[26] = 100;
      tmp133_123[27] = 0;
      byte[] tmp143_133 = tmp133_123;
      byte[] tmp143_133 = tmp133_123;
      tmp143_133[28] = 68;
      tmp143_133[29] = 0;
      byte[] tmp153_143 = tmp143_133;
      byte[] tmp153_143 = tmp143_133;
      tmp153_143[30] = 69;
      tmp153_143[31] = 0;
      tmp153_143[32] = 83;
      tmp153_143[33] = 0;
      str1 = new java/lang/String;
      String str2 = "UTF-16";
      str1.<init>(arrayOfByte, str2);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        String str1;
        i = 0;
        Object localObject = null;
      }
    }
    return str1;
  }
  
  /* Error */
  private static void d(SecretKey paramSecretKey, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: getstatic 13	com/vvt/l/a:a	Z
    //   5: istore 4
    //   7: iload 4
    //   9: ifeq +3 -> 12
    //   12: new 104	java/io/FileInputStream
    //   15: astore 5
    //   17: aload 5
    //   19: aload_1
    //   20: invokespecial 105	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   23: new 107	java/io/FileOutputStream
    //   26: astore 6
    //   28: aload 6
    //   30: aload_2
    //   31: invokespecial 108	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   34: ldc 32
    //   36: astore 7
    //   38: aload 7
    //   40: invokestatic 38	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   43: astore 7
    //   45: iconst_2
    //   46: istore 8
    //   48: invokestatic 41	com/vvt/l/a:MyUncaughtExceptionHandler	()Ljavax/crypto/spec/IvParameterSpec;
    //   51: astore 9
    //   53: aload 7
    //   55: iload 8
    //   57: aload_0
    //   58: aload 9
    //   60: invokevirtual 45	javax/crypto/Cipher:init	(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    //   63: new 110	javax/crypto/CipherInputStream
    //   66: astore 10
    //   68: aload 10
    //   70: aload 5
    //   72: aload 7
    //   74: invokespecial 113	javax/crypto/CipherInputStream:<init>	(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V
    //   77: sipush 1024
    //   80: istore 4
    //   82: iload 4
    //   84: newarray <illegal type>
    //   86: astore_3
    //   87: aload 10
    //   89: aload_3
    //   90: invokevirtual 118	javax/crypto/CipherInputStream:read	([B)I
    //   93: istore 4
    //   95: iconst_m1
    //   96: istore 11
    //   98: iload 4
    //   100: iload 11
    //   102: if_icmpeq +72 -> 174
    //   105: iconst_0
    //   106: istore 11
    //   108: aconst_null
    //   109: astore 9
    //   111: aload 6
    //   113: aload_3
    //   114: iconst_0
    //   115: iload 4
    //   117: invokevirtual 122	java/io/FileOutputStream:write	([BII)V
    //   120: aload 10
    //   122: aload_3
    //   123: invokevirtual 118	javax/crypto/CipherInputStream:read	([B)I
    //   126: istore 4
    //   128: goto -33 -> 95
    //   131: astore 7
    //   133: iconst_0
    //   134: istore 8
    //   136: aconst_null
    //   137: astore 10
    //   139: aconst_null
    //   140: astore 6
    //   142: aload 7
    //   144: athrow
    //   145: astore 7
    //   147: aload 6
    //   149: astore 5
    //   151: aload_3
    //   152: astore 6
    //   154: aload 10
    //   156: astore_3
    //   157: aload_3
    //   158: invokestatic 127	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   161: aload 5
    //   163: invokestatic 127	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   166: aload 6
    //   168: invokestatic 130	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   171: aload 7
    //   173: athrow
    //   174: aload 10
    //   176: invokestatic 127	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   179: aload 5
    //   181: invokestatic 127	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   184: aload 6
    //   186: invokestatic 130	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   189: getstatic 13	com/vvt/l/a:a	Z
    //   192: istore 4
    //   194: iload 4
    //   196: ifeq +3 -> 199
    //   199: return
    //   200: astore 7
    //   202: aconst_null
    //   203: astore 6
    //   205: aconst_null
    //   206: astore 5
    //   208: goto -51 -> 157
    //   211: astore 7
    //   213: aconst_null
    //   214: astore 6
    //   216: goto -59 -> 157
    //   219: astore 7
    //   221: goto -64 -> 157
    //   224: astore 7
    //   226: aload 10
    //   228: astore_3
    //   229: goto -72 -> 157
    //   232: astore 7
    //   234: iconst_0
    //   235: istore 8
    //   237: aconst_null
    //   238: astore 10
    //   240: aload 5
    //   242: astore 6
    //   244: goto -102 -> 142
    //   247: astore 7
    //   249: iconst_0
    //   250: istore 8
    //   252: aconst_null
    //   253: astore 10
    //   255: aload 6
    //   257: astore_3
    //   258: aload 5
    //   260: astore 6
    //   262: goto -120 -> 142
    //   265: astore 7
    //   267: aload 6
    //   269: astore_3
    //   270: aload 5
    //   272: astore 6
    //   274: goto -132 -> 142
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	277	0	paramSecretKey	SecretKey
    //   0	277	1	paramString1	String
    //   0	277	2	paramString2	String
    //   1	269	3	localObject1	Object
    //   5	3	4	bool1	boolean
    //   80	47	4	i	int
    //   192	3	4	bool2	boolean
    //   15	256	5	localObject2	Object
    //   26	247	6	localObject3	Object
    //   36	37	7	localObject4	Object
    //   131	12	7	localException1	Exception
    //   145	27	7	localObject5	Object
    //   200	1	7	localObject6	Object
    //   211	1	7	localObject7	Object
    //   219	1	7	localObject8	Object
    //   224	1	7	localObject9	Object
    //   232	1	7	localException2	Exception
    //   247	1	7	localException3	Exception
    //   265	1	7	localException4	Exception
    //   46	205	8	j	int
    //   51	59	9	localIvParameterSpec	IvParameterSpec
    //   66	188	10	localCipherInputStream	javax.crypto.CipherInputStream
    //   96	11	11	k	int
    // Exception table:
    //   from	to	target	type
    //   12	15	131	java/lang/Exception
    //   19	23	131	java/lang/Exception
    //   142	145	145	finally
    //   12	15	200	finally
    //   19	23	200	finally
    //   23	26	211	finally
    //   30	34	211	finally
    //   38	43	219	finally
    //   48	51	219	finally
    //   58	63	219	finally
    //   63	66	219	finally
    //   72	77	219	finally
    //   82	86	224	finally
    //   89	93	224	finally
    //   115	120	224	finally
    //   122	126	224	finally
    //   23	26	232	java/lang/Exception
    //   30	34	232	java/lang/Exception
    //   38	43	247	java/lang/Exception
    //   48	51	247	java/lang/Exception
    //   58	63	247	java/lang/Exception
    //   63	66	247	java/lang/Exception
    //   72	77	247	java/lang/Exception
    //   82	86	265	java/lang/Exception
    //   89	93	265	java/lang/Exception
    //   115	120	265	java/lang/Exception
    //   122	126	265	java/lang/Exception
  }
  
  private static char[] e()
  {
    char[] arrayOfChar = new char[21];
    arrayOfChar[0] = 101;
    arrayOfChar[1] = 110;
    arrayOfChar[2] = 102;
    arrayOfChar[3] = 108;
    arrayOfChar[4] = 100;
    arrayOfChar[5] = 115;
    arrayOfChar[6] = 103;
    arrayOfChar[7] = 98;
    arrayOfChar[8] = 110;
    arrayOfChar[9] = 108;
    arrayOfChar[10] = 115;
    arrayOfChar[11] = 110;
    arrayOfChar[12] = 103;
    arrayOfChar[13] = 100;
    arrayOfChar[14] = 108;
    arrayOfChar[15] = 107;
    arrayOfChar[16] = 115;
    arrayOfChar[17] = 100;
    arrayOfChar[18] = 115;
    arrayOfChar[19] = 103;
    arrayOfChar[20] = 109;
    return arrayOfChar;
  }
  
  protected void a(b paramb, int paramInt, Object... paramVarArgs)
  {
    Object localObject = null;
    b(paramb);
    switch (paramInt)
    {
    }
    for (;;)
    {
      return;
      paramb = (d)paramb;
      localObject = (Exception)paramVarArgs[0];
      paramb.a((Exception)localObject);
      continue;
      paramb = (d)paramb;
      localObject = (String)paramVarArgs[0];
      paramb.a((String)localObject);
      continue;
      paramb = (c)paramb;
      localObject = (Exception)paramVarArgs[0];
      paramb.a((Exception)localObject);
      continue;
      paramb = (c)paramb;
      localObject = (String)paramVarArgs[0];
      paramb.a((String)localObject);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/l/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */