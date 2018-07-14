package com.vvt.phoenix.prot.event;

public enum VoipCallLogEvent$IsMonitor
{
  private int mValue;
  
  static
  {
    int i = 1;
    Object localObject = new com/vvt/phoenix/prot/event/VoipCallLogEvent$IsMonitor;
    ((IsMonitor)localObject).<init>("NO", 0, 0);
    NO = (IsMonitor)localObject;
    localObject = new com/vvt/phoenix/prot/event/VoipCallLogEvent$IsMonitor;
    ((IsMonitor)localObject).<init>("YES", i, i);
    YES = (IsMonitor)localObject;
    localObject = new IsMonitor[2];
    IsMonitor localIsMonitor = NO;
    localObject[0] = localIsMonitor;
    localIsMonitor = YES;
    localObject[i] = localIsMonitor;
    a = (IsMonitor[])localObject;
  }
  
  private VoipCallLogEvent$IsMonitor(int paramInt1)
  {
    this.mValue = paramInt1;
  }
  
  public int getValue()
  {
    return this.mValue;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/event/VoipCallLogEvent$IsMonitor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */