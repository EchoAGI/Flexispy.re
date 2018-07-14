package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$ReplyMarkup
  extends TLObject
{
  public int flags;
  public boolean resize;
  public ArrayList rows;
  public boolean selective;
  public boolean single_use;
  
  public TLRPC$ReplyMarkup()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.rows = localArrayList;
  }
  
  public static ReplyMarkup TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in ReplyMarkup", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_replyKeyboardHide;
      ((TLRPC.TL_replyKeyboardHide)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_replyKeyboardMarkup;
      ((TLRPC.TL_replyKeyboardMarkup)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_replyKeyboardForceReply;
      ((TLRPC.TL_replyKeyboardForceReply)localObject).<init>();
    }
    if (localObject != null) {
      ((ReplyMarkup)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (ReplyMarkup)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$ReplyMarkup.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */