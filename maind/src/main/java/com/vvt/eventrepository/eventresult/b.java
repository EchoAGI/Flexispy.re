package com.vvt.eventrepository.eventresult;

import com.vvt.base.FxEventType;
import com.vvt.events.FxEventDirection;
import java.util.HashMap;

public class b
{
  private HashMap a;
  
  public b()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.a = localHashMap;
  }
  
  public int a(FxEventType paramFxEventType)
  {
    a locala = (a)this.a.get(paramFxEventType);
    int i;
    if (locala != null) {
      i = locala.e();
    }
    for (;;)
    {
      return i;
      i = 0;
      locala = null;
    }
  }
  
  public int a(FxEventType paramFxEventType, FxEventDirection paramFxEventDirection)
  {
    a locala = (a)this.a.get(paramFxEventType);
    int k;
    if (locala != null)
    {
      int[] arrayOfInt = c.a;
      int i = paramFxEventDirection.ordinal();
      int j = arrayOfInt[i];
      switch (j)
      {
      default: 
        k = 0;
        locala = null;
      }
    }
    for (;;)
    {
      return k;
      k = locala.a();
      continue;
      k = locala.b();
      continue;
      k = locala.c();
      continue;
      k = locala.f();
      continue;
      k = locala.d();
      continue;
      k = 0;
      locala = null;
    }
  }
  
  public void a(FxEventType paramFxEventType, a parama)
  {
    Object localObject = (a)this.a.get(paramFxEventType);
    if (localObject == null)
    {
      localObject = this.a;
      ((HashMap)localObject).put(paramFxEventType, parama);
    }
    for (;;)
    {
      return;
      int i = parama.a();
      ((a)localObject).a(i);
      i = parama.b();
      ((a)localObject).b(i);
      i = parama.c();
      ((a)localObject).c(i);
      i = parama.d();
      ((a)localObject).d(i);
      i = parama.f();
      ((a)localObject).f(i);
      i = parama.e();
      ((a)localObject).e(i);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/eventresult/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */