package com.vvt.remotecontrol.output;

import java.io.Serializable;

public class RmtCtrlActivateOutputStatusMessage
  implements Serializable
{
  private static final long serialVersionUID = 7291988712356952689L;
  private boolean isSuccess;
  private int mErrorCode;
  private String message;
  private int recordingAudioSourceStatusCode;
  
  public int getErrorCode()
  {
    return this.mErrorCode;
  }
  
  public String getMessage()
  {
    return this.message;
  }
  
  public int getRecordingAudioSourceStatusCode()
  {
    return this.recordingAudioSourceStatusCode;
  }
  
  public boolean isSuccess()
  {
    return this.isSuccess;
  }
  
  public void setErrorCode(int paramInt)
  {
    this.mErrorCode = paramInt;
  }
  
  public void setMessage(String paramString)
  {
    this.message = paramString;
  }
  
  public void setRecordingAudioSourceStatusCode(int paramInt)
  {
    this.recordingAudioSourceStatusCode = paramInt;
  }
  
  public void setSuccess(boolean paramBoolean)
  {
    this.isSuccess = paramBoolean;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/output/RmtCtrlActivateOutputStatusMessage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */