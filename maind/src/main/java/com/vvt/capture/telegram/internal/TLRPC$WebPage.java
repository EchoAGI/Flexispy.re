package com.vvt.capture.telegram.internal;

public class TLRPC$WebPage
  extends TLObject
{
  public String author;
  public int date;
  public String description;
  public String display_url;
  public TLRPC.Document document;
  public int duration;
  public int embed_height;
  public String embed_type;
  public String embed_url;
  public int embed_width;
  public int flags;
  public long id;
  public TLRPC.Photo photo;
  public String site_name;
  public String title;
  public String type;
  public String url;
  
  public static WebPage TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in WebPage", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_webPage_old;
      ((TLRPC.TL_webPage_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_webPagePending;
      ((TLRPC.TL_webPagePending)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_webPageEmpty;
      ((TLRPC.TL_webPageEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_webPage;
      ((TLRPC.TL_webPage)localObject).<init>();
    }
    if (localObject != null) {
      ((WebPage)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (WebPage)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$WebPage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */