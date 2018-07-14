package com.vvt.capture.chrome;

public enum ChromeUrlData$UrlType
{
  static
  {
    int i = 1;
    Object localObject = new com/vvt/capture/chrome/ChromeUrlData$UrlType;
    ((UrlType)localObject).<init>("BOOKMARKS", 0);
    BOOKMARKS = (UrlType)localObject;
    localObject = new com/vvt/capture/chrome/ChromeUrlData$UrlType;
    ((UrlType)localObject).<init>("HISTORY", i);
    HISTORY = (UrlType)localObject;
    localObject = new UrlType[2];
    UrlType localUrlType = BOOKMARKS;
    localObject[0] = localUrlType;
    localUrlType = HISTORY;
    localObject[i] = localUrlType;
    a = (UrlType[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/chrome/ChromeUrlData$UrlType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */