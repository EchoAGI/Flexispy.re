package com.vvt.capture.telegram.internal;

public class TLRPC$TL_botCommand
  extends TLObject
{
  public static int constructor = -1032140601;
  public String command;
  public String description;
  
  public static TL_botCommand TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_botCommand", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_botCommand)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_botCommand;
      ((TL_botCommand)localObject).<init>();
      ((TL_botCommand)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.command = str;
    str = paramAbstractSerializedData.readString(paramBoolean);
    this.description = str;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.command;
    paramAbstractSerializedData.writeString(str);
    str = this.description;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_botCommand.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */