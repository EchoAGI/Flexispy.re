package com.vvt.callmanager.mitm;

import android.os.Parcel;

public class e
{
  public static String a(Parcel paramParcel)
  {
    byte[] arrayOfByte = paramParcel.marshall();
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    int i = 0;
    for (;;)
    {
      int j = arrayOfByte.length;
      if (i >= j) {
        break;
      }
      if (i > 0)
      {
        String str = ", ";
        localStringBuilder.append(str);
      }
      j = arrayOfByte[i] & 0xFF;
      localStringBuilder.append(j);
      i += 1;
    }
    return localStringBuilder.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/mitm/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */