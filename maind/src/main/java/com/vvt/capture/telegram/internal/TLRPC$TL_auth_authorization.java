package com.vvt.capture.telegram.internal;

public class TLRPC$TL_auth_authorization
  extends TLObject
{
  public static int constructor = -16553231;
  public TLRPC.User user;
  
  public static TL_auth_authorization TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_auth_authorization", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_auth_authorization)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_auth_authorization;
      ((TL_auth_authorization)localObject).<init>();
      ((TL_auth_authorization)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.User localUser = TLRPC.User.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.user = localUser;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.user.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_auth_authorization.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */