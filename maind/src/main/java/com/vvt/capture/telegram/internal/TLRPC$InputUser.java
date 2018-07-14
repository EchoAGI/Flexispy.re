package com.vvt.capture.telegram.internal;

public class TLRPC$InputUser
  extends TLObject
{
  public long access_hash;
  public int user_id;
  
  public static InputUser TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in InputUser", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputUserEmpty;
      ((TLRPC.TL_inputUserEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputUserSelf;
      ((TLRPC.TL_inputUserSelf)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputUser;
      ((TLRPC.TL_inputUser)localObject).<init>();
    }
    if (localObject != null) {
      ((InputUser)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (InputUser)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$InputUser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */