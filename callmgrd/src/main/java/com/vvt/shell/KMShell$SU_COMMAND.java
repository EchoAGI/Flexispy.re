package com.vvt.shell;

 enum KMShell$SU_COMMAND
{
  private String mCmd;
  
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new com/vvt/shell/KMShell$SU_COMMAND;
    ((SU_COMMAND)localObject).<init>("SU", 0, "su");
    SU = (SU_COMMAND)localObject;
    localObject = new com/vvt/shell/KMShell$SU_COMMAND;
    ((SU_COMMAND)localObject).<init>("BIN", j, "/system/bin/su");
    BIN = (SU_COMMAND)localObject;
    localObject = new com/vvt/shell/KMShell$SU_COMMAND;
    ((SU_COMMAND)localObject).<init>("XBIN", i, "/system/xbin/su");
    XBIN = (SU_COMMAND)localObject;
    localObject = new SU_COMMAND[3];
    SU_COMMAND localSU_COMMAND = SU;
    localObject[0] = localSU_COMMAND;
    localSU_COMMAND = BIN;
    localObject[j] = localSU_COMMAND;
    localSU_COMMAND = XBIN;
    localObject[i] = localSU_COMMAND;
    a = (SU_COMMAND[])localObject;
  }
  
  private KMShell$SU_COMMAND(String paramString1)
  {
    this.mCmd = paramString1;
  }
  
  public String getCommand()
  {
    return this.mCmd;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/shell/KMShell$SU_COMMAND.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */