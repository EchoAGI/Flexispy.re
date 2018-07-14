package com.vvt.io;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.media.ThumbnailUtils;
import android.provider.MediaStore.Images.Thumbnails;
import com.vvt.ag.b;
import com.vvt.ak.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.UUID;

public class o
{
  private static final boolean a;
  private static final boolean b;
  
  static
  {
    boolean bool1 = true;
    boolean bool2 = a.a;
    if (bool2)
    {
      bool2 = bool1;
      a = bool2;
      bool2 = a.e;
      if (!bool2) {
        break label34;
      }
    }
    for (;;)
    {
      b = bool1;
      return;
      bool2 = false;
      break;
      label34:
      bool1 = false;
    }
  }
  
  /* Error */
  private static Bitmap a(String paramString, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: getstatic 13	com/vvt/io/o:a	Z
    //   5: istore 4
    //   7: iload 4
    //   9: ifeq +3 -> 12
    //   12: new 20	java/io/FileInputStream
    //   15: astore 5
    //   17: aload 5
    //   19: aload_0
    //   20: invokespecial 24	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   23: aload 5
    //   25: invokestatic 30	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   28: astore_3
    //   29: iload_1
    //   30: i2f
    //   31: fstore 6
    //   33: iload_2
    //   34: i2f
    //   35: fstore 7
    //   37: fload 6
    //   39: fload 7
    //   41: fdiv
    //   42: fstore 6
    //   44: fload 6
    //   46: invokestatic 36	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   49: astore 8
    //   51: ldc 37
    //   53: istore 9
    //   55: ldc 38
    //   57: fstore 7
    //   59: aload 8
    //   61: invokevirtual 42	java/lang/Float:floatValue	()F
    //   64: fload 7
    //   66: fmul
    //   67: fstore 6
    //   69: fload 6
    //   71: f2i
    //   72: istore 10
    //   74: sipush 800
    //   77: istore 9
    //   79: ldc 43
    //   81: fstore 7
    //   83: aload_3
    //   84: iload 10
    //   86: iload 9
    //   88: iconst_0
    //   89: invokestatic 49	android/graphics/Bitmap:createScaledBitmap	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   92: astore_3
    //   93: aload 5
    //   95: invokestatic 54	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   98: getstatic 13	com/vvt/io/o:a	Z
    //   101: istore 4
    //   103: iload 4
    //   105: ifeq +3 -> 108
    //   108: aload_3
    //   109: areturn
    //   110: astore 5
    //   112: iconst_0
    //   113: istore 4
    //   115: aconst_null
    //   116: astore 5
    //   118: getstatic 18	com/vvt/io/o:removeFromPath	Z
    //   121: istore 10
    //   123: iload 10
    //   125: ifeq -32 -> 93
    //   128: goto -35 -> 93
    //   131: astore 11
    //   133: iconst_0
    //   134: istore 4
    //   136: aconst_null
    //   137: astore 5
    //   139: aload 11
    //   141: astore_3
    //   142: aload 5
    //   144: invokestatic 54	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   147: aload_3
    //   148: athrow
    //   149: astore_3
    //   150: goto -8 -> 142
    //   153: astore 8
    //   155: goto -37 -> 118
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	158	0	paramString	String
    //   0	158	1	paramInt1	int
    //   0	158	2	paramInt2	int
    //   1	147	3	localObject1	Object
    //   149	1	3	localObject2	Object
    //   5	130	4	bool1	boolean
    //   15	79	5	localFileInputStream	java.io.FileInputStream
    //   110	1	5	localFileNotFoundException1	java.io.FileNotFoundException
    //   116	27	5	localInputStream	java.io.InputStream
    //   31	39	6	f1	float
    //   35	47	7	f2	float
    //   49	11	8	localFloat	Float
    //   153	1	8	localFileNotFoundException2	java.io.FileNotFoundException
    //   53	34	9	i	int
    //   72	13	10	j	int
    //   121	3	10	bool2	boolean
    //   131	9	11	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   12	15	110	java/io/FileNotFoundException
    //   19	23	110	java/io/FileNotFoundException
    //   12	15	131	finally
    //   19	23	131	finally
    //   23	28	149	finally
    //   44	49	149	finally
    //   59	64	149	finally
    //   88	92	149	finally
    //   118	121	149	finally
    //   23	28	153	java/io/FileNotFoundException
    //   44	49	153	java/io/FileNotFoundException
    //   59	64	153	java/io/FileNotFoundException
    //   88	92	153	java/io/FileNotFoundException
  }
  
  /* Error */
  public static String a(Bitmap paramBitmap, String paramString)
  {
    // Byte code:
    //   0: getstatic 13	com/vvt/io/o:a	Z
    //   3: istore_2
    //   4: iload_2
    //   5: ifeq +3 -> 8
    //   8: aload_0
    //   9: ifnull +85 -> 94
    //   12: aload_1
    //   13: ldc 58
    //   15: invokestatic 61	com/vvt/io/o:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   18: astore_3
    //   19: aconst_null
    //   20: astore 4
    //   22: new 63	java/io/FileOutputStream
    //   25: astore 5
    //   27: aload 5
    //   29: aload_3
    //   30: invokespecial 64	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   33: getstatic 70	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   36: astore 4
    //   38: bipush 100
    //   40: istore 6
    //   42: aload_0
    //   43: aload 4
    //   45: iload 6
    //   47: aload 5
    //   49: invokevirtual 75	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   52: pop
    //   53: aload 5
    //   55: invokevirtual 79	java/io/FileOutputStream:flush	()V
    //   58: aload_0
    //   59: invokevirtual 82	android/graphics/Bitmap:recycle	()V
    //   62: aload 5
    //   64: invokestatic 85	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   67: aload_3
    //   68: areturn
    //   69: astore_3
    //   70: aconst_null
    //   71: astore 5
    //   73: getstatic 13	com/vvt/io/o:a	Z
    //   76: istore_2
    //   77: iload_2
    //   78: ifeq +3 -> 81
    //   81: ldc 87
    //   83: astore_3
    //   84: goto -22 -> 62
    //   87: aload 5
    //   89: invokestatic 85	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   92: aload_3
    //   93: athrow
    //   94: getstatic 13	com/vvt/io/o:a	Z
    //   97: istore_2
    //   98: iload_2
    //   99: ifeq +3 -> 102
    //   102: ldc 87
    //   104: astore_3
    //   105: goto -38 -> 67
    //   108: astore_3
    //   109: goto -22 -> 87
    //   112: astore_3
    //   113: goto -40 -> 73
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	paramBitmap	Bitmap
    //   0	116	1	paramString	String
    //   3	96	2	bool	boolean
    //   18	50	3	str1	String
    //   69	1	3	localObject1	Object
    //   83	22	3	str2	String
    //   108	1	3	localObject2	Object
    //   112	1	3	localObject3	Object
    //   20	24	4	localCompressFormat	Bitmap.CompressFormat
    //   25	63	5	localFileOutputStream	FileOutputStream
    //   40	6	6	i	int
    // Exception table:
    //   from	to	target	type
    //   22	25	69	finally
    //   29	33	69	finally
    //   73	76	108	finally
    //   33	36	112	finally
    //   47	53	112	finally
    //   53	58	112	finally
    //   58	62	112	finally
  }
  
  public static String a(String paramString, long paramLong, ContentResolver paramContentResolver, int paramInt)
  {
    boolean bool1 = a;
    if (bool1) {}
    String str1 = "";
    int i = 4;
    try
    {
      Object localObject1 = new String[i];
      int j = 0;
      String str2 = null;
      String str3 = "image_id";
      localObject1[0] = str3;
      j = 1;
      str3 = "width";
      localObject1[j] = str3;
      j = 2;
      str3 = "height";
      localObject1[j] = str3;
      j = 3;
      str3 = "_data";
      localObject1[j] = str3;
      j = 3;
      localObject1 = MediaStore.Images.Thumbnails.queryMiniThumbnail(paramContentResolver, paramLong, j, (String[])localObject1);
      if (localObject1 != null)
      {
        boolean bool3 = ((Cursor)localObject1).moveToFirst();
        if (bool3)
        {
          str2 = "_data";
          int k = ((Cursor)localObject1).getColumnIndex(str2);
          str1 = ((Cursor)localObject1).getString(k);
        }
      }
      if (localObject1 != null) {
        ((Cursor)localObject1).close();
      }
      bool2 = b.a(str1);
      if (!bool2) {
        str1 = a(str1, paramString, paramInt);
      }
      bool2 = a;
      if (!bool2) {}
    }
    finally
    {
      for (;;)
      {
        boolean bool2 = b;
        if (!bool2) {}
      }
    }
    bool2 = a;
    if (bool2) {}
    return str1;
  }
  
  private static String a(String paramString1, String paramString2)
  {
    String str1 = p.a(paramString1, paramString2);
    File localFile = new java/io/File;
    localFile.<init>(str1);
    Object localObject = new Object[2];
    String str2 = UUID.randomUUID().toString();
    localObject[0] = str2;
    int i = 1;
    str2 = "png";
    localObject[i] = str2;
    String str3 = String.format("%s.%s", (Object[])localObject);
    localObject = "";
    boolean bool1 = localFile.isDirectory();
    if (!bool1) {
      localFile.mkdirs();
    }
    boolean bool2 = localFile.exists();
    if (bool2) {}
    for (str1 = p.a(str1, str3);; str1 = p.a(paramString1, str3))
    {
      bool2 = a;
      if (bool2) {}
      return str1;
    }
  }
  
  public static String a(String paramString1, String paramString2, int paramInt)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    for (;;)
    {
      synchronized (o.class)
      {
        boolean bool2 = a;
        if (bool2) {}
        try
        {
          localObject2 = new android/graphics/BitmapFactory$Options;
          ((BitmapFactory.Options)localObject2).<init>();
          int j = 1;
          float f1 = Float.MIN_VALUE;
          ((BitmapFactory.Options)localObject2).inJustDecodeBounds = j;
          BitmapFactory.decodeFile(paramString1, (BitmapFactory.Options)localObject2);
          if (localObject2 == null) {
            continue;
          }
          j = ((BitmapFactory.Options)localObject2).outWidth;
          if (j <= 0) {
            continue;
          }
          j = ((BitmapFactory.Options)localObject2).outWidth;
          int i = ((BitmapFactory.Options)localObject2).outHeight;
          f1 = j;
          f2 = i;
          f2 = f1 / f2;
          bool4 = a;
          if (bool4) {}
          f1 = paramInt;
          f2 *= f1;
          i = (int)f2;
          localObject2 = a(paramString1, i, paramInt);
          localObject8 = localObject2;
        }
        finally
        {
          boolean bool4;
          Object localObject8;
          try
          {
            Object localObject2;
            bool3 = a;
            if (bool3) {}
            localBitmap = BitmapFactory.decodeFile(paramString1);
            localBitmap = ThumbnailUtils.extractThumbnail(localBitmap, paramInt, paramInt);
            localObject8 = localBitmap;
            continue;
          }
          finally
          {
            bool3 = b;
            if (bool3) {}
            localObject8 = null;
          }
          continue;
          try
          {
            bool4 = b;
            if ((!bool4) || (localObject8 != null)) {
              ((Bitmap)localObject8).recycle();
            }
            d.a(localOutputStream);
            bool3 = false;
            localOutputStream = null;
            f2 = 0.0F;
            continue;
          }
          finally
          {
            OutputStream localOutputStream;
            localObject1 = localObject6;
            localObject7 = localObject10;
          }
          if (localObject8 == null) {
            continue;
          }
          ((Bitmap)localObject8).recycle();
          d.a((OutputStream)localObject1);
        }
        if (localObject8 != null)
        {
          try
          {
            bool3 = a;
            if (bool3) {}
            localObject2 = "thumbnails";
            str = a(paramString2, (String)localObject2);
            localObject2 = new java/io/FileOutputStream;
            ((FileOutputStream)localObject2).<init>(str);
          }
          finally
          {
            String str;
            Bitmap.CompressFormat localCompressFormat;
            int k;
            Bitmap localBitmap;
            bool3 = false;
            localOutputStream = null;
            f2 = 0.0F;
          }
          try
          {
            localCompressFormat = Bitmap.CompressFormat.JPEG;
            k = 90;
            ((Bitmap)localObject8).compress(localCompressFormat, k, (OutputStream)localObject2);
            ((FileOutputStream)localObject2).flush();
            bool1 = a;
            if ((!bool1) || (localObject8 != null)) {
              ((Bitmap)localObject8).recycle();
            }
            d.a((OutputStream)localObject2);
            localObject2 = str;
            bool1 = a;
            if (bool1) {}
            return (String)localObject2;
          }
          finally
          {
            continue;
          }
          bool3 = a;
          if (bool3) {}
          localObject2 = BitmapFactory.decodeFile(paramString1);
          localObject2 = ThumbnailUtils.extractThumbnail((Bitmap)localObject2, paramInt, paramInt);
        }
      }
      boolean bool3 = false;
      Object localObject7 = null;
      float f2 = 0.0F;
    }
  }
  
  /* Error */
  public static String b(String paramString, long paramLong, ContentResolver paramContentResolver, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: ldc 87
    //   5: astore 6
    //   7: iconst_1
    //   8: istore 7
    //   10: iconst_0
    //   11: istore 8
    //   13: fconst_0
    //   14: fstore 9
    //   16: aconst_null
    //   17: astore 10
    //   19: aload_3
    //   20: lload_1
    //   21: iload 7
    //   23: aconst_null
    //   24: invokestatic 203	android/provider/MediaStore$Video$Thumbnails:getThumbnail	(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   27: astore 6
    //   29: aload 6
    //   31: ifnull +215 -> 246
    //   34: aload 6
    //   36: invokevirtual 207	android/graphics/Bitmap:getWidth	()I
    //   39: istore 8
    //   41: iload 8
    //   43: i2f
    //   44: fstore 9
    //   46: aload 6
    //   48: invokevirtual 210	android/graphics/Bitmap:getHeight	()I
    //   51: istore 11
    //   53: iload 11
    //   55: i2f
    //   56: fstore 12
    //   58: fload 9
    //   60: fload 12
    //   62: fdiv
    //   63: fstore 9
    //   65: getstatic 13	com/vvt/io/o:a	Z
    //   68: istore 11
    //   70: iload 11
    //   72: ifeq +3 -> 75
    //   75: iload 4
    //   77: i2f
    //   78: fstore 12
    //   80: fload 9
    //   82: fload 12
    //   84: fmul
    //   85: fstore 9
    //   87: fload 9
    //   89: f2i
    //   90: istore 8
    //   92: iconst_1
    //   93: istore 11
    //   95: ldc 8
    //   97: fstore 12
    //   99: aload 6
    //   101: iload 8
    //   103: iload 4
    //   105: iload 11
    //   107: invokestatic 49	android/graphics/Bitmap:createScaledBitmap	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   110: astore 13
    //   112: getstatic 13	com/vvt/io/o:a	Z
    //   115: istore 7
    //   117: iload 7
    //   119: ifeq +3 -> 122
    //   122: ldc -69
    //   124: astore 6
    //   126: aload_0
    //   127: aload 6
    //   129: invokestatic 61	com/vvt/io/o:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   132: astore 6
    //   134: new 63	java/io/FileOutputStream
    //   137: astore 10
    //   139: aload 10
    //   141: aload 6
    //   143: invokespecial 64	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   146: getstatic 213	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   149: astore 5
    //   151: bipush 100
    //   153: istore 14
    //   155: aload 13
    //   157: aload 5
    //   159: iload 14
    //   161: aload 10
    //   163: invokevirtual 75	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   166: pop
    //   167: aload 10
    //   169: invokevirtual 79	java/io/FileOutputStream:flush	()V
    //   172: aload 13
    //   174: invokevirtual 82	android/graphics/Bitmap:recycle	()V
    //   177: aload 10
    //   179: invokestatic 85	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   182: aload 6
    //   184: areturn
    //   185: astore 6
    //   187: iconst_0
    //   188: istore 8
    //   190: aconst_null
    //   191: astore 10
    //   193: fconst_0
    //   194: fstore 9
    //   196: ldc 87
    //   198: astore 6
    //   200: aload 10
    //   202: invokestatic 85	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   205: goto -23 -> 182
    //   208: astore 6
    //   210: getstatic 18	com/vvt/io/o:removeFromPath	Z
    //   213: istore 7
    //   215: iload 7
    //   217: ifeq +3 -> 220
    //   220: ldc 87
    //   222: astore 6
    //   224: goto -42 -> 182
    //   227: astore 6
    //   229: iconst_0
    //   230: istore 8
    //   232: aconst_null
    //   233: astore 10
    //   235: fconst_0
    //   236: fstore 9
    //   238: aload 10
    //   240: invokestatic 85	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   243: aload 6
    //   245: athrow
    //   246: ldc 87
    //   248: astore 6
    //   250: goto -68 -> 182
    //   253: astore 6
    //   255: goto -17 -> 238
    //   258: astore 6
    //   260: goto -64 -> 196
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	263	0	paramString	String
    //   0	263	1	paramLong	long
    //   0	263	3	paramContentResolver	ContentResolver
    //   0	263	4	paramInt	int
    //   1	157	5	localCompressFormat	Bitmap.CompressFormat
    //   5	178	6	localObject1	Object
    //   185	1	6	localException1	Exception
    //   198	1	6	str1	String
    //   208	1	6	localObject2	Object
    //   222	1	6	str2	String
    //   227	17	6	localObject3	Object
    //   248	1	6	str3	String
    //   253	1	6	localObject4	Object
    //   258	1	6	localException2	Exception
    //   8	14	7	i	int
    //   115	101	7	bool1	boolean
    //   11	220	8	j	int
    //   14	223	9	f1	float
    //   17	222	10	localFileOutputStream	FileOutputStream
    //   51	3	11	k	int
    //   68	38	11	bool2	boolean
    //   56	42	12	f2	float
    //   110	63	13	localBitmap	Bitmap
    //   153	7	14	m	int
    // Exception table:
    //   from	to	target	type
    //   134	137	185	java/lang/Exception
    //   141	146	185	java/lang/Exception
    //   23	27	208	finally
    //   34	39	208	finally
    //   46	51	208	finally
    //   65	68	208	finally
    //   105	110	208	finally
    //   112	115	208	finally
    //   127	132	208	finally
    //   177	182	208	finally
    //   200	205	208	finally
    //   238	243	208	finally
    //   243	246	208	finally
    //   134	137	227	finally
    //   141	146	227	finally
    //   146	149	253	finally
    //   161	167	253	finally
    //   167	172	253	finally
    //   172	177	253	finally
    //   146	149	258	java/lang/Exception
    //   161	167	258	java/lang/Exception
    //   167	172	258	java/lang/Exception
    //   172	177	258	java/lang/Exception
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/io/o.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */