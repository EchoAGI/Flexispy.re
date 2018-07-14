package com.vvt.appengine.a;

import android.os.ConditionVariable;
import com.remote.camera.normal.b;
import java.util.List;

class w
  implements b
{
  w(v paramv) {}
  
  public void a(String paramString)
  {
    boolean bool = v.a();
    if (bool) {}
    v.a(this.a, false);
    v.a(this.a).open();
  }
  
  public void a(String paramString1, String paramString2, int paramInt)
  {
    int i = v.b();
    if (i != 0) {}
    Object localObject = v.a(this.a, paramString1, paramString2, paramInt);
    List localList = v.b(this.a);
    localList.add(localObject);
    i = 1;
    if (paramInt == i)
    {
      localObject = v.a(this.a);
      ((ConditionVariable)localObject).open();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/w.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */