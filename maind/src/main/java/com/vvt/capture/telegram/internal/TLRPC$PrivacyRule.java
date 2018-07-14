package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$PrivacyRule
  extends TLObject
{
  public ArrayList users;
  
  public TLRPC$PrivacyRule()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.users = localArrayList;
  }
  
  public static PrivacyRule TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in PrivacyRule", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_privacyValueAllowUsers;
      ((TLRPC.TL_privacyValueAllowUsers)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_privacyValueDisallowAll;
      ((TLRPC.TL_privacyValueDisallowAll)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_privacyValueAllowContacts;
      ((TLRPC.TL_privacyValueAllowContacts)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_privacyValueDisallowContacts;
      ((TLRPC.TL_privacyValueDisallowContacts)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_privacyValueAllowAll;
      ((TLRPC.TL_privacyValueAllowAll)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_privacyValueDisallowUsers;
      ((TLRPC.TL_privacyValueDisallowUsers)localObject).<init>();
    }
    if (localObject != null) {
      ((PrivacyRule)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (PrivacyRule)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$PrivacyRule.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */