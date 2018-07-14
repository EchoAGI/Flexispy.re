package com.vvt.phoenix.a;

import android.os.Build;
import android.os.Build.VERSION;

public class c
{
  public static String a(String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("Client ").append(paramString).append("; Android ");
    String str = Build.VERSION.RELEASE;
    localStringBuilder = localStringBuilder.append(str).append("; ");
    str = Build.MODEL;
    return str;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/a/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */