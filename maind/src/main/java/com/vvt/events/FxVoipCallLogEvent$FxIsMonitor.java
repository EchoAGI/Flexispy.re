package com.vvt.events;

public enum FxVoipCallLogEvent$FxIsMonitor
{
  private int mValue;
  
  static
  {
    int i = 1;
    Object localObject = new com/vvt/events/FxVoipCallLogEvent$FxIsMonitor;
    ((FxIsMonitor)localObject).<init>("NO", 0, 0);
    NO = (FxIsMonitor)localObject;
    localObject = new com/vvt/events/FxVoipCallLogEvent$FxIsMonitor;
    ((FxIsMonitor)localObject).<init>("YES", i, i);
    YES = (FxIsMonitor)localObject;
    localObject = new FxIsMonitor[2];
    FxIsMonitor localFxIsMonitor = NO;
    localObject[0] = localFxIsMonitor;
    localFxIsMonitor = YES;
    localObject[i] = localFxIsMonitor;
    a = (FxIsMonitor[])localObject;
  }
  
  private FxVoipCallLogEvent$FxIsMonitor(int paramInt1)
  {
    this.mValue = paramInt1;
  }
  
  public static FxIsMonitor forValue(int paramInt)
  {
    return values()[paramInt];
  }
  
  public int getValue()
  {
    return this.mValue;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxVoipCallLogEvent$FxIsMonitor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */