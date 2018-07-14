package com.vvt.capture.telegram.internal;

public class TLRPC$TL_chat_old2
  extends TLRPC.TL_chat
{
  public static int constructor = 1930607688;
  
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
        break label243;
      }
      j = i;
      label53:
      this.kicked = j;
      j = this.flags & 0x4;
      if (j == 0) {
        break label252;
      }
      j = i;
      label75:
      this.left = j;
      j = this.flags & 0x8;
      if (j == 0) {
        break label261;
      }
      j = i;
      label98:
      this.admins_enabled = j;
      j = this.flags & 0x10;
      if (j == 0) {
        break label270;
      }
      j = i;
      label121:
      this.admin = j;
      j = this.flags & 0x20;
      if (j == 0) {
        break label279;
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
      return;
      j = 0;
      localObject = null;
      break;
      label243:
      j = 0;
      localObject = null;
      break label53;
      label252:
      j = 0;
      localObject = null;
      break label75;
      label261:
      j = 0;
      localObject = null;
      break label98;
      label270:
      j = 0;
      localObject = null;
      break label121;
      label279:
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
        break label218;
      }
      int k = this.flags | 0x2;
      label46:
      this.flags = k;
      boolean bool3 = this.left;
      if (!bool3) {
        break label229;
      }
      int m = this.flags | 0x4;
      label67:
      this.flags = m;
      boolean bool4 = this.admins_enabled;
      if (!bool4) {
        break label240;
      }
      int n = this.flags | 0x8;
      label89:
      this.flags = n;
      boolean bool5 = this.admin;
      if (!bool5) {
        break label251;
      }
      int i1 = this.flags | 0x10;
      label111:
      this.flags = i1;
      boolean bool6 = this.deactivated;
      if (!bool6) {
        break label262;
      }
    }
    label218:
    label229:
    label240:
    label251:
    label262:
    for (int i2 = this.flags | 0x20;; i2 = this.flags & 0xFFFFFFDF)
    {
      this.flags = i2;
      i2 = this.flags;
      paramAbstractSerializedData.writeInt32(i2);
      i2 = this.id;
      paramAbstractSerializedData.writeInt32(i2);
      String str = this.title;
      paramAbstractSerializedData.writeString(str);
      this.photo.serializeToStream(paramAbstractSerializedData);
      i2 = this.participants_count;
      paramAbstractSerializedData.writeInt32(i2);
      i2 = this.date;
      paramAbstractSerializedData.writeInt32(i2);
      i2 = this.version;
      paramAbstractSerializedData.writeInt32(i2);
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_chat_old2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */