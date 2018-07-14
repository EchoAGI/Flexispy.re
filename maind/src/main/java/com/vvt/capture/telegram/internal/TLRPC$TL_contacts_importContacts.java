package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_contacts_importContacts
  extends TLObject
{
  public static int constructor = -634342611;
  public ArrayList contacts;
  public boolean replace;
  
  public TLRPC$TL_contacts_importContacts()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.contacts = localArrayList;
  }
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.TL_contacts_importedContacts.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    paramAbstractSerializedData.writeInt32(481674261);
    int j = this.contacts.size();
    paramAbstractSerializedData.writeInt32(j);
    i = 0;
    TLRPC.TL_inputPhoneContact localTL_inputPhoneContact = null;
    for (int k = 0; k < j; k = i)
    {
      localTL_inputPhoneContact = (TLRPC.TL_inputPhoneContact)this.contacts.get(k);
      localTL_inputPhoneContact.serializeToStream(paramAbstractSerializedData);
      i = k + 1;
    }
    boolean bool = this.replace;
    paramAbstractSerializedData.writeBool(bool);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_contacts_importContacts.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */