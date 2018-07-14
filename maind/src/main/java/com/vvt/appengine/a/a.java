package com.vvt.appengine.a;

import android.os.ConditionVariable;
import com.vvt.activation_manager.ActivationManager;
import com.vvt.exceptions.FxConcurrentRequestNotAllowedException;
import com.vvt.license.LicenseInfo;
import com.vvt.license.LicenseStatus;
import com.vvt.remotecontrol.input.RmtCtrlInputActivation;
import com.vvt.remotecontrol.output.RmtCtrlActivateOutputStatusMessage;

public class a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private ActivationManager c;
  private ConditionVariable d;
  private RmtCtrlActivateOutputStatusMessage e;
  
  public a(ActivationManager paramActivationManager)
  {
    this.c = paramActivationManager;
  }
  
  private boolean a(com.vvt.license.a parama)
  {
    LicenseStatus localLicenseStatus1 = parama.a().getLicenseStatus();
    LicenseStatus localLicenseStatus2 = LicenseStatus.NOT_ACTIVATED;
    boolean bool;
    if (localLicenseStatus1 != localLicenseStatus2) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localLicenseStatus1 = null;
    }
  }
  
  private com.vvt.activation_manager.a b()
  {
    b localb = new com/vvt/appengine/a/b;
    localb.<init>(this);
    return localb;
  }
  
  private com.vvt.activation_manager.a c()
  {
    c localc = new com/vvt/appengine/a/c;
    localc.<init>(this);
    return localc;
  }
  
  public RmtCtrlActivateOutputStatusMessage a(RmtCtrlInputActivation paramRmtCtrlInputActivation, com.vvt.license.a parama)
  {
    bool1 = a;
    if (bool1) {}
    Object localObject1 = paramRmtCtrlInputActivation.getActivationCode();
    localObject4 = paramRmtCtrlInputActivation.getUrl();
    Object localObject5 = new com/vvt/remotecontrol/output/RmtCtrlActivateOutputStatusMessage;
    ((RmtCtrlActivateOutputStatusMessage)localObject5).<init>();
    this.e = ((RmtCtrlActivateOutputStatusMessage)localObject5);
    boolean bool2 = a(parama);
    if (bool2)
    {
      this.e.setSuccess(false);
      localObject1 = this.e;
      localObject4 = "Product is already activated. Your request will not be processed.";
      ((RmtCtrlActivateOutputStatusMessage)localObject1).setMessage((String)localObject4);
      localObject1 = this.e;
      return (RmtCtrlActivateOutputStatusMessage)localObject1;
    }
    localObject5 = new android/os/ConditionVariable;
    ((ConditionVariable)localObject5).<init>(false);
    this.d = ((ConditionVariable)localObject5);
    localObject5 = b();
    for (;;)
    {
      try
      {
        boolean bool3 = a;
        if ((bool3) && (localObject4 == null)) {
          continue;
        }
        Object localObject6 = ((String)localObject4).trim();
        int i = ((String)localObject6).length();
        if (i <= 0) {
          continue;
        }
        localObject6 = this.c;
        ((ActivationManager)localObject6).a((String)localObject4, (String)localObject1, (com.vvt.activation_manager.a)localObject5);
        bool1 = a;
        if (bool1) {}
        localObject1 = this.d;
        ((ConditionVariable)localObject1).block();
      }
      catch (FxConcurrentRequestNotAllowedException localFxConcurrentRequestNotAllowedException)
      {
        this.e.setSuccess(false);
        Object localObject2 = this.e;
        localObject4 = "Product is activating. Your request will not be processed.";
        ((RmtCtrlActivateOutputStatusMessage)localObject2).setMessage((String)localObject4);
        localObject2 = this.d;
        if (localObject2 == null) {
          continue;
        }
        localObject2 = this.d;
        ((ConditionVariable)localObject2).close();
        continue;
      }
      finally
      {
        bool1 = b;
        if (!bool1) {
          continue;
        }
        ConditionVariable localConditionVariable = this.d;
        if (localConditionVariable == null) {
          continue;
        }
        localConditionVariable = this.d;
        localConditionVariable.close();
        continue;
      }
      bool1 = a;
      if (bool1) {}
      localObject1 = this.e;
      break;
      localObject4 = this.c;
      ((ActivationManager)localObject4).a((String)localObject1, (com.vvt.activation_manager.a)localObject5);
    }
  }
  
  public RmtCtrlActivateOutputStatusMessage a(String paramString)
  {
    bool1 = a;
    if (bool1) {}
    Object localObject1 = new com/vvt/remotecontrol/output/RmtCtrlActivateOutputStatusMessage;
    ((RmtCtrlActivateOutputStatusMessage)localObject1).<init>();
    this.e = ((RmtCtrlActivateOutputStatusMessage)localObject1);
    localObject1 = new android/os/ConditionVariable;
    boolean bool2 = false;
    ActivationManager localActivationManager = null;
    ((ConditionVariable)localObject1).<init>(false);
    this.d = ((ConditionVariable)localObject1);
    localObject1 = c();
    try
    {
      bool2 = a;
      if (bool2) {}
      localActivationManager = this.c;
      localActivationManager.b(paramString, (com.vvt.activation_manager.a)localObject1);
      bool1 = a;
      if (bool1) {}
      localObject1 = this.d;
      ((ConditionVariable)localObject1).block();
    }
    finally
    {
      for (;;)
      {
        bool1 = b;
        if (bool1) {}
        ConditionVariable localConditionVariable = this.d;
        if (localConditionVariable != null)
        {
          localConditionVariable = this.d;
          localConditionVariable.close();
        }
      }
    }
    bool1 = a;
    if (bool1) {}
    return this.e;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */