package com.vvt.async;

import android.os.Handler;
import android.os.Message;
import java.util.HashMap;

public abstract class a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.e;
  private HashMap d;
  
  public a()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.d = localHashMap;
  }
  
  protected final void a()
  {
    boolean bool = a;
    if (bool) {}
    synchronized (this.d)
    {
      HashMap localHashMap2 = this.d;
      localHashMap2.clear();
      bool = a;
      if (bool) {}
      return;
    }
  }
  
  protected final void a(Object paramObject)
  {
    boolean bool = a;
    Object localObject1;
    if ((!bool) || (paramObject == null))
    {
      bool = b;
      if (bool) {}
      localObject1 = new com/vvt/async/NullListenerException;
      ((NullListenerException)localObject1).<init>("NULL listener is not allowed");
      throw ((Throwable)localObject1);
    }
    synchronized (this.d)
    {
      localObject1 = this.d;
      ((HashMap)localObject1).remove(paramObject);
      bool = a;
      if (bool) {}
      localObject1 = new com/vvt/async/b;
      ((b)localObject1).<init>(this);
      HashMap localHashMap2 = this.d;
      localHashMap2.put(paramObject, localObject1);
      bool = a;
      if (bool) {}
      return;
    }
  }
  
  protected final void a(Object paramObject, int paramInt, Object... paramVarArgs)
  {
    boolean bool = a;
    if (bool) {}
    c localc = new com/vvt/async/c;
    bool = false;
    localc.<init>(this, null);
    localc.a = paramInt;
    localc.b = paramObject;
    localc.c = paramVarArgs;
    Object localObject = (Handler)this.d.get(paramObject);
    if (localObject == null)
    {
      bool = c;
      if (bool) {}
      localObject = new com/vvt/async/CallbackNotFoundException;
      ((CallbackNotFoundException)localObject).<init>("Handler of this listener is missing");
      throw ((Throwable)localObject);
    }
    localObject = ((Handler)localObject).obtainMessage();
    ((Message)localObject).obj = localc;
    ((Message)localObject).sendToTarget();
  }
  
  protected final void b(Object paramObject)
  {
    boolean bool = a;
    if (bool) {}
    synchronized (this.d)
    {
      HashMap localHashMap2 = this.d;
      localHashMap2.remove(paramObject);
      bool = a;
      if (bool) {}
      return;
    }
  }
  
  protected abstract void b(Object paramObject, int paramInt, Object... paramVarArgs);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/async/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */