package com.vvt.capture.telegram.internal;

public class TLRPC$Dialog
  extends TLObject
{
  public long id;
  public int last_message_date;
  public int last_read;
  public TLRPC.PeerNotifySettings notify_settings;
  public TLRPC.Peer peer;
  public int pts;
  public int read_inbox_max_id;
  public int top_message;
  public int top_not_important_message;
  public int unread_count;
  public int unread_not_important_count;
  
  public static Dialog TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in Dialog", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_dialogChannel;
      ((TLRPC.TL_dialogChannel)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_dialog;
      ((TLRPC.TL_dialog)localObject).<init>();
    }
    if (localObject != null) {
      ((Dialog)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (Dialog)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$Dialog.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */