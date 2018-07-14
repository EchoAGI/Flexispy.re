package com.vvt.appengine.a;

import android.os.ConditionVariable;
import com.vvt.datadeliverymanager.enums.ErrorResponseType;
import com.vvt.remotecontrol.output.RmtCtrlActivateOutputStatusMessage;

class b
  implements com.vvt.activation_manager.a
{
  b(a parama) {}
  
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
    a.a(this.a).setSuccess(false);
    a.a(this.a).setMessage(paramString);
    a.a(this.a).setErrorCode(paramInt);
    a.b(this.a).open();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */