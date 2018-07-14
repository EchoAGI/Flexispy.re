package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;

public class FxApplicationEvent
  extends FxEvent
{
  private String applicationId;
  private byte[] icon;
  private String name;
  private int size;
  private int state;
  private int type;
  private String version;
  
  public String getApplicationId()
  {
    return this.applicationId;
  }
  
  public FxEventType getEventType()
  {
    return FxEventType.APPLICATION;
  }
  
  public byte[] getIcon()
  {
    return this.icon;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public int getSize()
  {
    return this.size;
  }
  
  public int getState()
  {
    return this.state;
  }
  
  public int getType()
  {
    return this.type;
  }
  
  public String getVersion()
  {
    return this.version;
  }
  
  public void setApplicationId(String paramString)
  {
    this.applicationId = paramString;
  }
  
  public void setIcon(byte[] paramArrayOfByte)
  {
    this.icon = paramArrayOfByte;
  }
  
  public void setName(String paramString)
  {
    this.name = paramString;
  }
  
  public void setSize(int paramInt)
  {
    this.size = paramInt;
  }
  
  public void setState(int paramInt)
  {
    this.state = paramInt;
  }
  
  public void setType(int paramInt)
  {
    this.type = paramInt;
  }
  
  public void setVersion(String paramString)
  {
    this.version = paramString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxApplicationEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */