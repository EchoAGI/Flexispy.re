package com.fx.psysd.ref.command;

import com.fx.socket.SocketCmd;

public class RemoteSendSms
  extends SocketCmd
{
  private static final long serialVersionUID = 2104455589502586891L;
  
  public RemoteSendSms(SendSmsMetadata paramSendSmsMetadata)
  {
    super(paramSendSmsMetadata, Boolean.class);
  }
  
  protected String getServerName()
  {
    return "com.fx.socket.psysd";
  }
  
  protected String getTag()
  {
    return "RemoteSendSms";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/psysd/ref/command/RemoteSendSms.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */