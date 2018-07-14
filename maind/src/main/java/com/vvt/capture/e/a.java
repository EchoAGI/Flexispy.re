package com.vvt.capture.e;

import java.util.Arrays;

public class a
{
  public String a = "";
  public long b = 0L;
  public byte[] c;
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[3];
    Object localObject = this.a;
    arrayOfObject[0] = localObject;
    localObject = Long.valueOf(this.b);
    arrayOfObject[1] = localObject;
    localObject = Arrays.toString(this.c);
    arrayOfObject[2] = localObject;
    return String.format("subkey: %s acualSize: %d serialized_data: %s", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/e/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */