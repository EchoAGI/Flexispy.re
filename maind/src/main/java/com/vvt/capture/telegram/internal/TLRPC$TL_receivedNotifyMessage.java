package com.vvt.capture.telegram.internal;

public class TLRPC$TL_receivedNotifyMessage
  extends TLObject
{
  public static int constructor = -1551583367;
  public int flags;
  public int id;
  
  public static TL_receivedNotifyMessage TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_receivedNotifyMessage", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_receivedNotifyMessage)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_receivedNotifyMessage;
      ((TL_receivedNotifyMessage)localObject).<init>();
      ((TL_receivedNotifyMessage)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.id = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = i;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.id;
    paramAbstractSerializedData.writeInt32(i);
    i = this.flags;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_receivedNotifyMessage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */