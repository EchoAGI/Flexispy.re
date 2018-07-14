package com.vvt.capture.telegram.internal;

public class TLRPC$TL_dcOption
  extends TLObject
{
  public static int constructor = 98092748;
  public int flags;
  public int id;
  public String ip_address;
  public boolean ipv6;
  public boolean media_only;
  public int port;
  
  public static TL_dcOption TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    int i = constructor;
    Object localObject;
    if (i != paramInt)
    {
      if (paramBoolean)
      {
        localObject = new java/lang/RuntimeException;
        Object[] arrayOfObject = new Object[1];
        Integer localInteger = Integer.valueOf(paramInt);
        arrayOfObject[0] = localInteger;
        String str = String.format("can't parse magic %x in TL_dcOption", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_dcOption)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_dcOption;
      ((TL_dcOption)localObject).<init>();
      ((TL_dcOption)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 1;
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = j;
    j = this.flags & 0x1;
    if (j != 0)
    {
      j = i;
      this.ipv6 = j;
      j = this.flags & 0x2;
      if (j == 0) {
        break label104;
      }
    }
    for (;;)
    {
      this.media_only = i;
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      this.id = j;
      String str = paramAbstractSerializedData.readString(paramBoolean);
      this.ip_address = str;
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      this.port = j;
      return;
      j = 0;
      str = null;
      break;
      label104:
      i = 0;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool1 = this.ipv6;
    if (bool1)
    {
      int j = this.flags | 0x1;
      this.flags = j;
      boolean bool2 = this.media_only;
      if (!bool2) {
        break label103;
      }
    }
    label103:
    for (int k = this.flags | 0x2;; k = this.flags & 0xFFFFFFFD)
    {
      this.flags = k;
      k = this.flags;
      paramAbstractSerializedData.writeInt32(k);
      k = this.id;
      paramAbstractSerializedData.writeInt32(k);
      String str = this.ip_address;
      paramAbstractSerializedData.writeString(str);
      k = this.port;
      paramAbstractSerializedData.writeInt32(k);
      return;
      k = this.flags & 0xFFFFFFFE;
      break;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_dcOption.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */