package com.vvt.capture.telegram.internal;

public class TLRPC$TL_account_passwordInputSettings
  extends TLObject
{
  public static int constructor = -1124314324;
  public String email;
  public int flags;
  public String hint;
  public byte[] new_password_hash;
  public byte[] new_salt;
  
  public static TL_account_passwordInputSettings TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_account_passwordInputSettings", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_account_passwordInputSettings)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_account_passwordInputSettings;
      ((TL_account_passwordInputSettings)localObject).<init>();
      ((TL_account_passwordInputSettings)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = i;
    i = this.flags & 0x1;
    Object localObject;
    if (i != 0)
    {
      localObject = paramAbstractSerializedData.readByteArray(paramBoolean);
      this.new_salt = ((byte[])localObject);
    }
    i = this.flags & 0x1;
    if (i != 0)
    {
      localObject = paramAbstractSerializedData.readByteArray(paramBoolean);
      this.new_password_hash = ((byte[])localObject);
    }
    i = this.flags & 0x1;
    if (i != 0)
    {
      localObject = paramAbstractSerializedData.readString(paramBoolean);
      this.hint = ((String)localObject);
    }
    i = this.flags & 0x2;
    if (i != 0)
    {
      localObject = paramAbstractSerializedData.readString(paramBoolean);
      this.email = ((String)localObject);
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.flags;
    paramAbstractSerializedData.writeInt32(i);
    i = this.flags & 0x1;
    Object localObject;
    if (i != 0)
    {
      localObject = this.new_salt;
      paramAbstractSerializedData.writeByteArray((byte[])localObject);
    }
    i = this.flags & 0x1;
    if (i != 0)
    {
      localObject = this.new_password_hash;
      paramAbstractSerializedData.writeByteArray((byte[])localObject);
    }
    i = this.flags & 0x1;
    if (i != 0)
    {
      localObject = this.hint;
      paramAbstractSerializedData.writeString((String)localObject);
    }
    i = this.flags & 0x2;
    if (i != 0)
    {
      localObject = this.email;
      paramAbstractSerializedData.writeString((String)localObject);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_account_passwordInputSettings.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */