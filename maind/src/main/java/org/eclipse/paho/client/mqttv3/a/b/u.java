package org.eclipse.paho.client.mqttv3.a.b;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import org.eclipse.paho.client.mqttv3.MqttException;

public abstract class u
{
  private static final String[] c;
  protected int a;
  protected boolean b = false;
  private byte d;
  private byte[] e = null;
  
  static
  {
    String[] arrayOfString = new String[15];
    arrayOfString[0] = "reserved";
    arrayOfString[1] = "CONNECT";
    arrayOfString[2] = "CONNACK";
    arrayOfString[3] = "PUBLISH";
    arrayOfString[4] = "PUBACK";
    arrayOfString[5] = "PUBREC";
    arrayOfString[6] = "PUBREL";
    arrayOfString[7] = "PUBCOMP";
    arrayOfString[8] = "SUBSCRIBE";
    arrayOfString[9] = "SUBACK";
    arrayOfString[10] = "UNSUBSCRIBE";
    arrayOfString[11] = "UNSUBACK";
    arrayOfString[12] = "PINGREQ";
    arrayOfString[13] = "PINGRESP";
    arrayOfString[14] = "DISCONNECT";
    c = arrayOfString;
  }
  
  public u(byte paramByte)
  {
    this.d = paramByte;
    this.a = 0;
  }
  
  private static u a(InputStream paramInputStream)
  {
    int i = 6;
    for (;;)
    {
      Object localObject3;
      int j;
      int k;
      try
      {
        Object localObject1 = new org/eclipse/paho/client/mqttv3/a/b/a;
        ((a)localObject1).<init>(paramInputStream);
        localObject3 = new java/io/DataInputStream;
        ((DataInputStream)localObject3).<init>((InputStream)localObject1);
        j = ((DataInputStream)localObject3).readUnsignedByte();
        k = (byte)(j >> 4);
        j = (byte)(j & 0xF);
        w localw = a((DataInputStream)localObject3);
        long l1 = localw.a();
        int m = ((a)localObject1).a();
        long l2 = m;
        l1 += l2;
        l2 = ((a)localObject1).a();
        l1 -= l2;
        n = 0;
        localObject1 = null;
        localObject1 = new byte[0];
        l2 = 0L;
        boolean bool = l1 < l2;
        if (bool)
        {
          n = (int)l1;
          localObject1 = new byte[n];
          localw = null;
          int i1 = localObject1.length;
          ((DataInputStream)localObject3).readFully((byte[])localObject1, 0, i1);
        }
        localObject3 = localObject1;
        n = 1;
        if (k == n)
        {
          localObject1 = new org/eclipse/paho/client/mqttv3/a/b/d;
          ((d)localObject1).<init>(j, (byte[])localObject3);
          return (u)localObject1;
        }
        n = 3;
        if (k == n)
        {
          localObject1 = new org/eclipse/paho/client/mqttv3/a/b/o;
          ((o)localObject1).<init>(j, (byte[])localObject3);
          continue;
        }
        n = 4;
      }
      catch (IOException localIOException)
      {
        localObject3 = new org/eclipse/paho/client/mqttv3/MqttException;
        ((MqttException)localObject3).<init>(localIOException);
        throw ((Throwable)localObject3);
      }
      if (k == n)
      {
        localObject2 = new org/eclipse/paho/client/mqttv3/a/b/k;
        ((k)localObject2).<init>(j, (byte[])localObject3);
      }
      else
      {
        n = 7;
        if (k == n)
        {
          localObject2 = new org/eclipse/paho/client/mqttv3/a/b/l;
          ((l)localObject2).<init>(j, (byte[])localObject3);
        }
        else
        {
          n = 2;
          if (k == n)
          {
            localObject2 = new org/eclipse/paho/client/mqttv3/a/b/c;
            ((c)localObject2).<init>(j, (byte[])localObject3);
          }
          else
          {
            n = 12;
            if (k == n)
            {
              localObject2 = new org/eclipse/paho/client/mqttv3/a/b/i;
              ((i)localObject2).<init>(j, (byte[])localObject3);
            }
            else
            {
              n = 13;
              if (k == n)
              {
                localObject2 = new org/eclipse/paho/client/mqttv3/a/b/j;
                ((j)localObject2).<init>(j, (byte[])localObject3);
              }
              else
              {
                n = 8;
                if (k == n)
                {
                  localObject2 = new org/eclipse/paho/client/mqttv3/a/b/r;
                  ((r)localObject2).<init>(j, (byte[])localObject3);
                }
                else
                {
                  n = 9;
                  if (k == n)
                  {
                    localObject2 = new org/eclipse/paho/client/mqttv3/a/b/q;
                    ((q)localObject2).<init>(j, (byte[])localObject3);
                  }
                  else
                  {
                    n = 10;
                    if (k == n)
                    {
                      localObject2 = new org/eclipse/paho/client/mqttv3/a/b/t;
                      ((t)localObject2).<init>(j, (byte[])localObject3);
                    }
                    else
                    {
                      n = 11;
                      if (k == n)
                      {
                        localObject2 = new org/eclipse/paho/client/mqttv3/a/b/s;
                        ((s)localObject2).<init>(j, (byte[])localObject3);
                      }
                      else if (k == i)
                      {
                        localObject2 = new org/eclipse/paho/client/mqttv3/a/b/n;
                        ((n)localObject2).<init>(j, (byte[])localObject3);
                      }
                      else
                      {
                        n = 5;
                        if (k == n)
                        {
                          localObject2 = new org/eclipse/paho/client/mqttv3/a/b/m;
                          ((m)localObject2).<init>(j, (byte[])localObject3);
                        }
                        else
                        {
                          n = 14;
                          if (k != n) {
                            break;
                          }
                          localObject2 = new org/eclipse/paho/client/mqttv3/a/b/e;
                          ((e)localObject2).<init>(j, (byte[])localObject3);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    int n = 6;
    Object localObject2 = org.eclipse.paho.client.mqttv3.a.j.a(n);
    throw ((Throwable)localObject2);
  }
  
  public static u a(org.eclipse.paho.client.mqttv3.l paraml)
  {
    byte[] arrayOfByte1 = paraml.d();
    if (arrayOfByte1 == null)
    {
      localv = null;
      arrayOfByte1 = new byte[0];
    }
    v localv = new org/eclipse/paho/client/mqttv3/a/b/v;
    byte[] arrayOfByte2 = paraml.a();
    int i = paraml.c();
    int j = paraml.b();
    int k = paraml.f();
    int m = paraml.c_();
    localv.<init>(arrayOfByte2, i, j, arrayOfByte1, k, m);
    return a(localv);
  }
  
  public static u a(byte[] paramArrayOfByte)
  {
    ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
    localByteArrayInputStream.<init>(paramArrayOfByte);
    return a(localByteArrayInputStream);
  }
  
  protected static w a(DataInputStream paramDataInputStream)
  {
    long l1 = 0L;
    int i = 1;
    int j = 0;
    int k;
    do
    {
      k = paramDataInputStream.readByte();
      j += 1;
      int m = (k & 0x7F) * i;
      long l2 = m;
      l1 += l2;
      i *= 128;
      k &= 0x80;
    } while (k != 0);
    w localw = new org/eclipse/paho/client/mqttv3/a/b/w;
    localw.<init>(l1, j);
    return localw;
  }
  
  protected static byte[] a(long paramLong)
  {
    long l1 = 128L;
    long l2 = 0L;
    int i = 0;
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    int k;
    do
    {
      long l3 = paramLong % l1;
      int j = (byte)(int)l3;
      paramLong /= l1;
      boolean bool2 = paramLong < l2;
      if (bool2) {
        j = (byte)(j | 0x80);
      }
      localByteArrayOutputStream.write(j);
      i += 1;
      boolean bool1 = paramLong < l2;
      if (!bool1) {
        break;
      }
      k = 4;
    } while (i < k);
    return localByteArrayOutputStream.toByteArray();
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  protected void a(DataOutputStream paramDataOutputStream, String paramString)
  {
    Object localObject = "UTF-8";
    try
    {
      localObject = paramString.getBytes((String)localObject);
      int i = (byte)(localObject.length >>> 8 & 0xFF);
      int j = (byte)(localObject.length >>> 0 & 0xFF);
      paramDataOutputStream.write(i);
      paramDataOutputStream.write(j);
      paramDataOutputStream.write((byte[])localObject);
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      localMqttException = new org/eclipse/paho/client/mqttv3/MqttException;
      localMqttException.<init>(localUnsupportedEncodingException);
      throw localMqttException;
    }
    catch (IOException localIOException)
    {
      MqttException localMqttException = new org/eclipse/paho/client/mqttv3/MqttException;
      localMqttException.<init>(localIOException);
      throw localMqttException;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  protected String b(DataInputStream paramDataInputStream)
  {
    try
    {
      int i = paramDataInputStream.readUnsignedShort();
      byte[] arrayOfByte = new byte[i];
      paramDataInputStream.readFully(arrayOfByte);
      localObject = new java/lang/String;
      String str = "UTF-8";
      ((String)localObject).<init>(arrayOfByte, str);
      return (String)localObject;
    }
    catch (IOException localIOException)
    {
      Object localObject = new org/eclipse/paho/client/mqttv3/MqttException;
      ((MqttException)localObject).<init>(localIOException);
      throw ((Throwable)localObject);
    }
  }
  
  protected abstract byte d_();
  
  public String e()
  {
    return Integer.valueOf(j()).toString();
  }
  
  public byte[] e_()
  {
    return new byte[0];
  }
  
  protected abstract byte[] f_();
  
  public boolean g_()
  {
    return true;
  }
  
  public byte i()
  {
    return this.d;
  }
  
  public int j()
  {
    return this.a;
  }
  
  public byte[] k()
  {
    byte[] arrayOfByte = this.e;
    if (arrayOfByte == null) {}
    try
    {
      int i = (i() & 0xF) << 4;
      int j = d_() & 0xF;
      i ^= j;
      localObject1 = f_();
      int k = localObject1.length;
      Object localObject2 = e_();
      int m = localObject2.length;
      k += m;
      localObject2 = new java/io/ByteArrayOutputStream;
      ((ByteArrayOutputStream)localObject2).<init>();
      DataOutputStream localDataOutputStream = new java/io/DataOutputStream;
      localDataOutputStream.<init>((OutputStream)localObject2);
      localDataOutputStream.writeByte(i);
      long l = k;
      arrayOfByte = a(l);
      localDataOutputStream.write(arrayOfByte);
      localDataOutputStream.write((byte[])localObject1);
      localDataOutputStream.flush();
      arrayOfByte = ((ByteArrayOutputStream)localObject2).toByteArray();
      this.e = arrayOfByte;
      return this.e;
    }
    catch (IOException localIOException)
    {
      Object localObject1 = new org/eclipse/paho/client/mqttv3/MqttException;
      ((MqttException)localObject1).<init>(localIOException);
      throw ((Throwable)localObject1);
    }
  }
  
  protected byte[] l()
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
    String[] arrayOfString = c;
    int i = this.d;
    return arrayOfString[i];
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/removeFromPath/u.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */