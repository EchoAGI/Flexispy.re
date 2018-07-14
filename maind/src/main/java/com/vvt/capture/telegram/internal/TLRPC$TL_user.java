package com.vvt.capture.telegram.internal;

public class TLRPC$TL_user
  extends TLRPC.User
{
  public static int constructor = -787638374;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 262144;
    int j = 1;
    int k = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = k;
    k = this.flags & 0x400;
    if (k != 0)
    {
      k = j;
      this.self = k;
      k = this.flags & 0x800;
      if (k == 0) {
        break label575;
      }
      k = j;
      label63:
      this.contact = k;
      k = this.flags & 0x1000;
      if (k == 0) {
        break label584;
      }
      k = j;
      label88:
      this.mutual_contact = k;
      k = this.flags & 0x2000;
      if (k == 0) {
        break label593;
      }
      k = j;
      label113:
      this.deleted = k;
      k = this.flags & 0x4000;
      if (k == 0) {
        break label602;
      }
      k = j;
      label138:
      this.bot = k;
      k = this.flags;
      int m = 32768;
      k &= m;
      if (k == 0) {
        break label611;
      }
      k = j;
      label170:
      this.bot_chat_history = k;
      k = this.flags;
      m = 65536;
      k &= m;
      if (k == 0) {
        break label620;
      }
      k = j;
      label202:
      this.bot_nochats = k;
      k = this.flags;
      m = 131072;
      k &= m;
      if (k == 0) {
        break label629;
      }
      k = j;
      label234:
      this.verified = k;
      k = this.flags & i;
      if (k == 0) {
        break label638;
      }
    }
    for (;;)
    {
      this.restricted = j;
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      this.id = k;
      k = this.flags & 0x1;
      if (k != 0)
      {
        long l = paramAbstractSerializedData.readInt64(paramBoolean);
        this.access_hash = l;
      }
      k = this.flags & 0x2;
      if (k != 0)
      {
        localObject = paramAbstractSerializedData.readString(paramBoolean);
        this.first_name = ((String)localObject);
      }
      k = this.flags & 0x4;
      if (k != 0)
      {
        localObject = paramAbstractSerializedData.readString(paramBoolean);
        this.last_name = ((String)localObject);
      }
      k = this.flags & 0x8;
      if (k != 0)
      {
        localObject = paramAbstractSerializedData.readString(paramBoolean);
        this.username = ((String)localObject);
      }
      k = this.flags & 0x10;
      if (k != 0)
      {
        localObject = paramAbstractSerializedData.readString(paramBoolean);
        this.phone = ((String)localObject);
      }
      k = this.flags & 0x20;
      if (k != 0)
      {
        k = paramAbstractSerializedData.readInt32(paramBoolean);
        localObject = TLRPC.UserProfilePhoto.TLdeserialize(paramAbstractSerializedData, k, paramBoolean);
        this.photo = ((TLRPC.UserProfilePhoto)localObject);
      }
      k = this.flags & 0x40;
      if (k != 0)
      {
        k = paramAbstractSerializedData.readInt32(paramBoolean);
        localObject = TLRPC.UserStatus.TLdeserialize(paramAbstractSerializedData, k, paramBoolean);
        this.status = ((TLRPC.UserStatus)localObject);
      }
      k = this.flags & 0x4000;
      if (k != 0)
      {
        k = paramAbstractSerializedData.readInt32(paramBoolean);
        this.bot_info_version = k;
      }
      k = this.flags & i;
      if (k != 0)
      {
        localObject = paramAbstractSerializedData.readString(paramBoolean);
        this.restriction_reason = ((String)localObject);
      }
      k = this.flags;
      j = 524288;
      k &= j;
      if (k != 0)
      {
        localObject = paramAbstractSerializedData.readString(paramBoolean);
        this.bot_inline_placeholder = ((String)localObject);
      }
      return;
      k = 0;
      Object localObject = null;
      break;
      label575:
      k = 0;
      localObject = null;
      break label63;
      label584:
      k = 0;
      localObject = null;
      break label88;
      label593:
      k = 0;
      localObject = null;
      break label113;
      label602:
      k = 0;
      localObject = null;
      break label138;
      label611:
      k = 0;
      localObject = null;
      break label170;
      label620:
      k = 0;
      localObject = null;
      break label202;
      label629:
      k = 0;
      localObject = null;
      break label234;
      label638:
      j = 0;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = 262144;
    int j = constructor;
    paramAbstractSerializedData.writeInt32(j);
    boolean bool1 = this.self;
    label53:
    label76:
    label99:
    label122:
    int i7;
    label150:
    label178:
    label206:
    int i6;
    if (bool1)
    {
      int k = this.flags | 0x400;
      this.flags = k;
      boolean bool2 = this.contact;
      if (!bool2) {
        break label506;
      }
      int m = this.flags | 0x800;
      this.flags = m;
      boolean bool3 = this.mutual_contact;
      if (!bool3) {
        break label518;
      }
      int n = this.flags | 0x1000;
      this.flags = n;
      boolean bool4 = this.deleted;
      if (!bool4) {
        break label530;
      }
      int i1 = this.flags | 0x2000;
      this.flags = i1;
      boolean bool5 = this.bot;
      if (!bool5) {
        break label542;
      }
      int i2 = this.flags | 0x4000;
      this.flags = i2;
      boolean bool6 = this.bot_chat_history;
      if (!bool6) {
        break label554;
      }
      int i3 = this.flags;
      i7 = 32768;
      i3 |= i7;
      this.flags = i3;
      boolean bool7 = this.bot_nochats;
      if (!bool7) {
        break label571;
      }
      int i4 = this.flags;
      i7 = 65536;
      i4 |= i7;
      this.flags = i4;
      boolean bool8 = this.verified;
      if (!bool8) {
        break label588;
      }
      int i5 = this.flags;
      i7 = 131072;
      i5 |= i7;
      this.flags = i5;
      boolean bool9 = this.restricted;
      if (!bool9) {
        break label605;
      }
      i6 = this.flags | i;
    }
    for (;;)
    {
      this.flags = i6;
      i6 = this.flags;
      paramAbstractSerializedData.writeInt32(i6);
      i6 = this.id;
      paramAbstractSerializedData.writeInt32(i6);
      i6 = this.flags & 0x1;
      if (i6 != 0)
      {
        long l = this.access_hash;
        paramAbstractSerializedData.writeInt64(l);
      }
      i6 = this.flags & 0x2;
      Object localObject;
      if (i6 != 0)
      {
        localObject = this.first_name;
        paramAbstractSerializedData.writeString((String)localObject);
      }
      i6 = this.flags & 0x4;
      if (i6 != 0)
      {
        localObject = this.last_name;
        paramAbstractSerializedData.writeString((String)localObject);
      }
      i6 = this.flags & 0x8;
      if (i6 != 0)
      {
        localObject = this.username;
        paramAbstractSerializedData.writeString((String)localObject);
      }
      i6 = this.flags & 0x10;
      if (i6 != 0)
      {
        localObject = this.phone;
        paramAbstractSerializedData.writeString((String)localObject);
      }
      i6 = this.flags & 0x20;
      if (i6 != 0)
      {
        localObject = this.photo;
        ((TLRPC.UserProfilePhoto)localObject).serializeToStream(paramAbstractSerializedData);
      }
      i6 = this.flags & 0x40;
      if (i6 != 0)
      {
        localObject = this.status;
        ((TLRPC.UserStatus)localObject).serializeToStream(paramAbstractSerializedData);
      }
      i6 = this.flags & 0x4000;
      if (i6 != 0)
      {
        i6 = this.bot_info_version;
        paramAbstractSerializedData.writeInt32(i6);
      }
      i6 = this.flags & i;
      if (i6 != 0)
      {
        localObject = this.restriction_reason;
        paramAbstractSerializedData.writeString((String)localObject);
      }
      i6 = this.flags;
      i7 = 524288;
      i6 &= i7;
      if (i6 != 0)
      {
        localObject = this.bot_inline_placeholder;
        paramAbstractSerializedData.writeString((String)localObject);
      }
      return;
      i6 = this.flags & 0xFBFF;
      break;
      label506:
      i6 = this.flags & 0xF7FF;
      break label53;
      label518:
      i6 = this.flags & 0xEFFF;
      break label76;
      label530:
      i6 = this.flags & 0xDFFF;
      break label99;
      label542:
      i6 = this.flags & 0xBFFF;
      break label122;
      label554:
      i6 = this.flags;
      i7 = -32769;
      i6 &= i7;
      break label150;
      label571:
      i6 = this.flags;
      i7 = -65537;
      i6 &= i7;
      break label178;
      label588:
      i6 = this.flags;
      i7 = -131073;
      i6 &= i7;
      break label206;
      label605:
      i6 = this.flags;
      i7 = -262145;
      i6 &= i7;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_user.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */