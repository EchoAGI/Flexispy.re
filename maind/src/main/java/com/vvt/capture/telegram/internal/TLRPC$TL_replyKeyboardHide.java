package com.vvt.capture.telegram.internal;

public class TLRPC$TL_replyKeyboardHide
  extends TLRPC.ReplyMarkup
{
  public static int constructor = -1606526075;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = i;
    i = this.flags & 0x4;
    if (i != 0) {}
    for (i = 1;; i = 0)
    {
      this.selective = i;
      return;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool = this.selective;
    if (bool) {}
    for (int j = this.flags | 0x4;; j = this.flags & 0xFFFFFFFB)
    {
      this.flags = j;
      j = this.flags;
      paramAbstractSerializedData.writeInt32(j);
      return;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_replyKeyboardHide.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */