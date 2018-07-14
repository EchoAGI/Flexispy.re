package com.vvt.pushnotification.connectionhistory;

public enum PushProtocal
{
  static
  {
    int i = 1;
    Object localObject = new com/vvt/pushnotification/connectionhistory/PushProtocal;
    ((PushProtocal)localObject).<init>("MQTT", 0);
    MQTT = (PushProtocal)localObject;
    localObject = new com/vvt/pushnotification/connectionhistory/PushProtocal;
    ((PushProtocal)localObject).<init>("WEBSOCKET", i);
    WEBSOCKET = (PushProtocal)localObject;
    localObject = new PushProtocal[2];
    PushProtocal localPushProtocal = MQTT;
    localObject[0] = localPushProtocal;
    localPushProtocal = WEBSOCKET;
    localObject[i] = localPushProtocal;
    a = (PushProtocal[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/pushnotification/connectionhistory/PushProtocal.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */