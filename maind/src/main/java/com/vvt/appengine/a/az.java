package com.vvt.appengine.a;

import com.vvt.appengine.AppEngine1;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;

public class az
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  
  public RmtCtrlOutputStatusMessage a(AppEngine1 paramh)
  {
    int i = 1;
    float f = Float.MIN_VALUE;
    boolean bool1 = false;
    boolean bool2 = false;
    Object localObject1 = null;
    boolean bool3 = a;
    if (bool3) {}
    Object localObject2 = paramh.r;
    if (localObject2 != null)
    {
      localObject2 = paramh.r.a();
      Object localObject3 = "/gateway";
      boolean bool4 = ((String)localObject2).endsWith((String)localObject3);
      if (!bool4)
      {
        localObject3 = "/gateway/";
        bool4 = ((String)localObject2).endsWith((String)localObject3);
        if (!bool4) {}
      }
      else
      {
        localObject3 = "/gateway";
        int j = ((String)localObject2).indexOf((String)localObject3);
        localObject2 = ((String)localObject2).substring(0, j);
      }
      boolean bool5 = a;
      if ((!bool5) || (localObject2 != null))
      {
        int k = ((String)localObject2).length();
        if (k > i)
        {
          localObject1 = "Current URL is %s";
          localObject3 = new Object[i];
          localObject3[0] = localObject2;
          localObject2 = String.format((String)localObject1, (Object[])localObject3);
          bool2 = a;
          if (bool2) {}
          bool2 = i;
        }
      }
    }
    for (;;)
    {
      if (localObject2 == null)
      {
        bool3 = b;
        if (bool3) {}
        localObject2 = "Sorry. System cannot get server URL right now.";
      }
      for (;;)
      {
        localObject1 = new com/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
        ((RmtCtrlOutputStatusMessage)localObject1).<init>();
        ((RmtCtrlOutputStatusMessage)localObject1).setSuccess(bool1);
        ((RmtCtrlOutputStatusMessage)localObject1).setMessage((String)localObject2);
        return (RmtCtrlOutputStatusMessage)localObject1;
        bool1 = bool2;
      }
      bool3 = false;
      localObject2 = null;
      bool2 = false;
      localObject1 = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/az.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */