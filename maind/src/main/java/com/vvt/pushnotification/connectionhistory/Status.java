package com.vvt.pushnotification.connectionhistory;

public enum Status
{
  static
  {
    int i = 1;
    Object localObject = new com/vvt/pushnotification/connectionhistory/Status;
    ((Status)localObject).<init>("CONNECTED", 0);
    CONNECTED = (Status)localObject;
    localObject = new com/vvt/pushnotification/connectionhistory/Status;
    ((Status)localObject).<init>("DISCONNECTED", i);
    DISCONNECTED = (Status)localObject;
    localObject = new Status[2];
    Status localStatus = CONNECTED;
    localObject[0] = localStatus;
    localStatus = DISCONNECTED;
    localObject[i] = localStatus;
    a = (Status[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/pushnotification/connectionhistory/Status.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */