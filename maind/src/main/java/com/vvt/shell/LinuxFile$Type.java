package com.vvt.shell;

public enum LinuxFile$Type
{
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject = new com/vvt/shell/LinuxFile$Type;
    ((Type)localObject).<init>("UNKNOWN", 0);
    UNKNOWN = (Type)localObject;
    localObject = new com/vvt/shell/LinuxFile$Type;
    ((Type)localObject).<init>("FILE", m);
    FILE = (Type)localObject;
    localObject = new com/vvt/shell/LinuxFile$Type;
    ((Type)localObject).<init>("DIR", k);
    DIR = (Type)localObject;
    localObject = new com/vvt/shell/LinuxFile$Type;
    ((Type)localObject).<init>("SOCKET", j);
    SOCKET = (Type)localObject;
    localObject = new com/vvt/shell/LinuxFile$Type;
    ((Type)localObject).<init>("DEV", i);
    DEV = (Type)localObject;
    localObject = new com/vvt/shell/LinuxFile$Type;
    ((Type)localObject).<init>("BLOCK", 5);
    BLOCK = (Type)localObject;
    localObject = new Type[6];
    Type localType1 = UNKNOWN;
    localObject[0] = localType1;
    localType1 = FILE;
    localObject[m] = localType1;
    localType1 = DIR;
    localObject[k] = localType1;
    localType1 = SOCKET;
    localObject[j] = localType1;
    localType1 = DEV;
    localObject[i] = localType1;
    Type localType2 = BLOCK;
    localObject[5] = localType2;
    a = (Type[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/shell/LinuxFile$Type.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */