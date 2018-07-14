package org.eclipse.paho.client.mqttv3.a.b;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import org.eclipse.paho.client.mqttv3.b.b;
import org.eclipse.paho.client.mqttv3.b.c;

public class g
  extends OutputStream
{
  private static final String a = g.class.getName();
  private static final b b;
  private BufferedOutputStream c;
  
  static
  {
    String str = a;
    b = c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", str);
  }
  
  public g(OutputStream paramOutputStream)
  {
    BufferedOutputStream localBufferedOutputStream = new java/io/BufferedOutputStream;
    localBufferedOutputStream.<init>(paramOutputStream);
    this.c = localBufferedOutputStream;
  }
  
  public void a(u paramu)
  {
    Object localObject1 = paramu.k();
    Object localObject2 = paramu.e_();
    BufferedOutputStream localBufferedOutputStream = this.c;
    int i = localObject1.length;
    localBufferedOutputStream.write((byte[])localObject1, 0, i);
    localObject1 = this.c;
    int j = localObject2.length;
    ((BufferedOutputStream)localObject1).write((byte[])localObject2, 0, j);
    localObject1 = b;
    localObject2 = a;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramu;
    ((b)localObject1).b((String)localObject2, "write", "500", arrayOfObject);
  }
  
  public void close()
  {
    this.c.close();
  }
  
  public void flush()
  {
    this.c.flush();
  }
  
  public void write(int paramInt)
  {
    this.c.write(paramInt);
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    this.c.write(paramArrayOfByte);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.c.write(paramArrayOfByte, paramInt1, paramInt2);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/removeFromPath/FxFileObserverWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */