package com.vvt.io;

import android.os.Environment;
import android.webkit.MimeTypeMap;
import com.vvt.ak.a;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class d
{
  private static final boolean a;
  private static final boolean b;
  private static List c;
  
  static
  {
    boolean bool = a.a;
    if (bool) {
      bool = true;
    }
    for (;;)
    {
      a = bool;
      b = a.e;
      Object localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      c = (List)localObject;
      localObject = c;
      Pattern localPattern = Pattern.compile("^/storage/emulated/\\d{1,2}");
      ((List)localObject).add(localPattern);
      localObject = c;
      localPattern = Pattern.compile("^/data/media/\\d{1,2}");
      ((List)localObject).add(localPattern);
      localObject = c;
      localPattern = Pattern.compile("^/mnt/shell/emulated/\\d{1,2}");
      ((List)localObject).add(localPattern);
      localObject = c;
      localPattern = Pattern.compile("^/sdcard/sdcard0");
      ((List)localObject).add(localPattern);
      localObject = c;
      localPattern = Pattern.compile("^/sdcard");
      ((List)localObject).add(localPattern);
      localObject = c;
      localPattern = Pattern.compile("^/storage");
      ((List)localObject).add(localPattern);
      return;
      bool = false;
      localObject = null;
    }
  }
  
  public static int a(FileDescriptor paramFileDescriptor)
  {
    i = -1;
    Object localObject = FileDescriptor.class;
    String str = "descriptor";
    try
    {
      localObject = ((Class)localObject).getDeclaredField(str);
      boolean bool1 = true;
      ((Field)localObject).setAccessible(bool1);
      localObject = ((Field)localObject).get(paramFileDescriptor);
      localObject = (Integer)localObject;
      j = ((Integer)localObject).intValue();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        int j;
        boolean bool2 = b;
        if (bool2) {}
        bool2 = i;
      }
    }
    return j;
  }
  
  private static long a(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    int i = 4096;
    byte[] arrayOfByte = new byte[i];
    long l2;
    for (long l1 = 0L;; l1 += l2)
    {
      int j = paramInputStream.read(arrayOfByte);
      int k = -1;
      if (j == k) {
        return l1;
      }
      k = 0;
      paramOutputStream.write(arrayOfByte, 0, j);
      l2 = j;
    }
  }
  
  public static String a()
  {
    int i = 1;
    boolean bool1 = a;
    if (bool1) {}
    String str = Environment.getExternalStorageDirectory().getAbsolutePath();
    int j = b();
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    ((List)localObject).add(str);
    Object[] arrayOfObject = new Object[i];
    Integer localInteger1 = Integer.valueOf(j);
    arrayOfObject[0] = localInteger1;
    str = String.format("/storage/emulated/%s", arrayOfObject);
    ((List)localObject).add(str);
    arrayOfObject = new Object[i];
    localInteger1 = Integer.valueOf(j);
    arrayOfObject[0] = localInteger1;
    str = String.format("/data/media/%s", arrayOfObject);
    ((List)localObject).add(str);
    arrayOfObject = new Object[i];
    Integer localInteger2 = Integer.valueOf(j);
    arrayOfObject[0] = localInteger2;
    str = String.format("/mnt/shell/emulated/%s", arrayOfObject);
    ((List)localObject).add(str);
    ((List)localObject).add("/sdcard/sdcard0");
    ((List)localObject).add("/sdcard");
    str = "/storage";
    ((List)localObject).add(str);
    j = 0;
    localInteger2 = null;
    localObject = ((List)localObject).iterator();
    boolean bool3;
    do
    {
      bool1 = ((Iterator)localObject).hasNext();
      if (!bool1) {
        break;
      }
      str = (String)((Iterator)localObject).next();
      bool3 = m(str);
    } while (!bool3);
    for (;;)
    {
      boolean bool2 = a;
      if (bool2) {}
      bool2 = a;
      if (bool2) {}
      return str;
      bool1 = false;
      str = null;
    }
  }
  
  public static String a(String paramString)
  {
    String str1 = "";
    File localFile = new java/io/File;
    localFile.<init>(paramString);
    String str2 = localFile.getName();
    boolean bool = localFile.exists();
    if (bool)
    {
      int j = str2.lastIndexOf(".") + 1;
      int i = str2.length();
      str1 = str2.substring(j, i);
    }
    return str1;
  }
  
  public static String a(String paramString, boolean paramBoolean)
  {
    String str1 = "";
    File localFile = new java/io/File;
    localFile.<init>(paramString);
    String str2 = localFile.getName();
    int j;
    int i;
    if (paramBoolean)
    {
      boolean bool = localFile.exists();
      if (bool)
      {
        j = str2.lastIndexOf(".") + 1;
        i = str2.length();
      }
    }
    for (str1 = str2.substring(j, i);; str1 = str2.substring(j, i))
    {
      return str1;
      j = str2.lastIndexOf(".") + 1;
      i = str2.length();
    }
  }
  
  /* Error */
  public static String a(byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: getstatic 15	com/vvt/io/d:a	Z
    //   8: istore 5
    //   10: iload 5
    //   12: ifeq +3 -> 15
    //   15: aload_0
    //   16: ifnull +195 -> 211
    //   19: aload_0
    //   20: arraylength
    //   21: istore 5
    //   23: iload 5
    //   25: ifle +186 -> 211
    //   28: new 101	java/io/File
    //   31: astore 6
    //   33: aload 6
    //   35: aload_1
    //   36: invokespecial 152	java/io/File:<init>	(Ljava/lang/String;)V
    //   39: aload 6
    //   41: invokevirtual 158	java/io/File:exists	()Z
    //   44: istore 7
    //   46: iload 7
    //   48: ifne +9 -> 57
    //   51: aload 6
    //   53: invokevirtual 174	java/io/File:mkdirs	()Z
    //   56: pop
    //   57: new 176	java/lang/StringBuilder
    //   60: astore 6
    //   62: aload 6
    //   64: invokespecial 177	java/lang/StringBuilder:<init>	()V
    //   67: aload 6
    //   69: aload_1
    //   70: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: astore 6
    //   75: getstatic 185	java/io/File:separator	Ljava/lang/String;
    //   78: astore 8
    //   80: aload 6
    //   82: aload 8
    //   84: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: aload_2
    //   88: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: invokevirtual 188	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   94: astore 6
    //   96: new 190	java/io/FileOutputStream
    //   99: astore 8
    //   101: aload 8
    //   103: aload 6
    //   105: invokespecial 191	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   108: aload 8
    //   110: aload_0
    //   111: invokevirtual 194	java/io/FileOutputStream:write	([B)V
    //   114: aload 8
    //   116: invokestatic 197	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   119: getstatic 15	com/vvt/io/d:a	Z
    //   122: istore_3
    //   123: iload_3
    //   124: ifeq +3 -> 127
    //   127: getstatic 15	com/vvt/io/d:a	Z
    //   130: istore_3
    //   131: iload_3
    //   132: ifeq +3 -> 135
    //   135: aload 6
    //   137: areturn
    //   138: astore 6
    //   140: iconst_0
    //   141: istore 5
    //   143: aconst_null
    //   144: astore 6
    //   146: getstatic 20	com/vvt/io/d:removeFromPath	Z
    //   149: istore 7
    //   151: iload 7
    //   153: ifeq +3 -> 156
    //   156: aload 6
    //   158: invokestatic 197	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   161: iconst_0
    //   162: istore 5
    //   164: aconst_null
    //   165: astore 6
    //   167: goto -48 -> 119
    //   170: astore 6
    //   172: aload 4
    //   174: invokestatic 197	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   177: aload 6
    //   179: athrow
    //   180: astore 6
    //   182: aload 8
    //   184: astore 4
    //   186: goto -14 -> 172
    //   189: astore 9
    //   191: aload 6
    //   193: astore 4
    //   195: aload 9
    //   197: astore 6
    //   199: goto -27 -> 172
    //   202: astore 6
    //   204: aload 8
    //   206: astore 6
    //   208: goto -62 -> 146
    //   211: iconst_0
    //   212: istore 5
    //   214: aconst_null
    //   215: astore 6
    //   217: goto -98 -> 119
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	220	0	paramArrayOfByte	byte[]
    //   0	220	1	paramString1	String
    //   0	220	2	paramString2	String
    //   1	131	3	bool1	boolean
    //   3	191	4	localObject1	Object
    //   8	3	5	bool2	boolean
    //   21	192	5	i	int
    //   31	105	6	localObject2	Object
    //   138	1	6	localException1	Exception
    //   144	22	6	localOutputStream	OutputStream
    //   170	8	6	localObject3	Object
    //   180	12	6	localObject4	Object
    //   197	1	6	localObject5	Object
    //   202	1	6	localException2	Exception
    //   206	10	6	localObject6	Object
    //   44	108	7	bool3	boolean
    //   78	127	8	localObject7	Object
    //   189	7	9	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   96	99	138	java/lang/Exception
    //   103	108	138	java/lang/Exception
    //   96	99	170	finally
    //   103	108	170	finally
    //   110	114	180	finally
    //   146	149	189	finally
    //   110	114	202	java/lang/Exception
  }
  
  public static void a(BufferedReader paramBufferedReader)
  {
    if (paramBufferedReader != null) {}
    try
    {
      paramBufferedReader.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public static void a(File paramFile)
  {
    int i = paramFile.isDirectory();
    if (i != 0)
    {
      File[] arrayOfFile = paramFile.listFiles();
      int k = arrayOfFile.length;
      i = 0;
      while (i < k)
      {
        File localFile = arrayOfFile[i];
        a(localFile);
        int j;
        i += 1;
      }
    }
    paramFile.delete();
  }
  
  public static void a(FileReader paramFileReader)
  {
    if (paramFileReader != null) {}
    try
    {
      paramFileReader.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public static void a(InputStream paramInputStream)
  {
    if (paramInputStream != null) {}
    try
    {
      paramInputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public static void a(ObjectInput paramObjectInput)
  {
    if (paramObjectInput != null) {}
    try
    {
      paramObjectInput.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public static void a(ObjectInputStream paramObjectInputStream)
  {
    if (paramObjectInputStream != null) {}
    try
    {
      paramObjectInputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public static void a(ObjectOutput paramObjectOutput)
  {
    if (paramObjectOutput != null) {}
    try
    {
      paramObjectOutput.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public static void a(ObjectOutputStream paramObjectOutputStream)
  {
    if (paramObjectOutputStream != null) {}
    try
    {
      paramObjectOutputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public static void a(OutputStream paramOutputStream)
  {
    if (paramOutputStream != null) {}
    try
    {
      paramOutputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public static void a(String paramString1, String paramString2)
  {
    Object localObject1 = new java/io/File;
    ((File)localObject1).<init>(paramString1);
    File localFile = new java/io/File;
    localFile.<init>(paramString2);
    Object localObject3 = new java/io/FileInputStream;
    ((FileInputStream)localObject3).<init>((File)localObject1);
    localObject1 = ((FileInputStream)localObject3).getChannel();
    localObject3 = new java/io/FileOutputStream;
    ((FileOutputStream)localObject3).<init>(localFile);
    FileChannel localFileChannel = ((FileOutputStream)localObject3).getChannel();
    long l1 = 0L;
    try
    {
      long l2 = ((FileChannel)localObject1).size();
      ((FileChannel)localObject1).transferTo(l1, l2, localFileChannel);
      return;
    }
    catch (IOException localIOException)
    {
      throw localIOException;
    }
    finally
    {
      if (localObject1 != null) {
        ((FileChannel)localObject1).close();
      }
      if (localFileChannel != null) {
        localFileChannel.close();
      }
    }
  }
  
  public static boolean a(File[] paramArrayOfFile, String paramString1, StringBuilder paramStringBuilder, String paramString2)
  {
    boolean bool1 = false;
    int i = a;
    if (i != 0) {}
    int m = paramArrayOfFile.length;
    int n = 0;
    if (n < m)
    {
      Object localObject = paramArrayOfFile[n];
      boolean bool4 = ((File)localObject).exists();
      if (bool4)
      {
        File[] arrayOfFile = ((File)localObject).listFiles();
        if (arrayOfFile != null)
        {
          i = 0;
          localObject = null;
          label63:
          int i1 = arrayOfFile.length;
          if (i >= i1) {
            break label206;
          }
          File localFile = arrayOfFile[i];
          String str = localFile.getName();
          boolean bool5 = str.startsWith(paramString1);
          if (bool5)
          {
            str = a(localFile.getAbsolutePath());
            bool5 = str.equals(paramString2);
            if (bool5)
            {
              long l1 = localFile.length();
              long l2 = 0L;
              bool5 = l1 < l2;
              if (bool5)
              {
                localObject = localFile.getAbsolutePath();
                paramStringBuilder.append((String)localObject);
                i = a;
                if (i != 0) {}
                i = a;
                if (i != 0) {}
                bool1 = true;
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      return bool1;
      int j;
      i += 1;
      break label63;
      boolean bool2 = a;
      if (bool2) {}
      for (;;)
      {
        label206:
        int k = n + 1;
        n = k;
        break;
        bool3 = a;
        if (!bool3) {}
      }
      boolean bool3 = a;
      if (bool3) {}
      bool3 = a;
      if (!bool3) {}
    }
  }
  
  /* Error */
  private static int b()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_0
    //   2: getstatic 15	com/vvt/io/d:a	Z
    //   5: istore_1
    //   6: iload_1
    //   7: ifeq +3 -> 10
    //   10: ldc_w 268
    //   13: astore_2
    //   14: aload_2
    //   15: invokestatic 272	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   18: astore_2
    //   19: aload_2
    //   20: ifnull +131 -> 151
    //   23: iconst_1
    //   24: istore_3
    //   25: iload_3
    //   26: anewarray 58	java/lang/Class
    //   29: astore 4
    //   31: aconst_null
    //   32: astore 5
    //   34: getstatic 276	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   37: astore 6
    //   39: aload 4
    //   41: iconst_0
    //   42: aload 6
    //   44: aastore
    //   45: ldc_w 278
    //   48: astore 5
    //   50: aload_2
    //   51: aload 5
    //   53: aload 4
    //   55: invokevirtual 282	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   58: astore_2
    //   59: aload_2
    //   60: ifnull +91 -> 151
    //   63: iconst_1
    //   64: istore_3
    //   65: iload_3
    //   66: anewarray 4	java/lang/Object
    //   69: astore 4
    //   71: aconst_null
    //   72: astore 5
    //   74: invokestatic 287	android/os/Process:myUid	()I
    //   77: istore 7
    //   79: iload 7
    //   81: invokestatic 113	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   84: astore 6
    //   86: aload 4
    //   88: iconst_0
    //   89: aload 6
    //   91: aastore
    //   92: aconst_null
    //   93: astore 5
    //   95: aload_2
    //   96: aconst_null
    //   97: aload 4
    //   99: invokevirtual 293	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   102: astore_2
    //   103: aload_2
    //   104: checkcast 74	java/lang/Integer
    //   107: astore_2
    //   108: aload_2
    //   109: invokevirtual 78	java/lang/Integer:intValue	()I
    //   112: istore_1
    //   113: getstatic 15	com/vvt/io/d:a	Z
    //   116: istore_0
    //   117: iload_0
    //   118: ifeq +3 -> 121
    //   121: getstatic 15	com/vvt/io/d:a	Z
    //   124: istore_0
    //   125: iload_0
    //   126: ifeq +3 -> 129
    //   129: iload_1
    //   130: ireturn
    //   131: astore_2
    //   132: iconst_0
    //   133: istore_1
    //   134: aconst_null
    //   135: astore_2
    //   136: getstatic 20	com/vvt/io/d:removeFromPath	Z
    //   139: istore_0
    //   140: iload_0
    //   141: ifeq -20 -> 121
    //   144: goto -23 -> 121
    //   147: pop
    //   148: goto -12 -> 136
    //   151: iconst_0
    //   152: istore_1
    //   153: aconst_null
    //   154: astore_2
    //   155: goto -34 -> 121
    // Local variable table:
    //   start	length	slot	name	signature
    //   1	140	0	bool1	boolean
    //   5	2	1	bool2	boolean
    //   112	41	1	i	int
    //   13	96	2	localObject1	Object
    //   131	1	2	localException1	Exception
    //   135	20	2	localObject2	Object
    //   24	42	3	j	int
    //   29	69	4	localObject3	Object
    //   32	62	5	str	String
    //   37	53	6	localObject4	Object
    //   77	3	7	k	int
    //   147	1	11	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   14	18	131	java/lang/Exception
    //   25	29	131	java/lang/Exception
    //   34	37	131	java/lang/Exception
    //   42	45	131	java/lang/Exception
    //   53	58	131	java/lang/Exception
    //   65	69	131	java/lang/Exception
    //   74	77	131	java/lang/Exception
    //   79	84	131	java/lang/Exception
    //   89	92	131	java/lang/Exception
    //   97	102	131	java/lang/Exception
    //   103	107	131	java/lang/Exception
    //   108	112	131	java/lang/Exception
    //   113	116	147	java/lang/Exception
  }
  
  public static long b(File paramFile)
  {
    long l1 = 0L;
    int i = paramFile.exists();
    if (i != 0)
    {
      File[] arrayOfFile = paramFile.listFiles();
      i = 0;
      int k = arrayOfFile.length;
      if (i < k)
      {
        File localFile = arrayOfFile[i];
        boolean bool = localFile.isDirectory();
        long l2;
        if (bool)
        {
          localFile = arrayOfFile[i];
          l2 = b(localFile);
        }
        for (l1 += l2;; l1 += l2)
        {
          int j;
          i += 1;
          break;
          localFile = arrayOfFile[j];
          l2 = localFile.length();
        }
      }
    }
    return l1;
  }
  
  public static void b(String paramString)
  {
    Object localObject1 = new java/io/File;
    ((File)localObject1).<init>(paramString);
    boolean bool1 = ((File)localObject1).exists();
    Object localObject2;
    if (!bool1)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Delete: no such file or directory: " + paramString;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    bool1 = ((File)localObject1).canWrite();
    if (!bool1)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Delete: write protected: " + paramString;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    bool1 = ((File)localObject1).isDirectory();
    if (bool1)
    {
      localObject2 = ((File)localObject1).list();
      int i = localObject2.length;
      if (i > 0)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "Delete: directory not empty: " + paramString;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    boolean bool2 = ((File)localObject1).delete();
    if (!bool2)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("Delete: deletion failed");
      throw ((Throwable)localObject1);
    }
  }
  
  private static byte[] b(InputStream paramInputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    a(paramInputStream, localByteArrayOutputStream);
    return localByteArrayOutputStream.toByteArray();
  }
  
  public static List c(File paramFile)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile != null)
    {
      int i = arrayOfFile.length;
      int j = 0;
      if (j < i)
      {
        Object localObject = arrayOfFile[j];
        boolean bool = ((File)localObject).isDirectory();
        if (bool)
        {
          localObject = c((File)localObject);
          localArrayList.addAll((Collection)localObject);
        }
        for (;;)
        {
          j += 1;
          break;
          localArrayList.add(localObject);
        }
      }
    }
    return localArrayList;
  }
  
  public static byte[] c(String paramString)
  {
    byte[] arrayOfByte = new byte[0];
    try
    {
      File localFile = new java/io/File;
      localFile.<init>(paramString);
      arrayOfByte = d(localFile);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool = b;
        if (!bool) {}
      }
    }
    return arrayOfByte;
  }
  
  public static String d(String paramString)
  {
    str1 = "";
    try
    {
      str2 = new java/lang/String;
      byte[] arrayOfByte = c(paramString);
      str2.<init>(arrayOfByte);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str2;
        boolean bool = b;
        if (bool) {}
        String str3 = str1;
      }
    }
    return str2;
  }
  
  private static byte[] d(File paramFile)
  {
    FileInputStream localFileInputStream = null;
    try
    {
      localFileInputStream = e(paramFile);
      byte[] arrayOfByte = b(localFileInputStream);
      return arrayOfByte;
    }
    finally
    {
      a(localFileInputStream);
    }
  }
  
  private static FileInputStream e(File paramFile)
  {
    boolean bool = paramFile.exists();
    Object localObject2;
    if (bool)
    {
      bool = paramFile.isDirectory();
      if (bool)
      {
        localObject1 = new java/io/IOException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "File '" + paramFile + "' exists but is a directory";
        ((IOException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      bool = paramFile.canRead();
      if (!bool)
      {
        localObject1 = new java/io/IOException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "File '" + paramFile + "' cannot be read";
        ((IOException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    else
    {
      localObject1 = new java/io/FileNotFoundException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "File '" + paramFile + "' does not exist";
      ((FileNotFoundException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = new java/io/FileInputStream;
    ((FileInputStream)localObject1).<init>(paramFile);
    return (FileInputStream)localObject1;
  }
  
  public static boolean e(String paramString)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramString == null)
    {
      bool2 = a;
      if (!bool2) {}
    }
    for (;;)
    {
      return bool1;
      Object localObject = new java/io/File;
      ((File)localObject).<init>(paramString);
      boolean bool3 = ((File)localObject).exists();
      if (bool3)
      {
        bool2 = ((File)localObject).canRead();
        if (bool2)
        {
          localObject = paramString.toLowerCase();
          String str = "/dcim/";
          bool2 = ((String)localObject).contains(str);
          if (bool2)
          {
            localObject = paramString.toLowerCase();
            str = "/dcim/.thumbnails";
            bool2 = ((String)localObject).contains(str);
            if (!bool2) {
              bool1 = true;
            }
          }
        }
      }
    }
  }
  
  public static boolean f(String paramString)
  {
    File localFile = new java/io/File;
    localFile.<init>(paramString);
    return localFile.exists();
  }
  
  public static String g(String paramString)
  {
    return paramString.replace("/storage/emulated/0", "/sdcard").replace("/storage", "/sdcard").replace("/sdcard/sdcard0", "/sdcard");
  }
  
  public static String h(String paramString)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = l(paramString);
    if (bool1)
    {
      bool1 = a;
      if (!bool1) {}
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      bool1 = a;
      if (bool1) {}
      return paramString;
      int i = b();
      Object localObject = c;
      Iterator localIterator = ((List)localObject).iterator();
      boolean bool4;
      do
      {
        Matcher localMatcher;
        do
        {
          bool1 = localIterator.hasNext();
          if (!bool1) {
            break;
          }
          localObject = (Pattern)localIterator.next();
          localMatcher = ((Pattern)localObject).matcher(paramString);
          bool1 = localMatcher.find();
        } while (!bool1);
        localObject = localMatcher.replaceAll("/sdcard");
        boolean bool3 = a;
        if (bool3) {}
        bool3 = l((String)localObject);
        int j;
        if (bool3)
        {
          j = a;
          if (j != 0) {}
          paramString = (String)localObject;
          break;
        }
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        String str = "/storage/emulated/";
        localObject = str + j;
        localObject = localMatcher.replaceAll((String)localObject);
        bool3 = a;
        if (bool3) {}
        bool3 = l((String)localObject);
        int k;
        if (bool3)
        {
          k = a;
          if (k != 0) {}
          paramString = (String)localObject;
          break;
        }
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        str = "/data/media/";
        localObject = str + k;
        localObject = localMatcher.replaceAll((String)localObject);
        bool3 = a;
        if (bool3) {}
        bool3 = l((String)localObject);
        int m;
        if (bool3)
        {
          m = a;
          if (m != 0) {}
          paramString = (String)localObject;
          break;
        }
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        str = "/mnt/shell/emulated/";
        localObject = str + m;
        localObject = localMatcher.replaceAll((String)localObject);
        bool4 = a;
        if (bool4) {}
        bool4 = l((String)localObject);
      } while (!bool4);
      boolean bool2 = a;
      if (bool2) {}
      paramString = (String)localObject;
    }
  }
  
  public static String i(String paramString)
  {
    String str1 = null;
    if (paramString != null) {}
    try
    {
      String str2 = MimeTypeMap.getFileExtensionFromUrl(paramString);
      if (str2 != null)
      {
        MimeTypeMap localMimeTypeMap = MimeTypeMap.getSingleton();
        str1 = localMimeTypeMap.getMimeTypeFromExtension(str2);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool = b;
        if (!bool) {}
      }
    }
    return str1;
  }
  
  public static String j(String paramString)
  {
    Object localObject = new java/io/File;
    ((File)localObject).<init>(paramString);
    localObject = ((File)localObject).getName();
    String str = ".";
    int i = ((String)localObject).lastIndexOf(str);
    if (i > 0) {
      localObject = ((String)localObject).substring(0, i);
    }
    return (String)localObject;
  }
  
  public static String k(String paramString)
  {
    File localFile = new java/io/File;
    localFile.<init>(paramString);
    return localFile.getName();
  }
  
  private static boolean l(String paramString)
  {
    File localFile = new java/io/File;
    localFile.<init>(paramString);
    boolean bool1 = localFile.exists();
    boolean bool2;
    if (bool1)
    {
      bool2 = localFile.canRead();
      if (bool2) {
        bool2 = true;
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localFile = null;
    }
  }
  
  private static boolean m(String paramString)
  {
    File localFile = new java/io/File;
    localFile.<init>(paramString);
    boolean bool1 = localFile.exists();
    boolean bool2;
    if (bool1)
    {
      bool2 = localFile.canWrite();
      if (bool2) {
        bool2 = true;
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localFile = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/io/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */