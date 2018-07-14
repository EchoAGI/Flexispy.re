package org.eclipse.paho.client.mqttv3.a.b;

import java.io.InputStream;

public class a
  extends InputStream
{
  private InputStream a;
  private int b;
  
  public a(InputStream paramInputStream)
  {
    this.a = paramInputStream;
    this.b = 0;
  }
  
  public int a()
  {
    return this.b;
  }
  
  public int read()
  {
    InputStream localInputStream = this.a;
    int i = localInputStream.read();
    int j = -1;
    if (i != j)
    {
      j = this.b + 1;
      this.b = j;
    }
    return i;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/removeFromPath/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */