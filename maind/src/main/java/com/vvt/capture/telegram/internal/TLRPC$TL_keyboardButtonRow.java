package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_keyboardButtonRow
  extends TLObject
{
  public static int constructor = 2002815875;
  public ArrayList buttons;
  
  public TLRPC$TL_keyboardButtonRow()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.buttons = localArrayList;
  }
  
  public static TL_keyboardButtonRow TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    int i = constructor;
    Object localObject;
    if (i != paramInt)
    {
      if (paramBoolean)
      {
        localObject = new java/lang/RuntimeException;
        Object[] arrayOfObject = new Object[1];
        Integer localInteger = Integer.valueOf(paramInt);
        arrayOfObject[0] = localInteger;
        String str = String.format("can't parse magic %x in TL_keyboardButtonRow", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_keyboardButtonRow)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_keyboardButtonRow;
      ((TL_keyboardButtonRow)localObject).<init>();
      ((TL_keyboardButtonRow)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 0;
    String str = null;
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
    int k = 481674261;
    Object localObject;
    if (j != k)
    {
      if (paramBoolean)
      {
        localObject = new java/lang/RuntimeException;
        Object[] arrayOfObject = new Object[1];
        Integer localInteger = Integer.valueOf(j);
        arrayOfObject[0] = localInteger;
        str = String.format("wrong Vector magic, got %x", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
    }
    else {
      j = paramAbstractSerializedData.readInt32(paramBoolean);
    }
    for (;;)
    {
      if (i < j)
      {
        k = paramAbstractSerializedData.readInt32(paramBoolean);
        localObject = TLRPC.TL_keyboardButton.TLdeserialize(paramAbstractSerializedData, k, paramBoolean);
        if (localObject != null) {}
      }
      else
      {
        return;
      }
      ArrayList localArrayList = this.buttons;
      localArrayList.add(localObject);
      i += 1;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    paramAbstractSerializedData.writeInt32(481674261);
    int j = this.buttons.size();
    paramAbstractSerializedData.writeInt32(j);
    i = 0;
    TLRPC.TL_keyboardButton localTL_keyboardButton = null;
    for (int k = 0; k < j; k = i)
    {
      localTL_keyboardButton = (TLRPC.TL_keyboardButton)this.buttons.get(k);
      localTL_keyboardButton.serializeToStream(paramAbstractSerializedData);
      i = k + 1;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_keyboardButtonRow.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */