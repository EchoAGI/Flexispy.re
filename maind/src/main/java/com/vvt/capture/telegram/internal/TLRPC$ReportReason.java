package com.vvt.capture.telegram.internal;

public class TLRPC$ReportReason
  extends TLObject
{
  public String text;
  
  public static ReportReason TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in ReportReason", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputReportReasonSpam;
      ((TLRPC.TL_inputReportReasonSpam)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputReportReasonViolence;
      ((TLRPC.TL_inputReportReasonViolence)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputReportReasonOther;
      ((TLRPC.TL_inputReportReasonOther)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputReportReasonPornography;
      ((TLRPC.TL_inputReportReasonPornography)localObject).<init>();
    }
    if (localObject != null) {
      ((ReportReason)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (ReportReason)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$ReportReason.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */