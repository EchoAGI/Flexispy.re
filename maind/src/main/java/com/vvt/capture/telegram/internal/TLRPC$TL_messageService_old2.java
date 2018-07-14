package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messageService_old2
  extends TLRPC.TL_messageService
{
  public static int constructor = 495384334;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 1;
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = j;
    j = this.flags & 0x1;
    if (j != 0)
    {
      j = i;
      this.unread = j;
      j = this.flags & 0x2;
      if (j == 0) {
        break label210;
      }
      j = i;
      label53:
      this.out = j;
      j = this.flags & 0x10;
      if (j == 0) {
        break label219;
      }
      j = i;
      label76:
      this.mentioned = j;
      j = this.flags & 0x20;
      if (j == 0) {
        break label228;
      }
    }
    for (;;)
    {
      this.media_unread = i;
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      this.id = j;
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      this.from_id = j;
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      Object localObject = TLRPC.Peer.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
      this.to_id = ((TLRPC.Peer)localObject);
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      this.date = j;
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject = TLRPC.MessageAction.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
      this.action = ((TLRPC.MessageAction)localObject);
      j = this.flags | 0x100;
      this.flags = j;
      return;
      j = 0;
      localObject = null;
      break;
      label210:
      j = 0;
      localObject = null;
      break label53;
      label219:
      j = 0;
      localObject = null;
      break label76;
      label228:
      i = 0;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool1 = this.unread;
    if (bool1)
    {
      int j = this.flags | 0x1;
      this.flags = j;
      boolean bool2 = this.out;
      if (!bool2) {
        break label163;
      }
      int k = this.flags | 0x2;
      label46:
      this.flags = k;
      boolean bool3 = this.mentioned;
      if (!bool3) {
        break label174;
      }
      int m = this.flags | 0x10;
      label68:
      this.flags = m;
      boolean bool4 = this.media_unread;
      if (!bool4) {
        break label185;
      }
    }
    label163:
    label174:
    label185:
    for (int n = this.flags | 0x20;; n = this.flags & 0xFFFFFFDF)
    {
      this.flags = n;
      n = this.flags;
      paramAbstractSerializedData.writeInt32(n);
      n = this.id;
      paramAbstractSerializedData.writeInt32(n);
      n = this.from_id;
      paramAbstractSerializedData.writeInt32(n);
      this.to_id.serializeToStream(paramAbstractSerializedData);
      n = this.date;
      paramAbstractSerializedData.writeInt32(n);
      this.action.serializeToStream(paramAbstractSerializedData);
      return;
      n = this.flags & 0xFFFFFFFE;
      break;
      n = this.flags & 0xFFFFFFFD;
      break label46;
      n = this.flags & 0xFFFFFFEF;
      break label68;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messageService_old2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */