package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_inputPrivacyValueAllowUsers
  extends TLRPC.InputPrivacyRule
{
  public static int constructor = 320652927;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 0;
    String str = null;
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
    int k = 481674261;
    Object localObject;
    if (j != k)
    {
      if (paramBoolean)
      {
        localObject = new java/lang/RuntimeException;
        Object[] arrayOfObject = new Object[1];
        Integer localInteger = Integer.valueOf(j);
        arrayOfObject[0] = localInteger;
        str = String.format("wrong Vector magic, got %x", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
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
        localObject = TLRPC.InputUser.TLdeserialize(paramAbstractSerializedData, k, paramBoolean);
        if (localObject != null) {}
      }
      else
      {
        return;
      }
      ArrayList localArrayList = this.users;
      localArrayList.add(localObject);
      i += 1;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    paramAbstractSerializedData.writeInt32(481674261);
    int j = this.users.size();
    paramAbstractSerializedData.writeInt32(j);
    i = 0;
    TLRPC.InputUser localInputUser = null;
    for (int k = 0; k < j; k = i)
    {
      localInputUser = (TLRPC.InputUser)this.users.get(k);
      localInputUser.serializeToStream(paramAbstractSerializedData);
      i = k + 1;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_inputPrivacyValueAllowUsers.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */