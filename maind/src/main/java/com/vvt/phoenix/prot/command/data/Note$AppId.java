package com.vvt.phoenix.prot.command.data;

public enum Note$AppId
{
  private int mAppId;
  
  static
  {
    int i = 3;
    int j = 2;
    int k = 1;
    Object localObject = new com/vvt/phoenix/prot/command/data/Note$AppId;
    ((AppId)localObject).<init>("UNKNOWN", 0, 0);
    UNKNOWN = (AppId)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/Note$AppId;
    ((AppId)localObject).<init>("APP_NATIVE", k, k);
    APP_NATIVE = (AppId)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/Note$AppId;
    ((AppId)localObject).<init>("APP_ONENOTE", j, j);
    APP_ONENOTE = (AppId)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/Note$AppId;
    ((AppId)localObject).<init>("APP_EVERNOTE", i, i);
    APP_EVERNOTE = (AppId)localObject;
    localObject = new AppId[4];
    AppId localAppId = UNKNOWN;
    localObject[0] = localAppId;
    localAppId = APP_NATIVE;
    localObject[k] = localAppId;
    localAppId = APP_ONENOTE;
    localObject[j] = localAppId;
    localAppId = APP_EVERNOTE;
    localObject[i] = localAppId;
    a = (AppId[])localObject;
  }
  
  private Note$AppId(int paramInt1)
  {
    this.mAppId = paramInt1;
  }
  
  public int getValue()
  {
    return this.mAppId;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/command/data/Note$AppId.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */