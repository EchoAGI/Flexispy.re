package com.vvt.capture.telegram.internal;

public class TLRPC$TL_replyKeyboardForceReply
  extends TLRPC.ReplyMarkup
{
  public static int constructor = -200242528;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 1;
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = j;
    j = this.flags & 0x2;
    if (j != 0)
    {
      j = i;
      this.single_use = j;
      j = this.flags & 0x4;
      if (j == 0) {
        break label62;
      }
    }
    for (;;)
    {
      this.selective = i;
      return;
      j = 0;
      break;
      label62:
      i = 0;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool1 = this.single_use;
    if (bool1)
    {
      int j = this.flags | 0x2;
      this.flags = j;
      boolean bool2 = this.selective;
      if (!bool2) {
        break label73;
      }
    }
    label73:
    for (int k = this.flags | 0x4;; k = this.flags & 0xFFFFFFFB)
    {
      this.flags = k;
      k = this.flags;
      paramAbstractSerializedData.writeInt32(k);
      return;
      k = this.flags & 0xFFFFFFFD;
      break;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_replyKeyboardForceReply.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */