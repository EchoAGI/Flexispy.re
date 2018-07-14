package com.android.internal.telephony.gsm;

import android.telephony.PhoneNumberUtils;
import android.text.format.Time;
import com.android.internal.telephony.GsmAlphabet;
import com.android.internal.telephony.SmsHeader;
import com.android.internal.telephony.uicc.IccUtils;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;

class SmsMessage$PduParser
{
  int mCur;
  byte[] mPdu;
  byte[] mUserData;
  SmsHeader mUserDataHeader;
  int mUserDataSeptetPadding;
  
  SmsMessage$PduParser(byte[] paramArrayOfByte)
  {
    this.mPdu = paramArrayOfByte;
    this.mCur = 0;
    this.mUserDataSeptetPadding = 0;
  }
  
  int constructUserData(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 0;
    int j = this.mCur;
    byte[] arrayOfByte1 = this.mPdu;
    int k = j + 1;
    j = arrayOfByte1[j];
    int m = j & 0xFF;
    byte[] arrayOfByte2;
    int n;
    Object localObject;
    byte[] arrayOfByte3;
    int i2;
    if (paramBoolean1)
    {
      arrayOfByte2 = this.mPdu;
      n = k + 1;
      j = arrayOfByte2[k] & 0xFF;
      localObject = new byte[j];
      arrayOfByte3 = this.mPdu;
      System.arraycopy(arrayOfByte3, n, localObject, 0, j);
      localObject = SmsHeader.fromByteArray((byte[])localObject);
      this.mUserDataHeader = ((SmsHeader)localObject);
      n += j;
      int i1 = (j + 1) * 8;
      i2 = i1 / 7;
      k = i1 % 7;
      if (k > 0)
      {
        k = 1;
        k += i2;
        i2 = k * 7;
        i1 = i2 - i1;
        this.mUserDataSeptetPadding = i1;
        int i3 = j;
        j = k;
        k = i3;
      }
    }
    for (;;)
    {
      if (paramBoolean2)
      {
        localObject = this.mPdu;
        k = localObject.length - n;
        localObject = new byte[k];
        this.mUserData = ((byte[])localObject);
        localObject = this.mPdu;
        arrayOfByte3 = this.mUserData;
        byte[] arrayOfByte4 = this.mUserData;
        i2 = arrayOfByte4.length;
        System.arraycopy(localObject, n, arrayOfByte3, 0, i2);
        this.mCur = n;
        if (!paramBoolean2) {
          break label320;
        }
        k = m - j;
        if (k >= 0) {
          break label314;
        }
      }
      for (;;)
      {
        return i;
        k = 0;
        localObject = null;
        break;
        if (paramBoolean1) {
          k += 1;
        }
        for (;;)
        {
          k = m - k;
          if (k >= 0) {
            break;
          }
          k = 0;
          localObject = null;
          break;
          k = 0;
          localObject = null;
        }
        label314:
        i = k;
        continue;
        label320:
        localObject = this.mUserData;
        i = localObject.length;
      }
      j = 0;
      arrayOfByte2 = null;
      n = k;
      k = 0;
      localObject = null;
    }
  }
  
  GsmSmsAddress getAddress()
  {
    byte[] arrayOfByte1 = this.mPdu;
    int i = this.mCur;
    int j = ((arrayOfByte1[i] & 0xFF) + 1) / 2 + 2;
    try
    {
      localObject = new com/android/internal/telephony/gsm/GsmSmsAddress;
      byte[] arrayOfByte2 = this.mPdu;
      int k = this.mCur;
      ((GsmSmsAddress)localObject).<init>(arrayOfByte2, k, j);
      int m = this.mCur;
      j += m;
      this.mCur = j;
      return (GsmSmsAddress)localObject;
    }
    catch (ParseException localParseException)
    {
      Object localObject = new java/lang/RuntimeException;
      String str = localParseException.getMessage();
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
    }
  }
  
  int getByte()
  {
    byte[] arrayOfByte = this.mPdu;
    int i = this.mCur;
    int j = i + 1;
    this.mCur = j;
    return arrayOfByte[i] & 0xFF;
  }
  
  String getSCAddress()
  {
    String str = null;
    int i = getByte();
    if (i == 0) {}
    for (;;)
    {
      int j = this.mCur;
      i += j;
      this.mCur = i;
      return str;
      try
      {
        byte[] arrayOfByte = this.mPdu;
        int k = this.mCur;
        str = PhoneNumberUtils.calledPartyBCDToString(arrayOfByte, k, i);
      }
      catch (RuntimeException localRuntimeException) {}
    }
  }
  
  long getSCTimestampMillis()
  {
    byte[] arrayOfByte = this.mPdu;
    int i = this.mCur;
    int j = i + 1;
    this.mCur = j;
    i = IccUtils.gsmBcdByteToInt(arrayOfByte[i]);
    arrayOfByte = this.mPdu;
    j = this.mCur;
    int k = j + 1;
    this.mCur = k;
    j = IccUtils.gsmBcdByteToInt(arrayOfByte[j]);
    arrayOfByte = this.mPdu;
    k = this.mCur;
    int m = k + 1;
    this.mCur = m;
    k = IccUtils.gsmBcdByteToInt(arrayOfByte[k]);
    arrayOfByte = this.mPdu;
    m = this.mCur;
    int n = m + 1;
    this.mCur = n;
    m = IccUtils.gsmBcdByteToInt(arrayOfByte[m]);
    arrayOfByte = this.mPdu;
    n = this.mCur;
    int i1 = n + 1;
    this.mCur = i1;
    n = IccUtils.gsmBcdByteToInt(arrayOfByte[n]);
    arrayOfByte = this.mPdu;
    i1 = this.mCur;
    int i2 = i1 + 1;
    this.mCur = i2;
    i1 = IccUtils.gsmBcdByteToInt(arrayOfByte[i1]);
    arrayOfByte = this.mPdu;
    i2 = this.mCur;
    int i3 = i2 + 1;
    this.mCur = i3;
    i2 = arrayOfByte[i2];
    int i4 = IccUtils.gsmBcdByteToInt((byte)(i2 & 0xFFFFFFF7));
    i2 &= 0x8;
    Time localTime;
    if (i2 == 0)
    {
      localTime = new android/text/format/Time;
      String str = "UTC";
      localTime.<init>(str);
      i3 = 90;
      if (i < i3) {
        break label347;
      }
      i += 1900;
    }
    for (;;)
    {
      localTime.year = i;
      i = j + -1;
      localTime.month = i;
      localTime.monthDay = k;
      localTime.hour = m;
      localTime.minute = n;
      localTime.second = i1;
      long l1 = localTime.toMillis(true);
      long l2 = i4 * 15 * 60 * 1000;
      return l1 - l2;
      i4 = -i4;
      break;
      label347:
      i += 2000;
    }
  }
  
  byte[] getUserData()
  {
    return this.mUserData;
  }
  
  String getUserDataGSM7Bit(int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject = this.mPdu;
    int i = this.mCur;
    int j = this.mUserDataSeptetPadding;
    int k = paramInt1;
    localObject = GsmAlphabet.gsm7BitPackedToString((byte[])localObject, i, paramInt1, j, paramInt2, paramInt3);
    i = this.mCur;
    k = paramInt1 * 7 / 8;
    i += k;
    this.mCur = i;
    return (String)localObject;
  }
  
  SmsHeader getUserDataHeader()
  {
    return this.mUserDataHeader;
  }
  
  String getUserDataKSC5601(int paramInt)
  {
    try
    {
      str1 = new java/lang/String;
      byte[] arrayOfByte = this.mPdu;
      int i = this.mCur;
      String str3 = "KSC5601";
      str1.<init>(arrayOfByte, i, paramInt, str3);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        String str1;
        int j;
        String str2 = "";
        boolean bool = SmsMessage.access$000();
        if (!bool) {}
      }
    }
    j = this.mCur + paramInt;
    this.mCur = j;
    return str1;
  }
  
  String getUserDataUCS2(int paramInt)
  {
    try
    {
      str1 = new java/lang/String;
      byte[] arrayOfByte = this.mPdu;
      int i = this.mCur;
      String str3 = "utf-16";
      str1.<init>(arrayOfByte, i, paramInt, str3);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        String str1;
        int j;
        String str2 = "";
        boolean bool = SmsMessage.access$000();
        if (!bool) {}
      }
    }
    j = this.mCur + paramInt;
    this.mCur = j;
    return str1;
  }
  
  boolean moreDataPresent()
  {
    byte[] arrayOfByte = this.mPdu;
    int i = arrayOfByte.length;
    int k = this.mCur;
    if (i > k) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      arrayOfByte = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/android/internal/telephony/gsm/SmsMessage$PduParser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */