package com.vvt.capture.telegram.internal;

public class TLRPC$TL_contactStatus
  extends TLObject
{
  public static int constructor = -748155807;
  public TLRPC.UserStatus status;
  public int user_id;
  
  public static TL_contactStatus TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    int i = constructor;
    Object localObject;
    if (i != paramInt)
    {
      if (paramBoolean)
      {
        localObject = new java/lang/RuntimeException;
        Object[] arrayOfObject = new Object[1];
        Integer localInteger = Integer.valueOf(paramInt);
        arrayOfObject[0] = localInteger;
        String str = String.format("can't parse magic %x in TL_contactStatus", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_contactStatus)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_contactStatus;
      ((TL_contactStatus)localObject).<init>();
      ((TL_contactStatus)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.user_id = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.UserStatus localUserStatus = TLRPC.UserStatus.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.status = localUserStatus;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.user_id;
    paramAbstractSerializedData.writeInt32(i);
    this.status.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_contactStatus.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */