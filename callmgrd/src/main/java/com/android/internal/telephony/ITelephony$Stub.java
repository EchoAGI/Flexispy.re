package com.android.internal.telephony;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

public abstract class ITelephony$Stub
  extends Binder
  implements ITelephony
{
  private static final String DESCRIPTOR = "com.android.internal.telephony.ITelephony";
  static final int TRANSACTION_answerRingingCall = 6;
  static final int TRANSACTION_call = 2;
  static final int TRANSACTION_cancelMissedCallsNotification = 13;
  static final int TRANSACTION_closeIccLogicalChannel = 42;
  static final int TRANSACTION_dial = 1;
  static final int TRANSACTION_disableApnType = 22;
  static final int TRANSACTION_disableDataConnectivity = 24;
  static final int TRANSACTION_disableLocationUpdates = 20;
  static final int TRANSACTION_enableApnType = 21;
  static final int TRANSACTION_enableDataConnectivity = 23;
  static final int TRANSACTION_enableLocationUpdates = 19;
  static final int TRANSACTION_endCall = 5;
  static final int TRANSACTION_getActivePhoneType = 31;
  static final int TRANSACTION_getCallState = 28;
  static final int TRANSACTION_getCdmaEriIconIndex = 32;
  static final int TRANSACTION_getCdmaEriIconMode = 33;
  static final int TRANSACTION_getCdmaEriText = 34;
  static final int TRANSACTION_getCdmaNeedsProvisioning = 35;
  static final int TRANSACTION_getCellLocation = 26;
  static final int TRANSACTION_getDataActivity = 29;
  static final int TRANSACTION_getDataState = 30;
  static final int TRANSACTION_getNeighboringCellInfo = 27;
  static final int TRANSACTION_getNetworkType = 37;
  static final int TRANSACTION_getVoiceMessageCount = 36;
  static final int TRANSACTION_handlePinMmi = 15;
  static final int TRANSACTION_hasIccCard = 38;
  static final int TRANSACTION_isDataConnectivityPossible = 25;
  static final int TRANSACTION_isIdle = 10;
  static final int TRANSACTION_isOffhook = 8;
  static final int TRANSACTION_isRadioOn = 11;
  static final int TRANSACTION_isRinging = 9;
  static final int TRANSACTION_isSimPinEnabled = 12;
  static final int TRANSACTION_openIccLogicalChannel = 41;
  static final int TRANSACTION_setRadio = 17;
  static final int TRANSACTION_showCallScreen = 3;
  static final int TRANSACTION_showCallScreenWithDialpad = 4;
  static final int TRANSACTION_silenceRinger = 7;
  static final int TRANSACTION_supplyPin = 14;
  static final int TRANSACTION_toggleRadioOnOff = 16;
  static final int TRANSACTION_transmitIccAPDU = 40;
  static final int TRANSACTION_transmitIccLogicalChannel = 39;
  static final int TRANSACTION_updateServiceLocation = 18;
  
  public ITelephony$Stub()
  {
    attachInterface(this, "com.android.internal.telephony.ITelephony");
  }
  
  public static ITelephony asInterface(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (ITelephony)localObject;
      localObject = paramIBinder.queryLocalInterface("com.android.internal.telephony.ITelephony");
      if (localObject != null)
      {
        boolean bool = localObject instanceof ITelephony;
        if (bool)
        {
          localObject = (ITelephony)localObject;
          continue;
        }
      }
      localObject = new com/android/internal/telephony/ITelephony$Stub$Proxy;
      ((ITelephony.Stub.Proxy)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    Object localObject1 = null;
    int j = 1;
    switch (paramInt1)
    {
    default: 
      j = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return j;
      localObject1 = "com.android.internal.telephony.ITelephony";
      paramParcel2.writeString((String)localObject1);
      continue;
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      localObject1 = paramParcel1.readString();
      dial((String)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      localObject1 = paramParcel1.readString();
      call((String)localObject1);
      paramParcel2.writeNoException();
      continue;
      Object localObject2 = "com.android.internal.telephony.ITelephony";
      paramParcel1.enforceInterface((String)localObject2);
      boolean bool1 = showCallScreen();
      paramParcel2.writeNoException();
      if (bool1) {
        i = j;
      }
      paramParcel2.writeInt(i);
      continue;
      localObject2 = "com.android.internal.telephony.ITelephony";
      paramParcel1.enforceInterface((String)localObject2);
      int k = paramParcel1.readInt();
      if (k != 0) {
        k = j;
      }
      for (;;)
      {
        bool2 = showCallScreenWithDialpad(k);
        paramParcel2.writeNoException();
        if (bool2) {
          i = j;
        }
        paramParcel2.writeInt(i);
        break;
        bool2 = false;
        localObject2 = null;
      }
      localObject2 = "com.android.internal.telephony.ITelephony";
      paramParcel1.enforceInterface((String)localObject2);
      boolean bool2 = endCall();
      paramParcel2.writeNoException();
      if (bool2) {
        i = j;
      }
      paramParcel2.writeInt(i);
      continue;
      localObject1 = "com.android.internal.telephony.ITelephony";
      paramParcel1.enforceInterface((String)localObject1);
      answerRingingCall();
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.android.internal.telephony.ITelephony";
      paramParcel1.enforceInterface((String)localObject1);
      silenceRinger();
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.android.internal.telephony.ITelephony";
      paramParcel1.enforceInterface((String)localObject2);
      bool2 = isOffhook();
      paramParcel2.writeNoException();
      if (bool2) {
        i = j;
      }
      paramParcel2.writeInt(i);
      continue;
      localObject2 = "com.android.internal.telephony.ITelephony";
      paramParcel1.enforceInterface((String)localObject2);
      bool2 = isRinging();
      paramParcel2.writeNoException();
      if (bool2) {
        i = j;
      }
      paramParcel2.writeInt(i);
      continue;
      localObject2 = "com.android.internal.telephony.ITelephony";
      paramParcel1.enforceInterface((String)localObject2);
      bool2 = isIdle();
      paramParcel2.writeNoException();
      if (bool2) {
        i = j;
      }
      paramParcel2.writeInt(i);
      continue;
      localObject2 = "com.android.internal.telephony.ITelephony";
      paramParcel1.enforceInterface((String)localObject2);
      bool2 = isRadioOn();
      paramParcel2.writeNoException();
      if (bool2) {
        i = j;
      }
      paramParcel2.writeInt(i);
      continue;
      localObject2 = "com.android.internal.telephony.ITelephony";
      paramParcel1.enforceInterface((String)localObject2);
      bool2 = isSimPinEnabled();
      paramParcel2.writeNoException();
      if (bool2) {
        i = j;
      }
      paramParcel2.writeInt(i);
      continue;
      localObject1 = "com.android.internal.telephony.ITelephony";
      paramParcel1.enforceInterface((String)localObject1);
      cancelMissedCallsNotification();
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      localObject2 = paramParcel1.readString();
      bool2 = supplyPin((String)localObject2);
      paramParcel2.writeNoException();
      if (bool2) {
        i = j;
      }
      paramParcel2.writeInt(i);
      continue;
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      localObject2 = paramParcel1.readString();
      bool2 = handlePinMmi((String)localObject2);
      paramParcel2.writeNoException();
      if (bool2) {
        i = j;
      }
      paramParcel2.writeInt(i);
      continue;
      localObject1 = "com.android.internal.telephony.ITelephony";
      paramParcel1.enforceInterface((String)localObject1);
      toggleRadioOnOff();
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.android.internal.telephony.ITelephony";
      paramParcel1.enforceInterface((String)localObject2);
      int m = paramParcel1.readInt();
      if (m != 0) {
        m = j;
      }
      for (;;)
      {
        bool3 = setRadio(m);
        paramParcel2.writeNoException();
        if (bool3) {
          i = j;
        }
        paramParcel2.writeInt(i);
        break;
        bool3 = false;
        localObject2 = null;
      }
      localObject1 = "com.android.internal.telephony.ITelephony";
      paramParcel1.enforceInterface((String)localObject1);
      updateServiceLocation();
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.android.internal.telephony.ITelephony";
      paramParcel1.enforceInterface((String)localObject1);
      enableLocationUpdates();
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.android.internal.telephony.ITelephony";
      paramParcel1.enforceInterface((String)localObject1);
      disableLocationUpdates();
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      localObject1 = paramParcel1.readString();
      i = enableApnType((String)localObject1);
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i);
      continue;
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      localObject1 = paramParcel1.readString();
      i = disableApnType((String)localObject1);
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i);
      continue;
      localObject2 = "com.android.internal.telephony.ITelephony";
      paramParcel1.enforceInterface((String)localObject2);
      boolean bool3 = enableDataConnectivity();
      paramParcel2.writeNoException();
      if (bool3) {
        i = j;
      }
      paramParcel2.writeInt(i);
      continue;
      localObject2 = "com.android.internal.telephony.ITelephony";
      paramParcel1.enforceInterface((String)localObject2);
      bool3 = disableDataConnectivity();
      paramParcel2.writeNoException();
      if (bool3) {
        i = j;
      }
      paramParcel2.writeInt(i);
      continue;
      localObject2 = "com.android.internal.telephony.ITelephony";
      paramParcel1.enforceInterface((String)localObject2);
      bool3 = isDataConnectivityPossible();
      paramParcel2.writeNoException();
      if (bool3) {
        i = j;
      }
      paramParcel2.writeInt(i);
      continue;
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      localObject2 = getCellLocation();
      paramParcel2.writeNoException();
      if (localObject2 != null)
      {
        paramParcel2.writeInt(j);
        ((Bundle)localObject2).writeToParcel(paramParcel2, j);
      }
      else
      {
        paramParcel2.writeInt(0);
        continue;
        paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
        localObject1 = getNeighboringCellInfo();
        paramParcel2.writeNoException();
        paramParcel2.writeTypedList((List)localObject1);
        continue;
        localObject1 = "com.android.internal.telephony.ITelephony";
        paramParcel1.enforceInterface((String)localObject1);
        i = getCallState();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(i);
        continue;
        localObject1 = "com.android.internal.telephony.ITelephony";
        paramParcel1.enforceInterface((String)localObject1);
        i = getDataActivity();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(i);
        continue;
        localObject1 = "com.android.internal.telephony.ITelephony";
        paramParcel1.enforceInterface((String)localObject1);
        i = getDataState();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(i);
        continue;
        localObject1 = "com.android.internal.telephony.ITelephony";
        paramParcel1.enforceInterface((String)localObject1);
        i = getActivePhoneType();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(i);
        continue;
        localObject1 = "com.android.internal.telephony.ITelephony";
        paramParcel1.enforceInterface((String)localObject1);
        i = getCdmaEriIconIndex();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(i);
        continue;
        localObject1 = "com.android.internal.telephony.ITelephony";
        paramParcel1.enforceInterface((String)localObject1);
        i = getCdmaEriIconMode();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(i);
        continue;
        paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
        localObject1 = getCdmaEriText();
        paramParcel2.writeNoException();
        paramParcel2.writeString((String)localObject1);
        continue;
        localObject2 = "com.android.internal.telephony.ITelephony";
        paramParcel1.enforceInterface((String)localObject2);
        bool3 = getCdmaNeedsProvisioning();
        paramParcel2.writeNoException();
        if (bool3) {
          i = j;
        }
        paramParcel2.writeInt(i);
        continue;
        localObject1 = "com.android.internal.telephony.ITelephony";
        paramParcel1.enforceInterface((String)localObject1);
        i = getVoiceMessageCount();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(i);
        continue;
        localObject1 = "com.android.internal.telephony.ITelephony";
        paramParcel1.enforceInterface((String)localObject1);
        i = getNetworkType();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(i);
        continue;
        localObject2 = "com.android.internal.telephony.ITelephony";
        paramParcel1.enforceInterface((String)localObject2);
        bool3 = hasIccCard();
        paramParcel2.writeNoException();
        if (bool3) {
          i = j;
        }
        paramParcel2.writeInt(i);
        continue;
        paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
        int n = paramParcel1.readInt();
        int i1 = paramParcel1.readInt();
        int i2 = paramParcel1.readInt();
        int i3 = paramParcel1.readInt();
        int i4 = paramParcel1.readInt();
        int i5 = paramParcel1.readInt();
        String str1 = paramParcel1.readString();
        localObject1 = this;
        localObject1 = transmitIccLogicalChannel(n, i1, i2, i3, i4, i5, str1);
        paramParcel2.writeNoException();
        paramParcel2.writeString((String)localObject1);
        continue;
        paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
        n = paramParcel1.readInt();
        i1 = paramParcel1.readInt();
        i2 = paramParcel1.readInt();
        i3 = paramParcel1.readInt();
        i4 = paramParcel1.readInt();
        String str2 = paramParcel1.readString();
        localObject1 = this;
        localObject1 = transmitIccAPDU(n, i1, i2, i3, i4, str2);
        paramParcel2.writeNoException();
        paramParcel2.writeString((String)localObject1);
        continue;
        paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
        localObject1 = paramParcel1.readString();
        i = openIccLogicalChannel((String)localObject1);
        paramParcel2.writeNoException();
        paramParcel2.writeInt(i);
        continue;
        localObject1 = "com.android.internal.telephony.ITelephony";
        paramParcel1.enforceInterface((String)localObject1);
        i = paramParcel1.readInt();
        closeIccLogicalChannel(i);
        paramParcel2.writeNoException();
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/android/internal/telephony/ITelephony$Stub.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */