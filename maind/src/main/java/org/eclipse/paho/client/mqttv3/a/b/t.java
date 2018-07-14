package org.eclipse.paho.client.mqttv3.a.b;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.eclipse.paho.client.mqttv3.MqttException;

public class t
  extends u
{
  private String[] c;
  private int d;
  
  public t(byte paramByte, byte[] paramArrayOfByte)
  {
    super(b);
    Object localObject = new java/io/ByteArrayInputStream;
    ((ByteArrayInputStream)localObject).<init>(paramArrayOfByte);
    DataInputStream localDataInputStream = new java/io/DataInputStream;
    localDataInputStream.<init>((InputStream)localObject);
    int k = localDataInputStream.readUnsignedShort();
    this.a = k;
    this.d = 0;
    localObject = new String[b];
    this.c = ((String[])localObject);
    while (j == 0) {
      try
      {
        localObject = this.c;
        int i = this.d;
        String str = b(localDataInputStream);
        localObject[i] = str;
      }
      catch (Exception localException)
      {
        j = 1;
      }
    }
    localDataInputStream.close();
  }
  
  protected byte d_()
  {
    boolean bool = this.b;
    if (bool) {}
    for (int i = 8;; i = 0) {
      return (byte)(i | 0x2);
    }
  }
  
  public byte[] e_()
  {
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    DataOutputStream localDataOutputStream = new java/io/DataOutputStream;
    localDataOutputStream.<init>(localByteArrayOutputStream);
    int i = 0;
    for (;;)
    {
      Object localObject = this.c;
      int j = localObject.length;
      if (i >= j) {
        break;
      }
      localObject = this.c[i];
      a(localDataOutputStream, (String)localObject);
      i += 1;
    }
    return localByteArrayOutputStream.toByteArray();
  }
  
  protected byte[] f_()
  {
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>();
      localObject = new java/io/DataOutputStream;
      ((DataOutputStream)localObject).<init>(localByteArrayOutputStream);
      int i = this.a;
      ((DataOutputStream)localObject).writeShort(i);
      ((DataOutputStream)localObject).flush();
      return localByteArrayOutputStream.toByteArray();
    }
    catch (IOException localIOException)
    {
      Object localObject = new org/eclipse/paho/client/mqttv3/MqttException;
      ((MqttException)localObject).<init>(localIOException);
      throw ((Throwable)localObject);
    }
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    String str1 = super.toString();
    localStringBuffer.append(str1);
    localStringBuffer.append(" names:[");
    int i = 0;
    str1 = null;
    for (;;)
    {
      int j = this.d;
      if (i >= j) {
        break;
      }
      if (i > 0)
      {
        localObject = ", ";
        localStringBuffer.append((String)localObject);
      }
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("\"");
      String str2 = this.c[i];
      localObject = ((StringBuilder)localObject).append(str2);
      str2 = "\"";
      localObject = str2;
      localStringBuffer.append((String)localObject);
      i += 1;
    }
    localStringBuffer.append("]");
    return localStringBuffer.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/removeFromPath/t.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */