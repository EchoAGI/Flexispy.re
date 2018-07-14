package com.vvt.capture.telegram.internal;

public class TLRPC$FileLocation
  extends TLObject
{
  public int dc_id;
  public byte[] iv;
  public byte[] key;
  public int local_id;
  public long secret;
  public long volume_id;
  
  public static FileLocation TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    Object localObject = null;
    switch (paramInt)
    {
    }
    while ((localObject == null) && (paramBoolean))
    {
      localObject = new java/lang/RuntimeException;
      Object[] arrayOfObject = new Object[1];
      Integer localInteger = Integer.valueOf(paramInt);
      arrayOfObject[0] = localInteger;
      String str = String.format("can't parse magic %x in FileLocation", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_fileLocation;
      ((TLRPC.TL_fileLocation)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_fileEncryptedLocation;
      ((TLRPC.TL_fileEncryptedLocation)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_fileLocationUnavailable;
      ((TLRPC.TL_fileLocationUnavailable)localObject).<init>();
    }
    if (localObject != null) {
      ((FileLocation)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (FileLocation)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$FileLocation.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */