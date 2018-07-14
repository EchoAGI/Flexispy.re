package com.vvt.capture.telegram.internal;

public class TLRPC$TL_help_inviteText
  extends TLObject
{
  public static int constructor = 415997816;
  public String message;
  
  public static TL_help_inviteText TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_help_inviteText", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_help_inviteText)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_help_inviteText;
      ((TL_help_inviteText)localObject).<init>();
      ((TL_help_inviteText)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.message = str;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.message;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_help_inviteText.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */