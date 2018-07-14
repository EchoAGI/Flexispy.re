package com.fx.socket;

import android.net.LocalSocket;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class c
  extends Thread
{
  private ObjectInputStream b = null;
  private ObjectOutputStream c = null;
  private LocalSocket d = null;
  private SocketCmd e;
  
  public c(b paramb, ObjectInputStream paramObjectInputStream, ObjectOutputStream paramObjectOutputStream, LocalSocket paramLocalSocket, SocketCmd paramSocketCmd)
  {
    this.b = paramObjectInputStream;
    this.c = paramObjectOutputStream;
    this.d = paramLocalSocket;
    this.e = paramSocketCmd;
  }
  
  public void run()
  {
    try
    {
      Object localObject1 = this.a;
      localObject1 = ((b)localObject1).a;
      localObject3 = this.e;
      localObject1 = ((a)localObject1).a((SocketCmd)localObject3);
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
      b.a((b)localObject1, (ObjectInputStream)localObject3, (ObjectOutputStream)localObject4, (LocalSocket)localObject5);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool = b.b();
        if (bool) {}
        b localb = this.a;
        localObject3 = this.b;
        localObject4 = this.c;
        localObject5 = this.d;
        b.a(localb, (ObjectInputStream)localObject3, (ObjectOutputStream)localObject4, (LocalSocket)localObject5);
      }
    }
    finally
    {
      Object localObject3 = this.a;
      Object localObject4 = this.b;
      Object localObject5 = this.c;
      LocalSocket localLocalSocket = this.d;
      b.a((b)localObject3, (ObjectInputStream)localObject4, (ObjectOutputStream)localObject5, localLocalSocket);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/fx/socket/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */