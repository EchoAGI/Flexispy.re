package com.vvt.remotecontrol.output;

import java.io.Serializable;

public class RmtCtrlOutputStatusMessage
  implements Serializable
{
  private static final long serialVersionUID = 6704006669196536832L;
  private boolean isSuccess;
  private String message;
  
  public String getMessage()
  {
    return this.message;
  }
  
  public boolean isSuccess()
  {
    return this.isSuccess;
  }
  
  public void setMessage(String paramString)
  {
    this.message = paramString;
  }
  
  public void setSuccess(boolean paramBoolean)
  {
    this.isSuccess = paramBoolean;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */