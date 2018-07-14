package com.vvt.phoenix.prot.command.data;

public enum TemporalControl$Action
{
  private int mAction;
  
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new com/vvt/phoenix/prot/command/data/TemporalControl$Action;
    ((Action)localObject).<init>("UNKNOWN", 0, 0);
    UNKNOWN = (Action)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/TemporalControl$Action;
    ((Action)localObject).<init>("RECORD_AUDIO_AMBIENT", j, j);
    RECORD_AUDIO_AMBIENT = (Action)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/TemporalControl$Action;
    ((Action)localObject).<init>("RECORD_SCREENSHOT", i, i);
    RECORD_SCREENSHOT = (Action)localObject;
    localObject = new Action[3];
    Action localAction = UNKNOWN;
    localObject[0] = localAction;
    localAction = RECORD_AUDIO_AMBIENT;
    localObject[j] = localAction;
    localAction = RECORD_SCREENSHOT;
    localObject[i] = localAction;
    a = (Action[])localObject;
  }
  
  private TemporalControl$Action(int paramInt1)
  {
    this.mAction = paramInt1;
  }
  
  public static Action forValue(int paramInt)
  {
    return values()[paramInt];
  }
  
  public int getValue()
  {
    return this.mAction;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/command/data/TemporalControl$Action.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */