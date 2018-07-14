package com.android.internal.telephony;

import java.util.Arrays;

public abstract class SmsMessageBase$SubmitPduBase
{
  public byte[] encodedMessage;
  public byte[] encodedScAddress;
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("SubmitPdu: encodedScAddress = ");
    String str = Arrays.toString(this.encodedScAddress);
    localStringBuilder = localStringBuilder.append(str).append(", encodedMessage = ");
    str = Arrays.toString(this.encodedMessage);
    return str;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/android/internal/telephony/SmsMessageBase$SubmitPduBase.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */