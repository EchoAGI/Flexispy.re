package com.android.mockcdma;

public class e
{
  public static int a(byte paramByte)
  {
    int i = 0;
    int j = paramByte & 0xF0;
    int k = 144;
    if (j <= k) {
      i = (paramByte >> 4 & 0xF) * 10;
    }
    j = paramByte & 0xF;
    k = 9;
    if (j <= k)
    {
      j = paramByte & 0xF;
      i += j;
    }
    return i;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/android/mockcdma/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */