package com.vvt.shell;

public enum ShellUtil$SELinuxMode
{
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new com/vvt/shell/ShellUtil$SELinuxMode;
    ((SELinuxMode)localObject).<init>("ENFORCING", 0);
    ENFORCING = (SELinuxMode)localObject;
    localObject = new com/vvt/shell/ShellUtil$SELinuxMode;
    ((SELinuxMode)localObject).<init>("PERMISSIVE", j);
    PERMISSIVE = (SELinuxMode)localObject;
    localObject = new com/vvt/shell/ShellUtil$SELinuxMode;
    ((SELinuxMode)localObject).<init>("UNKNOWN", i);
    UNKNOWN = (SELinuxMode)localObject;
    localObject = new SELinuxMode[3];
    SELinuxMode localSELinuxMode = ENFORCING;
    localObject[0] = localSELinuxMode;
    localSELinuxMode = PERMISSIVE;
    localObject[j] = localSELinuxMode;
    localSELinuxMode = UNKNOWN;
    localObject[i] = localSELinuxMode;
    a = (SELinuxMode[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/shell/ShellUtil$SELinuxMode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */