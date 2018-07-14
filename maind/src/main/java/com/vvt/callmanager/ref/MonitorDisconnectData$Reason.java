package com.vvt.callmanager.ref;

public enum MonitorDisconnectData$Reason
{
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject = new com/vvt/callmanager/ref/MonitorDisconnectData$Reason;
    ((Reason)localObject).<init>("UNKNOWN", 0);
    UNKNOWN = (Reason)localObject;
    localObject = new com/vvt/callmanager/ref/MonitorDisconnectData$Reason;
    ((Reason)localObject).<init>("DIALING", m);
    DIALING = (Reason)localObject;
    localObject = new com/vvt/callmanager/ref/MonitorDisconnectData$Reason;
    ((Reason)localObject).<init>("CALL_WAITING", k);
    CALL_WAITING = (Reason)localObject;
    localObject = new com/vvt/callmanager/ref/MonitorDisconnectData$Reason;
    ((Reason)localObject).<init>("HANGUP", j);
    HANGUP = (Reason)localObject;
    localObject = new com/vvt/callmanager/ref/MonitorDisconnectData$Reason;
    ((Reason)localObject).<init>("SWITCH_CALL", i);
    SWITCH_CALL = (Reason)localObject;
    localObject = new com/vvt/callmanager/ref/MonitorDisconnectData$Reason;
    ((Reason)localObject).<init>("PARTY_LEFT", 5);
    PARTY_LEFT = (Reason)localObject;
    localObject = new com/vvt/callmanager/ref/MonitorDisconnectData$Reason;
    ((Reason)localObject).<init>("BAD_STATE", 6);
    BAD_STATE = (Reason)localObject;
    localObject = new com/vvt/callmanager/ref/MonitorDisconnectData$Reason;
    ((Reason)localObject).<init>("MUSIC_PLAY", 7);
    MUSIC_PLAY = (Reason)localObject;
    localObject = new com/vvt/callmanager/ref/MonitorDisconnectData$Reason;
    ((Reason)localObject).<init>("DOUBLE_SPY", 8);
    DOUBLE_SPY = (Reason)localObject;
    localObject = new Reason[9];
    Reason localReason1 = UNKNOWN;
    localObject[0] = localReason1;
    localReason1 = DIALING;
    localObject[m] = localReason1;
    localReason1 = CALL_WAITING;
    localObject[k] = localReason1;
    localReason1 = HANGUP;
    localObject[j] = localReason1;
    localReason1 = SWITCH_CALL;
    localObject[i] = localReason1;
    Reason localReason2 = PARTY_LEFT;
    localObject[5] = localReason2;
    localReason2 = BAD_STATE;
    localObject[6] = localReason2;
    localReason2 = MUSIC_PLAY;
    localObject[7] = localReason2;
    localReason2 = DOUBLE_SPY;
    localObject[8] = localReason2;
    a = (Reason[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/callmanager/ref/MonitorDisconnectData$Reason.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */