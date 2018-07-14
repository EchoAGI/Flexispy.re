package org.eclipse.paho.client.mqttv3.a.b;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.k;

public class o
  extends h
{
  private k c;
  private String d;
  private byte[] e = null;
  
  public o(byte paramByte, byte[] paramArrayOfByte)
  {
    super((byte)3);
    Object localObject1 = new org/eclipse/paho/client/mqttv3/a/b/p;
    ((p)localObject1).<init>();
    this.c = ((k)localObject1);
    localObject1 = this.c;
    int k = paramByte >> 1 & 0x3;
    ((k)localObject1).b(k);
    int m = paramByte & 0x1;
    if (m == i)
    {
      localObject1 = this.c;
      ((k)localObject1).a(i);
    }
    int n = paramByte & 0x8;
    k = 8;
    if (n == k)
    {
      localObject1 = (p)this.c;
      ((p)localObject1).b(i);
    }
    localObject1 = new java/io/ByteArrayInputStream;
    ((ByteArrayInputStream)localObject1).<init>(paramArrayOfByte);
    Object localObject2 = new org/eclipse/paho/client/mqttv3/a/b/a;
    ((a)localObject2).<init>((InputStream)localObject1);
    localObject1 = new java/io/DataInputStream;
    ((DataInputStream)localObject1).<init>((InputStream)localObject2);
    Object localObject3 = b((DataInputStream)localObject1);
    this.d = ((String)localObject3);
    localObject3 = this.c;
    int j = ((k)localObject3).c();
    if (j > 0)
    {
      j = ((DataInputStream)localObject1).readUnsignedShort();
      this.a = j;
    }
    j = paramArrayOfByte.length;
    k = ((a)localObject2).a();
    localObject2 = new byte[j - k];
    ((DataInputStream)localObject1).readFully((byte[])localObject2);
    ((DataInputStream)localObject1).close();
    this.c.a((byte[])localObject2);
  }
  
  public o(String paramString, k paramk)
  {
    super((byte)3);
    this.d = paramString;
    this.c = paramk;
  }
  
  protected static byte[] a(k paramk)
  {
    return paramk.a();
  }
  
  public void a(int paramInt)
  {
    super.a(paramInt);
    Object localObject = this.c;
    boolean bool = localObject instanceof p;
    if (bool)
    {
      localObject = (p)this.c;
      ((p)localObject).c(paramInt);
    }
  }
  
  public int c_()
  {
    int i = 0;
    try
    {
      byte[] arrayOfByte = e_();
      i = arrayOfByte.length;
    }
    catch (MqttException localMqttException)
    {
      for (;;) {}
    }
    return i;
  }
  
  protected byte d_()
  {
    k localk1 = this.c;
    byte b = (byte)(localk1.c() << 1);
    k localk2 = this.c;
    boolean bool = localk2.b();
    if (bool) {
      b = (byte)(b | 0x1);
    }
    localk2 = this.c;
    bool = localk2.e();
    if (!bool)
    {
      bool = this.b;
      if (!bool) {}
    }
    else
    {
      b = (byte)(b | 0x8);
    }
    return b;
  }
  
  public byte[] e_()
  {
    byte[] arrayOfByte = this.e;
    if (arrayOfByte == null)
    {
      arrayOfByte = a(this.c);
      this.e = arrayOfByte;
    }
    return this.e;
  }
  
  protected byte[] f_()
  {
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>();
      localObject1 = new java/io/DataOutputStream;
      ((DataOutputStream)localObject1).<init>(localByteArrayOutputStream);
      Object localObject2 = this.d;
      a((DataOutputStream)localObject1, (String)localObject2);
      localObject2 = this.c;
      int i = ((k)localObject2).c();
      if (i > 0)
      {
        i = this.a;
        ((DataOutputStream)localObject1).writeShort(i);
      }
      ((DataOutputStream)localObject1).flush();
      return localByteArrayOutputStream.toByteArray();
    }
    catch (IOException localIOException)
    {
      Object localObject1 = new org/eclipse/paho/client/mqttv3/MqttException;
      ((MqttException)localObject1).<init>(localIOException);
      throw ((Throwable)localObject1);
    }
  }
  
  public String g()
  {
    return this.d;
  }
  
  public boolean g_()
  {
    return true;
  }
  
  public k h()
  {
    return this.c;
  }
  
  public String toString()
  {
    int i = 0;
    Object localObject1 = null;
    StringBuffer localStringBuffer1 = new java/lang/StringBuffer;
    localStringBuffer1.<init>();
    byte[] arrayOfByte = this.c.a();
    int j = Math.min(arrayOfByte.length, 20);
    int k = 0;
    StringBuffer localStringBuffer2 = null;
    while (k < j)
    {
      i = arrayOfByte[k];
      localObject1 = Integer.toHexString(i);
      m = ((String)localObject1).length();
      int n = 1;
      if (m == n)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str2 = "0";
        localObject2 = ((StringBuilder)localObject2).append(str2);
        localObject1 = (String)localObject1;
      }
      localStringBuffer1.append((String)localObject1);
      i = k + 1;
      k = i;
    }
    try
    {
      localObject1 = new java/lang/String;
      k = 0;
      localStringBuffer2 = null;
      localObject2 = "UTF-8";
      ((String)localObject1).<init>(arrayOfByte, 0, j, (String)localObject2);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject3;
        boolean bool;
        int i1;
        String str1 = "?";
      }
    }
    localStringBuffer2 = new java/lang/StringBuffer;
    localStringBuffer2.<init>();
    localObject3 = super.toString();
    localStringBuffer2.append((String)localObject3);
    localObject3 = localStringBuffer2.append(" qos:");
    Object localObject2 = this.c;
    int m = ((k)localObject2).c();
    ((StringBuffer)localObject3).append(m);
    localObject3 = this.c;
    j = ((k)localObject3).c();
    if (j > 0)
    {
      localObject3 = localStringBuffer2.append(" msgId:");
      m = this.a;
      ((StringBuffer)localObject3).append(m);
    }
    localObject3 = localStringBuffer2.append(" retained:");
    bool = this.c.b();
    ((StringBuffer)localObject3).append(bool);
    localObject3 = localStringBuffer2.append(" dup:");
    bool = this.b;
    ((StringBuffer)localObject3).append(bool);
    localObject3 = localStringBuffer2.append(" topic:\"");
    localObject2 = this.d;
    ((StringBuffer)localObject3).append((String)localObject2).append("\"");
    localStringBuffer2.append(" payload:[hex:").append(localStringBuffer1);
    localStringBuffer2.append(" utf8:\"").append((String)localObject1).append("\"");
    localObject1 = localStringBuffer2.append(" length:");
    i1 = arrayOfByte.length;
    ((StringBuffer)localObject1).append(i1).append("]");
    return localStringBuffer2.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/removeFromPath/o.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */