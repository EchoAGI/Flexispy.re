package com.vvt.shell;

import java.io.FileDescriptor;

public class Exec
{
  static
  {
    System.loadLibrary("fxexec");
  }
  
  public static native void close(FileDescriptor paramFileDescriptor);
  
  public static native FileDescriptor createSubprocess(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2, int[] paramArrayOfInt);
  
  public static native void hangupProcessGroup(int paramInt);
  
  public static native void setPtyUTF8Mode(FileDescriptor paramFileDescriptor, boolean paramBoolean);
  
  public static native void setPtyWindowSize(FileDescriptor paramFileDescriptor, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public static native int waitFor(int paramInt);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/shell/Exec.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */