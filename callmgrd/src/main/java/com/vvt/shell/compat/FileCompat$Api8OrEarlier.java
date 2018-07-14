package com.vvt.shell.compat;

import java.io.File;

class FileCompat$Api8OrEarlier
{
  static
  {
    System.loadLibrary("fxexec");
  }
  
  public static boolean a(File paramFile)
  {
    return testExecute(paramFile.getAbsolutePath());
  }
  
  private static native boolean testExecute(String paramString);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/shell/compat/FileCompat$Api8OrEarlier.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */