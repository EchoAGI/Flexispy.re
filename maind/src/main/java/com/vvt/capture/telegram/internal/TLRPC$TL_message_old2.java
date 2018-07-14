package com.vvt.capture.telegram.internal;

public class TLRPC$TL_message_old2
  extends TLRPC.TL_message
{
  public static int constructor = 1450613171;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 1;
    int j = paramAbstractSerializedData.readInt32(paramBoolean) | 0x100 | 0x200;
    this.flags = j;
    j = this.flags & 0x1;
    if (j != 0)
    {
      j = i;
      this.unread = j;
      j = this.flags & 0x2;
      if (j == 0) {
        break label339;
      }
      j = i;
      label61:
      this.out = j;
      j = this.flags & 0x10;
      if (j == 0) {
        break label348;
      }
      j = i;
      label84:
      this.mentioned = j;
      j = this.flags & 0x20;
      if (j == 0) {
        break label357;
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
      localObject = paramAbstractSerializedData.readString(paramBoolean);
      this.message = ((String)localObject);
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject = TLRPC.MessageMedia.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
      this.media = ((TLRPC.MessageMedia)localObject);
      j = this.id;
      if (j >= 0)
      {
        localObject = this.media;
        if (localObject != null)
        {
          localObject = this.media;
          boolean bool1 = localObject instanceof TLRPC.TL_messageMediaEmpty;
          if (!bool1)
          {
            localObject = this.media;
            bool1 = localObject instanceof TLRPC.TL_messageMediaWebPage;
            if (!bool1)
            {
              localObject = this.message;
              if (localObject != null)
              {
                localObject = this.message;
                int k = ((String)localObject).length();
                if (k != 0)
                {
                  localObject = this.message;
                  str = "-1";
                  bool2 = ((String)localObject).startsWith(str);
                  if (!bool2) {}
                }
              }
            }
          }
        }
      }
      else
      {
        localObject = paramAbstractSerializedData.readString(paramBoolean);
        this.attachPath = ((String)localObject);
      }
      return;
      boolean bool2 = false;
      localObject = null;
      break;
      label339:
      bool2 = false;
      localObject = null;
      break label61;
      label348:
      bool2 = false;
      localObject = null;
      break label84;
      label357:
      i = 0;
      String str = null;
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
        break label183;
      }
      int k = this.flags | 0x2;
      label46:
      this.flags = k;
      boolean bool3 = this.mentioned;
      if (!bool3) {
        break label194;
      }
      int m = this.flags | 0x10;
      label68:
      this.flags = m;
      boolean bool4 = this.media_unread;
      if (!bool4) {
        break label205;
      }
    }
    label183:
    label194:
    label205:
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
      String str = this.message;
      paramAbstractSerializedData.writeString(str);
      this.media.serializeToStream(paramAbstractSerializedData);
      str = this.attachPath;
      paramAbstractSerializedData.writeString(str);
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_message_old2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */