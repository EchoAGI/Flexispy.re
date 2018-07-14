package com.vvt.pushnotification.a.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

public class a
  extends e
{
  private static final boolean a = com.vvt.pushnotification.a.a;
  private Context b;
  private d c;
  private boolean d = false;
  private final BroadcastReceiver e;
  
  public a(Context paramContext)
  {
    super(paramContext);
    b localb = new com/vvt/pushnotification/a/a/b;
    localb.<init>(this);
    this.e = localb;
    this.b = paramContext;
  }
  
  public void a(d paramd)
  {
    this.c = paramd;
  }
  
  public boolean a()
  {
    boolean bool = this.d;
    if (!bool)
    {
      Context localContext = this.b;
      BroadcastReceiver localBroadcastReceiver = this.e;
      IntentFilter localIntentFilter = new android/content/IntentFilter;
      String str = "android.net.conn.CONNECTIVITY_CHANGE";
      localIntentFilter.<init>(str);
      localContext.registerReceiver(localBroadcastReceiver, localIntentFilter);
      bool = true;
      this.d = bool;
    }
    return this.d;
  }
  
  public void b()
  {
    boolean bool = this.d;
    if (bool)
    {
      Context localContext = this.b;
      BroadcastReceiver localBroadcastReceiver = this.e;
      localContext.unregisterReceiver(localBroadcastReceiver);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/pushnotification/a/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */