package com.vvt.capture.telegram.internal;

public class TLRPC$TL_contacts_resolveUsername
  extends TLObject
{
  public static int constructor = -113456221;
  public String username;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.TL_contacts_resolvedPeer.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.username;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_contacts_resolveUsername.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */