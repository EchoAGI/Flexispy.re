package org.eclipse.paho.client.mqttv3.a;

import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;

public class k
  implements m
{
  private Class a;
  private String b;
  private Object c;
  
  public k(String paramString)
  {
    this.b = paramString;
  }
  
  public void a()
  {
    int i = 32103;
    Object localObject1 = "com.ibm.mqttdirect.modules.local.bindings.localListener";
    boolean bool = j.a((String)localObject1);
    if (!bool) {
      throw j.a(i);
    }
    localObject1 = "com.ibm.mqttdirect.modules.local.bindings.localListener";
    try
    {
      localObject1 = Class.forName((String)localObject1);
      this.a = ((Class)localObject1);
      localObject1 = this.a;
      String str = "connect";
      int j = 1;
      Object localObject2 = new Class[j];
      Object localObject3 = String.class;
      localObject2[0] = localObject3;
      localObject1 = ((Class)localObject1).getMethod(str, (Class[])localObject2);
      str = null;
      j = 1;
      localObject2 = new Object[j];
      localObject3 = this.b;
      localObject2[0] = localObject3;
      localObject1 = ((Method)localObject1).invoke(null, (Object[])localObject2);
      this.c = localObject1;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    localObject1 = this.c;
    if (localObject1 == null) {
      throw j.a(i);
    }
  }
  
  public InputStream b()
  {
    try
    {
      localObject1 = this.a;
      Object localObject3 = "getClientInputStream";
      Object localObject4 = null;
      localObject4 = new Class[0];
      localObject1 = ((Class)localObject1).getMethod((String)localObject3, (Class[])localObject4);
      localObject3 = this.c;
      localObject4 = null;
      localObject4 = new Object[0];
      localObject1 = ((Method)localObject1).invoke(localObject3, (Object[])localObject4);
      localObject1 = (InputStream)localObject1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2 = null;
      }
    }
    return (InputStream)localObject1;
  }
  
  public OutputStream c()
  {
    try
    {
      localObject1 = this.a;
      Object localObject3 = "getClientOutputStream";
      Object localObject4 = null;
      localObject4 = new Class[0];
      localObject1 = ((Class)localObject1).getMethod((String)localObject3, (Class[])localObject4);
      localObject3 = this.c;
      localObject4 = null;
      localObject4 = new Object[0];
      localObject1 = ((Method)localObject1).invoke(localObject3, (Object[])localObject4);
      localObject1 = (OutputStream)localObject1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2 = null;
      }
    }
    return (OutputStream)localObject1;
  }
  
  public void d()
  {
    Object localObject1 = this.c;
    if (localObject1 != null) {}
    try
    {
      localObject1 = this.a;
      Object localObject2 = "close";
      Object localObject3 = null;
      localObject3 = new Class[0];
      localObject1 = ((Class)localObject1).getMethod((String)localObject2, (Class[])localObject3);
      localObject2 = this.c;
      localObject3 = null;
      localObject3 = new Object[0];
      ((Method)localObject1).invoke(localObject2, (Object[])localObject3);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */