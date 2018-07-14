package org.eclipse.paho.client.mqttv3.a;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class n
  extends l
{
  private ResourceBundle a;
  
  public n()
  {
    ResourceBundle localResourceBundle = ResourceBundle.getBundle("org.eclipse.paho.client.mqttv3.internal.nls.messages");
    this.a = localResourceBundle;
  }
  
  protected String b(int paramInt)
  {
    try
    {
      localObject = this.a;
      String str2 = Integer.toString(paramInt);
      localObject = ((ResourceBundle)localObject).getString(str2);
    }
    catch (MissingResourceException localMissingResourceException)
    {
      for (;;)
      {
        Object localObject;
        String str1 = "MqttException";
      }
    }
    return (String)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */