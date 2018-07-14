package org.eclipse.paho.client.mqttv3;

public class g
{
  protected e a = null;
  protected long b = -1;
  
  public g(String paramString1, String paramString2, h paramh)
  {
    e locale = new org/eclipse/paho/client/mqttv3/e;
    locale.<init>(paramString1, paramString2, paramh);
    this.a = locale;
  }
  
  public o a(String paramString)
  {
    return this.a.a(paramString);
  }
  
  public void a()
  {
    this.a.b().a();
  }
  
  public void a(String paramString, int paramInt)
  {
    int i = 1;
    String[] arrayOfString = new String[i];
    arrayOfString[0] = paramString;
    int[] arrayOfInt = new int[i];
    arrayOfInt[0] = paramInt;
    a(arrayOfString, arrayOfInt);
  }
  
  public void a(f paramf)
  {
    this.a.a(paramf);
  }
  
  public void a(i parami)
  {
    d locald = this.a.a(parami, null, null);
    long l = b();
    locald.a(l);
  }
  
  public void a(String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    int i = 0;
    int j = 128;
    Object localObject = this.a.a(paramArrayOfString, paramArrayOfInt, null, null);
    long l = b();
    ((d)localObject).a(l);
    int[] arrayOfInt = ((d)localObject).b();
    int k = 0;
    localObject = null;
    for (;;)
    {
      int m = arrayOfInt.length;
      if (k >= m) {
        break;
      }
      m = arrayOfInt[k];
      paramArrayOfInt[k] = m;
      k += 1;
    }
    k = arrayOfInt.length;
    i = 1;
    if (k == i)
    {
      k = paramArrayOfInt[0];
      if (k == j)
      {
        localObject = new org/eclipse/paho/client/mqttv3/MqttException;
        ((MqttException)localObject).<init>(j);
        throw ((Throwable)localObject);
      }
    }
  }
  
  public long b()
  {
    return this.b;
  }
  
  public void c()
  {
    this.a.e();
  }
  
  public boolean d()
  {
    return this.a.c();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/FxFileObserverWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */