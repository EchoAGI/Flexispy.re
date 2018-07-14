package org.eclipse.paho.client.mqttv3.a.b;

import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;
import org.eclipse.paho.client.mqttv3.l;

public abstract class h
  extends u
  implements l
{
  public h(byte paramByte)
  {
    super(paramByte);
  }
  
  public byte[] a()
  {
    try
    {
      return k();
    }
    catch (MqttException localMqttException)
    {
      MqttPersistenceException localMqttPersistenceException = new org/eclipse/paho/client/mqttv3/MqttPersistenceException;
      Throwable localThrowable = localMqttException.getCause();
      localMqttPersistenceException.<init>(localThrowable);
      throw localMqttPersistenceException;
    }
  }
  
  public int b()
  {
    return a().length;
  }
  
  public int c()
  {
    return 0;
  }
  
  public int c_()
  {
    return 0;
  }
  
  public byte[] d()
  {
    try
    {
      return e_();
    }
    catch (MqttException localMqttException)
    {
      MqttPersistenceException localMqttPersistenceException = new org/eclipse/paho/client/mqttv3/MqttPersistenceException;
      Throwable localThrowable = localMqttException.getCause();
      localMqttPersistenceException.<init>(localThrowable);
      throw localMqttPersistenceException;
    }
  }
  
  public int f()
  {
    return 0;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/removeFromPath/AppEngine1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */