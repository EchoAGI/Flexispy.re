package com.vvt.v;

import android.content.ContentResolver;
import com.vvt.base.RunningMode;
import java.util.List;

public class c
{
  private static final boolean a;
  private ContentResolver b;
  private com.vvt.base.a c;
  private d d;
  private String e;
  private RunningMode f;
  
  static
  {
    boolean bool = com.vvt.ak.a.a;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      return;
    }
  }
  
  public c(String paramString, ContentResolver paramContentResolver, com.vvt.base.a parama, RunningMode paramRunningMode)
  {
    this.b = paramContentResolver;
    this.e = paramString;
    this.f = paramRunningMode;
    this.c = parama;
  }
  
  private void a()
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = new com/vvt/v/a;
    Object localObject2 = this.f;
    ((a)localObject1).<init>((RunningMode)localObject2);
    localObject2 = this.b;
    localObject1 = ((a)localObject1).a((ContentResolver)localObject2);
    boolean bool2 = a;
    if (bool2) {}
    localObject2 = this.c;
    ((com.vvt.base.a)localObject2).a((List)localObject1);
    bool1 = a;
    if (bool1) {}
  }
  
  private void b()
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = new com/vvt/v/b;
    Object localObject2 = this.e;
    RunningMode localRunningMode = this.f;
    ((b)localObject1).<init>((String)localObject2, localRunningMode);
    localObject2 = this.b;
    localObject1 = ((b)localObject1).a((ContentResolver)localObject2);
    boolean bool2 = a;
    if (bool2) {}
    localObject2 = this.c;
    ((com.vvt.base.a)localObject2).a((List)localObject1);
    bool1 = a;
    if (bool1) {}
  }
  
  private void c()
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = new com/vvt/v/e;
    Object localObject2 = this.e;
    RunningMode localRunningMode = this.f;
    ((e)localObject1).<init>((String)localObject2, localRunningMode);
    localObject2 = this.b;
    localObject1 = ((e)localObject1).a((ContentResolver)localObject2);
    boolean bool2 = a;
    if (bool2) {}
    localObject2 = this.c;
    ((com.vvt.base.a)localObject2).a((List)localObject1);
    bool1 = a;
    if (bool1) {}
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    boolean bool = a;
    if ((!bool) || (paramBoolean1)) {
      b();
    }
    if (paramBoolean2) {
      a();
    }
    if (paramBoolean3) {
      c();
    }
    d locald = this.d;
    if (locald != null)
    {
      locald = this.d;
      locald.a();
    }
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/v/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */