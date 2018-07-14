package com.vvt.capture.telegram.internal;

public class TLRPC$TL_maskCoords
  extends TLObject
{
  public static int constructor = -1361650766;
  public int n;
  public double x;
  public double y;
  public double zoom;
  
  public static TL_maskCoords TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    int i = constructor;
    if (i == paramInt)
    {
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_maskCoords;
      ((TL_maskCoords)localObject).<init>();
      ((TL_maskCoords)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    for (;;)
    {
      return (TL_maskCoords)localObject;
      if (paramBoolean) {
        break;
      }
      i = 0;
      localObject = null;
    }
    Object localObject = new Object[1];
    Integer localInteger = Integer.valueOf(constructor);
    localObject[0] = localInteger;
    RuntimeException localRuntimeException = new java/lang/RuntimeException;
    localObject = String.format("can't parse magic %x in TL_maskCoords", (Object[])localObject);
    localRuntimeException.<init>((String)localObject);
    throw localRuntimeException;
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.n = i;
    double d = paramAbstractSerializedData.readDouble(paramBoolean);
    this.x = d;
    d = paramAbstractSerializedData.readDouble(paramBoolean);
    this.y = d;
    d = paramAbstractSerializedData.readDouble(paramBoolean);
    this.zoom = d;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.n;
    paramAbstractSerializedData.writeInt32(i);
    double d = this.x;
    paramAbstractSerializedData.writeDouble(d);
    d = this.y;
    paramAbstractSerializedData.writeDouble(d);
    d = this.zoom;
    paramAbstractSerializedData.writeDouble(d);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_maskCoords.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */