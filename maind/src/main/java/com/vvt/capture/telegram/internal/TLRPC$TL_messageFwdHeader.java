package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messageFwdHeader
  extends TLObject
{
  public static int constructor = -947462709;
  public int channel_id;
  public int channel_post;
  public int date;
  public int flags;
  public int from_id;
  
  public static TL_messageFwdHeader TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    int i = constructor;
    if (i == paramInt)
    {
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageFwdHeader;
      ((TL_messageFwdHeader)localObject).<init>();
      ((TL_messageFwdHeader)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    for (;;)
    {
      return (TL_messageFwdHeader)localObject;
      if (paramBoolean) {
        break;
      }
      i = 0;
      localObject = null;
    }
    Object localObject = new Object[1];
    Integer localInteger = Integer.valueOf(constructor);
    localObject[0] = localInteger;
    RuntimeException localRuntimeException = new java/lang/RuntimeException;
    localObject = String.format("can't parse magic %x in TL_messageFwdHeader", (Object[])localObject);
    localRuntimeException.<init>((String)localObject);
    throw localRuntimeException;
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = i;
    i = this.flags & 0x1;
    if (i != 0)
    {
      i = paramAbstractSerializedData.readInt32(paramBoolean);
      this.from_id = i;
    }
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.date = i;
    i = this.flags & 0x2;
    if (i != 0)
    {
      i = paramAbstractSerializedData.readInt32(paramBoolean);
      this.channel_id = i;
    }
    i = this.flags & 0x4;
    if (i != 0)
    {
      i = paramAbstractSerializedData.readInt32(paramBoolean);
      this.channel_post = i;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.flags;
    paramAbstractSerializedData.writeInt32(i);
    i = this.flags & 0x1;
    if (i != 0)
    {
      i = this.from_id;
      paramAbstractSerializedData.writeInt32(i);
    }
    i = this.date;
    paramAbstractSerializedData.writeInt32(i);
    i = this.flags & 0x2;
    if (i != 0)
    {
      i = this.channel_id;
      paramAbstractSerializedData.writeInt32(i);
    }
    i = this.flags & 0x4;
    if (i != 0)
    {
      i = this.channel_post;
      paramAbstractSerializedData.writeInt32(i);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messageFwdHeader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */