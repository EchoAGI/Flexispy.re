package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$WallPaper
  extends TLObject
{
  public int bg_color;
  public int color;
  public int id;
  public ArrayList sizes;
  public String title;
  
  public TLRPC$WallPaper()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.sizes = localArrayList;
  }
  
  public static WallPaper TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in WallPaper", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_wallPaper;
      ((TLRPC.TL_wallPaper)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_wallPaperSolid;
      ((TLRPC.TL_wallPaperSolid)localObject).<init>();
    }
    if (localObject != null) {
      ((WallPaper)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (WallPaper)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$WallPaper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */