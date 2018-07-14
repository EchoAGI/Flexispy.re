package com.vvt.appengine.a;

import android.os.ConditionVariable;
import com.vvt.base.a;
import com.vvt.events.FxLocationEvent;
import java.util.ArrayList;
import java.util.List;

class m
  implements a
{
  m(l paraml) {}
  
  public void a(List paramList)
  {
    double d1 = 0.0D;
    boolean bool1 = true;
    int i = 0;
    boolean bool2 = l.b();
    Object localObject1;
    boolean bool3;
    if ((!bool2) || (paramList != null))
    {
      bool2 = paramList.isEmpty();
      if (!bool2) {}
    }
    else
    {
      bool2 = bool1;
      if (bool2) {
        break label399;
      }
      localObject1 = (FxLocationEvent)paramList.get(0);
      bool3 = l.c();
      if (!bool3) {}
    }
    for (Object localObject2 = localObject1;; localObject2 = null)
    {
      if (localObject2 == null)
      {
        localObject1 = this.a;
        l.a((l)localObject1, null);
        bool2 = l.b();
        if (!bool2) {}
      }
      for (;;)
      {
        localObject1 = l.a(this.a);
        if ((localObject1 != null) && (i != 0))
        {
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
          if (localObject2 != null) {
            ((List)localObject1).add(localObject2);
          }
          a locala = l.a(this.a);
          locala.a((List)localObject1);
        }
        localObject1 = l.b(this.a);
        ((ConditionVariable)localObject1).open();
        bool2 = l.b();
        if (bool2) {}
        return;
        bool2 = false;
        localObject1 = null;
        break;
        double d2 = ((FxLocationEvent)localObject2).getLatitude();
        bool2 = d2 < d1;
        if (!bool2)
        {
          d2 = ((FxLocationEvent)localObject2).getLongitude();
          bool2 = d2 < d1;
          if (!bool2) {
            bool2 = bool1;
          }
        }
        for (;;)
        {
          boolean bool4 = l.b();
          if ((bool4) && (!bool2)) {
            break label371;
          }
          localObject1 = this.a;
          l.a((l)localObject1, null);
          long l1 = ((FxLocationEvent)localObject2).getCellId();
          long l2 = -1;
          bool2 = l1 < l2;
          if (bool2) {
            break label310;
          }
          bool2 = l.b();
          if (!bool2) {
            break;
          }
          break;
          bool2 = false;
          localObject1 = null;
        }
        label310:
        bool2 = l.b();
        if (bool2) {}
        localObject1 = this.a;
        bool2 = l.b((l)localObject1, (FxLocationEvent)localObject2);
        if (bool2)
        {
          bool2 = l.b();
          if (bool2) {}
          localObject1 = this.a;
          l.a((l)localObject1, (FxLocationEvent)localObject2);
          i = bool1;
          continue;
          label371:
          localObject1 = this.a;
          l.a((l)localObject1, (FxLocationEvent)localObject2);
          i = bool1;
        }
        else
        {
          i = bool1;
        }
      }
      label399:
      bool3 = false;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */