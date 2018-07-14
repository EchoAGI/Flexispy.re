package com.vvt.phoenix.prot.event;

public enum AppType
{
  private int mAppType;
  
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new com/vvt/phoenix/prot/event/AppType;
    ((AppType)localObject).<init>("UNKNOWN", 0, 0);
    UNKNOWN = (AppType)localObject;
    localObject = new com/vvt/phoenix/prot/event/AppType;
    ((AppType)localObject).<init>("STANALONE_APP", j, j);
    STANALONE_APP = (AppType)localObject;
    localObject = new com/vvt/phoenix/prot/event/AppType;
    ((AppType)localObject).<init>("NATIVE_APP", i, i);
    NATIVE_APP = (AppType)localObject;
    localObject = new AppType[3];
    AppType localAppType = UNKNOWN;
    localObject[0] = localAppType;
    localAppType = STANALONE_APP;
    localObject[j] = localAppType;
    localAppType = NATIVE_APP;
    localObject[i] = localAppType;
    a = (AppType[])localObject;
  }
  
  private AppType(int paramInt1)
  {
    this.mAppType = paramInt1;
  }
  
  public int getValue()
  {
    return this.mAppType;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/event/AppType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */