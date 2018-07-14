package com.vvt.io;

import java.io.File;
import java.util.ArrayList;

public class a
{
  private static final boolean a = com.vvt.ak.a.e;
  private static final boolean b = com.vvt.ak.a.a;
  private String c;
  private String d;
  
  public a(String paramString1, String paramString2)
  {
    this.c = paramString1;
    this.d = paramString2;
    a("");
  }
  
  private void a(String paramString)
  {
    File localFile = new java/io/File;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = this.d;
    localObject = str + paramString;
    localFile.<init>((String)localObject);
    boolean bool = localFile.isDirectory();
    if (!bool) {
      localFile.mkdirs();
    }
  }
  
  private void b(String paramString)
  {
    File localFile = new java/io/File;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = this.d;
    localObject = str + paramString;
    localFile.<init>((String)localObject);
    localObject = localFile.getParentFile();
    boolean bool = ((File)localObject).exists();
    if (!bool)
    {
      localFile = localFile.getParentFile();
      localFile.mkdirs();
    }
  }
  
  public boolean a()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    return a(localArrayList, true);
  }
  
  /* Error */
  public boolean a(ArrayList paramArrayList, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: iconst_1
    //   6: istore 5
    //   8: aconst_null
    //   9: astore 6
    //   11: new 71	java/io/FileInputStream
    //   14: astore 7
    //   16: aload_0
    //   17: getfield 26	com/vvt/io/a:MyUncaughtExceptionHandler	Ljava/lang/String;
    //   20: astore 8
    //   22: aload 7
    //   24: aload 8
    //   26: invokespecial 72	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   29: new 74	java/util/zip/ZipInputStream
    //   32: astore 8
    //   34: aload 8
    //   36: aload 7
    //   38: invokespecial 77	java/util/zip/ZipInputStream:<init>	(Ljava/io/InputStream;)V
    //   41: aload 8
    //   43: invokevirtual 81	java/util/zip/ZipInputStream:getNextEntry	()Ljava/util/zip/ZipEntry;
    //   46: astore 9
    //   48: aload 9
    //   50: ifnull +390 -> 440
    //   53: aload_1
    //   54: invokevirtual 84	java/util/ArrayList:isEmpty	()Z
    //   57: istore_3
    //   58: iload_3
    //   59: ifne +133 -> 192
    //   62: aload_1
    //   63: invokevirtual 88	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   66: astore 10
    //   68: aload 10
    //   70: invokeinterface 93 1 0
    //   75: istore_3
    //   76: iload_3
    //   77: ifeq +456 -> 533
    //   80: aload 10
    //   82: invokeinterface 97 1 0
    //   87: astore 4
    //   89: aload 4
    //   91: checkcast 99	java/lang/String
    //   94: astore 4
    //   96: aload 9
    //   98: invokevirtual 104	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   101: astore 11
    //   103: aload 11
    //   105: aload 4
    //   107: invokevirtual 108	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   110: istore_3
    //   111: iload_3
    //   112: ifeq -44 -> 68
    //   115: iload 5
    //   117: istore_3
    //   118: iload_3
    //   119: ifeq +300 -> 419
    //   122: aload 9
    //   124: invokevirtual 109	java/util/zip/ZipEntry:isDirectory	()Z
    //   127: istore_3
    //   128: iload_3
    //   129: ifeq +69 -> 198
    //   132: aload 9
    //   134: invokevirtual 104	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   137: astore 4
    //   139: aload_0
    //   140: aload 4
    //   142: invokespecial 33	com/vvt/io/a:a	(Ljava/lang/String;)V
    //   145: goto -104 -> 41
    //   148: astore 4
    //   150: aload 8
    //   152: astore 4
    //   154: aload 7
    //   156: astore 12
    //   158: getstatic 17	com/vvt/io/a:a	Z
    //   161: istore 13
    //   163: iload 13
    //   165: ifeq +3 -> 168
    //   168: aload 4
    //   170: ifnull +8 -> 178
    //   173: aload 4
    //   175: invokevirtual 112	java/util/zip/ZipInputStream:close	()V
    //   178: aload 12
    //   180: invokestatic 116	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   183: iconst_0
    //   184: istore 5
    //   186: aconst_null
    //   187: astore 12
    //   189: iload 5
    //   191: ireturn
    //   192: iload 5
    //   194: istore_3
    //   195: goto -77 -> 118
    //   198: aload 9
    //   200: invokevirtual 104	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   203: astore 4
    //   205: aload_0
    //   206: aload 4
    //   208: invokespecial 118	com/vvt/io/a:removeFromPath	(Ljava/lang/String;)V
    //   211: sipush 4096
    //   214: istore_3
    //   215: iload_3
    //   216: newarray <illegal type>
    //   218: astore 4
    //   220: new 37	java/lang/StringBuilder
    //   223: astore 10
    //   225: aload 10
    //   227: invokespecial 38	java/lang/StringBuilder:<init>	()V
    //   230: aload_0
    //   231: getfield 28	com/vvt/io/a:d	Ljava/lang/String;
    //   234: astore 11
    //   236: aload 10
    //   238: aload 11
    //   240: invokevirtual 42	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   243: astore 10
    //   245: aload 9
    //   247: invokevirtual 104	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   250: astore 9
    //   252: aload 10
    //   254: aload 9
    //   256: invokevirtual 42	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   259: astore 9
    //   261: aload 9
    //   263: invokevirtual 46	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   266: astore 9
    //   268: iload_2
    //   269: ifeq +21 -> 290
    //   272: new 35	java/io/File
    //   275: astore 10
    //   277: aload 10
    //   279: aload 9
    //   281: invokespecial 48	java/io/File:<init>	(Ljava/lang/String;)V
    //   284: aload 10
    //   286: invokevirtual 122	java/io/File:delete	()Z
    //   289: pop
    //   290: new 124	java/io/FileOutputStream
    //   293: astore 10
    //   295: aload 10
    //   297: aload 9
    //   299: invokespecial 125	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   302: new 127	java/io/BufferedOutputStream
    //   305: astore 9
    //   307: aload 4
    //   309: arraylength
    //   310: istore 14
    //   312: aload 9
    //   314: aload 10
    //   316: iload 14
    //   318: invokespecial 130	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;I)V
    //   321: iconst_0
    //   322: istore 15
    //   324: aconst_null
    //   325: astore 10
    //   327: aload 4
    //   329: arraylength
    //   330: istore 14
    //   332: aload 8
    //   334: aload 4
    //   336: iconst_0
    //   337: iload 14
    //   339: invokevirtual 134	java/util/zip/ZipInputStream:read	([BII)I
    //   342: istore 15
    //   344: iconst_m1
    //   345: istore 14
    //   347: iload 15
    //   349: iload 14
    //   351: if_icmpeq +42 -> 393
    //   354: iconst_0
    //   355: istore 14
    //   357: aconst_null
    //   358: astore 11
    //   360: aload 9
    //   362: aload 4
    //   364: iconst_0
    //   365: iload 15
    //   367: invokevirtual 138	java/io/BufferedOutputStream:write	([BII)V
    //   370: goto -49 -> 321
    //   373: astore 4
    //   375: aload 8
    //   377: ifnull +8 -> 385
    //   380: aload 8
    //   382: invokevirtual 112	java/util/zip/ZipInputStream:close	()V
    //   385: aload 7
    //   387: invokestatic 116	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   390: aload 4
    //   392: athrow
    //   393: aload 9
    //   395: invokevirtual 141	java/io/BufferedOutputStream:flush	()V
    //   398: aload 9
    //   400: invokevirtual 142	java/io/BufferedOutputStream:close	()V
    //   403: aload 8
    //   405: invokevirtual 145	java/util/zip/ZipInputStream:closeEntry	()V
    //   408: getstatic 20	com/vvt/io/a:removeFromPath	Z
    //   411: istore_3
    //   412: iload_3
    //   413: ifeq -372 -> 41
    //   416: goto -375 -> 41
    //   419: getstatic 20	com/vvt/io/a:removeFromPath	Z
    //   422: istore_3
    //   423: iload_3
    //   424: ifeq -383 -> 41
    //   427: goto -386 -> 41
    //   430: astore 12
    //   432: goto -47 -> 385
    //   435: astore 4
    //   437: goto -259 -> 178
    //   440: aload 8
    //   442: ifnull +8 -> 450
    //   445: aload 8
    //   447: invokevirtual 112	java/util/zip/ZipInputStream:close	()V
    //   450: aload 7
    //   452: invokestatic 116	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   455: goto -266 -> 189
    //   458: astore 4
    //   460: goto -10 -> 450
    //   463: astore 12
    //   465: iconst_0
    //   466: istore 13
    //   468: aconst_null
    //   469: astore 8
    //   471: aconst_null
    //   472: astore 7
    //   474: aload 12
    //   476: astore 4
    //   478: goto -103 -> 375
    //   481: astore 12
    //   483: iconst_0
    //   484: istore 13
    //   486: aconst_null
    //   487: astore 8
    //   489: aload 12
    //   491: astore 4
    //   493: goto -118 -> 375
    //   496: astore 6
    //   498: aload 4
    //   500: astore 8
    //   502: aload 12
    //   504: astore 7
    //   506: aload 6
    //   508: astore 4
    //   510: goto -135 -> 375
    //   513: astore 12
    //   515: iconst_0
    //   516: istore 5
    //   518: aconst_null
    //   519: astore 12
    //   521: goto -363 -> 158
    //   524: astore 12
    //   526: aload 7
    //   528: astore 12
    //   530: goto -372 -> 158
    //   533: iconst_0
    //   534: istore_3
    //   535: aconst_null
    //   536: astore 4
    //   538: goto -420 -> 118
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	541	0	this	a
    //   0	541	1	paramArrayList	ArrayList
    //   0	541	2	paramBoolean	boolean
    //   1	194	3	bool1	boolean
    //   214	2	3	i	int
    //   411	124	3	bool2	boolean
    //   3	138	4	localObject1	Object
    //   148	1	4	localException1	Exception
    //   152	211	4	localObject2	Object
    //   373	18	4	localObject3	Object
    //   435	1	4	localIOException1	java.io.IOException
    //   458	1	4	localIOException2	java.io.IOException
    //   476	61	4	localObject4	Object
    //   6	511	5	bool3	boolean
    //   9	1	6	localObject5	Object
    //   496	11	6	localObject6	Object
    //   14	513	7	localObject7	Object
    //   20	481	8	localObject8	Object
    //   46	353	9	localObject9	Object
    //   66	260	10	localObject10	Object
    //   101	258	11	str	String
    //   156	32	12	localObject11	Object
    //   430	1	12	localIOException3	java.io.IOException
    //   463	12	12	localObject12	Object
    //   481	22	12	localObject13	Object
    //   513	1	12	localException2	Exception
    //   519	1	12	localObject14	Object
    //   524	1	12	localException3	Exception
    //   528	1	12	localObject15	Object
    //   161	324	13	bool4	boolean
    //   310	46	14	j	int
    //   322	44	15	k	int
    // Exception table:
    //   from	to	target	type
    //   41	46	148	java/lang/Exception
    //   53	57	148	java/lang/Exception
    //   62	66	148	java/lang/Exception
    //   68	75	148	java/lang/Exception
    //   80	87	148	java/lang/Exception
    //   89	94	148	java/lang/Exception
    //   96	101	148	java/lang/Exception
    //   105	110	148	java/lang/Exception
    //   122	127	148	java/lang/Exception
    //   132	137	148	java/lang/Exception
    //   140	145	148	java/lang/Exception
    //   198	203	148	java/lang/Exception
    //   206	211	148	java/lang/Exception
    //   215	218	148	java/lang/Exception
    //   220	223	148	java/lang/Exception
    //   225	230	148	java/lang/Exception
    //   230	234	148	java/lang/Exception
    //   238	243	148	java/lang/Exception
    //   245	250	148	java/lang/Exception
    //   254	259	148	java/lang/Exception
    //   261	266	148	java/lang/Exception
    //   272	275	148	java/lang/Exception
    //   279	284	148	java/lang/Exception
    //   284	290	148	java/lang/Exception
    //   290	293	148	java/lang/Exception
    //   297	302	148	java/lang/Exception
    //   302	305	148	java/lang/Exception
    //   307	310	148	java/lang/Exception
    //   316	321	148	java/lang/Exception
    //   327	330	148	java/lang/Exception
    //   337	342	148	java/lang/Exception
    //   365	370	148	java/lang/Exception
    //   393	398	148	java/lang/Exception
    //   398	403	148	java/lang/Exception
    //   403	408	148	java/lang/Exception
    //   408	411	148	java/lang/Exception
    //   419	422	148	java/lang/Exception
    //   41	46	373	finally
    //   53	57	373	finally
    //   62	66	373	finally
    //   68	75	373	finally
    //   80	87	373	finally
    //   89	94	373	finally
    //   96	101	373	finally
    //   105	110	373	finally
    //   122	127	373	finally
    //   132	137	373	finally
    //   140	145	373	finally
    //   198	203	373	finally
    //   206	211	373	finally
    //   215	218	373	finally
    //   220	223	373	finally
    //   225	230	373	finally
    //   230	234	373	finally
    //   238	243	373	finally
    //   245	250	373	finally
    //   254	259	373	finally
    //   261	266	373	finally
    //   272	275	373	finally
    //   279	284	373	finally
    //   284	290	373	finally
    //   290	293	373	finally
    //   297	302	373	finally
    //   302	305	373	finally
    //   307	310	373	finally
    //   316	321	373	finally
    //   327	330	373	finally
    //   337	342	373	finally
    //   365	370	373	finally
    //   393	398	373	finally
    //   398	403	373	finally
    //   403	408	373	finally
    //   408	411	373	finally
    //   419	422	373	finally
    //   380	385	430	java/io/IOException
    //   173	178	435	java/io/IOException
    //   445	450	458	java/io/IOException
    //   11	14	463	finally
    //   16	20	463	finally
    //   24	29	463	finally
    //   29	32	481	finally
    //   36	41	481	finally
    //   158	161	496	finally
    //   11	14	513	java/lang/Exception
    //   16	20	513	java/lang/Exception
    //   24	29	513	java/lang/Exception
    //   29	32	524	java/lang/Exception
    //   36	41	524	java/lang/Exception
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/io/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */