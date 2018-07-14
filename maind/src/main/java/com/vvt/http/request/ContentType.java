package com.vvt.http.request;

public enum ContentType
{
  private final String content;
  
  static
  {
    int i = 1;
    Object localObject = new com/vvt/http/request/ContentType;
    ((ContentType)localObject).<init>("BINARY_OCTET_STREAM", 0, "application/octet-stream");
    BINARY_OCTET_STREAM = (ContentType)localObject;
    localObject = new com/vvt/http/request/ContentType;
    ((ContentType)localObject).<init>("FORM_POST", i, "multipart/form-data");
    FORM_POST = (ContentType)localObject;
    localObject = new ContentType[2];
    ContentType localContentType = BINARY_OCTET_STREAM;
    localObject[0] = localContentType;
    localContentType = FORM_POST;
    localObject[i] = localContentType;
    a = (ContentType[])localObject;
  }
  
  private ContentType(String paramString1)
  {
    this.content = paramString1;
  }
  
  public static ContentType forValue(String paramString)
  {
    ContentType localContentType = null;
    if (paramString == null) {}
    for (;;)
    {
      return localContentType;
      String str = "application/octet-stream";
      boolean bool = paramString.equals(str);
      if (bool)
      {
        localContentType = BINARY_OCTET_STREAM;
      }
      else
      {
        str = "multipart/form-data";
        bool = paramString.equals(str);
        if (bool) {
          localContentType = FORM_POST;
        }
      }
    }
  }
  
  public String getContent()
  {
    return this.content;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/http/request/ContentType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */