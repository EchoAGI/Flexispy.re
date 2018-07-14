package org.eclipse.paho.client.mqttv3.a.b;

import java.io.InputStream;

public class v
  extends InputStream
{
  private byte[] a;
  private int b;
  private int c;
  private byte[] d;
  private int e;
  private int f;
  private int g = 0;
  
  public v(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3, int paramInt4)
  {
    this.a = paramArrayOfByte1;
    this.d = paramArrayOfByte2;
    this.b = paramInt1;
    this.e = paramInt3;
    this.c = paramInt2;
    this.f = paramInt4;
  }
  
  public int read()
  {
    int i = this.g;
    int j = this.c;
    byte[] arrayOfByte;
    int k;
    if (i < j)
    {
      arrayOfByte = this.a;
      j = this.b;
      k = this.g;
      j += k;
      i = arrayOfByte[j];
      if (i < 0) {
        i += 256;
      }
      j = this.g + 1;
      this.g = j;
    }
    for (;;)
    {
      return i;
      i = this.g;
      j = this.c;
      k = this.f;
      j += k;
      if (i < j)
      {
        arrayOfByte = this.d;
        j = this.e;
        k = this.g;
        j += k;
        k = this.c;
        j -= k;
        i = arrayOfByte[j];
        break;
      }
      i = -1;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/removeFromPath/v.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */