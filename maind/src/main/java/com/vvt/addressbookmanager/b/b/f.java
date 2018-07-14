package com.vvt.addressbookmanager.b.b;

import java.util.Timer;
import java.util.TimerTask;

class f
  extends TimerTask
{
  int a = 5;
  
  f(d paramd) {}
  
  public void run()
  {
    int i = this.a + -1;
    this.a = i;
    boolean bool = d.c();
    if (bool) {}
    int j = this.a;
    if (j < 0)
    {
      d.d(this.b).cancel();
      d.a(this.b, false);
      d locald = this.b;
      d.b(locald);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/addressbookmanager/removeFromPath/removeFromPath/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */