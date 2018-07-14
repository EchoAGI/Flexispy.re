package com.vvt.capture.telegram.internal;

public class TLRPC$TL_channel
  extends TLRPC.Chat
{
  public static int constructor = 1260090630;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 1;
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = j;
    j = this.flags & 0x1;
    if (j != 0)
    {
      j = i;
      this.creator = j;
      j = this.flags & 0x2;
      if (j == 0) {
        break label370;
      }
      j = i;
      label53:
      this.kicked = j;
      j = this.flags & 0x4;
      if (j == 0) {
        break label379;
      }
      j = i;
      label75:
      this.left = j;
      j = this.flags & 0x8;
      if (j == 0) {
        break label388;
      }
      j = i;
      label98:
      this.editor = j;
      j = this.flags & 0x10;
      if (j == 0) {
        break label397;
      }
      j = i;
      label121:
      this.moderator = j;
      j = this.flags & 0x20;
      if (j == 0) {
        break label406;
      }
      j = i;
      label144:
      this.broadcast = j;
      j = this.flags & 0x80;
      if (j == 0) {
        break label415;
      }
      j = i;
      label168:
      this.verified = j;
      j = this.flags & 0x100;
      if (j == 0) {
        break label424;
      }
      j = i;
      label192:
      this.megagroup = j;
      j = this.flags & 0x200;
      if (j == 0) {
        break label433;
      }
    }
    for (;;)
    {
      this.restricted = i;
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      this.id = j;
      long l = paramAbstractSerializedData.readInt64(paramBoolean);
      this.access_hash = l;
      Object localObject = paramAbstractSerializedData.readString(paramBoolean);
      this.title = ((String)localObject);
      j = this.flags & 0x40;
      if (j != 0)
      {
        localObject = paramAbstractSerializedData.readString(paramBoolean);
        this.username = ((String)localObject);
      }
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject = TLRPC.ChatPhoto.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
      this.photo = ((TLRPC.ChatPhoto)localObject);
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      this.date = j;
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      this.version = j;
      j = this.flags & 0x200;
      if (j != 0)
      {
        localObject = paramAbstractSerializedData.readString(paramBoolean);
        this.restriction_reason = ((String)localObject);
      }
      return;
      j = 0;
      localObject = null;
      break;
      label370:
      j = 0;
      localObject = null;
      break label53;
      label379:
      j = 0;
      localObject = null;
      break label75;
      label388:
      j = 0;
      localObject = null;
      break label98;
      label397:
      j = 0;
      localObject = null;
      break label121;
      label406:
      j = 0;
      localObject = null;
      break label144;
      label415:
      j = 0;
      localObject = null;
      break label168;
      label424:
      j = 0;
      localObject = null;
      break label192;
      label433:
      i = 0;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool1 = this.creator;
    if (bool1)
    {
      int j = this.flags | 0x1;
      this.flags = j;
      boolean bool2 = this.kicked;
      if (!bool2) {
        break label342;
      }
      int k = this.flags | 0x2;
      label46:
      this.flags = k;
      boolean bool3 = this.left;
      if (!bool3) {
        break label353;
      }
      int m = this.flags | 0x4;
      label67:
      this.flags = m;
      boolean bool4 = this.editor;
      if (!bool4) {
        break label364;
      }
      int n = this.flags | 0x8;
      label89:
      this.flags = n;
      boolean bool5 = this.moderator;
      if (!bool5) {
        break label375;
      }
      int i1 = this.flags | 0x10;
      label111:
      this.flags = i1;
      boolean bool6 = this.broadcast;
      if (!bool6) {
        break label386;
      }
      int i2 = this.flags | 0x20;
      label133:
      this.flags = i2;
      boolean bool7 = this.verified;
      if (!bool7) {
        break label397;
      }
      int i3 = this.flags | 0x80;
      label156:
      this.flags = i3;
      boolean bool8 = this.megagroup;
      if (!bool8) {
        break label409;
      }
      int i4 = this.flags | 0x100;
      label179:
      this.flags = i4;
      boolean bool9 = this.restricted;
      if (!bool9) {
        break label421;
      }
    }
    label342:
    label353:
    label364:
    label375:
    label386:
    label397:
    label409:
    label421:
    for (int i5 = this.flags | 0x200;; i5 = this.flags & 0xFDFF)
    {
      this.flags = i5;
      i5 = this.flags;
      paramAbstractSerializedData.writeInt32(i5);
      i5 = this.id;
      paramAbstractSerializedData.writeInt32(i5);
      long l = this.access_hash;
      paramAbstractSerializedData.writeInt64(l);
      Object localObject = this.title;
      paramAbstractSerializedData.writeString((String)localObject);
      i5 = this.flags & 0x40;
      if (i5 != 0)
      {
        localObject = this.username;
        paramAbstractSerializedData.writeString((String)localObject);
      }
      localObject = this.photo;
      ((TLRPC.ChatPhoto)localObject).serializeToStream(paramAbstractSerializedData);
      i5 = this.date;
      paramAbstractSerializedData.writeInt32(i5);
      i5 = this.version;
      paramAbstractSerializedData.writeInt32(i5);
      i5 = this.flags & 0x200;
      if (i5 != 0)
      {
        localObject = this.restriction_reason;
        paramAbstractSerializedData.writeString((String)localObject);
      }
      return;
      i5 = this.flags & 0xFFFFFFFE;
      break;
      i5 = this.flags & 0xFFFFFFFD;
      break label46;
      i5 = this.flags & 0xFFFFFFFB;
      break label67;
      i5 = this.flags & 0xFFFFFFF7;
      break label89;
      i5 = this.flags & 0xFFFFFFEF;
      break label111;
      i5 = this.flags & 0xFFFFFFDF;
      break label133;
      i5 = this.flags & 0xFF7F;
      break label156;
      i5 = this.flags & 0xFEFF;
      break label179;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_channel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */