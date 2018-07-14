package com.vvt.base;

import java.util.HashMap;
import java.util.Map;

public enum DeviceSettingId
{
  private static final Map a;
  private String mUniqueId;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    int n = 0;
    Object localObject1 = new com/vvt/base/DeviceSettingId;
    ((DeviceSettingId)localObject1).<init>("GENERAL_PASSCODELOCK_ISPASSCODEON", 0, "General.PasscodeLock.IsPasscodeOn");
    GENERAL_PASSCODELOCK_ISPASSCODEON = (DeviceSettingId)localObject1;
    localObject1 = new com/vvt/base/DeviceSettingId;
    ((DeviceSettingId)localObject1).<init>("GENERAL_PASSCODELOCK_PASSCODE", m, "General.PasscodeLock.Passcode");
    GENERAL_PASSCODELOCK_PASSCODE = (DeviceSettingId)localObject1;
    localObject1 = new com/vvt/base/DeviceSettingId;
    ((DeviceSettingId)localObject1).<init>("GENERAL_PASSCODELOCK_PATTERNCODE", k, "General.PasscodeLock.PatternCode");
    GENERAL_PASSCODELOCK_PATTERNCODE = (DeviceSettingId)localObject1;
    localObject1 = new com/vvt/base/DeviceSettingId;
    ((DeviceSettingId)localObject1).<init>("GENERAL_DATETIME_IS24HRSFORMAT", j, "General.DateTime.Is24hrsFormat");
    GENERAL_DATETIME_IS24HRSFORMAT = (DeviceSettingId)localObject1;
    localObject1 = new com/vvt/base/DeviceSettingId;
    ((DeviceSettingId)localObject1).<init>("GENERAL_USAGE_TOTALSTORAGE", i, "General.Usage.TotalStorage");
    GENERAL_USAGE_TOTALSTORAGE = (DeviceSettingId)localObject1;
    localObject1 = new com/vvt/base/DeviceSettingId;
    ((DeviceSettingId)localObject1).<init>("GENERAL_USAGE_AVAILABLE", 5, "General.Usage.Available");
    GENERAL_USAGE_AVAILABLE = (DeviceSettingId)localObject1;
    localObject1 = new com/vvt/base/DeviceSettingId;
    ((DeviceSettingId)localObject1).<init>("GENERAL_USAGE_BATTERY", 6, "General.Usage.Battery");
    GENERAL_USAGE_BATTERY = (DeviceSettingId)localObject1;
    localObject1 = new com/vvt/base/DeviceSettingId;
    ((DeviceSettingId)localObject1).<init>("GENERAL_ABOUT_NAME", 7, "General.About.Name");
    GENERAL_ABOUT_NAME = (DeviceSettingId)localObject1;
    localObject1 = new com/vvt/base/DeviceSettingId;
    ((DeviceSettingId)localObject1).<init>("GENERAL_ABOUT_NETWORK", 8, "General.About.Network");
    GENERAL_ABOUT_NETWORK = (DeviceSettingId)localObject1;
    localObject1 = new com/vvt/base/DeviceSettingId;
    ((DeviceSettingId)localObject1).<init>("GENERAL_ABOUT_CAPACITY", 9, "General.About.Capacity");
    GENERAL_ABOUT_CAPACITY = (DeviceSettingId)localObject1;
    localObject1 = new com/vvt/base/DeviceSettingId;
    ((DeviceSettingId)localObject1).<init>("GENERAL_ABOUT_AVAILABLE", 10, "General.About.Available");
    GENERAL_ABOUT_AVAILABLE = (DeviceSettingId)localObject1;
    localObject1 = new com/vvt/base/DeviceSettingId;
    ((DeviceSettingId)localObject1).<init>("GENERAL_ABOUT_OSVERSION", 11, "General.About.OsVersion");
    GENERAL_ABOUT_OSVERSION = (DeviceSettingId)localObject1;
    localObject1 = new com/vvt/base/DeviceSettingId;
    ((DeviceSettingId)localObject1).<init>("GENERAL_ABOUT_CARRIER", 12, "General.About.Carrier");
    GENERAL_ABOUT_CARRIER = (DeviceSettingId)localObject1;
    localObject1 = new com/vvt/base/DeviceSettingId;
    ((DeviceSettingId)localObject1).<init>("GENERAL_ABOUT_MODEL", 13, "General.About.Model");
    GENERAL_ABOUT_MODEL = (DeviceSettingId)localObject1;
    localObject1 = new com/vvt/base/DeviceSettingId;
    ((DeviceSettingId)localObject1).<init>("GENERAL_ABOUT_SERIALNUMBER", 14, "General.About.SerialNumber");
    GENERAL_ABOUT_SERIALNUMBER = (DeviceSettingId)localObject1;
    localObject1 = new com/vvt/base/DeviceSettingId;
    ((DeviceSettingId)localObject1).<init>("GENERAL_ABOUT_WIFIADDRESS", 15, "General.About.WiFiAddress");
    GENERAL_ABOUT_WIFIADDRESS = (DeviceSettingId)localObject1;
    localObject1 = new com/vvt/base/DeviceSettingId;
    ((DeviceSettingId)localObject1).<init>("GENERAL_ABOUT_BLUETOOTH", 16, "General.About.Bluetooth");
    GENERAL_ABOUT_BLUETOOTH = (DeviceSettingId)localObject1;
    localObject1 = new com/vvt/base/DeviceSettingId;
    ((DeviceSettingId)localObject1).<init>("GENERAL_ABOUT_IMEI", 17, "General.About.IMEI");
    GENERAL_ABOUT_IMEI = (DeviceSettingId)localObject1;
    localObject1 = new com/vvt/base/DeviceSettingId;
    ((DeviceSettingId)localObject1).<init>("GENERAL_ABOUT_MACADDRESS", 18, "General.About.MACAddress");
    GENERAL_ABOUT_MACADDRESS = (DeviceSettingId)localObject1;
    localObject1 = new com/vvt/base/DeviceSettingId;
    ((DeviceSettingId)localObject1).<init>("GENERAL_ABOUT_PROCESSOR", 19, "General.About.Processor");
    GENERAL_ABOUT_PROCESSOR = (DeviceSettingId)localObject1;
    localObject1 = new com/vvt/base/DeviceSettingId;
    ((DeviceSettingId)localObject1).<init>("GENERAL_ABOUT_RAM", 20, "General.About.RAM");
    GENERAL_ABOUT_RAM = (DeviceSettingId)localObject1;
    localObject1 = new com/vvt/base/DeviceSettingId;
    ((DeviceSettingId)localObject1).<init>("GENERAL_ABOUT_SYSTEMTYPE", 21, "General.About.SystemType");
    GENERAL_ABOUT_SYSTEMTYPE = (DeviceSettingId)localObject1;
    localObject1 = new com/vvt/base/DeviceSettingId;
    ((DeviceSettingId)localObject1).<init>("GENERAL_ABOUT_COMPUTERDOMAIN", 22, "General.About.ComputerDomain");
    GENERAL_ABOUT_COMPUTERDOMAIN = (DeviceSettingId)localObject1;
    localObject1 = new com/vvt/base/DeviceSettingId;
    ((DeviceSettingId)localObject1).<init>("GENERAL_ABOUT_SELINUX_MODE", 23, "General.About.SELinux");
    GENERAL_ABOUT_SELINUX_MODE = (DeviceSettingId)localObject1;
    localObject1 = new com/vvt/base/DeviceSettingId;
    int i1 = 24;
    Object localObject2 = "Privacy.LocationService.IsLocationServiceOn";
    ((DeviceSettingId)localObject1).<init>("PRIVACY_LOCATIONSERVICE_ISLOCATIONSERVICEON", i1, (String)localObject2);
    PRIVACY_LOCATIONSERVICE_ISLOCATIONSERVICEON = (DeviceSettingId)localObject1;
    int i2 = 25;
    localObject1 = new DeviceSettingId[i2];
    DeviceSettingId localDeviceSettingId1 = GENERAL_PASSCODELOCK_ISPASSCODEON;
    localObject1[0] = localDeviceSettingId1;
    localDeviceSettingId1 = GENERAL_PASSCODELOCK_PASSCODE;
    localObject1[m] = localDeviceSettingId1;
    localDeviceSettingId1 = GENERAL_PASSCODELOCK_PATTERNCODE;
    localObject1[k] = localDeviceSettingId1;
    localDeviceSettingId1 = GENERAL_DATETIME_IS24HRSFORMAT;
    localObject1[j] = localDeviceSettingId1;
    localDeviceSettingId1 = GENERAL_USAGE_TOTALSTORAGE;
    localObject1[i] = localDeviceSettingId1;
    DeviceSettingId localDeviceSettingId2 = GENERAL_USAGE_AVAILABLE;
    localObject1[5] = localDeviceSettingId2;
    localDeviceSettingId2 = GENERAL_USAGE_BATTERY;
    localObject1[6] = localDeviceSettingId2;
    localDeviceSettingId2 = GENERAL_ABOUT_NAME;
    localObject1[7] = localDeviceSettingId2;
    localDeviceSettingId2 = GENERAL_ABOUT_NETWORK;
    localObject1[8] = localDeviceSettingId2;
    localDeviceSettingId2 = GENERAL_ABOUT_CAPACITY;
    localObject1[9] = localDeviceSettingId2;
    localDeviceSettingId2 = GENERAL_ABOUT_AVAILABLE;
    localObject1[10] = localDeviceSettingId2;
    localDeviceSettingId2 = GENERAL_ABOUT_OSVERSION;
    localObject1[11] = localDeviceSettingId2;
    localDeviceSettingId2 = GENERAL_ABOUT_CARRIER;
    localObject1[12] = localDeviceSettingId2;
    localDeviceSettingId2 = GENERAL_ABOUT_MODEL;
    localObject1[13] = localDeviceSettingId2;
    localDeviceSettingId2 = GENERAL_ABOUT_SERIALNUMBER;
    localObject1[14] = localDeviceSettingId2;
    localDeviceSettingId2 = GENERAL_ABOUT_WIFIADDRESS;
    localObject1[15] = localDeviceSettingId2;
    localDeviceSettingId2 = GENERAL_ABOUT_BLUETOOTH;
    localObject1[16] = localDeviceSettingId2;
    localDeviceSettingId2 = GENERAL_ABOUT_IMEI;
    localObject1[17] = localDeviceSettingId2;
    localDeviceSettingId2 = GENERAL_ABOUT_MACADDRESS;
    localObject1[18] = localDeviceSettingId2;
    localDeviceSettingId2 = GENERAL_ABOUT_PROCESSOR;
    localObject1[19] = localDeviceSettingId2;
    localDeviceSettingId2 = GENERAL_ABOUT_RAM;
    localObject1[20] = localDeviceSettingId2;
    localDeviceSettingId2 = GENERAL_ABOUT_SYSTEMTYPE;
    localObject1[21] = localDeviceSettingId2;
    localDeviceSettingId2 = GENERAL_ABOUT_COMPUTERDOMAIN;
    localObject1[22] = localDeviceSettingId2;
    localDeviceSettingId2 = GENERAL_ABOUT_SELINUX_MODE;
    localObject1[23] = localDeviceSettingId2;
    localDeviceSettingId2 = PRIVACY_LOCATIONSERVICE_ISLOCATIONSERVICEON;
    localObject1[24] = localDeviceSettingId2;
    b = (DeviceSettingId[])localObject1;
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    a = (Map)localObject1;
    localObject1 = values();
    int i3 = localObject1.length;
    while (n < i3)
    {
      localDeviceSettingId2 = localObject1[n];
      localObject2 = a;
      String str = localDeviceSettingId2.mUniqueId;
      ((Map)localObject2).put(str, localDeviceSettingId2);
      n += 1;
    }
  }
  
  private DeviceSettingId(String paramString1)
  {
    this.mUniqueId = paramString1;
  }
  
  public static DeviceSettingId forValue(String paramString)
  {
    return (DeviceSettingId)a.get(paramString);
  }
  
  public boolean equals(String paramString)
  {
    return this.mUniqueId.equals(paramString);
  }
  
  public String getUniqueId()
  {
    return this.mUniqueId;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/base/DeviceSettingId.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */