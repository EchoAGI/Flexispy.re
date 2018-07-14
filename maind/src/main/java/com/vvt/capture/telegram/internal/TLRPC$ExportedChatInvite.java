package com.vvt.capture.telegram.internal;

public class TLRPC$ExportedChatInvite
  extends TLObject
{
  public String link;
  
  public static ExportedChatInvite TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in ExportedChatInvite", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_chatInviteExported;
      ((TLRPC.TL_chatInviteExported)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_chatInviteEmpty;
      ((TLRPC.TL_chatInviteEmpty)localObject).<init>();
    }
    if (localObject != null) {
      ((ExportedChatInvite)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (ExportedChatInvite)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$ExportedChatInvite.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */