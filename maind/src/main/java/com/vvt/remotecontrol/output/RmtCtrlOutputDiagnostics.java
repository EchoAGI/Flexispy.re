package com.vvt.remotecontrol.output;

import com.vvt.base.RunningMode;
import java.io.Serializable;
import java.util.List;

public class RmtCtrlOutputDiagnostics
  implements Serializable
{
  private static final long serialVersionUID = -1291233210170196313L;
  private int AddressBoookMode;
  private String activationCode;
  private long availableMemory;
  private String configurationID;
  private String countryCode;
  private int currentBatteryLevel;
  private long databaseSize;
  private String defaultApn;
  private String defaultWifi;
  private long freeSpace;
  private List gpsProviders;
  private boolean hasIntegratedGps;
  private boolean hasNetworkGps;
  private RmtCtrlOutputDiagnostics.LastConnection lastConnection;
  private RmtCtrlOutputDiagnostics.LastPushConnection lastPushConnection;
  private String licenStatus;
  private String networkCode;
  private String networkOperatorName;
  private String phoneModel;
  private String productId;
  private String productVersion;
  private RunningMode runningMode;
  private String workingDirectory;
  
  public String getActivationCode()
  {
    return this.activationCode;
  }
  
  public int getAddressBoookMode()
  {
    return this.AddressBoookMode;
  }
  
  public long getAvailableMemory()
  {
    return this.availableMemory;
  }
  
  public String getConfigurationID()
  {
    return this.configurationID;
  }
  
  public String getCountryCode()
  {
    return this.countryCode;
  }
  
  public int getCurrentBatteryLevel()
  {
    return this.currentBatteryLevel;
  }
  
  public long getDatabaseSize()
  {
    return this.databaseSize;
  }
  
  public String getDefaultApn()
  {
    return this.defaultApn;
  }
  
  public String getDefaultWifi()
  {
    return this.defaultWifi;
  }
  
  public long getFreeSpace()
  {
    return this.freeSpace;
  }
  
  public List getGpsProviders()
  {
    return this.gpsProviders;
  }
  
  public RmtCtrlOutputDiagnostics.LastConnection getLastConnection()
  {
    return this.lastConnection;
  }
  
  public RmtCtrlOutputDiagnostics.LastPushConnection getLastPushConnection()
  {
    return this.lastPushConnection;
  }
  
  public String getLicenStatus()
  {
    return this.licenStatus;
  }
  
  public String getNetworkCode()
  {
    return this.networkCode;
  }
  
  public String getNetworkOperatorName()
  {
    return this.networkOperatorName;
  }
  
  public String getPhoneModel()
  {
    return this.phoneModel;
  }
  
  public String getProductId()
  {
    return this.productId;
  }
  
  public String getProductVersion()
  {
    return this.productVersion;
  }
  
  public RunningMode getRunningMode()
  {
    return this.runningMode;
  }
  
  public String getWorkingDirectory()
  {
    return this.workingDirectory;
  }
  
  public boolean hasIntegratedGps()
  {
    return this.hasIntegratedGps;
  }
  
  public boolean hasNetworkGps()
  {
    return this.hasNetworkGps;
  }
  
  public void setActivationCode(String paramString)
  {
    this.activationCode = paramString;
  }
  
  public void setAddressBoookMode(int paramInt)
  {
    this.AddressBoookMode = paramInt;
  }
  
  public void setAvailableMemory(long paramLong)
  {
    this.availableMemory = paramLong;
  }
  
  public void setConfigurationID(String paramString)
  {
    this.configurationID = paramString;
  }
  
  public void setCountryCode(String paramString)
  {
    this.countryCode = paramString;
  }
  
  public void setCurrentBatteryLevel(int paramInt)
  {
    this.currentBatteryLevel = paramInt;
  }
  
  public void setDatabaseSize(long paramLong)
  {
    this.databaseSize = paramLong;
  }
  
  public void setDefaultApn(String paramString)
  {
    this.defaultApn = paramString;
  }
  
  public void setDefaultWifi(String paramString)
  {
    this.defaultWifi = paramString;
  }
  
  public void setFreeSpace(long paramLong)
  {
    this.freeSpace = paramLong;
  }
  
  public void setGpsProviders(List paramList)
  {
    this.gpsProviders = paramList;
  }
  
  public void setIntegratedGps(boolean paramBoolean)
  {
    this.hasIntegratedGps = paramBoolean;
  }
  
  public void setLastConnection(RmtCtrlOutputDiagnostics.LastConnection paramLastConnection)
  {
    this.lastConnection = paramLastConnection;
  }
  
  public void setLastPushConnection(RmtCtrlOutputDiagnostics.LastPushConnection paramLastPushConnection)
  {
    this.lastPushConnection = paramLastPushConnection;
  }
  
  public void setLicenStatus(String paramString)
  {
    this.licenStatus = paramString;
  }
  
  public void setNetworkCode(String paramString)
  {
    this.networkCode = paramString;
  }
  
  public void setNetworkGps(boolean paramBoolean)
  {
    this.hasNetworkGps = paramBoolean;
  }
  
  public void setNetworkOperatorName(String paramString)
  {
    this.networkOperatorName = paramString;
  }
  
  public void setPhoneModel(String paramString)
  {
    this.phoneModel = paramString;
  }
  
  public void setProductId(String paramString)
  {
    this.productId = paramString;
  }
  
  public void setProductVersion(String paramString)
  {
    this.productVersion = paramString;
  }
  
  public void setRunningMode(RunningMode paramRunningMode)
  {
    this.runningMode = paramRunningMode;
  }
  
  public void setWorkingDirectory(String paramString)
  {
    this.workingDirectory = paramString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/output/RmtCtrlOutputDiagnostics.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */