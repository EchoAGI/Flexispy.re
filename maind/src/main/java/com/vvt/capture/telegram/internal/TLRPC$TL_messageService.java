package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messageService
  extends TLRPC.Message
{
  public static int constructor = -1066691065;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 1;
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = j;
    j = this.flags & 0x1;
    label53:
    label76:
    label96:
    Object localObject;
    if (j != 0)
    {
      j = i;
      this.unread = j;
      j = this.flags & 0x2;
      if (j == 0) {
        break label257;
      }
      j = i;
      this.out = j;
      j = this.flags & 0x10;
      if (j == 0) {
        break label266;
      }
      j = i;
      this.mentioned = j;
      j = this.flags & 0x20;
      if (j == 0) {
        break label275;
      }
      this.media_unread = i;
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      this.id = j;
      j = this.flags & 0x100;
      if (j != 0)
      {
        j = paramAbstractSerializedData.readInt32(paramBoolean);
        this.from_id = j;
      }
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject = TLRPC.Peer.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
      this.to_id = ((TLRPC.Peer)localObject);
      j = this.from_id;
      if (j == 0)
      {
        localObject = this.to_id;
        j = ((TLRPC.Peer)localObject).user_id;
        if (j == 0) {
          break label280;
        }
        localObject = this.to_id;
        j = ((TLRPC.Peer)localObject).user_id;
      }
    }
    for (this.from_id = j;; this.from_id = j)
    {
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      this.date = j;
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject = TLRPC.MessageAction.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
      this.action = ((TLRPC.MessageAction)localObject);
      return;
      j = 0;
      localObject = null;
      break;
      label257:
      j = 0;
      localObject = null;
      break label53;
      label266:
      j = 0;
      localObject = null;
      break label76;
      label275:
      i = 0;
      break label96;
      label280:
      localObject = this.to_id;
      j = -((TLRPC.Peer)localObject).channel_id;
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
        break label176;
      }
      int k = this.flags | 0x2;
      label46:
      this.flags = k;
      boolean bool3 = this.mentioned;
      if (!bool3) {
        break label187;
      }
      int m = this.flags | 0x10;
      label68:
      this.flags = m;
      boolean bool4 = this.media_unread;
      if (!bool4) {
        break label198;
      }
    }
    label176:
    label187:
    label198:
    for (int n = this.flags | 0x20;; n = this.flags & 0xFFFFFFDF)
    {
      this.flags = n;
      n = this.flags;
      paramAbstractSerializedData.writeInt32(n);
      n = this.id;
      paramAbstractSerializedData.writeInt32(n);
      n = this.flags & 0x100;
      if (n != 0)
      {
        n = this.from_id;
        paramAbstractSerializedData.writeInt32(n);
      }
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messageService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */