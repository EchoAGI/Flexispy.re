package com.vvt.shell;

public enum ExecShell$SHELL_CMD
{
  String[] command;
  
  static
  {
    int i = 1;
    Object localObject = new com/vvt/shell/ExecShell$SHELL_CMD;
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "which";
    arrayOfString[i] = "su";
    ((SHELL_CMD)localObject).<init>("check_su_binary", 0, arrayOfString);
    check_su_binary = (SHELL_CMD)localObject;
    localObject = new SHELL_CMD[i];
    SHELL_CMD localSHELL_CMD = check_su_binary;
    localObject[0] = localSHELL_CMD;
    a = (SHELL_CMD[])localObject;
  }
  
  private ExecShell$SHELL_CMD(String[] paramArrayOfString)
  {
    this.command = paramArrayOfString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/shell/ExecShell$SHELL_CMD.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */