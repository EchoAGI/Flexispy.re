package org.eclipse.paho.client.mqttv3.a.b;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

public class m
  extends b
{
  public m(byte paramByte, byte[] paramArrayOfByte)
  {
    super((byte)5);
    ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
    localByteArrayInputStream.<init>(paramArrayOfByte);
    DataInputStream localDataInputStream = new java/io/DataInputStream;
    localDataInputStream.<init>(localByteArrayInputStream);
    int i = localDataInputStream.readUnsignedShort();
    this.a = i;
    localDataInputStream.close();
  }
  
  public m(o paramo)
  {
    super((byte)5);
    int i = paramo.j();
    this.a = i;
  }
  
  protected byte[] f_()
  {
    return l();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/removeFromPath/m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */