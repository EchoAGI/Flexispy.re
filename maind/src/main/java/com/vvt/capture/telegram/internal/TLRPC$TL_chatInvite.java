package com.vvt.capture.telegram.internal;

public class TLRPC$TL_chatInvite
  extends TLRPC.ChatInvite
{
  public static int constructor = -1813406880;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 1;
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = j;
    j = this.flags & 0x1;
    if (j != 0)
    {
      j = i;
      this.channel = j;
      j = this.flags & 0x2;
      if (j == 0) {
        break label123;
      }
      j = i;
      label53:
      this.broadcast = j;
      j = this.flags & 0x4;
      if (j == 0) {
        break label132;
      }
      j = i;
      label75:
      this.isPublic = j;
      j = this.flags & 0x8;
      if (j == 0) {
        break label141;
      }
    }
    for (;;)
    {
      this.megagroup = i;
      String str = paramAbstractSerializedData.readString(paramBoolean);
      this.title = str;
      return;
      j = 0;
      str = null;
      break;
      label123:
      j = 0;
      str = null;
      break label53;
      label132:
      j = 0;
      str = null;
      break label75;
      label141:
      i = 0;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool1 = this.channel;
    if (bool1)
    {
      int j = this.flags | 0x1;
      this.flags = j;
      boolean bool2 = this.broadcast;
      if (!bool2) {
        break label126;
      }
      int k = this.flags | 0x2;
      label46:
      this.flags = k;
      boolean bool3 = this.isPublic;
      if (!bool3) {
        break label137;
      }
      int m = this.flags | 0x4;
      label67:
      this.flags = m;
      boolean bool4 = this.megagroup;
      if (!bool4) {
        break label148;
      }
    }
    label126:
    label137:
    label148:
    for (int n = this.flags | 0x8;; n = this.flags & 0xFFFFFFF7)
    {
      this.flags = n;
      n = this.flags;
      paramAbstractSerializedData.writeInt32(n);
      String str = this.title;
      paramAbstractSerializedData.writeString(str);
      return;
      n = this.flags & 0xFFFFFFFE;
      break;
      n = this.flags & 0xFFFFFFFD;
      break label46;
      n = this.flags & 0xFFFFFFFB;
      break label67;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_chatInvite.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */