package org.eclipse.paho.client.mqttv3.a.b;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

public class q
  extends b
{
  private int[] c;
  
  public q(byte paramByte, byte[] paramArrayOfByte)
  {
    super((byte)9);
    Object localObject = new java/io/ByteArrayInputStream;
    ((ByteArrayInputStream)localObject).<init>(paramArrayOfByte);
    DataInputStream localDataInputStream = new java/io/DataInputStream;
    localDataInputStream.<init>((InputStream)localObject);
    int i = localDataInputStream.readUnsignedShort();
    this.a = i;
    int j = 0;
    localObject = new int[paramArrayOfByte.length + -2];
    this.c = ((int[])localObject);
    for (i = localDataInputStream.read();; i = localDataInputStream.read())
    {
      int k = -1;
      if (i == k) {
        break;
      }
      int[] arrayOfInt = this.c;
      arrayOfInt[j] = i;
      j += 1;
    }
    localDataInputStream.close();
  }
  
  public int[] f()
  {
    return this.c;
  }
  
  protected byte[] f_()
  {
    return new byte[0];
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    Object localObject1 = super.toString();
    localObject1 = localStringBuffer.append((String)localObject1);
    Object localObject2 = " granted Qos";
    ((StringBuffer)localObject1).append((String)localObject2);
    int i = 0;
    localObject1 = null;
    for (;;)
    {
      localObject2 = this.c;
      int j = localObject2.length;
      if (i >= j) {
        break;
      }
      localObject2 = localStringBuffer.append(" ");
      int[] arrayOfInt = this.c;
      int k = arrayOfInt[i];
      ((StringBuffer)localObject2).append(k);
      i += 1;
    }
    return localStringBuffer.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/removeFromPath/q.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */