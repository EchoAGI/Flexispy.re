package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$ChannelMessagesFilter
  extends TLObject
{
  public boolean exclude_new_messages;
  public int flags;
  public boolean important_only;
  public ArrayList ranges;
  
  public TLRPC$ChannelMessagesFilter()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.ranges = localArrayList;
  }
  
  public static ChannelMessagesFilter TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in ChannelMessagesFilter", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_channelMessagesFilterEmpty;
      ((TLRPC.TL_channelMessagesFilterEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_channelMessagesFilter;
      ((TLRPC.TL_channelMessagesFilter)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_channelMessagesFilterCollapsed;
      ((TLRPC.TL_channelMessagesFilterCollapsed)localObject).<init>();
    }
    if (localObject != null) {
      ((ChannelMessagesFilter)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (ChannelMessagesFilter)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$ChannelMessagesFilter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */