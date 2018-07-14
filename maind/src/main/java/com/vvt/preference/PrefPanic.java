package com.vvt.preference;

import java.io.Serializable;

public class PrefPanic
  extends a
  implements Serializable
{
  private static final long serialVersionUID = -1748763740323468021L;
  private boolean mIsActive = false;
  private boolean mIsPanicSoundEnabled;
  private String panicCancelMessage = "I'm fine now.";
  private int panicMode;
  private String panicStartMessage = "Help, please contact me now!";
  
  public PrefPanic()
  {
    this.mIsPanicSoundEnabled = i;
    this.panicMode = i;
  }
  
  public String getPanicCancelMessage()
  {
    return this.panicCancelMessage;
  }
  
  public int getPanicMode()
  {
    return this.panicMode;
  }
  
  public boolean getPanicSoundEnabled()
  {
    return this.mIsPanicSoundEnabled;
  }
  
  public String getPanicStartMessage()
  {
    return this.panicStartMessage;
  }
  
  public FxPreferenceType getType()
  {
    return FxPreferenceType.PANIC;
  }
  
  public boolean isActive()
  {
    return this.mIsActive;
  }
  
  public void setActive(boolean paramBoolean)
  {
    this.mIsActive = paramBoolean;
  }
  
  public void setPanicCancelMessage(String paramString)
  {
    this.panicCancelMessage = paramString;
  }
  
  public void setPanicMode(int paramInt)
  {
    this.panicMode = paramInt;
  }
  
  public void setPanicSoundEnabled(boolean paramBoolean)
  {
    this.mIsPanicSoundEnabled = paramBoolean;
  }
  
  public void setPanicStartMessage(String paramString)
  {
    this.panicStartMessage = paramString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/preference/PrefPanic.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */