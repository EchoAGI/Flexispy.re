package com.vvt.ab;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.HashSet;
import java.util.Iterator;

class c
  extends BroadcastReceiver
{
  c(b paramb) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    boolean bool1 = b.a();
    if (bool1) {}
    Object localObject = b.a(this.a);
    if (localObject != null)
    {
      localObject = b.a(this.a);
      int i = ((HashSet)localObject).size();
      if (i > 0)
      {
        localObject = b.a(this.a);
        Iterator localIterator = ((HashSet)localObject).iterator();
        for (;;)
        {
          boolean bool2 = localIterator.hasNext();
          if (!bool2) {
            break;
          }
          localObject = (d)localIterator.next();
          ((d)localObject).a(paramContext, paramIntent);
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/ab/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */