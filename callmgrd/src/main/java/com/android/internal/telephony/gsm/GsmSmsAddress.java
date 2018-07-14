package com.android.internal.telephony.gsm;

import android.telephony.PhoneNumberUtils;
import com.android.internal.telephony.GsmAlphabet;
import com.android.internal.telephony.SmsAddress;
import java.text.ParseException;

public class GsmSmsAddress
  extends SmsAddress
{
  static final int OFFSET_ADDRESS_LENGTH = 0;
  static final int OFFSET_ADDRESS_VALUE = 2;
  static final int OFFSET_TOA = 1;
  
  public GsmSmsAddress(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Object localObject1 = new byte[paramInt2];
    this.origBytes = ((byte[])localObject1);
    localObject1 = this.origBytes;
    System.arraycopy(paramArrayOfByte, paramInt1, localObject1, 0, paramInt2);
    localObject1 = this.origBytes;
    int j = localObject1[0] & 0xFF;
    Object localObject2 = this.origBytes;
    int k = localObject2[i] & 0xFF;
    int n = k >> 4 & 0x7;
    this.ton = n;
    n = k & 0x80;
    int i1 = 128;
    if (n != i1)
    {
      localObject1 = new java/text/ParseException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject2 = "Invalid TOA - high bit must be set. toa = " + k;
      n = paramInt1 + 1;
      ((ParseException)localObject1).<init>((String)localObject2, n);
      throw ((Throwable)localObject1);
    }
    boolean bool = isAlphanumeric();
    if (bool)
    {
      j = j * 4 / 7;
      localObject2 = this.origBytes;
      n = 2;
      localObject1 = GsmAlphabet.gsm7BitPackedToString((byte[])localObject2, n, j);
      this.address = ((String)localObject1);
    }
    for (;;)
    {
      return;
      localObject2 = this.origBytes;
      n = paramInt2 + -1;
      int m = localObject2[n];
      j &= 0x1;
      if (j == i)
      {
        localObject1 = this.origBytes;
        n = paramInt2 + -1;
        i1 = (byte)(localObject1[n] | 0xF0);
        localObject1[n] = i1;
      }
      localObject1 = this.origBytes;
      n = paramInt2 + -1;
      localObject1 = PhoneNumberUtils.calledPartyBCDToString((byte[])localObject1, i, n);
      this.address = ((String)localObject1);
      localObject1 = this.origBytes;
      n = paramInt2 + -1;
      localObject1[n] = m;
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
  
  public boolean isCphsVoiceMessageClear()
  {
    boolean bool = isCphsVoiceMessageIndicatorAddress();
    byte[] arrayOfByte;
    int i;
    if (bool)
    {
      arrayOfByte = this.origBytes;
      i = arrayOfByte[2] & 0xFF;
      int k = 16;
      if (i == k) {
        i = 1;
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      arrayOfByte = null;
    }
  }
  
  public boolean isCphsVoiceMessageIndicatorAddress()
  {
    boolean bool1 = true;
    byte[] arrayOfByte = this.origBytes;
    int i = arrayOfByte[0] & 0xFF;
    int k = 4;
    if (i == k)
    {
      boolean bool2 = isAlphanumeric();
      if (bool2)
      {
        arrayOfByte = this.origBytes;
        int j = arrayOfByte[bool1] & 0xF;
        if (j != 0) {}
      }
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
    }
  }
  
  public boolean isCphsVoiceMessageSet()
  {
    boolean bool = isCphsVoiceMessageIndicatorAddress();
    byte[] arrayOfByte;
    int i;
    if (bool)
    {
      arrayOfByte = this.origBytes;
      i = arrayOfByte[2] & 0xFF;
      int k = 17;
      if (i == k) {
        i = 1;
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      arrayOfByte = null;
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/android/internal/telephony/gsm/GsmSmsAddress.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */