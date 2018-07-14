package com.vvt.capture.telegram.internal;

public class TLRPC$TL_chat
  extends TLRPC.Chat
{
  public static int constructor = -652419756;
  
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
        break label279;
      }
      j = i;
      label53:
      this.kicked = j;
      j = this.flags & 0x4;
      if (j == 0) {
        break label288;
      }
      j = i;
      label75:
      this.left = j;
      j = this.flags & 0x8;
      if (j == 0) {
        break label297;
      }
      j = i;
      label98:
      this.admins_enabled = j;
      j = this.flags & 0x10;
      if (j == 0) {
        break label306;
      }
      j = i;
      label121:
      this.admin = j;
      j = this.flags & 0x20;
      if (j == 0) {
        break label315;
      }
    }
    for (;;)
    {
      this.deactivated = i;
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      this.id = j;
      Object localObject = paramAbstractSerializedData.readString(paramBoolean);
      this.title = ((String)localObject);
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject = TLRPC.ChatPhoto.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
      this.photo = ((TLRPC.ChatPhoto)localObject);
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      this.participants_count = j;
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      this.date = j;
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      this.version = j;
      j = this.flags & 0x40;
      if (j != 0)
      {
        j = paramAbstractSerializedData.readInt32(paramBoolean);
        localObject = TLRPC.InputChannel.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
        this.migrated_to = ((TLRPC.InputChannel)localObject);
      }
      return;
      j = 0;
      localObject = null;
      break;
      label279:
      j = 0;
      localObject = null;
      break label53;
      label288:
      j = 0;
      localObject = null;
      break label75;
      label297:
      j = 0;
      localObject = null;
      break label98;
      label306:
      j = 0;
      localObject = null;
      break label121;
      label315:
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
        break label242;
      }
      int k = this.flags | 0x2;
      label46:
      this.flags = k;
      boolean bool3 = this.left;
      if (!bool3) {
        break label253;
      }
      int m = this.flags | 0x4;
      label67:
      this.flags = m;
      boolean bool4 = this.admins_enabled;
      if (!bool4) {
        break label264;
      }
      int n = this.flags | 0x8;
      label89:
      this.flags = n;
      boolean bool5 = this.admin;
      if (!bool5) {
        break label275;
      }
      int i1 = this.flags | 0x10;
      label111:
      this.flags = i1;
      boolean bool6 = this.deactivated;
      if (!bool6) {
        break label286;
      }
    }
    label242:
    label253:
    label264:
    label275:
    label286:
    for (int i2 = this.flags | 0x20;; i2 = this.flags & 0xFFFFFFDF)
    {
      this.flags = i2;
      i2 = this.flags;
      paramAbstractSerializedData.writeInt32(i2);
      i2 = this.id;
      paramAbstractSerializedData.writeInt32(i2);
      Object localObject = this.title;
      paramAbstractSerializedData.writeString((String)localObject);
      localObject = this.photo;
      ((TLRPC.ChatPhoto)localObject).serializeToStream(paramAbstractSerializedData);
      i2 = this.participants_count;
      paramAbstractSerializedData.writeInt32(i2);
      i2 = this.date;
      paramAbstractSerializedData.writeInt32(i2);
      i2 = this.version;
      paramAbstractSerializedData.writeInt32(i2);
      i2 = this.flags & 0x40;
      if (i2 != 0)
      {
        localObject = this.migrated_to;
        ((TLRPC.InputChannel)localObject).serializeToStream(paramAbstractSerializedData);
      }
      return;
      i2 = this.flags & 0xFFFFFFFE;
      break;
      i2 = this.flags & 0xFFFFFFFD;
      break label46;
      i2 = this.flags & 0xFFFFFFFB;
      break label67;
      i2 = this.flags & 0xFFFFFFF7;
      break label89;
      i2 = this.flags & 0xFFFFFFEF;
      break label111;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_chat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */