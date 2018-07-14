package com.vvt.capture.mms.b;

import android.content.ContentResolver;
import android.database.Cursor;
import com.vvt.ak.a;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;

public class e
  implements f
{
  private static final boolean a = a.a;
  private static final boolean b = a.b;
  private static final boolean c = a.e;
  private ContentResolver d;
  private String e;
  
  public e(ContentResolver paramContentResolver, String paramString)
  {
    this.d = paramContentResolver;
    this.e = paramString;
  }
  
  /* Error */
  private java.util.List a(Cursor paramCursor)
  {
    // Byte code:
    //   0: getstatic 19	com/vvt/capture/mms/removeFromPath/e:a	Z
    //   3: istore_2
    //   4: iload_2
    //   5: ifeq +3 -> 8
    //   8: new 36	java/util/ArrayList
    //   11: astore_3
    //   12: aload_3
    //   13: invokespecial 37	java/util/ArrayList:<init>	()V
    //   16: new 36	java/util/ArrayList
    //   19: astore 4
    //   21: aload 4
    //   23: invokespecial 37	java/util/ArrayList:<init>	()V
    //   26: new 39	java/lang/StringBuilder
    //   29: astore 5
    //   31: aload 5
    //   33: invokespecial 40	java/lang/StringBuilder:<init>	()V
    //   36: ldc 44
    //   38: astore 6
    //   40: aload_1
    //   41: aload 6
    //   43: invokeinterface 50 2 0
    //   48: istore_2
    //   49: aload_1
    //   50: iload_2
    //   51: invokeinterface 54 2 0
    //   56: astore 6
    //   58: aload 6
    //   60: invokestatic 59	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   63: istore 7
    //   65: ldc 61
    //   67: astore 6
    //   69: aload_1
    //   70: aload 6
    //   72: invokeinterface 50 2 0
    //   77: istore_2
    //   78: aload_1
    //   79: iload_2
    //   80: invokeinterface 54 2 0
    //   85: astore 6
    //   87: aload 6
    //   89: invokestatic 67	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   92: lstore 8
    //   94: ldc 69
    //   96: astore 6
    //   98: aload_1
    //   99: aload 6
    //   101: invokeinterface 50 2 0
    //   106: istore_2
    //   107: aload_1
    //   108: iload_2
    //   109: invokeinterface 54 2 0
    //   114: astore 6
    //   116: aload 6
    //   118: invokestatic 59	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   121: istore 10
    //   123: new 71	java/util/Date
    //   126: astore 6
    //   128: aload 6
    //   130: invokespecial 72	java/util/Date:<init>	()V
    //   133: aload 6
    //   135: invokevirtual 76	java/util/Date:getTime	()J
    //   138: lstore 11
    //   140: ldc 78
    //   142: astore 13
    //   144: aload_1
    //   145: aload 13
    //   147: invokeinterface 50 2 0
    //   152: istore 14
    //   154: iconst_m1
    //   155: istore 15
    //   157: iload 14
    //   159: iload 15
    //   161: if_icmpeq +1973 -> 2134
    //   164: lload 11
    //   166: invokestatic 82	java/lang/Long:toString	(J)Ljava/lang/String;
    //   169: astore 16
    //   171: aload 16
    //   173: invokevirtual 88	java/lang/String:length	()I
    //   176: istore 15
    //   178: aload_1
    //   179: iload 14
    //   181: invokeinterface 54 2 0
    //   186: astore 17
    //   188: aload 17
    //   190: invokevirtual 88	java/lang/String:length	()I
    //   193: istore 18
    //   195: iload 15
    //   197: iload 18
    //   199: isub
    //   200: istore 15
    //   202: iload 15
    //   204: iflt +52 -> 256
    //   207: aload_1
    //   208: iload 14
    //   210: invokeinterface 54 2 0
    //   215: astore 13
    //   217: aload 13
    //   219: invokestatic 67	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   222: lstore 11
    //   224: lload 11
    //   226: l2d
    //   227: dstore 19
    //   229: ldc2_w 91
    //   232: dstore 21
    //   234: iload 15
    //   236: i2d
    //   237: dstore 23
    //   239: dload 21
    //   241: dload 23
    //   243: invokestatic 98	java/lang/Math:pow	(DD)D
    //   246: dload 19
    //   248: dmul
    //   249: dstore 25
    //   251: dload 25
    //   253: d2l
    //   254: lstore 11
    //   256: lload 11
    //   258: lstore 27
    //   260: sipush 128
    //   263: istore_2
    //   264: iload 10
    //   266: iload_2
    //   267: if_icmpne +824 -> 1091
    //   270: getstatic 105	com/vvt/capture/mms/MmsData$Direction:OUT	Lcom/vvt/capture/mms/MmsData$Direction;
    //   273: astore 6
    //   275: aload 6
    //   277: astore 29
    //   279: ldc 107
    //   281: astore 6
    //   283: aload_1
    //   284: aload 6
    //   286: invokeinterface 50 2 0
    //   291: istore_2
    //   292: aload_1
    //   293: iload_2
    //   294: invokeinterface 54 2 0
    //   299: astore 30
    //   301: aload 30
    //   303: ifnonnull +800 -> 1103
    //   306: ldc 42
    //   308: astore 6
    //   310: aload 6
    //   312: astore 31
    //   314: aload_0
    //   315: getfield 32	com/vvt/capture/mms/removeFromPath/e:d	Landroid/content/ContentResolver;
    //   318: astore 6
    //   320: getstatic 112	com/vvt/capture/mms/removeFromPath/a:MyUncaughtExceptionHandler	Landroid/net/Uri;
    //   323: astore 30
    //   325: iconst_0
    //   326: istore 10
    //   328: aconst_null
    //   329: astore 32
    //   331: new 39	java/lang/StringBuilder
    //   334: astore 13
    //   336: aload 13
    //   338: invokespecial 40	java/lang/StringBuilder:<init>	()V
    //   341: ldc 114
    //   343: astore 16
    //   345: aload 13
    //   347: aload 16
    //   349: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   352: astore 13
    //   354: aload 13
    //   356: iload 7
    //   358: invokevirtual 121	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   361: astore 13
    //   363: aload 13
    //   365: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   368: astore 13
    //   370: iconst_0
    //   371: istore 15
    //   373: aconst_null
    //   374: astore 16
    //   376: ldc 44
    //   378: astore 17
    //   380: aload 6
    //   382: aload 30
    //   384: aconst_null
    //   385: aload 13
    //   387: aconst_null
    //   388: aload 17
    //   390: invokevirtual 130	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   393: astore 33
    //   395: aload 33
    //   397: ifnull +1726 -> 2123
    //   400: aload 33
    //   402: invokeinterface 134 1 0
    //   407: istore_2
    //   408: iload_2
    //   409: ifeq +365 -> 774
    //   412: ldc -120
    //   414: astore 6
    //   416: aload 33
    //   418: aload 6
    //   420: invokeinterface 50 2 0
    //   425: istore_2
    //   426: aload 33
    //   428: iload_2
    //   429: invokeinterface 54 2 0
    //   434: astore 6
    //   436: ldc 44
    //   438: astore 30
    //   440: aload 33
    //   442: aload 30
    //   444: invokeinterface 50 2 0
    //   449: istore 34
    //   451: aload 33
    //   453: iload 34
    //   455: invokeinterface 54 2 0
    //   460: astore 30
    //   462: aload_0
    //   463: aload 33
    //   465: invokespecial 139	com/vvt/capture/mms/removeFromPath/e:removeFromPath	(Landroid/database/Cursor;)Ljava/lang/String;
    //   468: astore 32
    //   470: getstatic 19	com/vvt/capture/mms/removeFromPath/e:a	Z
    //   473: istore 14
    //   475: iload 14
    //   477: ifeq +3 -> 480
    //   480: getstatic 19	com/vvt/capture/mms/removeFromPath/e:a	Z
    //   483: istore 14
    //   485: iload 14
    //   487: ifeq +3 -> 490
    //   490: ldc -115
    //   492: astore 13
    //   494: aload 6
    //   496: aload 13
    //   498: invokevirtual 145	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   501: istore 14
    //   503: iload 14
    //   505: ifeq +688 -> 1193
    //   508: aload_0
    //   509: aload 30
    //   511: invokespecial 148	com/vvt/capture/mms/removeFromPath/e:a	(Ljava/lang/String;)[B
    //   514: astore 32
    //   516: ldc 42
    //   518: astore 6
    //   520: aload 32
    //   522: ifnull +25 -> 547
    //   525: aload 32
    //   527: arraylength
    //   528: istore 14
    //   530: iload 14
    //   532: ifle +15 -> 547
    //   535: new 84	java/lang/String
    //   538: astore 6
    //   540: aload 6
    //   542: aload 32
    //   544: invokespecial 151	java/lang/String:<init>	([B)V
    //   547: aload 6
    //   549: invokestatic 155	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   552: istore 10
    //   554: iload 10
    //   556: ifeq +613 -> 1169
    //   559: getstatic 19	com/vvt/capture/mms/removeFromPath/e:a	Z
    //   562: istore_2
    //   563: iload_2
    //   564: ifeq +3 -> 567
    //   567: new 39	java/lang/StringBuilder
    //   570: astore 6
    //   572: aload 6
    //   574: invokespecial 40	java/lang/StringBuilder:<init>	()V
    //   577: ldc 114
    //   579: astore 32
    //   581: aload 6
    //   583: aload 32
    //   585: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   588: astore 6
    //   590: aload 6
    //   592: iload 7
    //   594: invokevirtual 121	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   597: astore 6
    //   599: ldc -99
    //   601: astore 32
    //   603: aload 6
    //   605: aload 32
    //   607: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   610: astore 6
    //   612: aload 6
    //   614: aload 30
    //   616: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   619: astore 6
    //   621: aload 6
    //   623: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   626: astore 13
    //   628: getstatic 19	com/vvt/capture/mms/removeFromPath/e:a	Z
    //   631: istore_2
    //   632: iload_2
    //   633: ifeq +3 -> 636
    //   636: aload_0
    //   637: getfield 32	com/vvt/capture/mms/removeFromPath/e:d	Landroid/content/ContentResolver;
    //   640: astore 6
    //   642: getstatic 112	com/vvt/capture/mms/removeFromPath/a:MyUncaughtExceptionHandler	Landroid/net/Uri;
    //   645: astore 30
    //   647: iconst_0
    //   648: istore 10
    //   650: aconst_null
    //   651: astore 32
    //   653: iconst_0
    //   654: istore 15
    //   656: aconst_null
    //   657: astore 16
    //   659: ldc 44
    //   661: astore 17
    //   663: aload 6
    //   665: aload 30
    //   667: aconst_null
    //   668: aload 13
    //   670: aconst_null
    //   671: aload 17
    //   673: invokevirtual 130	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   676: astore 30
    //   678: aload 30
    //   680: ifnull +461 -> 1141
    //   683: aload 30
    //   685: invokeinterface 134 1 0
    //   690: istore_2
    //   691: iload_2
    //   692: ifeq +449 -> 1141
    //   695: ldc -97
    //   697: astore 6
    //   699: aload 30
    //   701: aload 6
    //   703: invokeinterface 50 2 0
    //   708: istore_2
    //   709: aload 30
    //   711: iload_2
    //   712: invokeinterface 54 2 0
    //   717: astore 6
    //   719: getstatic 19	com/vvt/capture/mms/removeFromPath/e:a	Z
    //   722: istore 10
    //   724: iload 10
    //   726: ifeq +3 -> 729
    //   729: aload 5
    //   731: aload 6
    //   733: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   736: astore 6
    //   738: ldc -95
    //   740: astore 32
    //   742: aload 6
    //   744: aload 32
    //   746: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   749: pop
    //   750: aload 30
    //   752: ifnull +10 -> 762
    //   755: aload 30
    //   757: invokeinterface 164 1 0
    //   762: aload 33
    //   764: invokeinterface 167 1 0
    //   769: istore_2
    //   770: iload_2
    //   771: ifne -359 -> 412
    //   774: getstatic 19	com/vvt/capture/mms/removeFromPath/e:a	Z
    //   777: istore_2
    //   778: iload_2
    //   779: ifeq +3 -> 782
    //   782: aload 33
    //   784: ifnull +10 -> 794
    //   787: aload 33
    //   789: invokeinterface 164 1 0
    //   794: new 36	java/util/ArrayList
    //   797: astore 33
    //   799: aload 33
    //   801: invokespecial 37	java/util/ArrayList:<init>	()V
    //   804: new 39	java/lang/StringBuilder
    //   807: astore 6
    //   809: aload 6
    //   811: invokespecial 40	java/lang/StringBuilder:<init>	()V
    //   814: ldc -87
    //   816: astore 30
    //   818: aload 6
    //   820: aload 30
    //   822: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   825: astore 6
    //   827: aload 6
    //   829: iload 7
    //   831: invokevirtual 121	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   834: astore 6
    //   836: ldc -85
    //   838: astore 30
    //   840: aload 6
    //   842: aload 30
    //   844: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   847: astore 6
    //   849: aload 6
    //   851: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   854: astore 6
    //   856: aload 6
    //   858: invokestatic 177	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   861: astore 30
    //   863: aload_0
    //   864: getfield 32	com/vvt/capture/mms/removeFromPath/e:d	Landroid/content/ContentResolver;
    //   867: astore 6
    //   869: iconst_0
    //   870: istore 10
    //   872: aconst_null
    //   873: astore 32
    //   875: iconst_0
    //   876: istore 14
    //   878: aconst_null
    //   879: astore 13
    //   881: iconst_0
    //   882: istore 15
    //   884: aconst_null
    //   885: astore 16
    //   887: iconst_0
    //   888: istore 18
    //   890: aconst_null
    //   891: astore 17
    //   893: aload 6
    //   895: aload 30
    //   897: aconst_null
    //   898: aconst_null
    //   899: aconst_null
    //   900: aconst_null
    //   901: invokevirtual 130	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   904: astore 6
    //   906: ldc 42
    //   908: astore 30
    //   910: aload 6
    //   912: ifnull +871 -> 1783
    //   915: aload 6
    //   917: invokeinterface 180 1 0
    //   922: istore 34
    //   924: iload 34
    //   926: ifeq +857 -> 1783
    //   929: ldc -74
    //   931: astore 30
    //   933: aload 6
    //   935: aload 30
    //   937: invokeinterface 50 2 0
    //   942: istore 34
    //   944: aload 6
    //   946: iload 34
    //   948: invokeinterface 186 2 0
    //   953: istore 34
    //   955: getstatic 19	com/vvt/capture/mms/removeFromPath/e:a	Z
    //   958: istore 10
    //   960: iload 10
    //   962: ifeq +3 -> 965
    //   965: getstatic 189	com/vvt/capture/mms/MmsData$Direction:IN	Lcom/vvt/capture/mms/MmsData$Direction;
    //   968: astore 32
    //   970: aload 29
    //   972: aload 32
    //   974: if_acmpne +15 -> 989
    //   977: sipush 137
    //   980: istore 10
    //   982: iload 34
    //   984: iload 10
    //   986: if_icmpeq +27 -> 1013
    //   989: getstatic 105	com/vvt/capture/mms/MmsData$Direction:OUT	Lcom/vvt/capture/mms/MmsData$Direction;
    //   992: astore 32
    //   994: aload 29
    //   996: aload 32
    //   998: if_acmpne -83 -> 915
    //   1001: sipush 151
    //   1004: istore 10
    //   1006: iload 34
    //   1008: iload 10
    //   1010: if_icmpne -95 -> 915
    //   1013: ldc -63
    //   1015: astore 30
    //   1017: aload 6
    //   1019: aload 30
    //   1021: invokeinterface 50 2 0
    //   1026: istore 34
    //   1028: aload 6
    //   1030: iload 34
    //   1032: invokeinterface 54 2 0
    //   1037: astore 30
    //   1039: getstatic 19	com/vvt/capture/mms/removeFromPath/e:a	Z
    //   1042: istore 10
    //   1044: iload 10
    //   1046: ifeq +3 -> 1049
    //   1049: aload 33
    //   1051: aload 30
    //   1053: invokeinterface 199 2 0
    //   1058: pop
    //   1059: goto -144 -> 915
    //   1062: astore 6
    //   1064: getstatic 26	com/vvt/capture/mms/removeFromPath/e:MyUncaughtExceptionHandler	Z
    //   1067: istore_2
    //   1068: iload_2
    //   1069: ifeq +3 -> 1072
    //   1072: getstatic 19	com/vvt/capture/mms/removeFromPath/e:a	Z
    //   1075: istore_2
    //   1076: iload_2
    //   1077: ifeq +3 -> 1080
    //   1080: aload_3
    //   1081: areturn
    //   1082: astore 13
    //   1084: lload 11
    //   1086: lstore 27
    //   1088: goto -828 -> 260
    //   1091: getstatic 189	com/vvt/capture/mms/MmsData$Direction:IN	Lcom/vvt/capture/mms/MmsData$Direction;
    //   1094: astore 6
    //   1096: aload 6
    //   1098: astore 29
    //   1100: goto -821 -> 279
    //   1103: new 84	java/lang/String
    //   1106: astore 6
    //   1108: ldc -55
    //   1110: astore 32
    //   1112: aload 30
    //   1114: aload 32
    //   1116: invokevirtual 204	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1119: astore 30
    //   1121: ldc -50
    //   1123: astore 32
    //   1125: aload 6
    //   1127: aload 30
    //   1129: aload 32
    //   1131: invokespecial 209	java/lang/String:<init>	([BLjava/lang/String;)V
    //   1134: aload 6
    //   1136: astore 31
    //   1138: goto -824 -> 314
    //   1141: getstatic 19	com/vvt/capture/mms/removeFromPath/e:a	Z
    //   1144: istore_2
    //   1145: iload_2
    //   1146: ifeq -396 -> 750
    //   1149: goto -399 -> 750
    //   1152: astore 6
    //   1154: aload 30
    //   1156: ifnull +10 -> 1166
    //   1159: aload 30
    //   1161: invokeinterface 164 1 0
    //   1166: aload 6
    //   1168: athrow
    //   1169: aload 5
    //   1171: aload 6
    //   1173: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1176: astore 6
    //   1178: ldc -95
    //   1180: astore 30
    //   1182: aload 6
    //   1184: aload 30
    //   1186: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1189: pop
    //   1190: goto -428 -> 762
    //   1193: aload 6
    //   1195: invokestatic 212	com/vvt/y/a:a	(Ljava/lang/String;)Z
    //   1198: istore 14
    //   1200: iload 14
    //   1202: ifeq +136 -> 1338
    //   1205: new 39	java/lang/StringBuilder
    //   1208: astore 6
    //   1210: aload 6
    //   1212: invokespecial 40	java/lang/StringBuilder:<init>	()V
    //   1215: ldc -42
    //   1217: astore 32
    //   1219: aload 6
    //   1221: aload 32
    //   1223: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1226: astore 6
    //   1228: aload 6
    //   1230: aload 30
    //   1232: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1235: astore 6
    //   1237: ldc -40
    //   1239: astore 32
    //   1241: aload 6
    //   1243: aload 32
    //   1245: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1248: astore 6
    //   1250: aload 6
    //   1252: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1255: astore 6
    //   1257: aload_0
    //   1258: aload 30
    //   1260: invokespecial 148	com/vvt/capture/mms/removeFromPath/e:a	(Ljava/lang/String;)[B
    //   1263: astore 30
    //   1265: aload_0
    //   1266: getfield 34	com/vvt/capture/mms/removeFromPath/e:e	Ljava/lang/String;
    //   1269: astore 32
    //   1271: ldc -38
    //   1273: astore 13
    //   1275: aload 32
    //   1277: aload 6
    //   1279: aload 13
    //   1281: invokestatic 221	com/vvt/y/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1284: astore 32
    //   1286: getstatic 19	com/vvt/capture/mms/removeFromPath/e:a	Z
    //   1289: istore 14
    //   1291: iload 14
    //   1293: ifeq +3 -> 1296
    //   1296: aload 30
    //   1298: aload 32
    //   1300: invokestatic 223	com/vvt/y/a:a	([BLjava/lang/String;)V
    //   1303: new 225	com/vvt/capture/mms/a
    //   1306: astore 30
    //   1308: aload 30
    //   1310: invokespecial 226	com/vvt/capture/mms/a:<init>	()V
    //   1313: aload 30
    //   1315: aload 6
    //   1317: invokevirtual 229	com/vvt/capture/mms/a:a	(Ljava/lang/String;)V
    //   1320: aload 30
    //   1322: aload 32
    //   1324: invokevirtual 231	com/vvt/capture/mms/a:removeFromPath	(Ljava/lang/String;)V
    //   1327: aload 4
    //   1329: aload 30
    //   1331: invokevirtual 232	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1334: pop
    //   1335: goto -573 -> 762
    //   1338: aload 6
    //   1340: invokestatic 234	com/vvt/y/a:removeFromPath	(Ljava/lang/String;)Z
    //   1343: istore 14
    //   1345: iload 14
    //   1347: ifeq +136 -> 1483
    //   1350: new 39	java/lang/StringBuilder
    //   1353: astore 6
    //   1355: aload 6
    //   1357: invokespecial 40	java/lang/StringBuilder:<init>	()V
    //   1360: ldc -20
    //   1362: astore 32
    //   1364: aload 6
    //   1366: aload 32
    //   1368: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1371: astore 6
    //   1373: aload 6
    //   1375: aload 30
    //   1377: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1380: astore 6
    //   1382: ldc -18
    //   1384: astore 32
    //   1386: aload 6
    //   1388: aload 32
    //   1390: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1393: astore 6
    //   1395: aload 6
    //   1397: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1400: astore 6
    //   1402: aload_0
    //   1403: aload 30
    //   1405: invokespecial 148	com/vvt/capture/mms/removeFromPath/e:a	(Ljava/lang/String;)[B
    //   1408: astore 30
    //   1410: aload_0
    //   1411: getfield 34	com/vvt/capture/mms/removeFromPath/e:e	Ljava/lang/String;
    //   1414: astore 32
    //   1416: ldc -38
    //   1418: astore 13
    //   1420: aload 32
    //   1422: aload 6
    //   1424: aload 13
    //   1426: invokestatic 221	com/vvt/y/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1429: astore 32
    //   1431: getstatic 19	com/vvt/capture/mms/removeFromPath/e:a	Z
    //   1434: istore 14
    //   1436: iload 14
    //   1438: ifeq +3 -> 1441
    //   1441: aload 30
    //   1443: aload 32
    //   1445: invokestatic 223	com/vvt/y/a:a	([BLjava/lang/String;)V
    //   1448: new 225	com/vvt/capture/mms/a
    //   1451: astore 30
    //   1453: aload 30
    //   1455: invokespecial 226	com/vvt/capture/mms/a:<init>	()V
    //   1458: aload 30
    //   1460: aload 6
    //   1462: invokevirtual 229	com/vvt/capture/mms/a:a	(Ljava/lang/String;)V
    //   1465: aload 30
    //   1467: aload 32
    //   1469: invokevirtual 231	com/vvt/capture/mms/a:removeFromPath	(Ljava/lang/String;)V
    //   1472: aload 4
    //   1474: aload 30
    //   1476: invokevirtual 232	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1479: pop
    //   1480: goto -718 -> 762
    //   1483: aload 6
    //   1485: invokestatic 240	com/vvt/y/a:MyUncaughtExceptionHandler	(Ljava/lang/String;)Z
    //   1488: istore_2
    //   1489: iload_2
    //   1490: ifeq +136 -> 1626
    //   1493: new 39	java/lang/StringBuilder
    //   1496: astore 6
    //   1498: aload 6
    //   1500: invokespecial 40	java/lang/StringBuilder:<init>	()V
    //   1503: ldc -14
    //   1505: astore 32
    //   1507: aload 6
    //   1509: aload 32
    //   1511: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1514: astore 6
    //   1516: aload 6
    //   1518: aload 30
    //   1520: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1523: astore 6
    //   1525: ldc -12
    //   1527: astore 32
    //   1529: aload 6
    //   1531: aload 32
    //   1533: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1536: astore 6
    //   1538: aload 6
    //   1540: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1543: astore 6
    //   1545: aload_0
    //   1546: aload 30
    //   1548: invokespecial 148	com/vvt/capture/mms/removeFromPath/e:a	(Ljava/lang/String;)[B
    //   1551: astore 30
    //   1553: aload_0
    //   1554: getfield 34	com/vvt/capture/mms/removeFromPath/e:e	Ljava/lang/String;
    //   1557: astore 32
    //   1559: ldc -38
    //   1561: astore 13
    //   1563: aload 32
    //   1565: aload 6
    //   1567: aload 13
    //   1569: invokestatic 221	com/vvt/y/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1572: astore 32
    //   1574: getstatic 19	com/vvt/capture/mms/removeFromPath/e:a	Z
    //   1577: istore 14
    //   1579: iload 14
    //   1581: ifeq +3 -> 1584
    //   1584: aload 30
    //   1586: aload 32
    //   1588: invokestatic 223	com/vvt/y/a:a	([BLjava/lang/String;)V
    //   1591: new 225	com/vvt/capture/mms/a
    //   1594: astore 30
    //   1596: aload 30
    //   1598: invokespecial 226	com/vvt/capture/mms/a:<init>	()V
    //   1601: aload 30
    //   1603: aload 6
    //   1605: invokevirtual 229	com/vvt/capture/mms/a:a	(Ljava/lang/String;)V
    //   1608: aload 30
    //   1610: aload 32
    //   1612: invokevirtual 231	com/vvt/capture/mms/a:removeFromPath	(Ljava/lang/String;)V
    //   1615: aload 4
    //   1617: aload 30
    //   1619: invokevirtual 232	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1622: pop
    //   1623: goto -861 -> 762
    //   1626: aload 32
    //   1628: ifnull -866 -> 762
    //   1631: aload_0
    //   1632: aload 30
    //   1634: invokespecial 148	com/vvt/capture/mms/removeFromPath/e:a	(Ljava/lang/String;)[B
    //   1637: astore 6
    //   1639: ldc -10
    //   1641: astore 32
    //   1643: iconst_2
    //   1644: istore 14
    //   1646: iload 14
    //   1648: anewarray 4	java/lang/Object
    //   1651: astore 13
    //   1653: iconst_0
    //   1654: istore 15
    //   1656: aconst_null
    //   1657: astore 16
    //   1659: aload 13
    //   1661: iconst_0
    //   1662: aload 30
    //   1664: aastore
    //   1665: iconst_1
    //   1666: istore 34
    //   1668: ldc -6
    //   1670: astore 16
    //   1672: aload 33
    //   1674: aload 16
    //   1676: invokeinterface 50 2 0
    //   1681: istore 15
    //   1683: aload 33
    //   1685: iload 15
    //   1687: invokeinterface 54 2 0
    //   1692: astore 16
    //   1694: aload 13
    //   1696: iload 34
    //   1698: aload 16
    //   1700: aastore
    //   1701: aload 32
    //   1703: aload 13
    //   1705: invokestatic 254	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1708: astore 30
    //   1710: getstatic 19	com/vvt/capture/mms/removeFromPath/e:a	Z
    //   1713: istore 10
    //   1715: iload 10
    //   1717: ifeq +3 -> 1720
    //   1720: aload_0
    //   1721: getfield 34	com/vvt/capture/mms/removeFromPath/e:e	Ljava/lang/String;
    //   1724: astore 32
    //   1726: ldc -38
    //   1728: astore 13
    //   1730: aload 32
    //   1732: aload 30
    //   1734: aload 13
    //   1736: invokestatic 221	com/vvt/y/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1739: astore 32
    //   1741: aload 6
    //   1743: aload 32
    //   1745: invokestatic 223	com/vvt/y/a:a	([BLjava/lang/String;)V
    //   1748: new 225	com/vvt/capture/mms/a
    //   1751: astore 6
    //   1753: aload 6
    //   1755: invokespecial 226	com/vvt/capture/mms/a:<init>	()V
    //   1758: aload 6
    //   1760: aload 30
    //   1762: invokevirtual 229	com/vvt/capture/mms/a:a	(Ljava/lang/String;)V
    //   1765: aload 6
    //   1767: aload 32
    //   1769: invokevirtual 231	com/vvt/capture/mms/a:removeFromPath	(Ljava/lang/String;)V
    //   1772: aload 4
    //   1774: aload 6
    //   1776: invokevirtual 232	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1779: pop
    //   1780: goto -1018 -> 762
    //   1783: getstatic 19	com/vvt/capture/mms/removeFromPath/e:a	Z
    //   1786: istore 34
    //   1788: iload 34
    //   1790: ifeq +3 -> 1793
    //   1793: aload 6
    //   1795: ifnull +10 -> 1805
    //   1798: aload 6
    //   1800: invokeinterface 164 1 0
    //   1805: aload 4
    //   1807: invokevirtual 257	java/util/ArrayList:size	()I
    //   1810: istore_2
    //   1811: iload_2
    //   1812: ifle +280 -> 2092
    //   1815: iconst_1
    //   1816: istore_2
    //   1817: iload_2
    //   1818: ifeq +294 -> 2112
    //   1821: aload 33
    //   1823: invokeinterface 261 1 0
    //   1828: astore 32
    //   1830: aload 32
    //   1832: invokeinterface 266 1 0
    //   1837: istore_2
    //   1838: iload_2
    //   1839: ifeq -767 -> 1072
    //   1842: aload 32
    //   1844: invokeinterface 270 1 0
    //   1849: astore 6
    //   1851: aload 6
    //   1853: checkcast 84	java/lang/String
    //   1856: astore 6
    //   1858: getstatic 19	com/vvt/capture/mms/removeFromPath/e:a	Z
    //   1861: istore 34
    //   1863: iload 34
    //   1865: ifeq +3 -> 1868
    //   1868: aload_0
    //   1869: getfield 32	com/vvt/capture/mms/removeFromPath/e:d	Landroid/content/ContentResolver;
    //   1872: astore 30
    //   1874: aload 30
    //   1876: aload 6
    //   1878: invokestatic 275	com/vvt/AppEngine1/f:removeFromPath	(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
    //   1881: astore 30
    //   1883: getstatic 19	com/vvt/capture/mms/removeFromPath/e:a	Z
    //   1886: istore 14
    //   1888: iload 14
    //   1890: ifeq +3 -> 1893
    //   1893: aload 30
    //   1895: ifnull +27 -> 1922
    //   1898: aload 30
    //   1900: invokevirtual 278	java/lang/String:trim	()Ljava/lang/String;
    //   1903: astore 13
    //   1905: aload 13
    //   1907: invokevirtual 88	java/lang/String:length	()I
    //   1910: istore 14
    //   1912: iconst_1
    //   1913: istore 15
    //   1915: iload 14
    //   1917: iload 15
    //   1919: if_icmpge +7 -> 1926
    //   1922: ldc 42
    //   1924: astore 30
    //   1926: new 280	com/vvt/capture/mms/MmsData
    //   1929: astore 13
    //   1931: aload 13
    //   1933: invokespecial 281	com/vvt/capture/mms/MmsData:<init>	()V
    //   1936: aload 13
    //   1938: aload 30
    //   1940: invokevirtual 282	com/vvt/capture/mms/MmsData:removeFromPath	(Ljava/lang/String;)V
    //   1943: aload 13
    //   1945: aload 29
    //   1947: invokevirtual 285	com/vvt/capture/mms/MmsData:a	(Lcom/vvt/capture/mms/MmsData$Direction;)V
    //   1950: iload 7
    //   1952: i2l
    //   1953: lstore 35
    //   1955: aload 13
    //   1957: lload 35
    //   1959: invokevirtual 288	com/vvt/capture/mms/MmsData:a	(J)V
    //   1962: aload 13
    //   1964: lload 8
    //   1966: invokevirtual 290	com/vvt/capture/mms/MmsData:MyUncaughtExceptionHandler	(J)V
    //   1969: aload 13
    //   1971: lload 27
    //   1973: invokevirtual 292	com/vvt/capture/mms/MmsData:removeFromPath	(J)V
    //   1976: aload 13
    //   1978: aload 6
    //   1980: invokevirtual 294	com/vvt/capture/mms/MmsData:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   1983: aload 13
    //   1985: aload 31
    //   1987: invokevirtual 296	com/vvt/capture/mms/MmsData:d	(Ljava/lang/String;)V
    //   1990: aload 5
    //   1992: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1995: astore 16
    //   1997: aload 13
    //   1999: aload 16
    //   2001: invokevirtual 297	com/vvt/capture/mms/MmsData:a	(Ljava/lang/String;)V
    //   2004: getstatic 105	com/vvt/capture/mms/MmsData$Direction:OUT	Lcom/vvt/capture/mms/MmsData$Direction;
    //   2007: astore 16
    //   2009: aload 29
    //   2011: aload 16
    //   2013: if_acmpne +34 -> 2047
    //   2016: new 299	com/vvt/capture/mms/d
    //   2019: astore 16
    //   2021: aload 16
    //   2023: invokespecial 300	com/vvt/capture/mms/d:<init>	()V
    //   2026: aload 16
    //   2028: aload 30
    //   2030: invokevirtual 301	com/vvt/capture/mms/d:removeFromPath	(Ljava/lang/String;)V
    //   2033: aload 16
    //   2035: aload 6
    //   2037: invokevirtual 302	com/vvt/capture/mms/d:a	(Ljava/lang/String;)V
    //   2040: aload 13
    //   2042: aload 16
    //   2044: invokevirtual 305	com/vvt/capture/mms/MmsData:a	(Lcom/vvt/capture/mms/d;)V
    //   2047: aload 4
    //   2049: invokevirtual 306	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   2052: astore 30
    //   2054: aload 30
    //   2056: invokeinterface 266 1 0
    //   2061: istore_2
    //   2062: iload_2
    //   2063: ifeq +37 -> 2100
    //   2066: aload 30
    //   2068: invokeinterface 270 1 0
    //   2073: astore 6
    //   2075: aload 6
    //   2077: checkcast 225	com/vvt/capture/mms/a
    //   2080: astore 6
    //   2082: aload 13
    //   2084: aload 6
    //   2086: invokevirtual 309	com/vvt/capture/mms/MmsData:a	(Lcom/vvt/capture/mms/a;)V
    //   2089: goto -35 -> 2054
    //   2092: iconst_0
    //   2093: istore_2
    //   2094: aconst_null
    //   2095: astore 6
    //   2097: goto -280 -> 1817
    //   2100: aload_3
    //   2101: aload 13
    //   2103: invokeinterface 199 2 0
    //   2108: pop
    //   2109: goto -279 -> 1830
    //   2112: getstatic 19	com/vvt/capture/mms/removeFromPath/e:a	Z
    //   2115: istore_2
    //   2116: iload_2
    //   2117: ifeq -1045 -> 1072
    //   2120: goto -1048 -> 1072
    //   2123: getstatic 19	com/vvt/capture/mms/removeFromPath/e:a	Z
    //   2126: istore_2
    //   2127: iload_2
    //   2128: ifeq -1056 -> 1072
    //   2131: goto -1059 -> 1072
    //   2134: lload 11
    //   2136: lstore 27
    //   2138: goto -1878 -> 260
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	2141	0	this	e
    //   0	2141	1	paramCursor	Cursor
    //   3	2	2	bool1	boolean
    //   48	246	2	i	int
    //   407	2	2	bool2	boolean
    //   425	4	2	j	int
    //   562	130	2	bool3	boolean
    //   708	4	2	k	int
    //   769	721	2	bool4	boolean
    //   1810	8	2	m	int
    //   1837	291	2	bool5	boolean
    //   11	2090	3	localArrayList1	java.util.ArrayList
    //   19	2029	4	localArrayList2	java.util.ArrayList
    //   29	1962	5	localStringBuilder	StringBuilder
    //   38	991	6	localObject1	Object
    //   1062	1	6	localObject2	Object
    //   1094	41	6	localObject3	Object
    //   1152	20	6	str1	String
    //   1176	920	6	localObject4	Object
    //   63	1888	7	n	int
    //   92	1873	8	l1	long
    //   121	206	10	i1	int
    //   552	409	10	bool6	boolean
    //   980	31	10	i2	int
    //   1042	674	10	bool7	boolean
    //   138	1997	11	l2	long
    //   142	738	13	localObject5	Object
    //   1082	1	13	localNumberFormatException	NumberFormatException
    //   1273	829	13	localObject6	Object
    //   152	57	14	i3	int
    //   473	31	14	bool8	boolean
    //   528	349	14	i4	int
    //   1198	382	14	bool9	boolean
    //   1644	3	14	i5	int
    //   1886	3	14	bool10	boolean
    //   1910	10	14	i6	int
    //   155	1765	15	i7	int
    //   169	1874	16	localObject7	Object
    //   186	706	17	str2	String
    //   193	696	18	i8	int
    //   227	20	19	d1	double
    //   232	8	21	d2	double
    //   237	5	23	d3	double
    //   249	3	25	d4	double
    //   258	1879	27	l3	long
    //   277	1733	29	localObject8	Object
    //   299	1768	30	localObject9	Object
    //   312	1674	31	localObject10	Object
    //   329	1514	32	localObject11	Object
    //   393	1429	33	localObject12	Object
    //   449	5	34	i9	int
    //   922	3	34	bool11	boolean
    //   942	755	34	i10	int
    //   1786	78	34	bool12	boolean
    //   1953	5	35	l4	long
    // Exception table:
    //   from	to	target	type
    //   41	48	1062	finally
    //   50	56	1062	finally
    //   58	63	1062	finally
    //   70	77	1062	finally
    //   79	85	1062	finally
    //   87	92	1062	finally
    //   99	106	1062	finally
    //   108	114	1062	finally
    //   116	121	1062	finally
    //   123	126	1062	finally
    //   128	133	1062	finally
    //   133	138	1062	finally
    //   145	152	1062	finally
    //   164	169	1062	finally
    //   171	176	1062	finally
    //   179	186	1062	finally
    //   188	193	1062	finally
    //   208	215	1062	finally
    //   217	222	1062	finally
    //   241	246	1062	finally
    //   270	273	1062	finally
    //   284	291	1062	finally
    //   293	299	1062	finally
    //   314	318	1062	finally
    //   320	323	1062	finally
    //   331	334	1062	finally
    //   336	341	1062	finally
    //   347	352	1062	finally
    //   356	361	1062	finally
    //   363	368	1062	finally
    //   388	393	1062	finally
    //   400	407	1062	finally
    //   418	425	1062	finally
    //   428	434	1062	finally
    //   442	449	1062	finally
    //   453	460	1062	finally
    //   463	468	1062	finally
    //   470	473	1062	finally
    //   480	483	1062	finally
    //   496	501	1062	finally
    //   509	514	1062	finally
    //   525	528	1062	finally
    //   535	538	1062	finally
    //   542	547	1062	finally
    //   547	552	1062	finally
    //   559	562	1062	finally
    //   567	570	1062	finally
    //   572	577	1062	finally
    //   583	588	1062	finally
    //   592	597	1062	finally
    //   605	610	1062	finally
    //   614	619	1062	finally
    //   621	626	1062	finally
    //   628	631	1062	finally
    //   636	640	1062	finally
    //   642	645	1062	finally
    //   671	676	1062	finally
    //   755	762	1062	finally
    //   762	769	1062	finally
    //   774	777	1062	finally
    //   787	794	1062	finally
    //   794	797	1062	finally
    //   799	804	1062	finally
    //   804	807	1062	finally
    //   809	814	1062	finally
    //   820	825	1062	finally
    //   829	834	1062	finally
    //   842	847	1062	finally
    //   849	854	1062	finally
    //   856	861	1062	finally
    //   863	867	1062	finally
    //   900	904	1062	finally
    //   915	922	1062	finally
    //   935	942	1062	finally
    //   946	953	1062	finally
    //   955	958	1062	finally
    //   965	968	1062	finally
    //   989	992	1062	finally
    //   1019	1026	1062	finally
    //   1030	1037	1062	finally
    //   1039	1042	1062	finally
    //   1051	1059	1062	finally
    //   1091	1094	1062	finally
    //   1103	1106	1062	finally
    //   1114	1119	1062	finally
    //   1129	1134	1062	finally
    //   1159	1166	1062	finally
    //   1166	1169	1062	finally
    //   1171	1176	1062	finally
    //   1184	1190	1062	finally
    //   1193	1198	1062	finally
    //   1205	1208	1062	finally
    //   1210	1215	1062	finally
    //   1221	1226	1062	finally
    //   1230	1235	1062	finally
    //   1243	1248	1062	finally
    //   1250	1255	1062	finally
    //   1258	1263	1062	finally
    //   1265	1269	1062	finally
    //   1279	1284	1062	finally
    //   1286	1289	1062	finally
    //   1298	1303	1062	finally
    //   1303	1306	1062	finally
    //   1308	1313	1062	finally
    //   1315	1320	1062	finally
    //   1322	1327	1062	finally
    //   1329	1335	1062	finally
    //   1338	1343	1062	finally
    //   1350	1353	1062	finally
    //   1355	1360	1062	finally
    //   1366	1371	1062	finally
    //   1375	1380	1062	finally
    //   1388	1393	1062	finally
    //   1395	1400	1062	finally
    //   1403	1408	1062	finally
    //   1410	1414	1062	finally
    //   1424	1429	1062	finally
    //   1431	1434	1062	finally
    //   1443	1448	1062	finally
    //   1448	1451	1062	finally
    //   1453	1458	1062	finally
    //   1460	1465	1062	finally
    //   1467	1472	1062	finally
    //   1474	1480	1062	finally
    //   1483	1488	1062	finally
    //   1493	1496	1062	finally
    //   1498	1503	1062	finally
    //   1509	1514	1062	finally
    //   1518	1523	1062	finally
    //   1531	1536	1062	finally
    //   1538	1543	1062	finally
    //   1546	1551	1062	finally
    //   1553	1557	1062	finally
    //   1567	1572	1062	finally
    //   1574	1577	1062	finally
    //   1586	1591	1062	finally
    //   1591	1594	1062	finally
    //   1596	1601	1062	finally
    //   1603	1608	1062	finally
    //   1610	1615	1062	finally
    //   1617	1623	1062	finally
    //   1632	1637	1062	finally
    //   1646	1651	1062	finally
    //   1662	1665	1062	finally
    //   1674	1681	1062	finally
    //   1685	1692	1062	finally
    //   1698	1701	1062	finally
    //   1703	1708	1062	finally
    //   1710	1713	1062	finally
    //   1720	1724	1062	finally
    //   1734	1739	1062	finally
    //   1743	1748	1062	finally
    //   1748	1751	1062	finally
    //   1753	1758	1062	finally
    //   1760	1765	1062	finally
    //   1767	1772	1062	finally
    //   1774	1780	1062	finally
    //   1783	1786	1062	finally
    //   1798	1805	1062	finally
    //   1805	1810	1062	finally
    //   1821	1828	1062	finally
    //   1830	1837	1062	finally
    //   1842	1849	1062	finally
    //   1851	1856	1062	finally
    //   1858	1861	1062	finally
    //   1868	1872	1062	finally
    //   1876	1881	1062	finally
    //   1883	1886	1062	finally
    //   1898	1903	1062	finally
    //   1905	1910	1062	finally
    //   1926	1929	1062	finally
    //   1931	1936	1062	finally
    //   1938	1943	1062	finally
    //   1945	1950	1062	finally
    //   1957	1962	1062	finally
    //   1964	1969	1062	finally
    //   1971	1976	1062	finally
    //   1978	1983	1062	finally
    //   1985	1990	1062	finally
    //   1990	1995	1062	finally
    //   1999	2004	1062	finally
    //   2004	2007	1062	finally
    //   2016	2019	1062	finally
    //   2021	2026	1062	finally
    //   2028	2033	1062	finally
    //   2035	2040	1062	finally
    //   2042	2047	1062	finally
    //   2047	2052	1062	finally
    //   2054	2061	1062	finally
    //   2066	2073	1062	finally
    //   2075	2080	1062	finally
    //   2084	2089	1062	finally
    //   2101	2109	1062	finally
    //   2112	2115	1062	finally
    //   2123	2126	1062	finally
    //   164	169	1082	java/lang/NumberFormatException
    //   171	176	1082	java/lang/NumberFormatException
    //   179	186	1082	java/lang/NumberFormatException
    //   188	193	1082	java/lang/NumberFormatException
    //   208	215	1082	java/lang/NumberFormatException
    //   217	222	1082	java/lang/NumberFormatException
    //   241	246	1082	java/lang/NumberFormatException
    //   683	690	1152	finally
    //   701	708	1152	finally
    //   711	717	1152	finally
    //   719	722	1152	finally
    //   731	736	1152	finally
    //   744	750	1152	finally
    //   1141	1144	1152	finally
  }
  
  /* Error */
  private byte[] a(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 39	java/lang/StringBuilder
    //   5: astore_3
    //   6: aload_3
    //   7: invokespecial 40	java/lang/StringBuilder:<init>	()V
    //   10: ldc_w 313
    //   13: astore 4
    //   15: aload_3
    //   16: aload 4
    //   18: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: aload_1
    //   22: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   28: invokestatic 177	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   31: astore_3
    //   32: new 315	java/io/ByteArrayOutputStream
    //   35: astore 5
    //   37: aload 5
    //   39: invokespecial 316	java/io/ByteArrayOutputStream:<init>	()V
    //   42: aload_0
    //   43: getfield 32	com/vvt/capture/mms/removeFromPath/e:d	Landroid/content/ContentResolver;
    //   46: astore 4
    //   48: aload 4
    //   50: aload_3
    //   51: invokevirtual 320	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   54: astore_3
    //   55: aload_3
    //   56: ifnull +54 -> 110
    //   59: sipush 256
    //   62: istore 6
    //   64: iload 6
    //   66: newarray <illegal type>
    //   68: astore 7
    //   70: aload_3
    //   71: aload 7
    //   73: invokevirtual 327	java/io/InputStream:read	([B)I
    //   76: istore 6
    //   78: iload 6
    //   80: iflt +24 -> 104
    //   83: aload 5
    //   85: aload 7
    //   87: iconst_0
    //   88: iload 6
    //   90: invokevirtual 331	java/io/ByteArrayOutputStream:write	([BII)V
    //   93: aload_3
    //   94: aload 7
    //   96: invokevirtual 327	java/io/InputStream:read	([B)I
    //   99: istore 6
    //   101: goto -23 -> 78
    //   104: aload 5
    //   106: invokevirtual 335	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   109: astore_2
    //   110: aload_3
    //   111: invokestatic 340	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   114: aload 5
    //   116: invokestatic 343	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   119: aload_2
    //   120: areturn
    //   121: astore_3
    //   122: aconst_null
    //   123: astore_3
    //   124: getstatic 26	com/vvt/capture/mms/removeFromPath/e:MyUncaughtExceptionHandler	Z
    //   127: istore 6
    //   129: iload 6
    //   131: ifeq +3 -> 134
    //   134: aload_3
    //   135: invokestatic 340	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   138: goto -24 -> 114
    //   141: astore 8
    //   143: aconst_null
    //   144: astore_3
    //   145: aload 8
    //   147: astore_2
    //   148: aload_3
    //   149: invokestatic 340	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   152: aload 5
    //   154: invokestatic 343	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   157: aload_2
    //   158: athrow
    //   159: astore_2
    //   160: goto -12 -> 148
    //   163: astore 4
    //   165: goto -41 -> 124
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	168	0	this	e
    //   0	168	1	paramString	String
    //   1	157	2	localObject1	Object
    //   159	1	2	localObject2	Object
    //   5	106	3	localObject3	Object
    //   121	1	3	localException1	Exception
    //   123	26	3	localInputStream	java.io.InputStream
    //   13	36	4	localObject4	Object
    //   163	1	4	localException2	Exception
    //   35	118	5	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   62	38	6	i	int
    //   127	3	6	bool	boolean
    //   68	27	7	arrayOfByte	byte[]
    //   141	5	8	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   42	46	121	java/lang/Exception
    //   50	54	121	java/lang/Exception
    //   42	46	141	finally
    //   50	54	141	finally
    //   64	68	159	finally
    //   71	76	159	finally
    //   88	93	159	finally
    //   94	99	159	finally
    //   104	109	159	finally
    //   124	127	159	finally
    //   64	68	163	java/lang/Exception
    //   71	76	163	java/lang/Exception
    //   88	93	163	java/lang/Exception
    //   94	99	163	java/lang/Exception
    //   104	109	163	java/lang/Exception
  }
  
  private String b(Cursor paramCursor)
  {
    String str1 = null;
    String str2 = "_data";
    try
    {
      int i = paramCursor.getColumnIndex(str2);
      str1 = paramCursor.getString(i);
      bool = a;
      if (!bool) {}
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool = a;
        if (!bool) {}
      }
    }
    return str1;
  }
  
  /* Error */
  public java.util.List a(int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: getstatic 19	com/vvt/capture/mms/removeFromPath/e:a	Z
    //   5: istore_3
    //   6: iload_3
    //   7: ifeq +3 -> 10
    //   10: new 36	java/util/ArrayList
    //   13: astore 4
    //   15: aload 4
    //   17: invokespecial 37	java/util/ArrayList:<init>	()V
    //   20: ldc_w 352
    //   23: astore 5
    //   25: iconst_m1
    //   26: istore_3
    //   27: iload_1
    //   28: iload_3
    //   29: if_icmpne +7 -> 36
    //   32: iconst_m1
    //   33: iconst_1
    //   34: iushr
    //   35: istore_1
    //   36: new 39	java/lang/StringBuilder
    //   39: astore 6
    //   41: aload 6
    //   43: invokespecial 40	java/lang/StringBuilder:<init>	()V
    //   46: ldc_w 354
    //   49: astore 7
    //   51: aload 6
    //   53: aload 7
    //   55: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: astore 6
    //   60: aload 6
    //   62: iload_1
    //   63: invokevirtual 121	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   66: astore 6
    //   68: aload 6
    //   70: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   73: astore 8
    //   75: aload_0
    //   76: getfield 32	com/vvt/capture/mms/removeFromPath/e:d	Landroid/content/ContentResolver;
    //   79: astore 6
    //   81: getstatic 356	com/vvt/capture/mms/removeFromPath/a:removeFromPath	Landroid/net/Uri;
    //   84: astore 7
    //   86: aload 6
    //   88: aload 7
    //   90: aconst_null
    //   91: aload 5
    //   93: aconst_null
    //   94: aload 8
    //   96: invokevirtual 130	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   99: astore 6
    //   101: aload 6
    //   103: ifnull +86 -> 189
    //   106: aload 6
    //   108: invokeinterface 180 1 0
    //   113: istore 9
    //   115: iload 9
    //   117: ifeq +72 -> 189
    //   120: aload_0
    //   121: aload 6
    //   123: invokespecial 359	com/vvt/capture/mms/removeFromPath/e:a	(Landroid/database/Cursor;)Ljava/util/List;
    //   126: astore 7
    //   128: aload 4
    //   130: aload 7
    //   132: invokeinterface 363 2 0
    //   137: pop
    //   138: goto -32 -> 106
    //   141: astore 7
    //   143: getstatic 26	com/vvt/capture/mms/removeFromPath/e:MyUncaughtExceptionHandler	Z
    //   146: istore 9
    //   148: iload 9
    //   150: ifeq +3 -> 153
    //   153: aload 6
    //   155: ifnull +10 -> 165
    //   158: aload 6
    //   160: invokeinterface 164 1 0
    //   165: getstatic 19	com/vvt/capture/mms/removeFromPath/e:a	Z
    //   168: istore_3
    //   169: iload_3
    //   170: ifeq +3 -> 173
    //   173: aload 4
    //   175: areturn
    //   176: aload_2
    //   177: ifnull +9 -> 186
    //   180: aload_2
    //   181: invokeinterface 164 1 0
    //   186: aload 6
    //   188: athrow
    //   189: aload 6
    //   191: ifnull -26 -> 165
    //   194: goto -36 -> 158
    //   197: astore 7
    //   199: aload 6
    //   201: astore_2
    //   202: aload 7
    //   204: astore 6
    //   206: goto -30 -> 176
    //   209: astore 6
    //   211: iconst_0
    //   212: istore_3
    //   213: aconst_null
    //   214: astore 6
    //   216: goto -73 -> 143
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	219	0	this	e
    //   0	219	1	paramInt	int
    //   1	201	2	localObject1	Object
    //   5	2	3	bool1	boolean
    //   26	4	3	i	int
    //   168	45	3	bool2	boolean
    //   13	161	4	localArrayList	java.util.ArrayList
    //   23	69	5	str1	String
    //   39	166	6	localObject2	Object
    //   209	1	6	localObject3	Object
    //   214	1	6	localObject4	Object
    //   49	82	7	localObject5	Object
    //   141	1	7	localObject6	Object
    //   197	6	7	localObject7	Object
    //   73	22	8	str2	String
    //   113	36	9	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   106	113	141	finally
    //   121	126	141	finally
    //   130	138	141	finally
    //   143	146	197	finally
    //   36	39	209	finally
    //   41	46	209	finally
    //   53	58	209	finally
    //   62	66	209	finally
    //   68	73	209	finally
    //   75	79	209	finally
    //   81	84	209	finally
    //   94	99	209	finally
  }
  
  /* Error */
  public java.util.List a(com.vvt.base.capture.g paramg1, com.vvt.base.capture.g paramg2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: getstatic 19	com/vvt/capture/mms/removeFromPath/e:a	Z
    //   5: istore 4
    //   7: iload 4
    //   9: ifeq +3 -> 12
    //   12: new 36	java/util/ArrayList
    //   15: astore 5
    //   17: aload 5
    //   19: invokespecial 37	java/util/ArrayList:<init>	()V
    //   22: aload_1
    //   23: invokeinterface 368 1 0
    //   28: checkcast 63	java/lang/Long
    //   31: astore 6
    //   33: aload 6
    //   35: invokevirtual 371	java/lang/Long:longValue	()J
    //   38: lstore 7
    //   40: getstatic 22	com/vvt/capture/mms/removeFromPath/e:removeFromPath	Z
    //   43: istore 9
    //   45: iload 9
    //   47: ifeq +3 -> 50
    //   50: ldc_w 373
    //   53: astore 10
    //   55: iconst_2
    //   56: istore 11
    //   58: iload 11
    //   60: anewarray 4	java/lang/Object
    //   63: astore 12
    //   65: iconst_0
    //   66: istore 13
    //   68: ldc 44
    //   70: astore 14
    //   72: aload 12
    //   74: iconst_0
    //   75: aload 14
    //   77: aastore
    //   78: iconst_1
    //   79: istore 13
    //   81: lload 7
    //   83: invokestatic 377	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   86: astore 6
    //   88: aload 12
    //   90: iload 13
    //   92: aload 6
    //   94: aastore
    //   95: aload 10
    //   97: aload 12
    //   99: invokestatic 254	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   102: astore 12
    //   104: aload_0
    //   105: getfield 32	com/vvt/capture/mms/removeFromPath/e:d	Landroid/content/ContentResolver;
    //   108: astore 6
    //   110: getstatic 356	com/vvt/capture/mms/removeFromPath/a:removeFromPath	Landroid/net/Uri;
    //   113: astore 15
    //   115: iconst_0
    //   116: istore 9
    //   118: aconst_null
    //   119: astore 10
    //   121: iconst_0
    //   122: istore 13
    //   124: aconst_null
    //   125: astore 14
    //   127: aload 6
    //   129: aload 15
    //   131: aconst_null
    //   132: aload 12
    //   134: aconst_null
    //   135: aconst_null
    //   136: invokevirtual 130	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   139: astore 6
    //   141: aload 6
    //   143: ifnull +88 -> 231
    //   146: aload 6
    //   148: invokeinterface 180 1 0
    //   153: istore 16
    //   155: iload 16
    //   157: ifeq +74 -> 231
    //   160: aload_0
    //   161: aload 6
    //   163: invokespecial 359	com/vvt/capture/mms/removeFromPath/e:a	(Landroid/database/Cursor;)Ljava/util/List;
    //   166: astore 15
    //   168: aload 5
    //   170: aload 15
    //   172: invokeinterface 363 2 0
    //   177: pop
    //   178: goto -32 -> 146
    //   181: astore 15
    //   183: getstatic 26	com/vvt/capture/mms/removeFromPath/e:MyUncaughtExceptionHandler	Z
    //   186: istore 16
    //   188: iload 16
    //   190: ifeq +3 -> 193
    //   193: aload 6
    //   195: ifnull +10 -> 205
    //   198: aload 6
    //   200: invokeinterface 164 1 0
    //   205: getstatic 19	com/vvt/capture/mms/removeFromPath/e:a	Z
    //   208: istore 4
    //   210: iload 4
    //   212: ifeq +3 -> 215
    //   215: aload 5
    //   217: areturn
    //   218: aload_3
    //   219: ifnull +9 -> 228
    //   222: aload_3
    //   223: invokeinterface 164 1 0
    //   228: aload 6
    //   230: athrow
    //   231: aload 6
    //   233: ifnull -28 -> 205
    //   236: goto -38 -> 198
    //   239: astore 15
    //   241: aload 6
    //   243: astore_3
    //   244: aload 15
    //   246: astore 6
    //   248: goto -30 -> 218
    //   251: astore 6
    //   253: iconst_0
    //   254: istore 4
    //   256: aconst_null
    //   257: astore 6
    //   259: goto -76 -> 183
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	262	0	this	e
    //   0	262	1	paramg1	com.vvt.base.capture.FxFileObserverWorker
    //   0	262	2	paramg2	com.vvt.base.capture.FxFileObserverWorker
    //   1	243	3	localObject1	Object
    //   5	250	4	bool1	boolean
    //   15	201	5	localArrayList	java.util.ArrayList
    //   31	216	6	localObject2	Object
    //   251	1	6	localObject3	Object
    //   257	1	6	localObject4	Object
    //   38	44	7	l	long
    //   43	74	9	bool2	boolean
    //   53	67	10	str1	String
    //   56	3	11	i	int
    //   63	70	12	localObject5	Object
    //   66	57	13	j	int
    //   70	56	14	str2	String
    //   113	58	15	localObject6	Object
    //   181	1	15	localObject7	Object
    //   239	6	15	localObject8	Object
    //   153	36	16	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   146	153	181	finally
    //   161	166	181	finally
    //   170	178	181	finally
    //   183	186	239	finally
    //   58	63	251	finally
    //   75	78	251	finally
    //   81	86	251	finally
    //   92	95	251	finally
    //   97	102	251	finally
    //   104	108	251	finally
    //   110	113	251	finally
    //   135	139	251	finally
  }
  
  /* Error */
  public boolean a(long paramLong)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: ldc_w 373
    //   8: astore 5
    //   10: iconst_2
    //   11: istore 6
    //   13: iload 6
    //   15: anewarray 4	java/lang/Object
    //   18: astore 7
    //   20: iconst_0
    //   21: istore 8
    //   23: ldc 44
    //   25: astore 9
    //   27: aload 7
    //   29: iconst_0
    //   30: aload 9
    //   32: aastore
    //   33: iconst_1
    //   34: istore 8
    //   36: lload_1
    //   37: invokestatic 377	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   40: astore 9
    //   42: aload 7
    //   44: iload 8
    //   46: aload 9
    //   48: aastore
    //   49: aload 5
    //   51: aload 7
    //   53: invokestatic 254	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   56: astore 9
    //   58: aload_0
    //   59: getfield 32	com/vvt/capture/mms/removeFromPath/e:d	Landroid/content/ContentResolver;
    //   62: astore 5
    //   64: getstatic 356	com/vvt/capture/mms/removeFromPath/a:removeFromPath	Landroid/net/Uri;
    //   67: astore 7
    //   69: iconst_0
    //   70: istore 8
    //   72: aload 5
    //   74: aload 7
    //   76: aconst_null
    //   77: aload 9
    //   79: aconst_null
    //   80: aconst_null
    //   81: invokevirtual 130	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   84: astore 7
    //   86: aload 7
    //   88: ifnull +142 -> 230
    //   91: aload 7
    //   93: invokeinterface 180 1 0
    //   98: istore 10
    //   100: iload 10
    //   102: ifeq +128 -> 230
    //   105: iload_3
    //   106: istore 10
    //   108: aload 7
    //   110: ifnull +10 -> 120
    //   113: aload 7
    //   115: invokeinterface 164 1 0
    //   120: getstatic 19	com/vvt/capture/mms/removeFromPath/e:a	Z
    //   123: istore 6
    //   125: iload 6
    //   127: ifeq +3 -> 130
    //   130: getstatic 19	com/vvt/capture/mms/removeFromPath/e:a	Z
    //   133: istore 6
    //   135: iload 6
    //   137: ifeq +3 -> 140
    //   140: iload 10
    //   142: ireturn
    //   143: astore 5
    //   145: iconst_0
    //   146: istore 10
    //   148: aconst_null
    //   149: astore 5
    //   151: getstatic 26	com/vvt/capture/mms/removeFromPath/e:MyUncaughtExceptionHandler	Z
    //   154: istore 6
    //   156: iload 6
    //   158: ifeq +3 -> 161
    //   161: aload 5
    //   163: ifnull +10 -> 173
    //   166: aload 5
    //   168: invokeinterface 164 1 0
    //   173: iconst_0
    //   174: istore 10
    //   176: aconst_null
    //   177: astore 5
    //   179: goto -59 -> 120
    //   182: astore 5
    //   184: aload 4
    //   186: ifnull +10 -> 196
    //   189: aload 4
    //   191: invokeinterface 164 1 0
    //   196: aload 5
    //   198: athrow
    //   199: astore 5
    //   201: aload 7
    //   203: astore 4
    //   205: goto -21 -> 184
    //   208: astore 7
    //   210: aload 5
    //   212: astore 4
    //   214: aload 7
    //   216: astore 5
    //   218: goto -34 -> 184
    //   221: astore 5
    //   223: aload 7
    //   225: astore 5
    //   227: goto -76 -> 151
    //   230: iconst_0
    //   231: istore 10
    //   233: aconst_null
    //   234: astore 5
    //   236: goto -128 -> 108
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	239	0	this	e
    //   0	239	1	paramLong	long
    //   1	105	3	bool1	boolean
    //   3	210	4	localObject1	Object
    //   8	65	5	localObject2	Object
    //   143	1	5	localSQLiteException1	android.database.sqlite.SQLiteException
    //   149	29	5	localObject3	Object
    //   182	15	5	localObject4	Object
    //   199	12	5	localObject5	Object
    //   216	1	5	localObject6	Object
    //   221	1	5	localSQLiteException2	android.database.sqlite.SQLiteException
    //   225	10	5	localObject7	Object
    //   11	3	6	i	int
    //   123	34	6	bool2	boolean
    //   18	184	7	localObject8	Object
    //   208	16	7	localObject9	Object
    //   21	50	8	j	int
    //   25	53	9	localObject10	Object
    //   98	134	10	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   13	18	143	android/database/sqlite/SQLiteException
    //   30	33	143	android/database/sqlite/SQLiteException
    //   36	40	143	android/database/sqlite/SQLiteException
    //   46	49	143	android/database/sqlite/SQLiteException
    //   51	56	143	android/database/sqlite/SQLiteException
    //   58	62	143	android/database/sqlite/SQLiteException
    //   64	67	143	android/database/sqlite/SQLiteException
    //   80	84	143	android/database/sqlite/SQLiteException
    //   13	18	182	finally
    //   30	33	182	finally
    //   36	40	182	finally
    //   46	49	182	finally
    //   51	56	182	finally
    //   58	62	182	finally
    //   64	67	182	finally
    //   80	84	182	finally
    //   91	98	199	finally
    //   151	154	208	finally
    //   91	98	221	android/database/sqlite/SQLiteException
  }
  
  public FxSimpleEventReference b()
  {
    FxSimpleEventReference localFxSimpleEventReference = new com/vvt/base/capture/FxSimpleEventReference;
    localFxSimpleEventReference.<init>();
    Long localLong = Long.valueOf(c());
    localFxSimpleEventReference.setReference(localLong);
    return localFxSimpleEventReference;
  }
  
  /* Error */
  public long c()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: iconst_m1
    //   5: i2l
    //   6: lstore_3
    //   7: iload_1
    //   8: anewarray 84	java/lang/String
    //   11: astore 5
    //   13: iload_1
    //   14: anewarray 4	java/lang/Object
    //   17: astore 6
    //   19: ldc 44
    //   21: astore 7
    //   23: aload 6
    //   25: iconst_0
    //   26: aload 7
    //   28: aastore
    //   29: ldc_w 390
    //   32: aload 6
    //   34: invokestatic 254	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   37: astore 8
    //   39: aload 5
    //   41: iconst_0
    //   42: aload 8
    //   44: aastore
    //   45: aload_0
    //   46: getfield 32	com/vvt/capture/mms/removeFromPath/e:d	Landroid/content/ContentResolver;
    //   49: astore 8
    //   51: getstatic 356	com/vvt/capture/mms/removeFromPath/a:removeFromPath	Landroid/net/Uri;
    //   54: astore 6
    //   56: aconst_null
    //   57: astore 7
    //   59: aload 8
    //   61: aload 6
    //   63: aload 5
    //   65: aconst_null
    //   66: aconst_null
    //   67: aconst_null
    //   68: invokevirtual 130	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   71: astore 5
    //   73: aload 5
    //   75: ifnull +128 -> 203
    //   78: aload 5
    //   80: invokeinterface 393 1 0
    //   85: istore 9
    //   87: iload 9
    //   89: ifeq +114 -> 203
    //   92: iconst_0
    //   93: istore 9
    //   95: aconst_null
    //   96: astore 8
    //   98: aload 5
    //   100: iconst_0
    //   101: invokeinterface 397 2 0
    //   106: lstore_3
    //   107: lload_3
    //   108: lstore 10
    //   110: aload 5
    //   112: ifnull +10 -> 122
    //   115: aload 5
    //   117: invokeinterface 164 1 0
    //   122: getstatic 19	com/vvt/capture/mms/removeFromPath/e:a	Z
    //   125: istore 12
    //   127: iload 12
    //   129: ifeq +3 -> 132
    //   132: lload 10
    //   134: lreturn
    //   135: astore 8
    //   137: iconst_0
    //   138: istore 9
    //   140: aconst_null
    //   141: astore 8
    //   143: getstatic 26	com/vvt/capture/mms/removeFromPath/e:MyUncaughtExceptionHandler	Z
    //   146: istore_1
    //   147: iload_1
    //   148: ifeq +3 -> 151
    //   151: aload 8
    //   153: ifnull +10 -> 163
    //   156: aload 8
    //   158: invokeinterface 164 1 0
    //   163: lload_3
    //   164: lstore 10
    //   166: goto -44 -> 122
    //   169: aload_2
    //   170: ifnull +9 -> 179
    //   173: aload_2
    //   174: invokeinterface 164 1 0
    //   179: aload 8
    //   181: athrow
    //   182: astore 6
    //   184: aload 8
    //   186: astore_2
    //   187: aload 6
    //   189: astore 8
    //   191: goto -22 -> 169
    //   194: astore 8
    //   196: aload 5
    //   198: astore 8
    //   200: goto -57 -> 143
    //   203: lload_3
    //   204: lstore 10
    //   206: goto -96 -> 110
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	209	0	this	e
    //   1	147	1	bool1	boolean
    //   3	184	2	localObject1	Object
    //   6	198	3	l1	long
    //   11	186	5	localObject2	Object
    //   17	45	6	localObject3	Object
    //   182	6	6	localObject4	Object
    //   21	37	7	str	String
    //   37	60	8	localObject5	Object
    //   135	1	8	localObject6	Object
    //   141	49	8	localObject7	Object
    //   194	1	8	localObject8	Object
    //   198	1	8	localObject9	Object
    //   85	54	9	bool2	boolean
    //   108	97	10	l2	long
    //   125	3	12	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   45	49	135	finally
    //   51	54	135	finally
    //   67	71	135	finally
    //   143	146	182	finally
    //   78	85	194	finally
    //   100	106	194	finally
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/mms/removeFromPath/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */