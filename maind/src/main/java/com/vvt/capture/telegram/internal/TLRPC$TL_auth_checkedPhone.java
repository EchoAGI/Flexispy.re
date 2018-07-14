package com.vvt.capture.telegram.internal;

public class TLRPC$TL_auth_checkedPhone
  extends TLObject
{
  public static int constructor = -2128698738;
  public boolean phone_registered;
  
  public static TL_auth_checkedPhone TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_auth_checkedPhone", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_auth_checkedPhone)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_auth_checkedPhone;
      ((TL_auth_checkedPhone)localObject).<init>();
      ((TL_auth_checkedPhone)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    boolean bool = paramAbstractSerializedData.readBool(paramBoolean);
    this.phone_registered = bool;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool = this.phone_registered;
    paramAbstractSerializedData.writeBool(bool);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_auth_checkedPhone.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */