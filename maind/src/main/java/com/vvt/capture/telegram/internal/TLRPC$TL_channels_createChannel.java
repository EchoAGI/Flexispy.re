package com.vvt.capture.telegram.internal;

public class TLRPC$TL_channels_createChannel
  extends TLObject
{
  public static int constructor = -192332417;
  public String about;
  public boolean broadcast;
  public int flags;
  public boolean megagroup;
  public String title;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.Updates.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool1 = this.broadcast;
    if (bool1)
    {
      int j = this.flags | 0x1;
      this.flags = j;
      boolean bool2 = this.megagroup;
      if (!bool2) {
        break label93;
      }
    }
    label93:
    for (int k = this.flags | 0x2;; k = this.flags & 0xFFFFFFFD)
    {
      this.flags = k;
      k = this.flags;
      paramAbstractSerializedData.writeInt32(k);
      String str = this.title;
      paramAbstractSerializedData.writeString(str);
      str = this.about;
      paramAbstractSerializedData.writeString(str);
      return;
      k = this.flags & 0xFFFFFFFE;
      break;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_channels_createChannel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */