package com.vvt.capture.telegram.internal;

public class TLRPC$UserStatus
  extends TLObject
{
  public int expires;
  
  public static UserStatus TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    Object localObject = null;
    switch (paramInt)
    {
    }
    while ((localObject == null) && (paramBoolean))
    {
      localObject = new java/lang/RuntimeException;
      Object[] arrayOfObject = new Object[1];
      Integer localInteger = Integer.valueOf(paramInt);
      arrayOfObject[0] = localInteger;
      String str = String.format("can't parse magic %x in UserStatus", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_userStatusOffline;
      ((TLRPC.TL_userStatusOffline)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_userStatusLastWeek;
      ((TLRPC.TL_userStatusLastWeek)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_userStatusEmpty;
      ((TLRPC.TL_userStatusEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_userStatusLastMonth;
      ((TLRPC.TL_userStatusLastMonth)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_userStatusOnline;
      ((TLRPC.TL_userStatusOnline)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_userStatusRecently;
      ((TLRPC.TL_userStatusRecently)localObject).<init>();
    }
    if (localObject != null) {
      ((UserStatus)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (UserStatus)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$UserStatus.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */