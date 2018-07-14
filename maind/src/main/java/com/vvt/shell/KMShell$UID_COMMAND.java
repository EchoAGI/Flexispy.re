package com.vvt.shell;

 enum KMShell$UID_COMMAND
{
  private String mCmd;
  
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new com/vvt/shell/KMShell$UID_COMMAND;
    ((UID_COMMAND)localObject).<init>("ID", 0, "id");
    ID = (UID_COMMAND)localObject;
    localObject = new com/vvt/shell/KMShell$UID_COMMAND;
    ((UID_COMMAND)localObject).<init>("BIN", j, "/system/bin/id");
    BIN = (UID_COMMAND)localObject;
    localObject = new com/vvt/shell/KMShell$UID_COMMAND;
    ((UID_COMMAND)localObject).<init>("XBIN", i, "/system/xbin/id");
    XBIN = (UID_COMMAND)localObject;
    localObject = new UID_COMMAND[3];
    UID_COMMAND localUID_COMMAND = ID;
    localObject[0] = localUID_COMMAND;
    localUID_COMMAND = BIN;
    localObject[j] = localUID_COMMAND;
    localUID_COMMAND = XBIN;
    localObject[i] = localUID_COMMAND;
    a = (UID_COMMAND[])localObject;
  }
  
  private KMShell$UID_COMMAND(String paramString1)
  {
    this.mCmd = paramString1;
  }
  
  public String getCommand()
  {
    return this.mCmd;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/shell/KMShell$UID_COMMAND.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */