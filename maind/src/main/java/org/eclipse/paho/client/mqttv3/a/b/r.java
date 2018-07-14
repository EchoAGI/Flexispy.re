package org.eclipse.paho.client.mqttv3.a.b;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.k;

public class r
  extends u
{
  private String[] c;
  private int[] d;
  private int e;
  
  public r(byte paramByte, byte[] paramArrayOfByte)
  {
    super((byte)8);
    Object localObject = new java/io/ByteArrayInputStream;
    ((ByteArrayInputStream)localObject).<init>(paramArrayOfByte);
    DataInputStream localDataInputStream = new java/io/DataInputStream;
    localDataInputStream.<init>((InputStream)localObject);
    int k = localDataInputStream.readUnsignedShort();
    this.a = k;
    this.e = 0;
    localObject = new String[i];
    this.c = ((String[])localObject);
    localObject = new int[i];
    this.d = ((int[])localObject);
    while (j == 0) {
      try
      {
        localObject = this.c;
        i = this.e;
        String str = b(localDataInputStream);
        localObject[i] = str;
        localObject = this.d;
        i = this.e;
        int m = i + 1;
        this.e = m;
        m = localDataInputStream.readByte();
        localObject[i] = m;
      }
      catch (Exception localException)
      {
        j = 1;
      }
    }
    localDataInputStream.close();
  }
  
  public r(String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    super((byte)8);
    this.c = paramArrayOfString;
    this.d = paramArrayOfInt;
    int i = paramArrayOfString.length;
    int j = paramArrayOfInt.length;
    if (i != j)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>();
      throw localIllegalArgumentException;
    }
    i = 0;
    IllegalArgumentException localIllegalArgumentException = null;
    for (;;)
    {
      j = paramArrayOfInt.length;
      if (i >= j) {
        break;
      }
      j = paramArrayOfInt[i];
      k.a(j);
      i += 1;
    }
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
    try
    {
      localObject1 = new java/io/ByteArrayOutputStream;
      ((ByteArrayOutputStream)localObject1).<init>();
      DataOutputStream localDataOutputStream = new java/io/DataOutputStream;
      localDataOutputStream.<init>((OutputStream)localObject1);
      int i = 0;
      Object localObject2 = null;
      for (;;)
      {
        Object localObject3 = this.c;
        int j = localObject3.length;
        if (i >= j) {
          break;
        }
        localObject3 = this.c;
        localObject3 = localObject3[i];
        a(localDataOutputStream, (String)localObject3);
        localObject3 = this.d;
        j = localObject3[i];
        localDataOutputStream.writeByte(j);
        i += 1;
      }
      return ((ByteArrayOutputStream)localObject1).toByteArray();
    }
    catch (IOException localIOException)
    {
      Object localObject1 = new org/eclipse/paho/client/mqttv3/MqttException;
      ((MqttException)localObject1).<init>(localIOException);
      throw ((Throwable)localObject1);
    }
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
    int i = 0;
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    Object localObject1 = super.toString();
    localStringBuffer.append((String)localObject1);
    localStringBuffer.append(" names:[");
    int j = 0;
    localObject1 = null;
    for (;;)
    {
      int k = this.e;
      if (j >= k) {
        break;
      }
      if (j > 0)
      {
        localObject2 = ", ";
        localStringBuffer.append((String)localObject2);
      }
      Object localObject2 = localStringBuffer.append("\"");
      String str = this.c[j];
      localObject2 = ((StringBuffer)localObject2).append(str);
      str = "\"";
      ((StringBuffer)localObject2).append(str);
      j += 1;
    }
    localObject1 = "] qos:[";
    localStringBuffer.append((String)localObject1);
    for (;;)
    {
      j = this.e;
      if (i >= j) {
        break;
      }
      if (i > 0)
      {
        localObject1 = ", ";
        localStringBuffer.append((String)localObject1);
      }
      localObject1 = this.d;
      j = localObject1[i];
      localStringBuffer.append(j);
      i += 1;
    }
    localStringBuffer.append("]");
    return localStringBuffer.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/removeFromPath/r.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */