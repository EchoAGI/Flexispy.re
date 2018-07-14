package com.android.internal.telephony;

public abstract class SmsAddress
{
  public static final int TON_ABBREVIATED = 6;
  public static final int TON_ALPHANUMERIC = 5;
  public static final int TON_INTERNATIONAL = 1;
  public static final int TON_NATIONAL = 2;
  public static final int TON_NETWORK = 3;
  public static final int TON_SUBSCRIBER = 4;
  public static final int TON_UNKNOWN;
  public String address;
  public byte[] origBytes;
  public int ton;
  
  public boolean couldBeEmailGateway()
  {
    String str = this.address;
    int i = str.length();
    int k = 4;
    if (i <= k) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      str = null;
    }
  }
  
  public String getAddressString()
  {
    return this.address;
  }
  
  public boolean isAlphanumeric()
  {
    int i = this.ton;
    int k = 5;
    if (i == k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean isNetworkSpecific()
  {
    int i = this.ton;
    int k = 3;
    if (i == k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/android/internal/telephony/SmsAddress.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */