package com.codebutler.android_websockets;

import java.io.DataInputStream;
import java.io.InputStream;

public class a
  extends DataInputStream
{
  public a(InputStream paramInputStream)
  {
    super(paramInputStream);
  }
  
  public byte[] a(int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    readFully(arrayOfByte);
    return arrayOfByte;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/codebutler/android_websockets/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */