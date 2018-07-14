package com.vvt.capture.telegram.internal;

public class TLRPC$TL_updates_state
  extends TLObject
{
  public static int constructor = -1519637954;
  public int date;
  public int pts;
  public int qts;
  public int seq;
  public int unread_count;
  
  public static TL_updates_state TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_updates_state", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_updates_state)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updates_state;
      ((TL_updates_state)localObject).<init>();
      ((TL_updates_state)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.pts = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.qts = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.date = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.seq = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.unread_count = i;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.pts;
    paramAbstractSerializedData.writeInt32(i);
    i = this.qts;
    paramAbstractSerializedData.writeInt32(i);
    i = this.date;
    paramAbstractSerializedData.writeInt32(i);
    i = this.seq;
    paramAbstractSerializedData.writeInt32(i);
    i = this.unread_count;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_updates_state.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */