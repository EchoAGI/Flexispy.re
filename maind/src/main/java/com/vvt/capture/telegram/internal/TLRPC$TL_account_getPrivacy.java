package com.vvt.capture.telegram.internal;

public class TLRPC$TL_account_getPrivacy
  extends TLObject
{
  public static int constructor = -623130288;
  public TLRPC.TL_inputPrivacyKeyStatusTimestamp key;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.TL_account_privacyRules.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.key.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_account_getPrivacy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */