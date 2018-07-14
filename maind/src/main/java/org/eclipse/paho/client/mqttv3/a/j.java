package org.eclipse.paho.client.mqttv3.a;

import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttSecurityException;

public class j
{
  public static MqttException a(int paramInt)
  {
    int i = 4;
    Object localObject;
    if (paramInt != i)
    {
      i = 5;
      if (paramInt != i) {}
    }
    else
    {
      localObject = new org/eclipse/paho/client/mqttv3/MqttSecurityException;
      ((MqttSecurityException)localObject).<init>(paramInt);
    }
    for (;;)
    {
      return (MqttException)localObject;
      localObject = new org/eclipse/paho/client/mqttv3/MqttException;
      ((MqttException)localObject).<init>(paramInt);
    }
  }
  
  public static MqttException a(Throwable paramThrowable)
  {
    Object localObject = paramThrowable.getClass().getName();
    String str = "java.security.GeneralSecurityException";
    boolean bool = ((String)localObject).equals(str);
    if (bool)
    {
      localObject = new org/eclipse/paho/client/mqttv3/MqttSecurityException;
      ((MqttSecurityException)localObject).<init>(paramThrowable);
    }
    for (;;)
    {
      return (MqttException)localObject;
      localObject = new org/eclipse/paho/client/mqttv3/MqttException;
      ((MqttException)localObject).<init>(paramThrowable);
    }
  }
  
  public static boolean a(String paramString)
  {
    boolean bool = false;
    try
    {
      Class.forName(paramString);
      bool = true;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;) {}
    }
    return bool;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */