package com.vvt.capture.telegram.internal;

public class TLRPC$TL_importedContact
  extends TLObject
{
  public static int constructor = -805141448;
  public long client_id;
  public int user_id;
  
  public static TL_importedContact TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_importedContact", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_importedContact)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_importedContact;
      ((TL_importedContact)localObject).<init>();
      ((TL_importedContact)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.user_id = i;
    long l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.client_id = l;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.user_id;
    paramAbstractSerializedData.writeInt32(i);
    long l = this.client_id;
    paramAbstractSerializedData.writeInt64(l);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_importedContact.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */