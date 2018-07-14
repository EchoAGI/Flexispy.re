package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_channels_inviteToChannel
  extends TLObject
{
  public static int constructor = 429865580;
  public TLRPC.InputChannel channel;
  public ArrayList users;
  
  public TLRPC$TL_channels_inviteToChannel()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.users = localArrayList;
  }
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.Updates.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.channel.serializeToStream(paramAbstractSerializedData);
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_channels_inviteToChannel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */