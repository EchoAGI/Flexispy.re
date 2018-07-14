package com.vvt.remotecontrol.output;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class RmtCtrlOutputConfiguration
  implements Serializable
{
  private static final long serialVersionUID = 5345662157041106864L;
  private int configurationID = -1;
  private List supportedFeatures;
  private Map supportedRemoteCmds;
  
  public int getConfigurationID()
  {
    return this.configurationID;
  }
  
  public List getSupportedFeatures()
  {
    return this.supportedFeatures;
  }
  
  public Map getSupportedRemoteCmds()
  {
    return this.supportedRemoteCmds;
  }
  
  public void setConfigurationID(int paramInt)
  {
    this.configurationID = paramInt;
  }
  
  public void setSupportedFeatures(List paramList)
  {
    this.supportedFeatures = paramList;
  }
  
  public void setSupportedRemoteCmds(Map paramMap)
  {
    this.supportedRemoteCmds = paramMap;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/output/RmtCtrlOutputConfiguration.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */