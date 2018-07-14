package com.vvt.capture.telegram.internal;

public class TLRPC$TL_geochats_search
  extends TLObject
{
  public static int constructor = -808598451;
  public TLRPC.MessagesFilter filter;
  public int limit;
  public int max_date;
  public int max_id;
  public int min_date;
  public int offset;
  public TLRPC.TL_inputGeoChat peer;
  public String q;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.geochats_Messages.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.peer.serializeToStream(paramAbstractSerializedData);
    String str = this.q;
    paramAbstractSerializedData.writeString(str);
    this.filter.serializeToStream(paramAbstractSerializedData);
    i = this.min_date;
    paramAbstractSerializedData.writeInt32(i);
    i = this.max_date;
    paramAbstractSerializedData.writeInt32(i);
    i = this.offset;
    paramAbstractSerializedData.writeInt32(i);
    i = this.max_id;
    paramAbstractSerializedData.writeInt32(i);
    i = this.limit;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_geochats_search.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */