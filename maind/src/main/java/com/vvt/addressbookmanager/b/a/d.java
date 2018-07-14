package com.vvt.addressbookmanager.b.a;

import java.util.Timer;
import java.util.TimerTask;

class d
  extends TimerTask
{
  int a = 5;
  
  d(b paramb) {}
  
  public void run()
  {
    int i = this.a + -1;
    this.a = i;
    boolean bool = b.c();
    if (bool) {}
    int j = this.a;
    if (j < 0)
    {
      b.d(this.b).cancel();
      b.a(this.b, false);
      b localb = this.b;
      b.b(localb);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/addressbookmanager/removeFromPath/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */