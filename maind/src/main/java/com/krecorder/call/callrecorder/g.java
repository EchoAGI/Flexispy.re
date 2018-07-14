package com.krecorder.call.callrecorder;

import android.os.Build;

class g
  implements n
{
  g(f paramf) {}
  
  public void a()
  {
    h localh = f.d(this.a);
    if (localh != null)
    {
      localh = f.d(this.a);
      localh.b();
    }
  }
  
  public void a(j paramj)
  {
    f.a(this.a, false);
    h localh = f.d(this.a);
    if (localh != null)
    {
      localh = f.d(this.a);
      localh.a();
    }
  }
  
  public void a(String paramString)
  {
    Object localObject1 = f.g(this.a);
    if (localObject1 != null)
    {
      localObject1 = f.g(this.a).f();
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("'").append(paramString);
      String str = "' [ ";
      localObject2 = ((StringBuilder)localObject2).append(str);
      int i = ((j)localObject1).a();
      localObject1 = j.c(i);
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1).append(" ] [");
      localObject2 = Build.DEVICE.toLowerCase();
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(" - ");
      localObject2 = Build.MODEL.toLowerCase();
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(" - ");
      localObject2 = Build.MANUFACTURER.toLowerCase();
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = "]";
      paramString = (String)localObject2;
      localObject1 = f.g(this.a);
      ((m)localObject1).e();
    }
    f.h(this.a);
    localObject1 = this.a;
    Object localObject2 = null;
    f.a((f)localObject1, false);
    localObject1 = f.d(this.a);
    if (localObject1 != null)
    {
      localObject1 = f.d(this.a);
      ((h)localObject1).a(paramString);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/krecorder/call/callrecorder/FxFileObserverWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */