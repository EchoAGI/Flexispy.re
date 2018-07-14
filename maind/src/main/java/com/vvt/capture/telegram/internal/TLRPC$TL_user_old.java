package com.vvt.capture.telegram.internal;

public class TLRPC$TL_user_old
  extends TLRPC.TL_user
{
  public static int constructor = 585404530;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 1;
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = j;
    j = this.flags & 0x400;
    if (j != 0)
    {
      j = i;
      this.self = j;
      j = this.flags & 0x800;
      if (j == 0) {
        break label510;
      }
      j = i;
      label57:
      this.contact = j;
      j = this.flags & 0x1000;
      if (j == 0) {
        break label519;
      }
      j = i;
      label81:
      this.mutual_contact = j;
      j = this.flags & 0x2000;
      if (j == 0) {
        break label528;
      }
      j = i;
      label105:
      this.deleted = j;
      j = this.flags & 0x4000;
      if (j == 0) {
        break label537;
      }
      j = i;
      label129:
      this.bot = j;
      j = this.flags;
      int k = 32768;
      j &= k;
      if (j == 0) {
        break label546;
      }
      j = i;
      label160:
      this.bot_chat_history = j;
      j = this.flags;
      k = 65536;
      j &= k;
      if (j == 0) {
        break label555;
      }
      j = i;
      label191:
      this.bot_nochats = j;
      j = this.flags;
      k = 131072;
      j &= k;
      if (j == 0) {
        break label564;
      }
      j = i;
      label222:
      this.verified = j;
      j = this.flags;
      k = 262144;
      j &= k;
      if (j == 0) {
        break label573;
      }
    }
    for (;;)
    {
      this.explicit_content = i;
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      this.id = j;
      j = this.flags & 0x1;
      if (j != 0)
      {
        long l = paramAbstractSerializedData.readInt64(paramBoolean);
        this.access_hash = l;
      }
      j = this.flags & 0x2;
      if (j != 0)
      {
        localObject = paramAbstractSerializedData.readString(paramBoolean);
        this.first_name = ((String)localObject);
      }
      j = this.flags & 0x4;
      if (j != 0)
      {
        localObject = paramAbstractSerializedData.readString(paramBoolean);
        this.last_name = ((String)localObject);
      }
      j = this.flags & 0x8;
      if (j != 0)
      {
        localObject = paramAbstractSerializedData.readString(paramBoolean);
        this.username = ((String)localObject);
      }
      j = this.flags & 0x10;
      if (j != 0)
      {
        localObject = paramAbstractSerializedData.readString(paramBoolean);
        this.phone = ((String)localObject);
      }
      j = this.flags & 0x20;
      if (j != 0)
      {
        j = paramAbstractSerializedData.readInt32(paramBoolean);
        localObject = TLRPC.UserProfilePhoto.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
        this.photo = ((TLRPC.UserProfilePhoto)localObject);
      }
      j = this.flags & 0x40;
      if (j != 0)
      {
        j = paramAbstractSerializedData.readInt32(paramBoolean);
        localObject = TLRPC.UserStatus.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
        this.status = ((TLRPC.UserStatus)localObject);
      }
      j = this.flags & 0x4000;
      if (j != 0)
      {
        j = paramAbstractSerializedData.readInt32(paramBoolean);
        this.bot_info_version = j;
      }
      return;
      j = 0;
      Object localObject = null;
      break;
      label510:
      j = 0;
      localObject = null;
      break label57;
      label519:
      j = 0;
      localObject = null;
      break label81;
      label528:
      j = 0;
      localObject = null;
      break label105;
      label537:
      j = 0;
      localObject = null;
      break label129;
      label546:
      j = 0;
      localObject = null;
      break label160;
      label555:
      j = 0;
      localObject = null;
      break label191;
      label564:
      j = 0;
      localObject = null;
      break label222;
      label573:
      i = 0;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool1 = this.self;
    label50:
    label73:
    label96:
    label119:
    int i6;
    label145:
    label171:
    label197:
    int i5;
    if (bool1)
    {
      int j = this.flags | 0x400;
      this.flags = j;
      boolean bool2 = this.contact;
      if (!bool2) {
        break label449;
      }
      int k = this.flags | 0x800;
      this.flags = k;
      boolean bool3 = this.mutual_contact;
      if (!bool3) {
        break label461;
      }
      int m = this.flags | 0x1000;
      this.flags = m;
      boolean bool4 = this.deleted;
      if (!bool4) {
        break label473;
      }
      int n = this.flags | 0x2000;
      this.flags = n;
      boolean bool5 = this.bot;
      if (!bool5) {
        break label485;
      }
      int i1 = this.flags | 0x4000;
      this.flags = i1;
      boolean bool6 = this.bot_chat_history;
      if (!bool6) {
        break label497;
      }
      int i2 = this.flags;
      i6 = 32768;
      i2 |= i6;
      this.flags = i2;
      boolean bool7 = this.bot_nochats;
      if (!bool7) {
        break label512;
      }
      int i3 = this.flags;
      i6 = 65536;
      i3 |= i6;
      this.flags = i3;
      boolean bool8 = this.verified;
      if (!bool8) {
        break label527;
      }
      int i4 = this.flags;
      i6 = 131072;
      i4 |= i6;
      this.flags = i4;
      boolean bool9 = this.explicit_content;
      if (!bool9) {
        break label542;
      }
      i5 = this.flags;
      i6 = 262144;
      i5 |= i6;
    }
    for (;;)
    {
      this.flags = i5;
      i5 = this.flags;
      paramAbstractSerializedData.writeInt32(i5);
      i5 = this.id;
      paramAbstractSerializedData.writeInt32(i5);
      i5 = this.flags & 0x1;
      if (i5 != 0)
      {
        long l = this.access_hash;
        paramAbstractSerializedData.writeInt64(l);
      }
      i5 = this.flags & 0x2;
      Object localObject;
      if (i5 != 0)
      {
        localObject = this.first_name;
        paramAbstractSerializedData.writeString((String)localObject);
      }
      i5 = this.flags & 0x4;
      if (i5 != 0)
      {
        localObject = this.last_name;
        paramAbstractSerializedData.writeString((String)localObject);
      }
      i5 = this.flags & 0x8;
      if (i5 != 0)
      {
        localObject = this.username;
        paramAbstractSerializedData.writeString((String)localObject);
      }
      i5 = this.flags & 0x10;
      if (i5 != 0)
      {
        localObject = this.phone;
        paramAbstractSerializedData.writeString((String)localObject);
      }
      i5 = this.flags & 0x20;
      if (i5 != 0)
      {
        localObject = this.photo;
        ((TLRPC.UserProfilePhoto)localObject).serializeToStream(paramAbstractSerializedData);
      }
      i5 = this.flags & 0x40;
      if (i5 != 0)
      {
        localObject = this.status;
        ((TLRPC.UserStatus)localObject).serializeToStream(paramAbstractSerializedData);
      }
      i5 = this.flags & 0x4000;
      if (i5 != 0)
      {
        i5 = this.bot_info_version;
        paramAbstractSerializedData.writeInt32(i5);
      }
      return;
      i5 = this.flags & 0xFBFF;
      break;
      label449:
      i5 = this.flags & 0xF7FF;
      break label50;
      label461:
      i5 = this.flags & 0xEFFF;
      break label73;
      label473:
      i5 = this.flags & 0xDFFF;
      break label96;
      label485:
      i5 = this.flags & 0xBFFF;
      break label119;
      label497:
      i5 = this.flags;
      i6 = -32769;
      i5 &= i6;
      break label145;
      label512:
      i5 = this.flags;
      i6 = -65537;
      i5 &= i6;
      break label171;
      label527:
      i5 = this.flags;
      i6 = -131073;
      i5 &= i6;
      break label197;
      label542:
      i5 = this.flags;
      i6 = -262145;
      i5 &= i6;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_user_old.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */