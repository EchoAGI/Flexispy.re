package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_messageActionChatCreate
  extends TLRPC.MessageAction
{
  public static int constructor = -1503425638;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 0;
    String str = null;
    Object localObject1 = paramAbstractSerializedData.readString(paramBoolean);
    this.title = ((String)localObject1);
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
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
    else
    {
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      while (i < j)
      {
        localObject2 = this.users;
        int m = paramAbstractSerializedData.readInt32(paramBoolean);
        Integer localInteger = Integer.valueOf(m);
        ((ArrayList)localObject2).add(localInteger);
        i += 1;
      }
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    Object localObject = this.title;
    paramAbstractSerializedData.writeString((String)localObject);
    paramAbstractSerializedData.writeInt32(481674261);
    int j = this.users.size();
    paramAbstractSerializedData.writeInt32(j);
    i = 0;
    localObject = null;
    for (int k = 0; k < j; k = i)
    {
      localObject = (Integer)this.users.get(k);
      i = ((Integer)localObject).intValue();
      paramAbstractSerializedData.writeInt32(i);
      i = k + 1;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messageActionChatCreate.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */