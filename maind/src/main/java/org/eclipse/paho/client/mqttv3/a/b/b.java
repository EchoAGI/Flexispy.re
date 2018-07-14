package org.eclipse.paho.client.mqttv3.a.b;

public abstract class b
  extends u
{
  public b(byte paramByte)
  {
    super(paramByte);
  }
  
  protected byte d_()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = super.toString();
    localStringBuilder = localStringBuilder.append(str).append(" msgId ");
    int i = this.a;
    return i;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */