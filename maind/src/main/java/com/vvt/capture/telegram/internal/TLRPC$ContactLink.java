package com.vvt.capture.telegram.internal;

public class TLRPC$ContactLink
  extends TLObject
{
  public static ContactLink TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in ContactLink", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_contactLinkNone;
      ((TLRPC.TL_contactLinkNone)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_contactLinkContact;
      ((TLRPC.TL_contactLinkContact)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_contactLinkHasPhone;
      ((TLRPC.TL_contactLinkHasPhone)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_contactLinkUnknown;
      ((TLRPC.TL_contactLinkUnknown)localObject).<init>();
    }
    if (localObject != null) {
      ((ContactLink)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (ContactLink)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$ContactLink.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */