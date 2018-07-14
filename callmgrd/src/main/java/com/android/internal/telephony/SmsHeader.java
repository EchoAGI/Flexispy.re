package com.android.internal.telephony;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class SmsHeader
{
  public static final int ELT_ID_APPLICATION_PORT_ADDRESSING_16_BIT = 5;
  public static final int ELT_ID_APPLICATION_PORT_ADDRESSING_8_BIT = 4;
  public static final int ELT_ID_CHARACTER_SIZE_WVG_OBJECT = 25;
  public static final int ELT_ID_COMPRESSION_CONTROL = 22;
  public static final int ELT_ID_CONCATENATED_16_BIT_REFERENCE = 8;
  public static final int ELT_ID_CONCATENATED_8_BIT_REFERENCE = 0;
  public static final int ELT_ID_ENHANCED_VOICE_MAIL_INFORMATION = 35;
  public static final int ELT_ID_EXTENDED_OBJECT = 20;
  public static final int ELT_ID_EXTENDED_OBJECT_DATA_REQUEST_CMD = 26;
  public static final int ELT_ID_HYPERLINK_FORMAT_ELEMENT = 33;
  public static final int ELT_ID_LARGE_ANIMATION = 14;
  public static final int ELT_ID_LARGE_PICTURE = 16;
  public static final int ELT_ID_NATIONAL_LANGUAGE_LOCKING_SHIFT = 37;
  public static final int ELT_ID_NATIONAL_LANGUAGE_SINGLE_SHIFT = 36;
  public static final int ELT_ID_OBJECT_DISTR_INDICATOR = 23;
  public static final int ELT_ID_PREDEFINED_ANIMATION = 13;
  public static final int ELT_ID_PREDEFINED_SOUND = 11;
  public static final int ELT_ID_REPLY_ADDRESS_ELEMENT = 34;
  public static final int ELT_ID_REUSED_EXTENDED_OBJECT = 21;
  public static final int ELT_ID_RFC_822_EMAIL_HEADER = 32;
  public static final int ELT_ID_SMALL_ANIMATION = 15;
  public static final int ELT_ID_SMALL_PICTURE = 17;
  public static final int ELT_ID_SMSC_CONTROL_PARAMS = 6;
  public static final int ELT_ID_SPECIAL_SMS_MESSAGE_INDICATION = 1;
  public static final int ELT_ID_STANDARD_WVG_OBJECT = 24;
  public static final int ELT_ID_TEXT_FORMATTING = 10;
  public static final int ELT_ID_UDH_SOURCE_INDICATION = 7;
  public static final int ELT_ID_USER_DEFINED_SOUND = 12;
  public static final int ELT_ID_USER_PROMPT_INDICATOR = 19;
  public static final int ELT_ID_VARIABLE_PICTURE = 18;
  public static final int ELT_ID_WIRELESS_CTRL_MSG_PROTOCOL = 9;
  public static final int PORT_WAP_PUSH = 2948;
  public static final int PORT_WAP_WSP = 9200;
  public SmsHeader.ConcatRef concatRef;
  public int languageShiftTable;
  public int languageTable;
  public ArrayList miscEltList;
  public SmsHeader.PortAddrs portAddrs;
  
  public SmsHeader()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.miscEltList = localArrayList;
  }
  
  public static SmsHeader fromByteArray(byte[] paramArrayOfByte)
  {
    boolean bool = true;
    ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
    localByteArrayInputStream.<init>(paramArrayOfByte);
    SmsHeader localSmsHeader = new com/android/internal/telephony/SmsHeader;
    localSmsHeader.<init>();
    for (;;)
    {
      int i = localByteArrayInputStream.available();
      if (i <= 0) {
        break;
      }
      i = localByteArrayInputStream.read();
      int j = localByteArrayInputStream.read();
      Object localObject;
      int k;
      switch (i)
      {
      default: 
        SmsHeader.MiscElt localMiscElt = new com/android/internal/telephony/SmsHeader$MiscElt;
        localMiscElt.<init>();
        localMiscElt.id = i;
        localObject = new byte[j];
        localMiscElt.data = ((byte[])localObject);
        localObject = localMiscElt.data;
        localByteArrayInputStream.read((byte[])localObject, 0, j);
        localObject = localSmsHeader.miscEltList;
        ((ArrayList)localObject).add(localMiscElt);
        break;
      case 0: 
        localObject = new com/android/internal/telephony/SmsHeader$ConcatRef;
        ((SmsHeader.ConcatRef)localObject).<init>();
        j = localByteArrayInputStream.read();
        ((SmsHeader.ConcatRef)localObject).refNumber = j;
        j = localByteArrayInputStream.read();
        ((SmsHeader.ConcatRef)localObject).msgCount = j;
        j = localByteArrayInputStream.read();
        ((SmsHeader.ConcatRef)localObject).seqNumber = j;
        ((SmsHeader.ConcatRef)localObject).isEightBits = bool;
        j = ((SmsHeader.ConcatRef)localObject).msgCount;
        if (j != 0)
        {
          j = ((SmsHeader.ConcatRef)localObject).seqNumber;
          if (j != 0)
          {
            j = ((SmsHeader.ConcatRef)localObject).seqNumber;
            k = ((SmsHeader.ConcatRef)localObject).msgCount;
            if (j <= k) {
              localSmsHeader.concatRef = ((SmsHeader.ConcatRef)localObject);
            }
          }
        }
        break;
      case 8: 
        localObject = new com/android/internal/telephony/SmsHeader$ConcatRef;
        ((SmsHeader.ConcatRef)localObject).<init>();
        j = localByteArrayInputStream.read() << 8;
        k = localByteArrayInputStream.read();
        j |= k;
        ((SmsHeader.ConcatRef)localObject).refNumber = j;
        j = localByteArrayInputStream.read();
        ((SmsHeader.ConcatRef)localObject).msgCount = j;
        j = localByteArrayInputStream.read();
        ((SmsHeader.ConcatRef)localObject).seqNumber = j;
        ((SmsHeader.ConcatRef)localObject).isEightBits = false;
        j = ((SmsHeader.ConcatRef)localObject).msgCount;
        if (j != 0)
        {
          j = ((SmsHeader.ConcatRef)localObject).seqNumber;
          if (j != 0)
          {
            j = ((SmsHeader.ConcatRef)localObject).seqNumber;
            k = ((SmsHeader.ConcatRef)localObject).msgCount;
            if (j <= k) {
              localSmsHeader.concatRef = ((SmsHeader.ConcatRef)localObject);
            }
          }
        }
        break;
      case 4: 
        localObject = new com/android/internal/telephony/SmsHeader$PortAddrs;
        ((SmsHeader.PortAddrs)localObject).<init>();
        j = localByteArrayInputStream.read();
        ((SmsHeader.PortAddrs)localObject).destPort = j;
        j = localByteArrayInputStream.read();
        ((SmsHeader.PortAddrs)localObject).origPort = j;
        ((SmsHeader.PortAddrs)localObject).areEightBits = bool;
        localSmsHeader.portAddrs = ((SmsHeader.PortAddrs)localObject);
        break;
      case 5: 
        localObject = new com/android/internal/telephony/SmsHeader$PortAddrs;
        ((SmsHeader.PortAddrs)localObject).<init>();
        j = localByteArrayInputStream.read() << 8;
        k = localByteArrayInputStream.read();
        j |= k;
        ((SmsHeader.PortAddrs)localObject).destPort = j;
        j = localByteArrayInputStream.read() << 8;
        k = localByteArrayInputStream.read();
        j |= k;
        ((SmsHeader.PortAddrs)localObject).origPort = j;
        ((SmsHeader.PortAddrs)localObject).areEightBits = false;
        localSmsHeader.portAddrs = ((SmsHeader.PortAddrs)localObject);
        break;
      case 36: 
        i = localByteArrayInputStream.read();
        localSmsHeader.languageShiftTable = i;
        break;
      case 37: 
        i = localByteArrayInputStream.read();
        localSmsHeader.languageTable = i;
      }
    }
    return localSmsHeader;
  }
  
  public static byte[] toByteArray(SmsHeader paramSmsHeader)
  {
    int i = 1;
    int j = 4;
    Object localObject = paramSmsHeader.portAddrs;
    int k;
    if (localObject == null)
    {
      localObject = paramSmsHeader.concatRef;
      if (localObject == null)
      {
        localObject = paramSmsHeader.miscEltList;
        boolean bool1 = ((ArrayList)localObject).isEmpty();
        if (bool1)
        {
          k = paramSmsHeader.languageShiftTable;
          if (k == 0)
          {
            k = paramSmsHeader.languageTable;
            if (k == 0) {
              k = 0;
            }
          }
        }
      }
    }
    ByteArrayOutputStream localByteArrayOutputStream;
    for (localObject = null;; localObject = localByteArrayOutputStream.toByteArray())
    {
      return (byte[])localObject;
      localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      k = 140;
      localByteArrayOutputStream.<init>(k);
      localObject = paramSmsHeader.concatRef;
      int i1;
      if (localObject != null)
      {
        boolean bool3 = ((SmsHeader.ConcatRef)localObject).isEightBits;
        if (bool3)
        {
          localByteArrayOutputStream.write(0);
          localByteArrayOutputStream.write(3);
          int n = ((SmsHeader.ConcatRef)localObject).refNumber;
          localByteArrayOutputStream.write(n);
          n = ((SmsHeader.ConcatRef)localObject).msgCount;
          localByteArrayOutputStream.write(n);
          k = ((SmsHeader.ConcatRef)localObject).seqNumber;
          localByteArrayOutputStream.write(k);
        }
      }
      else
      {
        localObject = paramSmsHeader.portAddrs;
        if (localObject != null)
        {
          boolean bool4 = ((SmsHeader.PortAddrs)localObject).areEightBits;
          if (!bool4) {
            break label423;
          }
          localByteArrayOutputStream.write(j);
          localByteArrayOutputStream.write(2);
          i1 = ((SmsHeader.PortAddrs)localObject).destPort;
          localByteArrayOutputStream.write(i1);
          k = ((SmsHeader.PortAddrs)localObject).origPort;
          localByteArrayOutputStream.write(k);
        }
      }
      for (;;)
      {
        k = paramSmsHeader.languageShiftTable;
        if (k != 0)
        {
          localByteArrayOutputStream.write(36);
          localByteArrayOutputStream.write(i);
          k = paramSmsHeader.languageShiftTable;
          localByteArrayOutputStream.write(k);
        }
        k = paramSmsHeader.languageTable;
        if (k != 0)
        {
          localByteArrayOutputStream.write(37);
          localByteArrayOutputStream.write(i);
          k = paramSmsHeader.languageTable;
          localByteArrayOutputStream.write(k);
        }
        localObject = paramSmsHeader.miscEltList;
        Iterator localIterator = ((ArrayList)localObject).iterator();
        for (;;)
        {
          boolean bool2 = localIterator.hasNext();
          if (!bool2) {
            break;
          }
          localObject = (SmsHeader.MiscElt)localIterator.next();
          j = ((SmsHeader.MiscElt)localObject).id;
          localByteArrayOutputStream.write(j);
          j = ((SmsHeader.MiscElt)localObject).data.length;
          localByteArrayOutputStream.write(j);
          byte[] arrayOfByte = ((SmsHeader.MiscElt)localObject).data;
          localObject = ((SmsHeader.MiscElt)localObject).data;
          m = localObject.length;
          localByteArrayOutputStream.write(arrayOfByte, 0, m);
        }
        localByteArrayOutputStream.write(8);
        localByteArrayOutputStream.write(j);
        i1 = ((SmsHeader.ConcatRef)localObject).refNumber >>> 8;
        localByteArrayOutputStream.write(i1);
        i1 = ((SmsHeader.ConcatRef)localObject).refNumber & 0xFF;
        localByteArrayOutputStream.write(i1);
        break;
        label423:
        localByteArrayOutputStream.write(5);
        localByteArrayOutputStream.write(j);
        i1 = ((SmsHeader.PortAddrs)localObject).destPort >>> 8;
        localByteArrayOutputStream.write(i1);
        i1 = ((SmsHeader.PortAddrs)localObject).destPort & 0xFF;
        localByteArrayOutputStream.write(i1);
        i1 = ((SmsHeader.PortAddrs)localObject).origPort >>> 8;
        localByteArrayOutputStream.write(i1);
        int m = ((SmsHeader.PortAddrs)localObject).origPort & 0xFF;
        localByteArrayOutputStream.write(m);
      }
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("UserDataHeader ");
    localStringBuilder.append("{ ConcatRef ");
    Object localObject1 = this.concatRef;
    if (localObject1 == null)
    {
      localObject1 = "unset";
      localStringBuilder.append((String)localObject1);
      localStringBuilder.append(", PortAddrs ");
      localObject1 = this.portAddrs;
      if (localObject1 != null) {
        break label483;
      }
      localObject1 = "unset";
      localStringBuilder.append((String)localObject1);
    }
    for (;;)
    {
      int i = this.languageShiftTable;
      if (i != 0)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject2 = ", languageShiftTable=";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
        k = this.languageShiftTable;
        localObject1 = k;
        localStringBuilder.append((String)localObject1);
      }
      i = this.languageTable;
      if (i != 0)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject2 = ", languageTable=";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
        k = this.languageTable;
        localObject1 = k;
        localStringBuilder.append((String)localObject1);
      }
      localObject1 = this.miscEltList;
      Object localObject2 = ((ArrayList)localObject1).iterator();
      for (;;)
      {
        boolean bool1 = ((Iterator)localObject2).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (SmsHeader.MiscElt)((Iterator)localObject2).next();
        localStringBuilder.append(", MiscElt ");
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("{ id=");
        int n = ((SmsHeader.MiscElt)localObject1).id;
        localObject3 = n;
        localStringBuilder.append((String)localObject3);
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        String str = ", length=";
        localObject3 = ((StringBuilder)localObject3).append(str);
        int j = ((SmsHeader.MiscElt)localObject1).data.length;
        localObject1 = j;
        localStringBuilder.append((String)localObject1);
        localObject1 = " }";
        localStringBuilder.append((String)localObject1);
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("{ refNumber=");
      int k = this.concatRef.refNumber;
      localObject1 = k;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(", msgCount=");
      k = this.concatRef.msgCount;
      localObject1 = k;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(", seqNumber=");
      k = this.concatRef.seqNumber;
      localObject1 = k;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(", isEightBits=");
      localObject2 = this.concatRef;
      boolean bool2 = ((SmsHeader.ConcatRef)localObject2).isEightBits;
      localObject1 = bool2;
      localStringBuilder.append((String)localObject1);
      localObject1 = " }";
      localStringBuilder.append((String)localObject1);
      break;
      label483:
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("{ destPort=");
      int m = this.portAddrs.destPort;
      localObject1 = m;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(", origPort=");
      m = this.portAddrs.origPort;
      localObject1 = m;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(", areEightBits=");
      localObject2 = this.portAddrs;
      boolean bool3 = ((SmsHeader.PortAddrs)localObject2).areEightBits;
      localObject1 = bool3;
      localStringBuilder.append((String)localObject1);
      localObject1 = " }";
      localStringBuilder.append((String)localObject1);
    }
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/android/internal/telephony/SmsHeader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */