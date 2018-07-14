package org.eclipse.paho.client.mqttv3;

import java.util.Hashtable;
import java.util.Properties;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import org.eclipse.paho.client.mqttv3.a.b.r;
import org.eclipse.paho.client.mqttv3.a.b.u;
import org.eclipse.paho.client.mqttv3.a.j;
import org.eclipse.paho.client.mqttv3.a.k;
import org.eclipse.paho.client.mqttv3.a.q;
import org.eclipse.paho.client.mqttv3.b.c;

public class e
  implements b
{
  private static final String b = e.class.getName();
  private static final org.eclipse.paho.client.mqttv3.b.b c;
  protected org.eclipse.paho.client.mqttv3.a.a a;
  private String d;
  private String e;
  private Hashtable f;
  private h g;
  
  static
  {
    String str = b;
    c = c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", str);
  }
  
  public e(String paramString1, String paramString2, h paramh)
  {
    this(paramString1, paramString2, paramh, localp);
  }
  
  public e(String paramString1, String paramString2, h paramh, m paramm)
  {
    Object localObject = c;
    ((org.eclipse.paho.client.mqttv3.b.b)localObject).a(paramString2);
    if (paramString2 == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Null clientId");
      throw ((Throwable)localObject);
    }
    int i = 0;
    localObject = null;
    int j = 0;
    String str = null;
    for (;;)
    {
      int k = paramString2.length() + -1;
      if (i >= k) {
        break;
      }
      boolean bool = a(paramString2.charAt(i));
      if (bool) {
        i += 1;
      }
      j += 1;
      i += 1;
    }
    i = (char)-1;
    if (j > i)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("ClientId longer than 65535 characters");
      throw ((Throwable)localObject);
    }
    i.b(paramString1);
    this.e = paramString1;
    this.d = paramString2;
    this.g = paramh;
    localObject = this.g;
    if (localObject == null)
    {
      localObject = new org/eclipse/paho/client/mqttv3/c/a;
      ((org.eclipse.paho.client.mqttv3.c.a)localObject).<init>();
      this.g = ((h)localObject);
    }
    localObject = c;
    str = b;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramString2;
    arrayOfObject[1] = paramString1;
    arrayOfObject[2] = paramh;
    ((org.eclipse.paho.client.mqttv3.b.b)localObject).b(str, "MqttAsyncClient", "101", arrayOfObject);
    this.g.a(paramString2, paramString1);
    localObject = new org/eclipse/paho/client/mqttv3/a/a;
    localh = this.g;
    ((org.eclipse.paho.client.mqttv3.a.a)localObject).<init>(this, localh, paramm);
    this.a = ((org.eclipse.paho.client.mqttv3.a.a)localObject);
    this.g.a();
    localObject = new java/util/Hashtable;
    ((Hashtable)localObject).<init>();
    this.f = ((Hashtable)localObject);
  }
  
  private int a(String paramString, int paramInt)
  {
    int i = paramString.lastIndexOf(':');
    int j = -1;
    if (i == j) {}
    for (;;)
    {
      return paramInt;
      i += 1;
      Integer localInteger = Integer.valueOf(paramString.substring(i));
      paramInt = localInteger.intValue();
    }
  }
  
  protected static boolean a(char paramChar)
  {
    char c1 = 55296;
    if (paramChar >= c1)
    {
      c1 = 56319;
      if (paramChar > c1) {}
    }
    for (c1 = '\001';; c1 = '\000') {
      return c1;
    }
  }
  
  private String b(String paramString)
  {
    int i = paramString.lastIndexOf('/');
    int j = paramString.lastIndexOf(':');
    int k = -1;
    if (j == k) {
      j = paramString.length();
    }
    i += 1;
    return paramString.substring(i, j);
  }
  
  private org.eclipse.paho.client.mqttv3.a.m b(String paramString, i parami)
  {
    int i = 32105;
    int j = 6;
    int k = 0;
    Object localObject1 = c;
    Object localObject2 = b;
    Object localObject3 = "createNetworkModule";
    String str1 = "115";
    int m = 1;
    Object[] arrayOfObject = new Object[m];
    String str2 = null;
    arrayOfObject[0] = paramString;
    ((org.eclipse.paho.client.mqttv3.b.b)localObject1).b((String)localObject2, (String)localObject3, str1, arrayOfObject);
    localObject1 = parami.f();
    int n = i.b(paramString);
    int i1;
    boolean bool;
    switch (n)
    {
    default: 
      n = 0;
      localObject2 = null;
      return (org.eclipse.paho.client.mqttv3.a.m)localObject2;
    case 0: 
      localObject2 = paramString.substring(j);
      localObject3 = b((String)localObject2);
      k = a((String)localObject2, 1883);
      if (localObject1 == null) {
        localObject1 = SocketFactory.getDefault();
      }
      do
      {
        localObject2 = new org/eclipse/paho/client/mqttv3/a/p;
        str1 = this.d;
        ((org.eclipse.paho.client.mqttv3.a.p)localObject2).<init>((SocketFactory)localObject1, (String)localObject3, k, str1);
        localObject1 = localObject2;
        localObject1 = (org.eclipse.paho.client.mqttv3.a.p)localObject2;
        i1 = parami.e();
        ((org.eclipse.paho.client.mqttv3.a.p)localObject1).b(i1);
        break;
        bool = localObject1 instanceof SSLSocketFactory;
      } while (!bool);
      throw j.a(i);
    case 1: 
      localObject2 = paramString.substring(j);
      str1 = b((String)localObject2);
      i1 = 8883;
      m = a((String)localObject2, i1);
      if (localObject1 == null)
      {
        localObject1 = new org/eclipse/paho/client/mqttv3/a/a/a;
        ((org.eclipse.paho.client.mqttv3.a.a.a)localObject1).<init>();
        localObject2 = parami.i();
        if (localObject2 != null) {
          ((org.eclipse.paho.client.mqttv3.a.a.a)localObject1).a((Properties)localObject2, null);
        }
        localObject2 = ((org.eclipse.paho.client.mqttv3.a.a.a)localObject1).o(null);
        localObject3 = localObject1;
        localObject1 = localObject2;
      }
      break;
    }
    for (;;)
    {
      localObject2 = new org/eclipse/paho/client/mqttv3/a/o;
      localObject1 = (SSLSocketFactory)localObject1;
      str2 = this.d;
      ((org.eclipse.paho.client.mqttv3.a.o)localObject2).<init>((SSLSocketFactory)localObject1, str1, m, str2);
      localObject1 = localObject2;
      localObject1 = (org.eclipse.paho.client.mqttv3.a.o)localObject2;
      int i2 = parami.e();
      ((org.eclipse.paho.client.mqttv3.a.o)localObject1).a(i2);
      if (localObject3 == null) {
        break;
      }
      localObject3 = ((org.eclipse.paho.client.mqttv3.a.a.a)localObject3).n(null);
      if (localObject3 == null) {
        break;
      }
      localObject1 = localObject2;
      localObject1 = (org.eclipse.paho.client.mqttv3.a.o)localObject2;
      ((org.eclipse.paho.client.mqttv3.a.o)localObject1).a((String[])localObject3);
      break;
      bool = localObject1 instanceof SSLSocketFactory;
      if (!bool)
      {
        throw j.a(i);
        localObject2 = new org/eclipse/paho/client/mqttv3/a/k;
        int i3 = 8;
        localObject1 = paramString.substring(i3);
        ((k)localObject2).<init>((String)localObject1);
        break;
      }
      i1 = 0;
      localObject3 = null;
    }
  }
  
  public String a()
  {
    return this.d;
  }
  
  public d a(long paramLong, Object paramObject, a parama)
  {
    Object localObject1 = c;
    Object localObject2 = b;
    Object localObject3 = "disconnect";
    String str = "104";
    int i = 3;
    Object[] arrayOfObject = new Object[i];
    Object localObject4 = null;
    Long localLong = new java/lang/Long;
    localLong.<init>(paramLong);
    arrayOfObject[0] = localLong;
    arrayOfObject[1] = paramObject;
    int j = 2;
    arrayOfObject[j] = parama;
    ((org.eclipse.paho.client.mqttv3.b.b)localObject1).b((String)localObject2, (String)localObject3, str, arrayOfObject);
    localObject1 = new org/eclipse/paho/client/mqttv3/n;
    localObject2 = a();
    ((n)localObject1).<init>((String)localObject2);
    ((n)localObject1).a(parama);
    ((n)localObject1).a(paramObject);
    localObject2 = new org/eclipse/paho/client/mqttv3/a/b/e;
    ((org.eclipse.paho.client.mqttv3.a.b.e)localObject2).<init>();
    try
    {
      localObject3 = this.a;
      ((org.eclipse.paho.client.mqttv3.a.a)localObject3).a((org.eclipse.paho.client.mqttv3.a.b.e)localObject2, paramLong, (n)localObject1);
      localObject2 = c;
      localObject3 = b;
      ((org.eclipse.paho.client.mqttv3.b.b)localObject2).a((String)localObject3, "disconnect", "108");
      return (d)localObject1;
    }
    catch (MqttException localMqttException)
    {
      localObject1 = c;
      localObject2 = b;
      ((org.eclipse.paho.client.mqttv3.b.b)localObject1).a((String)localObject2, "disconnect", "105", null, localMqttException);
      throw localMqttException;
    }
  }
  
  public d a(Object paramObject, a parama)
  {
    return a(30000L, paramObject, parama);
  }
  
  public d a(i parami, Object paramObject, a parama)
  {
    Object localObject1 = this.a;
    boolean bool = ((org.eclipse.paho.client.mqttv3.a.a)localObject1).c();
    if (bool) {
      throw j.a(32100);
    }
    localObject1 = this.a;
    bool = ((org.eclipse.paho.client.mqttv3.a.a)localObject1).d();
    if (bool)
    {
      localObject1 = new org/eclipse/paho/client/mqttv3/MqttException;
      ((MqttException)localObject1).<init>(32110);
      throw ((Throwable)localObject1);
    }
    localObject1 = this.a;
    bool = ((org.eclipse.paho.client.mqttv3.a.a)localObject1).f();
    if (bool)
    {
      localObject1 = new org/eclipse/paho/client/mqttv3/MqttException;
      ((MqttException)localObject1).<init>(32102);
      throw ((Throwable)localObject1);
    }
    localObject1 = this.a;
    bool = ((org.eclipse.paho.client.mqttv3.a.a)localObject1).g();
    if (bool)
    {
      localObject1 = new org/eclipse/paho/client/mqttv3/MqttException;
      ((MqttException)localObject1).<init>(32111);
      throw ((Throwable)localObject1);
    }
    Object localObject2 = c;
    Object localObject3 = b;
    Object localObject4 = "connect";
    Object localObject5 = "103";
    Object localObject6 = new Object[8];
    localObject1 = Boolean.valueOf(parami.j());
    localObject6[0] = localObject1;
    Object localObject7 = Integer.valueOf(parami.e());
    localObject6[1] = localObject7;
    localObject7 = Integer.valueOf(parami.c());
    localObject6[2] = localObject7;
    int i = 3;
    localObject7 = parami.b();
    localObject6[i] = localObject7;
    int j = 4;
    localObject1 = parami.a();
    if (localObject1 == null)
    {
      localObject1 = "[null]";
      localObject6[j] = localObject1;
      j = 5;
      localObject1 = parami.h();
      if (localObject1 != null) {
        break label418;
      }
    }
    label418:
    for (localObject1 = "[null]";; localObject1 = "[notnull]")
    {
      localObject6[j] = localObject1;
      localObject6[6] = paramObject;
      localObject6[7] = parama;
      ((org.eclipse.paho.client.mqttv3.b.b)localObject2).b((String)localObject3, (String)localObject4, (String)localObject5, (Object[])localObject6);
      localObject1 = this.a;
      localObject2 = this.e;
      localObject2 = a((String)localObject2, parami);
      ((org.eclipse.paho.client.mqttv3.a.a)localObject1).a((org.eclipse.paho.client.mqttv3.a.m[])localObject2);
      localObject6 = new org/eclipse/paho/client/mqttv3/n;
      localObject1 = a();
      ((n)localObject6).<init>((String)localObject1);
      localObject1 = new org/eclipse/paho/client/mqttv3/a/i;
      localObject3 = this.g;
      localObject4 = this.a;
      localObject2 = this;
      localObject5 = parami;
      localObject7 = paramObject;
      ((org.eclipse.paho.client.mqttv3.a.i)localObject1).<init>(this, (h)localObject3, (org.eclipse.paho.client.mqttv3.a.a)localObject4, parami, (n)localObject6, paramObject, parama);
      ((n)localObject6).a((a)localObject1);
      ((n)localObject6).a(this);
      this.a.a(0);
      ((org.eclipse.paho.client.mqttv3.a.i)localObject1).a();
      return (d)localObject6;
      localObject1 = "[notnull]";
      break;
    }
  }
  
  public d a(String[] paramArrayOfString, int[] paramArrayOfInt, Object paramObject, a parama)
  {
    boolean bool = true;
    String str = null;
    Object localObject1 = "subscribe";
    int i = paramArrayOfString.length;
    int j = paramArrayOfInt.length;
    if (i != j)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    localObject1 = "";
    j = 0;
    Object localObject2 = null;
    for (;;)
    {
      int k = paramArrayOfString.length;
      if (j >= k) {
        break;
      }
      if (j > 0)
      {
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
        localObject3 = ", ";
        localObject1 = (String)localObject3;
      }
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
      localObject3 = paramArrayOfString[j];
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3).append(":");
      k = paramArrayOfInt[j];
      localObject3 = k;
      o.a(paramArrayOfString[j], bool);
      i = j + 1;
      j = i;
      localObject1 = localObject3;
    }
    localObject2 = c;
    Object localObject3 = b;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = localObject1;
    arrayOfObject[bool] = paramObject;
    arrayOfObject[2] = parama;
    ((org.eclipse.paho.client.mqttv3.b.b)localObject2).b((String)localObject3, "subscribe", "106", arrayOfObject);
    localObject1 = new org/eclipse/paho/client/mqttv3/n;
    localObject2 = a();
    ((n)localObject1).<init>((String)localObject2);
    ((n)localObject1).a(parama);
    ((n)localObject1).a(paramObject);
    ((n)localObject1).a.a(paramArrayOfString);
    localObject2 = new org/eclipse/paho/client/mqttv3/a/b/r;
    ((r)localObject2).<init>(paramArrayOfString, paramArrayOfInt);
    this.a.b((u)localObject2, (n)localObject1);
    localObject2 = c;
    str = b;
    ((org.eclipse.paho.client.mqttv3.b.b)localObject2).a(str, "subscribe", "109");
    return (d)localObject1;
  }
  
  protected o a(String paramString)
  {
    o.a(paramString, false);
    o localo = (o)this.f.get(paramString);
    if (localo == null)
    {
      localo = new org/eclipse/paho/client/mqttv3/o;
      Object localObject = this.a;
      localo.<init>(paramString, (org.eclipse.paho.client.mqttv3.a.a)localObject);
      localObject = this.f;
      ((Hashtable)localObject).put(paramString, localo);
    }
    return localo;
  }
  
  public void a(f paramf)
  {
    this.a.a(paramf);
  }
  
  protected org.eclipse.paho.client.mqttv3.a.m[] a(String paramString, i parami)
  {
    int i = 1;
    int j = 0;
    String str1 = null;
    Object localObject1 = c;
    Object localObject2 = b;
    Object localObject3 = "createNetworkModules";
    String str2 = "116";
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = paramString;
    ((org.eclipse.paho.client.mqttv3.b.b)localObject1).b((String)localObject2, (String)localObject3, str2, arrayOfObject);
    localObject1 = parami.k();
    if (localObject1 == null)
    {
      localObject1 = new String[i];
      localObject1[0] = paramString;
    }
    for (;;)
    {
      int k = localObject1.length;
      localObject2 = new org.eclipse.paho.client.mqttv3.a.m[k];
      for (;;)
      {
        int m = localObject1.length;
        if (j >= m) {
          break;
        }
        localObject3 = localObject1[j];
        localObject3 = b((String)localObject3, parami);
        localObject2[j] = localObject3;
        j += 1;
      }
      k = localObject1.length;
      if (k == 0)
      {
        localObject1 = new String[i];
        localObject1[0] = paramString;
      }
    }
    localObject1 = c;
    str1 = b;
    ((org.eclipse.paho.client.mqttv3.b.b)localObject1).a(str1, "createNetworkModules", "108");
    return (org.eclipse.paho.client.mqttv3.a.m[])localObject2;
  }
  
  public d b()
  {
    return a(null, null);
  }
  
  public boolean c()
  {
    return this.a.c();
  }
  
  public String d()
  {
    return this.e;
  }
  
  public void e()
  {
    org.eclipse.paho.client.mqttv3.b.b localb = c;
    String str = b;
    localb.a(str, "close", "113");
    this.a.b();
    localb = c;
    str = b;
    localb.a(str, "close", "114");
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */