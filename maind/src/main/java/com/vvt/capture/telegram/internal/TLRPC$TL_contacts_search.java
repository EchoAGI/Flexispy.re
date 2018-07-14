package com.vvt.capture.telegram.internal;

public class TLRPC$TL_contacts_search
  extends TLObject
{
  public static int constructor = 301470424;
  public int limit;
  public String q;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.TL_contacts_found.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.q;
    paramAbstractSerializedData.writeString(str);
    i = this.limit;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_contacts_search.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */