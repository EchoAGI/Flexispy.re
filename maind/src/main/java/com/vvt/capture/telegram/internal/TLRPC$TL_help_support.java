package com.vvt.capture.telegram.internal;

public class TLRPC$TL_help_support
  extends TLObject
{
  public static int constructor = 398898678;
  public String phone_number;
  public TLRPC.User user;
  
  public static TL_help_support TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_help_support", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_help_support)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_help_support;
      ((TL_help_support)localObject).<init>();
      ((TL_help_support)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    Object localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.phone_number = ((String)localObject);
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.User.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.user = ((TLRPC.User)localObject);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.phone_number;
    paramAbstractSerializedData.writeString(str);
    this.user.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_help_support.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */