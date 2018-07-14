package com.vvt.datadeliverymanager.b;

import android.content.Context;
import com.vvt.datadeliverymanager.b.a.e;
import com.vvt.datadeliverymanager.enums.DataProviderType;
import com.vvt.datadeliverymanager.enums.PriorityRequest;
import com.vvt.datadeliverymanager.h;
import java.util.Iterator;
import java.util.List;

public class a
{
  private static final boolean a = com.vvt.datadeliverymanager.a.e;
  private com.vvt.datadeliverymanager.b.a.b b;
  private String c;
  
  public a(Context paramContext, String paramString)
  {
    this.c = paramString;
    e locale = new com/vvt/datadeliverymanager/b/a/e;
    locale.<init>(paramContext, paramString);
    this.b = locale;
    this.b.a();
  }
  
  public String a()
  {
    return this.c;
  }
  
  public boolean a(int paramInt)
  {
    Object localObject = this.b.c();
    Iterator localIterator = ((List)localObject).iterator();
    do
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (h)localIterator.next();
      i = ((h)localObject).a();
    } while (i != paramInt);
    int i = 1;
    for (;;)
    {
      return i;
      i = 0;
      localObject = null;
    }
  }
  
  public boolean a(int paramInt, PriorityRequest paramPriorityRequest, DataProviderType paramDataProviderType)
  {
    Object localObject1 = this.b.c();
    Iterator localIterator = ((List)localObject1).iterator();
    int k;
    do
    {
      Object localObject2;
      do
      {
        do
        {
          boolean bool = localIterator.hasNext();
          if (!bool) {
            break;
          }
          localObject1 = (h)localIterator.next();
          localObject2 = ((h)localObject1).c();
          k = ((com.vvt.phoenix.prot.command.b)localObject2).a();
        } while (k != paramInt);
        localObject2 = ((h)localObject1).e();
      } while (localObject2 != paramPriorityRequest);
      localObject1 = ((h)localObject1).j();
      i = ((DataProviderType)localObject1).getNumber();
      k = paramDataProviderType.getNumber();
    } while (i != k);
    int i = 1;
    for (;;)
    {
      return i;
      int j = 0;
      localObject1 = null;
    }
  }
  
  public boolean a(long paramLong)
  {
    return this.b.a(paramLong);
  }
  
  public boolean a(h paramh)
  {
    return this.b.b(paramh);
  }
  
  public void b()
  {
    Object localObject = a();
    boolean bool;
    if (localObject == null)
    {
      bool = a;
      if (bool) {}
      return;
    }
    localObject = this.b.c();
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (h)localIterator.next();
      int i = ((h)localObject).i();
      com.vvt.datadeliverymanager.b.a.b localb;
      if (i <= 0)
      {
        localb = this.b;
        long l = ((h)localObject).g();
        localb.a(l);
      }
      else
      {
        i = 1;
        ((h)localObject).a(i);
        localb = this.b;
        localb.b((h)localObject);
      }
    }
  }
  
  public void b(h paramh)
  {
    this.b.a(paramh);
  }
  
  public boolean b(int paramInt, PriorityRequest paramPriorityRequest, DataProviderType paramDataProviderType)
  {
    boolean bool1 = false;
    com.vvt.datadeliverymanager.b.a.b localb = null;
    Object localObject1 = this.b.c();
    Iterator localIterator = ((List)localObject1).iterator();
    int i;
    int j;
    do
    {
      do
      {
        do
        {
          bool2 = localIterator.hasNext();
          if (!bool2) {
            break;
          }
          localObject1 = (h)localIterator.next();
          localObject2 = ((h)localObject1).c();
          i = ((com.vvt.phoenix.prot.command.b)localObject2).a();
        } while (i != paramInt);
        localObject2 = ((h)localObject1).e();
      } while (localObject2 != paramPriorityRequest);
      Object localObject2 = ((h)localObject1).j();
      i = ((DataProviderType)localObject2).getNumber();
      j = paramDataProviderType.getNumber();
    } while (i != j);
    bool1 = true;
    ((h)localObject1).a(bool1);
    localb = this.b;
    boolean bool2 = localb.b((h)localObject1);
    for (;;)
    {
      return bool2;
      bool2 = false;
      localObject1 = null;
    }
  }
  
  public boolean b(long paramLong)
  {
    boolean bool1 = false;
    com.vvt.datadeliverymanager.b.a.b localb = null;
    Object localObject = this.b.c();
    Iterator localIterator = ((List)localObject).iterator();
    boolean bool3;
    do
    {
      bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (h)localIterator.next();
      long l = ((h)localObject).g();
      bool3 = l < paramLong;
    } while (bool3);
    bool1 = true;
    ((h)localObject).a(bool1);
    localb = this.b;
    boolean bool2 = localb.b((h)localObject);
    for (;;)
    {
      return bool2;
      bool2 = false;
      localObject = null;
    }
  }
  
  public h c()
  {
    Object localObject = this.b.c();
    Iterator localIterator = ((List)localObject).iterator();
    boolean bool1;
    boolean bool2;
    do
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (h)localIterator.next();
      bool2 = ((h)localObject).b();
    } while (!bool2);
    for (;;)
    {
      return (h)localObject;
      bool1 = false;
      localObject = null;
    }
  }
  
  protected void finalize()
  {
    this.b.b();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/datadeliverymanager/removeFromPath/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */