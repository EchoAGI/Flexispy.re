package com.vvt.capture.telegram.internal;

public class TLRPC$auth_SentCode
  extends TLObject
{
  public boolean is_password;
  public String phone_code_hash;
  public boolean phone_registered;
  public int send_call_timeout;
  
  public static auth_SentCode TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in auth_SentCode", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_auth_sentAppCode;
      ((TLRPC.TL_auth_sentAppCode)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_auth_sentCode;
      ((TLRPC.TL_auth_sentCode)localObject).<init>();
    }
    if (localObject != null) {
      ((auth_SentCode)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (auth_SentCode)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$auth_SentCode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */