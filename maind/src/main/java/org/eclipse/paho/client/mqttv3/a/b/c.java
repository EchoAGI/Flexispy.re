package org.eclipse.paho.client.mqttv3.a.b;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

public class c
  extends b
{
  private int c;
  private boolean d;
  
  public c(byte paramByte, byte[] paramArrayOfByte)
  {
    super((byte)2);
    ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
    localByteArrayInputStream.<init>(paramArrayOfByte);
    DataInputStream localDataInputStream = new java/io/DataInputStream;
    localDataInputStream.<init>(localByteArrayInputStream);
    int j = localDataInputStream.readUnsignedByte() & 0x1;
    if (j == i) {}
    for (;;)
    {
      this.d = i;
      i = localDataInputStream.readUnsignedByte();
      this.c = i;
      localDataInputStream.close();
      return;
      i = 0;
    }
  }
  
  public int b_()
  {
    return this.c;
  }
  
  public String e()
  {
    return "Con";
  }
  
  protected byte[] f_()
  {
    return new byte[0];
  }
  
  public boolean g_()
  {
    return false;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = super.toString();
    localStringBuilder = localStringBuilder.append(str).append(" session present:");
    boolean bool = this.d;
    localStringBuilder = localStringBuilder.append(bool).append(" return code: ");
    int i = this.c;
    return i;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/removeFromPath/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */