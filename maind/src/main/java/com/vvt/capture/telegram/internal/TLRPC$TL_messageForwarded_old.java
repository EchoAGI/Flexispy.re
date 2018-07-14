package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messageForwarded_old
  extends TLRPC.TL_messageForwarded_old2
{
  public static int constructor = 99903492;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.id = i;
    Object localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_peerUser;
    ((TLRPC.TL_peerUser)localObject).<init>();
    this.fwd_from_id = ((TLRPC.Peer)localObject);
    localObject = this.fwd_from_id;
    int m = paramAbstractSerializedData.readInt32(paramBoolean);
    ((TLRPC.Peer)localObject).user_id = m;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.fwd_date = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.from_id = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.Peer.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.to_id = ((TLRPC.Peer)localObject);
    boolean bool1 = paramAbstractSerializedData.readBool(paramBoolean);
    this.out = bool1;
    bool1 = paramAbstractSerializedData.readBool(paramBoolean);
    this.unread = bool1;
    int j = this.flags | 0x304;
    this.flags = j;
    j = paramAbstractSerializedData.readInt32(paramBoolean);
    this.date = j;
    localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.message = ((String)localObject);
    j = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.MessageMedia.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
    this.media = ((TLRPC.MessageMedia)localObject);
    j = this.id;
    if (j < 0)
    {
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      this.fwd_msg_id = j;
    }
    j = this.id;
    if (j >= 0)
    {
      localObject = this.media;
      if (localObject != null)
      {
        localObject = this.media;
        boolean bool2 = localObject instanceof TLRPC.TL_messageMediaEmpty;
        if (!bool2)
        {
          localObject = this.media;
          bool2 = localObject instanceof TLRPC.TL_messageMediaWebPage;
          if (!bool2)
          {
            localObject = this.message;
            if (localObject != null)
            {
              localObject = this.message;
              int k = ((String)localObject).length();
              if (k != 0)
              {
                localObject = this.message;
                String str = "-1";
                boolean bool3 = ((String)localObject).startsWith(str);
                if (!bool3) {}
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
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.id;
    paramAbstractSerializedData.writeInt32(i);
    i = this.fwd_from_id.user_id;
    paramAbstractSerializedData.writeInt32(i);
    i = this.fwd_date;
    paramAbstractSerializedData.writeInt32(i);
    i = this.from_id;
    paramAbstractSerializedData.writeInt32(i);
    this.to_id.serializeToStream(paramAbstractSerializedData);
    boolean bool = this.out;
    paramAbstractSerializedData.writeBool(bool);
    bool = this.unread;
    paramAbstractSerializedData.writeBool(bool);
    int j = this.date;
    paramAbstractSerializedData.writeInt32(j);
    Object localObject = this.message;
    paramAbstractSerializedData.writeString((String)localObject);
    localObject = this.media;
    ((TLRPC.MessageMedia)localObject).serializeToStream(paramAbstractSerializedData);
    j = this.id;
    if (j < 0)
    {
      j = this.fwd_msg_id;
      paramAbstractSerializedData.writeInt32(j);
    }
    localObject = this.attachPath;
    paramAbstractSerializedData.writeString((String)localObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messageForwarded_old.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */