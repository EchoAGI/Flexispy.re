package com.vvt.connectionhistorymanager;

public enum Status
{
  static
  {
    int i = 1;
    Object localObject = new com/vvt/connectionhistorymanager/Status;
    ((Status)localObject).<init>("SUCCESS", 0);
    SUCCESS = (Status)localObject;
    localObject = new com/vvt/connectionhistorymanager/Status;
    ((Status)localObject).<init>("FAILED", i);
    FAILED = (Status)localObject;
    localObject = new Status[2];
    Status localStatus = SUCCESS;
    localObject[0] = localStatus;
    localStatus = FAILED;
    localObject[i] = localStatus;
    a = (Status[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/connectionhistorymanager/Status.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */