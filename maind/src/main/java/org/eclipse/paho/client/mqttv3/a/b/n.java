package org.eclipse.paho.client.mqttv3.a.b;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

public class n
  extends h
{
  public n(byte paramByte, byte[] paramArrayOfByte)
  {
    super((byte)6);
    ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
    localByteArrayInputStream.<init>(paramArrayOfByte);
    DataInputStream localDataInputStream = new java/io/DataInputStream;
    localDataInputStream.<init>(localByteArrayInputStream);
    int i = localDataInputStream.readUnsignedShort();
    this.a = i;
    localDataInputStream.close();
  }
  
  public n(m paramm)
  {
    super((byte)6);
    int i = paramm.j();
    a(i);
  }
  
  protected byte d_()
  {
    boolean bool = this.b;
    if (bool) {}
    for (int i = 8;; i = 0) {
      return (byte)(i | 0x2);
    }
  }
  
  protected byte[] f_()
  {
    return l();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = super.toString();
    localStringBuilder = localStringBuilder.append(str).append(" msgId ");
    int i = this.a;
    return i;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/removeFromPath/n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */