package com.vvt.capture.telegram.internal;

public class TLRPC$help_AppUpdate
  extends TLObject
{
  public boolean critical;
  public int id;
  public String text;
  public String url;
  
  public static help_AppUpdate TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in help_AppUpdate", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_help_appUpdate;
      ((TLRPC.TL_help_appUpdate)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_help_noAppUpdate;
      ((TLRPC.TL_help_noAppUpdate)localObject).<init>();
    }
    if (localObject != null) {
      ((help_AppUpdate)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (help_AppUpdate)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$help_AppUpdate.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */