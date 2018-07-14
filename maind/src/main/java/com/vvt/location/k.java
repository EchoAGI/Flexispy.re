package com.vvt.location;

import android.location.Location;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.vvt.ak.a;
import java.io.DataOutputStream;
import java.io.OutputStream;

public class k
{
  private static final boolean a = a.b;
  private static final boolean b = a.e;
  
  public static int a(TelephonyManager paramTelephonyManager)
  {
    i = -1;
    for (;;)
    {
      try
      {
        localObject = paramTelephonyManager.getCellLocation();
        bool = localObject instanceof CdmaCellLocation;
        if (!bool) {
          continue;
        }
        localObject = (CdmaCellLocation)localObject;
        j = ((CdmaCellLocation)localObject).getBaseStationId();
      }
      catch (Exception localException)
      {
        Object localObject;
        boolean bool;
        int j = i;
        continue;
        j = i;
        continue;
      }
      return j;
      bool = localObject instanceof GsmCellLocation;
      if (!bool) {
        continue;
      }
      localObject = (GsmCellLocation)localObject;
      j = ((GsmCellLocation)localObject).getCid();
    }
  }
  
  /* Error */
  private static Location a()
  {
    // Byte code:
    //   0: getstatic 13	com/vvt/location/k:a	Z
    //   3: istore_0
    //   4: iload_0
    //   5: ifeq +3 -> 8
    //   8: iconst_0
    //   9: istore_1
    //   10: ldc 38
    //   12: astore_2
    //   13: aload_2
    //   14: invokestatic 44	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   17: astore_2
    //   18: aload_2
    //   19: invokevirtual 48	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   22: astore_3
    //   23: ldc 50
    //   25: astore 4
    //   27: aconst_null
    //   28: astore 5
    //   30: iconst_0
    //   31: anewarray 40	java/lang/Class
    //   34: astore 5
    //   36: aload_2
    //   37: aload 4
    //   39: aload 5
    //   41: invokevirtual 54	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   44: astore 4
    //   46: ldc 56
    //   48: astore 5
    //   50: aconst_null
    //   51: astore 6
    //   53: iconst_0
    //   54: anewarray 40	java/lang/Class
    //   57: astore 6
    //   59: aload_2
    //   60: aload 5
    //   62: aload 6
    //   64: invokevirtual 54	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   67: astore 5
    //   69: iconst_0
    //   70: istore_0
    //   71: aconst_null
    //   72: astore_2
    //   73: iconst_0
    //   74: anewarray 4	java/lang/Object
    //   77: astore_2
    //   78: aload 4
    //   80: aload_3
    //   81: aload_2
    //   82: invokevirtual 62	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   85: astore_2
    //   86: aload_2
    //   87: checkcast 64	java/lang/Integer
    //   90: astore_2
    //   91: aload_2
    //   92: invokevirtual 67	java/lang/Integer:intValue	()I
    //   95: istore 7
    //   97: iconst_0
    //   98: istore_0
    //   99: aconst_null
    //   100: astore_2
    //   101: iconst_0
    //   102: anewarray 4	java/lang/Object
    //   105: astore_2
    //   106: aload 5
    //   108: aload_3
    //   109: aload_2
    //   110: invokevirtual 62	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   113: astore_2
    //   114: aload_2
    //   115: checkcast 64	java/lang/Integer
    //   118: astore_2
    //   119: aload_2
    //   120: invokevirtual 67	java/lang/Integer:intValue	()I
    //   123: istore 8
    //   125: getstatic 13	com/vvt/location/k:a	Z
    //   128: istore_0
    //   129: iload_0
    //   130: ifeq +3 -> 133
    //   133: bipush -90
    //   135: istore_0
    //   136: iload 7
    //   138: iload_0
    //   139: if_icmple +98 -> 237
    //   142: bipush 90
    //   144: istore_0
    //   145: iload 7
    //   147: iload_0
    //   148: if_icmpge +89 -> 237
    //   151: sipush 65356
    //   154: istore_0
    //   155: iload 8
    //   157: iload_0
    //   158: if_icmple +79 -> 237
    //   161: sipush 180
    //   164: istore_0
    //   165: iload 8
    //   167: iload_0
    //   168: if_icmpge +69 -> 237
    //   171: new 71	android/location/Location
    //   174: astore_2
    //   175: ldc 73
    //   177: astore 5
    //   179: aload_2
    //   180: aload 5
    //   182: invokespecial 77	android/location/Location:<init>	(Ljava/lang/String;)V
    //   185: iload 7
    //   187: i2d
    //   188: dstore 9
    //   190: aload_2
    //   191: dload 9
    //   193: invokevirtual 81	android/location/Location:setLatitude	(D)V
    //   196: iload 8
    //   198: i2d
    //   199: dstore 11
    //   201: aload_2
    //   202: dload 11
    //   204: invokevirtual 84	android/location/Location:setLongitude	(D)V
    //   207: getstatic 13	com/vvt/location/k:a	Z
    //   210: istore_1
    //   211: iload_1
    //   212: ifeq +3 -> 215
    //   215: aload_2
    //   216: areturn
    //   217: astore_2
    //   218: iconst_0
    //   219: istore_0
    //   220: aconst_null
    //   221: astore_2
    //   222: getstatic 17	com/vvt/location/k:removeFromPath	Z
    //   225: istore_1
    //   226: iload_1
    //   227: ifeq -20 -> 207
    //   230: goto -23 -> 207
    //   233: pop
    //   234: goto -12 -> 222
    //   237: iconst_0
    //   238: istore_0
    //   239: aconst_null
    //   240: astore_2
    //   241: goto -34 -> 207
    // Local variable table:
    //   start	length	slot	name	signature
    //   3	127	0	bool1	boolean
    //   135	104	0	i	int
    //   9	218	1	bool2	boolean
    //   12	204	2	localObject1	Object
    //   217	1	2	localException1	Exception
    //   221	20	2	localObject2	Object
    //   22	87	3	localObject3	Object
    //   25	54	4	localObject4	Object
    //   28	153	5	localObject5	Object
    //   51	12	6	arrayOfClass	Class[]
    //   95	91	7	j	int
    //   123	74	8	k	int
    //   188	4	9	d1	double
    //   199	4	11	d2	double
    //   233	1	14	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   13	17	217	java/lang/Exception
    //   18	22	217	java/lang/Exception
    //   30	34	217	java/lang/Exception
    //   39	44	217	java/lang/Exception
    //   53	57	217	java/lang/Exception
    //   62	67	217	java/lang/Exception
    //   73	77	217	java/lang/Exception
    //   81	85	217	java/lang/Exception
    //   86	90	217	java/lang/Exception
    //   91	95	217	java/lang/Exception
    //   101	105	217	java/lang/Exception
    //   109	113	217	java/lang/Exception
    //   114	118	217	java/lang/Exception
    //   119	123	217	java/lang/Exception
    //   125	128	217	java/lang/Exception
    //   171	174	217	java/lang/Exception
    //   180	185	217	java/lang/Exception
    //   191	196	233	java/lang/Exception
    //   202	207	233	java/lang/Exception
  }
  
  /* Error */
  private static Location a(TelephonyManager paramTelephonyManager, GsmCellLocation paramGsmCellLocation)
  {
    // Byte code:
    //   0: ldc2_w 87
    //   3: dstore_2
    //   4: getstatic 13	com/vvt/location/k:a	Z
    //   7: istore 4
    //   9: iload 4
    //   11: ifeq +3 -> 14
    //   14: iconst_0
    //   15: istore 4
    //   17: aconst_null
    //   18: astore 5
    //   20: aload_0
    //   21: invokevirtual 92	android/telephony/TelephonyManager:getNetworkOperator	()Ljava/lang/String;
    //   24: astore 6
    //   26: aload_1
    //   27: invokevirtual 34	android/telephony/gsm/GsmCellLocation:getCid	()I
    //   30: istore 7
    //   32: aload_1
    //   33: invokevirtual 95	android/telephony/gsm/GsmCellLocation:getLac	()I
    //   36: istore 8
    //   38: iconst_0
    //   39: istore 9
    //   41: aconst_null
    //   42: astore 10
    //   44: iconst_3
    //   45: istore 11
    //   47: aload 6
    //   49: iconst_0
    //   50: iload 11
    //   52: invokevirtual 102	java/lang/String:substring	(II)Ljava/lang/String;
    //   55: astore 10
    //   57: aload 10
    //   59: invokestatic 106	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   62: istore 9
    //   64: iconst_3
    //   65: istore 11
    //   67: aload 6
    //   69: iload 11
    //   71: invokevirtual 109	java/lang/String:substring	(I)Ljava/lang/String;
    //   74: astore 6
    //   76: aload 6
    //   78: invokestatic 106	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   81: istore 12
    //   83: getstatic 13	com/vvt/location/k:a	Z
    //   86: istore 11
    //   88: iload 11
    //   90: ifeq +3 -> 93
    //   93: new 111	java/io/ByteArrayOutputStream
    //   96: astore 13
    //   98: aload 13
    //   100: invokespecial 114	java/io/ByteArrayOutputStream:<init>	()V
    //   103: aload 13
    //   105: iload 7
    //   107: iload 8
    //   109: iload 9
    //   111: iload 12
    //   113: invokestatic 117	com/vvt/location/k:a	(Ljava/io/OutputStream;IIII)V
    //   116: aload 13
    //   118: invokevirtual 121	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   121: astore 6
    //   123: new 123	android/os/ConditionVariable
    //   126: astore 14
    //   128: iconst_0
    //   129: istore 8
    //   131: aconst_null
    //   132: astore 15
    //   134: aload 14
    //   136: iconst_0
    //   137: invokespecial 126	android/os/ConditionVariable:<init>	(Z)V
    //   140: new 128	com/vvt/http/request/removeFromPath
    //   143: astore 15
    //   145: aload 15
    //   147: invokespecial 129	com/vvt/http/request/removeFromPath:<init>	()V
    //   150: ldc -126
    //   152: istore 9
    //   154: aload 15
    //   156: iload 9
    //   158: invokevirtual 134	com/vvt/http/request/removeFromPath:a	(I)V
    //   161: getstatic 140	com/vvt/http/request/ContentType:BINARY_OCTET_STREAM	Lcom/vvt/http/request/ContentType;
    //   164: astore 10
    //   166: aload 15
    //   168: aload 10
    //   170: invokevirtual 143	com/vvt/http/request/removeFromPath:a	(Lcom/vvt/http/request/ContentType;)V
    //   173: getstatic 149	com/vvt/http/request/MethodType:POST	Lcom/vvt/http/request/MethodType;
    //   176: astore 10
    //   178: aload 15
    //   180: aload 10
    //   182: invokevirtual 152	com/vvt/http/request/removeFromPath:a	(Lcom/vvt/http/request/MethodType;)V
    //   185: ldc -102
    //   187: astore 10
    //   189: invokestatic 156	com/vvt/location/k:removeFromPath	()Ljava/lang/String;
    //   192: astore 13
    //   194: aload 15
    //   196: aload 10
    //   198: aload 13
    //   200: invokevirtual 159	com/vvt/http/request/removeFromPath:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   203: ldc -95
    //   205: astore 10
    //   207: aload 15
    //   209: aload 10
    //   211: invokevirtual 163	com/vvt/http/request/removeFromPath:removeFromPath	(Ljava/lang/String;)V
    //   214: aload 15
    //   216: aload 6
    //   218: invokevirtual 166	com/vvt/http/request/removeFromPath:a	([B)V
    //   221: new 168	com/vvt/location/l
    //   224: astore 10
    //   226: aload 10
    //   228: aload 14
    //   230: invokespecial 171	com/vvt/location/l:<init>	(Landroid/os/ConditionVariable;)V
    //   233: getstatic 13	com/vvt/location/k:a	Z
    //   236: istore 12
    //   238: iload 12
    //   240: ifeq +3 -> 243
    //   243: new 173	com/vvt/location/m
    //   246: astore 6
    //   248: aload 6
    //   250: aload 15
    //   252: aload 10
    //   254: invokespecial 176	com/vvt/location/m:<init>	(Lcom/vvt/http/request/removeFromPath;Lcom/vvt/http/d;)V
    //   257: aload 6
    //   259: invokevirtual 179	com/vvt/location/m:start	()V
    //   262: ldc2_w 180
    //   265: lstore 16
    //   267: aload 14
    //   269: lload 16
    //   271: invokevirtual 187	android/os/ConditionVariable:block	(J)Z
    //   274: pop
    //   275: getstatic 13	com/vvt/location/k:a	Z
    //   278: istore 7
    //   280: iload 7
    //   282: ifeq +3 -> 285
    //   285: aload 6
    //   287: invokevirtual 189	com/vvt/location/m:a	()V
    //   290: iconst_m1
    //   291: istore 12
    //   293: aload 10
    //   295: invokevirtual 192	com/vvt/location/l:removeFromPath	()Lcom/vvt/http/a/a;
    //   298: astore 14
    //   300: aload 10
    //   302: invokevirtual 195	com/vvt/location/l:a	()Ljava/lang/Exception;
    //   305: astore 15
    //   307: aload 14
    //   309: ifnull +20 -> 329
    //   312: aload 14
    //   314: invokevirtual 200	com/vvt/http/a/a:MyUncaughtExceptionHandler	()I
    //   317: istore 12
    //   319: getstatic 13	com/vvt/location/k:a	Z
    //   322: istore 9
    //   324: iload 9
    //   326: ifeq +3 -> 329
    //   329: aload 15
    //   331: ifnull +13 -> 344
    //   334: getstatic 13	com/vvt/location/k:a	Z
    //   337: istore 8
    //   339: iload 8
    //   341: ifeq +3 -> 344
    //   344: sipush 200
    //   347: istore 8
    //   349: iload 12
    //   351: iload 8
    //   353: if_icmpne +153 -> 506
    //   356: aload 14
    //   358: ifnull +148 -> 506
    //   361: aload 14
    //   363: invokevirtual 204	com/vvt/http/a/a:d	()[B
    //   366: astore 6
    //   368: new 206	java/io/ByteArrayInputStream
    //   371: astore 14
    //   373: aload 14
    //   375: aload 6
    //   377: invokespecial 208	java/io/ByteArrayInputStream:<init>	([B)V
    //   380: new 210	java/io/DataInputStream
    //   383: astore 15
    //   385: aload 15
    //   387: aload 14
    //   389: invokespecial 213	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   392: aload 15
    //   394: invokevirtual 217	java/io/DataInputStream:readShort	()S
    //   397: pop
    //   398: aload 15
    //   400: invokevirtual 221	java/io/DataInputStream:readByte	()B
    //   403: pop
    //   404: aload 15
    //   406: invokevirtual 224	java/io/DataInputStream:readInt	()I
    //   409: istore 12
    //   411: iload 12
    //   413: ifne +83 -> 496
    //   416: aload 15
    //   418: invokevirtual 224	java/io/DataInputStream:readInt	()I
    //   421: istore 12
    //   423: iload 12
    //   425: i2d
    //   426: dstore 18
    //   428: dload 18
    //   430: dload_2
    //   431: ddiv
    //   432: dstore 20
    //   434: aload 15
    //   436: invokevirtual 224	java/io/DataInputStream:readInt	()I
    //   439: istore 12
    //   441: iload 12
    //   443: i2d
    //   444: dstore 18
    //   446: dload 18
    //   448: dload_2
    //   449: ddiv
    //   450: dstore 22
    //   452: getstatic 13	com/vvt/location/k:a	Z
    //   455: istore 12
    //   457: iload 12
    //   459: ifeq +3 -> 462
    //   462: new 71	android/location/Location
    //   465: astore 6
    //   467: ldc 73
    //   469: astore 14
    //   471: aload 6
    //   473: aload 14
    //   475: invokespecial 77	android/location/Location:<init>	(Ljava/lang/String;)V
    //   478: aload 6
    //   480: dload 20
    //   482: invokevirtual 81	android/location/Location:setLatitude	(D)V
    //   485: aload 6
    //   487: dload 22
    //   489: invokevirtual 84	android/location/Location:setLongitude	(D)V
    //   492: aload 6
    //   494: astore 5
    //   496: aload 15
    //   498: ifnull +8 -> 506
    //   501: aload 15
    //   503: invokevirtual 227	java/io/DataInputStream:close	()V
    //   506: aload 5
    //   508: areturn
    //   509: astore 6
    //   511: getstatic 17	com/vvt/location/k:removeFromPath	Z
    //   514: istore 12
    //   516: iload 12
    //   518: ifeq -12 -> 506
    //   521: goto -15 -> 506
    //   524: astore 6
    //   526: goto -20 -> 506
    //   529: astore 5
    //   531: aload 6
    //   533: astore 5
    //   535: goto -24 -> 511
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	538	0	paramTelephonyManager	TelephonyManager
    //   0	538	1	paramGsmCellLocation	GsmCellLocation
    //   3	446	2	d1	double
    //   7	9	4	bool1	boolean
    //   18	489	5	localObject1	Object
    //   529	1	5	localException1	Exception
    //   533	1	5	localObject2	Object
    //   24	469	6	localObject3	Object
    //   509	1	6	localException2	Exception
    //   524	8	6	localException3	Exception
    //   30	76	7	i	int
    //   278	3	7	bool2	boolean
    //   36	94	8	j	int
    //   337	3	8	bool3	boolean
    //   347	7	8	k	int
    //   39	118	9	m	int
    //   322	3	9	bool4	boolean
    //   42	259	10	localObject4	Object
    //   45	25	11	n	int
    //   86	3	11	bool5	boolean
    //   81	31	12	i1	int
    //   236	3	12	bool6	boolean
    //   291	151	12	i2	int
    //   455	62	12	bool7	boolean
    //   96	103	13	localObject5	Object
    //   126	348	14	localObject6	Object
    //   132	370	15	localObject7	Object
    //   265	5	16	l	long
    //   426	21	18	d2	double
    //   432	49	20	d3	double
    //   450	38	22	d4	double
    // Exception table:
    //   from	to	target	type
    //   20	24	509	java/lang/Exception
    //   26	30	509	java/lang/Exception
    //   32	36	509	java/lang/Exception
    //   50	55	509	java/lang/Exception
    //   57	62	509	java/lang/Exception
    //   69	74	509	java/lang/Exception
    //   76	81	509	java/lang/Exception
    //   83	86	509	java/lang/Exception
    //   93	96	509	java/lang/Exception
    //   98	103	509	java/lang/Exception
    //   111	116	509	java/lang/Exception
    //   116	121	509	java/lang/Exception
    //   123	126	509	java/lang/Exception
    //   136	140	509	java/lang/Exception
    //   140	143	509	java/lang/Exception
    //   145	150	509	java/lang/Exception
    //   156	161	509	java/lang/Exception
    //   161	164	509	java/lang/Exception
    //   168	173	509	java/lang/Exception
    //   173	176	509	java/lang/Exception
    //   180	185	509	java/lang/Exception
    //   189	192	509	java/lang/Exception
    //   198	203	509	java/lang/Exception
    //   209	214	509	java/lang/Exception
    //   216	221	509	java/lang/Exception
    //   221	224	509	java/lang/Exception
    //   228	233	509	java/lang/Exception
    //   233	236	509	java/lang/Exception
    //   243	246	509	java/lang/Exception
    //   252	257	509	java/lang/Exception
    //   257	262	509	java/lang/Exception
    //   269	275	509	java/lang/Exception
    //   275	278	509	java/lang/Exception
    //   285	290	509	java/lang/Exception
    //   293	298	509	java/lang/Exception
    //   300	305	509	java/lang/Exception
    //   312	317	509	java/lang/Exception
    //   319	322	509	java/lang/Exception
    //   334	337	509	java/lang/Exception
    //   361	366	509	java/lang/Exception
    //   368	371	509	java/lang/Exception
    //   375	380	509	java/lang/Exception
    //   380	383	509	java/lang/Exception
    //   387	392	509	java/lang/Exception
    //   392	398	509	java/lang/Exception
    //   398	404	509	java/lang/Exception
    //   404	409	509	java/lang/Exception
    //   416	421	509	java/lang/Exception
    //   434	439	509	java/lang/Exception
    //   452	455	509	java/lang/Exception
    //   462	465	509	java/lang/Exception
    //   473	478	509	java/lang/Exception
    //   501	506	524	java/lang/Exception
    //   480	485	529	java/lang/Exception
    //   487	492	529	java/lang/Exception
  }
  
  private static void a(OutputStream paramOutputStream, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    DataOutputStream localDataOutputStream = new java/io/DataOutputStream;
    localDataOutputStream.<init>(paramOutputStream);
    localDataOutputStream.writeShort(14);
    long l = 0L;
    localDataOutputStream.writeLong(l);
    localDataOutputStream.writeInt(0);
    localDataOutputStream.writeShort(0);
    localDataOutputStream.writeByte(27);
    localDataOutputStream.writeInt(paramInt4);
    localDataOutputStream.writeInt(paramInt3);
    int i = 65536;
    if (paramInt1 > i)
    {
      i = 5;
      localDataOutputStream.writeInt(i);
    }
    for (;;)
    {
      localDataOutputStream.writeShort(0);
      localDataOutputStream.writeInt(paramInt1);
      localDataOutputStream.writeInt(paramInt2);
      localDataOutputStream.writeInt(paramInt4);
      localDataOutputStream.writeInt(paramInt3);
      localDataOutputStream.writeInt(-1);
      localDataOutputStream.writeInt(0);
      localDataOutputStream.flush();
      localDataOutputStream.close();
      return;
      i = 3;
      localDataOutputStream.writeInt(i);
    }
  }
  
  public static int b(TelephonyManager paramTelephonyManager)
  {
    i = -1;
    for (;;)
    {
      try
      {
        localObject = paramTelephonyManager.getCellLocation();
        bool = localObject instanceof CdmaCellLocation;
        if (!bool) {
          continue;
        }
        localObject = (CdmaCellLocation)localObject;
        j = ((CdmaCellLocation)localObject).getNetworkId();
      }
      catch (Exception localException)
      {
        Object localObject;
        boolean bool;
        int j = i;
        continue;
        j = i;
        continue;
      }
      return j;
      bool = localObject instanceof GsmCellLocation;
      if (!bool) {
        continue;
      }
      localObject = (GsmCellLocation)localObject;
      j = ((GsmCellLocation)localObject).getLac();
    }
  }
  
  private static String b()
  {
    Object[] arrayOfObject = new Object[2];
    String str = Build.DEVICE;
    arrayOfObject[0] = str;
    str = Build.MODEL;
    arrayOfObject[1] = str;
    return String.format("android:%s-%s", arrayOfObject);
  }
  
  public static int c(TelephonyManager paramTelephonyManager)
  {
    try
    {
      String str = paramTelephonyManager.getNetworkOperator();
      int i = 3;
      str = str.substring(0, i);
      j = Integer.parseInt(str);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        int j = -1;
      }
    }
    return j;
  }
  
  public static int d(TelephonyManager paramTelephonyManager)
  {
    try
    {
      String str = paramTelephonyManager.getNetworkOperator();
      int i = 3;
      str = str.substring(i);
      j = Integer.parseInt(str);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        int j = -1;
      }
    }
    return j;
  }
  
  public static Location e(TelephonyManager paramTelephonyManager)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject = paramTelephonyManager.getCellLocation();
    boolean bool2 = false;
    boolean bool3 = localObject instanceof GsmCellLocation;
    if (bool3)
    {
      bool2 = a;
      if (bool2) {}
      localObject = (GsmCellLocation)localObject;
      localObject = a(paramTelephonyManager, (GsmCellLocation)localObject);
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      return (Location)localObject;
      bool1 = localObject instanceof CdmaCellLocation;
      if (bool1)
      {
        bool1 = a;
        if (bool1) {}
        localObject = a();
      }
      else
      {
        bool1 = a;
        if (bool1) {}
        bool1 = false;
        localObject = null;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/location/k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */