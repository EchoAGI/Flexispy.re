package org.eclipse.paho.client.mqttv3.a;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import javax.net.SocketFactory;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.b.b;
import org.eclipse.paho.client.mqttv3.b.c;

public class p
  implements m
{
  private static final String b = p.class.getName();
  private static final b c;
  protected Socket a;
  private SocketFactory d;
  private String e;
  private int f;
  private int g;
  
  static
  {
    String str = b;
    c = c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", str);
  }
  
  public p(SocketFactory paramSocketFactory, String paramString1, int paramInt, String paramString2)
  {
    c.a(paramString2);
    this.d = paramSocketFactory;
    this.e = paramString1;
    this.f = paramInt;
  }
  
  public void a()
  {
    Object localObject1 = "start";
    try
    {
      localObject1 = c;
      localObject2 = b;
      String str1 = "start";
      String str2 = "252";
      int i = 3;
      Object[] arrayOfObject = new Object[i];
      int j = 0;
      Object localObject3 = null;
      Object localObject4 = this.e;
      arrayOfObject[0] = localObject4;
      j = 1;
      localObject4 = new java/lang/Integer;
      int k = this.f;
      ((Integer)localObject4).<init>(k);
      arrayOfObject[j] = localObject4;
      j = 2;
      localObject4 = new java/lang/Long;
      k = this.g * 1000;
      long l = k;
      ((Long)localObject4).<init>(l);
      arrayOfObject[j] = localObject4;
      ((b)localObject1).b((String)localObject2, str1, str2, arrayOfObject);
      localObject1 = new java/net/InetSocketAddress;
      localObject2 = this.e;
      int m = this.f;
      ((InetSocketAddress)localObject1).<init>((String)localObject2, m);
      localObject2 = this.d;
      localObject2 = ((SocketFactory)localObject2).createSocket();
      this.a = ((Socket)localObject2);
      localObject2 = this.a;
      m = this.g * 1000;
      ((Socket)localObject2).connect((SocketAddress)localObject1, m);
      return;
    }
    catch (ConnectException localConnectException)
    {
      localObject1 = c;
      Object localObject2 = b;
      ((b)localObject1).a((String)localObject2, "start", "250", null, localConnectException);
      localObject1 = new org/eclipse/paho/client/mqttv3/MqttException;
      ((MqttException)localObject1).<init>(32103, localConnectException);
      throw ((Throwable)localObject1);
    }
  }
  
  public InputStream b()
  {
    return this.a.getInputStream();
  }
  
  public void b(int paramInt)
  {
    this.g = paramInt;
  }
  
  public OutputStream c()
  {
    return this.a.getOutputStream();
  }
  
  public void d()
  {
    Socket localSocket = this.a;
    if (localSocket != null)
    {
      localSocket = this.a;
      localSocket.close();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/p.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */