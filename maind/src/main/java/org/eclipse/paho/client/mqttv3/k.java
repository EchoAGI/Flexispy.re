package org.eclipse.paho.client.mqttv3;

public class k
{
  private boolean a;
  private byte[] b;
  private int c;
  private boolean d;
  private boolean e;
  
  public k()
  {
    this.a = i;
    this.c = i;
    this.d = false;
    this.e = false;
    byte[] arrayOfByte = new byte[0];
    a(arrayOfByte);
  }
  
  public k(byte[] paramArrayOfByte)
  {
    this.a = i;
    this.c = i;
    this.d = false;
    this.e = false;
    a(paramArrayOfByte);
  }
  
  public static void a(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i = 2;
      if (paramInt <= i) {}
    }
    else
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>();
      throw localIllegalArgumentException;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    d();
    this.d = paramBoolean;
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    d();
    if (paramArrayOfByte == null)
    {
      NullPointerException localNullPointerException = new java/lang/NullPointerException;
      localNullPointerException.<init>();
      throw localNullPointerException;
    }
    this.b = paramArrayOfByte;
  }
  
  public byte[] a()
  {
    return this.b;
  }
  
  public void b(int paramInt)
  {
    d();
    a(paramInt);
    this.c = paramInt;
  }
  
  protected void b(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  public boolean b()
  {
    return this.d;
  }
  
  public int c()
  {
    return this.c;
  }
  
  protected void d()
  {
    boolean bool = this.a;
    if (!bool)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>();
      throw localIllegalStateException;
    }
  }
  
  public boolean e()
  {
    return this.e;
  }
  
  public String toString()
  {
    String str = new java/lang/String;
    byte[] arrayOfByte = this.b;
    str.<init>(arrayOfByte);
    return str;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */