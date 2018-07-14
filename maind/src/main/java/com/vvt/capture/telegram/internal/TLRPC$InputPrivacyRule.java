package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$InputPrivacyRule
  extends TLObject
{
  public ArrayList users;
  
  public TLRPC$InputPrivacyRule()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.users = localArrayList;
  }
  
  public static InputPrivacyRule TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in InputPrivacyRule", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputPrivacyValueDisallowUsers;
      ((TLRPC.TL_inputPrivacyValueDisallowUsers)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputPrivacyValueDisallowAll;
      ((TLRPC.TL_inputPrivacyValueDisallowAll)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputPrivacyValueDisallowContacts;
      ((TLRPC.TL_inputPrivacyValueDisallowContacts)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputPrivacyValueAllowAll;
      ((TLRPC.TL_inputPrivacyValueAllowAll)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputPrivacyValueAllowContacts;
      ((TLRPC.TL_inputPrivacyValueAllowContacts)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputPrivacyValueAllowUsers;
      ((TLRPC.TL_inputPrivacyValueAllowUsers)localObject).<init>();
    }
    if (localObject != null) {
      ((InputPrivacyRule)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (InputPrivacyRule)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$InputPrivacyRule.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */