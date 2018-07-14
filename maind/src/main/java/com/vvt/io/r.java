package com.vvt.io;

import android.os.Environment;
import android.os.StatFs;
import java.io.File;

public class r
{
  private static boolean a = false;
  
  public static String a()
  {
    long l1 = j();
    long l2 = l();
    return a(l1 + l2);
  }
  
  public static String a(long paramLong)
  {
    long l = 1024L;
    String str1 = null;
    boolean bool = paramLong < l;
    if (!bool)
    {
      str1 = "KB";
      paramLong /= l;
      bool = paramLong < l;
      if (!bool)
      {
        str1 = "MB";
        paramLong /= l;
      }
    }
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    String str2 = Long.toString(paramLong);
    localStringBuilder.<init>(str2);
    int i = localStringBuilder.length() + -3;
    while (i > 0)
    {
      char c = ',';
      localStringBuilder.insert(i, c);
      i += -3;
    }
    if (str1 != null) {
      localStringBuilder.append(str1);
    }
    return localStringBuilder.toString();
  }
  
  public static String b()
  {
    long l1 = i();
    long l2 = k();
    return a(l1 + l2);
  }
  
  public static String c()
  {
    return a(i());
  }
  
  public static String d()
  {
    return a(j());
  }
  
  public static String e()
  {
    for (;;)
    {
      try
      {
        boolean bool = h();
        if (!bool) {
          continue;
        }
        long l = k();
        str1 = a(l);
      }
      finally
      {
        String str1;
        String str2 = "n/a";
        continue;
      }
      return str1;
      str1 = "n/a";
    }
  }
  
  public static String f()
  {
    for (;;)
    {
      try
      {
        boolean bool = h();
        if (!bool) {
          continue;
        }
        long l = l();
        str1 = a(l);
      }
      finally
      {
        String str1;
        String str2 = "n/a";
        continue;
      }
      return str1;
      str1 = "n/a";
    }
  }
  
  public static long g()
  {
    long l1 = 0L;
    try
    {
      Object localObject1 = Environment.getDataDirectory();
      StatFs localStatFs = new android/os/StatFs;
      localObject1 = ((File)localObject1).getPath();
      localStatFs.<init>((String)localObject1);
      int i = localStatFs.getBlockSize();
      long l2 = i;
      int j = localStatFs.getAvailableBlocks();
      l1 = j * l2;
    }
    finally
    {
      for (;;) {}
    }
    return l1;
  }
  
  private static boolean h()
  {
    boolean bool1 = true;
    String str1 = Environment.getExternalStorageState();
    String str2 = "mounted";
    boolean bool2 = str2.equals(str1);
    if (bool2) {
      a = bool1;
    }
    for (;;)
    {
      return a;
      str2 = "mounted_ro";
      boolean bool3 = str2.equals(str1);
      if (bool3)
      {
        a = bool1;
      }
      else
      {
        bool3 = false;
        str1 = null;
        a = false;
      }
    }
  }
  
  private static long i()
  {
    long l1 = 0L;
    try
    {
      Object localObject1 = Environment.getDataDirectory();
      StatFs localStatFs = new android/os/StatFs;
      localObject1 = ((File)localObject1).getPath();
      localStatFs.<init>((String)localObject1);
      int i = localStatFs.getBlockSize();
      long l2 = i;
      int j = localStatFs.getAvailableBlocks();
      l1 = j * l2;
    }
    finally
    {
      for (;;) {}
    }
    return l1;
  }
  
  private static long j()
  {
    long l1 = 0L;
    try
    {
      Object localObject = Environment.getDataDirectory();
      StatFs localStatFs = new android/os/StatFs;
      localObject = ((File)localObject).getPath();
      localStatFs.<init>((String)localObject);
      int i = localStatFs.getBlockSize();
      long l2 = i;
      int j = localStatFs.getBlockCount();
      l1 = j * l2;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return l1;
  }
  
  private static long k()
  {
    long l1 = 0L;
    try
    {
      Object localObject = Environment.getExternalStorageDirectory();
      localObject = ((File)localObject).getPath();
      localObject = d.g((String)localObject);
      StatFs localStatFs = new android/os/StatFs;
      localStatFs.<init>((String)localObject);
      int i = localStatFs.getBlockSize();
      long l2 = i;
      int j = localStatFs.getAvailableBlocks();
      l1 = j * l2;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return l1;
  }
  
  private static long l()
  {
    long l1 = 0L;
    try
    {
      boolean bool = h();
      if (bool)
      {
        Object localObject1 = Environment.getExternalStorageDirectory();
        localObject1 = ((File)localObject1).getPath();
        localObject1 = d.g((String)localObject1);
        StatFs localStatFs = new android/os/StatFs;
        localStatFs.<init>((String)localObject1);
        int i = localStatFs.getBlockSize();
        long l2 = i;
        int j = localStatFs.getBlockCount();
        l1 = j * l2;
      }
    }
    finally
    {
      for (;;) {}
    }
    return l1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/io/r.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */