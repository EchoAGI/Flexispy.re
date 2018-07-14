package org.eclipse.paho.client.mqttv3.a.b;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import org.eclipse.paho.client.mqttv3.a.j;
import org.eclipse.paho.client.mqttv3.b.b;
import org.eclipse.paho.client.mqttv3.b.c;

public class f
  extends InputStream
{
  private static final String a = f.class.getName();
  private static final b b;
  private DataInputStream c;
  
  static
  {
    String str = a;
    b = c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", str);
  }
  
  public f(InputStream paramInputStream)
  {
    DataInputStream localDataInputStream = new java/io/DataInputStream;
    localDataInputStream.<init>(paramInputStream);
    this.c = localDataInputStream;
  }
  
  public u a()
  {
    int i = 1;
    Object localObject1 = new java/io/ByteArrayOutputStream;
    ((ByteArrayOutputStream)localObject1).<init>();
    Object localObject2 = this.c;
    int j = ((DataInputStream)localObject2).readByte();
    int k = (byte)(j >>> 4 & 0xF);
    if (k >= i)
    {
      m = 14;
      if (k <= m) {}
    }
    else
    {
      throw j.a(32108);
    }
    long l = u.a(this.c).a();
    ((ByteArrayOutputStream)localObject1).write(j);
    localObject2 = u.a(l);
    ((ByteArrayOutputStream)localObject1).write((byte[])localObject2);
    localObject2 = new byte[(int)(((ByteArrayOutputStream)localObject1).size() + l)];
    Object localObject3 = this.c;
    int m = ((ByteArrayOutputStream)localObject1).size();
    int n = localObject2.length;
    int i1 = ((ByteArrayOutputStream)localObject1).size();
    n -= i1;
    ((DataInputStream)localObject3).readFully((byte[])localObject2, m, n);
    localObject1 = ((ByteArrayOutputStream)localObject1).toByteArray();
    k = localObject1.length;
    System.arraycopy(localObject1, 0, localObject2, 0, k);
    localObject1 = u.a((byte[])localObject2);
    localObject2 = b;
    localObject3 = a;
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = localObject1;
    ((b)localObject2).b((String)localObject3, "readMqttWireMessage", "501", arrayOfObject);
    return (u)localObject1;
  }
  
  public int available()
  {
    return this.c.available();
  }
  
  public void close()
  {
    this.c.close();
  }
  
  public int read()
  {
    return this.c.read();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/removeFromPath/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */