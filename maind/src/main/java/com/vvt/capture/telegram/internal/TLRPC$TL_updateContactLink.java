package com.vvt.capture.telegram.internal;

public class TLRPC$TL_updateContactLink
  extends TLRPC.Update
{
  public static int constructor = -1657903163;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.user_id = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.ContactLink localContactLink = TLRPC.ContactLink.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.my_link = localContactLink;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    localContactLink = TLRPC.ContactLink.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.foreign_link = localContactLink;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.user_id;
    paramAbstractSerializedData.writeInt32(i);
    this.my_link.serializeToStream(paramAbstractSerializedData);
    this.foreign_link.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_updateContactLink.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */