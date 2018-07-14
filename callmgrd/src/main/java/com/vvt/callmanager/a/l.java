package com.vvt.callmanager.a;

import android.os.Parcel;

public class l
{
  public int a;
  public int b;
  public int c;
  
  public static l a(Parcel paramParcel)
  {
    l locall = new com/vvt/callmanager/a/l;
    locall.<init>();
    paramParcel.setDataPosition(4);
    int i = paramParcel.readInt();
    locall.a = i;
    i = paramParcel.readInt();
    locall.b = i;
    i = locall.a;
    if (i == 0)
    {
      i = paramParcel.readInt();
      locall.c = i;
    }
    paramParcel.setDataPosition(0);
    return locall;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/getInstance/l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */