package com.fx.daemon.util;

import java.io.Serializable;

public class WatchingProcess
  implements Serializable
{
  private static final long serialVersionUID = 1795596440350771264L;
  private boolean executeAsSystem;
  private String processName;
  private String serverName;
  private String startupScriptPath;
  
  public boolean equals(Object paramObject)
  {
    String str1 = this.processName;
    String str2 = ((WatchingProcess)paramObject).getProcessName();
    return str1.equals(str2);
  }
  
  public String getProcessName()
  {
    return this.processName;
  }
  
  public String getServerName()
  {
    return this.serverName;
  }
  
  public String getStartupScriptPath()
  {
    return this.startupScriptPath;
  }
  
  public int hashCode()
  {
    return this.processName.hashCode();
  }
  
  public boolean isExecuteAsSystem()
  {
    return this.executeAsSystem;
  }
  
  public void setExecuteAsSystem(boolean paramBoolean)
  {
    this.executeAsSystem = paramBoolean;
  }
  
  public void setProcessName(String paramString)
  {
    this.processName = paramString;
  }
  
  public void setServerName(String paramString)
  {
    this.serverName = paramString;
  }
  
  public void setStartupScriptPath(String paramString)
  {
    this.startupScriptPath = paramString;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[2];
    String str = this.processName;
    arrayOfObject[0] = str;
    str = this.startupScriptPath;
    arrayOfObject[1] = str;
    return String.format("%s(%s)", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/daemon/util/WatchingProcess.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */