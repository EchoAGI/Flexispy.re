package com.fx.socket;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

class f
  extends Thread
{
  private ObjectInputStream b = null;
  private ObjectOutputStream c = null;
  private Socket d = null;
  private TcpSocketCmd e;
  
  public f(e parame, ObjectInputStream paramObjectInputStream, ObjectOutputStream paramObjectOutputStream, Socket paramSocket, TcpSocketCmd paramTcpSocketCmd)
  {
    this.b = paramObjectInputStream;
    this.c = paramObjectOutputStream;
    this.d = paramSocket;
    this.e = paramTcpSocketCmd;
  }
  
  public void run()
  {
    try
    {
      Object localObject1 = this.a;
      localObject1 = e.a((e)localObject1);
      localObject3 = this.e;
      localObject1 = ((d)localObject1).a((TcpSocketCmd)localObject3);
      if (localObject1 == null)
      {
        localObject1 = new com/fx/socket/FxSocketException;
        localObject3 = new java/lang/Exception;
        localObject4 = "The output data can't be null";
        ((Exception)localObject3).<init>((String)localObject4);
        ((FxSocketException)localObject1).<init>((Exception)localObject3);
      }
      localObject3 = this.c;
      ((ObjectOutputStream)localObject3).writeObject(localObject1);
      localObject1 = this.c;
      ((ObjectOutputStream)localObject1).flush();
      localObject1 = this.a;
      localObject3 = this.b;
      localObject4 = this.c;
      localObject5 = this.d;
      e.a((e)localObject1, (ObjectInputStream)localObject3, (ObjectOutputStream)localObject4, (Socket)localObject5);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool = e.b();
        if (bool) {}
        e locale = this.a;
        localObject3 = this.b;
        localObject4 = this.c;
        localObject5 = this.d;
        e.a(locale, (ObjectInputStream)localObject3, (ObjectOutputStream)localObject4, (Socket)localObject5);
      }
    }
    finally
    {
      Object localObject3 = this.a;
      Object localObject4 = this.b;
      Object localObject5 = this.c;
      Socket localSocket = this.d;
      e.a((e)localObject3, (ObjectInputStream)localObject4, (ObjectOutputStream)localObject5, localSocket);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/socket/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */