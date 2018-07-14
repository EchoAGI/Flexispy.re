package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_botInlineMessageText
  extends TLRPC.BotInlineMessage
{
  public static int constructor = -1520330839;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 1;
    int j = 0;
    int k = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = k;
    k = this.flags & 0x1;
    if (k != 0) {
      k = i;
    }
    Object localObject2;
    Object localObject3;
    for (;;)
    {
      this.no_webpage = k;
      Object localObject1 = paramAbstractSerializedData.readString(paramBoolean);
      this.message = ((String)localObject1);
      k = this.flags & 0x2;
      if (k == 0) {
        break label173;
      }
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      int m = 481674261;
      if (k == m) {
        break;
      }
      if (!paramBoolean) {
        break label173;
      }
      localObject2 = new java/lang/RuntimeException;
      localObject3 = new Object[i];
      localObject1 = Integer.valueOf(k);
      localObject3[0] = localObject1;
      localObject1 = String.format("wrong Vector magic, got %x", (Object[])localObject3);
      ((RuntimeException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
      k = 0;
      localObject1 = null;
    }
    k = paramAbstractSerializedData.readInt32(paramBoolean);
    for (;;)
    {
      if (j < k)
      {
        i = paramAbstractSerializedData.readInt32(paramBoolean);
        localObject3 = TLRPC.MessageEntity.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
        if (localObject3 != null) {}
      }
      else
      {
        label173:
        return;
      }
      localObject2 = this.entities;
      ((ArrayList)localObject2).add(localObject3);
      j += 1;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool = this.no_webpage;
    if (bool) {}
    for (int j = this.flags | 0x1;; j = this.flags & 0xFFFFFFFE)
    {
      this.flags = j;
      j = this.flags;
      paramAbstractSerializedData.writeInt32(j);
      Object localObject = this.message;
      paramAbstractSerializedData.writeString((String)localObject);
      j = this.flags & 0x2;
      if (j == 0) {
        break;
      }
      paramAbstractSerializedData.writeInt32(481674261);
      int k = this.entities.size();
      paramAbstractSerializedData.writeInt32(k);
      j = 0;
      localObject = null;
      for (int m = 0; m < k; m = j)
      {
        localObject = (TLRPC.MessageEntity)this.entities.get(m);
        ((TLRPC.MessageEntity)localObject).serializeToStream(paramAbstractSerializedData);
        j = m + 1;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_botInlineMessageText.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */