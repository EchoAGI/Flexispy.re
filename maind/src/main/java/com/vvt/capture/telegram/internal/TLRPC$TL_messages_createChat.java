package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_messages_createChat
  extends TLObject
{
  public static int constructor = 164303470;
  public String title;
  public ArrayList users;
  
  public TLRPC$TL_messages_createChat()
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
    paramAbstractSerializedData.writeInt32(481674261);
    int j = this.users.size();
    paramAbstractSerializedData.writeInt32(j);
    i = 0;
    Object localObject = null;
    for (int k = 0; k < j; k = i)
    {
      localObject = (TLRPC.InputUser)this.users.get(k);
      ((TLRPC.InputUser)localObject).serializeToStream(paramAbstractSerializedData);
      i = k + 1;
    }
    localObject = this.title;
    paramAbstractSerializedData.writeString((String)localObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_createChat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */