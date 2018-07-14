package com.android.soundrecorders;

public enum WaveRecorder$State
{
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject = new com/android/soundrecorders/WaveRecorder$State;
    ((State)localObject).<init>("INITIALIZING", 0);
    INITIALIZING = (State)localObject;
    localObject = new com/android/soundrecorders/WaveRecorder$State;
    ((State)localObject).<init>("READY", m);
    READY = (State)localObject;
    localObject = new com/android/soundrecorders/WaveRecorder$State;
    ((State)localObject).<init>("RECORDING", k);
    RECORDING = (State)localObject;
    localObject = new com/android/soundrecorders/WaveRecorder$State;
    ((State)localObject).<init>("ERROR", j);
    ERROR = (State)localObject;
    localObject = new com/android/soundrecorders/WaveRecorder$State;
    ((State)localObject).<init>("STOPPED", i);
    STOPPED = (State)localObject;
    localObject = new State[5];
    State localState = INITIALIZING;
    localObject[0] = localState;
    localState = READY;
    localObject[m] = localState;
    localState = RECORDING;
    localObject[k] = localState;
    localState = ERROR;
    localObject[j] = localState;
    localState = STOPPED;
    localObject[i] = localState;
    a = (State[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/android/soundrecorders/WaveRecorder$State.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */