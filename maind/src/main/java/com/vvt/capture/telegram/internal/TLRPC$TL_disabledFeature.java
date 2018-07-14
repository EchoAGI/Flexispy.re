package com.vvt.capture.telegram.internal;

public class TLRPC$TL_disabledFeature
  extends TLObject
{
  public static int constructor = -1369215196;
  public String description;
  public String feature;
  
  public static TL_disabledFeature TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_disabledFeature", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_disabledFeature)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_disabledFeature;
      ((TL_disabledFeature)localObject).<init>();
      ((TL_disabledFeature)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.feature = str;
    str = paramAbstractSerializedData.readString(paramBoolean);
    this.description = str;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.feature;
    paramAbstractSerializedData.writeString(str);
    str = this.description;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_disabledFeature.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */