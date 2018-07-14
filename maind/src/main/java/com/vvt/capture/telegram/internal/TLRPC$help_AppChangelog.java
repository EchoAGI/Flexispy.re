package com.vvt.capture.telegram.internal;

public class TLRPC$help_AppChangelog
  extends TLObject
{
  public String text;
  
  public static help_AppChangelog TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in help_AppChangelog", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_help_appChangelogEmpty;
      ((TLRPC.TL_help_appChangelogEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_help_appChangelog;
      ((TLRPC.TL_help_appChangelog)localObject).<init>();
    }
    if (localObject != null) {
      ((help_AppChangelog)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (help_AppChangelog)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$help_AppChangelog.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */