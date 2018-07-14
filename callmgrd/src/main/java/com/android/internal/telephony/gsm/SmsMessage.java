package com.android.internal.telephony.gsm;

import android.telephony.PhoneNumberUtils;
import com.android.internal.telephony.EncodeException;
import com.android.internal.telephony.GsmAlphabet;
import com.android.internal.telephony.GsmAlphabet.TextEncodingDetails;
import com.android.internal.telephony.SmsAddress;
import com.android.internal.telephony.SmsConstants.MessageClass;
import com.android.internal.telephony.SmsHeader;
import com.android.internal.telephony.SmsHeader.PortAddrs;
import com.android.internal.telephony.SmsMessageBase;
import com.android.internal.telephony.uicc.IccUtils;
import com.vvt.h.a;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

public class SmsMessage
  extends SmsMessageBase
{
  private static final boolean LOGD = a.b;
  private static final boolean LOGV = a.a;
  static final String LOG_TAG = "SmsMessage";
  private int mDataCodingScheme;
  private boolean mIsStatusReportMessage = false;
  private int mMti;
  private int mProtocolIdentifier;
  private GsmSmsAddress mRecipientAddress;
  private boolean mReplyPathPresent = false;
  private int mStatus;
  private SmsConstants.MessageClass messageClass;
  
  public static GsmAlphabet.TextEncodingDetails calculateLength(CharSequence paramCharSequence, boolean paramBoolean)
  {
    GsmAlphabet.TextEncodingDetails localTextEncodingDetails = GsmAlphabet.countGsmSeptets(paramCharSequence, paramBoolean);
    int i;
    int j;
    if (localTextEncodingDetails == null)
    {
      localTextEncodingDetails = new com/android/internal/telephony/GsmAlphabet$TextEncodingDetails;
      localTextEncodingDetails.<init>();
      i = paramCharSequence.length() * 2;
      j = paramCharSequence.length();
      localTextEncodingDetails.codeUnitCount = j;
      j = 140;
      if (i <= j) {
        break label100;
      }
      j = (i + 133) / 134;
      localTextEncodingDetails.msgCount = j;
      j = localTextEncodingDetails.msgCount * 134;
      i = (j - i) / 2;
    }
    for (localTextEncodingDetails.codeUnitsRemaining = i;; localTextEncodingDetails.codeUnitsRemaining = i)
    {
      i = 3;
      localTextEncodingDetails.codeUnitSize = i;
      return localTextEncodingDetails;
      label100:
      j = 1;
      localTextEncodingDetails.msgCount = j;
      i = (140 - i) / 2;
    }
  }
  
  public static SmsMessage createFromEfRecord(int paramInt, byte[] paramArrayOfByte)
  {
    for (Object localObject = null;; localObject = localSmsMessage)
    {
      try
      {
        localSmsMessage = new com/android/internal/telephony/gsm/SmsMessage;
        localSmsMessage.<init>();
        localSmsMessage.mIndexOnIcc = paramInt;
        i = 0;
        i = paramArrayOfByte[0] & 0x1;
        if (i != 0) {
          break label42;
        }
        bool = LOGV;
        if (!bool) {}
      }
      catch (RuntimeException localRuntimeException)
      {
        for (;;)
        {
          SmsMessage localSmsMessage;
          int i;
          label42:
          byte[] arrayOfByte;
          int j;
          boolean bool = LOGV;
          if (!bool) {}
        }
      }
      return (SmsMessage)localObject;
      i = 0;
      i = paramArrayOfByte[0] & 0x7;
      localSmsMessage.mStatusOnIcc = i;
      i = paramArrayOfByte.length + -1;
      arrayOfByte = new byte[i];
      j = 1;
      System.arraycopy(paramArrayOfByte, j, arrayOfByte, 0, i);
      localSmsMessage.parsePdu(arrayOfByte);
    }
  }
  
  public static SmsMessage createFromPdu(byte[] paramArrayOfByte)
  {
    try
    {
      localSmsMessage = new com/android/internal/telephony/gsm/SmsMessage;
      localSmsMessage.<init>();
      localSmsMessage.parsePdu(paramArrayOfByte);
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;)
      {
        SmsMessage localSmsMessage;
        bool = LOGV;
        if (bool) {}
        bool = false;
        Object localObject1 = null;
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      for (;;)
      {
        boolean bool = LOGV;
        if (bool) {}
        bool = false;
        Object localObject2 = null;
      }
    }
    return localSmsMessage;
  }
  
  private static byte[] encodeUCS2(String paramString, byte[] paramArrayOfByte)
  {
    int i = 1;
    Object localObject = "utf-16be";
    byte[] arrayOfByte = paramString.getBytes((String)localObject);
    int k;
    if (paramArrayOfByte != null)
    {
      int j = paramArrayOfByte.length;
      k = arrayOfByte.length;
      j = j + k + 1;
      localObject = new byte[j];
      k = (byte)paramArrayOfByte.length;
      localObject[0] = k;
      k = paramArrayOfByte.length;
      System.arraycopy(paramArrayOfByte, 0, localObject, i, k);
      k = paramArrayOfByte.length + 1;
      int m = arrayOfByte.length;
      System.arraycopy(arrayOfByte, 0, localObject, k, m);
    }
    for (;;)
    {
      arrayOfByte = new byte[localObject.length + 1];
      k = (byte)(localObject.length & 0xFF);
      arrayOfByte[0] = k;
      k = localObject.length;
      System.arraycopy(localObject, 0, arrayOfByte, i, k);
      return arrayOfByte;
      localObject = arrayOfByte;
    }
  }
  
  public static SmsMessage.SubmitPdu getSubmitPdu(String paramString1, String paramString2, int paramInt, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    Object localObject1 = new com/android/internal/telephony/SmsHeader$PortAddrs;
    ((SmsHeader.PortAddrs)localObject1).<init>();
    ((SmsHeader.PortAddrs)localObject1).destPort = paramInt;
    ((SmsHeader.PortAddrs)localObject1).origPort = 0;
    ((SmsHeader.PortAddrs)localObject1).areEightBits = false;
    Object localObject2 = new com/android/internal/telephony/SmsHeader;
    ((SmsHeader)localObject2).<init>();
    ((SmsHeader)localObject2).portAddrs = ((SmsHeader.PortAddrs)localObject1);
    localObject2 = SmsHeader.toByteArray((SmsHeader)localObject2);
    int i = paramArrayOfByte.length;
    int j = localObject2.length;
    i = i + j + 1;
    j = 140;
    if (i > j)
    {
      boolean bool = LOGV;
      if (bool) {}
      bool = false;
      localObject1 = null;
    }
    for (;;)
    {
      return (SmsMessage.SubmitPdu)localObject1;
      localObject1 = new com/android/internal/telephony/gsm/SmsMessage$SubmitPdu;
      ((SmsMessage.SubmitPdu)localObject1).<init>();
      j = 65;
      ByteArrayOutputStream localByteArrayOutputStream = getSubmitPduHead(paramString1, paramString2, j, paramBoolean, (SmsMessage.SubmitPdu)localObject1);
      localByteArrayOutputStream.write(4);
      int k = paramArrayOfByte.length;
      int m = localObject2.length;
      k = k + m + 1;
      localByteArrayOutputStream.write(k);
      k = localObject2.length;
      localByteArrayOutputStream.write(k);
      k = localObject2.length;
      localByteArrayOutputStream.write((byte[])localObject2, 0, k);
      int n = paramArrayOfByte.length;
      localByteArrayOutputStream.write(paramArrayOfByte, 0, n);
      localObject2 = localByteArrayOutputStream.toByteArray();
      ((SmsMessage.SubmitPdu)localObject1).encodedMessage = ((byte[])localObject2);
    }
  }
  
  public static SmsMessage.SubmitPdu getSubmitPdu(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    return getSubmitPdu(paramString1, paramString2, paramString3, paramBoolean, null);
  }
  
  public static SmsMessage.SubmitPdu getSubmitPdu(String paramString1, String paramString2, String paramString3, boolean paramBoolean, byte[] paramArrayOfByte)
  {
    return getSubmitPdu(paramString1, paramString2, paramString3, paramBoolean, paramArrayOfByte, 0, 0, 0);
  }
  
  public static SmsMessage.SubmitPdu getSubmitPdu(String paramString1, String paramString2, String paramString3, boolean paramBoolean, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 1;
    int j = 0;
    byte b;
    Object localObject1;
    if ((paramString3 == null) || (paramString2 == null))
    {
      b = 0;
      localObject1 = null;
    }
    label144:
    SmsMessage.SubmitPdu localSubmitPdu;
    label163:
    ByteArrayOutputStream localByteArrayOutputStream;
    int m;
    boolean bool1;
    label249:
    label292:
    Object localObject3;
    for (;;)
    {
      return (SmsMessage.SubmitPdu)localObject1;
      if (paramInt1 == 0)
      {
        localObject1 = calculateLength(paramString3, false);
        paramInt1 = ((GsmAlphabet.TextEncodingDetails)localObject1).codeUnitSize;
        paramInt2 = ((GsmAlphabet.TextEncodingDetails)localObject1).languageTable;
        paramInt3 = ((GsmAlphabet.TextEncodingDetails)localObject1).languageShiftTable;
        if ((paramInt1 == i) && ((paramInt2 != 0) || (paramInt3 != 0)))
        {
          if (paramArrayOfByte == null) {
            break label249;
          }
          localObject1 = SmsHeader.fromByteArray(paramArrayOfByte);
          int k = ((SmsHeader)localObject1).languageTable;
          if (k == paramInt2)
          {
            k = ((SmsHeader)localObject1).languageShiftTable;
            if (k == paramInt3) {}
          }
          else
          {
            boolean bool2 = LOGV;
            if (bool2) {}
            ((SmsHeader)localObject1).languageTable = paramInt2;
            ((SmsHeader)localObject1).languageShiftTable = paramInt3;
            paramArrayOfByte = SmsHeader.toByteArray((SmsHeader)localObject1);
          }
        }
      }
      localSubmitPdu = new com/android/internal/telephony/gsm/SmsMessage$SubmitPdu;
      localSubmitPdu.<init>();
      if (paramArrayOfByte != null)
      {
        b = 64;
        b = (byte)(b | 0x1);
        localByteArrayOutputStream = getSubmitPduHead(paramString1, paramString2, b, paramBoolean, localSubmitPdu);
        if (paramInt1 != i) {
          break label292;
        }
      }
      for (;;)
      {
        try
        {
          localObject1 = GsmAlphabet.stringToGsm7BitPackedWithHeader(paramString3, paramArrayOfByte, paramInt2, paramInt3);
        }
        catch (EncodeException localEncodeException)
        {
          try
          {
            byte[] arrayOfByte = encodeUCS2(paramString3, paramArrayOfByte);
            paramInt1 = 3;
          }
          catch (UnsupportedEncodingException localUnsupportedEncodingException2)
          {
            bool1 = LOGV;
            if (!bool1) {
              continue;
            }
            bool1 = false;
            localObject3 = null;
          }
        }
        if (paramInt1 != i) {
          break label403;
        }
        i = localObject1[0] & 0xFF;
        m = 160;
        if (i <= m) {
          break label361;
        }
        bool1 = LOGV;
        if (bool1) {}
        bool1 = false;
        localObject1 = null;
        break;
        localObject1 = new com/android/internal/telephony/SmsHeader;
        ((SmsHeader)localObject1).<init>();
        ((SmsHeader)localObject1).languageTable = paramInt2;
        ((SmsHeader)localObject1).languageShiftTable = paramInt3;
        paramArrayOfByte = SmsHeader.toByteArray((SmsHeader)localObject1);
        break label144;
        bool1 = false;
        localObject1 = null;
        break label163;
        try
        {
          localObject1 = encodeUCS2(paramString3, paramArrayOfByte);
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException1)
        {
          bool1 = LOGV;
          if (bool1) {}
          bool1 = false;
          Object localObject2 = null;
        }
      }
    }
    label361:
    localByteArrayOutputStream.write(0);
    for (;;)
    {
      j = localObject3.length;
      localByteArrayOutputStream.write((byte[])localObject3, 0, j);
      localObject3 = localByteArrayOutputStream.toByteArray();
      localSubmitPdu.encodedMessage = ((byte[])localObject3);
      localObject3 = localSubmitPdu;
      break;
      label403:
      i = localObject3[0] & 0xFF;
      m = 140;
      if (i > m)
      {
        bool1 = LOGV;
        if (bool1) {}
        bool1 = false;
        localObject3 = null;
        break;
      }
      j = 8;
      localByteArrayOutputStream.write(j);
    }
  }
  
  private static ByteArrayOutputStream getSubmitPduHead(String paramString1, String paramString2, byte paramByte, boolean paramBoolean, SmsMessage.SubmitPdu paramSubmitPdu)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    int i = 180;
    localByteArrayOutputStream.<init>(i);
    byte[] arrayOfByte1;
    byte[] arrayOfByte2;
    int k;
    int j;
    if (paramString1 == null)
    {
      i = 0;
      arrayOfByte1 = null;
      paramSubmitPdu.encodedScAddress = null;
      if (paramBoolean)
      {
        paramByte = (byte)(paramByte | 0x20);
        boolean bool = LOGD;
        if (!bool) {}
      }
      localByteArrayOutputStream.write(paramByte);
      localByteArrayOutputStream.write(0);
      arrayOfByte2 = PhoneNumberUtils.networkPortionToCalledPartyBCD(paramString2);
      k = (arrayOfByte2.length + -1) * 2;
      j = arrayOfByte2.length + -1;
      j = arrayOfByte2[j] & 0xF0;
      int m = 240;
      if (j != m) {
        break label167;
      }
      j = 1;
    }
    for (;;)
    {
      j = k - j;
      localByteArrayOutputStream.write(j);
      j = arrayOfByte2.length;
      localByteArrayOutputStream.write(arrayOfByte2, 0, j);
      localByteArrayOutputStream.write(0);
      return localByteArrayOutputStream;
      arrayOfByte1 = PhoneNumberUtils.networkPortionToCalledPartyBCDWithLength(paramString1);
      paramSubmitPdu.encodedScAddress = arrayOfByte1;
      break;
      label167:
      j = 0;
      arrayOfByte1 = null;
    }
  }
  
  public static int getTPLayerLengthForPDU(String paramString)
  {
    int i = paramString.length() / 2;
    int j = Integer.parseInt(paramString.substring(0, 2), 16);
    return i - j + -1;
  }
  
  public static SmsMessage newFromCDS(String paramString)
  {
    try
    {
      localSmsMessage = new com/android/internal/telephony/gsm/SmsMessage;
      localSmsMessage.<init>();
      byte[] arrayOfByte = IccUtils.hexStringToBytes(paramString);
      localSmsMessage.parsePdu(arrayOfByte);
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;)
      {
        SmsMessage localSmsMessage;
        boolean bool = LOGV;
        if (bool) {}
        bool = false;
        Object localObject = null;
      }
    }
    return localSmsMessage;
  }
  
  public static SmsMessage newFromCMT(String[] paramArrayOfString)
  {
    try
    {
      localSmsMessage = new com/android/internal/telephony/gsm/SmsMessage;
      localSmsMessage.<init>();
      int i = 1;
      Object localObject2 = paramArrayOfString[i];
      localObject2 = IccUtils.hexStringToBytes((String)localObject2);
      localSmsMessage.parsePdu((byte[])localObject2);
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;)
      {
        SmsMessage localSmsMessage;
        boolean bool = LOGV;
        if (bool) {}
        bool = false;
        Object localObject1 = null;
      }
    }
    return localSmsMessage;
  }
  
  private void parsePdu(byte[] paramArrayOfByte)
  {
    this.mPdu = paramArrayOfByte;
    Object localObject = new com/android/internal/telephony/gsm/SmsMessage$PduParser;
    ((SmsMessage.PduParser)localObject).<init>(paramArrayOfByte);
    String str = ((SmsMessage.PduParser)localObject).getSCAddress();
    this.mScAddress = str;
    str = this.mScAddress;
    if (str != null)
    {
      boolean bool = LOGD;
      if (!bool) {}
    }
    int i = ((SmsMessage.PduParser)localObject).getByte();
    int j = i & 0x3;
    this.mMti = j;
    j = this.mMti;
    switch (j)
    {
    default: 
      localObject = new java/lang/RuntimeException;
      ((RuntimeException)localObject).<init>("Unsupported message type");
      throw ((Throwable)localObject);
    case 0: 
    case 3: 
      parseSmsDeliver((SmsMessage.PduParser)localObject, i);
    }
    for (;;)
    {
      return;
      parseSmsSubmit((SmsMessage.PduParser)localObject, i);
      continue;
      parseSmsStatusReport((SmsMessage.PduParser)localObject, i);
    }
  }
  
  private void parseSmsDeliver(SmsMessage.PduParser paramPduParser, int paramInt)
  {
    int i = 1;
    int j = paramInt & 0x80;
    int n = 128;
    Object localObject;
    int m;
    if (j == n)
    {
      j = i;
      this.mReplyPathPresent = j;
      localObject = paramPduParser.getAddress();
      this.mOriginatingAddress = ((SmsAddress)localObject);
      localObject = this.mOriginatingAddress;
      if (localObject != null)
      {
        boolean bool1 = LOGD;
        if (bool1)
        {
          bool1 = LOGV;
          if (!bool1) {}
        }
      }
      int k = paramPduParser.getByte();
      this.mProtocolIdentifier = k;
      k = paramPduParser.getByte();
      this.mDataCodingScheme = k;
      boolean bool2 = LOGD;
      if (bool2)
      {
        bool2 = LOGV;
        if (!bool2) {}
      }
      long l = paramPduParser.getSCTimestampMillis();
      this.mScTimeMillis = l;
      bool2 = LOGD;
      if (bool2) {}
      m = paramInt & 0x40;
      n = 64;
      if (m != n) {
        break label172;
      }
    }
    for (;;)
    {
      parseUserData(paramPduParser, i);
      return;
      m = 0;
      localObject = null;
      break;
      label172:
      i = 0;
    }
  }
  
  private void parseSmsStatusReport(SmsMessage.PduParser paramPduParser, int paramInt)
  {
    boolean bool = true;
    this.mIsStatusReportMessage = bool;
    int i = paramPduParser.getByte();
    this.mMessageRef = i;
    GsmSmsAddress localGsmSmsAddress = paramPduParser.getAddress();
    this.mRecipientAddress = localGsmSmsAddress;
    long l = paramPduParser.getSCTimestampMillis();
    this.mScTimeMillis = l;
    paramPduParser.getSCTimestampMillis();
    i = paramPduParser.getByte();
    this.mStatus = i;
    int j = paramPduParser.moreDataPresent();
    if (j != 0)
    {
      int m = paramPduParser.getByte();
      for (j = m;; k = paramPduParser.getByte())
      {
        j &= 0x80;
        if (k == 0) {
          break;
        }
      }
      int k = m & 0x78;
      if (k == 0)
      {
        k = m & 0x1;
        if (k != 0)
        {
          k = paramPduParser.getByte();
          this.mProtocolIdentifier = k;
        }
        k = m & 0x2;
        if (k != 0)
        {
          k = paramPduParser.getByte();
          this.mDataCodingScheme = k;
        }
        k = m & 0x4;
        if (k != 0)
        {
          k = paramInt & 0x40;
          m = 64;
          if (k != m) {
            break label196;
          }
        }
      }
    }
    for (;;)
    {
      parseUserData(paramPduParser, bool);
      return;
      label196:
      bool = false;
    }
  }
  
  private void parseSmsSubmit(SmsMessage.PduParser paramPduParser, int paramInt)
  {
    int i = 1;
    int j = paramInt & 0x80;
    int n = 128;
    GsmSmsAddress localGsmSmsAddress;
    if (j == n)
    {
      j = i;
      this.mReplyPathPresent = j;
      j = paramPduParser.getByte();
      this.mMessageRef = j;
      localGsmSmsAddress = paramPduParser.getAddress();
      this.mRecipientAddress = localGsmSmsAddress;
      localGsmSmsAddress = this.mRecipientAddress;
      if (localGsmSmsAddress != null)
      {
        boolean bool1 = LOGD;
        if (bool1)
        {
          bool1 = LOGV;
          if (!bool1) {}
        }
      }
      int k = paramPduParser.getByte();
      this.mProtocolIdentifier = k;
      k = paramPduParser.getByte();
      this.mDataCodingScheme = k;
      boolean bool2 = LOGD;
      if (bool2)
      {
        bool2 = LOGV;
        if (!bool2) {}
      }
      m = paramInt >> 3 & 0x3;
      if (m != 0) {
        break label179;
      }
      m = 0;
      localGsmSmsAddress = null;
    }
    for (;;)
    {
      n = m + -1;
      if (m <= 0) {
        break label202;
      }
      paramPduParser.getByte();
      m = n;
      continue;
      m = 0;
      localGsmSmsAddress = null;
      break;
      label179:
      n = 2;
      if (n == m) {
        m = i;
      } else {
        m = 7;
      }
    }
    label202:
    int m = paramInt & 0x40;
    n = 64;
    if (m == n) {}
    for (;;)
    {
      parseUserData(paramPduParser, i);
      return;
      i = 0;
    }
  }
  
  private void parseUserData(SmsMessage.PduParser paramPduParser, boolean paramBoolean)
  {
    int i = 192;
    int j = 3;
    int k = 2;
    int m = 0;
    SmsHeader localSmsHeader = null;
    int n = 1;
    float f1 = Float.MIN_VALUE;
    int i2 = this.mDataCodingScheme & 0x80;
    int i7;
    float f2;
    label78:
    boolean bool1;
    Object localObject1;
    if (i2 == 0)
    {
      i2 = this.mDataCodingScheme & 0x20;
      if (i2 != 0)
      {
        i2 = n;
        i7 = this.mDataCodingScheme & 0x10;
        if (i7 == 0) {
          break label241;
        }
        i7 = n;
        f2 = f1;
        if (i2 == 0) {
          break label250;
        }
        bool1 = LOGV;
        if (!bool1) {
          break label919;
        }
        bool1 = false;
        localObject1 = null;
        j = i7;
      }
    }
    for (;;)
    {
      label103:
      label110:
      int i1;
      if (bool1 == n)
      {
        i1 = paramPduParser.constructUserData(paramBoolean, n);
        Object localObject2 = paramPduParser.getUserData();
        this.mUserData = ((byte[])localObject2);
        localObject2 = paramPduParser.getUserDataHeader();
        this.mUserDataHeader = ((SmsHeader)localObject2);
        switch (bool1)
        {
        default: 
          label180:
          bool1 = LOGD;
          if (bool1)
          {
            bool1 = LOGV;
            if (!bool1) {}
          }
          localObject1 = this.mMessageBody;
          if (localObject1 != null) {
            parseMessageBody();
          }
          if (j == 0)
          {
            localObject1 = SmsConstants.MessageClass.UNKNOWN;
            this.messageClass = ((SmsConstants.MessageClass)localObject1);
          }
          break;
        }
      }
      for (;;)
      {
        return;
        bool1 = false;
        localObject1 = null;
        break;
        label241:
        i7 = 0;
        f2 = 0.0F;
        break label78;
        label250:
        int i3 = this.mDataCodingScheme >> 2 & 0x3;
        switch (i3)
        {
        default: 
          i3 = 0;
          localObject1 = null;
        }
        for (;;)
        {
          j = i7;
          break;
          i3 = i1;
          continue;
          i3 = j;
          continue;
          boolean bool2 = LOGV;
          if (bool2) {}
          bool2 = k;
        }
        int i4 = this.mDataCodingScheme & 0xF0;
        i7 = 240;
        f2 = 3.36E-43F;
        if (i4 == i7)
        {
          i4 = this.mDataCodingScheme & 0x4;
          if (i4 == 0)
          {
            i4 = i1;
            j = i1;
            break label103;
          }
          i4 = k;
          j = i1;
          break label103;
        }
        i4 = this.mDataCodingScheme & 0xF0;
        if (i4 != i)
        {
          i4 = this.mDataCodingScheme & 0xF0;
          k = 208;
          if (i4 != k)
          {
            i4 = this.mDataCodingScheme & 0xF0;
            k = 224;
            if (i4 != k) {
              break label607;
            }
          }
        }
        i4 = this.mDataCodingScheme & 0xF0;
        k = 224;
        if (i4 == k)
        {
          label479:
          i4 = this.mDataCodingScheme & 0x8;
          k = 8;
          if (i4 != k) {
            break label571;
          }
          i4 = i1;
          label503:
          k = this.mDataCodingScheme & 0x3;
          if (k != 0) {
            break label589;
          }
          this.mIsMwi = i1;
          this.mMwiSense = i4;
          i4 = this.mDataCodingScheme & 0xF0;
          if (i4 != i) {
            break label580;
          }
          i4 = i1;
          label548:
          this.mMwiDontStore = i4;
        }
        for (;;)
        {
          i4 = j;
          j = 0;
          break;
          j = i1;
          break label479;
          label571:
          i4 = 0;
          localObject1 = null;
          break label503;
          label580:
          i4 = 0;
          localObject1 = null;
          break label548;
          label589:
          this.mIsMwi = false;
          boolean bool3 = LOGV;
          if (!bool3) {}
        }
        label607:
        int i5 = this.mDataCodingScheme & 0xC0;
        j = 128;
        if (i5 == j)
        {
          i5 = this.mDataCodingScheme;
          j = 132;
          if (i5 == j)
          {
            i5 = 4;
            j = 0;
            break label103;
          }
          bool4 = LOGV;
          if (!bool4) {
            break label688;
          }
          bool4 = false;
          localObject1 = null;
          j = 0;
          break label103;
        }
        boolean bool4 = LOGV;
        if (bool4) {}
        label688:
        bool4 = false;
        localObject1 = null;
        j = 0;
        break label103;
        i1 = 0;
        f1 = 0.0F;
        break label110;
        bool4 = false;
        localObject1 = null;
        this.mMessageBody = null;
        break label180;
        if (paramBoolean)
        {
          localObject1 = this.mUserDataHeader;
          i6 = ((SmsHeader)localObject1).languageTable;
        }
        for (;;)
        {
          if (paramBoolean)
          {
            localSmsHeader = this.mUserDataHeader;
            m = localSmsHeader.languageShiftTable;
          }
          localObject1 = paramPduParser.getUserDataGSM7Bit(i1, i6, m);
          this.mMessageBody = ((String)localObject1);
          break;
          i6 = 0;
          localObject1 = null;
        }
        localObject1 = paramPduParser.getUserDataUCS2(i1);
        this.mMessageBody = ((String)localObject1);
        break label180;
        localObject1 = paramPduParser.getUserDataKSC5601(i1);
        this.mMessageBody = ((String)localObject1);
        break label180;
        i6 = this.mDataCodingScheme & 0x3;
        switch (i6)
        {
        default: 
          break;
        case 0: 
          localObject1 = SmsConstants.MessageClass.CLASS_0;
          this.messageClass = ((SmsConstants.MessageClass)localObject1);
          break;
        case 1: 
          localObject1 = SmsConstants.MessageClass.CLASS_1;
          this.messageClass = ((SmsConstants.MessageClass)localObject1);
          break;
        case 2: 
          localObject1 = SmsConstants.MessageClass.CLASS_2;
          this.messageClass = ((SmsConstants.MessageClass)localObject1);
          break;
        case 3: 
          localObject1 = SmsConstants.MessageClass.CLASS_3;
          this.messageClass = ((SmsConstants.MessageClass)localObject1);
        }
      }
      label919:
      int i6 = 0;
      localObject1 = null;
      j = i7;
    }
  }
  
  int getDataCodingScheme()
  {
    return this.mDataCodingScheme;
  }
  
  public SmsConstants.MessageClass getMessageClass()
  {
    return this.messageClass;
  }
  
  public int getProtocolIdentifier()
  {
    return this.mProtocolIdentifier;
  }
  
  public int getStatus()
  {
    return this.mStatus;
  }
  
  public boolean isCphsMwiMessage()
  {
    GsmSmsAddress localGsmSmsAddress = (GsmSmsAddress)this.mOriginatingAddress;
    boolean bool = localGsmSmsAddress.isCphsVoiceMessageClear();
    if (!bool)
    {
      localGsmSmsAddress = (GsmSmsAddress)this.mOriginatingAddress;
      bool = localGsmSmsAddress.isCphsVoiceMessageSet();
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localGsmSmsAddress = null;
    }
  }
  
  public boolean isMWIClearMessage()
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    boolean bool2 = this.mIsMwi;
    if (bool2)
    {
      bool2 = this.mMwiSense;
      if (!bool2) {
        return bool1;
      }
    }
    Object localObject = this.mOriginatingAddress;
    float f2;
    if (localObject != null)
    {
      localObject = (GsmSmsAddress)this.mOriginatingAddress;
      bool2 = ((GsmSmsAddress)localObject).isCphsVoiceMessageClear();
      if (bool2)
      {
        bool2 = bool1;
        f2 = f1;
      }
    }
    for (;;)
    {
      bool1 = bool2;
      f1 = f2;
      break;
      bool2 = false;
      f2 = 0.0F;
      localObject = null;
    }
  }
  
  public boolean isMWISetMessage()
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    boolean bool2 = this.mIsMwi;
    if (bool2)
    {
      bool2 = this.mMwiSense;
      if (bool2) {
        return bool1;
      }
    }
    Object localObject = this.mOriginatingAddress;
    float f2;
    if (localObject != null)
    {
      localObject = (GsmSmsAddress)this.mOriginatingAddress;
      bool2 = ((GsmSmsAddress)localObject).isCphsVoiceMessageSet();
      if (bool2)
      {
        bool2 = bool1;
        f2 = f1;
      }
    }
    for (;;)
    {
      bool1 = bool2;
      f1 = f2;
      break;
      bool2 = false;
      f2 = 0.0F;
      localObject = null;
    }
  }
  
  public boolean isMwiDontStore()
  {
    boolean bool1 = true;
    boolean bool2 = this.mIsMwi;
    if (bool2)
    {
      bool2 = this.mMwiDontStore;
      if (!bool2) {}
    }
    for (;;)
    {
      return bool1;
      bool2 = isCphsMwiMessage();
      if (bool2)
      {
        String str1 = " ";
        String str2 = getMessageBody();
        bool2 = str1.equals(str2);
        if (bool2) {}
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public boolean isReplace()
  {
    int i = this.mProtocolIdentifier & 0xC0;
    int k = 64;
    if (i == k)
    {
      i = this.mProtocolIdentifier & 0x3F;
      if (i > 0)
      {
        i = this.mProtocolIdentifier & 0x3F;
        int m = 8;
        if (i >= m) {}
      }
    }
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean isReplyPathPresent()
  {
    return this.mReplyPathPresent;
  }
  
  public boolean isStatusReportMessage()
  {
    return this.mIsStatusReportMessage;
  }
  
  public boolean isTypeZero()
  {
    int i = this.mProtocolIdentifier;
    int k = 64;
    if (i == k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  boolean isUsimDataDownload()
  {
    SmsConstants.MessageClass localMessageClass1 = this.messageClass;
    SmsConstants.MessageClass localMessageClass2 = SmsConstants.MessageClass.CLASS_2;
    int i;
    if (localMessageClass1 == localMessageClass2)
    {
      i = this.mProtocolIdentifier;
      int k = 127;
      if (i != k)
      {
        i = this.mProtocolIdentifier;
        int m = 124;
        if (i != m) {}
      }
      else
      {
        i = 1;
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      localMessageClass1 = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/android/internal/telephony/gsm/SmsMessage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */