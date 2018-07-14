package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messageRange
  extends TLObject
{
  public static int constructor = 182649427;
  public int max_id;
  public int min_id;
  
  public static TL_messageRange TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_messageRange", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_messageRange)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageRange;
      ((TL_messageRange)localObject).<init>();
      ((TL_messageRange)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.min_id = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.max_id = i;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.min_id;
    paramAbstractSerializedData.writeInt32(i);
    i = this.max_id;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messageRange.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */