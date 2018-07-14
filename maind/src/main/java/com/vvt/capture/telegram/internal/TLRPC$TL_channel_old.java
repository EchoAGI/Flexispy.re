package com.vvt.capture.telegram.internal;

public class TLRPC$TL_channel_old
  extends TLRPC.TL_channel
{
  public static int constructor = 1737397639;
  
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
        break label342;
      }
      j = i;
      label53:
      this.kicked = j;
      j = this.flags & 0x4;
      if (j == 0) {
        break label351;
      }
      j = i;
      label75:
      this.left = j;
      j = this.flags & 0x8;
      if (j == 0) {
        break label360;
      }
      j = i;
      label98:
      this.editor = j;
      j = this.flags & 0x10;
      if (j == 0) {
        break label369;
      }
      j = i;
      label121:
      this.moderator = j;
      j = this.flags & 0x20;
      if (j == 0) {
        break label378;
      }
      j = i;
      label144:
      this.broadcast = j;
      j = this.flags & 0x80;
      if (j == 0) {
        break label387;
      }
      j = i;
      label168:
      this.verified = j;
      j = this.flags & 0x100;
      if (j == 0) {
        break label396;
      }
      j = i;
      label192:
      this.megagroup = j;
      j = this.flags & 0x200;
      if (j == 0) {
        break label405;
      }
    }
    for (;;)
    {
      this.explicit_content = i;
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
      return;
      j = 0;
      localObject = null;
      break;
      label342:
      j = 0;
      localObject = null;
      break label53;
      label351:
      j = 0;
      localObject = null;
      break label75;
      label360:
      j = 0;
      localObject = null;
      break label98;
      label369:
      j = 0;
      localObject = null;
      break label121;
      label378:
      j = 0;
      localObject = null;
      break label144;
      label387:
      j = 0;
      localObject = null;
      break label168;
      label396:
      j = 0;
      localObject = null;
      break label192;
      label405:
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
        break label313;
      }
      int k = this.flags | 0x2;
      label46:
      this.flags = k;
      boolean bool3 = this.left;
      if (!bool3) {
        break label324;
      }
      int m = this.flags | 0x4;
      label67:
      this.flags = m;
      boolean bool4 = this.editor;
      if (!bool4) {
        break label335;
      }
      int n = this.flags | 0x8;
      label89:
      this.flags = n;
      boolean bool5 = this.moderator;
      if (!bool5) {
        break label346;
      }
      int i1 = this.flags | 0x10;
      label111:
      this.flags = i1;
      boolean bool6 = this.broadcast;
      if (!bool6) {
        break label357;
      }
      int i2 = this.flags | 0x20;
      label133:
      this.flags = i2;
      boolean bool7 = this.verified;
      if (!bool7) {
        break label368;
      }
      int i3 = this.flags | 0x80;
      label156:
      this.flags = i3;
      boolean bool8 = this.megagroup;
      if (!bool8) {
        break label380;
      }
      int i4 = this.flags | 0x100;
      label179:
      this.flags = i4;
      boolean bool9 = this.explicit_content;
      if (!bool9) {
        break label392;
      }
    }
    label313:
    label324:
    label335:
    label346:
    label357:
    label368:
    label380:
    label392:
    for (int i5 = this.flags | 0x200;; i5 = this.flags & 0xFDFF)
    {
      this.flags = i5;
      i5 = this.flags;
      paramAbstractSerializedData.writeInt32(i5);
      i5 = this.id;
      paramAbstractSerializedData.writeInt32(i5);
      long l = this.access_hash;
      paramAbstractSerializedData.writeInt64(l);
      String str = this.title;
      paramAbstractSerializedData.writeString(str);
      i5 = this.flags & 0x40;
      if (i5 != 0)
      {
        str = this.username;
        paramAbstractSerializedData.writeString(str);
      }
      this.photo.serializeToStream(paramAbstractSerializedData);
      i5 = this.date;
      paramAbstractSerializedData.writeInt32(i5);
      i5 = this.version;
      paramAbstractSerializedData.writeInt32(i5);
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_channel_old.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */