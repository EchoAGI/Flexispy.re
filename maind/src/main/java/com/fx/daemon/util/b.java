package com.fx.daemon.util;

import android.database.ContentObserver;
import android.os.ConditionVariable;
import android.os.Handler;

class b
  extends ContentObserver
{
  b(a parama, Handler paramHandler)
  {
    super(paramHandler);
  }
  
  public void onChange(boolean paramBoolean)
  {
    a.a(this.a).open();
    this.a.a();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/daemon/util/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */