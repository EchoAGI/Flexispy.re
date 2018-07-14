package com.vvt.capture.telegram.internal;

public class TLRPC$UserProfilePhoto
  extends TLObject
{
  public TLRPC.FileLocation photo_big;
  public long photo_id;
  public TLRPC.FileLocation photo_small;
  
  public static UserProfilePhoto TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in UserProfilePhoto", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_userProfilePhotoEmpty;
      ((TLRPC.TL_userProfilePhotoEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_userProfilePhoto;
      ((TLRPC.TL_userProfilePhoto)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_userProfilePhoto_old;
      ((TLRPC.TL_userProfilePhoto_old)localObject).<init>();
    }
    if (localObject != null) {
      ((UserProfilePhoto)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (UserProfilePhoto)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$UserProfilePhoto.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */