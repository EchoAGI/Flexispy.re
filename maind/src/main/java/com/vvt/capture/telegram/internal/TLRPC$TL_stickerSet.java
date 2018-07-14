package com.vvt.capture.telegram.internal;

public class TLRPC$TL_stickerSet
  extends TLRPC.StickerSet
{
  public static int constructor = -852477119;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 1;
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = j;
    j = this.flags & 0x1;
    if (j != 0)
    {
      j = i;
      this.installed = j;
      j = this.flags & 0x2;
      if (j == 0) {
        break label165;
      }
      j = i;
      label53:
      this.disabled = j;
      j = this.flags & 0x4;
      if (j == 0) {
        break label174;
      }
    }
    for (;;)
    {
      this.official = i;
      long l = paramAbstractSerializedData.readInt64(paramBoolean);
      this.id = l;
      l = paramAbstractSerializedData.readInt64(paramBoolean);
      this.access_hash = l;
      String str = paramAbstractSerializedData.readString(paramBoolean);
      this.title = str;
      str = paramAbstractSerializedData.readString(paramBoolean);
      this.short_name = str;
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      this.count = j;
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      this.hash = j;
      return;
      j = 0;
      str = null;
      break;
      label165:
      j = 0;
      str = null;
      break label53;
      label174:
      i = 0;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool1 = this.installed;
    if (bool1)
    {
      int j = this.flags | 0x1;
      this.flags = j;
      boolean bool2 = this.disabled;
      if (!bool2) {
        break label158;
      }
      int k = this.flags | 0x2;
      label46:
      this.flags = k;
      boolean bool3 = this.official;
      if (!bool3) {
        break label169;
      }
    }
    label158:
    label169:
    for (int m = this.flags | 0x4;; m = this.flags & 0xFFFFFFFB)
    {
      this.flags = m;
      m = this.flags;
      paramAbstractSerializedData.writeInt32(m);
      long l = this.id;
      paramAbstractSerializedData.writeInt64(l);
      l = this.access_hash;
      paramAbstractSerializedData.writeInt64(l);
      String str = this.title;
      paramAbstractSerializedData.writeString(str);
      str = this.short_name;
      paramAbstractSerializedData.writeString(str);
      m = this.count;
      paramAbstractSerializedData.writeInt32(m);
      m = this.hash;
      paramAbstractSerializedData.writeInt32(m);
      return;
      m = this.flags & 0xFFFFFFFE;
      break;
      m = this.flags & 0xFFFFFFFD;
      break label46;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_stickerSet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */