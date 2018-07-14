package org.eclipse.paho.client.mqttv3.a;

public abstract class l
{
  private static l a = null;
  
  public static final String a(int paramInt)
  {
    Object localObject1 = a;
    boolean bool;
    if (localObject1 == null)
    {
      localObject1 = "java.util.ResourceBundle";
      bool = j.a((String)localObject1);
      if (!bool) {
        break label59;
      }
      localObject1 = "org.eclipse.paho.client.mqttv3.a.n";
    }
    for (;;)
    {
      try
      {
        localObject1 = Class.forName((String)localObject1);
        localObject1 = ((Class)localObject1).newInstance();
        localObject1 = (l)localObject1;
        a = (l)localObject1;
        localObject1 = a.b(paramInt);
      }
      catch (Exception localException1)
      {
        localObject2 = "";
        continue;
      }
      return (String)localObject1;
      label59:
      Object localObject2 = "org.eclipse.paho.client.mqttv3.internal.MIDPCatalog";
      bool = j.a((String)localObject2);
      if (bool)
      {
        localObject2 = "org.eclipse.paho.client.mqttv3.internal.MIDPCatalog";
        try
        {
          localObject2 = Class.forName((String)localObject2);
          localObject2 = ((Class)localObject2).newInstance();
          localObject2 = (l)localObject2;
          a = (l)localObject2;
        }
        catch (Exception localException2)
        {
          String str = "";
        }
      }
    }
  }
  
  protected abstract String b(int paramInt);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */