package com.vvt.capture.telegram.internal;

public class TLRPC$TL_error
  extends TLObject
{
  public static int constructor = -994444869;
  public int code;
  public String text;
  
  public static TL_error TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_error", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_error)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_error;
      ((TL_error)localObject).<init>();
      ((TL_error)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.code = i;
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.text = str;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.code;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.text;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_error.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */