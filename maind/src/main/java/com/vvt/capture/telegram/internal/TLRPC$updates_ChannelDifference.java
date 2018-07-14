package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$updates_ChannelDifference
  extends TLObject
{
  public ArrayList chats;
  public int flags;
  public boolean isFinal;
  public ArrayList messages;
  public ArrayList new_messages;
  public ArrayList other_updates;
  public int pts;
  public int read_inbox_max_id;
  public int timeout;
  public int top_important_message;
  public int top_message;
  public int unread_count;
  public int unread_important_count;
  public ArrayList users;
  
  public TLRPC$updates_ChannelDifference()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.new_messages = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.other_updates = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.chats = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.users = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.messages = localArrayList;
  }
  
  public static updates_ChannelDifference TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in updates_ChannelDifference", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updates_channelDifferenceEmpty;
      ((TLRPC.TL_updates_channelDifferenceEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updates_channelDifference;
      ((TLRPC.TL_updates_channelDifference)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updates_channelDifferenceTooLong;
      ((TLRPC.TL_updates_channelDifferenceTooLong)localObject).<init>();
    }
    if (localObject != null) {
      ((updates_ChannelDifference)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (updates_ChannelDifference)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$updates_ChannelDifference.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */