package org.eclipse.paho.client.mqttv3.a;

import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.eclipse.paho.client.mqttv3.b.b;
import org.eclipse.paho.client.mqttv3.b.c;

public class o
  extends p
{
  private static final String b = o.class.getName();
  private static final b c;
  private String[] d;
  private int e;
  
  static
  {
    String str = b;
    c = c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", str);
  }
  
  public o(SSLSocketFactory paramSSLSocketFactory, String paramString1, int paramInt, String paramString2)
  {
    super(paramSSLSocketFactory, paramString1, paramInt, paramString2);
    c.a(paramString2);
  }
  
  public void a()
  {
    super.a();
    Object localObject = this.d;
    a((String[])localObject);
    localObject = this.a;
    int i = ((Socket)localObject).getSoTimeout();
    if (i == 0)
    {
      localObject = this.a;
      int j = this.e * 1000;
      ((Socket)localObject).setSoTimeout(j);
    }
    ((SSLSocket)this.a).startHandshake();
    this.a.setSoTimeout(i);
  }
  
  public void a(int paramInt)
  {
    super.b(paramInt);
    this.e = paramInt;
  }
  
  public void a(String[] paramArrayOfString)
  {
    this.d = paramArrayOfString;
    Object localObject1 = this.a;
    if ((localObject1 != null) && (paramArrayOfString != null))
    {
      localObject1 = c;
      int i = 5;
      boolean bool = ((b)localObject1).a(i);
      if (bool)
      {
        localObject1 = "";
        i = 0;
        b localb = null;
        for (;;)
        {
          int k = paramArrayOfString.length;
          if (i >= k) {
            break;
          }
          if (i > 0)
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
            localObject2 = ",";
            localObject1 = (String)localObject2;
          }
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
          localObject2 = paramArrayOfString[i];
          localObject2 = (String)localObject2;
          int j = i + 1;
          i = j;
          localObject1 = localObject2;
        }
        localb = c;
        Object localObject2 = b;
        String str1 = "setEnabledCiphers";
        String str2 = "260";
        int m = 1;
        Object[] arrayOfObject = new Object[m];
        arrayOfObject[0] = localObject1;
        localb.b((String)localObject2, str1, str2, arrayOfObject);
      }
      localObject1 = (SSLSocket)this.a;
      ((SSLSocket)localObject1).setEnabledCipherSuites(paramArrayOfString);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/o.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */