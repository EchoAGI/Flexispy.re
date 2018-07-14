package com.android.internal.telephony;

import android.os.Bundle;
import android.os.IInterface;
import java.util.List;

public abstract interface ITelephony
  extends IInterface
{
  public abstract void answerRingingCall();
  
  public abstract void call(String paramString);
  
  public abstract void cancelMissedCallsNotification();
  
  public abstract void closeIccLogicalChannel(int paramInt);
  
  public abstract void dial(String paramString);
  
  public abstract int disableApnType(String paramString);
  
  public abstract boolean disableDataConnectivity();
  
  public abstract void disableLocationUpdates();
  
  public abstract int enableApnType(String paramString);
  
  public abstract boolean enableDataConnectivity();
  
  public abstract void enableLocationUpdates();
  
  public abstract boolean endCall();
  
  public abstract int getActivePhoneType();
  
  public abstract int getCallState();
  
  public abstract int getCdmaEriIconIndex();
  
  public abstract int getCdmaEriIconMode();
  
  public abstract String getCdmaEriText();
  
  public abstract boolean getCdmaNeedsProvisioning();
  
  public abstract Bundle getCellLocation();
  
  public abstract int getDataActivity();
  
  public abstract int getDataState();
  
  public abstract List getNeighboringCellInfo();
  
  public abstract int getNetworkType();
  
  public abstract int getVoiceMessageCount();
  
  public abstract boolean handlePinMmi(String paramString);
  
  public abstract boolean hasIccCard();
  
  public abstract boolean isDataConnectivityPossible();
  
  public abstract boolean isIdle();
  
  public abstract boolean isOffhook();
  
  public abstract boolean isRadioOn();
  
  public abstract boolean isRinging();
  
  public abstract boolean isSimPinEnabled();
  
  public abstract int openIccLogicalChannel(String paramString);
  
  public abstract boolean setRadio(boolean paramBoolean);
  
  public abstract boolean showCallScreen();
  
  public abstract boolean showCallScreenWithDialpad(boolean paramBoolean);
  
  public abstract void silenceRinger();
  
  public abstract boolean supplyPin(String paramString);
  
  public abstract void toggleRadioOnOff();
  
  public abstract String transmitIccAPDU(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString);
  
  public abstract String transmitIccLogicalChannel(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, String paramString);
  
  public abstract void updateServiceLocation();
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/android/internal/telephony/ITelephony.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */