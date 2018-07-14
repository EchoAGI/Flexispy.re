package com.vvt.capture.telegram.internal;

public class TLRPC$TL_message_old3
  extends TLRPC.TL_message
{
  public static int constructor = -1481959023;
  
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
        break label476;
      }
      j = i;
      label61:
      this.out = j;
      j = this.flags & 0x10;
      if (j == 0) {
        break label485;
      }
      j = i;
      label84:
      this.mentioned = j;
      j = this.flags & 0x20;
      if (j == 0) {
        break label494;
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
      j = this.flags & 0x4;
      if (j != 0)
      {
        localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_peerUser;
        ((TLRPC.TL_peerUser)localObject).<init>();
        this.fwd_from_id = ((TLRPC.Peer)localObject);
        localObject = this.fwd_from_id;
        i = paramAbstractSerializedData.readInt32(paramBoolean);
        ((TLRPC.Peer)localObject).user_id = i;
      }
      j = this.flags & 0x4;
      if (j != 0)
      {
        j = paramAbstractSerializedData.readInt32(paramBoolean);
        this.fwd_date = j;
      }
      j = this.flags & 0x8;
      if (j != 0)
      {
        j = paramAbstractSerializedData.readInt32(paramBoolean);
        this.reply_to_msg_id = j;
      }
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
                  boolean bool2 = ((String)localObject).startsWith(str);
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
      int m = this.flags & 0x4;
      if (m != 0)
      {
        m = this.id;
        if (m < 0)
        {
          m = paramAbstractSerializedData.readInt32(paramBoolean);
          this.fwd_msg_id = m;
        }
      }
      return;
      m = 0;
      localObject = null;
      break;
      label476:
      m = 0;
      localObject = null;
      break label61;
      label485:
      m = 0;
      localObject = null;
      break label84;
      label494:
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
        break label284;
      }
      int k = this.flags | 0x2;
      label46:
      this.flags = k;
      boolean bool3 = this.mentioned;
      if (!bool3) {
        break label295;
      }
      int m = this.flags | 0x10;
      label68:
      this.flags = m;
      boolean bool4 = this.media_unread;
      if (!bool4) {
        break label306;
      }
    }
    label284:
    label295:
    label306:
    for (int n = this.flags | 0x20;; n = this.flags & 0xFFFFFFDF)
    {
      this.flags = n;
      n = this.flags;
      paramAbstractSerializedData.writeInt32(n);
      n = this.id;
      paramAbstractSerializedData.writeInt32(n);
      n = this.from_id;
      paramAbstractSerializedData.writeInt32(n);
      Object localObject = this.to_id;
      ((TLRPC.Peer)localObject).serializeToStream(paramAbstractSerializedData);
      n = this.flags & 0x4;
      if (n != 0)
      {
        localObject = this.fwd_from_id;
        n = ((TLRPC.Peer)localObject).user_id;
        paramAbstractSerializedData.writeInt32(n);
      }
      n = this.flags & 0x4;
      if (n != 0)
      {
        n = this.fwd_date;
        paramAbstractSerializedData.writeInt32(n);
      }
      n = this.flags & 0x8;
      if (n != 0)
      {
        n = this.reply_to_msg_id;
        paramAbstractSerializedData.writeInt32(n);
      }
      n = this.date;
      paramAbstractSerializedData.writeInt32(n);
      localObject = this.message;
      paramAbstractSerializedData.writeString((String)localObject);
      this.media.serializeToStream(paramAbstractSerializedData);
      localObject = this.attachPath;
      paramAbstractSerializedData.writeString((String)localObject);
      n = this.flags & 0x4;
      if (n != 0)
      {
        n = this.id;
        if (n < 0)
        {
          n = this.fwd_msg_id;
          paramAbstractSerializedData.writeInt32(n);
        }
      }
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_message_old3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */