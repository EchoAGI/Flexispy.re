package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_updateShortSentMessage
  extends TLRPC.Updates
{
  public static int constructor = 301019932;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 1;
    int j = 0;
    int k = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = k;
    k = this.flags & 0x1;
    if (k != 0)
    {
      k = i;
      this.unread = k;
      k = this.flags & 0x2;
      if (k == 0) {
        break label240;
      }
      k = i;
    }
    Object localObject2;
    Object localObject3;
    for (;;)
    {
      this.out = k;
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      this.id = k;
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      this.pts = k;
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      this.pts_count = k;
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      this.date = k;
      k = this.flags & 0x200;
      if (k != 0)
      {
        k = paramAbstractSerializedData.readInt32(paramBoolean);
        localObject1 = TLRPC.MessageMedia.TLdeserialize(paramAbstractSerializedData, k, paramBoolean);
        this.media = ((TLRPC.MessageMedia)localObject1);
      }
      k = this.flags & 0x80;
      if (k == 0) {
        break label282;
      }
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      int m = 481674261;
      if (k == m) {
        break label249;
      }
      if (!paramBoolean) {
        break label282;
      }
      localObject2 = new java/lang/RuntimeException;
      localObject3 = new Object[i];
      Object localObject1 = Integer.valueOf(k);
      localObject3[0] = localObject1;
      localObject1 = String.format("wrong Vector magic, got %x", (Object[])localObject3);
      ((RuntimeException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
      k = 0;
      localObject1 = null;
      break;
      label240:
      k = 0;
      localObject1 = null;
    }
    label249:
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
        label282:
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
    boolean bool1 = this.unread;
    if (bool1)
    {
      int j = this.flags | 0x1;
      this.flags = j;
      boolean bool2 = this.out;
      if (!bool2) {
        break label212;
      }
    }
    label212:
    for (int k = this.flags | 0x2;; k = this.flags & 0xFFFFFFFD)
    {
      this.flags = k;
      k = this.flags;
      paramAbstractSerializedData.writeInt32(k);
      k = this.id;
      paramAbstractSerializedData.writeInt32(k);
      k = this.pts;
      paramAbstractSerializedData.writeInt32(k);
      k = this.pts_count;
      paramAbstractSerializedData.writeInt32(k);
      k = this.date;
      paramAbstractSerializedData.writeInt32(k);
      k = this.flags & 0x200;
      if (k != 0)
      {
        localObject = this.media;
        ((TLRPC.MessageMedia)localObject).serializeToStream(paramAbstractSerializedData);
      }
      k = this.flags & 0x80;
      if (k == 0) {
        return;
      }
      paramAbstractSerializedData.writeInt32(481674261);
      int m = this.entities.size();
      paramAbstractSerializedData.writeInt32(m);
      k = 0;
      Object localObject = null;
      for (int n = 0; n < m; n = k)
      {
        localObject = (TLRPC.MessageEntity)this.entities.get(n);
        ((TLRPC.MessageEntity)localObject).serializeToStream(paramAbstractSerializedData);
        k = n + 1;
      }
      k = this.flags & 0xFFFFFFFE;
      break;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_updateShortSentMessage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */