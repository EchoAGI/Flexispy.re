package com.vvt.license;

import com.vvt.base.a.b;
import com.vvt.io.d;
import com.vvt.license.exception.LicenseReadWriteException;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class c
{
  private static final boolean a = com.vvt.ak.a.e;
  private String b;
  
  c(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = "bai_anumat.dat";
    String str = String.format("%s/%s", arrayOfObject);
    this.b = str;
  }
  
  public LicenseCipherSet a()
  {
    localObject1 = null;
    int i = 2;
    try
    {
      Object localObject4 = a(i);
      localObject7 = new java/io/ObjectInputStream;
      Object localObject8 = new javax/crypto/CipherInputStream;
      BufferedInputStream localBufferedInputStream = new java/io/BufferedInputStream;
      FileInputStream localFileInputStream = new java/io/FileInputStream;
      String str = this.b;
      localFileInputStream.<init>(str);
      localBufferedInputStream.<init>(localFileInputStream);
      ((CipherInputStream)localObject8).<init>(localBufferedInputStream, (Cipher)localObject4);
      ((ObjectInputStream)localObject7).<init>((InputStream)localObject8);
      try
      {
        boolean bool = a;
        if (bool) {}
        LicenseReadWriteException localLicenseReadWriteException = new com/vvt/license/exception/LicenseReadWriteException;
        localLicenseReadWriteException.<init>();
        throw localLicenseReadWriteException;
      }
      finally
      {
        localObject7 = localObject1;
        localObject1 = localObject6;
        d.a((ObjectInputStream)localObject7);
      }
    }
    finally
    {
      try
      {
        localObject8 = new com/vvt/license/LicenseCipherSet;
        ((LicenseCipherSet)localObject8).<init>();
        localObject1 = ((ObjectInputStream)localObject7).readObject();
        localObject1 = (HashMap)localObject1;
        localObject4 = "configIdCipher";
        localObject4 = ((HashMap)localObject1).get(localObject4);
        localObject4 = (byte[])localObject4;
        ((LicenseCipherSet)localObject8).configIdCipher = ((byte[])localObject4);
        localObject4 = "md5Cipher";
        localObject4 = ((HashMap)localObject1).get(localObject4);
        localObject4 = (byte[])localObject4;
        ((LicenseCipherSet)localObject8).md5Cipher = ((byte[])localObject4);
        localObject4 = "activationCodeCipher";
        localObject4 = ((HashMap)localObject1).get(localObject4);
        localObject4 = (byte[])localObject4;
        ((LicenseCipherSet)localObject8).activationCodeCipher = ((byte[])localObject4);
        localObject4 = "licenseStatusCipher";
        localObject1 = ((HashMap)localObject1).get(localObject4);
        localObject1 = (byte[])localObject1;
        ((LicenseCipherSet)localObject8).licenseStatusCipher = ((byte[])localObject1);
        d.a((ObjectInputStream)localObject7);
        return (LicenseCipherSet)localObject8;
      }
      finally
      {
        for (;;)
        {
          Object localObject7;
          Object localObject3 = localObject7;
        }
      }
      localObject5 = finally;
    }
  }
  
  Cipher a(int paramInt)
  {
    Object localObject1 = b.a(com.vvt.base.a.a.q).getBytes();
    SecretKeySpec localSecretKeySpec = new javax/crypto/spec/SecretKeySpec;
    Object localObject2 = "AES";
    localSecretKeySpec.<init>((byte[])localObject1, (String)localObject2);
    int i = 2;
    if (paramInt == i) {}
    for (localObject1 = "DECRYPT_MODE";; localObject1 = "ENCRYPT_MODE")
    {
      boolean bool = a;
      if (bool) {}
      localObject1 = new byte[16];
      Object tmp53_52 = localObject1;
      Object tmp54_53 = tmp53_52;
      Object tmp54_53 = tmp53_52;
      tmp54_53[0] = 0;
      tmp54_53[1] = 1;
      Object tmp61_54 = tmp54_53;
      Object tmp61_54 = tmp54_53;
      tmp61_54[2] = 2;
      tmp61_54[3] = 3;
      Object tmp68_61 = tmp61_54;
      Object tmp68_61 = tmp61_54;
      tmp68_61[4] = 4;
      tmp68_61[5] = 5;
      Object tmp75_68 = tmp68_61;
      Object tmp75_68 = tmp68_61;
      tmp75_68[6] = 6;
      tmp75_68[7] = 7;
      Object tmp86_75 = tmp75_68;
      Object tmp86_75 = tmp75_68;
      tmp86_75[8] = 8;
      tmp86_75[9] = 9;
      Object tmp97_86 = tmp86_75;
      Object tmp97_86 = tmp86_75;
      tmp97_86[10] = 10;
      tmp97_86[11] = 11;
      Object tmp108_97 = tmp97_86;
      Object tmp108_97 = tmp97_86;
      tmp108_97[12] = 12;
      tmp108_97[13] = 13;
      tmp108_97[14] = 14;
      tmp108_97[15] = 15;
      localObject2 = new javax/crypto/spec/IvParameterSpec;
      ((IvParameterSpec)localObject2).<init>((byte[])localObject1);
      localObject1 = Cipher.getInstance("AES/CFB/NoPadding");
      ((Cipher)localObject1).init(paramInt, localSecretKeySpec, (AlgorithmParameterSpec)localObject2);
      return (Cipher)localObject1;
    }
  }
  
  /* Error */
  public boolean a(LicenseCipherSet paramLicenseCipherSet)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: new 138	java/io/File
    //   7: astore 4
    //   9: aload_0
    //   10: getfield 33	com/vvt/license/MyUncaughtExceptionHandler:removeFromPath	Ljava/lang/String;
    //   13: astore 5
    //   15: aload 4
    //   17: aload 5
    //   19: invokespecial 139	java/io/File:<init>	(Ljava/lang/String;)V
    //   22: aload 4
    //   24: invokevirtual 143	java/io/File:exists	()Z
    //   27: istore 6
    //   29: iload 6
    //   31: ifeq +9 -> 40
    //   34: aload 4
    //   36: invokevirtual 146	java/io/File:delete	()Z
    //   39: pop
    //   40: iconst_1
    //   41: istore 6
    //   43: aload_0
    //   44: iload 6
    //   46: invokevirtual 36	com/vvt/license/MyUncaughtExceptionHandler:a	(I)Ljavax/crypto/Cipher;
    //   49: astore 7
    //   51: new 63	java/util/HashMap
    //   54: astore 8
    //   56: aload 8
    //   58: invokespecial 147	java/util/HashMap:<init>	()V
    //   61: ldc 65
    //   63: astore 5
    //   65: aload_1
    //   66: getfield 73	com/vvt/license/LicenseCipherSet:configIdCipher	[B
    //   69: astore 9
    //   71: aload 8
    //   73: aload 5
    //   75: aload 9
    //   77: invokevirtual 151	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   80: pop
    //   81: ldc 75
    //   83: astore 5
    //   85: aload_1
    //   86: getfield 77	com/vvt/license/LicenseCipherSet:md5Cipher	[B
    //   89: astore 9
    //   91: aload 8
    //   93: aload 5
    //   95: aload 9
    //   97: invokevirtual 151	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   100: pop
    //   101: ldc 79
    //   103: astore 5
    //   105: aload_1
    //   106: getfield 81	com/vvt/license/LicenseCipherSet:activationCodeCipher	[B
    //   109: astore 9
    //   111: aload 8
    //   113: aload 5
    //   115: aload 9
    //   117: invokevirtual 151	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   120: pop
    //   121: ldc 83
    //   123: astore 5
    //   125: aload_1
    //   126: getfield 85	com/vvt/license/LicenseCipherSet:licenseStatusCipher	[B
    //   129: astore 9
    //   131: aload 8
    //   133: aload 5
    //   135: aload 9
    //   137: invokevirtual 151	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   140: pop
    //   141: new 153	java/io/ObjectOutputStream
    //   144: astore 5
    //   146: new 155	javax/crypto/CipherOutputStream
    //   149: astore 9
    //   151: new 157	java/io/BufferedOutputStream
    //   154: astore 10
    //   156: new 159	java/io/FileOutputStream
    //   159: astore 11
    //   161: aload 11
    //   163: aload 4
    //   165: invokespecial 162	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   168: aload 10
    //   170: aload 11
    //   172: invokespecial 165	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   175: aload 9
    //   177: aload 10
    //   179: aload 7
    //   181: invokespecial 168	javax/crypto/CipherOutputStream:<init>	(Ljava/io/OutputStream;Ljavax/crypto/Cipher;)V
    //   184: aload 5
    //   186: aload 9
    //   188: invokespecial 169	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   191: aload 5
    //   193: aload 8
    //   195: invokevirtual 173	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   198: aload 5
    //   200: invokevirtual 176	java/io/ObjectOutputStream:flush	()V
    //   203: aload 5
    //   205: invokestatic 179	com/vvt/io/d:a	(Ljava/io/ObjectOutputStream;)V
    //   208: iload_2
    //   209: ireturn
    //   210: astore 5
    //   212: getstatic 15	com/vvt/license/MyUncaughtExceptionHandler:a	Z
    //   215: istore 6
    //   217: iload 6
    //   219: ifeq +3 -> 222
    //   222: new 92	com/vvt/license/exception/LicenseReadWriteException
    //   225: astore 5
    //   227: aload 5
    //   229: invokespecial 93	com/vvt/license/exception/LicenseReadWriteException:<init>	()V
    //   232: aload 5
    //   234: athrow
    //   235: astore 12
    //   237: aload_3
    //   238: astore 5
    //   240: aload 12
    //   242: astore_3
    //   243: aload 5
    //   245: invokestatic 179	com/vvt/io/d:a	(Ljava/io/ObjectOutputStream;)V
    //   248: aload 12
    //   250: athrow
    //   251: astore_3
    //   252: aload 5
    //   254: astore_3
    //   255: goto -43 -> 212
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	258	0	this	MyUncaughtExceptionHandler
    //   0	258	1	paramLicenseCipherSet	LicenseCipherSet
    //   1	208	2	bool1	boolean
    //   3	240	3	localObject1	Object
    //   251	1	3	localObject2	Object
    //   254	1	3	localObject3	Object
    //   7	157	4	localFile	File
    //   13	191	5	localObject4	Object
    //   210	1	5	localObject5	Object
    //   225	28	5	localObject6	Object
    //   27	18	6	i	int
    //   215	3	6	bool2	boolean
    //   49	131	7	localCipher	Cipher
    //   54	140	8	localHashMap	HashMap
    //   69	118	9	localObject7	Object
    //   154	24	10	localBufferedOutputStream	java.io.BufferedOutputStream
    //   159	12	11	localFileOutputStream	java.io.FileOutputStream
    //   235	14	12	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   4	7	210	finally
    //   9	13	210	finally
    //   17	22	210	finally
    //   22	27	210	finally
    //   34	40	210	finally
    //   44	49	210	finally
    //   51	54	210	finally
    //   56	61	210	finally
    //   65	69	210	finally
    //   75	81	210	finally
    //   85	89	210	finally
    //   95	101	210	finally
    //   105	109	210	finally
    //   115	121	210	finally
    //   125	129	210	finally
    //   135	141	210	finally
    //   141	144	210	finally
    //   146	149	210	finally
    //   151	154	210	finally
    //   156	159	210	finally
    //   163	168	210	finally
    //   170	175	210	finally
    //   179	184	210	finally
    //   186	191	210	finally
    //   212	215	235	finally
    //   222	225	235	finally
    //   227	232	235	finally
    //   232	235	235	finally
    //   193	198	251	finally
    //   198	203	251	finally
  }
  
  public boolean b()
  {
    boolean bool1 = false;
    Object localObject = this.b;
    if (localObject != null)
    {
      localObject = new java/io/File;
      String str = this.b;
      ((File)localObject).<init>(str);
      boolean bool2 = ((File)localObject).exists();
      if (bool2)
      {
        boolean bool3 = ((File)localObject).delete();
        if (bool3) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public boolean c()
  {
    File localFile = new java/io/File;
    String str = this.b;
    localFile.<init>(str);
    return localFile.exists();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/license/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */