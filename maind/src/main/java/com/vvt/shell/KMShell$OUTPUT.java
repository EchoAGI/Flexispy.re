package com.vvt.shell;

public enum KMShell$OUTPUT
{
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new com/vvt/shell/KMShell$OUTPUT;
    ((OUTPUT)localObject).<init>("NONE", 0);
    NONE = (OUTPUT)localObject;
    localObject = new com/vvt/shell/KMShell$OUTPUT;
    ((OUTPUT)localObject).<init>("STDOUT", j);
    STDOUT = (OUTPUT)localObject;
    localObject = new com/vvt/shell/KMShell$OUTPUT;
    ((OUTPUT)localObject).<init>("STDERR", i);
    STDERR = (OUTPUT)localObject;
    localObject = new OUTPUT[3];
    OUTPUT localOUTPUT = NONE;
    localObject[0] = localOUTPUT;
    localOUTPUT = STDOUT;
    localObject[j] = localOUTPUT;
    localOUTPUT = STDERR;
    localObject[i] = localOUTPUT;
    a = (OUTPUT[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/shell/KMShell$OUTPUT.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */