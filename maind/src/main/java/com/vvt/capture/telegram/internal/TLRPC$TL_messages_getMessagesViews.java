package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_messages_getMessagesViews
  extends TLObject
{
  public static int constructor = -993483427;
  public ArrayList id;
  public boolean increment;
  public TLRPC.InputPeer peer;
  
  public TLRPC$TL_messages_getMessagesViews()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.id = localArrayList;
  }
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    TLRPC.Vector localVector = new com/vvt/capture/telegram/internal/TLRPC$Vector;
    localVector.<init>();
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    int j = 0;
    while (j < i)
    {
      ArrayList localArrayList = localVector.objects;
      int k = paramAbstractSerializedData.readInt32(paramBoolean);
      Integer localInteger = Integer.valueOf(k);
      localArrayList.add(localInteger);
      j += 1;
    }
    return localVector;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.peer.serializeToStream(paramAbstractSerializedData);
    paramAbstractSerializedData.writeInt32(481674261);
    int j = this.id.size();
    paramAbstractSerializedData.writeInt32(j);
    i = 0;
    Integer localInteger = null;
    for (int k = 0; k < j; k = i)
    {
      localInteger = (Integer)this.id.get(k);
      i = localInteger.intValue();
      paramAbstractSerializedData.writeInt32(i);
      i = k + 1;
    }
    boolean bool = this.increment;
    paramAbstractSerializedData.writeBool(bool);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_getMessagesViews.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */