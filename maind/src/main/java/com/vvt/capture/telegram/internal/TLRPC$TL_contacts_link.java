package com.vvt.capture.telegram.internal;

public class TLRPC$TL_contacts_link
  extends TLObject
{
  public static int constructor = 986597452;
  public TLRPC.ContactLink foreign_link;
  public TLRPC.ContactLink my_link;
  public TLRPC.User user;
  
  public static TL_contacts_link TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_contacts_link", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_contacts_link)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_contacts_link;
      ((TL_contacts_link)localObject).<init>();
      ((TL_contacts_link)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    Object localObject = TLRPC.ContactLink.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.my_link = ((TLRPC.ContactLink)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.ContactLink.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.foreign_link = ((TLRPC.ContactLink)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.User.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.user = ((TLRPC.User)localObject);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.my_link.serializeToStream(paramAbstractSerializedData);
    this.foreign_link.serializeToStream(paramAbstractSerializedData);
    this.user.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_contacts_link.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */