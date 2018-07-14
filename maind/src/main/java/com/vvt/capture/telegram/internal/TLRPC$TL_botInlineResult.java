package com.vvt.capture.telegram.internal;

public class TLRPC$TL_botInlineResult
  extends TLRPC.BotInlineResult
{
  public static int constructor = -1679053127;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = i;
    Object localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.id = ((String)localObject);
    localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.type = ((String)localObject);
    i = this.flags & 0x2;
    if (i != 0)
    {
      localObject = paramAbstractSerializedData.readString(paramBoolean);
      this.title = ((String)localObject);
    }
    i = this.flags & 0x4;
    if (i != 0)
    {
      localObject = paramAbstractSerializedData.readString(paramBoolean);
      this.description = ((String)localObject);
    }
    i = this.flags & 0x8;
    if (i != 0)
    {
      localObject = paramAbstractSerializedData.readString(paramBoolean);
      this.url = ((String)localObject);
    }
    i = this.flags & 0x10;
    if (i != 0)
    {
      localObject = paramAbstractSerializedData.readString(paramBoolean);
      this.thumb_url = ((String)localObject);
    }
    i = this.flags & 0x20;
    if (i != 0)
    {
      localObject = paramAbstractSerializedData.readString(paramBoolean);
      this.content_url = ((String)localObject);
    }
    i = this.flags & 0x20;
    if (i != 0)
    {
      localObject = paramAbstractSerializedData.readString(paramBoolean);
      this.content_type = ((String)localObject);
    }
    i = this.flags & 0x40;
    if (i != 0)
    {
      i = paramAbstractSerializedData.readInt32(paramBoolean);
      this.w = i;
    }
    i = this.flags & 0x40;
    if (i != 0)
    {
      i = paramAbstractSerializedData.readInt32(paramBoolean);
      this.h = i;
    }
    i = this.flags & 0x80;
    if (i != 0)
    {
      i = paramAbstractSerializedData.readInt32(paramBoolean);
      this.duration = i;
    }
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.BotInlineMessage.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.send_message = ((TLRPC.BotInlineMessage)localObject);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.flags;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.id;
    paramAbstractSerializedData.writeString(str);
    str = this.type;
    paramAbstractSerializedData.writeString(str);
    i = this.flags & 0x2;
    if (i != 0)
    {
      str = this.title;
      paramAbstractSerializedData.writeString(str);
    }
    i = this.flags & 0x4;
    if (i != 0)
    {
      str = this.description;
      paramAbstractSerializedData.writeString(str);
    }
    i = this.flags & 0x8;
    if (i != 0)
    {
      str = this.url;
      paramAbstractSerializedData.writeString(str);
    }
    i = this.flags & 0x10;
    if (i != 0)
    {
      str = this.thumb_url;
      paramAbstractSerializedData.writeString(str);
    }
    i = this.flags & 0x20;
    if (i != 0)
    {
      str = this.content_url;
      paramAbstractSerializedData.writeString(str);
    }
    i = this.flags & 0x20;
    if (i != 0)
    {
      str = this.content_type;
      paramAbstractSerializedData.writeString(str);
    }
    i = this.flags & 0x40;
    if (i != 0)
    {
      i = this.w;
      paramAbstractSerializedData.writeInt32(i);
    }
    i = this.flags & 0x40;
    if (i != 0)
    {
      i = this.h;
      paramAbstractSerializedData.writeInt32(i);
    }
    i = this.flags & 0x80;
    if (i != 0)
    {
      i = this.duration;
      paramAbstractSerializedData.writeInt32(i);
    }
    this.send_message.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_botInlineResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */