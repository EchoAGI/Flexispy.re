package com.vvt.capture.telegram.internal;

public class TLRPC$TL_inputPhoneContact
  extends TLObject
{
  public static int constructor = -208488460;
  public long client_id;
  public String first_name;
  public String last_name;
  public String phone;
  
  public static TL_inputPhoneContact TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_inputPhoneContact", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_inputPhoneContact)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputPhoneContact;
      ((TL_inputPhoneContact)localObject).<init>();
      ((TL_inputPhoneContact)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    long l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.client_id = l;
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.phone = str;
    str = paramAbstractSerializedData.readString(paramBoolean);
    this.first_name = str;
    str = paramAbstractSerializedData.readString(paramBoolean);
    this.last_name = str;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    long l = this.client_id;
    paramAbstractSerializedData.writeInt64(l);
    String str = this.phone;
    paramAbstractSerializedData.writeString(str);
    str = this.first_name;
    paramAbstractSerializedData.writeString(str);
    str = this.last_name;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_inputPhoneContact.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */