package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messages_messageEmpty
  extends TLObject
{
  public static int constructor = 1062078024;
  
  public static TL_messages_messageEmpty TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_messages_messageEmpty", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_messages_messageEmpty)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messages_messageEmpty;
      ((TL_messages_messageEmpty)localObject).<init>();
      ((TL_messages_messageEmpty)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_messageEmpty.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */