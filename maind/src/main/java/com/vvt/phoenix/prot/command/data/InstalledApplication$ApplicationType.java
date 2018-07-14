package com.vvt.phoenix.prot.command.data;

public enum InstalledApplication$ApplicationType
{
  private int mAppType;
  
  static
  {
    int i = 1;
    Object localObject = new com/vvt/phoenix/prot/command/data/InstalledApplication$ApplicationType;
    ((ApplicationType)localObject).<init>("NON_BROWSER", 0, 0);
    NON_BROWSER = (ApplicationType)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/InstalledApplication$ApplicationType;
    ((ApplicationType)localObject).<init>("BROWSER", i, i);
    BROWSER = (ApplicationType)localObject;
    localObject = new ApplicationType[2];
    ApplicationType localApplicationType = NON_BROWSER;
    localObject[0] = localApplicationType;
    localApplicationType = BROWSER;
    localObject[i] = localApplicationType;
    a = (ApplicationType[])localObject;
  }
  
  private InstalledApplication$ApplicationType(int paramInt1)
  {
    this.mAppType = paramInt1;
  }
  
  public int getValue()
  {
    return this.mAppType;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/command/data/InstalledApplication$ApplicationType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */