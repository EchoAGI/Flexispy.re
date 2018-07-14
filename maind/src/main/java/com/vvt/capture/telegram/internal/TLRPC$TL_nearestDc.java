package com.vvt.capture.telegram.internal;

public class TLRPC$TL_nearestDc
  extends TLObject
{
  public static int constructor = -1910892683;
  public String country;
  public int nearest_dc;
  public int this_dc;
  
  public static TL_nearestDc TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_nearestDc", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_nearestDc)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_nearestDc;
      ((TL_nearestDc)localObject).<init>();
      ((TL_nearestDc)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.country = str;
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.this_dc = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.nearest_dc = i;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.country;
    paramAbstractSerializedData.writeString(str);
    i = this.this_dc;
    paramAbstractSerializedData.writeInt32(i);
    i = this.nearest_dc;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_nearestDc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */