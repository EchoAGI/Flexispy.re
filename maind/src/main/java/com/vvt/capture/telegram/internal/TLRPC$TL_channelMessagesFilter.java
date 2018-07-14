package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_channelMessagesFilter
  extends TLRPC.ChannelMessagesFilter
{
  public static int constructor = -847783593;
  
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
      this.important_only = k;
      k = this.flags & 0x2;
      if (k == 0) {
        break label136;
      }
      k = i;
    }
    Object localObject1;
    Object localObject2;
    for (;;)
    {
      this.exclude_new_messages = k;
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      int m = 481674261;
      if (k == m) {
        break label145;
      }
      if (!paramBoolean) {
        break label178;
      }
      localObject1 = new java/lang/RuntimeException;
      localObject2 = new Object[i];
      Object localObject3 = Integer.valueOf(k);
      localObject2[0] = localObject3;
      localObject3 = String.format("wrong Vector magic, got %x", (Object[])localObject2);
      ((RuntimeException)localObject1).<init>((String)localObject3);
      throw ((Throwable)localObject1);
      k = 0;
      localObject3 = null;
      break;
      label136:
      k = 0;
      localObject3 = null;
    }
    label145:
    k = paramAbstractSerializedData.readInt32(paramBoolean);
    for (;;)
    {
      if (j < k)
      {
        i = paramAbstractSerializedData.readInt32(paramBoolean);
        localObject2 = TLRPC.TL_messageRange.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
        if (localObject2 != null) {}
      }
      else
      {
        label178:
        return;
      }
      localObject1 = this.ranges;
      ((ArrayList)localObject1).add(localObject2);
      j += 1;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool1 = this.important_only;
    if (bool1)
    {
      int j = this.flags | 0x1;
      this.flags = j;
      boolean bool2 = this.exclude_new_messages;
      if (!bool2) {
        break label136;
      }
    }
    label136:
    for (int k = this.flags | 0x2;; k = this.flags & 0xFFFFFFFD)
    {
      this.flags = k;
      k = this.flags;
      paramAbstractSerializedData.writeInt32(k);
      paramAbstractSerializedData.writeInt32(481674261);
      int m = this.ranges.size();
      paramAbstractSerializedData.writeInt32(m);
      k = 0;
      TLRPC.TL_messageRange localTL_messageRange = null;
      for (int n = 0; n < m; n = k)
      {
        localTL_messageRange = (TLRPC.TL_messageRange)this.ranges.get(n);
        localTL_messageRange.serializeToStream(paramAbstractSerializedData);
        k = n + 1;
      }
      k = this.flags & 0xFFFFFFFE;
      break;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_channelMessagesFilter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */