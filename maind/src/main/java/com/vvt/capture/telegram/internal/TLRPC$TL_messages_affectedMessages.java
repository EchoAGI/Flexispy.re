package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messages_affectedMessages
  extends TLObject
{
  public static int constructor = -2066640507;
  public int pts;
  public int pts_count;
  
  public static TL_messages_affectedMessages TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    int i = constructor;
    Object localObject;
    if (i != paramInt)
    {
      if (paramBoolean)
      {
        localObject = new java/lang/RuntimeException;
        Object[] arrayOfObject = new Object[1];
        Integer localInteger = Integer.valueOf(paramInt);
        arrayOfObject[0] = localInteger;
        String str = String.format("can't parse magic %x in TL_messages_affectedMessages", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_messages_affectedMessages)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messages_affectedMessages;
      ((TL_messages_affectedMessages)localObject).<init>();
      ((TL_messages_affectedMessages)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.pts = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.pts_count = i;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.pts;
    paramAbstractSerializedData.writeInt32(i);
    i = this.pts_count;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_affectedMessages.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */