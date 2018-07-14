package org.eclipse.paho.client.mqttv3;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;
import javax.net.SocketFactory;
import org.eclipse.paho.client.mqttv3.d.a;

public class i
{
  private int a = 360;
  private String b = null;
  private k c = null;
  private String d;
  private char[] e;
  private SocketFactory f;
  private Properties g = null;
  private boolean h = true;
  private int i = 30;
  private String[] j = null;
  private int k = 0;
  
  protected static int b(String paramString)
  {
    try
    {
      Object localObject1 = new java/net/URI;
      ((URI)localObject1).<init>(paramString);
      str1 = ((URI)localObject1).getPath();
      str2 = "";
      bool1 = str1.equals(str2);
      if (!bool1)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject1).<init>(paramString);
        throw ((Throwable)localObject1);
      }
    }
    catch (URISyntaxException localURISyntaxException)
    {
      localObject2 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject2).<init>(paramString);
      throw ((Throwable)localObject2);
    }
    String str1 = ((URI)localObject2).getScheme();
    String str2 = "tcp";
    boolean bool1 = str1.equals(str2);
    int m;
    if (bool1)
    {
      m = 0;
      localObject2 = null;
    }
    for (;;)
    {
      return m;
      str1 = ((URI)localObject2).getScheme();
      str2 = "ssl";
      bool1 = str1.equals(str2);
      if (bool1)
      {
        m = 1;
      }
      else
      {
        localObject2 = ((URI)localObject2).getScheme();
        str1 = "local";
        boolean bool2 = ((String)localObject2).equals(str1);
        if (!bool2) {
          break;
        }
        int n = 2;
      }
    }
    Object localObject2 = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject2).<init>(paramString);
    throw ((Throwable)localObject2);
  }
  
  public void a(int paramInt)
  {
    if (paramInt != 0)
    {
      int m = 3;
      if (paramInt != m)
      {
        m = 4;
        if (paramInt != m)
        {
          IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
          localIllegalArgumentException.<init>();
          throw localIllegalArgumentException;
        }
      }
    }
    this.k = paramInt;
  }
  
  public void a(String paramString)
  {
    if (paramString != null)
    {
      Object localObject = paramString.trim();
      String str = "";
      boolean bool = ((String)localObject).equals(str);
      if (bool)
      {
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>();
        throw ((Throwable)localObject);
      }
    }
    this.d = paramString;
  }
  
  public void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public void a(char[] paramArrayOfChar)
  {
    this.e = paramArrayOfChar;
  }
  
  public char[] a()
  {
    return this.e;
  }
  
  public String b()
  {
    return this.d;
  }
  
  public int c()
  {
    return this.a;
  }
  
  public int d()
  {
    return this.k;
  }
  
  public int e()
  {
    return this.i;
  }
  
  public SocketFactory f()
  {
    return this.f;
  }
  
  public String g()
  {
    return this.b;
  }
  
  public k h()
  {
    return this.c;
  }
  
  public Properties i()
  {
    return this.g;
  }
  
  public boolean j()
  {
    return this.h;
  }
  
  public String[] k()
  {
    return this.j;
  }
  
  public Properties l()
  {
    Properties localProperties = new java/util/Properties;
    localProperties.<init>();
    Object localObject1 = Integer.valueOf(d());
    localProperties.put("MqttVersion", localObject1);
    localObject1 = Boolean.valueOf(j());
    localProperties.put("CleanSession", localObject1);
    localObject1 = Integer.valueOf(e());
    localProperties.put("ConTimeout", localObject1);
    int m = c();
    localObject1 = Integer.valueOf(m);
    localProperties.put("KeepAliveInterval", localObject1);
    localObject1 = "UserName";
    Object localObject2 = b();
    if (localObject2 == null)
    {
      localObject2 = "null";
      localProperties.put(localObject1, localObject2);
      localObject1 = "WillDestination";
      localObject2 = g();
      if (localObject2 != null) {
        break label189;
      }
      localObject2 = "null";
      label118:
      localProperties.put(localObject1, localObject2);
      localObject2 = f();
      if (localObject2 != null) {
        break label198;
      }
      localObject2 = "SocketFactory";
      localObject1 = "null";
      localProperties.put(localObject2, localObject1);
      label152:
      localObject2 = i();
      if (localObject2 != null) {
        break label218;
      }
      localObject2 = "SSLProperties";
      localObject1 = "null";
      localProperties.put(localObject2, localObject1);
    }
    for (;;)
    {
      return localProperties;
      localObject2 = b();
      break;
      label189:
      localObject2 = g();
      break label118;
      label198:
      localObject2 = "SocketFactory";
      localObject1 = f();
      localProperties.put(localObject2, localObject1);
      break label152;
      label218:
      localObject2 = "SSLProperties";
      localObject1 = i();
      localProperties.put(localObject2, localObject1);
    }
  }
  
  public String toString()
  {
    return a.a(l(), "Connection options");
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */