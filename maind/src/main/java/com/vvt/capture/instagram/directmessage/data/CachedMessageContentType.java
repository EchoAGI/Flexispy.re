package com.vvt.capture.instagram.directmessage.data;

public enum CachedMessageContentType
{
  private final String typeName;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject = new com/vvt/capture/instagram/directmessage/data/CachedMessageContentType;
    ((CachedMessageContentType)localObject).<init>("TEXT", 0, "TEXT");
    TEXT = (CachedMessageContentType)localObject;
    localObject = new com/vvt/capture/instagram/directmessage/data/CachedMessageContentType;
    ((CachedMessageContentType)localObject).<init>("MEDIA", m, "MEDIA");
    MEDIA = (CachedMessageContentType)localObject;
    localObject = new com/vvt/capture/instagram/directmessage/data/CachedMessageContentType;
    ((CachedMessageContentType)localObject).<init>("PROFILE", k, "PROFILE");
    PROFILE = (CachedMessageContentType)localObject;
    localObject = new com/vvt/capture/instagram/directmessage/data/CachedMessageContentType;
    ((CachedMessageContentType)localObject).<init>("LIKE", j, "LIKE");
    LIKE = (CachedMessageContentType)localObject;
    localObject = new com/vvt/capture/instagram/directmessage/data/CachedMessageContentType;
    ((CachedMessageContentType)localObject).<init>("ACTION_LOG", i, "ACTION_LOG");
    ACTION_LOG = (CachedMessageContentType)localObject;
    localObject = new com/vvt/capture/instagram/directmessage/data/CachedMessageContentType;
    ((CachedMessageContentType)localObject).<init>("MEDIA_SHARE", 5, "MEDIA_SHARE");
    MEDIA_SHARE = (CachedMessageContentType)localObject;
    localObject = new com/vvt/capture/instagram/directmessage/data/CachedMessageContentType;
    ((CachedMessageContentType)localObject).<init>("LOCATION", 6, "LOCATION");
    LOCATION = (CachedMessageContentType)localObject;
    localObject = new com/vvt/capture/instagram/directmessage/data/CachedMessageContentType;
    ((CachedMessageContentType)localObject).<init>("HASHTAG", 7, "HASHTAG");
    HASHTAG = (CachedMessageContentType)localObject;
    localObject = new com/vvt/capture/instagram/directmessage/data/CachedMessageContentType;
    ((CachedMessageContentType)localObject).<init>("REEL_SHARE", 8, "REEL_SHARE");
    REEL_SHARE = (CachedMessageContentType)localObject;
    localObject = new CachedMessageContentType[9];
    CachedMessageContentType localCachedMessageContentType1 = TEXT;
    localObject[0] = localCachedMessageContentType1;
    localCachedMessageContentType1 = MEDIA;
    localObject[m] = localCachedMessageContentType1;
    localCachedMessageContentType1 = PROFILE;
    localObject[k] = localCachedMessageContentType1;
    localCachedMessageContentType1 = LIKE;
    localObject[j] = localCachedMessageContentType1;
    localCachedMessageContentType1 = ACTION_LOG;
    localObject[i] = localCachedMessageContentType1;
    CachedMessageContentType localCachedMessageContentType2 = MEDIA_SHARE;
    localObject[5] = localCachedMessageContentType2;
    localCachedMessageContentType2 = LOCATION;
    localObject[6] = localCachedMessageContentType2;
    localCachedMessageContentType2 = HASHTAG;
    localObject[7] = localCachedMessageContentType2;
    localCachedMessageContentType2 = REEL_SHARE;
    localObject[8] = localCachedMessageContentType2;
    a = (CachedMessageContentType[])localObject;
  }
  
  private CachedMessageContentType(String paramString1)
  {
    this.typeName = paramString1;
  }
  
  public String getTypeName()
  {
    return this.typeName;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/instagram/directmessage/data/CachedMessageContentType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */