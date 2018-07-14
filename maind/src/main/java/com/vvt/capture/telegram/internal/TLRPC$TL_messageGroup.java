package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messageGroup
  extends TLObject
{
  public static int constructor = -399216813;
  public int count;
  public int date;
  public int max_id;
  public int min_id;
  
  public static TL_messageGroup TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_messageGroup", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_messageGroup)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageGroup;
      ((TL_messageGroup)localObject).<init>();
      ((TL_messageGroup)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.min_id = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.max_id = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.count = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.date = i;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.min_id;
    paramAbstractSerializedData.writeInt32(i);
    i = this.max_id;
    paramAbstractSerializedData.writeInt32(i);
    i = this.count;
    paramAbstractSerializedData.writeInt32(i);
    i = this.date;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messageGroup.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */