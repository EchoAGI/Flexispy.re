package org.eclipse.paho.client.mqttv3.a.b;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

public class s
  extends b
{
  public s(byte paramByte, byte[] paramArrayOfByte)
  {
    super((byte)11);
    ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
    localByteArrayInputStream.<init>(paramArrayOfByte);
    DataInputStream localDataInputStream = new java/io/DataInputStream;
    localDataInputStream.<init>(localByteArrayInputStream);
    int i = localDataInputStream.readUnsignedShort();
    this.a = i;
    localDataInputStream.close();
  }
  
  protected byte[] f_()
  {
    return new byte[0];
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/removeFromPath/s.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */