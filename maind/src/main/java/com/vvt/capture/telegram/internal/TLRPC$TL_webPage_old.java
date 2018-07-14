package com.vvt.capture.telegram.internal;

public class TLRPC$TL_webPage_old
  extends TLRPC.WebPage
{
  public static int constructor = -1558273867;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = i;
    long l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.id = l;
    Object localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.url = ((String)localObject);
    localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.display_url = ((String)localObject);
    i = this.flags & 0x1;
    if (i != 0)
    {
      localObject = paramAbstractSerializedData.readString(paramBoolean);
      this.type = ((String)localObject);
    }
    i = this.flags & 0x2;
    if (i != 0)
    {
      localObject = paramAbstractSerializedData.readString(paramBoolean);
      this.site_name = ((String)localObject);
    }
    i = this.flags & 0x4;
    if (i != 0)
    {
      localObject = paramAbstractSerializedData.readString(paramBoolean);
      this.title = ((String)localObject);
    }
    i = this.flags & 0x8;
    if (i != 0)
    {
      localObject = paramAbstractSerializedData.readString(paramBoolean);
      this.description = ((String)localObject);
    }
    i = this.flags & 0x10;
    if (i != 0)
    {
      i = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject = TLRPC.Photo.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
      this.photo = ((TLRPC.Photo)localObject);
    }
    i = this.flags & 0x20;
    if (i != 0)
    {
      localObject = paramAbstractSerializedData.readString(paramBoolean);
      this.embed_url = ((String)localObject);
    }
    i = this.flags & 0x20;
    if (i != 0)
    {
      localObject = paramAbstractSerializedData.readString(paramBoolean);
      this.embed_type = ((String)localObject);
    }
    i = this.flags & 0x40;
    if (i != 0)
    {
      i = paramAbstractSerializedData.readInt32(paramBoolean);
      this.embed_width = i;
    }
    i = this.flags & 0x40;
    if (i != 0)
    {
      i = paramAbstractSerializedData.readInt32(paramBoolean);
      this.embed_height = i;
    }
    i = this.flags & 0x80;
    if (i != 0)
    {
      i = paramAbstractSerializedData.readInt32(paramBoolean);
      this.duration = i;
    }
    i = this.flags & 0x100;
    if (i != 0)
    {
      localObject = paramAbstractSerializedData.readString(paramBoolean);
      this.author = ((String)localObject);
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.flags;
    paramAbstractSerializedData.writeInt32(i);
    long l = this.id;
    paramAbstractSerializedData.writeInt64(l);
    Object localObject = this.url;
    paramAbstractSerializedData.writeString((String)localObject);
    localObject = this.display_url;
    paramAbstractSerializedData.writeString((String)localObject);
    i = this.flags & 0x1;
    if (i != 0)
    {
      localObject = this.type;
      paramAbstractSerializedData.writeString((String)localObject);
    }
    i = this.flags & 0x2;
    if (i != 0)
    {
      localObject = this.site_name;
      paramAbstractSerializedData.writeString((String)localObject);
    }
    i = this.flags & 0x4;
    if (i != 0)
    {
      localObject = this.title;
      paramAbstractSerializedData.writeString((String)localObject);
    }
    i = this.flags & 0x8;
    if (i != 0)
    {
      localObject = this.description;
      paramAbstractSerializedData.writeString((String)localObject);
    }
    i = this.flags & 0x10;
    if (i != 0)
    {
      localObject = this.photo;
      ((TLRPC.Photo)localObject).serializeToStream(paramAbstractSerializedData);
    }
    i = this.flags & 0x20;
    if (i != 0)
    {
      localObject = this.embed_url;
      paramAbstractSerializedData.writeString((String)localObject);
    }
    i = this.flags & 0x20;
    if (i != 0)
    {
      localObject = this.embed_type;
      paramAbstractSerializedData.writeString((String)localObject);
    }
    i = this.flags & 0x40;
    if (i != 0)
    {
      i = this.embed_width;
      paramAbstractSerializedData.writeInt32(i);
    }
    i = this.flags & 0x40;
    if (i != 0)
    {
      i = this.embed_height;
      paramAbstractSerializedData.writeInt32(i);
    }
    i = this.flags & 0x80;
    if (i != 0)
    {
      i = this.duration;
      paramAbstractSerializedData.writeInt32(i);
    }
    i = this.flags & 0x100;
    if (i != 0)
    {
      localObject = this.author;
      paramAbstractSerializedData.writeString((String)localObject);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_webPage_old.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */