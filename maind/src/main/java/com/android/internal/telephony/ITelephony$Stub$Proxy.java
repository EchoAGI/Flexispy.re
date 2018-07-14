package com.android.internal.telephony;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.telephony.NeighboringCellInfo;
import java.util.List;

class ITelephony$Stub$Proxy
  implements ITelephony
{
  private IBinder mRemote;
  
  ITelephony$Stub$Proxy(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }
  
  public void answerRingingCall()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.mRemote;
      int i = 6;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public IBinder asBinder()
  {
    return this.mRemote;
  }
  
  public void call(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString);
      localObject1 = this.mRemote;
      int i = 2;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void cancelMissedCallsNotification()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.mRemote;
      int i = 13;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void closeIccLogicalChannel(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeInt(paramInt);
      localObject1 = this.mRemote;
      int i = 42;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void dial(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString);
      localObject1 = this.mRemote;
      int i = 1;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public int disableApnType(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString);
      localObject1 = this.mRemote;
      int i = 22;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      return j;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean disableDataConnectivity()
  {
    boolean bool = false;
    Object localObject1 = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject3);
      localObject3 = this.mRemote;
      int i = 24;
      ((IBinder)localObject3).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      if (j != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void disableLocationUpdates()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.mRemote;
      int i = 20;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public int enableApnType(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString);
      localObject1 = this.mRemote;
      int i = 21;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      return j;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean enableDataConnectivity()
  {
    boolean bool = false;
    Object localObject1 = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject3);
      localObject3 = this.mRemote;
      int i = 23;
      ((IBinder)localObject3).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      if (j != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void enableLocationUpdates()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.mRemote;
      int i = 19;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean endCall()
  {
    boolean bool = false;
    Object localObject1 = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject3);
      localObject3 = this.mRemote;
      int i = 5;
      ((IBinder)localObject3).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      if (j != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public int getActivePhoneType()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.mRemote;
      int i = 31;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      return j;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public int getCallState()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.mRemote;
      int i = 28;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      return j;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public int getCdmaEriIconIndex()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.mRemote;
      int i = 32;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      return j;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public int getCdmaEriIconMode()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.mRemote;
      int i = 33;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      return j;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public String getCdmaEriText()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.mRemote;
      int i = 34;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = localParcel2.readString();
      return (String)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean getCdmaNeedsProvisioning()
  {
    boolean bool = false;
    Object localObject1 = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject3);
      localObject3 = this.mRemote;
      int i = 35;
      ((IBinder)localObject3).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      if (j != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public android.os.Bundle getCellLocation()
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_1
    //   4: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_2
    //   8: ldc 22
    //   10: astore_3
    //   11: aload_1
    //   12: aload_3
    //   13: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   16: aload_0
    //   17: getfield 14	com/android/internal/telephony/ITelephony$Stub$Proxy:mRemote	Landroid/os/IBinder;
    //   20: astore_3
    //   21: bipush 26
    //   23: istore 4
    //   25: aload_3
    //   26: iload 4
    //   28: aload_1
    //   29: aload_2
    //   30: iconst_0
    //   31: invokeinterface 33 5 0
    //   36: pop
    //   37: aload_2
    //   38: invokevirtual 36	android/os/Parcel:readException	()V
    //   41: aload_2
    //   42: invokevirtual 55	android/os/Parcel:readInt	()I
    //   45: istore 5
    //   47: iload 5
    //   49: ifeq +30 -> 79
    //   52: getstatic 78	android/os/Bundle:CREATOR	Landroid/os/Parcelable$Creator;
    //   55: astore_3
    //   56: aload_3
    //   57: aload_2
    //   58: invokeinterface 84 2 0
    //   63: astore_3
    //   64: aload_3
    //   65: checkcast 74	android/os/Bundle
    //   68: astore_3
    //   69: aload_2
    //   70: invokevirtual 39	android/os/Parcel:recycle	()V
    //   73: aload_1
    //   74: invokevirtual 39	android/os/Parcel:recycle	()V
    //   77: aload_3
    //   78: areturn
    //   79: iconst_0
    //   80: istore 5
    //   82: aconst_null
    //   83: astore_3
    //   84: goto -15 -> 69
    //   87: astore_3
    //   88: aload_2
    //   89: invokevirtual 39	android/os/Parcel:recycle	()V
    //   92: aload_1
    //   93: invokevirtual 39	android/os/Parcel:recycle	()V
    //   96: aload_3
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	Proxy
    //   3	90	1	localParcel1	Parcel
    //   7	82	2	localParcel2	Parcel
    //   10	74	3	localObject1	Object
    //   87	10	3	localObject2	Object
    //   23	4	4	i	int
    //   45	36	5	j	int
    // Exception table:
    //   from	to	target	type
    //   12	16	87	finally
    //   16	20	87	finally
    //   30	37	87	finally
    //   37	41	87	finally
    //   41	45	87	finally
    //   52	55	87	finally
    //   57	63	87	finally
    //   64	68	87	finally
  }
  
  public int getDataActivity()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.mRemote;
      int i = 29;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      return j;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public int getDataState()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.mRemote;
      int i = 30;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      return j;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public String getInterfaceDescriptor()
  {
    return "com.android.internal.telephony.ITelephony";
  }
  
  public List getNeighboringCellInfo()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.mRemote;
      int i = 27;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = NeighboringCellInfo.CREATOR;
      localObject1 = localParcel2.createTypedArrayList((Parcelable.Creator)localObject1);
      return (List)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public int getNetworkType()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.mRemote;
      int i = 37;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      return j;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public int getVoiceMessageCount()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.mRemote;
      int i = 36;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      return j;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean handlePinMmi(String paramString)
  {
    boolean bool = false;
    Object localObject1 = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject3);
      localParcel1.writeString(paramString);
      localObject3 = this.mRemote;
      int i = 15;
      ((IBinder)localObject3).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      if (j != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean hasIccCard()
  {
    boolean bool = false;
    Object localObject1 = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject3);
      localObject3 = this.mRemote;
      int i = 38;
      ((IBinder)localObject3).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      if (j != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean isDataConnectivityPossible()
  {
    boolean bool = false;
    Object localObject1 = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject3);
      localObject3 = this.mRemote;
      int i = 25;
      ((IBinder)localObject3).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      if (j != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean isIdle()
  {
    boolean bool = false;
    Object localObject1 = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject3);
      localObject3 = this.mRemote;
      int i = 10;
      ((IBinder)localObject3).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      if (j != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean isOffhook()
  {
    boolean bool = false;
    Object localObject1 = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject3);
      localObject3 = this.mRemote;
      int i = 8;
      ((IBinder)localObject3).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      if (j != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean isRadioOn()
  {
    boolean bool = false;
    Object localObject1 = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject3);
      localObject3 = this.mRemote;
      int i = 11;
      ((IBinder)localObject3).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      if (j != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean isRinging()
  {
    boolean bool = false;
    Object localObject1 = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject3);
      localObject3 = this.mRemote;
      int i = 9;
      ((IBinder)localObject3).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      if (j != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean isSimPinEnabled()
  {
    boolean bool = false;
    Object localObject1 = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject3);
      localObject3 = this.mRemote;
      int i = 12;
      ((IBinder)localObject3).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      if (j != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public int openIccLogicalChannel(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString);
      localObject1 = this.mRemote;
      int i = 41;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      return j;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public boolean setRadio(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   5: astore_3
    //   6: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   9: astore 4
    //   11: ldc 22
    //   13: astore 5
    //   15: aload_3
    //   16: aload 5
    //   18: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   21: iload_1
    //   22: ifeq +64 -> 86
    //   25: iload_2
    //   26: istore 6
    //   28: aload_3
    //   29: iload 6
    //   31: invokevirtual 48	android/os/Parcel:writeInt	(I)V
    //   34: aload_0
    //   35: getfield 14	com/android/internal/telephony/ITelephony$Stub$Proxy:mRemote	Landroid/os/IBinder;
    //   38: astore 5
    //   40: bipush 17
    //   42: istore 7
    //   44: aload 5
    //   46: iload 7
    //   48: aload_3
    //   49: aload 4
    //   51: iconst_0
    //   52: invokeinterface 33 5 0
    //   57: pop
    //   58: aload 4
    //   60: invokevirtual 36	android/os/Parcel:readException	()V
    //   63: aload 4
    //   65: invokevirtual 55	android/os/Parcel:readInt	()I
    //   68: istore 6
    //   70: iload 6
    //   72: ifeq +23 -> 95
    //   75: aload 4
    //   77: invokevirtual 39	android/os/Parcel:recycle	()V
    //   80: aload_3
    //   81: invokevirtual 39	android/os/Parcel:recycle	()V
    //   84: iload_2
    //   85: ireturn
    //   86: iconst_0
    //   87: istore 6
    //   89: aconst_null
    //   90: astore 5
    //   92: goto -64 -> 28
    //   95: iconst_0
    //   96: istore_2
    //   97: aconst_null
    //   98: astore 8
    //   100: goto -25 -> 75
    //   103: astore 8
    //   105: aload 4
    //   107: invokevirtual 39	android/os/Parcel:recycle	()V
    //   110: aload_3
    //   111: invokevirtual 39	android/os/Parcel:recycle	()V
    //   114: aload 8
    //   116: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	117	0	this	Proxy
    //   0	117	1	paramBoolean	boolean
    //   1	96	2	i	int
    //   5	106	3	localParcel1	Parcel
    //   9	97	4	localParcel2	Parcel
    //   13	78	5	localObject1	Object
    //   26	4	6	j	int
    //   68	20	6	k	int
    //   42	5	7	m	int
    //   98	1	8	localObject2	Object
    //   103	12	8	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   16	21	103	finally
    //   29	34	103	finally
    //   34	38	103	finally
    //   51	58	103	finally
    //   58	63	103	finally
    //   63	68	103	finally
  }
  
  public boolean showCallScreen()
  {
    boolean bool = false;
    Object localObject1 = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject3);
      localObject3 = this.mRemote;
      int i = 3;
      ((IBinder)localObject3).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      if (j != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public boolean showCallScreenWithDialpad(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   5: astore_3
    //   6: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   9: astore 4
    //   11: ldc 22
    //   13: astore 5
    //   15: aload_3
    //   16: aload 5
    //   18: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   21: iload_1
    //   22: ifeq +63 -> 85
    //   25: iload_2
    //   26: istore 6
    //   28: aload_3
    //   29: iload 6
    //   31: invokevirtual 48	android/os/Parcel:writeInt	(I)V
    //   34: aload_0
    //   35: getfield 14	com/android/internal/telephony/ITelephony$Stub$Proxy:mRemote	Landroid/os/IBinder;
    //   38: astore 5
    //   40: iconst_4
    //   41: istore 7
    //   43: aload 5
    //   45: iload 7
    //   47: aload_3
    //   48: aload 4
    //   50: iconst_0
    //   51: invokeinterface 33 5 0
    //   56: pop
    //   57: aload 4
    //   59: invokevirtual 36	android/os/Parcel:readException	()V
    //   62: aload 4
    //   64: invokevirtual 55	android/os/Parcel:readInt	()I
    //   67: istore 6
    //   69: iload 6
    //   71: ifeq +23 -> 94
    //   74: aload 4
    //   76: invokevirtual 39	android/os/Parcel:recycle	()V
    //   79: aload_3
    //   80: invokevirtual 39	android/os/Parcel:recycle	()V
    //   83: iload_2
    //   84: ireturn
    //   85: iconst_0
    //   86: istore 6
    //   88: aconst_null
    //   89: astore 5
    //   91: goto -63 -> 28
    //   94: iconst_0
    //   95: istore_2
    //   96: aconst_null
    //   97: astore 8
    //   99: goto -25 -> 74
    //   102: astore 8
    //   104: aload 4
    //   106: invokevirtual 39	android/os/Parcel:recycle	()V
    //   109: aload_3
    //   110: invokevirtual 39	android/os/Parcel:recycle	()V
    //   113: aload 8
    //   115: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	this	Proxy
    //   0	116	1	paramBoolean	boolean
    //   1	95	2	i	int
    //   5	105	3	localParcel1	Parcel
    //   9	96	4	localParcel2	Parcel
    //   13	77	5	localObject1	Object
    //   26	4	6	j	int
    //   67	20	6	k	int
    //   41	5	7	m	int
    //   97	1	8	localObject2	Object
    //   102	12	8	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   16	21	102	finally
    //   29	34	102	finally
    //   34	38	102	finally
    //   50	57	102	finally
    //   57	62	102	finally
    //   62	67	102	finally
  }
  
  public void silenceRinger()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.mRemote;
      int i = 7;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean supplyPin(String paramString)
  {
    boolean bool = false;
    Object localObject1 = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject3);
      localParcel1.writeString(paramString);
      localObject3 = this.mRemote;
      int i = 14;
      ((IBinder)localObject3).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      if (j != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void toggleRadioOnOff()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.mRemote;
      int i = 16;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public String transmitIccAPDU(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeInt(paramInt1);
      localParcel1.writeInt(paramInt2);
      localParcel1.writeInt(paramInt3);
      localParcel1.writeInt(paramInt4);
      localParcel1.writeInt(paramInt5);
      localParcel1.writeString(paramString);
      localObject1 = this.mRemote;
      int i = 40;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = localParcel2.readString();
      return (String)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public String transmitIccLogicalChannel(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeInt(paramInt1);
      localParcel1.writeInt(paramInt2);
      localParcel1.writeInt(paramInt3);
      localParcel1.writeInt(paramInt4);
      localParcel1.writeInt(paramInt5);
      localParcel1.writeInt(paramInt6);
      localParcel1.writeString(paramString);
      localObject1 = this.mRemote;
      int i = 39;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = localParcel2.readString();
      return (String)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void updateServiceLocation()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.android.internal.telephony.ITelephony";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.mRemote;
      int i = 18;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/android/internal/telephony/ITelephony$Stub$Proxy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */